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

public class ClassAttributeTypeToPropertyType__MarkerImpl extends SmartObject implements Java2Uml.ClassAttributeTypeToPropertyType__Marker {

    protected runtime.Protocol protocol = null;
    protected org.emftext.language.java.classifiers.Class CONTEXT__SRC__classifier = null;
    protected org.emftext.language.java.members.Field CONTEXT__SRC__field = null;
    protected org.emftext.language.java.types.ClassifierReference CREATE__SRC__typeReference = null;
    protected org.eclipse.uml2.uml.Property CONTEXT__TRG__property = null;
    protected org.eclipse.uml2.uml.Class CONTEXT__TRG__umlClassifier = null;
    protected Java2Uml.JavaAttributeToUmlProperty CONTEXT__CORR__attributeToProperty = null;
    protected Java2Uml.JavaClassifierToUmlClassifier CONTEXT__CORR__javaClassifierToUmlClassifier = null;
	
	protected ClassAttributeTypeToPropertyType__MarkerImpl() {
		super(Java2UmlPackage.Literals.CLASS_ATTRIBUTE_TYPE_TO_PROPERTY_TYPE___MARKER);
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
    public org.emftext.language.java.classifiers.Class getCONTEXT__SRC__classifier() {
    	return this.CONTEXT__SRC__classifier;
    }
    
    @Override
    public void setCONTEXT__SRC__classifier(org.emftext.language.java.classifiers.Class value) {
    	
    	Object oldValue = this.CONTEXT__SRC__classifier;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CONTEXT__SRC__classifier = value;
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Java2UmlPackage.Literals.CLASS_ATTRIBUTE_TYPE_TO_PROPERTY_TYPE___MARKER__CONTEX_T__SR_C__CLASSIFIER, oldValue, value, -1));
    	        	
