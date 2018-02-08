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
@XmlType(name="Orders", propOrder={
"OrderID","OrderDate","CustomerID","EmployeeID","TruckNo","IsSpecial","PurchaseOrderNumber","OrderTotalAmount","TransactionID"
})
public class OrdersAttributes
{
    private String OrderID;
    private String OrderDate;
    private String CustomerID;
    private String EmployeeID;
    private String TruckNo;
    private String IsSpecial;
    private String PurchaseOrderNumber;
    private String OrderTotalAmount;
    private String TransactionID;

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
     * @return the OrderDate
     */
    public String getOrderDate() {
        return OrderDate;
    }

    /**
     * @param OrderDate the OrderDate to set
     */
    public void setOrderDate(String OrderDate) {
        this.OrderDate = OrderDate;
    }

    /**
     * @return the CustomerID
     */
    public String getCustomerID() {
        return CustomerID;
    }

    /**
     * @param CustomerID the CustomerID to set
     */
    public void setCustomerID(String CustomerID) {
        this.CustomerID = CustomerID;
    }

    /**
     * @return the EmployeeID
     */
    public String getEmployeeID() {
        return EmployeeID;
    }

    /**
     * @param EmployeeID the EmployeeID to set
     */
    public void setEmployeeID(String EmployeeID) {
        this.EmployeeID = EmployeeID;
    }

    /**
     * @return the TruckNo
     */
    public String getTruckNo() {
        return TruckNo;
    }

    /**
     * @param TruckNo the TruckNo to set
     */
    public void setTruckNo(String TruckNo) {
        this.TruckNo = TruckNo;
    }

    /**
     * @return the IsSpecial
     */
    public String getIsSpecial() {
        return IsSpecial;
    }

    /**
     * @param IsSpecial the IsSpecial to set
     */
    public void setIsSpecial(String IsSpecial) {
        this.IsSpecial = IsSpecial;
    }

    /**
     * @return the PurchaseOrderNumber
     */
    public String getPurchaseOrderNumber() {
        return PurchaseOrderNumber;
    }

    /**
     * @param PurchaseOrderNumber the PurchaseOrderNumber to set
     */
    public void setPurchaseOrderNumber(String PurchaseOrderNumber) {
        this.PurchaseOrderNumber = PurchaseOrderNumber;
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

    /**
     * @return the TransactionID
     */
    public String getTransactionID() {
        return TransactionID;
    }

    /**
     * @param TransactionID the TransactionID to set
     */
    public void setTransactionID(String TransactionID) {
        this.TransactionID = TransactionID;
    }

    
}