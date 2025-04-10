package Java2Uml.impl;

import Java2Uml.Java2UmlPackage;
import runtime.RuntimePackage;
import Java2Uml.Java2UmlPackage;

import org.emoflon.smartemf.runtime.*;
import org.emoflon.smartemf.runtime.collections.*;
import org.emoflon.smartemf.persistence.SmartEMFResource;
import org.emoflon.smartemf.runtime.notification.SmartEMFNotification;
import org.emoflon.smartemf.runtime.notification.NotifyStatus;

import java.util.function.Consumer;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;

public class ExistingSuperInterfaceToSuperInterface__MarkerImpl extends SmartObject implements Java2Uml.ExistingSuperInterfaceToSuperInterface__Marker {

    protected runtime.Protocol protocol = null;
    protected org.emftext.language.java.classifiers.Interface CONTEXT__SRC__javaConcreteClassifier = null;
    protected org.emftext.language.java.types.ClassifierReference CREATE__SRC__superclassTypeRef = null;
    protected org.emftext.language.java.classifiers.Interface CONTEXT__SRC__superclassifier = null;
    protected org.eclipse.uml2.uml.Generalization CREATE__TRG__generalization = null;
    protected org.eclipse.uml2.uml.Interface CONTEXT__TRG__umlClassifier = null;
    protected org.eclipse.uml2.uml.Interface CONTEXT__TRG__umlGeneralClassifier = null;
    protected Java2Uml.JavaClassifierToUmlClassifier CONTEXT__CORR__javaClassifierToUmlClassifier = null;
    protected Java2Uml.JavaClassifierToUmlClassifier CONTEXT__CORR__javaSuperClassifierToUmlSuperClassifier = null;
	
	protected ExistingSuperInterfaceToSuperInterface__MarkerImpl() {
		super(Java2UmlPackage.Literals.EXISTING_SUPER_INTERFACE_TO_SUPER_INTERFACE___MARKER);
	}
	
    
    @Override
    public runtime.Protocol getProtocol() {
    	return this.protocol;
    }
    
