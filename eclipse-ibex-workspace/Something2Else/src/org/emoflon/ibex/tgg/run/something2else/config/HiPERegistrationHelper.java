package org.emoflon.ibex.tgg.run.something2else.config;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.tgg.operational.csp.constraints.factories.something2else.UserDefinedRuntimeTGGAttrConstraintFactory;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.modules.IbexExecutable;
import org.emoflon.ibex.tgg.operational.strategies.opt.BWD_OPT;
import org.emoflon.ibex.tgg.operational.strategies.opt.FWD_OPT;
import org.emoflon.ibex.tgg.runtime.hipe.HiPETGGEngine;
import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;

import Something2Else.Something2ElsePackage;
import Something2Else.impl.Something2ElsePackageImpl;

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
		EPackage something2elsePack = null;
		
		if(executable instanceof FWD_OPT) {
			Resource res = executable.getResourceHandler().loadResource("platform:/resource/Something2Else/model/Something2Else.ecore");
			something2elsePack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
		}
				
		if(executable instanceof BWD_OPT) {
			Resource res = executable.getResourceHandler().loadResource("platform:/resource/Something2Else/model/Something2Else.ecore");
			something2elsePack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
		}
		
		if(something2elsePack == null) {
			something2elsePack = Something2ElsePackageImpl.init();
			rs.getPackageRegistry().put("platform:/resource/Something2Else/model/Something2Else.ecore", Something2ElsePackage.eINSTANCE);
			rs.getPackageRegistry().put("platform:/plugin/Something2Else/model/Something2Else.ecore", Something2ElsePackage.eINSTANCE);
		}
	}

	/** Create default options **/
	public IbexOptions createIbexOptions() {
		IbexOptions options = new IbexOptions();
		options.blackInterpreter(new HiPETGGEngine());
		options.project.name("Something2Else");
		options.project.path("Something2Else");
		options.debug.ibexDebug(false);
		options.csp.userDefinedConstraints(new UserDefinedRuntimeTGGAttrConstraintFactory());
		options.registrationHelper(this);
		return options;
	}
}
