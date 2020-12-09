/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.common.base.MoreObjects
 *  com.google.common.base.MoreObjects$ToStringHelper
 *  com.google.common.base.Preconditions
 *  io.grpc.MethodDescriptor$1
 *  io.grpc.MethodDescriptor$Marshaller
 *  io.grpc.MethodDescriptor$ReflectableMarshaller
 *  java.io.InputStream
 *  java.lang.Deprecated
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.concurrent.atomic.AtomicReferenceArray
 *  javax.annotation.CheckReturnValue
 *  javax.annotation.Nullable
 */
package io.grpc;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import io.grpc.MethodDescriptor;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicReferenceArray;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;

public final class MethodDescriptor<ReqT, RespT> {
    private final String fullMethodName;
    private final boolean idempotent;
    private final AtomicReferenceArray<Object> rawMethodNames;
    private final Marshaller<ReqT> requestMarshaller;
    private final Marshaller<RespT> responseMarshaller;
    private final boolean safe;
    private final boolean sampledToLocalTracing;
    @Nullable
    private final Object schemaDescriptor;
    @Nullable
    private final String serviceName;
    private final MethodType type;

    private MethodDescriptor(MethodType methodType, String string2, Marshaller<ReqT> marshaller, Marshaller<RespT> marshaller2, Object object, boolean bl, boolean bl2, boolean bl3) {
        boolean bl4 = true;
        this.rawMethodNames = new AtomicReferenceArray((int)bl4);
        this.type = (MethodType)((Object)Preconditions.checkNotNull((Object)((Object)methodType), (Object)"type"));
        this.fullMethodName = (String)Preconditions.checkNotNull((Object)string2, (Object)"fullMethodName");
        this.serviceName = MethodDescriptor.extractFullServiceName(string2);
        this.requestMarshaller = Preconditions.checkNotNull(marshaller, (Object)"requestMarshaller");
        this.responseMarshaller = Preconditions.checkNotNull(marshaller2, (Object)"responseMarshaller");
        this.schemaDescriptor = object;
        this.idempotent = bl;
        this.safe = bl2;
        this.sampledToLocalTracing = bl3;
        if (bl2 && methodType != MethodType.UNARY) {
            bl4 = false;
        }
        Preconditions.checkArgument((boolean)bl4, (Object)"Only unary methods can be specified safe");
    }

    @Deprecated
    public static <RequestT, ResponseT> MethodDescriptor<RequestT, ResponseT> create(MethodType methodType, String string2, Marshaller<RequestT> marshaller, Marshaller<ResponseT> marshaller2) {
        MethodDescriptor<RequestT, ResponseT> methodDescriptor = new MethodDescriptor<RequestT, ResponseT>(methodType, string2, marshaller, marshaller2, null, false, false, false);
        return methodDescriptor;
    }

    @Nullable
    public static String extractFullServiceName(String string2) {
        int n = ((String)Preconditions.checkNotNull((Object)string2, (Object)"fullMethodName")).lastIndexOf(47);
        if (n == -1) {
            return null;
        }
        return string2.substring(0, n);
    }

