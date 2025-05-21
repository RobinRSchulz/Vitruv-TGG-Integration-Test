package Something2Else.co.hipe.engine.actor.junction;

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

public class LinkToEntityEmbedded__CC_28_junction extends GenericJunctionActor{
	
	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor, JunctionNode node) {
		constraints.add(this::check_constraint_3);
		
		ports = new LinkedList<>();
		ports.add(new PortJunctionRight(node.getPorts().getPort().get(0), getSelf(), name2actor.get("LinkToEntityEmbedded__CC_25_junction"), this::returnTrue , 0  , false ));
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
	
	public boolean check_constraint_3(HMatch match, int index) {
		tools.vitruv.methodologisttemplate.model.model2.Entity compEntity = (tools.vitruv.methodologisttemplate.model.model2.Entity) match.getNodes()[6];
		tools.vitruv.methodologisttemplate.model.model2.Entity protEntity = (tools.vitruv.methodologisttemplate.model.model2.Entity) match.getNodes()[3];
		boolean predicate = !compEntity.equals(protEntity);
		match.setConstraintSatisfied(index, predicate);
		return predicate;
	}
	
}

