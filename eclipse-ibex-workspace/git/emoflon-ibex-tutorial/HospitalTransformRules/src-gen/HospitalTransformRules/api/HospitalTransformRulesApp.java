package HospitalTransformRules.api;

import HospitalExample.HospitalExamplePackage;
import org.eclipse.emf.common.util.URI;
import org.emoflon.ibex.common.operational.IContextPatternInterpreter;
import org.emoflon.ibex.gt.api.GraphTransformationApp;

/**
 * An application using the HospitalTransformRulesAPI.
 */
public class HospitalTransformRulesApp extends GraphTransformationApp<HospitalTransformRulesAPI> {

	/**
	 * Creates the application with the given engine.
	 * 
	 * @param engine
	 *            the pattern matching engine
	 */
	public HospitalTransformRulesApp(final IContextPatternInterpreter engine) {
		super(engine);
	}

	/**
	 * Creates the application with the given engine.
	 * 
	 * @param engine
	 *            the pattern matching engine
	 * @param workspacePath
	 *            the workspace path
	 */
	public HospitalTransformRulesApp(final IContextPatternInterpreter engine, final String workspacePath) {
		super(engine, workspacePath);
	}

	@Override
	public void registerMetaModels() {
		registerMetaModel(HospitalExamplePackage.eINSTANCE);
	}

	@Override
	public HospitalTransformRulesAPI initAPI() {
		if (defaultResource.isPresent()) {
			return new HospitalTransformRulesAPI(engine, resourceSet, defaultResource.get(), workspacePath);
		}
		return new HospitalTransformRulesAPI(engine, resourceSet, workspacePath);
	}
	
	/**
	 * Initializes the API with a given (dynamic) IBeX pattern path (URI).
	 *
	 * @param patternPath
	 *            the (dynamic) IBeX pattern path (URI) to load the XMI file from.
	 */
	@Override
	public HospitalTransformRulesAPI initAPI(final URI patternPath) {
		return new HospitalTransformRulesAPI(engine, resourceSet, patternPath);
	}
}
