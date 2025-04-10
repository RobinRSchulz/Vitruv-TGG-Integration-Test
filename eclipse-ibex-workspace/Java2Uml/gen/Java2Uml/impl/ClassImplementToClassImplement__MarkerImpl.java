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

public class ClassImplementToClassImplement__MarkerImpl extends SmartObject implements Java2Uml.ClassImplementToClassImplement__Marker {

    protected runtime.Protocol protocol = null;
    protected org.emftext.language.java.classifiers.Interface CREATE__SRC__interface = null;
    protected org.emftext.language.java.types.ClassifierReference CREATE__SRC__interfaceTypeRef = null;
    protected org.emftext.language.java.classifiers.Class CONTEXT__SRC__javaClass = null;
    protected org.eclipse.uml2.uml.Class CONTEXT__TRG__umlClass = null;
    protected org.eclipse.uml2.uml.Interface CREATE__TRG__umlInterface = null;
    protected org.eclipse.uml2.uml.InterfaceRealization CREATE__TRG__umlInterfaceRealization = null;
    protected Java2Uml.JavaClassifierToUmlClassifier CONTEXT__CORR__javaClassifierToUmlClassifier = null;
    protected Java2Uml.JavaClassifierToUmlClassifier CREATE__CORR__javaSuperClassifierToUmlSuperClassifier = null;
	
	protected ClassImplementToClassImplement__MarkerImpl() {
		super(Java2UmlPackage.Literals.CLASS_IMPLEMENT_TO_CLASS_IMPLEMENT___MARKER);
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
    public org.emftext.language.java.classifiers.Interface getCREATE__SRC__interface() {
    	return this.CREATE__SRC__interface;
    }
    
    @Override
    public void setCREATE__SRC__interface(org.emftext.language.java.classifiers.Interface value) {
    	
    	Object oldValue = this.CREATE__SRC__interface;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CREATE__SRC__interface = value;
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Java2UmlPackage.Literals.CLASS_IMPLEMENT_TO_CLASS_IMPLEMENT___MARKER__CREAT_E__SR_C__INTERFACE, oldValue, value, -1));
    	        	
