//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.09.02 at 11:05:46 AM PDT 
//


package com.windsor.node.plugin.icisair.domain.generated;

import java.io.Serializable;
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
 * <p>Java class for Citation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Citation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.exchangenetwork.net/schema/icis/5}CitationTitle"/>
 *         &lt;element ref="{http://www.exchangenetwork.net/schema/icis/5}CitationPart"/>
 *         &lt;element ref="{http://www.exchangenetwork.net/schema/icis/5}CitationSection" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Citation", propOrder = {
    "citationTitle",
    "citationPart",
    "citationSection"
})
public class Citation
    implements Serializable, Equals, HashCode
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "CitationTitle", required = true)
    protected String citationTitle;
    @XmlElement(name = "CitationPart", required = true)
    protected String citationPart;
    @XmlElement(name = "CitationSection")
    protected String citationSection;

    /**
     * Gets the value of the citationTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCitationTitle() {
        return citationTitle;
    }

    /**
     * Sets the value of the citationTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCitationTitle(String value) {
        this.citationTitle = value;
    }

    public boolean isSetCitationTitle() {
        return (this.citationTitle!= null);
    }

    /**
     * Gets the value of the citationPart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCitationPart() {
        return citationPart;
    }

    /**
     * Sets the value of the citationPart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCitationPart(String value) {
        this.citationPart = value;
    }

    public boolean isSetCitationPart() {
        return (this.citationPart!= null);
    }

    /**
     * Gets the value of the citationSection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCitationSection() {
        return citationSection;
    }

    /**
     * Sets the value of the citationSection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCitationSection(String value) {
        this.citationSection = value;
    }

    public boolean isSetCitationSection() {
        return (this.citationSection!= null);
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Citation)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Citation that = ((Citation) object);
        {
            String lhsCitationTitle;
            lhsCitationTitle = this.getCitationTitle();
            String rhsCitationTitle;
            rhsCitationTitle = that.getCitationTitle();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "citationTitle", lhsCitationTitle), LocatorUtils.property(thatLocator, "citationTitle", rhsCitationTitle), lhsCitationTitle, rhsCitationTitle)) {
                return false;
            }
        }
        {
            String lhsCitationPart;
            lhsCitationPart = this.getCitationPart();
            String rhsCitationPart;
            rhsCitationPart = that.getCitationPart();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "citationPart", lhsCitationPart), LocatorUtils.property(thatLocator, "citationPart", rhsCitationPart), lhsCitationPart, rhsCitationPart)) {
                return false;
            }
        }
        {
            String lhsCitationSection;
            lhsCitationSection = this.getCitationSection();
            String rhsCitationSection;
            rhsCitationSection = that.getCitationSection();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "citationSection", lhsCitationSection), LocatorUtils.property(thatLocator, "citationSection", rhsCitationSection), lhsCitationSection, rhsCitationSection)) {
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
            String theCitationTitle;
            theCitationTitle = this.getCitationTitle();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "citationTitle", theCitationTitle), currentHashCode, theCitationTitle);
        }
        {
            String theCitationPart;
            theCitationPart = this.getCitationPart();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "citationPart", theCitationPart), currentHashCode, theCitationPart);
        }
        {
            String theCitationSection;
            theCitationSection = this.getCitationSection();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "citationSection", theCitationSection), currentHashCode, theCitationSection);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}