/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Preconditions
 *  io.grpc.Codec
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.util.concurrent.ConcurrentHashMap
 *  java.util.concurrent.ConcurrentMap
 *  javax.annotation.Nullable
 */
package io.grpc;

import com.google.common.base.Preconditions;
import io.grpc.Codec;
import io.grpc.Compressor;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import javax.annotation.Nullable;

public final class CompressorRegistry {
    private static final CompressorRegistry DEFAULT_INSTANCE;
    private final ConcurrentMap<String, Compressor> compressors = new ConcurrentHashMap();

    static {
        Compressor[] arrcompressor = new Compressor[]{new Codec.Gzip(), Codec.Identity.NONE};
        DEFAULT_INSTANCE = new CompressorRegistry(arrcompressor);
    }

    /* varargs */ CompressorRegistry(Compressor ... arrcompressor) {
        for (Compressor compressor : arrcompressor) {
            this.compressors.put((Object)compressor.getMessageEncoding(), (Object)compressor);
        }
    }

    public static CompressorRegistry getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static CompressorRegistry newEmptyInstance() {
        return new CompressorRegistry(new Compressor[0]);
    }

    @Nullable
    public Compressor lookupCompressor(String string) {
        return (Compressor)this.compressors.get((Object)string);
    }

    public void register(Compressor compressor) {
        String string = compressor.getMessageEncoding();
        Preconditions.checkArgument((boolean)(true ^ string.contains((CharSequence)",")), (Object)"Comma is currently not allowed in message encoding");
        this.compressors.put((Object)string, (Object)compressor);
    }
}