    	        	if(Java2UmlPackage.Literals.CLASS_IMPLEMENT_TO_CLASS_IMPLEMENT___MARKER__CREAT_E__SR_C__INTERFACE.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Java2UmlPackage.Literals.CLASS_IMPLEMENT_TO_CLASS_IMPLEMENT___MARKER__CREAT_E__SR_C__INTERFACE.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Java2UmlPackage.Literals.CLASS_IMPLEMENT_TO_CLASS_IMPLEMENT___MARKER__CREAT_E__SR_C__INTERFACE.getEOpposite());
    	        		}
    	        	}
    }
    
    
    @Override
    public org.emftext.language.java.types.ClassifierReference getCREATE__SRC__interfaceTypeRef() {
    	return this.CREATE__SRC__interfaceTypeRef;
    }
    
    @Override
    public void setCREATE__SRC__interfaceTypeRef(org.emftext.language.java.types.ClassifierReference value) {
    	
    	Object oldValue = this.CREATE__SRC__interfaceTypeRef;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CREATE__SRC__interfaceTypeRef = value;
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Java2UmlPackage.Literals.CLASS_IMPLEMENT_TO_CLASS_IMPLEMENT___MARKER__CREAT_E__SR_C__INTERFACE_TYPE_REF, oldValue, value, -1));
    	        	
    	        	if(Java2UmlPackage.Literals.CLASS_IMPLEMENT_TO_CLASS_IMPLEMENT___MARKER__CREAT_E__SR_C__INTERFACE_TYPE_REF.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Java2UmlPackage.Literals.CLASS_IMPLEMENT_TO_CLASS_IMPLEMENT___MARKER__CREAT_E__SR_C__INTERFACE_TYPE_REF.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Java2UmlPackage.Literals.CLASS_IMPLEMENT_TO_CLASS_IMPLEMENT___MARKER__CREAT_E__SR_C__INTERFACE_TYPE_REF.getEOpposite());
    	        		}
    	        	}
    }
    
    
    @Override
    public org.emftext.language.java.classifiers.Class getCONTEXT__SRC__javaClass() {
    	return this.CONTEXT__SRC__javaClass;
    }
    
    @Override
    public void setCONTEXT__SRC__javaClass(org.emftext.language.java.classifiers.Class value) {
    	
    	Object oldValue = this.CONTEXT__SRC__javaClass;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CONTEXT__SRC__javaClass = value;
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Java2UmlPackage.Literals.CLASS_IMPLEMENT_TO_CLASS_IMPLEMENT___MARKER__CONTEX_T__SR_C__JAVA_CLASS, oldValue, value, -1));
    	        	
    	        	if(Java2UmlPackage.Literals.CLASS_IMPLEMENT_TO_CLASS_IMPLEMENT___MARKER__CONTEX_T__SR_C__JAVA_CLASS.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Java2UmlPackage.Literals.CLASS_IMPLEMENT_TO_CLASS_IMPLEMENT___MARKER__CONTEX_T__SR_C__JAVA_CLASS.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Java2UmlPackage.Literals.CLASS_IMPLEMENT_TO_CLASS_IMPLEMENT___MARKER__CONTEX_T__SR_C__JAVA_CLASS.getEOpposite());
    	        		}
    	        	}
    }
    
    
    @Override
    public org.eclipse.uml2.uml.Class getCONTEXT__TRG__umlClass() {
    	return this.CONTEXT__TRG__umlClass;
    }
    
    @Override
    public void setCONTEXT__TRG__umlClass(org.eclipse.uml2.uml.Class value) {
    	
    	Object oldValue = this.CONTEXT__TRG__umlClass;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CONTEXT__TRG__umlClass = value;
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Java2UmlPackage.Literals.CLASS_IMPLEMENT_TO_CLASS_IMPLEMENT___MARKER__CONTEX_T__TR_G__UML_CLASS, oldValue, value, -1));
    	        	
    	        	if(Java2UmlPackage.Literals.CLASS_IMPLEMENT_TO_CLASS_IMPLEMENT___MARKER__CONTEX_T__TR_G__UML_CLASS.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Java2UmlPackage.Literals.CLASS_IMPLEMENT_TO_CLASS_IMPLEMENT___MARKER__CONTEX_T__TR_G__UML_CLASS.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Java2UmlPackage.Literals.CLASS_IMPLEMENT_TO_CLASS_IMPLEMENT___MARKER__CONTEX_T__TR_G__UML_CLASS.getEOpposite());
    	        		}
    	        	}
    }
    
    
    @Override
    public org.eclipse.uml2.uml.Interface getCREATE__TRG__umlInterface() {
    	return this.CREATE__TRG__umlInterface;
    }
    
    @Override
    public void setCREATE__TRG__umlInterface(org.eclipse.uml2.uml.Interface value) {
    	
    	Object oldValue = this.CREATE__TRG__umlInterface;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CREATE__TRG__umlInterface = value;
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Java2UmlPackage.Literals.CLASS_IMPLEMENT_TO_CLASS_IMPLEMENT___MARKER__CREAT_E__TR_G__UML_INTERFACE, oldValue, value, -1));
    	        	
    	        	if(Java2UmlPackage.Literals.CLASS_IMPLEMENT_TO_CLASS_IMPLEMENT___MARKER__CREAT_E__TR_G__UML_INTERFACE.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Java2UmlPackage.Literals.CLASS_IMPLEMENT_TO_CLASS_IMPLEMENT___MARKER__CREAT_E__TR_G__UML_INTERFACE.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Java2UmlPackage.Literals.CLASS_IMPLEMENT_TO_CLASS_IMPLEMENT___MARKER__CREAT_E__TR_G__UML_INTERFACE.getEOpposite());
    	        		}
    	        	}
    }
    
    
    @Override
    public org.eclipse.uml2.uml.InterfaceRealization getCREATE__TRG__umlInterfaceRealization() {
    	return this.CREATE__TRG__umlInterfaceRealization;
    }
    
    @Override
    public void setCREATE__TRG__umlInterfaceRealization(org.eclipse.uml2.uml.InterfaceRealization value) {
    	
    	Object oldValue = this.CREATE__TRG__umlInterfaceRealization;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CREATE__TRG__umlInterfaceRealization = value;
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Java2UmlPackage.Literals.CLASS_IMPLEMENT_TO_CLASS_IMPLEMENT___MARKER__CREAT_E__TR_G__UML_INTERFACE_REALIZATION, oldValue, value, -1));
    	        	
    	        	if(Java2UmlPackage.Literals.CLASS_IMPLEMENT_TO_CLASS_IMPLEMENT___MARKER__CREAT_E__TR_G__UML_INTERFACE_REALIZATION.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Java2UmlPackage.Literals.CLASS_IMPLEMENT_TO_CLASS_IMPLEMENT___MARKER__CREAT_E__TR_G__UML_INTERFACE_REALIZATION.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Java2UmlPackage.Literals.CLASS_IMPLEMENT_TO_CLASS_IMPLEMENT___MARKER__CREAT_E__TR_G__UML_INTERFACE_REALIZATION.getEOpposite());
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
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Java2UmlPackage.Literals.CLASS_IMPLEMENT_TO_CLASS_IMPLEMENT___MARKER__CONTEX_T__COR_R__JAVA_CLASSIFIER_TO_UML_CLASSIFIER, oldValue, value, -1));
    	        	
    	        	if(Java2UmlPackage.Literals.CLASS_IMPLEMENT_TO_CLASS_IMPLEMENT___MARKER__CONTEX_T__COR_R__JAVA_CLASSIFIER_TO_UML_CLASSIFIER.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Java2UmlPackage.Literals.CLASS_IMPLEMENT_TO_CLASS_IMPLEMENT___MARKER__CONTEX_T__COR_R__JAVA_CLASSIFIER_TO_UML_CLASSIFIER.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Java2UmlPackage.Literals.CLASS_IMPLEMENT_TO_CLASS_IMPLEMENT___MARKER__CONTEX_T__COR_R__JAVA_CLASSIFIER_TO_UML_CLASSIFIER.getEOpposite());
    	        		}
    	        	}
    }
    
    
    @Override
    public Java2Uml.JavaClassifierToUmlClassifier getCREATE__CORR__javaSuperClassifierToUmlSuperClassifier() {
    	return this.CREATE__CORR__javaSuperClassifierToUmlSuperClassifier;
    }
    
    @Override
    public void setCREATE__CORR__javaSuperClassifierToUmlSuperClassifier(Java2Uml.JavaClassifierToUmlClassifier value) {
    	
    	Object oldValue = this.CREATE__CORR__javaSuperClassifierToUmlSuperClassifier;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CREATE__CORR__javaSuperClassifierToUmlSuperClassifier = value;
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Java2UmlPackage.Literals.CLASS_IMPLEMENT_TO_CLASS_IMPLEMENT___MARKER__CREAT_E__COR_R__JAVA_SUPER_CLASSIFIER_TO_UML_SUPER_CLASSIFIER, oldValue, value, -1));
    	        	
    	        	if(Java2UmlPackage.Literals.CLASS_IMPLEMENT_TO_CLASS_IMPLEMENT___MARKER__CREAT_E__COR_R__JAVA_SUPER_CLASSIFIER_TO_UML_SUPER_CLASSIFIER.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Java2UmlPackage.Literals.CLASS_IMPLEMENT_TO_CLASS_IMPLEMENT___MARKER__CREAT_E__COR_R__JAVA_SUPER_CLASSIFIER_TO_UML_SUPER_CLASSIFIER.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Java2UmlPackage.Literals.CLASS_IMPLEMENT_TO_CLASS_IMPLEMENT___MARKER__CREAT_E__COR_R__JAVA_SUPER_CLASSIFIER_TO_UML_SUPER_CLASSIFIER.getEOpposite());
    	        		}
    	        	}
    }
    

    @Override
    public void eSet(EStructuralFeature eFeature, Object newValue){
    	if (RuntimePackage.Literals.TGG_RULE_APPLICATION__PROTOCOL.equals(eFeature)) {
    		setProtocol((runtime.Protocol) newValue); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.CLASS_IMPLEMENT_TO_CLASS_IMPLEMENT___MARKER__CREAT_E__SR_C__INTERFACE.equals(eFeature)) {
    		setCREATE__SRC__interface((org.emftext.language.java.classifiers.Interface) newValue); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.CLASS_IMPLEMENT_TO_CLASS_IMPLEMENT___MARKER__CREAT_E__SR_C__INTERFACE_TYPE_REF.equals(eFeature)) {
    		setCREATE__SRC__interfaceTypeRef((org.emftext.language.java.types.ClassifierReference) newValue); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.CLASS_IMPLEMENT_TO_CLASS_IMPLEMENT___MARKER__CONTEX_T__SR_C__JAVA_CLASS.equals(eFeature)) {
    		setCONTEXT__SRC__javaClass((org.emftext.language.java.classifiers.Class) newValue); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.CLASS_IMPLEMENT_TO_CLASS_IMPLEMENT___MARKER__CONTEX_T__TR_G__UML_CLASS.equals(eFeature)) {
    		setCONTEXT__TRG__umlClass((org.eclipse.uml2.uml.Class) newValue); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.CLASS_IMPLEMENT_TO_CLASS_IMPLEMENT___MARKER__CREAT_E__TR_G__UML_INTERFACE.equals(eFeature)) {
    		setCREATE__TRG__umlInterface((org.eclipse.uml2.uml.Interface) newValue); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.CLASS_IMPLEMENT_TO_CLASS_IMPLEMENT___MARKER__CREAT_E__TR_G__UML_INTERFACE_REALIZATION.equals(eFeature)) {
    		setCREATE__TRG__umlInterfaceRealization((org.eclipse.uml2.uml.InterfaceRealization) newValue); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.CLASS_IMPLEMENT_TO_CLASS_IMPLEMENT___MARKER__CONTEX_T__COR_R__JAVA_CLASSIFIER_TO_UML_CLASSIFIER.equals(eFeature)) {
    		setCONTEXT__CORR__javaClassifierToUmlClassifier((Java2Uml.JavaClassifierToUmlClassifier) newValue); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.CLASS_IMPLEMENT_TO_CLASS_IMPLEMENT___MARKER__CREAT_E__COR_R__JAVA_SUPER_CLASSIFIER_TO_UML_SUPER_CLASSIFIER.equals(eFeature)) {
    		setCREATE__CORR__javaSuperClassifierToUmlSuperClassifier((Java2Uml.JavaClassifierToUmlClassifier) newValue); 
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
    	if (Java2UmlPackage.Literals.CLASS_IMPLEMENT_TO_CLASS_IMPLEMENT___MARKER__CREAT_E__SR_C__INTERFACE.equals(eFeature)) {
    		setCREATE__SRC__interface((org.emftext.language.java.classifiers.Interface)null); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.CLASS_IMPLEMENT_TO_CLASS_IMPLEMENT___MARKER__CREAT_E__SR_C__INTERFACE_TYPE_REF.equals(eFeature)) {
    		setCREATE__SRC__interfaceTypeRef((org.emftext.language.java.types.ClassifierReference)null); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.CLASS_IMPLEMENT_TO_CLASS_IMPLEMENT___MARKER__CONTEX_T__SR_C__JAVA_CLASS.equals(eFeature)) {
    		setCONTEXT__SRC__javaClass((org.emftext.language.java.classifiers.Class)null); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.CLASS_IMPLEMENT_TO_CLASS_IMPLEMENT___MARKER__CONTEX_T__TR_G__UML_CLASS.equals(eFeature)) {
    		setCONTEXT__TRG__umlClass((org.eclipse.uml2.uml.Class)null); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.CLASS_IMPLEMENT_TO_CLASS_IMPLEMENT___MARKER__CREAT_E__TR_G__UML_INTERFACE.equals(eFeature)) {
    		setCREATE__TRG__umlInterface((org.eclipse.uml2.uml.Interface)null); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.CLASS_IMPLEMENT_TO_CLASS_IMPLEMENT___MARKER__CREAT_E__TR_G__UML_INTERFACE_REALIZATION.equals(eFeature)) {
    		setCREATE__TRG__umlInterfaceRealization((org.eclipse.uml2.uml.InterfaceRealization)null); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.CLASS_IMPLEMENT_TO_CLASS_IMPLEMENT___MARKER__CONTEX_T__COR_R__JAVA_CLASSIFIER_TO_UML_CLASSIFIER.equals(eFeature)) {
    		setCONTEXT__CORR__javaClassifierToUmlClassifier((Java2Uml.JavaClassifierToUmlClassifier)null); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.CLASS_IMPLEMENT_TO_CLASS_IMPLEMENT___MARKER__CREAT_E__COR_R__JAVA_SUPER_CLASSIFIER_TO_UML_SUPER_CLASSIFIER.equals(eFeature)) {
    		setCREATE__CORR__javaSuperClassifierToUmlSuperClassifier((Java2Uml.JavaClassifierToUmlClassifier)null); 
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
    	if (Java2UmlPackage.Literals.CLASS_IMPLEMENT_TO_CLASS_IMPLEMENT___MARKER__CREAT_E__SR_C__INTERFACE.equals(eFeature))
    		return getCREATE__SRC__interface();
    	if (Java2UmlPackage.Literals.CLASS_IMPLEMENT_TO_CLASS_IMPLEMENT___MARKER__CREAT_E__SR_C__INTERFACE_TYPE_REF.equals(eFeature))
    		return getCREATE__SRC__interfaceTypeRef();
    	if (Java2UmlPackage.Literals.CLASS_IMPLEMENT_TO_CLASS_IMPLEMENT___MARKER__CONTEX_T__SR_C__JAVA_CLASS.equals(eFeature))
    		return getCONTEXT__SRC__javaClass();
    	if (Java2UmlPackage.Literals.CLASS_IMPLEMENT_TO_CLASS_IMPLEMENT___MARKER__CONTEX_T__TR_G__UML_CLASS.equals(eFeature))
    		return getCONTEXT__TRG__umlClass();
    	if (Java2UmlPackage.Literals.CLASS_IMPLEMENT_TO_CLASS_IMPLEMENT___MARKER__CREAT_E__TR_G__UML_INTERFACE.equals(eFeature))
    		return getCREATE__TRG__umlInterface();
    	if (Java2UmlPackage.Literals.CLASS_IMPLEMENT_TO_CLASS_IMPLEMENT___MARKER__CREAT_E__TR_G__UML_INTERFACE_REALIZATION.equals(eFeature))
    		return getCREATE__TRG__umlInterfaceRealization();
    	if (Java2UmlPackage.Literals.CLASS_IMPLEMENT_TO_CLASS_IMPLEMENT___MARKER__CONTEX_T__COR_R__JAVA_CLASSIFIER_TO_UML_CLASSIFIER.equals(eFeature))
    		return getCONTEXT__CORR__javaClassifierToUmlClassifier();
    	if (Java2UmlPackage.Literals.CLASS_IMPLEMENT_TO_CLASS_IMPLEMENT___MARKER__CREAT_E__COR_R__JAVA_SUPER_CLASSIFIER_TO_UML_SUPER_CLASSIFIER.equals(eFeature))
    		return getCREATE__CORR__javaSuperClassifierToUmlSuperClassifier();
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
