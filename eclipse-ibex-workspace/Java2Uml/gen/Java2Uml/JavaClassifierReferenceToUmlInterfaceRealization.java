package Java2Uml;

import runtime.RuntimePackage;
import Java2Uml.Java2UmlPackage;

import org.emoflon.smartemf.runtime.notification.SmartEMFNotification;
import org.emoflon.smartemf.runtime.SmartObject;
import org.emoflon.smartemf.runtime.collections.*;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public interface JavaClassifierReferenceToUmlInterfaceRealization extends EObject, runtime.CorrespondenceNode {
	
    public org.emftext.language.java.types.TypeReference getSource();
    
    public void setSource(org.emftext.language.java.types.TypeReference value);
    
    public org.eclipse.uml2.uml.InterfaceRealization getTarget();
    
    public void setTarget(org.eclipse.uml2.uml.InterfaceRealization value);
    

}
