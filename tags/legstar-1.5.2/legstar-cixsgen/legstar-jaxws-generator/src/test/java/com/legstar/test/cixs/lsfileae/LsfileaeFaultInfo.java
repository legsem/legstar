package com.legstar.test.cixs.lsfileae;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * LegStar/Jaxws Operation fault information.
 * Describes an error situation.
 * 
 * This class was generated by LegStar Mainframe Web Service adapter generator.
 */
@XmlRootElement(name = "LsfileaeFaultInfo")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LsfileaeFaultInfo",
         namespace = "http://cixs.test.legstar.com/lsfileae",
         propOrder = {
    "detail",
    "message"
})
public class LsfileaeFaultInfo {

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
    public String getDetail() {
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
    public void setDetail(final String value) {
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
    public String getMessage() {
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
    public void setMessage(final String value) {
        this.message = value;
    }

}
