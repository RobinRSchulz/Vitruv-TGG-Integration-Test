package Something2Else.co.hipe.engine.actor;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EObject;

import java.text.DecimalFormat;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.time.Duration;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Consumer;

import akka.actor.AbstractActor;
import akka.actor.ActorRef;
import akka.stream.ActorMaterializer;
import akka.stream.javadsl.*;
import static akka.pattern.Patterns.ask;

import hipe.engine.util.HiPEMultiUtil;
import hipe.engine.util.IncUtil;
import hipe.engine.message.NewInput;
import hipe.engine.message.NoMoreInput;
import hipe.engine.message.input.ObjectAdded;
import hipe.engine.message.input.ObjectDeleted;
import hipe.engine.message.input.ReferenceAdded;
import hipe.engine.message.input.ReferenceDeleted;		
import hipe.engine.message.input.AttributeChanged;
import hipe.engine.message.input.NotificationContainer;

import hipe.generic.actor.junction.util.HiPEConfig;

public class DispatchActor extends AbstractActor {
	
	private int counter = 0;
	public long time = 0;
				
	private Map<String, ActorRef> name2actor;
	
	private Map<Object, Consumer<Object>> type2addConsumer = HiPEMultiUtil.createMap();
	private Map<Object, Consumer<Notification>> feature2setConsumer = HiPEMultiUtil.createMap();
	private Map<Object, Consumer<Notification>> feature2addEdgeConsumer = HiPEMultiUtil.createMap();
	private Map<Object, Consumer<Notification>> feature2removeEdgeConsumer = HiPEMultiUtil.createMap();
	
	private IncUtil incUtil;
	
	private ActorMaterializer materializer;
	
	public DispatchActor(Map<String, ActorRef> name2actor, IncUtil incUtil) {
		this.name2actor = name2actor;
		this.incUtil = incUtil;
		
		initializeAdd();
		initializeSet();
		initializeAddEdge();
		initializeRemoveEdge();
	
		materializer = ActorMaterializer.create(getContext());
	}
	
