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

public class JavaCompilationUnitToExistingUmlModel__MarkerImpl extends SmartObject implements Java2Uml.JavaCompilationUnitToExistingUmlModel__Marker {

    protected runtime.Protocol protocol = null;
    protected org.emftext.language.java.containers.CompilationUnit CONTEXT__SRC__compilationUnit = null;
    protected org.emftext.language.java.containers.Package CONTEXT__SRC__javaPackage = null;
    protected org.emftext.language.java.containers.CompilationUnit CREATE__SRC__newCompilationUnit = null;
    protected org.eclipse.uml2.uml.Model CONTEXT__TRG__umlModel = null;
    protected Java2Uml.JavaCompilationUnitToUmlModel CONTEXT__CORR__javaCompUnitToUmlModel = null;
    protected Java2Uml.JavaCompilationUnitToUmlModel CREATE__CORR__newJavaCompUnitToUmlModel = null;
	
	protected JavaCompilationUnitToExistingUmlModel__MarkerImpl() {
		super(Java2UmlPackage.Literals.JAVA_COMPILATION_UNIT_TO_EXISTING_UML_MODEL___MARKER);
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
    public org.emftext.language.java.containers.CompilationUnit getCONTEXT__SRC__compilationUnit() {
    	return this.CONTEXT__SRC__compilationUnit;
    }
    
    @Override
    public void setCONTEXT__SRC__compilationUnit(org.emftext.language.java.containers.CompilationUnit value) {
    	
    	Object oldValue = this.CONTEXT__SRC__compilationUnit;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CONTEXT__SRC__compilationUnit = value;
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Java2UmlPackage.Literals.JAVA_COMPILATION_UNIT_TO_EXISTING_UML_MODEL___MARKER__CONTEX_T__SR_C__COMPILATION_UNIT, oldValue, value, -1));
    	        	
