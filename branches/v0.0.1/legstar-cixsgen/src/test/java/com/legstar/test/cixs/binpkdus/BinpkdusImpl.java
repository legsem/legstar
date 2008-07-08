
package com.legstar.test.cixs.binpkdus;
import javax.jws.WebService;
import com.legstar.cixs.coxb.CIXSParameter;
import com.legstar.cixs.coxb.ICIXSInvoker;
import com.legstar.cixs.coxb.CIXSInvokerFactory;
import com.legstar.cixs.coxb.CIXSHeader;
import com.legstar.cixs.coxb.CIXSException;


/**
 * Web service enpoint implementation.
 * 
 * This class was generated by CIXS version 1.0.
 * 2007-02-06T14:30:38.265+01:00
 */

@WebService(endpointInterface = "com.legstar.test.cixs.binpkdus.Binpkdus",
        serviceName = "binpkdusService",
        targetNamespace = "http://cixs.test.legstar.com/binpkdus")
public class BinpkdusImpl implements Binpkdus {

  /** The input parameter set for the invoke method. */
  private CIXSParameter mInParameter;
  
  /** The output parameter set for the invoke method. */
  private CIXSParameter mOutParameter;

  /** The invoker object. */
  private ICIXSInvoker mInvoker;


  /**
   * Contructor gets an invoker object.
   * @throws BinpkdusFault if fails to get invoker 
   */
  public BinpkdusImpl() throws BinpkdusFault {
    CIXSInvokerFactory cf = new CIXSInvokerFactory();
    try {
        mInvoker = cf.createInvoker();
        mInParameter = mInvoker.createParameter();
        mOutParameter = mInvoker.createParameter();
    } catch (CIXSException e) {
        reportBinpkdusFaultException(e, "Failed to create an invoker");
    }
  }
  
  /** {@inheritDoc} */
  public final com.legstar.test.coxb.binpkdus.
          DfhcommareaType binpkdus(
          final com.legstar.test.coxb.binpkdus.
                DfhcommareaType request,
          final BinpkdusHostHeader hostHeader)
      throws BinpkdusFault {
    
    /* The JAXB input factory. */
    com.legstar.test.coxb.binpkdus.ObjectFactory jaxbInFactory =
          new com.legstar.test.coxb.binpkdus.ObjectFactory(); 
    
    /* The JAXB output factory. */
    com.legstar.test.coxb.binpkdus.ObjectFactory jaxbOutFactory =
          new com.legstar.test.coxb.binpkdus.ObjectFactory();  
    
    com.legstar.test.coxb.binpkdus.
    DfhcommareaType reply = null;
    
    try {
              
      /* Initialize invoker with static data and data from headers */
      mInvoker.initialize(getHostParameters(hostHeader), "binpkdus");

      /* Prepare the input parameter set using static binding */
      com.legstar.test.coxb.binpkdus.bind.
        DfhcommareaTypeBinding cein =
          new com.legstar.test.coxb.binpkdus.bind.
              DfhcommareaTypeBinding(jaxbInFactory, request);
      mInParameter.setComplexBinding(cein);
      
      /* Prepare the output parameter set using static binding */
      com.legstar.test.coxb.binpkdus.bind.
      DfhcommareaTypeBinding ceout =
          new com.legstar.test.coxb.binpkdus.bind.
              DfhcommareaTypeBinding(jaxbOutFactory);
      mOutParameter.setComplexBinding(ceout);
      
      /* Call remote program */
      mInvoker.invoke(mInParameter, mOutParameter);
      
      /* Get reply object */
      reply = ceout.getJaxbObject(); 
      
    } catch (CIXSException e) {
      reportBinpkdusFaultException(e,
          "Failed to invoke host program:");
    }

    return reply;
  }

  /**
   * Formats a fault element to notify client of an exception.
   *
   * @param e the exception which occured
   * @param text short message describing the context
   * @throws BinpkdusFault the fault exception
   */
  private void reportBinpkdusFaultException(
      final Exception e,
      final String text) throws BinpkdusFault {
    e.printStackTrace();
    BinpkdusFaultInfo faultInfo = new BinpkdusFaultInfo();
    faultInfo.setMessage(e.getMessage());
    faultInfo.setDetail("Operation="
            + "Binpkdus"
            + " Package="
            + "com.legstar.test.cixs.binpkdus");
    throw (new BinpkdusFault(text + ' ' 
            + faultInfo.getMessage(), faultInfo));
    
  }


  /**
   * Extracts header data from SOAP header.
   * 
   * @param hostHeader the JAXB object mapping the SOAP header element
   * @return the header data
   */
  private CIXSHeader getHostParameters(
          final BinpkdusHostHeader hostHeader) {
    if (hostHeader == null) {
        return null;
    }
    CIXSHeader ch = new CIXSHeader();
    ch.setHostUser(hostHeader.getHostUser());
    ch.setHostPassword(hostHeader.getHostPassword());
    ch.setHostIPAddress(hostHeader.getHostIPAddress());
    ch.setHostIPPort(hostHeader.getHostIPPort());
    ch.setHostCICWPath(hostHeader.getHostCICWPath());
    return ch;
  }
  
}