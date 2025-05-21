package Something2Else.impl;

import Something2Else.SystemToRoot;
import Something2Else.ComponentToEntity;
import Something2Else.ProtocolToEntity;
import Something2Else.LinkToEntity;
import Something2Else.ComponentToEntity__Marker;
import Something2Else.LinkToEntity__Marker;
import Something2Else.LinkToEntityEmbedded__Marker;
import Something2Else.ProtocolToEntity__Marker;
import Something2Else.SystemRefdComponentToEntity__Marker;
import Something2Else.SystemToRoot__Marker;


import Something2Else.Something2ElseFactory;
import Something2Else.Something2ElsePackage;

import tools.vitruv.methodologisttemplate.model.model.ModelPackage;
import tools.vitruv.methodologisttemplate.model.model2.Model2Package;
import runtime.RuntimePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.emoflon.smartemf.runtime.SmartPackageImpl;

public class Something2ElsePackageImpl extends SmartPackageImpl
		implements Something2ElsePackage {
			
	private EClass systemToRootEClass = null;
	private EReference systemToRoot_sourceEReference = null;
	private EReference systemToRoot_targetEReference = null;
	private EClass componentToEntityEClass = null;
	private EReference componentToEntity_sourceEReference = null;
	private EReference componentToEntity_targetEReference = null;
	private EClass protocolToEntityEClass = null;
	private EReference protocolToEntity_sourceEReference = null;
	private EReference protocolToEntity_targetEReference = null;
	private EClass linkToEntityEClass = null;
	private EReference linkToEntity_sourceEReference = null;
	private EReference linkToEntity_targetEReference = null;
	private EClass componentToEntity__MarkerEClass = null;
	private EReference componentToEntity__Marker_cREATE__SRC__compEReference = null;
	private EReference componentToEntity__Marker_cREATE__TRG__entityEReference = null;
	private EReference componentToEntity__Marker_cREATE__CORR__ctoeEReference = null;
	private EClass linkToEntity__MarkerEClass = null;
	private EReference linkToEntity__Marker_cREATE__SRC__linkEReference = null;
	private EReference linkToEntity__Marker_cONTEXT__SRC__protocolEReference = null;
	private EReference linkToEntity__Marker_cREATE__TRG__entityEReference = null;
	private EReference linkToEntity__Marker_cREATE__CORR__ltoeEReference = null;
	private EClass linkToEntityEmbedded__MarkerEClass = null;
	private EReference linkToEntityEmbedded__Marker_cONTEXT__SRC__componentEReference = null;
	private EReference linkToEntityEmbedded__Marker_cREATE__SRC__linkEReference = null;
	private EReference linkToEntityEmbedded__Marker_cONTEXT__SRC__protocolEReference = null;
	private EReference linkToEntityEmbedded__Marker_cONTEXT__SRC__systemEReference = null;
	private EReference linkToEntityEmbedded__Marker_cONTEXT__TRG__compEntityEReference = null;
	private EReference linkToEntityEmbedded__Marker_cREATE__TRG__linkEntityEReference = null;
	private EReference linkToEntityEmbedded__Marker_cONTEXT__TRG__protEntityEReference = null;
	private EReference linkToEntityEmbedded__Marker_cONTEXT__TRG__rootEReference = null;
	private EReference linkToEntityEmbedded__Marker_cONTEXT__CORR__ctoeEReference = null;
	private EReference linkToEntityEmbedded__Marker_cREATE__CORR__ltoeEReference = null;
	private EReference linkToEntityEmbedded__Marker_cONTEXT__CORR__ptoeEReference = null;
	private EReference linkToEntityEmbedded__Marker_cONTEXT__CORR__storEReference = null;
	private EClass protocolToEntity__MarkerEClass = null;
	private EReference protocolToEntity__Marker_cREATE__SRC__protocolEReference = null;
	private EReference protocolToEntity__Marker_cONTEXT__SRC__systemEReference = null;
	private EReference protocolToEntity__Marker_cREATE__TRG__entityEReference = null;
	private EReference protocolToEntity__Marker_cONTEXT__TRG__rootEReference = null;
	private EReference protocolToEntity__Marker_cREATE__CORR__ptoeEReference = null;
	private EReference protocolToEntity__Marker_cONTEXT__CORR__storEReference = null;
	private EClass systemRefdComponentToEntity__MarkerEClass = null;
	private EReference systemRefdComponentToEntity__Marker_cREATE__SRC__compEReference = null;
	private EReference systemRefdComponentToEntity__Marker_cONTEXT__SRC__systemEReference = null;
	private EReference systemRefdComponentToEntity__Marker_cREATE__TRG__entityEReference = null;
	private EReference systemRefdComponentToEntity__Marker_cONTEXT__TRG__rootEReference = null;
	private EReference systemRefdComponentToEntity__Marker_cREATE__CORR__ctoeEReference = null;
	private EReference systemRefdComponentToEntity__Marker_cONTEXT__CORR__storEReference = null;
	private EClass systemToRoot__MarkerEClass = null;
	private EReference systemToRoot__Marker_cREATE__SRC__systemEReference = null;
	private EReference systemToRoot__Marker_cREATE__TRG__rootEReference = null;
	private EReference systemToRoot__Marker_cREATE__CORR__storEReference = null;
	
	

	private Something2ElsePackageImpl() {
		super(eNS_URI, Something2Else.Something2ElseFactory.eINSTANCE);
	}

	private static boolean isRegistered = false;
	private boolean isCreated = false;
	private boolean isInitialized = false;

	public static Something2ElsePackage init() {
		if (isRegistered)
			return (Something2ElsePackage) EPackage.Registry.INSTANCE
					.getEPackage(Something2ElsePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSomething2ElsePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		Something2ElsePackageImpl theSomething2ElsePackage = registeredSomething2ElsePackage instanceof Something2ElsePackageImpl
				? (Something2ElsePackageImpl) registeredSomething2ElsePackage
				: new Something2ElsePackageImpl();

		isRegistered = true;

		// Create package meta-data objects
		theSomething2ElsePackage.createPackageContents();

		// Initialize created meta-data
		theSomething2ElsePackage.initializePackageContents();
		
		// Inject internal eOpposites to unidirectional references
		theSomething2ElsePackage.injectDynamicOpposites();
		
		// Inject external references into foreign packages
		theSomething2ElsePackage.injectExternalReferences();

		// Mark meta-data to indicate it can't be changed
		theSomething2ElsePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Something2ElsePackage.eNS_URI,
				theSomething2ElsePackage);
				
		theSomething2ElsePackage.fetchDynamicEStructuralFeaturesOfSuperTypes();
		return theSomething2ElsePackage;
	}

	@Override
	public EClass getSystemToRoot() {
		return systemToRootEClass;
	}
	@Override
	public EReference getSystemToRoot_Source() {
		return systemToRoot_sourceEReference;	
	}
	@Override
	public EReference getSystemToRoot_Target() {
		return systemToRoot_targetEReference;	
	}
	@Override
	public EClass getComponentToEntity() {
		return componentToEntityEClass;
	}
	@Override
	public EReference getComponentToEntity_Source() {
		return componentToEntity_sourceEReference;	
	}
	@Override
	public EReference getComponentToEntity_Target() {
		return componentToEntity_targetEReference;	
	}
	@Override
	public EClass getProtocolToEntity() {
		return protocolToEntityEClass;
	}
	@Override
	public EReference getProtocolToEntity_Source() {
		return protocolToEntity_sourceEReference;	
	}
	@Override
	public EReference getProtocolToEntity_Target() {
		return protocolToEntity_targetEReference;	
	}
	@Override
	public EClass getLinkToEntity() {
		return linkToEntityEClass;
	}
	@Override
	public EReference getLinkToEntity_Source() {
		return linkToEntity_sourceEReference;	
	}
	@Override
	public EReference getLinkToEntity_Target() {
		return linkToEntity_targetEReference;	
	}
	@Override
	public EClass getComponentToEntity__Marker() {
		return componentToEntity__MarkerEClass;
	}
	@Override
	public EReference getComponentToEntity__Marker_CREATE__SRC__comp() {
		return componentToEntity__Marker_cREATE__SRC__compEReference;	
	}
	@Override
	public EReference getComponentToEntity__Marker_CREATE__TRG__entity() {
		return componentToEntity__Marker_cREATE__TRG__entityEReference;	
	}
	@Override
	public EReference getComponentToEntity__Marker_CREATE__CORR__ctoe() {
		return componentToEntity__Marker_cREATE__CORR__ctoeEReference;	
	}
	@Override
	public EClass getLinkToEntity__Marker() {
		return linkToEntity__MarkerEClass;
	}
	@Override
	public EReference getLinkToEntity__Marker_CREATE__SRC__link() {
		return linkToEntity__Marker_cREATE__SRC__linkEReference;	
	}
	@Override
	public EReference getLinkToEntity__Marker_CONTEXT__SRC__protocol() {
		return linkToEntity__Marker_cONTEXT__SRC__protocolEReference;	
	}
	@Override
	public EReference getLinkToEntity__Marker_CREATE__TRG__entity() {
		return linkToEntity__Marker_cREATE__TRG__entityEReference;	
	}
	@Override
	public EReference getLinkToEntity__Marker_CREATE__CORR__ltoe() {
		return linkToEntity__Marker_cREATE__CORR__ltoeEReference;	
	}
	@Override
	public EClass getLinkToEntityEmbedded__Marker() {
		return linkToEntityEmbedded__MarkerEClass;
	}
	@Override
	public EReference getLinkToEntityEmbedded__Marker_CONTEXT__SRC__component() {
		return linkToEntityEmbedded__Marker_cONTEXT__SRC__componentEReference;	
	}
	@Override
	public EReference getLinkToEntityEmbedded__Marker_CREATE__SRC__link() {
		return linkToEntityEmbedded__Marker_cREATE__SRC__linkEReference;	
	}
	@Override
	public EReference getLinkToEntityEmbedded__Marker_CONTEXT__SRC__protocol() {
		return linkToEntityEmbedded__Marker_cONTEXT__SRC__protocolEReference;	
	}
	@Override
	public EReference getLinkToEntityEmbedded__Marker_CONTEXT__SRC__system() {
		return linkToEntityEmbedded__Marker_cONTEXT__SRC__systemEReference;	
	}
	@Override
	public EReference getLinkToEntityEmbedded__Marker_CONTEXT__TRG__compEntity() {
		return linkToEntityEmbedded__Marker_cONTEXT__TRG__compEntityEReference;	
	}
	@Override
	public EReference getLinkToEntityEmbedded__Marker_CREATE__TRG__linkEntity() {
		return linkToEntityEmbedded__Marker_cREATE__TRG__linkEntityEReference;	
	}
	@Override
	public EReference getLinkToEntityEmbedded__Marker_CONTEXT__TRG__protEntity() {
		return linkToEntityEmbedded__Marker_cONTEXT__TRG__protEntityEReference;	
	}
	@Override
	public EReference getLinkToEntityEmbedded__Marker_CONTEXT__TRG__root() {
		return linkToEntityEmbedded__Marker_cONTEXT__TRG__rootEReference;	
	}
	@Override
	public EReference getLinkToEntityEmbedded__Marker_CONTEXT__CORR__ctoe() {
		return linkToEntityEmbedded__Marker_cONTEXT__CORR__ctoeEReference;	
	}
	@Override
	public EReference getLinkToEntityEmbedded__Marker_CREATE__CORR__ltoe() {
		return linkToEntityEmbedded__Marker_cREATE__CORR__ltoeEReference;	
	}
	@Override
	public EReference getLinkToEntityEmbedded__Marker_CONTEXT__CORR__ptoe() {
		return linkToEntityEmbedded__Marker_cONTEXT__CORR__ptoeEReference;	
	}
	@Override
	public EReference getLinkToEntityEmbedded__Marker_CONTEXT__CORR__stor() {
		return linkToEntityEmbedded__Marker_cONTEXT__CORR__storEReference;	
	}
	@Override
	public EClass getProtocolToEntity__Marker() {
		return protocolToEntity__MarkerEClass;
	}
	@Override
	public EReference getProtocolToEntity__Marker_CREATE__SRC__protocol() {
		return protocolToEntity__Marker_cREATE__SRC__protocolEReference;	
	}
	@Override
	public EReference getProtocolToEntity__Marker_CONTEXT__SRC__system() {
		return protocolToEntity__Marker_cONTEXT__SRC__systemEReference;	
	}
	@Override
	public EReference getProtocolToEntity__Marker_CREATE__TRG__entity() {
		return protocolToEntity__Marker_cREATE__TRG__entityEReference;	
	}
	@Override
	public EReference getProtocolToEntity__Marker_CONTEXT__TRG__root() {
		return protocolToEntity__Marker_cONTEXT__TRG__rootEReference;	
	}
	@Override
	public EReference getProtocolToEntity__Marker_CREATE__CORR__ptoe() {
		return protocolToEntity__Marker_cREATE__CORR__ptoeEReference;	
	}
	@Override
	public EReference getProtocolToEntity__Marker_CONTEXT__CORR__stor() {
		return protocolToEntity__Marker_cONTEXT__CORR__storEReference;	
	}
	@Override
	public EClass getSystemRefdComponentToEntity__Marker() {
		return systemRefdComponentToEntity__MarkerEClass;
	}
	@Override
	public EReference getSystemRefdComponentToEntity__Marker_CREATE__SRC__comp() {
		return systemRefdComponentToEntity__Marker_cREATE__SRC__compEReference;	
	}
	@Override
	public EReference getSystemRefdComponentToEntity__Marker_CONTEXT__SRC__system() {
		return systemRefdComponentToEntity__Marker_cONTEXT__SRC__systemEReference;	
	}
	@Override
	public EReference getSystemRefdComponentToEntity__Marker_CREATE__TRG__entity() {
		return systemRefdComponentToEntity__Marker_cREATE__TRG__entityEReference;	
	}
	@Override
	public EReference getSystemRefdComponentToEntity__Marker_CONTEXT__TRG__root() {
		return systemRefdComponentToEntity__Marker_cONTEXT__TRG__rootEReference;	
	}
	@Override
	public EReference getSystemRefdComponentToEntity__Marker_CREATE__CORR__ctoe() {
		return systemRefdComponentToEntity__Marker_cREATE__CORR__ctoeEReference;	
	}
	@Override
	public EReference getSystemRefdComponentToEntity__Marker_CONTEXT__CORR__stor() {
		return systemRefdComponentToEntity__Marker_cONTEXT__CORR__storEReference;	
	}
	@Override
	public EClass getSystemToRoot__Marker() {
		return systemToRoot__MarkerEClass;
	}
	@Override
	public EReference getSystemToRoot__Marker_CREATE__SRC__system() {
		return systemToRoot__Marker_cREATE__SRC__systemEReference;	
	}
	@Override
	public EReference getSystemToRoot__Marker_CREATE__TRG__root() {
		return systemToRoot__Marker_cREATE__TRG__rootEReference;	
	}
	@Override
	public EReference getSystemToRoot__Marker_CREATE__CORR__stor() {
		return systemToRoot__Marker_cREATE__CORR__storEReference;	
	}
	
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Something2Else.Something2ElseFactory getSomething2ElseFactory() {
		return (Something2Else.Something2ElseFactory) getEFactoryInstance();
	}

	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		systemToRootEClass = createEClass(SYSTEM_TO_ROOT);
		createEReference(systemToRootEClass, SYSTEM_TO_ROOT__SOURCE);
		systemToRoot_sourceEReference = (EReference) systemToRootEClass.getEStructuralFeatures().get(0);
		createEReference(systemToRootEClass, SYSTEM_TO_ROOT__TARGET);
		systemToRoot_targetEReference = (EReference) systemToRootEClass.getEStructuralFeatures().get(1);
		
		componentToEntityEClass = createEClass(COMPONENT_TO_ENTITY);
		createEReference(componentToEntityEClass, COMPONENT_TO_ENTITY__SOURCE);
		componentToEntity_sourceEReference = (EReference) componentToEntityEClass.getEStructuralFeatures().get(0);
		createEReference(componentToEntityEClass, COMPONENT_TO_ENTITY__TARGET);
		componentToEntity_targetEReference = (EReference) componentToEntityEClass.getEStructuralFeatures().get(1);
		
		protocolToEntityEClass = createEClass(PROTOCOL_TO_ENTITY);
		createEReference(protocolToEntityEClass, PROTOCOL_TO_ENTITY__SOURCE);
		protocolToEntity_sourceEReference = (EReference) protocolToEntityEClass.getEStructuralFeatures().get(0);
		createEReference(protocolToEntityEClass, PROTOCOL_TO_ENTITY__TARGET);
		protocolToEntity_targetEReference = (EReference) protocolToEntityEClass.getEStructuralFeatures().get(1);
		
		linkToEntityEClass = createEClass(LINK_TO_ENTITY);
		createEReference(linkToEntityEClass, LINK_TO_ENTITY__SOURCE);
		linkToEntity_sourceEReference = (EReference) linkToEntityEClass.getEStructuralFeatures().get(0);
		createEReference(linkToEntityEClass, LINK_TO_ENTITY__TARGET);
		linkToEntity_targetEReference = (EReference) linkToEntityEClass.getEStructuralFeatures().get(1);
		
		componentToEntity__MarkerEClass = createEClass(COMPONENT_TO_ENTITY___MARKER);
		createEReference(componentToEntity__MarkerEClass, COMPONENT_TO_ENTITY___MARKER__CREAT_E__SR_C__COMP);
		componentToEntity__Marker_cREATE__SRC__compEReference = (EReference) componentToEntity__MarkerEClass.getEStructuralFeatures().get(0);
		createEReference(componentToEntity__MarkerEClass, COMPONENT_TO_ENTITY___MARKER__CREAT_E__TR_G__ENTITY);
		componentToEntity__Marker_cREATE__TRG__entityEReference = (EReference) componentToEntity__MarkerEClass.getEStructuralFeatures().get(1);
		createEReference(componentToEntity__MarkerEClass, COMPONENT_TO_ENTITY___MARKER__CREAT_E__COR_R__CTOE);
		componentToEntity__Marker_cREATE__CORR__ctoeEReference = (EReference) componentToEntity__MarkerEClass.getEStructuralFeatures().get(2);
		
		linkToEntity__MarkerEClass = createEClass(LINK_TO_ENTITY___MARKER);
		createEReference(linkToEntity__MarkerEClass, LINK_TO_ENTITY___MARKER__CREAT_E__SR_C__LINK);
		linkToEntity__Marker_cREATE__SRC__linkEReference = (EReference) linkToEntity__MarkerEClass.getEStructuralFeatures().get(0);
		createEReference(linkToEntity__MarkerEClass, LINK_TO_ENTITY___MARKER__CONTEX_T__SR_C__PROTOCOL);
		linkToEntity__Marker_cONTEXT__SRC__protocolEReference = (EReference) linkToEntity__MarkerEClass.getEStructuralFeatures().get(1);
		createEReference(linkToEntity__MarkerEClass, LINK_TO_ENTITY___MARKER__CREAT_E__TR_G__ENTITY);
		linkToEntity__Marker_cREATE__TRG__entityEReference = (EReference) linkToEntity__MarkerEClass.getEStructuralFeatures().get(2);
		createEReference(linkToEntity__MarkerEClass, LINK_TO_ENTITY___MARKER__CREAT_E__COR_R__LTOE);
		linkToEntity__Marker_cREATE__CORR__ltoeEReference = (EReference) linkToEntity__MarkerEClass.getEStructuralFeatures().get(3);
		
		linkToEntityEmbedded__MarkerEClass = createEClass(LINK_TO_ENTITY_EMBEDDED___MARKER);
		createEReference(linkToEntityEmbedded__MarkerEClass, LINK_TO_ENTITY_EMBEDDED___MARKER__CONTEX_T__SR_C__COMPONENT);
		linkToEntityEmbedded__Marker_cONTEXT__SRC__componentEReference = (EReference) linkToEntityEmbedded__MarkerEClass.getEStructuralFeatures().get(0);
		createEReference(linkToEntityEmbedded__MarkerEClass, LINK_TO_ENTITY_EMBEDDED___MARKER__CREAT_E__SR_C__LINK);
		linkToEntityEmbedded__Marker_cREATE__SRC__linkEReference = (EReference) linkToEntityEmbedded__MarkerEClass.getEStructuralFeatures().get(1);
		createEReference(linkToEntityEmbedded__MarkerEClass, LINK_TO_ENTITY_EMBEDDED___MARKER__CONTEX_T__SR_C__PROTOCOL);
		linkToEntityEmbedded__Marker_cONTEXT__SRC__protocolEReference = (EReference) linkToEntityEmbedded__MarkerEClass.getEStructuralFeatures().get(2);
		createEReference(linkToEntityEmbedded__MarkerEClass, LINK_TO_ENTITY_EMBEDDED___MARKER__CONTEX_T__SR_C__SYSTEM);
		linkToEntityEmbedded__Marker_cONTEXT__SRC__systemEReference = (EReference) linkToEntityEmbedded__MarkerEClass.getEStructuralFeatures().get(3);
		createEReference(linkToEntityEmbedded__MarkerEClass, LINK_TO_ENTITY_EMBEDDED___MARKER__CONTEX_T__TR_G__COMP_ENTITY);
		linkToEntityEmbedded__Marker_cONTEXT__TRG__compEntityEReference = (EReference) linkToEntityEmbedded__MarkerEClass.getEStructuralFeatures().get(4);
		createEReference(linkToEntityEmbedded__MarkerEClass, LINK_TO_ENTITY_EMBEDDED___MARKER__CREAT_E__TR_G__LINK_ENTITY);
		linkToEntityEmbedded__Marker_cREATE__TRG__linkEntityEReference = (EReference) linkToEntityEmbedded__MarkerEClass.getEStructuralFeatures().get(5);
		createEReference(linkToEntityEmbedded__MarkerEClass, LINK_TO_ENTITY_EMBEDDED___MARKER__CONTEX_T__TR_G__PROT_ENTITY);
		linkToEntityEmbedded__Marker_cONTEXT__TRG__protEntityEReference = (EReference) linkToEntityEmbedded__MarkerEClass.getEStructuralFeatures().get(6);
		createEReference(linkToEntityEmbedded__MarkerEClass, LINK_TO_ENTITY_EMBEDDED___MARKER__CONTEX_T__TR_G__ROOT);
		linkToEntityEmbedded__Marker_cONTEXT__TRG__rootEReference = (EReference) linkToEntityEmbedded__MarkerEClass.getEStructuralFeatures().get(7);
		createEReference(linkToEntityEmbedded__MarkerEClass, LINK_TO_ENTITY_EMBEDDED___MARKER__CONTEX_T__COR_R__CTOE);
		linkToEntityEmbedded__Marker_cONTEXT__CORR__ctoeEReference = (EReference) linkToEntityEmbedded__MarkerEClass.getEStructuralFeatures().get(8);
		createEReference(linkToEntityEmbedded__MarkerEClass, LINK_TO_ENTITY_EMBEDDED___MARKER__CREAT_E__COR_R__LTOE);
		linkToEntityEmbedded__Marker_cREATE__CORR__ltoeEReference = (EReference) linkToEntityEmbedded__MarkerEClass.getEStructuralFeatures().get(9);
		createEReference(linkToEntityEmbedded__MarkerEClass, LINK_TO_ENTITY_EMBEDDED___MARKER__CONTEX_T__COR_R__PTOE);
		linkToEntityEmbedded__Marker_cONTEXT__CORR__ptoeEReference = (EReference) linkToEntityEmbedded__MarkerEClass.getEStructuralFeatures().get(10);
		createEReference(linkToEntityEmbedded__MarkerEClass, LINK_TO_ENTITY_EMBEDDED___MARKER__CONTEX_T__COR_R__STOR);
		linkToEntityEmbedded__Marker_cONTEXT__CORR__storEReference = (EReference) linkToEntityEmbedded__MarkerEClass.getEStructuralFeatures().get(11);
		
		protocolToEntity__MarkerEClass = createEClass(PROTOCOL_TO_ENTITY___MARKER);
		createEReference(protocolToEntity__MarkerEClass, PROTOCOL_TO_ENTITY___MARKER__CREAT_E__SR_C__PROTOCOL);
		protocolToEntity__Marker_cREATE__SRC__protocolEReference = (EReference) protocolToEntity__MarkerEClass.getEStructuralFeatures().get(0);
		createEReference(protocolToEntity__MarkerEClass, PROTOCOL_TO_ENTITY___MARKER__CONTEX_T__SR_C__SYSTEM);
		protocolToEntity__Marker_cONTEXT__SRC__systemEReference = (EReference) protocolToEntity__MarkerEClass.getEStructuralFeatures().get(1);
		createEReference(protocolToEntity__MarkerEClass, PROTOCOL_TO_ENTITY___MARKER__CREAT_E__TR_G__ENTITY);
		protocolToEntity__Marker_cREATE__TRG__entityEReference = (EReference) protocolToEntity__MarkerEClass.getEStructuralFeatures().get(2);
		createEReference(protocolToEntity__MarkerEClass, PROTOCOL_TO_ENTITY___MARKER__CONTEX_T__TR_G__ROOT);
		protocolToEntity__Marker_cONTEXT__TRG__rootEReference = (EReference) protocolToEntity__MarkerEClass.getEStructuralFeatures().get(3);
		createEReference(protocolToEntity__MarkerEClass, PROTOCOL_TO_ENTITY___MARKER__CREAT_E__COR_R__PTOE);
		protocolToEntity__Marker_cREATE__CORR__ptoeEReference = (EReference) protocolToEntity__MarkerEClass.getEStructuralFeatures().get(4);
		createEReference(protocolToEntity__MarkerEClass, PROTOCOL_TO_ENTITY___MARKER__CONTEX_T__COR_R__STOR);
		protocolToEntity__Marker_cONTEXT__CORR__storEReference = (EReference) protocolToEntity__MarkerEClass.getEStructuralFeatures().get(5);
		
		systemRefdComponentToEntity__MarkerEClass = createEClass(SYSTEM_REFD_COMPONENT_TO_ENTITY___MARKER);
		createEReference(systemRefdComponentToEntity__MarkerEClass, SYSTEM_REFD_COMPONENT_TO_ENTITY___MARKER__CREAT_E__SR_C__COMP);
		systemRefdComponentToEntity__Marker_cREATE__SRC__compEReference = (EReference) systemRefdComponentToEntity__MarkerEClass.getEStructuralFeatures().get(0);
		createEReference(systemRefdComponentToEntity__MarkerEClass, SYSTEM_REFD_COMPONENT_TO_ENTITY___MARKER__CONTEX_T__SR_C__SYSTEM);
		systemRefdComponentToEntity__Marker_cONTEXT__SRC__systemEReference = (EReference) systemRefdComponentToEntity__MarkerEClass.getEStructuralFeatures().get(1);
		createEReference(systemRefdComponentToEntity__MarkerEClass, SYSTEM_REFD_COMPONENT_TO_ENTITY___MARKER__CREAT_E__TR_G__ENTITY);
		systemRefdComponentToEntity__Marker_cREATE__TRG__entityEReference = (EReference) systemRefdComponentToEntity__MarkerEClass.getEStructuralFeatures().get(2);
		createEReference(systemRefdComponentToEntity__MarkerEClass, SYSTEM_REFD_COMPONENT_TO_ENTITY___MARKER__CONTEX_T__TR_G__ROOT);
		systemRefdComponentToEntity__Marker_cONTEXT__TRG__rootEReference = (EReference) systemRefdComponentToEntity__MarkerEClass.getEStructuralFeatures().get(3);
		createEReference(systemRefdComponentToEntity__MarkerEClass, SYSTEM_REFD_COMPONENT_TO_ENTITY___MARKER__CREAT_E__COR_R__CTOE);
		systemRefdComponentToEntity__Marker_cREATE__CORR__ctoeEReference = (EReference) systemRefdComponentToEntity__MarkerEClass.getEStructuralFeatures().get(4);
		createEReference(systemRefdComponentToEntity__MarkerEClass, SYSTEM_REFD_COMPONENT_TO_ENTITY___MARKER__CONTEX_T__COR_R__STOR);
		systemRefdComponentToEntity__Marker_cONTEXT__CORR__storEReference = (EReference) systemRefdComponentToEntity__MarkerEClass.getEStructuralFeatures().get(5);
		
		systemToRoot__MarkerEClass = createEClass(SYSTEM_TO_ROOT___MARKER);
		createEReference(systemToRoot__MarkerEClass, SYSTEM_TO_ROOT___MARKER__CREAT_E__SR_C__SYSTEM);
		systemToRoot__Marker_cREATE__SRC__systemEReference = (EReference) systemToRoot__MarkerEClass.getEStructuralFeatures().get(0);
		createEReference(systemToRoot__MarkerEClass, SYSTEM_TO_ROOT___MARKER__CREAT_E__TR_G__ROOT);
		systemToRoot__Marker_cREATE__TRG__rootEReference = (EReference) systemToRoot__MarkerEClass.getEStructuralFeatures().get(1);
		createEReference(systemToRoot__MarkerEClass, SYSTEM_TO_ROOT___MARKER__CREAT_E__COR_R__STOR);
		systemToRoot__Marker_cREATE__CORR__storEReference = (EReference) systemToRoot__MarkerEClass.getEStructuralFeatures().get(2);
		
		// Create enums
		
		// Create data types
	}

	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);
		
		// Obtain other dependent packages
		ModelPackage theModelPackagePackage = ModelPackage.eINSTANCE;
		Model2Package theModel2PackagePackage = Model2Package.eINSTANCE;
		RuntimePackage theRuntimePackagePackage = RuntimePackage.eINSTANCE;

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		systemToRootEClass.getESuperTypes().add(RuntimePackage.eINSTANCE.getCorrespondenceNode());
		componentToEntityEClass.getESuperTypes().add(RuntimePackage.eINSTANCE.getCorrespondenceNode());
		protocolToEntityEClass.getESuperTypes().add(RuntimePackage.eINSTANCE.getCorrespondenceNode());
		linkToEntityEClass.getESuperTypes().add(RuntimePackage.eINSTANCE.getCorrespondenceNode());
		componentToEntity__MarkerEClass.getESuperTypes().add(RuntimePackage.eINSTANCE.getTGGRuleApplication());
		linkToEntity__MarkerEClass.getESuperTypes().add(RuntimePackage.eINSTANCE.getTGGRuleApplication());
		linkToEntityEmbedded__MarkerEClass.getESuperTypes().add(RuntimePackage.eINSTANCE.getTGGRuleApplication());
		protocolToEntity__MarkerEClass.getESuperTypes().add(RuntimePackage.eINSTANCE.getTGGRuleApplication());
		systemRefdComponentToEntity__MarkerEClass.getESuperTypes().add(RuntimePackage.eINSTANCE.getTGGRuleApplication());
		systemToRoot__MarkerEClass.getESuperTypes().add(RuntimePackage.eINSTANCE.getTGGRuleApplication());

		// Initialize classes, features, and operations; add parameters
		initEClass(systemToRootEClass, SystemToRoot.class, "SystemToRoot", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystemToRoot_Source(), ModelPackage.eINSTANCE.getSystem(),  null, 
			"source", null, 0, 1, SystemToRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemToRoot_Target(), Model2Package.eINSTANCE.getRoot(),  null, 
			"target", null, 0, 1, SystemToRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
				
		initEClass(componentToEntityEClass, ComponentToEntity.class, "ComponentToEntity", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentToEntity_Source(), ModelPackage.eINSTANCE.getComponent(),  null, 
			"source", null, 0, 1, ComponentToEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentToEntity_Target(), Model2Package.eINSTANCE.getEntity(),  null, 
			"target", null, 0, 1, ComponentToEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
				
		initEClass(protocolToEntityEClass, ProtocolToEntity.class, "ProtocolToEntity", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProtocolToEntity_Source(), ModelPackage.eINSTANCE.getProtocol(),  null, 
			"source", null, 0, 1, ProtocolToEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProtocolToEntity_Target(), Model2Package.eINSTANCE.getEntity(),  null, 
			"target", null, 0, 1, ProtocolToEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
				
		initEClass(linkToEntityEClass, LinkToEntity.class, "LinkToEntity", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLinkToEntity_Source(), ModelPackage.eINSTANCE.getLink(),  null, 
			"source", null, 0, 1, LinkToEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLinkToEntity_Target(), Model2Package.eINSTANCE.getEntity(),  null, 
			"target", null, 0, 1, LinkToEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
				
		initEClass(componentToEntity__MarkerEClass, ComponentToEntity__Marker.class, "ComponentToEntity__Marker", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentToEntity__Marker_CREATE__SRC__comp(), ModelPackage.eINSTANCE.getComponent(),  null, 
			"CREATE__SRC__comp", null, 1, 1, ComponentToEntity__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentToEntity__Marker_CREATE__TRG__entity(), Model2Package.eINSTANCE.getEntity(),  null, 
			"CREATE__TRG__entity", null, 1, 1, ComponentToEntity__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentToEntity__Marker_CREATE__CORR__ctoe(), this.getComponentToEntity(),  null, 
			"CREATE__CORR__ctoe", null, 1, 1, ComponentToEntity__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
				
		initEClass(linkToEntity__MarkerEClass, LinkToEntity__Marker.class, "LinkToEntity__Marker", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLinkToEntity__Marker_CREATE__SRC__link(), ModelPackage.eINSTANCE.getLink(),  null, 
			"CREATE__SRC__link", null, 1, 1, LinkToEntity__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLinkToEntity__Marker_CONTEXT__SRC__protocol(), ModelPackage.eINSTANCE.getProtocol(),  null, 
			"CONTEXT__SRC__protocol", null, 1, 1, LinkToEntity__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLinkToEntity__Marker_CREATE__TRG__entity(), Model2Package.eINSTANCE.getEntity(),  null, 
			"CREATE__TRG__entity", null, 1, 1, LinkToEntity__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLinkToEntity__Marker_CREATE__CORR__ltoe(), this.getLinkToEntity(),  null, 
			"CREATE__CORR__ltoe", null, 1, 1, LinkToEntity__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
				
		initEClass(linkToEntityEmbedded__MarkerEClass, LinkToEntityEmbedded__Marker.class, "LinkToEntityEmbedded__Marker", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLinkToEntityEmbedded__Marker_CONTEXT__SRC__component(), ModelPackage.eINSTANCE.getComponent(),  null, 
			"CONTEXT__SRC__component", null, 1, 1, LinkToEntityEmbedded__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLinkToEntityEmbedded__Marker_CREATE__SRC__link(), ModelPackage.eINSTANCE.getLink(),  null, 
			"CREATE__SRC__link", null, 1, 1, LinkToEntityEmbedded__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLinkToEntityEmbedded__Marker_CONTEXT__SRC__protocol(), ModelPackage.eINSTANCE.getProtocol(),  null, 
			"CONTEXT__SRC__protocol", null, 1, 1, LinkToEntityEmbedded__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLinkToEntityEmbedded__Marker_CONTEXT__SRC__system(), ModelPackage.eINSTANCE.getSystem(),  null, 
			"CONTEXT__SRC__system", null, 1, 1, LinkToEntityEmbedded__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLinkToEntityEmbedded__Marker_CONTEXT__TRG__compEntity(), Model2Package.eINSTANCE.getEntity(),  null, 
			"CONTEXT__TRG__compEntity", null, 1, 1, LinkToEntityEmbedded__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLinkToEntityEmbedded__Marker_CREATE__TRG__linkEntity(), Model2Package.eINSTANCE.getEntity(),  null, 
			"CREATE__TRG__linkEntity", null, 1, 1, LinkToEntityEmbedded__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLinkToEntityEmbedded__Marker_CONTEXT__TRG__protEntity(), Model2Package.eINSTANCE.getEntity(),  null, 
			"CONTEXT__TRG__protEntity", null, 1, 1, LinkToEntityEmbedded__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLinkToEntityEmbedded__Marker_CONTEXT__TRG__root(), Model2Package.eINSTANCE.getRoot(),  null, 
			"CONTEXT__TRG__root", null, 1, 1, LinkToEntityEmbedded__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLinkToEntityEmbedded__Marker_CONTEXT__CORR__ctoe(), this.getComponentToEntity(),  null, 
			"CONTEXT__CORR__ctoe", null, 1, 1, LinkToEntityEmbedded__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLinkToEntityEmbedded__Marker_CREATE__CORR__ltoe(), this.getLinkToEntity(),  null, 
			"CREATE__CORR__ltoe", null, 1, 1, LinkToEntityEmbedded__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLinkToEntityEmbedded__Marker_CONTEXT__CORR__ptoe(), this.getProtocolToEntity(),  null, 
			"CONTEXT__CORR__ptoe", null, 1, 1, LinkToEntityEmbedded__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLinkToEntityEmbedded__Marker_CONTEXT__CORR__stor(), this.getSystemToRoot(),  null, 
			"CONTEXT__CORR__stor", null, 1, 1, LinkToEntityEmbedded__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
				
		initEClass(protocolToEntity__MarkerEClass, ProtocolToEntity__Marker.class, "ProtocolToEntity__Marker", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProtocolToEntity__Marker_CREATE__SRC__protocol(), ModelPackage.eINSTANCE.getProtocol(),  null, 
			"CREATE__SRC__protocol", null, 1, 1, ProtocolToEntity__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProtocolToEntity__Marker_CONTEXT__SRC__system(), ModelPackage.eINSTANCE.getSystem(),  null, 
			"CONTEXT__SRC__system", null, 1, 1, ProtocolToEntity__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProtocolToEntity__Marker_CREATE__TRG__entity(), Model2Package.eINSTANCE.getEntity(),  null, 
			"CREATE__TRG__entity", null, 1, 1, ProtocolToEntity__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProtocolToEntity__Marker_CONTEXT__TRG__root(), Model2Package.eINSTANCE.getRoot(),  null, 
			"CONTEXT__TRG__root", null, 1, 1, ProtocolToEntity__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProtocolToEntity__Marker_CREATE__CORR__ptoe(), this.getProtocolToEntity(),  null, 
			"CREATE__CORR__ptoe", null, 1, 1, ProtocolToEntity__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProtocolToEntity__Marker_CONTEXT__CORR__stor(), this.getSystemToRoot(),  null, 
			"CONTEXT__CORR__stor", null, 1, 1, ProtocolToEntity__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
				
		initEClass(systemRefdComponentToEntity__MarkerEClass, SystemRefdComponentToEntity__Marker.class, "SystemRefdComponentToEntity__Marker", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystemRefdComponentToEntity__Marker_CREATE__SRC__comp(), ModelPackage.eINSTANCE.getComponent(),  null, 
			"CREATE__SRC__comp", null, 1, 1, SystemRefdComponentToEntity__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemRefdComponentToEntity__Marker_CONTEXT__SRC__system(), ModelPackage.eINSTANCE.getSystem(),  null, 
			"CONTEXT__SRC__system", null, 1, 1, SystemRefdComponentToEntity__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemRefdComponentToEntity__Marker_CREATE__TRG__entity(), Model2Package.eINSTANCE.getEntity(),  null, 
			"CREATE__TRG__entity", null, 1, 1, SystemRefdComponentToEntity__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemRefdComponentToEntity__Marker_CONTEXT__TRG__root(), Model2Package.eINSTANCE.getRoot(),  null, 
			"CONTEXT__TRG__root", null, 1, 1, SystemRefdComponentToEntity__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemRefdComponentToEntity__Marker_CREATE__CORR__ctoe(), this.getComponentToEntity(),  null, 
			"CREATE__CORR__ctoe", null, 1, 1, SystemRefdComponentToEntity__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemRefdComponentToEntity__Marker_CONTEXT__CORR__stor(), this.getSystemToRoot(),  null, 
			"CONTEXT__CORR__stor", null, 1, 1, SystemRefdComponentToEntity__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
				
		initEClass(systemToRoot__MarkerEClass, SystemToRoot__Marker.class, "SystemToRoot__Marker", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystemToRoot__Marker_CREATE__SRC__system(), ModelPackage.eINSTANCE.getSystem(),  null, 
			"CREATE__SRC__system", null, 1, 1, SystemToRoot__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemToRoot__Marker_CREATE__TRG__root(), Model2Package.eINSTANCE.getRoot(),  null, 
			"CREATE__TRG__root", null, 1, 1, SystemToRoot__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemToRoot__Marker_CREATE__CORR__stor(), this.getSystemToRoot(),  null, 
			"CREATE__CORR__stor", null, 1, 1, SystemToRoot__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
				
		
		// Initialize enums and add enum literals
		
		// Initialize data types
		
		// Create resource
		createResource(eNS_URI);
	}

} 

