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

import com.google.api.HttpBodyOrBuilder;
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

public final class HttpBody
extends GeneratedMessageLite<HttpBody, Builder>
implements HttpBodyOrBuilder {
    public static final int CONTENT_TYPE_FIELD_NUMBER = 1;
    public static final int DATA_FIELD_NUMBER = 2;
    private static final HttpBody DEFAULT_INSTANCE = new HttpBody();
    private static volatile Parser<HttpBody> PARSER;
    private String contentType_ = "";
    private ByteString data_ = ByteString.EMPTY;

    static {
        DEFAULT_INSTANCE.makeImmutable();
    }

    private HttpBody() {
    }

    private void clearContentType() {
        this.contentType_ = HttpBody.getDefaultInstance().getContentType();
    }

    private void clearData() {
        this.data_ = HttpBody.getDefaultInstance().getData();
    }

    public static HttpBody getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(HttpBody httpBody) {
        return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)httpBody);
    }

    public static HttpBody parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (HttpBody)HttpBody.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static HttpBody parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (HttpBody)HttpBody.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static HttpBody parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (HttpBody)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static HttpBody parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (HttpBody)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static HttpBody parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (HttpBody)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static HttpBody parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (HttpBody)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static HttpBody parseFrom(InputStream inputStream) throws IOException {
        return (HttpBody)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static HttpBody parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (HttpBody)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static HttpBody parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (HttpBody)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static HttpBody parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (HttpBody)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<HttpBody> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setContentType(String string2) {
        if (string2 != null) {
            this.contentType_ = string2;
            return;
        }
        throw new NullPointerException();
    }

    private void setContentTypeBytes(ByteString byteString) {
        if (byteString != null) {
            HttpBody.checkByteStringIsUtf8((ByteString)byteString);
            this.contentType_ = byteString.toStringUtf8();
            return;
        }
        throw new NullPointerException();
    }

    private void setData(ByteString byteString) {
        if (byteString != null) {
            this.data_ = byteString;
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
                Class<HttpBody> class_ = HttpBody.class;
                // MONITORENTER : com.google.api.HttpBody.class
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
                            this.data_ = codedInputStream.readBytes();
                            continue;
                        }
                        this.contentType_ = codedInputStream.readStringRequireUtf8();
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
                HttpBody httpBody = (HttpBody)object2;
                boolean bl = this.contentType_.isEmpty();
                boolean bl2 = true;
                this.contentType_ = visitor.visitString(bl ^ bl2, this.contentType_, bl2 ^ httpBody.contentType_.isEmpty(), httpBody.contentType_);
                boolean bl3 = this.data_ != ByteString.EMPTY;
                ByteString byteString = this.data_;
                if (httpBody.data_ == ByteString.EMPTY) {
                    bl2 = false;
                }
                this.data_ = visitor.visitByteString(bl3, byteString, bl2, httpBody.data_);
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
        return new HttpBody();
    }

    @Override
    public String getContentType() {
        return this.contentType_;
    }

    @Override
    public ByteString getContentTypeBytes() {
        return ByteString.copyFromUtf8((String)this.contentType_);
    }

    @Override
    public ByteString getData() {
        return this.data_;
    }

    public int getSerializedSize() {
        int n = this.memoizedSerializedSize;
        if (n != -1) {
            return n;
        }
        boolean bl = this.contentType_.isEmpty();
        int n2 = 0;
        if (!bl) {
            n2 = 0 + CodedOutputStream.computeStringSize((int)1, (String)this.getContentType());
        }
        if (!this.data_.isEmpty()) {
            n2 += CodedOutputStream.computeBytesSize((int)2, (ByteString)this.data_);
        }
        this.memoizedSerializedSize = n2;
        return n2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.contentType_.isEmpty()) {
            codedOutputStream.writeString(1, this.getContentType());
        }
        if (!this.data_.isEmpty()) {
            codedOutputStream.writeBytes(2, this.data_);
        }
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<HttpBody, Builder>
    implements HttpBodyOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder clearContentType() {
            this.copyOnWrite();
            ((HttpBody)this.instance).clearContentType();
            return this;
        }

        public Builder clearData() {
            this.copyOnWrite();
            ((HttpBody)this.instance).clearData();
            return this;
        }

        @Override
        public String getContentType() {
            return ((HttpBody)this.instance).getContentType();
        }

        @Override
        public ByteString getContentTypeBytes() {
            return ((HttpBody)this.instance).getContentTypeBytes();
        }

        @Override
        public ByteString getData() {
            return ((HttpBody)this.instance).getData();
        }

        public Builder setContentType(String string2) {
            this.copyOnWrite();
            ((HttpBody)this.instance).setContentType(string2);
            return this;
        }

        public Builder setContentTypeBytes(ByteString byteString) {
            this.copyOnWrite();
            ((HttpBody)this.instance).setContentTypeBytes(byteString);
            return this;
        }

        public Builder setData(ByteString byteString) {
            this.copyOnWrite();
            ((HttpBody)this.instance).setData(byteString);
            return this;
        }
    }

}

