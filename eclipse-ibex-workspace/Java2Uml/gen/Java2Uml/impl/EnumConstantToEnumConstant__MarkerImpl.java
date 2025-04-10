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

public class EnumConstantToEnumConstant__MarkerImpl extends SmartObject implements Java2Uml.EnumConstantToEnumConstant__Marker {

    protected runtime.Protocol protocol = null;
    protected org.emftext.language.java.members.EnumConstant CREATE__SRC__javaConstant = null;
    protected org.emftext.language.java.classifiers.Enumeration CONTEXT__SRC__javaEnum = null;
    protected org.eclipse.uml2.uml.Enumeration CONTEXT__TRG__umlEnum = null;
    protected org.eclipse.uml2.uml.EnumerationLiteral CREATE__TRG__umlLiteral = null;
    protected Java2Uml.JavaClassifierToUmlClassifier CONTEXT__CORR__j = null;
    protected Java2Uml.JavaEnumConstantToUmlEnumLiteral CREATE__CORR__javaEnumConstantToUmlEnumLiteral = null;
	
	protected EnumConstantToEnumConstant__MarkerImpl() {
		super(Java2UmlPackage.Literals.ENUM_CONSTANT_TO_ENUM_CONSTANT___MARKER);
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
    public org.emftext.language.java.members.EnumConstant getCREATE__SRC__javaConstant() {
    	return this.CREATE__SRC__javaConstant;
    }
    
    @Override
    public void setCREATE__SRC__javaConstant(org.emftext.language.java.members.EnumConstant value) {
    	
    	Object oldValue = this.CREATE__SRC__javaConstant;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CREATE__SRC__javaConstant = value;
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Java2UmlPackage.Literals.ENUM_CONSTANT_TO_ENUM_CONSTANT___MARKER__CREAT_E__SR_C__JAVA_CONSTANT, oldValue, value, -1));
    	        	
