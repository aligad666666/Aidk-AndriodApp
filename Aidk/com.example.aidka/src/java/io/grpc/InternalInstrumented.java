/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.common.util.concurrent.ListenableFuture
 *  java.lang.Object
 */
package io.grpc;

import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.InternalWithLogId;

public interface InternalInstrumented<T>
extends InternalWithLogId {
    public ListenableFuture<T> getStats();
}

