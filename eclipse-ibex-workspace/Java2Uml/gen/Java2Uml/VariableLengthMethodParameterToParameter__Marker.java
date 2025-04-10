package Java2Uml;

import runtime.RuntimePackage;
import Java2Uml.Java2UmlPackage;

import org.emoflon.smartemf.runtime.notification.SmartEMFNotification;
import org.emoflon.smartemf.runtime.SmartObject;
import org.emoflon.smartemf.runtime.collections.*;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public interface VariableLengthMethodParameterToParameter__Marker extends EObject, runtime.TGGRuleApplication {
	
    public runtime.Protocol getProtocol();
    
    public void setProtocol(runtime.Protocol value);
    
    public org.emftext.language.java.members.ClassMethod getCONTEXT__SRC__javaParametrizable();
    
    public void setCONTEXT__SRC__javaParametrizable(org.emftext.language.java.members.ClassMethod value);
    
    public org.emftext.language.java.parameters.VariableLengthParameter getCREATE__SRC__parameter();
    
    public void setCREATE__SRC__parameter(org.emftext.language.java.parameters.VariableLengthParameter value);
    
    public org.eclipse.uml2.uml.Operation getCONTEXT__TRG__umlOperation();
    
    public void setCONTEXT__TRG__umlOperation(org.eclipse.uml2.uml.Operation value);
    
    public org.eclipse.uml2.uml.Parameter getCREATE__TRG__umlParameter();
    
    public void setCREATE__TRG__umlParameter(org.eclipse.uml2.uml.Parameter value);
    
    public org.eclipse.uml2.uml.LiteralUnlimitedNatural getCREATE__TRG__upperValue();
    
    public void setCREATE__TRG__upperValue(org.eclipse.uml2.uml.LiteralUnlimitedNatural value);
    
    public Java2Uml.JavaMethodToOperation getCONTEXT__CORR__javaMethodToOperation();
    
    public void setCONTEXT__CORR__javaMethodToOperation(Java2Uml.JavaMethodToOperation value);
    
    public Java2Uml.JavaParameterToParameter getCREATE__CORR__parameterToParameter();
    
    public void setCREATE__CORR__parameterToParameter(Java2Uml.JavaParameterToParameter value);
    

}
