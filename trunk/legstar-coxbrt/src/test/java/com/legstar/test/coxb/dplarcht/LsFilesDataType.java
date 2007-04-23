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
 * <p>Java class for LsFilesDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LsFilesDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LsFileName">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LsFileDsname">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="44"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LsFileEnablestatus">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="12"/>
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
@XmlType(name = "LsFilesDataType", propOrder = {
    "lsFileName",
    "lsFileDsname",
    "lsFileEnablestatus"
})
public class LsFilesDataType {

    @XmlElement(name = "LsFileName", required = true)
    @CobolElement(cobolName = "LS-FILE-NAME", type = CobolType.ALPHANUMERIC_ITEM, byteLength = 8, isJustifiedRight = false, isSigned = false, isSignLeading = false, isSignSeparate = false)
    protected String lsFileName;
    @XmlElement(name = "LsFileDsname", required = true)
    @CobolElement(cobolName = "LS-FILE-DSNAME", type = CobolType.ALPHANUMERIC_ITEM, byteLength = 44, isJustifiedRight = false, isSigned = false, isSignLeading = false, isSignSeparate = false)
    protected String lsFileDsname;
    @XmlElement(name = "LsFileEnablestatus", required = true)
    @CobolElement(cobolName = "LS-FILE-ENABLESTATUS", type = CobolType.ALPHANUMERIC_ITEM, byteLength = 12, isJustifiedRight = false, isSigned = false, isSignLeading = false, isSignSeparate = false)
    protected String lsFileEnablestatus;

    /**
     * Gets the value of the lsFileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLsFileName() {
        return lsFileName;
    }

    /**
     * Sets the value of the lsFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLsFileName(String value) {
        this.lsFileName = value;
    }

    public boolean isSetLsFileName() {
        return (this.lsFileName!= null);
    }

    /**
     * Gets the value of the lsFileDsname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLsFileDsname() {
        return lsFileDsname;
    }

    /**
     * Sets the value of the lsFileDsname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLsFileDsname(String value) {
        this.lsFileDsname = value;
    }

    public boolean isSetLsFileDsname() {
        return (this.lsFileDsname!= null);
    }

    /**
     * Gets the value of the lsFileEnablestatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLsFileEnablestatus() {
        return lsFileEnablestatus;
    }

    /**
     * Sets the value of the lsFileEnablestatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLsFileEnablestatus(String value) {
        this.lsFileEnablestatus = value;
    }

    public boolean isSetLsFileEnablestatus() {
        return (this.lsFileEnablestatus!= null);
    }

}
