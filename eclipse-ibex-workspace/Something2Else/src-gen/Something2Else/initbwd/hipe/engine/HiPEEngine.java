package Something2Else.initbwd.hipe.engine;

import akka.actor.ActorRef;
import akka.actor.Props;

import Something2Else.initbwd.hipe.engine.actor.NotificationActor;
import Something2Else.initbwd.hipe.engine.actor.DispatchActor;
import Something2Else.initbwd.hipe.engine.actor.localsearch.ComponentToEntity_entity_entities_incoming_TRG__FILTER_NAC_TRG_1_localSearch;
import Something2Else.initbwd.hipe.engine.actor.localsearch.ComponentToEntity_comp_components_incoming_SRC__FILTER_NAC_SRC_6_localSearch;
import Something2Else.initbwd.hipe.engine.actor.localsearch.ComponentToEntity__CONSISTENCY_9_localSearch;
import Something2Else.initbwd.hipe.engine.actor.localsearch.LinkToEntityEmbedded_linkEntity_entities_incoming_TRG__FILTER_NAC_TRG_14_localSearch;
import Something2Else.initbwd.hipe.engine.actor.junction.LinkToEntityEmbedded__BWD_22_junction;
import Something2Else.initbwd.hipe.engine.actor.localsearch.LinkToEntityEmbedded_link_components_outgoing_SRC__FILTER_NAC_SRC_44_localSearch;
import Something2Else.initbwd.hipe.engine.actor.localsearch.LinkToEntityEmbedded_link_protocol_outgoing_SRC__FILTER_NAC_SRC_48_localSearch;
import Something2Else.initbwd.hipe.engine.actor.localsearch.LinkToEntityEmbedded__CONSISTENCY_52_localSearch;
import Something2Else.initbwd.hipe.engine.actor.localsearch.LinkToEntity_entity_entities_incoming_TRG__FILTER_NAC_TRG_66_localSearch;
import Something2Else.initbwd.hipe.engine.actor.localsearch.LinkToEntity_link_components_outgoing_SRC__FILTER_NAC_SRC_73_localSearch;
import Something2Else.initbwd.hipe.engine.actor.localsearch.LinkToEntity_link_protocol_outgoing_SRC__FILTER_NAC_SRC_76_localSearch;
import Something2Else.initbwd.hipe.engine.actor.localsearch.LinkToEntity_link_links_incoming_SRC__FILTER_NAC_SRC_80_localSearch;
import Something2Else.initbwd.hipe.engine.actor.localsearch.LinkToEntity__CONSISTENCY_83_localSearch;
import Something2Else.initbwd.hipe.engine.actor.localsearch.ProtocolToEntity__BWD_89_localSearch;
import Something2Else.initbwd.hipe.engine.actor.localsearch.ProtocolToEntity__CONSISTENCY_94_localSearch;
import Something2Else.initbwd.hipe.engine.actor.localsearch.SystemRefdComponentToEntity__BWD_102_localSearch;
import Something2Else.initbwd.hipe.engine.actor.localsearch.SystemRefdComponentToEntity__CONSISTENCY_107_localSearch;
import Something2Else.initbwd.hipe.engine.actor.localsearch.SystemToRoot__CONSISTENCY_116_localSearch;

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
		classes.put("ComponentToEntity__BWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("ComponentToEntity__BWD_production", "ComponentToEntity__BWD");
		classes.put("ComponentToEntity__CONSISTENCY_production", GenericProductionActor.class);
		productionNodes2pattern.put("ComponentToEntity__CONSISTENCY_production", "ComponentToEntity__CONSISTENCY");
		classes.put("ComponentToEntity_comp_components_incoming_SRC__FILTER_NAC_SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("ComponentToEntity_comp_components_incoming_SRC__FILTER_NAC_SRC_production", "ComponentToEntity_comp_components_incoming_SRC__FILTER_NAC_SRC");
		classes.put("ComponentToEntity_entity_entities_incoming_TRG__FILTER_NAC_TRG_production", GenericProductionActor.class);
		productionNodes2pattern.put("ComponentToEntity_entity_entities_incoming_TRG__FILTER_NAC_TRG_production", "ComponentToEntity_entity_entities_incoming_TRG__FILTER_NAC_TRG");
		classes.put("LinkToEntityEmbedded__BWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("LinkToEntityEmbedded__BWD_production", "LinkToEntityEmbedded__BWD");
		classes.put("LinkToEntityEmbedded__CONSISTENCY_production", GenericProductionActor.class);
		productionNodes2pattern.put("LinkToEntityEmbedded__CONSISTENCY_production", "LinkToEntityEmbedded__CONSISTENCY");
		classes.put("LinkToEntityEmbedded_linkEntity_entities_incoming_TRG__FILTER_NAC_TRG_production", GenericProductionActor.class);
		productionNodes2pattern.put("LinkToEntityEmbedded_linkEntity_entities_incoming_TRG__FILTER_NAC_TRG_production", "LinkToEntityEmbedded_linkEntity_entities_incoming_TRG__FILTER_NAC_TRG");
		classes.put("LinkToEntityEmbedded_link_components_outgoing_SRC__FILTER_NAC_SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("LinkToEntityEmbedded_link_components_outgoing_SRC__FILTER_NAC_SRC_production", "LinkToEntityEmbedded_link_components_outgoing_SRC__FILTER_NAC_SRC");
		classes.put("LinkToEntityEmbedded_link_protocol_outgoing_SRC__FILTER_NAC_SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("LinkToEntityEmbedded_link_protocol_outgoing_SRC__FILTER_NAC_SRC_production", "LinkToEntityEmbedded_link_protocol_outgoing_SRC__FILTER_NAC_SRC");
		classes.put("LinkToEntity__BWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("LinkToEntity__BWD_production", "LinkToEntity__BWD");
		classes.put("LinkToEntity__CONSISTENCY_production", GenericProductionActor.class);
		productionNodes2pattern.put("LinkToEntity__CONSISTENCY_production", "LinkToEntity__CONSISTENCY");
		classes.put("LinkToEntity_entity_entities_incoming_TRG__FILTER_NAC_TRG_production", GenericProductionActor.class);
		productionNodes2pattern.put("LinkToEntity_entity_entities_incoming_TRG__FILTER_NAC_TRG_production", "LinkToEntity_entity_entities_incoming_TRG__FILTER_NAC_TRG");
		classes.put("LinkToEntity_link_components_outgoing_SRC__FILTER_NAC_SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("LinkToEntity_link_components_outgoing_SRC__FILTER_NAC_SRC_production", "LinkToEntity_link_components_outgoing_SRC__FILTER_NAC_SRC");
		classes.put("LinkToEntity_link_links_incoming_SRC__FILTER_NAC_SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("LinkToEntity_link_links_incoming_SRC__FILTER_NAC_SRC_production", "LinkToEntity_link_links_incoming_SRC__FILTER_NAC_SRC");
		classes.put("LinkToEntity_link_protocol_outgoing_SRC__FILTER_NAC_SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("LinkToEntity_link_protocol_outgoing_SRC__FILTER_NAC_SRC_production", "LinkToEntity_link_protocol_outgoing_SRC__FILTER_NAC_SRC");
		classes.put("ProtocolToEntity__BWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("ProtocolToEntity__BWD_production", "ProtocolToEntity__BWD");
		classes.put("ProtocolToEntity__CONSISTENCY_production", GenericProductionActor.class);
		productionNodes2pattern.put("ProtocolToEntity__CONSISTENCY_production", "ProtocolToEntity__CONSISTENCY");
		classes.put("SystemRefdComponentToEntity__BWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("SystemRefdComponentToEntity__BWD_production", "SystemRefdComponentToEntity__BWD");
		classes.put("SystemRefdComponentToEntity__CONSISTENCY_production", GenericProductionActor.class);
		productionNodes2pattern.put("SystemRefdComponentToEntity__CONSISTENCY_production", "SystemRefdComponentToEntity__CONSISTENCY");
		classes.put("SystemToRoot__BWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("SystemToRoot__BWD_production", "SystemToRoot__BWD");
		classes.put("SystemToRoot__CONSISTENCY_production", GenericProductionActor.class);
		productionNodes2pattern.put("SystemToRoot__CONSISTENCY_production", "SystemToRoot__CONSISTENCY");
		
	}
	
	@Override
	public void createJunctionNodes() {
		classes.put("ComponentToEntity_entity_entities_incoming_TRG__FILTER_NAC_TRG_1_localSearch", ComponentToEntity_entity_entities_incoming_TRG__FILTER_NAC_TRG_1_localSearch.class);
		classes.put("ComponentToEntity__BWD_4_nacjunction", GenericNACJunctionActor.class);
		classes.put("ComponentToEntity_comp_components_incoming_SRC__FILTER_NAC_SRC_6_localSearch", ComponentToEntity_comp_components_incoming_SRC__FILTER_NAC_SRC_6_localSearch.class);
		classes.put("ComponentToEntity__CONSISTENCY_9_localSearch", ComponentToEntity__CONSISTENCY_9_localSearch.class);
		classes.put("LinkToEntityEmbedded_linkEntity_entities_incoming_TRG__FILTER_NAC_TRG_14_localSearch", LinkToEntityEmbedded_linkEntity_entities_incoming_TRG__FILTER_NAC_TRG_14_localSearch.class);
		classes.put("LinkToEntityEmbedded__BWD_18_nacjunction", GenericNACJunctionActor.class);
		classes.put("LinkToEntityEmbedded__BWD_21_junction", GenericJunctionActor.class);
		classes.put("LinkToEntityEmbedded__BWD_25_junction", GenericJunctionActor.class);
		classes.put("LinkToEntityEmbedded__BWD_32_junction", GenericJunctionActor.class);
		classes.put("LinkToEntityEmbedded__BWD_33_junction", GenericJunctionActor.class);
		classes.put("LinkToEntityEmbedded__BWD_26_junction", GenericJunctionActor.class);
		classes.put("LinkToEntityEmbedded__BWD_22_junction", LinkToEntityEmbedded__BWD_22_junction.class);
		classes.put("LinkToEntityEmbedded__BWD_19_junction", GenericJunctionActor.class);
		classes.put("LinkToEntityEmbedded__BWD_17_junction", GenericJunctionActor.class);
		classes.put("LinkToEntityEmbedded_link_components_outgoing_SRC__FILTER_NAC_SRC_44_localSearch", LinkToEntityEmbedded_link_components_outgoing_SRC__FILTER_NAC_SRC_44_localSearch.class);
		classes.put("LinkToEntityEmbedded_link_protocol_outgoing_SRC__FILTER_NAC_SRC_48_localSearch", LinkToEntityEmbedded_link_protocol_outgoing_SRC__FILTER_NAC_SRC_48_localSearch.class);
		classes.put("LinkToEntityEmbedded__CONSISTENCY_52_localSearch", LinkToEntityEmbedded__CONSISTENCY_52_localSearch.class);
		classes.put("LinkToEntity_entity_entities_incoming_TRG__FILTER_NAC_TRG_66_localSearch", LinkToEntity_entity_entities_incoming_TRG__FILTER_NAC_TRG_66_localSearch.class);
		classes.put("LinkToEntity__BWD_71_nacjunction", GenericNACJunctionActor.class);
		classes.put("LinkToEntity__BWD_69_junction", GenericJunctionActor.class);
		classes.put("LinkToEntity_link_components_outgoing_SRC__FILTER_NAC_SRC_73_localSearch", LinkToEntity_link_components_outgoing_SRC__FILTER_NAC_SRC_73_localSearch.class);
		classes.put("LinkToEntity_link_protocol_outgoing_SRC__FILTER_NAC_SRC_76_localSearch", LinkToEntity_link_protocol_outgoing_SRC__FILTER_NAC_SRC_76_localSearch.class);
		classes.put("LinkToEntity_link_links_incoming_SRC__FILTER_NAC_SRC_80_localSearch", LinkToEntity_link_links_incoming_SRC__FILTER_NAC_SRC_80_localSearch.class);
		classes.put("LinkToEntity__CONSISTENCY_83_localSearch", LinkToEntity__CONSISTENCY_83_localSearch.class);
		classes.put("ProtocolToEntity__BWD_89_localSearch", ProtocolToEntity__BWD_89_localSearch.class);
		classes.put("ProtocolToEntity__CONSISTENCY_94_localSearch", ProtocolToEntity__CONSISTENCY_94_localSearch.class);
		classes.put("SystemRefdComponentToEntity__BWD_102_localSearch", SystemRefdComponentToEntity__BWD_102_localSearch.class);
		classes.put("SystemRefdComponentToEntity__CONSISTENCY_107_localSearch", SystemRefdComponentToEntity__CONSISTENCY_107_localSearch.class);
		classes.put("SystemToRoot__CONSISTENCY_116_localSearch", SystemToRoot__CONSISTENCY_116_localSearch.class);
	}
	
	@Override
	public void createReferenceNodes() {
		classes.put("SystemToRoot_source_0_reference",SystemToRoot_source_0_reference.class);
		classes.put("SystemToRoot_target_0_reference",SystemToRoot_target_0_reference.class);
		classes.put("ProtocolToEntity_source_0_reference",ProtocolToEntity_source_0_reference.class);
		classes.put("ProtocolToEntity_target_0_reference",ProtocolToEntity_target_0_reference.class);
		classes.put("ComponentToEntity_source_0_reference",ComponentToEntity_source_0_reference.class);
		classes.put("ComponentToEntity_target_0_reference",ComponentToEntity_target_0_reference.class);
		classes.put("System_components_0_reference",System_components_0_reference.class);
		classes.put("System_protocols_0_reference",System_protocols_0_reference.class);
		
	}
	
	@Override
	public void createObjectNodes() {
		classes.put("ComponentToEntity__Marker_object",ComponentToEntity__Marker_object.class);
		classes.put("ProtocolToEntity_object",ProtocolToEntity_object.class);
		classes.put("LinkToEntity_object",LinkToEntity_object.class);
		classes.put("LinkToEntityEmbedded__Marker_object",LinkToEntityEmbedded__Marker_object.class);
		classes.put("LinkToEntity__Marker_object",LinkToEntity__Marker_object.class);
		classes.put("ProtocolToEntity__Marker_object",ProtocolToEntity__Marker_object.class);
		classes.put("SystemRefdComponentToEntity__Marker_object",SystemRefdComponentToEntity__Marker_object.class);
		classes.put("SystemToRoot__Marker_object",SystemToRoot__Marker_object.class);
		classes.put("Entity_object_SP0",Entity_object_SP0.class);
		classes.put("Entity_object_SP1",Entity_object_SP1.class);
		classes.put("Entity_object_SP2",Entity_object_SP2.class);
		classes.put("Entity_object_SP3",Entity_object_SP3.class);
		classes.put("Root_object_SP0",Root_object_SP0.class);
		classes.put("Root_object_SP1",Root_object_SP1.class);
		classes.put("Root_object_SP2",Root_object_SP2.class);
		classes.put("Component_object_SP0",Component_object_SP0.class);
		classes.put("Component_object_SP1",Component_object_SP1.class);
		classes.put("ComponentToEntity_object_SP0",ComponentToEntity_object_SP0.class);
		classes.put("ComponentToEntity_object_SP1",ComponentToEntity_object_SP1.class);
		classes.put("System_object_SP0",System_object_SP0.class);
		classes.put("System_object_SP1",System_object_SP1.class);
		classes.put("System_object_SP2",System_object_SP2.class);
		classes.put("SystemToRoot_object_SP0",SystemToRoot_object_SP0.class);
		classes.put("SystemToRoot_object_SP1",SystemToRoot_object_SP1.class);
		classes.put("Protocol_object_SP0",Protocol_object_SP0.class);
		classes.put("Protocol_object_SP1",Protocol_object_SP1.class);
		classes.put("Link_object_SP0",Link_object_SP0.class);
		classes.put("Link_object_SP1",Link_object_SP1.class);
		
	}
	
	@Override
	public void initializeReferenceNodes() {
		name2initRefGen.put("SystemToRoot_source_0_reference", new InitGenReferenceActor<Something2Else.SystemToRoot,tools.vitruv.methodologisttemplate.model.model.System>(name2actor, name2node.get("SystemToRoot_source_0_reference"), (o) -> o instanceof Something2Else.SystemToRoot, (o) -> o.getSource(), null, false, prodUtil, incUtil));
		name2initRefGen.put("SystemToRoot_target_0_reference", new InitGenReferenceActor<Something2Else.SystemToRoot,tools.vitruv.methodologisttemplate.model.model2.Root>(name2actor, name2node.get("SystemToRoot_target_0_reference"), (o) -> o instanceof Something2Else.SystemToRoot, (o) -> o.getTarget(), null, false, prodUtil, incUtil));
		name2initRefGen.put("ProtocolToEntity_source_0_reference", new InitGenReferenceActor<Something2Else.ProtocolToEntity,tools.vitruv.methodologisttemplate.model.model.Protocol>(name2actor, name2node.get("ProtocolToEntity_source_0_reference"), (o) -> o instanceof Something2Else.ProtocolToEntity, (o) -> o.getSource(), null, false, prodUtil, incUtil));
		name2initRefGen.put("ProtocolToEntity_target_0_reference", new InitGenReferenceActor<Something2Else.ProtocolToEntity,tools.vitruv.methodologisttemplate.model.model2.Entity>(name2actor, name2node.get("ProtocolToEntity_target_0_reference"), (o) -> o instanceof Something2Else.ProtocolToEntity, (o) -> o.getTarget(), null, false, prodUtil, incUtil));
		name2initRefGen.put("ComponentToEntity_source_0_reference", new InitGenReferenceActor<Something2Else.ComponentToEntity,tools.vitruv.methodologisttemplate.model.model.Component>(name2actor, name2node.get("ComponentToEntity_source_0_reference"), (o) -> o instanceof Something2Else.ComponentToEntity, (o) -> o.getSource(), null, false, prodUtil, incUtil));
		name2initRefGen.put("ComponentToEntity_target_0_reference", new InitGenReferenceActor<Something2Else.ComponentToEntity,tools.vitruv.methodologisttemplate.model.model2.Entity>(name2actor, name2node.get("ComponentToEntity_target_0_reference"), (o) -> o instanceof Something2Else.ComponentToEntity, (o) -> o.getTarget(), null, false, prodUtil, incUtil));
		name2initRefGen.put("System_components_0_reference", new InitGenReferenceActor<tools.vitruv.methodologisttemplate.model.model.System,tools.vitruv.methodologisttemplate.model.model.Component>(name2actor, name2node.get("System_components_0_reference"), (o) -> o instanceof tools.vitruv.methodologisttemplate.model.model.System, null, (o) -> o.getComponents(), false, prodUtil, incUtil));
		name2initRefGen.put("System_protocols_0_reference", new InitGenReferenceActor<tools.vitruv.methodologisttemplate.model.model.System,tools.vitruv.methodologisttemplate.model.model.Protocol>(name2actor, name2node.get("System_protocols_0_reference"), (o) -> o instanceof tools.vitruv.methodologisttemplate.model.model.System, null, (o) -> o.getProtocols(), false, prodUtil, incUtil));
	}
}

class ComponentToEntity__Marker_object extends GenericObjectActor<Something2Else.ComponentToEntity__Marker> { }
class ProtocolToEntity_object extends GenericObjectActor<Something2Else.ProtocolToEntity> { }
class LinkToEntity_object extends GenericObjectActor<Something2Else.LinkToEntity> { }
class LinkToEntityEmbedded__Marker_object extends GenericObjectActor<Something2Else.LinkToEntityEmbedded__Marker> { }
class LinkToEntity__Marker_object extends GenericObjectActor<Something2Else.LinkToEntity__Marker> { }
class ProtocolToEntity__Marker_object extends GenericObjectActor<Something2Else.ProtocolToEntity__Marker> { }
class SystemRefdComponentToEntity__Marker_object extends GenericObjectActor<Something2Else.SystemRefdComponentToEntity__Marker> { }
class SystemToRoot__Marker_object extends GenericObjectActor<Something2Else.SystemToRoot__Marker> { }
class Entity_object_SP0 extends GenericObjectActor<tools.vitruv.methodologisttemplate.model.model2.Entity> { }
class Entity_object_SP1 extends GenericObjectActor<tools.vitruv.methodologisttemplate.model.model2.Entity> { }
class Entity_object_SP2 extends GenericObjectActor<tools.vitruv.methodologisttemplate.model.model2.Entity> { }
class Entity_object_SP3 extends GenericObjectActor<tools.vitruv.methodologisttemplate.model.model2.Entity> { }
class Root_object_SP0 extends GenericObjectActor<tools.vitruv.methodologisttemplate.model.model2.Root> { }
class Root_object_SP1 extends GenericObjectActor<tools.vitruv.methodologisttemplate.model.model2.Root> { }
class Root_object_SP2 extends GenericObjectActor<tools.vitruv.methodologisttemplate.model.model2.Root> { }
class Component_object_SP0 extends GenericObjectActor<tools.vitruv.methodologisttemplate.model.model.Component> { }
class Component_object_SP1 extends GenericObjectActor<tools.vitruv.methodologisttemplate.model.model.Component> { }
class ComponentToEntity_object_SP0 extends GenericObjectActor<Something2Else.ComponentToEntity> { }
class ComponentToEntity_object_SP1 extends GenericObjectActor<Something2Else.ComponentToEntity> { }
class System_object_SP0 extends GenericObjectActor<tools.vitruv.methodologisttemplate.model.model.System> { }
class System_object_SP1 extends GenericObjectActor<tools.vitruv.methodologisttemplate.model.model.System> { }
class System_object_SP2 extends GenericObjectActor<tools.vitruv.methodologisttemplate.model.model.System> { }
class SystemToRoot_object_SP0 extends GenericObjectActor<Something2Else.SystemToRoot> { }
class SystemToRoot_object_SP1 extends GenericObjectActor<Something2Else.SystemToRoot> { }
class Protocol_object_SP0 extends GenericObjectActor<tools.vitruv.methodologisttemplate.model.model.Protocol> { }
class Protocol_object_SP1 extends GenericObjectActor<tools.vitruv.methodologisttemplate.model.model.Protocol> { }
class Link_object_SP0 extends GenericObjectActor<tools.vitruv.methodologisttemplate.model.model.Link> { }
class Link_object_SP1 extends GenericObjectActor<tools.vitruv.methodologisttemplate.model.model.Link> { }

class SystemToRoot_source_0_reference extends GenericReferenceActor<Something2Else.SystemToRoot, tools.vitruv.methodologisttemplate.model.model.System> { }
class SystemToRoot_target_0_reference extends GenericReferenceActor<Something2Else.SystemToRoot, tools.vitruv.methodologisttemplate.model.model2.Root> { }
class ProtocolToEntity_source_0_reference extends GenericReferenceActor<Something2Else.ProtocolToEntity, tools.vitruv.methodologisttemplate.model.model.Protocol> { }
class ProtocolToEntity_target_0_reference extends GenericReferenceActor<Something2Else.ProtocolToEntity, tools.vitruv.methodologisttemplate.model.model2.Entity> { }
class ComponentToEntity_source_0_reference extends GenericReferenceActor<Something2Else.ComponentToEntity, tools.vitruv.methodologisttemplate.model.model.Component> { }
class ComponentToEntity_target_0_reference extends GenericReferenceActor<Something2Else.ComponentToEntity, tools.vitruv.methodologisttemplate.model.model2.Entity> { }
class System_components_0_reference extends GenericReferenceActor<tools.vitruv.methodologisttemplate.model.model.System, tools.vitruv.methodologisttemplate.model.model.Component> { }
class System_protocols_0_reference extends GenericReferenceActor<tools.vitruv.methodologisttemplate.model.model.System, tools.vitruv.methodologisttemplate.model.model.Protocol> { }