    	        	if(Java2UmlPackage.Literals.CLASS_ATTRIBUTE_TYPE_TO_PROPERTY_TYPE___MARKER__CONTEX_T__SR_C__CLASSIFIER.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Java2UmlPackage.Literals.CLASS_ATTRIBUTE_TYPE_TO_PROPERTY_TYPE___MARKER__CONTEX_T__SR_C__CLASSIFIER.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Java2UmlPackage.Literals.CLASS_ATTRIBUTE_TYPE_TO_PROPERTY_TYPE___MARKER__CONTEX_T__SR_C__CLASSIFIER.getEOpposite());
    	        		}
    	        	}
    }
    
    
    @Override
    public org.emftext.language.java.members.Field getCONTEXT__SRC__field() {
    	return this.CONTEXT__SRC__field;
    }
    
    @Override
    public void setCONTEXT__SRC__field(org.emftext.language.java.members.Field value) {
    	
    	Object oldValue = this.CONTEXT__SRC__field;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CONTEXT__SRC__field = value;
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Java2UmlPackage.Literals.CLASS_ATTRIBUTE_TYPE_TO_PROPERTY_TYPE___MARKER__CONTEX_T__SR_C__FIELD, oldValue, value, -1));
    	        	
    	        	if(Java2UmlPackage.Literals.CLASS_ATTRIBUTE_TYPE_TO_PROPERTY_TYPE___MARKER__CONTEX_T__SR_C__FIELD.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Java2UmlPackage.Literals.CLASS_ATTRIBUTE_TYPE_TO_PROPERTY_TYPE___MARKER__CONTEX_T__SR_C__FIELD.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Java2UmlPackage.Literals.CLASS_ATTRIBUTE_TYPE_TO_PROPERTY_TYPE___MARKER__CONTEX_T__SR_C__FIELD.getEOpposite());
    	        		}
    	        	}
    }
    
    
    @Override
    public org.emftext.language.java.types.ClassifierReference getCREATE__SRC__typeReference() {
    	return this.CREATE__SRC__typeReference;
    }
    
    @Override
    public void setCREATE__SRC__typeReference(org.emftext.language.java.types.ClassifierReference value) {
    	
    	Object oldValue = this.CREATE__SRC__typeReference;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CREATE__SRC__typeReference = value;
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Java2UmlPackage.Literals.CLASS_ATTRIBUTE_TYPE_TO_PROPERTY_TYPE___MARKER__CREAT_E__SR_C__TYPE_REFERENCE, oldValue, value, -1));
    	        	
    	        	if(Java2UmlPackage.Literals.CLASS_ATTRIBUTE_TYPE_TO_PROPERTY_TYPE___MARKER__CREAT_E__SR_C__TYPE_REFERENCE.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Java2UmlPackage.Literals.CLASS_ATTRIBUTE_TYPE_TO_PROPERTY_TYPE___MARKER__CREAT_E__SR_C__TYPE_REFERENCE.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Java2UmlPackage.Literals.CLASS_ATTRIBUTE_TYPE_TO_PROPERTY_TYPE___MARKER__CREAT_E__SR_C__TYPE_REFERENCE.getEOpposite());
    	        		}
    	        	}
    }
    
    
    @Override
    public org.eclipse.uml2.uml.Property getCONTEXT__TRG__property() {
    	return this.CONTEXT__TRG__property;
    }
    
    @Override
    public void setCONTEXT__TRG__property(org.eclipse.uml2.uml.Property value) {
    	
    	Object oldValue = this.CONTEXT__TRG__property;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CONTEXT__TRG__property = value;
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Java2UmlPackage.Literals.CLASS_ATTRIBUTE_TYPE_TO_PROPERTY_TYPE___MARKER__CONTEX_T__TR_G__PROPERTY, oldValue, value, -1));
    	        	
    	        	if(Java2UmlPackage.Literals.CLASS_ATTRIBUTE_TYPE_TO_PROPERTY_TYPE___MARKER__CONTEX_T__TR_G__PROPERTY.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Java2UmlPackage.Literals.CLASS_ATTRIBUTE_TYPE_TO_PROPERTY_TYPE___MARKER__CONTEX_T__TR_G__PROPERTY.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Java2UmlPackage.Literals.CLASS_ATTRIBUTE_TYPE_TO_PROPERTY_TYPE___MARKER__CONTEX_T__TR_G__PROPERTY.getEOpposite());
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
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Java2UmlPackage.Literals.CLASS_ATTRIBUTE_TYPE_TO_PROPERTY_TYPE___MARKER__CONTEX_T__TR_G__UML_CLASSIFIER, oldValue, value, -1));
    	        	
    	        	if(Java2UmlPackage.Literals.CLASS_ATTRIBUTE_TYPE_TO_PROPERTY_TYPE___MARKER__CONTEX_T__TR_G__UML_CLASSIFIER.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Java2UmlPackage.Literals.CLASS_ATTRIBUTE_TYPE_TO_PROPERTY_TYPE___MARKER__CONTEX_T__TR_G__UML_CLASSIFIER.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Java2UmlPackage.Literals.CLASS_ATTRIBUTE_TYPE_TO_PROPERTY_TYPE___MARKER__CONTEX_T__TR_G__UML_CLASSIFIER.getEOpposite());
    	        		}
    	        	}
    }
    
    
    @Override
    public Java2Uml.JavaAttributeToUmlProperty getCONTEXT__CORR__attributeToProperty() {
    	return this.CONTEXT__CORR__attributeToProperty;
    }
    
    @Override
    public void setCONTEXT__CORR__attributeToProperty(Java2Uml.JavaAttributeToUmlProperty value) {
    	
    	Object oldValue = this.CONTEXT__CORR__attributeToProperty;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CONTEXT__CORR__attributeToProperty = value;
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Java2UmlPackage.Literals.CLASS_ATTRIBUTE_TYPE_TO_PROPERTY_TYPE___MARKER__CONTEX_T__COR_R__ATTRIBUTE_TO_PROPERTY, oldValue, value, -1));
    	        	
    	        	if(Java2UmlPackage.Literals.CLASS_ATTRIBUTE_TYPE_TO_PROPERTY_TYPE___MARKER__CONTEX_T__COR_R__ATTRIBUTE_TO_PROPERTY.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Java2UmlPackage.Literals.CLASS_ATTRIBUTE_TYPE_TO_PROPERTY_TYPE___MARKER__CONTEX_T__COR_R__ATTRIBUTE_TO_PROPERTY.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Java2UmlPackage.Literals.CLASS_ATTRIBUTE_TYPE_TO_PROPERTY_TYPE___MARKER__CONTEX_T__COR_R__ATTRIBUTE_TO_PROPERTY.getEOpposite());
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
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Java2UmlPackage.Literals.CLASS_ATTRIBUTE_TYPE_TO_PROPERTY_TYPE___MARKER__CONTEX_T__COR_R__JAVA_CLASSIFIER_TO_UML_CLASSIFIER, oldValue, value, -1));
    	        	
    	        	if(Java2UmlPackage.Literals.CLASS_ATTRIBUTE_TYPE_TO_PROPERTY_TYPE___MARKER__CONTEX_T__COR_R__JAVA_CLASSIFIER_TO_UML_CLASSIFIER.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Java2UmlPackage.Literals.CLASS_ATTRIBUTE_TYPE_TO_PROPERTY_TYPE___MARKER__CONTEX_T__COR_R__JAVA_CLASSIFIER_TO_UML_CLASSIFIER.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Java2UmlPackage.Literals.CLASS_ATTRIBUTE_TYPE_TO_PROPERTY_TYPE___MARKER__CONTEX_T__COR_R__JAVA_CLASSIFIER_TO_UML_CLASSIFIER.getEOpposite());
    	        		}
    	        	}
    }
    

    @Override
    public void eSet(EStructuralFeature eFeature, Object newValue){
    	if (RuntimePackage.Literals.TGG_RULE_APPLICATION__PROTOCOL.equals(eFeature)) {
    		setProtocol((runtime.Protocol) newValue); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.CLASS_ATTRIBUTE_TYPE_TO_PROPERTY_TYPE___MARKER__CONTEX_T__SR_C__CLASSIFIER.equals(eFeature)) {
    		setCONTEXT__SRC__classifier((org.emftext.language.java.classifiers.Class) newValue); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.CLASS_ATTRIBUTE_TYPE_TO_PROPERTY_TYPE___MARKER__CONTEX_T__SR_C__FIELD.equals(eFeature)) {
    		setCONTEXT__SRC__field((org.emftext.language.java.members.Field) newValue); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.CLASS_ATTRIBUTE_TYPE_TO_PROPERTY_TYPE___MARKER__CREAT_E__SR_C__TYPE_REFERENCE.equals(eFeature)) {
    		setCREATE__SRC__typeReference((org.emftext.language.java.types.ClassifierReference) newValue); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.CLASS_ATTRIBUTE_TYPE_TO_PROPERTY_TYPE___MARKER__CONTEX_T__TR_G__PROPERTY.equals(eFeature)) {
    		setCONTEXT__TRG__property((org.eclipse.uml2.uml.Property) newValue); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.CLASS_ATTRIBUTE_TYPE_TO_PROPERTY_TYPE___MARKER__CONTEX_T__TR_G__UML_CLASSIFIER.equals(eFeature)) {
    		setCONTEXT__TRG__umlClassifier((org.eclipse.uml2.uml.Class) newValue); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.CLASS_ATTRIBUTE_TYPE_TO_PROPERTY_TYPE___MARKER__CONTEX_T__COR_R__ATTRIBUTE_TO_PROPERTY.equals(eFeature)) {
    		setCONTEXT__CORR__attributeToProperty((Java2Uml.JavaAttributeToUmlProperty) newValue); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.CLASS_ATTRIBUTE_TYPE_TO_PROPERTY_TYPE___MARKER__CONTEX_T__COR_R__JAVA_CLASSIFIER_TO_UML_CLASSIFIER.equals(eFeature)) {
    		setCONTEXT__CORR__javaClassifierToUmlClassifier((Java2Uml.JavaClassifierToUmlClassifier) newValue); 
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
    	if (Java2UmlPackage.Literals.CLASS_ATTRIBUTE_TYPE_TO_PROPERTY_TYPE___MARKER__CONTEX_T__SR_C__CLASSIFIER.equals(eFeature)) {
    		setCONTEXT__SRC__classifier((org.emftext.language.java.classifiers.Class)null); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.CLASS_ATTRIBUTE_TYPE_TO_PROPERTY_TYPE___MARKER__CONTEX_T__SR_C__FIELD.equals(eFeature)) {
    		setCONTEXT__SRC__field((org.emftext.language.java.members.Field)null); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.CLASS_ATTRIBUTE_TYPE_TO_PROPERTY_TYPE___MARKER__CREAT_E__SR_C__TYPE_REFERENCE.equals(eFeature)) {
    		setCREATE__SRC__typeReference((org.emftext.language.java.types.ClassifierReference)null); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.CLASS_ATTRIBUTE_TYPE_TO_PROPERTY_TYPE___MARKER__CONTEX_T__TR_G__PROPERTY.equals(eFeature)) {
    		setCONTEXT__TRG__property((org.eclipse.uml2.uml.Property)null); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.CLASS_ATTRIBUTE_TYPE_TO_PROPERTY_TYPE___MARKER__CONTEX_T__TR_G__UML_CLASSIFIER.equals(eFeature)) {
    		setCONTEXT__TRG__umlClassifier((org.eclipse.uml2.uml.Class)null); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.CLASS_ATTRIBUTE_TYPE_TO_PROPERTY_TYPE___MARKER__CONTEX_T__COR_R__ATTRIBUTE_TO_PROPERTY.equals(eFeature)) {
    		setCONTEXT__CORR__attributeToProperty((Java2Uml.JavaAttributeToUmlProperty)null); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.CLASS_ATTRIBUTE_TYPE_TO_PROPERTY_TYPE___MARKER__CONTEX_T__COR_R__JAVA_CLASSIFIER_TO_UML_CLASSIFIER.equals(eFeature)) {
    		setCONTEXT__CORR__javaClassifierToUmlClassifier((Java2Uml.JavaClassifierToUmlClassifier)null); 
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
    	if (Java2UmlPackage.Literals.CLASS_ATTRIBUTE_TYPE_TO_PROPERTY_TYPE___MARKER__CONTEX_T__SR_C__CLASSIFIER.equals(eFeature))
    		return getCONTEXT__SRC__classifier();
    	if (Java2UmlPackage.Literals.CLASS_ATTRIBUTE_TYPE_TO_PROPERTY_TYPE___MARKER__CONTEX_T__SR_C__FIELD.equals(eFeature))
    		return getCONTEXT__SRC__field();
    	if (Java2UmlPackage.Literals.CLASS_ATTRIBUTE_TYPE_TO_PROPERTY_TYPE___MARKER__CREAT_E__SR_C__TYPE_REFERENCE.equals(eFeature))
    		return getCREATE__SRC__typeReference();
    	if (Java2UmlPackage.Literals.CLASS_ATTRIBUTE_TYPE_TO_PROPERTY_TYPE___MARKER__CONTEX_T__TR_G__PROPERTY.equals(eFeature))
    		return getCONTEXT__TRG__property();
    	if (Java2UmlPackage.Literals.CLASS_ATTRIBUTE_TYPE_TO_PROPERTY_TYPE___MARKER__CONTEX_T__TR_G__UML_CLASSIFIER.equals(eFeature))
    		return getCONTEXT__TRG__umlClassifier();
    	if (Java2UmlPackage.Literals.CLASS_ATTRIBUTE_TYPE_TO_PROPERTY_TYPE___MARKER__CONTEX_T__COR_R__ATTRIBUTE_TO_PROPERTY.equals(eFeature))
    		return getCONTEXT__CORR__attributeToProperty();
    	if (Java2UmlPackage.Literals.CLASS_ATTRIBUTE_TYPE_TO_PROPERTY_TYPE___MARKER__CONTEX_T__COR_R__JAVA_CLASSIFIER_TO_UML_CLASSIFIER.equals(eFeature))
    		return getCONTEXT__CORR__javaClassifierToUmlClassifier();
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
