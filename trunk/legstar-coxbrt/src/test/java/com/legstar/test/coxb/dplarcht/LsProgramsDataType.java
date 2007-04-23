/*******************************************************************************
 *  LegStar legacy Web-enablement .
 *  Copyright (C) 2007 LegSem
 *  
 *  This library is free software; you can redistribute it and/or
 *  modify it under the terms of the GNU Lesser General Public
 *  License as published by the Free Software Foundation; either
 *  version 2.1 of the License, or (at your option) any later version.
 *  
 *  This library is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *  Lesser General Public License for more details.
 *   
 *  You should have received a copy of the GNU Lesser General Public
 *  License along with this library; if not, write to the Free Software
 *  Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA
 *  02110-1301  USA
 *  
 *******************************************************************************/
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.01.26 at 06:16:49 PM CET 
//


package com.legstar.test.coxb.dplarcht;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.legstar.coxb.CobolType;
import com.legstar.coxb.annotation.CobolElement;


/**
 * <p>Java class for LsProgramsDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LsProgramsDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LsProgramName">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LsProgramType">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="12"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LsProgramLanguage">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="12"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LsProgramLength">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="-999999999"/>
 *               &lt;maxInclusive value="999999999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LsProgramUsecount">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="-999999999"/>
 *               &lt;maxInclusive value="999999999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Filler113">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="24"/>
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
@XmlType(name = "LsProgramsDataType", propOrder = {
    "lsProgramName",
    "lsProgramType",
    "lsProgramLanguage",
    "lsProgramLength",
    "lsProgramUsecount",
    "filler113"
})
public class LsProgramsDataType {

    @XmlElement(name = "LsProgramName", required = true)
    @CobolElement(cobolName = "LS-PROGRAM-NAME", type = CobolType.ALPHANUMERIC_ITEM, byteLength = 8, isJustifiedRight = false, isSigned = false, isSignLeading = false, isSignSeparate = false)
    protected String lsProgramName;
    @XmlElement(name = "LsProgramType", required = true)
    @CobolElement(cobolName = "LS-PROGRAM-TYPE", type = CobolType.ALPHANUMERIC_ITEM, byteLength = 12, isJustifiedRight = false, isSigned = false, isSignLeading = false, isSignSeparate = false)
    protected String lsProgramType;
    @XmlElement(name = "LsProgramLanguage", required = true)
    @CobolElement(cobolName = "LS-PROGRAM-LANGUAGE", type = CobolType.ALPHANUMERIC_ITEM, byteLength = 12, isJustifiedRight = false, isSigned = false, isSignLeading = false, isSignSeparate = false)
    protected String lsProgramLanguage;
    @XmlElement(name = "LsProgramLength")
    @CobolElement(cobolName = "LS-PROGRAM-LENGTH", type = CobolType.BINARY_ITEM, byteLength = 4, isJustifiedRight = false, isSigned = true, isSignLeading = false, isSignSeparate = false, totalDigits = 9)
    protected int lsProgramLength;
    @XmlElement(name = "LsProgramUsecount")
    @CobolElement(cobolName = "LS-PROGRAM-USECOUNT", type = CobolType.BINARY_ITEM, byteLength = 4, isJustifiedRight = false, isSigned = true, isSignLeading = false, isSignSeparate = false, totalDigits = 9)
    protected int lsProgramUsecount;
    @XmlElement(name = "Filler113", required = true)
    @CobolElement(cobolName = "FILLER-113", type = CobolType.ALPHANUMERIC_ITEM, byteLength = 24, isJustifiedRight = false, isSigned = false, isSignLeading = false, isSignSeparate = false)
    protected String filler113;

    /**
     * Gets the value of the lsProgramName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLsProgramName() {
        return lsProgramName;
    }

    /**
     * Sets the value of the lsProgramName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLsProgramName(String value) {
        this.lsProgramName = value;
    }

    public boolean isSetLsProgramName() {
        return (this.lsProgramName!= null);
    }

    /**
     * Gets the value of the lsProgramType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLsProgramType() {
        return lsProgramType;
    }

    /**
     * Sets the value of the lsProgramType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLsProgramType(String value) {
        this.lsProgramType = value;
    }

    public boolean isSetLsProgramType() {
        return (this.lsProgramType!= null);
    }

    /**
     * Gets the value of the lsProgramLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLsProgramLanguage() {
        return lsProgramLanguage;
    }

    /**
     * Sets the value of the lsProgramLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLsProgramLanguage(String value) {
        this.lsProgramLanguage = value;
    }

    public boolean isSetLsProgramLanguage() {
        return (this.lsProgramLanguage!= null);
    }

    /**
     * Gets the value of the lsProgramLength property.
     * 
     */
    public int getLsProgramLength() {
        return lsProgramLength;
    }

    /**
     * Sets the value of the lsProgramLength property.
     * 
     */
    public void setLsProgramLength(int value) {
        this.lsProgramLength = value;
    }

    public boolean isSetLsProgramLength() {
        return true;
    }

    /**
     * Gets the value of the lsProgramUsecount property.
     * 
     */
    public int getLsProgramUsecount() {
        return lsProgramUsecount;
    }

    /**
     * Sets the value of the lsProgramUsecount property.
     * 
     */
    public void setLsProgramUsecount(int value) {
        this.lsProgramUsecount = value;
    }

    public boolean isSetLsProgramUsecount() {
        return true;
    }

    /**
     * Gets the value of the filler113 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiller113() {
        return filler113;
    }

    /**
     * Sets the value of the filler113 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiller113(String value) {
        this.filler113 = value;
    }

    public boolean isSetFiller113() {
        return (this.filler113 != null);
    }

}
