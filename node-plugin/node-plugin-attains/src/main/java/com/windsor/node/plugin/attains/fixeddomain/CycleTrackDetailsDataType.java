//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.10 at 11:24:50 AM PDT 
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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;
import com.windsor.node.plugin.common.xml.bind.annotation.adapters.GYearToIntegerAdapter;
import com.windsor.node.plugin.common.xml.bind.annotation.adapters.StringAdapter;


/**
 * <p>Java class for CycleTrackDetailsDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CycleTrackDetailsDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.exchangenetwork.net/schema/OWIR/ATT/2}PreID305b"/>
 *         &lt;element ref="{http://www.exchangenetwork.net/schema/OWIR/ATT/2}PreCycle"/>
 *         &lt;element ref="{http://www.exchangenetwork.net/schema/OWIR/ATT/2}Purpose"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CycleTrackDetailsDataType", propOrder = {
    "preID305B",
    "preCycle",
    "purpose"
})
@Entity(name = "CycleTrackDetailsDataType")
@Table(name = "OWIR_CYCLE_TRACK_DTLS")
@Inheritance(strategy = InheritanceType.JOINED)
public class CycleTrackDetailsDataType
    implements Serializable, Equals, HashCode
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "PreID305b", required = true)
    protected String preID305B;
    @XmlElement(name = "PreCycle", required = true, type = String.class)
    @XmlJavaTypeAdapter(GYearToIntegerAdapter.class)
    @XmlSchemaType(name = "gYear")
    protected Integer preCycle;
    @XmlElement(name = "Purpose", required = true)
    @XmlJavaTypeAdapter(StringAdapter.class)
    protected String purpose;
    @XmlTransient
    protected String dbid;

    /**
     * Gets the value of the preID305B property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "PRE_ID_305B", length = 50)
    public String getPreID305B() {
        return preID305B;
    }

    /**
     * Sets the value of the preID305B property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreID305B(String value) {
        this.preID305B = value;
    }

    @Transient
    public boolean isSetPreID305B() {
        return (this.preID305B!= null);
    }

    /**
     * Gets the value of the preCycle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "PRE_CYCLE")
    public Integer getPreCycle() {
        return preCycle;
    }

    /**
     * Sets the value of the preCycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreCycle(Integer value) {
        this.preCycle = value;
    }

    @Transient
    public boolean isSetPreCycle() {
        return (this.preCycle!= null);
    }

    /**
     * Gets the value of the purpose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "PURPOSE", columnDefinition = "6", length = 6)
    public String getPurpose() {
        return purpose;
    }

    /**
     * Sets the value of the purpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurpose(String value) {
        this.purpose = value;
    }

    @Transient
    public boolean isSetPurpose() {
        return (this.purpose!= null);
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
    @Column(name = "CYCLE_TRACK_DTLS_ID")
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
        if (!(object instanceof CycleTrackDetailsDataType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final CycleTrackDetailsDataType that = ((CycleTrackDetailsDataType) object);
        {
            String lhsPreID305B;
            lhsPreID305B = this.getPreID305B();
            String rhsPreID305B;
            rhsPreID305B = that.getPreID305B();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "preID305B", lhsPreID305B), LocatorUtils.property(thatLocator, "preID305B", rhsPreID305B), lhsPreID305B, rhsPreID305B)) {
                return false;
            }
        }
        {
            Integer lhsPreCycle;
            lhsPreCycle = this.getPreCycle();
            Integer rhsPreCycle;
            rhsPreCycle = that.getPreCycle();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "preCycle", lhsPreCycle), LocatorUtils.property(thatLocator, "preCycle", rhsPreCycle), lhsPreCycle, rhsPreCycle)) {
                return false;
            }
        }
        {
            String lhsPurpose;
            lhsPurpose = this.getPurpose();
            String rhsPurpose;
            rhsPurpose = that.getPurpose();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "purpose", lhsPurpose), LocatorUtils.property(thatLocator, "purpose", rhsPurpose), lhsPurpose, rhsPurpose)) {
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
            String thePreID305B;
            thePreID305B = this.getPreID305B();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "preID305B", thePreID305B), currentHashCode, thePreID305B);
        }
        {
            Integer thePreCycle;
            thePreCycle = this.getPreCycle();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "preCycle", thePreCycle), currentHashCode, thePreCycle);
        }
        {
            String thePurpose;
            thePurpose = this.getPurpose();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "purpose", thePurpose), currentHashCode, thePurpose);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
