package Something2Else.cc.hipe.engine;

import akka.actor.ActorRef;
import akka.actor.Props;

import Something2Else.cc.hipe.engine.actor.NotificationActor;
import Something2Else.cc.hipe.engine.actor.DispatchActor;
import Something2Else.cc.hipe.engine.actor.localsearch.ComponentToEntity_comp_components_incoming_SRC__FILTER_NAC_SRC_1_localSearch;
import Something2Else.cc.hipe.engine.actor.localsearch.ComponentToEntity_entity_entities_incoming_TRG__FILTER_NAC_TRG_4_localSearch;
import Something2Else.cc.hipe.engine.actor.localsearch.LinkToEntityEmbedded_linkEntity_entities_incoming_TRG__FILTER_NAC_TRG_20_localSearch;
import Something2Else.cc.hipe.engine.actor.localsearch.LinkToEntityEmbedded_link_components_outgoing_SRC__FILTER_NAC_SRC_12_localSearch;
import Something2Else.cc.hipe.engine.actor.localsearch.LinkToEntityEmbedded_link_protocol_outgoing_SRC__FILTER_NAC_SRC_16_localSearch;
import Something2Else.cc.hipe.engine.actor.junction.LinkToEntityEmbedded__CC_28_junction;
import Something2Else.cc.hipe.engine.actor.localsearch.LinkToEntity_entity_entities_incoming_TRG__FILTER_NAC_TRG_69_localSearch;
import Something2Else.cc.hipe.engine.actor.localsearch.LinkToEntity_link_components_outgoing_SRC__FILTER_NAC_SRC_59_localSearch;
import Something2Else.cc.hipe.engine.actor.localsearch.LinkToEntity_link_protocol_outgoing_SRC__FILTER_NAC_SRC_62_localSearch;
import Something2Else.cc.hipe.engine.actor.localsearch.LinkToEntity_link_links_incoming_SRC__FILTER_NAC_SRC_66_localSearch;
import Something2Else.cc.hipe.engine.actor.localsearch.ProtocolToEntity__CC_81_localSearch;
import Something2Else.cc.hipe.engine.actor.localsearch.SystemRefdComponentToEntity__CC_87_localSearch;

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
		classes.put("ComponentToEntity__CC_production", GenericProductionActor.class);
		productionNodes2pattern.put("ComponentToEntity__CC_production", "ComponentToEntity__CC");
		classes.put("ComponentToEntity_comp_components_incoming_SRC__FILTER_NAC_SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("ComponentToEntity_comp_components_incoming_SRC__FILTER_NAC_SRC_production", "ComponentToEntity_comp_components_incoming_SRC__FILTER_NAC_SRC");
		classes.put("ComponentToEntity_entity_entities_incoming_TRG__FILTER_NAC_TRG_production", GenericProductionActor.class);
		productionNodes2pattern.put("ComponentToEntity_entity_entities_incoming_TRG__FILTER_NAC_TRG_production", "ComponentToEntity_entity_entities_incoming_TRG__FILTER_NAC_TRG");
		classes.put("LinkToEntityEmbedded__CC_production", GenericProductionActor.class);
		productionNodes2pattern.put("LinkToEntityEmbedded__CC_production", "LinkToEntityEmbedded__CC");
		classes.put("LinkToEntityEmbedded_linkEntity_entities_incoming_TRG__FILTER_NAC_TRG_production", GenericProductionActor.class);
		productionNodes2pattern.put("LinkToEntityEmbedded_linkEntity_entities_incoming_TRG__FILTER_NAC_TRG_production", "LinkToEntityEmbedded_linkEntity_entities_incoming_TRG__FILTER_NAC_TRG");
		classes.put("LinkToEntityEmbedded_link_components_outgoing_SRC__FILTER_NAC_SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("LinkToEntityEmbedded_link_components_outgoing_SRC__FILTER_NAC_SRC_production", "LinkToEntityEmbedded_link_components_outgoing_SRC__FILTER_NAC_SRC");
		classes.put("LinkToEntityEmbedded_link_protocol_outgoing_SRC__FILTER_NAC_SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("LinkToEntityEmbedded_link_protocol_outgoing_SRC__FILTER_NAC_SRC_production", "LinkToEntityEmbedded_link_protocol_outgoing_SRC__FILTER_NAC_SRC");
		classes.put("LinkToEntity__CC_production", GenericProductionActor.class);
		productionNodes2pattern.put("LinkToEntity__CC_production", "LinkToEntity__CC");
		classes.put("LinkToEntity_entity_entities_incoming_TRG__FILTER_NAC_TRG_production", GenericProductionActor.class);
		productionNodes2pattern.put("LinkToEntity_entity_entities_incoming_TRG__FILTER_NAC_TRG_production", "LinkToEntity_entity_entities_incoming_TRG__FILTER_NAC_TRG");
		classes.put("LinkToEntity_link_components_outgoing_SRC__FILTER_NAC_SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("LinkToEntity_link_components_outgoing_SRC__FILTER_NAC_SRC_production", "LinkToEntity_link_components_outgoing_SRC__FILTER_NAC_SRC");
		classes.put("LinkToEntity_link_links_incoming_SRC__FILTER_NAC_SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("LinkToEntity_link_links_incoming_SRC__FILTER_NAC_SRC_production", "LinkToEntity_link_links_incoming_SRC__FILTER_NAC_SRC");
		classes.put("LinkToEntity_link_protocol_outgoing_SRC__FILTER_NAC_SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("LinkToEntity_link_protocol_outgoing_SRC__FILTER_NAC_SRC_production", "LinkToEntity_link_protocol_outgoing_SRC__FILTER_NAC_SRC");
		classes.put("ProtocolToEntity__CC_production", GenericProductionActor.class);
		productionNodes2pattern.put("ProtocolToEntity__CC_production", "ProtocolToEntity__CC");
		classes.put("SystemRefdComponentToEntity__CC_production", GenericProductionActor.class);
		productionNodes2pattern.put("SystemRefdComponentToEntity__CC_production", "SystemRefdComponentToEntity__CC");
		classes.put("SystemToRoot__CC_production", GenericProductionActor.class);
		productionNodes2pattern.put("SystemToRoot__CC_production", "SystemToRoot__CC");
		
	}
	
	@Override
	public void createJunctionNodes() {
		classes.put("ComponentToEntity_comp_components_incoming_SRC__FILTER_NAC_SRC_1_localSearch", ComponentToEntity_comp_components_incoming_SRC__FILTER_NAC_SRC_1_localSearch.class);
		classes.put("ComponentToEntity__CC_8_nacjunction", GenericNACJunctionActor.class);
		classes.put("ComponentToEntity_entity_entities_incoming_TRG__FILTER_NAC_TRG_4_localSearch", ComponentToEntity_entity_entities_incoming_TRG__FILTER_NAC_TRG_4_localSearch.class);
		classes.put("ComponentToEntity__CC_9_nacjunction", GenericNACJunctionActor.class);
		classes.put("ComponentToEntity__CC_7_junction", GenericJunctionActor.class);
		classes.put("LinkToEntityEmbedded_linkEntity_entities_incoming_TRG__FILTER_NAC_TRG_20_localSearch", LinkToEntityEmbedded_linkEntity_entities_incoming_TRG__FILTER_NAC_TRG_20_localSearch.class);
		classes.put("LinkToEntityEmbedded__CC_24_nacjunction", GenericNACJunctionActor.class);
		classes.put("LinkToEntityEmbedded__CC_29_junction", GenericJunctionActor.class);
		classes.put("LinkToEntityEmbedded_link_components_outgoing_SRC__FILTER_NAC_SRC_12_localSearch", LinkToEntityEmbedded_link_components_outgoing_SRC__FILTER_NAC_SRC_12_localSearch.class);
		classes.put("LinkToEntityEmbedded__CC_36_nacjunction", GenericNACJunctionActor.class);
		classes.put("LinkToEntityEmbedded__CC_30_junction", GenericJunctionActor.class);
		classes.put("LinkToEntityEmbedded__CC_27_junction", GenericJunctionActor.class);
		classes.put("LinkToEntityEmbedded_link_protocol_outgoing_SRC__FILTER_NAC_SRC_16_localSearch", LinkToEntityEmbedded_link_protocol_outgoing_SRC__FILTER_NAC_SRC_16_localSearch.class);
		classes.put("LinkToEntityEmbedded__CC_37_nacjunction", GenericNACJunctionActor.class);
		classes.put("LinkToEntityEmbedded__CC_38_junction", GenericJunctionActor.class);
		classes.put("LinkToEntityEmbedded__CC_31_junction", GenericJunctionActor.class);
		classes.put("LinkToEntityEmbedded__CC_39_junction", GenericJunctionActor.class);
		classes.put("LinkToEntityEmbedded__CC_40_junction", GenericJunctionActor.class);
		classes.put("LinkToEntityEmbedded__CC_32_junction", GenericJunctionActor.class);
		classes.put("LinkToEntityEmbedded__CC_28_junction", LinkToEntityEmbedded__CC_28_junction.class);
		classes.put("LinkToEntityEmbedded__CC_25_junction", GenericJunctionActor.class);
		classes.put("LinkToEntityEmbedded__CC_23_junction", GenericJunctionActor.class);
		classes.put("LinkToEntity_entity_entities_incoming_TRG__FILTER_NAC_TRG_69_localSearch", LinkToEntity_entity_entities_incoming_TRG__FILTER_NAC_TRG_69_localSearch.class);
		classes.put("LinkToEntity__CC_73_nacjunction", GenericNACJunctionActor.class);
		classes.put("LinkToEntity_link_components_outgoing_SRC__FILTER_NAC_SRC_59_localSearch", LinkToEntity_link_components_outgoing_SRC__FILTER_NAC_SRC_59_localSearch.class);
		classes.put("LinkToEntity__CC_77_nacjunction", GenericNACJunctionActor.class);
		classes.put("LinkToEntity_link_protocol_outgoing_SRC__FILTER_NAC_SRC_62_localSearch", LinkToEntity_link_protocol_outgoing_SRC__FILTER_NAC_SRC_62_localSearch.class);
		classes.put("LinkToEntity__CC_76_nacjunction", GenericNACJunctionActor.class);
		classes.put("LinkToEntity_link_links_incoming_SRC__FILTER_NAC_SRC_66_localSearch", LinkToEntity_link_links_incoming_SRC__FILTER_NAC_SRC_66_localSearch.class);
		classes.put("LinkToEntity__CC_74_nacjunction", GenericNACJunctionActor.class);
		classes.put("LinkToEntity__CC_72_junction", GenericJunctionActor.class);
		classes.put("ProtocolToEntity__CC_81_localSearch", ProtocolToEntity__CC_81_localSearch.class);
		classes.put("SystemRefdComponentToEntity__CC_87_localSearch", SystemRefdComponentToEntity__CC_87_localSearch.class);
		classes.put("SystemToRoot__CC_93_junction", GenericJunctionActor.class);
	}
	
	@Override
	public void createReferenceNodes() {
		classes.put("SystemToRoot_source_0_reference",SystemToRoot_source_0_reference.class);
		classes.put("SystemToRoot_target_0_reference",SystemToRoot_target_0_reference.class);
		classes.put("System_links_0_reference",System_links_0_reference.class);
		classes.put("Link_components_0_reference",Link_components_0_reference.class);
		classes.put("Link_protocol_0_reference",Link_protocol_0_reference.class);
		classes.put("ProtocolToEntity_source_0_reference",ProtocolToEntity_source_0_reference.class);
		classes.put("ProtocolToEntity_target_0_reference",ProtocolToEntity_target_0_reference.class);
		classes.put("ComponentToEntity_source_0_reference",ComponentToEntity_source_0_reference.class);
		classes.put("ComponentToEntity_target_0_reference",ComponentToEntity_target_0_reference.class);
		classes.put("System_components_0_reference",System_components_0_reference.class);
		classes.put("System_protocols_0_reference",System_protocols_0_reference.class);
		
	}
	
	@Override
	public void createObjectNodes() {
		classes.put("SystemToRoot_object",SystemToRoot_object.class);
		classes.put("ProtocolToEntity_object",ProtocolToEntity_object.class);
		classes.put("ComponentToEntity_object",ComponentToEntity_object.class);
		classes.put("Component_object_SP0",Component_object_SP0.class);
		classes.put("Component_object_SP1",Component_object_SP1.class);
		classes.put("System_object_SP0",System_object_SP0.class);
		classes.put("System_object_SP1",System_object_SP1.class);
		classes.put("System_object_SP2",System_object_SP2.class);
		classes.put("Entity_object_SP0",Entity_object_SP0.class);
		classes.put("Entity_object_SP1",Entity_object_SP1.class);
		classes.put("Entity_object_SP2",Entity_object_SP2.class);
		classes.put("Root_object_SP0",Root_object_SP0.class);
		classes.put("Root_object_SP1",Root_object_SP1.class);
		classes.put("Link_object_SP0",Link_object_SP0.class);
		classes.put("Link_object_SP1",Link_object_SP1.class);
		classes.put("Protocol_object_SP0",Protocol_object_SP0.class);
		classes.put("Protocol_object_SP1",Protocol_object_SP1.class);
		
	}
	
	@Override
	public void initializeReferenceNodes() {
		name2initRefGen.put("SystemToRoot_source_0_reference", new InitGenReferenceActor<Something2Else.SystemToRoot,tools.vitruv.methodologisttemplate.model.model.System>(name2actor, name2node.get("SystemToRoot_source_0_reference"), (o) -> o instanceof Something2Else.SystemToRoot, (o) -> o.getSource(), null, false, prodUtil, incUtil));
		name2initRefGen.put("SystemToRoot_target_0_reference", new InitGenReferenceActor<Something2Else.SystemToRoot,tools.vitruv.methodologisttemplate.model.model2.Root>(name2actor, name2node.get("SystemToRoot_target_0_reference"), (o) -> o instanceof Something2Else.SystemToRoot, (o) -> o.getTarget(), null, false, prodUtil, incUtil));
		name2initRefGen.put("System_links_0_reference", new InitGenReferenceActor<tools.vitruv.methodologisttemplate.model.model.System,tools.vitruv.methodologisttemplate.model.model.Link>(name2actor, name2node.get("System_links_0_reference"), (o) -> o instanceof tools.vitruv.methodologisttemplate.model.model.System, null, (o) -> o.getLinks(), false, prodUtil, incUtil));
		name2initRefGen.put("Link_components_0_reference", new InitGenReferenceActor<tools.vitruv.methodologisttemplate.model.model.Link,tools.vitruv.methodologisttemplate.model.model.Component>(name2actor, name2node.get("Link_components_0_reference"), (o) -> o instanceof tools.vitruv.methodologisttemplate.model.model.Link, null, (o) -> o.getComponents(), false, prodUtil, incUtil));
		name2initRefGen.put("Link_protocol_0_reference", new InitGenReferenceActor<tools.vitruv.methodologisttemplate.model.model.Link,tools.vitruv.methodologisttemplate.model.model.Protocol>(name2actor, name2node.get("Link_protocol_0_reference"), (o) -> o instanceof tools.vitruv.methodologisttemplate.model.model.Link, (o) -> o.getProtocol(), null, false, prodUtil, incUtil));
		name2initRefGen.put("ProtocolToEntity_source_0_reference", new InitGenReferenceActor<Something2Else.ProtocolToEntity,tools.vitruv.methodologisttemplate.model.model.Protocol>(name2actor, name2node.get("ProtocolToEntity_source_0_reference"), (o) -> o instanceof Something2Else.ProtocolToEntity, (o) -> o.getSource(), null, false, prodUtil, incUtil));
		name2initRefGen.put("ProtocolToEntity_target_0_reference", new InitGenReferenceActor<Something2Else.ProtocolToEntity,tools.vitruv.methodologisttemplate.model.model2.Entity>(name2actor, name2node.get("ProtocolToEntity_target_0_reference"), (o) -> o instanceof Something2Else.ProtocolToEntity, (o) -> o.getTarget(), null, false, prodUtil, incUtil));
		name2initRefGen.put("ComponentToEntity_source_0_reference", new InitGenReferenceActor<Something2Else.ComponentToEntity,tools.vitruv.methodologisttemplate.model.model.Component>(name2actor, name2node.get("ComponentToEntity_source_0_reference"), (o) -> o instanceof Something2Else.ComponentToEntity, (o) -> o.getSource(), null, false, prodUtil, incUtil));
		name2initRefGen.put("ComponentToEntity_target_0_reference", new InitGenReferenceActor<Something2Else.ComponentToEntity,tools.vitruv.methodologisttemplate.model.model2.Entity>(name2actor, name2node.get("ComponentToEntity_target_0_reference"), (o) -> o instanceof Something2Else.ComponentToEntity, (o) -> o.getTarget(), null, false, prodUtil, incUtil));
		name2initRefGen.put("System_components_0_reference", new InitGenReferenceActor<tools.vitruv.methodologisttemplate.model.model.System,tools.vitruv.methodologisttemplate.model.model.Component>(name2actor, name2node.get("System_components_0_reference"), (o) -> o instanceof tools.vitruv.methodologisttemplate.model.model.System, null, (o) -> o.getComponents(), false, prodUtil, incUtil));
		name2initRefGen.put("System_protocols_0_reference", new InitGenReferenceActor<tools.vitruv.methodologisttemplate.model.model.System,tools.vitruv.methodologisttemplate.model.model.Protocol>(name2actor, name2node.get("System_protocols_0_reference"), (o) -> o instanceof tools.vitruv.methodologisttemplate.model.model.System, null, (o) -> o.getProtocols(), false, prodUtil, incUtil));
	}
}

class SystemToRoot_object extends GenericObjectActor<Something2Else.SystemToRoot> { }
class ProtocolToEntity_object extends GenericObjectActor<Something2Else.ProtocolToEntity> { }
class ComponentToEntity_object extends GenericObjectActor<Something2Else.ComponentToEntity> { }
class Component_object_SP0 extends GenericObjectActor<tools.vitruv.methodologisttemplate.model.model.Component> { }
class Component_object_SP1 extends GenericObjectActor<tools.vitruv.methodologisttemplate.model.model.Component> { }
class System_object_SP0 extends GenericObjectActor<tools.vitruv.methodologisttemplate.model.model.System> { }
class System_object_SP1 extends GenericObjectActor<tools.vitruv.methodologisttemplate.model.model.System> { }
class System_object_SP2 extends GenericObjectActor<tools.vitruv.methodologisttemplate.model.model.System> { }
class Entity_object_SP0 extends GenericObjectActor<tools.vitruv.methodologisttemplate.model.model2.Entity> { }
class Entity_object_SP1 extends GenericObjectActor<tools.vitruv.methodologisttemplate.model.model2.Entity> { }
class Entity_object_SP2 extends GenericObjectActor<tools.vitruv.methodologisttemplate.model.model2.Entity> { }
class Root_object_SP0 extends GenericObjectActor<tools.vitruv.methodologisttemplate.model.model2.Root> { }
class Root_object_SP1 extends GenericObjectActor<tools.vitruv.methodologisttemplate.model.model2.Root> { }
class Link_object_SP0 extends GenericObjectActor<tools.vitruv.methodologisttemplate.model.model.Link> { }
class Link_object_SP1 extends GenericObjectActor<tools.vitruv.methodologisttemplate.model.model.Link> { }
class Protocol_object_SP0 extends GenericObjectActor<tools.vitruv.methodologisttemplate.model.model.Protocol> { }
class Protocol_object_SP1 extends GenericObjectActor<tools.vitruv.methodologisttemplate.model.model.Protocol> { }

class SystemToRoot_source_0_reference extends GenericReferenceActor<Something2Else.SystemToRoot, tools.vitruv.methodologisttemplate.model.model.System> { }
class SystemToRoot_target_0_reference extends GenericReferenceActor<Something2Else.SystemToRoot, tools.vitruv.methodologisttemplate.model.model2.Root> { }
class System_links_0_reference extends GenericReferenceActor<tools.vitruv.methodologisttemplate.model.model.System, tools.vitruv.methodologisttemplate.model.model.Link> { }
class Link_components_0_reference extends GenericReferenceActor<tools.vitruv.methodologisttemplate.model.model.Link, tools.vitruv.methodologisttemplate.model.model.Component> { }
class Link_protocol_0_reference extends GenericReferenceActor<tools.vitruv.methodologisttemplate.model.model.Link, tools.vitruv.methodologisttemplate.model.model.Protocol> { }
class ProtocolToEntity_source_0_reference extends GenericReferenceActor<Something2Else.ProtocolToEntity, tools.vitruv.methodologisttemplate.model.model.Protocol> { }
class ProtocolToEntity_target_0_reference extends GenericReferenceActor<Something2Else.ProtocolToEntity, tools.vitruv.methodologisttemplate.model.model2.Entity> { }
class ComponentToEntity_source_0_reference extends GenericReferenceActor<Something2Else.ComponentToEntity, tools.vitruv.methodologisttemplate.model.model.Component> { }
class ComponentToEntity_target_0_reference extends GenericReferenceActor<Something2Else.ComponentToEntity, tools.vitruv.methodologisttemplate.model.model2.Entity> { }
class System_components_0_reference extends GenericReferenceActor<tools.vitruv.methodologisttemplate.model.model.System, tools.vitruv.methodologisttemplate.model.model.Component> { }
class System_protocols_0_reference extends GenericReferenceActor<tools.vitruv.methodologisttemplate.model.model.System, tools.vitruv.methodologisttemplate.model.model.Protocol> { }

