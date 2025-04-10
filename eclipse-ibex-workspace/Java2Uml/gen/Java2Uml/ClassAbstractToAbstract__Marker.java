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

public interface ClassAbstractToAbstract__Marker extends EObject, runtime.TGGRuleApplication {
	
    public runtime.Protocol getProtocol();
    
    public void setProtocol(runtime.Protocol value);
    
    public org.emftext.language.java.classifiers.Class getCONTEXT__SRC__javaConcreteClassifier();
    
    public void setCONTEXT__SRC__javaConcreteClassifier(org.emftext.language.java.classifiers.Class value);
    
    public org.emftext.language.java.modifiers.Abstract getCREATE__SRC__modifier();
    
    public void setCREATE__SRC__modifier(org.emftext.language.java.modifiers.Abstract value);
    
    public org.eclipse.uml2.uml.Class getCONTEXT__TRG__umlClassifier();
    
    public void setCONTEXT__TRG__umlClassifier(org.eclipse.uml2.uml.Class value);
    
    public Java2Uml.JavaClassifierToUmlClassifier getCONTEXT__CORR__javaClassifierToUmlClassifier();
    
    public void setCONTEXT__CORR__javaClassifierToUmlClassifier(Java2Uml.JavaClassifierToUmlClassifier value);
    

}
