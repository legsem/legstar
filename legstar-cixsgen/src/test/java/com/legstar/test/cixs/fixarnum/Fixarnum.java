
package com.legstar.test.cixs.fixarnum;
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
 * 2007-04-06T16:14:45.765+02:00
 */

@WebService(name = "fixarnumPort",
            targetNamespace = "http://cixs.test.legstar.com/fixarnum")
public interface Fixarnum {


    /**
     * Service operation fixarnum.
     * 
     * @param request a JAXB object mapping the request
     * @param hostHeader a JAXB object mapping header parameters
     * @return a JAXB object mapping the reply
     * @throws FixarnumFault if method fails
     */
    @WebMethod
    @WebResult(name = "Response",
               targetNamespace = "http://cixs.test.legstar.com/fixarnum")
    @RequestWrapper(localName = "FixarnumRequest",
               targetNamespace = "http://cixs.test.legstar.com/fixarnum",
               className = "com.legstar.test.cixs.fixarnum.FixarnumRequest")
    @ResponseWrapper(localName = "FixarnumResponse",
               targetNamespace = "http://cixs.test.legstar.com/fixarnum",
               className = "com.legstar.test.cixs.fixarnum.FixarnumResponse")
    com.legstar.test.coxb.fixarnum.
    DfhcommareaType fixarnum(
        @WebParam(name = "Request",
               targetNamespace = "http://cixs.test.legstar.com/fixarnum")
        com.legstar.test.coxb.fixarnum.
        DfhcommareaType request,
        @WebParam(name = "HostHeader", header = true, partName = "HostHeader",
                targetNamespace = "http://cixs.test.legstar.com/fixarnum")
        FixarnumHostHeader hostHeader)
        throws FixarnumFault;

}

