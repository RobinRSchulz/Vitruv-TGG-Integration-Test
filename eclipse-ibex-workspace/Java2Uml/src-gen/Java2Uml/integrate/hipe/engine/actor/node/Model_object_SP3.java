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
		
public class Model_object_SP3 extends GenericObjectActor<uml.Model> {
	
	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor, ObjectNode node) {
		ports = new LinkedList<>();
		ports.add(new PortNodeRight<uml.Model>(node.getPorts().getPort().get(0), getSelf(), name2actor.get("PrimitiveType_package_0_reference"), this::check_constraint_131 , 0   ));
		ports.add(new PortNodeRight<uml.Model>(node.getPorts().getPort().get(1), getSelf(), name2actor.get("PrimitiveType_package_4_reference"), this::check_constraint_141 , 1   ));
		ports.add(new PortNodeRight<uml.Model>(node.getPorts().getPort().get(2), getSelf(), name2actor.get("PrimitiveType_package_8_reference"), this::check_constraint_149 , 2   ));
	}
	
	public boolean check_constraint_131(uml.Model umlModel, int index) {
		
		org.emoflon.ibex.tgg.operational.csp.constraints.Eq csp_120 = new org.emoflon.ibex.tgg.operational.csp.constraints.Eq();
		csp_120.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, "UML_MODEL", "java.lang.String"));
		csp_120.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, umlModel.getName(), "java.lang.String"));
		csp_120.solve();
		
		return csp_120.isSatisfied();
	}
	
	public boolean check_constraint_141(uml.Model umlModel, int index) {
		
		org.emoflon.ibex.tgg.operational.csp.constraints.Eq csp_120 = new org.emoflon.ibex.tgg.operational.csp.constraints.Eq();
		csp_120.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, "UML_MODEL", "java.lang.String"));
		csp_120.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, umlModel.getName(), "java.lang.String"));
		csp_120.solve();
		
		return csp_120.isSatisfied();
	}
	
	public boolean check_constraint_149(uml.Model umlModel, int index) {
		
		org.emoflon.ibex.tgg.operational.csp.constraints.Eq csp_120 = new org.emoflon.ibex.tgg.operational.csp.constraints.Eq();
		csp_120.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, "UML_MODEL", "java.lang.String"));
		csp_120.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, umlModel.getName(), "java.lang.String"));
		csp_120.solve();
		
		return csp_120.isSatisfied();
	}
	
}


