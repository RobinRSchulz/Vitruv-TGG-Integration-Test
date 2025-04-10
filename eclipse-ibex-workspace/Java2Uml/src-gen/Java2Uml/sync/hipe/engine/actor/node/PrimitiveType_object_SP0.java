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
		
public class PrimitiveType_object_SP0 extends GenericObjectActor<uml.PrimitiveType> {
	
	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor, ObjectNode node) {
		ports = new LinkedList<>();
		ports.add(new PortNodeLeft<uml.PrimitiveType>(node.getPorts().getPort().get(0), getSelf(), name2actor.get("PrimitiveType_package_0_reference"), this::check_constraint_88 , 0   ));
		ports.add(new PortNodeLeft<uml.PrimitiveType>(node.getPorts().getPort().get(1), getSelf(), name2actor.get("PrimitiveType_package_3_reference"), this::check_constraint_94 , 1   ));
		ports.add(new PortNodeLeft<uml.PrimitiveType>(node.getPorts().getPort().get(2), getSelf(), name2actor.get("PrimitiveType_package_6_reference"), this::check_constraint_102 , 2   ));
		ports.add(new PortNodeLeft<uml.PrimitiveType>(node.getPorts().getPort().get(3), getSelf(), name2actor.get("PrimitiveType_package_9_reference"), this::check_constraint_108 , 3   ));
	}
	
	public boolean check_constraint_88(uml.PrimitiveType floatType, int index) {
		
		org.emoflon.ibex.tgg.operational.csp.constraints.Eq csp_68 = new org.emoflon.ibex.tgg.operational.csp.constraints.Eq();
		csp_68.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, "boolean", "java.lang.String"));
		csp_68.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, floatType.getName(), "java.lang.String"));
		csp_68.solve();
		
		return csp_68.isSatisfied();
	}
	
	public boolean check_constraint_94(uml.PrimitiveType shortType, int index) {
		
		org.emoflon.ibex.tgg.operational.csp.constraints.Eq csp_72 = new org.emoflon.ibex.tgg.operational.csp.constraints.Eq();
		csp_72.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, "boolean", "java.lang.String"));
		csp_72.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, shortType.getName(), "java.lang.String"));
		csp_72.solve();
		
		return csp_72.isSatisfied();
	}
	
	public boolean check_constraint_102(uml.PrimitiveType booleanType, int index) {
		
		org.emoflon.ibex.tgg.operational.csp.constraints.Eq csp_65 = new org.emoflon.ibex.tgg.operational.csp.constraints.Eq();
		csp_65.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, "boolean", "java.lang.String"));
		csp_65.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, booleanType.getName(), "java.lang.String"));
		csp_65.solve();
		
		return csp_65.isSatisfied();
	}
	
	public boolean check_constraint_108(uml.PrimitiveType doubleType, int index) {
		
		org.emoflon.ibex.tgg.operational.csp.constraints.Eq csp_69 = new org.emoflon.ibex.tgg.operational.csp.constraints.Eq();
		csp_69.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, "boolean", "java.lang.String"));
		csp_69.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, doubleType.getName(), "java.lang.String"));
		csp_69.solve();
		
		return csp_69.isSatisfied();
	}
	
}


