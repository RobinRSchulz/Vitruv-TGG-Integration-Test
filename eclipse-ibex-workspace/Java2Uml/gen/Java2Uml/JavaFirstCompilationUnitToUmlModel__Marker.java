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

public interface JavaFirstCompilationUnitToUmlModel__Marker extends EObject, runtime.TGGRuleApplication {
	
    public runtime.Protocol getProtocol();
    
    public void setProtocol(runtime.Protocol value);
    
    public org.emftext.language.java.containers.CompilationUnit getCREATE__SRC__compilationUnit();
    
    public void setCREATE__SRC__compilationUnit(org.emftext.language.java.containers.CompilationUnit value);
    
    public org.emftext.language.java.containers.Package getCONTEXT__SRC__javaPackage();
    
    public void setCONTEXT__SRC__javaPackage(org.emftext.language.java.containers.Package value);
    
    public org.eclipse.uml2.uml.PrimitiveType getCREATE__TRG__booleanType();
    
    public void setCREATE__TRG__booleanType(org.eclipse.uml2.uml.PrimitiveType value);
    
    public org.eclipse.uml2.uml.PrimitiveType getCREATE__TRG__byteType();
    
    public void setCREATE__TRG__byteType(org.eclipse.uml2.uml.PrimitiveType value);
    
    public org.eclipse.uml2.uml.PrimitiveType getCREATE__TRG__charType();
    
    public void setCREATE__TRG__charType(org.eclipse.uml2.uml.PrimitiveType value);
    
    public org.eclipse.uml2.uml.PrimitiveType getCREATE__TRG__doubleType();
    
    public void setCREATE__TRG__doubleType(org.eclipse.uml2.uml.PrimitiveType value);
    
    public org.eclipse.uml2.uml.PrimitiveType getCREATE__TRG__floatType();
    
    public void setCREATE__TRG__floatType(org.eclipse.uml2.uml.PrimitiveType value);
    
    public org.eclipse.uml2.uml.PrimitiveType getCREATE__TRG__intType();
    
    public void setCREATE__TRG__intType(org.eclipse.uml2.uml.PrimitiveType value);
    
    public org.eclipse.uml2.uml.PrimitiveType getCREATE__TRG__longType();
    
    public void setCREATE__TRG__longType(org.eclipse.uml2.uml.PrimitiveType value);
    
    public org.eclipse.uml2.uml.PrimitiveType getCREATE__TRG__shortType();
    
    public void setCREATE__TRG__shortType(org.eclipse.uml2.uml.PrimitiveType value);
    
    public org.eclipse.uml2.uml.PrimitiveType getCREATE__TRG__stringType();
    
    public void setCREATE__TRG__stringType(org.eclipse.uml2.uml.PrimitiveType value);
    
    public org.eclipse.uml2.uml.Model getCREATE__TRG__umlModel();
    
    public void setCREATE__TRG__umlModel(org.eclipse.uml2.uml.Model value);
    
    public org.eclipse.uml2.uml.PrimitiveType getCREATE__TRG__voidType();
    
    public void setCREATE__TRG__voidType(org.eclipse.uml2.uml.PrimitiveType value);
    
    public Java2Uml.JavaCompilationUnitToUmlModel getCREATE__CORR__javaCompUnitToUmlModel();
    
    public void setCREATE__CORR__javaCompUnitToUmlModel(Java2Uml.JavaCompilationUnitToUmlModel value);
    

}
