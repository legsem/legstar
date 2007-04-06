
package com.legstar.test.cixs.vararcom;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.legstar.test.coxb.vararcom.DfhcommareaType;

/**
 * Request wrapper element.
 * 
 * This class was generated by CIXS generator.
 * 2007-04-06T16:15:03.875+02:00
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VararcomRequest",
         namespace = "http://cixs.test.legstar.com/vararcom",
         propOrder = {
    "request" 
})
public class VararcomRequest {
	
    /** Inner JAXB-bound object. */
    @XmlElement(name = "Request",
                namespace = "http://cixs.test.legstar.com/vararcom",
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
