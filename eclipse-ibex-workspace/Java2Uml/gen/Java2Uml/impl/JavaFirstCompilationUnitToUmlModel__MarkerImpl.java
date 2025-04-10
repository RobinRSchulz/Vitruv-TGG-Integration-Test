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

public class JavaFirstCompilationUnitToUmlModel__MarkerImpl extends SmartObject implements Java2Uml.JavaFirstCompilationUnitToUmlModel__Marker {

    protected runtime.Protocol protocol = null;
    protected org.emftext.language.java.containers.CompilationUnit CREATE__SRC__compilationUnit = null;
    protected org.emftext.language.java.containers.Package CONTEXT__SRC__javaPackage = null;
    protected org.eclipse.uml2.uml.PrimitiveType CREATE__TRG__booleanType = null;
    protected org.eclipse.uml2.uml.PrimitiveType CREATE__TRG__byteType = null;
    protected org.eclipse.uml2.uml.PrimitiveType CREATE__TRG__charType = null;
    protected org.eclipse.uml2.uml.PrimitiveType CREATE__TRG__doubleType = null;
    protected org.eclipse.uml2.uml.PrimitiveType CREATE__TRG__floatType = null;
    protected org.eclipse.uml2.uml.PrimitiveType CREATE__TRG__intType = null;
    protected org.eclipse.uml2.uml.PrimitiveType CREATE__TRG__longType = null;
    protected org.eclipse.uml2.uml.PrimitiveType CREATE__TRG__shortType = null;
    protected org.eclipse.uml2.uml.PrimitiveType CREATE__TRG__stringType = null;
    protected org.eclipse.uml2.uml.Model CREATE__TRG__umlModel = null;
    protected org.eclipse.uml2.uml.PrimitiveType CREATE__TRG__voidType = null;
    protected Java2Uml.JavaCompilationUnitToUmlModel CREATE__CORR__javaCompUnitToUmlModel = null;
	
	protected JavaFirstCompilationUnitToUmlModel__MarkerImpl() {
		super(Java2UmlPackage.Literals.JAVA_FIRST_COMPILATION_UNIT_TO_UML_MODEL___MARKER);
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
    public org.emftext.language.java.containers.CompilationUnit getCREATE__SRC__compilationUnit() {
    	return this.CREATE__SRC__compilationUnit;
    }
    
    @Override
    public void setCREATE__SRC__compilationUnit(org.emftext.language.java.containers.CompilationUnit value) {
    	
    	Object oldValue = this.CREATE__SRC__compilationUnit;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CREATE__SRC__compilationUnit = value;
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Java2UmlPackage.Literals.JAVA_FIRST_COMPILATION_UNIT_TO_UML_MODEL___MARKER__CREAT_E__SR_C__COMPILATION_UNIT, oldValue, value, -1));
    	        	
