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
@XmlType(name="Customer", propOrder={
"CustomerID","CustomerTitle","BusinessName","LocationID","BillingAddress","City","State","PostalCode","Country","PhoneNumber","CellNumber","OtherNumber","FaxNumber","EmailAddress","CompanyName","ContactName","AlternateContactName","DateEntered","CustomerType"
})
public class CustomerAttributes 
{

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
     * @return the CustomerTitle
     */
    public String getCustomerTitle() {
        return CustomerTitle;
    }

    /**
     * @param CustomerTitle the CustomerTitle to set
     */
    public void setCustomerTitle(String CustomerTitle) {
        this.CustomerTitle = CustomerTitle;
    }

    /**
     * @return the BusinessName
     */
    public String getBusinessName() {
        return BusinessName;
    }

    /**
     * @param BusinessName the BusinessName to set
     */
    public void setBusinessName(String BusinessName) {
        this.BusinessName = BusinessName;
    }

    /**
     * @return the LocationID
     */
    public String getLocationID() {
        return LocationID;
    }

    /**
     * @param LocationID the LocationID to set
     */
    public void setLocationID(String LocationID) {
        this.LocationID = LocationID;
    }

    /**
     * @return the BillingAddress
     */
    public String getBillingAddress() {
        return BillingAddress;
    }

    /**
     * @param BillingAddress the BillingAddress to set
     */
    public void setBillingAddress(String BillingAddress) {
        this.BillingAddress = BillingAddress;
    }

    /**
     * @return the City
     */
    public String getCity() {
        return City;
    }

    /**
     * @param City the City to set
     */
    public void setCity(String City) {
        this.City = City;
    }

    /**
     * @return the State
     */
    public String getState() {
        return State;
    }

    /**
     * @param State the State to set
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * @return the PostalCode
     */
    public String getPostalCode() {
        return PostalCode;
    }

    /**
     * @param PostalCode the PostalCode to set
     */
    public void setPostalCode(String PostalCode) {
        this.PostalCode = PostalCode;
    }

    /**
     * @return the Country
     */
    public String getCountry() {
        return Country;
    }

    /**
     * @param Country the Country to set
     */
    public void setCountry(String Country) {
        this.Country = Country;
    }

    /**
     * @return the PhoneNumber
     */
    public String getPhoneNumber() {
        return PhoneNumber;
    }

    /**
     * @param PhoneNumber the PhoneNumber to set
     */
    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    /**
     * @return the CellNumber
     */
    public String getCellNumber() {
        return CellNumber;
    }

    /**
     * @param CellNumber the CellNumber to set
     */
    public void setCellNumber(String CellNumber) {
        this.CellNumber = CellNumber;
    }

    /**
     * @return the OtherNumber
     */
    public String getOtherNumber() {
        return OtherNumber;
    }

    /**
     * @param OtherNumber the OtherNumber to set
     */
    public void setOtherNumber(String OtherNumber) {
        this.OtherNumber = OtherNumber;
    }

    /**
     * @return the FaxNumber
     */
    public String getFaxNumber() {
        return FaxNumber;
    }

    /**
     * @param FaxNumber the FaxNumber to set
     */
    public void setFaxNumber(String FaxNumber) {
        this.FaxNumber = FaxNumber;
    }

    /**
     * @return the EmailAddress
     */
    public String getEmailAddress() {
        return EmailAddress;
    }

    /**
     * @param EmailAddress the EmailAddress to set
     */
    public void setEmailAddress(String EmailAddress) {
        this.EmailAddress = EmailAddress;
    }

    /**
     * @return the CompanyName
     */
    public String getCompanyName() {
        return CompanyName;
    }

    /**
     * @param CompanyName the CompanyName to set
     */
    public void setCompanyName(String CompanyName) {
        this.CompanyName = CompanyName;
    }

    /**
     * @return the ContactName
     */
    public String getContactName() {
        return ContactName;
    }

    /**
     * @param ContactName the ContactName to set
     */
    public void setContactName(String ContactName) {
        this.ContactName = ContactName;
    }

    /**
     * @return the AlternateContactName
     */
    public String getAlternateContactName() {
        return AlternateContactName;
    }

    /**
     * @param AlternateContactName the AlternateContactName to set
     */
    public void setAlternateContactName(String AlternateContactName) {
        this.AlternateContactName = AlternateContactName;
    }

    /**
     * @return the DateEntered
     */
    public String getDateEntered() {
        return DateEntered;
    }

    /**
     * @param DateEntered the DateEntered to set
     */
    public void setDateEntered(String DateEntered) {
        this.DateEntered = DateEntered;
    }

    /**
     * @return the CustomerType
     */
    public String getCustomerType() {
        return CustomerType;
    }

    /**
     * @param CustomerType the CustomerType to set
     */
    public void setCustomerType(String CustomerType) {
        this.CustomerType = CustomerType;
    }
    private String CustomerID;
    private String CustomerTitle;
    private String BusinessName;
    private String LocationID;
    private String BillingAddress;
    private String City;
    private String State;
    private String PostalCode;
    private String Country;
    private String PhoneNumber;
    private String CellNumber;
    private String OtherNumber;
    private String FaxNumber;
    private String EmailAddress;
    private String CompanyName;
    private String ContactName;
    private String AlternateContactName;
    private String DateEntered;
    private String CustomerType;
}
