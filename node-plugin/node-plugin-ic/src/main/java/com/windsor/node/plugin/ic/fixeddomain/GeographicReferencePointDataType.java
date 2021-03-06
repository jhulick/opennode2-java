//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.26 at 02:36:56 PM PDT 
//


package com.windsor.node.plugin.ic.fixeddomain;

import java.io.Serializable;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 * <p>Java class for GeographicReferencePointDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeographicReferencePointDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.exchangenetwork.net/schema/IC/1}GeographicReferencePointCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.exchangenetwork.net/schema/IC/1}ReferencePointCodeListIdentifier" minOccurs="0"/>
 *         &lt;element ref="{http://www.exchangenetwork.net/schema/IC/1}GeographicReferencePointName" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeographicReferencePointDataType", propOrder = {
    "geographicReferencePointCode",
    "referencePointCodeListIdentifier",
    "geographicReferencePointName"
})
@Embeddable
public class GeographicReferencePointDataType
    implements Serializable, Equals, HashCode
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "GeographicReferencePointCode")
    protected String geographicReferencePointCode;
    @XmlElement(name = "ReferencePointCodeListIdentifier")
    protected ReferencePointCodeListIdentifierDataType referencePointCodeListIdentifier;
    @XmlElement(name = "GeographicReferencePointName")
    protected String geographicReferencePointName;

    /**
     * Gets the value of the geographicReferencePointCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "GEOGRAPHIC_REFERENCE_POINT_CODE", length = 255)
    public String getGeographicReferencePointCode() {
        return geographicReferencePointCode;
    }

    /**
     * Sets the value of the geographicReferencePointCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeographicReferencePointCode(String value) {
        this.geographicReferencePointCode = value;
    }

    @Transient
    public boolean isSetGeographicReferencePointCode() {
        return (this.geographicReferencePointCode!= null);
    }

    /**
     * Gets the value of the referencePointCodeListIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link ReferencePointCodeListIdentifierDataType }
     *     
     */
    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "VALUE", length = 255)),
        @AttributeOverride(name = "codeListVersionIdentifier", column = @Column(name = "CODE_LST_IDEN", length = 255)),
        @AttributeOverride(name = "codeListVersionAgencyIdentifier", column = @Column(name = "CODE_LST_AGENCY_IDEN", length = 255))
    })
    public ReferencePointCodeListIdentifierDataType getReferencePointCodeListIdentifier() {
        return referencePointCodeListIdentifier;
    }

    /**
     * Sets the value of the referencePointCodeListIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferencePointCodeListIdentifierDataType }
     *     
     */
    public void setReferencePointCodeListIdentifier(ReferencePointCodeListIdentifierDataType value) {
        this.referencePointCodeListIdentifier = value;
    }

    @Transient
    public boolean isSetReferencePointCodeListIdentifier() {
        return (this.referencePointCodeListIdentifier!= null);
    }

    /**
     * Gets the value of the geographicReferencePointName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "GEOGRAPHIC_REFERENCE_POINT_NAME", length = 255)
    public String getGeographicReferencePointName() {
        return geographicReferencePointName;
    }

    /**
     * Sets the value of the geographicReferencePointName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeographicReferencePointName(String value) {
        this.geographicReferencePointName = value;
    }

    @Transient
    public boolean isSetGeographicReferencePointName() {
        return (this.geographicReferencePointName!= null);
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof GeographicReferencePointDataType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final GeographicReferencePointDataType that = ((GeographicReferencePointDataType) object);
        {
            String lhsGeographicReferencePointCode;
            lhsGeographicReferencePointCode = this.getGeographicReferencePointCode();
            String rhsGeographicReferencePointCode;
            rhsGeographicReferencePointCode = that.getGeographicReferencePointCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "geographicReferencePointCode", lhsGeographicReferencePointCode), LocatorUtils.property(thatLocator, "geographicReferencePointCode", rhsGeographicReferencePointCode), lhsGeographicReferencePointCode, rhsGeographicReferencePointCode)) {
                return false;
            }
        }
        {
            ReferencePointCodeListIdentifierDataType lhsReferencePointCodeListIdentifier;
            lhsReferencePointCodeListIdentifier = this.getReferencePointCodeListIdentifier();
            ReferencePointCodeListIdentifierDataType rhsReferencePointCodeListIdentifier;
            rhsReferencePointCodeListIdentifier = that.getReferencePointCodeListIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "referencePointCodeListIdentifier", lhsReferencePointCodeListIdentifier), LocatorUtils.property(thatLocator, "referencePointCodeListIdentifier", rhsReferencePointCodeListIdentifier), lhsReferencePointCodeListIdentifier, rhsReferencePointCodeListIdentifier)) {
                return false;
            }
        }
        {
            String lhsGeographicReferencePointName;
            lhsGeographicReferencePointName = this.getGeographicReferencePointName();
            String rhsGeographicReferencePointName;
            rhsGeographicReferencePointName = that.getGeographicReferencePointName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "geographicReferencePointName", lhsGeographicReferencePointName), LocatorUtils.property(thatLocator, "geographicReferencePointName", rhsGeographicReferencePointName), lhsGeographicReferencePointName, rhsGeographicReferencePointName)) {
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
            String theGeographicReferencePointCode;
            theGeographicReferencePointCode = this.getGeographicReferencePointCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "geographicReferencePointCode", theGeographicReferencePointCode), currentHashCode, theGeographicReferencePointCode);
        }
        {
            ReferencePointCodeListIdentifierDataType theReferencePointCodeListIdentifier;
            theReferencePointCodeListIdentifier = this.getReferencePointCodeListIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "referencePointCodeListIdentifier", theReferencePointCodeListIdentifier), currentHashCode, theReferencePointCodeListIdentifier);
        }
        {
            String theGeographicReferencePointName;
            theGeographicReferencePointName = this.getGeographicReferencePointName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "geographicReferencePointName", theGeographicReferencePointName), currentHashCode, theGeographicReferencePointName);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
