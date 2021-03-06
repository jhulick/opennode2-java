//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.01.24 at 11:33:47 AM PST 
//


package com.windsor.node.plugin.facid3.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AgencyTypeDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgencyTypeDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.exchangenetwork.net/schema/facilityid/3}AgencyTypeCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.exchangenetwork.net/schema/facilityid/3}AgencyTypeCodeListIdentifier" minOccurs="0"/>
 *         &lt;element ref="{http://www.exchangenetwork.net/schema/facilityid/3}AgencyTypeName" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgencyTypeDataType", propOrder = {
    "agencyTypeCode",
    "agencyTypeCodeListIdentifier",
    "agencyTypeName"
})
public class AgencyTypeDataType {

    @XmlElement(name = "AgencyTypeCode")
    protected String agencyTypeCode;
    @XmlElement(name = "AgencyTypeCodeListIdentifier")
    protected AgencyTypeCodeListIdentifierDataType agencyTypeCodeListIdentifier;
    @XmlElement(name = "AgencyTypeName")
    protected String agencyTypeName;

    /**
     * Gets the value of the agencyTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyTypeCode() {
        return agencyTypeCode;
    }

    /**
     * Sets the value of the agencyTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyTypeCode(String value) {
        this.agencyTypeCode = value;
    }

    /**
     * Gets the value of the agencyTypeCodeListIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link AgencyTypeCodeListIdentifierDataType }
     *     
     */
    public AgencyTypeCodeListIdentifierDataType getAgencyTypeCodeListIdentifier() {
        return agencyTypeCodeListIdentifier;
    }

    /**
     * Sets the value of the agencyTypeCodeListIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgencyTypeCodeListIdentifierDataType }
     *     
     */
    public void setAgencyTypeCodeListIdentifier(AgencyTypeCodeListIdentifierDataType value) {
        this.agencyTypeCodeListIdentifier = value;
    }

    /**
     * Gets the value of the agencyTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyTypeName() {
        return agencyTypeName;
    }

    /**
     * Sets the value of the agencyTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyTypeName(String value) {
        this.agencyTypeName = value;
    }

}
