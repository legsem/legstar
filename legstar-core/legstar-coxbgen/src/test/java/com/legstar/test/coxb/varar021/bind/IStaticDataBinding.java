


package com.legstar.test.coxb.varar021.bind;

import com.legstar.coxb.ICobolBinding;
import com.legstar.coxb.common.CComplexBinding;
import com.legstar.coxb.ICobolArrayComplexBinding;
import com.legstar.test.coxb.varar021.LkupInfo39;
import java.util.List;
import com.legstar.coxb.ICobolComplexBinding;
import com.legstar.coxb.host.HostException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.legstar.test.coxb.varar021.IStaticData;
import com.legstar.test.coxb.varar021.ObjectFactory;

/**
 * LegStar Binding for Complex element :
 *   IStaticData.
 * 
 * This class was generated by LegStar Binding generator.
 */
public class IStaticDataBinding 
             extends CComplexBinding {

    /** Value object to which this cobol complex element is bound. */
    private IStaticData mValueObject;
  
    /** Indicates that the associated Value object just came from the constructor
     * and doesn't need to be recreated. */
    private boolean mUnusedValueObject = false;
    
    /** Maximum host bytes size for this complex object. */
    public static final int BYTE_LENGTH = 46;
    
    /** Child bound to value object property LkupInfo(LkupInfo39). */
    public ICobolArrayComplexBinding _lkupInfoWrapper;
    /** Binding item for complex array binding LkupInfo39. */
    public ICobolComplexBinding _lkupInfoWrapperItem;
            
    /** Logger. */
    private final Log _log = LogFactory.getLog(getClass());
 
    /** Static reference to Value object factory to be used as default. */
    private static final ObjectFactory JF = new ObjectFactory();
    
    /** Current Value object factory (Defaults to the static one but can be
     *  changed). */
    private ObjectFactory mValueObjectFactory = JF;
    
    /**
     * Constructor for a root Complex element without a bound Value object.
     */
    public IStaticDataBinding() {
        this(null);
    }

    /**
     * Constructor for a root Complex element with a bound Value object.
     * 
     * @param valueObject the concrete Value object instance bound to this
     *        complex element
     */
    public IStaticDataBinding(
            final IStaticData valueObject) {
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
    public IStaticDataBinding(
            final String bindingName,
            final String fieldName,
            final ICobolComplexBinding parentBinding,
            final IStaticData valueObject) {
        
        super(bindingName, fieldName, IStaticData.class, null, parentBinding);
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

        _lkupInfoWrapperItem = new LkupInfo39Binding("LkupInfoWrapperItem",
               "LkupInfo", this, null);
        _lkupInfoWrapper = new LkupInfo39WrapperBinding("LkupInfoWrapper",
               "LkupInfo", this, _lkupInfoWrapperItem);
        _lkupInfoWrapper.setCobolName("LKUP-INFO");
        _lkupInfoWrapper.setByteLength(46);
        _lkupInfoWrapper.setItemByteLength(23);
        _lkupInfoWrapper.setMinOccurs(2);
        _lkupInfoWrapper.setMaxOccurs(2);

        /* Add children to children list */
        getChildrenList().add(_lkupInfoWrapper);
 
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
        mValueObject = mValueObjectFactory.createIStaticData();
    }

    /** {@inheritDoc} */
    public void setChildrenValues() throws HostException {

         /* Make sure there is an associated Value object*/
        if (mValueObject == null) {
            createValueObject();
        }
        /* Get Value object property _lkupInfoWrapper */
        if (_log.isDebugEnabled()) {
            _log.debug("Getting value from Value object property "
                    + "_lkupInfoWrapper"
                    + " value=" + mValueObject.getLkupInfo());
        }
        _lkupInfoWrapper.setObjectValue(mValueObject.getLkupInfo());
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
            bindingValue = child.getObjectValue(LkupInfo39.class);
            List < LkupInfo39 > listLkupInfoWrapper = cast(bindingValue);
            mValueObject.getLkupInfo().clear();
            mValueObject.getLkupInfo().addAll(listLkupInfoWrapper);
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
        if (type.equals(IStaticData.class)) {
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
        if (bindingValue.getClass().equals(IStaticData.class)) {
            mValueObject = (IStaticData) bindingValue;
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
    public IStaticData getIStaticData() {
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

