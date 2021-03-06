//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.12.07 at 11:39:25 AM EST 
//


package com.windsor.node.plugin.icisnpdes.generated;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.AssociationOverride;
import javax.persistence.Basic;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.JoinColumn;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.windsor.node.plugin.common.xml.bind.annotation.adapters.IntegerAdapter;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for BiosolidsPermit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BiosolidsPermit">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.exchangenetwork.net/schema/icis/5}BasicPermitKeyElements">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.exchangenetwork.net/schema/icis/5}BiosolidsTypeCode" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.exchangenetwork.net/schema/icis/5}BiosolidsEndUseDisposalTypeCode" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.exchangenetwork.net/schema/icis/5}BiosolidsAmountGroup" minOccurs="0"/>
 *         &lt;element ref="{http://www.exchangenetwork.net/schema/icis/5}BiosolidsPermitContact" minOccurs="0"/>
 *         &lt;element ref="{http://www.exchangenetwork.net/schema/icis/5}BiosolidsPermitAddress" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BiosolidsPermit", propOrder = {
    "biosolidsTypeCode",
    "biosolidsEndUseDisposalTypeCode",
    "eqProductDistributedMarketedAmount",
    "landAppliedAmount",
    "incineratedAmount",
    "codisposedInMSWLandfillAmount",
    "surfaceDisposalAmount",
    "managedOtherMethodsAmount",
    "receivedOffsiteSourcesAmount",
    "transferredAmount",
    "disposedOutOfStateAmount",
    "beneficiallyUsedOutOfStateAmount",
    "managedOtherMethodsOutOfStateAmount",
    "totalRemovedAmount",
    "annualDrySludgeProductionNumber",
    "biosolidsPermitContact",
    "biosolidsPermitAddress"
})
@Embeddable
public class BiosolidsPermit
    extends BasicPermitKeyElements
    implements Serializable, Equals, HashCode
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "BiosolidsTypeCode")
    protected List<String> biosolidsTypeCode;
    @XmlElement(name = "BiosolidsEndUseDisposalTypeCode")
    protected List<String> biosolidsEndUseDisposalTypeCode;
    @XmlElement(name = "EQProductDistributedMarketedAmount", type = String.class)
    @XmlJavaTypeAdapter(IntegerAdapter.class)
    protected Integer eqProductDistributedMarketedAmount;
    @XmlElement(name = "LandAppliedAmount", type = String.class)
    @XmlJavaTypeAdapter(IntegerAdapter.class)
    protected Integer landAppliedAmount;
    @XmlElement(name = "IncineratedAmount", type = String.class)
    @XmlJavaTypeAdapter(IntegerAdapter.class)
    protected Integer incineratedAmount;
    @XmlElement(name = "CodisposedInMSWLandfillAmount", type = String.class)
    @XmlJavaTypeAdapter(IntegerAdapter.class)
    protected Integer codisposedInMSWLandfillAmount;
    @XmlElement(name = "SurfaceDisposalAmount", type = String.class)
    @XmlJavaTypeAdapter(IntegerAdapter.class)
    protected Integer surfaceDisposalAmount;
    @XmlElement(name = "ManagedOtherMethodsAmount", type = String.class)
    @XmlJavaTypeAdapter(IntegerAdapter.class)
    protected Integer managedOtherMethodsAmount;
    @XmlElement(name = "ReceivedOffsiteSourcesAmount", type = String.class)
    @XmlJavaTypeAdapter(IntegerAdapter.class)
    protected Integer receivedOffsiteSourcesAmount;
    @XmlElement(name = "TransferredAmount", type = String.class)
    @XmlJavaTypeAdapter(IntegerAdapter.class)
    protected Integer transferredAmount;
    @XmlElement(name = "DisposedOutOfStateAmount", type = String.class)
    @XmlJavaTypeAdapter(IntegerAdapter.class)
    protected Integer disposedOutOfStateAmount;
    @XmlElement(name = "BeneficiallyUsedOutOfStateAmount", type = String.class)
    @XmlJavaTypeAdapter(IntegerAdapter.class)
    protected Integer beneficiallyUsedOutOfStateAmount;
    @XmlElement(name = "ManagedOtherMethodsOutOfStateAmount", type = String.class)
    @XmlJavaTypeAdapter(IntegerAdapter.class)
    protected Integer managedOtherMethodsOutOfStateAmount;
    @XmlElement(name = "TotalRemovedAmount", type = String.class)
    @XmlJavaTypeAdapter(IntegerAdapter.class)
    protected Integer totalRemovedAmount;
    @XmlElement(name = "AnnualDrySludgeProductionNumber", type = String.class)
    @XmlJavaTypeAdapter(IntegerAdapter.class)
    protected Integer annualDrySludgeProductionNumber;
    @XmlElement(name = "BiosolidsPermitContact")
    protected BiosolidsPermitContact biosolidsPermitContact;
    @XmlElement(name = "BiosolidsPermitAddress")
    protected BiosolidsPermitAddress biosolidsPermitAddress;

    /**
     * Gets the value of the biosolidsTypeCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the biosolidsTypeCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBiosolidsTypeCode().add(newItem);
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
    @Column(name = "BS_TYPE_CODE", length = 3)
    @CollectionTable(name = "ICS_BS_TYPE", joinColumns = {
        @JoinColumn(name = "ICS_BS_PRMT_ID")
    })
    public List<String> getBiosolidsTypeCode() {
        if (biosolidsTypeCode == null) {
            biosolidsTypeCode = new ArrayList<String>();
        }
        return this.biosolidsTypeCode;
    }

    /**
     * 
     * 
     */
    public void setBiosolidsTypeCode(List<String> biosolidsTypeCode) {
        this.biosolidsTypeCode = biosolidsTypeCode;
    }

    @Transient
    public boolean isSetBiosolidsTypeCode() {
        return ((this.biosolidsTypeCode!= null)&&(!this.biosolidsTypeCode.isEmpty()));
    }

    public void unsetBiosolidsTypeCode() {
        this.biosolidsTypeCode = null;
    }

    /**
     * Gets the value of the biosolidsEndUseDisposalTypeCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the biosolidsEndUseDisposalTypeCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBiosolidsEndUseDisposalTypeCode().add(newItem);
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
    @Column(name = "BS_END_USE_DSPL_TYPE_CODE", length = 3)
    @CollectionTable(name = "ICS_BS_END_USE_DSPL_TYPE", joinColumns = {
        @JoinColumn(name = "ICS_BS_PRMT_ID")
    })
    public List<String> getBiosolidsEndUseDisposalTypeCode() {
        if (biosolidsEndUseDisposalTypeCode == null) {
            biosolidsEndUseDisposalTypeCode = new ArrayList<String>();
        }
        return this.biosolidsEndUseDisposalTypeCode;
    }

    /**
     * 
     * 
     */
    public void setBiosolidsEndUseDisposalTypeCode(List<String> biosolidsEndUseDisposalTypeCode) {
        this.biosolidsEndUseDisposalTypeCode = biosolidsEndUseDisposalTypeCode;
    }

    @Transient
    public boolean isSetBiosolidsEndUseDisposalTypeCode() {
        return ((this.biosolidsEndUseDisposalTypeCode!= null)&&(!this.biosolidsEndUseDisposalTypeCode.isEmpty()));
    }

    public void unsetBiosolidsEndUseDisposalTypeCode() {
        this.biosolidsEndUseDisposalTypeCode = null;
    }

    /**
     * Gets the value of the eqProductDistributedMarketedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "EQ_PROD_DIST_MARKETED_AMT", scale = 0)
    public Integer getEQProductDistributedMarketedAmount() {
        return eqProductDistributedMarketedAmount;
    }

    /**
     * Sets the value of the eqProductDistributedMarketedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEQProductDistributedMarketedAmount(Integer value) {
        this.eqProductDistributedMarketedAmount = value;
    }

    @Transient
    public boolean isSetEQProductDistributedMarketedAmount() {
        return (this.eqProductDistributedMarketedAmount!= null);
    }

    /**
     * Gets the value of the landAppliedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "LAND_APPLIED_AMT", scale = 0)
    public Integer getLandAppliedAmount() {
        return landAppliedAmount;
    }

    /**
     * Sets the value of the landAppliedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLandAppliedAmount(Integer value) {
        this.landAppliedAmount = value;
    }

    @Transient
    public boolean isSetLandAppliedAmount() {
        return (this.landAppliedAmount!= null);
    }

    /**
     * Gets the value of the incineratedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "INCINERATED_AMT", scale = 0)
    public Integer getIncineratedAmount() {
        return incineratedAmount;
    }

    /**
     * Sets the value of the incineratedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncineratedAmount(Integer value) {
        this.incineratedAmount = value;
    }

    @Transient
    public boolean isSetIncineratedAmount() {
        return (this.incineratedAmount!= null);
    }

    /**
     * Gets the value of the codisposedInMSWLandfillAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "CODISPOSED_IN_MSW_LANDFILL_AMT", scale = 0)
    public Integer getCodisposedInMSWLandfillAmount() {
        return codisposedInMSWLandfillAmount;
    }

    /**
     * Sets the value of the codisposedInMSWLandfillAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodisposedInMSWLandfillAmount(Integer value) {
        this.codisposedInMSWLandfillAmount = value;
    }

    @Transient
    public boolean isSetCodisposedInMSWLandfillAmount() {
        return (this.codisposedInMSWLandfillAmount!= null);
    }

    /**
     * Gets the value of the surfaceDisposalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "SURF_DSPL_AMT", scale = 0)
    public Integer getSurfaceDisposalAmount() {
        return surfaceDisposalAmount;
    }

    /**
     * Sets the value of the surfaceDisposalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurfaceDisposalAmount(Integer value) {
        this.surfaceDisposalAmount = value;
    }

    @Transient
    public boolean isSetSurfaceDisposalAmount() {
        return (this.surfaceDisposalAmount!= null);
    }

    /**
     * Gets the value of the managedOtherMethodsAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "MNGED_OTHR_MTHDS_AMT", scale = 0)
    public Integer getManagedOtherMethodsAmount() {
        return managedOtherMethodsAmount;
    }

    /**
     * Sets the value of the managedOtherMethodsAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManagedOtherMethodsAmount(Integer value) {
        this.managedOtherMethodsAmount = value;
    }

    @Transient
    public boolean isSetManagedOtherMethodsAmount() {
        return (this.managedOtherMethodsAmount!= null);
    }

    /**
     * Gets the value of the receivedOffsiteSourcesAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "RCVD_OFFSITE_SRCS_AMT", scale = 0)
    public Integer getReceivedOffsiteSourcesAmount() {
        return receivedOffsiteSourcesAmount;
    }

    /**
     * Sets the value of the receivedOffsiteSourcesAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceivedOffsiteSourcesAmount(Integer value) {
        this.receivedOffsiteSourcesAmount = value;
    }

    @Transient
    public boolean isSetReceivedOffsiteSourcesAmount() {
        return (this.receivedOffsiteSourcesAmount!= null);
    }

    /**
     * Gets the value of the transferredAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "TRANSFERRED_AMT", scale = 0)
    public Integer getTransferredAmount() {
        return transferredAmount;
    }

    /**
     * Sets the value of the transferredAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferredAmount(Integer value) {
        this.transferredAmount = value;
    }

    @Transient
    public boolean isSetTransferredAmount() {
        return (this.transferredAmount!= null);
    }

    /**
     * Gets the value of the disposedOutOfStateAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "DISPOSED_OUT_OF_ST_AMT", scale = 0)
    public Integer getDisposedOutOfStateAmount() {
        return disposedOutOfStateAmount;
    }

    /**
     * Sets the value of the disposedOutOfStateAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisposedOutOfStateAmount(Integer value) {
        this.disposedOutOfStateAmount = value;
    }

    @Transient
    public boolean isSetDisposedOutOfStateAmount() {
        return (this.disposedOutOfStateAmount!= null);
    }

    /**
     * Gets the value of the beneficiallyUsedOutOfStateAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "BENEF_USED_OUT_OF_ST_AMT", scale = 0)
    public Integer getBeneficiallyUsedOutOfStateAmount() {
        return beneficiallyUsedOutOfStateAmount;
    }

    /**
     * Sets the value of the beneficiallyUsedOutOfStateAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeneficiallyUsedOutOfStateAmount(Integer value) {
        this.beneficiallyUsedOutOfStateAmount = value;
    }

    @Transient
    public boolean isSetBeneficiallyUsedOutOfStateAmount() {
        return (this.beneficiallyUsedOutOfStateAmount!= null);
    }

    /**
     * Gets the value of the managedOtherMethodsOutOfStateAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "MNGED_OTHR_MTHDS_OUT_OF_ST_AMT", scale = 0)
    public Integer getManagedOtherMethodsOutOfStateAmount() {
        return managedOtherMethodsOutOfStateAmount;
    }

    /**
     * Sets the value of the managedOtherMethodsOutOfStateAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManagedOtherMethodsOutOfStateAmount(Integer value) {
        this.managedOtherMethodsOutOfStateAmount = value;
    }

    @Transient
    public boolean isSetManagedOtherMethodsOutOfStateAmount() {
        return (this.managedOtherMethodsOutOfStateAmount!= null);
    }

    /**
     * Gets the value of the totalRemovedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "TTL_REMOVED_AMT", scale = 0)
    public Integer getTotalRemovedAmount() {
        return totalRemovedAmount;
    }

    /**
     * Sets the value of the totalRemovedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalRemovedAmount(Integer value) {
        this.totalRemovedAmount = value;
    }

    @Transient
    public boolean isSetTotalRemovedAmount() {
        return (this.totalRemovedAmount!= null);
    }

    /**
     * Gets the value of the annualDrySludgeProductionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "ANNUL_DRY_SLDG_PROD_NUM", scale = 0)
    public Integer getAnnualDrySludgeProductionNumber() {
        return annualDrySludgeProductionNumber;
    }

    /**
     * Sets the value of the annualDrySludgeProductionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnnualDrySludgeProductionNumber(Integer value) {
        this.annualDrySludgeProductionNumber = value;
    }

    @Transient
    public boolean isSetAnnualDrySludgeProductionNumber() {
        return (this.annualDrySludgeProductionNumber!= null);
    }

    /**
     * Gets the value of the biosolidsPermitContact property.
     * 
     * @return
     *     possible object is
     *     {@link BiosolidsPermitContact }
     *     
     */
    @Embedded
    @AssociationOverride(name = "contact", joinColumns = {
        @JoinColumn(name = "ICS_BS_PRMT_ID")
    })
    public BiosolidsPermitContact getBiosolidsPermitContact() {
        return biosolidsPermitContact;
    }

    /**
     * Sets the value of the biosolidsPermitContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link BiosolidsPermitContact }
     *     
     */
    public void setBiosolidsPermitContact(BiosolidsPermitContact value) {
        this.biosolidsPermitContact = value;
    }

    @Transient
    public boolean isSetBiosolidsPermitContact() {
        return (this.biosolidsPermitContact!= null);
    }

    /**
     * Gets the value of the biosolidsPermitAddress property.
     * 
     * @return
     *     possible object is
     *     {@link BiosolidsPermitAddress }
     *     
     */
    @Embedded
    @AssociationOverride(name = "address", joinColumns = {
        @JoinColumn(name = "ICS_BS_PRMT_ID")
    })
    public BiosolidsPermitAddress getBiosolidsPermitAddress() {
        return biosolidsPermitAddress;
    }

    /**
     * Sets the value of the biosolidsPermitAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link BiosolidsPermitAddress }
     *     
     */
    public void setBiosolidsPermitAddress(BiosolidsPermitAddress value) {
        this.biosolidsPermitAddress = value;
    }

    @Transient
    public boolean isSetBiosolidsPermitAddress() {
        return (this.biosolidsPermitAddress!= null);
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof BiosolidsPermit)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final BiosolidsPermit that = ((BiosolidsPermit) object);
        {
            List<String> lhsBiosolidsTypeCode;
            lhsBiosolidsTypeCode = (this.isSetBiosolidsTypeCode()?this.getBiosolidsTypeCode():null);
            List<String> rhsBiosolidsTypeCode;
            rhsBiosolidsTypeCode = (that.isSetBiosolidsTypeCode()?that.getBiosolidsTypeCode():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "biosolidsTypeCode", lhsBiosolidsTypeCode), LocatorUtils.property(thatLocator, "biosolidsTypeCode", rhsBiosolidsTypeCode), lhsBiosolidsTypeCode, rhsBiosolidsTypeCode)) {
                return false;
            }
        }
        {
            List<String> lhsBiosolidsEndUseDisposalTypeCode;
            lhsBiosolidsEndUseDisposalTypeCode = (this.isSetBiosolidsEndUseDisposalTypeCode()?this.getBiosolidsEndUseDisposalTypeCode():null);
            List<String> rhsBiosolidsEndUseDisposalTypeCode;
            rhsBiosolidsEndUseDisposalTypeCode = (that.isSetBiosolidsEndUseDisposalTypeCode()?that.getBiosolidsEndUseDisposalTypeCode():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "biosolidsEndUseDisposalTypeCode", lhsBiosolidsEndUseDisposalTypeCode), LocatorUtils.property(thatLocator, "biosolidsEndUseDisposalTypeCode", rhsBiosolidsEndUseDisposalTypeCode), lhsBiosolidsEndUseDisposalTypeCode, rhsBiosolidsEndUseDisposalTypeCode)) {
                return false;
            }
        }
        {
            Integer lhsEQProductDistributedMarketedAmount;
            lhsEQProductDistributedMarketedAmount = this.getEQProductDistributedMarketedAmount();
            Integer rhsEQProductDistributedMarketedAmount;
            rhsEQProductDistributedMarketedAmount = that.getEQProductDistributedMarketedAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "eqProductDistributedMarketedAmount", lhsEQProductDistributedMarketedAmount), LocatorUtils.property(thatLocator, "eqProductDistributedMarketedAmount", rhsEQProductDistributedMarketedAmount), lhsEQProductDistributedMarketedAmount, rhsEQProductDistributedMarketedAmount)) {
                return false;
            }
        }
        {
            Integer lhsLandAppliedAmount;
            lhsLandAppliedAmount = this.getLandAppliedAmount();
            Integer rhsLandAppliedAmount;
            rhsLandAppliedAmount = that.getLandAppliedAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "landAppliedAmount", lhsLandAppliedAmount), LocatorUtils.property(thatLocator, "landAppliedAmount", rhsLandAppliedAmount), lhsLandAppliedAmount, rhsLandAppliedAmount)) {
                return false;
            }
        }
        {
            Integer lhsIncineratedAmount;
            lhsIncineratedAmount = this.getIncineratedAmount();
            Integer rhsIncineratedAmount;
            rhsIncineratedAmount = that.getIncineratedAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "incineratedAmount", lhsIncineratedAmount), LocatorUtils.property(thatLocator, "incineratedAmount", rhsIncineratedAmount), lhsIncineratedAmount, rhsIncineratedAmount)) {
                return false;
            }
        }
        {
            Integer lhsCodisposedInMSWLandfillAmount;
            lhsCodisposedInMSWLandfillAmount = this.getCodisposedInMSWLandfillAmount();
            Integer rhsCodisposedInMSWLandfillAmount;
            rhsCodisposedInMSWLandfillAmount = that.getCodisposedInMSWLandfillAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "codisposedInMSWLandfillAmount", lhsCodisposedInMSWLandfillAmount), LocatorUtils.property(thatLocator, "codisposedInMSWLandfillAmount", rhsCodisposedInMSWLandfillAmount), lhsCodisposedInMSWLandfillAmount, rhsCodisposedInMSWLandfillAmount)) {
                return false;
            }
        }
        {
            Integer lhsSurfaceDisposalAmount;
            lhsSurfaceDisposalAmount = this.getSurfaceDisposalAmount();
            Integer rhsSurfaceDisposalAmount;
            rhsSurfaceDisposalAmount = that.getSurfaceDisposalAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "surfaceDisposalAmount", lhsSurfaceDisposalAmount), LocatorUtils.property(thatLocator, "surfaceDisposalAmount", rhsSurfaceDisposalAmount), lhsSurfaceDisposalAmount, rhsSurfaceDisposalAmount)) {
                return false;
            }
        }
        {
            Integer lhsManagedOtherMethodsAmount;
            lhsManagedOtherMethodsAmount = this.getManagedOtherMethodsAmount();
            Integer rhsManagedOtherMethodsAmount;
            rhsManagedOtherMethodsAmount = that.getManagedOtherMethodsAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "managedOtherMethodsAmount", lhsManagedOtherMethodsAmount), LocatorUtils.property(thatLocator, "managedOtherMethodsAmount", rhsManagedOtherMethodsAmount), lhsManagedOtherMethodsAmount, rhsManagedOtherMethodsAmount)) {
                return false;
            }
        }
        {
            Integer lhsReceivedOffsiteSourcesAmount;
            lhsReceivedOffsiteSourcesAmount = this.getReceivedOffsiteSourcesAmount();
            Integer rhsReceivedOffsiteSourcesAmount;
            rhsReceivedOffsiteSourcesAmount = that.getReceivedOffsiteSourcesAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "receivedOffsiteSourcesAmount", lhsReceivedOffsiteSourcesAmount), LocatorUtils.property(thatLocator, "receivedOffsiteSourcesAmount", rhsReceivedOffsiteSourcesAmount), lhsReceivedOffsiteSourcesAmount, rhsReceivedOffsiteSourcesAmount)) {
                return false;
            }
        }
        {
            Integer lhsTransferredAmount;
            lhsTransferredAmount = this.getTransferredAmount();
            Integer rhsTransferredAmount;
            rhsTransferredAmount = that.getTransferredAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "transferredAmount", lhsTransferredAmount), LocatorUtils.property(thatLocator, "transferredAmount", rhsTransferredAmount), lhsTransferredAmount, rhsTransferredAmount)) {
                return false;
            }
        }
        {
            Integer lhsDisposedOutOfStateAmount;
            lhsDisposedOutOfStateAmount = this.getDisposedOutOfStateAmount();
            Integer rhsDisposedOutOfStateAmount;
            rhsDisposedOutOfStateAmount = that.getDisposedOutOfStateAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "disposedOutOfStateAmount", lhsDisposedOutOfStateAmount), LocatorUtils.property(thatLocator, "disposedOutOfStateAmount", rhsDisposedOutOfStateAmount), lhsDisposedOutOfStateAmount, rhsDisposedOutOfStateAmount)) {
                return false;
            }
        }
        {
            Integer lhsBeneficiallyUsedOutOfStateAmount;
            lhsBeneficiallyUsedOutOfStateAmount = this.getBeneficiallyUsedOutOfStateAmount();
            Integer rhsBeneficiallyUsedOutOfStateAmount;
            rhsBeneficiallyUsedOutOfStateAmount = that.getBeneficiallyUsedOutOfStateAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "beneficiallyUsedOutOfStateAmount", lhsBeneficiallyUsedOutOfStateAmount), LocatorUtils.property(thatLocator, "beneficiallyUsedOutOfStateAmount", rhsBeneficiallyUsedOutOfStateAmount), lhsBeneficiallyUsedOutOfStateAmount, rhsBeneficiallyUsedOutOfStateAmount)) {
                return false;
            }
        }
        {
            Integer lhsManagedOtherMethodsOutOfStateAmount;
            lhsManagedOtherMethodsOutOfStateAmount = this.getManagedOtherMethodsOutOfStateAmount();
            Integer rhsManagedOtherMethodsOutOfStateAmount;
            rhsManagedOtherMethodsOutOfStateAmount = that.getManagedOtherMethodsOutOfStateAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "managedOtherMethodsOutOfStateAmount", lhsManagedOtherMethodsOutOfStateAmount), LocatorUtils.property(thatLocator, "managedOtherMethodsOutOfStateAmount", rhsManagedOtherMethodsOutOfStateAmount), lhsManagedOtherMethodsOutOfStateAmount, rhsManagedOtherMethodsOutOfStateAmount)) {
                return false;
            }
        }
        {
            Integer lhsTotalRemovedAmount;
            lhsTotalRemovedAmount = this.getTotalRemovedAmount();
            Integer rhsTotalRemovedAmount;
            rhsTotalRemovedAmount = that.getTotalRemovedAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "totalRemovedAmount", lhsTotalRemovedAmount), LocatorUtils.property(thatLocator, "totalRemovedAmount", rhsTotalRemovedAmount), lhsTotalRemovedAmount, rhsTotalRemovedAmount)) {
                return false;
            }
        }
        {
            Integer lhsAnnualDrySludgeProductionNumber;
            lhsAnnualDrySludgeProductionNumber = this.getAnnualDrySludgeProductionNumber();
            Integer rhsAnnualDrySludgeProductionNumber;
            rhsAnnualDrySludgeProductionNumber = that.getAnnualDrySludgeProductionNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "annualDrySludgeProductionNumber", lhsAnnualDrySludgeProductionNumber), LocatorUtils.property(thatLocator, "annualDrySludgeProductionNumber", rhsAnnualDrySludgeProductionNumber), lhsAnnualDrySludgeProductionNumber, rhsAnnualDrySludgeProductionNumber)) {
                return false;
            }
        }
        {
            BiosolidsPermitContact lhsBiosolidsPermitContact;
            lhsBiosolidsPermitContact = this.getBiosolidsPermitContact();
            BiosolidsPermitContact rhsBiosolidsPermitContact;
            rhsBiosolidsPermitContact = that.getBiosolidsPermitContact();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "biosolidsPermitContact", lhsBiosolidsPermitContact), LocatorUtils.property(thatLocator, "biosolidsPermitContact", rhsBiosolidsPermitContact), lhsBiosolidsPermitContact, rhsBiosolidsPermitContact)) {
                return false;
            }
        }
        {
            BiosolidsPermitAddress lhsBiosolidsPermitAddress;
            lhsBiosolidsPermitAddress = this.getBiosolidsPermitAddress();
            BiosolidsPermitAddress rhsBiosolidsPermitAddress;
            rhsBiosolidsPermitAddress = that.getBiosolidsPermitAddress();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "biosolidsPermitAddress", lhsBiosolidsPermitAddress), LocatorUtils.property(thatLocator, "biosolidsPermitAddress", rhsBiosolidsPermitAddress), lhsBiosolidsPermitAddress, rhsBiosolidsPermitAddress)) {
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
            List<String> theBiosolidsTypeCode;
            theBiosolidsTypeCode = (this.isSetBiosolidsTypeCode()?this.getBiosolidsTypeCode():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "biosolidsTypeCode", theBiosolidsTypeCode), currentHashCode, theBiosolidsTypeCode);
        }
        {
            List<String> theBiosolidsEndUseDisposalTypeCode;
            theBiosolidsEndUseDisposalTypeCode = (this.isSetBiosolidsEndUseDisposalTypeCode()?this.getBiosolidsEndUseDisposalTypeCode():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "biosolidsEndUseDisposalTypeCode", theBiosolidsEndUseDisposalTypeCode), currentHashCode, theBiosolidsEndUseDisposalTypeCode);
        }
        {
            Integer theEQProductDistributedMarketedAmount;
            theEQProductDistributedMarketedAmount = this.getEQProductDistributedMarketedAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "eqProductDistributedMarketedAmount", theEQProductDistributedMarketedAmount), currentHashCode, theEQProductDistributedMarketedAmount);
        }
        {
            Integer theLandAppliedAmount;
            theLandAppliedAmount = this.getLandAppliedAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "landAppliedAmount", theLandAppliedAmount), currentHashCode, theLandAppliedAmount);
        }
        {
            Integer theIncineratedAmount;
            theIncineratedAmount = this.getIncineratedAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "incineratedAmount", theIncineratedAmount), currentHashCode, theIncineratedAmount);
        }
        {
            Integer theCodisposedInMSWLandfillAmount;
            theCodisposedInMSWLandfillAmount = this.getCodisposedInMSWLandfillAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "codisposedInMSWLandfillAmount", theCodisposedInMSWLandfillAmount), currentHashCode, theCodisposedInMSWLandfillAmount);
        }
        {
            Integer theSurfaceDisposalAmount;
            theSurfaceDisposalAmount = this.getSurfaceDisposalAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "surfaceDisposalAmount", theSurfaceDisposalAmount), currentHashCode, theSurfaceDisposalAmount);
        }
        {
            Integer theManagedOtherMethodsAmount;
            theManagedOtherMethodsAmount = this.getManagedOtherMethodsAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "managedOtherMethodsAmount", theManagedOtherMethodsAmount), currentHashCode, theManagedOtherMethodsAmount);
        }
        {
            Integer theReceivedOffsiteSourcesAmount;
            theReceivedOffsiteSourcesAmount = this.getReceivedOffsiteSourcesAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "receivedOffsiteSourcesAmount", theReceivedOffsiteSourcesAmount), currentHashCode, theReceivedOffsiteSourcesAmount);
        }
        {
            Integer theTransferredAmount;
            theTransferredAmount = this.getTransferredAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "transferredAmount", theTransferredAmount), currentHashCode, theTransferredAmount);
        }
        {
            Integer theDisposedOutOfStateAmount;
            theDisposedOutOfStateAmount = this.getDisposedOutOfStateAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "disposedOutOfStateAmount", theDisposedOutOfStateAmount), currentHashCode, theDisposedOutOfStateAmount);
        }
        {
            Integer theBeneficiallyUsedOutOfStateAmount;
            theBeneficiallyUsedOutOfStateAmount = this.getBeneficiallyUsedOutOfStateAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "beneficiallyUsedOutOfStateAmount", theBeneficiallyUsedOutOfStateAmount), currentHashCode, theBeneficiallyUsedOutOfStateAmount);
        }
        {
            Integer theManagedOtherMethodsOutOfStateAmount;
            theManagedOtherMethodsOutOfStateAmount = this.getManagedOtherMethodsOutOfStateAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "managedOtherMethodsOutOfStateAmount", theManagedOtherMethodsOutOfStateAmount), currentHashCode, theManagedOtherMethodsOutOfStateAmount);
        }
        {
            Integer theTotalRemovedAmount;
            theTotalRemovedAmount = this.getTotalRemovedAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "totalRemovedAmount", theTotalRemovedAmount), currentHashCode, theTotalRemovedAmount);
        }
        {
            Integer theAnnualDrySludgeProductionNumber;
            theAnnualDrySludgeProductionNumber = this.getAnnualDrySludgeProductionNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "annualDrySludgeProductionNumber", theAnnualDrySludgeProductionNumber), currentHashCode, theAnnualDrySludgeProductionNumber);
        }
        {
            BiosolidsPermitContact theBiosolidsPermitContact;
            theBiosolidsPermitContact = this.getBiosolidsPermitContact();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "biosolidsPermitContact", theBiosolidsPermitContact), currentHashCode, theBiosolidsPermitContact);
        }
        {
            BiosolidsPermitAddress theBiosolidsPermitAddress;
            theBiosolidsPermitAddress = this.getBiosolidsPermitAddress();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "biosolidsPermitAddress", theBiosolidsPermitAddress), currentHashCode, theBiosolidsPermitAddress);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
