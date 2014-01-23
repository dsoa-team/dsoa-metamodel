/**
 */
package DsoaAdsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Non Functional Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link DsoaAdsl.NonFunctionalSpecification#getSpecifies <em>Specifies</em>}</li>
 * </ul>
 * </p>
 *
 * @see DsoaAdsl.DsoaAdslPackage#getNonFunctionalSpecification()
 * @model
 * @generated
 */
public interface NonFunctionalSpecification extends EObject {
	/**
	 * Returns the value of the '<em><b>Specifies</b></em>' containment reference list.
	 * The list contents are of type {@link DsoaAdsl.Constraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specifies</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specifies</em>' containment reference list.
	 * @see DsoaAdsl.DsoaAdslPackage#getNonFunctionalSpecification_Specifies()
	 * @model containment="true" resolveProxies="true" required="true"
	 * @generated
	 */
	EList<Constraint> getSpecifies();

} // NonFunctionalSpecification
