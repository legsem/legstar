

package com.legstar.test.coxb.redopera.bind;

import com.legstar.coxb.ICobolBinding;
import com.legstar.coxb.common.CChoiceBinding;
import com.legstar.coxb.ICobolStringBinding;
import com.legstar.coxb.CobolBindingFactory;
import com.legstar.coxb.ICobolBindingFactory;
import com.legstar.coxb.ICobolComplexBinding;
import com.legstar.test.coxb.redopera.Filler25;
import com.legstar.test.coxb.redopera.Filler28;
import com.legstar.coxb.host.HostException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.legstar.test.coxb.redopera.Dfhcommarea;

/**
 * LegStar Binding for Choice element:
 *   CData
 *   Filler25
 *   Filler28
 * 
 * Represents a choice between 2 or more elements. A choice maps to a cobol
 * REDEFINES clause exposed as an xs:choice in the corresponding XML schema
 * 
 * This class was generated by LegStar Binding generator.
 */
public class CDataChoiceBinding 
             extends CChoiceBinding {

    /** Alternative binding bound to value object property CData(String). */
    public ICobolStringBinding _cData;
    /** Alternative binding bound to value object property Filler25(Filler25). */
    public ICobolComplexBinding _filler25;
    /** Alternative binding bound to value object property Filler28(Filler28). */
    public ICobolComplexBinding _filler28;

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
    public CDataChoiceBinding(
            final String bindingName,
            final ICobolComplexBinding parentBinding) {
        
        super(bindingName, null, parentBinding);
        setUnmarshalChoiceStrategyClassName(
            "com.legstar.coxb.cust.redopera.ChoiceSelector");
        initAlternatives();
    }

    /** Creates a binding property for each alternative. */
    private void initAlternatives() {
        if (_log.isDebugEnabled()) {
            _log.debug("Initializing started");
        }
        /* Create binding alternatives instances */

        _cData = BF.createStringBinding("CData",
               "CData", String.class, getParentBinding());
        _cData.setCobolName("C-DATA");
        _cData.setByteLength(200);
        _cData.setIsRedefined(true);
        _cData.setUnmarshalChoiceStrategyClassName(
            "com.legstar.coxb.cust.redopera.ChoiceSelector");
        _filler25 = new Filler25Binding("Filler25",
               "Filler25", getParentBinding(), null);
        _filler25.setCobolName("FILLER");
        _filler25.setByteLength(200);
        _filler25.setRedefines("C-DATA");
        _filler28 = new Filler28Binding("Filler28",
               "Filler28", getParentBinding(), null);
        _filler28.setCobolName("FILLER");
        _filler28.setByteLength(200);
        _filler28.setRedefines("C-DATA");

        /* Add alternatives to alternatives list */
        addAlternative(_cData);
        addAlternative(_filler25);
        addAlternative(_filler28);
 
        if (_log.isDebugEnabled()) {
            _log.debug("Initializing successful");
        }
    }
 
    /** {@inheritDoc} */
    public void setAlternativesValues() throws HostException {
        Object value;
        value = getDfhcommarea().getCData();
        if (_log.isDebugEnabled()) {
            _log.debug("Getting value from Value object property "
                    + "CData"
                    + " value=" + value);
        }
        _cData.setObjectValue(value);
        value = getDfhcommarea().getFiller25();
        if (_log.isDebugEnabled()) {
            _log.debug("Getting value from Value object property "
                    + "Filler25"
                    + " value=" + value);
        }
        _filler25.setObjectValue(value);
        value = getDfhcommarea().getFiller28();
        if (_log.isDebugEnabled()) {
            _log.debug("Getting value from Value object property "
                    + "Filler28"
                    + " value=" + value);
        }
        _filler28.setObjectValue(value);

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
            getDfhcommarea().setCData(
                (String) bindingValue);
            break;
        case 1:
            getDfhcommarea().setFiller25(
                (Filler25) bindingValue);
            break;
        case 2:
            getDfhcommarea().setFiller28(
                (Filler28) bindingValue);
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

