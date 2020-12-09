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
 *  com.google.rpc.RequestInfo$1
 *  com.google.rpc.RequestInfoOrBuilder
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
import com.google.rpc.RequestInfo;
import com.google.rpc.RequestInfoOrBuilder;
import java.io.IOException;
import java.io.InputStream;

public final class RequestInfo
extends GeneratedMessageLite<RequestInfo, Builder>
implements RequestInfoOrBuilder {
    private static final RequestInfo DEFAULT_INSTANCE = new RequestInfo();
    private static volatile Parser<RequestInfo> PARSER;
    public static final int REQUEST_ID_FIELD_NUMBER = 1;
    public static final int SERVING_DATA_FIELD_NUMBER = 2;
    private String requestId_ = "";
    private String servingData_ = "";

    static {
        DEFAULT_INSTANCE.makeImmutable();
    }

    private RequestInfo() {
    }

    private void clearRequestId() {
        this.requestId_ = RequestInfo.getDefaultInstance().getRequestId();
    }

    private void clearServingData() {
        this.servingData_ = RequestInfo.getDefaultInstance().getServingData();
    }

    public static RequestInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(RequestInfo requestInfo) {
        return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)requestInfo);
    }

    public static RequestInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RequestInfo)RequestInfo.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static RequestInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RequestInfo)RequestInfo.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static RequestInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (RequestInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static RequestInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RequestInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static RequestInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (RequestInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static RequestInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RequestInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static RequestInfo parseFrom(InputStream inputStream) throws IOException {
        return (RequestInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static RequestInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RequestInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static RequestInfo parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (RequestInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static RequestInfo parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RequestInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<RequestInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setRequestId(String string) {
        if (string != null) {
            this.requestId_ = string;
            return;
        }
        throw new NullPointerException();
    }

    private void setRequestIdBytes(ByteString byteString) {
        if (byteString != null) {
            RequestInfo.checkByteStringIsUtf8((ByteString)byteString);
            this.requestId_ = byteString.toStringUtf8();
            return;
        }
        throw new NullPointerException();
    }

    private void setServingData(String string) {
        if (string != null) {
            this.servingData_ = string;
            return;
        }
        throw new NullPointerException();
    }

    private void setServingDataBytes(ByteString byteString) {
        if (byteString != null) {
            RequestInfo.checkByteStringIsUtf8((ByteString)byteString);
            this.servingData_ = byteString.toStringUtf8();
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
                Class<RequestInfo> class_ = RequestInfo.class;
                // MONITORENTER : com.google.rpc.RequestInfo.class
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
                            this.servingData_ = codedInputStream.readStringRequireUtf8();
                            continue;
                        }
                        this.requestId_ = codedInputStream.readStringRequireUtf8();
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
                RequestInfo requestInfo = (RequestInfo)((Object)object2);
                this.requestId_ = visitor.visitString(true ^ this.requestId_.isEmpty(), this.requestId_, true ^ requestInfo.requestId_.isEmpty(), requestInfo.requestId_);
                this.servingData_ = visitor.visitString(true ^ this.servingData_.isEmpty(), this.servingData_, true ^ requestInfo.servingData_.isEmpty(), requestInfo.servingData_);
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
        return new RequestInfo();
    }

    public String getRequestId() {
        return this.requestId_;
    }

    public ByteString getRequestIdBytes() {
        return ByteString.copyFromUtf8((String)this.requestId_);
    }

    public int getSerializedSize() {
        int n = this.memoizedSerializedSize;
        if (n != -1) {
            return n;
        }
        boolean bl = this.requestId_.isEmpty();
        int n2 = 0;
        if (!bl) {
            n2 = 0 + CodedOutputStream.computeStringSize((int)1, (String)this.getRequestId());
        }
        if (!this.servingData_.isEmpty()) {
            n2 += CodedOutputStream.computeStringSize((int)2, (String)this.getServingData());
        }
        this.memoizedSerializedSize = n2;
        return n2;
    }

    public String getServingData() {
        return this.servingData_;
    }

    public ByteString getServingDataBytes() {
        return ByteString.copyFromUtf8((String)this.servingData_);
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.requestId_.isEmpty()) {
            codedOutputStream.writeString(1, this.getRequestId());
        }
        if (!this.servingData_.isEmpty()) {
            codedOutputStream.writeString(2, this.getServingData());
        }
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<RequestInfo, Builder>
    implements RequestInfoOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder clearRequestId() {
            this.copyOnWrite();
            ((RequestInfo)this.instance).clearRequestId();
            return this;
        }

        public Builder clearServingData() {
            this.copyOnWrite();
            ((RequestInfo)this.instance).clearServingData();
            return this;
        }

        public String getRequestId() {
            return ((RequestInfo)this.instance).getRequestId();
        }

        public ByteString getRequestIdBytes() {
            return ((RequestInfo)this.instance).getRequestIdBytes();
        }

        public String getServingData() {
            return ((RequestInfo)this.instance).getServingData();
        }

        public ByteString getServingDataBytes() {
            return ((RequestInfo)this.instance).getServingDataBytes();
        }

        public Builder setRequestId(String string) {
            this.copyOnWrite();
            ((RequestInfo)this.instance).setRequestId(string);
            return this;
        }

        public Builder setRequestIdBytes(ByteString byteString) {
            this.copyOnWrite();
            ((RequestInfo)this.instance).setRequestIdBytes(byteString);
            return this;
        }

        public Builder setServingData(String string) {
            this.copyOnWrite();
            ((RequestInfo)this.instance).setServingData(string);
            return this;
        }

        public Builder setServingDataBytes(ByteString byteString) {
            this.copyOnWrite();
            ((RequestInfo)this.instance).setServingDataBytes(byteString);
            return this;
        }
    }

}

