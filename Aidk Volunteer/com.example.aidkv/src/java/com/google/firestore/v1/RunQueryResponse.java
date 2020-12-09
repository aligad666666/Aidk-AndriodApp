/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.firestore.v1.RunQueryResponse$1
 *  com.google.firestore.v1.RunQueryResponseOrBuilder
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

import com.google.firestore.v1.Document;
import com.google.firestore.v1.RunQueryResponse;
import com.google.firestore.v1.RunQueryResponseOrBuilder;
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

public final class RunQueryResponse
extends GeneratedMessageLite<RunQueryResponse, Builder>
implements RunQueryResponseOrBuilder {
    private static final RunQueryResponse DEFAULT_INSTANCE = new RunQueryResponse();
    public static final int DOCUMENT_FIELD_NUMBER = 1;
    private static volatile Parser<RunQueryResponse> PARSER;
    public static final int READ_TIME_FIELD_NUMBER = 3;
    public static final int SKIPPED_RESULTS_FIELD_NUMBER = 4;
    public static final int TRANSACTION_FIELD_NUMBER = 2;
    private Document document_;
    private Timestamp readTime_;
    private int skippedResults_;
    private ByteString transaction_ = ByteString.EMPTY;

    static {
        DEFAULT_INSTANCE.makeImmutable();
    }

    private RunQueryResponse() {
    }

    private void clearDocument() {
        this.document_ = null;
    }

    private void clearReadTime() {
        this.readTime_ = null;
    }

    private void clearSkippedResults() {
        this.skippedResults_ = 0;
    }

    private void clearTransaction() {
        this.transaction_ = RunQueryResponse.getDefaultInstance().getTransaction();
    }

    public static RunQueryResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeDocument(Document document) {
        Document document2 = this.document_;
        if (document2 != null && document2 != Document.getDefaultInstance()) {
            this.document_ = (Document)((Document.Builder)Document.newBuilder(this.document_).mergeFrom((GeneratedMessageLite)document)).buildPartial();
            return;
        }
        this.document_ = document;
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

    public static Builder newBuilder(RunQueryResponse runQueryResponse) {
        return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)runQueryResponse);
    }

    public static RunQueryResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RunQueryResponse)RunQueryResponse.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static RunQueryResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RunQueryResponse)RunQueryResponse.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static RunQueryResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (RunQueryResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static RunQueryResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RunQueryResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static RunQueryResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (RunQueryResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static RunQueryResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RunQueryResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static RunQueryResponse parseFrom(InputStream inputStream) throws IOException {
        return (RunQueryResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static RunQueryResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RunQueryResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static RunQueryResponse parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (RunQueryResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static RunQueryResponse parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RunQueryResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<RunQueryResponse> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setDocument(Document.Builder builder) {
        this.document_ = (Document)builder.build();
    }

    private void setDocument(Document document) {
        if (document != null) {
            this.document_ = document;
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

    private void setSkippedResults(int n) {
        this.skippedResults_ = n;
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
        switch (1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 8: {
                if (PARSER != null) return PARSER;
                Class<RunQueryResponse> class_ = RunQueryResponse.class;
                // MONITORENTER : com.google.firestore.v1.RunQueryResponse.class
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
                                    if (n != 32) {
                                        if (codedInputStream.skipField(n)) continue;
                                        bl = true;
                                        continue;
                                    }
                                    this.skippedResults_ = codedInputStream.readInt32();
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
                        Document document = this.document_;
                        Document.Builder builder = null;
                        if (document != null) {
                            builder = (Document.Builder)this.document_.toBuilder();
                        }
                        this.document_ = (Document)codedInputStream.readMessage(Document.parser(), extensionRegistryLite);
                        if (builder == null) continue;
                        builder.mergeFrom((GeneratedMessageLite)this.document_);
                        this.document_ = (Document)builder.buildPartial();
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
                RunQueryResponse runQueryResponse = (RunQueryResponse)((Object)object2);
                ByteString byteString = this.transaction_;
                ByteString byteString2 = ByteString.EMPTY;
                boolean bl = true;
                boolean bl2 = byteString != byteString2;
                ByteString byteString3 = this.transaction_;
                boolean bl3 = runQueryResponse.transaction_ != ByteString.EMPTY;
                this.transaction_ = visitor.visitByteString(bl2, byteString3, bl3, runQueryResponse.transaction_);
                this.document_ = (Document)visitor.visitMessage((MessageLite)this.document_, (MessageLite)runQueryResponse.document_);
                this.readTime_ = (Timestamp)visitor.visitMessage((MessageLite)this.readTime_, (MessageLite)runQueryResponse.readTime_);
                boolean bl4 = this.skippedResults_ != 0;
                int n = this.skippedResults_;
                if (runQueryResponse.skippedResults_ == 0) {
                    bl = false;
                }
                this.skippedResults_ = visitor.visitInt(bl4, n, bl, runQueryResponse.skippedResults_);
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
        return new RunQueryResponse();
    }

    public Document getDocument() {
        Document document = this.document_;
        if (document == null) {
            document = Document.getDefaultInstance();
        }
        return document;
    }

    public Timestamp getReadTime() {
        Timestamp timestamp = this.readTime_;
        if (timestamp == null) {
            timestamp = Timestamp.getDefaultInstance();
        }
        return timestamp;
    }

    public int getSerializedSize() {
        int n;
        int n2 = this.memoizedSerializedSize;
        if (n2 != -1) {
            return n2;
        }
        Document document = this.document_;
        int n3 = 0;
        if (document != null) {
            n3 = 0 + CodedOutputStream.computeMessageSize((int)1, (MessageLite)this.getDocument());
        }
        if (!this.transaction_.isEmpty()) {
            n3 += CodedOutputStream.computeBytesSize((int)2, (ByteString)this.transaction_);
        }
        if (this.readTime_ != null) {
            n3 += CodedOutputStream.computeMessageSize((int)3, (MessageLite)this.getReadTime());
        }
        if ((n = this.skippedResults_) != 0) {
            n3 += CodedOutputStream.computeInt32Size((int)4, (int)n);
        }
        this.memoizedSerializedSize = n3;
        return n3;
    }

    public int getSkippedResults() {
        return this.skippedResults_;
    }

    public ByteString getTransaction() {
        return this.transaction_;
    }

    public boolean hasDocument() {
        return this.document_ != null;
    }

    public boolean hasReadTime() {
        return this.readTime_ != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        int n;
        if (this.document_ != null) {
            codedOutputStream.writeMessage(1, (MessageLite)this.getDocument());
        }
        if (!this.transaction_.isEmpty()) {
            codedOutputStream.writeBytes(2, this.transaction_);
        }
        if (this.readTime_ != null) {
            codedOutputStream.writeMessage(3, (MessageLite)this.getReadTime());
        }
        if ((n = this.skippedResults_) != 0) {
            codedOutputStream.writeInt32(4, n);
        }
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<RunQueryResponse, Builder>
    implements RunQueryResponseOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder clearDocument() {
            this.copyOnWrite();
            ((RunQueryResponse)this.instance).clearDocument();
            return this;
        }

        public Builder clearReadTime() {
            this.copyOnWrite();
            ((RunQueryResponse)this.instance).clearReadTime();
            return this;
        }

        public Builder clearSkippedResults() {
            this.copyOnWrite();
            ((RunQueryResponse)this.instance).clearSkippedResults();
            return this;
        }

        public Builder clearTransaction() {
            this.copyOnWrite();
            ((RunQueryResponse)this.instance).clearTransaction();
            return this;
        }

        public Document getDocument() {
            return ((RunQueryResponse)this.instance).getDocument();
        }

        public Timestamp getReadTime() {
            return ((RunQueryResponse)this.instance).getReadTime();
        }

        public int getSkippedResults() {
            return ((RunQueryResponse)this.instance).getSkippedResults();
        }

        public ByteString getTransaction() {
            return ((RunQueryResponse)this.instance).getTransaction();
        }

        public boolean hasDocument() {
            return ((RunQueryResponse)this.instance).hasDocument();
        }

        public boolean hasReadTime() {
            return ((RunQueryResponse)this.instance).hasReadTime();
        }

        public Builder mergeDocument(Document document) {
            this.copyOnWrite();
            ((RunQueryResponse)this.instance).mergeDocument(document);
            return this;
        }

        public Builder mergeReadTime(Timestamp timestamp) {
            this.copyOnWrite();
            ((RunQueryResponse)this.instance).mergeReadTime(timestamp);
            return this;
        }

        public Builder setDocument(Document.Builder builder) {
            this.copyOnWrite();
            ((RunQueryResponse)this.instance).setDocument(builder);
            return this;
        }

        public Builder setDocument(Document document) {
            this.copyOnWrite();
            ((RunQueryResponse)this.instance).setDocument(document);
            return this;
        }

        public Builder setReadTime(Timestamp.Builder builder) {
            this.copyOnWrite();
            ((RunQueryResponse)this.instance).setReadTime(builder);
            return this;
        }

        public Builder setReadTime(Timestamp timestamp) {
            this.copyOnWrite();
            ((RunQueryResponse)this.instance).setReadTime(timestamp);
            return this;
        }

        public Builder setSkippedResults(int n) {
            this.copyOnWrite();
            ((RunQueryResponse)this.instance).setSkippedResults(n);
            return this;
        }

        public Builder setTransaction(ByteString byteString) {
            this.copyOnWrite();
            ((RunQueryResponse)this.instance).setTransaction(byteString);
            return this;
        }
    }

}

