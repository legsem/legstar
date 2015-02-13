


package com.legstar.test.coxb.typesmix.bind;

import com.legstar.coxb.ICobolBinding;
import com.legstar.coxb.common.CComplexBinding;
import com.legstar.coxb.ICobolStringBinding;
import com.legstar.coxb.CobolBindingFactory;
import com.legstar.coxb.ICobolBindingFactory;
import com.legstar.coxb.ICobolNationalBinding;
import com.legstar.coxb.ICobolDbcsBinding;
import com.legstar.coxb.ICobolOctetStreamBinding;
import com.legstar.coxb.ICobolFloatBinding;
import com.legstar.coxb.ICobolDoubleBinding;
import com.legstar.coxb.ICobolPackedDecimalBinding;
import java.math.BigDecimal;
import com.legstar.coxb.ICobolZonedDecimalBinding;
import com.legstar.coxb.ICobolBinaryBinding;
import com.legstar.coxb.ICobolComplexBinding;
import com.legstar.coxb.host.HostException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.legstar.test.coxb.typesmix.Dfhcommarea;
import com.legstar.test.coxb.typesmix.ObjectFactory;

/**
 * LegStar Binding for Complex element :
 *   Dfhcommarea.
 * 
 * This class was generated by LegStar Binding generator.
 */
