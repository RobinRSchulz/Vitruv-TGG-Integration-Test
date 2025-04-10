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

public interface SuperInterfaceToSuperInterface__Marker extends EObject, runtime.TGGRuleApplication {
	
    public runtime.Protocol getProtocol();
    
    public void setProtocol(runtime.Protocol value);
    
    public org.emftext.language.java.classifiers.Interface getCONTEXT__SRC__javaConcreteClassifier();
    
    public void setCONTEXT__SRC__javaConcreteClassifier(org.emftext.language.java.classifiers.Interface value);
    
    public org.emftext.language.java.types.ClassifierReference getCREATE__SRC__superclassTypeRef();
    
    public void setCREATE__SRC__superclassTypeRef(org.emftext.language.java.types.ClassifierReference value);
    
    public org.emftext.language.java.classifiers.Interface getCREATE__SRC__superclassifier();
    
    public void setCREATE__SRC__superclassifier(org.emftext.language.java.classifiers.Interface value);
    
    public org.eclipse.uml2.uml.Generalization getCREATE__TRG__generalization();
    
    public void setCREATE__TRG__generalization(org.eclipse.uml2.uml.Generalization value);
    
    public org.eclipse.uml2.uml.Interface getCONTEXT__TRG__umlClassifier();
    
    public void setCONTEXT__TRG__umlClassifier(org.eclipse.uml2.uml.Interface value);
    
    public org.eclipse.uml2.uml.Interface getCREATE__TRG__umlGeneralClassifier();
    
    public void setCREATE__TRG__umlGeneralClassifier(org.eclipse.uml2.uml.Interface value);
    
    public Java2Uml.JavaClassifierReferenceToUmlGeneralization getCREATE__CORR__classRefToGeneralization();
    
    public void setCREATE__CORR__classRefToGeneralization(Java2Uml.JavaClassifierReferenceToUmlGeneralization value);
    
    public Java2Uml.JavaClassifierToUmlClassifier getCONTEXT__CORR__javaClassifierToUmlClassifier();
    
    public void setCONTEXT__CORR__javaClassifierToUmlClassifier(Java2Uml.JavaClassifierToUmlClassifier value);
    
    public Java2Uml.JavaClassifierToUmlClassifier getCREATE__CORR__javaSuperClassifierToUmlSuperClassifier();
    
    public void setCREATE__CORR__javaSuperClassifierToUmlSuperClassifier(Java2Uml.JavaClassifierToUmlClassifier value);
    

}
