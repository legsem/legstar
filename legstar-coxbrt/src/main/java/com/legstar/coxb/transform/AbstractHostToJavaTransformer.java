package com.legstar.coxb.transform;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.legstar.coxb.CobolContext;
import com.legstar.coxb.ICobolComplexBinding;
import com.legstar.coxb.host.HostException;
import com.legstar.coxb.visitor.CobolUnmarshalVisitor;

/**
 * Generic methods to transform host data to java.
 * TODO describe API
 *
 */
public abstract class AbstractHostToJavaTransformer extends AbstractTransformer {
    
    /** Logger. */
    private static final Log LOG = LogFactory.getLog(AbstractHostToJavaTransformer.class);

    /**
     * Create a Host to Java transformer using default COBOL parameters.
     */
    public AbstractHostToJavaTransformer() {
        super();
    }
    
    /**
     * Create a Host to Java transformer using a specific host character set while
     * other COBOL parameters are set by default.
     * @param hostCharset the host character set
     */
    public AbstractHostToJavaTransformer(final String hostCharset) {
        super(hostCharset);
    }
    
    /**
     * Create a Host to Java transformer using a specific COBOL parameters set.
     * @param cobolContext the COBOL parameters set.
     */
    public AbstractHostToJavaTransformer(final CobolContext cobolContext) {
        super(cobolContext);
    }
    
    /**
     * Transforms host data to java with a specific host character set.
     * @param hostData a byte array containing host data
     * @param hostCharset the host character set
     * @return a Java value object
     * @throws HostTransformException if transformation fails
     */
    public Object transform(final byte[] hostData, final String hostCharset) throws HostTransformException {
        getCobolConverters().getCobolContext().setHostCharsetName(hostCharset);
        return transform(hostData);
    }
    
    /**
     * Transforms host data to java.
     * @param hostData a byte array containing host data
     * @return a Java value object
     * @throws HostTransformException if transformation fails
     */
    public Object transform(final byte[] hostData) throws HostTransformException {

        long start = System.currentTimeMillis();
        if (LOG.isDebugEnabled()) {
            LOG.debug("Host to Java transformation started");
        }

        try {
            /* Unmarshal the raw host data into a java object tree */
            CobolUnmarshalVisitor unmarshaler = new CobolUnmarshalVisitor(
                    hostData, 0, getCobolConverters());

            /* Request a binding from concrete class */
            ICobolComplexBinding binding = getBinding();
            
            /* Traverse the object structure, visiting each node with the visitor */
            binding.accept(unmarshaler);
            
            /* Get the actual bytes unmarshalled */
            int bytesUnmarshalled = unmarshaler.getOffset();

            if (LOG.isDebugEnabled()) {
                long end = System.currentTimeMillis();
                LOG.debug("Host to Java transformation ended Processed: "
                        + Integer.toString(bytesUnmarshalled) + " bytes "
                        + "elapse:"
                        + Long.toString(end - start) + " ms");
            }
            
            return binding.getObjectValue(binding.getJaxbType());
            
        } catch (HostException he) {
            throw new HostTransformException(he);
        }
    }

}
