//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.04.23 at 05:00:22 PM CEST 
//


package com.legstar.test.coxb.binnatsi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.legstar.coxb.CobolType;
import com.legstar.coxb.annotation.CobolElement;


/**
 * <p>Java class for WsPs9X18MaxBType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WsPs9X18MaxBType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Filler54">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Filler55">
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
@XmlType(name = "WsPs9X18MaxBType", propOrder = {
    "filler54",
    "filler55"
})
public class WsPs9X18MaxBType {

    @XmlElement(name = "Filler54")
    @CobolElement(cobolName = "FILLER-54", type = CobolType.NATIVE_BINARY_ITEM, byteLength = 4, isJustifiedRight = false, isSigned = false, isSignLeading = false, isSignSeparate = false, totalDigits = 9)
    protected long filler54;
    @XmlElement(name = "Filler55")
    @CobolElement(cobolName = "FILLER-55", type = CobolType.NATIVE_BINARY_ITEM, byteLength = 4, isJustifiedRight = false, isSigned = false, isSignLeading = false, isSignSeparate = false, totalDigits = 9)
    protected long filler55;

    /**
     * Gets the value of the filler54 property.
     * 
     */
    public long getFiller54() {
        return filler54;
    }

    /**
     * Sets the value of the filler54 property.
     * 
     */
    public void setFiller54(long value) {
        this.filler54 = value;
    }

    public boolean isSetFiller54() {
        return true;
    }

    /**
     * Gets the value of the filler55 property.
     * 
     */
    public long getFiller55() {
        return filler55;
    }

    /**
     * Sets the value of the filler55 property.
     * 
     */
    public void setFiller55(long value) {
        this.filler55 = value;
    }

    public boolean isSetFiller55() {
        return true;
    }

}