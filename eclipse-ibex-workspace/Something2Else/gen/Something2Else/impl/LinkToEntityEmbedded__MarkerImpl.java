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

public class LinkToEntityEmbedded__MarkerImpl extends SmartObject implements Something2Else.LinkToEntityEmbedded__Marker {

    protected runtime.Protocol protocol = null;
    protected tools.vitruv.methodologisttemplate.model.model.Component CONTEXT__SRC__component = null;
    protected tools.vitruv.methodologisttemplate.model.model.Link CREATE__SRC__link = null;
    protected tools.vitruv.methodologisttemplate.model.model.Protocol CONTEXT__SRC__protocol = null;
    protected tools.vitruv.methodologisttemplate.model.model.System CONTEXT__SRC__system = null;
    protected tools.vitruv.methodologisttemplate.model.model2.Entity CONTEXT__TRG__compEntity = null;
    protected tools.vitruv.methodologisttemplate.model.model2.Entity CREATE__TRG__linkEntity = null;
    protected tools.vitruv.methodologisttemplate.model.model2.Entity CONTEXT__TRG__protEntity = null;
    protected tools.vitruv.methodologisttemplate.model.model2.Root CONTEXT__TRG__root = null;
    protected Something2Else.ComponentToEntity CONTEXT__CORR__ctoe = null;
    protected Something2Else.LinkToEntity CREATE__CORR__ltoe = null;
    protected Something2Else.ProtocolToEntity CONTEXT__CORR__ptoe = null;
    protected Something2Else.SystemToRoot CONTEXT__CORR__stor = null;
	
	protected LinkToEntityEmbedded__MarkerImpl() {
		super(Something2ElsePackage.Literals.LINK_TO_ENTITY_EMBEDDED___MARKER);
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
    public tools.vitruv.methodologisttemplate.model.model.Component getCONTEXT__SRC__component() {
    	return this.CONTEXT__SRC__component;
    }
    
    @Override
    public void setCONTEXT__SRC__component(tools.vitruv.methodologisttemplate.model.model.Component value) {
    	
    	Object oldValue = this.CONTEXT__SRC__component;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CONTEXT__SRC__component = value;
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Something2ElsePackage.Literals.LINK_TO_ENTITY_EMBEDDED___MARKER__CONTEX_T__SR_C__COMPONENT, oldValue, value, -1));
    	        	
