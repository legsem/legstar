package com.legstar.http.client;

import com.legstar.config.PoolingEngineConfig;
import com.legstar.test.client.AbstractConnectionPooledMeteringTest;

/**
 * Test WMQ transport with LegStar Messaging and pooling engine.
 *
 */
public class CicsTs31PooledMeteringTest extends AbstractConnectionPooledMeteringTest {

    /** {@inheritDoc} */
    public PoolingEngineConfig getPoolingEngineConfig() {
        return AbstractHttpConnectionTester.getCicsTs31PoolingEngineConfig();
    }
}
