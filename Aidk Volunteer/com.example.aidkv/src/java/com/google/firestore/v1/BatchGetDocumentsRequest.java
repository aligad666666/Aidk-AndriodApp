/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.firestore.v1.BatchGetDocumentsRequest$1
 *  com.google.firestore.v1.BatchGetDocumentsRequest$ConsistencySelectorCase
 *  com.google.firestore.v1.BatchGetDocumentsRequestOrBuilder
 *  com.google.protobuf.AbstractMessageLite
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
 *  com.google.protobuf.Internal
 *  com.google.protobuf.Internal$ProtobufList
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.Parser
 *  com.google.protobuf.Timestamp
 *  com.google.protobuf.Timestamp$Builder
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.Class
 *  java.lang.Iterable
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.UnsupportedOperationException
 *  java.util.Collections
 *  java.util.List
 */
package com.google.firestore.v1;

import com.google.firestore.v1.BatchGetDocumentsRequest;
import com.google.firestore.v1.BatchGetDocumentsRequestOrBuilder;
import com.google.firestore.v1.DocumentMask;
import com.google.firestore.v1.TransactionOptions;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/*
 * Exception performing whole class analysis ignored.
 */
public final class BatchGetDocumentsRequest
extends GeneratedMessageLite<BatchGetDocumentsRequest, Builder>
implements BatchGetDocumentsRequestOrBuilder {
    public static final int DATABASE_FIELD_NUMBER = 1;
    private static final BatchGetDocumentsRequest DEFAULT_INSTANCE = new BatchGetDocumentsRequest();
    public static final int DOCUMENTS_FIELD_NUMBER = 2;
    public static final int MASK_FIELD_NUMBER = 3;
    public static final int NEW_TRANSACTION_FIELD_NUMBER = 5;
    private static volatile Parser<BatchGetDocumentsRequest> PARSER;
    public static final int READ_TIME_FIELD_NUMBER = 7;
    public static final int TRANSACTION_FIELD_NUMBER = 4;
    private int bitField0_;
    private int consistencySelectorCase_ = 0;
    private Object consistencySelector_;
    private String database_ = "";
    private Internal.ProtobufList<String> documents_ = GeneratedMessageLite.emptyProtobufList();
    private DocumentMask mask_;

    static {
        DEFAULT_INSTANCE.makeImmutable();
    }

    private BatchGetDocumentsRequest() {
    }

    private void addAllDocuments(Iterable<String> iterable) {
        this.ensureDocumentsIsMutable();
        AbstractMessageLite.addAll(iterable, this.documents_);
    }

    private void addDocuments(String string) {
        if (string != null) {
            this.ensureDocumentsIsMutable();
            this.documents_.add((Object)string);
            return;
        }
        throw new NullPointerException();
    }

    private void addDocumentsBytes(ByteString byteString) {
        if (byteString != null) {
            BatchGetDocumentsRequest.checkByteStringIsUtf8((ByteString)byteString);
            this.ensureDocumentsIsMutable();
            this.documents_.add((Object)byteString.toStringUtf8());
            return;
        }
        throw new NullPointerException();
    }

    private void clearConsistencySelector() {
        this.consistencySelectorCase_ = 0;
        this.consistencySelector_ = null;
    }

    private void clearDatabase() {
        this.database_ = BatchGetDocumentsRequest.getDefaultInstance().getDatabase();
    }

    private void clearDocuments() {
        this.documents_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearMask() {
        this.mask_ = null;
    }

    private void clearNewTransaction() {
        if (this.consistencySelectorCase_ == 5) {
            this.consistencySelectorCase_ = 0;
            this.consistencySelector_ = null;
        }
    }

    private void clearReadTime() {
        if (this.consistencySelectorCase_ == 7) {
            this.consistencySelectorCase_ = 0;
            this.consistencySelector_ = null;
        }
    }

    private void clearTransaction() {
        if (this.consistencySelectorCase_ == 4) {
            this.consistencySelectorCase_ = 0;
            this.consistencySelector_ = null;
        }
    }

    private void ensureDocumentsIsMutable() {
        if (!this.documents_.isModifiable()) {
            this.documents_ = GeneratedMessageLite.mutableCopy(this.documents_);
        }
    }

    public static BatchGetDocumentsRequest getDefaultInstance() {
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

    private void mergeNewTransaction(TransactionOptions transactionOptions) {
        this.consistencySelector_ = this.consistencySelectorCase_ == 5 && this.consistencySelector_ != TransactionOptions.getDefaultInstance() ? ((TransactionOptions.Builder)TransactionOptions.newBuilder((TransactionOptions)((Object)this.consistencySelector_)).mergeFrom((GeneratedMessageLite)transactionOptions)).buildPartial() : transactionOptions;
        this.consistencySelectorCase_ = 5;
    }

    private void mergeReadTime(Timestamp timestamp) {
        this.consistencySelector_ = this.consistencySelectorCase_ == 7 && this.consistencySelector_ != Timestamp.getDefaultInstance() ? ((Timestamp.Builder)Timestamp.newBuilder((Timestamp)((Timestamp)this.consistencySelector_)).mergeFrom((GeneratedMessageLite)timestamp)).buildPartial() : timestamp;
        this.consistencySelectorCase_ = 7;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(BatchGetDocumentsRequest batchGetDocumentsRequest) {
        return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)batchGetDocumentsRequest);
    }

    public static BatchGetDocumentsRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (BatchGetDocumentsRequest)BatchGetDocumentsRequest.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static BatchGetDocumentsRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BatchGetDocumentsRequest)BatchGetDocumentsRequest.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static BatchGetDocumentsRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (BatchGetDocumentsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static BatchGetDocumentsRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BatchGetDocumentsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static BatchGetDocumentsRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (BatchGetDocumentsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static BatchGetDocumentsRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BatchGetDocumentsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static BatchGetDocumentsRequest parseFrom(InputStream inputStream) throws IOException {
        return (BatchGetDocumentsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static BatchGetDocumentsRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BatchGetDocumentsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static BatchGetDocumentsRequest parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (BatchGetDocumentsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static BatchGetDocumentsRequest parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BatchGetDocumentsRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<BatchGetDocumentsRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setDatabase(String string) {
        if (string != null) {
            this.database_ = string;
            return;
        }
        throw new NullPointerException();
    }

    private void setDatabaseBytes(ByteString byteString) {
        if (byteString != null) {
            BatchGetDocumentsRequest.checkByteStringIsUtf8((ByteString)byteString);
            this.database_ = byteString.toStringUtf8();
            return;
        }
        throw new NullPointerException();
    }

    private void setDocuments(int n, String string) {
        if (string != null) {
            this.ensureDocumentsIsMutable();
            this.documents_.set(n, (Object)string);
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

    private void setNewTransaction(TransactionOptions.Builder builder) {
        this.consistencySelector_ = builder.build();
        this.consistencySelectorCase_ = 5;
    }

    private void setNewTransaction(TransactionOptions transactionOptions) {
        if (transactionOptions != null) {
            this.consistencySelector_ = transactionOptions;
            this.consistencySelectorCase_ = 5;
            return;
        }
        throw new NullPointerException();
    }

    private void setReadTime(Timestamp.Builder builder) {
        this.consistencySelector_ = builder.build();
        this.consistencySelectorCase_ = 7;
    }

    private void setReadTime(Timestamp timestamp) {
        if (timestamp != null) {
            this.consistencySelector_ = timestamp;
            this.consistencySelectorCase_ = 7;
            return;
        }
        throw new NullPointerException();
    }

    private void setTransaction(ByteString byteString) {
        if (byteString != null) {
            this.consistencySelectorCase_ = 4;
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
                Class<BatchGetDocumentsRequest> class_ = BatchGetDocumentsRequest.class;
                // MONITORENTER : com.google.firestore.v1.BatchGetDocumentsRequest.class
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
                                if (n != 26) {
                                    if (n != 34) {
                                        if (n != 42) {
                                            if (n != 58) {
                                                if (codedInputStream.skipField(n)) continue;
                                                bl = true;
                                                continue;
                                            }
                                            int n2 = this.consistencySelectorCase_;
                                            Timestamp.Builder builder = null;
                                            if (n2 == 7) {
                                                builder = (Timestamp.Builder)((Timestamp)this.consistencySelector_).toBuilder();
                                            }
                                            this.consistencySelector_ = codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                            if (builder != null) {
                                                builder.mergeFrom((GeneratedMessageLite)((Timestamp)this.consistencySelector_));
                                                this.consistencySelector_ = builder.buildPartial();
                                            }
                                            this.consistencySelectorCase_ = 7;
                                            continue;
                                        }
                                        int n3 = this.consistencySelectorCase_;
                                        TransactionOptions.Builder builder = null;
                                        if (n3 == 5) {
                                            builder = (TransactionOptions.Builder)((TransactionOptions)((Object)this.consistencySelector_)).toBuilder();
                                        }
                                        this.consistencySelector_ = codedInputStream.readMessage(TransactionOptions.parser(), extensionRegistryLite);
                                        if (builder != null) {
                                            builder.mergeFrom((GeneratedMessageLite)((TransactionOptions)((Object)this.consistencySelector_)));
                                            this.consistencySelector_ = builder.buildPartial();
                                        }
                                        this.consistencySelectorCase_ = 5;
                                        continue;
                                    }
                                    this.consistencySelectorCase_ = 4;
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
                            String string = codedInputStream.readStringRequireUtf8();
                            if (!this.documents_.isModifiable()) {
                                this.documents_ = GeneratedMessageLite.mutableCopy(this.documents_);
                            }
                            this.documents_.add((Object)string);
                            continue;
                        }
                        this.database_ = codedInputStream.readStringRequireUtf8();
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
                BatchGetDocumentsRequest batchGetDocumentsRequest = (BatchGetDocumentsRequest)((Object)object2);
                boolean bl = this.database_.isEmpty();
                boolean bl2 = true;
                this.database_ = visitor.visitString(bl ^ bl2, this.database_, bl2 ^ batchGetDocumentsRequest.database_.isEmpty(), batchGetDocumentsRequest.database_);
                this.documents_ = visitor.visitList(this.documents_, batchGetDocumentsRequest.documents_);
                this.mask_ = (DocumentMask)visitor.visitMessage((MessageLite)this.mask_, (MessageLite)batchGetDocumentsRequest.mask_);
                boolean bl3 = 1.$SwitchMap$com$google$firestore$v1$BatchGetDocumentsRequest$ConsistencySelectorCase[batchGetDocumentsRequest.getConsistencySelectorCase().ordinal()];
                if (bl3 != bl2) {
                    if (!bl3) {
                        if (!bl3) {
                            if (bl3) {
                                if (this.consistencySelectorCase_ == 0) {
                                    bl2 = false;
                                }
                                visitor.visitOneofNotSet(bl2);
                            }
                        } else {
                            if (this.consistencySelectorCase_ != 7) {
                                bl2 = false;
                            }
                            this.consistencySelector_ = visitor.visitOneofMessage(bl2, this.consistencySelector_, batchGetDocumentsRequest.consistencySelector_);
                        }
                    } else {
                        if (this.consistencySelectorCase_ != 5) {
                            bl2 = false;
                        }
                        this.consistencySelector_ = visitor.visitOneofMessage(bl2, this.consistencySelector_, batchGetDocumentsRequest.consistencySelector_);
                    }
                } else {
                    if (this.consistencySelectorCase_ != 4) {
                        bl2 = false;
                    }
                    this.consistencySelector_ = visitor.visitOneofByteString(bl2, this.consistencySelector_, batchGetDocumentsRequest.consistencySelector_);
                }
                if (visitor != GeneratedMessageLite.MergeFromVisitor.INSTANCE) return this;
                int n = batchGetDocumentsRequest.consistencySelectorCase_;
                if (n != 0) {
                    this.consistencySelectorCase_ = n;
                }
                this.bitField0_ |= batchGetDocumentsRequest.bitField0_;
                return this;
            }
            case 4: {
                return new Builder();
            }
            case 3: {
                this.documents_.makeImmutable();
                return null;
            }
            case 2: {
                return DEFAULT_INSTANCE;
            }
            case 1: 
        }
        return new BatchGetDocumentsRequest();
    }

    public ConsistencySelectorCase getConsistencySelectorCase() {
        return ConsistencySelectorCase.forNumber((int)this.consistencySelectorCase_);
    }

    public String getDatabase() {
        return this.database_;
    }

    public ByteString getDatabaseBytes() {
        return ByteString.copyFromUtf8((String)this.database_);
    }

    public String getDocuments(int n) {
        return (String)this.documents_.get(n);
    }

    public ByteString getDocumentsBytes(int n) {
        return ByteString.copyFromUtf8((String)((String)this.documents_.get(n)));
    }

    public int getDocumentsCount() {
        return this.documents_.size();
    }

    public List<String> getDocumentsList() {
        return this.documents_;
    }

    public DocumentMask getMask() {
        DocumentMask documentMask = this.mask_;
        if (documentMask == null) {
            documentMask = DocumentMask.getDefaultInstance();
        }
        return documentMask;
    }

    public TransactionOptions getNewTransaction() {
        if (this.consistencySelectorCase_ == 5) {
            return (TransactionOptions)((Object)this.consistencySelector_);
        }
        return TransactionOptions.getDefaultInstance();
    }

    public Timestamp getReadTime() {
        if (this.consistencySelectorCase_ == 7) {
            return (Timestamp)this.consistencySelector_;
        }
        return Timestamp.getDefaultInstance();
    }

    public int getSerializedSize() {
        int n = this.memoizedSerializedSize;
        if (n != -1) {
            return n;
        }
        boolean bl = this.database_.isEmpty();
        int n2 = 0;
        if (!bl) {
            n2 = 0 + CodedOutputStream.computeStringSize((int)1, (String)this.getDatabase());
        }
        int n3 = 0;
        for (int i = 0; i < this.documents_.size(); ++i) {
            n3 += CodedOutputStream.computeStringSizeNoTag((String)((String)this.documents_.get(i)));
        }
        int n4 = n2 + n3 + 1 * this.getDocumentsList().size();
        if (this.mask_ != null) {
            n4 += CodedOutputStream.computeMessageSize((int)3, (MessageLite)this.getMask());
        }
        if (this.consistencySelectorCase_ == 4) {
            n4 += CodedOutputStream.computeBytesSize((int)4, (ByteString)((ByteString)this.consistencySelector_));
        }
        if (this.consistencySelectorCase_ == 5) {
            n4 += CodedOutputStream.computeMessageSize((int)5, (MessageLite)((TransactionOptions)((Object)this.consistencySelector_)));
        }
        if (this.consistencySelectorCase_ == 7) {
            n4 += CodedOutputStream.computeMessageSize((int)7, (MessageLite)((Timestamp)this.consistencySelector_));
        }
        this.memoizedSerializedSize = n4;
        return n4;
    }

    public ByteString getTransaction() {
        if (this.consistencySelectorCase_ == 4) {
            return (ByteString)this.consistencySelector_;
        }
        return ByteString.EMPTY;
    }

    public boolean hasMask() {
        return this.mask_ != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.database_.isEmpty()) {
            codedOutputStream.writeString(1, this.getDatabase());
        }
        for (int i = 0; i < this.documents_.size(); ++i) {
            codedOutputStream.writeString(2, (String)this.documents_.get(i));
        }
        if (this.mask_ != null) {
            codedOutputStream.writeMessage(3, (MessageLite)this.getMask());
        }
        if (this.consistencySelectorCase_ == 4) {
            codedOutputStream.writeBytes(4, (ByteString)this.consistencySelector_);
        }
        if (this.consistencySelectorCase_ == 5) {
            codedOutputStream.writeMessage(5, (MessageLite)((TransactionOptions)((Object)this.consistencySelector_)));
        }
        if (this.consistencySelectorCase_ == 7) {
            codedOutputStream.writeMessage(7, (MessageLite)((Timestamp)this.consistencySelector_));
        }
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<BatchGetDocumentsRequest, Builder>
    implements BatchGetDocumentsRequestOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder addAllDocuments(Iterable<String> iterable) {
            this.copyOnWrite();
            ((BatchGetDocumentsRequest)this.instance).addAllDocuments((Iterable<String>)iterable);
            return this;
        }

        public Builder addDocuments(String string) {
            this.copyOnWrite();
            ((BatchGetDocumentsRequest)this.instance).addDocuments(string);
            return this;
        }

        public Builder addDocumentsBytes(ByteString byteString) {
            this.copyOnWrite();
            ((BatchGetDocumentsRequest)this.instance).addDocumentsBytes(byteString);
            return this;
        }

        public Builder clearConsistencySelector() {
            this.copyOnWrite();
            ((BatchGetDocumentsRequest)this.instance).clearConsistencySelector();
            return this;
        }

        public Builder clearDatabase() {
            this.copyOnWrite();
            ((BatchGetDocumentsRequest)this.instance).clearDatabase();
            return this;
        }

        public Builder clearDocuments() {
            this.copyOnWrite();
            ((BatchGetDocumentsRequest)this.instance).clearDocuments();
            return this;
        }

        public Builder clearMask() {
            this.copyOnWrite();
            ((BatchGetDocumentsRequest)this.instance).clearMask();
            return this;
        }

        public Builder clearNewTransaction() {
            this.copyOnWrite();
            ((BatchGetDocumentsRequest)this.instance).clearNewTransaction();
            return this;
        }

        public Builder clearReadTime() {
            this.copyOnWrite();
            ((BatchGetDocumentsRequest)this.instance).clearReadTime();
            return this;
        }

        public Builder clearTransaction() {
            this.copyOnWrite();
            ((BatchGetDocumentsRequest)this.instance).clearTransaction();
            return this;
        }

        public ConsistencySelectorCase getConsistencySelectorCase() {
            return ((BatchGetDocumentsRequest)this.instance).getConsistencySelectorCase();
        }

        public String getDatabase() {
            return ((BatchGetDocumentsRequest)this.instance).getDatabase();
        }

        public ByteString getDatabaseBytes() {
            return ((BatchGetDocumentsRequest)this.instance).getDatabaseBytes();
        }

        public String getDocuments(int n) {
            return ((BatchGetDocumentsRequest)this.instance).getDocuments(n);
        }

        public ByteString getDocumentsBytes(int n) {
            return ((BatchGetDocumentsRequest)this.instance).getDocumentsBytes(n);
        }

        public int getDocumentsCount() {
            return ((BatchGetDocumentsRequest)this.instance).getDocumentsCount();
        }

        public List<String> getDocumentsList() {
            return Collections.unmodifiableList(((BatchGetDocumentsRequest)this.instance).getDocumentsList());
        }

        public DocumentMask getMask() {
            return ((BatchGetDocumentsRequest)this.instance).getMask();
        }

        public TransactionOptions getNewTransaction() {
            return ((BatchGetDocumentsRequest)this.instance).getNewTransaction();
        }

        public Timestamp getReadTime() {
            return ((BatchGetDocumentsRequest)this.instance).getReadTime();
        }

        public ByteString getTransaction() {
            return ((BatchGetDocumentsRequest)this.instance).getTransaction();
        }

        public boolean hasMask() {
            return ((BatchGetDocumentsRequest)this.instance).hasMask();
        }

        public Builder mergeMask(DocumentMask documentMask) {
            this.copyOnWrite();
            ((BatchGetDocumentsRequest)this.instance).mergeMask(documentMask);
            return this;
        }

        public Builder mergeNewTransaction(TransactionOptions transactionOptions) {
            this.copyOnWrite();
            ((BatchGetDocumentsRequest)this.instance).mergeNewTransaction(transactionOptions);
            return this;
        }

        public Builder mergeReadTime(Timestamp timestamp) {
            this.copyOnWrite();
            ((BatchGetDocumentsRequest)this.instance).mergeReadTime(timestamp);
            return this;
        }

        public Builder setDatabase(String string) {
            this.copyOnWrite();
            ((BatchGetDocumentsRequest)this.instance).setDatabase(string);
            return this;
        }

        public Builder setDatabaseBytes(ByteString byteString) {
            this.copyOnWrite();
            ((BatchGetDocumentsRequest)this.instance).setDatabaseBytes(byteString);
            return this;
        }

        public Builder setDocuments(int n, String string) {
            this.copyOnWrite();
            ((BatchGetDocumentsRequest)this.instance).setDocuments(n, string);
            return this;
        }

        public Builder setMask(DocumentMask.Builder builder) {
            this.copyOnWrite();
            ((BatchGetDocumentsRequest)this.instance).setMask(builder);
            return this;
        }

        public Builder setMask(DocumentMask documentMask) {
            this.copyOnWrite();
            ((BatchGetDocumentsRequest)this.instance).setMask(documentMask);
            return this;
        }

        public Builder setNewTransaction(TransactionOptions.Builder builder) {
            this.copyOnWrite();
            ((BatchGetDocumentsRequest)this.instance).setNewTransaction(builder);
            return this;
        }

        public Builder setNewTransaction(TransactionOptions transactionOptions) {
            this.copyOnWrite();
            ((BatchGetDocumentsRequest)this.instance).setNewTransaction(transactionOptions);
            return this;
        }

        public Builder setReadTime(Timestamp.Builder builder) {
            this.copyOnWrite();
            ((BatchGetDocumentsRequest)this.instance).setReadTime(builder);
            return this;
        }

        public Builder setReadTime(Timestamp timestamp) {
            this.copyOnWrite();
            ((BatchGetDocumentsRequest)this.instance).setReadTime(timestamp);
            return this;
        }

        public Builder setTransaction(ByteString byteString) {
            this.copyOnWrite();
            ((BatchGetDocumentsRequest)this.instance).setTransaction(byteString);
            return this;
        }
    }

}

