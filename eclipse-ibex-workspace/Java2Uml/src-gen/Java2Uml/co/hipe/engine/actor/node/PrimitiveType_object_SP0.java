package Java2Uml.co.hipe.engine.actor.node;

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
		
public class PrimitiveType_object_SP0 extends GenericObjectActor<uml.PrimitiveType> {
	
	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor, ObjectNode node) {
		ports = new LinkedList<>();
		ports.add(new PortNodeLeft<uml.PrimitiveType>(node.getPorts().getPort().get(0), getSelf(), name2actor.get("PrimitiveType_package_0_reference"), this::check_constraint_52 , 0   ));
		ports.add(new PortNodeLeft<uml.PrimitiveType>(node.getPorts().getPort().get(1), getSelf(), name2actor.get("PrimitiveType_package_3_reference"), this::check_constraint_58 , 1   ));
		ports.add(new PortNodeLeft<uml.PrimitiveType>(node.getPorts().getPort().get(2), getSelf(), name2actor.get("PrimitiveType_package_6_reference"), this::check_constraint_66 , 2   ));
		ports.add(new PortNodeLeft<uml.PrimitiveType>(node.getPorts().getPort().get(3), getSelf(), name2actor.get("PrimitiveType_package_9_reference"), this::check_constraint_72 , 3   ));
	}
	
	public boolean check_constraint_52(uml.PrimitiveType floatType, int index) {
		
		org.emoflon.ibex.tgg.operational.csp.constraints.Eq csp_38 = new org.emoflon.ibex.tgg.operational.csp.constraints.Eq();
		csp_38.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, "boolean", "java.lang.String"));
		csp_38.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, floatType.getName(), "java.lang.String"));
		csp_38.solve();
		
		return csp_38.isSatisfied();
	}
	
	public boolean check_constraint_58(uml.PrimitiveType shortType, int index) {
		
		org.emoflon.ibex.tgg.operational.csp.constraints.Eq csp_42 = new org.emoflon.ibex.tgg.operational.csp.constraints.Eq();
		csp_42.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, "boolean", "java.lang.String"));
		csp_42.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, shortType.getName(), "java.lang.String"));
		csp_42.solve();
		
		return csp_42.isSatisfied();
	}
	
	public boolean check_constraint_66(uml.PrimitiveType booleanType, int index) {
		
		org.emoflon.ibex.tgg.operational.csp.constraints.Eq csp_35 = new org.emoflon.ibex.tgg.operational.csp.constraints.Eq();
		csp_35.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, "boolean", "java.lang.String"));
		csp_35.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, booleanType.getName(), "java.lang.String"));
		csp_35.solve();
		
		return csp_35.isSatisfied();
	}
	
	public boolean check_constraint_72(uml.PrimitiveType doubleType, int index) {
		
		org.emoflon.ibex.tgg.operational.csp.constraints.Eq csp_39 = new org.emoflon.ibex.tgg.operational.csp.constraints.Eq();
		csp_39.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, "boolean", "java.lang.String"));
		csp_39.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, doubleType.getName(), "java.lang.String"));
		csp_39.solve();
		
		return csp_39.isSatisfied();
	}
	
}


