package com.legstar.cixs.jaxws.gen.vm;

import com.legstar.cixs.gen.AbstractTestTemplate;
import com.legstar.cixs.gen.Samples;
import com.legstar.cixs.jaxws.gen.Cixs2JaxwsGenerator;
import com.legstar.cixs.jaxws.gen.StructuresGenerator;
import com.legstar.cixs.jaxws.model.CixsJaxwsService;


/**
 * Test the sample COBOL WMQ Client generation.
 *
 */
public class SampleCobolClientTemplatesTest extends AbstractTestTemplate {

    /**
     * Generate the c2ws sample COBOL client and test it.
     * @throws Exception if generation fails
     */
    public void testCobolCicsC2wsJvmquery() throws Exception {

        CixsJaxwsService model = Samples.getJvmqueryWs();
        getParameters().put("cixsOperation", model.getCixsOperations().get(0));
        getParameters().put("structHelper", new StructuresGenerator());
        String resStr = genSource(model,
                Cixs2JaxwsGenerator.CIXS_TO_JAXWS_GENERATOR_NAME,
                Cixs2JaxwsGenerator.OPERATION_COBOL_CICS_CLIENT_VLC_TEMPLATE,
                GEN_COBOL_DIR,
                model.getCixsOperations().get(0).getCicsProgramName() + ".cbl");

        assertTrue(resStr.contains("       PROGRAM-ID. JVMQUERY."));
        assertTrue(resStr.contains("       77  THIS-TRACE-ID               PIC X(13) VALUE 'JVMQUERY'."));
        assertTrue(resStr.contains("77  C2WS-SERVICE-URI            PIC X(53) VALUE"));
        assertTrue(resStr.contains("http://localhost:8080/c2ws-jvmqueryWs/jvmqueryWsProxy'."));
        assertTrue(resStr.contains("77  C2WS-USERID                 PIC X(5) VALUE"));
        assertTrue(resStr.contains("'alice'."));
        assertTrue(resStr.contains("77  C2WS-PASSWORD               PIC X(12) VALUE"));
        assertTrue(resStr.contains("'inwonderland'."));
        assertTrue(resStr.contains("77  C2WS-SERVICE-NAME           PIC X(10) VALUE"));
        assertTrue(resStr.contains("'jvmqueryWs'."));
        assertTrue(resStr.contains("           05 QueryJvm."));
        assertTrue(resStr.contains("               10 envVarNames--C PIC 9(9) BINARY."));
        assertTrue(resStr.contains("               15 envVarNames PIC X(32) OCCURS 0 TO 10 DEPENDING ON"));
        assertTrue(resStr.contains("                   envVarNames--C."));
        assertTrue(resStr.contains("           05 QueryJvmResponse."));
        assertTrue(resStr.contains("               10 envVarValues--C PIC 9(9) BINARY."));
        assertTrue(resStr.contains("               15 country PIC X(32)."));
        assertTrue(resStr.contains("               15 currencySymbol PIC X(32)."));
        assertTrue(resStr.contains("               15 envVarValues PIC X(32) OCCURS 0 TO 10 DEPENDING ON"));
        assertTrue(resStr.contains("                   envVarValues--C."));
        assertTrue(resStr.contains("               15 formattedDate PIC X(32)."));
        assertTrue(resStr.contains("               15 language PIC X(32)."));
        assertTrue(resStr.contains("'JVMQUERY STARTING ==============================='"));
        assertTrue(resStr.contains("'JVMQUERY STOPPING ==============================='"));
    }

    /**
     * Generate the c2ws sample COBOL client and test it.
     * @throws Exception if generation fails
     */
    public void testCobolCicsC2wsCultureinfo() throws Exception {

        CixsJaxwsService model = Samples.getCultureInfo();
        getParameters().put("cixsOperation", model.getCixsOperations().get(0));
        getParameters().put("structHelper", new StructuresGenerator());
        String resStr = genSource(model,
                Cixs2JaxwsGenerator.CIXS_TO_JAXWS_GENERATOR_NAME,
                Cixs2JaxwsGenerator.OPERATION_COBOL_CICS_CLIENT_VLC_TEMPLATE,
                GEN_COBOL_DIR,
                model.getCixsOperations().get(0).getCicsProgramName() + ".cbl");

        assertTrue(resStr.contains("       PROGRAM-ID. CULTUREI."));
        assertTrue(resStr.contains("       77  THIS-TRACE-ID               PIC X(13) VALUE 'CULTUREI'."));
        assertTrue(resStr.contains("77  C2WS-SERVICE-URI            PIC X(55) VALUE"));
        assertTrue(resStr.contains("http://localhost:8080/c2ws-cultureinfo/cultureinfoProxy'."));
        assertTrue(resStr.contains("77  C2WS-USERID                 PIC X(8) VALUE"));
        assertTrue(resStr.contains("'        '."));
        assertTrue(resStr.contains("77  C2WS-PASSWORD               PIC X(8) VALUE"));
        assertTrue(resStr.contains("'        '."));
        assertTrue(resStr.contains("77  C2WS-SERVICE-NAME           PIC X(11) VALUE"));
        assertTrue(resStr.contains("'cultureinfo'."));
        assertTrue(resStr.contains("           05 GetInfo."));
        assertTrue(resStr.contains("               10 arg0."));
        assertTrue(resStr.contains("                   15 cultureCode PIC X(32)."));
        assertTrue(resStr.contains("                   15 decimalNumber PIC 9(7)V9(2) COMP-3."));
        assertTrue(resStr.contains("           05 GetInfoResponse."));
        assertTrue(resStr.contains("               10 R-return."));
        assertTrue(resStr.contains("                   15 currencySymbol PIC X(32)."));
        assertTrue(resStr.contains("                   15 displayCountry PIC X(32)."));
        assertTrue(resStr.contains("                   15 displayLanguage PIC X(32)."));
        assertTrue(resStr.contains("                   15 formattedDate PIC X(32)."));
        assertTrue(resStr.contains("                   15 formattedDecimalNumber PIC X(32)."));
        assertTrue(resStr.contains("                   15 serverCultureInfo."));
        assertTrue(resStr.contains("                       20 cultureCode PIC X(32)."));
        assertTrue(resStr.contains("                       20 displayCountry0 PIC X(32)."));
        assertTrue(resStr.contains("                       20 displayLanguage0 PIC X(32)."));
        assertTrue(resStr.contains("'CULTUREI STARTING ==============================='"));
        assertTrue(resStr.contains("'CULTUREI STOPPING ==============================='"));
    }

