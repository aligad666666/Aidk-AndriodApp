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
 *  com.google.rpc.ResourceInfo$1
 *  com.google.rpc.ResourceInfoOrBuilder
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
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.rpc.ResourceInfo;
import com.google.rpc.ResourceInfoOrBuilder;
import java.io.IOException;
import java.io.InputStream;

public final class ResourceInfo
extends GeneratedMessageLite<ResourceInfo, Builder>
implements ResourceInfoOrBuilder {
    private static final ResourceInfo DEFAULT_INSTANCE = new ResourceInfo();
    public static final int DESCRIPTION_FIELD_NUMBER = 4;
    public static final int OWNER_FIELD_NUMBER = 3;
    private static volatile Parser<ResourceInfo> PARSER;
    public static final int RESOURCE_NAME_FIELD_NUMBER = 2;
    public static final int RESOURCE_TYPE_FIELD_NUMBER = 1;
    private String description_ = "";
    private String owner_ = "";
    private String resourceName_ = "";
    private String resourceType_ = "";

    static {
        DEFAULT_INSTANCE.makeImmutable();
    }

    private ResourceInfo() {
    }

    private void clearDescription() {
        this.description_ = ResourceInfo.getDefaultInstance().getDescription();
    }

    private void clearOwner() {
        this.owner_ = ResourceInfo.getDefaultInstance().getOwner();
    }

    private void clearResourceName() {
        this.resourceName_ = ResourceInfo.getDefaultInstance().getResourceName();
    }

    private void clearResourceType() {
        this.resourceType_ = ResourceInfo.getDefaultInstance().getResourceType();
    }

    public static ResourceInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(ResourceInfo resourceInfo) {
        return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)resourceInfo);
    }

    public static ResourceInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ResourceInfo)ResourceInfo.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static ResourceInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ResourceInfo)ResourceInfo.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ResourceInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ResourceInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static ResourceInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ResourceInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ResourceInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ResourceInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static ResourceInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ResourceInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ResourceInfo parseFrom(InputStream inputStream) throws IOException {
        return (ResourceInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static ResourceInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ResourceInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ResourceInfo parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (ResourceInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static ResourceInfo parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ResourceInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<ResourceInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setDescription(String string) {
        if (string != null) {
            this.description_ = string;
            return;
        }
        throw new NullPointerException();
    }

    private void setDescriptionBytes(ByteString byteString) {
        if (byteString != null) {
            ResourceInfo.checkByteStringIsUtf8((ByteString)byteString);
            this.description_ = byteString.toStringUtf8();
            return;
        }
        throw new NullPointerException();
    }

    private void setOwner(String string) {
        if (string != null) {
            this.owner_ = string;
            return;
        }
        throw new NullPointerException();
    }

    private void setOwnerBytes(ByteString byteString) {
        if (byteString != null) {
            ResourceInfo.checkByteStringIsUtf8((ByteString)byteString);
            this.owner_ = byteString.toStringUtf8();
            return;
        }
        throw new NullPointerException();
    }

    private void setResourceName(String string) {
        if (string != null) {
            this.resourceName_ = string;
            return;
        }
        throw new NullPointerException();
    }

    private void setResourceNameBytes(ByteString byteString) {
        if (byteString != null) {
            ResourceInfo.checkByteStringIsUtf8((ByteString)byteString);
            this.resourceName_ = byteString.toStringUtf8();
            return;
        }
        throw new NullPointerException();
    }

    private void setResourceType(String string) {
        if (string != null) {
            this.resourceType_ = string;
            return;
        }
        throw new NullPointerException();
    }

    private void setResourceTypeBytes(ByteString byteString) {
        if (byteString != null) {
            ResourceInfo.checkByteStringIsUtf8((ByteString)byteString);
            this.resourceType_ = byteString.toStringUtf8();
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
                Class<ResourceInfo> class_ = ResourceInfo.class;
                // MONITORENTER : com.google.rpc.ResourceInfo.class
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
                                        if (codedInputStream.skipField(n)) continue;
                                        bl = true;
                                        continue;
                                    }
                                    this.description_ = codedInputStream.readStringRequireUtf8();
                                    continue;
                                }
                                this.owner_ = codedInputStream.readStringRequireUtf8();
                                continue;
                            }
                            this.resourceName_ = codedInputStream.readStringRequireUtf8();
                            continue;
                        }
                        this.resourceType_ = codedInputStream.readStringRequireUtf8();
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
                ResourceInfo resourceInfo = (ResourceInfo)((Object)object2);
                this.resourceType_ = visitor.visitString(true ^ this.resourceType_.isEmpty(), this.resourceType_, true ^ resourceInfo.resourceType_.isEmpty(), resourceInfo.resourceType_);
                this.resourceName_ = visitor.visitString(true ^ this.resourceName_.isEmpty(), this.resourceName_, true ^ resourceInfo.resourceName_.isEmpty(), resourceInfo.resourceName_);
                this.owner_ = visitor.visitString(true ^ this.owner_.isEmpty(), this.owner_, true ^ resourceInfo.owner_.isEmpty(), resourceInfo.owner_);
                this.description_ = visitor.visitString(true ^ this.description_.isEmpty(), this.description_, true ^ resourceInfo.description_.isEmpty(), resourceInfo.description_);
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
        return new ResourceInfo();
    }

    public String getDescription() {
        return this.description_;
    }

    public ByteString getDescriptionBytes() {
        return ByteString.copyFromUtf8((String)this.description_);
    }

    public String getOwner() {
        return this.owner_;
    }

    public ByteString getOwnerBytes() {
        return ByteString.copyFromUtf8((String)this.owner_);
    }

    public String getResourceName() {
        return this.resourceName_;
    }

    public ByteString getResourceNameBytes() {
        return ByteString.copyFromUtf8((String)this.resourceName_);
    }

    public String getResourceType() {
        return this.resourceType_;
    }

    public ByteString getResourceTypeBytes() {
        return ByteString.copyFromUtf8((String)this.resourceType_);
    }

    public int getSerializedSize() {
        int n = this.memoizedSerializedSize;
        if (n != -1) {
            return n;
        }
        boolean bl = this.resourceType_.isEmpty();
        int n2 = 0;
        if (!bl) {
            n2 = 0 + CodedOutputStream.computeStringSize((int)1, (String)this.getResourceType());
        }
        if (!this.resourceName_.isEmpty()) {
            n2 += CodedOutputStream.computeStringSize((int)2, (String)this.getResourceName());
        }
        if (!this.owner_.isEmpty()) {
            n2 += CodedOutputStream.computeStringSize((int)3, (String)this.getOwner());
        }
        if (!this.description_.isEmpty()) {
            n2 += CodedOutputStream.computeStringSize((int)4, (String)this.getDescription());
        }
        this.memoizedSerializedSize = n2;
        return n2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.resourceType_.isEmpty()) {
            codedOutputStream.writeString(1, this.getResourceType());
        }
        if (!this.resourceName_.isEmpty()) {
            codedOutputStream.writeString(2, this.getResourceName());
        }
        if (!this.owner_.isEmpty()) {
            codedOutputStream.writeString(3, this.getOwner());
        }
        if (!this.description_.isEmpty()) {
            codedOutputStream.writeString(4, this.getDescription());
        }
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<ResourceInfo, Builder>
    implements ResourceInfoOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder clearDescription() {
            this.copyOnWrite();
            ((ResourceInfo)this.instance).clearDescription();
            return this;
        }

        public Builder clearOwner() {
            this.copyOnWrite();
            ((ResourceInfo)this.instance).clearOwner();
            return this;
        }

        public Builder clearResourceName() {
            this.copyOnWrite();
            ((ResourceInfo)this.instance).clearResourceName();
            return this;
        }

        public Builder clearResourceType() {
            this.copyOnWrite();
            ((ResourceInfo)this.instance).clearResourceType();
            return this;
        }

        public String getDescription() {
            return ((ResourceInfo)this.instance).getDescription();
        }

        public ByteString getDescriptionBytes() {
            return ((ResourceInfo)this.instance).getDescriptionBytes();
        }

        public String getOwner() {
            return ((ResourceInfo)this.instance).getOwner();
        }

        public ByteString getOwnerBytes() {
            return ((ResourceInfo)this.instance).getOwnerBytes();
        }

        public String getResourceName() {
            return ((ResourceInfo)this.instance).getResourceName();
        }

        public ByteString getResourceNameBytes() {
            return ((ResourceInfo)this.instance).getResourceNameBytes();
        }

        public String getResourceType() {
            return ((ResourceInfo)this.instance).getResourceType();
        }

        public ByteString getResourceTypeBytes() {
            return ((ResourceInfo)this.instance).getResourceTypeBytes();
        }

        public Builder setDescription(String string) {
            this.copyOnWrite();
            ((ResourceInfo)this.instance).setDescription(string);
            return this;
        }

        public Builder setDescriptionBytes(ByteString byteString) {
            this.copyOnWrite();
            ((ResourceInfo)this.instance).setDescriptionBytes(byteString);
            return this;
        }

        public Builder setOwner(String string) {
            this.copyOnWrite();
            ((ResourceInfo)this.instance).setOwner(string);
            return this;
        }

        public Builder setOwnerBytes(ByteString byteString) {
            this.copyOnWrite();
            ((ResourceInfo)this.instance).setOwnerBytes(byteString);
            return this;
        }

        public Builder setResourceName(String string) {
            this.copyOnWrite();
            ((ResourceInfo)this.instance).setResourceName(string);
            return this;
        }

        public Builder setResourceNameBytes(ByteString byteString) {
            this.copyOnWrite();
            ((ResourceInfo)this.instance).setResourceNameBytes(byteString);
            return this;
        }

        public Builder setResourceType(String string) {
            this.copyOnWrite();
            ((ResourceInfo)this.instance).setResourceType(string);
            return this;
        }

        public Builder setResourceTypeBytes(ByteString byteString) {
            this.copyOnWrite();
            ((ResourceInfo)this.instance).setResourceTypeBytes(byteString);
            return this;
        }
    }

}

