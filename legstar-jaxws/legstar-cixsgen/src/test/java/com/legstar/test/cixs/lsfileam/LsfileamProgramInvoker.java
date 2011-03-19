package com.legstar.test.cixs.lsfileam;
import com.legstar.coxb.transform.HostTransformException;
import com.legstar.coxb.transform.HostTransformStatus;
import com.legstar.host.invoke.AbstractProgramInvoker;
import com.legstar.host.invoke.HostInvoker;
import com.legstar.host.invoke.HostInvokerException;
import com.legstar.messaging.LegStarAddress;
import com.legstar.test.coxb.lsfileac.bind.QueryDataTransformers;
import com.legstar.test.coxb.lsfileac.bind.QueryLimitTransformers;
import com.legstar.test.coxb.lsfileac.bind.ReplyDataTransformers;
import com.legstar.test.coxb.lsfileac.bind.ReplyStatusTransformers;

/**
 * Implements an invoker for program LSFILEAM.
 * <p/>
 * This host program maps to operation lsfileam.
 * 
 * This class was generated by LegStar Mainframe Web Service adapter generator.
 *
 */
public class LsfileamProgramInvoker extends AbstractProgramInvoker {

    /** Host transformers for QueryData java data object. */
    private QueryDataTransformers mQueryDataTransformers;
    /** Host transformers for QueryLimit java data object. */
    private QueryLimitTransformers mQueryLimitTransformers;
    /** Host transformers for ReplyData java data object. */
    private ReplyDataTransformers mReplyDataTransformers;
    /** Host transformers for ReplyStatus java data object. */
    private ReplyStatusTransformers mReplyStatusTransformers;

    /** Operation name for lsfileam. */
    private static final String  OPERATION_NAME = "lsfileam";

    /**
     * Operation invoker constructor.
     * @param configFileName invoker configuration file name
     */
    public LsfileamProgramInvoker(final String configFileName) {
        super(configFileName, OPERATION_NAME, new LsfileamHostProgram());
        mQueryDataTransformers = new QueryDataTransformers();
        mQueryLimitTransformers = new QueryLimitTransformers();
        mReplyDataTransformers = new ReplyDataTransformers();
        mReplyStatusTransformers = new ReplyStatusTransformers();
    }

    /**
     * Invoke the LSFILEAM host program.
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
    public LsfileamResponseHolder lsfileam(
            final LegStarAddress address,
            final String requestID,
            final LsfileamRequestHolder request)
    throws HostInvokerException, HostTransformException {

        HostInvoker hostInvoker = getHostInvoker(address);
        String hostCharset = hostInvoker.getAddress().getHostCharset();

        /* Translate java objects to separate host byte arrays */
        int byteSize = 0;
        byte[] queryDataBytes =
             getQueryDataTransformers().toHost(
                request.getQueryData(), hostCharset);
        byteSize += queryDataBytes.length;
        byte[] queryLimitBytes =
             getQueryLimitTransformers().toHost(
                request.getQueryLimit(), hostCharset);
        byteSize += queryLimitBytes.length;

        /* Merge individual byte arrays to form the request */
        byte[] requestBytes = new byte[byteSize];
        int requestBytePos = 0;

        System.arraycopy(queryDataBytes, 0, requestBytes, requestBytePos,
                queryDataBytes.length);
        requestBytePos += queryDataBytes.length;
        System.arraycopy(queryLimitBytes, 0, requestBytes, requestBytePos,
                queryLimitBytes.length);
        requestBytePos += queryLimitBytes.length;

        /* Invoke remote program */
        byte[] replyBytes = hostInvoker.invoke(requestID, requestBytes);

        /* Translate host byte array to java objects */
        LsfileamResponseHolder reply = new LsfileamResponseHolder();
        int replyBytePos = 0;
        HostTransformStatus status = new HostTransformStatus();
        reply.setReplyData(
            getReplyDataTransformers().toJava(
                replyBytes, replyBytePos, hostCharset, status));
        replyBytePos += status.getHostBytesProcessed();
        reply.setReplyStatus(
            getReplyStatusTransformers().toJava(
                replyBytes, replyBytePos, hostCharset, status));
        replyBytePos += status.getHostBytesProcessed();
        return reply;

    }

    /**
     * @return the host transformers for QueryData
     */
    public QueryDataTransformers getQueryDataTransformers() {
        return mQueryDataTransformers;
    }

    /**
     * @param transformers the host transformers for QueryData
     */
    public void setQueryDataTransformers(
            final QueryDataTransformers transformers) {
        mQueryDataTransformers = transformers;
    }

    /**
     * @return the host transformers for QueryLimit
     */
    public QueryLimitTransformers getQueryLimitTransformers() {
        return mQueryLimitTransformers;
    }

    /**
     * @param transformers the host transformers for QueryLimit
     */
    public void setQueryLimitTransformers(
            final QueryLimitTransformers transformers) {
        mQueryLimitTransformers = transformers;
    }

    /**
     * @return the host transformers for ReplyData
     */
    public ReplyDataTransformers getReplyDataTransformers() {
        return mReplyDataTransformers;
    }

    /**
     * @param transformers the host transformers for ReplyData
     */
    public void setReplyDataTransformers(
            final ReplyDataTransformers transformers) {
        mReplyDataTransformers = transformers;
    }

    /**
     * @return the host transformers for ReplyStatus
     */
    public ReplyStatusTransformers getReplyStatusTransformers() {
        return mReplyStatusTransformers;
    }

    /**
     * @param transformers the host transformers for ReplyStatus
     */
    public void setReplyStatusTransformers(
            final ReplyStatusTransformers transformers) {
        mReplyStatusTransformers = transformers;
    }

}
