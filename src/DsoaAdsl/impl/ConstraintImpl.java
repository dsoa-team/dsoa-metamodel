/**
 */
package DsoaAdsl.impl;

import DsoaAdsl.Attributable;
import DsoaAdsl.Constraint;
import DsoaAdsl.DsoaAdslPackage;
import DsoaAdsl.Metric;
import DsoaAdsl.RelationalOperator;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link DsoaAdsl.impl.ConstraintImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link DsoaAdsl.impl.ConstraintImpl#getThreshold <em>Threshold</em>}</li>
 *   <li>{@link DsoaAdsl.impl.ConstraintImpl#getWeight <em>Weight</em>}</li>
 *   <li>{@link DsoaAdsl.impl.ConstraintImpl#getIsRelatedTo <em>Is Related To</em>}</li>
 *   <li>{@link DsoaAdsl.impl.ConstraintImpl#getConstrains <em>Constrains</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConstraintImpl extends MinimalEObjectImpl.Container implements Constraint {
	/**
	 * The default value of the '{@link #getExpression() <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected static final RelationalOperator EXPRESSION_EDEFAULT = RelationalOperator.LT;

	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected RelationalOperator expression = EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getThreshold() <em>Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreshold()
	 * @generated
	 * @ordered
	 */
	protected static final double THRESHOLD_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getThreshold() <em>Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThreshold()
	 * @generated
	 * @ordered
	 */
	protected double threshold = THRESHOLD_EDEFAULT;

	/**
	 * The default value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected static final int WEIGHT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected int weight = WEIGHT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIsRelatedTo() <em>Is Related To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsRelatedTo()
	 * @generated
	 * @ordered
	 */
	protected Metric isRelatedTo;

	/**
	 * The cached value of the '{@link #getConstrains() <em>Constrains</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstrains()
	 * @generated
	 * @ordered
	 */
	protected Attributable constrains;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DsoaAdslPackage.Literals.CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalOperator getExpression() {
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(RelationalOperator newExpression) {
		RelationalOperator oldExpression = expression;
		expression = newExpression == null ? EXPRESSION_EDEFAULT : newExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsoaAdslPackage.CONSTRAINT__EXPRESSION, oldExpression, expression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getThreshold() {
		return threshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThreshold(double newThreshold) {
		double oldThreshold = threshold;
		threshold = newThreshold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsoaAdslPackage.CONSTRAINT__THRESHOLD, oldThreshold, threshold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWeight() {
		return weight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeight(int newWeight) {
		int oldWeight = weight;
		weight = newWeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsoaAdslPackage.CONSTRAINT__WEIGHT, oldWeight, weight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metric getIsRelatedTo() {
		if (isRelatedTo != null && isRelatedTo.eIsProxy()) {
			InternalEObject oldIsRelatedTo = (InternalEObject)isRelatedTo;
			isRelatedTo = (Metric)eResolveProxy(oldIsRelatedTo);
			if (isRelatedTo != oldIsRelatedTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DsoaAdslPackage.CONSTRAINT__IS_RELATED_TO, oldIsRelatedTo, isRelatedTo));
			}
		}
		return isRelatedTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metric basicGetIsRelatedTo() {
		return isRelatedTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsRelatedTo(Metric newIsRelatedTo) {
		Metric oldIsRelatedTo = isRelatedTo;
		isRelatedTo = newIsRelatedTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsoaAdslPackage.CONSTRAINT__IS_RELATED_TO, oldIsRelatedTo, isRelatedTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attributable getConstrains() {
		if (constrains != null && constrains.eIsProxy()) {
			InternalEObject oldConstrains = (InternalEObject)constrains;
			constrains = (Attributable)eResolveProxy(oldConstrains);
			if (constrains != oldConstrains) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DsoaAdslPackage.CONSTRAINT__CONSTRAINS, oldConstrains, constrains));
			}
		}
		return constrains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attributable basicGetConstrains() {
		return constrains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstrains(Attributable newConstrains) {
		Attributable oldConstrains = constrains;
		constrains = newConstrains;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DsoaAdslPackage.CONSTRAINT__CONSTRAINS, oldConstrains, constrains));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DsoaAdslPackage.CONSTRAINT__EXPRESSION:
				return getExpression();
			case DsoaAdslPackage.CONSTRAINT__THRESHOLD:
				return getThreshold();
			case DsoaAdslPackage.CONSTRAINT__WEIGHT:
				return getWeight();
			case DsoaAdslPackage.CONSTRAINT__IS_RELATED_TO:
				if (resolve) return getIsRelatedTo();
				return basicGetIsRelatedTo();
			case DsoaAdslPackage.CONSTRAINT__CONSTRAINS:
				if (resolve) return getConstrains();
				return basicGetConstrains();
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
			case DsoaAdslPackage.CONSTRAINT__EXPRESSION:
				setExpression((RelationalOperator)newValue);
				return;
			case DsoaAdslPackage.CONSTRAINT__THRESHOLD:
				setThreshold((Double)newValue);
				return;
			case DsoaAdslPackage.CONSTRAINT__WEIGHT:
				setWeight((Integer)newValue);
				return;
			case DsoaAdslPackage.CONSTRAINT__IS_RELATED_TO:
				setIsRelatedTo((Metric)newValue);
				return;
			case DsoaAdslPackage.CONSTRAINT__CONSTRAINS:
				setConstrains((Attributable)newValue);
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
			case DsoaAdslPackage.CONSTRAINT__EXPRESSION:
				setExpression(EXPRESSION_EDEFAULT);
				return;
			case DsoaAdslPackage.CONSTRAINT__THRESHOLD:
				setThreshold(THRESHOLD_EDEFAULT);
				return;
			case DsoaAdslPackage.CONSTRAINT__WEIGHT:
				setWeight(WEIGHT_EDEFAULT);
				return;
			case DsoaAdslPackage.CONSTRAINT__IS_RELATED_TO:
				setIsRelatedTo((Metric)null);
				return;
			case DsoaAdslPackage.CONSTRAINT__CONSTRAINS:
				setConstrains((Attributable)null);
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
			case DsoaAdslPackage.CONSTRAINT__EXPRESSION:
				return expression != EXPRESSION_EDEFAULT;
			case DsoaAdslPackage.CONSTRAINT__THRESHOLD:
				return threshold != THRESHOLD_EDEFAULT;
			case DsoaAdslPackage.CONSTRAINT__WEIGHT:
				return weight != WEIGHT_EDEFAULT;
			case DsoaAdslPackage.CONSTRAINT__IS_RELATED_TO:
				return isRelatedTo != null;
			case DsoaAdslPackage.CONSTRAINT__CONSTRAINS:
				return constrains != null;
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
		result.append(" (expression: ");
		result.append(expression);
		result.append(", threshold: ");
		result.append(threshold);
		result.append(", weight: ");
		result.append(weight);
		result.append(')');
		return result.toString();
	}

} //ConstraintImpl
