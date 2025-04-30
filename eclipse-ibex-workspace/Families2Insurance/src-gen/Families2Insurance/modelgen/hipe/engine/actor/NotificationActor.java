package Families2Insurance.modelgen.hipe.engine.actor;

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
		explorationConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getFamilyRegisterToInsuranceDatabase(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getFamilyRegisterToInsuranceDatabase__Marker(), obj -> {
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
		explorationConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getDaughterToInsuranceClient__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(runtime.impl.RuntimePackageImpl.eINSTANCE.getTempContainer(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			runtime.TempContainer _tempcontainer = (runtime.TempContainer) obj;
			children.addAll(_tempcontainer.getObjects());
			return children;
		});
		explorationConsumer.put(edu.kit.ipd.sdq.metamodels.insurance.InsurancePackage.eINSTANCE.getInsuranceClient(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getFamilyToInsuranceClient(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getSonToInsuranceClient__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getFatherToInsuranceClient__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getMotherNewFamilyToNewInsuranceClient__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getMotherToInsuranceClient__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(edu.kit.ipd.sdq.metamodels.insurance.InsurancePackage.eINSTANCE.getInsuranceDatabase(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase _insurancedatabase = (edu.kit.ipd.sdq.metamodels.insurance.InsuranceDatabase) obj;
			children.addAll(_insurancedatabase.getInsuranceclient());
			return children;
		});
		explorationConsumer.put(edu.kit.ipd.sdq.metamodels.families.FamiliesPackage.eINSTANCE.getFamily(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			edu.kit.ipd.sdq.metamodels.families.Family _family = (edu.kit.ipd.sdq.metamodels.families.Family) obj;
			children.addAll(_family.getSons());
			children.addAll(_family.getDaughters());
			if(_family.getFather() != null)
				children.add(_family.getFather());
			if(_family.getMother() != null)
				children.add(_family.getMother());
			return children;
		});
		explorationConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getFatherNewFamilyToNewInsuranceClient__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(edu.kit.ipd.sdq.metamodels.families.FamiliesPackage.eINSTANCE.getFamilyRegister(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			edu.kit.ipd.sdq.metamodels.families.FamilyRegister _familyregister = (edu.kit.ipd.sdq.metamodels.families.FamilyRegister) obj;
			children.addAll(_familyregister.getFamilies());
			return children;
		});
		explorationConsumer.put(Families2Insurance.Families2InsurancePackage.eINSTANCE.getMemberToInsuranceClient(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(edu.kit.ipd.sdq.metamodels.families.FamiliesPackage.eINSTANCE.getMember(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(runtime.impl.RuntimePackageImpl.eINSTANCE.getCorrespondenceNode(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
	}
}

