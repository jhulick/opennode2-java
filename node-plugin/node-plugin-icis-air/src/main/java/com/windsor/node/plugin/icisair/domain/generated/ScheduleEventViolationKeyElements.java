//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.09.02 at 11:05:46 AM PDT 
//


package com.windsor.node.plugin.icisair.domain.generated;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for ScheduleEventViolationKeyElements complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScheduleEventViolationKeyElements">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.exchangenetwork.net/schema/icis/5}ScheduleEventViolationKeyElementsGroup"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScheduleEventViolationKeyElements", propOrder = {
    "permitScheduleEventViolationKeyElements",
    "complianceScheduleEventViolationKeyElements"
})
@MappedSuperclass
public class ScheduleEventViolationKeyElements
    implements Serializable, Equals, HashCode
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "PermitScheduleEventViolationKeyElements")
    protected PermitScheduleEventViolationKeyElements permitScheduleEventViolationKeyElements;
    @XmlElement(name = "ComplianceScheduleEventViolationKeyElements")
    protected ComplianceScheduleEventViolationKeyElements complianceScheduleEventViolationKeyElements;

    /**
     * Gets the value of the permitScheduleEventViolationKeyElements property.
     * 
     * @return
     *     possible object is
     *     {@link PermitScheduleEventViolationKeyElements }
     *     
     */
    @NotFound(action = NotFoundAction.IGNORE)
    @ManyToOne(targetEntity = PermitScheduleEventViolationKeyElements.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "ICA_SCHD_EVT_VIOL_ID", referencedColumnName = "ICA_SCHD_EVT_VIOL_ID", insertable = false, updatable = false)
    public PermitScheduleEventViolationKeyElements getPermitScheduleEventViolationKeyElements() {
        return permitScheduleEventViolationKeyElements;
    }

    /**
     * Sets the value of the permitScheduleEventViolationKeyElements property.
     * 
     * @param value
     *     allowed object is
     *     {@link PermitScheduleEventViolationKeyElements }
     *     
     */
    public void setPermitScheduleEventViolationKeyElements(PermitScheduleEventViolationKeyElements value) {
        this.permitScheduleEventViolationKeyElements = value;
    }

    @Transient
    public boolean isSetPermitScheduleEventViolationKeyElements() {
        return (this.permitScheduleEventViolationKeyElements!= null);
    }

    /**
     * Gets the value of the complianceScheduleEventViolationKeyElements property.
     * 
     * @return
     *     possible object is
     *     {@link ComplianceScheduleEventViolationKeyElements }
     *     
     */
    @NotFound(action = NotFoundAction.IGNORE)
    @ManyToOne(targetEntity = ComplianceScheduleEventViolationKeyElements.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "ICA_SCHD_EVT_VIOL_ID", referencedColumnName = "ICA_SCHD_EVT_VIOL_ID", insertable = false, updatable = false)
    public ComplianceScheduleEventViolationKeyElements getComplianceScheduleEventViolationKeyElements() {
        return complianceScheduleEventViolationKeyElements;
    }

    /**
     * Sets the value of the complianceScheduleEventViolationKeyElements property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplianceScheduleEventViolationKeyElements }
     *     
     */
    public void setComplianceScheduleEventViolationKeyElements(ComplianceScheduleEventViolationKeyElements value) {
        this.complianceScheduleEventViolationKeyElements = value;
    }

    @Transient
    public boolean isSetComplianceScheduleEventViolationKeyElements() {
        return (this.complianceScheduleEventViolationKeyElements!= null);
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ScheduleEventViolationKeyElements)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ScheduleEventViolationKeyElements that = ((ScheduleEventViolationKeyElements) object);
        {
            PermitScheduleEventViolationKeyElements lhsPermitScheduleEventViolationKeyElements;
            lhsPermitScheduleEventViolationKeyElements = this.getPermitScheduleEventViolationKeyElements();
            PermitScheduleEventViolationKeyElements rhsPermitScheduleEventViolationKeyElements;
            rhsPermitScheduleEventViolationKeyElements = that.getPermitScheduleEventViolationKeyElements();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "permitScheduleEventViolationKeyElements", lhsPermitScheduleEventViolationKeyElements), LocatorUtils.property(thatLocator, "permitScheduleEventViolationKeyElements", rhsPermitScheduleEventViolationKeyElements), lhsPermitScheduleEventViolationKeyElements, rhsPermitScheduleEventViolationKeyElements)) {
                return false;
            }
        }
        {
            ComplianceScheduleEventViolationKeyElements lhsComplianceScheduleEventViolationKeyElements;
            lhsComplianceScheduleEventViolationKeyElements = this.getComplianceScheduleEventViolationKeyElements();
            ComplianceScheduleEventViolationKeyElements rhsComplianceScheduleEventViolationKeyElements;
            rhsComplianceScheduleEventViolationKeyElements = that.getComplianceScheduleEventViolationKeyElements();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "complianceScheduleEventViolationKeyElements", lhsComplianceScheduleEventViolationKeyElements), LocatorUtils.property(thatLocator, "complianceScheduleEventViolationKeyElements", rhsComplianceScheduleEventViolationKeyElements), lhsComplianceScheduleEventViolationKeyElements, rhsComplianceScheduleEventViolationKeyElements)) {
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
            PermitScheduleEventViolationKeyElements thePermitScheduleEventViolationKeyElements;
            thePermitScheduleEventViolationKeyElements = this.getPermitScheduleEventViolationKeyElements();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "permitScheduleEventViolationKeyElements", thePermitScheduleEventViolationKeyElements), currentHashCode, thePermitScheduleEventViolationKeyElements);
        }
        {
            ComplianceScheduleEventViolationKeyElements theComplianceScheduleEventViolationKeyElements;
            theComplianceScheduleEventViolationKeyElements = this.getComplianceScheduleEventViolationKeyElements();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "complianceScheduleEventViolationKeyElements", theComplianceScheduleEventViolationKeyElements), currentHashCode, theComplianceScheduleEventViolationKeyElements);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
