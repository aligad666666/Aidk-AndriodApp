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

import com.google.cloud.audit.RequestMetadataOrBuilder;
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

public final class RequestMetadata
extends GeneratedMessageLite<RequestMetadata, Builder>
implements RequestMetadataOrBuilder {
    public static final int CALLER_IP_FIELD_NUMBER = 1;
    public static final int CALLER_SUPPLIED_USER_AGENT_FIELD_NUMBER = 2;
    private static final RequestMetadata DEFAULT_INSTANCE = new RequestMetadata();
    private static volatile Parser<RequestMetadata> PARSER;
    private String callerIp_ = "";
    private String callerSuppliedUserAgent_ = "";

    static {
        DEFAULT_INSTANCE.makeImmutable();
    }

    private RequestMetadata() {
    }

    private void clearCallerIp() {
        this.callerIp_ = RequestMetadata.getDefaultInstance().getCallerIp();
    }

    private void clearCallerSuppliedUserAgent() {
        this.callerSuppliedUserAgent_ = RequestMetadata.getDefaultInstance().getCallerSuppliedUserAgent();
    }

    public static RequestMetadata getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(RequestMetadata requestMetadata) {
        return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)requestMetadata);
    }

    public static RequestMetadata parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RequestMetadata)RequestMetadata.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static RequestMetadata parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RequestMetadata)RequestMetadata.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static RequestMetadata parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (RequestMetadata)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static RequestMetadata parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RequestMetadata)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static RequestMetadata parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (RequestMetadata)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static RequestMetadata parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RequestMetadata)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static RequestMetadata parseFrom(InputStream inputStream) throws IOException {
        return (RequestMetadata)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static RequestMetadata parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RequestMetadata)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static RequestMetadata parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (RequestMetadata)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static RequestMetadata parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RequestMetadata)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<RequestMetadata> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setCallerIp(String string2) {
        if (string2 != null) {
            this.callerIp_ = string2;
            return;
        }
        throw new NullPointerException();
    }

    private void setCallerIpBytes(ByteString byteString) {
        if (byteString != null) {
            RequestMetadata.checkByteStringIsUtf8((ByteString)byteString);
            this.callerIp_ = byteString.toStringUtf8();
            return;
        }
        throw new NullPointerException();
    }

    private void setCallerSuppliedUserAgent(String string2) {
        if (string2 != null) {
            this.callerSuppliedUserAgent_ = string2;
            return;
        }
        throw new NullPointerException();
    }

    private void setCallerSuppliedUserAgentBytes(ByteString byteString) {
        if (byteString != null) {
            RequestMetadata.checkByteStringIsUtf8((ByteString)byteString);
            this.callerSuppliedUserAgent_ = byteString.toStringUtf8();
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
                Class<RequestMetadata> class_ = RequestMetadata.class;
                // MONITORENTER : com.google.cloud.audit.RequestMetadata.class
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
                            this.callerSuppliedUserAgent_ = codedInputStream.readStringRequireUtf8();
                            continue;
                        }
                        this.callerIp_ = codedInputStream.readStringRequireUtf8();
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
                RequestMetadata requestMetadata = (RequestMetadata)object2;
                this.callerIp_ = visitor.visitString(true ^ this.callerIp_.isEmpty(), this.callerIp_, true ^ requestMetadata.callerIp_.isEmpty(), requestMetadata.callerIp_);
                this.callerSuppliedUserAgent_ = visitor.visitString(true ^ this.callerSuppliedUserAgent_.isEmpty(), this.callerSuppliedUserAgent_, true ^ requestMetadata.callerSuppliedUserAgent_.isEmpty(), requestMetadata.callerSuppliedUserAgent_);
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
        return new RequestMetadata();
    }

    @Override
    public String getCallerIp() {
        return this.callerIp_;
    }

    @Override
    public ByteString getCallerIpBytes() {
        return ByteString.copyFromUtf8((String)this.callerIp_);
    }

    @Override
    public String getCallerSuppliedUserAgent() {
        return this.callerSuppliedUserAgent_;
    }

    @Override
    public ByteString getCallerSuppliedUserAgentBytes() {
        return ByteString.copyFromUtf8((String)this.callerSuppliedUserAgent_);
    }

    public int getSerializedSize() {
        int n = this.memoizedSerializedSize;
        if (n != -1) {
            return n;
        }
        boolean bl = this.callerIp_.isEmpty();
        int n2 = 0;
        if (!bl) {
            n2 = 0 + CodedOutputStream.computeStringSize((int)1, (String)this.getCallerIp());
        }
        if (!this.callerSuppliedUserAgent_.isEmpty()) {
            n2 += CodedOutputStream.computeStringSize((int)2, (String)this.getCallerSuppliedUserAgent());
        }
        this.memoizedSerializedSize = n2;
        return n2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.callerIp_.isEmpty()) {
            codedOutputStream.writeString(1, this.getCallerIp());
        }
        if (!this.callerSuppliedUserAgent_.isEmpty()) {
            codedOutputStream.writeString(2, this.getCallerSuppliedUserAgent());
        }
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<RequestMetadata, Builder>
    implements RequestMetadataOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder clearCallerIp() {
            this.copyOnWrite();
            ((RequestMetadata)this.instance).clearCallerIp();
            return this;
        }

        public Builder clearCallerSuppliedUserAgent() {
            this.copyOnWrite();
            ((RequestMetadata)this.instance).clearCallerSuppliedUserAgent();
            return this;
        }

        @Override
        public String getCallerIp() {
            return ((RequestMetadata)this.instance).getCallerIp();
        }

        @Override
        public ByteString getCallerIpBytes() {
            return ((RequestMetadata)this.instance).getCallerIpBytes();
        }

        @Override
        public String getCallerSuppliedUserAgent() {
            return ((RequestMetadata)this.instance).getCallerSuppliedUserAgent();
        }

        @Override
        public ByteString getCallerSuppliedUserAgentBytes() {
            return ((RequestMetadata)this.instance).getCallerSuppliedUserAgentBytes();
        }

        public Builder setCallerIp(String string2) {
            this.copyOnWrite();
            ((RequestMetadata)this.instance).setCallerIp(string2);
            return this;
        }

        public Builder setCallerIpBytes(ByteString byteString) {
            this.copyOnWrite();
            ((RequestMetadata)this.instance).setCallerIpBytes(byteString);
            return this;
        }

        public Builder setCallerSuppliedUserAgent(String string2) {
            this.copyOnWrite();
            ((RequestMetadata)this.instance).setCallerSuppliedUserAgent(string2);
            return this;
        }

        public Builder setCallerSuppliedUserAgentBytes(ByteString byteString) {
            this.copyOnWrite();
            ((RequestMetadata)this.instance).setCallerSuppliedUserAgentBytes(byteString);
            return this;
        }
    }

}

