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

public class LinkToEntity__MarkerImpl extends SmartObject implements Something2Else.LinkToEntity__Marker {

    protected runtime.Protocol protocol = null;
    protected tools.vitruv.methodologisttemplate.model.model.Link CREATE__SRC__link = null;
    protected tools.vitruv.methodologisttemplate.model.model.Protocol CONTEXT__SRC__protocol = null;
    protected tools.vitruv.methodologisttemplate.model.model2.Entity CREATE__TRG__entity = null;
    protected Something2Else.LinkToEntity CREATE__CORR__ltoe = null;
	
	protected LinkToEntity__MarkerImpl() {
		super(Something2ElsePackage.Literals.LINK_TO_ENTITY___MARKER);
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
    public tools.vitruv.methodologisttemplate.model.model.Link getCREATE__SRC__link() {
    	return this.CREATE__SRC__link;
    }
    
    @Override
    public void setCREATE__SRC__link(tools.vitruv.methodologisttemplate.model.model.Link value) {
    	
    	Object oldValue = this.CREATE__SRC__link;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CREATE__SRC__link = value;
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Something2ElsePackage.Literals.LINK_TO_ENTITY___MARKER__CREAT_E__SR_C__LINK, oldValue, value, -1));
    	        	
    	        	if(Something2ElsePackage.Literals.LINK_TO_ENTITY___MARKER__CREAT_E__SR_C__LINK.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Something2ElsePackage.Literals.LINK_TO_ENTITY___MARKER__CREAT_E__SR_C__LINK.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Something2ElsePackage.Literals.LINK_TO_ENTITY___MARKER__CREAT_E__SR_C__LINK.getEOpposite());
    	        		}
    	        	}
    }
    
    
    @Override
    public tools.vitruv.methodologisttemplate.model.model.Protocol getCONTEXT__SRC__protocol() {
    	return this.CONTEXT__SRC__protocol;
    }
    
    @Override
    public void setCONTEXT__SRC__protocol(tools.vitruv.methodologisttemplate.model.model.Protocol value) {
    	
    	Object oldValue = this.CONTEXT__SRC__protocol;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CONTEXT__SRC__protocol = value;
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Something2ElsePackage.Literals.LINK_TO_ENTITY___MARKER__CONTEX_T__SR_C__PROTOCOL, oldValue, value, -1));
    	        	
    	        	if(Something2ElsePackage.Literals.LINK_TO_ENTITY___MARKER__CONTEX_T__SR_C__PROTOCOL.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Something2ElsePackage.Literals.LINK_TO_ENTITY___MARKER__CONTEX_T__SR_C__PROTOCOL.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Something2ElsePackage.Literals.LINK_TO_ENTITY___MARKER__CONTEX_T__SR_C__PROTOCOL.getEOpposite());
    	        		}
    	        	}
    }
    
    
    @Override
    public tools.vitruv.methodologisttemplate.model.model2.Entity getCREATE__TRG__entity() {
    	return this.CREATE__TRG__entity;
    }
    
    @Override
    public void setCREATE__TRG__entity(tools.vitruv.methodologisttemplate.model.model2.Entity value) {
    	
    	Object oldValue = this.CREATE__TRG__entity;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CREATE__TRG__entity = value;
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Something2ElsePackage.Literals.LINK_TO_ENTITY___MARKER__CREAT_E__TR_G__ENTITY, oldValue, value, -1));
    	        	
    	        	if(Something2ElsePackage.Literals.LINK_TO_ENTITY___MARKER__CREAT_E__TR_G__ENTITY.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Something2ElsePackage.Literals.LINK_TO_ENTITY___MARKER__CREAT_E__TR_G__ENTITY.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Something2ElsePackage.Literals.LINK_TO_ENTITY___MARKER__CREAT_E__TR_G__ENTITY.getEOpposite());
    	        		}
    	        	}
    }
    
    
    @Override
    public Something2Else.LinkToEntity getCREATE__CORR__ltoe() {
    	return this.CREATE__CORR__ltoe;
    }
    
    @Override
    public void setCREATE__CORR__ltoe(Something2Else.LinkToEntity value) {
    	
    	Object oldValue = this.CREATE__CORR__ltoe;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CREATE__CORR__ltoe = value;
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Something2ElsePackage.Literals.LINK_TO_ENTITY___MARKER__CREAT_E__COR_R__LTOE, oldValue, value, -1));
    	        	
    	        	if(Something2ElsePackage.Literals.LINK_TO_ENTITY___MARKER__CREAT_E__COR_R__LTOE.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Something2ElsePackage.Literals.LINK_TO_ENTITY___MARKER__CREAT_E__COR_R__LTOE.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Something2ElsePackage.Literals.LINK_TO_ENTITY___MARKER__CREAT_E__COR_R__LTOE.getEOpposite());
    	        		}
    	        	}
    }
    

    @Override
    public void eSet(EStructuralFeature eFeature, Object newValue){
    	if (RuntimePackage.Literals.TGG_RULE_APPLICATION__PROTOCOL.equals(eFeature)) {
    		setProtocol((runtime.Protocol) newValue); 
    		return;
    	}
    	if (Something2ElsePackage.Literals.LINK_TO_ENTITY___MARKER__CREAT_E__SR_C__LINK.equals(eFeature)) {
    		setCREATE__SRC__link((tools.vitruv.methodologisttemplate.model.model.Link) newValue); 
    		return;
    	}
    	if (Something2ElsePackage.Literals.LINK_TO_ENTITY___MARKER__CONTEX_T__SR_C__PROTOCOL.equals(eFeature)) {
    		setCONTEXT__SRC__protocol((tools.vitruv.methodologisttemplate.model.model.Protocol) newValue); 
    		return;
    	}
    	if (Something2ElsePackage.Literals.LINK_TO_ENTITY___MARKER__CREAT_E__TR_G__ENTITY.equals(eFeature)) {
    		setCREATE__TRG__entity((tools.vitruv.methodologisttemplate.model.model2.Entity) newValue); 
    		return;
    	}
    	if (Something2ElsePackage.Literals.LINK_TO_ENTITY___MARKER__CREAT_E__COR_R__LTOE.equals(eFeature)) {
    		setCREATE__CORR__ltoe((Something2Else.LinkToEntity) newValue); 
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
    	if (Something2ElsePackage.Literals.LINK_TO_ENTITY___MARKER__CREAT_E__SR_C__LINK.equals(eFeature)) {
    		setCREATE__SRC__link((tools.vitruv.methodologisttemplate.model.model.Link)null); 
    		return;
    	}
    	if (Something2ElsePackage.Literals.LINK_TO_ENTITY___MARKER__CONTEX_T__SR_C__PROTOCOL.equals(eFeature)) {
    		setCONTEXT__SRC__protocol((tools.vitruv.methodologisttemplate.model.model.Protocol)null); 
    		return;
    	}
    	if (Something2ElsePackage.Literals.LINK_TO_ENTITY___MARKER__CREAT_E__TR_G__ENTITY.equals(eFeature)) {
    		setCREATE__TRG__entity((tools.vitruv.methodologisttemplate.model.model2.Entity)null); 
    		return;
    	}
    	if (Something2ElsePackage.Literals.LINK_TO_ENTITY___MARKER__CREAT_E__COR_R__LTOE.equals(eFeature)) {
    		setCREATE__CORR__ltoe((Something2Else.LinkToEntity)null); 
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
    	if (Something2ElsePackage.Literals.LINK_TO_ENTITY___MARKER__CREAT_E__SR_C__LINK.equals(eFeature))
    		return getCREATE__SRC__link();
    	if (Something2ElsePackage.Literals.LINK_TO_ENTITY___MARKER__CONTEX_T__SR_C__PROTOCOL.equals(eFeature))
    		return getCONTEXT__SRC__protocol();
    	if (Something2ElsePackage.Literals.LINK_TO_ENTITY___MARKER__CREAT_E__TR_G__ENTITY.equals(eFeature))
    		return getCREATE__TRG__entity();
    	if (Something2ElsePackage.Literals.LINK_TO_ENTITY___MARKER__CREAT_E__COR_R__LTOE.equals(eFeature))
    		return getCREATE__CORR__ltoe();
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
