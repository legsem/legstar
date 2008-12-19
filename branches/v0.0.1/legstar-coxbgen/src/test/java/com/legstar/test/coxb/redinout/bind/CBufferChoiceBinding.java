/*******************************************************************************
 * LegStar legacy Web-enablement .
 * Copyright (C)  2007 LegSem
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA
 * 02110-1301  USA
 * 
 *     
 *****************************************************************************/

package com.legstar.test.coxb.redinout.bind;

import com.legstar.host.HostException;
import com.legstar.coxb.ICobolBinding;
import com.legstar.coxb.rt.CComplexBinding;

import com.legstar.coxb.rt.CChoiceBinding;
import com.legstar.coxb.rt.CStringBinding;

import com.legstar.test.coxb.redinout.DfhcommareaType;
import com.legstar.test.coxb.redinout.ObjectFactory;

/**
 * This class was generated by COXB version 1.0.
 * 2007-01-26T18:17:42.937+01:00
 * This class implements a bi-directional binding between a cobol structure and
 * a java object. Visitors can use this class to visit each element of the
 * structure in turn. No reflection or annotations are used which makes this
 * class suitable for heavy loads.
 */

public class CBufferChoiceBinding 
             extends CChoiceBinding
             implements ICobolBinding {
  
    /** Name of java property to which this cobol element is bound. */
    private static final String JAVA_NAME = "cBuffer";
  
    /** Type of java property to which this cobol element is bound. */
    private static final String JAVA_TYPE = "DfhcommareaType";
    
    /** Child property CStringBinding of simple type. */
    public CStringBinding cBuffer;
            
    /** Child property CParainTypeBinding of complex type. */
    public CParainTypeBinding cParain;
            
    /** Child property CParaoutTypeBinding of complex type. */
    public CParaoutTypeBinding cParaout;
            
    /** Java object to which this cobol complex array element is bound. */
    private DfhcommareaType mJaxbObject;
  
    /** Java object factory for objects creation. */
    private ObjectFactory mObjectFactory;
  
    /**
     * No argument constructor.
     */
    public CBufferChoiceBinding() {
        this(null, null, null);
    }
  
    /**
     * Constructor for a child complex binding which be later bound to a JAXB
     * object.
     * @param parentObject the parent binding
     */
    public CBufferChoiceBinding(
        final CComplexBinding parentObject) {
        this(parentObject, null, null);
    }
  
    /**
     * Constructor for a root complex binding without an initial bound object.
     * @param objectFactory the java factory to use to create children instances
     */
    public CBufferChoiceBinding(
        final ObjectFactory objectFactory) {
        this(null, objectFactory, null);
    }

    /**
     * Constructor for a root complex binding from an existing java object.
     * @param objectFactory the java factory to use to create children instances
     * @param jaxbObject the java object to which this element is bound
     */
    public CBufferChoiceBinding(
        final ObjectFactory objectFactory,
        final DfhcommareaType jaxbObject) {
        this(null, objectFactory, jaxbObject);
    }

    /**
     * Constructor for a child complex binding with immediate binding to a JAXB
     * object.
     * @param parentObject the parent binding
     * @param objectFactory the java factory to use to create children instances
     * @param jaxbObject the java object to which this element is bound
     */
    public CBufferChoiceBinding(
        final CComplexBinding parentObject,
        final ObjectFactory objectFactory,
        final DfhcommareaType jaxbObject) {
        
        super(JAVA_NAME, JAVA_TYPE, parentObject);
        mJaxbObject = jaxbObject;
        mObjectFactory = objectFactory;
        initChildren();
    }
  
    /** Creates a binding property for each child. */
    public final void initChildren() {
    
        setUnmarshalChoiceStrategy(
            new com.legstar.coxb.cust.redinout.ChoiceSelector());
        
        /* Create binding alternatives instances */
        cBuffer = new CStringBinding("cBuffer", 500, false);
        cBuffer.setCobolName("C-BUFFER");
        cBuffer.setIsRedefined(true);
        cParain = new CParainTypeBinding(getParentBinding());
        cParain.setRedefines("C-BUFFER");
        cParaout = new CParaoutTypeBinding(getParentBinding());
        cParaout.setRedefines("C-BUFFER");
        
        /* Add children to alternatives list */
            
        getAlternativesList().add(cBuffer);
        getAlternativesList().add(cParain);
        getAlternativesList().add(cParaout);
    }
  
   
    /** {@inheritDoc} */
    public final void prepareChildren() throws HostException {
    
        /* Pass on the JAXB factory to child cParain  */
        cParain.setObjectFactory(mObjectFactory);

        /* Pass on the JAXB factory to child cParaout  */
        cParaout.setObjectFactory(mObjectFactory);

    }
  
   
    /** {@inheritDoc} */
    public final void getValuesFromBoundObject() throws HostException {
        /* Set this binding properties from java object property values */
                     
        if (mJaxbObject.getCBuffer() != null) {
            /* Set value from cBuffer*/
            cBuffer.setValue(mJaxbObject.getCBuffer());
        }
                
        if (mJaxbObject.getCParain() != null) {
            /* Set value from cParain*/
            cParain.setJaxbObject(mJaxbObject.getCParain());
            
        }
                            
        if (mJaxbObject.getCParaout() != null) {
            /* Set value from cParaout*/
            cParaout.setJaxbObject(mJaxbObject.getCParaout());
            
        }
                
    }
       
    /** {@inheritDoc} */
    public final void setBoundObjectValue(final int index) throws HostException {
        /* Set the JAXB object property value from binding object */
        switch (index) {
        case 0:
            setBoundObjectValueCBuffer();
            break;
        case 1:
            setBoundObjectValueCParain();
            break;
        case 2:
            setBoundObjectValueCParaout();
            break;
        }
    }
            
    /** Set corresponding JAXB object property value. */
    private final void setBoundObjectValueCBuffer() throws HostException {
    
        if (cBuffer.getValue() != null) {
            /* Set value of cBuffer*/
            mJaxbObject.setCBuffer(cBuffer.getValue());
        }
        
    }

    /** Set corresponding JAXB object property value. */
    private final void setBoundObjectValueCParain() throws HostException {
    
        /* Set value of complex child cParain*/
        mJaxbObject.setCParain(cParain.getJaxbObject());
        
    }

    /** Set corresponding JAXB object property value. */
    private final void setBoundObjectValueCParaout() throws HostException {
    
        /* Set value of complex child cParaout*/
        mJaxbObject.setCParaout(cParaout.getJaxbObject());
        
    }

    /** {@inheritDoc} */
    public final Object getValue() throws HostException {
        return mJaxbObject;
    }

    /**
     * @return the java object to which this cobol complex element is bound
     */
    public final DfhcommareaType getJaxbObject() {
        return mJaxbObject;
    }

    /**
     * @param jaxbObject the java object to which this cobol complex element
     * is bound
     */
    public final void setJaxbObject(
        final DfhcommareaType jaxbObject) {
        mJaxbObject = jaxbObject;
    }

    /**
     * @return the java object factory for objects creation
     */
    public final ObjectFactory getObjectFactory() {
        return mObjectFactory;
    }

    /**
     * @param objectFactory the java object factory for objects creation to set
     */
    public final void setObjectFactory(final ObjectFactory objectFactory) {
        mObjectFactory = objectFactory;
    }

}