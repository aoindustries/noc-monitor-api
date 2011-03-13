/*
 * Copyright 2008-2011 by AO Industries, Inc.,
 * 7262 Bull Pen Cir, Mobile, Alabama, 36695, U.S.A.
 * All rights reserved.
 */
package com.aoindustries.noc.common;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Encapsulates a time span in milliseconds.
 *
 * @author  AO Industries, Inc.
 */
final public class TimeSpan implements Serializable {

    private static final long serialVersionUID = 1;

    final private long timeSpan;

    public TimeSpan(long timeSpan) {
        this.timeSpan = timeSpan;
    }

    /**
     * Gets the time span in milliseconds.
     */
    public long getTimeSpan() {
        return timeSpan;
    }

    @Override
    public String toString() {
        return ApplicationResourcesAccessor.accessor.getMessage("TimeSpan.toString", BigDecimal.valueOf(timeSpan, 3));
    }
}
