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
@XmlType(name="Pricing", propOrder={
"priceID","locationIDFrom","locationIDTo","price","locationCodeFrom","locationCodeTo","locationNameFrom","locationNameTo","CustomerID"
})
public class PricingAttributes 
{
    private String priceID ;
    private String locationIDFrom ;
    private String locationIDTo ;
    private String price ;
    private String locationCodeFrom ;
    private String locationCodeTo ;
    private String locationNameFrom ;
    private String locationNameTo ;
    private String CustomerID ;

    /**
     * @return the priceID
     */
    public String getPriceID() {
        return priceID;
    }

    /**
     * @param priceID the priceID to set
     */
    public void setPriceID(String priceID) {
        this.priceID = priceID;
    }

    /**
     * @return the locationIDFrom
     */
    public String getLocationIDFrom() {
        return locationIDFrom;
    }

    /**
     * @param locationIDFrom the locationIDFrom to set
     */
    public void setLocationIDFrom(String locationIDFrom) {
        this.locationIDFrom = locationIDFrom;
    }

    /**
     * @return the locationIDTo
     */
    public String getLocationIDTo() {
        return locationIDTo;
    }

    /**
     * @param locationIDTo the locationIDTo to set
     */
    public void setLocationIDTo(String locationIDTo) {
        this.locationIDTo = locationIDTo;
    }

    /**
     * @return the price
     */
    public String getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(String price) {
        this.price = price;
    }

    /**
     * @return the locationCodeFrom
     */
    public String getLocationCodeFrom() {
        return locationCodeFrom;
    }

    /**
     * @param locationCodeFrom the locationCodeFrom to set
     */
    public void setLocationCodeFrom(String locationCodeFrom) {
        this.locationCodeFrom = locationCodeFrom;
    }

    /**
     * @return the locationCodeTo
     */
    public String getLocationCodeTo() {
        return locationCodeTo;
    }

    /**
     * @param locationCodeTo the locationCodeTo to set
     */
    public void setLocationCodeTo(String locationCodeTo) {
        this.locationCodeTo = locationCodeTo;
    }

    /**
     * @return the locationNameFrom
     */
    public String getLocationNameFrom() {
        return locationNameFrom;
    }

    /**
     * @param locationNameFrom the locationNameFrom to set
     */
    public void setLocationNameFrom(String locationNameFrom) {
        this.locationNameFrom = locationNameFrom;
    }

    /**
     * @return the locationNameTo
     */
    public String getLocationNameTo() {
        return locationNameTo;
    }

    /**
     * @param locationNameTo the locationNameTo to set
     */
    public void setLocationNameTo(String locationNameTo) {
        this.locationNameTo = locationNameTo;
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
}
