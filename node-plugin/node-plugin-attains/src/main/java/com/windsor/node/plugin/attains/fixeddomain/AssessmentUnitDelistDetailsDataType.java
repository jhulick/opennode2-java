//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.12 at 03:51:40 PM PDT 
//


package com.windsor.node.plugin.attains.fixeddomain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
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
import javax.xml.datatype.XMLGregorianCalendar;
import com.windsor.node.plugin.common.xml.bind.annotation.adapters.StringAdapter;
import org.jvnet.hyperjaxb3.xml.bind.annotation.adapters.XMLGregorianCalendarAsDate;
import org.jvnet.hyperjaxb3.xml.bind.annotation.adapters.XmlAdapterUtils;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for AssessmentUnitDelistDetailsDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssessmentUnitDelistDetailsDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.exchangenetwork.net/schema/OWIR/ATT/2}CauseName"/>
 *         &lt;element ref="{http://www.exchangenetwork.net/schema/OWIR/ATT/2}DelistingDate" minOccurs="0"/>
 *         &lt;element ref="{http://www.exchangenetwork.net/schema/OWIR/ATT/2}DelistingReason"/>
 *         &lt;element ref="{http://www.exchangenetwork.net/schema/OWIR/ATT/2}DelistingComment" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssessmentUnitDelistDetailsDataType", propOrder = {
    "causeName",
    "delistingDate",
    "delistingReason",
    "delistingComment"
})
@Entity(name = "AssessmentUnitDelistDetailsDataType")
@Table(name = "OWIR_ASMT_UNIT_DELIST_DTLS")
@Inheritance(strategy = InheritanceType.JOINED)
public class AssessmentUnitDelistDetailsDataType
    implements Serializable, Equals, HashCode
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "CauseName", required = true)
    protected String causeName;
    @XmlElement(name = "DelistingDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar delistingDate;
    @XmlElement(name = "DelistingReason", required = true)
    @XmlJavaTypeAdapter(StringAdapter.class)
    protected String delistingReason;
    @XmlElement(name = "DelistingComment")
    protected String delistingComment;
    @XmlTransient
    protected String dbid;

    /**
     * Gets the value of the causeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "CAUSE_NAME", length = 240)
    public String getCauseName() {
        return causeName;
    }

    /**
     * Sets the value of the causeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCauseName(String value) {
        this.causeName = value;
    }

    @Transient
    public boolean isSetCauseName() {
        return (this.causeName!= null);
    }

    /**
     * Gets the value of the delistingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Transient
    public XMLGregorianCalendar getDelistingDate() {
        return delistingDate;
    }

    /**
     * Sets the value of the delistingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDelistingDate(XMLGregorianCalendar value) {
        this.delistingDate = value;
    }

    @Transient
    public boolean isSetDelistingDate() {
        return (this.delistingDate!= null);
    }

    /**
     * Gets the value of the delistingReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "DELISTING_REASON", columnDefinition = "100", length = 100)
    public String getDelistingReason() {
        return delistingReason;
    }

    /**
     * Sets the value of the delistingReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelistingReason(String value) {
        this.delistingReason = value;
    }

    @Transient
    public boolean isSetDelistingReason() {
        return (this.delistingReason!= null);
    }

    /**
     * Gets the value of the delistingComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "DELISTING_COMMENT", length = 4000)
    public String getDelistingComment() {
        return delistingComment;
    }

    /**
     * Sets the value of the delistingComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelistingComment(String value) {
        this.delistingComment = value;
    }

    @Transient
    public boolean isSetDelistingComment() {
        return (this.delistingComment!= null);
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
    @Column(name = "ASMT_UNIT_DELIST_DTLS_ID")
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

    @Basic
    @Column(name = "DELISTING_DATE")
    @Temporal(TemporalType.DATE)
    public Date getDelistingDateItem() {
        return XmlAdapterUtils.unmarshall(XMLGregorianCalendarAsDate.class, this.getDelistingDate());
    }

    public void setDelistingDateItem(Date target) {
        setDelistingDate(XmlAdapterUtils.marshall(XMLGregorianCalendarAsDate.class, target));
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof AssessmentUnitDelistDetailsDataType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final AssessmentUnitDelistDetailsDataType that = ((AssessmentUnitDelistDetailsDataType) object);
        {
            String lhsCauseName;
            lhsCauseName = this.getCauseName();
            String rhsCauseName;
            rhsCauseName = that.getCauseName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "causeName", lhsCauseName), LocatorUtils.property(thatLocator, "causeName", rhsCauseName), lhsCauseName, rhsCauseName)) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsDelistingDate;
            lhsDelistingDate = this.getDelistingDate();
            XMLGregorianCalendar rhsDelistingDate;
            rhsDelistingDate = that.getDelistingDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "delistingDate", lhsDelistingDate), LocatorUtils.property(thatLocator, "delistingDate", rhsDelistingDate), lhsDelistingDate, rhsDelistingDate)) {
                return false;
            }
        }
        {
            String lhsDelistingReason;
            lhsDelistingReason = this.getDelistingReason();
            String rhsDelistingReason;
            rhsDelistingReason = that.getDelistingReason();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "delistingReason", lhsDelistingReason), LocatorUtils.property(thatLocator, "delistingReason", rhsDelistingReason), lhsDelistingReason, rhsDelistingReason)) {
                return false;
            }
        }
        {
            String lhsDelistingComment;
            lhsDelistingComment = this.getDelistingComment();
            String rhsDelistingComment;
            rhsDelistingComment = that.getDelistingComment();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "delistingComment", lhsDelistingComment), LocatorUtils.property(thatLocator, "delistingComment", rhsDelistingComment), lhsDelistingComment, rhsDelistingComment)) {
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
            String theCauseName;
            theCauseName = this.getCauseName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "causeName", theCauseName), currentHashCode, theCauseName);
        }
        {
            XMLGregorianCalendar theDelistingDate;
            theDelistingDate = this.getDelistingDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "delistingDate", theDelistingDate), currentHashCode, theDelistingDate);
        }
        {
            String theDelistingReason;
            theDelistingReason = this.getDelistingReason();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "delistingReason", theDelistingReason), currentHashCode, theDelistingReason);
        }
        {
            String theDelistingComment;
            theDelistingComment = this.getDelistingComment();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "delistingComment", theDelistingComment), currentHashCode, theDelistingComment);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
