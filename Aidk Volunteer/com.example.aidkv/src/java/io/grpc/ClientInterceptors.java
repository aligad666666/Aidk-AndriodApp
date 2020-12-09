/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Preconditions
 *  io.grpc.ClientInterceptors$1
 *  io.grpc.ClientInterceptors$2
 *  io.grpc.ClientInterceptors$InterceptorChannel
 *  io.grpc.Metadata
 *  io.grpc.MethodDescriptor
 *  io.grpc.MethodDescriptor$Marshaller
 *  io.grpc.Status
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.Iterator
 *  java.util.List
 */
package io.grpc;

import com.google.common.base.Preconditions;
import io.grpc.Channel;
import io.grpc.ClientCall;
import io.grpc.ClientInterceptor;
import io.grpc.ClientInterceptors;
import io.grpc.ForwardingClientCall;
import io.grpc.Metadata;
import io.grpc.MethodDescriptor;
import io.grpc.Status;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/*
 * Exception performing whole class analysis.
 */
public class ClientInterceptors {
    private static final ClientCall<Object, Object> NOOP_CALL;

    static {
        NOOP_CALL = new 2();
    }

    private ClientInterceptors() {
    }

    public static Channel intercept(Channel channel, List<? extends ClientInterceptor> list) {
        Preconditions.checkNotNull((Object)channel, (Object)"channel");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            channel = new /* Unavailable Anonymous Inner Class!! */;
        }
        return channel;
    }

    public static /* varargs */ Channel intercept(Channel channel, ClientInterceptor ... arrclientInterceptor) {
        return ClientInterceptors.intercept(channel, (List<? extends ClientInterceptor>)Arrays.asList((Object[])arrclientInterceptor));
    }

    public static Channel interceptForward(Channel channel, List<? extends ClientInterceptor> list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.reverse((List)arrayList);
        return ClientInterceptors.intercept(channel, (List<? extends ClientInterceptor>)arrayList);
    }

    public static /* varargs */ Channel interceptForward(Channel channel, ClientInterceptor ... arrclientInterceptor) {
        return ClientInterceptors.interceptForward(channel, (List<? extends ClientInterceptor>)Arrays.asList((Object[])arrclientInterceptor));
    }

    static <WReqT, WRespT> ClientInterceptor wrapClientInterceptor(ClientInterceptor clientInterceptor, MethodDescriptor.Marshaller<WReqT> marshaller, MethodDescriptor.Marshaller<WRespT> marshaller2) {
        return new 1(marshaller, marshaller2, clientInterceptor);
    }

}

