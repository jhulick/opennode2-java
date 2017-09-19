//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.12.07 at 11:39:25 AM EST 
//


package com.windsor.node.plugin.icisnpdes.generated;

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
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.windsor.node.plugin.common.xml.bind.annotation.adapters.DateNoTimeZoneAdapter;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for MajorMinorStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MajorMinorStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.exchangenetwork.net/schema/icis/5}MajorMinorStatusGroup"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MajorMinorStatus", propOrder = {
    "majorMinorStatusIndicator",
    "majorMinorStatusStartDate"
})
@Embeddable
public class MajorMinorStatus
    implements Serializable, Equals, HashCode
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "MajorMinorStatusIndicator", required = true)
    protected String majorMinorStatusIndicator;
    @XmlElement(name = "MajorMinorStatusStartDate", required = true, type = String.class)
    @XmlJavaTypeAdapter(DateNoTimeZoneAdapter.class)
    protected Date majorMinorStatusStartDate;

    /**
     * Gets the value of the majorMinorStatusIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "MAJOR_MINOR_STAT_IND", columnDefinition = "varchar(1)", length = 1)
    public String getMajorMinorStatusIndicator() {
        return majorMinorStatusIndicator;
    }

    /**
     * Sets the value of the majorMinorStatusIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMajorMinorStatusIndicator(String value) {
        this.majorMinorStatusIndicator = value;
    }

    @Transient
    public boolean isSetMajorMinorStatusIndicator() {
        return (this.majorMinorStatusIndicator!= null);
    }

    /**
     * Gets the value of the majorMinorStatusStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "MAJOR_MINOR_STAT_START_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getMajorMinorStatusStartDate() {
        return majorMinorStatusStartDate;
    }

    /**
     * Sets the value of the majorMinorStatusStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMajorMinorStatusStartDate(Date value) {
        this.majorMinorStatusStartDate = value;
    }

    @Transient
    public boolean isSetMajorMinorStatusStartDate() {
        return (this.majorMinorStatusStartDate!= null);
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof MajorMinorStatus)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final MajorMinorStatus that = ((MajorMinorStatus) object);
        {
            String lhsMajorMinorStatusIndicator;
            lhsMajorMinorStatusIndicator = this.getMajorMinorStatusIndicator();
            String rhsMajorMinorStatusIndicator;
            rhsMajorMinorStatusIndicator = that.getMajorMinorStatusIndicator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "majorMinorStatusIndicator", lhsMajorMinorStatusIndicator), LocatorUtils.property(thatLocator, "majorMinorStatusIndicator", rhsMajorMinorStatusIndicator), lhsMajorMinorStatusIndicator, rhsMajorMinorStatusIndicator)) {
                return false;
            }
        }
        {
            Date lhsMajorMinorStatusStartDate;
            lhsMajorMinorStatusStartDate = this.getMajorMinorStatusStartDate();
            Date rhsMajorMinorStatusStartDate;
            rhsMajorMinorStatusStartDate = that.getMajorMinorStatusStartDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "majorMinorStatusStartDate", lhsMajorMinorStatusStartDate), LocatorUtils.property(thatLocator, "majorMinorStatusStartDate", rhsMajorMinorStatusStartDate), lhsMajorMinorStatusStartDate, rhsMajorMinorStatusStartDate)) {
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
            String theMajorMinorStatusIndicator;
            theMajorMinorStatusIndicator = this.getMajorMinorStatusIndicator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "majorMinorStatusIndicator", theMajorMinorStatusIndicator), currentHashCode, theMajorMinorStatusIndicator);
        }
        {
            Date theMajorMinorStatusStartDate;
            theMajorMinorStatusStartDate = this.getMajorMinorStatusStartDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "majorMinorStatusStartDate", theMajorMinorStatusStartDate), currentHashCode, theMajorMinorStatusStartDate);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}