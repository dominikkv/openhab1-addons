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
package org.openhab.binding.modbus.internal;

import java.util.ArrayList;

import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

public class ResultCaptor<T> implements Answer<T> {

    private ArrayList<T> results = new ArrayList<>();
    private long waitMillis;

    public ResultCaptor(long waitMillis) {
        this.waitMillis = waitMillis;

    }

    public ArrayList<T> getAllReturnValues() {
        return results;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T answer(InvocationOnMock invocationOnMock) throws Throwable {
        T result = (T) invocationOnMock.callRealMethod();
        synchronized (this.results) {
            results.add(result);
        }
        if (waitMillis > 0) {
            Thread.sleep(waitMillis);
        }
        return result;
    }
}