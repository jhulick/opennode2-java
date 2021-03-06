//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.06.15 at 06:46:14 PM EDT 
//


package com.windsor.node.plugin.rcra54.domain.generated;

import java.math.BigInteger;
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
 * Mechanisms used to address cost estimates of the Financial liability associated with a given Handler.
 * 
 * <p>Java class for MechanismDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MechanismDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.exchangenetwork.net/schema/RCRA/5}TransactionCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.exchangenetwork.net/schema/RCRA/5}ActivityLocationCode"/>
 *         &lt;element ref="{http://www.exchangenetwork.net/schema/RCRA/5}MechanismAgencyCode"/>
 *         &lt;element ref="{http://www.exchangenetwork.net/schema/RCRA/5}AgencyText" minOccurs="0"/>
 *         &lt;element ref="{http://www.exchangenetwork.net/schema/RCRA/5}MechanismSequenceNumber"/>
 *         &lt;element ref="{http://www.exchangenetwork.net/schema/RCRA/5}MechanismTypeDataOwnerCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.exchangenetwork.net/schema/RCRA/5}MechanismTypeCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.exchangenetwork.net/schema/RCRA/5}MechanismTypeText" minOccurs="0"/>
 *         &lt;element ref="{http://www.exchangenetwork.net/schema/RCRA/5}ProviderText" minOccurs="0"/>
 *         &lt;element ref="{http://www.exchangenetwork.net/schema/RCRA/5}ProviderFullContactName" minOccurs="0"/>
 *         &lt;element ref="{http://www.exchangenetwork.net/schema/RCRA/5}TelephoneNumberText" minOccurs="0"/>
 *         &lt;element ref="{http://www.exchangenetwork.net/schema/RCRA/5}SupplementalInformationText" minOccurs="0"/>
 *         &lt;element ref="{http://www.exchangenetwork.net/schema/RCRA/5}MechanismDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MechanismDataType", propOrder = {
    "transactionCode",
    "activityLocationCode",
    "mechanismAgencyCode",
    "agencyText",
    "mechanismSequenceNumber",
    "mechanismTypeDataOwnerCode",
    "mechanismTypeCode",
    "mechanismTypeText",
    "providerText",
    "providerFullContactName",
    "telephoneNumberText",
    "supplementalInformationText",
    "mechanismDetail"
})
@Entity(name = "MechanismDataType")
@Table(name = "RCRA_MECH")
@Inheritance(strategy = InheritanceType.JOINED)
public class MechanismDataType
    implements Equals, HashCode
{

    @XmlElement(name = "TransactionCode")
    protected String transactionCode;
    @XmlElement(name = "ActivityLocationCode", required = true)
    protected String activityLocationCode;
    @XmlElement(name = "MechanismAgencyCode", required = true)
    protected String mechanismAgencyCode;
    @XmlElement(name = "AgencyText")
    protected String agencyText;
    @XmlElement(name = "MechanismSequenceNumber", required = true)
    protected BigInteger mechanismSequenceNumber;
    @XmlElement(name = "MechanismTypeDataOwnerCode")
    protected String mechanismTypeDataOwnerCode;
    @XmlElement(name = "MechanismTypeCode")
    protected String mechanismTypeCode;
    @XmlElement(name = "MechanismTypeText")
    protected String mechanismTypeText;
    @XmlElement(name = "ProviderText")
    protected String providerText;
    @XmlElement(name = "ProviderFullContactName")
    protected String providerFullContactName;
    @XmlElement(name = "TelephoneNumberText")
    protected String telephoneNumberText;
    @XmlElement(name = "SupplementalInformationText")
    protected String supplementalInformationText;
    @XmlElement(name = "MechanismDetail")
    protected List<MechanismDetailDataType> mechanismDetail;
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
     * Gets the value of the activityLocationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "ACTLOCCODE", length = 255)
    public String getActivityLocationCode() {
        return activityLocationCode;
    }

    /**
     * Sets the value of the activityLocationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivityLocationCode(String value) {
        this.activityLocationCode = value;
    }

    /**
     * Gets the value of the mechanismAgencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "MECHAGENCYCODE", length = 1)
    public String getMechanismAgencyCode() {
        return mechanismAgencyCode;
    }

    /**
     * Sets the value of the mechanismAgencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMechanismAgencyCode(String value) {
        this.mechanismAgencyCode = value;
    }

    /**
     * Gets the value of the agencyText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "AGENCYTXT", length = 255)
    public String getAgencyText() {
        return agencyText;
    }

    /**
     * Sets the value of the agencyText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyText(String value) {
        this.agencyText = value;
    }

    /**
     * Gets the value of the mechanismSequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    @Basic
    @Column(name = "MECHSEQNUMBER", precision = 4, scale = 0)
    public BigInteger getMechanismSequenceNumber() {
        return mechanismSequenceNumber;
    }

    /**
     * Sets the value of the mechanismSequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMechanismSequenceNumber(BigInteger value) {
        this.mechanismSequenceNumber = value;
    }

    /**
     * Gets the value of the mechanismTypeDataOwnerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "MECHTYPEDATOWNRCODE", length = 2)
    public String getMechanismTypeDataOwnerCode() {
        return mechanismTypeDataOwnerCode;
    }

    /**
     * Sets the value of the mechanismTypeDataOwnerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMechanismTypeDataOwnerCode(String value) {
        this.mechanismTypeDataOwnerCode = value;
    }

    /**
     * Gets the value of the mechanismTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "MECHTYPECODE", length = 1)
    public String getMechanismTypeCode() {
        return mechanismTypeCode;
    }

    /**
     * Sets the value of the mechanismTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMechanismTypeCode(String value) {
        this.mechanismTypeCode = value;
    }

    /**
     * Gets the value of the mechanismTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "MECHTYPETXT", length = 255)
    public String getMechanismTypeText() {
        return mechanismTypeText;
    }

    /**
     * Sets the value of the mechanismTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMechanismTypeText(String value) {
        this.mechanismTypeText = value;
    }

    /**
     * Gets the value of the providerText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "PROVIDERTXT", length = 80)
    public String getProviderText() {
        return providerText;
    }

    /**
     * Sets the value of the providerText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderText(String value) {
        this.providerText = value;
    }

    /**
     * Gets the value of the providerFullContactName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "PROVIDERFULLCONTACTNAME", length = 33)
    public String getProviderFullContactName() {
        return providerFullContactName;
    }

    /**
     * Sets the value of the providerFullContactName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderFullContactName(String value) {
        this.providerFullContactName = value;
    }

    /**
     * Gets the value of the telephoneNumberText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "TELEPHONE", length = 15)
    public String getTelephoneNumberText() {
        return telephoneNumberText;
    }

    /**
     * Sets the value of the telephoneNumberText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelephoneNumberText(String value) {
        this.telephoneNumberText = value;
    }

    /**
     * Gets the value of the supplementalInformationText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "SUPPINFTXT", length = 2000)
    public String getSupplementalInformationText() {
        return supplementalInformationText;
    }

    /**
     * Sets the value of the supplementalInformationText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplementalInformationText(String value) {
        this.supplementalInformationText = value;
    }

    /**
     * Gets the value of the mechanismDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mechanismDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMechanismDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MechanismDetailDataType }
     * 
     * 
     */
    @OneToMany(targetEntity = MechanismDetailDataType.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "MECHID")
    public List<MechanismDetailDataType> getMechanismDetail() {
        if (mechanismDetail == null) {
            mechanismDetail = new ArrayList<MechanismDetailDataType>();
        }
        return this.mechanismDetail;
    }

    /**
     * 
     * 
     */
    public void setMechanismDetail(List<MechanismDetailDataType> mechanismDetail) {
        this.mechanismDetail = mechanismDetail;
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
        if (!(object instanceof MechanismDataType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final MechanismDataType that = ((MechanismDataType) object);
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
            String lhsActivityLocationCode;
            lhsActivityLocationCode = this.getActivityLocationCode();
            String rhsActivityLocationCode;
            rhsActivityLocationCode = that.getActivityLocationCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "activityLocationCode", lhsActivityLocationCode), LocatorUtils.property(thatLocator, "activityLocationCode", rhsActivityLocationCode), lhsActivityLocationCode, rhsActivityLocationCode)) {
                return false;
            }
        }
        {
            String lhsMechanismAgencyCode;
            lhsMechanismAgencyCode = this.getMechanismAgencyCode();
            String rhsMechanismAgencyCode;
            rhsMechanismAgencyCode = that.getMechanismAgencyCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mechanismAgencyCode", lhsMechanismAgencyCode), LocatorUtils.property(thatLocator, "mechanismAgencyCode", rhsMechanismAgencyCode), lhsMechanismAgencyCode, rhsMechanismAgencyCode)) {
                return false;
            }
        }
        {
            String lhsAgencyText;
            lhsAgencyText = this.getAgencyText();
            String rhsAgencyText;
            rhsAgencyText = that.getAgencyText();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "agencyText", lhsAgencyText), LocatorUtils.property(thatLocator, "agencyText", rhsAgencyText), lhsAgencyText, rhsAgencyText)) {
                return false;
            }
        }
        {
            BigInteger lhsMechanismSequenceNumber;
            lhsMechanismSequenceNumber = this.getMechanismSequenceNumber();
            BigInteger rhsMechanismSequenceNumber;
            rhsMechanismSequenceNumber = that.getMechanismSequenceNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mechanismSequenceNumber", lhsMechanismSequenceNumber), LocatorUtils.property(thatLocator, "mechanismSequenceNumber", rhsMechanismSequenceNumber), lhsMechanismSequenceNumber, rhsMechanismSequenceNumber)) {
                return false;
            }
        }
        {
            String lhsMechanismTypeDataOwnerCode;
            lhsMechanismTypeDataOwnerCode = this.getMechanismTypeDataOwnerCode();
            String rhsMechanismTypeDataOwnerCode;
            rhsMechanismTypeDataOwnerCode = that.getMechanismTypeDataOwnerCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mechanismTypeDataOwnerCode", lhsMechanismTypeDataOwnerCode), LocatorUtils.property(thatLocator, "mechanismTypeDataOwnerCode", rhsMechanismTypeDataOwnerCode), lhsMechanismTypeDataOwnerCode, rhsMechanismTypeDataOwnerCode)) {
                return false;
            }
        }
        {
            String lhsMechanismTypeCode;
            lhsMechanismTypeCode = this.getMechanismTypeCode();
            String rhsMechanismTypeCode;
            rhsMechanismTypeCode = that.getMechanismTypeCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mechanismTypeCode", lhsMechanismTypeCode), LocatorUtils.property(thatLocator, "mechanismTypeCode", rhsMechanismTypeCode), lhsMechanismTypeCode, rhsMechanismTypeCode)) {
                return false;
            }
        }
        {
            String lhsMechanismTypeText;
            lhsMechanismTypeText = this.getMechanismTypeText();
            String rhsMechanismTypeText;
            rhsMechanismTypeText = that.getMechanismTypeText();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mechanismTypeText", lhsMechanismTypeText), LocatorUtils.property(thatLocator, "mechanismTypeText", rhsMechanismTypeText), lhsMechanismTypeText, rhsMechanismTypeText)) {
                return false;
            }
        }
        {
            String lhsProviderText;
            lhsProviderText = this.getProviderText();
            String rhsProviderText;
            rhsProviderText = that.getProviderText();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "providerText", lhsProviderText), LocatorUtils.property(thatLocator, "providerText", rhsProviderText), lhsProviderText, rhsProviderText)) {
                return false;
            }
        }
        {
            String lhsProviderFullContactName;
            lhsProviderFullContactName = this.getProviderFullContactName();
            String rhsProviderFullContactName;
            rhsProviderFullContactName = that.getProviderFullContactName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "providerFullContactName", lhsProviderFullContactName), LocatorUtils.property(thatLocator, "providerFullContactName", rhsProviderFullContactName), lhsProviderFullContactName, rhsProviderFullContactName)) {
                return false;
            }
        }
        {
            String lhsTelephoneNumberText;
            lhsTelephoneNumberText = this.getTelephoneNumberText();
            String rhsTelephoneNumberText;
            rhsTelephoneNumberText = that.getTelephoneNumberText();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "telephoneNumberText", lhsTelephoneNumberText), LocatorUtils.property(thatLocator, "telephoneNumberText", rhsTelephoneNumberText), lhsTelephoneNumberText, rhsTelephoneNumberText)) {
                return false;
            }
        }
        {
            String lhsSupplementalInformationText;
            lhsSupplementalInformationText = this.getSupplementalInformationText();
            String rhsSupplementalInformationText;
            rhsSupplementalInformationText = that.getSupplementalInformationText();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "supplementalInformationText", lhsSupplementalInformationText), LocatorUtils.property(thatLocator, "supplementalInformationText", rhsSupplementalInformationText), lhsSupplementalInformationText, rhsSupplementalInformationText)) {
                return false;
            }
        }
        {
            List<MechanismDetailDataType> lhsMechanismDetail;
            lhsMechanismDetail = (((this.mechanismDetail!= null)&&(!this.mechanismDetail.isEmpty()))?this.getMechanismDetail():null);
            List<MechanismDetailDataType> rhsMechanismDetail;
            rhsMechanismDetail = (((that.mechanismDetail!= null)&&(!that.mechanismDetail.isEmpty()))?that.getMechanismDetail():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mechanismDetail", lhsMechanismDetail), LocatorUtils.property(thatLocator, "mechanismDetail", rhsMechanismDetail), lhsMechanismDetail, rhsMechanismDetail)) {
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
            String theTransactionCode;
            theTransactionCode = this.getTransactionCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "transactionCode", theTransactionCode), currentHashCode, theTransactionCode);
        }
        {
            String theActivityLocationCode;
            theActivityLocationCode = this.getActivityLocationCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "activityLocationCode", theActivityLocationCode), currentHashCode, theActivityLocationCode);
        }
        {
            String theMechanismAgencyCode;
            theMechanismAgencyCode = this.getMechanismAgencyCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mechanismAgencyCode", theMechanismAgencyCode), currentHashCode, theMechanismAgencyCode);
        }
        {
            String theAgencyText;
            theAgencyText = this.getAgencyText();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "agencyText", theAgencyText), currentHashCode, theAgencyText);
        }
        {
            BigInteger theMechanismSequenceNumber;
            theMechanismSequenceNumber = this.getMechanismSequenceNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mechanismSequenceNumber", theMechanismSequenceNumber), currentHashCode, theMechanismSequenceNumber);
        }
        {
            String theMechanismTypeDataOwnerCode;
            theMechanismTypeDataOwnerCode = this.getMechanismTypeDataOwnerCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mechanismTypeDataOwnerCode", theMechanismTypeDataOwnerCode), currentHashCode, theMechanismTypeDataOwnerCode);
        }
        {
            String theMechanismTypeCode;
            theMechanismTypeCode = this.getMechanismTypeCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mechanismTypeCode", theMechanismTypeCode), currentHashCode, theMechanismTypeCode);
        }
        {
            String theMechanismTypeText;
            theMechanismTypeText = this.getMechanismTypeText();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mechanismTypeText", theMechanismTypeText), currentHashCode, theMechanismTypeText);
        }
        {
            String theProviderText;
            theProviderText = this.getProviderText();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "providerText", theProviderText), currentHashCode, theProviderText);
        }
        {
            String theProviderFullContactName;
            theProviderFullContactName = this.getProviderFullContactName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "providerFullContactName", theProviderFullContactName), currentHashCode, theProviderFullContactName);
        }
        {
            String theTelephoneNumberText;
            theTelephoneNumberText = this.getTelephoneNumberText();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "telephoneNumberText", theTelephoneNumberText), currentHashCode, theTelephoneNumberText);
        }
        {
            String theSupplementalInformationText;
            theSupplementalInformationText = this.getSupplementalInformationText();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "supplementalInformationText", theSupplementalInformationText), currentHashCode, theSupplementalInformationText);
        }
        {
            List<MechanismDetailDataType> theMechanismDetail;
            theMechanismDetail = (((this.mechanismDetail!= null)&&(!this.mechanismDetail.isEmpty()))?this.getMechanismDetail():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mechanismDetail", theMechanismDetail), currentHashCode, theMechanismDetail);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
