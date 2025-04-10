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

public interface ClassToUmlClass__Marker extends EObject, runtime.TGGRuleApplication {
	
    public runtime.Protocol getProtocol();
    
    public void setProtocol(runtime.Protocol value);
    
    public org.emftext.language.java.classifiers.Class getCREATE__SRC__classifier();
    
    public void setCREATE__SRC__classifier(org.emftext.language.java.classifiers.Class value);
    
    public org.emftext.language.java.containers.CompilationUnit getCONTEXT__SRC__compilationUnit();
    
    public void setCONTEXT__SRC__compilationUnit(org.emftext.language.java.containers.CompilationUnit value);
    
    public org.emftext.language.java.containers.Package getCONTEXT__SRC__javaPackage();
    
    public void setCONTEXT__SRC__javaPackage(org.emftext.language.java.containers.Package value);
    
    public org.eclipse.uml2.uml.Class getCREATE__TRG__umlClassifier();
    
    public void setCREATE__TRG__umlClassifier(org.eclipse.uml2.uml.Class value);
    
    public org.eclipse.uml2.uml.Package getCONTEXT__TRG__umlPackage();
    
    public void setCONTEXT__TRG__umlPackage(org.eclipse.uml2.uml.Package value);
    
    public Java2Uml.JavaClassifierToUmlClassifier getCREATE__CORR__javaClassToUmlClass();
    
    public void setCREATE__CORR__javaClassToUmlClass(Java2Uml.JavaClassifierToUmlClassifier value);
    
    public Java2Uml.JavaPackageToUmlPackage getCONTEXT__CORR__javaPackToUmlPack();
    
    public void setCONTEXT__CORR__javaPackToUmlPack(Java2Uml.JavaPackageToUmlPackage value);
    

}
