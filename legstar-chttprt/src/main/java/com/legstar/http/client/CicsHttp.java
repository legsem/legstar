/*******************************************************************************
 * Copyright (c) 2008 LegSem.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v2.1
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/old-licenses/gpl-2.0.html
 * 
 * Contributors:
 *     LegSem - initial API and implementation
 ******************************************************************************/
package com.legstar.http.client;

import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.httpclient.DefaultHttpMethodRetryHandler;
import org.apache.commons.httpclient.Header;
import org.apache.commons.httpclient.HostConfiguration;
import org.apache.commons.httpclient.params.HttpConnectionParams;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.HttpState;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.UsernamePasswordCredentials;
import org.apache.commons.httpclient.auth.AuthScope;
import org.apache.commons.httpclient.methods.InputStreamRequestEntity;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.params.HttpClientParams;
import org.apache.commons.httpclient.params.HttpMethodParams;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.legstar.messaging.HostMessageFormatException;
import com.legstar.messaging.LegStarConnection;
import com.legstar.messaging.ConnectionException;
import com.legstar.messaging.HeaderPartException;
import com.legstar.messaging.HostReceiveException;
import com.legstar.messaging.LegStarMessage;
import com.legstar.messaging.LegStarRequest;
import com.legstar.messaging.RequestException;

/**
 * Client side CICS HTTP connectivity. This class provides the core
 * methods to connect to CICS over http, send requests, receive 
 * results, etc...
 * This implementation of an HTTP Client does not use an Apache
 * MultithreadConnection manager because it is meant to be usable
 * with the LegStar engine which comes with its own connection pooling.
 *
 */
public class CicsHttp implements LegStarConnection  {

    /**
     * Starting from now it will be the preferred content type. 
     * This is an extract from RFC2046:
     * The "application" media type is to be used for discrete data which do
     * not fit in any of the other categories, and particularly for data to
     * be processed by some type of application program.  This is
     * information which must be processed by an application before it is
     * viewable or usable by a user.
     */
    private static final String APPLICATION_CONTENT_TYPE = "application/octet-stream";

    /** HTTP Header to request traces on host. */
    public static final String REQUEST_TRACE_MODE_HHDR = "CICSTraceMode";

    /** HTTP Header providing a correlation ID. */
    public static final String REQUEST_ID_HHDR = "CICSRequestID";

    /** HTTP Header signaling errors on response. */
    public static final String CICS_ERROR_HHDR = "CICSError";

    /** An identifier for this connection. */
    private String mConnectionID;

    /** Host CICS Http endpoint. */
    private CicsHttpEndpoint mCicsHttpEndpoint;

    /** Apache HTTP client. Connection persistence is implemented by default. */
    private HttpClient mHttpClient;

    /** Apache HTTP host configuration (Remote host address, port, etc.). */
    private HostConfiguration mHostConfig;

    /** Apache HTTP state (holds credentials and cookies). */
    private HttpState mHttpState;

    /** Apache HTTP POST method (We use POST command with CICS Server).*/
    private PostMethod mPostMethod;

    /** Most recent status code returned by an HTTP method execution. */
    private int mStatusCode = 0;

    /** Maximum time (milliseconds) to wait for connection. */
    private int mConnectTimeout;

    /** Maximum time (milliseconds) to wait for host reply. */
    private int mReceiveTimeout;

    /** Logger. */
    private static final Log LOG = LogFactory.getLog(CicsHttp.class);

    /**
     * A CicsHttp instance exists for a target CICS region, a given CICS URL
     * path and a particular User ID to use for authentication and 
     * impersonation. Observe that no password is stored in this class
     * for security reasons.
     * 
     * @param connectionID an identifier for this connection
     * @param cicsHttpEndpoint CICS Http endpoint
     * @param connectionTimeout Maximum time (milliseconds) to wait for
     *  connection
     * @param receiveTimeout Maximum time (milliseconds) to wait for host reply
     */
    public CicsHttp(
            final String connectionID,
            final CicsHttpEndpoint cicsHttpEndpoint,
            final int connectionTimeout,
            final int receiveTimeout) {
        mConnectionID = connectionID;
        mConnectTimeout = connectionTimeout;
        mReceiveTimeout = receiveTimeout;
        setCicsHttpEndpoint(cicsHttpEndpoint);
        mHttpClient = createHttpClient();
    }

