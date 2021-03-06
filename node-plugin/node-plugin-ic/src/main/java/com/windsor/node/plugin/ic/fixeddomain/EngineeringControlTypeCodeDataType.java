//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.26 at 02:36:56 PM PDT 
//


package com.windsor.node.plugin.ic.fixeddomain;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EngineeringControlTypeCodeDataType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EngineeringControlTypeCodeDataType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Vapor Mitigation System"/>
 *     &lt;enumeration value="Treatment System"/>
 *     &lt;enumeration value="Soil or Vegetative Cap"/>
 *     &lt;enumeration value="Sheet Piling or Slurry Wall"/>
 *     &lt;enumeration value="Paved or Concrete Cap"/>
 *     &lt;enumeration value="Liner System"/>
 *     &lt;enumeration value="Leachate Collection System"/>
 *     &lt;enumeration value="Landfill Gas System"/>
 *     &lt;enumeration value="Interceptor Wells or Trench"/>
 *     &lt;enumeration value="Ground Water Recovery"/>
 *     &lt;enumeration value="Building"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EngineeringControlTypeCodeDataType")
@XmlEnum
public enum EngineeringControlTypeCodeDataType {

    @XmlEnumValue("Vapor Mitigation System")
    VAPOR_MITIGATION_SYSTEM("Vapor Mitigation System"),
    @XmlEnumValue("Treatment System")
    TREATMENT_SYSTEM("Treatment System"),
    @XmlEnumValue("Soil or Vegetative Cap")
    SOIL_OR_VEGETATIVE_CAP("Soil or Vegetative Cap"),
    @XmlEnumValue("Sheet Piling or Slurry Wall")
    SHEET_PILING_OR_SLURRY_WALL("Sheet Piling or Slurry Wall"),
    @XmlEnumValue("Paved or Concrete Cap")
    PAVED_OR_CONCRETE_CAP("Paved or Concrete Cap"),
    @XmlEnumValue("Liner System")
    LINER_SYSTEM("Liner System"),
    @XmlEnumValue("Leachate Collection System")
    LEACHATE_COLLECTION_SYSTEM("Leachate Collection System"),
    @XmlEnumValue("Landfill Gas System")
    LANDFILL_GAS_SYSTEM("Landfill Gas System"),
    @XmlEnumValue("Interceptor Wells or Trench")
    INTERCEPTOR_WELLS_OR_TRENCH("Interceptor Wells or Trench"),
    @XmlEnumValue("Ground Water Recovery")
    GROUND_WATER_RECOVERY("Ground Water Recovery"),
    @XmlEnumValue("Building")
    BUILDING("Building"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    EngineeringControlTypeCodeDataType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EngineeringControlTypeCodeDataType fromValue(String v) {
        for (EngineeringControlTypeCodeDataType c: EngineeringControlTypeCodeDataType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
