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

public class assignNurseToRoom_8_count extends AbstractCountJunctionActor{
	public static final int COUNT_findRoomInDepartment_department2department = 0;
	private Map<Object, Collection<HMatch>> department_3_AttrMap = HiPEMultiUtil.createMap();
	
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
		constraints.add(this::check_constraint_3);
		
		ports = new LinkedList<>();
		ports.add(new PortNodeRight(node.getPorts().getPort().get(0), getSelf(), name2actor.get("Hospital_department_1_reference"), (BiFunction<Object, Integer, Boolean>) this::returnTrue , 0   ));
	}
	
	@Override
	protected void registerMatchForAttributeChanges(HMatch match) {
		Object[] matchObjects = match.getNodes();
		Collection<HMatch> department_0_Matches = department_3_AttrMap.get(matchObjects[0]);
		if(department_0_Matches == null) {
			department_0_Matches = new LinkedList<>();
			department_3_AttrMap.put(matchObjects[0], department_0_Matches);
		}
		
		department_0_Matches.add(match);
		
	}
	
	@Override
	protected void deregisterMatchForAttributeChanges(Set<HMatch> matches, HMatch match) {
		Object[] matchObjects = match.getNodes();
		Collection<HMatch> matches_0 = department_3_AttrMap.get(matchObjects[0]);
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
		if(obj instanceof HospitalExample.Department) {
			if(department_3_AttrMap.containsKey(obj)) {
				for(HMatch attr_match : department_3_AttrMap.get(obj)) {
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
	
	public boolean check_constraint_3(HMatch match, int index) {
		HospitalExample.Department department = (HospitalExample.Department) match.getNodes()[0];
		boolean predicate = department.getMaxRoomCount() > getCount(match, COUNT_findRoomInDepartment_department2department);
		match.setConstraintSatisfied(index, predicate);
		return predicate;
	}
	
}

