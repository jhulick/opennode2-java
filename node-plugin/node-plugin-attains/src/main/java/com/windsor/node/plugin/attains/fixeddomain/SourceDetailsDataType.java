//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.10 at 10:09:56 AM PDT 
//


package com.windsor.node.plugin.attains.fixeddomain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
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
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.windsor.node.plugin.common.xml.bind.annotation.adapters.StringAdapter;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for SourceDetailsDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SourceDetailsDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.exchangenetwork.net/schema/OWIR/ATT/2}SourceName"/>
 *         &lt;element ref="{http://www.exchangenetwork.net/schema/OWIR/ATT/2}SourceComments" minOccurs="0"/>
 *         &lt;element ref="{http://www.exchangenetwork.net/schema/OWIR/ATT/2}Confirmed" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SourceDetailsDataType", propOrder = {
    "sourceName",
    "sourceComments",
    "confirmed"
})
@Entity(name = "SourceDetailsDataType")
@Table(name = "OWIR_SRC_DTLS")
@Inheritance(strategy = InheritanceType.JOINED)
public class SourceDetailsDataType
    implements Serializable, Equals, HashCode
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "SourceName", required = true)
    protected String sourceName;
    @XmlElement(name = "SourceComments")
    protected String sourceComments;
    @XmlElement(name = "Confirmed")
    @XmlJavaTypeAdapter(StringAdapter.class)
    protected String confirmed;
    @XmlTransient
    protected String dbid;

    /**
     * Gets the value of the sourceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "SRC_NAME", length = 250)
    public String getSourceName() {
        return sourceName;
    }

    /**
     * Sets the value of the sourceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceName(String value) {
        this.sourceName = value;
    }

    @Transient
    public boolean isSetSourceName() {
        return (this.sourceName!= null);
    }

    /**
     * Gets the value of the sourceComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "SRC_COMMENT", length = 4000)
    public String getSourceComments() {
        return sourceComments;
    }

    /**
     * Sets the value of the sourceComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceComments(String value) {
        this.sourceComments = value;
    }

    @Transient
    public boolean isSetSourceComments() {
        return (this.sourceComments!= null);
    }

    /**
     * Gets the value of the confirmed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "CONFIRMED", columnDefinition = "1", length = 1)
    public String getConfirmed() {
        return confirmed;
    }

    /**
     * Sets the value of the confirmed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfirmed(String value) {
        this.confirmed = value;
    }

    @Transient
    public boolean isSetConfirmed() {
        return (this.confirmed!= null);
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
    @Column(name = "SRC_DTLS_ID")
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
        if (!(object instanceof SourceDetailsDataType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SourceDetailsDataType that = ((SourceDetailsDataType) object);
        {
            String lhsSourceName;
            lhsSourceName = this.getSourceName();
            String rhsSourceName;
            rhsSourceName = that.getSourceName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sourceName", lhsSourceName), LocatorUtils.property(thatLocator, "sourceName", rhsSourceName), lhsSourceName, rhsSourceName)) {
                return false;
            }
        }
        {
            String lhsSourceComments;
            lhsSourceComments = this.getSourceComments();
            String rhsSourceComments;
            rhsSourceComments = that.getSourceComments();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sourceComments", lhsSourceComments), LocatorUtils.property(thatLocator, "sourceComments", rhsSourceComments), lhsSourceComments, rhsSourceComments)) {
                return false;
            }
        }
        {
            String lhsConfirmed;
            lhsConfirmed = this.getConfirmed();
            String rhsConfirmed;
            rhsConfirmed = that.getConfirmed();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "confirmed", lhsConfirmed), LocatorUtils.property(thatLocator, "confirmed", rhsConfirmed), lhsConfirmed, rhsConfirmed)) {
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
            String theSourceName;
            theSourceName = this.getSourceName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sourceName", theSourceName), currentHashCode, theSourceName);
        }
        {
            String theSourceComments;
            theSourceComments = this.getSourceComments();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sourceComments", theSourceComments), currentHashCode, theSourceComments);
        }
        {
            String theConfirmed;
            theConfirmed = this.getConfirmed();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "confirmed", theConfirmed), currentHashCode, theConfirmed);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
