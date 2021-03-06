//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.06.15 at 06:46:14 PM EDT 
//


package com.windsor.node.plugin.rcra54.domain.generated;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 * Facility GIS submission.
 * 
 * <p>Java class for GISFacilitySubmissionDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GISFacilitySubmissionDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.exchangenetwork.net/schema/RCRA/5}HandlerID"/>
 *         &lt;element ref="{http://www.exchangenetwork.net/schema/RCRA/5}GeographicInformation" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GISFacilitySubmissionDataType", propOrder = {
    "handlerID",
    "geographicInformation"
})
@Entity(name = "GISFacilitySubmissionDataType")
@Table(name = "RCRA_GISFACSUB")
@Inheritance(strategy = InheritanceType.JOINED)
public class GISFacilitySubmissionDataType
    implements Equals, HashCode
{

    @XmlElement(name = "HandlerID", required = true)
    protected String handlerID;
    @XmlElement(name = "GeographicInformation")
    protected List<GeographicInformationDataType> geographicInformation;
    @XmlAttribute(name = "Id")
    protected Long id;

    /**
     * Gets the value of the handlerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "HANDLERID", length = 12)
    public String getHandlerID() {
        return handlerID;
    }

    /**
     * Sets the value of the handlerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandlerID(String value) {
        this.handlerID = value;
    }

    /**
     * Gets the value of the geographicInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the geographicInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeographicInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GeographicInformationDataType }
     * 
     * 
     */
    @OneToMany(targetEntity = GeographicInformationDataType.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "GISFACSUBID")
    public List<GeographicInformationDataType> getGeographicInformation() {
        if (geographicInformation == null) {
            geographicInformation = new ArrayList<GeographicInformationDataType>();
        }
        return this.geographicInformation;
    }

    /**
     * 
     * 
     */
    public void setGeographicInformation(List<GeographicInformationDataType> geographicInformation) {
        this.geographicInformation = geographicInformation;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "ColSequence", strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "ColSequence", sequenceName = "COLUMN_ID_SEQUENCE", allocationSize = 1)
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof GISFacilitySubmissionDataType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final GISFacilitySubmissionDataType that = ((GISFacilitySubmissionDataType) object);
        {
            String lhsHandlerID;
            lhsHandlerID = this.getHandlerID();
            String rhsHandlerID;
            rhsHandlerID = that.getHandlerID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "handlerID", lhsHandlerID), LocatorUtils.property(thatLocator, "handlerID", rhsHandlerID), lhsHandlerID, rhsHandlerID)) {
                return false;
            }
        }
        {
            List<GeographicInformationDataType> lhsGeographicInformation;
            lhsGeographicInformation = (((this.geographicInformation!= null)&&(!this.geographicInformation.isEmpty()))?this.getGeographicInformation():null);
            List<GeographicInformationDataType> rhsGeographicInformation;
            rhsGeographicInformation = (((that.geographicInformation!= null)&&(!that.geographicInformation.isEmpty()))?that.getGeographicInformation():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "geographicInformation", lhsGeographicInformation), LocatorUtils.property(thatLocator, "geographicInformation", rhsGeographicInformation), lhsGeographicInformation, rhsGeographicInformation)) {
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
            String theHandlerID;
            theHandlerID = this.getHandlerID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "handlerID", theHandlerID), currentHashCode, theHandlerID);
        }
        {
            List<GeographicInformationDataType> theGeographicInformation;
            theGeographicInformation = (((this.geographicInformation!= null)&&(!this.geographicInformation.isEmpty()))?this.getGeographicInformation():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "geographicInformation", theGeographicInformation), currentHashCode, theGeographicInformation);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
