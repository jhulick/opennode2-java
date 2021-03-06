//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.12.07 at 11:39:25 AM EST 
//


package com.windsor.node.plugin.icisnpdes.generated;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;
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
 * <p>Java class for Contact complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Contact">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.exchangenetwork.net/schema/icis/5}AffiliationTypeText"/>
 *         &lt;element ref="{http://www.exchangenetwork.net/schema/icis/5}FirstName"/>
 *         &lt;element ref="{http://www.exchangenetwork.net/schema/icis/5}MiddleName" minOccurs="0"/>
 *         &lt;element ref="{http://www.exchangenetwork.net/schema/icis/5}LastName"/>
 *         &lt;element ref="{http://www.exchangenetwork.net/schema/icis/5}IndividualTitleText"/>
 *         &lt;element ref="{http://www.exchangenetwork.net/schema/icis/5}OrganizationFormalName" minOccurs="0"/>
 *         &lt;element ref="{http://www.exchangenetwork.net/schema/icis/5}StateCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.exchangenetwork.net/schema/icis/5}RegionCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.exchangenetwork.net/schema/icis/5}Telephone" maxOccurs="4" minOccurs="0"/>
 *         &lt;element ref="{http://www.exchangenetwork.net/schema/icis/5}ElectronicAddressText" minOccurs="0"/>
 *         &lt;element ref="{http://www.exchangenetwork.net/schema/icis/5}StartDateOfContactAssociation" minOccurs="0"/>
 *         &lt;element ref="{http://www.exchangenetwork.net/schema/icis/5}EndDateOfContactAssociation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Contact", propOrder = {
    "affiliationTypeText",
    "firstName",
    "middleName",
    "lastName",
    "individualTitleText",
    "organizationFormalName",
    "stateCode",
    "regionCode",
    "telephone",
    "electronicAddressText",
    "startDateOfContactAssociation",
    "endDateOfContactAssociation"
})
@Entity(name = "Contact")
@Table(name = "ICS_CONTACT")
@Inheritance(strategy = InheritanceType.JOINED)
public class Contact
    implements Serializable, Equals, HashCode
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "AffiliationTypeText", required = true)
    protected String affiliationTypeText;
    @XmlElement(name = "FirstName", required = true)
    protected String firstName;
    @XmlElement(name = "MiddleName")
    protected String middleName;
    @XmlElement(name = "LastName", required = true)
    protected String lastName;
    @XmlElement(name = "IndividualTitleText", required = true)
    protected String individualTitleText;
    @XmlElement(name = "OrganizationFormalName")
    protected String organizationFormalName;
    @XmlElement(name = "StateCode")
    protected String stateCode;
    @XmlElement(name = "RegionCode")
    protected String regionCode;
    @XmlElement(name = "Telephone")
    protected List<Telephone> telephone;
    @XmlElement(name = "ElectronicAddressText")
    protected String electronicAddressText;
    @XmlElement(name = "StartDateOfContactAssociation", type = String.class)
    @XmlJavaTypeAdapter(DateNoTimeZoneAdapter.class)
    protected Date startDateOfContactAssociation;
    @XmlElement(name = "EndDateOfContactAssociation", type = String.class)
    @XmlJavaTypeAdapter(DateNoTimeZoneAdapter.class)
    protected Date endDateOfContactAssociation;
    @XmlTransient
    protected String dbid;

    /**
     * Gets the value of the affiliationTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "AFFIL_TYPE_TXT", length = 3)
    public String getAffiliationTypeText() {
        return affiliationTypeText;
    }

    /**
     * Sets the value of the affiliationTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAffiliationTypeText(String value) {
        this.affiliationTypeText = value;
    }

    @Transient
    public boolean isSetAffiliationTypeText() {
        return (this.affiliationTypeText!= null);
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "FIRST_NAME", length = 30)
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    @Transient
    public boolean isSetFirstName() {
        return (this.firstName!= null);
    }

    /**
     * Gets the value of the middleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "MIDDLE_NAME", length = 10)
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Sets the value of the middleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleName(String value) {
        this.middleName = value;
    }

    @Transient
    public boolean isSetMiddleName() {
        return (this.middleName!= null);
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "LAST_NAME", length = 30)
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    @Transient
    public boolean isSetLastName() {
        return (this.lastName!= null);
    }

    /**
     * Gets the value of the individualTitleText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "INDVL_TITLE_TXT", length = 40)
    public String getIndividualTitleText() {
        return individualTitleText;
    }

    /**
     * Sets the value of the individualTitleText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndividualTitleText(String value) {
        this.individualTitleText = value;
    }

    @Transient
    public boolean isSetIndividualTitleText() {
        return (this.individualTitleText!= null);
    }

    /**
     * Gets the value of the organizationFormalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "ORG_FRML_NAME", length = 80)
    public String getOrganizationFormalName() {
        return organizationFormalName;
    }

    /**
     * Sets the value of the organizationFormalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationFormalName(String value) {
        this.organizationFormalName = value;
    }

    @Transient
    public boolean isSetOrganizationFormalName() {
        return (this.organizationFormalName!= null);
    }

    /**
     * Gets the value of the stateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "ST_CODE", columnDefinition = "char(2)", length = 2)
    public String getStateCode() {
        return stateCode;
    }

    /**
     * Sets the value of the stateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateCode(String value) {
        this.stateCode = value;
    }

    @Transient
    public boolean isSetStateCode() {
        return (this.stateCode!= null);
    }

    /**
     * Gets the value of the regionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "RGN_CODE", columnDefinition = "char(2)", length = 2)
    public String getRegionCode() {
        return regionCode;
    }

    /**
     * Sets the value of the regionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegionCode(String value) {
        this.regionCode = value;
    }

    @Transient
    public boolean isSetRegionCode() {
        return (this.regionCode!= null);
    }

    /**
     * Gets the value of the telephone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the telephone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTelephone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Telephone }
     * 
     * 
     */
    @OneToMany(targetEntity = Telephone.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "ICS_CONTACT_ID")
    public List<Telephone> getTelephone() {
        if (telephone == null) {
            telephone = new ArrayList<Telephone>();
        }
        return this.telephone;
    }

    /**
     * 
     * 
     */
    public void setTelephone(List<Telephone> telephone) {
        this.telephone = telephone;
    }

    @Transient
    public boolean isSetTelephone() {
        return ((this.telephone!= null)&&(!this.telephone.isEmpty()));
    }

    public void unsetTelephone() {
        this.telephone = null;
    }

    /**
     * Gets the value of the electronicAddressText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "ELEC_ADDR_TXT", length = 100)
    public String getElectronicAddressText() {
        return electronicAddressText;
    }

    /**
     * Sets the value of the electronicAddressText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElectronicAddressText(String value) {
        this.electronicAddressText = value;
    }

    @Transient
    public boolean isSetElectronicAddressText() {
        return (this.electronicAddressText!= null);
    }

    /**
     * Gets the value of the startDateOfContactAssociation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "START_DATE_OF_CONTACT_ASSC")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getStartDateOfContactAssociation() {
        return startDateOfContactAssociation;
    }

    /**
     * Sets the value of the startDateOfContactAssociation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDateOfContactAssociation(Date value) {
        this.startDateOfContactAssociation = value;
    }

    @Transient
    public boolean isSetStartDateOfContactAssociation() {
        return (this.startDateOfContactAssociation!= null);
    }

    /**
     * Gets the value of the endDateOfContactAssociation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "END_DATE_OF_CONTACT_ASSC")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getEndDateOfContactAssociation() {
        return endDateOfContactAssociation;
    }

    /**
     * Sets the value of the endDateOfContactAssociation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDateOfContactAssociation(Date value) {
        this.endDateOfContactAssociation = value;
    }

    @Transient
    public boolean isSetEndDateOfContactAssociation() {
        return (this.endDateOfContactAssociation!= null);
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
    @Column(name = "ICS_CONTACT_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
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
        if (!(object instanceof Contact)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Contact that = ((Contact) object);
        {
            String lhsAffiliationTypeText;
            lhsAffiliationTypeText = this.getAffiliationTypeText();
            String rhsAffiliationTypeText;
            rhsAffiliationTypeText = that.getAffiliationTypeText();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "affiliationTypeText", lhsAffiliationTypeText), LocatorUtils.property(thatLocator, "affiliationTypeText", rhsAffiliationTypeText), lhsAffiliationTypeText, rhsAffiliationTypeText)) {
                return false;
            }
        }
        {
            String lhsFirstName;
            lhsFirstName = this.getFirstName();
            String rhsFirstName;
            rhsFirstName = that.getFirstName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "firstName", lhsFirstName), LocatorUtils.property(thatLocator, "firstName", rhsFirstName), lhsFirstName, rhsFirstName)) {
                return false;
            }
        }
        {
            String lhsMiddleName;
            lhsMiddleName = this.getMiddleName();
            String rhsMiddleName;
            rhsMiddleName = that.getMiddleName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "middleName", lhsMiddleName), LocatorUtils.property(thatLocator, "middleName", rhsMiddleName), lhsMiddleName, rhsMiddleName)) {
                return false;
            }
        }
        {
            String lhsLastName;
            lhsLastName = this.getLastName();
            String rhsLastName;
            rhsLastName = that.getLastName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lastName", lhsLastName), LocatorUtils.property(thatLocator, "lastName", rhsLastName), lhsLastName, rhsLastName)) {
                return false;
            }
        }
        {
            String lhsIndividualTitleText;
            lhsIndividualTitleText = this.getIndividualTitleText();
            String rhsIndividualTitleText;
            rhsIndividualTitleText = that.getIndividualTitleText();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "individualTitleText", lhsIndividualTitleText), LocatorUtils.property(thatLocator, "individualTitleText", rhsIndividualTitleText), lhsIndividualTitleText, rhsIndividualTitleText)) {
                return false;
            }
        }
        {
            String lhsOrganizationFormalName;
            lhsOrganizationFormalName = this.getOrganizationFormalName();
            String rhsOrganizationFormalName;
            rhsOrganizationFormalName = that.getOrganizationFormalName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "organizationFormalName", lhsOrganizationFormalName), LocatorUtils.property(thatLocator, "organizationFormalName", rhsOrganizationFormalName), lhsOrganizationFormalName, rhsOrganizationFormalName)) {
                return false;
            }
        }
        {
            String lhsStateCode;
            lhsStateCode = this.getStateCode();
            String rhsStateCode;
            rhsStateCode = that.getStateCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "stateCode", lhsStateCode), LocatorUtils.property(thatLocator, "stateCode", rhsStateCode), lhsStateCode, rhsStateCode)) {
                return false;
            }
        }
        {
            String lhsRegionCode;
            lhsRegionCode = this.getRegionCode();
            String rhsRegionCode;
            rhsRegionCode = that.getRegionCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "regionCode", lhsRegionCode), LocatorUtils.property(thatLocator, "regionCode", rhsRegionCode), lhsRegionCode, rhsRegionCode)) {
                return false;
            }
        }
        {
            List<Telephone> lhsTelephone;
            lhsTelephone = (this.isSetTelephone()?this.getTelephone():null);
            List<Telephone> rhsTelephone;
            rhsTelephone = (that.isSetTelephone()?that.getTelephone():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "telephone", lhsTelephone), LocatorUtils.property(thatLocator, "telephone", rhsTelephone), lhsTelephone, rhsTelephone)) {
                return false;
            }
        }
        {
            String lhsElectronicAddressText;
            lhsElectronicAddressText = this.getElectronicAddressText();
            String rhsElectronicAddressText;
            rhsElectronicAddressText = that.getElectronicAddressText();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "electronicAddressText", lhsElectronicAddressText), LocatorUtils.property(thatLocator, "electronicAddressText", rhsElectronicAddressText), lhsElectronicAddressText, rhsElectronicAddressText)) {
                return false;
            }
        }
        {
            Date lhsStartDateOfContactAssociation;
            lhsStartDateOfContactAssociation = this.getStartDateOfContactAssociation();
            Date rhsStartDateOfContactAssociation;
            rhsStartDateOfContactAssociation = that.getStartDateOfContactAssociation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "startDateOfContactAssociation", lhsStartDateOfContactAssociation), LocatorUtils.property(thatLocator, "startDateOfContactAssociation", rhsStartDateOfContactAssociation), lhsStartDateOfContactAssociation, rhsStartDateOfContactAssociation)) {
                return false;
            }
        }
        {
            Date lhsEndDateOfContactAssociation;
            lhsEndDateOfContactAssociation = this.getEndDateOfContactAssociation();
            Date rhsEndDateOfContactAssociation;
            rhsEndDateOfContactAssociation = that.getEndDateOfContactAssociation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "endDateOfContactAssociation", lhsEndDateOfContactAssociation), LocatorUtils.property(thatLocator, "endDateOfContactAssociation", rhsEndDateOfContactAssociation), lhsEndDateOfContactAssociation, rhsEndDateOfContactAssociation)) {
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
            String theAffiliationTypeText;
            theAffiliationTypeText = this.getAffiliationTypeText();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "affiliationTypeText", theAffiliationTypeText), currentHashCode, theAffiliationTypeText);
        }
        {
            String theFirstName;
            theFirstName = this.getFirstName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "firstName", theFirstName), currentHashCode, theFirstName);
        }
        {
            String theMiddleName;
            theMiddleName = this.getMiddleName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "middleName", theMiddleName), currentHashCode, theMiddleName);
        }
        {
            String theLastName;
            theLastName = this.getLastName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lastName", theLastName), currentHashCode, theLastName);
        }
        {
            String theIndividualTitleText;
            theIndividualTitleText = this.getIndividualTitleText();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "individualTitleText", theIndividualTitleText), currentHashCode, theIndividualTitleText);
        }
        {
            String theOrganizationFormalName;
            theOrganizationFormalName = this.getOrganizationFormalName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "organizationFormalName", theOrganizationFormalName), currentHashCode, theOrganizationFormalName);
        }
        {
            String theStateCode;
            theStateCode = this.getStateCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "stateCode", theStateCode), currentHashCode, theStateCode);
        }
        {
            String theRegionCode;
            theRegionCode = this.getRegionCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "regionCode", theRegionCode), currentHashCode, theRegionCode);
        }
        {
            List<Telephone> theTelephone;
            theTelephone = (this.isSetTelephone()?this.getTelephone():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "telephone", theTelephone), currentHashCode, theTelephone);
        }
        {
            String theElectronicAddressText;
            theElectronicAddressText = this.getElectronicAddressText();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "electronicAddressText", theElectronicAddressText), currentHashCode, theElectronicAddressText);
        }
        {
            Date theStartDateOfContactAssociation;
            theStartDateOfContactAssociation = this.getStartDateOfContactAssociation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "startDateOfContactAssociation", theStartDateOfContactAssociation), currentHashCode, theStartDateOfContactAssociation);
        }
        {
            Date theEndDateOfContactAssociation;
            theEndDateOfContactAssociation = this.getEndDateOfContactAssociation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "endDateOfContactAssociation", theEndDateOfContactAssociation), currentHashCode, theEndDateOfContactAssociation);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
