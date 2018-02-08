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
@XmlType(name="Payment", propOrder={
"PaymentID","TransactionID","OrderID","PaymentMethod","PaymentAmount","PaymentDate","CheckNumber","CreditCard","CreditCardNumber","CardholdersName","CreditCardExpDate","CreditCardAuthorizationNumber"
})
public class PaymentAttributes 
{
    private String PaymentID;
    private String TransactionID;
    private String OrderID;
    private String PaymentMethod;
    private String PaymentAmount;
    private String PaymentDate;
    private String CheckNumber;
    private String CreditCard;
    private String CreditCardNumber;
    private String CardholdersName;
    private String CreditCardExpDate;
    private String CreditCardAuthorizationNumber;
    /**
     * @return the PaymentID
     */
    public String getPaymentID() {
        return PaymentID;
    }

    /**
     * @param PaymentID the PaymentID to set
     */
    public void setPaymentID(String PaymentID) {
        this.PaymentID = PaymentID;
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
     * @return the PaymentMethod
     */
    public String getPaymentMethod() {
        return PaymentMethod;
    }

    /**
     * @param PaymentMethod the PaymentMethod to set
     */
    public void setPaymentMethod(String PaymentMethod) {
        this.PaymentMethod = PaymentMethod;
    }

    /**
     * @return the PaymentAmount
     */
    public String getPaymentAmount() {
        return PaymentAmount;
    }

    /**
     * @param PaymentAmount the PaymentAmount to set
     */
    public void setPaymentAmount(String PaymentAmount) {
        this.PaymentAmount = PaymentAmount;
    }

    /**
     * @return the PaymentDate
     */
    public String getPaymentDate() {
        return PaymentDate;
    }

    /**
     * @param PaymentDate the PaymentDate to set
     */
    public void setPaymentDate(String PaymentDate) {
        this.PaymentDate = PaymentDate;
    }

    /**
     * @return the CheckNumber
     */
    public String getCheckNumber() {
        return CheckNumber;
    }

    /**
     * @param CheckNumber the CheckNumber to set
     */
    public void setCheckNumber(String CheckNumber) {
        this.CheckNumber = CheckNumber;
    }

    /**
     * @return the CreditCard
     */
    public String getCreditCard() {
        return CreditCard;
    }

    /**
     * @param CreditCard the CreditCard to set
     */
    public void setCreditCard(String CreditCard) {
        this.CreditCard = CreditCard;
    }

    /**
     * @return the CreditCardNumber
     */
    public String getCreditCardNumber() {
        return CreditCardNumber;
    }

    /**
     * @param CreditCardNumber the CreditCardNumber to set
     */
    public void setCreditCardNumber(String CreditCardNumber) {
        this.CreditCardNumber = CreditCardNumber;
    }

    /**
     * @return the CardholdersName
     */
    public String getCardholdersName() {
        return CardholdersName;
    }

    /**
     * @param CardholdersName the CardholdersName to set
     */
    public void setCardholdersName(String CardholdersName) {
        this.CardholdersName = CardholdersName;
    }

    /**
     * @return the CreditCardExpDate
     */
    public String getCreditCardExpDate() {
        return CreditCardExpDate;
    }

    /**
     * @param CreditCardExpDate the CreditCardExpDate to set
     */
    public void setCreditCardExpDate(String CreditCardExpDate) {
        this.CreditCardExpDate = CreditCardExpDate;
    }

    /**
     * @return the CreditCardAuthorizationNumber
     */
    public String getCreditCardAuthorizationNumber() {
        return CreditCardAuthorizationNumber;
    }

    /**
     * @param CreditCardAuthorizationNumber the CreditCardAuthorizationNumber to set
     */
    public void setCreditCardAuthorizationNumber(String CreditCardAuthorizationNumber) {
        this.CreditCardAuthorizationNumber = CreditCardAuthorizationNumber;
    }

}
