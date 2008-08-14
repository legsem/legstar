
package com.legstar.test.cixs.doublmix;
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
 * 2007-02-06T14:30:41.265+01:00
 */

@WebService(endpointInterface = "com.legstar.test.cixs.doublmix.Doublmix",
        serviceName = "doublmixService",
        targetNamespace = "http://cixs.test.legstar.com/doublmix")
public class DoublmixImpl implements Doublmix {

  /** The input parameter set for the invoke method. */
  private CIXSParameter mInParameter;
  
  /** The output parameter set for the invoke method. */
  private CIXSParameter mOutParameter;

  /** The invoker object. */
  private ICIXSInvoker mInvoker;


  /**
   * Contructor gets an invoker object.
   * @throws DoublmixFault if fails to get invoker 
   */
  public DoublmixImpl() throws DoublmixFault {
    CIXSInvokerFactory cf = new CIXSInvokerFactory();
    try {
        mInvoker = cf.createInvoker();
        mInParameter = mInvoker.createParameter();
        mOutParameter = mInvoker.createParameter();
    } catch (CIXSException e) {
        reportDoublmixFaultException(e, "Failed to create an invoker");
    }
  }
  
  /** {@inheritDoc} */
  public final com.legstar.test.coxb.doublmix.
          DfhcommareaType doublmix(
          final com.legstar.test.coxb.doublmix.
                DfhcommareaType request,
          final DoublmixHostHeader hostHeader)
      throws DoublmixFault {
    
    /* The JAXB input factory. */
    com.legstar.test.coxb.doublmix.ObjectFactory jaxbInFactory =
          new com.legstar.test.coxb.doublmix.ObjectFactory(); 
    
    /* The JAXB output factory. */
    com.legstar.test.coxb.doublmix.ObjectFactory jaxbOutFactory =
          new com.legstar.test.coxb.doublmix.ObjectFactory();  
    
    com.legstar.test.coxb.doublmix.
    DfhcommareaType reply = null;
    
    try {
              
      /* Initialize invoker with static data and data from headers */
      mInvoker.initialize(getHostParameters(hostHeader), "doublmix");

      /* Prepare the input parameter set using static binding */
      com.legstar.test.coxb.doublmix.bind.
        DfhcommareaTypeBinding cein =
          new com.legstar.test.coxb.doublmix.bind.
              DfhcommareaTypeBinding(jaxbInFactory, request);
      mInParameter.setComplexBinding(cein);
      
      /* Prepare the output parameter set using static binding */
      com.legstar.test.coxb.doublmix.bind.
      DfhcommareaTypeBinding ceout =
          new com.legstar.test.coxb.doublmix.bind.
              DfhcommareaTypeBinding(jaxbOutFactory);
      mOutParameter.setComplexBinding(ceout);
      
      /* Call remote program */
      mInvoker.invoke(mInParameter, mOutParameter);
      
      /* Get reply object */
      reply = ceout.getJaxbObject(); 
      
    } catch (CIXSException e) {
      reportDoublmixFaultException(e,
          "Failed to invoke host program:");
    }

    return reply;
  }

  /**
   * Formats a fault element to notify client of an exception.
   *
   * @param e the exception which occured
   * @param text short message describing the context
   * @throws DoublmixFault the fault exception
   */
  private void reportDoublmixFaultException(
      final Exception e,
      final String text) throws DoublmixFault {
    e.printStackTrace();
    DoublmixFaultInfo faultInfo = new DoublmixFaultInfo();
    faultInfo.setMessage(e.getMessage());
    faultInfo.setDetail("Operation="
            + "Doublmix"
            + " Package="
            + "com.legstar.test.cixs.doublmix");
    throw (new DoublmixFault(text + ' ' 
            + faultInfo.getMessage(), faultInfo));
    
  }


  /**
   * Extracts header data from SOAP header.
   * 
   * @param hostHeader the JAXB object mapping the SOAP header element
   * @return the header data
   */
  private CIXSHeader getHostParameters(
          final DoublmixHostHeader hostHeader) {
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