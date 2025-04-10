package org.emoflon.ibex.tgg.operational.csp.constraints.factories.families2insurance;

import java.util.HashMap;
import java.util.HashSet;			

import org.emoflon.ibex.tgg.operational.csp.constraints.factories.RuntimeTGGAttrConstraintFactory;			

import org.emoflon.ibex.tgg.operational.csp.constraints.custom.families2insurance.UserDefined_expectMale;
import org.emoflon.ibex.tgg.operational.csp.constraints.custom.families2insurance.UserDefined_expectFemale;

public class UserDefinedRuntimeTGGAttrConstraintFactory extends RuntimeTGGAttrConstraintFactory {

	public UserDefinedRuntimeTGGAttrConstraintFactory() {
		super();
	}
	
	@Override
	protected void initialize() {
		creators = new HashMap<>();
		creators.put("expectMale", () -> new UserDefined_expectMale());
		creators.put("expectFemale", () -> new UserDefined_expectFemale());

		constraints = new HashSet<String>();
		constraints.addAll(creators.keySet());
	}
}
