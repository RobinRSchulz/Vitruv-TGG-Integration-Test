package org.emoflon.ibex.tgg.operational.csp.constraints.custom.something2else;

import org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraint;
import org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable;

public class UserDefined_incrementingStaffID extends RuntimeTGGAttributeConstraint
{

   /**
    * Constraint incrementingStaffID(v0, v1)
    * 
    * @see TGGLanguage.csp.impl.ConstraintImpl#solve()
    */
	@Override
	public void solve() {
		if (variables.size() != 2)
			throw new RuntimeException("The CSP -INCREMENTINGSTAFFID- needs exactly 2 variables");

		RuntimeTGGAttributeConstraintVariable v0 = variables.get(0);
		RuntimeTGGAttributeConstraintVariable v1 = variables.get(1);
		String bindingStates = getBindingStates(v0, v1);

	  	switch(bindingStates) {
	  		case "BB": 
	  		case "BF": 
	  		case "FB": 
	  		case "FF": 
	  		default:  throw new UnsupportedOperationException("This case in the constraint has not been implemented yet: " + bindingStates);
	  		 	}
	  	}
}

