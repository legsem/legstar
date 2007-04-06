
package com.legstar.test.cixs.typesmix;
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
 * 2007-04-06T12:06:28.593+02:00
 */

@WebService(name = "typesmixPort",
            targetNamespace = "http://cixs.test.legstar.com/typesmix")
public interface Typesmix {


    /**
     * Service operation typesmix.
     * 
     * @param request a JAXB object mapping the request
     * @param hostHeader a JAXB object mapping header parameters
     * @return a JAXB object mapping the reply
     * @throws TypesmixFault if method fails
     */
    @WebMethod
    @WebResult(name = "Response",
               targetNamespace = "http://cixs.test.legstar.com/typesmix")
    @RequestWrapper(localName = "TypesmixRequest",
               targetNamespace = "http://cixs.test.legstar.com/typesmix",
               className = "com.legstar.test.cixs.typesmix.TypesmixRequest")
    @ResponseWrapper(localName = "TypesmixResponse",
               targetNamespace = "http://cixs.test.legstar.com/typesmix",
               className = "com.legstar.test.cixs.typesmix.TypesmixResponse")
    com.legstar.test.coxb.typesmix.
    DfhcommareaType typesmix(
        @WebParam(name = "Request",
               targetNamespace = "http://cixs.test.legstar.com/typesmix")
        com.legstar.test.coxb.typesmix.
        DfhcommareaType request,
        @WebParam(name = "HostHeader", header = true, partName = "HostHeader",
                targetNamespace = "http://cixs.test.legstar.com/typesmix")
        TypesmixHostHeader hostHeader)
        throws TypesmixFault;

}

