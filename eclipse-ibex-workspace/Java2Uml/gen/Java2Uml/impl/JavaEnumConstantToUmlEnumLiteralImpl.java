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

public class JavaEnumConstantToUmlEnumLiteralImpl extends SmartObject implements Java2Uml.JavaEnumConstantToUmlEnumLiteral {

    protected org.emftext.language.java.members.EnumConstant source = null;
    protected org.eclipse.uml2.uml.EnumerationLiteral target = null;
	
	protected JavaEnumConstantToUmlEnumLiteralImpl() {
		super(Java2UmlPackage.Literals.JAVA_ENUM_CONSTANT_TO_UML_ENUM_LITERAL);
	}
	
    
    @Override
    public org.emftext.language.java.members.EnumConstant getSource() {
    	return this.source;
    }
    
    @Override
    public void setSource(org.emftext.language.java.members.EnumConstant value) {
    	
    	Object oldValue = this.source;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.source = value;
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Java2UmlPackage.Literals.JAVA_ENUM_CONSTANT_TO_UML_ENUM_LITERAL__SOURCE, oldValue, value, -1));
    	        	
    	        	if(Java2UmlPackage.Literals.JAVA_ENUM_CONSTANT_TO_UML_ENUM_LITERAL__SOURCE.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Java2UmlPackage.Literals.JAVA_ENUM_CONSTANT_TO_UML_ENUM_LITERAL__SOURCE.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Java2UmlPackage.Literals.JAVA_ENUM_CONSTANT_TO_UML_ENUM_LITERAL__SOURCE.getEOpposite());
    	        		}
    	        	}
    }
    
    
    @Override
    public org.eclipse.uml2.uml.EnumerationLiteral getTarget() {
    	return this.target;
    }
    
    @Override
    public void setTarget(org.eclipse.uml2.uml.EnumerationLiteral value) {
    	
    	Object oldValue = this.target;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.target = value;
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Java2UmlPackage.Literals.JAVA_ENUM_CONSTANT_TO_UML_ENUM_LITERAL__TARGET, oldValue, value, -1));
    	        	
    	        	if(Java2UmlPackage.Literals.JAVA_ENUM_CONSTANT_TO_UML_ENUM_LITERAL__TARGET.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Java2UmlPackage.Literals.JAVA_ENUM_CONSTANT_TO_UML_ENUM_LITERAL__TARGET.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Java2UmlPackage.Literals.JAVA_ENUM_CONSTANT_TO_UML_ENUM_LITERAL__TARGET.getEOpposite());
    	        		}
    	        	}
    }
    

    @Override
    public void eSet(EStructuralFeature eFeature, Object newValue){
    	if (Java2UmlPackage.Literals.JAVA_ENUM_CONSTANT_TO_UML_ENUM_LITERAL__SOURCE.equals(eFeature)) {
    		setSource((org.emftext.language.java.members.EnumConstant) newValue); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.JAVA_ENUM_CONSTANT_TO_UML_ENUM_LITERAL__TARGET.equals(eFeature)) {
    		setTarget((org.eclipse.uml2.uml.EnumerationLiteral) newValue); 
    		return;
    	}
    	eDynamicSet(eFeature, newValue);
    }
    
    @Override
    public void eUnset(EStructuralFeature eFeature){
    	if (Java2UmlPackage.Literals.JAVA_ENUM_CONSTANT_TO_UML_ENUM_LITERAL__SOURCE.equals(eFeature)) {
    		setSource((org.emftext.language.java.members.EnumConstant)null); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.JAVA_ENUM_CONSTANT_TO_UML_ENUM_LITERAL__TARGET.equals(eFeature)) {
    		setTarget((org.eclipse.uml2.uml.EnumerationLiteral)null); 
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
    	if (Java2UmlPackage.Literals.JAVA_ENUM_CONSTANT_TO_UML_ENUM_LITERAL__SOURCE.equals(eFeature))
    		return getSource();
    	if (Java2UmlPackage.Literals.JAVA_ENUM_CONSTANT_TO_UML_ENUM_LITERAL__TARGET.equals(eFeature))
    		return getTarget();
    	return eDynamicGet(eFeature);
    }

    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType){
    	throw new UnsupportedOperationException("This method has been deactivated since it is not always safe to use.");
    }
    
    @Override
    public void eInverseAdd(Object otherEnd, EStructuralFeature feature) {
	    if(feature == null)
	    	return;
	    	
    	eDynamicInverseAdd(otherEnd, feature);
	    	}
    	
    @Override
	    	public void eInverseRemove(Object otherEnd, EStructuralFeature feature) {
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
