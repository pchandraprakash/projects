/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tws.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author phani
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="TruckApp", propOrder={
"CustomerID","CustomerTitle","BusinessName","LocationID","BillingAddress","City","State","PostalCode","Country","PhoneNumber","CellNumber","OtherNumber","FaxNumber","EmailAddress","CompanyName","ContactName","AlternateContactName","DateEntered","CustomerType","EmployeeID","FirstName","LastName","Email","Extension","HomePhone","CellPhone","JobTitle","SocialSecurityNumber","DriverLicenseNumber","Address","BirthDate","DateHired","Salary","Notes","ExpenseID","ExpenseType","PurposeofExpense","AmountSpent","Description","DatePurchased","DateSubmitted","AdvanceAmount","PaymentMethod","InvoiceID","InvoiceDate","DueDate","OrderID","OrderTotalAmount","LocName","LocationCode","IsActive","Addressstreet1","Addressstreet2","Region","Location_contact_name","LocPhone","LocFaxNumber","LocEmail","TruckNo","IsSpecial","PurchaseOrderNumber","TransactionID","PaymentID","PaymentAmount","PaymentDate","CheckNumber","CreditCard","CreditCardNumber","CardholdersName","CreditCardExpDate","CreditCardAuthorizationNumber","PriceID","LocationIDFrom","LocationIDTo","Price","LocationCodeFrom","LocationCodeTo","LocationNameFrom","LocationNameTo","TranxDate","TranxDesc","TranxAmt","Make","Model","Year","Discount","Quantity","UnitPrice","DriverPrice","VIN","RunNumber","Special","Rate","Surcharge","Tx_priceID","Amount","Qty","Tx_date","Tx_car_make","Tx_car_model","Tx_car_year","Tx_car_VIN","LicensePlateNo","Color","CommentID"
})
public class TruckAppAttributes 
{
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
    private String EmployeeID;
    private String FirstName;
    private String LastName;
    private String Email;
    private String Extension;
    private String HomePhone;
    private String CellPhone;
    private String JobTitle;
    private String SocialSecurityNumber;
    private String DriverLicenseNumber;
    private String Address;
    private String BirthDate;
    private String DateHired;
    private String Salary;
    private String Notes;
    private String ExpenseID;
    private String ExpenseType;
    private String PurposeofExpense;
    private String AmountSpent;
    private String Description;
    private String DatePurchased;
    private String DateSubmitted;
    private String AdvanceAmount;
    private String PaymentMethod;
    private String InvoiceID;
    private String InvoiceDate;
    private String DueDate;
    private String OrderID;
    private String OrderTotalAmount;
    private String LocName;
    private String LocationCode;
    private String IsActive;
    private String Addressstreet1;
    private String Addressstreet2;
    private String Region;
    private String Location_contact_name;
    private String LocPhone;
    private String LocFaxNumber;
    private String LocEmail;
    private String TruckNo;
    private String IsSpecial;
    private String PurchaseOrderNumber;
    private String TransactionID;
    private String PaymentID;
    private String PaymentAmount;
    private String PaymentDate;
    private String CheckNumber;
    private String CreditCard;
    private String CreditCardNumber;
    private String CardholdersName;
    private String CreditCardExpDate;
    private String CreditCardAuthorizationNumber;
    private String PriceID ;
    private String LocationIDFrom ;
    private String LocationIDTo ;
    private String Price ;
    private String LocationCodeFrom ;
    private String LocationCodeTo ;
    private String LocationNameFrom ;
    private String LocationNameTo ;
    private String TranxDate;
    private String TranxDesc;
    private String TranxAmt;
    private String Make;
    private String Model;
    private String Year;
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
    private String Tx_date;
    private String Tx_car_make;
    private String Tx_car_model;
    private String Tx_car_year;
    private String Tx_car_VIN;
    private String LicensePlateNo;
    private String Color;
    private String CommentID;

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
     * @return the FirstName
     */
    public String getFirstName() {
        return FirstName;
    }

    /**
     * @param FirstName the FirstName to set
     */
    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    /**
     * @return the LastName
     */
    public String getLastName() {
        return LastName;
    }

    /**
     * @param LastName the LastName to set
     */
    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    /**
     * @return the Email
     */
    public String getEmail() {
        return Email;
    }

