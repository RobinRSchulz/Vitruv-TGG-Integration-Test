package tools.vitruv.methodologisttemplate.vsum;

import org.apache.log4j.Logger;
import tools.vitruv.change.composite.MetamodelDescriptor;
import tools.vitruv.dsls.tgg.emoflonintegration.TGGChangePropagationSpecification;

import java.util.Set;

public class Model1Model2TGGChangePropagationSpecification extends TGGChangePropagationSpecification {

    static Logger logger = Logger.getLogger(Model1Model2TGGChangePropagationSpecification.class);
    public Model1Model2TGGChangePropagationSpecification() {
        this(MetamodelDescriptor.with(Set.of("http://vitruv.tools/methodologisttemplate/model")),
                MetamodelDescriptor.with(Set.of("http://vitruv.tools/methodologisttemplate/model2")));
        // TODO target-Modell-Pfad erwarten (oder im Konstruktor)
    }

    public Model1Model2TGGChangePropagationSpecification(MetamodelDescriptor sourceMetamodelDescriptor, MetamodelDescriptor targetMetamodelDescriptor) {
        super(sourceMetamodelDescriptor, targetMetamodelDescriptor);
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
