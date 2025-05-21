package Something2Else.impl;

import Something2Else.Something2ElsePackage;
import runtime.RuntimePackage;
import Something2Else.Something2ElsePackage;

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

public class ProtocolToEntityImpl extends SmartObject implements Something2Else.ProtocolToEntity {

    protected tools.vitruv.methodologisttemplate.model.model.Protocol source = null;
    protected tools.vitruv.methodologisttemplate.model.model2.Entity target = null;
	
	protected ProtocolToEntityImpl() {
		super(Something2ElsePackage.Literals.PROTOCOL_TO_ENTITY);
	}
	
    
    @Override
    public tools.vitruv.methodologisttemplate.model.model.Protocol getSource() {
    	return this.source;
    }
    
    @Override
    public void setSource(tools.vitruv.methodologisttemplate.model.model.Protocol value) {
    	
    	Object oldValue = this.source;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.source = value;
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Something2ElsePackage.Literals.PROTOCOL_TO_ENTITY__SOURCE, oldValue, value, -1));
    	        	
    	        	if(Something2ElsePackage.Literals.PROTOCOL_TO_ENTITY__SOURCE.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Something2ElsePackage.Literals.PROTOCOL_TO_ENTITY__SOURCE.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Something2ElsePackage.Literals.PROTOCOL_TO_ENTITY__SOURCE.getEOpposite());
    	        		}
    	        	}
    }
    
    
    @Override
    public tools.vitruv.methodologisttemplate.model.model2.Entity getTarget() {
    	return this.target;
    }
    
    @Override
    public void setTarget(tools.vitruv.methodologisttemplate.model.model2.Entity value) {
    	
    	Object oldValue = this.target;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.target = value;
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Something2ElsePackage.Literals.PROTOCOL_TO_ENTITY__TARGET, oldValue, value, -1));
    	        	
    	        	if(Something2ElsePackage.Literals.PROTOCOL_TO_ENTITY__TARGET.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Something2ElsePackage.Literals.PROTOCOL_TO_ENTITY__TARGET.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Something2ElsePackage.Literals.PROTOCOL_TO_ENTITY__TARGET.getEOpposite());
    	        		}
    	        	}
    }
    

    @Override
    public void eSet(EStructuralFeature eFeature, Object newValue){
    	if (Something2ElsePackage.Literals.PROTOCOL_TO_ENTITY__SOURCE.equals(eFeature)) {
    		setSource((tools.vitruv.methodologisttemplate.model.model.Protocol) newValue); 
    		return;
    	}
    	if (Something2ElsePackage.Literals.PROTOCOL_TO_ENTITY__TARGET.equals(eFeature)) {
    		setTarget((tools.vitruv.methodologisttemplate.model.model2.Entity) newValue); 
    		return;
    	}
    	eDynamicSet(eFeature, newValue);
    }
    
    @Override
    public void eUnset(EStructuralFeature eFeature){
    	if (Something2ElsePackage.Literals.PROTOCOL_TO_ENTITY__SOURCE.equals(eFeature)) {
    		setSource((tools.vitruv.methodologisttemplate.model.model.Protocol)null); 
    		return;
    	}
    	if (Something2ElsePackage.Literals.PROTOCOL_TO_ENTITY__TARGET.equals(eFeature)) {
    		setTarget((tools.vitruv.methodologisttemplate.model.model2.Entity)null); 
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
    	if (Something2ElsePackage.Literals.PROTOCOL_TO_ENTITY__SOURCE.equals(eFeature))
    		return getSource();
    	if (Something2ElsePackage.Literals.PROTOCOL_TO_ENTITY__TARGET.equals(eFeature))
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
