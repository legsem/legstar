
package com.legstar.test.coxb.arrayscx;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Dfhcommarea complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Dfhcommarea">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TableThree" type="{http://legstar.com/test/coxb/arrayscx}TableThree"/>
 *         &lt;element name="TableRedef" type="{http://legstar.com/test/coxb/arrayscx}TableRedef" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dfhcommarea", propOrder = {
    "tableThree",
    "tableRedef"
})
public class Dfhcommarea {

    @XmlElement(name = "TableThree", required = true)
    protected TableThree tableThree;
    @XmlElement(name = "TableRedef", required = true)
    protected List<TableRedef> tableRedef;

    /**
     * Gets the value of the tableThree property.
     * 
     * @return
     *     possible object is
     *     {@link TableThree }
     *     
     */
    public TableThree getTableThree() {
        return tableThree;
    }

    /**
     * Sets the value of the tableThree property.
     * 
     * @param value
     *     allowed object is
     *     {@link TableThree }
     *     
     */
    public void setTableThree(TableThree value) {
        this.tableThree = value;
    }

    /**
     * Gets the value of the tableRedef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tableRedef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTableRedef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TableRedef }
     * 
     * 
     */
    public List<TableRedef> getTableRedef() {
        if (tableRedef == null) {
            tableRedef = new ArrayList<TableRedef>();
        }
        return this.tableRedef;
    }

}
