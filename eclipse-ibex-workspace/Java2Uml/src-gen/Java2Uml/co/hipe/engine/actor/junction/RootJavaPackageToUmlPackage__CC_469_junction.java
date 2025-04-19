package Java2Uml.co.hipe.engine.actor.junction;

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

public class RootJavaPackageToUmlPackage__CC_469_junction extends GenericJunctionActor{
	private Map<Object, Collection<HMatch>> namedElement_42_AttrMap = HiPEMultiUtil.createMap();
	private Map<Object, Collection<HMatch>> namedElement_43_AttrMap = HiPEMultiUtil.createMap();
	
	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor, JunctionNode node) {
		constraints.add(this::check_constraint_98);
		
		ports = new LinkedList<>();
		ports.add(new PortJunction(node.getPorts().getPort().get(0), getSelf(), name2actor.get("RootJavaPackageToUmlPackage__CC_production"), this::returnTrue , 0  , false ));
	}
	
	@Override
	protected void registerMatchForAttributeChanges(HMatch match) {
		Object[] matchObjects = match.getNodes();
		Collection<HMatch> namedElement_1_Matches = namedElement_42_AttrMap.get(matchObjects[1]);
		if(namedElement_1_Matches == null) {
			namedElement_1_Matches = new LinkedList<>();
			namedElement_42_AttrMap.put(matchObjects[1], namedElement_1_Matches);
		}
		
		namedElement_1_Matches.add(match);
		
		Collection<HMatch> namedElement_0_Matches = namedElement_43_AttrMap.get(matchObjects[0]);
		if(namedElement_0_Matches == null) {
			namedElement_0_Matches = new LinkedList<>();
			namedElement_43_AttrMap.put(matchObjects[0], namedElement_0_Matches);
		}
		
		namedElement_0_Matches.add(match);
		
	}
	
	@Override
	protected void deregisterMatchForAttributeChanges(Set<HMatch> matches, HMatch match) {
		Object[] matchObjects = match.getNodes();
		Collection<HMatch> matches_0 = namedElement_42_AttrMap.get(matchObjects[1]);
		if(matches_0 != null) {
			matches_0.remove(match);
		}
		Collection<HMatch> matches_1 = namedElement_43_AttrMap.get(matchObjects[0]);
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
			if(namedElement_42_AttrMap.containsKey(obj)) {
				for(HMatch attr_match : namedElement_42_AttrMap.get(obj)) {
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
			if(namedElement_43_AttrMap.containsKey(obj)) {
				for(HMatch attr_match : namedElement_43_AttrMap.get(obj)) {
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
	
	public boolean check_constraint_98(HMatch match, int index) {
		org.emftext.language.java.containers.Package javaPackage = (org.emftext.language.java.containers.Package) match.getNodes()[0];
		uml.Package umlPackage = (uml.Package) match.getNodes()[1];
		
		org.emoflon.ibex.tgg.operational.csp.constraints.Eq csp_59 = new org.emoflon.ibex.tgg.operational.csp.constraints.Eq();
		csp_59.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, javaPackage.getName(), "java.lang.String"));
		csp_59.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, umlPackage.getName(), "java.lang.String"));
		csp_59.solve();
		
		boolean predicate = csp_59.isSatisfied();
		match.setConstraintSatisfied(index, predicate);
		return predicate;
	}
	
}

