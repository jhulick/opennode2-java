//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.12.07 at 11:39:25 AM EST 
//


package com.windsor.node.plugin.icisnpdes.generated;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.windsor.node.plugin.common.xml.bind.annotation.adapters.DateNoTimeZoneAdapter;
import com.windsor.node.plugin.common.xml.bind.annotation.adapters.IntegerAdapter;
import com.windsor.node.plugin.common.xml.bind.annotation.adapters.StringAdapter;
import com.windsor.node.plugin.icisnpdes.domain.AbstractScheduleEventViolationKeyElements;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for ComplianceScheduleEventViolationKeyElements complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ComplianceScheduleEventViolationKeyElements">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.exchangenetwork.net/schema/icis/5}ComplianceScheduleEventViolationKeyElementsGroup"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComplianceScheduleEventViolationKeyElements", propOrder = {
    "enforcementActionIdentifier",
    "finalOrderIdentifier",
    "permitIdentifier",
    "complianceScheduleNumber",
    "scheduleEventCode",
    "scheduleDate",
    "scheduleViolationCode"
})
@Entity(name = "ComplianceScheduleEventViolationKeyElements")
@Table(name = "ICS_CMPL_SCHD_EVT_VIOL_ELEM")
@Inheritance(strategy = InheritanceType.JOINED)
public class ComplianceScheduleEventViolationKeyElements
    extends AbstractScheduleEventViolationKeyElements
    implements Serializable, Equals, HashCode
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "EnforcementActionIdentifier", required = true)
    protected String enforcementActionIdentifier;
    @XmlElement(name = "FinalOrderIdentifier", required = true, type = String.class)
    @XmlJavaTypeAdapter(IntegerAdapter.class)
    protected Integer finalOrderIdentifier;
    @XmlElement(name = "PermitIdentifier", required = true)
    protected String permitIdentifier;
    @XmlElement(name = "ComplianceScheduleNumber")
    protected int complianceScheduleNumber;
    @XmlElement(name = "ScheduleEventCode", required = true)
    protected String scheduleEventCode;
    @XmlElement(name = "ScheduleDate", required = true, type = String.class)
    @XmlJavaTypeAdapter(DateNoTimeZoneAdapter.class)
    @XmlSchemaType(name = "date")
    protected Date scheduleDate;
    @XmlElement(name = "ScheduleViolationCode", required = true)
    @XmlJavaTypeAdapter(StringAdapter.class)
    protected String scheduleViolationCode;
    @XmlTransient
    protected String dbid;

    /**
     * Gets the value of the enforcementActionIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "ENFRC_ACTN_IDENT", length = 20)
    public String getEnforcementActionIdentifier() {
        return enforcementActionIdentifier;
    }

    /**
     * Sets the value of the enforcementActionIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnforcementActionIdentifier(String value) {
        this.enforcementActionIdentifier = value;
    }

    @Transient
    public boolean isSetEnforcementActionIdentifier() {
        return (this.enforcementActionIdentifier!= null);
    }

    /**
     * Gets the value of the finalOrderIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "FINAL_ORDER_IDENT", scale = 0)
    public Integer getFinalOrderIdentifier() {
        return finalOrderIdentifier;
    }

    /**
     * Sets the value of the finalOrderIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinalOrderIdentifier(Integer value) {
        this.finalOrderIdentifier = value;
    }

    @Transient
    public boolean isSetFinalOrderIdentifier() {
        return (this.finalOrderIdentifier!= null);
    }

    /**
     * Gets the value of the permitIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "PRMT_IDENT", columnDefinition = "char(9)", length = 9)
    public String getPermitIdentifier() {
        return permitIdentifier;
    }

    /**
     * Sets the value of the permitIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPermitIdentifier(String value) {
        this.permitIdentifier = value;
    }

    @Transient
    public boolean isSetPermitIdentifier() {
        return (this.permitIdentifier!= null);
    }

    /**
     * Gets the value of the complianceScheduleNumber property.
     * 
     */
    @Basic
    @Column(name = "CMPL_SCHD_NUM", precision = 20, scale = 0)
    public int getComplianceScheduleNumber() {
        return complianceScheduleNumber;
    }

    /**
     * Sets the value of the complianceScheduleNumber property.
     * 
     */
    public void setComplianceScheduleNumber(int value) {
        this.complianceScheduleNumber = value;
    }

    @Transient
    public boolean isSetComplianceScheduleNumber() {
        return true;
    }

    /**
     * Gets the value of the scheduleEventCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "SCHD_EVT_CODE", length = 5)
    public String getScheduleEventCode() {
        return scheduleEventCode;
    }

    /**
     * Sets the value of the scheduleEventCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScheduleEventCode(String value) {
        this.scheduleEventCode = value;
    }

    @Transient
    public boolean isSetScheduleEventCode() {
        return (this.scheduleEventCode!= null);
    }

    /**
     * Gets the value of the scheduleDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "SCHD_DATE")
    @Temporal(TemporalType.DATE)
    public Date getScheduleDate() {
        return scheduleDate;
    }

    /**
     * Sets the value of the scheduleDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScheduleDate(Date value) {
        this.scheduleDate = value;
    }

    @Transient
    public boolean isSetScheduleDate() {
        return (this.scheduleDate!= null);
    }

    /**
     * Gets the value of the scheduleViolationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "SCHD_VIOL_CODE", length = 255)
    public String getScheduleViolationCode() {
        return scheduleViolationCode;
    }

    /**
     * Sets the value of the scheduleViolationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScheduleViolationCode(String value) {
        this.scheduleViolationCode = value;
    }

    @Transient
    public boolean isSetScheduleViolationCode() {
        return (this.scheduleViolationCode!= null);
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
    @Column(name = "ICS_CMPL_SCHD_EVT_VIOL_ELEM_ID")
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
        if (!(object instanceof ComplianceScheduleEventViolationKeyElements)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ComplianceScheduleEventViolationKeyElements that = ((ComplianceScheduleEventViolationKeyElements) object);
        {
            String lhsEnforcementActionIdentifier;
            lhsEnforcementActionIdentifier = this.getEnforcementActionIdentifier();
            String rhsEnforcementActionIdentifier;
            rhsEnforcementActionIdentifier = that.getEnforcementActionIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "enforcementActionIdentifier", lhsEnforcementActionIdentifier), LocatorUtils.property(thatLocator, "enforcementActionIdentifier", rhsEnforcementActionIdentifier), lhsEnforcementActionIdentifier, rhsEnforcementActionIdentifier)) {
                return false;
            }
        }
        {
            Integer lhsFinalOrderIdentifier;
            lhsFinalOrderIdentifier = this.getFinalOrderIdentifier();
            Integer rhsFinalOrderIdentifier;
            rhsFinalOrderIdentifier = that.getFinalOrderIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "finalOrderIdentifier", lhsFinalOrderIdentifier), LocatorUtils.property(thatLocator, "finalOrderIdentifier", rhsFinalOrderIdentifier), lhsFinalOrderIdentifier, rhsFinalOrderIdentifier)) {
                return false;
            }
        }
        {
            String lhsPermitIdentifier;
            lhsPermitIdentifier = this.getPermitIdentifier();
            String rhsPermitIdentifier;
            rhsPermitIdentifier = that.getPermitIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "permitIdentifier", lhsPermitIdentifier), LocatorUtils.property(thatLocator, "permitIdentifier", rhsPermitIdentifier), lhsPermitIdentifier, rhsPermitIdentifier)) {
                return false;
            }
        }
        {
            int lhsComplianceScheduleNumber;
            lhsComplianceScheduleNumber = (this.isSetComplianceScheduleNumber()?this.getComplianceScheduleNumber(): 0);
            int rhsComplianceScheduleNumber;
            rhsComplianceScheduleNumber = (that.isSetComplianceScheduleNumber()?that.getComplianceScheduleNumber(): 0);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "complianceScheduleNumber", lhsComplianceScheduleNumber), LocatorUtils.property(thatLocator, "complianceScheduleNumber", rhsComplianceScheduleNumber), lhsComplianceScheduleNumber, rhsComplianceScheduleNumber)) {
                return false;
            }
        }
        {
            String lhsScheduleEventCode;
            lhsScheduleEventCode = this.getScheduleEventCode();
            String rhsScheduleEventCode;
            rhsScheduleEventCode = that.getScheduleEventCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "scheduleEventCode", lhsScheduleEventCode), LocatorUtils.property(thatLocator, "scheduleEventCode", rhsScheduleEventCode), lhsScheduleEventCode, rhsScheduleEventCode)) {
                return false;
            }
        }
        {
            Date lhsScheduleDate;
            lhsScheduleDate = this.getScheduleDate();
            Date rhsScheduleDate;
            rhsScheduleDate = that.getScheduleDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "scheduleDate", lhsScheduleDate), LocatorUtils.property(thatLocator, "scheduleDate", rhsScheduleDate), lhsScheduleDate, rhsScheduleDate)) {
                return false;
            }
        }
        {
            String lhsScheduleViolationCode;
            lhsScheduleViolationCode = this.getScheduleViolationCode();
            String rhsScheduleViolationCode;
            rhsScheduleViolationCode = that.getScheduleViolationCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "scheduleViolationCode", lhsScheduleViolationCode), LocatorUtils.property(thatLocator, "scheduleViolationCode", rhsScheduleViolationCode), lhsScheduleViolationCode, rhsScheduleViolationCode)) {
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
            String theEnforcementActionIdentifier;
            theEnforcementActionIdentifier = this.getEnforcementActionIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "enforcementActionIdentifier", theEnforcementActionIdentifier), currentHashCode, theEnforcementActionIdentifier);
        }
        {
            Integer theFinalOrderIdentifier;
            theFinalOrderIdentifier = this.getFinalOrderIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "finalOrderIdentifier", theFinalOrderIdentifier), currentHashCode, theFinalOrderIdentifier);
        }
        {
            String thePermitIdentifier;
            thePermitIdentifier = this.getPermitIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "permitIdentifier", thePermitIdentifier), currentHashCode, thePermitIdentifier);
        }
        {
            int theComplianceScheduleNumber;
            theComplianceScheduleNumber = (this.isSetComplianceScheduleNumber()?this.getComplianceScheduleNumber(): 0);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "complianceScheduleNumber", theComplianceScheduleNumber), currentHashCode, theComplianceScheduleNumber);
        }
        {
            String theScheduleEventCode;
            theScheduleEventCode = this.getScheduleEventCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "scheduleEventCode", theScheduleEventCode), currentHashCode, theScheduleEventCode);
        }
        {
            Date theScheduleDate;
            theScheduleDate = this.getScheduleDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "scheduleDate", theScheduleDate), currentHashCode, theScheduleDate);
        }
        {
            String theScheduleViolationCode;
            theScheduleViolationCode = this.getScheduleViolationCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "scheduleViolationCode", theScheduleViolationCode), currentHashCode, theScheduleViolationCode);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
