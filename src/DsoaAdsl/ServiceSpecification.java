/**
 */
package DsoaAdsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link DsoaAdsl.ServiceSpecification#getDefines <em>Defines</em>}</li>
 *   <li>{@link DsoaAdsl.ServiceSpecification#getRealizes <em>Realizes</em>}</li>
 *   <li>{@link DsoaAdsl.ServiceSpecification#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see DsoaAdsl.DsoaAdslPackage#getServiceSpecification()
 * @model
 * @generated
 */
public interface ServiceSpecification extends EObject {
	/**
	 * Returns the value of the '<em><b>Defines</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Defines</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defines</em>' containment reference.
	 * @see #setDefines(NonFunctionalSpecification)
	 * @see DsoaAdsl.DsoaAdslPackage#getServiceSpecification_Defines()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	NonFunctionalSpecification getDefines();

	/**
	 * Sets the value of the '{@link DsoaAdsl.ServiceSpecification#getDefines <em>Defines</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Defines</em>' containment reference.
	 * @see #getDefines()
	 * @generated
	 */
	void setDefines(NonFunctionalSpecification value);

	/**
	 * Returns the value of the '<em><b>Realizes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realizes</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realizes</em>' reference.
	 * @see #setRealizes(ServiceInterface)
	 * @see DsoaAdsl.DsoaAdslPackage#getServiceSpecification_Realizes()
	 * @model required="true"
	 * @generated
	 */
	ServiceInterface getRealizes();

	/**
	 * Sets the value of the '{@link DsoaAdsl.ServiceSpecification#getRealizes <em>Realizes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Realizes</em>' reference.
	 * @see #getRealizes()
	 * @generated
	 */
	void setRealizes(ServiceInterface value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see DsoaAdsl.DsoaAdslPackage#getServiceSpecification_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link DsoaAdsl.ServiceSpecification#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ServiceSpecification
