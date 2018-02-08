
package com.truckapp.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExpenseInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExpenseInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ExpenseAttributes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExpenseInfo", propOrder = {
    "expenseAttributes"
})
public class ExpenseInfo {

    @XmlElement(name = "ExpenseAttributes")
    protected String expenseAttributes;

    /**
     * Gets the value of the expenseAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpenseAttributes() {
        return expenseAttributes;
    }

    /**
     * Sets the value of the expenseAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpenseAttributes(String value) {
        this.expenseAttributes = value;
    }

}
