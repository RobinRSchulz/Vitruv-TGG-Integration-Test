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

public interface MethodEnumReturnTypeToReturnType__Marker extends EObject, runtime.TGGRuleApplication {
	
    public runtime.Protocol getProtocol();
    
    public void setProtocol(runtime.Protocol value);
    
    public org.emftext.language.java.classifiers.Enumeration getCONTEXT__SRC__classifier();
    
    public void setCONTEXT__SRC__classifier(org.emftext.language.java.classifiers.Enumeration value);
    
    public org.emftext.language.java.members.ClassMethod getCONTEXT__SRC__javaMethod();
    
    public void setCONTEXT__SRC__javaMethod(org.emftext.language.java.members.ClassMethod value);
    
    public org.emftext.language.java.types.ClassifierReference getCREATE__SRC__typeReference();
    
    public void setCREATE__SRC__typeReference(org.emftext.language.java.types.ClassifierReference value);
    
    public org.eclipse.uml2.uml.Enumeration getCONTEXT__TRG__umlClassifier();
    
    public void setCONTEXT__TRG__umlClassifier(org.eclipse.uml2.uml.Enumeration value);
    
    public org.eclipse.uml2.uml.Operation getCONTEXT__TRG__umlOperation();
    
    public void setCONTEXT__TRG__umlOperation(org.eclipse.uml2.uml.Operation value);
    
    public org.eclipse.uml2.uml.Parameter getCREATE__TRG__umlReturnParameter();
    
    public void setCREATE__TRG__umlReturnParameter(org.eclipse.uml2.uml.Parameter value);
    
    public Java2Uml.JavaClassifierToUmlClassifier getCONTEXT__CORR__javaClassifierToUmlClassifier();
    
    public void setCONTEXT__CORR__javaClassifierToUmlClassifier(Java2Uml.JavaClassifierToUmlClassifier value);
    
    public Java2Uml.JavaMethodToOperation getCONTEXT__CORR__javaMethodToOperation();
    
    public void setCONTEXT__CORR__javaMethodToOperation(Java2Uml.JavaMethodToOperation value);
    
    public Java2Uml.JavaTypeReferenceToUmlReturnParameter getCREATE__CORR__javaTypeReferenceToUmlReturnParameter();
    
    public void setCREATE__CORR__javaTypeReferenceToUmlReturnParameter(Java2Uml.JavaTypeReferenceToUmlReturnParameter value);
    

}
