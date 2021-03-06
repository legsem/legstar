


package com.legstar.test.coxb.binnatus.bind;

import com.legstar.coxb.ICobolBinding;
import com.legstar.coxb.common.CComplexBinding;
import com.legstar.coxb.ICobolBinaryBinding;
import com.legstar.coxb.CobolBindingFactory;
import com.legstar.coxb.ICobolBindingFactory;
import com.legstar.coxb.ICobolComplexBinding;
import com.legstar.coxb.host.HostException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.legstar.test.coxb.binnatus.LsHalfwords;
import com.legstar.test.coxb.binnatus.ObjectFactory;

/**
 * LegStar Binding for Complex element :
 *   LsHalfwords.
 * 
 * This class was generated by LegStar Binding generator.
 */
public class LsHalfwordsBinding 
             extends CComplexBinding {

    /** Value object to which this cobol complex element is bound. */
    private LsHalfwords mValueObject;
  
    /** Indicates that the associated Value object just came from the constructor
     * and doesn't need to be recreated. */
    private boolean mUnusedValueObject = false;
    
    /** Maximum host bytes size for this complex object. */
    public static final int BYTE_LENGTH = 8;
    
    /** Child bound to value object property LsP9X4Min(Integer). */
    public ICobolBinaryBinding _lsP9X4Min;
    /** Child bound to value object property LsP9X4Low(Integer). */
    public ICobolBinaryBinding _lsP9X4Low;
    /** Child bound to value object property LsP9X4High(Integer). */
    public ICobolBinaryBinding _lsP9X4High;
    /** Child bound to value object property LsP9X4Max(Integer). */
    public ICobolBinaryBinding _lsP9X4Max;
            
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
    public LsHalfwordsBinding() {
        this(null);
    }

    /**
     * Constructor for a root Complex element with a bound Value object.
     * 
     * @param valueObject the concrete Value object instance bound to this
     *        complex element
     */
    public LsHalfwordsBinding(
            final LsHalfwords valueObject) {
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
    public LsHalfwordsBinding(
            final String bindingName,
            final String fieldName,
            final ICobolComplexBinding parentBinding,
            final LsHalfwords valueObject) {
        
        super(bindingName, fieldName, LsHalfwords.class, null, parentBinding);
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

        _lsP9X4Min = BF.createBinaryBinding("LsP9X4Min",
               "LsP9X4Min", Integer.class, this);
        _lsP9X4Min.setCobolName("LS-P9X4-MIN");
        _lsP9X4Min.setByteLength(2);
        _lsP9X4Min.setTotalDigits(4);
        _lsP9X4Low = BF.createBinaryBinding("LsP9X4Low",
               "LsP9X4Low", Integer.class, this);
        _lsP9X4Low.setCobolName("LS-P9X4-LOW");
        _lsP9X4Low.setByteLength(2);
        _lsP9X4Low.setTotalDigits(4);
        _lsP9X4High = BF.createBinaryBinding("LsP9X4High",
               "LsP9X4High", Integer.class, this);
        _lsP9X4High.setCobolName("LS-P9X4-HIGH");
        _lsP9X4High.setByteLength(2);
        _lsP9X4High.setTotalDigits(4);
        _lsP9X4Max = BF.createBinaryBinding("LsP9X4Max",
               "LsP9X4Max", Integer.class, this);
        _lsP9X4Max.setCobolName("LS-P9X4-MAX");
        _lsP9X4Max.setByteLength(2);
        _lsP9X4Max.setTotalDigits(4);

        /* Add children to children list */
        getChildrenList().add(_lsP9X4Min);
        getChildrenList().add(_lsP9X4Low);
        getChildrenList().add(_lsP9X4High);
        getChildrenList().add(_lsP9X4Max);
 
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
        mValueObject = mValueObjectFactory.createLsHalfwords();
    }

    /** {@inheritDoc} */
    public void setChildrenValues() throws HostException {

         /* Make sure there is an associated Value object*/
        if (mValueObject == null) {
            createValueObject();
        }
        /* Get Value object property _lsP9X4Min */
        if (_log.isDebugEnabled()) {
            _log.debug("Getting value from Value object property "
                    + "_lsP9X4Min"
                    + " value=" + mValueObject.getLsP9X4Min());
        }
        _lsP9X4Min.setObjectValue(mValueObject.getLsP9X4Min());
        /* Get Value object property _lsP9X4Low */
        if (_log.isDebugEnabled()) {
            _log.debug("Getting value from Value object property "
                    + "_lsP9X4Low"
                    + " value=" + mValueObject.getLsP9X4Low());
        }
        _lsP9X4Low.setObjectValue(mValueObject.getLsP9X4Low());
        /* Get Value object property _lsP9X4High */
        if (_log.isDebugEnabled()) {
            _log.debug("Getting value from Value object property "
                    + "_lsP9X4High"
                    + " value=" + mValueObject.getLsP9X4High());
        }
        _lsP9X4High.setObjectValue(mValueObject.getLsP9X4High());
        /* Get Value object property _lsP9X4Max */
        if (_log.isDebugEnabled()) {
            _log.debug("Getting value from Value object property "
                    + "_lsP9X4Max"
                    + " value=" + mValueObject.getLsP9X4Max());
        }
        _lsP9X4Max.setObjectValue(mValueObject.getLsP9X4Max());
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
            bindingValue = child.getObjectValue(Integer.class);
            mValueObject.setLsP9X4Min((Integer) bindingValue);
            break;
        case 1:
            bindingValue = child.getObjectValue(Integer.class);
            mValueObject.setLsP9X4Low((Integer) bindingValue);
            break;
        case 2:
            bindingValue = child.getObjectValue(Integer.class);
            mValueObject.setLsP9X4High((Integer) bindingValue);
            break;
        case 3:
            bindingValue = child.getObjectValue(Integer.class);
            mValueObject.setLsP9X4Max((Integer) bindingValue);
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
        if (type.equals(LsHalfwords.class)) {
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
        if (bindingValue.getClass().equals(LsHalfwords.class)) {
            mValueObject = (LsHalfwords) bindingValue;
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
    public LsHalfwords getLsHalfwords() {
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

