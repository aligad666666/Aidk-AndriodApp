/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.firestore.v1.TargetChange$1
 *  com.google.firestore.v1.TargetChange$TargetChangeType
 *  com.google.firestore.v1.TargetChangeOrBuilder
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
 *  com.google.protobuf.Internal$IntList
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.Parser
 *  com.google.protobuf.Timestamp
 *  com.google.protobuf.Timestamp$Builder
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.Class
 *  java.lang.Integer
 *  java.lang.Iterable
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.UnsupportedOperationException
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.List
 */
package com.google.firestore.v1;

import com.google.firestore.v1.TargetChange;
import com.google.firestore.v1.TargetChangeOrBuilder;
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
import com.google.rpc.Status;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/*
 * Exception performing whole class analysis ignored.
 */
public final class TargetChange
extends GeneratedMessageLite<TargetChange, Builder>
implements TargetChangeOrBuilder {
    public static final int CAUSE_FIELD_NUMBER = 3;
    private static final TargetChange DEFAULT_INSTANCE = new TargetChange();
    private static volatile Parser<TargetChange> PARSER;
    public static final int READ_TIME_FIELD_NUMBER = 6;
    public static final int RESUME_TOKEN_FIELD_NUMBER = 4;
    public static final int TARGET_CHANGE_TYPE_FIELD_NUMBER = 1;
    public static final int TARGET_IDS_FIELD_NUMBER = 2;
    private int bitField0_;
    private Status cause_;
    private Timestamp readTime_;
    private ByteString resumeToken_ = ByteString.EMPTY;
    private int targetChangeType_;
    private Internal.IntList targetIds_ = TargetChange.emptyIntList();

    static {
        DEFAULT_INSTANCE.makeImmutable();
    }

    private TargetChange() {
    }

    private void addAllTargetIds(Iterable<? extends Integer> iterable) {
        this.ensureTargetIdsIsMutable();
        AbstractMessageLite.addAll(iterable, (Collection)this.targetIds_);
    }

    private void addTargetIds(int n) {
        this.ensureTargetIdsIsMutable();
        this.targetIds_.addInt(n);
    }

    private void clearCause() {
        this.cause_ = null;
    }

    private void clearReadTime() {
        this.readTime_ = null;
    }

    private void clearResumeToken() {
        this.resumeToken_ = TargetChange.getDefaultInstance().getResumeToken();
    }

    private void clearTargetChangeType() {
        this.targetChangeType_ = 0;
    }

    private void clearTargetIds() {
        this.targetIds_ = TargetChange.emptyIntList();
    }

    private void ensureTargetIdsIsMutable() {
        if (!this.targetIds_.isModifiable()) {
            this.targetIds_ = GeneratedMessageLite.mutableCopy((Internal.IntList)this.targetIds_);
        }
    }

    public static TargetChange getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeCause(Status status) {
        Status status2 = this.cause_;
        if (status2 != null && status2 != Status.getDefaultInstance()) {
            this.cause_ = (Status)((Status.Builder)Status.newBuilder(this.cause_).mergeFrom((GeneratedMessageLite)status)).buildPartial();
            return;
        }
        this.cause_ = status;
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

    public static Builder newBuilder(TargetChange targetChange) {
        return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)targetChange);
    }

    public static TargetChange parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (TargetChange)TargetChange.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static TargetChange parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TargetChange)TargetChange.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static TargetChange parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (TargetChange)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static TargetChange parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TargetChange)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static TargetChange parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (TargetChange)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static TargetChange parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TargetChange)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static TargetChange parseFrom(InputStream inputStream) throws IOException {
        return (TargetChange)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static TargetChange parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TargetChange)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static TargetChange parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (TargetChange)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static TargetChange parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TargetChange)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<TargetChange> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setCause(Status.Builder builder) {
        this.cause_ = (Status)builder.build();
    }

    private void setCause(Status status) {
        if (status != null) {
            this.cause_ = status;
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

    private void setResumeToken(ByteString byteString) {
        if (byteString != null) {
            this.resumeToken_ = byteString;
            return;
        }
        throw new NullPointerException();
    }

    private void setTargetChangeType(TargetChangeType targetChangeType) {
        if (targetChangeType != null) {
            this.targetChangeType_ = targetChangeType.getNumber();
            return;
        }
        throw new NullPointerException();
    }

    private void setTargetChangeTypeValue(int n) {
        this.targetChangeType_ = n;
    }

    private void setTargetIds(int n, int n2) {
        this.ensureTargetIdsIsMutable();
        this.targetIds_.setInt(n, n2);
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
                Class<TargetChange> class_ = TargetChange.class;
                // MONITORENTER : com.google.firestore.v1.TargetChange.class
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
                        if (n != 8) {
                            if (n != 16) {
                                if (n != 18) {
                                    if (n != 26) {
                                        if (n != 34) {
                                            if (n != 50) {
                                                if (codedInputStream.skipField(n)) continue;
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
                                        this.resumeToken_ = codedInputStream.readBytes();
                                        continue;
                                    }
                                    Status status = this.cause_;
                                    Status.Builder builder = null;
                                    if (status != null) {
                                        builder = (Status.Builder)this.cause_.toBuilder();
                                    }
                                    this.cause_ = (Status)codedInputStream.readMessage(Status.parser(), extensionRegistryLite);
                                    if (builder == null) continue;
                                    builder.mergeFrom((GeneratedMessageLite)this.cause_);
                                    this.cause_ = (Status)builder.buildPartial();
                                    continue;
                                }
                                int n2 = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                if (!this.targetIds_.isModifiable() && codedInputStream.getBytesUntilLimit() > 0) {
                                    this.targetIds_ = GeneratedMessageLite.mutableCopy((Internal.IntList)this.targetIds_);
                                }
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    this.targetIds_.addInt(codedInputStream.readInt32());
                                }
                                codedInputStream.popLimit(n2);
                                continue;
                            }
                            if (!this.targetIds_.isModifiable()) {
                                this.targetIds_ = GeneratedMessageLite.mutableCopy((Internal.IntList)this.targetIds_);
                            }
                            this.targetIds_.addInt(codedInputStream.readInt32());
                            continue;
                        }
                        this.targetChangeType_ = codedInputStream.readEnum();
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
                TargetChange targetChange = (TargetChange)((Object)object2);
                int n = this.targetChangeType_;
                boolean bl = true;
                boolean bl2 = n != 0;
                int n3 = this.targetChangeType_;
                boolean bl3 = targetChange.targetChangeType_ != 0;
                this.targetChangeType_ = visitor.visitInt(bl2, n3, bl3, targetChange.targetChangeType_);
                this.targetIds_ = visitor.visitIntList(this.targetIds_, targetChange.targetIds_);
                this.cause_ = (Status)visitor.visitMessage((MessageLite)this.cause_, (MessageLite)targetChange.cause_);
                boolean bl4 = this.resumeToken_ != ByteString.EMPTY;
                ByteString byteString = this.resumeToken_;
                if (targetChange.resumeToken_ == ByteString.EMPTY) {
                    bl = false;
                }
                this.resumeToken_ = visitor.visitByteString(bl4, byteString, bl, targetChange.resumeToken_);
                this.readTime_ = (Timestamp)visitor.visitMessage((MessageLite)this.readTime_, (MessageLite)targetChange.readTime_);
                if (visitor != GeneratedMessageLite.MergeFromVisitor.INSTANCE) return this;
                this.bitField0_ |= targetChange.bitField0_;
                return this;
            }
            case 4: {
                return new Builder();
            }
            case 3: {
                this.targetIds_.makeImmutable();
                return null;
            }
            case 2: {
                return DEFAULT_INSTANCE;
            }
            case 1: 
        }
        return new TargetChange();
    }

    public Status getCause() {
        Status status = this.cause_;
        if (status == null) {
            status = Status.getDefaultInstance();
        }
        return status;
    }

    public Timestamp getReadTime() {
        Timestamp timestamp = this.readTime_;
        if (timestamp == null) {
            timestamp = Timestamp.getDefaultInstance();
        }
        return timestamp;
    }

    public ByteString getResumeToken() {
        return this.resumeToken_;
    }

    public int getSerializedSize() {
        int n = this.memoizedSerializedSize;
        if (n != -1) {
            return n;
        }
        int n2 = this.targetChangeType_;
        int n3 = TargetChangeType.NO_CHANGE.getNumber();
        int n4 = 0;
        if (n2 != n3) {
            n4 = 0 + CodedOutputStream.computeEnumSize((int)1, (int)this.targetChangeType_);
        }
        int n5 = 0;
        for (int i = 0; i < this.targetIds_.size(); ++i) {
            n5 += CodedOutputStream.computeInt32SizeNoTag((int)this.targetIds_.getInt(i));
        }
        int n6 = n4 + n5 + 1 * this.getTargetIdsList().size();
        if (this.cause_ != null) {
            n6 += CodedOutputStream.computeMessageSize((int)3, (MessageLite)this.getCause());
        }
        if (!this.resumeToken_.isEmpty()) {
            n6 += CodedOutputStream.computeBytesSize((int)4, (ByteString)this.resumeToken_);
        }
        if (this.readTime_ != null) {
            n6 += CodedOutputStream.computeMessageSize((int)6, (MessageLite)this.getReadTime());
        }
        this.memoizedSerializedSize = n6;
        return n6;
    }

    public TargetChangeType getTargetChangeType() {
        TargetChangeType targetChangeType = TargetChangeType.forNumber((int)this.targetChangeType_);
        if (targetChangeType == null) {
            return TargetChangeType.UNRECOGNIZED;
        }
        return targetChangeType;
    }

    public int getTargetChangeTypeValue() {
        return this.targetChangeType_;
    }

    public int getTargetIds(int n) {
        return this.targetIds_.getInt(n);
    }

    public int getTargetIdsCount() {
        return this.targetIds_.size();
    }

    public List<Integer> getTargetIdsList() {
        return this.targetIds_;
    }

    public boolean hasCause() {
        return this.cause_ != null;
    }

    public boolean hasReadTime() {
        return this.readTime_ != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        this.getSerializedSize();
        if (this.targetChangeType_ != TargetChangeType.NO_CHANGE.getNumber()) {
            codedOutputStream.writeEnum(1, this.targetChangeType_);
        }
        for (int i = 0; i < this.targetIds_.size(); ++i) {
            codedOutputStream.writeInt32(2, this.targetIds_.getInt(i));
        }
        if (this.cause_ != null) {
            codedOutputStream.writeMessage(3, (MessageLite)this.getCause());
        }
        if (!this.resumeToken_.isEmpty()) {
            codedOutputStream.writeBytes(4, this.resumeToken_);
        }
        if (this.readTime_ != null) {
            codedOutputStream.writeMessage(6, (MessageLite)this.getReadTime());
        }
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<TargetChange, Builder>
    implements TargetChangeOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder addAllTargetIds(Iterable<? extends Integer> iterable) {
            this.copyOnWrite();
            ((TargetChange)this.instance).addAllTargetIds((Iterable<? extends Integer>)iterable);
            return this;
        }

        public Builder addTargetIds(int n) {
            this.copyOnWrite();
            ((TargetChange)this.instance).addTargetIds(n);
            return this;
        }

        public Builder clearCause() {
            this.copyOnWrite();
            ((TargetChange)this.instance).clearCause();
            return this;
        }

        public Builder clearReadTime() {
            this.copyOnWrite();
            ((TargetChange)this.instance).clearReadTime();
            return this;
        }

        public Builder clearResumeToken() {
            this.copyOnWrite();
            ((TargetChange)this.instance).clearResumeToken();
            return this;
        }

        public Builder clearTargetChangeType() {
            this.copyOnWrite();
            ((TargetChange)this.instance).clearTargetChangeType();
            return this;
        }

        public Builder clearTargetIds() {
            this.copyOnWrite();
            ((TargetChange)this.instance).clearTargetIds();
            return this;
        }

        public Status getCause() {
            return ((TargetChange)this.instance).getCause();
        }

        public Timestamp getReadTime() {
            return ((TargetChange)this.instance).getReadTime();
        }

        public ByteString getResumeToken() {
            return ((TargetChange)this.instance).getResumeToken();
        }

        public TargetChangeType getTargetChangeType() {
            return ((TargetChange)this.instance).getTargetChangeType();
        }

        public int getTargetChangeTypeValue() {
            return ((TargetChange)this.instance).getTargetChangeTypeValue();
        }

        public int getTargetIds(int n) {
            return ((TargetChange)this.instance).getTargetIds(n);
        }

        public int getTargetIdsCount() {
            return ((TargetChange)this.instance).getTargetIdsCount();
        }

        public List<Integer> getTargetIdsList() {
            return Collections.unmodifiableList(((TargetChange)this.instance).getTargetIdsList());
        }

        public boolean hasCause() {
            return ((TargetChange)this.instance).hasCause();
        }

        public boolean hasReadTime() {
            return ((TargetChange)this.instance).hasReadTime();
        }

        public Builder mergeCause(Status status) {
            this.copyOnWrite();
            ((TargetChange)this.instance).mergeCause(status);
            return this;
        }

        public Builder mergeReadTime(Timestamp timestamp) {
            this.copyOnWrite();
            ((TargetChange)this.instance).mergeReadTime(timestamp);
            return this;
        }

        public Builder setCause(Status.Builder builder) {
            this.copyOnWrite();
            ((TargetChange)this.instance).setCause(builder);
            return this;
        }

        public Builder setCause(Status status) {
            this.copyOnWrite();
            ((TargetChange)this.instance).setCause(status);
            return this;
        }

        public Builder setReadTime(Timestamp.Builder builder) {
            this.copyOnWrite();
            ((TargetChange)this.instance).setReadTime(builder);
            return this;
        }

        public Builder setReadTime(Timestamp timestamp) {
            this.copyOnWrite();
            ((TargetChange)this.instance).setReadTime(timestamp);
            return this;
        }

        public Builder setResumeToken(ByteString byteString) {
            this.copyOnWrite();
            ((TargetChange)this.instance).setResumeToken(byteString);
            return this;
        }

        public Builder setTargetChangeType(TargetChangeType targetChangeType) {
            this.copyOnWrite();
            ((TargetChange)this.instance).setTargetChangeType(targetChangeType);
            return this;
        }

        public Builder setTargetChangeTypeValue(int n) {
            this.copyOnWrite();
            ((TargetChange)this.instance).setTargetChangeTypeValue(n);
            return this;
        }

        public Builder setTargetIds(int n, int n2) {
            this.copyOnWrite();
            ((TargetChange)this.instance).setTargetIds(n, n2);
            return this;
        }
    }

}

