/**
 */
package AdministrationExample.tests;

import AdministrationExample.AdministrationExampleFactory;
import AdministrationExample.Shiftplan;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Shiftplan</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ShiftplanTest extends TestCase {

	/**
	 * The fixture for this Shiftplan test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Shiftplan fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ShiftplanTest.class);
	}

	/**
	 * Constructs a new Shiftplan test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShiftplanTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Shiftplan test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Shiftplan fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Shiftplan test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Shiftplan getFixture() {
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
		setFixture(AdministrationExampleFactory.eINSTANCE.createShiftplan());
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

} //ShiftplanTest
