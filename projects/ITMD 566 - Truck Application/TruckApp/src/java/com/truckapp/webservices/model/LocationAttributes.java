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
@XmlType(name="Location", propOrder={
"LocationID","LocName","LocationCode","IsActive","CustomerID","Addressstreet1","Addressstreet2","City","State","PostalCode","Region","Location_contact_name","LocPhone","LocFaxNumber","LocEmail"
})
public class LocationAttributes 
{
    private String LocationID;
    private String LocName;
    private String LocationCode;
    private String IsActive;
    private String CustomerID;
    private String Addressstreet1;
    private String Addressstreet2;
    private String City;
    private String State;
    private String PostalCode;
    private String Region;
    private String Location_contact_name;
    private String LocPhone;
    private String LocFaxNumber;
    private String LocEmail;

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
    
}
