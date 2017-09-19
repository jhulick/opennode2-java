//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.09.02 at 11:05:46 AM PDT 
//


package com.windsor.node.plugin.icisair.domain.generated;

import java.io.Serializable;
import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
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
 * <p>Java class for AirFacilityData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirFacilityData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.exchangenetwork.net/schema/icis/5}TransactionHeader"/>
 *         &lt;element ref="{http://www.exchangenetwork.net/schema/icis/5}AirFacility"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirFacilityData", propOrder = {
    "transactionHeader",
    "airFacility"
})
@Entity(name = "AirFacilityData")
@Table(name = "VW_ICA_FAC_GEO_COORD")
@Inheritance(strategy = InheritanceType.JOINED)
public class AirFacilityData
    implements Serializable, Equals, HashCode
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "TransactionHeader", required = true)
    protected TransactionHeader transactionHeader;
    @XmlElement(name = "AirFacility", required = true)
    protected AirFacility airFacility;
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
     * Gets the value of the airFacility property.
     * 
     * @return
     *     possible object is
     *     {@link AirFacility }
     *     
     */
    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "facilitySiteName", column = @Column(name = "FAC_SITE_NAME", length = 80)),
        @AttributeOverride(name = "locationAddressText", column = @Column(name = "LOC_ADDR_TXT", length = 50)),
        @AttributeOverride(name = "supplementalLocationText", column = @Column(name = "SUPPL_LOC_TXT", length = 50)),
        @AttributeOverride(name = "localityName", column = @Column(name = "LOCALITY_NAME", length = 60)),
        @AttributeOverride(name = "locationAddressCountyCode", column = @Column(name = "LOC_ADDR_COUNTY_CODE", length = 5)),
        @AttributeOverride(name = "locationAddressCityCode", column = @Column(name = "LOC_ADDR_CITY_CODE", length = 12)),
        @AttributeOverride(name = "locationStateCode", column = @Column(name = "LOC_ST_CODE", columnDefinition = "char(2)", length = 2)),
        @AttributeOverride(name = "locationZipCode", column = @Column(name = "LOC_ZIP_CODE", length = 14)),
        @AttributeOverride(name = "lconCode", column = @Column(name = "LCON_CODE", length = 3)),
        @AttributeOverride(name = "tribalLandCode", column = @Column(name = "TRIBAL_LAND_CODE", length = 4)),
        @AttributeOverride(name = "facilityDescription", column = @Column(name = "FAC_DESC", length = 250)),
        @AttributeOverride(name = "facilityTypeOfOwnershipCode", column = @Column(name = "FAC_TYPE_OF_OWNER_CODE", length = 3)),
        @AttributeOverride(name = "registrationNumber", column = @Column(name = "REG_NUM", length = 15)),
        @AttributeOverride(name = "smallBusinessIndicator", column = @Column(name = "SMALL_BUSNSS_IND", columnDefinition = "char(1)", length = 1)),
        @AttributeOverride(name = "federallyReportableIndicator", column = @Column(name = "FEDERALLY_REP_IND", columnDefinition = "char(1)", length = 1)),
        @AttributeOverride(name = "sourceUniformResourceLocatorURL", column = @Column(name = "SRC_UNIFM_RSRC_LOCATOR_URL", length = 100)),
        @AttributeOverride(name = "environmentalJusticeCode", column = @Column(name = "ENVR_JUSTICE_CODE", length = 3)),
        @AttributeOverride(name = "facilityCongressionalDistrictNumber", column = @Column(name = "FAC_CONGR_DISTRICT_NUM", scale = 0)),
        @AttributeOverride(name = "facilityUserDefinedField1", column = @Column(name = "FAC_USR_DEF_FLD_1", length = 30)),
        @AttributeOverride(name = "facilityUserDefinedField2", column = @Column(name = "FAC_USR_DEF_FLD_2", length = 30)),
        @AttributeOverride(name = "facilityUserDefinedField3", column = @Column(name = "FAC_USR_DEF_FLD_3", length = 30)),
        @AttributeOverride(name = "facilityUserDefinedField4", column = @Column(name = "FAC_USR_DEF_FLD_4", length = 30)),
        @AttributeOverride(name = "facilityUserDefinedField5", column = @Column(name = "FAC_USR_DEF_FLD_5", length = 30)),
        @AttributeOverride(name = "facilityComments", column = @Column(name = "FAC_CMNTS", length = 4000)),
        @AttributeOverride(name = "airGeographicCoordinateData.utmCoordinate1", column = @Column(name = "UTM_COORD_1", length = 20)),
        @AttributeOverride(name = "airGeographicCoordinateData.utmCoordinate2", column = @Column(name = "UTM_COORD_2", length = 20)),
        @AttributeOverride(name = "airGeographicCoordinateData.utmCoordinate3", column = @Column(name = "UTM_COORD_3", length = 20)),
        @AttributeOverride(name = "portableSourceData.portableSourceIndicator", column = @Column(name = "PORT_SRC_IND", columnDefinition = "char(1)", length = 1))
    })
    @AssociationOverrides({
        @AssociationOverride(name = "sicCodeDetails", joinTable = @JoinTable(name = "ICA_SIC_CODE", joinColumns = {
            @JoinColumn(name = "ICA_FAC_ID", referencedColumnName = "ICA_FAC_ID")
        }, inverseJoinColumns = {
            @JoinColumn(name = "ICA_FAC_ID")
        })),
        @AssociationOverride(name = "naicsCodeDetails", joinTable = @JoinTable(name = "ICA_NAICS_CODE", joinColumns = {
            @JoinColumn(name = "ICA_FAC_ID", referencedColumnName = "ICA_FAC_ID")
        }, inverseJoinColumns = {
            @JoinColumn(name = "ICA_FAC_ID")
        })),
        @AssociationOverride(name = "universeIndicatorCode", joinTable = @JoinTable(name = "ICA_UNIVERSE_IND", joinColumns = {
            @JoinColumn(name = "ICA_FAC_ID")
        })),
        /*@AssociationOverride(name = "portableSourceData.portableSource", joinTable = @JoinTable(name = "ICA_PORT_SRC", joinColumns = {
            @JoinColumn(name = "ICA_FAC_ID", referencedColumnName = "ICA_FAC_ID", insertable = false, updatable = false)
        }, inverseJoinColumns = {
            @JoinColumn(name = "ICA_FAC_ID", insertable = false, updatable = false)
        })),*/
        @AssociationOverride(name = "portableSourceData.portableSource", joinTable = @JoinTable(name = "ICA_PORT_SRC", joinColumns = {
                        @JoinColumn(name = "ICA_FAC_ID", insertable = false, updatable = false)
                    })),
        @AssociationOverride(name = "facilityContact.contact", joinColumns = {
            @JoinColumn(name = "ICA_FAC_ID")
        }),
        @AssociationOverride(name = "facilityAddress.address", joinColumns = {
            @JoinColumn(name = "ICA_FAC_ID")
        })
    })
    public AirFacility getAirFacility() {
        return airFacility;
    }

    /**
     * Sets the value of the airFacility property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirFacility }
     *     
     */
    public void setAirFacility(AirFacility value) {
        this.airFacility = value;
    }

    @Transient
    public boolean isSetAirFacility() {
        return (this.airFacility!= null);
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
    @Column(name = "ICA_FAC_ID")
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
        if (!(object instanceof AirFacilityData)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final AirFacilityData that = ((AirFacilityData) object);
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
            AirFacility lhsAirFacility;
            lhsAirFacility = this.getAirFacility();
            AirFacility rhsAirFacility;
            rhsAirFacility = that.getAirFacility();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "airFacility", lhsAirFacility), LocatorUtils.property(thatLocator, "airFacility", rhsAirFacility), lhsAirFacility, rhsAirFacility)) {
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
            AirFacility theAirFacility;
            theAirFacility = this.getAirFacility();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "airFacility", theAirFacility), currentHashCode, theAirFacility);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}