    @Override
    public void setProtocol(runtime.Protocol value) {
    	
    	Object oldValue = this.protocol;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		       	if(this.protocol != null && value == null) {
    		       		resetContainmentSilently();
    		       	}
    		        this.protocol = value;
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, RuntimePackage.Literals.TGG_RULE_APPLICATION__PROTOCOL, oldValue, value, -1));
    	        	
    	
    	        	if(oldValue != null) {
    	        		((SmartObject) oldValue).eInverseRemove(this, RuntimePackage.Literals.PROTOCOL__STEPS);
    	        	}
    	        	if(value != null) {
    	        		((SmartObject) value).eInverseAdd(this, RuntimePackage.Literals.PROTOCOL__STEPS);
    	        	}
    }
    
    private void setProtocolAsInverse(runtime.Protocol value) {
			    
			    Object oldValue = this.protocol;
			    
			    if(value == null && oldValue == null)
			    	return;
			    	
			    if(value != null && value.equals(oldValue))
			    	return;
			    	
			    
			    
			    	       	if(this.protocol != null && value == null) {
			    	       		resetContainmentSilently();
			    	       	}
			    	        this.protocol = value;
			    	        
			    
			    
			            	sendNotification(SmartEMFNotification.createSetNotification(this, RuntimePackage.Literals.TGG_RULE_APPLICATION__PROTOCOL, oldValue, value, -1));
			            	
    }
    
    @Override
    public org.emftext.language.java.classifiers.Interface getCONTEXT__SRC__javaConcreteClassifier() {
    	return this.CONTEXT__SRC__javaConcreteClassifier;
    }
    
    @Override
    public void setCONTEXT__SRC__javaConcreteClassifier(org.emftext.language.java.classifiers.Interface value) {
    	
    	Object oldValue = this.CONTEXT__SRC__javaConcreteClassifier;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CONTEXT__SRC__javaConcreteClassifier = value;
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Java2UmlPackage.Literals.EXISTING_SUPER_INTERFACE_TO_SUPER_INTERFACE___MARKER__CONTEX_T__SR_C__JAVA_CONCRETE_CLASSIFIER, oldValue, value, -1));
    	        	
    	        	if(Java2UmlPackage.Literals.EXISTING_SUPER_INTERFACE_TO_SUPER_INTERFACE___MARKER__CONTEX_T__SR_C__JAVA_CONCRETE_CLASSIFIER.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Java2UmlPackage.Literals.EXISTING_SUPER_INTERFACE_TO_SUPER_INTERFACE___MARKER__CONTEX_T__SR_C__JAVA_CONCRETE_CLASSIFIER.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Java2UmlPackage.Literals.EXISTING_SUPER_INTERFACE_TO_SUPER_INTERFACE___MARKER__CONTEX_T__SR_C__JAVA_CONCRETE_CLASSIFIER.getEOpposite());
    	        		}
    	        	}
    }
    
    
    @Override
    public org.emftext.language.java.types.ClassifierReference getCREATE__SRC__superclassTypeRef() {
    	return this.CREATE__SRC__superclassTypeRef;
    }
    
    @Override
    public void setCREATE__SRC__superclassTypeRef(org.emftext.language.java.types.ClassifierReference value) {
    	
    	Object oldValue = this.CREATE__SRC__superclassTypeRef;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CREATE__SRC__superclassTypeRef = value;
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Java2UmlPackage.Literals.EXISTING_SUPER_INTERFACE_TO_SUPER_INTERFACE___MARKER__CREAT_E__SR_C__SUPERCLASS_TYPE_REF, oldValue, value, -1));
    	        	
    	        	if(Java2UmlPackage.Literals.EXISTING_SUPER_INTERFACE_TO_SUPER_INTERFACE___MARKER__CREAT_E__SR_C__SUPERCLASS_TYPE_REF.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Java2UmlPackage.Literals.EXISTING_SUPER_INTERFACE_TO_SUPER_INTERFACE___MARKER__CREAT_E__SR_C__SUPERCLASS_TYPE_REF.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Java2UmlPackage.Literals.EXISTING_SUPER_INTERFACE_TO_SUPER_INTERFACE___MARKER__CREAT_E__SR_C__SUPERCLASS_TYPE_REF.getEOpposite());
    	        		}
    	        	}
    }
    
    
    @Override
    public org.emftext.language.java.classifiers.Interface getCONTEXT__SRC__superclassifier() {
    	return this.CONTEXT__SRC__superclassifier;
    }
    
    @Override
    public void setCONTEXT__SRC__superclassifier(org.emftext.language.java.classifiers.Interface value) {
    	
    	Object oldValue = this.CONTEXT__SRC__superclassifier;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CONTEXT__SRC__superclassifier = value;
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Java2UmlPackage.Literals.EXISTING_SUPER_INTERFACE_TO_SUPER_INTERFACE___MARKER__CONTEX_T__SR_C__SUPERCLASSIFIER, oldValue, value, -1));
    	        	
    	        	if(Java2UmlPackage.Literals.EXISTING_SUPER_INTERFACE_TO_SUPER_INTERFACE___MARKER__CONTEX_T__SR_C__SUPERCLASSIFIER.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Java2UmlPackage.Literals.EXISTING_SUPER_INTERFACE_TO_SUPER_INTERFACE___MARKER__CONTEX_T__SR_C__SUPERCLASSIFIER.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Java2UmlPackage.Literals.EXISTING_SUPER_INTERFACE_TO_SUPER_INTERFACE___MARKER__CONTEX_T__SR_C__SUPERCLASSIFIER.getEOpposite());
    	        		}
    	        	}
    }
    
    
    @Override
    public org.eclipse.uml2.uml.Generalization getCREATE__TRG__generalization() {
    	return this.CREATE__TRG__generalization;
    }
    
    @Override
    public void setCREATE__TRG__generalization(org.eclipse.uml2.uml.Generalization value) {
    	
    	Object oldValue = this.CREATE__TRG__generalization;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CREATE__TRG__generalization = value;
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Java2UmlPackage.Literals.EXISTING_SUPER_INTERFACE_TO_SUPER_INTERFACE___MARKER__CREAT_E__TR_G__GENERALIZATION, oldValue, value, -1));
    	        	
    	        	if(Java2UmlPackage.Literals.EXISTING_SUPER_INTERFACE_TO_SUPER_INTERFACE___MARKER__CREAT_E__TR_G__GENERALIZATION.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Java2UmlPackage.Literals.EXISTING_SUPER_INTERFACE_TO_SUPER_INTERFACE___MARKER__CREAT_E__TR_G__GENERALIZATION.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Java2UmlPackage.Literals.EXISTING_SUPER_INTERFACE_TO_SUPER_INTERFACE___MARKER__CREAT_E__TR_G__GENERALIZATION.getEOpposite());
    	        		}
    	        	}
    }
    
    
    @Override
    public org.eclipse.uml2.uml.Interface getCONTEXT__TRG__umlClassifier() {
    	return this.CONTEXT__TRG__umlClassifier;
    }
    
    @Override
    public void setCONTEXT__TRG__umlClassifier(org.eclipse.uml2.uml.Interface value) {
    	
    	Object oldValue = this.CONTEXT__TRG__umlClassifier;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CONTEXT__TRG__umlClassifier = value;
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Java2UmlPackage.Literals.EXISTING_SUPER_INTERFACE_TO_SUPER_INTERFACE___MARKER__CONTEX_T__TR_G__UML_CLASSIFIER, oldValue, value, -1));
    	        	
    	        	if(Java2UmlPackage.Literals.EXISTING_SUPER_INTERFACE_TO_SUPER_INTERFACE___MARKER__CONTEX_T__TR_G__UML_CLASSIFIER.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Java2UmlPackage.Literals.EXISTING_SUPER_INTERFACE_TO_SUPER_INTERFACE___MARKER__CONTEX_T__TR_G__UML_CLASSIFIER.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Java2UmlPackage.Literals.EXISTING_SUPER_INTERFACE_TO_SUPER_INTERFACE___MARKER__CONTEX_T__TR_G__UML_CLASSIFIER.getEOpposite());
    	        		}
    	        	}
    }
    
    
    @Override
    public org.eclipse.uml2.uml.Interface getCONTEXT__TRG__umlGeneralClassifier() {
    	return this.CONTEXT__TRG__umlGeneralClassifier;
    }
    
    @Override
    public void setCONTEXT__TRG__umlGeneralClassifier(org.eclipse.uml2.uml.Interface value) {
    	
    	Object oldValue = this.CONTEXT__TRG__umlGeneralClassifier;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CONTEXT__TRG__umlGeneralClassifier = value;
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Java2UmlPackage.Literals.EXISTING_SUPER_INTERFACE_TO_SUPER_INTERFACE___MARKER__CONTEX_T__TR_G__UML_GENERAL_CLASSIFIER, oldValue, value, -1));
    	        	
    	        	if(Java2UmlPackage.Literals.EXISTING_SUPER_INTERFACE_TO_SUPER_INTERFACE___MARKER__CONTEX_T__TR_G__UML_GENERAL_CLASSIFIER.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Java2UmlPackage.Literals.EXISTING_SUPER_INTERFACE_TO_SUPER_INTERFACE___MARKER__CONTEX_T__TR_G__UML_GENERAL_CLASSIFIER.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Java2UmlPackage.Literals.EXISTING_SUPER_INTERFACE_TO_SUPER_INTERFACE___MARKER__CONTEX_T__TR_G__UML_GENERAL_CLASSIFIER.getEOpposite());
    	        		}
    	        	}
    }
    
    
    @Override
    public Java2Uml.JavaClassifierToUmlClassifier getCONTEXT__CORR__javaClassifierToUmlClassifier() {
    	return this.CONTEXT__CORR__javaClassifierToUmlClassifier;
    }
    
    @Override
    public void setCONTEXT__CORR__javaClassifierToUmlClassifier(Java2Uml.JavaClassifierToUmlClassifier value) {
    	
    	Object oldValue = this.CONTEXT__CORR__javaClassifierToUmlClassifier;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CONTEXT__CORR__javaClassifierToUmlClassifier = value;
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Java2UmlPackage.Literals.EXISTING_SUPER_INTERFACE_TO_SUPER_INTERFACE___MARKER__CONTEX_T__COR_R__JAVA_CLASSIFIER_TO_UML_CLASSIFIER, oldValue, value, -1));
    	        	
    	        	if(Java2UmlPackage.Literals.EXISTING_SUPER_INTERFACE_TO_SUPER_INTERFACE___MARKER__CONTEX_T__COR_R__JAVA_CLASSIFIER_TO_UML_CLASSIFIER.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Java2UmlPackage.Literals.EXISTING_SUPER_INTERFACE_TO_SUPER_INTERFACE___MARKER__CONTEX_T__COR_R__JAVA_CLASSIFIER_TO_UML_CLASSIFIER.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Java2UmlPackage.Literals.EXISTING_SUPER_INTERFACE_TO_SUPER_INTERFACE___MARKER__CONTEX_T__COR_R__JAVA_CLASSIFIER_TO_UML_CLASSIFIER.getEOpposite());
    	        		}
    	        	}
    }
    
    
    @Override
    public Java2Uml.JavaClassifierToUmlClassifier getCONTEXT__CORR__javaSuperClassifierToUmlSuperClassifier() {
    	return this.CONTEXT__CORR__javaSuperClassifierToUmlSuperClassifier;
    }
    
    @Override
    public void setCONTEXT__CORR__javaSuperClassifierToUmlSuperClassifier(Java2Uml.JavaClassifierToUmlClassifier value) {
    	
    	Object oldValue = this.CONTEXT__CORR__javaSuperClassifierToUmlSuperClassifier;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CONTEXT__CORR__javaSuperClassifierToUmlSuperClassifier = value;
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Java2UmlPackage.Literals.EXISTING_SUPER_INTERFACE_TO_SUPER_INTERFACE___MARKER__CONTEX_T__COR_R__JAVA_SUPER_CLASSIFIER_TO_UML_SUPER_CLASSIFIER, oldValue, value, -1));
    	        	
    	        	if(Java2UmlPackage.Literals.EXISTING_SUPER_INTERFACE_TO_SUPER_INTERFACE___MARKER__CONTEX_T__COR_R__JAVA_SUPER_CLASSIFIER_TO_UML_SUPER_CLASSIFIER.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Java2UmlPackage.Literals.EXISTING_SUPER_INTERFACE_TO_SUPER_INTERFACE___MARKER__CONTEX_T__COR_R__JAVA_SUPER_CLASSIFIER_TO_UML_SUPER_CLASSIFIER.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Java2UmlPackage.Literals.EXISTING_SUPER_INTERFACE_TO_SUPER_INTERFACE___MARKER__CONTEX_T__COR_R__JAVA_SUPER_CLASSIFIER_TO_UML_SUPER_CLASSIFIER.getEOpposite());
    	        		}
    	        	}
    }
    

    @Override
    public void eSet(EStructuralFeature eFeature, Object newValue){
    	if (RuntimePackage.Literals.TGG_RULE_APPLICATION__PROTOCOL.equals(eFeature)) {
    		setProtocol((runtime.Protocol) newValue); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.EXISTING_SUPER_INTERFACE_TO_SUPER_INTERFACE___MARKER__CONTEX_T__SR_C__JAVA_CONCRETE_CLASSIFIER.equals(eFeature)) {
    		setCONTEXT__SRC__javaConcreteClassifier((org.emftext.language.java.classifiers.Interface) newValue); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.EXISTING_SUPER_INTERFACE_TO_SUPER_INTERFACE___MARKER__CREAT_E__SR_C__SUPERCLASS_TYPE_REF.equals(eFeature)) {
    		setCREATE__SRC__superclassTypeRef((org.emftext.language.java.types.ClassifierReference) newValue); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.EXISTING_SUPER_INTERFACE_TO_SUPER_INTERFACE___MARKER__CONTEX_T__SR_C__SUPERCLASSIFIER.equals(eFeature)) {
    		setCONTEXT__SRC__superclassifier((org.emftext.language.java.classifiers.Interface) newValue); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.EXISTING_SUPER_INTERFACE_TO_SUPER_INTERFACE___MARKER__CREAT_E__TR_G__GENERALIZATION.equals(eFeature)) {
    		setCREATE__TRG__generalization((org.eclipse.uml2.uml.Generalization) newValue); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.EXISTING_SUPER_INTERFACE_TO_SUPER_INTERFACE___MARKER__CONTEX_T__TR_G__UML_CLASSIFIER.equals(eFeature)) {
    		setCONTEXT__TRG__umlClassifier((org.eclipse.uml2.uml.Interface) newValue); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.EXISTING_SUPER_INTERFACE_TO_SUPER_INTERFACE___MARKER__CONTEX_T__TR_G__UML_GENERAL_CLASSIFIER.equals(eFeature)) {
    		setCONTEXT__TRG__umlGeneralClassifier((org.eclipse.uml2.uml.Interface) newValue); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.EXISTING_SUPER_INTERFACE_TO_SUPER_INTERFACE___MARKER__CONTEX_T__COR_R__JAVA_CLASSIFIER_TO_UML_CLASSIFIER.equals(eFeature)) {
    		setCONTEXT__CORR__javaClassifierToUmlClassifier((Java2Uml.JavaClassifierToUmlClassifier) newValue); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.EXISTING_SUPER_INTERFACE_TO_SUPER_INTERFACE___MARKER__CONTEX_T__COR_R__JAVA_SUPER_CLASSIFIER_TO_UML_SUPER_CLASSIFIER.equals(eFeature)) {
    		setCONTEXT__CORR__javaSuperClassifierToUmlSuperClassifier((Java2Uml.JavaClassifierToUmlClassifier) newValue); 
    		return;
    	}
    	eDynamicSet(eFeature, newValue);
    }
    
    @Override
    public void eUnset(EStructuralFeature eFeature){
    	if (RuntimePackage.Literals.TGG_RULE_APPLICATION__PROTOCOL.equals(eFeature)) {
    		setProtocol((runtime.Protocol)null); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.EXISTING_SUPER_INTERFACE_TO_SUPER_INTERFACE___MARKER__CONTEX_T__SR_C__JAVA_CONCRETE_CLASSIFIER.equals(eFeature)) {
    		setCONTEXT__SRC__javaConcreteClassifier((org.emftext.language.java.classifiers.Interface)null); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.EXISTING_SUPER_INTERFACE_TO_SUPER_INTERFACE___MARKER__CREAT_E__SR_C__SUPERCLASS_TYPE_REF.equals(eFeature)) {
    		setCREATE__SRC__superclassTypeRef((org.emftext.language.java.types.ClassifierReference)null); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.EXISTING_SUPER_INTERFACE_TO_SUPER_INTERFACE___MARKER__CONTEX_T__SR_C__SUPERCLASSIFIER.equals(eFeature)) {
    		setCONTEXT__SRC__superclassifier((org.emftext.language.java.classifiers.Interface)null); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.EXISTING_SUPER_INTERFACE_TO_SUPER_INTERFACE___MARKER__CREAT_E__TR_G__GENERALIZATION.equals(eFeature)) {
    		setCREATE__TRG__generalization((org.eclipse.uml2.uml.Generalization)null); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.EXISTING_SUPER_INTERFACE_TO_SUPER_INTERFACE___MARKER__CONTEX_T__TR_G__UML_CLASSIFIER.equals(eFeature)) {
    		setCONTEXT__TRG__umlClassifier((org.eclipse.uml2.uml.Interface)null); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.EXISTING_SUPER_INTERFACE_TO_SUPER_INTERFACE___MARKER__CONTEX_T__TR_G__UML_GENERAL_CLASSIFIER.equals(eFeature)) {
    		setCONTEXT__TRG__umlGeneralClassifier((org.eclipse.uml2.uml.Interface)null); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.EXISTING_SUPER_INTERFACE_TO_SUPER_INTERFACE___MARKER__CONTEX_T__COR_R__JAVA_CLASSIFIER_TO_UML_CLASSIFIER.equals(eFeature)) {
    		setCONTEXT__CORR__javaClassifierToUmlClassifier((Java2Uml.JavaClassifierToUmlClassifier)null); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.EXISTING_SUPER_INTERFACE_TO_SUPER_INTERFACE___MARKER__CONTEX_T__COR_R__JAVA_SUPER_CLASSIFIER_TO_UML_SUPER_CLASSIFIER.equals(eFeature)) {
    		setCONTEXT__CORR__javaSuperClassifierToUmlSuperClassifier((Java2Uml.JavaClassifierToUmlClassifier)null); 
    		return;
    	}
    	eDynamicUnset(eFeature);
    }

    @Override
    public String toString(){
		return super.toString();
    }

 	@Override
    public Object eGet(EStructuralFeature eFeature){
    	if (RuntimePackage.Literals.TGG_RULE_APPLICATION__PROTOCOL.equals(eFeature))
    		return getProtocol();
    	if (Java2UmlPackage.Literals.EXISTING_SUPER_INTERFACE_TO_SUPER_INTERFACE___MARKER__CONTEX_T__SR_C__JAVA_CONCRETE_CLASSIFIER.equals(eFeature))
    		return getCONTEXT__SRC__javaConcreteClassifier();
    	if (Java2UmlPackage.Literals.EXISTING_SUPER_INTERFACE_TO_SUPER_INTERFACE___MARKER__CREAT_E__SR_C__SUPERCLASS_TYPE_REF.equals(eFeature))
    		return getCREATE__SRC__superclassTypeRef();
    	if (Java2UmlPackage.Literals.EXISTING_SUPER_INTERFACE_TO_SUPER_INTERFACE___MARKER__CONTEX_T__SR_C__SUPERCLASSIFIER.equals(eFeature))
    		return getCONTEXT__SRC__superclassifier();
    	if (Java2UmlPackage.Literals.EXISTING_SUPER_INTERFACE_TO_SUPER_INTERFACE___MARKER__CREAT_E__TR_G__GENERALIZATION.equals(eFeature))
    		return getCREATE__TRG__generalization();
    	if (Java2UmlPackage.Literals.EXISTING_SUPER_INTERFACE_TO_SUPER_INTERFACE___MARKER__CONTEX_T__TR_G__UML_CLASSIFIER.equals(eFeature))
    		return getCONTEXT__TRG__umlClassifier();
    	if (Java2UmlPackage.Literals.EXISTING_SUPER_INTERFACE_TO_SUPER_INTERFACE___MARKER__CONTEX_T__TR_G__UML_GENERAL_CLASSIFIER.equals(eFeature))
    		return getCONTEXT__TRG__umlGeneralClassifier();
    	if (Java2UmlPackage.Literals.EXISTING_SUPER_INTERFACE_TO_SUPER_INTERFACE___MARKER__CONTEX_T__COR_R__JAVA_CLASSIFIER_TO_UML_CLASSIFIER.equals(eFeature))
    		return getCONTEXT__CORR__javaClassifierToUmlClassifier();
    	if (Java2UmlPackage.Literals.EXISTING_SUPER_INTERFACE_TO_SUPER_INTERFACE___MARKER__CONTEX_T__COR_R__JAVA_SUPER_CLASSIFIER_TO_UML_SUPER_CLASSIFIER.equals(eFeature))
    		return getCONTEXT__CORR__javaSuperClassifierToUmlSuperClassifier();
    	return eDynamicGet(eFeature);
    }

    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType){
    	throw new UnsupportedOperationException("This method has been deactivated since it is not always safe to use.");
    }
    
    @Override
    public void eInverseAdd(Object otherEnd, EStructuralFeature feature) {
if (RuntimePackage.Literals.TGG_RULE_APPLICATION__PROTOCOL.equals(feature)) {
setProtocolAsInverse((runtime.Protocol) otherEnd); 
 	return;
			        }	
	    if(feature == null)
	    	return;
	    	
    	eDynamicInverseAdd(otherEnd, feature);
	    	}
    	
    @Override
	    	public void eInverseRemove(Object otherEnd, EStructuralFeature feature) {
if (RuntimePackage.Literals.TGG_RULE_APPLICATION__PROTOCOL.equals(feature)) {
setProtocolAsInverse(null); 
 	return;
			        }
	    if(feature == null)
	    	return;
	    		    		
    	eDynamicInverseRemove(otherEnd, feature);
	    	}
    
    @Override
    /**
    * This method sets the resource and generates REMOVING_ADAPTER and ADD notifications
    */
    protected void setResourceOfContainments(Consumer<SmartObject> setResourceCall) {
	    	}
	    	
	    	@Override
	    	/**
	    	* This method sets the resource and only generates REMOVING_ADAPTER notifications (no ADD messages)
	    	*/
    protected void setResourceOfContainmentsSilently(Resource r) { 		
	    	}
}
