
package com.legstar.test.cixs.redopera;
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
 * 2007-07-26T14:36:47.515+02:00
 */

@WebService(name = "redoperaPort",
            targetNamespace = "http://cixs.test.legstar.com/redopera")
public interface Redopera {


    /**
     * Service operation redopera.
     * 
     * @param request a JAXB object mapping the request
     * @param hostHeader a JAXB object mapping header parameters
     * @return a JAXB object mapping the reply
     * @throws RedoperaFault if method fails
     */
    @WebMethod
    @WebResult(name = "Response",
        targetNamespace = "http://cixs.test.legstar.com/redopera")
    @RequestWrapper(localName = "RedoperaRequest",
        targetNamespace = "http://cixs.test.legstar.com/redopera",
        className = "com.legstar.test.cixs.redopera.RedoperaRequest")
    @ResponseWrapper(localName = "RedoperaResponse",
        targetNamespace = "http://cixs.test.legstar.com/redopera",
        className = "com.legstar.test.cixs.redopera.RedoperaResponse")
    com.legstar.test.coxb.redopera.DfhcommareaType redopera(
        @WebParam(name = "Request",
               targetNamespace = "http://cixs.test.legstar.com/redopera")
        com.legstar.test.coxb.redopera.DfhcommareaType request,
        @WebParam(name = "HostHeader", header = true, partName = "HostHeader",
                targetNamespace = "http://cixs.test.legstar.com/redopera")
        RedoperaHostHeader hostHeader)
        throws RedoperaFault;

}

