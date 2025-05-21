package Something2Else.initfwd.hipe.engine.actor;

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
		type2addConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getLinkToEntity__Marker(), obj -> {
			Something2Else.LinkToEntity__Marker _linktoentity__marker = (Something2Else.LinkToEntity__Marker) obj;
			incUtil.newMessage();
			name2actor.get("LinkToEntity__Marker_object").tell(new ObjectAdded<Something2Else.LinkToEntity__Marker>(incUtil, _linktoentity__marker), getSelf());
		});
		type2addConsumer.put(tools.vitruv.methodologisttemplate.model.model.ModelPackage.eINSTANCE.getComponent(), obj -> {
			tools.vitruv.methodologisttemplate.model.model.Component _component = (tools.vitruv.methodologisttemplate.model.model.Component) obj;
			incUtil.newMessage();
			name2actor.get("Component_object_SP0").tell(new ObjectAdded<tools.vitruv.methodologisttemplate.model.model.Component>(incUtil, _component), getSelf());
			incUtil.newMessage();
			name2actor.get("Component_object_SP1").tell(new ObjectAdded<tools.vitruv.methodologisttemplate.model.model.Component>(incUtil, _component), getSelf());
			incUtil.newMessage();
			name2actor.get("Component_object_SP2").tell(new ObjectAdded<tools.vitruv.methodologisttemplate.model.model.Component>(incUtil, _component), getSelf());
		});
		type2addConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getComponentToEntity(), obj -> {
			Something2Else.ComponentToEntity _componenttoentity = (Something2Else.ComponentToEntity) obj;
			incUtil.newMessage();
			name2actor.get("ComponentToEntity_object").tell(new ObjectAdded<Something2Else.ComponentToEntity>(incUtil, _componenttoentity), getSelf());
		});
		type2addConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getLinkToEntityEmbedded__Marker(), obj -> {
			Something2Else.LinkToEntityEmbedded__Marker _linktoentityembedded__marker = (Something2Else.LinkToEntityEmbedded__Marker) obj;
			incUtil.newMessage();
			name2actor.get("LinkToEntityEmbedded__Marker_object").tell(new ObjectAdded<Something2Else.LinkToEntityEmbedded__Marker>(incUtil, _linktoentityembedded__marker), getSelf());
		});
		type2addConsumer.put(tools.vitruv.methodologisttemplate.model.model2.Model2Package.eINSTANCE.getRoot(), obj -> {
			tools.vitruv.methodologisttemplate.model.model2.Root _root = (tools.vitruv.methodologisttemplate.model.model2.Root) obj;
			incUtil.newMessage();
			name2actor.get("Root_object_SP0").tell(new ObjectAdded<tools.vitruv.methodologisttemplate.model.model2.Root>(incUtil, _root), getSelf());
			incUtil.newMessage();
			name2actor.get("Root_object_SP1").tell(new ObjectAdded<tools.vitruv.methodologisttemplate.model.model2.Root>(incUtil, _root), getSelf());
			incUtil.newMessage();
			name2actor.get("Root_object_SP2").tell(new ObjectAdded<tools.vitruv.methodologisttemplate.model.model2.Root>(incUtil, _root), getSelf());
		});
		type2addConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getSystemToRoot__Marker(), obj -> {
			Something2Else.SystemToRoot__Marker _systemtoroot__marker = (Something2Else.SystemToRoot__Marker) obj;
			incUtil.newMessage();
			name2actor.get("SystemToRoot__Marker_object").tell(new ObjectAdded<Something2Else.SystemToRoot__Marker>(incUtil, _systemtoroot__marker), getSelf());
		});
		type2addConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getLinkToEntity(), obj -> {
			Something2Else.LinkToEntity _linktoentity = (Something2Else.LinkToEntity) obj;
			incUtil.newMessage();
			name2actor.get("LinkToEntity_object").tell(new ObjectAdded<Something2Else.LinkToEntity>(incUtil, _linktoentity), getSelf());
		});
		type2addConsumer.put(tools.vitruv.methodologisttemplate.model.model.ModelPackage.eINSTANCE.getLink(), obj -> {
			tools.vitruv.methodologisttemplate.model.model.Link _link = (tools.vitruv.methodologisttemplate.model.model.Link) obj;
			incUtil.newMessage();
			name2actor.get("Link_object_SP0").tell(new ObjectAdded<tools.vitruv.methodologisttemplate.model.model.Link>(incUtil, _link), getSelf());
			incUtil.newMessage();
			name2actor.get("Link_object_SP1").tell(new ObjectAdded<tools.vitruv.methodologisttemplate.model.model.Link>(incUtil, _link), getSelf());
			incUtil.newMessage();
			name2actor.get("Link_object_SP2").tell(new ObjectAdded<tools.vitruv.methodologisttemplate.model.model.Link>(incUtil, _link), getSelf());
		});
		type2addConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getSystemToRoot(), obj -> {
			Something2Else.SystemToRoot _systemtoroot = (Something2Else.SystemToRoot) obj;
			incUtil.newMessage();
			name2actor.get("SystemToRoot_object_SP0").tell(new ObjectAdded<Something2Else.SystemToRoot>(incUtil, _systemtoroot), getSelf());
			incUtil.newMessage();
			name2actor.get("SystemToRoot_object_SP1").tell(new ObjectAdded<Something2Else.SystemToRoot>(incUtil, _systemtoroot), getSelf());
		});
		type2addConsumer.put(tools.vitruv.methodologisttemplate.model.model.ModelPackage.eINSTANCE.getDevice(), obj -> {
			tools.vitruv.methodologisttemplate.model.model.Device _device = (tools.vitruv.methodologisttemplate.model.model.Device) obj;
			incUtil.newMessage();
			name2actor.get("Component_object_SP0").tell(new ObjectAdded<tools.vitruv.methodologisttemplate.model.model.Component>(incUtil, _device), getSelf());
			incUtil.newMessage();
			name2actor.get("Component_object_SP1").tell(new ObjectAdded<tools.vitruv.methodologisttemplate.model.model.Component>(incUtil, _device), getSelf());
			incUtil.newMessage();
			name2actor.get("Component_object_SP2").tell(new ObjectAdded<tools.vitruv.methodologisttemplate.model.model.Component>(incUtil, _device), getSelf());
		});
		type2addConsumer.put(tools.vitruv.methodologisttemplate.model.model.ModelPackage.eINSTANCE.getProtocol(), obj -> {
			tools.vitruv.methodologisttemplate.model.model.Protocol _protocol = (tools.vitruv.methodologisttemplate.model.model.Protocol) obj;
			incUtil.newMessage();
			name2actor.get("Protocol_object_SP0").tell(new ObjectAdded<tools.vitruv.methodologisttemplate.model.model.Protocol>(incUtil, _protocol), getSelf());
			incUtil.newMessage();
			name2actor.get("Protocol_object_SP1").tell(new ObjectAdded<tools.vitruv.methodologisttemplate.model.model.Protocol>(incUtil, _protocol), getSelf());
		});
		type2addConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getProtocolToEntity(), obj -> {
			Something2Else.ProtocolToEntity _protocoltoentity = (Something2Else.ProtocolToEntity) obj;
			incUtil.newMessage();
			name2actor.get("ProtocolToEntity_object").tell(new ObjectAdded<Something2Else.ProtocolToEntity>(incUtil, _protocoltoentity), getSelf());
		});
		type2addConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getSystemRefdComponentToEntity__Marker(), obj -> {
			Something2Else.SystemRefdComponentToEntity__Marker _systemrefdcomponenttoentity__marker = (Something2Else.SystemRefdComponentToEntity__Marker) obj;
			incUtil.newMessage();
			name2actor.get("SystemRefdComponentToEntity__Marker_object").tell(new ObjectAdded<Something2Else.SystemRefdComponentToEntity__Marker>(incUtil, _systemrefdcomponenttoentity__marker), getSelf());
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
		type2addConsumer.put(tools.vitruv.methodologisttemplate.model.model2.Model2Package.eINSTANCE.getEntity(), obj -> {
			tools.vitruv.methodologisttemplate.model.model2.Entity _entity = (tools.vitruv.methodologisttemplate.model.model2.Entity) obj;
			incUtil.newMessage();
			name2actor.get("Entity_object_SP0").tell(new ObjectAdded<tools.vitruv.methodologisttemplate.model.model2.Entity>(incUtil, _entity), getSelf());
			incUtil.newMessage();
			name2actor.get("Entity_object_SP1").tell(new ObjectAdded<tools.vitruv.methodologisttemplate.model.model2.Entity>(incUtil, _entity), getSelf());
			incUtil.newMessage();
			name2actor.get("Entity_object_SP2").tell(new ObjectAdded<tools.vitruv.methodologisttemplate.model.model2.Entity>(incUtil, _entity), getSelf());
		});
		type2addConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getProtocolToEntity__Marker(), obj -> {
			Something2Else.ProtocolToEntity__Marker _protocoltoentity__marker = (Something2Else.ProtocolToEntity__Marker) obj;
			incUtil.newMessage();
			name2actor.get("ProtocolToEntity__Marker_object").tell(new ObjectAdded<Something2Else.ProtocolToEntity__Marker>(incUtil, _protocoltoentity__marker), getSelf());
		});
		type2addConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getComponentToEntity__Marker(), obj -> {
			Something2Else.ComponentToEntity__Marker _componenttoentity__marker = (Something2Else.ComponentToEntity__Marker) obj;
			incUtil.newMessage();
			name2actor.get("ComponentToEntity__Marker_object").tell(new ObjectAdded<Something2Else.ComponentToEntity__Marker>(incUtil, _componenttoentity__marker), getSelf());
		});
		type2addConsumer.put(tools.vitruv.methodologisttemplate.model.model.ModelPackage.eINSTANCE.getServer(), obj -> {
			tools.vitruv.methodologisttemplate.model.model.Server _server = (tools.vitruv.methodologisttemplate.model.model.Server) obj;
			incUtil.newMessage();
			name2actor.get("Component_object_SP0").tell(new ObjectAdded<tools.vitruv.methodologisttemplate.model.model.Component>(incUtil, _server), getSelf());
			incUtil.newMessage();
			name2actor.get("Component_object_SP1").tell(new ObjectAdded<tools.vitruv.methodologisttemplate.model.model.Component>(incUtil, _server), getSelf());
			incUtil.newMessage();
			name2actor.get("Component_object_SP2").tell(new ObjectAdded<tools.vitruv.methodologisttemplate.model.model.Component>(incUtil, _server), getSelf());
		});
	}
	
	private void initializeSet() {
		feature2setConsumer.put(tools.vitruv.methodologisttemplate.model.model.ModelPackage.eINSTANCE.getComponent_Name(), notification -> {
			if(notification.getNotifier() instanceof tools.vitruv.methodologisttemplate.model.model.Component) {
				incUtil.newMessage();
				name2actor.get("Component_object_SP1").tell(new AttributeChanged<tools.vitruv.methodologisttemplate.model.model.Component>(incUtil, (tools.vitruv.methodologisttemplate.model.model.Component) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof tools.vitruv.methodologisttemplate.model.model.Component) {
				incUtil.newMessage();
				name2actor.get("Component_object_SP0").tell(new AttributeChanged<tools.vitruv.methodologisttemplate.model.model.Component>(incUtil, (tools.vitruv.methodologisttemplate.model.model.Component) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof tools.vitruv.methodologisttemplate.model.model.Component) {
				incUtil.newMessage();
				name2actor.get("Component_object_SP2").tell(new AttributeChanged<tools.vitruv.methodologisttemplate.model.model.Component>(incUtil, (tools.vitruv.methodologisttemplate.model.model.Component) notification.getNotifier(), notification.getOldValue()), getSelf());
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
		feature2addEdgeConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getLinkToEntity__Marker_CREATE__TRG__entity(), notification -> {
			incUtil.newMessage();
			name2actor.get("LinkToEntity__CONSISTENCY_63_localSearch").tell(new ReferenceAdded<Something2Else.LinkToEntity__Marker, tools.vitruv.methodologisttemplate.model.model2.Entity>(incUtil,(Something2Else.LinkToEntity__Marker) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model2.Entity) notification.getNewValue(), "Something2Else.LinkToEntity__Marker_CREATE__TRG__entity_Entity"), getSelf());
		});
		feature2addEdgeConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getSystemRefdComponentToEntity__Marker_CREATE__TRG__entity(), notification -> {
			incUtil.newMessage();
			name2actor.get("SystemRefdComponentToEntity__CONSISTENCY_85_localSearch").tell(new ReferenceAdded<Something2Else.SystemRefdComponentToEntity__Marker, tools.vitruv.methodologisttemplate.model.model2.Entity>(incUtil,(Something2Else.SystemRefdComponentToEntity__Marker) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model2.Entity) notification.getNewValue(), "Something2Else.SystemRefdComponentToEntity__Marker_CREATE__TRG__entity_Entity"), getSelf());
		});
		feature2addEdgeConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getLinkToEntityEmbedded__Marker_CONTEXT__SRC__system(), notification -> {
			incUtil.newMessage();
			name2actor.get("LinkToEntityEmbedded__CONSISTENCY_25_localSearch").tell(new ReferenceAdded<Something2Else.LinkToEntityEmbedded__Marker, tools.vitruv.methodologisttemplate.model.model.System>(incUtil,(Something2Else.LinkToEntityEmbedded__Marker) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.System) notification.getNewValue(), "Something2Else.LinkToEntityEmbedded__Marker_CONTEXT__SRC__system_System"), getSelf());
		});
		feature2addEdgeConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getLinkToEntityEmbedded__Marker_CONTEXT__CORR__ctoe(), notification -> {
			incUtil.newMessage();
			name2actor.get("LinkToEntityEmbedded__CONSISTENCY_25_localSearch").tell(new ReferenceAdded<Something2Else.LinkToEntityEmbedded__Marker, Something2Else.ComponentToEntity>(incUtil,(Something2Else.LinkToEntityEmbedded__Marker) notification.getNotifier(), (Something2Else.ComponentToEntity) notification.getNewValue(), "Something2Else.LinkToEntityEmbedded__Marker_CONTEXT__CORR__ctoe_ComponentToEntity"), getSelf());
		});
		feature2addEdgeConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getLinkToEntity__Marker_CREATE__SRC__link(), notification -> {
			incUtil.newMessage();
			name2actor.get("LinkToEntity__CONSISTENCY_63_localSearch").tell(new ReferenceAdded<Something2Else.LinkToEntity__Marker, tools.vitruv.methodologisttemplate.model.model.Link>(incUtil,(Something2Else.LinkToEntity__Marker) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Link) notification.getNewValue(), "Something2Else.LinkToEntity__Marker_CREATE__SRC__link_Link"), getSelf());
		});
		feature2addEdgeConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getComponentToEntity_Source(), notification -> {
			incUtil.newMessage();
			name2actor.get("ComponentToEntity__CONSISTENCY_7_localSearch").tell(new ReferenceAdded<Something2Else.ComponentToEntity, tools.vitruv.methodologisttemplate.model.model.Component>(incUtil,(Something2Else.ComponentToEntity) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Component) notification.getNewValue(), "Something2Else.ComponentToEntity_source_Component"), getSelf());
			incUtil.newMessage();
			name2actor.get("LinkToEntityEmbedded__CONSISTENCY_25_localSearch").tell(new ReferenceAdded<Something2Else.ComponentToEntity, tools.vitruv.methodologisttemplate.model.model.Component>(incUtil,(Something2Else.ComponentToEntity) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Component) notification.getNewValue(), "Something2Else.ComponentToEntity_source_Component"), getSelf());
			incUtil.newMessage();
			name2actor.get("LinkToEntityEmbedded__FWD_39_localSearch").tell(new ReferenceAdded<Something2Else.ComponentToEntity, tools.vitruv.methodologisttemplate.model.model.Component>(incUtil,(Something2Else.ComponentToEntity) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Component) notification.getNewValue(), "Something2Else.ComponentToEntity_source_Component"), getSelf());
			incUtil.newMessage();
			name2actor.get("SystemRefdComponentToEntity__CONSISTENCY_85_localSearch").tell(new ReferenceAdded<Something2Else.ComponentToEntity, tools.vitruv.methodologisttemplate.model.model.Component>(incUtil,(Something2Else.ComponentToEntity) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Component) notification.getNewValue(), "Something2Else.ComponentToEntity_source_Component"), getSelf());
		});
		feature2addEdgeConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getComponentToEntity_Target(), notification -> {
			incUtil.newMessage();
			name2actor.get("ComponentToEntity__CONSISTENCY_7_localSearch").tell(new ReferenceAdded<Something2Else.ComponentToEntity, tools.vitruv.methodologisttemplate.model.model2.Entity>(incUtil,(Something2Else.ComponentToEntity) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model2.Entity) notification.getNewValue(), "Something2Else.ComponentToEntity_target_Entity"), getSelf());
			incUtil.newMessage();
			name2actor.get("LinkToEntityEmbedded__CONSISTENCY_25_localSearch").tell(new ReferenceAdded<Something2Else.ComponentToEntity, tools.vitruv.methodologisttemplate.model.model2.Entity>(incUtil,(Something2Else.ComponentToEntity) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model2.Entity) notification.getNewValue(), "Something2Else.ComponentToEntity_target_Entity"), getSelf());
			incUtil.newMessage();
			name2actor.get("LinkToEntityEmbedded__FWD_39_localSearch").tell(new ReferenceAdded<Something2Else.ComponentToEntity, tools.vitruv.methodologisttemplate.model.model2.Entity>(incUtil,(Something2Else.ComponentToEntity) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model2.Entity) notification.getNewValue(), "Something2Else.ComponentToEntity_target_Entity"), getSelf());
			incUtil.newMessage();
			name2actor.get("SystemRefdComponentToEntity__CONSISTENCY_85_localSearch").tell(new ReferenceAdded<Something2Else.ComponentToEntity, tools.vitruv.methodologisttemplate.model.model2.Entity>(incUtil,(Something2Else.ComponentToEntity) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model2.Entity) notification.getNewValue(), "Something2Else.ComponentToEntity_target_Entity"), getSelf());
		});
		feature2addEdgeConsumer.put(tools.vitruv.methodologisttemplate.model.model.ModelPackage.eINSTANCE.getSystem_Protocols(), notification -> {
			incUtil.newMessage();
			name2actor.get("LinkToEntityEmbedded__CONSISTENCY_25_localSearch").tell(new ReferenceAdded<tools.vitruv.methodologisttemplate.model.model.System, tools.vitruv.methodologisttemplate.model.model.Protocol>(incUtil,(tools.vitruv.methodologisttemplate.model.model.System) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Protocol) notification.getNewValue(), "tools.vitruv.methodologisttemplate.model.model.System_protocols_Protocol"), getSelf());
			incUtil.newMessage();
			name2actor.get("LinkToEntityEmbedded__FWD_39_localSearch").tell(new ReferenceAdded<tools.vitruv.methodologisttemplate.model.model.System, tools.vitruv.methodologisttemplate.model.model.Protocol>(incUtil,(tools.vitruv.methodologisttemplate.model.model.System) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Protocol) notification.getNewValue(), "tools.vitruv.methodologisttemplate.model.model.System_protocols_Protocol"), getSelf());
			incUtil.newMessage();
			name2actor.get("ProtocolToEntity__CONSISTENCY_72_localSearch").tell(new ReferenceAdded<tools.vitruv.methodologisttemplate.model.model.System, tools.vitruv.methodologisttemplate.model.model.Protocol>(incUtil,(tools.vitruv.methodologisttemplate.model.model.System) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Protocol) notification.getNewValue(), "tools.vitruv.methodologisttemplate.model.model.System_protocols_Protocol"), getSelf());
			incUtil.newMessage();
			name2actor.get("ProtocolToEntity__FWD_80_localSearch").tell(new ReferenceAdded<tools.vitruv.methodologisttemplate.model.model.System, tools.vitruv.methodologisttemplate.model.model.Protocol>(incUtil,(tools.vitruv.methodologisttemplate.model.model.System) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Protocol) notification.getNewValue(), "tools.vitruv.methodologisttemplate.model.model.System_protocols_Protocol"), getSelf());
		});
		feature2addEdgeConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getProtocolToEntity__Marker_CREATE__TRG__entity(), notification -> {
			incUtil.newMessage();
			name2actor.get("ProtocolToEntity__CONSISTENCY_72_localSearch").tell(new ReferenceAdded<Something2Else.ProtocolToEntity__Marker, tools.vitruv.methodologisttemplate.model.model2.Entity>(incUtil,(Something2Else.ProtocolToEntity__Marker) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model2.Entity) notification.getNewValue(), "Something2Else.ProtocolToEntity__Marker_CREATE__TRG__entity_Entity"), getSelf());
		});
		feature2addEdgeConsumer.put(tools.vitruv.methodologisttemplate.model.model2.Model2Package.eINSTANCE.getRoot_Entities(), notification -> {
			incUtil.newMessage();
			name2actor.get("ComponentToEntity_entity_entities_incoming_TRG__FILTER_NAC_TRG_4_localSearch").tell(new ReferenceAdded<tools.vitruv.methodologisttemplate.model.model2.Root, tools.vitruv.methodologisttemplate.model.model2.Entity>(incUtil,(tools.vitruv.methodologisttemplate.model.model2.Root) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model2.Entity) notification.getNewValue(), "tools.vitruv.methodologisttemplate.model.model2.Root_entities_Entity"), getSelf());
			incUtil.newMessage();
			name2actor.get("LinkToEntityEmbedded_linkEntity_entities_incoming_TRG__FILTER_NAC_TRG_22_localSearch").tell(new ReferenceAdded<tools.vitruv.methodologisttemplate.model.model2.Root, tools.vitruv.methodologisttemplate.model.model2.Entity>(incUtil,(tools.vitruv.methodologisttemplate.model.model2.Root) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model2.Entity) notification.getNewValue(), "tools.vitruv.methodologisttemplate.model.model2.Root_entities_Entity"), getSelf());
			incUtil.newMessage();
			name2actor.get("LinkToEntity_entity_entities_incoming_TRG__FILTER_NAC_TRG_60_localSearch").tell(new ReferenceAdded<tools.vitruv.methodologisttemplate.model.model2.Root, tools.vitruv.methodologisttemplate.model.model2.Entity>(incUtil,(tools.vitruv.methodologisttemplate.model.model2.Root) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model2.Entity) notification.getNewValue(), "tools.vitruv.methodologisttemplate.model.model2.Root_entities_Entity"), getSelf());
			incUtil.newMessage();
			name2actor.get("ProtocolToEntity__CONSISTENCY_72_localSearch").tell(new ReferenceAdded<tools.vitruv.methodologisttemplate.model.model2.Root, tools.vitruv.methodologisttemplate.model.model2.Entity>(incUtil,(tools.vitruv.methodologisttemplate.model.model2.Root) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model2.Entity) notification.getNewValue(), "tools.vitruv.methodologisttemplate.model.model2.Root_entities_Entity"), getSelf());
			incUtil.newMessage();
			name2actor.get("SystemRefdComponentToEntity__CONSISTENCY_85_localSearch").tell(new ReferenceAdded<tools.vitruv.methodologisttemplate.model.model2.Root, tools.vitruv.methodologisttemplate.model.model2.Entity>(incUtil,(tools.vitruv.methodologisttemplate.model.model2.Root) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model2.Entity) notification.getNewValue(), "tools.vitruv.methodologisttemplate.model.model2.Root_entities_Entity"), getSelf());
		});
		feature2addEdgeConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getComponentToEntity__Marker_CREATE__SRC__comp(), notification -> {
			incUtil.newMessage();
			name2actor.get("ComponentToEntity__CONSISTENCY_7_localSearch").tell(new ReferenceAdded<Something2Else.ComponentToEntity__Marker, tools.vitruv.methodologisttemplate.model.model.Component>(incUtil,(Something2Else.ComponentToEntity__Marker) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Component) notification.getNewValue(), "Something2Else.ComponentToEntity__Marker_CREATE__SRC__comp_Component"), getSelf());
		});
		feature2addEdgeConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getLinkToEntity__Marker_CREATE__CORR__ltoe(), notification -> {
			incUtil.newMessage();
			name2actor.get("LinkToEntity__CONSISTENCY_63_localSearch").tell(new ReferenceAdded<Something2Else.LinkToEntity__Marker, Something2Else.LinkToEntity>(incUtil,(Something2Else.LinkToEntity__Marker) notification.getNotifier(), (Something2Else.LinkToEntity) notification.getNewValue(), "Something2Else.LinkToEntity__Marker_CREATE__CORR__ltoe_LinkToEntity"), getSelf());
		});
		feature2addEdgeConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getSystemToRoot__Marker_CREATE__CORR__stor(), notification -> {
			incUtil.newMessage();
			name2actor.get("SystemToRoot__CONSISTENCY_98_localSearch").tell(new ReferenceAdded<Something2Else.SystemToRoot__Marker, Something2Else.SystemToRoot>(incUtil,(Something2Else.SystemToRoot__Marker) notification.getNotifier(), (Something2Else.SystemToRoot) notification.getNewValue(), "Something2Else.SystemToRoot__Marker_CREATE__CORR__stor_SystemToRoot"), getSelf());
		});
		feature2addEdgeConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getComponentToEntity__Marker_CREATE__TRG__entity(), notification -> {
			incUtil.newMessage();
			name2actor.get("ComponentToEntity__CONSISTENCY_7_localSearch").tell(new ReferenceAdded<Something2Else.ComponentToEntity__Marker, tools.vitruv.methodologisttemplate.model.model2.Entity>(incUtil,(Something2Else.ComponentToEntity__Marker) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model2.Entity) notification.getNewValue(), "Something2Else.ComponentToEntity__Marker_CREATE__TRG__entity_Entity"), getSelf());
		});
		feature2addEdgeConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getProtocolToEntity__Marker_CREATE__SRC__protocol(), notification -> {
			incUtil.newMessage();
			name2actor.get("ProtocolToEntity__CONSISTENCY_72_localSearch").tell(new ReferenceAdded<Something2Else.ProtocolToEntity__Marker, tools.vitruv.methodologisttemplate.model.model.Protocol>(incUtil,(Something2Else.ProtocolToEntity__Marker) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Protocol) notification.getNewValue(), "Something2Else.ProtocolToEntity__Marker_CREATE__SRC__protocol_Protocol"), getSelf());
		});
		feature2addEdgeConsumer.put(tools.vitruv.methodologisttemplate.model.model.ModelPackage.eINSTANCE.getLink_Components(), notification -> {
			incUtil.newMessage();
			name2actor.get("LinkToEntityEmbedded_link_components_outgoing_SRC__FILTER_NAC_SRC_14_localSearch").tell(new ReferenceAdded<tools.vitruv.methodologisttemplate.model.model.Link, tools.vitruv.methodologisttemplate.model.model.Component>(incUtil,(tools.vitruv.methodologisttemplate.model.model.Link) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Component) notification.getNewValue(), "tools.vitruv.methodologisttemplate.model.model.Link_components_Component"), getSelf());
			incUtil.newMessage();
			name2actor.get("LinkToEntityEmbedded_link_components_outgoing_SRC__FILTER_NAC_SRC_14_localSearch").tell(new ReferenceAdded<tools.vitruv.methodologisttemplate.model.model.Link, tools.vitruv.methodologisttemplate.model.model.Component>(incUtil,(tools.vitruv.methodologisttemplate.model.model.Link) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Component) notification.getNewValue(), "tools.vitruv.methodologisttemplate.model.model.Link_components_Component"), getSelf());
			incUtil.newMessage();
			name2actor.get("LinkToEntityEmbedded__CONSISTENCY_25_localSearch").tell(new ReferenceAdded<tools.vitruv.methodologisttemplate.model.model.Link, tools.vitruv.methodologisttemplate.model.model.Component>(incUtil,(tools.vitruv.methodologisttemplate.model.model.Link) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Component) notification.getNewValue(), "tools.vitruv.methodologisttemplate.model.model.Link_components_Component"), getSelf());
			incUtil.newMessage();
			name2actor.get("LinkToEntityEmbedded__FWD_39_localSearch").tell(new ReferenceAdded<tools.vitruv.methodologisttemplate.model.model.Link, tools.vitruv.methodologisttemplate.model.model.Component>(incUtil,(tools.vitruv.methodologisttemplate.model.model.Link) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Component) notification.getNewValue(), "tools.vitruv.methodologisttemplate.model.model.Link_components_Component"), getSelf());
			incUtil.newMessage();
			name2actor.get("LinkToEntity_link_components_outgoing_SRC__FILTER_NAC_SRC_50_localSearch").tell(new ReferenceAdded<tools.vitruv.methodologisttemplate.model.model.Link, tools.vitruv.methodologisttemplate.model.model.Component>(incUtil,(tools.vitruv.methodologisttemplate.model.model.Link) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Component) notification.getNewValue(), "tools.vitruv.methodologisttemplate.model.model.Link_components_Component"), getSelf());
		});
		feature2addEdgeConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getSystemRefdComponentToEntity__Marker_CONTEXT__CORR__stor(), notification -> {
			incUtil.newMessage();
			name2actor.get("SystemRefdComponentToEntity__CONSISTENCY_85_localSearch").tell(new ReferenceAdded<Something2Else.SystemRefdComponentToEntity__Marker, Something2Else.SystemToRoot>(incUtil,(Something2Else.SystemRefdComponentToEntity__Marker) notification.getNotifier(), (Something2Else.SystemToRoot) notification.getNewValue(), "Something2Else.SystemRefdComponentToEntity__Marker_CONTEXT__CORR__stor_SystemToRoot"), getSelf());
		});
		feature2addEdgeConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getLinkToEntityEmbedded__Marker_CONTEXT__CORR__stor(), notification -> {
			incUtil.newMessage();
			name2actor.get("LinkToEntityEmbedded__CONSISTENCY_25_localSearch").tell(new ReferenceAdded<Something2Else.LinkToEntityEmbedded__Marker, Something2Else.SystemToRoot>(incUtil,(Something2Else.LinkToEntityEmbedded__Marker) notification.getNotifier(), (Something2Else.SystemToRoot) notification.getNewValue(), "Something2Else.LinkToEntityEmbedded__Marker_CONTEXT__CORR__stor_SystemToRoot"), getSelf());
		});
		feature2addEdgeConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getLinkToEntity_Target(), notification -> {
			incUtil.newMessage();
			name2actor.get("LinkToEntityEmbedded__CONSISTENCY_25_localSearch").tell(new ReferenceAdded<Something2Else.LinkToEntity, tools.vitruv.methodologisttemplate.model.model2.Entity>(incUtil,(Something2Else.LinkToEntity) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model2.Entity) notification.getNewValue(), "Something2Else.LinkToEntity_target_Entity"), getSelf());
			incUtil.newMessage();
			name2actor.get("LinkToEntity__CONSISTENCY_63_localSearch").tell(new ReferenceAdded<Something2Else.LinkToEntity, tools.vitruv.methodologisttemplate.model.model2.Entity>(incUtil,(Something2Else.LinkToEntity) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model2.Entity) notification.getNewValue(), "Something2Else.LinkToEntity_target_Entity"), getSelf());
		});
		feature2addEdgeConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getSystemToRoot__Marker_CREATE__TRG__root(), notification -> {
			incUtil.newMessage();
			name2actor.get("SystemToRoot__CONSISTENCY_98_localSearch").tell(new ReferenceAdded<Something2Else.SystemToRoot__Marker, tools.vitruv.methodologisttemplate.model.model2.Root>(incUtil,(Something2Else.SystemToRoot__Marker) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model2.Root) notification.getNewValue(), "Something2Else.SystemToRoot__Marker_CREATE__TRG__root_Root"), getSelf());
		});
		feature2addEdgeConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getSystemToRoot_Source(), notification -> {
			incUtil.newMessage();
			name2actor.get("LinkToEntityEmbedded__CONSISTENCY_25_localSearch").tell(new ReferenceAdded<Something2Else.SystemToRoot, tools.vitruv.methodologisttemplate.model.model.System>(incUtil,(Something2Else.SystemToRoot) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.System) notification.getNewValue(), "Something2Else.SystemToRoot_source_System"), getSelf());
			incUtil.newMessage();
			name2actor.get("LinkToEntityEmbedded__FWD_39_localSearch").tell(new ReferenceAdded<Something2Else.SystemToRoot, tools.vitruv.methodologisttemplate.model.model.System>(incUtil,(Something2Else.SystemToRoot) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.System) notification.getNewValue(), "Something2Else.SystemToRoot_source_System"), getSelf());
			incUtil.newMessage();
			name2actor.get("ProtocolToEntity__CONSISTENCY_72_localSearch").tell(new ReferenceAdded<Something2Else.SystemToRoot, tools.vitruv.methodologisttemplate.model.model.System>(incUtil,(Something2Else.SystemToRoot) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.System) notification.getNewValue(), "Something2Else.SystemToRoot_source_System"), getSelf());
			incUtil.newMessage();
			name2actor.get("ProtocolToEntity__FWD_80_localSearch").tell(new ReferenceAdded<Something2Else.SystemToRoot, tools.vitruv.methodologisttemplate.model.model.System>(incUtil,(Something2Else.SystemToRoot) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.System) notification.getNewValue(), "Something2Else.SystemToRoot_source_System"), getSelf());
			incUtil.newMessage();
			name2actor.get("SystemRefdComponentToEntity__CONSISTENCY_85_localSearch").tell(new ReferenceAdded<Something2Else.SystemToRoot, tools.vitruv.methodologisttemplate.model.model.System>(incUtil,(Something2Else.SystemToRoot) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.System) notification.getNewValue(), "Something2Else.SystemToRoot_source_System"), getSelf());
			incUtil.newMessage();
			name2actor.get("SystemRefdComponentToEntity__FWD_93_localSearch").tell(new ReferenceAdded<Something2Else.SystemToRoot, tools.vitruv.methodologisttemplate.model.model.System>(incUtil,(Something2Else.SystemToRoot) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.System) notification.getNewValue(), "Something2Else.SystemToRoot_source_System"), getSelf());
			incUtil.newMessage();
			name2actor.get("SystemToRoot__CONSISTENCY_98_localSearch").tell(new ReferenceAdded<Something2Else.SystemToRoot, tools.vitruv.methodologisttemplate.model.model.System>(incUtil,(Something2Else.SystemToRoot) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.System) notification.getNewValue(), "Something2Else.SystemToRoot_source_System"), getSelf());
		});
		feature2addEdgeConsumer.put(tools.vitruv.methodologisttemplate.model.model.ModelPackage.eINSTANCE.getSystem_Links(), notification -> {
			incUtil.newMessage();
			name2actor.get("LinkToEntityEmbedded__CONSISTENCY_25_localSearch").tell(new ReferenceAdded<tools.vitruv.methodologisttemplate.model.model.System, tools.vitruv.methodologisttemplate.model.model.Link>(incUtil,(tools.vitruv.methodologisttemplate.model.model.System) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Link) notification.getNewValue(), "tools.vitruv.methodologisttemplate.model.model.System_links_Link"), getSelf());
			incUtil.newMessage();
			name2actor.get("LinkToEntityEmbedded__FWD_39_localSearch").tell(new ReferenceAdded<tools.vitruv.methodologisttemplate.model.model.System, tools.vitruv.methodologisttemplate.model.model.Link>(incUtil,(tools.vitruv.methodologisttemplate.model.model.System) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Link) notification.getNewValue(), "tools.vitruv.methodologisttemplate.model.model.System_links_Link"), getSelf());
			incUtil.newMessage();
			name2actor.get("LinkToEntity_link_links_incoming_SRC__FILTER_NAC_SRC_57_localSearch").tell(new ReferenceAdded<tools.vitruv.methodologisttemplate.model.model.System, tools.vitruv.methodologisttemplate.model.model.Link>(incUtil,(tools.vitruv.methodologisttemplate.model.model.System) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Link) notification.getNewValue(), "tools.vitruv.methodologisttemplate.model.model.System_links_Link"), getSelf());
		});
		feature2addEdgeConsumer.put(tools.vitruv.methodologisttemplate.model.model.ModelPackage.eINSTANCE.getLink_Protocol(), notification -> {
			incUtil.newMessage();
			name2actor.get("LinkToEntityEmbedded_link_protocol_outgoing_SRC__FILTER_NAC_SRC_18_localSearch").tell(new ReferenceAdded<tools.vitruv.methodologisttemplate.model.model.Link, tools.vitruv.methodologisttemplate.model.model.Protocol>(incUtil,(tools.vitruv.methodologisttemplate.model.model.Link) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Protocol) notification.getNewValue(), "tools.vitruv.methodologisttemplate.model.model.Link_protocol_Protocol"), getSelf());
			incUtil.newMessage();
			name2actor.get("LinkToEntityEmbedded_link_protocol_outgoing_SRC__FILTER_NAC_SRC_18_localSearch").tell(new ReferenceAdded<tools.vitruv.methodologisttemplate.model.model.Link, tools.vitruv.methodologisttemplate.model.model.Protocol>(incUtil,(tools.vitruv.methodologisttemplate.model.model.Link) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Protocol) notification.getNewValue(), "tools.vitruv.methodologisttemplate.model.model.Link_protocol_Protocol"), getSelf());
			incUtil.newMessage();
			name2actor.get("LinkToEntityEmbedded__CONSISTENCY_25_localSearch").tell(new ReferenceAdded<tools.vitruv.methodologisttemplate.model.model.Link, tools.vitruv.methodologisttemplate.model.model.Protocol>(incUtil,(tools.vitruv.methodologisttemplate.model.model.Link) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Protocol) notification.getNewValue(), "tools.vitruv.methodologisttemplate.model.model.Link_protocol_Protocol"), getSelf());
			incUtil.newMessage();
			name2actor.get("LinkToEntityEmbedded__FWD_39_localSearch").tell(new ReferenceAdded<tools.vitruv.methodologisttemplate.model.model.Link, tools.vitruv.methodologisttemplate.model.model.Protocol>(incUtil,(tools.vitruv.methodologisttemplate.model.model.Link) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Protocol) notification.getNewValue(), "tools.vitruv.methodologisttemplate.model.model.Link_protocol_Protocol"), getSelf());
			incUtil.newMessage();
			name2actor.get("LinkToEntity_link_protocol_outgoing_SRC__FILTER_NAC_SRC_53_localSearch").tell(new ReferenceAdded<tools.vitruv.methodologisttemplate.model.model.Link, tools.vitruv.methodologisttemplate.model.model.Protocol>(incUtil,(tools.vitruv.methodologisttemplate.model.model.Link) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Protocol) notification.getNewValue(), "tools.vitruv.methodologisttemplate.model.model.Link_protocol_Protocol"), getSelf());
			incUtil.newMessage();
			name2actor.get("LinkToEntity_link_protocol_outgoing_SRC__FILTER_NAC_SRC_53_localSearch").tell(new ReferenceAdded<tools.vitruv.methodologisttemplate.model.model.Link, tools.vitruv.methodologisttemplate.model.model.Protocol>(incUtil,(tools.vitruv.methodologisttemplate.model.model.Link) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Protocol) notification.getNewValue(), "tools.vitruv.methodologisttemplate.model.model.Link_protocol_Protocol"), getSelf());
			incUtil.newMessage();
			name2actor.get("LinkToEntity__CONSISTENCY_63_localSearch").tell(new ReferenceAdded<tools.vitruv.methodologisttemplate.model.model.Link, tools.vitruv.methodologisttemplate.model.model.Protocol>(incUtil,(tools.vitruv.methodologisttemplate.model.model.Link) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Protocol) notification.getNewValue(), "tools.vitruv.methodologisttemplate.model.model.Link_protocol_Protocol"), getSelf());
			incUtil.newMessage();
			name2actor.get("LinkToEntity__FWD_69_localSearch").tell(new ReferenceAdded<tools.vitruv.methodologisttemplate.model.model.Link, tools.vitruv.methodologisttemplate.model.model.Protocol>(incUtil,(tools.vitruv.methodologisttemplate.model.model.Link) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Protocol) notification.getNewValue(), "tools.vitruv.methodologisttemplate.model.model.Link_protocol_Protocol"), getSelf());
		});
		feature2addEdgeConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getProtocolToEntity__Marker_CREATE__CORR__ptoe(), notification -> {
			incUtil.newMessage();
			name2actor.get("ProtocolToEntity__CONSISTENCY_72_localSearch").tell(new ReferenceAdded<Something2Else.ProtocolToEntity__Marker, Something2Else.ProtocolToEntity>(incUtil,(Something2Else.ProtocolToEntity__Marker) notification.getNotifier(), (Something2Else.ProtocolToEntity) notification.getNewValue(), "Something2Else.ProtocolToEntity__Marker_CREATE__CORR__ptoe_ProtocolToEntity"), getSelf());
		});
		feature2addEdgeConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getComponentToEntity__Marker_CREATE__CORR__ctoe(), notification -> {
			incUtil.newMessage();
			name2actor.get("ComponentToEntity__CONSISTENCY_7_localSearch").tell(new ReferenceAdded<Something2Else.ComponentToEntity__Marker, Something2Else.ComponentToEntity>(incUtil,(Something2Else.ComponentToEntity__Marker) notification.getNotifier(), (Something2Else.ComponentToEntity) notification.getNewValue(), "Something2Else.ComponentToEntity__Marker_CREATE__CORR__ctoe_ComponentToEntity"), getSelf());
		});
		feature2addEdgeConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getLinkToEntity_Source(), notification -> {
			incUtil.newMessage();
			name2actor.get("LinkToEntityEmbedded__CONSISTENCY_25_localSearch").tell(new ReferenceAdded<Something2Else.LinkToEntity, tools.vitruv.methodologisttemplate.model.model.Link>(incUtil,(Something2Else.LinkToEntity) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Link) notification.getNewValue(), "Something2Else.LinkToEntity_source_Link"), getSelf());
			incUtil.newMessage();
			name2actor.get("LinkToEntity__CONSISTENCY_63_localSearch").tell(new ReferenceAdded<Something2Else.LinkToEntity, tools.vitruv.methodologisttemplate.model.model.Link>(incUtil,(Something2Else.LinkToEntity) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Link) notification.getNewValue(), "Something2Else.LinkToEntity_source_Link"), getSelf());
		});
		feature2addEdgeConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getSystemRefdComponentToEntity__Marker_CREATE__SRC__comp(), notification -> {
			incUtil.newMessage();
			name2actor.get("SystemRefdComponentToEntity__CONSISTENCY_85_localSearch").tell(new ReferenceAdded<Something2Else.SystemRefdComponentToEntity__Marker, tools.vitruv.methodologisttemplate.model.model.Component>(incUtil,(Something2Else.SystemRefdComponentToEntity__Marker) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Component) notification.getNewValue(), "Something2Else.SystemRefdComponentToEntity__Marker_CREATE__SRC__comp_Component"), getSelf());
		});
		feature2addEdgeConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getLinkToEntityEmbedded__Marker_CONTEXT__SRC__protocol(), notification -> {
			incUtil.newMessage();
			name2actor.get("LinkToEntityEmbedded__CONSISTENCY_25_localSearch").tell(new ReferenceAdded<Something2Else.LinkToEntityEmbedded__Marker, tools.vitruv.methodologisttemplate.model.model.Protocol>(incUtil,(Something2Else.LinkToEntityEmbedded__Marker) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Protocol) notification.getNewValue(), "Something2Else.LinkToEntityEmbedded__Marker_CONTEXT__SRC__protocol_Protocol"), getSelf());
		});
		feature2addEdgeConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getLinkToEntityEmbedded__Marker_CONTEXT__TRG__protEntity(), notification -> {
			incUtil.newMessage();
			name2actor.get("LinkToEntityEmbedded__CONSISTENCY_25_localSearch").tell(new ReferenceAdded<Something2Else.LinkToEntityEmbedded__Marker, tools.vitruv.methodologisttemplate.model.model2.Entity>(incUtil,(Something2Else.LinkToEntityEmbedded__Marker) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model2.Entity) notification.getNewValue(), "Something2Else.LinkToEntityEmbedded__Marker_CONTEXT__TRG__protEntity_Entity"), getSelf());
		});
		feature2addEdgeConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getLinkToEntity__Marker_CONTEXT__SRC__protocol(), notification -> {
			incUtil.newMessage();
			name2actor.get("LinkToEntity__CONSISTENCY_63_localSearch").tell(new ReferenceAdded<Something2Else.LinkToEntity__Marker, tools.vitruv.methodologisttemplate.model.model.Protocol>(incUtil,(Something2Else.LinkToEntity__Marker) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Protocol) notification.getNewValue(), "Something2Else.LinkToEntity__Marker_CONTEXT__SRC__protocol_Protocol"), getSelf());
		});
		feature2addEdgeConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getLinkToEntityEmbedded__Marker_CREATE__SRC__link(), notification -> {
			incUtil.newMessage();
			name2actor.get("LinkToEntityEmbedded__CONSISTENCY_25_localSearch").tell(new ReferenceAdded<Something2Else.LinkToEntityEmbedded__Marker, tools.vitruv.methodologisttemplate.model.model.Link>(incUtil,(Something2Else.LinkToEntityEmbedded__Marker) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Link) notification.getNewValue(), "Something2Else.LinkToEntityEmbedded__Marker_CREATE__SRC__link_Link"), getSelf());
		});
		feature2addEdgeConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getLinkToEntityEmbedded__Marker_CONTEXT__SRC__component(), notification -> {
			incUtil.newMessage();
			name2actor.get("LinkToEntityEmbedded__CONSISTENCY_25_localSearch").tell(new ReferenceAdded<Something2Else.LinkToEntityEmbedded__Marker, tools.vitruv.methodologisttemplate.model.model.Component>(incUtil,(Something2Else.LinkToEntityEmbedded__Marker) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Component) notification.getNewValue(), "Something2Else.LinkToEntityEmbedded__Marker_CONTEXT__SRC__component_Component"), getSelf());
		});
		feature2addEdgeConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getProtocolToEntity__Marker_CONTEXT__TRG__root(), notification -> {
			incUtil.newMessage();
			name2actor.get("ProtocolToEntity__CONSISTENCY_72_localSearch").tell(new ReferenceAdded<Something2Else.ProtocolToEntity__Marker, tools.vitruv.methodologisttemplate.model.model2.Root>(incUtil,(Something2Else.ProtocolToEntity__Marker) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model2.Root) notification.getNewValue(), "Something2Else.ProtocolToEntity__Marker_CONTEXT__TRG__root_Root"), getSelf());
		});
		feature2addEdgeConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getProtocolToEntity__Marker_CONTEXT__SRC__system(), notification -> {
			incUtil.newMessage();
			name2actor.get("ProtocolToEntity__CONSISTENCY_72_localSearch").tell(new ReferenceAdded<Something2Else.ProtocolToEntity__Marker, tools.vitruv.methodologisttemplate.model.model.System>(incUtil,(Something2Else.ProtocolToEntity__Marker) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.System) notification.getNewValue(), "Something2Else.ProtocolToEntity__Marker_CONTEXT__SRC__system_System"), getSelf());
		});
		feature2addEdgeConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getLinkToEntityEmbedded__Marker_CREATE__TRG__linkEntity(), notification -> {
			incUtil.newMessage();
			name2actor.get("LinkToEntityEmbedded__CONSISTENCY_25_localSearch").tell(new ReferenceAdded<Something2Else.LinkToEntityEmbedded__Marker, tools.vitruv.methodologisttemplate.model.model2.Entity>(incUtil,(Something2Else.LinkToEntityEmbedded__Marker) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model2.Entity) notification.getNewValue(), "Something2Else.LinkToEntityEmbedded__Marker_CREATE__TRG__linkEntity_Entity"), getSelf());
		});
		feature2addEdgeConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getLinkToEntityEmbedded__Marker_CONTEXT__TRG__root(), notification -> {
			incUtil.newMessage();
			name2actor.get("LinkToEntityEmbedded__CONSISTENCY_25_localSearch").tell(new ReferenceAdded<Something2Else.LinkToEntityEmbedded__Marker, tools.vitruv.methodologisttemplate.model.model2.Root>(incUtil,(Something2Else.LinkToEntityEmbedded__Marker) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model2.Root) notification.getNewValue(), "Something2Else.LinkToEntityEmbedded__Marker_CONTEXT__TRG__root_Root"), getSelf());
		});
		feature2addEdgeConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getSystemRefdComponentToEntity__Marker_CREATE__CORR__ctoe(), notification -> {
			incUtil.newMessage();
			name2actor.get("SystemRefdComponentToEntity__CONSISTENCY_85_localSearch").tell(new ReferenceAdded<Something2Else.SystemRefdComponentToEntity__Marker, Something2Else.ComponentToEntity>(incUtil,(Something2Else.SystemRefdComponentToEntity__Marker) notification.getNotifier(), (Something2Else.ComponentToEntity) notification.getNewValue(), "Something2Else.SystemRefdComponentToEntity__Marker_CREATE__CORR__ctoe_ComponentToEntity"), getSelf());
		});
		feature2addEdgeConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getProtocolToEntity_Source(), notification -> {
			incUtil.newMessage();
			name2actor.get("LinkToEntityEmbedded__CONSISTENCY_25_localSearch").tell(new ReferenceAdded<Something2Else.ProtocolToEntity, tools.vitruv.methodologisttemplate.model.model.Protocol>(incUtil,(Something2Else.ProtocolToEntity) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Protocol) notification.getNewValue(), "Something2Else.ProtocolToEntity_source_Protocol"), getSelf());
			incUtil.newMessage();
			name2actor.get("LinkToEntityEmbedded__FWD_39_localSearch").tell(new ReferenceAdded<Something2Else.ProtocolToEntity, tools.vitruv.methodologisttemplate.model.model.Protocol>(incUtil,(Something2Else.ProtocolToEntity) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Protocol) notification.getNewValue(), "Something2Else.ProtocolToEntity_source_Protocol"), getSelf());
			incUtil.newMessage();
			name2actor.get("ProtocolToEntity__CONSISTENCY_72_localSearch").tell(new ReferenceAdded<Something2Else.ProtocolToEntity, tools.vitruv.methodologisttemplate.model.model.Protocol>(incUtil,(Something2Else.ProtocolToEntity) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Protocol) notification.getNewValue(), "Something2Else.ProtocolToEntity_source_Protocol"), getSelf());
		});
		feature2addEdgeConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getLinkToEntityEmbedded__Marker_CREATE__CORR__ltoe(), notification -> {
			incUtil.newMessage();
			name2actor.get("LinkToEntityEmbedded__CONSISTENCY_25_localSearch").tell(new ReferenceAdded<Something2Else.LinkToEntityEmbedded__Marker, Something2Else.LinkToEntity>(incUtil,(Something2Else.LinkToEntityEmbedded__Marker) notification.getNotifier(), (Something2Else.LinkToEntity) notification.getNewValue(), "Something2Else.LinkToEntityEmbedded__Marker_CREATE__CORR__ltoe_LinkToEntity"), getSelf());
		});
		feature2addEdgeConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getSystemToRoot__Marker_CREATE__SRC__system(), notification -> {
			incUtil.newMessage();
			name2actor.get("SystemToRoot__CONSISTENCY_98_localSearch").tell(new ReferenceAdded<Something2Else.SystemToRoot__Marker, tools.vitruv.methodologisttemplate.model.model.System>(incUtil,(Something2Else.SystemToRoot__Marker) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.System) notification.getNewValue(), "Something2Else.SystemToRoot__Marker_CREATE__SRC__system_System"), getSelf());
		});
		feature2addEdgeConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getSystemRefdComponentToEntity__Marker_CONTEXT__SRC__system(), notification -> {
			incUtil.newMessage();
			name2actor.get("SystemRefdComponentToEntity__CONSISTENCY_85_localSearch").tell(new ReferenceAdded<Something2Else.SystemRefdComponentToEntity__Marker, tools.vitruv.methodologisttemplate.model.model.System>(incUtil,(Something2Else.SystemRefdComponentToEntity__Marker) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.System) notification.getNewValue(), "Something2Else.SystemRefdComponentToEntity__Marker_CONTEXT__SRC__system_System"), getSelf());
		});
		feature2addEdgeConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getSystemRefdComponentToEntity__Marker_CONTEXT__TRG__root(), notification -> {
			incUtil.newMessage();
			name2actor.get("SystemRefdComponentToEntity__CONSISTENCY_85_localSearch").tell(new ReferenceAdded<Something2Else.SystemRefdComponentToEntity__Marker, tools.vitruv.methodologisttemplate.model.model2.Root>(incUtil,(Something2Else.SystemRefdComponentToEntity__Marker) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model2.Root) notification.getNewValue(), "Something2Else.SystemRefdComponentToEntity__Marker_CONTEXT__TRG__root_Root"), getSelf());
		});
		feature2addEdgeConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getLinkToEntityEmbedded__Marker_CONTEXT__TRG__compEntity(), notification -> {
			incUtil.newMessage();
			name2actor.get("LinkToEntityEmbedded__CONSISTENCY_25_localSearch").tell(new ReferenceAdded<Something2Else.LinkToEntityEmbedded__Marker, tools.vitruv.methodologisttemplate.model.model2.Entity>(incUtil,(Something2Else.LinkToEntityEmbedded__Marker) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model2.Entity) notification.getNewValue(), "Something2Else.LinkToEntityEmbedded__Marker_CONTEXT__TRG__compEntity_Entity"), getSelf());
		});
		feature2addEdgeConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getSystemToRoot_Target(), notification -> {
			incUtil.newMessage();
			name2actor.get("LinkToEntityEmbedded__CONSISTENCY_25_localSearch").tell(new ReferenceAdded<Something2Else.SystemToRoot, tools.vitruv.methodologisttemplate.model.model2.Root>(incUtil,(Something2Else.SystemToRoot) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model2.Root) notification.getNewValue(), "Something2Else.SystemToRoot_target_Root"), getSelf());
			incUtil.newMessage();
			name2actor.get("LinkToEntityEmbedded__FWD_39_localSearch").tell(new ReferenceAdded<Something2Else.SystemToRoot, tools.vitruv.methodologisttemplate.model.model2.Root>(incUtil,(Something2Else.SystemToRoot) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model2.Root) notification.getNewValue(), "Something2Else.SystemToRoot_target_Root"), getSelf());
			incUtil.newMessage();
			name2actor.get("ProtocolToEntity__CONSISTENCY_72_localSearch").tell(new ReferenceAdded<Something2Else.SystemToRoot, tools.vitruv.methodologisttemplate.model.model2.Root>(incUtil,(Something2Else.SystemToRoot) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model2.Root) notification.getNewValue(), "Something2Else.SystemToRoot_target_Root"), getSelf());
			incUtil.newMessage();
			name2actor.get("ProtocolToEntity__FWD_80_localSearch").tell(new ReferenceAdded<Something2Else.SystemToRoot, tools.vitruv.methodologisttemplate.model.model2.Root>(incUtil,(Something2Else.SystemToRoot) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model2.Root) notification.getNewValue(), "Something2Else.SystemToRoot_target_Root"), getSelf());
			incUtil.newMessage();
			name2actor.get("SystemRefdComponentToEntity__CONSISTENCY_85_localSearch").tell(new ReferenceAdded<Something2Else.SystemToRoot, tools.vitruv.methodologisttemplate.model.model2.Root>(incUtil,(Something2Else.SystemToRoot) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model2.Root) notification.getNewValue(), "Something2Else.SystemToRoot_target_Root"), getSelf());
			incUtil.newMessage();
			name2actor.get("SystemRefdComponentToEntity__FWD_93_localSearch").tell(new ReferenceAdded<Something2Else.SystemToRoot, tools.vitruv.methodologisttemplate.model.model2.Root>(incUtil,(Something2Else.SystemToRoot) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model2.Root) notification.getNewValue(), "Something2Else.SystemToRoot_target_Root"), getSelf());
			incUtil.newMessage();
			name2actor.get("SystemToRoot__CONSISTENCY_98_localSearch").tell(new ReferenceAdded<Something2Else.SystemToRoot, tools.vitruv.methodologisttemplate.model.model2.Root>(incUtil,(Something2Else.SystemToRoot) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model2.Root) notification.getNewValue(), "Something2Else.SystemToRoot_target_Root"), getSelf());
		});
		feature2addEdgeConsumer.put(tools.vitruv.methodologisttemplate.model.model.ModelPackage.eINSTANCE.getSystem_Components(), notification -> {
			incUtil.newMessage();
			name2actor.get("ComponentToEntity_comp_components_incoming_SRC__FILTER_NAC_SRC_1_localSearch").tell(new ReferenceAdded<tools.vitruv.methodologisttemplate.model.model.System, tools.vitruv.methodologisttemplate.model.model.Component>(incUtil,(tools.vitruv.methodologisttemplate.model.model.System) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Component) notification.getNewValue(), "tools.vitruv.methodologisttemplate.model.model.System_components_Component"), getSelf());
			incUtil.newMessage();
			name2actor.get("LinkToEntityEmbedded__CONSISTENCY_25_localSearch").tell(new ReferenceAdded<tools.vitruv.methodologisttemplate.model.model.System, tools.vitruv.methodologisttemplate.model.model.Component>(incUtil,(tools.vitruv.methodologisttemplate.model.model.System) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Component) notification.getNewValue(), "tools.vitruv.methodologisttemplate.model.model.System_components_Component"), getSelf());
			incUtil.newMessage();
			name2actor.get("LinkToEntityEmbedded__FWD_39_localSearch").tell(new ReferenceAdded<tools.vitruv.methodologisttemplate.model.model.System, tools.vitruv.methodologisttemplate.model.model.Component>(incUtil,(tools.vitruv.methodologisttemplate.model.model.System) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Component) notification.getNewValue(), "tools.vitruv.methodologisttemplate.model.model.System_components_Component"), getSelf());
			incUtil.newMessage();
			name2actor.get("SystemRefdComponentToEntity__CONSISTENCY_85_localSearch").tell(new ReferenceAdded<tools.vitruv.methodologisttemplate.model.model.System, tools.vitruv.methodologisttemplate.model.model.Component>(incUtil,(tools.vitruv.methodologisttemplate.model.model.System) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Component) notification.getNewValue(), "tools.vitruv.methodologisttemplate.model.model.System_components_Component"), getSelf());
			incUtil.newMessage();
			name2actor.get("SystemRefdComponentToEntity__FWD_93_localSearch").tell(new ReferenceAdded<tools.vitruv.methodologisttemplate.model.model.System, tools.vitruv.methodologisttemplate.model.model.Component>(incUtil,(tools.vitruv.methodologisttemplate.model.model.System) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Component) notification.getNewValue(), "tools.vitruv.methodologisttemplate.model.model.System_components_Component"), getSelf());
		});
		feature2addEdgeConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getProtocolToEntity_Target(), notification -> {
			incUtil.newMessage();
			name2actor.get("LinkToEntityEmbedded__CONSISTENCY_25_localSearch").tell(new ReferenceAdded<Something2Else.ProtocolToEntity, tools.vitruv.methodologisttemplate.model.model2.Entity>(incUtil,(Something2Else.ProtocolToEntity) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model2.Entity) notification.getNewValue(), "Something2Else.ProtocolToEntity_target_Entity"), getSelf());
			incUtil.newMessage();
			name2actor.get("LinkToEntityEmbedded__FWD_39_localSearch").tell(new ReferenceAdded<Something2Else.ProtocolToEntity, tools.vitruv.methodologisttemplate.model.model2.Entity>(incUtil,(Something2Else.ProtocolToEntity) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model2.Entity) notification.getNewValue(), "Something2Else.ProtocolToEntity_target_Entity"), getSelf());
			incUtil.newMessage();
			name2actor.get("ProtocolToEntity__CONSISTENCY_72_localSearch").tell(new ReferenceAdded<Something2Else.ProtocolToEntity, tools.vitruv.methodologisttemplate.model.model2.Entity>(incUtil,(Something2Else.ProtocolToEntity) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model2.Entity) notification.getNewValue(), "Something2Else.ProtocolToEntity_target_Entity"), getSelf());
		});
		feature2addEdgeConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getProtocolToEntity__Marker_CONTEXT__CORR__stor(), notification -> {
			incUtil.newMessage();
			name2actor.get("ProtocolToEntity__CONSISTENCY_72_localSearch").tell(new ReferenceAdded<Something2Else.ProtocolToEntity__Marker, Something2Else.SystemToRoot>(incUtil,(Something2Else.ProtocolToEntity__Marker) notification.getNotifier(), (Something2Else.SystemToRoot) notification.getNewValue(), "Something2Else.ProtocolToEntity__Marker_CONTEXT__CORR__stor_SystemToRoot"), getSelf());
		});
		feature2addEdgeConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getLinkToEntityEmbedded__Marker_CONTEXT__CORR__ptoe(), notification -> {
			incUtil.newMessage();
			name2actor.get("LinkToEntityEmbedded__CONSISTENCY_25_localSearch").tell(new ReferenceAdded<Something2Else.LinkToEntityEmbedded__Marker, Something2Else.ProtocolToEntity>(incUtil,(Something2Else.LinkToEntityEmbedded__Marker) notification.getNotifier(), (Something2Else.ProtocolToEntity) notification.getNewValue(), "Something2Else.LinkToEntityEmbedded__Marker_CONTEXT__CORR__ptoe_ProtocolToEntity"), getSelf());
		});
	}
	
	private void initializeRemoveEdge() {
		feature2removeEdgeConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getLinkToEntity__Marker_CREATE__TRG__entity(), notification -> {
			incUtil.newMessage();
			name2actor.get("LinkToEntity__CONSISTENCY_63_localSearch").tell(new ReferenceDeleted<Something2Else.LinkToEntity__Marker, tools.vitruv.methodologisttemplate.model.model2.Entity>(incUtil, (Something2Else.LinkToEntity__Marker) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model2.Entity) notification.getOldValue(), "Something2Else.LinkToEntity__Marker_CREATE__TRG__entity_Entity"), getSelf());
		});
		feature2removeEdgeConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getSystemRefdComponentToEntity__Marker_CREATE__TRG__entity(), notification -> {
			incUtil.newMessage();
			name2actor.get("SystemRefdComponentToEntity__CONSISTENCY_85_localSearch").tell(new ReferenceDeleted<Something2Else.SystemRefdComponentToEntity__Marker, tools.vitruv.methodologisttemplate.model.model2.Entity>(incUtil, (Something2Else.SystemRefdComponentToEntity__Marker) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model2.Entity) notification.getOldValue(), "Something2Else.SystemRefdComponentToEntity__Marker_CREATE__TRG__entity_Entity"), getSelf());
		});
		feature2removeEdgeConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getLinkToEntityEmbedded__Marker_CONTEXT__SRC__system(), notification -> {
			incUtil.newMessage();
			name2actor.get("LinkToEntityEmbedded__CONSISTENCY_25_localSearch").tell(new ReferenceDeleted<Something2Else.LinkToEntityEmbedded__Marker, tools.vitruv.methodologisttemplate.model.model.System>(incUtil, (Something2Else.LinkToEntityEmbedded__Marker) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.System) notification.getOldValue(), "Something2Else.LinkToEntityEmbedded__Marker_CONTEXT__SRC__system_System"), getSelf());
		});
		feature2removeEdgeConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getLinkToEntityEmbedded__Marker_CONTEXT__CORR__ctoe(), notification -> {
			incUtil.newMessage();
			name2actor.get("LinkToEntityEmbedded__CONSISTENCY_25_localSearch").tell(new ReferenceDeleted<Something2Else.LinkToEntityEmbedded__Marker, Something2Else.ComponentToEntity>(incUtil, (Something2Else.LinkToEntityEmbedded__Marker) notification.getNotifier(), (Something2Else.ComponentToEntity) notification.getOldValue(), "Something2Else.LinkToEntityEmbedded__Marker_CONTEXT__CORR__ctoe_ComponentToEntity"), getSelf());
		});
		feature2removeEdgeConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getLinkToEntity__Marker_CREATE__SRC__link(), notification -> {
			incUtil.newMessage();
			name2actor.get("LinkToEntity__CONSISTENCY_63_localSearch").tell(new ReferenceDeleted<Something2Else.LinkToEntity__Marker, tools.vitruv.methodologisttemplate.model.model.Link>(incUtil, (Something2Else.LinkToEntity__Marker) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Link) notification.getOldValue(), "Something2Else.LinkToEntity__Marker_CREATE__SRC__link_Link"), getSelf());
		});
		feature2removeEdgeConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getComponentToEntity_Source(), notification -> {
			incUtil.newMessage();
			name2actor.get("ComponentToEntity__CONSISTENCY_7_localSearch").tell(new ReferenceDeleted<Something2Else.ComponentToEntity, tools.vitruv.methodologisttemplate.model.model.Component>(incUtil, (Something2Else.ComponentToEntity) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Component) notification.getOldValue(), "Something2Else.ComponentToEntity_source_Component"), getSelf());
			incUtil.newMessage();
			name2actor.get("LinkToEntityEmbedded__CONSISTENCY_25_localSearch").tell(new ReferenceDeleted<Something2Else.ComponentToEntity, tools.vitruv.methodologisttemplate.model.model.Component>(incUtil, (Something2Else.ComponentToEntity) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Component) notification.getOldValue(), "Something2Else.ComponentToEntity_source_Component"), getSelf());
			incUtil.newMessage();
			name2actor.get("LinkToEntityEmbedded__FWD_39_localSearch").tell(new ReferenceDeleted<Something2Else.ComponentToEntity, tools.vitruv.methodologisttemplate.model.model.Component>(incUtil, (Something2Else.ComponentToEntity) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Component) notification.getOldValue(), "Something2Else.ComponentToEntity_source_Component"), getSelf());
			incUtil.newMessage();
			name2actor.get("SystemRefdComponentToEntity__CONSISTENCY_85_localSearch").tell(new ReferenceDeleted<Something2Else.ComponentToEntity, tools.vitruv.methodologisttemplate.model.model.Component>(incUtil, (Something2Else.ComponentToEntity) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Component) notification.getOldValue(), "Something2Else.ComponentToEntity_source_Component"), getSelf());
		});
		feature2removeEdgeConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getComponentToEntity_Target(), notification -> {
			incUtil.newMessage();
			name2actor.get("ComponentToEntity__CONSISTENCY_7_localSearch").tell(new ReferenceDeleted<Something2Else.ComponentToEntity, tools.vitruv.methodologisttemplate.model.model2.Entity>(incUtil, (Something2Else.ComponentToEntity) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model2.Entity) notification.getOldValue(), "Something2Else.ComponentToEntity_target_Entity"), getSelf());
			incUtil.newMessage();
			name2actor.get("LinkToEntityEmbedded__CONSISTENCY_25_localSearch").tell(new ReferenceDeleted<Something2Else.ComponentToEntity, tools.vitruv.methodologisttemplate.model.model2.Entity>(incUtil, (Something2Else.ComponentToEntity) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model2.Entity) notification.getOldValue(), "Something2Else.ComponentToEntity_target_Entity"), getSelf());
			incUtil.newMessage();
			name2actor.get("LinkToEntityEmbedded__FWD_39_localSearch").tell(new ReferenceDeleted<Something2Else.ComponentToEntity, tools.vitruv.methodologisttemplate.model.model2.Entity>(incUtil, (Something2Else.ComponentToEntity) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model2.Entity) notification.getOldValue(), "Something2Else.ComponentToEntity_target_Entity"), getSelf());
			incUtil.newMessage();
			name2actor.get("SystemRefdComponentToEntity__CONSISTENCY_85_localSearch").tell(new ReferenceDeleted<Something2Else.ComponentToEntity, tools.vitruv.methodologisttemplate.model.model2.Entity>(incUtil, (Something2Else.ComponentToEntity) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model2.Entity) notification.getOldValue(), "Something2Else.ComponentToEntity_target_Entity"), getSelf());
		});
		feature2removeEdgeConsumer.put(tools.vitruv.methodologisttemplate.model.model.ModelPackage.eINSTANCE.getSystem_Protocols(), notification -> {
			incUtil.newMessage();
			name2actor.get("LinkToEntityEmbedded__CONSISTENCY_25_localSearch").tell(new ReferenceDeleted<tools.vitruv.methodologisttemplate.model.model.System, tools.vitruv.methodologisttemplate.model.model.Protocol>(incUtil, (tools.vitruv.methodologisttemplate.model.model.System) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Protocol) notification.getOldValue(), "tools.vitruv.methodologisttemplate.model.model.System_protocols_Protocol"), getSelf());
			incUtil.newMessage();
			name2actor.get("LinkToEntityEmbedded__FWD_39_localSearch").tell(new ReferenceDeleted<tools.vitruv.methodologisttemplate.model.model.System, tools.vitruv.methodologisttemplate.model.model.Protocol>(incUtil, (tools.vitruv.methodologisttemplate.model.model.System) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Protocol) notification.getOldValue(), "tools.vitruv.methodologisttemplate.model.model.System_protocols_Protocol"), getSelf());
			incUtil.newMessage();
			name2actor.get("ProtocolToEntity__CONSISTENCY_72_localSearch").tell(new ReferenceDeleted<tools.vitruv.methodologisttemplate.model.model.System, tools.vitruv.methodologisttemplate.model.model.Protocol>(incUtil, (tools.vitruv.methodologisttemplate.model.model.System) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Protocol) notification.getOldValue(), "tools.vitruv.methodologisttemplate.model.model.System_protocols_Protocol"), getSelf());
			incUtil.newMessage();
			name2actor.get("ProtocolToEntity__FWD_80_localSearch").tell(new ReferenceDeleted<tools.vitruv.methodologisttemplate.model.model.System, tools.vitruv.methodologisttemplate.model.model.Protocol>(incUtil, (tools.vitruv.methodologisttemplate.model.model.System) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Protocol) notification.getOldValue(), "tools.vitruv.methodologisttemplate.model.model.System_protocols_Protocol"), getSelf());
		});
		feature2removeEdgeConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getProtocolToEntity__Marker_CREATE__TRG__entity(), notification -> {
			incUtil.newMessage();
			name2actor.get("ProtocolToEntity__CONSISTENCY_72_localSearch").tell(new ReferenceDeleted<Something2Else.ProtocolToEntity__Marker, tools.vitruv.methodologisttemplate.model.model2.Entity>(incUtil, (Something2Else.ProtocolToEntity__Marker) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model2.Entity) notification.getOldValue(), "Something2Else.ProtocolToEntity__Marker_CREATE__TRG__entity_Entity"), getSelf());
		});
		feature2removeEdgeConsumer.put(tools.vitruv.methodologisttemplate.model.model2.Model2Package.eINSTANCE.getRoot_Entities(), notification -> {
			incUtil.newMessage();
			name2actor.get("ComponentToEntity_entity_entities_incoming_TRG__FILTER_NAC_TRG_4_localSearch").tell(new ReferenceDeleted<tools.vitruv.methodologisttemplate.model.model2.Root, tools.vitruv.methodologisttemplate.model.model2.Entity>(incUtil, (tools.vitruv.methodologisttemplate.model.model2.Root) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model2.Entity) notification.getOldValue(), "tools.vitruv.methodologisttemplate.model.model2.Root_entities_Entity"), getSelf());
			incUtil.newMessage();
			name2actor.get("LinkToEntityEmbedded_linkEntity_entities_incoming_TRG__FILTER_NAC_TRG_22_localSearch").tell(new ReferenceDeleted<tools.vitruv.methodologisttemplate.model.model2.Root, tools.vitruv.methodologisttemplate.model.model2.Entity>(incUtil, (tools.vitruv.methodologisttemplate.model.model2.Root) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model2.Entity) notification.getOldValue(), "tools.vitruv.methodologisttemplate.model.model2.Root_entities_Entity"), getSelf());
			incUtil.newMessage();
			name2actor.get("LinkToEntity_entity_entities_incoming_TRG__FILTER_NAC_TRG_60_localSearch").tell(new ReferenceDeleted<tools.vitruv.methodologisttemplate.model.model2.Root, tools.vitruv.methodologisttemplate.model.model2.Entity>(incUtil, (tools.vitruv.methodologisttemplate.model.model2.Root) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model2.Entity) notification.getOldValue(), "tools.vitruv.methodologisttemplate.model.model2.Root_entities_Entity"), getSelf());
			incUtil.newMessage();
			name2actor.get("ProtocolToEntity__CONSISTENCY_72_localSearch").tell(new ReferenceDeleted<tools.vitruv.methodologisttemplate.model.model2.Root, tools.vitruv.methodologisttemplate.model.model2.Entity>(incUtil, (tools.vitruv.methodologisttemplate.model.model2.Root) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model2.Entity) notification.getOldValue(), "tools.vitruv.methodologisttemplate.model.model2.Root_entities_Entity"), getSelf());
			incUtil.newMessage();
			name2actor.get("SystemRefdComponentToEntity__CONSISTENCY_85_localSearch").tell(new ReferenceDeleted<tools.vitruv.methodologisttemplate.model.model2.Root, tools.vitruv.methodologisttemplate.model.model2.Entity>(incUtil, (tools.vitruv.methodologisttemplate.model.model2.Root) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model2.Entity) notification.getOldValue(), "tools.vitruv.methodologisttemplate.model.model2.Root_entities_Entity"), getSelf());
		});
		feature2removeEdgeConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getComponentToEntity__Marker_CREATE__SRC__comp(), notification -> {
			incUtil.newMessage();
			name2actor.get("ComponentToEntity__CONSISTENCY_7_localSearch").tell(new ReferenceDeleted<Something2Else.ComponentToEntity__Marker, tools.vitruv.methodologisttemplate.model.model.Component>(incUtil, (Something2Else.ComponentToEntity__Marker) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Component) notification.getOldValue(), "Something2Else.ComponentToEntity__Marker_CREATE__SRC__comp_Component"), getSelf());
		});
		feature2removeEdgeConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getLinkToEntity__Marker_CREATE__CORR__ltoe(), notification -> {
			incUtil.newMessage();
			name2actor.get("LinkToEntity__CONSISTENCY_63_localSearch").tell(new ReferenceDeleted<Something2Else.LinkToEntity__Marker, Something2Else.LinkToEntity>(incUtil, (Something2Else.LinkToEntity__Marker) notification.getNotifier(), (Something2Else.LinkToEntity) notification.getOldValue(), "Something2Else.LinkToEntity__Marker_CREATE__CORR__ltoe_LinkToEntity"), getSelf());
		});
		feature2removeEdgeConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getSystemToRoot__Marker_CREATE__CORR__stor(), notification -> {
			incUtil.newMessage();
			name2actor.get("SystemToRoot__CONSISTENCY_98_localSearch").tell(new ReferenceDeleted<Something2Else.SystemToRoot__Marker, Something2Else.SystemToRoot>(incUtil, (Something2Else.SystemToRoot__Marker) notification.getNotifier(), (Something2Else.SystemToRoot) notification.getOldValue(), "Something2Else.SystemToRoot__Marker_CREATE__CORR__stor_SystemToRoot"), getSelf());
		});
		feature2removeEdgeConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getComponentToEntity__Marker_CREATE__TRG__entity(), notification -> {
			incUtil.newMessage();
			name2actor.get("ComponentToEntity__CONSISTENCY_7_localSearch").tell(new ReferenceDeleted<Something2Else.ComponentToEntity__Marker, tools.vitruv.methodologisttemplate.model.model2.Entity>(incUtil, (Something2Else.ComponentToEntity__Marker) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model2.Entity) notification.getOldValue(), "Something2Else.ComponentToEntity__Marker_CREATE__TRG__entity_Entity"), getSelf());
		});
		feature2removeEdgeConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getProtocolToEntity__Marker_CREATE__SRC__protocol(), notification -> {
			incUtil.newMessage();
			name2actor.get("ProtocolToEntity__CONSISTENCY_72_localSearch").tell(new ReferenceDeleted<Something2Else.ProtocolToEntity__Marker, tools.vitruv.methodologisttemplate.model.model.Protocol>(incUtil, (Something2Else.ProtocolToEntity__Marker) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Protocol) notification.getOldValue(), "Something2Else.ProtocolToEntity__Marker_CREATE__SRC__protocol_Protocol"), getSelf());
		});
		feature2removeEdgeConsumer.put(tools.vitruv.methodologisttemplate.model.model.ModelPackage.eINSTANCE.getLink_Components(), notification -> {
			incUtil.newMessage();
			name2actor.get("LinkToEntityEmbedded_link_components_outgoing_SRC__FILTER_NAC_SRC_14_localSearch").tell(new ReferenceDeleted<tools.vitruv.methodologisttemplate.model.model.Link, tools.vitruv.methodologisttemplate.model.model.Component>(incUtil, (tools.vitruv.methodologisttemplate.model.model.Link) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Component) notification.getOldValue(), "tools.vitruv.methodologisttemplate.model.model.Link_components_Component"), getSelf());
			incUtil.newMessage();
			name2actor.get("LinkToEntityEmbedded_link_components_outgoing_SRC__FILTER_NAC_SRC_14_localSearch").tell(new ReferenceDeleted<tools.vitruv.methodologisttemplate.model.model.Link, tools.vitruv.methodologisttemplate.model.model.Component>(incUtil, (tools.vitruv.methodologisttemplate.model.model.Link) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Component) notification.getOldValue(), "tools.vitruv.methodologisttemplate.model.model.Link_components_Component"), getSelf());
			incUtil.newMessage();
			name2actor.get("LinkToEntityEmbedded__CONSISTENCY_25_localSearch").tell(new ReferenceDeleted<tools.vitruv.methodologisttemplate.model.model.Link, tools.vitruv.methodologisttemplate.model.model.Component>(incUtil, (tools.vitruv.methodologisttemplate.model.model.Link) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Component) notification.getOldValue(), "tools.vitruv.methodologisttemplate.model.model.Link_components_Component"), getSelf());
			incUtil.newMessage();
			name2actor.get("LinkToEntityEmbedded__FWD_39_localSearch").tell(new ReferenceDeleted<tools.vitruv.methodologisttemplate.model.model.Link, tools.vitruv.methodologisttemplate.model.model.Component>(incUtil, (tools.vitruv.methodologisttemplate.model.model.Link) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Component) notification.getOldValue(), "tools.vitruv.methodologisttemplate.model.model.Link_components_Component"), getSelf());
			incUtil.newMessage();
			name2actor.get("LinkToEntity_link_components_outgoing_SRC__FILTER_NAC_SRC_50_localSearch").tell(new ReferenceDeleted<tools.vitruv.methodologisttemplate.model.model.Link, tools.vitruv.methodologisttemplate.model.model.Component>(incUtil, (tools.vitruv.methodologisttemplate.model.model.Link) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Component) notification.getOldValue(), "tools.vitruv.methodologisttemplate.model.model.Link_components_Component"), getSelf());
		});
		feature2removeEdgeConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getSystemRefdComponentToEntity__Marker_CONTEXT__CORR__stor(), notification -> {
			incUtil.newMessage();
			name2actor.get("SystemRefdComponentToEntity__CONSISTENCY_85_localSearch").tell(new ReferenceDeleted<Something2Else.SystemRefdComponentToEntity__Marker, Something2Else.SystemToRoot>(incUtil, (Something2Else.SystemRefdComponentToEntity__Marker) notification.getNotifier(), (Something2Else.SystemToRoot) notification.getOldValue(), "Something2Else.SystemRefdComponentToEntity__Marker_CONTEXT__CORR__stor_SystemToRoot"), getSelf());
		});
		feature2removeEdgeConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getLinkToEntityEmbedded__Marker_CONTEXT__CORR__stor(), notification -> {
			incUtil.newMessage();
			name2actor.get("LinkToEntityEmbedded__CONSISTENCY_25_localSearch").tell(new ReferenceDeleted<Something2Else.LinkToEntityEmbedded__Marker, Something2Else.SystemToRoot>(incUtil, (Something2Else.LinkToEntityEmbedded__Marker) notification.getNotifier(), (Something2Else.SystemToRoot) notification.getOldValue(), "Something2Else.LinkToEntityEmbedded__Marker_CONTEXT__CORR__stor_SystemToRoot"), getSelf());
		});
		feature2removeEdgeConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getLinkToEntity_Target(), notification -> {
			incUtil.newMessage();
			name2actor.get("LinkToEntityEmbedded__CONSISTENCY_25_localSearch").tell(new ReferenceDeleted<Something2Else.LinkToEntity, tools.vitruv.methodologisttemplate.model.model2.Entity>(incUtil, (Something2Else.LinkToEntity) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model2.Entity) notification.getOldValue(), "Something2Else.LinkToEntity_target_Entity"), getSelf());
			incUtil.newMessage();
			name2actor.get("LinkToEntity__CONSISTENCY_63_localSearch").tell(new ReferenceDeleted<Something2Else.LinkToEntity, tools.vitruv.methodologisttemplate.model.model2.Entity>(incUtil, (Something2Else.LinkToEntity) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model2.Entity) notification.getOldValue(), "Something2Else.LinkToEntity_target_Entity"), getSelf());
		});
		feature2removeEdgeConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getSystemToRoot__Marker_CREATE__TRG__root(), notification -> {
			incUtil.newMessage();
			name2actor.get("SystemToRoot__CONSISTENCY_98_localSearch").tell(new ReferenceDeleted<Something2Else.SystemToRoot__Marker, tools.vitruv.methodologisttemplate.model.model2.Root>(incUtil, (Something2Else.SystemToRoot__Marker) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model2.Root) notification.getOldValue(), "Something2Else.SystemToRoot__Marker_CREATE__TRG__root_Root"), getSelf());
		});
		feature2removeEdgeConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getSystemToRoot_Source(), notification -> {
			incUtil.newMessage();
			name2actor.get("LinkToEntityEmbedded__CONSISTENCY_25_localSearch").tell(new ReferenceDeleted<Something2Else.SystemToRoot, tools.vitruv.methodologisttemplate.model.model.System>(incUtil, (Something2Else.SystemToRoot) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.System) notification.getOldValue(), "Something2Else.SystemToRoot_source_System"), getSelf());
			incUtil.newMessage();
			name2actor.get("LinkToEntityEmbedded__FWD_39_localSearch").tell(new ReferenceDeleted<Something2Else.SystemToRoot, tools.vitruv.methodologisttemplate.model.model.System>(incUtil, (Something2Else.SystemToRoot) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.System) notification.getOldValue(), "Something2Else.SystemToRoot_source_System"), getSelf());
			incUtil.newMessage();
			name2actor.get("ProtocolToEntity__CONSISTENCY_72_localSearch").tell(new ReferenceDeleted<Something2Else.SystemToRoot, tools.vitruv.methodologisttemplate.model.model.System>(incUtil, (Something2Else.SystemToRoot) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.System) notification.getOldValue(), "Something2Else.SystemToRoot_source_System"), getSelf());
			incUtil.newMessage();
			name2actor.get("ProtocolToEntity__FWD_80_localSearch").tell(new ReferenceDeleted<Something2Else.SystemToRoot, tools.vitruv.methodologisttemplate.model.model.System>(incUtil, (Something2Else.SystemToRoot) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.System) notification.getOldValue(), "Something2Else.SystemToRoot_source_System"), getSelf());
			incUtil.newMessage();
			name2actor.get("SystemRefdComponentToEntity__CONSISTENCY_85_localSearch").tell(new ReferenceDeleted<Something2Else.SystemToRoot, tools.vitruv.methodologisttemplate.model.model.System>(incUtil, (Something2Else.SystemToRoot) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.System) notification.getOldValue(), "Something2Else.SystemToRoot_source_System"), getSelf());
			incUtil.newMessage();
			name2actor.get("SystemRefdComponentToEntity__FWD_93_localSearch").tell(new ReferenceDeleted<Something2Else.SystemToRoot, tools.vitruv.methodologisttemplate.model.model.System>(incUtil, (Something2Else.SystemToRoot) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.System) notification.getOldValue(), "Something2Else.SystemToRoot_source_System"), getSelf());
			incUtil.newMessage();
			name2actor.get("SystemToRoot__CONSISTENCY_98_localSearch").tell(new ReferenceDeleted<Something2Else.SystemToRoot, tools.vitruv.methodologisttemplate.model.model.System>(incUtil, (Something2Else.SystemToRoot) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.System) notification.getOldValue(), "Something2Else.SystemToRoot_source_System"), getSelf());
		});
		feature2removeEdgeConsumer.put(tools.vitruv.methodologisttemplate.model.model.ModelPackage.eINSTANCE.getSystem_Links(), notification -> {
			incUtil.newMessage();
			name2actor.get("LinkToEntityEmbedded__CONSISTENCY_25_localSearch").tell(new ReferenceDeleted<tools.vitruv.methodologisttemplate.model.model.System, tools.vitruv.methodologisttemplate.model.model.Link>(incUtil, (tools.vitruv.methodologisttemplate.model.model.System) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Link) notification.getOldValue(), "tools.vitruv.methodologisttemplate.model.model.System_links_Link"), getSelf());
			incUtil.newMessage();
			name2actor.get("LinkToEntityEmbedded__FWD_39_localSearch").tell(new ReferenceDeleted<tools.vitruv.methodologisttemplate.model.model.System, tools.vitruv.methodologisttemplate.model.model.Link>(incUtil, (tools.vitruv.methodologisttemplate.model.model.System) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Link) notification.getOldValue(), "tools.vitruv.methodologisttemplate.model.model.System_links_Link"), getSelf());
			incUtil.newMessage();
			name2actor.get("LinkToEntity_link_links_incoming_SRC__FILTER_NAC_SRC_57_localSearch").tell(new ReferenceDeleted<tools.vitruv.methodologisttemplate.model.model.System, tools.vitruv.methodologisttemplate.model.model.Link>(incUtil, (tools.vitruv.methodologisttemplate.model.model.System) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Link) notification.getOldValue(), "tools.vitruv.methodologisttemplate.model.model.System_links_Link"), getSelf());
		});
		feature2removeEdgeConsumer.put(tools.vitruv.methodologisttemplate.model.model.ModelPackage.eINSTANCE.getLink_Protocol(), notification -> {
			incUtil.newMessage();
			name2actor.get("LinkToEntityEmbedded_link_protocol_outgoing_SRC__FILTER_NAC_SRC_18_localSearch").tell(new ReferenceDeleted<tools.vitruv.methodologisttemplate.model.model.Link, tools.vitruv.methodologisttemplate.model.model.Protocol>(incUtil, (tools.vitruv.methodologisttemplate.model.model.Link) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Protocol) notification.getOldValue(), "tools.vitruv.methodologisttemplate.model.model.Link_protocol_Protocol"), getSelf());
			incUtil.newMessage();
			name2actor.get("LinkToEntityEmbedded_link_protocol_outgoing_SRC__FILTER_NAC_SRC_18_localSearch").tell(new ReferenceDeleted<tools.vitruv.methodologisttemplate.model.model.Link, tools.vitruv.methodologisttemplate.model.model.Protocol>(incUtil, (tools.vitruv.methodologisttemplate.model.model.Link) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Protocol) notification.getOldValue(), "tools.vitruv.methodologisttemplate.model.model.Link_protocol_Protocol"), getSelf());
			incUtil.newMessage();
			name2actor.get("LinkToEntityEmbedded__CONSISTENCY_25_localSearch").tell(new ReferenceDeleted<tools.vitruv.methodologisttemplate.model.model.Link, tools.vitruv.methodologisttemplate.model.model.Protocol>(incUtil, (tools.vitruv.methodologisttemplate.model.model.Link) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Protocol) notification.getOldValue(), "tools.vitruv.methodologisttemplate.model.model.Link_protocol_Protocol"), getSelf());
			incUtil.newMessage();
			name2actor.get("LinkToEntityEmbedded__FWD_39_localSearch").tell(new ReferenceDeleted<tools.vitruv.methodologisttemplate.model.model.Link, tools.vitruv.methodologisttemplate.model.model.Protocol>(incUtil, (tools.vitruv.methodologisttemplate.model.model.Link) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Protocol) notification.getOldValue(), "tools.vitruv.methodologisttemplate.model.model.Link_protocol_Protocol"), getSelf());
			incUtil.newMessage();
			name2actor.get("LinkToEntity_link_protocol_outgoing_SRC__FILTER_NAC_SRC_53_localSearch").tell(new ReferenceDeleted<tools.vitruv.methodologisttemplate.model.model.Link, tools.vitruv.methodologisttemplate.model.model.Protocol>(incUtil, (tools.vitruv.methodologisttemplate.model.model.Link) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Protocol) notification.getOldValue(), "tools.vitruv.methodologisttemplate.model.model.Link_protocol_Protocol"), getSelf());
			incUtil.newMessage();
			name2actor.get("LinkToEntity_link_protocol_outgoing_SRC__FILTER_NAC_SRC_53_localSearch").tell(new ReferenceDeleted<tools.vitruv.methodologisttemplate.model.model.Link, tools.vitruv.methodologisttemplate.model.model.Protocol>(incUtil, (tools.vitruv.methodologisttemplate.model.model.Link) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Protocol) notification.getOldValue(), "tools.vitruv.methodologisttemplate.model.model.Link_protocol_Protocol"), getSelf());
			incUtil.newMessage();
			name2actor.get("LinkToEntity__CONSISTENCY_63_localSearch").tell(new ReferenceDeleted<tools.vitruv.methodologisttemplate.model.model.Link, tools.vitruv.methodologisttemplate.model.model.Protocol>(incUtil, (tools.vitruv.methodologisttemplate.model.model.Link) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Protocol) notification.getOldValue(), "tools.vitruv.methodologisttemplate.model.model.Link_protocol_Protocol"), getSelf());
			incUtil.newMessage();
			name2actor.get("LinkToEntity__FWD_69_localSearch").tell(new ReferenceDeleted<tools.vitruv.methodologisttemplate.model.model.Link, tools.vitruv.methodologisttemplate.model.model.Protocol>(incUtil, (tools.vitruv.methodologisttemplate.model.model.Link) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Protocol) notification.getOldValue(), "tools.vitruv.methodologisttemplate.model.model.Link_protocol_Protocol"), getSelf());
		});
		feature2removeEdgeConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getProtocolToEntity__Marker_CREATE__CORR__ptoe(), notification -> {
			incUtil.newMessage();
			name2actor.get("ProtocolToEntity__CONSISTENCY_72_localSearch").tell(new ReferenceDeleted<Something2Else.ProtocolToEntity__Marker, Something2Else.ProtocolToEntity>(incUtil, (Something2Else.ProtocolToEntity__Marker) notification.getNotifier(), (Something2Else.ProtocolToEntity) notification.getOldValue(), "Something2Else.ProtocolToEntity__Marker_CREATE__CORR__ptoe_ProtocolToEntity"), getSelf());
		});
		feature2removeEdgeConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getComponentToEntity__Marker_CREATE__CORR__ctoe(), notification -> {
			incUtil.newMessage();
			name2actor.get("ComponentToEntity__CONSISTENCY_7_localSearch").tell(new ReferenceDeleted<Something2Else.ComponentToEntity__Marker, Something2Else.ComponentToEntity>(incUtil, (Something2Else.ComponentToEntity__Marker) notification.getNotifier(), (Something2Else.ComponentToEntity) notification.getOldValue(), "Something2Else.ComponentToEntity__Marker_CREATE__CORR__ctoe_ComponentToEntity"), getSelf());
		});
		feature2removeEdgeConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getLinkToEntity_Source(), notification -> {
			incUtil.newMessage();
			name2actor.get("LinkToEntityEmbedded__CONSISTENCY_25_localSearch").tell(new ReferenceDeleted<Something2Else.LinkToEntity, tools.vitruv.methodologisttemplate.model.model.Link>(incUtil, (Something2Else.LinkToEntity) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Link) notification.getOldValue(), "Something2Else.LinkToEntity_source_Link"), getSelf());
			incUtil.newMessage();
			name2actor.get("LinkToEntity__CONSISTENCY_63_localSearch").tell(new ReferenceDeleted<Something2Else.LinkToEntity, tools.vitruv.methodologisttemplate.model.model.Link>(incUtil, (Something2Else.LinkToEntity) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Link) notification.getOldValue(), "Something2Else.LinkToEntity_source_Link"), getSelf());
		});
		feature2removeEdgeConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getSystemRefdComponentToEntity__Marker_CREATE__SRC__comp(), notification -> {
			incUtil.newMessage();
			name2actor.get("SystemRefdComponentToEntity__CONSISTENCY_85_localSearch").tell(new ReferenceDeleted<Something2Else.SystemRefdComponentToEntity__Marker, tools.vitruv.methodologisttemplate.model.model.Component>(incUtil, (Something2Else.SystemRefdComponentToEntity__Marker) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Component) notification.getOldValue(), "Something2Else.SystemRefdComponentToEntity__Marker_CREATE__SRC__comp_Component"), getSelf());
		});
		feature2removeEdgeConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getLinkToEntityEmbedded__Marker_CONTEXT__SRC__protocol(), notification -> {
			incUtil.newMessage();
			name2actor.get("LinkToEntityEmbedded__CONSISTENCY_25_localSearch").tell(new ReferenceDeleted<Something2Else.LinkToEntityEmbedded__Marker, tools.vitruv.methodologisttemplate.model.model.Protocol>(incUtil, (Something2Else.LinkToEntityEmbedded__Marker) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Protocol) notification.getOldValue(), "Something2Else.LinkToEntityEmbedded__Marker_CONTEXT__SRC__protocol_Protocol"), getSelf());
		});
		feature2removeEdgeConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getLinkToEntityEmbedded__Marker_CONTEXT__TRG__protEntity(), notification -> {
			incUtil.newMessage();
			name2actor.get("LinkToEntityEmbedded__CONSISTENCY_25_localSearch").tell(new ReferenceDeleted<Something2Else.LinkToEntityEmbedded__Marker, tools.vitruv.methodologisttemplate.model.model2.Entity>(incUtil, (Something2Else.LinkToEntityEmbedded__Marker) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model2.Entity) notification.getOldValue(), "Something2Else.LinkToEntityEmbedded__Marker_CONTEXT__TRG__protEntity_Entity"), getSelf());
		});
		feature2removeEdgeConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getLinkToEntity__Marker_CONTEXT__SRC__protocol(), notification -> {
			incUtil.newMessage();
			name2actor.get("LinkToEntity__CONSISTENCY_63_localSearch").tell(new ReferenceDeleted<Something2Else.LinkToEntity__Marker, tools.vitruv.methodologisttemplate.model.model.Protocol>(incUtil, (Something2Else.LinkToEntity__Marker) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Protocol) notification.getOldValue(), "Something2Else.LinkToEntity__Marker_CONTEXT__SRC__protocol_Protocol"), getSelf());
		});
		feature2removeEdgeConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getLinkToEntityEmbedded__Marker_CREATE__SRC__link(), notification -> {
			incUtil.newMessage();
			name2actor.get("LinkToEntityEmbedded__CONSISTENCY_25_localSearch").tell(new ReferenceDeleted<Something2Else.LinkToEntityEmbedded__Marker, tools.vitruv.methodologisttemplate.model.model.Link>(incUtil, (Something2Else.LinkToEntityEmbedded__Marker) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Link) notification.getOldValue(), "Something2Else.LinkToEntityEmbedded__Marker_CREATE__SRC__link_Link"), getSelf());
		});
		feature2removeEdgeConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getLinkToEntityEmbedded__Marker_CONTEXT__SRC__component(), notification -> {
			incUtil.newMessage();
			name2actor.get("LinkToEntityEmbedded__CONSISTENCY_25_localSearch").tell(new ReferenceDeleted<Something2Else.LinkToEntityEmbedded__Marker, tools.vitruv.methodologisttemplate.model.model.Component>(incUtil, (Something2Else.LinkToEntityEmbedded__Marker) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Component) notification.getOldValue(), "Something2Else.LinkToEntityEmbedded__Marker_CONTEXT__SRC__component_Component"), getSelf());
		});
		feature2removeEdgeConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getProtocolToEntity__Marker_CONTEXT__TRG__root(), notification -> {
			incUtil.newMessage();
			name2actor.get("ProtocolToEntity__CONSISTENCY_72_localSearch").tell(new ReferenceDeleted<Something2Else.ProtocolToEntity__Marker, tools.vitruv.methodologisttemplate.model.model2.Root>(incUtil, (Something2Else.ProtocolToEntity__Marker) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model2.Root) notification.getOldValue(), "Something2Else.ProtocolToEntity__Marker_CONTEXT__TRG__root_Root"), getSelf());
		});
		feature2removeEdgeConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getProtocolToEntity__Marker_CONTEXT__SRC__system(), notification -> {
			incUtil.newMessage();
			name2actor.get("ProtocolToEntity__CONSISTENCY_72_localSearch").tell(new ReferenceDeleted<Something2Else.ProtocolToEntity__Marker, tools.vitruv.methodologisttemplate.model.model.System>(incUtil, (Something2Else.ProtocolToEntity__Marker) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.System) notification.getOldValue(), "Something2Else.ProtocolToEntity__Marker_CONTEXT__SRC__system_System"), getSelf());
		});
		feature2removeEdgeConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getLinkToEntityEmbedded__Marker_CREATE__TRG__linkEntity(), notification -> {
			incUtil.newMessage();
			name2actor.get("LinkToEntityEmbedded__CONSISTENCY_25_localSearch").tell(new ReferenceDeleted<Something2Else.LinkToEntityEmbedded__Marker, tools.vitruv.methodologisttemplate.model.model2.Entity>(incUtil, (Something2Else.LinkToEntityEmbedded__Marker) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model2.Entity) notification.getOldValue(), "Something2Else.LinkToEntityEmbedded__Marker_CREATE__TRG__linkEntity_Entity"), getSelf());
		});
		feature2removeEdgeConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getLinkToEntityEmbedded__Marker_CONTEXT__TRG__root(), notification -> {
			incUtil.newMessage();
			name2actor.get("LinkToEntityEmbedded__CONSISTENCY_25_localSearch").tell(new ReferenceDeleted<Something2Else.LinkToEntityEmbedded__Marker, tools.vitruv.methodologisttemplate.model.model2.Root>(incUtil, (Something2Else.LinkToEntityEmbedded__Marker) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model2.Root) notification.getOldValue(), "Something2Else.LinkToEntityEmbedded__Marker_CONTEXT__TRG__root_Root"), getSelf());
		});
		feature2removeEdgeConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getSystemRefdComponentToEntity__Marker_CREATE__CORR__ctoe(), notification -> {
			incUtil.newMessage();
			name2actor.get("SystemRefdComponentToEntity__CONSISTENCY_85_localSearch").tell(new ReferenceDeleted<Something2Else.SystemRefdComponentToEntity__Marker, Something2Else.ComponentToEntity>(incUtil, (Something2Else.SystemRefdComponentToEntity__Marker) notification.getNotifier(), (Something2Else.ComponentToEntity) notification.getOldValue(), "Something2Else.SystemRefdComponentToEntity__Marker_CREATE__CORR__ctoe_ComponentToEntity"), getSelf());
		});
		feature2removeEdgeConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getProtocolToEntity_Source(), notification -> {
			incUtil.newMessage();
			name2actor.get("LinkToEntityEmbedded__CONSISTENCY_25_localSearch").tell(new ReferenceDeleted<Something2Else.ProtocolToEntity, tools.vitruv.methodologisttemplate.model.model.Protocol>(incUtil, (Something2Else.ProtocolToEntity) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Protocol) notification.getOldValue(), "Something2Else.ProtocolToEntity_source_Protocol"), getSelf());
			incUtil.newMessage();
			name2actor.get("LinkToEntityEmbedded__FWD_39_localSearch").tell(new ReferenceDeleted<Something2Else.ProtocolToEntity, tools.vitruv.methodologisttemplate.model.model.Protocol>(incUtil, (Something2Else.ProtocolToEntity) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Protocol) notification.getOldValue(), "Something2Else.ProtocolToEntity_source_Protocol"), getSelf());
			incUtil.newMessage();
			name2actor.get("ProtocolToEntity__CONSISTENCY_72_localSearch").tell(new ReferenceDeleted<Something2Else.ProtocolToEntity, tools.vitruv.methodologisttemplate.model.model.Protocol>(incUtil, (Something2Else.ProtocolToEntity) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Protocol) notification.getOldValue(), "Something2Else.ProtocolToEntity_source_Protocol"), getSelf());
		});
		feature2removeEdgeConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getLinkToEntityEmbedded__Marker_CREATE__CORR__ltoe(), notification -> {
			incUtil.newMessage();
			name2actor.get("LinkToEntityEmbedded__CONSISTENCY_25_localSearch").tell(new ReferenceDeleted<Something2Else.LinkToEntityEmbedded__Marker, Something2Else.LinkToEntity>(incUtil, (Something2Else.LinkToEntityEmbedded__Marker) notification.getNotifier(), (Something2Else.LinkToEntity) notification.getOldValue(), "Something2Else.LinkToEntityEmbedded__Marker_CREATE__CORR__ltoe_LinkToEntity"), getSelf());
		});
		feature2removeEdgeConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getSystemToRoot__Marker_CREATE__SRC__system(), notification -> {
			incUtil.newMessage();
			name2actor.get("SystemToRoot__CONSISTENCY_98_localSearch").tell(new ReferenceDeleted<Something2Else.SystemToRoot__Marker, tools.vitruv.methodologisttemplate.model.model.System>(incUtil, (Something2Else.SystemToRoot__Marker) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.System) notification.getOldValue(), "Something2Else.SystemToRoot__Marker_CREATE__SRC__system_System"), getSelf());
		});
		feature2removeEdgeConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getSystemRefdComponentToEntity__Marker_CONTEXT__SRC__system(), notification -> {
			incUtil.newMessage();
			name2actor.get("SystemRefdComponentToEntity__CONSISTENCY_85_localSearch").tell(new ReferenceDeleted<Something2Else.SystemRefdComponentToEntity__Marker, tools.vitruv.methodologisttemplate.model.model.System>(incUtil, (Something2Else.SystemRefdComponentToEntity__Marker) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.System) notification.getOldValue(), "Something2Else.SystemRefdComponentToEntity__Marker_CONTEXT__SRC__system_System"), getSelf());
		});
		feature2removeEdgeConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getSystemRefdComponentToEntity__Marker_CONTEXT__TRG__root(), notification -> {
			incUtil.newMessage();
			name2actor.get("SystemRefdComponentToEntity__CONSISTENCY_85_localSearch").tell(new ReferenceDeleted<Something2Else.SystemRefdComponentToEntity__Marker, tools.vitruv.methodologisttemplate.model.model2.Root>(incUtil, (Something2Else.SystemRefdComponentToEntity__Marker) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model2.Root) notification.getOldValue(), "Something2Else.SystemRefdComponentToEntity__Marker_CONTEXT__TRG__root_Root"), getSelf());
		});
		feature2removeEdgeConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getLinkToEntityEmbedded__Marker_CONTEXT__TRG__compEntity(), notification -> {
			incUtil.newMessage();
			name2actor.get("LinkToEntityEmbedded__CONSISTENCY_25_localSearch").tell(new ReferenceDeleted<Something2Else.LinkToEntityEmbedded__Marker, tools.vitruv.methodologisttemplate.model.model2.Entity>(incUtil, (Something2Else.LinkToEntityEmbedded__Marker) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model2.Entity) notification.getOldValue(), "Something2Else.LinkToEntityEmbedded__Marker_CONTEXT__TRG__compEntity_Entity"), getSelf());
		});
		feature2removeEdgeConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getSystemToRoot_Target(), notification -> {
			incUtil.newMessage();
			name2actor.get("LinkToEntityEmbedded__CONSISTENCY_25_localSearch").tell(new ReferenceDeleted<Something2Else.SystemToRoot, tools.vitruv.methodologisttemplate.model.model2.Root>(incUtil, (Something2Else.SystemToRoot) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model2.Root) notification.getOldValue(), "Something2Else.SystemToRoot_target_Root"), getSelf());
			incUtil.newMessage();
			name2actor.get("LinkToEntityEmbedded__FWD_39_localSearch").tell(new ReferenceDeleted<Something2Else.SystemToRoot, tools.vitruv.methodologisttemplate.model.model2.Root>(incUtil, (Something2Else.SystemToRoot) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model2.Root) notification.getOldValue(), "Something2Else.SystemToRoot_target_Root"), getSelf());
			incUtil.newMessage();
			name2actor.get("ProtocolToEntity__CONSISTENCY_72_localSearch").tell(new ReferenceDeleted<Something2Else.SystemToRoot, tools.vitruv.methodologisttemplate.model.model2.Root>(incUtil, (Something2Else.SystemToRoot) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model2.Root) notification.getOldValue(), "Something2Else.SystemToRoot_target_Root"), getSelf());
			incUtil.newMessage();
			name2actor.get("ProtocolToEntity__FWD_80_localSearch").tell(new ReferenceDeleted<Something2Else.SystemToRoot, tools.vitruv.methodologisttemplate.model.model2.Root>(incUtil, (Something2Else.SystemToRoot) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model2.Root) notification.getOldValue(), "Something2Else.SystemToRoot_target_Root"), getSelf());
			incUtil.newMessage();
			name2actor.get("SystemRefdComponentToEntity__CONSISTENCY_85_localSearch").tell(new ReferenceDeleted<Something2Else.SystemToRoot, tools.vitruv.methodologisttemplate.model.model2.Root>(incUtil, (Something2Else.SystemToRoot) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model2.Root) notification.getOldValue(), "Something2Else.SystemToRoot_target_Root"), getSelf());
			incUtil.newMessage();
			name2actor.get("SystemRefdComponentToEntity__FWD_93_localSearch").tell(new ReferenceDeleted<Something2Else.SystemToRoot, tools.vitruv.methodologisttemplate.model.model2.Root>(incUtil, (Something2Else.SystemToRoot) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model2.Root) notification.getOldValue(), "Something2Else.SystemToRoot_target_Root"), getSelf());
			incUtil.newMessage();
			name2actor.get("SystemToRoot__CONSISTENCY_98_localSearch").tell(new ReferenceDeleted<Something2Else.SystemToRoot, tools.vitruv.methodologisttemplate.model.model2.Root>(incUtil, (Something2Else.SystemToRoot) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model2.Root) notification.getOldValue(), "Something2Else.SystemToRoot_target_Root"), getSelf());
		});
		feature2removeEdgeConsumer.put(tools.vitruv.methodologisttemplate.model.model.ModelPackage.eINSTANCE.getSystem_Components(), notification -> {
			incUtil.newMessage();
			name2actor.get("ComponentToEntity_comp_components_incoming_SRC__FILTER_NAC_SRC_1_localSearch").tell(new ReferenceDeleted<tools.vitruv.methodologisttemplate.model.model.System, tools.vitruv.methodologisttemplate.model.model.Component>(incUtil, (tools.vitruv.methodologisttemplate.model.model.System) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Component) notification.getOldValue(), "tools.vitruv.methodologisttemplate.model.model.System_components_Component"), getSelf());
			incUtil.newMessage();
			name2actor.get("LinkToEntityEmbedded__CONSISTENCY_25_localSearch").tell(new ReferenceDeleted<tools.vitruv.methodologisttemplate.model.model.System, tools.vitruv.methodologisttemplate.model.model.Component>(incUtil, (tools.vitruv.methodologisttemplate.model.model.System) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Component) notification.getOldValue(), "tools.vitruv.methodologisttemplate.model.model.System_components_Component"), getSelf());
			incUtil.newMessage();
			name2actor.get("LinkToEntityEmbedded__FWD_39_localSearch").tell(new ReferenceDeleted<tools.vitruv.methodologisttemplate.model.model.System, tools.vitruv.methodologisttemplate.model.model.Component>(incUtil, (tools.vitruv.methodologisttemplate.model.model.System) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Component) notification.getOldValue(), "tools.vitruv.methodologisttemplate.model.model.System_components_Component"), getSelf());
			incUtil.newMessage();
			name2actor.get("SystemRefdComponentToEntity__CONSISTENCY_85_localSearch").tell(new ReferenceDeleted<tools.vitruv.methodologisttemplate.model.model.System, tools.vitruv.methodologisttemplate.model.model.Component>(incUtil, (tools.vitruv.methodologisttemplate.model.model.System) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Component) notification.getOldValue(), "tools.vitruv.methodologisttemplate.model.model.System_components_Component"), getSelf());
			incUtil.newMessage();
			name2actor.get("SystemRefdComponentToEntity__FWD_93_localSearch").tell(new ReferenceDeleted<tools.vitruv.methodologisttemplate.model.model.System, tools.vitruv.methodologisttemplate.model.model.Component>(incUtil, (tools.vitruv.methodologisttemplate.model.model.System) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model.Component) notification.getOldValue(), "tools.vitruv.methodologisttemplate.model.model.System_components_Component"), getSelf());
		});
		feature2removeEdgeConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getProtocolToEntity_Target(), notification -> {
			incUtil.newMessage();
			name2actor.get("LinkToEntityEmbedded__CONSISTENCY_25_localSearch").tell(new ReferenceDeleted<Something2Else.ProtocolToEntity, tools.vitruv.methodologisttemplate.model.model2.Entity>(incUtil, (Something2Else.ProtocolToEntity) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model2.Entity) notification.getOldValue(), "Something2Else.ProtocolToEntity_target_Entity"), getSelf());
			incUtil.newMessage();
			name2actor.get("LinkToEntityEmbedded__FWD_39_localSearch").tell(new ReferenceDeleted<Something2Else.ProtocolToEntity, tools.vitruv.methodologisttemplate.model.model2.Entity>(incUtil, (Something2Else.ProtocolToEntity) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model2.Entity) notification.getOldValue(), "Something2Else.ProtocolToEntity_target_Entity"), getSelf());
			incUtil.newMessage();
			name2actor.get("ProtocolToEntity__CONSISTENCY_72_localSearch").tell(new ReferenceDeleted<Something2Else.ProtocolToEntity, tools.vitruv.methodologisttemplate.model.model2.Entity>(incUtil, (Something2Else.ProtocolToEntity) notification.getNotifier(), (tools.vitruv.methodologisttemplate.model.model2.Entity) notification.getOldValue(), "Something2Else.ProtocolToEntity_target_Entity"), getSelf());
		});
		feature2removeEdgeConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getProtocolToEntity__Marker_CONTEXT__CORR__stor(), notification -> {
			incUtil.newMessage();
			name2actor.get("ProtocolToEntity__CONSISTENCY_72_localSearch").tell(new ReferenceDeleted<Something2Else.ProtocolToEntity__Marker, Something2Else.SystemToRoot>(incUtil, (Something2Else.ProtocolToEntity__Marker) notification.getNotifier(), (Something2Else.SystemToRoot) notification.getOldValue(), "Something2Else.ProtocolToEntity__Marker_CONTEXT__CORR__stor_SystemToRoot"), getSelf());
		});
		feature2removeEdgeConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getLinkToEntityEmbedded__Marker_CONTEXT__CORR__ptoe(), notification -> {
			incUtil.newMessage();
			name2actor.get("LinkToEntityEmbedded__CONSISTENCY_25_localSearch").tell(new ReferenceDeleted<Something2Else.LinkToEntityEmbedded__Marker, Something2Else.ProtocolToEntity>(incUtil, (Something2Else.LinkToEntityEmbedded__Marker) notification.getNotifier(), (Something2Else.ProtocolToEntity) notification.getOldValue(), "Something2Else.LinkToEntityEmbedded__Marker_CONTEXT__CORR__ptoe_ProtocolToEntity"), getSelf());
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
		if (node instanceof Something2Else.ComponentToEntity) {
			incUtil.newMessage();
			name2actor.get("ComponentToEntity_object").tell(new ObjectDeleted<Something2Else.ComponentToEntity>(incUtil, (Something2Else.ComponentToEntity) node), getSelf());
		}
		if (node instanceof Something2Else.ComponentToEntity__Marker) {
			incUtil.newMessage();
			name2actor.get("ComponentToEntity__Marker_object").tell(new ObjectDeleted<Something2Else.ComponentToEntity__Marker>(incUtil, (Something2Else.ComponentToEntity__Marker) node), getSelf());
		}
		if (node instanceof Something2Else.LinkToEntity) {
			incUtil.newMessage();
			name2actor.get("LinkToEntity_object").tell(new ObjectDeleted<Something2Else.LinkToEntity>(incUtil, (Something2Else.LinkToEntity) node), getSelf());
		}
		if (node instanceof Something2Else.ProtocolToEntity) {
			incUtil.newMessage();
			name2actor.get("ProtocolToEntity_object").tell(new ObjectDeleted<Something2Else.ProtocolToEntity>(incUtil, (Something2Else.ProtocolToEntity) node), getSelf());
		}
		if (node instanceof Something2Else.LinkToEntityEmbedded__Marker) {
			incUtil.newMessage();
			name2actor.get("LinkToEntityEmbedded__Marker_object").tell(new ObjectDeleted<Something2Else.LinkToEntityEmbedded__Marker>(incUtil, (Something2Else.LinkToEntityEmbedded__Marker) node), getSelf());
		}
		if (node instanceof Something2Else.LinkToEntity__Marker) {
			incUtil.newMessage();
			name2actor.get("LinkToEntity__Marker_object").tell(new ObjectDeleted<Something2Else.LinkToEntity__Marker>(incUtil, (Something2Else.LinkToEntity__Marker) node), getSelf());
		}
		if (node instanceof Something2Else.ProtocolToEntity__Marker) {
			incUtil.newMessage();
			name2actor.get("ProtocolToEntity__Marker_object").tell(new ObjectDeleted<Something2Else.ProtocolToEntity__Marker>(incUtil, (Something2Else.ProtocolToEntity__Marker) node), getSelf());
		}
		if (node instanceof Something2Else.SystemRefdComponentToEntity__Marker) {
			incUtil.newMessage();
			name2actor.get("SystemRefdComponentToEntity__Marker_object").tell(new ObjectDeleted<Something2Else.SystemRefdComponentToEntity__Marker>(incUtil, (Something2Else.SystemRefdComponentToEntity__Marker) node), getSelf());
		}
		if (node instanceof Something2Else.SystemToRoot__Marker) {
			incUtil.newMessage();
			name2actor.get("SystemToRoot__Marker_object").tell(new ObjectDeleted<Something2Else.SystemToRoot__Marker>(incUtil, (Something2Else.SystemToRoot__Marker) node), getSelf());
		}
		if (node instanceof Something2Else.SystemToRoot) {
			incUtil.newMessage();
			name2actor.get("SystemToRoot_object_SP0").tell(new ObjectDeleted<Something2Else.SystemToRoot>(incUtil, (Something2Else.SystemToRoot) node), getSelf());
		}
		if (node instanceof Something2Else.SystemToRoot) {
			incUtil.newMessage();
			name2actor.get("SystemToRoot_object_SP1").tell(new ObjectDeleted<Something2Else.SystemToRoot>(incUtil, (Something2Else.SystemToRoot) node), getSelf());
		}
		if (node instanceof tools.vitruv.methodologisttemplate.model.model.Component) {
			incUtil.newMessage();
			name2actor.get("Component_object_SP0").tell(new ObjectDeleted<tools.vitruv.methodologisttemplate.model.model.Component>(incUtil, (tools.vitruv.methodologisttemplate.model.model.Component) node), getSelf());
		}
		if (node instanceof tools.vitruv.methodologisttemplate.model.model.Component) {
			incUtil.newMessage();
			name2actor.get("Component_object_SP1").tell(new ObjectDeleted<tools.vitruv.methodologisttemplate.model.model.Component>(incUtil, (tools.vitruv.methodologisttemplate.model.model.Component) node), getSelf());
		}
		if (node instanceof tools.vitruv.methodologisttemplate.model.model.Component) {
			incUtil.newMessage();
			name2actor.get("Component_object_SP2").tell(new ObjectDeleted<tools.vitruv.methodologisttemplate.model.model.Component>(incUtil, (tools.vitruv.methodologisttemplate.model.model.Component) node), getSelf());
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
		if (node instanceof tools.vitruv.methodologisttemplate.model.model.Link) {
			incUtil.newMessage();
			name2actor.get("Link_object_SP2").tell(new ObjectDeleted<tools.vitruv.methodologisttemplate.model.model.Link>(incUtil, (tools.vitruv.methodologisttemplate.model.model.Link) node), getSelf());
		}
		if (node instanceof tools.vitruv.methodologisttemplate.model.model.Protocol) {
			incUtil.newMessage();
			name2actor.get("Protocol_object_SP0").tell(new ObjectDeleted<tools.vitruv.methodologisttemplate.model.model.Protocol>(incUtil, (tools.vitruv.methodologisttemplate.model.model.Protocol) node), getSelf());
		}
		if (node instanceof tools.vitruv.methodologisttemplate.model.model.Protocol) {
			incUtil.newMessage();
			name2actor.get("Protocol_object_SP1").tell(new ObjectDeleted<tools.vitruv.methodologisttemplate.model.model.Protocol>(incUtil, (tools.vitruv.methodologisttemplate.model.model.Protocol) node), getSelf());
		}
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
		if (node instanceof tools.vitruv.methodologisttemplate.model.model2.Root) {
			incUtil.newMessage();
			name2actor.get("Root_object_SP2").tell(new ObjectDeleted<tools.vitruv.methodologisttemplate.model.model2.Root>(incUtil, (tools.vitruv.methodologisttemplate.model.model2.Root) node), getSelf());
		}
	}
}

