package tools.vitruv.methodologisttemplate.vsum.ChangePropSpec;

import AdministrationExample.AdministrationExamplePackage;
import AdministrationExample.impl.AdministrationExamplePackageImpl;
import HospitalExample.HospitalExamplePackage;
import HospitalExample.impl.HospitalExamplePackageImpl;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import tools.vitruv.change.composite.MetamodelDescriptor;
import tools.vitruv.dsls.tgg.emoflonintegration.TGGChangePropagationSpecification;

import java.io.File;
import java.util.Set;

public class HospitalToAdministrationCPS extends TGGChangePropagationSpecification {

    static Logger logger = Logger.getLogger(Model1ToModel2TGGCPS.class);

    private static final MetamodelDescriptor SRCMetamodelDescriptor = MetamodelDescriptor.with(Set.of(
            "HospitalExample"));
    private static final MetamodelDescriptor TRGMetamodelDescriptor = MetamodelDescriptor.with(Set.of(
            "AdministrationExample"));

    public HospitalToAdministrationCPS(File ibexProjectPath, EClass target, URI targetRootURI) {
        this(
                SRCMetamodelDescriptor, TRGMetamodelDescriptor, //we propagate from model1 to model2
                SRCMetamodelDescriptor, TRGMetamodelDescriptor,
                "platform:/resource/HospitalExample/model/HospitalExample.ecore",
                "platform:/resource/AdministrationExample/model/AdministrationExample.ecore",
                ibexProjectPath,
                target,
                targetRootURI,
                false);
    }

    public HospitalToAdministrationCPS(MetamodelDescriptor sourceMetamodelDescriptor, MetamodelDescriptor targetMetamodelDescriptor,
                                  MetamodelDescriptor SRCMetamodelDescriptor, MetamodelDescriptor TRGMetamodelDescriptor,
                                  String sourceMetamodelPlatformUri, String targetMetamodelPlatformUri, File ibexProjectPath,
                                  EClass targetRootEclass, URI targetRootURI, boolean useShortcutRules) {
        super(sourceMetamodelDescriptor, targetMetamodelDescriptor,
                SRCMetamodelDescriptor, TRGMetamodelDescriptor,
                sourceMetamodelPlatformUri, targetMetamodelPlatformUri,
                ibexProjectPath, Set.of(targetRootEclass), targetRootURI, useShortcutRules);
        org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.putIfAbsent(
                HospitalExamplePackage.eNS_URI,
                HospitalExamplePackageImpl.eINSTANCE
        );
        org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.putIfAbsent(
                AdministrationExamplePackage.eNS_URI,
                AdministrationExamplePackageImpl.eINSTANCE
        );
    }
}
