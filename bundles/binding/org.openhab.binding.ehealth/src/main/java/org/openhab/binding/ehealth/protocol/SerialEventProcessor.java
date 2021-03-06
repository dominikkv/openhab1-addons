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
package org.openhab.binding.ehealth.protocol;

/**
 * The SerialEventProcessor has capabilities to process datagrams
 * of type String.
 *
 * @author Thomas Eichstaedt-Engelen
 * @since 1.6.0
 */
public interface SerialEventProcessor {

    /**
     * Is called whenever a new datagram has been read from the serial port
     * 
     * @param data the data being read from the serial port.
     */
    void processSerialData(String data);

}
