
package com.legstar.test.cixs.binnatus;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.legstar.test.coxb.binnatus.DfhcommareaType;

/**
 * Response wrapper element.
 * 
 * This class was generated by CIXS generator.
 * 2007-04-06T16:14:37.312+02:00
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BinnatusResponse",
         namespace = "http://cixs.test.legstar.com/binnatus",
         propOrder = {
    "response" 
})
public class BinnatusResponse {
	
    /** Inner JAXB-bound object. */
    @XmlElement(name = "Response",
                namespace = "http://cixs.test.legstar.com/binnatus",
                required = true)
    private DfhcommareaType response;

	/**
	 * Get the inner JAXB-bound object.
	 * 
	 * @return JAXB-bound object
	 */
	public final DfhcommareaType getResponse() {
		return response;
	}

	/**
	 * Set the inner JAXB-bound object.
	 * 
	 * @param value JAXB-bound object
	 */
	public final void setResponse(
	    final DfhcommareaType value) {
		this.response = value;
	}
}
