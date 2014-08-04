
package com.legstar.test.cixs.arrayssm;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.3-b02-
 * Generated source version: 2.1
 * 
 */
@WebFault(name = "ArrayssmFaultInfo", targetNamespace = "http://cixs.test.legstar.com/arrayssm")
public class ArrayssmFault
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private ArrayssmFaultInfo faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public ArrayssmFault(String message, ArrayssmFaultInfo faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public ArrayssmFault(String message, ArrayssmFaultInfo faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.legstar.test.cixs.arrayssm.ArrayssmFaultInfo
     */
    public ArrayssmFaultInfo getFaultInfo() {
        return faultInfo;
    }

}