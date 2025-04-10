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

public interface JavaCompilationUnitToExistingUmlModel__Marker extends EObject, runtime.TGGRuleApplication {
	
    public runtime.Protocol getProtocol();
    
    public void setProtocol(runtime.Protocol value);
    
    public org.emftext.language.java.containers.CompilationUnit getCONTEXT__SRC__compilationUnit();
    
    public void setCONTEXT__SRC__compilationUnit(org.emftext.language.java.containers.CompilationUnit value);
    
    public org.emftext.language.java.containers.Package getCONTEXT__SRC__javaPackage();
    
    public void setCONTEXT__SRC__javaPackage(org.emftext.language.java.containers.Package value);
    
    public org.emftext.language.java.containers.CompilationUnit getCREATE__SRC__newCompilationUnit();
    
    public void setCREATE__SRC__newCompilationUnit(org.emftext.language.java.containers.CompilationUnit value);
    
    public org.eclipse.uml2.uml.Model getCONTEXT__TRG__umlModel();
    
    public void setCONTEXT__TRG__umlModel(org.eclipse.uml2.uml.Model value);
    
    public Java2Uml.JavaCompilationUnitToUmlModel getCONTEXT__CORR__javaCompUnitToUmlModel();
    
    public void setCONTEXT__CORR__javaCompUnitToUmlModel(Java2Uml.JavaCompilationUnitToUmlModel value);
    
    public Java2Uml.JavaCompilationUnitToUmlModel getCREATE__CORR__newJavaCompUnitToUmlModel();
    
    public void setCREATE__CORR__newJavaCompUnitToUmlModel(Java2Uml.JavaCompilationUnitToUmlModel value);
    

}
