

package com.legstar.test.coxb.arrayscx.bind;

import com.legstar.coxb.ICobolBinding;
import com.legstar.coxb.common.CChoiceBinding;
import com.legstar.coxb.ICobolStringBinding;
import com.legstar.coxb.CobolBindingFactory;
import com.legstar.coxb.ICobolBindingFactory;
import com.legstar.coxb.ICobolZonedDecimalBinding;
import com.legstar.coxb.ICobolComplexBinding;
import com.legstar.coxb.host.HostException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.legstar.test.coxb.arrayscx.TableRedef;

/**
 * LegStar Binding for Choice element:
 *   ElementRedef1
 *   ElementRedef2
 * 
 * Represents a choice between 2 or more elements. A choice maps to a cobol
 * REDEFINES clause exposed as an xs:choice in the corresponding XML schema
 * 
 * This class was generated by LegStar Binding generator.
 */
public class ElementRedef1ChoiceBinding 
             extends CChoiceBinding {

    /** Alternative binding bound to value object property ElementRedef1(String). */
    public ICobolStringBinding _elementRedef1;
    /** Alternative binding bound to value object property ElementRedef2(Integer). */
    public ICobolZonedDecimalBinding _elementRedef2;

    /** Logger. */
    private final Log _log = LogFactory.getLog(getClass());

    /** Binding factory. */
    private static final ICobolBindingFactory BF
        = CobolBindingFactory.getBindingFactory();
    
    /**
     * Constructor for a Choice element.
     * 
     * @param bindingName the identifier for this binding
     * @param parentBinding a reference to the parent binding
     */
    public ElementRedef1ChoiceBinding(
            final String bindingName,
            final ICobolComplexBinding parentBinding) {
        
        super(bindingName, null, parentBinding);
        setUnmarshalChoiceStrategyClassName(
            "com.legstar.coxb.cust.arrayscx.ChoiceSelector");
        initAlternatives();
    }

    /** Creates a binding property for each alternative. */
    private void initAlternatives() {
        if (_log.isDebugEnabled()) {
            _log.debug("Initializing started");
        }
        /* Create binding alternatives instances */

        _elementRedef1 = BF.createStringBinding("ElementRedef1",
               "ElementRedef1", String.class, getParentBinding());
        _elementRedef1.setCobolName("ELEMENT-REDEF-1");
        _elementRedef1.setByteLength(3);
        _elementRedef1.setUnmarshalChoiceStrategyClassName(
            "com.legstar.coxb.cust.arrayscx.ChoiceSelector");
        _elementRedef2 = BF.createZonedDecimalBinding("ElementRedef2",
               "ElementRedef2", Integer.class, getParentBinding());
        _elementRedef2.setCobolName("ELEMENT-REDEF-2");
        _elementRedef2.setByteLength(3);
        _elementRedef2.setTotalDigits(3);
        _elementRedef2.setRedefines("ELEMENT-REDEF-1");

        /* Add alternatives to alternatives list */
        addAlternative(_elementRedef1);
        addAlternative(_elementRedef2);
 
        if (_log.isDebugEnabled()) {
            _log.debug("Initializing successful");
        }
    }
 
    /** {@inheritDoc} */
    public void setAlternativesValues() throws HostException {
        Object value;
        value = getTableRedef().getElementRedef1();
        if (value != null) {
            if (_log.isDebugEnabled()) {
                _log.debug("Getting value from Value object property "
                        + "ElementRedef1"
                        + " value=" + value);
            }
            _elementRedef1.setObjectValue(value);
        }
        value = getTableRedef().getElementRedef2();
        if (value != null) {
            if (_log.isDebugEnabled()) {
                _log.debug("Getting value from Value object property "
                        + "ElementRedef2"
                        + " value=" + value);
            }
            _elementRedef2.setObjectValue(value);
        }

    }
    /** {@inheritDoc} */
    public void setPropertyValue(
            final int index) throws HostException {
        /* Set the Value object property value from binding object */
        ICobolBinding alt = getAlternativesList().get(index);

      /* Alternatives that are not bound to a value object property are ignored.
       * This includes Choices and dynamically generated counters
       * for instance.  */
        if (!alt.isBound()) {
            return;
        }

        Object bindingValue = alt.getObjectValue(alt.getJaxbType());
        if (_log.isDebugEnabled()) {
            _log.debug("Setting value of Value object property "
                    + alt.getJaxbName()
                    + " value=" + bindingValue);
        }
        switch (index) {
        case 0:
            getTableRedef().setElementRedef1(
                (String) bindingValue);
            break;
        case 1:
            getTableRedef().setElementRedef2(
                (Integer) bindingValue);
            break;
        default:
            break;
        }
    }
    
    /** {@inheritDoc} */
    public Object getObjectValue(
            final Class < ? >  type) throws HostException {
        throw new HostException("Attempt to get value from choice binding "
                + getCobolName());
    }

    /** {@inheritDoc} */
    public void setObjectValue(final Object value) throws HostException {
        throw new HostException("Attempt to set value for choice binding "
                + getCobolName());
    }
    
    /** {@inheritDoc} */
    public boolean isSet() {
        /* A Choice is considered set if at least one of its alternatives
         * is set. */
        for (ICobolBinding alt : getAlternativesList()) {
            if (alt.isSet()) {
                return true;
            }
        }
        return false;
    }

    /** {@inheritDoc} */
    public Object getParentValueObject() throws HostException {
        return ((TableRedefBinding) getParentBinding()).getTableRedef();
    }

    /**
     * @return the Value object bound to the parent of this choice
     * @throws HostException if parent bound Value object cannot be retrieved
     */
    public TableRedef getTableRedef() throws HostException {
        return (TableRedef) getParentValueObject();
    }
    
}

