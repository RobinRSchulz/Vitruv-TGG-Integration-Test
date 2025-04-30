package tools.vitruv.methodologisttemplate.vsum.ChangePropSpec;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.uml2.uml.internal.impl.UMLPackageImpl;
import org.emftext.language.java.impl.JavaPackageImpl;
import tools.vitruv.change.composite.MetamodelDescriptor;
import tools.vitruv.dsls.tgg.emoflonintegration.TGGChangePropagationSpecification;

import java.io.File;
import java.util.Set;

public class JavaToUmlCPS extends TGGChangePropagationSpecification {

    static Logger logger = Logger.getLogger(Model1ToModel2TGGCPS.class);

    private static final MetamodelDescriptor SRCMetamodelDescriptor = MetamodelDescriptor.with(Set.of(
            "http://www.emftext.org/java"));
    private static final MetamodelDescriptor TRGMetamodelDescriptor = MetamodelDescriptor.with(Set.of(
            "http://www.eclipse.org/uml2/5.0.0/UML"));

    public JavaToUmlCPS(File ibexProjectPath, Set<EClass> targetRootEclasses, URI targetRootURI) {
        this(
                SRCMetamodelDescriptor, TRGMetamodelDescriptor, //we propagate from model1 to model2
                SRCMetamodelDescriptor, TRGMetamodelDescriptor,
//                "platform:/resource/unpackedResources/java/metamodel/java.ecore",
//                "platform:/resource/unpackedResources/uml/model/UML.ecore",
                "platform:/plugin/org.emftext.language.java/metamodel/java.ecore",
                "platform:/plugin/org.eclipse.uml2.uml/model/UML.ecore",
                ibexProjectPath,
                targetRootEclasses,
                targetRootURI,
//                true
                false
        );
    }

    public JavaToUmlCPS(MetamodelDescriptor sourceMetamodelDescriptor, MetamodelDescriptor targetMetamodelDescriptor,
                        MetamodelDescriptor SRCMetamodelDescriptor, MetamodelDescriptor TRGMetamodelDescriptor,
                        String sourceMetamodelPlatformUri, String targetMetamodelPlatformUri, File ibexProjectPath,
                        Set<EClass> targetRootEclasses, URI targetRootURI, boolean useShortcutRules) {
        super(sourceMetamodelDescriptor, targetMetamodelDescriptor,
                SRCMetamodelDescriptor, TRGMetamodelDescriptor,
                sourceMetamodelPlatformUri, targetMetamodelPlatformUri,
                ibexProjectPath, targetRootEclasses, targetRootURI, useShortcutRules);
        org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.putIfAbsent(
                JavaPackageImpl.eNS_URI,
                JavaPackageImpl.eINSTANCE
        );
        org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.putIfAbsent(
                UMLPackageImpl.eNS_URI,
                UMLPackageImpl.eINSTANCE
        );
    }
}
