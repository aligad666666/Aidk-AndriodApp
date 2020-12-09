/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.firestore.v1.ListDocumentsRequest$1
 *  com.google.firestore.v1.ListDocumentsRequest$ConsistencySelectorCase
 *  com.google.firestore.v1.ListDocumentsRequestOrBuilder
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.CodedOutputStream
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageLite
 *  com.google.protobuf.GeneratedMessageLite$Builder
 *  com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser
 *  com.google.protobuf.GeneratedMessageLite$MergeFromVisitor
 *  com.google.protobuf.GeneratedMessageLite$MethodToInvoke
 *  com.google.protobuf.GeneratedMessageLite$Visitor
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.Parser
 *  com.google.protobuf.Timestamp
 *  com.google.protobuf.Timestamp$Builder
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

import com.google.firestore.v1.DocumentMask;
import com.google.firestore.v1.ListDocumentsRequest;
import com.google.firestore.v1.ListDocumentsRequestOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;
import java.io.IOException;
import java.io.InputStream;

/*
 * Exception performing whole class analysis ignored.
 */
public final class ListDocumentsRequest
extends GeneratedMessageLite<ListDocumentsRequest, Builder>
implements ListDocumentsRequestOrBuilder {
    public static final int COLLECTION_ID_FIELD_NUMBER = 2;
    private static final ListDocumentsRequest DEFAULT_INSTANCE = new ListDocumentsRequest();
    public static final int MASK_FIELD_NUMBER = 7;
    public static final int ORDER_BY_FIELD_NUMBER = 6;
    public static final int PAGE_SIZE_FIELD_NUMBER = 3;
    public static final int PAGE_TOKEN_FIELD_NUMBER = 4;
    public static final int PARENT_FIELD_NUMBER = 1;
    private static volatile Parser<ListDocumentsRequest> PARSER;
    public static final int READ_TIME_FIELD_NUMBER = 10;
    public static final int SHOW_MISSING_FIELD_NUMBER = 12;
    public static final int TRANSACTION_FIELD_NUMBER = 8;
    private String collectionId_ = "";
    private int consistencySelectorCase_ = 0;
    private Object consistencySelector_;
    private DocumentMask mask_;
    private String orderBy_ = "";
    private int pageSize_;
    private String pageToken_ = "";
    private String parent_ = "";
    private boolean showMissing_;

    static {
        DEFAULT_INSTANCE.makeImmutable();
    }

    private ListDocumentsRequest() {
    }

    private void clearCollectionId() {
        this.collectionId_ = ListDocumentsRequest.getDefaultInstance().getCollectionId();
    }

    private void clearConsistencySelector() {
        this.consistencySelectorCase_ = 0;
        this.consistencySelector_ = null;
    }

    private void clearMask() {
        this.mask_ = null;
    }

    private void clearOrderBy() {
        this.orderBy_ = ListDocumentsRequest.getDefaultInstance().getOrderBy();
    }

    private void clearPageSize() {
        this.pageSize_ = 0;
    }

    private void clearPageToken() {
        this.pageToken_ = ListDocumentsRequest.getDefaultInstance().getPageToken();
    }

    private void clearParent() {
        this.parent_ = ListDocumentsRequest.getDefaultInstance().getParent();
    }

    private void clearReadTime() {
        if (this.consistencySelectorCase_ == 10) {
            this.consistencySelectorCase_ = 0;
            this.consistencySelector_ = null;
        }
    }

    private void clearShowMissing() {
        this.showMissing_ = false;
    }

    private void clearTransaction() {
        if (this.consistencySelectorCase_ == 8) {
            this.consistencySelectorCase_ = 0;
            this.consistencySelector_ = null;
        }
    }

    public static ListDocumentsRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeMask(DocumentMask documentMask) {
        DocumentMask documentMask2 = this.mask_;
        if (documentMask2 != null && documentMask2 != DocumentMask.getDefaultInstance()) {
            this.mask_ = (DocumentMask)((DocumentMask.Builder)DocumentMask.newBuilder(this.mask_).mergeFrom((GeneratedMessageLite)documentMask)).buildPartial();
            return;
        }
        this.mask_ = documentMask;
    }

    private void mergeReadTime(Timestamp timestamp) {
        this.consistencySelector_ = this.consistencySelectorCase_ == 10 && this.consistencySelector_ != Timestamp.getDefaultInstance() ? ((Timestamp.Builder)Timestamp.newBuilder((Timestamp)((Timestamp)this.consistencySelector_)).mergeFrom((GeneratedMessageLite)timestamp)).buildPartial() : timestamp;
        this.consistencySelectorCase_ = 10;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(ListDocumentsRequest listDocumentsRequest) {
        return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)listDocumentsRequest);
    }

    public static ListDocumentsRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ListDocumentsRequest)ListDocumentsRequest.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static ListDocumentsRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ListDocumentsRequest)ListDocumentsRequest.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ListDocumentsRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ListDocumentsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static ListDocumentsRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ListDocumentsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ListDocumentsRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ListDocumentsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static ListDocumentsRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ListDocumentsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ListDocumentsRequest parseFrom(InputStream inputStream) throws IOException {
        return (ListDocumentsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static ListDocumentsRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ListDocumentsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ListDocumentsRequest parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (ListDocumentsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static ListDocumentsRequest parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ListDocumentsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<ListDocumentsRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setCollectionId(String string) {
        if (string != null) {
            this.collectionId_ = string;
            return;
        }
        throw new NullPointerException();
    }

    private void setCollectionIdBytes(ByteString byteString) {
        if (byteString != null) {
            ListDocumentsRequest.checkByteStringIsUtf8((ByteString)byteString);
            this.collectionId_ = byteString.toStringUtf8();
            return;
        }
        throw new NullPointerException();
    }

    private void setMask(DocumentMask.Builder builder) {
        this.mask_ = (DocumentMask)builder.build();
    }

    private void setMask(DocumentMask documentMask) {
        if (documentMask != null) {
            this.mask_ = documentMask;
            return;
        }
        throw new NullPointerException();
    }

    private void setOrderBy(String string) {
        if (string != null) {
            this.orderBy_ = string;
            return;
        }
        throw new NullPointerException();
    }

    private void setOrderByBytes(ByteString byteString) {
        if (byteString != null) {
            ListDocumentsRequest.checkByteStringIsUtf8((ByteString)byteString);
            this.orderBy_ = byteString.toStringUtf8();
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
            ListDocumentsRequest.checkByteStringIsUtf8((ByteString)byteString);
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
            ListDocumentsRequest.checkByteStringIsUtf8((ByteString)byteString);
            this.parent_ = byteString.toStringUtf8();
            return;
        }
        throw new NullPointerException();
    }

    private void setReadTime(Timestamp.Builder builder) {
        this.consistencySelector_ = builder.build();
        this.consistencySelectorCase_ = 10;
    }

    private void setReadTime(Timestamp timestamp) {
        if (timestamp != null) {
            this.consistencySelector_ = timestamp;
            this.consistencySelectorCase_ = 10;
            return;
        }
        throw new NullPointerException();
    }

    private void setShowMissing(boolean bl) {
        this.showMissing_ = bl;
    }

    private void setTransaction(ByteString byteString) {
        if (byteString != null) {
            this.consistencySelectorCase_ = 8;
            this.consistencySelector_ = byteString;
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
                Class<ListDocumentsRequest> class_ = ListDocumentsRequest.class;
                // MONITORENTER : com.google.firestore.v1.ListDocumentsRequest.class
                if (PARSER == null) {
                    PARSER = new GeneratedMessageLite.DefaultInstanceBasedParser((GeneratedMessageLite)DEFAULT_INSTANCE);
                }
                // MONITOREXIT : class_
                return PARSER;
            }
            case 6: {
                CodedInputStream codedInputStream = (CodedInputStream)object;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite)object2;
                boolean bl = false;
                while (!bl) {
                    int n = codedInputStream.readTag();
                    if (n != 0) {
                        if (n != 10) {
                            if (n != 18) {
                                if (n != 24) {
                                    if (n != 34) {
                                        if (n != 50) {
                                            if (n != 58) {
                                                if (n != 66) {
                                                    if (n != 82) {
                                                        if (n != 96) {
                                                            if (codedInputStream.skipField(n)) continue;
                                                            bl = true;
                                                            continue;
                                                        }
                                                        this.showMissing_ = codedInputStream.readBool();
                                                        continue;
                                                    }
                                                    int n2 = this.consistencySelectorCase_;
                                                    Timestamp.Builder builder = null;
                                                    if (n2 == 10) {
                                                        builder = (Timestamp.Builder)((Timestamp)this.consistencySelector_).toBuilder();
                                                    }
                                                    this.consistencySelector_ = codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                                    if (builder != null) {
                                                        builder.mergeFrom((GeneratedMessageLite)((Timestamp)this.consistencySelector_));
                                                        this.consistencySelector_ = builder.buildPartial();
                                                    }
                                                    this.consistencySelectorCase_ = 10;
                                                    continue;
                                                }
                                                this.consistencySelectorCase_ = 8;
                                                this.consistencySelector_ = codedInputStream.readBytes();
                                                continue;
                                            }
                                            DocumentMask documentMask = this.mask_;
                                            DocumentMask.Builder builder = null;
                                            if (documentMask != null) {
                                                builder = (DocumentMask.Builder)this.mask_.toBuilder();
                                            }
                                            this.mask_ = (DocumentMask)codedInputStream.readMessage(DocumentMask.parser(), extensionRegistryLite);
                                            if (builder == null) continue;
                                            builder.mergeFrom((GeneratedMessageLite)this.mask_);
                                            this.mask_ = (DocumentMask)builder.buildPartial();
                                            continue;
                                        }
                                        this.orderBy_ = codedInputStream.readStringRequireUtf8();
                                        continue;
                                    }
                                    this.pageToken_ = codedInputStream.readStringRequireUtf8();
                                    continue;
                                }
                                this.pageSize_ = codedInputStream.readInt32();
                                continue;
                            }
                            this.collectionId_ = codedInputStream.readStringRequireUtf8();
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
                ListDocumentsRequest listDocumentsRequest = (ListDocumentsRequest)((Object)object2);
                boolean bl = this.parent_.isEmpty();
                boolean bl2 = true;
                this.parent_ = visitor.visitString(bl ^ bl2, this.parent_, bl2 ^ listDocumentsRequest.parent_.isEmpty(), listDocumentsRequest.parent_);
                this.collectionId_ = visitor.visitString(bl2 ^ this.collectionId_.isEmpty(), this.collectionId_, bl2 ^ listDocumentsRequest.collectionId_.isEmpty(), listDocumentsRequest.collectionId_);
                boolean bl3 = this.pageSize_ != 0;
                int n = this.pageSize_;
                boolean bl4 = listDocumentsRequest.pageSize_ != 0;
                this.pageSize_ = visitor.visitInt(bl3, n, bl4, listDocumentsRequest.pageSize_);
                this.pageToken_ = visitor.visitString(bl2 ^ this.pageToken_.isEmpty(), this.pageToken_, bl2 ^ listDocumentsRequest.pageToken_.isEmpty(), listDocumentsRequest.pageToken_);
                this.orderBy_ = visitor.visitString(bl2 ^ this.orderBy_.isEmpty(), this.orderBy_, bl2 ^ listDocumentsRequest.orderBy_.isEmpty(), listDocumentsRequest.orderBy_);
                this.mask_ = (DocumentMask)visitor.visitMessage((MessageLite)this.mask_, (MessageLite)listDocumentsRequest.mask_);
                boolean bl5 = this.showMissing_;
                boolean bl6 = listDocumentsRequest.showMissing_;
                this.showMissing_ = visitor.visitBoolean(bl5, bl5, bl6, bl6);
                boolean bl7 = 1.$SwitchMap$com$google$firestore$v1$ListDocumentsRequest$ConsistencySelectorCase[listDocumentsRequest.getConsistencySelectorCase().ordinal()];
                if (bl7 != bl2) {
                    if (!bl7) {
                        if (bl7) {
                            if (this.consistencySelectorCase_ == 0) {
                                bl2 = false;
                            }
                            visitor.visitOneofNotSet(bl2);
                        }
                    } else {
                        if (this.consistencySelectorCase_ != 10) {
                            bl2 = false;
                        }
                        this.consistencySelector_ = visitor.visitOneofMessage(bl2, this.consistencySelector_, listDocumentsRequest.consistencySelector_);
                    }
                } else {
                    if (this.consistencySelectorCase_ != 8) {
                        bl2 = false;
                    }
                    this.consistencySelector_ = visitor.visitOneofByteString(bl2, this.consistencySelector_, listDocumentsRequest.consistencySelector_);
                }
                if (visitor != GeneratedMessageLite.MergeFromVisitor.INSTANCE) return this;
                int n3 = listDocumentsRequest.consistencySelectorCase_;
                if (n3 == 0) return this;
                this.consistencySelectorCase_ = n3;
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
        return new ListDocumentsRequest();
    }

    public String getCollectionId() {
        return this.collectionId_;
    }

    public ByteString getCollectionIdBytes() {
        return ByteString.copyFromUtf8((String)this.collectionId_);
    }

    public ConsistencySelectorCase getConsistencySelectorCase() {
        return ConsistencySelectorCase.forNumber((int)this.consistencySelectorCase_);
    }

    public DocumentMask getMask() {
        DocumentMask documentMask = this.mask_;
        if (documentMask == null) {
            documentMask = DocumentMask.getDefaultInstance();
        }
        return documentMask;
    }

    public String getOrderBy() {
        return this.orderBy_;
    }

    public ByteString getOrderByBytes() {
        return ByteString.copyFromUtf8((String)this.orderBy_);
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

    public Timestamp getReadTime() {
        if (this.consistencySelectorCase_ == 10) {
            return (Timestamp)this.consistencySelector_;
        }
        return Timestamp.getDefaultInstance();
    }

    public int getSerializedSize() {
        boolean bl;
        int n;
        int n2 = this.memoizedSerializedSize;
        if (n2 != -1) {
            return n2;
        }
        boolean bl2 = this.parent_.isEmpty();
        int n3 = 0;
        if (!bl2) {
            n3 = 0 + CodedOutputStream.computeStringSize((int)1, (String)this.getParent());
        }
        if (!this.collectionId_.isEmpty()) {
            n3 += CodedOutputStream.computeStringSize((int)2, (String)this.getCollectionId());
        }
        if ((n = this.pageSize_) != 0) {
            n3 += CodedOutputStream.computeInt32Size((int)3, (int)n);
        }
        if (!this.pageToken_.isEmpty()) {
            n3 += CodedOutputStream.computeStringSize((int)4, (String)this.getPageToken());
        }
        if (!this.orderBy_.isEmpty()) {
            n3 += CodedOutputStream.computeStringSize((int)6, (String)this.getOrderBy());
        }
        if (this.mask_ != null) {
            n3 += CodedOutputStream.computeMessageSize((int)7, (MessageLite)this.getMask());
        }
        if (this.consistencySelectorCase_ == 8) {
            n3 += CodedOutputStream.computeBytesSize((int)8, (ByteString)((ByteString)this.consistencySelector_));
        }
        if (this.consistencySelectorCase_ == 10) {
            n3 += CodedOutputStream.computeMessageSize((int)10, (MessageLite)((Timestamp)this.consistencySelector_));
        }
        if (bl = this.showMissing_) {
            n3 += CodedOutputStream.computeBoolSize((int)12, (boolean)bl);
        }
        this.memoizedSerializedSize = n3;
        return n3;
    }

    public boolean getShowMissing() {
        return this.showMissing_;
    }

    public ByteString getTransaction() {
        if (this.consistencySelectorCase_ == 8) {
            return (ByteString)this.consistencySelector_;
        }
        return ByteString.EMPTY;
    }

    public boolean hasMask() {
        return this.mask_ != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        int n;
        boolean bl;
        if (!this.parent_.isEmpty()) {
            codedOutputStream.writeString(1, this.getParent());
        }
        if (!this.collectionId_.isEmpty()) {
            codedOutputStream.writeString(2, this.getCollectionId());
        }
        if ((n = this.pageSize_) != 0) {
            codedOutputStream.writeInt32(3, n);
        }
        if (!this.pageToken_.isEmpty()) {
            codedOutputStream.writeString(4, this.getPageToken());
        }
        if (!this.orderBy_.isEmpty()) {
            codedOutputStream.writeString(6, this.getOrderBy());
        }
        if (this.mask_ != null) {
            codedOutputStream.writeMessage(7, (MessageLite)this.getMask());
        }
        if (this.consistencySelectorCase_ == 8) {
            codedOutputStream.writeBytes(8, (ByteString)this.consistencySelector_);
        }
        if (this.consistencySelectorCase_ == 10) {
            codedOutputStream.writeMessage(10, (MessageLite)((Timestamp)this.consistencySelector_));
        }
        if (bl = this.showMissing_) {
            codedOutputStream.writeBool(12, bl);
        }
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<ListDocumentsRequest, Builder>
    implements ListDocumentsRequestOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder clearCollectionId() {
            this.copyOnWrite();
            ((ListDocumentsRequest)this.instance).clearCollectionId();
            return this;
        }

        public Builder clearConsistencySelector() {
            this.copyOnWrite();
            ((ListDocumentsRequest)this.instance).clearConsistencySelector();
            return this;
        }

        public Builder clearMask() {
            this.copyOnWrite();
            ((ListDocumentsRequest)this.instance).clearMask();
            return this;
        }

        public Builder clearOrderBy() {
            this.copyOnWrite();
            ((ListDocumentsRequest)this.instance).clearOrderBy();
            return this;
        }

        public Builder clearPageSize() {
            this.copyOnWrite();
            ((ListDocumentsRequest)this.instance).clearPageSize();
            return this;
        }

        public Builder clearPageToken() {
            this.copyOnWrite();
            ((ListDocumentsRequest)this.instance).clearPageToken();
            return this;
        }

        public Builder clearParent() {
            this.copyOnWrite();
            ((ListDocumentsRequest)this.instance).clearParent();
            return this;
        }

        public Builder clearReadTime() {
            this.copyOnWrite();
            ((ListDocumentsRequest)this.instance).clearReadTime();
            return this;
        }

        public Builder clearShowMissing() {
            this.copyOnWrite();
            ((ListDocumentsRequest)this.instance).clearShowMissing();
            return this;
        }

        public Builder clearTransaction() {
            this.copyOnWrite();
            ((ListDocumentsRequest)this.instance).clearTransaction();
            return this;
        }

        public String getCollectionId() {
            return ((ListDocumentsRequest)this.instance).getCollectionId();
        }

        public ByteString getCollectionIdBytes() {
            return ((ListDocumentsRequest)this.instance).getCollectionIdBytes();
        }

        public ConsistencySelectorCase getConsistencySelectorCase() {
            return ((ListDocumentsRequest)this.instance).getConsistencySelectorCase();
        }

        public DocumentMask getMask() {
            return ((ListDocumentsRequest)this.instance).getMask();
        }

        public String getOrderBy() {
            return ((ListDocumentsRequest)this.instance).getOrderBy();
        }

        public ByteString getOrderByBytes() {
            return ((ListDocumentsRequest)this.instance).getOrderByBytes();
        }

        public int getPageSize() {
            return ((ListDocumentsRequest)this.instance).getPageSize();
        }

        public String getPageToken() {
            return ((ListDocumentsRequest)this.instance).getPageToken();
        }

        public ByteString getPageTokenBytes() {
            return ((ListDocumentsRequest)this.instance).getPageTokenBytes();
        }

        public String getParent() {
            return ((ListDocumentsRequest)this.instance).getParent();
        }

        public ByteString getParentBytes() {
            return ((ListDocumentsRequest)this.instance).getParentBytes();
        }

        public Timestamp getReadTime() {
            return ((ListDocumentsRequest)this.instance).getReadTime();
        }

        public boolean getShowMissing() {
            return ((ListDocumentsRequest)this.instance).getShowMissing();
        }

        public ByteString getTransaction() {
            return ((ListDocumentsRequest)this.instance).getTransaction();
        }

        public boolean hasMask() {
            return ((ListDocumentsRequest)this.instance).hasMask();
        }

        public Builder mergeMask(DocumentMask documentMask) {
            this.copyOnWrite();
            ((ListDocumentsRequest)this.instance).mergeMask(documentMask);
            return this;
        }

        public Builder mergeReadTime(Timestamp timestamp) {
            this.copyOnWrite();
            ((ListDocumentsRequest)this.instance).mergeReadTime(timestamp);
            return this;
        }

        public Builder setCollectionId(String string) {
            this.copyOnWrite();
            ((ListDocumentsRequest)this.instance).setCollectionId(string);
            return this;
        }

        public Builder setCollectionIdBytes(ByteString byteString) {
            this.copyOnWrite();
            ((ListDocumentsRequest)this.instance).setCollectionIdBytes(byteString);
            return this;
        }

        public Builder setMask(DocumentMask.Builder builder) {
            this.copyOnWrite();
            ((ListDocumentsRequest)this.instance).setMask(builder);
            return this;
        }

        public Builder setMask(DocumentMask documentMask) {
            this.copyOnWrite();
            ((ListDocumentsRequest)this.instance).setMask(documentMask);
            return this;
        }

        public Builder setOrderBy(String string) {
            this.copyOnWrite();
            ((ListDocumentsRequest)this.instance).setOrderBy(string);
            return this;
        }

        public Builder setOrderByBytes(ByteString byteString) {
            this.copyOnWrite();
            ((ListDocumentsRequest)this.instance).setOrderByBytes(byteString);
            return this;
        }

        public Builder setPageSize(int n) {
            this.copyOnWrite();
            ((ListDocumentsRequest)this.instance).setPageSize(n);
            return this;
        }

        public Builder setPageToken(String string) {
            this.copyOnWrite();
            ((ListDocumentsRequest)this.instance).setPageToken(string);
            return this;
        }

        public Builder setPageTokenBytes(ByteString byteString) {
            this.copyOnWrite();
            ((ListDocumentsRequest)this.instance).setPageTokenBytes(byteString);
            return this;
        }

        public Builder setParent(String string) {
            this.copyOnWrite();
            ((ListDocumentsRequest)this.instance).setParent(string);
            return this;
        }

        public Builder setParentBytes(ByteString byteString) {
            this.copyOnWrite();
            ((ListDocumentsRequest)this.instance).setParentBytes(byteString);
            return this;
        }

        public Builder setReadTime(Timestamp.Builder builder) {
            this.copyOnWrite();
            ((ListDocumentsRequest)this.instance).setReadTime(builder);
            return this;
        }

        public Builder setReadTime(Timestamp timestamp) {
            this.copyOnWrite();
            ((ListDocumentsRequest)this.instance).setReadTime(timestamp);
            return this;
        }

        public Builder setShowMissing(boolean bl) {
            this.copyOnWrite();
            ((ListDocumentsRequest)this.instance).setShowMissing(bl);
            return this;
        }

        public Builder setTransaction(ByteString byteString) {
            this.copyOnWrite();
            ((ListDocumentsRequest)this.instance).setTransaction(byteString);
            return this;
        }
    }

}

