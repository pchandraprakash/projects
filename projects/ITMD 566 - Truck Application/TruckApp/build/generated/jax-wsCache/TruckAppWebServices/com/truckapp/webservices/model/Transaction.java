
package com.truckapp.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Transaction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Transaction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TransactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PriceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TranxDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TranxDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TranxAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Make" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Model" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Year" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EmployeeID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TruckNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Discount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UnitPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DriverPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RunNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Special" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Rate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Surcharge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Tx_priceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Qty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Tx_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Tx_car_make" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Tx_car_model" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Tx_car_year" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Tx_car_VIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Transaction", propOrder = {
    "transactionID",
    "orderID",
    "priceID",
    "tranxDate",
    "tranxDesc",
    "tranxAmt",
    "make",
    "model",
    "year",
    "employeeID",
    "truckNo",
    "discount",
    "quantity",
    "unitPrice",
    "driverPrice",
    "vin",
    "runNumber",
    "special",
    "rate",
    "surcharge",
    "txPriceID",
    "amount",
    "qty",
    "description",
    "txDate",
    "txCarMake",
    "txCarModel",
    "txCarYear",
    "txCarVIN"
})
public class Transaction {

    @XmlElement(name = "TransactionID")
    protected String transactionID;
    @XmlElement(name = "OrderID")
    protected String orderID;
    @XmlElement(name = "PriceID")
    protected String priceID;
    @XmlElement(name = "TranxDate")
    protected String tranxDate;
    @XmlElement(name = "TranxDesc")
    protected String tranxDesc;
    @XmlElement(name = "TranxAmt")
    protected String tranxAmt;
    @XmlElement(name = "Make")
    protected String make;
    @XmlElement(name = "Model")
    protected String model;
    @XmlElement(name = "Year")
    protected String year;
    @XmlElement(name = "EmployeeID")
    protected String employeeID;
    @XmlElement(name = "TruckNo")
    protected String truckNo;
    @XmlElement(name = "Discount")
    protected String discount;
    @XmlElement(name = "Quantity")
    protected String quantity;
    @XmlElement(name = "UnitPrice")
    protected String unitPrice;
    @XmlElement(name = "DriverPrice")
    protected String driverPrice;
    @XmlElement(name = "VIN")
    protected String vin;
    @XmlElement(name = "RunNumber")
    protected String runNumber;
    @XmlElement(name = "Special")
    protected String special;
    @XmlElement(name = "Rate")
    protected String rate;
    @XmlElement(name = "Surcharge")
    protected String surcharge;
    @XmlElement(name = "Tx_priceID")
    protected String txPriceID;
    @XmlElement(name = "Amount")
    protected String amount;
    @XmlElement(name = "Qty")
    protected String qty;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Tx_date")
    protected String txDate;
    @XmlElement(name = "Tx_car_make")
    protected String txCarMake;
    @XmlElement(name = "Tx_car_model")
    protected String txCarModel;
    @XmlElement(name = "Tx_car_year")
    protected String txCarYear;
    @XmlElement(name = "Tx_car_VIN")
    protected String txCarVIN;

    /**
     * Gets the value of the transactionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionID() {
        return transactionID;
    }

    /**
     * Sets the value of the transactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionID(String value) {
        this.transactionID = value;
    }

    /**
     * Gets the value of the orderID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderID() {
        return orderID;
    }

    /**
     * Sets the value of the orderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderID(String value) {
        this.orderID = value;
    }

    /**
     * Gets the value of the priceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceID() {
        return priceID;
    }

    /**
     * Sets the value of the priceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceID(String value) {
        this.priceID = value;
    }

    /**
     * Gets the value of the tranxDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranxDate() {
        return tranxDate;
    }

    /**
     * Sets the value of the tranxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranxDate(String value) {
        this.tranxDate = value;
    }

    /**
     * Gets the value of the tranxDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranxDesc() {
        return tranxDesc;
    }

    /**
     * Sets the value of the tranxDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranxDesc(String value) {
        this.tranxDesc = value;
    }

    /**
     * Gets the value of the tranxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranxAmt() {
        return tranxAmt;
    }

    /**
     * Sets the value of the tranxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranxAmt(String value) {
        this.tranxAmt = value;
    }

    /**
     * Gets the value of the make property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMake() {
        return make;
    }

    /**
     * Sets the value of the make property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMake(String value) {
        this.make = value;
    }

    /**
     * Gets the value of the model property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModel() {
        return model;
    }

    /**
     * Sets the value of the model property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModel(String value) {
        this.model = value;
    }

    /**
     * Gets the value of the year property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYear(String value) {
        this.year = value;
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
     * Gets the value of the truckNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTruckNo() {
        return truckNo;
    }

    /**
     * Sets the value of the truckNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTruckNo(String value) {
        this.truckNo = value;
    }

    /**
     * Gets the value of the discount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscount() {
        return discount;
    }

    /**
     * Sets the value of the discount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscount(String value) {
        this.discount = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantity(String value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the unitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitPrice() {
        return unitPrice;
    }

    /**
     * Sets the value of the unitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitPrice(String value) {
        this.unitPrice = value;
    }

    /**
     * Gets the value of the driverPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriverPrice() {
        return driverPrice;
    }

    /**
     * Sets the value of the driverPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriverPrice(String value) {
        this.driverPrice = value;
    }

    /**
     * Gets the value of the vin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVIN() {
        return vin;
    }

    /**
     * Sets the value of the vin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVIN(String value) {
        this.vin = value;
    }

    /**
     * Gets the value of the runNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRunNumber() {
        return runNumber;
    }

    /**
     * Sets the value of the runNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRunNumber(String value) {
        this.runNumber = value;
    }

    /**
     * Gets the value of the special property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecial() {
        return special;
    }

    /**
     * Sets the value of the special property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecial(String value) {
        this.special = value;
    }

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRate(String value) {
        this.rate = value;
    }

    /**
     * Gets the value of the surcharge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurcharge() {
        return surcharge;
    }

    /**
     * Sets the value of the surcharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurcharge(String value) {
        this.surcharge = value;
    }

    /**
     * Gets the value of the txPriceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxPriceID() {
        return txPriceID;
    }

    /**
     * Sets the value of the txPriceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxPriceID(String value) {
        this.txPriceID = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmount(String value) {
        this.amount = value;
    }

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQty(String value) {
        this.qty = value;
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
     * Gets the value of the txDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxDate() {
        return txDate;
    }

    /**
     * Sets the value of the txDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxDate(String value) {
        this.txDate = value;
    }

    /**
     * Gets the value of the txCarMake property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxCarMake() {
        return txCarMake;
    }

    /**
     * Sets the value of the txCarMake property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxCarMake(String value) {
        this.txCarMake = value;
    }

    /**
     * Gets the value of the txCarModel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxCarModel() {
        return txCarModel;
    }

    /**
     * Sets the value of the txCarModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxCarModel(String value) {
        this.txCarModel = value;
    }

    /**
     * Gets the value of the txCarYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxCarYear() {
        return txCarYear;
    }

    /**
     * Sets the value of the txCarYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxCarYear(String value) {
        this.txCarYear = value;
    }

    /**
     * Gets the value of the txCarVIN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxCarVIN() {
        return txCarVIN;
    }

    /**
     * Sets the value of the txCarVIN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxCarVIN(String value) {
        this.txCarVIN = value;
    }

}
