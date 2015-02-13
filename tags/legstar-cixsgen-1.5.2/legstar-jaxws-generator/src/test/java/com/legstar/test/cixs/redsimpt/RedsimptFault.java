package com.legstar.test.cixs.redsimpt;
import javax.xml.ws.WebFault;

/**
 * LegStar/Jaxws Operation fault.
 * Fault element used as return message when an exception occurs.
 * 
 * This class was generated by LegStar Mainframe Web Service adapter generator.
 */
@WebFault(name = "RedsimptFaultInfo",
          targetNamespace = "http://cixs.test.legstar.com/redsimpt")
public class RedsimptFault
    extends Exception {

    /** Default serialVersionUID.  */
    private static final long serialVersionUID = 1L;

    /** Java type that goes as soapenv:Fault detail element. */
    private RedsimptFaultInfo faultInfo;

    /**
     * Constructor for Web Fault.
     * @param fault error details
     * @param message error summary
     */
    public RedsimptFault(
        final String message,
        final RedsimptFaultInfo fault) {
      
        super(message);
        faultInfo = fault;
    }

    /**
     * Constructor for Web Fault with cause.
     * @param fault error details
     * @param message error summary
     * @param cause the cause
     */
    public RedsimptFault(
        final String message,
        final RedsimptFaultInfo fault,
        final Throwable cause) {
        
        super(message, cause);
        faultInfo = fault;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.legstar.test.cixs.redsimpt.RedsimptFaultInfo
     */
    public RedsimptFaultInfo getFaultInfo() {
        return faultInfo;
    }

}
