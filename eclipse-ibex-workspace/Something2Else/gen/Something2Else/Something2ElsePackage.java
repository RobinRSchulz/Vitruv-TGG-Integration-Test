package Something2Else;

import java.lang.String;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EEnum;


import org.emoflon.smartemf.runtime.SmartPackage;

public interface Something2ElsePackage extends SmartPackage {

	String eNAME = "Something2Else";
	String eNS_URI = "platform:/resource/Something2Else/model/Something2Else.ecore";
	String eNS_PREFIX = "Something2Else";

	Something2ElsePackage eINSTANCE = Something2Else.impl.Something2ElsePackageImpl.init();

	int SYSTEM_TO_ROOT = 0;
	int SYSTEM_TO_ROOT__SOURCE = 0;
	int SYSTEM_TO_ROOT__TARGET = 1;
	int SYSTEM_TO_ROOT_FEATURE_COUNT = 2;
	int SYSTEM_TO_ROOT_OPERATION_COUNT = 0;
	
	int COMPONENT_TO_ENTITY = 1;
	int COMPONENT_TO_ENTITY__SOURCE = 2;
	int COMPONENT_TO_ENTITY__TARGET = 3;
	int COMPONENT_TO_ENTITY_FEATURE_COUNT = 2;
	int COMPONENT_TO_ENTITY_OPERATION_COUNT = 0;
	
	int PROTOCOL_TO_ENTITY = 2;
	int PROTOCOL_TO_ENTITY__SOURCE = 4;
	int PROTOCOL_TO_ENTITY__TARGET = 5;
	int PROTOCOL_TO_ENTITY_FEATURE_COUNT = 2;
	int PROTOCOL_TO_ENTITY_OPERATION_COUNT = 0;
	
	int LINK_TO_ENTITY = 3;
	int LINK_TO_ENTITY__SOURCE = 6;
	int LINK_TO_ENTITY__TARGET = 7;
	int LINK_TO_ENTITY_FEATURE_COUNT = 2;
	int LINK_TO_ENTITY_OPERATION_COUNT = 0;
	
	int COMPONENT_TO_ENTITY___MARKER = 4;
	int COMPONENT_TO_ENTITY___MARKER__CREAT_E__SR_C__COMP = 8;
	int COMPONENT_TO_ENTITY___MARKER__CREAT_E__TR_G__ENTITY = 9;
	int COMPONENT_TO_ENTITY___MARKER__CREAT_E__COR_R__CTOE = 10;
	int COMPONENT_TO_ENTITY___MARKER_FEATURE_COUNT = 4;
	int COMPONENT_TO_ENTITY___MARKER_OPERATION_COUNT = 0;
	
	int LINK_TO_ENTITY___MARKER = 5;
	int LINK_TO_ENTITY___MARKER__CREAT_E__SR_C__LINK = 11;
	int LINK_TO_ENTITY___MARKER__CONTEX_T__SR_C__PROTOCOL = 12;
	int LINK_TO_ENTITY___MARKER__CREAT_E__TR_G__ENTITY = 13;
	int LINK_TO_ENTITY___MARKER__CREAT_E__COR_R__LTOE = 14;
	int LINK_TO_ENTITY___MARKER_FEATURE_COUNT = 5;
	int LINK_TO_ENTITY___MARKER_OPERATION_COUNT = 0;
	
	int LINK_TO_ENTITY_EMBEDDED___MARKER = 6;
	int LINK_TO_ENTITY_EMBEDDED___MARKER__CONTEX_T__SR_C__COMPONENT = 15;
	int LINK_TO_ENTITY_EMBEDDED___MARKER__CREAT_E__SR_C__LINK = 16;
	int LINK_TO_ENTITY_EMBEDDED___MARKER__CONTEX_T__SR_C__PROTOCOL = 17;
	int LINK_TO_ENTITY_EMBEDDED___MARKER__CONTEX_T__SR_C__SYSTEM = 18;
	int LINK_TO_ENTITY_EMBEDDED___MARKER__CONTEX_T__TR_G__COMP_ENTITY = 19;
	int LINK_TO_ENTITY_EMBEDDED___MARKER__CREAT_E__TR_G__LINK_ENTITY = 20;
	int LINK_TO_ENTITY_EMBEDDED___MARKER__CONTEX_T__TR_G__PROT_ENTITY = 21;
	int LINK_TO_ENTITY_EMBEDDED___MARKER__CONTEX_T__TR_G__ROOT = 22;
	int LINK_TO_ENTITY_EMBEDDED___MARKER__CONTEX_T__COR_R__CTOE = 23;
	int LINK_TO_ENTITY_EMBEDDED___MARKER__CREAT_E__COR_R__LTOE = 24;
	int LINK_TO_ENTITY_EMBEDDED___MARKER__CONTEX_T__COR_R__PTOE = 25;
	int LINK_TO_ENTITY_EMBEDDED___MARKER__CONTEX_T__COR_R__STOR = 26;
	int LINK_TO_ENTITY_EMBEDDED___MARKER_FEATURE_COUNT = 13;
	int LINK_TO_ENTITY_EMBEDDED___MARKER_OPERATION_COUNT = 0;
	
