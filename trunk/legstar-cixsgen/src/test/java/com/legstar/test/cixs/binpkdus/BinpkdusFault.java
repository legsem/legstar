
package com.legstar.test.cixs.binpkdus;
import javax.xml.ws.WebFault;

/**
 * Fault element used as return message when an exception occurs.
 * 
 * This class was generated by CIXS generator.
 * 2007-04-06T16:14:38.718+02:00
 */

@WebFault(name = "BinpkdusFaultInfo",
          targetNamespace = "http://cixs.test.legstar.com/binpkdus")
public class BinpkdusFault
    extends Exception {

    /** Default serialVersionUID.  */
	private static final long serialVersionUID = 1L;
	
    /** Java type that goes as soapenv:Fault detail element. */
    private BinpkdusFaultInfo faultInfo;

    /**
     * Constructor for Web Fault.
     * @param fault error details
     * @param message error summary
     */
    public BinpkdusFault(
    	final String message,
    	final BinpkdusFaultInfo fault) {
    	
        super(message);
        this.faultInfo = fault;
    }

    /**
     * Constructor for Web Fault with cause.
     * @param fault error details
     * @param message error summary
     * @param cause the cause
     */
    public BinpkdusFault(
        final String message,
        final BinpkdusFaultInfo fault,
        final Throwable cause) {
        
        super(message, cause);
        this.faultInfo = fault;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.legstar.test.cixs.binpkdus.BinpkdusFaultInfo
     */
    public final BinpkdusFaultInfo getFaultInfo() {
        return faultInfo;
    }

}
