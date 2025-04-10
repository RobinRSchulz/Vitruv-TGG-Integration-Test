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

public class FieldStaticToStatic__MarkerImpl extends SmartObject implements Java2Uml.FieldStaticToStatic__Marker {

    protected runtime.Protocol protocol = null;
    protected org.emftext.language.java.members.Field CONTEXT__SRC__javaField = null;
    protected org.emftext.language.java.modifiers.Static CREATE__SRC__modifier = null;
    protected org.eclipse.uml2.uml.Property CONTEXT__TRG__umlProperty = null;
    protected Java2Uml.JavaAttributeToUmlProperty CONTEXT__CORR__javaClassifierToUmlProperty = null;
	
	protected FieldStaticToStatic__MarkerImpl() {
		super(Java2UmlPackage.Literals.FIELD_STATIC_TO_STATIC___MARKER);
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
    public org.emftext.language.java.members.Field getCONTEXT__SRC__javaField() {
    	return this.CONTEXT__SRC__javaField;
    }
    
    @Override
    public void setCONTEXT__SRC__javaField(org.emftext.language.java.members.Field value) {
    	
    	Object oldValue = this.CONTEXT__SRC__javaField;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CONTEXT__SRC__javaField = value;
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Java2UmlPackage.Literals.FIELD_STATIC_TO_STATIC___MARKER__CONTEX_T__SR_C__JAVA_FIELD, oldValue, value, -1));
    	        	