	int PROTOCOL_TO_ENTITY___MARKER = 7;
	int PROTOCOL_TO_ENTITY___MARKER__CREAT_E__SR_C__PROTOCOL = 27;
	int PROTOCOL_TO_ENTITY___MARKER__CONTEX_T__SR_C__SYSTEM = 28;
	int PROTOCOL_TO_ENTITY___MARKER__CREAT_E__TR_G__ENTITY = 29;
	int PROTOCOL_TO_ENTITY___MARKER__CONTEX_T__TR_G__ROOT = 30;
	int PROTOCOL_TO_ENTITY___MARKER__CREAT_E__COR_R__PTOE = 31;
	int PROTOCOL_TO_ENTITY___MARKER__CONTEX_T__COR_R__STOR = 32;
	int PROTOCOL_TO_ENTITY___MARKER_FEATURE_COUNT = 7;
	int PROTOCOL_TO_ENTITY___MARKER_OPERATION_COUNT = 0;
	
	int SYSTEM_REFD_COMPONENT_TO_ENTITY___MARKER = 8;
	int SYSTEM_REFD_COMPONENT_TO_ENTITY___MARKER__CREAT_E__SR_C__COMP = 33;
	int SYSTEM_REFD_COMPONENT_TO_ENTITY___MARKER__CONTEX_T__SR_C__SYSTEM = 34;
	int SYSTEM_REFD_COMPONENT_TO_ENTITY___MARKER__CREAT_E__TR_G__ENTITY = 35;
	int SYSTEM_REFD_COMPONENT_TO_ENTITY___MARKER__CONTEX_T__TR_G__ROOT = 36;
	int SYSTEM_REFD_COMPONENT_TO_ENTITY___MARKER__CREAT_E__COR_R__CTOE = 37;
	int SYSTEM_REFD_COMPONENT_TO_ENTITY___MARKER__CONTEX_T__COR_R__STOR = 38;
	int SYSTEM_REFD_COMPONENT_TO_ENTITY___MARKER_FEATURE_COUNT = 7;
	int SYSTEM_REFD_COMPONENT_TO_ENTITY___MARKER_OPERATION_COUNT = 0;
	
	int SYSTEM_TO_ROOT___MARKER = 9;
	int SYSTEM_TO_ROOT___MARKER__CREAT_E__SR_C__SYSTEM = 39;
	int SYSTEM_TO_ROOT___MARKER__CREAT_E__TR_G__ROOT = 40;
	int SYSTEM_TO_ROOT___MARKER__CREAT_E__COR_R__STOR = 41;
	int SYSTEM_TO_ROOT___MARKER_FEATURE_COUNT = 4;
	int SYSTEM_TO_ROOT___MARKER_OPERATION_COUNT = 0;
	
	

	EClass getSystemToRoot();
	EReference getSystemToRoot_Source();
	EReference getSystemToRoot_Target();
	
	EClass getComponentToEntity();
	EReference getComponentToEntity_Source();
	EReference getComponentToEntity_Target();
	
	EClass getProtocolToEntity();
	EReference getProtocolToEntity_Source();
	EReference getProtocolToEntity_Target();
	
	EClass getLinkToEntity();
	EReference getLinkToEntity_Source();
	EReference getLinkToEntity_Target();
	
	EClass getComponentToEntity__Marker();
	EReference getComponentToEntity__Marker_CREATE__SRC__comp();
	EReference getComponentToEntity__Marker_CREATE__TRG__entity();
	EReference getComponentToEntity__Marker_CREATE__CORR__ctoe();
	
