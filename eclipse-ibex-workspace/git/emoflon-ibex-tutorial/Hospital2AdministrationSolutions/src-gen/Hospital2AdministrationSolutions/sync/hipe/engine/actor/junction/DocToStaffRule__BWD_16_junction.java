package Hospital2AdministrationSolutions.sync.hipe.engine.actor.junction;

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

public class DocToStaffRule__BWD_16_junction extends GenericJunctionActor{
	private Map<Object, Collection<HMatch>> staff_12_AttrMap = HiPEMultiUtil.createMap();
	private Map<Object, Collection<HMatch>> department_12_AttrMap = HiPEMultiUtil.createMap();
	
	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor, JunctionNode node) {
		constraints.add(this::check_constraint_7);
		
		ports = new LinkedList<>();
		ports.add(new PortJunction(node.getPorts().getPort().get(0), getSelf(), name2actor.get("DocToStaffRule__BWD_production"), this::returnTrue , 0  , false ));
	}
	
	@Override
	protected void registerMatchForAttributeChanges(HMatch match) {
		Object[] matchObjects = match.getNodes();
		Collection<HMatch> staff_6_Matches = staff_12_AttrMap.get(matchObjects[6]);
		if(staff_6_Matches == null) {
			staff_6_Matches = new LinkedList<>();
			staff_12_AttrMap.put(matchObjects[6], staff_6_Matches);
		}
		
		staff_6_Matches.add(match);
		
		Collection<HMatch> department_0_Matches = department_12_AttrMap.get(matchObjects[0]);
		if(department_0_Matches == null) {
			department_0_Matches = new LinkedList<>();
			department_12_AttrMap.put(matchObjects[0], department_0_Matches);
		}
		
		department_0_Matches.add(match);
		
	}
	
	@Override
	protected void deregisterMatchForAttributeChanges(Set<HMatch> matches, HMatch match) {
		Object[] matchObjects = match.getNodes();
		Collection<HMatch> matches_0 = staff_12_AttrMap.get(matchObjects[6]);
		if(matches_0 != null) {
			matches_0.remove(match);
		}
		Collection<HMatch> matches_1 = department_12_AttrMap.get(matchObjects[0]);
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
		if(obj instanceof AdministrationExample.Staff) {
			if(staff_12_AttrMap.containsKey(obj)) {
				for(HMatch attr_match : staff_12_AttrMap.get(obj)) {
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
		if(obj instanceof HospitalExample.Department) {
			if(department_12_AttrMap.containsKey(obj)) {
				for(HMatch attr_match : department_12_AttrMap.get(obj)) {
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
	
	public boolean check_constraint_7(HMatch match, int index) {
		HospitalExample.Department d = (HospitalExample.Department) match.getNodes()[0];
		AdministrationExample.Staff s2 = (AdministrationExample.Staff) match.getNodes()[6];
		
		org.emoflon.ibex.tgg.operational.csp.constraints.Eq csp_5 = new org.emoflon.ibex.tgg.operational.csp.constraints.Eq();
		csp_5.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, d.getDID(), "int"));
		csp_5.getVariables().add(new org.emoflon.ibex.tgg.operational.csp.RuntimeTGGAttributeConstraintVariable(true, s2.getDInt(), "int"));
		csp_5.solve();
		
		boolean predicate = csp_5.isSatisfied();
		match.setConstraintSatisfied(index, predicate);
		return predicate;
	}
	
}

