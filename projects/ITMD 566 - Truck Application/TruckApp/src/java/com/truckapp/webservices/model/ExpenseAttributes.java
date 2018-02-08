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
@XmlType(name="Expense", propOrder={
"ExpenseID","EmployeeID","ExpenseType","PurposeofExpense","AmountSpent","Description","DatePurchased","DateSubmitted","AdvanceAmount","PaymentMethod"
})
public class ExpenseAttributes
{
    private String ExpenseID;
    private String EmployeeID;
    private String ExpenseType;
    private String PurposeofExpense;
    private String AmountSpent;
    private String Description;
    private String DatePurchased;
    private String DateSubmitted;
    private String AdvanceAmount;
    private String PaymentMethod;

    /**
     * @return the ExpenseID
     */
    public String getExpenseID() {
        return ExpenseID;
    }

    /**
     * @param ExpenseID the ExpenseID to set
     */
    public void setExpenseID(String ExpenseID) {
        this.ExpenseID = ExpenseID;
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
     * @return the ExpenseType
     */
    public String getExpenseType() {
        return ExpenseType;
    }

    /**
     * @param ExpenseType the ExpenseType to set
     */
    public void setExpenseType(String ExpenseType) {
        this.ExpenseType = ExpenseType;
    }

    /**
     * @return the PurposeofExpense
     */
    public String getPurposeofExpense() {
        return PurposeofExpense;
    }

    /**
     * @param PurposeofExpense the PurposeofExpense to set
     */
    public void setPurposeofExpense(String PurposeofExpense) {
        this.PurposeofExpense = PurposeofExpense;
    }

    /**
     * @return the AmountSpent
     */
    public String getAmountSpent() {
        return AmountSpent;
    }

    /**
     * @param AmountSpent the AmountSpent to set
     */
    public void setAmountSpent(String AmountSpent) {
        this.AmountSpent = AmountSpent;
    }

    /**
     * @return the Description
     */
    public String getDescription() {
        return Description;
    }

    /**
     * @param Description the Description to set
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * @return the DatePurchased
     */
    public String getDatePurchased() {
        return DatePurchased;
    }

    /**
     * @param DatePurchased the DatePurchased to set
     */
    public void setDatePurchased(String DatePurchased) {
        this.DatePurchased = DatePurchased;
    }

    /**
     * @return the DateSubmitted
     */
    public String getDateSubmitted() {
        return DateSubmitted;
    }

    /**
     * @param DateSubmitted the DateSubmitted to set
     */
    public void setDateSubmitted(String DateSubmitted) {
        this.DateSubmitted = DateSubmitted;
    }

    /**
     * @return the AdvanceAmount
     */
    public String getAdvanceAmount() {
        return AdvanceAmount;
    }

    /**
     * @param AdvanceAmount the AdvanceAmount to set
     */
    public void setAdvanceAmount(String AdvanceAmount) {
        this.AdvanceAmount = AdvanceAmount;
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
}