    	        	if(Java2UmlPackage.Literals.JAVA_FIRST_COMPILATION_UNIT_TO_UML_MODEL___MARKER__CREAT_E__SR_C__COMPILATION_UNIT.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Java2UmlPackage.Literals.JAVA_FIRST_COMPILATION_UNIT_TO_UML_MODEL___MARKER__CREAT_E__SR_C__COMPILATION_UNIT.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Java2UmlPackage.Literals.JAVA_FIRST_COMPILATION_UNIT_TO_UML_MODEL___MARKER__CREAT_E__SR_C__COMPILATION_UNIT.getEOpposite());
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
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Java2UmlPackage.Literals.JAVA_FIRST_COMPILATION_UNIT_TO_UML_MODEL___MARKER__CONTEX_T__SR_C__JAVA_PACKAGE, oldValue, value, -1));
    	        	
    	        	if(Java2UmlPackage.Literals.JAVA_FIRST_COMPILATION_UNIT_TO_UML_MODEL___MARKER__CONTEX_T__SR_C__JAVA_PACKAGE.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Java2UmlPackage.Literals.JAVA_FIRST_COMPILATION_UNIT_TO_UML_MODEL___MARKER__CONTEX_T__SR_C__JAVA_PACKAGE.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Java2UmlPackage.Literals.JAVA_FIRST_COMPILATION_UNIT_TO_UML_MODEL___MARKER__CONTEX_T__SR_C__JAVA_PACKAGE.getEOpposite());
    	        		}
    	        	}
    }
    
    
    @Override
    public org.eclipse.uml2.uml.PrimitiveType getCREATE__TRG__booleanType() {
    	return this.CREATE__TRG__booleanType;
    }
    
    @Override
    public void setCREATE__TRG__booleanType(org.eclipse.uml2.uml.PrimitiveType value) {
    	
    	Object oldValue = this.CREATE__TRG__booleanType;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CREATE__TRG__booleanType = value;
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Java2UmlPackage.Literals.JAVA_FIRST_COMPILATION_UNIT_TO_UML_MODEL___MARKER__CREAT_E__TR_G__BOOLEAN_TYPE, oldValue, value, -1));
    	        	
    	        	if(Java2UmlPackage.Literals.JAVA_FIRST_COMPILATION_UNIT_TO_UML_MODEL___MARKER__CREAT_E__TR_G__BOOLEAN_TYPE.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Java2UmlPackage.Literals.JAVA_FIRST_COMPILATION_UNIT_TO_UML_MODEL___MARKER__CREAT_E__TR_G__BOOLEAN_TYPE.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Java2UmlPackage.Literals.JAVA_FIRST_COMPILATION_UNIT_TO_UML_MODEL___MARKER__CREAT_E__TR_G__BOOLEAN_TYPE.getEOpposite());
    	        		}
    	        	}
    }
    
    
    @Override
    public org.eclipse.uml2.uml.PrimitiveType getCREATE__TRG__byteType() {
    	return this.CREATE__TRG__byteType;
    }
    
    @Override
    public void setCREATE__TRG__byteType(org.eclipse.uml2.uml.PrimitiveType value) {
    	
    	Object oldValue = this.CREATE__TRG__byteType;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CREATE__TRG__byteType = value;
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Java2UmlPackage.Literals.JAVA_FIRST_COMPILATION_UNIT_TO_UML_MODEL___MARKER__CREAT_E__TR_G__BYTE_TYPE, oldValue, value, -1));
    	        	
    	        	if(Java2UmlPackage.Literals.JAVA_FIRST_COMPILATION_UNIT_TO_UML_MODEL___MARKER__CREAT_E__TR_G__BYTE_TYPE.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Java2UmlPackage.Literals.JAVA_FIRST_COMPILATION_UNIT_TO_UML_MODEL___MARKER__CREAT_E__TR_G__BYTE_TYPE.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Java2UmlPackage.Literals.JAVA_FIRST_COMPILATION_UNIT_TO_UML_MODEL___MARKER__CREAT_E__TR_G__BYTE_TYPE.getEOpposite());
    	        		}
    	        	}
    }
    
    
    @Override
    public org.eclipse.uml2.uml.PrimitiveType getCREATE__TRG__charType() {
    	return this.CREATE__TRG__charType;
    }
    
    @Override
    public void setCREATE__TRG__charType(org.eclipse.uml2.uml.PrimitiveType value) {
    	
    	Object oldValue = this.CREATE__TRG__charType;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CREATE__TRG__charType = value;
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Java2UmlPackage.Literals.JAVA_FIRST_COMPILATION_UNIT_TO_UML_MODEL___MARKER__CREAT_E__TR_G__CHAR_TYPE, oldValue, value, -1));
    	        	
    	        	if(Java2UmlPackage.Literals.JAVA_FIRST_COMPILATION_UNIT_TO_UML_MODEL___MARKER__CREAT_E__TR_G__CHAR_TYPE.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Java2UmlPackage.Literals.JAVA_FIRST_COMPILATION_UNIT_TO_UML_MODEL___MARKER__CREAT_E__TR_G__CHAR_TYPE.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Java2UmlPackage.Literals.JAVA_FIRST_COMPILATION_UNIT_TO_UML_MODEL___MARKER__CREAT_E__TR_G__CHAR_TYPE.getEOpposite());
    	        		}
    	        	}
    }
    
    
    @Override
    public org.eclipse.uml2.uml.PrimitiveType getCREATE__TRG__doubleType() {
    	return this.CREATE__TRG__doubleType;
    }
    
    @Override
    public void setCREATE__TRG__doubleType(org.eclipse.uml2.uml.PrimitiveType value) {
    	
    	Object oldValue = this.CREATE__TRG__doubleType;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CREATE__TRG__doubleType = value;
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Java2UmlPackage.Literals.JAVA_FIRST_COMPILATION_UNIT_TO_UML_MODEL___MARKER__CREAT_E__TR_G__DOUBLE_TYPE, oldValue, value, -1));
    	        	
    	        	if(Java2UmlPackage.Literals.JAVA_FIRST_COMPILATION_UNIT_TO_UML_MODEL___MARKER__CREAT_E__TR_G__DOUBLE_TYPE.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Java2UmlPackage.Literals.JAVA_FIRST_COMPILATION_UNIT_TO_UML_MODEL___MARKER__CREAT_E__TR_G__DOUBLE_TYPE.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Java2UmlPackage.Literals.JAVA_FIRST_COMPILATION_UNIT_TO_UML_MODEL___MARKER__CREAT_E__TR_G__DOUBLE_TYPE.getEOpposite());
    	        		}
    	        	}
    }
    
    
    @Override
    public org.eclipse.uml2.uml.PrimitiveType getCREATE__TRG__floatType() {
    	return this.CREATE__TRG__floatType;
    }
    
    @Override
    public void setCREATE__TRG__floatType(org.eclipse.uml2.uml.PrimitiveType value) {
    	
    	Object oldValue = this.CREATE__TRG__floatType;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CREATE__TRG__floatType = value;
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Java2UmlPackage.Literals.JAVA_FIRST_COMPILATION_UNIT_TO_UML_MODEL___MARKER__CREAT_E__TR_G__FLOAT_TYPE, oldValue, value, -1));
    	        	
    	        	if(Java2UmlPackage.Literals.JAVA_FIRST_COMPILATION_UNIT_TO_UML_MODEL___MARKER__CREAT_E__TR_G__FLOAT_TYPE.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Java2UmlPackage.Literals.JAVA_FIRST_COMPILATION_UNIT_TO_UML_MODEL___MARKER__CREAT_E__TR_G__FLOAT_TYPE.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Java2UmlPackage.Literals.JAVA_FIRST_COMPILATION_UNIT_TO_UML_MODEL___MARKER__CREAT_E__TR_G__FLOAT_TYPE.getEOpposite());
    	        		}
    	        	}
    }
    
    
    @Override
    public org.eclipse.uml2.uml.PrimitiveType getCREATE__TRG__intType() {
    	return this.CREATE__TRG__intType;
    }
    
    @Override
    public void setCREATE__TRG__intType(org.eclipse.uml2.uml.PrimitiveType value) {
    	
    	Object oldValue = this.CREATE__TRG__intType;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CREATE__TRG__intType = value;
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Java2UmlPackage.Literals.JAVA_FIRST_COMPILATION_UNIT_TO_UML_MODEL___MARKER__CREAT_E__TR_G__INT_TYPE, oldValue, value, -1));
    	        	
    	        	if(Java2UmlPackage.Literals.JAVA_FIRST_COMPILATION_UNIT_TO_UML_MODEL___MARKER__CREAT_E__TR_G__INT_TYPE.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Java2UmlPackage.Literals.JAVA_FIRST_COMPILATION_UNIT_TO_UML_MODEL___MARKER__CREAT_E__TR_G__INT_TYPE.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Java2UmlPackage.Literals.JAVA_FIRST_COMPILATION_UNIT_TO_UML_MODEL___MARKER__CREAT_E__TR_G__INT_TYPE.getEOpposite());
    	        		}
    	        	}
    }
    
    
    @Override
    public org.eclipse.uml2.uml.PrimitiveType getCREATE__TRG__longType() {
    	return this.CREATE__TRG__longType;
    }
    
    @Override
    public void setCREATE__TRG__longType(org.eclipse.uml2.uml.PrimitiveType value) {
    	
    	Object oldValue = this.CREATE__TRG__longType;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CREATE__TRG__longType = value;
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Java2UmlPackage.Literals.JAVA_FIRST_COMPILATION_UNIT_TO_UML_MODEL___MARKER__CREAT_E__TR_G__LONG_TYPE, oldValue, value, -1));
    	        	
    	        	if(Java2UmlPackage.Literals.JAVA_FIRST_COMPILATION_UNIT_TO_UML_MODEL___MARKER__CREAT_E__TR_G__LONG_TYPE.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Java2UmlPackage.Literals.JAVA_FIRST_COMPILATION_UNIT_TO_UML_MODEL___MARKER__CREAT_E__TR_G__LONG_TYPE.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Java2UmlPackage.Literals.JAVA_FIRST_COMPILATION_UNIT_TO_UML_MODEL___MARKER__CREAT_E__TR_G__LONG_TYPE.getEOpposite());
    	        		}
    	        	}
    }
    
    
    @Override
    public org.eclipse.uml2.uml.PrimitiveType getCREATE__TRG__shortType() {
    	return this.CREATE__TRG__shortType;
    }
    
    @Override
    public void setCREATE__TRG__shortType(org.eclipse.uml2.uml.PrimitiveType value) {
    	
    	Object oldValue = this.CREATE__TRG__shortType;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CREATE__TRG__shortType = value;
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Java2UmlPackage.Literals.JAVA_FIRST_COMPILATION_UNIT_TO_UML_MODEL___MARKER__CREAT_E__TR_G__SHORT_TYPE, oldValue, value, -1));
    	        	
    	        	if(Java2UmlPackage.Literals.JAVA_FIRST_COMPILATION_UNIT_TO_UML_MODEL___MARKER__CREAT_E__TR_G__SHORT_TYPE.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Java2UmlPackage.Literals.JAVA_FIRST_COMPILATION_UNIT_TO_UML_MODEL___MARKER__CREAT_E__TR_G__SHORT_TYPE.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Java2UmlPackage.Literals.JAVA_FIRST_COMPILATION_UNIT_TO_UML_MODEL___MARKER__CREAT_E__TR_G__SHORT_TYPE.getEOpposite());
    	        		}
    	        	}
    }
    
    
    @Override
    public org.eclipse.uml2.uml.PrimitiveType getCREATE__TRG__stringType() {
    	return this.CREATE__TRG__stringType;
    }
    
    @Override
    public void setCREATE__TRG__stringType(org.eclipse.uml2.uml.PrimitiveType value) {
    	
    	Object oldValue = this.CREATE__TRG__stringType;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CREATE__TRG__stringType = value;
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Java2UmlPackage.Literals.JAVA_FIRST_COMPILATION_UNIT_TO_UML_MODEL___MARKER__CREAT_E__TR_G__STRING_TYPE, oldValue, value, -1));
    	        	
    	        	if(Java2UmlPackage.Literals.JAVA_FIRST_COMPILATION_UNIT_TO_UML_MODEL___MARKER__CREAT_E__TR_G__STRING_TYPE.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Java2UmlPackage.Literals.JAVA_FIRST_COMPILATION_UNIT_TO_UML_MODEL___MARKER__CREAT_E__TR_G__STRING_TYPE.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Java2UmlPackage.Literals.JAVA_FIRST_COMPILATION_UNIT_TO_UML_MODEL___MARKER__CREAT_E__TR_G__STRING_TYPE.getEOpposite());
    	        		}
    	        	}
    }
    
    
    @Override
    public org.eclipse.uml2.uml.Model getCREATE__TRG__umlModel() {
    	return this.CREATE__TRG__umlModel;
    }
    
    @Override
    public void setCREATE__TRG__umlModel(org.eclipse.uml2.uml.Model value) {
    	
    	Object oldValue = this.CREATE__TRG__umlModel;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CREATE__TRG__umlModel = value;
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Java2UmlPackage.Literals.JAVA_FIRST_COMPILATION_UNIT_TO_UML_MODEL___MARKER__CREAT_E__TR_G__UML_MODEL, oldValue, value, -1));
    	        	
    	        	if(Java2UmlPackage.Literals.JAVA_FIRST_COMPILATION_UNIT_TO_UML_MODEL___MARKER__CREAT_E__TR_G__UML_MODEL.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Java2UmlPackage.Literals.JAVA_FIRST_COMPILATION_UNIT_TO_UML_MODEL___MARKER__CREAT_E__TR_G__UML_MODEL.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Java2UmlPackage.Literals.JAVA_FIRST_COMPILATION_UNIT_TO_UML_MODEL___MARKER__CREAT_E__TR_G__UML_MODEL.getEOpposite());
    	        		}
    	        	}
    }
    
    
    @Override
    public org.eclipse.uml2.uml.PrimitiveType getCREATE__TRG__voidType() {
    	return this.CREATE__TRG__voidType;
    }
    
    @Override
    public void setCREATE__TRG__voidType(org.eclipse.uml2.uml.PrimitiveType value) {
    	
    	Object oldValue = this.CREATE__TRG__voidType;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CREATE__TRG__voidType = value;
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Java2UmlPackage.Literals.JAVA_FIRST_COMPILATION_UNIT_TO_UML_MODEL___MARKER__CREAT_E__TR_G__VOID_TYPE, oldValue, value, -1));
    	        	
    	        	if(Java2UmlPackage.Literals.JAVA_FIRST_COMPILATION_UNIT_TO_UML_MODEL___MARKER__CREAT_E__TR_G__VOID_TYPE.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Java2UmlPackage.Literals.JAVA_FIRST_COMPILATION_UNIT_TO_UML_MODEL___MARKER__CREAT_E__TR_G__VOID_TYPE.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Java2UmlPackage.Literals.JAVA_FIRST_COMPILATION_UNIT_TO_UML_MODEL___MARKER__CREAT_E__TR_G__VOID_TYPE.getEOpposite());
    	        		}
    	        	}
    }
    
    
    @Override
    public Java2Uml.JavaCompilationUnitToUmlModel getCREATE__CORR__javaCompUnitToUmlModel() {
    	return this.CREATE__CORR__javaCompUnitToUmlModel;
    }
    
    @Override
    public void setCREATE__CORR__javaCompUnitToUmlModel(Java2Uml.JavaCompilationUnitToUmlModel value) {
    	
    	Object oldValue = this.CREATE__CORR__javaCompUnitToUmlModel;
    	
    	if(value == null && oldValue == null)
    		return;
    		
    	if(value != null && value.equals(oldValue))
    		return;
    		
    	
    	
    		        this.CREATE__CORR__javaCompUnitToUmlModel = value;
    		        
    	
    	
    	        	sendNotification(SmartEMFNotification.createSetNotification(this, Java2UmlPackage.Literals.JAVA_FIRST_COMPILATION_UNIT_TO_UML_MODEL___MARKER__CREAT_E__COR_R__JAVA_COMP_UNIT_TO_UML_MODEL, oldValue, value, -1));
    	        	
    	        	if(Java2UmlPackage.Literals.JAVA_FIRST_COMPILATION_UNIT_TO_UML_MODEL___MARKER__CREAT_E__COR_R__JAVA_COMP_UNIT_TO_UML_MODEL.getEOpposite() != null) {
    	        		if(oldValue != null) {
    	        			((SmartObject) oldValue).eInverseRemove(this, Java2UmlPackage.Literals.JAVA_FIRST_COMPILATION_UNIT_TO_UML_MODEL___MARKER__CREAT_E__COR_R__JAVA_COMP_UNIT_TO_UML_MODEL.getEOpposite());
    	        		}
    	        		if(value != null) {
    	        		    ((SmartObject) value).eInverseAdd(this, Java2UmlPackage.Literals.JAVA_FIRST_COMPILATION_UNIT_TO_UML_MODEL___MARKER__CREAT_E__COR_R__JAVA_COMP_UNIT_TO_UML_MODEL.getEOpposite());
    	        		}
    	        	}
    }
    

    @Override
    public void eSet(EStructuralFeature eFeature, Object newValue){
    	if (RuntimePackage.Literals.TGG_RULE_APPLICATION__PROTOCOL.equals(eFeature)) {
    		setProtocol((runtime.Protocol) newValue); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.JAVA_FIRST_COMPILATION_UNIT_TO_UML_MODEL___MARKER__CREAT_E__SR_C__COMPILATION_UNIT.equals(eFeature)) {
    		setCREATE__SRC__compilationUnit((org.emftext.language.java.containers.CompilationUnit) newValue); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.JAVA_FIRST_COMPILATION_UNIT_TO_UML_MODEL___MARKER__CONTEX_T__SR_C__JAVA_PACKAGE.equals(eFeature)) {
    		setCONTEXT__SRC__javaPackage((org.emftext.language.java.containers.Package) newValue); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.JAVA_FIRST_COMPILATION_UNIT_TO_UML_MODEL___MARKER__CREAT_E__TR_G__BOOLEAN_TYPE.equals(eFeature)) {
    		setCREATE__TRG__booleanType((org.eclipse.uml2.uml.PrimitiveType) newValue); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.JAVA_FIRST_COMPILATION_UNIT_TO_UML_MODEL___MARKER__CREAT_E__TR_G__BYTE_TYPE.equals(eFeature)) {
    		setCREATE__TRG__byteType((org.eclipse.uml2.uml.PrimitiveType) newValue); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.JAVA_FIRST_COMPILATION_UNIT_TO_UML_MODEL___MARKER__CREAT_E__TR_G__CHAR_TYPE.equals(eFeature)) {
    		setCREATE__TRG__charType((org.eclipse.uml2.uml.PrimitiveType) newValue); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.JAVA_FIRST_COMPILATION_UNIT_TO_UML_MODEL___MARKER__CREAT_E__TR_G__DOUBLE_TYPE.equals(eFeature)) {
    		setCREATE__TRG__doubleType((org.eclipse.uml2.uml.PrimitiveType) newValue); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.JAVA_FIRST_COMPILATION_UNIT_TO_UML_MODEL___MARKER__CREAT_E__TR_G__FLOAT_TYPE.equals(eFeature)) {
    		setCREATE__TRG__floatType((org.eclipse.uml2.uml.PrimitiveType) newValue); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.JAVA_FIRST_COMPILATION_UNIT_TO_UML_MODEL___MARKER__CREAT_E__TR_G__INT_TYPE.equals(eFeature)) {
    		setCREATE__TRG__intType((org.eclipse.uml2.uml.PrimitiveType) newValue); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.JAVA_FIRST_COMPILATION_UNIT_TO_UML_MODEL___MARKER__CREAT_E__TR_G__LONG_TYPE.equals(eFeature)) {
    		setCREATE__TRG__longType((org.eclipse.uml2.uml.PrimitiveType) newValue); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.JAVA_FIRST_COMPILATION_UNIT_TO_UML_MODEL___MARKER__CREAT_E__TR_G__SHORT_TYPE.equals(eFeature)) {
    		setCREATE__TRG__shortType((org.eclipse.uml2.uml.PrimitiveType) newValue); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.JAVA_FIRST_COMPILATION_UNIT_TO_UML_MODEL___MARKER__CREAT_E__TR_G__STRING_TYPE.equals(eFeature)) {
    		setCREATE__TRG__stringType((org.eclipse.uml2.uml.PrimitiveType) newValue); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.JAVA_FIRST_COMPILATION_UNIT_TO_UML_MODEL___MARKER__CREAT_E__TR_G__UML_MODEL.equals(eFeature)) {
    		setCREATE__TRG__umlModel((org.eclipse.uml2.uml.Model) newValue); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.JAVA_FIRST_COMPILATION_UNIT_TO_UML_MODEL___MARKER__CREAT_E__TR_G__VOID_TYPE.equals(eFeature)) {
    		setCREATE__TRG__voidType((org.eclipse.uml2.uml.PrimitiveType) newValue); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.JAVA_FIRST_COMPILATION_UNIT_TO_UML_MODEL___MARKER__CREAT_E__COR_R__JAVA_COMP_UNIT_TO_UML_MODEL.equals(eFeature)) {
    		setCREATE__CORR__javaCompUnitToUmlModel((Java2Uml.JavaCompilationUnitToUmlModel) newValue); 
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
    	if (Java2UmlPackage.Literals.JAVA_FIRST_COMPILATION_UNIT_TO_UML_MODEL___MARKER__CREAT_E__SR_C__COMPILATION_UNIT.equals(eFeature)) {
    		setCREATE__SRC__compilationUnit((org.emftext.language.java.containers.CompilationUnit)null); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.JAVA_FIRST_COMPILATION_UNIT_TO_UML_MODEL___MARKER__CONTEX_T__SR_C__JAVA_PACKAGE.equals(eFeature)) {
    		setCONTEXT__SRC__javaPackage((org.emftext.language.java.containers.Package)null); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.JAVA_FIRST_COMPILATION_UNIT_TO_UML_MODEL___MARKER__CREAT_E__TR_G__BOOLEAN_TYPE.equals(eFeature)) {
    		setCREATE__TRG__booleanType((org.eclipse.uml2.uml.PrimitiveType)null); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.JAVA_FIRST_COMPILATION_UNIT_TO_UML_MODEL___MARKER__CREAT_E__TR_G__BYTE_TYPE.equals(eFeature)) {
    		setCREATE__TRG__byteType((org.eclipse.uml2.uml.PrimitiveType)null); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.JAVA_FIRST_COMPILATION_UNIT_TO_UML_MODEL___MARKER__CREAT_E__TR_G__CHAR_TYPE.equals(eFeature)) {
    		setCREATE__TRG__charType((org.eclipse.uml2.uml.PrimitiveType)null); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.JAVA_FIRST_COMPILATION_UNIT_TO_UML_MODEL___MARKER__CREAT_E__TR_G__DOUBLE_TYPE.equals(eFeature)) {
    		setCREATE__TRG__doubleType((org.eclipse.uml2.uml.PrimitiveType)null); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.JAVA_FIRST_COMPILATION_UNIT_TO_UML_MODEL___MARKER__CREAT_E__TR_G__FLOAT_TYPE.equals(eFeature)) {
    		setCREATE__TRG__floatType((org.eclipse.uml2.uml.PrimitiveType)null); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.JAVA_FIRST_COMPILATION_UNIT_TO_UML_MODEL___MARKER__CREAT_E__TR_G__INT_TYPE.equals(eFeature)) {
    		setCREATE__TRG__intType((org.eclipse.uml2.uml.PrimitiveType)null); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.JAVA_FIRST_COMPILATION_UNIT_TO_UML_MODEL___MARKER__CREAT_E__TR_G__LONG_TYPE.equals(eFeature)) {
    		setCREATE__TRG__longType((org.eclipse.uml2.uml.PrimitiveType)null); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.JAVA_FIRST_COMPILATION_UNIT_TO_UML_MODEL___MARKER__CREAT_E__TR_G__SHORT_TYPE.equals(eFeature)) {
    		setCREATE__TRG__shortType((org.eclipse.uml2.uml.PrimitiveType)null); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.JAVA_FIRST_COMPILATION_UNIT_TO_UML_MODEL___MARKER__CREAT_E__TR_G__STRING_TYPE.equals(eFeature)) {
    		setCREATE__TRG__stringType((org.eclipse.uml2.uml.PrimitiveType)null); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.JAVA_FIRST_COMPILATION_UNIT_TO_UML_MODEL___MARKER__CREAT_E__TR_G__UML_MODEL.equals(eFeature)) {
    		setCREATE__TRG__umlModel((org.eclipse.uml2.uml.Model)null); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.JAVA_FIRST_COMPILATION_UNIT_TO_UML_MODEL___MARKER__CREAT_E__TR_G__VOID_TYPE.equals(eFeature)) {
    		setCREATE__TRG__voidType((org.eclipse.uml2.uml.PrimitiveType)null); 
    		return;
    	}
    	if (Java2UmlPackage.Literals.JAVA_FIRST_COMPILATION_UNIT_TO_UML_MODEL___MARKER__CREAT_E__COR_R__JAVA_COMP_UNIT_TO_UML_MODEL.equals(eFeature)) {
    		setCREATE__CORR__javaCompUnitToUmlModel((Java2Uml.JavaCompilationUnitToUmlModel)null); 
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
    	if (Java2UmlPackage.Literals.JAVA_FIRST_COMPILATION_UNIT_TO_UML_MODEL___MARKER__CREAT_E__SR_C__COMPILATION_UNIT.equals(eFeature))
    		return getCREATE__SRC__compilationUnit();
    	if (Java2UmlPackage.Literals.JAVA_FIRST_COMPILATION_UNIT_TO_UML_MODEL___MARKER__CONTEX_T__SR_C__JAVA_PACKAGE.equals(eFeature))
    		return getCONTEXT__SRC__javaPackage();
    	if (Java2UmlPackage.Literals.JAVA_FIRST_COMPILATION_UNIT_TO_UML_MODEL___MARKER__CREAT_E__TR_G__BOOLEAN_TYPE.equals(eFeature))
    		return getCREATE__TRG__booleanType();
    	if (Java2UmlPackage.Literals.JAVA_FIRST_COMPILATION_UNIT_TO_UML_MODEL___MARKER__CREAT_E__TR_G__BYTE_TYPE.equals(eFeature))
    		return getCREATE__TRG__byteType();
    	if (Java2UmlPackage.Literals.JAVA_FIRST_COMPILATION_UNIT_TO_UML_MODEL___MARKER__CREAT_E__TR_G__CHAR_TYPE.equals(eFeature))
    		return getCREATE__TRG__charType();
    	if (Java2UmlPackage.Literals.JAVA_FIRST_COMPILATION_UNIT_TO_UML_MODEL___MARKER__CREAT_E__TR_G__DOUBLE_TYPE.equals(eFeature))
    		return getCREATE__TRG__doubleType();
    	if (Java2UmlPackage.Literals.JAVA_FIRST_COMPILATION_UNIT_TO_UML_MODEL___MARKER__CREAT_E__TR_G__FLOAT_TYPE.equals(eFeature))
    		return getCREATE__TRG__floatType();
    	if (Java2UmlPackage.Literals.JAVA_FIRST_COMPILATION_UNIT_TO_UML_MODEL___MARKER__CREAT_E__TR_G__INT_TYPE.equals(eFeature))
    		return getCREATE__TRG__intType();
    	if (Java2UmlPackage.Literals.JAVA_FIRST_COMPILATION_UNIT_TO_UML_MODEL___MARKER__CREAT_E__TR_G__LONG_TYPE.equals(eFeature))
    		return getCREATE__TRG__longType();
    	if (Java2UmlPackage.Literals.JAVA_FIRST_COMPILATION_UNIT_TO_UML_MODEL___MARKER__CREAT_E__TR_G__SHORT_TYPE.equals(eFeature))
    		return getCREATE__TRG__shortType();
    	if (Java2UmlPackage.Literals.JAVA_FIRST_COMPILATION_UNIT_TO_UML_MODEL___MARKER__CREAT_E__TR_G__STRING_TYPE.equals(eFeature))
    		return getCREATE__TRG__stringType();
    	if (Java2UmlPackage.Literals.JAVA_FIRST_COMPILATION_UNIT_TO_UML_MODEL___MARKER__CREAT_E__TR_G__UML_MODEL.equals(eFeature))
    		return getCREATE__TRG__umlModel();
    	if (Java2UmlPackage.Literals.JAVA_FIRST_COMPILATION_UNIT_TO_UML_MODEL___MARKER__CREAT_E__TR_G__VOID_TYPE.equals(eFeature))
    		return getCREATE__TRG__voidType();
    	if (Java2UmlPackage.Literals.JAVA_FIRST_COMPILATION_UNIT_TO_UML_MODEL___MARKER__CREAT_E__COR_R__JAVA_COMP_UNIT_TO_UML_MODEL.equals(eFeature))
    		return getCREATE__CORR__javaCompUnitToUmlModel();
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
