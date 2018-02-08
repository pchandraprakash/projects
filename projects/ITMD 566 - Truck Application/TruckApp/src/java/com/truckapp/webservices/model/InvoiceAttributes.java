/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.truckapp.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
/**
 *
 * @author phani
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="Invoice", propOrder={
"InvoiceID","InvoiceDate","DueDate","OrderID","CustomerID","OrderTotalAmount"
})
public class InvoiceAttributes 
{
    private String InvoiceID;
    private String InvoiceDate;
    private String DueDate;
    private String OrderID;
    private String CustomerID;
    private String OrderTotalAmount;

    /**
     * @return the InvoiceID
     */
    public String getInvoiceID() {
        return InvoiceID;
    }

    /**
     * @param InvoiceID the InvoiceID to set
     */
    public void setInvoiceID(String InvoiceID) {
        this.InvoiceID = InvoiceID;
    }

    /**
     * @return the InvoiceDate
     */
    public String getInvoiceDate() {
        return InvoiceDate;
    }

    /**
     * @param InvoiceDate the InvoiceDate to set
     */
    public void setInvoiceDate(String InvoiceDate) {
        this.InvoiceDate = InvoiceDate;
    }

    /**
     * @return the DueDate
     */
    public String getDueDate() {
        return DueDate;
    }

    /**
     * @param DueDate the DueDate to set
     */
    public void setDueDate(String DueDate) {
        this.DueDate = DueDate;
    }

    /**
     * @return the OrderID
     */
    public String getOrderID() {
        return OrderID;
    }

    /**
     * @param OrderID the OrderID to set
     */
    public void setOrderID(String OrderID) {
        this.OrderID = OrderID;
    }

    /**
     * @return the customerID
     */
    public String getCustomerID() {
        return CustomerID;
    }

    /**
     * @param customerID the customerID to set
     */
    public void setCustomerID(String customerID) {
        this.CustomerID = customerID;
    }

    /**
     * @return the OrderTotalAmount
     */
    public String getOrderTotalAmount() {
        return OrderTotalAmount;
    }

    /**
     * @param OrderTotalAmount the OrderTotalAmount to set
     */
    public void setOrderTotalAmount(String OrderTotalAmount) {
        this.OrderTotalAmount = OrderTotalAmount;
    }
}
