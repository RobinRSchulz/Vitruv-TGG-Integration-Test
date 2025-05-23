package HospitalTransformRules.hipe.engine.actor;

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
		type2addConsumer.put(HospitalExample.HospitalExamplePackage.eINSTANCE.getPatient(), obj -> {
			HospitalExample.Patient _patient = (HospitalExample.Patient) obj;
			incUtil.newMessage();
			name2actor.get("Patient_object_SP0").tell(new ObjectAdded<HospitalExample.Patient>(incUtil, _patient), getSelf());
			incUtil.newMessage();
			name2actor.get("Patient_object_SP1").tell(new ObjectAdded<HospitalExample.Patient>(incUtil, _patient), getSelf());
		});
		type2addConsumer.put(HospitalExample.HospitalExamplePackage.eINSTANCE.getReception(), obj -> {
			HospitalExample.Reception _reception = (HospitalExample.Reception) obj;
			incUtil.newMessage();
			name2actor.get("Reception_object_SP0").tell(new ObjectAdded<HospitalExample.Reception>(incUtil, _reception), getSelf());
			incUtil.newMessage();
			name2actor.get("Reception_object_SP1").tell(new ObjectAdded<HospitalExample.Reception>(incUtil, _reception), getSelf());
		});
		type2addConsumer.put(HospitalExample.HospitalExamplePackage.eINSTANCE.getHospital(), obj -> {
			HospitalExample.Hospital _hospital = (HospitalExample.Hospital) obj;
			incUtil.newMessage();
			name2actor.get("Hospital_object_SP0").tell(new ObjectAdded<HospitalExample.Hospital>(incUtil, _hospital), getSelf());
			incUtil.newMessage();
			name2actor.get("Hospital_object_SP1").tell(new ObjectAdded<HospitalExample.Hospital>(incUtil, _hospital), getSelf());
		});
		type2addConsumer.put(HospitalExample.HospitalExamplePackage.eINSTANCE.getRoom(), obj -> {
			HospitalExample.Room _room = (HospitalExample.Room) obj;
			incUtil.newMessage();
			name2actor.get("Room_object_SP0").tell(new ObjectAdded<HospitalExample.Room>(incUtil, _room), getSelf());
			incUtil.newMessage();
			name2actor.get("Room_object_SP1").tell(new ObjectAdded<HospitalExample.Room>(incUtil, _room), getSelf());
		});
		type2addConsumer.put(HospitalExample.HospitalExamplePackage.eINSTANCE.getNurse(), obj -> {
			HospitalExample.Nurse _nurse = (HospitalExample.Nurse) obj;
			incUtil.newMessage();
			name2actor.get("Nurse_object").tell(new ObjectAdded<HospitalExample.Nurse>(incUtil, _nurse), getSelf());
		});
		type2addConsumer.put(HospitalExample.HospitalExamplePackage.eINSTANCE.getDepartment(), obj -> {
			HospitalExample.Department _department = (HospitalExample.Department) obj;
			incUtil.newMessage();
			name2actor.get("Department_object_SP0").tell(new ObjectAdded<HospitalExample.Department>(incUtil, _department), getSelf());
			incUtil.newMessage();
			name2actor.get("Department_object_SP1").tell(new ObjectAdded<HospitalExample.Department>(incUtil, _department), getSelf());
		});
		type2addConsumer.put(HospitalExample.HospitalExamplePackage.eINSTANCE.getDoctor(), obj -> {
			HospitalExample.Doctor _doctor = (HospitalExample.Doctor) obj;
			incUtil.newMessage();
			name2actor.get("Doctor_object_SP0").tell(new ObjectAdded<HospitalExample.Doctor>(incUtil, _doctor), getSelf());
			incUtil.newMessage();
			name2actor.get("Doctor_object_SP1").tell(new ObjectAdded<HospitalExample.Doctor>(incUtil, _doctor), getSelf());
		});
	}
	
	private void initializeSet() {
		feature2setConsumer.put(HospitalExample.HospitalExamplePackage.eINSTANCE.getDoctor_PatientCapacity(), notification -> {
			if(notification.getNotifier() instanceof HospitalExample.Doctor) {
				incUtil.newMessage();
				name2actor.get("Doctor_object_SP0").tell(new AttributeChanged<HospitalExample.Doctor>(incUtil, (HospitalExample.Doctor) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof HospitalExample.Doctor) {
				incUtil.newMessage();
				name2actor.get("Doctor_object_SP1").tell(new AttributeChanged<HospitalExample.Doctor>(incUtil, (HospitalExample.Doctor) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
		});
		
		feature2setConsumer.put(HospitalExample.HospitalExamplePackage.eINSTANCE.getRoom_Capacity(), notification -> {
			if(notification.getNotifier() instanceof HospitalExample.Room) {
				incUtil.newMessage();
				name2actor.get("Room_object_SP0").tell(new AttributeChanged<HospitalExample.Room>(incUtil, (HospitalExample.Room) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof HospitalExample.Room) {
				incUtil.newMessage();
				name2actor.get("Room_object_SP1").tell(new AttributeChanged<HospitalExample.Room>(incUtil, (HospitalExample.Room) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
		});
		
		feature2setConsumer.put(HospitalExample.HospitalExamplePackage.eINSTANCE.getDepartment_MaxRoomCount(), notification -> {
			if(notification.getNotifier() instanceof HospitalExample.Department) {
				incUtil.newMessage();
				name2actor.get("Department_object_SP0").tell(new AttributeChanged<HospitalExample.Department>(incUtil, (HospitalExample.Department) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof HospitalExample.Department) {
				incUtil.newMessage();
				name2actor.get("Department_object_SP1").tell(new AttributeChanged<HospitalExample.Department>(incUtil, (HospitalExample.Department) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
		});
		
	}
	
	private void initializeAddEdge() {
		feature2addEdgeConsumer.put(HospitalExample.HospitalExamplePackage.eINSTANCE.getNurse_Responsible(), notification -> {
			incUtil.newMessage();
			name2actor.get("Nurse_responsible_0_reference").tell(new ReferenceAdded<HospitalExample.Nurse, HospitalExample.Room>(incUtil,(HospitalExample.Nurse) notification.getNotifier(), (HospitalExample.Room) notification.getNewValue(), "HospitalExample.Nurse_responsible_Room"), getSelf());
		});
		feature2addEdgeConsumer.put(HospitalExample.HospitalExamplePackage.eINSTANCE.getRoom_Lies(), notification -> {
			incUtil.newMessage();
			name2actor.get("Room_lies_0_reference").tell(new ReferenceAdded<HospitalExample.Room, HospitalExample.Patient>(incUtil,(HospitalExample.Room) notification.getNotifier(), (HospitalExample.Patient) notification.getNewValue(), "HospitalExample.Room_lies_Patient"), getSelf());
		});
		feature2addEdgeConsumer.put(HospitalExample.HospitalExamplePackage.eINSTANCE.getDepartment_Staff(), notification -> {
			incUtil.newMessage();
			name2actor.get("Department_staff_0_reference").tell(new ReferenceAdded<HospitalExample.Department, HospitalExample.Staff>(incUtil,(HospitalExample.Department) notification.getNotifier(), (HospitalExample.Staff) notification.getNewValue(), "HospitalExample.Department_staff_Staff"), getSelf());
		});
		feature2addEdgeConsumer.put(HospitalExample.HospitalExamplePackage.eINSTANCE.getReception_Waits(), notification -> {
			incUtil.newMessage();
			name2actor.get("Reception_waits_0_reference").tell(new ReferenceAdded<HospitalExample.Reception, HospitalExample.Patient>(incUtil,(HospitalExample.Reception) notification.getNotifier(), (HospitalExample.Patient) notification.getNewValue(), "HospitalExample.Reception_waits_Patient"), getSelf());
		});
		feature2addEdgeConsumer.put(HospitalExample.HospitalExamplePackage.eINSTANCE.getDoctor_Caresfor(), notification -> {
			incUtil.newMessage();
			name2actor.get("Doctor_caresfor_0_reference").tell(new ReferenceAdded<HospitalExample.Doctor, HospitalExample.Patient>(incUtil,(HospitalExample.Doctor) notification.getNotifier(), (HospitalExample.Patient) notification.getNewValue(), "HospitalExample.Doctor_caresfor_Patient"), getSelf());
		});
		feature2addEdgeConsumer.put(HospitalExample.HospitalExamplePackage.eINSTANCE.getHospital_Reception(), notification -> {
			incUtil.newMessage();
			name2actor.get("Hospital_reception_0_reference").tell(new ReferenceAdded<HospitalExample.Hospital, HospitalExample.Reception>(incUtil,(HospitalExample.Hospital) notification.getNotifier(), (HospitalExample.Reception) notification.getNewValue(), "HospitalExample.Hospital_reception_Reception"), getSelf());
		});
		feature2addEdgeConsumer.put(HospitalExample.HospitalExamplePackage.eINSTANCE.getDepartment_Rooms(), notification -> {
			incUtil.newMessage();
			name2actor.get("Department_rooms_0_reference").tell(new ReferenceAdded<HospitalExample.Department, HospitalExample.Room>(incUtil,(HospitalExample.Department) notification.getNotifier(), (HospitalExample.Room) notification.getNewValue(), "HospitalExample.Department_rooms_Room"), getSelf());
			incUtil.newMessage();
			name2actor.get("Department_rooms_1_reference").tell(new ReferenceAdded<HospitalExample.Department, HospitalExample.Room>(incUtil,(HospitalExample.Department) notification.getNotifier(), (HospitalExample.Room) notification.getNewValue(), "HospitalExample.Department_rooms_Room"), getSelf());
		});
		feature2addEdgeConsumer.put(HospitalExample.HospitalExamplePackage.eINSTANCE.getPatient_Doctor(), notification -> {
			incUtil.newMessage();
			name2actor.get("Patient_doctor_0_reference").tell(new ReferenceAdded<HospitalExample.Patient, HospitalExample.Doctor>(incUtil,(HospitalExample.Patient) notification.getNotifier(), (HospitalExample.Doctor) notification.getNewValue(), "HospitalExample.Patient_doctor_Doctor"), getSelf());
		});
		feature2addEdgeConsumer.put(HospitalExample.HospitalExamplePackage.eINSTANCE.getHospital_Department(), notification -> {
			incUtil.newMessage();
			name2actor.get("Hospital_department_0_reference").tell(new ReferenceAdded<HospitalExample.Hospital, HospitalExample.Department>(incUtil,(HospitalExample.Hospital) notification.getNotifier(), (HospitalExample.Department) notification.getNewValue(), "HospitalExample.Hospital_department_Department"), getSelf());
			incUtil.newMessage();
			name2actor.get("Hospital_department_1_reference").tell(new ReferenceAdded<HospitalExample.Hospital, HospitalExample.Department>(incUtil,(HospitalExample.Hospital) notification.getNotifier(), (HospitalExample.Department) notification.getNewValue(), "HospitalExample.Hospital_department_Department"), getSelf());
		});
	}
	
	private void initializeRemoveEdge() {
		feature2removeEdgeConsumer.put(HospitalExample.HospitalExamplePackage.eINSTANCE.getNurse_Responsible(), notification -> {
			incUtil.newMessage();
			name2actor.get("Nurse_responsible_0_reference").tell(new ReferenceDeleted<HospitalExample.Nurse, HospitalExample.Room>(incUtil, (HospitalExample.Nurse) notification.getNotifier(), (HospitalExample.Room) notification.getOldValue(), "HospitalExample.Nurse_responsible_Room"), getSelf());
		});
		feature2removeEdgeConsumer.put(HospitalExample.HospitalExamplePackage.eINSTANCE.getRoom_Lies(), notification -> {
			incUtil.newMessage();
			name2actor.get("Room_lies_0_reference").tell(new ReferenceDeleted<HospitalExample.Room, HospitalExample.Patient>(incUtil, (HospitalExample.Room) notification.getNotifier(), (HospitalExample.Patient) notification.getOldValue(), "HospitalExample.Room_lies_Patient"), getSelf());
		});
		feature2removeEdgeConsumer.put(HospitalExample.HospitalExamplePackage.eINSTANCE.getDepartment_Staff(), notification -> {
			incUtil.newMessage();
			name2actor.get("Department_staff_0_reference").tell(new ReferenceDeleted<HospitalExample.Department, HospitalExample.Staff>(incUtil, (HospitalExample.Department) notification.getNotifier(), (HospitalExample.Staff) notification.getOldValue(), "HospitalExample.Department_staff_Staff"), getSelf());
		});
		feature2removeEdgeConsumer.put(HospitalExample.HospitalExamplePackage.eINSTANCE.getReception_Waits(), notification -> {
			incUtil.newMessage();
			name2actor.get("Reception_waits_0_reference").tell(new ReferenceDeleted<HospitalExample.Reception, HospitalExample.Patient>(incUtil, (HospitalExample.Reception) notification.getNotifier(), (HospitalExample.Patient) notification.getOldValue(), "HospitalExample.Reception_waits_Patient"), getSelf());
		});
		feature2removeEdgeConsumer.put(HospitalExample.HospitalExamplePackage.eINSTANCE.getDoctor_Caresfor(), notification -> {
			incUtil.newMessage();
			name2actor.get("Doctor_caresfor_0_reference").tell(new ReferenceDeleted<HospitalExample.Doctor, HospitalExample.Patient>(incUtil, (HospitalExample.Doctor) notification.getNotifier(), (HospitalExample.Patient) notification.getOldValue(), "HospitalExample.Doctor_caresfor_Patient"), getSelf());
		});
		feature2removeEdgeConsumer.put(HospitalExample.HospitalExamplePackage.eINSTANCE.getHospital_Reception(), notification -> {
			incUtil.newMessage();
			name2actor.get("Hospital_reception_0_reference").tell(new ReferenceDeleted<HospitalExample.Hospital, HospitalExample.Reception>(incUtil, (HospitalExample.Hospital) notification.getNotifier(), (HospitalExample.Reception) notification.getOldValue(), "HospitalExample.Hospital_reception_Reception"), getSelf());
		});
		feature2removeEdgeConsumer.put(HospitalExample.HospitalExamplePackage.eINSTANCE.getDepartment_Rooms(), notification -> {
			incUtil.newMessage();
			name2actor.get("Department_rooms_0_reference").tell(new ReferenceDeleted<HospitalExample.Department, HospitalExample.Room>(incUtil, (HospitalExample.Department) notification.getNotifier(), (HospitalExample.Room) notification.getOldValue(), "HospitalExample.Department_rooms_Room"), getSelf());
			incUtil.newMessage();
			name2actor.get("Department_rooms_1_reference").tell(new ReferenceDeleted<HospitalExample.Department, HospitalExample.Room>(incUtil, (HospitalExample.Department) notification.getNotifier(), (HospitalExample.Room) notification.getOldValue(), "HospitalExample.Department_rooms_Room"), getSelf());
		});
		feature2removeEdgeConsumer.put(HospitalExample.HospitalExamplePackage.eINSTANCE.getPatient_Doctor(), notification -> {
			incUtil.newMessage();
			name2actor.get("Patient_doctor_0_reference").tell(new ReferenceDeleted<HospitalExample.Patient, HospitalExample.Doctor>(incUtil, (HospitalExample.Patient) notification.getNotifier(), (HospitalExample.Doctor) notification.getOldValue(), "HospitalExample.Patient_doctor_Doctor"), getSelf());
		});
		feature2removeEdgeConsumer.put(HospitalExample.HospitalExamplePackage.eINSTANCE.getHospital_Department(), notification -> {
			incUtil.newMessage();
			name2actor.get("Hospital_department_0_reference").tell(new ReferenceDeleted<HospitalExample.Hospital, HospitalExample.Department>(incUtil, (HospitalExample.Hospital) notification.getNotifier(), (HospitalExample.Department) notification.getOldValue(), "HospitalExample.Hospital_department_Department"), getSelf());
			incUtil.newMessage();
			name2actor.get("Hospital_department_1_reference").tell(new ReferenceDeleted<HospitalExample.Hospital, HospitalExample.Department>(incUtil, (HospitalExample.Hospital) notification.getNotifier(), (HospitalExample.Department) notification.getOldValue(), "HospitalExample.Hospital_department_Department"), getSelf());
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
		if (node instanceof HospitalExample.Nurse) {
			incUtil.newMessage();
			name2actor.get("Nurse_object").tell(new ObjectDeleted<HospitalExample.Nurse>(incUtil, (HospitalExample.Nurse) node), getSelf());
		}
		if (node instanceof HospitalExample.Hospital) {
			incUtil.newMessage();
			name2actor.get("Hospital_object_SP0").tell(new ObjectDeleted<HospitalExample.Hospital>(incUtil, (HospitalExample.Hospital) node), getSelf());
		}
		if (node instanceof HospitalExample.Hospital) {
			incUtil.newMessage();
			name2actor.get("Hospital_object_SP1").tell(new ObjectDeleted<HospitalExample.Hospital>(incUtil, (HospitalExample.Hospital) node), getSelf());
		}
		if (node instanceof HospitalExample.Department) {
			incUtil.newMessage();
			name2actor.get("Department_object_SP0").tell(new ObjectDeleted<HospitalExample.Department>(incUtil, (HospitalExample.Department) node), getSelf());
		}
		if (node instanceof HospitalExample.Department) {
			incUtil.newMessage();
			name2actor.get("Department_object_SP1").tell(new ObjectDeleted<HospitalExample.Department>(incUtil, (HospitalExample.Department) node), getSelf());
		}
		if (node instanceof HospitalExample.Room) {
			incUtil.newMessage();
			name2actor.get("Room_object_SP0").tell(new ObjectDeleted<HospitalExample.Room>(incUtil, (HospitalExample.Room) node), getSelf());
		}
		if (node instanceof HospitalExample.Room) {
			incUtil.newMessage();
			name2actor.get("Room_object_SP1").tell(new ObjectDeleted<HospitalExample.Room>(incUtil, (HospitalExample.Room) node), getSelf());
		}
		if (node instanceof HospitalExample.Doctor) {
			incUtil.newMessage();
			name2actor.get("Doctor_object_SP0").tell(new ObjectDeleted<HospitalExample.Doctor>(incUtil, (HospitalExample.Doctor) node), getSelf());
		}
		if (node instanceof HospitalExample.Doctor) {
			incUtil.newMessage();
			name2actor.get("Doctor_object_SP1").tell(new ObjectDeleted<HospitalExample.Doctor>(incUtil, (HospitalExample.Doctor) node), getSelf());
		}
		if (node instanceof HospitalExample.Reception) {
			incUtil.newMessage();
			name2actor.get("Reception_object_SP0").tell(new ObjectDeleted<HospitalExample.Reception>(incUtil, (HospitalExample.Reception) node), getSelf());
		}
		if (node instanceof HospitalExample.Reception) {
			incUtil.newMessage();
			name2actor.get("Reception_object_SP1").tell(new ObjectDeleted<HospitalExample.Reception>(incUtil, (HospitalExample.Reception) node), getSelf());
		}
		if (node instanceof HospitalExample.Patient) {
			incUtil.newMessage();
			name2actor.get("Patient_object_SP0").tell(new ObjectDeleted<HospitalExample.Patient>(incUtil, (HospitalExample.Patient) node), getSelf());
		}
		if (node instanceof HospitalExample.Patient) {
			incUtil.newMessage();
			name2actor.get("Patient_object_SP1").tell(new ObjectDeleted<HospitalExample.Patient>(incUtil, (HospitalExample.Patient) node), getSelf());
		}
	}
}

