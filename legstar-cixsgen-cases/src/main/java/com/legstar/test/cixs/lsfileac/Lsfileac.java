
package com.legstar.test.cixs.lsfileac;
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
 * 2007-07-26T14:36:57.343+02:00
 */

@WebService(name = "lsfileacPort",
            targetNamespace = "http://cixs.test.legstar.com/lsfileac")
public interface Lsfileac {


    /**
     * Service operation lsfileac.
     * 
     * @param request a JAXB object mapping the request
     * @param hostHeader a JAXB object mapping header parameters
     * @return a JAXB object mapping the reply
     * @throws LsfileacFault if method fails
     */
    @WebMethod
    @WebResult(name = "Response",
        targetNamespace = "http://cixs.test.legstar.com/lsfileac")
    @RequestWrapper(localName = "LsfileacRequest",
        targetNamespace = "http://cixs.test.legstar.com/lsfileac",
        className = "com.legstar.test.cixs.lsfileac.LsfileacRequest")
    @ResponseWrapper(localName = "LsfileacResponse",
        targetNamespace = "http://cixs.test.legstar.com/lsfileac",
        className = "com.legstar.test.cixs.lsfileac.LsfileacResponse")
    LsfileacResponseHolder lsfileac(
        @WebParam(name = "Request",
               targetNamespace = "http://cixs.test.legstar.com/lsfileac")
        LsfileacRequestHolder request,
        @WebParam(name = "HostHeader", header = true, partName = "HostHeader",
                targetNamespace = "http://cixs.test.legstar.com/lsfileac")
        LsfileacHostHeader hostHeader)
        throws LsfileacFault;

}

