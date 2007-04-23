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
// Generated on: 2007.01.26 at 06:17:11 PM CET 
//


package com.legstar.test.coxb.typesmix;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.legstar.coxb.CobolType;
import com.legstar.coxb.annotation.CobolElement;


/**
 * <p>Java class for DfhcommareaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DfhcommareaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CAlphabetic">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="5"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CNational">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="9"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CDbcs">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}hexBinary">
 *               &lt;length value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CAlphanumericEdited">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="14"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CAlphanumeric">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="7"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="COctetString">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}hexBinary">
 *               &lt;length value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CSingleFloat">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}float">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CDoubleFloat">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CPackedDecimal">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;totalDigits value="17"/>
 *               &lt;fractionDigits value="2"/>
 *               &lt;minInclusive value="-999999999999999.99"/>
 *               &lt;maxInclusive value="999999999999999.99"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CZonedDecimal">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *               &lt;minInclusive value="-99999999999999"/>
 *               &lt;maxInclusive value="99999999999999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CNumericEdited1">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="[\d\.]{3}0{2}\d{4}CR"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CNumericEdited2">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="[$\d]{3}\d{4}[,\s]\d{2}\.\d{3}[\+\-\d]"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CNumericEdited3">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="[1-9\*]{4}\d{3}\.\d{2}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CNumericEdited4">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="[\+\-\d][1-9\s]{4}\d{2}\.\d{3}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CIndex">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}hexBinary">
 *               &lt;length value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CPointer">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}hexBinary">
 *               &lt;length value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CProcPointer">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}hexBinary">
 *               &lt;length value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CFuncPointer">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}hexBinary">
 *               &lt;length value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CExternalFloating">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="10"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CBinary">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="-999999999"/>
 *               &lt;maxInclusive value="999999999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CNativeBinary">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort">
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
@XmlType(name = "DfhcommareaType", propOrder = {
    "cAlphabetic",
    "cNational",
    "cDbcs",
    "cAlphanumericEdited",
    "cAlphanumeric",
    "cOctetString",
    "cSingleFloat",
    "cDoubleFloat",
    "cPackedDecimal",
    "cZonedDecimal",
    "cNumericEdited1",
    "cNumericEdited2",
    "cNumericEdited3",
    "cNumericEdited4",
    "cIndex",
    "cPointer",
    "cProcPointer",
    "cFuncPointer",
    "cExternalFloating",
    "cBinary",
    "cNativeBinary"
})
public class DfhcommareaType {

    @XmlElement(name = "CAlphabetic", required = true)
    @CobolElement(cobolName = "C-ALPHABETIC", type = CobolType.ALPHABETIC_ITEM, byteLength = 5, isJustifiedRight = false, isSigned = false, isSignLeading = false, isSignSeparate = false)
    protected String cAlphabetic;
    @XmlElement(name = "CNational", required = true)
    @CobolElement(cobolName = "C-NATIONAL", type = CobolType.NATIONAL_ITEM, byteLength = 18, isJustifiedRight = false, isSigned = false, isSignLeading = false, isSignSeparate = false)
    protected String cNational;
    @XmlElement(name = "CDbcs", required = true, type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @CobolElement(cobolName = "C-DBCS", type = CobolType.DBCS_ITEM, byteLength = 8, isJustifiedRight = false, isSigned = false, isSignLeading = false, isSignSeparate = false)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] cDbcs;
    @XmlElement(name = "CAlphanumericEdited", required = true)
    @CobolElement(cobolName = "C-ALPHANUMERIC-EDITED", type = CobolType.ALPHANUMERIC_EDITED_ITEM, byteLength = 14, isJustifiedRight = false, isSigned = false, isSignLeading = false, isSignSeparate = false)
    protected String cAlphanumericEdited;
    @XmlElement(name = "CAlphanumeric", required = true)
    @CobolElement(cobolName = "C-ALPHANUMERIC", type = CobolType.ALPHANUMERIC_ITEM, byteLength = 7, isJustifiedRight = false, isSigned = false, isSignLeading = false, isSignSeparate = false)
    protected String cAlphanumeric;
    @XmlElement(name = "COctetString", required = true, type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @CobolElement(cobolName = "C-OCTET-STRING", type = CobolType.OCTET_STREAM_ITEM, byteLength = 8, isJustifiedRight = false, isSigned = false, isSignLeading = false, isSignSeparate = false)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] cOctetString;
    @XmlElement(name = "CSingleFloat")
    @CobolElement(cobolName = "C-SINGLE-FLOAT", type = CobolType.SINGLE_FLOAT_ITEM, byteLength = 4, isJustifiedRight = false, isSigned = false, isSignLeading = false, isSignSeparate = false)
    protected float cSingleFloat;
    @XmlElement(name = "CDoubleFloat")
    @CobolElement(cobolName = "C-DOUBLE-FLOAT", type = CobolType.DOUBLE_FLOAT_ITEM, byteLength = 8, isJustifiedRight = false, isSigned = false, isSignLeading = false, isSignSeparate = false)
    protected double cDoubleFloat;
    @XmlElement(name = "CPackedDecimal", required = true)
    @CobolElement(cobolName = "C-PACKED-DECIMAL", type = CobolType.PACKED_DECIMAL_ITEM, byteLength = 9, isJustifiedRight = false, isSigned = true, isSignLeading = false, isSignSeparate = false, totalDigits = 17, fractionDigits = 2)
    protected BigDecimal cPackedDecimal;
    @XmlElement(name = "CZonedDecimal")
    @CobolElement(cobolName = "C-ZONED-DECIMAL", type = CobolType.ZONED_DECIMAL_ITEM, byteLength = 14, isJustifiedRight = false, isSigned = true, isSignLeading = false, isSignSeparate = false, totalDigits = 14)
    protected long cZonedDecimal;
    @XmlElement(name = "CNumericEdited1", required = true)
    @CobolElement(cobolName = "C-NUMERIC-EDITED-1", type = CobolType.NUMERIC_EDITED_ITEM, byteLength = 8, isJustifiedRight = false, isSigned = true, isSignLeading = false, isSignSeparate = false, totalDigits = 6, fractionDigits = 6)
    protected String cNumericEdited1;
    @XmlElement(name = "CNumericEdited2", required = true)
    @CobolElement(cobolName = "C-NUMERIC-EDITED-2", type = CobolType.NUMERIC_EDITED_ITEM, byteLength = 16, isJustifiedRight = false, isSigned = true, isSignLeading = false, isSignSeparate = false, totalDigits = 11, fractionDigits = 3)
    protected String cNumericEdited2;
    @XmlElement(name = "CNumericEdited3", required = true)
    @CobolElement(cobolName = "C-NUMERIC-EDITED-3", type = CobolType.NUMERIC_EDITED_ITEM, byteLength = 10, isJustifiedRight = false, isSigned = false, isSignLeading = false, isSignSeparate = false, totalDigits = 9, fractionDigits = 2)
    protected String cNumericEdited3;
    @XmlElement(name = "CNumericEdited4", required = true)
    @CobolElement(cobolName = "C-NUMERIC-EDITED-4", type = CobolType.NUMERIC_EDITED_ITEM, byteLength = 11, isJustifiedRight = false, isSigned = true, isSignLeading = false, isSignSeparate = false, totalDigits = 9, fractionDigits = 3)
    protected String cNumericEdited4;
    @XmlElement(name = "CIndex", required = true, type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @CobolElement(cobolName = "C-INDEX", type = CobolType.INDEX_ITEM, byteLength = 4, isJustifiedRight = false, isSigned = false, isSignLeading = false, isSignSeparate = false)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] cIndex;
    @XmlElement(name = "CPointer", required = true, type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @CobolElement(cobolName = "C-POINTER", type = CobolType.POINTER_ITEM, byteLength = 4, isJustifiedRight = false, isSigned = false, isSignLeading = false, isSignSeparate = false)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] cPointer;
    @XmlElement(name = "CProcPointer", required = true, type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @CobolElement(cobolName = "C-PROC-POINTER", type = CobolType.PROC_POINTER_ITEM, byteLength = 8, isJustifiedRight = false, isSigned = false, isSignLeading = false, isSignSeparate = false)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] cProcPointer;
    @XmlElement(name = "CFuncPointer", required = true, type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @CobolElement(cobolName = "C-FUNC-POINTER", type = CobolType.FUNC_POINTER_ITEM, byteLength = 4, isJustifiedRight = false, isSigned = false, isSignLeading = false, isSignSeparate = false)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] cFuncPointer;
    @XmlElement(name = "CExternalFloating", required = true)
    @CobolElement(cobolName = "C-EXTERNAL-FLOATING", type = CobolType.EXTERNAL_FLOATING_ITEM, byteLength = 10, isJustifiedRight = false, isSigned = true, isSignLeading = false, isSignSeparate = false, totalDigits = 4, fractionDigits = 2)
    protected String cExternalFloating;
    @XmlElement(name = "CBinary")
    @CobolElement(cobolName = "C-BINARY", type = CobolType.BINARY_ITEM, byteLength = 4, isJustifiedRight = false, isSigned = true, isSignLeading = false, isSignSeparate = false, totalDigits = 9)
    protected int cBinary;
    @XmlElement(name = "CNativeBinary")
    @CobolElement(cobolName = "C-NATIVE-BINARY", type = CobolType.NATIVE_BINARY_ITEM, byteLength = 2, isJustifiedRight = false, isSigned = false, isSignLeading = false, isSignSeparate = false, totalDigits = 4)
    protected int cNativeBinary;

    /**
     * Gets the value of the cAlphabetic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCAlphabetic() {
        return cAlphabetic;
    }

    /**
     * Sets the value of the cAlphabetic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCAlphabetic(String value) {
        this.cAlphabetic = value;
    }

    public boolean isSetCAlphabetic() {
        return (this.cAlphabetic!= null);
    }

    /**
     * Gets the value of the cNational property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCNational() {
        return cNational;
    }

    /**
     * Sets the value of the cNational property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCNational(String value) {
        this.cNational = value;
    }

    public boolean isSetCNational() {
        return (this.cNational!= null);
    }

    /**
     * Gets the value of the cDbcs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getCDbcs() {
        return cDbcs;
    }

    /**
     * Sets the value of the cDbcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCDbcs(byte[] value) {
        this.cDbcs = ((byte[]) value);
    }

    public boolean isSetCDbcs() {
        return (this.cDbcs!= null);
    }

    /**
     * Gets the value of the cAlphanumericEdited property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCAlphanumericEdited() {
        return cAlphanumericEdited;
    }

    /**
     * Sets the value of the cAlphanumericEdited property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCAlphanumericEdited(String value) {
        this.cAlphanumericEdited = value;
    }

    public boolean isSetCAlphanumericEdited() {
        return (this.cAlphanumericEdited!= null);
    }

    /**
     * Gets the value of the cAlphanumeric property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCAlphanumeric() {
        return cAlphanumeric;
    }

    /**
     * Sets the value of the cAlphanumeric property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCAlphanumeric(String value) {
        this.cAlphanumeric = value;
    }

    public boolean isSetCAlphanumeric() {
        return (this.cAlphanumeric!= null);
    }

    /**
     * Gets the value of the cOctetString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getCOctetString() {
        return cOctetString;
    }

    /**
     * Sets the value of the cOctetString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOctetString(byte[] value) {
        this.cOctetString = ((byte[]) value);
    }

    public boolean isSetCOctetString() {
        return (this.cOctetString!= null);
    }

    /**
     * Gets the value of the cSingleFloat property.
     * 
     */
    public float getCSingleFloat() {
        return cSingleFloat;
    }

    /**
     * Sets the value of the cSingleFloat property.
     * 
     */
    public void setCSingleFloat(float value) {
        this.cSingleFloat = value;
    }

    public boolean isSetCSingleFloat() {
        return true;
    }

    /**
     * Gets the value of the cDoubleFloat property.
     * 
     */
    public double getCDoubleFloat() {
        return cDoubleFloat;
    }

    /**
     * Sets the value of the cDoubleFloat property.
     * 
     */
    public void setCDoubleFloat(double value) {
        this.cDoubleFloat = value;
    }

    public boolean isSetCDoubleFloat() {
        return true;
    }

    /**
     * Gets the value of the cPackedDecimal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCPackedDecimal() {
        return cPackedDecimal;
    }

    /**
     * Sets the value of the cPackedDecimal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCPackedDecimal(BigDecimal value) {
        this.cPackedDecimal = value;
    }

    public boolean isSetCPackedDecimal() {
        return (this.cPackedDecimal!= null);
    }

    /**
     * Gets the value of the cZonedDecimal property.
     * 
     */
    public long getCZonedDecimal() {
        return cZonedDecimal;
    }

    /**
     * Sets the value of the cZonedDecimal property.
     * 
     */
    public void setCZonedDecimal(long value) {
        this.cZonedDecimal = value;
    }

    public boolean isSetCZonedDecimal() {
        return true;
    }

    /**
     * Gets the value of the cNumericEdited1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCNumericEdited1() {
        return cNumericEdited1;
    }

    /**
     * Sets the value of the cNumericEdited1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCNumericEdited1(String value) {
        this.cNumericEdited1 = value;
    }

    public boolean isSetCNumericEdited1() {
        return (this.cNumericEdited1 != null);
    }

    /**
     * Gets the value of the cNumericEdited2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCNumericEdited2() {
        return cNumericEdited2;
    }

    /**
     * Sets the value of the cNumericEdited2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCNumericEdited2(String value) {
        this.cNumericEdited2 = value;
    }

    public boolean isSetCNumericEdited2() {
        return (this.cNumericEdited2 != null);
    }

    /**
     * Gets the value of the cNumericEdited3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCNumericEdited3() {
        return cNumericEdited3;
    }

    /**
     * Sets the value of the cNumericEdited3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCNumericEdited3(String value) {
        this.cNumericEdited3 = value;
    }

    public boolean isSetCNumericEdited3() {
        return (this.cNumericEdited3 != null);
    }

    /**
     * Gets the value of the cNumericEdited4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCNumericEdited4() {
        return cNumericEdited4;
    }

    /**
     * Sets the value of the cNumericEdited4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCNumericEdited4(String value) {
        this.cNumericEdited4 = value;
    }

    public boolean isSetCNumericEdited4() {
        return (this.cNumericEdited4 != null);
    }

    /**
     * Gets the value of the cIndex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getCIndex() {
        return cIndex;
    }

    /**
     * Sets the value of the cIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCIndex(byte[] value) {
        this.cIndex = ((byte[]) value);
    }

    public boolean isSetCIndex() {
        return (this.cIndex!= null);
    }

    /**
     * Gets the value of the cPointer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getCPointer() {
        return cPointer;
    }

    /**
     * Sets the value of the cPointer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCPointer(byte[] value) {
        this.cPointer = ((byte[]) value);
    }

    public boolean isSetCPointer() {
        return (this.cPointer!= null);
    }

    /**
     * Gets the value of the cProcPointer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getCProcPointer() {
        return cProcPointer;
    }

    /**
     * Sets the value of the cProcPointer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCProcPointer(byte[] value) {
        this.cProcPointer = ((byte[]) value);
    }

    public boolean isSetCProcPointer() {
        return (this.cProcPointer!= null);
    }

    /**
     * Gets the value of the cFuncPointer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getCFuncPointer() {
        return cFuncPointer;
    }

    /**
     * Sets the value of the cFuncPointer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCFuncPointer(byte[] value) {
        this.cFuncPointer = ((byte[]) value);
    }

    public boolean isSetCFuncPointer() {
        return (this.cFuncPointer!= null);
    }

    /**
     * Gets the value of the cExternalFloating property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCExternalFloating() {
        return cExternalFloating;
    }

    /**
     * Sets the value of the cExternalFloating property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCExternalFloating(String value) {
        this.cExternalFloating = value;
    }

    public boolean isSetCExternalFloating() {
        return (this.cExternalFloating!= null);
    }

    /**
     * Gets the value of the cBinary property.
     * 
     */
    public int getCBinary() {
        return cBinary;
    }

    /**
     * Sets the value of the cBinary property.
     * 
     */
    public void setCBinary(int value) {
        this.cBinary = value;
    }

    public boolean isSetCBinary() {
        return true;
    }

    /**
     * Gets the value of the cNativeBinary property.
     * 
     */
    public int getCNativeBinary() {
        return cNativeBinary;
    }

    /**
     * Sets the value of the cNativeBinary property.
     * 
     */
    public void setCNativeBinary(int value) {
        this.cNativeBinary = value;
    }

    public boolean isSetCNativeBinary() {
        return true;
    }

}
