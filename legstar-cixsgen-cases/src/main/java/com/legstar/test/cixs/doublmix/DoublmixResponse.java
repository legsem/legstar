
package com.legstar.test.cixs.doublmix;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.legstar.test.coxb.doublmix.DfhcommareaType;


/**
 * Response wrapper element.
 * 
 * This class was generated by CIXS generator.
 * 2007-07-26T14:36:26.984+02:00
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DoublmixResponse",
         namespace = "http://cixs.test.legstar.com/doublmix",
         propOrder = {
    "response" 
})
public class DoublmixResponse {
	
    /** Inner JAXB-bound object. */
    @XmlElement(name = "Response",
                namespace = "http://cixs.test.legstar.com/doublmix",
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
