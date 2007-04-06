
package com.legstar.test.cixs.binnatsi;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * Describes an error situation.
 * 
 * This class was generated by CIXS generator.
 * 2007-04-06T12:06:04.312+02:00
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BinnatsiFaultInfo", propOrder = {
    "detail",
    "message"
})
public class BinnatsiFaultInfo {

    /** Detailed fault description. */
    private String detail;

    /** Summary fault description. */
    private String message;

    /**
     * Gets the value of the detail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public final String getDetail() {
        return detail;
    }

    /**
     * Sets the value of the detail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public final void setDetail(final String value) {
        this.detail = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public final String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public final void setMessage(final String value) {
        this.message = value;
    }

}
