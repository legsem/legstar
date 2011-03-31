
package com.legstar.test.cixs.redinout;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.3-b02-
 * Generated source version: 2.1
 * 
 */
@WebFault(name = "RedinoutFaultInfo", targetNamespace = "http://cixs.test.legstar.com/redinout")
public class RedinoutFault
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private RedinoutFaultInfo faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public RedinoutFault(String message, RedinoutFaultInfo faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public RedinoutFault(String message, RedinoutFaultInfo faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.legstar.test.cixs.redinout.RedinoutFaultInfo
     */
    public RedinoutFaultInfo getFaultInfo() {
        return faultInfo;
    }

}
