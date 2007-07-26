
package com.legstar.test.cixs.binnatus;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.legstar.test.coxb.binnatus.DfhcommareaType;


/**
 * Request wrapper element.
 * 
 * This class was generated by CIXS generator.
 * 2007-07-26T14:36:22.703+02:00
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BinnatusRequest",
         namespace = "http://cixs.test.legstar.com/binnatus",
         propOrder = {
    "request" 
})
public class BinnatusRequest {
	
    /** Inner JAXB-bound object. */
    @XmlElement(name = "Request",
                namespace = "http://cixs.test.legstar.com/binnatus",
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
