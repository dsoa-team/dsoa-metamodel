/**
 */
package DsoaAdsl.impl;

import DsoaAdsl.DsoaAdslPackage;
import DsoaAdsl.NonFunctionalSpecification;
import DsoaAdsl.ServiceInterface;
import DsoaAdsl.ServiceSpecification;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link DsoaAdsl.impl.ServiceSpecificationImpl#getDefines <em>Defines</em>}</li>
 *   <li>{@link DsoaAdsl.impl.ServiceSpecificationImpl#getRealizes <em>Realizes</em>}</li>
 *   <li>{@link DsoaAdsl.impl.ServiceSpecificationImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceSpecificationImpl extends MinimalEObjectImpl.Container implements ServiceSpecification {
	/**
	 * The cached value of the '{@link #getDefines() <em>Defines</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefines()
	 * @generated
	 * @ordered
	 */
	protected NonFunctionalSpecification defines;

	/**
	 * The cached value of the '{@link #getRealizes() <em>Realizes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizes()
	 * @generated
	 * @ordered
	 */
	protected ServiceInterface realizes;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DsoaAdslPackage.Literals.SERVICE_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonFunctionalSpecification getDefines() {
		if (defines != null && defines.eIsProxy()) {
			InternalEObject oldDefines = (InternalEObject)defines;
			defines = (NonFunctionalSpecification)eResolveProxy(oldDefines);
			if (defines != oldDefines) {
				InternalEObject newDefines = (InternalEObject)defines;
				NotificationChain msgs = oldDefines.eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DsoaAdslPackage.SERVICE_SPECIFICATION__DEFINES, null, null);
				if (newDefines.eInternalContainer() == null) {
					msgs = newDefines.eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DsoaAdslPackage.SERVICE_SPECIFICATION__DEFINES, null, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DsoaAdslPackage.SERVICE_SPECIFICATION__DEFINES, oldDefines, defines));
			}
		}
		return defines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonFunctionalSpecification basicGetDefines() {
		return defines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefines(NonFunctionalSpecification newDefines, NotificationChain msgs) {
		NonFunctionalSpecification oldDefines = defines;
		defines = newDefines;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DsoaAdslPackage.SERVICE_SPECIFICATION__DEFINES, oldDefines, newDefines);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefines(NonFunctionalSpecification newDefines) {
		if (newDefines != defines) {
			NotificationChain msgs = null;
			if (defines != null)
				msgs = ((InternalEObject)defines).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DsoaAdslPackage.SERVICE_SPECIFICATION__DEFINES, null, msgs);
			if (newDefines != null)
				msgs = ((InternalEObject)newDefines).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DsoaAdslPackage.SERVICE_SPECIFICATION__DEFINES, null, msgs);
			msgs = basicSetDefines(newDefines, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsoaAdslPackage.SERVICE_SPECIFICATION__DEFINES, newDefines, newDefines));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceInterface getRealizes() {
		if (realizes != null && realizes.eIsProxy()) {
			InternalEObject oldRealizes = (InternalEObject)realizes;
			realizes = (ServiceInterface)eResolveProxy(oldRealizes);
			if (realizes != oldRealizes) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DsoaAdslPackage.SERVICE_SPECIFICATION__REALIZES, oldRealizes, realizes));
			}
		}
		return realizes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceInterface basicGetRealizes() {
		return realizes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRealizes(ServiceInterface newRealizes) {
		ServiceInterface oldRealizes = realizes;
		realizes = newRealizes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsoaAdslPackage.SERVICE_SPECIFICATION__REALIZES, oldRealizes, realizes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsoaAdslPackage.SERVICE_SPECIFICATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DsoaAdslPackage.SERVICE_SPECIFICATION__DEFINES:
				return basicSetDefines(null, msgs);
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
			case DsoaAdslPackage.SERVICE_SPECIFICATION__DEFINES:
				if (resolve) return getDefines();
				return basicGetDefines();
			case DsoaAdslPackage.SERVICE_SPECIFICATION__REALIZES:
				if (resolve) return getRealizes();
				return basicGetRealizes();
			case DsoaAdslPackage.SERVICE_SPECIFICATION__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DsoaAdslPackage.SERVICE_SPECIFICATION__DEFINES:
				setDefines((NonFunctionalSpecification)newValue);
				return;
			case DsoaAdslPackage.SERVICE_SPECIFICATION__REALIZES:
				setRealizes((ServiceInterface)newValue);
				return;
			case DsoaAdslPackage.SERVICE_SPECIFICATION__NAME:
				setName((String)newValue);
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
			case DsoaAdslPackage.SERVICE_SPECIFICATION__DEFINES:
				setDefines((NonFunctionalSpecification)null);
				return;
			case DsoaAdslPackage.SERVICE_SPECIFICATION__REALIZES:
				setRealizes((ServiceInterface)null);
				return;
			case DsoaAdslPackage.SERVICE_SPECIFICATION__NAME:
				setName(NAME_EDEFAULT);
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
			case DsoaAdslPackage.SERVICE_SPECIFICATION__DEFINES:
				return defines != null;
			case DsoaAdslPackage.SERVICE_SPECIFICATION__REALIZES:
				return realizes != null;
			case DsoaAdslPackage.SERVICE_SPECIFICATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ServiceSpecificationImpl
