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
 * <p>Java class for WsTransactionDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WsTransactionDescriptionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WsTransactionStart">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="WsTransactionName">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="WsTransactionProgram">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="WsTransactionStatus">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="99999999"/>
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
@XmlType(name = "WsTransactionDescriptionType", propOrder = {
    "wsTransactionStart",
    "wsTransactionName",
    "wsTransactionProgram",
    "wsTransactionStatus"
})
public class WsTransactionDescriptionType {

    @XmlElement(name = "WsTransactionStart", required = true)
    @CobolElement(cobolName = "WS-TRANSACTION-START", type = CobolType.ALPHANUMERIC_ITEM, byteLength = 8, isJustifiedRight = false, isSigned = false, isSignLeading = false, isSignSeparate = false)
    protected String wsTransactionStart;
    @XmlElement(name = "WsTransactionName", required = true)
    @CobolElement(cobolName = "WS-TRANSACTION-NAME", type = CobolType.ALPHANUMERIC_ITEM, byteLength = 8, isJustifiedRight = false, isSigned = false, isSignLeading = false, isSignSeparate = false)
    protected String wsTransactionName;
    @XmlElement(name = "WsTransactionProgram", required = true)
    @CobolElement(cobolName = "WS-TRANSACTION-PROGRAM", type = CobolType.ALPHANUMERIC_ITEM, byteLength = 8, isJustifiedRight = false, isSigned = false, isSignLeading = false, isSignSeparate = false)
    protected String wsTransactionProgram;
    @XmlElement(name = "WsTransactionStatus")
    @CobolElement(cobolName = "WS-TRANSACTION-STATUS", type = CobolType.BINARY_ITEM, byteLength = 4, isJustifiedRight = false, isSigned = false, isSignLeading = false, isSignSeparate = false, totalDigits = 8)
    protected long wsTransactionStatus;

    /**
     * Gets the value of the wsTransactionStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWsTransactionStart() {
        return wsTransactionStart;
    }

    /**
     * Sets the value of the wsTransactionStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWsTransactionStart(String value) {
        this.wsTransactionStart = value;
    }

    public boolean isSetWsTransactionStart() {
        return (this.wsTransactionStart!= null);
    }

    /**
     * Gets the value of the wsTransactionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWsTransactionName() {
        return wsTransactionName;
    }

    /**
     * Sets the value of the wsTransactionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWsTransactionName(String value) {
        this.wsTransactionName = value;
    }

    public boolean isSetWsTransactionName() {
        return (this.wsTransactionName!= null);
    }

    /**
     * Gets the value of the wsTransactionProgram property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWsTransactionProgram() {
        return wsTransactionProgram;
    }

    /**
     * Sets the value of the wsTransactionProgram property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWsTransactionProgram(String value) {
        this.wsTransactionProgram = value;
    }

    public boolean isSetWsTransactionProgram() {
        return (this.wsTransactionProgram!= null);
    }

    /**
     * Gets the value of the wsTransactionStatus property.
     * 
     */
    public long getWsTransactionStatus() {
        return wsTransactionStatus;
    }

    /**
     * Sets the value of the wsTransactionStatus property.
     * 
     */
    public void setWsTransactionStatus(long value) {
        this.wsTransactionStatus = value;
    }

    public boolean isSetWsTransactionStatus() {
        return true;
    }

}
