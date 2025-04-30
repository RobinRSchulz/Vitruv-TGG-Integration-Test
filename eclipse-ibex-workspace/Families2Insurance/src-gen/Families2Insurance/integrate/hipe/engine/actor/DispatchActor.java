package Families2Insurance.integrate.hipe.engine.actor;

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
		type2addConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getFamilyRegisterToInsuranceDatabase(), obj -> {
			Families2Insurance.FamilyRegisterToInsuranceDatabase _familyregistertoinsurancedatabase = (Families2Insurance.FamilyRegisterToInsuranceDatabase) obj;
			incUtil.newMessage();
			name2actor.get("FamilyRegisterToInsuranceDatabase_object_SP0").tell(new ObjectAdded<Families2Insurance.FamilyRegisterToInsuranceDatabase>(incUtil, _familyregistertoinsurancedatabase), getSelf());
			incUtil.newMessage();
			name2actor.get("FamilyRegisterToInsuranceDatabase_object_SP1").tell(new ObjectAdded<Families2Insurance.FamilyRegisterToInsuranceDatabase>(incUtil, _familyregistertoinsurancedatabase), getSelf());
			incUtil.newMessage();
			name2actor.get("FamilyRegisterToInsuranceDatabase_object_SP2").tell(new ObjectAdded<Families2Insurance.FamilyRegisterToInsuranceDatabase>(incUtil, _familyregistertoinsurancedatabase), getSelf());
			incUtil.newMessage();
			name2actor.get("FamilyRegisterToInsuranceDatabase_object_SP3").tell(new ObjectAdded<Families2Insurance.FamilyRegisterToInsuranceDatabase>(incUtil, _familyregistertoinsurancedatabase), getSelf());
			incUtil.newMessage();
			name2actor.get("FamilyRegisterToInsuranceDatabase_object_SP4").tell(new ObjectAdded<Families2Insurance.FamilyRegisterToInsuranceDatabase>(incUtil, _familyregistertoinsurancedatabase), getSelf());
		});
		type2addConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getFamilyRegisterToInsuranceDatabase__Marker(), obj -> {
			Families2Insurance.FamilyRegisterToInsuranceDatabase__Marker _familyregistertoinsurancedatabase__marker = (Families2Insurance.FamilyRegisterToInsuranceDatabase__Marker) obj;
			incUtil.newMessage();
			name2actor.get("FamilyRegisterToInsuranceDatabase__Marker_object").tell(new ObjectAdded<Families2Insurance.FamilyRegisterToInsuranceDatabase__Marker>(incUtil, _familyregistertoinsurancedatabase__marker), getSelf());
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
			incUtil.newMessage();
			name2actor.get("InsuranceDatabase_object_SP5").tell(new ObjectAdded<edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil, _insurancedatabase), getSelf());
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
			incUtil.newMessage();
			name2actor.get("FamilyRegister_object_SP5").tell(new ObjectAdded<edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil, _familyregister), getSelf());
		});
		type2addConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getDaughterToInsuranceClient__Marker(), obj -> {
			Families2Insurance.DaughterToInsuranceClient__Marker _daughtertoinsuranceclient__marker = (Families2Insurance.DaughterToInsuranceClient__Marker) obj;
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__Marker_object").tell(new ObjectAdded<Families2Insurance.DaughterToInsuranceClient__Marker>(incUtil, _daughtertoinsuranceclient__marker), getSelf());
		});
		type2addConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getFamilyToInsuranceClient(), obj -> {
			Families2Insurance.FamilyToInsuranceClient _familytoinsuranceclient = (Families2Insurance.FamilyToInsuranceClient) obj;
			incUtil.newMessage();
			name2actor.get("FamilyToInsuranceClient_object_SP0").tell(new ObjectAdded<Families2Insurance.FamilyToInsuranceClient>(incUtil, _familytoinsuranceclient), getSelf());
			incUtil.newMessage();
			name2actor.get("FamilyToInsuranceClient_object_SP1").tell(new ObjectAdded<Families2Insurance.FamilyToInsuranceClient>(incUtil, _familytoinsuranceclient), getSelf());
		});
		type2addConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getSonToInsuranceClient__Marker(), obj -> {
			Families2Insurance.SonToInsuranceClient__Marker _sontoinsuranceclient__marker = (Families2Insurance.SonToInsuranceClient__Marker) obj;
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__Marker_object").tell(new ObjectAdded<Families2Insurance.SonToInsuranceClient__Marker>(incUtil, _sontoinsuranceclient__marker), getSelf());
		});
		type2addConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getFatherToInsuranceClient__Marker(), obj -> {
			Families2Insurance.FatherToInsuranceClient__Marker _fathertoinsuranceclient__marker = (Families2Insurance.FatherToInsuranceClient__Marker) obj;
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__Marker_object").tell(new ObjectAdded<Families2Insurance.FatherToInsuranceClient__Marker>(incUtil, _fathertoinsuranceclient__marker), getSelf());
		});
		type2addConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getMotherNewFamilyToNewInsuranceClient__Marker(), obj -> {
			Families2Insurance.MotherNewFamilyToNewInsuranceClient__Marker _mothernewfamilytonewinsuranceclient__marker = (Families2Insurance.MotherNewFamilyToNewInsuranceClient__Marker) obj;
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__Marker_object").tell(new ObjectAdded<Families2Insurance.MotherNewFamilyToNewInsuranceClient__Marker>(incUtil, _mothernewfamilytonewinsuranceclient__marker), getSelf());
		});
		type2addConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getMotherToInsuranceClient__Marker(), obj -> {
			Families2Insurance.MotherToInsuranceClient__Marker _mothertoinsuranceclient__marker = (Families2Insurance.MotherToInsuranceClient__Marker) obj;
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__Marker_object").tell(new ObjectAdded<Families2Insurance.MotherToInsuranceClient__Marker>(incUtil, _mothertoinsuranceclient__marker), getSelf());
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
		type2addConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getFatherNewFamilyToNewInsuranceClient__Marker(), obj -> {
			Families2Insurance.FatherNewFamilyToNewInsuranceClient__Marker _fathernewfamilytonewinsuranceclient__marker = (Families2Insurance.FatherNewFamilyToNewInsuranceClient__Marker) obj;
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__Marker_object").tell(new ObjectAdded<Families2Insurance.FatherNewFamilyToNewInsuranceClient__Marker>(incUtil, _fathernewfamilytonewinsuranceclient__marker), getSelf());
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
		type2addConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getMemberToInsuranceClient(), obj -> {
			Families2Insurance.MemberToInsuranceClient _membertoinsuranceclient = (Families2Insurance.MemberToInsuranceClient) obj;
			incUtil.newMessage();
			name2actor.get("MemberToInsuranceClient_object_SP0").tell(new ObjectAdded<Families2Insurance.MemberToInsuranceClient>(incUtil, _membertoinsuranceclient), getSelf());
			incUtil.newMessage();
			name2actor.get("MemberToInsuranceClient_object_SP1").tell(new ObjectAdded<Families2Insurance.MemberToInsuranceClient>(incUtil, _membertoinsuranceclient), getSelf());
		});
	}
	
	private void initializeSet() {
		feature2setConsumer.put(edu.kit.ipd.sdq.metamodels.insurance.InsurancePackage.eINSTANCE.getInsuranceClient_Gender(), notification -> {
			if(notification.getNotifier() instanceof edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) {
				incUtil.newMessage();
				name2actor.get("InsuranceClient_object_SP0").tell(new AttributeChanged<edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil, (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) {
				incUtil.newMessage();
				name2actor.get("InsuranceClient_object_SP2").tell(new AttributeChanged<edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil, (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) {
				incUtil.newMessage();
				name2actor.get("InsuranceClient_object_SP1").tell(new AttributeChanged<edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil, (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
		});
		
		feature2setConsumer.put(edu.kit.ipd.sdq.metamodels.families.FamiliesPackage.eINSTANCE.getMember_FirstName(), notification -> {
			if(notification.getNotifier() instanceof edu.kit.ipd.sdq.metamodels.families.Member) {
				incUtil.newMessage();
				name2actor.get("Member_object_SP0").tell(new AttributeChanged<edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof edu.kit.ipd.sdq.metamodels.families.Member) {
				incUtil.newMessage();
				name2actor.get("Member_object_SP2").tell(new AttributeChanged<edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof edu.kit.ipd.sdq.metamodels.families.Member) {
				incUtil.newMessage();
				name2actor.get("Member_object_SP4").tell(new AttributeChanged<edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNotifier(), notification.getOldValue()), getSelf());
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
				name2actor.get("Member_object_SP6").tell(new AttributeChanged<edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof edu.kit.ipd.sdq.metamodels.families.Member) {
				incUtil.newMessage();
				name2actor.get("Member_object_SP3").tell(new AttributeChanged<edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof edu.kit.ipd.sdq.metamodels.families.Member) {
				incUtil.newMessage();
				name2actor.get("Member_object_SP7").tell(new AttributeChanged<edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
		});
		
		feature2setConsumer.put(edu.kit.ipd.sdq.metamodels.insurance.InsurancePackage.eINSTANCE.getInsuranceClient_Name(), notification -> {
			if(notification.getNotifier() instanceof edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) {
				incUtil.newMessage();
				name2actor.get("InsuranceClient_object_SP0").tell(new AttributeChanged<edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil, (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) {
				incUtil.newMessage();
				name2actor.get("InsuranceClient_object_SP2").tell(new AttributeChanged<edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil, (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) {
				incUtil.newMessage();
				name2actor.get("InsuranceClient_object_SP1").tell(new AttributeChanged<edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil, (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
		});
		
		feature2setConsumer.put(edu.kit.ipd.sdq.metamodels.families.FamiliesPackage.eINSTANCE.getFamily_LastName(), notification -> {
			if(notification.getNotifier() instanceof edu.kit.ipd.sdq.metamodels.families.Family) {
				incUtil.newMessage();
				name2actor.get("Family_object_SP1").tell(new AttributeChanged<edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof edu.kit.ipd.sdq.metamodels.families.Family) {
				incUtil.newMessage();
				name2actor.get("Family_object_SP6").tell(new AttributeChanged<edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof edu.kit.ipd.sdq.metamodels.families.Family) {
				incUtil.newMessage();
				name2actor.get("Family_object_SP0").tell(new AttributeChanged<edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof edu.kit.ipd.sdq.metamodels.families.Family) {
				incUtil.newMessage();
				name2actor.get("Family_object_SP4").tell(new AttributeChanged<edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof edu.kit.ipd.sdq.metamodels.families.Family) {
				incUtil.newMessage();
				name2actor.get("Family_object_SP3").tell(new AttributeChanged<edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
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
				name2actor.get("Family_object_SP7").tell(new AttributeChanged<edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof edu.kit.ipd.sdq.metamodels.families.Family) {
				incUtil.newMessage();
				name2actor.get("Family_object_SP8").tell(new AttributeChanged<edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
		});
		
	}
	
	private void initializeAddEdge() {
		feature2addEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getFatherToInsuranceClient__Marker_CONTEXT__SRC__family(), notification -> {
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__CONSISTENCY_106_localSearch").tell(new ReferenceAdded<Families2Insurance.FatherToInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil,(Families2Insurance.FatherToInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNewValue(), "Families2Insurance.FatherToInsuranceClient__Marker_CONTEXT__SRC__family_Family"), getSelf());
		});
		feature2addEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getFatherToInsuranceClient__Marker_CONTEXT__CORR__familyRegisterToInsuranceDB(), notification -> {
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__CONSISTENCY_106_localSearch").tell(new ReferenceAdded<Families2Insurance.FatherToInsuranceClient__Marker, Families2Insurance.FamilyRegisterToInsuranceDatabase>(incUtil,(Families2Insurance.FatherToInsuranceClient__Marker) notification.getNotifier(), (Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getNewValue(), "Families2Insurance.FatherToInsuranceClient__Marker_CONTEXT__CORR__familyRegisterToInsuranceDB_FamilyRegisterToInsuranceDatabase"), getSelf());
		});
		feature2addEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getFamilyRegisterToInsuranceDatabase_Target(), notification -> {
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__BWD_4_localSearch").tell(new ReferenceAdded<Families2Insurance.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil,(Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNewValue(), "Families2Insurance.FamilyRegisterToInsuranceDatabase_target_InsuranceDatabase"), getSelf());
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__CC_17_localSearch").tell(new ReferenceAdded<Families2Insurance.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil,(Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNewValue(), "Families2Insurance.FamilyRegisterToInsuranceDatabase_target_InsuranceDatabase"), getSelf());
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__FWD_28_localSearch").tell(new ReferenceAdded<Families2Insurance.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil,(Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNewValue(), "Families2Insurance.FamilyRegisterToInsuranceDatabase_target_InsuranceDatabase"), getSelf());
			incUtil.newMessage();
			name2actor.get("FamilyRegisterToInsuranceDatabase__CONSISTENCY_40_localSearch").tell(new ReferenceAdded<Families2Insurance.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil,(Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNewValue(), "Families2Insurance.FamilyRegisterToInsuranceDatabase_target_InsuranceDatabase"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__BWD_46_localSearch").tell(new ReferenceAdded<Families2Insurance.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil,(Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNewValue(), "Families2Insurance.FamilyRegisterToInsuranceDatabase_target_InsuranceDatabase"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__CC_58_localSearch").tell(new ReferenceAdded<Families2Insurance.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil,(Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNewValue(), "Families2Insurance.FamilyRegisterToInsuranceDatabase_target_InsuranceDatabase"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__FWD_69_localSearch").tell(new ReferenceAdded<Families2Insurance.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil,(Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNewValue(), "Families2Insurance.FamilyRegisterToInsuranceDatabase_target_InsuranceDatabase"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__BWD_79_localSearch").tell(new ReferenceAdded<Families2Insurance.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil,(Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNewValue(), "Families2Insurance.FamilyRegisterToInsuranceDatabase_target_InsuranceDatabase"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__CC_92_localSearch").tell(new ReferenceAdded<Families2Insurance.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil,(Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNewValue(), "Families2Insurance.FamilyRegisterToInsuranceDatabase_target_InsuranceDatabase"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__FWD_103_localSearch").tell(new ReferenceAdded<Families2Insurance.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil,(Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNewValue(), "Families2Insurance.FamilyRegisterToInsuranceDatabase_target_InsuranceDatabase"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__BWD_113_localSearch").tell(new ReferenceAdded<Families2Insurance.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil,(Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNewValue(), "Families2Insurance.FamilyRegisterToInsuranceDatabase_target_InsuranceDatabase"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__CC_125_localSearch").tell(new ReferenceAdded<Families2Insurance.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil,(Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNewValue(), "Families2Insurance.FamilyRegisterToInsuranceDatabase_target_InsuranceDatabase"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__FWD_136_localSearch").tell(new ReferenceAdded<Families2Insurance.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil,(Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNewValue(), "Families2Insurance.FamilyRegisterToInsuranceDatabase_target_InsuranceDatabase"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__BWD_146_localSearch").tell(new ReferenceAdded<Families2Insurance.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil,(Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNewValue(), "Families2Insurance.FamilyRegisterToInsuranceDatabase_target_InsuranceDatabase"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__CC_159_localSearch").tell(new ReferenceAdded<Families2Insurance.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil,(Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNewValue(), "Families2Insurance.FamilyRegisterToInsuranceDatabase_target_InsuranceDatabase"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__FWD_170_localSearch").tell(new ReferenceAdded<Families2Insurance.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil,(Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNewValue(), "Families2Insurance.FamilyRegisterToInsuranceDatabase_target_InsuranceDatabase"), getSelf());
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__BWD_180_localSearch").tell(new ReferenceAdded<Families2Insurance.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil,(Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNewValue(), "Families2Insurance.FamilyRegisterToInsuranceDatabase_target_InsuranceDatabase"), getSelf());
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__CC_193_localSearch").tell(new ReferenceAdded<Families2Insurance.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil,(Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNewValue(), "Families2Insurance.FamilyRegisterToInsuranceDatabase_target_InsuranceDatabase"), getSelf());
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__FWD_204_localSearch").tell(new ReferenceAdded<Families2Insurance.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil,(Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNewValue(), "Families2Insurance.FamilyRegisterToInsuranceDatabase_target_InsuranceDatabase"), getSelf());
		});
		feature2addEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getMotherNewFamilyToNewInsuranceClient__Marker_CREATE__SRC__mother(), notification -> {
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__CONSISTENCY_139_localSearch").tell(new ReferenceAdded<Families2Insurance.MotherNewFamilyToNewInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil,(Families2Insurance.MotherNewFamilyToNewInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNewValue(), "Families2Insurance.MotherNewFamilyToNewInsuranceClient__Marker_CREATE__SRC__mother_Member"), getSelf());
		});
		feature2addEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getMotherNewFamilyToNewInsuranceClient__Marker_CREATE__CORR__memberToInsuranceClient(), notification -> {
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__CONSISTENCY_139_localSearch").tell(new ReferenceAdded<Families2Insurance.MotherNewFamilyToNewInsuranceClient__Marker, Families2Insurance.MemberToInsuranceClient>(incUtil,(Families2Insurance.MotherNewFamilyToNewInsuranceClient__Marker) notification.getNotifier(), (Families2Insurance.MemberToInsuranceClient) notification.getNewValue(), "Families2Insurance.MotherNewFamilyToNewInsuranceClient__Marker_CREATE__CORR__memberToInsuranceClient_MemberToInsuranceClient"), getSelf());
		});
		feature2addEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getMotherToInsuranceClient__Marker_CREATE__SRC__mother(), notification -> {
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__CONSISTENCY_173_localSearch").tell(new ReferenceAdded<Families2Insurance.MotherToInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil,(Families2Insurance.MotherToInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNewValue(), "Families2Insurance.MotherToInsuranceClient__Marker_CREATE__SRC__mother_Member"), getSelf());
		});
		feature2addEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getDaughterToInsuranceClient__Marker_CREATE__CORR__familyToInsuranceClient(), notification -> {
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__CONSISTENCY_31_localSearch").tell(new ReferenceAdded<Families2Insurance.DaughterToInsuranceClient__Marker, Families2Insurance.FamilyToInsuranceClient>(incUtil,(Families2Insurance.DaughterToInsuranceClient__Marker) notification.getNotifier(), (Families2Insurance.FamilyToInsuranceClient) notification.getNewValue(), "Families2Insurance.DaughterToInsuranceClient__Marker_CREATE__CORR__familyToInsuranceClient_FamilyToInsuranceClient"), getSelf());
		});
		feature2addEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getMotherToInsuranceClient__Marker_CREATE__CORR__memberToInsuranceClient(), notification -> {
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__CONSISTENCY_173_localSearch").tell(new ReferenceAdded<Families2Insurance.MotherToInsuranceClient__Marker, Families2Insurance.MemberToInsuranceClient>(incUtil,(Families2Insurance.MotherToInsuranceClient__Marker) notification.getNotifier(), (Families2Insurance.MemberToInsuranceClient) notification.getNewValue(), "Families2Insurance.MotherToInsuranceClient__Marker_CREATE__CORR__memberToInsuranceClient_MemberToInsuranceClient"), getSelf());
		});
		feature2addEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getFatherToInsuranceClient__Marker_CREATE__TRG__insuranceClient(), notification -> {
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__CONSISTENCY_106_localSearch").tell(new ReferenceAdded<Families2Insurance.FatherToInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil,(Families2Insurance.FatherToInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getNewValue(), "Families2Insurance.FatherToInsuranceClient__Marker_CREATE__TRG__insuranceClient_InsuranceClient"), getSelf());
		});
		feature2addEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getFatherNewFamilyToNewInsuranceClient__Marker_CREATE__CORR__familyToInsuranceClient(), notification -> {
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__CONSISTENCY_72_localSearch").tell(new ReferenceAdded<Families2Insurance.FatherNewFamilyToNewInsuranceClient__Marker, Families2Insurance.FamilyToInsuranceClient>(incUtil,(Families2Insurance.FatherNewFamilyToNewInsuranceClient__Marker) notification.getNotifier(), (Families2Insurance.FamilyToInsuranceClient) notification.getNewValue(), "Families2Insurance.FatherNewFamilyToNewInsuranceClient__Marker_CREATE__CORR__familyToInsuranceClient_FamilyToInsuranceClient"), getSelf());
		});
		feature2addEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getFatherToInsuranceClient__Marker_CREATE__CORR__familyToInsuranceClient(), notification -> {
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__CONSISTENCY_106_localSearch").tell(new ReferenceAdded<Families2Insurance.FatherToInsuranceClient__Marker, Families2Insurance.FamilyToInsuranceClient>(incUtil,(Families2Insurance.FatherToInsuranceClient__Marker) notification.getNotifier(), (Families2Insurance.FamilyToInsuranceClient) notification.getNewValue(), "Families2Insurance.FatherToInsuranceClient__Marker_CREATE__CORR__familyToInsuranceClient_FamilyToInsuranceClient"), getSelf());
		});
		feature2addEdgeConsumer.put(edu.kit.ipd.sdq.metamodels.families.FamiliesPackage.eINSTANCE.getFamily_Mother(), notification -> {
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient_daughter_mother_incoming_SRC__FILTER_NAC_SRC_14_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil,(edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.Family_mother_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient_father_mother_incoming_SRC__FILTER_NAC_SRC_55_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil,(edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.Family_mother_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient_father_mother_incoming_SRC__FILTER_NAC_SRC_89_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil,(edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.Family_mother_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__CC_125_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil,(edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.Family_mother_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__SRC_132_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil,(edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.Family_mother_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__CC_159_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil,(edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.Family_mother_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__SRC_166_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil,(edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.Family_mother_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient_son_mother_incoming_SRC__FILTER_NAC_SRC_190_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil,(edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.Family_mother_Member"), getSelf());
		});
		feature2addEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getMemberToInsuranceClient_Target(), notification -> {
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__CONSISTENCY_31_localSearch").tell(new ReferenceAdded<Families2Insurance.MemberToInsuranceClient, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil,(Families2Insurance.MemberToInsuranceClient) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getNewValue(), "Families2Insurance.MemberToInsuranceClient_target_InsuranceClient"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__CONSISTENCY_72_localSearch").tell(new ReferenceAdded<Families2Insurance.MemberToInsuranceClient, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil,(Families2Insurance.MemberToInsuranceClient) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getNewValue(), "Families2Insurance.MemberToInsuranceClient_target_InsuranceClient"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__CONSISTENCY_106_localSearch").tell(new ReferenceAdded<Families2Insurance.MemberToInsuranceClient, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil,(Families2Insurance.MemberToInsuranceClient) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getNewValue(), "Families2Insurance.MemberToInsuranceClient_target_InsuranceClient"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__CONSISTENCY_139_localSearch").tell(new ReferenceAdded<Families2Insurance.MemberToInsuranceClient, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil,(Families2Insurance.MemberToInsuranceClient) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getNewValue(), "Families2Insurance.MemberToInsuranceClient_target_InsuranceClient"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__CONSISTENCY_173_localSearch").tell(new ReferenceAdded<Families2Insurance.MemberToInsuranceClient, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil,(Families2Insurance.MemberToInsuranceClient) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getNewValue(), "Families2Insurance.MemberToInsuranceClient_target_InsuranceClient"), getSelf());
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__CONSISTENCY_207_localSearch").tell(new ReferenceAdded<Families2Insurance.MemberToInsuranceClient, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil,(Families2Insurance.MemberToInsuranceClient) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getNewValue(), "Families2Insurance.MemberToInsuranceClient_target_InsuranceClient"), getSelf());
		});
		feature2addEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getSonToInsuranceClient__Marker_CREATE__TRG__insuranceClient(), notification -> {
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__CONSISTENCY_207_localSearch").tell(new ReferenceAdded<Families2Insurance.SonToInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil,(Families2Insurance.SonToInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getNewValue(), "Families2Insurance.SonToInsuranceClient__Marker_CREATE__TRG__insuranceClient_InsuranceClient"), getSelf());
		});
		feature2addEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getMotherNewFamilyToNewInsuranceClient__Marker_CREATE__SRC__family(), notification -> {
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__CONSISTENCY_139_localSearch").tell(new ReferenceAdded<Families2Insurance.MotherNewFamilyToNewInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil,(Families2Insurance.MotherNewFamilyToNewInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNewValue(), "Families2Insurance.MotherNewFamilyToNewInsuranceClient__Marker_CREATE__SRC__family_Family"), getSelf());
		});
		feature2addEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getFatherNewFamilyToNewInsuranceClient__Marker_CREATE__TRG__insuranceClient(), notification -> {
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__CONSISTENCY_72_localSearch").tell(new ReferenceAdded<Families2Insurance.FatherNewFamilyToNewInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil,(Families2Insurance.FatherNewFamilyToNewInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getNewValue(), "Families2Insurance.FatherNewFamilyToNewInsuranceClient__Marker_CREATE__TRG__insuranceClient_InsuranceClient"), getSelf());
		});
		feature2addEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getSonToInsuranceClient__Marker_CONTEXT__SRC__familyRegister(), notification -> {
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__CONSISTENCY_207_localSearch").tell(new ReferenceAdded<Families2Insurance.SonToInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil,(Families2Insurance.SonToInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNewValue(), "Families2Insurance.SonToInsuranceClient__Marker_CONTEXT__SRC__familyRegister_FamilyRegister"), getSelf());
		});
		feature2addEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getFamilyRegisterToInsuranceDatabase_Source(), notification -> {
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__BWD_4_localSearch").tell(new ReferenceAdded<Families2Insurance.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil,(Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNewValue(), "Families2Insurance.FamilyRegisterToInsuranceDatabase_source_FamilyRegister"), getSelf());
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__CC_17_localSearch").tell(new ReferenceAdded<Families2Insurance.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil,(Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNewValue(), "Families2Insurance.FamilyRegisterToInsuranceDatabase_source_FamilyRegister"), getSelf());
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__FWD_28_localSearch").tell(new ReferenceAdded<Families2Insurance.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil,(Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNewValue(), "Families2Insurance.FamilyRegisterToInsuranceDatabase_source_FamilyRegister"), getSelf());
			incUtil.newMessage();
			name2actor.get("FamilyRegisterToInsuranceDatabase__CONSISTENCY_40_localSearch").tell(new ReferenceAdded<Families2Insurance.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil,(Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNewValue(), "Families2Insurance.FamilyRegisterToInsuranceDatabase_source_FamilyRegister"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__BWD_46_localSearch").tell(new ReferenceAdded<Families2Insurance.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil,(Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNewValue(), "Families2Insurance.FamilyRegisterToInsuranceDatabase_source_FamilyRegister"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__CC_58_localSearch").tell(new ReferenceAdded<Families2Insurance.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil,(Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNewValue(), "Families2Insurance.FamilyRegisterToInsuranceDatabase_source_FamilyRegister"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__FWD_69_localSearch").tell(new ReferenceAdded<Families2Insurance.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil,(Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNewValue(), "Families2Insurance.FamilyRegisterToInsuranceDatabase_source_FamilyRegister"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__BWD_79_localSearch").tell(new ReferenceAdded<Families2Insurance.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil,(Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNewValue(), "Families2Insurance.FamilyRegisterToInsuranceDatabase_source_FamilyRegister"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__CC_92_localSearch").tell(new ReferenceAdded<Families2Insurance.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil,(Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNewValue(), "Families2Insurance.FamilyRegisterToInsuranceDatabase_source_FamilyRegister"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__FWD_103_localSearch").tell(new ReferenceAdded<Families2Insurance.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil,(Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNewValue(), "Families2Insurance.FamilyRegisterToInsuranceDatabase_source_FamilyRegister"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__BWD_113_localSearch").tell(new ReferenceAdded<Families2Insurance.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil,(Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNewValue(), "Families2Insurance.FamilyRegisterToInsuranceDatabase_source_FamilyRegister"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__CC_125_localSearch").tell(new ReferenceAdded<Families2Insurance.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil,(Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNewValue(), "Families2Insurance.FamilyRegisterToInsuranceDatabase_source_FamilyRegister"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__FWD_136_localSearch").tell(new ReferenceAdded<Families2Insurance.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil,(Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNewValue(), "Families2Insurance.FamilyRegisterToInsuranceDatabase_source_FamilyRegister"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__BWD_146_localSearch").tell(new ReferenceAdded<Families2Insurance.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil,(Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNewValue(), "Families2Insurance.FamilyRegisterToInsuranceDatabase_source_FamilyRegister"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__CC_159_localSearch").tell(new ReferenceAdded<Families2Insurance.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil,(Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNewValue(), "Families2Insurance.FamilyRegisterToInsuranceDatabase_source_FamilyRegister"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__FWD_170_localSearch").tell(new ReferenceAdded<Families2Insurance.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil,(Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNewValue(), "Families2Insurance.FamilyRegisterToInsuranceDatabase_source_FamilyRegister"), getSelf());
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__BWD_180_localSearch").tell(new ReferenceAdded<Families2Insurance.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil,(Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNewValue(), "Families2Insurance.FamilyRegisterToInsuranceDatabase_source_FamilyRegister"), getSelf());
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__CC_193_localSearch").tell(new ReferenceAdded<Families2Insurance.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil,(Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNewValue(), "Families2Insurance.FamilyRegisterToInsuranceDatabase_source_FamilyRegister"), getSelf());
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__FWD_204_localSearch").tell(new ReferenceAdded<Families2Insurance.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil,(Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNewValue(), "Families2Insurance.FamilyRegisterToInsuranceDatabase_source_FamilyRegister"), getSelf());
		});
		feature2addEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getSonToInsuranceClient__Marker_CREATE__CORR__memberToInsuranceClient(), notification -> {
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__CONSISTENCY_207_localSearch").tell(new ReferenceAdded<Families2Insurance.SonToInsuranceClient__Marker, Families2Insurance.MemberToInsuranceClient>(incUtil,(Families2Insurance.SonToInsuranceClient__Marker) notification.getNotifier(), (Families2Insurance.MemberToInsuranceClient) notification.getNewValue(), "Families2Insurance.SonToInsuranceClient__Marker_CREATE__CORR__memberToInsuranceClient_MemberToInsuranceClient"), getSelf());
		});
		feature2addEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getSonToInsuranceClient__Marker_CONTEXT__TRG__insuranceDB(), notification -> {
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__CONSISTENCY_207_localSearch").tell(new ReferenceAdded<Families2Insurance.SonToInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil,(Families2Insurance.SonToInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNewValue(), "Families2Insurance.SonToInsuranceClient__Marker_CONTEXT__TRG__insuranceDB_InsuranceDatabase"), getSelf());
		});
		feature2addEdgeConsumer.put(edu.kit.ipd.sdq.metamodels.families.FamiliesPackage.eINSTANCE.getMember_FamilyDaughter(), notification -> {
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__CC_17_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.Member, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil,(edu.kit.ipd.sdq.metamodels.families.Member) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.Member_familyDaughter_Family"), getSelf());
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__SRC_24_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.Member, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil,(edu.kit.ipd.sdq.metamodels.families.Member) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.Member_familyDaughter_Family"), getSelf());
		});
		feature2addEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getDaughterToInsuranceClient__Marker_CREATE__SRC__daughter(), notification -> {
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__CONSISTENCY_31_localSearch").tell(new ReferenceAdded<Families2Insurance.DaughterToInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil,(Families2Insurance.DaughterToInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNewValue(), "Families2Insurance.DaughterToInsuranceClient__Marker_CREATE__SRC__daughter_Member"), getSelf());
		});
		feature2addEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getFamilyToInsuranceClient_Target(), notification -> {
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__CONSISTENCY_31_localSearch").tell(new ReferenceAdded<Families2Insurance.FamilyToInsuranceClient, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil,(Families2Insurance.FamilyToInsuranceClient) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getNewValue(), "Families2Insurance.FamilyToInsuranceClient_target_InsuranceClient"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__CONSISTENCY_72_localSearch").tell(new ReferenceAdded<Families2Insurance.FamilyToInsuranceClient, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil,(Families2Insurance.FamilyToInsuranceClient) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getNewValue(), "Families2Insurance.FamilyToInsuranceClient_target_InsuranceClient"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__CONSISTENCY_106_localSearch").tell(new ReferenceAdded<Families2Insurance.FamilyToInsuranceClient, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil,(Families2Insurance.FamilyToInsuranceClient) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getNewValue(), "Families2Insurance.FamilyToInsuranceClient_target_InsuranceClient"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__CONSISTENCY_139_localSearch").tell(new ReferenceAdded<Families2Insurance.FamilyToInsuranceClient, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil,(Families2Insurance.FamilyToInsuranceClient) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getNewValue(), "Families2Insurance.FamilyToInsuranceClient_target_InsuranceClient"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__CONSISTENCY_173_localSearch").tell(new ReferenceAdded<Families2Insurance.FamilyToInsuranceClient, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil,(Families2Insurance.FamilyToInsuranceClient) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getNewValue(), "Families2Insurance.FamilyToInsuranceClient_target_InsuranceClient"), getSelf());
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__CONSISTENCY_207_localSearch").tell(new ReferenceAdded<Families2Insurance.FamilyToInsuranceClient, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil,(Families2Insurance.FamilyToInsuranceClient) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getNewValue(), "Families2Insurance.FamilyToInsuranceClient_target_InsuranceClient"), getSelf());
		});
		feature2addEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getDaughterToInsuranceClient__Marker_CREATE__CORR__memberToInsuranceClient(), notification -> {
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__CONSISTENCY_31_localSearch").tell(new ReferenceAdded<Families2Insurance.DaughterToInsuranceClient__Marker, Families2Insurance.MemberToInsuranceClient>(incUtil,(Families2Insurance.DaughterToInsuranceClient__Marker) notification.getNotifier(), (Families2Insurance.MemberToInsuranceClient) notification.getNewValue(), "Families2Insurance.DaughterToInsuranceClient__Marker_CREATE__CORR__memberToInsuranceClient_MemberToInsuranceClient"), getSelf());
		});
		feature2addEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getFatherNewFamilyToNewInsuranceClient__Marker_CONTEXT__CORR__familyRegisterToInsuranceDB(), notification -> {
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__CONSISTENCY_72_localSearch").tell(new ReferenceAdded<Families2Insurance.FatherNewFamilyToNewInsuranceClient__Marker, Families2Insurance.FamilyRegisterToInsuranceDatabase>(incUtil,(Families2Insurance.FatherNewFamilyToNewInsuranceClient__Marker) notification.getNotifier(), (Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getNewValue(), "Families2Insurance.FatherNewFamilyToNewInsuranceClient__Marker_CONTEXT__CORR__familyRegisterToInsuranceDB_FamilyRegisterToInsuranceDatabase"), getSelf());
		});
		feature2addEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getMotherNewFamilyToNewInsuranceClient__Marker_CONTEXT__TRG__insuranceDB(), notification -> {
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__CONSISTENCY_139_localSearch").tell(new ReferenceAdded<Families2Insurance.MotherNewFamilyToNewInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil,(Families2Insurance.MotherNewFamilyToNewInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNewValue(), "Families2Insurance.MotherNewFamilyToNewInsuranceClient__Marker_CONTEXT__TRG__insuranceDB_InsuranceDatabase"), getSelf());
		});
		feature2addEdgeConsumer.put(edu.kit.ipd.sdq.metamodels.families.FamiliesPackage.eINSTANCE.getFamilyRegister_Families(), notification -> {
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__BWD_4_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.FamilyRegister, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil,(edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.FamilyRegister_families_Family"), getSelf());
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__CC_17_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.FamilyRegister, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil,(edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.FamilyRegister_families_Family"), getSelf());
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__SRC_24_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.FamilyRegister, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil,(edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.FamilyRegister_families_Family"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__CC_58_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.FamilyRegister, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil,(edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.FamilyRegister_families_Family"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__SRC_65_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.FamilyRegister, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil,(edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.FamilyRegister_families_Family"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__BWD_79_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.FamilyRegister, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil,(edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.FamilyRegister_families_Family"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__CC_92_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.FamilyRegister, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil,(edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.FamilyRegister_families_Family"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__SRC_99_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.FamilyRegister, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil,(edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.FamilyRegister_families_Family"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__CC_125_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.FamilyRegister, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil,(edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.FamilyRegister_families_Family"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__SRC_132_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.FamilyRegister, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil,(edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.FamilyRegister_families_Family"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__BWD_146_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.FamilyRegister, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil,(edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.FamilyRegister_families_Family"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__CC_159_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.FamilyRegister, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil,(edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.FamilyRegister_families_Family"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__SRC_166_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.FamilyRegister, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil,(edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.FamilyRegister_families_Family"), getSelf());
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__BWD_180_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.FamilyRegister, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil,(edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.FamilyRegister_families_Family"), getSelf());
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__CC_193_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.FamilyRegister, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil,(edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.FamilyRegister_families_Family"), getSelf());
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__SRC_200_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.FamilyRegister, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil,(edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.FamilyRegister_families_Family"), getSelf());
		});
		feature2addEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getMemberToInsuranceClient_Source(), notification -> {
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__CONSISTENCY_31_localSearch").tell(new ReferenceAdded<Families2Insurance.MemberToInsuranceClient, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil,(Families2Insurance.MemberToInsuranceClient) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNewValue(), "Families2Insurance.MemberToInsuranceClient_source_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__CONSISTENCY_72_localSearch").tell(new ReferenceAdded<Families2Insurance.MemberToInsuranceClient, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil,(Families2Insurance.MemberToInsuranceClient) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNewValue(), "Families2Insurance.MemberToInsuranceClient_source_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__CONSISTENCY_106_localSearch").tell(new ReferenceAdded<Families2Insurance.MemberToInsuranceClient, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil,(Families2Insurance.MemberToInsuranceClient) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNewValue(), "Families2Insurance.MemberToInsuranceClient_source_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__CONSISTENCY_139_localSearch").tell(new ReferenceAdded<Families2Insurance.MemberToInsuranceClient, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil,(Families2Insurance.MemberToInsuranceClient) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNewValue(), "Families2Insurance.MemberToInsuranceClient_source_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__CONSISTENCY_173_localSearch").tell(new ReferenceAdded<Families2Insurance.MemberToInsuranceClient, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil,(Families2Insurance.MemberToInsuranceClient) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNewValue(), "Families2Insurance.MemberToInsuranceClient_source_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__CONSISTENCY_207_localSearch").tell(new ReferenceAdded<Families2Insurance.MemberToInsuranceClient, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil,(Families2Insurance.MemberToInsuranceClient) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNewValue(), "Families2Insurance.MemberToInsuranceClient_source_Member"), getSelf());
		});
		feature2addEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getFatherNewFamilyToNewInsuranceClient__Marker_CONTEXT__SRC__familyRegister(), notification -> {
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__CONSISTENCY_72_localSearch").tell(new ReferenceAdded<Families2Insurance.FatherNewFamilyToNewInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil,(Families2Insurance.FatherNewFamilyToNewInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNewValue(), "Families2Insurance.FatherNewFamilyToNewInsuranceClient__Marker_CONTEXT__SRC__familyRegister_FamilyRegister"), getSelf());
		});
		feature2addEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getFatherToInsuranceClient__Marker_CREATE__CORR__memberToInsuranceClient(), notification -> {
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__CONSISTENCY_106_localSearch").tell(new ReferenceAdded<Families2Insurance.FatherToInsuranceClient__Marker, Families2Insurance.MemberToInsuranceClient>(incUtil,(Families2Insurance.FatherToInsuranceClient__Marker) notification.getNotifier(), (Families2Insurance.MemberToInsuranceClient) notification.getNewValue(), "Families2Insurance.FatherToInsuranceClient__Marker_CREATE__CORR__memberToInsuranceClient_MemberToInsuranceClient"), getSelf());
		});
		feature2addEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getMotherToInsuranceClient__Marker_CONTEXT__SRC__family(), notification -> {
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__CONSISTENCY_173_localSearch").tell(new ReferenceAdded<Families2Insurance.MotherToInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil,(Families2Insurance.MotherToInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNewValue(), "Families2Insurance.MotherToInsuranceClient__Marker_CONTEXT__SRC__family_Family"), getSelf());
		});
		feature2addEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getDaughterToInsuranceClient__Marker_CONTEXT__SRC__familyRegister(), notification -> {
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__CONSISTENCY_31_localSearch").tell(new ReferenceAdded<Families2Insurance.DaughterToInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil,(Families2Insurance.DaughterToInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNewValue(), "Families2Insurance.DaughterToInsuranceClient__Marker_CONTEXT__SRC__familyRegister_FamilyRegister"), getSelf());
		});
		feature2addEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getSonToInsuranceClient__Marker_CONTEXT__SRC__family(), notification -> {
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__CONSISTENCY_207_localSearch").tell(new ReferenceAdded<Families2Insurance.SonToInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil,(Families2Insurance.SonToInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNewValue(), "Families2Insurance.SonToInsuranceClient__Marker_CONTEXT__SRC__family_Family"), getSelf());
		});
		feature2addEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getFamilyRegisterToInsuranceDatabase__Marker_CREATE__CORR__famRegToInsDb(), notification -> {
			incUtil.newMessage();
			name2actor.get("FamilyRegisterToInsuranceDatabase__CONSISTENCY_40_localSearch").tell(new ReferenceAdded<Families2Insurance.FamilyRegisterToInsuranceDatabase__Marker, Families2Insurance.FamilyRegisterToInsuranceDatabase>(incUtil,(Families2Insurance.FamilyRegisterToInsuranceDatabase__Marker) notification.getNotifier(), (Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getNewValue(), "Families2Insurance.FamilyRegisterToInsuranceDatabase__Marker_CREATE__CORR__famRegToInsDb_FamilyRegisterToInsuranceDatabase"), getSelf());
		});
		feature2addEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getFatherToInsuranceClient__Marker_CONTEXT__TRG__insuranceDB(), notification -> {
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__CONSISTENCY_106_localSearch").tell(new ReferenceAdded<Families2Insurance.FatherToInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil,(Families2Insurance.FatherToInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNewValue(), "Families2Insurance.FatherToInsuranceClient__Marker_CONTEXT__TRG__insuranceDB_InsuranceDatabase"), getSelf());
		});
		feature2addEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getMotherNewFamilyToNewInsuranceClient__Marker_CONTEXT__SRC__familyRegister(), notification -> {
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__CONSISTENCY_139_localSearch").tell(new ReferenceAdded<Families2Insurance.MotherNewFamilyToNewInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil,(Families2Insurance.MotherNewFamilyToNewInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNewValue(), "Families2Insurance.MotherNewFamilyToNewInsuranceClient__Marker_CONTEXT__SRC__familyRegister_FamilyRegister"), getSelf());
		});
		feature2addEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getSonToInsuranceClient__Marker_CONTEXT__CORR__familyRegisterToInsuranceDB(), notification -> {
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__CONSISTENCY_207_localSearch").tell(new ReferenceAdded<Families2Insurance.SonToInsuranceClient__Marker, Families2Insurance.FamilyRegisterToInsuranceDatabase>(incUtil,(Families2Insurance.SonToInsuranceClient__Marker) notification.getNotifier(), (Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getNewValue(), "Families2Insurance.SonToInsuranceClient__Marker_CONTEXT__CORR__familyRegisterToInsuranceDB_FamilyRegisterToInsuranceDatabase"), getSelf());
		});
		feature2addEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getFamilyRegisterToInsuranceDatabase__Marker_CREATE__SRC__familyRegister(), notification -> {
			incUtil.newMessage();
			name2actor.get("FamilyRegisterToInsuranceDatabase__CONSISTENCY_40_localSearch").tell(new ReferenceAdded<Families2Insurance.FamilyRegisterToInsuranceDatabase__Marker, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil,(Families2Insurance.FamilyRegisterToInsuranceDatabase__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNewValue(), "Families2Insurance.FamilyRegisterToInsuranceDatabase__Marker_CREATE__SRC__familyRegister_FamilyRegister"), getSelf());
		});
		feature2addEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getFatherToInsuranceClient__Marker_CREATE__SRC__father(), notification -> {
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__CONSISTENCY_106_localSearch").tell(new ReferenceAdded<Families2Insurance.FatherToInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil,(Families2Insurance.FatherToInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNewValue(), "Families2Insurance.FatherToInsuranceClient__Marker_CREATE__SRC__father_Member"), getSelf());
		});
		feature2addEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getDaughterToInsuranceClient__Marker_CREATE__TRG__insuranceClient(), notification -> {
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__CONSISTENCY_31_localSearch").tell(new ReferenceAdded<Families2Insurance.DaughterToInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil,(Families2Insurance.DaughterToInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getNewValue(), "Families2Insurance.DaughterToInsuranceClient__Marker_CREATE__TRG__insuranceClient_InsuranceClient"), getSelf());
		});
		feature2addEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getFatherNewFamilyToNewInsuranceClient__Marker_CREATE__CORR__memberToInsuranceClient(), notification -> {
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__CONSISTENCY_72_localSearch").tell(new ReferenceAdded<Families2Insurance.FatherNewFamilyToNewInsuranceClient__Marker, Families2Insurance.MemberToInsuranceClient>(incUtil,(Families2Insurance.FatherNewFamilyToNewInsuranceClient__Marker) notification.getNotifier(), (Families2Insurance.MemberToInsuranceClient) notification.getNewValue(), "Families2Insurance.FatherNewFamilyToNewInsuranceClient__Marker_CREATE__CORR__memberToInsuranceClient_MemberToInsuranceClient"), getSelf());
		});
		feature2addEdgeConsumer.put(edu.kit.ipd.sdq.metamodels.families.FamiliesPackage.eINSTANCE.getFamily_Father(), notification -> {
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient_daughter_father_incoming_SRC__FILTER_NAC_SRC_11_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil,(edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.Family_father_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__CC_58_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil,(edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.Family_father_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__SRC_65_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil,(edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.Family_father_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__CC_92_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil,(edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.Family_father_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__SRC_99_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil,(edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.Family_father_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient_mother_father_incoming_SRC__FILTER_NAC_SRC_122_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil,(edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.Family_father_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient_mother_father_incoming_SRC__FILTER_NAC_SRC_156_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil,(edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.Family_father_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient_son_father_incoming_SRC__FILTER_NAC_SRC_187_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil,(edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.Family_father_Member"), getSelf());
		});
		feature2addEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getFamilyToInsuranceClient_Source(), notification -> {
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__CONSISTENCY_31_localSearch").tell(new ReferenceAdded<Families2Insurance.FamilyToInsuranceClient, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil,(Families2Insurance.FamilyToInsuranceClient) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNewValue(), "Families2Insurance.FamilyToInsuranceClient_source_Family"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__CONSISTENCY_72_localSearch").tell(new ReferenceAdded<Families2Insurance.FamilyToInsuranceClient, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil,(Families2Insurance.FamilyToInsuranceClient) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNewValue(), "Families2Insurance.FamilyToInsuranceClient_source_Family"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__CONSISTENCY_106_localSearch").tell(new ReferenceAdded<Families2Insurance.FamilyToInsuranceClient, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil,(Families2Insurance.FamilyToInsuranceClient) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNewValue(), "Families2Insurance.FamilyToInsuranceClient_source_Family"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__CONSISTENCY_139_localSearch").tell(new ReferenceAdded<Families2Insurance.FamilyToInsuranceClient, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil,(Families2Insurance.FamilyToInsuranceClient) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNewValue(), "Families2Insurance.FamilyToInsuranceClient_source_Family"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__CONSISTENCY_173_localSearch").tell(new ReferenceAdded<Families2Insurance.FamilyToInsuranceClient, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil,(Families2Insurance.FamilyToInsuranceClient) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNewValue(), "Families2Insurance.FamilyToInsuranceClient_source_Family"), getSelf());
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__CONSISTENCY_207_localSearch").tell(new ReferenceAdded<Families2Insurance.FamilyToInsuranceClient, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil,(Families2Insurance.FamilyToInsuranceClient) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNewValue(), "Families2Insurance.FamilyToInsuranceClient_source_Family"), getSelf());
		});
		feature2addEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getMotherToInsuranceClient__Marker_CREATE__TRG__insuranceClient(), notification -> {
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__CONSISTENCY_173_localSearch").tell(new ReferenceAdded<Families2Insurance.MotherToInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil,(Families2Insurance.MotherToInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getNewValue(), "Families2Insurance.MotherToInsuranceClient__Marker_CREATE__TRG__insuranceClient_InsuranceClient"), getSelf());
		});
		feature2addEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getMotherToInsuranceClient__Marker_CONTEXT__SRC__familyRegister(), notification -> {
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__CONSISTENCY_173_localSearch").tell(new ReferenceAdded<Families2Insurance.MotherToInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil,(Families2Insurance.MotherToInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNewValue(), "Families2Insurance.MotherToInsuranceClient__Marker_CONTEXT__SRC__familyRegister_FamilyRegister"), getSelf());
		});
		feature2addEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getMotherToInsuranceClient__Marker_CONTEXT__CORR__familyRegisterToInsuranceDB(), notification -> {
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__CONSISTENCY_173_localSearch").tell(new ReferenceAdded<Families2Insurance.MotherToInsuranceClient__Marker, Families2Insurance.FamilyRegisterToInsuranceDatabase>(incUtil,(Families2Insurance.MotherToInsuranceClient__Marker) notification.getNotifier(), (Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getNewValue(), "Families2Insurance.MotherToInsuranceClient__Marker_CONTEXT__CORR__familyRegisterToInsuranceDB_FamilyRegisterToInsuranceDatabase"), getSelf());
		});
		feature2addEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getDaughterToInsuranceClient__Marker_CONTEXT__TRG__insuranceDB(), notification -> {
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__CONSISTENCY_31_localSearch").tell(new ReferenceAdded<Families2Insurance.DaughterToInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil,(Families2Insurance.DaughterToInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNewValue(), "Families2Insurance.DaughterToInsuranceClient__Marker_CONTEXT__TRG__insuranceDB_InsuranceDatabase"), getSelf());
		});
		feature2addEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getDaughterToInsuranceClient__Marker_CONTEXT__CORR__familyRegisterToInsuranceDB(), notification -> {
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__CONSISTENCY_31_localSearch").tell(new ReferenceAdded<Families2Insurance.DaughterToInsuranceClient__Marker, Families2Insurance.FamilyRegisterToInsuranceDatabase>(incUtil,(Families2Insurance.DaughterToInsuranceClient__Marker) notification.getNotifier(), (Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getNewValue(), "Families2Insurance.DaughterToInsuranceClient__Marker_CONTEXT__CORR__familyRegisterToInsuranceDB_FamilyRegisterToInsuranceDatabase"), getSelf());
		});
		feature2addEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getMotherNewFamilyToNewInsuranceClient__Marker_CONTEXT__CORR__familyRegisterToInsuranceDB(), notification -> {
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__CONSISTENCY_139_localSearch").tell(new ReferenceAdded<Families2Insurance.MotherNewFamilyToNewInsuranceClient__Marker, Families2Insurance.FamilyRegisterToInsuranceDatabase>(incUtil,(Families2Insurance.MotherNewFamilyToNewInsuranceClient__Marker) notification.getNotifier(), (Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getNewValue(), "Families2Insurance.MotherNewFamilyToNewInsuranceClient__Marker_CONTEXT__CORR__familyRegisterToInsuranceDB_FamilyRegisterToInsuranceDatabase"), getSelf());
		});
		feature2addEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getFatherToInsuranceClient__Marker_CONTEXT__SRC__familyRegister(), notification -> {
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__CONSISTENCY_106_localSearch").tell(new ReferenceAdded<Families2Insurance.FatherToInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil,(Families2Insurance.FatherToInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNewValue(), "Families2Insurance.FatherToInsuranceClient__Marker_CONTEXT__SRC__familyRegister_FamilyRegister"), getSelf());
		});
		feature2addEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getFatherNewFamilyToNewInsuranceClient__Marker_CREATE__SRC__family(), notification -> {
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__CONSISTENCY_72_localSearch").tell(new ReferenceAdded<Families2Insurance.FatherNewFamilyToNewInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil,(Families2Insurance.FatherNewFamilyToNewInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNewValue(), "Families2Insurance.FatherNewFamilyToNewInsuranceClient__Marker_CREATE__SRC__family_Family"), getSelf());
		});
		feature2addEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getFamilyRegisterToInsuranceDatabase__Marker_CREATE__TRG__insuranceDb(), notification -> {
			incUtil.newMessage();
			name2actor.get("FamilyRegisterToInsuranceDatabase__CONSISTENCY_40_localSearch").tell(new ReferenceAdded<Families2Insurance.FamilyRegisterToInsuranceDatabase__Marker, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil,(Families2Insurance.FamilyRegisterToInsuranceDatabase__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNewValue(), "Families2Insurance.FamilyRegisterToInsuranceDatabase__Marker_CREATE__TRG__insuranceDb_InsuranceDatabase"), getSelf());
		});
		feature2addEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getMotherNewFamilyToNewInsuranceClient__Marker_CREATE__TRG__insuranceClient(), notification -> {
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__CONSISTENCY_139_localSearch").tell(new ReferenceAdded<Families2Insurance.MotherNewFamilyToNewInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil,(Families2Insurance.MotherNewFamilyToNewInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getNewValue(), "Families2Insurance.MotherNewFamilyToNewInsuranceClient__Marker_CREATE__TRG__insuranceClient_InsuranceClient"), getSelf());
		});
		feature2addEdgeConsumer.put(edu.kit.ipd.sdq.metamodels.families.FamiliesPackage.eINSTANCE.getFamily_Sons(), notification -> {
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient_daughter_sons_incoming_SRC__FILTER_NAC_SRC_8_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil,(edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.Family_sons_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient_father_sons_incoming_SRC__FILTER_NAC_SRC_49_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil,(edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.Family_sons_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient_father_sons_incoming_SRC__FILTER_NAC_SRC_83_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil,(edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.Family_sons_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient_mother_sons_incoming_SRC__FILTER_NAC_SRC_116_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil,(edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.Family_sons_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient_mother_sons_incoming_SRC__FILTER_NAC_SRC_150_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil,(edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.Family_sons_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__CC_193_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil,(edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.Family_sons_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__SRC_200_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil,(edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.Family_sons_Member"), getSelf());
		});
		feature2addEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getMotherNewFamilyToNewInsuranceClient__Marker_CREATE__CORR__familyToInsuranceClient(), notification -> {
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__CONSISTENCY_139_localSearch").tell(new ReferenceAdded<Families2Insurance.MotherNewFamilyToNewInsuranceClient__Marker, Families2Insurance.FamilyToInsuranceClient>(incUtil,(Families2Insurance.MotherNewFamilyToNewInsuranceClient__Marker) notification.getNotifier(), (Families2Insurance.FamilyToInsuranceClient) notification.getNewValue(), "Families2Insurance.MotherNewFamilyToNewInsuranceClient__Marker_CREATE__CORR__familyToInsuranceClient_FamilyToInsuranceClient"), getSelf());
		});
		feature2addEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getSonToInsuranceClient__Marker_CREATE__SRC__son(), notification -> {
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__CONSISTENCY_207_localSearch").tell(new ReferenceAdded<Families2Insurance.SonToInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil,(Families2Insurance.SonToInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNewValue(), "Families2Insurance.SonToInsuranceClient__Marker_CREATE__SRC__son_Member"), getSelf());
		});
		feature2addEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getDaughterToInsuranceClient__Marker_CONTEXT__SRC__family(), notification -> {
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__CONSISTENCY_31_localSearch").tell(new ReferenceAdded<Families2Insurance.DaughterToInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil,(Families2Insurance.DaughterToInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNewValue(), "Families2Insurance.DaughterToInsuranceClient__Marker_CONTEXT__SRC__family_Family"), getSelf());
		});
		feature2addEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getFatherNewFamilyToNewInsuranceClient__Marker_CONTEXT__TRG__insuranceDB(), notification -> {
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__CONSISTENCY_72_localSearch").tell(new ReferenceAdded<Families2Insurance.FatherNewFamilyToNewInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil,(Families2Insurance.FatherNewFamilyToNewInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNewValue(), "Families2Insurance.FatherNewFamilyToNewInsuranceClient__Marker_CONTEXT__TRG__insuranceDB_InsuranceDatabase"), getSelf());
		});
		feature2addEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getMotherToInsuranceClient__Marker_CONTEXT__TRG__insuranceDB(), notification -> {
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__CONSISTENCY_173_localSearch").tell(new ReferenceAdded<Families2Insurance.MotherToInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil,(Families2Insurance.MotherToInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNewValue(), "Families2Insurance.MotherToInsuranceClient__Marker_CONTEXT__TRG__insuranceDB_InsuranceDatabase"), getSelf());
		});
		feature2addEdgeConsumer.put(edu.kit.ipd.sdq.metamodels.insurance.InsurancePackage.eINSTANCE.getInsuranceDatabase_Insuranceclient(), notification -> {
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__TRG_1_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil,(edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase_insuranceclient_InsuranceClient"), getSelf());
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__CC_17_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil,(edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase_insuranceclient_InsuranceClient"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__TRG_43_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil,(edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase_insuranceclient_InsuranceClient"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__CC_58_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil,(edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase_insuranceclient_InsuranceClient"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__TRG_76_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil,(edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase_insuranceclient_InsuranceClient"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__CC_92_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil,(edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase_insuranceclient_InsuranceClient"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__TRG_110_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil,(edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase_insuranceclient_InsuranceClient"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__CC_125_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil,(edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase_insuranceclient_InsuranceClient"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__TRG_143_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil,(edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase_insuranceclient_InsuranceClient"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__CC_159_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil,(edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase_insuranceclient_InsuranceClient"), getSelf());
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__TRG_177_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil,(edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase_insuranceclient_InsuranceClient"), getSelf());
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__CC_193_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil,(edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase_insuranceclient_InsuranceClient"), getSelf());
		});
		feature2addEdgeConsumer.put(edu.kit.ipd.sdq.metamodels.families.FamiliesPackage.eINSTANCE.getFamily_Daughters(), notification -> {
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient_father_daughters_incoming_SRC__FILTER_NAC_SRC_52_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil,(edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.Family_daughters_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient_father_daughters_incoming_SRC__FILTER_NAC_SRC_86_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil,(edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.Family_daughters_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient_mother_daughters_incoming_SRC__FILTER_NAC_SRC_119_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil,(edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.Family_daughters_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient_mother_daughters_incoming_SRC__FILTER_NAC_SRC_153_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil,(edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.Family_daughters_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient_son_daughters_incoming_SRC__FILTER_NAC_SRC_184_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil,(edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.Family_daughters_Member"), getSelf());
		});
		feature2addEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getFatherNewFamilyToNewInsuranceClient__Marker_CREATE__SRC__father(), notification -> {
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__CONSISTENCY_72_localSearch").tell(new ReferenceAdded<Families2Insurance.FatherNewFamilyToNewInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil,(Families2Insurance.FatherNewFamilyToNewInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNewValue(), "Families2Insurance.FatherNewFamilyToNewInsuranceClient__Marker_CREATE__SRC__father_Member"), getSelf());
		});
		feature2addEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getSonToInsuranceClient__Marker_CREATE__CORR__familyToInsuranceClient(), notification -> {
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__CONSISTENCY_207_localSearch").tell(new ReferenceAdded<Families2Insurance.SonToInsuranceClient__Marker, Families2Insurance.FamilyToInsuranceClient>(incUtil,(Families2Insurance.SonToInsuranceClient__Marker) notification.getNotifier(), (Families2Insurance.FamilyToInsuranceClient) notification.getNewValue(), "Families2Insurance.SonToInsuranceClient__Marker_CREATE__CORR__familyToInsuranceClient_FamilyToInsuranceClient"), getSelf());
		});
		feature2addEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getMotherToInsuranceClient__Marker_CREATE__CORR__familyToInsuranceClient(), notification -> {
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__CONSISTENCY_173_localSearch").tell(new ReferenceAdded<Families2Insurance.MotherToInsuranceClient__Marker, Families2Insurance.FamilyToInsuranceClient>(incUtil,(Families2Insurance.MotherToInsuranceClient__Marker) notification.getNotifier(), (Families2Insurance.FamilyToInsuranceClient) notification.getNewValue(), "Families2Insurance.MotherToInsuranceClient__Marker_CREATE__CORR__familyToInsuranceClient_FamilyToInsuranceClient"), getSelf());
		});
	}
	
	private void initializeRemoveEdge() {
		feature2removeEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getFatherToInsuranceClient__Marker_CONTEXT__SRC__family(), notification -> {
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__CONSISTENCY_106_localSearch").tell(new ReferenceDeleted<Families2Insurance.FatherToInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, (Families2Insurance.FatherToInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getOldValue(), "Families2Insurance.FatherToInsuranceClient__Marker_CONTEXT__SRC__family_Family"), getSelf());
		});
		feature2removeEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getFatherToInsuranceClient__Marker_CONTEXT__CORR__familyRegisterToInsuranceDB(), notification -> {
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__CONSISTENCY_106_localSearch").tell(new ReferenceDeleted<Families2Insurance.FatherToInsuranceClient__Marker, Families2Insurance.FamilyRegisterToInsuranceDatabase>(incUtil, (Families2Insurance.FatherToInsuranceClient__Marker) notification.getNotifier(), (Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getOldValue(), "Families2Insurance.FatherToInsuranceClient__Marker_CONTEXT__CORR__familyRegisterToInsuranceDB_FamilyRegisterToInsuranceDatabase"), getSelf());
		});
		feature2removeEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getFamilyRegisterToInsuranceDatabase_Target(), notification -> {
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__BWD_4_localSearch").tell(new ReferenceDeleted<Families2Insurance.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil, (Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getOldValue(), "Families2Insurance.FamilyRegisterToInsuranceDatabase_target_InsuranceDatabase"), getSelf());
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__CC_17_localSearch").tell(new ReferenceDeleted<Families2Insurance.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil, (Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getOldValue(), "Families2Insurance.FamilyRegisterToInsuranceDatabase_target_InsuranceDatabase"), getSelf());
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__FWD_28_localSearch").tell(new ReferenceDeleted<Families2Insurance.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil, (Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getOldValue(), "Families2Insurance.FamilyRegisterToInsuranceDatabase_target_InsuranceDatabase"), getSelf());
			incUtil.newMessage();
			name2actor.get("FamilyRegisterToInsuranceDatabase__CONSISTENCY_40_localSearch").tell(new ReferenceDeleted<Families2Insurance.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil, (Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getOldValue(), "Families2Insurance.FamilyRegisterToInsuranceDatabase_target_InsuranceDatabase"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__BWD_46_localSearch").tell(new ReferenceDeleted<Families2Insurance.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil, (Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getOldValue(), "Families2Insurance.FamilyRegisterToInsuranceDatabase_target_InsuranceDatabase"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__CC_58_localSearch").tell(new ReferenceDeleted<Families2Insurance.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil, (Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getOldValue(), "Families2Insurance.FamilyRegisterToInsuranceDatabase_target_InsuranceDatabase"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__FWD_69_localSearch").tell(new ReferenceDeleted<Families2Insurance.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil, (Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getOldValue(), "Families2Insurance.FamilyRegisterToInsuranceDatabase_target_InsuranceDatabase"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__BWD_79_localSearch").tell(new ReferenceDeleted<Families2Insurance.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil, (Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getOldValue(), "Families2Insurance.FamilyRegisterToInsuranceDatabase_target_InsuranceDatabase"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__CC_92_localSearch").tell(new ReferenceDeleted<Families2Insurance.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil, (Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getOldValue(), "Families2Insurance.FamilyRegisterToInsuranceDatabase_target_InsuranceDatabase"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__FWD_103_localSearch").tell(new ReferenceDeleted<Families2Insurance.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil, (Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getOldValue(), "Families2Insurance.FamilyRegisterToInsuranceDatabase_target_InsuranceDatabase"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__BWD_113_localSearch").tell(new ReferenceDeleted<Families2Insurance.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil, (Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getOldValue(), "Families2Insurance.FamilyRegisterToInsuranceDatabase_target_InsuranceDatabase"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__CC_125_localSearch").tell(new ReferenceDeleted<Families2Insurance.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil, (Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getOldValue(), "Families2Insurance.FamilyRegisterToInsuranceDatabase_target_InsuranceDatabase"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__FWD_136_localSearch").tell(new ReferenceDeleted<Families2Insurance.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil, (Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getOldValue(), "Families2Insurance.FamilyRegisterToInsuranceDatabase_target_InsuranceDatabase"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__BWD_146_localSearch").tell(new ReferenceDeleted<Families2Insurance.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil, (Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getOldValue(), "Families2Insurance.FamilyRegisterToInsuranceDatabase_target_InsuranceDatabase"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__CC_159_localSearch").tell(new ReferenceDeleted<Families2Insurance.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil, (Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getOldValue(), "Families2Insurance.FamilyRegisterToInsuranceDatabase_target_InsuranceDatabase"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__FWD_170_localSearch").tell(new ReferenceDeleted<Families2Insurance.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil, (Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getOldValue(), "Families2Insurance.FamilyRegisterToInsuranceDatabase_target_InsuranceDatabase"), getSelf());
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__BWD_180_localSearch").tell(new ReferenceDeleted<Families2Insurance.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil, (Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getOldValue(), "Families2Insurance.FamilyRegisterToInsuranceDatabase_target_InsuranceDatabase"), getSelf());
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__CC_193_localSearch").tell(new ReferenceDeleted<Families2Insurance.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil, (Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getOldValue(), "Families2Insurance.FamilyRegisterToInsuranceDatabase_target_InsuranceDatabase"), getSelf());
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__FWD_204_localSearch").tell(new ReferenceDeleted<Families2Insurance.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil, (Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getOldValue(), "Families2Insurance.FamilyRegisterToInsuranceDatabase_target_InsuranceDatabase"), getSelf());
		});
		feature2removeEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getMotherNewFamilyToNewInsuranceClient__Marker_CREATE__SRC__mother(), notification -> {
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__CONSISTENCY_139_localSearch").tell(new ReferenceDeleted<Families2Insurance.MotherNewFamilyToNewInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (Families2Insurance.MotherNewFamilyToNewInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getOldValue(), "Families2Insurance.MotherNewFamilyToNewInsuranceClient__Marker_CREATE__SRC__mother_Member"), getSelf());
		});
		feature2removeEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getMotherNewFamilyToNewInsuranceClient__Marker_CREATE__CORR__memberToInsuranceClient(), notification -> {
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__CONSISTENCY_139_localSearch").tell(new ReferenceDeleted<Families2Insurance.MotherNewFamilyToNewInsuranceClient__Marker, Families2Insurance.MemberToInsuranceClient>(incUtil, (Families2Insurance.MotherNewFamilyToNewInsuranceClient__Marker) notification.getNotifier(), (Families2Insurance.MemberToInsuranceClient) notification.getOldValue(), "Families2Insurance.MotherNewFamilyToNewInsuranceClient__Marker_CREATE__CORR__memberToInsuranceClient_MemberToInsuranceClient"), getSelf());
		});
		feature2removeEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getMotherToInsuranceClient__Marker_CREATE__SRC__mother(), notification -> {
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__CONSISTENCY_173_localSearch").tell(new ReferenceDeleted<Families2Insurance.MotherToInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (Families2Insurance.MotherToInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getOldValue(), "Families2Insurance.MotherToInsuranceClient__Marker_CREATE__SRC__mother_Member"), getSelf());
		});
		feature2removeEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getDaughterToInsuranceClient__Marker_CREATE__CORR__familyToInsuranceClient(), notification -> {
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__CONSISTENCY_31_localSearch").tell(new ReferenceDeleted<Families2Insurance.DaughterToInsuranceClient__Marker, Families2Insurance.FamilyToInsuranceClient>(incUtil, (Families2Insurance.DaughterToInsuranceClient__Marker) notification.getNotifier(), (Families2Insurance.FamilyToInsuranceClient) notification.getOldValue(), "Families2Insurance.DaughterToInsuranceClient__Marker_CREATE__CORR__familyToInsuranceClient_FamilyToInsuranceClient"), getSelf());
		});
		feature2removeEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getMotherToInsuranceClient__Marker_CREATE__CORR__memberToInsuranceClient(), notification -> {
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__CONSISTENCY_173_localSearch").tell(new ReferenceDeleted<Families2Insurance.MotherToInsuranceClient__Marker, Families2Insurance.MemberToInsuranceClient>(incUtil, (Families2Insurance.MotherToInsuranceClient__Marker) notification.getNotifier(), (Families2Insurance.MemberToInsuranceClient) notification.getOldValue(), "Families2Insurance.MotherToInsuranceClient__Marker_CREATE__CORR__memberToInsuranceClient_MemberToInsuranceClient"), getSelf());
		});
		feature2removeEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getFatherToInsuranceClient__Marker_CREATE__TRG__insuranceClient(), notification -> {
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__CONSISTENCY_106_localSearch").tell(new ReferenceDeleted<Families2Insurance.FatherToInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil, (Families2Insurance.FatherToInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getOldValue(), "Families2Insurance.FatherToInsuranceClient__Marker_CREATE__TRG__insuranceClient_InsuranceClient"), getSelf());
		});
		feature2removeEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getFatherNewFamilyToNewInsuranceClient__Marker_CREATE__CORR__familyToInsuranceClient(), notification -> {
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__CONSISTENCY_72_localSearch").tell(new ReferenceDeleted<Families2Insurance.FatherNewFamilyToNewInsuranceClient__Marker, Families2Insurance.FamilyToInsuranceClient>(incUtil, (Families2Insurance.FatherNewFamilyToNewInsuranceClient__Marker) notification.getNotifier(), (Families2Insurance.FamilyToInsuranceClient) notification.getOldValue(), "Families2Insurance.FatherNewFamilyToNewInsuranceClient__Marker_CREATE__CORR__familyToInsuranceClient_FamilyToInsuranceClient"), getSelf());
		});
		feature2removeEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getFatherToInsuranceClient__Marker_CREATE__CORR__familyToInsuranceClient(), notification -> {
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__CONSISTENCY_106_localSearch").tell(new ReferenceDeleted<Families2Insurance.FatherToInsuranceClient__Marker, Families2Insurance.FamilyToInsuranceClient>(incUtil, (Families2Insurance.FatherToInsuranceClient__Marker) notification.getNotifier(), (Families2Insurance.FamilyToInsuranceClient) notification.getOldValue(), "Families2Insurance.FatherToInsuranceClient__Marker_CREATE__CORR__familyToInsuranceClient_FamilyToInsuranceClient"), getSelf());
		});
		feature2removeEdgeConsumer.put(edu.kit.ipd.sdq.metamodels.families.FamiliesPackage.eINSTANCE.getFamily_Mother(), notification -> {
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient_daughter_mother_incoming_SRC__FILTER_NAC_SRC_14_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.Family_mother_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient_father_mother_incoming_SRC__FILTER_NAC_SRC_55_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.Family_mother_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient_father_mother_incoming_SRC__FILTER_NAC_SRC_89_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.Family_mother_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__CC_125_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.Family_mother_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__SRC_132_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.Family_mother_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__CC_159_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.Family_mother_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__SRC_166_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.Family_mother_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient_son_mother_incoming_SRC__FILTER_NAC_SRC_190_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.Family_mother_Member"), getSelf());
		});
		feature2removeEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getMemberToInsuranceClient_Target(), notification -> {
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__CONSISTENCY_31_localSearch").tell(new ReferenceDeleted<Families2Insurance.MemberToInsuranceClient, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil, (Families2Insurance.MemberToInsuranceClient) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getOldValue(), "Families2Insurance.MemberToInsuranceClient_target_InsuranceClient"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__CONSISTENCY_72_localSearch").tell(new ReferenceDeleted<Families2Insurance.MemberToInsuranceClient, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil, (Families2Insurance.MemberToInsuranceClient) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getOldValue(), "Families2Insurance.MemberToInsuranceClient_target_InsuranceClient"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__CONSISTENCY_106_localSearch").tell(new ReferenceDeleted<Families2Insurance.MemberToInsuranceClient, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil, (Families2Insurance.MemberToInsuranceClient) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getOldValue(), "Families2Insurance.MemberToInsuranceClient_target_InsuranceClient"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__CONSISTENCY_139_localSearch").tell(new ReferenceDeleted<Families2Insurance.MemberToInsuranceClient, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil, (Families2Insurance.MemberToInsuranceClient) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getOldValue(), "Families2Insurance.MemberToInsuranceClient_target_InsuranceClient"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__CONSISTENCY_173_localSearch").tell(new ReferenceDeleted<Families2Insurance.MemberToInsuranceClient, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil, (Families2Insurance.MemberToInsuranceClient) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getOldValue(), "Families2Insurance.MemberToInsuranceClient_target_InsuranceClient"), getSelf());
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__CONSISTENCY_207_localSearch").tell(new ReferenceDeleted<Families2Insurance.MemberToInsuranceClient, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil, (Families2Insurance.MemberToInsuranceClient) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getOldValue(), "Families2Insurance.MemberToInsuranceClient_target_InsuranceClient"), getSelf());
		});
		feature2removeEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getSonToInsuranceClient__Marker_CREATE__TRG__insuranceClient(), notification -> {
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__CONSISTENCY_207_localSearch").tell(new ReferenceDeleted<Families2Insurance.SonToInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil, (Families2Insurance.SonToInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getOldValue(), "Families2Insurance.SonToInsuranceClient__Marker_CREATE__TRG__insuranceClient_InsuranceClient"), getSelf());
		});
		feature2removeEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getMotherNewFamilyToNewInsuranceClient__Marker_CREATE__SRC__family(), notification -> {
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__CONSISTENCY_139_localSearch").tell(new ReferenceDeleted<Families2Insurance.MotherNewFamilyToNewInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, (Families2Insurance.MotherNewFamilyToNewInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getOldValue(), "Families2Insurance.MotherNewFamilyToNewInsuranceClient__Marker_CREATE__SRC__family_Family"), getSelf());
		});
		feature2removeEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getFatherNewFamilyToNewInsuranceClient__Marker_CREATE__TRG__insuranceClient(), notification -> {
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__CONSISTENCY_72_localSearch").tell(new ReferenceDeleted<Families2Insurance.FatherNewFamilyToNewInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil, (Families2Insurance.FatherNewFamilyToNewInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getOldValue(), "Families2Insurance.FatherNewFamilyToNewInsuranceClient__Marker_CREATE__TRG__insuranceClient_InsuranceClient"), getSelf());
		});
		feature2removeEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getSonToInsuranceClient__Marker_CONTEXT__SRC__familyRegister(), notification -> {
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__CONSISTENCY_207_localSearch").tell(new ReferenceDeleted<Families2Insurance.SonToInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil, (Families2Insurance.SonToInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getOldValue(), "Families2Insurance.SonToInsuranceClient__Marker_CONTEXT__SRC__familyRegister_FamilyRegister"), getSelf());
		});
		feature2removeEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getFamilyRegisterToInsuranceDatabase_Source(), notification -> {
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__BWD_4_localSearch").tell(new ReferenceDeleted<Families2Insurance.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil, (Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getOldValue(), "Families2Insurance.FamilyRegisterToInsuranceDatabase_source_FamilyRegister"), getSelf());
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__CC_17_localSearch").tell(new ReferenceDeleted<Families2Insurance.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil, (Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getOldValue(), "Families2Insurance.FamilyRegisterToInsuranceDatabase_source_FamilyRegister"), getSelf());
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__FWD_28_localSearch").tell(new ReferenceDeleted<Families2Insurance.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil, (Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getOldValue(), "Families2Insurance.FamilyRegisterToInsuranceDatabase_source_FamilyRegister"), getSelf());
			incUtil.newMessage();
			name2actor.get("FamilyRegisterToInsuranceDatabase__CONSISTENCY_40_localSearch").tell(new ReferenceDeleted<Families2Insurance.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil, (Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getOldValue(), "Families2Insurance.FamilyRegisterToInsuranceDatabase_source_FamilyRegister"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__BWD_46_localSearch").tell(new ReferenceDeleted<Families2Insurance.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil, (Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getOldValue(), "Families2Insurance.FamilyRegisterToInsuranceDatabase_source_FamilyRegister"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__CC_58_localSearch").tell(new ReferenceDeleted<Families2Insurance.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil, (Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getOldValue(), "Families2Insurance.FamilyRegisterToInsuranceDatabase_source_FamilyRegister"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__FWD_69_localSearch").tell(new ReferenceDeleted<Families2Insurance.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil, (Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getOldValue(), "Families2Insurance.FamilyRegisterToInsuranceDatabase_source_FamilyRegister"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__BWD_79_localSearch").tell(new ReferenceDeleted<Families2Insurance.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil, (Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getOldValue(), "Families2Insurance.FamilyRegisterToInsuranceDatabase_source_FamilyRegister"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__CC_92_localSearch").tell(new ReferenceDeleted<Families2Insurance.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil, (Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getOldValue(), "Families2Insurance.FamilyRegisterToInsuranceDatabase_source_FamilyRegister"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__FWD_103_localSearch").tell(new ReferenceDeleted<Families2Insurance.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil, (Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getOldValue(), "Families2Insurance.FamilyRegisterToInsuranceDatabase_source_FamilyRegister"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__BWD_113_localSearch").tell(new ReferenceDeleted<Families2Insurance.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil, (Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getOldValue(), "Families2Insurance.FamilyRegisterToInsuranceDatabase_source_FamilyRegister"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__CC_125_localSearch").tell(new ReferenceDeleted<Families2Insurance.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil, (Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getOldValue(), "Families2Insurance.FamilyRegisterToInsuranceDatabase_source_FamilyRegister"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__FWD_136_localSearch").tell(new ReferenceDeleted<Families2Insurance.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil, (Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getOldValue(), "Families2Insurance.FamilyRegisterToInsuranceDatabase_source_FamilyRegister"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__BWD_146_localSearch").tell(new ReferenceDeleted<Families2Insurance.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil, (Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getOldValue(), "Families2Insurance.FamilyRegisterToInsuranceDatabase_source_FamilyRegister"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__CC_159_localSearch").tell(new ReferenceDeleted<Families2Insurance.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil, (Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getOldValue(), "Families2Insurance.FamilyRegisterToInsuranceDatabase_source_FamilyRegister"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__FWD_170_localSearch").tell(new ReferenceDeleted<Families2Insurance.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil, (Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getOldValue(), "Families2Insurance.FamilyRegisterToInsuranceDatabase_source_FamilyRegister"), getSelf());
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__BWD_180_localSearch").tell(new ReferenceDeleted<Families2Insurance.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil, (Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getOldValue(), "Families2Insurance.FamilyRegisterToInsuranceDatabase_source_FamilyRegister"), getSelf());
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__CC_193_localSearch").tell(new ReferenceDeleted<Families2Insurance.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil, (Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getOldValue(), "Families2Insurance.FamilyRegisterToInsuranceDatabase_source_FamilyRegister"), getSelf());
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__FWD_204_localSearch").tell(new ReferenceDeleted<Families2Insurance.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil, (Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getOldValue(), "Families2Insurance.FamilyRegisterToInsuranceDatabase_source_FamilyRegister"), getSelf());
		});
		feature2removeEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getSonToInsuranceClient__Marker_CREATE__CORR__memberToInsuranceClient(), notification -> {
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__CONSISTENCY_207_localSearch").tell(new ReferenceDeleted<Families2Insurance.SonToInsuranceClient__Marker, Families2Insurance.MemberToInsuranceClient>(incUtil, (Families2Insurance.SonToInsuranceClient__Marker) notification.getNotifier(), (Families2Insurance.MemberToInsuranceClient) notification.getOldValue(), "Families2Insurance.SonToInsuranceClient__Marker_CREATE__CORR__memberToInsuranceClient_MemberToInsuranceClient"), getSelf());
		});
		feature2removeEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getSonToInsuranceClient__Marker_CONTEXT__TRG__insuranceDB(), notification -> {
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__CONSISTENCY_207_localSearch").tell(new ReferenceDeleted<Families2Insurance.SonToInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil, (Families2Insurance.SonToInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getOldValue(), "Families2Insurance.SonToInsuranceClient__Marker_CONTEXT__TRG__insuranceDB_InsuranceDatabase"), getSelf());
		});
		feature2removeEdgeConsumer.put(edu.kit.ipd.sdq.metamodels.families.FamiliesPackage.eINSTANCE.getMember_FamilyDaughter(), notification -> {
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__CC_17_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.Member, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.Member_familyDaughter_Family"), getSelf());
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__SRC_24_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.Member, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.Member_familyDaughter_Family"), getSelf());
		});
		feature2removeEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getDaughterToInsuranceClient__Marker_CREATE__SRC__daughter(), notification -> {
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__CONSISTENCY_31_localSearch").tell(new ReferenceDeleted<Families2Insurance.DaughterToInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (Families2Insurance.DaughterToInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getOldValue(), "Families2Insurance.DaughterToInsuranceClient__Marker_CREATE__SRC__daughter_Member"), getSelf());
		});
		feature2removeEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getFamilyToInsuranceClient_Target(), notification -> {
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__CONSISTENCY_31_localSearch").tell(new ReferenceDeleted<Families2Insurance.FamilyToInsuranceClient, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil, (Families2Insurance.FamilyToInsuranceClient) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getOldValue(), "Families2Insurance.FamilyToInsuranceClient_target_InsuranceClient"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__CONSISTENCY_72_localSearch").tell(new ReferenceDeleted<Families2Insurance.FamilyToInsuranceClient, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil, (Families2Insurance.FamilyToInsuranceClient) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getOldValue(), "Families2Insurance.FamilyToInsuranceClient_target_InsuranceClient"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__CONSISTENCY_106_localSearch").tell(new ReferenceDeleted<Families2Insurance.FamilyToInsuranceClient, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil, (Families2Insurance.FamilyToInsuranceClient) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getOldValue(), "Families2Insurance.FamilyToInsuranceClient_target_InsuranceClient"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__CONSISTENCY_139_localSearch").tell(new ReferenceDeleted<Families2Insurance.FamilyToInsuranceClient, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil, (Families2Insurance.FamilyToInsuranceClient) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getOldValue(), "Families2Insurance.FamilyToInsuranceClient_target_InsuranceClient"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__CONSISTENCY_173_localSearch").tell(new ReferenceDeleted<Families2Insurance.FamilyToInsuranceClient, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil, (Families2Insurance.FamilyToInsuranceClient) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getOldValue(), "Families2Insurance.FamilyToInsuranceClient_target_InsuranceClient"), getSelf());
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__CONSISTENCY_207_localSearch").tell(new ReferenceDeleted<Families2Insurance.FamilyToInsuranceClient, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil, (Families2Insurance.FamilyToInsuranceClient) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getOldValue(), "Families2Insurance.FamilyToInsuranceClient_target_InsuranceClient"), getSelf());
		});
		feature2removeEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getDaughterToInsuranceClient__Marker_CREATE__CORR__memberToInsuranceClient(), notification -> {
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__CONSISTENCY_31_localSearch").tell(new ReferenceDeleted<Families2Insurance.DaughterToInsuranceClient__Marker, Families2Insurance.MemberToInsuranceClient>(incUtil, (Families2Insurance.DaughterToInsuranceClient__Marker) notification.getNotifier(), (Families2Insurance.MemberToInsuranceClient) notification.getOldValue(), "Families2Insurance.DaughterToInsuranceClient__Marker_CREATE__CORR__memberToInsuranceClient_MemberToInsuranceClient"), getSelf());
		});
		feature2removeEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getFatherNewFamilyToNewInsuranceClient__Marker_CONTEXT__CORR__familyRegisterToInsuranceDB(), notification -> {
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__CONSISTENCY_72_localSearch").tell(new ReferenceDeleted<Families2Insurance.FatherNewFamilyToNewInsuranceClient__Marker, Families2Insurance.FamilyRegisterToInsuranceDatabase>(incUtil, (Families2Insurance.FatherNewFamilyToNewInsuranceClient__Marker) notification.getNotifier(), (Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getOldValue(), "Families2Insurance.FatherNewFamilyToNewInsuranceClient__Marker_CONTEXT__CORR__familyRegisterToInsuranceDB_FamilyRegisterToInsuranceDatabase"), getSelf());
		});
		feature2removeEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getMotherNewFamilyToNewInsuranceClient__Marker_CONTEXT__TRG__insuranceDB(), notification -> {
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__CONSISTENCY_139_localSearch").tell(new ReferenceDeleted<Families2Insurance.MotherNewFamilyToNewInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil, (Families2Insurance.MotherNewFamilyToNewInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getOldValue(), "Families2Insurance.MotherNewFamilyToNewInsuranceClient__Marker_CONTEXT__TRG__insuranceDB_InsuranceDatabase"), getSelf());
		});
		feature2removeEdgeConsumer.put(edu.kit.ipd.sdq.metamodels.families.FamiliesPackage.eINSTANCE.getFamilyRegister_Families(), notification -> {
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__BWD_4_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.FamilyRegister, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.FamilyRegister_families_Family"), getSelf());
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__CC_17_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.FamilyRegister, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.FamilyRegister_families_Family"), getSelf());
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__SRC_24_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.FamilyRegister, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.FamilyRegister_families_Family"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__CC_58_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.FamilyRegister, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.FamilyRegister_families_Family"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__SRC_65_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.FamilyRegister, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.FamilyRegister_families_Family"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__BWD_79_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.FamilyRegister, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.FamilyRegister_families_Family"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__CC_92_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.FamilyRegister, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.FamilyRegister_families_Family"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__SRC_99_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.FamilyRegister, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.FamilyRegister_families_Family"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__CC_125_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.FamilyRegister, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.FamilyRegister_families_Family"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__SRC_132_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.FamilyRegister, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.FamilyRegister_families_Family"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__BWD_146_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.FamilyRegister, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.FamilyRegister_families_Family"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__CC_159_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.FamilyRegister, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.FamilyRegister_families_Family"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__SRC_166_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.FamilyRegister, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.FamilyRegister_families_Family"), getSelf());
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__BWD_180_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.FamilyRegister, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.FamilyRegister_families_Family"), getSelf());
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__CC_193_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.FamilyRegister, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.FamilyRegister_families_Family"), getSelf());
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__SRC_200_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.FamilyRegister, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.FamilyRegister_families_Family"), getSelf());
		});
		feature2removeEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getMemberToInsuranceClient_Source(), notification -> {
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__CONSISTENCY_31_localSearch").tell(new ReferenceDeleted<Families2Insurance.MemberToInsuranceClient, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (Families2Insurance.MemberToInsuranceClient) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getOldValue(), "Families2Insurance.MemberToInsuranceClient_source_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__CONSISTENCY_72_localSearch").tell(new ReferenceDeleted<Families2Insurance.MemberToInsuranceClient, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (Families2Insurance.MemberToInsuranceClient) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getOldValue(), "Families2Insurance.MemberToInsuranceClient_source_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__CONSISTENCY_106_localSearch").tell(new ReferenceDeleted<Families2Insurance.MemberToInsuranceClient, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (Families2Insurance.MemberToInsuranceClient) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getOldValue(), "Families2Insurance.MemberToInsuranceClient_source_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__CONSISTENCY_139_localSearch").tell(new ReferenceDeleted<Families2Insurance.MemberToInsuranceClient, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (Families2Insurance.MemberToInsuranceClient) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getOldValue(), "Families2Insurance.MemberToInsuranceClient_source_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__CONSISTENCY_173_localSearch").tell(new ReferenceDeleted<Families2Insurance.MemberToInsuranceClient, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (Families2Insurance.MemberToInsuranceClient) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getOldValue(), "Families2Insurance.MemberToInsuranceClient_source_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__CONSISTENCY_207_localSearch").tell(new ReferenceDeleted<Families2Insurance.MemberToInsuranceClient, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (Families2Insurance.MemberToInsuranceClient) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getOldValue(), "Families2Insurance.MemberToInsuranceClient_source_Member"), getSelf());
		});
		feature2removeEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getFatherNewFamilyToNewInsuranceClient__Marker_CONTEXT__SRC__familyRegister(), notification -> {
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__CONSISTENCY_72_localSearch").tell(new ReferenceDeleted<Families2Insurance.FatherNewFamilyToNewInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil, (Families2Insurance.FatherNewFamilyToNewInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getOldValue(), "Families2Insurance.FatherNewFamilyToNewInsuranceClient__Marker_CONTEXT__SRC__familyRegister_FamilyRegister"), getSelf());
		});
		feature2removeEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getFatherToInsuranceClient__Marker_CREATE__CORR__memberToInsuranceClient(), notification -> {
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__CONSISTENCY_106_localSearch").tell(new ReferenceDeleted<Families2Insurance.FatherToInsuranceClient__Marker, Families2Insurance.MemberToInsuranceClient>(incUtil, (Families2Insurance.FatherToInsuranceClient__Marker) notification.getNotifier(), (Families2Insurance.MemberToInsuranceClient) notification.getOldValue(), "Families2Insurance.FatherToInsuranceClient__Marker_CREATE__CORR__memberToInsuranceClient_MemberToInsuranceClient"), getSelf());
		});
		feature2removeEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getMotherToInsuranceClient__Marker_CONTEXT__SRC__family(), notification -> {
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__CONSISTENCY_173_localSearch").tell(new ReferenceDeleted<Families2Insurance.MotherToInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, (Families2Insurance.MotherToInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getOldValue(), "Families2Insurance.MotherToInsuranceClient__Marker_CONTEXT__SRC__family_Family"), getSelf());
		});
		feature2removeEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getDaughterToInsuranceClient__Marker_CONTEXT__SRC__familyRegister(), notification -> {
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__CONSISTENCY_31_localSearch").tell(new ReferenceDeleted<Families2Insurance.DaughterToInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil, (Families2Insurance.DaughterToInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getOldValue(), "Families2Insurance.DaughterToInsuranceClient__Marker_CONTEXT__SRC__familyRegister_FamilyRegister"), getSelf());
		});
		feature2removeEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getSonToInsuranceClient__Marker_CONTEXT__SRC__family(), notification -> {
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__CONSISTENCY_207_localSearch").tell(new ReferenceDeleted<Families2Insurance.SonToInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, (Families2Insurance.SonToInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getOldValue(), "Families2Insurance.SonToInsuranceClient__Marker_CONTEXT__SRC__family_Family"), getSelf());
		});
		feature2removeEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getFamilyRegisterToInsuranceDatabase__Marker_CREATE__CORR__famRegToInsDb(), notification -> {
			incUtil.newMessage();
			name2actor.get("FamilyRegisterToInsuranceDatabase__CONSISTENCY_40_localSearch").tell(new ReferenceDeleted<Families2Insurance.FamilyRegisterToInsuranceDatabase__Marker, Families2Insurance.FamilyRegisterToInsuranceDatabase>(incUtil, (Families2Insurance.FamilyRegisterToInsuranceDatabase__Marker) notification.getNotifier(), (Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getOldValue(), "Families2Insurance.FamilyRegisterToInsuranceDatabase__Marker_CREATE__CORR__famRegToInsDb_FamilyRegisterToInsuranceDatabase"), getSelf());
		});
		feature2removeEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getFatherToInsuranceClient__Marker_CONTEXT__TRG__insuranceDB(), notification -> {
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__CONSISTENCY_106_localSearch").tell(new ReferenceDeleted<Families2Insurance.FatherToInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil, (Families2Insurance.FatherToInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getOldValue(), "Families2Insurance.FatherToInsuranceClient__Marker_CONTEXT__TRG__insuranceDB_InsuranceDatabase"), getSelf());
		});
		feature2removeEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getMotherNewFamilyToNewInsuranceClient__Marker_CONTEXT__SRC__familyRegister(), notification -> {
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__CONSISTENCY_139_localSearch").tell(new ReferenceDeleted<Families2Insurance.MotherNewFamilyToNewInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil, (Families2Insurance.MotherNewFamilyToNewInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getOldValue(), "Families2Insurance.MotherNewFamilyToNewInsuranceClient__Marker_CONTEXT__SRC__familyRegister_FamilyRegister"), getSelf());
		});
		feature2removeEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getSonToInsuranceClient__Marker_CONTEXT__CORR__familyRegisterToInsuranceDB(), notification -> {
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__CONSISTENCY_207_localSearch").tell(new ReferenceDeleted<Families2Insurance.SonToInsuranceClient__Marker, Families2Insurance.FamilyRegisterToInsuranceDatabase>(incUtil, (Families2Insurance.SonToInsuranceClient__Marker) notification.getNotifier(), (Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getOldValue(), "Families2Insurance.SonToInsuranceClient__Marker_CONTEXT__CORR__familyRegisterToInsuranceDB_FamilyRegisterToInsuranceDatabase"), getSelf());
		});
		feature2removeEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getFamilyRegisterToInsuranceDatabase__Marker_CREATE__SRC__familyRegister(), notification -> {
			incUtil.newMessage();
			name2actor.get("FamilyRegisterToInsuranceDatabase__CONSISTENCY_40_localSearch").tell(new ReferenceDeleted<Families2Insurance.FamilyRegisterToInsuranceDatabase__Marker, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil, (Families2Insurance.FamilyRegisterToInsuranceDatabase__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getOldValue(), "Families2Insurance.FamilyRegisterToInsuranceDatabase__Marker_CREATE__SRC__familyRegister_FamilyRegister"), getSelf());
		});
		feature2removeEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getFatherToInsuranceClient__Marker_CREATE__SRC__father(), notification -> {
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__CONSISTENCY_106_localSearch").tell(new ReferenceDeleted<Families2Insurance.FatherToInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (Families2Insurance.FatherToInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getOldValue(), "Families2Insurance.FatherToInsuranceClient__Marker_CREATE__SRC__father_Member"), getSelf());
		});
		feature2removeEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getDaughterToInsuranceClient__Marker_CREATE__TRG__insuranceClient(), notification -> {
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__CONSISTENCY_31_localSearch").tell(new ReferenceDeleted<Families2Insurance.DaughterToInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil, (Families2Insurance.DaughterToInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getOldValue(), "Families2Insurance.DaughterToInsuranceClient__Marker_CREATE__TRG__insuranceClient_InsuranceClient"), getSelf());
		});
		feature2removeEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getFatherNewFamilyToNewInsuranceClient__Marker_CREATE__CORR__memberToInsuranceClient(), notification -> {
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__CONSISTENCY_72_localSearch").tell(new ReferenceDeleted<Families2Insurance.FatherNewFamilyToNewInsuranceClient__Marker, Families2Insurance.MemberToInsuranceClient>(incUtil, (Families2Insurance.FatherNewFamilyToNewInsuranceClient__Marker) notification.getNotifier(), (Families2Insurance.MemberToInsuranceClient) notification.getOldValue(), "Families2Insurance.FatherNewFamilyToNewInsuranceClient__Marker_CREATE__CORR__memberToInsuranceClient_MemberToInsuranceClient"), getSelf());
		});
		feature2removeEdgeConsumer.put(edu.kit.ipd.sdq.metamodels.families.FamiliesPackage.eINSTANCE.getFamily_Father(), notification -> {
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient_daughter_father_incoming_SRC__FILTER_NAC_SRC_11_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.Family_father_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__CC_58_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.Family_father_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__SRC_65_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.Family_father_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__CC_92_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.Family_father_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__SRC_99_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.Family_father_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient_mother_father_incoming_SRC__FILTER_NAC_SRC_122_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.Family_father_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient_mother_father_incoming_SRC__FILTER_NAC_SRC_156_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.Family_father_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient_son_father_incoming_SRC__FILTER_NAC_SRC_187_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.Family_father_Member"), getSelf());
		});
		feature2removeEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getFamilyToInsuranceClient_Source(), notification -> {
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__CONSISTENCY_31_localSearch").tell(new ReferenceDeleted<Families2Insurance.FamilyToInsuranceClient, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, (Families2Insurance.FamilyToInsuranceClient) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getOldValue(), "Families2Insurance.FamilyToInsuranceClient_source_Family"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__CONSISTENCY_72_localSearch").tell(new ReferenceDeleted<Families2Insurance.FamilyToInsuranceClient, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, (Families2Insurance.FamilyToInsuranceClient) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getOldValue(), "Families2Insurance.FamilyToInsuranceClient_source_Family"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__CONSISTENCY_106_localSearch").tell(new ReferenceDeleted<Families2Insurance.FamilyToInsuranceClient, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, (Families2Insurance.FamilyToInsuranceClient) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getOldValue(), "Families2Insurance.FamilyToInsuranceClient_source_Family"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__CONSISTENCY_139_localSearch").tell(new ReferenceDeleted<Families2Insurance.FamilyToInsuranceClient, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, (Families2Insurance.FamilyToInsuranceClient) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getOldValue(), "Families2Insurance.FamilyToInsuranceClient_source_Family"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__CONSISTENCY_173_localSearch").tell(new ReferenceDeleted<Families2Insurance.FamilyToInsuranceClient, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, (Families2Insurance.FamilyToInsuranceClient) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getOldValue(), "Families2Insurance.FamilyToInsuranceClient_source_Family"), getSelf());
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__CONSISTENCY_207_localSearch").tell(new ReferenceDeleted<Families2Insurance.FamilyToInsuranceClient, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, (Families2Insurance.FamilyToInsuranceClient) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getOldValue(), "Families2Insurance.FamilyToInsuranceClient_source_Family"), getSelf());
		});
		feature2removeEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getMotherToInsuranceClient__Marker_CREATE__TRG__insuranceClient(), notification -> {
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__CONSISTENCY_173_localSearch").tell(new ReferenceDeleted<Families2Insurance.MotherToInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil, (Families2Insurance.MotherToInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getOldValue(), "Families2Insurance.MotherToInsuranceClient__Marker_CREATE__TRG__insuranceClient_InsuranceClient"), getSelf());
		});
		feature2removeEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getMotherToInsuranceClient__Marker_CONTEXT__SRC__familyRegister(), notification -> {
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__CONSISTENCY_173_localSearch").tell(new ReferenceDeleted<Families2Insurance.MotherToInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil, (Families2Insurance.MotherToInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getOldValue(), "Families2Insurance.MotherToInsuranceClient__Marker_CONTEXT__SRC__familyRegister_FamilyRegister"), getSelf());
		});
		feature2removeEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getMotherToInsuranceClient__Marker_CONTEXT__CORR__familyRegisterToInsuranceDB(), notification -> {
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__CONSISTENCY_173_localSearch").tell(new ReferenceDeleted<Families2Insurance.MotherToInsuranceClient__Marker, Families2Insurance.FamilyRegisterToInsuranceDatabase>(incUtil, (Families2Insurance.MotherToInsuranceClient__Marker) notification.getNotifier(), (Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getOldValue(), "Families2Insurance.MotherToInsuranceClient__Marker_CONTEXT__CORR__familyRegisterToInsuranceDB_FamilyRegisterToInsuranceDatabase"), getSelf());
		});
		feature2removeEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getDaughterToInsuranceClient__Marker_CONTEXT__TRG__insuranceDB(), notification -> {
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__CONSISTENCY_31_localSearch").tell(new ReferenceDeleted<Families2Insurance.DaughterToInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil, (Families2Insurance.DaughterToInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getOldValue(), "Families2Insurance.DaughterToInsuranceClient__Marker_CONTEXT__TRG__insuranceDB_InsuranceDatabase"), getSelf());
		});
		feature2removeEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getDaughterToInsuranceClient__Marker_CONTEXT__CORR__familyRegisterToInsuranceDB(), notification -> {
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__CONSISTENCY_31_localSearch").tell(new ReferenceDeleted<Families2Insurance.DaughterToInsuranceClient__Marker, Families2Insurance.FamilyRegisterToInsuranceDatabase>(incUtil, (Families2Insurance.DaughterToInsuranceClient__Marker) notification.getNotifier(), (Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getOldValue(), "Families2Insurance.DaughterToInsuranceClient__Marker_CONTEXT__CORR__familyRegisterToInsuranceDB_FamilyRegisterToInsuranceDatabase"), getSelf());
		});
		feature2removeEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getMotherNewFamilyToNewInsuranceClient__Marker_CONTEXT__CORR__familyRegisterToInsuranceDB(), notification -> {
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__CONSISTENCY_139_localSearch").tell(new ReferenceDeleted<Families2Insurance.MotherNewFamilyToNewInsuranceClient__Marker, Families2Insurance.FamilyRegisterToInsuranceDatabase>(incUtil, (Families2Insurance.MotherNewFamilyToNewInsuranceClient__Marker) notification.getNotifier(), (Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getOldValue(), "Families2Insurance.MotherNewFamilyToNewInsuranceClient__Marker_CONTEXT__CORR__familyRegisterToInsuranceDB_FamilyRegisterToInsuranceDatabase"), getSelf());
		});
		feature2removeEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getFatherToInsuranceClient__Marker_CONTEXT__SRC__familyRegister(), notification -> {
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__CONSISTENCY_106_localSearch").tell(new ReferenceDeleted<Families2Insurance.FatherToInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil, (Families2Insurance.FatherToInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getOldValue(), "Families2Insurance.FatherToInsuranceClient__Marker_CONTEXT__SRC__familyRegister_FamilyRegister"), getSelf());
		});
		feature2removeEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getFatherNewFamilyToNewInsuranceClient__Marker_CREATE__SRC__family(), notification -> {
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__CONSISTENCY_72_localSearch").tell(new ReferenceDeleted<Families2Insurance.FatherNewFamilyToNewInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, (Families2Insurance.FatherNewFamilyToNewInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getOldValue(), "Families2Insurance.FatherNewFamilyToNewInsuranceClient__Marker_CREATE__SRC__family_Family"), getSelf());
		});
		feature2removeEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getFamilyRegisterToInsuranceDatabase__Marker_CREATE__TRG__insuranceDb(), notification -> {
			incUtil.newMessage();
			name2actor.get("FamilyRegisterToInsuranceDatabase__CONSISTENCY_40_localSearch").tell(new ReferenceDeleted<Families2Insurance.FamilyRegisterToInsuranceDatabase__Marker, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil, (Families2Insurance.FamilyRegisterToInsuranceDatabase__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getOldValue(), "Families2Insurance.FamilyRegisterToInsuranceDatabase__Marker_CREATE__TRG__insuranceDb_InsuranceDatabase"), getSelf());
		});
		feature2removeEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getMotherNewFamilyToNewInsuranceClient__Marker_CREATE__TRG__insuranceClient(), notification -> {
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__CONSISTENCY_139_localSearch").tell(new ReferenceDeleted<Families2Insurance.MotherNewFamilyToNewInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil, (Families2Insurance.MotherNewFamilyToNewInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getOldValue(), "Families2Insurance.MotherNewFamilyToNewInsuranceClient__Marker_CREATE__TRG__insuranceClient_InsuranceClient"), getSelf());
		});
		feature2removeEdgeConsumer.put(edu.kit.ipd.sdq.metamodels.families.FamiliesPackage.eINSTANCE.getFamily_Sons(), notification -> {
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient_daughter_sons_incoming_SRC__FILTER_NAC_SRC_8_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.Family_sons_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient_father_sons_incoming_SRC__FILTER_NAC_SRC_49_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.Family_sons_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient_father_sons_incoming_SRC__FILTER_NAC_SRC_83_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.Family_sons_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient_mother_sons_incoming_SRC__FILTER_NAC_SRC_116_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.Family_sons_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient_mother_sons_incoming_SRC__FILTER_NAC_SRC_150_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.Family_sons_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__CC_193_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.Family_sons_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__SRC_200_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.Family_sons_Member"), getSelf());
		});
		feature2removeEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getMotherNewFamilyToNewInsuranceClient__Marker_CREATE__CORR__familyToInsuranceClient(), notification -> {
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__CONSISTENCY_139_localSearch").tell(new ReferenceDeleted<Families2Insurance.MotherNewFamilyToNewInsuranceClient__Marker, Families2Insurance.FamilyToInsuranceClient>(incUtil, (Families2Insurance.MotherNewFamilyToNewInsuranceClient__Marker) notification.getNotifier(), (Families2Insurance.FamilyToInsuranceClient) notification.getOldValue(), "Families2Insurance.MotherNewFamilyToNewInsuranceClient__Marker_CREATE__CORR__familyToInsuranceClient_FamilyToInsuranceClient"), getSelf());
		});
		feature2removeEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getSonToInsuranceClient__Marker_CREATE__SRC__son(), notification -> {
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__CONSISTENCY_207_localSearch").tell(new ReferenceDeleted<Families2Insurance.SonToInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (Families2Insurance.SonToInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getOldValue(), "Families2Insurance.SonToInsuranceClient__Marker_CREATE__SRC__son_Member"), getSelf());
		});
		feature2removeEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getDaughterToInsuranceClient__Marker_CONTEXT__SRC__family(), notification -> {
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__CONSISTENCY_31_localSearch").tell(new ReferenceDeleted<Families2Insurance.DaughterToInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, (Families2Insurance.DaughterToInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getOldValue(), "Families2Insurance.DaughterToInsuranceClient__Marker_CONTEXT__SRC__family_Family"), getSelf());
		});
		feature2removeEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getFatherNewFamilyToNewInsuranceClient__Marker_CONTEXT__TRG__insuranceDB(), notification -> {
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__CONSISTENCY_72_localSearch").tell(new ReferenceDeleted<Families2Insurance.FatherNewFamilyToNewInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil, (Families2Insurance.FatherNewFamilyToNewInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getOldValue(), "Families2Insurance.FatherNewFamilyToNewInsuranceClient__Marker_CONTEXT__TRG__insuranceDB_InsuranceDatabase"), getSelf());
		});
		feature2removeEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getMotherToInsuranceClient__Marker_CONTEXT__TRG__insuranceDB(), notification -> {
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__CONSISTENCY_173_localSearch").tell(new ReferenceDeleted<Families2Insurance.MotherToInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil, (Families2Insurance.MotherToInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getOldValue(), "Families2Insurance.MotherToInsuranceClient__Marker_CONTEXT__TRG__insuranceDB_InsuranceDatabase"), getSelf());
		});
		feature2removeEdgeConsumer.put(edu.kit.ipd.sdq.metamodels.insurance.InsurancePackage.eINSTANCE.getInsuranceDatabase_Insuranceclient(), notification -> {
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__TRG_1_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil, (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase_insuranceclient_InsuranceClient"), getSelf());
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__CC_17_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil, (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase_insuranceclient_InsuranceClient"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__TRG_43_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil, (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase_insuranceclient_InsuranceClient"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__CC_58_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil, (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase_insuranceclient_InsuranceClient"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__TRG_76_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil, (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase_insuranceclient_InsuranceClient"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__CC_92_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil, (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase_insuranceclient_InsuranceClient"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__TRG_110_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil, (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase_insuranceclient_InsuranceClient"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__CC_125_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil, (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase_insuranceclient_InsuranceClient"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__TRG_143_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil, (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase_insuranceclient_InsuranceClient"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__CC_159_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil, (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase_insuranceclient_InsuranceClient"), getSelf());
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__TRG_177_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil, (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase_insuranceclient_InsuranceClient"), getSelf());
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__CC_193_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil, (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase_insuranceclient_InsuranceClient"), getSelf());
		});
		feature2removeEdgeConsumer.put(edu.kit.ipd.sdq.metamodels.families.FamiliesPackage.eINSTANCE.getFamily_Daughters(), notification -> {
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient_father_daughters_incoming_SRC__FILTER_NAC_SRC_52_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.Family_daughters_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient_father_daughters_incoming_SRC__FILTER_NAC_SRC_86_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.Family_daughters_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient_mother_daughters_incoming_SRC__FILTER_NAC_SRC_119_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.Family_daughters_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient_mother_daughters_incoming_SRC__FILTER_NAC_SRC_153_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.Family_daughters_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient_son_daughters_incoming_SRC__FILTER_NAC_SRC_184_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.Family_daughters_Member"), getSelf());
		});
		feature2removeEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getFatherNewFamilyToNewInsuranceClient__Marker_CREATE__SRC__father(), notification -> {
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__CONSISTENCY_72_localSearch").tell(new ReferenceDeleted<Families2Insurance.FatherNewFamilyToNewInsuranceClient__Marker, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (Families2Insurance.FatherNewFamilyToNewInsuranceClient__Marker) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getOldValue(), "Families2Insurance.FatherNewFamilyToNewInsuranceClient__Marker_CREATE__SRC__father_Member"), getSelf());
		});
		feature2removeEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getSonToInsuranceClient__Marker_CREATE__CORR__familyToInsuranceClient(), notification -> {
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__CONSISTENCY_207_localSearch").tell(new ReferenceDeleted<Families2Insurance.SonToInsuranceClient__Marker, Families2Insurance.FamilyToInsuranceClient>(incUtil, (Families2Insurance.SonToInsuranceClient__Marker) notification.getNotifier(), (Families2Insurance.FamilyToInsuranceClient) notification.getOldValue(), "Families2Insurance.SonToInsuranceClient__Marker_CREATE__CORR__familyToInsuranceClient_FamilyToInsuranceClient"), getSelf());
		});
		feature2removeEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getMotherToInsuranceClient__Marker_CREATE__CORR__familyToInsuranceClient(), notification -> {
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__CONSISTENCY_173_localSearch").tell(new ReferenceDeleted<Families2Insurance.MotherToInsuranceClient__Marker, Families2Insurance.FamilyToInsuranceClient>(incUtil, (Families2Insurance.MotherToInsuranceClient__Marker) notification.getNotifier(), (Families2Insurance.FamilyToInsuranceClient) notification.getOldValue(), "Families2Insurance.MotherToInsuranceClient__Marker_CREATE__CORR__familyToInsuranceClient_FamilyToInsuranceClient"), getSelf());
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
		if (node instanceof edu.kit.ipd.sdq.metamodels.families.FamilyRegister) {
			incUtil.newMessage();
			name2actor.get("FamilyRegister_object_SP5").tell(new ObjectDeleted<edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil, (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) node), getSelf());
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
		if (node instanceof edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) {
			incUtil.newMessage();
			name2actor.get("InsuranceDatabase_object_SP5").tell(new ObjectDeleted<edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil, (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) node), getSelf());
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
		if (node instanceof Families2Insurance.DaughterToInsuranceClient__Marker) {
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__Marker_object").tell(new ObjectDeleted<Families2Insurance.DaughterToInsuranceClient__Marker>(incUtil, (Families2Insurance.DaughterToInsuranceClient__Marker) node), getSelf());
		}
		if (node instanceof Families2Insurance.FamilyRegisterToInsuranceDatabase__Marker) {
			incUtil.newMessage();
			name2actor.get("FamilyRegisterToInsuranceDatabase__Marker_object").tell(new ObjectDeleted<Families2Insurance.FamilyRegisterToInsuranceDatabase__Marker>(incUtil, (Families2Insurance.FamilyRegisterToInsuranceDatabase__Marker) node), getSelf());
		}
		if (node instanceof Families2Insurance.FatherNewFamilyToNewInsuranceClient__Marker) {
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__Marker_object").tell(new ObjectDeleted<Families2Insurance.FatherNewFamilyToNewInsuranceClient__Marker>(incUtil, (Families2Insurance.FatherNewFamilyToNewInsuranceClient__Marker) node), getSelf());
		}
		if (node instanceof Families2Insurance.FatherToInsuranceClient__Marker) {
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__Marker_object").tell(new ObjectDeleted<Families2Insurance.FatherToInsuranceClient__Marker>(incUtil, (Families2Insurance.FatherToInsuranceClient__Marker) node), getSelf());
		}
		if (node instanceof Families2Insurance.MotherNewFamilyToNewInsuranceClient__Marker) {
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__Marker_object").tell(new ObjectDeleted<Families2Insurance.MotherNewFamilyToNewInsuranceClient__Marker>(incUtil, (Families2Insurance.MotherNewFamilyToNewInsuranceClient__Marker) node), getSelf());
		}
		if (node instanceof Families2Insurance.MotherToInsuranceClient__Marker) {
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__Marker_object").tell(new ObjectDeleted<Families2Insurance.MotherToInsuranceClient__Marker>(incUtil, (Families2Insurance.MotherToInsuranceClient__Marker) node), getSelf());
		}
		if (node instanceof Families2Insurance.SonToInsuranceClient__Marker) {
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__Marker_object").tell(new ObjectDeleted<Families2Insurance.SonToInsuranceClient__Marker>(incUtil, (Families2Insurance.SonToInsuranceClient__Marker) node), getSelf());
		}
		if (node instanceof Families2Insurance.FamilyRegisterToInsuranceDatabase) {
			incUtil.newMessage();
			name2actor.get("FamilyRegisterToInsuranceDatabase_object_SP0").tell(new ObjectDeleted<Families2Insurance.FamilyRegisterToInsuranceDatabase>(incUtil, (Families2Insurance.FamilyRegisterToInsuranceDatabase) node), getSelf());
		}
		if (node instanceof Families2Insurance.FamilyRegisterToInsuranceDatabase) {
			incUtil.newMessage();
			name2actor.get("FamilyRegisterToInsuranceDatabase_object_SP1").tell(new ObjectDeleted<Families2Insurance.FamilyRegisterToInsuranceDatabase>(incUtil, (Families2Insurance.FamilyRegisterToInsuranceDatabase) node), getSelf());
		}
		if (node instanceof Families2Insurance.FamilyRegisterToInsuranceDatabase) {
			incUtil.newMessage();
			name2actor.get("FamilyRegisterToInsuranceDatabase_object_SP2").tell(new ObjectDeleted<Families2Insurance.FamilyRegisterToInsuranceDatabase>(incUtil, (Families2Insurance.FamilyRegisterToInsuranceDatabase) node), getSelf());
		}
		if (node instanceof Families2Insurance.FamilyRegisterToInsuranceDatabase) {
			incUtil.newMessage();
			name2actor.get("FamilyRegisterToInsuranceDatabase_object_SP3").tell(new ObjectDeleted<Families2Insurance.FamilyRegisterToInsuranceDatabase>(incUtil, (Families2Insurance.FamilyRegisterToInsuranceDatabase) node), getSelf());
		}
		if (node instanceof Families2Insurance.FamilyRegisterToInsuranceDatabase) {
			incUtil.newMessage();
			name2actor.get("FamilyRegisterToInsuranceDatabase_object_SP4").tell(new ObjectDeleted<Families2Insurance.FamilyRegisterToInsuranceDatabase>(incUtil, (Families2Insurance.FamilyRegisterToInsuranceDatabase) node), getSelf());
		}
		if (node instanceof Families2Insurance.FamilyToInsuranceClient) {
			incUtil.newMessage();
			name2actor.get("FamilyToInsuranceClient_object_SP0").tell(new ObjectDeleted<Families2Insurance.FamilyToInsuranceClient>(incUtil, (Families2Insurance.FamilyToInsuranceClient) node), getSelf());
		}
		if (node instanceof Families2Insurance.FamilyToInsuranceClient) {
			incUtil.newMessage();
			name2actor.get("FamilyToInsuranceClient_object_SP1").tell(new ObjectDeleted<Families2Insurance.FamilyToInsuranceClient>(incUtil, (Families2Insurance.FamilyToInsuranceClient) node), getSelf());
		}
		if (node instanceof Families2Insurance.MemberToInsuranceClient) {
			incUtil.newMessage();
			name2actor.get("MemberToInsuranceClient_object_SP0").tell(new ObjectDeleted<Families2Insurance.MemberToInsuranceClient>(incUtil, (Families2Insurance.MemberToInsuranceClient) node), getSelf());
		}
		if (node instanceof Families2Insurance.MemberToInsuranceClient) {
			incUtil.newMessage();
			name2actor.get("MemberToInsuranceClient_object_SP1").tell(new ObjectDeleted<Families2Insurance.MemberToInsuranceClient>(incUtil, (Families2Insurance.MemberToInsuranceClient) node), getSelf());
		}
	}
}

