//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.09.02 at 11:05:46 AM PDT 
//


package com.windsor.node.plugin.icisair.domain.generated;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Transient;
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
 * <p>Java class for AirDAEnforcementActionLinkage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirDAEnforcementActionLinkage">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.exchangenetwork.net/schema/icis/5}AirDAEnforcementActionKeyElements">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.exchangenetwork.net/schema/icis/5}LinkageAirDAEnforcementAction"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirDAEnforcementActionLinkage", propOrder = {
    "linkageAirDAEnforcementAction"
})
@Embeddable
public class AirDAEnforcementActionLinkage
    extends AirDAEnforcementActionKeyElements
    implements Serializable, Equals, HashCode
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "LinkageAirDAEnforcementAction", required = true)
    protected LinkageAirDAEnforcementAction linkageAirDAEnforcementAction;

    /**
     * Gets the value of the linkageAirDAEnforcementAction property.
     * 
     * @return
     *     possible object is
     *     {@link LinkageAirDAEnforcementAction }
     *     
     */
    /*@OneToOne(targetEntity = LinkageAirDAEnforcementAction.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "ICA_DA_ENFRC_ACTN_LNK_ID")*/
    @Embedded
    public LinkageAirDAEnforcementAction getLinkageAirDAEnforcementAction() {
        return linkageAirDAEnforcementAction;
    }

    /**
     * Sets the value of the linkageAirDAEnforcementAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkageAirDAEnforcementAction }
     *     
     */
    public void setLinkageAirDAEnforcementAction(LinkageAirDAEnforcementAction value) {
        this.linkageAirDAEnforcementAction = value;
    }

    @Transient
    public boolean isSetLinkageAirDAEnforcementAction() {
        return (this.linkageAirDAEnforcementAction!= null);
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof AirDAEnforcementActionLinkage)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final AirDAEnforcementActionLinkage that = ((AirDAEnforcementActionLinkage) object);
        {
            LinkageAirDAEnforcementAction lhsLinkageAirDAEnforcementAction;
            lhsLinkageAirDAEnforcementAction = this.getLinkageAirDAEnforcementAction();
            LinkageAirDAEnforcementAction rhsLinkageAirDAEnforcementAction;
            rhsLinkageAirDAEnforcementAction = that.getLinkageAirDAEnforcementAction();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "linkageAirDAEnforcementAction", lhsLinkageAirDAEnforcementAction), LocatorUtils.property(thatLocator, "linkageAirDAEnforcementAction", rhsLinkageAirDAEnforcementAction), lhsLinkageAirDAEnforcementAction, rhsLinkageAirDAEnforcementAction)) {
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
        int currentHashCode = super.hashCode(locator, strategy);
        {
            LinkageAirDAEnforcementAction theLinkageAirDAEnforcementAction;
            theLinkageAirDAEnforcementAction = this.getLinkageAirDAEnforcementAction();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "linkageAirDAEnforcementAction", theLinkageAirDAEnforcementAction), currentHashCode, theLinkageAirDAEnforcementAction);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
