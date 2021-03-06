package com.legstar.test.cixs.lsfilead;
import java.rmi.server.UID;
import javax.jws.WebService;

import com.legstar.coxb.transform.HostTransformException;
import com.legstar.host.invoke.AbstractServiceAdapter;
import com.legstar.host.invoke.HostInvokerException;
import com.legstar.messaging.LegStarAddress;
import com.legstar.test.coxb.lsfilead.Dfhcommarea;

/**
 * JAX-WS Service Adapter implementation.
 * Each method maps to a CICS program. 
 * 
 * This class was generated by LegStar Mainframe Web Service adapter generator.
 */
@WebService(endpointInterface = "com.legstar.test.cixs.lsfilead.Lsfilead",
            serviceName = "lsfileadService",
            portName = "lsfileadPort",
            targetNamespace = "http://cixs.test.legstar.com/lsfilead")
public class LsfileadImpl extends AbstractServiceAdapter implements Lsfilead {

    /** Name of this service adapter implementation. */
    private static final String  SERVICE_ADAPTER_NAME = "lsfilead";

    /** Invoker implementation for operation lsfilead. */
    private LsfileadProgramInvoker mLsfileadProgramInvoker;

    /** Contructor creates a set of operation invokers. */
    public LsfileadImpl() {
        super(SERVICE_ADAPTER_NAME);
        mLsfileadProgramInvoker = new LsfileadProgramInvoker(getConfigFileName());
    }
    
    /** {@inheritDoc} */
    public Dfhcommarea lsfilead(
               final Dfhcommarea request,
               final LsfileadHostHeader hostHeader)
               throws LsfileadFault {
    
        try {
            return getLsfileadProgramInvoker().lsfilead(
                    getAddress(hostHeader), getRequestID(hostHeader), request);
        } catch (HostInvokerException e) {
            throw getLsfileadFault(e, "Failed to invoke host program:");
        } catch (HostTransformException e) {
            throw getLsfileadFault(e, "Failed to transform data:");
        }
    }

    /**
     * Formats a fault element to notify client of an exception.
     *
     * @param e the exception which occurred
     * @param text short message describing the context
     * @return the fault exception
     */
    public LsfileadFault getLsfileadFault(
            final Exception e, final String text) {

        LsfileadFaultInfo faultInfo = new LsfileadFaultInfo();
        faultInfo.setMessage(e.getMessage());
        faultInfo.setDetail(getLsfileadProgramInvoker().toString());
        return new LsfileadFault(text + ' ' 
                + faultInfo.getMessage(), faultInfo, e);
    }

        
    /**
     * Extracts header data from SOAP header and create a host address.
     * @param hostHeader the java object mapping the SOAP header element
     * @return the new host address
     */
    public LegStarAddress getAddress(
            final LsfileadHostHeader hostHeader) {
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
    public String getRequestID(final LsfileadHostHeader hostHeader) {
        if (hostHeader != null && hostHeader.getHostRequestID() != null) {
            return hostHeader.getHostRequestID();
        } else {
            return getServiceAdapterName() + ":" + new UID().toString();
        }
    }

    /**
     * @return the invoker implementation for operation lsfilead
     */
    public LsfileadProgramInvoker getLsfileadProgramInvoker() {
        return mLsfileadProgramInvoker;
    }

    /**
     * @param programInvoker the invoker implementation for operation lsfilead to set
     */
    public void setLsfileadProgramInvoker(
            final LsfileadProgramInvoker programInvoker) {
        mLsfileadProgramInvoker = programInvoker;
    }
    
}
