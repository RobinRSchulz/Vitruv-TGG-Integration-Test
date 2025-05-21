package Something2Else.modelgen.hipe.engine;

import akka.actor.ActorRef;
import akka.actor.Props;

import Something2Else.modelgen.hipe.engine.actor.NotificationActor;
import Something2Else.modelgen.hipe.engine.actor.DispatchActor;
import Something2Else.modelgen.hipe.engine.actor.localsearch.LinkToEntityEmbedded__GEN_1_localSearch;
import Something2Else.modelgen.hipe.engine.actor.localsearch.ProtocolToEntity__GEN_12_localSearch;
import Something2Else.modelgen.hipe.engine.actor.localsearch.SystemRefdComponentToEntity__GEN_16_localSearch;

import hipe.engine.IHiPEEngine;
import hipe.engine.message.InitGenReferenceActor;

import hipe.generic.actor.GenericObjectActor;
import hipe.generic.actor.GenericReferenceActor;
import hipe.generic.actor.GenericProductionActor;
import hipe.generic.actor.junction.*;

import hipe.network.*;

public class HiPEEngine extends IHiPEEngine{
	
	public HiPEEngine(HiPENetwork network) {
		super(network);
	}
	
	public HiPEEngine() {
		super();
	}
	
	@Override
	public String getClassLocation() {
		return getClass().getProtectionDomain().getCodeSource().getLocation().getPath().toString();
	}
	
	@Override
	public String getPackageName() {
		return getClass().getPackageName();
	}
	
	@Override
	protected ActorRef getDispatchActor() {
		return system.actorOf(
			Props.create(DispatchActor.class, () -> new DispatchActor(name2actor, incUtil)),
			"DispatchActor");
	}
	
	@Override
	protected ActorRef getNotificationActor(boolean cascadingNotifications) {
		return system.actorOf(
			Props.create(NotificationActor.class, () -> new NotificationActor(dispatcher, incUtil, cascadingNotifications)), 
			"NotificationActor");
	}
	
	@Override
	public void createProductionNodes() {
		classes.put("LinkToEntityEmbedded__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("LinkToEntityEmbedded__GEN_production", "LinkToEntityEmbedded__GEN");
		classes.put("LinkToEntity__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("LinkToEntity__GEN_production", "LinkToEntity__GEN");
		classes.put("ProtocolToEntity__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("ProtocolToEntity__GEN_production", "ProtocolToEntity__GEN");
		classes.put("SystemRefdComponentToEntity__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("SystemRefdComponentToEntity__GEN_production", "SystemRefdComponentToEntity__GEN");
		
	}
	
	@Override
	public void createJunctionNodes() {
		classes.put("LinkToEntityEmbedded__GEN_1_localSearch", LinkToEntityEmbedded__GEN_1_localSearch.class);
		classes.put("ProtocolToEntity__GEN_12_localSearch", ProtocolToEntity__GEN_12_localSearch.class);
		classes.put("SystemRefdComponentToEntity__GEN_16_localSearch", SystemRefdComponentToEntity__GEN_16_localSearch.class);
	}
	
	@Override
	public void createReferenceNodes() {
		
	}
	
	@Override
	public void createObjectNodes() {
		classes.put("Entity_object",Entity_object.class);
		classes.put("Component_object",Component_object.class);
		classes.put("ComponentToEntity_object",ComponentToEntity_object.class);
		classes.put("Protocol_object",Protocol_object.class);
		classes.put("ProtocolToEntity_object",ProtocolToEntity_object.class);
		classes.put("Root_object",Root_object.class);
		classes.put("SystemToRoot_object",SystemToRoot_object.class);
		classes.put("System_object",System_object.class);
		
	}
	
	@Override
	public void initializeReferenceNodes() {
	}
}

class Entity_object extends GenericObjectActor<tools.vitruv.methodologisttemplate.model.model2.Entity> { }
class Component_object extends GenericObjectActor<tools.vitruv.methodologisttemplate.model.model.Component> { }
class ComponentToEntity_object extends GenericObjectActor<Something2Else.ComponentToEntity> { }
class Protocol_object extends GenericObjectActor<tools.vitruv.methodologisttemplate.model.model.Protocol> { }
class ProtocolToEntity_object extends GenericObjectActor<Something2Else.ProtocolToEntity> { }
class Root_object extends GenericObjectActor<tools.vitruv.methodologisttemplate.model.model2.Root> { }
class SystemToRoot_object extends GenericObjectActor<Something2Else.SystemToRoot> { }
class System_object extends GenericObjectActor<tools.vitruv.methodologisttemplate.model.model.System> { }


