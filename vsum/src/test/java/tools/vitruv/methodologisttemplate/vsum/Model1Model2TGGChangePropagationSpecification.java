package tools.vitruv.methodologisttemplate.vsum;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import tools.vitruv.change.composite.MetamodelDescriptor;
import tools.vitruv.dsls.tgg.emoflonintegration.TGGChangePropagationSpecification;
import tools.vitruv.methodologisttemplate.model.model2.Model2Package;
import tools.vitruv.methodologisttemplate.model.model2.Root;

import java.io.File;
import java.util.Set;

public class Model1Model2TGGChangePropagationSpecification extends TGGChangePropagationSpecification {

    static Logger logger = Logger.getLogger(Model1Model2TGGChangePropagationSpecification.class);
    public Model1Model2TGGChangePropagationSpecification(File ibexProjectPath, EClass target, URI targetRootURI) {
        this(
                MetamodelDescriptor.with(Set.of(
                        "http://vitruv.tools/methodologisttemplate/model")),
                MetamodelDescriptor.with(Set.of(
                        "http://vitruv.tools/methodologisttemplate/model2")),
                "platform:/resource/tools.vitruv.methodologisttemplate.model/src/main/ecore/model.ecore",
                "platform:/resource/tools.vitruv.methodologisttemplate.model/src/main/ecore/model2.ecore",
                ibexProjectPath,
                target,
                targetRootURI);
    }

    public Model1Model2TGGChangePropagationSpecification(MetamodelDescriptor sourceMetamodelDescriptor, MetamodelDescriptor targetMetamodelDescriptor,
                                                         String sourceMetamodelPlatformUri, String targetMetamodelPlatformUri,
                                                         File ibexProjectPath, EClass targetRootEclass, URI targetRootURI) {
        super(sourceMetamodelDescriptor, targetMetamodelDescriptor, sourceMetamodelPlatformUri, targetMetamodelPlatformUri,
                ibexProjectPath, targetRootEclass, targetRootURI);
        logger.debug("In Constructor for Model1Model2TGGChangePropagationSpecification.");
        logger.debug("Ensuring Metamodels being registered: \n  - src NS_URI: "
                + tools.vitruv.methodologisttemplate.model.model.impl.ModelPackageImpl.eNS_URI
                + "\n  - trg NS_URI: "
                + tools.vitruv.methodologisttemplate.model.model2.impl.Model2PackageImpl.eNS_URI
        );
        org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.putIfAbsent(
                tools.vitruv.methodologisttemplate.model.model.impl.ModelPackageImpl.eNS_URI,
                tools.vitruv.methodologisttemplate.model.model.impl.ModelPackageImpl.eINSTANCE
        );
        org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.putIfAbsent(
                tools.vitruv.methodologisttemplate.model.model2.impl.Model2PackageImpl.eNS_URI,
                tools.vitruv.methodologisttemplate.model.model2.impl.Model2PackageImpl.eINSTANCE
        );
    }
}
