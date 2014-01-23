/**
 */
package DsoaAdsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link DsoaAdsl.ServiceModel#getRegisters <em>Registers</em>}</li>
 *   <li>{@link DsoaAdsl.ServiceModel#getUri <em>Uri</em>}</li>
 * </ul>
 * </p>
 *
 * @see DsoaAdsl.DsoaAdslPackage#getServiceModel()
 * @model
 * @generated
 */
public interface ServiceModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Registers</b></em>' containment reference list.
	 * The list contents are of type {@link DsoaAdsl.ServiceInterface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Registers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registers</em>' containment reference list.
	 * @see DsoaAdsl.DsoaAdslPackage#getServiceModel_Registers()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<ServiceInterface> getRegisters();

	/**
	 * Returns the value of the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri</em>' attribute.
	 * @see #setUri(String)
	 * @see DsoaAdsl.DsoaAdslPackage#getServiceModel_Uri()
	 * @model required="true"
	 * @generated
	 */
	String getUri();

	/**
	 * Sets the value of the '{@link DsoaAdsl.ServiceModel#getUri <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' attribute.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(String value);

} // ServiceModel
