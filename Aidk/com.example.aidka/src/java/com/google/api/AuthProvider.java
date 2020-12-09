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

import com.google.api.AuthProviderOrBuilder;
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

public final class AuthProvider
extends GeneratedMessageLite<AuthProvider, Builder>
implements AuthProviderOrBuilder {
    public static final int AUDIENCES_FIELD_NUMBER = 4;
    public static final int AUTHORIZATION_URL_FIELD_NUMBER = 5;
    private static final AuthProvider DEFAULT_INSTANCE = new AuthProvider();
    public static final int ID_FIELD_NUMBER = 1;
    public static final int ISSUER_FIELD_NUMBER = 2;
    public static final int JWKS_URI_FIELD_NUMBER = 3;
    private static volatile Parser<AuthProvider> PARSER;
    private String audiences_ = "";
    private String authorizationUrl_ = "";
    private String id_ = "";
    private String issuer_ = "";
    private String jwksUri_ = "";

    static {
        DEFAULT_INSTANCE.makeImmutable();
    }

    private AuthProvider() {
    }

    private void clearAudiences() {
        this.audiences_ = AuthProvider.getDefaultInstance().getAudiences();
    }

    private void clearAuthorizationUrl() {
        this.authorizationUrl_ = AuthProvider.getDefaultInstance().getAuthorizationUrl();
    }

    private void clearId() {
        this.id_ = AuthProvider.getDefaultInstance().getId();
    }

    private void clearIssuer() {
        this.issuer_ = AuthProvider.getDefaultInstance().getIssuer();
    }

    private void clearJwksUri() {
        this.jwksUri_ = AuthProvider.getDefaultInstance().getJwksUri();
    }

    public static AuthProvider getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(AuthProvider authProvider) {
        return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)authProvider);
    }

    public static AuthProvider parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AuthProvider)AuthProvider.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static AuthProvider parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AuthProvider)AuthProvider.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static AuthProvider parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (AuthProvider)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static AuthProvider parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AuthProvider)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static AuthProvider parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (AuthProvider)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static AuthProvider parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AuthProvider)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static AuthProvider parseFrom(InputStream inputStream) throws IOException {
        return (AuthProvider)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static AuthProvider parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AuthProvider)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static AuthProvider parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (AuthProvider)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static AuthProvider parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AuthProvider)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<AuthProvider> parser() {
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
            AuthProvider.checkByteStringIsUtf8((ByteString)byteString);
            this.audiences_ = byteString.toStringUtf8();
            return;
        }
        throw new NullPointerException();
    }

    private void setAuthorizationUrl(String string2) {
        if (string2 != null) {
            this.authorizationUrl_ = string2;
            return;
        }
        throw new NullPointerException();
    }

    private void setAuthorizationUrlBytes(ByteString byteString) {
        if (byteString != null) {
            AuthProvider.checkByteStringIsUtf8((ByteString)byteString);
            this.authorizationUrl_ = byteString.toStringUtf8();
            return;
        }
        throw new NullPointerException();
    }

    private void setId(String string2) {
        if (string2 != null) {
            this.id_ = string2;
            return;
        }
        throw new NullPointerException();
    }

    private void setIdBytes(ByteString byteString) {
        if (byteString != null) {
            AuthProvider.checkByteStringIsUtf8((ByteString)byteString);
            this.id_ = byteString.toStringUtf8();
            return;
        }
        throw new NullPointerException();
    }

    private void setIssuer(String string2) {
        if (string2 != null) {
            this.issuer_ = string2;
            return;
        }
        throw new NullPointerException();
    }

    private void setIssuerBytes(ByteString byteString) {
        if (byteString != null) {
            AuthProvider.checkByteStringIsUtf8((ByteString)byteString);
            this.issuer_ = byteString.toStringUtf8();
            return;
        }
        throw new NullPointerException();
    }

    private void setJwksUri(String string2) {
        if (string2 != null) {
            this.jwksUri_ = string2;
            return;
        }
        throw new NullPointerException();
    }

    private void setJwksUriBytes(ByteString byteString) {
        if (byteString != null) {
            AuthProvider.checkByteStringIsUtf8((ByteString)byteString);
            this.jwksUri_ = byteString.toStringUtf8();
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
                Class<AuthProvider> class_ = AuthProvider.class;
                // MONITORENTER : com.google.api.AuthProvider.class
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
                                if (n != 26) {
                                    if (n != 34) {
                                        if (n != 42) {
                                            if (codedInputStream.skipField(n)) continue;
                                            bl = true;
                                            continue;
                                        }
                                        this.authorizationUrl_ = codedInputStream.readStringRequireUtf8();
                                        continue;
                                    }
                                    this.audiences_ = codedInputStream.readStringRequireUtf8();
                                    continue;
                                }
                                this.jwksUri_ = codedInputStream.readStringRequireUtf8();
                                continue;
                            }
                            this.issuer_ = codedInputStream.readStringRequireUtf8();
                            continue;
                        }
                        this.id_ = codedInputStream.readStringRequireUtf8();
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
                AuthProvider authProvider = (AuthProvider)object2;
                this.id_ = visitor.visitString(true ^ this.id_.isEmpty(), this.id_, true ^ authProvider.id_.isEmpty(), authProvider.id_);
                this.issuer_ = visitor.visitString(true ^ this.issuer_.isEmpty(), this.issuer_, true ^ authProvider.issuer_.isEmpty(), authProvider.issuer_);
                this.jwksUri_ = visitor.visitString(true ^ this.jwksUri_.isEmpty(), this.jwksUri_, true ^ authProvider.jwksUri_.isEmpty(), authProvider.jwksUri_);
                this.audiences_ = visitor.visitString(true ^ this.audiences_.isEmpty(), this.audiences_, true ^ authProvider.audiences_.isEmpty(), authProvider.audiences_);
                this.authorizationUrl_ = visitor.visitString(true ^ this.authorizationUrl_.isEmpty(), this.authorizationUrl_, true ^ authProvider.authorizationUrl_.isEmpty(), authProvider.authorizationUrl_);
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
        return new AuthProvider();
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
    public String getAuthorizationUrl() {
        return this.authorizationUrl_;
    }

    @Override
    public ByteString getAuthorizationUrlBytes() {
        return ByteString.copyFromUtf8((String)this.authorizationUrl_);
    }

    @Override
    public String getId() {
        return this.id_;
    }

    @Override
    public ByteString getIdBytes() {
        return ByteString.copyFromUtf8((String)this.id_);
    }

    @Override
    public String getIssuer() {
        return this.issuer_;
    }

    @Override
    public ByteString getIssuerBytes() {
        return ByteString.copyFromUtf8((String)this.issuer_);
    }

    @Override
    public String getJwksUri() {
        return this.jwksUri_;
    }

    @Override
    public ByteString getJwksUriBytes() {
        return ByteString.copyFromUtf8((String)this.jwksUri_);
    }

    public int getSerializedSize() {
        int n = this.memoizedSerializedSize;
        if (n != -1) {
            return n;
        }
        boolean bl = this.id_.isEmpty();
        int n2 = 0;
        if (!bl) {
            n2 = 0 + CodedOutputStream.computeStringSize((int)1, (String)this.getId());
        }
        if (!this.issuer_.isEmpty()) {
            n2 += CodedOutputStream.computeStringSize((int)2, (String)this.getIssuer());
        }
        if (!this.jwksUri_.isEmpty()) {
            n2 += CodedOutputStream.computeStringSize((int)3, (String)this.getJwksUri());
        }
        if (!this.audiences_.isEmpty()) {
            n2 += CodedOutputStream.computeStringSize((int)4, (String)this.getAudiences());
        }
        if (!this.authorizationUrl_.isEmpty()) {
            n2 += CodedOutputStream.computeStringSize((int)5, (String)this.getAuthorizationUrl());
        }
        this.memoizedSerializedSize = n2;
        return n2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.id_.isEmpty()) {
            codedOutputStream.writeString(1, this.getId());
        }
        if (!this.issuer_.isEmpty()) {
            codedOutputStream.writeString(2, this.getIssuer());
        }
        if (!this.jwksUri_.isEmpty()) {
            codedOutputStream.writeString(3, this.getJwksUri());
        }
        if (!this.audiences_.isEmpty()) {
            codedOutputStream.writeString(4, this.getAudiences());
        }
        if (!this.authorizationUrl_.isEmpty()) {
            codedOutputStream.writeString(5, this.getAuthorizationUrl());
        }
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<AuthProvider, Builder>
    implements AuthProviderOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder clearAudiences() {
            this.copyOnWrite();
            ((AuthProvider)this.instance).clearAudiences();
            return this;
        }

        public Builder clearAuthorizationUrl() {
            this.copyOnWrite();
            ((AuthProvider)this.instance).clearAuthorizationUrl();
            return this;
        }

        public Builder clearId() {
            this.copyOnWrite();
            ((AuthProvider)this.instance).clearId();
            return this;
        }

        public Builder clearIssuer() {
            this.copyOnWrite();
            ((AuthProvider)this.instance).clearIssuer();
            return this;
        }

        public Builder clearJwksUri() {
            this.copyOnWrite();
            ((AuthProvider)this.instance).clearJwksUri();
            return this;
        }

        @Override
        public String getAudiences() {
            return ((AuthProvider)this.instance).getAudiences();
        }

        @Override
        public ByteString getAudiencesBytes() {
            return ((AuthProvider)this.instance).getAudiencesBytes();
        }

        @Override
        public String getAuthorizationUrl() {
            return ((AuthProvider)this.instance).getAuthorizationUrl();
        }

        @Override
        public ByteString getAuthorizationUrlBytes() {
            return ((AuthProvider)this.instance).getAuthorizationUrlBytes();
        }

        @Override
        public String getId() {
            return ((AuthProvider)this.instance).getId();
        }

        @Override
        public ByteString getIdBytes() {
            return ((AuthProvider)this.instance).getIdBytes();
        }

        @Override
        public String getIssuer() {
            return ((AuthProvider)this.instance).getIssuer();
        }

        @Override
        public ByteString getIssuerBytes() {
            return ((AuthProvider)this.instance).getIssuerBytes();
        }

        @Override
        public String getJwksUri() {
            return ((AuthProvider)this.instance).getJwksUri();
        }

        @Override
        public ByteString getJwksUriBytes() {
            return ((AuthProvider)this.instance).getJwksUriBytes();
        }

        public Builder setAudiences(String string2) {
            this.copyOnWrite();
            ((AuthProvider)this.instance).setAudiences(string2);
            return this;
        }

        public Builder setAudiencesBytes(ByteString byteString) {
            this.copyOnWrite();
            ((AuthProvider)this.instance).setAudiencesBytes(byteString);
            return this;
        }

        public Builder setAuthorizationUrl(String string2) {
            this.copyOnWrite();
            ((AuthProvider)this.instance).setAuthorizationUrl(string2);
            return this;
        }

        public Builder setAuthorizationUrlBytes(ByteString byteString) {
            this.copyOnWrite();
            ((AuthProvider)this.instance).setAuthorizationUrlBytes(byteString);
            return this;
        }

        public Builder setId(String string2) {
            this.copyOnWrite();
            ((AuthProvider)this.instance).setId(string2);
            return this;
        }

        public Builder setIdBytes(ByteString byteString) {
            this.copyOnWrite();
            ((AuthProvider)this.instance).setIdBytes(byteString);
            return this;
        }

        public Builder setIssuer(String string2) {
            this.copyOnWrite();
            ((AuthProvider)this.instance).setIssuer(string2);
            return this;
        }

        public Builder setIssuerBytes(ByteString byteString) {
            this.copyOnWrite();
            ((AuthProvider)this.instance).setIssuerBytes(byteString);
            return this;
        }

        public Builder setJwksUri(String string2) {
            this.copyOnWrite();
            ((AuthProvider)this.instance).setJwksUri(string2);
            return this;
        }

        public Builder setJwksUriBytes(ByteString byteString) {
            this.copyOnWrite();
            ((AuthProvider)this.instance).setJwksUriBytes(byteString);
            return this;
        }
    }

}

