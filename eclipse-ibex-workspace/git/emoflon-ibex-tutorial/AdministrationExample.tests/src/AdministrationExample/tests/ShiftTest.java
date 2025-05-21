/**
 */
package AdministrationExample.tests;

import AdministrationExample.AdministrationExampleFactory;
import AdministrationExample.Shift;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Shift</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ShiftTest extends TestCase {

	/**
	 * The fixture for this Shift test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Shift fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ShiftTest.class);
	}

	/**
	 * Constructs a new Shift test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShiftTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Shift test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Shift fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Shift test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Shift getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AdministrationExampleFactory.eINSTANCE.createShift());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //ShiftTest
