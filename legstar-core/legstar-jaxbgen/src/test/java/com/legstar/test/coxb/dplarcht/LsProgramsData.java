
package com.legstar.test.coxb.dplarcht;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for LsProgramsData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LsProgramsData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LsProgramName">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="8"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LsProgramType">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="12"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LsProgramLanguage">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="12"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LsProgramLength">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="9"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LsProgramUsecount">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;totalDigits value="9"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Filler113">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="24"/>
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
@XmlType(name = "LsProgramsData", propOrder = {
    "lsProgramName",
    "lsProgramType",
    "lsProgramLanguage",
    "lsProgramLength",
    "lsProgramUsecount",
    "filler113"
})
public class LsProgramsData
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "LsProgramName", required = true)
    @CobolElement(cobolName = "LS-PROGRAM-NAME", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 25, picture = "X(8)", srceLine = 108)
    protected String lsProgramName;
    @XmlElement(name = "LsProgramType", required = true)
    @CobolElement(cobolName = "LS-PROGRAM-TYPE", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 25, picture = "X(12)", srceLine = 109)
    protected String lsProgramType;
    @XmlElement(name = "LsProgramLanguage", required = true)
    @CobolElement(cobolName = "LS-PROGRAM-LANGUAGE", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 25, picture = "X(12)", srceLine = 110)
    protected String lsProgramLanguage;
    @XmlElement(name = "LsProgramLength")
    @CobolElement(cobolName = "LS-PROGRAM-LENGTH", type = CobolType.BINARY_ITEM, levelNumber = 25, isSigned = true, totalDigits = 9, picture = "S9(9)", usage = "BINARY", srceLine = 111)
    protected int lsProgramLength;
    @XmlElement(name = "LsProgramUsecount")
    @CobolElement(cobolName = "LS-PROGRAM-USECOUNT", type = CobolType.BINARY_ITEM, levelNumber = 25, isSigned = true, totalDigits = 9, picture = "S9(9)", usage = "BINARY", srceLine = 112)
    protected int lsProgramUsecount;
    @XmlElement(name = "Filler113", required = true)
    @CobolElement(cobolName = "FILLER", type = CobolType.ALPHANUMERIC_ITEM, levelNumber = 25, picture = "X(24)", srceLine = 113)
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
