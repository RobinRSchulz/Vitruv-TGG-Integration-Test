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

public class RootJavaPackageToUmlPackage__MarkerImpl extends SmartObject implements Java2Uml.RootJavaPackageToUmlPackage__Marker {

    protected runtime.Protocol protocol = null;
    protected org.emftext.language.java.containers.Package CREATE__SRC__javaPackage = null;
    protected org.eclipse.uml2.uml.Package CREATE__TRG__umlPackage = null;
    protected Java2Uml.JavaPackageToUmlPackage CREATE__CORR__javaPackageToUmlPackage = null;
	
	protected RootJavaPackageToUmlPackage__MarkerImpl() {
		super(Java2UmlPackage.Literals.ROOT_JAVA_PACKAGE_TO_UML_PACKAGE___MARKER);
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
    public org.emftext.language.java.containers.Package getCREATE__SRC__javaPackage() {
    	return this.CREATE__SRC__javaPackage;
    }
    
    @Override
    public void setCREATE__SRC__javaPackage(org.emftext.language.java.containers.Package value) {
    	
    	Object oldValue = this.CREATE__SRC__javaPackage;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CREATE__SRC__javaPackage = value;
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Java2UmlPackage.Literals.ROOT_JAVA_PACKAGE_TO_UML_PACKAGE___MARKER__CREAT_E__SR_C__JAVA_PACKAGE, oldValue, value, -1));
    	        	