public class DfhcommareaBinding 
             extends CComplexBinding {

    /** Value object to which this cobol complex element is bound. */
    private Dfhcommarea mValueObject;
  
    /** Indicates that the associated Value object just came from the constructor
     * and doesn't need to be recreated. */
    private boolean mUnusedValueObject = false;
    
    /** Maximum host bytes size for this complex object. */
    public static final int BYTE_LENGTH = 176;
    
    /** Child bound to value object property CAlphabetic(String). */
    public ICobolStringBinding _cAlphabetic;
    /** Child bound to value object property CNational(String). */
    public ICobolNationalBinding _cNational;
    /** Child bound to value object property CDbcs(String). */
    public ICobolDbcsBinding _cDbcs;
    /** Child bound to value object property CAlphanumericEdited(String). */
    public ICobolStringBinding _cAlphanumericEdited;
    /** Child bound to value object property CAlphanumeric(String). */
    public ICobolStringBinding _cAlphanumeric;
    /** Child bound to value object property COctetString(byte[]). */
    public ICobolOctetStreamBinding _cOctetString;
    /** Child bound to value object property CSingleFloat(Float). */
    public ICobolFloatBinding _cSingleFloat;
    /** Child bound to value object property CDoubleFloat(Double). */
    public ICobolDoubleBinding _cDoubleFloat;
    /** Child bound to value object property CPackedDecimal(BigDecimal). */
    public ICobolPackedDecimalBinding _cPackedDecimal;
    /** Child bound to value object property CZonedDecimal(Long). */
    public ICobolZonedDecimalBinding _cZonedDecimal;
    /** Child bound to value object property CNumericEdited1(String). */
    public ICobolStringBinding _cNumericEdited1;
    /** Child bound to value object property CNumericEdited2(String). */
    public ICobolStringBinding _cNumericEdited2;
    /** Child bound to value object property CNumericEdited3(String). */
    public ICobolStringBinding _cNumericEdited3;
    /** Child bound to value object property CNumericEdited4(String). */
    public ICobolStringBinding _cNumericEdited4;
    /** Child bound to value object property CIndex(byte[]). */
    public ICobolOctetStreamBinding _cIndex;
    /** Child bound to value object property CPointer(byte[]). */
    public ICobolOctetStreamBinding _cPointer;
    /** Child bound to value object property CProcPointer(byte[]). */
    public ICobolOctetStreamBinding _cProcPointer;
    /** Child bound to value object property CFuncPointer(byte[]). */
    public ICobolOctetStreamBinding _cFuncPointer;
    /** Child bound to value object property CExternalFloating(String). */
    public ICobolStringBinding _cExternalFloating;
    /** Child bound to value object property CBinary(Integer). */
    public ICobolBinaryBinding _cBinary;
    /** Child bound to value object property CNativeBinary(Integer). */
    public ICobolBinaryBinding _cNativeBinary;
            
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
    public DfhcommareaBinding() {
        this(null);
    }

    /**
     * Constructor for a root Complex element with a bound Value object.
     * 
     * @param valueObject the concrete Value object instance bound to this
     *        complex element
     */
    public DfhcommareaBinding(
            final Dfhcommarea valueObject) {
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
    public DfhcommareaBinding(
            final String bindingName,
            final String fieldName,
            final ICobolComplexBinding parentBinding,
            final Dfhcommarea valueObject) {
        
        super(bindingName, fieldName, Dfhcommarea.class, null, parentBinding);
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

        _cAlphabetic = BF.createStringBinding("CAlphabetic",
               "CAlphabetic", String.class, this);
        _cAlphabetic.setCobolName("C-ALPHABETIC");
        _cAlphabetic.setByteLength(5);
        _cNational = BF.createNationalBinding("CNational",
               "CNational", String.class, this);
        _cNational.setCobolName("C-NATIONAL");
        _cNational.setByteLength(18);
        _cDbcs = BF.createDbcsBinding("CDbcs",
               "CDbcs", String.class, this);
        _cDbcs.setCobolName("C-DBCS");
        _cDbcs.setByteLength(8);
        _cAlphanumericEdited = BF.createStringBinding("CAlphanumericEdited",
               "CAlphanumericEdited", String.class, this);
        _cAlphanumericEdited.setCobolName("C-ALPHANUMERIC-EDITED");
        _cAlphanumericEdited.setByteLength(14);
        _cAlphanumeric = BF.createStringBinding("CAlphanumeric",
               "CAlphanumeric", String.class, this);
        _cAlphanumeric.setCobolName("C-ALPHANUMERIC");
        _cAlphanumeric.setByteLength(7);
        _cOctetString = BF.createOctetStreamBinding("COctetString",
               "COctetString", byte[].class, this);
        _cOctetString.setCobolName("C-OCTET-STRING");
        _cOctetString.setByteLength(8);
        _cSingleFloat = BF.createFloatBinding("CSingleFloat",
               "CSingleFloat", Float.class, this);
        _cSingleFloat.setCobolName("C-SINGLE-FLOAT");
        _cSingleFloat.setByteLength(4);
        _cDoubleFloat = BF.createDoubleBinding("CDoubleFloat",
               "CDoubleFloat", Double.class, this);
        _cDoubleFloat.setCobolName("C-DOUBLE-FLOAT");
        _cDoubleFloat.setByteLength(8);
        _cPackedDecimal = BF.createPackedDecimalBinding("CPackedDecimal",
               "CPackedDecimal", BigDecimal.class, this);
        _cPackedDecimal.setCobolName("C-PACKED-DECIMAL");
        _cPackedDecimal.setByteLength(9);
        _cPackedDecimal.setTotalDigits(17);
        _cPackedDecimal.setFractionDigits(2);
        _cPackedDecimal.setIsSigned(true);
        _cZonedDecimal = BF.createZonedDecimalBinding("CZonedDecimal",
               "CZonedDecimal", Long.class, this);
        _cZonedDecimal.setCobolName("C-ZONED-DECIMAL");
        _cZonedDecimal.setByteLength(14);
        _cZonedDecimal.setTotalDigits(14);
        _cZonedDecimal.setIsSigned(true);
        _cNumericEdited1 = BF.createStringBinding("CNumericEdited1",
               "CNumericEdited1", String.class, this);
        _cNumericEdited1.setCobolName("C-NUMERIC-EDITED-1");
        _cNumericEdited1.setByteLength(8);
        _cNumericEdited1.setTotalDigits(4);
        _cNumericEdited2 = BF.createStringBinding("CNumericEdited2",
               "CNumericEdited2", String.class, this);
        _cNumericEdited2.setCobolName("C-NUMERIC-EDITED-2");
        _cNumericEdited2.setByteLength(16);
        _cNumericEdited2.setTotalDigits(11);
        _cNumericEdited2.setFractionDigits(3);
        _cNumericEdited3 = BF.createStringBinding("CNumericEdited3",
               "CNumericEdited3", String.class, this);
        _cNumericEdited3.setCobolName("C-NUMERIC-EDITED-3");
        _cNumericEdited3.setByteLength(10);
        _cNumericEdited3.setTotalDigits(9);
        _cNumericEdited3.setFractionDigits(2);
        _cNumericEdited4 = BF.createStringBinding("CNumericEdited4",
               "CNumericEdited4", String.class, this);
        _cNumericEdited4.setCobolName("C-NUMERIC-EDITED-4");
        _cNumericEdited4.setByteLength(11);
        _cNumericEdited4.setTotalDigits(9);
        _cNumericEdited4.setFractionDigits(3);
        _cNumericEdited4.setIsSigned(true);
        _cIndex = BF.createOctetStreamBinding("CIndex",
               "CIndex", byte[].class, this);
        _cIndex.setCobolName("C-INDEX");
        _cIndex.setByteLength(4);
        _cPointer = BF.createOctetStreamBinding("CPointer",
               "CPointer", byte[].class, this);
        _cPointer.setCobolName("C-POINTER");
        _cPointer.setByteLength(4);
        _cProcPointer = BF.createOctetStreamBinding("CProcPointer",
               "CProcPointer", byte[].class, this);
        _cProcPointer.setCobolName("C-PROC-POINTER");
        _cProcPointer.setByteLength(8);
        _cFuncPointer = BF.createOctetStreamBinding("CFuncPointer",
               "CFuncPointer", byte[].class, this);
        _cFuncPointer.setCobolName("C-FUNC-POINTER");
        _cFuncPointer.setByteLength(4);
        _cExternalFloating = BF.createStringBinding("CExternalFloating",
               "CExternalFloating", String.class, this);
        _cExternalFloating.setCobolName("C-EXTERNAL-FLOATING");
        _cExternalFloating.setByteLength(10);
        _cBinary = BF.createBinaryBinding("CBinary",
               "CBinary", Integer.class, this);
        _cBinary.setCobolName("C-BINARY");
        _cBinary.setByteLength(4);
        _cBinary.setTotalDigits(9);
        _cBinary.setIsSigned(true);
        _cNativeBinary = BF.createBinaryBinding("CNativeBinary",
               "CNativeBinary", Integer.class, this);
        _cNativeBinary.setCobolName("C-NATIVE-BINARY");
        _cNativeBinary.setByteLength(2);
        _cNativeBinary.setTotalDigits(4);

        /* Add children to children list */
        getChildrenList().add(_cAlphabetic);
        getChildrenList().add(_cNational);
        getChildrenList().add(_cDbcs);
        getChildrenList().add(_cAlphanumericEdited);
        getChildrenList().add(_cAlphanumeric);
        getChildrenList().add(_cOctetString);
        getChildrenList().add(_cSingleFloat);
        getChildrenList().add(_cDoubleFloat);
        getChildrenList().add(_cPackedDecimal);
        getChildrenList().add(_cZonedDecimal);
        getChildrenList().add(_cNumericEdited1);
        getChildrenList().add(_cNumericEdited2);
        getChildrenList().add(_cNumericEdited3);
        getChildrenList().add(_cNumericEdited4);
        getChildrenList().add(_cIndex);
        getChildrenList().add(_cPointer);
        getChildrenList().add(_cProcPointer);
        getChildrenList().add(_cFuncPointer);
        getChildrenList().add(_cExternalFloating);
        getChildrenList().add(_cBinary);
        getChildrenList().add(_cNativeBinary);
 
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
        mValueObject = mValueObjectFactory.createDfhcommarea();
    }

    /** {@inheritDoc} */
    public void setChildrenValues() throws HostException {

         /* Make sure there is an associated Value object*/
        if (mValueObject == null) {
            createValueObject();
        }
        /* Get Value object property _cAlphabetic */
        if (_log.isDebugEnabled()) {
            _log.debug("Getting value from Value object property "
                    + "_cAlphabetic"
                    + " value=" + mValueObject.getCAlphabetic());
        }
        _cAlphabetic.setObjectValue(mValueObject.getCAlphabetic());
        /* Get Value object property _cNational */
        if (_log.isDebugEnabled()) {
            _log.debug("Getting value from Value object property "
                    + "_cNational"
                    + " value=" + mValueObject.getCNational());
        }
        _cNational.setObjectValue(mValueObject.getCNational());
        /* Get Value object property _cDbcs */
        if (_log.isDebugEnabled()) {
            _log.debug("Getting value from Value object property "
                    + "_cDbcs"
                    + " value=" + mValueObject.getCDbcs());
        }
        _cDbcs.setObjectValue(mValueObject.getCDbcs());
        /* Get Value object property _cAlphanumericEdited */
        if (_log.isDebugEnabled()) {
            _log.debug("Getting value from Value object property "
                    + "_cAlphanumericEdited"
                    + " value=" + mValueObject.getCAlphanumericEdited());
        }
        _cAlphanumericEdited.setObjectValue(mValueObject.getCAlphanumericEdited());
        /* Get Value object property _cAlphanumeric */
        if (_log.isDebugEnabled()) {
            _log.debug("Getting value from Value object property "
                    + "_cAlphanumeric"
                    + " value=" + mValueObject.getCAlphanumeric());
        }
        _cAlphanumeric.setObjectValue(mValueObject.getCAlphanumeric());
        /* Get Value object property _cOctetString */
        if (_log.isDebugEnabled()) {
            _log.debug("Getting value from Value object property "
                    + "_cOctetString"
                    + " value=" + mValueObject.getCOctetString());
        }
        _cOctetString.setObjectValue(mValueObject.getCOctetString());
        /* Get Value object property _cSingleFloat */
        if (_log.isDebugEnabled()) {
            _log.debug("Getting value from Value object property "
                    + "_cSingleFloat"
                    + " value=" + mValueObject.getCSingleFloat());
        }
        _cSingleFloat.setObjectValue(mValueObject.getCSingleFloat());
        /* Get Value object property _cDoubleFloat */
        if (_log.isDebugEnabled()) {
            _log.debug("Getting value from Value object property "
                    + "_cDoubleFloat"
                    + " value=" + mValueObject.getCDoubleFloat());
        }
        _cDoubleFloat.setObjectValue(mValueObject.getCDoubleFloat());
        /* Get Value object property _cPackedDecimal */
        if (_log.isDebugEnabled()) {
            _log.debug("Getting value from Value object property "
                    + "_cPackedDecimal"
                    + " value=" + mValueObject.getCPackedDecimal());
        }
        _cPackedDecimal.setObjectValue(mValueObject.getCPackedDecimal());
        /* Get Value object property _cZonedDecimal */
        if (_log.isDebugEnabled()) {
            _log.debug("Getting value from Value object property "
                    + "_cZonedDecimal"
                    + " value=" + mValueObject.getCZonedDecimal());
        }
        _cZonedDecimal.setObjectValue(mValueObject.getCZonedDecimal());
        /* Get Value object property _cNumericEdited1 */
        if (_log.isDebugEnabled()) {
            _log.debug("Getting value from Value object property "
                    + "_cNumericEdited1"
                    + " value=" + mValueObject.getCNumericEdited1());
        }
        _cNumericEdited1.setObjectValue(mValueObject.getCNumericEdited1());
        /* Get Value object property _cNumericEdited2 */
        if (_log.isDebugEnabled()) {
            _log.debug("Getting value from Value object property "
                    + "_cNumericEdited2"
                    + " value=" + mValueObject.getCNumericEdited2());
        }
        _cNumericEdited2.setObjectValue(mValueObject.getCNumericEdited2());
        /* Get Value object property _cNumericEdited3 */
        if (_log.isDebugEnabled()) {
            _log.debug("Getting value from Value object property "
                    + "_cNumericEdited3"
                    + " value=" + mValueObject.getCNumericEdited3());
        }
        _cNumericEdited3.setObjectValue(mValueObject.getCNumericEdited3());
        /* Get Value object property _cNumericEdited4 */
        if (_log.isDebugEnabled()) {
            _log.debug("Getting value from Value object property "
                    + "_cNumericEdited4"
                    + " value=" + mValueObject.getCNumericEdited4());
        }
        _cNumericEdited4.setObjectValue(mValueObject.getCNumericEdited4());
        /* Get Value object property _cIndex */
        if (_log.isDebugEnabled()) {
            _log.debug("Getting value from Value object property "
                    + "_cIndex"
                    + " value=" + mValueObject.getCIndex());
        }
        _cIndex.setObjectValue(mValueObject.getCIndex());
        /* Get Value object property _cPointer */
        if (_log.isDebugEnabled()) {
            _log.debug("Getting value from Value object property "
                    + "_cPointer"
                    + " value=" + mValueObject.getCPointer());
        }
        _cPointer.setObjectValue(mValueObject.getCPointer());
        /* Get Value object property _cProcPointer */
        if (_log.isDebugEnabled()) {
            _log.debug("Getting value from Value object property "
                    + "_cProcPointer"
                    + " value=" + mValueObject.getCProcPointer());
        }
        _cProcPointer.setObjectValue(mValueObject.getCProcPointer());
        /* Get Value object property _cFuncPointer */
        if (_log.isDebugEnabled()) {
            _log.debug("Getting value from Value object property "
                    + "_cFuncPointer"
                    + " value=" + mValueObject.getCFuncPointer());
        }
        _cFuncPointer.setObjectValue(mValueObject.getCFuncPointer());
        /* Get Value object property _cExternalFloating */
        if (_log.isDebugEnabled()) {
            _log.debug("Getting value from Value object property "
                    + "_cExternalFloating"
                    + " value=" + mValueObject.getCExternalFloating());
        }
        _cExternalFloating.setObjectValue(mValueObject.getCExternalFloating());
        /* Get Value object property _cBinary */
        if (_log.isDebugEnabled()) {
            _log.debug("Getting value from Value object property "
                    + "_cBinary"
                    + " value=" + mValueObject.getCBinary());
        }
        _cBinary.setObjectValue(mValueObject.getCBinary());
        /* Get Value object property _cNativeBinary */
        if (_log.isDebugEnabled()) {
            _log.debug("Getting value from Value object property "
                    + "_cNativeBinary"
                    + " value=" + mValueObject.getCNativeBinary());
        }
        _cNativeBinary.setObjectValue(mValueObject.getCNativeBinary());
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
            mValueObject.setCAlphabetic((String) bindingValue);
            break;
        case 1:
            bindingValue = child.getObjectValue(String.class);
            mValueObject.setCNational((String) bindingValue);
            break;
        case 2:
            bindingValue = child.getObjectValue(String.class);
            mValueObject.setCDbcs((String) bindingValue);
            break;
        case 3:
            bindingValue = child.getObjectValue(String.class);
            mValueObject.setCAlphanumericEdited((String) bindingValue);
            break;
        case 4:
            bindingValue = child.getObjectValue(String.class);
            mValueObject.setCAlphanumeric((String) bindingValue);
            break;
        case 5:
            bindingValue = child.getObjectValue(byte[].class);
            mValueObject.setCOctetString((byte[]) bindingValue);
            break;
        case 6:
            bindingValue = child.getObjectValue(Float.class);
            mValueObject.setCSingleFloat((Float) bindingValue);
            break;
        case 7:
            bindingValue = child.getObjectValue(Double.class);
            mValueObject.setCDoubleFloat((Double) bindingValue);
            break;
        case 8:
            bindingValue = child.getObjectValue(BigDecimal.class);
            mValueObject.setCPackedDecimal((BigDecimal) bindingValue);
            break;
        case 9:
            bindingValue = child.getObjectValue(Long.class);
            mValueObject.setCZonedDecimal((Long) bindingValue);
            break;
        case 10:
            bindingValue = child.getObjectValue(String.class);
            mValueObject.setCNumericEdited1((String) bindingValue);
            break;
        case 11:
            bindingValue = child.getObjectValue(String.class);
            mValueObject.setCNumericEdited2((String) bindingValue);
            break;
        case 12:
            bindingValue = child.getObjectValue(String.class);
            mValueObject.setCNumericEdited3((String) bindingValue);
            break;
        case 13:
            bindingValue = child.getObjectValue(String.class);
            mValueObject.setCNumericEdited4((String) bindingValue);
            break;
        case 14:
            bindingValue = child.getObjectValue(byte[].class);
            mValueObject.setCIndex((byte[]) bindingValue);
            break;
        case 15:
            bindingValue = child.getObjectValue(byte[].class);
            mValueObject.setCPointer((byte[]) bindingValue);
            break;
        case 16:
            bindingValue = child.getObjectValue(byte[].class);
            mValueObject.setCProcPointer((byte[]) bindingValue);
            break;
        case 17:
            bindingValue = child.getObjectValue(byte[].class);
            mValueObject.setCFuncPointer((byte[]) bindingValue);
            break;
        case 18:
            bindingValue = child.getObjectValue(String.class);
            mValueObject.setCExternalFloating((String) bindingValue);
            break;
        case 19:
            bindingValue = child.getObjectValue(Integer.class);
            mValueObject.setCBinary((Integer) bindingValue);
            break;
        case 20:
            bindingValue = child.getObjectValue(Integer.class);
            mValueObject.setCNativeBinary((Integer) bindingValue);
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
        if (type.equals(Dfhcommarea.class)) {
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
        if (bindingValue.getClass().equals(Dfhcommarea.class)) {
            mValueObject = (Dfhcommarea) bindingValue;
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
    public Dfhcommarea getDfhcommarea() {
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