    /**
     * @param Email the Email to set
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * @return the Extension
     */
    public String getExtension() {
        return Extension;
    }

    /**
     * @param Extension the Extension to set
     */
    public void setExtension(String Extension) {
        this.Extension = Extension;
    }

    /**
     * @return the HomePhone
     */
    public String getHomePhone() {
        return HomePhone;
    }

    /**
     * @param HomePhone the HomePhone to set
     */
    public void setHomePhone(String HomePhone) {
        this.HomePhone = HomePhone;
    }

    /**
     * @return the CellPhone
     */
    public String getCellPhone() {
        return CellPhone;
    }

    /**
     * @param CellPhone the CellPhone to set
     */
    public void setCellPhone(String CellPhone) {
        this.CellPhone = CellPhone;
    }

    /**
     * @return the JobTitle
     */
    public String getJobTitle() {
        return JobTitle;
    }

    /**
     * @param JobTitle the JobTitle to set
     */
    public void setJobTitle(String JobTitle) {
        this.JobTitle = JobTitle;
    }

    /**
     * @return the SocialSecurityNumber
     */
    public String getSocialSecurityNumber() {
        return SocialSecurityNumber;
    }

    /**
     * @param SocialSecurityNumber the SocialSecurityNumber to set
     */
    public void setSocialSecurityNumber(String SocialSecurityNumber) {
        this.SocialSecurityNumber = SocialSecurityNumber;
    }

    /**
     * @return the DriverLicenseNumber
     */
    public String getDriverLicenseNumber() {
        return DriverLicenseNumber;
    }

    /**
     * @param DriverLicenseNumber the DriverLicenseNumber to set
     */
    public void setDriverLicenseNumber(String DriverLicenseNumber) {
        this.DriverLicenseNumber = DriverLicenseNumber;
    }

    /**
     * @return the Address
     */
    public String getAddress() {
        return Address;
    }

    /**
     * @param Address the Address to set
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * @return the BirthDate
     */
    public String getBirthDate() {
        return BirthDate;
    }

    /**
     * @param BirthDate the BirthDate to set
     */
    public void setBirthDate(String BirthDate) {
        this.BirthDate = BirthDate;
    }

    /**
     * @return the DateHired
     */
    public String getDateHired() {
        return DateHired;
    }

    /**
     * @param DateHired the DateHired to set
     */
    public void setDateHired(String DateHired) {
        this.DateHired = DateHired;
    }

    /**
     * @return the Salary
     */
    public String getSalary() {
        return Salary;
    }

    /**
     * @param Salary the Salary to set
     */
    public void setSalary(String Salary) {
        this.Salary = Salary;
    }

    /**
     * @return the Notes
     */
    public String getNotes() {
        return Notes;
    }

    /**
     * @param Notes the Notes to set
     */
    public void setNotes(String Notes) {
        this.Notes = Notes;
    }

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
     * @return the LocName
     */
    public String getLocName() {
        return LocName;
    }

    /**
     * @param LocName the LocName to set
     */
    public void setLocName(String LocName) {
        this.LocName = LocName;
    }

    /**
     * @return the LocationCode
     */
    public String getLocationCode() {
        return LocationCode;
    }

    /**
     * @param LocationCode the LocationCode to set
     */
    public void setLocationCode(String LocationCode) {
        this.LocationCode = LocationCode;
    }

    /**
     * @return the IsActive
     */
    public String getIsActive() {
        return IsActive;
    }

    /**
     * @param IsActive the IsActive to set
     */
    public void setIsActive(String IsActive) {
        this.IsActive = IsActive;
    }

    /**
     * @return the Addressstreet1
     */
    public String getAddressstreet1() {
        return Addressstreet1;
    }

    /**
     * @param Addressstreet1 the Addressstreet1 to set
     */
    public void setAddressstreet1(String Addressstreet1) {
        this.Addressstreet1 = Addressstreet1;
    }

    /**
     * @return the Addressstreet2
     */
    public String getAddressstreet2() {
        return Addressstreet2;
    }

    /**
     * @param Addressstreet2 the Addressstreet2 to set
     */
    public void setAddressstreet2(String Addressstreet2) {
        this.Addressstreet2 = Addressstreet2;
    }

