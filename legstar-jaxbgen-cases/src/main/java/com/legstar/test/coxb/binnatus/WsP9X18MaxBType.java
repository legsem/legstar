//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.3-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.07.17 at 10:43:33 AM CEST 
//


package com.legstar.test.coxb.binnatus;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for WsP9X18MaxBType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WsP9X18MaxBType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Filler50">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Filler51">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WsP9X18MaxBType", propOrder = {
    "filler50",
    "filler51"
})
public class WsP9X18MaxBType {

    @XmlElement(name = "Filler50")
    @CobolElement(cobolName = "FILLER-50", type = CobolType.NATIVE_BINARY_ITEM, levelNumber = 20, byteLength = 4, isSigned = false, totalDigits = 9, picture = "9(9)", usage = "COMP-5", srceLine = 50)
    protected long filler50;
    @XmlElement(name = "Filler51")
    @CobolElement(cobolName = "FILLER-51", type = CobolType.NATIVE_BINARY_ITEM, levelNumber = 20, byteLength = 4, isSigned = false, totalDigits = 9, picture = "9(9)", usage = "COMP-5", srceLine = 51)
    protected long filler51;

    /**
     * Gets the value of the filler50 property.
     * 
     */
    public long getFiller50() {
        return filler50;
    }

    /**
     * Sets the value of the filler50 property.
     * 
     */
    public void setFiller50(long value) {
        this.filler50 = value;
    }

    public boolean isSetFiller50() {
        return true;
    }

    /**
     * Gets the value of the filler51 property.
     * 
     */
    public long getFiller51() {
        return filler51;
    }

    /**
     * Sets the value of the filler51 property.
     * 
     */
    public void setFiller51(long value) {
        this.filler51 = value;
    }

    public boolean isSetFiller51() {
        return true;
    }

}
