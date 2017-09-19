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
 * <p>Java class for CoordinateDataSourceDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CoordinateDataSourceDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.exchangenetwork.net/schema/IC/1}CoordinateDataSourceCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.exchangenetwork.net/schema/IC/1}CoordinateDataSourceCodeListIdentifier" minOccurs="0"/>
 *         &lt;element ref="{http://www.exchangenetwork.net/schema/IC/1}CoordinateDataSourceName" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CoordinateDataSourceDataType", propOrder = {
    "coordinateDataSourceCode",
    "coordinateDataSourceCodeListIdentifier",
    "coordinateDataSourceName"
})
@Embeddable
public class CoordinateDataSourceDataType
    implements Serializable, Equals, HashCode
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "CoordinateDataSourceCode")
    protected String coordinateDataSourceCode;
    @XmlElement(name = "CoordinateDataSourceCodeListIdentifier")
    protected CoordinateDataSourceCodeListIdentifierDataType coordinateDataSourceCodeListIdentifier;
    @XmlElement(name = "CoordinateDataSourceName")
    protected String coordinateDataSourceName;

    /**
     * Gets the value of the coordinateDataSourceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "COORDINATE_DATA_SRC_CODE", length = 255)
    public String getCoordinateDataSourceCode() {
        return coordinateDataSourceCode;
    }

    /**
     * Sets the value of the coordinateDataSourceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoordinateDataSourceCode(String value) {
        this.coordinateDataSourceCode = value;
    }

    @Transient
    public boolean isSetCoordinateDataSourceCode() {
        return (this.coordinateDataSourceCode!= null);
    }

    /**
     * Gets the value of the coordinateDataSourceCodeListIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link CoordinateDataSourceCodeListIdentifierDataType }
     *     
     */
    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "VALUE", length = 255)),
        @AttributeOverride(name = "codeListVersionIdentifier", column = @Column(name = "CODE_LST_IDEN", length = 255)),
        @AttributeOverride(name = "codeListVersionAgencyIdentifier", column = @Column(name = "CODE_LST_AGENCY_IDEN", length = 255))
    })
    public CoordinateDataSourceCodeListIdentifierDataType getCoordinateDataSourceCodeListIdentifier() {
        return coordinateDataSourceCodeListIdentifier;
    }

    /**
     * Sets the value of the coordinateDataSourceCodeListIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoordinateDataSourceCodeListIdentifierDataType }
     *     
     */
    public void setCoordinateDataSourceCodeListIdentifier(CoordinateDataSourceCodeListIdentifierDataType value) {
        this.coordinateDataSourceCodeListIdentifier = value;
    }

    @Transient
    public boolean isSetCoordinateDataSourceCodeListIdentifier() {
        return (this.coordinateDataSourceCodeListIdentifier!= null);
    }

    /**
     * Gets the value of the coordinateDataSourceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "COORDINATE_DATA_SRC_NAME", length = 255)
    public String getCoordinateDataSourceName() {
        return coordinateDataSourceName;
    }

    /**
     * Sets the value of the coordinateDataSourceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoordinateDataSourceName(String value) {
        this.coordinateDataSourceName = value;
    }

    @Transient
    public boolean isSetCoordinateDataSourceName() {
        return (this.coordinateDataSourceName!= null);
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof CoordinateDataSourceDataType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final CoordinateDataSourceDataType that = ((CoordinateDataSourceDataType) object);
        {
            String lhsCoordinateDataSourceCode;
            lhsCoordinateDataSourceCode = this.getCoordinateDataSourceCode();
            String rhsCoordinateDataSourceCode;
            rhsCoordinateDataSourceCode = that.getCoordinateDataSourceCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "coordinateDataSourceCode", lhsCoordinateDataSourceCode), LocatorUtils.property(thatLocator, "coordinateDataSourceCode", rhsCoordinateDataSourceCode), lhsCoordinateDataSourceCode, rhsCoordinateDataSourceCode)) {
                return false;
            }
        }
        {
            CoordinateDataSourceCodeListIdentifierDataType lhsCoordinateDataSourceCodeListIdentifier;
            lhsCoordinateDataSourceCodeListIdentifier = this.getCoordinateDataSourceCodeListIdentifier();
            CoordinateDataSourceCodeListIdentifierDataType rhsCoordinateDataSourceCodeListIdentifier;
            rhsCoordinateDataSourceCodeListIdentifier = that.getCoordinateDataSourceCodeListIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "coordinateDataSourceCodeListIdentifier", lhsCoordinateDataSourceCodeListIdentifier), LocatorUtils.property(thatLocator, "coordinateDataSourceCodeListIdentifier", rhsCoordinateDataSourceCodeListIdentifier), lhsCoordinateDataSourceCodeListIdentifier, rhsCoordinateDataSourceCodeListIdentifier)) {
                return false;
            }
        }
        {
            String lhsCoordinateDataSourceName;
            lhsCoordinateDataSourceName = this.getCoordinateDataSourceName();
            String rhsCoordinateDataSourceName;
            rhsCoordinateDataSourceName = that.getCoordinateDataSourceName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "coordinateDataSourceName", lhsCoordinateDataSourceName), LocatorUtils.property(thatLocator, "coordinateDataSourceName", rhsCoordinateDataSourceName), lhsCoordinateDataSourceName, rhsCoordinateDataSourceName)) {
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
            String theCoordinateDataSourceCode;
            theCoordinateDataSourceCode = this.getCoordinateDataSourceCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "coordinateDataSourceCode", theCoordinateDataSourceCode), currentHashCode, theCoordinateDataSourceCode);
        }
        {
            CoordinateDataSourceCodeListIdentifierDataType theCoordinateDataSourceCodeListIdentifier;
            theCoordinateDataSourceCodeListIdentifier = this.getCoordinateDataSourceCodeListIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "coordinateDataSourceCodeListIdentifier", theCoordinateDataSourceCodeListIdentifier), currentHashCode, theCoordinateDataSourceCodeListIdentifier);
        }
        {
            String theCoordinateDataSourceName;
            theCoordinateDataSourceName = this.getCoordinateDataSourceName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "coordinateDataSourceName", theCoordinateDataSourceName), currentHashCode, theCoordinateDataSourceName);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}