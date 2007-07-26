
package com.legstar.test.cixs.lsfileac;
import javax.jws.WebService;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.legstar.host.invoke.HostInvoker;
import com.legstar.host.invoke.HostInvokerException;
import com.legstar.host.invoke.HostInvokerFactory;
import com.legstar.messaging.Address;

import java.util.LinkedHashMap;
import java.util.Map;
import com.legstar.coxb.ICobolComplexBinding;

import com.legstar.test.coxb.lsfileac.bind.QueryDataTypeBinding;

import com.legstar.test.coxb.lsfileac.bind.QueryLimitTypeBinding;

import com.legstar.test.coxb.lsfileac.bind.ReplyStatusTypeBinding;

import com.legstar.test.coxb.lsfileac.bind.ReplyDataTypeBinding;


/**
 * Web service enpoint implementation.
 * 
 * This class was generated by CIXS generator.
 * 2007-07-26T14:36:57.343+02:00
 */

@WebService(endpointInterface = "com.legstar.test.cixs.lsfileac.Lsfileac",
        serviceName = "lsfileacService",
        targetNamespace = "http://cixs.test.legstar.com/lsfileac")
public class LsfileacImpl implements Lsfileac {

    /** The JNDI locator for the configuration file name.*/
    private static final String JNDI_CONFIG_FILE =
        "java:comp/env/legstar/configFileName";
    
    /** The default configuration file name if not recovered from JNDI. */
    private static final String DEFAULT_CONFIG_FILE = "legstar-invoker-config.xml";

    /** The configuration file name. */
    private String mConfigFileName;


    /** Properties for operation lsfileac. */
    private static final String  LSFILEAC_PROP_FILE = "lsfileac.properties";

    /** {@inheritDoc} */
    public final LsfileacResponseHolder lsfileac(
            final LsfileacRequestHolder request,
            final LsfileacHostHeader hostHeader)
            throws LsfileacFault {
    
        LsfileacResponseHolder reply = null;
    
        try {
              
            /* Initialize invoker with static data and data from headers */
            HostInvoker mInvoker = HostInvokerFactory.createHostInvoker(
                mConfigFileName, getAddress(hostHeader), LSFILEAC_PROP_FILE);

            /* Prepare the input parameter set using static binding */
            QueryDataTypeBinding input1QueryData =
                  new QueryDataTypeBinding(request.getQueryData());
            QueryLimitTypeBinding input2QueryLimit =
                  new QueryLimitTypeBinding(request.getQueryLimit());
            
            /* Prepare the output parameter set using static binding */
            ReplyStatusTypeBinding output1ReplyStatus =
                  new ReplyStatusTypeBinding();
            ReplyDataTypeBinding output2ReplyData =
                  new ReplyDataTypeBinding();
            
            /* Map input binding variables to containers */
            Map < String, ICobolComplexBinding > inParts =
            	  new LinkedHashMap < String, ICobolComplexBinding >(); 
            
            inParts.put("QueryData", input1QueryData);
            
            inParts.put("QueryLimit", input2QueryLimit);
            
            /* Map output binding variables to containers */
            Map < String, ICobolComplexBinding > outParts =
            	  new LinkedHashMap < String, ICobolComplexBinding >(); 
            
            outParts.put("ReplyStatus", output1ReplyStatus);
            
            outParts.put("ReplyData", output2ReplyData);
            
            /* Call remote program */
            mInvoker.invoke((hostHeader == null) ? "lsfileac" 
              : hostHeader.getHostRequestID(),
               inParts,
               outParts);

            
            /* Get reply objects */
            reply = new LsfileacResponseHolder();
            
            reply.setReplyStatus(output1ReplyStatus.getReplyStatusType());
            
            reply.setReplyData(output2ReplyData.getReplyDataType());
            

        } catch (HostInvokerException e) {
            reportLsfileacFaultException(e,
              "Failed to invoke host program:");
        }

        return reply;
    }

    /**
    * Formats a fault element to notify client of an exception.
    *
    * @param e the exception which occured
    * @param text short message describing the context
    * @throws LsfileacFault the fault exception
    */
    private void reportLsfileacFaultException(
        final Exception e,
        final String text) throws LsfileacFault {

        LsfileacFaultInfo faultInfo = new LsfileacFaultInfo();
        faultInfo.setMessage(e.getMessage());
        faultInfo.setDetail("Operation="
                + "Lsfileac"
                + " Package="
                + "com.legstar.test.cixs.lsfileac");
        throw (new LsfileacFault(text + ' ' 
                + faultInfo.getMessage(), faultInfo));

    }


    /** Lookup the fonfiguration file name at construction time. */
    public LsfileacImpl() {
        try {
            Context initCtx = new InitialContext();
            mConfigFileName = (String) initCtx.lookup(JNDI_CONFIG_FILE);
        } catch (NamingException e) {
            mConfigFileName = DEFAULT_CONFIG_FILE;
        }
    }

    /**
    * Extracts header data from SOAP header and create an Address.
    * @param hostHeader the JAXB object mapping the SOAP header element
    * @return the new host Address
    */
    private Address getAddress(
        final LsfileacHostHeader hostHeader) {
        if (hostHeader == null) {
            return null;
        }
        Address address = new Address(hostHeader.getHostEndPoint());
        address.setHostCharset(hostHeader.getHostCharset());
        address.setHostUserID(hostHeader.getHostUserID());
        address.setHostPassword(hostHeader.getHostPassword());
        address.setHostTraceMode(hostHeader.getHostTraceMode());
        return address;
    }

}
