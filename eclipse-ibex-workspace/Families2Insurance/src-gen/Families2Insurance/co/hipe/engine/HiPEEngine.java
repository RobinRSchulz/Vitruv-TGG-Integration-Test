package Families2Insurance.co.hipe.engine;

import akka.actor.ActorRef;
import akka.actor.Props;

import Families2Insurance.co.hipe.engine.actor.NotificationActor;
import Families2Insurance.co.hipe.engine.actor.DispatchActor;
import Families2Insurance.co.hipe.engine.actor.localsearch.DaughterToInsuranceClient_daughter_sons_incoming_SRC__FILTER_NAC_SRC_1_localSearch;
import Families2Insurance.co.hipe.engine.actor.localsearch.DaughterToInsuranceClient_daughter_father_incoming_SRC__FILTER_NAC_SRC_4_localSearch;
import Families2Insurance.co.hipe.engine.actor.localsearch.DaughterToInsuranceClient_daughter_mother_incoming_SRC__FILTER_NAC_SRC_7_localSearch;
import Families2Insurance.co.hipe.engine.actor.localsearch.DaughterToInsuranceClient__CC_10_localSearch;
import Families2Insurance.co.hipe.engine.actor.localsearch.FatherNewFamilyToNewInsuranceClient_father_sons_incoming_SRC__FILTER_NAC_SRC_20_localSearch;
import Families2Insurance.co.hipe.engine.actor.localsearch.FatherNewFamilyToNewInsuranceClient_father_daughters_incoming_SRC__FILTER_NAC_SRC_23_localSearch;
import Families2Insurance.co.hipe.engine.actor.localsearch.FatherNewFamilyToNewInsuranceClient_father_mother_incoming_SRC__FILTER_NAC_SRC_26_localSearch;
import Families2Insurance.co.hipe.engine.actor.localsearch.FatherNewFamilyToNewInsuranceClient__CC_29_localSearch;
import Families2Insurance.co.hipe.engine.actor.localsearch.FatherToInsuranceClient_father_sons_incoming_SRC__FILTER_NAC_SRC_36_localSearch;
import Families2Insurance.co.hipe.engine.actor.localsearch.FatherToInsuranceClient_father_daughters_incoming_SRC__FILTER_NAC_SRC_39_localSearch;
import Families2Insurance.co.hipe.engine.actor.localsearch.FatherToInsuranceClient_father_mother_incoming_SRC__FILTER_NAC_SRC_42_localSearch;
import Families2Insurance.co.hipe.engine.actor.localsearch.FatherToInsuranceClient__CC_45_localSearch;
import Families2Insurance.co.hipe.engine.actor.localsearch.MotherNewFamilyToNewInsuranceClient_mother_sons_incoming_SRC__FILTER_NAC_SRC_52_localSearch;
import Families2Insurance.co.hipe.engine.actor.localsearch.MotherNewFamilyToNewInsuranceClient_mother_daughters_incoming_SRC__FILTER_NAC_SRC_55_localSearch;
import Families2Insurance.co.hipe.engine.actor.localsearch.MotherNewFamilyToNewInsuranceClient_mother_father_incoming_SRC__FILTER_NAC_SRC_58_localSearch;
import Families2Insurance.co.hipe.engine.actor.localsearch.MotherNewFamilyToNewInsuranceClient__CC_61_localSearch;
import Families2Insurance.co.hipe.engine.actor.localsearch.MotherToInsuranceClient_mother_sons_incoming_SRC__FILTER_NAC_SRC_68_localSearch;
import Families2Insurance.co.hipe.engine.actor.localsearch.MotherToInsuranceClient_mother_daughters_incoming_SRC__FILTER_NAC_SRC_71_localSearch;
import Families2Insurance.co.hipe.engine.actor.localsearch.MotherToInsuranceClient_mother_father_incoming_SRC__FILTER_NAC_SRC_74_localSearch;
import Families2Insurance.co.hipe.engine.actor.localsearch.MotherToInsuranceClient__CC_77_localSearch;
import Families2Insurance.co.hipe.engine.actor.localsearch.SonToInsuranceClient_son_daughters_incoming_SRC__FILTER_NAC_SRC_84_localSearch;
import Families2Insurance.co.hipe.engine.actor.localsearch.SonToInsuranceClient_son_father_incoming_SRC__FILTER_NAC_SRC_87_localSearch;
import Families2Insurance.co.hipe.engine.actor.localsearch.SonToInsuranceClient_son_mother_incoming_SRC__FILTER_NAC_SRC_90_localSearch;
import Families2Insurance.co.hipe.engine.actor.localsearch.SonToInsuranceClient__CC_93_localSearch;

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
		classes.put("DaughterToInsuranceClient__CC_production", GenericProductionActor.class);
		productionNodes2pattern.put("DaughterToInsuranceClient__CC_production", "DaughterToInsuranceClient__CC");
		classes.put("DaughterToInsuranceClient_daughter_father_incoming_SRC__FILTER_NAC_SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("DaughterToInsuranceClient_daughter_father_incoming_SRC__FILTER_NAC_SRC_production", "DaughterToInsuranceClient_daughter_father_incoming_SRC__FILTER_NAC_SRC");
		classes.put("DaughterToInsuranceClient_daughter_mother_incoming_SRC__FILTER_NAC_SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("DaughterToInsuranceClient_daughter_mother_incoming_SRC__FILTER_NAC_SRC_production", "DaughterToInsuranceClient_daughter_mother_incoming_SRC__FILTER_NAC_SRC");
		classes.put("DaughterToInsuranceClient_daughter_sons_incoming_SRC__FILTER_NAC_SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("DaughterToInsuranceClient_daughter_sons_incoming_SRC__FILTER_NAC_SRC_production", "DaughterToInsuranceClient_daughter_sons_incoming_SRC__FILTER_NAC_SRC");
		classes.put("FamilyRegisterToInsuranceDatabase__CC_production", GenericProductionActor.class);
		productionNodes2pattern.put("FamilyRegisterToInsuranceDatabase__CC_production", "FamilyRegisterToInsuranceDatabase__CC");
		classes.put("FatherNewFamilyToNewInsuranceClient__CC_production", GenericProductionActor.class);
		productionNodes2pattern.put("FatherNewFamilyToNewInsuranceClient__CC_production", "FatherNewFamilyToNewInsuranceClient__CC");
		classes.put("FatherNewFamilyToNewInsuranceClient_father_daughters_incoming_SRC__FILTER_NAC_SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("FatherNewFamilyToNewInsuranceClient_father_daughters_incoming_SRC__FILTER_NAC_SRC_production", "FatherNewFamilyToNewInsuranceClient_father_daughters_incoming_SRC__FILTER_NAC_SRC");
		classes.put("FatherNewFamilyToNewInsuranceClient_father_mother_incoming_SRC__FILTER_NAC_SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("FatherNewFamilyToNewInsuranceClient_father_mother_incoming_SRC__FILTER_NAC_SRC_production", "FatherNewFamilyToNewInsuranceClient_father_mother_incoming_SRC__FILTER_NAC_SRC");
		classes.put("FatherNewFamilyToNewInsuranceClient_father_sons_incoming_SRC__FILTER_NAC_SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("FatherNewFamilyToNewInsuranceClient_father_sons_incoming_SRC__FILTER_NAC_SRC_production", "FatherNewFamilyToNewInsuranceClient_father_sons_incoming_SRC__FILTER_NAC_SRC");
		classes.put("FatherToInsuranceClient__CC_production", GenericProductionActor.class);
		productionNodes2pattern.put("FatherToInsuranceClient__CC_production", "FatherToInsuranceClient__CC");
		classes.put("FatherToInsuranceClient_father_daughters_incoming_SRC__FILTER_NAC_SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("FatherToInsuranceClient_father_daughters_incoming_SRC__FILTER_NAC_SRC_production", "FatherToInsuranceClient_father_daughters_incoming_SRC__FILTER_NAC_SRC");
		classes.put("FatherToInsuranceClient_father_mother_incoming_SRC__FILTER_NAC_SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("FatherToInsuranceClient_father_mother_incoming_SRC__FILTER_NAC_SRC_production", "FatherToInsuranceClient_father_mother_incoming_SRC__FILTER_NAC_SRC");
		classes.put("FatherToInsuranceClient_father_sons_incoming_SRC__FILTER_NAC_SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("FatherToInsuranceClient_father_sons_incoming_SRC__FILTER_NAC_SRC_production", "FatherToInsuranceClient_father_sons_incoming_SRC__FILTER_NAC_SRC");
		classes.put("MotherNewFamilyToNewInsuranceClient__CC_production", GenericProductionActor.class);
		productionNodes2pattern.put("MotherNewFamilyToNewInsuranceClient__CC_production", "MotherNewFamilyToNewInsuranceClient__CC");
		classes.put("MotherNewFamilyToNewInsuranceClient_mother_daughters_incoming_SRC__FILTER_NAC_SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("MotherNewFamilyToNewInsuranceClient_mother_daughters_incoming_SRC__FILTER_NAC_SRC_production", "MotherNewFamilyToNewInsuranceClient_mother_daughters_incoming_SRC__FILTER_NAC_SRC");
		classes.put("MotherNewFamilyToNewInsuranceClient_mother_father_incoming_SRC__FILTER_NAC_SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("MotherNewFamilyToNewInsuranceClient_mother_father_incoming_SRC__FILTER_NAC_SRC_production", "MotherNewFamilyToNewInsuranceClient_mother_father_incoming_SRC__FILTER_NAC_SRC");
		classes.put("MotherNewFamilyToNewInsuranceClient_mother_sons_incoming_SRC__FILTER_NAC_SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("MotherNewFamilyToNewInsuranceClient_mother_sons_incoming_SRC__FILTER_NAC_SRC_production", "MotherNewFamilyToNewInsuranceClient_mother_sons_incoming_SRC__FILTER_NAC_SRC");
		classes.put("MotherToInsuranceClient__CC_production", GenericProductionActor.class);
		productionNodes2pattern.put("MotherToInsuranceClient__CC_production", "MotherToInsuranceClient__CC");
		classes.put("MotherToInsuranceClient_mother_daughters_incoming_SRC__FILTER_NAC_SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("MotherToInsuranceClient_mother_daughters_incoming_SRC__FILTER_NAC_SRC_production", "MotherToInsuranceClient_mother_daughters_incoming_SRC__FILTER_NAC_SRC");
		classes.put("MotherToInsuranceClient_mother_father_incoming_SRC__FILTER_NAC_SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("MotherToInsuranceClient_mother_father_incoming_SRC__FILTER_NAC_SRC_production", "MotherToInsuranceClient_mother_father_incoming_SRC__FILTER_NAC_SRC");
		classes.put("MotherToInsuranceClient_mother_sons_incoming_SRC__FILTER_NAC_SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("MotherToInsuranceClient_mother_sons_incoming_SRC__FILTER_NAC_SRC_production", "MotherToInsuranceClient_mother_sons_incoming_SRC__FILTER_NAC_SRC");
		classes.put("SonToInsuranceClient__CC_production", GenericProductionActor.class);
		productionNodes2pattern.put("SonToInsuranceClient__CC_production", "SonToInsuranceClient__CC");
		classes.put("SonToInsuranceClient_son_daughters_incoming_SRC__FILTER_NAC_SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("SonToInsuranceClient_son_daughters_incoming_SRC__FILTER_NAC_SRC_production", "SonToInsuranceClient_son_daughters_incoming_SRC__FILTER_NAC_SRC");
		classes.put("SonToInsuranceClient_son_father_incoming_SRC__FILTER_NAC_SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("SonToInsuranceClient_son_father_incoming_SRC__FILTER_NAC_SRC_production", "SonToInsuranceClient_son_father_incoming_SRC__FILTER_NAC_SRC");
		classes.put("SonToInsuranceClient_son_mother_incoming_SRC__FILTER_NAC_SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("SonToInsuranceClient_son_mother_incoming_SRC__FILTER_NAC_SRC_production", "SonToInsuranceClient_son_mother_incoming_SRC__FILTER_NAC_SRC");
		
	}
	
	@Override
	public void createJunctionNodes() {
		classes.put("DaughterToInsuranceClient_daughter_sons_incoming_SRC__FILTER_NAC_SRC_1_localSearch", DaughterToInsuranceClient_daughter_sons_incoming_SRC__FILTER_NAC_SRC_1_localSearch.class);
		classes.put("DaughterToInsuranceClient_daughter_father_incoming_SRC__FILTER_NAC_SRC_4_localSearch", DaughterToInsuranceClient_daughter_father_incoming_SRC__FILTER_NAC_SRC_4_localSearch.class);
		classes.put("DaughterToInsuranceClient_daughter_mother_incoming_SRC__FILTER_NAC_SRC_7_localSearch", DaughterToInsuranceClient_daughter_mother_incoming_SRC__FILTER_NAC_SRC_7_localSearch.class);
		classes.put("DaughterToInsuranceClient__CC_10_localSearch", DaughterToInsuranceClient__CC_10_localSearch.class);
		classes.put("FamilyRegisterToInsuranceDatabase__CC_17_junction", GenericJunctionActor.class);
		classes.put("FatherNewFamilyToNewInsuranceClient_father_sons_incoming_SRC__FILTER_NAC_SRC_20_localSearch", FatherNewFamilyToNewInsuranceClient_father_sons_incoming_SRC__FILTER_NAC_SRC_20_localSearch.class);
		classes.put("FatherNewFamilyToNewInsuranceClient_father_daughters_incoming_SRC__FILTER_NAC_SRC_23_localSearch", FatherNewFamilyToNewInsuranceClient_father_daughters_incoming_SRC__FILTER_NAC_SRC_23_localSearch.class);
		classes.put("FatherNewFamilyToNewInsuranceClient_father_mother_incoming_SRC__FILTER_NAC_SRC_26_localSearch", FatherNewFamilyToNewInsuranceClient_father_mother_incoming_SRC__FILTER_NAC_SRC_26_localSearch.class);
		classes.put("FatherNewFamilyToNewInsuranceClient__CC_29_localSearch", FatherNewFamilyToNewInsuranceClient__CC_29_localSearch.class);
		classes.put("FatherToInsuranceClient_father_sons_incoming_SRC__FILTER_NAC_SRC_36_localSearch", FatherToInsuranceClient_father_sons_incoming_SRC__FILTER_NAC_SRC_36_localSearch.class);
		classes.put("FatherToInsuranceClient_father_daughters_incoming_SRC__FILTER_NAC_SRC_39_localSearch", FatherToInsuranceClient_father_daughters_incoming_SRC__FILTER_NAC_SRC_39_localSearch.class);
		classes.put("FatherToInsuranceClient_father_mother_incoming_SRC__FILTER_NAC_SRC_42_localSearch", FatherToInsuranceClient_father_mother_incoming_SRC__FILTER_NAC_SRC_42_localSearch.class);
		classes.put("FatherToInsuranceClient__CC_45_localSearch", FatherToInsuranceClient__CC_45_localSearch.class);
		classes.put("MotherNewFamilyToNewInsuranceClient_mother_sons_incoming_SRC__FILTER_NAC_SRC_52_localSearch", MotherNewFamilyToNewInsuranceClient_mother_sons_incoming_SRC__FILTER_NAC_SRC_52_localSearch.class);
		classes.put("MotherNewFamilyToNewInsuranceClient_mother_daughters_incoming_SRC__FILTER_NAC_SRC_55_localSearch", MotherNewFamilyToNewInsuranceClient_mother_daughters_incoming_SRC__FILTER_NAC_SRC_55_localSearch.class);
		classes.put("MotherNewFamilyToNewInsuranceClient_mother_father_incoming_SRC__FILTER_NAC_SRC_58_localSearch", MotherNewFamilyToNewInsuranceClient_mother_father_incoming_SRC__FILTER_NAC_SRC_58_localSearch.class);
		classes.put("MotherNewFamilyToNewInsuranceClient__CC_61_localSearch", MotherNewFamilyToNewInsuranceClient__CC_61_localSearch.class);
		classes.put("MotherToInsuranceClient_mother_sons_incoming_SRC__FILTER_NAC_SRC_68_localSearch", MotherToInsuranceClient_mother_sons_incoming_SRC__FILTER_NAC_SRC_68_localSearch.class);
		classes.put("MotherToInsuranceClient_mother_daughters_incoming_SRC__FILTER_NAC_SRC_71_localSearch", MotherToInsuranceClient_mother_daughters_incoming_SRC__FILTER_NAC_SRC_71_localSearch.class);
		classes.put("MotherToInsuranceClient_mother_father_incoming_SRC__FILTER_NAC_SRC_74_localSearch", MotherToInsuranceClient_mother_father_incoming_SRC__FILTER_NAC_SRC_74_localSearch.class);
		classes.put("MotherToInsuranceClient__CC_77_localSearch", MotherToInsuranceClient__CC_77_localSearch.class);
		classes.put("SonToInsuranceClient_son_daughters_incoming_SRC__FILTER_NAC_SRC_84_localSearch", SonToInsuranceClient_son_daughters_incoming_SRC__FILTER_NAC_SRC_84_localSearch.class);
		classes.put("SonToInsuranceClient_son_father_incoming_SRC__FILTER_NAC_SRC_87_localSearch", SonToInsuranceClient_son_father_incoming_SRC__FILTER_NAC_SRC_87_localSearch.class);
		classes.put("SonToInsuranceClient_son_mother_incoming_SRC__FILTER_NAC_SRC_90_localSearch", SonToInsuranceClient_son_mother_incoming_SRC__FILTER_NAC_SRC_90_localSearch.class);
		classes.put("SonToInsuranceClient__CC_93_localSearch", SonToInsuranceClient__CC_93_localSearch.class);
	}
	
	@Override
	public void createReferenceNodes() {
		
	}
	
	@Override
	public void createObjectNodes() {
		classes.put("Family_object_SP0",Family_object_SP0.class);
		classes.put("Family_object_SP1",Family_object_SP1.class);
		classes.put("Family_object_SP2",Family_object_SP2.class);
		classes.put("Family_object_SP3",Family_object_SP3.class);
		classes.put("Family_object_SP4",Family_object_SP4.class);
		classes.put("Family_object_SP5",Family_object_SP5.class);
		classes.put("FamilyRegister_object_SP0",FamilyRegister_object_SP0.class);
		classes.put("FamilyRegister_object_SP1",FamilyRegister_object_SP1.class);
		classes.put("FamilyRegisterToInsuranceDatabase_object_SP0",FamilyRegisterToInsuranceDatabase_object_SP0.class);
		classes.put("FamilyRegisterToInsuranceDatabase_object_SP1",FamilyRegisterToInsuranceDatabase_object_SP1.class);
		classes.put("InsuranceDatabase_object_SP0",InsuranceDatabase_object_SP0.class);
		classes.put("InsuranceDatabase_object_SP1",InsuranceDatabase_object_SP1.class);
		classes.put("Member_object_SP0",Member_object_SP0.class);
		classes.put("Member_object_SP1",Member_object_SP1.class);
		classes.put("Member_object_SP2",Member_object_SP2.class);
		classes.put("Member_object_SP3",Member_object_SP3.class);
		classes.put("Member_object_SP4",Member_object_SP4.class);
		classes.put("Member_object_SP5",Member_object_SP5.class);
		classes.put("InsuranceClient_object_SP0",InsuranceClient_object_SP0.class);
		classes.put("InsuranceClient_object_SP1",InsuranceClient_object_SP1.class);
		
	}
	
	@Override
	public void initializeReferenceNodes() {
	}
}

class Family_object_SP0 extends GenericObjectActor<edu.kit.ipd.sdq.metamodels.families.Family> { }
class Family_object_SP1 extends GenericObjectActor<edu.kit.ipd.sdq.metamodels.families.Family> { }
class Family_object_SP2 extends GenericObjectActor<edu.kit.ipd.sdq.metamodels.families.Family> { }
class Family_object_SP3 extends GenericObjectActor<edu.kit.ipd.sdq.metamodels.families.Family> { }
class Family_object_SP4 extends GenericObjectActor<edu.kit.ipd.sdq.metamodels.families.Family> { }
class Family_object_SP5 extends GenericObjectActor<edu.kit.ipd.sdq.metamodels.families.Family> { }
class FamilyRegister_object_SP0 extends GenericObjectActor<edu.kit.ipd.sdq.metamodels.families.FamilyRegister> { }
class FamilyRegister_object_SP1 extends GenericObjectActor<edu.kit.ipd.sdq.metamodels.families.FamilyRegister> { }
class FamilyRegisterToInsuranceDatabase_object_SP0 extends GenericObjectActor<Families2Insurance.FamilyRegisterToInsuranceDatabase> { }
class FamilyRegisterToInsuranceDatabase_object_SP1 extends GenericObjectActor<Families2Insurance.FamilyRegisterToInsuranceDatabase> { }
class InsuranceDatabase_object_SP0 extends GenericObjectActor<edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase> { }
class InsuranceDatabase_object_SP1 extends GenericObjectActor<edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase> { }
class Member_object_SP0 extends GenericObjectActor<edu.kit.ipd.sdq.metamodels.families.Member> { }
class Member_object_SP1 extends GenericObjectActor<edu.kit.ipd.sdq.metamodels.families.Member> { }
class Member_object_SP2 extends GenericObjectActor<edu.kit.ipd.sdq.metamodels.families.Member> { }
class Member_object_SP3 extends GenericObjectActor<edu.kit.ipd.sdq.metamodels.families.Member> { }
class Member_object_SP4 extends GenericObjectActor<edu.kit.ipd.sdq.metamodels.families.Member> { }
class Member_object_SP5 extends GenericObjectActor<edu.kit.ipd.sdq.metamodels.families.Member> { }
class InsuranceClient_object_SP0 extends GenericObjectActor<edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient> { }
class InsuranceClient_object_SP1 extends GenericObjectActor<edu.kit.ipd.sdq.metamodels.insurance.InsuranceClient> { }


