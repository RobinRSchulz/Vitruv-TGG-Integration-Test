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

public class ClassMethodToMethod__MarkerImpl extends SmartObject implements Java2Uml.ClassMethodToMethod__Marker {

    protected runtime.Protocol protocol = null;
    protected org.emftext.language.java.classifiers.Class CONTEXT__SRC__javaConcreteClassifier = null;
    protected org.emftext.language.java.members.ClassMethod CREATE__SRC__method = null;
    protected org.eclipse.uml2.uml.Class CONTEXT__TRG__umlClassifier = null;
    protected org.eclipse.uml2.uml.Operation CREATE__TRG__umlOperation = null;
    protected Java2Uml.JavaClassifierToUmlClassifier CONTEXT__CORR__j = null;
    protected Java2Uml.JavaMethodToOperation CREATE__CORR__javaMethodToOperation = null;
	
	protected ClassMethodToMethod__MarkerImpl() {
		super(Java2UmlPackage.Literals.CLASS_METHOD_TO_METHOD___MARKER);
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
    public org.emftext.language.java.classifiers.Class getCONTEXT__SRC__javaConcreteClassifier() {
    	return this.CONTEXT__SRC__javaConcreteClassifier;
    }
    
    @Override
    public void setCONTEXT__SRC__javaConcreteClassifier(org.emftext.language.java.classifiers.Class value) {
    	
    	Object oldValue = this.CONTEXT__SRC__javaConcreteClassifier;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CONTEXT__SRC__javaConcreteClassifier = value;
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Java2UmlPackage.Literals.CLASS_METHOD_TO_METHOD___MARKER__CONTEX_T__SR_C__JAVA_CONCRETE_CLASSIFIER, oldValue, value, -1));
    	        	
