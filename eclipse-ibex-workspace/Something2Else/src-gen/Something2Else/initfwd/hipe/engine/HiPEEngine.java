package Something2Else.initfwd.hipe.engine;

import akka.actor.ActorRef;
import akka.actor.Props;

import Something2Else.initfwd.hipe.engine.actor.NotificationActor;
import Something2Else.initfwd.hipe.engine.actor.DispatchActor;
import Something2Else.initfwd.hipe.engine.actor.localsearch.ComponentToEntity_comp_components_incoming_SRC__FILTER_NAC_SRC_1_localSearch;
import Something2Else.initfwd.hipe.engine.actor.localsearch.ComponentToEntity_entity_entities_incoming_TRG__FILTER_NAC_TRG_4_localSearch;
import Something2Else.initfwd.hipe.engine.actor.localsearch.ComponentToEntity__CONSISTENCY_7_localSearch;
import Something2Else.initfwd.hipe.engine.actor.localsearch.LinkToEntityEmbedded_link_components_outgoing_SRC__FILTER_NAC_SRC_14_localSearch;
import Something2Else.initfwd.hipe.engine.actor.localsearch.LinkToEntityEmbedded_link_protocol_outgoing_SRC__FILTER_NAC_SRC_18_localSearch;
import Something2Else.initfwd.hipe.engine.actor.localsearch.LinkToEntityEmbedded_linkEntity_entities_incoming_TRG__FILTER_NAC_TRG_22_localSearch;
import Something2Else.initfwd.hipe.engine.actor.localsearch.LinkToEntityEmbedded__CONSISTENCY_25_localSearch;
import Something2Else.initfwd.hipe.engine.actor.localsearch.LinkToEntityEmbedded__FWD_39_localSearch;
import Something2Else.initfwd.hipe.engine.actor.localsearch.LinkToEntity_link_components_outgoing_SRC__FILTER_NAC_SRC_50_localSearch;
import Something2Else.initfwd.hipe.engine.actor.localsearch.LinkToEntity_link_protocol_outgoing_SRC__FILTER_NAC_SRC_53_localSearch;
import Something2Else.initfwd.hipe.engine.actor.localsearch.LinkToEntity_link_links_incoming_SRC__FILTER_NAC_SRC_57_localSearch;
import Something2Else.initfwd.hipe.engine.actor.localsearch.LinkToEntity_entity_entities_incoming_TRG__FILTER_NAC_TRG_60_localSearch;
import Something2Else.initfwd.hipe.engine.actor.localsearch.LinkToEntity__CONSISTENCY_63_localSearch;
import Something2Else.initfwd.hipe.engine.actor.localsearch.LinkToEntity__FWD_69_localSearch;
import Something2Else.initfwd.hipe.engine.actor.localsearch.ProtocolToEntity__CONSISTENCY_72_localSearch;
import Something2Else.initfwd.hipe.engine.actor.localsearch.ProtocolToEntity__FWD_80_localSearch;
import Something2Else.initfwd.hipe.engine.actor.localsearch.SystemRefdComponentToEntity__CONSISTENCY_85_localSearch;
import Something2Else.initfwd.hipe.engine.actor.localsearch.SystemRefdComponentToEntity__FWD_93_localSearch;
import Something2Else.initfwd.hipe.engine.actor.localsearch.SystemToRoot__CONSISTENCY_98_localSearch;

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
		classes.put("ComponentToEntity__CONSISTENCY_production", GenericProductionActor.class);
		productionNodes2pattern.put("ComponentToEntity__CONSISTENCY_production", "ComponentToEntity__CONSISTENCY");
		classes.put("ComponentToEntity__FWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("ComponentToEntity__FWD_production", "ComponentToEntity__FWD");
		classes.put("ComponentToEntity_comp_components_incoming_SRC__FILTER_NAC_SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("ComponentToEntity_comp_components_incoming_SRC__FILTER_NAC_SRC_production", "ComponentToEntity_comp_components_incoming_SRC__FILTER_NAC_SRC");
		classes.put("ComponentToEntity_entity_entities_incoming_TRG__FILTER_NAC_TRG_production", GenericProductionActor.class);
		productionNodes2pattern.put("ComponentToEntity_entity_entities_incoming_TRG__FILTER_NAC_TRG_production", "ComponentToEntity_entity_entities_incoming_TRG__FILTER_NAC_TRG");
		classes.put("LinkToEntityEmbedded__CONSISTENCY_production", GenericProductionActor.class);
		productionNodes2pattern.put("LinkToEntityEmbedded__CONSISTENCY_production", "LinkToEntityEmbedded__CONSISTENCY");
		classes.put("LinkToEntityEmbedded__FWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("LinkToEntityEmbedded__FWD_production", "LinkToEntityEmbedded__FWD");
		classes.put("LinkToEntityEmbedded_linkEntity_entities_incoming_TRG__FILTER_NAC_TRG_production", GenericProductionActor.class);
		productionNodes2pattern.put("LinkToEntityEmbedded_linkEntity_entities_incoming_TRG__FILTER_NAC_TRG_production", "LinkToEntityEmbedded_linkEntity_entities_incoming_TRG__FILTER_NAC_TRG");
		classes.put("LinkToEntityEmbedded_link_components_outgoing_SRC__FILTER_NAC_SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("LinkToEntityEmbedded_link_components_outgoing_SRC__FILTER_NAC_SRC_production", "LinkToEntityEmbedded_link_components_outgoing_SRC__FILTER_NAC_SRC");
		classes.put("LinkToEntityEmbedded_link_protocol_outgoing_SRC__FILTER_NAC_SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("LinkToEntityEmbedded_link_protocol_outgoing_SRC__FILTER_NAC_SRC_production", "LinkToEntityEmbedded_link_protocol_outgoing_SRC__FILTER_NAC_SRC");
		classes.put("LinkToEntity__CONSISTENCY_production", GenericProductionActor.class);
		productionNodes2pattern.put("LinkToEntity__CONSISTENCY_production", "LinkToEntity__CONSISTENCY");
		classes.put("LinkToEntity__FWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("LinkToEntity__FWD_production", "LinkToEntity__FWD");
		classes.put("LinkToEntity_entity_entities_incoming_TRG__FILTER_NAC_TRG_production", GenericProductionActor.class);
		productionNodes2pattern.put("LinkToEntity_entity_entities_incoming_TRG__FILTER_NAC_TRG_production", "LinkToEntity_entity_entities_incoming_TRG__FILTER_NAC_TRG");
		classes.put("LinkToEntity_link_components_outgoing_SRC__FILTER_NAC_SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("LinkToEntity_link_components_outgoing_SRC__FILTER_NAC_SRC_production", "LinkToEntity_link_components_outgoing_SRC__FILTER_NAC_SRC");
		classes.put("LinkToEntity_link_links_incoming_SRC__FILTER_NAC_SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("LinkToEntity_link_links_incoming_SRC__FILTER_NAC_SRC_production", "LinkToEntity_link_links_incoming_SRC__FILTER_NAC_SRC");
		classes.put("LinkToEntity_link_protocol_outgoing_SRC__FILTER_NAC_SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("LinkToEntity_link_protocol_outgoing_SRC__FILTER_NAC_SRC_production", "LinkToEntity_link_protocol_outgoing_SRC__FILTER_NAC_SRC");
		classes.put("ProtocolToEntity__CONSISTENCY_production", GenericProductionActor.class);
		productionNodes2pattern.put("ProtocolToEntity__CONSISTENCY_production", "ProtocolToEntity__CONSISTENCY");
		classes.put("ProtocolToEntity__FWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("ProtocolToEntity__FWD_production", "ProtocolToEntity__FWD");
		classes.put("SystemRefdComponentToEntity__CONSISTENCY_production", GenericProductionActor.class);
		productionNodes2pattern.put("SystemRefdComponentToEntity__CONSISTENCY_production", "SystemRefdComponentToEntity__CONSISTENCY");
		classes.put("SystemRefdComponentToEntity__FWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("SystemRefdComponentToEntity__FWD_production", "SystemRefdComponentToEntity__FWD");
		classes.put("SystemToRoot__CONSISTENCY_production", GenericProductionActor.class);
		productionNodes2pattern.put("SystemToRoot__CONSISTENCY_production", "SystemToRoot__CONSISTENCY");
		classes.put("SystemToRoot__FWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("SystemToRoot__FWD_production", "SystemToRoot__FWD");
		
	}
	
	@Override
	public void createJunctionNodes() {
		classes.put("ComponentToEntity_comp_components_incoming_SRC__FILTER_NAC_SRC_1_localSearch", ComponentToEntity_comp_components_incoming_SRC__FILTER_NAC_SRC_1_localSearch.class);
		classes.put("ComponentToEntity_entity_entities_incoming_TRG__FILTER_NAC_TRG_4_localSearch", ComponentToEntity_entity_entities_incoming_TRG__FILTER_NAC_TRG_4_localSearch.class);
		classes.put("ComponentToEntity__CONSISTENCY_7_localSearch", ComponentToEntity__CONSISTENCY_7_localSearch.class);
		classes.put("ComponentToEntity__FWD_12_nacjunction", GenericNACJunctionActor.class);
		classes.put("LinkToEntityEmbedded_link_components_outgoing_SRC__FILTER_NAC_SRC_14_localSearch", LinkToEntityEmbedded_link_components_outgoing_SRC__FILTER_NAC_SRC_14_localSearch.class);
		classes.put("LinkToEntityEmbedded_link_protocol_outgoing_SRC__FILTER_NAC_SRC_18_localSearch", LinkToEntityEmbedded_link_protocol_outgoing_SRC__FILTER_NAC_SRC_18_localSearch.class);
		classes.put("LinkToEntityEmbedded_linkEntity_entities_incoming_TRG__FILTER_NAC_TRG_22_localSearch", LinkToEntityEmbedded_linkEntity_entities_incoming_TRG__FILTER_NAC_TRG_22_localSearch.class);
		classes.put("LinkToEntityEmbedded__CONSISTENCY_25_localSearch", LinkToEntityEmbedded__CONSISTENCY_25_localSearch.class);
		classes.put("LinkToEntityEmbedded__FWD_39_localSearch", LinkToEntityEmbedded__FWD_39_localSearch.class);
		classes.put("LinkToEntity_link_components_outgoing_SRC__FILTER_NAC_SRC_50_localSearch", LinkToEntity_link_components_outgoing_SRC__FILTER_NAC_SRC_50_localSearch.class);
		classes.put("LinkToEntity_link_protocol_outgoing_SRC__FILTER_NAC_SRC_53_localSearch", LinkToEntity_link_protocol_outgoing_SRC__FILTER_NAC_SRC_53_localSearch.class);
		classes.put("LinkToEntity_link_links_incoming_SRC__FILTER_NAC_SRC_57_localSearch", LinkToEntity_link_links_incoming_SRC__FILTER_NAC_SRC_57_localSearch.class);
		classes.put("LinkToEntity_entity_entities_incoming_TRG__FILTER_NAC_TRG_60_localSearch", LinkToEntity_entity_entities_incoming_TRG__FILTER_NAC_TRG_60_localSearch.class);
		classes.put("LinkToEntity__CONSISTENCY_63_localSearch", LinkToEntity__CONSISTENCY_63_localSearch.class);
		classes.put("LinkToEntity__FWD_69_localSearch", LinkToEntity__FWD_69_localSearch.class);
		classes.put("ProtocolToEntity__CONSISTENCY_72_localSearch", ProtocolToEntity__CONSISTENCY_72_localSearch.class);
		classes.put("ProtocolToEntity__FWD_80_localSearch", ProtocolToEntity__FWD_80_localSearch.class);
		classes.put("SystemRefdComponentToEntity__CONSISTENCY_85_localSearch", SystemRefdComponentToEntity__CONSISTENCY_85_localSearch.class);
		classes.put("SystemRefdComponentToEntity__FWD_93_localSearch", SystemRefdComponentToEntity__FWD_93_localSearch.class);
		classes.put("SystemToRoot__CONSISTENCY_98_localSearch", SystemToRoot__CONSISTENCY_98_localSearch.class);
	}
	
	@Override
	public void createReferenceNodes() {
		
	}
	
	@Override
	public void createObjectNodes() {
		classes.put("ComponentToEntity_object",ComponentToEntity_object.class);
		classes.put("ComponentToEntity__Marker_object",ComponentToEntity__Marker_object.class);
		classes.put("LinkToEntity_object",LinkToEntity_object.class);
		classes.put("ProtocolToEntity_object",ProtocolToEntity_object.class);
		classes.put("LinkToEntityEmbedded__Marker_object",LinkToEntityEmbedded__Marker_object.class);
		classes.put("LinkToEntity__Marker_object",LinkToEntity__Marker_object.class);
		classes.put("ProtocolToEntity__Marker_object",ProtocolToEntity__Marker_object.class);
		classes.put("SystemRefdComponentToEntity__Marker_object",SystemRefdComponentToEntity__Marker_object.class);
		classes.put("SystemToRoot__Marker_object",SystemToRoot__Marker_object.class);
		classes.put("Component_object_SP0",Component_object_SP0.class);
		classes.put("Component_object_SP1",Component_object_SP1.class);
		classes.put("Component_object_SP2",Component_object_SP2.class);
		classes.put("Entity_object_SP0",Entity_object_SP0.class);
		classes.put("Entity_object_SP1",Entity_object_SP1.class);
		classes.put("Entity_object_SP2",Entity_object_SP2.class);
		classes.put("System_object_SP0",System_object_SP0.class);
		classes.put("System_object_SP1",System_object_SP1.class);
		classes.put("System_object_SP2",System_object_SP2.class);
		classes.put("Root_object_SP0",Root_object_SP0.class);
		classes.put("Root_object_SP1",Root_object_SP1.class);
		classes.put("Root_object_SP2",Root_object_SP2.class);
		classes.put("Link_object_SP0",Link_object_SP0.class);
		classes.put("Link_object_SP1",Link_object_SP1.class);
		classes.put("Link_object_SP2",Link_object_SP2.class);
		classes.put("Protocol_object_SP0",Protocol_object_SP0.class);
		classes.put("Protocol_object_SP1",Protocol_object_SP1.class);
		classes.put("SystemToRoot_object_SP0",SystemToRoot_object_SP0.class);
		classes.put("SystemToRoot_object_SP1",SystemToRoot_object_SP1.class);
		
	}
	
	@Override
	public void initializeReferenceNodes() {
	}
}

class ComponentToEntity_object extends GenericObjectActor<Something2Else.ComponentToEntity> { }
class ComponentToEntity__Marker_object extends GenericObjectActor<Something2Else.ComponentToEntity__Marker> { }
class LinkToEntity_object extends GenericObjectActor<Something2Else.LinkToEntity> { }
class ProtocolToEntity_object extends GenericObjectActor<Something2Else.ProtocolToEntity> { }
class LinkToEntityEmbedded__Marker_object extends GenericObjectActor<Something2Else.LinkToEntityEmbedded__Marker> { }
class LinkToEntity__Marker_object extends GenericObjectActor<Something2Else.LinkToEntity__Marker> { }
class ProtocolToEntity__Marker_object extends GenericObjectActor<Something2Else.ProtocolToEntity__Marker> { }
class SystemRefdComponentToEntity__Marker_object extends GenericObjectActor<Something2Else.SystemRefdComponentToEntity__Marker> { }
class SystemToRoot__Marker_object extends GenericObjectActor<Something2Else.SystemToRoot__Marker> { }
class Component_object_SP0 extends GenericObjectActor<tools.vitruv.methodologisttemplate.model.model.Component> { }
class Component_object_SP1 extends GenericObjectActor<tools.vitruv.methodologisttemplate.model.model.Component> { }
class Component_object_SP2 extends GenericObjectActor<tools.vitruv.methodologisttemplate.model.model.Component> { }
class Entity_object_SP0 extends GenericObjectActor<tools.vitruv.methodologisttemplate.model.model2.Entity> { }
class Entity_object_SP1 extends GenericObjectActor<tools.vitruv.methodologisttemplate.model.model2.Entity> { }
class Entity_object_SP2 extends GenericObjectActor<tools.vitruv.methodologisttemplate.model.model2.Entity> { }
class System_object_SP0 extends GenericObjectActor<tools.vitruv.methodologisttemplate.model.model.System> { }
class System_object_SP1 extends GenericObjectActor<tools.vitruv.methodologisttemplate.model.model.System> { }
class System_object_SP2 extends GenericObjectActor<tools.vitruv.methodologisttemplate.model.model.System> { }
class Root_object_SP0 extends GenericObjectActor<tools.vitruv.methodologisttemplate.model.model2.Root> { }
class Root_object_SP1 extends GenericObjectActor<tools.vitruv.methodologisttemplate.model.model2.Root> { }
class Root_object_SP2 extends GenericObjectActor<tools.vitruv.methodologisttemplate.model.model2.Root> { }
class Link_object_SP0 extends GenericObjectActor<tools.vitruv.methodologisttemplate.model.model.Link> { }
class Link_object_SP1 extends GenericObjectActor<tools.vitruv.methodologisttemplate.model.model.Link> { }
class Link_object_SP2 extends GenericObjectActor<tools.vitruv.methodologisttemplate.model.model.Link> { }
class Protocol_object_SP0 extends GenericObjectActor<tools.vitruv.methodologisttemplate.model.model.Protocol> { }
class Protocol_object_SP1 extends GenericObjectActor<tools.vitruv.methodologisttemplate.model.model.Protocol> { }
class SystemToRoot_object_SP0 extends GenericObjectActor<Something2Else.SystemToRoot> { }
class SystemToRoot_object_SP1 extends GenericObjectActor<Something2Else.SystemToRoot> { }


