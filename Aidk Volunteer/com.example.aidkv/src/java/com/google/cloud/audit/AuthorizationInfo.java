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
package com.google.cloud.audit;

import com.google.cloud.audit.AuthorizationInfoOrBuilder;
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

public final class AuthorizationInfo
extends GeneratedMessageLite<AuthorizationInfo, Builder>
implements AuthorizationInfoOrBuilder {
    private static final AuthorizationInfo DEFAULT_INSTANCE = new AuthorizationInfo();
    public static final int GRANTED_FIELD_NUMBER = 3;
    private static volatile Parser<AuthorizationInfo> PARSER;
    public static final int PERMISSION_FIELD_NUMBER = 2;
    public static final int RESOURCE_FIELD_NUMBER = 1;
    private boolean granted_;
    private String permission_ = "";
    private String resource_ = "";

    static {
        DEFAULT_INSTANCE.makeImmutable();
    }

    private AuthorizationInfo() {
    }

    private void clearGranted() {
        this.granted_ = false;
    }

    private void clearPermission() {
        this.permission_ = AuthorizationInfo.getDefaultInstance().getPermission();
    }

    private void clearResource() {
        this.resource_ = AuthorizationInfo.getDefaultInstance().getResource();
    }

    public static AuthorizationInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(AuthorizationInfo authorizationInfo) {
        return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)authorizationInfo);
    }

    public static AuthorizationInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AuthorizationInfo)AuthorizationInfo.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static AuthorizationInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AuthorizationInfo)AuthorizationInfo.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static AuthorizationInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (AuthorizationInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static AuthorizationInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AuthorizationInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static AuthorizationInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (AuthorizationInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static AuthorizationInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AuthorizationInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static AuthorizationInfo parseFrom(InputStream inputStream) throws IOException {
        return (AuthorizationInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static AuthorizationInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AuthorizationInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static AuthorizationInfo parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (AuthorizationInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static AuthorizationInfo parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AuthorizationInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<AuthorizationInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setGranted(boolean bl) {
        this.granted_ = bl;
    }

    private void setPermission(String string2) {
        if (string2 != null) {
            this.permission_ = string2;
            return;
        }
        throw new NullPointerException();
    }

    private void setPermissionBytes(ByteString byteString) {
        if (byteString != null) {
            AuthorizationInfo.checkByteStringIsUtf8((ByteString)byteString);
            this.permission_ = byteString.toStringUtf8();
            return;
        }
        throw new NullPointerException();
    }

    private void setResource(String string2) {
        if (string2 != null) {
            this.resource_ = string2;
            return;
        }
        throw new NullPointerException();
    }

    private void setResourceBytes(ByteString byteString) {
        if (byteString != null) {
            AuthorizationInfo.checkByteStringIsUtf8((ByteString)byteString);
            this.resource_ = byteString.toStringUtf8();
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
                Class<AuthorizationInfo> class_ = AuthorizationInfo.class;
                // MONITORENTER : com.google.cloud.audit.AuthorizationInfo.class
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
                                if (n != 24) {
                                    if (codedInputStream.skipField(n)) continue;
                                    bl = true;
                                    continue;
                                }
                                this.granted_ = codedInputStream.readBool();
                                continue;
                            }
                            this.permission_ = codedInputStream.readStringRequireUtf8();
                            continue;
                        }
                        this.resource_ = codedInputStream.readStringRequireUtf8();
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
                AuthorizationInfo authorizationInfo = (AuthorizationInfo)object2;
                this.resource_ = visitor.visitString(true ^ this.resource_.isEmpty(), this.resource_, true ^ authorizationInfo.resource_.isEmpty(), authorizationInfo.resource_);
                this.permission_ = visitor.visitString(true ^ this.permission_.isEmpty(), this.permission_, true ^ authorizationInfo.permission_.isEmpty(), authorizationInfo.permission_);
                boolean bl = this.granted_;
                boolean bl2 = authorizationInfo.granted_;
                this.granted_ = visitor.visitBoolean(bl, bl, bl2, bl2);
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
        return new AuthorizationInfo();
    }

    @Override
    public boolean getGranted() {
        return this.granted_;
    }

    @Override
    public String getPermission() {
        return this.permission_;
    }

    @Override
    public ByteString getPermissionBytes() {
        return ByteString.copyFromUtf8((String)this.permission_);
    }

    @Override
    public String getResource() {
        return this.resource_;
    }

    @Override
    public ByteString getResourceBytes() {
        return ByteString.copyFromUtf8((String)this.resource_);
    }

    public int getSerializedSize() {
        boolean bl;
        int n = this.memoizedSerializedSize;
        if (n != -1) {
            return n;
        }
        boolean bl2 = this.resource_.isEmpty();
        int n2 = 0;
        if (!bl2) {
            n2 = 0 + CodedOutputStream.computeStringSize((int)1, (String)this.getResource());
        }
        if (!this.permission_.isEmpty()) {
            n2 += CodedOutputStream.computeStringSize((int)2, (String)this.getPermission());
        }
        if (bl = this.granted_) {
            n2 += CodedOutputStream.computeBoolSize((int)3, (boolean)bl);
        }
        this.memoizedSerializedSize = n2;
        return n2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        boolean bl;
        if (!this.resource_.isEmpty()) {
            codedOutputStream.writeString(1, this.getResource());
        }
        if (!this.permission_.isEmpty()) {
            codedOutputStream.writeString(2, this.getPermission());
        }
        if (bl = this.granted_) {
            codedOutputStream.writeBool(3, bl);
        }
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<AuthorizationInfo, Builder>
    implements AuthorizationInfoOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder clearGranted() {
            this.copyOnWrite();
            ((AuthorizationInfo)this.instance).clearGranted();
            return this;
        }

        public Builder clearPermission() {
            this.copyOnWrite();
            ((AuthorizationInfo)this.instance).clearPermission();
            return this;
        }

        public Builder clearResource() {
            this.copyOnWrite();
            ((AuthorizationInfo)this.instance).clearResource();
            return this;
        }

        @Override
        public boolean getGranted() {
            return ((AuthorizationInfo)this.instance).getGranted();
        }

        @Override
        public String getPermission() {
            return ((AuthorizationInfo)this.instance).getPermission();
        }

        @Override
        public ByteString getPermissionBytes() {
            return ((AuthorizationInfo)this.instance).getPermissionBytes();
        }

        @Override
        public String getResource() {
            return ((AuthorizationInfo)this.instance).getResource();
        }

        @Override
        public ByteString getResourceBytes() {
            return ((AuthorizationInfo)this.instance).getResourceBytes();
        }

        public Builder setGranted(boolean bl) {
            this.copyOnWrite();
            ((AuthorizationInfo)this.instance).setGranted(bl);
            return this;
        }

        public Builder setPermission(String string2) {
            this.copyOnWrite();
            ((AuthorizationInfo)this.instance).setPermission(string2);
            return this;
        }

        public Builder setPermissionBytes(ByteString byteString) {
            this.copyOnWrite();
            ((AuthorizationInfo)this.instance).setPermissionBytes(byteString);
            return this;
        }

        public Builder setResource(String string2) {
            this.copyOnWrite();
            ((AuthorizationInfo)this.instance).setResource(string2);
            return this;
        }

        public Builder setResourceBytes(ByteString byteString) {
            this.copyOnWrite();
            ((AuthorizationInfo)this.instance).setResourceBytes(byteString);
            return this;
        }
    }

}

