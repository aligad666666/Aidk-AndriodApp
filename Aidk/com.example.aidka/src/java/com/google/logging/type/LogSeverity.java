/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.Internal
 *  com.google.protobuf.Internal$EnumLite
 *  com.google.protobuf.Internal$EnumLiteMap
 *  java.lang.Deprecated
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.logging.type;

import com.google.protobuf.Internal;

public final class LogSeverity
extends Enum<LogSeverity>
implements Internal.EnumLite {
    private static final /* synthetic */ LogSeverity[] $VALUES;
    public static final /* enum */ LogSeverity ALERT;
    public static final int ALERT_VALUE = 700;
    public static final /* enum */ LogSeverity CRITICAL;
    public static final int CRITICAL_VALUE = 600;
    public static final /* enum */ LogSeverity DEBUG;
    public static final int DEBUG_VALUE = 100;
    public static final /* enum */ LogSeverity DEFAULT;
    public static final int DEFAULT_VALUE = 0;
    public static final /* enum */ LogSeverity EMERGENCY;
    public static final int EMERGENCY_VALUE = 800;
    public static final /* enum */ LogSeverity ERROR;
    public static final int ERROR_VALUE = 500;
    public static final /* enum */ LogSeverity INFO;
    public static final int INFO_VALUE = 200;
    public static final /* enum */ LogSeverity NOTICE;
    public static final int NOTICE_VALUE = 300;
    public static final /* enum */ LogSeverity UNRECOGNIZED;
    public static final /* enum */ LogSeverity WARNING;
    public static final int WARNING_VALUE = 400;
    private static final Internal.EnumLiteMap<LogSeverity> internalValueMap;
    private final int value;

    static {
        DEFAULT = new LogSeverity(0);
        DEBUG = new LogSeverity(100);
        INFO = new LogSeverity(200);
        NOTICE = new LogSeverity(300);
        WARNING = new LogSeverity(400);
        ERROR = new LogSeverity(500);
        CRITICAL = new LogSeverity(600);
        ALERT = new LogSeverity(700);
        EMERGENCY = new LogSeverity(800);
        UNRECOGNIZED = new LogSeverity(-1);
        LogSeverity[] arrlogSeverity = new LogSeverity[]{DEFAULT, DEBUG, INFO, NOTICE, WARNING, ERROR, CRITICAL, ALERT, EMERGENCY, UNRECOGNIZED};
        $VALUES = arrlogSeverity;
        internalValueMap = new Internal.EnumLiteMap<LogSeverity>(){

            public LogSeverity findValueByNumber(int n) {
                return LogSeverity.forNumber(n);
            }
        };
    }

    private LogSeverity(int n2) {
        this.value = n2;
    }

    public static LogSeverity forNumber(int n) {
        if (n != 0) {
            if (n != 100) {
                if (n != 200) {
                    if (n != 300) {
                        if (n != 400) {
                            if (n != 500) {
                                if (n != 600) {
                                    if (n != 700) {
                                        if (n != 800) {
                                            return null;
                                        }
                                        return EMERGENCY;
                                    }
                                    return ALERT;
                                }
                                return CRITICAL;
                            }
                            return ERROR;
                        }
                        return WARNING;
                    }
                    return NOTICE;
                }
                return INFO;
            }
            return DEBUG;
        }
        return DEFAULT;
    }

    public static Internal.EnumLiteMap<LogSeverity> internalGetValueMap() {
        return internalValueMap;
    }

    @Deprecated
    public static LogSeverity valueOf(int n) {
        return LogSeverity.forNumber(n);
    }

    public static LogSeverity valueOf(String string) {
        return (LogSeverity)Enum.valueOf(LogSeverity.class, (String)string);
    }

    public static LogSeverity[] values() {
        return (LogSeverity[])$VALUES.clone();
    }

    public final int getNumber() {
        return this.value;
    }

}

