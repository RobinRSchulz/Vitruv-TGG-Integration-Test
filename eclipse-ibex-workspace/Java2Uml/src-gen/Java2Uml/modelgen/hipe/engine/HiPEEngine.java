package Java2Uml.modelgen.hipe.engine;

import akka.actor.ActorRef;
import akka.actor.Props;

import Java2Uml.modelgen.hipe.engine.actor.NotificationActor;
import Java2Uml.modelgen.hipe.engine.actor.DispatchActor;
import Java2Uml.modelgen.hipe.engine.actor.localsearch.ClassAbstractToAbstract__GEN_1_localSearch;
import Java2Uml.modelgen.hipe.engine.actor.localsearch.ClassAttributeToProperty__GEN_5_localSearch;
import Java2Uml.modelgen.hipe.engine.actor.junction.ClassAttributeTypeToPropertyType__GEN_10_junction;
import Java2Uml.modelgen.hipe.engine.actor.localsearch.ClassConstructorToConstructor__GEN_22_localSearch;
import Java2Uml.modelgen.hipe.engine.actor.localsearch.ClassFinalToFinal__GEN_26_localSearch;
import Java2Uml.modelgen.hipe.engine.actor.localsearch.ClassImplementToClassImplement__GEN_30_localSearch;
import Java2Uml.modelgen.hipe.engine.actor.localsearch.ClassMethodToMethod__GEN_34_localSearch;
import Java2Uml.modelgen.hipe.engine.actor.localsearch.ClassPrivateToPrivate__GEN_38_localSearch;
import Java2Uml.modelgen.hipe.engine.actor.localsearch.ClassProtectedToProtected__GEN_42_localSearch;
import Java2Uml.modelgen.hipe.engine.actor.localsearch.ClassPublicToPublic__GEN_46_localSearch;
import Java2Uml.modelgen.hipe.engine.actor.localsearch.ClassToUmlClass__GEN_50_localSearch;
import Java2Uml.modelgen.hipe.engine.actor.junction.ConstructorClassParamTypeToParamType__GEN_57_junction;
import Java2Uml.modelgen.hipe.engine.actor.junction.ConstructorEnumParamTypeToParamType__GEN_81_junction;
import Java2Uml.modelgen.hipe.engine.actor.junction.ConstructorInterfaceParamTypeToParamType__GEN_105_junction;
import Java2Uml.modelgen.hipe.engine.actor.localsearch.EnumAbstractToAbstract__GEN_127_localSearch;
import Java2Uml.modelgen.hipe.engine.actor.localsearch.EnumAttributeToProperty__GEN_131_localSearch;
import Java2Uml.modelgen.hipe.engine.actor.junction.EnumAttributeTypeToPropertyType__GEN_136_junction;
import Java2Uml.modelgen.hipe.engine.actor.localsearch.EnumFinalToFinal__GEN_148_localSearch;
import Java2Uml.modelgen.hipe.engine.actor.localsearch.EnumPrivateToPrivate__GEN_152_localSearch;
import Java2Uml.modelgen.hipe.engine.actor.localsearch.EnumProtectedToProtected__GEN_156_localSearch;
import Java2Uml.modelgen.hipe.engine.actor.localsearch.EnumPublicToPublic__GEN_160_localSearch;
import Java2Uml.modelgen.hipe.engine.actor.localsearch.EnumToUmlEnum__GEN_164_localSearch;
import Java2Uml.modelgen.hipe.engine.actor.junction.ExistingClassImplementToClassImplement__GEN_169_junction;
import Java2Uml.modelgen.hipe.engine.actor.junction.ExistingSuperClassToSuperClass__GEN_182_junction;
import Java2Uml.modelgen.hipe.engine.actor.junction.ExistingSuperInterfaceToSuperInterface__GEN_195_junction;
import Java2Uml.modelgen.hipe.engine.actor.localsearch.FieldFinalToFinal__GEN_208_localSearch;
import Java2Uml.modelgen.hipe.engine.actor.localsearch.FieldStaticToStatic__GEN_212_localSearch;
import Java2Uml.modelgen.hipe.engine.actor.localsearch.InterfaceAbstractToAbstract__GEN_216_localSearch;
import Java2Uml.modelgen.hipe.engine.actor.junction.InterfaceAttributeTypeToPropertyType__GEN_221_junction;
import Java2Uml.modelgen.hipe.engine.actor.localsearch.InterfaceConstructorToConstructor__GEN_233_localSearch;
import Java2Uml.modelgen.hipe.engine.actor.localsearch.InterfaceFinalToFinal__GEN_237_localSearch;
import Java2Uml.modelgen.hipe.engine.actor.localsearch.InterfaceMethodToMethod__GEN_241_localSearch;
import Java2Uml.modelgen.hipe.engine.actor.localsearch.InterfacePrivateToPrivate__GEN_245_localSearch;
import Java2Uml.modelgen.hipe.engine.actor.localsearch.InterfaceProtectedToProtected__GEN_249_localSearch;
import Java2Uml.modelgen.hipe.engine.actor.localsearch.InterfacePublicToPublic__GEN_253_localSearch;
import Java2Uml.modelgen.hipe.engine.actor.localsearch.InterfaceToUmlInterface__GEN_257_localSearch;
import Java2Uml.modelgen.hipe.engine.actor.localsearch.JavaCompilationUnitToExistingUmlModel__GEN_262_localSearch;
import Java2Uml.modelgen.hipe.engine.actor.localsearch.MethodAbstractToAbstract__GEN_268_localSearch;
import Java2Uml.modelgen.hipe.engine.actor.junction.MethodClassParamTypeToParamType__GEN_274_junction;
import Java2Uml.modelgen.hipe.engine.actor.junction.MethodEnumParamTypeToParamType__GEN_311_junction;
import Java2Uml.modelgen.hipe.engine.actor.localsearch.MethodFinalToFinal__GEN_346_localSearch;
import Java2Uml.modelgen.hipe.engine.actor.junction.MethodInterfaceParamTypeToParamType__GEN_352_junction;
import Java2Uml.modelgen.hipe.engine.actor.localsearch.MethodStaticToStatic__GEN_387_localSearch;
import Java2Uml.modelgen.hipe.engine.actor.localsearch.OrdinaryConstructorParameterToParameter__GEN_391_localSearch;
import Java2Uml.modelgen.hipe.engine.actor.localsearch.OrdinaryMethodParameterToParameter__GEN_395_localSearch;
import Java2Uml.modelgen.hipe.engine.actor.localsearch.SuperClassToSuperClass__GEN_399_localSearch;
import Java2Uml.modelgen.hipe.engine.actor.localsearch.SuperInterfaceToSuperInterface__GEN_403_localSearch;
import Java2Uml.modelgen.hipe.engine.actor.localsearch.VariableLengthConstructorParameterToParameter__GEN_407_localSearch;
import Java2Uml.modelgen.hipe.engine.actor.localsearch.VariableLengthMethodParameterToParameter__GEN_411_localSearch;

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
		classes.put("ClassAbstractToAbstract__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("ClassAbstractToAbstract__GEN_production", "ClassAbstractToAbstract__GEN");
		classes.put("ClassAttributeToProperty__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("ClassAttributeToProperty__GEN_production", "ClassAttributeToProperty__GEN");
		classes.put("ClassAttributeTypeToPropertyType__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("ClassAttributeTypeToPropertyType__GEN_production", "ClassAttributeTypeToPropertyType__GEN");
		classes.put("ClassConstructorToConstructor__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("ClassConstructorToConstructor__GEN_production", "ClassConstructorToConstructor__GEN");
		classes.put("ClassFinalToFinal__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("ClassFinalToFinal__GEN_production", "ClassFinalToFinal__GEN");
		classes.put("ClassImplementToClassImplement__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("ClassImplementToClassImplement__GEN_production", "ClassImplementToClassImplement__GEN");
		classes.put("ClassMethodToMethod__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("ClassMethodToMethod__GEN_production", "ClassMethodToMethod__GEN");
		classes.put("ClassPrivateToPrivate__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("ClassPrivateToPrivate__GEN_production", "ClassPrivateToPrivate__GEN");
		classes.put("ClassProtectedToProtected__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("ClassProtectedToProtected__GEN_production", "ClassProtectedToProtected__GEN");
		classes.put("ClassPublicToPublic__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("ClassPublicToPublic__GEN_production", "ClassPublicToPublic__GEN");
		classes.put("ClassToUmlClass__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("ClassToUmlClass__GEN_production", "ClassToUmlClass__GEN");
		classes.put("ConstructorClassParamTypeToParamType__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("ConstructorClassParamTypeToParamType__GEN_production", "ConstructorClassParamTypeToParamType__GEN");
		classes.put("ConstructorEnumParamTypeToParamType__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("ConstructorEnumParamTypeToParamType__GEN_production", "ConstructorEnumParamTypeToParamType__GEN");
		classes.put("ConstructorInterfaceParamTypeToParamType__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("ConstructorInterfaceParamTypeToParamType__GEN_production", "ConstructorInterfaceParamTypeToParamType__GEN");
		classes.put("EnumAbstractToAbstract__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("EnumAbstractToAbstract__GEN_production", "EnumAbstractToAbstract__GEN");
		classes.put("EnumAttributeToProperty__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("EnumAttributeToProperty__GEN_production", "EnumAttributeToProperty__GEN");
		classes.put("EnumAttributeTypeToPropertyType__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("EnumAttributeTypeToPropertyType__GEN_production", "EnumAttributeTypeToPropertyType__GEN");
		classes.put("EnumFinalToFinal__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("EnumFinalToFinal__GEN_production", "EnumFinalToFinal__GEN");
		classes.put("EnumPrivateToPrivate__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("EnumPrivateToPrivate__GEN_production", "EnumPrivateToPrivate__GEN");
		classes.put("EnumProtectedToProtected__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("EnumProtectedToProtected__GEN_production", "EnumProtectedToProtected__GEN");
		classes.put("EnumPublicToPublic__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("EnumPublicToPublic__GEN_production", "EnumPublicToPublic__GEN");
		classes.put("EnumToUmlEnum__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("EnumToUmlEnum__GEN_production", "EnumToUmlEnum__GEN");
		classes.put("ExistingClassImplementToClassImplement__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("ExistingClassImplementToClassImplement__GEN_production", "ExistingClassImplementToClassImplement__GEN");
		classes.put("ExistingSuperClassToSuperClass__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("ExistingSuperClassToSuperClass__GEN_production", "ExistingSuperClassToSuperClass__GEN");
		classes.put("ExistingSuperInterfaceToSuperInterface__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("ExistingSuperInterfaceToSuperInterface__GEN_production", "ExistingSuperInterfaceToSuperInterface__GEN");
		classes.put("FieldFinalToFinal__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("FieldFinalToFinal__GEN_production", "FieldFinalToFinal__GEN");
		classes.put("FieldStaticToStatic__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("FieldStaticToStatic__GEN_production", "FieldStaticToStatic__GEN");
		classes.put("InterfaceAbstractToAbstract__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("InterfaceAbstractToAbstract__GEN_production", "InterfaceAbstractToAbstract__GEN");
		classes.put("InterfaceAttributeTypeToPropertyType__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("InterfaceAttributeTypeToPropertyType__GEN_production", "InterfaceAttributeTypeToPropertyType__GEN");
		classes.put("InterfaceConstructorToConstructor__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("InterfaceConstructorToConstructor__GEN_production", "InterfaceConstructorToConstructor__GEN");
		classes.put("InterfaceFinalToFinal__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("InterfaceFinalToFinal__GEN_production", "InterfaceFinalToFinal__GEN");
		classes.put("InterfaceMethodToMethod__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("InterfaceMethodToMethod__GEN_production", "InterfaceMethodToMethod__GEN");
		classes.put("InterfacePrivateToPrivate__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("InterfacePrivateToPrivate__GEN_production", "InterfacePrivateToPrivate__GEN");
		classes.put("InterfaceProtectedToProtected__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("InterfaceProtectedToProtected__GEN_production", "InterfaceProtectedToProtected__GEN");
		classes.put("InterfacePublicToPublic__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("InterfacePublicToPublic__GEN_production", "InterfacePublicToPublic__GEN");
		classes.put("InterfaceToUmlInterface__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("InterfaceToUmlInterface__GEN_production", "InterfaceToUmlInterface__GEN");
		classes.put("JavaCompilationUnitToExistingUmlModel__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("JavaCompilationUnitToExistingUmlModel__GEN_production", "JavaCompilationUnitToExistingUmlModel__GEN");
		classes.put("JavaFirstCompilationUnitToUmlModel__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("JavaFirstCompilationUnitToUmlModel__GEN_production", "JavaFirstCompilationUnitToUmlModel__GEN");
		classes.put("MethodAbstractToAbstract__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("MethodAbstractToAbstract__GEN_production", "MethodAbstractToAbstract__GEN");
		classes.put("MethodClassParamTypeToParamType__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("MethodClassParamTypeToParamType__GEN_production", "MethodClassParamTypeToParamType__GEN");
		classes.put("MethodClassReturnTypeToReturnType__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("MethodClassReturnTypeToReturnType__GEN_production", "MethodClassReturnTypeToReturnType__GEN");
		classes.put("MethodEnumParamTypeToParamType__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("MethodEnumParamTypeToParamType__GEN_production", "MethodEnumParamTypeToParamType__GEN");
		classes.put("MethodEnumReturnTypeToReturnType__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("MethodEnumReturnTypeToReturnType__GEN_production", "MethodEnumReturnTypeToReturnType__GEN");
		classes.put("MethodFinalToFinal__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("MethodFinalToFinal__GEN_production", "MethodFinalToFinal__GEN");
		classes.put("MethodInterfaceParamTypeToParamType__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("MethodInterfaceParamTypeToParamType__GEN_production", "MethodInterfaceParamTypeToParamType__GEN");
		classes.put("MethodInterfaceReturnTypeToReturnType__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("MethodInterfaceReturnTypeToReturnType__GEN_production", "MethodInterfaceReturnTypeToReturnType__GEN");
		classes.put("MethodStaticToStatic__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("MethodStaticToStatic__GEN_production", "MethodStaticToStatic__GEN");
		classes.put("OrdinaryConstructorParameterToParameter__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("OrdinaryConstructorParameterToParameter__GEN_production", "OrdinaryConstructorParameterToParameter__GEN");
		classes.put("OrdinaryMethodParameterToParameter__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("OrdinaryMethodParameterToParameter__GEN_production", "OrdinaryMethodParameterToParameter__GEN");
		classes.put("SuperClassToSuperClass__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("SuperClassToSuperClass__GEN_production", "SuperClassToSuperClass__GEN");
		classes.put("SuperInterfaceToSuperInterface__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("SuperInterfaceToSuperInterface__GEN_production", "SuperInterfaceToSuperInterface__GEN");
		classes.put("VariableLengthConstructorParameterToParameter__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("VariableLengthConstructorParameterToParameter__GEN_production", "VariableLengthConstructorParameterToParameter__GEN");
		classes.put("VariableLengthMethodParameterToParameter__GEN_production", GenericProductionActor.class);
		productionNodes2pattern.put("VariableLengthMethodParameterToParameter__GEN_production", "VariableLengthMethodParameterToParameter__GEN");
		
	}
	
	@Override
	public void createJunctionNodes() {
		classes.put("ClassAbstractToAbstract__GEN_1_localSearch", ClassAbstractToAbstract__GEN_1_localSearch.class);
		classes.put("ClassAttributeToProperty__GEN_5_localSearch", ClassAttributeToProperty__GEN_5_localSearch.class);
		classes.put("ClassAttributeTypeToPropertyType__GEN_10_junction", ClassAttributeTypeToPropertyType__GEN_10_junction.class);
		classes.put("ClassAttributeTypeToPropertyType__GEN_11_junction", GenericJunctionActor.class);
		classes.put("ClassAttributeTypeToPropertyType__GEN_9_junction", GenericJunctionActor.class);
		classes.put("ClassConstructorToConstructor__GEN_22_localSearch", ClassConstructorToConstructor__GEN_22_localSearch.class);
		classes.put("ClassFinalToFinal__GEN_26_localSearch", ClassFinalToFinal__GEN_26_localSearch.class);
		classes.put("ClassImplementToClassImplement__GEN_30_localSearch", ClassImplementToClassImplement__GEN_30_localSearch.class);
		classes.put("ClassMethodToMethod__GEN_34_localSearch", ClassMethodToMethod__GEN_34_localSearch.class);
		classes.put("ClassPrivateToPrivate__GEN_38_localSearch", ClassPrivateToPrivate__GEN_38_localSearch.class);
		classes.put("ClassProtectedToProtected__GEN_42_localSearch", ClassProtectedToProtected__GEN_42_localSearch.class);
		classes.put("ClassPublicToPublic__GEN_46_localSearch", ClassPublicToPublic__GEN_46_localSearch.class);
		classes.put("ClassToUmlClass__GEN_50_localSearch", ClassToUmlClass__GEN_50_localSearch.class);
		classes.put("ConstructorClassParamTypeToParamType__GEN_56_junction", GenericJunctionActor.class);
		classes.put("ConstructorClassParamTypeToParamType__GEN_60_junction", GenericJunctionActor.class);
		classes.put("ConstructorClassParamTypeToParamType__GEN_67_junction", GenericJunctionActor.class);
		classes.put("ConstructorClassParamTypeToParamType__GEN_68_junction", GenericJunctionActor.class);
		classes.put("ConstructorClassParamTypeToParamType__GEN_61_junction", GenericJunctionActor.class);
		classes.put("ConstructorClassParamTypeToParamType__GEN_57_junction", ConstructorClassParamTypeToParamType__GEN_57_junction.class);
		classes.put("ConstructorClassParamTypeToParamType__GEN_55_junction", GenericJunctionActor.class);
		classes.put("ConstructorEnumParamTypeToParamType__GEN_80_junction", GenericJunctionActor.class);
		classes.put("ConstructorEnumParamTypeToParamType__GEN_84_junction", GenericJunctionActor.class);
		classes.put("ConstructorEnumParamTypeToParamType__GEN_91_junction", GenericJunctionActor.class);
		classes.put("ConstructorEnumParamTypeToParamType__GEN_92_junction", GenericJunctionActor.class);
		classes.put("ConstructorEnumParamTypeToParamType__GEN_85_junction", GenericJunctionActor.class);
		classes.put("ConstructorEnumParamTypeToParamType__GEN_81_junction", ConstructorEnumParamTypeToParamType__GEN_81_junction.class);
		classes.put("ConstructorEnumParamTypeToParamType__GEN_79_junction", GenericJunctionActor.class);
		classes.put("ConstructorInterfaceParamTypeToParamType__GEN_104_junction", GenericJunctionActor.class);
		classes.put("ConstructorInterfaceParamTypeToParamType__GEN_108_junction", GenericJunctionActor.class);
		classes.put("ConstructorInterfaceParamTypeToParamType__GEN_115_junction", GenericJunctionActor.class);
		classes.put("ConstructorInterfaceParamTypeToParamType__GEN_116_junction", GenericJunctionActor.class);
		classes.put("ConstructorInterfaceParamTypeToParamType__GEN_109_junction", GenericJunctionActor.class);
		classes.put("ConstructorInterfaceParamTypeToParamType__GEN_105_junction", ConstructorInterfaceParamTypeToParamType__GEN_105_junction.class);
		classes.put("ConstructorInterfaceParamTypeToParamType__GEN_103_junction", GenericJunctionActor.class);
		classes.put("EnumAbstractToAbstract__GEN_127_localSearch", EnumAbstractToAbstract__GEN_127_localSearch.class);
		classes.put("EnumAttributeToProperty__GEN_131_localSearch", EnumAttributeToProperty__GEN_131_localSearch.class);
		classes.put("EnumAttributeTypeToPropertyType__GEN_136_junction", EnumAttributeTypeToPropertyType__GEN_136_junction.class);
		classes.put("EnumAttributeTypeToPropertyType__GEN_137_junction", GenericJunctionActor.class);
		classes.put("EnumAttributeTypeToPropertyType__GEN_135_junction", GenericJunctionActor.class);
		classes.put("EnumFinalToFinal__GEN_148_localSearch", EnumFinalToFinal__GEN_148_localSearch.class);
		classes.put("EnumPrivateToPrivate__GEN_152_localSearch", EnumPrivateToPrivate__GEN_152_localSearch.class);
		classes.put("EnumProtectedToProtected__GEN_156_localSearch", EnumProtectedToProtected__GEN_156_localSearch.class);
		classes.put("EnumPublicToPublic__GEN_160_localSearch", EnumPublicToPublic__GEN_160_localSearch.class);
		classes.put("EnumToUmlEnum__GEN_164_localSearch", EnumToUmlEnum__GEN_164_localSearch.class);
		classes.put("ExistingClassImplementToClassImplement__GEN_170_junction", GenericJunctionActor.class);
		classes.put("ExistingClassImplementToClassImplement__GEN_171_junction", GenericJunctionActor.class);
		classes.put("ExistingClassImplementToClassImplement__GEN_169_junction", ExistingClassImplementToClassImplement__GEN_169_junction.class);
		classes.put("ExistingSuperClassToSuperClass__GEN_183_junction", GenericJunctionActor.class);
		classes.put("ExistingSuperClassToSuperClass__GEN_184_junction", GenericJunctionActor.class);
		classes.put("ExistingSuperClassToSuperClass__GEN_182_junction", ExistingSuperClassToSuperClass__GEN_182_junction.class);
		classes.put("ExistingSuperInterfaceToSuperInterface__GEN_196_junction", GenericJunctionActor.class);
		classes.put("ExistingSuperInterfaceToSuperInterface__GEN_197_junction", GenericJunctionActor.class);
		classes.put("ExistingSuperInterfaceToSuperInterface__GEN_195_junction", ExistingSuperInterfaceToSuperInterface__GEN_195_junction.class);
		classes.put("FieldFinalToFinal__GEN_208_localSearch", FieldFinalToFinal__GEN_208_localSearch.class);
		classes.put("FieldStaticToStatic__GEN_212_localSearch", FieldStaticToStatic__GEN_212_localSearch.class);
		classes.put("InterfaceAbstractToAbstract__GEN_216_localSearch", InterfaceAbstractToAbstract__GEN_216_localSearch.class);
		classes.put("InterfaceAttributeTypeToPropertyType__GEN_221_junction", InterfaceAttributeTypeToPropertyType__GEN_221_junction.class);
		classes.put("InterfaceAttributeTypeToPropertyType__GEN_222_junction", GenericJunctionActor.class);
		classes.put("InterfaceAttributeTypeToPropertyType__GEN_220_junction", GenericJunctionActor.class);
		classes.put("InterfaceConstructorToConstructor__GEN_233_localSearch", InterfaceConstructorToConstructor__GEN_233_localSearch.class);
		classes.put("InterfaceFinalToFinal__GEN_237_localSearch", InterfaceFinalToFinal__GEN_237_localSearch.class);
		classes.put("InterfaceMethodToMethod__GEN_241_localSearch", InterfaceMethodToMethod__GEN_241_localSearch.class);
		classes.put("InterfacePrivateToPrivate__GEN_245_localSearch", InterfacePrivateToPrivate__GEN_245_localSearch.class);
		classes.put("InterfaceProtectedToProtected__GEN_249_localSearch", InterfaceProtectedToProtected__GEN_249_localSearch.class);
		classes.put("InterfacePublicToPublic__GEN_253_localSearch", InterfacePublicToPublic__GEN_253_localSearch.class);
		classes.put("InterfaceToUmlInterface__GEN_257_localSearch", InterfaceToUmlInterface__GEN_257_localSearch.class);
		classes.put("JavaCompilationUnitToExistingUmlModel__GEN_262_localSearch", JavaCompilationUnitToExistingUmlModel__GEN_262_localSearch.class);
		classes.put("MethodAbstractToAbstract__GEN_268_localSearch", MethodAbstractToAbstract__GEN_268_localSearch.class);
		classes.put("MethodClassParamTypeToParamType__GEN_273_junction", GenericJunctionActor.class);
		classes.put("MethodClassParamTypeToParamType__GEN_277_junction", GenericJunctionActor.class);
		classes.put("MethodClassParamTypeToParamType__GEN_284_junction", GenericJunctionActor.class);
		classes.put("MethodClassParamTypeToParamType__GEN_285_junction", GenericJunctionActor.class);
		classes.put("MethodClassParamTypeToParamType__GEN_278_junction", GenericJunctionActor.class);
		classes.put("MethodClassParamTypeToParamType__GEN_274_junction", MethodClassParamTypeToParamType__GEN_274_junction.class);
		classes.put("MethodClassParamTypeToParamType__GEN_272_junction", GenericJunctionActor.class);
		classes.put("MethodClassReturnTypeToReturnType__GEN_297_junction", GenericJunctionActor.class);
		classes.put("MethodClassReturnTypeToReturnType__GEN_298_junction", GenericJunctionActor.class);
		classes.put("MethodClassReturnTypeToReturnType__GEN_296_junction", GenericJunctionActor.class);
		classes.put("MethodEnumParamTypeToParamType__GEN_310_junction", GenericJunctionActor.class);
		classes.put("MethodEnumParamTypeToParamType__GEN_314_junction", GenericJunctionActor.class);
		classes.put("MethodEnumParamTypeToParamType__GEN_321_junction", GenericJunctionActor.class);
		classes.put("MethodEnumParamTypeToParamType__GEN_322_junction", GenericJunctionActor.class);
		classes.put("MethodEnumParamTypeToParamType__GEN_315_junction", GenericJunctionActor.class);
		classes.put("MethodEnumParamTypeToParamType__GEN_311_junction", MethodEnumParamTypeToParamType__GEN_311_junction.class);
		classes.put("MethodEnumParamTypeToParamType__GEN_309_junction", GenericJunctionActor.class);
		classes.put("MethodEnumReturnTypeToReturnType__GEN_334_junction", GenericJunctionActor.class);
		classes.put("MethodEnumReturnTypeToReturnType__GEN_335_junction", GenericJunctionActor.class);
		classes.put("MethodEnumReturnTypeToReturnType__GEN_333_junction", GenericJunctionActor.class);
		classes.put("MethodFinalToFinal__GEN_346_localSearch", MethodFinalToFinal__GEN_346_localSearch.class);
		classes.put("MethodInterfaceParamTypeToParamType__GEN_351_junction", GenericJunctionActor.class);
		classes.put("MethodInterfaceParamTypeToParamType__GEN_355_junction", GenericJunctionActor.class);
		classes.put("MethodInterfaceParamTypeToParamType__GEN_362_junction", GenericJunctionActor.class);
		classes.put("MethodInterfaceParamTypeToParamType__GEN_363_junction", GenericJunctionActor.class);
		classes.put("MethodInterfaceParamTypeToParamType__GEN_356_junction", GenericJunctionActor.class);
		classes.put("MethodInterfaceParamTypeToParamType__GEN_352_junction", MethodInterfaceParamTypeToParamType__GEN_352_junction.class);
		classes.put("MethodInterfaceParamTypeToParamType__GEN_350_junction", GenericJunctionActor.class);
		classes.put("MethodInterfaceReturnTypeToReturnType__GEN_375_junction", GenericJunctionActor.class);
		classes.put("MethodInterfaceReturnTypeToReturnType__GEN_376_junction", GenericJunctionActor.class);
		classes.put("MethodInterfaceReturnTypeToReturnType__GEN_374_junction", GenericJunctionActor.class);
		createJunctionNodes_1();
			}	
		
			private void createJunctionNodes_1() {
		classes.put("MethodStaticToStatic__GEN_387_localSearch", MethodStaticToStatic__GEN_387_localSearch.class);
		classes.put("OrdinaryConstructorParameterToParameter__GEN_391_localSearch", OrdinaryConstructorParameterToParameter__GEN_391_localSearch.class);
		classes.put("OrdinaryMethodParameterToParameter__GEN_395_localSearch", OrdinaryMethodParameterToParameter__GEN_395_localSearch.class);
		classes.put("SuperClassToSuperClass__GEN_399_localSearch", SuperClassToSuperClass__GEN_399_localSearch.class);
		classes.put("SuperInterfaceToSuperInterface__GEN_403_localSearch", SuperInterfaceToSuperInterface__GEN_403_localSearch.class);
		classes.put("VariableLengthConstructorParameterToParameter__GEN_407_localSearch", VariableLengthConstructorParameterToParameter__GEN_407_localSearch.class);
		classes.put("VariableLengthMethodParameterToParameter__GEN_411_localSearch", VariableLengthMethodParameterToParameter__GEN_411_localSearch.class);
	}
	
	@Override
	public void createReferenceNodes() {
		classes.put("JavaAttributeToUmlProperty_source_0_reference",JavaAttributeToUmlProperty_source_0_reference.class);
		classes.put("JavaAttributeToUmlProperty_target_0_reference",JavaAttributeToUmlProperty_target_0_reference.class);
		classes.put("JavaClassifierToUmlClassifier_source_0_reference",JavaClassifierToUmlClassifier_source_0_reference.class);
		classes.put("JavaClassifierToUmlClassifier_target_0_reference",JavaClassifierToUmlClassifier_target_0_reference.class);
		classes.put("JavaParameterToParameter_target_0_reference",JavaParameterToParameter_target_0_reference.class);
		classes.put("Operation_ownedParameter_0_reference",Operation_ownedParameter_0_reference.class);
		classes.put("JavaConstructorToOperation_source_0_reference",JavaConstructorToOperation_source_0_reference.class);
		classes.put("JavaConstructorToOperation_target_0_reference",JavaConstructorToOperation_target_0_reference.class);
		classes.put("Constructor_parameters_0_reference",Constructor_parameters_0_reference.class);
		classes.put("JavaParameterToParameter_source_0_reference",JavaParameterToParameter_source_0_reference.class);
		classes.put("JavaClassifierToUmlClassifier_source_1_reference",JavaClassifierToUmlClassifier_source_1_reference.class);
		classes.put("JavaClassifierToUmlClassifier_target_1_reference",JavaClassifierToUmlClassifier_target_1_reference.class);
		classes.put("JavaClassifierToUmlClassifier_source_2_reference",JavaClassifierToUmlClassifier_source_2_reference.class);
		classes.put("JavaClassifierToUmlClassifier_target_2_reference",JavaClassifierToUmlClassifier_target_2_reference.class);
		classes.put("JavaMethodToOperation_source_0_reference",JavaMethodToOperation_source_0_reference.class);
		classes.put("JavaMethodToOperation_target_0_reference",JavaMethodToOperation_target_0_reference.class);
		classes.put("ClassMethod_parameters_1_reference",ClassMethod_parameters_1_reference.class);
		
	}
	
	@Override
	public void createObjectNodes() {
		classes.put("JavaAttributeToUmlProperty_object",JavaAttributeToUmlProperty_object.class);
		classes.put("Field_object",Field_object.class);
		classes.put("Property_object",Property_object.class);
		classes.put("CompilationUnit_object",CompilationUnit_object.class);
		classes.put("JavaPackageToUmlPackage_object",JavaPackageToUmlPackage_object.class);
		classes.put("Package_1_object",Package_1_object.class);
		classes.put("JavaParameterToParameter_object",JavaParameterToParameter_object.class);
		classes.put("Parameter_object",Parameter_object.class);
		classes.put("JavaConstructorToOperation_object",JavaConstructorToOperation_object.class);
		classes.put("Constructor_object",Constructor_object.class);
		classes.put("Parameter_1_object",Parameter_1_object.class);
		classes.put("JavaCompilationUnitToUmlModel_object",JavaCompilationUnitToUmlModel_object.class);
		classes.put("Model_object",Model_object.class);
		classes.put("JavaClassifierToUmlClassifier_object_SP0",JavaClassifierToUmlClassifier_object_SP0.class);
		classes.put("JavaClassifierToUmlClassifier_object_SP1",JavaClassifierToUmlClassifier_object_SP1.class);
		classes.put("JavaClassifierToUmlClassifier_object_SP2",JavaClassifierToUmlClassifier_object_SP2.class);
		classes.put("JavaClassifierToUmlClassifier_object_SP3",JavaClassifierToUmlClassifier_object_SP3.class);
		classes.put("JavaClassifierToUmlClassifier_object_SP4",JavaClassifierToUmlClassifier_object_SP4.class);
		classes.put("JavaClassifierToUmlClassifier_object_SP5",JavaClassifierToUmlClassifier_object_SP5.class);
		classes.put("JavaClassifierToUmlClassifier_object_SP6",JavaClassifierToUmlClassifier_object_SP6.class);
		classes.put("JavaClassifierToUmlClassifier_object_SP7",JavaClassifierToUmlClassifier_object_SP7.class);
		classes.put("Class_object_SP0",Class_object_SP0.class);
		classes.put("Class_object_SP1",Class_object_SP1.class);
		classes.put("Class_object_SP2",Class_object_SP2.class);
		classes.put("Class_1_object_SP0",Class_1_object_SP0.class);
		classes.put("Class_1_object_SP1",Class_1_object_SP1.class);
		classes.put("Class_1_object_SP2",Class_1_object_SP2.class);
		classes.put("Package_object_SP0",Package_object_SP0.class);
		classes.put("Package_object_SP1",Package_object_SP1.class);
		classes.put("Operation_object_SP0",Operation_object_SP0.class);
		classes.put("Operation_object_SP1",Operation_object_SP1.class);
		classes.put("Operation_object_SP2",Operation_object_SP2.class);
		classes.put("Enumeration_object_SP0",Enumeration_object_SP0.class);
		classes.put("Enumeration_object_SP1",Enumeration_object_SP1.class);
		classes.put("Enumeration_1_object_SP0",Enumeration_1_object_SP0.class);
		classes.put("Enumeration_1_object_SP1",Enumeration_1_object_SP1.class);
		classes.put("Interface_object_SP0",Interface_object_SP0.class);
		classes.put("Interface_object_SP1",Interface_object_SP1.class);
		classes.put("Interface_object_SP2",Interface_object_SP2.class);
		classes.put("Interface_1_object_SP0",Interface_1_object_SP0.class);
		classes.put("Interface_1_object_SP1",Interface_1_object_SP1.class);
		classes.put("Interface_1_object_SP2",Interface_1_object_SP2.class);
		classes.put("ClassMethod_object_SP0",ClassMethod_object_SP0.class);
		classes.put("ClassMethod_object_SP1",ClassMethod_object_SP1.class);
		classes.put("JavaMethodToOperation_object_SP0",JavaMethodToOperation_object_SP0.class);
		classes.put("JavaMethodToOperation_object_SP1",JavaMethodToOperation_object_SP1.class);
		
	}
	
	@Override
	public void initializeReferenceNodes() {
		name2initRefGen.put("JavaAttributeToUmlProperty_source_0_reference", new InitGenReferenceActor<Java2Uml.JavaAttributeToUmlProperty,org.emftext.language.java.members.Field>(name2actor, name2node.get("JavaAttributeToUmlProperty_source_0_reference"), (o) -> o instanceof Java2Uml.JavaAttributeToUmlProperty, (o) -> o.getSource(), null, false, prodUtil, incUtil));
		name2initRefGen.put("JavaAttributeToUmlProperty_target_0_reference", new InitGenReferenceActor<Java2Uml.JavaAttributeToUmlProperty,uml.Property>(name2actor, name2node.get("JavaAttributeToUmlProperty_target_0_reference"), (o) -> o instanceof Java2Uml.JavaAttributeToUmlProperty, (o) -> o.getTarget(), null, false, prodUtil, incUtil));
		name2initRefGen.put("JavaClassifierToUmlClassifier_source_0_reference", new InitGenReferenceActor<Java2Uml.JavaClassifierToUmlClassifier,org.emftext.language.java.classifiers.Classifier>(name2actor, name2node.get("JavaClassifierToUmlClassifier_source_0_reference"), (o) -> o instanceof Java2Uml.JavaClassifierToUmlClassifier, (o) -> o.getSource(), null, false, prodUtil, incUtil));
		name2initRefGen.put("JavaClassifierToUmlClassifier_target_0_reference", new InitGenReferenceActor<Java2Uml.JavaClassifierToUmlClassifier,uml.Classifier>(name2actor, name2node.get("JavaClassifierToUmlClassifier_target_0_reference"), (o) -> o instanceof Java2Uml.JavaClassifierToUmlClassifier, (o) -> o.getTarget(), null, false, prodUtil, incUtil));
		name2initRefGen.put("JavaParameterToParameter_target_0_reference", new InitGenReferenceActor<Java2Uml.JavaParameterToParameter,uml.Parameter>(name2actor, name2node.get("JavaParameterToParameter_target_0_reference"), (o) -> o instanceof Java2Uml.JavaParameterToParameter, (o) -> o.getTarget(), null, false, prodUtil, incUtil));
		name2initRefGen.put("Operation_ownedParameter_0_reference", new InitGenReferenceActor<uml.BehavioralFeature,uml.Parameter>(name2actor, name2node.get("Operation_ownedParameter_0_reference"), (o) -> o instanceof uml.BehavioralFeature, null, (o) -> o.getOwnedParameter(), false, prodUtil, incUtil));
		name2initRefGen.put("JavaConstructorToOperation_source_0_reference", new InitGenReferenceActor<Java2Uml.JavaConstructorToOperation,org.emftext.language.java.members.Constructor>(name2actor, name2node.get("JavaConstructorToOperation_source_0_reference"), (o) -> o instanceof Java2Uml.JavaConstructorToOperation, (o) -> o.getSource(), null, false, prodUtil, incUtil));
		name2initRefGen.put("JavaConstructorToOperation_target_0_reference", new InitGenReferenceActor<Java2Uml.JavaConstructorToOperation,uml.Operation>(name2actor, name2node.get("JavaConstructorToOperation_target_0_reference"), (o) -> o instanceof Java2Uml.JavaConstructorToOperation, (o) -> o.getTarget(), null, false, prodUtil, incUtil));
		name2initRefGen.put("Constructor_parameters_0_reference", new InitGenReferenceActor<org.emftext.language.java.parameters.Parametrizable,org.emftext.language.java.parameters.Parameter>(name2actor, name2node.get("Constructor_parameters_0_reference"), (o) -> o instanceof org.emftext.language.java.parameters.Parametrizable, null, (o) -> o.getParameters(), false, prodUtil, incUtil));
		name2initRefGen.put("JavaParameterToParameter_source_0_reference", new InitGenReferenceActor<Java2Uml.JavaParameterToParameter,org.emftext.language.java.parameters.Parameter>(name2actor, name2node.get("JavaParameterToParameter_source_0_reference"), (o) -> o instanceof Java2Uml.JavaParameterToParameter, (o) -> o.getSource(), null, false, prodUtil, incUtil));
		name2initRefGen.put("JavaClassifierToUmlClassifier_source_1_reference", new InitGenReferenceActor<Java2Uml.JavaClassifierToUmlClassifier,org.emftext.language.java.classifiers.Classifier>(name2actor, name2node.get("JavaClassifierToUmlClassifier_source_1_reference"), (o) -> o instanceof Java2Uml.JavaClassifierToUmlClassifier, (o) -> o.getSource(), null, false, prodUtil, incUtil));
		name2initRefGen.put("JavaClassifierToUmlClassifier_target_1_reference", new InitGenReferenceActor<Java2Uml.JavaClassifierToUmlClassifier,uml.Classifier>(name2actor, name2node.get("JavaClassifierToUmlClassifier_target_1_reference"), (o) -> o instanceof Java2Uml.JavaClassifierToUmlClassifier, (o) -> o.getTarget(), null, false, prodUtil, incUtil));
		name2initRefGen.put("JavaClassifierToUmlClassifier_source_2_reference", new InitGenReferenceActor<Java2Uml.JavaClassifierToUmlClassifier,org.emftext.language.java.classifiers.Classifier>(name2actor, name2node.get("JavaClassifierToUmlClassifier_source_2_reference"), (o) -> o instanceof Java2Uml.JavaClassifierToUmlClassifier, (o) -> o.getSource(), null, false, prodUtil, incUtil));
		name2initRefGen.put("JavaClassifierToUmlClassifier_target_2_reference", new InitGenReferenceActor<Java2Uml.JavaClassifierToUmlClassifier,uml.Classifier>(name2actor, name2node.get("JavaClassifierToUmlClassifier_target_2_reference"), (o) -> o instanceof Java2Uml.JavaClassifierToUmlClassifier, (o) -> o.getTarget(), null, false, prodUtil, incUtil));
		name2initRefGen.put("JavaMethodToOperation_source_0_reference", new InitGenReferenceActor<Java2Uml.JavaMethodToOperation,org.emftext.language.java.members.Method>(name2actor, name2node.get("JavaMethodToOperation_source_0_reference"), (o) -> o instanceof Java2Uml.JavaMethodToOperation, (o) -> o.getSource(), null, false, prodUtil, incUtil));
		name2initRefGen.put("JavaMethodToOperation_target_0_reference", new InitGenReferenceActor<Java2Uml.JavaMethodToOperation,uml.Operation>(name2actor, name2node.get("JavaMethodToOperation_target_0_reference"), (o) -> o instanceof Java2Uml.JavaMethodToOperation, (o) -> o.getTarget(), null, false, prodUtil, incUtil));
		name2initRefGen.put("ClassMethod_parameters_1_reference", new InitGenReferenceActor<org.emftext.language.java.parameters.Parametrizable,org.emftext.language.java.parameters.Parameter>(name2actor, name2node.get("ClassMethod_parameters_1_reference"), (o) -> o instanceof org.emftext.language.java.parameters.Parametrizable, null, (o) -> o.getParameters(), false, prodUtil, incUtil));
	}
}

class JavaAttributeToUmlProperty_object extends GenericObjectActor<Java2Uml.JavaAttributeToUmlProperty> { }
class Field_object extends GenericObjectActor<org.emftext.language.java.members.Field> { }
class Property_object extends GenericObjectActor<uml.Property> { }
class CompilationUnit_object extends GenericObjectActor<org.emftext.language.java.containers.CompilationUnit> { }
class JavaPackageToUmlPackage_object extends GenericObjectActor<Java2Uml.JavaPackageToUmlPackage> { }
class Package_1_object extends GenericObjectActor<uml.Package> { }
class JavaParameterToParameter_object extends GenericObjectActor<Java2Uml.JavaParameterToParameter> { }
class Parameter_object extends GenericObjectActor<uml.Parameter> { }
class JavaConstructorToOperation_object extends GenericObjectActor<Java2Uml.JavaConstructorToOperation> { }
class Constructor_object extends GenericObjectActor<org.emftext.language.java.members.Constructor> { }
class Parameter_1_object extends GenericObjectActor<org.emftext.language.java.parameters.Parameter> { }
class JavaCompilationUnitToUmlModel_object extends GenericObjectActor<Java2Uml.JavaCompilationUnitToUmlModel> { }
class Model_object extends GenericObjectActor<uml.Model> { }
class JavaClassifierToUmlClassifier_object_SP0 extends GenericObjectActor<Java2Uml.JavaClassifierToUmlClassifier> { }
class JavaClassifierToUmlClassifier_object_SP1 extends GenericObjectActor<Java2Uml.JavaClassifierToUmlClassifier> { }
class JavaClassifierToUmlClassifier_object_SP2 extends GenericObjectActor<Java2Uml.JavaClassifierToUmlClassifier> { }
class JavaClassifierToUmlClassifier_object_SP3 extends GenericObjectActor<Java2Uml.JavaClassifierToUmlClassifier> { }
class JavaClassifierToUmlClassifier_object_SP4 extends GenericObjectActor<Java2Uml.JavaClassifierToUmlClassifier> { }
class JavaClassifierToUmlClassifier_object_SP5 extends GenericObjectActor<Java2Uml.JavaClassifierToUmlClassifier> { }
class JavaClassifierToUmlClassifier_object_SP6 extends GenericObjectActor<Java2Uml.JavaClassifierToUmlClassifier> { }
class JavaClassifierToUmlClassifier_object_SP7 extends GenericObjectActor<Java2Uml.JavaClassifierToUmlClassifier> { }
class Class_object_SP0 extends GenericObjectActor<org.emftext.language.java.classifiers.Class> { }
class Class_object_SP1 extends GenericObjectActor<org.emftext.language.java.classifiers.Class> { }
class Class_object_SP2 extends GenericObjectActor<org.emftext.language.java.classifiers.Class> { }
class Class_1_object_SP0 extends GenericObjectActor<uml.Class> { }
class Class_1_object_SP1 extends GenericObjectActor<uml.Class> { }
class Class_1_object_SP2 extends GenericObjectActor<uml.Class> { }
class Package_object_SP0 extends GenericObjectActor<org.emftext.language.java.containers.Package> { }
class Package_object_SP1 extends GenericObjectActor<org.emftext.language.java.containers.Package> { }
class Operation_object_SP0 extends GenericObjectActor<uml.Operation> { }
class Operation_object_SP1 extends GenericObjectActor<uml.Operation> { }
class Operation_object_SP2 extends GenericObjectActor<uml.Operation> { }
class Enumeration_object_SP0 extends GenericObjectActor<org.emftext.language.java.classifiers.Enumeration> { }
class Enumeration_object_SP1 extends GenericObjectActor<org.emftext.language.java.classifiers.Enumeration> { }
class Enumeration_1_object_SP0 extends GenericObjectActor<uml.Enumeration> { }
class Enumeration_1_object_SP1 extends GenericObjectActor<uml.Enumeration> { }
class Interface_object_SP0 extends GenericObjectActor<org.emftext.language.java.classifiers.Interface> { }
class Interface_object_SP1 extends GenericObjectActor<org.emftext.language.java.classifiers.Interface> { }
class Interface_object_SP2 extends GenericObjectActor<org.emftext.language.java.classifiers.Interface> { }
class Interface_1_object_SP0 extends GenericObjectActor<uml.Interface> { }
class Interface_1_object_SP1 extends GenericObjectActor<uml.Interface> { }
class Interface_1_object_SP2 extends GenericObjectActor<uml.Interface> { }
class ClassMethod_object_SP0 extends GenericObjectActor<org.emftext.language.java.members.ClassMethod> { }
class ClassMethod_object_SP1 extends GenericObjectActor<org.emftext.language.java.members.ClassMethod> { }
class JavaMethodToOperation_object_SP0 extends GenericObjectActor<Java2Uml.JavaMethodToOperation> { }
class JavaMethodToOperation_object_SP1 extends GenericObjectActor<Java2Uml.JavaMethodToOperation> { }

class JavaAttributeToUmlProperty_source_0_reference extends GenericReferenceActor<Java2Uml.JavaAttributeToUmlProperty, org.emftext.language.java.members.Field> { }
class JavaAttributeToUmlProperty_target_0_reference extends GenericReferenceActor<Java2Uml.JavaAttributeToUmlProperty, uml.Property> { }
class JavaClassifierToUmlClassifier_source_0_reference extends GenericReferenceActor<Java2Uml.JavaClassifierToUmlClassifier, org.emftext.language.java.classifiers.Classifier> { }
class JavaClassifierToUmlClassifier_target_0_reference extends GenericReferenceActor<Java2Uml.JavaClassifierToUmlClassifier, uml.Classifier> { }
class JavaParameterToParameter_target_0_reference extends GenericReferenceActor<Java2Uml.JavaParameterToParameter, uml.Parameter> { }
class Operation_ownedParameter_0_reference extends GenericReferenceActor<uml.BehavioralFeature, uml.Parameter> { }
class JavaConstructorToOperation_source_0_reference extends GenericReferenceActor<Java2Uml.JavaConstructorToOperation, org.emftext.language.java.members.Constructor> { }
class JavaConstructorToOperation_target_0_reference extends GenericReferenceActor<Java2Uml.JavaConstructorToOperation, uml.Operation> { }
class Constructor_parameters_0_reference extends GenericReferenceActor<org.emftext.language.java.parameters.Parametrizable, org.emftext.language.java.parameters.Parameter> { }
class JavaParameterToParameter_source_0_reference extends GenericReferenceActor<Java2Uml.JavaParameterToParameter, org.emftext.language.java.parameters.Parameter> { }
class JavaClassifierToUmlClassifier_source_1_reference extends GenericReferenceActor<Java2Uml.JavaClassifierToUmlClassifier, org.emftext.language.java.classifiers.Classifier> { }
class JavaClassifierToUmlClassifier_target_1_reference extends GenericReferenceActor<Java2Uml.JavaClassifierToUmlClassifier, uml.Classifier> { }
class JavaClassifierToUmlClassifier_source_2_reference extends GenericReferenceActor<Java2Uml.JavaClassifierToUmlClassifier, org.emftext.language.java.classifiers.Classifier> { }
class JavaClassifierToUmlClassifier_target_2_reference extends GenericReferenceActor<Java2Uml.JavaClassifierToUmlClassifier, uml.Classifier> { }
class JavaMethodToOperation_source_0_reference extends GenericReferenceActor<Java2Uml.JavaMethodToOperation, org.emftext.language.java.members.Method> { }
class JavaMethodToOperation_target_0_reference extends GenericReferenceActor<Java2Uml.JavaMethodToOperation, uml.Operation> { }
class ClassMethod_parameters_1_reference extends GenericReferenceActor<org.emftext.language.java.parameters.Parametrizable, org.emftext.language.java.parameters.Parameter> { }

