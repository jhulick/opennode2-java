//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.09 at 07:20:00 AM PDT 
//


package com.windsor.node.plugin.attains.fixeddomain;

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
 * <p>Java class for ATLASesDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ATLASesDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.exchangenetwork.net/schema/OWIR/ATT/2}ATLASDetails" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATLASesDataType", propOrder = {
    "atlasDetails"
})
public class ATLASesDataType
    implements Serializable, Equals, HashCode
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "ATLASDetails")
    protected List<ATLASDetailsDataType> atlasDetails;

    /**
     * Gets the value of the atlasDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the atlasDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getATLASDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATLASDetailsDataType }
     * 
     * 
     */
    public List<ATLASDetailsDataType> getATLASDetails() {
        if (atlasDetails == null) {
            atlasDetails = new ArrayList<ATLASDetailsDataType>();
        }
        return this.atlasDetails;
    }

    /**
     * 
     * 
     */
    public void setATLASDetails(List<ATLASDetailsDataType> atlasDetails) {
        this.atlasDetails = atlasDetails;
    }

    public boolean isSetATLASDetails() {
        return ((this.atlasDetails!= null)&&(!this.atlasDetails.isEmpty()));
    }

    public void unsetATLASDetails() {
        this.atlasDetails = null;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ATLASesDataType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ATLASesDataType that = ((ATLASesDataType) object);
        {
            List<ATLASDetailsDataType> lhsATLASDetails;
            lhsATLASDetails = (this.isSetATLASDetails()?this.getATLASDetails():null);
            List<ATLASDetailsDataType> rhsATLASDetails;
            rhsATLASDetails = (that.isSetATLASDetails()?that.getATLASDetails():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "atlasDetails", lhsATLASDetails), LocatorUtils.property(thatLocator, "atlasDetails", rhsATLASDetails), lhsATLASDetails, rhsATLASDetails)) {
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
            List<ATLASDetailsDataType> theATLASDetails;
            theATLASDetails = (this.isSetATLASDetails()?this.getATLASDetails():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "atlasDetails", theATLASDetails), currentHashCode, theATLASDetails);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}