    public static String generateFullMethodName(String string2, String string3) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((String)Preconditions.checkNotNull((Object)string2, (Object)"fullServiceName"));
        stringBuilder.append("/");
        stringBuilder.append((String)Preconditions.checkNotNull((Object)string3, (Object)"methodName"));
        return stringBuilder.toString();
    }

    @CheckReturnValue
    public static <ReqT, RespT> Builder<ReqT, RespT> newBuilder() {
        return MethodDescriptor.newBuilder(null, null);
    }

    @CheckReturnValue
    public static <ReqT, RespT> Builder<ReqT, RespT> newBuilder(Marshaller<ReqT> marshaller, Marshaller<RespT> marshaller2) {
        return new Builder().setRequestMarshaller(marshaller).setResponseMarshaller(marshaller2);
    }

    public String getFullMethodName() {
        return this.fullMethodName;
    }

    final Object getRawMethodName(int n) {
        return this.rawMethodNames.get(n);
    }

    public Marshaller<ReqT> getRequestMarshaller() {
        return this.requestMarshaller;
    }

    public Marshaller<RespT> getResponseMarshaller() {
        return this.responseMarshaller;
    }

    @Nullable
    public Object getSchemaDescriptor() {
        return this.schemaDescriptor;
    }

    @Nullable
    public String getServiceName() {
        return this.serviceName;
    }

    public MethodType getType() {
        return this.type;
    }

    public boolean isIdempotent() {
        return this.idempotent;
    }

    public boolean isSafe() {
        return this.safe;
    }

    public boolean isSampledToLocalTracing() {
        return this.sampledToLocalTracing;
    }

    public ReqT parseRequest(InputStream inputStream) {
        return (ReqT)this.requestMarshaller.parse(inputStream);
    }

    public RespT parseResponse(InputStream inputStream) {
        return (RespT)this.responseMarshaller.parse(inputStream);
    }

    final void setRawMethodName(int n, Object object) {
        this.rawMethodNames.lazySet(n, object);
    }

    public InputStream streamRequest(ReqT ReqT) {
        return this.requestMarshaller.stream(ReqT);
    }

    public InputStream streamResponse(RespT RespT) {
        return this.responseMarshaller.stream(RespT);
    }

    @CheckReturnValue
    public Builder<ReqT, RespT> toBuilder() {
        return this.toBuilder(this.requestMarshaller, this.responseMarshaller);
    }

    @CheckReturnValue
    public <NewReqT, NewRespT> Builder<NewReqT, NewRespT> toBuilder(Marshaller<NewReqT> marshaller, Marshaller<NewRespT> marshaller2) {
        return MethodDescriptor.newBuilder().setRequestMarshaller(marshaller).setResponseMarshaller(marshaller2).setType(this.type).setFullMethodName(this.fullMethodName).setIdempotent(this.idempotent).setSafe(this.safe).setSampledToLocalTracing(this.sampledToLocalTracing).setSchemaDescriptor(this.schemaDescriptor);
    }

    public String toString() {
        return MoreObjects.toStringHelper((Object)this).add("fullMethodName", (Object)this.fullMethodName).add("type", (Object)this.type).add("idempotent", this.idempotent).add("safe", this.safe).add("sampledToLocalTracing", this.sampledToLocalTracing).add("requestMarshaller", this.requestMarshaller).add("responseMarshaller", this.responseMarshaller).add("schemaDescriptor", this.schemaDescriptor).omitNullValues().toString();
    }

    public static final class Builder<ReqT, RespT> {
        private String fullMethodName;
        private boolean idempotent;
        private Marshaller<ReqT> requestMarshaller;
        private Marshaller<RespT> responseMarshaller;
        private boolean safe;
        private boolean sampledToLocalTracing;
        private Object schemaDescriptor;
        private MethodType type;

        private Builder() {
        }

        @CheckReturnValue
        public MethodDescriptor<ReqT, RespT> build() {
            MethodDescriptor methodDescriptor = new MethodDescriptor(this.type, this.fullMethodName, this.requestMarshaller, this.responseMarshaller, this.schemaDescriptor, this.idempotent, this.safe, this.sampledToLocalTracing);
            return methodDescriptor;
        }

        public Builder<ReqT, RespT> setFullMethodName(String string2) {
            this.fullMethodName = string2;
            return this;
        }

        public Builder<ReqT, RespT> setIdempotent(boolean bl) {
            this.idempotent = bl;
            return this;
        }

        public Builder<ReqT, RespT> setRequestMarshaller(Marshaller<ReqT> marshaller) {
            this.requestMarshaller = marshaller;
            return this;
        }

        public Builder<ReqT, RespT> setResponseMarshaller(Marshaller<RespT> marshaller) {
            this.responseMarshaller = marshaller;
            return this;
        }

        public Builder<ReqT, RespT> setSafe(boolean bl) {
            this.safe = bl;
            return this;
        }

        public Builder<ReqT, RespT> setSampledToLocalTracing(boolean bl) {
            this.sampledToLocalTracing = bl;
            return this;
        }

        public Builder<ReqT, RespT> setSchemaDescriptor(@Nullable Object object) {
            this.schemaDescriptor = object;
            return this;
        }

        public Builder<ReqT, RespT> setType(MethodType methodType) {
            this.type = methodType;
            return this;
        }
    }

    public static final class MethodType
    extends Enum<MethodType> {
        private static final /* synthetic */ MethodType[] $VALUES;
        public static final /* enum */ MethodType BIDI_STREAMING;
        public static final /* enum */ MethodType CLIENT_STREAMING;
        public static final /* enum */ MethodType SERVER_STREAMING;
        public static final /* enum */ MethodType UNARY;
        public static final /* enum */ MethodType UNKNOWN;

        static {
            UNARY = new MethodType();
            CLIENT_STREAMING = new MethodType();
            SERVER_STREAMING = new MethodType();
            BIDI_STREAMING = new MethodType();
            UNKNOWN = new MethodType();
            MethodType[] arrmethodType = new MethodType[]{UNARY, CLIENT_STREAMING, SERVER_STREAMING, BIDI_STREAMING, UNKNOWN};
            $VALUES = arrmethodType;
        }

        public static MethodType valueOf(String string2) {
            return (MethodType)Enum.valueOf(MethodType.class, (String)string2);
        }

        public static MethodType[] values() {
            return (MethodType[])$VALUES.clone();
        }

        public final boolean clientSendsOneMessage() {
            return this == UNARY || this == SERVER_STREAMING;
            {
            }
        }

        public final boolean serverSendsOneMessage() {
            return this == UNARY || this == CLIENT_STREAMING;
            {
            }
        }
    }

}

