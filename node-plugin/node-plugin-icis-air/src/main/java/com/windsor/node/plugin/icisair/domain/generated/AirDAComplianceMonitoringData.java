//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.09.02 at 11:05:46 AM PDT 
//


package com.windsor.node.plugin.icisair.domain.generated;

import java.io.Serializable;
import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.PostLoad;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;
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
 * <p>Java class for AirDAComplianceMonitoringData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirDAComplianceMonitoringData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.exchangenetwork.net/schema/icis/5}TransactionHeader"/>
 *         &lt;element ref="{http://www.exchangenetwork.net/schema/icis/5}AirDAComplianceMonitoring"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirDAComplianceMonitoringData", propOrder = {
    "transactionHeader",
    "airDAComplianceMonitoring"
})
@Entity(name = "AirDAComplianceMonitoringData")
@Table(name = "ICA_DA_CMPL_MON")
@Inheritance(strategy = InheritanceType.JOINED)
public class AirDAComplianceMonitoringData
    implements Serializable, Equals, HashCode
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "TransactionHeader", required = true)
    protected TransactionHeader transactionHeader;
    @XmlElement(name = "AirDAComplianceMonitoring", required = true)
    protected AirDAComplianceMonitoring airDAComplianceMonitoring;
    @XmlTransient
    protected String dbid;

    @PostLoad
    public void handlePostLoad() {
        if (airDAComplianceMonitoring != null && airDAComplianceMonitoring.getInspectionContact() != null) {
            final List<?> list = airDAComplianceMonitoring.getInspectionContact().getContact();
            if (list == null || list.isEmpty()) {
                airDAComplianceMonitoring.setInspectionContact(null);
            }
        }
    }

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
     * Gets the value of the airDAComplianceMonitoring property.
     * 
     * @return
     *     possible object is
     *     {@link AirDAComplianceMonitoring }
     *     
     */
    @Embedded
    public AirDAComplianceMonitoring getAirDAComplianceMonitoring() {
        return airDAComplianceMonitoring;
    }

    /**
     * Sets the value of the airDAComplianceMonitoring property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirDAComplianceMonitoring }
     *     
     */
    public void setAirDAComplianceMonitoring(AirDAComplianceMonitoring value) {
        this.airDAComplianceMonitoring = value;
    }

    @Transient
    public boolean isSetAirDAComplianceMonitoring() {
        return (this.airDAComplianceMonitoring!= null);
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
    @Column(name = "ICA_DA_CMPL_MON_ID")
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
        if (!(object instanceof AirDAComplianceMonitoringData)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final AirDAComplianceMonitoringData that = ((AirDAComplianceMonitoringData) object);
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
            AirDAComplianceMonitoring lhsAirDAComplianceMonitoring;
            lhsAirDAComplianceMonitoring = this.getAirDAComplianceMonitoring();
            AirDAComplianceMonitoring rhsAirDAComplianceMonitoring;
            rhsAirDAComplianceMonitoring = that.getAirDAComplianceMonitoring();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "airDAComplianceMonitoring", lhsAirDAComplianceMonitoring), LocatorUtils.property(thatLocator, "airDAComplianceMonitoring", rhsAirDAComplianceMonitoring), lhsAirDAComplianceMonitoring, rhsAirDAComplianceMonitoring)) {
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
            AirDAComplianceMonitoring theAirDAComplianceMonitoring;
            theAirDAComplianceMonitoring = this.getAirDAComplianceMonitoring();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "airDAComplianceMonitoring", theAirDAComplianceMonitoring), currentHashCode, theAirDAComplianceMonitoring);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