    	        	if(Something2ElsePackage.Literals.LINK_TO_ENTITY_EMBEDDED___MARKER__CONTEX_T__SR_C__COMPONENT.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Something2ElsePackage.Literals.LINK_TO_ENTITY_EMBEDDED___MARKER__CONTEX_T__SR_C__COMPONENT.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Something2ElsePackage.Literals.LINK_TO_ENTITY_EMBEDDED___MARKER__CONTEX_T__SR_C__COMPONENT.getEOpposite());
    	        		}
    	        	}
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
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Something2ElsePackage.Literals.LINK_TO_ENTITY_EMBEDDED___MARKER__CREAT_E__SR_C__LINK, oldValue, value, -1));
    	        	
    	        	if(Something2ElsePackage.Literals.LINK_TO_ENTITY_EMBEDDED___MARKER__CREAT_E__SR_C__LINK.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Something2ElsePackage.Literals.LINK_TO_ENTITY_EMBEDDED___MARKER__CREAT_E__SR_C__LINK.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Something2ElsePackage.Literals.LINK_TO_ENTITY_EMBEDDED___MARKER__CREAT_E__SR_C__LINK.getEOpposite());
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
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Something2ElsePackage.Literals.LINK_TO_ENTITY_EMBEDDED___MARKER__CONTEX_T__SR_C__PROTOCOL, oldValue, value, -1));
    	        	
    	        	if(Something2ElsePackage.Literals.LINK_TO_ENTITY_EMBEDDED___MARKER__CONTEX_T__SR_C__PROTOCOL.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Something2ElsePackage.Literals.LINK_TO_ENTITY_EMBEDDED___MARKER__CONTEX_T__SR_C__PROTOCOL.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Something2ElsePackage.Literals.LINK_TO_ENTITY_EMBEDDED___MARKER__CONTEX_T__SR_C__PROTOCOL.getEOpposite());
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
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Something2ElsePackage.Literals.LINK_TO_ENTITY_EMBEDDED___MARKER__CONTEX_T__SR_C__SYSTEM, oldValue, value, -1));
    	        	
    	        	if(Something2ElsePackage.Literals.LINK_TO_ENTITY_EMBEDDED___MARKER__CONTEX_T__SR_C__SYSTEM.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Something2ElsePackage.Literals.LINK_TO_ENTITY_EMBEDDED___MARKER__CONTEX_T__SR_C__SYSTEM.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Something2ElsePackage.Literals.LINK_TO_ENTITY_EMBEDDED___MARKER__CONTEX_T__SR_C__SYSTEM.getEOpposite());
    	        		}
    	        	}
    }
    
    
    @Override
    public tools.vitruv.methodologisttemplate.model.model2.Entity getCONTEXT__TRG__compEntity() {
    	return this.CONTEXT__TRG__compEntity;
    }
    
    @Override
    public void setCONTEXT__TRG__compEntity(tools.vitruv.methodologisttemplate.model.model2.Entity value) {
    	
    	Object oldValue = this.CONTEXT__TRG__compEntity;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CONTEXT__TRG__compEntity = value;
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Something2ElsePackage.Literals.LINK_TO_ENTITY_EMBEDDED___MARKER__CONTEX_T__TR_G__COMP_ENTITY, oldValue, value, -1));
    	        	
    	        	if(Something2ElsePackage.Literals.LINK_TO_ENTITY_EMBEDDED___MARKER__CONTEX_T__TR_G__COMP_ENTITY.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Something2ElsePackage.Literals.LINK_TO_ENTITY_EMBEDDED___MARKER__CONTEX_T__TR_G__COMP_ENTITY.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Something2ElsePackage.Literals.LINK_TO_ENTITY_EMBEDDED___MARKER__CONTEX_T__TR_G__COMP_ENTITY.getEOpposite());
    	        		}
    	        	}
    }
    
    
    @Override
    public tools.vitruv.methodologisttemplate.model.model2.Entity getCREATE__TRG__linkEntity() {
    	return this.CREATE__TRG__linkEntity;
    }
    
    @Override
    public void setCREATE__TRG__linkEntity(tools.vitruv.methodologisttemplate.model.model2.Entity value) {
    	
    	Object oldValue = this.CREATE__TRG__linkEntity;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CREATE__TRG__linkEntity = value;
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Something2ElsePackage.Literals.LINK_TO_ENTITY_EMBEDDED___MARKER__CREAT_E__TR_G__LINK_ENTITY, oldValue, value, -1));
    	        	
    	        	if(Something2ElsePackage.Literals.LINK_TO_ENTITY_EMBEDDED___MARKER__CREAT_E__TR_G__LINK_ENTITY.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Something2ElsePackage.Literals.LINK_TO_ENTITY_EMBEDDED___MARKER__CREAT_E__TR_G__LINK_ENTITY.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Something2ElsePackage.Literals.LINK_TO_ENTITY_EMBEDDED___MARKER__CREAT_E__TR_G__LINK_ENTITY.getEOpposite());
    	        		}
    	        	}
    }
    
    
    @Override
    public tools.vitruv.methodologisttemplate.model.model2.Entity getCONTEXT__TRG__protEntity() {
    	return this.CONTEXT__TRG__protEntity;
    }
    
    @Override
    public void setCONTEXT__TRG__protEntity(tools.vitruv.methodologisttemplate.model.model2.Entity value) {
    	
    	Object oldValue = this.CONTEXT__TRG__protEntity;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CONTEXT__TRG__protEntity = value;
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Something2ElsePackage.Literals.LINK_TO_ENTITY_EMBEDDED___MARKER__CONTEX_T__TR_G__PROT_ENTITY, oldValue, value, -1));
    	        	
    	        	if(Something2ElsePackage.Literals.LINK_TO_ENTITY_EMBEDDED___MARKER__CONTEX_T__TR_G__PROT_ENTITY.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Something2ElsePackage.Literals.LINK_TO_ENTITY_EMBEDDED___MARKER__CONTEX_T__TR_G__PROT_ENTITY.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Something2ElsePackage.Literals.LINK_TO_ENTITY_EMBEDDED___MARKER__CONTEX_T__TR_G__PROT_ENTITY.getEOpposite());
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
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Something2ElsePackage.Literals.LINK_TO_ENTITY_EMBEDDED___MARKER__CONTEX_T__TR_G__ROOT, oldValue, value, -1));
    	        	
    	        	if(Something2ElsePackage.Literals.LINK_TO_ENTITY_EMBEDDED___MARKER__CONTEX_T__TR_G__ROOT.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Something2ElsePackage.Literals.LINK_TO_ENTITY_EMBEDDED___MARKER__CONTEX_T__TR_G__ROOT.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Something2ElsePackage.Literals.LINK_TO_ENTITY_EMBEDDED___MARKER__CONTEX_T__TR_G__ROOT.getEOpposite());
    	        		}
    	        	}
    }
    
    
    @Override
    public Something2Else.ComponentToEntity getCONTEXT__CORR__ctoe() {
    	return this.CONTEXT__CORR__ctoe;
    }
    
    @Override
    public void setCONTEXT__CORR__ctoe(Something2Else.ComponentToEntity value) {
    	
    	Object oldValue = this.CONTEXT__CORR__ctoe;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CONTEXT__CORR__ctoe = value;
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Something2ElsePackage.Literals.LINK_TO_ENTITY_EMBEDDED___MARKER__CONTEX_T__COR_R__CTOE, oldValue, value, -1));
    	        	
    	        	if(Something2ElsePackage.Literals.LINK_TO_ENTITY_EMBEDDED___MARKER__CONTEX_T__COR_R__CTOE.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Something2ElsePackage.Literals.LINK_TO_ENTITY_EMBEDDED___MARKER__CONTEX_T__COR_R__CTOE.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Something2ElsePackage.Literals.LINK_TO_ENTITY_EMBEDDED___MARKER__CONTEX_T__COR_R__CTOE.getEOpposite());
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
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Something2ElsePackage.Literals.LINK_TO_ENTITY_EMBEDDED___MARKER__CREAT_E__COR_R__LTOE, oldValue, value, -1));
    	        	
    	        	if(Something2ElsePackage.Literals.LINK_TO_ENTITY_EMBEDDED___MARKER__CREAT_E__COR_R__LTOE.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Something2ElsePackage.Literals.LINK_TO_ENTITY_EMBEDDED___MARKER__CREAT_E__COR_R__LTOE.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Something2ElsePackage.Literals.LINK_TO_ENTITY_EMBEDDED___MARKER__CREAT_E__COR_R__LTOE.getEOpposite());
    	        		}
    	        	}
    }
    
    
    @Override
    public Something2Else.ProtocolToEntity getCONTEXT__CORR__ptoe() {
    	return this.CONTEXT__CORR__ptoe;
    }
    
    @Override
    public void setCONTEXT__CORR__ptoe(Something2Else.ProtocolToEntity value) {
    	
    	Object oldValue = this.CONTEXT__CORR__ptoe;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CONTEXT__CORR__ptoe = value;
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Something2ElsePackage.Literals.LINK_TO_ENTITY_EMBEDDED___MARKER__CONTEX_T__COR_R__PTOE, oldValue, value, -1));
    	        	
    	        	if(Something2ElsePackage.Literals.LINK_TO_ENTITY_EMBEDDED___MARKER__CONTEX_T__COR_R__PTOE.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Something2ElsePackage.Literals.LINK_TO_ENTITY_EMBEDDED___MARKER__CONTEX_T__COR_R__PTOE.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Something2ElsePackage.Literals.LINK_TO_ENTITY_EMBEDDED___MARKER__CONTEX_T__COR_R__PTOE.getEOpposite());
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
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Something2ElsePackage.Literals.LINK_TO_ENTITY_EMBEDDED___MARKER__CONTEX_T__COR_R__STOR, oldValue, value, -1));
    	        	
    	        	if(Something2ElsePackage.Literals.LINK_TO_ENTITY_EMBEDDED___MARKER__CONTEX_T__COR_R__STOR.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Something2ElsePackage.Literals.LINK_TO_ENTITY_EMBEDDED___MARKER__CONTEX_T__COR_R__STOR.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Something2ElsePackage.Literals.LINK_TO_ENTITY_EMBEDDED___MARKER__CONTEX_T__COR_R__STOR.getEOpposite());
    	        		}
    	        	}
    }
    

    @Override
    public void eSet(EStructuralFeature eFeature, Object newValue){
    	if (RuntimePackage.Literals.TGG_RULE_APPLICATION__PROTOCOL.equals(eFeature)) {
    		setProtocol((runtime.Protocol) newValue); 
    		return;
    	}
    	if (Something2ElsePackage.Literals.LINK_TO_ENTITY_EMBEDDED___MARKER__CONTEX_T__SR_C__COMPONENT.equals(eFeature)) {
    		setCONTEXT__SRC__component((tools.vitruv.methodologisttemplate.model.model.Component) newValue); 
    		return;
    	}
    	if (Something2ElsePackage.Literals.LINK_TO_ENTITY_EMBEDDED___MARKER__CREAT_E__SR_C__LINK.equals(eFeature)) {
    		setCREATE__SRC__link((tools.vitruv.methodologisttemplate.model.model.Link) newValue); 
    		return;
    	}
    	if (Something2ElsePackage.Literals.LINK_TO_ENTITY_EMBEDDED___MARKER__CONTEX_T__SR_C__PROTOCOL.equals(eFeature)) {
    		setCONTEXT__SRC__protocol((tools.vitruv.methodologisttemplate.model.model.Protocol) newValue); 
    		return;
    	}
    	if (Something2ElsePackage.Literals.LINK_TO_ENTITY_EMBEDDED___MARKER__CONTEX_T__SR_C__SYSTEM.equals(eFeature)) {
    		setCONTEXT__SRC__system((tools.vitruv.methodologisttemplate.model.model.System) newValue); 
    		return;
    	}
    	if (Something2ElsePackage.Literals.LINK_TO_ENTITY_EMBEDDED___MARKER__CONTEX_T__TR_G__COMP_ENTITY.equals(eFeature)) {
    		setCONTEXT__TRG__compEntity((tools.vitruv.methodologisttemplate.model.model2.Entity) newValue); 
    		return;
    	}
    	if (Something2ElsePackage.Literals.LINK_TO_ENTITY_EMBEDDED___MARKER__CREAT_E__TR_G__LINK_ENTITY.equals(eFeature)) {
    		setCREATE__TRG__linkEntity((tools.vitruv.methodologisttemplate.model.model2.Entity) newValue); 
    		return;
    	}
    	if (Something2ElsePackage.Literals.LINK_TO_ENTITY_EMBEDDED___MARKER__CONTEX_T__TR_G__PROT_ENTITY.equals(eFeature)) {
    		setCONTEXT__TRG__protEntity((tools.vitruv.methodologisttemplate.model.model2.Entity) newValue); 
    		return;
    	}
    	if (Something2ElsePackage.Literals.LINK_TO_ENTITY_EMBEDDED___MARKER__CONTEX_T__TR_G__ROOT.equals(eFeature)) {
    		setCONTEXT__TRG__root((tools.vitruv.methodologisttemplate.model.model2.Root) newValue); 
    		return;
    	}
    	if (Something2ElsePackage.Literals.LINK_TO_ENTITY_EMBEDDED___MARKER__CONTEX_T__COR_R__CTOE.equals(eFeature)) {
    		setCONTEXT__CORR__ctoe((Something2Else.ComponentToEntity) newValue); 
    		return;
    	}
    	if (Something2ElsePackage.Literals.LINK_TO_ENTITY_EMBEDDED___MARKER__CREAT_E__COR_R__LTOE.equals(eFeature)) {
    		setCREATE__CORR__ltoe((Something2Else.LinkToEntity) newValue); 
    		return;
    	}
    	if (Something2ElsePackage.Literals.LINK_TO_ENTITY_EMBEDDED___MARKER__CONTEX_T__COR_R__PTOE.equals(eFeature)) {
    		setCONTEXT__CORR__ptoe((Something2Else.ProtocolToEntity) newValue); 
    		return;
    	}
    	if (Something2ElsePackage.Literals.LINK_TO_ENTITY_EMBEDDED___MARKER__CONTEX_T__COR_R__STOR.equals(eFeature)) {
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
    	if (Something2ElsePackage.Literals.LINK_TO_ENTITY_EMBEDDED___MARKER__CONTEX_T__SR_C__COMPONENT.equals(eFeature)) {
    		setCONTEXT__SRC__component((tools.vitruv.methodologisttemplate.model.model.Component)null); 
    		return;
    	}
    	if (Something2ElsePackage.Literals.LINK_TO_ENTITY_EMBEDDED___MARKER__CREAT_E__SR_C__LINK.equals(eFeature)) {
    		setCREATE__SRC__link((tools.vitruv.methodologisttemplate.model.model.Link)null); 
    		return;
    	}
    	if (Something2ElsePackage.Literals.LINK_TO_ENTITY_EMBEDDED___MARKER__CONTEX_T__SR_C__PROTOCOL.equals(eFeature)) {
    		setCONTEXT__SRC__protocol((tools.vitruv.methodologisttemplate.model.model.Protocol)null); 
    		return;
    	}
    	if (Something2ElsePackage.Literals.LINK_TO_ENTITY_EMBEDDED___MARKER__CONTEX_T__SR_C__SYSTEM.equals(eFeature)) {
    		setCONTEXT__SRC__system((tools.vitruv.methodologisttemplate.model.model.System)null); 
    		return;
    	}
    	if (Something2ElsePackage.Literals.LINK_TO_ENTITY_EMBEDDED___MARKER__CONTEX_T__TR_G__COMP_ENTITY.equals(eFeature)) {
    		setCONTEXT__TRG__compEntity((tools.vitruv.methodologisttemplate.model.model2.Entity)null); 
    		return;
    	}
    	if (Something2ElsePackage.Literals.LINK_TO_ENTITY_EMBEDDED___MARKER__CREAT_E__TR_G__LINK_ENTITY.equals(eFeature)) {
    		setCREATE__TRG__linkEntity((tools.vitruv.methodologisttemplate.model.model2.Entity)null); 
    		return;
    	}
    	if (Something2ElsePackage.Literals.LINK_TO_ENTITY_EMBEDDED___MARKER__CONTEX_T__TR_G__PROT_ENTITY.equals(eFeature)) {
    		setCONTEXT__TRG__protEntity((tools.vitruv.methodologisttemplate.model.model2.Entity)null); 
    		return;
    	}
    	if (Something2ElsePackage.Literals.LINK_TO_ENTITY_EMBEDDED___MARKER__CONTEX_T__TR_G__ROOT.equals(eFeature)) {
    		setCONTEXT__TRG__root((tools.vitruv.methodologisttemplate.model.model2.Root)null); 
    		return;
    	}
    	if (Something2ElsePackage.Literals.LINK_TO_ENTITY_EMBEDDED___MARKER__CONTEX_T__COR_R__CTOE.equals(eFeature)) {
    		setCONTEXT__CORR__ctoe((Something2Else.ComponentToEntity)null); 
    		return;
    	}
    	if (Something2ElsePackage.Literals.LINK_TO_ENTITY_EMBEDDED___MARKER__CREAT_E__COR_R__LTOE.equals(eFeature)) {
    		setCREATE__CORR__ltoe((Something2Else.LinkToEntity)null); 
    		return;
    	}
    	if (Something2ElsePackage.Literals.LINK_TO_ENTITY_EMBEDDED___MARKER__CONTEX_T__COR_R__PTOE.equals(eFeature)) {
    		setCONTEXT__CORR__ptoe((Something2Else.ProtocolToEntity)null); 
    		return;
    	}
    	if (Something2ElsePackage.Literals.LINK_TO_ENTITY_EMBEDDED___MARKER__CONTEX_T__COR_R__STOR.equals(eFeature)) {
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
    	if (Something2ElsePackage.Literals.LINK_TO_ENTITY_EMBEDDED___MARKER__CONTEX_T__SR_C__COMPONENT.equals(eFeature))
    		return getCONTEXT__SRC__component();
    	if (Something2ElsePackage.Literals.LINK_TO_ENTITY_EMBEDDED___MARKER__CREAT_E__SR_C__LINK.equals(eFeature))
    		return getCREATE__SRC__link();
    	if (Something2ElsePackage.Literals.LINK_TO_ENTITY_EMBEDDED___MARKER__CONTEX_T__SR_C__PROTOCOL.equals(eFeature))
    		return getCONTEXT__SRC__protocol();
    	if (Something2ElsePackage.Literals.LINK_TO_ENTITY_EMBEDDED___MARKER__CONTEX_T__SR_C__SYSTEM.equals(eFeature))
    		return getCONTEXT__SRC__system();
    	if (Something2ElsePackage.Literals.LINK_TO_ENTITY_EMBEDDED___MARKER__CONTEX_T__TR_G__COMP_ENTITY.equals(eFeature))
    		return getCONTEXT__TRG__compEntity();
    	if (Something2ElsePackage.Literals.LINK_TO_ENTITY_EMBEDDED___MARKER__CREAT_E__TR_G__LINK_ENTITY.equals(eFeature))
    		return getCREATE__TRG__linkEntity();
    	if (Something2ElsePackage.Literals.LINK_TO_ENTITY_EMBEDDED___MARKER__CONTEX_T__TR_G__PROT_ENTITY.equals(eFeature))
    		return getCONTEXT__TRG__protEntity();
    	if (Something2ElsePackage.Literals.LINK_TO_ENTITY_EMBEDDED___MARKER__CONTEX_T__TR_G__ROOT.equals(eFeature))
    		return getCONTEXT__TRG__root();
    	if (Something2ElsePackage.Literals.LINK_TO_ENTITY_EMBEDDED___MARKER__CONTEX_T__COR_R__CTOE.equals(eFeature))
    		return getCONTEXT__CORR__ctoe();
    	if (Something2ElsePackage.Literals.LINK_TO_ENTITY_EMBEDDED___MARKER__CREAT_E__COR_R__LTOE.equals(eFeature))
    		return getCREATE__CORR__ltoe();
    	if (Something2ElsePackage.Literals.LINK_TO_ENTITY_EMBEDDED___MARKER__CONTEX_T__COR_R__PTOE.equals(eFeature))
    		return getCONTEXT__CORR__ptoe();
    	if (Something2ElsePackage.Literals.LINK_TO_ENTITY_EMBEDDED___MARKER__CONTEX_T__COR_R__STOR.equals(eFeature))
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
