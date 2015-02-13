

package com.legstar.test.coxb.ardo02.bind;

import com.legstar.coxb.ICobolBinding;
import com.legstar.coxb.common.CChoiceBinding;
import com.legstar.coxb.ICobolComplexBinding;
import com.legstar.test.coxb.ardo02.AlternativeA;
import com.legstar.test.coxb.ardo02.AlternativeB;
import com.legstar.coxb.host.HostException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.legstar.test.coxb.ardo02.Ardo02Record;

/**
 * LegStar Binding for Choice element:
 *   AlternativeA
 *   AlternativeB
 * 
 * Represents a choice between 2 or more elements. A choice maps to a cobol
 * REDEFINES clause exposed as an xs:choice in the corresponding XML schema
 * 
 * This class was generated by LegStar Binding generator.
 */
public class AlternativeAChoiceBinding 
             extends CChoiceBinding {

    /** Alternative binding bound to value object property AlternativeA(AlternativeA). */
    public ICobolComplexBinding _alternativeA;
    /** Alternative binding bound to value object property AlternativeB(AlternativeB). */
    public ICobolComplexBinding _alternativeB;

    /** Logger. */
    private final Log _log = LogFactory.getLog(getClass());

    
    /**
     * Constructor for a Choice element.
     * 
     * @param bindingName the identifier for this binding
     * @param parentBinding a reference to the parent binding
     */
    public AlternativeAChoiceBinding(
            final String bindingName,
            final ICobolComplexBinding parentBinding) {
        
        super(bindingName, null, parentBinding);
        initAlternatives();
    }

    /** Creates a binding property for each alternative. */
    private void initAlternatives() {
        if (_log.isDebugEnabled()) {
            _log.debug("Initializing started");
        }
        /* Create binding alternatives instances */

        _alternativeA = new AlternativeABinding("AlternativeA",
               "AlternativeA", getParentBinding(), null);
        _alternativeA.setCobolName("ALTERNATIVE-A");
        _alternativeA.setByteLength(2);
        _alternativeA.setIsRedefined(true);
        _alternativeB = new AlternativeBBinding("AlternativeB",
               "AlternativeB", getParentBinding(), null);
        _alternativeB.setCobolName("ALTERNATIVE-B");
        _alternativeB.setByteLength(2);
        _alternativeB.setRedefines("ALTERNATIVE-A");

        /* Add alternatives to alternatives list */
        addAlternative(_alternativeA);
        addAlternative(_alternativeB);
 
        if (_log.isDebugEnabled()) {
            _log.debug("Initializing successful");
        }
    }
 
    /** {@inheritDoc} */
    public void setAlternativesValues() throws HostException {
        Object value;
        value = getArdo02Record().getAlternativeA();
        if (_log.isDebugEnabled()) {
            _log.debug("Getting value from Value object property "
                    + "AlternativeA"
                    + " value=" + value);
        }
        _alternativeA.setObjectValue(value);
        value = getArdo02Record().getAlternativeB();
        if (_log.isDebugEnabled()) {
            _log.debug("Getting value from Value object property "
                    + "AlternativeB"
                    + " value=" + value);
        }
        _alternativeB.setObjectValue(value);

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
            getArdo02Record().setAlternativeA(
                (AlternativeA) bindingValue);
            break;
        case 1:
            getArdo02Record().setAlternativeB(
                (AlternativeB) bindingValue);
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
        return ((Ardo02RecordBinding) getParentBinding()).getArdo02Record();
    }

    /**
     * @return the Value object bound to the parent of this choice
     * @throws HostException if parent bound Value object cannot be retrieved
     */
    public Ardo02Record getArdo02Record() throws HostException {
        return (Ardo02Record) getParentValueObject();
    }
    
}
