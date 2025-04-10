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

public interface MethodAbstractToAbstract__Marker extends EObject, runtime.TGGRuleApplication {
	
    public runtime.Protocol getProtocol();
    
    public void setProtocol(runtime.Protocol value);
    
    public org.emftext.language.java.members.ClassMethod getCONTEXT__SRC__javaMethod();
    
    public void setCONTEXT__SRC__javaMethod(org.emftext.language.java.members.ClassMethod value);
    
    public org.emftext.language.java.modifiers.Abstract getCREATE__SRC__modifier();
    
    public void setCREATE__SRC__modifier(org.emftext.language.java.modifiers.Abstract value);
    
    public org.eclipse.uml2.uml.Operation getCONTEXT__TRG__umlOperation();
    
    public void setCONTEXT__TRG__umlOperation(org.eclipse.uml2.uml.Operation value);
    
    public Java2Uml.JavaMethodToOperation getCONTEXT__CORR__javaMethodToOperation();
    
    public void setCONTEXT__CORR__javaMethodToOperation(Java2Uml.JavaMethodToOperation value);
    

}
