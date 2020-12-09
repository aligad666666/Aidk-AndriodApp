/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.longrunning.ListOperationsRequest$1
 *  com.google.longrunning.ListOperationsRequestOrBuilder
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
package com.google.longrunning;

import com.google.longrunning.ListOperationsRequest;
import com.google.longrunning.ListOperationsRequestOrBuilder;
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

public final class ListOperationsRequest
extends GeneratedMessageLite<ListOperationsRequest, Builder>
implements ListOperationsRequestOrBuilder {
    private static final ListOperationsRequest DEFAULT_INSTANCE = new ListOperationsRequest();
    public static final int FILTER_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 4;
    public static final int PAGE_SIZE_FIELD_NUMBER = 2;
    public static final int PAGE_TOKEN_FIELD_NUMBER = 3;
    private static volatile Parser<ListOperationsRequest> PARSER;
    private String filter_ = "";
    private String name_ = "";
    private int pageSize_;
    private String pageToken_ = "";

    static {
        DEFAULT_INSTANCE.makeImmutable();
    }

    private ListOperationsRequest() {
    }

    private void clearFilter() {
        this.filter_ = ListOperationsRequest.getDefaultInstance().getFilter();
    }

    private void clearName() {
        this.name_ = ListOperationsRequest.getDefaultInstance().getName();
    }

    private void clearPageSize() {
        this.pageSize_ = 0;
    }

    private void clearPageToken() {
        this.pageToken_ = ListOperationsRequest.getDefaultInstance().getPageToken();
    }

    public static ListOperationsRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(ListOperationsRequest listOperationsRequest) {
        return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)listOperationsRequest);
    }

    public static ListOperationsRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ListOperationsRequest)ListOperationsRequest.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static ListOperationsRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ListOperationsRequest)ListOperationsRequest.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ListOperationsRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ListOperationsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static ListOperationsRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ListOperationsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ListOperationsRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ListOperationsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static ListOperationsRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ListOperationsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ListOperationsRequest parseFrom(InputStream inputStream) throws IOException {
        return (ListOperationsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static ListOperationsRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ListOperationsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ListOperationsRequest parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (ListOperationsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static ListOperationsRequest parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ListOperationsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<ListOperationsRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setFilter(String string) {
        if (string != null) {
            this.filter_ = string;
            return;
        }
        throw new NullPointerException();
    }

    private void setFilterBytes(ByteString byteString) {
        if (byteString != null) {
            ListOperationsRequest.checkByteStringIsUtf8((ByteString)byteString);
            this.filter_ = byteString.toStringUtf8();
            return;
        }
        throw new NullPointerException();
    }

    private void setName(String string) {
        if (string != null) {
            this.name_ = string;
            return;
        }
        throw new NullPointerException();
    }

    private void setNameBytes(ByteString byteString) {
        if (byteString != null) {
            ListOperationsRequest.checkByteStringIsUtf8((ByteString)byteString);
            this.name_ = byteString.toStringUtf8();
            return;
        }
        throw new NullPointerException();
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
            ListOperationsRequest.checkByteStringIsUtf8((ByteString)byteString);
            this.pageToken_ = byteString.toStringUtf8();
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
                Class<ListOperationsRequest> class_ = ListOperationsRequest.class;
                // MONITORENTER : com.google.longrunning.ListOperationsRequest.class
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
                                    if (n != 34) {
                                        if (codedInputStream.skipField(n)) continue;
                                        bl = true;
                                        continue;
                                    }
                                    this.name_ = codedInputStream.readStringRequireUtf8();
                                    continue;
                                }
                                this.pageToken_ = codedInputStream.readStringRequireUtf8();
                                continue;
                            }
                            this.pageSize_ = codedInputStream.readInt32();
                            continue;
                        }
                        this.filter_ = codedInputStream.readStringRequireUtf8();
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
                ListOperationsRequest listOperationsRequest = (ListOperationsRequest)((Object)object2);
                this.name_ = visitor.visitString(true ^ this.name_.isEmpty(), this.name_, true ^ listOperationsRequest.name_.isEmpty(), listOperationsRequest.name_);
                this.filter_ = visitor.visitString(true ^ this.filter_.isEmpty(), this.filter_, true ^ listOperationsRequest.filter_.isEmpty(), listOperationsRequest.filter_);
                boolean bl = this.pageSize_ != 0;
                int n = this.pageSize_;
                int n2 = listOperationsRequest.pageSize_;
                boolean bl2 = false;
                if (n2 != 0) {
                    bl2 = true;
                }
                this.pageSize_ = visitor.visitInt(bl, n, bl2, listOperationsRequest.pageSize_);
                this.pageToken_ = visitor.visitString(true ^ this.pageToken_.isEmpty(), this.pageToken_, true ^ listOperationsRequest.pageToken_.isEmpty(), listOperationsRequest.pageToken_);
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
        return new ListOperationsRequest();
    }

    public String getFilter() {
        return this.filter_;
    }

    public ByteString getFilterBytes() {
        return ByteString.copyFromUtf8((String)this.filter_);
    }

    public String getName() {
        return this.name_;
    }

    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8((String)this.name_);
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

    public int getSerializedSize() {
        int n;
        int n2 = this.memoizedSerializedSize;
        if (n2 != -1) {
            return n2;
        }
        boolean bl = this.filter_.isEmpty();
        int n3 = 0;
        if (!bl) {
            n3 = 0 + CodedOutputStream.computeStringSize((int)1, (String)this.getFilter());
        }
        if ((n = this.pageSize_) != 0) {
            n3 += CodedOutputStream.computeInt32Size((int)2, (int)n);
        }
        if (!this.pageToken_.isEmpty()) {
            n3 += CodedOutputStream.computeStringSize((int)3, (String)this.getPageToken());
        }
        if (!this.name_.isEmpty()) {
            n3 += CodedOutputStream.computeStringSize((int)4, (String)this.getName());
        }
        this.memoizedSerializedSize = n3;
        return n3;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        int n;
        if (!this.filter_.isEmpty()) {
            codedOutputStream.writeString(1, this.getFilter());
        }
        if ((n = this.pageSize_) != 0) {
            codedOutputStream.writeInt32(2, n);
        }
        if (!this.pageToken_.isEmpty()) {
            codedOutputStream.writeString(3, this.getPageToken());
        }
        if (!this.name_.isEmpty()) {
            codedOutputStream.writeString(4, this.getName());
        }
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<ListOperationsRequest, Builder>
    implements ListOperationsRequestOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder clearFilter() {
            this.copyOnWrite();
            ((ListOperationsRequest)this.instance).clearFilter();
            return this;
        }

        public Builder clearName() {
            this.copyOnWrite();
            ((ListOperationsRequest)this.instance).clearName();
            return this;
        }

        public Builder clearPageSize() {
            this.copyOnWrite();
            ((ListOperationsRequest)this.instance).clearPageSize();
            return this;
        }

        public Builder clearPageToken() {
            this.copyOnWrite();
            ((ListOperationsRequest)this.instance).clearPageToken();
            return this;
        }

        public String getFilter() {
            return ((ListOperationsRequest)this.instance).getFilter();
        }

        public ByteString getFilterBytes() {
            return ((ListOperationsRequest)this.instance).getFilterBytes();
        }

        public String getName() {
            return ((ListOperationsRequest)this.instance).getName();
        }

        public ByteString getNameBytes() {
            return ((ListOperationsRequest)this.instance).getNameBytes();
        }

        public int getPageSize() {
            return ((ListOperationsRequest)this.instance).getPageSize();
        }

        public String getPageToken() {
            return ((ListOperationsRequest)this.instance).getPageToken();
        }

        public ByteString getPageTokenBytes() {
            return ((ListOperationsRequest)this.instance).getPageTokenBytes();
        }

        public Builder setFilter(String string) {
            this.copyOnWrite();
            ((ListOperationsRequest)this.instance).setFilter(string);
            return this;
        }

        public Builder setFilterBytes(ByteString byteString) {
            this.copyOnWrite();
            ((ListOperationsRequest)this.instance).setFilterBytes(byteString);
            return this;
        }

        public Builder setName(String string) {
            this.copyOnWrite();
            ((ListOperationsRequest)this.instance).setName(string);
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            this.copyOnWrite();
            ((ListOperationsRequest)this.instance).setNameBytes(byteString);
            return this;
        }

        public Builder setPageSize(int n) {
            this.copyOnWrite();
            ((ListOperationsRequest)this.instance).setPageSize(n);
            return this;
        }

        public Builder setPageToken(String string) {
            this.copyOnWrite();
            ((ListOperationsRequest)this.instance).setPageToken(string);
            return this;
        }

        public Builder setPageTokenBytes(ByteString byteString) {
            this.copyOnWrite();
            ((ListOperationsRequest)this.instance).setPageTokenBytes(byteString);
            return this;
        }
    }

}

