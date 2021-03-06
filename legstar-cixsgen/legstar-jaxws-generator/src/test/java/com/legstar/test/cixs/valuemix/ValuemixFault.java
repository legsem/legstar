package com.legstar.test.cixs.valuemix;
import javax.xml.ws.WebFault;

/**
 * LegStar/Jaxws Operation fault.
 * Fault element used as return message when an exception occurs.
 * 
 * This class was generated by LegStar Mainframe Web Service adapter generator.
 */
@WebFault(name = "ValuemixFaultInfo",
          targetNamespace = "http://cixs.test.legstar.com/valuemix")
public class ValuemixFault
    extends Exception {

    /** Default serialVersionUID.  */
    private static final long serialVersionUID = 1L;

    /** Java type that goes as soapenv:Fault detail element. */
    private ValuemixFaultInfo faultInfo;

    /**
     * Constructor for Web Fault.
     * @param fault error details
     * @param message error summary
     */
    public ValuemixFault(
        final String message,
        final ValuemixFaultInfo fault) {
      
        super(message);
        faultInfo = fault;
    }

    /**
     * Constructor for Web Fault with cause.
     * @param fault error details
     * @param message error summary
     * @param cause the cause
     */
    public ValuemixFault(
        final String message,
        final ValuemixFaultInfo fault,
        final Throwable cause) {
        
        super(message, cause);
        faultInfo = fault;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.legstar.test.cixs.valuemix.ValuemixFaultInfo
     */
    public ValuemixFaultInfo getFaultInfo() {
        return faultInfo;
    }

}

