package Java2Uml.modelgen.hipe.engine.actor;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EObject;

import java.text.DecimalFormat;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.time.Duration;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Consumer;

import akka.actor.AbstractActor;
import akka.actor.ActorRef;
import akka.stream.ActorMaterializer;
import akka.stream.javadsl.*;
import static akka.pattern.Patterns.ask;

import hipe.engine.util.HiPEMultiUtil;
import hipe.engine.util.IncUtil;
import hipe.engine.message.NewInput;
import hipe.engine.message.NoMoreInput;
import hipe.engine.message.input.ObjectAdded;
import hipe.engine.message.input.ObjectDeleted;
import hipe.engine.message.input.ReferenceAdded;
import hipe.engine.message.input.ReferenceDeleted;		
import hipe.engine.message.input.AttributeChanged;
import hipe.engine.message.input.NotificationContainer;

import hipe.generic.actor.junction.util.HiPEConfig;

public class DispatchActor extends AbstractActor {
	
	private int counter = 0;
	public long time = 0;
				
	private Map<String, ActorRef> name2actor;
	
	private Map<Object, Consumer<Object>> type2addConsumer = HiPEMultiUtil.createMap();
	private Map<Object, Consumer<Notification>> feature2setConsumer = HiPEMultiUtil.createMap();
	private Map<Object, Consumer<Notification>> feature2addEdgeConsumer = HiPEMultiUtil.createMap();
	private Map<Object, Consumer<Notification>> feature2removeEdgeConsumer = HiPEMultiUtil.createMap();
	
	private IncUtil incUtil;
	
	private ActorMaterializer materializer;
	
	public DispatchActor(Map<String, ActorRef> name2actor, IncUtil incUtil) {
		this.name2actor = name2actor;
		this.incUtil = incUtil;
		
		initializeAdd();
		initializeSet();
		initializeAddEdge();
		initializeRemoveEdge();
	
		materializer = ActorMaterializer.create(getContext());
	}
	
	private void initializeAdd() {
		type2addConsumer.put(Java2Uml.Java2UmlPackage.eINSTANCE.getJavaClassifierToUmlClassifier(), obj -> {
			Java2Uml.JavaClassifierToUmlClassifier _javaclassifiertoumlclassifier = (Java2Uml.JavaClassifierToUmlClassifier) obj;
			incUtil.newMessage();
			name2actor.get("JavaClassifierToUmlClassifier_object_SP0").tell(new ObjectAdded<Java2Uml.JavaClassifierToUmlClassifier>(incUtil, _javaclassifiertoumlclassifier), getSelf());
			incUtil.newMessage();
			name2actor.get("JavaClassifierToUmlClassifier_object_SP1").tell(new ObjectAdded<Java2Uml.JavaClassifierToUmlClassifier>(incUtil, _javaclassifiertoumlclassifier), getSelf());
			incUtil.newMessage();
			name2actor.get("JavaClassifierToUmlClassifier_object_SP2").tell(new ObjectAdded<Java2Uml.JavaClassifierToUmlClassifier>(incUtil, _javaclassifiertoumlclassifier), getSelf());
			incUtil.newMessage();
			name2actor.get("JavaClassifierToUmlClassifier_object_SP3").tell(new ObjectAdded<Java2Uml.JavaClassifierToUmlClassifier>(incUtil, _javaclassifiertoumlclassifier), getSelf());
			incUtil.newMessage();
			name2actor.get("JavaClassifierToUmlClassifier_object_SP4").tell(new ObjectAdded<Java2Uml.JavaClassifierToUmlClassifier>(incUtil, _javaclassifiertoumlclassifier), getSelf());
			incUtil.newMessage();
			name2actor.get("JavaClassifierToUmlClassifier_object_SP5").tell(new ObjectAdded<Java2Uml.JavaClassifierToUmlClassifier>(incUtil, _javaclassifiertoumlclassifier), getSelf());
			incUtil.newMessage();
			name2actor.get("JavaClassifierToUmlClassifier_object_SP6").tell(new ObjectAdded<Java2Uml.JavaClassifierToUmlClassifier>(incUtil, _javaclassifiertoumlclassifier), getSelf());
			incUtil.newMessage();
			name2actor.get("JavaClassifierToUmlClassifier_object_SP7").tell(new ObjectAdded<Java2Uml.JavaClassifierToUmlClassifier>(incUtil, _javaclassifiertoumlclassifier), getSelf());
		});
		type2addConsumer.put(uml.UmlPackage.eINSTANCE.getBehavior(), obj -> {
			uml.Behavior _behavior = (uml.Behavior) obj;
			incUtil.newMessage();
			name2actor.get("Class_1_object_SP0").tell(new ObjectAdded<uml.Class>(incUtil, _behavior), getSelf());
			incUtil.newMessage();
			name2actor.get("Class_1_object_SP1").tell(new ObjectAdded<uml.Class>(incUtil, _behavior), getSelf());
			incUtil.newMessage();
			name2actor.get("Class_1_object_SP2").tell(new ObjectAdded<uml.Class>(incUtil, _behavior), getSelf());
		});
		type2addConsumer.put(uml.UmlPackage.eINSTANCE.getInterface(), obj -> {
			uml.Interface _interface = (uml.Interface) obj;
			incUtil.newMessage();
			name2actor.get("Interface_1_object_SP0").tell(new ObjectAdded<uml.Interface>(incUtil, _interface), getSelf());
			incUtil.newMessage();
			name2actor.get("Interface_1_object_SP1").tell(new ObjectAdded<uml.Interface>(incUtil, _interface), getSelf());
			incUtil.newMessage();
			name2actor.get("Interface_1_object_SP2").tell(new ObjectAdded<uml.Interface>(incUtil, _interface), getSelf());
		});
		type2addConsumer.put(uml.UmlPackage.eINSTANCE.getProtocolStateMachine(), obj -> {
			uml.ProtocolStateMachine _protocolstatemachine = (uml.ProtocolStateMachine) obj;
			incUtil.newMessage();
			name2actor.get("Class_1_object_SP0").tell(new ObjectAdded<uml.Class>(incUtil, _protocolstatemachine), getSelf());
			incUtil.newMessage();
			name2actor.get("Class_1_object_SP1").tell(new ObjectAdded<uml.Class>(incUtil, _protocolstatemachine), getSelf());
			incUtil.newMessage();
			name2actor.get("Class_1_object_SP2").tell(new ObjectAdded<uml.Class>(incUtil, _protocolstatemachine), getSelf());
		});
		type2addConsumer.put(uml.UmlPackage.eINSTANCE.getFunctionBehavior(), obj -> {
			uml.FunctionBehavior _functionbehavior = (uml.FunctionBehavior) obj;
			incUtil.newMessage();
			name2actor.get("Class_1_object_SP0").tell(new ObjectAdded<uml.Class>(incUtil, _functionbehavior), getSelf());
			incUtil.newMessage();
			name2actor.get("Class_1_object_SP1").tell(new ObjectAdded<uml.Class>(incUtil, _functionbehavior), getSelf());
			incUtil.newMessage();
			name2actor.get("Class_1_object_SP2").tell(new ObjectAdded<uml.Class>(incUtil, _functionbehavior), getSelf());
		});
		type2addConsumer.put(uml.UmlPackage.eINSTANCE.getPort(), obj -> {
			uml.Port _port = (uml.Port) obj;
			incUtil.newMessage();
			name2actor.get("Property_object").tell(new ObjectAdded<uml.Property>(incUtil, _port), getSelf());
		});
		type2addConsumer.put(uml.UmlPackage.eINSTANCE.getExecutionEnvironment(), obj -> {
			uml.ExecutionEnvironment _executionenvironment = (uml.ExecutionEnvironment) obj;
			incUtil.newMessage();
			name2actor.get("Class_1_object_SP0").tell(new ObjectAdded<uml.Class>(incUtil, _executionenvironment), getSelf());
			incUtil.newMessage();
			name2actor.get("Class_1_object_SP1").tell(new ObjectAdded<uml.Class>(incUtil, _executionenvironment), getSelf());
			incUtil.newMessage();
			name2actor.get("Class_1_object_SP2").tell(new ObjectAdded<uml.Class>(incUtil, _executionenvironment), getSelf());
		});
		type2addConsumer.put(org.emftext.language.java.containers.ContainersPackage.eINSTANCE.getPackage(), obj -> {
			org.emftext.language.java.containers.Package _package = (org.emftext.language.java.containers.Package) obj;
			incUtil.newMessage();
			name2actor.get("Package_object_SP0").tell(new ObjectAdded<org.emftext.language.java.containers.Package>(incUtil, _package), getSelf());
			incUtil.newMessage();
			name2actor.get("Package_object_SP1").tell(new ObjectAdded<org.emftext.language.java.containers.Package>(incUtil, _package), getSelf());
		});
		type2addConsumer.put(Java2Uml.Java2UmlPackage.eINSTANCE.getJavaAttributeToUmlProperty(), obj -> {
			Java2Uml.JavaAttributeToUmlProperty _javaattributetoumlproperty = (Java2Uml.JavaAttributeToUmlProperty) obj;
			incUtil.newMessage();
			name2actor.get("JavaAttributeToUmlProperty_object").tell(new ObjectAdded<Java2Uml.JavaAttributeToUmlProperty>(incUtil, _javaattributetoumlproperty), getSelf());
		});
		type2addConsumer.put(uml.UmlPackage.eINSTANCE.getProfile(), obj -> {
			uml.Profile _profile = (uml.Profile) obj;
			incUtil.newMessage();
			name2actor.get("Package_1_object").tell(new ObjectAdded<uml.Package>(incUtil, _profile), getSelf());
		});
		type2addConsumer.put(org.emftext.language.java.parameters.ParametersPackage.eINSTANCE.getVariableLengthParameter(), obj -> {
			org.emftext.language.java.parameters.VariableLengthParameter _variablelengthparameter = (org.emftext.language.java.parameters.VariableLengthParameter) obj;
			incUtil.newMessage();
			name2actor.get("Parameter_1_object").tell(new ObjectAdded<org.emftext.language.java.parameters.Parameter>(incUtil, _variablelengthparameter), getSelf());
		});
		type2addConsumer.put(org.emftext.language.java.members.MembersPackage.eINSTANCE.getConstructor(), obj -> {
			org.emftext.language.java.members.Constructor _constructor = (org.emftext.language.java.members.Constructor) obj;
			incUtil.newMessage();
			name2actor.get("Constructor_object").tell(new ObjectAdded<org.emftext.language.java.members.Constructor>(incUtil, _constructor), getSelf());
		});
		type2addConsumer.put(uml.UmlPackage.eINSTANCE.getInteraction(), obj -> {
			uml.Interaction _interaction = (uml.Interaction) obj;
			incUtil.newMessage();
			name2actor.get("Class_1_object_SP0").tell(new ObjectAdded<uml.Class>(incUtil, _interaction), getSelf());
			incUtil.newMessage();
			name2actor.get("Class_1_object_SP1").tell(new ObjectAdded<uml.Class>(incUtil, _interaction), getSelf());
			incUtil.newMessage();
			name2actor.get("Class_1_object_SP2").tell(new ObjectAdded<uml.Class>(incUtil, _interaction), getSelf());
		});
		type2addConsumer.put(Java2Uml.Java2UmlPackage.eINSTANCE.getJavaParameterToParameter(), obj -> {
			Java2Uml.JavaParameterToParameter _javaparametertoparameter = (Java2Uml.JavaParameterToParameter) obj;
			incUtil.newMessage();
			name2actor.get("JavaParameterToParameter_object").tell(new ObjectAdded<Java2Uml.JavaParameterToParameter>(incUtil, _javaparametertoparameter), getSelf());
		});
		type2addConsumer.put(uml.UmlPackage.eINSTANCE.getClass(), obj -> {
			uml.Class _class = (uml.Class) obj;
			incUtil.newMessage();
			name2actor.get("Class_1_object_SP0").tell(new ObjectAdded<uml.Class>(incUtil, _class), getSelf());
			incUtil.newMessage();
			name2actor.get("Class_1_object_SP1").tell(new ObjectAdded<uml.Class>(incUtil, _class), getSelf());
			incUtil.newMessage();
			name2actor.get("Class_1_object_SP2").tell(new ObjectAdded<uml.Class>(incUtil, _class), getSelf());
		});
		type2addConsumer.put(uml.UmlPackage.eINSTANCE.getOpaqueBehavior(), obj -> {
			uml.OpaqueBehavior _opaquebehavior = (uml.OpaqueBehavior) obj;
			incUtil.newMessage();
			name2actor.get("Class_1_object_SP0").tell(new ObjectAdded<uml.Class>(incUtil, _opaquebehavior), getSelf());
			incUtil.newMessage();
			name2actor.get("Class_1_object_SP1").tell(new ObjectAdded<uml.Class>(incUtil, _opaquebehavior), getSelf());
			incUtil.newMessage();
			name2actor.get("Class_1_object_SP2").tell(new ObjectAdded<uml.Class>(incUtil, _opaquebehavior), getSelf());
		});
		type2addConsumer.put(uml.UmlPackage.eINSTANCE.getModel(), obj -> {
			uml.Model _model = (uml.Model) obj;
			incUtil.newMessage();
			name2actor.get("Model_object").tell(new ObjectAdded<uml.Model>(incUtil, _model), getSelf());
			incUtil.newMessage();
			name2actor.get("Package_1_object").tell(new ObjectAdded<uml.Package>(incUtil, _model), getSelf());
		});
		type2addConsumer.put(uml.UmlPackage.eINSTANCE.getAssociationClass(), obj -> {
			uml.AssociationClass _associationclass = (uml.AssociationClass) obj;
			incUtil.newMessage();
			name2actor.get("Class_1_object_SP0").tell(new ObjectAdded<uml.Class>(incUtil, _associationclass), getSelf());
			incUtil.newMessage();
			name2actor.get("Class_1_object_SP1").tell(new ObjectAdded<uml.Class>(incUtil, _associationclass), getSelf());
			incUtil.newMessage();
			name2actor.get("Class_1_object_SP2").tell(new ObjectAdded<uml.Class>(incUtil, _associationclass), getSelf());
		});
		type2addConsumer.put(org.emftext.language.java.parameters.ParametersPackage.eINSTANCE.getParameter(), obj -> {
			org.emftext.language.java.parameters.Parameter _parameter = (org.emftext.language.java.parameters.Parameter) obj;
			incUtil.newMessage();
			name2actor.get("Parameter_1_object").tell(new ObjectAdded<org.emftext.language.java.parameters.Parameter>(incUtil, _parameter), getSelf());
		});
		type2addConsumer.put(uml.UmlPackage.eINSTANCE.getOperation(), obj -> {
			uml.Operation _operation = (uml.Operation) obj;
			incUtil.newMessage();
			name2actor.get("Operation_object_SP0").tell(new ObjectAdded<uml.Operation>(incUtil, _operation), getSelf());
			incUtil.newMessage();
			name2actor.get("Operation_object_SP1").tell(new ObjectAdded<uml.Operation>(incUtil, _operation), getSelf());
			incUtil.newMessage();
			name2actor.get("Operation_object_SP2").tell(new ObjectAdded<uml.Operation>(incUtil, _operation), getSelf());
		});
		type2addConsumer.put(uml.UmlPackage.eINSTANCE.getDevice(), obj -> {
			uml.Device _device = (uml.Device) obj;
			incUtil.newMessage();
			name2actor.get("Class_1_object_SP0").tell(new ObjectAdded<uml.Class>(incUtil, _device), getSelf());
			incUtil.newMessage();
			name2actor.get("Class_1_object_SP1").tell(new ObjectAdded<uml.Class>(incUtil, _device), getSelf());
			incUtil.newMessage();
			name2actor.get("Class_1_object_SP2").tell(new ObjectAdded<uml.Class>(incUtil, _device), getSelf());
		});
		type2addConsumer.put(org.emftext.language.java.parameters.ParametersPackage.eINSTANCE.getOrdinaryParameter(), obj -> {
			org.emftext.language.java.parameters.OrdinaryParameter _ordinaryparameter = (org.emftext.language.java.parameters.OrdinaryParameter) obj;
			incUtil.newMessage();
			name2actor.get("Parameter_1_object").tell(new ObjectAdded<org.emftext.language.java.parameters.Parameter>(incUtil, _ordinaryparameter), getSelf());
		});
		type2addConsumer.put(uml.UmlPackage.eINSTANCE.getActivity(), obj -> {
			uml.Activity _activity = (uml.Activity) obj;
			incUtil.newMessage();
			name2actor.get("Class_1_object_SP0").tell(new ObjectAdded<uml.Class>(incUtil, _activity), getSelf());
			incUtil.newMessage();
			name2actor.get("Class_1_object_SP1").tell(new ObjectAdded<uml.Class>(incUtil, _activity), getSelf());
			incUtil.newMessage();
			name2actor.get("Class_1_object_SP2").tell(new ObjectAdded<uml.Class>(incUtil, _activity), getSelf());
		});
		type2addConsumer.put(Java2Uml.Java2UmlPackage.eINSTANCE.getJavaMethodToOperation(), obj -> {
			Java2Uml.JavaMethodToOperation _javamethodtooperation = (Java2Uml.JavaMethodToOperation) obj;
			incUtil.newMessage();
			name2actor.get("JavaMethodToOperation_object_SP0").tell(new ObjectAdded<Java2Uml.JavaMethodToOperation>(incUtil, _javamethodtooperation), getSelf());
			incUtil.newMessage();
			name2actor.get("JavaMethodToOperation_object_SP1").tell(new ObjectAdded<Java2Uml.JavaMethodToOperation>(incUtil, _javamethodtooperation), getSelf());
		});
		type2addConsumer.put(uml.UmlPackage.eINSTANCE.getNode(), obj -> {
			uml.Node _node = (uml.Node) obj;
			incUtil.newMessage();
			name2actor.get("Class_1_object_SP0").tell(new ObjectAdded<uml.Class>(incUtil, _node), getSelf());
			incUtil.newMessage();
			name2actor.get("Class_1_object_SP1").tell(new ObjectAdded<uml.Class>(incUtil, _node), getSelf());
			incUtil.newMessage();
			name2actor.get("Class_1_object_SP2").tell(new ObjectAdded<uml.Class>(incUtil, _node), getSelf());
		});
		type2addConsumer.put(org.emftext.language.java.classifiers.ClassifiersPackage.eINSTANCE.getEnumeration(), obj -> {
			org.emftext.language.java.classifiers.Enumeration _enumeration = (org.emftext.language.java.classifiers.Enumeration) obj;
			incUtil.newMessage();
			name2actor.get("Enumeration_object_SP0").tell(new ObjectAdded<org.emftext.language.java.classifiers.Enumeration>(incUtil, _enumeration), getSelf());
			incUtil.newMessage();
			name2actor.get("Enumeration_object_SP1").tell(new ObjectAdded<org.emftext.language.java.classifiers.Enumeration>(incUtil, _enumeration), getSelf());
		});
		type2addConsumer.put(Java2Uml.Java2UmlPackage.eINSTANCE.getJavaConstructorToOperation(), obj -> {
			Java2Uml.JavaConstructorToOperation _javaconstructortooperation = (Java2Uml.JavaConstructorToOperation) obj;
			incUtil.newMessage();
			name2actor.get("JavaConstructorToOperation_object").tell(new ObjectAdded<Java2Uml.JavaConstructorToOperation>(incUtil, _javaconstructortooperation), getSelf());
		});
		type2addConsumer.put(org.emftext.language.java.members.MembersPackage.eINSTANCE.getField(), obj -> {
			org.emftext.language.java.members.Field _field = (org.emftext.language.java.members.Field) obj;
			incUtil.newMessage();
			name2actor.get("Field_object").tell(new ObjectAdded<org.emftext.language.java.members.Field>(incUtil, _field), getSelf());
		});
		type2addConsumer.put(uml.UmlPackage.eINSTANCE.getStateMachine(), obj -> {
			uml.StateMachine _statemachine = (uml.StateMachine) obj;
			incUtil.newMessage();
			name2actor.get("Class_1_object_SP0").tell(new ObjectAdded<uml.Class>(incUtil, _statemachine), getSelf());
			incUtil.newMessage();
			name2actor.get("Class_1_object_SP1").tell(new ObjectAdded<uml.Class>(incUtil, _statemachine), getSelf());
			incUtil.newMessage();
			name2actor.get("Class_1_object_SP2").tell(new ObjectAdded<uml.Class>(incUtil, _statemachine), getSelf());
		});
		type2addConsumer.put(Java2Uml.Java2UmlPackage.eINSTANCE.getJavaPackageToUmlPackage(), obj -> {
			Java2Uml.JavaPackageToUmlPackage _javapackagetoumlpackage = (Java2Uml.JavaPackageToUmlPackage) obj;
			incUtil.newMessage();
			name2actor.get("JavaPackageToUmlPackage_object").tell(new ObjectAdded<Java2Uml.JavaPackageToUmlPackage>(incUtil, _javapackagetoumlpackage), getSelf());
		});
		type2addConsumer.put(uml.UmlPackage.eINSTANCE.getPackage(), obj -> {
			uml.Package _package = (uml.Package) obj;
			incUtil.newMessage();
			name2actor.get("Package_1_object").tell(new ObjectAdded<uml.Package>(incUtil, _package), getSelf());
		});
		type2addConsumer.put(uml.UmlPackage.eINSTANCE.getStereotype(), obj -> {
			uml.Stereotype _stereotype = (uml.Stereotype) obj;
			incUtil.newMessage();
			name2actor.get("Class_1_object_SP0").tell(new ObjectAdded<uml.Class>(incUtil, _stereotype), getSelf());
			incUtil.newMessage();
			name2actor.get("Class_1_object_SP1").tell(new ObjectAdded<uml.Class>(incUtil, _stereotype), getSelf());
			incUtil.newMessage();
			name2actor.get("Class_1_object_SP2").tell(new ObjectAdded<uml.Class>(incUtil, _stereotype), getSelf());
		});
		type2addConsumer.put(uml.UmlPackage.eINSTANCE.getComponent(), obj -> {
			uml.Component _component = (uml.Component) obj;
			incUtil.newMessage();
			name2actor.get("Class_1_object_SP0").tell(new ObjectAdded<uml.Class>(incUtil, _component), getSelf());
			incUtil.newMessage();
			name2actor.get("Class_1_object_SP1").tell(new ObjectAdded<uml.Class>(incUtil, _component), getSelf());
			incUtil.newMessage();
			name2actor.get("Class_1_object_SP2").tell(new ObjectAdded<uml.Class>(incUtil, _component), getSelf());
		});
		type2addConsumer.put(uml.UmlPackage.eINSTANCE.getProperty(), obj -> {
			uml.Property _property = (uml.Property) obj;
			incUtil.newMessage();
			name2actor.get("Property_object").tell(new ObjectAdded<uml.Property>(incUtil, _property), getSelf());
		});
		type2addConsumer.put(uml.UmlPackage.eINSTANCE.getParameter(), obj -> {
			uml.Parameter _parameter = (uml.Parameter) obj;
			incUtil.newMessage();
			name2actor.get("Parameter_object").tell(new ObjectAdded<uml.Parameter>(incUtil, _parameter), getSelf());
		});
		type2addConsumer.put(Java2Uml.Java2UmlPackage.eINSTANCE.getJavaCompilationUnitToUmlModel(), obj -> {
			Java2Uml.JavaCompilationUnitToUmlModel _javacompilationunittoumlmodel = (Java2Uml.JavaCompilationUnitToUmlModel) obj;
			incUtil.newMessage();
			name2actor.get("JavaCompilationUnitToUmlModel_object").tell(new ObjectAdded<Java2Uml.JavaCompilationUnitToUmlModel>(incUtil, _javacompilationunittoumlmodel), getSelf());
		});
		type2addConsumer.put(org.emftext.language.java.containers.ContainersPackage.eINSTANCE.getCompilationUnit(), obj -> {
			org.emftext.language.java.containers.CompilationUnit _compilationunit = (org.emftext.language.java.containers.CompilationUnit) obj;
			incUtil.newMessage();
			name2actor.get("CompilationUnit_object").tell(new ObjectAdded<org.emftext.language.java.containers.CompilationUnit>(incUtil, _compilationunit), getSelf());
		});
		type2addConsumer.put(org.emftext.language.java.classifiers.ClassifiersPackage.eINSTANCE.getClass(), obj -> {
			org.emftext.language.java.classifiers.Class _class = (org.emftext.language.java.classifiers.Class) obj;
			incUtil.newMessage();
			name2actor.get("Class_object_SP0").tell(new ObjectAdded<org.emftext.language.java.classifiers.Class>(incUtil, _class), getSelf());
			incUtil.newMessage();
			name2actor.get("Class_object_SP1").tell(new ObjectAdded<org.emftext.language.java.classifiers.Class>(incUtil, _class), getSelf());
			incUtil.newMessage();
			name2actor.get("Class_object_SP2").tell(new ObjectAdded<org.emftext.language.java.classifiers.Class>(incUtil, _class), getSelf());
		});
		type2addConsumer.put(uml.UmlPackage.eINSTANCE.getExtensionEnd(), obj -> {
			uml.ExtensionEnd _extensionend = (uml.ExtensionEnd) obj;
			incUtil.newMessage();
			name2actor.get("Property_object").tell(new ObjectAdded<uml.Property>(incUtil, _extensionend), getSelf());
		});
		type2addConsumer.put(org.emftext.language.java.classifiers.ClassifiersPackage.eINSTANCE.getInterface(), obj -> {
			org.emftext.language.java.classifiers.Interface _interface = (org.emftext.language.java.classifiers.Interface) obj;
			incUtil.newMessage();
			name2actor.get("Interface_object_SP0").tell(new ObjectAdded<org.emftext.language.java.classifiers.Interface>(incUtil, _interface), getSelf());
			incUtil.newMessage();
			name2actor.get("Interface_object_SP1").tell(new ObjectAdded<org.emftext.language.java.classifiers.Interface>(incUtil, _interface), getSelf());
			incUtil.newMessage();
			name2actor.get("Interface_object_SP2").tell(new ObjectAdded<org.emftext.language.java.classifiers.Interface>(incUtil, _interface), getSelf());
		});
		type2addConsumer.put(org.emftext.language.java.members.MembersPackage.eINSTANCE.getClassMethod(), obj -> {
			org.emftext.language.java.members.ClassMethod _classmethod = (org.emftext.language.java.members.ClassMethod) obj;
			incUtil.newMessage();
			name2actor.get("ClassMethod_object_SP0").tell(new ObjectAdded<org.emftext.language.java.members.ClassMethod>(incUtil, _classmethod), getSelf());
			incUtil.newMessage();
			name2actor.get("ClassMethod_object_SP1").tell(new ObjectAdded<org.emftext.language.java.members.ClassMethod>(incUtil, _classmethod), getSelf());
		});
		type2addConsumer.put(uml.UmlPackage.eINSTANCE.getEnumeration(), obj -> {
			uml.Enumeration _enumeration = (uml.Enumeration) obj;
			incUtil.newMessage();
			name2actor.get("Enumeration_1_object_SP0").tell(new ObjectAdded<uml.Enumeration>(incUtil, _enumeration), getSelf());
			incUtil.newMessage();
			name2actor.get("Enumeration_1_object_SP1").tell(new ObjectAdded<uml.Enumeration>(incUtil, _enumeration), getSelf());
		});
	}
	
