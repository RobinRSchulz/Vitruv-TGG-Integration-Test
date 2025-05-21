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

public interface SystemToRoot__Marker extends EObject, runtime.TGGRuleApplication {
	
    public runtime.Protocol getProtocol();
    
    public void setProtocol(runtime.Protocol value);
    
    public tools.vitruv.methodologisttemplate.model.model.System getCREATE__SRC__system();
    
    public void setCREATE__SRC__system(tools.vitruv.methodologisttemplate.model.model.System value);
    
    public tools.vitruv.methodologisttemplate.model.model2.Root getCREATE__TRG__root();
    
    public void setCREATE__TRG__root(tools.vitruv.methodologisttemplate.model.model2.Root value);
    
    public Something2Else.SystemToRoot getCREATE__CORR__stor();
    
    public void setCREATE__CORR__stor(Something2Else.SystemToRoot value);
    

}
