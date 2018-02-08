
package com.truckapp.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Pricing complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Pricing"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="priceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="locationIDFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="locationIDTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="locationCodeFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="locationCodeTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="locationNameFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="locationNameTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Pricing", propOrder = {
    "priceID",
    "locationIDFrom",
    "locationIDTo",
    "price",
    "locationCodeFrom",
    "locationCodeTo",
    "locationNameFrom",
    "locationNameTo",
    "customerID"
})
public class Pricing {

    protected String priceID;
    protected String locationIDFrom;
    protected String locationIDTo;
    protected String price;
    protected String locationCodeFrom;
    protected String locationCodeTo;
    protected String locationNameFrom;
    protected String locationNameTo;
    @XmlElement(name = "CustomerID")
    protected String customerID;

    /**
     * Gets the value of the priceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceID() {
        return priceID;
    }

    /**
     * Sets the value of the priceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceID(String value) {
        this.priceID = value;
    }

    /**
     * Gets the value of the locationIDFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationIDFrom() {
        return locationIDFrom;
    }

    /**
     * Sets the value of the locationIDFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationIDFrom(String value) {
        this.locationIDFrom = value;
    }

    /**
     * Gets the value of the locationIDTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationIDTo() {
        return locationIDTo;
    }

    /**
     * Sets the value of the locationIDTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationIDTo(String value) {
        this.locationIDTo = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrice(String value) {
        this.price = value;
    }

    /**
     * Gets the value of the locationCodeFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationCodeFrom() {
        return locationCodeFrom;
    }

    /**
     * Sets the value of the locationCodeFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationCodeFrom(String value) {
        this.locationCodeFrom = value;
    }

    /**
     * Gets the value of the locationCodeTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationCodeTo() {
        return locationCodeTo;
    }

    /**
     * Sets the value of the locationCodeTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationCodeTo(String value) {
        this.locationCodeTo = value;
    }

    /**
     * Gets the value of the locationNameFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationNameFrom() {
        return locationNameFrom;
    }

    /**
     * Sets the value of the locationNameFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationNameFrom(String value) {
        this.locationNameFrom = value;
    }

    /**
     * Gets the value of the locationNameTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationNameTo() {
        return locationNameTo;
    }

    /**
     * Sets the value of the locationNameTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationNameTo(String value) {
        this.locationNameTo = value;
    }

    /**
     * Gets the value of the customerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerID() {
        return customerID;
    }

    /**
     * Sets the value of the customerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerID(String value) {
        this.customerID = value;
    }

}
