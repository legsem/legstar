
package com.legstar.test.cixs.fixarnum;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.3-b02-
 * Generated source version: 2.1
 * 
 */
@WebService(name = "fixarnumPort", targetNamespace = "http://cixs.test.legstar.com/fixarnum")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    com.legstar.test.coxb.fixarnum.ObjectFactory.class,
    com.legstar.test.cixs.fixarnum.ObjectFactory.class
})
public interface FixarnumPort {


    /**
     * 
     * @param hostHeader
     * @param parameters
     * @return
     *     returns com.legstar.test.cixs.fixarnum.FixarnumResponse
     * @throws FixarnumFault
     */
    @WebMethod(action = "urn:fixarnum")
    @WebResult(name = "FixarnumResponse", targetNamespace = "http://cixs.test.legstar.com/fixarnum", partName = "result")
    public FixarnumResponse fixarnum(
        @WebParam(name = "FixarnumRequest", targetNamespace = "http://cixs.test.legstar.com/fixarnum", partName = "parameters")
        FixarnumRequest parameters,
        @WebParam(name = "FixarnumHostHeader", targetNamespace = "http://cixs.test.legstar.com/fixarnum", header = true, partName = "hostHeader")
        FixarnumHostHeader hostHeader)
        throws FixarnumFault
    ;

}
