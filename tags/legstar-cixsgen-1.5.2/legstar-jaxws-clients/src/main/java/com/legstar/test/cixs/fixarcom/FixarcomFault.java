
package com.legstar.test.cixs.fixarcom;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.3-b02-
 * Generated source version: 2.1
 * 
 */
@WebFault(name = "FixarcomFaultInfo", targetNamespace = "http://cixs.test.legstar.com/fixarcom")
public class FixarcomFault
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private FixarcomFaultInfo faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public FixarcomFault(String message, FixarcomFaultInfo faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public FixarcomFault(String message, FixarcomFaultInfo faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.legstar.test.cixs.fixarcom.FixarcomFaultInfo
     */
    public FixarcomFaultInfo getFaultInfo() {
        return faultInfo;
    }

}
