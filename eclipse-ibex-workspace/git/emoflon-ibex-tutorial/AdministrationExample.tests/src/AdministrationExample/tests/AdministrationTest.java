/**
 */
package AdministrationExample.tests;

import AdministrationExample.Administration;
import AdministrationExample.AdministrationExampleFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Administration</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AdministrationTest extends TestCase {

	/**
	 * The fixture for this Administration test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Administration fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AdministrationTest.class);
	}

	/**
	 * Constructs a new Administration test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdministrationTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Administration test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Administration fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Administration test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Administration getFixture() {
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
		setFixture(AdministrationExampleFactory.eINSTANCE.createAdministration());
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

} //AdministrationTest
