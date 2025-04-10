package org.emoflon.ibex.tgg.operational.csp.constraints.custom.java2uml;

import org.eclipse.uml2.uml.VisibilityKind;
import org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraint;
import org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable;

public class UserDefined_expectPrivate extends RuntimeTGGAttributeConstraint
{

   /**
    * Constraint expectPrivate(v0)
    * 
    * @see TGGLanguage.csp.impl.ConstraintImpl#solve()
    */
	@Override
	public void solve() {
		if (variables.size() != 1)
			throw new RuntimeException("The CSP -EXPECTPRIVATE- needs exactly 1 variables");

		RuntimeTGGAttributeConstraintVariable v0 = variables.get(0);
		String bindingStates = getBindingStates(v0);

	  	switch(bindingStates) {
	  		case "F": {
		  		v0.bindToValue(VisibilityKind.PRIVATE_LITERAL);
	  			setSatisfied(true);
		  		break;
		  	}
	  		case "B": {
		  		setSatisfied(((VisibilityKind)v0.getValue()).equals(VisibilityKind.PRIVATE_LITERAL));
		  		break;
		  	}
	  		default:  throw new UnsupportedOperationException("This case in the constraint has not been implemented yet: " + bindingStates);
	  	}
	}
}

