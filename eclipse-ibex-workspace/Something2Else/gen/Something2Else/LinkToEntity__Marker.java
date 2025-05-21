package Something2Else;

import runtime.RuntimePackage;
import Something2Else.Something2ElsePackage;

import org.emoflon.smartemf.runtime.notification.SmartEMFNotification;
import org.emoflon.smartemf.runtime.SmartObject;
import org.emoflon.smartemf.runtime.collections.*;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public interface LinkToEntity__Marker extends EObject, runtime.TGGRuleApplication {
	
    public runtime.Protocol getProtocol();
    
    public void setProtocol(runtime.Protocol value);
    
    public tools.vitruv.methodologisttemplate.model.model.Link getCREATE__SRC__link();
    
    public void setCREATE__SRC__link(tools.vitruv.methodologisttemplate.model.model.Link value);
    
    public tools.vitruv.methodologisttemplate.model.model.Protocol getCONTEXT__SRC__protocol();
    
    public void setCONTEXT__SRC__protocol(tools.vitruv.methodologisttemplate.model.model.Protocol value);
    
    public tools.vitruv.methodologisttemplate.model.model2.Entity getCREATE__TRG__entity();
    
    public void setCREATE__TRG__entity(tools.vitruv.methodologisttemplate.model.model2.Entity value);
    
    public Something2Else.LinkToEntity getCREATE__CORR__ltoe();
    
    public void setCREATE__CORR__ltoe(Something2Else.LinkToEntity value);
    

}
