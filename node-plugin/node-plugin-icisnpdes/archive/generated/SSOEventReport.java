//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.12.07 at 11:39:25 AM EST 
//


package com.windsor.node.plugin.icisnpdes.generated;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.windsor.node.plugin.common.xml.bind.annotation.adapters.Decimal10FloatingTypeAdapter;
import com.windsor.node.plugin.common.xml.bind.annotation.adapters.Decimal11FloatingTypeAdapter;
import com.windsor.node.plugin.common.xml.bind.annotation.adapters.IntegerAdapter;
import com.windsor.node.plugin.common.xml.bind.annotation.adapters.TwoDigitPrecisionAdapter;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for SSOEventReport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SSOEventReport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.exchangenetwork.net/schema/icis/5}SSOEventReportKeyElements">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.exchangenetwork.net/schema/icis/5}SSOOverflowEventGroup" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SSOEventReport", propOrder = {
    "causeSSOOverflowEvent",
    "latitudeMeasure",
    "longitudeMeasure",
    "ssoOverflowLocationStreet",
    "durationSSOOverflowEvent",
    "ssoVolume",
    "nameReceivingWater",
    "impactSSOEvent",
    "ssoSystemComponent",
    "ssoSteps",
    "descriptionStepsTaken"
})
@Embeddable
public class SSOEventReport
    extends SSOEventReportKeyElements
    implements Serializable, Equals, HashCode
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "CauseSSOOverflowEvent")
    protected String causeSSOOverflowEvent;
    @XmlElement(name = "LatitudeMeasure", type = String.class)
    @XmlJavaTypeAdapter(Decimal10FloatingTypeAdapter.class)
    protected BigDecimal latitudeMeasure;
    @XmlElement(name = "LongitudeMeasure", type = String.class)
    @XmlJavaTypeAdapter(Decimal11FloatingTypeAdapter.class)
    protected BigDecimal longitudeMeasure;
    @XmlElement(name = "SSOOverflowLocationStreet")
    protected String ssoOverflowLocationStreet;
    @XmlElement(name = "DurationSSOOverflowEvent", type = String.class)
    @XmlJavaTypeAdapter(TwoDigitPrecisionAdapter.class)
    protected BigDecimal durationSSOOverflowEvent;
    @XmlElement(name = "SSOVolume", type = String.class)
    @XmlJavaTypeAdapter(IntegerAdapter.class)
    protected Integer ssoVolume;
    @XmlElement(name = "NameReceivingWater")
    protected String nameReceivingWater;
    @XmlElement(name = "ImpactSSOEvent")
    protected List<String> impactSSOEvent;
    @XmlElement(name = "SSOSystemComponent")
    protected List<SSOSystemComponent> ssoSystemComponent;
    @XmlElement(name = "SSOSteps")
    protected List<SSOSteps> ssoSteps;
    @XmlElement(name = "DescriptionStepsTaken")
    protected String descriptionStepsTaken;

    /**
     * Gets the value of the causeSSOOverflowEvent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "CAUSE_SSO_OVRFLW_EVT", length = 1000)
    public String getCauseSSOOverflowEvent() {
        return causeSSOOverflowEvent;
    }

    /**
     * Sets the value of the causeSSOOverflowEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCauseSSOOverflowEvent(String value) {
        this.causeSSOOverflowEvent = value;
    }

    @Transient
    public boolean isSetCauseSSOOverflowEvent() {
        return (this.causeSSOOverflowEvent!= null);
    }

    /**
     * Gets the value of the latitudeMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "LAT_MEAS", length = 10)
    public BigDecimal getLatitudeMeasure() {
        return latitudeMeasure;
    }

    /**
     * Sets the value of the latitudeMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatitudeMeasure(BigDecimal value) {
        this.latitudeMeasure = value;
    }

    @Transient
    public boolean isSetLatitudeMeasure() {
        return (this.latitudeMeasure!= null);
    }

    /**
     * Gets the value of the longitudeMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "LONG_MEAS", length = 11)
    public BigDecimal getLongitudeMeasure() {
        return longitudeMeasure;
    }

    /**
     * Sets the value of the longitudeMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongitudeMeasure(BigDecimal value) {
        this.longitudeMeasure = value;
    }

    @Transient
    public boolean isSetLongitudeMeasure() {
        return (this.longitudeMeasure!= null);
    }

    /**
     * Gets the value of the ssoOverflowLocationStreet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "SSO_OVRFLW_LOC_STREET", columnDefinition = "varchar(4000)", length = 4000)
    public String getSSOOverflowLocationStreet() {
        return ssoOverflowLocationStreet;
    }

    /**
     * Sets the value of the ssoOverflowLocationStreet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSOOverflowLocationStreet(String value) {
        this.ssoOverflowLocationStreet = value;
    }

    @Transient
    public boolean isSetSSOOverflowLocationStreet() {
        return (this.ssoOverflowLocationStreet!= null);
    }

    /**
     * Gets the value of the durationSSOOverflowEvent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "DURATION_SSO_OVRFLW_EVT", scale = 2)
    public BigDecimal getDurationSSOOverflowEvent() {
        return durationSSOOverflowEvent;
    }

    /**
     * Sets the value of the durationSSOOverflowEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDurationSSOOverflowEvent(BigDecimal value) {
        this.durationSSOOverflowEvent = value;
    }

    @Transient
    public boolean isSetDurationSSOOverflowEvent() {
        return (this.durationSSOOverflowEvent!= null);
    }

    /**
     * Gets the value of the ssoVolume property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "SSO_VOL", scale = 0)
    public Integer getSSOVolume() {
        return ssoVolume;
    }

    /**
     * Sets the value of the ssoVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSOVolume(Integer value) {
        this.ssoVolume = value;
    }

    @Transient
    public boolean isSetSSOVolume() {
        return (this.ssoVolume!= null);
    }

    /**
     * Gets the value of the nameReceivingWater property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "NAME_RCVG_WTR", length = 1000)
    public String getNameReceivingWater() {
        return nameReceivingWater;
    }

    /**
     * Sets the value of the nameReceivingWater property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameReceivingWater(String value) {
        this.nameReceivingWater = value;
    }

    @Transient
    public boolean isSetNameReceivingWater() {
        return (this.nameReceivingWater!= null);
    }

    /**
     * Gets the value of the impactSSOEvent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the impactSSOEvent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImpactSSOEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    @ElementCollection
    @Column(name = "IMPACT_SSO_EVT", length = 3)
    @CollectionTable(name = "ICS_IMPACT_SSO_EVT", joinColumns = {
        @JoinColumn(name = "ICS_SSO_EVT_REP_ID")
    })
    public List<String> getImpactSSOEvent() {
        if (impactSSOEvent == null) {
            impactSSOEvent = new ArrayList<String>();
        }
        return this.impactSSOEvent;
    }

    /**
     * 
     * 
     */
    public void setImpactSSOEvent(List<String> impactSSOEvent) {
        this.impactSSOEvent = impactSSOEvent;
    }

    @Transient
    public boolean isSetImpactSSOEvent() {
        return ((this.impactSSOEvent!= null)&&(!this.impactSSOEvent.isEmpty()));
    }

    public void unsetImpactSSOEvent() {
        this.impactSSOEvent = null;
    }

    /**
     * Gets the value of the ssoSystemComponent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ssoSystemComponent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSSOSystemComponent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SSOSystemComponent }
     * 
     * 
     */
    @OneToMany(targetEntity = SSOSystemComponent.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "ICS_SSO_EVT_REP_ID")
    public List<SSOSystemComponent> getSSOSystemComponent() {
        if (ssoSystemComponent == null) {
            ssoSystemComponent = new ArrayList<SSOSystemComponent>();
        }
        return this.ssoSystemComponent;
    }

    /**
     * 
     * 
     */
    public void setSSOSystemComponent(List<SSOSystemComponent> ssoSystemComponent) {
        this.ssoSystemComponent = ssoSystemComponent;
    }

    @Transient
    public boolean isSetSSOSystemComponent() {
        return ((this.ssoSystemComponent!= null)&&(!this.ssoSystemComponent.isEmpty()));
    }

    public void unsetSSOSystemComponent() {
        this.ssoSystemComponent = null;
    }

    /**
     * Gets the value of the ssoSteps property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ssoSteps property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSSOSteps().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SSOSteps }
     * 
     * 
     */
    @OneToMany(targetEntity = SSOSteps.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "ICS_SSO_EVT_REP_ID")
    public List<SSOSteps> getSSOSteps() {
        if (ssoSteps == null) {
            ssoSteps = new ArrayList<SSOSteps>();
        }
        return this.ssoSteps;
    }

    /**
     * 
     * 
     */
    public void setSSOSteps(List<SSOSteps> ssoSteps) {
        this.ssoSteps = ssoSteps;
    }

    @Transient
    public boolean isSetSSOSteps() {
        return ((this.ssoSteps!= null)&&(!this.ssoSteps.isEmpty()));
    }

    public void unsetSSOSteps() {
        this.ssoSteps = null;
    }

    /**
     * Gets the value of the descriptionStepsTaken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "DESC_STPS_TAKEN", columnDefinition = "varchar(4000)", length = 4000)
    public String getDescriptionStepsTaken() {
        return descriptionStepsTaken;
    }

    /**
     * Sets the value of the descriptionStepsTaken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionStepsTaken(String value) {
        this.descriptionStepsTaken = value;
    }

    @Transient
    public boolean isSetDescriptionStepsTaken() {
        return (this.descriptionStepsTaken!= null);
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof SSOEventReport)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final SSOEventReport that = ((SSOEventReport) object);
        {
            String lhsCauseSSOOverflowEvent;
            lhsCauseSSOOverflowEvent = this.getCauseSSOOverflowEvent();
            String rhsCauseSSOOverflowEvent;
            rhsCauseSSOOverflowEvent = that.getCauseSSOOverflowEvent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "causeSSOOverflowEvent", lhsCauseSSOOverflowEvent), LocatorUtils.property(thatLocator, "causeSSOOverflowEvent", rhsCauseSSOOverflowEvent), lhsCauseSSOOverflowEvent, rhsCauseSSOOverflowEvent)) {
                return false;
            }
        }
        {
            BigDecimal lhsLatitudeMeasure;
            lhsLatitudeMeasure = this.getLatitudeMeasure();
            BigDecimal rhsLatitudeMeasure;
            rhsLatitudeMeasure = that.getLatitudeMeasure();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "latitudeMeasure", lhsLatitudeMeasure), LocatorUtils.property(thatLocator, "latitudeMeasure", rhsLatitudeMeasure), lhsLatitudeMeasure, rhsLatitudeMeasure)) {
                return false;
            }
        }
        {
            BigDecimal lhsLongitudeMeasure;
            lhsLongitudeMeasure = this.getLongitudeMeasure();
            BigDecimal rhsLongitudeMeasure;
            rhsLongitudeMeasure = that.getLongitudeMeasure();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "longitudeMeasure", lhsLongitudeMeasure), LocatorUtils.property(thatLocator, "longitudeMeasure", rhsLongitudeMeasure), lhsLongitudeMeasure, rhsLongitudeMeasure)) {
                return false;
            }
        }
        {
            String lhsSSOOverflowLocationStreet;
            lhsSSOOverflowLocationStreet = this.getSSOOverflowLocationStreet();
            String rhsSSOOverflowLocationStreet;
            rhsSSOOverflowLocationStreet = that.getSSOOverflowLocationStreet();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ssoOverflowLocationStreet", lhsSSOOverflowLocationStreet), LocatorUtils.property(thatLocator, "ssoOverflowLocationStreet", rhsSSOOverflowLocationStreet), lhsSSOOverflowLocationStreet, rhsSSOOverflowLocationStreet)) {
                return false;
            }
        }
        {
            BigDecimal lhsDurationSSOOverflowEvent;
            lhsDurationSSOOverflowEvent = this.getDurationSSOOverflowEvent();
            BigDecimal rhsDurationSSOOverflowEvent;
            rhsDurationSSOOverflowEvent = that.getDurationSSOOverflowEvent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "durationSSOOverflowEvent", lhsDurationSSOOverflowEvent), LocatorUtils.property(thatLocator, "durationSSOOverflowEvent", rhsDurationSSOOverflowEvent), lhsDurationSSOOverflowEvent, rhsDurationSSOOverflowEvent)) {
                return false;
            }
        }
        {
            Integer lhsSSOVolume;
            lhsSSOVolume = this.getSSOVolume();
            Integer rhsSSOVolume;
            rhsSSOVolume = that.getSSOVolume();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ssoVolume", lhsSSOVolume), LocatorUtils.property(thatLocator, "ssoVolume", rhsSSOVolume), lhsSSOVolume, rhsSSOVolume)) {
                return false;
            }
        }
        {
            String lhsNameReceivingWater;
            lhsNameReceivingWater = this.getNameReceivingWater();
            String rhsNameReceivingWater;
            rhsNameReceivingWater = that.getNameReceivingWater();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nameReceivingWater", lhsNameReceivingWater), LocatorUtils.property(thatLocator, "nameReceivingWater", rhsNameReceivingWater), lhsNameReceivingWater, rhsNameReceivingWater)) {
                return false;
            }
        }
        {
            List<String> lhsImpactSSOEvent;
            lhsImpactSSOEvent = (this.isSetImpactSSOEvent()?this.getImpactSSOEvent():null);
            List<String> rhsImpactSSOEvent;
            rhsImpactSSOEvent = (that.isSetImpactSSOEvent()?that.getImpactSSOEvent():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "impactSSOEvent", lhsImpactSSOEvent), LocatorUtils.property(thatLocator, "impactSSOEvent", rhsImpactSSOEvent), lhsImpactSSOEvent, rhsImpactSSOEvent)) {
                return false;
            }
        }
        {
            List<SSOSystemComponent> lhsSSOSystemComponent;
            lhsSSOSystemComponent = (this.isSetSSOSystemComponent()?this.getSSOSystemComponent():null);
            List<SSOSystemComponent> rhsSSOSystemComponent;
            rhsSSOSystemComponent = (that.isSetSSOSystemComponent()?that.getSSOSystemComponent():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ssoSystemComponent", lhsSSOSystemComponent), LocatorUtils.property(thatLocator, "ssoSystemComponent", rhsSSOSystemComponent), lhsSSOSystemComponent, rhsSSOSystemComponent)) {
                return false;
            }
        }
        {
            List<SSOSteps> lhsSSOSteps;
            lhsSSOSteps = (this.isSetSSOSteps()?this.getSSOSteps():null);
            List<SSOSteps> rhsSSOSteps;
            rhsSSOSteps = (that.isSetSSOSteps()?that.getSSOSteps():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "ssoSteps", lhsSSOSteps), LocatorUtils.property(thatLocator, "ssoSteps", rhsSSOSteps), lhsSSOSteps, rhsSSOSteps)) {
                return false;
            }
        }
        {
            String lhsDescriptionStepsTaken;
            lhsDescriptionStepsTaken = this.getDescriptionStepsTaken();
            String rhsDescriptionStepsTaken;
            rhsDescriptionStepsTaken = that.getDescriptionStepsTaken();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "descriptionStepsTaken", lhsDescriptionStepsTaken), LocatorUtils.property(thatLocator, "descriptionStepsTaken", rhsDescriptionStepsTaken), lhsDescriptionStepsTaken, rhsDescriptionStepsTaken)) {
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
        int currentHashCode = super.hashCode(locator, strategy);
        {
            String theCauseSSOOverflowEvent;
            theCauseSSOOverflowEvent = this.getCauseSSOOverflowEvent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "causeSSOOverflowEvent", theCauseSSOOverflowEvent), currentHashCode, theCauseSSOOverflowEvent);
        }
        {
            BigDecimal theLatitudeMeasure;
            theLatitudeMeasure = this.getLatitudeMeasure();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "latitudeMeasure", theLatitudeMeasure), currentHashCode, theLatitudeMeasure);
        }
        {
            BigDecimal theLongitudeMeasure;
            theLongitudeMeasure = this.getLongitudeMeasure();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "longitudeMeasure", theLongitudeMeasure), currentHashCode, theLongitudeMeasure);
        }
        {
            String theSSOOverflowLocationStreet;
            theSSOOverflowLocationStreet = this.getSSOOverflowLocationStreet();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ssoOverflowLocationStreet", theSSOOverflowLocationStreet), currentHashCode, theSSOOverflowLocationStreet);
        }
        {
            BigDecimal theDurationSSOOverflowEvent;
            theDurationSSOOverflowEvent = this.getDurationSSOOverflowEvent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "durationSSOOverflowEvent", theDurationSSOOverflowEvent), currentHashCode, theDurationSSOOverflowEvent);
        }
        {
            Integer theSSOVolume;
            theSSOVolume = this.getSSOVolume();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ssoVolume", theSSOVolume), currentHashCode, theSSOVolume);
        }
        {
            String theNameReceivingWater;
            theNameReceivingWater = this.getNameReceivingWater();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "nameReceivingWater", theNameReceivingWater), currentHashCode, theNameReceivingWater);
        }
        {
            List<String> theImpactSSOEvent;
            theImpactSSOEvent = (this.isSetImpactSSOEvent()?this.getImpactSSOEvent():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "impactSSOEvent", theImpactSSOEvent), currentHashCode, theImpactSSOEvent);
        }
        {
            List<SSOSystemComponent> theSSOSystemComponent;
            theSSOSystemComponent = (this.isSetSSOSystemComponent()?this.getSSOSystemComponent():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ssoSystemComponent", theSSOSystemComponent), currentHashCode, theSSOSystemComponent);
        }
        {
            List<SSOSteps> theSSOSteps;
            theSSOSteps = (this.isSetSSOSteps()?this.getSSOSteps():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "ssoSteps", theSSOSteps), currentHashCode, theSSOSteps);
        }
        {
            String theDescriptionStepsTaken;
            theDescriptionStepsTaken = this.getDescriptionStepsTaken();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "descriptionStepsTaken", theDescriptionStepsTaken), currentHashCode, theDescriptionStepsTaken);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
