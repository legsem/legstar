
package com.legstar.test.cixs.numzoned;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.3-b02-
 * Generated source version: 2.1
 * 
 */
@WebFault(name = "NumzonedFaultInfo", targetNamespace = "http://cixs.test.legstar.com/numzoned")
public class NumzonedFault
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private NumzonedFaultInfo faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public NumzonedFault(String message, NumzonedFaultInfo faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public NumzonedFault(String message, NumzonedFaultInfo faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: com.legstar.test.cixs.numzoned.NumzonedFaultInfo
     */
    public NumzonedFaultInfo getFaultInfo() {
        return faultInfo;
    }

}