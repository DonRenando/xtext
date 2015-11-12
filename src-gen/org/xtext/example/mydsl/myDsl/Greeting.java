/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Greeting</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Greeting#getQuestion <em>Question</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Greeting#getReponses <em>Reponses</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getGreeting()
 * @model
 * @generated
 */
public interface Greeting extends EObject
{
  /**
   * Returns the value of the '<em><b>Question</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Question</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Question</em>' attribute.
   * @see #setQuestion(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getGreeting_Question()
   * @model
   * @generated
   */
  String getQuestion();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Greeting#getQuestion <em>Question</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Question</em>' attribute.
   * @see #getQuestion()
   * @generated
   */
  void setQuestion(String value);

  /**
   * Returns the value of the '<em><b>Reponses</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Reponse}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reponses</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reponses</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getGreeting_Reponses()
   * @model containment="true"
   * @generated
   */
  EList<Reponse> getReponses();

} // Greeting
