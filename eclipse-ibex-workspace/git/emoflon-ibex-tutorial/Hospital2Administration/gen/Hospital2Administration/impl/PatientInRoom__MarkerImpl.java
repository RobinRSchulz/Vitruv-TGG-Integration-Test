package Hospital2Administration.impl;

import Hospital2Administration.Hospital2AdministrationPackage;
import runtime.RuntimePackage;
import Hospital2Administration.Hospital2AdministrationPackage;

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

public class PatientInRoom__MarkerImpl extends SmartObject implements Hospital2Administration.PatientInRoom__Marker {

    protected runtime.Protocol protocol = null;
    protected HospitalExample.Department CONTEXT__SRC__d = null;
    protected HospitalExample.Hospital CONTEXT__SRC__h = null;
    protected HospitalExample.Patient CREATE__SRC__p1 = null;
    protected HospitalExample.Room CONTEXT__SRC__ro = null;
    protected AdministrationExample.Patient CREATE__TRG__p2 = null;
    protected AdministrationExample.Administration CONTEXT__TRG__v = null;
    protected Hospital2Administration.HospitalToAdministration CONTEXT__CORR__htov = null;
    protected Hospital2Administration.PatientToPatient CREATE__CORR__pTop = null;
	
	protected PatientInRoom__MarkerImpl() {
		super(Hospital2AdministrationPackage.Literals.PATIENT_IN_ROOM___MARKER);
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
    public HospitalExample.Department getCONTEXT__SRC__d() {
    	return this.CONTEXT__SRC__d;
    }
    
    @Override
    public void setCONTEXT__SRC__d(HospitalExample.Department value) {
    	
    	Object oldValue = this.CONTEXT__SRC__d;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CONTEXT__SRC__d = value;
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Hospital2AdministrationPackage.Literals.PATIENT_IN_ROOM___MARKER__CONTEX_T__SR_C__D, oldValue, value, -1));
    	        	
