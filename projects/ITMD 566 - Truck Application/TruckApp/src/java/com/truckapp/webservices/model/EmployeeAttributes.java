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
@XmlType(name="Employee", propOrder={
"EmployeeID","FirstName","LastName","Email","Extension","HomePhone","CellPhone","JobTitle","SocialSecurityNumber","DriverLicenseNumber","Address","City","State","PostalCode","BirthDate","DateHired","Salary","Notes"
})
public class EmployeeAttributes 
{
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
    private String City;
    private String State;
    private String PostalCode;
    private String BirthDate;
    private String DateHired;
    private String Salary;
    private String Notes;

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
}