	EClass getLinkToEntity__Marker();
	EReference getLinkToEntity__Marker_CREATE__SRC__link();
	EReference getLinkToEntity__Marker_CONTEXT__SRC__protocol();
	EReference getLinkToEntity__Marker_CREATE__TRG__entity();
	EReference getLinkToEntity__Marker_CREATE__CORR__ltoe();
	
	EClass getLinkToEntityEmbedded__Marker();
	EReference getLinkToEntityEmbedded__Marker_CONTEXT__SRC__component();
	EReference getLinkToEntityEmbedded__Marker_CREATE__SRC__link();
	EReference getLinkToEntityEmbedded__Marker_CONTEXT__SRC__protocol();
	EReference getLinkToEntityEmbedded__Marker_CONTEXT__SRC__system();
	EReference getLinkToEntityEmbedded__Marker_CONTEXT__TRG__compEntity();
	EReference getLinkToEntityEmbedded__Marker_CREATE__TRG__linkEntity();
	EReference getLinkToEntityEmbedded__Marker_CONTEXT__TRG__protEntity();
	EReference getLinkToEntityEmbedded__Marker_CONTEXT__TRG__root();
	EReference getLinkToEntityEmbedded__Marker_CONTEXT__CORR__ctoe();
	EReference getLinkToEntityEmbedded__Marker_CREATE__CORR__ltoe();
	EReference getLinkToEntityEmbedded__Marker_CONTEXT__CORR__ptoe();
	EReference getLinkToEntityEmbedded__Marker_CONTEXT__CORR__stor();
	
	EClass getProtocolToEntity__Marker();
	EReference getProtocolToEntity__Marker_CREATE__SRC__protocol();
	EReference getProtocolToEntity__Marker_CONTEXT__SRC__system();
	EReference getProtocolToEntity__Marker_CREATE__TRG__entity();
	EReference getProtocolToEntity__Marker_CONTEXT__TRG__root();
	EReference getProtocolToEntity__Marker_CREATE__CORR__ptoe();
	EReference getProtocolToEntity__Marker_CONTEXT__CORR__stor();
	
	EClass getSystemRefdComponentToEntity__Marker();
	EReference getSystemRefdComponentToEntity__Marker_CREATE__SRC__comp();
	EReference getSystemRefdComponentToEntity__Marker_CONTEXT__SRC__system();
	EReference getSystemRefdComponentToEntity__Marker_CREATE__TRG__entity();
	EReference getSystemRefdComponentToEntity__Marker_CONTEXT__TRG__root();
	EReference getSystemRefdComponentToEntity__Marker_CREATE__CORR__ctoe();
	EReference getSystemRefdComponentToEntity__Marker_CONTEXT__CORR__stor();
	
	EClass getSystemToRoot__Marker();
	EReference getSystemToRoot__Marker_CREATE__SRC__system();
	EReference getSystemToRoot__Marker_CREATE__TRG__root();
	EReference getSystemToRoot__Marker_CREATE__CORR__stor();
	
	
	Something2Else.Something2ElseFactory getSomething2ElseFactory();

	interface Literals {
		
		EClass SYSTEM_TO_ROOT = eINSTANCE.getSystemToRoot();
		
		EReference SYSTEM_TO_ROOT__SOURCE = eINSTANCE.getSystemToRoot_Source();
		
		EReference SYSTEM_TO_ROOT__TARGET = eINSTANCE.getSystemToRoot_Target();
		
		EClass COMPONENT_TO_ENTITY = eINSTANCE.getComponentToEntity();
		
		EReference COMPONENT_TO_ENTITY__SOURCE = eINSTANCE.getComponentToEntity_Source();
		
		EReference COMPONENT_TO_ENTITY__TARGET = eINSTANCE.getComponentToEntity_Target();
		
		EClass PROTOCOL_TO_ENTITY = eINSTANCE.getProtocolToEntity();
		
		EReference PROTOCOL_TO_ENTITY__SOURCE = eINSTANCE.getProtocolToEntity_Source();
		
		EReference PROTOCOL_TO_ENTITY__TARGET = eINSTANCE.getProtocolToEntity_Target();
		
