/*******************************************************************************
 * LegStar legacy Web-enablement .
 * Copyright (C)  2007 LegSem
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA
 * 02110-1301  USA
 * 
 *     
 *****************************************************************************/
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.01.26 at 06:17:06 PM CET 
//


package com.legstar.test.coxb.redmulti;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.legstar.coxb.CobolType;
import com.legstar.coxb.annotation.CobolElement;


/**
 * <p>Java class for Filler35Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Filler35Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CString">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Filler37">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="170"/>
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
@XmlType(name = "Filler35Type", propOrder = {
    "cString",
    "filler37"
})
public class Filler35Type {

    @XmlElement(name = "CString", required = true)
    @CobolElement(cobolName = "C-STRING", type = CobolType.ALPHANUMERIC_ITEM, byteLength = 30, isJustifiedRight = false, isSigned = false, isSignLeading = false, isSignSeparate = false)
    protected String cString;
    @XmlElement(name = "Filler37", required = true)
    @CobolElement(cobolName = "FILLER-37", type = CobolType.ALPHANUMERIC_ITEM, byteLength = 170, isJustifiedRight = false, isSigned = false, isSignLeading = false, isSignSeparate = false)
    protected String filler37;

    /**
     * Gets the value of the cString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCString() {
        return cString;
    }

    /**
     * Sets the value of the cString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCString(String value) {
        this.cString = value;
    }

    public boolean isSetCString() {
        return (this.cString!= null);
    }

    /**
     * Gets the value of the filler37 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiller37() {
        return filler37;
    }

    /**
     * Sets the value of the filler37 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiller37(String value) {
        this.filler37 = value;
    }

    public boolean isSetFiller37() {
        return (this.filler37 != null);
    }

}