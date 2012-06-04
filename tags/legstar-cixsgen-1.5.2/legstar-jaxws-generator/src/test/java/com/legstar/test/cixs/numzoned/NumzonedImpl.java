package com.legstar.test.cixs.numzoned;
import java.rmi.server.UID;
import javax.jws.WebService;

import com.legstar.coxb.transform.HostTransformException;
import com.legstar.host.invoke.AbstractServiceAdapter;
import com.legstar.host.invoke.HostInvokerException;
import com.legstar.messaging.LegStarAddress;
import com.legstar.test.coxb.numzoned.Dfhcommarea;

/**
 * JAX-WS Service Adapter implementation.
 * Each method maps to a CICS program. 
 * 
 * This class was generated by LegStar Mainframe Web Service adapter generator.
 */
@WebService(endpointInterface = "com.legstar.test.cixs.numzoned.Numzoned",
            serviceName = "numzonedService",
            portName = "numzonedPort",
            targetNamespace = "http://cixs.test.legstar.com/numzoned")
public class NumzonedImpl extends AbstractServiceAdapter implements Numzoned {

    /** Name of this service adapter implementation. */
    private static final String  SERVICE_ADAPTER_NAME = "numzoned";

    /** Invoker implementation for operation numzoned. */
    private NumzonedProgramInvoker mNumzonedProgramInvoker;

    /** Contructor creates a set of operation invokers. */
    public NumzonedImpl() {
        super(SERVICE_ADAPTER_NAME);
        mNumzonedProgramInvoker = new NumzonedProgramInvoker(getConfigFileName());
    }
    
    /** {@inheritDoc} */
    public Dfhcommarea numzoned(
               final Dfhcommarea request,
               final NumzonedHostHeader hostHeader)
               throws NumzonedFault {
    
        try {
            return getNumzonedProgramInvoker().numzoned(
                    getAddress(hostHeader), getRequestID(hostHeader), request);
        } catch (HostInvokerException e) {
            throw getNumzonedFault(e, "Failed to invoke host program:");
        } catch (HostTransformException e) {
            throw getNumzonedFault(e, "Failed to transform data:");
        }
    }

    /**
     * Formats a fault element to notify client of an exception.
     *
     * @param e the exception which occurred
     * @param text short message describing the context
     * @return the fault exception
     */
    public NumzonedFault getNumzonedFault(
            final Exception e, final String text) {

        NumzonedFaultInfo faultInfo = new NumzonedFaultInfo();
        faultInfo.setMessage(e.getMessage());
        faultInfo.setDetail(getNumzonedProgramInvoker().toString());
        return new NumzonedFault(text + ' ' 
                + faultInfo.getMessage(), faultInfo, e);
    }

        
    /**
     * Extracts header data from SOAP header and create a host address.
     * @param hostHeader the java object mapping the SOAP header element
     * @return the new host address
     */
    public LegStarAddress getAddress(
            final NumzonedHostHeader hostHeader) {
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
    public String getRequestID(final NumzonedHostHeader hostHeader) {
        if (hostHeader != null && hostHeader.getHostRequestID() != null) {
            return hostHeader.getHostRequestID();
        } else {
            return getServiceAdapterName() + ":" + new UID().toString();
        }
    }

    /**
     * @return the invoker implementation for operation numzoned
     */
    public NumzonedProgramInvoker getNumzonedProgramInvoker() {
        return mNumzonedProgramInvoker;
    }

    /**
     * @param programInvoker the invoker implementation for operation numzoned to set
     */
    public void setNumzonedProgramInvoker(
            final NumzonedProgramInvoker programInvoker) {
        mNumzonedProgramInvoker = programInvoker;
    }
    
}
