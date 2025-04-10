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

public interface InterfaceConstructorToConstructor__Marker extends EObject, runtime.TGGRuleApplication {
	
    public runtime.Protocol getProtocol();
    
    public void setProtocol(runtime.Protocol value);
    
    public org.emftext.language.java.members.Constructor getCREATE__SRC__constructor();
    
    public void setCREATE__SRC__constructor(org.emftext.language.java.members.Constructor value);
    
    public org.emftext.language.java.classifiers.Interface getCONTEXT__SRC__javaConcreteClassifier();
    
    public void setCONTEXT__SRC__javaConcreteClassifier(org.emftext.language.java.classifiers.Interface value);
    
    public org.eclipse.uml2.uml.Interface getCONTEXT__TRG__umlClassifier();
    
    public void setCONTEXT__TRG__umlClassifier(org.eclipse.uml2.uml.Interface value);
    
    public org.eclipse.uml2.uml.Operation getCREATE__TRG__umlOperation();
    
    public void setCREATE__TRG__umlOperation(org.eclipse.uml2.uml.Operation value);
    
    public Java2Uml.JavaClassifierToUmlClassifier getCONTEXT__CORR__j();
    
    public void setCONTEXT__CORR__j(Java2Uml.JavaClassifierToUmlClassifier value);
    
    public Java2Uml.JavaConstructorToOperation getCREATE__CORR__javaConstructorToOperation();
    
    public void setCREATE__CORR__javaConstructorToOperation(Java2Uml.JavaConstructorToOperation value);
    

}
