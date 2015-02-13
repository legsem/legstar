package com.legstar.test.cixs.fixarnum;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import com.legstar.test.coxb.fixarnum.Dfhcommarea;
/**
 * LegStar/Jaxws Component interface.
 * Each method maps to a CICS program. 
 * 
 * This class was generated by LegStar Mainframe Web Service adapter generator.
 */
@WebService(name = "fixarnumPort",
            targetNamespace = "http://cixs.test.legstar.com/fixarnum")
public interface Fixarnum {
  
    /**
     * LegStar operation fixarnum.
     * 
     * @param request a JAXB object mapping the request
     * @param hostHeader an object mapping header parameters
     * @return a JAXB object mapping the reply
     * @throws FixarnumFault if method fails
     */
    @WebMethod(operationName = "fixarnum", action = "urn:fixarnum")
    @WebResult(name = "Dfhcommarea",
        targetNamespace = "http://legstar.com/test/coxb/fixarnum")
    @RequestWrapper(localName = "FixarnumRequest",
        targetNamespace = "http://cixs.test.legstar.com/fixarnum",
        className = "com.legstar.test.cixs.fixarnum.FixarnumRequest")
    @ResponseWrapper(localName = "FixarnumResponse",
        targetNamespace = "http://cixs.test.legstar.com/fixarnum",
        className = "com.legstar.test.cixs.fixarnum.FixarnumResponse")
    Dfhcommarea fixarnum(
        @WebParam(name = "Dfhcommarea",
               targetNamespace = "http://legstar.com/test/coxb/fixarnum")
            Dfhcommarea request,
        @WebParam(name = "FixarnumHostHeader", header = true, partName = "hostHeader",
                targetNamespace = "http://cixs.test.legstar.com/fixarnum")
            FixarnumHostHeader hostHeader)
        throws FixarnumFault;
        
}