package Java2Uml.initbwd.hipe.engine.actor.node;

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
		ports.add(new PortNodeMatch<uml.Model>(node.getPorts().getPort().get(0), getSelf(), name2actor.get("JavaCompilationUnitToExistingUmlModel__CONSISTENCY_497_localSearch"), this::returnTrue   , node.getName() ));
		ports.add(new PortNodeRight<uml.Model>(node.getPorts().getPort().get(1), getSelf(), name2actor.get("PrimitiveType_package_2_reference"), this::check_constraint_66 , 0   ));
		ports.add(new PortNodeRight<uml.Model>(node.getPorts().getPort().get(2), getSelf(), name2actor.get("PrimitiveType_package_5_reference"), this::check_constraint_74 , 1   ));
		ports.add(new PortNodeRight<uml.Model>(node.getPorts().getPort().get(3), getSelf(), name2actor.get("PrimitiveType_package_8_reference"), this::check_constraint_80 , 2   ));
	}
	
	public boolean check_constraint_66(uml.Model umlModel, int index) {
		
		org.emoflon.ibex.tgg.operational.csp.constraints.Eq csp_40 = new org.emoflon.ibex.tgg.operational.csp.constraints.Eq();
		csp_40.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, "UML_MODEL", "java.lang.String"));
		csp_40.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, umlModel.getName(), "java.lang.String"));
		csp_40.solve();
		
		return csp_40.isSatisfied();
	}
	
	public boolean check_constraint_74(uml.Model umlModel, int index) {
		
		org.emoflon.ibex.tgg.operational.csp.constraints.Eq csp_40 = new org.emoflon.ibex.tgg.operational.csp.constraints.Eq();
		csp_40.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, "UML_MODEL", "java.lang.String"));
		csp_40.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, umlModel.getName(), "java.lang.String"));
		csp_40.solve();
		
		return csp_40.isSatisfied();
	}
	
	public boolean check_constraint_80(uml.Model umlModel, int index) {
		
		org.emoflon.ibex.tgg.operational.csp.constraints.Eq csp_40 = new org.emoflon.ibex.tgg.operational.csp.constraints.Eq();
		csp_40.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, "UML_MODEL", "java.lang.String"));
		csp_40.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, umlModel.getName(), "java.lang.String"));
		csp_40.solve();
		
		return csp_40.isSatisfied();
	}
	
}


