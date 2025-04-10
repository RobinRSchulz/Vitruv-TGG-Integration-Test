package Families2Insurance.sync.hipe.engine.actor;

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
		type2addConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getDaughterToInsuranceClient__Marker(), obj -> {
			Something2Else.DaughterToInsuranceClient__Marker _daughtertoinsuranceclient__marker = (Something2Else.DaughterToInsuranceClient__Marker) obj;
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__Marker_object").tell(new ObjectAdded<Something2Else.DaughterToInsuranceClient__Marker>(incUtil, _daughtertoinsuranceclient__marker), getSelf());
		});
		type2addConsumer.put(edu.kit.ipd.sdq.metamodels.families.FamiliesPackage.eINSTANCE.getFamilyRegister(), obj -> {
			edu.kit.ipd.sdq.metamodels.families.FamilyRegister _familyregister = (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) obj;
			incUtil.newMessage();
			name2actor.get("FamilyRegister_object_SP0").tell(new ObjectAdded<edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil, _familyregister), getSelf());
			incUtil.newMessage();
			name2actor.get("FamilyRegister_object_SP1").tell(new ObjectAdded<edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil, _familyregister), getSelf());
			incUtil.newMessage();
			name2actor.get("FamilyRegister_object_SP2").tell(new ObjectAdded<edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil, _familyregister), getSelf());
			incUtil.newMessage();
			name2actor.get("FamilyRegister_object_SP3").tell(new ObjectAdded<edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil, _familyregister), getSelf());
			incUtil.newMessage();
			name2actor.get("FamilyRegister_object_SP4").tell(new ObjectAdded<edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil, _familyregister), getSelf());
		});
		type2addConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getFamilyRegisterToInsuranceDatabase__Marker(), obj -> {
			Something2Else.FamilyRegisterToInsuranceDatabase__Marker _familyregistertoinsurancedatabase__marker = (Something2Else.FamilyRegisterToInsuranceDatabase__Marker) obj;
			incUtil.newMessage();
			name2actor.get("FamilyRegisterToInsuranceDatabase__Marker_object").tell(new ObjectAdded<Something2Else.FamilyRegisterToInsuranceDatabase__Marker>(incUtil, _familyregistertoinsurancedatabase__marker), getSelf());
		});
		type2addConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getFatherNewFamilyToNewInsuranceClient__Marker(), obj -> {
			Something2Else.FatherNewFamilyToNewInsuranceClient__Marker _fathernewfamilytonewinsuranceclient__marker = (Something2Else.FatherNewFamilyToNewInsuranceClient__Marker) obj;
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__Marker_object").tell(new ObjectAdded<Something2Else.FatherNewFamilyToNewInsuranceClient__Marker>(incUtil, _fathernewfamilytonewinsuranceclient__marker), getSelf());
		});
		type2addConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getMotherNewFamilyToNewInsuranceClient__Marker(), obj -> {
			Something2Else.MotherNewFamilyToNewInsuranceClient__Marker _mothernewfamilytonewinsuranceclient__marker = (Something2Else.MotherNewFamilyToNewInsuranceClient__Marker) obj;
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__Marker_object").tell(new ObjectAdded<Something2Else.MotherNewFamilyToNewInsuranceClient__Marker>(incUtil, _mothernewfamilytonewinsuranceclient__marker), getSelf());
		});
		type2addConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getFamilyToInsuranceClient(), obj -> {
			Something2Else.FamilyToInsuranceClient _familytoinsuranceclient = (Something2Else.FamilyToInsuranceClient) obj;
			incUtil.newMessage();
			name2actor.get("FamilyToInsuranceClient_object_SP0").tell(new ObjectAdded<Something2Else.FamilyToInsuranceClient>(incUtil, _familytoinsuranceclient), getSelf());
			incUtil.newMessage();
			name2actor.get("FamilyToInsuranceClient_object_SP1").tell(new ObjectAdded<Something2Else.FamilyToInsuranceClient>(incUtil, _familytoinsuranceclient), getSelf());
		});
		type2addConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getMemberToInsuranceClient(), obj -> {
			Something2Else.MemberToInsuranceClient _membertoinsuranceclient = (Something2Else.MemberToInsuranceClient) obj;
			incUtil.newMessage();
			name2actor.get("MemberToInsuranceClient_object_SP0").tell(new ObjectAdded<Something2Else.MemberToInsuranceClient>(incUtil, _membertoinsuranceclient), getSelf());
			incUtil.newMessage();
			name2actor.get("MemberToInsuranceClient_object_SP1").tell(new ObjectAdded<Something2Else.MemberToInsuranceClient>(incUtil, _membertoinsuranceclient), getSelf());
		});
		type2addConsumer.put(edu.kit.ipd.sdq.metamodels.families.FamiliesPackage.eINSTANCE.getFamily(), obj -> {
			edu.kit.ipd.sdq.metamodels.families.Family _family = (edu.kit.ipd.sdq.metamodels.families.Family) obj;
			incUtil.newMessage();
			name2actor.get("Family_object_SP0").tell(new ObjectAdded<edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, _family), getSelf());
			incUtil.newMessage();
			name2actor.get("Family_object_SP1").tell(new ObjectAdded<edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, _family), getSelf());
			incUtil.newMessage();
			name2actor.get("Family_object_SP2").tell(new ObjectAdded<edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, _family), getSelf());
			incUtil.newMessage();
			name2actor.get("Family_object_SP3").tell(new ObjectAdded<edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, _family), getSelf());
			incUtil.newMessage();
			name2actor.get("Family_object_SP4").tell(new ObjectAdded<edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, _family), getSelf());
			incUtil.newMessage();
			name2actor.get("Family_object_SP5").tell(new ObjectAdded<edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, _family), getSelf());
			incUtil.newMessage();
			name2actor.get("Family_object_SP6").tell(new ObjectAdded<edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, _family), getSelf());
			incUtil.newMessage();
			name2actor.get("Family_object_SP7").tell(new ObjectAdded<edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, _family), getSelf());
			incUtil.newMessage();
			name2actor.get("Family_object_SP8").tell(new ObjectAdded<edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, _family), getSelf());
		});
		type2addConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getSonToInsuranceClient__Marker(), obj -> {
			Something2Else.SonToInsuranceClient__Marker _sontoinsuranceclient__marker = (Something2Else.SonToInsuranceClient__Marker) obj;
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__Marker_object").tell(new ObjectAdded<Something2Else.SonToInsuranceClient__Marker>(incUtil, _sontoinsuranceclient__marker), getSelf());
		});
		type2addConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getFatherToInsuranceClient__Marker(), obj -> {
			Something2Else.FatherToInsuranceClient__Marker _fathertoinsuranceclient__marker = (Something2Else.FatherToInsuranceClient__Marker) obj;
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__Marker_object").tell(new ObjectAdded<Something2Else.FatherToInsuranceClient__Marker>(incUtil, _fathertoinsuranceclient__marker), getSelf());
		});
		type2addConsumer.put(edu.kit.ipd.sdq.metamodels.insurance.InsurancePackage.eINSTANCE.getInsuranceClient(), obj -> {
			edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient _insuranceclient = (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) obj;
			incUtil.newMessage();
			name2actor.get("InsuranceClient_object_SP0").tell(new ObjectAdded<edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil, _insuranceclient), getSelf());
			incUtil.newMessage();
			name2actor.get("InsuranceClient_object_SP1").tell(new ObjectAdded<edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil, _insuranceclient), getSelf());
			incUtil.newMessage();
			name2actor.get("InsuranceClient_object_SP2").tell(new ObjectAdded<edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil, _insuranceclient), getSelf());
		});
		type2addConsumer.put(edu.kit.ipd.sdq.metamodels.insurance.InsurancePackage.eINSTANCE.getInsuranceDatabase(), obj -> {
			edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase _insurancedatabase = (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) obj;
			incUtil.newMessage();
			name2actor.get("InsuranceDatabase_object_SP0").tell(new ObjectAdded<edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil, _insurancedatabase), getSelf());
			incUtil.newMessage();
			name2actor.get("InsuranceDatabase_object_SP1").tell(new ObjectAdded<edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil, _insurancedatabase), getSelf());
			incUtil.newMessage();
			name2actor.get("InsuranceDatabase_object_SP2").tell(new ObjectAdded<edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil, _insurancedatabase), getSelf());
			incUtil.newMessage();
			name2actor.get("InsuranceDatabase_object_SP3").tell(new ObjectAdded<edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil, _insurancedatabase), getSelf());
			incUtil.newMessage();
			name2actor.get("InsuranceDatabase_object_SP4").tell(new ObjectAdded<edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil, _insurancedatabase), getSelf());
		});
		type2addConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getFamilyRegisterToInsuranceDatabase(), obj -> {
			Something2Else.FamilyRegisterToInsuranceDatabase _familyregistertoinsurancedatabase = (Something2Else.FamilyRegisterToInsuranceDatabase) obj;
			incUtil.newMessage();
			name2actor.get("FamilyRegisterToInsuranceDatabase_object_SP0").tell(new ObjectAdded<Something2Else.FamilyRegisterToInsuranceDatabase>(incUtil, _familyregistertoinsurancedatabase), getSelf());
			incUtil.newMessage();
			name2actor.get("FamilyRegisterToInsuranceDatabase_object_SP1").tell(new ObjectAdded<Something2Else.FamilyRegisterToInsuranceDatabase>(incUtil, _familyregistertoinsurancedatabase), getSelf());
			incUtil.newMessage();
			name2actor.get("FamilyRegisterToInsuranceDatabase_object_SP2").tell(new ObjectAdded<Something2Else.FamilyRegisterToInsuranceDatabase>(incUtil, _familyregistertoinsurancedatabase), getSelf());
			incUtil.newMessage();
			name2actor.get("FamilyRegisterToInsuranceDatabase_object_SP3").tell(new ObjectAdded<Something2Else.FamilyRegisterToInsuranceDatabase>(incUtil, _familyregistertoinsurancedatabase), getSelf());
			incUtil.newMessage();
			name2actor.get("FamilyRegisterToInsuranceDatabase_object_SP4").tell(new ObjectAdded<Something2Else.FamilyRegisterToInsuranceDatabase>(incUtil, _familyregistertoinsurancedatabase), getSelf());
		});
		type2addConsumer.put(edu.kit.ipd.sdq.metamodels.families.FamiliesPackage.eINSTANCE.getMember(), obj -> {
			edu.kit.ipd.sdq.metamodels.families.Member _member = (edu.kit.ipd.sdq.metamodels.families.Member) obj;
			incUtil.newMessage();
			name2actor.get("Member_object_SP0").tell(new ObjectAdded<edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, _member), getSelf());
			incUtil.newMessage();
			name2actor.get("Member_object_SP1").tell(new ObjectAdded<edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, _member), getSelf());
			incUtil.newMessage();
			name2actor.get("Member_object_SP2").tell(new ObjectAdded<edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, _member), getSelf());
			incUtil.newMessage();
			name2actor.get("Member_object_SP3").tell(new ObjectAdded<edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, _member), getSelf());
			incUtil.newMessage();
			name2actor.get("Member_object_SP4").tell(new ObjectAdded<edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, _member), getSelf());
			incUtil.newMessage();
			name2actor.get("Member_object_SP5").tell(new ObjectAdded<edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, _member), getSelf());
			incUtil.newMessage();
			name2actor.get("Member_object_SP6").tell(new ObjectAdded<edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, _member), getSelf());
			incUtil.newMessage();
			name2actor.get("Member_object_SP7").tell(new ObjectAdded<edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, _member), getSelf());
		});
		type2addConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getMotherToInsuranceClient__Marker(), obj -> {
			Something2Else.MotherToInsuranceClient__Marker _mothertoinsuranceclient__marker = (Something2Else.MotherToInsuranceClient__Marker) obj;
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__Marker_object").tell(new ObjectAdded<Something2Else.MotherToInsuranceClient__Marker>(incUtil, _mothertoinsuranceclient__marker), getSelf());
		});
	}
	
	private void initializeSet() {
		feature2setConsumer.put(edu.kit.ipd.sdq.metamodels.families.FamiliesPackage.eINSTANCE.getMember_FirstName(), notification -> {
			if(notification.getNotifier() instanceof edu.kit.ipd.sdq.metamodels.families.Member) {
				incUtil.newMessage();
				name2actor.get("Member_object_SP7").tell(new AttributeChanged<edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof edu.kit.ipd.sdq.metamodels.families.Member) {
				incUtil.newMessage();
				name2actor.get("Member_object_SP4").tell(new AttributeChanged<edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof edu.kit.ipd.sdq.metamodels.families.Member) {
				incUtil.newMessage();
				name2actor.get("Member_object_SP0").tell(new AttributeChanged<edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof edu.kit.ipd.sdq.metamodels.families.Member) {
				incUtil.newMessage();
				name2actor.get("Member_object_SP5").tell(new AttributeChanged<edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof edu.kit.ipd.sdq.metamodels.families.Member) {
				incUtil.newMessage();
				name2actor.get("Member_object_SP1").tell(new AttributeChanged<edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof edu.kit.ipd.sdq.metamodels.families.Member) {
				incUtil.newMessage();
				name2actor.get("Member_object_SP2").tell(new AttributeChanged<edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof edu.kit.ipd.sdq.metamodels.families.Member) {
				incUtil.newMessage();
				name2actor.get("Member_object_SP6").tell(new AttributeChanged<edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof edu.kit.ipd.sdq.metamodels.families.Member) {
				incUtil.newMessage();
				name2actor.get("Member_object_SP3").tell(new AttributeChanged<edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
		});
		
		feature2setConsumer.put(edu.kit.ipd.sdq.metamodels.insurance.InsurancePackage.eINSTANCE.getInsuranceClient_Name(), notification -> {
			if(notification.getNotifier() instanceof edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) {
				incUtil.newMessage();
				name2actor.get("InsuranceClient_object_SP0").tell(new AttributeChanged<edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil, (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) {
				incUtil.newMessage();
				name2actor.get("InsuranceClient_object_SP1").tell(new AttributeChanged<edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil, (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) {
				incUtil.newMessage();
				name2actor.get("InsuranceClient_object_SP2").tell(new AttributeChanged<edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil, (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
		});
		
		feature2setConsumer.put(edu.kit.ipd.sdq.metamodels.families.FamiliesPackage.eINSTANCE.getFamily_LastName(), notification -> {
			if(notification.getNotifier() instanceof edu.kit.ipd.sdq.metamodels.families.Family) {
				incUtil.newMessage();
				name2actor.get("Family_object_SP2").tell(new AttributeChanged<edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof edu.kit.ipd.sdq.metamodels.families.Family) {
				incUtil.newMessage();
				name2actor.get("Family_object_SP5").tell(new AttributeChanged<edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof edu.kit.ipd.sdq.metamodels.families.Family) {
				incUtil.newMessage();
				name2actor.get("Family_object_SP6").tell(new AttributeChanged<edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof edu.kit.ipd.sdq.metamodels.families.Family) {
				incUtil.newMessage();
				name2actor.get("Family_object_SP7").tell(new AttributeChanged<edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof edu.kit.ipd.sdq.metamodels.families.Family) {
				incUtil.newMessage();
				name2actor.get("Family_object_SP8").tell(new AttributeChanged<edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof edu.kit.ipd.sdq.metamodels.families.Family) {
				incUtil.newMessage();
				name2actor.get("Family_object_SP3").tell(new AttributeChanged<edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof edu.kit.ipd.sdq.metamodels.families.Family) {
				incUtil.newMessage();
				name2actor.get("Family_object_SP4").tell(new AttributeChanged<edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof edu.kit.ipd.sdq.metamodels.families.Family) {
				incUtil.newMessage();
				name2actor.get("Family_object_SP1").tell(new AttributeChanged<edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof edu.kit.ipd.sdq.metamodels.families.Family) {
				incUtil.newMessage();
				name2actor.get("Family_object_SP0").tell(new AttributeChanged<edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
		});
		
		feature2setConsumer.put(edu.kit.ipd.sdq.metamodels.insurance.InsurancePackage.eINSTANCE.getInsuranceClient_Gender(), notification -> {
			if(notification.getNotifier() instanceof edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) {
				incUtil.newMessage();
				name2actor.get("InsuranceClient_object_SP0").tell(new AttributeChanged<edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil, (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) {
				incUtil.newMessage();
				name2actor.get("InsuranceClient_object_SP1").tell(new AttributeChanged<edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil, (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) {
				incUtil.newMessage();
				name2actor.get("InsuranceClient_object_SP2").tell(new AttributeChanged<edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil, (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
		});
		
	}
	
	private void initializeAddEdge() {
		feature2addEdgeConsumer.put(edu.kit.ipd.sdq.metamodels.families.FamiliesPackage.eINSTANCE.getFamilyRegister_Families(), notification -> {
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__BWD_1_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.FamilyRegister, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil,(edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.FamilyRegister_families_Family"), getSelf());
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__CONSISTENCY_16_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.FamilyRegister, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil,(edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.FamilyRegister_families_Family"), getSelf());
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__FWD_26_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.FamilyRegister, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil,(edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.FamilyRegister_families_Family"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__CONSISTENCY_53_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.FamilyRegister, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil,(edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.FamilyRegister_families_Family"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__FWD_63_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.FamilyRegister, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil,(edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.FamilyRegister_families_Family"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__BWD_69_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.FamilyRegister, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil,(edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.FamilyRegister_families_Family"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__CONSISTENCY_84_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.FamilyRegister, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil,(edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.FamilyRegister_families_Family"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__FWD_94_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.FamilyRegister, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil,(edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.FamilyRegister_families_Family"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__CONSISTENCY_114_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.FamilyRegister, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil,(edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.FamilyRegister_families_Family"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__FWD_124_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.FamilyRegister, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil,(edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.FamilyRegister_families_Family"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__BWD_130_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.FamilyRegister, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil,(edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.FamilyRegister_families_Family"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__CONSISTENCY_145_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.FamilyRegister, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil,(edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.FamilyRegister_families_Family"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__FWD_155_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.FamilyRegister, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil,(edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.FamilyRegister_families_Family"), getSelf());
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__BWD_161_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.FamilyRegister, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil,(edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.FamilyRegister_families_Family"), getSelf());
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__CONSISTENCY_176_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.FamilyRegister, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil,(edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.FamilyRegister_families_Family"), getSelf());
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__FWD_186_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.FamilyRegister, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil,(edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.FamilyRegister_families_Family"), getSelf());
		});
		feature2addEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getDaughterToInsuranceClient__Marker_CREATE__SRC__daughter(), notification -> {
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__CONSISTENCY_16_localSearch").tell(new ReferenceAdded<Something2Else.DaughterToInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil,(Something2Else.DaughterToInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNewValue(), "Something2Else.DaughterToInsuranceClient__Marker_CREATE__SRC__daughter_Member"), getSelf());
		});
		feature2addEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getMotherNewFamilyToNewInsuranceClient__Marker_CREATE__CORR__memberToInsuranceClient(), notification -> {
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__CONSISTENCY_114_localSearch").tell(new ReferenceAdded<Something2Else.MotherNewFamilyToNewInsuranceClient__Marker, Something2Else.MemberToInsuranceClient>(incUtil,(Something2Else.MotherNewFamilyToNewInsuranceClient__Marker) notification.getNotifier(), (Something2Else.MemberToInsuranceClient) notification.getNewValue(), "Something2Else.MotherNewFamilyToNewInsuranceClient__Marker_CREATE__CORR__memberToInsuranceClient_MemberToInsuranceClient"), getSelf());
		});
		feature2addEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getMotherToInsuranceClient__Marker_CREATE__TRG__insuranceClient(), notification -> {
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__CONSISTENCY_145_localSearch").tell(new ReferenceAdded<Something2Else.MotherToInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil,(Something2Else.MotherToInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getNewValue(), "Something2Else.MotherToInsuranceClient__Marker_CREATE__TRG__insuranceClient_InsuranceClient"), getSelf());
		});
		feature2addEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getFamilyRegisterToInsuranceDatabase__Marker_CREATE__TRG__insuranceDb(), notification -> {
			incUtil.newMessage();
			name2actor.get("FamilyRegisterToInsuranceDatabase__CONSISTENCY_33_localSearch").tell(new ReferenceAdded<Something2Else.FamilyRegisterToInsuranceDatabase__Marker, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil,(Something2Else.FamilyRegisterToInsuranceDatabase__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNewValue(), "Something2Else.FamilyRegisterToInsuranceDatabase__Marker_CREATE__TRG__insuranceDb_InsuranceDatabase"), getSelf());
		});
		feature2addEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getFatherToInsuranceClient__Marker_CREATE__CORR__familyToInsuranceClient(), notification -> {
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__CONSISTENCY_84_localSearch").tell(new ReferenceAdded<Something2Else.FatherToInsuranceClient__Marker, Something2Else.FamilyToInsuranceClient>(incUtil,(Something2Else.FatherToInsuranceClient__Marker) notification.getNotifier(), (Something2Else.FamilyToInsuranceClient) notification.getNewValue(), "Something2Else.FatherToInsuranceClient__Marker_CREATE__CORR__familyToInsuranceClient_FamilyToInsuranceClient"), getSelf());
		});
		feature2addEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getFatherNewFamilyToNewInsuranceClient__Marker_CONTEXT__SRC__familyRegister(), notification -> {
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__CONSISTENCY_53_localSearch").tell(new ReferenceAdded<Something2Else.FatherNewFamilyToNewInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil,(Something2Else.FatherNewFamilyToNewInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNewValue(), "Something2Else.FatherNewFamilyToNewInsuranceClient__Marker_CONTEXT__SRC__familyRegister_FamilyRegister"), getSelf());
		});
		feature2addEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getSonToInsuranceClient__Marker_CONTEXT__TRG__insuranceDB(), notification -> {
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__CONSISTENCY_176_localSearch").tell(new ReferenceAdded<Something2Else.SonToInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil,(Something2Else.SonToInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNewValue(), "Something2Else.SonToInsuranceClient__Marker_CONTEXT__TRG__insuranceDB_InsuranceDatabase"), getSelf());
		});
		feature2addEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getDaughterToInsuranceClient__Marker_CONTEXT__SRC__familyRegister(), notification -> {
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__CONSISTENCY_16_localSearch").tell(new ReferenceAdded<Something2Else.DaughterToInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil,(Something2Else.DaughterToInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNewValue(), "Something2Else.DaughterToInsuranceClient__Marker_CONTEXT__SRC__familyRegister_FamilyRegister"), getSelf());
		});
		feature2addEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getFamilyRegisterToInsuranceDatabase_Target(), notification -> {
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__BWD_1_localSearch").tell(new ReferenceAdded<Something2Else.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil,(Something2Else.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNewValue(), "Something2Else.FamilyRegisterToInsuranceDatabase_target_InsuranceDatabase"), getSelf());
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__CONSISTENCY_16_localSearch").tell(new ReferenceAdded<Something2Else.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil,(Something2Else.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNewValue(), "Something2Else.FamilyRegisterToInsuranceDatabase_target_InsuranceDatabase"), getSelf());
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__FWD_26_localSearch").tell(new ReferenceAdded<Something2Else.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil,(Something2Else.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNewValue(), "Something2Else.FamilyRegisterToInsuranceDatabase_target_InsuranceDatabase"), getSelf());
			incUtil.newMessage();
			name2actor.get("FamilyRegisterToInsuranceDatabase__CONSISTENCY_33_localSearch").tell(new ReferenceAdded<Something2Else.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil,(Something2Else.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNewValue(), "Something2Else.FamilyRegisterToInsuranceDatabase_target_InsuranceDatabase"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__BWD_39_localSearch").tell(new ReferenceAdded<Something2Else.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil,(Something2Else.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNewValue(), "Something2Else.FamilyRegisterToInsuranceDatabase_target_InsuranceDatabase"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__CONSISTENCY_53_localSearch").tell(new ReferenceAdded<Something2Else.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil,(Something2Else.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNewValue(), "Something2Else.FamilyRegisterToInsuranceDatabase_target_InsuranceDatabase"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__FWD_63_localSearch").tell(new ReferenceAdded<Something2Else.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil,(Something2Else.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNewValue(), "Something2Else.FamilyRegisterToInsuranceDatabase_target_InsuranceDatabase"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__BWD_69_localSearch").tell(new ReferenceAdded<Something2Else.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil,(Something2Else.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNewValue(), "Something2Else.FamilyRegisterToInsuranceDatabase_target_InsuranceDatabase"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__CONSISTENCY_84_localSearch").tell(new ReferenceAdded<Something2Else.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil,(Something2Else.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNewValue(), "Something2Else.FamilyRegisterToInsuranceDatabase_target_InsuranceDatabase"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__FWD_94_localSearch").tell(new ReferenceAdded<Something2Else.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil,(Something2Else.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNewValue(), "Something2Else.FamilyRegisterToInsuranceDatabase_target_InsuranceDatabase"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__BWD_100_localSearch").tell(new ReferenceAdded<Something2Else.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil,(Something2Else.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNewValue(), "Something2Else.FamilyRegisterToInsuranceDatabase_target_InsuranceDatabase"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__CONSISTENCY_114_localSearch").tell(new ReferenceAdded<Something2Else.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil,(Something2Else.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNewValue(), "Something2Else.FamilyRegisterToInsuranceDatabase_target_InsuranceDatabase"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__FWD_124_localSearch").tell(new ReferenceAdded<Something2Else.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil,(Something2Else.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNewValue(), "Something2Else.FamilyRegisterToInsuranceDatabase_target_InsuranceDatabase"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__BWD_130_localSearch").tell(new ReferenceAdded<Something2Else.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil,(Something2Else.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNewValue(), "Something2Else.FamilyRegisterToInsuranceDatabase_target_InsuranceDatabase"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__CONSISTENCY_145_localSearch").tell(new ReferenceAdded<Something2Else.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil,(Something2Else.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNewValue(), "Something2Else.FamilyRegisterToInsuranceDatabase_target_InsuranceDatabase"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__FWD_155_localSearch").tell(new ReferenceAdded<Something2Else.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil,(Something2Else.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNewValue(), "Something2Else.FamilyRegisterToInsuranceDatabase_target_InsuranceDatabase"), getSelf());
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__BWD_161_localSearch").tell(new ReferenceAdded<Something2Else.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil,(Something2Else.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNewValue(), "Something2Else.FamilyRegisterToInsuranceDatabase_target_InsuranceDatabase"), getSelf());
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__CONSISTENCY_176_localSearch").tell(new ReferenceAdded<Something2Else.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil,(Something2Else.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNewValue(), "Something2Else.FamilyRegisterToInsuranceDatabase_target_InsuranceDatabase"), getSelf());
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__FWD_186_localSearch").tell(new ReferenceAdded<Something2Else.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil,(Something2Else.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNewValue(), "Something2Else.FamilyRegisterToInsuranceDatabase_target_InsuranceDatabase"), getSelf());
		});
		feature2addEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getFatherToInsuranceClient__Marker_CREATE__SRC__father(), notification -> {
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__CONSISTENCY_84_localSearch").tell(new ReferenceAdded<Something2Else.FatherToInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil,(Something2Else.FatherToInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNewValue(), "Something2Else.FatherToInsuranceClient__Marker_CREATE__SRC__father_Member"), getSelf());
		});
		feature2addEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getDaughterToInsuranceClient__Marker_CREATE__CORR__memberToInsuranceClient(), notification -> {
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__CONSISTENCY_16_localSearch").tell(new ReferenceAdded<Something2Else.DaughterToInsuranceClient__Marker, Something2Else.MemberToInsuranceClient>(incUtil,(Something2Else.DaughterToInsuranceClient__Marker) notification.getNotifier(), (Something2Else.MemberToInsuranceClient) notification.getNewValue(), "Something2Else.DaughterToInsuranceClient__Marker_CREATE__CORR__memberToInsuranceClient_MemberToInsuranceClient"), getSelf());
		});
		feature2addEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getMotherToInsuranceClient__Marker_CREATE__CORR__memberToInsuranceClient(), notification -> {
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__CONSISTENCY_145_localSearch").tell(new ReferenceAdded<Something2Else.MotherToInsuranceClient__Marker, Something2Else.MemberToInsuranceClient>(incUtil,(Something2Else.MotherToInsuranceClient__Marker) notification.getNotifier(), (Something2Else.MemberToInsuranceClient) notification.getNewValue(), "Something2Else.MotherToInsuranceClient__Marker_CREATE__CORR__memberToInsuranceClient_MemberToInsuranceClient"), getSelf());
		});
		feature2addEdgeConsumer.put(edu.kit.ipd.sdq.metamodels.families.FamiliesPackage.eINSTANCE.getFamily_Sons(), notification -> {
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient_daughter_sons_incoming_SRC__FILTER_NAC_SRC_7_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil,(edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.Family_sons_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient_father_sons_incoming_SRC__FILTER_NAC_SRC_44_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil,(edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.Family_sons_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient_father_sons_incoming_SRC__FILTER_NAC_SRC_75_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil,(edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.Family_sons_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient_mother_sons_incoming_SRC__FILTER_NAC_SRC_105_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil,(edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.Family_sons_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient_mother_sons_incoming_SRC__FILTER_NAC_SRC_136_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil,(edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.Family_sons_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__CONSISTENCY_176_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil,(edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.Family_sons_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__FWD_186_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil,(edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.Family_sons_Member"), getSelf());
		});
		feature2addEdgeConsumer.put(edu.kit.ipd.sdq.metamodels.families.FamiliesPackage.eINSTANCE.getFamily_Father(), notification -> {
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient_daughter_father_incoming_SRC__FILTER_NAC_SRC_10_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil,(edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.Family_father_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__CONSISTENCY_53_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil,(edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.Family_father_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__FWD_63_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil,(edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.Family_father_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__CONSISTENCY_84_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil,(edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.Family_father_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__FWD_94_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil,(edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.Family_father_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient_mother_father_incoming_SRC__FILTER_NAC_SRC_111_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil,(edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.Family_father_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient_mother_father_incoming_SRC__FILTER_NAC_SRC_142_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil,(edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.Family_father_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient_son_father_incoming_SRC__FILTER_NAC_SRC_170_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil,(edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.Family_father_Member"), getSelf());
		});
		feature2addEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getMotherNewFamilyToNewInsuranceClient__Marker_CREATE__CORR__familyToInsuranceClient(), notification -> {
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__CONSISTENCY_114_localSearch").tell(new ReferenceAdded<Something2Else.MotherNewFamilyToNewInsuranceClient__Marker, Something2Else.FamilyToInsuranceClient>(incUtil,(Something2Else.MotherNewFamilyToNewInsuranceClient__Marker) notification.getNotifier(), (Something2Else.FamilyToInsuranceClient) notification.getNewValue(), "Something2Else.MotherNewFamilyToNewInsuranceClient__Marker_CREATE__CORR__familyToInsuranceClient_FamilyToInsuranceClient"), getSelf());
		});
		feature2addEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getFamilyToInsuranceClient_Target(), notification -> {
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__CONSISTENCY_16_localSearch").tell(new ReferenceAdded<Something2Else.FamilyToInsuranceClient, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil,(Something2Else.FamilyToInsuranceClient) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getNewValue(), "Something2Else.FamilyToInsuranceClient_target_InsuranceClient"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__CONSISTENCY_53_localSearch").tell(new ReferenceAdded<Something2Else.FamilyToInsuranceClient, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil,(Something2Else.FamilyToInsuranceClient) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getNewValue(), "Something2Else.FamilyToInsuranceClient_target_InsuranceClient"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__CONSISTENCY_84_localSearch").tell(new ReferenceAdded<Something2Else.FamilyToInsuranceClient, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil,(Something2Else.FamilyToInsuranceClient) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getNewValue(), "Something2Else.FamilyToInsuranceClient_target_InsuranceClient"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__CONSISTENCY_114_localSearch").tell(new ReferenceAdded<Something2Else.FamilyToInsuranceClient, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil,(Something2Else.FamilyToInsuranceClient) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getNewValue(), "Something2Else.FamilyToInsuranceClient_target_InsuranceClient"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__CONSISTENCY_145_localSearch").tell(new ReferenceAdded<Something2Else.FamilyToInsuranceClient, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil,(Something2Else.FamilyToInsuranceClient) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getNewValue(), "Something2Else.FamilyToInsuranceClient_target_InsuranceClient"), getSelf());
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__CONSISTENCY_176_localSearch").tell(new ReferenceAdded<Something2Else.FamilyToInsuranceClient, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil,(Something2Else.FamilyToInsuranceClient) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getNewValue(), "Something2Else.FamilyToInsuranceClient_target_InsuranceClient"), getSelf());
		});
		feature2addEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getFatherNewFamilyToNewInsuranceClient__Marker_CREATE__SRC__family(), notification -> {
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__CONSISTENCY_53_localSearch").tell(new ReferenceAdded<Something2Else.FatherNewFamilyToNewInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil,(Something2Else.FatherNewFamilyToNewInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNewValue(), "Something2Else.FatherNewFamilyToNewInsuranceClient__Marker_CREATE__SRC__family_Family"), getSelf());
		});
		feature2addEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getFatherNewFamilyToNewInsuranceClient__Marker_CREATE__TRG__insuranceClient(), notification -> {
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__CONSISTENCY_53_localSearch").tell(new ReferenceAdded<Something2Else.FatherNewFamilyToNewInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil,(Something2Else.FatherNewFamilyToNewInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getNewValue(), "Something2Else.FatherNewFamilyToNewInsuranceClient__Marker_CREATE__TRG__insuranceClient_InsuranceClient"), getSelf());
		});
		feature2addEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getSonToInsuranceClient__Marker_CONTEXT__CORR__familyRegisterToInsuranceDB(), notification -> {
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__CONSISTENCY_176_localSearch").tell(new ReferenceAdded<Something2Else.SonToInsuranceClient__Marker, Something2Else.FamilyRegisterToInsuranceDatabase>(incUtil,(Something2Else.SonToInsuranceClient__Marker) notification.getNotifier(), (Something2Else.FamilyRegisterToInsuranceDatabase) notification.getNewValue(), "Something2Else.SonToInsuranceClient__Marker_CONTEXT__CORR__familyRegisterToInsuranceDB_FamilyRegisterToInsuranceDatabase"), getSelf());
		});
		feature2addEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getFatherNewFamilyToNewInsuranceClient__Marker_CREATE__CORR__memberToInsuranceClient(), notification -> {
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__CONSISTENCY_53_localSearch").tell(new ReferenceAdded<Something2Else.FatherNewFamilyToNewInsuranceClient__Marker, Something2Else.MemberToInsuranceClient>(incUtil,(Something2Else.FatherNewFamilyToNewInsuranceClient__Marker) notification.getNotifier(), (Something2Else.MemberToInsuranceClient) notification.getNewValue(), "Something2Else.FatherNewFamilyToNewInsuranceClient__Marker_CREATE__CORR__memberToInsuranceClient_MemberToInsuranceClient"), getSelf());
		});
		feature2addEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getFatherNewFamilyToNewInsuranceClient__Marker_CREATE__CORR__familyToInsuranceClient(), notification -> {
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__CONSISTENCY_53_localSearch").tell(new ReferenceAdded<Something2Else.FatherNewFamilyToNewInsuranceClient__Marker, Something2Else.FamilyToInsuranceClient>(incUtil,(Something2Else.FatherNewFamilyToNewInsuranceClient__Marker) notification.getNotifier(), (Something2Else.FamilyToInsuranceClient) notification.getNewValue(), "Something2Else.FatherNewFamilyToNewInsuranceClient__Marker_CREATE__CORR__familyToInsuranceClient_FamilyToInsuranceClient"), getSelf());
		});
		feature2addEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getMotherNewFamilyToNewInsuranceClient__Marker_CONTEXT__CORR__familyRegisterToInsuranceDB(), notification -> {
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__CONSISTENCY_114_localSearch").tell(new ReferenceAdded<Something2Else.MotherNewFamilyToNewInsuranceClient__Marker, Something2Else.FamilyRegisterToInsuranceDatabase>(incUtil,(Something2Else.MotherNewFamilyToNewInsuranceClient__Marker) notification.getNotifier(), (Something2Else.FamilyRegisterToInsuranceDatabase) notification.getNewValue(), "Something2Else.MotherNewFamilyToNewInsuranceClient__Marker_CONTEXT__CORR__familyRegisterToInsuranceDB_FamilyRegisterToInsuranceDatabase"), getSelf());
		});
		feature2addEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getMotherToInsuranceClient__Marker_CONTEXT__CORR__familyRegisterToInsuranceDB(), notification -> {
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__CONSISTENCY_145_localSearch").tell(new ReferenceAdded<Something2Else.MotherToInsuranceClient__Marker, Something2Else.FamilyRegisterToInsuranceDatabase>(incUtil,(Something2Else.MotherToInsuranceClient__Marker) notification.getNotifier(), (Something2Else.FamilyRegisterToInsuranceDatabase) notification.getNewValue(), "Something2Else.MotherToInsuranceClient__Marker_CONTEXT__CORR__familyRegisterToInsuranceDB_FamilyRegisterToInsuranceDatabase"), getSelf());
		});
		feature2addEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getMotherNewFamilyToNewInsuranceClient__Marker_CONTEXT__SRC__familyRegister(), notification -> {
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__CONSISTENCY_114_localSearch").tell(new ReferenceAdded<Something2Else.MotherNewFamilyToNewInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil,(Something2Else.MotherNewFamilyToNewInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNewValue(), "Something2Else.MotherNewFamilyToNewInsuranceClient__Marker_CONTEXT__SRC__familyRegister_FamilyRegister"), getSelf());
		});
		feature2addEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getSonToInsuranceClient__Marker_CREATE__TRG__insuranceClient(), notification -> {
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__CONSISTENCY_176_localSearch").tell(new ReferenceAdded<Something2Else.SonToInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil,(Something2Else.SonToInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getNewValue(), "Something2Else.SonToInsuranceClient__Marker_CREATE__TRG__insuranceClient_InsuranceClient"), getSelf());
		});
		feature2addEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getSonToInsuranceClient__Marker_CREATE__CORR__familyToInsuranceClient(), notification -> {
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__CONSISTENCY_176_localSearch").tell(new ReferenceAdded<Something2Else.SonToInsuranceClient__Marker, Something2Else.FamilyToInsuranceClient>(incUtil,(Something2Else.SonToInsuranceClient__Marker) notification.getNotifier(), (Something2Else.FamilyToInsuranceClient) notification.getNewValue(), "Something2Else.SonToInsuranceClient__Marker_CREATE__CORR__familyToInsuranceClient_FamilyToInsuranceClient"), getSelf());
		});
		feature2addEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getMotherNewFamilyToNewInsuranceClient__Marker_CREATE__SRC__family(), notification -> {
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__CONSISTENCY_114_localSearch").tell(new ReferenceAdded<Something2Else.MotherNewFamilyToNewInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil,(Something2Else.MotherNewFamilyToNewInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNewValue(), "Something2Else.MotherNewFamilyToNewInsuranceClient__Marker_CREATE__SRC__family_Family"), getSelf());
		});
		feature2addEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getMotherToInsuranceClient__Marker_CREATE__CORR__familyToInsuranceClient(), notification -> {
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__CONSISTENCY_145_localSearch").tell(new ReferenceAdded<Something2Else.MotherToInsuranceClient__Marker, Something2Else.FamilyToInsuranceClient>(incUtil,(Something2Else.MotherToInsuranceClient__Marker) notification.getNotifier(), (Something2Else.FamilyToInsuranceClient) notification.getNewValue(), "Something2Else.MotherToInsuranceClient__Marker_CREATE__CORR__familyToInsuranceClient_FamilyToInsuranceClient"), getSelf());
		});
		feature2addEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getDaughterToInsuranceClient__Marker_CONTEXT__CORR__familyRegisterToInsuranceDB(), notification -> {
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__CONSISTENCY_16_localSearch").tell(new ReferenceAdded<Something2Else.DaughterToInsuranceClient__Marker, Something2Else.FamilyRegisterToInsuranceDatabase>(incUtil,(Something2Else.DaughterToInsuranceClient__Marker) notification.getNotifier(), (Something2Else.FamilyRegisterToInsuranceDatabase) notification.getNewValue(), "Something2Else.DaughterToInsuranceClient__Marker_CONTEXT__CORR__familyRegisterToInsuranceDB_FamilyRegisterToInsuranceDatabase"), getSelf());
		});
		feature2addEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getFamilyRegisterToInsuranceDatabase__Marker_CREATE__CORR__famRegToInsDb(), notification -> {
			incUtil.newMessage();
			name2actor.get("FamilyRegisterToInsuranceDatabase__CONSISTENCY_33_localSearch").tell(new ReferenceAdded<Something2Else.FamilyRegisterToInsuranceDatabase__Marker, Something2Else.FamilyRegisterToInsuranceDatabase>(incUtil,(Something2Else.FamilyRegisterToInsuranceDatabase__Marker) notification.getNotifier(), (Something2Else.FamilyRegisterToInsuranceDatabase) notification.getNewValue(), "Something2Else.FamilyRegisterToInsuranceDatabase__Marker_CREATE__CORR__famRegToInsDb_FamilyRegisterToInsuranceDatabase"), getSelf());
		});
		feature2addEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getMemberToInsuranceClient_Source(), notification -> {
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__CONSISTENCY_16_localSearch").tell(new ReferenceAdded<Something2Else.MemberToInsuranceClient, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil,(Something2Else.MemberToInsuranceClient) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNewValue(), "Something2Else.MemberToInsuranceClient_source_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__CONSISTENCY_53_localSearch").tell(new ReferenceAdded<Something2Else.MemberToInsuranceClient, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil,(Something2Else.MemberToInsuranceClient) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNewValue(), "Something2Else.MemberToInsuranceClient_source_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__CONSISTENCY_84_localSearch").tell(new ReferenceAdded<Something2Else.MemberToInsuranceClient, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil,(Something2Else.MemberToInsuranceClient) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNewValue(), "Something2Else.MemberToInsuranceClient_source_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__CONSISTENCY_114_localSearch").tell(new ReferenceAdded<Something2Else.MemberToInsuranceClient, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil,(Something2Else.MemberToInsuranceClient) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNewValue(), "Something2Else.MemberToInsuranceClient_source_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__CONSISTENCY_145_localSearch").tell(new ReferenceAdded<Something2Else.MemberToInsuranceClient, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil,(Something2Else.MemberToInsuranceClient) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNewValue(), "Something2Else.MemberToInsuranceClient_source_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__CONSISTENCY_176_localSearch").tell(new ReferenceAdded<Something2Else.MemberToInsuranceClient, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil,(Something2Else.MemberToInsuranceClient) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNewValue(), "Something2Else.MemberToInsuranceClient_source_Member"), getSelf());
		});
		feature2addEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getDaughterToInsuranceClient__Marker_CREATE__CORR__familyToInsuranceClient(), notification -> {
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__CONSISTENCY_16_localSearch").tell(new ReferenceAdded<Something2Else.DaughterToInsuranceClient__Marker, Something2Else.FamilyToInsuranceClient>(incUtil,(Something2Else.DaughterToInsuranceClient__Marker) notification.getNotifier(), (Something2Else.FamilyToInsuranceClient) notification.getNewValue(), "Something2Else.DaughterToInsuranceClient__Marker_CREATE__CORR__familyToInsuranceClient_FamilyToInsuranceClient"), getSelf());
		});
		feature2addEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getDaughterToInsuranceClient__Marker_CONTEXT__SRC__family(), notification -> {
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__CONSISTENCY_16_localSearch").tell(new ReferenceAdded<Something2Else.DaughterToInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil,(Something2Else.DaughterToInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNewValue(), "Something2Else.DaughterToInsuranceClient__Marker_CONTEXT__SRC__family_Family"), getSelf());
		});
		feature2addEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getFatherNewFamilyToNewInsuranceClient__Marker_CONTEXT__TRG__insuranceDB(), notification -> {
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__CONSISTENCY_53_localSearch").tell(new ReferenceAdded<Something2Else.FatherNewFamilyToNewInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil,(Something2Else.FatherNewFamilyToNewInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNewValue(), "Something2Else.FatherNewFamilyToNewInsuranceClient__Marker_CONTEXT__TRG__insuranceDB_InsuranceDatabase"), getSelf());
		});
		feature2addEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getSonToInsuranceClient__Marker_CONTEXT__SRC__familyRegister(), notification -> {
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__CONSISTENCY_176_localSearch").tell(new ReferenceAdded<Something2Else.SonToInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil,(Something2Else.SonToInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNewValue(), "Something2Else.SonToInsuranceClient__Marker_CONTEXT__SRC__familyRegister_FamilyRegister"), getSelf());
		});
		feature2addEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getDaughterToInsuranceClient__Marker_CREATE__TRG__insuranceClient(), notification -> {
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__CONSISTENCY_16_localSearch").tell(new ReferenceAdded<Something2Else.DaughterToInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil,(Something2Else.DaughterToInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getNewValue(), "Something2Else.DaughterToInsuranceClient__Marker_CREATE__TRG__insuranceClient_InsuranceClient"), getSelf());
		});
		feature2addEdgeConsumer.put(edu.kit.ipd.sdq.metamodels.insurance.InsurancePackage.eINSTANCE.getInsuranceDatabase_Insuranceclient(), notification -> {
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__BWD_1_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil,(edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase_insuranceclient_InsuranceClient"), getSelf());
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__CONSISTENCY_16_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil,(edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase_insuranceclient_InsuranceClient"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__BWD_39_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil,(edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase_insuranceclient_InsuranceClient"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__CONSISTENCY_53_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil,(edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase_insuranceclient_InsuranceClient"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__BWD_69_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil,(edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase_insuranceclient_InsuranceClient"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__CONSISTENCY_84_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil,(edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase_insuranceclient_InsuranceClient"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__BWD_100_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil,(edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase_insuranceclient_InsuranceClient"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__CONSISTENCY_114_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil,(edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase_insuranceclient_InsuranceClient"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__BWD_130_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil,(edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase_insuranceclient_InsuranceClient"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__CONSISTENCY_145_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil,(edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase_insuranceclient_InsuranceClient"), getSelf());
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__BWD_161_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil,(edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase_insuranceclient_InsuranceClient"), getSelf());
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__CONSISTENCY_176_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil,(edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase_insuranceclient_InsuranceClient"), getSelf());
		});
		feature2addEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getFamilyRegisterToInsuranceDatabase__Marker_CREATE__SRC__familyRegister(), notification -> {
			incUtil.newMessage();
			name2actor.get("FamilyRegisterToInsuranceDatabase__CONSISTENCY_33_localSearch").tell(new ReferenceAdded<Something2Else.FamilyRegisterToInsuranceDatabase__Marker, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil,(Something2Else.FamilyRegisterToInsuranceDatabase__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNewValue(), "Something2Else.FamilyRegisterToInsuranceDatabase__Marker_CREATE__SRC__familyRegister_FamilyRegister"), getSelf());
		});
		feature2addEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getMotherNewFamilyToNewInsuranceClient__Marker_CREATE__TRG__insuranceClient(), notification -> {
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__CONSISTENCY_114_localSearch").tell(new ReferenceAdded<Something2Else.MotherNewFamilyToNewInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil,(Something2Else.MotherNewFamilyToNewInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getNewValue(), "Something2Else.MotherNewFamilyToNewInsuranceClient__Marker_CREATE__TRG__insuranceClient_InsuranceClient"), getSelf());
		});
		feature2addEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getMotherToInsuranceClient__Marker_CREATE__SRC__mother(), notification -> {
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__CONSISTENCY_145_localSearch").tell(new ReferenceAdded<Something2Else.MotherToInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil,(Something2Else.MotherToInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNewValue(), "Something2Else.MotherToInsuranceClient__Marker_CREATE__SRC__mother_Member"), getSelf());
		});
		feature2addEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getFatherToInsuranceClient__Marker_CONTEXT__CORR__familyRegisterToInsuranceDB(), notification -> {
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__CONSISTENCY_84_localSearch").tell(new ReferenceAdded<Something2Else.FatherToInsuranceClient__Marker, Something2Else.FamilyRegisterToInsuranceDatabase>(incUtil,(Something2Else.FatherToInsuranceClient__Marker) notification.getNotifier(), (Something2Else.FamilyRegisterToInsuranceDatabase) notification.getNewValue(), "Something2Else.FatherToInsuranceClient__Marker_CONTEXT__CORR__familyRegisterToInsuranceDB_FamilyRegisterToInsuranceDatabase"), getSelf());
		});
		feature2addEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getMotherToInsuranceClient__Marker_CONTEXT__SRC__familyRegister(), notification -> {
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__CONSISTENCY_145_localSearch").tell(new ReferenceAdded<Something2Else.MotherToInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil,(Something2Else.MotherToInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNewValue(), "Something2Else.MotherToInsuranceClient__Marker_CONTEXT__SRC__familyRegister_FamilyRegister"), getSelf());
		});
		feature2addEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getFatherToInsuranceClient__Marker_CREATE__TRG__insuranceClient(), notification -> {
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__CONSISTENCY_84_localSearch").tell(new ReferenceAdded<Something2Else.FatherToInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil,(Something2Else.FatherToInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getNewValue(), "Something2Else.FatherToInsuranceClient__Marker_CREATE__TRG__insuranceClient_InsuranceClient"), getSelf());
		});
		feature2addEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getFamilyRegisterToInsuranceDatabase_Source(), notification -> {
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__BWD_1_localSearch").tell(new ReferenceAdded<Something2Else.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil,(Something2Else.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNewValue(), "Something2Else.FamilyRegisterToInsuranceDatabase_source_FamilyRegister"), getSelf());
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__CONSISTENCY_16_localSearch").tell(new ReferenceAdded<Something2Else.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil,(Something2Else.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNewValue(), "Something2Else.FamilyRegisterToInsuranceDatabase_source_FamilyRegister"), getSelf());
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__FWD_26_localSearch").tell(new ReferenceAdded<Something2Else.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil,(Something2Else.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNewValue(), "Something2Else.FamilyRegisterToInsuranceDatabase_source_FamilyRegister"), getSelf());
			incUtil.newMessage();
			name2actor.get("FamilyRegisterToInsuranceDatabase__CONSISTENCY_33_localSearch").tell(new ReferenceAdded<Something2Else.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil,(Something2Else.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNewValue(), "Something2Else.FamilyRegisterToInsuranceDatabase_source_FamilyRegister"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__BWD_39_localSearch").tell(new ReferenceAdded<Something2Else.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil,(Something2Else.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNewValue(), "Something2Else.FamilyRegisterToInsuranceDatabase_source_FamilyRegister"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__CONSISTENCY_53_localSearch").tell(new ReferenceAdded<Something2Else.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil,(Something2Else.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNewValue(), "Something2Else.FamilyRegisterToInsuranceDatabase_source_FamilyRegister"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__FWD_63_localSearch").tell(new ReferenceAdded<Something2Else.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil,(Something2Else.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNewValue(), "Something2Else.FamilyRegisterToInsuranceDatabase_source_FamilyRegister"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__BWD_69_localSearch").tell(new ReferenceAdded<Something2Else.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil,(Something2Else.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNewValue(), "Something2Else.FamilyRegisterToInsuranceDatabase_source_FamilyRegister"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__CONSISTENCY_84_localSearch").tell(new ReferenceAdded<Something2Else.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil,(Something2Else.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNewValue(), "Something2Else.FamilyRegisterToInsuranceDatabase_source_FamilyRegister"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__FWD_94_localSearch").tell(new ReferenceAdded<Something2Else.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil,(Something2Else.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNewValue(), "Something2Else.FamilyRegisterToInsuranceDatabase_source_FamilyRegister"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__BWD_100_localSearch").tell(new ReferenceAdded<Something2Else.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil,(Something2Else.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNewValue(), "Something2Else.FamilyRegisterToInsuranceDatabase_source_FamilyRegister"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__CONSISTENCY_114_localSearch").tell(new ReferenceAdded<Something2Else.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil,(Something2Else.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNewValue(), "Something2Else.FamilyRegisterToInsuranceDatabase_source_FamilyRegister"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__FWD_124_localSearch").tell(new ReferenceAdded<Something2Else.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil,(Something2Else.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNewValue(), "Something2Else.FamilyRegisterToInsuranceDatabase_source_FamilyRegister"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__BWD_130_localSearch").tell(new ReferenceAdded<Something2Else.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil,(Something2Else.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNewValue(), "Something2Else.FamilyRegisterToInsuranceDatabase_source_FamilyRegister"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__CONSISTENCY_145_localSearch").tell(new ReferenceAdded<Something2Else.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil,(Something2Else.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNewValue(), "Something2Else.FamilyRegisterToInsuranceDatabase_source_FamilyRegister"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__FWD_155_localSearch").tell(new ReferenceAdded<Something2Else.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil,(Something2Else.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNewValue(), "Something2Else.FamilyRegisterToInsuranceDatabase_source_FamilyRegister"), getSelf());
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__BWD_161_localSearch").tell(new ReferenceAdded<Something2Else.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil,(Something2Else.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNewValue(), "Something2Else.FamilyRegisterToInsuranceDatabase_source_FamilyRegister"), getSelf());
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__CONSISTENCY_176_localSearch").tell(new ReferenceAdded<Something2Else.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil,(Something2Else.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNewValue(), "Something2Else.FamilyRegisterToInsuranceDatabase_source_FamilyRegister"), getSelf());
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__FWD_186_localSearch").tell(new ReferenceAdded<Something2Else.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil,(Something2Else.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNewValue(), "Something2Else.FamilyRegisterToInsuranceDatabase_source_FamilyRegister"), getSelf());
		});
		feature2addEdgeConsumer.put(edu.kit.ipd.sdq.metamodels.families.FamiliesPackage.eINSTANCE.getFamily_Mother(), notification -> {
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient_daughter_mother_incoming_SRC__FILTER_NAC_SRC_13_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil,(edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.Family_mother_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient_father_mother_incoming_SRC__FILTER_NAC_SRC_50_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil,(edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.Family_mother_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient_father_mother_incoming_SRC__FILTER_NAC_SRC_81_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil,(edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.Family_mother_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__CONSISTENCY_114_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil,(edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.Family_mother_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__FWD_124_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil,(edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.Family_mother_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__CONSISTENCY_145_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil,(edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.Family_mother_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__FWD_155_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil,(edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.Family_mother_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient_son_mother_incoming_SRC__FILTER_NAC_SRC_173_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil,(edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.Family_mother_Member"), getSelf());
		});
		feature2addEdgeConsumer.put(edu.kit.ipd.sdq.metamodels.families.FamiliesPackage.eINSTANCE.getMember_FamilyDaughter(), notification -> {
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__CONSISTENCY_16_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.Member, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil,(edu.kit.ipd.sdq.metamodels.families.Member) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.Member_familyDaughter_Family"), getSelf());
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__FWD_26_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.Member, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil,(edu.kit.ipd.sdq.metamodels.families.Member) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.Member_familyDaughter_Family"), getSelf());
		});
		feature2addEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getMotherNewFamilyToNewInsuranceClient__Marker_CREATE__SRC__mother(), notification -> {
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__CONSISTENCY_114_localSearch").tell(new ReferenceAdded<Something2Else.MotherNewFamilyToNewInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil,(Something2Else.MotherNewFamilyToNewInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNewValue(), "Something2Else.MotherNewFamilyToNewInsuranceClient__Marker_CREATE__SRC__mother_Member"), getSelf());
		});
		feature2addEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getMotherToInsuranceClient__Marker_CONTEXT__TRG__insuranceDB(), notification -> {
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__CONSISTENCY_145_localSearch").tell(new ReferenceAdded<Something2Else.MotherToInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil,(Something2Else.MotherToInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNewValue(), "Something2Else.MotherToInsuranceClient__Marker_CONTEXT__TRG__insuranceDB_InsuranceDatabase"), getSelf());
		});
		feature2addEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getSonToInsuranceClient__Marker_CONTEXT__SRC__family(), notification -> {
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__CONSISTENCY_176_localSearch").tell(new ReferenceAdded<Something2Else.SonToInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil,(Something2Else.SonToInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNewValue(), "Something2Else.SonToInsuranceClient__Marker_CONTEXT__SRC__family_Family"), getSelf());
		});
		feature2addEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getFatherNewFamilyToNewInsuranceClient__Marker_CONTEXT__CORR__familyRegisterToInsuranceDB(), notification -> {
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__CONSISTENCY_53_localSearch").tell(new ReferenceAdded<Something2Else.FatherNewFamilyToNewInsuranceClient__Marker, Something2Else.FamilyRegisterToInsuranceDatabase>(incUtil,(Something2Else.FatherNewFamilyToNewInsuranceClient__Marker) notification.getNotifier(), (Something2Else.FamilyRegisterToInsuranceDatabase) notification.getNewValue(), "Something2Else.FatherNewFamilyToNewInsuranceClient__Marker_CONTEXT__CORR__familyRegisterToInsuranceDB_FamilyRegisterToInsuranceDatabase"), getSelf());
		});
		feature2addEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getMotherToInsuranceClient__Marker_CONTEXT__SRC__family(), notification -> {
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__CONSISTENCY_145_localSearch").tell(new ReferenceAdded<Something2Else.MotherToInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil,(Something2Else.MotherToInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNewValue(), "Something2Else.MotherToInsuranceClient__Marker_CONTEXT__SRC__family_Family"), getSelf());
		});
		feature2addEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getMemberToInsuranceClient_Target(), notification -> {
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__CONSISTENCY_16_localSearch").tell(new ReferenceAdded<Something2Else.MemberToInsuranceClient, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil,(Something2Else.MemberToInsuranceClient) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getNewValue(), "Something2Else.MemberToInsuranceClient_target_InsuranceClient"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__CONSISTENCY_53_localSearch").tell(new ReferenceAdded<Something2Else.MemberToInsuranceClient, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil,(Something2Else.MemberToInsuranceClient) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getNewValue(), "Something2Else.MemberToInsuranceClient_target_InsuranceClient"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__CONSISTENCY_84_localSearch").tell(new ReferenceAdded<Something2Else.MemberToInsuranceClient, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil,(Something2Else.MemberToInsuranceClient) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getNewValue(), "Something2Else.MemberToInsuranceClient_target_InsuranceClient"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__CONSISTENCY_114_localSearch").tell(new ReferenceAdded<Something2Else.MemberToInsuranceClient, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil,(Something2Else.MemberToInsuranceClient) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getNewValue(), "Something2Else.MemberToInsuranceClient_target_InsuranceClient"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__CONSISTENCY_145_localSearch").tell(new ReferenceAdded<Something2Else.MemberToInsuranceClient, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil,(Something2Else.MemberToInsuranceClient) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getNewValue(), "Something2Else.MemberToInsuranceClient_target_InsuranceClient"), getSelf());
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__CONSISTENCY_176_localSearch").tell(new ReferenceAdded<Something2Else.MemberToInsuranceClient, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil,(Something2Else.MemberToInsuranceClient) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getNewValue(), "Something2Else.MemberToInsuranceClient_target_InsuranceClient"), getSelf());
		});
		feature2addEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getFamilyToInsuranceClient_Source(), notification -> {
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__CONSISTENCY_16_localSearch").tell(new ReferenceAdded<Something2Else.FamilyToInsuranceClient, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil,(Something2Else.FamilyToInsuranceClient) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNewValue(), "Something2Else.FamilyToInsuranceClient_source_Family"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__CONSISTENCY_53_localSearch").tell(new ReferenceAdded<Something2Else.FamilyToInsuranceClient, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil,(Something2Else.FamilyToInsuranceClient) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNewValue(), "Something2Else.FamilyToInsuranceClient_source_Family"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__CONSISTENCY_84_localSearch").tell(new ReferenceAdded<Something2Else.FamilyToInsuranceClient, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil,(Something2Else.FamilyToInsuranceClient) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNewValue(), "Something2Else.FamilyToInsuranceClient_source_Family"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__CONSISTENCY_114_localSearch").tell(new ReferenceAdded<Something2Else.FamilyToInsuranceClient, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil,(Something2Else.FamilyToInsuranceClient) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNewValue(), "Something2Else.FamilyToInsuranceClient_source_Family"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__CONSISTENCY_145_localSearch").tell(new ReferenceAdded<Something2Else.FamilyToInsuranceClient, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil,(Something2Else.FamilyToInsuranceClient) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNewValue(), "Something2Else.FamilyToInsuranceClient_source_Family"), getSelf());
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__CONSISTENCY_176_localSearch").tell(new ReferenceAdded<Something2Else.FamilyToInsuranceClient, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil,(Something2Else.FamilyToInsuranceClient) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNewValue(), "Something2Else.FamilyToInsuranceClient_source_Family"), getSelf());
		});
		feature2addEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getSonToInsuranceClient__Marker_CREATE__CORR__memberToInsuranceClient(), notification -> {
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__CONSISTENCY_176_localSearch").tell(new ReferenceAdded<Something2Else.SonToInsuranceClient__Marker, Something2Else.MemberToInsuranceClient>(incUtil,(Something2Else.SonToInsuranceClient__Marker) notification.getNotifier(), (Something2Else.MemberToInsuranceClient) notification.getNewValue(), "Something2Else.SonToInsuranceClient__Marker_CREATE__CORR__memberToInsuranceClient_MemberToInsuranceClient"), getSelf());
		});
		feature2addEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getSonToInsuranceClient__Marker_CREATE__SRC__son(), notification -> {
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__CONSISTENCY_176_localSearch").tell(new ReferenceAdded<Something2Else.SonToInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil,(Something2Else.SonToInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNewValue(), "Something2Else.SonToInsuranceClient__Marker_CREATE__SRC__son_Member"), getSelf());
		});
		feature2addEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getMotherNewFamilyToNewInsuranceClient__Marker_CONTEXT__TRG__insuranceDB(), notification -> {
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__CONSISTENCY_114_localSearch").tell(new ReferenceAdded<Something2Else.MotherNewFamilyToNewInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil,(Something2Else.MotherNewFamilyToNewInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNewValue(), "Something2Else.MotherNewFamilyToNewInsuranceClient__Marker_CONTEXT__TRG__insuranceDB_InsuranceDatabase"), getSelf());
		});
		feature2addEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getDaughterToInsuranceClient__Marker_CONTEXT__TRG__insuranceDB(), notification -> {
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__CONSISTENCY_16_localSearch").tell(new ReferenceAdded<Something2Else.DaughterToInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil,(Something2Else.DaughterToInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNewValue(), "Something2Else.DaughterToInsuranceClient__Marker_CONTEXT__TRG__insuranceDB_InsuranceDatabase"), getSelf());
		});
		feature2addEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getFatherToInsuranceClient__Marker_CONTEXT__SRC__familyRegister(), notification -> {
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__CONSISTENCY_84_localSearch").tell(new ReferenceAdded<Something2Else.FatherToInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil,(Something2Else.FatherToInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNewValue(), "Something2Else.FatherToInsuranceClient__Marker_CONTEXT__SRC__familyRegister_FamilyRegister"), getSelf());
		});
		feature2addEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getFatherToInsuranceClient__Marker_CREATE__CORR__memberToInsuranceClient(), notification -> {
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__CONSISTENCY_84_localSearch").tell(new ReferenceAdded<Something2Else.FatherToInsuranceClient__Marker, Something2Else.MemberToInsuranceClient>(incUtil,(Something2Else.FatherToInsuranceClient__Marker) notification.getNotifier(), (Something2Else.MemberToInsuranceClient) notification.getNewValue(), "Something2Else.FatherToInsuranceClient__Marker_CREATE__CORR__memberToInsuranceClient_MemberToInsuranceClient"), getSelf());
		});
		feature2addEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getFatherToInsuranceClient__Marker_CONTEXT__SRC__family(), notification -> {
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__CONSISTENCY_84_localSearch").tell(new ReferenceAdded<Something2Else.FatherToInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil,(Something2Else.FatherToInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNewValue(), "Something2Else.FatherToInsuranceClient__Marker_CONTEXT__SRC__family_Family"), getSelf());
		});
		feature2addEdgeConsumer.put(edu.kit.ipd.sdq.metamodels.families.FamiliesPackage.eINSTANCE.getFamily_Daughters(), notification -> {
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient_father_daughters_incoming_SRC__FILTER_NAC_SRC_47_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil,(edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.Family_daughters_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient_father_daughters_incoming_SRC__FILTER_NAC_SRC_78_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil,(edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.Family_daughters_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient_mother_daughters_incoming_SRC__FILTER_NAC_SRC_108_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil,(edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.Family_daughters_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient_mother_daughters_incoming_SRC__FILTER_NAC_SRC_139_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil,(edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.Family_daughters_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient_son_daughters_incoming_SRC__FILTER_NAC_SRC_167_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil,(edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.Family_daughters_Member"), getSelf());
		});
		feature2addEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getFatherNewFamilyToNewInsuranceClient__Marker_CREATE__SRC__father(), notification -> {
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__CONSISTENCY_53_localSearch").tell(new ReferenceAdded<Something2Else.FatherNewFamilyToNewInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil,(Something2Else.FatherNewFamilyToNewInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNewValue(), "Something2Else.FatherNewFamilyToNewInsuranceClient__Marker_CREATE__SRC__father_Member"), getSelf());
		});
		feature2addEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getFatherToInsuranceClient__Marker_CONTEXT__TRG__insuranceDB(), notification -> {
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__CONSISTENCY_84_localSearch").tell(new ReferenceAdded<Something2Else.FatherToInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil,(Something2Else.FatherToInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNewValue(), "Something2Else.FatherToInsuranceClient__Marker_CONTEXT__TRG__insuranceDB_InsuranceDatabase"), getSelf());
		});
	}
	
	private void initializeRemoveEdge() {
		feature2removeEdgeConsumer.put(edu.kit.ipd.sdq.metamodels.families.FamiliesPackage.eINSTANCE.getFamilyRegister_Families(), notification -> {
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__BWD_1_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.FamilyRegister, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.FamilyRegister_families_Family"), getSelf());
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__CONSISTENCY_16_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.FamilyRegister, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.FamilyRegister_families_Family"), getSelf());
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__FWD_26_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.FamilyRegister, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.FamilyRegister_families_Family"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__CONSISTENCY_53_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.FamilyRegister, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.FamilyRegister_families_Family"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__FWD_63_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.FamilyRegister, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.FamilyRegister_families_Family"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__BWD_69_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.FamilyRegister, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.FamilyRegister_families_Family"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__CONSISTENCY_84_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.FamilyRegister, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.FamilyRegister_families_Family"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__FWD_94_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.FamilyRegister, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.FamilyRegister_families_Family"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__CONSISTENCY_114_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.FamilyRegister, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.FamilyRegister_families_Family"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__FWD_124_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.FamilyRegister, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.FamilyRegister_families_Family"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__BWD_130_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.FamilyRegister, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.FamilyRegister_families_Family"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__CONSISTENCY_145_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.FamilyRegister, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.FamilyRegister_families_Family"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__FWD_155_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.FamilyRegister, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.FamilyRegister_families_Family"), getSelf());
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__BWD_161_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.FamilyRegister, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.FamilyRegister_families_Family"), getSelf());
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__CONSISTENCY_176_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.FamilyRegister, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.FamilyRegister_families_Family"), getSelf());
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__FWD_186_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.FamilyRegister, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.FamilyRegister_families_Family"), getSelf());
		});
		feature2removeEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getDaughterToInsuranceClient__Marker_CREATE__SRC__daughter(), notification -> {
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__CONSISTENCY_16_localSearch").tell(new ReferenceDeleted<Something2Else.DaughterToInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (Something2Else.DaughterToInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getOldValue(), "Something2Else.DaughterToInsuranceClient__Marker_CREATE__SRC__daughter_Member"), getSelf());
		});
		feature2removeEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getMotherNewFamilyToNewInsuranceClient__Marker_CREATE__CORR__memberToInsuranceClient(), notification -> {
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__CONSISTENCY_114_localSearch").tell(new ReferenceDeleted<Something2Else.MotherNewFamilyToNewInsuranceClient__Marker, Something2Else.MemberToInsuranceClient>(incUtil, (Something2Else.MotherNewFamilyToNewInsuranceClient__Marker) notification.getNotifier(), (Something2Else.MemberToInsuranceClient) notification.getOldValue(), "Something2Else.MotherNewFamilyToNewInsuranceClient__Marker_CREATE__CORR__memberToInsuranceClient_MemberToInsuranceClient"), getSelf());
		});
		feature2removeEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getMotherToInsuranceClient__Marker_CREATE__TRG__insuranceClient(), notification -> {
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__CONSISTENCY_145_localSearch").tell(new ReferenceDeleted<Something2Else.MotherToInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil, (Something2Else.MotherToInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getOldValue(), "Something2Else.MotherToInsuranceClient__Marker_CREATE__TRG__insuranceClient_InsuranceClient"), getSelf());
		});
		feature2removeEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getFamilyRegisterToInsuranceDatabase__Marker_CREATE__TRG__insuranceDb(), notification -> {
			incUtil.newMessage();
			name2actor.get("FamilyRegisterToInsuranceDatabase__CONSISTENCY_33_localSearch").tell(new ReferenceDeleted<Something2Else.FamilyRegisterToInsuranceDatabase__Marker, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil, (Something2Else.FamilyRegisterToInsuranceDatabase__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getOldValue(), "Something2Else.FamilyRegisterToInsuranceDatabase__Marker_CREATE__TRG__insuranceDb_InsuranceDatabase"), getSelf());
		});
		feature2removeEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getFatherToInsuranceClient__Marker_CREATE__CORR__familyToInsuranceClient(), notification -> {
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__CONSISTENCY_84_localSearch").tell(new ReferenceDeleted<Something2Else.FatherToInsuranceClient__Marker, Something2Else.FamilyToInsuranceClient>(incUtil, (Something2Else.FatherToInsuranceClient__Marker) notification.getNotifier(), (Something2Else.FamilyToInsuranceClient) notification.getOldValue(), "Something2Else.FatherToInsuranceClient__Marker_CREATE__CORR__familyToInsuranceClient_FamilyToInsuranceClient"), getSelf());
		});
		feature2removeEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getFatherNewFamilyToNewInsuranceClient__Marker_CONTEXT__SRC__familyRegister(), notification -> {
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__CONSISTENCY_53_localSearch").tell(new ReferenceDeleted<Something2Else.FatherNewFamilyToNewInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil, (Something2Else.FatherNewFamilyToNewInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getOldValue(), "Something2Else.FatherNewFamilyToNewInsuranceClient__Marker_CONTEXT__SRC__familyRegister_FamilyRegister"), getSelf());
		});
		feature2removeEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getSonToInsuranceClient__Marker_CONTEXT__TRG__insuranceDB(), notification -> {
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__CONSISTENCY_176_localSearch").tell(new ReferenceDeleted<Something2Else.SonToInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil, (Something2Else.SonToInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getOldValue(), "Something2Else.SonToInsuranceClient__Marker_CONTEXT__TRG__insuranceDB_InsuranceDatabase"), getSelf());
		});
		feature2removeEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getDaughterToInsuranceClient__Marker_CONTEXT__SRC__familyRegister(), notification -> {
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__CONSISTENCY_16_localSearch").tell(new ReferenceDeleted<Something2Else.DaughterToInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil, (Something2Else.DaughterToInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getOldValue(), "Something2Else.DaughterToInsuranceClient__Marker_CONTEXT__SRC__familyRegister_FamilyRegister"), getSelf());
		});
		feature2removeEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getFamilyRegisterToInsuranceDatabase_Target(), notification -> {
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__BWD_1_localSearch").tell(new ReferenceDeleted<Something2Else.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil, (Something2Else.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getOldValue(), "Something2Else.FamilyRegisterToInsuranceDatabase_target_InsuranceDatabase"), getSelf());
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__CONSISTENCY_16_localSearch").tell(new ReferenceDeleted<Something2Else.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil, (Something2Else.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getOldValue(), "Something2Else.FamilyRegisterToInsuranceDatabase_target_InsuranceDatabase"), getSelf());
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__FWD_26_localSearch").tell(new ReferenceDeleted<Something2Else.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil, (Something2Else.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getOldValue(), "Something2Else.FamilyRegisterToInsuranceDatabase_target_InsuranceDatabase"), getSelf());
			incUtil.newMessage();
			name2actor.get("FamilyRegisterToInsuranceDatabase__CONSISTENCY_33_localSearch").tell(new ReferenceDeleted<Something2Else.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil, (Something2Else.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getOldValue(), "Something2Else.FamilyRegisterToInsuranceDatabase_target_InsuranceDatabase"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__BWD_39_localSearch").tell(new ReferenceDeleted<Something2Else.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil, (Something2Else.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getOldValue(), "Something2Else.FamilyRegisterToInsuranceDatabase_target_InsuranceDatabase"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__CONSISTENCY_53_localSearch").tell(new ReferenceDeleted<Something2Else.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil, (Something2Else.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getOldValue(), "Something2Else.FamilyRegisterToInsuranceDatabase_target_InsuranceDatabase"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__FWD_63_localSearch").tell(new ReferenceDeleted<Something2Else.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil, (Something2Else.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getOldValue(), "Something2Else.FamilyRegisterToInsuranceDatabase_target_InsuranceDatabase"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__BWD_69_localSearch").tell(new ReferenceDeleted<Something2Else.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil, (Something2Else.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getOldValue(), "Something2Else.FamilyRegisterToInsuranceDatabase_target_InsuranceDatabase"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__CONSISTENCY_84_localSearch").tell(new ReferenceDeleted<Something2Else.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil, (Something2Else.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getOldValue(), "Something2Else.FamilyRegisterToInsuranceDatabase_target_InsuranceDatabase"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__FWD_94_localSearch").tell(new ReferenceDeleted<Something2Else.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil, (Something2Else.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getOldValue(), "Something2Else.FamilyRegisterToInsuranceDatabase_target_InsuranceDatabase"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__BWD_100_localSearch").tell(new ReferenceDeleted<Something2Else.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil, (Something2Else.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getOldValue(), "Something2Else.FamilyRegisterToInsuranceDatabase_target_InsuranceDatabase"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__CONSISTENCY_114_localSearch").tell(new ReferenceDeleted<Something2Else.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil, (Something2Else.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getOldValue(), "Something2Else.FamilyRegisterToInsuranceDatabase_target_InsuranceDatabase"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__FWD_124_localSearch").tell(new ReferenceDeleted<Something2Else.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil, (Something2Else.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getOldValue(), "Something2Else.FamilyRegisterToInsuranceDatabase_target_InsuranceDatabase"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__BWD_130_localSearch").tell(new ReferenceDeleted<Something2Else.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil, (Something2Else.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getOldValue(), "Something2Else.FamilyRegisterToInsuranceDatabase_target_InsuranceDatabase"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__CONSISTENCY_145_localSearch").tell(new ReferenceDeleted<Something2Else.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil, (Something2Else.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getOldValue(), "Something2Else.FamilyRegisterToInsuranceDatabase_target_InsuranceDatabase"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__FWD_155_localSearch").tell(new ReferenceDeleted<Something2Else.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil, (Something2Else.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getOldValue(), "Something2Else.FamilyRegisterToInsuranceDatabase_target_InsuranceDatabase"), getSelf());
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__BWD_161_localSearch").tell(new ReferenceDeleted<Something2Else.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil, (Something2Else.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getOldValue(), "Something2Else.FamilyRegisterToInsuranceDatabase_target_InsuranceDatabase"), getSelf());
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__CONSISTENCY_176_localSearch").tell(new ReferenceDeleted<Something2Else.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil, (Something2Else.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getOldValue(), "Something2Else.FamilyRegisterToInsuranceDatabase_target_InsuranceDatabase"), getSelf());
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__FWD_186_localSearch").tell(new ReferenceDeleted<Something2Else.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil, (Something2Else.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getOldValue(), "Something2Else.FamilyRegisterToInsuranceDatabase_target_InsuranceDatabase"), getSelf());
		});
		feature2removeEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getFatherToInsuranceClient__Marker_CREATE__SRC__father(), notification -> {
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__CONSISTENCY_84_localSearch").tell(new ReferenceDeleted<Something2Else.FatherToInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (Something2Else.FatherToInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getOldValue(), "Something2Else.FatherToInsuranceClient__Marker_CREATE__SRC__father_Member"), getSelf());
		});
		feature2removeEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getDaughterToInsuranceClient__Marker_CREATE__CORR__memberToInsuranceClient(), notification -> {
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__CONSISTENCY_16_localSearch").tell(new ReferenceDeleted<Something2Else.DaughterToInsuranceClient__Marker, Something2Else.MemberToInsuranceClient>(incUtil, (Something2Else.DaughterToInsuranceClient__Marker) notification.getNotifier(), (Something2Else.MemberToInsuranceClient) notification.getOldValue(), "Something2Else.DaughterToInsuranceClient__Marker_CREATE__CORR__memberToInsuranceClient_MemberToInsuranceClient"), getSelf());
		});
		feature2removeEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getMotherToInsuranceClient__Marker_CREATE__CORR__memberToInsuranceClient(), notification -> {
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__CONSISTENCY_145_localSearch").tell(new ReferenceDeleted<Something2Else.MotherToInsuranceClient__Marker, Something2Else.MemberToInsuranceClient>(incUtil, (Something2Else.MotherToInsuranceClient__Marker) notification.getNotifier(), (Something2Else.MemberToInsuranceClient) notification.getOldValue(), "Something2Else.MotherToInsuranceClient__Marker_CREATE__CORR__memberToInsuranceClient_MemberToInsuranceClient"), getSelf());
		});
		feature2removeEdgeConsumer.put(edu.kit.ipd.sdq.metamodels.families.FamiliesPackage.eINSTANCE.getFamily_Sons(), notification -> {
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient_daughter_sons_incoming_SRC__FILTER_NAC_SRC_7_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.Family_sons_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient_father_sons_incoming_SRC__FILTER_NAC_SRC_44_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.Family_sons_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient_father_sons_incoming_SRC__FILTER_NAC_SRC_75_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.Family_sons_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient_mother_sons_incoming_SRC__FILTER_NAC_SRC_105_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.Family_sons_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient_mother_sons_incoming_SRC__FILTER_NAC_SRC_136_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.Family_sons_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__CONSISTENCY_176_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.Family_sons_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__FWD_186_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.Family_sons_Member"), getSelf());
		});
		feature2removeEdgeConsumer.put(edu.kit.ipd.sdq.metamodels.families.FamiliesPackage.eINSTANCE.getFamily_Father(), notification -> {
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient_daughter_father_incoming_SRC__FILTER_NAC_SRC_10_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.Family_father_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__CONSISTENCY_53_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.Family_father_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__FWD_63_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.Family_father_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__CONSISTENCY_84_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.Family_father_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__FWD_94_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.Family_father_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient_mother_father_incoming_SRC__FILTER_NAC_SRC_111_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.Family_father_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient_mother_father_incoming_SRC__FILTER_NAC_SRC_142_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.Family_father_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient_son_father_incoming_SRC__FILTER_NAC_SRC_170_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.Family_father_Member"), getSelf());
		});
		feature2removeEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getMotherNewFamilyToNewInsuranceClient__Marker_CREATE__CORR__familyToInsuranceClient(), notification -> {
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__CONSISTENCY_114_localSearch").tell(new ReferenceDeleted<Something2Else.MotherNewFamilyToNewInsuranceClient__Marker, Something2Else.FamilyToInsuranceClient>(incUtil, (Something2Else.MotherNewFamilyToNewInsuranceClient__Marker) notification.getNotifier(), (Something2Else.FamilyToInsuranceClient) notification.getOldValue(), "Something2Else.MotherNewFamilyToNewInsuranceClient__Marker_CREATE__CORR__familyToInsuranceClient_FamilyToInsuranceClient"), getSelf());
		});
		feature2removeEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getFamilyToInsuranceClient_Target(), notification -> {
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__CONSISTENCY_16_localSearch").tell(new ReferenceDeleted<Something2Else.FamilyToInsuranceClient, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil, (Something2Else.FamilyToInsuranceClient) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getOldValue(), "Something2Else.FamilyToInsuranceClient_target_InsuranceClient"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__CONSISTENCY_53_localSearch").tell(new ReferenceDeleted<Something2Else.FamilyToInsuranceClient, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil, (Something2Else.FamilyToInsuranceClient) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getOldValue(), "Something2Else.FamilyToInsuranceClient_target_InsuranceClient"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__CONSISTENCY_84_localSearch").tell(new ReferenceDeleted<Something2Else.FamilyToInsuranceClient, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil, (Something2Else.FamilyToInsuranceClient) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getOldValue(), "Something2Else.FamilyToInsuranceClient_target_InsuranceClient"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__CONSISTENCY_114_localSearch").tell(new ReferenceDeleted<Something2Else.FamilyToInsuranceClient, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil, (Something2Else.FamilyToInsuranceClient) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getOldValue(), "Something2Else.FamilyToInsuranceClient_target_InsuranceClient"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__CONSISTENCY_145_localSearch").tell(new ReferenceDeleted<Something2Else.FamilyToInsuranceClient, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil, (Something2Else.FamilyToInsuranceClient) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getOldValue(), "Something2Else.FamilyToInsuranceClient_target_InsuranceClient"), getSelf());
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__CONSISTENCY_176_localSearch").tell(new ReferenceDeleted<Something2Else.FamilyToInsuranceClient, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil, (Something2Else.FamilyToInsuranceClient) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getOldValue(), "Something2Else.FamilyToInsuranceClient_target_InsuranceClient"), getSelf());
		});
		feature2removeEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getFatherNewFamilyToNewInsuranceClient__Marker_CREATE__SRC__family(), notification -> {
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__CONSISTENCY_53_localSearch").tell(new ReferenceDeleted<Something2Else.FatherNewFamilyToNewInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, (Something2Else.FatherNewFamilyToNewInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getOldValue(), "Something2Else.FatherNewFamilyToNewInsuranceClient__Marker_CREATE__SRC__family_Family"), getSelf());
		});
		feature2removeEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getFatherNewFamilyToNewInsuranceClient__Marker_CREATE__TRG__insuranceClient(), notification -> {
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__CONSISTENCY_53_localSearch").tell(new ReferenceDeleted<Something2Else.FatherNewFamilyToNewInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil, (Something2Else.FatherNewFamilyToNewInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getOldValue(), "Something2Else.FatherNewFamilyToNewInsuranceClient__Marker_CREATE__TRG__insuranceClient_InsuranceClient"), getSelf());
		});
		feature2removeEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getSonToInsuranceClient__Marker_CONTEXT__CORR__familyRegisterToInsuranceDB(), notification -> {
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__CONSISTENCY_176_localSearch").tell(new ReferenceDeleted<Something2Else.SonToInsuranceClient__Marker, Something2Else.FamilyRegisterToInsuranceDatabase>(incUtil, (Something2Else.SonToInsuranceClient__Marker) notification.getNotifier(), (Something2Else.FamilyRegisterToInsuranceDatabase) notification.getOldValue(), "Something2Else.SonToInsuranceClient__Marker_CONTEXT__CORR__familyRegisterToInsuranceDB_FamilyRegisterToInsuranceDatabase"), getSelf());
		});
		feature2removeEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getFatherNewFamilyToNewInsuranceClient__Marker_CREATE__CORR__memberToInsuranceClient(), notification -> {
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__CONSISTENCY_53_localSearch").tell(new ReferenceDeleted<Something2Else.FatherNewFamilyToNewInsuranceClient__Marker, Something2Else.MemberToInsuranceClient>(incUtil, (Something2Else.FatherNewFamilyToNewInsuranceClient__Marker) notification.getNotifier(), (Something2Else.MemberToInsuranceClient) notification.getOldValue(), "Something2Else.FatherNewFamilyToNewInsuranceClient__Marker_CREATE__CORR__memberToInsuranceClient_MemberToInsuranceClient"), getSelf());
		});
		feature2removeEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getFatherNewFamilyToNewInsuranceClient__Marker_CREATE__CORR__familyToInsuranceClient(), notification -> {
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__CONSISTENCY_53_localSearch").tell(new ReferenceDeleted<Something2Else.FatherNewFamilyToNewInsuranceClient__Marker, Something2Else.FamilyToInsuranceClient>(incUtil, (Something2Else.FatherNewFamilyToNewInsuranceClient__Marker) notification.getNotifier(), (Something2Else.FamilyToInsuranceClient) notification.getOldValue(), "Something2Else.FatherNewFamilyToNewInsuranceClient__Marker_CREATE__CORR__familyToInsuranceClient_FamilyToInsuranceClient"), getSelf());
		});
		feature2removeEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getMotherNewFamilyToNewInsuranceClient__Marker_CONTEXT__CORR__familyRegisterToInsuranceDB(), notification -> {
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__CONSISTENCY_114_localSearch").tell(new ReferenceDeleted<Something2Else.MotherNewFamilyToNewInsuranceClient__Marker, Something2Else.FamilyRegisterToInsuranceDatabase>(incUtil, (Something2Else.MotherNewFamilyToNewInsuranceClient__Marker) notification.getNotifier(), (Something2Else.FamilyRegisterToInsuranceDatabase) notification.getOldValue(), "Something2Else.MotherNewFamilyToNewInsuranceClient__Marker_CONTEXT__CORR__familyRegisterToInsuranceDB_FamilyRegisterToInsuranceDatabase"), getSelf());
		});
		feature2removeEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getMotherToInsuranceClient__Marker_CONTEXT__CORR__familyRegisterToInsuranceDB(), notification -> {
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__CONSISTENCY_145_localSearch").tell(new ReferenceDeleted<Something2Else.MotherToInsuranceClient__Marker, Something2Else.FamilyRegisterToInsuranceDatabase>(incUtil, (Something2Else.MotherToInsuranceClient__Marker) notification.getNotifier(), (Something2Else.FamilyRegisterToInsuranceDatabase) notification.getOldValue(), "Something2Else.MotherToInsuranceClient__Marker_CONTEXT__CORR__familyRegisterToInsuranceDB_FamilyRegisterToInsuranceDatabase"), getSelf());
		});
		feature2removeEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getMotherNewFamilyToNewInsuranceClient__Marker_CONTEXT__SRC__familyRegister(), notification -> {
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__CONSISTENCY_114_localSearch").tell(new ReferenceDeleted<Something2Else.MotherNewFamilyToNewInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil, (Something2Else.MotherNewFamilyToNewInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getOldValue(), "Something2Else.MotherNewFamilyToNewInsuranceClient__Marker_CONTEXT__SRC__familyRegister_FamilyRegister"), getSelf());
		});
		feature2removeEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getSonToInsuranceClient__Marker_CREATE__TRG__insuranceClient(), notification -> {
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__CONSISTENCY_176_localSearch").tell(new ReferenceDeleted<Something2Else.SonToInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil, (Something2Else.SonToInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getOldValue(), "Something2Else.SonToInsuranceClient__Marker_CREATE__TRG__insuranceClient_InsuranceClient"), getSelf());
		});
		feature2removeEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getSonToInsuranceClient__Marker_CREATE__CORR__familyToInsuranceClient(), notification -> {
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__CONSISTENCY_176_localSearch").tell(new ReferenceDeleted<Something2Else.SonToInsuranceClient__Marker, Something2Else.FamilyToInsuranceClient>(incUtil, (Something2Else.SonToInsuranceClient__Marker) notification.getNotifier(), (Something2Else.FamilyToInsuranceClient) notification.getOldValue(), "Something2Else.SonToInsuranceClient__Marker_CREATE__CORR__familyToInsuranceClient_FamilyToInsuranceClient"), getSelf());
		});
		feature2removeEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getMotherNewFamilyToNewInsuranceClient__Marker_CREATE__SRC__family(), notification -> {
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__CONSISTENCY_114_localSearch").tell(new ReferenceDeleted<Something2Else.MotherNewFamilyToNewInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, (Something2Else.MotherNewFamilyToNewInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getOldValue(), "Something2Else.MotherNewFamilyToNewInsuranceClient__Marker_CREATE__SRC__family_Family"), getSelf());
		});
		feature2removeEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getMotherToInsuranceClient__Marker_CREATE__CORR__familyToInsuranceClient(), notification -> {
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__CONSISTENCY_145_localSearch").tell(new ReferenceDeleted<Something2Else.MotherToInsuranceClient__Marker, Something2Else.FamilyToInsuranceClient>(incUtil, (Something2Else.MotherToInsuranceClient__Marker) notification.getNotifier(), (Something2Else.FamilyToInsuranceClient) notification.getOldValue(), "Something2Else.MotherToInsuranceClient__Marker_CREATE__CORR__familyToInsuranceClient_FamilyToInsuranceClient"), getSelf());
		});
		feature2removeEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getDaughterToInsuranceClient__Marker_CONTEXT__CORR__familyRegisterToInsuranceDB(), notification -> {
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__CONSISTENCY_16_localSearch").tell(new ReferenceDeleted<Something2Else.DaughterToInsuranceClient__Marker, Something2Else.FamilyRegisterToInsuranceDatabase>(incUtil, (Something2Else.DaughterToInsuranceClient__Marker) notification.getNotifier(), (Something2Else.FamilyRegisterToInsuranceDatabase) notification.getOldValue(), "Something2Else.DaughterToInsuranceClient__Marker_CONTEXT__CORR__familyRegisterToInsuranceDB_FamilyRegisterToInsuranceDatabase"), getSelf());
		});
		feature2removeEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getFamilyRegisterToInsuranceDatabase__Marker_CREATE__CORR__famRegToInsDb(), notification -> {
			incUtil.newMessage();
			name2actor.get("FamilyRegisterToInsuranceDatabase__CONSISTENCY_33_localSearch").tell(new ReferenceDeleted<Something2Else.FamilyRegisterToInsuranceDatabase__Marker, Something2Else.FamilyRegisterToInsuranceDatabase>(incUtil, (Something2Else.FamilyRegisterToInsuranceDatabase__Marker) notification.getNotifier(), (Something2Else.FamilyRegisterToInsuranceDatabase) notification.getOldValue(), "Something2Else.FamilyRegisterToInsuranceDatabase__Marker_CREATE__CORR__famRegToInsDb_FamilyRegisterToInsuranceDatabase"), getSelf());
		});
		feature2removeEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getMemberToInsuranceClient_Source(), notification -> {
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__CONSISTENCY_16_localSearch").tell(new ReferenceDeleted<Something2Else.MemberToInsuranceClient, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (Something2Else.MemberToInsuranceClient) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getOldValue(), "Something2Else.MemberToInsuranceClient_source_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__CONSISTENCY_53_localSearch").tell(new ReferenceDeleted<Something2Else.MemberToInsuranceClient, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (Something2Else.MemberToInsuranceClient) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getOldValue(), "Something2Else.MemberToInsuranceClient_source_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__CONSISTENCY_84_localSearch").tell(new ReferenceDeleted<Something2Else.MemberToInsuranceClient, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (Something2Else.MemberToInsuranceClient) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getOldValue(), "Something2Else.MemberToInsuranceClient_source_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__CONSISTENCY_114_localSearch").tell(new ReferenceDeleted<Something2Else.MemberToInsuranceClient, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (Something2Else.MemberToInsuranceClient) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getOldValue(), "Something2Else.MemberToInsuranceClient_source_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__CONSISTENCY_145_localSearch").tell(new ReferenceDeleted<Something2Else.MemberToInsuranceClient, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (Something2Else.MemberToInsuranceClient) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getOldValue(), "Something2Else.MemberToInsuranceClient_source_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__CONSISTENCY_176_localSearch").tell(new ReferenceDeleted<Something2Else.MemberToInsuranceClient, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (Something2Else.MemberToInsuranceClient) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getOldValue(), "Something2Else.MemberToInsuranceClient_source_Member"), getSelf());
		});
		feature2removeEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getDaughterToInsuranceClient__Marker_CREATE__CORR__familyToInsuranceClient(), notification -> {
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__CONSISTENCY_16_localSearch").tell(new ReferenceDeleted<Something2Else.DaughterToInsuranceClient__Marker, Something2Else.FamilyToInsuranceClient>(incUtil, (Something2Else.DaughterToInsuranceClient__Marker) notification.getNotifier(), (Something2Else.FamilyToInsuranceClient) notification.getOldValue(), "Something2Else.DaughterToInsuranceClient__Marker_CREATE__CORR__familyToInsuranceClient_FamilyToInsuranceClient"), getSelf());
		});
		feature2removeEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getDaughterToInsuranceClient__Marker_CONTEXT__SRC__family(), notification -> {
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__CONSISTENCY_16_localSearch").tell(new ReferenceDeleted<Something2Else.DaughterToInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, (Something2Else.DaughterToInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getOldValue(), "Something2Else.DaughterToInsuranceClient__Marker_CONTEXT__SRC__family_Family"), getSelf());
		});
		feature2removeEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getFatherNewFamilyToNewInsuranceClient__Marker_CONTEXT__TRG__insuranceDB(), notification -> {
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__CONSISTENCY_53_localSearch").tell(new ReferenceDeleted<Something2Else.FatherNewFamilyToNewInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil, (Something2Else.FatherNewFamilyToNewInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getOldValue(), "Something2Else.FatherNewFamilyToNewInsuranceClient__Marker_CONTEXT__TRG__insuranceDB_InsuranceDatabase"), getSelf());
		});
		feature2removeEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getSonToInsuranceClient__Marker_CONTEXT__SRC__familyRegister(), notification -> {
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__CONSISTENCY_176_localSearch").tell(new ReferenceDeleted<Something2Else.SonToInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil, (Something2Else.SonToInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getOldValue(), "Something2Else.SonToInsuranceClient__Marker_CONTEXT__SRC__familyRegister_FamilyRegister"), getSelf());
		});
		feature2removeEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getDaughterToInsuranceClient__Marker_CREATE__TRG__insuranceClient(), notification -> {
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__CONSISTENCY_16_localSearch").tell(new ReferenceDeleted<Something2Else.DaughterToInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil, (Something2Else.DaughterToInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getOldValue(), "Something2Else.DaughterToInsuranceClient__Marker_CREATE__TRG__insuranceClient_InsuranceClient"), getSelf());
		});
		feature2removeEdgeConsumer.put(edu.kit.ipd.sdq.metamodels.insurance.InsurancePackage.eINSTANCE.getInsuranceDatabase_Insuranceclient(), notification -> {
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__BWD_1_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil, (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase_insuranceclient_InsuranceClient"), getSelf());
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__CONSISTENCY_16_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil, (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase_insuranceclient_InsuranceClient"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__BWD_39_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil, (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase_insuranceclient_InsuranceClient"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__CONSISTENCY_53_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil, (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase_insuranceclient_InsuranceClient"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__BWD_69_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil, (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase_insuranceclient_InsuranceClient"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__CONSISTENCY_84_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil, (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase_insuranceclient_InsuranceClient"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__BWD_100_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil, (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase_insuranceclient_InsuranceClient"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__CONSISTENCY_114_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil, (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase_insuranceclient_InsuranceClient"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__BWD_130_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil, (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase_insuranceclient_InsuranceClient"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__CONSISTENCY_145_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil, (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase_insuranceclient_InsuranceClient"), getSelf());
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__BWD_161_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil, (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase_insuranceclient_InsuranceClient"), getSelf());
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__CONSISTENCY_176_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil, (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase_insuranceclient_InsuranceClient"), getSelf());
		});
		feature2removeEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getFamilyRegisterToInsuranceDatabase__Marker_CREATE__SRC__familyRegister(), notification -> {
			incUtil.newMessage();
			name2actor.get("FamilyRegisterToInsuranceDatabase__CONSISTENCY_33_localSearch").tell(new ReferenceDeleted<Something2Else.FamilyRegisterToInsuranceDatabase__Marker, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil, (Something2Else.FamilyRegisterToInsuranceDatabase__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getOldValue(), "Something2Else.FamilyRegisterToInsuranceDatabase__Marker_CREATE__SRC__familyRegister_FamilyRegister"), getSelf());
		});
		feature2removeEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getMotherNewFamilyToNewInsuranceClient__Marker_CREATE__TRG__insuranceClient(), notification -> {
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__CONSISTENCY_114_localSearch").tell(new ReferenceDeleted<Something2Else.MotherNewFamilyToNewInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil, (Something2Else.MotherNewFamilyToNewInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getOldValue(), "Something2Else.MotherNewFamilyToNewInsuranceClient__Marker_CREATE__TRG__insuranceClient_InsuranceClient"), getSelf());
		});
		feature2removeEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getMotherToInsuranceClient__Marker_CREATE__SRC__mother(), notification -> {
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__CONSISTENCY_145_localSearch").tell(new ReferenceDeleted<Something2Else.MotherToInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (Something2Else.MotherToInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getOldValue(), "Something2Else.MotherToInsuranceClient__Marker_CREATE__SRC__mother_Member"), getSelf());
		});
		feature2removeEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getFatherToInsuranceClient__Marker_CONTEXT__CORR__familyRegisterToInsuranceDB(), notification -> {
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__CONSISTENCY_84_localSearch").tell(new ReferenceDeleted<Something2Else.FatherToInsuranceClient__Marker, Something2Else.FamilyRegisterToInsuranceDatabase>(incUtil, (Something2Else.FatherToInsuranceClient__Marker) notification.getNotifier(), (Something2Else.FamilyRegisterToInsuranceDatabase) notification.getOldValue(), "Something2Else.FatherToInsuranceClient__Marker_CONTEXT__CORR__familyRegisterToInsuranceDB_FamilyRegisterToInsuranceDatabase"), getSelf());
		});
		feature2removeEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getMotherToInsuranceClient__Marker_CONTEXT__SRC__familyRegister(), notification -> {
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__CONSISTENCY_145_localSearch").tell(new ReferenceDeleted<Something2Else.MotherToInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil, (Something2Else.MotherToInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getOldValue(), "Something2Else.MotherToInsuranceClient__Marker_CONTEXT__SRC__familyRegister_FamilyRegister"), getSelf());
		});
		feature2removeEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getFatherToInsuranceClient__Marker_CREATE__TRG__insuranceClient(), notification -> {
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__CONSISTENCY_84_localSearch").tell(new ReferenceDeleted<Something2Else.FatherToInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil, (Something2Else.FatherToInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getOldValue(), "Something2Else.FatherToInsuranceClient__Marker_CREATE__TRG__insuranceClient_InsuranceClient"), getSelf());
		});
		feature2removeEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getFamilyRegisterToInsuranceDatabase_Source(), notification -> {
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__BWD_1_localSearch").tell(new ReferenceDeleted<Something2Else.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil, (Something2Else.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getOldValue(), "Something2Else.FamilyRegisterToInsuranceDatabase_source_FamilyRegister"), getSelf());
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__CONSISTENCY_16_localSearch").tell(new ReferenceDeleted<Something2Else.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil, (Something2Else.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getOldValue(), "Something2Else.FamilyRegisterToInsuranceDatabase_source_FamilyRegister"), getSelf());
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__FWD_26_localSearch").tell(new ReferenceDeleted<Something2Else.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil, (Something2Else.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getOldValue(), "Something2Else.FamilyRegisterToInsuranceDatabase_source_FamilyRegister"), getSelf());
			incUtil.newMessage();
			name2actor.get("FamilyRegisterToInsuranceDatabase__CONSISTENCY_33_localSearch").tell(new ReferenceDeleted<Something2Else.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil, (Something2Else.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getOldValue(), "Something2Else.FamilyRegisterToInsuranceDatabase_source_FamilyRegister"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__BWD_39_localSearch").tell(new ReferenceDeleted<Something2Else.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil, (Something2Else.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getOldValue(), "Something2Else.FamilyRegisterToInsuranceDatabase_source_FamilyRegister"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__CONSISTENCY_53_localSearch").tell(new ReferenceDeleted<Something2Else.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil, (Something2Else.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getOldValue(), "Something2Else.FamilyRegisterToInsuranceDatabase_source_FamilyRegister"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__FWD_63_localSearch").tell(new ReferenceDeleted<Something2Else.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil, (Something2Else.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getOldValue(), "Something2Else.FamilyRegisterToInsuranceDatabase_source_FamilyRegister"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__BWD_69_localSearch").tell(new ReferenceDeleted<Something2Else.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil, (Something2Else.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getOldValue(), "Something2Else.FamilyRegisterToInsuranceDatabase_source_FamilyRegister"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__CONSISTENCY_84_localSearch").tell(new ReferenceDeleted<Something2Else.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil, (Something2Else.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getOldValue(), "Something2Else.FamilyRegisterToInsuranceDatabase_source_FamilyRegister"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__FWD_94_localSearch").tell(new ReferenceDeleted<Something2Else.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil, (Something2Else.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getOldValue(), "Something2Else.FamilyRegisterToInsuranceDatabase_source_FamilyRegister"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__BWD_100_localSearch").tell(new ReferenceDeleted<Something2Else.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil, (Something2Else.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getOldValue(), "Something2Else.FamilyRegisterToInsuranceDatabase_source_FamilyRegister"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__CONSISTENCY_114_localSearch").tell(new ReferenceDeleted<Something2Else.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil, (Something2Else.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getOldValue(), "Something2Else.FamilyRegisterToInsuranceDatabase_source_FamilyRegister"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__FWD_124_localSearch").tell(new ReferenceDeleted<Something2Else.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil, (Something2Else.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getOldValue(), "Something2Else.FamilyRegisterToInsuranceDatabase_source_FamilyRegister"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__BWD_130_localSearch").tell(new ReferenceDeleted<Something2Else.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil, (Something2Else.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getOldValue(), "Something2Else.FamilyRegisterToInsuranceDatabase_source_FamilyRegister"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__CONSISTENCY_145_localSearch").tell(new ReferenceDeleted<Something2Else.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil, (Something2Else.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getOldValue(), "Something2Else.FamilyRegisterToInsuranceDatabase_source_FamilyRegister"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__FWD_155_localSearch").tell(new ReferenceDeleted<Something2Else.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil, (Something2Else.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getOldValue(), "Something2Else.FamilyRegisterToInsuranceDatabase_source_FamilyRegister"), getSelf());
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__BWD_161_localSearch").tell(new ReferenceDeleted<Something2Else.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil, (Something2Else.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getOldValue(), "Something2Else.FamilyRegisterToInsuranceDatabase_source_FamilyRegister"), getSelf());
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__CONSISTENCY_176_localSearch").tell(new ReferenceDeleted<Something2Else.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil, (Something2Else.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getOldValue(), "Something2Else.FamilyRegisterToInsuranceDatabase_source_FamilyRegister"), getSelf());
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__FWD_186_localSearch").tell(new ReferenceDeleted<Something2Else.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil, (Something2Else.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getOldValue(), "Something2Else.FamilyRegisterToInsuranceDatabase_source_FamilyRegister"), getSelf());
		});
		feature2removeEdgeConsumer.put(edu.kit.ipd.sdq.metamodels.families.FamiliesPackage.eINSTANCE.getFamily_Mother(), notification -> {
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient_daughter_mother_incoming_SRC__FILTER_NAC_SRC_13_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.Family_mother_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient_father_mother_incoming_SRC__FILTER_NAC_SRC_50_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.Family_mother_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient_father_mother_incoming_SRC__FILTER_NAC_SRC_81_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.Family_mother_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__CONSISTENCY_114_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.Family_mother_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__FWD_124_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.Family_mother_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__CONSISTENCY_145_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.Family_mother_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__FWD_155_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.Family_mother_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient_son_mother_incoming_SRC__FILTER_NAC_SRC_173_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.Family_mother_Member"), getSelf());
		});
		feature2removeEdgeConsumer.put(edu.kit.ipd.sdq.metamodels.families.FamiliesPackage.eINSTANCE.getMember_FamilyDaughter(), notification -> {
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__CONSISTENCY_16_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.Member, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.Member_familyDaughter_Family"), getSelf());
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__FWD_26_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.Member, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.Member_familyDaughter_Family"), getSelf());
		});
		feature2removeEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getMotherNewFamilyToNewInsuranceClient__Marker_CREATE__SRC__mother(), notification -> {
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__CONSISTENCY_114_localSearch").tell(new ReferenceDeleted<Something2Else.MotherNewFamilyToNewInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (Something2Else.MotherNewFamilyToNewInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getOldValue(), "Something2Else.MotherNewFamilyToNewInsuranceClient__Marker_CREATE__SRC__mother_Member"), getSelf());
		});
		feature2removeEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getMotherToInsuranceClient__Marker_CONTEXT__TRG__insuranceDB(), notification -> {
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__CONSISTENCY_145_localSearch").tell(new ReferenceDeleted<Something2Else.MotherToInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil, (Something2Else.MotherToInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getOldValue(), "Something2Else.MotherToInsuranceClient__Marker_CONTEXT__TRG__insuranceDB_InsuranceDatabase"), getSelf());
		});
		feature2removeEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getSonToInsuranceClient__Marker_CONTEXT__SRC__family(), notification -> {
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__CONSISTENCY_176_localSearch").tell(new ReferenceDeleted<Something2Else.SonToInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, (Something2Else.SonToInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getOldValue(), "Something2Else.SonToInsuranceClient__Marker_CONTEXT__SRC__family_Family"), getSelf());
		});
		feature2removeEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getFatherNewFamilyToNewInsuranceClient__Marker_CONTEXT__CORR__familyRegisterToInsuranceDB(), notification -> {
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__CONSISTENCY_53_localSearch").tell(new ReferenceDeleted<Something2Else.FatherNewFamilyToNewInsuranceClient__Marker, Something2Else.FamilyRegisterToInsuranceDatabase>(incUtil, (Something2Else.FatherNewFamilyToNewInsuranceClient__Marker) notification.getNotifier(), (Something2Else.FamilyRegisterToInsuranceDatabase) notification.getOldValue(), "Something2Else.FatherNewFamilyToNewInsuranceClient__Marker_CONTEXT__CORR__familyRegisterToInsuranceDB_FamilyRegisterToInsuranceDatabase"), getSelf());
		});
		feature2removeEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getMotherToInsuranceClient__Marker_CONTEXT__SRC__family(), notification -> {
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__CONSISTENCY_145_localSearch").tell(new ReferenceDeleted<Something2Else.MotherToInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, (Something2Else.MotherToInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getOldValue(), "Something2Else.MotherToInsuranceClient__Marker_CONTEXT__SRC__family_Family"), getSelf());
		});
		feature2removeEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getMemberToInsuranceClient_Target(), notification -> {
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__CONSISTENCY_16_localSearch").tell(new ReferenceDeleted<Something2Else.MemberToInsuranceClient, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil, (Something2Else.MemberToInsuranceClient) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getOldValue(), "Something2Else.MemberToInsuranceClient_target_InsuranceClient"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__CONSISTENCY_53_localSearch").tell(new ReferenceDeleted<Something2Else.MemberToInsuranceClient, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil, (Something2Else.MemberToInsuranceClient) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getOldValue(), "Something2Else.MemberToInsuranceClient_target_InsuranceClient"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__CONSISTENCY_84_localSearch").tell(new ReferenceDeleted<Something2Else.MemberToInsuranceClient, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil, (Something2Else.MemberToInsuranceClient) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getOldValue(), "Something2Else.MemberToInsuranceClient_target_InsuranceClient"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__CONSISTENCY_114_localSearch").tell(new ReferenceDeleted<Something2Else.MemberToInsuranceClient, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil, (Something2Else.MemberToInsuranceClient) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getOldValue(), "Something2Else.MemberToInsuranceClient_target_InsuranceClient"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__CONSISTENCY_145_localSearch").tell(new ReferenceDeleted<Something2Else.MemberToInsuranceClient, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil, (Something2Else.MemberToInsuranceClient) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getOldValue(), "Something2Else.MemberToInsuranceClient_target_InsuranceClient"), getSelf());
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__CONSISTENCY_176_localSearch").tell(new ReferenceDeleted<Something2Else.MemberToInsuranceClient, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil, (Something2Else.MemberToInsuranceClient) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getOldValue(), "Something2Else.MemberToInsuranceClient_target_InsuranceClient"), getSelf());
		});
		feature2removeEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getFamilyToInsuranceClient_Source(), notification -> {
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__CONSISTENCY_16_localSearch").tell(new ReferenceDeleted<Something2Else.FamilyToInsuranceClient, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, (Something2Else.FamilyToInsuranceClient) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getOldValue(), "Something2Else.FamilyToInsuranceClient_source_Family"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__CONSISTENCY_53_localSearch").tell(new ReferenceDeleted<Something2Else.FamilyToInsuranceClient, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, (Something2Else.FamilyToInsuranceClient) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getOldValue(), "Something2Else.FamilyToInsuranceClient_source_Family"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__CONSISTENCY_84_localSearch").tell(new ReferenceDeleted<Something2Else.FamilyToInsuranceClient, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, (Something2Else.FamilyToInsuranceClient) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getOldValue(), "Something2Else.FamilyToInsuranceClient_source_Family"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__CONSISTENCY_114_localSearch").tell(new ReferenceDeleted<Something2Else.FamilyToInsuranceClient, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, (Something2Else.FamilyToInsuranceClient) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getOldValue(), "Something2Else.FamilyToInsuranceClient_source_Family"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__CONSISTENCY_145_localSearch").tell(new ReferenceDeleted<Something2Else.FamilyToInsuranceClient, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, (Something2Else.FamilyToInsuranceClient) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getOldValue(), "Something2Else.FamilyToInsuranceClient_source_Family"), getSelf());
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__CONSISTENCY_176_localSearch").tell(new ReferenceDeleted<Something2Else.FamilyToInsuranceClient, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, (Something2Else.FamilyToInsuranceClient) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getOldValue(), "Something2Else.FamilyToInsuranceClient_source_Family"), getSelf());
		});
		feature2removeEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getSonToInsuranceClient__Marker_CREATE__CORR__memberToInsuranceClient(), notification -> {
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__CONSISTENCY_176_localSearch").tell(new ReferenceDeleted<Something2Else.SonToInsuranceClient__Marker, Something2Else.MemberToInsuranceClient>(incUtil, (Something2Else.SonToInsuranceClient__Marker) notification.getNotifier(), (Something2Else.MemberToInsuranceClient) notification.getOldValue(), "Something2Else.SonToInsuranceClient__Marker_CREATE__CORR__memberToInsuranceClient_MemberToInsuranceClient"), getSelf());
		});
		feature2removeEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getSonToInsuranceClient__Marker_CREATE__SRC__son(), notification -> {
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__CONSISTENCY_176_localSearch").tell(new ReferenceDeleted<Something2Else.SonToInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (Something2Else.SonToInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getOldValue(), "Something2Else.SonToInsuranceClient__Marker_CREATE__SRC__son_Member"), getSelf());
		});
		feature2removeEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getMotherNewFamilyToNewInsuranceClient__Marker_CONTEXT__TRG__insuranceDB(), notification -> {
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__CONSISTENCY_114_localSearch").tell(new ReferenceDeleted<Something2Else.MotherNewFamilyToNewInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil, (Something2Else.MotherNewFamilyToNewInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getOldValue(), "Something2Else.MotherNewFamilyToNewInsuranceClient__Marker_CONTEXT__TRG__insuranceDB_InsuranceDatabase"), getSelf());
		});
		feature2removeEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getDaughterToInsuranceClient__Marker_CONTEXT__TRG__insuranceDB(), notification -> {
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__CONSISTENCY_16_localSearch").tell(new ReferenceDeleted<Something2Else.DaughterToInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil, (Something2Else.DaughterToInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getOldValue(), "Something2Else.DaughterToInsuranceClient__Marker_CONTEXT__TRG__insuranceDB_InsuranceDatabase"), getSelf());
		});
		feature2removeEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getFatherToInsuranceClient__Marker_CONTEXT__SRC__familyRegister(), notification -> {
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__CONSISTENCY_84_localSearch").tell(new ReferenceDeleted<Something2Else.FatherToInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil, (Something2Else.FatherToInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getOldValue(), "Something2Else.FatherToInsuranceClient__Marker_CONTEXT__SRC__familyRegister_FamilyRegister"), getSelf());
		});
		feature2removeEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getFatherToInsuranceClient__Marker_CREATE__CORR__memberToInsuranceClient(), notification -> {
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__CONSISTENCY_84_localSearch").tell(new ReferenceDeleted<Something2Else.FatherToInsuranceClient__Marker, Something2Else.MemberToInsuranceClient>(incUtil, (Something2Else.FatherToInsuranceClient__Marker) notification.getNotifier(), (Something2Else.MemberToInsuranceClient) notification.getOldValue(), "Something2Else.FatherToInsuranceClient__Marker_CREATE__CORR__memberToInsuranceClient_MemberToInsuranceClient"), getSelf());
		});
		feature2removeEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getFatherToInsuranceClient__Marker_CONTEXT__SRC__family(), notification -> {
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__CONSISTENCY_84_localSearch").tell(new ReferenceDeleted<Something2Else.FatherToInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, (Something2Else.FatherToInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getOldValue(), "Something2Else.FatherToInsuranceClient__Marker_CONTEXT__SRC__family_Family"), getSelf());
		});
		feature2removeEdgeConsumer.put(edu.kit.ipd.sdq.metamodels.families.FamiliesPackage.eINSTANCE.getFamily_Daughters(), notification -> {
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient_father_daughters_incoming_SRC__FILTER_NAC_SRC_47_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.Family_daughters_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient_father_daughters_incoming_SRC__FILTER_NAC_SRC_78_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.Family_daughters_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient_mother_daughters_incoming_SRC__FILTER_NAC_SRC_108_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.Family_daughters_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient_mother_daughters_incoming_SRC__FILTER_NAC_SRC_139_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.Family_daughters_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient_son_daughters_incoming_SRC__FILTER_NAC_SRC_167_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.Family_daughters_Member"), getSelf());
		});
		feature2removeEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getFatherNewFamilyToNewInsuranceClient__Marker_CREATE__SRC__father(), notification -> {
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__CONSISTENCY_53_localSearch").tell(new ReferenceDeleted<Something2Else.FatherNewFamilyToNewInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (Something2Else.FatherNewFamilyToNewInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getOldValue(), "Something2Else.FatherNewFamilyToNewInsuranceClient__Marker_CREATE__SRC__father_Member"), getSelf());
		});
		feature2removeEdgeConsumer.put(Something2Else.Families2InsurancePackage.eINSTANCE.getFatherToInsuranceClient__Marker_CONTEXT__TRG__insuranceDB(), notification -> {
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__CONSISTENCY_84_localSearch").tell(new ReferenceDeleted<Something2Else.FatherToInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil, (Something2Else.FatherToInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getOldValue(), "Something2Else.FatherToInsuranceClient__Marker_CONTEXT__TRG__insuranceDB_InsuranceDatabase"), getSelf());
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
		if (node instanceof Something2Else.DaughterToInsuranceClient__Marker) {
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__Marker_object").tell(new ObjectDeleted<Something2Else.DaughterToInsuranceClient__Marker>(incUtil, (Something2Else.DaughterToInsuranceClient__Marker) node), getSelf());
		}
		if (node instanceof Something2Else.FamilyRegisterToInsuranceDatabase__Marker) {
			incUtil.newMessage();
			name2actor.get("FamilyRegisterToInsuranceDatabase__Marker_object").tell(new ObjectDeleted<Something2Else.FamilyRegisterToInsuranceDatabase__Marker>(incUtil, (Something2Else.FamilyRegisterToInsuranceDatabase__Marker) node), getSelf());
		}
		if (node instanceof Something2Else.FatherNewFamilyToNewInsuranceClient__Marker) {
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__Marker_object").tell(new ObjectDeleted<Something2Else.FatherNewFamilyToNewInsuranceClient__Marker>(incUtil, (Something2Else.FatherNewFamilyToNewInsuranceClient__Marker) node), getSelf());
		}
		if (node instanceof Something2Else.FatherToInsuranceClient__Marker) {
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__Marker_object").tell(new ObjectDeleted<Something2Else.FatherToInsuranceClient__Marker>(incUtil, (Something2Else.FatherToInsuranceClient__Marker) node), getSelf());
		}
		if (node instanceof Something2Else.MotherNewFamilyToNewInsuranceClient__Marker) {
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__Marker_object").tell(new ObjectDeleted<Something2Else.MotherNewFamilyToNewInsuranceClient__Marker>(incUtil, (Something2Else.MotherNewFamilyToNewInsuranceClient__Marker) node), getSelf());
		}
		if (node instanceof Something2Else.MotherToInsuranceClient__Marker) {
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__Marker_object").tell(new ObjectDeleted<Something2Else.MotherToInsuranceClient__Marker>(incUtil, (Something2Else.MotherToInsuranceClient__Marker) node), getSelf());
		}
		if (node instanceof Something2Else.SonToInsuranceClient__Marker) {
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__Marker_object").tell(new ObjectDeleted<Something2Else.SonToInsuranceClient__Marker>(incUtil, (Something2Else.SonToInsuranceClient__Marker) node), getSelf());
		}
		if (node instanceof Something2Else.FamilyRegisterToInsuranceDatabase) {
			incUtil.newMessage();
			name2actor.get("FamilyRegisterToInsuranceDatabase_object_SP0").tell(new ObjectDeleted<Something2Else.FamilyRegisterToInsuranceDatabase>(incUtil, (Something2Else.FamilyRegisterToInsuranceDatabase) node), getSelf());
		}
		if (node instanceof Something2Else.FamilyRegisterToInsuranceDatabase) {
			incUtil.newMessage();
			name2actor.get("FamilyRegisterToInsuranceDatabase_object_SP1").tell(new ObjectDeleted<Something2Else.FamilyRegisterToInsuranceDatabase>(incUtil, (Something2Else.FamilyRegisterToInsuranceDatabase) node), getSelf());
		}
		if (node instanceof Something2Else.FamilyRegisterToInsuranceDatabase) {
			incUtil.newMessage();
			name2actor.get("FamilyRegisterToInsuranceDatabase_object_SP2").tell(new ObjectDeleted<Something2Else.FamilyRegisterToInsuranceDatabase>(incUtil, (Something2Else.FamilyRegisterToInsuranceDatabase) node), getSelf());
		}
		if (node instanceof Something2Else.FamilyRegisterToInsuranceDatabase) {
			incUtil.newMessage();
			name2actor.get("FamilyRegisterToInsuranceDatabase_object_SP3").tell(new ObjectDeleted<Something2Else.FamilyRegisterToInsuranceDatabase>(incUtil, (Something2Else.FamilyRegisterToInsuranceDatabase) node), getSelf());
		}
		if (node instanceof Something2Else.FamilyRegisterToInsuranceDatabase) {
			incUtil.newMessage();
			name2actor.get("FamilyRegisterToInsuranceDatabase_object_SP4").tell(new ObjectDeleted<Something2Else.FamilyRegisterToInsuranceDatabase>(incUtil, (Something2Else.FamilyRegisterToInsuranceDatabase) node), getSelf());
		}
		if (node instanceof Something2Else.FamilyToInsuranceClient) {
			incUtil.newMessage();
			name2actor.get("FamilyToInsuranceClient_object_SP0").tell(new ObjectDeleted<Something2Else.FamilyToInsuranceClient>(incUtil, (Something2Else.FamilyToInsuranceClient) node), getSelf());
		}
		if (node instanceof Something2Else.FamilyToInsuranceClient) {
			incUtil.newMessage();
			name2actor.get("FamilyToInsuranceClient_object_SP1").tell(new ObjectDeleted<Something2Else.FamilyToInsuranceClient>(incUtil, (Something2Else.FamilyToInsuranceClient) node), getSelf());
		}
		if (node instanceof Something2Else.MemberToInsuranceClient) {
			incUtil.newMessage();
			name2actor.get("MemberToInsuranceClient_object_SP0").tell(new ObjectDeleted<Something2Else.MemberToInsuranceClient>(incUtil, (Something2Else.MemberToInsuranceClient) node), getSelf());
		}
		if (node instanceof Something2Else.MemberToInsuranceClient) {
			incUtil.newMessage();
			name2actor.get("MemberToInsuranceClient_object_SP1").tell(new ObjectDeleted<Something2Else.MemberToInsuranceClient>(incUtil, (Something2Else.MemberToInsuranceClient) node), getSelf());
		}
		if (node instanceof edu.kit.ipd.sdq.metamodels.families.Family) {
			incUtil.newMessage();
			name2actor.get("Family_object_SP0").tell(new ObjectDeleted<edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) node), getSelf());
		}
		if (node instanceof edu.kit.ipd.sdq.metamodels.families.Family) {
			incUtil.newMessage();
			name2actor.get("Family_object_SP1").tell(new ObjectDeleted<edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) node), getSelf());
		}
		if (node instanceof edu.kit.ipd.sdq.metamodels.families.Family) {
			incUtil.newMessage();
			name2actor.get("Family_object_SP2").tell(new ObjectDeleted<edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) node), getSelf());
		}
		if (node instanceof edu.kit.ipd.sdq.metamodels.families.Family) {
			incUtil.newMessage();
			name2actor.get("Family_object_SP3").tell(new ObjectDeleted<edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) node), getSelf());
		}
		if (node instanceof edu.kit.ipd.sdq.metamodels.families.Family) {
			incUtil.newMessage();
			name2actor.get("Family_object_SP4").tell(new ObjectDeleted<edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) node), getSelf());
		}
		if (node instanceof edu.kit.ipd.sdq.metamodels.families.Family) {
			incUtil.newMessage();
			name2actor.get("Family_object_SP5").tell(new ObjectDeleted<edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) node), getSelf());
		}
		if (node instanceof edu.kit.ipd.sdq.metamodels.families.Family) {
			incUtil.newMessage();
			name2actor.get("Family_object_SP6").tell(new ObjectDeleted<edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) node), getSelf());
		}
		if (node instanceof edu.kit.ipd.sdq.metamodels.families.Family) {
			incUtil.newMessage();
			name2actor.get("Family_object_SP7").tell(new ObjectDeleted<edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) node), getSelf());
		}
		if (node instanceof edu.kit.ipd.sdq.metamodels.families.Family) {
			incUtil.newMessage();
			name2actor.get("Family_object_SP8").tell(new ObjectDeleted<edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) node), getSelf());
		}
		if (node instanceof edu.kit.ipd.sdq.metamodels.families.FamilyRegister) {
			incUtil.newMessage();
			name2actor.get("FamilyRegister_object_SP0").tell(new ObjectDeleted<edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil, (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) node), getSelf());
		}
		if (node instanceof edu.kit.ipd.sdq.metamodels.families.FamilyRegister) {
			incUtil.newMessage();
			name2actor.get("FamilyRegister_object_SP1").tell(new ObjectDeleted<edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil, (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) node), getSelf());
		}
		if (node instanceof edu.kit.ipd.sdq.metamodels.families.FamilyRegister) {
			incUtil.newMessage();
			name2actor.get("FamilyRegister_object_SP2").tell(new ObjectDeleted<edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil, (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) node), getSelf());
		}
		if (node instanceof edu.kit.ipd.sdq.metamodels.families.FamilyRegister) {
			incUtil.newMessage();
			name2actor.get("FamilyRegister_object_SP3").tell(new ObjectDeleted<edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil, (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) node), getSelf());
		}
		if (node instanceof edu.kit.ipd.sdq.metamodels.families.FamilyRegister) {
			incUtil.newMessage();
			name2actor.get("FamilyRegister_object_SP4").tell(new ObjectDeleted<edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil, (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) node), getSelf());
		}
		if (node instanceof edu.kit.ipd.sdq.metamodels.families.Member) {
			incUtil.newMessage();
			name2actor.get("Member_object_SP0").tell(new ObjectDeleted<edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Member) node), getSelf());
		}
		if (node instanceof edu.kit.ipd.sdq.metamodels.families.Member) {
			incUtil.newMessage();
			name2actor.get("Member_object_SP1").tell(new ObjectDeleted<edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Member) node), getSelf());
		}
		if (node instanceof edu.kit.ipd.sdq.metamodels.families.Member) {
			incUtil.newMessage();
			name2actor.get("Member_object_SP2").tell(new ObjectDeleted<edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Member) node), getSelf());
		}
		if (node instanceof edu.kit.ipd.sdq.metamodels.families.Member) {
			incUtil.newMessage();
			name2actor.get("Member_object_SP3").tell(new ObjectDeleted<edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Member) node), getSelf());
		}
		if (node instanceof edu.kit.ipd.sdq.metamodels.families.Member) {
			incUtil.newMessage();
			name2actor.get("Member_object_SP4").tell(new ObjectDeleted<edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Member) node), getSelf());
		}
		if (node instanceof edu.kit.ipd.sdq.metamodels.families.Member) {
			incUtil.newMessage();
			name2actor.get("Member_object_SP5").tell(new ObjectDeleted<edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Member) node), getSelf());
		}
		if (node instanceof edu.kit.ipd.sdq.metamodels.families.Member) {
			incUtil.newMessage();
			name2actor.get("Member_object_SP6").tell(new ObjectDeleted<edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Member) node), getSelf());
		}
		if (node instanceof edu.kit.ipd.sdq.metamodels.families.Member) {
			incUtil.newMessage();
			name2actor.get("Member_object_SP7").tell(new ObjectDeleted<edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Member) node), getSelf());
		}
		if (node instanceof edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) {
			incUtil.newMessage();
			name2actor.get("InsuranceDatabase_object_SP0").tell(new ObjectDeleted<edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil, (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) node), getSelf());
		}
		if (node instanceof edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) {
			incUtil.newMessage();
			name2actor.get("InsuranceDatabase_object_SP1").tell(new ObjectDeleted<edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil, (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) node), getSelf());
		}
		if (node instanceof edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) {
			incUtil.newMessage();
			name2actor.get("InsuranceDatabase_object_SP2").tell(new ObjectDeleted<edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil, (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) node), getSelf());
		}
		if (node instanceof edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) {
			incUtil.newMessage();
			name2actor.get("InsuranceDatabase_object_SP3").tell(new ObjectDeleted<edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil, (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) node), getSelf());
		}
		if (node instanceof edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) {
			incUtil.newMessage();
			name2actor.get("InsuranceDatabase_object_SP4").tell(new ObjectDeleted<edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil, (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) node), getSelf());
		}
		if (node instanceof edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) {
			incUtil.newMessage();
			name2actor.get("InsuranceClient_object_SP0").tell(new ObjectDeleted<edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil, (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) node), getSelf());
		}
		if (node instanceof edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) {
			incUtil.newMessage();
			name2actor.get("InsuranceClient_object_SP1").tell(new ObjectDeleted<edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil, (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) node), getSelf());
		}
		if (node instanceof edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) {
			incUtil.newMessage();
			name2actor.get("InsuranceClient_object_SP2").tell(new ObjectDeleted<edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil, (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) node), getSelf());
		}
	}
}

