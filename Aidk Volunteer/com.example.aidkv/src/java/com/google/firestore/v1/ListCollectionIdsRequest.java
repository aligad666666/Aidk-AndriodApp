/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.firestore.v1.ListCollectionIdsRequest$1
 *  com.google.firestore.v1.ListCollectionIdsRequestOrBuilder
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
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.UnsupportedOperationException
 */
package com.google.firestore.v1;

import com.google.firestore.v1.ListCollectionIdsRequest;
import com.google.firestore.v1.ListCollectionIdsRequestOrBuilder;
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

public final class ListCollectionIdsRequest
extends GeneratedMessageLite<ListCollectionIdsRequest, Builder>
implements ListCollectionIdsRequestOrBuilder {
    private static final ListCollectionIdsRequest DEFAULT_INSTANCE = new ListCollectionIdsRequest();
    public static final int PAGE_SIZE_FIELD_NUMBER = 2;
    public static final int PAGE_TOKEN_FIELD_NUMBER = 3;
    public static final int PARENT_FIELD_NUMBER = 1;
    private static volatile Parser<ListCollectionIdsRequest> PARSER;
    private int pageSize_;
    private String pageToken_ = "";
    private String parent_ = "";

    static {
        DEFAULT_INSTANCE.makeImmutable();
    }

    private ListCollectionIdsRequest() {
    }

    private void clearPageSize() {
        this.pageSize_ = 0;
    }

    private void clearPageToken() {
        this.pageToken_ = ListCollectionIdsRequest.getDefaultInstance().getPageToken();
    }

    private void clearParent() {
        this.parent_ = ListCollectionIdsRequest.getDefaultInstance().getParent();
    }

    public static ListCollectionIdsRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(ListCollectionIdsRequest listCollectionIdsRequest) {
        return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)listCollectionIdsRequest);
    }

    public static ListCollectionIdsRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ListCollectionIdsRequest)ListCollectionIdsRequest.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static ListCollectionIdsRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ListCollectionIdsRequest)ListCollectionIdsRequest.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ListCollectionIdsRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ListCollectionIdsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static ListCollectionIdsRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ListCollectionIdsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ListCollectionIdsRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ListCollectionIdsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static ListCollectionIdsRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ListCollectionIdsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ListCollectionIdsRequest parseFrom(InputStream inputStream) throws IOException {
        return (ListCollectionIdsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static ListCollectionIdsRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ListCollectionIdsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ListCollectionIdsRequest parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (ListCollectionIdsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static ListCollectionIdsRequest parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ListCollectionIdsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<ListCollectionIdsRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setPageSize(int n) {
        this.pageSize_ = n;
    }

    private void setPageToken(String string) {
        if (string != null) {
            this.pageToken_ = string;
            return;
        }
        throw new NullPointerException();
    }

    private void setPageTokenBytes(ByteString byteString) {
        if (byteString != null) {
            ListCollectionIdsRequest.checkByteStringIsUtf8((ByteString)byteString);
            this.pageToken_ = byteString.toStringUtf8();
            return;
        }
        throw new NullPointerException();
    }

    private void setParent(String string) {
        if (string != null) {
            this.parent_ = string;
            return;
        }
        throw new NullPointerException();
    }

    private void setParentBytes(ByteString byteString) {
        if (byteString != null) {
            ListCollectionIdsRequest.checkByteStringIsUtf8((ByteString)byteString);
            this.parent_ = byteString.toStringUtf8();
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
                Class<ListCollectionIdsRequest> class_ = ListCollectionIdsRequest.class;
                // MONITORENTER : com.google.firestore.v1.ListCollectionIdsRequest.class
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
                            if (n != 16) {
                                if (n != 26) {
                                    if (codedInputStream.skipField(n)) continue;
                                    bl = true;
                                    continue;
                                }
                                this.pageToken_ = codedInputStream.readStringRequireUtf8();
                                continue;
                            }
                            this.pageSize_ = codedInputStream.readInt32();
                            continue;
                        }
                        this.parent_ = codedInputStream.readStringRequireUtf8();
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
                ListCollectionIdsRequest listCollectionIdsRequest = (ListCollectionIdsRequest)((Object)object2);
                this.parent_ = visitor.visitString(true ^ this.parent_.isEmpty(), this.parent_, true ^ listCollectionIdsRequest.parent_.isEmpty(), listCollectionIdsRequest.parent_);
                boolean bl = this.pageSize_ != 0;
                int n = this.pageSize_;
                int n2 = listCollectionIdsRequest.pageSize_;
                boolean bl2 = false;
                if (n2 != 0) {
                    bl2 = true;
                }
                this.pageSize_ = visitor.visitInt(bl, n, bl2, listCollectionIdsRequest.pageSize_);
                this.pageToken_ = visitor.visitString(true ^ this.pageToken_.isEmpty(), this.pageToken_, true ^ listCollectionIdsRequest.pageToken_.isEmpty(), listCollectionIdsRequest.pageToken_);
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
        return new ListCollectionIdsRequest();
    }

    public int getPageSize() {
        return this.pageSize_;
    }

    public String getPageToken() {
        return this.pageToken_;
    }

    public ByteString getPageTokenBytes() {
        return ByteString.copyFromUtf8((String)this.pageToken_);
    }

    public String getParent() {
        return this.parent_;
    }

    public ByteString getParentBytes() {
        return ByteString.copyFromUtf8((String)this.parent_);
    }

    public int getSerializedSize() {
        int n;
        int n2 = this.memoizedSerializedSize;
        if (n2 != -1) {
            return n2;
        }
        boolean bl = this.parent_.isEmpty();
        int n3 = 0;
        if (!bl) {
            n3 = 0 + CodedOutputStream.computeStringSize((int)1, (String)this.getParent());
        }
        if ((n = this.pageSize_) != 0) {
            n3 += CodedOutputStream.computeInt32Size((int)2, (int)n);
        }
        if (!this.pageToken_.isEmpty()) {
            n3 += CodedOutputStream.computeStringSize((int)3, (String)this.getPageToken());
        }
        this.memoizedSerializedSize = n3;
        return n3;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        int n;
        if (!this.parent_.isEmpty()) {
            codedOutputStream.writeString(1, this.getParent());
        }
        if ((n = this.pageSize_) != 0) {
            codedOutputStream.writeInt32(2, n);
        }
        if (!this.pageToken_.isEmpty()) {
            codedOutputStream.writeString(3, this.getPageToken());
        }
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<ListCollectionIdsRequest, Builder>
    implements ListCollectionIdsRequestOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder clearPageSize() {
            this.copyOnWrite();
            ((ListCollectionIdsRequest)this.instance).clearPageSize();
            return this;
        }

        public Builder clearPageToken() {
            this.copyOnWrite();
            ((ListCollectionIdsRequest)this.instance).clearPageToken();
            return this;
        }

        public Builder clearParent() {
            this.copyOnWrite();
            ((ListCollectionIdsRequest)this.instance).clearParent();
            return this;
        }

        public int getPageSize() {
            return ((ListCollectionIdsRequest)this.instance).getPageSize();
        }

        public String getPageToken() {
            return ((ListCollectionIdsRequest)this.instance).getPageToken();
        }

        public ByteString getPageTokenBytes() {
            return ((ListCollectionIdsRequest)this.instance).getPageTokenBytes();
        }

        public String getParent() {
            return ((ListCollectionIdsRequest)this.instance).getParent();
        }

        public ByteString getParentBytes() {
            return ((ListCollectionIdsRequest)this.instance).getParentBytes();
        }

        public Builder setPageSize(int n) {
            this.copyOnWrite();
            ((ListCollectionIdsRequest)this.instance).setPageSize(n);
            return this;
        }

        public Builder setPageToken(String string) {
            this.copyOnWrite();
            ((ListCollectionIdsRequest)this.instance).setPageToken(string);
            return this;
        }

        public Builder setPageTokenBytes(ByteString byteString) {
            this.copyOnWrite();
            ((ListCollectionIdsRequest)this.instance).setPageTokenBytes(byteString);
            return this;
        }

        public Builder setParent(String string) {
            this.copyOnWrite();
            ((ListCollectionIdsRequest)this.instance).setParent(string);
            return this;
        }

        public Builder setParentBytes(ByteString byteString) {
            this.copyOnWrite();
            ((ListCollectionIdsRequest)this.instance).setParentBytes(byteString);
            return this;
        }
    }

}

