//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.3-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.07.17 at 10:43:33 AM CEST 
//


package com.legstar.test.coxb.vararcom;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


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
 *         &lt;element name="CItemsNumber">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CArray" type="{http://legstar.com/test/coxb/vararcom}CArrayType" maxOccurs="250"/>
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
    "cItemsNumber",
    "cArray"
})
public class DfhcommareaType {

    @XmlElement(name = "CItemsNumber")
    @CobolElement(cobolName = "C-ITEMS-NUMBER", type = CobolType.NATIVE_BINARY_ITEM, levelNumber = 5, byteLength = 2, isSigned = true, totalDigits = 4, isODOObject = true, picture = "S9(4)", usage = "COMP-5", srceLine = 22)
    protected short cItemsNumber;
    @XmlElement(name = "CArray", required = true)
    @CobolElement(cobolName = "C-ARRAY", type = CobolType.GROUP_ITEM, levelNumber = 5, minOccurs = 1, maxOccurs = 250, dependingOn = "C-ITEMS-NUMBER", srceLine = 23)
    protected List<CArrayType> cArray;

    /**
     * Gets the value of the cItemsNumber property.
     * 
     */
    public short getCItemsNumber() {
        return cItemsNumber;
    }

    /**
     * Sets the value of the cItemsNumber property.
     * 
     */
    public void setCItemsNumber(short value) {
        this.cItemsNumber = value;
    }

    public boolean isSetCItemsNumber() {
        return true;
    }

    /**
     * Gets the value of the cArray property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cArray property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCArray().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CArrayType }
     * 
     * 
     */
    public List<CArrayType> getCArray() {
        if (cArray == null) {
            cArray = new ArrayList<CArrayType>();
        }
        return this.cArray;
    }

    public boolean isSetCArray() {
        return ((this.cArray!= null)&&(!this.cArray.isEmpty()));
    }

    public void unsetCArray() {
        this.cArray = null;
    }

}
