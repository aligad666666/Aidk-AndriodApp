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

import com.google.api.CustomHttpPatternOrBuilder;
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

public final class CustomHttpPattern
extends GeneratedMessageLite<CustomHttpPattern, Builder>
implements CustomHttpPatternOrBuilder {
    private static final CustomHttpPattern DEFAULT_INSTANCE = new CustomHttpPattern();
    public static final int KIND_FIELD_NUMBER = 1;
    private static volatile Parser<CustomHttpPattern> PARSER;
    public static final int PATH_FIELD_NUMBER = 2;
    private String kind_ = "";
    private String path_ = "";

    static {
        DEFAULT_INSTANCE.makeImmutable();
    }

    private CustomHttpPattern() {
    }

    private void clearKind() {
        this.kind_ = CustomHttpPattern.getDefaultInstance().getKind();
    }

    private void clearPath() {
        this.path_ = CustomHttpPattern.getDefaultInstance().getPath();
    }

    public static CustomHttpPattern getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(CustomHttpPattern customHttpPattern) {
        return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)customHttpPattern);
    }

    public static CustomHttpPattern parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CustomHttpPattern)CustomHttpPattern.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static CustomHttpPattern parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CustomHttpPattern)CustomHttpPattern.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static CustomHttpPattern parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (CustomHttpPattern)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static CustomHttpPattern parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CustomHttpPattern)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static CustomHttpPattern parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (CustomHttpPattern)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static CustomHttpPattern parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CustomHttpPattern)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static CustomHttpPattern parseFrom(InputStream inputStream) throws IOException {
        return (CustomHttpPattern)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static CustomHttpPattern parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CustomHttpPattern)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static CustomHttpPattern parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (CustomHttpPattern)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static CustomHttpPattern parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CustomHttpPattern)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<CustomHttpPattern> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setKind(String string2) {
        if (string2 != null) {
            this.kind_ = string2;
            return;
        }
        throw new NullPointerException();
    }

    private void setKindBytes(ByteString byteString) {
        if (byteString != null) {
            CustomHttpPattern.checkByteStringIsUtf8((ByteString)byteString);
            this.kind_ = byteString.toStringUtf8();
            return;
        }
        throw new NullPointerException();
    }

    private void setPath(String string2) {
        if (string2 != null) {
            this.path_ = string2;
            return;
        }
        throw new NullPointerException();
    }

    private void setPathBytes(ByteString byteString) {
        if (byteString != null) {
            CustomHttpPattern.checkByteStringIsUtf8((ByteString)byteString);
            this.path_ = byteString.toStringUtf8();
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
                Class<CustomHttpPattern> class_ = CustomHttpPattern.class;
                // MONITORENTER : com.google.api.CustomHttpPattern.class
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
                            this.path_ = codedInputStream.readStringRequireUtf8();
                            continue;
                        }
                        this.kind_ = codedInputStream.readStringRequireUtf8();
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
                CustomHttpPattern customHttpPattern = (CustomHttpPattern)object2;
                this.kind_ = visitor.visitString(true ^ this.kind_.isEmpty(), this.kind_, true ^ customHttpPattern.kind_.isEmpty(), customHttpPattern.kind_);
                this.path_ = visitor.visitString(true ^ this.path_.isEmpty(), this.path_, true ^ customHttpPattern.path_.isEmpty(), customHttpPattern.path_);
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
        return new CustomHttpPattern();
    }

    @Override
    public String getKind() {
        return this.kind_;
    }

    @Override
    public ByteString getKindBytes() {
        return ByteString.copyFromUtf8((String)this.kind_);
    }

    @Override
    public String getPath() {
        return this.path_;
    }

    @Override
    public ByteString getPathBytes() {
        return ByteString.copyFromUtf8((String)this.path_);
    }

    public int getSerializedSize() {
        int n = this.memoizedSerializedSize;
        if (n != -1) {
            return n;
        }
        boolean bl = this.kind_.isEmpty();
        int n2 = 0;
        if (!bl) {
            n2 = 0 + CodedOutputStream.computeStringSize((int)1, (String)this.getKind());
        }
        if (!this.path_.isEmpty()) {
            n2 += CodedOutputStream.computeStringSize((int)2, (String)this.getPath());
        }
        this.memoizedSerializedSize = n2;
        return n2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.kind_.isEmpty()) {
            codedOutputStream.writeString(1, this.getKind());
        }
        if (!this.path_.isEmpty()) {
            codedOutputStream.writeString(2, this.getPath());
        }
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<CustomHttpPattern, Builder>
    implements CustomHttpPatternOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder clearKind() {
            this.copyOnWrite();
            ((CustomHttpPattern)this.instance).clearKind();
            return this;
        }

        public Builder clearPath() {
            this.copyOnWrite();
            ((CustomHttpPattern)this.instance).clearPath();
            return this;
        }

        @Override
        public String getKind() {
            return ((CustomHttpPattern)this.instance).getKind();
        }

        @Override
        public ByteString getKindBytes() {
            return ((CustomHttpPattern)this.instance).getKindBytes();
        }

        @Override
        public String getPath() {
            return ((CustomHttpPattern)this.instance).getPath();
        }

        @Override
        public ByteString getPathBytes() {
            return ((CustomHttpPattern)this.instance).getPathBytes();
        }

        public Builder setKind(String string2) {
            this.copyOnWrite();
            ((CustomHttpPattern)this.instance).setKind(string2);
            return this;
        }

        public Builder setKindBytes(ByteString byteString) {
            this.copyOnWrite();
            ((CustomHttpPattern)this.instance).setKindBytes(byteString);
            return this;
        }

        public Builder setPath(String string2) {
            this.copyOnWrite();
            ((CustomHttpPattern)this.instance).setPath(string2);
            return this;
        }

        public Builder setPathBytes(ByteString byteString) {
            this.copyOnWrite();
            ((CustomHttpPattern)this.instance).setPathBytes(byteString);
            return this;
        }
    }

}

