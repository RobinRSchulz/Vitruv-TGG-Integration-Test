package tools.vitruv.methodologisttemplate.vsum.ChangePropSpec;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import tools.vitruv.change.composite.MetamodelDescriptor;
import tools.vitruv.dsls.tgg.emoflonintegration.TGGChangePropagationSpecification;

import java.io.File;
import java.util.Set;

public class Model2ToModel1TGGCPS extends TGGChangePropagationSpecification {

    static Logger logger = Logger.getLogger(Model1ToModel2TGGCPS.class);

    private static final MetamodelDescriptor SRCMetamodelDescriptor = MetamodelDescriptor.with(Set.of(
            "http://vitruv.tools/methodologisttemplate/model"));
    private static final MetamodelDescriptor TRGMetamodelDescriptor = MetamodelDescriptor.with(Set.of(
            "http://vitruv.tools/methodologisttemplate/model2"));

    public Model2ToModel1TGGCPS(File ibexProjectPath, EClass target, URI targetRootURI) {
        this(
                SRCMetamodelDescriptor, TRGMetamodelDescriptor,
                "platform:/resource/tools.vitruv.methodologisttemplate.model/src/main/ecore/model.ecore",
                "platform:/resource/tools.vitruv.methodologisttemplate.model/src/main/ecore/model2.ecore",
                ibexProjectPath,
                target,
                targetRootURI);
    }

    public Model2ToModel1TGGCPS(
            MetamodelDescriptor SRCMetamodelDescriptor, MetamodelDescriptor TRGMetamodelDescriptor,
            String sourceMetamodelPlatformUri, String targetMetamodelPlatformUri,
            File ibexProjectPath, EClass targetRootEclass, URI targetRootURI) {
        super(TRGMetamodelDescriptor, SRCMetamodelDescriptor,  //we propagate from model2 to model1!
                SRCMetamodelDescriptor, TRGMetamodelDescriptor,
                targetMetamodelPlatformUri, sourceMetamodelPlatformUri,
                ibexProjectPath, targetRootEclass, targetRootURI);

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

