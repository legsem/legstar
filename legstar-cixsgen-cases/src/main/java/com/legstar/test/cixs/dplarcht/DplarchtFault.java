
package com.legstar.test.cixs.dplarcht;
import javax.xml.ws.WebFault;

/**
 * Fault element used as return message when an exception occurs.
 * 
 * This class was generated by CIXS generator.
 * 2007-07-26T14:36:28.187+02:00
 */

@WebFault(name = "DplarchtFaultInfo",
          targetNamespace = "http://cixs.test.legstar.com/dplarcht")
public class DplarchtFault
    extends Exception {

    /** Default serialVersionUID.  */
	private static final long serialVersionUID = 1L;
	
    /** Java type that goes as soapenv:Fault detail element. */
    private DplarchtFaultInfo faultInfo;

    /**
     * Constructor for Web Fault.
     * @param fault error details
     * @param message error summary
     */
    public DplarchtFault(
    	final String message,
    	final DplarchtFaultInfo fault) {
    	
        super(message);
        this.faultInfo = fault;
    }

    /**
     * Constructor for Web Fault with cause.
     * @param fault error details
     * @param message error summary
     * @param cause the cause
     */
    public DplarchtFault(
        final String message,
        final DplarchtFaultInfo fault,
        final Throwable cause) {
        
        super(message, cause);
        this.faultInfo = fault;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.legstar.test.cixs.dplarcht.DplarchtFaultInfo
     */
    public final DplarchtFaultInfo getFaultInfo() {
        return faultInfo;
    }

}
