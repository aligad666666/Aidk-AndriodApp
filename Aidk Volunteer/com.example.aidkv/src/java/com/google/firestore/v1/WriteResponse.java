/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.firestore.v1.WriteResponse$1
 *  com.google.firestore.v1.WriteResponseOrBuilder
 *  com.google.firestore.v1.WriteResultOrBuilder
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

import com.google.firestore.v1.WriteResponse;
import com.google.firestore.v1.WriteResponseOrBuilder;
import com.google.firestore.v1.WriteResult;
import com.google.firestore.v1.WriteResultOrBuilder;
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

public final class WriteResponse
extends GeneratedMessageLite<WriteResponse, Builder>
implements WriteResponseOrBuilder {
    public static final int COMMIT_TIME_FIELD_NUMBER = 4;
    private static final WriteResponse DEFAULT_INSTANCE = new WriteResponse();
    private static volatile Parser<WriteResponse> PARSER;
    public static final int STREAM_ID_FIELD_NUMBER = 1;
    public static final int STREAM_TOKEN_FIELD_NUMBER = 2;
    public static final int WRITE_RESULTS_FIELD_NUMBER = 3;
    private int bitField0_;
    private Timestamp commitTime_;
    private String streamId_ = "";
    private ByteString streamToken_ = ByteString.EMPTY;
    private Internal.ProtobufList<WriteResult> writeResults_ = WriteResponse.emptyProtobufList();

    static {
        DEFAULT_INSTANCE.makeImmutable();
    }

    private WriteResponse() {
    }

    private void addAllWriteResults(Iterable<? extends WriteResult> iterable) {
        this.ensureWriteResultsIsMutable();
        AbstractMessageLite.addAll(iterable, this.writeResults_);
    }

    private void addWriteResults(int n, WriteResult.Builder builder) {
        this.ensureWriteResultsIsMutable();
        this.writeResults_.add(n, (Object)((WriteResult)builder.build()));
    }

    private void addWriteResults(int n, WriteResult writeResult) {
        if (writeResult != null) {
            this.ensureWriteResultsIsMutable();
            this.writeResults_.add(n, (Object)writeResult);
            return;
        }
        throw new NullPointerException();
    }

    private void addWriteResults(WriteResult.Builder builder) {
        this.ensureWriteResultsIsMutable();
        this.writeResults_.add((Object)((WriteResult)builder.build()));
    }

    private void addWriteResults(WriteResult writeResult) {
        if (writeResult != null) {
            this.ensureWriteResultsIsMutable();
            this.writeResults_.add((Object)writeResult);
            return;
        }
        throw new NullPointerException();
    }

    private void clearCommitTime() {
        this.commitTime_ = null;
    }

    private void clearStreamId() {
        this.streamId_ = WriteResponse.getDefaultInstance().getStreamId();
    }

    private void clearStreamToken() {
        this.streamToken_ = WriteResponse.getDefaultInstance().getStreamToken();
    }

    private void clearWriteResults() {
        this.writeResults_ = WriteResponse.emptyProtobufList();
    }

    private void ensureWriteResultsIsMutable() {
        if (!this.writeResults_.isModifiable()) {
            this.writeResults_ = GeneratedMessageLite.mutableCopy(this.writeResults_);
        }
    }

    public static WriteResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeCommitTime(Timestamp timestamp) {
        Timestamp timestamp2 = this.commitTime_;
        if (timestamp2 != null && timestamp2 != Timestamp.getDefaultInstance()) {
            this.commitTime_ = (Timestamp)((Timestamp.Builder)Timestamp.newBuilder((Timestamp)this.commitTime_).mergeFrom((GeneratedMessageLite)timestamp)).buildPartial();
            return;
        }
        this.commitTime_ = timestamp;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(WriteResponse writeResponse) {
        return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)writeResponse);
    }

    public static WriteResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (WriteResponse)WriteResponse.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static WriteResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WriteResponse)WriteResponse.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static WriteResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (WriteResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static WriteResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WriteResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static WriteResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (WriteResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static WriteResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WriteResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static WriteResponse parseFrom(InputStream inputStream) throws IOException {
        return (WriteResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static WriteResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WriteResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static WriteResponse parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (WriteResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static WriteResponse parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WriteResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<WriteResponse> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeWriteResults(int n) {
        this.ensureWriteResultsIsMutable();
        this.writeResults_.remove(n);
    }

    private void setCommitTime(Timestamp.Builder builder) {
        this.commitTime_ = (Timestamp)builder.build();
    }

    private void setCommitTime(Timestamp timestamp) {
        if (timestamp != null) {
            this.commitTime_ = timestamp;
            return;
        }
        throw new NullPointerException();
    }

    private void setStreamId(String string) {
        if (string != null) {
            this.streamId_ = string;
            return;
        }
        throw new NullPointerException();
    }

    private void setStreamIdBytes(ByteString byteString) {
        if (byteString != null) {
            WriteResponse.checkByteStringIsUtf8((ByteString)byteString);
            this.streamId_ = byteString.toStringUtf8();
            return;
        }
        throw new NullPointerException();
    }

    private void setStreamToken(ByteString byteString) {
        if (byteString != null) {
            this.streamToken_ = byteString;
            return;
        }
        throw new NullPointerException();
    }

    private void setWriteResults(int n, WriteResult.Builder builder) {
        this.ensureWriteResultsIsMutable();
        this.writeResults_.set(n, (Object)((WriteResult)builder.build()));
    }

    private void setWriteResults(int n, WriteResult writeResult) {
        if (writeResult != null) {
            this.ensureWriteResultsIsMutable();
            this.writeResults_.set(n, (Object)writeResult);
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
                Class<WriteResponse> class_ = WriteResponse.class;
                // MONITORENTER : com.google.firestore.v1.WriteResponse.class
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
                                        if (codedInputStream.skipField(n)) continue;
                                        bl = true;
                                        continue;
                                    }
                                    Timestamp timestamp = this.commitTime_;
                                    Timestamp.Builder builder = null;
                                    if (timestamp != null) {
                                        builder = (Timestamp.Builder)this.commitTime_.toBuilder();
                                    }
                                    this.commitTime_ = (Timestamp)codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                    if (builder == null) continue;
                                    builder.mergeFrom((GeneratedMessageLite)this.commitTime_);
                                    this.commitTime_ = (Timestamp)builder.buildPartial();
                                    continue;
                                }
                                if (!this.writeResults_.isModifiable()) {
                                    this.writeResults_ = GeneratedMessageLite.mutableCopy(this.writeResults_);
                                }
                                this.writeResults_.add((Object)((WriteResult)codedInputStream.readMessage(WriteResult.parser(), extensionRegistryLite)));
                                continue;
                            }
                            this.streamToken_ = codedInputStream.readBytes();
                            continue;
                        }
                        this.streamId_ = codedInputStream.readStringRequireUtf8();
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
                WriteResponse writeResponse = (WriteResponse)((Object)object2);
                boolean bl = this.streamId_.isEmpty();
                boolean bl2 = true;
                this.streamId_ = visitor.visitString(bl ^ bl2, this.streamId_, bl2 ^ writeResponse.streamId_.isEmpty(), writeResponse.streamId_);
                boolean bl3 = this.streamToken_ != ByteString.EMPTY;
                ByteString byteString = this.streamToken_;
                if (writeResponse.streamToken_ == ByteString.EMPTY) {
                    bl2 = false;
                }
                this.streamToken_ = visitor.visitByteString(bl3, byteString, bl2, writeResponse.streamToken_);
                this.writeResults_ = visitor.visitList(this.writeResults_, writeResponse.writeResults_);
                this.commitTime_ = (Timestamp)visitor.visitMessage((MessageLite)this.commitTime_, (MessageLite)writeResponse.commitTime_);
                if (visitor != GeneratedMessageLite.MergeFromVisitor.INSTANCE) return this;
                this.bitField0_ |= writeResponse.bitField0_;
                return this;
            }
            case 4: {
                return new Builder();
            }
            case 3: {
                this.writeResults_.makeImmutable();
                return null;
            }
            case 2: {
                return DEFAULT_INSTANCE;
            }
            case 1: 
        }
        return new WriteResponse();
    }

    public Timestamp getCommitTime() {
        Timestamp timestamp = this.commitTime_;
        if (timestamp == null) {
            timestamp = Timestamp.getDefaultInstance();
        }
        return timestamp;
    }

    public int getSerializedSize() {
        int n = this.memoizedSerializedSize;
        if (n != -1) {
            return n;
        }
        boolean bl = this.streamId_.isEmpty();
        int n2 = 0;
        if (!bl) {
            n2 = 0 + CodedOutputStream.computeStringSize((int)1, (String)this.getStreamId());
        }
        if (!this.streamToken_.isEmpty()) {
            n2 += CodedOutputStream.computeBytesSize((int)2, (ByteString)this.streamToken_);
        }
        for (int i = 0; i < this.writeResults_.size(); ++i) {
            n2 += CodedOutputStream.computeMessageSize((int)3, (MessageLite)((MessageLite)this.writeResults_.get(i)));
        }
        if (this.commitTime_ != null) {
            n2 += CodedOutputStream.computeMessageSize((int)4, (MessageLite)this.getCommitTime());
        }
        this.memoizedSerializedSize = n2;
        return n2;
    }

    public String getStreamId() {
        return this.streamId_;
    }

    public ByteString getStreamIdBytes() {
        return ByteString.copyFromUtf8((String)this.streamId_);
    }

    public ByteString getStreamToken() {
        return this.streamToken_;
    }

    public WriteResult getWriteResults(int n) {
        return (WriteResult)((Object)this.writeResults_.get(n));
    }

    public int getWriteResultsCount() {
        return this.writeResults_.size();
    }

    public List<WriteResult> getWriteResultsList() {
        return this.writeResults_;
    }

    public WriteResultOrBuilder getWriteResultsOrBuilder(int n) {
        return (WriteResultOrBuilder)this.writeResults_.get(n);
    }

    public List<? extends WriteResultOrBuilder> getWriteResultsOrBuilderList() {
        return this.writeResults_;
    }

    public boolean hasCommitTime() {
        return this.commitTime_ != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.streamId_.isEmpty()) {
            codedOutputStream.writeString(1, this.getStreamId());
        }
        if (!this.streamToken_.isEmpty()) {
            codedOutputStream.writeBytes(2, this.streamToken_);
        }
        for (int i = 0; i < this.writeResults_.size(); ++i) {
            codedOutputStream.writeMessage(3, (MessageLite)this.writeResults_.get(i));
        }
        if (this.commitTime_ != null) {
            codedOutputStream.writeMessage(4, (MessageLite)this.getCommitTime());
        }
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<WriteResponse, Builder>
    implements WriteResponseOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder addAllWriteResults(Iterable<? extends WriteResult> iterable) {
            this.copyOnWrite();
            ((WriteResponse)this.instance).addAllWriteResults((Iterable<? extends WriteResult>)iterable);
            return this;
        }

        public Builder addWriteResults(int n, WriteResult.Builder builder) {
            this.copyOnWrite();
            ((WriteResponse)this.instance).addWriteResults(n, builder);
            return this;
        }

        public Builder addWriteResults(int n, WriteResult writeResult) {
            this.copyOnWrite();
            ((WriteResponse)this.instance).addWriteResults(n, writeResult);
            return this;
        }

        public Builder addWriteResults(WriteResult.Builder builder) {
            this.copyOnWrite();
            ((WriteResponse)this.instance).addWriteResults(builder);
            return this;
        }

        public Builder addWriteResults(WriteResult writeResult) {
            this.copyOnWrite();
            ((WriteResponse)this.instance).addWriteResults(writeResult);
            return this;
        }

        public Builder clearCommitTime() {
            this.copyOnWrite();
            ((WriteResponse)this.instance).clearCommitTime();
            return this;
        }

        public Builder clearStreamId() {
            this.copyOnWrite();
            ((WriteResponse)this.instance).clearStreamId();
            return this;
        }

        public Builder clearStreamToken() {
            this.copyOnWrite();
            ((WriteResponse)this.instance).clearStreamToken();
            return this;
        }

        public Builder clearWriteResults() {
            this.copyOnWrite();
            ((WriteResponse)this.instance).clearWriteResults();
            return this;
        }

        public Timestamp getCommitTime() {
            return ((WriteResponse)this.instance).getCommitTime();
        }

        public String getStreamId() {
            return ((WriteResponse)this.instance).getStreamId();
        }

        public ByteString getStreamIdBytes() {
            return ((WriteResponse)this.instance).getStreamIdBytes();
        }

        public ByteString getStreamToken() {
            return ((WriteResponse)this.instance).getStreamToken();
        }

        public WriteResult getWriteResults(int n) {
            return ((WriteResponse)this.instance).getWriteResults(n);
        }

        public int getWriteResultsCount() {
            return ((WriteResponse)this.instance).getWriteResultsCount();
        }

        public List<WriteResult> getWriteResultsList() {
            return Collections.unmodifiableList(((WriteResponse)this.instance).getWriteResultsList());
        }

        public boolean hasCommitTime() {
            return ((WriteResponse)this.instance).hasCommitTime();
        }

        public Builder mergeCommitTime(Timestamp timestamp) {
            this.copyOnWrite();
            ((WriteResponse)this.instance).mergeCommitTime(timestamp);
            return this;
        }

        public Builder removeWriteResults(int n) {
            this.copyOnWrite();
            ((WriteResponse)this.instance).removeWriteResults(n);
            return this;
        }

        public Builder setCommitTime(Timestamp.Builder builder) {
            this.copyOnWrite();
            ((WriteResponse)this.instance).setCommitTime(builder);
            return this;
        }

        public Builder setCommitTime(Timestamp timestamp) {
            this.copyOnWrite();
            ((WriteResponse)this.instance).setCommitTime(timestamp);
            return this;
        }

        public Builder setStreamId(String string) {
            this.copyOnWrite();
            ((WriteResponse)this.instance).setStreamId(string);
            return this;
        }

        public Builder setStreamIdBytes(ByteString byteString) {
            this.copyOnWrite();
            ((WriteResponse)this.instance).setStreamIdBytes(byteString);
            return this;
        }

        public Builder setStreamToken(ByteString byteString) {
            this.copyOnWrite();
            ((WriteResponse)this.instance).setStreamToken(byteString);
            return this;
        }

        public Builder setWriteResults(int n, WriteResult.Builder builder) {
            this.copyOnWrite();
            ((WriteResponse)this.instance).setWriteResults(n, builder);
            return this;
        }

        public Builder setWriteResults(int n, WriteResult writeResult) {
            this.copyOnWrite();
            ((WriteResponse)this.instance).setWriteResults(n, writeResult);
            return this;
        }
    }

}

