/**
 */
package DsoaAdsl.impl;

import DsoaAdsl.Constraint;
import DsoaAdsl.DsoaAdslPackage;
import DsoaAdsl.NonFunctionalSpecification;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Non Functional Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link DsoaAdsl.impl.NonFunctionalSpecificationImpl#getSpecifies <em>Specifies</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NonFunctionalSpecificationImpl extends MinimalEObjectImpl.Container implements NonFunctionalSpecification {
	/**
	 * The cached value of the '{@link #getSpecifies() <em>Specifies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecifies()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> specifies;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NonFunctionalSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DsoaAdslPackage.Literals.NON_FUNCTIONAL_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getSpecifies() {
		if (specifies == null) {
			specifies = new EObjectContainmentEList.Resolving<Constraint>(Constraint.class, this, DsoaAdslPackage.NON_FUNCTIONAL_SPECIFICATION__SPECIFIES);
		}
		return specifies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DsoaAdslPackage.NON_FUNCTIONAL_SPECIFICATION__SPECIFIES:
				return ((InternalEList<?>)getSpecifies()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DsoaAdslPackage.NON_FUNCTIONAL_SPECIFICATION__SPECIFIES:
				return getSpecifies();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DsoaAdslPackage.NON_FUNCTIONAL_SPECIFICATION__SPECIFIES:
				getSpecifies().clear();
				getSpecifies().addAll((Collection<? extends Constraint>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DsoaAdslPackage.NON_FUNCTIONAL_SPECIFICATION__SPECIFIES:
				getSpecifies().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DsoaAdslPackage.NON_FUNCTIONAL_SPECIFICATION__SPECIFIES:
				return specifies != null && !specifies.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NonFunctionalSpecificationImpl
