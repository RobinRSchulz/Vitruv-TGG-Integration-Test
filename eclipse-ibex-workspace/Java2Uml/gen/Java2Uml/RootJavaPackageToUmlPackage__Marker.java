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

public interface RootJavaPackageToUmlPackage__Marker extends EObject, runtime.TGGRuleApplication {
	
    public runtime.Protocol getProtocol();
    
    public void setProtocol(runtime.Protocol value);
    
    public org.emftext.language.java.containers.Package getCREATE__SRC__javaPackage();
    
    public void setCREATE__SRC__javaPackage(org.emftext.language.java.containers.Package value);
    
    public org.eclipse.uml2.uml.Package getCREATE__TRG__umlPackage();
    
    public void setCREATE__TRG__umlPackage(org.eclipse.uml2.uml.Package value);
    
    public Java2Uml.JavaPackageToUmlPackage getCREATE__CORR__javaPackageToUmlPackage();
    
    public void setCREATE__CORR__javaPackageToUmlPackage(Java2Uml.JavaPackageToUmlPackage value);
    

}
