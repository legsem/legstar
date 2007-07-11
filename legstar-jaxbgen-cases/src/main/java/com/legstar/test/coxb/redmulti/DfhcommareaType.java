//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.3-b01-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.07.11 at 02:03:49 PM CEST 
//


package com.legstar.test.coxb.redmulti;

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
 *         &lt;element name="COutputType">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;choice>
 *           &lt;element name="CData">
 *             &lt;simpleType>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;length value="200"/>
 *               &lt;/restriction>
 *             &lt;/simpleType>
 *           &lt;/element>
 *           &lt;element name="Filler35" type="{http://legstar.com/test/coxb/redmulti}Filler35Type"/>
 *           &lt;element name="Filler38" type="{http://legstar.com/test/coxb/redmulti}Filler38Type"/>
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
@XmlType(name = "DfhcommareaType", propOrder = {
    "cOutputType",
    "cData",
    "filler35",
    "filler38"
})
public class DfhcommareaType {

    @XmlElement(name = "COutputType", required = true)
    @CobolElement(cobolName = "C-OUTPUT-TYPE", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 5, byteLength = 6, picture = "X(6)", usage = "DISPLAY", srceLine = 31)
    protected String cOutputType;
    @XmlElement(name = "CData")
    @CobolElement(cobolName = "C-DATA", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 3, byteLength = 200, isRedefined = true, picture = "X(200)", usage = "DISPLAY", unmarshalChoiceStrategyClassName = "com.legstar.coxb.cust.redmulti.ChoiceSelector", srceLine = 34)
    protected String cData;
    @XmlElement(name = "Filler35")
    @CobolElement(cobolName = "FILLER-35", type = CobolType.GROUP_ITEM, levelNumber = 3, redefines = "C-DATA", srceLine = 35)
    protected Filler35Type filler35;
    @XmlElement(name = "Filler38")
    @CobolElement(cobolName = "FILLER-38", type = CobolType.GROUP_ITEM, levelNumber = 3, redefines = "C-DATA", srceLine = 38)
    protected Filler38Type filler38;

    /**
     * Gets the value of the cOutputType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOutputType() {
        return cOutputType;
    }

    /**
     * Sets the value of the cOutputType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOutputType(String value) {
        this.cOutputType = value;
    }

    public boolean isSetCOutputType() {
        return (this.cOutputType!= null);
    }

    /**
     * Gets the value of the cData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCData() {
        return cData;
    }

    /**
     * Sets the value of the cData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCData(String value) {
        this.cData = value;
    }

    public boolean isSetCData() {
        return (this.cData!= null);
    }

    /**
     * Gets the value of the filler35 property.
     * 
     * @return
     *     possible object is
     *     {@link Filler35Type }
     *     
     */
    public Filler35Type getFiller35() {
        return filler35;
    }

    /**
     * Sets the value of the filler35 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Filler35Type }
     *     
     */
    public void setFiller35(Filler35Type value) {
        this.filler35 = value;
    }

    public boolean isSetFiller35() {
        return (this.filler35 != null);
    }

    /**
     * Gets the value of the filler38 property.
     * 
     * @return
     *     possible object is
     *     {@link Filler38Type }
     *     
     */
    public Filler38Type getFiller38() {
        return filler38;
    }

    /**
     * Sets the value of the filler38 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Filler38Type }
     *     
     */
    public void setFiller38(Filler38Type value) {
        this.filler38 = value;
    }

    public boolean isSetFiller38() {
        return (this.filler38 != null);
    }

}
