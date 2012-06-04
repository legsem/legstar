
package com.legstar.test.cixs.lsfileac;

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
@WebServiceClient(name = "lsfileacService", targetNamespace = "http://cixs.test.legstar.com/lsfileac", wsdlLocation = "http://localhost:8080/cixs-lsfileac/lsfileac?wsdl")
public class LsfileacService
    extends Service
{

    private final static URL LSFILEACSERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(com.legstar.test.cixs.lsfileac.LsfileacService.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = com.legstar.test.cixs.lsfileac.LsfileacService.class.getResource(".");
            url = new URL(baseUrl, "http://localhost:8080/cixs-lsfileac/lsfileac?wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://localhost:8080/cixs-lsfileac/lsfileac?wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        LSFILEACSERVICE_WSDL_LOCATION = url;
    }

    public LsfileacService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public LsfileacService() {
        super(LSFILEACSERVICE_WSDL_LOCATION, new QName("http://cixs.test.legstar.com/lsfileac", "lsfileacService"));
    }

    /**
     * 
     * @return
     *     returns LsfileacPort
     */
    @WebEndpoint(name = "lsfileacPort")
    public LsfileacPort getLsfileacPort() {
        return super.getPort(new QName("http://cixs.test.legstar.com/lsfileac", "lsfileacPort"), LsfileacPort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns LsfileacPort
     */
    @WebEndpoint(name = "lsfileacPort")
    public LsfileacPort getLsfileacPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://cixs.test.legstar.com/lsfileac", "lsfileacPort"), LsfileacPort.class, features);
    }

}