		EClass LINK_TO_ENTITY = eINSTANCE.getLinkToEntity();
		
		EReference LINK_TO_ENTITY__SOURCE = eINSTANCE.getLinkToEntity_Source();
		
		EReference LINK_TO_ENTITY__TARGET = eINSTANCE.getLinkToEntity_Target();
		
		EClass COMPONENT_TO_ENTITY___MARKER = eINSTANCE.getComponentToEntity__Marker();
		
		EReference COMPONENT_TO_ENTITY___MARKER__CREAT_E__SR_C__COMP = eINSTANCE.getComponentToEntity__Marker_CREATE__SRC__comp();
		
		EReference COMPONENT_TO_ENTITY___MARKER__CREAT_E__TR_G__ENTITY = eINSTANCE.getComponentToEntity__Marker_CREATE__TRG__entity();
		
		EReference COMPONENT_TO_ENTITY___MARKER__CREAT_E__COR_R__CTOE = eINSTANCE.getComponentToEntity__Marker_CREATE__CORR__ctoe();
		
		EClass LINK_TO_ENTITY___MARKER = eINSTANCE.getLinkToEntity__Marker();
		
		EReference LINK_TO_ENTITY___MARKER__CREAT_E__SR_C__LINK = eINSTANCE.getLinkToEntity__Marker_CREATE__SRC__link();
		
		EReference LINK_TO_ENTITY___MARKER__CONTEX_T__SR_C__PROTOCOL = eINSTANCE.getLinkToEntity__Marker_CONTEXT__SRC__protocol();
		
		EReference LINK_TO_ENTITY___MARKER__CREAT_E__TR_G__ENTITY = eINSTANCE.getLinkToEntity__Marker_CREATE__TRG__entity();
		
		EReference LINK_TO_ENTITY___MARKER__CREAT_E__COR_R__LTOE = eINSTANCE.getLinkToEntity__Marker_CREATE__CORR__ltoe();
		
		EClass LINK_TO_ENTITY_EMBEDDED___MARKER = eINSTANCE.getLinkToEntityEmbedded__Marker();
		
		EReference LINK_TO_ENTITY_EMBEDDED___MARKER__CONTEX_T__SR_C__COMPONENT = eINSTANCE.getLinkToEntityEmbedded__Marker_CONTEXT__SRC__component();
		
		EReference LINK_TO_ENTITY_EMBEDDED___MARKER__CREAT_E__SR_C__LINK = eINSTANCE.getLinkToEntityEmbedded__Marker_CREATE__SRC__link();
		
		EReference LINK_TO_ENTITY_EMBEDDED___MARKER__CONTEX_T__SR_C__PROTOCOL = eINSTANCE.getLinkToEntityEmbedded__Marker_CONTEXT__SRC__protocol();
		
		EReference LINK_TO_ENTITY_EMBEDDED___MARKER__CONTEX_T__SR_C__SYSTEM = eINSTANCE.getLinkToEntityEmbedded__Marker_CONTEXT__SRC__system();
		
		EReference LINK_TO_ENTITY_EMBEDDED___MARKER__CONTEX_T__TR_G__COMP_ENTITY = eINSTANCE.getLinkToEntityEmbedded__Marker_CONTEXT__TRG__compEntity();
		
		EReference LINK_TO_ENTITY_EMBEDDED___MARKER__CREAT_E__TR_G__LINK_ENTITY = eINSTANCE.getLinkToEntityEmbedded__Marker_CREATE__TRG__linkEntity();
		
		EReference LINK_TO_ENTITY_EMBEDDED___MARKER__CONTEX_T__TR_G__PROT_ENTITY = eINSTANCE.getLinkToEntityEmbedded__Marker_CONTEXT__TRG__protEntity();
		
		EReference LINK_TO_ENTITY_EMBEDDED___MARKER__CONTEX_T__TR_G__ROOT = eINSTANCE.getLinkToEntityEmbedded__Marker_CONTEXT__TRG__root();
		
		EReference LINK_TO_ENTITY_EMBEDDED___MARKER__CONTEX_T__COR_R__CTOE = eINSTANCE.getLinkToEntityEmbedded__Marker_CONTEXT__CORR__ctoe();
		
		EReference LINK_TO_ENTITY_EMBEDDED___MARKER__CREAT_E__COR_R__LTOE = eINSTANCE.getLinkToEntityEmbedded__Marker_CREATE__CORR__ltoe();
		
