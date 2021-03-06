//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.09 at 07:20:00 AM PDT 
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
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for UserCategoryDetailsDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserCategoryDetailsDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.exchangenetwork.net/schema/OWIR/ATT/2}CategoryID"/>
 *         &lt;element ref="{http://www.exchangenetwork.net/schema/OWIR/ATT/2}CategoryDescription"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserCategoryDetailsDataType", propOrder = {
    "categoryID",
    "categoryDescription"
})
@Entity(name = "UserCategoryDetailsDataType")
@Table(name = "OWIR_USER_CATG_DTLS")
@Inheritance(strategy = InheritanceType.JOINED)
public class UserCategoryDetailsDataType
    implements Serializable, Equals, HashCode
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "CategoryID", required = true)
    protected String categoryID;
    @XmlElement(name = "CategoryDescription", required = true)
    protected String categoryDescription;
    @XmlTransient
    protected String dbid;

    /**
     * Gets the value of the categoryID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "CATG_ID", length = 10)
    public String getCategoryID() {
        return categoryID;
    }

    /**
     * Sets the value of the categoryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryID(String value) {
        this.categoryID = value;
    }

    @Transient
    public boolean isSetCategoryID() {
        return (this.categoryID!= null);
    }

    /**
     * Gets the value of the categoryDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "CATG_DESC", length = 4000)
    public String getCategoryDescription() {
        return categoryDescription;
    }

    /**
     * Sets the value of the categoryDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryDescription(String value) {
        this.categoryDescription = value;
    }

    @Transient
    public boolean isSetCategoryDescription() {
        return (this.categoryDescription!= null);
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
    @Column(name = "USER_CATG_DTLS_ID")
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
        if (!(object instanceof UserCategoryDetailsDataType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final UserCategoryDetailsDataType that = ((UserCategoryDetailsDataType) object);
        {
            String lhsCategoryID;
            lhsCategoryID = this.getCategoryID();
            String rhsCategoryID;
            rhsCategoryID = that.getCategoryID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "categoryID", lhsCategoryID), LocatorUtils.property(thatLocator, "categoryID", rhsCategoryID), lhsCategoryID, rhsCategoryID)) {
                return false;
            }
        }
        {
            String lhsCategoryDescription;
            lhsCategoryDescription = this.getCategoryDescription();
            String rhsCategoryDescription;
            rhsCategoryDescription = that.getCategoryDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "categoryDescription", lhsCategoryDescription), LocatorUtils.property(thatLocator, "categoryDescription", rhsCategoryDescription), lhsCategoryDescription, rhsCategoryDescription)) {
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
            String theCategoryID;
            theCategoryID = this.getCategoryID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "categoryID", theCategoryID), currentHashCode, theCategoryID);
        }
        {
            String theCategoryDescription;
            theCategoryDescription = this.getCategoryDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "categoryDescription", theCategoryDescription), currentHashCode, theCategoryDescription);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
