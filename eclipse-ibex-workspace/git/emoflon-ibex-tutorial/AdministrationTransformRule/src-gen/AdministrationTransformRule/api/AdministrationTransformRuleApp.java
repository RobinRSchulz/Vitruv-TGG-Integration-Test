package AdministrationTransformRule.api;

import AdministrationExample.AdministrationExamplePackage;
import org.eclipse.emf.common.util.URI;
import org.emoflon.ibex.common.operational.IContextPatternInterpreter;
import org.emoflon.ibex.gt.api.GraphTransformationApp;

/**
 * An application using the AdministrationTransformRuleAPI.
 */
public class AdministrationTransformRuleApp extends GraphTransformationApp<AdministrationTransformRuleAPI> {

	/**
	 * Creates the application with the given engine.
	 * 
	 * @param engine
	 *            the pattern matching engine
	 */
	public AdministrationTransformRuleApp(final IContextPatternInterpreter engine) {
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
	public AdministrationTransformRuleApp(final IContextPatternInterpreter engine, final String workspacePath) {
		super(engine, workspacePath);
	}

	@Override
	public void registerMetaModels() {
		registerMetaModel(AdministrationExamplePackage.eINSTANCE);
	}

	@Override
	public AdministrationTransformRuleAPI initAPI() {
		if (defaultResource.isPresent()) {
			return new AdministrationTransformRuleAPI(engine, resourceSet, defaultResource.get(), workspacePath);
		}
		return new AdministrationTransformRuleAPI(engine, resourceSet, workspacePath);
	}
	
	/**
	 * Initializes the API with a given (dynamic) IBeX pattern path (URI).
	 *
	 * @param patternPath
	 *            the (dynamic) IBeX pattern path (URI) to load the XMI file from.
	 */
	@Override
	public AdministrationTransformRuleAPI initAPI(final URI patternPath) {
		return new AdministrationTransformRuleAPI(engine, resourceSet, patternPath);
	}
}
