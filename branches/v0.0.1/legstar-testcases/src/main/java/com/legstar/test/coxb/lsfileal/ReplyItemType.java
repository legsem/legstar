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
// Generated on: 2007.01.26 at 06:17:00 PM CET 
//


package com.legstar.test.coxb.lsfileal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.legstar.coxb.CobolType;
import com.legstar.coxb.annotation.CobolElement;


/**
 * <p>Java class for ReplyItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReplyItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReplyNumber">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="999999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ReplyPersonal" type="{http://legstar.com/test/coxb/lsfileal}ReplyPersonalType"/>
 *         &lt;element name="ReplyDate">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ReplyAmount">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ReplyComment">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="9"/>
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
@XmlType(name = "ReplyItemType", propOrder = {
    "replyNumber",
    "replyPersonal",
    "replyDate",
    "replyAmount",
    "replyComment"
})
public class ReplyItemType {

    @XmlElement(name = "ReplyNumber")
    @CobolElement(cobolName = "REPLY-NUMBER", type = CobolType.ZONED_DECIMAL_ITEM, byteLength = 6, isJustifiedRight = false, isSigned = false, isSignLeading = false, isSignSeparate = false, totalDigits = 6)
    protected long replyNumber;
    @XmlElement(name = "ReplyPersonal", required = true)
    @CobolElement(cobolName = "REPLY-PERSONAL", type = CobolType.GROUP_ITEM, isJustifiedRight = false, isSigned = false, isSignLeading = false, isSignSeparate = false)
    protected ReplyPersonalType replyPersonal;
    @XmlElement(name = "ReplyDate", required = true)
    @CobolElement(cobolName = "REPLY-DATE", type = CobolType.ALPHANUMERIC_ITEM, byteLength = 8, isJustifiedRight = false, isSigned = false, isSignLeading = false, isSignSeparate = false)
    protected String replyDate;
    @XmlElement(name = "ReplyAmount", required = true)
    @CobolElement(cobolName = "REPLY-AMOUNT", type = CobolType.ALPHANUMERIC_ITEM, byteLength = 8, isJustifiedRight = false, isSigned = false, isSignLeading = false, isSignSeparate = false)
    protected String replyAmount;
    @XmlElement(name = "ReplyComment", required = true)
    @CobolElement(cobolName = "REPLY-COMMENT", type = CobolType.ALPHANUMERIC_ITEM, byteLength = 9, isJustifiedRight = false, isSigned = false, isSignLeading = false, isSignSeparate = false)
    protected String replyComment;

    /**
     * Gets the value of the replyNumber property.
     * 
     */
    public long getReplyNumber() {
        return replyNumber;
    }

    /**
     * Sets the value of the replyNumber property.
     * 
     */
    public void setReplyNumber(long value) {
        this.replyNumber = value;
    }

    public boolean isSetReplyNumber() {
        return true;
    }

    /**
     * Gets the value of the replyPersonal property.
     * 
     * @return
     *     possible object is
     *     {@link ReplyPersonalType }
     *     
     */
    public ReplyPersonalType getReplyPersonal() {
        return replyPersonal;
    }

    /**
     * Sets the value of the replyPersonal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReplyPersonalType }
     *     
     */
    public void setReplyPersonal(ReplyPersonalType value) {
        this.replyPersonal = value;
    }

    public boolean isSetReplyPersonal() {
        return (this.replyPersonal!= null);
    }

    /**
     * Gets the value of the replyDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReplyDate() {
        return replyDate;
    }

    /**
     * Sets the value of the replyDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReplyDate(String value) {
        this.replyDate = value;
    }

    public boolean isSetReplyDate() {
        return (this.replyDate!= null);
    }

    /**
     * Gets the value of the replyAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReplyAmount() {
        return replyAmount;
    }

    /**
     * Sets the value of the replyAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReplyAmount(String value) {
        this.replyAmount = value;
    }

    public boolean isSetReplyAmount() {
        return (this.replyAmount!= null);
    }

    /**
     * Gets the value of the replyComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReplyComment() {
        return replyComment;
    }

    /**
     * Sets the value of the replyComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReplyComment(String value) {
        this.replyComment = value;
    }

    public boolean isSetReplyComment() {
        return (this.replyComment!= null);
    }

}