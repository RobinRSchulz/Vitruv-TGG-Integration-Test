package Families2Insurance.co.hipe.engine.actor;

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
		});
		type2addConsumer.put(edu.kit.ipd.sdq.metamodels.insurance.InsurancePackage.eINSTANCE.getInsuranceDatabase(), obj -> {
			edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase _insurancedatabase = (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) obj;
			incUtil.newMessage();
			name2actor.get("InsuranceDatabase_object_SP0").tell(new ObjectAdded<edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil, _insurancedatabase), getSelf());
			incUtil.newMessage();
			name2actor.get("InsuranceDatabase_object_SP1").tell(new ObjectAdded<edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil, _insurancedatabase), getSelf());
		});
		type2addConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getFamilyRegisterToInsuranceDatabase(), obj -> {
			Families2Insurance.FamilyRegisterToInsuranceDatabase _familyregistertoinsurancedatabase = (Families2Insurance.FamilyRegisterToInsuranceDatabase) obj;
			incUtil.newMessage();
			name2actor.get("FamilyRegisterToInsuranceDatabase_object_SP0").tell(new ObjectAdded<Families2Insurance.FamilyRegisterToInsuranceDatabase>(incUtil, _familyregistertoinsurancedatabase), getSelf());
			incUtil.newMessage();
			name2actor.get("FamilyRegisterToInsuranceDatabase_object_SP1").tell(new ObjectAdded<Families2Insurance.FamilyRegisterToInsuranceDatabase>(incUtil, _familyregistertoinsurancedatabase), getSelf());
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
		});
		type2addConsumer.put(edu.kit.ipd.sdq.metamodels.families.FamiliesPackage.eINSTANCE.getFamilyRegister(), obj -> {
			edu.kit.ipd.sdq.metamodels.families.FamilyRegister _familyregister = (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) obj;
			incUtil.newMessage();
			name2actor.get("FamilyRegister_object_SP0").tell(new ObjectAdded<edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil, _familyregister), getSelf());
			incUtil.newMessage();
			name2actor.get("FamilyRegister_object_SP1").tell(new ObjectAdded<edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil, _familyregister), getSelf());
		});
		type2addConsumer.put(edu.kit.ipd.sdq.metamodels.insurance.InsurancePackage.eINSTANCE.getInsuranceClient(), obj -> {
			edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient _insuranceclient = (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) obj;
			incUtil.newMessage();
			name2actor.get("InsuranceClient_object_SP0").tell(new ObjectAdded<edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil, _insuranceclient), getSelf());
			incUtil.newMessage();
			name2actor.get("InsuranceClient_object_SP1").tell(new ObjectAdded<edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil, _insuranceclient), getSelf());
		});
	}
	
	private void initializeSet() {
		feature2setConsumer.put(edu.kit.ipd.sdq.metamodels.families.FamiliesPackage.eINSTANCE.getMember_FirstName(), notification -> {
			if(notification.getNotifier() instanceof edu.kit.ipd.sdq.metamodels.families.Member) {
				incUtil.newMessage();
				name2actor.get("Member_object_SP4").tell(new AttributeChanged<edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof edu.kit.ipd.sdq.metamodels.families.Member) {
				incUtil.newMessage();
				name2actor.get("Member_object_SP1").tell(new AttributeChanged<edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof edu.kit.ipd.sdq.metamodels.families.Member) {
				incUtil.newMessage();
				name2actor.get("Member_object_SP5").tell(new AttributeChanged<edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof edu.kit.ipd.sdq.metamodels.families.Member) {
				incUtil.newMessage();
				name2actor.get("Member_object_SP3").tell(new AttributeChanged<edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof edu.kit.ipd.sdq.metamodels.families.Member) {
				incUtil.newMessage();
				name2actor.get("Member_object_SP0").tell(new AttributeChanged<edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof edu.kit.ipd.sdq.metamodels.families.Member) {
				incUtil.newMessage();
				name2actor.get("Member_object_SP2").tell(new AttributeChanged<edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
		});
		
		feature2setConsumer.put(edu.kit.ipd.sdq.metamodels.families.FamiliesPackage.eINSTANCE.getFamily_LastName(), notification -> {
			if(notification.getNotifier() instanceof edu.kit.ipd.sdq.metamodels.families.Family) {
				incUtil.newMessage();
				name2actor.get("Family_object_SP4").tell(new AttributeChanged<edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof edu.kit.ipd.sdq.metamodels.families.Family) {
				incUtil.newMessage();
				name2actor.get("Family_object_SP0").tell(new AttributeChanged<edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof edu.kit.ipd.sdq.metamodels.families.Family) {
				incUtil.newMessage();
				name2actor.get("Family_object_SP5").tell(new AttributeChanged<edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof edu.kit.ipd.sdq.metamodels.families.Family) {
				incUtil.newMessage();
				name2actor.get("Family_object_SP3").tell(new AttributeChanged<edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof edu.kit.ipd.sdq.metamodels.families.Family) {
				incUtil.newMessage();
				name2actor.get("Family_object_SP1").tell(new AttributeChanged<edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof edu.kit.ipd.sdq.metamodels.families.Family) {
				incUtil.newMessage();
				name2actor.get("Family_object_SP2").tell(new AttributeChanged<edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
		});
		
		feature2setConsumer.put(edu.kit.ipd.sdq.metamodels.insurance.InsurancePackage.eINSTANCE.getInsuranceClient_Name(), notification -> {
			if(notification.getNotifier() instanceof edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) {
				incUtil.newMessage();
				name2actor.get("InsuranceClient_object_SP1").tell(new AttributeChanged<edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil, (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) {
				incUtil.newMessage();
				name2actor.get("InsuranceClient_object_SP0").tell(new AttributeChanged<edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil, (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
		});
		
		feature2setConsumer.put(edu.kit.ipd.sdq.metamodels.insurance.InsurancePackage.eINSTANCE.getInsuranceClient_Gender(), notification -> {
			if(notification.getNotifier() instanceof edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) {
				incUtil.newMessage();
				name2actor.get("InsuranceClient_object_SP1").tell(new AttributeChanged<edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil, (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) {
				incUtil.newMessage();
				name2actor.get("InsuranceClient_object_SP0").tell(new AttributeChanged<edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil, (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
		});
		
	}
	
	private void initializeAddEdge() {
		feature2addEdgeConsumer.put(edu.kit.ipd.sdq.metamodels.families.FamiliesPackage.eINSTANCE.getFamilyRegister_Families(), notification -> {
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__CC_10_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.FamilyRegister, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil,(edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.FamilyRegister_families_Family"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__CC_29_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.FamilyRegister, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil,(edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.FamilyRegister_families_Family"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__CC_45_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.FamilyRegister, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil,(edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.FamilyRegister_families_Family"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__CC_61_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.FamilyRegister, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil,(edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.FamilyRegister_families_Family"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__CC_77_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.FamilyRegister, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil,(edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.FamilyRegister_families_Family"), getSelf());
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__CC_93_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.FamilyRegister, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil,(edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.FamilyRegister_families_Family"), getSelf());
		});
		feature2addEdgeConsumer.put(edu.kit.ipd.sdq.metamodels.families.FamiliesPackage.eINSTANCE.getFamily_Daughters(), notification -> {
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient_father_daughters_incoming_SRC__FILTER_NAC_SRC_23_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil,(edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.Family_daughters_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient_father_daughters_incoming_SRC__FILTER_NAC_SRC_39_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil,(edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.Family_daughters_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient_mother_daughters_incoming_SRC__FILTER_NAC_SRC_55_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil,(edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.Family_daughters_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient_mother_daughters_incoming_SRC__FILTER_NAC_SRC_71_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil,(edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.Family_daughters_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient_son_daughters_incoming_SRC__FILTER_NAC_SRC_84_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil,(edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.Family_daughters_Member"), getSelf());
		});
		feature2addEdgeConsumer.put(edu.kit.ipd.sdq.metamodels.families.FamiliesPackage.eINSTANCE.getFamily_Sons(), notification -> {
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient_daughter_sons_incoming_SRC__FILTER_NAC_SRC_1_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil,(edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.Family_sons_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient_father_sons_incoming_SRC__FILTER_NAC_SRC_20_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil,(edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.Family_sons_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient_father_sons_incoming_SRC__FILTER_NAC_SRC_36_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil,(edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.Family_sons_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient_mother_sons_incoming_SRC__FILTER_NAC_SRC_52_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil,(edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.Family_sons_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient_mother_sons_incoming_SRC__FILTER_NAC_SRC_68_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil,(edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.Family_sons_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__CC_93_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil,(edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.Family_sons_Member"), getSelf());
		});
		feature2addEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getFamilyRegisterToInsuranceDatabase_Target(), notification -> {
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__CC_10_localSearch").tell(new ReferenceAdded<Families2Insurance.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil,(Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNewValue(), "Families2Insurance.FamilyRegisterToInsuranceDatabase_target_InsuranceDatabase"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__CC_29_localSearch").tell(new ReferenceAdded<Families2Insurance.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil,(Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNewValue(), "Families2Insurance.FamilyRegisterToInsuranceDatabase_target_InsuranceDatabase"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__CC_45_localSearch").tell(new ReferenceAdded<Families2Insurance.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil,(Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNewValue(), "Families2Insurance.FamilyRegisterToInsuranceDatabase_target_InsuranceDatabase"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__CC_61_localSearch").tell(new ReferenceAdded<Families2Insurance.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil,(Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNewValue(), "Families2Insurance.FamilyRegisterToInsuranceDatabase_target_InsuranceDatabase"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__CC_77_localSearch").tell(new ReferenceAdded<Families2Insurance.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil,(Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNewValue(), "Families2Insurance.FamilyRegisterToInsuranceDatabase_target_InsuranceDatabase"), getSelf());
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__CC_93_localSearch").tell(new ReferenceAdded<Families2Insurance.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil,(Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNewValue(), "Families2Insurance.FamilyRegisterToInsuranceDatabase_target_InsuranceDatabase"), getSelf());
		});
		feature2addEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getFamilyRegisterToInsuranceDatabase_Source(), notification -> {
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__CC_10_localSearch").tell(new ReferenceAdded<Families2Insurance.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil,(Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNewValue(), "Families2Insurance.FamilyRegisterToInsuranceDatabase_source_FamilyRegister"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__CC_29_localSearch").tell(new ReferenceAdded<Families2Insurance.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil,(Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNewValue(), "Families2Insurance.FamilyRegisterToInsuranceDatabase_source_FamilyRegister"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__CC_45_localSearch").tell(new ReferenceAdded<Families2Insurance.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil,(Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNewValue(), "Families2Insurance.FamilyRegisterToInsuranceDatabase_source_FamilyRegister"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__CC_61_localSearch").tell(new ReferenceAdded<Families2Insurance.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil,(Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNewValue(), "Families2Insurance.FamilyRegisterToInsuranceDatabase_source_FamilyRegister"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__CC_77_localSearch").tell(new ReferenceAdded<Families2Insurance.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil,(Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNewValue(), "Families2Insurance.FamilyRegisterToInsuranceDatabase_source_FamilyRegister"), getSelf());
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__CC_93_localSearch").tell(new ReferenceAdded<Families2Insurance.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil,(Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNewValue(), "Families2Insurance.FamilyRegisterToInsuranceDatabase_source_FamilyRegister"), getSelf());
		});
		feature2addEdgeConsumer.put(edu.kit.ipd.sdq.metamodels.families.FamiliesPackage.eINSTANCE.getFamily_Mother(), notification -> {
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient_daughter_mother_incoming_SRC__FILTER_NAC_SRC_7_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil,(edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.Family_mother_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient_father_mother_incoming_SRC__FILTER_NAC_SRC_26_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil,(edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.Family_mother_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient_father_mother_incoming_SRC__FILTER_NAC_SRC_42_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil,(edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.Family_mother_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__CC_61_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil,(edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.Family_mother_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__CC_77_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil,(edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.Family_mother_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient_son_mother_incoming_SRC__FILTER_NAC_SRC_90_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil,(edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.Family_mother_Member"), getSelf());
		});
		feature2addEdgeConsumer.put(edu.kit.ipd.sdq.metamodels.families.FamiliesPackage.eINSTANCE.getMember_FamilyDaughter(), notification -> {
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__CC_10_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.Member, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil,(edu.kit.ipd.sdq.metamodels.families.Member) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.Member_familyDaughter_Family"), getSelf());
		});
		feature2addEdgeConsumer.put(edu.kit.ipd.sdq.metamodels.families.FamiliesPackage.eINSTANCE.getFamily_Father(), notification -> {
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient_daughter_father_incoming_SRC__FILTER_NAC_SRC_4_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil,(edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.Family_father_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__CC_29_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil,(edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.Family_father_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__CC_45_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil,(edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.Family_father_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient_mother_father_incoming_SRC__FILTER_NAC_SRC_58_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil,(edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.Family_father_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient_mother_father_incoming_SRC__FILTER_NAC_SRC_74_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil,(edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.Family_father_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient_son_father_incoming_SRC__FILTER_NAC_SRC_87_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil,(edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.families.Family_father_Member"), getSelf());
		});
		feature2addEdgeConsumer.put(edu.kit.ipd.sdq.metamodels.insurance.InsurancePackage.eINSTANCE.getInsuranceDatabase_Insuranceclient(), notification -> {
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__CC_10_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil,(edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase_insuranceclient_InsuranceClient"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__CC_29_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil,(edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase_insuranceclient_InsuranceClient"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__CC_45_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil,(edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase_insuranceclient_InsuranceClient"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__CC_61_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil,(edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase_insuranceclient_InsuranceClient"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__CC_77_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil,(edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase_insuranceclient_InsuranceClient"), getSelf());
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__CC_93_localSearch").tell(new ReferenceAdded<edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil,(edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getNewValue(), "edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase_insuranceclient_InsuranceClient"), getSelf());
		});
	}
	
	private void initializeRemoveEdge() {
		feature2removeEdgeConsumer.put(edu.kit.ipd.sdq.metamodels.families.FamiliesPackage.eINSTANCE.getFamilyRegister_Families(), notification -> {
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__CC_10_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.FamilyRegister, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.FamilyRegister_families_Family"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__CC_29_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.FamilyRegister, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.FamilyRegister_families_Family"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__CC_45_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.FamilyRegister, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.FamilyRegister_families_Family"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__CC_61_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.FamilyRegister, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.FamilyRegister_families_Family"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__CC_77_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.FamilyRegister, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.FamilyRegister_families_Family"), getSelf());
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__CC_93_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.FamilyRegister, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.FamilyRegister_families_Family"), getSelf());
		});
		feature2removeEdgeConsumer.put(edu.kit.ipd.sdq.metamodels.families.FamiliesPackage.eINSTANCE.getFamily_Daughters(), notification -> {
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient_father_daughters_incoming_SRC__FILTER_NAC_SRC_23_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.Family_daughters_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient_father_daughters_incoming_SRC__FILTER_NAC_SRC_39_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.Family_daughters_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient_mother_daughters_incoming_SRC__FILTER_NAC_SRC_55_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.Family_daughters_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient_mother_daughters_incoming_SRC__FILTER_NAC_SRC_71_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.Family_daughters_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient_son_daughters_incoming_SRC__FILTER_NAC_SRC_84_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.Family_daughters_Member"), getSelf());
		});
		feature2removeEdgeConsumer.put(edu.kit.ipd.sdq.metamodels.families.FamiliesPackage.eINSTANCE.getFamily_Sons(), notification -> {
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient_daughter_sons_incoming_SRC__FILTER_NAC_SRC_1_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.Family_sons_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient_father_sons_incoming_SRC__FILTER_NAC_SRC_20_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.Family_sons_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient_father_sons_incoming_SRC__FILTER_NAC_SRC_36_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.Family_sons_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient_mother_sons_incoming_SRC__FILTER_NAC_SRC_52_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.Family_sons_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient_mother_sons_incoming_SRC__FILTER_NAC_SRC_68_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.Family_sons_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__CC_93_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.Family_sons_Member"), getSelf());
		});
		feature2removeEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getFamilyRegisterToInsuranceDatabase_Target(), notification -> {
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__CC_10_localSearch").tell(new ReferenceDeleted<Families2Insurance.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil, (Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getOldValue(), "Families2Insurance.FamilyRegisterToInsuranceDatabase_target_InsuranceDatabase"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__CC_29_localSearch").tell(new ReferenceDeleted<Families2Insurance.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil, (Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getOldValue(), "Families2Insurance.FamilyRegisterToInsuranceDatabase_target_InsuranceDatabase"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__CC_45_localSearch").tell(new ReferenceDeleted<Families2Insurance.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil, (Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getOldValue(), "Families2Insurance.FamilyRegisterToInsuranceDatabase_target_InsuranceDatabase"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__CC_61_localSearch").tell(new ReferenceDeleted<Families2Insurance.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil, (Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getOldValue(), "Families2Insurance.FamilyRegisterToInsuranceDatabase_target_InsuranceDatabase"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__CC_77_localSearch").tell(new ReferenceDeleted<Families2Insurance.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil, (Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getOldValue(), "Families2Insurance.FamilyRegisterToInsuranceDatabase_target_InsuranceDatabase"), getSelf());
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__CC_93_localSearch").tell(new ReferenceDeleted<Families2Insurance.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil, (Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getOldValue(), "Families2Insurance.FamilyRegisterToInsuranceDatabase_target_InsuranceDatabase"), getSelf());
		});
		feature2removeEdgeConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getFamilyRegisterToInsuranceDatabase_Source(), notification -> {
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__CC_10_localSearch").tell(new ReferenceDeleted<Families2Insurance.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil, (Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getOldValue(), "Families2Insurance.FamilyRegisterToInsuranceDatabase_source_FamilyRegister"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__CC_29_localSearch").tell(new ReferenceDeleted<Families2Insurance.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil, (Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getOldValue(), "Families2Insurance.FamilyRegisterToInsuranceDatabase_source_FamilyRegister"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__CC_45_localSearch").tell(new ReferenceDeleted<Families2Insurance.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil, (Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getOldValue(), "Families2Insurance.FamilyRegisterToInsuranceDatabase_source_FamilyRegister"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__CC_61_localSearch").tell(new ReferenceDeleted<Families2Insurance.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil, (Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getOldValue(), "Families2Insurance.FamilyRegisterToInsuranceDatabase_source_FamilyRegister"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__CC_77_localSearch").tell(new ReferenceDeleted<Families2Insurance.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil, (Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getOldValue(), "Families2Insurance.FamilyRegisterToInsuranceDatabase_source_FamilyRegister"), getSelf());
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__CC_93_localSearch").tell(new ReferenceDeleted<Families2Insurance.FamilyRegisterToInsuranceDatabase, edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil, (Families2Insurance.FamilyRegisterToInsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) notification.getOldValue(), "Families2Insurance.FamilyRegisterToInsuranceDatabase_source_FamilyRegister"), getSelf());
		});
		feature2removeEdgeConsumer.put(edu.kit.ipd.sdq.metamodels.families.FamiliesPackage.eINSTANCE.getFamily_Mother(), notification -> {
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient_daughter_mother_incoming_SRC__FILTER_NAC_SRC_7_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.Family_mother_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient_father_mother_incoming_SRC__FILTER_NAC_SRC_26_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.Family_mother_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient_father_mother_incoming_SRC__FILTER_NAC_SRC_42_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.Family_mother_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__CC_61_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.Family_mother_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__CC_77_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.Family_mother_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient_son_mother_incoming_SRC__FILTER_NAC_SRC_90_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.Family_mother_Member"), getSelf());
		});
		feature2removeEdgeConsumer.put(edu.kit.ipd.sdq.metamodels.families.FamiliesPackage.eINSTANCE.getMember_FamilyDaughter(), notification -> {
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__CC_10_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.Member, edu.kit.ipd.sdq.metamodels.families.Family>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Member) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Family) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.Member_familyDaughter_Family"), getSelf());
		});
		feature2removeEdgeConsumer.put(edu.kit.ipd.sdq.metamodels.families.FamiliesPackage.eINSTANCE.getFamily_Father(), notification -> {
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient_daughter_father_incoming_SRC__FILTER_NAC_SRC_4_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.Family_father_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__CC_29_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.Family_father_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__CC_45_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.Family_father_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient_mother_father_incoming_SRC__FILTER_NAC_SRC_58_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.Family_father_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient_mother_father_incoming_SRC__FILTER_NAC_SRC_74_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.Family_father_Member"), getSelf());
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient_son_father_incoming_SRC__FILTER_NAC_SRC_87_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.families.Family, edu.kit.ipd.sdq.metamodels.families.Member>(incUtil, (edu.kit.ipd.sdq.metamodels.families.Family) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.families.Member) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.families.Family_father_Member"), getSelf());
		});
		feature2removeEdgeConsumer.put(edu.kit.ipd.sdq.metamodels.insurance.InsurancePackage.eINSTANCE.getInsuranceDatabase_Insuranceclient(), notification -> {
			incUtil.newMessage();
			name2actor.get("DaughterToInsuranceClient__CC_10_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil, (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase_insuranceclient_InsuranceClient"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherNewFamilyToNewInsuranceClient__CC_29_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil, (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase_insuranceclient_InsuranceClient"), getSelf());
			incUtil.newMessage();
			name2actor.get("FatherToInsuranceClient__CC_45_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil, (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase_insuranceclient_InsuranceClient"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherNewFamilyToNewInsuranceClient__CC_61_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil, (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase_insuranceclient_InsuranceClient"), getSelf());
			incUtil.newMessage();
			name2actor.get("MotherToInsuranceClient__CC_77_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil, (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase_insuranceclient_InsuranceClient"), getSelf());
			incUtil.newMessage();
			name2actor.get("SonToInsuranceClient__CC_93_localSearch").tell(new ReferenceDeleted<edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase, edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil, (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) notification.getNotifier(), (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) notification.getOldValue(), "edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase_insuranceclient_InsuranceClient"), getSelf());
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
		if (node instanceof edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) {
			incUtil.newMessage();
			name2actor.get("InsuranceDatabase_object_SP0").tell(new ObjectDeleted<edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil, (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) node), getSelf());
		}
		if (node instanceof edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) {
			incUtil.newMessage();
			name2actor.get("InsuranceDatabase_object_SP1").tell(new ObjectDeleted<edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase>(incUtil, (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) node), getSelf());
		}
		if (node instanceof edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) {
			incUtil.newMessage();
			name2actor.get("InsuranceClient_object_SP0").tell(new ObjectDeleted<edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil, (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) node), getSelf());
		}
		if (node instanceof edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) {
			incUtil.newMessage();
			name2actor.get("InsuranceClient_object_SP1").tell(new ObjectDeleted<edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient>(incUtil, (edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient) node), getSelf());
		}
		if (node instanceof Families2Insurance.FamilyRegisterToInsuranceDatabase) {
			incUtil.newMessage();
			name2actor.get("FamilyRegisterToInsuranceDatabase_object_SP0").tell(new ObjectDeleted<Families2Insurance.FamilyRegisterToInsuranceDatabase>(incUtil, (Families2Insurance.FamilyRegisterToInsuranceDatabase) node), getSelf());
		}
		if (node instanceof Families2Insurance.FamilyRegisterToInsuranceDatabase) {
			incUtil.newMessage();
			name2actor.get("FamilyRegisterToInsuranceDatabase_object_SP1").tell(new ObjectDeleted<Families2Insurance.FamilyRegisterToInsuranceDatabase>(incUtil, (Families2Insurance.FamilyRegisterToInsuranceDatabase) node), getSelf());
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
		if (node instanceof edu.kit.ipd.sdq.metamodels.families.FamilyRegister) {
			incUtil.newMessage();
			name2actor.get("FamilyRegister_object_SP0").tell(new ObjectDeleted<edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil, (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) node), getSelf());
		}
		if (node instanceof edu.kit.ipd.sdq.metamodels.families.FamilyRegister) {
			incUtil.newMessage();
			name2actor.get("FamilyRegister_object_SP1").tell(new ObjectDeleted<edu.kit.ipd.sdq.metamodels.families.FamilyRegister>(incUtil, (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) node), getSelf());
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
	}
}

