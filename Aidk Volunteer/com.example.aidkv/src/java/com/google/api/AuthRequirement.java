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

import com.google.api.AuthRequirementOrBuilder;
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

public final class AuthRequirement
extends GeneratedMessageLite<AuthRequirement, Builder>
implements AuthRequirementOrBuilder {
    public static final int AUDIENCES_FIELD_NUMBER = 2;
    private static final AuthRequirement DEFAULT_INSTANCE = new AuthRequirement();
    private static volatile Parser<AuthRequirement> PARSER;
    public static final int PROVIDER_ID_FIELD_NUMBER = 1;
    private String audiences_ = "";
    private String providerId_ = "";

    static {
        DEFAULT_INSTANCE.makeImmutable();
    }

    private AuthRequirement() {
    }

    private void clearAudiences() {
        this.audiences_ = AuthRequirement.getDefaultInstance().getAudiences();
    }

    private void clearProviderId() {
        this.providerId_ = AuthRequirement.getDefaultInstance().getProviderId();
    }

    public static AuthRequirement getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(AuthRequirement authRequirement) {
        return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)authRequirement);
    }

    public static AuthRequirement parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AuthRequirement)AuthRequirement.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static AuthRequirement parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AuthRequirement)AuthRequirement.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static AuthRequirement parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (AuthRequirement)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static AuthRequirement parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AuthRequirement)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static AuthRequirement parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (AuthRequirement)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static AuthRequirement parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AuthRequirement)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static AuthRequirement parseFrom(InputStream inputStream) throws IOException {
        return (AuthRequirement)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static AuthRequirement parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AuthRequirement)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static AuthRequirement parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (AuthRequirement)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static AuthRequirement parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AuthRequirement)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<AuthRequirement> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setAudiences(String string2) {
        if (string2 != null) {
            this.audiences_ = string2;
            return;
        }
        throw new NullPointerException();
    }

    private void setAudiencesBytes(ByteString byteString) {
        if (byteString != null) {
            AuthRequirement.checkByteStringIsUtf8((ByteString)byteString);
            this.audiences_ = byteString.toStringUtf8();
            return;
        }
        throw new NullPointerException();
    }

    private void setProviderId(String string2) {
        if (string2 != null) {
            this.providerId_ = string2;
            return;
        }
        throw new NullPointerException();
    }

    private void setProviderIdBytes(ByteString byteString) {
        if (byteString != null) {
            AuthRequirement.checkByteStringIsUtf8((ByteString)byteString);
            this.providerId_ = byteString.toStringUtf8();
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
                Class<AuthRequirement> class_ = AuthRequirement.class;
                // MONITORENTER : com.google.api.AuthRequirement.class
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
                            if (n != 18) {
                                if (codedInputStream.skipField(n)) continue;
                                bl = true;
                                continue;
                            }
                            this.audiences_ = codedInputStream.readStringRequireUtf8();
                            continue;
                        }
                        this.providerId_ = codedInputStream.readStringRequireUtf8();
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
                AuthRequirement authRequirement = (AuthRequirement)object2;
                this.providerId_ = visitor.visitString(true ^ this.providerId_.isEmpty(), this.providerId_, true ^ authRequirement.providerId_.isEmpty(), authRequirement.providerId_);
                this.audiences_ = visitor.visitString(true ^ this.audiences_.isEmpty(), this.audiences_, true ^ authRequirement.audiences_.isEmpty(), authRequirement.audiences_);
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
        return new AuthRequirement();
    }

    @Override
    public String getAudiences() {
        return this.audiences_;
    }

    @Override
    public ByteString getAudiencesBytes() {
        return ByteString.copyFromUtf8((String)this.audiences_);
    }

    @Override
    public String getProviderId() {
        return this.providerId_;
    }

    @Override
    public ByteString getProviderIdBytes() {
        return ByteString.copyFromUtf8((String)this.providerId_);
    }

    public int getSerializedSize() {
        int n = this.memoizedSerializedSize;
        if (n != -1) {
            return n;
        }
        boolean bl = this.providerId_.isEmpty();
        int n2 = 0;
        if (!bl) {
            n2 = 0 + CodedOutputStream.computeStringSize((int)1, (String)this.getProviderId());
        }
        if (!this.audiences_.isEmpty()) {
            n2 += CodedOutputStream.computeStringSize((int)2, (String)this.getAudiences());
        }
        this.memoizedSerializedSize = n2;
        return n2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.providerId_.isEmpty()) {
            codedOutputStream.writeString(1, this.getProviderId());
        }
        if (!this.audiences_.isEmpty()) {
            codedOutputStream.writeString(2, this.getAudiences());
        }
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<AuthRequirement, Builder>
    implements AuthRequirementOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder clearAudiences() {
            this.copyOnWrite();
            ((AuthRequirement)this.instance).clearAudiences();
            return this;
        }

        public Builder clearProviderId() {
            this.copyOnWrite();
            ((AuthRequirement)this.instance).clearProviderId();
            return this;
        }

        @Override
        public String getAudiences() {
            return ((AuthRequirement)this.instance).getAudiences();
        }

        @Override
        public ByteString getAudiencesBytes() {
            return ((AuthRequirement)this.instance).getAudiencesBytes();
        }

        @Override
        public String getProviderId() {
            return ((AuthRequirement)this.instance).getProviderId();
        }

        @Override
        public ByteString getProviderIdBytes() {
            return ((AuthRequirement)this.instance).getProviderIdBytes();
        }

        public Builder setAudiences(String string2) {
            this.copyOnWrite();
            ((AuthRequirement)this.instance).setAudiences(string2);
            return this;
        }

        public Builder setAudiencesBytes(ByteString byteString) {
            this.copyOnWrite();
            ((AuthRequirement)this.instance).setAudiencesBytes(byteString);
            return this;
        }

        public Builder setProviderId(String string2) {
            this.copyOnWrite();
            ((AuthRequirement)this.instance).setProviderId(string2);
            return this;
        }

        public Builder setProviderIdBytes(ByteString byteString) {
            this.copyOnWrite();
            ((AuthRequirement)this.instance).setProviderIdBytes(byteString);
            return this;
        }
    }

}

