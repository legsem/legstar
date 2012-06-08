


package com.legstar.test.coxb.redbotha.bind;

import com.legstar.coxb.ICobolBinding;
import com.legstar.coxb.common.CComplexBinding;
import com.legstar.coxb.ICobolStringBinding;
import com.legstar.coxb.CobolBindingFactory;
import com.legstar.coxb.ICobolBindingFactory;
import com.legstar.coxb.ICobolComplexBinding;
import com.legstar.coxb.host.HostException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.legstar.test.coxb.redbotha.Filler22;
import com.legstar.test.coxb.redbotha.ObjectFactory;

/**
 * LegStar Binding for Complex element :
 *   Filler22.
 * 
 * This class was generated by LegStar Binding generator.
 */
public class Filler22Binding 
             extends CComplexBinding {

    /** Value object to which this cobol complex element is bound. */
    private Filler22 mValueObject;
  
    /** Indicates that the associated Value object just came from the constructor
     * and doesn't need to be recreated. */
    private boolean mUnusedValueObject = false;
    
    /** Maximum host bytes size for this complex object. */
    private static final int BYTE_LENGTH = 2;
    
    /** Child bound to value object property CLeftByte(String). */
    public ICobolStringBinding _cLeftByte;
    /** Child bound to value object property CRightByte(String). */
    public ICobolStringBinding _cRightByte;
            
    /** Logger. */
    private final Log _log = LogFactory.getLog(getClass());

    /** Binding factory. */
    private static final ICobolBindingFactory BF
        = CobolBindingFactory.getBindingFactory();
 
    /** Static reference to Value object factory to be used as default. */
    private static final ObjectFactory JF = new ObjectFactory();
    
    /** Current Value object factory (Defaults to the static one but can be
     *  changed). */
    private ObjectFactory mValueObjectFactory = JF;
    
    /**
     * Constructor for a root Complex element without a bound Value object.
     */
    public Filler22Binding() {
        this(null);
    }

    /**
     * Constructor for a root Complex element with a bound Value object.
     * 
     * @param valueObject the concrete Value object instance bound to this
     *        complex element
     */
    public Filler22Binding(
            final Filler22 valueObject) {
        this("", "", null, valueObject);
    }

    /**
    * Constructor for a Complex element as a child of another element and
    * an associated Value object.
    * 
    * @param bindingName the identifier for this binding
    * @param fieldName field name in parent Value object
    * @param valueObject the concrete Value object instance bound to this
    *        complex element
    * @param parentBinding a reference to the parent binding
    */
    public Filler22Binding(
            final String bindingName,
            final String fieldName,
            final ICobolComplexBinding parentBinding,
            final Filler22 valueObject) {
        
        super(bindingName, fieldName, Filler22.class, null, parentBinding);
        mValueObject = valueObject;
        if (mValueObject != null) {
            mUnusedValueObject = true;
        }
        initChildren();
        setByteLength(BYTE_LENGTH);
    }

    /** Creates a binding property for each child. */
    private void initChildren() {
        if (_log.isDebugEnabled()) {
            _log.debug("Initializing started");
        }
        /* Create binding children instances */

        _cLeftByte = BF.createStringBinding("CLeftByte",
               "CLeftByte", String.class, this);
        _cLeftByte.setCobolName("C-LEFT-BYTE");
        _cLeftByte.setByteLength(1);
        _cRightByte = BF.createStringBinding("CRightByte",
               "CRightByte", String.class, this);
        _cRightByte.setCobolName("C-RIGHT-BYTE");
        _cRightByte.setByteLength(1);

        /* Add children to children list */
        getChildrenList().add(_cLeftByte);
        getChildrenList().add(_cRightByte);
 
        if (_log.isDebugEnabled()) {
            _log.debug("Initializing successful");
        }
    }
    
    /** {@inheritDoc} */
    public void createValueObject() throws HostException {
        /* Since this complex binding has a constructor that takes a
         * Value object, we might already have a Value object that
         * was not used yet. */
        if (mUnusedValueObject && mValueObject != null) {
            mUnusedValueObject = false;
            return;
        }
        mValueObject = mValueObjectFactory.createFiller22();
    }

    /** {@inheritDoc} */
    public void setChildrenValues() throws HostException {

         /* Make sure there is an associated Value object*/
        if (mValueObject == null) {
            createValueObject();
        }
        /* Get Value object property _cLeftByte */
        if (_log.isDebugEnabled()) {
            _log.debug("Getting value from Value object property "
                    + "_cLeftByte"
                    + " value=" + mValueObject.getCLeftByte());
        }
        _cLeftByte.setObjectValue(mValueObject.getCLeftByte());
        /* Get Value object property _cRightByte */
        if (_log.isDebugEnabled()) {
            _log.debug("Getting value from Value object property "
                    + "_cRightByte"
                    + " value=" + mValueObject.getCRightByte());
        }
        _cRightByte.setObjectValue(mValueObject.getCRightByte());
     }

    /** {@inheritDoc} */
    public void setPropertyValue(final int index) throws HostException {
 
        ICobolBinding child = getChildrenList().get(index);
        
       /* Children that are not bound to a value object are ignored.
        * This includes Choices and dynamically generated counters
        * for instance.  */
        if (!child.isBound()) {
            return;
        }
        
        /* Set the Value object property value from binding object */
        Object bindingValue = null;
        switch (index) {
        case 0:
            bindingValue = child.getObjectValue(String.class);
            mValueObject.setCLeftByte((String) bindingValue);
            break;
        case 1:
            bindingValue = child.getObjectValue(String.class);
            mValueObject.setCRightByte((String) bindingValue);
            break;
         default:
            break;
        }
        if (_log.isDebugEnabled()) {
            _log.debug("Setting value of Value object property "
                    + child.getJaxbName()
                    + " value=" + bindingValue);
        }
    }

    /** {@inheritDoc} */
    public Object getObjectValue(
            final Class < ? > type) throws HostException {
        if (type.equals(Filler22.class)) {
            return mValueObject;
        } else {
            throw new HostException("Attempt to get binding " + getBindingName()
                    + " as an incompatible type " + type);
        }
    }

    /** {@inheritDoc} */
    public void setObjectValue(
            final Object bindingValue) throws HostException {
        if (bindingValue == null) {
            mValueObject = null;
            return;
        }
        if (bindingValue.getClass().equals(Filler22.class)) {
            mValueObject = (Filler22) bindingValue;
        } else {
            throw new HostException("Attempt to set binding " + getBindingName()
                    + " from an incompatible value " + bindingValue);
        }
    }

    /**
     * @return the java object factory for objects creation
     */
    public ObjectFactory getObjectFactory() {
        return mValueObjectFactory;
    }

    /**
     * @param valueObjectFactory the java object factory for objects creation 
     */
    public void setObjectFactory(final Object valueObjectFactory) {
        mValueObjectFactory = (ObjectFactory) valueObjectFactory;
    }

    /** {@inheritDoc} */
    public boolean isSet() {
        return (mValueObject != null);
    }

    /**
     * @return the bound Value object
     */
    public Filler22 getFiller22() {
        return mValueObject;
    }
    
    /**
     * The COBOL complex element maximum length in bytes.
     * 
     * @return COBOL complex element maximum length in bytes
     */
    public int getByteLength() {
        return BYTE_LENGTH;
    }
}
