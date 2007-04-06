
package com.legstar.test.cixs.redmulti;
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
 * 2007-04-06T12:06:24.359+02:00
 */

@WebService(name = "redmultiPort",
            targetNamespace = "http://cixs.test.legstar.com/redmulti")
public interface Redmulti {


    /**
     * Service operation redmulti.
     * 
     * @param request a JAXB object mapping the request
     * @param hostHeader a JAXB object mapping header parameters
     * @return a JAXB object mapping the reply
     * @throws RedmultiFault if method fails
     */
    @WebMethod
    @WebResult(name = "Response",
               targetNamespace = "http://cixs.test.legstar.com/redmulti")
    @RequestWrapper(localName = "RedmultiRequest",
               targetNamespace = "http://cixs.test.legstar.com/redmulti",
               className = "com.legstar.test.cixs.redmulti.RedmultiRequest")
    @ResponseWrapper(localName = "RedmultiResponse",
               targetNamespace = "http://cixs.test.legstar.com/redmulti",
               className = "com.legstar.test.cixs.redmulti.RedmultiResponse")
    com.legstar.test.coxb.redmulti.
    DfhcommareaType redmulti(
        @WebParam(name = "Request",
               targetNamespace = "http://cixs.test.legstar.com/redmulti")
        com.legstar.test.coxb.redmulti.
        DfhcommareaType request,
        @WebParam(name = "HostHeader", header = true, partName = "HostHeader",
                targetNamespace = "http://cixs.test.legstar.com/redmulti")
        RedmultiHostHeader hostHeader)
        throws RedmultiFault;

}

