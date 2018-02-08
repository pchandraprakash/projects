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
/**
 *
 * @author phani
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="Transaction", propOrder={
"TransactionID","OrderID","PriceID","TranxDate","TranxDesc","TranxAmt","Make","Model","Year","EmployeeID","TruckNo","Discount","Quantity","UnitPrice","DriverPrice","VIN","RunNumber","Special","Rate","Surcharge","Tx_priceID","Amount","Qty","Description","Tx_date","Tx_car_make","Tx_car_model","Tx_car_year","Tx_car_VIN"
})
public class TransactionAttributes 
{
    private String TransactionID;
    private String OrderID;
    private String PriceID;
    private String TranxDate;
    private String TranxDesc;
    private String TranxAmt;
    private String Make;
    private String Model;
    private String Year;
    private String EmployeeID;
    private String TruckNo;
    private String Discount;
    private String Quantity;
    private String UnitPrice;
    private String DriverPrice;
    private String VIN;
    private String RunNumber;
    private String Special;
    private String Rate;
    private String Surcharge;
    private String Tx_priceID;
    private String Amount;
    private String Qty;
    private String Description;
    private String Tx_date;
    private String Tx_car_make;
    private String Tx_car_model;
    private String Tx_car_year;
    private String Tx_car_VIN;

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
     * @return the PriceID
     */
    public String getPriceID() {
        return PriceID;
    }

    /**
     * @param PriceID the PriceID to set
     */
    public void setPriceID(String PriceID) {
        this.PriceID = PriceID;
    }

    /**
     * @return the TranxDate
     */
    public String getTranxDate() {
        return TranxDate;
    }

    /**
     * @param TranxDate the TranxDate to set
     */
    public void setTranxDate(String TranxDate) {
        this.TranxDate = TranxDate;
    }

    /**
     * @return the TranxDesc
     */
    public String getTranxDesc() {
        return TranxDesc;
    }

    /**
     * @param TranxDesc the TranxDesc to set
     */
    public void setTranxDesc(String TranxDesc) {
        this.TranxDesc = TranxDesc;
    }

    /**
     * @return the TranxAmt
     */
    public String getTranxAmt() {
        return TranxAmt;
    }

    /**
     * @param TranxAmt the TranxAmt to set
     */
    public void setTranxAmt(String TranxAmt) {
        this.TranxAmt = TranxAmt;
    }

    /**
     * @return the Make
     */
    public String getMake() {
        return Make;
    }

    /**
     * @param Make the Make to set
     */
    public void setMake(String Make) {
        this.Make = Make;
    }

    /**
     * @return the Model
     */
    public String getModel() {
        return Model;
    }

    /**
     * @param Model the Model to set
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * @return the Year
     */
    public String getYear() {
        return Year;
    }

    /**
     * @param Year the Year to set
     */
    public void setYear(String Year) {
        this.Year = Year;
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
     * @return the Discount
     */
    public String getDiscount() {
        return Discount;
    }

    /**
     * @param Discount the Discount to set
     */
    public void setDiscount(String Discount) {
        this.Discount = Discount;
    }

    /**
     * @return the Quantity
     */
    public String getQuantity() {
        return Quantity;
    }

    /**
     * @param Quantity the Quantity to set
     */
    public void setQuantity(String Quantity) {
        this.Quantity = Quantity;
    }

    /**
     * @return the UnitPrice
     */
    public String getUnitPrice() {
        return UnitPrice;
    }

    /**
     * @param UnitPrice the UnitPrice to set
     */
    public void setUnitPrice(String UnitPrice) {
        this.UnitPrice = UnitPrice;
    }

    /**
     * @return the DriverPrice
     */
    public String getDriverPrice() {
        return DriverPrice;
    }

    /**
     * @param DriverPrice the DriverPrice to set
     */
    public void setDriverPrice(String DriverPrice) {
        this.DriverPrice = DriverPrice;
    }

    /**
     * @return the VIN
     */
    public String getVIN() {
        return VIN;
    }

    /**
     * @param VIN the VIN to set
     */
    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    /**
     * @return the RunNumber
     */
    public String getRunNumber() {
        return RunNumber;
    }

    /**
     * @param RunNumber the RunNumber to set
     */
    public void setRunNumber(String RunNumber) {
        this.RunNumber = RunNumber;
    }

    /**
     * @return the Special
     */
    public String getSpecial() {
        return Special;
    }

    /**
     * @param Special the Special to set
     */
    public void setSpecial(String Special) {
        this.Special = Special;
    }

    /**
     * @return the Rate
     */
    public String getRate() {
        return Rate;
    }

    /**
     * @param Rate the Rate to set
     */
    public void setRate(String Rate) {
        this.Rate = Rate;
    }

    /**
     * @return the Surcharge
     */
    public String getSurcharge() {
        return Surcharge;
    }

    /**
     * @param Surcharge the Surcharge to set
     */
    public void setSurcharge(String Surcharge) {
        this.Surcharge = Surcharge;
    }

    /**
     * @return the Tx_priceID
     */
    public String getTx_priceID() {
        return Tx_priceID;
    }

    /**
     * @param Tx_priceID the Tx_priceID to set
     */
    public void setTx_priceID(String Tx_priceID) {
        this.Tx_priceID = Tx_priceID;
    }

    /**
     * @return the Amount
     */
    public String getAmount() {
        return Amount;
    }

    /**
     * @param Amount the Amount to set
     */
    public void setAmount(String Amount) {
        this.Amount = Amount;
    }

    /**
     * @return the Qty
     */
    public String getQty() {
        return Qty;
    }

    /**
     * @param Qty the Qty to set
     */
    public void setQty(String Qty) {
        this.Qty = Qty;
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
     * @return the Tx_date
     */
    public String getTx_date() {
        return Tx_date;
    }

    /**
     * @param Tx_date the Tx_date to set
     */
    public void setTx_date(String Tx_date) {
        this.Tx_date = Tx_date;
    }

    /**
     * @return the Tx_car_make
     */
    public String getTx_car_make() {
        return Tx_car_make;
    }

    /**
     * @param Tx_car_make the Tx_car_make to set
     */
    public void setTx_car_make(String Tx_car_make) {
        this.Tx_car_make = Tx_car_make;
    }

    /**
     * @return the Tx_car_model
     */
    public String getTx_car_model() {
        return Tx_car_model;
    }

    /**
     * @param Tx_car_model the Tx_car_model to set
     */
    public void setTx_car_model(String Tx_car_model) {
        this.Tx_car_model = Tx_car_model;
    }

    /**
     * @return the Tx_car_year
     */
    public String getTx_car_year() {
        return Tx_car_year;
    }

    /**
     * @param Tx_car_year the Tx_car_year to set
     */
    public void setTx_car_year(String Tx_car_year) {
        this.Tx_car_year = Tx_car_year;
    }

    /**
     * @return the Tx_car_VIN
     */
    public String getTx_car_VIN() {
        return Tx_car_VIN;
    }

    /**
     * @param Tx_car_VIN the Tx_car_VIN to set
     */
    public void setTx_car_VIN(String Tx_car_VIN) {
        this.Tx_car_VIN = Tx_car_VIN;
    }
}
