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

public interface SystemToRoot extends EObject, runtime.CorrespondenceNode {
	
    public tools.vitruv.methodologisttemplate.model.model.System getSource();
    
    public void setSource(tools.vitruv.methodologisttemplate.model.model.System value);
    
    public tools.vitruv.methodologisttemplate.model.model2.Root getTarget();
    
    public void setTarget(tools.vitruv.methodologisttemplate.model.model2.Root value);
    

}