    	        	if(Java2UmlPackage.Literals.JAVA_COMPILATION_UNIT_TO_EXISTING_UML_MODEL___MARKER__CONTEX_T__SR_C__COMPILATION_UNIT.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Java2UmlPackage.Literals.JAVA_COMPILATION_UNIT_TO_EXISTING_UML_MODEL___MARKER__CONTEX_T__SR_C__COMPILATION_UNIT.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Java2UmlPackage.Literals.JAVA_COMPILATION_UNIT_TO_EXISTING_UML_MODEL___MARKER__CONTEX_T__SR_C__COMPILATION_UNIT.getEOpposite());
    	        		}
    	        	}
    }
    
    
    @Override
    public org.emftext.language.java.containers.Package getCONTEXT__SRC__javaPackage() {
    	return this.CONTEXT__SRC__javaPackage;
    }
    
    @Override
    public void setCONTEXT__SRC__javaPackage(org.emftext.language.java.containers.Package value) {
    	
    	Object oldValue = this.CONTEXT__SRC__javaPackage;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CONTEXT__SRC__javaPackage = value;
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Java2UmlPackage.Literals.JAVA_COMPILATION_UNIT_TO_EXISTING_UML_MODEL___MARKER__CONTEX_T__SR_C__JAVA_PACKAGE, oldValue, value, -1));
    	        	
    	        	if(Java2UmlPackage.Literals.JAVA_COMPILATION_UNIT_TO_EXISTING_UML_MODEL___MARKER__CONTEX_T__SR_C__JAVA_PACKAGE.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Java2UmlPackage.Literals.JAVA_COMPILATION_UNIT_TO_EXISTING_UML_MODEL___MARKER__CONTEX_T__SR_C__JAVA_PACKAGE.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Java2UmlPackage.Literals.JAVA_COMPILATION_UNIT_TO_EXISTING_UML_MODEL___MARKER__CONTEX_T__SR_C__JAVA_PACKAGE.getEOpposite());
    	        		}
    	        	}
    }
    
    
    @Override
    public org.emftext.language.java.containers.CompilationUnit getCREATE__SRC__newCompilationUnit() {
    	return this.CREATE__SRC__newCompilationUnit;
    }
    
    @Override
    public void setCREATE__SRC__newCompilationUnit(org.emftext.language.java.containers.CompilationUnit value) {
    	
    	Object oldValue = this.CREATE__SRC__newCompilationUnit;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CREATE__SRC__newCompilationUnit = value;
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Java2UmlPackage.Literals.JAVA_COMPILATION_UNIT_TO_EXISTING_UML_MODEL___MARKER__CREAT_E__SR_C__NEW_COMPILATION_UNIT, oldValue, value, -1));
    	        	
    	        	if(Java2UmlPackage.Literals.JAVA_COMPILATION_UNIT_TO_EXISTING_UML_MODEL___MARKER__CREAT_E__SR_C__NEW_COMPILATION_UNIT.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Java2UmlPackage.Literals.JAVA_COMPILATION_UNIT_TO_EXISTING_UML_MODEL___MARKER__CREAT_E__SR_C__NEW_COMPILATION_UNIT.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Java2UmlPackage.Literals.JAVA_COMPILATION_UNIT_TO_EXISTING_UML_MODEL___MARKER__CREAT_E__SR_C__NEW_COMPILATION_UNIT.getEOpposite());
    	        		}
    	        	}
    }
    
    
    @Override
    public org.eclipse.uml2.uml.Model getCONTEXT__TRG__umlModel() {
    	return this.CONTEXT__TRG__umlModel;
    }
    
    @Override
    public void setCONTEXT__TRG__umlModel(org.eclipse.uml2.uml.Model value) {
    	
    	Object oldValue = this.CONTEXT__TRG__umlModel;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CONTEXT__TRG__umlModel = value;
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Java2UmlPackage.Literals.JAVA_COMPILATION_UNIT_TO_EXISTING_UML_MODEL___MARKER__CONTEX_T__TR_G__UML_MODEL, oldValue, value, -1));
    	        	
    	        	if(Java2UmlPackage.Literals.JAVA_COMPILATION_UNIT_TO_EXISTING_UML_MODEL___MARKER__CONTEX_T__TR_G__UML_MODEL.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Java2UmlPackage.Literals.JAVA_COMPILATION_UNIT_TO_EXISTING_UML_MODEL___MARKER__CONTEX_T__TR_G__UML_MODEL.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Java2UmlPackage.Literals.JAVA_COMPILATION_UNIT_TO_EXISTING_UML_MODEL___MARKER__CONTEX_T__TR_G__UML_MODEL.getEOpposite());
    	        		}
    	        	}
    }
    
    
    @Override
    public Java2Uml.JavaCompilationUnitToUmlModel getCONTEXT__CORR__javaCompUnitToUmlModel() {
    	return this.CONTEXT__CORR__javaCompUnitToUmlModel;
    }
    
    @Override
    public void setCONTEXT__CORR__javaCompUnitToUmlModel(Java2Uml.JavaCompilationUnitToUmlModel value) {
    	
    	Object oldValue = this.CONTEXT__CORR__javaCompUnitToUmlModel;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CONTEXT__CORR__javaCompUnitToUmlModel = value;
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Java2UmlPackage.Literals.JAVA_COMPILATION_UNIT_TO_EXISTING_UML_MODEL___MARKER__CONTEX_T__COR_R__JAVA_COMP_UNIT_TO_UML_MODEL, oldValue, value, -1));
    	        	
    	        	if(Java2UmlPackage.Literals.JAVA_COMPILATION_UNIT_TO_EXISTING_UML_MODEL___MARKER__CONTEX_T__COR_R__JAVA_COMP_UNIT_TO_UML_MODEL.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Java2UmlPackage.Literals.JAVA_COMPILATION_UNIT_TO_EXISTING_UML_MODEL___MARKER__CONTEX_T__COR_R__JAVA_COMP_UNIT_TO_UML_MODEL.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Java2UmlPackage.Literals.JAVA_COMPILATION_UNIT_TO_EXISTING_UML_MODEL___MARKER__CONTEX_T__COR_R__JAVA_COMP_UNIT_TO_UML_MODEL.getEOpposite());
    	        		}
    	        	}
    }
    
    
    @Override
    public Java2Uml.JavaCompilationUnitToUmlModel getCREATE__CORR__newJavaCompUnitToUmlModel() {
    	return this.CREATE__CORR__newJavaCompUnitToUmlModel;
    }
    
    @Override
    public void setCREATE__CORR__newJavaCompUnitToUmlModel(Java2Uml.JavaCompilationUnitToUmlModel value) {
    	
    	Object oldValue = this.CREATE__CORR__newJavaCompUnitToUmlModel;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CREATE__CORR__newJavaCompUnitToUmlModel = value;
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Java2UmlPackage.Literals.JAVA_COMPILATION_UNIT_TO_EXISTING_UML_MODEL___MARKER__CREAT_E__COR_R__NEW_JAVA_COMP_UNIT_TO_UML_MODEL, oldValue, value, -1));
    	        	
    	        	if(Java2UmlPackage.Literals.JAVA_COMPILATION_UNIT_TO_EXISTING_UML_MODEL___MARKER__CREAT_E__COR_R__NEW_JAVA_COMP_UNIT_TO_UML_MODEL.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Java2UmlPackage.Literals.JAVA_COMPILATION_UNIT_TO_EXISTING_UML_MODEL___MARKER__CREAT_E__COR_R__NEW_JAVA_COMP_UNIT_TO_UML_MODEL.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Java2UmlPackage.Literals.JAVA_COMPILATION_UNIT_TO_EXISTING_UML_MODEL___MARKER__CREAT_E__COR_R__NEW_JAVA_COMP_UNIT_TO_UML_MODEL.getEOpposite());
    	        		}
    	        	}
    }
    

    @Override
    public void eSet(EStructuralFeature eFeature, Object newValue){
    	if (RuntimePackage.Literals.TGG_RULE_APPLICATION__PROTOCOL.equals(eFeature)) {
    		setProtocol((runtime.Protocol) newValue); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.JAVA_COMPILATION_UNIT_TO_EXISTING_UML_MODEL___MARKER__CONTEX_T__SR_C__COMPILATION_UNIT.equals(eFeature)) {
    		setCONTEXT__SRC__compilationUnit((org.emftext.language.java.containers.CompilationUnit) newValue); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.JAVA_COMPILATION_UNIT_TO_EXISTING_UML_MODEL___MARKER__CONTEX_T__SR_C__JAVA_PACKAGE.equals(eFeature)) {
    		setCONTEXT__SRC__javaPackage((org.emftext.language.java.containers.Package) newValue); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.JAVA_COMPILATION_UNIT_TO_EXISTING_UML_MODEL___MARKER__CREAT_E__SR_C__NEW_COMPILATION_UNIT.equals(eFeature)) {
    		setCREATE__SRC__newCompilationUnit((org.emftext.language.java.containers.CompilationUnit) newValue); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.JAVA_COMPILATION_UNIT_TO_EXISTING_UML_MODEL___MARKER__CONTEX_T__TR_G__UML_MODEL.equals(eFeature)) {
    		setCONTEXT__TRG__umlModel((org.eclipse.uml2.uml.Model) newValue); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.JAVA_COMPILATION_UNIT_TO_EXISTING_UML_MODEL___MARKER__CONTEX_T__COR_R__JAVA_COMP_UNIT_TO_UML_MODEL.equals(eFeature)) {
    		setCONTEXT__CORR__javaCompUnitToUmlModel((Java2Uml.JavaCompilationUnitToUmlModel) newValue); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.JAVA_COMPILATION_UNIT_TO_EXISTING_UML_MODEL___MARKER__CREAT_E__COR_R__NEW_JAVA_COMP_UNIT_TO_UML_MODEL.equals(eFeature)) {
    		setCREATE__CORR__newJavaCompUnitToUmlModel((Java2Uml.JavaCompilationUnitToUmlModel) newValue); 
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
    	if (Java2UmlPackage.Literals.JAVA_COMPILATION_UNIT_TO_EXISTING_UML_MODEL___MARKER__CONTEX_T__SR_C__COMPILATION_UNIT.equals(eFeature)) {
    		setCONTEXT__SRC__compilationUnit((org.emftext.language.java.containers.CompilationUnit)null); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.JAVA_COMPILATION_UNIT_TO_EXISTING_UML_MODEL___MARKER__CONTEX_T__SR_C__JAVA_PACKAGE.equals(eFeature)) {
    		setCONTEXT__SRC__javaPackage((org.emftext.language.java.containers.Package)null); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.JAVA_COMPILATION_UNIT_TO_EXISTING_UML_MODEL___MARKER__CREAT_E__SR_C__NEW_COMPILATION_UNIT.equals(eFeature)) {
    		setCREATE__SRC__newCompilationUnit((org.emftext.language.java.containers.CompilationUnit)null); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.JAVA_COMPILATION_UNIT_TO_EXISTING_UML_MODEL___MARKER__CONTEX_T__TR_G__UML_MODEL.equals(eFeature)) {
    		setCONTEXT__TRG__umlModel((org.eclipse.uml2.uml.Model)null); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.JAVA_COMPILATION_UNIT_TO_EXISTING_UML_MODEL___MARKER__CONTEX_T__COR_R__JAVA_COMP_UNIT_TO_UML_MODEL.equals(eFeature)) {
    		setCONTEXT__CORR__javaCompUnitToUmlModel((Java2Uml.JavaCompilationUnitToUmlModel)null); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.JAVA_COMPILATION_UNIT_TO_EXISTING_UML_MODEL___MARKER__CREAT_E__COR_R__NEW_JAVA_COMP_UNIT_TO_UML_MODEL.equals(eFeature)) {
    		setCREATE__CORR__newJavaCompUnitToUmlModel((Java2Uml.JavaCompilationUnitToUmlModel)null); 
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
    	if (Java2UmlPackage.Literals.JAVA_COMPILATION_UNIT_TO_EXISTING_UML_MODEL___MARKER__CONTEX_T__SR_C__COMPILATION_UNIT.equals(eFeature))
    		return getCONTEXT__SRC__compilationUnit();
    	if (Java2UmlPackage.Literals.JAVA_COMPILATION_UNIT_TO_EXISTING_UML_MODEL___MARKER__CONTEX_T__SR_C__JAVA_PACKAGE.equals(eFeature))
    		return getCONTEXT__SRC__javaPackage();
    	if (Java2UmlPackage.Literals.JAVA_COMPILATION_UNIT_TO_EXISTING_UML_MODEL___MARKER__CREAT_E__SR_C__NEW_COMPILATION_UNIT.equals(eFeature))
    		return getCREATE__SRC__newCompilationUnit();
    	if (Java2UmlPackage.Literals.JAVA_COMPILATION_UNIT_TO_EXISTING_UML_MODEL___MARKER__CONTEX_T__TR_G__UML_MODEL.equals(eFeature))
    		return getCONTEXT__TRG__umlModel();
    	if (Java2UmlPackage.Literals.JAVA_COMPILATION_UNIT_TO_EXISTING_UML_MODEL___MARKER__CONTEX_T__COR_R__JAVA_COMP_UNIT_TO_UML_MODEL.equals(eFeature))
    		return getCONTEXT__CORR__javaCompUnitToUmlModel();
    	if (Java2UmlPackage.Literals.JAVA_COMPILATION_UNIT_TO_EXISTING_UML_MODEL___MARKER__CREAT_E__COR_R__NEW_JAVA_COMP_UNIT_TO_UML_MODEL.equals(eFeature))
    		return getCREATE__CORR__newJavaCompUnitToUmlModel();
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
