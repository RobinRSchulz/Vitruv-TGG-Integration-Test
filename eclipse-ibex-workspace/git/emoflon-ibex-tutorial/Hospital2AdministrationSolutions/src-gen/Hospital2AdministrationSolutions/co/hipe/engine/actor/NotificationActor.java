package Hospital2AdministrationSolutions.co.hipe.engine.actor;

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
		explorationConsumer.put(AdministrationExample.AdministrationExamplePackage.eINSTANCE.getShift(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(HospitalExample.HospitalExamplePackage.eINSTANCE.getRoom(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			HospitalExample.Room _room = (HospitalExample.Room) obj;
			children.addAll(_room.getLies());
			return children;
		});
		explorationConsumer.put(Hospital2AdministrationSolutions.Hospital2AdministrationSolutionsPackage.eINSTANCE.getDoctorToStaff(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(AdministrationExample.AdministrationExamplePackage.eINSTANCE.getStaff(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			AdministrationExample.Staff _staff = (AdministrationExample.Staff) obj;
			if(_staff.getShiftPlan() != null)
				children.add(_staff.getShiftPlan());
			return children;
		});
		explorationConsumer.put(Hospital2AdministrationSolutions.Hospital2AdministrationSolutionsPackage.eINSTANCE.getDoctorToPatient__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(runtime.impl.RuntimePackageImpl.eINSTANCE.getTempContainer(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			runtime.TempContainer _tempcontainer = (runtime.TempContainer) obj;
			children.addAll(_tempcontainer.getObjects());
			return children;
		});
		explorationConsumer.put(Hospital2AdministrationSolutions.Hospital2AdministrationSolutionsPackage.eINSTANCE.getStaffToStaff(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(Hospital2AdministrationSolutions.Hospital2AdministrationSolutionsPackage.eINSTANCE.getPatientInReception__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(HospitalExample.HospitalExamplePackage.eINSTANCE.getDoctor(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(AdministrationExample.AdministrationExamplePackage.eINSTANCE.getShiftplan(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			AdministrationExample.Shiftplan _shiftplan = (AdministrationExample.Shiftplan) obj;
			children.addAll(_shiftplan.getShifts());
			return children;
		});
		explorationConsumer.put(Hospital2AdministrationSolutions.Hospital2AdministrationSolutionsPackage.eINSTANCE.getNurseToRoomRule__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(HospitalExample.HospitalExamplePackage.eINSTANCE.getHospital(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			HospitalExample.Hospital _hospital = (HospitalExample.Hospital) obj;
			if(_hospital.getReception() != null)
				children.add(_hospital.getReception());
			children.addAll(_hospital.getStaff());
			children.addAll(_hospital.getDepartment());
			return children;
		});
		explorationConsumer.put(Hospital2AdministrationSolutions.Hospital2AdministrationSolutionsPackage.eINSTANCE.getPatientToPatient(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(Hospital2AdministrationSolutions.Hospital2AdministrationSolutionsPackage.eINSTANCE.getHospitalToAdministration(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(HospitalExample.HospitalExamplePackage.eINSTANCE.getStaff(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(HospitalExample.HospitalExamplePackage.eINSTANCE.getDepartment(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			HospitalExample.Department _department = (HospitalExample.Department) obj;
			children.addAll(_department.getRooms());
			return children;
		});
		explorationConsumer.put(Hospital2AdministrationSolutions.Hospital2AdministrationSolutionsPackage.eINSTANCE.getNurseShiftplanRule__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(HospitalExample.HospitalExamplePackage.eINSTANCE.getReception(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			HospitalExample.Reception _reception = (HospitalExample.Reception) obj;
			children.addAll(_reception.getWaits());
			return children;
		});
		explorationConsumer.put(Hospital2AdministrationSolutions.Hospital2AdministrationSolutionsPackage.eINSTANCE.getHospitaltoAdministrationRule__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(AdministrationExample.AdministrationExamplePackage.eINSTANCE.getPatient(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			AdministrationExample.Patient _patient = (AdministrationExample.Patient) obj;
			if(_patient.getTreatment() != null)
				children.add(_patient.getTreatment());
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
		explorationConsumer.put(Hospital2AdministrationSolutions.Hospital2AdministrationSolutionsPackage.eINSTANCE.getDoctorShiftplanRule__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(AdministrationExample.AdministrationExamplePackage.eINSTANCE.getTreatment(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(AdministrationExample.AdministrationExamplePackage.eINSTANCE.getAdministration(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			AdministrationExample.Administration _administration = (AdministrationExample.Administration) obj;
			children.addAll(_administration.getStaff());
			children.addAll(_administration.getPatient());
			return children;
		});
		explorationConsumer.put(Hospital2AdministrationSolutions.Hospital2AdministrationSolutionsPackage.eINSTANCE.getRoomRule__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(Hospital2AdministrationSolutions.Hospital2AdministrationSolutionsPackage.eINSTANCE.getPatientInRoom__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(HospitalExample.HospitalExamplePackage.eINSTANCE.getNurse(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(AdministrationExample.AdministrationExamplePackage.eINSTANCE.getPerson(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(HospitalExample.HospitalExamplePackage.eINSTANCE.getPatient(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(Hospital2AdministrationSolutions.Hospital2AdministrationSolutionsPackage.eINSTANCE.getRoomToShiftplan(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(Hospital2AdministrationSolutions.Hospital2AdministrationSolutionsPackage.eINSTANCE.getDepartmentRule__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(Hospital2AdministrationSolutions.Hospital2AdministrationSolutionsPackage.eINSTANCE.getDocToStaffRule__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(Hospital2AdministrationSolutions.Hospital2AdministrationSolutionsPackage.eINSTANCE.getNurseToStaff(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(Hospital2AdministrationSolutions.Hospital2AdministrationSolutionsPackage.eINSTANCE.getNurseToStaffRule__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(runtime.impl.RuntimePackageImpl.eINSTANCE.getCorrespondenceNode(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
	}
}

