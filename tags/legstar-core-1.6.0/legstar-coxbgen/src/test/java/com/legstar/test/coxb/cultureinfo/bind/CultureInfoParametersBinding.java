


package com.legstar.test.coxb.cultureinfo.bind;

import com.legstar.coxb.ICobolBinding;
import com.legstar.coxb.common.CComplexBinding;
import com.legstar.coxb.ICobolStringBinding;
import com.legstar.coxb.CobolBindingFactory;
import com.legstar.coxb.ICobolBindingFactory;
import com.legstar.coxb.ICobolPackedDecimalBinding;
import java.math.BigDecimal;
import com.legstar.coxb.ICobolComplexBinding;
import com.legstar.coxb.host.HostException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.legstar.test.coxb.cultureinfo.CultureInfoParameters;
import com.legstar.test.coxb.cultureinfo.ObjectFactory;

/**
 * LegStar Binding for Complex element :
 *   CultureInfoParameters.
 * 
 * This class was generated by LegStar Binding generator.
 */
public class CultureInfoParametersBinding 
             extends CComplexBinding {

    /** Value object to which this cobol complex element is bound. */
    private CultureInfoParameters mValueObject;
  
    /** Indicates that the associated Value object just came from the constructor
     * and doesn't need to be recreated. */
    private boolean mUnusedValueObject = false;
    
    /** Maximum host bytes size for this complex object. */
    public static final int BYTE_LENGTH = 37;
    
    /** Child bound to value object property CultureCode(String). */
    public ICobolStringBinding _cultureCode;
    /** Child bound to value object property DecimalNumber(BigDecimal). */
    public ICobolPackedDecimalBinding _decimalNumber;
            
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
    public CultureInfoParametersBinding() {
        this(null);
    }

    /**
     * Constructor for a root Complex element with a bound Value object.
     * 
     * @param valueObject the concrete Value object instance bound to this
     *        complex element
     */
    public CultureInfoParametersBinding(
            final CultureInfoParameters valueObject) {
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
    public CultureInfoParametersBinding(
            final String bindingName,
            final String fieldName,
            final ICobolComplexBinding parentBinding,
            final CultureInfoParameters valueObject) {
        
        super(bindingName, fieldName, CultureInfoParameters.class, null, parentBinding);
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

        _cultureCode = BF.createStringBinding("CultureCode",
               "CultureCode", String.class, this);
        _cultureCode.setCobolName("cultureCode");
        _cultureCode.setByteLength(32);
        _decimalNumber = BF.createPackedDecimalBinding("DecimalNumber",
               "DecimalNumber", BigDecimal.class, this);
        _decimalNumber.setCobolName("decimalNumber");
        _decimalNumber.setByteLength(5);
        _decimalNumber.setTotalDigits(9);
        _decimalNumber.setFractionDigits(2);
        _decimalNumber.setIsSigned(true);

        /* Add children to children list */
        getChildrenList().add(_cultureCode);
        getChildrenList().add(_decimalNumber);
 
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
        mValueObject = mValueObjectFactory.createCultureInfoParameters();
    }

    /** {@inheritDoc} */
    public void setChildrenValues() throws HostException {

         /* Make sure there is an associated Value object*/
        if (mValueObject == null) {
            createValueObject();
        }
        /* Get Value object property _cultureCode */
        if (_log.isDebugEnabled()) {
            _log.debug("Getting value from Value object property "
                    + "_cultureCode"
                    + " value=" + mValueObject.getCultureCode());
        }
        _cultureCode.setObjectValue(mValueObject.getCultureCode());
        /* Get Value object property _decimalNumber */
        if (_log.isDebugEnabled()) {
            _log.debug("Getting value from Value object property "
                    + "_decimalNumber"
                    + " value=" + mValueObject.getDecimalNumber());
        }
        _decimalNumber.setObjectValue(mValueObject.getDecimalNumber());
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
            mValueObject.setCultureCode((String) bindingValue);
            break;
        case 1:
            bindingValue = child.getObjectValue(BigDecimal.class);
            mValueObject.setDecimalNumber((BigDecimal) bindingValue);
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
        if (type.equals(CultureInfoParameters.class)) {
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
        if (bindingValue.getClass().equals(CultureInfoParameters.class)) {
            mValueObject = (CultureInfoParameters) bindingValue;
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
    public CultureInfoParameters getCultureInfoParameters() {
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
