package com.legstar.test.cixs.valuemix;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import com.legstar.test.coxb.valuemix.Dfhcommarea;
/**
 * LegStar/Jaxws Component interface.
 * Each method maps to a CICS program. 
 * 
 * This class was generated by LegStar Mainframe Web Service adapter generator.
 */
@WebService(name = "valuemixPort",
            targetNamespace = "http://cixs.test.legstar.com/valuemix")
public interface Valuemix {
  
    /**
     * LegStar operation valuemix.
     * 
     * @param request a JAXB object mapping the request
     * @param hostHeader an object mapping header parameters
     * @return a JAXB object mapping the reply
     * @throws ValuemixFault if method fails
     */
    @WebMethod(operationName = "valuemix", action = "urn:valuemix")
    @WebResult(name = "Dfhcommarea",
        targetNamespace = "http://legstar.com/test/coxb/valuemix")
    @RequestWrapper(localName = "ValuemixRequest",
        targetNamespace = "http://cixs.test.legstar.com/valuemix",
        className = "com.legstar.test.cixs.valuemix.ValuemixRequest")
    @ResponseWrapper(localName = "ValuemixResponse",
        targetNamespace = "http://cixs.test.legstar.com/valuemix",
        className = "com.legstar.test.cixs.valuemix.ValuemixResponse")
    Dfhcommarea valuemix(
        @WebParam(name = "Dfhcommarea",
               targetNamespace = "http://legstar.com/test/coxb/valuemix")
            Dfhcommarea request,
        @WebParam(name = "ValuemixHostHeader", header = true, partName = "hostHeader",
                targetNamespace = "http://cixs.test.legstar.com/valuemix")
            ValuemixHostHeader hostHeader)
        throws ValuemixFault;
        
}
