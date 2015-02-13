       PROCESS XOPTS(APOST)
       PROCESS NOSEQ LIB OPTIMIZE(FULL)
       IDENTIFICATION DIVISION.
       PROGRAM-ID. JVMQUERY.
      *****************************************************************
      * OVERVIEW                                                      *
      * --------                                                      *
      * Sample transaction calling a remote service over WMQ          *
      * The WMQ message payload is raw mainframe data. It is expected *
      * that the receiver will use LegStar COBOL binding to convert   *
      * payload to a Java object.                                     *
      * There are minimal CICS APIs in this program so that it can    *
      * easily be modified to work in batch or IMS.                   *
      *                                                               *
      * Program generated by LegStar Mainframe to Jaxws generator.    *
      * Follow the TODO markers to customize this program.            *
      *****************************************************************

       ENVIRONMENT DIVISION.
       CONFIGURATION SECTION.
       DATA DIVISION.
      *****************************************************************
      *        W O R K I N G    S T O R A G E    S E C T I O N        *
      *****************************************************************
       WORKING-STORAGE SECTION.
       
      *---------------------------------------------------------------*
      *  Constants                                                    *
      *---------------------------------------------------------------*
       77  W00-QMGR PIC X(48) VALUE 'CSQ1'.

       77  W00-REQUEST-QNAME PIC X(48) VALUE 'REQUEST.QUEUE'.

       77  W00-REPLY-QNAME PIC X(48) VALUE 'REPLY.QUEUE'.

       77  W00-ERROR-QNAME PIC X(48) VALUE 'ERROR.QUEUE'.

       77  W00-WAIT-INTERVAL      PIC S9(9) BINARY VALUE 3000.

      *---------------------------------------------------------------*
      *  WMQ API parameters                                           *
      *---------------------------------------------------------------*
      *
      *    W03 - API fields
      *
       01  W03-HCONN              PIC S9(9) BINARY VALUE 0.
       01  W03-HOBJ               PIC S9(9) BINARY VALUE 0.
       01  W03-OPENOPTIONS        PIC S9(9) BINARY.
       01  W03-COMPCODE           PIC S9(9) BINARY.
       01  W03-REASON             PIC S9(9) BINARY.
      *
      *    API control blocks
      *
       01  MQM-OBJECT-DESCRIPTOR.
           COPY CMQODV.
       01  MQM-MESSAGE-DESCRIPTOR.
           COPY CMQMDV.
       01  MQM-PUT-MESSAGE-OPTIONS.
           COPY CMQPMOV.
       01  MQM-GET-MESSAGE-OPTIONS.
           COPY CMQGMOV.
      *
      *    MQV contains constants (for filling in the control blocks)
      *    and return codes (for testing the result of a call)
      *
       01  MQM-CONSTANTS.
           COPY CMQV SUPPRESS.
      *

      *---------------------------------------------------------------*
      *  Work variables                                               *
      *---------------------------------------------------------------*
       01  ERROR-MESSAGE          PIC X(78) VALUE SPACES.
           88 NO-ERROR-MESSAGE VALUE SPACES.

       01  WS-REQUEST-LENGTH      PIC S9(9) BINARY VALUE 0.
       01  WS-REPLY-LENGTH        PIC S9(9) BINARY VALUE 0.
       01  WS-REPLY-DATA-LENGTH   PIC S9(9) BINARY VALUE 0.
       01  WS-NUM-DISPLAY         PIC +9(8) VALUE ZERO.
       01  WS-ALP-DISPLAY REDEFINES WS-NUM-DISPLAY PIC X(9).
       01  WS-MSGID.
           05 WS-CICS-REGION      PIC X(4).
           05 WS-CICS-DATE        PIC X(9).
           05 WS-CICS-TASKN       PIC X(9).
       01  FILLER                 PIC 9(4) BINARY VALUE 0.
           88 DATA-CONVERSION-NEEDED     VALUE 0.
           88 NO-DATA-CONVERSION-NEEDED  VALUE 1.
       01  WS-REPLY-ERROR-LENGTH  PIC S9(9) BINARY VALUE 0.
       01  WS-HALFWORD            PIC 9(4) BINARY VALUE 0.

      *---------------------------------------------------------------*
      *  Request parameters expected by target web service            *
      *---------------------------------------------------------------*
       01 COM-REQUEST.
           02  QueryJvm.
             03  envVarNames--C PIC 9(9) BINARY.
             03  arg0.
               04  envVarNames OCCURS 0 TO 10 DEPENDING ON 
                   envVarNames--C PIC X(32) DISPLAY.

       
      *---------------------------------------------------------------*
      *  Reply coming from JMS systems might start with an RFH2 header*
      *---------------------------------------------------------------*
       01 COM-CMQRFH2V.
           COPY CMQRFH2V.

      *****************************************************************
      *            L I N K A G E       S E C T I O N                  *
      *****************************************************************
       LINKAGE SECTION.

      *---------------------------------------------------------------*
      *  This will be dynamically allocated to the exact reply size.  *
      *---------------------------------------------------------------*
       01 COM-REPLY-BUFFER        PIC X(16777215).

      *---------------------------------------------------------------*
      *  Reply parameters as returned by target web service           *
      *---------------------------------------------------------------*
       01 COM-REPLY.
           02  QueryJvmResponse.
             03  envVarValues--C PIC 9(9) BINARY.
             03  R-return.
               04  country PIC X(32) DISPLAY.
               04  currencySymbol PIC X(32) DISPLAY.
               04  envVarValues OCCURS 0 TO 10 DEPENDING ON 
                   envVarValues--C PIC X(32) DISPLAY.
               04  formattedDate PIC X(32) DISPLAY.
               04  language PIC X(32) DISPLAY.

               
      *---------------------------------------------------------------*
      *  Reply error message returned by target web service           *
      *---------------------------------------------------------------*
       01  COM-REPLY-ERROR       PIC X(1024).
      *****************************************************************
      *    P R O C E D U R E  D I V I S I O N   S E C T I O N         *
      *****************************************************************
       PROCEDURE DIVISION.

           PERFORM PROLOG THRU
               END-PROLOG.

           PERFORM INVOKE-SERVICE THRU
               END-INVOKE-SERVICE.
               
           PERFORM EPILOG THRU
               END-EPILOG.

           GOBACK.
       
      *---------------------------------------------------------------*
      *  Initialize the WMQ API.                                      *
      *---------------------------------------------------------------*
       PROLOG.

           DISPLAY
               'JVMQUERY STARTING ==============================='. 

           PERFORM SET-REQUEST THRU
               END-SET-REQUEST.
      *
      *    Connect to the queue manager
      *
           PERFORM WMQ-CONNECT THRU
               END-WMQ-CONNECT.

           DISPLAY 'PROLOG ENDED'.
           
       END-PROLOG.   EXIT.

      *---------------------------------------------------------------*
      *  Populate the request parameters                              *
      *---------------------------------------------------------------*
       SET-REQUEST.

           DISPLAY 'SET-REQUEST STARTED'.

      *  TODO set input values in COM-REQUEST                         *
           
           DISPLAY 'SET-REQUEST ENDED'.

       END-SET-REQUEST.   EXIT.

      *---------------------------------------------------------------*
      *  Invoke target service                                        *
      *  All MQ calls fail if the queue manager is quiescing.         *
      *---------------------------------------------------------------*
       INVOKE-SERVICE.

           DISPLAY 'ABOUT TO INVOKE-SERVICE'.

           PERFORM SEND-REQUEST THRU
               END-SEND-REQUEST.

           PERFORM GET-REPLY THRU
               END-GET-REPLY.

           IF NO-ERROR-MESSAGE 
               PERFORM PRINT-RESULTS THRU
                   END-PRINT-RESULTS
           ELSE
               PERFORM DISPLAY-ERROR-MESSAGE THRU
                   END-DISPLAY-ERROR-MESSAGE
               PERFORM PRINT-ERROR-RESULTS THRU
                   END-PRINT-ERROR-RESULTS
           END-IF

           DISPLAY 'INVOKE-SERVICE SUCCESS'.

       END-INVOKE-SERVICE.   EXIT.

      *---------------------------------------------------------------*
      *  Display results returned from target service                 *
      *---------------------------------------------------------------*
       PRINT-RESULTS.

      *  TODO do something useful with data returned in  COM-REPLY    *

       END-PRINT-RESULTS.   EXIT.

      *---------------------------------------------------------------*
      *  Display error message returned from target service           *
      *---------------------------------------------------------------*
       PRINT-ERROR-RESULTS.

           IF WS-REPLY-ERROR-LENGTH > 0
               COMPUTE WS-HALFWORD = WS-REPLY-ERROR-LENGTH
               EXEC CICS SEND TEXT
                    FROM   (COM-REPLY-ERROR)
                    LENGTH (WS-HALFWORD)
                    FREEKB
               END-EXEC
                                                                        
               DISPLAY 'INVOKE-SERVICE failed. Error message is:'                
               DISPLAY COM-REPLY-ERROR(1:WS-REPLY-ERROR-LENGTH)
           END-IF.               

       END-PRINT-ERROR-RESULTS.   EXIT.
      *---------------------------------------------------------------*
      *  Disconnect from WMQ manager and exit.                        *
      *---------------------------------------------------------------*
       EPILOG.

      *
      *    Disconnect from the queue manager
      *
           PERFORM WMQ-DISCONNECT THRU
               END-WMQ-DISCONNECT.

           PERFORM EXIT-PROGRAM THRU
               END-EXIT-PROGRAM.
           
       END-EPILOG.   EXIT.

      *---------------------------------------------------------------*
      *  Store request data in the request queue.                     *
      *  We specify a format of NONE so that MQ does not perform any  *
      *  translations on the request data.                            *
      *---------------------------------------------------------------*
       SEND-REQUEST.
       
           DISPLAY 'START SEND-REQUEST'.

      * 
      * Create a unique message ID
      *
           EXEC CICS ASSIGN APPLID (WS-CICS-REGION) END-EXEC.
           MOVE EIBDATE TO WS-NUM-DISPLAY.
           MOVE WS-ALP-DISPLAY TO WS-CICS-DATE.
           MOVE EIBTASKN TO WS-NUM-DISPLAY.
           MOVE WS-ALP-DISPLAY TO WS-CICS-TASKN.

      * 
      * Open request queue
      *
           COMPUTE W03-OPENOPTIONS = MQOO-OUTPUT +
                                     MQOO-FAIL-IF-QUIESCING.
           MOVE W00-REQUEST-QNAME TO MQOD-OBJECTNAME.
           PERFORM WMQ-OPEN-Q THRU
               END-WMQ-OPEN-Q.
               
      * 
      * Put request object in request queue
      *
           MOVE MQPER-NOT-PERSISTENT TO MQMD-PERSISTENCE.
           MOVE MQFMT-NONE TO MQMD-FORMAT.
           MOVE W00-REPLY-QNAME TO MQMD-REPLYTOQ.
           COMPUTE MQPMO-OPTIONS = MQPMO-NO-SYNCPOINT +             
                                   MQPMO-FAIL-IF-QUIESCING. 
           COMPUTE WS-REQUEST-LENGTH = LENGTH OF COM-REQUEST.
           MOVE WS-MSGID  TO MQMD-MSGID.
           MOVE WS-MSGID  TO MQMD-CORRELID.

           CALL 'MQPUT' USING W03-HCONN
                              W03-HOBJ
                              MQMD
                              MQPMO
                              WS-REQUEST-LENGTH
                              COM-REQUEST
                              W03-COMPCODE
                              W03-REASON.

           IF (W03-COMPCODE NOT = MQCC-OK) THEN
               STRING 'Failed put into WMQ queue :'
                      DELIMITED BY SIZE
                      W00-REQUEST-QNAME DELIMITED BY SPACE
                      INTO ERROR-MESSAGE
               PERFORM ABORT-PROGRAM THRU
                   END-ABORT-PROGRAM
           END-IF.

      * 
      * Close request queue
      *
           PERFORM WMQ-CLOSE-Q THRU
               END-WMQ-CLOSE-Q.

           DISPLAY 'SEND-REQUEST ENDED. ID=' WS-MSGID.

       END-SEND-REQUEST.   EXIT.

      *---------------------------------------------------------------*
      *  Read the reply. We first read the RFH2 header (if any) non   *
      *  destructively. This will give us the total length of the     *
      *  message so we can acquire enough storage for that and then   *
      *  get the complete message. We wait for a response but no      *
      *  longer than 3 s. The second get is destructive, we set       *
      *  syncpoint so that the message is not lost in case of a       *
      *  failure. We expect the content to be already in ZOS format.  *
      *---------------------------------------------------------------*
       GET-REPLY.
       
           DISPLAY 'GET-REPLY STARTED'.

      * 
      * Open reply queue
      *
           COMPUTE W03-OPENOPTIONS = MQOO-INPUT-SHARED +
                                     MQOO-BROWSE +
                                     MQOO-FAIL-IF-QUIESCING.
           MOVE W00-REPLY-QNAME   TO MQOD-OBJECTNAME.
           PERFORM WMQ-OPEN-Q THRU
               END-WMQ-OPEN-Q.
               
      * 
      * Browse for RFH2 header, waiting until timeout
      *
           PERFORM GET-RFH2 THRU
               END-GET-RFH2.
           
           IF (W03-REASON = MQRC-NO-MSG-AVAILABLE)
      * 
      * No reply is available 
      *
               PERFORM WMQ-CLOSE-Q THRU
                   END-WMQ-CLOSE-Q
               PERFORM GET-REPLY-ERROR THRU
                   END-GET-REPLY-ERROR
           ELSE
      * 
      * Otherwise retrieve the reply data in generic buffer and
      * give the reply structure adressability depending on the
      * presence of an RFH2 header or not
      *
               SET NO-DATA-CONVERSION-NEEDED TO TRUE
               PERFORM GET-REPLY-DATA THRU
                   END-GET-REPLY-DATA
               IF (MQMD-FORMAT = MQFMT-RF-HEADER-2)
                   SET ADDRESS OF COM-REPLY TO ADDRESS OF
                       COM-REPLY-BUFFER(MQRFH-STRUCLENGTH + 1:)
               ELSE
                   SET ADDRESS OF COM-REPLY TO ADDRESS OF
                       COM-REPLY-BUFFER
               END-IF
                
           END-IF.

           DISPLAY 'GET-REPLY ENDED'.

       END-GET-REPLY.   EXIT.

      *---------------------------------------------------------------*
      *  We assume a JMS partner on the other end of the line.        *
      *  Reply data will be preceded by an RFH2 header.               *
      *  The reply may not be readily available so we are prepared    *
      *  to wait a limited amount of time.                            *
      *  This might return with a message not available reason code.  *
      *---------------------------------------------------------------*
       GET-RFH2.

           DISPLAY 'GET-RFH2 STARTED'.
           
           COMPUTE MQGMO-OPTIONS = MQGMO-WAIT +             
                                   MQGMO-BROWSE-FIRST +
                                   MQGMO-ACCEPT-TRUNCATED-MSG +
                                   MQGMO-FAIL-IF-QUIESCING.    
           MOVE W00-WAIT-INTERVAL TO MQGMO-WAITINTERVAL.
           MOVE MQMI-NONE TO MQMD-MSGID.
           MOVE WS-MSGID  TO MQMD-CORRELID.
           
           COMPUTE WS-REPLY-LENGTH = LENGTH OF COM-CMQRFH2V.

           CALL 'MQGET' USING W03-HCONN
                              W03-HOBJ
                              MQMD
                              MQGMO
                              WS-REPLY-LENGTH 
                              COM-CMQRFH2V 
                              WS-REPLY-DATA-LENGTH
                              W03-COMPCODE
                              W03-REASON.

           IF (W03-COMPCODE NOT = MQCC-OK) AND                   
              (W03-REASON NOT = MQRC-TRUNCATED-MSG-ACCEPTED) THEN
               STRING 'Failed browse from WMQ queue :' 
                      DELIMITED BY SIZE
                      MQOD-OBJECTNAME DELIMITED BY SPACE
                      ' ID=' DELIMITED BY SIZE
                      WS-MSGID DELIMITED BY SPACE
                      INTO ERROR-MESSAGE
               IF (W03-REASON NOT = MQRC-NO-MSG-AVAILABLE) THEN
                   PERFORM ABORT-PROGRAM THRU
                       END-ABORT-PROGRAM
               END-IF
           END-IF.

           DISPLAY 'GET-RFH2 ENDED'.

       END-GET-RFH2.   EXIT.

      *---------------------------------------------------------------*
      *  At this stage a valid reply RFH2 header has been read.       *
      *  We need to acquire storage for the reply data and read it.   *
      *---------------------------------------------------------------*
       GET-REPLY-DATA.

           DISPLAY 'GET-REPLY-DATA STARTED'.

      * 
      * Acquire storage for the entire message
      *
           EXEC CICS GETMAIN                           
                SET (ADDRESS OF COM-REPLY-BUFFER)
                FLENGTH (WS-REPLY-DATA-LENGTH)                        
                RESP    (W03-COMPCODE)  
                RESP2   (W03-REASON) 
           END-EXEC.
            
           IF (W03-COMPCODE NOT = DFHRESP(NORMAL))
               MOVE WS-REPLY-DATA-LENGTH TO WS-NUM-DISPLAY
               STRING 'Failed getmain :' WS-NUM-DISPLAY
                      DELIMITED BY SIZE
                      INTO ERROR-MESSAGE
               PERFORM ABORT-PROGRAM THRU
                   END-ABORT-PROGRAM
           END-IF.                                  

      * 
      * Destructively read the entire message
      *
           COMPUTE MQGMO-OPTIONS = MQGMO-NO-WAIT +             
                                   MQGMO-SYNCPOINT +
                                   MQGMO-FAIL-IF-QUIESCING. 
           IF DATA-CONVERSION-NEEDED
               COMPUTE MQGMO-OPTIONS = MQGMO-NO-WAIT +             
                                       MQGMO-SYNCPOINT +
                                       MQGMO-FAIL-IF-QUIESCING + 
                                       MQGMO-CONVERT
               MOVE MQCCSI-Q-MGR TO MQMD-CODEDCHARSETID
               MOVE MQENC-NATIVE TO MQMD-ENCODING
           ELSE
               COMPUTE MQGMO-OPTIONS = MQGMO-NO-WAIT +             
                                       MQGMO-SYNCPOINT +
                                       MQGMO-FAIL-IF-QUIESCING
           END-IF.   

           MOVE MQMI-NONE TO MQMD-MSGID.
           MOVE WS-MSGID  TO MQMD-CORRELID.
           
           COMPUTE WS-REPLY-LENGTH = WS-REPLY-DATA-LENGTH.

           CALL 'MQGET' USING W03-HCONN
                              W03-HOBJ
                              MQMD
                              MQGMO
                              WS-REPLY-LENGTH 
                              COM-REPLY-BUFFER 
                              WS-REPLY-DATA-LENGTH
                              W03-COMPCODE
                              W03-REASON.

           IF (W03-COMPCODE NOT = MQCC-OK) AND                   
              (W03-REASON NOT = MQRC-TRUNCATED-MSG-ACCEPTED) THEN
               STRING 'Failed get from WMQ queue :'
                      DELIMITED BY SIZE
                      MQOD-OBJECTNAME DELIMITED BY SPACE
                      INTO ERROR-MESSAGE
               PERFORM ABORT-PROGRAM THRU
                   END-ABORT-PROGRAM
           END-IF.

      * 
      * Close reply queue
      *
           PERFORM WMQ-CLOSE-Q THRU
               END-WMQ-CLOSE-Q.


           DISPLAY 'GET-REPLY-DATA ENDED'.

       END-GET-REPLY-DATA.   EXIT.
      *---------------------------------------------------------------*
      *  A failure of the target service results in a timeout waiting *
      *  for a response. There might be more info on the nature of    *
      *  the failure in the error queue. This paragraph does its best *
      *  effort to recover such info which is expected to be a string *
      *  encoded in the remote platform code page.                    *
      *---------------------------------------------------------------*
       GET-REPLY-ERROR.

           DISPLAY 'GET-REPLY-ERROR STARTED'.

      * 
      * Open error queue
      *
           COMPUTE W03-OPENOPTIONS = MQOO-INPUT-SHARED +
                                     MQOO-BROWSE +
                                     MQOO-FAIL-IF-QUIESCING.
           MOVE W00-ERROR-QNAME   TO MQOD-OBJECTNAME.
           PERFORM WMQ-OPEN-Q THRU
               END-WMQ-OPEN-Q.
      * 
      * Browse for RFH2 header, waiting until timeout
      *
           PERFORM GET-RFH2 THRU
               END-GET-RFH2.
           
           IF (W03-COMPCODE NOT = MQCC-OK) AND                   
              (W03-REASON NOT = MQRC-TRUNCATED-MSG-ACCEPTED) THEN
               PERFORM ABORT-PROGRAM THRU
                   END-ABORT-PROGRAM
           END-IF.
      * 
      * Retrieve the reply data in generic buffer and
      * give the reply structure adressability
      *
           SET DATA-CONVERSION-NEEDED TO TRUE.
           PERFORM GET-REPLY-DATA THRU
               END-GET-REPLY-DATA.
           IF (MQMD-FORMAT = MQFMT-RF-HEADER-2)
               SET ADDRESS OF COM-REPLY-ERROR TO ADDRESS OF
                   COM-REPLY-BUFFER(MQRFH-STRUCLENGTH + 1:)
               COMPUTE WS-REPLY-ERROR-LENGTH = WS-REPLY-DATA-LENGTH
                        - MQRFH-STRUCLENGTH
           ELSE
               SET ADDRESS OF COM-REPLY-ERROR TO ADDRESS OF
                   COM-REPLY-BUFFER
               COMPUTE WS-REPLY-ERROR-LENGTH = WS-REPLY-DATA-LENGTH
           END-IF.

           DISPLAY 'GET-REPLY-ERROR ENDED'.
           
       END-GET-REPLY-ERROR.   EXIT.

      *---------------------------------------------------------------*
      *  Connect to the WMQ manager                                   *
      *---------------------------------------------------------------*
       WMQ-CONNECT.

           DISPLAY 'WMQ-CONNECT STARTED'.

           CALL 'MQCONN' USING W00-QMGR
                               W03-HCONN
                               W03-COMPCODE
                               W03-REASON.
                               
           IF (W03-COMPCODE NOT = MQCC-OK) THEN
               STRING 'Failed connect to the WMQ manager :' W00-QMGR
                      DELIMITED BY SIZE
                      INTO ERROR-MESSAGE
               PERFORM ABORT-PROGRAM THRU
                   END-ABORT-PROGRAM
           END-IF.

           DISPLAY 'WMQ-CONNECT ENDED'.

       END-WMQ-CONNECT.   EXIT.

      *---------------------------------------------------------------*
      *  Open a queue. Assumes MQ0D and W03-OPENOPTIONS were          *
      *  initialized by caller.                                       *
      *---------------------------------------------------------------*
       WMQ-OPEN-Q.

           DISPLAY 'WMQ-OPEN-Q STARTED ' MQOD-OBJECTNAME.

           CALL 'MQOPEN' USING W03-HCONN
                               MQOD
                               W03-OPENOPTIONS
                               W03-HOBJ
                               W03-COMPCODE
                               W03-REASON.

           IF (W03-COMPCODE NOT = MQCC-OK) THEN
               STRING 'Failed open WMQ queue :'
                      DELIMITED BY SIZE
                      MQOD-OBJECTNAME DELIMITED BY SPACE
                      INTO ERROR-MESSAGE
               PERFORM ABORT-PROGRAM THRU
                   END-ABORT-PROGRAM
           END-IF.

           DISPLAY 'WMQ-OPEN-Q ENDED ' MQOD-OBJECTNAME.

       END-WMQ-OPEN-Q.   EXIT.

      *---------------------------------------------------------------*
      *  Close a queue. Assumes MQOD was last used to open queue and  *
      *  W03-HOBJ holds the target queue handle.                      *
      *---------------------------------------------------------------*
       WMQ-CLOSE-Q.

           DISPLAY 'WMQ-CLOSE-Q STARTED ' MQOD-OBJECTNAME.

           CALL 'MQCLOSE' USING W03-HCONN
                                W03-HOBJ
                                MQCO-NONE
                                W03-COMPCODE
                                W03-REASON.

           IF (W03-COMPCODE NOT = MQCC-OK) THEN
               STRING 'Failed close WMQ queue :'
                      DELIMITED BY SIZE
                      MQOD-OBJECTNAME DELIMITED BY SPACE
                      INTO ERROR-MESSAGE
               PERFORM ABORT-PROGRAM THRU
                   END-ABORT-PROGRAM
           END-IF.

           DISPLAY 'WMQ-CLOSE-Q ENDED ' MQOD-OBJECTNAME.

       END-WMQ-CLOSE-Q.   EXIT.

      *---------------------------------------------------------------*
      *  Disconnect from the WMQ manager                              *
      *---------------------------------------------------------------*
       WMQ-DISCONNECT.
       
           DISPLAY 'WMQ-DISCONNECT STARTED'.

           CALL 'MQDISC' USING W03-HCONN
                               W03-COMPCODE
                               W03-REASON.

           IF (W03-COMPCODE NOT = MQCC-OK) THEN
               STRING 'Failed disconnect from WMQ manager :' W00-QMGR
                      DELIMITED BY SIZE
                      INTO ERROR-MESSAGE
               PERFORM ABORT-PROGRAM THRU
                   END-ABORT-PROGRAM
           END-IF.

           DISPLAY 'WMQ-DISCONNECT ENDED'.

       END-WMQ-DISCONNECT.   EXIT.

      *---------------------------------------------------------------*
      *  Free keyboard and return to CICS                             *
      *---------------------------------------------------------------*
       EXIT-PROGRAM.
       
           EXEC CICS SEND CONTROL FREEKB END-EXEC.
           
           DISPLAY 'JVMQUERY STOPPING ==============================='.
           EXEC CICS RETURN END-EXEC.

       END-EXIT-PROGRAM.   EXIT.

      *---------------------------------------------------------------*
      *  Something went wrong. Report error and exit.                 *
      *---------------------------------------------------------------*
       ABORT-PROGRAM.
           
           PERFORM DISPLAY-ERROR-MESSAGE THRU
               END-DISPLAY-ERROR-MESSAGE.
               
           PERFORM EXIT-PROGRAM THRU
               END-EXIT-PROGRAM.

       END-ABORT-PROGRAM.   EXIT.

      *---------------------------------------------------------------*
      *  Display error messages                                       *
      *---------------------------------------------------------------*
       DISPLAY-ERROR-MESSAGE.

           EXEC CICS SEND TEXT FROM(ERROR-MESSAGE) FREEKB END-EXEC. 
           DISPLAY '************************************************'.
           DISPLAY '* ', ERROR-MESSAGE.
           DISPLAY '* COMPLETION CODE : ', W03-COMPCODE.
           DISPLAY '* REASON CODE     : ', W03-REASON.
           DISPLAY '************************************************'.

       END-DISPLAY-ERROR-MESSAGE.   EXIT.

       END PROGRAM JVMQUERY.