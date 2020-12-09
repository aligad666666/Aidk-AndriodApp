/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package io.grpc;

public final class ConnectivityState
extends Enum<ConnectivityState> {
    private static final /* synthetic */ ConnectivityState[] $VALUES;
    public static final /* enum */ ConnectivityState CONNECTING = new ConnectivityState();
    public static final /* enum */ ConnectivityState IDLE;
    public static final /* enum */ ConnectivityState READY;
    public static final /* enum */ ConnectivityState SHUTDOWN;
    public static final /* enum */ ConnectivityState TRANSIENT_FAILURE;

    static {
        READY = new ConnectivityState();
        TRANSIENT_FAILURE = new ConnectivityState();
        IDLE = new ConnectivityState();
        SHUTDOWN = new ConnectivityState();
        ConnectivityState[] arrconnectivityState = new ConnectivityState[]{CONNECTING, READY, TRANSIENT_FAILURE, IDLE, SHUTDOWN};
        $VALUES = arrconnectivityState;
    }

    public static ConnectivityState valueOf(String string) {
        return (ConnectivityState)Enum.valueOf(ConnectivityState.class, (String)string);
    }

    public static ConnectivityState[] values() {
        return (ConnectivityState[])$VALUES.clone();
    }
}

