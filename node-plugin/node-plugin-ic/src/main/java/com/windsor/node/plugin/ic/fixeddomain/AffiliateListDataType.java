//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.26 at 02:36:56 PM PDT 
//


package com.windsor.node.plugin.ic.fixeddomain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 * <p>Java class for AffiliateListDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AffiliateListDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.exchangenetwork.net/schema/IC/1}Affiliate" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AffiliateListDataType", propOrder = {
    "affiliate"
})
public class AffiliateListDataType
    implements Serializable, Equals, HashCode
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "Affiliate")
    protected List<AffiliateDataType> affiliate;

    /**
     * Gets the value of the affiliate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the affiliate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAffiliate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AffiliateDataType }
     * 
     * 
     */
    public List<AffiliateDataType> getAffiliate() {
        if (affiliate == null) {
            affiliate = new ArrayList<AffiliateDataType>();
        }
        return this.affiliate;
    }

    /**
     * 
     * 
     */
    public void setAffiliate(List<AffiliateDataType> affiliate) {
        this.affiliate = affiliate;
    }

    public boolean isSetAffiliate() {
        return ((this.affiliate!= null)&&(!this.affiliate.isEmpty()));
    }

    public void unsetAffiliate() {
        this.affiliate = null;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof AffiliateListDataType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final AffiliateListDataType that = ((AffiliateListDataType) object);
        {
            List<AffiliateDataType> lhsAffiliate;
            lhsAffiliate = (this.isSetAffiliate()?this.getAffiliate():null);
            List<AffiliateDataType> rhsAffiliate;
            rhsAffiliate = (that.isSetAffiliate()?that.getAffiliate():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "affiliate", lhsAffiliate), LocatorUtils.property(thatLocator, "affiliate", rhsAffiliate), lhsAffiliate, rhsAffiliate)) {
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
            List<AffiliateDataType> theAffiliate;
            theAffiliate = (this.isSetAffiliate()?this.getAffiliate():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "affiliate", theAffiliate), currentHashCode, theAffiliate);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
