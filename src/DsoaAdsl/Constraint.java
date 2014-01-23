/**
 */
package DsoaAdsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link DsoaAdsl.Constraint#getExpression <em>Expression</em>}</li>
 *   <li>{@link DsoaAdsl.Constraint#getThreshold <em>Threshold</em>}</li>
 *   <li>{@link DsoaAdsl.Constraint#getWeight <em>Weight</em>}</li>
 *   <li>{@link DsoaAdsl.Constraint#getIsRelatedTo <em>Is Related To</em>}</li>
 *   <li>{@link DsoaAdsl.Constraint#getConstrains <em>Constrains</em>}</li>
 * </ul>
 * </p>
 *
 * @see DsoaAdsl.DsoaAdslPackage#getConstraint()
 * @model
 * @generated
 */
public interface Constraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' attribute.
	 * The literals are from the enumeration {@link DsoaAdsl.RelationalOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' attribute.
	 * @see DsoaAdsl.RelationalOperator
	 * @see #setExpression(RelationalOperator)
	 * @see DsoaAdsl.DsoaAdslPackage#getConstraint_Expression()
	 * @model
	 * @generated
	 */
	RelationalOperator getExpression();

	/**
	 * Sets the value of the '{@link DsoaAdsl.Constraint#getExpression <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' attribute.
	 * @see DsoaAdsl.RelationalOperator
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(RelationalOperator value);

	/**
	 * Returns the value of the '<em><b>Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Threshold</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threshold</em>' attribute.
	 * @see #setThreshold(double)
	 * @see DsoaAdsl.DsoaAdslPackage#getConstraint_Threshold()
	 * @model
	 * @generated
	 */
	double getThreshold();

	/**
	 * Sets the value of the '{@link DsoaAdsl.Constraint#getThreshold <em>Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Threshold</em>' attribute.
	 * @see #getThreshold()
	 * @generated
	 */
	void setThreshold(double value);

	/**
	 * Returns the value of the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weight</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight</em>' attribute.
	 * @see #setWeight(int)
	 * @see DsoaAdsl.DsoaAdslPackage#getConstraint_Weight()
	 * @model
	 * @generated
	 */
	int getWeight();

	/**
	 * Sets the value of the '{@link DsoaAdsl.Constraint#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(int value);

	/**
	 * Returns the value of the '<em><b>Is Related To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Related To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Related To</em>' reference.
	 * @see #setIsRelatedTo(Metric)
	 * @see DsoaAdsl.DsoaAdslPackage#getConstraint_IsRelatedTo()
	 * @model required="true"
	 * @generated
	 */
	Metric getIsRelatedTo();

	/**
	 * Sets the value of the '{@link DsoaAdsl.Constraint#getIsRelatedTo <em>Is Related To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Related To</em>' reference.
	 * @see #getIsRelatedTo()
	 * @generated
	 */
	void setIsRelatedTo(Metric value);

	/**
	 * Returns the value of the '<em><b>Constrains</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constrains</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constrains</em>' reference.
	 * @see #setConstrains(Attributable)
	 * @see DsoaAdsl.DsoaAdslPackage#getConstraint_Constrains()
	 * @model required="true"
	 * @generated
	 */
	Attributable getConstrains();

	/**
	 * Sets the value of the '{@link DsoaAdsl.Constraint#getConstrains <em>Constrains</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constrains</em>' reference.
	 * @see #getConstrains()
	 * @generated
	 */
	void setConstrains(Attributable value);

} // Constraint
