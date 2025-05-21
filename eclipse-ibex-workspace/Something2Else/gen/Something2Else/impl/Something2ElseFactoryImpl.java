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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

public class Something2ElseFactoryImpl extends EFactoryImpl implements Something2Else.Something2ElseFactory {

	public static Something2Else.Something2ElseFactory init() {
		try {
			Something2ElseFactory theSomething2ElseFactory = (Something2ElseFactory) EPackage.Registry.INSTANCE
					.getEFactory(Something2ElsePackage.eNS_URI);
			if (theSomething2ElseFactory != null) {
				return theSomething2ElseFactory;
			}
		} catch (java.lang.Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Something2ElseFactoryImpl();
	}

	public Something2ElseFactoryImpl() {
		super();
	}

	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case Something2ElsePackage.SYSTEM_TO_ROOT:
			return createSystemToRoot();
		case Something2ElsePackage.COMPONENT_TO_ENTITY:
			return createComponentToEntity();
		case Something2ElsePackage.PROTOCOL_TO_ENTITY:
			return createProtocolToEntity();
		case Something2ElsePackage.LINK_TO_ENTITY:
			return createLinkToEntity();
		case Something2ElsePackage.COMPONENT_TO_ENTITY___MARKER:
			return createComponentToEntity__Marker();
		case Something2ElsePackage.LINK_TO_ENTITY___MARKER:
			return createLinkToEntity__Marker();
		case Something2ElsePackage.LINK_TO_ENTITY_EMBEDDED___MARKER:
			return createLinkToEntityEmbedded__Marker();
		case Something2ElsePackage.PROTOCOL_TO_ENTITY___MARKER:
			return createProtocolToEntity__Marker();
		case Something2ElsePackage.SYSTEM_REFD_COMPONENT_TO_ENTITY___MARKER:
			return createSystemRefdComponentToEntity__Marker();
		case Something2ElsePackage.SYSTEM_TO_ROOT___MARKER:
			return createSystemToRoot__Marker();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}
	
	
	@Override
	public Something2Else.SystemToRoot createSystemToRoot() {
		SystemToRootImpl systemToRoot = new SystemToRootImpl();
		return systemToRoot;
	}
	@Override
	public Something2Else.ComponentToEntity createComponentToEntity() {
		ComponentToEntityImpl componentToEntity = new ComponentToEntityImpl();
		return componentToEntity;
	}
	@Override
	public Something2Else.ProtocolToEntity createProtocolToEntity() {
		ProtocolToEntityImpl protocolToEntity = new ProtocolToEntityImpl();
		return protocolToEntity;
	}
	@Override
	public Something2Else.LinkToEntity createLinkToEntity() {
		LinkToEntityImpl linkToEntity = new LinkToEntityImpl();
		return linkToEntity;
	}
	@Override
	public Something2Else.ComponentToEntity__Marker createComponentToEntity__Marker() {
		ComponentToEntity__MarkerImpl componentToEntity__Marker = new ComponentToEntity__MarkerImpl();
		return componentToEntity__Marker;
	}
	@Override
	public Something2Else.LinkToEntity__Marker createLinkToEntity__Marker() {
		LinkToEntity__MarkerImpl linkToEntity__Marker = new LinkToEntity__MarkerImpl();
		return linkToEntity__Marker;
	}
	@Override
	public Something2Else.LinkToEntityEmbedded__Marker createLinkToEntityEmbedded__Marker() {
		LinkToEntityEmbedded__MarkerImpl linkToEntityEmbedded__Marker = new LinkToEntityEmbedded__MarkerImpl();
		return linkToEntityEmbedded__Marker;
	}
	@Override
	public Something2Else.ProtocolToEntity__Marker createProtocolToEntity__Marker() {
		ProtocolToEntity__MarkerImpl protocolToEntity__Marker = new ProtocolToEntity__MarkerImpl();
		return protocolToEntity__Marker;
	}
	@Override
	public Something2Else.SystemRefdComponentToEntity__Marker createSystemRefdComponentToEntity__Marker() {
		SystemRefdComponentToEntity__MarkerImpl systemRefdComponentToEntity__Marker = new SystemRefdComponentToEntity__MarkerImpl();
		return systemRefdComponentToEntity__Marker;
	}
	@Override
	public Something2Else.SystemToRoot__Marker createSystemToRoot__Marker() {
		SystemToRoot__MarkerImpl systemToRoot__Marker = new SystemToRoot__MarkerImpl();
		return systemToRoot__Marker;
	}
	

	@Override
	public Something2ElsePackage getSomething2ElsePackage() {
	return (Something2ElsePackage) getEPackage();
	}
} 
