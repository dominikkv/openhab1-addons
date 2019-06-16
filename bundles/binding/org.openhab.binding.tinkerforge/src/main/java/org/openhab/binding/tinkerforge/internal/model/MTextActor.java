/**
 * Copyright (c) 2010-2019 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.binding.tinkerforge.internal.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MText Actor</b></em>'.
 *
 * @author Theo Weiss
 * @since 1.3.0
 *        <!-- end-user-doc -->
 *
 *        <p>
 *        The following features are supported:
 *        </p>
 *        <ul>
 *        <li>{@link org.openhab.binding.tinkerforge.internal.model.MTextActor#getText <em>Text</em>}</li>
 *        </ul>
 *
 * @see org.openhab.binding.tinkerforge.internal.model.ModelPackage#getMTextActor()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface MTextActor extends EObject {
    /**
     * Returns the value of the '<em><b>Text</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Text</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * 
     * @return the value of the '<em>Text</em>' attribute.
     * @see #setText(String)
     * @see org.openhab.binding.tinkerforge.internal.model.ModelPackage#getMTextActor_Text()
     * @model unique="false"
     * @generated
     */
    String getText();

    /**
     * Sets the value of the '{@link org.openhab.binding.tinkerforge.internal.model.MTextActor#getText <em>Text</em>}'
     * attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @param value the new value of the '<em>Text</em>' attribute.
     * @see #getText()
     * @generated
     */
    void setText(String value);

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @model textUnique="false"
     * @generated
     */
    void write(String text);

} // MTextActor
