
package com.truckapp.webservices.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TruckInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TruckInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TruckAttributes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TruckInfo", propOrder = {
    "truckAttributes"
})
public class TruckInfo {

    @XmlElement(name = "TruckAttributes")
    protected String truckAttributes;

    /**
     * Gets the value of the truckAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTruckAttributes() {
        return truckAttributes;
    }

    /**
     * Sets the value of the truckAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTruckAttributes(String value) {
        this.truckAttributes = value;
    }

}
