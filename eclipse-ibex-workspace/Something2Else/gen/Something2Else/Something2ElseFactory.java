package Something2Else;

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

import org.eclipse.emf.ecore.EFactory;

public interface Something2ElseFactory extends EFactory {

	Something2ElseFactory eINSTANCE = Something2Else.impl.Something2ElseFactoryImpl.init();
	
	SystemToRoot createSystemToRoot();
	
	ComponentToEntity createComponentToEntity();
	
	ProtocolToEntity createProtocolToEntity();
	
	LinkToEntity createLinkToEntity();
	
	ComponentToEntity__Marker createComponentToEntity__Marker();
	
	LinkToEntity__Marker createLinkToEntity__Marker();
	
	LinkToEntityEmbedded__Marker createLinkToEntityEmbedded__Marker();
	
	ProtocolToEntity__Marker createProtocolToEntity__Marker();
	
	SystemRefdComponentToEntity__Marker createSystemRefdComponentToEntity__Marker();
	
	SystemToRoot__Marker createSystemToRoot__Marker();
	
	
	Something2ElsePackage getSomething2ElsePackage();

}
