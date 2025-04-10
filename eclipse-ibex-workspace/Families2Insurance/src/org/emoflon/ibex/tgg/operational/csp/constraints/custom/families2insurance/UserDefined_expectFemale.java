package org.emoflon.ibex.tgg.operational.csp.constraints.custom.families2insurance;

import org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraint;
import org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable;

import edu.kit.ipd.sdq.metamodels.insurance.*;


public class UserDefined_expectFemale extends RuntimeTGGAttributeConstraint
{

   /**
    * Constraint expectMale(v0)
    * 
    * @see TGGLanguage.csp.impl.ConstraintImpl#solve()
    */
	@Override
	public void solve() {
		if (variables.size() != 1)
			throw new RuntimeException("The CSP -expectMale- needs exactly 1 variables");

		RuntimeTGGAttributeConstraintVariable v0 = variables.get(0);
		String bindingStates = getBindingStates(v0);
				

	  	switch(bindingStates) {
		  	case "B": {
		  		setSatisfied(((Gender)v0.getValue()).equals(Gender.FEMALE));
		  		break;
		  	}
		  	case "F": {
		  		v0.bindToValue(Gender.FEMALE);
	  			setSatisfied(true);
		  		break;
		  	}
	  		default:  throw new UnsupportedOperationException("This case in the constraint has not been implemented yet: " + bindingStates);
	  		}
	  	}
}

