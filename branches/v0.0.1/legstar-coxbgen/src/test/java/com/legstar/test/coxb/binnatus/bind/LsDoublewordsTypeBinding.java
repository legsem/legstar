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

package com.legstar.test.coxb.binnatus.bind;

import com.legstar.host.HostException;
import com.legstar.coxb.ICobolBinding;
import com.legstar.coxb.rt.CComplexBinding;

import com.legstar.coxb.rt.CBinaryBinding;
import java.math.BigDecimal;

import com.legstar.test.coxb.binnatus.LsDoublewordsType;
import com.legstar.test.coxb.binnatus.ObjectFactory;

/**
 * This class was generated by COXB version 1.0.
 * 2007-01-26T18:17:22.937+01:00
 * This class implements a bi-directional binding between a cobol structure and
 * a java object. Visitors can use this class to visit each element of the
 * structure in turn. No reflection or annotations are used which makes this
 * class suitable for heavy loads.
 */

public class LsDoublewordsTypeBinding 
             extends CComplexBinding
             implements ICobolBinding {
  
    /** Name of java property to which this cobol element is bound. */
    private static final String JAVA_NAME = "lsDoublewords";
  
    /** Type of java property to which this cobol element is bound. */
    private static final String JAVA_TYPE = "LsDoublewordsType";
    
    /** Child property CBinaryBinding of simple type. */
    public CBinaryBinding lsP9X18Min;
            
    /** Child property CBinaryBinding of simple type. */
    public CBinaryBinding lsP9X18Low;
            
    /** Child property CBinaryBinding of simple type. */
    public CBinaryBinding lsP9X18High;
            
    /** Child property CBinaryBinding of simple type. */
    public CBinaryBinding lsP9X18Max;
            
    /** Java object to which this cobol complex array element is bound. */
    private LsDoublewordsType mJaxbObject;
  
    /** Java object factory for objects creation. */
    private ObjectFactory mObjectFactory;
  
    /**
     * No argument constructor.
     */
    public LsDoublewordsTypeBinding() {
        this(null, null, null);
    }
  
    /**
     * Constructor for a child complex binding which be later bound to a JAXB
     * object.
     * @param parentObject the parent binding
     */
    public LsDoublewordsTypeBinding(
        final CComplexBinding parentObject) {
        this(parentObject, null, null);
    }
  
    /**
     * Constructor for a root complex binding without an initial bound object.
     * @param objectFactory the java factory to use to create children instances
     */
    public LsDoublewordsTypeBinding(
        final ObjectFactory objectFactory) {
        this(null, objectFactory, null);
    }

    /**
     * Constructor for a root complex binding from an existing java object.
     * @param objectFactory the java factory to use to create children instances
     * @param jaxbObject the java object to which this element is bound
     */
    public LsDoublewordsTypeBinding(
        final ObjectFactory objectFactory,
        final LsDoublewordsType jaxbObject) {
        this(null, objectFactory, jaxbObject);
    }

    /**
     * Constructor for a child complex binding with immediate binding to a JAXB
     * object.
     * @param parentObject the parent binding
     * @param objectFactory the java factory to use to create children instances
     * @param jaxbObject the java object to which this element is bound
     */
    public LsDoublewordsTypeBinding(
        final CComplexBinding parentObject,
        final ObjectFactory objectFactory,
        final LsDoublewordsType jaxbObject) {
        
        super(JAVA_NAME, JAVA_TYPE, parentObject);
        mJaxbObject = jaxbObject;
        mObjectFactory = objectFactory;
        initChildren();
    }
  
    /** Creates a binding property for each child. */
    public final void initChildren() {
    
        /* Create binding children instances */
        lsP9X18Min = new CBinaryBinding("lsP9X18Min", 8, 18, 0, false);
        lsP9X18Min.setCobolName("LS-P9X18-MIN");
        lsP9X18Low = new CBinaryBinding("lsP9X18Low", 8, 18, 0, false);
        lsP9X18Low.setCobolName("LS-P9X18-LOW");
        lsP9X18High = new CBinaryBinding("lsP9X18High", 8, 18, 0, false);
        lsP9X18High.setCobolName("LS-P9X18-HIGH");
        lsP9X18Max = new CBinaryBinding("lsP9X18Max", 8, 18, 0, false);
        lsP9X18Max.setCobolName("LS-P9X18-MAX");
        
        /* Add children to children list */
           
        getChildrenList().add(lsP9X18Min);
        getChildrenList().add(lsP9X18Low);
        getChildrenList().add(lsP9X18High);
        getChildrenList().add(lsP9X18Max);
    }
  
   
    /** {@inheritDoc} */
    public final void createBoundObject() throws HostException {
        setJaxbObject(mObjectFactory.createLsDoublewordsType());
    }
       
    /** {@inheritDoc} */
    public final void prepareChildren() throws HostException {
    
    }
  
   
    /** {@inheritDoc} */
    public final void getValuesFromBoundObject() throws HostException {
        /* Set this binding properties from java object property values */
                     
        if (mJaxbObject.getLsP9X18Min() != null) {
            /* Set value from lsP9X18Min*/
            lsP9X18Min.setValue(new BigDecimal(mJaxbObject.getLsP9X18Min()));
        
        }
                
        if (mJaxbObject.getLsP9X18Low() != null) {
            /* Set value from lsP9X18Low*/
            lsP9X18Low.setValue(new BigDecimal(mJaxbObject.getLsP9X18Low()));
        
        }
                
        if (mJaxbObject.getLsP9X18High() != null) {
            /* Set value from lsP9X18High*/
            lsP9X18High.setValue(new BigDecimal(mJaxbObject.getLsP9X18High()));
        
        }
                
        if (mJaxbObject.getLsP9X18Max() != null) {
            /* Set value from lsP9X18Max*/
            lsP9X18Max.setValue(new BigDecimal(mJaxbObject.getLsP9X18Max()));
        
        }
    
    }
       
    /** {@inheritDoc} */
    public final void setBoundObjectValue(final int index) throws HostException {
        /* Set the JAXB object property value from binding object */
        switch (index) {
        case 0:
            setBoundObjectValueLsP9X18Min();
            break;
        case 1:
            setBoundObjectValueLsP9X18Low();
            break;
        case 2:
            setBoundObjectValueLsP9X18High();
            break;
        case 3:
            setBoundObjectValueLsP9X18Max();
            break;
        }
    }
            
    /** Set corresponding JAXB object property value. */
    private final void setBoundObjectValueLsP9X18Min() throws HostException {
    
        if (lsP9X18Min.getValue() != null) {
            
            /* Set value of lsP9X18Min*/
            mJaxbObject.setLsP9X18Min(lsP9X18Min.getValue().toBigInteger());
                
        }
        
    }

    /** Set corresponding JAXB object property value. */
    private final void setBoundObjectValueLsP9X18Low() throws HostException {
    
        if (lsP9X18Low.getValue() != null) {
            
            /* Set value of lsP9X18Low*/
            mJaxbObject.setLsP9X18Low(lsP9X18Low.getValue().toBigInteger());
                
        }
        
    }

    /** Set corresponding JAXB object property value. */
    private final void setBoundObjectValueLsP9X18High() throws HostException {
    
        if (lsP9X18High.getValue() != null) {
            
            /* Set value of lsP9X18High*/
            mJaxbObject.setLsP9X18High(lsP9X18High.getValue().toBigInteger());
                
        }
        
    }

    /** Set corresponding JAXB object property value. */
    private final void setBoundObjectValueLsP9X18Max() throws HostException {
    
        if (lsP9X18Max.getValue() != null) {
            
            /* Set value of lsP9X18Max*/
            mJaxbObject.setLsP9X18Max(lsP9X18Max.getValue().toBigInteger());
                
        }
        
    }

    /** {@inheritDoc} */
    public final Object getValue() throws HostException {
        return mJaxbObject;
    }

    /**
     * @return the java object to which this cobol complex element is bound
     */
    public final LsDoublewordsType getJaxbObject() {
        return mJaxbObject;
    }

    /**
     * @param jaxbObject the java object to which this cobol complex element
     * is bound
     */
    public final void setJaxbObject(
        final LsDoublewordsType jaxbObject) {
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