package org.emoflon.ibex.tgg.run.families2insurance.config;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.tgg.operational.csp.constraints.factories.families2insurance.UserDefinedRuntimeTGGAttrConstraintFactory;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.modules.IbexExecutable;
import org.emoflon.ibex.tgg.operational.strategies.opt.BWD_OPT;
import org.emoflon.ibex.tgg.operational.strategies.opt.FWD_OPT;
import org.emoflon.ibex.tgg.runtime.hipe.HiPETGGEngine;
import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;

import Families2Insurance.Families2InsurancePackage;
import Families2Insurance.impl.Families2InsurancePackageImpl;
import <<SRC_Package>>.impl.<<SRC_Package>>PackageImpl;
import <<TRG_Package>>.impl.<<TRG_Package>>PackageImpl;

public class HiPERegistrationHelper implements IRegistrationHelper {
	
	/** Create default options **/
	public final void setWorkspaceRootDirectory(ResourceSet resourceSet) throws IOException {
		final String root = "../";
		URI key = URI.createPlatformResourceURI("/", true);
		URI value = URI.createFileURI(new File(root).getCanonicalPath() + File.separatorChar);
		resourceSet.getURIConverter().getURIMap().put(key, value);
	}

	/** Load and register source and target metamodels */
	public void registerMetamodels(ResourceSet rs, IbexExecutable executable) throws IOException {
		
		// Set correct workspace root
		setWorkspaceRootDirectory(rs);
		
		// Load and register source and target metamodels
		EPackage familiesPack = null;
		EPackage insurancePack = null;
		EPackage families2insurancePack = null;
		
		if(executable instanceof FWD_OPT) {
			Resource res = executable.getResourceHandler().loadResource("platform:/resource/Insurance/model/Insurance.ecore");
			insurancePack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
			
			res = executable.getResourceHandler().loadResource("platform:/resource/Families2Insurance/model/Families2Insurance.ecore");
			families2insurancePack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
		}
				
		if(executable instanceof BWD_OPT) {
			Resource res = executable.getResourceHandler().loadResource("platform:/resource/Families/model/Families.ecore");
			familiesPack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
			
			res = executable.getResourceHandler().loadResource("platform:/resource/Families2Insurance/model/Families2Insurance.ecore");
			families2insurancePack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
		}

		if(familiesPack == null)
			familiesPack = <<SRC_Package>>PackageImpl.init();
				
		if(insurancePack == null)
			insurancePack = <<TRG_Package>>PackageImpl.init();
		
		if(families2insurancePack == null) {
			families2insurancePack = Families2InsurancePackageImpl.init();
			rs.getPackageRegistry().put("platform:/resource/Families2Insurance/model/Families2Insurance.ecore", Families2InsurancePackage.eINSTANCE);
			rs.getPackageRegistry().put("platform:/plugin/Families2Insurance/model/Families2Insurance.ecore", Families2InsurancePackage.eINSTANCE);
		}
			
		rs.getPackageRegistry().put("platform:/resource/Families/model/Families.ecore", familiesPack);
	    rs.getPackageRegistry().put("platform:/plugin/Families/model/Families.ecore", familiesPack);	
			
		rs.getPackageRegistry().put("platform:/resource/Insurance/model/Insurance.ecore", insurancePack);
		rs.getPackageRegistry().put("platform:/plugin/Insurance/model/Insurance.ecore", insurancePack);
	}

	/** Create default options **/
	public IbexOptions createIbexOptions() {
		IbexOptions options = new IbexOptions();
		options.blackInterpreter(new HiPETGGEngine());
		options.project.name("Families2Insurance");
		options.project.path("Families2Insurance");
		options.debug.ibexDebug(false);
		options.csp.userDefinedConstraints(new UserDefinedRuntimeTGGAttrConstraintFactory());
		options.registrationHelper(this);
		return options;
	}
}
