package Java2Uml.cc.hipe.engine.actor.node;

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
		
public class PrimitiveType_object_SP2 extends GenericObjectActor<uml.PrimitiveType> {
	
	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor, ObjectNode node) {
		ports = new LinkedList<>();
		ports.add(new PortNodeLeft<uml.PrimitiveType>(node.getPorts().getPort().get(0), getSelf(), name2actor.get("PrimitiveType_package_2_reference"), this::check_constraint_56 , 0   ));
		ports.add(new PortNodeLeft<uml.PrimitiveType>(node.getPorts().getPort().get(1), getSelf(), name2actor.get("PrimitiveType_package_5_reference"), this::check_constraint_64 , 1   ));
		ports.add(new PortNodeLeft<uml.PrimitiveType>(node.getPorts().getPort().get(2), getSelf(), name2actor.get("PrimitiveType_package_8_reference"), this::check_constraint_70 , 2   ));
	}
	
	public boolean check_constraint_56(uml.PrimitiveType longType, int index) {
		
		org.emoflon.ibex.tgg.operational.csp.constraints.Eq csp_41 = new org.emoflon.ibex.tgg.operational.csp.constraints.Eq();
		csp_41.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, "boolean", "java.lang.String"));
		csp_41.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, longType.getName(), "java.lang.String"));
		csp_41.solve();
		
		return csp_41.isSatisfied();
	}
	
	public boolean check_constraint_64(uml.PrimitiveType voidType, int index) {
		
		org.emoflon.ibex.tgg.operational.csp.constraints.Eq csp_44 = new org.emoflon.ibex.tgg.operational.csp.constraints.Eq();
		csp_44.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, "boolean", "java.lang.String"));
		csp_44.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, voidType.getName(), "java.lang.String"));
		csp_44.solve();
		
		return csp_44.isSatisfied();
	}
	
	public boolean check_constraint_70(uml.PrimitiveType charType, int index) {
		
		org.emoflon.ibex.tgg.operational.csp.constraints.Eq csp_37 = new org.emoflon.ibex.tgg.operational.csp.constraints.Eq();
		csp_37.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, "boolean", "java.lang.String"));
		csp_37.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, charType.getName(), "java.lang.String"));
		csp_37.solve();
		
		return csp_37.isSatisfied();
	}
	
}


