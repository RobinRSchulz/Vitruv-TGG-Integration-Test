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

public interface FieldStaticToStatic__Marker extends EObject, runtime.TGGRuleApplication {
	
    public runtime.Protocol getProtocol();
    
    public void setProtocol(runtime.Protocol value);
    
    public org.emftext.language.java.members.Field getCONTEXT__SRC__javaField();
    
    public void setCONTEXT__SRC__javaField(org.emftext.language.java.members.Field value);
    
    public org.emftext.language.java.modifiers.Static getCREATE__SRC__modifier();
    
    public void setCREATE__SRC__modifier(org.emftext.language.java.modifiers.Static value);
    
    public org.eclipse.uml2.uml.Property getCONTEXT__TRG__umlProperty();
    
    public void setCONTEXT__TRG__umlProperty(org.eclipse.uml2.uml.Property value);
    
    public Java2Uml.JavaAttributeToUmlProperty getCONTEXT__CORR__javaClassifierToUmlProperty();
    
    public void setCONTEXT__CORR__javaClassifierToUmlProperty(Java2Uml.JavaAttributeToUmlProperty value);
    

}
