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

public interface EnumConstantToEnumConstant__Marker extends EObject, runtime.TGGRuleApplication {
	
    public runtime.Protocol getProtocol();
    
    public void setProtocol(runtime.Protocol value);
    
    public org.emftext.language.java.members.EnumConstant getCREATE__SRC__javaConstant();
    
    public void setCREATE__SRC__javaConstant(org.emftext.language.java.members.EnumConstant value);
    
    public org.emftext.language.java.classifiers.Enumeration getCONTEXT__SRC__javaEnum();
    
    public void setCONTEXT__SRC__javaEnum(org.emftext.language.java.classifiers.Enumeration value);
    
    public org.eclipse.uml2.uml.Enumeration getCONTEXT__TRG__umlEnum();
    
    public void setCONTEXT__TRG__umlEnum(org.eclipse.uml2.uml.Enumeration value);
    
    public org.eclipse.uml2.uml.EnumerationLiteral getCREATE__TRG__umlLiteral();
    
    public void setCREATE__TRG__umlLiteral(org.eclipse.uml2.uml.EnumerationLiteral value);
    
    public Java2Uml.JavaClassifierToUmlClassifier getCONTEXT__CORR__j();
    
    public void setCONTEXT__CORR__j(Java2Uml.JavaClassifierToUmlClassifier value);
    
    public Java2Uml.JavaEnumConstantToUmlEnumLiteral getCREATE__CORR__javaEnumConstantToUmlEnumLiteral();
    
    public void setCREATE__CORR__javaEnumConstantToUmlEnumLiteral(Java2Uml.JavaEnumConstantToUmlEnumLiteral value);
    

}
