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
		
public class PrimitiveType_object_SP1 extends GenericObjectActor<uml.PrimitiveType> {
	
	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor, ObjectNode node) {
		ports = new LinkedList<>();
		ports.add(new PortNodeMatch<uml.PrimitiveType>(node.getPorts().getPort().get(3), getSelf(), name2actor.get("JavaFirstCompilationUnitToUmlModel__CONSISTENCY_768_localSearch"), this::returnTrue   , node.getName() ));
		ports.add(new PortNodeLeft<uml.PrimitiveType>(node.getPorts().getPort().get(0), getSelf(), name2actor.get("PrimitiveType_package_1_reference"), this::check_constraint_90 , 0   ));
		ports.add(new PortNodeLeft<uml.PrimitiveType>(node.getPorts().getPort().get(1), getSelf(), name2actor.get("PrimitiveType_package_4_reference"), this::check_constraint_98 , 1   ));
		ports.add(new PortNodeLeft<uml.PrimitiveType>(node.getPorts().getPort().get(2), getSelf(), name2actor.get("PrimitiveType_package_7_reference"), this::check_constraint_104 , 2   ));
	}
	
	public boolean check_constraint_90(uml.PrimitiveType intType, int index) {
		
		org.emoflon.ibex.tgg.operational.csp.constraints.Eq csp_70 = new org.emoflon.ibex.tgg.operational.csp.constraints.Eq();
		csp_70.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, "boolean", "java.lang.String"));
		csp_70.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, intType.getName(), "java.lang.String"));
		csp_70.solve();
		
		return csp_70.isSatisfied();
	}
	
	public boolean check_constraint_98(uml.PrimitiveType stringType, int index) {
		
		org.emoflon.ibex.tgg.operational.csp.constraints.Eq csp_73 = new org.emoflon.ibex.tgg.operational.csp.constraints.Eq();
		csp_73.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, "boolean", "java.lang.String"));
		csp_73.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, stringType.getName(), "java.lang.String"));
		csp_73.solve();
		
		return csp_73.isSatisfied();
	}
	
	public boolean check_constraint_104(uml.PrimitiveType byteType, int index) {
		
		org.emoflon.ibex.tgg.operational.csp.constraints.Eq csp_66 = new org.emoflon.ibex.tgg.operational.csp.constraints.Eq();
		csp_66.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, "boolean", "java.lang.String"));
		csp_66.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, byteType.getName(), "java.lang.String"));
		csp_66.solve();
		
		return csp_66.isSatisfied();
	}
	
}


