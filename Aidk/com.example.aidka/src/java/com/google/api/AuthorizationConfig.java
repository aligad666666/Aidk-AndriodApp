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

import com.google.api.AuthorizationConfigOrBuilder;
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

public final class AuthorizationConfig
extends GeneratedMessageLite<AuthorizationConfig, Builder>
implements AuthorizationConfigOrBuilder {
    private static final AuthorizationConfig DEFAULT_INSTANCE = new AuthorizationConfig();
    private static volatile Parser<AuthorizationConfig> PARSER;
    public static final int PROVIDER_FIELD_NUMBER = 1;
    private String provider_ = "";

    static {
        DEFAULT_INSTANCE.makeImmutable();
    }

    private AuthorizationConfig() {
    }

    private void clearProvider() {
        this.provider_ = AuthorizationConfig.getDefaultInstance().getProvider();
    }

    public static AuthorizationConfig getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(AuthorizationConfig authorizationConfig) {
        return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)authorizationConfig);
    }

    public static AuthorizationConfig parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AuthorizationConfig)AuthorizationConfig.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static AuthorizationConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AuthorizationConfig)AuthorizationConfig.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static AuthorizationConfig parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (AuthorizationConfig)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static AuthorizationConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AuthorizationConfig)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static AuthorizationConfig parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (AuthorizationConfig)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static AuthorizationConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AuthorizationConfig)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static AuthorizationConfig parseFrom(InputStream inputStream) throws IOException {
        return (AuthorizationConfig)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static AuthorizationConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AuthorizationConfig)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static AuthorizationConfig parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (AuthorizationConfig)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static AuthorizationConfig parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AuthorizationConfig)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<AuthorizationConfig> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setProvider(String string2) {
        if (string2 != null) {
            this.provider_ = string2;
            return;
        }
        throw new NullPointerException();
    }

    private void setProviderBytes(ByteString byteString) {
        if (byteString != null) {
            AuthorizationConfig.checkByteStringIsUtf8((ByteString)byteString);
            this.provider_ = byteString.toStringUtf8();
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
                Class<AuthorizationConfig> class_ = AuthorizationConfig.class;
                // MONITORENTER : com.google.api.AuthorizationConfig.class
                if (PARSER == null) {
                    PARSER = new GeneratedMessageLite.DefaultInstanceBasedParser((GeneratedMessageLite)DEFAULT_INSTANCE);
                }
                // MONITOREXIT : class_
                return PARSER;
            }
            case 6: {
                CodedInputStream codedInputStream = (CodedInputStream)object;
                (ExtensionRegistryLite)object2;
                boolean bl = false;
                while (!bl) {
                    int n = codedInputStream.readTag();
                    if (n != 0) {
                        if (n != 10) {
                            if (codedInputStream.skipField(n)) continue;
                            bl = true;
                            continue;
                        }
                        this.provider_ = codedInputStream.readStringRequireUtf8();
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
                AuthorizationConfig authorizationConfig = (AuthorizationConfig)object2;
                this.provider_ = visitor.visitString(true ^ this.provider_.isEmpty(), this.provider_, true ^ authorizationConfig.provider_.isEmpty(), authorizationConfig.provider_);
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
        return new AuthorizationConfig();
    }

    @Override
    public String getProvider() {
        return this.provider_;
    }

    @Override
    public ByteString getProviderBytes() {
        return ByteString.copyFromUtf8((String)this.provider_);
    }

    public int getSerializedSize() {
        int n = this.memoizedSerializedSize;
        if (n != -1) {
            return n;
        }
        boolean bl = this.provider_.isEmpty();
        int n2 = 0;
        if (!bl) {
            n2 = 0 + CodedOutputStream.computeStringSize((int)1, (String)this.getProvider());
        }
        this.memoizedSerializedSize = n2;
        return n2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.provider_.isEmpty()) {
            codedOutputStream.writeString(1, this.getProvider());
        }
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<AuthorizationConfig, Builder>
    implements AuthorizationConfigOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder clearProvider() {
            this.copyOnWrite();
            ((AuthorizationConfig)this.instance).clearProvider();
            return this;
        }

        @Override
        public String getProvider() {
            return ((AuthorizationConfig)this.instance).getProvider();
        }

        @Override
        public ByteString getProviderBytes() {
            return ((AuthorizationConfig)this.instance).getProviderBytes();
        }

        public Builder setProvider(String string2) {
            this.copyOnWrite();
            ((AuthorizationConfig)this.instance).setProvider(string2);
            return this;
        }

        public Builder setProviderBytes(ByteString byteString) {
            this.copyOnWrite();
            ((AuthorizationConfig)this.instance).setProviderBytes(byteString);
            return this;
        }
    }

}

