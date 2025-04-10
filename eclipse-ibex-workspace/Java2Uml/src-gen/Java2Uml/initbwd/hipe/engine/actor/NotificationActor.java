package Java2Uml.initbwd.hipe.engine.actor;

import java.util.Collection;
import java.util.LinkedList;

import org.eclipse.emf.ecore.EObject;

import akka.actor.ActorRef;

import hipe.engine.actor.GenericNotificationActor;
import hipe.engine.util.IncUtil;

public class NotificationActor extends GenericNotificationActor {
	
	public NotificationActor(ActorRef dispatchActor, IncUtil incUtil, boolean cascadingNotifications) {
		super(dispatchActor, incUtil, cascadingNotifications);
	}
	
	@Override
	protected void initializeExploration() {
		explorationConsumer.put(org.emftext.language.java.commons.CommonsPackage.eINSTANCE.getNamedElement(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.commons.NamedElement _namedelement = (org.emftext.language.java.commons.NamedElement) obj;
			children.addAll(_namedelement.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getAssignmentModulo(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.operators.AssignmentModulo _assignmentmodulo = (org.emftext.language.java.operators.AssignmentModulo) obj;
			children.addAll(_assignmentmodulo.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.members.MembersPackage.eINSTANCE.getMemberContainer(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.members.MemberContainer _membercontainer = (org.emftext.language.java.members.MemberContainer) obj;
			children.addAll(_membercontainer.getLayoutInformations());
			children.addAll(_membercontainer.getMembers());
			children.addAll(_membercontainer.getDefaultMembers());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.references.ReferencesPackage.eINSTANCE.getElementReference(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.references.ElementReference _elementreference = (org.emftext.language.java.references.ElementReference) obj;
			children.addAll(_elementreference.getLayoutInformations());
			children.addAll(_elementreference.getTypeArguments());
			if(_elementreference.getNext() != null)
				children.add(_elementreference.getNext());
			children.addAll(_elementreference.getArraySelectors());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getVariable(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.Variable _variable = (uml.Variable) obj;
			children.addAll(_variable.getEAnnotations());
			children.addAll(_variable.getOwnedComment());
			if(_variable.getNameExpression() != null)
				children.add(_variable.getNameExpression());
			if(_variable.getLowerValue() != null)
				children.add(_variable.getLowerValue());
			if(_variable.getUpperValue() != null)
				children.add(_variable.getUpperValue());
			return children;
		});
		explorationConsumer.put(Java2Uml.Java2UmlPackage.eINSTANCE.getInterfaceFinalToFinal__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getForkNode(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.ForkNode _forknode = (uml.ForkNode) obj;
			children.addAll(_forknode.getEAnnotations());
			children.addAll(_forknode.getOwnedComment());
			if(_forknode.getNameExpression() != null)
				children.add(_forknode.getNameExpression());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getUnaryModificationOperator(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.operators.UnaryModificationOperator _unarymodificationoperator = (org.emftext.language.java.operators.UnaryModificationOperator) obj;
			children.addAll(_unarymodificationoperator.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getPrimaryExpression(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.expressions.PrimaryExpression _primaryexpression = (org.emftext.language.java.expressions.PrimaryExpression) obj;
			children.addAll(_primaryexpression.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(Java2Uml.Java2UmlPackage.eINSTANCE.getInterfaceConstructorToConstructor__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArrayTypeable(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.arrays.ArrayTypeable _arraytypeable = (org.emftext.language.java.arrays.ArrayTypeable) obj;
			children.addAll(_arraytypeable.getLayoutInformations());
			children.addAll(_arraytypeable.getArrayDimensionsBefore());
			children.addAll(_arraytypeable.getArrayDimensionsAfter());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.containers.ContainersPackage.eINSTANCE.getEmptyModel(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.containers.EmptyModel _emptymodel = (org.emftext.language.java.containers.EmptyModel) obj;
			children.addAll(_emptymodel.getLayoutInformations());
			children.addAll(_emptymodel.getImports());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getMultiplicativeExpression(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.expressions.MultiplicativeExpression _multiplicativeexpression = (org.emftext.language.java.expressions.MultiplicativeExpression) obj;
			children.addAll(_multiplicativeexpression.getLayoutInformations());
			children.addAll(_multiplicativeexpression.getChildren());
			children.addAll(_multiplicativeexpression.getMultiplicativeOperators());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getReadLinkObjectEndAction(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.ReadLinkObjectEndAction _readlinkobjectendaction = (uml.ReadLinkObjectEndAction) obj;
			children.addAll(_readlinkobjectendaction.getEAnnotations());
			children.addAll(_readlinkobjectendaction.getOwnedComment());
			if(_readlinkobjectendaction.getNameExpression() != null)
				children.add(_readlinkobjectendaction.getNameExpression());
			children.addAll(_readlinkobjectendaction.getHandler());
			children.addAll(_readlinkobjectendaction.getLocalPostcondition());
			children.addAll(_readlinkobjectendaction.getLocalPrecondition());
			if(_readlinkobjectendaction.getObject() != null)
				children.add(_readlinkobjectendaction.getObject());
			if(_readlinkobjectendaction.getResult() != null)
				children.add(_readlinkobjectendaction.getResult());
			return children;
		});
		explorationConsumer.put(Java2Uml.Java2UmlPackage.eINSTANCE.getSuperInterfaceToSuperInterface__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getAssignmentOr(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.operators.AssignmentOr _assignmentor = (org.emftext.language.java.operators.AssignmentOr) obj;
			children.addAll(_assignmentor.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getBehavioredClassifier(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.BehavioredClassifier _behavioredclassifier = (uml.BehavioredClassifier) obj;
			children.addAll(_behavioredclassifier.getEAnnotations());
			children.addAll(_behavioredclassifier.getOwnedComment());
			if(_behavioredclassifier.getNameExpression() != null)
				children.add(_behavioredclassifier.getNameExpression());
			children.addAll(_behavioredclassifier.getOwnedRule());
			children.addAll(_behavioredclassifier.getElementImport());
			children.addAll(_behavioredclassifier.getPackageImport());
			children.addAll(_behavioredclassifier.getTemplateBinding());
			if(_behavioredclassifier.getOwnedTemplateSignature() != null)
				children.add(_behavioredclassifier.getOwnedTemplateSignature());
			children.addAll(_behavioredclassifier.getCollaborationUse());
			children.addAll(_behavioredclassifier.getGeneralization());
			children.addAll(_behavioredclassifier.getOwnedUseCase());
			children.addAll(_behavioredclassifier.getSubstitution());
			children.addAll(_behavioredclassifier.getInterfaceRealization());
			children.addAll(_behavioredclassifier.getOwnedBehavior());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getType(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.Type _type = (uml.Type) obj;
			children.addAll(_type.getEAnnotations());
			children.addAll(_type.getOwnedComment());
			if(_type.getNameExpression() != null)
				children.add(_type.getNameExpression());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getOperator(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.operators.Operator _operator = (org.emftext.language.java.operators.Operator) obj;
			children.addAll(_operator.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getAnyReceiveEvent(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.AnyReceiveEvent _anyreceiveevent = (uml.AnyReceiveEvent) obj;
			children.addAll(_anyreceiveevent.getEAnnotations());
			children.addAll(_anyreceiveevent.getOwnedComment());
			if(_anyreceiveevent.getNameExpression() != null)
				children.add(_anyreceiveevent.getNameExpression());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getDurationObservation(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.DurationObservation _durationobservation = (uml.DurationObservation) obj;
			children.addAll(_durationobservation.getEAnnotations());
			children.addAll(_durationobservation.getOwnedComment());
			if(_durationobservation.getNameExpression() != null)
				children.add(_durationobservation.getNameExpression());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getConditionalExpression(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.expressions.ConditionalExpression _conditionalexpression = (org.emftext.language.java.expressions.ConditionalExpression) obj;
			children.addAll(_conditionalexpression.getLayoutInformations());
			if(_conditionalexpression.getChild() != null)
				children.add(_conditionalexpression.getChild());
			if(_conditionalexpression.getExpressionIf() != null)
				children.add(_conditionalexpression.getExpressionIf());
			if(_conditionalexpression.getExpressionElse() != null)
				children.add(_conditionalexpression.getExpressionElse());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getProtocolTransition(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.ProtocolTransition _protocoltransition = (uml.ProtocolTransition) obj;
			children.addAll(_protocoltransition.getEAnnotations());
			children.addAll(_protocoltransition.getOwnedComment());
			if(_protocoltransition.getNameExpression() != null)
				children.add(_protocoltransition.getNameExpression());
			children.addAll(_protocoltransition.getOwnedRule());
			children.addAll(_protocoltransition.getElementImport());
			children.addAll(_protocoltransition.getPackageImport());
			if(_protocoltransition.getEffect() != null)
				children.add(_protocoltransition.getEffect());
			children.addAll(_protocoltransition.getTrigger());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArrayInstantiationByValuesTyped(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.arrays.ArrayInstantiationByValuesTyped _arrayinstantiationbyvaluestyped = (org.emftext.language.java.arrays.ArrayInstantiationByValuesTyped) obj;
			children.addAll(_arrayinstantiationbyvaluestyped.getLayoutInformations());
			children.addAll(_arrayinstantiationbyvaluestyped.getTypeArguments());
			if(_arrayinstantiationbyvaluestyped.getNext() != null)
				children.add(_arrayinstantiationbyvaluestyped.getNext());
			children.addAll(_arrayinstantiationbyvaluestyped.getArraySelectors());
			if(_arrayinstantiationbyvaluestyped.getArrayInitializer() != null)
				children.add(_arrayinstantiationbyvaluestyped.getArrayInitializer());
			if(_arrayinstantiationbyvaluestyped.getTypeReference() != null)
				children.add(_arrayinstantiationbyvaluestyped.getTypeReference());
			children.addAll(_arrayinstantiationbyvaluestyped.getArrayDimensionsBefore());
			children.addAll(_arrayinstantiationbyvaluestyped.getArrayDimensionsAfter());
			return children;
		});
		explorationConsumer.put(Java2Uml.Java2UmlPackage.eINSTANCE.getClassMethodToMethod__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getControlFlow(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.ControlFlow _controlflow = (uml.ControlFlow) obj;
			children.addAll(_controlflow.getEAnnotations());
			children.addAll(_controlflow.getOwnedComment());
			if(_controlflow.getNameExpression() != null)
				children.add(_controlflow.getNameExpression());
			if(_controlflow.getGuard() != null)
				children.add(_controlflow.getGuard());
			if(_controlflow.getWeight() != null)
				children.add(_controlflow.getWeight());
			return children;
		});
		explorationConsumer.put(Java2Uml.Java2UmlPackage.eINSTANCE.getInterfacePrivateToPrivate__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getAssignmentExclusiveOr(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.operators.AssignmentExclusiveOr _assignmentexclusiveor = (org.emftext.language.java.operators.AssignmentExclusiveOr) obj;
			children.addAll(_assignmentexclusiveor.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getBehaviorExecutionSpecification(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.BehaviorExecutionSpecification _behaviorexecutionspecification = (uml.BehaviorExecutionSpecification) obj;
			children.addAll(_behaviorexecutionspecification.getEAnnotations());
			children.addAll(_behaviorexecutionspecification.getOwnedComment());
			if(_behaviorexecutionspecification.getNameExpression() != null)
				children.add(_behaviorexecutionspecification.getNameExpression());
			children.addAll(_behaviorexecutionspecification.getGeneralOrdering());
			return children;
		});
		explorationConsumer.put(Java2Uml.Java2UmlPackage.eINSTANCE.getClassConstructorToConstructor__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getReadExtentAction(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.ReadExtentAction _readextentaction = (uml.ReadExtentAction) obj;
			children.addAll(_readextentaction.getEAnnotations());
			children.addAll(_readextentaction.getOwnedComment());
			if(_readextentaction.getNameExpression() != null)
				children.add(_readextentaction.getNameExpression());
			children.addAll(_readextentaction.getHandler());
			children.addAll(_readextentaction.getLocalPostcondition());
			children.addAll(_readextentaction.getLocalPrecondition());
			if(_readextentaction.getResult() != null)
				children.add(_readextentaction.getResult());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getCallEvent(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.CallEvent _callevent = (uml.CallEvent) obj;
			children.addAll(_callevent.getEAnnotations());
			children.addAll(_callevent.getOwnedComment());
			if(_callevent.getNameExpression() != null)
				children.add(_callevent.getNameExpression());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getEnumerationLiteral(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.EnumerationLiteral _enumerationliteral = (uml.EnumerationLiteral) obj;
			children.addAll(_enumerationliteral.getEAnnotations());
			children.addAll(_enumerationliteral.getOwnedComment());
			if(_enumerationliteral.getNameExpression() != null)
				children.add(_enumerationliteral.getNameExpression());
			children.addAll(_enumerationliteral.getDeployment());
			children.addAll(_enumerationliteral.getSlot());
			if(_enumerationliteral.getSpecification() != null)
				children.add(_enumerationliteral.getSpecification());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.literals.LiteralsPackage.eINSTANCE.getDecimalFloatLiteral(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.literals.DecimalFloatLiteral _decimalfloatliteral = (org.emftext.language.java.literals.DecimalFloatLiteral) obj;
			children.addAll(_decimalfloatliteral.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getShiftOperator(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.operators.ShiftOperator _shiftoperator = (org.emftext.language.java.operators.ShiftOperator) obj;
			children.addAll(_shiftoperator.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getConnector(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.Connector _connector = (uml.Connector) obj;
			children.addAll(_connector.getEAnnotations());
			children.addAll(_connector.getOwnedComment());
			if(_connector.getNameExpression() != null)
				children.add(_connector.getNameExpression());
			children.addAll(_connector.getEnd());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getInteraction(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.Interaction _interaction = (uml.Interaction) obj;
			children.addAll(_interaction.getEAnnotations());
			children.addAll(_interaction.getOwnedComment());
			if(_interaction.getNameExpression() != null)
				children.add(_interaction.getNameExpression());
			children.addAll(_interaction.getOwnedRule());
			children.addAll(_interaction.getElementImport());
			children.addAll(_interaction.getPackageImport());
			children.addAll(_interaction.getTemplateBinding());
			if(_interaction.getOwnedTemplateSignature() != null)
				children.add(_interaction.getOwnedTemplateSignature());
			children.addAll(_interaction.getCollaborationUse());
			children.addAll(_interaction.getGeneralization());
			children.addAll(_interaction.getOwnedUseCase());
			children.addAll(_interaction.getSubstitution());
			children.addAll(_interaction.getOwnedAttribute());
			children.addAll(_interaction.getOwnedConnector());
			children.addAll(_interaction.getInterfaceRealization());
			children.addAll(_interaction.getOwnedBehavior());
			children.addAll(_interaction.getOwnedOperation());
			children.addAll(_interaction.getNestedClassifier());
			children.addAll(_interaction.getOwnedReception());
			children.addAll(_interaction.getOwnedParameter());
			children.addAll(_interaction.getOwnedParameterSet());
			children.addAll(_interaction.getGeneralOrdering());
			children.addAll(_interaction.getLifeline());
			children.addAll(_interaction.getFragment());
			children.addAll(_interaction.getAction());
			children.addAll(_interaction.getFormalGate());
			children.addAll(_interaction.getMessage());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getMultiplication(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.operators.Multiplication _multiplication = (org.emftext.language.java.operators.Multiplication) obj;
			children.addAll(_multiplication.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.annotations.AnnotationsPackage.eINSTANCE.getAnnotationInstance(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.annotations.AnnotationInstance _annotationinstance = (org.emftext.language.java.annotations.AnnotationInstance) obj;
			children.addAll(_annotationinstance.getLayoutInformations());
			children.addAll(_annotationinstance.getTypeArguments());
			if(_annotationinstance.getNext() != null)
				children.add(_annotationinstance.getNext());
			children.addAll(_annotationinstance.getArraySelectors());
			if(_annotationinstance.getParameter() != null)
				children.add(_annotationinstance.getParameter());
			return children;
		});
		explorationConsumer.put(Java2Uml.Java2UmlPackage.eINSTANCE.getMethodEnumParamTypeToParamType__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getStatement(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.statements.Statement _statement = (org.emftext.language.java.statements.Statement) obj;
			children.addAll(_statement.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getCommunicationPath(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.CommunicationPath _communicationpath = (uml.CommunicationPath) obj;
			children.addAll(_communicationpath.getEAnnotations());
			children.addAll(_communicationpath.getOwnedComment());
			if(_communicationpath.getNameExpression() != null)
				children.add(_communicationpath.getNameExpression());
			children.addAll(_communicationpath.getOwnedRule());
			children.addAll(_communicationpath.getElementImport());
			children.addAll(_communicationpath.getPackageImport());
			children.addAll(_communicationpath.getTemplateBinding());
			if(_communicationpath.getOwnedTemplateSignature() != null)
				children.add(_communicationpath.getOwnedTemplateSignature());
			children.addAll(_communicationpath.getCollaborationUse());
			children.addAll(_communicationpath.getGeneralization());
			children.addAll(_communicationpath.getOwnedUseCase());
			children.addAll(_communicationpath.getSubstitution());
			children.addAll(_communicationpath.getOwnedEnd());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getInformationFlow(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.InformationFlow _informationflow = (uml.InformationFlow) obj;
			children.addAll(_informationflow.getEAnnotations());
			children.addAll(_informationflow.getOwnedComment());
			if(_informationflow.getNameExpression() != null)
				children.add(_informationflow.getNameExpression());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.parameters.ParametersPackage.eINSTANCE.getOrdinaryParameter(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.parameters.OrdinaryParameter _ordinaryparameter = (org.emftext.language.java.parameters.OrdinaryParameter) obj;
			children.addAll(_ordinaryparameter.getLayoutInformations());
			if(_ordinaryparameter.getTypeReference() != null)
				children.add(_ordinaryparameter.getTypeReference());
			children.addAll(_ordinaryparameter.getArrayDimensionsBefore());
			children.addAll(_ordinaryparameter.getArrayDimensionsAfter());
			children.addAll(_ordinaryparameter.getTypeArguments());
			children.addAll(_ordinaryparameter.getAnnotationsAndModifiers());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getInstanceValue(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.InstanceValue _instancevalue = (uml.InstanceValue) obj;
			children.addAll(_instancevalue.getEAnnotations());
			children.addAll(_instancevalue.getOwnedComment());
			if(_instancevalue.getNameExpression() != null)
				children.add(_instancevalue.getNameExpression());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.imports.ImportsPackage.eINSTANCE.getStaticMemberImport(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.imports.StaticMemberImport _staticmemberimport = (org.emftext.language.java.imports.StaticMemberImport) obj;
			children.addAll(_staticmemberimport.getLayoutInformations());
			if(_staticmemberimport.getStatic() != null)
				children.add(_staticmemberimport.getStatic());
			return children;
		});
		explorationConsumer.put(org.eclipse.emf.ecore.EcorePackage.eINSTANCE.getEAttribute(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.emf.ecore.EAttribute _eattribute = (org.eclipse.emf.ecore.EAttribute) obj;
			children.addAll(_eattribute.getEAnnotations());
			if(_eattribute.getEGenericType() != null)
				children.add(_eattribute.getEGenericType());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.modifiers.ModifiersPackage.eINSTANCE.getNative(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.modifiers.Native _native = (org.emftext.language.java.modifiers.Native) obj;
			children.addAll(_native.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(Java2Uml.Java2UmlPackage.eINSTANCE.getEnumToUmlEnum__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getEqualityExpression(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.expressions.EqualityExpression _equalityexpression = (org.emftext.language.java.expressions.EqualityExpression) obj;
			children.addAll(_equalityexpression.getLayoutInformations());
			children.addAll(_equalityexpression.getEqualityOperators());
			children.addAll(_equalityexpression.getChildren());
			return children;
		});
		explorationConsumer.put(Java2Uml.Java2UmlPackage.eINSTANCE.getEnumAttributeToProperty__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.modifiers.ModifiersPackage.eINSTANCE.getTransient(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.modifiers.Transient _transient = (org.emftext.language.java.modifiers.Transient) obj;
			children.addAll(_transient.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getManifestation(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.Manifestation _manifestation = (uml.Manifestation) obj;
			children.addAll(_manifestation.getEAnnotations());
			children.addAll(_manifestation.getOwnedComment());
			if(_manifestation.getNameExpression() != null)
				children.add(_manifestation.getNameExpression());
			if(_manifestation.getMapping() != null)
				children.add(_manifestation.getMapping());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getNestedExpression(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.expressions.NestedExpression _nestedexpression = (org.emftext.language.java.expressions.NestedExpression) obj;
			children.addAll(_nestedexpression.getLayoutInformations());
			children.addAll(_nestedexpression.getTypeArguments());
			if(_nestedexpression.getNext() != null)
				children.add(_nestedexpression.getNext());
			children.addAll(_nestedexpression.getArraySelectors());
			if(_nestedexpression.getExpression() != null)
				children.add(_nestedexpression.getExpression());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.containers.ContainersPackage.eINSTANCE.getCompilationUnit(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.containers.CompilationUnit _compilationunit = (org.emftext.language.java.containers.CompilationUnit) obj;
			children.addAll(_compilationunit.getLayoutInformations());
			children.addAll(_compilationunit.getImports());
			children.addAll(_compilationunit.getClassifiers());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getCallOperationAction(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.CallOperationAction _calloperationaction = (uml.CallOperationAction) obj;
			children.addAll(_calloperationaction.getEAnnotations());
			children.addAll(_calloperationaction.getOwnedComment());
			if(_calloperationaction.getNameExpression() != null)
				children.add(_calloperationaction.getNameExpression());
			children.addAll(_calloperationaction.getHandler());
			children.addAll(_calloperationaction.getLocalPostcondition());
			children.addAll(_calloperationaction.getLocalPrecondition());
			children.addAll(_calloperationaction.getArgument());
			children.addAll(_calloperationaction.getResult());
			if(_calloperationaction.getTarget() != null)
				children.add(_calloperationaction.getTarget());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getQualifierValue(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.QualifierValue _qualifiervalue = (uml.QualifierValue) obj;
			children.addAll(_qualifiervalue.getEAnnotations());
			children.addAll(_qualifiervalue.getOwnedComment());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getValueSpecification(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.ValueSpecification _valuespecification = (uml.ValueSpecification) obj;
			children.addAll(_valuespecification.getEAnnotations());
			children.addAll(_valuespecification.getOwnedComment());
			if(_valuespecification.getNameExpression() != null)
				children.add(_valuespecification.getNameExpression());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getNotEqual(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.operators.NotEqual _notequal = (org.emftext.language.java.operators.NotEqual) obj;
			children.addAll(_notequal.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getTemplateBinding(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.TemplateBinding _templatebinding = (uml.TemplateBinding) obj;
			children.addAll(_templatebinding.getEAnnotations());
			children.addAll(_templatebinding.getOwnedComment());
			children.addAll(_templatebinding.getParameterSubstitution());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getFinalState(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.FinalState _finalstate = (uml.FinalState) obj;
			children.addAll(_finalstate.getEAnnotations());
			children.addAll(_finalstate.getOwnedComment());
			if(_finalstate.getNameExpression() != null)
				children.add(_finalstate.getNameExpression());
			children.addAll(_finalstate.getOwnedRule());
			children.addAll(_finalstate.getElementImport());
			children.addAll(_finalstate.getPackageImport());
			children.addAll(_finalstate.getConnection());
			children.addAll(_finalstate.getConnectionPoint());
			children.addAll(_finalstate.getDeferrableTrigger());
			if(_finalstate.getDoActivity() != null)
				children.add(_finalstate.getDoActivity());
			if(_finalstate.getEntry() != null)
				children.add(_finalstate.getEntry());
			if(_finalstate.getExit() != null)
				children.add(_finalstate.getExit());
			children.addAll(_finalstate.getRegion());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getLessThan(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.operators.LessThan _lessthan = (org.emftext.language.java.operators.LessThan) obj;
			children.addAll(_lessthan.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getAssignmentMultiplication(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.operators.AssignmentMultiplication _assignmentmultiplication = (org.emftext.language.java.operators.AssignmentMultiplication) obj;
			children.addAll(_assignmentmultiplication.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getEqual(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.operators.Equal _equal = (org.emftext.language.java.operators.Equal) obj;
			children.addAll(_equal.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getDeployedArtifact(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.DeployedArtifact _deployedartifact = (uml.DeployedArtifact) obj;
			children.addAll(_deployedartifact.getEAnnotations());
			children.addAll(_deployedartifact.getOwnedComment());
			if(_deployedartifact.getNameExpression() != null)
				children.add(_deployedartifact.getNameExpression());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getExceptionHandler(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.ExceptionHandler _exceptionhandler = (uml.ExceptionHandler) obj;
			children.addAll(_exceptionhandler.getEAnnotations());
			children.addAll(_exceptionhandler.getOwnedComment());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getProfileApplication(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.ProfileApplication _profileapplication = (uml.ProfileApplication) obj;
			children.addAll(_profileapplication.getEAnnotations());
			children.addAll(_profileapplication.getOwnedComment());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.literals.LiteralsPackage.eINSTANCE.getFloatLiteral(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.literals.FloatLiteral _floatliteral = (org.emftext.language.java.literals.FloatLiteral) obj;
			children.addAll(_floatliteral.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getCallBehaviorAction(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.CallBehaviorAction _callbehavioraction = (uml.CallBehaviorAction) obj;
			children.addAll(_callbehavioraction.getEAnnotations());
			children.addAll(_callbehavioraction.getOwnedComment());
			if(_callbehavioraction.getNameExpression() != null)
				children.add(_callbehavioraction.getNameExpression());
			children.addAll(_callbehavioraction.getHandler());
			children.addAll(_callbehavioraction.getLocalPostcondition());
			children.addAll(_callbehavioraction.getLocalPrecondition());
			children.addAll(_callbehavioraction.getArgument());
			children.addAll(_callbehavioraction.getResult());
			return children;
		});
		explorationConsumer.put(Java2Uml.Java2UmlPackage.eINSTANCE.getRootJavaPackageToUmlPackage__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getElementImport(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.ElementImport _elementimport = (uml.ElementImport) obj;
			children.addAll(_elementimport.getEAnnotations());
			children.addAll(_elementimport.getOwnedComment());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getMessageEvent(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.MessageEvent _messageevent = (uml.MessageEvent) obj;
			children.addAll(_messageevent.getEAnnotations());
			children.addAll(_messageevent.getOwnedComment());
			if(_messageevent.getNameExpression() != null)
				children.add(_messageevent.getNameExpression());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getLessThanOrEqual(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.operators.LessThanOrEqual _lessthanorequal = (org.emftext.language.java.operators.LessThanOrEqual) obj;
			children.addAll(_lessthanorequal.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(Java2Uml.Java2UmlPackage.eINSTANCE.getJavaFirstCompilationUnitToUmlModel__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getActionExecutionSpecification(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.ActionExecutionSpecification _actionexecutionspecification = (uml.ActionExecutionSpecification) obj;
			children.addAll(_actionexecutionspecification.getEAnnotations());
			children.addAll(_actionexecutionspecification.getOwnedComment());
			if(_actionexecutionspecification.getNameExpression() != null)
				children.add(_actionexecutionspecification.getNameExpression());
			children.addAll(_actionexecutionspecification.getGeneralOrdering());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getTimeInterval(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.TimeInterval _timeinterval = (uml.TimeInterval) obj;
			children.addAll(_timeinterval.getEAnnotations());
			children.addAll(_timeinterval.getOwnedComment());
			if(_timeinterval.getNameExpression() != null)
				children.add(_timeinterval.getNameExpression());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.generics.GenericsPackage.eINSTANCE.getTypeParametrizable(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.generics.TypeParametrizable _typeparametrizable = (org.emftext.language.java.generics.TypeParametrizable) obj;
			children.addAll(_typeparametrizable.getLayoutInformations());
			children.addAll(_typeparametrizable.getTypeParameters());
			return children;
		});
		explorationConsumer.put(Java2Uml.Java2UmlPackage.eINSTANCE.getInterfaceMethodToMethod__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.references.ReferencesPackage.eINSTANCE.getReflectiveClassReference(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.references.ReflectiveClassReference _reflectiveclassreference = (org.emftext.language.java.references.ReflectiveClassReference) obj;
			children.addAll(_reflectiveclassreference.getLayoutInformations());
			children.addAll(_reflectiveclassreference.getTypeArguments());
			if(_reflectiveclassreference.getNext() != null)
				children.add(_reflectiveclassreference.getNext());
			children.addAll(_reflectiveclassreference.getArraySelectors());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getExecutableNode(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.ExecutableNode _executablenode = (uml.ExecutableNode) obj;
			children.addAll(_executablenode.getEAnnotations());
			children.addAll(_executablenode.getOwnedComment());
			if(_executablenode.getNameExpression() != null)
				children.add(_executablenode.getNameExpression());
			children.addAll(_executablenode.getHandler());
			return children;
		});
		explorationConsumer.put(Java2Uml.Java2UmlPackage.eINSTANCE.getVariableLengthMethodParameterToParameter__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getWriteStructuralFeatureAction(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.WriteStructuralFeatureAction _writestructuralfeatureaction = (uml.WriteStructuralFeatureAction) obj;
			children.addAll(_writestructuralfeatureaction.getEAnnotations());
			children.addAll(_writestructuralfeatureaction.getOwnedComment());
			if(_writestructuralfeatureaction.getNameExpression() != null)
				children.add(_writestructuralfeatureaction.getNameExpression());
			children.addAll(_writestructuralfeatureaction.getHandler());
			children.addAll(_writestructuralfeatureaction.getLocalPostcondition());
			children.addAll(_writestructuralfeatureaction.getLocalPrecondition());
			if(_writestructuralfeatureaction.getObject() != null)
				children.add(_writestructuralfeatureaction.getObject());
			if(_writestructuralfeatureaction.getResult() != null)
				children.add(_writestructuralfeatureaction.getResult());
			if(_writestructuralfeatureaction.getValue() != null)
				children.add(_writestructuralfeatureaction.getValue());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getCombinedFragment(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.CombinedFragment _combinedfragment = (uml.CombinedFragment) obj;
			children.addAll(_combinedfragment.getEAnnotations());
			children.addAll(_combinedfragment.getOwnedComment());
			if(_combinedfragment.getNameExpression() != null)
				children.add(_combinedfragment.getNameExpression());
			children.addAll(_combinedfragment.getGeneralOrdering());
			children.addAll(_combinedfragment.getCfragmentGate());
			children.addAll(_combinedfragment.getOperand());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getInformationItem(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.InformationItem _informationitem = (uml.InformationItem) obj;
			children.addAll(_informationitem.getEAnnotations());
			children.addAll(_informationitem.getOwnedComment());
			if(_informationitem.getNameExpression() != null)
				children.add(_informationitem.getNameExpression());
			children.addAll(_informationitem.getOwnedRule());
			children.addAll(_informationitem.getElementImport());
			children.addAll(_informationitem.getPackageImport());
			children.addAll(_informationitem.getTemplateBinding());
			if(_informationitem.getOwnedTemplateSignature() != null)
				children.add(_informationitem.getOwnedTemplateSignature());
			children.addAll(_informationitem.getCollaborationUse());
			children.addAll(_informationitem.getGeneralization());
			children.addAll(_informationitem.getOwnedUseCase());
			children.addAll(_informationitem.getSubstitution());
			return children;
		});
		explorationConsumer.put(Java2Uml.Java2UmlPackage.eINSTANCE.getEnumAbstractToAbstract__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getDurationInterval(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.DurationInterval _durationinterval = (uml.DurationInterval) obj;
			children.addAll(_durationinterval.getEAnnotations());
			children.addAll(_durationinterval.getOwnedComment());
			if(_durationinterval.getNameExpression() != null)
				children.add(_durationinterval.getNameExpression());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getStructuredClassifier(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.StructuredClassifier _structuredclassifier = (uml.StructuredClassifier) obj;
			children.addAll(_structuredclassifier.getEAnnotations());
			children.addAll(_structuredclassifier.getOwnedComment());
			if(_structuredclassifier.getNameExpression() != null)
				children.add(_structuredclassifier.getNameExpression());
			children.addAll(_structuredclassifier.getOwnedRule());
			children.addAll(_structuredclassifier.getElementImport());
			children.addAll(_structuredclassifier.getPackageImport());
			children.addAll(_structuredclassifier.getTemplateBinding());
			if(_structuredclassifier.getOwnedTemplateSignature() != null)
				children.add(_structuredclassifier.getOwnedTemplateSignature());
			children.addAll(_structuredclassifier.getCollaborationUse());
			children.addAll(_structuredclassifier.getGeneralization());
			children.addAll(_structuredclassifier.getOwnedUseCase());
			children.addAll(_structuredclassifier.getSubstitution());
			children.addAll(_structuredclassifier.getOwnedAttribute());
			children.addAll(_structuredclassifier.getOwnedConnector());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getUnaryModificationExpression(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.expressions.UnaryModificationExpression _unarymodificationexpression = (org.emftext.language.java.expressions.UnaryModificationExpression) obj;
			children.addAll(_unarymodificationexpression.getLayoutInformations());
			if(_unarymodificationexpression.getChild() != null)
				children.add(_unarymodificationexpression.getChild());
			if(_unarymodificationexpression.getOperator() != null)
				children.add(_unarymodificationexpression.getOperator());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getDevice(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.Device _device = (uml.Device) obj;
			children.addAll(_device.getEAnnotations());
			children.addAll(_device.getOwnedComment());
			if(_device.getNameExpression() != null)
				children.add(_device.getNameExpression());
			children.addAll(_device.getOwnedRule());
			children.addAll(_device.getElementImport());
			children.addAll(_device.getPackageImport());
			children.addAll(_device.getTemplateBinding());
			if(_device.getOwnedTemplateSignature() != null)
				children.add(_device.getOwnedTemplateSignature());
			children.addAll(_device.getCollaborationUse());
			children.addAll(_device.getGeneralization());
			children.addAll(_device.getOwnedUseCase());
			children.addAll(_device.getSubstitution());
			children.addAll(_device.getOwnedAttribute());
			children.addAll(_device.getOwnedConnector());
			children.addAll(_device.getInterfaceRealization());
			children.addAll(_device.getOwnedBehavior());
			children.addAll(_device.getOwnedOperation());
			children.addAll(_device.getNestedClassifier());
			children.addAll(_device.getOwnedReception());
			children.addAll(_device.getDeployment());
			children.addAll(_device.getNestedNode());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getDependency(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.Dependency _dependency = (uml.Dependency) obj;
			children.addAll(_dependency.getEAnnotations());
			children.addAll(_dependency.getOwnedComment());
			if(_dependency.getNameExpression() != null)
				children.add(_dependency.getNameExpression());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getAddStructuralFeatureValueAction(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.AddStructuralFeatureValueAction _addstructuralfeaturevalueaction = (uml.AddStructuralFeatureValueAction) obj;
			children.addAll(_addstructuralfeaturevalueaction.getEAnnotations());
			children.addAll(_addstructuralfeaturevalueaction.getOwnedComment());
			if(_addstructuralfeaturevalueaction.getNameExpression() != null)
				children.add(_addstructuralfeaturevalueaction.getNameExpression());
			children.addAll(_addstructuralfeaturevalueaction.getHandler());
			children.addAll(_addstructuralfeaturevalueaction.getLocalPostcondition());
			children.addAll(_addstructuralfeaturevalueaction.getLocalPrecondition());
			if(_addstructuralfeaturevalueaction.getObject() != null)
				children.add(_addstructuralfeaturevalueaction.getObject());
			if(_addstructuralfeaturevalueaction.getResult() != null)
				children.add(_addstructuralfeaturevalueaction.getResult());
			if(_addstructuralfeaturevalueaction.getValue() != null)
				children.add(_addstructuralfeaturevalueaction.getValue());
			if(_addstructuralfeaturevalueaction.getInsertAt() != null)
				children.add(_addstructuralfeaturevalueaction.getInsertAt());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getMultiplicityElement(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.MultiplicityElement _multiplicityelement = (uml.MultiplicityElement) obj;
			children.addAll(_multiplicityelement.getEAnnotations());
			children.addAll(_multiplicityelement.getOwnedComment());
			if(_multiplicityelement.getLowerValue() != null)
				children.add(_multiplicityelement.getLowerValue());
			if(_multiplicityelement.getUpperValue() != null)
				children.add(_multiplicityelement.getUpperValue());
			return children;
		});
		explorationConsumer.put(Java2Uml.Java2UmlPackage.eINSTANCE.getJavaClassifierReferenceToUmlInterfaceRealization(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.variables.VariablesPackage.eINSTANCE.getLocalVariable(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.variables.LocalVariable _localvariable = (org.emftext.language.java.variables.LocalVariable) obj;
			children.addAll(_localvariable.getLayoutInformations());
			if(_localvariable.getTypeReference() != null)
				children.add(_localvariable.getTypeReference());
			children.addAll(_localvariable.getArrayDimensionsBefore());
			children.addAll(_localvariable.getArrayDimensionsAfter());
			children.addAll(_localvariable.getTypeArguments());
			if(_localvariable.getInitialValue() != null)
				children.add(_localvariable.getInitialValue());
			children.addAll(_localvariable.getAnnotationsAndModifiers());
			children.addAll(_localvariable.getAdditionalLocalVariables());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getExpansionNode(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.ExpansionNode _expansionnode = (uml.ExpansionNode) obj;
			children.addAll(_expansionnode.getEAnnotations());
			children.addAll(_expansionnode.getOwnedComment());
			if(_expansionnode.getNameExpression() != null)
				children.add(_expansionnode.getNameExpression());
			if(_expansionnode.getUpperBound() != null)
				children.add(_expansionnode.getUpperBound());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.modifiers.ModifiersPackage.eINSTANCE.getPublic(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.modifiers.Public _public = (org.emftext.language.java.modifiers.Public) obj;
			children.addAll(_public.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAndExpressionChild(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.expressions.AndExpressionChild _andexpressionchild = (org.emftext.language.java.expressions.AndExpressionChild) obj;
			children.addAll(_andexpressionchild.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getReadSelfAction(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.ReadSelfAction _readselfaction = (uml.ReadSelfAction) obj;
			children.addAll(_readselfaction.getEAnnotations());
			children.addAll(_readselfaction.getOwnedComment());
			if(_readselfaction.getNameExpression() != null)
				children.add(_readselfaction.getNameExpression());
			children.addAll(_readselfaction.getHandler());
			children.addAll(_readselfaction.getLocalPostcondition());
			children.addAll(_readselfaction.getLocalPrecondition());
			if(_readselfaction.getResult() != null)
				children.add(_readselfaction.getResult());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getTemplateableElement(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.TemplateableElement _templateableelement = (uml.TemplateableElement) obj;
			children.addAll(_templateableelement.getEAnnotations());
			children.addAll(_templateableelement.getOwnedComment());
			children.addAll(_templateableelement.getTemplateBinding());
			if(_templateableelement.getOwnedTemplateSignature() != null)
				children.add(_templateableelement.getOwnedTemplateSignature());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getExecutionSpecification(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.ExecutionSpecification _executionspecification = (uml.ExecutionSpecification) obj;
			children.addAll(_executionspecification.getEAnnotations());
			children.addAll(_executionspecification.getOwnedComment());
			if(_executionspecification.getNameExpression() != null)
				children.add(_executionspecification.getNameExpression());
			children.addAll(_executionspecification.getGeneralOrdering());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAssignmentExpressionChild(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.expressions.AssignmentExpressionChild _assignmentexpressionchild = (org.emftext.language.java.expressions.AssignmentExpressionChild) obj;
			children.addAll(_assignmentexpressionchild.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getUnsignedRightShift(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.operators.UnsignedRightShift _unsignedrightshift = (org.emftext.language.java.operators.UnsignedRightShift) obj;
			children.addAll(_unsignedrightshift.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getLinkEndData(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.LinkEndData _linkenddata = (uml.LinkEndData) obj;
			children.addAll(_linkenddata.getEAnnotations());
			children.addAll(_linkenddata.getOwnedComment());
			children.addAll(_linkenddata.getQualifier());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getAssignmentDivision(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.operators.AssignmentDivision _assignmentdivision = (org.emftext.language.java.operators.AssignmentDivision) obj;
			children.addAll(_assignmentdivision.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getInteractionFragment(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.InteractionFragment _interactionfragment = (uml.InteractionFragment) obj;
			children.addAll(_interactionfragment.getEAnnotations());
			children.addAll(_interactionfragment.getOwnedComment());
			if(_interactionfragment.getNameExpression() != null)
				children.add(_interactionfragment.getNameExpression());
			children.addAll(_interactionfragment.getGeneralOrdering());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.containers.ContainersPackage.eINSTANCE.getJavaRoot(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.containers.JavaRoot _javaroot = (org.emftext.language.java.containers.JavaRoot) obj;
			children.addAll(_javaroot.getLayoutInformations());
			children.addAll(_javaroot.getImports());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getNamedElement(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.NamedElement _namedelement = (uml.NamedElement) obj;
			children.addAll(_namedelement.getEAnnotations());
			children.addAll(_namedelement.getOwnedComment());
			if(_namedelement.getNameExpression() != null)
				children.add(_namedelement.getNameExpression());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getActivityEdge(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.ActivityEdge _activityedge = (uml.ActivityEdge) obj;
			children.addAll(_activityedge.getEAnnotations());
			children.addAll(_activityedge.getOwnedComment());
			if(_activityedge.getNameExpression() != null)
				children.add(_activityedge.getNameExpression());
			if(_activityedge.getGuard() != null)
				children.add(_activityedge.getGuard());
			if(_activityedge.getWeight() != null)
				children.add(_activityedge.getWeight());
			return children;
		});
		explorationConsumer.put(org.eclipse.emf.ecore.EcorePackage.eINSTANCE.getEDataType(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.emf.ecore.EDataType _edatatype = (org.eclipse.emf.ecore.EDataType) obj;
			children.addAll(_edatatype.getEAnnotations());
			children.addAll(_edatatype.getETypeParameters());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getInteractionConstraint(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.InteractionConstraint _interactionconstraint = (uml.InteractionConstraint) obj;
			children.addAll(_interactionconstraint.getEAnnotations());
			children.addAll(_interactionconstraint.getOwnedComment());
			if(_interactionconstraint.getNameExpression() != null)
				children.add(_interactionconstraint.getNameExpression());
			if(_interactionconstraint.getSpecification() != null)
				children.add(_interactionconstraint.getSpecification());
			if(_interactionconstraint.getMaxint() != null)
				children.add(_interactionconstraint.getMaxint());
			if(_interactionconstraint.getMinint() != null)
				children.add(_interactionconstraint.getMinint());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getSwitch(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.statements.Switch _switch = (org.emftext.language.java.statements.Switch) obj;
			children.addAll(_switch.getLayoutInformations());
			children.addAll(_switch.getCases());
			if(_switch.getVariable() != null)
				children.add(_switch.getVariable());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.instantiations.InstantiationsPackage.eINSTANCE.getExplicitConstructorCall(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.instantiations.ExplicitConstructorCall _explicitconstructorcall = (org.emftext.language.java.instantiations.ExplicitConstructorCall) obj;
			children.addAll(_explicitconstructorcall.getLayoutInformations());
			children.addAll(_explicitconstructorcall.getTypeArguments());
			if(_explicitconstructorcall.getNext() != null)
				children.add(_explicitconstructorcall.getNext());
			children.addAll(_explicitconstructorcall.getArraySelectors());
			children.addAll(_explicitconstructorcall.getArguments());
			if(_explicitconstructorcall.getCallTarget() != null)
				children.add(_explicitconstructorcall.getCallTarget());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.literals.LiteralsPackage.eINSTANCE.getHexIntegerLiteral(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.literals.HexIntegerLiteral _hexintegerliteral = (org.emftext.language.java.literals.HexIntegerLiteral) obj;
			children.addAll(_hexintegerliteral.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.modifiers.ModifiersPackage.eINSTANCE.getSynchronized(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.modifiers.Synchronized _synchronized = (org.emftext.language.java.modifiers.Synchronized) obj;
			children.addAll(_synchronized.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getUsage(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.Usage _usage = (uml.Usage) obj;
			children.addAll(_usage.getEAnnotations());
			children.addAll(_usage.getOwnedComment());
			if(_usage.getNameExpression() != null)
				children.add(_usage.getNameExpression());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getGeneralOrdering(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.GeneralOrdering _generalordering = (uml.GeneralOrdering) obj;
			children.addAll(_generalordering.getEAnnotations());
			children.addAll(_generalordering.getOwnedComment());
			if(_generalordering.getNameExpression() != null)
				children.add(_generalordering.getNameExpression());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getInclusiveOrExpression(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.expressions.InclusiveOrExpression _inclusiveorexpression = (org.emftext.language.java.expressions.InclusiveOrExpression) obj;
			children.addAll(_inclusiveorexpression.getLayoutInformations());
			children.addAll(_inclusiveorexpression.getChildren());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getCastExpression(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.expressions.CastExpression _castexpression = (org.emftext.language.java.expressions.CastExpression) obj;
			children.addAll(_castexpression.getLayoutInformations());
			if(_castexpression.getTypeReference() != null)
				children.add(_castexpression.getTypeReference());
			children.addAll(_castexpression.getArrayDimensionsBefore());
			children.addAll(_castexpression.getArrayDimensionsAfter());
			if(_castexpression.getChild() != null)
				children.add(_castexpression.getChild());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getState(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.State _state = (uml.State) obj;
			children.addAll(_state.getEAnnotations());
			children.addAll(_state.getOwnedComment());
			if(_state.getNameExpression() != null)
				children.add(_state.getNameExpression());
			children.addAll(_state.getOwnedRule());
			children.addAll(_state.getElementImport());
			children.addAll(_state.getPackageImport());
			children.addAll(_state.getConnection());
			children.addAll(_state.getConnectionPoint());
			children.addAll(_state.getDeferrableTrigger());
			if(_state.getDoActivity() != null)
				children.add(_state.getDoActivity());
			if(_state.getEntry() != null)
				children.add(_state.getEntry());
			if(_state.getExit() != null)
				children.add(_state.getExit());
			children.addAll(_state.getRegion());
			return children;
		});
		explorationConsumer.put(Java2Uml.Java2UmlPackage.eINSTANCE.getExistingSuperClassToSuperClass__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(Java2Uml.Java2UmlPackage.eINSTANCE.getEnumProtectedToProtected__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.eclipse.emf.ecore.EcorePackage.eINSTANCE.getEModelElement(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.emf.ecore.EModelElement _emodelelement = (org.eclipse.emf.ecore.EModelElement) obj;
			children.addAll(_emodelelement.getEAnnotations());
			return children;
		});
		explorationConsumer.put(Java2Uml.Java2UmlPackage.eINSTANCE.getJavaPackageToUmlPackage(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getActivityGroup(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.ActivityGroup _activitygroup = (uml.ActivityGroup) obj;
			children.addAll(_activitygroup.getEAnnotations());
			children.addAll(_activitygroup.getOwnedComment());
			if(_activitygroup.getNameExpression() != null)
				children.add(_activitygroup.getNameExpression());
			return children;
		});
		explorationConsumer.put(runtime.impl.RuntimePackageImpl.eINSTANCE.getCorrespondenceNode(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.classifiers.ClassifiersPackage.eINSTANCE.getClassifier(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.classifiers.Classifier _classifier = (org.emftext.language.java.classifiers.Classifier) obj;
			children.addAll(_classifier.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getRelationship(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.Relationship _relationship = (uml.Relationship) obj;
			children.addAll(_relationship.getEAnnotations());
			children.addAll(_relationship.getOwnedComment());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.generics.GenericsPackage.eINSTANCE.getExtendsTypeArgument(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.generics.ExtendsTypeArgument _extendstypeargument = (org.emftext.language.java.generics.ExtendsTypeArgument) obj;
			children.addAll(_extendstypeargument.getLayoutInformations());
			children.addAll(_extendstypeargument.getArrayDimensionsBefore());
			children.addAll(_extendstypeargument.getArrayDimensionsAfter());
			children.addAll(_extendstypeargument.getExtendTypes());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getStartClassifierBehaviorAction(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.StartClassifierBehaviorAction _startclassifierbehavioraction = (uml.StartClassifierBehaviorAction) obj;
			children.addAll(_startclassifierbehavioraction.getEAnnotations());
			children.addAll(_startclassifierbehavioraction.getOwnedComment());
			if(_startclassifierbehavioraction.getNameExpression() != null)
				children.add(_startclassifierbehavioraction.getNameExpression());
			children.addAll(_startclassifierbehavioraction.getHandler());
			children.addAll(_startclassifierbehavioraction.getLocalPostcondition());
			children.addAll(_startclassifierbehavioraction.getLocalPrecondition());
			if(_startclassifierbehavioraction.getObject() != null)
				children.add(_startclassifierbehavioraction.getObject());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.parameters.ParametersPackage.eINSTANCE.getParametrizable(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.parameters.Parametrizable _parametrizable = (org.emftext.language.java.parameters.Parametrizable) obj;
			children.addAll(_parametrizable.getLayoutInformations());
			children.addAll(_parametrizable.getParameters());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.annotations.AnnotationsPackage.eINSTANCE.getAnnotationAttributeSetting(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.annotations.AnnotationAttributeSetting _annotationattributesetting = (org.emftext.language.java.annotations.AnnotationAttributeSetting) obj;
			children.addAll(_annotationattributesetting.getLayoutInformations());
			if(_annotationattributesetting.getValue() != null)
				children.add(_annotationattributesetting.getValue());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getDefaultSwitchCase(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.statements.DefaultSwitchCase _defaultswitchcase = (org.emftext.language.java.statements.DefaultSwitchCase) obj;
			children.addAll(_defaultswitchcase.getLayoutInformations());
			children.addAll(_defaultswitchcase.getStatements());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArrayInstantiation(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.arrays.ArrayInstantiation _arrayinstantiation = (org.emftext.language.java.arrays.ArrayInstantiation) obj;
			children.addAll(_arrayinstantiation.getLayoutInformations());
			children.addAll(_arrayinstantiation.getTypeArguments());
			if(_arrayinstantiation.getNext() != null)
				children.add(_arrayinstantiation.getNext());
			children.addAll(_arrayinstantiation.getArraySelectors());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArrayInitializer(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.arrays.ArrayInitializer _arrayinitializer = (org.emftext.language.java.arrays.ArrayInitializer) obj;
			children.addAll(_arrayinitializer.getLayoutInformations());
			children.addAll(_arrayinitializer.getInitialValues());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.types.TypesPackage.eINSTANCE.getClassifierReference(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.types.ClassifierReference _classifierreference = (org.emftext.language.java.types.ClassifierReference) obj;
			children.addAll(_classifierreference.getLayoutInformations());
			children.addAll(_classifierreference.getTypeArguments());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getRemoveStructuralFeatureValueAction(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.RemoveStructuralFeatureValueAction _removestructuralfeaturevalueaction = (uml.RemoveStructuralFeatureValueAction) obj;
			children.addAll(_removestructuralfeaturevalueaction.getEAnnotations());
			children.addAll(_removestructuralfeaturevalueaction.getOwnedComment());
			if(_removestructuralfeaturevalueaction.getNameExpression() != null)
				children.add(_removestructuralfeaturevalueaction.getNameExpression());
			children.addAll(_removestructuralfeaturevalueaction.getHandler());
			children.addAll(_removestructuralfeaturevalueaction.getLocalPostcondition());
			children.addAll(_removestructuralfeaturevalueaction.getLocalPrecondition());
			if(_removestructuralfeaturevalueaction.getObject() != null)
				children.add(_removestructuralfeaturevalueaction.getObject());
			if(_removestructuralfeaturevalueaction.getResult() != null)
				children.add(_removestructuralfeaturevalueaction.getResult());
			if(_removestructuralfeaturevalueaction.getValue() != null)
				children.add(_removestructuralfeaturevalueaction.getValue());
			if(_removestructuralfeaturevalueaction.getRemoveAt() != null)
				children.add(_removestructuralfeaturevalueaction.getRemoveAt());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getClassifier(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.Classifier _classifier = (uml.Classifier) obj;
			children.addAll(_classifier.getEAnnotations());
			children.addAll(_classifier.getOwnedComment());
			if(_classifier.getNameExpression() != null)
				children.add(_classifier.getNameExpression());
			children.addAll(_classifier.getOwnedRule());
			children.addAll(_classifier.getElementImport());
			children.addAll(_classifier.getPackageImport());
			children.addAll(_classifier.getTemplateBinding());
			if(_classifier.getOwnedTemplateSignature() != null)
				children.add(_classifier.getOwnedTemplateSignature());
			children.addAll(_classifier.getCollaborationUse());
			children.addAll(_classifier.getGeneralization());
			children.addAll(_classifier.getOwnedUseCase());
			children.addAll(_classifier.getSubstitution());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.types.TypesPackage.eINSTANCE.getBoolean(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.types.Boolean _boolean = (org.emftext.language.java.types.Boolean) obj;
			children.addAll(_boolean.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(Java2Uml.Java2UmlPackage.eINSTANCE.getInterfaceAttributeTypeToPropertyType__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getForLoop(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.statements.ForLoop _forloop = (org.emftext.language.java.statements.ForLoop) obj;
			children.addAll(_forloop.getLayoutInformations());
			if(_forloop.getStatement() != null)
				children.add(_forloop.getStatement());
			if(_forloop.getCondition() != null)
				children.add(_forloop.getCondition());
			if(_forloop.getInit() != null)
				children.add(_forloop.getInit());
			children.addAll(_forloop.getUpdates());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.modifiers.ModifiersPackage.eINSTANCE.getFinal(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.modifiers.Final _final = (org.emftext.language.java.modifiers.Final) obj;
			children.addAll(_final.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getFunctionBehavior(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.FunctionBehavior _functionbehavior = (uml.FunctionBehavior) obj;
			children.addAll(_functionbehavior.getEAnnotations());
			children.addAll(_functionbehavior.getOwnedComment());
			if(_functionbehavior.getNameExpression() != null)
				children.add(_functionbehavior.getNameExpression());
			children.addAll(_functionbehavior.getOwnedRule());
			children.addAll(_functionbehavior.getElementImport());
			children.addAll(_functionbehavior.getPackageImport());
			children.addAll(_functionbehavior.getTemplateBinding());
			if(_functionbehavior.getOwnedTemplateSignature() != null)
				children.add(_functionbehavior.getOwnedTemplateSignature());
			children.addAll(_functionbehavior.getCollaborationUse());
			children.addAll(_functionbehavior.getGeneralization());
			children.addAll(_functionbehavior.getOwnedUseCase());
			children.addAll(_functionbehavior.getSubstitution());
			children.addAll(_functionbehavior.getOwnedAttribute());
			children.addAll(_functionbehavior.getOwnedConnector());
			children.addAll(_functionbehavior.getInterfaceRealization());
			children.addAll(_functionbehavior.getOwnedBehavior());
			children.addAll(_functionbehavior.getOwnedOperation());
			children.addAll(_functionbehavior.getNestedClassifier());
			children.addAll(_functionbehavior.getOwnedReception());
			children.addAll(_functionbehavior.getOwnedParameter());
			children.addAll(_functionbehavior.getOwnedParameterSet());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getLiteralUnlimitedNatural(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.LiteralUnlimitedNatural _literalunlimitednatural = (uml.LiteralUnlimitedNatural) obj;
			children.addAll(_literalunlimitednatural.getEAnnotations());
			children.addAll(_literalunlimitednatural.getOwnedComment());
			if(_literalunlimitednatural.getNameExpression() != null)
				children.add(_literalunlimitednatural.getNameExpression());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getLiteralBoolean(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.LiteralBoolean _literalboolean = (uml.LiteralBoolean) obj;
			children.addAll(_literalboolean.getEAnnotations());
			children.addAll(_literalboolean.getOwnedComment());
			if(_literalboolean.getNameExpression() != null)
				children.add(_literalboolean.getNameExpression());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getConsiderIgnoreFragment(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.ConsiderIgnoreFragment _considerignorefragment = (uml.ConsiderIgnoreFragment) obj;
			children.addAll(_considerignorefragment.getEAnnotations());
			children.addAll(_considerignorefragment.getOwnedComment());
			if(_considerignorefragment.getNameExpression() != null)
				children.add(_considerignorefragment.getNameExpression());
			children.addAll(_considerignorefragment.getGeneralOrdering());
			children.addAll(_considerignorefragment.getCfragmentGate());
			children.addAll(_considerignorefragment.getOperand());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getNamespace(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.Namespace _namespace = (uml.Namespace) obj;
			children.addAll(_namespace.getEAnnotations());
			children.addAll(_namespace.getOwnedComment());
			if(_namespace.getNameExpression() != null)
				children.add(_namespace.getNameExpression());
			children.addAll(_namespace.getOwnedRule());
			children.addAll(_namespace.getElementImport());
			children.addAll(_namespace.getPackageImport());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getComponent(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.Component _component = (uml.Component) obj;
			children.addAll(_component.getEAnnotations());
			children.addAll(_component.getOwnedComment());
			if(_component.getNameExpression() != null)
				children.add(_component.getNameExpression());
			children.addAll(_component.getOwnedRule());
			children.addAll(_component.getElementImport());
			children.addAll(_component.getPackageImport());
			children.addAll(_component.getTemplateBinding());
			if(_component.getOwnedTemplateSignature() != null)
				children.add(_component.getOwnedTemplateSignature());
			children.addAll(_component.getCollaborationUse());
			children.addAll(_component.getGeneralization());
			children.addAll(_component.getOwnedUseCase());
			children.addAll(_component.getSubstitution());
			children.addAll(_component.getOwnedAttribute());
			children.addAll(_component.getOwnedConnector());
			children.addAll(_component.getInterfaceRealization());
			children.addAll(_component.getOwnedBehavior());
			children.addAll(_component.getOwnedOperation());
			children.addAll(_component.getNestedClassifier());
			children.addAll(_component.getOwnedReception());
			children.addAll(_component.getPackagedElement());
			children.addAll(_component.getRealization());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getCatchBlock(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.statements.CatchBlock _catchblock = (org.emftext.language.java.statements.CatchBlock) obj;
			children.addAll(_catchblock.getLayoutInformations());
			children.addAll(_catchblock.getStatements());
			if(_catchblock.getParameter() != null)
				children.add(_catchblock.getParameter());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getContinuation(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.Continuation _continuation = (uml.Continuation) obj;
			children.addAll(_continuation.getEAnnotations());
			children.addAll(_continuation.getOwnedComment());
			if(_continuation.getNameExpression() != null)
				children.add(_continuation.getNameExpression());
			children.addAll(_continuation.getGeneralOrdering());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.annotations.AnnotationsPackage.eINSTANCE.getSingleAnnotationParameter(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.annotations.SingleAnnotationParameter _singleannotationparameter = (org.emftext.language.java.annotations.SingleAnnotationParameter) obj;
			children.addAll(_singleannotationparameter.getLayoutInformations());
			if(_singleannotationparameter.getValue() != null)
				children.add(_singleannotationparameter.getValue());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getSlot(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.Slot _slot = (uml.Slot) obj;
			children.addAll(_slot.getEAnnotations());
			children.addAll(_slot.getOwnedComment());
			children.addAll(_slot.getValue());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getDecisionNode(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.DecisionNode _decisionnode = (uml.DecisionNode) obj;
			children.addAll(_decisionnode.getEAnnotations());
			children.addAll(_decisionnode.getOwnedComment());
			if(_decisionnode.getNameExpression() != null)
				children.add(_decisionnode.getNameExpression());
			return children;
		});
		explorationConsumer.put(Java2Uml.Java2UmlPackage.eINSTANCE.getExistingSuperInterfaceToSuperInterface__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getReadStructuralFeatureAction(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.ReadStructuralFeatureAction _readstructuralfeatureaction = (uml.ReadStructuralFeatureAction) obj;
			children.addAll(_readstructuralfeatureaction.getEAnnotations());
			children.addAll(_readstructuralfeatureaction.getOwnedComment());
			if(_readstructuralfeatureaction.getNameExpression() != null)
				children.add(_readstructuralfeatureaction.getNameExpression());
			children.addAll(_readstructuralfeatureaction.getHandler());
			children.addAll(_readstructuralfeatureaction.getLocalPostcondition());
			children.addAll(_readstructuralfeatureaction.getLocalPrecondition());
			if(_readstructuralfeatureaction.getObject() != null)
				children.add(_readstructuralfeatureaction.getObject());
			if(_readstructuralfeatureaction.getResult() != null)
				children.add(_readstructuralfeatureaction.getResult());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.members.MembersPackage.eINSTANCE.getEnumConstant(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.members.EnumConstant _enumconstant = (org.emftext.language.java.members.EnumConstant) obj;
			children.addAll(_enumconstant.getLayoutInformations());
			children.addAll(_enumconstant.getArguments());
			children.addAll(_enumconstant.getAnnotations());
			if(_enumconstant.getAnonymousClass() != null)
				children.add(_enumconstant.getAnonymousClass());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.types.TypesPackage.eINSTANCE.getChar(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.types.Char _char = (org.emftext.language.java.types.Char) obj;
			children.addAll(_char.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getGreaterThanOrEqual(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.operators.GreaterThanOrEqual _greaterthanorequal = (org.emftext.language.java.operators.GreaterThanOrEqual) obj;
			children.addAll(_greaterthanorequal.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getModel(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.Model _model = (uml.Model) obj;
			children.addAll(_model.getEAnnotations());
			children.addAll(_model.getOwnedComment());
			if(_model.getNameExpression() != null)
				children.add(_model.getNameExpression());
			children.addAll(_model.getOwnedRule());
			children.addAll(_model.getElementImport());
			children.addAll(_model.getPackageImport());
			children.addAll(_model.getTemplateBinding());
			if(_model.getOwnedTemplateSignature() != null)
				children.add(_model.getOwnedTemplateSignature());
			children.addAll(_model.getPackageMerge());
			children.addAll(_model.getPackagedElement());
			children.addAll(_model.getProfileApplication());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getJumpLabel(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.statements.JumpLabel _jumplabel = (org.emftext.language.java.statements.JumpLabel) obj;
			children.addAll(_jumplabel.getLayoutInformations());
			if(_jumplabel.getStatement() != null)
				children.add(_jumplabel.getStatement());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getAddVariableValueAction(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.AddVariableValueAction _addvariablevalueaction = (uml.AddVariableValueAction) obj;
			children.addAll(_addvariablevalueaction.getEAnnotations());
			children.addAll(_addvariablevalueaction.getOwnedComment());
			if(_addvariablevalueaction.getNameExpression() != null)
				children.add(_addvariablevalueaction.getNameExpression());
			children.addAll(_addvariablevalueaction.getHandler());
			children.addAll(_addvariablevalueaction.getLocalPostcondition());
			children.addAll(_addvariablevalueaction.getLocalPrecondition());
			if(_addvariablevalueaction.getValue() != null)
				children.add(_addvariablevalueaction.getValue());
			if(_addvariablevalueaction.getInsertAt() != null)
				children.add(_addvariablevalueaction.getInsertAt());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getReadVariableAction(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.ReadVariableAction _readvariableaction = (uml.ReadVariableAction) obj;
			children.addAll(_readvariableaction.getEAnnotations());
			children.addAll(_readvariableaction.getOwnedComment());
			if(_readvariableaction.getNameExpression() != null)
				children.add(_readvariableaction.getNameExpression());
			children.addAll(_readvariableaction.getHandler());
			children.addAll(_readvariableaction.getLocalPostcondition());
			children.addAll(_readvariableaction.getLocalPrecondition());
			if(_readvariableaction.getResult() != null)
				children.add(_readvariableaction.getResult());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getConditionalOrExpression(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.expressions.ConditionalOrExpression _conditionalorexpression = (org.emftext.language.java.expressions.ConditionalOrExpression) obj;
			children.addAll(_conditionalorexpression.getLayoutInformations());
			children.addAll(_conditionalorexpression.getChildren());
			return children;
		});
		explorationConsumer.put(Java2Uml.Java2UmlPackage.eINSTANCE.getClassAbstractToAbstract__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.literals.LiteralsPackage.eINSTANCE.getOctalIntegerLiteral(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.literals.OctalIntegerLiteral _octalintegerliteral = (org.emftext.language.java.literals.OctalIntegerLiteral) obj;
			children.addAll(_octalintegerliteral.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getConditionalOrExpressionChild(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.expressions.ConditionalOrExpressionChild _conditionalorexpressionchild = (org.emftext.language.java.expressions.ConditionalOrExpressionChild) obj;
			children.addAll(_conditionalorexpressionchild.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getMessage(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.Message _message = (uml.Message) obj;
			children.addAll(_message.getEAnnotations());
			children.addAll(_message.getOwnedComment());
			if(_message.getNameExpression() != null)
				children.add(_message.getNameExpression());
			children.addAll(_message.getArgument());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getEvent(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.Event _event = (uml.Event) obj;
			children.addAll(_event.getEAnnotations());
			children.addAll(_event.getOwnedComment());
			if(_event.getNameExpression() != null)
				children.add(_event.getNameExpression());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getRealization(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.Realization _realization = (uml.Realization) obj;
			children.addAll(_realization.getEAnnotations());
			children.addAll(_realization.getOwnedComment());
			if(_realization.getNameExpression() != null)
				children.add(_realization.getNameExpression());
			if(_realization.getMapping() != null)
				children.add(_realization.getMapping());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.containers.ContainersPackage.eINSTANCE.getPackage(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.containers.Package _package = (org.emftext.language.java.containers.Package) obj;
			children.addAll(_package.getLayoutInformations());
			children.addAll(_package.getImports());
			children.addAll(_package.getAnnotations());
			children.addAll(_package.getCompilationUnits());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.references.ReferencesPackage.eINSTANCE.getReference(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.references.Reference _reference = (org.emftext.language.java.references.Reference) obj;
			children.addAll(_reference.getLayoutInformations());
			children.addAll(_reference.getTypeArguments());
			if(_reference.getNext() != null)
				children.add(_reference.getNext());
			children.addAll(_reference.getArraySelectors());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getInclude(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.Include _include = (uml.Include) obj;
			children.addAll(_include.getEAnnotations());
			children.addAll(_include.getOwnedComment());
			if(_include.getNameExpression() != null)
				children.add(_include.getNameExpression());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getAdditiveOperator(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.operators.AdditiveOperator _additiveoperator = (org.emftext.language.java.operators.AdditiveOperator) obj;
			children.addAll(_additiveoperator.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getGate(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.Gate _gate = (uml.Gate) obj;
			children.addAll(_gate.getEAnnotations());
			children.addAll(_gate.getOwnedComment());
			if(_gate.getNameExpression() != null)
				children.add(_gate.getNameExpression());
			return children;
		});
		explorationConsumer.put(Java2Uml.Java2UmlPackage.eINSTANCE.getJavaMethodToOperation(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.classifiers.ClassifiersPackage.eINSTANCE.getAnonymousClass(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.classifiers.AnonymousClass _anonymousclass = (org.emftext.language.java.classifiers.AnonymousClass) obj;
			children.addAll(_anonymousclass.getLayoutInformations());
			children.addAll(_anonymousclass.getMembers());
			children.addAll(_anonymousclass.getDefaultMembers());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getAssignmentLeftShift(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.operators.AssignmentLeftShift _assignmentleftshift = (org.emftext.language.java.operators.AssignmentLeftShift) obj;
			children.addAll(_assignmentleftshift.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getUnaryExpression(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.expressions.UnaryExpression _unaryexpression = (org.emftext.language.java.expressions.UnaryExpression) obj;
			children.addAll(_unaryexpression.getLayoutInformations());
			children.addAll(_unaryexpression.getOperators());
			if(_unaryexpression.getChild() != null)
				children.add(_unaryexpression.getChild());
			return children;
		});
		explorationConsumer.put(Java2Uml.Java2UmlPackage.eINSTANCE.getJavaClassifierToUmlClassifier(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getDestroyObjectAction(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.DestroyObjectAction _destroyobjectaction = (uml.DestroyObjectAction) obj;
			children.addAll(_destroyobjectaction.getEAnnotations());
			children.addAll(_destroyobjectaction.getOwnedComment());
			if(_destroyobjectaction.getNameExpression() != null)
				children.add(_destroyobjectaction.getNameExpression());
			children.addAll(_destroyobjectaction.getHandler());
			children.addAll(_destroyobjectaction.getLocalPostcondition());
			children.addAll(_destroyobjectaction.getLocalPrecondition());
			if(_destroyobjectaction.getTarget() != null)
				children.add(_destroyobjectaction.getTarget());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.literals.LiteralsPackage.eINSTANCE.getDecimalLongLiteral(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.literals.DecimalLongLiteral _decimallongliteral = (org.emftext.language.java.literals.DecimalLongLiteral) obj;
			children.addAll(_decimallongliteral.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.types.TypesPackage.eINSTANCE.getPrimitiveType(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.types.PrimitiveType _primitivetype = (org.emftext.language.java.types.PrimitiveType) obj;
			children.addAll(_primitivetype.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getGeneralizationSet(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.GeneralizationSet _generalizationset = (uml.GeneralizationSet) obj;
			children.addAll(_generalizationset.getEAnnotations());
			children.addAll(_generalizationset.getOwnedComment());
			if(_generalizationset.getNameExpression() != null)
				children.add(_generalizationset.getNameExpression());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.imports.ImportsPackage.eINSTANCE.getStaticImport(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.imports.StaticImport _staticimport = (org.emftext.language.java.imports.StaticImport) obj;
			children.addAll(_staticimport.getLayoutInformations());
			if(_staticimport.getStatic() != null)
				children.add(_staticimport.getStatic());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getPort(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.Port _port = (uml.Port) obj;
			children.addAll(_port.getEAnnotations());
			children.addAll(_port.getOwnedComment());
			if(_port.getNameExpression() != null)
				children.add(_port.getNameExpression());
			if(_port.getLowerValue() != null)
				children.add(_port.getLowerValue());
			if(_port.getUpperValue() != null)
				children.add(_port.getUpperValue());
			children.addAll(_port.getDeployment());
			children.addAll(_port.getQualifier());
			if(_port.getDefaultValue() != null)
				children.add(_port.getDefaultValue());
			return children;
		});
		explorationConsumer.put(Java2Uml.Java2UmlPackage.eINSTANCE.getMethodInterfaceParamTypeToParamType__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(Java2Uml.Java2UmlPackage.eINSTANCE.getClassToUmlClass__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getDirectedRelationship(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.DirectedRelationship _directedrelationship = (uml.DirectedRelationship) obj;
			children.addAll(_directedrelationship.getEAnnotations());
			children.addAll(_directedrelationship.getOwnedComment());
			return children;
		});
		explorationConsumer.put(Java2Uml.Java2UmlPackage.eINSTANCE.getClassAttributeToProperty__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.references.ReferencesPackage.eINSTANCE.getPrimitiveTypeReference(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.references.PrimitiveTypeReference _primitivetypereference = (org.emftext.language.java.references.PrimitiveTypeReference) obj;
			children.addAll(_primitivetypereference.getLayoutInformations());
			children.addAll(_primitivetypereference.getTypeArguments());
			if(_primitivetypereference.getNext() != null)
				children.add(_primitivetypereference.getNext());
			children.addAll(_primitivetypereference.getArraySelectors());
			if(_primitivetypereference.getPrimitiveType() != null)
				children.add(_primitivetypereference.getPrimitiveType());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getCreateLinkAction(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.CreateLinkAction _createlinkaction = (uml.CreateLinkAction) obj;
			children.addAll(_createlinkaction.getEAnnotations());
			children.addAll(_createlinkaction.getOwnedComment());
			if(_createlinkaction.getNameExpression() != null)
				children.add(_createlinkaction.getNameExpression());
			children.addAll(_createlinkaction.getHandler());
			children.addAll(_createlinkaction.getLocalPostcondition());
			children.addAll(_createlinkaction.getLocalPrecondition());
			children.addAll(_createlinkaction.getEndData());
			children.addAll(_createlinkaction.getInputValue());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.references.ReferencesPackage.eINSTANCE.getIdentifierReference(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.references.IdentifierReference _identifierreference = (org.emftext.language.java.references.IdentifierReference) obj;
			children.addAll(_identifierreference.getLayoutInformations());
			children.addAll(_identifierreference.getTypeArguments());
			if(_identifierreference.getNext() != null)
				children.add(_identifierreference.getNext());
			children.addAll(_identifierreference.getArraySelectors());
			return children;
		});
		explorationConsumer.put(Java2Uml.Java2UmlPackage.eINSTANCE.getEnumAttributeTypeToPropertyType__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getLinkAction(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.LinkAction _linkaction = (uml.LinkAction) obj;
			children.addAll(_linkaction.getEAnnotations());
			children.addAll(_linkaction.getOwnedComment());
			if(_linkaction.getNameExpression() != null)
				children.add(_linkaction.getNameExpression());
			children.addAll(_linkaction.getHandler());
			children.addAll(_linkaction.getLocalPostcondition());
			children.addAll(_linkaction.getLocalPrecondition());
			children.addAll(_linkaction.getEndData());
			children.addAll(_linkaction.getInputValue());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getRegion(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.Region _region = (uml.Region) obj;
			children.addAll(_region.getEAnnotations());
			children.addAll(_region.getOwnedComment());
			if(_region.getNameExpression() != null)
				children.add(_region.getNameExpression());
			children.addAll(_region.getOwnedRule());
			children.addAll(_region.getElementImport());
			children.addAll(_region.getPackageImport());
			children.addAll(_region.getTransition());
			children.addAll(_region.getSubvertex());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAndExpression(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.expressions.AndExpression _andexpression = (org.emftext.language.java.expressions.AndExpression) obj;
			children.addAll(_andexpression.getLayoutInformations());
			children.addAll(_andexpression.getChildren());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getChangeEvent(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.ChangeEvent _changeevent = (uml.ChangeEvent) obj;
			children.addAll(_changeevent.getEAnnotations());
			children.addAll(_changeevent.getOwnedComment());
			if(_changeevent.getNameExpression() != null)
				children.add(_changeevent.getNameExpression());
			if(_changeevent.getChangeExpression() != null)
				children.add(_changeevent.getChangeExpression());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.classifiers.ClassifiersPackage.eINSTANCE.getConcreteClassifier(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.classifiers.ConcreteClassifier _concreteclassifier = (org.emftext.language.java.classifiers.ConcreteClassifier) obj;
			children.addAll(_concreteclassifier.getLayoutInformations());
			children.addAll(_concreteclassifier.getTypeParameters());
			children.addAll(_concreteclassifier.getMembers());
			children.addAll(_concreteclassifier.getDefaultMembers());
			children.addAll(_concreteclassifier.getAnnotationsAndModifiers());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getStateInvariant(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.StateInvariant _stateinvariant = (uml.StateInvariant) obj;
			children.addAll(_stateinvariant.getEAnnotations());
			children.addAll(_stateinvariant.getOwnedComment());
			if(_stateinvariant.getNameExpression() != null)
				children.add(_stateinvariant.getNameExpression());
			children.addAll(_stateinvariant.getGeneralOrdering());
			if(_stateinvariant.getInvariant() != null)
				children.add(_stateinvariant.getInvariant());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.imports.ImportsPackage.eINSTANCE.getClassifierImport(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.imports.ClassifierImport _classifierimport = (org.emftext.language.java.imports.ClassifierImport) obj;
			children.addAll(_classifierimport.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getPin(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.Pin _pin = (uml.Pin) obj;
			children.addAll(_pin.getEAnnotations());
			children.addAll(_pin.getOwnedComment());
			if(_pin.getNameExpression() != null)
				children.add(_pin.getNameExpression());
			if(_pin.getUpperBound() != null)
				children.add(_pin.getUpperBound());
			if(_pin.getLowerValue() != null)
				children.add(_pin.getLowerValue());
			if(_pin.getUpperValue() != null)
				children.add(_pin.getUpperValue());
			return children;
		});
		explorationConsumer.put(runtime.impl.RuntimePackageImpl.eINSTANCE.getTempContainer(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			runtime.TempContainer _tempcontainer = (runtime.TempContainer) obj;
			children.addAll(_tempcontainer.getObjects());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.classifiers.ClassifiersPackage.eINSTANCE.getEnumeration(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.classifiers.Enumeration _enumeration = (org.emftext.language.java.classifiers.Enumeration) obj;
			children.addAll(_enumeration.getLayoutInformations());
			children.addAll(_enumeration.getTypeParameters());
			children.addAll(_enumeration.getMembers());
			children.addAll(_enumeration.getDefaultMembers());
			children.addAll(_enumeration.getAnnotationsAndModifiers());
			children.addAll(_enumeration.getImplements());
			children.addAll(_enumeration.getConstants());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.parameters.ParametersPackage.eINSTANCE.getParameter(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.parameters.Parameter _parameter = (org.emftext.language.java.parameters.Parameter) obj;
			children.addAll(_parameter.getLayoutInformations());
			if(_parameter.getTypeReference() != null)
				children.add(_parameter.getTypeReference());
			children.addAll(_parameter.getArrayDimensionsBefore());
			children.addAll(_parameter.getArrayDimensionsAfter());
			children.addAll(_parameter.getTypeArguments());
			children.addAll(_parameter.getAnnotationsAndModifiers());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getEqualityExpressionChild(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.expressions.EqualityExpressionChild _equalityexpressionchild = (org.emftext.language.java.expressions.EqualityExpressionChild) obj;
			children.addAll(_equalityexpressionchild.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.members.MembersPackage.eINSTANCE.getMethod(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.members.Method _method = (org.emftext.language.java.members.Method) obj;
			children.addAll(_method.getLayoutInformations());
			if(_method.getTypeReference() != null)
				children.add(_method.getTypeReference());
			children.addAll(_method.getArrayDimensionsBefore());
			children.addAll(_method.getArrayDimensionsAfter());
			children.addAll(_method.getTypeParameters());
			children.addAll(_method.getParameters());
			children.addAll(_method.getExceptions());
			children.addAll(_method.getAnnotationsAndModifiers());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getSignal(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.Signal _signal = (uml.Signal) obj;
			children.addAll(_signal.getEAnnotations());
			children.addAll(_signal.getOwnedComment());
			if(_signal.getNameExpression() != null)
				children.add(_signal.getNameExpression());
			children.addAll(_signal.getOwnedRule());
			children.addAll(_signal.getElementImport());
			children.addAll(_signal.getPackageImport());
			children.addAll(_signal.getTemplateBinding());
			if(_signal.getOwnedTemplateSignature() != null)
				children.add(_signal.getOwnedTemplateSignature());
			children.addAll(_signal.getCollaborationUse());
			children.addAll(_signal.getGeneralization());
			children.addAll(_signal.getOwnedUseCase());
			children.addAll(_signal.getSubstitution());
			children.addAll(_signal.getOwnedAttribute());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.literals.LiteralsPackage.eINSTANCE.getHexFloatLiteral(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.literals.HexFloatLiteral _hexfloatliteral = (org.emftext.language.java.literals.HexFloatLiteral) obj;
			children.addAll(_hexfloatliteral.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getExtension(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.Extension _extension = (uml.Extension) obj;
			children.addAll(_extension.getEAnnotations());
			children.addAll(_extension.getOwnedComment());
			if(_extension.getNameExpression() != null)
				children.add(_extension.getNameExpression());
			children.addAll(_extension.getOwnedRule());
			children.addAll(_extension.getElementImport());
			children.addAll(_extension.getPackageImport());
			children.addAll(_extension.getTemplateBinding());
			if(_extension.getOwnedTemplateSignature() != null)
				children.add(_extension.getOwnedTemplateSignature());
			children.addAll(_extension.getCollaborationUse());
			children.addAll(_extension.getGeneralization());
			children.addAll(_extension.getOwnedUseCase());
			children.addAll(_extension.getSubstitution());
			children.addAll(_extension.getOwnedEnd());
			return children;
		});
		explorationConsumer.put(Java2Uml.Java2UmlPackage.eINSTANCE.getEnumFinalToFinal__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getEqualityOperator(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.operators.EqualityOperator _equalityoperator = (org.emftext.language.java.operators.EqualityOperator) obj;
			children.addAll(_equalityoperator.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(org.eclipse.emf.ecore.EcorePackage.eINSTANCE.getEStructuralFeature(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.emf.ecore.EStructuralFeature _estructuralfeature = (org.eclipse.emf.ecore.EStructuralFeature) obj;
			children.addAll(_estructuralfeature.getEAnnotations());
			if(_estructuralfeature.getEGenericType() != null)
				children.add(_estructuralfeature.getEGenericType());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getClassifierTemplateParameter(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.ClassifierTemplateParameter _classifiertemplateparameter = (uml.ClassifierTemplateParameter) obj;
			children.addAll(_classifiertemplateparameter.getEAnnotations());
			children.addAll(_classifiertemplateparameter.getOwnedComment());
			if(_classifiertemplateparameter.getOwnedDefault() != null)
				children.add(_classifiertemplateparameter.getOwnedDefault());
			if(_classifiertemplateparameter.getOwnedParameteredElement() != null)
				children.add(_classifiertemplateparameter.getOwnedParameteredElement());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getReturn(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.statements.Return _return = (org.emftext.language.java.statements.Return) obj;
			children.addAll(_return.getLayoutInformations());
			if(_return.getReturnValue() != null)
				children.add(_return.getReturnValue());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getElement(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.Element _element = (uml.Element) obj;
			children.addAll(_element.getEAnnotations());
			children.addAll(_element.getOwnedComment());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.types.TypesPackage.eINSTANCE.getTypedElement(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.types.TypedElement _typedelement = (org.emftext.language.java.types.TypedElement) obj;
			children.addAll(_typedelement.getLayoutInformations());
			if(_typedelement.getTypeReference() != null)
				children.add(_typedelement.getTypeReference());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getInstanceOfExpression(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.expressions.InstanceOfExpression _instanceofexpression = (org.emftext.language.java.expressions.InstanceOfExpression) obj;
			children.addAll(_instanceofexpression.getLayoutInformations());
			children.addAll(_instanceofexpression.getArrayDimensionsBefore());
			children.addAll(_instanceofexpression.getArrayDimensionsAfter());
			if(_instanceofexpression.getTypeReference() != null)
				children.add(_instanceofexpression.getTypeReference());
			if(_instanceofexpression.getChild() != null)
				children.add(_instanceofexpression.getChild());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getRedefinableTemplateSignature(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.RedefinableTemplateSignature _redefinabletemplatesignature = (uml.RedefinableTemplateSignature) obj;
			children.addAll(_redefinabletemplatesignature.getEAnnotations());
			children.addAll(_redefinabletemplatesignature.getOwnedComment());
			if(_redefinabletemplatesignature.getNameExpression() != null)
				children.add(_redefinabletemplatesignature.getNameExpression());
			children.addAll(_redefinabletemplatesignature.getOwnedParameter());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getProperty(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.Property _property = (uml.Property) obj;
			children.addAll(_property.getEAnnotations());
			children.addAll(_property.getOwnedComment());
			if(_property.getNameExpression() != null)
				children.add(_property.getNameExpression());
			if(_property.getLowerValue() != null)
				children.add(_property.getLowerValue());
			if(_property.getUpperValue() != null)
				children.add(_property.getUpperValue());
			children.addAll(_property.getDeployment());
			children.addAll(_property.getQualifier());
			if(_property.getDefaultValue() != null)
				children.add(_property.getDefaultValue());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.literals.LiteralsPackage.eINSTANCE.getSelf(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.literals.Self _self = (org.emftext.language.java.literals.Self) obj;
			children.addAll(_self.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getLinkEndCreationData(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.LinkEndCreationData _linkendcreationdata = (uml.LinkEndCreationData) obj;
			children.addAll(_linkendcreationdata.getEAnnotations());
			children.addAll(_linkendcreationdata.getOwnedComment());
			children.addAll(_linkendcreationdata.getQualifier());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getDestructionOccurrenceSpecification(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.DestructionOccurrenceSpecification _destructionoccurrencespecification = (uml.DestructionOccurrenceSpecification) obj;
			children.addAll(_destructionoccurrencespecification.getEAnnotations());
			children.addAll(_destructionoccurrencespecification.getOwnedComment());
			if(_destructionoccurrencespecification.getNameExpression() != null)
				children.add(_destructionoccurrencespecification.getNameExpression());
			children.addAll(_destructionoccurrencespecification.getGeneralOrdering());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getWriteVariableAction(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.WriteVariableAction _writevariableaction = (uml.WriteVariableAction) obj;
			children.addAll(_writevariableaction.getEAnnotations());
			children.addAll(_writevariableaction.getOwnedComment());
			if(_writevariableaction.getNameExpression() != null)
				children.add(_writevariableaction.getNameExpression());
			children.addAll(_writevariableaction.getHandler());
			children.addAll(_writevariableaction.getLocalPostcondition());
			children.addAll(_writevariableaction.getLocalPrecondition());
			if(_writevariableaction.getValue() != null)
				children.add(_writevariableaction.getValue());
			return children;
		});
		explorationConsumer.put(Java2Uml.Java2UmlPackage.eINSTANCE.getMethodStaticToStatic__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getComplement(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.operators.Complement _complement = (org.emftext.language.java.operators.Complement) obj;
			children.addAll(_complement.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(Java2Uml.Java2UmlPackage.eINSTANCE.getInterfaceToUmlInterface__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getClearStructuralFeatureAction(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.ClearStructuralFeatureAction _clearstructuralfeatureaction = (uml.ClearStructuralFeatureAction) obj;
			children.addAll(_clearstructuralfeatureaction.getEAnnotations());
			children.addAll(_clearstructuralfeatureaction.getOwnedComment());
			if(_clearstructuralfeatureaction.getNameExpression() != null)
				children.add(_clearstructuralfeatureaction.getNameExpression());
			children.addAll(_clearstructuralfeatureaction.getHandler());
			children.addAll(_clearstructuralfeatureaction.getLocalPostcondition());
			children.addAll(_clearstructuralfeatureaction.getLocalPrecondition());
			if(_clearstructuralfeatureaction.getObject() != null)
				children.add(_clearstructuralfeatureaction.getObject());
			if(_clearstructuralfeatureaction.getResult() != null)
				children.add(_clearstructuralfeatureaction.getResult());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getDataStoreNode(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.DataStoreNode _datastorenode = (uml.DataStoreNode) obj;
			children.addAll(_datastorenode.getEAnnotations());
			children.addAll(_datastorenode.getOwnedComment());
			if(_datastorenode.getNameExpression() != null)
				children.add(_datastorenode.getNameExpression());
			if(_datastorenode.getUpperBound() != null)
				children.add(_datastorenode.getUpperBound());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.generics.GenericsPackage.eINSTANCE.getUnknownTypeArgument(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.generics.UnknownTypeArgument _unknowntypeargument = (org.emftext.language.java.generics.UnknownTypeArgument) obj;
			children.addAll(_unknowntypeargument.getLayoutInformations());
			children.addAll(_unknowntypeargument.getArrayDimensionsBefore());
			children.addAll(_unknowntypeargument.getArrayDimensionsAfter());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getOpaqueBehavior(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.OpaqueBehavior _opaquebehavior = (uml.OpaqueBehavior) obj;
			children.addAll(_opaquebehavior.getEAnnotations());
			children.addAll(_opaquebehavior.getOwnedComment());
			if(_opaquebehavior.getNameExpression() != null)
				children.add(_opaquebehavior.getNameExpression());
			children.addAll(_opaquebehavior.getOwnedRule());
			children.addAll(_opaquebehavior.getElementImport());
			children.addAll(_opaquebehavior.getPackageImport());
			children.addAll(_opaquebehavior.getTemplateBinding());
			if(_opaquebehavior.getOwnedTemplateSignature() != null)
				children.add(_opaquebehavior.getOwnedTemplateSignature());
			children.addAll(_opaquebehavior.getCollaborationUse());
			children.addAll(_opaquebehavior.getGeneralization());
			children.addAll(_opaquebehavior.getOwnedUseCase());
			children.addAll(_opaquebehavior.getSubstitution());
			children.addAll(_opaquebehavior.getOwnedAttribute());
			children.addAll(_opaquebehavior.getOwnedConnector());
			children.addAll(_opaquebehavior.getInterfaceRealization());
			children.addAll(_opaquebehavior.getOwnedBehavior());
			children.addAll(_opaquebehavior.getOwnedOperation());
			children.addAll(_opaquebehavior.getNestedClassifier());
			children.addAll(_opaquebehavior.getOwnedReception());
			children.addAll(_opaquebehavior.getOwnedParameter());
			children.addAll(_opaquebehavior.getOwnedParameterSet());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.literals.LiteralsPackage.eINSTANCE.getThis(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.literals.This _this = (org.emftext.language.java.literals.This) obj;
			children.addAll(_this.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getForEachLoop(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.statements.ForEachLoop _foreachloop = (org.emftext.language.java.statements.ForEachLoop) obj;
			children.addAll(_foreachloop.getLayoutInformations());
			if(_foreachloop.getStatement() != null)
				children.add(_foreachloop.getStatement());
			if(_foreachloop.getNext() != null)
				children.add(_foreachloop.getNext());
			if(_foreachloop.getCollection() != null)
				children.add(_foreachloop.getCollection());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getTemplateSignature(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.TemplateSignature _templatesignature = (uml.TemplateSignature) obj;
			children.addAll(_templatesignature.getEAnnotations());
			children.addAll(_templatesignature.getOwnedComment());
			children.addAll(_templatesignature.getOwnedParameter());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getGeneralization(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.Generalization _generalization = (uml.Generalization) obj;
			children.addAll(_generalization.getEAnnotations());
			children.addAll(_generalization.getOwnedComment());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getSignalEvent(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.SignalEvent _signalevent = (uml.SignalEvent) obj;
			children.addAll(_signalevent.getEAnnotations());
			children.addAll(_signalevent.getOwnedComment());
			if(_signalevent.getNameExpression() != null)
				children.add(_signalevent.getNameExpression());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getStructuredActivityNode(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.StructuredActivityNode _structuredactivitynode = (uml.StructuredActivityNode) obj;
			children.addAll(_structuredactivitynode.getEAnnotations());
			children.addAll(_structuredactivitynode.getOwnedComment());
			if(_structuredactivitynode.getNameExpression() != null)
				children.add(_structuredactivitynode.getNameExpression());
			children.addAll(_structuredactivitynode.getHandler());
			children.addAll(_structuredactivitynode.getLocalPostcondition());
			children.addAll(_structuredactivitynode.getLocalPrecondition());
			children.addAll(_structuredactivitynode.getOwnedRule());
			children.addAll(_structuredactivitynode.getElementImport());
			children.addAll(_structuredactivitynode.getPackageImport());
			children.addAll(_structuredactivitynode.getEdge());
			children.addAll(_structuredactivitynode.getStructuredNodeInput());
			children.addAll(_structuredactivitynode.getStructuredNodeOutput());
			children.addAll(_structuredactivitynode.getVariable());
			children.addAll(_structuredactivitynode.getNode());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getReadIsClassifiedObjectAction(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.ReadIsClassifiedObjectAction _readisclassifiedobjectaction = (uml.ReadIsClassifiedObjectAction) obj;
			children.addAll(_readisclassifiedobjectaction.getEAnnotations());
			children.addAll(_readisclassifiedobjectaction.getOwnedComment());
			if(_readisclassifiedobjectaction.getNameExpression() != null)
				children.add(_readisclassifiedobjectaction.getNameExpression());
			children.addAll(_readisclassifiedobjectaction.getHandler());
			children.addAll(_readisclassifiedobjectaction.getLocalPostcondition());
			children.addAll(_readisclassifiedobjectaction.getLocalPrecondition());
			if(_readisclassifiedobjectaction.getObject() != null)
				children.add(_readisclassifiedobjectaction.getObject());
			if(_readisclassifiedobjectaction.getResult() != null)
				children.add(_readisclassifiedobjectaction.getResult());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getProtocolConformance(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.ProtocolConformance _protocolconformance = (uml.ProtocolConformance) obj;
			children.addAll(_protocolconformance.getEAnnotations());
			children.addAll(_protocolconformance.getOwnedComment());
			return children;
		});
		explorationConsumer.put(Java2Uml.Java2UmlPackage.eINSTANCE.getJavaCompilationUnitToExistingUmlModel__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getObjectNode(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.ObjectNode _objectnode = (uml.ObjectNode) obj;
			children.addAll(_objectnode.getEAnnotations());
			children.addAll(_objectnode.getOwnedComment());
			if(_objectnode.getNameExpression() != null)
				children.add(_objectnode.getNameExpression());
			if(_objectnode.getUpperBound() != null)
				children.add(_objectnode.getUpperBound());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.imports.ImportsPackage.eINSTANCE.getImport(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.imports.Import _import = (org.emftext.language.java.imports.Import) obj;
			children.addAll(_import.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.classifiers.ClassifiersPackage.eINSTANCE.getInterface(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.classifiers.Interface _interface = (org.emftext.language.java.classifiers.Interface) obj;
			children.addAll(_interface.getLayoutInformations());
			children.addAll(_interface.getTypeParameters());
			children.addAll(_interface.getMembers());
			children.addAll(_interface.getDefaultMembers());
			children.addAll(_interface.getAnnotationsAndModifiers());
			children.addAll(_interface.getExtends());
			children.addAll(_interface.getDefaultExtends());
			return children;
		});
		explorationConsumer.put(Java2Uml.Java2UmlPackage.eINSTANCE.getInterfacePublicToPublic__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getShiftExpressionChild(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.expressions.ShiftExpressionChild _shiftexpressionchild = (org.emftext.language.java.expressions.ShiftExpressionChild) obj;
			children.addAll(_shiftexpressionchild.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getDivision(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.operators.Division _division = (org.emftext.language.java.operators.Division) obj;
			children.addAll(_division.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getReadLinkObjectEndQualifierAction(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.ReadLinkObjectEndQualifierAction _readlinkobjectendqualifieraction = (uml.ReadLinkObjectEndQualifierAction) obj;
			children.addAll(_readlinkobjectendqualifieraction.getEAnnotations());
			children.addAll(_readlinkobjectendqualifieraction.getOwnedComment());
			if(_readlinkobjectendqualifieraction.getNameExpression() != null)
				children.add(_readlinkobjectendqualifieraction.getNameExpression());
			children.addAll(_readlinkobjectendqualifieraction.getHandler());
			children.addAll(_readlinkobjectendqualifieraction.getLocalPostcondition());
			children.addAll(_readlinkobjectendqualifieraction.getLocalPrecondition());
			if(_readlinkobjectendqualifieraction.getObject() != null)
				children.add(_readlinkobjectendqualifieraction.getObject());
			if(_readlinkobjectendqualifieraction.getResult() != null)
				children.add(_readlinkobjectendqualifieraction.getResult());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getConnectionPointReference(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.ConnectionPointReference _connectionpointreference = (uml.ConnectionPointReference) obj;
			children.addAll(_connectionpointreference.getEAnnotations());
			children.addAll(_connectionpointreference.getOwnedComment());
			if(_connectionpointreference.getNameExpression() != null)
				children.add(_connectionpointreference.getNameExpression());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getLocalVariableStatement(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.statements.LocalVariableStatement _localvariablestatement = (org.emftext.language.java.statements.LocalVariableStatement) obj;
			children.addAll(_localvariablestatement.getLayoutInformations());
			if(_localvariablestatement.getVariable() != null)
				children.add(_localvariablestatement.getVariable());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getWhileLoop(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.statements.WhileLoop _whileloop = (org.emftext.language.java.statements.WhileLoop) obj;
			children.addAll(_whileloop.getLayoutInformations());
			if(_whileloop.getStatement() != null)
				children.add(_whileloop.getStatement());
			if(_whileloop.getCondition() != null)
				children.add(_whileloop.getCondition());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getRaiseExceptionAction(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.RaiseExceptionAction _raiseexceptionaction = (uml.RaiseExceptionAction) obj;
			children.addAll(_raiseexceptionaction.getEAnnotations());
			children.addAll(_raiseexceptionaction.getOwnedComment());
			if(_raiseexceptionaction.getNameExpression() != null)
				children.add(_raiseexceptionaction.getNameExpression());
			children.addAll(_raiseexceptionaction.getHandler());
			children.addAll(_raiseexceptionaction.getLocalPostcondition());
			children.addAll(_raiseexceptionaction.getLocalPrecondition());
			if(_raiseexceptionaction.getException() != null)
				children.add(_raiseexceptionaction.getException());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getEnumeration(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.Enumeration _enumeration = (uml.Enumeration) obj;
			children.addAll(_enumeration.getEAnnotations());
			children.addAll(_enumeration.getOwnedComment());
			if(_enumeration.getNameExpression() != null)
				children.add(_enumeration.getNameExpression());
			children.addAll(_enumeration.getOwnedRule());
			children.addAll(_enumeration.getElementImport());
			children.addAll(_enumeration.getPackageImport());
			children.addAll(_enumeration.getTemplateBinding());
			if(_enumeration.getOwnedTemplateSignature() != null)
				children.add(_enumeration.getOwnedTemplateSignature());
			children.addAll(_enumeration.getCollaborationUse());
			children.addAll(_enumeration.getGeneralization());
			children.addAll(_enumeration.getOwnedUseCase());
			children.addAll(_enumeration.getSubstitution());
			children.addAll(_enumeration.getOwnedAttribute());
			children.addAll(_enumeration.getOwnedOperation());
			children.addAll(_enumeration.getOwnedLiteral());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getAssignmentMinus(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.operators.AssignmentMinus _assignmentminus = (org.emftext.language.java.operators.AssignmentMinus) obj;
			children.addAll(_assignmentminus.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.members.MembersPackage.eINSTANCE.getExceptionThrower(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.members.ExceptionThrower _exceptionthrower = (org.emftext.language.java.members.ExceptionThrower) obj;
			children.addAll(_exceptionthrower.getLayoutInformations());
			children.addAll(_exceptionthrower.getExceptions());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.classifiers.ClassifiersPackage.eINSTANCE.getImplementor(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.classifiers.Implementor _implementor = (org.emftext.language.java.classifiers.Implementor) obj;
			children.addAll(_implementor.getLayoutInformations());
			children.addAll(_implementor.getImplements());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getValueSpecificationAction(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.ValueSpecificationAction _valuespecificationaction = (uml.ValueSpecificationAction) obj;
			children.addAll(_valuespecificationaction.getEAnnotations());
			children.addAll(_valuespecificationaction.getOwnedComment());
			if(_valuespecificationaction.getNameExpression() != null)
				children.add(_valuespecificationaction.getNameExpression());
			children.addAll(_valuespecificationaction.getHandler());
			children.addAll(_valuespecificationaction.getLocalPostcondition());
			children.addAll(_valuespecificationaction.getLocalPrecondition());
			if(_valuespecificationaction.getResult() != null)
				children.add(_valuespecificationaction.getResult());
			if(_valuespecificationaction.getValue() != null)
				children.add(_valuespecificationaction.getValue());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getAssociation(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.Association _association = (uml.Association) obj;
			children.addAll(_association.getEAnnotations());
			children.addAll(_association.getOwnedComment());
			if(_association.getNameExpression() != null)
				children.add(_association.getNameExpression());
			children.addAll(_association.getOwnedRule());
			children.addAll(_association.getElementImport());
			children.addAll(_association.getPackageImport());
			children.addAll(_association.getTemplateBinding());
			if(_association.getOwnedTemplateSignature() != null)
				children.add(_association.getOwnedTemplateSignature());
			children.addAll(_association.getCollaborationUse());
			children.addAll(_association.getGeneralization());
			children.addAll(_association.getOwnedUseCase());
			children.addAll(_association.getSubstitution());
			children.addAll(_association.getOwnedEnd());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getAssignmentRightShift(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.operators.AssignmentRightShift _assignmentrightshift = (org.emftext.language.java.operators.AssignmentRightShift) obj;
			children.addAll(_assignmentrightshift.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(org.eclipse.emf.ecore.EcorePackage.eINSTANCE.getEParameter(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.emf.ecore.EParameter _eparameter = (org.eclipse.emf.ecore.EParameter) obj;
			children.addAll(_eparameter.getEAnnotations());
			if(_eparameter.getEGenericType() != null)
				children.add(_eparameter.getEGenericType());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.instantiations.InstantiationsPackage.eINSTANCE.getInitializable(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.instantiations.Initializable _initializable = (org.emftext.language.java.instantiations.Initializable) obj;
			children.addAll(_initializable.getLayoutInformations());
			if(_initializable.getInitialValue() != null)
				children.add(_initializable.getInitialValue());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getAssignmentAnd(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.operators.AssignmentAnd _assignmentand = (org.emftext.language.java.operators.AssignmentAnd) obj;
			children.addAll(_assignmentand.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(org.eclipse.emf.ecore.EcorePackage.eINSTANCE.getEAnnotation(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.emf.ecore.EAnnotation _eannotation = (org.eclipse.emf.ecore.EAnnotation) obj;
			children.addAll(_eannotation.getEAnnotations());
			children.addAll(_eannotation.getContents());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getLiteralInteger(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.LiteralInteger _literalinteger = (uml.LiteralInteger) obj;
			children.addAll(_literalinteger.getEAnnotations());
			children.addAll(_literalinteger.getOwnedComment());
			if(_literalinteger.getNameExpression() != null)
				children.add(_literalinteger.getNameExpression());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getInterfaceRealization(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.InterfaceRealization _interfacerealization = (uml.InterfaceRealization) obj;
			children.addAll(_interfacerealization.getEAnnotations());
			children.addAll(_interfacerealization.getOwnedComment());
			if(_interfacerealization.getNameExpression() != null)
				children.add(_interfacerealization.getNameExpression());
			if(_interfacerealization.getMapping() != null)
				children.add(_interfacerealization.getMapping());
			return children;
		});
		explorationConsumer.put(Java2Uml.Java2UmlPackage.eINSTANCE.getConstructorEnumParamTypeToParamType__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.instantiations.InstantiationsPackage.eINSTANCE.getNewConstructorCall(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.instantiations.NewConstructorCall _newconstructorcall = (org.emftext.language.java.instantiations.NewConstructorCall) obj;
			children.addAll(_newconstructorcall.getLayoutInformations());
			if(_newconstructorcall.getTypeReference() != null)
				children.add(_newconstructorcall.getTypeReference());
			children.addAll(_newconstructorcall.getTypeArguments());
			if(_newconstructorcall.getNext() != null)
				children.add(_newconstructorcall.getNext());
			children.addAll(_newconstructorcall.getArraySelectors());
			children.addAll(_newconstructorcall.getArguments());
			children.addAll(_newconstructorcall.getCallTypeArguments());
			if(_newconstructorcall.getAnonymousClass() != null)
				children.add(_newconstructorcall.getAnonymousClass());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.classifiers.ClassifiersPackage.eINSTANCE.getAnnotation(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.classifiers.Annotation _annotation = (org.emftext.language.java.classifiers.Annotation) obj;
			children.addAll(_annotation.getLayoutInformations());
			children.addAll(_annotation.getTypeParameters());
			children.addAll(_annotation.getMembers());
			children.addAll(_annotation.getDefaultMembers());
			children.addAll(_annotation.getAnnotationsAndModifiers());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.literals.LiteralsPackage.eINSTANCE.getHexLongLiteral(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.literals.HexLongLiteral _hexlongliteral = (org.emftext.language.java.literals.HexLongLiteral) obj;
			children.addAll(_hexlongliteral.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getJump(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.statements.Jump _jump = (org.emftext.language.java.statements.Jump) obj;
			children.addAll(_jump.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(org.eclipse.emf.ecore.EcorePackage.eINSTANCE.getEGenericType(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.emf.ecore.EGenericType _egenerictype = (org.eclipse.emf.ecore.EGenericType) obj;
			if(_egenerictype.getEUpperBound() != null)
				children.add(_egenerictype.getEUpperBound());
			children.addAll(_egenerictype.getETypeArguments());
			if(_egenerictype.getELowerBound() != null)
				children.add(_egenerictype.getELowerBound());
			return children;
		});
		explorationConsumer.put(Java2Uml.Java2UmlPackage.eINSTANCE.getVariableLengthConstructorParameterToParameter__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(Java2Uml.Java2UmlPackage.eINSTANCE.getJavaCompilationUnitToUmlModel(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.annotations.AnnotationsPackage.eINSTANCE.getAnnotationAttribute(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.annotations.AnnotationAttribute _annotationattribute = (org.emftext.language.java.annotations.AnnotationAttribute) obj;
			children.addAll(_annotationattribute.getLayoutInformations());
			if(_annotationattribute.getTypeReference() != null)
				children.add(_annotationattribute.getTypeReference());
			children.addAll(_annotationattribute.getArrayDimensionsBefore());
			children.addAll(_annotationattribute.getArrayDimensionsAfter());
			children.addAll(_annotationattribute.getTypeParameters());
			children.addAll(_annotationattribute.getParameters());
			children.addAll(_annotationattribute.getExceptions());
			children.addAll(_annotationattribute.getAnnotationsAndModifiers());
			if(_annotationattribute.getDefaultValue() != null)
				children.add(_annotationattribute.getDefaultValue());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getInterval(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.Interval _interval = (uml.Interval) obj;
			children.addAll(_interval.getEAnnotations());
			children.addAll(_interval.getOwnedComment());
			if(_interval.getNameExpression() != null)
				children.add(_interval.getNameExpression());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getPseudostate(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.Pseudostate _pseudostate = (uml.Pseudostate) obj;
			children.addAll(_pseudostate.getEAnnotations());
			children.addAll(_pseudostate.getOwnedComment());
			if(_pseudostate.getNameExpression() != null)
				children.add(_pseudostate.getNameExpression());
			return children;
		});
		explorationConsumer.put(Java2Uml.Java2UmlPackage.eINSTANCE.getClassFinalToFinal__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getExpansionRegion(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.ExpansionRegion _expansionregion = (uml.ExpansionRegion) obj;
			children.addAll(_expansionregion.getEAnnotations());
			children.addAll(_expansionregion.getOwnedComment());
			if(_expansionregion.getNameExpression() != null)
				children.add(_expansionregion.getNameExpression());
			children.addAll(_expansionregion.getHandler());
			children.addAll(_expansionregion.getLocalPostcondition());
			children.addAll(_expansionregion.getLocalPrecondition());
			children.addAll(_expansionregion.getOwnedRule());
			children.addAll(_expansionregion.getElementImport());
			children.addAll(_expansionregion.getPackageImport());
			children.addAll(_expansionregion.getEdge());
			children.addAll(_expansionregion.getStructuredNodeInput());
			children.addAll(_expansionregion.getStructuredNodeOutput());
			children.addAll(_expansionregion.getVariable());
			children.addAll(_expansionregion.getNode());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getBreak(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.statements.Break _break = (org.emftext.language.java.statements.Break) obj;
			children.addAll(_break.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.literals.LiteralsPackage.eINSTANCE.getCharacterLiteral(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.literals.CharacterLiteral _characterliteral = (org.emftext.language.java.literals.CharacterLiteral) obj;
			children.addAll(_characterliteral.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getMultiplicativeOperator(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.operators.MultiplicativeOperator _multiplicativeoperator = (org.emftext.language.java.operators.MultiplicativeOperator) obj;
			children.addAll(_multiplicativeoperator.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(org.eclipse.emf.ecore.EcorePackage.eINSTANCE.getEReference(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.emf.ecore.EReference _ereference = (org.eclipse.emf.ecore.EReference) obj;
			children.addAll(_ereference.getEAnnotations());
			if(_ereference.getEGenericType() != null)
				children.add(_ereference.getEGenericType());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getCollaboration(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.Collaboration _collaboration = (uml.Collaboration) obj;
			children.addAll(_collaboration.getEAnnotations());
			children.addAll(_collaboration.getOwnedComment());
			if(_collaboration.getNameExpression() != null)
				children.add(_collaboration.getNameExpression());
			children.addAll(_collaboration.getOwnedRule());
			children.addAll(_collaboration.getElementImport());
			children.addAll(_collaboration.getPackageImport());
			children.addAll(_collaboration.getTemplateBinding());
			if(_collaboration.getOwnedTemplateSignature() != null)
				children.add(_collaboration.getOwnedTemplateSignature());
			children.addAll(_collaboration.getCollaborationUse());
			children.addAll(_collaboration.getGeneralization());
			children.addAll(_collaboration.getOwnedUseCase());
			children.addAll(_collaboration.getSubstitution());
			children.addAll(_collaboration.getOwnedAttribute());
			children.addAll(_collaboration.getOwnedConnector());
			children.addAll(_collaboration.getInterfaceRealization());
			children.addAll(_collaboration.getOwnedBehavior());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getNormalSwitchCase(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.statements.NormalSwitchCase _normalswitchcase = (org.emftext.language.java.statements.NormalSwitchCase) obj;
			children.addAll(_normalswitchcase.getLayoutInformations());
			children.addAll(_normalswitchcase.getStatements());
			if(_normalswitchcase.getCondition() != null)
				children.add(_normalswitchcase.getCondition());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.members.MembersPackage.eINSTANCE.getEmptyMember(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.members.EmptyMember _emptymember = (org.emftext.language.java.members.EmptyMember) obj;
			children.addAll(_emptymember.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.literals.LiteralsPackage.eINSTANCE.getHexDoubleLiteral(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.literals.HexDoubleLiteral _hexdoubleliteral = (org.emftext.language.java.literals.HexDoubleLiteral) obj;
			children.addAll(_hexdoubleliteral.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.modifiers.ModifiersPackage.eINSTANCE.getProtected(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.modifiers.Protected _protected = (org.emftext.language.java.modifiers.Protected) obj;
			children.addAll(_protected.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getConditionalExpressionChild(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.expressions.ConditionalExpressionChild _conditionalexpressionchild = (org.emftext.language.java.expressions.ConditionalExpressionChild) obj;
			children.addAll(_conditionalexpressionchild.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.modifiers.ModifiersPackage.eINSTANCE.getStrictfp(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.modifiers.Strictfp _strictfp = (org.emftext.language.java.modifiers.Strictfp) obj;
			children.addAll(_strictfp.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getStringExpression(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.StringExpression _stringexpression = (uml.StringExpression) obj;
			children.addAll(_stringexpression.getEAnnotations());
			children.addAll(_stringexpression.getOwnedComment());
			if(_stringexpression.getNameExpression() != null)
				children.add(_stringexpression.getNameExpression());
			children.addAll(_stringexpression.getOperand());
			children.addAll(_stringexpression.getTemplateBinding());
			if(_stringexpression.getOwnedTemplateSignature() != null)
				children.add(_stringexpression.getOwnedTemplateSignature());
			children.addAll(_stringexpression.getSubExpression());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getBehavioralFeature(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.BehavioralFeature _behavioralfeature = (uml.BehavioralFeature) obj;
			children.addAll(_behavioralfeature.getEAnnotations());
			children.addAll(_behavioralfeature.getOwnedComment());
			if(_behavioralfeature.getNameExpression() != null)
				children.add(_behavioralfeature.getNameExpression());
			children.addAll(_behavioralfeature.getOwnedRule());
			children.addAll(_behavioralfeature.getElementImport());
			children.addAll(_behavioralfeature.getPackageImport());
			children.addAll(_behavioralfeature.getOwnedParameter());
			children.addAll(_behavioralfeature.getOwnedParameterSet());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.references.ReferencesPackage.eINSTANCE.getArgumentable(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.references.Argumentable _argumentable = (org.emftext.language.java.references.Argumentable) obj;
			children.addAll(_argumentable.getLayoutInformations());
			children.addAll(_argumentable.getArguments());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.references.ReferencesPackage.eINSTANCE.getStringReference(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.references.StringReference _stringreference = (org.emftext.language.java.references.StringReference) obj;
			children.addAll(_stringreference.getLayoutInformations());
			children.addAll(_stringreference.getTypeArguments());
			if(_stringreference.getNext() != null)
				children.add(_stringreference.getNext());
			children.addAll(_stringreference.getArraySelectors());
			return children;
		});
		explorationConsumer.put(org.eclipse.emf.ecore.EcorePackage.eINSTANCE.getEObject(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getStatementListContainer(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.statements.StatementListContainer _statementlistcontainer = (org.emftext.language.java.statements.StatementListContainer) obj;
			children.addAll(_statementlistcontainer.getLayoutInformations());
			children.addAll(_statementlistcontainer.getStatements());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getGreaterThan(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.operators.GreaterThan _greaterthan = (org.emftext.language.java.operators.GreaterThan) obj;
			children.addAll(_greaterthan.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.modifiers.ModifiersPackage.eINSTANCE.getAnnotableAndModifiable(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.modifiers.AnnotableAndModifiable _annotableandmodifiable = (org.emftext.language.java.modifiers.AnnotableAndModifiable) obj;
			children.addAll(_annotableandmodifiable.getLayoutInformations());
			children.addAll(_annotableandmodifiable.getAnnotationsAndModifiers());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getAcceptCallAction(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.AcceptCallAction _acceptcallaction = (uml.AcceptCallAction) obj;
			children.addAll(_acceptcallaction.getEAnnotations());
			children.addAll(_acceptcallaction.getOwnedComment());
			if(_acceptcallaction.getNameExpression() != null)
				children.add(_acceptcallaction.getNameExpression());
			children.addAll(_acceptcallaction.getHandler());
			children.addAll(_acceptcallaction.getLocalPostcondition());
			children.addAll(_acceptcallaction.getLocalPrecondition());
			children.addAll(_acceptcallaction.getResult());
			children.addAll(_acceptcallaction.getTrigger());
			if(_acceptcallaction.getReturnInformation() != null)
				children.add(_acceptcallaction.getReturnInformation());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getConnectableElement(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.ConnectableElement _connectableelement = (uml.ConnectableElement) obj;
			children.addAll(_connectableelement.getEAnnotations());
			children.addAll(_connectableelement.getOwnedComment());
			if(_connectableelement.getNameExpression() != null)
				children.add(_connectableelement.getNameExpression());
			return children;
		});
		explorationConsumer.put(org.eclipse.emf.ecore.EcorePackage.eINSTANCE.getEOperation(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.emf.ecore.EOperation _eoperation = (org.eclipse.emf.ecore.EOperation) obj;
			children.addAll(_eoperation.getEAnnotations());
			if(_eoperation.getEGenericType() != null)
				children.add(_eoperation.getEGenericType());
			children.addAll(_eoperation.getETypeParameters());
			children.addAll(_eoperation.getEParameters());
			children.addAll(_eoperation.getEGenericExceptions());
			return children;
		});
		explorationConsumer.put(Java2Uml.Java2UmlPackage.eINSTANCE.getInterfaceAbstractToAbstract__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(Java2Uml.Java2UmlPackage.eINSTANCE.getFieldStaticToStatic__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.variables.VariablesPackage.eINSTANCE.getAdditionalLocalVariable(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.variables.AdditionalLocalVariable _additionallocalvariable = (org.emftext.language.java.variables.AdditionalLocalVariable) obj;
			children.addAll(_additionallocalvariable.getLayoutInformations());
			children.addAll(_additionallocalvariable.getArrayDimensionsBefore());
			children.addAll(_additionallocalvariable.getArrayDimensionsAfter());
			if(_additionallocalvariable.getInitialValue() != null)
				children.add(_additionallocalvariable.getInitialValue());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getLifeline(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.Lifeline _lifeline = (uml.Lifeline) obj;
			children.addAll(_lifeline.getEAnnotations());
			children.addAll(_lifeline.getOwnedComment());
			if(_lifeline.getNameExpression() != null)
				children.add(_lifeline.getNameExpression());
			if(_lifeline.getSelector() != null)
				children.add(_lifeline.getSelector());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.generics.GenericsPackage.eINSTANCE.getTypeParameter(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.generics.TypeParameter _typeparameter = (org.emftext.language.java.generics.TypeParameter) obj;
			children.addAll(_typeparameter.getLayoutInformations());
			children.addAll(_typeparameter.getExtendTypes());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getOperationTemplateParameter(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.OperationTemplateParameter _operationtemplateparameter = (uml.OperationTemplateParameter) obj;
			children.addAll(_operationtemplateparameter.getEAnnotations());
			children.addAll(_operationtemplateparameter.getOwnedComment());
			if(_operationtemplateparameter.getOwnedDefault() != null)
				children.add(_operationtemplateparameter.getOwnedDefault());
			if(_operationtemplateparameter.getOwnedParameteredElement() != null)
				children.add(_operationtemplateparameter.getOwnedParameteredElement());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.modifiers.ModifiersPackage.eINSTANCE.getStatic(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.modifiers.Static _static = (org.emftext.language.java.modifiers.Static) obj;
			children.addAll(_static.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getRelationOperator(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.operators.RelationOperator _relationoperator = (org.emftext.language.java.operators.RelationOperator) obj;
			children.addAll(_relationoperator.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getUnaryOperator(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.operators.UnaryOperator _unaryoperator = (org.emftext.language.java.operators.UnaryOperator) obj;
			children.addAll(_unaryoperator.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getMultiplicativeExpressionChild(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.expressions.MultiplicativeExpressionChild _multiplicativeexpressionchild = (org.emftext.language.java.expressions.MultiplicativeExpressionChild) obj;
			children.addAll(_multiplicativeexpressionchild.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(org.eclipse.emf.ecore.EcorePackage.eINSTANCE.getEClass(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.emf.ecore.EClass _eclass = (org.eclipse.emf.ecore.EClass) obj;
			children.addAll(_eclass.getEAnnotations());
			children.addAll(_eclass.getETypeParameters());
			children.addAll(_eclass.getEOperations());
			children.addAll(_eclass.getEStructuralFeatures());
			children.addAll(_eclass.getEGenericSuperTypes());
			return children;
		});
		explorationConsumer.put(Java2Uml.Java2UmlPackage.eINSTANCE.getInterfaceProtectedToProtected__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getClearAssociationAction(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.ClearAssociationAction _clearassociationaction = (uml.ClearAssociationAction) obj;
			children.addAll(_clearassociationaction.getEAnnotations());
			children.addAll(_clearassociationaction.getOwnedComment());
			if(_clearassociationaction.getNameExpression() != null)
				children.add(_clearassociationaction.getNameExpression());
			children.addAll(_clearassociationaction.getHandler());
			children.addAll(_clearassociationaction.getLocalPostcondition());
			children.addAll(_clearassociationaction.getLocalPrecondition());
			if(_clearassociationaction.getObject() != null)
				children.add(_clearassociationaction.getObject());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArrayInitializationValue(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.arrays.ArrayInitializationValue _arrayinitializationvalue = (org.emftext.language.java.arrays.ArrayInitializationValue) obj;
			children.addAll(_arrayinitializationvalue.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getTemplateParameterSubstitution(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.TemplateParameterSubstitution _templateparametersubstitution = (uml.TemplateParameterSubstitution) obj;
			children.addAll(_templateparametersubstitution.getEAnnotations());
			children.addAll(_templateparametersubstitution.getOwnedComment());
			if(_templateparametersubstitution.getOwnedActual() != null)
				children.add(_templateparametersubstitution.getOwnedActual());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.commons.CommonsPackage.eINSTANCE.getNamespaceAwareElement(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.commons.NamespaceAwareElement _namespaceawareelement = (org.emftext.language.java.commons.NamespaceAwareElement) obj;
			children.addAll(_namespaceawareelement.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.annotations.AnnotationsPackage.eINSTANCE.getAnnotable(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.annotations.Annotable _annotable = (org.emftext.language.java.annotations.Annotable) obj;
			children.addAll(_annotable.getLayoutInformations());
			children.addAll(_annotable.getAnnotations());
			return children;
		});
		explorationConsumer.put(Java2Uml.Java2UmlPackage.eINSTANCE.getClassImplementToClassImplement__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.members.MembersPackage.eINSTANCE.getInterfaceMethod(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.members.InterfaceMethod _interfacemethod = (org.emftext.language.java.members.InterfaceMethod) obj;
			children.addAll(_interfacemethod.getLayoutInformations());
			if(_interfacemethod.getTypeReference() != null)
				children.add(_interfacemethod.getTypeReference());
			children.addAll(_interfacemethod.getArrayDimensionsBefore());
			children.addAll(_interfacemethod.getArrayDimensionsAfter());
			children.addAll(_interfacemethod.getTypeParameters());
			children.addAll(_interfacemethod.getParameters());
			children.addAll(_interfacemethod.getExceptions());
			children.addAll(_interfacemethod.getAnnotationsAndModifiers());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getInclusiveOrExpressionChild(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.expressions.InclusiveOrExpressionChild _inclusiveorexpressionchild = (org.emftext.language.java.expressions.InclusiveOrExpressionChild) obj;
			children.addAll(_inclusiveorexpressionchild.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getActivity(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.Activity _activity = (uml.Activity) obj;
			children.addAll(_activity.getEAnnotations());
			children.addAll(_activity.getOwnedComment());
			if(_activity.getNameExpression() != null)
				children.add(_activity.getNameExpression());
			children.addAll(_activity.getOwnedRule());
			children.addAll(_activity.getElementImport());
			children.addAll(_activity.getPackageImport());
			children.addAll(_activity.getTemplateBinding());
			if(_activity.getOwnedTemplateSignature() != null)
				children.add(_activity.getOwnedTemplateSignature());
			children.addAll(_activity.getCollaborationUse());
			children.addAll(_activity.getGeneralization());
			children.addAll(_activity.getOwnedUseCase());
			children.addAll(_activity.getSubstitution());
			children.addAll(_activity.getOwnedAttribute());
			children.addAll(_activity.getOwnedConnector());
			children.addAll(_activity.getInterfaceRealization());
			children.addAll(_activity.getOwnedBehavior());
			children.addAll(_activity.getOwnedOperation());
			children.addAll(_activity.getNestedClassifier());
			children.addAll(_activity.getOwnedReception());
			children.addAll(_activity.getOwnedParameter());
			children.addAll(_activity.getOwnedParameterSet());
			children.addAll(_activity.getOwnedGroup());
			children.addAll(_activity.getEdge());
			children.addAll(_activity.getVariable());
			children.addAll(_activity.getOwnedNode());
			children.addAll(_activity.getStructuredNode());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getParameterSet(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.ParameterSet _parameterset = (uml.ParameterSet) obj;
			children.addAll(_parameterset.getEAnnotations());
			children.addAll(_parameterset.getOwnedComment());
			if(_parameterset.getNameExpression() != null)
				children.add(_parameterset.getNameExpression());
			children.addAll(_parameterset.getCondition());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getDeployment(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.Deployment _deployment = (uml.Deployment) obj;
			children.addAll(_deployment.getEAnnotations());
			children.addAll(_deployment.getOwnedComment());
			if(_deployment.getNameExpression() != null)
				children.add(_deployment.getNameExpression());
			children.addAll(_deployment.getConfiguration());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getMergeNode(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.MergeNode _mergenode = (uml.MergeNode) obj;
			children.addAll(_mergenode.getEAnnotations());
			children.addAll(_mergenode.getOwnedComment());
			if(_mergenode.getNameExpression() != null)
				children.add(_mergenode.getNameExpression());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getAcceptEventAction(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.AcceptEventAction _accepteventaction = (uml.AcceptEventAction) obj;
			children.addAll(_accepteventaction.getEAnnotations());
			children.addAll(_accepteventaction.getOwnedComment());
			if(_accepteventaction.getNameExpression() != null)
				children.add(_accepteventaction.getNameExpression());
			children.addAll(_accepteventaction.getHandler());
			children.addAll(_accepteventaction.getLocalPostcondition());
			children.addAll(_accepteventaction.getLocalPrecondition());
			children.addAll(_accepteventaction.getResult());
			children.addAll(_accepteventaction.getTrigger());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getClass(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.Class _class = (uml.Class) obj;
			children.addAll(_class.getEAnnotations());
			children.addAll(_class.getOwnedComment());
			if(_class.getNameExpression() != null)
				children.add(_class.getNameExpression());
			children.addAll(_class.getOwnedRule());
			children.addAll(_class.getElementImport());
			children.addAll(_class.getPackageImport());
			children.addAll(_class.getTemplateBinding());
			if(_class.getOwnedTemplateSignature() != null)
				children.add(_class.getOwnedTemplateSignature());
			children.addAll(_class.getCollaborationUse());
			children.addAll(_class.getGeneralization());
			children.addAll(_class.getOwnedUseCase());
			children.addAll(_class.getSubstitution());
			children.addAll(_class.getOwnedAttribute());
			children.addAll(_class.getOwnedConnector());
			children.addAll(_class.getInterfaceRealization());
			children.addAll(_class.getOwnedBehavior());
			children.addAll(_class.getOwnedOperation());
			children.addAll(_class.getNestedClassifier());
			children.addAll(_class.getOwnedReception());
			return children;
		});
		explorationConsumer.put(org.eclipse.emf.ecore.EcorePackage.eINSTANCE.getEFactory(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.emf.ecore.EFactory _efactory = (org.eclipse.emf.ecore.EFactory) obj;
			children.addAll(_efactory.getEAnnotations());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getEncapsulatedClassifier(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.EncapsulatedClassifier _encapsulatedclassifier = (uml.EncapsulatedClassifier) obj;
			children.addAll(_encapsulatedclassifier.getEAnnotations());
			children.addAll(_encapsulatedclassifier.getOwnedComment());
			if(_encapsulatedclassifier.getNameExpression() != null)
				children.add(_encapsulatedclassifier.getNameExpression());
			children.addAll(_encapsulatedclassifier.getOwnedRule());
			children.addAll(_encapsulatedclassifier.getElementImport());
			children.addAll(_encapsulatedclassifier.getPackageImport());
			children.addAll(_encapsulatedclassifier.getTemplateBinding());
			if(_encapsulatedclassifier.getOwnedTemplateSignature() != null)
				children.add(_encapsulatedclassifier.getOwnedTemplateSignature());
			children.addAll(_encapsulatedclassifier.getCollaborationUse());
			children.addAll(_encapsulatedclassifier.getGeneralization());
			children.addAll(_encapsulatedclassifier.getOwnedUseCase());
			children.addAll(_encapsulatedclassifier.getSubstitution());
			children.addAll(_encapsulatedclassifier.getOwnedAttribute());
			children.addAll(_encapsulatedclassifier.getOwnedConnector());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getCondition(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.statements.Condition _condition = (org.emftext.language.java.statements.Condition) obj;
			children.addAll(_condition.getLayoutInformations());
			if(_condition.getStatement() != null)
				children.add(_condition.getStatement());
			if(_condition.getCondition() != null)
				children.add(_condition.getCondition());
			if(_condition.getElseStatement() != null)
				children.add(_condition.getElseStatement());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getExtend(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.Extend _extend = (uml.Extend) obj;
			children.addAll(_extend.getEAnnotations());
			children.addAll(_extend.getOwnedComment());
			if(_extend.getNameExpression() != null)
				children.add(_extend.getNameExpression());
			if(_extend.getCondition() != null)
				children.add(_extend.getCondition());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getPackageMerge(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.PackageMerge _packagemerge = (uml.PackageMerge) obj;
			children.addAll(_packagemerge.getEAnnotations());
			children.addAll(_packagemerge.getOwnedComment());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getCreateLinkObjectAction(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.CreateLinkObjectAction _createlinkobjectaction = (uml.CreateLinkObjectAction) obj;
			children.addAll(_createlinkobjectaction.getEAnnotations());
			children.addAll(_createlinkobjectaction.getOwnedComment());
			if(_createlinkobjectaction.getNameExpression() != null)
				children.add(_createlinkobjectaction.getNameExpression());
			children.addAll(_createlinkobjectaction.getHandler());
			children.addAll(_createlinkobjectaction.getLocalPostcondition());
			children.addAll(_createlinkobjectaction.getLocalPrecondition());
			children.addAll(_createlinkobjectaction.getEndData());
			children.addAll(_createlinkobjectaction.getInputValue());
			if(_createlinkobjectaction.getResult() != null)
				children.add(_createlinkobjectaction.getResult());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getExclusiveOrExpression(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.expressions.ExclusiveOrExpression _exclusiveorexpression = (org.emftext.language.java.expressions.ExclusiveOrExpression) obj;
			children.addAll(_exclusiveorexpression.getLayoutInformations());
			children.addAll(_exclusiveorexpression.getChildren());
			return children;
		});
		explorationConsumer.put(Java2Uml.Java2UmlPackage.eINSTANCE.getClassPrivateToPrivate__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getInstanceSpecification(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.InstanceSpecification _instancespecification = (uml.InstanceSpecification) obj;
			children.addAll(_instancespecification.getEAnnotations());
			children.addAll(_instancespecification.getOwnedComment());
			if(_instancespecification.getNameExpression() != null)
				children.add(_instancespecification.getNameExpression());
			children.addAll(_instancespecification.getDeployment());
			children.addAll(_instancespecification.getSlot());
			if(_instancespecification.getSpecification() != null)
				children.add(_instancespecification.getSpecification());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getTimeEvent(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.TimeEvent _timeevent = (uml.TimeEvent) obj;
			children.addAll(_timeevent.getEAnnotations());
			children.addAll(_timeevent.getOwnedComment());
			if(_timeevent.getNameExpression() != null)
				children.add(_timeevent.getNameExpression());
			if(_timeevent.getWhen() != null)
				children.add(_timeevent.getWhen());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getNode(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.Node _node = (uml.Node) obj;
			children.addAll(_node.getEAnnotations());
			children.addAll(_node.getOwnedComment());
			if(_node.getNameExpression() != null)
				children.add(_node.getNameExpression());
			children.addAll(_node.getOwnedRule());
			children.addAll(_node.getElementImport());
			children.addAll(_node.getPackageImport());
			children.addAll(_node.getTemplateBinding());
			if(_node.getOwnedTemplateSignature() != null)
				children.add(_node.getOwnedTemplateSignature());
			children.addAll(_node.getCollaborationUse());
			children.addAll(_node.getGeneralization());
			children.addAll(_node.getOwnedUseCase());
			children.addAll(_node.getSubstitution());
			children.addAll(_node.getOwnedAttribute());
			children.addAll(_node.getOwnedConnector());
			children.addAll(_node.getInterfaceRealization());
			children.addAll(_node.getOwnedBehavior());
			children.addAll(_node.getOwnedOperation());
			children.addAll(_node.getNestedClassifier());
			children.addAll(_node.getOwnedReception());
			children.addAll(_node.getDeployment());
			children.addAll(_node.getNestedNode());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getBehavior(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.Behavior _behavior = (uml.Behavior) obj;
			children.addAll(_behavior.getEAnnotations());
			children.addAll(_behavior.getOwnedComment());
			if(_behavior.getNameExpression() != null)
				children.add(_behavior.getNameExpression());
			children.addAll(_behavior.getOwnedRule());
			children.addAll(_behavior.getElementImport());
			children.addAll(_behavior.getPackageImport());
			children.addAll(_behavior.getTemplateBinding());
			if(_behavior.getOwnedTemplateSignature() != null)
				children.add(_behavior.getOwnedTemplateSignature());
			children.addAll(_behavior.getCollaborationUse());
			children.addAll(_behavior.getGeneralization());
			children.addAll(_behavior.getOwnedUseCase());
			children.addAll(_behavior.getSubstitution());
			children.addAll(_behavior.getOwnedAttribute());
			children.addAll(_behavior.getOwnedConnector());
			children.addAll(_behavior.getInterfaceRealization());
			children.addAll(_behavior.getOwnedBehavior());
			children.addAll(_behavior.getOwnedOperation());
			children.addAll(_behavior.getNestedClassifier());
			children.addAll(_behavior.getOwnedReception());
			children.addAll(_behavior.getOwnedParameter());
			children.addAll(_behavior.getOwnedParameterSet());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArrayInstantiationBySize(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.arrays.ArrayInstantiationBySize _arrayinstantiationbysize = (org.emftext.language.java.arrays.ArrayInstantiationBySize) obj;
			children.addAll(_arrayinstantiationbysize.getLayoutInformations());
			children.addAll(_arrayinstantiationbysize.getTypeArguments());
			if(_arrayinstantiationbysize.getNext() != null)
				children.add(_arrayinstantiationbysize.getNext());
			children.addAll(_arrayinstantiationbysize.getArraySelectors());
			if(_arrayinstantiationbysize.getTypeReference() != null)
				children.add(_arrayinstantiationbysize.getTypeReference());
			children.addAll(_arrayinstantiationbysize.getArrayDimensionsBefore());
			children.addAll(_arrayinstantiationbysize.getArrayDimensionsAfter());
			children.addAll(_arrayinstantiationbysize.getSizes());
			return children;
		});
		explorationConsumer.put(Java2Uml.Java2UmlPackage.eINSTANCE.getClassAttributeTypeToPropertyType__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getFeature(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.Feature _feature = (uml.Feature) obj;
			children.addAll(_feature.getEAnnotations());
			children.addAll(_feature.getOwnedComment());
			if(_feature.getNameExpression() != null)
				children.add(_feature.getNameExpression());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.classifiers.ClassifiersPackage.eINSTANCE.getClass(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.classifiers.Class _class = (org.emftext.language.java.classifiers.Class) obj;
			children.addAll(_class.getLayoutInformations());
			children.addAll(_class.getTypeParameters());
			children.addAll(_class.getMembers());
			children.addAll(_class.getDefaultMembers());
			children.addAll(_class.getAnnotationsAndModifiers());
			children.addAll(_class.getImplements());
			if(_class.getExtends() != null)
				children.add(_class.getExtends());
			if(_class.getDefaultExtends() != null)
				children.add(_class.getDefaultExtends());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getNegate(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.operators.Negate _negate = (org.emftext.language.java.operators.Negate) obj;
			children.addAll(_negate.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getWriteLinkAction(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.WriteLinkAction _writelinkaction = (uml.WriteLinkAction) obj;
			children.addAll(_writelinkaction.getEAnnotations());
			children.addAll(_writelinkaction.getOwnedComment());
			if(_writelinkaction.getNameExpression() != null)
				children.add(_writelinkaction.getNameExpression());
			children.addAll(_writelinkaction.getHandler());
			children.addAll(_writelinkaction.getLocalPostcondition());
			children.addAll(_writelinkaction.getLocalPrecondition());
			children.addAll(_writelinkaction.getEndData());
			children.addAll(_writelinkaction.getInputValue());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.members.MembersPackage.eINSTANCE.getAdditionalField(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.members.AdditionalField _additionalfield = (org.emftext.language.java.members.AdditionalField) obj;
			children.addAll(_additionalfield.getLayoutInformations());
			children.addAll(_additionalfield.getArrayDimensionsBefore());
			children.addAll(_additionalfield.getArrayDimensionsAfter());
			if(_additionalfield.getInitialValue() != null)
				children.add(_additionalfield.getInitialValue());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getActor(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.Actor _actor = (uml.Actor) obj;
			children.addAll(_actor.getEAnnotations());
			children.addAll(_actor.getOwnedComment());
			if(_actor.getNameExpression() != null)
				children.add(_actor.getNameExpression());
			children.addAll(_actor.getOwnedRule());
			children.addAll(_actor.getElementImport());
			children.addAll(_actor.getPackageImport());
			children.addAll(_actor.getTemplateBinding());
			if(_actor.getOwnedTemplateSignature() != null)
				children.add(_actor.getOwnedTemplateSignature());
			children.addAll(_actor.getCollaborationUse());
			children.addAll(_actor.getGeneralization());
			children.addAll(_actor.getOwnedUseCase());
			children.addAll(_actor.getSubstitution());
			children.addAll(_actor.getInterfaceRealization());
			children.addAll(_actor.getOwnedBehavior());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArrayDimension(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.arrays.ArrayDimension _arraydimension = (org.emftext.language.java.arrays.ArrayDimension) obj;
			children.addAll(_arraydimension.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.modifiers.ModifiersPackage.eINSTANCE.getModifiable(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.modifiers.Modifiable _modifiable = (org.emftext.language.java.modifiers.Modifiable) obj;
			children.addAll(_modifiable.getLayoutInformations());
			children.addAll(_modifiable.getModifiers());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.generics.GenericsPackage.eINSTANCE.getQualifiedTypeArgument(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.generics.QualifiedTypeArgument _qualifiedtypeargument = (org.emftext.language.java.generics.QualifiedTypeArgument) obj;
			children.addAll(_qualifiedtypeargument.getLayoutInformations());
			children.addAll(_qualifiedtypeargument.getArrayDimensionsBefore());
			children.addAll(_qualifiedtypeargument.getArrayDimensionsAfter());
			if(_qualifiedtypeargument.getTypeReference() != null)
				children.add(_qualifiedtypeargument.getTypeReference());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getTimeExpression(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.TimeExpression _timeexpression = (uml.TimeExpression) obj;
			children.addAll(_timeexpression.getEAnnotations());
			children.addAll(_timeexpression.getOwnedComment());
			if(_timeexpression.getNameExpression() != null)
				children.add(_timeexpression.getNameExpression());
			if(_timeexpression.getExpr() != null)
				children.add(_timeexpression.getExpr());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.types.TypesPackage.eINSTANCE.getInt(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.types.Int _int = (org.emftext.language.java.types.Int) obj;
			children.addAll(_int.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(Java2Uml.Java2UmlPackage.eINSTANCE.getMethodEnumReturnTypeToReturnType__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.variables.VariablesPackage.eINSTANCE.getVariable(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.variables.Variable _variable = (org.emftext.language.java.variables.Variable) obj;
			children.addAll(_variable.getLayoutInformations());
			if(_variable.getTypeReference() != null)
				children.add(_variable.getTypeReference());
			children.addAll(_variable.getArrayDimensionsBefore());
			children.addAll(_variable.getArrayDimensionsAfter());
			children.addAll(_variable.getTypeArguments());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getPackageImport(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.PackageImport _packageimport = (uml.PackageImport) obj;
			children.addAll(_packageimport.getEAnnotations());
			children.addAll(_packageimport.getOwnedComment());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getAddition(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.operators.Addition _addition = (org.emftext.language.java.operators.Addition) obj;
			children.addAll(_addition.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getParameterableElement(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.ParameterableElement _parameterableelement = (uml.ParameterableElement) obj;
			children.addAll(_parameterableelement.getEAnnotations());
			children.addAll(_parameterableelement.getOwnedComment());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.modifiers.ModifiersPackage.eINSTANCE.getVolatile(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.modifiers.Volatile _volatile = (org.emftext.language.java.modifiers.Volatile) obj;
			children.addAll(_volatile.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.generics.GenericsPackage.eINSTANCE.getSuperTypeArgument(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.generics.SuperTypeArgument _supertypeargument = (org.emftext.language.java.generics.SuperTypeArgument) obj;
			children.addAll(_supertypeargument.getLayoutInformations());
			children.addAll(_supertypeargument.getArrayDimensionsBefore());
			children.addAll(_supertypeargument.getArrayDimensionsAfter());
			if(_supertypeargument.getSuperType() != null)
				children.add(_supertypeargument.getSuperType());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getExtensionEnd(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.ExtensionEnd _extensionend = (uml.ExtensionEnd) obj;
			children.addAll(_extensionend.getEAnnotations());
			children.addAll(_extensionend.getOwnedComment());
			if(_extensionend.getNameExpression() != null)
				children.add(_extensionend.getNameExpression());
			if(_extensionend.getLowerValue() != null)
				children.add(_extensionend.getLowerValue());
			if(_extensionend.getUpperValue() != null)
				children.add(_extensionend.getUpperValue());
			children.addAll(_extensionend.getDeployment());
			children.addAll(_extensionend.getQualifier());
			if(_extensionend.getDefaultValue() != null)
				children.add(_extensionend.getDefaultValue());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.parameters.ParametersPackage.eINSTANCE.getVariableLengthParameter(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.parameters.VariableLengthParameter _variablelengthparameter = (org.emftext.language.java.parameters.VariableLengthParameter) obj;
			children.addAll(_variablelengthparameter.getLayoutInformations());
			if(_variablelengthparameter.getTypeReference() != null)
				children.add(_variablelengthparameter.getTypeReference());
			children.addAll(_variablelengthparameter.getArrayDimensionsBefore());
			children.addAll(_variablelengthparameter.getArrayDimensionsAfter());
			children.addAll(_variablelengthparameter.getTypeArguments());
			children.addAll(_variablelengthparameter.getAnnotationsAndModifiers());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getImage(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.Image _image = (uml.Image) obj;
			children.addAll(_image.getEAnnotations());
			children.addAll(_image.getOwnedComment());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getActivityFinalNode(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.ActivityFinalNode _activityfinalnode = (uml.ActivityFinalNode) obj;
			children.addAll(_activityfinalnode.getEAnnotations());
			children.addAll(_activityfinalnode.getOwnedComment());
			if(_activityfinalnode.getNameExpression() != null)
				children.add(_activityfinalnode.getNameExpression());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.commons.CommonsPackage.eINSTANCE.getCommentable(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.commons.Commentable _commentable = (org.emftext.language.java.commons.Commentable) obj;
			children.addAll(_commentable.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.literals.LiteralsPackage.eINSTANCE.getNullLiteral(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.literals.NullLiteral _nullliteral = (org.emftext.language.java.literals.NullLiteral) obj;
			children.addAll(_nullliteral.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getLiteralSpecification(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.LiteralSpecification _literalspecification = (uml.LiteralSpecification) obj;
			children.addAll(_literalspecification.getEAnnotations());
			children.addAll(_literalspecification.getOwnedComment());
			if(_literalspecification.getNameExpression() != null)
				children.add(_literalspecification.getNameExpression());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getInterface(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.Interface _interface = (uml.Interface) obj;
			children.addAll(_interface.getEAnnotations());
			children.addAll(_interface.getOwnedComment());
			if(_interface.getNameExpression() != null)
				children.add(_interface.getNameExpression());
			children.addAll(_interface.getOwnedRule());
			children.addAll(_interface.getElementImport());
			children.addAll(_interface.getPackageImport());
			children.addAll(_interface.getTemplateBinding());
			if(_interface.getOwnedTemplateSignature() != null)
				children.add(_interface.getOwnedTemplateSignature());
			children.addAll(_interface.getCollaborationUse());
			children.addAll(_interface.getGeneralization());
			children.addAll(_interface.getOwnedUseCase());
			children.addAll(_interface.getSubstitution());
			children.addAll(_interface.getNestedClassifier());
			children.addAll(_interface.getOwnedAttribute());
			children.addAll(_interface.getOwnedReception());
			if(_interface.getProtocol() != null)
				children.add(_interface.getProtocol());
			children.addAll(_interface.getOwnedOperation());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getAssert(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.statements.Assert _assert = (org.emftext.language.java.statements.Assert) obj;
			children.addAll(_assert.getLayoutInformations());
			if(_assert.getCondition() != null)
				children.add(_assert.getCondition());
			if(_assert.getErrorMessage() != null)
				children.add(_assert.getErrorMessage());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getTimeConstraint(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.TimeConstraint _timeconstraint = (uml.TimeConstraint) obj;
			children.addAll(_timeconstraint.getEAnnotations());
			children.addAll(_timeconstraint.getOwnedComment());
			if(_timeconstraint.getNameExpression() != null)
				children.add(_timeconstraint.getNameExpression());
			if(_timeconstraint.getSpecification() != null)
				children.add(_timeconstraint.getSpecification());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getJoinNode(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.JoinNode _joinnode = (uml.JoinNode) obj;
			children.addAll(_joinnode.getEAnnotations());
			children.addAll(_joinnode.getOwnedComment());
			if(_joinnode.getNameExpression() != null)
				children.add(_joinnode.getNameExpression());
			if(_joinnode.getJoinSpec() != null)
				children.add(_joinnode.getJoinSpec());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getLeftShift(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.operators.LeftShift _leftshift = (org.emftext.language.java.operators.LeftShift) obj;
			children.addAll(_leftshift.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.types.TypesPackage.eINSTANCE.getType(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.types.Type _type = (org.emftext.language.java.types.Type) obj;
			children.addAll(_type.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getObjectFlow(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.ObjectFlow _objectflow = (uml.ObjectFlow) obj;
			children.addAll(_objectflow.getEAnnotations());
			children.addAll(_objectflow.getOwnedComment());
			if(_objectflow.getNameExpression() != null)
				children.add(_objectflow.getNameExpression());
			if(_objectflow.getGuard() != null)
				children.add(_objectflow.getGuard());
			if(_objectflow.getWeight() != null)
				children.add(_objectflow.getWeight());
			return children;
		});
		explorationConsumer.put(Java2Uml.Java2UmlPackage.eINSTANCE.getExistingClassImplementToClassImplement__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getSuffixUnaryModificationExpression(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.expressions.SuffixUnaryModificationExpression _suffixunarymodificationexpression = (org.emftext.language.java.expressions.SuffixUnaryModificationExpression) obj;
			children.addAll(_suffixunarymodificationexpression.getLayoutInformations());
			if(_suffixunarymodificationexpression.getChild() != null)
				children.add(_suffixunarymodificationexpression.getChild());
			if(_suffixunarymodificationexpression.getOperator() != null)
				children.add(_suffixunarymodificationexpression.getOperator());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getCreateObjectAction(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.CreateObjectAction _createobjectaction = (uml.CreateObjectAction) obj;
			children.addAll(_createobjectaction.getEAnnotations());
			children.addAll(_createobjectaction.getOwnedComment());
			if(_createobjectaction.getNameExpression() != null)
				children.add(_createobjectaction.getNameExpression());
			children.addAll(_createobjectaction.getHandler());
			children.addAll(_createobjectaction.getLocalPostcondition());
			children.addAll(_createobjectaction.getLocalPrecondition());
			if(_createobjectaction.getResult() != null)
				children.add(_createobjectaction.getResult());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getSendSignalAction(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.SendSignalAction _sendsignalaction = (uml.SendSignalAction) obj;
			children.addAll(_sendsignalaction.getEAnnotations());
			children.addAll(_sendsignalaction.getOwnedComment());
			if(_sendsignalaction.getNameExpression() != null)
				children.add(_sendsignalaction.getNameExpression());
			children.addAll(_sendsignalaction.getHandler());
			children.addAll(_sendsignalaction.getLocalPostcondition());
			children.addAll(_sendsignalaction.getLocalPrecondition());
			children.addAll(_sendsignalaction.getArgument());
			if(_sendsignalaction.getTarget() != null)
				children.add(_sendsignalaction.getTarget());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAdditiveExpressionChild(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.expressions.AdditiveExpressionChild _additiveexpressionchild = (org.emftext.language.java.expressions.AdditiveExpressionChild) obj;
			children.addAll(_additiveexpressionchild.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArrayInstantiationByValuesUntyped(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.arrays.ArrayInstantiationByValuesUntyped _arrayinstantiationbyvaluesuntyped = (org.emftext.language.java.arrays.ArrayInstantiationByValuesUntyped) obj;
			children.addAll(_arrayinstantiationbyvaluesuntyped.getLayoutInformations());
			children.addAll(_arrayinstantiationbyvaluesuntyped.getTypeArguments());
			if(_arrayinstantiationbyvaluesuntyped.getNext() != null)
				children.add(_arrayinstantiationbyvaluesuntyped.getNext());
			children.addAll(_arrayinstantiationbyvaluesuntyped.getArraySelectors());
			if(_arrayinstantiationbyvaluesuntyped.getArrayInitializer() != null)
				children.add(_arrayinstantiationbyvaluesuntyped.getArrayInitializer());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getMessageEnd(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.MessageEnd _messageend = (uml.MessageEnd) obj;
			children.addAll(_messageend.getEAnnotations());
			children.addAll(_messageend.getOwnedComment());
			if(_messageend.getNameExpression() != null)
				children.add(_messageend.getNameExpression());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getAssignmentPlus(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.operators.AssignmentPlus _assignmentplus = (org.emftext.language.java.operators.AssignmentPlus) obj;
			children.addAll(_assignmentplus.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getControlNode(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.ControlNode _controlnode = (uml.ControlNode) obj;
			children.addAll(_controlnode.getEAnnotations());
			children.addAll(_controlnode.getOwnedComment());
			if(_controlnode.getNameExpression() != null)
				children.add(_controlnode.getNameExpression());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getStructuralFeatureAction(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.StructuralFeatureAction _structuralfeatureaction = (uml.StructuralFeatureAction) obj;
			children.addAll(_structuralfeatureaction.getEAnnotations());
			children.addAll(_structuralfeatureaction.getOwnedComment());
			if(_structuralfeatureaction.getNameExpression() != null)
				children.add(_structuralfeatureaction.getNameExpression());
			children.addAll(_structuralfeatureaction.getHandler());
			children.addAll(_structuralfeatureaction.getLocalPostcondition());
			children.addAll(_structuralfeatureaction.getLocalPrecondition());
			if(_structuralfeatureaction.getObject() != null)
				children.add(_structuralfeatureaction.getObject());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getCallAction(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.CallAction _callaction = (uml.CallAction) obj;
			children.addAll(_callaction.getEAnnotations());
			children.addAll(_callaction.getOwnedComment());
			if(_callaction.getNameExpression() != null)
				children.add(_callaction.getNameExpression());
			children.addAll(_callaction.getHandler());
			children.addAll(_callaction.getLocalPostcondition());
			children.addAll(_callaction.getLocalPrecondition());
			children.addAll(_callaction.getArgument());
			children.addAll(_callaction.getResult());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getOutputPin(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.OutputPin _outputpin = (uml.OutputPin) obj;
			children.addAll(_outputpin.getEAnnotations());
			children.addAll(_outputpin.getOwnedComment());
			if(_outputpin.getNameExpression() != null)
				children.add(_outputpin.getNameExpression());
			if(_outputpin.getUpperBound() != null)
				children.add(_outputpin.getUpperBound());
			if(_outputpin.getLowerValue() != null)
				children.add(_outputpin.getLowerValue());
			if(_outputpin.getUpperValue() != null)
				children.add(_outputpin.getUpperValue());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getStatementContainer(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.statements.StatementContainer _statementcontainer = (org.emftext.language.java.statements.StatementContainer) obj;
			children.addAll(_statementcontainer.getLayoutInformations());
			if(_statementcontainer.getStatement() != null)
				children.add(_statementcontainer.getStatement());
			return children;
		});
		explorationConsumer.put(Java2Uml.Java2UmlPackage.eINSTANCE.getJavaConstructorToOperation(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getSubstitution(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.Substitution _substitution = (uml.Substitution) obj;
			children.addAll(_substitution.getEAnnotations());
			children.addAll(_substitution.getOwnedComment());
			if(_substitution.getNameExpression() != null)
				children.add(_substitution.getNameExpression());
			if(_substitution.getMapping() != null)
				children.add(_substitution.getMapping());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getProtocolStateMachine(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.ProtocolStateMachine _protocolstatemachine = (uml.ProtocolStateMachine) obj;
			children.addAll(_protocolstatemachine.getEAnnotations());
			children.addAll(_protocolstatemachine.getOwnedComment());
			if(_protocolstatemachine.getNameExpression() != null)
				children.add(_protocolstatemachine.getNameExpression());
			children.addAll(_protocolstatemachine.getOwnedRule());
			children.addAll(_protocolstatemachine.getElementImport());
			children.addAll(_protocolstatemachine.getPackageImport());
			children.addAll(_protocolstatemachine.getTemplateBinding());
			if(_protocolstatemachine.getOwnedTemplateSignature() != null)
				children.add(_protocolstatemachine.getOwnedTemplateSignature());
			children.addAll(_protocolstatemachine.getCollaborationUse());
			children.addAll(_protocolstatemachine.getGeneralization());
			children.addAll(_protocolstatemachine.getOwnedUseCase());
			children.addAll(_protocolstatemachine.getSubstitution());
			children.addAll(_protocolstatemachine.getOwnedAttribute());
			children.addAll(_protocolstatemachine.getOwnedConnector());
			children.addAll(_protocolstatemachine.getInterfaceRealization());
			children.addAll(_protocolstatemachine.getOwnedBehavior());
			children.addAll(_protocolstatemachine.getOwnedOperation());
			children.addAll(_protocolstatemachine.getNestedClassifier());
			children.addAll(_protocolstatemachine.getOwnedReception());
			children.addAll(_protocolstatemachine.getOwnedParameter());
			children.addAll(_protocolstatemachine.getOwnedParameterSet());
			children.addAll(_protocolstatemachine.getConnectionPoint());
			children.addAll(_protocolstatemachine.getRegion());
			children.addAll(_protocolstatemachine.getConformance());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getCentralBufferNode(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.CentralBufferNode _centralbuffernode = (uml.CentralBufferNode) obj;
			children.addAll(_centralbuffernode.getEAnnotations());
			children.addAll(_centralbuffernode.getOwnedComment());
			if(_centralbuffernode.getNameExpression() != null)
				children.add(_centralbuffernode.getNameExpression());
			if(_centralbuffernode.getUpperBound() != null)
				children.add(_centralbuffernode.getUpperBound());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getAssociationClass(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.AssociationClass _associationclass = (uml.AssociationClass) obj;
			children.addAll(_associationclass.getEAnnotations());
			children.addAll(_associationclass.getOwnedComment());
			if(_associationclass.getNameExpression() != null)
				children.add(_associationclass.getNameExpression());
			children.addAll(_associationclass.getOwnedRule());
			children.addAll(_associationclass.getElementImport());
			children.addAll(_associationclass.getPackageImport());
			children.addAll(_associationclass.getTemplateBinding());
			if(_associationclass.getOwnedTemplateSignature() != null)
				children.add(_associationclass.getOwnedTemplateSignature());
			children.addAll(_associationclass.getCollaborationUse());
			children.addAll(_associationclass.getGeneralization());
			children.addAll(_associationclass.getOwnedUseCase());
			children.addAll(_associationclass.getSubstitution());
			children.addAll(_associationclass.getOwnedAttribute());
			children.addAll(_associationclass.getOwnedConnector());
			children.addAll(_associationclass.getInterfaceRealization());
			children.addAll(_associationclass.getOwnedBehavior());
			children.addAll(_associationclass.getOwnedOperation());
			children.addAll(_associationclass.getNestedClassifier());
			children.addAll(_associationclass.getOwnedReception());
			children.addAll(_associationclass.getOwnedEnd());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getOpaqueAction(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.OpaqueAction _opaqueaction = (uml.OpaqueAction) obj;
			children.addAll(_opaqueaction.getEAnnotations());
			children.addAll(_opaqueaction.getOwnedComment());
			if(_opaqueaction.getNameExpression() != null)
				children.add(_opaqueaction.getNameExpression());
			children.addAll(_opaqueaction.getHandler());
			children.addAll(_opaqueaction.getLocalPostcondition());
			children.addAll(_opaqueaction.getLocalPrecondition());
			children.addAll(_opaqueaction.getInputValue());
			children.addAll(_opaqueaction.getOutputValue());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.types.TypesPackage.eINSTANCE.getShort(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.types.Short _short = (org.emftext.language.java.types.Short) obj;
			children.addAll(_short.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getActionInputPin(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.ActionInputPin _actioninputpin = (uml.ActionInputPin) obj;
			children.addAll(_actioninputpin.getEAnnotations());
			children.addAll(_actioninputpin.getOwnedComment());
			if(_actioninputpin.getNameExpression() != null)
				children.add(_actioninputpin.getNameExpression());
			if(_actioninputpin.getUpperBound() != null)
				children.add(_actioninputpin.getUpperBound());
			if(_actioninputpin.getLowerValue() != null)
				children.add(_actioninputpin.getLowerValue());
			if(_actioninputpin.getUpperValue() != null)
				children.add(_actioninputpin.getUpperValue());
			if(_actioninputpin.getFromAction() != null)
				children.add(_actioninputpin.getFromAction());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getPartDecomposition(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.PartDecomposition _partdecomposition = (uml.PartDecomposition) obj;
			children.addAll(_partdecomposition.getEAnnotations());
			children.addAll(_partdecomposition.getOwnedComment());
			if(_partdecomposition.getNameExpression() != null)
				children.add(_partdecomposition.getNameExpression());
			children.addAll(_partdecomposition.getGeneralOrdering());
			children.addAll(_partdecomposition.getActualGate());
			children.addAll(_partdecomposition.getArgument());
			if(_partdecomposition.getReturnValue() != null)
				children.add(_partdecomposition.getReturnValue());
			return children;
		});
		explorationConsumer.put(runtime.impl.RuntimePackageImpl.eINSTANCE.getProtocol(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			runtime.Protocol _protocol = (runtime.Protocol) obj;
			children.addAll(_protocol.getSteps());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getOperation(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.Operation _operation = (uml.Operation) obj;
			children.addAll(_operation.getEAnnotations());
			children.addAll(_operation.getOwnedComment());
			if(_operation.getNameExpression() != null)
				children.add(_operation.getNameExpression());
			children.addAll(_operation.getOwnedRule());
			children.addAll(_operation.getElementImport());
			children.addAll(_operation.getPackageImport());
			children.addAll(_operation.getOwnedParameter());
			children.addAll(_operation.getOwnedParameterSet());
			children.addAll(_operation.getTemplateBinding());
			if(_operation.getOwnedTemplateSignature() != null)
				children.add(_operation.getOwnedTemplateSignature());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getPrimitiveType(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.PrimitiveType _primitivetype = (uml.PrimitiveType) obj;
			children.addAll(_primitivetype.getEAnnotations());
			children.addAll(_primitivetype.getOwnedComment());
			if(_primitivetype.getNameExpression() != null)
				children.add(_primitivetype.getNameExpression());
			children.addAll(_primitivetype.getOwnedRule());
			children.addAll(_primitivetype.getElementImport());
			children.addAll(_primitivetype.getPackageImport());
			children.addAll(_primitivetype.getTemplateBinding());
			if(_primitivetype.getOwnedTemplateSignature() != null)
				children.add(_primitivetype.getOwnedTemplateSignature());
			children.addAll(_primitivetype.getCollaborationUse());
			children.addAll(_primitivetype.getGeneralization());
			children.addAll(_primitivetype.getOwnedUseCase());
			children.addAll(_primitivetype.getSubstitution());
			children.addAll(_primitivetype.getOwnedAttribute());
			children.addAll(_primitivetype.getOwnedOperation());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArraySelector(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.arrays.ArraySelector _arrayselector = (org.emftext.language.java.arrays.ArraySelector) obj;
			children.addAll(_arrayselector.getLayoutInformations());
			if(_arrayselector.getPosition() != null)
				children.add(_arrayselector.getPosition());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getReclassifyObjectAction(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.ReclassifyObjectAction _reclassifyobjectaction = (uml.ReclassifyObjectAction) obj;
			children.addAll(_reclassifyobjectaction.getEAnnotations());
			children.addAll(_reclassifyobjectaction.getOwnedComment());
			if(_reclassifyobjectaction.getNameExpression() != null)
				children.add(_reclassifyobjectaction.getNameExpression());
			children.addAll(_reclassifyobjectaction.getHandler());
			children.addAll(_reclassifyobjectaction.getLocalPostcondition());
			children.addAll(_reclassifyobjectaction.getLocalPrecondition());
			if(_reclassifyobjectaction.getObject() != null)
				children.add(_reclassifyobjectaction.getObject());
			return children;
		});
		explorationConsumer.put(org.eclipse.emf.ecore.EcorePackage.eINSTANCE.getENamedElement(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.emf.ecore.ENamedElement _enamedelement = (org.eclipse.emf.ecore.ENamedElement) obj;
			children.addAll(_enamedelement.getEAnnotations());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.types.TypesPackage.eINSTANCE.getTypeReference(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.types.TypeReference _typereference = (org.emftext.language.java.types.TypeReference) obj;
			children.addAll(_typereference.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getActivityPartition(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.ActivityPartition _activitypartition = (uml.ActivityPartition) obj;
			children.addAll(_activitypartition.getEAnnotations());
			children.addAll(_activitypartition.getOwnedComment());
			if(_activitypartition.getNameExpression() != null)
				children.add(_activitypartition.getNameExpression());
			children.addAll(_activitypartition.getSubpartition());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getSwitchCase(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.statements.SwitchCase _switchcase = (org.emftext.language.java.statements.SwitchCase) obj;
			children.addAll(_switchcase.getLayoutInformations());
			children.addAll(_switchcase.getStatements());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getReception(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.Reception _reception = (uml.Reception) obj;
			children.addAll(_reception.getEAnnotations());
			children.addAll(_reception.getOwnedComment());
			if(_reception.getNameExpression() != null)
				children.add(_reception.getNameExpression());
			children.addAll(_reception.getOwnedRule());
			children.addAll(_reception.getElementImport());
			children.addAll(_reception.getPackageImport());
			children.addAll(_reception.getOwnedParameter());
			children.addAll(_reception.getOwnedParameterSet());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getConnectableElementTemplateParameter(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.ConnectableElementTemplateParameter _connectableelementtemplateparameter = (uml.ConnectableElementTemplateParameter) obj;
			children.addAll(_connectableelementtemplateparameter.getEAnnotations());
			children.addAll(_connectableelementtemplateparameter.getOwnedComment());
			if(_connectableelementtemplateparameter.getOwnedDefault() != null)
				children.add(_connectableelementtemplateparameter.getOwnedDefault());
			if(_connectableelementtemplateparameter.getOwnedParameteredElement() != null)
				children.add(_connectableelementtemplateparameter.getOwnedParameteredElement());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getRedefinableElement(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.RedefinableElement _redefinableelement = (uml.RedefinableElement) obj;
			children.addAll(_redefinableelement.getEAnnotations());
			children.addAll(_redefinableelement.getOwnedComment());
			if(_redefinableelement.getNameExpression() != null)
				children.add(_redefinableelement.getNameExpression());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.modifiers.ModifiersPackage.eINSTANCE.getModifier(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.modifiers.Modifier _modifier = (org.emftext.language.java.modifiers.Modifier) obj;
			children.addAll(_modifier.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getExpressionStatement(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.statements.ExpressionStatement _expressionstatement = (org.emftext.language.java.statements.ExpressionStatement) obj;
			children.addAll(_expressionstatement.getLayoutInformations());
			if(_expressionstatement.getExpression() != null)
				children.add(_expressionstatement.getExpression());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.types.TypesPackage.eINSTANCE.getDouble(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.types.Double _double = (org.emftext.language.java.types.Double) obj;
			children.addAll(_double.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getTypedElement(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.TypedElement _typedelement = (uml.TypedElement) obj;
			children.addAll(_typedelement.getEAnnotations());
			children.addAll(_typedelement.getOwnedComment());
			if(_typedelement.getNameExpression() != null)
				children.add(_typedelement.getNameExpression());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getExtensionPoint(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.ExtensionPoint _extensionpoint = (uml.ExtensionPoint) obj;
			children.addAll(_extensionpoint.getEAnnotations());
			children.addAll(_extensionpoint.getOwnedComment());
			if(_extensionpoint.getNameExpression() != null)
				children.add(_extensionpoint.getNameExpression());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getConstraint(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.Constraint _constraint = (uml.Constraint) obj;
			children.addAll(_constraint.getEAnnotations());
			children.addAll(_constraint.getOwnedComment());
			if(_constraint.getNameExpression() != null)
				children.add(_constraint.getNameExpression());
			if(_constraint.getSpecification() != null)
				children.add(_constraint.getSpecification());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.modifiers.ModifiersPackage.eINSTANCE.getAbstract(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.modifiers.Abstract _abstract = (org.emftext.language.java.modifiers.Abstract) obj;
			children.addAll(_abstract.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getTryBlock(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.statements.TryBlock _tryblock = (org.emftext.language.java.statements.TryBlock) obj;
			children.addAll(_tryblock.getLayoutInformations());
			children.addAll(_tryblock.getStatements());
			children.addAll(_tryblock.getCatcheBlocks());
			if(_tryblock.getFinallyBlock() != null)
				children.add(_tryblock.getFinallyBlock());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getExecutionOccurrenceSpecification(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.ExecutionOccurrenceSpecification _executionoccurrencespecification = (uml.ExecutionOccurrenceSpecification) obj;
			children.addAll(_executionoccurrencespecification.getEAnnotations());
			children.addAll(_executionoccurrencespecification.getOwnedComment());
			if(_executionoccurrencespecification.getNameExpression() != null)
				children.add(_executionoccurrencespecification.getNameExpression());
			children.addAll(_executionoccurrencespecification.getGeneralOrdering());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getConditional(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.statements.Conditional _conditional = (org.emftext.language.java.statements.Conditional) obj;
			children.addAll(_conditional.getLayoutInformations());
			if(_conditional.getCondition() != null)
				children.add(_conditional.getCondition());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getConnectorEnd(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.ConnectorEnd _connectorend = (uml.ConnectorEnd) obj;
			children.addAll(_connectorend.getEAnnotations());
			children.addAll(_connectorend.getOwnedComment());
			if(_connectorend.getLowerValue() != null)
				children.add(_connectorend.getLowerValue());
			if(_connectorend.getUpperValue() != null)
				children.add(_connectorend.getUpperValue());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getIntervalConstraint(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.IntervalConstraint _intervalconstraint = (uml.IntervalConstraint) obj;
			children.addAll(_intervalconstraint.getEAnnotations());
			children.addAll(_intervalconstraint.getOwnedComment());
			if(_intervalconstraint.getNameExpression() != null)
				children.add(_intervalconstraint.getNameExpression());
			if(_intervalconstraint.getSpecification() != null)
				children.add(_intervalconstraint.getSpecification());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.types.TypesPackage.eINSTANCE.getNamespaceClassifierReference(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.types.NamespaceClassifierReference _namespaceclassifierreference = (org.emftext.language.java.types.NamespaceClassifierReference) obj;
			children.addAll(_namespaceclassifierreference.getLayoutInformations());
			children.addAll(_namespaceclassifierreference.getClassifierReferences());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getDeploymentTarget(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.DeploymentTarget _deploymenttarget = (uml.DeploymentTarget) obj;
			children.addAll(_deploymenttarget.getEAnnotations());
			children.addAll(_deploymenttarget.getOwnedComment());
			if(_deploymenttarget.getNameExpression() != null)
				children.add(_deploymenttarget.getNameExpression());
			children.addAll(_deploymenttarget.getDeployment());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getStartObjectBehaviorAction(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.StartObjectBehaviorAction _startobjectbehavioraction = (uml.StartObjectBehaviorAction) obj;
			children.addAll(_startobjectbehavioraction.getEAnnotations());
			children.addAll(_startobjectbehavioraction.getOwnedComment());
			if(_startobjectbehavioraction.getNameExpression() != null)
				children.add(_startobjectbehavioraction.getNameExpression());
			children.addAll(_startobjectbehavioraction.getHandler());
			children.addAll(_startobjectbehavioraction.getLocalPostcondition());
			children.addAll(_startobjectbehavioraction.getLocalPrecondition());
			children.addAll(_startobjectbehavioraction.getArgument());
			children.addAll(_startobjectbehavioraction.getResult());
			if(_startobjectbehavioraction.getObject() != null)
				children.add(_startobjectbehavioraction.getObject());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getInteractionUse(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.InteractionUse _interactionuse = (uml.InteractionUse) obj;
			children.addAll(_interactionuse.getEAnnotations());
			children.addAll(_interactionuse.getOwnedComment());
			if(_interactionuse.getNameExpression() != null)
				children.add(_interactionuse.getNameExpression());
			children.addAll(_interactionuse.getGeneralOrdering());
			children.addAll(_interactionuse.getActualGate());
			children.addAll(_interactionuse.getArgument());
			if(_interactionuse.getReturnValue() != null)
				children.add(_interactionuse.getReturnValue());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getClearVariableAction(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.ClearVariableAction _clearvariableaction = (uml.ClearVariableAction) obj;
			children.addAll(_clearvariableaction.getEAnnotations());
			children.addAll(_clearvariableaction.getOwnedComment());
			if(_clearvariableaction.getNameExpression() != null)
				children.add(_clearvariableaction.getNameExpression());
			children.addAll(_clearvariableaction.getHandler());
			children.addAll(_clearvariableaction.getLocalPostcondition());
			children.addAll(_clearvariableaction.getLocalPrecondition());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getExecutionEnvironment(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.ExecutionEnvironment _executionenvironment = (uml.ExecutionEnvironment) obj;
			children.addAll(_executionenvironment.getEAnnotations());
			children.addAll(_executionenvironment.getOwnedComment());
			if(_executionenvironment.getNameExpression() != null)
				children.add(_executionenvironment.getNameExpression());
			children.addAll(_executionenvironment.getOwnedRule());
			children.addAll(_executionenvironment.getElementImport());
			children.addAll(_executionenvironment.getPackageImport());
			children.addAll(_executionenvironment.getTemplateBinding());
			if(_executionenvironment.getOwnedTemplateSignature() != null)
				children.add(_executionenvironment.getOwnedTemplateSignature());
			children.addAll(_executionenvironment.getCollaborationUse());
			children.addAll(_executionenvironment.getGeneralization());
			children.addAll(_executionenvironment.getOwnedUseCase());
			children.addAll(_executionenvironment.getSubstitution());
			children.addAll(_executionenvironment.getOwnedAttribute());
			children.addAll(_executionenvironment.getOwnedConnector());
			children.addAll(_executionenvironment.getInterfaceRealization());
			children.addAll(_executionenvironment.getOwnedBehavior());
			children.addAll(_executionenvironment.getOwnedOperation());
			children.addAll(_executionenvironment.getNestedClassifier());
			children.addAll(_executionenvironment.getOwnedReception());
			children.addAll(_executionenvironment.getDeployment());
			children.addAll(_executionenvironment.getNestedNode());
			return children;
		});
		explorationConsumer.put(Java2Uml.Java2UmlPackage.eINSTANCE.getMethodClassParamTypeToParamType__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getUnaryModificationExpressionChild(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.expressions.UnaryModificationExpressionChild _unarymodificationexpressionchild = (org.emftext.language.java.expressions.UnaryModificationExpressionChild) obj;
			children.addAll(_unarymodificationexpressionchild.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(runtime.impl.RuntimePackageImpl.eINSTANCE.getTGGRuleApplication(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getInteractionOperand(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.InteractionOperand _interactionoperand = (uml.InteractionOperand) obj;
			children.addAll(_interactionoperand.getEAnnotations());
			children.addAll(_interactionoperand.getOwnedComment());
			if(_interactionoperand.getNameExpression() != null)
				children.add(_interactionoperand.getNameExpression());
			children.addAll(_interactionoperand.getOwnedRule());
			children.addAll(_interactionoperand.getElementImport());
			children.addAll(_interactionoperand.getPackageImport());
			children.addAll(_interactionoperand.getGeneralOrdering());
			children.addAll(_interactionoperand.getFragment());
			if(_interactionoperand.getGuard() != null)
				children.add(_interactionoperand.getGuard());
			return children;
		});
		explorationConsumer.put(org.eclipse.emf.ecore.EcorePackage.eINSTANCE.getETypeParameter(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.emf.ecore.ETypeParameter _etypeparameter = (org.eclipse.emf.ecore.ETypeParameter) obj;
			children.addAll(_etypeparameter.getEAnnotations());
			children.addAll(_etypeparameter.getEBounds());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getInstanceOfExpressionChild(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.expressions.InstanceOfExpressionChild _instanceofexpressionchild = (org.emftext.language.java.expressions.InstanceOfExpressionChild) obj;
			children.addAll(_instanceofexpressionchild.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getMessageOccurrenceSpecification(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.MessageOccurrenceSpecification _messageoccurrencespecification = (uml.MessageOccurrenceSpecification) obj;
			children.addAll(_messageoccurrencespecification.getEAnnotations());
			children.addAll(_messageoccurrencespecification.getOwnedComment());
			if(_messageoccurrencespecification.getNameExpression() != null)
				children.add(_messageoccurrencespecification.getNameExpression());
			children.addAll(_messageoccurrencespecification.getGeneralOrdering());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.literals.LiteralsPackage.eINSTANCE.getDecimalIntegerLiteral(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.literals.DecimalIntegerLiteral _decimalintegerliteral = (org.emftext.language.java.literals.DecimalIntegerLiteral) obj;
			children.addAll(_decimalintegerliteral.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.annotations.AnnotationsPackage.eINSTANCE.getAnnotationValue(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.annotations.AnnotationValue _annotationvalue = (org.emftext.language.java.annotations.AnnotationValue) obj;
			children.addAll(_annotationvalue.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getDeploymentSpecification(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.DeploymentSpecification _deploymentspecification = (uml.DeploymentSpecification) obj;
			children.addAll(_deploymentspecification.getEAnnotations());
			children.addAll(_deploymentspecification.getOwnedComment());
			if(_deploymentspecification.getNameExpression() != null)
				children.add(_deploymentspecification.getNameExpression());
			children.addAll(_deploymentspecification.getOwnedRule());
			children.addAll(_deploymentspecification.getElementImport());
			children.addAll(_deploymentspecification.getPackageImport());
			children.addAll(_deploymentspecification.getTemplateBinding());
			if(_deploymentspecification.getOwnedTemplateSignature() != null)
				children.add(_deploymentspecification.getOwnedTemplateSignature());
			children.addAll(_deploymentspecification.getCollaborationUse());
			children.addAll(_deploymentspecification.getGeneralization());
			children.addAll(_deploymentspecification.getOwnedUseCase());
			children.addAll(_deploymentspecification.getSubstitution());
			children.addAll(_deploymentspecification.getManifestation());
			children.addAll(_deploymentspecification.getNestedArtifact());
			children.addAll(_deploymentspecification.getOwnedAttribute());
			children.addAll(_deploymentspecification.getOwnedOperation());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getExpressionList(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.expressions.ExpressionList _expressionlist = (org.emftext.language.java.expressions.ExpressionList) obj;
			children.addAll(_expressionlist.getLayoutInformations());
			children.addAll(_expressionlist.getExpressions());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getCollaborationUse(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.CollaborationUse _collaborationuse = (uml.CollaborationUse) obj;
			children.addAll(_collaborationuse.getEAnnotations());
			children.addAll(_collaborationuse.getOwnedComment());
			if(_collaborationuse.getNameExpression() != null)
				children.add(_collaborationuse.getNameExpression());
			children.addAll(_collaborationuse.getRoleBinding());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getBlock(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.statements.Block _block = (org.emftext.language.java.statements.Block) obj;
			children.addAll(_block.getLayoutInformations());
			children.addAll(_block.getStatements());
			children.addAll(_block.getModifiers());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.literals.LiteralsPackage.eINSTANCE.getDecimalDoubleLiteral(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.literals.DecimalDoubleLiteral _decimaldoubleliteral = (org.emftext.language.java.literals.DecimalDoubleLiteral) obj;
			children.addAll(_decimaldoubleliteral.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getValuePin(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.ValuePin _valuepin = (uml.ValuePin) obj;
			children.addAll(_valuepin.getEAnnotations());
			children.addAll(_valuepin.getOwnedComment());
			if(_valuepin.getNameExpression() != null)
				children.add(_valuepin.getNameExpression());
			if(_valuepin.getUpperBound() != null)
				children.add(_valuepin.getUpperBound());
			if(_valuepin.getLowerValue() != null)
				children.add(_valuepin.getLowerValue());
			if(_valuepin.getUpperValue() != null)
				children.add(_valuepin.getUpperValue());
			if(_valuepin.getValue() != null)
				children.add(_valuepin.getValue());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.imports.ImportsPackage.eINSTANCE.getImportingElement(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.imports.ImportingElement _importingelement = (org.emftext.language.java.imports.ImportingElement) obj;
			children.addAll(_importingelement.getLayoutInformations());
			children.addAll(_importingelement.getImports());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getUnaryExpressionChild(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.expressions.UnaryExpressionChild _unaryexpressionchild = (org.emftext.language.java.expressions.UnaryExpressionChild) obj;
			children.addAll(_unaryexpressionchild.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getRemainder(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.operators.Remainder _remainder = (org.emftext.language.java.operators.Remainder) obj;
			children.addAll(_remainder.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getReadLinkAction(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.ReadLinkAction _readlinkaction = (uml.ReadLinkAction) obj;
			children.addAll(_readlinkaction.getEAnnotations());
			children.addAll(_readlinkaction.getOwnedComment());
			if(_readlinkaction.getNameExpression() != null)
				children.add(_readlinkaction.getNameExpression());
			children.addAll(_readlinkaction.getHandler());
			children.addAll(_readlinkaction.getLocalPostcondition());
			children.addAll(_readlinkaction.getLocalPrecondition());
			children.addAll(_readlinkaction.getEndData());
			children.addAll(_readlinkaction.getInputValue());
			if(_readlinkaction.getResult() != null)
				children.add(_readlinkaction.getResult());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getSynchronizedBlock(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.statements.SynchronizedBlock _synchronizedblock = (org.emftext.language.java.statements.SynchronizedBlock) obj;
			children.addAll(_synchronizedblock.getLayoutInformations());
			children.addAll(_synchronizedblock.getStatements());
			if(_synchronizedblock.getLockProvider() != null)
				children.add(_synchronizedblock.getLockProvider());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.references.ReferencesPackage.eINSTANCE.getPackageReference(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.references.PackageReference _packagereference = (org.emftext.language.java.references.PackageReference) obj;
			children.addAll(_packagereference.getLayoutInformations());
			children.addAll(_packagereference.getSubpackages());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.generics.GenericsPackage.eINSTANCE.getTypeArgument(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.generics.TypeArgument _typeargument = (org.emftext.language.java.generics.TypeArgument) obj;
			children.addAll(_typeargument.getLayoutInformations());
			children.addAll(_typeargument.getArrayDimensionsBefore());
			children.addAll(_typeargument.getArrayDimensionsAfter());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getInterruptibleActivityRegion(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.InterruptibleActivityRegion _interruptibleactivityregion = (uml.InterruptibleActivityRegion) obj;
			children.addAll(_interruptibleactivityregion.getEAnnotations());
			children.addAll(_interruptibleactivityregion.getOwnedComment());
			if(_interruptibleactivityregion.getNameExpression() != null)
				children.add(_interruptibleactivityregion.getNameExpression());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getObservation(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.Observation _observation = (uml.Observation) obj;
			children.addAll(_observation.getEAnnotations());
			children.addAll(_observation.getOwnedComment());
			if(_observation.getNameExpression() != null)
				children.add(_observation.getNameExpression());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getPlusPlus(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.operators.PlusPlus _plusplus = (org.emftext.language.java.operators.PlusPlus) obj;
			children.addAll(_plusplus.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.members.MembersPackage.eINSTANCE.getConstructor(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.members.Constructor _constructor = (org.emftext.language.java.members.Constructor) obj;
			children.addAll(_constructor.getLayoutInformations());
			children.addAll(_constructor.getStatements());
			children.addAll(_constructor.getParameters());
			children.addAll(_constructor.getTypeParameters());
			children.addAll(_constructor.getExceptions());
			children.addAll(_constructor.getAnnotationsAndModifiers());
			return children;
		});
		explorationConsumer.put(Java2Uml.Java2UmlPackage.eINSTANCE.getMethodClassReturnTypeToReturnType__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getForLoopInitializer(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.statements.ForLoopInitializer _forloopinitializer = (org.emftext.language.java.statements.ForLoopInitializer) obj;
			children.addAll(_forloopinitializer.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.types.TypesPackage.eINSTANCE.getLong(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.types.Long _long = (org.emftext.language.java.types.Long) obj;
			children.addAll(_long.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(Java2Uml.Java2UmlPackage.eINSTANCE.getEnumPrivateToPrivate__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getThrow(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.statements.Throw _throw = (org.emftext.language.java.statements.Throw) obj;
			children.addAll(_throw.getLayoutInformations());
			if(_throw.getThrowable() != null)
				children.add(_throw.getThrowable());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.references.ReferencesPackage.eINSTANCE.getSelfReference(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.references.SelfReference _selfreference = (org.emftext.language.java.references.SelfReference) obj;
			children.addAll(_selfreference.getLayoutInformations());
			children.addAll(_selfreference.getTypeArguments());
			if(_selfreference.getNext() != null)
				children.add(_selfreference.getNext());
			children.addAll(_selfreference.getArraySelectors());
			if(_selfreference.getSelf() != null)
				children.add(_selfreference.getSelf());
			return children;
		});
		explorationConsumer.put(org.eclipse.emf.ecore.EcorePackage.eINSTANCE.getEEnumLiteral(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.emf.ecore.EEnumLiteral _eenumliteral = (org.eclipse.emf.ecore.EEnumLiteral) obj;
			children.addAll(_eenumliteral.getEAnnotations());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getTimeObservation(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.TimeObservation _timeobservation = (uml.TimeObservation) obj;
			children.addAll(_timeobservation.getEAnnotations());
			children.addAll(_timeobservation.getOwnedComment());
			if(_timeobservation.getNameExpression() != null)
				children.add(_timeobservation.getNameExpression());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getSubtraction(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.operators.Subtraction _subtraction = (org.emftext.language.java.operators.Subtraction) obj;
			children.addAll(_subtraction.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.literals.LiteralsPackage.eINSTANCE.getDoubleLiteral(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.literals.DoubleLiteral _doubleliteral = (org.emftext.language.java.literals.DoubleLiteral) obj;
			children.addAll(_doubleliteral.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAssignmentExpression(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.expressions.AssignmentExpression _assignmentexpression = (org.emftext.language.java.expressions.AssignmentExpression) obj;
			children.addAll(_assignmentexpression.getLayoutInformations());
			if(_assignmentexpression.getChild() != null)
				children.add(_assignmentexpression.getChild());
			if(_assignmentexpression.getAssignmentOperator() != null)
				children.add(_assignmentexpression.getAssignmentOperator());
			if(_assignmentexpression.getValue() != null)
				children.add(_assignmentexpression.getValue());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getRelationExpression(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.expressions.RelationExpression _relationexpression = (org.emftext.language.java.expressions.RelationExpression) obj;
			children.addAll(_relationexpression.getLayoutInformations());
			children.addAll(_relationexpression.getChildren());
			children.addAll(_relationexpression.getRelationOperators());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getLoopNode(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.LoopNode _loopnode = (uml.LoopNode) obj;
			children.addAll(_loopnode.getEAnnotations());
			children.addAll(_loopnode.getOwnedComment());
			if(_loopnode.getNameExpression() != null)
				children.add(_loopnode.getNameExpression());
			children.addAll(_loopnode.getHandler());
			children.addAll(_loopnode.getLocalPostcondition());
			children.addAll(_loopnode.getLocalPrecondition());
			children.addAll(_loopnode.getOwnedRule());
			children.addAll(_loopnode.getElementImport());
			children.addAll(_loopnode.getPackageImport());
			children.addAll(_loopnode.getEdge());
			children.addAll(_loopnode.getStructuredNodeInput());
			children.addAll(_loopnode.getStructuredNodeOutput());
			children.addAll(_loopnode.getVariable());
			children.addAll(_loopnode.getNode());
			children.addAll(_loopnode.getLoopVariable());
			children.addAll(_loopnode.getLoopVariableInput());
			children.addAll(_loopnode.getResult());
			return children;
		});
		explorationConsumer.put(org.eclipse.emf.ecore.EcorePackage.eINSTANCE.getEPackage(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.emf.ecore.EPackage _epackage = (org.eclipse.emf.ecore.EPackage) obj;
			children.addAll(_epackage.getEAnnotations());
			children.addAll(_epackage.getEClassifiers());
			children.addAll(_epackage.getESubpackages());
			return children;
		});
		explorationConsumer.put(Java2Uml.Java2UmlPackage.eINSTANCE.getJavaTypeReferenceToUmlReturnParameter(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getSequenceNode(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.SequenceNode _sequencenode = (uml.SequenceNode) obj;
			children.addAll(_sequencenode.getEAnnotations());
			children.addAll(_sequencenode.getOwnedComment());
			if(_sequencenode.getNameExpression() != null)
				children.add(_sequencenode.getNameExpression());
			children.addAll(_sequencenode.getHandler());
			children.addAll(_sequencenode.getLocalPostcondition());
			children.addAll(_sequencenode.getLocalPrecondition());
			children.addAll(_sequencenode.getOwnedRule());
			children.addAll(_sequencenode.getElementImport());
			children.addAll(_sequencenode.getPackageImport());
			children.addAll(_sequencenode.getEdge());
			children.addAll(_sequencenode.getStructuredNodeInput());
			children.addAll(_sequencenode.getStructuredNodeOutput());
			children.addAll(_sequencenode.getVariable());
			children.addAll(_sequencenode.getNode());
			children.addAll(_sequencenode.getExecutableNode());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getFinalNode(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.FinalNode _finalnode = (uml.FinalNode) obj;
			children.addAll(_finalnode.getEAnnotations());
			children.addAll(_finalnode.getOwnedComment());
			if(_finalnode.getNameExpression() != null)
				children.add(_finalnode.getNameExpression());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getOpaqueExpression(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.OpaqueExpression _opaqueexpression = (uml.OpaqueExpression) obj;
			children.addAll(_opaqueexpression.getEAnnotations());
			children.addAll(_opaqueexpression.getOwnedComment());
			if(_opaqueexpression.getNameExpression() != null)
				children.add(_opaqueexpression.getNameExpression());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getTemplateParameter(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.TemplateParameter _templateparameter = (uml.TemplateParameter) obj;
			children.addAll(_templateparameter.getEAnnotations());
			children.addAll(_templateparameter.getOwnedComment());
			if(_templateparameter.getOwnedDefault() != null)
				children.add(_templateparameter.getOwnedDefault());
			if(_templateparameter.getOwnedParameteredElement() != null)
				children.add(_templateparameter.getOwnedParameteredElement());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getArtifact(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.Artifact _artifact = (uml.Artifact) obj;
			children.addAll(_artifact.getEAnnotations());
			children.addAll(_artifact.getOwnedComment());
			if(_artifact.getNameExpression() != null)
				children.add(_artifact.getNameExpression());
			children.addAll(_artifact.getOwnedRule());
			children.addAll(_artifact.getElementImport());
			children.addAll(_artifact.getPackageImport());
			children.addAll(_artifact.getTemplateBinding());
			if(_artifact.getOwnedTemplateSignature() != null)
				children.add(_artifact.getOwnedTemplateSignature());
			children.addAll(_artifact.getCollaborationUse());
			children.addAll(_artifact.getGeneralization());
			children.addAll(_artifact.getOwnedUseCase());
			children.addAll(_artifact.getSubstitution());
			children.addAll(_artifact.getManifestation());
			children.addAll(_artifact.getNestedArtifact());
			children.addAll(_artifact.getOwnedAttribute());
			children.addAll(_artifact.getOwnedOperation());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getExpression(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.Expression _expression = (uml.Expression) obj;
			children.addAll(_expression.getEAnnotations());
			children.addAll(_expression.getOwnedComment());
			if(_expression.getNameExpression() != null)
				children.add(_expression.getNameExpression());
			children.addAll(_expression.getOperand());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getFlowFinalNode(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.FlowFinalNode _flowfinalnode = (uml.FlowFinalNode) obj;
			children.addAll(_flowfinalnode.getEAnnotations());
			children.addAll(_flowfinalnode.getOwnedComment());
			if(_flowfinalnode.getNameExpression() != null)
				children.add(_flowfinalnode.getNameExpression());
			return children;
		});
		explorationConsumer.put(Java2Uml.Java2UmlPackage.eINSTANCE.getClassPublicToPublic__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(Java2Uml.Java2UmlPackage.eINSTANCE.getMethodFinalToFinal__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getTransition(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.Transition _transition = (uml.Transition) obj;
			children.addAll(_transition.getEAnnotations());
			children.addAll(_transition.getOwnedComment());
			if(_transition.getNameExpression() != null)
				children.add(_transition.getNameExpression());
			children.addAll(_transition.getOwnedRule());
			children.addAll(_transition.getElementImport());
			children.addAll(_transition.getPackageImport());
			if(_transition.getEffect() != null)
				children.add(_transition.getEffect());
			children.addAll(_transition.getTrigger());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getAssignmentOperator(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.operators.AssignmentOperator _assignmentoperator = (org.emftext.language.java.operators.AssignmentOperator) obj;
			children.addAll(_assignmentoperator.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(Java2Uml.Java2UmlPackage.eINSTANCE.getSuperClassToSuperClass__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(Java2Uml.Java2UmlPackage.eINSTANCE.getOrdinaryConstructorParameterToParameter__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getPackage(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.Package _package = (uml.Package) obj;
			children.addAll(_package.getEAnnotations());
			children.addAll(_package.getOwnedComment());
			if(_package.getNameExpression() != null)
				children.add(_package.getNameExpression());
			children.addAll(_package.getOwnedRule());
			children.addAll(_package.getElementImport());
			children.addAll(_package.getPackageImport());
			children.addAll(_package.getTemplateBinding());
			if(_package.getOwnedTemplateSignature() != null)
				children.add(_package.getOwnedTemplateSignature());
			children.addAll(_package.getPackageMerge());
			children.addAll(_package.getPackagedElement());
			children.addAll(_package.getProfileApplication());
			return children;
		});
		explorationConsumer.put(org.eclipse.emf.ecore.EcorePackage.eINSTANCE.getEEnum(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.emf.ecore.EEnum _eenum = (org.eclipse.emf.ecore.EEnum) obj;
			children.addAll(_eenum.getEAnnotations());
			children.addAll(_eenum.getETypeParameters());
			children.addAll(_eenum.getELiterals());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getComponentRealization(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.ComponentRealization _componentrealization = (uml.ComponentRealization) obj;
			children.addAll(_componentrealization.getEAnnotations());
			children.addAll(_componentrealization.getOwnedComment());
			if(_componentrealization.getNameExpression() != null)
				children.add(_componentrealization.getNameExpression());
			if(_componentrealization.getMapping() != null)
				children.add(_componentrealization.getMapping());
			return children;
		});
		explorationConsumer.put(Java2Uml.Java2UmlPackage.eINSTANCE.getOrdinaryMethodParameterToParameter__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.instantiations.InstantiationsPackage.eINSTANCE.getInstantiation(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.instantiations.Instantiation _instantiation = (org.emftext.language.java.instantiations.Instantiation) obj;
			children.addAll(_instantiation.getLayoutInformations());
			children.addAll(_instantiation.getTypeArguments());
			if(_instantiation.getNext() != null)
				children.add(_instantiation.getNext());
			children.addAll(_instantiation.getArraySelectors());
			children.addAll(_instantiation.getArguments());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getInvocationAction(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.InvocationAction _invocationaction = (uml.InvocationAction) obj;
			children.addAll(_invocationaction.getEAnnotations());
			children.addAll(_invocationaction.getOwnedComment());
			if(_invocationaction.getNameExpression() != null)
				children.add(_invocationaction.getNameExpression());
			children.addAll(_invocationaction.getHandler());
			children.addAll(_invocationaction.getLocalPostcondition());
			children.addAll(_invocationaction.getLocalPrecondition());
			children.addAll(_invocationaction.getArgument());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getUnmarshallAction(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.UnmarshallAction _unmarshallaction = (uml.UnmarshallAction) obj;
			children.addAll(_unmarshallaction.getEAnnotations());
			children.addAll(_unmarshallaction.getOwnedComment());
			if(_unmarshallaction.getNameExpression() != null)
				children.add(_unmarshallaction.getNameExpression());
			children.addAll(_unmarshallaction.getHandler());
			children.addAll(_unmarshallaction.getLocalPostcondition());
			children.addAll(_unmarshallaction.getLocalPrecondition());
			if(_unmarshallaction.getObject() != null)
				children.add(_unmarshallaction.getObject());
			children.addAll(_unmarshallaction.getResult());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getUseCase(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.UseCase _usecase = (uml.UseCase) obj;
			children.addAll(_usecase.getEAnnotations());
			children.addAll(_usecase.getOwnedComment());
			if(_usecase.getNameExpression() != null)
				children.add(_usecase.getNameExpression());
			children.addAll(_usecase.getOwnedRule());
			children.addAll(_usecase.getElementImport());
			children.addAll(_usecase.getPackageImport());
			children.addAll(_usecase.getTemplateBinding());
			if(_usecase.getOwnedTemplateSignature() != null)
				children.add(_usecase.getOwnedTemplateSignature());
			children.addAll(_usecase.getCollaborationUse());
			children.addAll(_usecase.getGeneralization());
			children.addAll(_usecase.getOwnedUseCase());
			children.addAll(_usecase.getSubstitution());
			children.addAll(_usecase.getInterfaceRealization());
			children.addAll(_usecase.getOwnedBehavior());
			children.addAll(_usecase.getExtend());
			children.addAll(_usecase.getExtensionPoint());
			children.addAll(_usecase.getInclude());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getRemoveVariableValueAction(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.RemoveVariableValueAction _removevariablevalueaction = (uml.RemoveVariableValueAction) obj;
			children.addAll(_removevariablevalueaction.getEAnnotations());
			children.addAll(_removevariablevalueaction.getOwnedComment());
			if(_removevariablevalueaction.getNameExpression() != null)
				children.add(_removevariablevalueaction.getNameExpression());
			children.addAll(_removevariablevalueaction.getHandler());
			children.addAll(_removevariablevalueaction.getLocalPostcondition());
			children.addAll(_removevariablevalueaction.getLocalPrecondition());
			if(_removevariablevalueaction.getValue() != null)
				children.add(_removevariablevalueaction.getValue());
			if(_removevariablevalueaction.getRemoveAt() != null)
				children.add(_removevariablevalueaction.getRemoveAt());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.modifiers.ModifiersPackage.eINSTANCE.getAnnotationInstanceOrModifier(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.modifiers.AnnotationInstanceOrModifier _annotationinstanceormodifier = (org.emftext.language.java.modifiers.AnnotationInstanceOrModifier) obj;
			children.addAll(_annotationinstanceormodifier.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getVertex(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.Vertex _vertex = (uml.Vertex) obj;
			children.addAll(_vertex.getEAnnotations());
			children.addAll(_vertex.getOwnedComment());
			if(_vertex.getNameExpression() != null)
				children.add(_vertex.getNameExpression());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getRightShift(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.operators.RightShift _rightshift = (org.emftext.language.java.operators.RightShift) obj;
			children.addAll(_rightshift.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getAction(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.Action _action = (uml.Action) obj;
			children.addAll(_action.getEAnnotations());
			children.addAll(_action.getOwnedComment());
			if(_action.getNameExpression() != null)
				children.add(_action.getNameExpression());
			children.addAll(_action.getHandler());
			children.addAll(_action.getLocalPostcondition());
			children.addAll(_action.getLocalPrecondition());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.literals.LiteralsPackage.eINSTANCE.getLongLiteral(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.literals.LongLiteral _longliteral = (org.emftext.language.java.literals.LongLiteral) obj;
			children.addAll(_longliteral.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getReduceAction(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.ReduceAction _reduceaction = (uml.ReduceAction) obj;
			children.addAll(_reduceaction.getEAnnotations());
			children.addAll(_reduceaction.getOwnedComment());
			if(_reduceaction.getNameExpression() != null)
				children.add(_reduceaction.getNameExpression());
			children.addAll(_reduceaction.getHandler());
			children.addAll(_reduceaction.getLocalPostcondition());
			children.addAll(_reduceaction.getLocalPrecondition());
			if(_reduceaction.getCollection() != null)
				children.add(_reduceaction.getCollection());
			if(_reduceaction.getResult() != null)
				children.add(_reduceaction.getResult());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getAssignmentUnsignedRightShift(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.operators.AssignmentUnsignedRightShift _assignmentunsignedrightshift = (org.emftext.language.java.operators.AssignmentUnsignedRightShift) obj;
			children.addAll(_assignmentunsignedrightshift.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getLinkEndDestructionData(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.LinkEndDestructionData _linkenddestructiondata = (uml.LinkEndDestructionData) obj;
			children.addAll(_linkenddestructiondata.getEAnnotations());
			children.addAll(_linkenddestructiondata.getOwnedComment());
			children.addAll(_linkenddestructiondata.getQualifier());
			return children;
		});
		explorationConsumer.put(Java2Uml.Java2UmlPackage.eINSTANCE.getClassProtectedToProtected__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(Java2Uml.Java2UmlPackage.eINSTANCE.getConstructorClassParamTypeToParamType__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAdditiveExpression(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.expressions.AdditiveExpression _additiveexpression = (org.emftext.language.java.expressions.AdditiveExpression) obj;
			children.addAll(_additiveexpression.getLayoutInformations());
			children.addAll(_additiveexpression.getChildren());
			children.addAll(_additiveexpression.getAdditiveOperators());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getStereotype(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.Stereotype _stereotype = (uml.Stereotype) obj;
			children.addAll(_stereotype.getEAnnotations());
			children.addAll(_stereotype.getOwnedComment());
			if(_stereotype.getNameExpression() != null)
				children.add(_stereotype.getNameExpression());
			children.addAll(_stereotype.getOwnedRule());
			children.addAll(_stereotype.getElementImport());
			children.addAll(_stereotype.getPackageImport());
			children.addAll(_stereotype.getTemplateBinding());
			if(_stereotype.getOwnedTemplateSignature() != null)
				children.add(_stereotype.getOwnedTemplateSignature());
			children.addAll(_stereotype.getCollaborationUse());
			children.addAll(_stereotype.getGeneralization());
			children.addAll(_stereotype.getOwnedUseCase());
			children.addAll(_stereotype.getSubstitution());
			children.addAll(_stereotype.getOwnedAttribute());
			children.addAll(_stereotype.getOwnedConnector());
			children.addAll(_stereotype.getInterfaceRealization());
			children.addAll(_stereotype.getOwnedBehavior());
			children.addAll(_stereotype.getOwnedOperation());
			children.addAll(_stereotype.getNestedClassifier());
			children.addAll(_stereotype.getOwnedReception());
			children.addAll(_stereotype.getIcon());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getActivityContent(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.annotations.AnnotationsPackage.eINSTANCE.getAnnotationParameterList(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.annotations.AnnotationParameterList _annotationparameterlist = (org.emftext.language.java.annotations.AnnotationParameterList) obj;
			children.addAll(_annotationparameterlist.getLayoutInformations());
			children.addAll(_annotationparameterlist.getSettings());
			return children;
		});
		explorationConsumer.put(Java2Uml.Java2UmlPackage.eINSTANCE.getMethodInterfaceReturnTypeToReturnType__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getMinusMinus(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.operators.MinusMinus _minusminus = (org.emftext.language.java.operators.MinusMinus) obj;
			children.addAll(_minusminus.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getRelationExpressionChild(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.expressions.RelationExpressionChild _relationexpressionchild = (org.emftext.language.java.expressions.RelationExpressionChild) obj;
			children.addAll(_relationexpressionchild.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getActivityParameterNode(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.ActivityParameterNode _activityparameternode = (uml.ActivityParameterNode) obj;
			children.addAll(_activityparameternode.getEAnnotations());
			children.addAll(_activityparameternode.getOwnedComment());
			if(_activityparameternode.getNameExpression() != null)
				children.add(_activityparameternode.getNameExpression());
			if(_activityparameternode.getUpperBound() != null)
				children.add(_activityparameternode.getUpperBound());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getDoWhileLoop(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.statements.DoWhileLoop _dowhileloop = (org.emftext.language.java.statements.DoWhileLoop) obj;
			children.addAll(_dowhileloop.getLayoutInformations());
			if(_dowhileloop.getStatement() != null)
				children.add(_dowhileloop.getStatement());
			if(_dowhileloop.getCondition() != null)
				children.add(_dowhileloop.getCondition());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.generics.GenericsPackage.eINSTANCE.getCallTypeArgumentable(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.generics.CallTypeArgumentable _calltypeargumentable = (org.emftext.language.java.generics.CallTypeArgumentable) obj;
			children.addAll(_calltypeargumentable.getLayoutInformations());
			children.addAll(_calltypeargumentable.getCallTypeArguments());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getContinue(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.statements.Continue _continue = (org.emftext.language.java.statements.Continue) obj;
			children.addAll(_continue.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(Java2Uml.Java2UmlPackage.eINSTANCE.getJavaAttributeToUmlProperty(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.types.TypesPackage.eINSTANCE.getByte(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.types.Byte _byte = (org.emftext.language.java.types.Byte) obj;
			children.addAll(_byte.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.imports.ImportsPackage.eINSTANCE.getStaticClassifierImport(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.imports.StaticClassifierImport _staticclassifierimport = (org.emftext.language.java.imports.StaticClassifierImport) obj;
			children.addAll(_staticclassifierimport.getLayoutInformations());
			if(_staticclassifierimport.getStatic() != null)
				children.add(_staticclassifierimport.getStatic());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getExpression(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.expressions.Expression _expression = (org.emftext.language.java.expressions.Expression) obj;
			children.addAll(_expression.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getLiteralString(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.LiteralString _literalstring = (uml.LiteralString) obj;
			children.addAll(_literalstring.getEAnnotations());
			children.addAll(_literalstring.getOwnedComment());
			if(_literalstring.getNameExpression() != null)
				children.add(_literalstring.getNameExpression());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getDuration(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.Duration _duration = (uml.Duration) obj;
			children.addAll(_duration.getEAnnotations());
			children.addAll(_duration.getOwnedComment());
			if(_duration.getNameExpression() != null)
				children.add(_duration.getNameExpression());
			if(_duration.getExpr() != null)
				children.add(_duration.getExpr());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.types.TypesPackage.eINSTANCE.getFloat(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.types.Float _float = (org.emftext.language.java.types.Float) obj;
			children.addAll(_float.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getExclusiveOrExpressionChild(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.expressions.ExclusiveOrExpressionChild _exclusiveorexpressionchild = (org.emftext.language.java.expressions.ExclusiveOrExpressionChild) obj;
			children.addAll(_exclusiveorexpressionchild.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getComment(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.Comment _comment = (uml.Comment) obj;
			children.addAll(_comment.getEAnnotations());
			children.addAll(_comment.getOwnedComment());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.members.MembersPackage.eINSTANCE.getMember(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.members.Member _member = (org.emftext.language.java.members.Member) obj;
			children.addAll(_member.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getClause(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.Clause _clause = (uml.Clause) obj;
			children.addAll(_clause.getEAnnotations());
			children.addAll(_clause.getOwnedComment());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getProfile(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.Profile _profile = (uml.Profile) obj;
			children.addAll(_profile.getEAnnotations());
			children.addAll(_profile.getOwnedComment());
			if(_profile.getNameExpression() != null)
				children.add(_profile.getNameExpression());
			children.addAll(_profile.getOwnedRule());
			children.addAll(_profile.getElementImport());
			children.addAll(_profile.getPackageImport());
			children.addAll(_profile.getTemplateBinding());
			if(_profile.getOwnedTemplateSignature() != null)
				children.add(_profile.getOwnedTemplateSignature());
			children.addAll(_profile.getPackageMerge());
			children.addAll(_profile.getPackagedElement());
			children.addAll(_profile.getProfileApplication());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.generics.GenericsPackage.eINSTANCE.getTypeArgumentable(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.generics.TypeArgumentable _typeargumentable = (org.emftext.language.java.generics.TypeArgumentable) obj;
			children.addAll(_typeargumentable.getLayoutInformations());
			children.addAll(_typeargumentable.getTypeArguments());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.literals.LiteralsPackage.eINSTANCE.getIntegerLiteral(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.literals.IntegerLiteral _integerliteral = (org.emftext.language.java.literals.IntegerLiteral) obj;
			children.addAll(_integerliteral.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(Java2Uml.Java2UmlPackage.eINSTANCE.getEnumPublicToPublic__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getSendObjectAction(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.SendObjectAction _sendobjectaction = (uml.SendObjectAction) obj;
			children.addAll(_sendobjectaction.getEAnnotations());
			children.addAll(_sendobjectaction.getOwnedComment());
			if(_sendobjectaction.getNameExpression() != null)
				children.add(_sendobjectaction.getNameExpression());
			children.addAll(_sendobjectaction.getHandler());
			children.addAll(_sendobjectaction.getLocalPostcondition());
			children.addAll(_sendobjectaction.getLocalPrecondition());
			children.addAll(_sendobjectaction.getArgument());
			if(_sendobjectaction.getRequest() != null)
				children.add(_sendobjectaction.getRequest());
			if(_sendobjectaction.getTarget() != null)
				children.add(_sendobjectaction.getTarget());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.references.ReferencesPackage.eINSTANCE.getMethodCall(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.references.MethodCall _methodcall = (org.emftext.language.java.references.MethodCall) obj;
			children.addAll(_methodcall.getLayoutInformations());
			children.addAll(_methodcall.getTypeArguments());
			if(_methodcall.getNext() != null)
				children.add(_methodcall.getNext());
			children.addAll(_methodcall.getArraySelectors());
			children.addAll(_methodcall.getArguments());
			children.addAll(_methodcall.getCallTypeArguments());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getTrigger(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.Trigger _trigger = (uml.Trigger) obj;
			children.addAll(_trigger.getEAnnotations());
			children.addAll(_trigger.getOwnedComment());
			if(_trigger.getNameExpression() != null)
				children.add(_trigger.getNameExpression());
			return children;
		});
		explorationConsumer.put(org.eclipse.emf.ecore.EcorePackage.eINSTANCE.getEClassifier(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.emf.ecore.EClassifier _eclassifier = (org.eclipse.emf.ecore.EClassifier) obj;
			children.addAll(_eclassifier.getEAnnotations());
			children.addAll(_eclassifier.getETypeParameters());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.imports.ImportsPackage.eINSTANCE.getPackageImport(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.imports.PackageImport _packageimport = (org.emftext.language.java.imports.PackageImport) obj;
			children.addAll(_packageimport.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getDestroyLinkAction(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.DestroyLinkAction _destroylinkaction = (uml.DestroyLinkAction) obj;
			children.addAll(_destroylinkaction.getEAnnotations());
			children.addAll(_destroylinkaction.getOwnedComment());
			if(_destroylinkaction.getNameExpression() != null)
				children.add(_destroylinkaction.getNameExpression());
			children.addAll(_destroylinkaction.getHandler());
			children.addAll(_destroylinkaction.getLocalPostcondition());
			children.addAll(_destroylinkaction.getLocalPrecondition());
			children.addAll(_destroylinkaction.getEndData());
			children.addAll(_destroylinkaction.getInputValue());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getReplyAction(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.ReplyAction _replyaction = (uml.ReplyAction) obj;
			children.addAll(_replyaction.getEAnnotations());
			children.addAll(_replyaction.getOwnedComment());
			if(_replyaction.getNameExpression() != null)
				children.add(_replyaction.getNameExpression());
			children.addAll(_replyaction.getHandler());
			children.addAll(_replyaction.getLocalPostcondition());
			children.addAll(_replyaction.getLocalPrecondition());
			children.addAll(_replyaction.getReplyValue());
			if(_replyaction.getReturnInformation() != null)
				children.add(_replyaction.getReturnInformation());
			return children;
		});
		explorationConsumer.put(Java2Uml.Java2UmlPackage.eINSTANCE.getConstructorInterfaceParamTypeToParamType__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(Java2Uml.Java2UmlPackage.eINSTANCE.getMethodAbstractToAbstract__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.types.TypesPackage.eINSTANCE.getVoid(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.types.Void _void = (org.emftext.language.java.types.Void) obj;
			children.addAll(_void.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.annotations.AnnotationsPackage.eINSTANCE.getAnnotationParameter(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.annotations.AnnotationParameter _annotationparameter = (org.emftext.language.java.annotations.AnnotationParameter) obj;
			children.addAll(_annotationparameter.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getBroadcastSignalAction(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.BroadcastSignalAction _broadcastsignalaction = (uml.BroadcastSignalAction) obj;
			children.addAll(_broadcastsignalaction.getEAnnotations());
			children.addAll(_broadcastsignalaction.getOwnedComment());
			if(_broadcastsignalaction.getNameExpression() != null)
				children.add(_broadcastsignalaction.getNameExpression());
			children.addAll(_broadcastsignalaction.getHandler());
			children.addAll(_broadcastsignalaction.getLocalPostcondition());
			children.addAll(_broadcastsignalaction.getLocalPrecondition());
			children.addAll(_broadcastsignalaction.getArgument());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getDataType(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.DataType _datatype = (uml.DataType) obj;
			children.addAll(_datatype.getEAnnotations());
			children.addAll(_datatype.getOwnedComment());
			if(_datatype.getNameExpression() != null)
				children.add(_datatype.getNameExpression());
			children.addAll(_datatype.getOwnedRule());
			children.addAll(_datatype.getElementImport());
			children.addAll(_datatype.getPackageImport());
			children.addAll(_datatype.getTemplateBinding());
			if(_datatype.getOwnedTemplateSignature() != null)
				children.add(_datatype.getOwnedTemplateSignature());
			children.addAll(_datatype.getCollaborationUse());
			children.addAll(_datatype.getGeneralization());
			children.addAll(_datatype.getOwnedUseCase());
			children.addAll(_datatype.getSubstitution());
			children.addAll(_datatype.getOwnedAttribute());
			children.addAll(_datatype.getOwnedOperation());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getInputPin(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.InputPin _inputpin = (uml.InputPin) obj;
			children.addAll(_inputpin.getEAnnotations());
			children.addAll(_inputpin.getOwnedComment());
			if(_inputpin.getNameExpression() != null)
				children.add(_inputpin.getNameExpression());
			if(_inputpin.getUpperBound() != null)
				children.add(_inputpin.getUpperBound());
			if(_inputpin.getLowerValue() != null)
				children.add(_inputpin.getLowerValue());
			if(_inputpin.getUpperValue() != null)
				children.add(_inputpin.getUpperValue());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.literals.LiteralsPackage.eINSTANCE.getOctalLongLiteral(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.literals.OctalLongLiteral _octallongliteral = (org.emftext.language.java.literals.OctalLongLiteral) obj;
			children.addAll(_octallongliteral.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getPackageableElement(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.PackageableElement _packageableelement = (uml.PackageableElement) obj;
			children.addAll(_packageableelement.getEAnnotations());
			children.addAll(_packageableelement.getOwnedComment());
			if(_packageableelement.getNameExpression() != null)
				children.add(_packageableelement.getNameExpression());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getInitialNode(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.InitialNode _initialnode = (uml.InitialNode) obj;
			children.addAll(_initialnode.getEAnnotations());
			children.addAll(_initialnode.getOwnedComment());
			if(_initialnode.getNameExpression() != null)
				children.add(_initialnode.getNameExpression());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.members.MembersPackage.eINSTANCE.getClassMethod(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.members.ClassMethod _classmethod = (org.emftext.language.java.members.ClassMethod) obj;
			children.addAll(_classmethod.getLayoutInformations());
			if(_classmethod.getTypeReference() != null)
				children.add(_classmethod.getTypeReference());
			children.addAll(_classmethod.getArrayDimensionsBefore());
			children.addAll(_classmethod.getArrayDimensionsAfter());
			children.addAll(_classmethod.getTypeParameters());
			children.addAll(_classmethod.getParameters());
			children.addAll(_classmethod.getExceptions());
			children.addAll(_classmethod.getAnnotationsAndModifiers());
			children.addAll(_classmethod.getStatements());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getLiteralReal(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.LiteralReal _literalreal = (uml.LiteralReal) obj;
			children.addAll(_literalreal.getEAnnotations());
			children.addAll(_literalreal.getOwnedComment());
			if(_literalreal.getNameExpression() != null)
				children.add(_literalreal.getNameExpression());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.references.ReferencesPackage.eINSTANCE.getReferenceableElement(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.references.ReferenceableElement _referenceableelement = (org.emftext.language.java.references.ReferenceableElement) obj;
			children.addAll(_referenceableelement.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(org.eclipse.emf.ecore.EcorePackage.eINSTANCE.getETypedElement(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.emf.ecore.ETypedElement _etypedelement = (org.eclipse.emf.ecore.ETypedElement) obj;
			children.addAll(_etypedelement.getEAnnotations());
			if(_etypedelement.getEGenericType() != null)
				children.add(_etypedelement.getEGenericType());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getOccurrenceSpecification(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.OccurrenceSpecification _occurrencespecification = (uml.OccurrenceSpecification) obj;
			children.addAll(_occurrencespecification.getEAnnotations());
			children.addAll(_occurrencespecification.getOwnedComment());
			if(_occurrencespecification.getNameExpression() != null)
				children.add(_occurrencespecification.getNameExpression());
			children.addAll(_occurrencespecification.getGeneralOrdering());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArrayInstantiationByValues(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.arrays.ArrayInstantiationByValues _arrayinstantiationbyvalues = (org.emftext.language.java.arrays.ArrayInstantiationByValues) obj;
			children.addAll(_arrayinstantiationbyvalues.getLayoutInformations());
			children.addAll(_arrayinstantiationbyvalues.getTypeArguments());
			if(_arrayinstantiationbyvalues.getNext() != null)
				children.add(_arrayinstantiationbyvalues.getNext());
			children.addAll(_arrayinstantiationbyvalues.getArraySelectors());
			if(_arrayinstantiationbyvalues.getArrayInitializer() != null)
				children.add(_arrayinstantiationbyvalues.getArrayInitializer());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getDurationConstraint(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.DurationConstraint _durationconstraint = (uml.DurationConstraint) obj;
			children.addAll(_durationconstraint.getEAnnotations());
			children.addAll(_durationconstraint.getOwnedComment());
			if(_durationconstraint.getNameExpression() != null)
				children.add(_durationconstraint.getNameExpression());
			if(_durationconstraint.getSpecification() != null)
				children.add(_durationconstraint.getSpecification());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.literals.LiteralsPackage.eINSTANCE.getSuper(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.literals.Super _super = (org.emftext.language.java.literals.Super) obj;
			children.addAll(_super.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.modifiers.ModifiersPackage.eINSTANCE.getPrivate(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.modifiers.Private _private = (org.emftext.language.java.modifiers.Private) obj;
			children.addAll(_private.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getAssignment(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.operators.Assignment _assignment = (org.emftext.language.java.operators.Assignment) obj;
			children.addAll(_assignment.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getParameter(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.Parameter _parameter = (uml.Parameter) obj;
			children.addAll(_parameter.getEAnnotations());
			children.addAll(_parameter.getOwnedComment());
			if(_parameter.getNameExpression() != null)
				children.add(_parameter.getNameExpression());
			if(_parameter.getLowerValue() != null)
				children.add(_parameter.getLowerValue());
			if(_parameter.getUpperValue() != null)
				children.add(_parameter.getUpperValue());
			if(_parameter.getDefaultValue() != null)
				children.add(_parameter.getDefaultValue());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getLiteralNull(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.LiteralNull _literalnull = (uml.LiteralNull) obj;
			children.addAll(_literalnull.getEAnnotations());
			children.addAll(_literalnull.getOwnedComment());
			if(_literalnull.getNameExpression() != null)
				children.add(_literalnull.getNameExpression());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getStateMachine(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.StateMachine _statemachine = (uml.StateMachine) obj;
			children.addAll(_statemachine.getEAnnotations());
			children.addAll(_statemachine.getOwnedComment());
			if(_statemachine.getNameExpression() != null)
				children.add(_statemachine.getNameExpression());
			children.addAll(_statemachine.getOwnedRule());
			children.addAll(_statemachine.getElementImport());
			children.addAll(_statemachine.getPackageImport());
			children.addAll(_statemachine.getTemplateBinding());
			if(_statemachine.getOwnedTemplateSignature() != null)
				children.add(_statemachine.getOwnedTemplateSignature());
			children.addAll(_statemachine.getCollaborationUse());
			children.addAll(_statemachine.getGeneralization());
			children.addAll(_statemachine.getOwnedUseCase());
			children.addAll(_statemachine.getSubstitution());
			children.addAll(_statemachine.getOwnedAttribute());
			children.addAll(_statemachine.getOwnedConnector());
			children.addAll(_statemachine.getInterfaceRealization());
			children.addAll(_statemachine.getOwnedBehavior());
			children.addAll(_statemachine.getOwnedOperation());
			children.addAll(_statemachine.getNestedClassifier());
			children.addAll(_statemachine.getOwnedReception());
			children.addAll(_statemachine.getOwnedParameter());
			children.addAll(_statemachine.getOwnedParameterSet());
			children.addAll(_statemachine.getConnectionPoint());
			children.addAll(_statemachine.getRegion());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getConditionalNode(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.ConditionalNode _conditionalnode = (uml.ConditionalNode) obj;
			children.addAll(_conditionalnode.getEAnnotations());
			children.addAll(_conditionalnode.getOwnedComment());
			if(_conditionalnode.getNameExpression() != null)
				children.add(_conditionalnode.getNameExpression());
			children.addAll(_conditionalnode.getHandler());
			children.addAll(_conditionalnode.getLocalPostcondition());
			children.addAll(_conditionalnode.getLocalPrecondition());
			children.addAll(_conditionalnode.getOwnedRule());
			children.addAll(_conditionalnode.getElementImport());
			children.addAll(_conditionalnode.getPackageImport());
			children.addAll(_conditionalnode.getEdge());
			children.addAll(_conditionalnode.getStructuredNodeInput());
			children.addAll(_conditionalnode.getStructuredNodeOutput());
			children.addAll(_conditionalnode.getVariable());
			children.addAll(_conditionalnode.getNode());
			children.addAll(_conditionalnode.getClause());
			children.addAll(_conditionalnode.getResult());
			return children;
		});
		explorationConsumer.put(org.eclipse.emf.ecore.EcorePackage.eINSTANCE.getEStringToStringMapEntry(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getTestIdentityAction(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.TestIdentityAction _testidentityaction = (uml.TestIdentityAction) obj;
			children.addAll(_testidentityaction.getEAnnotations());
			children.addAll(_testidentityaction.getOwnedComment());
			if(_testidentityaction.getNameExpression() != null)
				children.add(_testidentityaction.getNameExpression());
			children.addAll(_testidentityaction.getHandler());
			children.addAll(_testidentityaction.getLocalPostcondition());
			children.addAll(_testidentityaction.getLocalPrecondition());
			if(_testidentityaction.getFirst() != null)
				children.add(_testidentityaction.getFirst());
			if(_testidentityaction.getResult() != null)
				children.add(_testidentityaction.getResult());
			if(_testidentityaction.getSecond() != null)
				children.add(_testidentityaction.getSecond());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getAbstraction(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.Abstraction _abstraction = (uml.Abstraction) obj;
			children.addAll(_abstraction.getEAnnotations());
			children.addAll(_abstraction.getOwnedComment());
			if(_abstraction.getNameExpression() != null)
				children.add(_abstraction.getNameExpression());
			if(_abstraction.getMapping() != null)
				children.add(_abstraction.getMapping());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.literals.LiteralsPackage.eINSTANCE.getBooleanLiteral(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.literals.BooleanLiteral _booleanliteral = (org.emftext.language.java.literals.BooleanLiteral) obj;
			children.addAll(_booleanliteral.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getShiftExpression(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.expressions.ShiftExpression _shiftexpression = (org.emftext.language.java.expressions.ShiftExpression) obj;
			children.addAll(_shiftexpression.getLayoutInformations());
			children.addAll(_shiftexpression.getChildren());
			children.addAll(_shiftexpression.getShiftOperators());
			return children;
		});
		explorationConsumer.put(Java2Uml.Java2UmlPackage.eINSTANCE.getJavaClassifierReferenceToUmlGeneralization(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getVariableAction(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.VariableAction _variableaction = (uml.VariableAction) obj;
			children.addAll(_variableaction.getEAnnotations());
			children.addAll(_variableaction.getOwnedComment());
			if(_variableaction.getNameExpression() != null)
				children.add(_variableaction.getNameExpression());
			children.addAll(_variableaction.getHandler());
			children.addAll(_variableaction.getLocalPostcondition());
			children.addAll(_variableaction.getLocalPrecondition());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getActivityNode(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.ActivityNode _activitynode = (uml.ActivityNode) obj;
			children.addAll(_activitynode.getEAnnotations());
			children.addAll(_activitynode.getOwnedComment());
			if(_activitynode.getNameExpression() != null)
				children.add(_activitynode.getNameExpression());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getEmptyStatement(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.statements.EmptyStatement _emptystatement = (org.emftext.language.java.statements.EmptyStatement) obj;
			children.addAll(_emptystatement.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.members.MembersPackage.eINSTANCE.getField(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.members.Field _field = (org.emftext.language.java.members.Field) obj;
			children.addAll(_field.getLayoutInformations());
			if(_field.getInitialValue() != null)
				children.add(_field.getInitialValue());
			if(_field.getTypeReference() != null)
				children.add(_field.getTypeReference());
			children.addAll(_field.getArrayDimensionsBefore());
			children.addAll(_field.getArrayDimensionsAfter());
			children.addAll(_field.getTypeArguments());
			children.addAll(_field.getAnnotationsAndModifiers());
			children.addAll(_field.getAdditionalFields());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getConditionalAndExpression(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.expressions.ConditionalAndExpression _conditionalandexpression = (org.emftext.language.java.expressions.ConditionalAndExpression) obj;
			children.addAll(_conditionalandexpression.getLayoutInformations());
			children.addAll(_conditionalandexpression.getChildren());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getConditionalAndExpressionChild(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.expressions.ConditionalAndExpressionChild _conditionalandexpressionchild = (org.emftext.language.java.expressions.ConditionalAndExpressionChild) obj;
			children.addAll(_conditionalandexpressionchild.getLayoutInformations());
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getPrefixUnaryModificationExpression(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.expressions.PrefixUnaryModificationExpression _prefixunarymodificationexpression = (org.emftext.language.java.expressions.PrefixUnaryModificationExpression) obj;
			children.addAll(_prefixunarymodificationexpression.getLayoutInformations());
			if(_prefixunarymodificationexpression.getChild() != null)
				children.add(_prefixunarymodificationexpression.getChild());
			if(_prefixunarymodificationexpression.getOperator() != null)
				children.add(_prefixunarymodificationexpression.getOperator());
			return children;
		});
		explorationConsumer.put(uml.UmlPackage.eINSTANCE.getStructuralFeature(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			uml.StructuralFeature _structuralfeature = (uml.StructuralFeature) obj;
			children.addAll(_structuralfeature.getEAnnotations());
			children.addAll(_structuralfeature.getOwnedComment());
			if(_structuralfeature.getNameExpression() != null)
				children.add(_structuralfeature.getNameExpression());
			if(_structuralfeature.getLowerValue() != null)
				children.add(_structuralfeature.getLowerValue());
			if(_structuralfeature.getUpperValue() != null)
				children.add(_structuralfeature.getUpperValue());
			return children;
		});
		explorationConsumer.put(Java2Uml.Java2UmlPackage.eINSTANCE.getFieldFinalToFinal__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(Java2Uml.Java2UmlPackage.eINSTANCE.getJavaParameterToParameter(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.emftext.language.java.literals.LiteralsPackage.eINSTANCE.getLiteral(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.emftext.language.java.literals.Literal _literal = (org.emftext.language.java.literals.Literal) obj;
			children.addAll(_literal.getLayoutInformations());
			return children;
		});
	}
}