	private void initializeAdd() {
		type2addConsumer.put(tools.vitruv.methodologisttemplate.model.model.ModelPackage.eINSTANCE.getComponent(), obj -> {
			tools.vitruv.methodologisttemplate.model.model.Component _component = (tools.vitruv.methodologisttemplate.model.model.Component) obj;
			incUtil.newMessage();
			name2actor.get("Component_object_SP0").tell(new ObjectAdded<tools.vitruv.methodologisttemplate.model.model.Component>(incUtil, _component), getSelf());
			incUtil.newMessage();
			name2actor.get("Component_object_SP1").tell(new ObjectAdded<tools.vitruv.methodologisttemplate.model.model.Component>(incUtil, _component), getSelf());
		});
		type2addConsumer.put(tools.vitruv.methodologisttemplate.model.model.ModelPackage.eINSTANCE.getServer(), obj -> {
			tools.vitruv.methodologisttemplate.model.model.Server _server = (tools.vitruv.methodologisttemplate.model.model.Server) obj;
			incUtil.newMessage();
			name2actor.get("Component_object_SP0").tell(new ObjectAdded<tools.vitruv.methodologisttemplate.model.model.Component>(incUtil, _server), getSelf());
			incUtil.newMessage();
			name2actor.get("Component_object_SP1").tell(new ObjectAdded<tools.vitruv.methodologisttemplate.model.model.Component>(incUtil, _server), getSelf());
		});
		type2addConsumer.put(tools.vitruv.methodologisttemplate.model.model.ModelPackage.eINSTANCE.getProtocol(), obj -> {
			tools.vitruv.methodologisttemplate.model.model.Protocol _protocol = (tools.vitruv.methodologisttemplate.model.model.Protocol) obj;
			incUtil.newMessage();
			name2actor.get("Protocol_object_SP0").tell(new ObjectAdded<tools.vitruv.methodologisttemplate.model.model.Protocol>(incUtil, _protocol), getSelf());
			incUtil.newMessage();
			name2actor.get("Protocol_object_SP1").tell(new ObjectAdded<tools.vitruv.methodologisttemplate.model.model.Protocol>(incUtil, _protocol), getSelf());
		});
		type2addConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getComponentToEntity(), obj -> {
			Something2Else.ComponentToEntity _componenttoentity = (Something2Else.ComponentToEntity) obj;
			incUtil.newMessage();
			name2actor.get("ComponentToEntity_object").tell(new ObjectAdded<Something2Else.ComponentToEntity>(incUtil, _componenttoentity), getSelf());
		});
		type2addConsumer.put(tools.vitruv.methodologisttemplate.model.model.ModelPackage.eINSTANCE.getLink(), obj -> {
			tools.vitruv.methodologisttemplate.model.model.Link _link = (tools.vitruv.methodologisttemplate.model.model.Link) obj;
			incUtil.newMessage();
			name2actor.get("Link_object_SP0").tell(new ObjectAdded<tools.vitruv.methodologisttemplate.model.model.Link>(incUtil, _link), getSelf());
			incUtil.newMessage();
			name2actor.get("Link_object_SP1").tell(new ObjectAdded<tools.vitruv.methodologisttemplate.model.model.Link>(incUtil, _link), getSelf());
		});
		type2addConsumer.put(tools.vitruv.methodologisttemplate.model.model2.Model2Package.eINSTANCE.getRoot(), obj -> {
			tools.vitruv.methodologisttemplate.model.model2.Root _root = (tools.vitruv.methodologisttemplate.model.model2.Root) obj;
			incUtil.newMessage();
			name2actor.get("Root_object_SP0").tell(new ObjectAdded<tools.vitruv.methodologisttemplate.model.model2.Root>(incUtil, _root), getSelf());
			incUtil.newMessage();
			name2actor.get("Root_object_SP1").tell(new ObjectAdded<tools.vitruv.methodologisttemplate.model.model2.Root>(incUtil, _root), getSelf());
		});
		type2addConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getSystemToRoot(), obj -> {
			Something2Else.SystemToRoot _systemtoroot = (Something2Else.SystemToRoot) obj;
			incUtil.newMessage();
			name2actor.get("SystemToRoot_object").tell(new ObjectAdded<Something2Else.SystemToRoot>(incUtil, _systemtoroot), getSelf());
		});
		type2addConsumer.put(tools.vitruv.methodologisttemplate.model.model.ModelPackage.eINSTANCE.getSystem(), obj -> {
			tools.vitruv.methodologisttemplate.model.model.System _system = (tools.vitruv.methodologisttemplate.model.model.System) obj;
			incUtil.newMessage();
			name2actor.get("System_object_SP0").tell(new ObjectAdded<tools.vitruv.methodologisttemplate.model.model.System>(incUtil, _system), getSelf());
			incUtil.newMessage();
			name2actor.get("System_object_SP1").tell(new ObjectAdded<tools.vitruv.methodologisttemplate.model.model.System>(incUtil, _system), getSelf());
			incUtil.newMessage();
			name2actor.get("System_object_SP2").tell(new ObjectAdded<tools.vitruv.methodologisttemplate.model.model.System>(incUtil, _system), getSelf());
		});
		type2addConsumer.put(tools.vitruv.methodologisttemplate.model.model.ModelPackage.eINSTANCE.getDevice(), obj -> {
			tools.vitruv.methodologisttemplate.model.model.Device _device = (tools.vitruv.methodologisttemplate.model.model.Device) obj;
			incUtil.newMessage();
			name2actor.get("Component_object_SP0").tell(new ObjectAdded<tools.vitruv.methodologisttemplate.model.model.Component>(incUtil, _device), getSelf());
			incUtil.newMessage();
			name2actor.get("Component_object_SP1").tell(new ObjectAdded<tools.vitruv.methodologisttemplate.model.model.Component>(incUtil, _device), getSelf());
		});
		type2addConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getProtocolToEntity(), obj -> {
			Something2Else.ProtocolToEntity _protocoltoentity = (Something2Else.ProtocolToEntity) obj;
			incUtil.newMessage();
			name2actor.get("ProtocolToEntity_object").tell(new ObjectAdded<Something2Else.ProtocolToEntity>(incUtil, _protocoltoentity), getSelf());
		});
		type2addConsumer.put(tools.vitruv.methodologisttemplate.model.model2.Model2Package.eINSTANCE.getEntity(), obj -> {
			tools.vitruv.methodologisttemplate.model.model2.Entity _entity = (tools.vitruv.methodologisttemplate.model.model2.Entity) obj;
			incUtil.newMessage();
			name2actor.get("Entity_object_SP0").tell(new ObjectAdded<tools.vitruv.methodologisttemplate.model.model2.Entity>(incUtil, _entity), getSelf());
			incUtil.newMessage();
			name2actor.get("Entity_object_SP1").tell(new ObjectAdded<tools.vitruv.methodologisttemplate.model.model2.Entity>(incUtil, _entity), getSelf());
			incUtil.newMessage();
			name2actor.get("Entity_object_SP2").tell(new ObjectAdded<tools.vitruv.methodologisttemplate.model.model2.Entity>(incUtil, _entity), getSelf());
		});
	}
	
	private void initializeSet() {
		feature2setConsumer.put(tools.vitruv.methodologisttemplate.model.model.ModelPackage.eINSTANCE.getComponent_Name(), notification -> {
			if(notification.getNotifier() instanceof tools.vitruv.methodologisttemplate.model.model.Component) {
				incUtil.newMessage();
				name2actor.get("Component_object_SP0").tell(new AttributeChanged<tools.vitruv.methodologisttemplate.model.model.Component>(incUtil, (tools.vitruv.methodologisttemplate.model.model.Component) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof tools.vitruv.methodologisttemplate.model.model.Component) {
				incUtil.newMessage();
				name2actor.get("Component_object_SP1").tell(new AttributeChanged<tools.vitruv.methodologisttemplate.model.model.Component>(incUtil, (tools.vitruv.methodologisttemplate.model.model.Component) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
		});
		
		feature2setConsumer.put(tools.vitruv.methodologisttemplate.model.model2.Model2Package.eINSTANCE.getEntity_Name(), notification -> {
			if(notification.getNotifier() instanceof tools.vitruv.methodologisttemplate.model.model2.Entity) {
				incUtil.newMessage();
				name2actor.get("Entity_object_SP1").tell(new AttributeChanged<tools.vitruv.methodologisttemplate.model.model2.Entity>(incUtil, (tools.vitruv.methodologisttemplate.model.model2.Entity) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof tools.vitruv.methodologisttemplate.model.model2.Entity) {
				incUtil.newMessage();
				name2actor.get("Entity_object_SP2").tell(new AttributeChanged<tools.vitruv.methodologisttemplate.model.model2.Entity>(incUtil, (tools.vitruv.methodologisttemplate.model.model2.Entity) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof tools.vitruv.methodologisttemplate.model.model2.Entity) {
				incUtil.newMessage();
				name2actor.get("Entity_object_SP0").tell(new AttributeChanged<tools.vitruv.methodologisttemplate.model.model2.Entity>(incUtil, (tools.vitruv.methodologisttemplate.model.model2.Entity) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
		});
		
	}
	
	private void initializeAddEdge() {
		feature2addEdgeConsumer.put(tools.vitruv.methodologisttemplate.model.model.ModelPackage.eINSTANCE.getSystem_Links(), notification -> {
			incUtil.newMessage();
			name2actor.get("System_links_0_reference").tell(new ReferenceAdded<tools.vitruv.methodologisttemplate.model.model.System, tools.vitruv.methodologisttemplate.model.model.Link>(incUtil,(tools.vitruv.methodologisttemplate.model.model.System) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Link) notification.getNewValue(), "tools.vitruv.methodologisttemplate.model.model.System_links_Link"), getSelf());
			incUtil.newMessage();
			name2actor.get("LinkToEntity_link_links_incoming_SRC__FILTER_NAC_SRC_66_localSearch").tell(new ReferenceAdded<tools.vitruv.methodologisttemplate.model.model.System, tools.vitruv.methodologisttemplate.model.model.Link>(incUtil,(tools.vitruv.methodologisttemplate.model.model.System) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Link) notification.getNewValue(), "tools.vitruv.methodologisttemplate.model.model.System_links_Link"), getSelf());
		});
		feature2addEdgeConsumer.put(tools.vitruv.methodologisttemplate.model.model.ModelPackage.eINSTANCE.getLink_Components(), notification -> {
			incUtil.newMessage();
			name2actor.get("Link_components_0_reference").tell(new ReferenceAdded<tools.vitruv.methodologisttemplate.model.model.Link, tools.vitruv.methodologisttemplate.model.model.Component>(incUtil,(tools.vitruv.methodologisttemplate.model.model.Link) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Component) notification.getNewValue(), "tools.vitruv.methodologisttemplate.model.model.Link_components_Component"), getSelf());
			incUtil.newMessage();
			name2actor.get("LinkToEntityEmbedded_link_components_outgoing_SRC__FILTER_NAC_SRC_12_localSearch").tell(new ReferenceAdded<tools.vitruv.methodologisttemplate.model.model.Link, tools.vitruv.methodologisttemplate.model.model.Component>(incUtil,(tools.vitruv.methodologisttemplate.model.model.Link) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Component) notification.getNewValue(), "tools.vitruv.methodologisttemplate.model.model.Link_components_Component"), getSelf());
			incUtil.newMessage();
			name2actor.get("LinkToEntityEmbedded_link_components_outgoing_SRC__FILTER_NAC_SRC_12_localSearch").tell(new ReferenceAdded<tools.vitruv.methodologisttemplate.model.model.Link, tools.vitruv.methodologisttemplate.model.model.Component>(incUtil,(tools.vitruv.methodologisttemplate.model.model.Link) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Component) notification.getNewValue(), "tools.vitruv.methodologisttemplate.model.model.Link_components_Component"), getSelf());
			incUtil.newMessage();
			name2actor.get("LinkToEntity_link_components_outgoing_SRC__FILTER_NAC_SRC_59_localSearch").tell(new ReferenceAdded<tools.vitruv.methodologisttemplate.model.model.Link, tools.vitruv.methodologisttemplate.model.model.Component>(incUtil,(tools.vitruv.methodologisttemplate.model.model.Link) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Component) notification.getNewValue(), "tools.vitruv.methodologisttemplate.model.model.Link_components_Component"), getSelf());
		});
		feature2addEdgeConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getComponentToEntity_Source(), notification -> {
			incUtil.newMessage();
			name2actor.get("ComponentToEntity_source_0_reference").tell(new ReferenceAdded<Something2Else.ComponentToEntity, tools.vitruv.methodologisttemplate.model.model.Component>(incUtil,(Something2Else.ComponentToEntity) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Component) notification.getNewValue(), "Something2Else.ComponentToEntity_source_Component"), getSelf());
		});
		feature2addEdgeConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getSystemToRoot_Source(), notification -> {
			incUtil.newMessage();
			name2actor.get("SystemToRoot_source_0_reference").tell(new ReferenceAdded<Something2Else.SystemToRoot, tools.vitruv.methodologisttemplate.model.model.System>(incUtil,(Something2Else.SystemToRoot) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.System) notification.getNewValue(), "Something2Else.SystemToRoot_source_System"), getSelf());
			incUtil.newMessage();
			name2actor.get("ProtocolToEntity__CC_81_localSearch").tell(new ReferenceAdded<Something2Else.SystemToRoot, tools.vitruv.methodologisttemplate.model.model.System>(incUtil,(Something2Else.SystemToRoot) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.System) notification.getNewValue(), "Something2Else.SystemToRoot_source_System"), getSelf());
			incUtil.newMessage();
			name2actor.get("SystemRefdComponentToEntity__CC_87_localSearch").tell(new ReferenceAdded<Something2Else.SystemToRoot, tools.vitruv.methodologisttemplate.model.model.System>(incUtil,(Something2Else.SystemToRoot) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.System) notification.getNewValue(), "Something2Else.SystemToRoot_source_System"), getSelf());
		});
		feature2addEdgeConsumer.put(tools.vitruv.methodologisttemplate.model.model.ModelPackage.eINSTANCE.getSystem_Components(), notification -> {
			incUtil.newMessage();
			name2actor.get("System_components_0_reference").tell(new ReferenceAdded<tools.vitruv.methodologisttemplate.model.model.System, tools.vitruv.methodologisttemplate.model.model.Component>(incUtil,(tools.vitruv.methodologisttemplate.model.model.System) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Component) notification.getNewValue(), "tools.vitruv.methodologisttemplate.model.model.System_components_Component"), getSelf());
			incUtil.newMessage();
			name2actor.get("ComponentToEntity_comp_components_incoming_SRC__FILTER_NAC_SRC_1_localSearch").tell(new ReferenceAdded<tools.vitruv.methodologisttemplate.model.model.System, tools.vitruv.methodologisttemplate.model.model.Component>(incUtil,(tools.vitruv.methodologisttemplate.model.model.System) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Component) notification.getNewValue(), "tools.vitruv.methodologisttemplate.model.model.System_components_Component"), getSelf());
			incUtil.newMessage();
			name2actor.get("SystemRefdComponentToEntity__CC_87_localSearch").tell(new ReferenceAdded<tools.vitruv.methodologisttemplate.model.model.System, tools.vitruv.methodologisttemplate.model.model.Component>(incUtil,(tools.vitruv.methodologisttemplate.model.model.System) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Component) notification.getNewValue(), "tools.vitruv.methodologisttemplate.model.model.System_components_Component"), getSelf());
		});
		feature2addEdgeConsumer.put(tools.vitruv.methodologisttemplate.model.model2.Model2Package.eINSTANCE.getRoot_Entities(), notification -> {
			incUtil.newMessage();
			name2actor.get("ComponentToEntity_entity_entities_incoming_TRG__FILTER_NAC_TRG_4_localSearch").tell(new ReferenceAdded<tools.vitruv.methodologisttemplate.model.model2.Root, tools.vitruv.methodologisttemplate.model.model2.Entity>(incUtil,(tools.vitruv.methodologisttemplate.model.model2.Root) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model2.Entity) notification.getNewValue(), "tools.vitruv.methodologisttemplate.model.model2.Root_entities_Entity"), getSelf());
			incUtil.newMessage();
			name2actor.get("LinkToEntityEmbedded_linkEntity_entities_incoming_TRG__FILTER_NAC_TRG_20_localSearch").tell(new ReferenceAdded<tools.vitruv.methodologisttemplate.model.model2.Root, tools.vitruv.methodologisttemplate.model.model2.Entity>(incUtil,(tools.vitruv.methodologisttemplate.model.model2.Root) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model2.Entity) notification.getNewValue(), "tools.vitruv.methodologisttemplate.model.model2.Root_entities_Entity"), getSelf());
			incUtil.newMessage();
			name2actor.get("LinkToEntity_entity_entities_incoming_TRG__FILTER_NAC_TRG_69_localSearch").tell(new ReferenceAdded<tools.vitruv.methodologisttemplate.model.model2.Root, tools.vitruv.methodologisttemplate.model.model2.Entity>(incUtil,(tools.vitruv.methodologisttemplate.model.model2.Root) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model2.Entity) notification.getNewValue(), "tools.vitruv.methodologisttemplate.model.model2.Root_entities_Entity"), getSelf());
			incUtil.newMessage();
			name2actor.get("ProtocolToEntity__CC_81_localSearch").tell(new ReferenceAdded<tools.vitruv.methodologisttemplate.model.model2.Root, tools.vitruv.methodologisttemplate.model.model2.Entity>(incUtil,(tools.vitruv.methodologisttemplate.model.model2.Root) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model2.Entity) notification.getNewValue(), "tools.vitruv.methodologisttemplate.model.model2.Root_entities_Entity"), getSelf());
			incUtil.newMessage();
			name2actor.get("SystemRefdComponentToEntity__CC_87_localSearch").tell(new ReferenceAdded<tools.vitruv.methodologisttemplate.model.model2.Root, tools.vitruv.methodologisttemplate.model.model2.Entity>(incUtil,(tools.vitruv.methodologisttemplate.model.model2.Root) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model2.Entity) notification.getNewValue(), "tools.vitruv.methodologisttemplate.model.model2.Root_entities_Entity"), getSelf());
		});
		feature2addEdgeConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getComponentToEntity_Target(), notification -> {
			incUtil.newMessage();
			name2actor.get("ComponentToEntity_target_0_reference").tell(new ReferenceAdded<Something2Else.ComponentToEntity, tools.vitruv.methodologisttemplate.model.model2.Entity>(incUtil,(Something2Else.ComponentToEntity) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model2.Entity) notification.getNewValue(), "Something2Else.ComponentToEntity_target_Entity"), getSelf());
		});
		feature2addEdgeConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getSystemToRoot_Target(), notification -> {
			incUtil.newMessage();
			name2actor.get("SystemToRoot_target_0_reference").tell(new ReferenceAdded<Something2Else.SystemToRoot, tools.vitruv.methodologisttemplate.model.model2.Root>(incUtil,(Something2Else.SystemToRoot) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model2.Root) notification.getNewValue(), "Something2Else.SystemToRoot_target_Root"), getSelf());
			incUtil.newMessage();
			name2actor.get("ProtocolToEntity__CC_81_localSearch").tell(new ReferenceAdded<Something2Else.SystemToRoot, tools.vitruv.methodologisttemplate.model.model2.Root>(incUtil,(Something2Else.SystemToRoot) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model2.Root) notification.getNewValue(), "Something2Else.SystemToRoot_target_Root"), getSelf());
			incUtil.newMessage();
			name2actor.get("SystemRefdComponentToEntity__CC_87_localSearch").tell(new ReferenceAdded<Something2Else.SystemToRoot, tools.vitruv.methodologisttemplate.model.model2.Root>(incUtil,(Something2Else.SystemToRoot) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model2.Root) notification.getNewValue(), "Something2Else.SystemToRoot_target_Root"), getSelf());
		});
		feature2addEdgeConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getProtocolToEntity_Target(), notification -> {
			incUtil.newMessage();
			name2actor.get("ProtocolToEntity_target_0_reference").tell(new ReferenceAdded<Something2Else.ProtocolToEntity, tools.vitruv.methodologisttemplate.model.model2.Entity>(incUtil,(Something2Else.ProtocolToEntity) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model2.Entity) notification.getNewValue(), "Something2Else.ProtocolToEntity_target_Entity"), getSelf());
		});
		feature2addEdgeConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getProtocolToEntity_Source(), notification -> {
			incUtil.newMessage();
			name2actor.get("ProtocolToEntity_source_0_reference").tell(new ReferenceAdded<Something2Else.ProtocolToEntity, tools.vitruv.methodologisttemplate.model.model.Protocol>(incUtil,(Something2Else.ProtocolToEntity) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Protocol) notification.getNewValue(), "Something2Else.ProtocolToEntity_source_Protocol"), getSelf());
		});
		feature2addEdgeConsumer.put(tools.vitruv.methodologisttemplate.model.model.ModelPackage.eINSTANCE.getLink_Protocol(), notification -> {
			incUtil.newMessage();
			name2actor.get("Link_protocol_0_reference").tell(new ReferenceAdded<tools.vitruv.methodologisttemplate.model.model.Link, tools.vitruv.methodologisttemplate.model.model.Protocol>(incUtil,(tools.vitruv.methodologisttemplate.model.model.Link) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Protocol) notification.getNewValue(), "tools.vitruv.methodologisttemplate.model.model.Link_protocol_Protocol"), getSelf());
			incUtil.newMessage();
			name2actor.get("LinkToEntityEmbedded_link_protocol_outgoing_SRC__FILTER_NAC_SRC_16_localSearch").tell(new ReferenceAdded<tools.vitruv.methodologisttemplate.model.model.Link, tools.vitruv.methodologisttemplate.model.model.Protocol>(incUtil,(tools.vitruv.methodologisttemplate.model.model.Link) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Protocol) notification.getNewValue(), "tools.vitruv.methodologisttemplate.model.model.Link_protocol_Protocol"), getSelf());
			incUtil.newMessage();
			name2actor.get("LinkToEntityEmbedded_link_protocol_outgoing_SRC__FILTER_NAC_SRC_16_localSearch").tell(new ReferenceAdded<tools.vitruv.methodologisttemplate.model.model.Link, tools.vitruv.methodologisttemplate.model.model.Protocol>(incUtil,(tools.vitruv.methodologisttemplate.model.model.Link) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Protocol) notification.getNewValue(), "tools.vitruv.methodologisttemplate.model.model.Link_protocol_Protocol"), getSelf());
			incUtil.newMessage();
			name2actor.get("LinkToEntity_link_protocol_outgoing_SRC__FILTER_NAC_SRC_62_localSearch").tell(new ReferenceAdded<tools.vitruv.methodologisttemplate.model.model.Link, tools.vitruv.methodologisttemplate.model.model.Protocol>(incUtil,(tools.vitruv.methodologisttemplate.model.model.Link) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Protocol) notification.getNewValue(), "tools.vitruv.methodologisttemplate.model.model.Link_protocol_Protocol"), getSelf());
			incUtil.newMessage();
			name2actor.get("LinkToEntity_link_protocol_outgoing_SRC__FILTER_NAC_SRC_62_localSearch").tell(new ReferenceAdded<tools.vitruv.methodologisttemplate.model.model.Link, tools.vitruv.methodologisttemplate.model.model.Protocol>(incUtil,(tools.vitruv.methodologisttemplate.model.model.Link) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Protocol) notification.getNewValue(), "tools.vitruv.methodologisttemplate.model.model.Link_protocol_Protocol"), getSelf());
		});
		feature2addEdgeConsumer.put(tools.vitruv.methodologisttemplate.model.model.ModelPackage.eINSTANCE.getSystem_Protocols(), notification -> {
			incUtil.newMessage();
			name2actor.get("System_protocols_0_reference").tell(new ReferenceAdded<tools.vitruv.methodologisttemplate.model.model.System, tools.vitruv.methodologisttemplate.model.model.Protocol>(incUtil,(tools.vitruv.methodologisttemplate.model.model.System) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Protocol) notification.getNewValue(), "tools.vitruv.methodologisttemplate.model.model.System_protocols_Protocol"), getSelf());
			incUtil.newMessage();
			name2actor.get("ProtocolToEntity__CC_81_localSearch").tell(new ReferenceAdded<tools.vitruv.methodologisttemplate.model.model.System, tools.vitruv.methodologisttemplate.model.model.Protocol>(incUtil,(tools.vitruv.methodologisttemplate.model.model.System) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Protocol) notification.getNewValue(), "tools.vitruv.methodologisttemplate.model.model.System_protocols_Protocol"), getSelf());
		});
	}
	
	private void initializeRemoveEdge() {
		feature2removeEdgeConsumer.put(tools.vitruv.methodologisttemplate.model.model.ModelPackage.eINSTANCE.getSystem_Links(), notification -> {
			incUtil.newMessage();
			name2actor.get("System_links_0_reference").tell(new ReferenceDeleted<tools.vitruv.methodologisttemplate.model.model.System, tools.vitruv.methodologisttemplate.model.model.Link>(incUtil, (tools.vitruv.methodologisttemplate.model.model.System) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Link) notification.getOldValue(), "tools.vitruv.methodologisttemplate.model.model.System_links_Link"), getSelf());
			incUtil.newMessage();
			name2actor.get("LinkToEntity_link_links_incoming_SRC__FILTER_NAC_SRC_66_localSearch").tell(new ReferenceDeleted<tools.vitruv.methodologisttemplate.model.model.System, tools.vitruv.methodologisttemplate.model.model.Link>(incUtil, (tools.vitruv.methodologisttemplate.model.model.System) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Link) notification.getOldValue(), "tools.vitruv.methodologisttemplate.model.model.System_links_Link"), getSelf());
		});
		feature2removeEdgeConsumer.put(tools.vitruv.methodologisttemplate.model.model.ModelPackage.eINSTANCE.getLink_Components(), notification -> {
			incUtil.newMessage();
			name2actor.get("Link_components_0_reference").tell(new ReferenceDeleted<tools.vitruv.methodologisttemplate.model.model.Link, tools.vitruv.methodologisttemplate.model.model.Component>(incUtil, (tools.vitruv.methodologisttemplate.model.model.Link) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Component) notification.getOldValue(), "tools.vitruv.methodologisttemplate.model.model.Link_components_Component"), getSelf());
			incUtil.newMessage();
			name2actor.get("LinkToEntityEmbedded_link_components_outgoing_SRC__FILTER_NAC_SRC_12_localSearch").tell(new ReferenceDeleted<tools.vitruv.methodologisttemplate.model.model.Link, tools.vitruv.methodologisttemplate.model.model.Component>(incUtil, (tools.vitruv.methodologisttemplate.model.model.Link) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Component) notification.getOldValue(), "tools.vitruv.methodologisttemplate.model.model.Link_components_Component"), getSelf());
			incUtil.newMessage();
			name2actor.get("LinkToEntityEmbedded_link_components_outgoing_SRC__FILTER_NAC_SRC_12_localSearch").tell(new ReferenceDeleted<tools.vitruv.methodologisttemplate.model.model.Link, tools.vitruv.methodologisttemplate.model.model.Component>(incUtil, (tools.vitruv.methodologisttemplate.model.model.Link) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Component) notification.getOldValue(), "tools.vitruv.methodologisttemplate.model.model.Link_components_Component"), getSelf());
			incUtil.newMessage();
			name2actor.get("LinkToEntity_link_components_outgoing_SRC__FILTER_NAC_SRC_59_localSearch").tell(new ReferenceDeleted<tools.vitruv.methodologisttemplate.model.model.Link, tools.vitruv.methodologisttemplate.model.model.Component>(incUtil, (tools.vitruv.methodologisttemplate.model.model.Link) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Component) notification.getOldValue(), "tools.vitruv.methodologisttemplate.model.model.Link_components_Component"), getSelf());
		});
		feature2removeEdgeConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getComponentToEntity_Source(), notification -> {
			incUtil.newMessage();
			name2actor.get("ComponentToEntity_source_0_reference").tell(new ReferenceDeleted<Something2Else.ComponentToEntity, tools.vitruv.methodologisttemplate.model.model.Component>(incUtil, (Something2Else.ComponentToEntity) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Component) notification.getOldValue(), "Something2Else.ComponentToEntity_source_Component"), getSelf());
		});
		feature2removeEdgeConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getSystemToRoot_Source(), notification -> {
			incUtil.newMessage();
			name2actor.get("SystemToRoot_source_0_reference").tell(new ReferenceDeleted<Something2Else.SystemToRoot, tools.vitruv.methodologisttemplate.model.model.System>(incUtil, (Something2Else.SystemToRoot) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.System) notification.getOldValue(), "Something2Else.SystemToRoot_source_System"), getSelf());
			incUtil.newMessage();
			name2actor.get("ProtocolToEntity__CC_81_localSearch").tell(new ReferenceDeleted<Something2Else.SystemToRoot, tools.vitruv.methodologisttemplate.model.model.System>(incUtil, (Something2Else.SystemToRoot) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.System) notification.getOldValue(), "Something2Else.SystemToRoot_source_System"), getSelf());
			incUtil.newMessage();
			name2actor.get("SystemRefdComponentToEntity__CC_87_localSearch").tell(new ReferenceDeleted<Something2Else.SystemToRoot, tools.vitruv.methodologisttemplate.model.model.System>(incUtil, (Something2Else.SystemToRoot) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.System) notification.getOldValue(), "Something2Else.SystemToRoot_source_System"), getSelf());
		});
		feature2removeEdgeConsumer.put(tools.vitruv.methodologisttemplate.model.model.ModelPackage.eINSTANCE.getSystem_Components(), notification -> {
			incUtil.newMessage();
			name2actor.get("System_components_0_reference").tell(new ReferenceDeleted<tools.vitruv.methodologisttemplate.model.model.System, tools.vitruv.methodologisttemplate.model.model.Component>(incUtil, (tools.vitruv.methodologisttemplate.model.model.System) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Component) notification.getOldValue(), "tools.vitruv.methodologisttemplate.model.model.System_components_Component"), getSelf());
			incUtil.newMessage();
			name2actor.get("ComponentToEntity_comp_components_incoming_SRC__FILTER_NAC_SRC_1_localSearch").tell(new ReferenceDeleted<tools.vitruv.methodologisttemplate.model.model.System, tools.vitruv.methodologisttemplate.model.model.Component>(incUtil, (tools.vitruv.methodologisttemplate.model.model.System) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Component) notification.getOldValue(), "tools.vitruv.methodologisttemplate.model.model.System_components_Component"), getSelf());
			incUtil.newMessage();
			name2actor.get("SystemRefdComponentToEntity__CC_87_localSearch").tell(new ReferenceDeleted<tools.vitruv.methodologisttemplate.model.model.System, tools.vitruv.methodologisttemplate.model.model.Component>(incUtil, (tools.vitruv.methodologisttemplate.model.model.System) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Component) notification.getOldValue(), "tools.vitruv.methodologisttemplate.model.model.System_components_Component"), getSelf());
		});
		feature2removeEdgeConsumer.put(tools.vitruv.methodologisttemplate.model.model2.Model2Package.eINSTANCE.getRoot_Entities(), notification -> {
			incUtil.newMessage();
			name2actor.get("ComponentToEntity_entity_entities_incoming_TRG__FILTER_NAC_TRG_4_localSearch").tell(new ReferenceDeleted<tools.vitruv.methodologisttemplate.model.model2.Root, tools.vitruv.methodologisttemplate.model.model2.Entity>(incUtil, (tools.vitruv.methodologisttemplate.model.model2.Root) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model2.Entity) notification.getOldValue(), "tools.vitruv.methodologisttemplate.model.model2.Root_entities_Entity"), getSelf());
			incUtil.newMessage();
			name2actor.get("LinkToEntityEmbedded_linkEntity_entities_incoming_TRG__FILTER_NAC_TRG_20_localSearch").tell(new ReferenceDeleted<tools.vitruv.methodologisttemplate.model.model2.Root, tools.vitruv.methodologisttemplate.model.model2.Entity>(incUtil, (tools.vitruv.methodologisttemplate.model.model2.Root) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model2.Entity) notification.getOldValue(), "tools.vitruv.methodologisttemplate.model.model2.Root_entities_Entity"), getSelf());
			incUtil.newMessage();
			name2actor.get("LinkToEntity_entity_entities_incoming_TRG__FILTER_NAC_TRG_69_localSearch").tell(new ReferenceDeleted<tools.vitruv.methodologisttemplate.model.model2.Root, tools.vitruv.methodologisttemplate.model.model2.Entity>(incUtil, (tools.vitruv.methodologisttemplate.model.model2.Root) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model2.Entity) notification.getOldValue(), "tools.vitruv.methodologisttemplate.model.model2.Root_entities_Entity"), getSelf());
			incUtil.newMessage();
			name2actor.get("ProtocolToEntity__CC_81_localSearch").tell(new ReferenceDeleted<tools.vitruv.methodologisttemplate.model.model2.Root, tools.vitruv.methodologisttemplate.model.model2.Entity>(incUtil, (tools.vitruv.methodologisttemplate.model.model2.Root) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model2.Entity) notification.getOldValue(), "tools.vitruv.methodologisttemplate.model.model2.Root_entities_Entity"), getSelf());
			incUtil.newMessage();
			name2actor.get("SystemRefdComponentToEntity__CC_87_localSearch").tell(new ReferenceDeleted<tools.vitruv.methodologisttemplate.model.model2.Root, tools.vitruv.methodologisttemplate.model.model2.Entity>(incUtil, (tools.vitruv.methodologisttemplate.model.model2.Root) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model2.Entity) notification.getOldValue(), "tools.vitruv.methodologisttemplate.model.model2.Root_entities_Entity"), getSelf());
		});
		feature2removeEdgeConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getComponentToEntity_Target(), notification -> {
			incUtil.newMessage();
			name2actor.get("ComponentToEntity_target_0_reference").tell(new ReferenceDeleted<Something2Else.ComponentToEntity, tools.vitruv.methodologisttemplate.model.model2.Entity>(incUtil, (Something2Else.ComponentToEntity) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model2.Entity) notification.getOldValue(), "Something2Else.ComponentToEntity_target_Entity"), getSelf());
		});
		feature2removeEdgeConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getSystemToRoot_Target(), notification -> {
			incUtil.newMessage();
			name2actor.get("SystemToRoot_target_0_reference").tell(new ReferenceDeleted<Something2Else.SystemToRoot, tools.vitruv.methodologisttemplate.model.model2.Root>(incUtil, (Something2Else.SystemToRoot) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model2.Root) notification.getOldValue(), "Something2Else.SystemToRoot_target_Root"), getSelf());
			incUtil.newMessage();
			name2actor.get("ProtocolToEntity__CC_81_localSearch").tell(new ReferenceDeleted<Something2Else.SystemToRoot, tools.vitruv.methodologisttemplate.model.model2.Root>(incUtil, (Something2Else.SystemToRoot) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model2.Root) notification.getOldValue(), "Something2Else.SystemToRoot_target_Root"), getSelf());
			incUtil.newMessage();
			name2actor.get("SystemRefdComponentToEntity__CC_87_localSearch").tell(new ReferenceDeleted<Something2Else.SystemToRoot, tools.vitruv.methodologisttemplate.model.model2.Root>(incUtil, (Something2Else.SystemToRoot) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model2.Root) notification.getOldValue(), "Something2Else.SystemToRoot_target_Root"), getSelf());
		});
		feature2removeEdgeConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getProtocolToEntity_Target(), notification -> {
			incUtil.newMessage();
			name2actor.get("ProtocolToEntity_target_0_reference").tell(new ReferenceDeleted<Something2Else.ProtocolToEntity, tools.vitruv.methodologisttemplate.model.model2.Entity>(incUtil, (Something2Else.ProtocolToEntity) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model2.Entity) notification.getOldValue(), "Something2Else.ProtocolToEntity_target_Entity"), getSelf());
		});
		feature2removeEdgeConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getProtocolToEntity_Source(), notification -> {
			incUtil.newMessage();
			name2actor.get("ProtocolToEntity_source_0_reference").tell(new ReferenceDeleted<Something2Else.ProtocolToEntity, tools.vitruv.methodologisttemplate.model.model.Protocol>(incUtil, (Something2Else.ProtocolToEntity) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Protocol) notification.getOldValue(), "Something2Else.ProtocolToEntity_source_Protocol"), getSelf());
		});
		feature2removeEdgeConsumer.put(tools.vitruv.methodologisttemplate.model.model.ModelPackage.eINSTANCE.getLink_Protocol(), notification -> {
			incUtil.newMessage();
			name2actor.get("Link_protocol_0_reference").tell(new ReferenceDeleted<tools.vitruv.methodologisttemplate.model.model.Link, tools.vitruv.methodologisttemplate.model.model.Protocol>(incUtil, (tools.vitruv.methodologisttemplate.model.model.Link) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Protocol) notification.getOldValue(), "tools.vitruv.methodologisttemplate.model.model.Link_protocol_Protocol"), getSelf());
			incUtil.newMessage();
			name2actor.get("LinkToEntityEmbedded_link_protocol_outgoing_SRC__FILTER_NAC_SRC_16_localSearch").tell(new ReferenceDeleted<tools.vitruv.methodologisttemplate.model.model.Link, tools.vitruv.methodologisttemplate.model.model.Protocol>(incUtil, (tools.vitruv.methodologisttemplate.model.model.Link) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Protocol) notification.getOldValue(), "tools.vitruv.methodologisttemplate.model.model.Link_protocol_Protocol"), getSelf());
			incUtil.newMessage();
			name2actor.get("LinkToEntityEmbedded_link_protocol_outgoing_SRC__FILTER_NAC_SRC_16_localSearch").tell(new ReferenceDeleted<tools.vitruv.methodologisttemplate.model.model.Link, tools.vitruv.methodologisttemplate.model.model.Protocol>(incUtil, (tools.vitruv.methodologisttemplate.model.model.Link) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Protocol) notification.getOldValue(), "tools.vitruv.methodologisttemplate.model.model.Link_protocol_Protocol"), getSelf());
			incUtil.newMessage();
			name2actor.get("LinkToEntity_link_protocol_outgoing_SRC__FILTER_NAC_SRC_62_localSearch").tell(new ReferenceDeleted<tools.vitruv.methodologisttemplate.model.model.Link, tools.vitruv.methodologisttemplate.model.model.Protocol>(incUtil, (tools.vitruv.methodologisttemplate.model.model.Link) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Protocol) notification.getOldValue(), "tools.vitruv.methodologisttemplate.model.model.Link_protocol_Protocol"), getSelf());
			incUtil.newMessage();
			name2actor.get("LinkToEntity_link_protocol_outgoing_SRC__FILTER_NAC_SRC_62_localSearch").tell(new ReferenceDeleted<tools.vitruv.methodologisttemplate.model.model.Link, tools.vitruv.methodologisttemplate.model.model.Protocol>(incUtil, (tools.vitruv.methodologisttemplate.model.model.Link) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Protocol) notification.getOldValue(), "tools.vitruv.methodologisttemplate.model.model.Link_protocol_Protocol"), getSelf());
		});
		feature2removeEdgeConsumer.put(tools.vitruv.methodologisttemplate.model.model.ModelPackage.eINSTANCE.getSystem_Protocols(), notification -> {
			incUtil.newMessage();
			name2actor.get("System_protocols_0_reference").tell(new ReferenceDeleted<tools.vitruv.methodologisttemplate.model.model.System, tools.vitruv.methodologisttemplate.model.model.Protocol>(incUtil, (tools.vitruv.methodologisttemplate.model.model.System) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Protocol) notification.getOldValue(), "tools.vitruv.methodologisttemplate.model.model.System_protocols_Protocol"), getSelf());
			incUtil.newMessage();
			name2actor.get("ProtocolToEntity__CC_81_localSearch").tell(new ReferenceDeleted<tools.vitruv.methodologisttemplate.model.model.System, tools.vitruv.methodologisttemplate.model.model.Protocol>(incUtil, (tools.vitruv.methodologisttemplate.model.model.System) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Protocol) notification.getOldValue(), "tools.vitruv.methodologisttemplate.model.model.System_protocols_Protocol"), getSelf());
		});
	}

	@Override
	public void preStart() throws Exception {
		super.preStart();
	}

	@Override
	public void postStop() throws Exception {
		if(HiPEConfig.logWorkloadActivated) {
			DecimalFormat df = new DecimalFormat("0.#####");
	        df.setMaximumFractionDigits(5);
			System.err.println("DispatchNode" + ";"  + counter + ";" + df.format((double) time / (double) (1000 * 1000 * 1000)));
		}
	}

	@Override
	public Receive createReceive() {
		return receiveBuilder() //
				.match(NotificationContainer.class, this::handleNotificationContainer)
				.match(NoMoreInput.class, this::sendFinished) //
				.build();
	}

	private void sendFinished(NoMoreInput m) {
		incUtil.allMessagesInserted();
	}
	
	private void handleNotificationContainer(NotificationContainer nc) {
		counter++;
		long tic = System.nanoTime();
		nc.notifications.parallelStream().forEach(this::handleNotification);
		time += System.nanoTime() - tic;
	}
	
	private void handleNotification(Notification notification) {
		switch (notification.getEventType()) {
		case Notification.ADD:
			handleAdd(notification);
			break;
		case Notification.REMOVE:
			handleRemove(notification);
			break;
		case Notification.REMOVING_ADAPTER:
			handleRemoveAdapter(notification);
			break;	
		case Notification.SET:
			handleSet(notification);
			break;
		}
	}

	private void handleAdd(Notification notification) {
		if(notification.getFeature() == null) 
			handleAddedNode(notification.getNewValue());
		else
			handleAddedEdge(notification);
	}

	private void handleAddedNode(Object node) {
		if(node == null) 
			return;
			
		EObject obj = (EObject) node;
		if(type2addConsumer.containsKey(obj.eClass())) {
			type2addConsumer.get(obj.eClass()).accept(node);
		}
	}
	
	private void handleSet(Notification notification) {
		Object feature = notification.getFeature();
		if(feature2setConsumer.containsKey(feature)) {
			feature2setConsumer.get(feature).accept(notification);
		}
	}

	private void handleAddedEdge(Notification notification) {
		//check for self-edges
		if(notification.getNotifier().equals(notification.getNewValue()))
			handleAddedNode(notification.getNewValue());
					
		Object feature = notification.getFeature();
		if(feature2addEdgeConsumer.containsKey(feature)) {
			feature2addEdgeConsumer.get(feature).accept(notification);
		}
	}

	private void handleRemove(Notification notification) {
		Object feature = notification.getFeature();
		if(feature2removeEdgeConsumer.containsKey(feature)) {
			feature2removeEdgeConsumer.get(feature).accept(notification);
		}
	}
	
	private void handleRemoveAdapter(Notification notification) {
		Object node = notification.getNotifier();
		if (node instanceof tools.vitruv.methodologisttemplate.model.model2.Entity) {
			incUtil.newMessage();
			name2actor.get("Entity_object_SP0").tell(new ObjectDeleted<tools.vitruv.methodologisttemplate.model.model2.Entity>(incUtil, (tools.vitruv.methodologisttemplate.model.model2.Entity) node), getSelf());
		}
		if (node instanceof tools.vitruv.methodologisttemplate.model.model2.Entity) {
			incUtil.newMessage();
			name2actor.get("Entity_object_SP1").tell(new ObjectDeleted<tools.vitruv.methodologisttemplate.model.model2.Entity>(incUtil, (tools.vitruv.methodologisttemplate.model.model2.Entity) node), getSelf());
		}
		if (node instanceof tools.vitruv.methodologisttemplate.model.model2.Entity) {
			incUtil.newMessage();
			name2actor.get("Entity_object_SP2").tell(new ObjectDeleted<tools.vitruv.methodologisttemplate.model.model2.Entity>(incUtil, (tools.vitruv.methodologisttemplate.model.model2.Entity) node), getSelf());
		}
		if (node instanceof tools.vitruv.methodologisttemplate.model.model2.Root) {
			incUtil.newMessage();
			name2actor.get("Root_object_SP0").tell(new ObjectDeleted<tools.vitruv.methodologisttemplate.model.model2.Root>(incUtil, (tools.vitruv.methodologisttemplate.model.model2.Root) node), getSelf());
		}
		if (node instanceof tools.vitruv.methodologisttemplate.model.model2.Root) {
			incUtil.newMessage();
			name2actor.get("Root_object_SP1").tell(new ObjectDeleted<tools.vitruv.methodologisttemplate.model.model2.Root>(incUtil, (tools.vitruv.methodologisttemplate.model.model2.Root) node), getSelf());
		}
		if (node instanceof Something2Else.SystemToRoot) {
			incUtil.newMessage();
			name2actor.get("SystemToRoot_object").tell(new ObjectDeleted<Something2Else.SystemToRoot>(incUtil, (Something2Else.SystemToRoot) node), getSelf());
		}
		if (node instanceof Something2Else.ProtocolToEntity) {
			incUtil.newMessage();
			name2actor.get("ProtocolToEntity_object").tell(new ObjectDeleted<Something2Else.ProtocolToEntity>(incUtil, (Something2Else.ProtocolToEntity) node), getSelf());
		}
		if (node instanceof Something2Else.ComponentToEntity) {
			incUtil.newMessage();
			name2actor.get("ComponentToEntity_object").tell(new ObjectDeleted<Something2Else.ComponentToEntity>(incUtil, (Something2Else.ComponentToEntity) node), getSelf());
		}
		if (node instanceof tools.vitruv.methodologisttemplate.model.model.Component) {
			incUtil.newMessage();
			name2actor.get("Component_object_SP0").tell(new ObjectDeleted<tools.vitruv.methodologisttemplate.model.model.Component>(incUtil, (tools.vitruv.methodologisttemplate.model.model.Component) node), getSelf());
		}
		if (node instanceof tools.vitruv.methodologisttemplate.model.model.Component) {
			incUtil.newMessage();
			name2actor.get("Component_object_SP1").tell(new ObjectDeleted<tools.vitruv.methodologisttemplate.model.model.Component>(incUtil, (tools.vitruv.methodologisttemplate.model.model.Component) node), getSelf());
		}
		if (node instanceof tools.vitruv.methodologisttemplate.model.model.System) {
			incUtil.newMessage();
			name2actor.get("System_object_SP0").tell(new ObjectDeleted<tools.vitruv.methodologisttemplate.model.model.System>(incUtil, (tools.vitruv.methodologisttemplate.model.model.System) node), getSelf());
		}
		if (node instanceof tools.vitruv.methodologisttemplate.model.model.System) {
			incUtil.newMessage();
			name2actor.get("System_object_SP1").tell(new ObjectDeleted<tools.vitruv.methodologisttemplate.model.model.System>(incUtil, (tools.vitruv.methodologisttemplate.model.model.System) node), getSelf());
		}
		if (node instanceof tools.vitruv.methodologisttemplate.model.model.System) {
			incUtil.newMessage();
			name2actor.get("System_object_SP2").tell(new ObjectDeleted<tools.vitruv.methodologisttemplate.model.model.System>(incUtil, (tools.vitruv.methodologisttemplate.model.model.System) node), getSelf());
		}
		if (node instanceof tools.vitruv.methodologisttemplate.model.model.Link) {
			incUtil.newMessage();
			name2actor.get("Link_object_SP0").tell(new ObjectDeleted<tools.vitruv.methodologisttemplate.model.model.Link>(incUtil, (tools.vitruv.methodologisttemplate.model.model.Link) node), getSelf());
		}
		if (node instanceof tools.vitruv.methodologisttemplate.model.model.Link) {
			incUtil.newMessage();
			name2actor.get("Link_object_SP1").tell(new ObjectDeleted<tools.vitruv.methodologisttemplate.model.model.Link>(incUtil, (tools.vitruv.methodologisttemplate.model.model.Link) node), getSelf());
		}
		if (node instanceof tools.vitruv.methodologisttemplate.model.model.Protocol) {
			incUtil.newMessage();
			name2actor.get("Protocol_object_SP0").tell(new ObjectDeleted<tools.vitruv.methodologisttemplate.model.model.Protocol>(incUtil, (tools.vitruv.methodologisttemplate.model.model.Protocol) node), getSelf());
		}
		if (node instanceof tools.vitruv.methodologisttemplate.model.model.Protocol) {
			incUtil.newMessage();
			name2actor.get("Protocol_object_SP1").tell(new ObjectDeleted<tools.vitruv.methodologisttemplate.model.model.Protocol>(incUtil, (tools.vitruv.methodologisttemplate.model.model.Protocol) node), getSelf());
		}
	}
}