    /**
     * @return the Region
     */
    public String getRegion() {
        return Region;
    }

    /**
     * @param Region the Region to set
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * @return the Location_contact_name
     */
    public String getLocation_contact_name() {
        return Location_contact_name;
    }

    /**
     * @param Location_contact_name the Location_contact_name to set
     */
    public void setLocation_contact_name(String Location_contact_name) {
        this.Location_contact_name = Location_contact_name;
    }

    /**
     * @return the LocPhone
     */
    public String getLocPhone() {
        return LocPhone;
    }

    /**
     * @param LocPhone the LocPhone to set
     */
    public void setLocPhone(String LocPhone) {
        this.LocPhone = LocPhone;
    }

    /**
     * @return the LocFaxNumber
     */
    public String getLocFaxNumber() {
        return LocFaxNumber;
    }

    /**
     * @param LocFaxNumber the LocFaxNumber to set
     */
    public void setLocFaxNumber(String LocFaxNumber) {
        this.LocFaxNumber = LocFaxNumber;
    }

    /**
     * @return the LocEmail
     */
    public String getLocEmail() {
        return LocEmail;
    }

    /**
     * @param LocEmail the LocEmail to set
     */
    public void setLocEmail(String LocEmail) {
        this.LocEmail = LocEmail;
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
     * @return the LocationIDFrom
     */
    public String getLocationIDFrom() {
        return LocationIDFrom;
    }

    /**
     * @param LocationIDFrom the LocationIDFrom to set
     */
    public void setLocationIDFrom(String LocationIDFrom) {
        this.LocationIDFrom = LocationIDFrom;
    }

    /**
     * @return the LocationIDTo
     */
    public String getLocationIDTo() {
        return LocationIDTo;
    }

    /**
     * @param LocationIDTo the LocationIDTo to set
     */
    public void setLocationIDTo(String LocationIDTo) {
        this.LocationIDTo = LocationIDTo;
    }

    /**
     * @return the Price
     */
    public String getPrice() {
        return Price;
    }

    /**
     * @param Price the Price to set
     */
    public void setPrice(String Price) {
        this.Price = Price;
    }

    /**
     * @return the LocationCodeFrom
     */
    public String getLocationCodeFrom() {
        return LocationCodeFrom;
    }

    /**
     * @param LocationCodeFrom the LocationCodeFrom to set
     */
    public void setLocationCodeFrom(String LocationCodeFrom) {
        this.LocationCodeFrom = LocationCodeFrom;
    }

    /**
     * @return the LocationCodeTo
     */
    public String getLocationCodeTo() {
        return LocationCodeTo;
    }

    /**
     * @param LocationCodeTo the LocationCodeTo to set
     */
    public void setLocationCodeTo(String LocationCodeTo) {
        this.LocationCodeTo = LocationCodeTo;
    }

    /**
     * @return the LocationNameFrom
     */
    public String getLocationNameFrom() {
        return LocationNameFrom;
    }

    /**
     * @param LocationNameFrom the LocationNameFrom to set
     */
    public void setLocationNameFrom(String LocationNameFrom) {
        this.LocationNameFrom = LocationNameFrom;
    }

    /**
     * @return the LocationNameTo
     */
    public String getLocationNameTo() {
        return LocationNameTo;
    }

    /**
     * @param LocationNameTo the LocationNameTo to set
     */
    public void setLocationNameTo(String LocationNameTo) {
        this.LocationNameTo = LocationNameTo;
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

    /**
     * @return the LicensePlateNo
     */
    public String getLicensePlateNo() {
        return LicensePlateNo;
    }

    /**
     * @param LicensePlateNo the LicensePlateNo to set
     */
    public void setLicensePlateNo(String LicensePlateNo) {
        this.LicensePlateNo = LicensePlateNo;
    }

    /**
     * @return the Color
     */
    public String getColor() {
        return Color;
    }

    /**
     * @param Color the Color to set
     */
    public void setColor(String Color) {
        this.Color = Color;
    }

    /**
     * @return the CommentID
     */
    public String getCommentID() {
        return CommentID;
    }

    /**
     * @param CommentID the CommentID to set
     */
    public void setCommentID(String CommentID) {
        this.CommentID = CommentID;
    }
    
    
}
