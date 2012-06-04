
package com.legstar.test.cixs.arrayscx;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.3-b02-
 * Generated source version: 2.1
 * 
 */
@WebFault(name = "ArrayscxFaultInfo", targetNamespace = "http://cixs.test.legstar.com/arrayscx")
public class ArrayscxFault
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private ArrayscxFaultInfo faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public ArrayscxFault(String message, ArrayscxFaultInfo faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public ArrayscxFault(String message, ArrayscxFaultInfo faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.legstar.test.cixs.arrayscx.ArrayscxFaultInfo
     */
    public ArrayscxFaultInfo getFaultInfo() {
        return faultInfo;
    }

}
