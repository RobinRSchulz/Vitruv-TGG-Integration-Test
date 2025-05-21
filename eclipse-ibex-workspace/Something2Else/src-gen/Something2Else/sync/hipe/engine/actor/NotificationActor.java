package Something2Else.sync.hipe.engine.actor;

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
		explorationConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getLinkToEntity__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(tools.vitruv.methodologisttemplate.model.model.ModelPackage.eINSTANCE.getProtocol(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(tools.vitruv.methodologisttemplate.model.model.ModelPackage.eINSTANCE.getSystem(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			tools.vitruv.methodologisttemplate.model.model.System _system = (tools.vitruv.methodologisttemplate.model.model.System) obj;
			children.addAll(_system.getLinks());
			children.addAll(_system.getComponents());
			children.addAll(_system.getProtocols());
			return children;
		});
		explorationConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getComponentToEntity(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getLinkToEntityEmbedded__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getSystemToRoot__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getLinkToEntity(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(runtime.impl.RuntimePackageImpl.eINSTANCE.getCorrespondenceNode(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(tools.vitruv.methodologisttemplate.model.model2.Model2Package.eINSTANCE.getRoot(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			tools.vitruv.methodologisttemplate.model.model2.Root _root = (tools.vitruv.methodologisttemplate.model.model2.Root) obj;
			children.addAll(_root.getEntities());
			return children;
		});
		explorationConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getSystemToRoot(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(tools.vitruv.methodologisttemplate.model.model.ModelPackage.eINSTANCE.getComponent(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(tools.vitruv.methodologisttemplate.model.model2.Model2Package.eINSTANCE.getEntity(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getProtocolToEntity(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getSystemRefdComponentToEntity__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(runtime.impl.RuntimePackageImpl.eINSTANCE.getTGGRuleApplication(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(runtime.impl.RuntimePackageImpl.eINSTANCE.getProtocol(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			runtime.Protocol _protocol = (runtime.Protocol) obj;
			children.addAll(_protocol.getSteps());
			return children;
		});
		explorationConsumer.put(tools.vitruv.methodologisttemplate.model.model.ModelPackage.eINSTANCE.getServer(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(tools.vitruv.methodologisttemplate.model.model2.Model2Package.eINSTANCE.getLink(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getProtocolToEntity__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(Something2Else.Something2ElsePackage.eINSTANCE.getComponentToEntity__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(runtime.impl.RuntimePackageImpl.eINSTANCE.getTempContainer(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			runtime.TempContainer _tempcontainer = (runtime.TempContainer) obj;
			children.addAll(_tempcontainer.getObjects());
			return children;
		});
		explorationConsumer.put(tools.vitruv.methodologisttemplate.model.model.ModelPackage.eINSTANCE.getLink(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(tools.vitruv.methodologisttemplate.model.model.ModelPackage.eINSTANCE.getDevice(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
	}
}

