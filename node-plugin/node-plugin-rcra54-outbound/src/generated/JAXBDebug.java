//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.06.15 at 06:46:14 PM EDT 
//

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import net.opengis.gml.AbstractCurveSegmentType;
import net.opengis.gml.AbstractCurveType;
import net.opengis.gml.AbstractFeatureCollectionType;
import net.opengis.gml.AbstractFeatureType;
import net.opengis.gml.AbstractGMLType;
import net.opengis.gml.AbstractGeometricPrimitiveType;
import net.opengis.gml.AbstractGeometryType;
import net.opengis.gml.AbstractRingPropertyType;
import net.opengis.gml.AbstractRingType;
import net.opengis.gml.AbstractSurfaceType;
import net.opengis.gml.ArcByCenterPointType;
import net.opengis.gml.BoundingShapeType;
import net.opengis.gml.CircleByCenterPointType;
import net.opengis.gml.DirectPositionListType;
import net.opengis.gml.DirectPositionType;
import net.opengis.gml.EnvelopeType;
import net.opengis.gml.FeatureCollectionType;
import net.opengis.gml.FeaturePropertyType;
import net.opengis.gml.LengthType;
import net.opengis.gml.LineStringType;
import net.opengis.gml.LinearRingType;
import net.opengis.gml.MeasureType;
import net.opengis.gml.PointType;
import net.opengis.gml.PolygonType;
import org.georss.georss._10.AbstractFeaturePropertyType;
import org.georss.georss._10.WhereType;

import com.windsor.node.plugin.rcra54.domain.generated.AreaAcreageDataType;
import com.windsor.node.plugin.rcra54.domain.generated.CMEFacilitySubmissionDataType;
import com.windsor.node.plugin.rcra54.domain.generated.CSNYDateDataType;
import com.windsor.node.plugin.rcra54.domain.generated.CertificationDataType;
import com.windsor.node.plugin.rcra54.domain.generated.CitationDataType;
import com.windsor.node.plugin.rcra54.domain.generated.ContactAddressDataType;
import com.windsor.node.plugin.rcra54.domain.generated.ContactDataType;
import com.windsor.node.plugin.rcra54.domain.generated.CorrectiveActionAreaDataType;
import com.windsor.node.plugin.rcra54.domain.generated.CorrectiveActionAuthorityDataType;
import com.windsor.node.plugin.rcra54.domain.generated.CorrectiveActionEventDataType;
import com.windsor.node.plugin.rcra54.domain.generated.CorrectiveActionFacilitySubmissionDataType;
import com.windsor.node.plugin.rcra54.domain.generated.CorrectiveActionRelatedEventDataType;
import com.windsor.node.plugin.rcra54.domain.generated.CorrectiveActionRelatedPermitUnitDataType;
import com.windsor.node.plugin.rcra54.domain.generated.CorrectiveActionStatutoryCitationDataType;
import com.windsor.node.plugin.rcra54.domain.generated.CostEstimateDataType;
import com.windsor.node.plugin.rcra54.domain.generated.CostEstimateRelatedMechanismDataType;
import com.windsor.node.plugin.rcra54.domain.generated.EnforcementActionDataType;
import com.windsor.node.plugin.rcra54.domain.generated.EnvironmentalPermitDataType;
import com.windsor.node.plugin.rcra54.domain.generated.EvaluationCommitmentDataType;
import com.windsor.node.plugin.rcra54.domain.generated.EvaluationDataType;
import com.windsor.node.plugin.rcra54.domain.generated.EvaluationViolationDataType;
import com.windsor.node.plugin.rcra54.domain.generated.EventCommitmentDataType;
import com.windsor.node.plugin.rcra54.domain.generated.FacilityOwnerOperatorDataType;
import com.windsor.node.plugin.rcra54.domain.generated.FacilitySubmissionDataType;
import com.windsor.node.plugin.rcra54.domain.generated.FinancialAssuranceFacilitySubmissionDataType;
import com.windsor.node.plugin.rcra54.domain.generated.FinancialAssuranceSubmissionDataType;
import com.windsor.node.plugin.rcra54.domain.generated.GISFacilitySubmissionDataType;
import com.windsor.node.plugin.rcra54.domain.generated.GeographicInformationDataType;
import com.windsor.node.plugin.rcra54.domain.generated.GeographicInformationSubmissionDataType;
import com.windsor.node.plugin.rcra54.domain.generated.GeographicMetadataDataType;
import com.windsor.node.plugin.rcra54.domain.generated.HandlerDataType;
import com.windsor.node.plugin.rcra54.domain.generated.HandlerWasteCodeDataType;
import com.windsor.node.plugin.rcra54.domain.generated.HazardousSecondaryMaterialActivityDataType;
import com.windsor.node.plugin.rcra54.domain.generated.HazardousSecondaryMaterialDataType;
import com.windsor.node.plugin.rcra54.domain.generated.HazardousWasteCMESubmissionDataType;
import com.windsor.node.plugin.rcra54.domain.generated.HazardousWasteCorrectiveActionDataType;
import com.windsor.node.plugin.rcra54.domain.generated.HazardousWasteHandlerSubmissionDataType;
import com.windsor.node.plugin.rcra54.domain.generated.HazardousWastePermitDataType;
import com.windsor.node.plugin.rcra54.domain.generated.LaboratoryHazardousWasteDataType;
import com.windsor.node.plugin.rcra54.domain.generated.LocationAddressDataType;
import com.windsor.node.plugin.rcra54.domain.generated.MailingAddressDataType;
import com.windsor.node.plugin.rcra54.domain.generated.MechanismDataType;
import com.windsor.node.plugin.rcra54.domain.generated.MechanismDetailDataType;
import com.windsor.node.plugin.rcra54.domain.generated.MediaDataType;
import com.windsor.node.plugin.rcra54.domain.generated.MilestoneDataType;
import com.windsor.node.plugin.rcra54.domain.generated.NAICSIdentityDataType;
import com.windsor.node.plugin.rcra54.domain.generated.OtherIDDataType;
import com.windsor.node.plugin.rcra54.domain.generated.PaymentDataType;
import com.windsor.node.plugin.rcra54.domain.generated.PenaltyDataType;
import com.windsor.node.plugin.rcra54.domain.generated.PermitEventDataType;
import com.windsor.node.plugin.rcra54.domain.generated.PermitFacilitySubmissionDataType;
import com.windsor.node.plugin.rcra54.domain.generated.PermitRelatedEventDataType;
import com.windsor.node.plugin.rcra54.domain.generated.PermitSeriesDataType;
import com.windsor.node.plugin.rcra54.domain.generated.PermitUnitDataType;
import com.windsor.node.plugin.rcra54.domain.generated.PermitUnitDetailDataType;
import com.windsor.node.plugin.rcra54.domain.generated.RequestDataType;
import com.windsor.node.plugin.rcra54.domain.generated.SiteWasteActivityDataType;
import com.windsor.node.plugin.rcra54.domain.generated.StateActivityDataType;
import com.windsor.node.plugin.rcra54.domain.generated.SupplementalEnvironmentalProjectDataType;
import com.windsor.node.plugin.rcra54.domain.generated.UniversalWasteActivityDataType;
import com.windsor.node.plugin.rcra54.domain.generated.UsedOilDataType;
import com.windsor.node.plugin.rcra54.domain.generated.ViolationDataType;
import com.windsor.node.plugin.rcra54.domain.generated.ViolationEnforcementDataType;
import com.windsor.node.plugin.rcra54.domain.generated.WasteGeneratorDataType;

