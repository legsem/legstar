
package com.legstar.test.cixs.binnatus;
import javax.xml.ws.WebFault;

/**
 * Fault element used as return message when an exception occurs.
 * 
 * This class was generated by CIXS version 1.0.
 * 2007-02-06T14:30:37.203+01:00
 */

@WebFault(name = "BinnatusFaultInfo",
          targetNamespace = "http://cixs.test.legstar.com/binnatus")
public class BinnatusFault
    extends Exception {

    /** Default serialVersionUID.  */
	private static final long serialVersionUID = 1L;
	
    /** Java type that goes as soapenv:Fault detail element. */
    private BinnatusFaultInfo faultInfo;

    /**
     * Constructor for Web Fault.
     * @param fault error details
     * @param message error summary
     */
    public BinnatusFault(
    	final String message,
    	final BinnatusFaultInfo fault) {
    	
        super(message);
        this.faultInfo = fault;
    }

    /**
     * Constructor for Web Fault with cause.
     * @param fault error details
     * @param message error summary
     * @param cause the cause
     */
    public BinnatusFault(
        final String message,
        final BinnatusFaultInfo fault,
        final Throwable cause) {
        
        super(message, cause);
        this.faultInfo = fault;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.legstar.test.cixs.binnatus.BinnatusFaultInfo
     */
    public final BinnatusFaultInfo getFaultInfo() {
        return faultInfo;
    }

}