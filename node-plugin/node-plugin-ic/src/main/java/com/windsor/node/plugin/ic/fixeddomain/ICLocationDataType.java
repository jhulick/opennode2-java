//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.26 at 02:36:56 PM PDT 
//


package com.windsor.node.plugin.ic.fixeddomain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for ICLocationDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ICLocationDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.exchangenetwork.net/schema/IC/1}LocationIdentifier"/>
 *         &lt;choice>
 *           &lt;element ref="{http://www.exchangenetwork.net/schema/IC/1}LandParcel"/>
 *           &lt;element ref="{http://www.exchangenetwork.net/schema/IC/1}Facility"/>
 *           &lt;element ref="{http://www.exchangenetwork.net/schema/IC/1}ICGeographicLocationDescription"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ICLocationDataType", propOrder = {
    "locationIdentifier",
    "landParcel",
    "facility",
    "icGeographicLocationDescription"
})
@Entity(name = "ICLocationDataType")
@Table(name = "IC_LOC")
@Inheritance(strategy = InheritanceType.JOINED)
public class ICLocationDataType
    implements Serializable, Equals, HashCode
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "LocationIdentifier", required = true)
    protected String locationIdentifier;
    @XmlElement(name = "LandParcel")
    protected LandParcelDataType landParcel;
    @XmlElement(name = "Facility")
    protected FacilityDataType facility;
    @XmlElement(name = "ICGeographicLocationDescription")
    protected ICGeographicLocationDescriptionDataType icGeographicLocationDescription;
    @XmlTransient
    protected String dbid;

    /**
     * Gets the value of the locationIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "LOC_IDEN", length = 255)
    public String getLocationIdentifier() {
        return locationIdentifier;
    }

    /**
     * Sets the value of the locationIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationIdentifier(String value) {
        this.locationIdentifier = value;
    }

    @Transient
    public boolean isSetLocationIdentifier() {
        return (this.locationIdentifier!= null);
    }

    /**
     * Gets the value of the landParcel property.
     * 
     * @return
     *     possible object is
     *     {@link LandParcelDataType }
     *     
     */
    /*@OneToOne(targetEntity = LandParcelDataType.class, cascade = {
        CascadeType.ALL
    })
    @JoinTable(name = "IC_LAND_PARCEL", joinColumns = {
        @JoinColumn(name = "IC_LOC_ID", referencedColumnName = "IC_LOC_ID")
    }, inverseJoinColumns = {
        @JoinColumn(name = "IC_LOC_ID")
    })*/
    /*@OneToOne(targetEntity = LandParcelDataType.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "IC_LOC_ID")*/
    /*@OneToOne(targetEntity = LandParcelDataType.class, optional=true, fetch=FetchType.EAGER)
    @JoinColumn(name="IC_LOC_ID", unique=true, nullable=false, updatable=false)*/
    /*@OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "IC_LOC_ID")*/
    @Transient
    public LandParcelDataType getLandParcel() {
        /*if(landParcel == null && getLandParcels() != null && getLandParcels().size() == 1)
        {
            landParcel = getLandParcels().get(0);
        }*/
        return landParcel;
    }

    @XmlTransient
    protected List<LandParcelDataType> landParcels;
    @OneToMany(/*fetch=FetchType.EAGER,*/ targetEntity = LandParcelDataType.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "IC_LOC_ID")
    @LazyCollection(LazyCollectionOption.FALSE)
    public List<LandParcelDataType> getLandParcels()
    {
        return landParcels;
    }
    public void setLandParcels(List<LandParcelDataType> v)
    {
        if(v != null && v.size() == 1)
        {
            landParcel = v.get(0);
        }
        landParcels = v;
    }

    /**
     * Sets the value of the landParcel property.
     * 
     * @param value
     *     allowed object is
     *     {@link LandParcelDataType }
     *     
     */
    public void setLandParcel(LandParcelDataType value) {
        this.landParcel = value;
    }

    @Transient
    public boolean isSetLandParcel() {
        return (this.landParcel!= null);
    }

    /**
     * Gets the value of the facility property.
     * 
     * @return
     *     possible object is
     *     {@link FacilityDataType }
     *     
     */
    /*@OneToOne(targetEntity = FacilityDataType.class, cascade = {
        CascadeType.ALL
    })
    @JoinTable(name = "IC_FAC", joinColumns = {
        @JoinColumn(name = "IC_LOC_ID", referencedColumnName = "IC_LOC_ID")
    }, inverseJoinColumns = {
        @JoinColumn(name = "IC_LOC_ID")
    })*/
    /*@OneToOne(targetEntity = FacilityDataType.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "IC_LOC_ID")*/
    @Transient
    public FacilityDataType getFacility() {
        return facility;
    }

    @XmlTransient
    protected List<FacilityDataType> facilities;
    @OneToMany(/*fetch=FetchType.EAGER,*/ targetEntity = FacilityDataType.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "IC_LOC_ID")
    @LazyCollection(LazyCollectionOption.FALSE)
    public List<FacilityDataType> getFacilities()
    {
        return facilities;
    }
    public void setFacilities(List<FacilityDataType> v)
    {
        if(v != null && v.size() == 1)
        {
            facility = v.get(0);
        }
        facilities = v;
    }

    /**
     * Sets the value of the facility property.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityDataType }
     *     
     */
    public void setFacility(FacilityDataType value) {
        this.facility = value;
    }

    @Transient
    public boolean isSetFacility() {
        return (this.facility!= null);
    }

    /**
     * Gets the value of the icGeographicLocationDescription property.
     * 
     * @return
     *     possible object is
     *     {@link ICGeographicLocationDescriptionDataType }
     *     
     */
    /*@OneToOne(targetEntity = ICGeographicLocationDescriptionDataType.class, cascade = {
        CascadeType.ALL
    })
    @JoinTable(name = "IC_GEO_LOC_DESC", joinColumns = {
        @JoinColumn(name = "IC_LOC_ID", referencedColumnName = "IC_LOC_ID")
    }, inverseJoinColumns = {
        @JoinColumn(name = "IC_LOC_ID")
    })*/
    /*@OneToOne(targetEntity = ICGeographicLocationDescriptionDataType.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "IC_LOC_ID")*/
    @Transient
    public ICGeographicLocationDescriptionDataType getICGeographicLocationDescription() {
        return icGeographicLocationDescription;
    }

    @XmlTransient
    protected List<ICGeographicLocationDescriptionDataType> icGeographicLocationDescriptions;
    @OneToMany(/*fetch=FetchType.EAGER,*/ targetEntity = ICGeographicLocationDescriptionDataType.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "IC_LOC_ID")
    @LazyCollection(LazyCollectionOption.FALSE)
    public List<ICGeographicLocationDescriptionDataType> getICGeographicLocationDescriptions()
    {
        return icGeographicLocationDescriptions;
    }
    public void setICGeographicLocationDescriptions(List<ICGeographicLocationDescriptionDataType> v)
    {
        if(v != null && v.size() == 1)
        {
            icGeographicLocationDescription = v.get(0);
        }
        icGeographicLocationDescriptions = v;
    }

    /**
     * Sets the value of the icGeographicLocationDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link ICGeographicLocationDescriptionDataType }
     *     
     */
    public void setICGeographicLocationDescription(ICGeographicLocationDescriptionDataType value) {
        this.icGeographicLocationDescription = value;
    }

    @Transient
    public boolean isSetICGeographicLocationDescription() {
        return (this.icGeographicLocationDescription!= null);
    }

    /**
     * 
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Id
    @Column(name = "IC_LOC_ID")
    public String getDbid() {
        return dbid;
    }

    /**
     * 
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDbid(String value) {
        this.dbid = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ICLocationDataType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ICLocationDataType that = ((ICLocationDataType) object);
        {
            String lhsLocationIdentifier;
            lhsLocationIdentifier = this.getLocationIdentifier();
            String rhsLocationIdentifier;
            rhsLocationIdentifier = that.getLocationIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "locationIdentifier", lhsLocationIdentifier), LocatorUtils.property(thatLocator, "locationIdentifier", rhsLocationIdentifier), lhsLocationIdentifier, rhsLocationIdentifier)) {
                return false;
            }
        }
        {
            LandParcelDataType lhsLandParcel;
            lhsLandParcel = this.getLandParcel();
            LandParcelDataType rhsLandParcel;
            rhsLandParcel = that.getLandParcel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "landParcel", lhsLandParcel), LocatorUtils.property(thatLocator, "landParcel", rhsLandParcel), lhsLandParcel, rhsLandParcel)) {
                return false;
            }
        }
        {
            FacilityDataType lhsFacility;
            lhsFacility = this.getFacility();
            FacilityDataType rhsFacility;
            rhsFacility = that.getFacility();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "facility", lhsFacility), LocatorUtils.property(thatLocator, "facility", rhsFacility), lhsFacility, rhsFacility)) {
                return false;
            }
        }
        {
            ICGeographicLocationDescriptionDataType lhsICGeographicLocationDescription;
            lhsICGeographicLocationDescription = this.getICGeographicLocationDescription();
            ICGeographicLocationDescriptionDataType rhsICGeographicLocationDescription;
            rhsICGeographicLocationDescription = that.getICGeographicLocationDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "icGeographicLocationDescription", lhsICGeographicLocationDescription), LocatorUtils.property(thatLocator, "icGeographicLocationDescription", rhsICGeographicLocationDescription), lhsICGeographicLocationDescription, rhsICGeographicLocationDescription)) {
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
            String theLocationIdentifier;
            theLocationIdentifier = this.getLocationIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "locationIdentifier", theLocationIdentifier), currentHashCode, theLocationIdentifier);
        }
        {
            LandParcelDataType theLandParcel;
            theLandParcel = this.getLandParcel();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "landParcel", theLandParcel), currentHashCode, theLandParcel);
        }
        {
            FacilityDataType theFacility;
            theFacility = this.getFacility();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "facility", theFacility), currentHashCode, theFacility);
        }
        {
            ICGeographicLocationDescriptionDataType theICGeographicLocationDescription;
            theICGeographicLocationDescription = this.getICGeographicLocationDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "icGeographicLocationDescription", theICGeographicLocationDescription), currentHashCode, theICGeographicLocationDescription);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}