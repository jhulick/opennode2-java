//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.26 at 02:36:56 PM PDT 
//


package com.windsor.node.plugin.ic.fixeddomain;

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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for AccreditationAuthorityIdentifierDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccreditationAuthorityIdentifierDataType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="AccreditationAuthorityIdentifierContext" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccreditationAuthorityIdentifierDataType", propOrder = {
    "value"
})
@Entity(name = "AccreditationAuthorityIdentifierDataType")
@Table(name = "IC_ACCREDITATION_AUTHORITY_IDEN_DATA_TYPE")
@Inheritance(strategy = InheritanceType.JOINED)
public class AccreditationAuthorityIdentifierDataType
    implements Serializable, Equals, HashCode
{

    private final static long serialVersionUID = 1L;
    @XmlValue
    protected String value;
    @XmlAttribute(name = "AccreditationAuthorityIdentifierContext")
    protected String accreditationAuthorityIdentifierContext;
    @XmlTransient
    protected String dbid;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "VALUE", length = 255)
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    @Transient
    public boolean isSetValue() {
        return (this.value!= null);
    }

    /**
     * Gets the value of the accreditationAuthorityIdentifierContext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "ACCREDITATION_AUTHORITY_IDEN_CNTXT", length = 255)
    public String getAccreditationAuthorityIdentifierContext() {
        return accreditationAuthorityIdentifierContext;
    }

    /**
     * Sets the value of the accreditationAuthorityIdentifierContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccreditationAuthorityIdentifierContext(String value) {
        this.accreditationAuthorityIdentifierContext = value;
    }

    @Transient
    public boolean isSetAccreditationAuthorityIdentifierContext() {
        return (this.accreditationAuthorityIdentifierContext!= null);
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
    @Column(name = "ACCREDITATION_AUTHORITY_IDEN_DATA_TYPE_ID")
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
        if (!(object instanceof AccreditationAuthorityIdentifierDataType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final AccreditationAuthorityIdentifierDataType that = ((AccreditationAuthorityIdentifierDataType) object);
        {
            String lhsValue;
            lhsValue = this.getValue();
            String rhsValue;
            rhsValue = that.getValue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "value", lhsValue), LocatorUtils.property(thatLocator, "value", rhsValue), lhsValue, rhsValue)) {
                return false;
            }
        }
        {
            String lhsAccreditationAuthorityIdentifierContext;
            lhsAccreditationAuthorityIdentifierContext = this.getAccreditationAuthorityIdentifierContext();
            String rhsAccreditationAuthorityIdentifierContext;
            rhsAccreditationAuthorityIdentifierContext = that.getAccreditationAuthorityIdentifierContext();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "accreditationAuthorityIdentifierContext", lhsAccreditationAuthorityIdentifierContext), LocatorUtils.property(thatLocator, "accreditationAuthorityIdentifierContext", rhsAccreditationAuthorityIdentifierContext), lhsAccreditationAuthorityIdentifierContext, rhsAccreditationAuthorityIdentifierContext)) {
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
            String theValue;
            theValue = this.getValue();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "value", theValue), currentHashCode, theValue);
        }
        {
            String theAccreditationAuthorityIdentifierContext;
            theAccreditationAuthorityIdentifierContext = this.getAccreditationAuthorityIdentifierContext();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "accreditationAuthorityIdentifierContext", theAccreditationAuthorityIdentifierContext), currentHashCode, theAccreditationAuthorityIdentifierContext);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}