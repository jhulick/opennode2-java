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
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.windsor.node.plugin.common.xml.bind.annotation.adapters.DateNoTimeZoneAdapter;
import com.windsor.node.plugin.common.xml.bind.annotation.adapters.IntegerAdapter;
import com.windsor.node.plugin.icisnpdes.domain.AbstractGPCFNoExposure;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for GPCFNoExposure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GPCFNoExposure">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.exchangenetwork.net/schema/icis/5}NoExposureAuthorizationDate" minOccurs="0"/>
 *         &lt;element ref="{http://www.exchangenetwork.net/schema/icis/5}NoExposurePostmarkDate" minOccurs="0"/>
 *         &lt;element ref="{http://www.exchangenetwork.net/schema/icis/5}NoExposureEvaluationDate" minOccurs="0"/>
 *         &lt;element ref="{http://www.exchangenetwork.net/schema/icis/5}NoExposureEvaluationBasisCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.exchangenetwork.net/schema/icis/5}NoExposureCriteriaMetIndicator" minOccurs="0"/>
 *         &lt;element ref="{http://www.exchangenetwork.net/schema/icis/5}PavedRoofSize" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GPCFNoExposure", propOrder = {
    "noExposureAuthorizationDate",
    "noExposurePostmarkDate",
    "noExposureEvaluationDate",
    "noExposureEvaluationBasisCode",
    "noExposureCriteriaMetIndicator",
    "pavedRoofSize"
})
@Entity(name = "GPCFNoExposure")
@Table(name = "ICS_GPCF_NO_EXPOSURE")
@Inheritance(strategy = InheritanceType.JOINED)
public class GPCFNoExposure
    extends AbstractGPCFNoExposure
    implements Serializable, Equals, HashCode
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "NoExposureAuthorizationDate", type = String.class)
    @XmlJavaTypeAdapter(DateNoTimeZoneAdapter.class)
    protected Date noExposureAuthorizationDate;
    @XmlElement(name = "NoExposurePostmarkDate", type = String.class)
    @XmlJavaTypeAdapter(DateNoTimeZoneAdapter.class)
    protected Date noExposurePostmarkDate;
    @XmlElement(name = "NoExposureEvaluationDate", type = String.class)
    @XmlJavaTypeAdapter(DateNoTimeZoneAdapter.class)
    protected Date noExposureEvaluationDate;
    @XmlElement(name = "NoExposureEvaluationBasisCode")
    protected String noExposureEvaluationBasisCode;
    @XmlElement(name = "NoExposureCriteriaMetIndicator")
    protected String noExposureCriteriaMetIndicator;
    @XmlElement(name = "PavedRoofSize", type = String.class)
    @XmlJavaTypeAdapter(IntegerAdapter.class)
    protected Integer pavedRoofSize;
    @XmlTransient
    protected String dbid;

    /**
     * Gets the value of the noExposureAuthorizationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "NO_EXPOSURE_AUTH_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getNoExposureAuthorizationDate() {
        return noExposureAuthorizationDate;
    }

    /**
     * Sets the value of the noExposureAuthorizationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoExposureAuthorizationDate(Date value) {
        this.noExposureAuthorizationDate = value;
    }

    @Transient
    public boolean isSetNoExposureAuthorizationDate() {
        return (this.noExposureAuthorizationDate!= null);
    }

    /**
     * Gets the value of the noExposurePostmarkDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "NO_EXPOSURE_POSTMARK_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getNoExposurePostmarkDate() {
        return noExposurePostmarkDate;
    }

    /**
     * Sets the value of the noExposurePostmarkDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoExposurePostmarkDate(Date value) {
        this.noExposurePostmarkDate = value;
    }

    @Transient
    public boolean isSetNoExposurePostmarkDate() {
        return (this.noExposurePostmarkDate!= null);
    }

    /**
     * Gets the value of the noExposureEvaluationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "NO_EXPOSURE_EVAL_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getNoExposureEvaluationDate() {
        return noExposureEvaluationDate;
    }

    /**
     * Sets the value of the noExposureEvaluationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoExposureEvaluationDate(Date value) {
        this.noExposureEvaluationDate = value;
    }

    @Transient
    public boolean isSetNoExposureEvaluationDate() {
        return (this.noExposureEvaluationDate!= null);
    }

    /**
     * Gets the value of the noExposureEvaluationBasisCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "NO_EXPOSURE_EVAL_BASIS_CODE", length = 3)
    public String getNoExposureEvaluationBasisCode() {
        return noExposureEvaluationBasisCode;
    }

    /**
     * Sets the value of the noExposureEvaluationBasisCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoExposureEvaluationBasisCode(String value) {
        this.noExposureEvaluationBasisCode = value;
    }

    @Transient
    public boolean isSetNoExposureEvaluationBasisCode() {
        return (this.noExposureEvaluationBasisCode!= null);
    }

    /**
     * Gets the value of the noExposureCriteriaMetIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "NO_EXPOSURE_CRITERIA_MET_IND", columnDefinition = "char(1)", length = 1)
    public String getNoExposureCriteriaMetIndicator() {
        return noExposureCriteriaMetIndicator;
    }

    /**
     * Sets the value of the noExposureCriteriaMetIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoExposureCriteriaMetIndicator(String value) {
        this.noExposureCriteriaMetIndicator = value;
    }

    @Transient
    public boolean isSetNoExposureCriteriaMetIndicator() {
        return (this.noExposureCriteriaMetIndicator!= null);
    }

    /**
     * Gets the value of the pavedRoofSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "PAVED_ROOF_SIZE", scale = 0)
    public Integer getPavedRoofSize() {
        return pavedRoofSize;
    }

    /**
     * Sets the value of the pavedRoofSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPavedRoofSize(Integer value) {
        this.pavedRoofSize = value;
    }

    @Transient
    public boolean isSetPavedRoofSize() {
        return (this.pavedRoofSize!= null);
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
    @Column(name = "ICS_GPCF_NO_EXPOSURE_ID")
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
        if (!(object instanceof GPCFNoExposure)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final GPCFNoExposure that = ((GPCFNoExposure) object);
        {
            Date lhsNoExposureAuthorizationDate;
            lhsNoExposureAuthorizationDate = this.getNoExposureAuthorizationDate();
            Date rhsNoExposureAuthorizationDate;
            rhsNoExposureAuthorizationDate = that.getNoExposureAuthorizationDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "noExposureAuthorizationDate", lhsNoExposureAuthorizationDate), LocatorUtils.property(thatLocator, "noExposureAuthorizationDate", rhsNoExposureAuthorizationDate), lhsNoExposureAuthorizationDate, rhsNoExposureAuthorizationDate)) {
                return false;
            }
        }
        {
            Date lhsNoExposurePostmarkDate;
            lhsNoExposurePostmarkDate = this.getNoExposurePostmarkDate();
            Date rhsNoExposurePostmarkDate;
            rhsNoExposurePostmarkDate = that.getNoExposurePostmarkDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "noExposurePostmarkDate", lhsNoExposurePostmarkDate), LocatorUtils.property(thatLocator, "noExposurePostmarkDate", rhsNoExposurePostmarkDate), lhsNoExposurePostmarkDate, rhsNoExposurePostmarkDate)) {
                return false;
            }
        }
        {
            Date lhsNoExposureEvaluationDate;
            lhsNoExposureEvaluationDate = this.getNoExposureEvaluationDate();
            Date rhsNoExposureEvaluationDate;
            rhsNoExposureEvaluationDate = that.getNoExposureEvaluationDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "noExposureEvaluationDate", lhsNoExposureEvaluationDate), LocatorUtils.property(thatLocator, "noExposureEvaluationDate", rhsNoExposureEvaluationDate), lhsNoExposureEvaluationDate, rhsNoExposureEvaluationDate)) {
                return false;
            }
        }
        {
            String lhsNoExposureEvaluationBasisCode;
            lhsNoExposureEvaluationBasisCode = this.getNoExposureEvaluationBasisCode();
            String rhsNoExposureEvaluationBasisCode;
            rhsNoExposureEvaluationBasisCode = that.getNoExposureEvaluationBasisCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "noExposureEvaluationBasisCode", lhsNoExposureEvaluationBasisCode), LocatorUtils.property(thatLocator, "noExposureEvaluationBasisCode", rhsNoExposureEvaluationBasisCode), lhsNoExposureEvaluationBasisCode, rhsNoExposureEvaluationBasisCode)) {
                return false;
            }
        }
        {
            String lhsNoExposureCriteriaMetIndicator;
            lhsNoExposureCriteriaMetIndicator = this.getNoExposureCriteriaMetIndicator();
            String rhsNoExposureCriteriaMetIndicator;
            rhsNoExposureCriteriaMetIndicator = that.getNoExposureCriteriaMetIndicator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "noExposureCriteriaMetIndicator", lhsNoExposureCriteriaMetIndicator), LocatorUtils.property(thatLocator, "noExposureCriteriaMetIndicator", rhsNoExposureCriteriaMetIndicator), lhsNoExposureCriteriaMetIndicator, rhsNoExposureCriteriaMetIndicator)) {
                return false;
            }
        }
        {
            Integer lhsPavedRoofSize;
            lhsPavedRoofSize = this.getPavedRoofSize();
            Integer rhsPavedRoofSize;
            rhsPavedRoofSize = that.getPavedRoofSize();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pavedRoofSize", lhsPavedRoofSize), LocatorUtils.property(thatLocator, "pavedRoofSize", rhsPavedRoofSize), lhsPavedRoofSize, rhsPavedRoofSize)) {
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
            Date theNoExposureAuthorizationDate;
            theNoExposureAuthorizationDate = this.getNoExposureAuthorizationDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "noExposureAuthorizationDate", theNoExposureAuthorizationDate), currentHashCode, theNoExposureAuthorizationDate);
        }
        {
            Date theNoExposurePostmarkDate;
            theNoExposurePostmarkDate = this.getNoExposurePostmarkDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "noExposurePostmarkDate", theNoExposurePostmarkDate), currentHashCode, theNoExposurePostmarkDate);
        }
        {
            Date theNoExposureEvaluationDate;
            theNoExposureEvaluationDate = this.getNoExposureEvaluationDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "noExposureEvaluationDate", theNoExposureEvaluationDate), currentHashCode, theNoExposureEvaluationDate);
        }
        {
            String theNoExposureEvaluationBasisCode;
            theNoExposureEvaluationBasisCode = this.getNoExposureEvaluationBasisCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "noExposureEvaluationBasisCode", theNoExposureEvaluationBasisCode), currentHashCode, theNoExposureEvaluationBasisCode);
        }
        {
            String theNoExposureCriteriaMetIndicator;
            theNoExposureCriteriaMetIndicator = this.getNoExposureCriteriaMetIndicator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "noExposureCriteriaMetIndicator", theNoExposureCriteriaMetIndicator), currentHashCode, theNoExposureCriteriaMetIndicator);
        }
        {
            Integer thePavedRoofSize;
            thePavedRoofSize = this.getPavedRoofSize();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pavedRoofSize", thePavedRoofSize), currentHashCode, thePavedRoofSize);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}