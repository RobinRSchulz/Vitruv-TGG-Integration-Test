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

public interface ExistingClassImplementToClassImplement__Marker extends EObject, runtime.TGGRuleApplication {
	
    public runtime.Protocol getProtocol();
    
    public void setProtocol(runtime.Protocol value);
    
    public org.emftext.language.java.classifiers.Interface getCONTEXT__SRC__interface();
    
    public void setCONTEXT__SRC__interface(org.emftext.language.java.classifiers.Interface value);
    
    public org.emftext.language.java.types.ClassifierReference getCREATE__SRC__interfaceTypeRef();
    
    public void setCREATE__SRC__interfaceTypeRef(org.emftext.language.java.types.ClassifierReference value);
    
    public org.emftext.language.java.classifiers.Class getCONTEXT__SRC__javaClass();
    
    public void setCONTEXT__SRC__javaClass(org.emftext.language.java.classifiers.Class value);
    
    public org.eclipse.uml2.uml.Class getCONTEXT__TRG__umlClass();
    
    public void setCONTEXT__TRG__umlClass(org.eclipse.uml2.uml.Class value);
    
    public org.eclipse.uml2.uml.Interface getCONTEXT__TRG__umlInterface();
    
    public void setCONTEXT__TRG__umlInterface(org.eclipse.uml2.uml.Interface value);
    
    public org.eclipse.uml2.uml.InterfaceRealization getCREATE__TRG__umlInterfaceRealization();
    
    public void setCREATE__TRG__umlInterfaceRealization(org.eclipse.uml2.uml.InterfaceRealization value);
    
    public Java2Uml.JavaClassifierToUmlClassifier getCONTEXT__CORR__javaClassifierToUmlClassifier();
    
    public void setCONTEXT__CORR__javaClassifierToUmlClassifier(Java2Uml.JavaClassifierToUmlClassifier value);
    
    public Java2Uml.JavaClassifierToUmlClassifier getCONTEXT__CORR__javaSuperClassifierToUmlSuperClassifier();
    
    public void setCONTEXT__CORR__javaSuperClassifierToUmlSuperClassifier(Java2Uml.JavaClassifierToUmlClassifier value);
    

}
