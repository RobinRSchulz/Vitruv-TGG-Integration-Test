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

public class InterfaceConstructorToConstructor__MarkerImpl extends SmartObject implements Java2Uml.InterfaceConstructorToConstructor__Marker {

    protected runtime.Protocol protocol = null;
    protected org.emftext.language.java.members.Constructor CREATE__SRC__constructor = null;
    protected org.emftext.language.java.classifiers.Interface CONTEXT__SRC__javaConcreteClassifier = null;
    protected org.eclipse.uml2.uml.Interface CONTEXT__TRG__umlClassifier = null;
    protected org.eclipse.uml2.uml.Operation CREATE__TRG__umlOperation = null;
    protected Java2Uml.JavaClassifierToUmlClassifier CONTEXT__CORR__j = null;
    protected Java2Uml.JavaConstructorToOperation CREATE__CORR__javaConstructorToOperation = null;
	
	protected InterfaceConstructorToConstructor__MarkerImpl() {
		super(Java2UmlPackage.Literals.INTERFACE_CONSTRUCTOR_TO_CONSTRUCTOR___MARKER);
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
    public org.emftext.language.java.members.Constructor getCREATE__SRC__constructor() {
    	return this.CREATE__SRC__constructor;
    }
    
    @Override
    public void setCREATE__SRC__constructor(org.emftext.language.java.members.Constructor value) {
    	
    	Object oldValue = this.CREATE__SRC__constructor;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CREATE__SRC__constructor = value;
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Java2UmlPackage.Literals.INTERFACE_CONSTRUCTOR_TO_CONSTRUCTOR___MARKER__CREAT_E__SR_C__CONSTRUCTOR, oldValue, value, -1));
    	        	
