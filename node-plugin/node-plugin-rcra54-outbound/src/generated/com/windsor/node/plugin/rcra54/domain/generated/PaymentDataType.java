//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.06.15 at 06:46:14 PM EDT 
//


package com.windsor.node.plugin.rcra54.domain.generated;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
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
 * <p>Java class for PaymentDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.exchangenetwork.net/schema/RCRA/5}TransactionCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.exchangenetwork.net/schema/RCRA/5}PaymentSequenceNumber"/>
 *         &lt;element ref="{http://www.exchangenetwork.net/schema/RCRA/5}PaymentDefaultedDate" minOccurs="0"/>
 *         &lt;element ref="{http://www.exchangenetwork.net/schema/RCRA/5}ScheduledPaymentDate" minOccurs="0"/>
 *         &lt;element ref="{http://www.exchangenetwork.net/schema/RCRA/5}ScheduledPaymentAmount" minOccurs="0"/>
 *         &lt;element ref="{http://www.exchangenetwork.net/schema/RCRA/5}ActualPaymentDate" minOccurs="0"/>
 *         &lt;element ref="{http://www.exchangenetwork.net/schema/RCRA/5}ActualPaidAmount" minOccurs="0"/>
 *         &lt;element ref="{http://www.exchangenetwork.net/schema/RCRA/5}Notes" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentDataType", propOrder = {
    "transactionCode",
    "paymentSequenceNumber",
    "paymentDefaultedDate",
    "scheduledPaymentDate",
    "scheduledPaymentAmount",
    "actualPaymentDate",
    "actualPaidAmount",
    "notes"
})
@Entity(name = "PaymentDataType")
@Table(name = "RCRA_PAYMNT")
@Inheritance(strategy = InheritanceType.JOINED)
public class PaymentDataType
    implements Equals, HashCode
{

    @XmlElement(name = "TransactionCode")
    protected String transactionCode;
    @XmlElement(name = "PaymentSequenceNumber", required = true)
    protected BigInteger paymentSequenceNumber;
    @XmlElement(name = "PaymentDefaultedDate")
    protected XMLGregorianCalendar paymentDefaultedDate;
    @XmlElement(name = "ScheduledPaymentDate")
    protected XMLGregorianCalendar scheduledPaymentDate;
    @XmlElement(name = "ScheduledPaymentAmount")
    protected BigDecimal scheduledPaymentAmount;
    @XmlElement(name = "ActualPaymentDate")
    protected XMLGregorianCalendar actualPaymentDate;
    @XmlElement(name = "ActualPaidAmount")
    protected BigDecimal actualPaidAmount;
    @XmlElement(name = "Notes")
    protected String notes;
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
     * Gets the value of the paymentSequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    @Basic
    @Column(name = "PAYMNTSEQNUMBER", precision = 2, scale = 0)
    public BigInteger getPaymentSequenceNumber() {
        return paymentSequenceNumber;
    }

    /**
     * Sets the value of the paymentSequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPaymentSequenceNumber(BigInteger value) {
        this.paymentSequenceNumber = value;
    }

    /**
     * Gets the value of the paymentDefaultedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Transient
    public XMLGregorianCalendar getPaymentDefaultedDate() {
        return paymentDefaultedDate;
    }

    /**
     * Sets the value of the paymentDefaultedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPaymentDefaultedDate(XMLGregorianCalendar value) {
        this.paymentDefaultedDate = value;
    }

    /**
     * Gets the value of the scheduledPaymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Transient
    public XMLGregorianCalendar getScheduledPaymentDate() {
        return scheduledPaymentDate;
    }

    /**
     * Sets the value of the scheduledPaymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScheduledPaymentDate(XMLGregorianCalendar value) {
        this.scheduledPaymentDate = value;
    }

    /**
     * Gets the value of the scheduledPaymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Basic
    @Column(name = "SCHEDPAYMNTAMT", precision = 13, scale = 2)
    public BigDecimal getScheduledPaymentAmount() {
        return scheduledPaymentAmount;
    }

    /**
     * Sets the value of the scheduledPaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setScheduledPaymentAmount(BigDecimal value) {
        this.scheduledPaymentAmount = value;
    }

    /**
     * Gets the value of the actualPaymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Transient
    public XMLGregorianCalendar getActualPaymentDate() {
        return actualPaymentDate;
    }

    /**
     * Sets the value of the actualPaymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActualPaymentDate(XMLGregorianCalendar value) {
        this.actualPaymentDate = value;
    }

    /**
     * Gets the value of the actualPaidAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Basic
    @Column(name = "ACTUALPAIDAMT", precision = 13, scale = 2)
    public BigDecimal getActualPaidAmount() {
        return actualPaidAmount;
    }

    /**
     * Sets the value of the actualPaidAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setActualPaidAmount(BigDecimal value) {
        this.actualPaidAmount = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "NOTES", length = 2000)
    public String getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
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

    @Basic
    @Column(name = "PAYMNTDEFAULTEDDATEITEM")
    @Temporal(TemporalType.DATE)
    public Date getPaymentDefaultedDateItem() {
        return XmlAdapterUtils.unmarshall(XMLGregorianCalendarAsDate.class, this.getPaymentDefaultedDate());
    }

    public void setPaymentDefaultedDateItem(Date target) {
        setPaymentDefaultedDate(XmlAdapterUtils.marshall(XMLGregorianCalendarAsDate.class, target));
    }

    @Basic
    @Column(name = "SCHEDPAYMNTDATEITEM")
    @Temporal(TemporalType.DATE)
    public Date getScheduledPaymentDateItem() {
        return XmlAdapterUtils.unmarshall(XMLGregorianCalendarAsDate.class, this.getScheduledPaymentDate());
    }

    public void setScheduledPaymentDateItem(Date target) {
        setScheduledPaymentDate(XmlAdapterUtils.marshall(XMLGregorianCalendarAsDate.class, target));
    }

    @Basic
    @Column(name = "ACTUALPAYMNTDATEITEM")
    @Temporal(TemporalType.DATE)
    public Date getActualPaymentDateItem() {
        return XmlAdapterUtils.unmarshall(XMLGregorianCalendarAsDate.class, this.getActualPaymentDate());
    }

    public void setActualPaymentDateItem(Date target) {
        setActualPaymentDate(XmlAdapterUtils.marshall(XMLGregorianCalendarAsDate.class, target));
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof PaymentDataType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final PaymentDataType that = ((PaymentDataType) object);
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
            BigInteger lhsPaymentSequenceNumber;
            lhsPaymentSequenceNumber = this.getPaymentSequenceNumber();
            BigInteger rhsPaymentSequenceNumber;
            rhsPaymentSequenceNumber = that.getPaymentSequenceNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "paymentSequenceNumber", lhsPaymentSequenceNumber), LocatorUtils.property(thatLocator, "paymentSequenceNumber", rhsPaymentSequenceNumber), lhsPaymentSequenceNumber, rhsPaymentSequenceNumber)) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsPaymentDefaultedDate;
            lhsPaymentDefaultedDate = this.getPaymentDefaultedDate();
            XMLGregorianCalendar rhsPaymentDefaultedDate;
            rhsPaymentDefaultedDate = that.getPaymentDefaultedDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "paymentDefaultedDate", lhsPaymentDefaultedDate), LocatorUtils.property(thatLocator, "paymentDefaultedDate", rhsPaymentDefaultedDate), lhsPaymentDefaultedDate, rhsPaymentDefaultedDate)) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsScheduledPaymentDate;
            lhsScheduledPaymentDate = this.getScheduledPaymentDate();
            XMLGregorianCalendar rhsScheduledPaymentDate;
            rhsScheduledPaymentDate = that.getScheduledPaymentDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "scheduledPaymentDate", lhsScheduledPaymentDate), LocatorUtils.property(thatLocator, "scheduledPaymentDate", rhsScheduledPaymentDate), lhsScheduledPaymentDate, rhsScheduledPaymentDate)) {
                return false;
            }
        }
        {
            BigDecimal lhsScheduledPaymentAmount;
            lhsScheduledPaymentAmount = this.getScheduledPaymentAmount();
            BigDecimal rhsScheduledPaymentAmount;
            rhsScheduledPaymentAmount = that.getScheduledPaymentAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "scheduledPaymentAmount", lhsScheduledPaymentAmount), LocatorUtils.property(thatLocator, "scheduledPaymentAmount", rhsScheduledPaymentAmount), lhsScheduledPaymentAmount, rhsScheduledPaymentAmount)) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsActualPaymentDate;
            lhsActualPaymentDate = this.getActualPaymentDate();
            XMLGregorianCalendar rhsActualPaymentDate;
            rhsActualPaymentDate = that.getActualPaymentDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "actualPaymentDate", lhsActualPaymentDate), LocatorUtils.property(thatLocator, "actualPaymentDate", rhsActualPaymentDate), lhsActualPaymentDate, rhsActualPaymentDate)) {
                return false;
            }
        }
        {
            BigDecimal lhsActualPaidAmount;
            lhsActualPaidAmount = this.getActualPaidAmount();
            BigDecimal rhsActualPaidAmount;
            rhsActualPaidAmount = that.getActualPaidAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "actualPaidAmount", lhsActualPaidAmount), LocatorUtils.property(thatLocator, "actualPaidAmount", rhsActualPaidAmount), lhsActualPaidAmount, rhsActualPaidAmount)) {
                return false;
            }
        }
        {
            String lhsNotes;
            lhsNotes = this.getNotes();
            String rhsNotes;
            rhsNotes = that.getNotes();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "notes", lhsNotes), LocatorUtils.property(thatLocator, "notes", rhsNotes), lhsNotes, rhsNotes)) {
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
            BigInteger thePaymentSequenceNumber;
            thePaymentSequenceNumber = this.getPaymentSequenceNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "paymentSequenceNumber", thePaymentSequenceNumber), currentHashCode, thePaymentSequenceNumber);
        }
        {
            XMLGregorianCalendar thePaymentDefaultedDate;
            thePaymentDefaultedDate = this.getPaymentDefaultedDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "paymentDefaultedDate", thePaymentDefaultedDate), currentHashCode, thePaymentDefaultedDate);
        }
        {
            XMLGregorianCalendar theScheduledPaymentDate;
            theScheduledPaymentDate = this.getScheduledPaymentDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "scheduledPaymentDate", theScheduledPaymentDate), currentHashCode, theScheduledPaymentDate);
        }
        {
            BigDecimal theScheduledPaymentAmount;
            theScheduledPaymentAmount = this.getScheduledPaymentAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "scheduledPaymentAmount", theScheduledPaymentAmount), currentHashCode, theScheduledPaymentAmount);
        }
        {
            XMLGregorianCalendar theActualPaymentDate;
            theActualPaymentDate = this.getActualPaymentDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "actualPaymentDate", theActualPaymentDate), currentHashCode, theActualPaymentDate);
        }
        {
            BigDecimal theActualPaidAmount;
            theActualPaidAmount = this.getActualPaidAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "actualPaidAmount", theActualPaidAmount), currentHashCode, theActualPaidAmount);
        }
        {
            String theNotes;
            theNotes = this.getNotes();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "notes", theNotes), currentHashCode, theNotes);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}