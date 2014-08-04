package com.legstar.test.cixs.redopera;
import javax.xml.ws.WebFault;

/**
 * LegStar/Jaxws Operation fault.
 * Fault element used as return message when an exception occurs.
 * 
 * This class was generated by LegStar Mainframe Web Service adapter generator.
 */
@WebFault(name = "RedoperaFaultInfo",
          targetNamespace = "http://cixs.test.legstar.com/redopera")
public class RedoperaFault
    extends Exception {

    /** Default serialVersionUID.  */
    private static final long serialVersionUID = 1L;

    /** Java type that goes as soapenv:Fault detail element. */
    private RedoperaFaultInfo faultInfo;

    /**
     * Constructor for Web Fault.
     * @param fault error details
     * @param message error summary
     */
    public RedoperaFault(
        final String message,
        final RedoperaFaultInfo fault) {
      
        super(message);
        faultInfo = fault;
    }

    /**
     * Constructor for Web Fault with cause.
     * @param fault error details
     * @param message error summary
     * @param cause the cause
     */
    public RedoperaFault(
        final String message,
        final RedoperaFaultInfo fault,
        final Throwable cause) {
        
        super(message, cause);
        faultInfo = fault;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.legstar.test.cixs.redopera.RedoperaFaultInfo
     */
    public RedoperaFaultInfo getFaultInfo() {
        return faultInfo;
    }

}
