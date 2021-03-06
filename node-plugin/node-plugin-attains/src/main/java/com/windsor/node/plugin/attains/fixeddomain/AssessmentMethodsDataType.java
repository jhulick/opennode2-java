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
 * <p>Java class for AssessmentMethodsDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssessmentMethodsDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.exchangenetwork.net/schema/OWIR/ATT/2}AssessmentMethodDetails" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssessmentMethodsDataType", propOrder = {
    "assessmentMethodDetails"
})
public class AssessmentMethodsDataType
    implements Serializable, Equals, HashCode
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "AssessmentMethodDetails")
    protected List<AssessmentMethodDetailsDataType> assessmentMethodDetails;

    /**
     * Gets the value of the assessmentMethodDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assessmentMethodDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssessmentMethodDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssessmentMethodDetailsDataType }
     * 
     * 
     */
    public List<AssessmentMethodDetailsDataType> getAssessmentMethodDetails() {
        if (assessmentMethodDetails == null) {
            assessmentMethodDetails = new ArrayList<AssessmentMethodDetailsDataType>();
        }
        return this.assessmentMethodDetails;
    }

    /**
     * 
     * 
     */
    public void setAssessmentMethodDetails(List<AssessmentMethodDetailsDataType> assessmentMethodDetails) {
        this.assessmentMethodDetails = assessmentMethodDetails;
    }

    public boolean isSetAssessmentMethodDetails() {
        return ((this.assessmentMethodDetails!= null)&&(!this.assessmentMethodDetails.isEmpty()));
    }

    public void unsetAssessmentMethodDetails() {
        this.assessmentMethodDetails = null;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof AssessmentMethodsDataType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final AssessmentMethodsDataType that = ((AssessmentMethodsDataType) object);
        {
            List<AssessmentMethodDetailsDataType> lhsAssessmentMethodDetails;
            lhsAssessmentMethodDetails = (this.isSetAssessmentMethodDetails()?this.getAssessmentMethodDetails():null);
            List<AssessmentMethodDetailsDataType> rhsAssessmentMethodDetails;
            rhsAssessmentMethodDetails = (that.isSetAssessmentMethodDetails()?that.getAssessmentMethodDetails():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "assessmentMethodDetails", lhsAssessmentMethodDetails), LocatorUtils.property(thatLocator, "assessmentMethodDetails", rhsAssessmentMethodDetails), lhsAssessmentMethodDetails, rhsAssessmentMethodDetails)) {
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
            List<AssessmentMethodDetailsDataType> theAssessmentMethodDetails;
            theAssessmentMethodDetails = (this.isSetAssessmentMethodDetails()?this.getAssessmentMethodDetails():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "assessmentMethodDetails", theAssessmentMethodDetails), currentHashCode, theAssessmentMethodDetails);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
