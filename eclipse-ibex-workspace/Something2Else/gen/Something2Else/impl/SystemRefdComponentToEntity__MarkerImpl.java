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

public class SystemRefdComponentToEntity__MarkerImpl extends SmartObject implements Something2Else.SystemRefdComponentToEntity__Marker {

    protected runtime.Protocol protocol = null;
    protected tools.vitruv.methodologisttemplate.model.model.Component CREATE__SRC__comp = null;
    protected tools.vitruv.methodologisttemplate.model.model.System CONTEXT__SRC__system = null;
    protected tools.vitruv.methodologisttemplate.model.model2.Entity CREATE__TRG__entity = null;
    protected tools.vitruv.methodologisttemplate.model.model2.Root CONTEXT__TRG__root = null;
    protected Something2Else.ComponentToEntity CREATE__CORR__ctoe = null;
    protected Something2Else.SystemToRoot CONTEXT__CORR__stor = null;
	
	protected SystemRefdComponentToEntity__MarkerImpl() {
		super(Something2ElsePackage.Literals.SYSTEM_REFD_COMPONENT_TO_ENTITY___MARKER);
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
    public tools.vitruv.methodologisttemplate.model.model.Component getCREATE__SRC__comp() {
    	return this.CREATE__SRC__comp;
    }
    
    @Override
    public void setCREATE__SRC__comp(tools.vitruv.methodologisttemplate.model.model.Component value) {
    	
    	Object oldValue = this.CREATE__SRC__comp;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CREATE__SRC__comp = value;
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Something2ElsePackage.Literals.SYSTEM_REFD_COMPONENT_TO_ENTITY___MARKER__CREAT_E__SR_C__COMP, oldValue, value, -1));
    	        	
