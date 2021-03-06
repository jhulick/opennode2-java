//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.09.02 at 11:05:46 AM PDT 
//


package com.windsor.node.plugin.icisair.domain.generated;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for AirDAEnforcementActionMilestoneKeyElements complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirDAEnforcementActionMilestoneKeyElements">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.exchangenetwork.net/schema/icis/5}AirDAEnforcementActionMilestoneKeyElementsGroup"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirDAEnforcementActionMilestoneKeyElements", propOrder = {
    "airDAEnforcementActionIdentifier",
    "milestoneTypeCode"
})
@XmlSeeAlso({
    AirDAEnforcementActionMilestone.class
})
@MappedSuperclass
public class AirDAEnforcementActionMilestoneKeyElements
    implements Serializable, Equals, HashCode
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "AirDAEnforcementActionIdentifier", required = true)
    protected String airDAEnforcementActionIdentifier;
    @XmlElement(name = "MilestoneTypeCode", required = true)
    protected String milestoneTypeCode;

    /**
     * Gets the value of the airDAEnforcementActionIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "DA_ENFRC_ACTN_IDENT", length = 25)
    public String getAirDAEnforcementActionIdentifier() {
        return airDAEnforcementActionIdentifier;
    }

    /**
     * Sets the value of the airDAEnforcementActionIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirDAEnforcementActionIdentifier(String value) {
        this.airDAEnforcementActionIdentifier = value;
    }

    @Transient
    public boolean isSetAirDAEnforcementActionIdentifier() {
        return (this.airDAEnforcementActionIdentifier!= null);
    }

    /**
     * Gets the value of the milestoneTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "MILSTN_TYPE_CODE", length = 5)
    public String getMilestoneTypeCode() {
        return milestoneTypeCode;
    }

    /**
     * Sets the value of the milestoneTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMilestoneTypeCode(String value) {
        this.milestoneTypeCode = value;
    }

    @Transient
    public boolean isSetMilestoneTypeCode() {
        return (this.milestoneTypeCode!= null);
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof AirDAEnforcementActionMilestoneKeyElements)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final AirDAEnforcementActionMilestoneKeyElements that = ((AirDAEnforcementActionMilestoneKeyElements) object);
        {
            String lhsAirDAEnforcementActionIdentifier;
            lhsAirDAEnforcementActionIdentifier = this.getAirDAEnforcementActionIdentifier();
            String rhsAirDAEnforcementActionIdentifier;
            rhsAirDAEnforcementActionIdentifier = that.getAirDAEnforcementActionIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "airDAEnforcementActionIdentifier", lhsAirDAEnforcementActionIdentifier), LocatorUtils.property(thatLocator, "airDAEnforcementActionIdentifier", rhsAirDAEnforcementActionIdentifier), lhsAirDAEnforcementActionIdentifier, rhsAirDAEnforcementActionIdentifier)) {
                return false;
            }
        }
        {
            String lhsMilestoneTypeCode;
            lhsMilestoneTypeCode = this.getMilestoneTypeCode();
            String rhsMilestoneTypeCode;
            rhsMilestoneTypeCode = that.getMilestoneTypeCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "milestoneTypeCode", lhsMilestoneTypeCode), LocatorUtils.property(thatLocator, "milestoneTypeCode", rhsMilestoneTypeCode), lhsMilestoneTypeCode, rhsMilestoneTypeCode)) {
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
            String theAirDAEnforcementActionIdentifier;
            theAirDAEnforcementActionIdentifier = this.getAirDAEnforcementActionIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "airDAEnforcementActionIdentifier", theAirDAEnforcementActionIdentifier), currentHashCode, theAirDAEnforcementActionIdentifier);
        }
        {
            String theMilestoneTypeCode;
            theMilestoneTypeCode = this.getMilestoneTypeCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "milestoneTypeCode", theMilestoneTypeCode), currentHashCode, theMilestoneTypeCode);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
