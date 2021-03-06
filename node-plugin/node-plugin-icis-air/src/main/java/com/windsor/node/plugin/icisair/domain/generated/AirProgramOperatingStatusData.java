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
import javax.xml.bind.annotation.XmlTransient;
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
 * <p>Java class for AirProgramOperatingStatusData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirProgramOperatingStatusData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.exchangenetwork.net/schema/icis/5}AirProgramOperatingStatusCode"/>
 *         &lt;element ref="{http://www.exchangenetwork.net/schema/icis/5}AirProgramOperatingStatusStartDate" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirProgramOperatingStatusData", propOrder = {
    "airProgramOperatingStatusCode",
    "airProgramOperatingStatusStartDate"
})
@Embeddable
public class AirProgramOperatingStatusData
    implements Serializable, Equals, HashCode
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "AirProgramOperatingStatusCode", required = true)
    protected String airProgramOperatingStatusCode;
    @XmlElement(name = "AirProgramOperatingStatusStartDate", type = String.class)
    @XmlJavaTypeAdapter(DateNoTimeZoneAdapter.class)
    @XmlSchemaType(name = "date")
    protected Date airProgramOperatingStatusStartDate;
    @XmlTransient
    protected String dbid;

    /**
     * Gets the value of the airProgramOperatingStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "PROG_OPER_STAT_CODE", length = 5)
    public String getAirProgramOperatingStatusCode() {
        return airProgramOperatingStatusCode;
    }

    /**
     * Sets the value of the airProgramOperatingStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirProgramOperatingStatusCode(String value) {
        this.airProgramOperatingStatusCode = value;
    }

    @Transient
    public boolean isSetAirProgramOperatingStatusCode() {
        return (this.airProgramOperatingStatusCode!= null);
    }

    /**
     * Gets the value of the airProgramOperatingStatusStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "PROG_OPER_STAT_START_DATE")
    @Temporal(TemporalType.DATE)
    public Date getAirProgramOperatingStatusStartDate() {
        return airProgramOperatingStatusStartDate;
    }

    /**
     * Sets the value of the airProgramOperatingStatusStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirProgramOperatingStatusStartDate(Date value) {
        this.airProgramOperatingStatusStartDate = value;
    }

    @Transient
    public boolean isSetAirProgramOperatingStatusStartDate() {
        return (this.airProgramOperatingStatusStartDate!= null);
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof AirProgramOperatingStatusData)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final AirProgramOperatingStatusData that = ((AirProgramOperatingStatusData) object);
        {
            String lhsAirProgramOperatingStatusCode;
            lhsAirProgramOperatingStatusCode = this.getAirProgramOperatingStatusCode();
            String rhsAirProgramOperatingStatusCode;
            rhsAirProgramOperatingStatusCode = that.getAirProgramOperatingStatusCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "airProgramOperatingStatusCode", lhsAirProgramOperatingStatusCode), LocatorUtils.property(thatLocator, "airProgramOperatingStatusCode", rhsAirProgramOperatingStatusCode), lhsAirProgramOperatingStatusCode, rhsAirProgramOperatingStatusCode)) {
                return false;
            }
        }
        {
            Date lhsAirProgramOperatingStatusStartDate;
            lhsAirProgramOperatingStatusStartDate = this.getAirProgramOperatingStatusStartDate();
            Date rhsAirProgramOperatingStatusStartDate;
            rhsAirProgramOperatingStatusStartDate = that.getAirProgramOperatingStatusStartDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "airProgramOperatingStatusStartDate", lhsAirProgramOperatingStatusStartDate), LocatorUtils.property(thatLocator, "airProgramOperatingStatusStartDate", rhsAirProgramOperatingStatusStartDate), lhsAirProgramOperatingStatusStartDate, rhsAirProgramOperatingStatusStartDate)) {
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
            String theAirProgramOperatingStatusCode;
            theAirProgramOperatingStatusCode = this.getAirProgramOperatingStatusCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "airProgramOperatingStatusCode", theAirProgramOperatingStatusCode), currentHashCode, theAirProgramOperatingStatusCode);
        }
        {
            Date theAirProgramOperatingStatusStartDate;
            theAirProgramOperatingStatusStartDate = this.getAirProgramOperatingStatusStartDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "airProgramOperatingStatusStartDate", theAirProgramOperatingStatusStartDate), currentHashCode, theAirProgramOperatingStatusStartDate);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
