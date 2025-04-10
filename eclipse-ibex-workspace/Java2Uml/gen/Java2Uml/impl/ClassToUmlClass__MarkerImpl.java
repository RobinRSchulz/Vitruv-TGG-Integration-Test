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

public class ClassToUmlClass__MarkerImpl extends SmartObject implements Java2Uml.ClassToUmlClass__Marker {

    protected runtime.Protocol protocol = null;
    protected org.emftext.language.java.classifiers.Class CREATE__SRC__classifier = null;
    protected org.emftext.language.java.containers.CompilationUnit CONTEXT__SRC__compilationUnit = null;
    protected org.emftext.language.java.containers.Package CONTEXT__SRC__javaPackage = null;
    protected org.eclipse.uml2.uml.Class CREATE__TRG__umlClassifier = null;
    protected org.eclipse.uml2.uml.Package CONTEXT__TRG__umlPackage = null;
    protected Java2Uml.JavaClassifierToUmlClassifier CREATE__CORR__javaClassToUmlClass = null;
    protected Java2Uml.JavaPackageToUmlPackage CONTEXT__CORR__javaPackToUmlPack = null;
	
	protected ClassToUmlClass__MarkerImpl() {
		super(Java2UmlPackage.Literals.CLASS_TO_UML_CLASS___MARKER);
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
    public org.emftext.language.java.classifiers.Class getCREATE__SRC__classifier() {
    	return this.CREATE__SRC__classifier;
    }
    
    @Override
    public void setCREATE__SRC__classifier(org.emftext.language.java.classifiers.Class value) {
    	
    	Object oldValue = this.CREATE__SRC__classifier;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CREATE__SRC__classifier = value;
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Java2UmlPackage.Literals.CLASS_TO_UML_CLASS___MARKER__CREAT_E__SR_C__CLASSIFIER, oldValue, value, -1));
    	        	
