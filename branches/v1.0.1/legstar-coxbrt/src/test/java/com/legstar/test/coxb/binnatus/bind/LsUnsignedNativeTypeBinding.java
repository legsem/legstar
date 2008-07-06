
package com.legstar.test.coxb.binnatus.bind;

import com.legstar.host.HostException;
import com.legstar.coxb.ICobolBinding;
import com.legstar.coxb.rt.CComplexBinding;


import com.legstar.test.coxb.binnatus.LsUnsignedNativeType;
import com.legstar.test.coxb.binnatus.ObjectFactory;

/**
 * This class was generated by COXB version 1.0.
 * 2007-04-23T17:01:12.109+02:00
 * This class implements a bi-directional binding between a cobol structure and
 * a java object. Visitors can use this class to visit each element of the
 * structure in turn. No reflection or annotations are used which makes this
 * class suitable for heavy loads.
 */

public class LsUnsignedNativeTypeBinding 
             extends CComplexBinding
             implements ICobolBinding {
  
    /** Name of java property to which this cobol element is bound. */
    private static final String JAVA_NAME = "lsUnsignedNative";
  
    /** Type of java property to which this cobol element is bound. */
    private static final String JAVA_TYPE = "LsUnsignedNativeType";
    
    /** Child property LsHalfwordsTypeBinding of complex type. */
    public LsHalfwordsTypeBinding lsHalfwords;
            
    /** Child property LsFullwordsTypeBinding of complex type. */
    public LsFullwordsTypeBinding lsFullwords;
            
    /** Child property LsDoublewordsTypeBinding of complex type. */
    public LsDoublewordsTypeBinding lsDoublewords;
            
    /** Java object to which this cobol complex array element is bound. */
    private LsUnsignedNativeType mJaxbObject;
  
    /** Java object factory for objects creation. */
    private ObjectFactory mObjectFactory;
  
    /**
     * No argument constructor.
     */
    public LsUnsignedNativeTypeBinding() {
        this(null, null, null);
    }
  
    /**
     * Constructor for a child complex binding which be later bound to a JAXB
     * object.
     * @param parentObject the parent binding
     */
    public LsUnsignedNativeTypeBinding(
        final CComplexBinding parentObject) {
        this(parentObject, null, null);
    }
  
    /**
     * Constructor for a root complex binding without an initial bound object.
     * @param objectFactory the java factory to use to create children instances
     */
    public LsUnsignedNativeTypeBinding(
        final ObjectFactory objectFactory) {
        this(null, objectFactory, null);
    }

    /**
     * Constructor for a root complex binding from an existing java object.
     * @param objectFactory the java factory to use to create children instances
     * @param jaxbObject the java object to which this element is bound
     */
    public LsUnsignedNativeTypeBinding(
        final ObjectFactory objectFactory,
        final LsUnsignedNativeType jaxbObject) {
        this(null, objectFactory, jaxbObject);
    }

    /**
     * Constructor for a child complex binding with immediate binding to a JAXB
     * object.
     * @param parentObject the parent binding
     * @param objectFactory the java factory to use to create children instances
     * @param jaxbObject the java object to which this element is bound
     */
    public LsUnsignedNativeTypeBinding(
        final CComplexBinding parentObject,
        final ObjectFactory objectFactory,
        final LsUnsignedNativeType jaxbObject) {
        
        super(JAVA_NAME, JAVA_TYPE, parentObject);
        mJaxbObject = jaxbObject;
        mObjectFactory = objectFactory;
        initChildren();
    }
  
    /** Creates a binding property for each child. */
    public final void initChildren() {
    
        /* Create binding children instances */
        lsHalfwords = new LsHalfwordsTypeBinding(this);
        lsFullwords = new LsFullwordsTypeBinding(this);
        lsDoublewords = new LsDoublewordsTypeBinding(this);
        
        /* Add children to children list */
           
        getChildrenList().add(lsHalfwords);
        getChildrenList().add(lsFullwords);
        getChildrenList().add(lsDoublewords);
    }
  
   
    /** {@inheritDoc} */
    public final void createBoundObject() throws HostException {
        setJaxbObject(mObjectFactory.createLsUnsignedNativeType());
    }
       
    /** {@inheritDoc} */
    public final void prepareChildren() throws HostException {
    
        /* Pass on the JAXB factory to child lsHalfwords  */
        lsHalfwords.setObjectFactory(mObjectFactory);

        /* Pass on the JAXB factory to child lsFullwords  */
        lsFullwords.setObjectFactory(mObjectFactory);

        /* Pass on the JAXB factory to child lsDoublewords  */
        lsDoublewords.setObjectFactory(mObjectFactory);

    }
  
   
    /** {@inheritDoc} */
    public final void getValuesFromBoundObject() throws HostException {
        /* Set this binding properties from java object property values */
                     
        if (mJaxbObject.getLsHalfwords() != null) {
            /* Set value from lsHalfwords*/
            lsHalfwords.setJaxbObject(mJaxbObject.getLsHalfwords());
            
        } else {
            lsHalfwords.setJaxbObject(mObjectFactory.createLsHalfwordsType());
        }
                            
        if (mJaxbObject.getLsFullwords() != null) {
            /* Set value from lsFullwords*/
            lsFullwords.setJaxbObject(mJaxbObject.getLsFullwords());
            
        } else {
            lsFullwords.setJaxbObject(mObjectFactory.createLsFullwordsType());
        }
                            
        if (mJaxbObject.getLsDoublewords() != null) {
            /* Set value from lsDoublewords*/
            lsDoublewords.setJaxbObject(mJaxbObject.getLsDoublewords());
            
        } else {
            lsDoublewords.setJaxbObject(mObjectFactory.createLsDoublewordsType());
        }
                
    }
       
    /** {@inheritDoc} */
    public final void setBoundObjectValue(final int index) throws HostException {
        /* Set the JAXB object property value from binding object */
        switch (index) {
        case 0:
            setBoundObjectValueLsHalfwords();
            break;
        case 1:
            setBoundObjectValueLsFullwords();
            break;
        case 2:
            setBoundObjectValueLsDoublewords();
            break;
        }
    }
            
    /** Set corresponding JAXB object property value. */
    private final void setBoundObjectValueLsHalfwords() throws HostException {
    
        /* Set value of complex child lsHalfwords*/
        mJaxbObject.setLsHalfwords(lsHalfwords.getJaxbObject());
        
    }

    /** Set corresponding JAXB object property value. */
    private final void setBoundObjectValueLsFullwords() throws HostException {
    
        /* Set value of complex child lsFullwords*/
        mJaxbObject.setLsFullwords(lsFullwords.getJaxbObject());
        
    }

    /** Set corresponding JAXB object property value. */
    private final void setBoundObjectValueLsDoublewords() throws HostException {
    
        /* Set value of complex child lsDoublewords*/
        mJaxbObject.setLsDoublewords(lsDoublewords.getJaxbObject());
        
    }

    /** {@inheritDoc} */
    public final Object getValue() throws HostException {
        return mJaxbObject;
    }

    /**
     * @return the java object to which this cobol complex element is bound
     */
    public final LsUnsignedNativeType getJaxbObject() {
        return mJaxbObject;
    }

    /**
     * @param jaxbObject the java object to which this cobol complex element
     * is bound
     */
    public final void setJaxbObject(
        final LsUnsignedNativeType jaxbObject) {
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