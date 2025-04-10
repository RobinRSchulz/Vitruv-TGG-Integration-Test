package Families2Insurance.initbwd.hipe.engine;

import akka.actor.ActorRef;
import akka.actor.Props;

import Families2Insurance.initbwd.hipe.engine.actor.NotificationActor;
import Families2Insurance.initbwd.hipe.engine.actor.DispatchActor;
import Families2Insurance.initbwd.hipe.engine.actor.localsearch.DaughterToInsuranceClient__BWD_1_localSearch;
import Families2Insurance.initbwd.hipe.engine.actor.localsearch.DaughterToInsuranceClient_daughter_sons_incoming_SRC__FILTER_NAC_SRC_7_localSearch;
import Families2Insurance.initbwd.hipe.engine.actor.localsearch.DaughterToInsuranceClient_daughter_father_incoming_SRC__FILTER_NAC_SRC_10_localSearch;
import Families2Insurance.initbwd.hipe.engine.actor.localsearch.DaughterToInsuranceClient_daughter_mother_incoming_SRC__FILTER_NAC_SRC_13_localSearch;
import Families2Insurance.initbwd.hipe.engine.actor.localsearch.DaughterToInsuranceClient__CONSISTENCY_16_localSearch;
import Families2Insurance.initbwd.hipe.engine.actor.localsearch.FamilyRegisterToInsuranceDatabase__CONSISTENCY_27_localSearch;
import Families2Insurance.initbwd.hipe.engine.actor.localsearch.FatherNewFamilyToNewInsuranceClient__BWD_32_localSearch;
import Families2Insurance.initbwd.hipe.engine.actor.localsearch.FatherNewFamilyToNewInsuranceClient_father_sons_incoming_SRC__FILTER_NAC_SRC_37_localSearch;
import Families2Insurance.initbwd.hipe.engine.actor.localsearch.FatherNewFamilyToNewInsuranceClient_father_daughters_incoming_SRC__FILTER_NAC_SRC_40_localSearch;
import Families2Insurance.initbwd.hipe.engine.actor.localsearch.FatherNewFamilyToNewInsuranceClient_father_mother_incoming_SRC__FILTER_NAC_SRC_43_localSearch;
import Families2Insurance.initbwd.hipe.engine.actor.localsearch.FatherNewFamilyToNewInsuranceClient__CONSISTENCY_46_localSearch;
import Families2Insurance.initbwd.hipe.engine.actor.localsearch.FatherToInsuranceClient__BWD_56_localSearch;
import Families2Insurance.initbwd.hipe.engine.actor.localsearch.FatherToInsuranceClient_father_sons_incoming_SRC__FILTER_NAC_SRC_62_localSearch;
import Families2Insurance.initbwd.hipe.engine.actor.localsearch.FatherToInsuranceClient_father_daughters_incoming_SRC__FILTER_NAC_SRC_65_localSearch;
import Families2Insurance.initbwd.hipe.engine.actor.localsearch.FatherToInsuranceClient_father_mother_incoming_SRC__FILTER_NAC_SRC_68_localSearch;
import Families2Insurance.initbwd.hipe.engine.actor.localsearch.FatherToInsuranceClient__CONSISTENCY_71_localSearch;
import Families2Insurance.initbwd.hipe.engine.actor.localsearch.MotherNewFamilyToNewInsuranceClient__BWD_81_localSearch;
import Families2Insurance.initbwd.hipe.engine.actor.localsearch.MotherNewFamilyToNewInsuranceClient_mother_sons_incoming_SRC__FILTER_NAC_SRC_86_localSearch;
import Families2Insurance.initbwd.hipe.engine.actor.localsearch.MotherNewFamilyToNewInsuranceClient_mother_daughters_incoming_SRC__FILTER_NAC_SRC_89_localSearch;
import Families2Insurance.initbwd.hipe.engine.actor.localsearch.MotherNewFamilyToNewInsuranceClient_mother_father_incoming_SRC__FILTER_NAC_SRC_92_localSearch;
import Families2Insurance.initbwd.hipe.engine.actor.localsearch.MotherNewFamilyToNewInsuranceClient__CONSISTENCY_95_localSearch;
import Families2Insurance.initbwd.hipe.engine.actor.localsearch.MotherToInsuranceClient__BWD_105_localSearch;
import Families2Insurance.initbwd.hipe.engine.actor.localsearch.MotherToInsuranceClient_mother_sons_incoming_SRC__FILTER_NAC_SRC_111_localSearch;
import Families2Insurance.initbwd.hipe.engine.actor.localsearch.MotherToInsuranceClient_mother_daughters_incoming_SRC__FILTER_NAC_SRC_114_localSearch;
import Families2Insurance.initbwd.hipe.engine.actor.localsearch.MotherToInsuranceClient_mother_father_incoming_SRC__FILTER_NAC_SRC_117_localSearch;
import Families2Insurance.initbwd.hipe.engine.actor.localsearch.MotherToInsuranceClient__CONSISTENCY_120_localSearch;
import Families2Insurance.initbwd.hipe.engine.actor.localsearch.SonToInsuranceClient__BWD_130_localSearch;
import Families2Insurance.initbwd.hipe.engine.actor.localsearch.SonToInsuranceClient_son_daughters_incoming_SRC__FILTER_NAC_SRC_136_localSearch;
import Families2Insurance.initbwd.hipe.engine.actor.localsearch.SonToInsuranceClient_son_father_incoming_SRC__FILTER_NAC_SRC_139_localSearch;
import Families2Insurance.initbwd.hipe.engine.actor.localsearch.SonToInsuranceClient_son_mother_incoming_SRC__FILTER_NAC_SRC_142_localSearch;
import Families2Insurance.initbwd.hipe.engine.actor.localsearch.SonToInsuranceClient__CONSISTENCY_145_localSearch;

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
		classes.put("DaughterToInsuranceClient__BWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("DaughterToInsuranceClient__BWD_production", "DaughterToInsuranceClient__BWD");
		classes.put("DaughterToInsuranceClient__CONSISTENCY_production", GenericProductionActor.class);
		productionNodes2pattern.put("DaughterToInsuranceClient__CONSISTENCY_production", "DaughterToInsuranceClient__CONSISTENCY");
		classes.put("DaughterToInsuranceClient_daughter_father_incoming_SRC__FILTER_NAC_SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("DaughterToInsuranceClient_daughter_father_incoming_SRC__FILTER_NAC_SRC_production", "DaughterToInsuranceClient_daughter_father_incoming_SRC__FILTER_NAC_SRC");
		classes.put("DaughterToInsuranceClient_daughter_mother_incoming_SRC__FILTER_NAC_SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("DaughterToInsuranceClient_daughter_mother_incoming_SRC__FILTER_NAC_SRC_production", "DaughterToInsuranceClient_daughter_mother_incoming_SRC__FILTER_NAC_SRC");
		classes.put("DaughterToInsuranceClient_daughter_sons_incoming_SRC__FILTER_NAC_SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("DaughterToInsuranceClient_daughter_sons_incoming_SRC__FILTER_NAC_SRC_production", "DaughterToInsuranceClient_daughter_sons_incoming_SRC__FILTER_NAC_SRC");
		classes.put("FamilyRegisterToInsuranceDatabase__BWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("FamilyRegisterToInsuranceDatabase__BWD_production", "FamilyRegisterToInsuranceDatabase__BWD");
		classes.put("FamilyRegisterToInsuranceDatabase__CONSISTENCY_production", GenericProductionActor.class);
		productionNodes2pattern.put("FamilyRegisterToInsuranceDatabase__CONSISTENCY_production", "FamilyRegisterToInsuranceDatabase__CONSISTENCY");
		classes.put("FatherNewFamilyToNewInsuranceClient__BWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("FatherNewFamilyToNewInsuranceClient__BWD_production", "FatherNewFamilyToNewInsuranceClient__BWD");
		classes.put("FatherNewFamilyToNewInsuranceClient__CONSISTENCY_production", GenericProductionActor.class);
		productionNodes2pattern.put("FatherNewFamilyToNewInsuranceClient__CONSISTENCY_production", "FatherNewFamilyToNewInsuranceClient__CONSISTENCY");
		classes.put("FatherNewFamilyToNewInsuranceClient_father_daughters_incoming_SRC__FILTER_NAC_SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("FatherNewFamilyToNewInsuranceClient_father_daughters_incoming_SRC__FILTER_NAC_SRC_production", "FatherNewFamilyToNewInsuranceClient_father_daughters_incoming_SRC__FILTER_NAC_SRC");
		classes.put("FatherNewFamilyToNewInsuranceClient_father_mother_incoming_SRC__FILTER_NAC_SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("FatherNewFamilyToNewInsuranceClient_father_mother_incoming_SRC__FILTER_NAC_SRC_production", "FatherNewFamilyToNewInsuranceClient_father_mother_incoming_SRC__FILTER_NAC_SRC");
		classes.put("FatherNewFamilyToNewInsuranceClient_father_sons_incoming_SRC__FILTER_NAC_SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("FatherNewFamilyToNewInsuranceClient_father_sons_incoming_SRC__FILTER_NAC_SRC_production", "FatherNewFamilyToNewInsuranceClient_father_sons_incoming_SRC__FILTER_NAC_SRC");
		classes.put("FatherToInsuranceClient__BWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("FatherToInsuranceClient__BWD_production", "FatherToInsuranceClient__BWD");
		classes.put("FatherToInsuranceClient__CONSISTENCY_production", GenericProductionActor.class);
		productionNodes2pattern.put("FatherToInsuranceClient__CONSISTENCY_production", "FatherToInsuranceClient__CONSISTENCY");
		classes.put("FatherToInsuranceClient_father_daughters_incoming_SRC__FILTER_NAC_SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("FatherToInsuranceClient_father_daughters_incoming_SRC__FILTER_NAC_SRC_production", "FatherToInsuranceClient_father_daughters_incoming_SRC__FILTER_NAC_SRC");
		classes.put("FatherToInsuranceClient_father_mother_incoming_SRC__FILTER_NAC_SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("FatherToInsuranceClient_father_mother_incoming_SRC__FILTER_NAC_SRC_production", "FatherToInsuranceClient_father_mother_incoming_SRC__FILTER_NAC_SRC");
		classes.put("FatherToInsuranceClient_father_sons_incoming_SRC__FILTER_NAC_SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("FatherToInsuranceClient_father_sons_incoming_SRC__FILTER_NAC_SRC_production", "FatherToInsuranceClient_father_sons_incoming_SRC__FILTER_NAC_SRC");
		classes.put("MotherNewFamilyToNewInsuranceClient__BWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("MotherNewFamilyToNewInsuranceClient__BWD_production", "MotherNewFamilyToNewInsuranceClient__BWD");
		classes.put("MotherNewFamilyToNewInsuranceClient__CONSISTENCY_production", GenericProductionActor.class);
		productionNodes2pattern.put("MotherNewFamilyToNewInsuranceClient__CONSISTENCY_production", "MotherNewFamilyToNewInsuranceClient__CONSISTENCY");
		classes.put("MotherNewFamilyToNewInsuranceClient_mother_daughters_incoming_SRC__FILTER_NAC_SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("MotherNewFamilyToNewInsuranceClient_mother_daughters_incoming_SRC__FILTER_NAC_SRC_production", "MotherNewFamilyToNewInsuranceClient_mother_daughters_incoming_SRC__FILTER_NAC_SRC");
		classes.put("MotherNewFamilyToNewInsuranceClient_mother_father_incoming_SRC__FILTER_NAC_SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("MotherNewFamilyToNewInsuranceClient_mother_father_incoming_SRC__FILTER_NAC_SRC_production", "MotherNewFamilyToNewInsuranceClient_mother_father_incoming_SRC__FILTER_NAC_SRC");
		classes.put("MotherNewFamilyToNewInsuranceClient_mother_sons_incoming_SRC__FILTER_NAC_SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("MotherNewFamilyToNewInsuranceClient_mother_sons_incoming_SRC__FILTER_NAC_SRC_production", "MotherNewFamilyToNewInsuranceClient_mother_sons_incoming_SRC__FILTER_NAC_SRC");
		classes.put("MotherToInsuranceClient__BWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("MotherToInsuranceClient__BWD_production", "MotherToInsuranceClient__BWD");
		classes.put("MotherToInsuranceClient__CONSISTENCY_production", GenericProductionActor.class);
		productionNodes2pattern.put("MotherToInsuranceClient__CONSISTENCY_production", "MotherToInsuranceClient__CONSISTENCY");
		classes.put("MotherToInsuranceClient_mother_daughters_incoming_SRC__FILTER_NAC_SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("MotherToInsuranceClient_mother_daughters_incoming_SRC__FILTER_NAC_SRC_production", "MotherToInsuranceClient_mother_daughters_incoming_SRC__FILTER_NAC_SRC");
		classes.put("MotherToInsuranceClient_mother_father_incoming_SRC__FILTER_NAC_SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("MotherToInsuranceClient_mother_father_incoming_SRC__FILTER_NAC_SRC_production", "MotherToInsuranceClient_mother_father_incoming_SRC__FILTER_NAC_SRC");
		classes.put("MotherToInsuranceClient_mother_sons_incoming_SRC__FILTER_NAC_SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("MotherToInsuranceClient_mother_sons_incoming_SRC__FILTER_NAC_SRC_production", "MotherToInsuranceClient_mother_sons_incoming_SRC__FILTER_NAC_SRC");
		classes.put("SonToInsuranceClient__BWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("SonToInsuranceClient__BWD_production", "SonToInsuranceClient__BWD");
		classes.put("SonToInsuranceClient__CONSISTENCY_production", GenericProductionActor.class);
		productionNodes2pattern.put("SonToInsuranceClient__CONSISTENCY_production", "SonToInsuranceClient__CONSISTENCY");
		classes.put("SonToInsuranceClient_son_daughters_incoming_SRC__FILTER_NAC_SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("SonToInsuranceClient_son_daughters_incoming_SRC__FILTER_NAC_SRC_production", "SonToInsuranceClient_son_daughters_incoming_SRC__FILTER_NAC_SRC");
		classes.put("SonToInsuranceClient_son_father_incoming_SRC__FILTER_NAC_SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("SonToInsuranceClient_son_father_incoming_SRC__FILTER_NAC_SRC_production", "SonToInsuranceClient_son_father_incoming_SRC__FILTER_NAC_SRC");
		classes.put("SonToInsuranceClient_son_mother_incoming_SRC__FILTER_NAC_SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("SonToInsuranceClient_son_mother_incoming_SRC__FILTER_NAC_SRC_production", "SonToInsuranceClient_son_mother_incoming_SRC__FILTER_NAC_SRC");
		
	}
	
	@Override
	public void createJunctionNodes() {
		classes.put("DaughterToInsuranceClient__BWD_1_localSearch", DaughterToInsuranceClient__BWD_1_localSearch.class);
		classes.put("DaughterToInsuranceClient_daughter_sons_incoming_SRC__FILTER_NAC_SRC_7_localSearch", DaughterToInsuranceClient_daughter_sons_incoming_SRC__FILTER_NAC_SRC_7_localSearch.class);
		classes.put("DaughterToInsuranceClient_daughter_father_incoming_SRC__FILTER_NAC_SRC_10_localSearch", DaughterToInsuranceClient_daughter_father_incoming_SRC__FILTER_NAC_SRC_10_localSearch.class);
		classes.put("DaughterToInsuranceClient_daughter_mother_incoming_SRC__FILTER_NAC_SRC_13_localSearch", DaughterToInsuranceClient_daughter_mother_incoming_SRC__FILTER_NAC_SRC_13_localSearch.class);
		classes.put("DaughterToInsuranceClient__CONSISTENCY_16_localSearch", DaughterToInsuranceClient__CONSISTENCY_16_localSearch.class);
		classes.put("FamilyRegisterToInsuranceDatabase__CONSISTENCY_27_localSearch", FamilyRegisterToInsuranceDatabase__CONSISTENCY_27_localSearch.class);
		classes.put("FatherNewFamilyToNewInsuranceClient__BWD_32_localSearch", FatherNewFamilyToNewInsuranceClient__BWD_32_localSearch.class);
		classes.put("FatherNewFamilyToNewInsuranceClient_father_sons_incoming_SRC__FILTER_NAC_SRC_37_localSearch", FatherNewFamilyToNewInsuranceClient_father_sons_incoming_SRC__FILTER_NAC_SRC_37_localSearch.class);
		classes.put("FatherNewFamilyToNewInsuranceClient_father_daughters_incoming_SRC__FILTER_NAC_SRC_40_localSearch", FatherNewFamilyToNewInsuranceClient_father_daughters_incoming_SRC__FILTER_NAC_SRC_40_localSearch.class);
		classes.put("FatherNewFamilyToNewInsuranceClient_father_mother_incoming_SRC__FILTER_NAC_SRC_43_localSearch", FatherNewFamilyToNewInsuranceClient_father_mother_incoming_SRC__FILTER_NAC_SRC_43_localSearch.class);
		classes.put("FatherNewFamilyToNewInsuranceClient__CONSISTENCY_46_localSearch", FatherNewFamilyToNewInsuranceClient__CONSISTENCY_46_localSearch.class);
		classes.put("FatherToInsuranceClient__BWD_56_localSearch", FatherToInsuranceClient__BWD_56_localSearch.class);
		classes.put("FatherToInsuranceClient_father_sons_incoming_SRC__FILTER_NAC_SRC_62_localSearch", FatherToInsuranceClient_father_sons_incoming_SRC__FILTER_NAC_SRC_62_localSearch.class);
		classes.put("FatherToInsuranceClient_father_daughters_incoming_SRC__FILTER_NAC_SRC_65_localSearch", FatherToInsuranceClient_father_daughters_incoming_SRC__FILTER_NAC_SRC_65_localSearch.class);
		classes.put("FatherToInsuranceClient_father_mother_incoming_SRC__FILTER_NAC_SRC_68_localSearch", FatherToInsuranceClient_father_mother_incoming_SRC__FILTER_NAC_SRC_68_localSearch.class);
		classes.put("FatherToInsuranceClient__CONSISTENCY_71_localSearch", FatherToInsuranceClient__CONSISTENCY_71_localSearch.class);
		classes.put("MotherNewFamilyToNewInsuranceClient__BWD_81_localSearch", MotherNewFamilyToNewInsuranceClient__BWD_81_localSearch.class);
		classes.put("MotherNewFamilyToNewInsuranceClient_mother_sons_incoming_SRC__FILTER_NAC_SRC_86_localSearch", MotherNewFamilyToNewInsuranceClient_mother_sons_incoming_SRC__FILTER_NAC_SRC_86_localSearch.class);
		classes.put("MotherNewFamilyToNewInsuranceClient_mother_daughters_incoming_SRC__FILTER_NAC_SRC_89_localSearch", MotherNewFamilyToNewInsuranceClient_mother_daughters_incoming_SRC__FILTER_NAC_SRC_89_localSearch.class);
		classes.put("MotherNewFamilyToNewInsuranceClient_mother_father_incoming_SRC__FILTER_NAC_SRC_92_localSearch", MotherNewFamilyToNewInsuranceClient_mother_father_incoming_SRC__FILTER_NAC_SRC_92_localSearch.class);
		classes.put("MotherNewFamilyToNewInsuranceClient__CONSISTENCY_95_localSearch", MotherNewFamilyToNewInsuranceClient__CONSISTENCY_95_localSearch.class);
		classes.put("MotherToInsuranceClient__BWD_105_localSearch", MotherToInsuranceClient__BWD_105_localSearch.class);
		classes.put("MotherToInsuranceClient_mother_sons_incoming_SRC__FILTER_NAC_SRC_111_localSearch", MotherToInsuranceClient_mother_sons_incoming_SRC__FILTER_NAC_SRC_111_localSearch.class);
		classes.put("MotherToInsuranceClient_mother_daughters_incoming_SRC__FILTER_NAC_SRC_114_localSearch", MotherToInsuranceClient_mother_daughters_incoming_SRC__FILTER_NAC_SRC_114_localSearch.class);
		classes.put("MotherToInsuranceClient_mother_father_incoming_SRC__FILTER_NAC_SRC_117_localSearch", MotherToInsuranceClient_mother_father_incoming_SRC__FILTER_NAC_SRC_117_localSearch.class);
		classes.put("MotherToInsuranceClient__CONSISTENCY_120_localSearch", MotherToInsuranceClient__CONSISTENCY_120_localSearch.class);
		classes.put("SonToInsuranceClient__BWD_130_localSearch", SonToInsuranceClient__BWD_130_localSearch.class);
		classes.put("SonToInsuranceClient_son_daughters_incoming_SRC__FILTER_NAC_SRC_136_localSearch", SonToInsuranceClient_son_daughters_incoming_SRC__FILTER_NAC_SRC_136_localSearch.class);
		classes.put("SonToInsuranceClient_son_father_incoming_SRC__FILTER_NAC_SRC_139_localSearch", SonToInsuranceClient_son_father_incoming_SRC__FILTER_NAC_SRC_139_localSearch.class);
		classes.put("SonToInsuranceClient_son_mother_incoming_SRC__FILTER_NAC_SRC_142_localSearch", SonToInsuranceClient_son_mother_incoming_SRC__FILTER_NAC_SRC_142_localSearch.class);
		classes.put("SonToInsuranceClient__CONSISTENCY_145_localSearch", SonToInsuranceClient__CONSISTENCY_145_localSearch.class);
	}
	
	@Override
	public void createReferenceNodes() {
		
	}
	
	@Override
	public void createObjectNodes() {
		classes.put("DaughterToInsuranceClient__Marker_object",DaughterToInsuranceClient__Marker_object.class);
		classes.put("FamilyRegisterToInsuranceDatabase__Marker_object",FamilyRegisterToInsuranceDatabase__Marker_object.class);
		classes.put("FatherNewFamilyToNewInsuranceClient__Marker_object",FatherNewFamilyToNewInsuranceClient__Marker_object.class);
		classes.put("FatherToInsuranceClient__Marker_object",FatherToInsuranceClient__Marker_object.class);
		classes.put("MotherNewFamilyToNewInsuranceClient__Marker_object",MotherNewFamilyToNewInsuranceClient__Marker_object.class);
		classes.put("MotherToInsuranceClient__Marker_object",MotherToInsuranceClient__Marker_object.class);
		classes.put("SonToInsuranceClient__Marker_object",SonToInsuranceClient__Marker_object.class);
		classes.put("Family_object_SP0",Family_object_SP0.class);
		classes.put("Family_object_SP1",Family_object_SP1.class);
		classes.put("Family_object_SP2",Family_object_SP2.class);
		classes.put("Family_object_SP3",Family_object_SP3.class);
		classes.put("Family_object_SP4",Family_object_SP4.class);
		classes.put("Family_object_SP5",Family_object_SP5.class);
		classes.put("Family_object_SP6",Family_object_SP6.class);
		classes.put("FamilyRegister_object_SP0",FamilyRegister_object_SP0.class);
		classes.put("FamilyRegister_object_SP1",FamilyRegister_object_SP1.class);
		classes.put("FamilyRegister_object_SP2",FamilyRegister_object_SP2.class);
		classes.put("FamilyRegister_object_SP3",FamilyRegister_object_SP3.class);
		classes.put("FamilyRegisterToInsuranceDatabase_object_SP0",FamilyRegisterToInsuranceDatabase_object_SP0.class);
		classes.put("FamilyRegisterToInsuranceDatabase_object_SP1",FamilyRegisterToInsuranceDatabase_object_SP1.class);
		classes.put("FamilyRegisterToInsuranceDatabase_object_SP2",FamilyRegisterToInsuranceDatabase_object_SP2.class);
		classes.put("FamilyRegisterToInsuranceDatabase_object_SP3",FamilyRegisterToInsuranceDatabase_object_SP3.class);
		classes.put("InsuranceDatabase_object_SP0",InsuranceDatabase_object_SP0.class);
		classes.put("InsuranceDatabase_object_SP1",InsuranceDatabase_object_SP1.class);
		classes.put("InsuranceDatabase_object_SP2",InsuranceDatabase_object_SP2.class);
		classes.put("InsuranceDatabase_object_SP3",InsuranceDatabase_object_SP3.class);
		classes.put("InsuranceClient_object_SP0",InsuranceClient_object_SP0.class);
		classes.put("InsuranceClient_object_SP1",InsuranceClient_object_SP1.class);
		classes.put("InsuranceClient_object_SP2",InsuranceClient_object_SP2.class);
		classes.put("Member_object_SP0",Member_object_SP0.class);
		classes.put("Member_object_SP1",Member_object_SP1.class);
		classes.put("Member_object_SP2",Member_object_SP2.class);
		classes.put("Member_object_SP3",Member_object_SP3.class);
		classes.put("Member_object_SP4",Member_object_SP4.class);
		classes.put("Member_object_SP5",Member_object_SP5.class);
		classes.put("FamilyToInsuranceClient_object_SP0",FamilyToInsuranceClient_object_SP0.class);
		classes.put("FamilyToInsuranceClient_object_SP1",FamilyToInsuranceClient_object_SP1.class);
		classes.put("MemberToInsuranceClient_object_SP0",MemberToInsuranceClient_object_SP0.class);
		classes.put("MemberToInsuranceClient_object_SP1",MemberToInsuranceClient_object_SP1.class);
		
	}
	
	@Override
	public void initializeReferenceNodes() {
	}
}

class DaughterToInsuranceClient__Marker_object extends GenericObjectActor<Something2Else.DaughterToInsuranceClient__Marker> { }
class FamilyRegisterToInsuranceDatabase__Marker_object extends GenericObjectActor<Something2Else.FamilyRegisterToInsuranceDatabase__Marker> { }
class FatherNewFamilyToNewInsuranceClient__Marker_object extends GenericObjectActor<Something2Else.FatherNewFamilyToNewInsuranceClient__Marker> { }
class FatherToInsuranceClient__Marker_object extends GenericObjectActor<Something2Else.FatherToInsuranceClient__Marker> { }
class MotherNewFamilyToNewInsuranceClient__Marker_object extends GenericObjectActor<Something2Else.MotherNewFamilyToNewInsuranceClient__Marker> { }
class MotherToInsuranceClient__Marker_object extends GenericObjectActor<Something2Else.MotherToInsuranceClient__Marker> { }
class SonToInsuranceClient__Marker_object extends GenericObjectActor<Something2Else.SonToInsuranceClient__Marker> { }
class Family_object_SP0 extends GenericObjectActor<edu.kit.ipd.sdq.metamodels.families.Family> { }
class Family_object_SP1 extends GenericObjectActor<edu.kit.ipd.sdq.metamodels.families.Family> { }
class Family_object_SP2 extends GenericObjectActor<edu.kit.ipd.sdq.metamodels.families.Family> { }
class Family_object_SP3 extends GenericObjectActor<edu.kit.ipd.sdq.metamodels.families.Family> { }
class Family_object_SP4 extends GenericObjectActor<edu.kit.ipd.sdq.metamodels.families.Family> { }
class Family_object_SP5 extends GenericObjectActor<edu.kit.ipd.sdq.metamodels.families.Family> { }
class Family_object_SP6 extends GenericObjectActor<edu.kit.ipd.sdq.metamodels.families.Family> { }
class FamilyRegister_object_SP0 extends GenericObjectActor<edu.kit.ipd.sdq.metamodels.families.FamilyRegister> { }
class FamilyRegister_object_SP1 extends GenericObjectActor<edu.kit.ipd.sdq.metamodels.families.FamilyRegister> { }
class FamilyRegister_object_SP2 extends GenericObjectActor<edu.kit.ipd.sdq.metamodels.families.FamilyRegister> { }
class FamilyRegister_object_SP3 extends GenericObjectActor<edu.kit.ipd.sdq.metamodels.families.FamilyRegister> { }
class FamilyRegisterToInsuranceDatabase_object_SP0 extends GenericObjectActor<Something2Else.FamilyRegisterToInsuranceDatabase> { }
class FamilyRegisterToInsuranceDatabase_object_SP1 extends GenericObjectActor<Something2Else.FamilyRegisterToInsuranceDatabase> { }
class FamilyRegisterToInsuranceDatabase_object_SP2 extends GenericObjectActor<Something2Else.FamilyRegisterToInsuranceDatabase> { }
class FamilyRegisterToInsuranceDatabase_object_SP3 extends GenericObjectActor<Something2Else.FamilyRegisterToInsuranceDatabase> { }
class InsuranceDatabase_object_SP0 extends GenericObjectActor<edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase> { }
class InsuranceDatabase_object_SP1 extends GenericObjectActor<edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase> { }
class InsuranceDatabase_object_SP2 extends GenericObjectActor<edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase> { }
class InsuranceDatabase_object_SP3 extends GenericObjectActor<edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase> { }
class InsuranceClient_object_SP0 extends GenericObjectActor<edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient> { }
class InsuranceClient_object_SP1 extends GenericObjectActor<edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient> { }
class InsuranceClient_object_SP2 extends GenericObjectActor<edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient> { }
class Member_object_SP0 extends GenericObjectActor<edu.kit.ipd.sdq.metamodels.families.Member> { }
class Member_object_SP1 extends GenericObjectActor<edu.kit.ipd.sdq.metamodels.families.Member> { }
class Member_object_SP2 extends GenericObjectActor<edu.kit.ipd.sdq.metamodels.families.Member> { }
class Member_object_SP3 extends GenericObjectActor<edu.kit.ipd.sdq.metamodels.families.Member> { }
class Member_object_SP4 extends GenericObjectActor<edu.kit.ipd.sdq.metamodels.families.Member> { }
class Member_object_SP5 extends GenericObjectActor<edu.kit.ipd.sdq.metamodels.families.Member> { }
class FamilyToInsuranceClient_object_SP0 extends GenericObjectActor<Something2Else.FamilyToInsuranceClient> { }
class FamilyToInsuranceClient_object_SP1 extends GenericObjectActor<Something2Else.FamilyToInsuranceClient> { }
class MemberToInsuranceClient_object_SP0 extends GenericObjectActor<Something2Else.MemberToInsuranceClient> { }
class MemberToInsuranceClient_object_SP1 extends GenericObjectActor<Something2Else.MemberToInsuranceClient> { }


