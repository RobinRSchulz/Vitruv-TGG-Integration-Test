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

public interface MethodClassParamTypeToParamType__Marker extends EObject, runtime.TGGRuleApplication {
	
    public runtime.Protocol getProtocol();
    
    public void setProtocol(runtime.Protocol value);
    
    public org.emftext.language.java.classifiers.Class getCONTEXT__SRC__classifier();
    
    public void setCONTEXT__SRC__classifier(org.emftext.language.java.classifiers.Class value);
    
    public org.emftext.language.java.members.ClassMethod getCONTEXT__SRC__javaParametrizable();
    
    public void setCONTEXT__SRC__javaParametrizable(org.emftext.language.java.members.ClassMethod value);
    
    public org.emftext.language.java.parameters.Parameter getCONTEXT__SRC__parameter();
    
    public void setCONTEXT__SRC__parameter(org.emftext.language.java.parameters.Parameter value);
    
    public org.emftext.language.java.types.ClassifierReference getCREATE__SRC__typeReference();
    
    public void setCREATE__SRC__typeReference(org.emftext.language.java.types.ClassifierReference value);
    
    public org.eclipse.uml2.uml.Class getCONTEXT__TRG__umlClassifier();
    
    public void setCONTEXT__TRG__umlClassifier(org.eclipse.uml2.uml.Class value);
    
    public org.eclipse.uml2.uml.Operation getCONTEXT__TRG__umlOperation();
    
    public void setCONTEXT__TRG__umlOperation(org.eclipse.uml2.uml.Operation value);
    
    public org.eclipse.uml2.uml.Parameter getCONTEXT__TRG__umlParameter();
    
    public void setCONTEXT__TRG__umlParameter(org.eclipse.uml2.uml.Parameter value);
    
    public Java2Uml.JavaClassifierToUmlClassifier getCONTEXT__CORR__javaClassifierToUmlClassifier();
    
    public void setCONTEXT__CORR__javaClassifierToUmlClassifier(Java2Uml.JavaClassifierToUmlClassifier value);
    
    public Java2Uml.JavaMethodToOperation getCONTEXT__CORR__javaConstructorToOperation();
    
    public void setCONTEXT__CORR__javaConstructorToOperation(Java2Uml.JavaMethodToOperation value);
    
    public Java2Uml.JavaParameterToParameter getCONTEXT__CORR__parameterToParameter();
    
    public void setCONTEXT__CORR__parameterToParameter(Java2Uml.JavaParameterToParameter value);
    

}
