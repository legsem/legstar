
package com.legstar.test.cixs.osarrays;
import javax.jws.WebService;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.legstar.host.invoke.HostInvoke;
import com.legstar.host.invoke.HostInvokeException;
import com.legstar.host.invoke.HostInvokeFactory;
import com.legstar.messaging.Address;


/**
 * Web service enpoint implementation.
 * 
 * This class was generated by CIXS generator.
 * 2007-04-06T12:06:20.296+02:00
 */

@WebService(endpointInterface = "com.legstar.test.cixs.osarrays.Osarrays",
        serviceName = "osarraysService",
        targetNamespace = "http://cixs.test.legstar.com/osarrays")
public class OsarraysImpl implements Osarrays {

  /** The JNDI locator for the configuration file name.*/
  private static final String JNDI_CONFIG_FILE =
	  "java:comp/env/legstar/configFileName";
	  
  /** The default configuration file name if it cannot be recovered from JNDI.*/
  private static final String DEFAULT_CONFIG_FILE = "config.xml";

  /** The configuration file name. */
  private String mConfigFileName;


  /** Properties for operation osarrays. */    
  private static final String  OSARRAYS_PROP_FILE = "osarrays.properties";

  /** {@inheritDoc} */
  public final com.legstar.test.coxb.osarrays.
          DfhcommareaType osarrays(
          final com.legstar.test.coxb.osarrays.
                DfhcommareaType request,
          final OsarraysHostHeader hostHeader)
      throws OsarraysFault {
    
    /* The JAXB input factory. */
    com.legstar.test.coxb.osarrays.ObjectFactory jaxbInFactory =
          new com.legstar.test.coxb.osarrays.ObjectFactory(); 
    
    /* The JAXB output factory. */
    com.legstar.test.coxb.osarrays.ObjectFactory jaxbOutFactory =
          new com.legstar.test.coxb.osarrays.ObjectFactory();  
    
    com.legstar.test.coxb.osarrays.
    DfhcommareaType reply = null;
    
    try {
              
      /* Initialize invoker with static data and data from headers */
      HostInvoke mInvoker = HostInvokeFactory.createHostInvoke(
              mConfigFileName, getAddress(hostHeader), OSARRAYS_PROP_FILE);

      /* Prepare the input parameter set using static binding */
      com.legstar.test.coxb.osarrays.bind.
        DfhcommareaTypeBinding cein =
          new com.legstar.test.coxb.osarrays.bind.
              DfhcommareaTypeBinding(jaxbInFactory, request);
      
      /* Prepare the output parameter set using static binding */
      com.legstar.test.coxb.osarrays.bind.
      DfhcommareaTypeBinding ceout =
          new com.legstar.test.coxb.osarrays.bind.
              DfhcommareaTypeBinding(jaxbOutFactory);
      
      /* Call remote program */
      mInvoker.invoke((hostHeader == null) ? "alltypes" 
    		  : hostHeader.getHostRequestID(), cein, ceout);
      
      /* Get reply object */
      reply = ceout.getJaxbObject(); 
      
    } catch (HostInvokeException e) {
      reportOsarraysFaultException(e,
          "Failed to invoke host program:");
    }

    return reply;
  }

  /**
   * Formats a fault element to notify client of an exception.
   *
   * @param e the exception which occured
   * @param text short message describing the context
   * @throws OsarraysFault the fault exception
   */
  private void reportOsarraysFaultException(
      final Exception e,
      final String text) throws OsarraysFault {
    e.printStackTrace();
    OsarraysFaultInfo faultInfo = new OsarraysFaultInfo();
    faultInfo.setMessage(e.getMessage());
    faultInfo.setDetail("Operation="
            + "Osarrays"
            + " Package="
            + "com.legstar.test.cixs.osarrays");
    throw (new OsarraysFault(text + ' ' 
            + faultInfo.getMessage(), faultInfo));
    
  }


  /** Lookup the fonfiguration file name at construction time. */
  public OsarraysImpl() {
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
          final OsarraysHostHeader hostHeader) {
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
