/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.CodedOutputStream
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageLite
 *  com.google.protobuf.GeneratedMessageLite$Builder
 *  com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser
 *  com.google.protobuf.GeneratedMessageLite$MethodToInvoke
 *  com.google.protobuf.GeneratedMessageLite$Visitor
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.Parser
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.Class
 *  java.lang.NoSuchFieldError
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.UnsupportedOperationException
 */
package com.google.api;

import com.google.api.AuthorizationConfig;
import com.google.api.ExperimentalOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;

public final class Experimental
extends GeneratedMessageLite<Experimental, Builder>
implements ExperimentalOrBuilder {
    public static final int AUTHORIZATION_FIELD_NUMBER = 8;
    private static final Experimental DEFAULT_INSTANCE = new Experimental();
    private static volatile Parser<Experimental> PARSER;
    private AuthorizationConfig authorization_;

    static {
        DEFAULT_INSTANCE.makeImmutable();
    }

    private Experimental() {
    }

    private void clearAuthorization() {
        this.authorization_ = null;
    }

    public static Experimental getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeAuthorization(AuthorizationConfig authorizationConfig) {
        AuthorizationConfig authorizationConfig2 = this.authorization_;
        if (authorizationConfig2 != null && authorizationConfig2 != AuthorizationConfig.getDefaultInstance()) {
            this.authorization_ = (AuthorizationConfig)((AuthorizationConfig.Builder)AuthorizationConfig.newBuilder(this.authorization_).mergeFrom((GeneratedMessageLite)authorizationConfig)).buildPartial();
            return;
        }
        this.authorization_ = authorizationConfig;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(Experimental experimental) {
        return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)experimental);
    }

    public static Experimental parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Experimental)Experimental.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Experimental parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Experimental)Experimental.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Experimental parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Experimental)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static Experimental parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Experimental)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Experimental parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Experimental)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static Experimental parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Experimental)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Experimental parseFrom(InputStream inputStream) throws IOException {
        return (Experimental)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Experimental parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Experimental)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Experimental parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (Experimental)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static Experimental parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Experimental)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<Experimental> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setAuthorization(AuthorizationConfig.Builder builder) {
        this.authorization_ = (AuthorizationConfig)builder.build();
    }

    private void setAuthorization(AuthorizationConfig authorizationConfig) {
        if (authorizationConfig != null) {
            this.authorization_ = authorizationConfig;
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
                Class<Experimental> class_ = Experimental.class;
                // MONITORENTER : com.google.api.Experimental.class
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
                        if (n != 66) {
                            if (codedInputStream.skipField(n)) continue;
                            bl = true;
                            continue;
                        }
                        AuthorizationConfig authorizationConfig = this.authorization_;
                        AuthorizationConfig.Builder builder = null;
                        if (authorizationConfig != null) {
                            builder = (AuthorizationConfig.Builder)this.authorization_.toBuilder();
                        }
                        this.authorization_ = (AuthorizationConfig)codedInputStream.readMessage(AuthorizationConfig.parser(), extensionRegistryLite);
                        if (builder == null) continue;
                        builder.mergeFrom((GeneratedMessageLite)this.authorization_);
                        this.authorization_ = (AuthorizationConfig)builder.buildPartial();
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
                Experimental experimental = (Experimental)object2;
                this.authorization_ = (AuthorizationConfig)visitor.visitMessage((MessageLite)this.authorization_, (MessageLite)experimental.authorization_);
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
        return new Experimental();
    }

    @Override
    public AuthorizationConfig getAuthorization() {
        AuthorizationConfig authorizationConfig = this.authorization_;
        if (authorizationConfig == null) {
            authorizationConfig = AuthorizationConfig.getDefaultInstance();
        }
        return authorizationConfig;
    }

    public int getSerializedSize() {
        int n = this.memoizedSerializedSize;
        if (n != -1) {
            return n;
        }
        AuthorizationConfig authorizationConfig = this.authorization_;
        int n2 = 0;
        if (authorizationConfig != null) {
            n2 = 0 + CodedOutputStream.computeMessageSize((int)8, (MessageLite)this.getAuthorization());
        }
        this.memoizedSerializedSize = n2;
        return n2;
    }

    @Override
    public boolean hasAuthorization() {
        return this.authorization_ != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.authorization_ != null) {
            codedOutputStream.writeMessage(8, (MessageLite)this.getAuthorization());
        }
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<Experimental, Builder>
    implements ExperimentalOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder clearAuthorization() {
            this.copyOnWrite();
            ((Experimental)this.instance).clearAuthorization();
            return this;
        }

        @Override
        public AuthorizationConfig getAuthorization() {
            return ((Experimental)this.instance).getAuthorization();
        }

        @Override
        public boolean hasAuthorization() {
            return ((Experimental)this.instance).hasAuthorization();
        }

        public Builder mergeAuthorization(AuthorizationConfig authorizationConfig) {
            this.copyOnWrite();
            ((Experimental)this.instance).mergeAuthorization(authorizationConfig);
            return this;
        }

        public Builder setAuthorization(AuthorizationConfig.Builder builder) {
            this.copyOnWrite();
            ((Experimental)this.instance).setAuthorization(builder);
            return this;
        }

        public Builder setAuthorization(AuthorizationConfig authorizationConfig) {
            this.copyOnWrite();
            ((Experimental)this.instance).setAuthorization(authorizationConfig);
            return this;
        }
    }

}

