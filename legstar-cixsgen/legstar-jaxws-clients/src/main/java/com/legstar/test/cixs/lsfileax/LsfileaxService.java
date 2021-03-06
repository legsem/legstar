
package com.legstar.test.cixs.lsfileax;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.3-b02-
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "lsfileaxService", targetNamespace = "http://cixs.test.legstar.com/lsfileax", wsdlLocation = "http://localhost:8080/cixs-lsfileax/lsfileax?wsdl")
public class LsfileaxService
    extends Service
{

    private final static URL LSFILEAXSERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(com.legstar.test.cixs.lsfileax.LsfileaxService.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = com.legstar.test.cixs.lsfileax.LsfileaxService.class.getResource(".");
            url = new URL(baseUrl, "http://localhost:8080/cixs-lsfileax/lsfileax?wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://localhost:8080/cixs-lsfileax/lsfileax?wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        LSFILEAXSERVICE_WSDL_LOCATION = url;
    }

    public LsfileaxService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public LsfileaxService() {
        super(LSFILEAXSERVICE_WSDL_LOCATION, new QName("http://cixs.test.legstar.com/lsfileax", "lsfileaxService"));
    }

    /**
     * 
     * @return
     *     returns LsfileaxPort
     */
    @WebEndpoint(name = "lsfileaxPort")
    public LsfileaxPort getLsfileaxPort() {
        return super.getPort(new QName("http://cixs.test.legstar.com/lsfileax", "lsfileaxPort"), LsfileaxPort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns LsfileaxPort
     */
    @WebEndpoint(name = "lsfileaxPort")
    public LsfileaxPort getLsfileaxPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://cixs.test.legstar.com/lsfileax", "lsfileaxPort"), LsfileaxPort.class, features);
    }

}