    	        	if(Hospital2AdministrationPackage.Literals.PATIENT_IN_ROOM___MARKER__CONTEX_T__SR_C__D.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Hospital2AdministrationPackage.Literals.PATIENT_IN_ROOM___MARKER__CONTEX_T__SR_C__D.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Hospital2AdministrationPackage.Literals.PATIENT_IN_ROOM___MARKER__CONTEX_T__SR_C__D.getEOpposite());
    	        		}
    	        	}
    }
    
    
    @Override
    public HospitalExample.Hospital getCONTEXT__SRC__h() {
    	return this.CONTEXT__SRC__h;
    }
    
    @Override
    public void setCONTEXT__SRC__h(HospitalExample.Hospital value) {
    	
    	Object oldValue = this.CONTEXT__SRC__h;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CONTEXT__SRC__h = value;
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Hospital2AdministrationPackage.Literals.PATIENT_IN_ROOM___MARKER__CONTEX_T__SR_C__H, oldValue, value, -1));
    	        	
    	        	if(Hospital2AdministrationPackage.Literals.PATIENT_IN_ROOM___MARKER__CONTEX_T__SR_C__H.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Hospital2AdministrationPackage.Literals.PATIENT_IN_ROOM___MARKER__CONTEX_T__SR_C__H.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Hospital2AdministrationPackage.Literals.PATIENT_IN_ROOM___MARKER__CONTEX_T__SR_C__H.getEOpposite());
    	        		}
    	        	}
    }
    
    
    @Override
    public HospitalExample.Patient getCREATE__SRC__p1() {
    	return this.CREATE__SRC__p1;
    }
    
    @Override
    public void setCREATE__SRC__p1(HospitalExample.Patient value) {
    	
    	Object oldValue = this.CREATE__SRC__p1;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CREATE__SRC__p1 = value;
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Hospital2AdministrationPackage.Literals.PATIENT_IN_ROOM___MARKER__CREAT_E__SR_C__P1, oldValue, value, -1));
    	        	
    	        	if(Hospital2AdministrationPackage.Literals.PATIENT_IN_ROOM___MARKER__CREAT_E__SR_C__P1.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Hospital2AdministrationPackage.Literals.PATIENT_IN_ROOM___MARKER__CREAT_E__SR_C__P1.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Hospital2AdministrationPackage.Literals.PATIENT_IN_ROOM___MARKER__CREAT_E__SR_C__P1.getEOpposite());
    	        		}
    	        	}
    }
    
    
    @Override
    public HospitalExample.Room getCONTEXT__SRC__ro() {
    	return this.CONTEXT__SRC__ro;
    }
    
    @Override
    public void setCONTEXT__SRC__ro(HospitalExample.Room value) {
    	
    	Object oldValue = this.CONTEXT__SRC__ro;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CONTEXT__SRC__ro = value;
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Hospital2AdministrationPackage.Literals.PATIENT_IN_ROOM___MARKER__CONTEX_T__SR_C__RO, oldValue, value, -1));
    	        	
    	        	if(Hospital2AdministrationPackage.Literals.PATIENT_IN_ROOM___MARKER__CONTEX_T__SR_C__RO.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Hospital2AdministrationPackage.Literals.PATIENT_IN_ROOM___MARKER__CONTEX_T__SR_C__RO.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Hospital2AdministrationPackage.Literals.PATIENT_IN_ROOM___MARKER__CONTEX_T__SR_C__RO.getEOpposite());
    	        		}
    	        	}
    }
    
    
    @Override
    public AdministrationExample.Patient getCREATE__TRG__p2() {
    	return this.CREATE__TRG__p2;
    }
    
    @Override
    public void setCREATE__TRG__p2(AdministrationExample.Patient value) {
    	
    	Object oldValue = this.CREATE__TRG__p2;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CREATE__TRG__p2 = value;
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Hospital2AdministrationPackage.Literals.PATIENT_IN_ROOM___MARKER__CREAT_E__TR_G__P2, oldValue, value, -1));
    	        	
    	        	if(Hospital2AdministrationPackage.Literals.PATIENT_IN_ROOM___MARKER__CREAT_E__TR_G__P2.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Hospital2AdministrationPackage.Literals.PATIENT_IN_ROOM___MARKER__CREAT_E__TR_G__P2.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Hospital2AdministrationPackage.Literals.PATIENT_IN_ROOM___MARKER__CREAT_E__TR_G__P2.getEOpposite());
    	        		}
    	        	}
    }
    
    
    @Override
    public AdministrationExample.Administration getCONTEXT__TRG__v() {
    	return this.CONTEXT__TRG__v;
    }
    
    @Override
    public void setCONTEXT__TRG__v(AdministrationExample.Administration value) {
    	
    	Object oldValue = this.CONTEXT__TRG__v;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CONTEXT__TRG__v = value;
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Hospital2AdministrationPackage.Literals.PATIENT_IN_ROOM___MARKER__CONTEX_T__TR_G__V, oldValue, value, -1));
    	        	
    	        	if(Hospital2AdministrationPackage.Literals.PATIENT_IN_ROOM___MARKER__CONTEX_T__TR_G__V.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Hospital2AdministrationPackage.Literals.PATIENT_IN_ROOM___MARKER__CONTEX_T__TR_G__V.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Hospital2AdministrationPackage.Literals.PATIENT_IN_ROOM___MARKER__CONTEX_T__TR_G__V.getEOpposite());
    	        		}
    	        	}
    }
    
    
    @Override
    public Hospital2Administration.HospitalToAdministration getCONTEXT__CORR__htov() {
    	return this.CONTEXT__CORR__htov;
    }
    
    @Override
    public void setCONTEXT__CORR__htov(Hospital2Administration.HospitalToAdministration value) {
    	
    	Object oldValue = this.CONTEXT__CORR__htov;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CONTEXT__CORR__htov = value;
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Hospital2AdministrationPackage.Literals.PATIENT_IN_ROOM___MARKER__CONTEX_T__COR_R__HTOV, oldValue, value, -1));
    	        	
    	        	if(Hospital2AdministrationPackage.Literals.PATIENT_IN_ROOM___MARKER__CONTEX_T__COR_R__HTOV.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Hospital2AdministrationPackage.Literals.PATIENT_IN_ROOM___MARKER__CONTEX_T__COR_R__HTOV.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Hospital2AdministrationPackage.Literals.PATIENT_IN_ROOM___MARKER__CONTEX_T__COR_R__HTOV.getEOpposite());
    	        		}
    	        	}
    }
    
    
    @Override
    public Hospital2Administration.PatientToPatient getCREATE__CORR__pTop() {
    	return this.CREATE__CORR__pTop;
    }
    
    @Override
    public void setCREATE__CORR__pTop(Hospital2Administration.PatientToPatient value) {
    	
    	Object oldValue = this.CREATE__CORR__pTop;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CREATE__CORR__pTop = value;
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Hospital2AdministrationPackage.Literals.PATIENT_IN_ROOM___MARKER__CREAT_E__COR_R__P_TOP, oldValue, value, -1));
    	        	
    	        	if(Hospital2AdministrationPackage.Literals.PATIENT_IN_ROOM___MARKER__CREAT_E__COR_R__P_TOP.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Hospital2AdministrationPackage.Literals.PATIENT_IN_ROOM___MARKER__CREAT_E__COR_R__P_TOP.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Hospital2AdministrationPackage.Literals.PATIENT_IN_ROOM___MARKER__CREAT_E__COR_R__P_TOP.getEOpposite());
    	        		}
    	        	}
    }
    

    @Override
    public void eSet(EStructuralFeature eFeature, Object newValue){
    	if (RuntimePackage.Literals.TGG_RULE_APPLICATION__PROTOCOL.equals(eFeature)) {
    		setProtocol((runtime.Protocol) newValue); 
    		return;
    	}
    	if (Hospital2AdministrationPackage.Literals.PATIENT_IN_ROOM___MARKER__CONTEX_T__SR_C__D.equals(eFeature)) {
    		setCONTEXT__SRC__d((HospitalExample.Department) newValue); 
    		return;
    	}
    	if (Hospital2AdministrationPackage.Literals.PATIENT_IN_ROOM___MARKER__CONTEX_T__SR_C__H.equals(eFeature)) {
    		setCONTEXT__SRC__h((HospitalExample.Hospital) newValue); 
    		return;
    	}
    	if (Hospital2AdministrationPackage.Literals.PATIENT_IN_ROOM___MARKER__CREAT_E__SR_C__P1.equals(eFeature)) {
    		setCREATE__SRC__p1((HospitalExample.Patient) newValue); 
    		return;
    	}
    	if (Hospital2AdministrationPackage.Literals.PATIENT_IN_ROOM___MARKER__CONTEX_T__SR_C__RO.equals(eFeature)) {
    		setCONTEXT__SRC__ro((HospitalExample.Room) newValue); 
    		return;
    	}
    	if (Hospital2AdministrationPackage.Literals.PATIENT_IN_ROOM___MARKER__CREAT_E__TR_G__P2.equals(eFeature)) {
    		setCREATE__TRG__p2((AdministrationExample.Patient) newValue); 
    		return;
    	}
    	if (Hospital2AdministrationPackage.Literals.PATIENT_IN_ROOM___MARKER__CONTEX_T__TR_G__V.equals(eFeature)) {
    		setCONTEXT__TRG__v((AdministrationExample.Administration) newValue); 
    		return;
    	}
    	if (Hospital2AdministrationPackage.Literals.PATIENT_IN_ROOM___MARKER__CONTEX_T__COR_R__HTOV.equals(eFeature)) {
    		setCONTEXT__CORR__htov((Hospital2Administration.HospitalToAdministration) newValue); 
    		return;
    	}
    	if (Hospital2AdministrationPackage.Literals.PATIENT_IN_ROOM___MARKER__CREAT_E__COR_R__P_TOP.equals(eFeature)) {
    		setCREATE__CORR__pTop((Hospital2Administration.PatientToPatient) newValue); 
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
    	if (Hospital2AdministrationPackage.Literals.PATIENT_IN_ROOM___MARKER__CONTEX_T__SR_C__D.equals(eFeature)) {
    		setCONTEXT__SRC__d((HospitalExample.Department)null); 
    		return;
    	}
    	if (Hospital2AdministrationPackage.Literals.PATIENT_IN_ROOM___MARKER__CONTEX_T__SR_C__H.equals(eFeature)) {
    		setCONTEXT__SRC__h((HospitalExample.Hospital)null); 
    		return;
    	}
    	if (Hospital2AdministrationPackage.Literals.PATIENT_IN_ROOM___MARKER__CREAT_E__SR_C__P1.equals(eFeature)) {
    		setCREATE__SRC__p1((HospitalExample.Patient)null); 
    		return;
    	}
    	if (Hospital2AdministrationPackage.Literals.PATIENT_IN_ROOM___MARKER__CONTEX_T__SR_C__RO.equals(eFeature)) {
    		setCONTEXT__SRC__ro((HospitalExample.Room)null); 
    		return;
    	}
    	if (Hospital2AdministrationPackage.Literals.PATIENT_IN_ROOM___MARKER__CREAT_E__TR_G__P2.equals(eFeature)) {
    		setCREATE__TRG__p2((AdministrationExample.Patient)null); 
    		return;
    	}
    	if (Hospital2AdministrationPackage.Literals.PATIENT_IN_ROOM___MARKER__CONTEX_T__TR_G__V.equals(eFeature)) {
    		setCONTEXT__TRG__v((AdministrationExample.Administration)null); 
    		return;
    	}
    	if (Hospital2AdministrationPackage.Literals.PATIENT_IN_ROOM___MARKER__CONTEX_T__COR_R__HTOV.equals(eFeature)) {
    		setCONTEXT__CORR__htov((Hospital2Administration.HospitalToAdministration)null); 
    		return;
    	}
    	if (Hospital2AdministrationPackage.Literals.PATIENT_IN_ROOM___MARKER__CREAT_E__COR_R__P_TOP.equals(eFeature)) {
    		setCREATE__CORR__pTop((Hospital2Administration.PatientToPatient)null); 
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
    	if (Hospital2AdministrationPackage.Literals.PATIENT_IN_ROOM___MARKER__CONTEX_T__SR_C__D.equals(eFeature))
    		return getCONTEXT__SRC__d();
    	if (Hospital2AdministrationPackage.Literals.PATIENT_IN_ROOM___MARKER__CONTEX_T__SR_C__H.equals(eFeature))
    		return getCONTEXT__SRC__h();
    	if (Hospital2AdministrationPackage.Literals.PATIENT_IN_ROOM___MARKER__CREAT_E__SR_C__P1.equals(eFeature))
    		return getCREATE__SRC__p1();
    	if (Hospital2AdministrationPackage.Literals.PATIENT_IN_ROOM___MARKER__CONTEX_T__SR_C__RO.equals(eFeature))
    		return getCONTEXT__SRC__ro();
    	if (Hospital2AdministrationPackage.Literals.PATIENT_IN_ROOM___MARKER__CREAT_E__TR_G__P2.equals(eFeature))
    		return getCREATE__TRG__p2();
    	if (Hospital2AdministrationPackage.Literals.PATIENT_IN_ROOM___MARKER__CONTEX_T__TR_G__V.equals(eFeature))
    		return getCONTEXT__TRG__v();
    	if (Hospital2AdministrationPackage.Literals.PATIENT_IN_ROOM___MARKER__CONTEX_T__COR_R__HTOV.equals(eFeature))
    		return getCONTEXT__CORR__htov();
    	if (Hospital2AdministrationPackage.Literals.PATIENT_IN_ROOM___MARKER__CREAT_E__COR_R__P_TOP.equals(eFeature))
    		return getCREATE__CORR__pTop();
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