    	        	if(Java2UmlPackage.Literals.CLASS_TO_UML_CLASS___MARKER__CREAT_E__SR_C__CLASSIFIER.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Java2UmlPackage.Literals.CLASS_TO_UML_CLASS___MARKER__CREAT_E__SR_C__CLASSIFIER.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Java2UmlPackage.Literals.CLASS_TO_UML_CLASS___MARKER__CREAT_E__SR_C__CLASSIFIER.getEOpposite());
    	        		}
    	        	}
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
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Java2UmlPackage.Literals.CLASS_TO_UML_CLASS___MARKER__CONTEX_T__SR_C__COMPILATION_UNIT, oldValue, value, -1));
    	        	
    	        	if(Java2UmlPackage.Literals.CLASS_TO_UML_CLASS___MARKER__CONTEX_T__SR_C__COMPILATION_UNIT.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Java2UmlPackage.Literals.CLASS_TO_UML_CLASS___MARKER__CONTEX_T__SR_C__COMPILATION_UNIT.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Java2UmlPackage.Literals.CLASS_TO_UML_CLASS___MARKER__CONTEX_T__SR_C__COMPILATION_UNIT.getEOpposite());
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
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Java2UmlPackage.Literals.CLASS_TO_UML_CLASS___MARKER__CONTEX_T__SR_C__JAVA_PACKAGE, oldValue, value, -1));
    	        	
    	        	if(Java2UmlPackage.Literals.CLASS_TO_UML_CLASS___MARKER__CONTEX_T__SR_C__JAVA_PACKAGE.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Java2UmlPackage.Literals.CLASS_TO_UML_CLASS___MARKER__CONTEX_T__SR_C__JAVA_PACKAGE.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Java2UmlPackage.Literals.CLASS_TO_UML_CLASS___MARKER__CONTEX_T__SR_C__JAVA_PACKAGE.getEOpposite());
    	        		}
    	        	}
    }
    
    
    @Override
    public org.eclipse.uml2.uml.Class getCREATE__TRG__umlClassifier() {
    	return this.CREATE__TRG__umlClassifier;
    }
    
    @Override
    public void setCREATE__TRG__umlClassifier(org.eclipse.uml2.uml.Class value) {
    	
    	Object oldValue = this.CREATE__TRG__umlClassifier;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CREATE__TRG__umlClassifier = value;
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Java2UmlPackage.Literals.CLASS_TO_UML_CLASS___MARKER__CREAT_E__TR_G__UML_CLASSIFIER, oldValue, value, -1));
    	        	
    	        	if(Java2UmlPackage.Literals.CLASS_TO_UML_CLASS___MARKER__CREAT_E__TR_G__UML_CLASSIFIER.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Java2UmlPackage.Literals.CLASS_TO_UML_CLASS___MARKER__CREAT_E__TR_G__UML_CLASSIFIER.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Java2UmlPackage.Literals.CLASS_TO_UML_CLASS___MARKER__CREAT_E__TR_G__UML_CLASSIFIER.getEOpposite());
    	        		}
    	        	}
    }
    
    
    @Override
    public org.eclipse.uml2.uml.Package getCONTEXT__TRG__umlPackage() {
    	return this.CONTEXT__TRG__umlPackage;
    }
    
    @Override
    public void setCONTEXT__TRG__umlPackage(org.eclipse.uml2.uml.Package value) {
    	
    	Object oldValue = this.CONTEXT__TRG__umlPackage;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CONTEXT__TRG__umlPackage = value;
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Java2UmlPackage.Literals.CLASS_TO_UML_CLASS___MARKER__CONTEX_T__TR_G__UML_PACKAGE, oldValue, value, -1));
    	        	
    	        	if(Java2UmlPackage.Literals.CLASS_TO_UML_CLASS___MARKER__CONTEX_T__TR_G__UML_PACKAGE.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Java2UmlPackage.Literals.CLASS_TO_UML_CLASS___MARKER__CONTEX_T__TR_G__UML_PACKAGE.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Java2UmlPackage.Literals.CLASS_TO_UML_CLASS___MARKER__CONTEX_T__TR_G__UML_PACKAGE.getEOpposite());
    	        		}
    	        	}
    }
    
    
    @Override
    public Java2Uml.JavaClassifierToUmlClassifier getCREATE__CORR__javaClassToUmlClass() {
    	return this.CREATE__CORR__javaClassToUmlClass;
    }
    
    @Override
    public void setCREATE__CORR__javaClassToUmlClass(Java2Uml.JavaClassifierToUmlClassifier value) {
    	
    	Object oldValue = this.CREATE__CORR__javaClassToUmlClass;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CREATE__CORR__javaClassToUmlClass = value;
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Java2UmlPackage.Literals.CLASS_TO_UML_CLASS___MARKER__CREAT_E__COR_R__JAVA_CLASS_TO_UML_CLASS, oldValue, value, -1));
    	        	
    	        	if(Java2UmlPackage.Literals.CLASS_TO_UML_CLASS___MARKER__CREAT_E__COR_R__JAVA_CLASS_TO_UML_CLASS.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Java2UmlPackage.Literals.CLASS_TO_UML_CLASS___MARKER__CREAT_E__COR_R__JAVA_CLASS_TO_UML_CLASS.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Java2UmlPackage.Literals.CLASS_TO_UML_CLASS___MARKER__CREAT_E__COR_R__JAVA_CLASS_TO_UML_CLASS.getEOpposite());
    	        		}
    	        	}
    }
    
    
    @Override
    public Java2Uml.JavaPackageToUmlPackage getCONTEXT__CORR__javaPackToUmlPack() {
    	return this.CONTEXT__CORR__javaPackToUmlPack;
    }
    
    @Override
    public void setCONTEXT__CORR__javaPackToUmlPack(Java2Uml.JavaPackageToUmlPackage value) {
    	
    	Object oldValue = this.CONTEXT__CORR__javaPackToUmlPack;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CONTEXT__CORR__javaPackToUmlPack = value;
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Java2UmlPackage.Literals.CLASS_TO_UML_CLASS___MARKER__CONTEX_T__COR_R__JAVA_PACK_TO_UML_PACK, oldValue, value, -1));
    	        	
    	        	if(Java2UmlPackage.Literals.CLASS_TO_UML_CLASS___MARKER__CONTEX_T__COR_R__JAVA_PACK_TO_UML_PACK.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Java2UmlPackage.Literals.CLASS_TO_UML_CLASS___MARKER__CONTEX_T__COR_R__JAVA_PACK_TO_UML_PACK.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Java2UmlPackage.Literals.CLASS_TO_UML_CLASS___MARKER__CONTEX_T__COR_R__JAVA_PACK_TO_UML_PACK.getEOpposite());
    	        		}
    	        	}
    }
    

    @Override
    public void eSet(EStructuralFeature eFeature, Object newValue){
    	if (RuntimePackage.Literals.TGG_RULE_APPLICATION__PROTOCOL.equals(eFeature)) {
    		setProtocol((runtime.Protocol) newValue); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.CLASS_TO_UML_CLASS___MARKER__CREAT_E__SR_C__CLASSIFIER.equals(eFeature)) {
    		setCREATE__SRC__classifier((org.emftext.language.java.classifiers.Class) newValue); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.CLASS_TO_UML_CLASS___MARKER__CONTEX_T__SR_C__COMPILATION_UNIT.equals(eFeature)) {
    		setCONTEXT__SRC__compilationUnit((org.emftext.language.java.containers.CompilationUnit) newValue); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.CLASS_TO_UML_CLASS___MARKER__CONTEX_T__SR_C__JAVA_PACKAGE.equals(eFeature)) {
    		setCONTEXT__SRC__javaPackage((org.emftext.language.java.containers.Package) newValue); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.CLASS_TO_UML_CLASS___MARKER__CREAT_E__TR_G__UML_CLASSIFIER.equals(eFeature)) {
    		setCREATE__TRG__umlClassifier((org.eclipse.uml2.uml.Class) newValue); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.CLASS_TO_UML_CLASS___MARKER__CONTEX_T__TR_G__UML_PACKAGE.equals(eFeature)) {
    		setCONTEXT__TRG__umlPackage((org.eclipse.uml2.uml.Package) newValue); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.CLASS_TO_UML_CLASS___MARKER__CREAT_E__COR_R__JAVA_CLASS_TO_UML_CLASS.equals(eFeature)) {
    		setCREATE__CORR__javaClassToUmlClass((Java2Uml.JavaClassifierToUmlClassifier) newValue); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.CLASS_TO_UML_CLASS___MARKER__CONTEX_T__COR_R__JAVA_PACK_TO_UML_PACK.equals(eFeature)) {
    		setCONTEXT__CORR__javaPackToUmlPack((Java2Uml.JavaPackageToUmlPackage) newValue); 
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
    	if (Java2UmlPackage.Literals.CLASS_TO_UML_CLASS___MARKER__CREAT_E__SR_C__CLASSIFIER.equals(eFeature)) {
    		setCREATE__SRC__classifier((org.emftext.language.java.classifiers.Class)null); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.CLASS_TO_UML_CLASS___MARKER__CONTEX_T__SR_C__COMPILATION_UNIT.equals(eFeature)) {
    		setCONTEXT__SRC__compilationUnit((org.emftext.language.java.containers.CompilationUnit)null); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.CLASS_TO_UML_CLASS___MARKER__CONTEX_T__SR_C__JAVA_PACKAGE.equals(eFeature)) {
    		setCONTEXT__SRC__javaPackage((org.emftext.language.java.containers.Package)null); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.CLASS_TO_UML_CLASS___MARKER__CREAT_E__TR_G__UML_CLASSIFIER.equals(eFeature)) {
    		setCREATE__TRG__umlClassifier((org.eclipse.uml2.uml.Class)null); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.CLASS_TO_UML_CLASS___MARKER__CONTEX_T__TR_G__UML_PACKAGE.equals(eFeature)) {
    		setCONTEXT__TRG__umlPackage((org.eclipse.uml2.uml.Package)null); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.CLASS_TO_UML_CLASS___MARKER__CREAT_E__COR_R__JAVA_CLASS_TO_UML_CLASS.equals(eFeature)) {
    		setCREATE__CORR__javaClassToUmlClass((Java2Uml.JavaClassifierToUmlClassifier)null); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.CLASS_TO_UML_CLASS___MARKER__CONTEX_T__COR_R__JAVA_PACK_TO_UML_PACK.equals(eFeature)) {
    		setCONTEXT__CORR__javaPackToUmlPack((Java2Uml.JavaPackageToUmlPackage)null); 
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
    	if (Java2UmlPackage.Literals.CLASS_TO_UML_CLASS___MARKER__CREAT_E__SR_C__CLASSIFIER.equals(eFeature))
    		return getCREATE__SRC__classifier();
    	if (Java2UmlPackage.Literals.CLASS_TO_UML_CLASS___MARKER__CONTEX_T__SR_C__COMPILATION_UNIT.equals(eFeature))
    		return getCONTEXT__SRC__compilationUnit();
    	if (Java2UmlPackage.Literals.CLASS_TO_UML_CLASS___MARKER__CONTEX_T__SR_C__JAVA_PACKAGE.equals(eFeature))
    		return getCONTEXT__SRC__javaPackage();
    	if (Java2UmlPackage.Literals.CLASS_TO_UML_CLASS___MARKER__CREAT_E__TR_G__UML_CLASSIFIER.equals(eFeature))
    		return getCREATE__TRG__umlClassifier();
    	if (Java2UmlPackage.Literals.CLASS_TO_UML_CLASS___MARKER__CONTEX_T__TR_G__UML_PACKAGE.equals(eFeature))
    		return getCONTEXT__TRG__umlPackage();
    	if (Java2UmlPackage.Literals.CLASS_TO_UML_CLASS___MARKER__CREAT_E__COR_R__JAVA_CLASS_TO_UML_CLASS.equals(eFeature))
    		return getCREATE__CORR__javaClassToUmlClass();
    	if (Java2UmlPackage.Literals.CLASS_TO_UML_CLASS___MARKER__CONTEX_T__COR_R__JAVA_PACK_TO_UML_PACK.equals(eFeature))
    		return getCONTEXT__CORR__javaPackToUmlPack();
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
