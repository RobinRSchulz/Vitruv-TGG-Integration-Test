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

public class JavaTypeReferenceToUmlReturnParameterImpl extends SmartObject implements Java2Uml.JavaTypeReferenceToUmlReturnParameter {

    protected org.emftext.language.java.types.TypeReference source = null;
    protected org.eclipse.uml2.uml.Parameter target = null;
	
	protected JavaTypeReferenceToUmlReturnParameterImpl() {
		super(Java2UmlPackage.Literals.JAVA_TYPE_REFERENCE_TO_UML_RETURN_PARAMETER);
	}
	
    
    @Override
    public org.emftext.language.java.types.TypeReference getSource() {
    	return this.source;
    }
    
    @Override
    public void setSource(org.emftext.language.java.types.TypeReference value) {
    	
    	Object oldValue = this.source;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.source = value;
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Java2UmlPackage.Literals.JAVA_TYPE_REFERENCE_TO_UML_RETURN_PARAMETER__SOURCE, oldValue, value, -1));
    	        	
    	        	if(Java2UmlPackage.Literals.JAVA_TYPE_REFERENCE_TO_UML_RETURN_PARAMETER__SOURCE.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Java2UmlPackage.Literals.JAVA_TYPE_REFERENCE_TO_UML_RETURN_PARAMETER__SOURCE.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Java2UmlPackage.Literals.JAVA_TYPE_REFERENCE_TO_UML_RETURN_PARAMETER__SOURCE.getEOpposite());
    	        		}
    	        	}
    }
    
    
    @Override
    public org.eclipse.uml2.uml.Parameter getTarget() {
    	return this.target;
    }
    
    @Override
    public void setTarget(org.eclipse.uml2.uml.Parameter value) {
    	
    	Object oldValue = this.target;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.target = value;
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Java2UmlPackage.Literals.JAVA_TYPE_REFERENCE_TO_UML_RETURN_PARAMETER__TARGET, oldValue, value, -1));
    	        	
    	        	if(Java2UmlPackage.Literals.JAVA_TYPE_REFERENCE_TO_UML_RETURN_PARAMETER__TARGET.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Java2UmlPackage.Literals.JAVA_TYPE_REFERENCE_TO_UML_RETURN_PARAMETER__TARGET.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Java2UmlPackage.Literals.JAVA_TYPE_REFERENCE_TO_UML_RETURN_PARAMETER__TARGET.getEOpposite());
    	        		}
    	        	}
    }
    

    @Override
    public void eSet(EStructuralFeature eFeature, Object newValue){
    	if (Java2UmlPackage.Literals.JAVA_TYPE_REFERENCE_TO_UML_RETURN_PARAMETER__SOURCE.equals(eFeature)) {
    		setSource((org.emftext.language.java.types.TypeReference) newValue); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.JAVA_TYPE_REFERENCE_TO_UML_RETURN_PARAMETER__TARGET.equals(eFeature)) {
    		setTarget((org.eclipse.uml2.uml.Parameter) newValue); 
    		return;
    	}
    	eDynamicSet(eFeature, newValue);
    }
    
    @Override
    public void eUnset(EStructuralFeature eFeature){
    	if (Java2UmlPackage.Literals.JAVA_TYPE_REFERENCE_TO_UML_RETURN_PARAMETER__SOURCE.equals(eFeature)) {
    		setSource((org.emftext.language.java.types.TypeReference)null); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.JAVA_TYPE_REFERENCE_TO_UML_RETURN_PARAMETER__TARGET.equals(eFeature)) {
    		setTarget((org.eclipse.uml2.uml.Parameter)null); 
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
    	if (Java2UmlPackage.Literals.JAVA_TYPE_REFERENCE_TO_UML_RETURN_PARAMETER__SOURCE.equals(eFeature))
    		return getSource();
    	if (Java2UmlPackage.Literals.JAVA_TYPE_REFERENCE_TO_UML_RETURN_PARAMETER__TARGET.equals(eFeature))
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