public class JAXBDebug {


    public static JAXBContext createContext(ClassLoader classLoader)
        throws JAXBException
    {
        return JAXBContext.newInstance(PaymentDataType.class, CostEstimateDataType.class, CorrectiveActionEventDataType.class, HazardousSecondaryMaterialDataType.class, OtherIDDataType.class, ContactAddressDataType.class, EvaluationViolationDataType.class, CorrectiveActionRelatedEventDataType.class, FinancialAssuranceFacilitySubmissionDataType.class, GeographicInformationDataType.class, HazardousWastePermitDataType.class, GISFacilitySubmissionDataType.class, CSNYDateDataType.class, GeographicInformationSubmissionDataType.class, CMEFacilitySubmissionDataType.class, PenaltyDataType.class, WasteGeneratorDataType.class, EvaluationCommitmentDataType.class, ViolationEnforcementDataType.class, PermitSeriesDataType.class, PermitUnitDataType.class, CostEstimateRelatedMechanismDataType.class, EnvironmentalPermitDataType.class, HazardousWasteCMESubmissionDataType.class, CorrectiveActionAuthorityDataType.class, EventCommitmentDataType.class, UsedOilDataType.class, ViolationDataType.class, GeographicMetadataDataType.class, HandlerWasteCodeDataType.class, PermitRelatedEventDataType.class, FacilitySubmissionDataType.class, NAICSIdentityDataType.class, CertificationDataType.class, EnforcementActionDataType.class, FinancialAssuranceSubmissionDataType.class, HazardousSecondaryMaterialActivityDataType.class, CorrectiveActionRelatedPermitUnitDataType.class, SupplementalEnvironmentalProjectDataType.class, MediaDataType.class, PermitFacilitySubmissionDataType.class, MechanismDetailDataType.class, LocationAddressDataType.class, UniversalWasteActivityDataType.class, SiteWasteActivityDataType.class, StateActivityDataType.class, CitationDataType.class, CorrectiveActionAreaDataType.class, CorrectiveActionStatutoryCitationDataType.class, AreaAcreageDataType.class, HazardousWasteHandlerSubmissionDataType.class, RequestDataType.class, PermitUnitDetailDataType.class, HandlerDataType.class, EvaluationDataType.class, MilestoneDataType.class, HazardousWasteCorrectiveActionDataType.class, MailingAddressDataType.class, FacilityOwnerOperatorDataType.class, CorrectiveActionFacilitySubmissionDataType.class, PermitEventDataType.class, MechanismDataType.class, LaboratoryHazardousWasteDataType.class, ContactDataType.class, AbstractFeaturePropertyType.class, WhereType.class, FeatureCollectionType.class, AbstractFeatureType.class, AbstractGMLType.class, FeaturePropertyType.class, AbstractCurveSegmentType.class, DirectPositionListType.class, AbstractRingPropertyType.class, EnvelopeType.class, LineStringType.class, AbstractCurveType.class, AbstractGeometricPrimitiveType.class, AbstractGeometryType.class, LinearRingType.class, AbstractRingType.class, ArcByCenterPointType.class, DirectPositionType.class, AbstractSurfaceType.class, BoundingShapeType.class, PolygonType.class, AbstractFeatureCollectionType.class, CircleByCenterPointType.class, PointType.class, MeasureType.class, LengthType.class, com.windsor.node.plugin.rcra54.domain.generated.ObjectFactory.class, net.opengis.gml.ObjectFactory.class, org.georss.georss._10.ObjectFactory.class);
    }

}
