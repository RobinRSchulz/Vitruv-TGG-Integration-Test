package Families2Insurance.integrate.hipe.engine;

import akka.actor.ActorRef;
import akka.actor.Props;

import Families2Insurance.integrate.hipe.engine.actor.NotificationActor;
import Families2Insurance.integrate.hipe.engine.actor.DispatchActor;
import Families2Insurance.integrate.hipe.engine.actor.localsearch.DaughterToInsuranceClient__TRG_1_localSearch;
import Families2Insurance.integrate.hipe.engine.actor.localsearch.DaughterToInsuranceClient__BWD_4_localSearch;
import Families2Insurance.integrate.hipe.engine.actor.localsearch.DaughterToInsuranceClient_daughter_sons_incoming_SRC__FILTER_NAC_SRC_8_localSearch;
import Families2Insurance.integrate.hipe.engine.actor.localsearch.DaughterToInsuranceClient_daughter_father_incoming_SRC__FILTER_NAC_SRC_11_localSearch;
import Families2Insurance.integrate.hipe.engine.actor.localsearch.DaughterToInsuranceClient_daughter_mother_incoming_SRC__FILTER_NAC_SRC_14_localSearch;
import Families2Insurance.integrate.hipe.engine.actor.localsearch.DaughterToInsuranceClient__CC_17_localSearch;
import Families2Insurance.integrate.hipe.engine.actor.localsearch.DaughterToInsuranceClient__SRC_24_localSearch;
import Families2Insurance.integrate.hipe.engine.actor.localsearch.DaughterToInsuranceClient__FWD_28_localSearch;
import Families2Insurance.integrate.hipe.engine.actor.localsearch.DaughterToInsuranceClient__CONSISTENCY_31_localSearch;
import Families2Insurance.integrate.hipe.engine.actor.localsearch.FamilyRegisterToInsuranceDatabase__CONSISTENCY_40_localSearch;
import Families2Insurance.integrate.hipe.engine.actor.localsearch.FatherNewFamilyToNewInsuranceClient__TRG_43_localSearch;
import Families2Insurance.integrate.hipe.engine.actor.localsearch.FatherNewFamilyToNewInsuranceClient__BWD_46_localSearch;
import Families2Insurance.integrate.hipe.engine.actor.localsearch.FatherNewFamilyToNewInsuranceClient_father_sons_incoming_SRC__FILTER_NAC_SRC_49_localSearch;
import Families2Insurance.integrate.hipe.engine.actor.localsearch.FatherNewFamilyToNewInsuranceClient_father_daughters_incoming_SRC__FILTER_NAC_SRC_52_localSearch;
import Families2Insurance.integrate.hipe.engine.actor.localsearch.FatherNewFamilyToNewInsuranceClient_father_mother_incoming_SRC__FILTER_NAC_SRC_55_localSearch;
import Families2Insurance.integrate.hipe.engine.actor.localsearch.FatherNewFamilyToNewInsuranceClient__CC_58_localSearch;
import Families2Insurance.integrate.hipe.engine.actor.localsearch.FatherNewFamilyToNewInsuranceClient__SRC_65_localSearch;
import Families2Insurance.integrate.hipe.engine.actor.localsearch.FatherNewFamilyToNewInsuranceClient__FWD_69_localSearch;
import Families2Insurance.integrate.hipe.engine.actor.localsearch.FatherNewFamilyToNewInsuranceClient__CONSISTENCY_72_localSearch;
import Families2Insurance.integrate.hipe.engine.actor.localsearch.FatherToInsuranceClient__TRG_76_localSearch;
import Families2Insurance.integrate.hipe.engine.actor.localsearch.FatherToInsuranceClient__BWD_79_localSearch;
import Families2Insurance.integrate.hipe.engine.actor.localsearch.FatherToInsuranceClient_father_sons_incoming_SRC__FILTER_NAC_SRC_83_localSearch;
import Families2Insurance.integrate.hipe.engine.actor.localsearch.FatherToInsuranceClient_father_daughters_incoming_SRC__FILTER_NAC_SRC_86_localSearch;
import Families2Insurance.integrate.hipe.engine.actor.localsearch.FatherToInsuranceClient_father_mother_incoming_SRC__FILTER_NAC_SRC_89_localSearch;
import Families2Insurance.integrate.hipe.engine.actor.localsearch.FatherToInsuranceClient__CC_92_localSearch;
import Families2Insurance.integrate.hipe.engine.actor.localsearch.FatherToInsuranceClient__SRC_99_localSearch;
import Families2Insurance.integrate.hipe.engine.actor.localsearch.FatherToInsuranceClient__FWD_103_localSearch;
import Families2Insurance.integrate.hipe.engine.actor.localsearch.FatherToInsuranceClient__CONSISTENCY_106_localSearch;
import Families2Insurance.integrate.hipe.engine.actor.localsearch.MotherNewFamilyToNewInsuranceClient__TRG_110_localSearch;
import Families2Insurance.integrate.hipe.engine.actor.localsearch.MotherNewFamilyToNewInsuranceClient__BWD_113_localSearch;
import Families2Insurance.integrate.hipe.engine.actor.localsearch.MotherNewFamilyToNewInsuranceClient_mother_sons_incoming_SRC__FILTER_NAC_SRC_116_localSearch;
import Families2Insurance.integrate.hipe.engine.actor.localsearch.MotherNewFamilyToNewInsuranceClient_mother_daughters_incoming_SRC__FILTER_NAC_SRC_119_localSearch;
import Families2Insurance.integrate.hipe.engine.actor.localsearch.MotherNewFamilyToNewInsuranceClient_mother_father_incoming_SRC__FILTER_NAC_SRC_122_localSearch;
import Families2Insurance.integrate.hipe.engine.actor.localsearch.MotherNewFamilyToNewInsuranceClient__CC_125_localSearch;
import Families2Insurance.integrate.hipe.engine.actor.localsearch.MotherNewFamilyToNewInsuranceClient__SRC_132_localSearch;
import Families2Insurance.integrate.hipe.engine.actor.localsearch.MotherNewFamilyToNewInsuranceClient__FWD_136_localSearch;
import Families2Insurance.integrate.hipe.engine.actor.localsearch.MotherNewFamilyToNewInsuranceClient__CONSISTENCY_139_localSearch;
import Families2Insurance.integrate.hipe.engine.actor.localsearch.MotherToInsuranceClient__TRG_143_localSearch;
import Families2Insurance.integrate.hipe.engine.actor.localsearch.MotherToInsuranceClient__BWD_146_localSearch;
import Families2Insurance.integrate.hipe.engine.actor.localsearch.MotherToInsuranceClient_mother_sons_incoming_SRC__FILTER_NAC_SRC_150_localSearch;
import Families2Insurance.integrate.hipe.engine.actor.localsearch.MotherToInsuranceClient_mother_daughters_incoming_SRC__FILTER_NAC_SRC_153_localSearch;
import Families2Insurance.integrate.hipe.engine.actor.localsearch.MotherToInsuranceClient_mother_father_incoming_SRC__FILTER_NAC_SRC_156_localSearch;
import Families2Insurance.integrate.hipe.engine.actor.localsearch.MotherToInsuranceClient__CC_159_localSearch;
import Families2Insurance.integrate.hipe.engine.actor.localsearch.MotherToInsuranceClient__SRC_166_localSearch;
import Families2Insurance.integrate.hipe.engine.actor.localsearch.MotherToInsuranceClient__FWD_170_localSearch;
import Families2Insurance.integrate.hipe.engine.actor.localsearch.MotherToInsuranceClient__CONSISTENCY_173_localSearch;
import Families2Insurance.integrate.hipe.engine.actor.localsearch.SonToInsuranceClient__TRG_177_localSearch;
import Families2Insurance.integrate.hipe.engine.actor.localsearch.SonToInsuranceClient__BWD_180_localSearch;
import Families2Insurance.integrate.hipe.engine.actor.localsearch.SonToInsuranceClient_son_daughters_incoming_SRC__FILTER_NAC_SRC_184_localSearch;
import Families2Insurance.integrate.hipe.engine.actor.localsearch.SonToInsuranceClient_son_father_incoming_SRC__FILTER_NAC_SRC_187_localSearch;
import Families2Insurance.integrate.hipe.engine.actor.localsearch.SonToInsuranceClient_son_mother_incoming_SRC__FILTER_NAC_SRC_190_localSearch;
import Families2Insurance.integrate.hipe.engine.actor.localsearch.SonToInsuranceClient__CC_193_localSearch;
import Families2Insurance.integrate.hipe.engine.actor.localsearch.SonToInsuranceClient__SRC_200_localSearch;
import Families2Insurance.integrate.hipe.engine.actor.localsearch.SonToInsuranceClient__FWD_204_localSearch;
import Families2Insurance.integrate.hipe.engine.actor.localsearch.SonToInsuranceClient__CONSISTENCY_207_localSearch;

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
		classes.put("DaughterToInsuranceClient__CC_production", GenericProductionActor.class);
		productionNodes2pattern.put("DaughterToInsuranceClient__CC_production", "DaughterToInsuranceClient__CC");
		classes.put("DaughterToInsuranceClient__CONSISTENCY_production", GenericProductionActor.class);
		productionNodes2pattern.put("DaughterToInsuranceClient__CONSISTENCY_production", "DaughterToInsuranceClient__CONSISTENCY");
		classes.put("DaughterToInsuranceClient__FWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("DaughterToInsuranceClient__FWD_production", "DaughterToInsuranceClient__FWD");
		classes.put("DaughterToInsuranceClient__SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("DaughterToInsuranceClient__SRC_production", "DaughterToInsuranceClient__SRC");
		classes.put("DaughterToInsuranceClient__TRG_production", GenericProductionActor.class);
		productionNodes2pattern.put("DaughterToInsuranceClient__TRG_production", "DaughterToInsuranceClient__TRG");
		classes.put("DaughterToInsuranceClient_daughter_father_incoming_SRC__FILTER_NAC_SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("DaughterToInsuranceClient_daughter_father_incoming_SRC__FILTER_NAC_SRC_production", "DaughterToInsuranceClient_daughter_father_incoming_SRC__FILTER_NAC_SRC");
		classes.put("DaughterToInsuranceClient_daughter_mother_incoming_SRC__FILTER_NAC_SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("DaughterToInsuranceClient_daughter_mother_incoming_SRC__FILTER_NAC_SRC_production", "DaughterToInsuranceClient_daughter_mother_incoming_SRC__FILTER_NAC_SRC");
		classes.put("DaughterToInsuranceClient_daughter_sons_incoming_SRC__FILTER_NAC_SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("DaughterToInsuranceClient_daughter_sons_incoming_SRC__FILTER_NAC_SRC_production", "DaughterToInsuranceClient_daughter_sons_incoming_SRC__FILTER_NAC_SRC");
		classes.put("FamilyRegisterToInsuranceDatabase__BWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("FamilyRegisterToInsuranceDatabase__BWD_production", "FamilyRegisterToInsuranceDatabase__BWD");
		classes.put("FamilyRegisterToInsuranceDatabase__CC_production", GenericProductionActor.class);
		productionNodes2pattern.put("FamilyRegisterToInsuranceDatabase__CC_production", "FamilyRegisterToInsuranceDatabase__CC");
		classes.put("FamilyRegisterToInsuranceDatabase__CONSISTENCY_production", GenericProductionActor.class);
		productionNodes2pattern.put("FamilyRegisterToInsuranceDatabase__CONSISTENCY_production", "FamilyRegisterToInsuranceDatabase__CONSISTENCY");
		classes.put("FamilyRegisterToInsuranceDatabase__FWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("FamilyRegisterToInsuranceDatabase__FWD_production", "FamilyRegisterToInsuranceDatabase__FWD");
		classes.put("FatherNewFamilyToNewInsuranceClient__BWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("FatherNewFamilyToNewInsuranceClient__BWD_production", "FatherNewFamilyToNewInsuranceClient__BWD");
		classes.put("FatherNewFamilyToNewInsuranceClient__CC_production", GenericProductionActor.class);
		productionNodes2pattern.put("FatherNewFamilyToNewInsuranceClient__CC_production", "FatherNewFamilyToNewInsuranceClient__CC");
		classes.put("FatherNewFamilyToNewInsuranceClient__CONSISTENCY_production", GenericProductionActor.class);
		productionNodes2pattern.put("FatherNewFamilyToNewInsuranceClient__CONSISTENCY_production", "FatherNewFamilyToNewInsuranceClient__CONSISTENCY");
		classes.put("FatherNewFamilyToNewInsuranceClient__FWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("FatherNewFamilyToNewInsuranceClient__FWD_production", "FatherNewFamilyToNewInsuranceClient__FWD");
		classes.put("FatherNewFamilyToNewInsuranceClient__SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("FatherNewFamilyToNewInsuranceClient__SRC_production", "FatherNewFamilyToNewInsuranceClient__SRC");
		classes.put("FatherNewFamilyToNewInsuranceClient__TRG_production", GenericProductionActor.class);
		productionNodes2pattern.put("FatherNewFamilyToNewInsuranceClient__TRG_production", "FatherNewFamilyToNewInsuranceClient__TRG");
		classes.put("FatherNewFamilyToNewInsuranceClient_father_daughters_incoming_SRC__FILTER_NAC_SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("FatherNewFamilyToNewInsuranceClient_father_daughters_incoming_SRC__FILTER_NAC_SRC_production", "FatherNewFamilyToNewInsuranceClient_father_daughters_incoming_SRC__FILTER_NAC_SRC");
		classes.put("FatherNewFamilyToNewInsuranceClient_father_mother_incoming_SRC__FILTER_NAC_SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("FatherNewFamilyToNewInsuranceClient_father_mother_incoming_SRC__FILTER_NAC_SRC_production", "FatherNewFamilyToNewInsuranceClient_father_mother_incoming_SRC__FILTER_NAC_SRC");
		classes.put("FatherNewFamilyToNewInsuranceClient_father_sons_incoming_SRC__FILTER_NAC_SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("FatherNewFamilyToNewInsuranceClient_father_sons_incoming_SRC__FILTER_NAC_SRC_production", "FatherNewFamilyToNewInsuranceClient_father_sons_incoming_SRC__FILTER_NAC_SRC");
		classes.put("FatherToInsuranceClient__BWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("FatherToInsuranceClient__BWD_production", "FatherToInsuranceClient__BWD");
		classes.put("FatherToInsuranceClient__CC_production", GenericProductionActor.class);
		productionNodes2pattern.put("FatherToInsuranceClient__CC_production", "FatherToInsuranceClient__CC");
		classes.put("FatherToInsuranceClient__CONSISTENCY_production", GenericProductionActor.class);
		productionNodes2pattern.put("FatherToInsuranceClient__CONSISTENCY_production", "FatherToInsuranceClient__CONSISTENCY");
		classes.put("FatherToInsuranceClient__FWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("FatherToInsuranceClient__FWD_production", "FatherToInsuranceClient__FWD");
		classes.put("FatherToInsuranceClient__SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("FatherToInsuranceClient__SRC_production", "FatherToInsuranceClient__SRC");
		classes.put("FatherToInsuranceClient__TRG_production", GenericProductionActor.class);
		productionNodes2pattern.put("FatherToInsuranceClient__TRG_production", "FatherToInsuranceClient__TRG");
		classes.put("FatherToInsuranceClient_father_daughters_incoming_SRC__FILTER_NAC_SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("FatherToInsuranceClient_father_daughters_incoming_SRC__FILTER_NAC_SRC_production", "FatherToInsuranceClient_father_daughters_incoming_SRC__FILTER_NAC_SRC");
		classes.put("FatherToInsuranceClient_father_mother_incoming_SRC__FILTER_NAC_SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("FatherToInsuranceClient_father_mother_incoming_SRC__FILTER_NAC_SRC_production", "FatherToInsuranceClient_father_mother_incoming_SRC__FILTER_NAC_SRC");
		classes.put("FatherToInsuranceClient_father_sons_incoming_SRC__FILTER_NAC_SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("FatherToInsuranceClient_father_sons_incoming_SRC__FILTER_NAC_SRC_production", "FatherToInsuranceClient_father_sons_incoming_SRC__FILTER_NAC_SRC");
		classes.put("MotherNewFamilyToNewInsuranceClient__BWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("MotherNewFamilyToNewInsuranceClient__BWD_production", "MotherNewFamilyToNewInsuranceClient__BWD");
		classes.put("MotherNewFamilyToNewInsuranceClient__CC_production", GenericProductionActor.class);
		productionNodes2pattern.put("MotherNewFamilyToNewInsuranceClient__CC_production", "MotherNewFamilyToNewInsuranceClient__CC");
		classes.put("MotherNewFamilyToNewInsuranceClient__CONSISTENCY_production", GenericProductionActor.class);
		productionNodes2pattern.put("MotherNewFamilyToNewInsuranceClient__CONSISTENCY_production", "MotherNewFamilyToNewInsuranceClient__CONSISTENCY");
		classes.put("MotherNewFamilyToNewInsuranceClient__FWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("MotherNewFamilyToNewInsuranceClient__FWD_production", "MotherNewFamilyToNewInsuranceClient__FWD");
		classes.put("MotherNewFamilyToNewInsuranceClient__SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("MotherNewFamilyToNewInsuranceClient__SRC_production", "MotherNewFamilyToNewInsuranceClient__SRC");
		classes.put("MotherNewFamilyToNewInsuranceClient__TRG_production", GenericProductionActor.class);
		productionNodes2pattern.put("MotherNewFamilyToNewInsuranceClient__TRG_production", "MotherNewFamilyToNewInsuranceClient__TRG");
		classes.put("MotherNewFamilyToNewInsuranceClient_mother_daughters_incoming_SRC__FILTER_NAC_SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("MotherNewFamilyToNewInsuranceClient_mother_daughters_incoming_SRC__FILTER_NAC_SRC_production", "MotherNewFamilyToNewInsuranceClient_mother_daughters_incoming_SRC__FILTER_NAC_SRC");
		classes.put("MotherNewFamilyToNewInsuranceClient_mother_father_incoming_SRC__FILTER_NAC_SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("MotherNewFamilyToNewInsuranceClient_mother_father_incoming_SRC__FILTER_NAC_SRC_production", "MotherNewFamilyToNewInsuranceClient_mother_father_incoming_SRC__FILTER_NAC_SRC");
		classes.put("MotherNewFamilyToNewInsuranceClient_mother_sons_incoming_SRC__FILTER_NAC_SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("MotherNewFamilyToNewInsuranceClient_mother_sons_incoming_SRC__FILTER_NAC_SRC_production", "MotherNewFamilyToNewInsuranceClient_mother_sons_incoming_SRC__FILTER_NAC_SRC");
		classes.put("MotherToInsuranceClient__BWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("MotherToInsuranceClient__BWD_production", "MotherToInsuranceClient__BWD");
		classes.put("MotherToInsuranceClient__CC_production", GenericProductionActor.class);
		productionNodes2pattern.put("MotherToInsuranceClient__CC_production", "MotherToInsuranceClient__CC");
		classes.put("MotherToInsuranceClient__CONSISTENCY_production", GenericProductionActor.class);
		productionNodes2pattern.put("MotherToInsuranceClient__CONSISTENCY_production", "MotherToInsuranceClient__CONSISTENCY");
		classes.put("MotherToInsuranceClient__FWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("MotherToInsuranceClient__FWD_production", "MotherToInsuranceClient__FWD");
		classes.put("MotherToInsuranceClient__SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("MotherToInsuranceClient__SRC_production", "MotherToInsuranceClient__SRC");
		classes.put("MotherToInsuranceClient__TRG_production", GenericProductionActor.class);
		productionNodes2pattern.put("MotherToInsuranceClient__TRG_production", "MotherToInsuranceClient__TRG");
		classes.put("MotherToInsuranceClient_mother_daughters_incoming_SRC__FILTER_NAC_SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("MotherToInsuranceClient_mother_daughters_incoming_SRC__FILTER_NAC_SRC_production", "MotherToInsuranceClient_mother_daughters_incoming_SRC__FILTER_NAC_SRC");
		classes.put("MotherToInsuranceClient_mother_father_incoming_SRC__FILTER_NAC_SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("MotherToInsuranceClient_mother_father_incoming_SRC__FILTER_NAC_SRC_production", "MotherToInsuranceClient_mother_father_incoming_SRC__FILTER_NAC_SRC");
		classes.put("MotherToInsuranceClient_mother_sons_incoming_SRC__FILTER_NAC_SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("MotherToInsuranceClient_mother_sons_incoming_SRC__FILTER_NAC_SRC_production", "MotherToInsuranceClient_mother_sons_incoming_SRC__FILTER_NAC_SRC");
		classes.put("SonToInsuranceClient__BWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("SonToInsuranceClient__BWD_production", "SonToInsuranceClient__BWD");
		classes.put("SonToInsuranceClient__CC_production", GenericProductionActor.class);
		productionNodes2pattern.put("SonToInsuranceClient__CC_production", "SonToInsuranceClient__CC");
		classes.put("SonToInsuranceClient__CONSISTENCY_production", GenericProductionActor.class);
		productionNodes2pattern.put("SonToInsuranceClient__CONSISTENCY_production", "SonToInsuranceClient__CONSISTENCY");
		classes.put("SonToInsuranceClient__FWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("SonToInsuranceClient__FWD_production", "SonToInsuranceClient__FWD");
		classes.put("SonToInsuranceClient__SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("SonToInsuranceClient__SRC_production", "SonToInsuranceClient__SRC");
		classes.put("SonToInsuranceClient__TRG_production", GenericProductionActor.class);
		productionNodes2pattern.put("SonToInsuranceClient__TRG_production", "SonToInsuranceClient__TRG");
		classes.put("SonToInsuranceClient_son_daughters_incoming_SRC__FILTER_NAC_SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("SonToInsuranceClient_son_daughters_incoming_SRC__FILTER_NAC_SRC_production", "SonToInsuranceClient_son_daughters_incoming_SRC__FILTER_NAC_SRC");
		classes.put("SonToInsuranceClient_son_father_incoming_SRC__FILTER_NAC_SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("SonToInsuranceClient_son_father_incoming_SRC__FILTER_NAC_SRC_production", "SonToInsuranceClient_son_father_incoming_SRC__FILTER_NAC_SRC");
		classes.put("SonToInsuranceClient_son_mother_incoming_SRC__FILTER_NAC_SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("SonToInsuranceClient_son_mother_incoming_SRC__FILTER_NAC_SRC_production", "SonToInsuranceClient_son_mother_incoming_SRC__FILTER_NAC_SRC");
		
	}
	
	@Override
	public void createJunctionNodes() {
		classes.put("DaughterToInsuranceClient__TRG_1_localSearch", DaughterToInsuranceClient__TRG_1_localSearch.class);
		classes.put("DaughterToInsuranceClient__BWD_4_localSearch", DaughterToInsuranceClient__BWD_4_localSearch.class);
		classes.put("DaughterToInsuranceClient_daughter_sons_incoming_SRC__FILTER_NAC_SRC_8_localSearch", DaughterToInsuranceClient_daughter_sons_incoming_SRC__FILTER_NAC_SRC_8_localSearch.class);
		classes.put("DaughterToInsuranceClient_daughter_father_incoming_SRC__FILTER_NAC_SRC_11_localSearch", DaughterToInsuranceClient_daughter_father_incoming_SRC__FILTER_NAC_SRC_11_localSearch.class);
		classes.put("DaughterToInsuranceClient_daughter_mother_incoming_SRC__FILTER_NAC_SRC_14_localSearch", DaughterToInsuranceClient_daughter_mother_incoming_SRC__FILTER_NAC_SRC_14_localSearch.class);
		classes.put("DaughterToInsuranceClient__CC_17_localSearch", DaughterToInsuranceClient__CC_17_localSearch.class);
		classes.put("DaughterToInsuranceClient__SRC_24_localSearch", DaughterToInsuranceClient__SRC_24_localSearch.class);
		classes.put("DaughterToInsuranceClient__FWD_28_localSearch", DaughterToInsuranceClient__FWD_28_localSearch.class);
		classes.put("DaughterToInsuranceClient__CONSISTENCY_31_localSearch", DaughterToInsuranceClient__CONSISTENCY_31_localSearch.class);
		classes.put("FamilyRegisterToInsuranceDatabase__CC_36_junction", GenericJunctionActor.class);
		classes.put("FamilyRegisterToInsuranceDatabase__CONSISTENCY_40_localSearch", FamilyRegisterToInsuranceDatabase__CONSISTENCY_40_localSearch.class);
		classes.put("FatherNewFamilyToNewInsuranceClient__TRG_43_localSearch", FatherNewFamilyToNewInsuranceClient__TRG_43_localSearch.class);
		classes.put("FatherNewFamilyToNewInsuranceClient__BWD_46_localSearch", FatherNewFamilyToNewInsuranceClient__BWD_46_localSearch.class);
		classes.put("FatherNewFamilyToNewInsuranceClient_father_sons_incoming_SRC__FILTER_NAC_SRC_49_localSearch", FatherNewFamilyToNewInsuranceClient_father_sons_incoming_SRC__FILTER_NAC_SRC_49_localSearch.class);
		classes.put("FatherNewFamilyToNewInsuranceClient_father_daughters_incoming_SRC__FILTER_NAC_SRC_52_localSearch", FatherNewFamilyToNewInsuranceClient_father_daughters_incoming_SRC__FILTER_NAC_SRC_52_localSearch.class);
		classes.put("FatherNewFamilyToNewInsuranceClient_father_mother_incoming_SRC__FILTER_NAC_SRC_55_localSearch", FatherNewFamilyToNewInsuranceClient_father_mother_incoming_SRC__FILTER_NAC_SRC_55_localSearch.class);
		classes.put("FatherNewFamilyToNewInsuranceClient__CC_58_localSearch", FatherNewFamilyToNewInsuranceClient__CC_58_localSearch.class);
		classes.put("FatherNewFamilyToNewInsuranceClient__SRC_65_localSearch", FatherNewFamilyToNewInsuranceClient__SRC_65_localSearch.class);
		classes.put("FatherNewFamilyToNewInsuranceClient__FWD_69_localSearch", FatherNewFamilyToNewInsuranceClient__FWD_69_localSearch.class);
		classes.put("FatherNewFamilyToNewInsuranceClient__CONSISTENCY_72_localSearch", FatherNewFamilyToNewInsuranceClient__CONSISTENCY_72_localSearch.class);
		classes.put("FatherToInsuranceClient__TRG_76_localSearch", FatherToInsuranceClient__TRG_76_localSearch.class);
		classes.put("FatherToInsuranceClient__BWD_79_localSearch", FatherToInsuranceClient__BWD_79_localSearch.class);
		classes.put("FatherToInsuranceClient_father_sons_incoming_SRC__FILTER_NAC_SRC_83_localSearch", FatherToInsuranceClient_father_sons_incoming_SRC__FILTER_NAC_SRC_83_localSearch.class);
		classes.put("FatherToInsuranceClient_father_daughters_incoming_SRC__FILTER_NAC_SRC_86_localSearch", FatherToInsuranceClient_father_daughters_incoming_SRC__FILTER_NAC_SRC_86_localSearch.class);
		classes.put("FatherToInsuranceClient_father_mother_incoming_SRC__FILTER_NAC_SRC_89_localSearch", FatherToInsuranceClient_father_mother_incoming_SRC__FILTER_NAC_SRC_89_localSearch.class);
		classes.put("FatherToInsuranceClient__CC_92_localSearch", FatherToInsuranceClient__CC_92_localSearch.class);
		classes.put("FatherToInsuranceClient__SRC_99_localSearch", FatherToInsuranceClient__SRC_99_localSearch.class);
		classes.put("FatherToInsuranceClient__FWD_103_localSearch", FatherToInsuranceClient__FWD_103_localSearch.class);
		classes.put("FatherToInsuranceClient__CONSISTENCY_106_localSearch", FatherToInsuranceClient__CONSISTENCY_106_localSearch.class);
		classes.put("MotherNewFamilyToNewInsuranceClient__TRG_110_localSearch", MotherNewFamilyToNewInsuranceClient__TRG_110_localSearch.class);
		classes.put("MotherNewFamilyToNewInsuranceClient__BWD_113_localSearch", MotherNewFamilyToNewInsuranceClient__BWD_113_localSearch.class);
		classes.put("MotherNewFamilyToNewInsuranceClient_mother_sons_incoming_SRC__FILTER_NAC_SRC_116_localSearch", MotherNewFamilyToNewInsuranceClient_mother_sons_incoming_SRC__FILTER_NAC_SRC_116_localSearch.class);
		classes.put("MotherNewFamilyToNewInsuranceClient_mother_daughters_incoming_SRC__FILTER_NAC_SRC_119_localSearch", MotherNewFamilyToNewInsuranceClient_mother_daughters_incoming_SRC__FILTER_NAC_SRC_119_localSearch.class);
		classes.put("MotherNewFamilyToNewInsuranceClient_mother_father_incoming_SRC__FILTER_NAC_SRC_122_localSearch", MotherNewFamilyToNewInsuranceClient_mother_father_incoming_SRC__FILTER_NAC_SRC_122_localSearch.class);
		classes.put("MotherNewFamilyToNewInsuranceClient__CC_125_localSearch", MotherNewFamilyToNewInsuranceClient__CC_125_localSearch.class);
		classes.put("MotherNewFamilyToNewInsuranceClient__SRC_132_localSearch", MotherNewFamilyToNewInsuranceClient__SRC_132_localSearch.class);
		classes.put("MotherNewFamilyToNewInsuranceClient__FWD_136_localSearch", MotherNewFamilyToNewInsuranceClient__FWD_136_localSearch.class);
		classes.put("MotherNewFamilyToNewInsuranceClient__CONSISTENCY_139_localSearch", MotherNewFamilyToNewInsuranceClient__CONSISTENCY_139_localSearch.class);
		classes.put("MotherToInsuranceClient__TRG_143_localSearch", MotherToInsuranceClient__TRG_143_localSearch.class);
		classes.put("MotherToInsuranceClient__BWD_146_localSearch", MotherToInsuranceClient__BWD_146_localSearch.class);
		classes.put("MotherToInsuranceClient_mother_sons_incoming_SRC__FILTER_NAC_SRC_150_localSearch", MotherToInsuranceClient_mother_sons_incoming_SRC__FILTER_NAC_SRC_150_localSearch.class);
		classes.put("MotherToInsuranceClient_mother_daughters_incoming_SRC__FILTER_NAC_SRC_153_localSearch", MotherToInsuranceClient_mother_daughters_incoming_SRC__FILTER_NAC_SRC_153_localSearch.class);
		classes.put("MotherToInsuranceClient_mother_father_incoming_SRC__FILTER_NAC_SRC_156_localSearch", MotherToInsuranceClient_mother_father_incoming_SRC__FILTER_NAC_SRC_156_localSearch.class);
		classes.put("MotherToInsuranceClient__CC_159_localSearch", MotherToInsuranceClient__CC_159_localSearch.class);
		classes.put("MotherToInsuranceClient__SRC_166_localSearch", MotherToInsuranceClient__SRC_166_localSearch.class);
		classes.put("MotherToInsuranceClient__FWD_170_localSearch", MotherToInsuranceClient__FWD_170_localSearch.class);
		classes.put("MotherToInsuranceClient__CONSISTENCY_173_localSearch", MotherToInsuranceClient__CONSISTENCY_173_localSearch.class);
		classes.put("SonToInsuranceClient__TRG_177_localSearch", SonToInsuranceClient__TRG_177_localSearch.class);
		classes.put("SonToInsuranceClient__BWD_180_localSearch", SonToInsuranceClient__BWD_180_localSearch.class);
		classes.put("SonToInsuranceClient_son_daughters_incoming_SRC__FILTER_NAC_SRC_184_localSearch", SonToInsuranceClient_son_daughters_incoming_SRC__FILTER_NAC_SRC_184_localSearch.class);
		classes.put("SonToInsuranceClient_son_father_incoming_SRC__FILTER_NAC_SRC_187_localSearch", SonToInsuranceClient_son_father_incoming_SRC__FILTER_NAC_SRC_187_localSearch.class);
		classes.put("SonToInsuranceClient_son_mother_incoming_SRC__FILTER_NAC_SRC_190_localSearch", SonToInsuranceClient_son_mother_incoming_SRC__FILTER_NAC_SRC_190_localSearch.class);
		classes.put("SonToInsuranceClient__CC_193_localSearch", SonToInsuranceClient__CC_193_localSearch.class);
		classes.put("SonToInsuranceClient__SRC_200_localSearch", SonToInsuranceClient__SRC_200_localSearch.class);
		classes.put("SonToInsuranceClient__FWD_204_localSearch", SonToInsuranceClient__FWD_204_localSearch.class);
		classes.put("SonToInsuranceClient__CONSISTENCY_207_localSearch", SonToInsuranceClient__CONSISTENCY_207_localSearch.class);
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
		classes.put("Family_object_SP7",Family_object_SP7.class);
		classes.put("Family_object_SP8",Family_object_SP8.class);
		classes.put("FamilyRegister_object_SP0",FamilyRegister_object_SP0.class);
		classes.put("FamilyRegister_object_SP1",FamilyRegister_object_SP1.class);
		classes.put("FamilyRegister_object_SP2",FamilyRegister_object_SP2.class);
		classes.put("FamilyRegister_object_SP3",FamilyRegister_object_SP3.class);
		classes.put("FamilyRegister_object_SP4",FamilyRegister_object_SP4.class);
		classes.put("FamilyRegister_object_SP5",FamilyRegister_object_SP5.class);
		classes.put("FamilyRegisterToInsuranceDatabase_object_SP0",FamilyRegisterToInsuranceDatabase_object_SP0.class);
		classes.put("FamilyRegisterToInsuranceDatabase_object_SP1",FamilyRegisterToInsuranceDatabase_object_SP1.class);
		classes.put("FamilyRegisterToInsuranceDatabase_object_SP2",FamilyRegisterToInsuranceDatabase_object_SP2.class);
		classes.put("FamilyRegisterToInsuranceDatabase_object_SP3",FamilyRegisterToInsuranceDatabase_object_SP3.class);
		classes.put("FamilyRegisterToInsuranceDatabase_object_SP4",FamilyRegisterToInsuranceDatabase_object_SP4.class);
		classes.put("InsuranceDatabase_object_SP0",InsuranceDatabase_object_SP0.class);
		classes.put("InsuranceDatabase_object_SP1",InsuranceDatabase_object_SP1.class);
		classes.put("InsuranceDatabase_object_SP2",InsuranceDatabase_object_SP2.class);
		classes.put("InsuranceDatabase_object_SP3",InsuranceDatabase_object_SP3.class);
		classes.put("InsuranceDatabase_object_SP4",InsuranceDatabase_object_SP4.class);
		classes.put("InsuranceDatabase_object_SP5",InsuranceDatabase_object_SP5.class);
		classes.put("InsuranceClient_object_SP0",InsuranceClient_object_SP0.class);
		classes.put("InsuranceClient_object_SP1",InsuranceClient_object_SP1.class);
		classes.put("InsuranceClient_object_SP2",InsuranceClient_object_SP2.class);
		classes.put("Member_object_SP0",Member_object_SP0.class);
		classes.put("Member_object_SP1",Member_object_SP1.class);
		classes.put("Member_object_SP2",Member_object_SP2.class);
		classes.put("Member_object_SP3",Member_object_SP3.class);
		classes.put("Member_object_SP4",Member_object_SP4.class);
		classes.put("Member_object_SP5",Member_object_SP5.class);
		classes.put("Member_object_SP6",Member_object_SP6.class);
		classes.put("Member_object_SP7",Member_object_SP7.class);
		classes.put("FamilyToInsuranceClient_object_SP0",FamilyToInsuranceClient_object_SP0.class);
		classes.put("FamilyToInsuranceClient_object_SP1",FamilyToInsuranceClient_object_SP1.class);
		classes.put("MemberToInsuranceClient_object_SP0",MemberToInsuranceClient_object_SP0.class);
		classes.put("MemberToInsuranceClient_object_SP1",MemberToInsuranceClient_object_SP1.class);
		
	}
	
	@Override
	public void initializeReferenceNodes() {
	}
}

class DaughterToInsuranceClient__Marker_object extends GenericObjectActor<Families2Insurance.DaughterToInsuranceClient__Marker> { }
class FamilyRegisterToInsuranceDatabase__Marker_object extends GenericObjectActor<Families2Insurance.FamilyRegisterToInsuranceDatabase__Marker> { }
class FatherNewFamilyToNewInsuranceClient__Marker_object extends GenericObjectActor<Families2Insurance.FatherNewFamilyToNewInsuranceClient__Marker> { }
class FatherToInsuranceClient__Marker_object extends GenericObjectActor<Families2Insurance.FatherToInsuranceClient__Marker> { }
class MotherNewFamilyToNewInsuranceClient__Marker_object extends GenericObjectActor<Families2Insurance.MotherNewFamilyToNewInsuranceClient__Marker> { }
class MotherToInsuranceClient__Marker_object extends GenericObjectActor<Families2Insurance.MotherToInsuranceClient__Marker> { }
class SonToInsuranceClient__Marker_object extends GenericObjectActor<Families2Insurance.SonToInsuranceClient__Marker> { }
class Family_object_SP0 extends GenericObjectActor<edu.kit.ipd.sdq.metamodels.families.Family> { }
class Family_object_SP1 extends GenericObjectActor<edu.kit.ipd.sdq.metamodels.families.Family> { }
class Family_object_SP2 extends GenericObjectActor<edu.kit.ipd.sdq.metamodels.families.Family> { }
class Family_object_SP3 extends GenericObjectActor<edu.kit.ipd.sdq.metamodels.families.Family> { }
class Family_object_SP4 extends GenericObjectActor<edu.kit.ipd.sdq.metamodels.families.Family> { }
class Family_object_SP5 extends GenericObjectActor<edu.kit.ipd.sdq.metamodels.families.Family> { }
class Family_object_SP6 extends GenericObjectActor<edu.kit.ipd.sdq.metamodels.families.Family> { }
class Family_object_SP7 extends GenericObjectActor<edu.kit.ipd.sdq.metamodels.families.Family> { }
class Family_object_SP8 extends GenericObjectActor<edu.kit.ipd.sdq.metamodels.families.Family> { }
class FamilyRegister_object_SP0 extends GenericObjectActor<edu.kit.ipd.sdq.metamodels.families.FamilyRegister> { }
class FamilyRegister_object_SP1 extends GenericObjectActor<edu.kit.ipd.sdq.metamodels.families.FamilyRegister> { }
class FamilyRegister_object_SP2 extends GenericObjectActor<edu.kit.ipd.sdq.metamodels.families.FamilyRegister> { }
class FamilyRegister_object_SP3 extends GenericObjectActor<edu.kit.ipd.sdq.metamodels.families.FamilyRegister> { }
class FamilyRegister_object_SP4 extends GenericObjectActor<edu.kit.ipd.sdq.metamodels.families.FamilyRegister> { }
class FamilyRegister_object_SP5 extends GenericObjectActor<edu.kit.ipd.sdq.metamodels.families.FamilyRegister> { }
class FamilyRegisterToInsuranceDatabase_object_SP0 extends GenericObjectActor<Families2Insurance.FamilyRegisterToInsuranceDatabase> { }
class FamilyRegisterToInsuranceDatabase_object_SP1 extends GenericObjectActor<Families2Insurance.FamilyRegisterToInsuranceDatabase> { }
class FamilyRegisterToInsuranceDatabase_object_SP2 extends GenericObjectActor<Families2Insurance.FamilyRegisterToInsuranceDatabase> { }
class FamilyRegisterToInsuranceDatabase_object_SP3 extends GenericObjectActor<Families2Insurance.FamilyRegisterToInsuranceDatabase> { }
class FamilyRegisterToInsuranceDatabase_object_SP4 extends GenericObjectActor<Families2Insurance.FamilyRegisterToInsuranceDatabase> { }
class InsuranceDatabase_object_SP0 extends GenericObjectActor<edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase> { }
class InsuranceDatabase_object_SP1 extends GenericObjectActor<edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase> { }
class InsuranceDatabase_object_SP2 extends GenericObjectActor<edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase> { }
class InsuranceDatabase_object_SP3 extends GenericObjectActor<edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase> { }
class InsuranceDatabase_object_SP4 extends GenericObjectActor<edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase> { }
class InsuranceDatabase_object_SP5 extends GenericObjectActor<edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase> { }
class InsuranceClient_object_SP0 extends GenericObjectActor<edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient> { }
class InsuranceClient_object_SP1 extends GenericObjectActor<edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient> { }
class InsuranceClient_object_SP2 extends GenericObjectActor<edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient> { }
class Member_object_SP0 extends GenericObjectActor<edu.kit.ipd.sdq.metamodels.families.Member> { }
class Member_object_SP1 extends GenericObjectActor<edu.kit.ipd.sdq.metamodels.families.Member> { }
class Member_object_SP2 extends GenericObjectActor<edu.kit.ipd.sdq.metamodels.families.Member> { }
class Member_object_SP3 extends GenericObjectActor<edu.kit.ipd.sdq.metamodels.families.Member> { }
class Member_object_SP4 extends GenericObjectActor<edu.kit.ipd.sdq.metamodels.families.Member> { }
class Member_object_SP5 extends GenericObjectActor<edu.kit.ipd.sdq.metamodels.families.Member> { }
class Member_object_SP6 extends GenericObjectActor<edu.kit.ipd.sdq.metamodels.families.Member> { }
class Member_object_SP7 extends GenericObjectActor<edu.kit.ipd.sdq.metamodels.families.Member> { }
class FamilyToInsuranceClient_object_SP0 extends GenericObjectActor<Families2Insurance.FamilyToInsuranceClient> { }
class FamilyToInsuranceClient_object_SP1 extends GenericObjectActor<Families2Insurance.FamilyToInsuranceClient> { }
class MemberToInsuranceClient_object_SP0 extends GenericObjectActor<Families2Insurance.MemberToInsuranceClient> { }
class MemberToInsuranceClient_object_SP1 extends GenericObjectActor<Families2Insurance.MemberToInsuranceClient> { }


