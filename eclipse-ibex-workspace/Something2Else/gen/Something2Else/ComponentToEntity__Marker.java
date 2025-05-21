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

public interface ComponentToEntity__Marker extends EObject, runtime.TGGRuleApplication {
	
    public runtime.Protocol getProtocol();
    
    public void setProtocol(runtime.Protocol value);
    
    public tools.vitruv.methodologisttemplate.model.model.Component getCREATE__SRC__comp();
    
    public void setCREATE__SRC__comp(tools.vitruv.methodologisttemplate.model.model.Component value);
    
    public tools.vitruv.methodologisttemplate.model.model2.Entity getCREATE__TRG__entity();
    
    public void setCREATE__TRG__entity(tools.vitruv.methodologisttemplate.model.model2.Entity value);
    
    public Something2Else.ComponentToEntity getCREATE__CORR__ctoe();
    
    public void setCREATE__CORR__ctoe(Something2Else.ComponentToEntity value);
    

}
