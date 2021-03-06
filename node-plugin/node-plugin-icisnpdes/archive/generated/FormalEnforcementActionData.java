//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.12.07 at 11:39:25 AM EST 
//


package com.windsor.node.plugin.icisnpdes.generated;

import java.io.Serializable;
import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
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
 * <p>Java class for FormalEnforcementActionData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FormalEnforcementActionData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.exchangenetwork.net/schema/icis/5}TransactionHeader"/>
 *         &lt;element ref="{http://www.exchangenetwork.net/schema/icis/5}FormalEnforcementAction"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FormalEnforcementActionData", propOrder = {
    "transactionHeader",
    "formalEnforcementAction"
})
@Entity(name = "FormalEnforcementActionData")
@Table(name = "ICS_FRML_ENFRC_ACTN")
@Inheritance(strategy = InheritanceType.JOINED)
public class FormalEnforcementActionData
    implements Serializable, Equals, HashCode
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "TransactionHeader", required = true)
    protected TransactionHeader transactionHeader;
    @XmlElement(name = "FormalEnforcementAction", required = true)
    protected FormalEnforcementAction formalEnforcementAction;
    @XmlTransient
    protected String dbid;

    /**
     * Gets the value of the transactionHeader property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionHeader }
     *     
     */
    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "transactionType", column = @Column(name = "TRANSACTION_TYPE", columnDefinition = "char(1)", length = 1)),
        @AttributeOverride(name = "transactionTimestamp", column = @Column(name = "TRANSACTION_TIMESTAMP"))
    })
    public TransactionHeader getTransactionHeader() {
        return transactionHeader;
    }

    /**
     * Sets the value of the transactionHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionHeader }
     *     
     */
    public void setTransactionHeader(TransactionHeader value) {
        this.transactionHeader = value;
    }

    @Transient
    public boolean isSetTransactionHeader() {
        return (this.transactionHeader!= null);
    }

    /**
     * Gets the value of the formalEnforcementAction property.
     * 
     * @return
     *     possible object is
     *     {@link FormalEnforcementAction }
     *     
     */
    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "enforcementActionName", column = @Column(name = "ENFRC_ACTN_NAME", length = 100)),
        @AttributeOverride(name = "forum", column = @Column(name = "FORUM", length = 255)),
        @AttributeOverride(name = "resolutionTypeCode", column = @Column(name = "RESL_TYPE_CODE", length = 3)),
        @AttributeOverride(name = "combinedOrSupersededByEAID", column = @Column(name = "COMBINED_OR_SUPERSEDED_BY_EAID", length = 20)),
        @AttributeOverride(name = "reasonDeletingRecord", column = @Column(name = "REASON_DELETING_RECORD", length = 500)),
        @AttributeOverride(name = "formalEAUserDefinedField1", column = @Column(name = "FRML_EA_USR_DFND_FLD_1", columnDefinition = "char(1)", length = 1)),
        @AttributeOverride(name = "formalEAUserDefinedField2", column = @Column(name = "FRML_EA_USR_DFND_FLD_2", length = 50)),
        @AttributeOverride(name = "formalEAUserDefinedField3", column = @Column(name = "FRML_EA_USR_DFND_FLD_3", length = 50)),
        @AttributeOverride(name = "formalEAUserDefinedField4", column = @Column(name = "FRML_EA_USR_DFND_FLD_4")),
        @AttributeOverride(name = "formalEAUserDefinedField5", column = @Column(name = "FRML_EA_USR_DFND_FLD_5")),
        @AttributeOverride(name = "formalEAUserDefinedField6", column = @Column(name = "FRML_EA_USR_DFND_FLD_6", columnDefinition = "varchar(4000)", length = 4000)),
        @AttributeOverride(name = "enforcementAgencyName", column = @Column(name = "ENFRC_AGNCY_NAME", length = 100))
    })
    @AssociationOverrides({
        @AssociationOverride(name = "finalOrder", joinColumns = {
            @JoinColumn(name = "ICS_FRML_ENFRC_ACTN_ID")
        }),
        @AssociationOverride(name = "enforcementAgency", joinColumns = {
            @JoinColumn(name = "ICS_FRML_ENFRC_ACTN_ID")
        }),
        @AssociationOverride(name = "enforcementActionGovernmentContact", joinColumns = {
            @JoinColumn(name = "ICS_FRML_ENFRC_ACTN_ID")
        }),
        @AssociationOverride(name = "permitIdentifier", joinTable = @JoinTable(name = "ICS_PRMT_IDENT", joinColumns = {
            @JoinColumn(name = "ICS_FRML_ENFRC_ACTN_ID")
        })),
        @AssociationOverride(name = "enforcementActionTypeCode", joinTable = @JoinTable(name = "ICS_ENFRC_ACTN_TYPE", joinColumns = {
            @JoinColumn(name = "ICS_FRML_ENFRC_ACTN_ID")
        })),
        @AssociationOverride(name = "programsViolatedCode", joinTable = @JoinTable(name = "ICS_PROGS_VIOL", joinColumns = {
            @JoinColumn(name = "ICS_FRML_ENFRC_ACTN_ID")
        }))
    })
    public FormalEnforcementAction getFormalEnforcementAction() {
        return formalEnforcementAction;
    }

    /**
     * Sets the value of the formalEnforcementAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormalEnforcementAction }
     *     
     */
    public void setFormalEnforcementAction(FormalEnforcementAction value) {
        this.formalEnforcementAction = value;
    }

    @Transient
    public boolean isSetFormalEnforcementAction() {
        return (this.formalEnforcementAction!= null);
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
    @Column(name = "ICS_FRML_ENFRC_ACTN_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
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
        if (!(object instanceof FormalEnforcementActionData)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final FormalEnforcementActionData that = ((FormalEnforcementActionData) object);
        {
            TransactionHeader lhsTransactionHeader;
            lhsTransactionHeader = this.getTransactionHeader();
            TransactionHeader rhsTransactionHeader;
            rhsTransactionHeader = that.getTransactionHeader();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "transactionHeader", lhsTransactionHeader), LocatorUtils.property(thatLocator, "transactionHeader", rhsTransactionHeader), lhsTransactionHeader, rhsTransactionHeader)) {
                return false;
            }
        }
        {
            FormalEnforcementAction lhsFormalEnforcementAction;
            lhsFormalEnforcementAction = this.getFormalEnforcementAction();
            FormalEnforcementAction rhsFormalEnforcementAction;
            rhsFormalEnforcementAction = that.getFormalEnforcementAction();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "formalEnforcementAction", lhsFormalEnforcementAction), LocatorUtils.property(thatLocator, "formalEnforcementAction", rhsFormalEnforcementAction), lhsFormalEnforcementAction, rhsFormalEnforcementAction)) {
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
            TransactionHeader theTransactionHeader;
            theTransactionHeader = this.getTransactionHeader();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "transactionHeader", theTransactionHeader), currentHashCode, theTransactionHeader);
        }
        {
            FormalEnforcementAction theFormalEnforcementAction;
            theFormalEnforcementAction = this.getFormalEnforcementAction();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "formalEnforcementAction", theFormalEnforcementAction), currentHashCode, theFormalEnforcementAction);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
