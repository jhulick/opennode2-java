//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.06.15 at 06:46:14 PM EDT 
//


package com.windsor.node.plugin.rcra54.domain.generated;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
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
 * Associate alternative identifiers with the facility
 * 
 * <p>Java class for OtherIDDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OtherIDDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.exchangenetwork.net/schema/RCRA/5}TransactionCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.exchangenetwork.net/schema/RCRA/5}OtherHandlerID"/>
 *         &lt;element ref="{http://www.exchangenetwork.net/schema/RCRA/5}RelationshipOwnerName" minOccurs="0"/>
 *         &lt;element ref="{http://www.exchangenetwork.net/schema/RCRA/5}RelationshipTypeCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.exchangenetwork.net/schema/RCRA/5}RelationshipTypeText" minOccurs="0"/>
 *         &lt;element ref="{http://www.exchangenetwork.net/schema/RCRA/5}SameFacilityIndicator" minOccurs="0"/>
 *         &lt;element ref="{http://www.exchangenetwork.net/schema/RCRA/5}OtherIDSupplementalInformationText" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherIDDataType", propOrder = {
    "transactionCode",
    "otherHandlerID",
    "relationshipOwnerName",
    "relationshipTypeCode",
    "relationshipTypeText",
    "sameFacilityIndicator",
    "otherIDSupplementalInformationText"
})
@Entity(name = "OtherIDDataType")
@Table(name = "RCRA_OTHERID")
@Inheritance(strategy = InheritanceType.JOINED)
public class OtherIDDataType
    implements Equals, HashCode
{

    @XmlElement(name = "TransactionCode")
    protected String transactionCode;
    @XmlElement(name = "OtherHandlerID", required = true)
    protected String otherHandlerID;
    @XmlElement(name = "RelationshipOwnerName")
    protected String relationshipOwnerName;
    @XmlElement(name = "RelationshipTypeCode")
    protected String relationshipTypeCode;
    @XmlElement(name = "RelationshipTypeText")
    protected String relationshipTypeText;
    @XmlElement(name = "SameFacilityIndicator")
    protected String sameFacilityIndicator;
    @XmlElement(name = "OtherIDSupplementalInformationText")
    protected String otherIDSupplementalInformationText;
    @XmlAttribute(name = "Id")
    protected Long id;

    /**
     * Gets the value of the transactionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "TRANSACTIONCODE", length = 1)
    public String getTransactionCode() {
        return transactionCode;
    }

    /**
     * Sets the value of the transactionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionCode(String value) {
        this.transactionCode = value;
    }

    /**
     * Gets the value of the otherHandlerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "OTHERHANDLERID", length = 12)
    public String getOtherHandlerID() {
        return otherHandlerID;
    }

    /**
     * Sets the value of the otherHandlerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherHandlerID(String value) {
        this.otherHandlerID = value;
    }

    /**
     * Gets the value of the relationshipOwnerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "RELOWNRNAME", length = 2)
    public String getRelationshipOwnerName() {
        return relationshipOwnerName;
    }

    /**
     * Sets the value of the relationshipOwnerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationshipOwnerName(String value) {
        this.relationshipOwnerName = value;
    }

    /**
     * Gets the value of the relationshipTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "RELTYPECODE", length = 1)
    public String getRelationshipTypeCode() {
        return relationshipTypeCode;
    }

    /**
     * Sets the value of the relationshipTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationshipTypeCode(String value) {
        this.relationshipTypeCode = value;
    }

    /**
     * Gets the value of the relationshipTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "RELTYPETXT", length = 255)
    public String getRelationshipTypeText() {
        return relationshipTypeText;
    }

    /**
     * Sets the value of the relationshipTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationshipTypeText(String value) {
        this.relationshipTypeText = value;
    }

    /**
     * Gets the value of the sameFacilityIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "SAMEFACIND", length = 1)
    public String getSameFacilityIndicator() {
        return sameFacilityIndicator;
    }

    /**
     * Sets the value of the sameFacilityIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSameFacilityIndicator(String value) {
        this.sameFacilityIndicator = value;
    }

    /**
     * Gets the value of the otherIDSupplementalInformationText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "OTHERIDSUPPINFTXT", length = 4000)
    public String getOtherIDSupplementalInformationText() {
        return otherIDSupplementalInformationText;
    }

    /**
     * Sets the value of the otherIDSupplementalInformationText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherIDSupplementalInformationText(String value) {
        this.otherIDSupplementalInformationText = value;
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

    @Override
	public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof OtherIDDataType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final OtherIDDataType that = ((OtherIDDataType) object);
        {
            String lhsTransactionCode;
            lhsTransactionCode = this.getTransactionCode();
            String rhsTransactionCode;
            rhsTransactionCode = that.getTransactionCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "transactionCode", lhsTransactionCode), LocatorUtils.property(thatLocator, "transactionCode", rhsTransactionCode), lhsTransactionCode, rhsTransactionCode)) {
                return false;
            }
        }
        {
            String lhsOtherHandlerID;
            lhsOtherHandlerID = this.getOtherHandlerID();
            String rhsOtherHandlerID;
            rhsOtherHandlerID = that.getOtherHandlerID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "otherHandlerID", lhsOtherHandlerID), LocatorUtils.property(thatLocator, "otherHandlerID", rhsOtherHandlerID), lhsOtherHandlerID, rhsOtherHandlerID)) {
                return false;
            }
        }
        {
            String lhsRelationshipOwnerName;
            lhsRelationshipOwnerName = this.getRelationshipOwnerName();
            String rhsRelationshipOwnerName;
            rhsRelationshipOwnerName = that.getRelationshipOwnerName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "relationshipOwnerName", lhsRelationshipOwnerName), LocatorUtils.property(thatLocator, "relationshipOwnerName", rhsRelationshipOwnerName), lhsRelationshipOwnerName, rhsRelationshipOwnerName)) {
                return false;
            }
        }
        {
            String lhsRelationshipTypeCode;
            lhsRelationshipTypeCode = this.getRelationshipTypeCode();
            String rhsRelationshipTypeCode;
            rhsRelationshipTypeCode = that.getRelationshipTypeCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "relationshipTypeCode", lhsRelationshipTypeCode), LocatorUtils.property(thatLocator, "relationshipTypeCode", rhsRelationshipTypeCode), lhsRelationshipTypeCode, rhsRelationshipTypeCode)) {
                return false;
            }
        }
        {
            String lhsRelationshipTypeText;
            lhsRelationshipTypeText = this.getRelationshipTypeText();
            String rhsRelationshipTypeText;
            rhsRelationshipTypeText = that.getRelationshipTypeText();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "relationshipTypeText", lhsRelationshipTypeText), LocatorUtils.property(thatLocator, "relationshipTypeText", rhsRelationshipTypeText), lhsRelationshipTypeText, rhsRelationshipTypeText)) {
                return false;
            }
        }
        {
            String lhsSameFacilityIndicator;
            lhsSameFacilityIndicator = this.getSameFacilityIndicator();
            String rhsSameFacilityIndicator;
            rhsSameFacilityIndicator = that.getSameFacilityIndicator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sameFacilityIndicator", lhsSameFacilityIndicator), LocatorUtils.property(thatLocator, "sameFacilityIndicator", rhsSameFacilityIndicator), lhsSameFacilityIndicator, rhsSameFacilityIndicator)) {
                return false;
            }
        }
        {
            String lhsOtherIDSupplementalInformationText;
            lhsOtherIDSupplementalInformationText = this.getOtherIDSupplementalInformationText();
            String rhsOtherIDSupplementalInformationText;
            rhsOtherIDSupplementalInformationText = that.getOtherIDSupplementalInformationText();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "otherIDSupplementalInformationText", lhsOtherIDSupplementalInformationText), LocatorUtils.property(thatLocator, "otherIDSupplementalInformationText", rhsOtherIDSupplementalInformationText), lhsOtherIDSupplementalInformationText, rhsOtherIDSupplementalInformationText)) {
                return false;
            }
        }
        return true;
    }

    @Override
	public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    @Override
	public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            String theTransactionCode;
            theTransactionCode = this.getTransactionCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "transactionCode", theTransactionCode), currentHashCode, theTransactionCode);
        }
        {
            String theOtherHandlerID;
            theOtherHandlerID = this.getOtherHandlerID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "otherHandlerID", theOtherHandlerID), currentHashCode, theOtherHandlerID);
        }
        {
            String theRelationshipOwnerName;
            theRelationshipOwnerName = this.getRelationshipOwnerName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "relationshipOwnerName", theRelationshipOwnerName), currentHashCode, theRelationshipOwnerName);
        }
        {
            String theRelationshipTypeCode;
            theRelationshipTypeCode = this.getRelationshipTypeCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "relationshipTypeCode", theRelationshipTypeCode), currentHashCode, theRelationshipTypeCode);
        }
        {
            String theRelationshipTypeText;
            theRelationshipTypeText = this.getRelationshipTypeText();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "relationshipTypeText", theRelationshipTypeText), currentHashCode, theRelationshipTypeText);
        }
        {
            String theSameFacilityIndicator;
            theSameFacilityIndicator = this.getSameFacilityIndicator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sameFacilityIndicator", theSameFacilityIndicator), currentHashCode, theSameFacilityIndicator);
        }
        {
            String theOtherIDSupplementalInformationText;
            theOtherIDSupplementalInformationText = this.getOtherIDSupplementalInformationText();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "otherIDSupplementalInformationText", theOtherIDSupplementalInformationText), currentHashCode, theOtherIDSupplementalInformationText);
        }
        return currentHashCode;
    }

    @Override
	public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