    	        	if(Something2ElsePackage.Literals.SYSTEM_REFD_COMPONENT_TO_ENTITY___MARKER__CREAT_E__SR_C__COMP.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Something2ElsePackage.Literals.SYSTEM_REFD_COMPONENT_TO_ENTITY___MARKER__CREAT_E__SR_C__COMP.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Something2ElsePackage.Literals.SYSTEM_REFD_COMPONENT_TO_ENTITY___MARKER__CREAT_E__SR_C__COMP.getEOpposite());
    	        		}
    	        	}
    }
    
    
    @Override
    public tools.vitruv.methodologisttemplate.model.model.System getCONTEXT__SRC__system() {
    	return this.CONTEXT__SRC__system;
    }
    
    @Override
    public void setCONTEXT__SRC__system(tools.vitruv.methodologisttemplate.model.model.System value) {
    	
    	Object oldValue = this.CONTEXT__SRC__system;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CONTEXT__SRC__system = value;
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Something2ElsePackage.Literals.SYSTEM_REFD_COMPONENT_TO_ENTITY___MARKER__CONTEX_T__SR_C__SYSTEM, oldValue, value, -1));
    	        	
    	        	if(Something2ElsePackage.Literals.SYSTEM_REFD_COMPONENT_TO_ENTITY___MARKER__CONTEX_T__SR_C__SYSTEM.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Something2ElsePackage.Literals.SYSTEM_REFD_COMPONENT_TO_ENTITY___MARKER__CONTEX_T__SR_C__SYSTEM.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Something2ElsePackage.Literals.SYSTEM_REFD_COMPONENT_TO_ENTITY___MARKER__CONTEX_T__SR_C__SYSTEM.getEOpposite());
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
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Something2ElsePackage.Literals.SYSTEM_REFD_COMPONENT_TO_ENTITY___MARKER__CREAT_E__TR_G__ENTITY, oldValue, value, -1));
    	        	
    	        	if(Something2ElsePackage.Literals.SYSTEM_REFD_COMPONENT_TO_ENTITY___MARKER__CREAT_E__TR_G__ENTITY.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Something2ElsePackage.Literals.SYSTEM_REFD_COMPONENT_TO_ENTITY___MARKER__CREAT_E__TR_G__ENTITY.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Something2ElsePackage.Literals.SYSTEM_REFD_COMPONENT_TO_ENTITY___MARKER__CREAT_E__TR_G__ENTITY.getEOpposite());
    	        		}
    	        	}
    }
    
    
    @Override
    public tools.vitruv.methodologisttemplate.model.model2.Root getCONTEXT__TRG__root() {
    	return this.CONTEXT__TRG__root;
    }
    
    @Override
    public void setCONTEXT__TRG__root(tools.vitruv.methodologisttemplate.model.model2.Root value) {
    	
    	Object oldValue = this.CONTEXT__TRG__root;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CONTEXT__TRG__root = value;
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Something2ElsePackage.Literals.SYSTEM_REFD_COMPONENT_TO_ENTITY___MARKER__CONTEX_T__TR_G__ROOT, oldValue, value, -1));
    	        	
    	        	if(Something2ElsePackage.Literals.SYSTEM_REFD_COMPONENT_TO_ENTITY___MARKER__CONTEX_T__TR_G__ROOT.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Something2ElsePackage.Literals.SYSTEM_REFD_COMPONENT_TO_ENTITY___MARKER__CONTEX_T__TR_G__ROOT.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Something2ElsePackage.Literals.SYSTEM_REFD_COMPONENT_TO_ENTITY___MARKER__CONTEX_T__TR_G__ROOT.getEOpposite());
    	        		}
    	        	}
    }
    
    
    @Override
    public Something2Else.ComponentToEntity getCREATE__CORR__ctoe() {
    	return this.CREATE__CORR__ctoe;
    }
    
    @Override
    public void setCREATE__CORR__ctoe(Something2Else.ComponentToEntity value) {
    	
    	Object oldValue = this.CREATE__CORR__ctoe;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CREATE__CORR__ctoe = value;
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Something2ElsePackage.Literals.SYSTEM_REFD_COMPONENT_TO_ENTITY___MARKER__CREAT_E__COR_R__CTOE, oldValue, value, -1));
    	        	
    	        	if(Something2ElsePackage.Literals.SYSTEM_REFD_COMPONENT_TO_ENTITY___MARKER__CREAT_E__COR_R__CTOE.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Something2ElsePackage.Literals.SYSTEM_REFD_COMPONENT_TO_ENTITY___MARKER__CREAT_E__COR_R__CTOE.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Something2ElsePackage.Literals.SYSTEM_REFD_COMPONENT_TO_ENTITY___MARKER__CREAT_E__COR_R__CTOE.getEOpposite());
    	        		}
    	        	}
    }
    
    
    @Override
    public Something2Else.SystemToRoot getCONTEXT__CORR__stor() {
    	return this.CONTEXT__CORR__stor;
    }
    
    @Override
    public void setCONTEXT__CORR__stor(Something2Else.SystemToRoot value) {
    	
    	Object oldValue = this.CONTEXT__CORR__stor;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CONTEXT__CORR__stor = value;
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Something2ElsePackage.Literals.SYSTEM_REFD_COMPONENT_TO_ENTITY___MARKER__CONTEX_T__COR_R__STOR, oldValue, value, -1));
    	        	
    	        	if(Something2ElsePackage.Literals.SYSTEM_REFD_COMPONENT_TO_ENTITY___MARKER__CONTEX_T__COR_R__STOR.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Something2ElsePackage.Literals.SYSTEM_REFD_COMPONENT_TO_ENTITY___MARKER__CONTEX_T__COR_R__STOR.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Something2ElsePackage.Literals.SYSTEM_REFD_COMPONENT_TO_ENTITY___MARKER__CONTEX_T__COR_R__STOR.getEOpposite());
    	        		}
    	        	}
    }
    

    @Override
    public void eSet(EStructuralFeature eFeature, Object newValue){
    	if (RuntimePackage.Literals.TGG_RULE_APPLICATION__PROTOCOL.equals(eFeature)) {
    		setProtocol((runtime.Protocol) newValue); 
    		return;
    	}
    	if (Something2ElsePackage.Literals.SYSTEM_REFD_COMPONENT_TO_ENTITY___MARKER__CREAT_E__SR_C__COMP.equals(eFeature)) {
    		setCREATE__SRC__comp((tools.vitruv.methodologisttemplate.model.model.Component) newValue); 
    		return;
    	}
    	if (Something2ElsePackage.Literals.SYSTEM_REFD_COMPONENT_TO_ENTITY___MARKER__CONTEX_T__SR_C__SYSTEM.equals(eFeature)) {
    		setCONTEXT__SRC__system((tools.vitruv.methodologisttemplate.model.model.System) newValue); 
    		return;
    	}
    	if (Something2ElsePackage.Literals.SYSTEM_REFD_COMPONENT_TO_ENTITY___MARKER__CREAT_E__TR_G__ENTITY.equals(eFeature)) {
    		setCREATE__TRG__entity((tools.vitruv.methodologisttemplate.model.model2.Entity) newValue); 
    		return;
    	}
    	if (Something2ElsePackage.Literals.SYSTEM_REFD_COMPONENT_TO_ENTITY___MARKER__CONTEX_T__TR_G__ROOT.equals(eFeature)) {
    		setCONTEXT__TRG__root((tools.vitruv.methodologisttemplate.model.model2.Root) newValue); 
    		return;
    	}
    	if (Something2ElsePackage.Literals.SYSTEM_REFD_COMPONENT_TO_ENTITY___MARKER__CREAT_E__COR_R__CTOE.equals(eFeature)) {
    		setCREATE__CORR__ctoe((Something2Else.ComponentToEntity) newValue); 
    		return;
    	}
    	if (Something2ElsePackage.Literals.SYSTEM_REFD_COMPONENT_TO_ENTITY___MARKER__CONTEX_T__COR_R__STOR.equals(eFeature)) {
    		setCONTEXT__CORR__stor((Something2Else.SystemToRoot) newValue); 
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
    	if (Something2ElsePackage.Literals.SYSTEM_REFD_COMPONENT_TO_ENTITY___MARKER__CREAT_E__SR_C__COMP.equals(eFeature)) {
    		setCREATE__SRC__comp((tools.vitruv.methodologisttemplate.model.model.Component)null); 
    		return;
    	}
    	if (Something2ElsePackage.Literals.SYSTEM_REFD_COMPONENT_TO_ENTITY___MARKER__CONTEX_T__SR_C__SYSTEM.equals(eFeature)) {
    		setCONTEXT__SRC__system((tools.vitruv.methodologisttemplate.model.model.System)null); 
    		return;
    	}
    	if (Something2ElsePackage.Literals.SYSTEM_REFD_COMPONENT_TO_ENTITY___MARKER__CREAT_E__TR_G__ENTITY.equals(eFeature)) {
    		setCREATE__TRG__entity((tools.vitruv.methodologisttemplate.model.model2.Entity)null); 
    		return;
    	}
    	if (Something2ElsePackage.Literals.SYSTEM_REFD_COMPONENT_TO_ENTITY___MARKER__CONTEX_T__TR_G__ROOT.equals(eFeature)) {
    		setCONTEXT__TRG__root((tools.vitruv.methodologisttemplate.model.model2.Root)null); 
    		return;
    	}
    	if (Something2ElsePackage.Literals.SYSTEM_REFD_COMPONENT_TO_ENTITY___MARKER__CREAT_E__COR_R__CTOE.equals(eFeature)) {
    		setCREATE__CORR__ctoe((Something2Else.ComponentToEntity)null); 
    		return;
    	}
    	if (Something2ElsePackage.Literals.SYSTEM_REFD_COMPONENT_TO_ENTITY___MARKER__CONTEX_T__COR_R__STOR.equals(eFeature)) {
    		setCONTEXT__CORR__stor((Something2Else.SystemToRoot)null); 
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
    	if (Something2ElsePackage.Literals.SYSTEM_REFD_COMPONENT_TO_ENTITY___MARKER__CREAT_E__SR_C__COMP.equals(eFeature))
    		return getCREATE__SRC__comp();
    	if (Something2ElsePackage.Literals.SYSTEM_REFD_COMPONENT_TO_ENTITY___MARKER__CONTEX_T__SR_C__SYSTEM.equals(eFeature))
    		return getCONTEXT__SRC__system();
    	if (Something2ElsePackage.Literals.SYSTEM_REFD_COMPONENT_TO_ENTITY___MARKER__CREAT_E__TR_G__ENTITY.equals(eFeature))
    		return getCREATE__TRG__entity();
    	if (Something2ElsePackage.Literals.SYSTEM_REFD_COMPONENT_TO_ENTITY___MARKER__CONTEX_T__TR_G__ROOT.equals(eFeature))
    		return getCONTEXT__TRG__root();
    	if (Something2ElsePackage.Literals.SYSTEM_REFD_COMPONENT_TO_ENTITY___MARKER__CREAT_E__COR_R__CTOE.equals(eFeature))
    		return getCREATE__CORR__ctoe();
    	if (Something2ElsePackage.Literals.SYSTEM_REFD_COMPONENT_TO_ENTITY___MARKER__CONTEX_T__COR_R__STOR.equals(eFeature))
    		return getCONTEXT__CORR__stor();
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
