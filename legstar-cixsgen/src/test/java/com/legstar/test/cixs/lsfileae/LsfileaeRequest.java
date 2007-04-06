
package com.legstar.test.cixs.lsfileae;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.legstar.test.coxb.lsfileae.DfhcommareaType;

/**
 * Request wrapper element.
 * 
 * This class was generated by CIXS generator.
 * 2007-04-06T16:14:51.875+02:00
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LsfileaeRequest",
         namespace = "http://cixs.test.legstar.com/lsfileae",
         propOrder = {
    "request" 
})
public class LsfileaeRequest {
	
    /** Inner JAXB-bound object. */
    @XmlElement(name = "Request",
                namespace = "http://cixs.test.legstar.com/lsfileae",
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
