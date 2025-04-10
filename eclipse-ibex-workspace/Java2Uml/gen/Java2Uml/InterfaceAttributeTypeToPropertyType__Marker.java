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

public interface InterfaceAttributeTypeToPropertyType__Marker extends EObject, runtime.TGGRuleApplication {
	
    public runtime.Protocol getProtocol();
    
    public void setProtocol(runtime.Protocol value);
    
    public org.emftext.language.java.classifiers.Interface getCONTEXT__SRC__classifier();
    
    public void setCONTEXT__SRC__classifier(org.emftext.language.java.classifiers.Interface value);
    
    public org.emftext.language.java.members.Field getCONTEXT__SRC__field();
    
    public void setCONTEXT__SRC__field(org.emftext.language.java.members.Field value);
    
    public org.emftext.language.java.types.ClassifierReference getCREATE__SRC__typeReference();
    
    public void setCREATE__SRC__typeReference(org.emftext.language.java.types.ClassifierReference value);
    
    public org.eclipse.uml2.uml.Property getCONTEXT__TRG__property();
    
    public void setCONTEXT__TRG__property(org.eclipse.uml2.uml.Property value);
    
    public org.eclipse.uml2.uml.Interface getCONTEXT__TRG__umlClassifier();
    
    public void setCONTEXT__TRG__umlClassifier(org.eclipse.uml2.uml.Interface value);
    
    public Java2Uml.JavaAttributeToUmlProperty getCONTEXT__CORR__attributeToProperty();
    
    public void setCONTEXT__CORR__attributeToProperty(Java2Uml.JavaAttributeToUmlProperty value);
    
    public Java2Uml.JavaClassifierToUmlClassifier getCONTEXT__CORR__javaClassifierToUmlClassifier();
    
    public void setCONTEXT__CORR__javaClassifierToUmlClassifier(Java2Uml.JavaClassifierToUmlClassifier value);
    

}
