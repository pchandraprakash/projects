
package com.truckapp.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Expense complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Expense"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ExpenseID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EmployeeID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExpenseType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PurposeofExpense" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AmountSpent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DatePurchased" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DateSubmitted" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AdvanceAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaymentMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Expense", propOrder = {
    "expenseID",
    "employeeID",
    "expenseType",
    "purposeofExpense",
    "amountSpent",
    "description",
    "datePurchased",
    "dateSubmitted",
    "advanceAmount",
    "paymentMethod"
})
public class Expense {

    @XmlElement(name = "ExpenseID")
    protected String expenseID;
    @XmlElement(name = "EmployeeID")
    protected String employeeID;
    @XmlElement(name = "ExpenseType")
    protected String expenseType;
    @XmlElement(name = "PurposeofExpense")
    protected String purposeofExpense;
    @XmlElement(name = "AmountSpent")
    protected String amountSpent;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "DatePurchased")
    protected String datePurchased;
    @XmlElement(name = "DateSubmitted")
    protected String dateSubmitted;
    @XmlElement(name = "AdvanceAmount")
    protected String advanceAmount;
    @XmlElement(name = "PaymentMethod")
    protected String paymentMethod;

    /**
     * Gets the value of the expenseID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpenseID() {
        return expenseID;
    }

    /**
     * Sets the value of the expenseID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpenseID(String value) {
        this.expenseID = value;
    }

    /**
     * Gets the value of the employeeID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeID() {
        return employeeID;
    }

    /**
     * Sets the value of the employeeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeID(String value) {
        this.employeeID = value;
    }

    /**
     * Gets the value of the expenseType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpenseType() {
        return expenseType;
    }

    /**
     * Sets the value of the expenseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpenseType(String value) {
        this.expenseType = value;
    }

    /**
     * Gets the value of the purposeofExpense property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurposeofExpense() {
        return purposeofExpense;
    }

    /**
     * Sets the value of the purposeofExpense property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurposeofExpense(String value) {
        this.purposeofExpense = value;
    }

    /**
     * Gets the value of the amountSpent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmountSpent() {
        return amountSpent;
    }

    /**
     * Sets the value of the amountSpent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmountSpent(String value) {
        this.amountSpent = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the datePurchased property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatePurchased() {
        return datePurchased;
    }

    /**
     * Sets the value of the datePurchased property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatePurchased(String value) {
        this.datePurchased = value;
    }

    /**
     * Gets the value of the dateSubmitted property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateSubmitted() {
        return dateSubmitted;
    }

    /**
     * Sets the value of the dateSubmitted property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateSubmitted(String value) {
        this.dateSubmitted = value;
    }

    /**
     * Gets the value of the advanceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdvanceAmount() {
        return advanceAmount;
    }

    /**
     * Sets the value of the advanceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdvanceAmount(String value) {
        this.advanceAmount = value;
    }

    /**
     * Gets the value of the paymentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Sets the value of the paymentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentMethod(String value) {
        this.paymentMethod = value;
    }

}
