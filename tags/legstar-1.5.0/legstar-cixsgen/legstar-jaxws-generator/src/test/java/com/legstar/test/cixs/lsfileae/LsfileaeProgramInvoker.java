package com.legstar.test.cixs.lsfileae;
import com.legstar.coxb.transform.HostTransformException;
import com.legstar.host.invoke.AbstractProgramInvoker;
import com.legstar.host.invoke.HostInvoker;
import com.legstar.host.invoke.HostInvokerException;
import com.legstar.messaging.LegStarAddress;
import com.legstar.test.coxb.lsfileae.Dfhcommarea;
import com.legstar.test.coxb.lsfileae.bind.DfhcommareaTransformers;

/**
 * Implements an invoker for program LSFILEAE.
 * <p/>
 * This host program maps to operation lsfileae.
 * 
 * This class was generated by LegStar Mainframe Web Service adapter generator.
 *
 */
public class LsfileaeProgramInvoker extends AbstractProgramInvoker {

    /** Host transformers for Dfhcommarea java data object. */
    private DfhcommareaTransformers mDfhcommareaTransformers;

    /** Operation name for lsfileae. */
    private static final String  OPERATION_NAME = "lsfileae";

    /**
     * Operation invoker constructor.
     * @param configFileName invoker configuration file name
     */
    public LsfileaeProgramInvoker(final String configFileName) {
        super(configFileName, OPERATION_NAME, new LsfileaeHostProgram());
        mDfhcommareaTransformers = new DfhcommareaTransformers();
    }

    /**
     * Invoke the LSFILEAE host program.
     * <p/>
     * The sequence of operations performed is:
     * <ul>
     * <li>Get an invoker for the target host address and program</li>
     * <li>Transform request data object into host bytes</li>
     * <li>Invoke the remote program</li>
     * <li>Transform reply bytes into java data object</li>
     * </ul>
     * @param address target host address
     * @param requestID a unique identifier for this request
     * @param request the request java data object 
     * @return the reply java data object
     * @throws HostInvokerException if host invoker cannot be created or configured
     * @throws HostTransformException if transformation fails
     */
    public Dfhcommarea lsfileae(
            final LegStarAddress address,
            final String requestID,
            final Dfhcommarea request)
    throws HostInvokerException, HostTransformException {

        HostInvoker hostInvoker = getHostInvoker(address);
        String hostCharset = hostInvoker.getAddress().getHostCharset();

        /* Translate java object to a host byte array */
        byte[] requestBytes =
            getDfhcommareaTransformers().toHost(request, hostCharset);

        /* Invoke remote program */
        byte[] replyBytes = hostInvoker.invoke(requestID, requestBytes);

        /* Translate host byte array to a java object */
        return getDfhcommareaTransformers().toJava(replyBytes, hostCharset);

    }

    /**
     * @return the host transformers for Dfhcommarea
     */
    public DfhcommareaTransformers getDfhcommareaTransformers() {
        return mDfhcommareaTransformers;
    }

    /**
     * @param transformers the host transformers for Dfhcommarea
     */
    public void setDfhcommareaTransformers(
            final DfhcommareaTransformers transformers) {
        mDfhcommareaTransformers = transformers;
    }

}
