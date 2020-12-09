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

import com.google.api.SystemParameterOrBuilder;
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

public final class SystemParameter
extends GeneratedMessageLite<SystemParameter, Builder>
implements SystemParameterOrBuilder {
    private static final SystemParameter DEFAULT_INSTANCE = new SystemParameter();
    public static final int HTTP_HEADER_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<SystemParameter> PARSER;
    public static final int URL_QUERY_PARAMETER_FIELD_NUMBER = 3;
    private String httpHeader_ = "";
    private String name_ = "";
    private String urlQueryParameter_ = "";

    static {
        DEFAULT_INSTANCE.makeImmutable();
    }

    private SystemParameter() {
    }

    private void clearHttpHeader() {
        this.httpHeader_ = SystemParameter.getDefaultInstance().getHttpHeader();
    }

    private void clearName() {
        this.name_ = SystemParameter.getDefaultInstance().getName();
    }

    private void clearUrlQueryParameter() {
        this.urlQueryParameter_ = SystemParameter.getDefaultInstance().getUrlQueryParameter();
    }

    public static SystemParameter getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(SystemParameter systemParameter) {
        return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)systemParameter);
    }

    public static SystemParameter parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SystemParameter)SystemParameter.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static SystemParameter parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SystemParameter)SystemParameter.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static SystemParameter parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (SystemParameter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static SystemParameter parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SystemParameter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static SystemParameter parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (SystemParameter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static SystemParameter parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SystemParameter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static SystemParameter parseFrom(InputStream inputStream) throws IOException {
        return (SystemParameter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static SystemParameter parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SystemParameter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static SystemParameter parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (SystemParameter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static SystemParameter parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SystemParameter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<SystemParameter> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setHttpHeader(String string2) {
        if (string2 != null) {
            this.httpHeader_ = string2;
            return;
        }
        throw new NullPointerException();
    }

    private void setHttpHeaderBytes(ByteString byteString) {
        if (byteString != null) {
            SystemParameter.checkByteStringIsUtf8((ByteString)byteString);
            this.httpHeader_ = byteString.toStringUtf8();
            return;
        }
        throw new NullPointerException();
    }

    private void setName(String string2) {
        if (string2 != null) {
            this.name_ = string2;
            return;
        }
        throw new NullPointerException();
    }

    private void setNameBytes(ByteString byteString) {
        if (byteString != null) {
            SystemParameter.checkByteStringIsUtf8((ByteString)byteString);
            this.name_ = byteString.toStringUtf8();
            return;
        }
        throw new NullPointerException();
    }

    private void setUrlQueryParameter(String string2) {
        if (string2 != null) {
            this.urlQueryParameter_ = string2;
            return;
        }
        throw new NullPointerException();
    }

    private void setUrlQueryParameterBytes(ByteString byteString) {
        if (byteString != null) {
            SystemParameter.checkByteStringIsUtf8((ByteString)byteString);
            this.urlQueryParameter_ = byteString.toStringUtf8();
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
                Class<SystemParameter> class_ = SystemParameter.class;
                // MONITORENTER : com.google.api.SystemParameter.class
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
                                    if (codedInputStream.skipField(n)) continue;
                                    bl = true;
                                    continue;
                                }
                                this.urlQueryParameter_ = codedInputStream.readStringRequireUtf8();
                                continue;
                            }
                            this.httpHeader_ = codedInputStream.readStringRequireUtf8();
                            continue;
                        }
                        this.name_ = codedInputStream.readStringRequireUtf8();
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
                SystemParameter systemParameter = (SystemParameter)object2;
                this.name_ = visitor.visitString(true ^ this.name_.isEmpty(), this.name_, true ^ systemParameter.name_.isEmpty(), systemParameter.name_);
                this.httpHeader_ = visitor.visitString(true ^ this.httpHeader_.isEmpty(), this.httpHeader_, true ^ systemParameter.httpHeader_.isEmpty(), systemParameter.httpHeader_);
                this.urlQueryParameter_ = visitor.visitString(true ^ this.urlQueryParameter_.isEmpty(), this.urlQueryParameter_, true ^ systemParameter.urlQueryParameter_.isEmpty(), systemParameter.urlQueryParameter_);
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
        return new SystemParameter();
    }

    @Override
    public String getHttpHeader() {
        return this.httpHeader_;
    }

    @Override
    public ByteString getHttpHeaderBytes() {
        return ByteString.copyFromUtf8((String)this.httpHeader_);
    }

    @Override
    public String getName() {
        return this.name_;
    }

    @Override
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8((String)this.name_);
    }

    public int getSerializedSize() {
        int n = this.memoizedSerializedSize;
        if (n != -1) {
            return n;
        }
        boolean bl = this.name_.isEmpty();
        int n2 = 0;
        if (!bl) {
            n2 = 0 + CodedOutputStream.computeStringSize((int)1, (String)this.getName());
        }
        if (!this.httpHeader_.isEmpty()) {
            n2 += CodedOutputStream.computeStringSize((int)2, (String)this.getHttpHeader());
        }
        if (!this.urlQueryParameter_.isEmpty()) {
            n2 += CodedOutputStream.computeStringSize((int)3, (String)this.getUrlQueryParameter());
        }
        this.memoizedSerializedSize = n2;
        return n2;
    }

    @Override
    public String getUrlQueryParameter() {
        return this.urlQueryParameter_;
    }

    @Override
    public ByteString getUrlQueryParameterBytes() {
        return ByteString.copyFromUtf8((String)this.urlQueryParameter_);
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.name_.isEmpty()) {
            codedOutputStream.writeString(1, this.getName());
        }
        if (!this.httpHeader_.isEmpty()) {
            codedOutputStream.writeString(2, this.getHttpHeader());
        }
        if (!this.urlQueryParameter_.isEmpty()) {
            codedOutputStream.writeString(3, this.getUrlQueryParameter());
        }
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<SystemParameter, Builder>
    implements SystemParameterOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder clearHttpHeader() {
            this.copyOnWrite();
            ((SystemParameter)this.instance).clearHttpHeader();
            return this;
        }

        public Builder clearName() {
            this.copyOnWrite();
            ((SystemParameter)this.instance).clearName();
            return this;
        }

        public Builder clearUrlQueryParameter() {
            this.copyOnWrite();
            ((SystemParameter)this.instance).clearUrlQueryParameter();
            return this;
        }

        @Override
        public String getHttpHeader() {
            return ((SystemParameter)this.instance).getHttpHeader();
        }

        @Override
        public ByteString getHttpHeaderBytes() {
            return ((SystemParameter)this.instance).getHttpHeaderBytes();
        }

        @Override
        public String getName() {
            return ((SystemParameter)this.instance).getName();
        }

        @Override
        public ByteString getNameBytes() {
            return ((SystemParameter)this.instance).getNameBytes();
        }

        @Override
        public String getUrlQueryParameter() {
            return ((SystemParameter)this.instance).getUrlQueryParameter();
        }

        @Override
        public ByteString getUrlQueryParameterBytes() {
            return ((SystemParameter)this.instance).getUrlQueryParameterBytes();
        }

        public Builder setHttpHeader(String string2) {
            this.copyOnWrite();
            ((SystemParameter)this.instance).setHttpHeader(string2);
            return this;
        }

        public Builder setHttpHeaderBytes(ByteString byteString) {
            this.copyOnWrite();
            ((SystemParameter)this.instance).setHttpHeaderBytes(byteString);
            return this;
        }

        public Builder setName(String string2) {
            this.copyOnWrite();
            ((SystemParameter)this.instance).setName(string2);
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            this.copyOnWrite();
            ((SystemParameter)this.instance).setNameBytes(byteString);
            return this;
        }

        public Builder setUrlQueryParameter(String string2) {
            this.copyOnWrite();
            ((SystemParameter)this.instance).setUrlQueryParameter(string2);
            return this;
        }

        public Builder setUrlQueryParameterBytes(ByteString byteString) {
            this.copyOnWrite();
            ((SystemParameter)this.instance).setUrlQueryParameterBytes(byteString);
            return this;
        }
    }

}