    	        	if(Java2UmlPackage.Literals.ROOT_JAVA_PACKAGE_TO_UML_PACKAGE___MARKER__CREAT_E__SR_C__JAVA_PACKAGE.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Java2UmlPackage.Literals.ROOT_JAVA_PACKAGE_TO_UML_PACKAGE___MARKER__CREAT_E__SR_C__JAVA_PACKAGE.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Java2UmlPackage.Literals.ROOT_JAVA_PACKAGE_TO_UML_PACKAGE___MARKER__CREAT_E__SR_C__JAVA_PACKAGE.getEOpposite());
    	        		}
    	        	}
    }
    
    
    @Override
    public org.eclipse.uml2.uml.Package getCREATE__TRG__umlPackage() {
    	return this.CREATE__TRG__umlPackage;
    }
    
    @Override
    public void setCREATE__TRG__umlPackage(org.eclipse.uml2.uml.Package value) {
    	
    	Object oldValue = this.CREATE__TRG__umlPackage;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CREATE__TRG__umlPackage = value;
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Java2UmlPackage.Literals.ROOT_JAVA_PACKAGE_TO_UML_PACKAGE___MARKER__CREAT_E__TR_G__UML_PACKAGE, oldValue, value, -1));
    	        	
    	        	if(Java2UmlPackage.Literals.ROOT_JAVA_PACKAGE_TO_UML_PACKAGE___MARKER__CREAT_E__TR_G__UML_PACKAGE.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Java2UmlPackage.Literals.ROOT_JAVA_PACKAGE_TO_UML_PACKAGE___MARKER__CREAT_E__TR_G__UML_PACKAGE.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Java2UmlPackage.Literals.ROOT_JAVA_PACKAGE_TO_UML_PACKAGE___MARKER__CREAT_E__TR_G__UML_PACKAGE.getEOpposite());
    	        		}
    	        	}
    }
    
    
    @Override
    public Java2Uml.JavaPackageToUmlPackage getCREATE__CORR__javaPackageToUmlPackage() {
    	return this.CREATE__CORR__javaPackageToUmlPackage;
    }
    
    @Override
    public void setCREATE__CORR__javaPackageToUmlPackage(Java2Uml.JavaPackageToUmlPackage value) {
    	
    	Object oldValue = this.CREATE__CORR__javaPackageToUmlPackage;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CREATE__CORR__javaPackageToUmlPackage = value;
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Java2UmlPackage.Literals.ROOT_JAVA_PACKAGE_TO_UML_PACKAGE___MARKER__CREAT_E__COR_R__JAVA_PACKAGE_TO_UML_PACKAGE, oldValue, value, -1));
    	        	
    	        	if(Java2UmlPackage.Literals.ROOT_JAVA_PACKAGE_TO_UML_PACKAGE___MARKER__CREAT_E__COR_R__JAVA_PACKAGE_TO_UML_PACKAGE.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Java2UmlPackage.Literals.ROOT_JAVA_PACKAGE_TO_UML_PACKAGE___MARKER__CREAT_E__COR_R__JAVA_PACKAGE_TO_UML_PACKAGE.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Java2UmlPackage.Literals.ROOT_JAVA_PACKAGE_TO_UML_PACKAGE___MARKER__CREAT_E__COR_R__JAVA_PACKAGE_TO_UML_PACKAGE.getEOpposite());
    	        		}
    	        	}
    }
    

    @Override
    public void eSet(EStructuralFeature eFeature, Object newValue){
    	if (RuntimePackage.Literals.TGG_RULE_APPLICATION__PROTOCOL.equals(eFeature)) {
    		setProtocol((runtime.Protocol) newValue); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.ROOT_JAVA_PACKAGE_TO_UML_PACKAGE___MARKER__CREAT_E__SR_C__JAVA_PACKAGE.equals(eFeature)) {
    		setCREATE__SRC__javaPackage((org.emftext.language.java.containers.Package) newValue); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.ROOT_JAVA_PACKAGE_TO_UML_PACKAGE___MARKER__CREAT_E__TR_G__UML_PACKAGE.equals(eFeature)) {
    		setCREATE__TRG__umlPackage((org.eclipse.uml2.uml.Package) newValue); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.ROOT_JAVA_PACKAGE_TO_UML_PACKAGE___MARKER__CREAT_E__COR_R__JAVA_PACKAGE_TO_UML_PACKAGE.equals(eFeature)) {
    		setCREATE__CORR__javaPackageToUmlPackage((Java2Uml.JavaPackageToUmlPackage) newValue); 
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
    	if (Java2UmlPackage.Literals.ROOT_JAVA_PACKAGE_TO_UML_PACKAGE___MARKER__CREAT_E__SR_C__JAVA_PACKAGE.equals(eFeature)) {
    		setCREATE__SRC__javaPackage((org.emftext.language.java.containers.Package)null); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.ROOT_JAVA_PACKAGE_TO_UML_PACKAGE___MARKER__CREAT_E__TR_G__UML_PACKAGE.equals(eFeature)) {
    		setCREATE__TRG__umlPackage((org.eclipse.uml2.uml.Package)null); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.ROOT_JAVA_PACKAGE_TO_UML_PACKAGE___MARKER__CREAT_E__COR_R__JAVA_PACKAGE_TO_UML_PACKAGE.equals(eFeature)) {
    		setCREATE__CORR__javaPackageToUmlPackage((Java2Uml.JavaPackageToUmlPackage)null); 
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
    	if (Java2UmlPackage.Literals.ROOT_JAVA_PACKAGE_TO_UML_PACKAGE___MARKER__CREAT_E__SR_C__JAVA_PACKAGE.equals(eFeature))
    		return getCREATE__SRC__javaPackage();
    	if (Java2UmlPackage.Literals.ROOT_JAVA_PACKAGE_TO_UML_PACKAGE___MARKER__CREAT_E__TR_G__UML_PACKAGE.equals(eFeature))
    		return getCREATE__TRG__umlPackage();
    	if (Java2UmlPackage.Literals.ROOT_JAVA_PACKAGE_TO_UML_PACKAGE___MARKER__CREAT_E__COR_R__JAVA_PACKAGE_TO_UML_PACKAGE.equals(eFeature))
    		return getCREATE__CORR__javaPackageToUmlPackage();
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
