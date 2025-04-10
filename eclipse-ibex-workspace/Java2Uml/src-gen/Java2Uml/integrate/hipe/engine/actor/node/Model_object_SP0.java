package Java2Uml.integrate.hipe.engine.actor.node;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

import akka.actor.ActorRef;

import hipe.engine.actor.Port;
import hipe.engine.actor.node.PortNode;
import hipe.engine.actor.node.PortNodeLeft;
import hipe.engine.actor.node.PortNodeRight;
import hipe.engine.actor.node.PortNodeMatch;
import hipe.engine.actor.node.PortNodeMatchLeft;
import hipe.engine.actor.node.PortNodeMatchRight;

import hipe.network.ObjectNode;

import hipe.generic.actor.GenericObjectActor;

import hipe.generic.actor.junction.util.HiPEConfig;
		
public class Model_object_SP0 extends GenericObjectActor<uml.Model> {
	
	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor, ObjectNode node) {
		ports = new LinkedList<>();
		ports.add(new PortNodeMatch<uml.Model>(node.getPorts().getPort().get(0), getSelf(), name2actor.get("JavaCompilationUnitToExistingUmlModel__CC_816_localSearch"), this::returnTrue   , node.getName() ));
		ports.add(new PortNodeRight<uml.Model>(node.getPorts().getPort().get(1), getSelf(), name2actor.get("PrimitiveType_package_1_reference"), this::check_constraint_133 , 0   ));
		ports.add(new PortNodeRight<uml.Model>(node.getPorts().getPort().get(2), getSelf(), name2actor.get("PrimitiveType_package_5_reference"), this::check_constraint_143 , 1   ));
		ports.add(new PortNodeRight<uml.Model>(node.getPorts().getPort().get(3), getSelf(), name2actor.get("PrimitiveType_package_9_reference"), this::check_constraint_151 , 2   ));
	}
	
	public boolean check_constraint_133(uml.Model umlModel, int index) {
		
		org.emoflon.ibex.tgg.operational.csp.constraints.Eq csp_120 = new org.emoflon.ibex.tgg.operational.csp.constraints.Eq();
		csp_120.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, "UML_MODEL", "java.lang.String"));
		csp_120.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, umlModel.getName(), "java.lang.String"));
		csp_120.solve();
		
		return csp_120.isSatisfied();
	}
	
	public boolean check_constraint_143(uml.Model umlModel, int index) {
		
		org.emoflon.ibex.tgg.operational.csp.constraints.Eq csp_120 = new org.emoflon.ibex.tgg.operational.csp.constraints.Eq();
		csp_120.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, "UML_MODEL", "java.lang.String"));
		csp_120.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, umlModel.getName(), "java.lang.String"));
		csp_120.solve();
		
		return csp_120.isSatisfied();
	}
	
	public boolean check_constraint_151(uml.Model umlModel, int index) {
		
		org.emoflon.ibex.tgg.operational.csp.constraints.Eq csp_120 = new org.emoflon.ibex.tgg.operational.csp.constraints.Eq();
		csp_120.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, "UML_MODEL", "java.lang.String"));
		csp_120.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, umlModel.getName(), "java.lang.String"));
		csp_120.solve();
		
		return csp_120.isSatisfied();
	}
	
}