    	        	if(Java2UmlPackage.Literals.CLASS_METHOD_TO_METHOD___MARKER__CONTEX_T__SR_C__JAVA_CONCRETE_CLASSIFIER.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Java2UmlPackage.Literals.CLASS_METHOD_TO_METHOD___MARKER__CONTEX_T__SR_C__JAVA_CONCRETE_CLASSIFIER.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Java2UmlPackage.Literals.CLASS_METHOD_TO_METHOD___MARKER__CONTEX_T__SR_C__JAVA_CONCRETE_CLASSIFIER.getEOpposite());
    	        		}
    	        	}
    }
    
    
    @Override
    public org.emftext.language.java.members.ClassMethod getCREATE__SRC__method() {
    	return this.CREATE__SRC__method;
    }
    
    @Override
    public void setCREATE__SRC__method(org.emftext.language.java.members.ClassMethod value) {
    	
    	Object oldValue = this.CREATE__SRC__method;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CREATE__SRC__method = value;
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Java2UmlPackage.Literals.CLASS_METHOD_TO_METHOD___MARKER__CREAT_E__SR_C__METHOD, oldValue, value, -1));
    	        	
    	        	if(Java2UmlPackage.Literals.CLASS_METHOD_TO_METHOD___MARKER__CREAT_E__SR_C__METHOD.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Java2UmlPackage.Literals.CLASS_METHOD_TO_METHOD___MARKER__CREAT_E__SR_C__METHOD.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Java2UmlPackage.Literals.CLASS_METHOD_TO_METHOD___MARKER__CREAT_E__SR_C__METHOD.getEOpposite());
    	        		}
    	        	}
    }
    
    
    @Override
    public org.eclipse.uml2.uml.Class getCONTEXT__TRG__umlClassifier() {
    	return this.CONTEXT__TRG__umlClassifier;
    }
    
    @Override
    public void setCONTEXT__TRG__umlClassifier(org.eclipse.uml2.uml.Class value) {
    	
    	Object oldValue = this.CONTEXT__TRG__umlClassifier;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CONTEXT__TRG__umlClassifier = value;
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Java2UmlPackage.Literals.CLASS_METHOD_TO_METHOD___MARKER__CONTEX_T__TR_G__UML_CLASSIFIER, oldValue, value, -1));
    	        	
    	        	if(Java2UmlPackage.Literals.CLASS_METHOD_TO_METHOD___MARKER__CONTEX_T__TR_G__UML_CLASSIFIER.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Java2UmlPackage.Literals.CLASS_METHOD_TO_METHOD___MARKER__CONTEX_T__TR_G__UML_CLASSIFIER.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Java2UmlPackage.Literals.CLASS_METHOD_TO_METHOD___MARKER__CONTEX_T__TR_G__UML_CLASSIFIER.getEOpposite());
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
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Java2UmlPackage.Literals.CLASS_METHOD_TO_METHOD___MARKER__CREAT_E__TR_G__UML_OPERATION, oldValue, value, -1));
    	        	
    	        	if(Java2UmlPackage.Literals.CLASS_METHOD_TO_METHOD___MARKER__CREAT_E__TR_G__UML_OPERATION.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Java2UmlPackage.Literals.CLASS_METHOD_TO_METHOD___MARKER__CREAT_E__TR_G__UML_OPERATION.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Java2UmlPackage.Literals.CLASS_METHOD_TO_METHOD___MARKER__CREAT_E__TR_G__UML_OPERATION.getEOpposite());
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
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Java2UmlPackage.Literals.CLASS_METHOD_TO_METHOD___MARKER__CONTEX_T__COR_R__J, oldValue, value, -1));
    	        	
    	        	if(Java2UmlPackage.Literals.CLASS_METHOD_TO_METHOD___MARKER__CONTEX_T__COR_R__J.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Java2UmlPackage.Literals.CLASS_METHOD_TO_METHOD___MARKER__CONTEX_T__COR_R__J.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Java2UmlPackage.Literals.CLASS_METHOD_TO_METHOD___MARKER__CONTEX_T__COR_R__J.getEOpposite());
    	        		}
    	        	}
    }
    
    
    @Override
    public Java2Uml.JavaMethodToOperation getCREATE__CORR__javaMethodToOperation() {
    	return this.CREATE__CORR__javaMethodToOperation;
    }
    
    @Override
    public void setCREATE__CORR__javaMethodToOperation(Java2Uml.JavaMethodToOperation value) {
    	
    	Object oldValue = this.CREATE__CORR__javaMethodToOperation;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CREATE__CORR__javaMethodToOperation = value;
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Java2UmlPackage.Literals.CLASS_METHOD_TO_METHOD___MARKER__CREAT_E__COR_R__JAVA_METHOD_TO_OPERATION, oldValue, value, -1));
    	        	
    	        	if(Java2UmlPackage.Literals.CLASS_METHOD_TO_METHOD___MARKER__CREAT_E__COR_R__JAVA_METHOD_TO_OPERATION.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Java2UmlPackage.Literals.CLASS_METHOD_TO_METHOD___MARKER__CREAT_E__COR_R__JAVA_METHOD_TO_OPERATION.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Java2UmlPackage.Literals.CLASS_METHOD_TO_METHOD___MARKER__CREAT_E__COR_R__JAVA_METHOD_TO_OPERATION.getEOpposite());
    	        		}
    	        	}
    }
    

    @Override
    public void eSet(EStructuralFeature eFeature, Object newValue){
    	if (RuntimePackage.Literals.TGG_RULE_APPLICATION__PROTOCOL.equals(eFeature)) {
    		setProtocol((runtime.Protocol) newValue); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.CLASS_METHOD_TO_METHOD___MARKER__CONTEX_T__SR_C__JAVA_CONCRETE_CLASSIFIER.equals(eFeature)) {
    		setCONTEXT__SRC__javaConcreteClassifier((org.emftext.language.java.classifiers.Class) newValue); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.CLASS_METHOD_TO_METHOD___MARKER__CREAT_E__SR_C__METHOD.equals(eFeature)) {
    		setCREATE__SRC__method((org.emftext.language.java.members.ClassMethod) newValue); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.CLASS_METHOD_TO_METHOD___MARKER__CONTEX_T__TR_G__UML_CLASSIFIER.equals(eFeature)) {
    		setCONTEXT__TRG__umlClassifier((org.eclipse.uml2.uml.Class) newValue); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.CLASS_METHOD_TO_METHOD___MARKER__CREAT_E__TR_G__UML_OPERATION.equals(eFeature)) {
    		setCREATE__TRG__umlOperation((org.eclipse.uml2.uml.Operation) newValue); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.CLASS_METHOD_TO_METHOD___MARKER__CONTEX_T__COR_R__J.equals(eFeature)) {
    		setCONTEXT__CORR__j((Java2Uml.JavaClassifierToUmlClassifier) newValue); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.CLASS_METHOD_TO_METHOD___MARKER__CREAT_E__COR_R__JAVA_METHOD_TO_OPERATION.equals(eFeature)) {
    		setCREATE__CORR__javaMethodToOperation((Java2Uml.JavaMethodToOperation) newValue); 
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
    	if (Java2UmlPackage.Literals.CLASS_METHOD_TO_METHOD___MARKER__CONTEX_T__SR_C__JAVA_CONCRETE_CLASSIFIER.equals(eFeature)) {
    		setCONTEXT__SRC__javaConcreteClassifier((org.emftext.language.java.classifiers.Class)null); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.CLASS_METHOD_TO_METHOD___MARKER__CREAT_E__SR_C__METHOD.equals(eFeature)) {
    		setCREATE__SRC__method((org.emftext.language.java.members.ClassMethod)null); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.CLASS_METHOD_TO_METHOD___MARKER__CONTEX_T__TR_G__UML_CLASSIFIER.equals(eFeature)) {
    		setCONTEXT__TRG__umlClassifier((org.eclipse.uml2.uml.Class)null); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.CLASS_METHOD_TO_METHOD___MARKER__CREAT_E__TR_G__UML_OPERATION.equals(eFeature)) {
    		setCREATE__TRG__umlOperation((org.eclipse.uml2.uml.Operation)null); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.CLASS_METHOD_TO_METHOD___MARKER__CONTEX_T__COR_R__J.equals(eFeature)) {
    		setCONTEXT__CORR__j((Java2Uml.JavaClassifierToUmlClassifier)null); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.CLASS_METHOD_TO_METHOD___MARKER__CREAT_E__COR_R__JAVA_METHOD_TO_OPERATION.equals(eFeature)) {
    		setCREATE__CORR__javaMethodToOperation((Java2Uml.JavaMethodToOperation)null); 
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
    	if (Java2UmlPackage.Literals.CLASS_METHOD_TO_METHOD___MARKER__CONTEX_T__SR_C__JAVA_CONCRETE_CLASSIFIER.equals(eFeature))
    		return getCONTEXT__SRC__javaConcreteClassifier();
    	if (Java2UmlPackage.Literals.CLASS_METHOD_TO_METHOD___MARKER__CREAT_E__SR_C__METHOD.equals(eFeature))
    		return getCREATE__SRC__method();
    	if (Java2UmlPackage.Literals.CLASS_METHOD_TO_METHOD___MARKER__CONTEX_T__TR_G__UML_CLASSIFIER.equals(eFeature))
    		return getCONTEXT__TRG__umlClassifier();
    	if (Java2UmlPackage.Literals.CLASS_METHOD_TO_METHOD___MARKER__CREAT_E__TR_G__UML_OPERATION.equals(eFeature))
    		return getCREATE__TRG__umlOperation();
    	if (Java2UmlPackage.Literals.CLASS_METHOD_TO_METHOD___MARKER__CONTEX_T__COR_R__J.equals(eFeature))
    		return getCONTEXT__CORR__j();
    	if (Java2UmlPackage.Literals.CLASS_METHOD_TO_METHOD___MARKER__CREAT_E__COR_R__JAVA_METHOD_TO_OPERATION.equals(eFeature))
    		return getCREATE__CORR__javaMethodToOperation();
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
