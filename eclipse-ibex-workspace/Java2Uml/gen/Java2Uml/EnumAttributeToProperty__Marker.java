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

public interface EnumAttributeToProperty__Marker extends EObject, runtime.TGGRuleApplication {
	
    public runtime.Protocol getProtocol();
    
    public void setProtocol(runtime.Protocol value);
    
    public org.emftext.language.java.classifiers.Enumeration getCONTEXT__SRC__classifier();
    
    public void setCONTEXT__SRC__classifier(org.emftext.language.java.classifiers.Enumeration value);
    
    public org.emftext.language.java.members.Field getCREATE__SRC__field();
    
    public void setCREATE__SRC__field(org.emftext.language.java.members.Field value);
    
    public org.eclipse.uml2.uml.Property getCREATE__TRG__property();
    
    public void setCREATE__TRG__property(org.eclipse.uml2.uml.Property value);
    
    public org.eclipse.uml2.uml.Enumeration getCONTEXT__TRG__umlClassifier();
    
    public void setCONTEXT__TRG__umlClassifier(org.eclipse.uml2.uml.Enumeration value);
    
    public Java2Uml.JavaAttributeToUmlProperty getCREATE__CORR__attributeToProperty();
    
    public void setCREATE__CORR__attributeToProperty(Java2Uml.JavaAttributeToUmlProperty value);
    
    public Java2Uml.JavaClassifierToUmlClassifier getCONTEXT__CORR__classToUmlClass();
    
    public void setCONTEXT__CORR__classToUmlClass(Java2Uml.JavaClassifierToUmlClassifier value);
    

}
