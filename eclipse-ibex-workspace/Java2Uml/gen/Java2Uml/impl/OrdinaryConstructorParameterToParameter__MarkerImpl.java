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

public class OrdinaryConstructorParameterToParameter__MarkerImpl extends SmartObject implements Java2Uml.OrdinaryConstructorParameterToParameter__Marker {

    protected runtime.Protocol protocol = null;
    protected org.emftext.language.java.members.Constructor CONTEXT__SRC__javaParametrizable = null;
    protected org.emftext.language.java.parameters.OrdinaryParameter CREATE__SRC__parameter = null;
    protected org.eclipse.uml2.uml.Operation CONTEXT__TRG__umlOperation = null;
    protected org.eclipse.uml2.uml.Parameter CREATE__TRG__umlParameter = null;
    protected Java2Uml.JavaConstructorToOperation CONTEXT__CORR__javaConstructorToOperation = null;
    protected Java2Uml.JavaParameterToParameter CREATE__CORR__parameterToParameter = null;
	
	protected OrdinaryConstructorParameterToParameter__MarkerImpl() {
		super(Java2UmlPackage.Literals.ORDINARY_CONSTRUCTOR_PARAMETER_TO_PARAMETER___MARKER);
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
    public org.emftext.language.java.members.Constructor getCONTEXT__SRC__javaParametrizable() {
    	return this.CONTEXT__SRC__javaParametrizable;
    }
    
    @Override
    public void setCONTEXT__SRC__javaParametrizable(org.emftext.language.java.members.Constructor value) {
    	
    	Object oldValue = this.CONTEXT__SRC__javaParametrizable;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CONTEXT__SRC__javaParametrizable = value;
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Java2UmlPackage.Literals.ORDINARY_CONSTRUCTOR_PARAMETER_TO_PARAMETER___MARKER__CONTEX_T__SR_C__JAVA_PARAMETRIZABLE, oldValue, value, -1));
    	        	
