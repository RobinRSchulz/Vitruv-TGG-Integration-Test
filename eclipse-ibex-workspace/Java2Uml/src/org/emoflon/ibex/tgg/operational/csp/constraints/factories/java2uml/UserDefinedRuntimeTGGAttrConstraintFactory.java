package org.emoflon.ibex.tgg.operational.csp.constraints.factories.java2uml;

import java.util.HashMap;
import java.util.HashSet;			

import org.emoflon.ibex.tgg.operational.csp.constraints.factories.RuntimeTGGAttrConstraintFactory;			

import org.emoflon.ibex.tgg.operational.csp.constraints.custom.java2uml.UserDefined_expectPrivate;
import org.emoflon.ibex.tgg.operational.csp.constraints.custom.java2uml.UserDefined_expectProtected;
import org.emoflon.ibex.tgg.operational.csp.constraints.custom.java2uml.UserDefined_expectPublic;
import org.emoflon.ibex.tgg.operational.csp.constraints.custom.java2uml.UserDefined_expectPackage;

public class UserDefinedRuntimeTGGAttrConstraintFactory extends RuntimeTGGAttrConstraintFactory {

	public UserDefinedRuntimeTGGAttrConstraintFactory() {
		super();
	}
	
	@Override
	protected void initialize() {
		creators = new HashMap<>();
		creators.put("expectPrivate", () -> new UserDefined_expectPrivate());
		creators.put("expectProtected", () -> new UserDefined_expectProtected());
		creators.put("expectPublic", () -> new UserDefined_expectPublic());
		creators.put("expectPackage", () -> new UserDefined_expectPackage());

		constraints = new HashSet<String>();
		constraints.addAll(creators.keySet());
	}
}
