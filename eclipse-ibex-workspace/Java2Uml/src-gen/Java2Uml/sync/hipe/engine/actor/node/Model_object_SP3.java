package Java2Uml.sync.hipe.engine.actor.node;

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
		
public class Model_object_SP3 extends GenericObjectActor<uml.Model> {
	
	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor, ObjectNode node) {
		ports = new LinkedList<>();
		ports.add(new PortNodeRight<uml.Model>(node.getPorts().getPort().get(0), getSelf(), name2actor.get("PrimitiveType_package_1_reference"), this::check_constraint_91 , 0   ));
		ports.add(new PortNodeRight<uml.Model>(node.getPorts().getPort().get(1), getSelf(), name2actor.get("PrimitiveType_package_5_reference"), this::check_constraint_101 , 1   ));
		ports.add(new PortNodeRight<uml.Model>(node.getPorts().getPort().get(2), getSelf(), name2actor.get("PrimitiveType_package_9_reference"), this::check_constraint_109 , 2   ));
	}
	
	public boolean check_constraint_91(uml.Model umlModel, int index) {
		
		org.emoflon.ibex.tgg.operational.csp.constraints.Eq csp_64 = new org.emoflon.ibex.tgg.operational.csp.constraints.Eq();
		csp_64.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, "UML_MODEL", "java.lang.String"));
		csp_64.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, umlModel.getName(), "java.lang.String"));
		csp_64.solve();
		
		return csp_64.isSatisfied();
	}
	
	public boolean check_constraint_101(uml.Model umlModel, int index) {
		
		org.emoflon.ibex.tgg.operational.csp.constraints.Eq csp_64 = new org.emoflon.ibex.tgg.operational.csp.constraints.Eq();
		csp_64.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, "UML_MODEL", "java.lang.String"));
		csp_64.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, umlModel.getName(), "java.lang.String"));
		csp_64.solve();
		
		return csp_64.isSatisfied();
	}
	
	public boolean check_constraint_109(uml.Model umlModel, int index) {
		
		org.emoflon.ibex.tgg.operational.csp.constraints.Eq csp_64 = new org.emoflon.ibex.tgg.operational.csp.constraints.Eq();
		csp_64.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, "UML_MODEL", "java.lang.String"));
		csp_64.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, umlModel.getName(), "java.lang.String"));
		csp_64.solve();
		
		return csp_64.isSatisfied();
	}
	
}


