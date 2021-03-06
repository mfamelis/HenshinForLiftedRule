/**
 */
package org.eclipse.emf.henshin.tests;

import junit.textui.TestRunner;

import org.eclipse.emf.henshin.model.HenshinFactory;
import org.eclipse.emf.henshin.model.SequentialUnit;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Sequential Unit</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SequentialUnitTest extends MultiUnitTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SequentialUnitTest.class);
	}

	/**
	 * Constructs a new Sequential Unit test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequentialUnitTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Sequential Unit test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SequentialUnit getFixture() {
		return (SequentialUnit)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(HenshinFactory.eINSTANCE.createSequentialUnit());
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

} //SequentialUnitTest
