package com.legstar.test.cixs.lsfileac;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * LegStar/Jaxws Component interface.
 * Each method maps to a CICS program. 
 * 
 * This class was generated by LegStar Mainframe Web Service adapter generator.
 */
@WebService(name = "lsfileacPort",
            targetNamespace = "http://cixs.test.legstar.com/lsfileac")
public interface Lsfileac {
  
    /**
     * LegStar operation lsfileac.
     * 
     * @param request a JAXB object mapping the request
     * @param hostHeader an object mapping header parameters
     * @return a JAXB object mapping the reply
     * @throws LsfileacException if method fails
     */
    @WebMethod(operationName = "lsfileac", action = "urn:lsfileac")
    @WebResult(name = "LsfileacResponseHolder",
        targetNamespace = "http://cixs.test.legstar.com/lsfileac")
    @RequestWrapper(localName = "LsfileacRequest",
        targetNamespace = "http://cixs.test.legstar.com/lsfileac",
        className = "com.legstar.test.cixs.lsfileac.LsfileacRequest")
    @ResponseWrapper(localName = "LsfileacResponse",
        targetNamespace = "http://cixs.test.legstar.com/lsfileac",
        className = "com.legstar.test.cixs.lsfileac.LsfileacResponse")
    LsfileacResponseHolder lsfileac(
        @WebParam(name = "LsfileacRequestHolder",
               targetNamespace = "http://cixs.test.legstar.com/lsfileac")
            LsfileacRequestHolder request,
        @WebParam(name = "LsfileacHostHeader", header = true, partName = "hostHeader",
                targetNamespace = "http://cixs.test.legstar.com/lsfileac")
            LsfileacHostHeader hostHeader)
        throws LsfileacException;
        
}