	private void initializeSet() {
		feature2setConsumer.put(uml.UmlPackage.eINSTANCE.getStructuralFeature_IsReadOnly(), notification -> {
			if(notification.getNotifier() instanceof uml.Property) {
				incUtil.newMessage();
				name2actor.get("Property_object").tell(new AttributeChanged<uml.StructuralFeature>(incUtil, (uml.StructuralFeature) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
		});
		
		feature2setConsumer.put(uml.UmlPackage.eINSTANCE.getRedefinableElement_IsLeaf(), notification -> {
			if(notification.getNotifier() instanceof uml.Class) {
				incUtil.newMessage();
				name2actor.get("Class_1_object_SP0").tell(new AttributeChanged<uml.RedefinableElement>(incUtil, (uml.RedefinableElement) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof uml.Operation) {
				incUtil.newMessage();
				name2actor.get("Operation_object_SP0").tell(new AttributeChanged<uml.RedefinableElement>(incUtil, (uml.RedefinableElement) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof uml.Interface) {
				incUtil.newMessage();
				name2actor.get("Interface_1_object_SP0").tell(new AttributeChanged<uml.RedefinableElement>(incUtil, (uml.RedefinableElement) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof uml.Operation) {
				incUtil.newMessage();
				name2actor.get("Operation_object_SP1").tell(new AttributeChanged<uml.RedefinableElement>(incUtil, (uml.RedefinableElement) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof uml.Operation) {
				incUtil.newMessage();
				name2actor.get("Operation_object_SP2").tell(new AttributeChanged<uml.RedefinableElement>(incUtil, (uml.RedefinableElement) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof uml.Interface) {
				incUtil.newMessage();
				name2actor.get("Interface_1_object_SP1").tell(new AttributeChanged<uml.RedefinableElement>(incUtil, (uml.RedefinableElement) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof uml.Property) {
				incUtil.newMessage();
				name2actor.get("Property_object").tell(new AttributeChanged<uml.RedefinableElement>(incUtil, (uml.RedefinableElement) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof uml.Interface) {
				incUtil.newMessage();
				name2actor.get("Interface_1_object_SP2").tell(new AttributeChanged<uml.RedefinableElement>(incUtil, (uml.RedefinableElement) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof uml.Class) {
				incUtil.newMessage();
				name2actor.get("Class_1_object_SP1").tell(new AttributeChanged<uml.RedefinableElement>(incUtil, (uml.RedefinableElement) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof uml.Enumeration) {
				incUtil.newMessage();
				name2actor.get("Enumeration_1_object_SP0").tell(new AttributeChanged<uml.RedefinableElement>(incUtil, (uml.RedefinableElement) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof uml.Enumeration) {
				incUtil.newMessage();
				name2actor.get("Enumeration_1_object_SP1").tell(new AttributeChanged<uml.RedefinableElement>(incUtil, (uml.RedefinableElement) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof uml.Class) {
				incUtil.newMessage();
				name2actor.get("Class_1_object_SP2").tell(new AttributeChanged<uml.RedefinableElement>(incUtil, (uml.RedefinableElement) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
		});
		
		feature2setConsumer.put(uml.UmlPackage.eINSTANCE.getClassifier_IsAbstract(), notification -> {
			if(notification.getNotifier() instanceof uml.Class) {
				incUtil.newMessage();
				name2actor.get("Class_1_object_SP0").tell(new AttributeChanged<uml.Classifier>(incUtil, (uml.Classifier) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof uml.Interface) {
				incUtil.newMessage();
				name2actor.get("Interface_1_object_SP0").tell(new AttributeChanged<uml.Classifier>(incUtil, (uml.Classifier) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof uml.Interface) {
				incUtil.newMessage();
				name2actor.get("Interface_1_object_SP1").tell(new AttributeChanged<uml.Classifier>(incUtil, (uml.Classifier) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof uml.Interface) {
				incUtil.newMessage();
				name2actor.get("Interface_1_object_SP2").tell(new AttributeChanged<uml.Classifier>(incUtil, (uml.Classifier) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof uml.Class) {
				incUtil.newMessage();
				name2actor.get("Class_1_object_SP1").tell(new AttributeChanged<uml.Classifier>(incUtil, (uml.Classifier) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof uml.Enumeration) {
				incUtil.newMessage();
				name2actor.get("Enumeration_1_object_SP0").tell(new AttributeChanged<uml.Classifier>(incUtil, (uml.Classifier) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof uml.Enumeration) {
				incUtil.newMessage();
				name2actor.get("Enumeration_1_object_SP1").tell(new AttributeChanged<uml.Classifier>(incUtil, (uml.Classifier) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof uml.Class) {
				incUtil.newMessage();
				name2actor.get("Class_1_object_SP2").tell(new AttributeChanged<uml.Classifier>(incUtil, (uml.Classifier) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
		});
		
		feature2setConsumer.put(org.emftext.language.java.commons.CommonsPackage.eINSTANCE.getNamedElement_Name(), notification -> {
			if(notification.getNotifier() instanceof org.emftext.language.java.members.Field) {
				incUtil.newMessage();
				name2actor.get("Field_object").tell(new AttributeChanged<org.emftext.language.java.commons.NamedElement>(incUtil, (org.emftext.language.java.commons.NamedElement) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof org.emftext.language.java.members.ClassMethod) {
				incUtil.newMessage();
				name2actor.get("ClassMethod_object_SP0").tell(new AttributeChanged<org.emftext.language.java.commons.NamedElement>(incUtil, (org.emftext.language.java.commons.NamedElement) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof org.emftext.language.java.parameters.Parameter) {
				incUtil.newMessage();
				name2actor.get("Parameter_1_object").tell(new AttributeChanged<org.emftext.language.java.commons.NamedElement>(incUtil, (org.emftext.language.java.commons.NamedElement) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof org.emftext.language.java.members.ClassMethod) {
				incUtil.newMessage();
				name2actor.get("ClassMethod_object_SP1").tell(new AttributeChanged<org.emftext.language.java.commons.NamedElement>(incUtil, (org.emftext.language.java.commons.NamedElement) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof org.emftext.language.java.classifiers.Enumeration) {
				incUtil.newMessage();
				name2actor.get("Enumeration_object_SP1").tell(new AttributeChanged<org.emftext.language.java.commons.NamedElement>(incUtil, (org.emftext.language.java.commons.NamedElement) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof org.emftext.language.java.classifiers.Interface) {
				incUtil.newMessage();
				name2actor.get("Interface_object_SP2").tell(new AttributeChanged<org.emftext.language.java.commons.NamedElement>(incUtil, (org.emftext.language.java.commons.NamedElement) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof org.emftext.language.java.containers.Package) {
				incUtil.newMessage();
				name2actor.get("Package_object_SP1").tell(new AttributeChanged<org.emftext.language.java.commons.NamedElement>(incUtil, (org.emftext.language.java.commons.NamedElement) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof org.emftext.language.java.classifiers.Interface) {
				incUtil.newMessage();
				name2actor.get("Interface_object_SP0").tell(new AttributeChanged<org.emftext.language.java.commons.NamedElement>(incUtil, (org.emftext.language.java.commons.NamedElement) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof org.emftext.language.java.classifiers.Class) {
				incUtil.newMessage();
				name2actor.get("Class_object_SP0").tell(new AttributeChanged<org.emftext.language.java.commons.NamedElement>(incUtil, (org.emftext.language.java.commons.NamedElement) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof org.emftext.language.java.classifiers.Class) {
				incUtil.newMessage();
				name2actor.get("Class_object_SP2").tell(new AttributeChanged<org.emftext.language.java.commons.NamedElement>(incUtil, (org.emftext.language.java.commons.NamedElement) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof org.emftext.language.java.classifiers.Class) {
				incUtil.newMessage();
				name2actor.get("Class_object_SP1").tell(new AttributeChanged<org.emftext.language.java.commons.NamedElement>(incUtil, (org.emftext.language.java.commons.NamedElement) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof org.emftext.language.java.containers.CompilationUnit) {
				incUtil.newMessage();
				name2actor.get("CompilationUnit_object").tell(new AttributeChanged<org.emftext.language.java.commons.NamedElement>(incUtil, (org.emftext.language.java.commons.NamedElement) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof org.emftext.language.java.containers.Package) {
				incUtil.newMessage();
				name2actor.get("Package_object_SP0").tell(new AttributeChanged<org.emftext.language.java.commons.NamedElement>(incUtil, (org.emftext.language.java.commons.NamedElement) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof org.emftext.language.java.members.Constructor) {
				incUtil.newMessage();
				name2actor.get("Constructor_object").tell(new AttributeChanged<org.emftext.language.java.commons.NamedElement>(incUtil, (org.emftext.language.java.commons.NamedElement) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof org.emftext.language.java.classifiers.Interface) {
				incUtil.newMessage();
				name2actor.get("Interface_object_SP1").tell(new AttributeChanged<org.emftext.language.java.commons.NamedElement>(incUtil, (org.emftext.language.java.commons.NamedElement) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof org.emftext.language.java.classifiers.Enumeration) {
				incUtil.newMessage();
				name2actor.get("Enumeration_object_SP0").tell(new AttributeChanged<org.emftext.language.java.commons.NamedElement>(incUtil, (org.emftext.language.java.commons.NamedElement) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
		});
		
		feature2setConsumer.put(uml.UmlPackage.eINSTANCE.getBehavioralFeature_IsAbstract(), notification -> {
			if(notification.getNotifier() instanceof uml.Operation) {
				incUtil.newMessage();
				name2actor.get("Operation_object_SP0").tell(new AttributeChanged<uml.BehavioralFeature>(incUtil, (uml.BehavioralFeature) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof uml.Operation) {
				incUtil.newMessage();
				name2actor.get("Operation_object_SP1").tell(new AttributeChanged<uml.BehavioralFeature>(incUtil, (uml.BehavioralFeature) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof uml.Operation) {
				incUtil.newMessage();
				name2actor.get("Operation_object_SP2").tell(new AttributeChanged<uml.BehavioralFeature>(incUtil, (uml.BehavioralFeature) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
		});
		
		feature2setConsumer.put(uml.UmlPackage.eINSTANCE.getClassifier_IsFinalSpecialization(), notification -> {
			if(notification.getNotifier() instanceof uml.Class) {
				incUtil.newMessage();
				name2actor.get("Class_1_object_SP0").tell(new AttributeChanged<uml.Classifier>(incUtil, (uml.Classifier) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof uml.Interface) {
				incUtil.newMessage();
				name2actor.get("Interface_1_object_SP0").tell(new AttributeChanged<uml.Classifier>(incUtil, (uml.Classifier) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof uml.Interface) {
				incUtil.newMessage();
				name2actor.get("Interface_1_object_SP1").tell(new AttributeChanged<uml.Classifier>(incUtil, (uml.Classifier) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof uml.Interface) {
				incUtil.newMessage();
				name2actor.get("Interface_1_object_SP2").tell(new AttributeChanged<uml.Classifier>(incUtil, (uml.Classifier) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof uml.Class) {
				incUtil.newMessage();
				name2actor.get("Class_1_object_SP1").tell(new AttributeChanged<uml.Classifier>(incUtil, (uml.Classifier) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof uml.Enumeration) {
				incUtil.newMessage();
				name2actor.get("Enumeration_1_object_SP0").tell(new AttributeChanged<uml.Classifier>(incUtil, (uml.Classifier) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof uml.Enumeration) {
				incUtil.newMessage();
				name2actor.get("Enumeration_1_object_SP1").tell(new AttributeChanged<uml.Classifier>(incUtil, (uml.Classifier) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof uml.Class) {
				incUtil.newMessage();
				name2actor.get("Class_1_object_SP2").tell(new AttributeChanged<uml.Classifier>(incUtil, (uml.Classifier) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
		});
		
		feature2setConsumer.put(uml.UmlPackage.eINSTANCE.getNamedElement_Name(), notification -> {
			if(notification.getNotifier() instanceof uml.Class) {
				incUtil.newMessage();
				name2actor.get("Class_1_object_SP0").tell(new AttributeChanged<uml.NamedElement>(incUtil, (uml.NamedElement) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof uml.Operation) {
				incUtil.newMessage();
				name2actor.get("Operation_object_SP0").tell(new AttributeChanged<uml.NamedElement>(incUtil, (uml.NamedElement) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof uml.Interface) {
				incUtil.newMessage();
				name2actor.get("Interface_1_object_SP0").tell(new AttributeChanged<uml.NamedElement>(incUtil, (uml.NamedElement) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof uml.Operation) {
				incUtil.newMessage();
				name2actor.get("Operation_object_SP1").tell(new AttributeChanged<uml.NamedElement>(incUtil, (uml.NamedElement) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof uml.Operation) {
				incUtil.newMessage();
				name2actor.get("Operation_object_SP2").tell(new AttributeChanged<uml.NamedElement>(incUtil, (uml.NamedElement) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof uml.Interface) {
				incUtil.newMessage();
				name2actor.get("Interface_1_object_SP1").tell(new AttributeChanged<uml.NamedElement>(incUtil, (uml.NamedElement) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof uml.Property) {
				incUtil.newMessage();
				name2actor.get("Property_object").tell(new AttributeChanged<uml.NamedElement>(incUtil, (uml.NamedElement) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof uml.Interface) {
				incUtil.newMessage();
				name2actor.get("Interface_1_object_SP2").tell(new AttributeChanged<uml.NamedElement>(incUtil, (uml.NamedElement) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof uml.Enumeration) {
				incUtil.newMessage();
				name2actor.get("Enumeration_1_object_SP1").tell(new AttributeChanged<uml.NamedElement>(incUtil, (uml.NamedElement) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof uml.Package) {
				incUtil.newMessage();
				name2actor.get("Package_1_object").tell(new AttributeChanged<uml.NamedElement>(incUtil, (uml.NamedElement) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof uml.Model) {
				incUtil.newMessage();
				name2actor.get("Model_object").tell(new AttributeChanged<uml.NamedElement>(incUtil, (uml.NamedElement) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof uml.Class) {
				incUtil.newMessage();
				name2actor.get("Class_1_object_SP1").tell(new AttributeChanged<uml.NamedElement>(incUtil, (uml.NamedElement) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof uml.Enumeration) {
				incUtil.newMessage();
				name2actor.get("Enumeration_1_object_SP0").tell(new AttributeChanged<uml.NamedElement>(incUtil, (uml.NamedElement) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof uml.Parameter) {
				incUtil.newMessage();
				name2actor.get("Parameter_object").tell(new AttributeChanged<uml.NamedElement>(incUtil, (uml.NamedElement) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof uml.Class) {
				incUtil.newMessage();
				name2actor.get("Class_1_object_SP2").tell(new AttributeChanged<uml.NamedElement>(incUtil, (uml.NamedElement) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
		});
		
		feature2setConsumer.put(uml.UmlPackage.eINSTANCE.getNamedElement_Visibility(), notification -> {
			if(notification.getNotifier() instanceof uml.Class) {
				incUtil.newMessage();
				name2actor.get("Class_1_object_SP0").tell(new AttributeChanged<uml.NamedElement>(incUtil, (uml.NamedElement) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof uml.Operation) {
				incUtil.newMessage();
				name2actor.get("Operation_object_SP0").tell(new AttributeChanged<uml.NamedElement>(incUtil, (uml.NamedElement) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof uml.Interface) {
				incUtil.newMessage();
				name2actor.get("Interface_1_object_SP0").tell(new AttributeChanged<uml.NamedElement>(incUtil, (uml.NamedElement) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof uml.Operation) {
				incUtil.newMessage();
				name2actor.get("Operation_object_SP1").tell(new AttributeChanged<uml.NamedElement>(incUtil, (uml.NamedElement) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof uml.Operation) {
				incUtil.newMessage();
				name2actor.get("Operation_object_SP2").tell(new AttributeChanged<uml.NamedElement>(incUtil, (uml.NamedElement) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof uml.Interface) {
				incUtil.newMessage();
				name2actor.get("Interface_1_object_SP1").tell(new AttributeChanged<uml.NamedElement>(incUtil, (uml.NamedElement) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof uml.Property) {
				incUtil.newMessage();
				name2actor.get("Property_object").tell(new AttributeChanged<uml.NamedElement>(incUtil, (uml.NamedElement) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof uml.Interface) {
				incUtil.newMessage();
				name2actor.get("Interface_1_object_SP2").tell(new AttributeChanged<uml.NamedElement>(incUtil, (uml.NamedElement) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof uml.Enumeration) {
				incUtil.newMessage();
				name2actor.get("Enumeration_1_object_SP1").tell(new AttributeChanged<uml.NamedElement>(incUtil, (uml.NamedElement) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof uml.Package) {
				incUtil.newMessage();
				name2actor.get("Package_1_object").tell(new AttributeChanged<uml.NamedElement>(incUtil, (uml.NamedElement) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof uml.Model) {
				incUtil.newMessage();
				name2actor.get("Model_object").tell(new AttributeChanged<uml.NamedElement>(incUtil, (uml.NamedElement) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof uml.Class) {
				incUtil.newMessage();
				name2actor.get("Class_1_object_SP1").tell(new AttributeChanged<uml.NamedElement>(incUtil, (uml.NamedElement) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof uml.Enumeration) {
				incUtil.newMessage();
				name2actor.get("Enumeration_1_object_SP0").tell(new AttributeChanged<uml.NamedElement>(incUtil, (uml.NamedElement) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof uml.Parameter) {
				incUtil.newMessage();
				name2actor.get("Parameter_object").tell(new AttributeChanged<uml.NamedElement>(incUtil, (uml.NamedElement) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof uml.Class) {
				incUtil.newMessage();
				name2actor.get("Class_1_object_SP2").tell(new AttributeChanged<uml.NamedElement>(incUtil, (uml.NamedElement) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
		});
		
		feature2setConsumer.put(uml.UmlPackage.eINSTANCE.getFeature_IsStatic(), notification -> {
			if(notification.getNotifier() instanceof uml.Operation) {
				incUtil.newMessage();
				name2actor.get("Operation_object_SP0").tell(new AttributeChanged<uml.Feature>(incUtil, (uml.Feature) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof uml.Operation) {
				incUtil.newMessage();
				name2actor.get("Operation_object_SP1").tell(new AttributeChanged<uml.Feature>(incUtil, (uml.Feature) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof uml.Operation) {
				incUtil.newMessage();
				name2actor.get("Operation_object_SP2").tell(new AttributeChanged<uml.Feature>(incUtil, (uml.Feature) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof uml.Property) {
				incUtil.newMessage();
				name2actor.get("Property_object").tell(new AttributeChanged<uml.Feature>(incUtil, (uml.Feature) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
		});
		
	}
	
	private void initializeAddEdge() {
		feature2addEdgeConsumer.put(Java2Uml.Java2UmlPackage.eINSTANCE.getJavaPackageToUmlPackage_Target(), notification -> {
			incUtil.newMessage();
			name2actor.get("ClassToUmlClass__GEN_50_localSearch").tell(new ReferenceAdded<Java2Uml.JavaPackageToUmlPackage, uml.Package>(incUtil,(Java2Uml.JavaPackageToUmlPackage) notification.getNotifier(), (uml.Package) notification.getNewValue(), "Java2Uml.JavaPackageToUmlPackage_target_Package"), getSelf());
			incUtil.newMessage();
			name2actor.get("EnumToUmlEnum__GEN_168_localSearch").tell(new ReferenceAdded<Java2Uml.JavaPackageToUmlPackage, uml.Package>(incUtil,(Java2Uml.JavaPackageToUmlPackage) notification.getNotifier(), (uml.Package) notification.getNewValue(), "Java2Uml.JavaPackageToUmlPackage_target_Package"), getSelf());
			incUtil.newMessage();
			name2actor.get("InterfaceToUmlInterface__GEN_261_localSearch").tell(new ReferenceAdded<Java2Uml.JavaPackageToUmlPackage, uml.Package>(incUtil,(Java2Uml.JavaPackageToUmlPackage) notification.getNotifier(), (uml.Package) notification.getNewValue(), "Java2Uml.JavaPackageToUmlPackage_target_Package"), getSelf());
		});
		feature2addEdgeConsumer.put(Java2Uml.Java2UmlPackage.eINSTANCE.getJavaAttributeToUmlProperty_Target(), notification -> {
			incUtil.newMessage();
			name2actor.get("JavaAttributeToUmlProperty_target_0_reference").tell(new ReferenceAdded<Java2Uml.JavaAttributeToUmlProperty, uml.Property>(incUtil,(Java2Uml.JavaAttributeToUmlProperty) notification.getNotifier(), (uml.Property) notification.getNewValue(), "Java2Uml.JavaAttributeToUmlProperty_target_Property"), getSelf());
			incUtil.newMessage();
			name2actor.get("FieldFinalToFinal__GEN_212_localSearch").tell(new ReferenceAdded<Java2Uml.JavaAttributeToUmlProperty, uml.Property>(incUtil,(Java2Uml.JavaAttributeToUmlProperty) notification.getNotifier(), (uml.Property) notification.getNewValue(), "Java2Uml.JavaAttributeToUmlProperty_target_Property"), getSelf());
			incUtil.newMessage();
			name2actor.get("FieldStaticToStatic__GEN_216_localSearch").tell(new ReferenceAdded<Java2Uml.JavaAttributeToUmlProperty, uml.Property>(incUtil,(Java2Uml.JavaAttributeToUmlProperty) notification.getNotifier(), (uml.Property) notification.getNewValue(), "Java2Uml.JavaAttributeToUmlProperty_target_Property"), getSelf());
		});
		feature2addEdgeConsumer.put(Java2Uml.Java2UmlPackage.eINSTANCE.getJavaClassifierToUmlClassifier_Target(), notification -> {
			incUtil.newMessage();
			name2actor.get("JavaClassifierToUmlClassifier_target_0_reference").tell(new ReferenceAdded<Java2Uml.JavaClassifierToUmlClassifier, uml.Classifier>(incUtil,(Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (uml.Classifier) notification.getNewValue(), "Java2Uml.JavaClassifierToUmlClassifier_target_Classifier"), getSelf());
			incUtil.newMessage();
			name2actor.get("JavaClassifierToUmlClassifier_target_1_reference").tell(new ReferenceAdded<Java2Uml.JavaClassifierToUmlClassifier, uml.Classifier>(incUtil,(Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (uml.Classifier) notification.getNewValue(), "Java2Uml.JavaClassifierToUmlClassifier_target_Classifier"), getSelf());
			incUtil.newMessage();
			name2actor.get("JavaClassifierToUmlClassifier_target_2_reference").tell(new ReferenceAdded<Java2Uml.JavaClassifierToUmlClassifier, uml.Classifier>(incUtil,(Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (uml.Classifier) notification.getNewValue(), "Java2Uml.JavaClassifierToUmlClassifier_target_Classifier"), getSelf());
			incUtil.newMessage();
			name2actor.get("ClassAbstractToAbstract__GEN_1_localSearch").tell(new ReferenceAdded<Java2Uml.JavaClassifierToUmlClassifier, uml.Classifier>(incUtil,(Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (uml.Classifier) notification.getNewValue(), "Java2Uml.JavaClassifierToUmlClassifier_target_Classifier"), getSelf());
			incUtil.newMessage();
			name2actor.get("ClassAttributeToProperty__GEN_5_localSearch").tell(new ReferenceAdded<Java2Uml.JavaClassifierToUmlClassifier, uml.Classifier>(incUtil,(Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (uml.Classifier) notification.getNewValue(), "Java2Uml.JavaClassifierToUmlClassifier_target_Classifier"), getSelf());
			incUtil.newMessage();
			name2actor.get("ClassConstructorToConstructor__GEN_22_localSearch").tell(new ReferenceAdded<Java2Uml.JavaClassifierToUmlClassifier, uml.Classifier>(incUtil,(Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (uml.Classifier) notification.getNewValue(), "Java2Uml.JavaClassifierToUmlClassifier_target_Classifier"), getSelf());
			incUtil.newMessage();
			name2actor.get("ClassFinalToFinal__GEN_26_localSearch").tell(new ReferenceAdded<Java2Uml.JavaClassifierToUmlClassifier, uml.Classifier>(incUtil,(Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (uml.Classifier) notification.getNewValue(), "Java2Uml.JavaClassifierToUmlClassifier_target_Classifier"), getSelf());
			incUtil.newMessage();
			name2actor.get("ClassImplementToClassImplement__GEN_30_localSearch").tell(new ReferenceAdded<Java2Uml.JavaClassifierToUmlClassifier, uml.Classifier>(incUtil,(Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (uml.Classifier) notification.getNewValue(), "Java2Uml.JavaClassifierToUmlClassifier_target_Classifier"), getSelf());
			incUtil.newMessage();
			name2actor.get("ClassMethodToMethod__GEN_34_localSearch").tell(new ReferenceAdded<Java2Uml.JavaClassifierToUmlClassifier, uml.Classifier>(incUtil,(Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (uml.Classifier) notification.getNewValue(), "Java2Uml.JavaClassifierToUmlClassifier_target_Classifier"), getSelf());
			incUtil.newMessage();
			name2actor.get("ClassPrivateToPrivate__GEN_38_localSearch").tell(new ReferenceAdded<Java2Uml.JavaClassifierToUmlClassifier, uml.Classifier>(incUtil,(Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (uml.Classifier) notification.getNewValue(), "Java2Uml.JavaClassifierToUmlClassifier_target_Classifier"), getSelf());
			incUtil.newMessage();
			name2actor.get("ClassProtectedToProtected__GEN_42_localSearch").tell(new ReferenceAdded<Java2Uml.JavaClassifierToUmlClassifier, uml.Classifier>(incUtil,(Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (uml.Classifier) notification.getNewValue(), "Java2Uml.JavaClassifierToUmlClassifier_target_Classifier"), getSelf());
			incUtil.newMessage();
			name2actor.get("ClassPublicToPublic__GEN_46_localSearch").tell(new ReferenceAdded<Java2Uml.JavaClassifierToUmlClassifier, uml.Classifier>(incUtil,(Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (uml.Classifier) notification.getNewValue(), "Java2Uml.JavaClassifierToUmlClassifier_target_Classifier"), getSelf());
			incUtil.newMessage();
			name2actor.get("EnumAbstractToAbstract__GEN_127_localSearch").tell(new ReferenceAdded<Java2Uml.JavaClassifierToUmlClassifier, uml.Classifier>(incUtil,(Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (uml.Classifier) notification.getNewValue(), "Java2Uml.JavaClassifierToUmlClassifier_target_Classifier"), getSelf());
			incUtil.newMessage();
			name2actor.get("EnumAttributeToProperty__GEN_131_localSearch").tell(new ReferenceAdded<Java2Uml.JavaClassifierToUmlClassifier, uml.Classifier>(incUtil,(Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (uml.Classifier) notification.getNewValue(), "Java2Uml.JavaClassifierToUmlClassifier_target_Classifier"), getSelf());
			incUtil.newMessage();
			name2actor.get("EnumConstantToEnumConstant__GEN_148_localSearch").tell(new ReferenceAdded<Java2Uml.JavaClassifierToUmlClassifier, uml.Classifier>(incUtil,(Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (uml.Classifier) notification.getNewValue(), "Java2Uml.JavaClassifierToUmlClassifier_target_Classifier"), getSelf());
			incUtil.newMessage();
			name2actor.get("EnumFinalToFinal__GEN_152_localSearch").tell(new ReferenceAdded<Java2Uml.JavaClassifierToUmlClassifier, uml.Classifier>(incUtil,(Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (uml.Classifier) notification.getNewValue(), "Java2Uml.JavaClassifierToUmlClassifier_target_Classifier"), getSelf());
			incUtil.newMessage();
			name2actor.get("EnumPrivateToPrivate__GEN_156_localSearch").tell(new ReferenceAdded<Java2Uml.JavaClassifierToUmlClassifier, uml.Classifier>(incUtil,(Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (uml.Classifier) notification.getNewValue(), "Java2Uml.JavaClassifierToUmlClassifier_target_Classifier"), getSelf());
			incUtil.newMessage();
			name2actor.get("EnumProtectedToProtected__GEN_160_localSearch").tell(new ReferenceAdded<Java2Uml.JavaClassifierToUmlClassifier, uml.Classifier>(incUtil,(Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (uml.Classifier) notification.getNewValue(), "Java2Uml.JavaClassifierToUmlClassifier_target_Classifier"), getSelf());
			incUtil.newMessage();
			name2actor.get("EnumPublicToPublic__GEN_164_localSearch").tell(new ReferenceAdded<Java2Uml.JavaClassifierToUmlClassifier, uml.Classifier>(incUtil,(Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (uml.Classifier) notification.getNewValue(), "Java2Uml.JavaClassifierToUmlClassifier_target_Classifier"), getSelf());
			incUtil.newMessage();
			name2actor.get("InterfaceAbstractToAbstract__GEN_220_localSearch").tell(new ReferenceAdded<Java2Uml.JavaClassifierToUmlClassifier, uml.Classifier>(incUtil,(Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (uml.Classifier) notification.getNewValue(), "Java2Uml.JavaClassifierToUmlClassifier_target_Classifier"), getSelf());
			incUtil.newMessage();
			name2actor.get("InterfaceConstructorToConstructor__GEN_237_localSearch").tell(new ReferenceAdded<Java2Uml.JavaClassifierToUmlClassifier, uml.Classifier>(incUtil,(Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (uml.Classifier) notification.getNewValue(), "Java2Uml.JavaClassifierToUmlClassifier_target_Classifier"), getSelf());
			incUtil.newMessage();
			name2actor.get("InterfaceFinalToFinal__GEN_241_localSearch").tell(new ReferenceAdded<Java2Uml.JavaClassifierToUmlClassifier, uml.Classifier>(incUtil,(Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (uml.Classifier) notification.getNewValue(), "Java2Uml.JavaClassifierToUmlClassifier_target_Classifier"), getSelf());
			incUtil.newMessage();
			name2actor.get("InterfaceMethodToMethod__GEN_245_localSearch").tell(new ReferenceAdded<Java2Uml.JavaClassifierToUmlClassifier, uml.Classifier>(incUtil,(Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (uml.Classifier) notification.getNewValue(), "Java2Uml.JavaClassifierToUmlClassifier_target_Classifier"), getSelf());
			incUtil.newMessage();
			name2actor.get("InterfacePrivateToPrivate__GEN_249_localSearch").tell(new ReferenceAdded<Java2Uml.JavaClassifierToUmlClassifier, uml.Classifier>(incUtil,(Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (uml.Classifier) notification.getNewValue(), "Java2Uml.JavaClassifierToUmlClassifier_target_Classifier"), getSelf());
			incUtil.newMessage();
			name2actor.get("InterfaceProtectedToProtected__GEN_253_localSearch").tell(new ReferenceAdded<Java2Uml.JavaClassifierToUmlClassifier, uml.Classifier>(incUtil,(Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (uml.Classifier) notification.getNewValue(), "Java2Uml.JavaClassifierToUmlClassifier_target_Classifier"), getSelf());
			incUtil.newMessage();
			name2actor.get("InterfacePublicToPublic__GEN_257_localSearch").tell(new ReferenceAdded<Java2Uml.JavaClassifierToUmlClassifier, uml.Classifier>(incUtil,(Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (uml.Classifier) notification.getNewValue(), "Java2Uml.JavaClassifierToUmlClassifier_target_Classifier"), getSelf());
			incUtil.newMessage();
			name2actor.get("SuperClassToSuperClass__GEN_403_localSearch").tell(new ReferenceAdded<Java2Uml.JavaClassifierToUmlClassifier, uml.Classifier>(incUtil,(Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (uml.Classifier) notification.getNewValue(), "Java2Uml.JavaClassifierToUmlClassifier_target_Classifier"), getSelf());
			incUtil.newMessage();
			name2actor.get("SuperInterfaceToSuperInterface__GEN_407_localSearch").tell(new ReferenceAdded<Java2Uml.JavaClassifierToUmlClassifier, uml.Classifier>(incUtil,(Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (uml.Classifier) notification.getNewValue(), "Java2Uml.JavaClassifierToUmlClassifier_target_Classifier"), getSelf());
		});
		feature2addEdgeConsumer.put(Java2Uml.Java2UmlPackage.eINSTANCE.getJavaConstructorToOperation_Target(), notification -> {
			incUtil.newMessage();
			name2actor.get("JavaConstructorToOperation_target_0_reference").tell(new ReferenceAdded<Java2Uml.JavaConstructorToOperation, uml.Operation>(incUtil,(Java2Uml.JavaConstructorToOperation) notification.getNotifier(), (uml.Operation) notification.getNewValue(), "Java2Uml.JavaConstructorToOperation_target_Operation"), getSelf());
			incUtil.newMessage();
			name2actor.get("OrdinaryConstructorParameterToParameter__GEN_395_localSearch").tell(new ReferenceAdded<Java2Uml.JavaConstructorToOperation, uml.Operation>(incUtil,(Java2Uml.JavaConstructorToOperation) notification.getNotifier(), (uml.Operation) notification.getNewValue(), "Java2Uml.JavaConstructorToOperation_target_Operation"), getSelf());
			incUtil.newMessage();
			name2actor.get("VariableLengthConstructorParameterToParameter__GEN_411_localSearch").tell(new ReferenceAdded<Java2Uml.JavaConstructorToOperation, uml.Operation>(incUtil,(Java2Uml.JavaConstructorToOperation) notification.getNotifier(), (uml.Operation) notification.getNewValue(), "Java2Uml.JavaConstructorToOperation_target_Operation"), getSelf());
		});
		feature2addEdgeConsumer.put(uml.UmlPackage.eINSTANCE.getBehavioralFeature_OwnedParameter(), notification -> {
			incUtil.newMessage();
			name2actor.get("Operation_ownedParameter_0_reference").tell(new ReferenceAdded<uml.BehavioralFeature, uml.Parameter>(incUtil,(uml.BehavioralFeature) notification.getNotifier(), (uml.Parameter) notification.getNewValue(), "uml.BehavioralFeature_ownedParameter_Parameter"), getSelf());
		});
		feature2addEdgeConsumer.put(org.emftext.language.java.parameters.ParametersPackage.eINSTANCE.getParametrizable_Parameters(), notification -> {
			incUtil.newMessage();
			name2actor.get("Constructor_parameters_0_reference").tell(new ReferenceAdded<org.emftext.language.java.parameters.Parametrizable, org.emftext.language.java.parameters.Parameter>(incUtil,(org.emftext.language.java.parameters.Parametrizable) notification.getNotifier(), (org.emftext.language.java.parameters.Parameter) notification.getNewValue(), "org.emftext.language.java.parameters.Parametrizable_parameters_Parameter"), getSelf());
			incUtil.newMessage();
			name2actor.get("ClassMethod_parameters_1_reference").tell(new ReferenceAdded<org.emftext.language.java.parameters.Parametrizable, org.emftext.language.java.parameters.Parameter>(incUtil,(org.emftext.language.java.parameters.Parametrizable) notification.getNotifier(), (org.emftext.language.java.parameters.Parameter) notification.getNewValue(), "org.emftext.language.java.parameters.Parametrizable_parameters_Parameter"), getSelf());
		});
		feature2addEdgeConsumer.put(Java2Uml.Java2UmlPackage.eINSTANCE.getJavaMethodToOperation_Source(), notification -> {
			incUtil.newMessage();
			name2actor.get("JavaMethodToOperation_source_0_reference").tell(new ReferenceAdded<Java2Uml.JavaMethodToOperation, org.emftext.language.java.members.Method>(incUtil,(Java2Uml.JavaMethodToOperation) notification.getNotifier(), (org.emftext.language.java.members.Method) notification.getNewValue(), "Java2Uml.JavaMethodToOperation_source_Method"), getSelf());
			incUtil.newMessage();
			name2actor.get("MethodAbstractToAbstract__GEN_272_localSearch").tell(new ReferenceAdded<Java2Uml.JavaMethodToOperation, org.emftext.language.java.members.Method>(incUtil,(Java2Uml.JavaMethodToOperation) notification.getNotifier(), (org.emftext.language.java.members.Method) notification.getNewValue(), "Java2Uml.JavaMethodToOperation_source_Method"), getSelf());
			incUtil.newMessage();
			name2actor.get("MethodFinalToFinal__GEN_350_localSearch").tell(new ReferenceAdded<Java2Uml.JavaMethodToOperation, org.emftext.language.java.members.Method>(incUtil,(Java2Uml.JavaMethodToOperation) notification.getNotifier(), (org.emftext.language.java.members.Method) notification.getNewValue(), "Java2Uml.JavaMethodToOperation_source_Method"), getSelf());
			incUtil.newMessage();
			name2actor.get("MethodStaticToStatic__GEN_391_localSearch").tell(new ReferenceAdded<Java2Uml.JavaMethodToOperation, org.emftext.language.java.members.Method>(incUtil,(Java2Uml.JavaMethodToOperation) notification.getNotifier(), (org.emftext.language.java.members.Method) notification.getNewValue(), "Java2Uml.JavaMethodToOperation_source_Method"), getSelf());
			incUtil.newMessage();
			name2actor.get("OrdinaryMethodParameterToParameter__GEN_399_localSearch").tell(new ReferenceAdded<Java2Uml.JavaMethodToOperation, org.emftext.language.java.members.Method>(incUtil,(Java2Uml.JavaMethodToOperation) notification.getNotifier(), (org.emftext.language.java.members.Method) notification.getNewValue(), "Java2Uml.JavaMethodToOperation_source_Method"), getSelf());
			incUtil.newMessage();
			name2actor.get("VariableLengthMethodParameterToParameter__GEN_415_localSearch").tell(new ReferenceAdded<Java2Uml.JavaMethodToOperation, org.emftext.language.java.members.Method>(incUtil,(Java2Uml.JavaMethodToOperation) notification.getNotifier(), (org.emftext.language.java.members.Method) notification.getNewValue(), "Java2Uml.JavaMethodToOperation_source_Method"), getSelf());
		});
		feature2addEdgeConsumer.put(Java2Uml.Java2UmlPackage.eINSTANCE.getJavaCompilationUnitToUmlModel_Target(), notification -> {
			incUtil.newMessage();
			name2actor.get("JavaCompilationUnitToExistingUmlModel__GEN_266_localSearch").tell(new ReferenceAdded<Java2Uml.JavaCompilationUnitToUmlModel, uml.Model>(incUtil,(Java2Uml.JavaCompilationUnitToUmlModel) notification.getNotifier(), (uml.Model) notification.getNewValue(), "Java2Uml.JavaCompilationUnitToUmlModel_target_Model"), getSelf());
		});
		feature2addEdgeConsumer.put(Java2Uml.Java2UmlPackage.eINSTANCE.getJavaMethodToOperation_Target(), notification -> {
			incUtil.newMessage();
			name2actor.get("JavaMethodToOperation_target_0_reference").tell(new ReferenceAdded<Java2Uml.JavaMethodToOperation, uml.Operation>(incUtil,(Java2Uml.JavaMethodToOperation) notification.getNotifier(), (uml.Operation) notification.getNewValue(), "Java2Uml.JavaMethodToOperation_target_Operation"), getSelf());
			incUtil.newMessage();
			name2actor.get("MethodAbstractToAbstract__GEN_272_localSearch").tell(new ReferenceAdded<Java2Uml.JavaMethodToOperation, uml.Operation>(incUtil,(Java2Uml.JavaMethodToOperation) notification.getNotifier(), (uml.Operation) notification.getNewValue(), "Java2Uml.JavaMethodToOperation_target_Operation"), getSelf());
			incUtil.newMessage();
			name2actor.get("MethodFinalToFinal__GEN_350_localSearch").tell(new ReferenceAdded<Java2Uml.JavaMethodToOperation, uml.Operation>(incUtil,(Java2Uml.JavaMethodToOperation) notification.getNotifier(), (uml.Operation) notification.getNewValue(), "Java2Uml.JavaMethodToOperation_target_Operation"), getSelf());
			incUtil.newMessage();
			name2actor.get("MethodStaticToStatic__GEN_391_localSearch").tell(new ReferenceAdded<Java2Uml.JavaMethodToOperation, uml.Operation>(incUtil,(Java2Uml.JavaMethodToOperation) notification.getNotifier(), (uml.Operation) notification.getNewValue(), "Java2Uml.JavaMethodToOperation_target_Operation"), getSelf());
			incUtil.newMessage();
			name2actor.get("OrdinaryMethodParameterToParameter__GEN_399_localSearch").tell(new ReferenceAdded<Java2Uml.JavaMethodToOperation, uml.Operation>(incUtil,(Java2Uml.JavaMethodToOperation) notification.getNotifier(), (uml.Operation) notification.getNewValue(), "Java2Uml.JavaMethodToOperation_target_Operation"), getSelf());
			incUtil.newMessage();
			name2actor.get("VariableLengthMethodParameterToParameter__GEN_415_localSearch").tell(new ReferenceAdded<Java2Uml.JavaMethodToOperation, uml.Operation>(incUtil,(Java2Uml.JavaMethodToOperation) notification.getNotifier(), (uml.Operation) notification.getNewValue(), "Java2Uml.JavaMethodToOperation_target_Operation"), getSelf());
		});
		feature2addEdgeConsumer.put(Java2Uml.Java2UmlPackage.eINSTANCE.getJavaParameterToParameter_Source(), notification -> {
			incUtil.newMessage();
			name2actor.get("JavaParameterToParameter_source_0_reference").tell(new ReferenceAdded<Java2Uml.JavaParameterToParameter, org.emftext.language.java.parameters.Parameter>(incUtil,(Java2Uml.JavaParameterToParameter) notification.getNotifier(), (org.emftext.language.java.parameters.Parameter) notification.getNewValue(), "Java2Uml.JavaParameterToParameter_source_Parameter"), getSelf());
		});
		feature2addEdgeConsumer.put(Java2Uml.Java2UmlPackage.eINSTANCE.getJavaCompilationUnitToUmlModel_Source(), notification -> {
			incUtil.newMessage();
			name2actor.get("JavaCompilationUnitToExistingUmlModel__GEN_266_localSearch").tell(new ReferenceAdded<Java2Uml.JavaCompilationUnitToUmlModel, org.emftext.language.java.containers.CompilationUnit>(incUtil,(Java2Uml.JavaCompilationUnitToUmlModel) notification.getNotifier(), (org.emftext.language.java.containers.CompilationUnit) notification.getNewValue(), "Java2Uml.JavaCompilationUnitToUmlModel_source_CompilationUnit"), getSelf());
		});
		feature2addEdgeConsumer.put(Java2Uml.Java2UmlPackage.eINSTANCE.getJavaClassifierToUmlClassifier_Source(), notification -> {
			incUtil.newMessage();
			name2actor.get("JavaClassifierToUmlClassifier_source_0_reference").tell(new ReferenceAdded<Java2Uml.JavaClassifierToUmlClassifier, org.emftext.language.java.classifiers.Classifier>(incUtil,(Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (org.emftext.language.java.classifiers.Classifier) notification.getNewValue(), "Java2Uml.JavaClassifierToUmlClassifier_source_Classifier"), getSelf());
			incUtil.newMessage();
			name2actor.get("JavaClassifierToUmlClassifier_source_1_reference").tell(new ReferenceAdded<Java2Uml.JavaClassifierToUmlClassifier, org.emftext.language.java.classifiers.Classifier>(incUtil,(Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (org.emftext.language.java.classifiers.Classifier) notification.getNewValue(), "Java2Uml.JavaClassifierToUmlClassifier_source_Classifier"), getSelf());
			incUtil.newMessage();
			name2actor.get("JavaClassifierToUmlClassifier_source_2_reference").tell(new ReferenceAdded<Java2Uml.JavaClassifierToUmlClassifier, org.emftext.language.java.classifiers.Classifier>(incUtil,(Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (org.emftext.language.java.classifiers.Classifier) notification.getNewValue(), "Java2Uml.JavaClassifierToUmlClassifier_source_Classifier"), getSelf());
			incUtil.newMessage();
			name2actor.get("ClassAbstractToAbstract__GEN_1_localSearch").tell(new ReferenceAdded<Java2Uml.JavaClassifierToUmlClassifier, org.emftext.language.java.classifiers.Classifier>(incUtil,(Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (org.emftext.language.java.classifiers.Classifier) notification.getNewValue(), "Java2Uml.JavaClassifierToUmlClassifier_source_Classifier"), getSelf());
			incUtil.newMessage();
			name2actor.get("ClassAttributeToProperty__GEN_5_localSearch").tell(new ReferenceAdded<Java2Uml.JavaClassifierToUmlClassifier, org.emftext.language.java.classifiers.Classifier>(incUtil,(Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (org.emftext.language.java.classifiers.Classifier) notification.getNewValue(), "Java2Uml.JavaClassifierToUmlClassifier_source_Classifier"), getSelf());
			incUtil.newMessage();
			name2actor.get("ClassConstructorToConstructor__GEN_22_localSearch").tell(new ReferenceAdded<Java2Uml.JavaClassifierToUmlClassifier, org.emftext.language.java.classifiers.Classifier>(incUtil,(Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (org.emftext.language.java.classifiers.Classifier) notification.getNewValue(), "Java2Uml.JavaClassifierToUmlClassifier_source_Classifier"), getSelf());
			incUtil.newMessage();
			name2actor.get("ClassFinalToFinal__GEN_26_localSearch").tell(new ReferenceAdded<Java2Uml.JavaClassifierToUmlClassifier, org.emftext.language.java.classifiers.Classifier>(incUtil,(Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (org.emftext.language.java.classifiers.Classifier) notification.getNewValue(), "Java2Uml.JavaClassifierToUmlClassifier_source_Classifier"), getSelf());
			incUtil.newMessage();
			name2actor.get("ClassImplementToClassImplement__GEN_30_localSearch").tell(new ReferenceAdded<Java2Uml.JavaClassifierToUmlClassifier, org.emftext.language.java.classifiers.Classifier>(incUtil,(Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (org.emftext.language.java.classifiers.Classifier) notification.getNewValue(), "Java2Uml.JavaClassifierToUmlClassifier_source_Classifier"), getSelf());
			incUtil.newMessage();
			name2actor.get("ClassMethodToMethod__GEN_34_localSearch").tell(new ReferenceAdded<Java2Uml.JavaClassifierToUmlClassifier, org.emftext.language.java.classifiers.Classifier>(incUtil,(Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (org.emftext.language.java.classifiers.Classifier) notification.getNewValue(), "Java2Uml.JavaClassifierToUmlClassifier_source_Classifier"), getSelf());
			incUtil.newMessage();
			name2actor.get("ClassPrivateToPrivate__GEN_38_localSearch").tell(new ReferenceAdded<Java2Uml.JavaClassifierToUmlClassifier, org.emftext.language.java.classifiers.Classifier>(incUtil,(Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (org.emftext.language.java.classifiers.Classifier) notification.getNewValue(), "Java2Uml.JavaClassifierToUmlClassifier_source_Classifier"), getSelf());
			incUtil.newMessage();
			name2actor.get("ClassProtectedToProtected__GEN_42_localSearch").tell(new ReferenceAdded<Java2Uml.JavaClassifierToUmlClassifier, org.emftext.language.java.classifiers.Classifier>(incUtil,(Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (org.emftext.language.java.classifiers.Classifier) notification.getNewValue(), "Java2Uml.JavaClassifierToUmlClassifier_source_Classifier"), getSelf());
			incUtil.newMessage();
			name2actor.get("ClassPublicToPublic__GEN_46_localSearch").tell(new ReferenceAdded<Java2Uml.JavaClassifierToUmlClassifier, org.emftext.language.java.classifiers.Classifier>(incUtil,(Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (org.emftext.language.java.classifiers.Classifier) notification.getNewValue(), "Java2Uml.JavaClassifierToUmlClassifier_source_Classifier"), getSelf());
			incUtil.newMessage();
			name2actor.get("EnumAbstractToAbstract__GEN_127_localSearch").tell(new ReferenceAdded<Java2Uml.JavaClassifierToUmlClassifier, org.emftext.language.java.classifiers.Classifier>(incUtil,(Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (org.emftext.language.java.classifiers.Classifier) notification.getNewValue(), "Java2Uml.JavaClassifierToUmlClassifier_source_Classifier"), getSelf());
			incUtil.newMessage();
			name2actor.get("EnumAttributeToProperty__GEN_131_localSearch").tell(new ReferenceAdded<Java2Uml.JavaClassifierToUmlClassifier, org.emftext.language.java.classifiers.Classifier>(incUtil,(Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (org.emftext.language.java.classifiers.Classifier) notification.getNewValue(), "Java2Uml.JavaClassifierToUmlClassifier_source_Classifier"), getSelf());
			incUtil.newMessage();
			name2actor.get("EnumConstantToEnumConstant__GEN_148_localSearch").tell(new ReferenceAdded<Java2Uml.JavaClassifierToUmlClassifier, org.emftext.language.java.classifiers.Classifier>(incUtil,(Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (org.emftext.language.java.classifiers.Classifier) notification.getNewValue(), "Java2Uml.JavaClassifierToUmlClassifier_source_Classifier"), getSelf());
			incUtil.newMessage();
			name2actor.get("EnumFinalToFinal__GEN_152_localSearch").tell(new ReferenceAdded<Java2Uml.JavaClassifierToUmlClassifier, org.emftext.language.java.classifiers.Classifier>(incUtil,(Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (org.emftext.language.java.classifiers.Classifier) notification.getNewValue(), "Java2Uml.JavaClassifierToUmlClassifier_source_Classifier"), getSelf());
			incUtil.newMessage();
			name2actor.get("EnumPrivateToPrivate__GEN_156_localSearch").tell(new ReferenceAdded<Java2Uml.JavaClassifierToUmlClassifier, org.emftext.language.java.classifiers.Classifier>(incUtil,(Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (org.emftext.language.java.classifiers.Classifier) notification.getNewValue(), "Java2Uml.JavaClassifierToUmlClassifier_source_Classifier"), getSelf());
			incUtil.newMessage();
			name2actor.get("EnumProtectedToProtected__GEN_160_localSearch").tell(new ReferenceAdded<Java2Uml.JavaClassifierToUmlClassifier, org.emftext.language.java.classifiers.Classifier>(incUtil,(Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (org.emftext.language.java.classifiers.Classifier) notification.getNewValue(), "Java2Uml.JavaClassifierToUmlClassifier_source_Classifier"), getSelf());
			incUtil.newMessage();
			name2actor.get("EnumPublicToPublic__GEN_164_localSearch").tell(new ReferenceAdded<Java2Uml.JavaClassifierToUmlClassifier, org.emftext.language.java.classifiers.Classifier>(incUtil,(Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (org.emftext.language.java.classifiers.Classifier) notification.getNewValue(), "Java2Uml.JavaClassifierToUmlClassifier_source_Classifier"), getSelf());
			incUtil.newMessage();
			name2actor.get("InterfaceAbstractToAbstract__GEN_220_localSearch").tell(new ReferenceAdded<Java2Uml.JavaClassifierToUmlClassifier, org.emftext.language.java.classifiers.Classifier>(incUtil,(Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (org.emftext.language.java.classifiers.Classifier) notification.getNewValue(), "Java2Uml.JavaClassifierToUmlClassifier_source_Classifier"), getSelf());
			incUtil.newMessage();
			name2actor.get("InterfaceConstructorToConstructor__GEN_237_localSearch").tell(new ReferenceAdded<Java2Uml.JavaClassifierToUmlClassifier, org.emftext.language.java.classifiers.Classifier>(incUtil,(Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (org.emftext.language.java.classifiers.Classifier) notification.getNewValue(), "Java2Uml.JavaClassifierToUmlClassifier_source_Classifier"), getSelf());
			incUtil.newMessage();
			name2actor.get("InterfaceFinalToFinal__GEN_241_localSearch").tell(new ReferenceAdded<Java2Uml.JavaClassifierToUmlClassifier, org.emftext.language.java.classifiers.Classifier>(incUtil,(Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (org.emftext.language.java.classifiers.Classifier) notification.getNewValue(), "Java2Uml.JavaClassifierToUmlClassifier_source_Classifier"), getSelf());
			incUtil.newMessage();
			name2actor.get("InterfaceMethodToMethod__GEN_245_localSearch").tell(new ReferenceAdded<Java2Uml.JavaClassifierToUmlClassifier, org.emftext.language.java.classifiers.Classifier>(incUtil,(Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (org.emftext.language.java.classifiers.Classifier) notification.getNewValue(), "Java2Uml.JavaClassifierToUmlClassifier_source_Classifier"), getSelf());
			incUtil.newMessage();
			name2actor.get("InterfacePrivateToPrivate__GEN_249_localSearch").tell(new ReferenceAdded<Java2Uml.JavaClassifierToUmlClassifier, org.emftext.language.java.classifiers.Classifier>(incUtil,(Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (org.emftext.language.java.classifiers.Classifier) notification.getNewValue(), "Java2Uml.JavaClassifierToUmlClassifier_source_Classifier"), getSelf());
			incUtil.newMessage();
			name2actor.get("InterfaceProtectedToProtected__GEN_253_localSearch").tell(new ReferenceAdded<Java2Uml.JavaClassifierToUmlClassifier, org.emftext.language.java.classifiers.Classifier>(incUtil,(Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (org.emftext.language.java.classifiers.Classifier) notification.getNewValue(), "Java2Uml.JavaClassifierToUmlClassifier_source_Classifier"), getSelf());
			incUtil.newMessage();
			name2actor.get("InterfacePublicToPublic__GEN_257_localSearch").tell(new ReferenceAdded<Java2Uml.JavaClassifierToUmlClassifier, org.emftext.language.java.classifiers.Classifier>(incUtil,(Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (org.emftext.language.java.classifiers.Classifier) notification.getNewValue(), "Java2Uml.JavaClassifierToUmlClassifier_source_Classifier"), getSelf());
			incUtil.newMessage();
			name2actor.get("SuperClassToSuperClass__GEN_403_localSearch").tell(new ReferenceAdded<Java2Uml.JavaClassifierToUmlClassifier, org.emftext.language.java.classifiers.Classifier>(incUtil,(Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (org.emftext.language.java.classifiers.Classifier) notification.getNewValue(), "Java2Uml.JavaClassifierToUmlClassifier_source_Classifier"), getSelf());
			incUtil.newMessage();
			name2actor.get("SuperInterfaceToSuperInterface__GEN_407_localSearch").tell(new ReferenceAdded<Java2Uml.JavaClassifierToUmlClassifier, org.emftext.language.java.classifiers.Classifier>(incUtil,(Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (org.emftext.language.java.classifiers.Classifier) notification.getNewValue(), "Java2Uml.JavaClassifierToUmlClassifier_source_Classifier"), getSelf());
		});
		feature2addEdgeConsumer.put(Java2Uml.Java2UmlPackage.eINSTANCE.getJavaConstructorToOperation_Source(), notification -> {
			incUtil.newMessage();
			name2actor.get("JavaConstructorToOperation_source_0_reference").tell(new ReferenceAdded<Java2Uml.JavaConstructorToOperation, org.emftext.language.java.members.Constructor>(incUtil,(Java2Uml.JavaConstructorToOperation) notification.getNotifier(), (org.emftext.language.java.members.Constructor) notification.getNewValue(), "Java2Uml.JavaConstructorToOperation_source_Constructor"), getSelf());
			incUtil.newMessage();
			name2actor.get("OrdinaryConstructorParameterToParameter__GEN_395_localSearch").tell(new ReferenceAdded<Java2Uml.JavaConstructorToOperation, org.emftext.language.java.members.Constructor>(incUtil,(Java2Uml.JavaConstructorToOperation) notification.getNotifier(), (org.emftext.language.java.members.Constructor) notification.getNewValue(), "Java2Uml.JavaConstructorToOperation_source_Constructor"), getSelf());
			incUtil.newMessage();
			name2actor.get("VariableLengthConstructorParameterToParameter__GEN_411_localSearch").tell(new ReferenceAdded<Java2Uml.JavaConstructorToOperation, org.emftext.language.java.members.Constructor>(incUtil,(Java2Uml.JavaConstructorToOperation) notification.getNotifier(), (org.emftext.language.java.members.Constructor) notification.getNewValue(), "Java2Uml.JavaConstructorToOperation_source_Constructor"), getSelf());
		});
		feature2addEdgeConsumer.put(Java2Uml.Java2UmlPackage.eINSTANCE.getJavaPackageToUmlPackage_Source(), notification -> {
			incUtil.newMessage();
			name2actor.get("ClassToUmlClass__GEN_50_localSearch").tell(new ReferenceAdded<Java2Uml.JavaPackageToUmlPackage, org.emftext.language.java.containers.Package>(incUtil,(Java2Uml.JavaPackageToUmlPackage) notification.getNotifier(), (org.emftext.language.java.containers.Package) notification.getNewValue(), "Java2Uml.JavaPackageToUmlPackage_source_Package"), getSelf());
			incUtil.newMessage();
			name2actor.get("EnumToUmlEnum__GEN_168_localSearch").tell(new ReferenceAdded<Java2Uml.JavaPackageToUmlPackage, org.emftext.language.java.containers.Package>(incUtil,(Java2Uml.JavaPackageToUmlPackage) notification.getNotifier(), (org.emftext.language.java.containers.Package) notification.getNewValue(), "Java2Uml.JavaPackageToUmlPackage_source_Package"), getSelf());
			incUtil.newMessage();
			name2actor.get("InterfaceToUmlInterface__GEN_261_localSearch").tell(new ReferenceAdded<Java2Uml.JavaPackageToUmlPackage, org.emftext.language.java.containers.Package>(incUtil,(Java2Uml.JavaPackageToUmlPackage) notification.getNotifier(), (org.emftext.language.java.containers.Package) notification.getNewValue(), "Java2Uml.JavaPackageToUmlPackage_source_Package"), getSelf());
		});
		feature2addEdgeConsumer.put(Java2Uml.Java2UmlPackage.eINSTANCE.getJavaParameterToParameter_Target(), notification -> {
			incUtil.newMessage();
			name2actor.get("JavaParameterToParameter_target_0_reference").tell(new ReferenceAdded<Java2Uml.JavaParameterToParameter, uml.Parameter>(incUtil,(Java2Uml.JavaParameterToParameter) notification.getNotifier(), (uml.Parameter) notification.getNewValue(), "Java2Uml.JavaParameterToParameter_target_Parameter"), getSelf());
		});
		feature2addEdgeConsumer.put(Java2Uml.Java2UmlPackage.eINSTANCE.getJavaAttributeToUmlProperty_Source(), notification -> {
			incUtil.newMessage();
			name2actor.get("JavaAttributeToUmlProperty_source_0_reference").tell(new ReferenceAdded<Java2Uml.JavaAttributeToUmlProperty, org.emftext.language.java.members.Field>(incUtil,(Java2Uml.JavaAttributeToUmlProperty) notification.getNotifier(), (org.emftext.language.java.members.Field) notification.getNewValue(), "Java2Uml.JavaAttributeToUmlProperty_source_Field"), getSelf());
			incUtil.newMessage();
			name2actor.get("FieldFinalToFinal__GEN_212_localSearch").tell(new ReferenceAdded<Java2Uml.JavaAttributeToUmlProperty, org.emftext.language.java.members.Field>(incUtil,(Java2Uml.JavaAttributeToUmlProperty) notification.getNotifier(), (org.emftext.language.java.members.Field) notification.getNewValue(), "Java2Uml.JavaAttributeToUmlProperty_source_Field"), getSelf());
			incUtil.newMessage();
			name2actor.get("FieldStaticToStatic__GEN_216_localSearch").tell(new ReferenceAdded<Java2Uml.JavaAttributeToUmlProperty, org.emftext.language.java.members.Field>(incUtil,(Java2Uml.JavaAttributeToUmlProperty) notification.getNotifier(), (org.emftext.language.java.members.Field) notification.getNewValue(), "Java2Uml.JavaAttributeToUmlProperty_source_Field"), getSelf());
		});
		feature2addEdgeConsumer.put(org.emftext.language.java.containers.ContainersPackage.eINSTANCE.getPackage_CompilationUnits(), notification -> {
			incUtil.newMessage();
			name2actor.get("ClassToUmlClass__GEN_50_localSearch").tell(new ReferenceAdded<org.emftext.language.java.containers.Package, org.emftext.language.java.containers.CompilationUnit>(incUtil,(org.emftext.language.java.containers.Package) notification.getNotifier(), (org.emftext.language.java.containers.CompilationUnit) notification.getNewValue(), "org.emftext.language.java.containers.Package_compilationUnits_CompilationUnit"), getSelf());
			incUtil.newMessage();
			name2actor.get("EnumToUmlEnum__GEN_168_localSearch").tell(new ReferenceAdded<org.emftext.language.java.containers.Package, org.emftext.language.java.containers.CompilationUnit>(incUtil,(org.emftext.language.java.containers.Package) notification.getNotifier(), (org.emftext.language.java.containers.CompilationUnit) notification.getNewValue(), "org.emftext.language.java.containers.Package_compilationUnits_CompilationUnit"), getSelf());
			incUtil.newMessage();
			name2actor.get("InterfaceToUmlInterface__GEN_261_localSearch").tell(new ReferenceAdded<org.emftext.language.java.containers.Package, org.emftext.language.java.containers.CompilationUnit>(incUtil,(org.emftext.language.java.containers.Package) notification.getNotifier(), (org.emftext.language.java.containers.CompilationUnit) notification.getNewValue(), "org.emftext.language.java.containers.Package_compilationUnits_CompilationUnit"), getSelf());
			incUtil.newMessage();
			name2actor.get("JavaCompilationUnitToExistingUmlModel__GEN_266_localSearch").tell(new ReferenceAdded<org.emftext.language.java.containers.Package, org.emftext.language.java.containers.CompilationUnit>(incUtil,(org.emftext.language.java.containers.Package) notification.getNotifier(), (org.emftext.language.java.containers.CompilationUnit) notification.getNewValue(), "org.emftext.language.java.containers.Package_compilationUnits_CompilationUnit"), getSelf());
		});
	}
	
	private void initializeRemoveEdge() {
		feature2removeEdgeConsumer.put(Java2Uml.Java2UmlPackage.eINSTANCE.getJavaPackageToUmlPackage_Target(), notification -> {
			incUtil.newMessage();
			name2actor.get("ClassToUmlClass__GEN_50_localSearch").tell(new ReferenceDeleted<Java2Uml.JavaPackageToUmlPackage, uml.Package>(incUtil, (Java2Uml.JavaPackageToUmlPackage) notification.getNotifier(), (uml.Package) notification.getOldValue(), "Java2Uml.JavaPackageToUmlPackage_target_Package"), getSelf());
			incUtil.newMessage();
			name2actor.get("EnumToUmlEnum__GEN_168_localSearch").tell(new ReferenceDeleted<Java2Uml.JavaPackageToUmlPackage, uml.Package>(incUtil, (Java2Uml.JavaPackageToUmlPackage) notification.getNotifier(), (uml.Package) notification.getOldValue(), "Java2Uml.JavaPackageToUmlPackage_target_Package"), getSelf());
			incUtil.newMessage();
			name2actor.get("InterfaceToUmlInterface__GEN_261_localSearch").tell(new ReferenceDeleted<Java2Uml.JavaPackageToUmlPackage, uml.Package>(incUtil, (Java2Uml.JavaPackageToUmlPackage) notification.getNotifier(), (uml.Package) notification.getOldValue(), "Java2Uml.JavaPackageToUmlPackage_target_Package"), getSelf());
		});
		feature2removeEdgeConsumer.put(Java2Uml.Java2UmlPackage.eINSTANCE.getJavaAttributeToUmlProperty_Target(), notification -> {
			incUtil.newMessage();
			name2actor.get("JavaAttributeToUmlProperty_target_0_reference").tell(new ReferenceDeleted<Java2Uml.JavaAttributeToUmlProperty, uml.Property>(incUtil, (Java2Uml.JavaAttributeToUmlProperty) notification.getNotifier(), (uml.Property) notification.getOldValue(), "Java2Uml.JavaAttributeToUmlProperty_target_Property"), getSelf());
			incUtil.newMessage();
			name2actor.get("FieldFinalToFinal__GEN_212_localSearch").tell(new ReferenceDeleted<Java2Uml.JavaAttributeToUmlProperty, uml.Property>(incUtil, (Java2Uml.JavaAttributeToUmlProperty) notification.getNotifier(), (uml.Property) notification.getOldValue(), "Java2Uml.JavaAttributeToUmlProperty_target_Property"), getSelf());
			incUtil.newMessage();
			name2actor.get("FieldStaticToStatic__GEN_216_localSearch").tell(new ReferenceDeleted<Java2Uml.JavaAttributeToUmlProperty, uml.Property>(incUtil, (Java2Uml.JavaAttributeToUmlProperty) notification.getNotifier(), (uml.Property) notification.getOldValue(), "Java2Uml.JavaAttributeToUmlProperty_target_Property"), getSelf());
		});
		feature2removeEdgeConsumer.put(Java2Uml.Java2UmlPackage.eINSTANCE.getJavaClassifierToUmlClassifier_Target(), notification -> {
			incUtil.newMessage();
			name2actor.get("JavaClassifierToUmlClassifier_target_0_reference").tell(new ReferenceDeleted<Java2Uml.JavaClassifierToUmlClassifier, uml.Classifier>(incUtil, (Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (uml.Classifier) notification.getOldValue(), "Java2Uml.JavaClassifierToUmlClassifier_target_Classifier"), getSelf());
			incUtil.newMessage();
			name2actor.get("JavaClassifierToUmlClassifier_target_1_reference").tell(new ReferenceDeleted<Java2Uml.JavaClassifierToUmlClassifier, uml.Classifier>(incUtil, (Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (uml.Classifier) notification.getOldValue(), "Java2Uml.JavaClassifierToUmlClassifier_target_Classifier"), getSelf());
			incUtil.newMessage();
			name2actor.get("JavaClassifierToUmlClassifier_target_2_reference").tell(new ReferenceDeleted<Java2Uml.JavaClassifierToUmlClassifier, uml.Classifier>(incUtil, (Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (uml.Classifier) notification.getOldValue(), "Java2Uml.JavaClassifierToUmlClassifier_target_Classifier"), getSelf());
			incUtil.newMessage();
			name2actor.get("ClassAbstractToAbstract__GEN_1_localSearch").tell(new ReferenceDeleted<Java2Uml.JavaClassifierToUmlClassifier, uml.Classifier>(incUtil, (Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (uml.Classifier) notification.getOldValue(), "Java2Uml.JavaClassifierToUmlClassifier_target_Classifier"), getSelf());
			incUtil.newMessage();
			name2actor.get("ClassAttributeToProperty__GEN_5_localSearch").tell(new ReferenceDeleted<Java2Uml.JavaClassifierToUmlClassifier, uml.Classifier>(incUtil, (Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (uml.Classifier) notification.getOldValue(), "Java2Uml.JavaClassifierToUmlClassifier_target_Classifier"), getSelf());
			incUtil.newMessage();
			name2actor.get("ClassConstructorToConstructor__GEN_22_localSearch").tell(new ReferenceDeleted<Java2Uml.JavaClassifierToUmlClassifier, uml.Classifier>(incUtil, (Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (uml.Classifier) notification.getOldValue(), "Java2Uml.JavaClassifierToUmlClassifier_target_Classifier"), getSelf());
			incUtil.newMessage();
			name2actor.get("ClassFinalToFinal__GEN_26_localSearch").tell(new ReferenceDeleted<Java2Uml.JavaClassifierToUmlClassifier, uml.Classifier>(incUtil, (Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (uml.Classifier) notification.getOldValue(), "Java2Uml.JavaClassifierToUmlClassifier_target_Classifier"), getSelf());
			incUtil.newMessage();
			name2actor.get("ClassImplementToClassImplement__GEN_30_localSearch").tell(new ReferenceDeleted<Java2Uml.JavaClassifierToUmlClassifier, uml.Classifier>(incUtil, (Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (uml.Classifier) notification.getOldValue(), "Java2Uml.JavaClassifierToUmlClassifier_target_Classifier"), getSelf());
			incUtil.newMessage();
			name2actor.get("ClassMethodToMethod__GEN_34_localSearch").tell(new ReferenceDeleted<Java2Uml.JavaClassifierToUmlClassifier, uml.Classifier>(incUtil, (Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (uml.Classifier) notification.getOldValue(), "Java2Uml.JavaClassifierToUmlClassifier_target_Classifier"), getSelf());
			incUtil.newMessage();
			name2actor.get("ClassPrivateToPrivate__GEN_38_localSearch").tell(new ReferenceDeleted<Java2Uml.JavaClassifierToUmlClassifier, uml.Classifier>(incUtil, (Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (uml.Classifier) notification.getOldValue(), "Java2Uml.JavaClassifierToUmlClassifier_target_Classifier"), getSelf());
			incUtil.newMessage();
			name2actor.get("ClassProtectedToProtected__GEN_42_localSearch").tell(new ReferenceDeleted<Java2Uml.JavaClassifierToUmlClassifier, uml.Classifier>(incUtil, (Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (uml.Classifier) notification.getOldValue(), "Java2Uml.JavaClassifierToUmlClassifier_target_Classifier"), getSelf());
			incUtil.newMessage();
			name2actor.get("ClassPublicToPublic__GEN_46_localSearch").tell(new ReferenceDeleted<Java2Uml.JavaClassifierToUmlClassifier, uml.Classifier>(incUtil, (Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (uml.Classifier) notification.getOldValue(), "Java2Uml.JavaClassifierToUmlClassifier_target_Classifier"), getSelf());
			incUtil.newMessage();
			name2actor.get("EnumAbstractToAbstract__GEN_127_localSearch").tell(new ReferenceDeleted<Java2Uml.JavaClassifierToUmlClassifier, uml.Classifier>(incUtil, (Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (uml.Classifier) notification.getOldValue(), "Java2Uml.JavaClassifierToUmlClassifier_target_Classifier"), getSelf());
			incUtil.newMessage();
			name2actor.get("EnumAttributeToProperty__GEN_131_localSearch").tell(new ReferenceDeleted<Java2Uml.JavaClassifierToUmlClassifier, uml.Classifier>(incUtil, (Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (uml.Classifier) notification.getOldValue(), "Java2Uml.JavaClassifierToUmlClassifier_target_Classifier"), getSelf());
			incUtil.newMessage();
			name2actor.get("EnumConstantToEnumConstant__GEN_148_localSearch").tell(new ReferenceDeleted<Java2Uml.JavaClassifierToUmlClassifier, uml.Classifier>(incUtil, (Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (uml.Classifier) notification.getOldValue(), "Java2Uml.JavaClassifierToUmlClassifier_target_Classifier"), getSelf());
			incUtil.newMessage();
			name2actor.get("EnumFinalToFinal__GEN_152_localSearch").tell(new ReferenceDeleted<Java2Uml.JavaClassifierToUmlClassifier, uml.Classifier>(incUtil, (Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (uml.Classifier) notification.getOldValue(), "Java2Uml.JavaClassifierToUmlClassifier_target_Classifier"), getSelf());
			incUtil.newMessage();
			name2actor.get("EnumPrivateToPrivate__GEN_156_localSearch").tell(new ReferenceDeleted<Java2Uml.JavaClassifierToUmlClassifier, uml.Classifier>(incUtil, (Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (uml.Classifier) notification.getOldValue(), "Java2Uml.JavaClassifierToUmlClassifier_target_Classifier"), getSelf());
			incUtil.newMessage();
			name2actor.get("EnumProtectedToProtected__GEN_160_localSearch").tell(new ReferenceDeleted<Java2Uml.JavaClassifierToUmlClassifier, uml.Classifier>(incUtil, (Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (uml.Classifier) notification.getOldValue(), "Java2Uml.JavaClassifierToUmlClassifier_target_Classifier"), getSelf());
			incUtil.newMessage();
			name2actor.get("EnumPublicToPublic__GEN_164_localSearch").tell(new ReferenceDeleted<Java2Uml.JavaClassifierToUmlClassifier, uml.Classifier>(incUtil, (Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (uml.Classifier) notification.getOldValue(), "Java2Uml.JavaClassifierToUmlClassifier_target_Classifier"), getSelf());
			incUtil.newMessage();
			name2actor.get("InterfaceAbstractToAbstract__GEN_220_localSearch").tell(new ReferenceDeleted<Java2Uml.JavaClassifierToUmlClassifier, uml.Classifier>(incUtil, (Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (uml.Classifier) notification.getOldValue(), "Java2Uml.JavaClassifierToUmlClassifier_target_Classifier"), getSelf());
			incUtil.newMessage();
			name2actor.get("InterfaceConstructorToConstructor__GEN_237_localSearch").tell(new ReferenceDeleted<Java2Uml.JavaClassifierToUmlClassifier, uml.Classifier>(incUtil, (Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (uml.Classifier) notification.getOldValue(), "Java2Uml.JavaClassifierToUmlClassifier_target_Classifier"), getSelf());
			incUtil.newMessage();
			name2actor.get("InterfaceFinalToFinal__GEN_241_localSearch").tell(new ReferenceDeleted<Java2Uml.JavaClassifierToUmlClassifier, uml.Classifier>(incUtil, (Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (uml.Classifier) notification.getOldValue(), "Java2Uml.JavaClassifierToUmlClassifier_target_Classifier"), getSelf());
			incUtil.newMessage();
			name2actor.get("InterfaceMethodToMethod__GEN_245_localSearch").tell(new ReferenceDeleted<Java2Uml.JavaClassifierToUmlClassifier, uml.Classifier>(incUtil, (Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (uml.Classifier) notification.getOldValue(), "Java2Uml.JavaClassifierToUmlClassifier_target_Classifier"), getSelf());
			incUtil.newMessage();
			name2actor.get("InterfacePrivateToPrivate__GEN_249_localSearch").tell(new ReferenceDeleted<Java2Uml.JavaClassifierToUmlClassifier, uml.Classifier>(incUtil, (Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (uml.Classifier) notification.getOldValue(), "Java2Uml.JavaClassifierToUmlClassifier_target_Classifier"), getSelf());
			incUtil.newMessage();
			name2actor.get("InterfaceProtectedToProtected__GEN_253_localSearch").tell(new ReferenceDeleted<Java2Uml.JavaClassifierToUmlClassifier, uml.Classifier>(incUtil, (Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (uml.Classifier) notification.getOldValue(), "Java2Uml.JavaClassifierToUmlClassifier_target_Classifier"), getSelf());
			incUtil.newMessage();
			name2actor.get("InterfacePublicToPublic__GEN_257_localSearch").tell(new ReferenceDeleted<Java2Uml.JavaClassifierToUmlClassifier, uml.Classifier>(incUtil, (Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (uml.Classifier) notification.getOldValue(), "Java2Uml.JavaClassifierToUmlClassifier_target_Classifier"), getSelf());
			incUtil.newMessage();
			name2actor.get("SuperClassToSuperClass__GEN_403_localSearch").tell(new ReferenceDeleted<Java2Uml.JavaClassifierToUmlClassifier, uml.Classifier>(incUtil, (Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (uml.Classifier) notification.getOldValue(), "Java2Uml.JavaClassifierToUmlClassifier_target_Classifier"), getSelf());
			incUtil.newMessage();
			name2actor.get("SuperInterfaceToSuperInterface__GEN_407_localSearch").tell(new ReferenceDeleted<Java2Uml.JavaClassifierToUmlClassifier, uml.Classifier>(incUtil, (Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (uml.Classifier) notification.getOldValue(), "Java2Uml.JavaClassifierToUmlClassifier_target_Classifier"), getSelf());
		});
		feature2removeEdgeConsumer.put(Java2Uml.Java2UmlPackage.eINSTANCE.getJavaConstructorToOperation_Target(), notification -> {
			incUtil.newMessage();
			name2actor.get("JavaConstructorToOperation_target_0_reference").tell(new ReferenceDeleted<Java2Uml.JavaConstructorToOperation, uml.Operation>(incUtil, (Java2Uml.JavaConstructorToOperation) notification.getNotifier(), (uml.Operation) notification.getOldValue(), "Java2Uml.JavaConstructorToOperation_target_Operation"), getSelf());
			incUtil.newMessage();
			name2actor.get("OrdinaryConstructorParameterToParameter__GEN_395_localSearch").tell(new ReferenceDeleted<Java2Uml.JavaConstructorToOperation, uml.Operation>(incUtil, (Java2Uml.JavaConstructorToOperation) notification.getNotifier(), (uml.Operation) notification.getOldValue(), "Java2Uml.JavaConstructorToOperation_target_Operation"), getSelf());
			incUtil.newMessage();
			name2actor.get("VariableLengthConstructorParameterToParameter__GEN_411_localSearch").tell(new ReferenceDeleted<Java2Uml.JavaConstructorToOperation, uml.Operation>(incUtil, (Java2Uml.JavaConstructorToOperation) notification.getNotifier(), (uml.Operation) notification.getOldValue(), "Java2Uml.JavaConstructorToOperation_target_Operation"), getSelf());
		});
		feature2removeEdgeConsumer.put(uml.UmlPackage.eINSTANCE.getBehavioralFeature_OwnedParameter(), notification -> {
			incUtil.newMessage();
			name2actor.get("Operation_ownedParameter_0_reference").tell(new ReferenceDeleted<uml.BehavioralFeature, uml.Parameter>(incUtil, (uml.BehavioralFeature) notification.getNotifier(), (uml.Parameter) notification.getOldValue(), "uml.BehavioralFeature_ownedParameter_Parameter"), getSelf());
		});
		feature2removeEdgeConsumer.put(org.emftext.language.java.parameters.ParametersPackage.eINSTANCE.getParametrizable_Parameters(), notification -> {
			incUtil.newMessage();
			name2actor.get("Constructor_parameters_0_reference").tell(new ReferenceDeleted<org.emftext.language.java.parameters.Parametrizable, org.emftext.language.java.parameters.Parameter>(incUtil, (org.emftext.language.java.parameters.Parametrizable) notification.getNotifier(), (org.emftext.language.java.parameters.Parameter) notification.getOldValue(), "org.emftext.language.java.parameters.Parametrizable_parameters_Parameter"), getSelf());
			incUtil.newMessage();
			name2actor.get("ClassMethod_parameters_1_reference").tell(new ReferenceDeleted<org.emftext.language.java.parameters.Parametrizable, org.emftext.language.java.parameters.Parameter>(incUtil, (org.emftext.language.java.parameters.Parametrizable) notification.getNotifier(), (org.emftext.language.java.parameters.Parameter) notification.getOldValue(), "org.emftext.language.java.parameters.Parametrizable_parameters_Parameter"), getSelf());
		});
		feature2removeEdgeConsumer.put(Java2Uml.Java2UmlPackage.eINSTANCE.getJavaMethodToOperation_Source(), notification -> {
			incUtil.newMessage();
			name2actor.get("JavaMethodToOperation_source_0_reference").tell(new ReferenceDeleted<Java2Uml.JavaMethodToOperation, org.emftext.language.java.members.Method>(incUtil, (Java2Uml.JavaMethodToOperation) notification.getNotifier(), (org.emftext.language.java.members.Method) notification.getOldValue(), "Java2Uml.JavaMethodToOperation_source_Method"), getSelf());
			incUtil.newMessage();
			name2actor.get("MethodAbstractToAbstract__GEN_272_localSearch").tell(new ReferenceDeleted<Java2Uml.JavaMethodToOperation, org.emftext.language.java.members.Method>(incUtil, (Java2Uml.JavaMethodToOperation) notification.getNotifier(), (org.emftext.language.java.members.Method) notification.getOldValue(), "Java2Uml.JavaMethodToOperation_source_Method"), getSelf());
			incUtil.newMessage();
			name2actor.get("MethodFinalToFinal__GEN_350_localSearch").tell(new ReferenceDeleted<Java2Uml.JavaMethodToOperation, org.emftext.language.java.members.Method>(incUtil, (Java2Uml.JavaMethodToOperation) notification.getNotifier(), (org.emftext.language.java.members.Method) notification.getOldValue(), "Java2Uml.JavaMethodToOperation_source_Method"), getSelf());
			incUtil.newMessage();
			name2actor.get("MethodStaticToStatic__GEN_391_localSearch").tell(new ReferenceDeleted<Java2Uml.JavaMethodToOperation, org.emftext.language.java.members.Method>(incUtil, (Java2Uml.JavaMethodToOperation) notification.getNotifier(), (org.emftext.language.java.members.Method) notification.getOldValue(), "Java2Uml.JavaMethodToOperation_source_Method"), getSelf());
			incUtil.newMessage();
			name2actor.get("OrdinaryMethodParameterToParameter__GEN_399_localSearch").tell(new ReferenceDeleted<Java2Uml.JavaMethodToOperation, org.emftext.language.java.members.Method>(incUtil, (Java2Uml.JavaMethodToOperation) notification.getNotifier(), (org.emftext.language.java.members.Method) notification.getOldValue(), "Java2Uml.JavaMethodToOperation_source_Method"), getSelf());
			incUtil.newMessage();
			name2actor.get("VariableLengthMethodParameterToParameter__GEN_415_localSearch").tell(new ReferenceDeleted<Java2Uml.JavaMethodToOperation, org.emftext.language.java.members.Method>(incUtil, (Java2Uml.JavaMethodToOperation) notification.getNotifier(), (org.emftext.language.java.members.Method) notification.getOldValue(), "Java2Uml.JavaMethodToOperation_source_Method"), getSelf());
		});
		feature2removeEdgeConsumer.put(Java2Uml.Java2UmlPackage.eINSTANCE.getJavaCompilationUnitToUmlModel_Target(), notification -> {
			incUtil.newMessage();
			name2actor.get("JavaCompilationUnitToExistingUmlModel__GEN_266_localSearch").tell(new ReferenceDeleted<Java2Uml.JavaCompilationUnitToUmlModel, uml.Model>(incUtil, (Java2Uml.JavaCompilationUnitToUmlModel) notification.getNotifier(), (uml.Model) notification.getOldValue(), "Java2Uml.JavaCompilationUnitToUmlModel_target_Model"), getSelf());
		});
		feature2removeEdgeConsumer.put(Java2Uml.Java2UmlPackage.eINSTANCE.getJavaMethodToOperation_Target(), notification -> {
			incUtil.newMessage();
			name2actor.get("JavaMethodToOperation_target_0_reference").tell(new ReferenceDeleted<Java2Uml.JavaMethodToOperation, uml.Operation>(incUtil, (Java2Uml.JavaMethodToOperation) notification.getNotifier(), (uml.Operation) notification.getOldValue(), "Java2Uml.JavaMethodToOperation_target_Operation"), getSelf());
			incUtil.newMessage();
			name2actor.get("MethodAbstractToAbstract__GEN_272_localSearch").tell(new ReferenceDeleted<Java2Uml.JavaMethodToOperation, uml.Operation>(incUtil, (Java2Uml.JavaMethodToOperation) notification.getNotifier(), (uml.Operation) notification.getOldValue(), "Java2Uml.JavaMethodToOperation_target_Operation"), getSelf());
			incUtil.newMessage();
			name2actor.get("MethodFinalToFinal__GEN_350_localSearch").tell(new ReferenceDeleted<Java2Uml.JavaMethodToOperation, uml.Operation>(incUtil, (Java2Uml.JavaMethodToOperation) notification.getNotifier(), (uml.Operation) notification.getOldValue(), "Java2Uml.JavaMethodToOperation_target_Operation"), getSelf());
			incUtil.newMessage();
			name2actor.get("MethodStaticToStatic__GEN_391_localSearch").tell(new ReferenceDeleted<Java2Uml.JavaMethodToOperation, uml.Operation>(incUtil, (Java2Uml.JavaMethodToOperation) notification.getNotifier(), (uml.Operation) notification.getOldValue(), "Java2Uml.JavaMethodToOperation_target_Operation"), getSelf());
			incUtil.newMessage();
			name2actor.get("OrdinaryMethodParameterToParameter__GEN_399_localSearch").tell(new ReferenceDeleted<Java2Uml.JavaMethodToOperation, uml.Operation>(incUtil, (Java2Uml.JavaMethodToOperation) notification.getNotifier(), (uml.Operation) notification.getOldValue(), "Java2Uml.JavaMethodToOperation_target_Operation"), getSelf());
			incUtil.newMessage();
			name2actor.get("VariableLengthMethodParameterToParameter__GEN_415_localSearch").tell(new ReferenceDeleted<Java2Uml.JavaMethodToOperation, uml.Operation>(incUtil, (Java2Uml.JavaMethodToOperation) notification.getNotifier(), (uml.Operation) notification.getOldValue(), "Java2Uml.JavaMethodToOperation_target_Operation"), getSelf());
		});
		feature2removeEdgeConsumer.put(Java2Uml.Java2UmlPackage.eINSTANCE.getJavaParameterToParameter_Source(), notification -> {
			incUtil.newMessage();
			name2actor.get("JavaParameterToParameter_source_0_reference").tell(new ReferenceDeleted<Java2Uml.JavaParameterToParameter, org.emftext.language.java.parameters.Parameter>(incUtil, (Java2Uml.JavaParameterToParameter) notification.getNotifier(), (org.emftext.language.java.parameters.Parameter) notification.getOldValue(), "Java2Uml.JavaParameterToParameter_source_Parameter"), getSelf());
		});
		feature2removeEdgeConsumer.put(Java2Uml.Java2UmlPackage.eINSTANCE.getJavaCompilationUnitToUmlModel_Source(), notification -> {
			incUtil.newMessage();
			name2actor.get("JavaCompilationUnitToExistingUmlModel__GEN_266_localSearch").tell(new ReferenceDeleted<Java2Uml.JavaCompilationUnitToUmlModel, org.emftext.language.java.containers.CompilationUnit>(incUtil, (Java2Uml.JavaCompilationUnitToUmlModel) notification.getNotifier(), (org.emftext.language.java.containers.CompilationUnit) notification.getOldValue(), "Java2Uml.JavaCompilationUnitToUmlModel_source_CompilationUnit"), getSelf());
		});
		feature2removeEdgeConsumer.put(Java2Uml.Java2UmlPackage.eINSTANCE.getJavaClassifierToUmlClassifier_Source(), notification -> {
			incUtil.newMessage();
			name2actor.get("JavaClassifierToUmlClassifier_source_0_reference").tell(new ReferenceDeleted<Java2Uml.JavaClassifierToUmlClassifier, org.emftext.language.java.classifiers.Classifier>(incUtil, (Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (org.emftext.language.java.classifiers.Classifier) notification.getOldValue(), "Java2Uml.JavaClassifierToUmlClassifier_source_Classifier"), getSelf());
			incUtil.newMessage();
			name2actor.get("JavaClassifierToUmlClassifier_source_1_reference").tell(new ReferenceDeleted<Java2Uml.JavaClassifierToUmlClassifier, org.emftext.language.java.classifiers.Classifier>(incUtil, (Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (org.emftext.language.java.classifiers.Classifier) notification.getOldValue(), "Java2Uml.JavaClassifierToUmlClassifier_source_Classifier"), getSelf());
			incUtil.newMessage();
			name2actor.get("JavaClassifierToUmlClassifier_source_2_reference").tell(new ReferenceDeleted<Java2Uml.JavaClassifierToUmlClassifier, org.emftext.language.java.classifiers.Classifier>(incUtil, (Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (org.emftext.language.java.classifiers.Classifier) notification.getOldValue(), "Java2Uml.JavaClassifierToUmlClassifier_source_Classifier"), getSelf());
			incUtil.newMessage();
			name2actor.get("ClassAbstractToAbstract__GEN_1_localSearch").tell(new ReferenceDeleted<Java2Uml.JavaClassifierToUmlClassifier, org.emftext.language.java.classifiers.Classifier>(incUtil, (Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (org.emftext.language.java.classifiers.Classifier) notification.getOldValue(), "Java2Uml.JavaClassifierToUmlClassifier_source_Classifier"), getSelf());
			incUtil.newMessage();
			name2actor.get("ClassAttributeToProperty__GEN_5_localSearch").tell(new ReferenceDeleted<Java2Uml.JavaClassifierToUmlClassifier, org.emftext.language.java.classifiers.Classifier>(incUtil, (Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (org.emftext.language.java.classifiers.Classifier) notification.getOldValue(), "Java2Uml.JavaClassifierToUmlClassifier_source_Classifier"), getSelf());
			incUtil.newMessage();
			name2actor.get("ClassConstructorToConstructor__GEN_22_localSearch").tell(new ReferenceDeleted<Java2Uml.JavaClassifierToUmlClassifier, org.emftext.language.java.classifiers.Classifier>(incUtil, (Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (org.emftext.language.java.classifiers.Classifier) notification.getOldValue(), "Java2Uml.JavaClassifierToUmlClassifier_source_Classifier"), getSelf());
			incUtil.newMessage();
			name2actor.get("ClassFinalToFinal__GEN_26_localSearch").tell(new ReferenceDeleted<Java2Uml.JavaClassifierToUmlClassifier, org.emftext.language.java.classifiers.Classifier>(incUtil, (Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (org.emftext.language.java.classifiers.Classifier) notification.getOldValue(), "Java2Uml.JavaClassifierToUmlClassifier_source_Classifier"), getSelf());
			incUtil.newMessage();
			name2actor.get("ClassImplementToClassImplement__GEN_30_localSearch").tell(new ReferenceDeleted<Java2Uml.JavaClassifierToUmlClassifier, org.emftext.language.java.classifiers.Classifier>(incUtil, (Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (org.emftext.language.java.classifiers.Classifier) notification.getOldValue(), "Java2Uml.JavaClassifierToUmlClassifier_source_Classifier"), getSelf());
			incUtil.newMessage();
			name2actor.get("ClassMethodToMethod__GEN_34_localSearch").tell(new ReferenceDeleted<Java2Uml.JavaClassifierToUmlClassifier, org.emftext.language.java.classifiers.Classifier>(incUtil, (Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (org.emftext.language.java.classifiers.Classifier) notification.getOldValue(), "Java2Uml.JavaClassifierToUmlClassifier_source_Classifier"), getSelf());
			incUtil.newMessage();
			name2actor.get("ClassPrivateToPrivate__GEN_38_localSearch").tell(new ReferenceDeleted<Java2Uml.JavaClassifierToUmlClassifier, org.emftext.language.java.classifiers.Classifier>(incUtil, (Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (org.emftext.language.java.classifiers.Classifier) notification.getOldValue(), "Java2Uml.JavaClassifierToUmlClassifier_source_Classifier"), getSelf());
			incUtil.newMessage();
			name2actor.get("ClassProtectedToProtected__GEN_42_localSearch").tell(new ReferenceDeleted<Java2Uml.JavaClassifierToUmlClassifier, org.emftext.language.java.classifiers.Classifier>(incUtil, (Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (org.emftext.language.java.classifiers.Classifier) notification.getOldValue(), "Java2Uml.JavaClassifierToUmlClassifier_source_Classifier"), getSelf());
			incUtil.newMessage();
			name2actor.get("ClassPublicToPublic__GEN_46_localSearch").tell(new ReferenceDeleted<Java2Uml.JavaClassifierToUmlClassifier, org.emftext.language.java.classifiers.Classifier>(incUtil, (Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (org.emftext.language.java.classifiers.Classifier) notification.getOldValue(), "Java2Uml.JavaClassifierToUmlClassifier_source_Classifier"), getSelf());
			incUtil.newMessage();
			name2actor.get("EnumAbstractToAbstract__GEN_127_localSearch").tell(new ReferenceDeleted<Java2Uml.JavaClassifierToUmlClassifier, org.emftext.language.java.classifiers.Classifier>(incUtil, (Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (org.emftext.language.java.classifiers.Classifier) notification.getOldValue(), "Java2Uml.JavaClassifierToUmlClassifier_source_Classifier"), getSelf());
			incUtil.newMessage();
			name2actor.get("EnumAttributeToProperty__GEN_131_localSearch").tell(new ReferenceDeleted<Java2Uml.JavaClassifierToUmlClassifier, org.emftext.language.java.classifiers.Classifier>(incUtil, (Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (org.emftext.language.java.classifiers.Classifier) notification.getOldValue(), "Java2Uml.JavaClassifierToUmlClassifier_source_Classifier"), getSelf());
			incUtil.newMessage();
			name2actor.get("EnumConstantToEnumConstant__GEN_148_localSearch").tell(new ReferenceDeleted<Java2Uml.JavaClassifierToUmlClassifier, org.emftext.language.java.classifiers.Classifier>(incUtil, (Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (org.emftext.language.java.classifiers.Classifier) notification.getOldValue(), "Java2Uml.JavaClassifierToUmlClassifier_source_Classifier"), getSelf());
			incUtil.newMessage();
			name2actor.get("EnumFinalToFinal__GEN_152_localSearch").tell(new ReferenceDeleted<Java2Uml.JavaClassifierToUmlClassifier, org.emftext.language.java.classifiers.Classifier>(incUtil, (Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (org.emftext.language.java.classifiers.Classifier) notification.getOldValue(), "Java2Uml.JavaClassifierToUmlClassifier_source_Classifier"), getSelf());
			incUtil.newMessage();
			name2actor.get("EnumPrivateToPrivate__GEN_156_localSearch").tell(new ReferenceDeleted<Java2Uml.JavaClassifierToUmlClassifier, org.emftext.language.java.classifiers.Classifier>(incUtil, (Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (org.emftext.language.java.classifiers.Classifier) notification.getOldValue(), "Java2Uml.JavaClassifierToUmlClassifier_source_Classifier"), getSelf());
			incUtil.newMessage();
			name2actor.get("EnumProtectedToProtected__GEN_160_localSearch").tell(new ReferenceDeleted<Java2Uml.JavaClassifierToUmlClassifier, org.emftext.language.java.classifiers.Classifier>(incUtil, (Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (org.emftext.language.java.classifiers.Classifier) notification.getOldValue(), "Java2Uml.JavaClassifierToUmlClassifier_source_Classifier"), getSelf());
			incUtil.newMessage();
			name2actor.get("EnumPublicToPublic__GEN_164_localSearch").tell(new ReferenceDeleted<Java2Uml.JavaClassifierToUmlClassifier, org.emftext.language.java.classifiers.Classifier>(incUtil, (Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (org.emftext.language.java.classifiers.Classifier) notification.getOldValue(), "Java2Uml.JavaClassifierToUmlClassifier_source_Classifier"), getSelf());
			incUtil.newMessage();
			name2actor.get("InterfaceAbstractToAbstract__GEN_220_localSearch").tell(new ReferenceDeleted<Java2Uml.JavaClassifierToUmlClassifier, org.emftext.language.java.classifiers.Classifier>(incUtil, (Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (org.emftext.language.java.classifiers.Classifier) notification.getOldValue(), "Java2Uml.JavaClassifierToUmlClassifier_source_Classifier"), getSelf());
			incUtil.newMessage();
			name2actor.get("InterfaceConstructorToConstructor__GEN_237_localSearch").tell(new ReferenceDeleted<Java2Uml.JavaClassifierToUmlClassifier, org.emftext.language.java.classifiers.Classifier>(incUtil, (Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (org.emftext.language.java.classifiers.Classifier) notification.getOldValue(), "Java2Uml.JavaClassifierToUmlClassifier_source_Classifier"), getSelf());
			incUtil.newMessage();
			name2actor.get("InterfaceFinalToFinal__GEN_241_localSearch").tell(new ReferenceDeleted<Java2Uml.JavaClassifierToUmlClassifier, org.emftext.language.java.classifiers.Classifier>(incUtil, (Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (org.emftext.language.java.classifiers.Classifier) notification.getOldValue(), "Java2Uml.JavaClassifierToUmlClassifier_source_Classifier"), getSelf());
			incUtil.newMessage();
			name2actor.get("InterfaceMethodToMethod__GEN_245_localSearch").tell(new ReferenceDeleted<Java2Uml.JavaClassifierToUmlClassifier, org.emftext.language.java.classifiers.Classifier>(incUtil, (Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (org.emftext.language.java.classifiers.Classifier) notification.getOldValue(), "Java2Uml.JavaClassifierToUmlClassifier_source_Classifier"), getSelf());
			incUtil.newMessage();
			name2actor.get("InterfacePrivateToPrivate__GEN_249_localSearch").tell(new ReferenceDeleted<Java2Uml.JavaClassifierToUmlClassifier, org.emftext.language.java.classifiers.Classifier>(incUtil, (Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (org.emftext.language.java.classifiers.Classifier) notification.getOldValue(), "Java2Uml.JavaClassifierToUmlClassifier_source_Classifier"), getSelf());
			incUtil.newMessage();
			name2actor.get("InterfaceProtectedToProtected__GEN_253_localSearch").tell(new ReferenceDeleted<Java2Uml.JavaClassifierToUmlClassifier, org.emftext.language.java.classifiers.Classifier>(incUtil, (Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (org.emftext.language.java.classifiers.Classifier) notification.getOldValue(), "Java2Uml.JavaClassifierToUmlClassifier_source_Classifier"), getSelf());
			incUtil.newMessage();
			name2actor.get("InterfacePublicToPublic__GEN_257_localSearch").tell(new ReferenceDeleted<Java2Uml.JavaClassifierToUmlClassifier, org.emftext.language.java.classifiers.Classifier>(incUtil, (Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (org.emftext.language.java.classifiers.Classifier) notification.getOldValue(), "Java2Uml.JavaClassifierToUmlClassifier_source_Classifier"), getSelf());
			incUtil.newMessage();
			name2actor.get("SuperClassToSuperClass__GEN_403_localSearch").tell(new ReferenceDeleted<Java2Uml.JavaClassifierToUmlClassifier, org.emftext.language.java.classifiers.Classifier>(incUtil, (Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (org.emftext.language.java.classifiers.Classifier) notification.getOldValue(), "Java2Uml.JavaClassifierToUmlClassifier_source_Classifier"), getSelf());
			incUtil.newMessage();
			name2actor.get("SuperInterfaceToSuperInterface__GEN_407_localSearch").tell(new ReferenceDeleted<Java2Uml.JavaClassifierToUmlClassifier, org.emftext.language.java.classifiers.Classifier>(incUtil, (Java2Uml.JavaClassifierToUmlClassifier) notification.getNotifier(), (org.emftext.language.java.classifiers.Classifier) notification.getOldValue(), "Java2Uml.JavaClassifierToUmlClassifier_source_Classifier"), getSelf());
		});
		feature2removeEdgeConsumer.put(Java2Uml.Java2UmlPackage.eINSTANCE.getJavaConstructorToOperation_Source(), notification -> {
			incUtil.newMessage();
			name2actor.get("JavaConstructorToOperation_source_0_reference").tell(new ReferenceDeleted<Java2Uml.JavaConstructorToOperation, org.emftext.language.java.members.Constructor>(incUtil, (Java2Uml.JavaConstructorToOperation) notification.getNotifier(), (org.emftext.language.java.members.Constructor) notification.getOldValue(), "Java2Uml.JavaConstructorToOperation_source_Constructor"), getSelf());
			incUtil.newMessage();
			name2actor.get("OrdinaryConstructorParameterToParameter__GEN_395_localSearch").tell(new ReferenceDeleted<Java2Uml.JavaConstructorToOperation, org.emftext.language.java.members.Constructor>(incUtil, (Java2Uml.JavaConstructorToOperation) notification.getNotifier(), (org.emftext.language.java.members.Constructor) notification.getOldValue(), "Java2Uml.JavaConstructorToOperation_source_Constructor"), getSelf());
			incUtil.newMessage();
			name2actor.get("VariableLengthConstructorParameterToParameter__GEN_411_localSearch").tell(new ReferenceDeleted<Java2Uml.JavaConstructorToOperation, org.emftext.language.java.members.Constructor>(incUtil, (Java2Uml.JavaConstructorToOperation) notification.getNotifier(), (org.emftext.language.java.members.Constructor) notification.getOldValue(), "Java2Uml.JavaConstructorToOperation_source_Constructor"), getSelf());
		});
		feature2removeEdgeConsumer.put(Java2Uml.Java2UmlPackage.eINSTANCE.getJavaPackageToUmlPackage_Source(), notification -> {
			incUtil.newMessage();
			name2actor.get("ClassToUmlClass__GEN_50_localSearch").tell(new ReferenceDeleted<Java2Uml.JavaPackageToUmlPackage, org.emftext.language.java.containers.Package>(incUtil, (Java2Uml.JavaPackageToUmlPackage) notification.getNotifier(), (org.emftext.language.java.containers.Package) notification.getOldValue(), "Java2Uml.JavaPackageToUmlPackage_source_Package"), getSelf());
			incUtil.newMessage();
			name2actor.get("EnumToUmlEnum__GEN_168_localSearch").tell(new ReferenceDeleted<Java2Uml.JavaPackageToUmlPackage, org.emftext.language.java.containers.Package>(incUtil, (Java2Uml.JavaPackageToUmlPackage) notification.getNotifier(), (org.emftext.language.java.containers.Package) notification.getOldValue(), "Java2Uml.JavaPackageToUmlPackage_source_Package"), getSelf());
			incUtil.newMessage();
			name2actor.get("InterfaceToUmlInterface__GEN_261_localSearch").tell(new ReferenceDeleted<Java2Uml.JavaPackageToUmlPackage, org.emftext.language.java.containers.Package>(incUtil, (Java2Uml.JavaPackageToUmlPackage) notification.getNotifier(), (org.emftext.language.java.containers.Package) notification.getOldValue(), "Java2Uml.JavaPackageToUmlPackage_source_Package"), getSelf());
		});
		feature2removeEdgeConsumer.put(Java2Uml.Java2UmlPackage.eINSTANCE.getJavaParameterToParameter_Target(), notification -> {
			incUtil.newMessage();
			name2actor.get("JavaParameterToParameter_target_0_reference").tell(new ReferenceDeleted<Java2Uml.JavaParameterToParameter, uml.Parameter>(incUtil, (Java2Uml.JavaParameterToParameter) notification.getNotifier(), (uml.Parameter) notification.getOldValue(), "Java2Uml.JavaParameterToParameter_target_Parameter"), getSelf());
		});
		feature2removeEdgeConsumer.put(Java2Uml.Java2UmlPackage.eINSTANCE.getJavaAttributeToUmlProperty_Source(), notification -> {
			incUtil.newMessage();
			name2actor.get("JavaAttributeToUmlProperty_source_0_reference").tell(new ReferenceDeleted<Java2Uml.JavaAttributeToUmlProperty, org.emftext.language.java.members.Field>(incUtil, (Java2Uml.JavaAttributeToUmlProperty) notification.getNotifier(), (org.emftext.language.java.members.Field) notification.getOldValue(), "Java2Uml.JavaAttributeToUmlProperty_source_Field"), getSelf());
			incUtil.newMessage();
			name2actor.get("FieldFinalToFinal__GEN_212_localSearch").tell(new ReferenceDeleted<Java2Uml.JavaAttributeToUmlProperty, org.emftext.language.java.members.Field>(incUtil, (Java2Uml.JavaAttributeToUmlProperty) notification.getNotifier(), (org.emftext.language.java.members.Field) notification.getOldValue(), "Java2Uml.JavaAttributeToUmlProperty_source_Field"), getSelf());
			incUtil.newMessage();
			name2actor.get("FieldStaticToStatic__GEN_216_localSearch").tell(new ReferenceDeleted<Java2Uml.JavaAttributeToUmlProperty, org.emftext.language.java.members.Field>(incUtil, (Java2Uml.JavaAttributeToUmlProperty) notification.getNotifier(), (org.emftext.language.java.members.Field) notification.getOldValue(), "Java2Uml.JavaAttributeToUmlProperty_source_Field"), getSelf());
		});
		feature2removeEdgeConsumer.put(org.emftext.language.java.containers.ContainersPackage.eINSTANCE.getPackage_CompilationUnits(), notification -> {
			incUtil.newMessage();
			name2actor.get("ClassToUmlClass__GEN_50_localSearch").tell(new ReferenceDeleted<org.emftext.language.java.containers.Package, org.emftext.language.java.containers.CompilationUnit>(incUtil, (org.emftext.language.java.containers.Package) notification.getNotifier(), (org.emftext.language.java.containers.CompilationUnit) notification.getOldValue(), "org.emftext.language.java.containers.Package_compilationUnits_CompilationUnit"), getSelf());
			incUtil.newMessage();
			name2actor.get("EnumToUmlEnum__GEN_168_localSearch").tell(new ReferenceDeleted<org.emftext.language.java.containers.Package, org.emftext.language.java.containers.CompilationUnit>(incUtil, (org.emftext.language.java.containers.Package) notification.getNotifier(), (org.emftext.language.java.containers.CompilationUnit) notification.getOldValue(), "org.emftext.language.java.containers.Package_compilationUnits_CompilationUnit"), getSelf());
			incUtil.newMessage();
			name2actor.get("InterfaceToUmlInterface__GEN_261_localSearch").tell(new ReferenceDeleted<org.emftext.language.java.containers.Package, org.emftext.language.java.containers.CompilationUnit>(incUtil, (org.emftext.language.java.containers.Package) notification.getNotifier(), (org.emftext.language.java.containers.CompilationUnit) notification.getOldValue(), "org.emftext.language.java.containers.Package_compilationUnits_CompilationUnit"), getSelf());
			incUtil.newMessage();
			name2actor.get("JavaCompilationUnitToExistingUmlModel__GEN_266_localSearch").tell(new ReferenceDeleted<org.emftext.language.java.containers.Package, org.emftext.language.java.containers.CompilationUnit>(incUtil, (org.emftext.language.java.containers.Package) notification.getNotifier(), (org.emftext.language.java.containers.CompilationUnit) notification.getOldValue(), "org.emftext.language.java.containers.Package_compilationUnits_CompilationUnit"), getSelf());
		});
	}

	@Override
	public void preStart() throws Exception {
		super.preStart();
	}

	@Override
	public void postStop() throws Exception {
		if(HiPEConfig.logWorkloadActivated) {
			DecimalFormat df = new DecimalFormat("0.#####");
	        df.setMaximumFractionDigits(5);
			System.err.println("DispatchNode" + ";"  + counter + ";" + df.format((double) time / (double) (1000 * 1000 * 1000)));
		}
	}

	@Override
	public Receive createReceive() {
		return receiveBuilder() //
				.match(NotificationContainer.class, this::handleNotificationContainer)
				.match(NoMoreInput.class, this::sendFinished) //
				.build();
	}

	private void sendFinished(NoMoreInput m) {
		incUtil.allMessagesInserted();
	}
	
	private void handleNotificationContainer(NotificationContainer nc) {
		counter++;
		long tic = System.nanoTime();
		nc.notifications.parallelStream().forEach(this::handleNotification);
		time += System.nanoTime() - tic;
	}
	
	private void handleNotification(Notification notification) {
		switch (notification.getEventType()) {
		case Notification.ADD:
			handleAdd(notification);
			break;
		case Notification.REMOVE:
			handleRemove(notification);
			break;
		case Notification.REMOVING_ADAPTER:
			handleRemoveAdapter(notification);
			break;	
		case Notification.SET:
			handleSet(notification);
			break;
		}
	}

	private void handleAdd(Notification notification) {
		if(notification.getFeature() == null) 
			handleAddedNode(notification.getNewValue());
		else
			handleAddedEdge(notification);
	}

	private void handleAddedNode(Object node) {
		if(node == null) 
			return;
			
		EObject obj = (EObject) node;
		if(type2addConsumer.containsKey(obj.eClass())) {
			type2addConsumer.get(obj.eClass()).accept(node);
		}
	}
	
	private void handleSet(Notification notification) {
		Object feature = notification.getFeature();
		if(feature2setConsumer.containsKey(feature)) {
			feature2setConsumer.get(feature).accept(notification);
		}
	}

	private void handleAddedEdge(Notification notification) {
		//check for self-edges
		if(notification.getNotifier().equals(notification.getNewValue()))
			handleAddedNode(notification.getNewValue());
					
		Object feature = notification.getFeature();
		if(feature2addEdgeConsumer.containsKey(feature)) {
			feature2addEdgeConsumer.get(feature).accept(notification);
		}
	}

	private void handleRemove(Notification notification) {
		Object feature = notification.getFeature();
		if(feature2removeEdgeConsumer.containsKey(feature)) {
			feature2removeEdgeConsumer.get(feature).accept(notification);
		}
	}
	
	private void handleRemoveAdapter(Notification notification) {
		Object node = notification.getNotifier();
		if (node instanceof Java2Uml.JavaAttributeToUmlProperty) {
			incUtil.newMessage();
			name2actor.get("JavaAttributeToUmlProperty_object").tell(new ObjectDeleted<Java2Uml.JavaAttributeToUmlProperty>(incUtil, (Java2Uml.JavaAttributeToUmlProperty) node), getSelf());
		}
		if (node instanceof Java2Uml.JavaPackageToUmlPackage) {
			incUtil.newMessage();
			name2actor.get("JavaPackageToUmlPackage_object").tell(new ObjectDeleted<Java2Uml.JavaPackageToUmlPackage>(incUtil, (Java2Uml.JavaPackageToUmlPackage) node), getSelf());
		}
		if (node instanceof Java2Uml.JavaParameterToParameter) {
			incUtil.newMessage();
			name2actor.get("JavaParameterToParameter_object").tell(new ObjectDeleted<Java2Uml.JavaParameterToParameter>(incUtil, (Java2Uml.JavaParameterToParameter) node), getSelf());
		}
		if (node instanceof Java2Uml.JavaConstructorToOperation) {
			incUtil.newMessage();
			name2actor.get("JavaConstructorToOperation_object").tell(new ObjectDeleted<Java2Uml.JavaConstructorToOperation>(incUtil, (Java2Uml.JavaConstructorToOperation) node), getSelf());
		}
		if (node instanceof Java2Uml.JavaCompilationUnitToUmlModel) {
			incUtil.newMessage();
			name2actor.get("JavaCompilationUnitToUmlModel_object").tell(new ObjectDeleted<Java2Uml.JavaCompilationUnitToUmlModel>(incUtil, (Java2Uml.JavaCompilationUnitToUmlModel) node), getSelf());
		}
		if (node instanceof Java2Uml.JavaClassifierToUmlClassifier) {
			incUtil.newMessage();
			name2actor.get("JavaClassifierToUmlClassifier_object_SP0").tell(new ObjectDeleted<Java2Uml.JavaClassifierToUmlClassifier>(incUtil, (Java2Uml.JavaClassifierToUmlClassifier) node), getSelf());
		}
		if (node instanceof Java2Uml.JavaClassifierToUmlClassifier) {
			incUtil.newMessage();
			name2actor.get("JavaClassifierToUmlClassifier_object_SP1").tell(new ObjectDeleted<Java2Uml.JavaClassifierToUmlClassifier>(incUtil, (Java2Uml.JavaClassifierToUmlClassifier) node), getSelf());
		}
		if (node instanceof Java2Uml.JavaClassifierToUmlClassifier) {
			incUtil.newMessage();
			name2actor.get("JavaClassifierToUmlClassifier_object_SP2").tell(new ObjectDeleted<Java2Uml.JavaClassifierToUmlClassifier>(incUtil, (Java2Uml.JavaClassifierToUmlClassifier) node), getSelf());
		}
		if (node instanceof Java2Uml.JavaClassifierToUmlClassifier) {
			incUtil.newMessage();
			name2actor.get("JavaClassifierToUmlClassifier_object_SP3").tell(new ObjectDeleted<Java2Uml.JavaClassifierToUmlClassifier>(incUtil, (Java2Uml.JavaClassifierToUmlClassifier) node), getSelf());
		}
		if (node instanceof Java2Uml.JavaClassifierToUmlClassifier) {
			incUtil.newMessage();
			name2actor.get("JavaClassifierToUmlClassifier_object_SP4").tell(new ObjectDeleted<Java2Uml.JavaClassifierToUmlClassifier>(incUtil, (Java2Uml.JavaClassifierToUmlClassifier) node), getSelf());
		}
		if (node instanceof Java2Uml.JavaClassifierToUmlClassifier) {
			incUtil.newMessage();
			name2actor.get("JavaClassifierToUmlClassifier_object_SP5").tell(new ObjectDeleted<Java2Uml.JavaClassifierToUmlClassifier>(incUtil, (Java2Uml.JavaClassifierToUmlClassifier) node), getSelf());
		}
		if (node instanceof Java2Uml.JavaClassifierToUmlClassifier) {
			incUtil.newMessage();
			name2actor.get("JavaClassifierToUmlClassifier_object_SP6").tell(new ObjectDeleted<Java2Uml.JavaClassifierToUmlClassifier>(incUtil, (Java2Uml.JavaClassifierToUmlClassifier) node), getSelf());
		}
		if (node instanceof Java2Uml.JavaClassifierToUmlClassifier) {
			incUtil.newMessage();
			name2actor.get("JavaClassifierToUmlClassifier_object_SP7").tell(new ObjectDeleted<Java2Uml.JavaClassifierToUmlClassifier>(incUtil, (Java2Uml.JavaClassifierToUmlClassifier) node), getSelf());
		}
		if (node instanceof Java2Uml.JavaMethodToOperation) {
			incUtil.newMessage();
			name2actor.get("JavaMethodToOperation_object_SP0").tell(new ObjectDeleted<Java2Uml.JavaMethodToOperation>(incUtil, (Java2Uml.JavaMethodToOperation) node), getSelf());
		}
		if (node instanceof Java2Uml.JavaMethodToOperation) {
			incUtil.newMessage();
			name2actor.get("JavaMethodToOperation_object_SP1").tell(new ObjectDeleted<Java2Uml.JavaMethodToOperation>(incUtil, (Java2Uml.JavaMethodToOperation) node), getSelf());
		}
		if (node instanceof uml.Property) {
			incUtil.newMessage();
			name2actor.get("Property_object").tell(new ObjectDeleted<uml.Property>(incUtil, (uml.Property) node), getSelf());
		}
		if (node instanceof uml.Package) {
			incUtil.newMessage();
			name2actor.get("Package_1_object").tell(new ObjectDeleted<uml.Package>(incUtil, (uml.Package) node), getSelf());
		}
		if (node instanceof uml.Parameter) {
			incUtil.newMessage();
			name2actor.get("Parameter_object").tell(new ObjectDeleted<uml.Parameter>(incUtil, (uml.Parameter) node), getSelf());
		}
		if (node instanceof uml.Model) {
			incUtil.newMessage();
			name2actor.get("Model_object").tell(new ObjectDeleted<uml.Model>(incUtil, (uml.Model) node), getSelf());
		}
		if (node instanceof uml.Class) {
			incUtil.newMessage();
			name2actor.get("Class_1_object_SP0").tell(new ObjectDeleted<uml.Class>(incUtil, (uml.Class) node), getSelf());
		}
		if (node instanceof uml.Class) {
			incUtil.newMessage();
			name2actor.get("Class_1_object_SP1").tell(new ObjectDeleted<uml.Class>(incUtil, (uml.Class) node), getSelf());
		}
		if (node instanceof uml.Class) {
			incUtil.newMessage();
			name2actor.get("Class_1_object_SP2").tell(new ObjectDeleted<uml.Class>(incUtil, (uml.Class) node), getSelf());
		}
		if (node instanceof uml.Operation) {
			incUtil.newMessage();
			name2actor.get("Operation_object_SP0").tell(new ObjectDeleted<uml.Operation>(incUtil, (uml.Operation) node), getSelf());
		}
		if (node instanceof uml.Operation) {
			incUtil.newMessage();
			name2actor.get("Operation_object_SP1").tell(new ObjectDeleted<uml.Operation>(incUtil, (uml.Operation) node), getSelf());
		}
		if (node instanceof uml.Operation) {
			incUtil.newMessage();
			name2actor.get("Operation_object_SP2").tell(new ObjectDeleted<uml.Operation>(incUtil, (uml.Operation) node), getSelf());
		}
		if (node instanceof uml.Enumeration) {
			incUtil.newMessage();
			name2actor.get("Enumeration_1_object_SP0").tell(new ObjectDeleted<uml.Enumeration>(incUtil, (uml.Enumeration) node), getSelf());
		}
		if (node instanceof uml.Enumeration) {
			incUtil.newMessage();
			name2actor.get("Enumeration_1_object_SP1").tell(new ObjectDeleted<uml.Enumeration>(incUtil, (uml.Enumeration) node), getSelf());
		}
		if (node instanceof uml.Interface) {
			incUtil.newMessage();
			name2actor.get("Interface_1_object_SP0").tell(new ObjectDeleted<uml.Interface>(incUtil, (uml.Interface) node), getSelf());
		}
		if (node instanceof uml.Interface) {
			incUtil.newMessage();
			name2actor.get("Interface_1_object_SP1").tell(new ObjectDeleted<uml.Interface>(incUtil, (uml.Interface) node), getSelf());
		}
		if (node instanceof uml.Interface) {
			incUtil.newMessage();
			name2actor.get("Interface_1_object_SP2").tell(new ObjectDeleted<uml.Interface>(incUtil, (uml.Interface) node), getSelf());
		}
		if (node instanceof org.emftext.language.java.annotations.Annotable) {
			org.emftext.language.java.annotations.Annotable _annotable = (org.emftext.language.java.annotations.Annotable) node;
			_annotable.getAnnotations().forEach(this::handleAddedNode);
		}
		if (node instanceof org.emftext.language.java.annotations.AnnotationInstance) {
			org.emftext.language.java.annotations.AnnotationInstance _annotationinstance = (org.emftext.language.java.annotations.AnnotationInstance) node;
			handleAddedNode(_annotationinstance.getParameter());
		}
		if (node instanceof org.emftext.language.java.annotations.AnnotationParameter) {
			org.emftext.language.java.annotations.AnnotationParameter _annotationparameter = (org.emftext.language.java.annotations.AnnotationParameter) node;
		}
		if (node instanceof org.emftext.language.java.annotations.SingleAnnotationParameter) {
			org.emftext.language.java.annotations.SingleAnnotationParameter _singleannotationparameter = (org.emftext.language.java.annotations.SingleAnnotationParameter) node;
			handleAddedNode(_singleannotationparameter.getValue());
		}
		if (node instanceof org.emftext.language.java.annotations.AnnotationParameterList) {
			org.emftext.language.java.annotations.AnnotationParameterList _annotationparameterlist = (org.emftext.language.java.annotations.AnnotationParameterList) node;
			_annotationparameterlist.getSettings().forEach(this::handleAddedNode);
		}
		if (node instanceof org.emftext.language.java.annotations.AnnotationAttributeSetting) {
			org.emftext.language.java.annotations.AnnotationAttributeSetting _annotationattributesetting = (org.emftext.language.java.annotations.AnnotationAttributeSetting) node;
			handleAddedNode(_annotationattributesetting.getValue());
		}
		if (node instanceof org.emftext.language.java.annotations.AnnotationValue) {
			org.emftext.language.java.annotations.AnnotationValue _annotationvalue = (org.emftext.language.java.annotations.AnnotationValue) node;
		}
		if (node instanceof org.emftext.language.java.annotations.AnnotationAttribute) {
			org.emftext.language.java.annotations.AnnotationAttribute _annotationattribute = (org.emftext.language.java.annotations.AnnotationAttribute) node;
			handleAddedNode(_annotationattribute.getDefaultValue());
		}
		if (node instanceof org.emftext.language.java.arrays.ArrayTypeable) {
			org.emftext.language.java.arrays.ArrayTypeable _arraytypeable = (org.emftext.language.java.arrays.ArrayTypeable) node;
			_arraytypeable.getArrayDimensionsBefore().forEach(this::handleAddedNode);
			_arraytypeable.getArrayDimensionsAfter().forEach(this::handleAddedNode);
		}
		if (node instanceof org.emftext.language.java.arrays.ArrayDimension) {
			org.emftext.language.java.arrays.ArrayDimension _arraydimension = (org.emftext.language.java.arrays.ArrayDimension) node;
		}
		if (node instanceof org.emftext.language.java.arrays.ArrayInitializer) {
			org.emftext.language.java.arrays.ArrayInitializer _arrayinitializer = (org.emftext.language.java.arrays.ArrayInitializer) node;
			_arrayinitializer.getInitialValues().forEach(this::handleAddedNode);
		}
		if (node instanceof org.emftext.language.java.arrays.ArrayInitializationValue) {
			org.emftext.language.java.arrays.ArrayInitializationValue _arrayinitializationvalue = (org.emftext.language.java.arrays.ArrayInitializationValue) node;
		}
		if (node instanceof org.emftext.language.java.arrays.ArrayInstantiation) {
			org.emftext.language.java.arrays.ArrayInstantiation _arrayinstantiation = (org.emftext.language.java.arrays.ArrayInstantiation) node;
		}
		if (node instanceof org.emftext.language.java.arrays.ArrayInstantiationBySize) {
			org.emftext.language.java.arrays.ArrayInstantiationBySize _arrayinstantiationbysize = (org.emftext.language.java.arrays.ArrayInstantiationBySize) node;
			_arrayinstantiationbysize.getSizes().forEach(this::handleAddedNode);
		}
		if (node instanceof org.emftext.language.java.arrays.ArrayInstantiationByValues) {
			org.emftext.language.java.arrays.ArrayInstantiationByValues _arrayinstantiationbyvalues = (org.emftext.language.java.arrays.ArrayInstantiationByValues) node;
			handleAddedNode(_arrayinstantiationbyvalues.getArrayInitializer());
		}
		if (node instanceof org.emftext.language.java.arrays.ArrayInstantiationByValuesUntyped) {
			org.emftext.language.java.arrays.ArrayInstantiationByValuesUntyped _arrayinstantiationbyvaluesuntyped = (org.emftext.language.java.arrays.ArrayInstantiationByValuesUntyped) node;
		}
		if (node instanceof org.emftext.language.java.arrays.ArrayInstantiationByValuesTyped) {
			org.emftext.language.java.arrays.ArrayInstantiationByValuesTyped _arrayinstantiationbyvaluestyped = (org.emftext.language.java.arrays.ArrayInstantiationByValuesTyped) node;
		}
		if (node instanceof org.emftext.language.java.arrays.ArraySelector) {
			org.emftext.language.java.arrays.ArraySelector _arrayselector = (org.emftext.language.java.arrays.ArraySelector) node;
			handleAddedNode(_arrayselector.getPosition());
		}
		if (node instanceof org.emftext.language.java.classifiers.Classifier) {
			org.emftext.language.java.classifiers.Classifier _classifier = (org.emftext.language.java.classifiers.Classifier) node;
		}
		if (node instanceof org.emftext.language.java.classifiers.ConcreteClassifier) {
			org.emftext.language.java.classifiers.ConcreteClassifier _concreteclassifier = (org.emftext.language.java.classifiers.ConcreteClassifier) node;
		}
		if (node instanceof org.emftext.language.java.classifiers.Implementor) {
			org.emftext.language.java.classifiers.Implementor _implementor = (org.emftext.language.java.classifiers.Implementor) node;
			_implementor.getImplements().forEach(this::handleAddedNode);
		}
		if (node instanceof org.emftext.language.java.classifiers.Class) {
			org.emftext.language.java.classifiers.Class _class = (org.emftext.language.java.classifiers.Class) node;
			incUtil.newMessage();
			name2actor.get("Class_object_SP0").tell(new ObjectAdded<org.emftext.language.java.classifiers.Class>(incUtil, _class), getSelf());
			incUtil.newMessage();
			name2actor.get("Class_object_SP1").tell(new ObjectAdded<org.emftext.language.java.classifiers.Class>(incUtil, _class), getSelf());
			incUtil.newMessage();
			name2actor.get("Class_object_SP2").tell(new ObjectAdded<org.emftext.language.java.classifiers.Class>(incUtil, _class), getSelf());
			handleAddedNode(_class.getExtends());
			handleAddedNode(_class.getDefaultExtends());
		}
		if (node instanceof org.emftext.language.java.classifiers.Interface) {
			org.emftext.language.java.classifiers.Interface _interface = (org.emftext.language.java.classifiers.Interface) node;
			incUtil.newMessage();
			name2actor.get("Interface_object_SP0").tell(new ObjectAdded<org.emftext.language.java.classifiers.Interface>(incUtil, _interface), getSelf());
			incUtil.newMessage();
			name2actor.get("Interface_object_SP1").tell(new ObjectAdded<org.emftext.language.java.classifiers.Interface>(incUtil, _interface), getSelf());
			incUtil.newMessage();
			name2actor.get("Interface_object_SP2").tell(new ObjectAdded<org.emftext.language.java.classifiers.Interface>(incUtil, _interface), getSelf());
			_interface.getExtends().forEach(this::handleAddedNode);
			_interface.getDefaultExtends().forEach(this::handleAddedNode);
		}
		if (node instanceof org.emftext.language.java.classifiers.Enumeration) {
			org.emftext.language.java.classifiers.Enumeration _enumeration = (org.emftext.language.java.classifiers.Enumeration) node;
			incUtil.newMessage();
			name2actor.get("Enumeration_object_SP0").tell(new ObjectAdded<org.emftext.language.java.classifiers.Enumeration>(incUtil, _enumeration), getSelf());
			incUtil.newMessage();
			name2actor.get("Enumeration_object_SP1").tell(new ObjectAdded<org.emftext.language.java.classifiers.Enumeration>(incUtil, _enumeration), getSelf());
			_enumeration.getConstants().forEach(this::handleAddedNode);
		}
		if (node instanceof org.emftext.language.java.classifiers.Annotation) {
			org.emftext.language.java.classifiers.Annotation _annotation = (org.emftext.language.java.classifiers.Annotation) node;
		}
		if (node instanceof org.emftext.language.java.classifiers.AnonymousClass) {
			org.emftext.language.java.classifiers.AnonymousClass _anonymousclass = (org.emftext.language.java.classifiers.AnonymousClass) node;
		}
		if (node instanceof org.emftext.language.java.commons.Commentable) {
			org.emftext.language.java.commons.Commentable _commentable = (org.emftext.language.java.commons.Commentable) node;
			_commentable.getLayoutInformations().forEach(this::handleAddedNode);
		}
		if (node instanceof org.emftext.language.java.commons.NamedElement) {
			org.emftext.language.java.commons.NamedElement _namedelement = (org.emftext.language.java.commons.NamedElement) node;
		}
		if (node instanceof org.emftext.language.java.commons.NamespaceAwareElement) {
			org.emftext.language.java.commons.NamespaceAwareElement _namespaceawareelement = (org.emftext.language.java.commons.NamespaceAwareElement) node;
		}
		if (node instanceof org.emftext.language.java.containers.JavaRoot) {
			org.emftext.language.java.containers.JavaRoot _javaroot = (org.emftext.language.java.containers.JavaRoot) node;
		}
		if (node instanceof org.emftext.language.java.containers.CompilationUnit) {
			org.emftext.language.java.containers.CompilationUnit _compilationunit = (org.emftext.language.java.containers.CompilationUnit) node;
			incUtil.newMessage();
			name2actor.get("CompilationUnit_object").tell(new ObjectAdded<org.emftext.language.java.containers.CompilationUnit>(incUtil, _compilationunit), getSelf());
			_compilationunit.getClassifiers().forEach(this::handleAddedNode);
		}
		if (node instanceof org.emftext.language.java.containers.Package) {
			org.emftext.language.java.containers.Package _package = (org.emftext.language.java.containers.Package) node;
			incUtil.newMessage();
			name2actor.get("Package_object_SP0").tell(new ObjectAdded<org.emftext.language.java.containers.Package>(incUtil, _package), getSelf());
			incUtil.newMessage();
			name2actor.get("Package_object_SP1").tell(new ObjectAdded<org.emftext.language.java.containers.Package>(incUtil, _package), getSelf());
			_package.getCompilationUnits().forEach(this::handleAddedNode);
		}
		if (node instanceof org.emftext.language.java.containers.EmptyModel) {
			org.emftext.language.java.containers.EmptyModel _emptymodel = (org.emftext.language.java.containers.EmptyModel) node;
		}
		if (node instanceof org.emftext.language.java.expressions.ExpressionList) {
			org.emftext.language.java.expressions.ExpressionList _expressionlist = (org.emftext.language.java.expressions.ExpressionList) node;
			_expressionlist.getExpressions().forEach(this::handleAddedNode);
		}
		if (node instanceof org.emftext.language.java.expressions.Expression) {
			org.emftext.language.java.expressions.Expression _expression = (org.emftext.language.java.expressions.Expression) node;
		}
		if (node instanceof org.emftext.language.java.expressions.AssignmentExpression) {
			org.emftext.language.java.expressions.AssignmentExpression _assignmentexpression = (org.emftext.language.java.expressions.AssignmentExpression) node;
			handleAddedNode(_assignmentexpression.getChild());
			handleAddedNode(_assignmentexpression.getAssignmentOperator());
			handleAddedNode(_assignmentexpression.getValue());
		}
		if (node instanceof org.emftext.language.java.expressions.AssignmentExpressionChild) {
			org.emftext.language.java.expressions.AssignmentExpressionChild _assignmentexpressionchild = (org.emftext.language.java.expressions.AssignmentExpressionChild) node;
		}
		if (node instanceof org.emftext.language.java.expressions.ConditionalExpression) {
			org.emftext.language.java.expressions.ConditionalExpression _conditionalexpression = (org.emftext.language.java.expressions.ConditionalExpression) node;
			handleAddedNode(_conditionalexpression.getChild());
			handleAddedNode(_conditionalexpression.getExpressionIf());
			handleAddedNode(_conditionalexpression.getExpressionElse());
		}
		if (node instanceof org.emftext.language.java.expressions.ConditionalExpressionChild) {
			org.emftext.language.java.expressions.ConditionalExpressionChild _conditionalexpressionchild = (org.emftext.language.java.expressions.ConditionalExpressionChild) node;
		}
		if (node instanceof org.emftext.language.java.expressions.ConditionalOrExpression) {
			org.emftext.language.java.expressions.ConditionalOrExpression _conditionalorexpression = (org.emftext.language.java.expressions.ConditionalOrExpression) node;
			_conditionalorexpression.getChildren().forEach(this::handleAddedNode);
		}
		if (node instanceof org.emftext.language.java.expressions.ConditionalOrExpressionChild) {
			org.emftext.language.java.expressions.ConditionalOrExpressionChild _conditionalorexpressionchild = (org.emftext.language.java.expressions.ConditionalOrExpressionChild) node;
		}
		if (node instanceof org.emftext.language.java.expressions.ConditionalAndExpression) {
			org.emftext.language.java.expressions.ConditionalAndExpression _conditionalandexpression = (org.emftext.language.java.expressions.ConditionalAndExpression) node;
			_conditionalandexpression.getChildren().forEach(this::handleAddedNode);
		}
		if (node instanceof org.emftext.language.java.expressions.ConditionalAndExpressionChild) {
			org.emftext.language.java.expressions.ConditionalAndExpressionChild _conditionalandexpressionchild = (org.emftext.language.java.expressions.ConditionalAndExpressionChild) node;
		}
		if (node instanceof org.emftext.language.java.expressions.InclusiveOrExpression) {
			org.emftext.language.java.expressions.InclusiveOrExpression _inclusiveorexpression = (org.emftext.language.java.expressions.InclusiveOrExpression) node;
			_inclusiveorexpression.getChildren().forEach(this::handleAddedNode);
		}
		if (node instanceof org.emftext.language.java.expressions.InclusiveOrExpressionChild) {
			org.emftext.language.java.expressions.InclusiveOrExpressionChild _inclusiveorexpressionchild = (org.emftext.language.java.expressions.InclusiveOrExpressionChild) node;
		}
		if (node instanceof org.emftext.language.java.expressions.ExclusiveOrExpression) {
			org.emftext.language.java.expressions.ExclusiveOrExpression _exclusiveorexpression = (org.emftext.language.java.expressions.ExclusiveOrExpression) node;
			_exclusiveorexpression.getChildren().forEach(this::handleAddedNode);
		}
		if (node instanceof org.emftext.language.java.expressions.ExclusiveOrExpressionChild) {
			org.emftext.language.java.expressions.ExclusiveOrExpressionChild _exclusiveorexpressionchild = (org.emftext.language.java.expressions.ExclusiveOrExpressionChild) node;
		}
		if (node instanceof org.emftext.language.java.expressions.AndExpression) {
			org.emftext.language.java.expressions.AndExpression _andexpression = (org.emftext.language.java.expressions.AndExpression) node;
			_andexpression.getChildren().forEach(this::handleAddedNode);
		}
		if (node instanceof org.emftext.language.java.expressions.AndExpressionChild) {
			org.emftext.language.java.expressions.AndExpressionChild _andexpressionchild = (org.emftext.language.java.expressions.AndExpressionChild) node;
		}
		if (node instanceof org.emftext.language.java.expressions.EqualityExpression) {
			org.emftext.language.java.expressions.EqualityExpression _equalityexpression = (org.emftext.language.java.expressions.EqualityExpression) node;
			_equalityexpression.getEqualityOperators().forEach(this::handleAddedNode);
			_equalityexpression.getChildren().forEach(this::handleAddedNode);
		}
		if (node instanceof org.emftext.language.java.expressions.EqualityExpressionChild) {
			org.emftext.language.java.expressions.EqualityExpressionChild _equalityexpressionchild = (org.emftext.language.java.expressions.EqualityExpressionChild) node;
		}
		if (node instanceof org.emftext.language.java.expressions.InstanceOfExpression) {
			org.emftext.language.java.expressions.InstanceOfExpression _instanceofexpression = (org.emftext.language.java.expressions.InstanceOfExpression) node;
			handleAddedNode(_instanceofexpression.getChild());
		}
		if (node instanceof org.emftext.language.java.expressions.InstanceOfExpressionChild) {
			org.emftext.language.java.expressions.InstanceOfExpressionChild _instanceofexpressionchild = (org.emftext.language.java.expressions.InstanceOfExpressionChild) node;
		}
		if (node instanceof org.emftext.language.java.expressions.RelationExpression) {
			org.emftext.language.java.expressions.RelationExpression _relationexpression = (org.emftext.language.java.expressions.RelationExpression) node;
			_relationexpression.getChildren().forEach(this::handleAddedNode);
			_relationexpression.getRelationOperators().forEach(this::handleAddedNode);
		}
		if (node instanceof org.emftext.language.java.expressions.RelationExpressionChild) {
			org.emftext.language.java.expressions.RelationExpressionChild _relationexpressionchild = (org.emftext.language.java.expressions.RelationExpressionChild) node;
		}
		if (node instanceof org.emftext.language.java.expressions.ShiftExpression) {
			org.emftext.language.java.expressions.ShiftExpression _shiftexpression = (org.emftext.language.java.expressions.ShiftExpression) node;
			_shiftexpression.getChildren().forEach(this::handleAddedNode);
			_shiftexpression.getShiftOperators().forEach(this::handleAddedNode);
		}
		if (node instanceof org.emftext.language.java.expressions.ShiftExpressionChild) {
			org.emftext.language.java.expressions.ShiftExpressionChild _shiftexpressionchild = (org.emftext.language.java.expressions.ShiftExpressionChild) node;
		}
		if (node instanceof org.emftext.language.java.expressions.AdditiveExpression) {
			org.emftext.language.java.expressions.AdditiveExpression _additiveexpression = (org.emftext.language.java.expressions.AdditiveExpression) node;
			_additiveexpression.getChildren().forEach(this::handleAddedNode);
			_additiveexpression.getAdditiveOperators().forEach(this::handleAddedNode);
		}
		if (node instanceof org.emftext.language.java.expressions.AdditiveExpressionChild) {
			org.emftext.language.java.expressions.AdditiveExpressionChild _additiveexpressionchild = (org.emftext.language.java.expressions.AdditiveExpressionChild) node;
		}
		if (node instanceof org.emftext.language.java.expressions.MultiplicativeExpression) {
			org.emftext.language.java.expressions.MultiplicativeExpression _multiplicativeexpression = (org.emftext.language.java.expressions.MultiplicativeExpression) node;
			_multiplicativeexpression.getChildren().forEach(this::handleAddedNode);
			_multiplicativeexpression.getMultiplicativeOperators().forEach(this::handleAddedNode);
		}
		if (node instanceof org.emftext.language.java.expressions.MultiplicativeExpressionChild) {
			org.emftext.language.java.expressions.MultiplicativeExpressionChild _multiplicativeexpressionchild = (org.emftext.language.java.expressions.MultiplicativeExpressionChild) node;
		}
		if (node instanceof org.emftext.language.java.expressions.UnaryExpression) {
			org.emftext.language.java.expressions.UnaryExpression _unaryexpression = (org.emftext.language.java.expressions.UnaryExpression) node;
			_unaryexpression.getOperators().forEach(this::handleAddedNode);
			handleAddedNode(_unaryexpression.getChild());
		}
		if (node instanceof org.emftext.language.java.expressions.UnaryExpressionChild) {
			org.emftext.language.java.expressions.UnaryExpressionChild _unaryexpressionchild = (org.emftext.language.java.expressions.UnaryExpressionChild) node;
		}
		if (node instanceof org.emftext.language.java.expressions.UnaryModificationExpression) {
			org.emftext.language.java.expressions.UnaryModificationExpression _unarymodificationexpression = (org.emftext.language.java.expressions.UnaryModificationExpression) node;
			handleAddedNode(_unarymodificationexpression.getChild());
			handleAddedNode(_unarymodificationexpression.getOperator());
		}
		if (node instanceof org.emftext.language.java.expressions.PrefixUnaryModificationExpression) {
			org.emftext.language.java.expressions.PrefixUnaryModificationExpression _prefixunarymodificationexpression = (org.emftext.language.java.expressions.PrefixUnaryModificationExpression) node;
		}
		if (node instanceof org.emftext.language.java.expressions.SuffixUnaryModificationExpression) {
			org.emftext.language.java.expressions.SuffixUnaryModificationExpression _suffixunarymodificationexpression = (org.emftext.language.java.expressions.SuffixUnaryModificationExpression) node;
		}
		if (node instanceof org.emftext.language.java.expressions.UnaryModificationExpressionChild) {
			org.emftext.language.java.expressions.UnaryModificationExpressionChild _unarymodificationexpressionchild = (org.emftext.language.java.expressions.UnaryModificationExpressionChild) node;
		}
		if (node instanceof org.emftext.language.java.expressions.CastExpression) {
			org.emftext.language.java.expressions.CastExpression _castexpression = (org.emftext.language.java.expressions.CastExpression) node;
			handleAddedNode(_castexpression.getChild());
		}
		if (node instanceof org.emftext.language.java.expressions.PrimaryExpression) {
			org.emftext.language.java.expressions.PrimaryExpression _primaryexpression = (org.emftext.language.java.expressions.PrimaryExpression) node;
		}
		if (node instanceof org.emftext.language.java.expressions.NestedExpression) {
			org.emftext.language.java.expressions.NestedExpression _nestedexpression = (org.emftext.language.java.expressions.NestedExpression) node;
			handleAddedNode(_nestedexpression.getExpression());
		}
		if (node instanceof org.emftext.language.java.generics.TypeArgument) {
			org.emftext.language.java.generics.TypeArgument _typeargument = (org.emftext.language.java.generics.TypeArgument) node;
		}
		if (node instanceof org.emftext.language.java.generics.TypeArgumentable) {
			org.emftext.language.java.generics.TypeArgumentable _typeargumentable = (org.emftext.language.java.generics.TypeArgumentable) node;
			_typeargumentable.getTypeArguments().forEach(this::handleAddedNode);
		}
		if (node instanceof org.emftext.language.java.generics.CallTypeArgumentable) {
			org.emftext.language.java.generics.CallTypeArgumentable _calltypeargumentable = (org.emftext.language.java.generics.CallTypeArgumentable) node;
			_calltypeargumentable.getCallTypeArguments().forEach(this::handleAddedNode);
		}
		if (node instanceof org.emftext.language.java.generics.TypeParametrizable) {
			org.emftext.language.java.generics.TypeParametrizable _typeparametrizable = (org.emftext.language.java.generics.TypeParametrizable) node;
			_typeparametrizable.getTypeParameters().forEach(this::handleAddedNode);
		}
		if (node instanceof org.emftext.language.java.generics.ExtendsTypeArgument) {
			org.emftext.language.java.generics.ExtendsTypeArgument _extendstypeargument = (org.emftext.language.java.generics.ExtendsTypeArgument) node;
			_extendstypeargument.getExtendTypes().forEach(this::handleAddedNode);
		}
		if (node instanceof org.emftext.language.java.generics.QualifiedTypeArgument) {
			org.emftext.language.java.generics.QualifiedTypeArgument _qualifiedtypeargument = (org.emftext.language.java.generics.QualifiedTypeArgument) node;
		}
		if (node instanceof org.emftext.language.java.generics.SuperTypeArgument) {
			org.emftext.language.java.generics.SuperTypeArgument _supertypeargument = (org.emftext.language.java.generics.SuperTypeArgument) node;
			handleAddedNode(_supertypeargument.getSuperType());
		}
		if (node instanceof org.emftext.language.java.generics.TypeParameter) {
			org.emftext.language.java.generics.TypeParameter _typeparameter = (org.emftext.language.java.generics.TypeParameter) node;
			_typeparameter.getExtendTypes().forEach(this::handleAddedNode);
		}
		if (node instanceof org.emftext.language.java.generics.UnknownTypeArgument) {
			org.emftext.language.java.generics.UnknownTypeArgument _unknowntypeargument = (org.emftext.language.java.generics.UnknownTypeArgument) node;
		}
		if (node instanceof org.emftext.language.java.imports.Import) {
			org.emftext.language.java.imports.Import _import = (org.emftext.language.java.imports.Import) node;
		}
		if (node instanceof org.emftext.language.java.imports.ImportingElement) {
			org.emftext.language.java.imports.ImportingElement _importingelement = (org.emftext.language.java.imports.ImportingElement) node;
			_importingelement.getImports().forEach(this::handleAddedNode);
		}
		if (node instanceof org.emftext.language.java.imports.StaticImport) {
			org.emftext.language.java.imports.StaticImport _staticimport = (org.emftext.language.java.imports.StaticImport) node;
			handleAddedNode(_staticimport.getStatic());
		}
		if (node instanceof org.emftext.language.java.imports.ClassifierImport) {
			org.emftext.language.java.imports.ClassifierImport _classifierimport = (org.emftext.language.java.imports.ClassifierImport) node;
		}
		if (node instanceof org.emftext.language.java.imports.PackageImport) {
			org.emftext.language.java.imports.PackageImport _packageimport = (org.emftext.language.java.imports.PackageImport) node;
		}
		if (node instanceof org.emftext.language.java.imports.StaticClassifierImport) {
			org.emftext.language.java.imports.StaticClassifierImport _staticclassifierimport = (org.emftext.language.java.imports.StaticClassifierImport) node;
		}
		if (node instanceof org.emftext.language.java.imports.StaticMemberImport) {
			org.emftext.language.java.imports.StaticMemberImport _staticmemberimport = (org.emftext.language.java.imports.StaticMemberImport) node;
		}
		if (node instanceof org.emftext.language.java.instantiations.Initializable) {
			org.emftext.language.java.instantiations.Initializable _initializable = (org.emftext.language.java.instantiations.Initializable) node;
			handleAddedNode(_initializable.getInitialValue());
		}
		if (node instanceof org.emftext.language.java.instantiations.Instantiation) {
			org.emftext.language.java.instantiations.Instantiation _instantiation = (org.emftext.language.java.instantiations.Instantiation) node;
		}
		if (node instanceof org.emftext.language.java.instantiations.NewConstructorCall) {
			org.emftext.language.java.instantiations.NewConstructorCall _newconstructorcall = (org.emftext.language.java.instantiations.NewConstructorCall) node;
			handleAddedNode(_newconstructorcall.getAnonymousClass());
		}
		if (node instanceof org.emftext.language.java.instantiations.ExplicitConstructorCall) {
			org.emftext.language.java.instantiations.ExplicitConstructorCall _explicitconstructorcall = (org.emftext.language.java.instantiations.ExplicitConstructorCall) node;
			handleAddedNode(_explicitconstructorcall.getCallTarget());
		}
		if (node instanceof org.emftext.language.java.literals.Literal) {
			org.emftext.language.java.literals.Literal _literal = (org.emftext.language.java.literals.Literal) node;
		}
		if (node instanceof org.emftext.language.java.literals.Self) {
			org.emftext.language.java.literals.Self _self = (org.emftext.language.java.literals.Self) node;
		}
		if (node instanceof org.emftext.language.java.literals.BooleanLiteral) {
			org.emftext.language.java.literals.BooleanLiteral _booleanliteral = (org.emftext.language.java.literals.BooleanLiteral) node;
		}
		if (node instanceof org.emftext.language.java.literals.CharacterLiteral) {
			org.emftext.language.java.literals.CharacterLiteral _characterliteral = (org.emftext.language.java.literals.CharacterLiteral) node;
		}
		if (node instanceof org.emftext.language.java.literals.FloatLiteral) {
			org.emftext.language.java.literals.FloatLiteral _floatliteral = (org.emftext.language.java.literals.FloatLiteral) node;
		}
		if (node instanceof org.emftext.language.java.literals.DecimalFloatLiteral) {
			org.emftext.language.java.literals.DecimalFloatLiteral _decimalfloatliteral = (org.emftext.language.java.literals.DecimalFloatLiteral) node;
		}
		if (node instanceof org.emftext.language.java.literals.HexFloatLiteral) {
			org.emftext.language.java.literals.HexFloatLiteral _hexfloatliteral = (org.emftext.language.java.literals.HexFloatLiteral) node;
		}
		if (node instanceof org.emftext.language.java.literals.DoubleLiteral) {
			org.emftext.language.java.literals.DoubleLiteral _doubleliteral = (org.emftext.language.java.literals.DoubleLiteral) node;
		}
		if (node instanceof org.emftext.language.java.literals.DecimalDoubleLiteral) {
			org.emftext.language.java.literals.DecimalDoubleLiteral _decimaldoubleliteral = (org.emftext.language.java.literals.DecimalDoubleLiteral) node;
		}
		if (node instanceof org.emftext.language.java.literals.HexDoubleLiteral) {
			org.emftext.language.java.literals.HexDoubleLiteral _hexdoubleliteral = (org.emftext.language.java.literals.HexDoubleLiteral) node;
		}
		if (node instanceof org.emftext.language.java.literals.IntegerLiteral) {
			org.emftext.language.java.literals.IntegerLiteral _integerliteral = (org.emftext.language.java.literals.IntegerLiteral) node;
		}
		if (node instanceof org.emftext.language.java.literals.DecimalIntegerLiteral) {
			org.emftext.language.java.literals.DecimalIntegerLiteral _decimalintegerliteral = (org.emftext.language.java.literals.DecimalIntegerLiteral) node;
		}
		if (node instanceof org.emftext.language.java.literals.HexIntegerLiteral) {
			org.emftext.language.java.literals.HexIntegerLiteral _hexintegerliteral = (org.emftext.language.java.literals.HexIntegerLiteral) node;
		}
		if (node instanceof org.emftext.language.java.literals.OctalIntegerLiteral) {
			org.emftext.language.java.literals.OctalIntegerLiteral _octalintegerliteral = (org.emftext.language.java.literals.OctalIntegerLiteral) node;
		}
		if (node instanceof org.emftext.language.java.literals.LongLiteral) {
			org.emftext.language.java.literals.LongLiteral _longliteral = (org.emftext.language.java.literals.LongLiteral) node;
		}
		if (node instanceof org.emftext.language.java.literals.DecimalLongLiteral) {
			org.emftext.language.java.literals.DecimalLongLiteral _decimallongliteral = (org.emftext.language.java.literals.DecimalLongLiteral) node;
		}
		if (node instanceof org.emftext.language.java.literals.HexLongLiteral) {
			org.emftext.language.java.literals.HexLongLiteral _hexlongliteral = (org.emftext.language.java.literals.HexLongLiteral) node;
		}
		if (node instanceof org.emftext.language.java.literals.OctalLongLiteral) {
			org.emftext.language.java.literals.OctalLongLiteral _octallongliteral = (org.emftext.language.java.literals.OctalLongLiteral) node;
		}
		if (node instanceof org.emftext.language.java.literals.NullLiteral) {
			org.emftext.language.java.literals.NullLiteral _nullliteral = (org.emftext.language.java.literals.NullLiteral) node;
		}
		if (node instanceof org.emftext.language.java.literals.Super) {
			org.emftext.language.java.literals.Super _super = (org.emftext.language.java.literals.Super) node;
		}
		if (node instanceof org.emftext.language.java.literals.This) {
			org.emftext.language.java.literals.This _this = (org.emftext.language.java.literals.This) node;
		}
		if (node instanceof org.emftext.language.java.members.ExceptionThrower) {
			org.emftext.language.java.members.ExceptionThrower _exceptionthrower = (org.emftext.language.java.members.ExceptionThrower) node;
			_exceptionthrower.getExceptions().forEach(this::handleAddedNode);
		}
		if (node instanceof org.emftext.language.java.members.Member) {
			org.emftext.language.java.members.Member _member = (org.emftext.language.java.members.Member) node;
		}
		if (node instanceof org.emftext.language.java.members.MemberContainer) {
			org.emftext.language.java.members.MemberContainer _membercontainer = (org.emftext.language.java.members.MemberContainer) node;
			_membercontainer.getMembers().forEach(this::handleAddedNode);
			_membercontainer.getDefaultMembers().forEach(this::handleAddedNode);
		}
		if (node instanceof org.emftext.language.java.members.AdditionalField) {
			org.emftext.language.java.members.AdditionalField _additionalfield = (org.emftext.language.java.members.AdditionalField) node;
		}
		if (node instanceof org.emftext.language.java.members.Constructor) {
			org.emftext.language.java.members.Constructor _constructor = (org.emftext.language.java.members.Constructor) node;
			incUtil.newMessage();
			name2actor.get("Constructor_object").tell(new ObjectAdded<org.emftext.language.java.members.Constructor>(incUtil, _constructor), getSelf());
		}
		if (node instanceof org.emftext.language.java.members.EmptyMember) {
			org.emftext.language.java.members.EmptyMember _emptymember = (org.emftext.language.java.members.EmptyMember) node;
		}
		if (node instanceof org.emftext.language.java.members.Field) {
			org.emftext.language.java.members.Field _field = (org.emftext.language.java.members.Field) node;
			incUtil.newMessage();
			name2actor.get("Field_object").tell(new ObjectAdded<org.emftext.language.java.members.Field>(incUtil, _field), getSelf());
			_field.getAdditionalFields().forEach(this::handleAddedNode);
		}
		if (node instanceof org.emftext.language.java.members.Method) {
			org.emftext.language.java.members.Method _method = (org.emftext.language.java.members.Method) node;
		}
		if (node instanceof org.emftext.language.java.members.InterfaceMethod) {
			org.emftext.language.java.members.InterfaceMethod _interfacemethod = (org.emftext.language.java.members.InterfaceMethod) node;
		}
		if (node instanceof org.emftext.language.java.members.ClassMethod) {
			org.emftext.language.java.members.ClassMethod _classmethod = (org.emftext.language.java.members.ClassMethod) node;
			incUtil.newMessage();
			name2actor.get("ClassMethod_object_SP0").tell(new ObjectAdded<org.emftext.language.java.members.ClassMethod>(incUtil, _classmethod), getSelf());
			incUtil.newMessage();
			name2actor.get("ClassMethod_object_SP1").tell(new ObjectAdded<org.emftext.language.java.members.ClassMethod>(incUtil, _classmethod), getSelf());
		}
		if (node instanceof org.emftext.language.java.members.EnumConstant) {
			org.emftext.language.java.members.EnumConstant _enumconstant = (org.emftext.language.java.members.EnumConstant) node;
			handleAddedNode(_enumconstant.getAnonymousClass());
		}
		if (node instanceof org.emftext.language.java.modifiers.Modifier) {
			org.emftext.language.java.modifiers.Modifier _modifier = (org.emftext.language.java.modifiers.Modifier) node;
		}
		if (node instanceof org.emftext.language.java.modifiers.AnnotationInstanceOrModifier) {
			org.emftext.language.java.modifiers.AnnotationInstanceOrModifier _annotationinstanceormodifier = (org.emftext.language.java.modifiers.AnnotationInstanceOrModifier) node;
		}
		if (node instanceof org.emftext.language.java.modifiers.AnnotableAndModifiable) {
			org.emftext.language.java.modifiers.AnnotableAndModifiable _annotableandmodifiable = (org.emftext.language.java.modifiers.AnnotableAndModifiable) node;
			_annotableandmodifiable.getAnnotationsAndModifiers().forEach(this::handleAddedNode);
		}
		if (node instanceof org.emftext.language.java.modifiers.Modifiable) {
			org.emftext.language.java.modifiers.Modifiable _modifiable = (org.emftext.language.java.modifiers.Modifiable) node;
			_modifiable.getModifiers().forEach(this::handleAddedNode);
		}
		if (node instanceof org.emftext.language.java.modifiers.Abstract) {
			org.emftext.language.java.modifiers.Abstract _abstract = (org.emftext.language.java.modifiers.Abstract) node;
		}
		if (node instanceof org.emftext.language.java.modifiers.Final) {
			org.emftext.language.java.modifiers.Final _final = (org.emftext.language.java.modifiers.Final) node;
		}
		if (node instanceof org.emftext.language.java.modifiers.Native) {
			org.emftext.language.java.modifiers.Native _native = (org.emftext.language.java.modifiers.Native) node;
		}
		if (node instanceof org.emftext.language.java.modifiers.Protected) {
			org.emftext.language.java.modifiers.Protected _protected = (org.emftext.language.java.modifiers.Protected) node;
		}
		if (node instanceof org.emftext.language.java.modifiers.Public) {
			org.emftext.language.java.modifiers.Public _public = (org.emftext.language.java.modifiers.Public) node;
		}
		if (node instanceof org.emftext.language.java.modifiers.Private) {
			org.emftext.language.java.modifiers.Private _private = (org.emftext.language.java.modifiers.Private) node;
		}
		if (node instanceof org.emftext.language.java.modifiers.Static) {
			org.emftext.language.java.modifiers.Static _static = (org.emftext.language.java.modifiers.Static) node;
		}
		if (node instanceof org.emftext.language.java.modifiers.Strictfp) {
			org.emftext.language.java.modifiers.Strictfp _strictfp = (org.emftext.language.java.modifiers.Strictfp) node;
		}
		if (node instanceof org.emftext.language.java.modifiers.Synchronized) {
			org.emftext.language.java.modifiers.Synchronized _synchronized = (org.emftext.language.java.modifiers.Synchronized) node;
		}
		if (node instanceof org.emftext.language.java.modifiers.Transient) {
			org.emftext.language.java.modifiers.Transient _transient = (org.emftext.language.java.modifiers.Transient) node;
		}
		if (node instanceof org.emftext.language.java.modifiers.Volatile) {
			org.emftext.language.java.modifiers.Volatile _volatile = (org.emftext.language.java.modifiers.Volatile) node;
		}
		if (node instanceof org.emftext.language.java.operators.Operator) {
			org.emftext.language.java.operators.Operator _operator = (org.emftext.language.java.operators.Operator) node;
		}
		if (node instanceof org.emftext.language.java.operators.AdditiveOperator) {
			org.emftext.language.java.operators.AdditiveOperator _additiveoperator = (org.emftext.language.java.operators.AdditiveOperator) node;
		}
		if (node instanceof org.emftext.language.java.operators.AssignmentOperator) {
			org.emftext.language.java.operators.AssignmentOperator _assignmentoperator = (org.emftext.language.java.operators.AssignmentOperator) node;
		}
		if (node instanceof org.emftext.language.java.operators.EqualityOperator) {
			org.emftext.language.java.operators.EqualityOperator _equalityoperator = (org.emftext.language.java.operators.EqualityOperator) node;
		}
		if (node instanceof org.emftext.language.java.operators.MultiplicativeOperator) {
			org.emftext.language.java.operators.MultiplicativeOperator _multiplicativeoperator = (org.emftext.language.java.operators.MultiplicativeOperator) node;
		}
		if (node instanceof org.emftext.language.java.operators.RelationOperator) {
			org.emftext.language.java.operators.RelationOperator _relationoperator = (org.emftext.language.java.operators.RelationOperator) node;
		}
		if (node instanceof org.emftext.language.java.operators.ShiftOperator) {
			org.emftext.language.java.operators.ShiftOperator _shiftoperator = (org.emftext.language.java.operators.ShiftOperator) node;
		}
		if (node instanceof org.emftext.language.java.operators.UnaryOperator) {
			org.emftext.language.java.operators.UnaryOperator _unaryoperator = (org.emftext.language.java.operators.UnaryOperator) node;
		}
		if (node instanceof org.emftext.language.java.operators.UnaryModificationOperator) {
			org.emftext.language.java.operators.UnaryModificationOperator _unarymodificationoperator = (org.emftext.language.java.operators.UnaryModificationOperator) node;
		}
		if (node instanceof org.emftext.language.java.operators.Assignment) {
			org.emftext.language.java.operators.Assignment _assignment = (org.emftext.language.java.operators.Assignment) node;
		}
		if (node instanceof org.emftext.language.java.operators.AssignmentAnd) {
			org.emftext.language.java.operators.AssignmentAnd _assignmentand = (org.emftext.language.java.operators.AssignmentAnd) node;
		}
		if (node instanceof org.emftext.language.java.operators.AssignmentDivision) {
			org.emftext.language.java.operators.AssignmentDivision _assignmentdivision = (org.emftext.language.java.operators.AssignmentDivision) node;
		}
		if (node instanceof org.emftext.language.java.operators.AssignmentExclusiveOr) {
			org.emftext.language.java.operators.AssignmentExclusiveOr _assignmentexclusiveor = (org.emftext.language.java.operators.AssignmentExclusiveOr) node;
		}
		if (node instanceof org.emftext.language.java.operators.AssignmentMinus) {
			org.emftext.language.java.operators.AssignmentMinus _assignmentminus = (org.emftext.language.java.operators.AssignmentMinus) node;
		}
		if (node instanceof org.emftext.language.java.operators.AssignmentModulo) {
			org.emftext.language.java.operators.AssignmentModulo _assignmentmodulo = (org.emftext.language.java.operators.AssignmentModulo) node;
		}
		if (node instanceof org.emftext.language.java.operators.AssignmentMultiplication) {
			org.emftext.language.java.operators.AssignmentMultiplication _assignmentmultiplication = (org.emftext.language.java.operators.AssignmentMultiplication) node;
		}
		if (node instanceof org.emftext.language.java.operators.AssignmentLeftShift) {
			org.emftext.language.java.operators.AssignmentLeftShift _assignmentleftshift = (org.emftext.language.java.operators.AssignmentLeftShift) node;
		}
		if (node instanceof org.emftext.language.java.operators.AssignmentOr) {
			org.emftext.language.java.operators.AssignmentOr _assignmentor = (org.emftext.language.java.operators.AssignmentOr) node;
		}
		if (node instanceof org.emftext.language.java.operators.AssignmentPlus) {
			org.emftext.language.java.operators.AssignmentPlus _assignmentplus = (org.emftext.language.java.operators.AssignmentPlus) node;
		}
		if (node instanceof org.emftext.language.java.operators.AssignmentRightShift) {
			org.emftext.language.java.operators.AssignmentRightShift _assignmentrightshift = (org.emftext.language.java.operators.AssignmentRightShift) node;
		}
		if (node instanceof org.emftext.language.java.operators.AssignmentUnsignedRightShift) {
			org.emftext.language.java.operators.AssignmentUnsignedRightShift _assignmentunsignedrightshift = (org.emftext.language.java.operators.AssignmentUnsignedRightShift) node;
		}
		if (node instanceof org.emftext.language.java.operators.Equal) {
			org.emftext.language.java.operators.Equal _equal = (org.emftext.language.java.operators.Equal) node;
		}
		if (node instanceof org.emftext.language.java.operators.NotEqual) {
			org.emftext.language.java.operators.NotEqual _notequal = (org.emftext.language.java.operators.NotEqual) node;
		}
		if (node instanceof org.emftext.language.java.operators.GreaterThan) {
			org.emftext.language.java.operators.GreaterThan _greaterthan = (org.emftext.language.java.operators.GreaterThan) node;
		}
		if (node instanceof org.emftext.language.java.operators.GreaterThanOrEqual) {
			org.emftext.language.java.operators.GreaterThanOrEqual _greaterthanorequal = (org.emftext.language.java.operators.GreaterThanOrEqual) node;
		}
		if (node instanceof org.emftext.language.java.operators.LessThan) {
			org.emftext.language.java.operators.LessThan _lessthan = (org.emftext.language.java.operators.LessThan) node;
		}
		if (node instanceof org.emftext.language.java.operators.LessThanOrEqual) {
			org.emftext.language.java.operators.LessThanOrEqual _lessthanorequal = (org.emftext.language.java.operators.LessThanOrEqual) node;
		}
		if (node instanceof org.emftext.language.java.operators.Addition) {
			org.emftext.language.java.operators.Addition _addition = (org.emftext.language.java.operators.Addition) node;
		}
		if (node instanceof org.emftext.language.java.operators.Subtraction) {
			org.emftext.language.java.operators.Subtraction _subtraction = (org.emftext.language.java.operators.Subtraction) node;
		}
		if (node instanceof org.emftext.language.java.operators.Division) {
			org.emftext.language.java.operators.Division _division = (org.emftext.language.java.operators.Division) node;
		}
		if (node instanceof org.emftext.language.java.operators.Multiplication) {
			org.emftext.language.java.operators.Multiplication _multiplication = (org.emftext.language.java.operators.Multiplication) node;
		}
		if (node instanceof org.emftext.language.java.operators.Remainder) {
			org.emftext.language.java.operators.Remainder _remainder = (org.emftext.language.java.operators.Remainder) node;
		}
		if (node instanceof org.emftext.language.java.operators.Complement) {
			org.emftext.language.java.operators.Complement _complement = (org.emftext.language.java.operators.Complement) node;
		}
		if (node instanceof org.emftext.language.java.operators.MinusMinus) {
			org.emftext.language.java.operators.MinusMinus _minusminus = (org.emftext.language.java.operators.MinusMinus) node;
		}
		if (node instanceof org.emftext.language.java.operators.Negate) {
			org.emftext.language.java.operators.Negate _negate = (org.emftext.language.java.operators.Negate) node;
		}
		if (node instanceof org.emftext.language.java.operators.PlusPlus) {
			org.emftext.language.java.operators.PlusPlus _plusplus = (org.emftext.language.java.operators.PlusPlus) node;
		}
		if (node instanceof org.emftext.language.java.operators.LeftShift) {
			org.emftext.language.java.operators.LeftShift _leftshift = (org.emftext.language.java.operators.LeftShift) node;
		}
		if (node instanceof org.emftext.language.java.operators.RightShift) {
			org.emftext.language.java.operators.RightShift _rightshift = (org.emftext.language.java.operators.RightShift) node;
		}
		if (node instanceof org.emftext.language.java.operators.UnsignedRightShift) {
			org.emftext.language.java.operators.UnsignedRightShift _unsignedrightshift = (org.emftext.language.java.operators.UnsignedRightShift) node;
		}
		if (node instanceof org.emftext.language.java.parameters.Parameter) {
			org.emftext.language.java.parameters.Parameter _parameter = (org.emftext.language.java.parameters.Parameter) node;
			incUtil.newMessage();
			name2actor.get("Parameter_1_object").tell(new ObjectAdded<org.emftext.language.java.parameters.Parameter>(incUtil, _parameter), getSelf());
		}
		if (node instanceof org.emftext.language.java.parameters.Parametrizable) {
			org.emftext.language.java.parameters.Parametrizable _parametrizable = (org.emftext.language.java.parameters.Parametrizable) node;
			_parametrizable.getParameters().forEach(this::handleAddedNode);
		}
		if (node instanceof org.emftext.language.java.parameters.OrdinaryParameter) {
			org.emftext.language.java.parameters.OrdinaryParameter _ordinaryparameter = (org.emftext.language.java.parameters.OrdinaryParameter) node;
		}
		if (node instanceof org.emftext.language.java.parameters.VariableLengthParameter) {
			org.emftext.language.java.parameters.VariableLengthParameter _variablelengthparameter = (org.emftext.language.java.parameters.VariableLengthParameter) node;
		}
		if (node instanceof org.emftext.language.java.references.Reference) {
			org.emftext.language.java.references.Reference _reference = (org.emftext.language.java.references.Reference) node;
			handleAddedNode(_reference.getNext());
			_reference.getArraySelectors().forEach(this::handleAddedNode);
		}
		if (node instanceof org.emftext.language.java.references.Argumentable) {
			org.emftext.language.java.references.Argumentable _argumentable = (org.emftext.language.java.references.Argumentable) node;
			_argumentable.getArguments().forEach(this::handleAddedNode);
		}
		if (node instanceof org.emftext.language.java.references.ReferenceableElement) {
			org.emftext.language.java.references.ReferenceableElement _referenceableelement = (org.emftext.language.java.references.ReferenceableElement) node;
		}
		if (node instanceof org.emftext.language.java.references.ElementReference) {
			org.emftext.language.java.references.ElementReference _elementreference = (org.emftext.language.java.references.ElementReference) node;
		}
		if (node instanceof org.emftext.language.java.references.IdentifierReference) {
			org.emftext.language.java.references.IdentifierReference _identifierreference = (org.emftext.language.java.references.IdentifierReference) node;
		}
		if (node instanceof org.emftext.language.java.references.MethodCall) {
			org.emftext.language.java.references.MethodCall _methodcall = (org.emftext.language.java.references.MethodCall) node;
		}
		if (node instanceof org.emftext.language.java.references.ReflectiveClassReference) {
			org.emftext.language.java.references.ReflectiveClassReference _reflectiveclassreference = (org.emftext.language.java.references.ReflectiveClassReference) node;
		}
		if (node instanceof org.emftext.language.java.references.PrimitiveTypeReference) {
			org.emftext.language.java.references.PrimitiveTypeReference _primitivetypereference = (org.emftext.language.java.references.PrimitiveTypeReference) node;
			handleAddedNode(_primitivetypereference.getPrimitiveType());
		}
		if (node instanceof org.emftext.language.java.references.StringReference) {
			org.emftext.language.java.references.StringReference _stringreference = (org.emftext.language.java.references.StringReference) node;
		}
		if (node instanceof org.emftext.language.java.references.SelfReference) {
			org.emftext.language.java.references.SelfReference _selfreference = (org.emftext.language.java.references.SelfReference) node;
			handleAddedNode(_selfreference.getSelf());
		}
		if (node instanceof org.emftext.language.java.references.PackageReference) {
			org.emftext.language.java.references.PackageReference _packagereference = (org.emftext.language.java.references.PackageReference) node;
			_packagereference.getSubpackages().forEach(this::handleAddedNode);
		}
		if (node instanceof org.emftext.language.java.statements.StatementContainer) {
			org.emftext.language.java.statements.StatementContainer _statementcontainer = (org.emftext.language.java.statements.StatementContainer) node;
			handleAddedNode(_statementcontainer.getStatement());
		}
		if (node instanceof org.emftext.language.java.statements.StatementListContainer) {
			org.emftext.language.java.statements.StatementListContainer _statementlistcontainer = (org.emftext.language.java.statements.StatementListContainer) node;
			_statementlistcontainer.getStatements().forEach(this::handleAddedNode);
		}
		if (node instanceof org.emftext.language.java.statements.Conditional) {
			org.emftext.language.java.statements.Conditional _conditional = (org.emftext.language.java.statements.Conditional) node;
			handleAddedNode(_conditional.getCondition());
		}
		if (node instanceof org.emftext.language.java.statements.ForLoopInitializer) {
			org.emftext.language.java.statements.ForLoopInitializer _forloopinitializer = (org.emftext.language.java.statements.ForLoopInitializer) node;
		}
		if (node instanceof org.emftext.language.java.statements.Statement) {
			org.emftext.language.java.statements.Statement _statement = (org.emftext.language.java.statements.Statement) node;
		}
		if (node instanceof org.emftext.language.java.statements.SwitchCase) {
			org.emftext.language.java.statements.SwitchCase _switchcase = (org.emftext.language.java.statements.SwitchCase) node;
		}
		if (node instanceof org.emftext.language.java.statements.Assert) {
			org.emftext.language.java.statements.Assert _assert = (org.emftext.language.java.statements.Assert) node;
			handleAddedNode(_assert.getErrorMessage());
		}
		if (node instanceof org.emftext.language.java.statements.Break) {
			org.emftext.language.java.statements.Break _break = (org.emftext.language.java.statements.Break) node;
		}
		if (node instanceof org.emftext.language.java.statements.Block) {
			org.emftext.language.java.statements.Block _block = (org.emftext.language.java.statements.Block) node;
		}
		if (node instanceof org.emftext.language.java.statements.CatchBlock) {
			org.emftext.language.java.statements.CatchBlock _catchblock = (org.emftext.language.java.statements.CatchBlock) node;
			handleAddedNode(_catchblock.getParameter());
		}
		if (node instanceof org.emftext.language.java.statements.Condition) {
			org.emftext.language.java.statements.Condition _condition = (org.emftext.language.java.statements.Condition) node;
			handleAddedNode(_condition.getElseStatement());
		}
		if (node instanceof org.emftext.language.java.statements.Continue) {
			org.emftext.language.java.statements.Continue _continue = (org.emftext.language.java.statements.Continue) node;
		}
		if (node instanceof org.emftext.language.java.statements.DefaultSwitchCase) {
			org.emftext.language.java.statements.DefaultSwitchCase _defaultswitchcase = (org.emftext.language.java.statements.DefaultSwitchCase) node;
		}
		if (node instanceof org.emftext.language.java.statements.DoWhileLoop) {
			org.emftext.language.java.statements.DoWhileLoop _dowhileloop = (org.emftext.language.java.statements.DoWhileLoop) node;
		}
		if (node instanceof org.emftext.language.java.statements.EmptyStatement) {
			org.emftext.language.java.statements.EmptyStatement _emptystatement = (org.emftext.language.java.statements.EmptyStatement) node;
		}
		if (node instanceof org.emftext.language.java.statements.ExpressionStatement) {
			org.emftext.language.java.statements.ExpressionStatement _expressionstatement = (org.emftext.language.java.statements.ExpressionStatement) node;
			handleAddedNode(_expressionstatement.getExpression());
		}
		if (node instanceof org.emftext.language.java.statements.ForLoop) {
			org.emftext.language.java.statements.ForLoop _forloop = (org.emftext.language.java.statements.ForLoop) node;
			handleAddedNode(_forloop.getInit());
			_forloop.getUpdates().forEach(this::handleAddedNode);
		}
		if (node instanceof org.emftext.language.java.statements.ForEachLoop) {
			org.emftext.language.java.statements.ForEachLoop _foreachloop = (org.emftext.language.java.statements.ForEachLoop) node;
			handleAddedNode(_foreachloop.getNext());
			handleAddedNode(_foreachloop.getCollection());
		}
		if (node instanceof org.emftext.language.java.statements.Jump) {
			org.emftext.language.java.statements.Jump _jump = (org.emftext.language.java.statements.Jump) node;
		}
		if (node instanceof org.emftext.language.java.statements.JumpLabel) {
			org.emftext.language.java.statements.JumpLabel _jumplabel = (org.emftext.language.java.statements.JumpLabel) node;
		}
		if (node instanceof org.emftext.language.java.statements.LocalVariableStatement) {
			org.emftext.language.java.statements.LocalVariableStatement _localvariablestatement = (org.emftext.language.java.statements.LocalVariableStatement) node;
			handleAddedNode(_localvariablestatement.getVariable());
		}
		if (node instanceof org.emftext.language.java.statements.NormalSwitchCase) {
			org.emftext.language.java.statements.NormalSwitchCase _normalswitchcase = (org.emftext.language.java.statements.NormalSwitchCase) node;
		}
		if (node instanceof org.emftext.language.java.statements.Return) {
			org.emftext.language.java.statements.Return _return = (org.emftext.language.java.statements.Return) node;
			handleAddedNode(_return.getReturnValue());
		}
		if (node instanceof org.emftext.language.java.statements.Switch) {
			org.emftext.language.java.statements.Switch _switch = (org.emftext.language.java.statements.Switch) node;
			_switch.getCases().forEach(this::handleAddedNode);
			handleAddedNode(_switch.getVariable());
		}
		if (node instanceof org.emftext.language.java.statements.SynchronizedBlock) {
			org.emftext.language.java.statements.SynchronizedBlock _synchronizedblock = (org.emftext.language.java.statements.SynchronizedBlock) node;
			handleAddedNode(_synchronizedblock.getLockProvider());
		}
		if (node instanceof org.emftext.language.java.statements.Throw) {
			org.emftext.language.java.statements.Throw _throw = (org.emftext.language.java.statements.Throw) node;
			handleAddedNode(_throw.getThrowable());
		}
		if (node instanceof org.emftext.language.java.statements.TryBlock) {
			org.emftext.language.java.statements.TryBlock _tryblock = (org.emftext.language.java.statements.TryBlock) node;
			_tryblock.getCatcheBlocks().forEach(this::handleAddedNode);
			handleAddedNode(_tryblock.getFinallyBlock());
		}
		if (node instanceof org.emftext.language.java.statements.WhileLoop) {
			org.emftext.language.java.statements.WhileLoop _whileloop = (org.emftext.language.java.statements.WhileLoop) node;
			handleAddedNode(_whileloop.getCondition());
		}
		if (node instanceof org.emftext.language.java.types.Type) {
			org.emftext.language.java.types.Type _type = (org.emftext.language.java.types.Type) node;
		}
		if (node instanceof org.emftext.language.java.types.TypedElement) {
			org.emftext.language.java.types.TypedElement _typedelement = (org.emftext.language.java.types.TypedElement) node;
			handleAddedNode(_typedelement.getTypeReference());
		}
		if (node instanceof org.emftext.language.java.types.TypeReference) {
			org.emftext.language.java.types.TypeReference _typereference = (org.emftext.language.java.types.TypeReference) node;
		}
		if (node instanceof org.emftext.language.java.types.ClassifierReference) {
			org.emftext.language.java.types.ClassifierReference _classifierreference = (org.emftext.language.java.types.ClassifierReference) node;
		}
		if (node instanceof org.emftext.language.java.types.NamespaceClassifierReference) {
			org.emftext.language.java.types.NamespaceClassifierReference _namespaceclassifierreference = (org.emftext.language.java.types.NamespaceClassifierReference) node;
			_namespaceclassifierreference.getClassifierReferences().forEach(this::handleAddedNode);
		}
		if (node instanceof org.emftext.language.java.types.PrimitiveType) {
			org.emftext.language.java.types.PrimitiveType _primitivetype = (org.emftext.language.java.types.PrimitiveType) node;
		}
		if (node instanceof org.emftext.language.java.types.Boolean) {
			org.emftext.language.java.types.Boolean _boolean = (org.emftext.language.java.types.Boolean) node;
		}
		if (node instanceof org.emftext.language.java.types.Byte) {
			org.emftext.language.java.types.Byte _byte = (org.emftext.language.java.types.Byte) node;
		}
		if (node instanceof org.emftext.language.java.types.Char) {
			org.emftext.language.java.types.Char _char = (org.emftext.language.java.types.Char) node;
		}
		if (node instanceof org.emftext.language.java.types.Double) {
			org.emftext.language.java.types.Double _double = (org.emftext.language.java.types.Double) node;
		}
		if (node instanceof org.emftext.language.java.types.Float) {
			org.emftext.language.java.types.Float _float = (org.emftext.language.java.types.Float) node;
		}
		if (node instanceof org.emftext.language.java.types.Int) {
			org.emftext.language.java.types.Int _int = (org.emftext.language.java.types.Int) node;
		}
		if (node instanceof org.emftext.language.java.types.Long) {
			org.emftext.language.java.types.Long _long = (org.emftext.language.java.types.Long) node;
		}
		if (node instanceof org.emftext.language.java.types.Short) {
			org.emftext.language.java.types.Short _short = (org.emftext.language.java.types.Short) node;
		}
		if (node instanceof org.emftext.language.java.types.Void) {
			org.emftext.language.java.types.Void _void = (org.emftext.language.java.types.Void) node;
		}
		if (node instanceof org.emftext.language.java.variables.Variable) {
			org.emftext.language.java.variables.Variable _variable = (org.emftext.language.java.variables.Variable) node;
		}
		if (node instanceof org.emftext.language.java.variables.LocalVariable) {
			org.emftext.language.java.variables.LocalVariable _localvariable = (org.emftext.language.java.variables.LocalVariable) node;
			_localvariable.getAdditionalLocalVariables().forEach(this::handleAddedNode);
		}
		if (node instanceof org.emftext.language.java.variables.AdditionalLocalVariable) {
			org.emftext.language.java.variables.AdditionalLocalVariable _additionallocalvariable = (org.emftext.language.java.variables.AdditionalLocalVariable) node;
		}
	}
}