    	        	if(Java2UmlPackage.Literals.ORDINARY_CONSTRUCTOR_PARAMETER_TO_PARAMETER___MARKER__CONTEX_T__SR_C__JAVA_PARAMETRIZABLE.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Java2UmlPackage.Literals.ORDINARY_CONSTRUCTOR_PARAMETER_TO_PARAMETER___MARKER__CONTEX_T__SR_C__JAVA_PARAMETRIZABLE.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Java2UmlPackage.Literals.ORDINARY_CONSTRUCTOR_PARAMETER_TO_PARAMETER___MARKER__CONTEX_T__SR_C__JAVA_PARAMETRIZABLE.getEOpposite());
    	        		}
    	        	}
    }
    
    
    @Override
    public org.emftext.language.java.parameters.OrdinaryParameter getCREATE__SRC__parameter() {
    	return this.CREATE__SRC__parameter;
    }
    
    @Override
    public void setCREATE__SRC__parameter(org.emftext.language.java.parameters.OrdinaryParameter value) {
    	
    	Object oldValue = this.CREATE__SRC__parameter;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CREATE__SRC__parameter = value;
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Java2UmlPackage.Literals.ORDINARY_CONSTRUCTOR_PARAMETER_TO_PARAMETER___MARKER__CREAT_E__SR_C__PARAMETER, oldValue, value, -1));
    	        	
    	        	if(Java2UmlPackage.Literals.ORDINARY_CONSTRUCTOR_PARAMETER_TO_PARAMETER___MARKER__CREAT_E__SR_C__PARAMETER.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Java2UmlPackage.Literals.ORDINARY_CONSTRUCTOR_PARAMETER_TO_PARAMETER___MARKER__CREAT_E__SR_C__PARAMETER.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Java2UmlPackage.Literals.ORDINARY_CONSTRUCTOR_PARAMETER_TO_PARAMETER___MARKER__CREAT_E__SR_C__PARAMETER.getEOpposite());
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
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Java2UmlPackage.Literals.ORDINARY_CONSTRUCTOR_PARAMETER_TO_PARAMETER___MARKER__CONTEX_T__TR_G__UML_OPERATION, oldValue, value, -1));
    	        	
    	        	if(Java2UmlPackage.Literals.ORDINARY_CONSTRUCTOR_PARAMETER_TO_PARAMETER___MARKER__CONTEX_T__TR_G__UML_OPERATION.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Java2UmlPackage.Literals.ORDINARY_CONSTRUCTOR_PARAMETER_TO_PARAMETER___MARKER__CONTEX_T__TR_G__UML_OPERATION.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Java2UmlPackage.Literals.ORDINARY_CONSTRUCTOR_PARAMETER_TO_PARAMETER___MARKER__CONTEX_T__TR_G__UML_OPERATION.getEOpposite());
    	        		}
    	        	}
    }
    
    
    @Override
    public org.eclipse.uml2.uml.Parameter getCREATE__TRG__umlParameter() {
    	return this.CREATE__TRG__umlParameter;
    }
    
    @Override
    public void setCREATE__TRG__umlParameter(org.eclipse.uml2.uml.Parameter value) {
    	
    	Object oldValue = this.CREATE__TRG__umlParameter;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CREATE__TRG__umlParameter = value;
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Java2UmlPackage.Literals.ORDINARY_CONSTRUCTOR_PARAMETER_TO_PARAMETER___MARKER__CREAT_E__TR_G__UML_PARAMETER, oldValue, value, -1));
    	        	
    	        	if(Java2UmlPackage.Literals.ORDINARY_CONSTRUCTOR_PARAMETER_TO_PARAMETER___MARKER__CREAT_E__TR_G__UML_PARAMETER.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Java2UmlPackage.Literals.ORDINARY_CONSTRUCTOR_PARAMETER_TO_PARAMETER___MARKER__CREAT_E__TR_G__UML_PARAMETER.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Java2UmlPackage.Literals.ORDINARY_CONSTRUCTOR_PARAMETER_TO_PARAMETER___MARKER__CREAT_E__TR_G__UML_PARAMETER.getEOpposite());
    	        		}
    	        	}
    }
    
    
    @Override
    public Java2Uml.JavaConstructorToOperation getCONTEXT__CORR__javaConstructorToOperation() {
    	return this.CONTEXT__CORR__javaConstructorToOperation;
    }
    
    @Override
    public void setCONTEXT__CORR__javaConstructorToOperation(Java2Uml.JavaConstructorToOperation value) {
    	
    	Object oldValue = this.CONTEXT__CORR__javaConstructorToOperation;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CONTEXT__CORR__javaConstructorToOperation = value;
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Java2UmlPackage.Literals.ORDINARY_CONSTRUCTOR_PARAMETER_TO_PARAMETER___MARKER__CONTEX_T__COR_R__JAVA_CONSTRUCTOR_TO_OPERATION, oldValue, value, -1));
    	        	
    	        	if(Java2UmlPackage.Literals.ORDINARY_CONSTRUCTOR_PARAMETER_TO_PARAMETER___MARKER__CONTEX_T__COR_R__JAVA_CONSTRUCTOR_TO_OPERATION.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Java2UmlPackage.Literals.ORDINARY_CONSTRUCTOR_PARAMETER_TO_PARAMETER___MARKER__CONTEX_T__COR_R__JAVA_CONSTRUCTOR_TO_OPERATION.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Java2UmlPackage.Literals.ORDINARY_CONSTRUCTOR_PARAMETER_TO_PARAMETER___MARKER__CONTEX_T__COR_R__JAVA_CONSTRUCTOR_TO_OPERATION.getEOpposite());
    	        		}
    	        	}
    }
    
    
    @Override
    public Java2Uml.JavaParameterToParameter getCREATE__CORR__parameterToParameter() {
    	return this.CREATE__CORR__parameterToParameter;
    }
    
    @Override
    public void setCREATE__CORR__parameterToParameter(Java2Uml.JavaParameterToParameter value) {
    	
    	Object oldValue = this.CREATE__CORR__parameterToParameter;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CREATE__CORR__parameterToParameter = value;
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Java2UmlPackage.Literals.ORDINARY_CONSTRUCTOR_PARAMETER_TO_PARAMETER___MARKER__CREAT_E__COR_R__PARAMETER_TO_PARAMETER, oldValue, value, -1));
    	        	
    	        	if(Java2UmlPackage.Literals.ORDINARY_CONSTRUCTOR_PARAMETER_TO_PARAMETER___MARKER__CREAT_E__COR_R__PARAMETER_TO_PARAMETER.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Java2UmlPackage.Literals.ORDINARY_CONSTRUCTOR_PARAMETER_TO_PARAMETER___MARKER__CREAT_E__COR_R__PARAMETER_TO_PARAMETER.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Java2UmlPackage.Literals.ORDINARY_CONSTRUCTOR_PARAMETER_TO_PARAMETER___MARKER__CREAT_E__COR_R__PARAMETER_TO_PARAMETER.getEOpposite());
    	        		}
    	        	}
    }
    

    @Override
    public void eSet(EStructuralFeature eFeature, Object newValue){
    	if (RuntimePackage.Literals.TGG_RULE_APPLICATION__PROTOCOL.equals(eFeature)) {
    		setProtocol((runtime.Protocol) newValue); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.ORDINARY_CONSTRUCTOR_PARAMETER_TO_PARAMETER___MARKER__CONTEX_T__SR_C__JAVA_PARAMETRIZABLE.equals(eFeature)) {
    		setCONTEXT__SRC__javaParametrizable((org.emftext.language.java.members.Constructor) newValue); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.ORDINARY_CONSTRUCTOR_PARAMETER_TO_PARAMETER___MARKER__CREAT_E__SR_C__PARAMETER.equals(eFeature)) {
    		setCREATE__SRC__parameter((org.emftext.language.java.parameters.OrdinaryParameter) newValue); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.ORDINARY_CONSTRUCTOR_PARAMETER_TO_PARAMETER___MARKER__CONTEX_T__TR_G__UML_OPERATION.equals(eFeature)) {
    		setCONTEXT__TRG__umlOperation((org.eclipse.uml2.uml.Operation) newValue); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.ORDINARY_CONSTRUCTOR_PARAMETER_TO_PARAMETER___MARKER__CREAT_E__TR_G__UML_PARAMETER.equals(eFeature)) {
    		setCREATE__TRG__umlParameter((org.eclipse.uml2.uml.Parameter) newValue); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.ORDINARY_CONSTRUCTOR_PARAMETER_TO_PARAMETER___MARKER__CONTEX_T__COR_R__JAVA_CONSTRUCTOR_TO_OPERATION.equals(eFeature)) {
    		setCONTEXT__CORR__javaConstructorToOperation((Java2Uml.JavaConstructorToOperation) newValue); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.ORDINARY_CONSTRUCTOR_PARAMETER_TO_PARAMETER___MARKER__CREAT_E__COR_R__PARAMETER_TO_PARAMETER.equals(eFeature)) {
    		setCREATE__CORR__parameterToParameter((Java2Uml.JavaParameterToParameter) newValue); 
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
    	if (Java2UmlPackage.Literals.ORDINARY_CONSTRUCTOR_PARAMETER_TO_PARAMETER___MARKER__CONTEX_T__SR_C__JAVA_PARAMETRIZABLE.equals(eFeature)) {
    		setCONTEXT__SRC__javaParametrizable((org.emftext.language.java.members.Constructor)null); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.ORDINARY_CONSTRUCTOR_PARAMETER_TO_PARAMETER___MARKER__CREAT_E__SR_C__PARAMETER.equals(eFeature)) {
    		setCREATE__SRC__parameter((org.emftext.language.java.parameters.OrdinaryParameter)null); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.ORDINARY_CONSTRUCTOR_PARAMETER_TO_PARAMETER___MARKER__CONTEX_T__TR_G__UML_OPERATION.equals(eFeature)) {
    		setCONTEXT__TRG__umlOperation((org.eclipse.uml2.uml.Operation)null); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.ORDINARY_CONSTRUCTOR_PARAMETER_TO_PARAMETER___MARKER__CREAT_E__TR_G__UML_PARAMETER.equals(eFeature)) {
    		setCREATE__TRG__umlParameter((org.eclipse.uml2.uml.Parameter)null); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.ORDINARY_CONSTRUCTOR_PARAMETER_TO_PARAMETER___MARKER__CONTEX_T__COR_R__JAVA_CONSTRUCTOR_TO_OPERATION.equals(eFeature)) {
    		setCONTEXT__CORR__javaConstructorToOperation((Java2Uml.JavaConstructorToOperation)null); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.ORDINARY_CONSTRUCTOR_PARAMETER_TO_PARAMETER___MARKER__CREAT_E__COR_R__PARAMETER_TO_PARAMETER.equals(eFeature)) {
    		setCREATE__CORR__parameterToParameter((Java2Uml.JavaParameterToParameter)null); 
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
    	if (Java2UmlPackage.Literals.ORDINARY_CONSTRUCTOR_PARAMETER_TO_PARAMETER___MARKER__CONTEX_T__SR_C__JAVA_PARAMETRIZABLE.equals(eFeature))
    		return getCONTEXT__SRC__javaParametrizable();
    	if (Java2UmlPackage.Literals.ORDINARY_CONSTRUCTOR_PARAMETER_TO_PARAMETER___MARKER__CREAT_E__SR_C__PARAMETER.equals(eFeature))
    		return getCREATE__SRC__parameter();
    	if (Java2UmlPackage.Literals.ORDINARY_CONSTRUCTOR_PARAMETER_TO_PARAMETER___MARKER__CONTEX_T__TR_G__UML_OPERATION.equals(eFeature))
    		return getCONTEXT__TRG__umlOperation();
    	if (Java2UmlPackage.Literals.ORDINARY_CONSTRUCTOR_PARAMETER_TO_PARAMETER___MARKER__CREAT_E__TR_G__UML_PARAMETER.equals(eFeature))
    		return getCREATE__TRG__umlParameter();
    	if (Java2UmlPackage.Literals.ORDINARY_CONSTRUCTOR_PARAMETER_TO_PARAMETER___MARKER__CONTEX_T__COR_R__JAVA_CONSTRUCTOR_TO_OPERATION.equals(eFeature))
    		return getCONTEXT__CORR__javaConstructorToOperation();
    	if (Java2UmlPackage.Literals.ORDINARY_CONSTRUCTOR_PARAMETER_TO_PARAMETER___MARKER__CREAT_E__COR_R__PARAMETER_TO_PARAMETER.equals(eFeature))
    		return getCREATE__CORR__parameterToParameter();
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