    	        	if(Java2UmlPackage.Literals.FIELD_STATIC_TO_STATIC___MARKER__CONTEX_T__SR_C__JAVA_FIELD.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Java2UmlPackage.Literals.FIELD_STATIC_TO_STATIC___MARKER__CONTEX_T__SR_C__JAVA_FIELD.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Java2UmlPackage.Literals.FIELD_STATIC_TO_STATIC___MARKER__CONTEX_T__SR_C__JAVA_FIELD.getEOpposite());
    	        		}
    	        	}
    }
    
    
    @Override
    public org.emftext.language.java.modifiers.Static getCREATE__SRC__modifier() {
    	return this.CREATE__SRC__modifier;
    }
    
    @Override
    public void setCREATE__SRC__modifier(org.emftext.language.java.modifiers.Static value) {
    	
    	Object oldValue = this.CREATE__SRC__modifier;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CREATE__SRC__modifier = value;
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Java2UmlPackage.Literals.FIELD_STATIC_TO_STATIC___MARKER__CREAT_E__SR_C__MODIFIER, oldValue, value, -1));
    	        	
    	        	if(Java2UmlPackage.Literals.FIELD_STATIC_TO_STATIC___MARKER__CREAT_E__SR_C__MODIFIER.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Java2UmlPackage.Literals.FIELD_STATIC_TO_STATIC___MARKER__CREAT_E__SR_C__MODIFIER.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Java2UmlPackage.Literals.FIELD_STATIC_TO_STATIC___MARKER__CREAT_E__SR_C__MODIFIER.getEOpposite());
    	        		}
    	        	}
    }
    
    
    @Override
    public org.eclipse.uml2.uml.Property getCONTEXT__TRG__umlProperty() {
    	return this.CONTEXT__TRG__umlProperty;
    }
    
    @Override
    public void setCONTEXT__TRG__umlProperty(org.eclipse.uml2.uml.Property value) {
    	
    	Object oldValue = this.CONTEXT__TRG__umlProperty;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CONTEXT__TRG__umlProperty = value;
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Java2UmlPackage.Literals.FIELD_STATIC_TO_STATIC___MARKER__CONTEX_T__TR_G__UML_PROPERTY, oldValue, value, -1));
    	        	
    	        	if(Java2UmlPackage.Literals.FIELD_STATIC_TO_STATIC___MARKER__CONTEX_T__TR_G__UML_PROPERTY.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Java2UmlPackage.Literals.FIELD_STATIC_TO_STATIC___MARKER__CONTEX_T__TR_G__UML_PROPERTY.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Java2UmlPackage.Literals.FIELD_STATIC_TO_STATIC___MARKER__CONTEX_T__TR_G__UML_PROPERTY.getEOpposite());
    	        		}
    	        	}
    }
    
    
    @Override
    public Java2Uml.JavaAttributeToUmlProperty getCONTEXT__CORR__javaClassifierToUmlProperty() {
    	return this.CONTEXT__CORR__javaClassifierToUmlProperty;
    }
    
    @Override
    public void setCONTEXT__CORR__javaClassifierToUmlProperty(Java2Uml.JavaAttributeToUmlProperty value) {
    	
    	Object oldValue = this.CONTEXT__CORR__javaClassifierToUmlProperty;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CONTEXT__CORR__javaClassifierToUmlProperty = value;
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Java2UmlPackage.Literals.FIELD_STATIC_TO_STATIC___MARKER__CONTEX_T__COR_R__JAVA_CLASSIFIER_TO_UML_PROPERTY, oldValue, value, -1));
    	        	
    	        	if(Java2UmlPackage.Literals.FIELD_STATIC_TO_STATIC___MARKER__CONTEX_T__COR_R__JAVA_CLASSIFIER_TO_UML_PROPERTY.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Java2UmlPackage.Literals.FIELD_STATIC_TO_STATIC___MARKER__CONTEX_T__COR_R__JAVA_CLASSIFIER_TO_UML_PROPERTY.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Java2UmlPackage.Literals.FIELD_STATIC_TO_STATIC___MARKER__CONTEX_T__COR_R__JAVA_CLASSIFIER_TO_UML_PROPERTY.getEOpposite());
    	        		}
    	        	}
    }
    

    @Override
    public void eSet(EStructuralFeature eFeature, Object newValue){
    	if (RuntimePackage.Literals.TGG_RULE_APPLICATION__PROTOCOL.equals(eFeature)) {
    		setProtocol((runtime.Protocol) newValue); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.FIELD_STATIC_TO_STATIC___MARKER__CONTEX_T__SR_C__JAVA_FIELD.equals(eFeature)) {
    		setCONTEXT__SRC__javaField((org.emftext.language.java.members.Field) newValue); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.FIELD_STATIC_TO_STATIC___MARKER__CREAT_E__SR_C__MODIFIER.equals(eFeature)) {
    		setCREATE__SRC__modifier((org.emftext.language.java.modifiers.Static) newValue); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.FIELD_STATIC_TO_STATIC___MARKER__CONTEX_T__TR_G__UML_PROPERTY.equals(eFeature)) {
    		setCONTEXT__TRG__umlProperty((org.eclipse.uml2.uml.Property) newValue); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.FIELD_STATIC_TO_STATIC___MARKER__CONTEX_T__COR_R__JAVA_CLASSIFIER_TO_UML_PROPERTY.equals(eFeature)) {
    		setCONTEXT__CORR__javaClassifierToUmlProperty((Java2Uml.JavaAttributeToUmlProperty) newValue); 
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
    	if (Java2UmlPackage.Literals.FIELD_STATIC_TO_STATIC___MARKER__CONTEX_T__SR_C__JAVA_FIELD.equals(eFeature)) {
    		setCONTEXT__SRC__javaField((org.emftext.language.java.members.Field)null); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.FIELD_STATIC_TO_STATIC___MARKER__CREAT_E__SR_C__MODIFIER.equals(eFeature)) {
    		setCREATE__SRC__modifier((org.emftext.language.java.modifiers.Static)null); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.FIELD_STATIC_TO_STATIC___MARKER__CONTEX_T__TR_G__UML_PROPERTY.equals(eFeature)) {
    		setCONTEXT__TRG__umlProperty((org.eclipse.uml2.uml.Property)null); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.FIELD_STATIC_TO_STATIC___MARKER__CONTEX_T__COR_R__JAVA_CLASSIFIER_TO_UML_PROPERTY.equals(eFeature)) {
    		setCONTEXT__CORR__javaClassifierToUmlProperty((Java2Uml.JavaAttributeToUmlProperty)null); 
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
    	if (Java2UmlPackage.Literals.FIELD_STATIC_TO_STATIC___MARKER__CONTEX_T__SR_C__JAVA_FIELD.equals(eFeature))
    		return getCONTEXT__SRC__javaField();
    	if (Java2UmlPackage.Literals.FIELD_STATIC_TO_STATIC___MARKER__CREAT_E__SR_C__MODIFIER.equals(eFeature))
    		return getCREATE__SRC__modifier();
    	if (Java2UmlPackage.Literals.FIELD_STATIC_TO_STATIC___MARKER__CONTEX_T__TR_G__UML_PROPERTY.equals(eFeature))
    		return getCONTEXT__TRG__umlProperty();
    	if (Java2UmlPackage.Literals.FIELD_STATIC_TO_STATIC___MARKER__CONTEX_T__COR_R__JAVA_CLASSIFIER_TO_UML_PROPERTY.equals(eFeature))
    		return getCONTEXT__CORR__javaClassifierToUmlProperty();
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
