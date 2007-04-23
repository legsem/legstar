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
// Generated on: 2007.01.26 at 06:16:42 PM CET 
//


package com.legstar.test.coxb.binnatsi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.legstar.coxb.CobolType;
import com.legstar.coxb.annotation.CobolElement;


/**
 * <p>Java class for WsDoublewordsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WsDoublewordsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="WsPs9X18MinB" type="{http://legstar.com/test/coxb/binnatsi}WsPs9X18MinBType"/>
 *           &lt;element name="WsPs9X18Min">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *         &lt;/choice>
 *         &lt;element name="WsPs9X18Low">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;choice>
 *           &lt;element name="WsPs9X18HighB" type="{http://legstar.com/test/coxb/binnatsi}WsPs9X18HighBType"/>
 *           &lt;element name="WsPs9X18High">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element name="WsPs9X18MaxB" type="{http://legstar.com/test/coxb/binnatsi}WsPs9X18MaxBType"/>
 *           &lt;element name="WsPs9X18Max">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long">
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WsDoublewordsType", propOrder = {
    "wsPs9X18MinB",
    "wsPs9X18Min",
    "wsPs9X18Low",
    "wsPs9X18HighB",
    "wsPs9X18High",
    "wsPs9X18MaxB",
    "wsPs9X18Max"
})
public class WsDoublewordsType {

    @XmlElement(name = "WsPs9X18MinB")
    @CobolElement(cobolName = "WS-PS9X18-MIN-B", type = CobolType.GROUP_ITEM, isJustifiedRight = false, isSigned = false, isSignLeading = false, isSignSeparate = false, isRedefined = true)
    protected WsPs9X18MinBType wsPs9X18MinB;
    @XmlElement(name = "WsPs9X18Min")
    @CobolElement(cobolName = "WS-PS9X18-MIN", type = CobolType.NATIVE_BINARY_ITEM, byteLength = 8, isJustifiedRight = false, isSigned = true, isSignLeading = false, isSignSeparate = false, totalDigits = 18, redefines = "WS-PS9X18-MIN-B")
    protected Long wsPs9X18Min;
    @XmlElement(name = "WsPs9X18Low")
    @CobolElement(cobolName = "WS-PS9X18-LOW", type = CobolType.NATIVE_BINARY_ITEM, byteLength = 8, isJustifiedRight = false, isSigned = true, isSignLeading = false, isSignSeparate = false, totalDigits = 18)
    protected long wsPs9X18Low;
    @XmlElement(name = "WsPs9X18HighB")
    @CobolElement(cobolName = "WS-PS9X18-HIGH-B", type = CobolType.GROUP_ITEM, isJustifiedRight = false, isSigned = false, isSignLeading = false, isSignSeparate = false, isRedefined = true)
    protected WsPs9X18HighBType wsPs9X18HighB;
    @XmlElement(name = "WsPs9X18High")
    @CobolElement(cobolName = "WS-PS9X18-HIGH", type = CobolType.NATIVE_BINARY_ITEM, byteLength = 8, isJustifiedRight = false, isSigned = true, isSignLeading = false, isSignSeparate = false, totalDigits = 18, redefines = "WS-PS9X18-HIGH-B")
    protected Long wsPs9X18High;
    @XmlElement(name = "WsPs9X18MaxB")
    @CobolElement(cobolName = "WS-PS9X18-MAX-B", type = CobolType.GROUP_ITEM, isJustifiedRight = false, isSigned = false, isSignLeading = false, isSignSeparate = false, isRedefined = true)
    protected WsPs9X18MaxBType wsPs9X18MaxB;
    @XmlElement(name = "WsPs9X18Max")
    @CobolElement(cobolName = "WS-PS9X18-MAX", type = CobolType.NATIVE_BINARY_ITEM, byteLength = 8, isJustifiedRight = false, isSigned = true, isSignLeading = false, isSignSeparate = false, totalDigits = 18, redefines = "WS-PS9X18-MAX-B")
    protected Long wsPs9X18Max;

    /**
     * Gets the value of the wsPs9X18MinB property.
     * 
     * @return
     *     possible object is
     *     {@link WsPs9X18MinBType }
     *     
     */
    public WsPs9X18MinBType getWsPs9X18MinB() {
        return wsPs9X18MinB;
    }

    /**
     * Sets the value of the wsPs9X18MinB property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsPs9X18MinBType }
     *     
     */
    public void setWsPs9X18MinB(WsPs9X18MinBType value) {
        this.wsPs9X18MinB = value;
    }

    public boolean isSetWsPs9X18MinB() {
        return (this.wsPs9X18MinB!= null);
    }

    /**
     * Gets the value of the wsPs9X18Min property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getWsPs9X18Min() {
        return wsPs9X18Min;
    }

    /**
     * Sets the value of the wsPs9X18Min property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setWsPs9X18Min(Long value) {
        this.wsPs9X18Min = value;
    }

    public boolean isSetWsPs9X18Min() {
        return (this.wsPs9X18Min!= null);
    }

    /**
     * Gets the value of the wsPs9X18Low property.
     * 
     */
    public long getWsPs9X18Low() {
        return wsPs9X18Low;
    }

    /**
     * Sets the value of the wsPs9X18Low property.
     * 
     */
    public void setWsPs9X18Low(long value) {
        this.wsPs9X18Low = value;
    }

    public boolean isSetWsPs9X18Low() {
        return true;
    }

    /**
     * Gets the value of the wsPs9X18HighB property.
     * 
     * @return
     *     possible object is
     *     {@link WsPs9X18HighBType }
     *     
     */
    public WsPs9X18HighBType getWsPs9X18HighB() {
        return wsPs9X18HighB;
    }

    /**
     * Sets the value of the wsPs9X18HighB property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsPs9X18HighBType }
     *     
     */
    public void setWsPs9X18HighB(WsPs9X18HighBType value) {
        this.wsPs9X18HighB = value;
    }

    public boolean isSetWsPs9X18HighB() {
        return (this.wsPs9X18HighB!= null);
    }

    /**
     * Gets the value of the wsPs9X18High property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getWsPs9X18High() {
        return wsPs9X18High;
    }

    /**
     * Sets the value of the wsPs9X18High property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setWsPs9X18High(Long value) {
        this.wsPs9X18High = value;
    }

    public boolean isSetWsPs9X18High() {
        return (this.wsPs9X18High!= null);
    }

    /**
     * Gets the value of the wsPs9X18MaxB property.
     * 
     * @return
     *     possible object is
     *     {@link WsPs9X18MaxBType }
     *     
     */
    public WsPs9X18MaxBType getWsPs9X18MaxB() {
        return wsPs9X18MaxB;
    }

    /**
     * Sets the value of the wsPs9X18MaxB property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsPs9X18MaxBType }
     *     
     */
    public void setWsPs9X18MaxB(WsPs9X18MaxBType value) {
        this.wsPs9X18MaxB = value;
    }

    public boolean isSetWsPs9X18MaxB() {
        return (this.wsPs9X18MaxB!= null);
    }

    /**
     * Gets the value of the wsPs9X18Max property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getWsPs9X18Max() {
        return wsPs9X18Max;
    }

    /**
     * Sets the value of the wsPs9X18Max property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setWsPs9X18Max(Long value) {
        this.wsPs9X18Max = value;
    }

    public boolean isSetWsPs9X18Max() {
        return (this.wsPs9X18Max!= null);
    }

}
