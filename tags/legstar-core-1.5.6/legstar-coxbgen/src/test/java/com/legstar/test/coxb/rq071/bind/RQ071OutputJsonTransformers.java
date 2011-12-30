package com.legstar.test.coxb.rq071.bind;

import com.legstar.coxb.transform.AbstractJsonTransformers;
import com.legstar.coxb.transform.HostTransformException;

/**
 * JSON Transformers provider for RQ071Output.
 *
 */
public class RQ071OutputJsonTransformers extends AbstractJsonTransformers {

    /**
     * Create a set of directional transformers.
     *
     * @throws HostTransformException if transformer cannot be created
     */
    public RQ071OutputJsonTransformers() throws HostTransformException {
        super(new RQ071OutputJsonToHostTransformer(),
                new RQ071OutputHostToJsonTransformer());
    }

}
