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
 * <p>Java class for AirPollutantEPAClassificationData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirPollutantEPAClassificationData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.exchangenetwork.net/schema/icis/5}AirPollutantEPAClassificationCode"/>
 *         &lt;element ref="{http://www.exchangenetwork.net/schema/icis/5}AirPollutantEPAClassificationStartDate" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirPollutantEPAClassificationData", propOrder = {
    "airPollutantEPAClassificationCode",
    "airPollutantEPAClassificationStartDate"
})
/*@Entity(name = "AirPollutantEPAClassificationData")
@Table(name = "ICA_POLUT_EPA_CLASS")
@Inheritance(strategy = InheritanceType.JOINED)*/
@Embeddable
public class AirPollutantEPAClassificationData
    implements Serializable, Equals, HashCode
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "AirPollutantEPAClassificationCode", required = true)
    protected String airPollutantEPAClassificationCode;
    @XmlElement(name = "AirPollutantEPAClassificationStartDate", type = String.class)
    @XmlJavaTypeAdapter(DateNoTimeZoneAdapter.class)
    @XmlSchemaType(name = "date")
    protected Date airPollutantEPAClassificationStartDate;

    /**
     * Gets the value of the airPollutantEPAClassificationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "POLUT_EPA_CLASS_CODE", length = 3)
    public String getAirPollutantEPAClassificationCode() {
        return airPollutantEPAClassificationCode;
    }

    /**
     * Sets the value of the airPollutantEPAClassificationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirPollutantEPAClassificationCode(String value) {
        this.airPollutantEPAClassificationCode = value;
    }

    @Transient
    public boolean isSetAirPollutantEPAClassificationCode() {
        return (this.airPollutantEPAClassificationCode!= null);
    }

    /**
     * Gets the value of the airPollutantEPAClassificationStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "POLUT_EPA_CLASS_START_DATE")
    @Temporal(TemporalType.DATE)
    public Date getAirPollutantEPAClassificationStartDate() {
        return airPollutantEPAClassificationStartDate;
    }

    /**
     * Sets the value of the airPollutantEPAClassificationStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirPollutantEPAClassificationStartDate(Date value) {
        this.airPollutantEPAClassificationStartDate = value;
    }

    @Transient
    public boolean isSetAirPollutantEPAClassificationStartDate() {
        return (this.airPollutantEPAClassificationStartDate!= null);
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof AirPollutantEPAClassificationData)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final AirPollutantEPAClassificationData that = ((AirPollutantEPAClassificationData) object);
        {
            String lhsAirPollutantEPAClassificationCode;
            lhsAirPollutantEPAClassificationCode = this.getAirPollutantEPAClassificationCode();
            String rhsAirPollutantEPAClassificationCode;
            rhsAirPollutantEPAClassificationCode = that.getAirPollutantEPAClassificationCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "airPollutantEPAClassificationCode", lhsAirPollutantEPAClassificationCode), LocatorUtils.property(thatLocator, "airPollutantEPAClassificationCode", rhsAirPollutantEPAClassificationCode), lhsAirPollutantEPAClassificationCode, rhsAirPollutantEPAClassificationCode)) {
                return false;
            }
        }
        {
            Date lhsAirPollutantEPAClassificationStartDate;
            lhsAirPollutantEPAClassificationStartDate = this.getAirPollutantEPAClassificationStartDate();
            Date rhsAirPollutantEPAClassificationStartDate;
            rhsAirPollutantEPAClassificationStartDate = that.getAirPollutantEPAClassificationStartDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "airPollutantEPAClassificationStartDate", lhsAirPollutantEPAClassificationStartDate), LocatorUtils.property(thatLocator, "airPollutantEPAClassificationStartDate", rhsAirPollutantEPAClassificationStartDate), lhsAirPollutantEPAClassificationStartDate, rhsAirPollutantEPAClassificationStartDate)) {
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
            String theAirPollutantEPAClassificationCode;
            theAirPollutantEPAClassificationCode = this.getAirPollutantEPAClassificationCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "airPollutantEPAClassificationCode", theAirPollutantEPAClassificationCode), currentHashCode, theAirPollutantEPAClassificationCode);
        }
        {
            Date theAirPollutantEPAClassificationStartDate;
            theAirPollutantEPAClassificationStartDate = this.getAirPollutantEPAClassificationStartDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "airPollutantEPAClassificationStartDate", theAirPollutantEPAClassificationStartDate), currentHashCode, theAirPollutantEPAClassificationStartDate);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}