    /**
     * Generate the c2ws sample COBOL client and test it.
     * @throws Exception if generation fails
     */
    public void testCobolCicsC2wsMSNSearch() throws Exception {

        CixsJaxwsService model = Samples.getMSNSearch();
        getParameters().put("cixsOperation", model.getCixsOperations().get(0));
        getParameters().put("structHelper", new StructuresGenerator());
        String resStr = genSource(model,
                Cixs2JaxwsGenerator.CIXS_TO_JAXWS_GENERATOR_NAME,
                Cixs2JaxwsGenerator.OPERATION_COBOL_CICS_CLIENT_VLC_TEMPLATE,
                GEN_COBOL_DIR,
                model.getCixsOperations().get(0).getCicsProgramName() + ".cbl");

        assertTrue(resStr.contains("       PROGRAM-ID. MSNSEARC."));
        assertTrue(resStr.contains("       77  THIS-TRACE-ID               PIC X(13) VALUE 'MSNSEARC'."));
        assertTrue(resStr.contains("77  C2WS-SERVICE-URI            PIC X(51) VALUE"));
        assertTrue(resStr.contains("http://localhost:8080/c2ws-MSNSearch/MSNSearchProxy'."));
        assertTrue(resStr.contains("77  C2WS-USERID                 PIC X(8) VALUE"));
        assertTrue(resStr.contains("'        '."));
        assertTrue(resStr.contains("77  C2WS-PASSWORD               PIC X(8) VALUE"));
        assertTrue(resStr.contains("'        '."));
        assertTrue(resStr.contains("77  C2WS-SERVICE-NAME           PIC X(9) VALUE"));
        assertTrue(resStr.contains("'MSNSearch'."));
        assertTrue(resStr.contains("           05 R-Search."));
        assertTrue(resStr.contains("               10 Flags--C PIC 9(9) BINARY."));
        assertTrue(resStr.contains("               10 SortBy--C PIC 9(9) BINARY."));
        assertTrue(resStr.contains("               10 ResultFields--C PIC 9(9) BINARY."));
        assertTrue(resStr.contains("               10 R-string--C PIC 9(9) BINARY."));
        assertTrue(resStr.contains("               10 SourceRequest--C PIC 9(9) BINARY."));
        assertTrue(resStr.contains("               10 Request."));
        assertTrue(resStr.contains("                   15 AppID PIC X(40)."));
        assertTrue(resStr.contains("                   15 Query PIC X(128)."));
        assertTrue(resStr.contains("                   15 CultureInfo PIC X(32)."));
        assertTrue(resStr.contains("                   15 SafeSearch PIC X(32)."));
        assertTrue(resStr.contains("                   15 Flags PIC X(32) OCCURS 1 TO 10 DEPENDING ON"));
        assertTrue(resStr.contains("                       Flags--C."));
        assertTrue(resStr.contains("                   15 Location."));
        assertTrue(resStr.contains("                       20 Latitude COMP-2."));
        assertTrue(resStr.contains("                       20 Longitude COMP-2."));
        assertTrue(resStr.contains("                       20 Radius COMP-2."));
        assertTrue(resStr.contains("                   15 Requests."));
        assertTrue(resStr.contains("                       20 SourceRequest OCCURS 0 TO 10 DEPENDING ON"));
        assertTrue(resStr.contains("                           SourceRequest--C."));
        assertTrue(resStr.contains("                           25 R-Source PIC X(32)."));
        assertTrue(resStr.contains("                           25 Offset PIC 9(9) COMP-5."));
        assertTrue(resStr.contains("                           25 R-Count PIC 9(9) COMP-5."));
        assertTrue(resStr.contains("                           25 FileType PIC X(32)."));
        assertTrue(resStr.contains("                           25 SortBy PIC X(32) OCCURS 1 TO 10 DEPENDING"));
        assertTrue(resStr.contains("                               ON SortBy--C."));
        assertTrue(resStr.contains("                           25 ResultFields PIC X(32) OCCURS 1 TO 10"));
        assertTrue(resStr.contains("                               DEPENDING ON ResultFields--C."));
        assertTrue(resStr.contains("                           25 SearchTagFilters."));
        assertTrue(resStr.contains("                               30 R-string PIC X(32) OCCURS 0 TO 10"));
        assertTrue(resStr.contains("                                   DEPENDING ON R-string--C."));
        assertTrue(resStr.contains("'MSNSEARC STARTING ==============================='"));
        assertTrue(resStr.contains("'MSNSEARC STOPPING ==============================='"));
    }
}