    	        	if(Java2UmlPackage.Literals.ENUM_CONSTANT_TO_ENUM_CONSTANT___MARKER__CREAT_E__SR_C__JAVA_CONSTANT.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Java2UmlPackage.Literals.ENUM_CONSTANT_TO_ENUM_CONSTANT___MARKER__CREAT_E__SR_C__JAVA_CONSTANT.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Java2UmlPackage.Literals.ENUM_CONSTANT_TO_ENUM_CONSTANT___MARKER__CREAT_E__SR_C__JAVA_CONSTANT.getEOpposite());
    	        		}
    	        	}
    }
    
    
    @Override
    public org.emftext.language.java.classifiers.Enumeration getCONTEXT__SRC__javaEnum() {
    	return this.CONTEXT__SRC__javaEnum;
    }
    
    @Override
    public void setCONTEXT__SRC__javaEnum(org.emftext.language.java.classifiers.Enumeration value) {
    	
    	Object oldValue = this.CONTEXT__SRC__javaEnum;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CONTEXT__SRC__javaEnum = value;
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Java2UmlPackage.Literals.ENUM_CONSTANT_TO_ENUM_CONSTANT___MARKER__CONTEX_T__SR_C__JAVA_ENUM, oldValue, value, -1));
    	        	
    	        	if(Java2UmlPackage.Literals.ENUM_CONSTANT_TO_ENUM_CONSTANT___MARKER__CONTEX_T__SR_C__JAVA_ENUM.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Java2UmlPackage.Literals.ENUM_CONSTANT_TO_ENUM_CONSTANT___MARKER__CONTEX_T__SR_C__JAVA_ENUM.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Java2UmlPackage.Literals.ENUM_CONSTANT_TO_ENUM_CONSTANT___MARKER__CONTEX_T__SR_C__JAVA_ENUM.getEOpposite());
    	        		}
    	        	}
    }
    
    
    @Override
    public org.eclipse.uml2.uml.Enumeration getCONTEXT__TRG__umlEnum() {
    	return this.CONTEXT__TRG__umlEnum;
    }
    
    @Override
    public void setCONTEXT__TRG__umlEnum(org.eclipse.uml2.uml.Enumeration value) {
    	
    	Object oldValue = this.CONTEXT__TRG__umlEnum;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CONTEXT__TRG__umlEnum = value;
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Java2UmlPackage.Literals.ENUM_CONSTANT_TO_ENUM_CONSTANT___MARKER__CONTEX_T__TR_G__UML_ENUM, oldValue, value, -1));
    	        	
    	        	if(Java2UmlPackage.Literals.ENUM_CONSTANT_TO_ENUM_CONSTANT___MARKER__CONTEX_T__TR_G__UML_ENUM.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Java2UmlPackage.Literals.ENUM_CONSTANT_TO_ENUM_CONSTANT___MARKER__CONTEX_T__TR_G__UML_ENUM.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Java2UmlPackage.Literals.ENUM_CONSTANT_TO_ENUM_CONSTANT___MARKER__CONTEX_T__TR_G__UML_ENUM.getEOpposite());
    	        		}
    	        	}
    }
    
    
    @Override
    public org.eclipse.uml2.uml.EnumerationLiteral getCREATE__TRG__umlLiteral() {
    	return this.CREATE__TRG__umlLiteral;
    }
    
    @Override
    public void setCREATE__TRG__umlLiteral(org.eclipse.uml2.uml.EnumerationLiteral value) {
    	
    	Object oldValue = this.CREATE__TRG__umlLiteral;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CREATE__TRG__umlLiteral = value;
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Java2UmlPackage.Literals.ENUM_CONSTANT_TO_ENUM_CONSTANT___MARKER__CREAT_E__TR_G__UML_LITERAL, oldValue, value, -1));
    	        	
    	        	if(Java2UmlPackage.Literals.ENUM_CONSTANT_TO_ENUM_CONSTANT___MARKER__CREAT_E__TR_G__UML_LITERAL.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Java2UmlPackage.Literals.ENUM_CONSTANT_TO_ENUM_CONSTANT___MARKER__CREAT_E__TR_G__UML_LITERAL.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Java2UmlPackage.Literals.ENUM_CONSTANT_TO_ENUM_CONSTANT___MARKER__CREAT_E__TR_G__UML_LITERAL.getEOpposite());
    	        		}
    	        	}
    }
    
    
    @Override
    public Java2Uml.JavaClassifierToUmlClassifier getCONTEXT__CORR__j() {
    	return this.CONTEXT__CORR__j;
    }
    
    @Override
    public void setCONTEXT__CORR__j(Java2Uml.JavaClassifierToUmlClassifier value) {
    	
    	Object oldValue = this.CONTEXT__CORR__j;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CONTEXT__CORR__j = value;
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Java2UmlPackage.Literals.ENUM_CONSTANT_TO_ENUM_CONSTANT___MARKER__CONTEX_T__COR_R__J, oldValue, value, -1));
    	        	
    	        	if(Java2UmlPackage.Literals.ENUM_CONSTANT_TO_ENUM_CONSTANT___MARKER__CONTEX_T__COR_R__J.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Java2UmlPackage.Literals.ENUM_CONSTANT_TO_ENUM_CONSTANT___MARKER__CONTEX_T__COR_R__J.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Java2UmlPackage.Literals.ENUM_CONSTANT_TO_ENUM_CONSTANT___MARKER__CONTEX_T__COR_R__J.getEOpposite());
    	        		}
    	        	}
    }
    
    
    @Override
    public Java2Uml.JavaEnumConstantToUmlEnumLiteral getCREATE__CORR__javaEnumConstantToUmlEnumLiteral() {
    	return this.CREATE__CORR__javaEnumConstantToUmlEnumLiteral;
    }
    
    @Override
    public void setCREATE__CORR__javaEnumConstantToUmlEnumLiteral(Java2Uml.JavaEnumConstantToUmlEnumLiteral value) {
    	
    	Object oldValue = this.CREATE__CORR__javaEnumConstantToUmlEnumLiteral;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CREATE__CORR__javaEnumConstantToUmlEnumLiteral = value;
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Java2UmlPackage.Literals.ENUM_CONSTANT_TO_ENUM_CONSTANT___MARKER__CREAT_E__COR_R__JAVA_ENUM_CONSTANT_TO_UML_ENUM_LITERAL, oldValue, value, -1));
    	        	
    	        	if(Java2UmlPackage.Literals.ENUM_CONSTANT_TO_ENUM_CONSTANT___MARKER__CREAT_E__COR_R__JAVA_ENUM_CONSTANT_TO_UML_ENUM_LITERAL.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Java2UmlPackage.Literals.ENUM_CONSTANT_TO_ENUM_CONSTANT___MARKER__CREAT_E__COR_R__JAVA_ENUM_CONSTANT_TO_UML_ENUM_LITERAL.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Java2UmlPackage.Literals.ENUM_CONSTANT_TO_ENUM_CONSTANT___MARKER__CREAT_E__COR_R__JAVA_ENUM_CONSTANT_TO_UML_ENUM_LITERAL.getEOpposite());
    	        		}
    	        	}
    }
    

    @Override
    public void eSet(EStructuralFeature eFeature, Object newValue){
    	if (RuntimePackage.Literals.TGG_RULE_APPLICATION__PROTOCOL.equals(eFeature)) {
    		setProtocol((runtime.Protocol) newValue); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.ENUM_CONSTANT_TO_ENUM_CONSTANT___MARKER__CREAT_E__SR_C__JAVA_CONSTANT.equals(eFeature)) {
    		setCREATE__SRC__javaConstant((org.emftext.language.java.members.EnumConstant) newValue); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.ENUM_CONSTANT_TO_ENUM_CONSTANT___MARKER__CONTEX_T__SR_C__JAVA_ENUM.equals(eFeature)) {
    		setCONTEXT__SRC__javaEnum((org.emftext.language.java.classifiers.Enumeration) newValue); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.ENUM_CONSTANT_TO_ENUM_CONSTANT___MARKER__CONTEX_T__TR_G__UML_ENUM.equals(eFeature)) {
    		setCONTEXT__TRG__umlEnum((org.eclipse.uml2.uml.Enumeration) newValue); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.ENUM_CONSTANT_TO_ENUM_CONSTANT___MARKER__CREAT_E__TR_G__UML_LITERAL.equals(eFeature)) {
    		setCREATE__TRG__umlLiteral((org.eclipse.uml2.uml.EnumerationLiteral) newValue); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.ENUM_CONSTANT_TO_ENUM_CONSTANT___MARKER__CONTEX_T__COR_R__J.equals(eFeature)) {
    		setCONTEXT__CORR__j((Java2Uml.JavaClassifierToUmlClassifier) newValue); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.ENUM_CONSTANT_TO_ENUM_CONSTANT___MARKER__CREAT_E__COR_R__JAVA_ENUM_CONSTANT_TO_UML_ENUM_LITERAL.equals(eFeature)) {
    		setCREATE__CORR__javaEnumConstantToUmlEnumLiteral((Java2Uml.JavaEnumConstantToUmlEnumLiteral) newValue); 
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
    	if (Java2UmlPackage.Literals.ENUM_CONSTANT_TO_ENUM_CONSTANT___MARKER__CREAT_E__SR_C__JAVA_CONSTANT.equals(eFeature)) {
    		setCREATE__SRC__javaConstant((org.emftext.language.java.members.EnumConstant)null); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.ENUM_CONSTANT_TO_ENUM_CONSTANT___MARKER__CONTEX_T__SR_C__JAVA_ENUM.equals(eFeature)) {
    		setCONTEXT__SRC__javaEnum((org.emftext.language.java.classifiers.Enumeration)null); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.ENUM_CONSTANT_TO_ENUM_CONSTANT___MARKER__CONTEX_T__TR_G__UML_ENUM.equals(eFeature)) {
    		setCONTEXT__TRG__umlEnum((org.eclipse.uml2.uml.Enumeration)null); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.ENUM_CONSTANT_TO_ENUM_CONSTANT___MARKER__CREAT_E__TR_G__UML_LITERAL.equals(eFeature)) {
    		setCREATE__TRG__umlLiteral((org.eclipse.uml2.uml.EnumerationLiteral)null); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.ENUM_CONSTANT_TO_ENUM_CONSTANT___MARKER__CONTEX_T__COR_R__J.equals(eFeature)) {
    		setCONTEXT__CORR__j((Java2Uml.JavaClassifierToUmlClassifier)null); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.ENUM_CONSTANT_TO_ENUM_CONSTANT___MARKER__CREAT_E__COR_R__JAVA_ENUM_CONSTANT_TO_UML_ENUM_LITERAL.equals(eFeature)) {
    		setCREATE__CORR__javaEnumConstantToUmlEnumLiteral((Java2Uml.JavaEnumConstantToUmlEnumLiteral)null); 
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
    	if (Java2UmlPackage.Literals.ENUM_CONSTANT_TO_ENUM_CONSTANT___MARKER__CREAT_E__SR_C__JAVA_CONSTANT.equals(eFeature))
    		return getCREATE__SRC__javaConstant();
    	if (Java2UmlPackage.Literals.ENUM_CONSTANT_TO_ENUM_CONSTANT___MARKER__CONTEX_T__SR_C__JAVA_ENUM.equals(eFeature))
    		return getCONTEXT__SRC__javaEnum();
    	if (Java2UmlPackage.Literals.ENUM_CONSTANT_TO_ENUM_CONSTANT___MARKER__CONTEX_T__TR_G__UML_ENUM.equals(eFeature))
    		return getCONTEXT__TRG__umlEnum();
    	if (Java2UmlPackage.Literals.ENUM_CONSTANT_TO_ENUM_CONSTANT___MARKER__CREAT_E__TR_G__UML_LITERAL.equals(eFeature))
    		return getCREATE__TRG__umlLiteral();
    	if (Java2UmlPackage.Literals.ENUM_CONSTANT_TO_ENUM_CONSTANT___MARKER__CONTEX_T__COR_R__J.equals(eFeature))
    		return getCONTEXT__CORR__j();
    	if (Java2UmlPackage.Literals.ENUM_CONSTANT_TO_ENUM_CONSTANT___MARKER__CREAT_E__COR_R__JAVA_ENUM_CONSTANT_TO_UML_ENUM_LITERAL.equals(eFeature))
    		return getCREATE__CORR__javaEnumConstantToUmlEnumLiteral();
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
