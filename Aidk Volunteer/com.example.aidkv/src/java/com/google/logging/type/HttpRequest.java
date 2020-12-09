/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.logging.type.HttpRequest$1
 *  com.google.logging.type.HttpRequestOrBuilder
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.CodedOutputStream
 *  com.google.protobuf.Duration
 *  com.google.protobuf.Duration$Builder
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageLite
 *  com.google.protobuf.GeneratedMessageLite$Builder
 *  com.google.protobuf.GeneratedMessageLite$MethodToInvoke
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.Parser
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.logging.type;

import com.google.logging.type.HttpRequest;
import com.google.logging.type.HttpRequestOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Duration;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;

public final class HttpRequest
extends GeneratedMessageLite<HttpRequest, Builder>
implements HttpRequestOrBuilder {
    public static final int CACHE_FILL_BYTES_FIELD_NUMBER = 12;
    public static final int CACHE_HIT_FIELD_NUMBER = 9;
    public static final int CACHE_LOOKUP_FIELD_NUMBER = 11;
    public static final int CACHE_VALIDATED_WITH_ORIGIN_SERVER_FIELD_NUMBER = 10;
    private static final HttpRequest DEFAULT_INSTANCE = new HttpRequest();
    public static final int LATENCY_FIELD_NUMBER = 14;
    private static volatile Parser<HttpRequest> PARSER;
    public static final int PROTOCOL_FIELD_NUMBER = 15;
    public static final int REFERER_FIELD_NUMBER = 8;
    public static final int REMOTE_IP_FIELD_NUMBER = 7;
    public static final int REQUEST_METHOD_FIELD_NUMBER = 1;
    public static final int REQUEST_SIZE_FIELD_NUMBER = 3;
    public static final int REQUEST_URL_FIELD_NUMBER = 2;
    public static final int RESPONSE_SIZE_FIELD_NUMBER = 5;
    public static final int SERVER_IP_FIELD_NUMBER = 13;
    public static final int STATUS_FIELD_NUMBER = 4;
    public static final int USER_AGENT_FIELD_NUMBER = 6;
    private long cacheFillBytes_;
    private boolean cacheHit_;
    private boolean cacheLookup_;
    private boolean cacheValidatedWithOriginServer_;
    private Duration latency_;
    private String protocol_ = "";
    private String referer_ = "";
    private String remoteIp_ = "";
    private String requestMethod_ = "";
    private long requestSize_;
    private String requestUrl_ = "";
    private long responseSize_;
    private String serverIp_ = "";
    private int status_;
    private String userAgent_ = "";

    static {
        DEFAULT_INSTANCE.makeImmutable();
    }

    private HttpRequest() {
    }

    private void clearCacheFillBytes() {
        this.cacheFillBytes_ = 0L;
    }

    private void clearCacheHit() {
        this.cacheHit_ = false;
    }

    private void clearCacheLookup() {
        this.cacheLookup_ = false;
    }

    private void clearCacheValidatedWithOriginServer() {
        this.cacheValidatedWithOriginServer_ = false;
    }

    private void clearLatency() {
        this.latency_ = null;
    }

    private void clearProtocol() {
        this.protocol_ = HttpRequest.getDefaultInstance().getProtocol();
    }

    private void clearReferer() {
        this.referer_ = HttpRequest.getDefaultInstance().getReferer();
    }

    private void clearRemoteIp() {
        this.remoteIp_ = HttpRequest.getDefaultInstance().getRemoteIp();
    }

    private void clearRequestMethod() {
        this.requestMethod_ = HttpRequest.getDefaultInstance().getRequestMethod();
    }

    private void clearRequestSize() {
        this.requestSize_ = 0L;
    }

    private void clearRequestUrl() {
        this.requestUrl_ = HttpRequest.getDefaultInstance().getRequestUrl();
    }

    private void clearResponseSize() {
        this.responseSize_ = 0L;
    }

    private void clearServerIp() {
        this.serverIp_ = HttpRequest.getDefaultInstance().getServerIp();
    }

    private void clearStatus() {
        this.status_ = 0;
    }

    private void clearUserAgent() {
        this.userAgent_ = HttpRequest.getDefaultInstance().getUserAgent();
    }

    public static HttpRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeLatency(Duration duration) {
        Duration duration2 = this.latency_;
        if (duration2 != null && duration2 != Duration.getDefaultInstance()) {
            this.latency_ = (Duration)((Duration.Builder)Duration.newBuilder((Duration)this.latency_).mergeFrom((GeneratedMessageLite)duration)).buildPartial();
            return;
        }
        this.latency_ = duration;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(HttpRequest httpRequest) {
        return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)httpRequest);
    }

    public static HttpRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (HttpRequest)HttpRequest.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static HttpRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (HttpRequest)HttpRequest.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static HttpRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (HttpRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static HttpRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (HttpRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static HttpRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (HttpRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static HttpRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (HttpRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static HttpRequest parseFrom(InputStream inputStream) throws IOException {
        return (HttpRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static HttpRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (HttpRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static HttpRequest parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (HttpRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static HttpRequest parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (HttpRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<HttpRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setCacheFillBytes(long l) {
        this.cacheFillBytes_ = l;
    }

    private void setCacheHit(boolean bl) {
        this.cacheHit_ = bl;
    }

    private void setCacheLookup(boolean bl) {
        this.cacheLookup_ = bl;
    }

    private void setCacheValidatedWithOriginServer(boolean bl) {
        this.cacheValidatedWithOriginServer_ = bl;
    }

    private void setLatency(Duration.Builder builder) {
        this.latency_ = (Duration)builder.build();
    }

    private void setLatency(Duration duration) {
        if (duration != null) {
            this.latency_ = duration;
            return;
        }
        throw new NullPointerException();
    }

    private void setProtocol(String string) {
        if (string != null) {
            this.protocol_ = string;
            return;
        }
        throw new NullPointerException();
    }

    private void setProtocolBytes(ByteString byteString) {
        if (byteString != null) {
            HttpRequest.checkByteStringIsUtf8((ByteString)byteString);
            this.protocol_ = byteString.toStringUtf8();
            return;
        }
        throw new NullPointerException();
    }

    private void setReferer(String string) {
        if (string != null) {
            this.referer_ = string;
            return;
        }
        throw new NullPointerException();
    }

    private void setRefererBytes(ByteString byteString) {
        if (byteString != null) {
            HttpRequest.checkByteStringIsUtf8((ByteString)byteString);
            this.referer_ = byteString.toStringUtf8();
            return;
        }
        throw new NullPointerException();
    }

    private void setRemoteIp(String string) {
        if (string != null) {
            this.remoteIp_ = string;
            return;
        }
        throw new NullPointerException();
    }

    private void setRemoteIpBytes(ByteString byteString) {
        if (byteString != null) {
            HttpRequest.checkByteStringIsUtf8((ByteString)byteString);
            this.remoteIp_ = byteString.toStringUtf8();
            return;
        }
        throw new NullPointerException();
    }

    private void setRequestMethod(String string) {
        if (string != null) {
            this.requestMethod_ = string;
            return;
        }
        throw new NullPointerException();
    }

    private void setRequestMethodBytes(ByteString byteString) {
        if (byteString != null) {
            HttpRequest.checkByteStringIsUtf8((ByteString)byteString);
            this.requestMethod_ = byteString.toStringUtf8();
            return;
        }
        throw new NullPointerException();
    }

    private void setRequestSize(long l) {
        this.requestSize_ = l;
    }

    private void setRequestUrl(String string) {
        if (string != null) {
            this.requestUrl_ = string;
            return;
        }
        throw new NullPointerException();
    }

    private void setRequestUrlBytes(ByteString byteString) {
        if (byteString != null) {
            HttpRequest.checkByteStringIsUtf8((ByteString)byteString);
            this.requestUrl_ = byteString.toStringUtf8();
            return;
        }
        throw new NullPointerException();
    }

    private void setResponseSize(long l) {
        this.responseSize_ = l;
    }

    private void setServerIp(String string) {
        if (string != null) {
            this.serverIp_ = string;
            return;
        }
        throw new NullPointerException();
    }

    private void setServerIpBytes(ByteString byteString) {
        if (byteString != null) {
            HttpRequest.checkByteStringIsUtf8((ByteString)byteString);
            this.serverIp_ = byteString.toStringUtf8();
            return;
        }
        throw new NullPointerException();
    }

    private void setStatus(int n) {
        this.status_ = n;
    }

    private void setUserAgent(String string) {
        if (string != null) {
            this.userAgent_ = string;
            return;
        }
        throw new NullPointerException();
    }

    private void setUserAgentBytes(ByteString byteString) {
        if (byteString != null) {
            HttpRequest.checkByteStringIsUtf8((ByteString)byteString);
            this.userAgent_ = byteString.toStringUtf8();
            return;
        }
        throw new NullPointerException();
    }

    /*
     * Exception decompiling
     */
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke var1_1, Object var2_2, Object var3_3) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [16[CASE]], but top level block is 3[TRYBLOCK]
        // org.benf.cfr.reader.b.a.a.j.a(Op04StructuredStatement.java:432)
        // org.benf.cfr.reader.b.a.a.j.d(Op04StructuredStatement.java:484)
        // org.benf.cfr.reader.b.a.a.i.a(Op03SimpleStatement.java:607)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:692)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
        // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
        // org.benf.cfr.reader.b.a(Driver.java:128)
        // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
        // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
        // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
        // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
        // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)
        // java.lang.Thread.run(Thread.java:919)
        throw new IllegalStateException("Decompilation failed");
    }

    public long getCacheFillBytes() {
        return this.cacheFillBytes_;
    }

    public boolean getCacheHit() {
        return this.cacheHit_;
    }

    public boolean getCacheLookup() {
        return this.cacheLookup_;
    }

    public boolean getCacheValidatedWithOriginServer() {
        return this.cacheValidatedWithOriginServer_;
    }

    public Duration getLatency() {
        Duration duration = this.latency_;
        if (duration == null) {
            duration = Duration.getDefaultInstance();
        }
        return duration;
    }

    public String getProtocol() {
        return this.protocol_;
    }

    public ByteString getProtocolBytes() {
        return ByteString.copyFromUtf8((String)this.protocol_);
    }

    public String getReferer() {
        return this.referer_;
    }

    public ByteString getRefererBytes() {
        return ByteString.copyFromUtf8((String)this.referer_);
    }

    public String getRemoteIp() {
        return this.remoteIp_;
    }

    public ByteString getRemoteIpBytes() {
        return ByteString.copyFromUtf8((String)this.remoteIp_);
    }

    public String getRequestMethod() {
        return this.requestMethod_;
    }

    public ByteString getRequestMethodBytes() {
        return ByteString.copyFromUtf8((String)this.requestMethod_);
    }

    public long getRequestSize() {
        return this.requestSize_;
    }

    public String getRequestUrl() {
        return this.requestUrl_;
    }

    public ByteString getRequestUrlBytes() {
        return ByteString.copyFromUtf8((String)this.requestUrl_);
    }

    public long getResponseSize() {
        return this.responseSize_;
    }

    public int getSerializedSize() {
        boolean bl;
        boolean bl2;
        long l;
        long l2;
        boolean bl3;
        int n;
        long l3;
        int n2 = this.memoizedSerializedSize;
        if (n2 != -1) {
            return n2;
        }
        boolean bl4 = this.requestMethod_.isEmpty();
        int n3 = 0;
        if (!bl4) {
            n3 = 0 + CodedOutputStream.computeStringSize((int)1, (String)this.getRequestMethod());
        }
        if (!this.requestUrl_.isEmpty()) {
            n3 += CodedOutputStream.computeStringSize((int)2, (String)this.getRequestUrl());
        }
        if ((l = this.requestSize_) != 0L) {
            n3 += CodedOutputStream.computeInt64Size((int)3, (long)l);
        }
        if ((n = this.status_) != 0) {
            n3 += CodedOutputStream.computeInt32Size((int)4, (int)n);
        }
        if ((l2 = this.responseSize_) != 0L) {
            n3 += CodedOutputStream.computeInt64Size((int)5, (long)l2);
        }
        if (!this.userAgent_.isEmpty()) {
            n3 += CodedOutputStream.computeStringSize((int)6, (String)this.getUserAgent());
        }
        if (!this.remoteIp_.isEmpty()) {
            n3 += CodedOutputStream.computeStringSize((int)7, (String)this.getRemoteIp());
        }
        if (!this.referer_.isEmpty()) {
            n3 += CodedOutputStream.computeStringSize((int)8, (String)this.getReferer());
        }
        if (bl3 = this.cacheHit_) {
            n3 += CodedOutputStream.computeBoolSize((int)9, (boolean)bl3);
        }
        if (bl = this.cacheValidatedWithOriginServer_) {
            n3 += CodedOutputStream.computeBoolSize((int)10, (boolean)bl);
        }
        if (bl2 = this.cacheLookup_) {
            n3 += CodedOutputStream.computeBoolSize((int)11, (boolean)bl2);
        }
        if ((l3 = this.cacheFillBytes_) != 0L) {
            n3 += CodedOutputStream.computeInt64Size((int)12, (long)l3);
        }
        if (!this.serverIp_.isEmpty()) {
            n3 += CodedOutputStream.computeStringSize((int)13, (String)this.getServerIp());
        }
        if (this.latency_ != null) {
            n3 += CodedOutputStream.computeMessageSize((int)14, (MessageLite)this.getLatency());
        }
        if (!this.protocol_.isEmpty()) {
            n3 += CodedOutputStream.computeStringSize((int)15, (String)this.getProtocol());
        }
        this.memoizedSerializedSize = n3;
        return n3;
    }

    public String getServerIp() {
        return this.serverIp_;
    }

    public ByteString getServerIpBytes() {
        return ByteString.copyFromUtf8((String)this.serverIp_);
    }

    public int getStatus() {
        return this.status_;
    }

    public String getUserAgent() {
        return this.userAgent_;
    }

    public ByteString getUserAgentBytes() {
        return ByteString.copyFromUtf8((String)this.userAgent_);
    }

    public boolean hasLatency() {
        return this.latency_ != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        long l;
        long l2;
        long l3;
        boolean bl;
        int n;
        boolean bl2;
        boolean bl3;
        if (!this.requestMethod_.isEmpty()) {
            codedOutputStream.writeString(1, this.getRequestMethod());
        }
        if (!this.requestUrl_.isEmpty()) {
            codedOutputStream.writeString(2, this.getRequestUrl());
        }
        if ((l3 = this.requestSize_) != 0L) {
            codedOutputStream.writeInt64(3, l3);
        }
        if ((n = this.status_) != 0) {
            codedOutputStream.writeInt32(4, n);
        }
        if ((l2 = this.responseSize_) != 0L) {
            codedOutputStream.writeInt64(5, l2);
        }
        if (!this.userAgent_.isEmpty()) {
            codedOutputStream.writeString(6, this.getUserAgent());
        }
        if (!this.remoteIp_.isEmpty()) {
            codedOutputStream.writeString(7, this.getRemoteIp());
        }
        if (!this.referer_.isEmpty()) {
            codedOutputStream.writeString(8, this.getReferer());
        }
        if (bl2 = this.cacheHit_) {
            codedOutputStream.writeBool(9, bl2);
        }
        if (bl = this.cacheValidatedWithOriginServer_) {
            codedOutputStream.writeBool(10, bl);
        }
        if (bl3 = this.cacheLookup_) {
            codedOutputStream.writeBool(11, bl3);
        }
        if ((l = this.cacheFillBytes_) != 0L) {
            codedOutputStream.writeInt64(12, l);
        }
        if (!this.serverIp_.isEmpty()) {
            codedOutputStream.writeString(13, this.getServerIp());
        }
        if (this.latency_ != null) {
            codedOutputStream.writeMessage(14, (MessageLite)this.getLatency());
        }
        if (!this.protocol_.isEmpty()) {
            codedOutputStream.writeString(15, this.getProtocol());
        }
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<HttpRequest, Builder>
    implements HttpRequestOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder clearCacheFillBytes() {
            this.copyOnWrite();
            ((HttpRequest)this.instance).clearCacheFillBytes();
            return this;
        }

        public Builder clearCacheHit() {
            this.copyOnWrite();
            ((HttpRequest)this.instance).clearCacheHit();
            return this;
        }

        public Builder clearCacheLookup() {
            this.copyOnWrite();
            ((HttpRequest)this.instance).clearCacheLookup();
            return this;
        }

        public Builder clearCacheValidatedWithOriginServer() {
            this.copyOnWrite();
            ((HttpRequest)this.instance).clearCacheValidatedWithOriginServer();
            return this;
        }

        public Builder clearLatency() {
            this.copyOnWrite();
            ((HttpRequest)this.instance).clearLatency();
            return this;
        }

        public Builder clearProtocol() {
            this.copyOnWrite();
            ((HttpRequest)this.instance).clearProtocol();
            return this;
        }

        public Builder clearReferer() {
            this.copyOnWrite();
            ((HttpRequest)this.instance).clearReferer();
            return this;
        }

        public Builder clearRemoteIp() {
            this.copyOnWrite();
            ((HttpRequest)this.instance).clearRemoteIp();
            return this;
        }

        public Builder clearRequestMethod() {
            this.copyOnWrite();
            ((HttpRequest)this.instance).clearRequestMethod();
            return this;
        }

        public Builder clearRequestSize() {
            this.copyOnWrite();
            ((HttpRequest)this.instance).clearRequestSize();
            return this;
        }

        public Builder clearRequestUrl() {
            this.copyOnWrite();
            ((HttpRequest)this.instance).clearRequestUrl();
            return this;
        }

        public Builder clearResponseSize() {
            this.copyOnWrite();
            ((HttpRequest)this.instance).clearResponseSize();
            return this;
        }

        public Builder clearServerIp() {
            this.copyOnWrite();
            ((HttpRequest)this.instance).clearServerIp();
            return this;
        }

        public Builder clearStatus() {
            this.copyOnWrite();
            ((HttpRequest)this.instance).clearStatus();
            return this;
        }

        public Builder clearUserAgent() {
            this.copyOnWrite();
            ((HttpRequest)this.instance).clearUserAgent();
            return this;
        }

        public long getCacheFillBytes() {
            return ((HttpRequest)this.instance).getCacheFillBytes();
        }

        public boolean getCacheHit() {
            return ((HttpRequest)this.instance).getCacheHit();
        }

        public boolean getCacheLookup() {
            return ((HttpRequest)this.instance).getCacheLookup();
        }

        public boolean getCacheValidatedWithOriginServer() {
            return ((HttpRequest)this.instance).getCacheValidatedWithOriginServer();
        }

        public Duration getLatency() {
            return ((HttpRequest)this.instance).getLatency();
        }

        public String getProtocol() {
            return ((HttpRequest)this.instance).getProtocol();
        }

        public ByteString getProtocolBytes() {
            return ((HttpRequest)this.instance).getProtocolBytes();
        }

        public String getReferer() {
            return ((HttpRequest)this.instance).getReferer();
        }

        public ByteString getRefererBytes() {
            return ((HttpRequest)this.instance).getRefererBytes();
        }

        public String getRemoteIp() {
            return ((HttpRequest)this.instance).getRemoteIp();
        }

        public ByteString getRemoteIpBytes() {
            return ((HttpRequest)this.instance).getRemoteIpBytes();
        }

        public String getRequestMethod() {
            return ((HttpRequest)this.instance).getRequestMethod();
        }

        public ByteString getRequestMethodBytes() {
            return ((HttpRequest)this.instance).getRequestMethodBytes();
        }

        public long getRequestSize() {
            return ((HttpRequest)this.instance).getRequestSize();
        }

        public String getRequestUrl() {
            return ((HttpRequest)this.instance).getRequestUrl();
        }

        public ByteString getRequestUrlBytes() {
            return ((HttpRequest)this.instance).getRequestUrlBytes();
        }

        public long getResponseSize() {
            return ((HttpRequest)this.instance).getResponseSize();
        }

        public String getServerIp() {
            return ((HttpRequest)this.instance).getServerIp();
        }

        public ByteString getServerIpBytes() {
            return ((HttpRequest)this.instance).getServerIpBytes();
        }

        public int getStatus() {
            return ((HttpRequest)this.instance).getStatus();
        }

        public String getUserAgent() {
            return ((HttpRequest)this.instance).getUserAgent();
        }

        public ByteString getUserAgentBytes() {
            return ((HttpRequest)this.instance).getUserAgentBytes();
        }

        public boolean hasLatency() {
            return ((HttpRequest)this.instance).hasLatency();
        }

        public Builder mergeLatency(Duration duration) {
            this.copyOnWrite();
            ((HttpRequest)this.instance).mergeLatency(duration);
            return this;
        }

        public Builder setCacheFillBytes(long l) {
            this.copyOnWrite();
            ((HttpRequest)this.instance).setCacheFillBytes(l);
            return this;
        }

        public Builder setCacheHit(boolean bl) {
            this.copyOnWrite();
            ((HttpRequest)this.instance).setCacheHit(bl);
            return this;
        }

        public Builder setCacheLookup(boolean bl) {
            this.copyOnWrite();
            ((HttpRequest)this.instance).setCacheLookup(bl);
            return this;
        }

        public Builder setCacheValidatedWithOriginServer(boolean bl) {
            this.copyOnWrite();
            ((HttpRequest)this.instance).setCacheValidatedWithOriginServer(bl);
            return this;
        }

        public Builder setLatency(Duration.Builder builder) {
            this.copyOnWrite();
            ((HttpRequest)this.instance).setLatency(builder);
            return this;
        }

        public Builder setLatency(Duration duration) {
            this.copyOnWrite();
            ((HttpRequest)this.instance).setLatency(duration);
            return this;
        }

        public Builder setProtocol(String string) {
            this.copyOnWrite();
            ((HttpRequest)this.instance).setProtocol(string);
            return this;
        }

        public Builder setProtocolBytes(ByteString byteString) {
            this.copyOnWrite();
            ((HttpRequest)this.instance).setProtocolBytes(byteString);
            return this;
        }

        public Builder setReferer(String string) {
            this.copyOnWrite();
            ((HttpRequest)this.instance).setReferer(string);
            return this;
        }

        public Builder setRefererBytes(ByteString byteString) {
            this.copyOnWrite();
            ((HttpRequest)this.instance).setRefererBytes(byteString);
            return this;
        }

        public Builder setRemoteIp(String string) {
            this.copyOnWrite();
            ((HttpRequest)this.instance).setRemoteIp(string);
            return this;
        }

        public Builder setRemoteIpBytes(ByteString byteString) {
            this.copyOnWrite();
            ((HttpRequest)this.instance).setRemoteIpBytes(byteString);
            return this;
        }

        public Builder setRequestMethod(String string) {
            this.copyOnWrite();
            ((HttpRequest)this.instance).setRequestMethod(string);
            return this;
        }

        public Builder setRequestMethodBytes(ByteString byteString) {
            this.copyOnWrite();
            ((HttpRequest)this.instance).setRequestMethodBytes(byteString);
            return this;
        }

        public Builder setRequestSize(long l) {
            this.copyOnWrite();
            ((HttpRequest)this.instance).setRequestSize(l);
            return this;
        }

        public Builder setRequestUrl(String string) {
            this.copyOnWrite();
            ((HttpRequest)this.instance).setRequestUrl(string);
            return this;
        }

        public Builder setRequestUrlBytes(ByteString byteString) {
            this.copyOnWrite();
            ((HttpRequest)this.instance).setRequestUrlBytes(byteString);
            return this;
        }

        public Builder setResponseSize(long l) {
            this.copyOnWrite();
            ((HttpRequest)this.instance).setResponseSize(l);
            return this;
        }

        public Builder setServerIp(String string) {
            this.copyOnWrite();
            ((HttpRequest)this.instance).setServerIp(string);
            return this;
        }

        public Builder setServerIpBytes(ByteString byteString) {
            this.copyOnWrite();
            ((HttpRequest)this.instance).setServerIpBytes(byteString);
            return this;
        }

        public Builder setStatus(int n) {
            this.copyOnWrite();
            ((HttpRequest)this.instance).setStatus(n);
            return this;
        }

        public Builder setUserAgent(String string) {
            this.copyOnWrite();
            ((HttpRequest)this.instance).setUserAgent(string);
            return this;
        }

        public Builder setUserAgentBytes(ByteString byteString) {
            this.copyOnWrite();
            ((HttpRequest)this.instance).setUserAgentBytes(byteString);
            return this;
        }
    }

}

