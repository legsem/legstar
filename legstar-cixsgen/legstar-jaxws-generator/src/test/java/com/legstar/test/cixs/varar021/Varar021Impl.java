package com.legstar.test.cixs.varar021;
import java.rmi.server.UID;
import javax.jws.WebService;

import com.legstar.coxb.transform.HostTransformException;
import com.legstar.host.invoke.AbstractServiceAdapter;
import com.legstar.host.invoke.HostInvokerException;
import com.legstar.messaging.LegStarAddress;
import com.legstar.test.coxb.varar021.SearchGrplst;

/**
 * JAX-WS Service Adapter implementation.
 * Each method maps to a CICS program. 
 * 
 * This class was generated by LegStar Mainframe Web Service adapter generator.
 */
@WebService(endpointInterface = "com.legstar.test.cixs.varar021.Varar021",
            serviceName = "varar021Service",
            portName = "varar021Port",
            targetNamespace = "http://cixs.test.legstar.com/varar021")
public class Varar021Impl extends AbstractServiceAdapter implements Varar021 {

    /** Name of this service adapter implementation. */
    private static final String  SERVICE_ADAPTER_NAME = "varar021";

    /** Invoker implementation for operation varar021. */
    private Varar021ProgramInvoker mVarar021ProgramInvoker;

    /** Contructor creates a set of operation invokers. */
    public Varar021Impl() {
        super(SERVICE_ADAPTER_NAME);
        mVarar021ProgramInvoker = new Varar021ProgramInvoker(getConfigFileName());
    }
    
    /** {@inheritDoc} */
    public SearchGrplst varar021(
               final SearchGrplst request,
               final Varar021HostHeader hostHeader)
               throws Varar021Fault {
    
        try {
            return getVarar021ProgramInvoker().varar021(
                    getAddress(hostHeader), getRequestID(hostHeader), request);
        } catch (HostInvokerException e) {
            throw getVarar021Fault(e, "Failed to invoke host program:");
        } catch (HostTransformException e) {
            throw getVarar021Fault(e, "Failed to transform data:");
        }
    }

    /**
     * Formats a fault element to notify client of an exception.
     *
     * @param e the exception which occurred
     * @param text short message describing the context
     * @return the fault exception
     */
    public Varar021Fault getVarar021Fault(
            final Exception e, final String text) {

        Varar021FaultInfo faultInfo = new Varar021FaultInfo();
        faultInfo.setMessage(e.getMessage());
        faultInfo.setDetail(getVarar021ProgramInvoker().toString());
        return new Varar021Fault(text + ' ' 
                + faultInfo.getMessage(), faultInfo, e);
    }

        
    /**
     * Extracts header data from SOAP header and create a host address.
     * @param hostHeader the java object mapping the SOAP header element
     * @return the new host address
     */
    public LegStarAddress getAddress(
            final Varar021HostHeader hostHeader) {
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
    public String getRequestID(final Varar021HostHeader hostHeader) {
        if (hostHeader != null && hostHeader.getHostRequestID() != null) {
            return hostHeader.getHostRequestID();
        } else {
            return getServiceAdapterName() + ":" + new UID().toString();
        }
    }

    /**
     * @return the invoker implementation for operation varar021
     */
    public Varar021ProgramInvoker getVarar021ProgramInvoker() {
        return mVarar021ProgramInvoker;
    }

    /**
     * @param programInvoker the invoker implementation for operation varar021 to set
     */
    public void setVarar021ProgramInvoker(
            final Varar021ProgramInvoker programInvoker) {
        mVarar021ProgramInvoker = programInvoker;
    }
    
}
