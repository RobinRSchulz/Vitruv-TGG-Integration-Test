package Java2Uml.modelgen.hipe.engine.actor.junction;

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

public class ClassAttributeTypeToPropertyType__GEN_10_junction extends GenericJunctionActor{
	private Map<Object, Collection<HMatch>> namedElement_36_AttrMap = HiPEMultiUtil.createMap();
	private Map<Object, Collection<HMatch>> namedElement_37_AttrMap = HiPEMultiUtil.createMap();
	
	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor, JunctionNode node) {
		constraints.add(this::check_constraint_2);
		
		ports = new LinkedList<>();
		ports.add(new PortJunctionLeft(node.getPorts().getPort().get(0), getSelf(), name2actor.get("ClassAttributeTypeToPropertyType__GEN_9_junction"), this::returnTrue , 0  , false ));
	}
	
	@Override
	protected void registerMatchForAttributeChanges(HMatch match) {
		Object[] matchObjects = match.getNodes();
		Collection<HMatch> namedElement_2_Matches = namedElement_36_AttrMap.get(matchObjects[2]);
		if(namedElement_2_Matches == null) {
			namedElement_2_Matches = new LinkedList<>();
			namedElement_36_AttrMap.put(matchObjects[2], namedElement_2_Matches);
		}
		
		namedElement_2_Matches.add(match);
		
		Collection<HMatch> namedElement_1_Matches = namedElement_37_AttrMap.get(matchObjects[1]);
		if(namedElement_1_Matches == null) {
			namedElement_1_Matches = new LinkedList<>();
			namedElement_37_AttrMap.put(matchObjects[1], namedElement_1_Matches);
		}
		
		namedElement_1_Matches.add(match);
		
	}
	
	@Override
	protected void deregisterMatchForAttributeChanges(Set<HMatch> matches, HMatch match) {
		Object[] matchObjects = match.getNodes();
		Collection<HMatch> matches_0 = namedElement_36_AttrMap.get(matchObjects[2]);
		if(matches_0 != null) {
			matches_0.remove(match);
		}
		Collection<HMatch> matches_1 = namedElement_37_AttrMap.get(matchObjects[1]);
		if(matches_1 != null) {
			matches_1.remove(match);
		}
	}
	
	@Override
	protected void changeAttribute(AttributeChanged<HMatch> message) {
		for(Port<?> port : ports) {
			message.initialMessage.increment();
			port.forwardMessage(message);
		}
		Object obj = message.node;
		if(obj instanceof uml.NamedElement) {
			if(namedElement_36_AttrMap.containsKey(obj)) {
				for(HMatch attr_match : namedElement_36_AttrMap.get(obj)) {
					for(int i=0; i<ports.size(); i++) {
						Port<HMatch> port = ports.get(i);
						HMatch match = attr_match;
												
						if(match.isConstraintSatisfied(i)) {
							if(!constraints.get(i).apply(match, i))
								port.sendRemove(message.initialMessage, match);
						}
						else {
							if(constraints.get(i).apply(match, i))
								port.sendAdd(message.initialMessage, match);
						}
					}
				}
			}
		}
		if(obj instanceof org.emftext.language.java.commons.NamedElement) {
			if(namedElement_37_AttrMap.containsKey(obj)) {
				for(HMatch attr_match : namedElement_37_AttrMap.get(obj)) {
					for(int i=0; i<ports.size(); i++) {
						Port<HMatch> port = ports.get(i);
						HMatch match = attr_match;
												
						if(match.isConstraintSatisfied(i)) {
							if(!constraints.get(i).apply(match, i))
								port.sendRemove(message.initialMessage, match);
						}
						else {
							if(constraints.get(i).apply(match, i))
								port.sendAdd(message.initialMessage, match);
						}
					}
				}
			}
		}
		
		message.initialMessage.decrement();
	}
	
	public boolean check_constraint_2(HMatch match, int index) {
		org.emftext.language.java.members.Field field = (org.emftext.language.java.members.Field) match.getNodes()[1];
		uml.Property property = (uml.Property) match.getNodes()[2];
		
		org.emoflon.ibex.tgg.operational.csp.constraints.Eq csp_1 = new org.emoflon.ibex.tgg.operational.csp.constraints.Eq();
		csp_1.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, field.getName(), "java.lang.String"));
		csp_1.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, property.getName(), "java.lang.String"));
		csp_1.solve();
		
		boolean predicate = csp_1.isSatisfied();
		match.setConstraintSatisfied(index, predicate);
		return predicate;
	}
	
}

