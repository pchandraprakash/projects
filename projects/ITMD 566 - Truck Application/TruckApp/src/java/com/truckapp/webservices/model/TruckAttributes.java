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
@XmlType(name="Truck", propOrder={
"TruckNo","Make","Year","Model","LicensePlateNo","EmployeeID","Color","VIN","CommentID"
})
public class TruckAttributes 
{

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
    private String TruckNo;
    private String Make;
    private String Year;
    private String Model;
    private String LicensePlateNo;
    private String EmployeeID;
    private String Color;
    private String VIN;
    private String CommentID;
}