    /**
     * HTTPClient actually connects to the host on the first request and
     * will then try to persist the connection. Therefore there is not
     * much to be done here apart from initializing credentials.
     * 
     * @param cicsPassword credentials for basic authentication
     * @throws ConnectionException if connection fails
     */
    public final void connect(
            final String cicsPassword) throws ConnectionException {

        if (LOG.isDebugEnabled()) {
            LOG.debug("Connection:" + mConnectionID
                    + " Setup connection. Host:" 
                    + mCicsHttpEndpoint.getReport());
        }
        /* Create a state using the passed credentials */
        mHttpState = createHttpState(cicsPassword);

        /* There must be a new post method on each request*/
        mPostMethod = null;

        if (LOG.isDebugEnabled()) {
            LOG.debug("Connection:" + mConnectionID + " Connection setup.");
        }
    }

    /**
     * Client is requesting reuse of the HTTP Connection. This is happening
     * automatically with HTTPClient (If the server supports HTTP 1.1).
     * Therefore there is no particular processing here.
     * @param cicsPassword host password if it is not stored in configuration
     *  file
     *  @throws ConnectionException if connection fails
     * */
    public final void connectReuse(
            final String cicsPassword) throws ConnectionException {
        connect(cicsPassword);
    }

    /**
     * A request is serialized as HTTP Headers and a binary payload. 
     * A new post method is created on each send request.
     * 
     * @param request the request to be serviced
     * @throws RequestException if send fails
     */
    public final void sendRequest(
            final LegStarRequest request) throws RequestException {

        if (LOG.isDebugEnabled()) {
            try {
                LOG.debug("Sending Request:" + request.getID()
                        + " on Connection:" + mConnectionID
                        + " "
                        + request.getRequestMessage().getHeaderPart().
                        getJsonString()
                        + '.');
            } catch (HeaderPartException e) {
                throw new RequestException(e);
            }
        }
        /* First make sure we are not out of sync. */
        if (mHttpState == null) {
            throw new RequestException(
            "No prior connect. Missing host credentials.");
        }
        try {
            mPostMethod = createPostMethod(request);
            /* Status code is not processed here because we need to
             * receive response whatever the status code is. If status code
             * shows an error, it will be handled while receiving response. */
            mStatusCode = mHttpClient.executeMethod(
                    mHostConfig, mPostMethod, mHttpState);
        } catch (HttpException e) {
            throw new RequestException(e);
        } catch (IOException e) {
            throw new RequestException(e);
        }

        if (LOG.isDebugEnabled()) {
            LOG.debug("Request:" + request.getID()
                    + " on Connection:" + mConnectionID
                    + " message request sent.");
        }
    }

    /**
     * A response is serialized as a header message part followed by 
     * data message parts. This method creates a response message
     * for the request.
     * 
     * @param request the request being serviced
     * @throws RequestException if receive fails
     */
    public final void recvResponse(
            final LegStarRequest request) throws RequestException {

        if (LOG.isDebugEnabled()) {
            LOG.debug("Receiving response for Request:" + request.getID()
                    + " on Connection:" + mConnectionID
                    + '.');
        }

        /* First make sure we are not out of sync. */
        if (mPostMethod == null) {
            throw new RequestException(
            "No prior send request. Nothing to receive.");
        }

        /* If the response was not successful, the content of the reply
         * will help the caller handle the error. */
        if (mStatusCode != HttpStatus.SC_OK) {
            throwErrorResponse();
            return;
        }

        /* At this stage, HTTP is not reporting and error. Try to get a
         * valid response message from the HTTP payload */
        try {
            InputStream respStream = mPostMethod.getResponseBodyAsStream();
            request.setResponseMessage(createResponseMessage(respStream));
        } catch (IOException e) {
            throw new RequestException(e);
        } catch (HostReceiveException e) {
            throw new RequestException(e);
        } finally {
            mPostMethod.releaseConnection();
        }

        if (LOG.isDebugEnabled()) {
            LOG.debug("Request:" + request.getID()
                    + " on Connection:" + mConnectionID
                    + " response received.");
        }
    }

    /**
     * Terminates a connection with the host. Closing is managed by the
     * underlying Http connection manager dependant on the partner
     * support for HTTP 1.1. We make no attempt to interfere here.
     * @throws RequestException if a failure is detected
     */
    public void close() throws RequestException {
    }

