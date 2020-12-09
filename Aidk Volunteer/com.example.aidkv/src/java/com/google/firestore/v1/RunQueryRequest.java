/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.firestore.v1.RunQueryRequest$1
 *  com.google.firestore.v1.RunQueryRequest$ConsistencySelectorCase
 *  com.google.firestore.v1.RunQueryRequest$QueryTypeCase
 *  com.google.firestore.v1.RunQueryRequestOrBuilder
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

import com.google.firestore.v1.RunQueryRequest;
import com.google.firestore.v1.RunQueryRequestOrBuilder;
import com.google.firestore.v1.StructuredQuery;
import com.google.firestore.v1.TransactionOptions;
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
public final class RunQueryRequest
extends GeneratedMessageLite<RunQueryRequest, Builder>
implements RunQueryRequestOrBuilder {
    private static final RunQueryRequest DEFAULT_INSTANCE = new RunQueryRequest();
    public static final int NEW_TRANSACTION_FIELD_NUMBER = 6;
    public static final int PARENT_FIELD_NUMBER = 1;
    private static volatile Parser<RunQueryRequest> PARSER;
    public static final int READ_TIME_FIELD_NUMBER = 7;
    public static final int STRUCTURED_QUERY_FIELD_NUMBER = 2;
    public static final int TRANSACTION_FIELD_NUMBER = 5;
    private int consistencySelectorCase_ = 0;
    private Object consistencySelector_;
    private String parent_ = "";
    private int queryTypeCase_ = 0;
    private Object queryType_;

    static {
        DEFAULT_INSTANCE.makeImmutable();
    }

    private RunQueryRequest() {
    }

    private void clearConsistencySelector() {
        this.consistencySelectorCase_ = 0;
        this.consistencySelector_ = null;
    }

    private void clearNewTransaction() {
        if (this.consistencySelectorCase_ == 6) {
            this.consistencySelectorCase_ = 0;
            this.consistencySelector_ = null;
        }
    }

    private void clearParent() {
        this.parent_ = RunQueryRequest.getDefaultInstance().getParent();
    }

    private void clearQueryType() {
        this.queryTypeCase_ = 0;
        this.queryType_ = null;
    }

    private void clearReadTime() {
        if (this.consistencySelectorCase_ == 7) {
            this.consistencySelectorCase_ = 0;
            this.consistencySelector_ = null;
        }
    }

    private void clearStructuredQuery() {
        if (this.queryTypeCase_ == 2) {
            this.queryTypeCase_ = 0;
            this.queryType_ = null;
        }
    }

    private void clearTransaction() {
        if (this.consistencySelectorCase_ == 5) {
            this.consistencySelectorCase_ = 0;
            this.consistencySelector_ = null;
        }
    }

    public static RunQueryRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeNewTransaction(TransactionOptions transactionOptions) {
        this.consistencySelector_ = this.consistencySelectorCase_ == 6 && this.consistencySelector_ != TransactionOptions.getDefaultInstance() ? ((TransactionOptions.Builder)TransactionOptions.newBuilder((TransactionOptions)((Object)this.consistencySelector_)).mergeFrom((GeneratedMessageLite)transactionOptions)).buildPartial() : transactionOptions;
        this.consistencySelectorCase_ = 6;
    }

    private void mergeReadTime(Timestamp timestamp) {
        this.consistencySelector_ = this.consistencySelectorCase_ == 7 && this.consistencySelector_ != Timestamp.getDefaultInstance() ? ((Timestamp.Builder)Timestamp.newBuilder((Timestamp)((Timestamp)this.consistencySelector_)).mergeFrom((GeneratedMessageLite)timestamp)).buildPartial() : timestamp;
        this.consistencySelectorCase_ = 7;
    }

    private void mergeStructuredQuery(StructuredQuery structuredQuery) {
        this.queryType_ = this.queryTypeCase_ == 2 && this.queryType_ != StructuredQuery.getDefaultInstance() ? ((StructuredQuery.Builder)StructuredQuery.newBuilder((StructuredQuery)((Object)this.queryType_)).mergeFrom((GeneratedMessageLite)structuredQuery)).buildPartial() : structuredQuery;
        this.queryTypeCase_ = 2;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(RunQueryRequest runQueryRequest) {
        return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)runQueryRequest);
    }

    public static RunQueryRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RunQueryRequest)RunQueryRequest.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static RunQueryRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RunQueryRequest)RunQueryRequest.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static RunQueryRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (RunQueryRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static RunQueryRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RunQueryRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static RunQueryRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (RunQueryRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static RunQueryRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RunQueryRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static RunQueryRequest parseFrom(InputStream inputStream) throws IOException {
        return (RunQueryRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static RunQueryRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RunQueryRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static RunQueryRequest parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (RunQueryRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static RunQueryRequest parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RunQueryRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<RunQueryRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setNewTransaction(TransactionOptions.Builder builder) {
        this.consistencySelector_ = builder.build();
        this.consistencySelectorCase_ = 6;
    }

    private void setNewTransaction(TransactionOptions transactionOptions) {
        if (transactionOptions != null) {
            this.consistencySelector_ = transactionOptions;
            this.consistencySelectorCase_ = 6;
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
            RunQueryRequest.checkByteStringIsUtf8((ByteString)byteString);
            this.parent_ = byteString.toStringUtf8();
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

    private void setStructuredQuery(StructuredQuery.Builder builder) {
        this.queryType_ = builder.build();
        this.queryTypeCase_ = 2;
    }

    private void setStructuredQuery(StructuredQuery structuredQuery) {
        if (structuredQuery != null) {
            this.queryType_ = structuredQuery;
            this.queryTypeCase_ = 2;
            return;
        }
        throw new NullPointerException();
    }

    private void setTransaction(ByteString byteString) {
        if (byteString != null) {
            this.consistencySelectorCase_ = 5;
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
                Class<RunQueryRequest> class_ = RunQueryRequest.class;
                // MONITORENTER : com.google.firestore.v1.RunQueryRequest.class
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
                                if (n != 42) {
                                    if (n != 50) {
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
                                    if (n3 == 6) {
                                        builder = (TransactionOptions.Builder)((TransactionOptions)((Object)this.consistencySelector_)).toBuilder();
                                    }
                                    this.consistencySelector_ = codedInputStream.readMessage(TransactionOptions.parser(), extensionRegistryLite);
                                    if (builder != null) {
                                        builder.mergeFrom((GeneratedMessageLite)((TransactionOptions)((Object)this.consistencySelector_)));
                                        this.consistencySelector_ = builder.buildPartial();
                                    }
                                    this.consistencySelectorCase_ = 6;
                                    continue;
                                }
                                this.consistencySelectorCase_ = 5;
                                this.consistencySelector_ = codedInputStream.readBytes();
                                continue;
                            }
                            int n4 = this.queryTypeCase_;
                            StructuredQuery.Builder builder = null;
                            if (n4 == 2) {
                                builder = (StructuredQuery.Builder)((StructuredQuery)((Object)this.queryType_)).toBuilder();
                            }
                            this.queryType_ = codedInputStream.readMessage(StructuredQuery.parser(), extensionRegistryLite);
                            if (builder != null) {
                                builder.mergeFrom((GeneratedMessageLite)((StructuredQuery)((Object)this.queryType_)));
                                this.queryType_ = builder.buildPartial();
                            }
                            this.queryTypeCase_ = 2;
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
                int n5;
                int n;
                GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor)object;
                RunQueryRequest runQueryRequest = (RunQueryRequest)((Object)object2);
                boolean bl = this.parent_.isEmpty();
                int n6 = 1;
                this.parent_ = visitor.visitString(bl ^ n6, this.parent_, n6 ^ runQueryRequest.parent_.isEmpty(), runQueryRequest.parent_);
                int n7 = 1.$SwitchMap$com$google$firestore$v1$RunQueryRequest$QueryTypeCase[runQueryRequest.getQueryTypeCase().ordinal()];
                if (n7 != n6) {
                    if (n7 == 2) {
                        boolean bl2 = this.queryTypeCase_ != 0;
                        visitor.visitOneofNotSet(bl2);
                    }
                } else {
                    boolean bl3 = this.queryTypeCase_ == 2;
                    this.queryType_ = visitor.visitOneofMessage(bl3, this.queryType_, runQueryRequest.queryType_);
                }
                if ((n = 1.$SwitchMap$com$google$firestore$v1$RunQueryRequest$ConsistencySelectorCase[runQueryRequest.getConsistencySelectorCase().ordinal()]) != n6) {
                    if (n != 2) {
                        if (n != 3) {
                            if (n == 4) {
                                if (this.consistencySelectorCase_ == 0) {
                                    n6 = 0;
                                }
                                visitor.visitOneofNotSet((boolean)n6);
                            }
                        } else {
                            if (this.consistencySelectorCase_ != 7) {
                                n6 = 0;
                            }
                            this.consistencySelector_ = visitor.visitOneofMessage((boolean)n6, this.consistencySelector_, runQueryRequest.consistencySelector_);
                        }
                    } else {
                        if (this.consistencySelectorCase_ != 6) {
                            n6 = 0;
                        }
                        this.consistencySelector_ = visitor.visitOneofMessage((boolean)n6, this.consistencySelector_, runQueryRequest.consistencySelector_);
                    }
                } else {
                    if (this.consistencySelectorCase_ != 5) {
                        n6 = 0;
                    }
                    this.consistencySelector_ = visitor.visitOneofByteString((boolean)n6, this.consistencySelector_, runQueryRequest.consistencySelector_);
                }
                if (visitor != GeneratedMessageLite.MergeFromVisitor.INSTANCE) return this;
                int n8 = runQueryRequest.queryTypeCase_;
                if (n8 != 0) {
                    this.queryTypeCase_ = n8;
                }
                if ((n5 = runQueryRequest.consistencySelectorCase_) == 0) return this;
                this.consistencySelectorCase_ = n5;
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
        return new RunQueryRequest();
    }

    public ConsistencySelectorCase getConsistencySelectorCase() {
        return ConsistencySelectorCase.forNumber((int)this.consistencySelectorCase_);
    }

    public TransactionOptions getNewTransaction() {
        if (this.consistencySelectorCase_ == 6) {
            return (TransactionOptions)((Object)this.consistencySelector_);
        }
        return TransactionOptions.getDefaultInstance();
    }

    public String getParent() {
        return this.parent_;
    }

    public ByteString getParentBytes() {
        return ByteString.copyFromUtf8((String)this.parent_);
    }

    public QueryTypeCase getQueryTypeCase() {
        return QueryTypeCase.forNumber((int)this.queryTypeCase_);
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
        boolean bl = this.parent_.isEmpty();
        int n2 = 0;
        if (!bl) {
            n2 = 0 + CodedOutputStream.computeStringSize((int)1, (String)this.getParent());
        }
        if (this.queryTypeCase_ == 2) {
            n2 += CodedOutputStream.computeMessageSize((int)2, (MessageLite)((StructuredQuery)((Object)this.queryType_)));
        }
        if (this.consistencySelectorCase_ == 5) {
            n2 += CodedOutputStream.computeBytesSize((int)5, (ByteString)((ByteString)this.consistencySelector_));
        }
        if (this.consistencySelectorCase_ == 6) {
            n2 += CodedOutputStream.computeMessageSize((int)6, (MessageLite)((TransactionOptions)((Object)this.consistencySelector_)));
        }
        if (this.consistencySelectorCase_ == 7) {
            n2 += CodedOutputStream.computeMessageSize((int)7, (MessageLite)((Timestamp)this.consistencySelector_));
        }
        this.memoizedSerializedSize = n2;
        return n2;
    }

    public StructuredQuery getStructuredQuery() {
        if (this.queryTypeCase_ == 2) {
            return (StructuredQuery)((Object)this.queryType_);
        }
        return StructuredQuery.getDefaultInstance();
    }

    public ByteString getTransaction() {
        if (this.consistencySelectorCase_ == 5) {
            return (ByteString)this.consistencySelector_;
        }
        return ByteString.EMPTY;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.parent_.isEmpty()) {
            codedOutputStream.writeString(1, this.getParent());
        }
        if (this.queryTypeCase_ == 2) {
            codedOutputStream.writeMessage(2, (MessageLite)((StructuredQuery)((Object)this.queryType_)));
        }
        if (this.consistencySelectorCase_ == 5) {
            codedOutputStream.writeBytes(5, (ByteString)this.consistencySelector_);
        }
        if (this.consistencySelectorCase_ == 6) {
            codedOutputStream.writeMessage(6, (MessageLite)((TransactionOptions)((Object)this.consistencySelector_)));
        }
        if (this.consistencySelectorCase_ == 7) {
            codedOutputStream.writeMessage(7, (MessageLite)((Timestamp)this.consistencySelector_));
        }
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<RunQueryRequest, Builder>
    implements RunQueryRequestOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder clearConsistencySelector() {
            this.copyOnWrite();
            ((RunQueryRequest)this.instance).clearConsistencySelector();
            return this;
        }

        public Builder clearNewTransaction() {
            this.copyOnWrite();
            ((RunQueryRequest)this.instance).clearNewTransaction();
            return this;
        }

        public Builder clearParent() {
            this.copyOnWrite();
            ((RunQueryRequest)this.instance).clearParent();
            return this;
        }

        public Builder clearQueryType() {
            this.copyOnWrite();
            ((RunQueryRequest)this.instance).clearQueryType();
            return this;
        }

        public Builder clearReadTime() {
            this.copyOnWrite();
            ((RunQueryRequest)this.instance).clearReadTime();
            return this;
        }

        public Builder clearStructuredQuery() {
            this.copyOnWrite();
            ((RunQueryRequest)this.instance).clearStructuredQuery();
            return this;
        }

        public Builder clearTransaction() {
            this.copyOnWrite();
            ((RunQueryRequest)this.instance).clearTransaction();
            return this;
        }

        public ConsistencySelectorCase getConsistencySelectorCase() {
            return ((RunQueryRequest)this.instance).getConsistencySelectorCase();
        }

        public TransactionOptions getNewTransaction() {
            return ((RunQueryRequest)this.instance).getNewTransaction();
        }

        public String getParent() {
            return ((RunQueryRequest)this.instance).getParent();
        }

        public ByteString getParentBytes() {
            return ((RunQueryRequest)this.instance).getParentBytes();
        }

        public QueryTypeCase getQueryTypeCase() {
            return ((RunQueryRequest)this.instance).getQueryTypeCase();
        }

        public Timestamp getReadTime() {
            return ((RunQueryRequest)this.instance).getReadTime();
        }

        public StructuredQuery getStructuredQuery() {
            return ((RunQueryRequest)this.instance).getStructuredQuery();
        }

        public ByteString getTransaction() {
            return ((RunQueryRequest)this.instance).getTransaction();
        }

        public Builder mergeNewTransaction(TransactionOptions transactionOptions) {
            this.copyOnWrite();
            ((RunQueryRequest)this.instance).mergeNewTransaction(transactionOptions);
            return this;
        }

        public Builder mergeReadTime(Timestamp timestamp) {
            this.copyOnWrite();
            ((RunQueryRequest)this.instance).mergeReadTime(timestamp);
            return this;
        }

        public Builder mergeStructuredQuery(StructuredQuery structuredQuery) {
            this.copyOnWrite();
            ((RunQueryRequest)this.instance).mergeStructuredQuery(structuredQuery);
            return this;
        }

        public Builder setNewTransaction(TransactionOptions.Builder builder) {
            this.copyOnWrite();
            ((RunQueryRequest)this.instance).setNewTransaction(builder);
            return this;
        }

        public Builder setNewTransaction(TransactionOptions transactionOptions) {
            this.copyOnWrite();
            ((RunQueryRequest)this.instance).setNewTransaction(transactionOptions);
            return this;
        }

        public Builder setParent(String string) {
            this.copyOnWrite();
            ((RunQueryRequest)this.instance).setParent(string);
            return this;
        }

        public Builder setParentBytes(ByteString byteString) {
            this.copyOnWrite();
            ((RunQueryRequest)this.instance).setParentBytes(byteString);
            return this;
        }

        public Builder setReadTime(Timestamp.Builder builder) {
            this.copyOnWrite();
            ((RunQueryRequest)this.instance).setReadTime(builder);
            return this;
        }

        public Builder setReadTime(Timestamp timestamp) {
            this.copyOnWrite();
            ((RunQueryRequest)this.instance).setReadTime(timestamp);
            return this;
        }

        public Builder setStructuredQuery(StructuredQuery.Builder builder) {
            this.copyOnWrite();
            ((RunQueryRequest)this.instance).setStructuredQuery(builder);
            return this;
        }

        public Builder setStructuredQuery(StructuredQuery structuredQuery) {
            this.copyOnWrite();
            ((RunQueryRequest)this.instance).setStructuredQuery(structuredQuery);
            return this;
        }

        public Builder setTransaction(ByteString byteString) {
            this.copyOnWrite();
            ((RunQueryRequest)this.instance).setTransaction(byteString);
            return this;
        }
    }

}

