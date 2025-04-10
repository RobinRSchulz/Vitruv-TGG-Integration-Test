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

public interface ClassMethodToMethod__Marker extends EObject, runtime.TGGRuleApplication {
	
    public runtime.Protocol getProtocol();
    
    public void setProtocol(runtime.Protocol value);
    
    public org.emftext.language.java.classifiers.Class getCONTEXT__SRC__javaConcreteClassifier();
    
    public void setCONTEXT__SRC__javaConcreteClassifier(org.emftext.language.java.classifiers.Class value);
    
    public org.emftext.language.java.members.ClassMethod getCREATE__SRC__method();
    
    public void setCREATE__SRC__method(org.emftext.language.java.members.ClassMethod value);
    
    public org.eclipse.uml2.uml.Class getCONTEXT__TRG__umlClassifier();
    
    public void setCONTEXT__TRG__umlClassifier(org.eclipse.uml2.uml.Class value);
    
    public org.eclipse.uml2.uml.Operation getCREATE__TRG__umlOperation();
    
    public void setCREATE__TRG__umlOperation(org.eclipse.uml2.uml.Operation value);
    
    public Java2Uml.JavaClassifierToUmlClassifier getCONTEXT__CORR__j();
    
    public void setCONTEXT__CORR__j(Java2Uml.JavaClassifierToUmlClassifier value);
    
    public Java2Uml.JavaMethodToOperation getCREATE__CORR__javaMethodToOperation();
    
    public void setCREATE__CORR__javaMethodToOperation(Java2Uml.JavaMethodToOperation value);
    

}
