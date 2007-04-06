
package com.legstar.test.cixs.alltypes;
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
 * 2007-04-06T16:15:18.953+02:00
 */

@WebService(name = "alltypesPort",
            targetNamespace = "http://cixs.test.legstar.com/alltypes")
public interface Alltypes {


    /**
     * Service operation alltypes.
     * 
     * @param request a JAXB object mapping the request
     * @param hostHeader a JAXB object mapping header parameters
     * @return a JAXB object mapping the reply
     * @throws AlltypesFault if method fails
     */
    @WebMethod
    @WebResult(name = "Response",
               targetNamespace = "http://cixs.test.legstar.com/alltypes")
    @RequestWrapper(localName = "AlltypesRequest",
               targetNamespace = "http://cixs.test.legstar.com/alltypes",
               className = "com.legstar.test.cixs.alltypes.AlltypesRequest")
    @ResponseWrapper(localName = "AlltypesResponse",
               targetNamespace = "http://cixs.test.legstar.com/alltypes",
               className = "com.legstar.test.cixs.alltypes.AlltypesResponse")
    com.legstar.test.coxb.alltypes.
    DfhcommareaType alltypes(
        @WebParam(name = "Request",
               targetNamespace = "http://cixs.test.legstar.com/alltypes")
        com.legstar.test.coxb.alltypes.
        DfhcommareaType request,
        @WebParam(name = "HostHeader", header = true, partName = "HostHeader",
                targetNamespace = "http://cixs.test.legstar.com/alltypes")
        AlltypesHostHeader hostHeader)
        throws AlltypesFault;

}

