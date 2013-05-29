/*
 * Copyright 2008-2011 by AO Industries, Inc.,
 * 7262 Bull Pen Cir, Mobile, Alabama, 36695, U.S.A.
 * All rights reserved.
 */
package com.aoindustries.noc.monitor.common;

/**
 * The different alert levels in the system.
 *
 * @author  AO Industries, Inc.
 */
public enum AlertLevel {
    NONE,
    LOW,
    MEDIUM,
    HIGH,
    CRITICAL,
    UNKNOWN;

    private static final AlertLevel[] alertLevels = values();

    /**
     * Gets the alert level from ordinal without the overhead of a call
     * to <code>values</code>.
     */
    public static AlertLevel fromOrdinal(int ordinal) {
        return alertLevels[ordinal];
    }
}
