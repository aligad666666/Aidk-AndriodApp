/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.firestore.v1.UpdateDocumentRequest$1
 *  com.google.firestore.v1.UpdateDocumentRequestOrBuilder
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
import com.google.firestore.v1.DocumentMask;
import com.google.firestore.v1.Precondition;
import com.google.firestore.v1.UpdateDocumentRequest;
import com.google.firestore.v1.UpdateDocumentRequestOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;

public final class UpdateDocumentRequest
extends GeneratedMessageLite<UpdateDocumentRequest, Builder>
implements UpdateDocumentRequestOrBuilder {
    public static final int CURRENT_DOCUMENT_FIELD_NUMBER = 4;
    private static final UpdateDocumentRequest DEFAULT_INSTANCE = new UpdateDocumentRequest();
    public static final int DOCUMENT_FIELD_NUMBER = 1;
    public static final int MASK_FIELD_NUMBER = 3;
    private static volatile Parser<UpdateDocumentRequest> PARSER;
    public static final int UPDATE_MASK_FIELD_NUMBER = 2;
    private Precondition currentDocument_;
    private Document document_;
    private DocumentMask mask_;
    private DocumentMask updateMask_;

    static {
        DEFAULT_INSTANCE.makeImmutable();
    }

    private UpdateDocumentRequest() {
    }

    private void clearCurrentDocument() {
        this.currentDocument_ = null;
    }

    private void clearDocument() {
        this.document_ = null;
    }

    private void clearMask() {
        this.mask_ = null;
    }

    private void clearUpdateMask() {
        this.updateMask_ = null;
    }

    public static UpdateDocumentRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeCurrentDocument(Precondition precondition) {
        Precondition precondition2 = this.currentDocument_;
        if (precondition2 != null && precondition2 != Precondition.getDefaultInstance()) {
            this.currentDocument_ = (Precondition)((Precondition.Builder)Precondition.newBuilder(this.currentDocument_).mergeFrom((GeneratedMessageLite)precondition)).buildPartial();
            return;
        }
        this.currentDocument_ = precondition;
    }

    private void mergeDocument(Document document) {
        Document document2 = this.document_;
        if (document2 != null && document2 != Document.getDefaultInstance()) {
            this.document_ = (Document)((Document.Builder)Document.newBuilder(this.document_).mergeFrom((GeneratedMessageLite)document)).buildPartial();
            return;
        }
        this.document_ = document;
    }

    private void mergeMask(DocumentMask documentMask) {
        DocumentMask documentMask2 = this.mask_;
        if (documentMask2 != null && documentMask2 != DocumentMask.getDefaultInstance()) {
            this.mask_ = (DocumentMask)((DocumentMask.Builder)DocumentMask.newBuilder(this.mask_).mergeFrom((GeneratedMessageLite)documentMask)).buildPartial();
            return;
        }
        this.mask_ = documentMask;
    }

    private void mergeUpdateMask(DocumentMask documentMask) {
        DocumentMask documentMask2 = this.updateMask_;
        if (documentMask2 != null && documentMask2 != DocumentMask.getDefaultInstance()) {
            this.updateMask_ = (DocumentMask)((DocumentMask.Builder)DocumentMask.newBuilder(this.updateMask_).mergeFrom((GeneratedMessageLite)documentMask)).buildPartial();
            return;
        }
        this.updateMask_ = documentMask;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(UpdateDocumentRequest updateDocumentRequest) {
        return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)updateDocumentRequest);
    }

    public static UpdateDocumentRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (UpdateDocumentRequest)UpdateDocumentRequest.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static UpdateDocumentRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UpdateDocumentRequest)UpdateDocumentRequest.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static UpdateDocumentRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (UpdateDocumentRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static UpdateDocumentRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UpdateDocumentRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static UpdateDocumentRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (UpdateDocumentRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static UpdateDocumentRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UpdateDocumentRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static UpdateDocumentRequest parseFrom(InputStream inputStream) throws IOException {
        return (UpdateDocumentRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static UpdateDocumentRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UpdateDocumentRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static UpdateDocumentRequest parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (UpdateDocumentRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static UpdateDocumentRequest parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UpdateDocumentRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<UpdateDocumentRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setCurrentDocument(Precondition.Builder builder) {
        this.currentDocument_ = (Precondition)builder.build();
    }

    private void setCurrentDocument(Precondition precondition) {
        if (precondition != null) {
            this.currentDocument_ = precondition;
            return;
        }
        throw new NullPointerException();
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

    private void setUpdateMask(DocumentMask.Builder builder) {
        this.updateMask_ = (DocumentMask)builder.build();
    }

    private void setUpdateMask(DocumentMask documentMask) {
        if (documentMask != null) {
            this.updateMask_ = documentMask;
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
                Class<UpdateDocumentRequest> class_ = UpdateDocumentRequest.class;
                // MONITORENTER : com.google.firestore.v1.UpdateDocumentRequest.class
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
                                    Precondition precondition = this.currentDocument_;
                                    Precondition.Builder builder = null;
                                    if (precondition != null) {
                                        builder = (Precondition.Builder)this.currentDocument_.toBuilder();
                                    }
                                    this.currentDocument_ = (Precondition)codedInputStream.readMessage(Precondition.parser(), extensionRegistryLite);
                                    if (builder == null) continue;
                                    builder.mergeFrom((GeneratedMessageLite)this.currentDocument_);
                                    this.currentDocument_ = (Precondition)builder.buildPartial();
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
                            DocumentMask documentMask = this.updateMask_;
                            DocumentMask.Builder builder = null;
                            if (documentMask != null) {
                                builder = (DocumentMask.Builder)this.updateMask_.toBuilder();
                            }
                            this.updateMask_ = (DocumentMask)codedInputStream.readMessage(DocumentMask.parser(), extensionRegistryLite);
                            if (builder == null) continue;
                            builder.mergeFrom((GeneratedMessageLite)this.updateMask_);
                            this.updateMask_ = (DocumentMask)builder.buildPartial();
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
                UpdateDocumentRequest updateDocumentRequest = (UpdateDocumentRequest)((Object)object2);
                this.document_ = (Document)visitor.visitMessage((MessageLite)this.document_, (MessageLite)updateDocumentRequest.document_);
                this.updateMask_ = (DocumentMask)visitor.visitMessage((MessageLite)this.updateMask_, (MessageLite)updateDocumentRequest.updateMask_);
                this.mask_ = (DocumentMask)visitor.visitMessage((MessageLite)this.mask_, (MessageLite)updateDocumentRequest.mask_);
                this.currentDocument_ = (Precondition)visitor.visitMessage((MessageLite)this.currentDocument_, (MessageLite)updateDocumentRequest.currentDocument_);
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
        return new UpdateDocumentRequest();
    }

    public Precondition getCurrentDocument() {
        Precondition precondition = this.currentDocument_;
        if (precondition == null) {
            precondition = Precondition.getDefaultInstance();
        }
        return precondition;
    }

    public Document getDocument() {
        Document document = this.document_;
        if (document == null) {
            document = Document.getDefaultInstance();
        }
        return document;
    }

    public DocumentMask getMask() {
        DocumentMask documentMask = this.mask_;
        if (documentMask == null) {
            documentMask = DocumentMask.getDefaultInstance();
        }
        return documentMask;
    }

    public int getSerializedSize() {
        int n = this.memoizedSerializedSize;
        if (n != -1) {
            return n;
        }
        Document document = this.document_;
        int n2 = 0;
        if (document != null) {
            n2 = 0 + CodedOutputStream.computeMessageSize((int)1, (MessageLite)this.getDocument());
        }
        if (this.updateMask_ != null) {
            n2 += CodedOutputStream.computeMessageSize((int)2, (MessageLite)this.getUpdateMask());
        }
        if (this.mask_ != null) {
            n2 += CodedOutputStream.computeMessageSize((int)3, (MessageLite)this.getMask());
        }
        if (this.currentDocument_ != null) {
            n2 += CodedOutputStream.computeMessageSize((int)4, (MessageLite)this.getCurrentDocument());
        }
        this.memoizedSerializedSize = n2;
        return n2;
    }

    public DocumentMask getUpdateMask() {
        DocumentMask documentMask = this.updateMask_;
        if (documentMask == null) {
            documentMask = DocumentMask.getDefaultInstance();
        }
        return documentMask;
    }

    public boolean hasCurrentDocument() {
        return this.currentDocument_ != null;
    }

    public boolean hasDocument() {
        return this.document_ != null;
    }

    public boolean hasMask() {
        return this.mask_ != null;
    }

    public boolean hasUpdateMask() {
        return this.updateMask_ != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.document_ != null) {
            codedOutputStream.writeMessage(1, (MessageLite)this.getDocument());
        }
        if (this.updateMask_ != null) {
            codedOutputStream.writeMessage(2, (MessageLite)this.getUpdateMask());
        }
        if (this.mask_ != null) {
            codedOutputStream.writeMessage(3, (MessageLite)this.getMask());
        }
        if (this.currentDocument_ != null) {
            codedOutputStream.writeMessage(4, (MessageLite)this.getCurrentDocument());
        }
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<UpdateDocumentRequest, Builder>
    implements UpdateDocumentRequestOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder clearCurrentDocument() {
            this.copyOnWrite();
            ((UpdateDocumentRequest)this.instance).clearCurrentDocument();
            return this;
        }

        public Builder clearDocument() {
            this.copyOnWrite();
            ((UpdateDocumentRequest)this.instance).clearDocument();
            return this;
        }

        public Builder clearMask() {
            this.copyOnWrite();
            ((UpdateDocumentRequest)this.instance).clearMask();
            return this;
        }

        public Builder clearUpdateMask() {
            this.copyOnWrite();
            ((UpdateDocumentRequest)this.instance).clearUpdateMask();
            return this;
        }

        public Precondition getCurrentDocument() {
            return ((UpdateDocumentRequest)this.instance).getCurrentDocument();
        }

        public Document getDocument() {
            return ((UpdateDocumentRequest)this.instance).getDocument();
        }

        public DocumentMask getMask() {
            return ((UpdateDocumentRequest)this.instance).getMask();
        }

        public DocumentMask getUpdateMask() {
            return ((UpdateDocumentRequest)this.instance).getUpdateMask();
        }

        public boolean hasCurrentDocument() {
            return ((UpdateDocumentRequest)this.instance).hasCurrentDocument();
        }

        public boolean hasDocument() {
            return ((UpdateDocumentRequest)this.instance).hasDocument();
        }

        public boolean hasMask() {
            return ((UpdateDocumentRequest)this.instance).hasMask();
        }

        public boolean hasUpdateMask() {
            return ((UpdateDocumentRequest)this.instance).hasUpdateMask();
        }

        public Builder mergeCurrentDocument(Precondition precondition) {
            this.copyOnWrite();
            ((UpdateDocumentRequest)this.instance).mergeCurrentDocument(precondition);
            return this;
        }

        public Builder mergeDocument(Document document) {
            this.copyOnWrite();
            ((UpdateDocumentRequest)this.instance).mergeDocument(document);
            return this;
        }

        public Builder mergeMask(DocumentMask documentMask) {
            this.copyOnWrite();
            ((UpdateDocumentRequest)this.instance).mergeMask(documentMask);
            return this;
        }

        public Builder mergeUpdateMask(DocumentMask documentMask) {
            this.copyOnWrite();
            ((UpdateDocumentRequest)this.instance).mergeUpdateMask(documentMask);
            return this;
        }

        public Builder setCurrentDocument(Precondition.Builder builder) {
            this.copyOnWrite();
            ((UpdateDocumentRequest)this.instance).setCurrentDocument(builder);
            return this;
        }

        public Builder setCurrentDocument(Precondition precondition) {
            this.copyOnWrite();
            ((UpdateDocumentRequest)this.instance).setCurrentDocument(precondition);
            return this;
        }

        public Builder setDocument(Document.Builder builder) {
            this.copyOnWrite();
            ((UpdateDocumentRequest)this.instance).setDocument(builder);
            return this;
        }

        public Builder setDocument(Document document) {
            this.copyOnWrite();
            ((UpdateDocumentRequest)this.instance).setDocument(document);
            return this;
        }

        public Builder setMask(DocumentMask.Builder builder) {
            this.copyOnWrite();
            ((UpdateDocumentRequest)this.instance).setMask(builder);
            return this;
        }

        public Builder setMask(DocumentMask documentMask) {
            this.copyOnWrite();
            ((UpdateDocumentRequest)this.instance).setMask(documentMask);
            return this;
        }

        public Builder setUpdateMask(DocumentMask.Builder builder) {
            this.copyOnWrite();
            ((UpdateDocumentRequest)this.instance).setUpdateMask(builder);
            return this;
        }

        public Builder setUpdateMask(DocumentMask documentMask) {
            this.copyOnWrite();
            ((UpdateDocumentRequest)this.instance).setUpdateMask(documentMask);
            return this;
        }
    }

}

