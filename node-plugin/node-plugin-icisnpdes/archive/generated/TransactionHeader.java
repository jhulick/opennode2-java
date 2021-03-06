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
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.windsor.node.plugin.common.xml.bind.annotation.adapters.DateTimeAdapter;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for TransactionHeader complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionHeader">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.exchangenetwork.net/schema/icis/5}TransactionType"/>
 *         &lt;element ref="{http://www.exchangenetwork.net/schema/icis/5}TransactionTimestamp" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionHeader", propOrder = {
    "transactionType",
    "transactionTimestamp"
})
@Embeddable
public class TransactionHeader
    implements Serializable, Equals, HashCode
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "TransactionType", required = true)
    protected TransactionType transactionType;
    @XmlElement(name = "TransactionTimestamp", type = String.class)
    @XmlJavaTypeAdapter(DateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Date transactionTimestamp;

    /**
     * Gets the value of the transactionType property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionType }
     *     
     */
    @Basic
    @Column(name = "TRANSACTION_TYPE", columnDefinition = "char(1)", length = 1)
    @Enumerated(EnumType.STRING)
    public TransactionType getTransactionType() {
        return transactionType;
    }

    /**
     * Sets the value of the transactionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionType }
     *     
     */
    public void setTransactionType(TransactionType value) {
        this.transactionType = value;
    }

    @Transient
    public boolean isSetTransactionType() {
        return (this.transactionType!= null);
    }

    /**
     * Gets the value of the transactionTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "TRANSACTION_TIMESTAMP")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getTransactionTimestamp() {
        return transactionTimestamp;
    }

    /**
     * Sets the value of the transactionTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionTimestamp(Date value) {
        this.transactionTimestamp = value;
    }

    @Transient
    public boolean isSetTransactionTimestamp() {
        return (this.transactionTimestamp!= null);
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof TransactionHeader)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TransactionHeader that = ((TransactionHeader) object);
        {
            TransactionType lhsTransactionType;
            lhsTransactionType = this.getTransactionType();
            TransactionType rhsTransactionType;
            rhsTransactionType = that.getTransactionType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "transactionType", lhsTransactionType), LocatorUtils.property(thatLocator, "transactionType", rhsTransactionType), lhsTransactionType, rhsTransactionType)) {
                return false;
            }
        }
        {
            Date lhsTransactionTimestamp;
            lhsTransactionTimestamp = this.getTransactionTimestamp();
            Date rhsTransactionTimestamp;
            rhsTransactionTimestamp = that.getTransactionTimestamp();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "transactionTimestamp", lhsTransactionTimestamp), LocatorUtils.property(thatLocator, "transactionTimestamp", rhsTransactionTimestamp), lhsTransactionTimestamp, rhsTransactionTimestamp)) {
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
            TransactionType theTransactionType;
            theTransactionType = this.getTransactionType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "transactionType", theTransactionType), currentHashCode, theTransactionType);
        }
        {
            Date theTransactionTimestamp;
            theTransactionTimestamp = this.getTransactionTimestamp();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "transactionTimestamp", theTransactionTimestamp), currentHashCode, theTransactionTimestamp);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
