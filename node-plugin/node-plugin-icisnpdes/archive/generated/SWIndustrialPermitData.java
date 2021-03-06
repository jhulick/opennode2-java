//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.12.07 at 11:39:25 AM EST 
//


package com.windsor.node.plugin.icisnpdes.generated;

import java.io.Serializable;
import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import com.windsor.node.plugin.icisnpdes.domain.AbstractSWIndustrialPermitData;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for SWIndustrialPermitData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SWIndustrialPermitData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.exchangenetwork.net/schema/icis/5}TransactionHeader"/>
 *         &lt;element ref="{http://www.exchangenetwork.net/schema/icis/5}SWIndustrialPermit"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SWIndustrialPermitData", propOrder = {
    "transactionHeader",
    "swIndustrialPermit"
})
@Entity(name = "SWIndustrialPermitData")
@Table(name = "ICS_SW_INDST_PRMT")
@Inheritance(strategy = InheritanceType.JOINED)
public class SWIndustrialPermitData
    extends AbstractSWIndustrialPermitData
    implements Serializable, Equals, HashCode
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "TransactionHeader", required = true)
    protected TransactionHeader transactionHeader;
    @XmlElement(name = "SWIndustrialPermit", required = true)
    protected SWIndustrialPermit swIndustrialPermit;
    @XmlTransient
    protected String dbid;

    /**
     * Gets the value of the transactionHeader property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionHeader }
     *     
     */
    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "transactionType", column = @Column(name = "TRANSACTION_TYPE", columnDefinition = "char(1)", length = 1)),
        @AttributeOverride(name = "transactionTimestamp", column = @Column(name = "TRANSACTION_TIMESTAMP"))
    })
    public TransactionHeader getTransactionHeader() {
        return transactionHeader;
    }

    /**
     * Sets the value of the transactionHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionHeader }
     *     
     */
    public void setTransactionHeader(TransactionHeader value) {
        this.transactionHeader = value;
    }

    @Transient
    public boolean isSetTransactionHeader() {
        return (this.transactionHeader!= null);
    }

    /**
     * Gets the value of the swIndustrialPermit property.
     * 
     * @return
     *     possible object is
     *     {@link SWIndustrialPermit }
     *     
     */
    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "stateWaterBodyName", column = @Column(name = "ST_WTR_BODY_NAME", length = 50)),
        @AttributeOverride(name = "receivingMS4Name", column = @Column(name = "RCVG_MS_4_NAME", length = 50)),
        @AttributeOverride(name = "impairedWaterIndicator", column = @Column(name = "IMPAIRED_WTR_IND", columnDefinition = "char(1)", length = 1)),
        @AttributeOverride(name = "historicPropertyIndicator", column = @Column(name = "HIST_PROP_IND", columnDefinition = "char(1)", length = 1)),
        @AttributeOverride(name = "historicPropertyCriterionMetCode", column = @Column(name = "HIST_PROP_CRIT_MET_CODE", length = 3)),
        @AttributeOverride(name = "speciesCriticalHabitatIndicator", column = @Column(name = "SPECIES_CRIT_HABITAT_IND", columnDefinition = "char(1)", length = 1)),
        @AttributeOverride(name = "speciesCriterionMetCode", column = @Column(name = "SPECIES_CRIT_MET_CODE", length = 3)),
        @AttributeOverride(name = "industrialActivitySize", column = @Column(name = "INDST_ACTY_SIZE", scale = 2)),
        @AttributeOverride(name = "webAddressURL", column = @Column(name = "WEB_ADDR_URL", length = 100)),
        @AttributeOverride(name = "activitiesExposedSWText", column = @Column(name = "ACTIVITIES_EXPOSED_SW_TXT", columnDefinition = "varchar(4000)", length = 4000)),
        @AttributeOverride(name = "associatedPollutantsText", column = @Column(name = "ASSC_POLLUTANTS_TXT", columnDefinition = "varchar(4000)", length = 4000)),
        @AttributeOverride(name = "controlMeasuresText", column = @Column(name = "CONTROL_MSR_TXT", columnDefinition = "varchar(4000)", length = 4000)),
        @AttributeOverride(name = "scheduleControlMeasuresText", column = @Column(name = "SCHD_CONTROL_MSR_TXT", columnDefinition = "varchar(4000)", length = 4000)),
        @AttributeOverride(name = "tierTwoIndicator", column = @Column(name = "TIER_TWO_IND", columnDefinition = "char(1)", length = 1)),
        @AttributeOverride(name = "tierThreeIndicator", column = @Column(name = "TIER_THREE_IND", columnDefinition = "char(1)", length = 1))
    })
    @AssociationOverrides({
        @AssociationOverride(name = "gpcfNoticeOfIntent", joinColumns = {
            @JoinColumn(name = "ICS_SW_INDST_PRMT_ID", referencedColumnName = "ICS_SW_INDST_PRMT_ID", insertable = false, updatable = false)
        }),
        @AssociationOverride(name = "gpcfNoticeOfTermination", joinColumns = {
            @JoinColumn(name = "ICS_SW_INDST_PRMT_ID", referencedColumnName = "ICS_SW_INDST_PRMT_ID", insertable = false, updatable = false)
        }),
        @AssociationOverride(name = "gpcfNoExposure", joinColumns = {
            @JoinColumn(name = "ICS_SW_INDST_PRMT_ID", referencedColumnName = "ICS_SW_INDST_PRMT_ID", insertable = false, updatable = false)
        }),
        @AssociationOverride(name = "stormWaterContact.contact", joinColumns = {
            @JoinColumn(name = "ICS_SW_INDST_PRMT_ID")
        }),
        @AssociationOverride(name = "stormWaterAddress.address", joinColumns = {
            @JoinColumn(name = "ICS_SW_INDST_PRMT_ID")
        })
    })
    public SWIndustrialPermit getSWIndustrialPermit() {
        return swIndustrialPermit;
    }

    /**
     * Sets the value of the swIndustrialPermit property.
     * 
     * @param value
     *     allowed object is
     *     {@link SWIndustrialPermit }
     *     
     */
    public void setSWIndustrialPermit(SWIndustrialPermit value) {
        this.swIndustrialPermit = value;
    }

    @Transient
    public boolean isSetSWIndustrialPermit() {
        return (this.swIndustrialPermit!= null);
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
    @Column(name = "ICS_SW_INDST_PRMT_ID")
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
        if (!(object instanceof SWIndustrialPermitData)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SWIndustrialPermitData that = ((SWIndustrialPermitData) object);
        {
            TransactionHeader lhsTransactionHeader;
            lhsTransactionHeader = this.getTransactionHeader();
            TransactionHeader rhsTransactionHeader;
            rhsTransactionHeader = that.getTransactionHeader();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "transactionHeader", lhsTransactionHeader), LocatorUtils.property(thatLocator, "transactionHeader", rhsTransactionHeader), lhsTransactionHeader, rhsTransactionHeader)) {
                return false;
            }
        }
        {
            SWIndustrialPermit lhsSWIndustrialPermit;
            lhsSWIndustrialPermit = this.getSWIndustrialPermit();
            SWIndustrialPermit rhsSWIndustrialPermit;
            rhsSWIndustrialPermit = that.getSWIndustrialPermit();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "swIndustrialPermit", lhsSWIndustrialPermit), LocatorUtils.property(thatLocator, "swIndustrialPermit", rhsSWIndustrialPermit), lhsSWIndustrialPermit, rhsSWIndustrialPermit)) {
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
            TransactionHeader theTransactionHeader;
            theTransactionHeader = this.getTransactionHeader();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "transactionHeader", theTransactionHeader), currentHashCode, theTransactionHeader);
        }
        {
            SWIndustrialPermit theSWIndustrialPermit;
            theSWIndustrialPermit = this.getSWIndustrialPermit();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "swIndustrialPermit", theSWIndustrialPermit), currentHashCode, theSWIndustrialPermit);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
