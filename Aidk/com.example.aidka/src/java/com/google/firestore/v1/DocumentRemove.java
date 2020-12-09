/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.firestore.v1.DocumentRemove$1
 *  com.google.firestore.v1.DocumentRemoveOrBuilder
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

import com.google.firestore.v1.DocumentRemove;
import com.google.firestore.v1.DocumentRemoveOrBuilder;
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
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public final class DocumentRemove
extends GeneratedMessageLite<DocumentRemove, Builder>
implements DocumentRemoveOrBuilder {
    private static final DocumentRemove DEFAULT_INSTANCE = new DocumentRemove();
    public static final int DOCUMENT_FIELD_NUMBER = 1;
    private static volatile Parser<DocumentRemove> PARSER;
    public static final int READ_TIME_FIELD_NUMBER = 4;
    public static final int REMOVED_TARGET_IDS_FIELD_NUMBER = 2;
    private int bitField0_;
    private String document_ = "";
    private Timestamp readTime_;
    private Internal.IntList removedTargetIds_ = DocumentRemove.emptyIntList();

    static {
        DEFAULT_INSTANCE.makeImmutable();
    }

    private DocumentRemove() {
    }

    private void addAllRemovedTargetIds(Iterable<? extends Integer> iterable) {
        this.ensureRemovedTargetIdsIsMutable();
        AbstractMessageLite.addAll(iterable, (Collection)this.removedTargetIds_);
    }

    private void addRemovedTargetIds(int n) {
        this.ensureRemovedTargetIdsIsMutable();
        this.removedTargetIds_.addInt(n);
    }

    private void clearDocument() {
        this.document_ = DocumentRemove.getDefaultInstance().getDocument();
    }

    private void clearReadTime() {
        this.readTime_ = null;
    }

    private void clearRemovedTargetIds() {
        this.removedTargetIds_ = DocumentRemove.emptyIntList();
    }

    private void ensureRemovedTargetIdsIsMutable() {
        if (!this.removedTargetIds_.isModifiable()) {
            this.removedTargetIds_ = GeneratedMessageLite.mutableCopy((Internal.IntList)this.removedTargetIds_);
        }
    }

    public static DocumentRemove getDefaultInstance() {
        return DEFAULT_INSTANCE;
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

    public static Builder newBuilder(DocumentRemove documentRemove) {
        return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)documentRemove);
    }

    public static DocumentRemove parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DocumentRemove)DocumentRemove.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static DocumentRemove parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DocumentRemove)DocumentRemove.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static DocumentRemove parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DocumentRemove)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static DocumentRemove parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DocumentRemove)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static DocumentRemove parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DocumentRemove)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static DocumentRemove parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DocumentRemove)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static DocumentRemove parseFrom(InputStream inputStream) throws IOException {
        return (DocumentRemove)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static DocumentRemove parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DocumentRemove)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static DocumentRemove parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (DocumentRemove)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static DocumentRemove parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DocumentRemove)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<DocumentRemove> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setDocument(String string) {
        if (string != null) {
            this.document_ = string;
            return;
        }
        throw new NullPointerException();
    }

    private void setDocumentBytes(ByteString byteString) {
        if (byteString != null) {
            DocumentRemove.checkByteStringIsUtf8((ByteString)byteString);
            this.document_ = byteString.toStringUtf8();
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

    private void setRemovedTargetIds(int n, int n2) {
        this.ensureRemovedTargetIdsIsMutable();
        this.removedTargetIds_.setInt(n, n2);
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
                Class<DocumentRemove> class_ = DocumentRemove.class;
                // MONITORENTER : com.google.firestore.v1.DocumentRemove.class
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
                            if (n != 16) {
                                if (n != 18) {
                                    if (n != 34) {
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
                                int n2 = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                if (!this.removedTargetIds_.isModifiable() && codedInputStream.getBytesUntilLimit() > 0) {
                                    this.removedTargetIds_ = GeneratedMessageLite.mutableCopy((Internal.IntList)this.removedTargetIds_);
                                }
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    this.removedTargetIds_.addInt(codedInputStream.readInt32());
                                }
                                codedInputStream.popLimit(n2);
                                continue;
                            }
                            if (!this.removedTargetIds_.isModifiable()) {
                                this.removedTargetIds_ = GeneratedMessageLite.mutableCopy((Internal.IntList)this.removedTargetIds_);
                            }
                            this.removedTargetIds_.addInt(codedInputStream.readInt32());
                            continue;
                        }
                        this.document_ = codedInputStream.readStringRequireUtf8();
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
                DocumentRemove documentRemove = (DocumentRemove)((Object)object2);
                this.document_ = visitor.visitString(true ^ this.document_.isEmpty(), this.document_, true ^ documentRemove.document_.isEmpty(), documentRemove.document_);
                this.removedTargetIds_ = visitor.visitIntList(this.removedTargetIds_, documentRemove.removedTargetIds_);
                this.readTime_ = (Timestamp)visitor.visitMessage((MessageLite)this.readTime_, (MessageLite)documentRemove.readTime_);
                if (visitor != GeneratedMessageLite.MergeFromVisitor.INSTANCE) return this;
                this.bitField0_ |= documentRemove.bitField0_;
                return this;
            }
            case 4: {
                return new Builder();
            }
            case 3: {
                this.removedTargetIds_.makeImmutable();
                return null;
            }
            case 2: {
                return DEFAULT_INSTANCE;
            }
            case 1: 
        }
        return new DocumentRemove();
    }

    public String getDocument() {
        return this.document_;
    }

    public ByteString getDocumentBytes() {
        return ByteString.copyFromUtf8((String)this.document_);
    }

    public Timestamp getReadTime() {
        Timestamp timestamp = this.readTime_;
        if (timestamp == null) {
            timestamp = Timestamp.getDefaultInstance();
        }
        return timestamp;
    }

    public int getRemovedTargetIds(int n) {
        return this.removedTargetIds_.getInt(n);
    }

    public int getRemovedTargetIdsCount() {
        return this.removedTargetIds_.size();
    }

    public List<Integer> getRemovedTargetIdsList() {
        return this.removedTargetIds_;
    }

    public int getSerializedSize() {
        int n = this.memoizedSerializedSize;
        if (n != -1) {
            return n;
        }
        boolean bl = this.document_.isEmpty();
        int n2 = 0;
        if (!bl) {
            n2 = 0 + CodedOutputStream.computeStringSize((int)1, (String)this.getDocument());
        }
        int n3 = 0;
        for (int i = 0; i < this.removedTargetIds_.size(); ++i) {
            n3 += CodedOutputStream.computeInt32SizeNoTag((int)this.removedTargetIds_.getInt(i));
        }
        int n4 = n2 + n3 + 1 * this.getRemovedTargetIdsList().size();
        if (this.readTime_ != null) {
            n4 += CodedOutputStream.computeMessageSize((int)4, (MessageLite)this.getReadTime());
        }
        this.memoizedSerializedSize = n4;
        return n4;
    }

    public boolean hasReadTime() {
        return this.readTime_ != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        this.getSerializedSize();
        if (!this.document_.isEmpty()) {
            codedOutputStream.writeString(1, this.getDocument());
        }
        for (int i = 0; i < this.removedTargetIds_.size(); ++i) {
            codedOutputStream.writeInt32(2, this.removedTargetIds_.getInt(i));
        }
        if (this.readTime_ != null) {
            codedOutputStream.writeMessage(4, (MessageLite)this.getReadTime());
        }
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<DocumentRemove, Builder>
    implements DocumentRemoveOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder addAllRemovedTargetIds(Iterable<? extends Integer> iterable) {
            this.copyOnWrite();
            ((DocumentRemove)this.instance).addAllRemovedTargetIds((Iterable<? extends Integer>)iterable);
            return this;
        }

        public Builder addRemovedTargetIds(int n) {
            this.copyOnWrite();
            ((DocumentRemove)this.instance).addRemovedTargetIds(n);
            return this;
        }

        public Builder clearDocument() {
            this.copyOnWrite();
            ((DocumentRemove)this.instance).clearDocument();
            return this;
        }

        public Builder clearReadTime() {
            this.copyOnWrite();
            ((DocumentRemove)this.instance).clearReadTime();
            return this;
        }

        public Builder clearRemovedTargetIds() {
            this.copyOnWrite();
            ((DocumentRemove)this.instance).clearRemovedTargetIds();
            return this;
        }

        public String getDocument() {
            return ((DocumentRemove)this.instance).getDocument();
        }

        public ByteString getDocumentBytes() {
            return ((DocumentRemove)this.instance).getDocumentBytes();
        }

        public Timestamp getReadTime() {
            return ((DocumentRemove)this.instance).getReadTime();
        }

        public int getRemovedTargetIds(int n) {
            return ((DocumentRemove)this.instance).getRemovedTargetIds(n);
        }

        public int getRemovedTargetIdsCount() {
            return ((DocumentRemove)this.instance).getRemovedTargetIdsCount();
        }

        public List<Integer> getRemovedTargetIdsList() {
            return Collections.unmodifiableList(((DocumentRemove)this.instance).getRemovedTargetIdsList());
        }

        public boolean hasReadTime() {
            return ((DocumentRemove)this.instance).hasReadTime();
        }

        public Builder mergeReadTime(Timestamp timestamp) {
            this.copyOnWrite();
            ((DocumentRemove)this.instance).mergeReadTime(timestamp);
            return this;
        }

        public Builder setDocument(String string) {
            this.copyOnWrite();
            ((DocumentRemove)this.instance).setDocument(string);
            return this;
        }

        public Builder setDocumentBytes(ByteString byteString) {
            this.copyOnWrite();
            ((DocumentRemove)this.instance).setDocumentBytes(byteString);
            return this;
        }

        public Builder setReadTime(Timestamp.Builder builder) {
            this.copyOnWrite();
            ((DocumentRemove)this.instance).setReadTime(builder);
            return this;
        }

        public Builder setReadTime(Timestamp timestamp) {
            this.copyOnWrite();
            ((DocumentRemove)this.instance).setReadTime(timestamp);
            return this;
        }

        public Builder setRemovedTargetIds(int n, int n2) {
            this.copyOnWrite();
            ((DocumentRemove)this.instance).setRemovedTargetIds(n, n2);
            return this;
        }
    }

}

