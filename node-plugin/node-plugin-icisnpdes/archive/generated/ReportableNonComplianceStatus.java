//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.12.07 at 11:39:25 AM EST 
//


package com.windsor.node.plugin.icisnpdes.generated;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
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
 * <p>Java class for ReportableNonComplianceStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReportableNonComplianceStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.exchangenetwork.net/schema/icis/5}ReportableNonComplianceStatusGroup"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportableNonComplianceStatus", propOrder = {
    "reportableNonComplianceStatusCodeYear",
    "reportableNonComplianceStatusCodeQuarter",
    "reportableNonComplianceManualStatusCode"
})
@Entity(name = "ReportableNonComplianceStatus")
@Table(name = "ICS_REP_NON_CMPL_STAT")
@Inheritance(strategy = InheritanceType.JOINED)
public class ReportableNonComplianceStatus
    implements Serializable, Equals, HashCode
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ReportableNonComplianceStatusCodeYear")
    protected int reportableNonComplianceStatusCodeYear;
    @XmlElement(name = "ReportableNonComplianceStatusCodeQuarter")
    protected int reportableNonComplianceStatusCodeQuarter;
    @XmlElement(name = "ReportableNonComplianceManualStatusCode", required = true)
    protected String reportableNonComplianceManualStatusCode;
    @XmlTransient
    protected String dbid;

    /**
     * Gets the value of the reportableNonComplianceStatusCodeYear property.
     * 
     */
    @Basic
    @Column(name = "REP_NON_CMPL_STAT_CODE_YEAR", precision = 20, scale = 0)
    public int getReportableNonComplianceStatusCodeYear() {
        return reportableNonComplianceStatusCodeYear;
    }

    /**
     * Sets the value of the reportableNonComplianceStatusCodeYear property.
     * 
     */
    public void setReportableNonComplianceStatusCodeYear(int value) {
        this.reportableNonComplianceStatusCodeYear = value;
    }

    @Transient
    public boolean isSetReportableNonComplianceStatusCodeYear() {
        return true;
    }

    /**
     * Gets the value of the reportableNonComplianceStatusCodeQuarter property.
     * 
     */
    @Basic
    @Column(name = "REP_NON_CMPL_STAT_CODE_QUARTER", precision = 20, scale = 0)
    public int getReportableNonComplianceStatusCodeQuarter() {
        return reportableNonComplianceStatusCodeQuarter;
    }

    /**
     * Sets the value of the reportableNonComplianceStatusCodeQuarter property.
     * 
     */
    public void setReportableNonComplianceStatusCodeQuarter(int value) {
        this.reportableNonComplianceStatusCodeQuarter = value;
    }

    @Transient
    public boolean isSetReportableNonComplianceStatusCodeQuarter() {
        return true;
    }

    /**
     * Gets the value of the reportableNonComplianceManualStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "REP_NON_CMPL_MANUAL_STAT_CODE", length = 3)
    public String getReportableNonComplianceManualStatusCode() {
        return reportableNonComplianceManualStatusCode;
    }

    /**
     * Sets the value of the reportableNonComplianceManualStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportableNonComplianceManualStatusCode(String value) {
        this.reportableNonComplianceManualStatusCode = value;
    }

    @Transient
    public boolean isSetReportableNonComplianceManualStatusCode() {
        return (this.reportableNonComplianceManualStatusCode!= null);
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
    @Column(name = "ICS_REP_NON_CMPL_STAT_ID")
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
        if (!(object instanceof ReportableNonComplianceStatus)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ReportableNonComplianceStatus that = ((ReportableNonComplianceStatus) object);
        {
            int lhsReportableNonComplianceStatusCodeYear;
            lhsReportableNonComplianceStatusCodeYear = (this.isSetReportableNonComplianceStatusCodeYear()?this.getReportableNonComplianceStatusCodeYear(): 0);
            int rhsReportableNonComplianceStatusCodeYear;
            rhsReportableNonComplianceStatusCodeYear = (that.isSetReportableNonComplianceStatusCodeYear()?that.getReportableNonComplianceStatusCodeYear(): 0);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "reportableNonComplianceStatusCodeYear", lhsReportableNonComplianceStatusCodeYear), LocatorUtils.property(thatLocator, "reportableNonComplianceStatusCodeYear", rhsReportableNonComplianceStatusCodeYear), lhsReportableNonComplianceStatusCodeYear, rhsReportableNonComplianceStatusCodeYear)) {
                return false;
            }
        }
        {
            int lhsReportableNonComplianceStatusCodeQuarter;
            lhsReportableNonComplianceStatusCodeQuarter = (this.isSetReportableNonComplianceStatusCodeQuarter()?this.getReportableNonComplianceStatusCodeQuarter(): 0);
            int rhsReportableNonComplianceStatusCodeQuarter;
            rhsReportableNonComplianceStatusCodeQuarter = (that.isSetReportableNonComplianceStatusCodeQuarter()?that.getReportableNonComplianceStatusCodeQuarter(): 0);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "reportableNonComplianceStatusCodeQuarter", lhsReportableNonComplianceStatusCodeQuarter), LocatorUtils.property(thatLocator, "reportableNonComplianceStatusCodeQuarter", rhsReportableNonComplianceStatusCodeQuarter), lhsReportableNonComplianceStatusCodeQuarter, rhsReportableNonComplianceStatusCodeQuarter)) {
                return false;
            }
        }
        {
            String lhsReportableNonComplianceManualStatusCode;
            lhsReportableNonComplianceManualStatusCode = this.getReportableNonComplianceManualStatusCode();
            String rhsReportableNonComplianceManualStatusCode;
            rhsReportableNonComplianceManualStatusCode = that.getReportableNonComplianceManualStatusCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "reportableNonComplianceManualStatusCode", lhsReportableNonComplianceManualStatusCode), LocatorUtils.property(thatLocator, "reportableNonComplianceManualStatusCode", rhsReportableNonComplianceManualStatusCode), lhsReportableNonComplianceManualStatusCode, rhsReportableNonComplianceManualStatusCode)) {
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
            int theReportableNonComplianceStatusCodeYear;
            theReportableNonComplianceStatusCodeYear = (this.isSetReportableNonComplianceStatusCodeYear()?this.getReportableNonComplianceStatusCodeYear(): 0);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "reportableNonComplianceStatusCodeYear", theReportableNonComplianceStatusCodeYear), currentHashCode, theReportableNonComplianceStatusCodeYear);
        }
        {
            int theReportableNonComplianceStatusCodeQuarter;
            theReportableNonComplianceStatusCodeQuarter = (this.isSetReportableNonComplianceStatusCodeQuarter()?this.getReportableNonComplianceStatusCodeQuarter(): 0);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "reportableNonComplianceStatusCodeQuarter", theReportableNonComplianceStatusCodeQuarter), currentHashCode, theReportableNonComplianceStatusCodeQuarter);
        }
        {
            String theReportableNonComplianceManualStatusCode;
            theReportableNonComplianceManualStatusCode = this.getReportableNonComplianceManualStatusCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "reportableNonComplianceManualStatusCode", theReportableNonComplianceManualStatusCode), currentHashCode, theReportableNonComplianceManualStatusCode);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
