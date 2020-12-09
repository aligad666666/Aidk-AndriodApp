/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.firestore.v1.DocumentChange$1
 *  com.google.firestore.v1.DocumentChangeOrBuilder
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

import com.google.firestore.v1.Document;
import com.google.firestore.v1.DocumentChange;
import com.google.firestore.v1.DocumentChangeOrBuilder;
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
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public final class DocumentChange
extends GeneratedMessageLite<DocumentChange, Builder>
implements DocumentChangeOrBuilder {
    private static final DocumentChange DEFAULT_INSTANCE = new DocumentChange();
    public static final int DOCUMENT_FIELD_NUMBER = 1;
    private static volatile Parser<DocumentChange> PARSER;
    public static final int REMOVED_TARGET_IDS_FIELD_NUMBER = 6;
    public static final int TARGET_IDS_FIELD_NUMBER = 5;
    private int bitField0_;
    private Document document_;
    private Internal.IntList removedTargetIds_ = DocumentChange.emptyIntList();
    private Internal.IntList targetIds_ = DocumentChange.emptyIntList();

    static {
        DEFAULT_INSTANCE.makeImmutable();
    }

    private DocumentChange() {
    }

    private void addAllRemovedTargetIds(Iterable<? extends Integer> iterable) {
        this.ensureRemovedTargetIdsIsMutable();
        AbstractMessageLite.addAll(iterable, (Collection)this.removedTargetIds_);
    }

    private void addAllTargetIds(Iterable<? extends Integer> iterable) {
        this.ensureTargetIdsIsMutable();
        AbstractMessageLite.addAll(iterable, (Collection)this.targetIds_);
    }

    private void addRemovedTargetIds(int n) {
        this.ensureRemovedTargetIdsIsMutable();
        this.removedTargetIds_.addInt(n);
    }

    private void addTargetIds(int n) {
        this.ensureTargetIdsIsMutable();
        this.targetIds_.addInt(n);
    }

    private void clearDocument() {
        this.document_ = null;
    }

    private void clearRemovedTargetIds() {
        this.removedTargetIds_ = DocumentChange.emptyIntList();
    }

    private void clearTargetIds() {
        this.targetIds_ = DocumentChange.emptyIntList();
    }

    private void ensureRemovedTargetIdsIsMutable() {
        if (!this.removedTargetIds_.isModifiable()) {
            this.removedTargetIds_ = GeneratedMessageLite.mutableCopy((Internal.IntList)this.removedTargetIds_);
        }
    }

    private void ensureTargetIdsIsMutable() {
        if (!this.targetIds_.isModifiable()) {
            this.targetIds_ = GeneratedMessageLite.mutableCopy((Internal.IntList)this.targetIds_);
        }
    }

    public static DocumentChange getDefaultInstance() {
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

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(DocumentChange documentChange) {
        return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)documentChange);
    }

    public static DocumentChange parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DocumentChange)DocumentChange.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static DocumentChange parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DocumentChange)DocumentChange.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static DocumentChange parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DocumentChange)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static DocumentChange parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DocumentChange)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static DocumentChange parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DocumentChange)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static DocumentChange parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DocumentChange)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static DocumentChange parseFrom(InputStream inputStream) throws IOException {
        return (DocumentChange)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static DocumentChange parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DocumentChange)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static DocumentChange parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (DocumentChange)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static DocumentChange parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DocumentChange)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<DocumentChange> parser() {
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

    private void setRemovedTargetIds(int n, int n2) {
        this.ensureRemovedTargetIdsIsMutable();
        this.removedTargetIds_.setInt(n, n2);
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
                Class<DocumentChange> class_ = DocumentChange.class;
                // MONITORENTER : com.google.firestore.v1.DocumentChange.class
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
                            if (n != 40) {
                                if (n != 42) {
                                    if (n != 48) {
                                        if (n != 50) {
                                            if (codedInputStream.skipField(n)) continue;
                                            bl = true;
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
                                int n3 = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                if (!this.targetIds_.isModifiable() && codedInputStream.getBytesUntilLimit() > 0) {
                                    this.targetIds_ = GeneratedMessageLite.mutableCopy((Internal.IntList)this.targetIds_);
                                }
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    this.targetIds_.addInt(codedInputStream.readInt32());
                                }
                                codedInputStream.popLimit(n3);
                                continue;
                            }
                            if (!this.targetIds_.isModifiable()) {
                                this.targetIds_ = GeneratedMessageLite.mutableCopy((Internal.IntList)this.targetIds_);
                            }
                            this.targetIds_.addInt(codedInputStream.readInt32());
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
                DocumentChange documentChange = (DocumentChange)((Object)object2);
                this.document_ = (Document)visitor.visitMessage((MessageLite)this.document_, (MessageLite)documentChange.document_);
                this.targetIds_ = visitor.visitIntList(this.targetIds_, documentChange.targetIds_);
                this.removedTargetIds_ = visitor.visitIntList(this.removedTargetIds_, documentChange.removedTargetIds_);
                if (visitor != GeneratedMessageLite.MergeFromVisitor.INSTANCE) return this;
                this.bitField0_ |= documentChange.bitField0_;
                return this;
            }
            case 4: {
                return new Builder();
            }
            case 3: {
                this.targetIds_.makeImmutable();
                this.removedTargetIds_.makeImmutable();
                return null;
            }
            case 2: {
                return DEFAULT_INSTANCE;
            }
            case 1: 
        }
        return new DocumentChange();
    }

    public Document getDocument() {
        Document document = this.document_;
        if (document == null) {
            document = Document.getDefaultInstance();
        }
        return document;
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
        int n4 = 0;
        for (int i = 0; i < this.targetIds_.size(); ++i) {
            n4 += CodedOutputStream.computeInt32SizeNoTag((int)this.targetIds_.getInt(i));
        }
        int n5 = n3 + n4 + 1 * this.getTargetIdsList().size();
        int n6 = 0;
        for (int i = 0; i < this.removedTargetIds_.size(); ++i) {
            n6 += CodedOutputStream.computeInt32SizeNoTag((int)this.removedTargetIds_.getInt(i));
        }
        this.memoizedSerializedSize = n = n5 + n6 + 1 * this.getRemovedTargetIdsList().size();
        return n;
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

    public boolean hasDocument() {
        return this.document_ != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        this.getSerializedSize();
        if (this.document_ != null) {
            codedOutputStream.writeMessage(1, (MessageLite)this.getDocument());
        }
        for (int i = 0; i < this.targetIds_.size(); ++i) {
            codedOutputStream.writeInt32(5, this.targetIds_.getInt(i));
        }
        for (int i = 0; i < this.removedTargetIds_.size(); ++i) {
            codedOutputStream.writeInt32(6, this.removedTargetIds_.getInt(i));
        }
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<DocumentChange, Builder>
    implements DocumentChangeOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder addAllRemovedTargetIds(Iterable<? extends Integer> iterable) {
            this.copyOnWrite();
            ((DocumentChange)this.instance).addAllRemovedTargetIds((Iterable<? extends Integer>)iterable);
            return this;
        }

        public Builder addAllTargetIds(Iterable<? extends Integer> iterable) {
            this.copyOnWrite();
            ((DocumentChange)this.instance).addAllTargetIds((Iterable<? extends Integer>)iterable);
            return this;
        }

        public Builder addRemovedTargetIds(int n) {
            this.copyOnWrite();
            ((DocumentChange)this.instance).addRemovedTargetIds(n);
            return this;
        }

        public Builder addTargetIds(int n) {
            this.copyOnWrite();
            ((DocumentChange)this.instance).addTargetIds(n);
            return this;
        }

        public Builder clearDocument() {
            this.copyOnWrite();
            ((DocumentChange)this.instance).clearDocument();
            return this;
        }

        public Builder clearRemovedTargetIds() {
            this.copyOnWrite();
            ((DocumentChange)this.instance).clearRemovedTargetIds();
            return this;
        }

        public Builder clearTargetIds() {
            this.copyOnWrite();
            ((DocumentChange)this.instance).clearTargetIds();
            return this;
        }

        public Document getDocument() {
            return ((DocumentChange)this.instance).getDocument();
        }

        public int getRemovedTargetIds(int n) {
            return ((DocumentChange)this.instance).getRemovedTargetIds(n);
        }

        public int getRemovedTargetIdsCount() {
            return ((DocumentChange)this.instance).getRemovedTargetIdsCount();
        }

        public List<Integer> getRemovedTargetIdsList() {
            return Collections.unmodifiableList(((DocumentChange)this.instance).getRemovedTargetIdsList());
        }

        public int getTargetIds(int n) {
            return ((DocumentChange)this.instance).getTargetIds(n);
        }

        public int getTargetIdsCount() {
            return ((DocumentChange)this.instance).getTargetIdsCount();
        }

        public List<Integer> getTargetIdsList() {
            return Collections.unmodifiableList(((DocumentChange)this.instance).getTargetIdsList());
        }

        public boolean hasDocument() {
            return ((DocumentChange)this.instance).hasDocument();
        }

        public Builder mergeDocument(Document document) {
            this.copyOnWrite();
            ((DocumentChange)this.instance).mergeDocument(document);
            return this;
        }

        public Builder setDocument(Document.Builder builder) {
            this.copyOnWrite();
            ((DocumentChange)this.instance).setDocument(builder);
            return this;
        }

        public Builder setDocument(Document document) {
            this.copyOnWrite();
            ((DocumentChange)this.instance).setDocument(document);
            return this;
        }

        public Builder setRemovedTargetIds(int n, int n2) {
            this.copyOnWrite();
            ((DocumentChange)this.instance).setRemovedTargetIds(n, n2);
            return this;
        }

        public Builder setTargetIds(int n, int n2) {
            this.copyOnWrite();
            ((DocumentChange)this.instance).setTargetIds(n, n2);
            return this;
        }
    }

}

