/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.net.SocketAddress
 *  javax.net.ssl.SSLSession
 */
package io.grpc;

import io.grpc.Attributes;
import java.net.SocketAddress;
import javax.net.ssl.SSLSession;

public final class Grpc {
    public static final Attributes.Key<SocketAddress> TRANSPORT_ATTR_LOCAL_ADDR;
    public static final Attributes.Key<SocketAddress> TRANSPORT_ATTR_REMOTE_ADDR;
    public static final Attributes.Key<SSLSession> TRANSPORT_ATTR_SSL_SESSION;

    static {
        TRANSPORT_ATTR_REMOTE_ADDR = Attributes.Key.create("remote-addr");
        TRANSPORT_ATTR_LOCAL_ADDR = Attributes.Key.create("local-addr");
        TRANSPORT_ATTR_SSL_SESSION = Attributes.Key.create("ssl-session");
    }

    private Grpc() {
    }
}

