package HospitalTransformRules.hipe.engine.actor.junction;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import java.util.Set;
import java.util.function.BiFunction;

import akka.actor.AbstractActor;
import akka.actor.ActorRef;

import hipe.engine.actor.Port;
import hipe.engine.util.HiPESet;
import hipe.engine.match.EdgeMatch;
import hipe.engine.match.HMatch;
import hipe.engine.actor.node.PortNode;
import hipe.engine.actor.node.PortNodeLeft;
import hipe.engine.actor.node.PortNodeRight;
import hipe.engine.actor.junction.PortJunction;
import hipe.engine.actor.junction.PortJunctionLeft;
import hipe.engine.actor.junction.PortJunctionRight;
import hipe.engine.message.InitGenActor;
import hipe.engine.message.input.AttributeChanged;
import hipe.engine.util.HiPEMultiUtil;

import hipe.generic.match.GenericJunctionMatch;
import hipe.generic.actor.junction.AbstractCountJunctionActor;

import hipe.network.CountJunctionNode;

public class assignPatientToRoom_15_count extends AbstractCountJunctionActor{
	public static final int COUNT_findOccupiedDoc_doctor2doctor = 0;
	private Map<Object, Collection<HMatch>> doctorAttrMap = HiPEMultiUtil.createMap();
	
	@SuppressWarnings("unchecked")
	@Override
	protected void initActor(InitGenActor m) {
		super.initActor(m);
		
		for(int i = 0; i<1; i++) {
			leftElements.add(HiPEMultiUtil.createMap());
			rightElements.add(HiPEMultiUtil.createMap());
			left2Right.add(HiPEMultiUtil.createMap());
		}
		num_of_constraints = 1;
	}
	
	@Override
	protected void initializePorts(Map<String, ActorRef> name2actor, CountJunctionNode node) {
		constraints.add(this::check_constraint_2);
		
		ports = new LinkedList<>();
		ports.add(new PortJunctionLeft(node.getPorts().getPort().get(0), getSelf(), name2actor.get("assignPatientToRoom_14_junction"), this::returnTrue , 0  , false ));
	}
	
	@Override
	protected void registerMatchForAttributeChanges(HMatch match) {
		Object[] matchObjects = match.getNodes();
		Collection<HMatch> doctor_0_Matches = doctorAttrMap.get(matchObjects[0]);
		if(doctor_0_Matches == null) {
			doctor_0_Matches = new LinkedList<>();
			doctorAttrMap.put(matchObjects[0], doctor_0_Matches);
		}
		
		doctor_0_Matches.add(match);
		
	}
	
	@Override
	protected void deregisterMatchForAttributeChanges(Set<HMatch> matches, HMatch match) {
		Object[] matchObjects = match.getNodes();
		Collection<HMatch> matches_0 = doctorAttrMap.get(matchObjects[0]);
		if(matches_0 != null) {
			matches_0.remove(match);
		}
	}
	
	@Override
	protected void changeAttribute(AttributeChanged<HMatch> message) {
		for(Port<?> port : ports) {
			message.initialMessage.increment();
			port.forwardMessage(message);
		}
		Object obj = message.node;
		if(obj instanceof HospitalExample.Doctor) {
			if(doctorAttrMap.containsKey(obj)) {
				for(HMatch attr_match : doctorAttrMap.get(obj)) {
					for(int i=0; i<ports.size(); i++) {
						Port<HMatch> port = ports.get(i);
						HMatch match = attr_match;
												
						if(match.isConstraintSatisfied(i)) {
							if(!constraints.get(i).apply(match, i))
								port.sendRemove(message.initialMessage, match);
						} else {
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
		HospitalExample.Doctor doctor = (HospitalExample.Doctor) match.getNodes()[0];
		boolean predicate = doctor.getPatientCapacity() > getCount(match, COUNT_findOccupiedDoc_doctor2doctor);
		match.setConstraintSatisfied(index, predicate);
		return predicate;
	}
	
}

