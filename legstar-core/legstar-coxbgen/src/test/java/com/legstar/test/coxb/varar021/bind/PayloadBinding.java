


package com.legstar.test.coxb.varar021.bind;

import com.legstar.coxb.ICobolBinding;
import com.legstar.coxb.common.CComplexBinding;
import com.legstar.coxb.ICobolZonedDecimalBinding;
import com.legstar.coxb.CobolBindingFactory;
import com.legstar.coxb.ICobolBindingFactory;
import com.legstar.coxb.ICobolStringBinding;
import com.legstar.coxb.ICobolComplexBinding;
import com.legstar.test.coxb.varar021.IStaticData;
import java.util.List;
import com.legstar.coxb.ICobolArrayComplexBinding;
import com.legstar.test.coxb.varar021.ODynamicData;
import com.legstar.test.coxb.varar021.WellpointEaiEbsErrorRow;
import com.legstar.coxb.host.HostException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.legstar.test.coxb.varar021.Payload;
import com.legstar.test.coxb.varar021.ObjectFactory;

/**
 * LegStar Binding for Complex element :
 *   Payload.
 * 
 * This class was generated by LegStar Binding generator.
 */
public class PayloadBinding 
             extends CComplexBinding {

    /** Value object to which this cobol complex element is bound. */
    private Payload mValueObject;
  
    /** Indicates that the associated Value object just came from the constructor
     * and doesn't need to be recreated. */
    private boolean mUnusedValueObject = false;
    
    /** Maximum host bytes size for this complex object. */
    public static final int BYTE_LENGTH = 19922;
    
    /** Child bound to value object property WechRequestRows(Integer). */
    public ICobolZonedDecimalBinding _wechRequestRows;
    /** Child bound to value object property WechDynamicResponseRows(Integer). */
    public ICobolZonedDecimalBinding _wechDynamicResponseRows;
    /** Child bound to value object property WechErrorRows(Integer). */
    public ICobolZonedDecimalBinding _wechErrorRows;
    /** Child bound to value object property WechAdditionalPageKeys(String). */
    public ICobolStringBinding _wechAdditionalPageKeys;
    /** Child bound to value object property IStaticData(IStaticData). */
    public ICobolComplexBinding _iStaticData;
    /** Child bound to value object property ODynamicData(ODynamicData). */
    public ICobolArrayComplexBinding _oDynamicDataWrapper;
    /** Binding item for complex array binding ODynamicData. */
    public ICobolComplexBinding _oDynamicDataWrapperItem;
    /** Child bound to value object property WellpointEaiEbsErrorRow(WellpointEaiEbsErrorRow). */
    public ICobolArrayComplexBinding _wellpointEaiEbsErrorRowWrapper;
    /** Binding item for complex array binding WellpointEaiEbsErrorRow. */
    public ICobolComplexBinding _wellpointEaiEbsErrorRowWrapperItem;
            
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
    public PayloadBinding() {
        this(null);
    }

    /**
     * Constructor for a root Complex element with a bound Value object.
     * 
     * @param valueObject the concrete Value object instance bound to this
     *        complex element
     */
    public PayloadBinding(
            final Payload valueObject) {
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
    public PayloadBinding(
            final String bindingName,
            final String fieldName,
            final ICobolComplexBinding parentBinding,
            final Payload valueObject) {
        
        super(bindingName, fieldName, Payload.class, null, parentBinding);
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

        _wechRequestRows = BF.createZonedDecimalBinding("WechRequestRows",
               "WechRequestRows", Integer.class, this);
        _wechRequestRows.setCobolName("WECH-REQUEST-ROWS");
        _wechRequestRows.setByteLength(3);
        _wechRequestRows.setTotalDigits(3);
        _wechRequestRows.setIsODOObject(true);
        _wechDynamicResponseRows = BF.createZonedDecimalBinding("WechDynamicResponseRows",
               "WechDynamicResponseRows", Integer.class, this);
        _wechDynamicResponseRows.setCobolName("WECH-DYNAMIC-RESPONSE-ROWS");
        _wechDynamicResponseRows.setByteLength(3);
        _wechDynamicResponseRows.setTotalDigits(3);
        _wechDynamicResponseRows.setIsODOObject(true);
        _wechErrorRows = BF.createZonedDecimalBinding("WechErrorRows",
               "WechErrorRows", Integer.class, this);
        _wechErrorRows.setCobolName("WECH-ERROR-ROWS");
        _wechErrorRows.setByteLength(3);
        _wechErrorRows.setTotalDigits(3);
        _wechErrorRows.setIsODOObject(true);
        _wechAdditionalPageKeys = BF.createStringBinding("WechAdditionalPageKeys",
               "WechAdditionalPageKeys", String.class, this);
        _wechAdditionalPageKeys.setCobolName("WECH-ADDITIONAL-PAGE-KEYS");
        _wechAdditionalPageKeys.setByteLength(1);
        _iStaticData = new IStaticDataBinding("IStaticData",
               "IStaticData", this, null);
        _iStaticData.setCobolName("I-STATIC-DATA");
        _iStaticData.setByteLength(46);
        _iStaticData.setMaxOccurs(1);
        _iStaticData.setDependingOn("WECH-REQUEST-ROWS");
        _oDynamicDataWrapperItem = new ODynamicDataBinding("ODynamicDataWrapperItem",
               "ODynamicData", this, null);
        _oDynamicDataWrapper = new ODynamicDataWrapperBinding("ODynamicDataWrapper",
               "ODynamicData", this, _oDynamicDataWrapperItem);
        _oDynamicDataWrapper.setCobolName("O-DYNAMIC-DATA");
        _oDynamicDataWrapper.setByteLength(16698);
        _oDynamicDataWrapper.setItemByteLength(46);
        _oDynamicDataWrapper.setMaxOccurs(363);
        _oDynamicDataWrapper.setDependingOn("WECH-DYNAMIC-RESPONSE-ROWS");
        _wellpointEaiEbsErrorRowWrapperItem = new WellpointEaiEbsErrorRowBinding("WellpointEaiEbsErrorRowWrapperItem",
               "WellpointEaiEbsErrorRow", this, null);
        _wellpointEaiEbsErrorRowWrapper = new WellpointEaiEbsErrorRowWrapperBinding("WellpointEaiEbsErrorRowWrapper",
               "WellpointEaiEbsErrorRow", this, _wellpointEaiEbsErrorRowWrapperItem);
        _wellpointEaiEbsErrorRowWrapper.setCobolName("WELLPOINT-EAI-EBS-ERROR-ROW");
        _wellpointEaiEbsErrorRowWrapper.setByteLength(3168);
        _wellpointEaiEbsErrorRowWrapper.setItemByteLength(32);
        _wellpointEaiEbsErrorRowWrapper.setMaxOccurs(99);
        _wellpointEaiEbsErrorRowWrapper.setDependingOn("WECH-ERROR-ROWS");

        /* Add children to children list */
        getChildrenList().add(_wechRequestRows);
        getChildrenList().add(_wechDynamicResponseRows);
        getChildrenList().add(_wechErrorRows);
        getChildrenList().add(_wechAdditionalPageKeys);
        getChildrenList().add(_iStaticData);
        getChildrenList().add(_oDynamicDataWrapper);
        getChildrenList().add(_wellpointEaiEbsErrorRowWrapper);
 
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
        mValueObject = mValueObjectFactory.createPayload();
    }

    /** {@inheritDoc} */
    public void setChildrenValues() throws HostException {

         /* Make sure there is an associated Value object*/
        if (mValueObject == null) {
            createValueObject();
        }
        /* Get Value object property _wechRequestRows */
        if (_log.isDebugEnabled()) {
            _log.debug("Getting value from Value object property "
                    + "_wechRequestRows"
                    + " value=" + mValueObject.getWechRequestRows());
        }
        _wechRequestRows.setObjectValue(mValueObject.getWechRequestRows());
        /* Get Value object property _wechDynamicResponseRows */
        if (_log.isDebugEnabled()) {
            _log.debug("Getting value from Value object property "
                    + "_wechDynamicResponseRows"
                    + " value=" + mValueObject.getWechDynamicResponseRows());
        }
        _wechDynamicResponseRows.setObjectValue(mValueObject.getWechDynamicResponseRows());
        /* Get Value object property _wechErrorRows */
        if (_log.isDebugEnabled()) {
            _log.debug("Getting value from Value object property "
                    + "_wechErrorRows"
                    + " value=" + mValueObject.getWechErrorRows());
        }
        _wechErrorRows.setObjectValue(mValueObject.getWechErrorRows());
        /* Get Value object property _wechAdditionalPageKeys */
        if (_log.isDebugEnabled()) {
            _log.debug("Getting value from Value object property "
                    + "_wechAdditionalPageKeys"
                    + " value=" + mValueObject.getWechAdditionalPageKeys());
        }
        _wechAdditionalPageKeys.setObjectValue(mValueObject.getWechAdditionalPageKeys());
        /* Get Value object property _iStaticData */
        if (_log.isDebugEnabled()) {
            _log.debug("Getting value from Value object property "
                    + "_iStaticData"
                    + " value=" + mValueObject.getIStaticData());
        }
        _iStaticData.setObjectValue(mValueObject.getIStaticData());
        /* If object exist make sure associated counter is 1 */
        if (null != mValueObject.getIStaticData()) {
            setCounterValue(_iStaticData.getDependingOn(), 1);
        }
        /* Get Value object property _oDynamicDataWrapper */
        if (_log.isDebugEnabled()) {
            _log.debug("Getting value from Value object property "
                    + "_oDynamicDataWrapper"
                    + " value=" + mValueObject.getODynamicData());
        }
        _oDynamicDataWrapper.setObjectValue(mValueObject.getODynamicData());
        /* For variable size array or list, we make sure any
         * associated counter is updated */
        setCounterValue(_oDynamicDataWrapper.getDependingOn(),
                ((List < ? >) mValueObject.getODynamicData()).size());
        /* Get Value object property _wellpointEaiEbsErrorRowWrapper */
        if (_log.isDebugEnabled()) {
            _log.debug("Getting value from Value object property "
                    + "_wellpointEaiEbsErrorRowWrapper"
                    + " value=" + mValueObject.getWellpointEaiEbsErrorRow());
        }
        _wellpointEaiEbsErrorRowWrapper.setObjectValue(mValueObject.getWellpointEaiEbsErrorRow());
        /* For variable size array or list, we make sure any
         * associated counter is updated */
        setCounterValue(_wellpointEaiEbsErrorRowWrapper.getDependingOn(),
                ((List < ? >) mValueObject.getWellpointEaiEbsErrorRow()).size());
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
            mValueObject.setWechRequestRows((Integer) bindingValue);
            break;
        case 1:
            bindingValue = child.getObjectValue(Integer.class);
            mValueObject.setWechDynamicResponseRows((Integer) bindingValue);
            break;
        case 2:
            bindingValue = child.getObjectValue(Integer.class);
            mValueObject.setWechErrorRows((Integer) bindingValue);
            break;
        case 3:
            bindingValue = child.getObjectValue(String.class);
            mValueObject.setWechAdditionalPageKeys((String) bindingValue);
            break;
        case 4:
            bindingValue = child.getObjectValue(IStaticData.class);
            mValueObject.setIStaticData((IStaticData) bindingValue);
            break;
        case 5:
            bindingValue = child.getObjectValue(ODynamicData.class);
            List < ODynamicData > listODynamicDataWrapper = cast(bindingValue);
            mValueObject.getODynamicData().clear();
            mValueObject.getODynamicData().addAll(listODynamicDataWrapper);
            break;
        case 6:
            bindingValue = child.getObjectValue(WellpointEaiEbsErrorRow.class);
            List < WellpointEaiEbsErrorRow > listWellpointEaiEbsErrorRowWrapper = cast(bindingValue);
            mValueObject.getWellpointEaiEbsErrorRow().clear();
            mValueObject.getWellpointEaiEbsErrorRow().addAll(listWellpointEaiEbsErrorRowWrapper);
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
        if (type.equals(Payload.class)) {
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
        if (bindingValue.getClass().equals(Payload.class)) {
            mValueObject = (Payload) bindingValue;
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
    public Payload getPayload() {
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