    	        	if(Java2UmlPackage.Literals.INTERFACE_CONSTRUCTOR_TO_CONSTRUCTOR___MARKER__CREAT_E__SR_C__CONSTRUCTOR.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Java2UmlPackage.Literals.INTERFACE_CONSTRUCTOR_TO_CONSTRUCTOR___MARKER__CREAT_E__SR_C__CONSTRUCTOR.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Java2UmlPackage.Literals.INTERFACE_CONSTRUCTOR_TO_CONSTRUCTOR___MARKER__CREAT_E__SR_C__CONSTRUCTOR.getEOpposite());
    	        		}
    	        	}
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
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Java2UmlPackage.Literals.INTERFACE_CONSTRUCTOR_TO_CONSTRUCTOR___MARKER__CONTEX_T__SR_C__JAVA_CONCRETE_CLASSIFIER, oldValue, value, -1));
    	        	
    	        	if(Java2UmlPackage.Literals.INTERFACE_CONSTRUCTOR_TO_CONSTRUCTOR___MARKER__CONTEX_T__SR_C__JAVA_CONCRETE_CLASSIFIER.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Java2UmlPackage.Literals.INTERFACE_CONSTRUCTOR_TO_CONSTRUCTOR___MARKER__CONTEX_T__SR_C__JAVA_CONCRETE_CLASSIFIER.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Java2UmlPackage.Literals.INTERFACE_CONSTRUCTOR_TO_CONSTRUCTOR___MARKER__CONTEX_T__SR_C__JAVA_CONCRETE_CLASSIFIER.getEOpposite());
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
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Java2UmlPackage.Literals.INTERFACE_CONSTRUCTOR_TO_CONSTRUCTOR___MARKER__CONTEX_T__TR_G__UML_CLASSIFIER, oldValue, value, -1));
    	        	
    	        	if(Java2UmlPackage.Literals.INTERFACE_CONSTRUCTOR_TO_CONSTRUCTOR___MARKER__CONTEX_T__TR_G__UML_CLASSIFIER.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Java2UmlPackage.Literals.INTERFACE_CONSTRUCTOR_TO_CONSTRUCTOR___MARKER__CONTEX_T__TR_G__UML_CLASSIFIER.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Java2UmlPackage.Literals.INTERFACE_CONSTRUCTOR_TO_CONSTRUCTOR___MARKER__CONTEX_T__TR_G__UML_CLASSIFIER.getEOpposite());
    	        		}
    	        	}
    }
    
    
    @Override
    public org.eclipse.uml2.uml.Operation getCREATE__TRG__umlOperation() {
    	return this.CREATE__TRG__umlOperation;
    }
    
    @Override
    public void setCREATE__TRG__umlOperation(org.eclipse.uml2.uml.Operation value) {
    	
    	Object oldValue = this.CREATE__TRG__umlOperation;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CREATE__TRG__umlOperation = value;
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Java2UmlPackage.Literals.INTERFACE_CONSTRUCTOR_TO_CONSTRUCTOR___MARKER__CREAT_E__TR_G__UML_OPERATION, oldValue, value, -1));
    	        	
    	        	if(Java2UmlPackage.Literals.INTERFACE_CONSTRUCTOR_TO_CONSTRUCTOR___MARKER__CREAT_E__TR_G__UML_OPERATION.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Java2UmlPackage.Literals.INTERFACE_CONSTRUCTOR_TO_CONSTRUCTOR___MARKER__CREAT_E__TR_G__UML_OPERATION.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Java2UmlPackage.Literals.INTERFACE_CONSTRUCTOR_TO_CONSTRUCTOR___MARKER__CREAT_E__TR_G__UML_OPERATION.getEOpposite());
    	        		}
    	        	}
    }
    
    
    @Override
    public Java2Uml.JavaClassifierToUmlClassifier getCONTEXT__CORR__j() {
    	return this.CONTEXT__CORR__j;
    }
    
    @Override
    public void setCONTEXT__CORR__j(Java2Uml.JavaClassifierToUmlClassifier value) {
    	
    	Object oldValue = this.CONTEXT__CORR__j;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CONTEXT__CORR__j = value;
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Java2UmlPackage.Literals.INTERFACE_CONSTRUCTOR_TO_CONSTRUCTOR___MARKER__CONTEX_T__COR_R__J, oldValue, value, -1));
    	        	
    	        	if(Java2UmlPackage.Literals.INTERFACE_CONSTRUCTOR_TO_CONSTRUCTOR___MARKER__CONTEX_T__COR_R__J.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Java2UmlPackage.Literals.INTERFACE_CONSTRUCTOR_TO_CONSTRUCTOR___MARKER__CONTEX_T__COR_R__J.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Java2UmlPackage.Literals.INTERFACE_CONSTRUCTOR_TO_CONSTRUCTOR___MARKER__CONTEX_T__COR_R__J.getEOpposite());
    	        		}
    	        	}
    }
    
    
    @Override
    public Java2Uml.JavaConstructorToOperation getCREATE__CORR__javaConstructorToOperation() {
    	return this.CREATE__CORR__javaConstructorToOperation;
    }
    
    @Override
    public void setCREATE__CORR__javaConstructorToOperation(Java2Uml.JavaConstructorToOperation value) {
    	
    	Object oldValue = this.CREATE__CORR__javaConstructorToOperation;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CREATE__CORR__javaConstructorToOperation = value;
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Java2UmlPackage.Literals.INTERFACE_CONSTRUCTOR_TO_CONSTRUCTOR___MARKER__CREAT_E__COR_R__JAVA_CONSTRUCTOR_TO_OPERATION, oldValue, value, -1));
    	        	
    	        	if(Java2UmlPackage.Literals.INTERFACE_CONSTRUCTOR_TO_CONSTRUCTOR___MARKER__CREAT_E__COR_R__JAVA_CONSTRUCTOR_TO_OPERATION.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Java2UmlPackage.Literals.INTERFACE_CONSTRUCTOR_TO_CONSTRUCTOR___MARKER__CREAT_E__COR_R__JAVA_CONSTRUCTOR_TO_OPERATION.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Java2UmlPackage.Literals.INTERFACE_CONSTRUCTOR_TO_CONSTRUCTOR___MARKER__CREAT_E__COR_R__JAVA_CONSTRUCTOR_TO_OPERATION.getEOpposite());
    	        		}
    	        	}
    }
    

    @Override
    public void eSet(EStructuralFeature eFeature, Object newValue){
    	if (RuntimePackage.Literals.TGG_RULE_APPLICATION__PROTOCOL.equals(eFeature)) {
    		setProtocol((runtime.Protocol) newValue); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.INTERFACE_CONSTRUCTOR_TO_CONSTRUCTOR___MARKER__CREAT_E__SR_C__CONSTRUCTOR.equals(eFeature)) {
    		setCREATE__SRC__constructor((org.emftext.language.java.members.Constructor) newValue); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.INTERFACE_CONSTRUCTOR_TO_CONSTRUCTOR___MARKER__CONTEX_T__SR_C__JAVA_CONCRETE_CLASSIFIER.equals(eFeature)) {
    		setCONTEXT__SRC__javaConcreteClassifier((org.emftext.language.java.classifiers.Interface) newValue); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.INTERFACE_CONSTRUCTOR_TO_CONSTRUCTOR___MARKER__CONTEX_T__TR_G__UML_CLASSIFIER.equals(eFeature)) {
    		setCONTEXT__TRG__umlClassifier((org.eclipse.uml2.uml.Interface) newValue); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.INTERFACE_CONSTRUCTOR_TO_CONSTRUCTOR___MARKER__CREAT_E__TR_G__UML_OPERATION.equals(eFeature)) {
    		setCREATE__TRG__umlOperation((org.eclipse.uml2.uml.Operation) newValue); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.INTERFACE_CONSTRUCTOR_TO_CONSTRUCTOR___MARKER__CONTEX_T__COR_R__J.equals(eFeature)) {
    		setCONTEXT__CORR__j((Java2Uml.JavaClassifierToUmlClassifier) newValue); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.INTERFACE_CONSTRUCTOR_TO_CONSTRUCTOR___MARKER__CREAT_E__COR_R__JAVA_CONSTRUCTOR_TO_OPERATION.equals(eFeature)) {
    		setCREATE__CORR__javaConstructorToOperation((Java2Uml.JavaConstructorToOperation) newValue); 
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
    	if (Java2UmlPackage.Literals.INTERFACE_CONSTRUCTOR_TO_CONSTRUCTOR___MARKER__CREAT_E__SR_C__CONSTRUCTOR.equals(eFeature)) {
    		setCREATE__SRC__constructor((org.emftext.language.java.members.Constructor)null); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.INTERFACE_CONSTRUCTOR_TO_CONSTRUCTOR___MARKER__CONTEX_T__SR_C__JAVA_CONCRETE_CLASSIFIER.equals(eFeature)) {
    		setCONTEXT__SRC__javaConcreteClassifier((org.emftext.language.java.classifiers.Interface)null); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.INTERFACE_CONSTRUCTOR_TO_CONSTRUCTOR___MARKER__CONTEX_T__TR_G__UML_CLASSIFIER.equals(eFeature)) {
    		setCONTEXT__TRG__umlClassifier((org.eclipse.uml2.uml.Interface)null); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.INTERFACE_CONSTRUCTOR_TO_CONSTRUCTOR___MARKER__CREAT_E__TR_G__UML_OPERATION.equals(eFeature)) {
    		setCREATE__TRG__umlOperation((org.eclipse.uml2.uml.Operation)null); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.INTERFACE_CONSTRUCTOR_TO_CONSTRUCTOR___MARKER__CONTEX_T__COR_R__J.equals(eFeature)) {
    		setCONTEXT__CORR__j((Java2Uml.JavaClassifierToUmlClassifier)null); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.INTERFACE_CONSTRUCTOR_TO_CONSTRUCTOR___MARKER__CREAT_E__COR_R__JAVA_CONSTRUCTOR_TO_OPERATION.equals(eFeature)) {
    		setCREATE__CORR__javaConstructorToOperation((Java2Uml.JavaConstructorToOperation)null); 
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
    	if (Java2UmlPackage.Literals.INTERFACE_CONSTRUCTOR_TO_CONSTRUCTOR___MARKER__CREAT_E__SR_C__CONSTRUCTOR.equals(eFeature))
    		return getCREATE__SRC__constructor();
    	if (Java2UmlPackage.Literals.INTERFACE_CONSTRUCTOR_TO_CONSTRUCTOR___MARKER__CONTEX_T__SR_C__JAVA_CONCRETE_CLASSIFIER.equals(eFeature))
    		return getCONTEXT__SRC__javaConcreteClassifier();
    	if (Java2UmlPackage.Literals.INTERFACE_CONSTRUCTOR_TO_CONSTRUCTOR___MARKER__CONTEX_T__TR_G__UML_CLASSIFIER.equals(eFeature))
    		return getCONTEXT__TRG__umlClassifier();
    	if (Java2UmlPackage.Literals.INTERFACE_CONSTRUCTOR_TO_CONSTRUCTOR___MARKER__CREAT_E__TR_G__UML_OPERATION.equals(eFeature))
    		return getCREATE__TRG__umlOperation();
    	if (Java2UmlPackage.Literals.INTERFACE_CONSTRUCTOR_TO_CONSTRUCTOR___MARKER__CONTEX_T__COR_R__J.equals(eFeature))
    		return getCONTEXT__CORR__j();
    	if (Java2UmlPackage.Literals.INTERFACE_CONSTRUCTOR_TO_CONSTRUCTOR___MARKER__CREAT_E__COR_R__JAVA_CONSTRUCTOR_TO_OPERATION.equals(eFeature))
    		return getCREATE__CORR__javaConstructorToOperation();
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
