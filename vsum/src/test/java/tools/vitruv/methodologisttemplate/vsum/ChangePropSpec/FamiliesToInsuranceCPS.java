package tools.vitruv.methodologisttemplate.vsum.ChangePropSpec;

import edu.kit.ipd.sdq.metamodels.families.impl.FamiliesPackageImpl;
import edu.kit.ipd.sdq.metamodels.insurance.impl.InsurancePackageImpl;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import tools.vitruv.change.composite.MetamodelDescriptor;
import tools.vitruv.dsls.tgg.emoflonintegration.TGGChangePropagationSpecification;

import java.io.File;
import java.util.Set;

public class FamiliesToInsuranceCPS extends TGGChangePropagationSpecification {

    static Logger logger = Logger.getLogger(Model1ToModel2TGGCPS.class);

    private static final MetamodelDescriptor SRCMetamodelDescriptor = MetamodelDescriptor.with(Set.of(
            "edu.kit.ipd.sdq.metamodels.families"));
    private static final MetamodelDescriptor TRGMetamodelDescriptor = MetamodelDescriptor.with(Set.of(
            "edu.kit.ipd.sdq.metamodels.insurance"));

    public FamiliesToInsuranceCPS(File ibexProjectPath, EClass target, URI targetRootURI) {
        this(
                SRCMetamodelDescriptor, TRGMetamodelDescriptor, //we propagate from model1 to model2
                SRCMetamodelDescriptor, TRGMetamodelDescriptor,
                "platform:/resource/Families/model/families.ecore",
                "platform:/resource/Insurance/model/insurance.ecore",
                ibexProjectPath,
                target,
                targetRootURI);
    }

    public FamiliesToInsuranceCPS(MetamodelDescriptor sourceMetamodelDescriptor, MetamodelDescriptor targetMetamodelDescriptor,
                                  MetamodelDescriptor SRCMetamodelDescriptor, MetamodelDescriptor TRGMetamodelDescriptor,
                                  String sourceMetamodelPlatformUri, String targetMetamodelPlatformUri, File ibexProjectPath,
                                  EClass targetRootEclass, URI targetRootURI) {
        super(sourceMetamodelDescriptor, targetMetamodelDescriptor,
                SRCMetamodelDescriptor, TRGMetamodelDescriptor,
                sourceMetamodelPlatformUri, targetMetamodelPlatformUri,
                ibexProjectPath, Set.of(targetRootEclass), targetRootURI);
        org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.putIfAbsent(
                FamiliesPackageImpl.eNS_URI,
                FamiliesPackageImpl.eINSTANCE
        );
        org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.putIfAbsent(
                InsurancePackageImpl.eNS_URI,
                InsurancePackageImpl.eINSTANCE
        );
    }
}
