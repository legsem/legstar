
package com.legstar.test.cixs.redopera;

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
@WebServiceClient(name = "redoperaService", targetNamespace = "http://cixs.test.legstar.com/redopera", wsdlLocation = "http://localhost:8080/cixs-redopera/redopera?wsdl")
public class RedoperaService
    extends Service
{

    private final static URL REDOPERASERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(com.legstar.test.cixs.redopera.RedoperaService.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = com.legstar.test.cixs.redopera.RedoperaService.class.getResource(".");
            url = new URL(baseUrl, "http://localhost:8080/cixs-redopera/redopera?wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://localhost:8080/cixs-redopera/redopera?wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        REDOPERASERVICE_WSDL_LOCATION = url;
    }

    public RedoperaService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public RedoperaService() {
        super(REDOPERASERVICE_WSDL_LOCATION, new QName("http://cixs.test.legstar.com/redopera", "redoperaService"));
    }

    /**
     * 
     * @return
     *     returns RedoperaPort
     */
    @WebEndpoint(name = "redoperaPort")
    public RedoperaPort getRedoperaPort() {
        return super.getPort(new QName("http://cixs.test.legstar.com/redopera", "redoperaPort"), RedoperaPort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns RedoperaPort
     */
    @WebEndpoint(name = "redoperaPort")
    public RedoperaPort getRedoperaPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://cixs.test.legstar.com/redopera", "redoperaPort"), RedoperaPort.class, features);
    }

}
