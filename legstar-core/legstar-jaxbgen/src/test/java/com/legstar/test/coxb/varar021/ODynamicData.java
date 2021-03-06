
package com.legstar.test.coxb.varar021;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.legstar.coxb.CobolElement;
import com.legstar.coxb.CobolType;


/**
 * <p>Java class for ODynamicData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ODynamicData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LkupInfo" type="{http://legstar.com/test/coxb/varar021}LkupInfo44" maxOccurs="2" minOccurs="2"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODynamicData", propOrder = {
    "lkupInfo"
})
public class ODynamicData
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "LkupInfo", required = true)
    @CobolElement(cobolName = "LKUP-INFO", type = CobolType.GROUP_ITEM, levelNumber = 10, minOccurs = 2, maxOccurs = 2, srceLine = 44)
    protected List<LkupInfo44> lkupInfo;

    /**
     * Gets the value of the lkupInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lkupInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLkupInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LkupInfo44 }
     * 
     * 
     */
    public List<LkupInfo44> getLkupInfo() {
        if (lkupInfo == null) {
            lkupInfo = new ArrayList<LkupInfo44>();
        }
        return this.lkupInfo;
    }

    public boolean isSetLkupInfo() {
        return ((this.lkupInfo!= null)&&(!this.lkupInfo.isEmpty()));
    }

    public void unsetLkupInfo() {
        this.lkupInfo = null;
    }

}
