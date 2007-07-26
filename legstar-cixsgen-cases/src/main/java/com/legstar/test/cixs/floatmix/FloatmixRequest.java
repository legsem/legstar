
package com.legstar.test.cixs.floatmix;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.legstar.test.coxb.floatmix.DfhcommareaType;


/**
 * Request wrapper element.
 * 
 * This class was generated by CIXS generator.
 * 2007-07-26T14:36:34.203+02:00
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FloatmixRequest",
         namespace = "http://cixs.test.legstar.com/floatmix",
         propOrder = {
    "request" 
})
public class FloatmixRequest {
	
    /** Inner JAXB-bound object. */
    @XmlElement(name = "Request",
                namespace = "http://cixs.test.legstar.com/floatmix",
                required = true)
    private DfhcommareaType request;

	/**
	 * Get the inner JAXB-bound object.
	 * 
	 * @return JAXB-bound object
	 */
	public final DfhcommareaType getRequest() {
		return request;
	}

	/**
	 * Set the inner JAXB-bound object.
	 * 
	 * @param value JAXB-bound object
	 */
	public final void setRequest(
	    final DfhcommareaType value) {
		this.request = value;
	}
}
