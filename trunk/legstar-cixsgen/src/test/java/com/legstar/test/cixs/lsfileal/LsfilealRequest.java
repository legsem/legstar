
package com.legstar.test.cixs.lsfileal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.legstar.test.coxb.lsfileal.RequestParmsType;

/**
 * Request wrapper element.
 * 
 * This class was generated by CIXS generator.
 * 2007-04-06T16:15:06.64+02:00
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LsfilealRequest",
         namespace = "http://cixs.test.legstar.com/lsfileal",
         propOrder = {
    "request" 
})
public class LsfilealRequest {
	
    /** Inner JAXB-bound object. */
    @XmlElement(name = "Request",
                namespace = "http://cixs.test.legstar.com/lsfileal",
                required = true)
    private RequestParmsType request;

	/**
	 * Get the inner JAXB-bound object.
	 * 
	 * @return JAXB-bound object
	 */
	public final RequestParmsType getRequest() {
		return request;
	}

	/**
	 * Set the inner JAXB-bound object.
	 * 
	 * @param value JAXB-bound object
	 */
	public final void setRequest(
	    final RequestParmsType value) {
		this.request = value;
	}
}
