
package com.legstar.test.cixs.lsfilead;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.legstar.test.coxb.lsfilead.DfhcommareaType;

/**
 * Request wrapper element.
 * 
 * This class was generated by CIXS generator.
 * 2007-04-06T16:14:50.171+02:00
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LsfileadRequest",
         namespace = "http://cixs.test.legstar.com/lsfilead",
         propOrder = {
    "request" 
})
public class LsfileadRequest {
	
    /** Inner JAXB-bound object. */
    @XmlElement(name = "Request",
                namespace = "http://cixs.test.legstar.com/lsfilead",
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
