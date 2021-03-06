

package com.legstar.test.coxb.redsimpt.bind;

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

import com.legstar.test.coxb.redsimpt.Dfhcommarea;

/**
 * LegStar Binding for Choice element:
 *   CDefinition1
 *   CDefinition2
 * 
 * Represents a choice between 2 or more elements. A choice maps to a cobol
 * REDEFINES clause exposed as an xs:choice in the corresponding XML schema
 * 
 * This class was generated by LegStar Binding generator.
 */
public class CDefinition1ChoiceBinding 
             extends CChoiceBinding {

    /** Alternative binding bound to value object property CDefinition1(String). */
    public ICobolStringBinding _cDefinition1;
    /** Alternative binding bound to value object property CDefinition2(Long). */
    public ICobolZonedDecimalBinding _cDefinition2;

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
    public CDefinition1ChoiceBinding(
            final String bindingName,
            final ICobolComplexBinding parentBinding) {
        
        super(bindingName, null, parentBinding);
        setUnmarshalChoiceStrategyClassName(
            "com.legstar.coxb.cust.redsimpt.ChoiceSelector");
        initAlternatives();
    }

    /** Creates a binding property for each alternative. */
    private void initAlternatives() {
        if (_log.isDebugEnabled()) {
            _log.debug("Initializing started");
        }
        /* Create binding alternatives instances */

        _cDefinition1 = BF.createStringBinding("CDefinition1",
               "CDefinition1", String.class, getParentBinding());
        _cDefinition1.setCobolName("C-DEFINITION-1");
        _cDefinition1.setByteLength(18);
        _cDefinition1.setIsRedefined(true);
        _cDefinition1.setUnmarshalChoiceStrategyClassName(
            "com.legstar.coxb.cust.redsimpt.ChoiceSelector");
        _cDefinition2 = BF.createZonedDecimalBinding("CDefinition2",
               "CDefinition2", Long.class, getParentBinding());
        _cDefinition2.setCobolName("C-DEFINITION-2");
        _cDefinition2.setByteLength(18);
        _cDefinition2.setTotalDigits(18);
        _cDefinition2.setRedefines("C-DEFINITION-1");

        /* Add alternatives to alternatives list */
        addAlternative(_cDefinition1);
        addAlternative(_cDefinition2);
 
        if (_log.isDebugEnabled()) {
            _log.debug("Initializing successful");
        }
    }
 
    /** {@inheritDoc} */
    public void setAlternativesValues() throws HostException {
        Object value;
        value = getDfhcommarea().getCDefinition1();
        if (_log.isDebugEnabled()) {
            _log.debug("Getting value from Value object property "
                    + "CDefinition1"
                    + " value=" + value);
        }
        _cDefinition1.setObjectValue(value);
        value = getDfhcommarea().getCDefinition2();
        if (_log.isDebugEnabled()) {
            _log.debug("Getting value from Value object property "
                    + "CDefinition2"
                    + " value=" + value);
        }
        _cDefinition2.setObjectValue(value);

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
            getDfhcommarea().setCDefinition1(
                (String) bindingValue);
            break;
        case 1:
            getDfhcommarea().setCDefinition2(
                (Long) bindingValue);
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
        return ((DfhcommareaBinding) getParentBinding()).getDfhcommarea();
    }

    /**
     * @return the Value object bound to the parent of this choice
     * @throws HostException if parent bound Value object cannot be retrieved
     */
    public Dfhcommarea getDfhcommarea() throws HostException {
        return (Dfhcommarea) getParentValueObject();
    }
    
}