		EReference LINK_TO_ENTITY_EMBEDDED___MARKER__CONTEX_T__COR_R__PTOE = eINSTANCE.getLinkToEntityEmbedded__Marker_CONTEXT__CORR__ptoe();
		
		EReference LINK_TO_ENTITY_EMBEDDED___MARKER__CONTEX_T__COR_R__STOR = eINSTANCE.getLinkToEntityEmbedded__Marker_CONTEXT__CORR__stor();
		
		EClass PROTOCOL_TO_ENTITY___MARKER = eINSTANCE.getProtocolToEntity__Marker();
		
		EReference PROTOCOL_TO_ENTITY___MARKER__CREAT_E__SR_C__PROTOCOL = eINSTANCE.getProtocolToEntity__Marker_CREATE__SRC__protocol();
		
		EReference PROTOCOL_TO_ENTITY___MARKER__CONTEX_T__SR_C__SYSTEM = eINSTANCE.getProtocolToEntity__Marker_CONTEXT__SRC__system();
		
		EReference PROTOCOL_TO_ENTITY___MARKER__CREAT_E__TR_G__ENTITY = eINSTANCE.getProtocolToEntity__Marker_CREATE__TRG__entity();
		
		EReference PROTOCOL_TO_ENTITY___MARKER__CONTEX_T__TR_G__ROOT = eINSTANCE.getProtocolToEntity__Marker_CONTEXT__TRG__root();
		
		EReference PROTOCOL_TO_ENTITY___MARKER__CREAT_E__COR_R__PTOE = eINSTANCE.getProtocolToEntity__Marker_CREATE__CORR__ptoe();
		
		EReference PROTOCOL_TO_ENTITY___MARKER__CONTEX_T__COR_R__STOR = eINSTANCE.getProtocolToEntity__Marker_CONTEXT__CORR__stor();
		
		EClass SYSTEM_REFD_COMPONENT_TO_ENTITY___MARKER = eINSTANCE.getSystemRefdComponentToEntity__Marker();
		
		EReference SYSTEM_REFD_COMPONENT_TO_ENTITY___MARKER__CREAT_E__SR_C__COMP = eINSTANCE.getSystemRefdComponentToEntity__Marker_CREATE__SRC__comp();
		
		EReference SYSTEM_REFD_COMPONENT_TO_ENTITY___MARKER__CONTEX_T__SR_C__SYSTEM = eINSTANCE.getSystemRefdComponentToEntity__Marker_CONTEXT__SRC__system();
		
		EReference SYSTEM_REFD_COMPONENT_TO_ENTITY___MARKER__CREAT_E__TR_G__ENTITY = eINSTANCE.getSystemRefdComponentToEntity__Marker_CREATE__TRG__entity();
		
		EReference SYSTEM_REFD_COMPONENT_TO_ENTITY___MARKER__CONTEX_T__TR_G__ROOT = eINSTANCE.getSystemRefdComponentToEntity__Marker_CONTEXT__TRG__root();
		
		EReference SYSTEM_REFD_COMPONENT_TO_ENTITY___MARKER__CREAT_E__COR_R__CTOE = eINSTANCE.getSystemRefdComponentToEntity__Marker_CREATE__CORR__ctoe();
		
		EReference SYSTEM_REFD_COMPONENT_TO_ENTITY___MARKER__CONTEX_T__COR_R__STOR = eINSTANCE.getSystemRefdComponentToEntity__Marker_CONTEXT__CORR__stor();
		
		EClass SYSTEM_TO_ROOT___MARKER = eINSTANCE.getSystemToRoot__Marker();
		
		EReference SYSTEM_TO_ROOT___MARKER__CREAT_E__SR_C__SYSTEM = eINSTANCE.getSystemToRoot__Marker_CREATE__SRC__system();
		
		EReference SYSTEM_TO_ROOT___MARKER__CREAT_E__TR_G__ROOT = eINSTANCE.getSystemToRoot__Marker_CREATE__TRG__root();
		
		EReference SYSTEM_TO_ROOT___MARKER__CREAT_E__COR_R__STOR = eINSTANCE.getSystemToRoot__Marker_CREATE__CORR__stor();
		
		
		
		
	}

} 
