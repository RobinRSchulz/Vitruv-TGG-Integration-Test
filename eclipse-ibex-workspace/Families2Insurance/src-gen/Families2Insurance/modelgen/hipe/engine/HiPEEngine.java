package Families2Insurance.modelgen.hipe.engine;

import akka.actor.ActorRef;
import akka.actor.Props;

import Families2Insurance.modelgen.hipe.engine.actor.NotificationActor;
import Families2Insurance.modelgen.hipe.engine.actor.DispatchActor;
import Families2Insurance.modelgen.hipe.engine.actor.localsearch.DaughterToInsuranceClient__GEN_1_localSearch;
import Families2Insurance.modelgen.hipe.engine.actor.localsearch.FatherNewFamilyToNewInsuranceClient__GEN_6_localSearch;
import Families2Insurance.modelgen.hipe.engine.actor.localsearch.FatherToInsuranceClient__GEN_10_localSearch;
import Families2Insurance.modelgen.hipe.engine.actor.localsearch.MotherNewFamilyToNewInsuranceClient__GEN_15_localSearch;
import Families2Insurance.modelgen.hipe.engine.actor.localsearch.MotherToInsuranceClient__GEN_19_localSearch;
import Families2Insurance.modelgen.hipe.engine.actor.localsearch.SonToInsuranceClient__GEN_24_localSearch;

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
		classes.put("DaughterToInsuranceClient__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("DaughterToInsuranceClient__GEN_production", "DaughterToInsuranceClient__GEN");
		classes.put("FatherNewFamilyToNewInsuranceClient__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("FatherNewFamilyToNewInsuranceClient__GEN_production", "FatherNewFamilyToNewInsuranceClient__GEN");
		classes.put("FatherToInsuranceClient__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("FatherToInsuranceClient__GEN_production", "FatherToInsuranceClient__GEN");
		classes.put("MotherNewFamilyToNewInsuranceClient__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("MotherNewFamilyToNewInsuranceClient__GEN_production", "MotherNewFamilyToNewInsuranceClient__GEN");
		classes.put("MotherToInsuranceClient__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("MotherToInsuranceClient__GEN_production", "MotherToInsuranceClient__GEN");
		classes.put("SonToInsuranceClient__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("SonToInsuranceClient__GEN_production", "SonToInsuranceClient__GEN");
		
	}
	
	@Override
	public void createJunctionNodes() {
		classes.put("DaughterToInsuranceClient__GEN_1_localSearch", DaughterToInsuranceClient__GEN_1_localSearch.class);
		classes.put("FatherNewFamilyToNewInsuranceClient__GEN_6_localSearch", FatherNewFamilyToNewInsuranceClient__GEN_6_localSearch.class);
		classes.put("FatherToInsuranceClient__GEN_10_localSearch", FatherToInsuranceClient__GEN_10_localSearch.class);
		classes.put("MotherNewFamilyToNewInsuranceClient__GEN_15_localSearch", MotherNewFamilyToNewInsuranceClient__GEN_15_localSearch.class);
		classes.put("MotherToInsuranceClient__GEN_19_localSearch", MotherToInsuranceClient__GEN_19_localSearch.class);
		classes.put("SonToInsuranceClient__GEN_24_localSearch", SonToInsuranceClient__GEN_24_localSearch.class);
	}
	
	@Override
	public void createReferenceNodes() {
		
	}
	
	@Override
	public void createObjectNodes() {
		classes.put("Family_object",Family_object.class);
		classes.put("FamilyRegister_object_SP0",FamilyRegister_object_SP0.class);
		classes.put("FamilyRegister_object_SP1",FamilyRegister_object_SP1.class);
		classes.put("FamilyRegisterToInsuranceDatabase_object_SP0",FamilyRegisterToInsuranceDatabase_object_SP0.class);
		classes.put("FamilyRegisterToInsuranceDatabase_object_SP1",FamilyRegisterToInsuranceDatabase_object_SP1.class);
		classes.put("InsuranceDatabase_object_SP0",InsuranceDatabase_object_SP0.class);
		classes.put("InsuranceDatabase_object_SP1",InsuranceDatabase_object_SP1.class);
		
	}
	
	@Override
	public void initializeReferenceNodes() {
	}
}

class Family_object extends GenericObjectActor<edu.kit.ipd.sdq.metamodels.families.Family> { }
class FamilyRegister_object_SP0 extends GenericObjectActor<edu.kit.ipd.sdq.metamodels.families.FamilyRegister> { }
class FamilyRegister_object_SP1 extends GenericObjectActor<edu.kit.ipd.sdq.metamodels.families.FamilyRegister> { }
class FamilyRegisterToInsuranceDatabase_object_SP0 extends GenericObjectActor<Something2Else.FamilyRegisterToInsuranceDatabase> { }
class FamilyRegisterToInsuranceDatabase_object_SP1 extends GenericObjectActor<Something2Else.FamilyRegisterToInsuranceDatabase> { }
class InsuranceDatabase_object_SP0 extends GenericObjectActor<edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase> { }
class InsuranceDatabase_object_SP1 extends GenericObjectActor<edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase> { }