    /**
     * Create a reusable HTTP Client with a set of parameters that match
     * the remote CICS Server behavior. At this stage, the HTTPClient is not
     * associated with a state and a method yet.
     * @return the new HTTP Client
     */
    private HttpClient createHttpClient() {

        if (LOG.isDebugEnabled()) {
            LOG.debug("enter createHttpClient()");
        }
        HttpClientParams params = new HttpClientParams();

        /* Consider that if server is failing to respond, we should never retry.
         * A system such as CICS should always be responsive unless something
         * bad is happening in which case, retry makes things worse. */
        DefaultHttpMethodRetryHandler retryhandler =
            new DefaultHttpMethodRetryHandler(0, false);
        params.setParameter(
                HttpMethodParams.RETRY_HANDLER, retryhandler);

        /* Preemptive authentication forces the first HTTP payload to hold
         * credentials. This bypasses the inefficient default mechanism that
         * expects a 401 reply on the first request and then re-issues the same
         * request again with credentials.*/
        params.setAuthenticationPreemptive(true);

        /* Set the receive time out. */
        params.setSoTimeout(mReceiveTimeout);

        /* Tell the connection manager how long we are prepared to wait
         * for a connection. */
        params.setIntParameter(
                HttpConnectionParams.CONNECTION_TIMEOUT, mConnectTimeout);

        /* Disable Nagle algorithm */
        params.setBooleanParameter(
                HttpConnectionParams.TCP_NODELAY, true);

        HttpClient httpClient = new HttpClient(params);

        return httpClient;
    }

    /**
     * Create a state with the given credentials. A state persists from
     * request to request.
     * @param cicsPassword the passed host password
     * @return a new HTTP State
     */
    private HttpState createHttpState(final String cicsPassword) {

        if (LOG.isDebugEnabled()) {
            LOG.debug("enter createHttpState(cicsPassword)");
        }

        HttpState httpState = new HttpState();

        /* If a password is not passed, use the one from configuration */
        String password;
        if (cicsPassword == null || cicsPassword.length() == 0) {
            password = mCicsHttpEndpoint.getHostPassword();
        } else {
            password = cicsPassword;
        }

        /* If there are no credentials, assume the server might have
         * been setup without basic authentication. */
        if (password == null || password.length() == 0) {
            return httpState;
        }

        /* Username and password will be used as basic authentication
         *  credentials */
        UsernamePasswordCredentials upc =
            new UsernamePasswordCredentials(
                    mCicsHttpEndpoint.getHostUserID(),
                    password);
        httpState.setCredentials(
                new AuthScope(mCicsHttpEndpoint.getHostIPAddress(),
                        mCicsHttpEndpoint.getHostIPPort(),
                        AuthScope.ANY_HOST), upc);
        return httpState;
    }

    /**
     * Create and populate an HTTP post method to send the execution request.
     * @param request the request to be serviced
     * @return the new post method
     * @throws RequestException if post method cannot be created
     */
    public final PostMethod createPostMethod(
            final LegStarRequest request) throws RequestException {

        if (LOG.isDebugEnabled()) {
            LOG.debug("enter createPostMethod(request)");
        }

        PostMethod postMethod = new PostMethod();

        /* Point to URL under CICS Web Support */ 
        postMethod.setPath(mCicsHttpEndpoint.getHostURLPath());

        /* Pass on trace data to host via HTTP headers */
        postMethod.setRequestHeader(REQUEST_TRACE_MODE_HHDR,
                Boolean.toString(request.getAddress().isHostTraceMode()));
        postMethod.setRequestHeader(REQUEST_ID_HHDR, request.getID());

        /* Create the binary content */
        try {
            postMethod.setRequestEntity(
                    new InputStreamRequestEntity(
                            request.getRequestMessage().sendToHost(),
                            APPLICATION_CONTENT_TYPE));
        } catch (HostMessageFormatException e) {
            throw new RequestException(e);
        }

        return postMethod;

    }

    /**
     * Creates a response message from the HTTP reply back.
     * The HTTP payload should contain serailization of a header part 
     * followed by any number of data parts.
     * @param respStream the HTTP response data
     * @return a response message
     * @throws HostReceiveException if response cannot be mapped to a message
     */
    private LegStarMessage createResponseMessage(
            final InputStream respStream) throws HostReceiveException {

        if (LOG.isDebugEnabled()) {
            LOG.debug("enter createResponseMessage(respStream)");
        }

        LegStarMessage reponseMessage;
        try {
            reponseMessage = new LegStarMessage();
            reponseMessage.recvFromHost(respStream);
        } catch (HeaderPartException e) {
            throw new HostReceiveException(e);
        } catch (HostMessageFormatException e) {
            throw new HostReceiveException(e);
        }

        if (LOG.isDebugEnabled()) {
            LOG.debug("response message received");
        }
        return reponseMessage;
    }

