
package com.legstar.test.cixs.dplarcht;

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
@WebServiceClient(name = "dplarchtService", targetNamespace = "http://cixs.test.legstar.com/dplarcht", wsdlLocation = "http://localhost:8080/cixs-dplarcht/dplarcht?wsdl")
public class DplarchtService
    extends Service
{

    private final static URL DPLARCHTSERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(com.legstar.test.cixs.dplarcht.DplarchtService.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = com.legstar.test.cixs.dplarcht.DplarchtService.class.getResource(".");
            url = new URL(baseUrl, "http://localhost:8080/cixs-dplarcht/dplarcht?wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://localhost:8080/cixs-dplarcht/dplarcht?wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        DPLARCHTSERVICE_WSDL_LOCATION = url;
    }

    public DplarchtService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public DplarchtService() {
        super(DPLARCHTSERVICE_WSDL_LOCATION, new QName("http://cixs.test.legstar.com/dplarcht", "dplarchtService"));
    }

    /**
     * 
     * @return
     *     returns DplarchtPort
     */
    @WebEndpoint(name = "dplarchtPort")
    public DplarchtPort getDplarchtPort() {
        return super.getPort(new QName("http://cixs.test.legstar.com/dplarcht", "dplarchtPort"), DplarchtPort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns DplarchtPort
     */
    @WebEndpoint(name = "dplarchtPort")
    public DplarchtPort getDplarchtPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://cixs.test.legstar.com/dplarcht", "dplarchtPort"), DplarchtPort.class, features);
    }

}
