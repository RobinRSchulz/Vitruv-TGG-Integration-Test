package Java2Uml.initbwd.hipe.engine.actor.junction;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import java.util.Set;

import akka.actor.AbstractActor;
import akka.actor.ActorRef;

import hipe.engine.actor.Port;
import hipe.engine.util.HiPESet;
import hipe.engine.match.EdgeMatch;
import hipe.engine.match.HMatch;
import hipe.engine.actor.junction.PortJunction;
import hipe.engine.actor.junction.PortJunctionLeft;
import hipe.engine.actor.junction.PortJunctionRight;
import hipe.engine.message.input.AttributeChanged;
import hipe.engine.util.HiPEMultiUtil;

import hipe.generic.match.GenericJunctionMatch;
import hipe.generic.actor.junction.GenericJunctionActor;

import hipe.network.JunctionNode;

public class JavaFirstCompilationUnitToUmlModel__BWD_509_junction extends GenericJunctionActor{
	
	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor, JunctionNode node) {
		constraints.add(this::check_constraint_88);
		
		ports = new LinkedList<>();
		ports.add(new PortJunctionRight(node.getPorts().getPort().get(0), getSelf(), name2actor.get("JavaFirstCompilationUnitToUmlModel__BWD_507_junction"), this::returnTrue , 0  , false ));
	}
	
	@Override
	protected void registerMatchForAttributeChanges(HMatch match) {
	}
	
	@Override
	protected void deregisterMatchForAttributeChanges(Set<HMatch> matches, HMatch match) {
	}
	
	@Override
	protected void changeAttribute(AttributeChanged<HMatch> message) {
		for(Port<?> port : ports) {
			message.initialMessage.increment();
			port.forwardMessage(message);
		}
		
		message.initialMessage.decrement();
	}
	
	public boolean check_constraint_88(HMatch match, int index) {
		uml.PrimitiveType voidType = (uml.PrimitiveType) match.getNodes()[2];
		uml.PrimitiveType byteType = (uml.PrimitiveType) match.getNodes()[4];
		uml.PrimitiveType charType = (uml.PrimitiveType) match.getNodes()[5];
		uml.PrimitiveType doubleType = (uml.PrimitiveType) match.getNodes()[6];
		uml.PrimitiveType booleanType = (uml.PrimitiveType) match.getNodes()[3];
		uml.PrimitiveType stringType = (uml.PrimitiveType) match.getNodes()[0];
		boolean predicate = !booleanType.equals(stringType) && !booleanType.equals(voidType) && !byteType.equals(stringType) && !byteType.equals(voidType) && !charType.equals(stringType) && !charType.equals(voidType) && !doubleType.equals(stringType) && !doubleType.equals(voidType);
		match.setConstraintSatisfied(index, predicate);
		return predicate;
	}
	
}