    /**
     * When the response status code is not 200 (OK) we build the
     * most meaningful exception message.
     * @throws RequestException systematically thrown
     */
    private void throwErrorResponse() throws RequestException {

        if (LOG.isDebugEnabled()) {
            LOG.debug("enter throwErrorResponse()");
        }

        StringBuilder errorMessage = new StringBuilder();
        errorMessage.append(mPostMethod.getStatusText());

        /* This might be an error reported by the LegStar layer on host */
        Header cicsError = mPostMethod.getResponseHeader(CICS_ERROR_HHDR);
        if (cicsError != null) {
            errorMessage.append(" ");
            errorMessage.append(cicsError.getValue());
        }
        /* Try to get the response content in all cases (this is 
         * specifically recommended by the HTTPClient documentation)  */
        try {
            errorMessage.append(" ");
            errorMessage.append(mPostMethod.getResponseBodyAsString());
            throw new RequestException(errorMessage.toString());
        } catch (IOException e) {
            /* Assume there are no error descriptions in the content. */
            throw new RequestException(errorMessage.toString());
        } finally {
            mPostMethod.releaseConnection();
        }
    }

    /** No-op for HTTP transport.
     * {@inheritDoc} */
    public void commitUOW() throws RequestException {
    }

    /** No-op for HTTP transport.
     * {@inheritDoc} */
    public void keepUOW() throws RequestException {
    }

    /** No-op for HTTP transport.
     * {@inheritDoc} */
    public void rollbackUOW() throws RequestException {
    }

    /**
     * @return the identifier for this connection
     */
    public final String getConnectionID() {
        return mConnectionID;
    }

    /**
     * @param connectionID an identifier for this connection to set
     */
    public final void setConnectionID(final String connectionID) {
        mConnectionID = connectionID;
    }

    /** (non-Javadoc).
     * @see com.legstar.messaging.LegStarConnection#getConnectTimeout()
     * {@inheritDoc}
     */
    public final long getConnectTimeout() {
        return mConnectTimeout;
    }

    /** (non-Javadoc).
     * @see com.legstar.messaging.LegStarConnection#setConnectTimeout(long)
     * {@inheritDoc}
     */
    public final void setConnectTimeout(final long timeout) {
        mConnectTimeout = (int) timeout;
        mHttpClient.getParams().setIntParameter(
                HttpConnectionParams.CONNECTION_TIMEOUT, mConnectTimeout);
    }

    /** (non-Javadoc).
     * @see com.legstar.messaging.LegStarConnection#getReceiveTimeout()
     * {@inheritDoc}
     */
    public final long getReceiveTimeout() {
        return mReceiveTimeout;
    }

    /** (non-Javadoc).
     * @see com.legstar.messaging.LegStarConnection#setReceiveTimeout(long)
     * {@inheritDoc}
     */
    public final void setReceiveTimeout(final long timeout) {
        mReceiveTimeout = (int) timeout;
        /* Set the receive time out. */
        mHttpClient.getParams().setSoTimeout(mReceiveTimeout);
    }

    /**
     * @return the CICS Http endpoint
     */
    public final CicsHttpEndpoint getCicsHttpEndpoint() {
        return mCicsHttpEndpoint;
    }

    /**
     * Creates an HTTP Host configuration based on the HTTP parameters
     * received.
     * @param cicsHttpEndpoint the CICS Http endpoint to set
     */
    public final void setCicsHttpEndpoint(
            final CicsHttpEndpoint cicsHttpEndpoint) {
        mCicsHttpEndpoint = cicsHttpEndpoint;
        mHostConfig = new HostConfiguration();
        mHostConfig.setHost(
                mCicsHttpEndpoint.getHostIPAddress(),
                mCicsHttpEndpoint.getHostIPPort());

    }

    /**
     * @return the HostConfig
     */
    public final HostConfiguration getHostConfig() {
        return mHostConfig;
    }

    /**
     * @return the HttpClient
     */
    public final HttpClient getHttpClient() {
        return mHttpClient;
    }

    /**
     * @return the HttpState
     */
    public final HttpState getHttpState() {
        return mHttpState;
    }

    /**
     * @return the PostMethod
     */
    public final PostMethod getPostMethod() {
        return mPostMethod;
    }

    /**
     * @return the StatusCode
     */
    public final int getStatusCode() {
        return mStatusCode;
    }

}
