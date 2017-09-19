//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.09.02 at 11:05:46 AM PDT 
//


package com.windsor.node.plugin.icisair.domain.generated;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;

import com.windsor.node.plugin.common.xml.bind.annotation.adapters.DateNoTimeZoneAdapter;


/**
 * <p>Java class for AirPollutantDAClassificationData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirPollutantDAClassificationData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.exchangenetwork.net/schema/icis/5}AirPollutantDAClassificationCode"/>
 *         &lt;element ref="{http://www.exchangenetwork.net/schema/icis/5}AirPollutantDAClassificationStartDate" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirPollutantDAClassificationData", propOrder = {
    "airPollutantDAClassificationCode",
    "airPollutantDAClassificationStartDate"
})
/*@Entity(name = "AirPollutantDAClassificationData")
@Table(name = "ICA_POLUT_DA_CLASS")
@Inheritance(strategy = InheritanceType.JOINED)*/
@Embeddable
public class AirPollutantDAClassificationData
    implements Serializable, Equals, HashCode
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "AirPollutantDAClassificationCode", required = true)
    protected String airPollutantDAClassificationCode;
    @XmlElement(name = "AirPollutantDAClassificationStartDate", type = String.class)
    @XmlJavaTypeAdapter(DateNoTimeZoneAdapter.class)
    @XmlSchemaType(name = "date")
    protected Date airPollutantDAClassificationStartDate;

    /**
     * Gets the value of the airPollutantDAClassificationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "POLUT_DA_CLASS_CODE", length = 3)
    public String getAirPollutantDAClassificationCode() {
        return airPollutantDAClassificationCode;
    }

    /**
     * Sets the value of the airPollutantDAClassificationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirPollutantDAClassificationCode(String value) {
        this.airPollutantDAClassificationCode = value;
    }

    @Transient
    public boolean isSetAirPollutantDAClassificationCode() {
        return (this.airPollutantDAClassificationCode!= null);
    }

    /**
     * Gets the value of the airPollutantDAClassificationStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "POLUT_DA_CLASS_START_DATE")
    @Temporal(TemporalType.DATE)
    public Date getAirPollutantDAClassificationStartDate() {
        return airPollutantDAClassificationStartDate;
    }

    /**
     * Sets the value of the airPollutantDAClassificationStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirPollutantDAClassificationStartDate(Date value) {
        this.airPollutantDAClassificationStartDate = value;
    }

    @Transient
    public boolean isSetAirPollutantDAClassificationStartDate() {
        return (this.airPollutantDAClassificationStartDate!= null);
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof AirPollutantDAClassificationData)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final AirPollutantDAClassificationData that = ((AirPollutantDAClassificationData) object);
        {
            String lhsAirPollutantDAClassificationCode;
            lhsAirPollutantDAClassificationCode = this.getAirPollutantDAClassificationCode();
            String rhsAirPollutantDAClassificationCode;
            rhsAirPollutantDAClassificationCode = that.getAirPollutantDAClassificationCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "airPollutantDAClassificationCode", lhsAirPollutantDAClassificationCode), LocatorUtils.property(thatLocator, "airPollutantDAClassificationCode", rhsAirPollutantDAClassificationCode), lhsAirPollutantDAClassificationCode, rhsAirPollutantDAClassificationCode)) {
                return false;
            }
        }
        {
            Date lhsAirPollutantDAClassificationStartDate;
            lhsAirPollutantDAClassificationStartDate = this.getAirPollutantDAClassificationStartDate();
            Date rhsAirPollutantDAClassificationStartDate;
            rhsAirPollutantDAClassificationStartDate = that.getAirPollutantDAClassificationStartDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "airPollutantDAClassificationStartDate", lhsAirPollutantDAClassificationStartDate), LocatorUtils.property(thatLocator, "airPollutantDAClassificationStartDate", rhsAirPollutantDAClassificationStartDate), lhsAirPollutantDAClassificationStartDate, rhsAirPollutantDAClassificationStartDate)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            String theAirPollutantDAClassificationCode;
            theAirPollutantDAClassificationCode = this.getAirPollutantDAClassificationCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "airPollutantDAClassificationCode", theAirPollutantDAClassificationCode), currentHashCode, theAirPollutantDAClassificationCode);
        }
        {
            Date theAirPollutantDAClassificationStartDate;
            theAirPollutantDAClassificationStartDate = this.getAirPollutantDAClassificationStartDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "airPollutantDAClassificationStartDate", theAirPollutantDAClassificationStartDate), currentHashCode, theAirPollutantDAClassificationStartDate);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}