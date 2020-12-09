/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.CodedOutputStream
 *  com.google.protobuf.Duration
 *  com.google.protobuf.Duration$Builder
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageLite
 *  com.google.protobuf.GeneratedMessageLite$Builder
 *  com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser
 *  com.google.protobuf.GeneratedMessageLite$MethodToInvoke
 *  com.google.protobuf.GeneratedMessageLite$Visitor
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.Parser
 *  com.google.rpc.RetryInfo$1
 *  com.google.rpc.RetryInfoOrBuilder
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.Class
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.UnsupportedOperationException
 */
package com.google.rpc;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Duration;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.rpc.RetryInfo;
import com.google.rpc.RetryInfoOrBuilder;
import java.io.IOException;
import java.io.InputStream;

public final class RetryInfo
extends GeneratedMessageLite<RetryInfo, Builder>
implements RetryInfoOrBuilder {
    private static final RetryInfo DEFAULT_INSTANCE = new RetryInfo();
    private static volatile Parser<RetryInfo> PARSER;
    public static final int RETRY_DELAY_FIELD_NUMBER = 1;
    private Duration retryDelay_;

    static {
        DEFAULT_INSTANCE.makeImmutable();
    }

    private RetryInfo() {
    }

    private void clearRetryDelay() {
        this.retryDelay_ = null;
    }

    public static RetryInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeRetryDelay(Duration duration) {
        Duration duration2 = this.retryDelay_;
        if (duration2 != null && duration2 != Duration.getDefaultInstance()) {
            this.retryDelay_ = (Duration)((Duration.Builder)Duration.newBuilder((Duration)this.retryDelay_).mergeFrom((GeneratedMessageLite)duration)).buildPartial();
            return;
        }
        this.retryDelay_ = duration;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(RetryInfo retryInfo) {
        return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)retryInfo);
    }

    public static RetryInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RetryInfo)RetryInfo.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static RetryInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RetryInfo)RetryInfo.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static RetryInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (RetryInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static RetryInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RetryInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static RetryInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (RetryInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static RetryInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RetryInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static RetryInfo parseFrom(InputStream inputStream) throws IOException {
        return (RetryInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static RetryInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RetryInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static RetryInfo parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (RetryInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static RetryInfo parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RetryInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<RetryInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setRetryDelay(Duration.Builder builder) {
        this.retryDelay_ = (Duration)builder.build();
    }

    private void setRetryDelay(Duration duration) {
        if (duration != null) {
            this.retryDelay_ = duration;
            return;
        }
        throw new NullPointerException();
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object object, Object object2) {
        switch (1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 8: {
                if (PARSER != null) return PARSER;
                Class<RetryInfo> class_ = RetryInfo.class;
                // MONITORENTER : com.google.rpc.RetryInfo.class
                if (PARSER == null) {
                    PARSER = new GeneratedMessageLite.DefaultInstanceBasedParser((GeneratedMessageLite)DEFAULT_INSTANCE);
                }
                // MONITOREXIT : class_
                return PARSER;
            }
            case 6: {
                CodedInputStream codedInputStream = (CodedInputStream)object;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite)object2;
                boolean bl = false;
                while (!bl) {
                    int n = codedInputStream.readTag();
                    if (n != 0) {
                        if (n != 10) {
                            if (codedInputStream.skipField(n)) continue;
                            bl = true;
                            continue;
                        }
                        Duration duration = this.retryDelay_;
                        Duration.Builder builder = null;
                        if (duration != null) {
                            builder = (Duration.Builder)this.retryDelay_.toBuilder();
                        }
                        this.retryDelay_ = (Duration)codedInputStream.readMessage(Duration.parser(), extensionRegistryLite);
                        if (builder == null) continue;
                        builder.mergeFrom((GeneratedMessageLite)this.retryDelay_);
                        this.retryDelay_ = (Duration)builder.buildPartial();
                        continue;
                    }
                    bl = true;
                    continue;
                    catch (IOException iOException) {
                        throw new RuntimeException((Throwable)new InvalidProtocolBufferException(iOException.getMessage()).setUnfinishedMessage((MessageLite)this));
                    }
                    catch (InvalidProtocolBufferException invalidProtocolBufferException) {
                        throw new RuntimeException((Throwable)invalidProtocolBufferException.setUnfinishedMessage((MessageLite)this));
                    }
                }
                return DEFAULT_INSTANCE;
            }
            case 7: {
                return DEFAULT_INSTANCE;
            }
            case 5: {
                GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor)object;
                RetryInfo retryInfo = (RetryInfo)((Object)object2);
                this.retryDelay_ = (Duration)visitor.visitMessage((MessageLite)this.retryDelay_, (MessageLite)retryInfo.retryDelay_);
                return this;
            }
            case 4: {
                return new Builder();
            }
            case 3: {
                return null;
            }
            case 2: {
                return DEFAULT_INSTANCE;
            }
            case 1: 
        }
        return new RetryInfo();
    }

    public Duration getRetryDelay() {
        Duration duration = this.retryDelay_;
        if (duration == null) {
            duration = Duration.getDefaultInstance();
        }
        return duration;
    }

    public int getSerializedSize() {
        int n = this.memoizedSerializedSize;
        if (n != -1) {
            return n;
        }
        Duration duration = this.retryDelay_;
        int n2 = 0;
        if (duration != null) {
            n2 = 0 + CodedOutputStream.computeMessageSize((int)1, (MessageLite)this.getRetryDelay());
        }
        this.memoizedSerializedSize = n2;
        return n2;
    }

    public boolean hasRetryDelay() {
        return this.retryDelay_ != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.retryDelay_ != null) {
            codedOutputStream.writeMessage(1, (MessageLite)this.getRetryDelay());
        }
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<RetryInfo, Builder>
    implements RetryInfoOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder clearRetryDelay() {
            this.copyOnWrite();
            ((RetryInfo)this.instance).clearRetryDelay();
            return this;
        }

        public Duration getRetryDelay() {
            return ((RetryInfo)this.instance).getRetryDelay();
        }

        public boolean hasRetryDelay() {
            return ((RetryInfo)this.instance).hasRetryDelay();
        }

        public Builder mergeRetryDelay(Duration duration) {
            this.copyOnWrite();
            ((RetryInfo)this.instance).mergeRetryDelay(duration);
            return this;
        }

        public Builder setRetryDelay(Duration.Builder builder) {
            this.copyOnWrite();
            ((RetryInfo)this.instance).setRetryDelay(builder);
            return this;
        }

        public Builder setRetryDelay(Duration duration) {
            this.copyOnWrite();
            ((RetryInfo)this.instance).setRetryDelay(duration);
            return this;
        }
    }

}

