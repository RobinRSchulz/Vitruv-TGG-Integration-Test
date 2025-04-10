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

public class MethodAbstractToAbstract__MarkerImpl extends SmartObject implements Java2Uml.MethodAbstractToAbstract__Marker {

    protected runtime.Protocol protocol = null;
    protected org.emftext.language.java.members.ClassMethod CONTEXT__SRC__javaMethod = null;
    protected org.emftext.language.java.modifiers.Abstract CREATE__SRC__modifier = null;
    protected org.eclipse.uml2.uml.Operation CONTEXT__TRG__umlOperation = null;
    protected Java2Uml.JavaMethodToOperation CONTEXT__CORR__javaMethodToOperation = null;
	
	protected MethodAbstractToAbstract__MarkerImpl() {
		super(Java2UmlPackage.Literals.METHOD_ABSTRACT_TO_ABSTRACT___MARKER);
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
    public org.emftext.language.java.members.ClassMethod getCONTEXT__SRC__javaMethod() {
    	return this.CONTEXT__SRC__javaMethod;
    }
    
    @Override
    public void setCONTEXT__SRC__javaMethod(org.emftext.language.java.members.ClassMethod value) {
    	
    	Object oldValue = this.CONTEXT__SRC__javaMethod;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CONTEXT__SRC__javaMethod = value;
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Java2UmlPackage.Literals.METHOD_ABSTRACT_TO_ABSTRACT___MARKER__CONTEX_T__SR_C__JAVA_METHOD, oldValue, value, -1));
    	        	
