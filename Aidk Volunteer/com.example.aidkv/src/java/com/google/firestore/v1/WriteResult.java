/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.firestore.v1.ValueOrBuilder
 *  com.google.firestore.v1.WriteResult$1
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

import com.google.firestore.v1.Value;
import com.google.firestore.v1.ValueOrBuilder;
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

public final class WriteResult
extends GeneratedMessageLite<WriteResult, Builder>
implements WriteResultOrBuilder {
    private static final WriteResult DEFAULT_INSTANCE = new WriteResult();
    private static volatile Parser<WriteResult> PARSER;
    public static final int TRANSFORM_RESULTS_FIELD_NUMBER = 2;
    public static final int UPDATE_TIME_FIELD_NUMBER = 1;
    private int bitField0_;
    private Internal.ProtobufList<Value> transformResults_ = WriteResult.emptyProtobufList();
    private Timestamp updateTime_;

    static {
        DEFAULT_INSTANCE.makeImmutable();
    }

    private WriteResult() {
    }

    private void addAllTransformResults(Iterable<? extends Value> iterable) {
        this.ensureTransformResultsIsMutable();
        AbstractMessageLite.addAll(iterable, this.transformResults_);
    }

    private void addTransformResults(int n, Value.Builder builder) {
        this.ensureTransformResultsIsMutable();
        this.transformResults_.add(n, (Object)((Value)builder.build()));
    }

    private void addTransformResults(int n, Value value) {
        if (value != null) {
            this.ensureTransformResultsIsMutable();
            this.transformResults_.add(n, (Object)value);
            return;
        }
        throw new NullPointerException();
    }

    private void addTransformResults(Value.Builder builder) {
        this.ensureTransformResultsIsMutable();
        this.transformResults_.add((Object)((Value)builder.build()));
    }

    private void addTransformResults(Value value) {
        if (value != null) {
            this.ensureTransformResultsIsMutable();
            this.transformResults_.add((Object)value);
            return;
        }
        throw new NullPointerException();
    }

    private void clearTransformResults() {
        this.transformResults_ = WriteResult.emptyProtobufList();
    }

    private void clearUpdateTime() {
        this.updateTime_ = null;
    }

    private void ensureTransformResultsIsMutable() {
        if (!this.transformResults_.isModifiable()) {
            this.transformResults_ = GeneratedMessageLite.mutableCopy(this.transformResults_);
        }
    }

    public static WriteResult getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeUpdateTime(Timestamp timestamp) {
        Timestamp timestamp2 = this.updateTime_;
        if (timestamp2 != null && timestamp2 != Timestamp.getDefaultInstance()) {
            this.updateTime_ = (Timestamp)((Timestamp.Builder)Timestamp.newBuilder((Timestamp)this.updateTime_).mergeFrom((GeneratedMessageLite)timestamp)).buildPartial();
            return;
        }
        this.updateTime_ = timestamp;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(WriteResult writeResult) {
        return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)writeResult);
    }

    public static WriteResult parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (WriteResult)WriteResult.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static WriteResult parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WriteResult)WriteResult.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static WriteResult parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (WriteResult)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static WriteResult parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WriteResult)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static WriteResult parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (WriteResult)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static WriteResult parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WriteResult)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static WriteResult parseFrom(InputStream inputStream) throws IOException {
        return (WriteResult)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static WriteResult parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WriteResult)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static WriteResult parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (WriteResult)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static WriteResult parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WriteResult)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<WriteResult> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeTransformResults(int n) {
        this.ensureTransformResultsIsMutable();
        this.transformResults_.remove(n);
    }

    private void setTransformResults(int n, Value.Builder builder) {
        this.ensureTransformResultsIsMutable();
        this.transformResults_.set(n, (Object)((Value)builder.build()));
    }

    private void setTransformResults(int n, Value value) {
        if (value != null) {
            this.ensureTransformResultsIsMutable();
            this.transformResults_.set(n, (Object)value);
            return;
        }
        throw new NullPointerException();
    }

    private void setUpdateTime(Timestamp.Builder builder) {
        this.updateTime_ = (Timestamp)builder.build();
    }

    private void setUpdateTime(Timestamp timestamp) {
        if (timestamp != null) {
            this.updateTime_ = timestamp;
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
                Class<WriteResult> class_ = WriteResult.class;
                // MONITORENTER : com.google.firestore.v1.WriteResult.class
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
                                if (codedInputStream.skipField(n)) continue;
                                bl = true;
                                continue;
                            }
                            if (!this.transformResults_.isModifiable()) {
                                this.transformResults_ = GeneratedMessageLite.mutableCopy(this.transformResults_);
                            }
                            this.transformResults_.add((Object)((Value)codedInputStream.readMessage(Value.parser(), extensionRegistryLite)));
                            continue;
                        }
                        Timestamp timestamp = this.updateTime_;
                        Timestamp.Builder builder = null;
                        if (timestamp != null) {
                            builder = (Timestamp.Builder)this.updateTime_.toBuilder();
                        }
                        this.updateTime_ = (Timestamp)codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                        if (builder == null) continue;
                        builder.mergeFrom((GeneratedMessageLite)this.updateTime_);
                        this.updateTime_ = (Timestamp)builder.buildPartial();
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
                WriteResult writeResult = (WriteResult)((Object)object2);
                this.updateTime_ = (Timestamp)visitor.visitMessage((MessageLite)this.updateTime_, (MessageLite)writeResult.updateTime_);
                this.transformResults_ = visitor.visitList(this.transformResults_, writeResult.transformResults_);
                if (visitor != GeneratedMessageLite.MergeFromVisitor.INSTANCE) return this;
                this.bitField0_ |= writeResult.bitField0_;
                return this;
            }
            case 4: {
                return new Builder();
            }
            case 3: {
                this.transformResults_.makeImmutable();
                return null;
            }
            case 2: {
                return DEFAULT_INSTANCE;
            }
            case 1: 
        }
        return new WriteResult();
    }

    public int getSerializedSize() {
        int n = this.memoizedSerializedSize;
        if (n != -1) {
            return n;
        }
        Timestamp timestamp = this.updateTime_;
        int n2 = 0;
        if (timestamp != null) {
            n2 = 0 + CodedOutputStream.computeMessageSize((int)1, (MessageLite)this.getUpdateTime());
        }
        for (int i = 0; i < this.transformResults_.size(); ++i) {
            n2 += CodedOutputStream.computeMessageSize((int)2, (MessageLite)((MessageLite)this.transformResults_.get(i)));
        }
        this.memoizedSerializedSize = n2;
        return n2;
    }

    public Value getTransformResults(int n) {
        return (Value)((Object)this.transformResults_.get(n));
    }

    public int getTransformResultsCount() {
        return this.transformResults_.size();
    }

    public List<Value> getTransformResultsList() {
        return this.transformResults_;
    }

    public ValueOrBuilder getTransformResultsOrBuilder(int n) {
        return (ValueOrBuilder)this.transformResults_.get(n);
    }

    public List<? extends ValueOrBuilder> getTransformResultsOrBuilderList() {
        return this.transformResults_;
    }

    public Timestamp getUpdateTime() {
        Timestamp timestamp = this.updateTime_;
        if (timestamp == null) {
            timestamp = Timestamp.getDefaultInstance();
        }
        return timestamp;
    }

    public boolean hasUpdateTime() {
        return this.updateTime_ != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.updateTime_ != null) {
            codedOutputStream.writeMessage(1, (MessageLite)this.getUpdateTime());
        }
        for (int i = 0; i < this.transformResults_.size(); ++i) {
            codedOutputStream.writeMessage(2, (MessageLite)this.transformResults_.get(i));
        }
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<WriteResult, Builder>
    implements WriteResultOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder addAllTransformResults(Iterable<? extends Value> iterable) {
            this.copyOnWrite();
            ((WriteResult)this.instance).addAllTransformResults((Iterable<? extends Value>)iterable);
            return this;
        }

        public Builder addTransformResults(int n, Value.Builder builder) {
            this.copyOnWrite();
            ((WriteResult)this.instance).addTransformResults(n, builder);
            return this;
        }

        public Builder addTransformResults(int n, Value value) {
            this.copyOnWrite();
            ((WriteResult)this.instance).addTransformResults(n, value);
            return this;
        }

        public Builder addTransformResults(Value.Builder builder) {
            this.copyOnWrite();
            ((WriteResult)this.instance).addTransformResults(builder);
            return this;
        }

        public Builder addTransformResults(Value value) {
            this.copyOnWrite();
            ((WriteResult)this.instance).addTransformResults(value);
            return this;
        }

        public Builder clearTransformResults() {
            this.copyOnWrite();
            ((WriteResult)this.instance).clearTransformResults();
            return this;
        }

        public Builder clearUpdateTime() {
            this.copyOnWrite();
            ((WriteResult)this.instance).clearUpdateTime();
            return this;
        }

        public Value getTransformResults(int n) {
            return ((WriteResult)this.instance).getTransformResults(n);
        }

        public int getTransformResultsCount() {
            return ((WriteResult)this.instance).getTransformResultsCount();
        }

        public List<Value> getTransformResultsList() {
            return Collections.unmodifiableList(((WriteResult)this.instance).getTransformResultsList());
        }

        public Timestamp getUpdateTime() {
            return ((WriteResult)this.instance).getUpdateTime();
        }

        public boolean hasUpdateTime() {
            return ((WriteResult)this.instance).hasUpdateTime();
        }

        public Builder mergeUpdateTime(Timestamp timestamp) {
            this.copyOnWrite();
            ((WriteResult)this.instance).mergeUpdateTime(timestamp);
            return this;
        }

        public Builder removeTransformResults(int n) {
            this.copyOnWrite();
            ((WriteResult)this.instance).removeTransformResults(n);
            return this;
        }

        public Builder setTransformResults(int n, Value.Builder builder) {
            this.copyOnWrite();
            ((WriteResult)this.instance).setTransformResults(n, builder);
            return this;
        }

        public Builder setTransformResults(int n, Value value) {
            this.copyOnWrite();
            ((WriteResult)this.instance).setTransformResults(n, value);
            return this;
        }

        public Builder setUpdateTime(Timestamp.Builder builder) {
            this.copyOnWrite();
            ((WriteResult)this.instance).setUpdateTime(builder);
            return this;
        }

        public Builder setUpdateTime(Timestamp timestamp) {
            this.copyOnWrite();
            ((WriteResult)this.instance).setUpdateTime(timestamp);
            return this;
        }
    }

}

