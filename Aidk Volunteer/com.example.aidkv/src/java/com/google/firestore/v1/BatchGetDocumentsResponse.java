/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.firestore.v1.BatchGetDocumentsResponse$1
 *  com.google.firestore.v1.BatchGetDocumentsResponse$ResultCase
 *  com.google.firestore.v1.BatchGetDocumentsResponseOrBuilder
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

import com.google.firestore.v1.BatchGetDocumentsResponse;
import com.google.firestore.v1.BatchGetDocumentsResponseOrBuilder;
import com.google.firestore.v1.Document;
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
public final class BatchGetDocumentsResponse
extends GeneratedMessageLite<BatchGetDocumentsResponse, Builder>
implements BatchGetDocumentsResponseOrBuilder {
    private static final BatchGetDocumentsResponse DEFAULT_INSTANCE = new BatchGetDocumentsResponse();
    public static final int FOUND_FIELD_NUMBER = 1;
    public static final int MISSING_FIELD_NUMBER = 2;
    private static volatile Parser<BatchGetDocumentsResponse> PARSER;
    public static final int READ_TIME_FIELD_NUMBER = 4;
    public static final int TRANSACTION_FIELD_NUMBER = 3;
    private Timestamp readTime_;
    private int resultCase_ = 0;
    private Object result_;
    private ByteString transaction_ = ByteString.EMPTY;

    static {
        DEFAULT_INSTANCE.makeImmutable();
    }

    private BatchGetDocumentsResponse() {
    }

    private void clearFound() {
        if (this.resultCase_ == 1) {
            this.resultCase_ = 0;
            this.result_ = null;
        }
    }

    private void clearMissing() {
        if (this.resultCase_ == 2) {
            this.resultCase_ = 0;
            this.result_ = null;
        }
    }

    private void clearReadTime() {
        this.readTime_ = null;
    }

    private void clearResult() {
        this.resultCase_ = 0;
        this.result_ = null;
    }

    private void clearTransaction() {
        this.transaction_ = BatchGetDocumentsResponse.getDefaultInstance().getTransaction();
    }

    public static BatchGetDocumentsResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeFound(Document document) {
        this.result_ = this.resultCase_ == 1 && this.result_ != Document.getDefaultInstance() ? ((Document.Builder)Document.newBuilder((Document)((Object)this.result_)).mergeFrom((GeneratedMessageLite)document)).buildPartial() : document;
        this.resultCase_ = 1;
    }

    private void mergeReadTime(Timestamp timestamp) {
        Timestamp timestamp2 = this.readTime_;
        if (timestamp2 != null && timestamp2 != Timestamp.getDefaultInstance()) {
            this.readTime_ = (Timestamp)((Timestamp.Builder)Timestamp.newBuilder((Timestamp)this.readTime_).mergeFrom((GeneratedMessageLite)timestamp)).buildPartial();
            return;
        }
        this.readTime_ = timestamp;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(BatchGetDocumentsResponse batchGetDocumentsResponse) {
        return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)batchGetDocumentsResponse);
    }

    public static BatchGetDocumentsResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (BatchGetDocumentsResponse)BatchGetDocumentsResponse.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static BatchGetDocumentsResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BatchGetDocumentsResponse)BatchGetDocumentsResponse.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static BatchGetDocumentsResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (BatchGetDocumentsResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static BatchGetDocumentsResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BatchGetDocumentsResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static BatchGetDocumentsResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (BatchGetDocumentsResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static BatchGetDocumentsResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BatchGetDocumentsResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static BatchGetDocumentsResponse parseFrom(InputStream inputStream) throws IOException {
        return (BatchGetDocumentsResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static BatchGetDocumentsResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BatchGetDocumentsResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static BatchGetDocumentsResponse parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (BatchGetDocumentsResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static BatchGetDocumentsResponse parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BatchGetDocumentsResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<BatchGetDocumentsResponse> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setFound(Document.Builder builder) {
        this.result_ = builder.build();
        this.resultCase_ = 1;
    }

    private void setFound(Document document) {
        if (document != null) {
            this.result_ = document;
            this.resultCase_ = 1;
            return;
        }
        throw new NullPointerException();
    }

    private void setMissing(String string) {
        if (string != null) {
            this.resultCase_ = 2;
            this.result_ = string;
            return;
        }
        throw new NullPointerException();
    }

    private void setMissingBytes(ByteString byteString) {
        if (byteString != null) {
            BatchGetDocumentsResponse.checkByteStringIsUtf8((ByteString)byteString);
            this.resultCase_ = 2;
            this.result_ = byteString.toStringUtf8();
            return;
        }
        throw new NullPointerException();
    }

    private void setReadTime(Timestamp.Builder builder) {
        this.readTime_ = (Timestamp)builder.build();
    }

    private void setReadTime(Timestamp timestamp) {
        if (timestamp != null) {
            this.readTime_ = timestamp;
            return;
        }
        throw new NullPointerException();
    }

    private void setTransaction(ByteString byteString) {
        if (byteString != null) {
            this.transaction_ = byteString;
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
        int n = 1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()];
        int n2 = 1;
        switch (n) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 8: {
                if (PARSER != null) return PARSER;
                Class<BatchGetDocumentsResponse> class_ = BatchGetDocumentsResponse.class;
                // MONITORENTER : com.google.firestore.v1.BatchGetDocumentsResponse.class
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
                    int n3 = codedInputStream.readTag();
                    if (n3 != 0) {
                        if (n3 != 10) {
                            if (n3 != 18) {
                                if (n3 != 26) {
                                    if (n3 != 34) {
                                        if (codedInputStream.skipField(n3)) continue;
                                        bl = true;
                                        continue;
                                    }
                                    Timestamp timestamp = this.readTime_;
                                    Timestamp.Builder builder = null;
                                    if (timestamp != null) {
                                        builder = (Timestamp.Builder)this.readTime_.toBuilder();
                                    }
                                    this.readTime_ = (Timestamp)codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                    if (builder == null) continue;
                                    builder.mergeFrom((GeneratedMessageLite)this.readTime_);
                                    this.readTime_ = (Timestamp)builder.buildPartial();
                                    continue;
                                }
                                this.transaction_ = codedInputStream.readBytes();
                                continue;
                            }
                            String string = codedInputStream.readStringRequireUtf8();
                            this.resultCase_ = 2;
                            this.result_ = string;
                            continue;
                        }
                        int n4 = this.resultCase_;
                        Document.Builder builder = null;
                        if (n4 == n2) {
                            builder = (Document.Builder)((Document)((Object)this.result_)).toBuilder();
                        }
                        this.result_ = codedInputStream.readMessage(Document.parser(), extensionRegistryLite);
                        if (builder != null) {
                            builder.mergeFrom((GeneratedMessageLite)((Document)((Object)this.result_)));
                            this.result_ = builder.buildPartial();
                        }
                        this.resultCase_ = n2;
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
                BatchGetDocumentsResponse batchGetDocumentsResponse = (BatchGetDocumentsResponse)((Object)object2);
                boolean bl = this.transaction_ != ByteString.EMPTY;
                ByteString byteString = this.transaction_;
                boolean bl2 = batchGetDocumentsResponse.transaction_ != ByteString.EMPTY;
                this.transaction_ = visitor.visitByteString(bl, byteString, bl2, batchGetDocumentsResponse.transaction_);
                this.readTime_ = (Timestamp)visitor.visitMessage((MessageLite)this.readTime_, (MessageLite)batchGetDocumentsResponse.readTime_);
                int n5 = 1.$SwitchMap$com$google$firestore$v1$BatchGetDocumentsResponse$ResultCase[batchGetDocumentsResponse.getResultCase().ordinal()];
                if (n5 != n2) {
                    if (n5 != 2) {
                        if (n5 == 3) {
                            if (this.resultCase_ == 0) {
                                n2 = 0;
                            }
                            visitor.visitOneofNotSet((boolean)n2);
                        }
                    } else {
                        if (this.resultCase_ != 2) {
                            n2 = 0;
                        }
                        this.result_ = visitor.visitOneofString((boolean)n2, this.result_, batchGetDocumentsResponse.result_);
                    }
                } else {
                    if (this.resultCase_ != n2) {
                        n2 = 0;
                    }
                    this.result_ = visitor.visitOneofMessage((boolean)n2, this.result_, batchGetDocumentsResponse.result_);
                }
                if (visitor != GeneratedMessageLite.MergeFromVisitor.INSTANCE) return this;
                int n6 = batchGetDocumentsResponse.resultCase_;
                if (n6 == 0) return this;
                this.resultCase_ = n6;
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
        return new BatchGetDocumentsResponse();
    }

    public Document getFound() {
        if (this.resultCase_ == 1) {
            return (Document)((Object)this.result_);
        }
        return Document.getDefaultInstance();
    }

    public String getMissing() {
        String string = "";
        if (this.resultCase_ == 2) {
            string = (String)this.result_;
        }
        return string;
    }

    public ByteString getMissingBytes() {
        String string = "";
        if (this.resultCase_ == 2) {
            string = (String)this.result_;
        }
        return ByteString.copyFromUtf8((String)string);
    }

    public Timestamp getReadTime() {
        Timestamp timestamp = this.readTime_;
        if (timestamp == null) {
            timestamp = Timestamp.getDefaultInstance();
        }
        return timestamp;
    }

    public ResultCase getResultCase() {
        return ResultCase.forNumber((int)this.resultCase_);
    }

    public int getSerializedSize() {
        int n = this.memoizedSerializedSize;
        if (n != -1) {
            return n;
        }
        int n2 = this.resultCase_;
        int n3 = 0;
        if (n2 == 1) {
            n3 = 0 + CodedOutputStream.computeMessageSize((int)1, (MessageLite)((Document)((Object)this.result_)));
        }
        if (this.resultCase_ == 2) {
            n3 += CodedOutputStream.computeStringSize((int)2, (String)this.getMissing());
        }
        if (!this.transaction_.isEmpty()) {
            n3 += CodedOutputStream.computeBytesSize((int)3, (ByteString)this.transaction_);
        }
        if (this.readTime_ != null) {
            n3 += CodedOutputStream.computeMessageSize((int)4, (MessageLite)this.getReadTime());
        }
        this.memoizedSerializedSize = n3;
        return n3;
    }

    public ByteString getTransaction() {
        return this.transaction_;
    }

    public boolean hasReadTime() {
        return this.readTime_ != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.resultCase_ == 1) {
            codedOutputStream.writeMessage(1, (MessageLite)((Document)((Object)this.result_)));
        }
        if (this.resultCase_ == 2) {
            codedOutputStream.writeString(2, this.getMissing());
        }
        if (!this.transaction_.isEmpty()) {
            codedOutputStream.writeBytes(3, this.transaction_);
        }
        if (this.readTime_ != null) {
            codedOutputStream.writeMessage(4, (MessageLite)this.getReadTime());
        }
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<BatchGetDocumentsResponse, Builder>
    implements BatchGetDocumentsResponseOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder clearFound() {
            this.copyOnWrite();
            ((BatchGetDocumentsResponse)this.instance).clearFound();
            return this;
        }

        public Builder clearMissing() {
            this.copyOnWrite();
            ((BatchGetDocumentsResponse)this.instance).clearMissing();
            return this;
        }

        public Builder clearReadTime() {
            this.copyOnWrite();
            ((BatchGetDocumentsResponse)this.instance).clearReadTime();
            return this;
        }

        public Builder clearResult() {
            this.copyOnWrite();
            ((BatchGetDocumentsResponse)this.instance).clearResult();
            return this;
        }

        public Builder clearTransaction() {
            this.copyOnWrite();
            ((BatchGetDocumentsResponse)this.instance).clearTransaction();
            return this;
        }

        public Document getFound() {
            return ((BatchGetDocumentsResponse)this.instance).getFound();
        }

        public String getMissing() {
            return ((BatchGetDocumentsResponse)this.instance).getMissing();
        }

        public ByteString getMissingBytes() {
            return ((BatchGetDocumentsResponse)this.instance).getMissingBytes();
        }

        public Timestamp getReadTime() {
            return ((BatchGetDocumentsResponse)this.instance).getReadTime();
        }

        public ResultCase getResultCase() {
            return ((BatchGetDocumentsResponse)this.instance).getResultCase();
        }

        public ByteString getTransaction() {
            return ((BatchGetDocumentsResponse)this.instance).getTransaction();
        }

        public boolean hasReadTime() {
            return ((BatchGetDocumentsResponse)this.instance).hasReadTime();
        }

        public Builder mergeFound(Document document) {
            this.copyOnWrite();
            ((BatchGetDocumentsResponse)this.instance).mergeFound(document);
            return this;
        }

        public Builder mergeReadTime(Timestamp timestamp) {
            this.copyOnWrite();
            ((BatchGetDocumentsResponse)this.instance).mergeReadTime(timestamp);
            return this;
        }

        public Builder setFound(Document.Builder builder) {
            this.copyOnWrite();
            ((BatchGetDocumentsResponse)this.instance).setFound(builder);
            return this;
        }

        public Builder setFound(Document document) {
            this.copyOnWrite();
            ((BatchGetDocumentsResponse)this.instance).setFound(document);
            return this;
        }

        public Builder setMissing(String string) {
            this.copyOnWrite();
            ((BatchGetDocumentsResponse)this.instance).setMissing(string);
            return this;
        }

        public Builder setMissingBytes(ByteString byteString) {
            this.copyOnWrite();
            ((BatchGetDocumentsResponse)this.instance).setMissingBytes(byteString);
            return this;
        }

        public Builder setReadTime(Timestamp.Builder builder) {
            this.copyOnWrite();
            ((BatchGetDocumentsResponse)this.instance).setReadTime(builder);
            return this;
        }

        public Builder setReadTime(Timestamp timestamp) {
            this.copyOnWrite();
            ((BatchGetDocumentsResponse)this.instance).setReadTime(timestamp);
            return this;
        }

        public Builder setTransaction(ByteString byteString) {
            this.copyOnWrite();
            ((BatchGetDocumentsResponse)this.instance).setTransaction(byteString);
            return this;
        }
    }

}

