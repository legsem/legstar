package com.legstar.test.cixs.binnatus;
import java.rmi.server.UID;
import javax.jws.WebService;

import com.legstar.coxb.transform.HostTransformException;
import com.legstar.host.invoke.AbstractServiceAdapter;
import com.legstar.host.invoke.HostInvokerException;
import com.legstar.messaging.LegStarAddress;
import com.legstar.test.coxb.binnatus.Dfhcommarea;

/**
 * JAX-WS Service Adapter implementation.
 * Each method maps to a CICS program. 
 * 
 * This class was generated by LegStar Mainframe Web Service adapter generator.
 */
@WebService(endpointInterface = "com.legstar.test.cixs.binnatus.Binnatus",
            serviceName = "binnatusService",
            portName = "binnatusPort",
            targetNamespace = "http://cixs.test.legstar.com/binnatus")
public class BinnatusImpl extends AbstractServiceAdapter implements Binnatus {

    /** Name of this service adapter implementation. */
    private static final String  SERVICE_ADAPTER_NAME = "binnatus";

    /** Invoker implementation for operation binnatus. */
    private BinnatusProgramInvoker mBinnatusProgramInvoker;

    /** Contructor creates a set of operation invokers. */
    public BinnatusImpl() {
        super(SERVICE_ADAPTER_NAME);
        mBinnatusProgramInvoker = new BinnatusProgramInvoker(getConfigFileName());
    }
    
    /** {@inheritDoc} */
    public Dfhcommarea binnatus(
               final Dfhcommarea request,
               final BinnatusHostHeader hostHeader)
               throws BinnatusFault {
    
        try {
            return getBinnatusProgramInvoker().binnatus(
                    getAddress(hostHeader), getRequestID(hostHeader), request);
        } catch (HostInvokerException e) {
            throw getBinnatusFault(e, "Failed to invoke host program:");
        } catch (HostTransformException e) {
            throw getBinnatusFault(e, "Failed to transform data:");
        }
    }

    /**
     * Formats a fault element to notify client of an exception.
     *
     * @param e the exception which occurred
     * @param text short message describing the context
     * @return the fault exception
     */
    public BinnatusFault getBinnatusFault(
            final Exception e, final String text) {

        BinnatusFaultInfo faultInfo = new BinnatusFaultInfo();
        faultInfo.setMessage(e.getMessage());
        faultInfo.setDetail(getBinnatusProgramInvoker().toString());
        return new BinnatusFault(text + ' ' 
                + faultInfo.getMessage(), faultInfo, e);
    }

        
    /**
     * Extracts header data from SOAP header and create a host address.
     * @param hostHeader the java object mapping the SOAP header element
     * @return the new host address
     */
    public LegStarAddress getAddress(
            final BinnatusHostHeader hostHeader) {
        if (hostHeader == null) {
            return null;
        }
        LegStarAddress address = new LegStarAddress(hostHeader.getHostEndPoint());
        address.setHostCharset(hostHeader.getHostCharset());
        address.setHostUserID(hostHeader.getHostUserID());
        address.setHostPassword(hostHeader.getHostPassword());
        address.setHostTraceMode(hostHeader.getHostTraceMode());
        return address;
    }

    /**
     * Generates a unique ID for a request. This can be passed from the client
     * using the host header.
     * @param hostHeader the java object mapping the SOAP header element
     * @return  a unique request ID
     */
    public String getRequestID(final BinnatusHostHeader hostHeader) {
        if (hostHeader != null && hostHeader.getHostRequestID() != null) {
            return hostHeader.getHostRequestID();
        } else {
            return getServiceAdapterName() + ":" + new UID().toString();
        }
    }

    /**
     * @return the invoker implementation for operation binnatus
     */
    public BinnatusProgramInvoker getBinnatusProgramInvoker() {
        return mBinnatusProgramInvoker;
    }

    /**
     * @param programInvoker the invoker implementation for operation binnatus to set
     */
    public void setBinnatusProgramInvoker(
            final BinnatusProgramInvoker programInvoker) {
        mBinnatusProgramInvoker = programInvoker;
    }
    
}
