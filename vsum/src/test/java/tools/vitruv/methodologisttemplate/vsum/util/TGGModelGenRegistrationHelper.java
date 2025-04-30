package tools.vitruv.methodologisttemplate.vsum.util;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;
import org.emoflon.ibex.tgg.operational.IBlackInterpreter;
import org.emoflon.ibex.tgg.operational.csp.constraints.factories.RuntimeTGGAttrConstraintFactory;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.modules.IbexExecutable;
import org.emoflon.ibex.tgg.runtime.democles.DemoclesTGGEngine;
import org.emoflon.ibex.tgg.runtime.hipe.HiPETGGEngine;
import tools.vitruv.dsls.tgg.emoflonintegration.ibex.hipe.SimpleNameSupportingURLClassLoader;
import tools.vitruv.dsls.tgg.emoflonintegration.ibex.hipe.VitruviusHiPETGGEngine;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.net.URL;

public class TGGModelGenRegistrationHelper implements IRegistrationHelper {
    protected static final Logger logger = Logger.getLogger(TGGModelGenRegistrationHelper.class);

    private EPackage sourceMetamodelPackage;
    private EPackage targetMetamodelPackage;

    private String sourceMetamodelPlatformUri;
    private String targetMetamodelPlatformUri;

    private File ibexProjectPath;
    private IBlackInterpreter blackInterpreter;

    @Override
    public void registerMetamodels(ResourceSet resourceSet, IbexExecutable ibexExecutable) throws IOException {
        //the democles way
        logger.trace("Called registerMetamodels with " );
        resourceSet.getAllContents().forEachRemaining(content -> logger.trace("    - " + content));
        resourceSet.getPackageRegistry().put(sourceMetamodelPackage.getNsURI() + ".ecore", sourceMetamodelPackage);
        resourceSet.getPackageRegistry().put(targetMetamodelPackage.getNsURI() + ".ecore", targetMetamodelPackage);

        resourceSet.getPackageRegistry().put(sourceMetamodelPlatformUri, sourceMetamodelPackage);
        resourceSet.getPackageRegistry().put(targetMetamodelPlatformUri, targetMetamodelPackage);
        ibexExecutable.getResourceHandler().loadAndRegisterMetamodel(sourceMetamodelPlatformUri);
        ibexExecutable.getResourceHandler().loadAndRegisterMetamodel(targetMetamodelPlatformUri);
        logger.trace("After registerMetamodels");
    }

    @Override
    public IbexOptions createIbexOptions() {
        IbexOptions ibexOptions = new IbexOptions() //TODO is blackinterpreter needed? if yes --> solve compilation problems..
                .blackInterpreter(blackInterpreter)
//                .blackInterpreter(new DemoclesTGGEngine())
//                .blackInterpreter(new ModelgenDemoclesTGGEngine())
                .project.workspacePath(ibexProjectPath.getParentFile().getAbsolutePath())
                .project.name(ibexProjectPath.getName())
                .project.path(ibexProjectPath.getName())
                .repair.repairAttributes(true)
                .debug.ibexDebug(false)
                .registrationHelper(this);

        tryToFindAndAddUserDefinedAttributeConstraints(ibexOptions);
        return ibexOptions;
    }

    private void tryToFindAndAddUserDefinedAttributeConstraints(IbexOptions ibexOptions) {
        try {
            //class loader should have access to this CL's classes as well as the ibex project

            Class userDefinedConstraintFactoryClass =
                    SimpleNameSupportingURLClassLoader.getInstance(new URL[]{new File(ibexProjectPath, "/bin").toURI().toURL()})
//                    new SimpleNameSupportingURLClassLoader(
//                    new URL[]{new File(ibexProjectPath, "/bin").toURI().toURL()},
//                    VitruviusHiPETGGEngine.class.getClassLoader()) //todo schöner machen
                    .loadClass("org.emoflon.ibex.tgg.operational.csp.constraints.factories." + ibexOptions.project.name().toLowerCase() + ".UserDefinedRuntimeTGGAttrConstraintFactory");

            ibexOptions.csp.userDefinedConstraints((RuntimeTGGAttrConstraintFactory) userDefinedConstraintFactoryClass.getConstructor().newInstance());
        } catch (MalformedURLException | InvocationTargetException | InstantiationException | IllegalAccessException | NoSuchMethodException e) {
            logger.warn("Couldn't load UserDefinedRuntimeTGGAttrConstraintFactory");
        }
    }

    public TGGModelGenRegistrationHelper withBlackInterpeter(IBlackInterpreter blackInterpeter) {
        this.blackInterpreter = blackInterpeter;
        return this;
    }

    public TGGModelGenRegistrationHelper withIbexProjectPath(File ibexProjectPath) {
        this.ibexProjectPath = ibexProjectPath;
        return this;
    }

    public TGGModelGenRegistrationHelper withSRCMetamodelPackage(EPackage SRCMetamodelPackage) {
        this.sourceMetamodelPackage = SRCMetamodelPackage;
        return this;
    }
    public TGGModelGenRegistrationHelper withTRGMetamodelPackage(EPackage TRGMetamodelPackage) {
        this.targetMetamodelPackage = TRGMetamodelPackage;
        return this;
    }
    public TGGModelGenRegistrationHelper withSRCMetamodelPlatformUri(String SRCMetamodelPlatformUri) {
        this.sourceMetamodelPlatformUri = SRCMetamodelPlatformUri;
        return this;
    }
    public TGGModelGenRegistrationHelper withTRGMetamodelPlatformUri(String TRGMetamodelPlatformUri) {
        this.targetMetamodelPlatformUri = TRGMetamodelPlatformUri;
        return this;
    }
}
