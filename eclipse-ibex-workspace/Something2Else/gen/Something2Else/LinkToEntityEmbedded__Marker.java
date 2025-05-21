package Something2Else;

import runtime.RuntimePackage;
import Something2Else.Something2ElsePackage;

import org.emoflon.smartemf.runtime.notification.SmartEMFNotification;
import org.emoflon.smartemf.runtime.SmartObject;
import org.emoflon.smartemf.runtime.collections.*;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public interface LinkToEntityEmbedded__Marker extends EObject, runtime.TGGRuleApplication {
	
    public runtime.Protocol getProtocol();
    
    public void setProtocol(runtime.Protocol value);
    
    public tools.vitruv.methodologisttemplate.model.model.Component getCONTEXT__SRC__component();
    
    public void setCONTEXT__SRC__component(tools.vitruv.methodologisttemplate.model.model.Component value);
    
    public tools.vitruv.methodologisttemplate.model.model.Link getCREATE__SRC__link();
    
    public void setCREATE__SRC__link(tools.vitruv.methodologisttemplate.model.model.Link value);
    
    public tools.vitruv.methodologisttemplate.model.model.Protocol getCONTEXT__SRC__protocol();
    
    public void setCONTEXT__SRC__protocol(tools.vitruv.methodologisttemplate.model.model.Protocol value);
    
    public tools.vitruv.methodologisttemplate.model.model.System getCONTEXT__SRC__system();
    
    public void setCONTEXT__SRC__system(tools.vitruv.methodologisttemplate.model.model.System value);
    
    public tools.vitruv.methodologisttemplate.model.model2.Entity getCONTEXT__TRG__compEntity();
    
    public void setCONTEXT__TRG__compEntity(tools.vitruv.methodologisttemplate.model.model2.Entity value);
    
    public tools.vitruv.methodologisttemplate.model.model2.Entity getCREATE__TRG__linkEntity();
    
    public void setCREATE__TRG__linkEntity(tools.vitruv.methodologisttemplate.model.model2.Entity value);
    
    public tools.vitruv.methodologisttemplate.model.model2.Entity getCONTEXT__TRG__protEntity();
    
    public void setCONTEXT__TRG__protEntity(tools.vitruv.methodologisttemplate.model.model2.Entity value);
    
    public tools.vitruv.methodologisttemplate.model.model2.Root getCONTEXT__TRG__root();
    
    public void setCONTEXT__TRG__root(tools.vitruv.methodologisttemplate.model.model2.Root value);
    
    public Something2Else.ComponentToEntity getCONTEXT__CORR__ctoe();
    
    public void setCONTEXT__CORR__ctoe(Something2Else.ComponentToEntity value);
    
    public Something2Else.LinkToEntity getCREATE__CORR__ltoe();
    
    public void setCREATE__CORR__ltoe(Something2Else.LinkToEntity value);
    
    public Something2Else.ProtocolToEntity getCONTEXT__CORR__ptoe();
    
    public void setCONTEXT__CORR__ptoe(Something2Else.ProtocolToEntity value);
    
    public Something2Else.SystemToRoot getCONTEXT__CORR__stor();
    
    public void setCONTEXT__CORR__stor(Something2Else.SystemToRoot value);
    

}
