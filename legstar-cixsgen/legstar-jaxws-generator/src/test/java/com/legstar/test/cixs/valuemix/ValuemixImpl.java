package com.legstar.test.cixs.valuemix;
import java.rmi.server.UID;
import javax.jws.WebService;

import com.legstar.coxb.transform.HostTransformException;
import com.legstar.host.invoke.AbstractServiceAdapter;
import com.legstar.host.invoke.HostInvokerException;
import com.legstar.messaging.LegStarAddress;
import com.legstar.test.coxb.valuemix.Dfhcommarea;

/**
 * JAX-WS Service Adapter implementation.
 * Each method maps to a CICS program. 
 * 
 * This class was generated by LegStar Mainframe Web Service adapter generator.
 */
@WebService(endpointInterface = "com.legstar.test.cixs.valuemix.Valuemix",
            serviceName = "valuemixService",
            portName = "valuemixPort",
            targetNamespace = "http://cixs.test.legstar.com/valuemix")
public class ValuemixImpl extends AbstractServiceAdapter implements Valuemix {

    /** Name of this service adapter implementation. */
    private static final String  SERVICE_ADAPTER_NAME = "valuemix";

    /** Invoker implementation for operation valuemix. */
    private ValuemixProgramInvoker mValuemixProgramInvoker;

    /** Contructor creates a set of operation invokers. */
    public ValuemixImpl() {
        super(SERVICE_ADAPTER_NAME);
        mValuemixProgramInvoker = new ValuemixProgramInvoker(getConfigFileName());
    }
    
    /** {@inheritDoc} */
    public Dfhcommarea valuemix(
               final Dfhcommarea request,
               final ValuemixHostHeader hostHeader)
               throws ValuemixFault {
    
        try {
            return getValuemixProgramInvoker().valuemix(
                    getAddress(hostHeader), getRequestID(hostHeader), request);
        } catch (HostInvokerException e) {
            throw getValuemixFault(e, "Failed to invoke host program:");
        } catch (HostTransformException e) {
            throw getValuemixFault(e, "Failed to transform data:");
        }
    }

    /**
     * Formats a fault element to notify client of an exception.
     *
     * @param e the exception which occurred
     * @param text short message describing the context
     * @return the fault exception
     */
    public ValuemixFault getValuemixFault(
            final Exception e, final String text) {

        ValuemixFaultInfo faultInfo = new ValuemixFaultInfo();
        faultInfo.setMessage(e.getMessage());
        faultInfo.setDetail(getValuemixProgramInvoker().toString());
        return new ValuemixFault(text + ' ' 
                + faultInfo.getMessage(), faultInfo, e);
    }

        
    /**
     * Extracts header data from SOAP header and create a host address.
     * @param hostHeader the java object mapping the SOAP header element
     * @return the new host address
     */
    public LegStarAddress getAddress(
            final ValuemixHostHeader hostHeader) {
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
    public String getRequestID(final ValuemixHostHeader hostHeader) {
        if (hostHeader != null && hostHeader.getHostRequestID() != null) {
            return hostHeader.getHostRequestID();
        } else {
            return getServiceAdapterName() + ":" + new UID().toString();
        }
    }

    /**
     * @return the invoker implementation for operation valuemix
     */
    public ValuemixProgramInvoker getValuemixProgramInvoker() {
        return mValuemixProgramInvoker;
    }

    /**
     * @param programInvoker the invoker implementation for operation valuemix to set
     */
    public void setValuemixProgramInvoker(
            final ValuemixProgramInvoker programInvoker) {
        mValuemixProgramInvoker = programInvoker;
    }
    
}
