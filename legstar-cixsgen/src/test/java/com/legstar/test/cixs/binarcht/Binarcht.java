
package com.legstar.test.cixs.binarcht;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * Web service endpoint interface.
 * 
 * This class was generated by CIXS generator.
 * 2007-04-06T12:06:03.015+02:00
 */

@WebService(name = "binarchtPort",
            targetNamespace = "http://cixs.test.legstar.com/binarcht")
public interface Binarcht {


    /**
     * Service operation binarcht.
     * 
     * @param request a JAXB object mapping the request
     * @param hostHeader a JAXB object mapping header parameters
     * @return a JAXB object mapping the reply
     * @throws BinarchtFault if method fails
     */
    @WebMethod
    @WebResult(name = "Response",
               targetNamespace = "http://cixs.test.legstar.com/binarcht")
    @RequestWrapper(localName = "BinarchtRequest",
               targetNamespace = "http://cixs.test.legstar.com/binarcht",
               className = "com.legstar.test.cixs.binarcht.BinarchtRequest")
    @ResponseWrapper(localName = "BinarchtResponse",
               targetNamespace = "http://cixs.test.legstar.com/binarcht",
               className = "com.legstar.test.cixs.binarcht.BinarchtResponse")
    com.legstar.test.coxb.binarcht.
    DfhcommareaType binarcht(
        @WebParam(name = "Request",
               targetNamespace = "http://cixs.test.legstar.com/binarcht")
        com.legstar.test.coxb.binarcht.
        DfhcommareaType request,
        @WebParam(name = "HostHeader", header = true, partName = "HostHeader",
                targetNamespace = "http://cixs.test.legstar.com/binarcht")
        BinarchtHostHeader hostHeader)
        throws BinarchtFault;

}

