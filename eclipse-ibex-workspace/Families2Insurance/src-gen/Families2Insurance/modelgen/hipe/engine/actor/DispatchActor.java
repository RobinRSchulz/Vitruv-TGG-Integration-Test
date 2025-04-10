package Families2Insurance.modelgen.hipe.engine.actor;

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
		type2addConsumer.put(edu.kit.ipd.sdq.metamodels.families.FamiliesPackage.eINSTANCE.getFamilyRegister(), obj -> {
			edu.kit.ipd.sdq.metamodels.families.FamilyRegister _familyregister = (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) obj;
			incUtil.newMessage();
			name2actor.get("FamilyRegister_object_SP0").tell(new ObjectAdded<edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil, _familyregister), getSelf());
			incUtil.newMessage();
			name2actor.get("FamilyRegister_object_SP1").tell(new ObjectAdded<edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil, _familyregister), getSelf());
		});
		type2addConsumer.put(edu.kit.ipd.sdq.metamodels.families.FamiliesPackage.eINSTANCE.getFamily(), obj -> {
			edu.kit.ipd.sdq.metamodels.families.Family _family = (edu.kit.ipd.sdq.metamodels.families.Family) obj;
			incUtil.newMessage();
			name2actor.get("Family_object").tell(new ObjectAdded<edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, _family), getSelf());
		});
		type2addConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getFamilyRegisterToInsuranceDatabase(), obj -> {
			Something2Else.FamilyRegisterToInsuranceDatabase _familyregistertoinsurancedatabase = (Something2Else.FamilyRegisterToInsuranceDatabase) obj;
			incUtil.newMessage();
			name2actor.get("FamilyRegisterToInsuranceDatabase_object_SP0").tell(new ObjectAdded<Something2Else.FamilyRegisterToInsuranceDatabase>(incUtil, _familyregistertoinsurancedatabase), getSelf());
			incUtil.newMessage();
			name2actor.get("FamilyRegisterToInsuranceDatabase_object_SP1").tell(new ObjectAdded<Something2Else.FamilyRegisterToInsuranceDatabase>(incUtil, _familyregistertoinsurancedatabase), getSelf());
		});
		type2addConsumer.put(edu.kit.ipd.sdq.metamodels.insurance.InsurancePackage.eINSTANCE.getInsuranceDatabase(), obj -> {
			edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase _insurancedatabase = (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) obj;
			incUtil.newMessage();
			name2actor.get("InsuranceDatabase_object_SP0").tell(new ObjectAdded<edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil, _insurancedatabase), getSelf());
			incUtil.newMessage();
			name2actor.get("InsuranceDatabase_object_SP1").tell(new ObjectAdded<edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil, _insurancedatabase), getSelf());
		});
	}
	
	private void initializeSet() {
	}
	
	private void initializeAddEdge() {
		feature2addEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getFamilyRegisterToInsuranceDatabase_Target(), notification -> {
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__GEN_1_localSearch").tell(new ReferenceAdded<Something2Else.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil,(Something2Else.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNewValue(), "Something2Else.FamilyRegisterToInsuranceDatabase_target_InsuranceDatabase"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__GEN_6_localSearch").tell(new ReferenceAdded<Something2Else.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil,(Something2Else.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNewValue(), "Something2Else.FamilyRegisterToInsuranceDatabase_target_InsuranceDatabase"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__GEN_10_localSearch").tell(new ReferenceAdded<Something2Else.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil,(Something2Else.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNewValue(), "Something2Else.FamilyRegisterToInsuranceDatabase_target_InsuranceDatabase"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__GEN_15_localSearch").tell(new ReferenceAdded<Something2Else.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil,(Something2Else.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNewValue(), "Something2Else.FamilyRegisterToInsuranceDatabase_target_InsuranceDatabase"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__GEN_19_localSearch").tell(new ReferenceAdded<Something2Else.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil,(Something2Else.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNewValue(), "Something2Else.FamilyRegisterToInsuranceDatabase_target_InsuranceDatabase"), getSelf());
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__GEN_24_localSearch").tell(new ReferenceAdded<Something2Else.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil,(Something2Else.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNewValue(), "Something2Else.FamilyRegisterToInsuranceDatabase_target_InsuranceDatabase"), getSelf());
		});
		feature2addEdgeConsumer.put(edu.kit.ipd.sdq.metamodels.families.FamiliesPackage.eINSTANCE.getFamilyRegister_Families(), notification -> {
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__GEN_1_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.FamilyRegister, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil,(edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.FamilyRegister_families_Family"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__GEN_10_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.FamilyRegister, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil,(edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.FamilyRegister_families_Family"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__GEN_19_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.FamilyRegister, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil,(edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.FamilyRegister_families_Family"), getSelf());
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__GEN_24_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.FamilyRegister, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil,(edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.FamilyRegister_families_Family"), getSelf());
		});
		feature2addEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getFamilyRegisterToInsuranceDatabase_Source(), notification -> {
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__GEN_1_localSearch").tell(new ReferenceAdded<Something2Else.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil,(Something2Else.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNewValue(), "Something2Else.FamilyRegisterToInsuranceDatabase_source_FamilyRegister"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__GEN_6_localSearch").tell(new ReferenceAdded<Something2Else.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil,(Something2Else.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNewValue(), "Something2Else.FamilyRegisterToInsuranceDatabase_source_FamilyRegister"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__GEN_10_localSearch").tell(new ReferenceAdded<Something2Else.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil,(Something2Else.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNewValue(), "Something2Else.FamilyRegisterToInsuranceDatabase_source_FamilyRegister"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__GEN_15_localSearch").tell(new ReferenceAdded<Something2Else.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil,(Something2Else.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNewValue(), "Something2Else.FamilyRegisterToInsuranceDatabase_source_FamilyRegister"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__GEN_19_localSearch").tell(new ReferenceAdded<Something2Else.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil,(Something2Else.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNewValue(), "Something2Else.FamilyRegisterToInsuranceDatabase_source_FamilyRegister"), getSelf());
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__GEN_24_localSearch").tell(new ReferenceAdded<Something2Else.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil,(Something2Else.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNewValue(), "Something2Else.FamilyRegisterToInsuranceDatabase_source_FamilyRegister"), getSelf());
		});
	}
	
	private void initializeRemoveEdge() {
		feature2removeEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getFamilyRegisterToInsuranceDatabase_Target(), notification -> {
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__GEN_1_localSearch").tell(new ReferenceDeleted<Something2Else.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil, (Something2Else.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getOldValue(), "Something2Else.FamilyRegisterToInsuranceDatabase_target_InsuranceDatabase"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__GEN_6_localSearch").tell(new ReferenceDeleted<Something2Else.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil, (Something2Else.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getOldValue(), "Something2Else.FamilyRegisterToInsuranceDatabase_target_InsuranceDatabase"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__GEN_10_localSearch").tell(new ReferenceDeleted<Something2Else.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil, (Something2Else.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getOldValue(), "Something2Else.FamilyRegisterToInsuranceDatabase_target_InsuranceDatabase"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__GEN_15_localSearch").tell(new ReferenceDeleted<Something2Else.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil, (Something2Else.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getOldValue(), "Something2Else.FamilyRegisterToInsuranceDatabase_target_InsuranceDatabase"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__GEN_19_localSearch").tell(new ReferenceDeleted<Something2Else.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil, (Something2Else.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getOldValue(), "Something2Else.FamilyRegisterToInsuranceDatabase_target_InsuranceDatabase"), getSelf());
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__GEN_24_localSearch").tell(new ReferenceDeleted<Something2Else.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil, (Something2Else.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getOldValue(), "Something2Else.FamilyRegisterToInsuranceDatabase_target_InsuranceDatabase"), getSelf());
		});
		feature2removeEdgeConsumer.put(edu.kit.ipd.sdq.metamodels.families.FamiliesPackage.eINSTANCE.getFamilyRegister_Families(), notification -> {
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__GEN_1_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.FamilyRegister, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.FamilyRegister_families_Family"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__GEN_10_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.FamilyRegister, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.FamilyRegister_families_Family"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__GEN_19_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.FamilyRegister, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.FamilyRegister_families_Family"), getSelf());
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__GEN_24_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.FamilyRegister, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.FamilyRegister_families_Family"), getSelf());
		});
		feature2removeEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getFamilyRegisterToInsuranceDatabase_Source(), notification -> {
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__GEN_1_localSearch").tell(new ReferenceDeleted<Something2Else.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil, (Something2Else.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getOldValue(), "Something2Else.FamilyRegisterToInsuranceDatabase_source_FamilyRegister"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__GEN_6_localSearch").tell(new ReferenceDeleted<Something2Else.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil, (Something2Else.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getOldValue(), "Something2Else.FamilyRegisterToInsuranceDatabase_source_FamilyRegister"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__GEN_10_localSearch").tell(new ReferenceDeleted<Something2Else.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil, (Something2Else.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getOldValue(), "Something2Else.FamilyRegisterToInsuranceDatabase_source_FamilyRegister"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__GEN_15_localSearch").tell(new ReferenceDeleted<Something2Else.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil, (Something2Else.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getOldValue(), "Something2Else.FamilyRegisterToInsuranceDatabase_source_FamilyRegister"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__GEN_19_localSearch").tell(new ReferenceDeleted<Something2Else.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil, (Something2Else.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getOldValue(), "Something2Else.FamilyRegisterToInsuranceDatabase_source_FamilyRegister"), getSelf());
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__GEN_24_localSearch").tell(new ReferenceDeleted<Something2Else.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil, (Something2Else.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getOldValue(), "Something2Else.FamilyRegisterToInsuranceDatabase_source_FamilyRegister"), getSelf());
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
		if (node instanceof Something2Else.FamilyRegisterToInsuranceDatabase) {
			incUtil.newMessage();
			name2actor.get("FamilyRegisterToInsuranceDatabase_object_SP0").tell(new ObjectDeleted<Something2Else.FamilyRegisterToInsuranceDatabase>(incUtil, (Something2Else.FamilyRegisterToInsuranceDatabase) node), getSelf());
		}
		if (node instanceof Something2Else.FamilyRegisterToInsuranceDatabase) {
			incUtil.newMessage();
			name2actor.get("FamilyRegisterToInsuranceDatabase_object_SP1").tell(new ObjectDeleted<Something2Else.FamilyRegisterToInsuranceDatabase>(incUtil, (Something2Else.FamilyRegisterToInsuranceDatabase) node), getSelf());
		}
		if (node instanceof edu.kit.ipd.sdq.metamodels.families.Family) {
			incUtil.newMessage();
			name2actor.get("Family_object").tell(new ObjectDeleted<edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) node), getSelf());
		}
		if (node instanceof edu.kit.ipd.sdq.metamodels.families.FamilyRegister) {
			incUtil.newMessage();
			name2actor.get("FamilyRegister_object_SP0").tell(new ObjectDeleted<edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil, (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) node), getSelf());
		}
		if (node instanceof edu.kit.ipd.sdq.metamodels.families.FamilyRegister) {
			incUtil.newMessage();
			name2actor.get("FamilyRegister_object_SP1").tell(new ObjectDeleted<edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil, (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) node), getSelf());
		}
		if (node instanceof edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) {
			incUtil.newMessage();
			name2actor.get("InsuranceDatabase_object_SP0").tell(new ObjectDeleted<edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil, (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) node), getSelf());
		}
		if (node instanceof edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) {
			incUtil.newMessage();
			name2actor.get("InsuranceDatabase_object_SP1").tell(new ObjectDeleted<edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil, (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) node), getSelf());
		}
	}
}

