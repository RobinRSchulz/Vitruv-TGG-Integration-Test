package Java2Uml.sync.hipe.engine.actor.junction;

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

public class JavaFirstCompilationUnitToUmlModel__BWD_738_junction extends GenericJunctionActor{
	
	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor, JunctionNode node) {
		constraints.add(this::check_constraint_116);
		
		ports = new LinkedList<>();
		ports.add(new PortJunctionRight(node.getPorts().getPort().get(0), getSelf(), name2actor.get("JavaFirstCompilationUnitToUmlModel__BWD_736_junction"), this::returnTrue , 0  , false ));
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
	
	public boolean check_constraint_116(HMatch match, int index) {
		org.eclipse.uml2.uml.PrimitiveType floatType = (org.eclipse.uml2.uml.PrimitiveType) match.getNodes()[0];
		org.eclipse.uml2.uml.PrimitiveType longType = (org.eclipse.uml2.uml.PrimitiveType) match.getNodes()[3];
		org.eclipse.uml2.uml.PrimitiveType byteType = (org.eclipse.uml2.uml.PrimitiveType) match.getNodes()[8];
		org.eclipse.uml2.uml.PrimitiveType charType = (org.eclipse.uml2.uml.PrimitiveType) match.getNodes()[9];
		org.eclipse.uml2.uml.PrimitiveType intType = (org.eclipse.uml2.uml.PrimitiveType) match.getNodes()[2];
		org.eclipse.uml2.uml.PrimitiveType booleanType = (org.eclipse.uml2.uml.PrimitiveType) match.getNodes()[7];
		org.eclipse.uml2.uml.PrimitiveType shortType = (org.eclipse.uml2.uml.PrimitiveType) match.getNodes()[4];
		org.eclipse.uml2.uml.PrimitiveType doubleType = (org.eclipse.uml2.uml.PrimitiveType) match.getNodes()[10];
		org.eclipse.uml2.uml.PrimitiveType stringType = (org.eclipse.uml2.uml.PrimitiveType) match.getNodes()[5];
		org.eclipse.uml2.uml.PrimitiveType voidType = (org.eclipse.uml2.uml.PrimitiveType) match.getNodes()[6];
		boolean predicate = !booleanType.equals(floatType) && !booleanType.equals(intType) && !booleanType.equals(longType) && !booleanType.equals(shortType) && !byteType.equals(floatType) && !byteType.equals(intType) && !byteType.equals(longType) && !byteType.equals(shortType) && !charType.equals(floatType) && !charType.equals(intType) && !charType.equals(longType) && !charType.equals(shortType) && !doubleType.equals(floatType) && !doubleType.equals(intType) && !doubleType.equals(longType) && !doubleType.equals(shortType) && !floatType.equals(stringType) && !floatType.equals(voidType) && !intType.equals(stringType) && !intType.equals(voidType) && !longType.equals(stringType) && !longType.equals(voidType) && !shortType.equals(stringType) && !shortType.equals(voidType);
		match.setConstraintSatisfied(index, predicate);
		return predicate;
	}
	
}

