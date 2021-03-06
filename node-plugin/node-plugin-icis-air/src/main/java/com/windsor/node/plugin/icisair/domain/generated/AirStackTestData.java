//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.09.02 at 11:05:46 AM PDT 
//


package com.windsor.node.plugin.icisair.domain.generated;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
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
 * <p>Java class for AirStackTestData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirStackTestData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.exchangenetwork.net/schema/icis/5}StackTestStatusCode"/>
 *         &lt;element ref="{http://www.exchangenetwork.net/schema/icis/5}StackTestConductorTypeCode"/>
 *         &lt;element ref="{http://www.exchangenetwork.net/schema/icis/5}StackIdentifier" minOccurs="0"/>
 *         &lt;element ref="{http://www.exchangenetwork.net/schema/icis/5}StackTestPurposeCode" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.exchangenetwork.net/schema/icis/5}OtherStackTestPurposeName" minOccurs="0"/>
 *         &lt;element ref="{http://www.exchangenetwork.net/schema/icis/5}StackTestObservedAgencyTypeCode" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.exchangenetwork.net/schema/icis/5}StackTestReportReceivedDate" minOccurs="0"/>
 *         &lt;element ref="{http://www.exchangenetwork.net/schema/icis/5}TestResultsReviewedDate" minOccurs="0"/>
 *         &lt;element ref="{http://www.exchangenetwork.net/schema/icis/5}TestResultsData" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirStackTestData", propOrder = {
    "stackTestStatusCode",
    "stackTestConductorTypeCode",
    "stackIdentifier",
    "stackTestPurposeCode",
    "otherStackTestPurposeName",
    "stackTestObservedAgencyTypeCode",
    "stackTestReportReceivedDate",
    "testResultsReviewedDate",
    "testResultsData"
})
@Entity(name = "AirStackTestData")
@Table(name = "ICA_STCK_TST")
@Inheritance(strategy = InheritanceType.JOINED)
public class AirStackTestData
    implements Serializable, Equals, HashCode
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "StackTestStatusCode", required = true)
    protected String stackTestStatusCode;
    @XmlElement(name = "StackTestConductorTypeCode", required = true)
    protected String stackTestConductorTypeCode;
    @XmlElement(name = "StackIdentifier")
    protected String stackIdentifier;
    @XmlElement(name = "StackTestPurposeCode")
    protected List<String> stackTestPurposeCode;
    @XmlElement(name = "OtherStackTestPurposeName")
    protected String otherStackTestPurposeName;
    @XmlElement(name = "StackTestObservedAgencyTypeCode")
    protected List<String> stackTestObservedAgencyTypeCode;
    @XmlElement(name = "StackTestReportReceivedDate", type = String.class)
    @XmlJavaTypeAdapter(DateNoTimeZoneAdapter.class)
    protected Date stackTestReportReceivedDate;
    @XmlElement(name = "TestResultsReviewedDate", type = String.class)
    @XmlJavaTypeAdapter(DateNoTimeZoneAdapter.class)
    protected Date testResultsReviewedDate;
    @XmlElement(name = "TestResultsData")
    protected List<TestResultsData> testResultsData;
    @XmlTransient
    protected String dbid;

    /**
     * Gets the value of the stackTestStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "STCK_TST_STAT_CODE", length = 3)
    public String getStackTestStatusCode() {
        return stackTestStatusCode;
    }

    /**
     * Sets the value of the stackTestStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStackTestStatusCode(String value) {
        this.stackTestStatusCode = value;
    }

    @Transient
    public boolean isSetStackTestStatusCode() {
        return (this.stackTestStatusCode!= null);
    }

    /**
     * Gets the value of the stackTestConductorTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "STCK_TST_CNDCTR_TYPE_CODE", length = 3)
    public String getStackTestConductorTypeCode() {
        return stackTestConductorTypeCode;
    }

    /**
     * Sets the value of the stackTestConductorTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStackTestConductorTypeCode(String value) {
        this.stackTestConductorTypeCode = value;
    }

    @Transient
    public boolean isSetStackTestConductorTypeCode() {
        return (this.stackTestConductorTypeCode!= null);
    }

    /**
     * Gets the value of the stackIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "STCK_IDENT", length = 100)
    public String getStackIdentifier() {
        return stackIdentifier;
    }

    /**
     * Sets the value of the stackIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStackIdentifier(String value) {
        this.stackIdentifier = value;
    }

    @Transient
    public boolean isSetStackIdentifier() {
        return (this.stackIdentifier!= null);
    }

    /**
     * Gets the value of the stackTestPurposeCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stackTestPurposeCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStackTestPurposeCode().add(newItem);
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
    @Column(name = "STCK_TST_PURPOSE_CODE", length = 3)
    @CollectionTable(name = "ICA_STCK_TST_PURPOSE", joinColumns = {
        @JoinColumn(name = "ICA_STCK_TST_ID")
    })
    public List<String> getStackTestPurposeCode() {
        if (stackTestPurposeCode == null) {
            stackTestPurposeCode = new ArrayList<String>();
        }
        return this.stackTestPurposeCode;
    }

    /**
     * 
     * 
     */
    public void setStackTestPurposeCode(List<String> stackTestPurposeCode) {
        this.stackTestPurposeCode = stackTestPurposeCode;
    }

    @Transient
    public boolean isSetStackTestPurposeCode() {
        return ((this.stackTestPurposeCode!= null)&&(!this.stackTestPurposeCode.isEmpty()));
    }

    public void unsetStackTestPurposeCode() {
        this.stackTestPurposeCode = null;
    }

    /**
     * Gets the value of the otherStackTestPurposeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "OTHR_STCK_TST_PURPOSE_NAME", length = 100)
    public String getOtherStackTestPurposeName() {
        return otherStackTestPurposeName;
    }

    /**
     * Sets the value of the otherStackTestPurposeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherStackTestPurposeName(String value) {
        this.otherStackTestPurposeName = value;
    }

    @Transient
    public boolean isSetOtherStackTestPurposeName() {
        return (this.otherStackTestPurposeName!= null);
    }

    /**
     * Gets the value of the stackTestObservedAgencyTypeCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stackTestObservedAgencyTypeCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStackTestObservedAgencyTypeCode().add(newItem);
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
    @Column(name = "STCK_TST_OBS_AGNCY_TYPE_CODE", length = 3)
    @CollectionTable(name = "ICA_STCK_TST_OBS_AGNCY_TYPE", joinColumns = {
        @JoinColumn(name = "ICA_STCK_TST_ID")
    })
    public List<String> getStackTestObservedAgencyTypeCode() {
        if (stackTestObservedAgencyTypeCode == null) {
            stackTestObservedAgencyTypeCode = new ArrayList<String>();
        }
        return this.stackTestObservedAgencyTypeCode;
    }

    /**
     * 
     * 
     */
    public void setStackTestObservedAgencyTypeCode(List<String> stackTestObservedAgencyTypeCode) {
        this.stackTestObservedAgencyTypeCode = stackTestObservedAgencyTypeCode;
    }

    @Transient
    public boolean isSetStackTestObservedAgencyTypeCode() {
        return ((this.stackTestObservedAgencyTypeCode!= null)&&(!this.stackTestObservedAgencyTypeCode.isEmpty()));
    }

    public void unsetStackTestObservedAgencyTypeCode() {
        this.stackTestObservedAgencyTypeCode = null;
    }

    /**
     * Gets the value of the stackTestReportReceivedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "STCK_TST_REP_RCVD_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getStackTestReportReceivedDate() {
        return stackTestReportReceivedDate;
    }

    /**
     * Sets the value of the stackTestReportReceivedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStackTestReportReceivedDate(Date value) {
        this.stackTestReportReceivedDate = value;
    }

    @Transient
    public boolean isSetStackTestReportReceivedDate() {
        return (this.stackTestReportReceivedDate!= null);
    }

    /**
     * Gets the value of the testResultsReviewedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "TST_RSLTS_REVIEWED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getTestResultsReviewedDate() {
        return testResultsReviewedDate;
    }

    /**
     * Sets the value of the testResultsReviewedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestResultsReviewedDate(Date value) {
        this.testResultsReviewedDate = value;
    }

    @Transient
    public boolean isSetTestResultsReviewedDate() {
        return (this.testResultsReviewedDate!= null);
    }

    /**
     * Gets the value of the testResultsData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the testResultsData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTestResultsData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TestResultsData }
     * 
     * 
     */
    @OneToMany(targetEntity = TestResultsData.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "ICA_STCK_TST_ID")
    public List<TestResultsData> getTestResultsData() {
        if (testResultsData == null) {
            testResultsData = new ArrayList<TestResultsData>();
        }
        return this.testResultsData;
    }

    /**
     * 
     * 
     */
    public void setTestResultsData(List<TestResultsData> testResultsData) {
        this.testResultsData = testResultsData;
    }

    @Transient
    public boolean isSetTestResultsData() {
        return ((this.testResultsData!= null)&&(!this.testResultsData.isEmpty()));
    }

    public void unsetTestResultsData() {
        this.testResultsData = null;
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
    @Column(name = "ICA_STCK_TST_ID")
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
        if (!(object instanceof AirStackTestData)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final AirStackTestData that = ((AirStackTestData) object);
        {
            String lhsStackTestStatusCode;
            lhsStackTestStatusCode = this.getStackTestStatusCode();
            String rhsStackTestStatusCode;
            rhsStackTestStatusCode = that.getStackTestStatusCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "stackTestStatusCode", lhsStackTestStatusCode), LocatorUtils.property(thatLocator, "stackTestStatusCode", rhsStackTestStatusCode), lhsStackTestStatusCode, rhsStackTestStatusCode)) {
                return false;
            }
        }
        {
            String lhsStackTestConductorTypeCode;
            lhsStackTestConductorTypeCode = this.getStackTestConductorTypeCode();
            String rhsStackTestConductorTypeCode;
            rhsStackTestConductorTypeCode = that.getStackTestConductorTypeCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "stackTestConductorTypeCode", lhsStackTestConductorTypeCode), LocatorUtils.property(thatLocator, "stackTestConductorTypeCode", rhsStackTestConductorTypeCode), lhsStackTestConductorTypeCode, rhsStackTestConductorTypeCode)) {
                return false;
            }
        }
        {
            String lhsStackIdentifier;
            lhsStackIdentifier = this.getStackIdentifier();
            String rhsStackIdentifier;
            rhsStackIdentifier = that.getStackIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "stackIdentifier", lhsStackIdentifier), LocatorUtils.property(thatLocator, "stackIdentifier", rhsStackIdentifier), lhsStackIdentifier, rhsStackIdentifier)) {
                return false;
            }
        }
        {
            List<String> lhsStackTestPurposeCode;
            lhsStackTestPurposeCode = (this.isSetStackTestPurposeCode()?this.getStackTestPurposeCode():null);
            List<String> rhsStackTestPurposeCode;
            rhsStackTestPurposeCode = (that.isSetStackTestPurposeCode()?that.getStackTestPurposeCode():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "stackTestPurposeCode", lhsStackTestPurposeCode), LocatorUtils.property(thatLocator, "stackTestPurposeCode", rhsStackTestPurposeCode), lhsStackTestPurposeCode, rhsStackTestPurposeCode)) {
                return false;
            }
        }
        {
            String lhsOtherStackTestPurposeName;
            lhsOtherStackTestPurposeName = this.getOtherStackTestPurposeName();
            String rhsOtherStackTestPurposeName;
            rhsOtherStackTestPurposeName = that.getOtherStackTestPurposeName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "otherStackTestPurposeName", lhsOtherStackTestPurposeName), LocatorUtils.property(thatLocator, "otherStackTestPurposeName", rhsOtherStackTestPurposeName), lhsOtherStackTestPurposeName, rhsOtherStackTestPurposeName)) {
                return false;
            }
        }
        {
            List<String> lhsStackTestObservedAgencyTypeCode;
            lhsStackTestObservedAgencyTypeCode = (this.isSetStackTestObservedAgencyTypeCode()?this.getStackTestObservedAgencyTypeCode():null);
            List<String> rhsStackTestObservedAgencyTypeCode;
            rhsStackTestObservedAgencyTypeCode = (that.isSetStackTestObservedAgencyTypeCode()?that.getStackTestObservedAgencyTypeCode():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "stackTestObservedAgencyTypeCode", lhsStackTestObservedAgencyTypeCode), LocatorUtils.property(thatLocator, "stackTestObservedAgencyTypeCode", rhsStackTestObservedAgencyTypeCode), lhsStackTestObservedAgencyTypeCode, rhsStackTestObservedAgencyTypeCode)) {
                return false;
            }
        }
        {
            Date lhsStackTestReportReceivedDate;
            lhsStackTestReportReceivedDate = this.getStackTestReportReceivedDate();
            Date rhsStackTestReportReceivedDate;
            rhsStackTestReportReceivedDate = that.getStackTestReportReceivedDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "stackTestReportReceivedDate", lhsStackTestReportReceivedDate), LocatorUtils.property(thatLocator, "stackTestReportReceivedDate", rhsStackTestReportReceivedDate), lhsStackTestReportReceivedDate, rhsStackTestReportReceivedDate)) {
                return false;
            }
        }
        {
            Date lhsTestResultsReviewedDate;
            lhsTestResultsReviewedDate = this.getTestResultsReviewedDate();
            Date rhsTestResultsReviewedDate;
            rhsTestResultsReviewedDate = that.getTestResultsReviewedDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "testResultsReviewedDate", lhsTestResultsReviewedDate), LocatorUtils.property(thatLocator, "testResultsReviewedDate", rhsTestResultsReviewedDate), lhsTestResultsReviewedDate, rhsTestResultsReviewedDate)) {
                return false;
            }
        }
        {
            List<TestResultsData> lhsTestResultsData;
            lhsTestResultsData = (this.isSetTestResultsData()?this.getTestResultsData():null);
            List<TestResultsData> rhsTestResultsData;
            rhsTestResultsData = (that.isSetTestResultsData()?that.getTestResultsData():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "testResultsData", lhsTestResultsData), LocatorUtils.property(thatLocator, "testResultsData", rhsTestResultsData), lhsTestResultsData, rhsTestResultsData)) {
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
            String theStackTestStatusCode;
            theStackTestStatusCode = this.getStackTestStatusCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "stackTestStatusCode", theStackTestStatusCode), currentHashCode, theStackTestStatusCode);
        }
        {
            String theStackTestConductorTypeCode;
            theStackTestConductorTypeCode = this.getStackTestConductorTypeCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "stackTestConductorTypeCode", theStackTestConductorTypeCode), currentHashCode, theStackTestConductorTypeCode);
        }
        {
            String theStackIdentifier;
            theStackIdentifier = this.getStackIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "stackIdentifier", theStackIdentifier), currentHashCode, theStackIdentifier);
        }
        {
            List<String> theStackTestPurposeCode;
            theStackTestPurposeCode = (this.isSetStackTestPurposeCode()?this.getStackTestPurposeCode():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "stackTestPurposeCode", theStackTestPurposeCode), currentHashCode, theStackTestPurposeCode);
        }
        {
            String theOtherStackTestPurposeName;
            theOtherStackTestPurposeName = this.getOtherStackTestPurposeName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "otherStackTestPurposeName", theOtherStackTestPurposeName), currentHashCode, theOtherStackTestPurposeName);
        }
        {
            List<String> theStackTestObservedAgencyTypeCode;
            theStackTestObservedAgencyTypeCode = (this.isSetStackTestObservedAgencyTypeCode()?this.getStackTestObservedAgencyTypeCode():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "stackTestObservedAgencyTypeCode", theStackTestObservedAgencyTypeCode), currentHashCode, theStackTestObservedAgencyTypeCode);
        }
        {
            Date theStackTestReportReceivedDate;
            theStackTestReportReceivedDate = this.getStackTestReportReceivedDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "stackTestReportReceivedDate", theStackTestReportReceivedDate), currentHashCode, theStackTestReportReceivedDate);
        }
        {
            Date theTestResultsReviewedDate;
            theTestResultsReviewedDate = this.getTestResultsReviewedDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "testResultsReviewedDate", theTestResultsReviewedDate), currentHashCode, theTestResultsReviewedDate);
        }
        {
            List<TestResultsData> theTestResultsData;
            theTestResultsData = (this.isSetTestResultsData()?this.getTestResultsData():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "testResultsData", theTestResultsData), currentHashCode, theTestResultsData);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