    	        	if(Java2UmlPackage.Literals.METHOD_ABSTRACT_TO_ABSTRACT___MARKER__CONTEX_T__SR_C__JAVA_METHOD.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Java2UmlPackage.Literals.METHOD_ABSTRACT_TO_ABSTRACT___MARKER__CONTEX_T__SR_C__JAVA_METHOD.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Java2UmlPackage.Literals.METHOD_ABSTRACT_TO_ABSTRACT___MARKER__CONTEX_T__SR_C__JAVA_METHOD.getEOpposite());
    	        		}
    	        	}
    }
    
    
    @Override
    public org.emftext.language.java.modifiers.Abstract getCREATE__SRC__modifier() {
    	return this.CREATE__SRC__modifier;
    }
    
    @Override
    public void setCREATE__SRC__modifier(org.emftext.language.java.modifiers.Abstract value) {
    	
    	Object oldValue = this.CREATE__SRC__modifier;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CREATE__SRC__modifier = value;
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Java2UmlPackage.Literals.METHOD_ABSTRACT_TO_ABSTRACT___MARKER__CREAT_E__SR_C__MODIFIER, oldValue, value, -1));
    	        	
    	        	if(Java2UmlPackage.Literals.METHOD_ABSTRACT_TO_ABSTRACT___MARKER__CREAT_E__SR_C__MODIFIER.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Java2UmlPackage.Literals.METHOD_ABSTRACT_TO_ABSTRACT___MARKER__CREAT_E__SR_C__MODIFIER.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Java2UmlPackage.Literals.METHOD_ABSTRACT_TO_ABSTRACT___MARKER__CREAT_E__SR_C__MODIFIER.getEOpposite());
    	        		}
    	        	}
    }
    
    
    @Override
    public org.eclipse.uml2.uml.Operation getCONTEXT__TRG__umlOperation() {
    	return this.CONTEXT__TRG__umlOperation;
    }
    
    @Override
    public void setCONTEXT__TRG__umlOperation(org.eclipse.uml2.uml.Operation value) {
    	
    	Object oldValue = this.CONTEXT__TRG__umlOperation;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CONTEXT__TRG__umlOperation = value;
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Java2UmlPackage.Literals.METHOD_ABSTRACT_TO_ABSTRACT___MARKER__CONTEX_T__TR_G__UML_OPERATION, oldValue, value, -1));
    	        	
    	        	if(Java2UmlPackage.Literals.METHOD_ABSTRACT_TO_ABSTRACT___MARKER__CONTEX_T__TR_G__UML_OPERATION.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Java2UmlPackage.Literals.METHOD_ABSTRACT_TO_ABSTRACT___MARKER__CONTEX_T__TR_G__UML_OPERATION.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Java2UmlPackage.Literals.METHOD_ABSTRACT_TO_ABSTRACT___MARKER__CONTEX_T__TR_G__UML_OPERATION.getEOpposite());
    	        		}
    	        	}
    }
    
    
    @Override
    public Java2Uml.JavaMethodToOperation getCONTEXT__CORR__javaMethodToOperation() {
    	return this.CONTEXT__CORR__javaMethodToOperation;
    }
    
    @Override
    public void setCONTEXT__CORR__javaMethodToOperation(Java2Uml.JavaMethodToOperation value) {
    	
    	Object oldValue = this.CONTEXT__CORR__javaMethodToOperation;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CONTEXT__CORR__javaMethodToOperation = value;
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Java2UmlPackage.Literals.METHOD_ABSTRACT_TO_ABSTRACT___MARKER__CONTEX_T__COR_R__JAVA_METHOD_TO_OPERATION, oldValue, value, -1));
    	        	
    	        	if(Java2UmlPackage.Literals.METHOD_ABSTRACT_TO_ABSTRACT___MARKER__CONTEX_T__COR_R__JAVA_METHOD_TO_OPERATION.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Java2UmlPackage.Literals.METHOD_ABSTRACT_TO_ABSTRACT___MARKER__CONTEX_T__COR_R__JAVA_METHOD_TO_OPERATION.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Java2UmlPackage.Literals.METHOD_ABSTRACT_TO_ABSTRACT___MARKER__CONTEX_T__COR_R__JAVA_METHOD_TO_OPERATION.getEOpposite());
    	        		}
    	        	}
    }
    

    @Override
    public void eSet(EStructuralFeature eFeature, Object newValue){
    	if (RuntimePackage.Literals.TGG_RULE_APPLICATION__PROTOCOL.equals(eFeature)) {
    		setProtocol((runtime.Protocol) newValue); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.METHOD_ABSTRACT_TO_ABSTRACT___MARKER__CONTEX_T__SR_C__JAVA_METHOD.equals(eFeature)) {
    		setCONTEXT__SRC__javaMethod((org.emftext.language.java.members.ClassMethod) newValue); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.METHOD_ABSTRACT_TO_ABSTRACT___MARKER__CREAT_E__SR_C__MODIFIER.equals(eFeature)) {
    		setCREATE__SRC__modifier((org.emftext.language.java.modifiers.Abstract) newValue); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.METHOD_ABSTRACT_TO_ABSTRACT___MARKER__CONTEX_T__TR_G__UML_OPERATION.equals(eFeature)) {
    		setCONTEXT__TRG__umlOperation((org.eclipse.uml2.uml.Operation) newValue); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.METHOD_ABSTRACT_TO_ABSTRACT___MARKER__CONTEX_T__COR_R__JAVA_METHOD_TO_OPERATION.equals(eFeature)) {
    		setCONTEXT__CORR__javaMethodToOperation((Java2Uml.JavaMethodToOperation) newValue); 
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
    	if (Java2UmlPackage.Literals.METHOD_ABSTRACT_TO_ABSTRACT___MARKER__CONTEX_T__SR_C__JAVA_METHOD.equals(eFeature)) {
    		setCONTEXT__SRC__javaMethod((org.emftext.language.java.members.ClassMethod)null); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.METHOD_ABSTRACT_TO_ABSTRACT___MARKER__CREAT_E__SR_C__MODIFIER.equals(eFeature)) {
    		setCREATE__SRC__modifier((org.emftext.language.java.modifiers.Abstract)null); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.METHOD_ABSTRACT_TO_ABSTRACT___MARKER__CONTEX_T__TR_G__UML_OPERATION.equals(eFeature)) {
    		setCONTEXT__TRG__umlOperation((org.eclipse.uml2.uml.Operation)null); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.METHOD_ABSTRACT_TO_ABSTRACT___MARKER__CONTEX_T__COR_R__JAVA_METHOD_TO_OPERATION.equals(eFeature)) {
    		setCONTEXT__CORR__javaMethodToOperation((Java2Uml.JavaMethodToOperation)null); 
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
    	if (Java2UmlPackage.Literals.METHOD_ABSTRACT_TO_ABSTRACT___MARKER__CONTEX_T__SR_C__JAVA_METHOD.equals(eFeature))
    		return getCONTEXT__SRC__javaMethod();
    	if (Java2UmlPackage.Literals.METHOD_ABSTRACT_TO_ABSTRACT___MARKER__CREAT_E__SR_C__MODIFIER.equals(eFeature))
    		return getCREATE__SRC__modifier();
    	if (Java2UmlPackage.Literals.METHOD_ABSTRACT_TO_ABSTRACT___MARKER__CONTEX_T__TR_G__UML_OPERATION.equals(eFeature))
    		return getCONTEXT__TRG__umlOperation();
    	if (Java2UmlPackage.Literals.METHOD_ABSTRACT_TO_ABSTRACT___MARKER__CONTEX_T__COR_R__JAVA_METHOD_TO_OPERATION.equals(eFeature))
    		return getCONTEXT__CORR__javaMethodToOperation();
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
