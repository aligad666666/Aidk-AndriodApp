/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.firestore.v1.CreateDocumentRequest$1
 *  com.google.firestore.v1.CreateDocumentRequestOrBuilder
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

import com.google.firestore.v1.CreateDocumentRequest;
import com.google.firestore.v1.CreateDocumentRequestOrBuilder;
import com.google.firestore.v1.Document;
import com.google.firestore.v1.DocumentMask;
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

public final class CreateDocumentRequest
extends GeneratedMessageLite<CreateDocumentRequest, Builder>
implements CreateDocumentRequestOrBuilder {
    public static final int COLLECTION_ID_FIELD_NUMBER = 2;
    private static final CreateDocumentRequest DEFAULT_INSTANCE = new CreateDocumentRequest();
    public static final int DOCUMENT_FIELD_NUMBER = 4;
    public static final int DOCUMENT_ID_FIELD_NUMBER = 3;
    public static final int MASK_FIELD_NUMBER = 5;
    public static final int PARENT_FIELD_NUMBER = 1;
    private static volatile Parser<CreateDocumentRequest> PARSER;
    private String collectionId_ = "";
    private String documentId_ = "";
    private Document document_;
    private DocumentMask mask_;
    private String parent_ = "";

    static {
        DEFAULT_INSTANCE.makeImmutable();
    }

    private CreateDocumentRequest() {
    }

    private void clearCollectionId() {
        this.collectionId_ = CreateDocumentRequest.getDefaultInstance().getCollectionId();
    }

    private void clearDocument() {
        this.document_ = null;
    }

    private void clearDocumentId() {
        this.documentId_ = CreateDocumentRequest.getDefaultInstance().getDocumentId();
    }

    private void clearMask() {
        this.mask_ = null;
    }

    private void clearParent() {
        this.parent_ = CreateDocumentRequest.getDefaultInstance().getParent();
    }

    public static CreateDocumentRequest getDefaultInstance() {
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

    private void mergeMask(DocumentMask documentMask) {
        DocumentMask documentMask2 = this.mask_;
        if (documentMask2 != null && documentMask2 != DocumentMask.getDefaultInstance()) {
            this.mask_ = (DocumentMask)((DocumentMask.Builder)DocumentMask.newBuilder(this.mask_).mergeFrom((GeneratedMessageLite)documentMask)).buildPartial();
            return;
        }
        this.mask_ = documentMask;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(CreateDocumentRequest createDocumentRequest) {
        return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)createDocumentRequest);
    }

    public static CreateDocumentRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CreateDocumentRequest)CreateDocumentRequest.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static CreateDocumentRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CreateDocumentRequest)CreateDocumentRequest.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static CreateDocumentRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (CreateDocumentRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static CreateDocumentRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CreateDocumentRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static CreateDocumentRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (CreateDocumentRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static CreateDocumentRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CreateDocumentRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static CreateDocumentRequest parseFrom(InputStream inputStream) throws IOException {
        return (CreateDocumentRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static CreateDocumentRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CreateDocumentRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static CreateDocumentRequest parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (CreateDocumentRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static CreateDocumentRequest parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CreateDocumentRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<CreateDocumentRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setCollectionId(String string) {
        if (string != null) {
            this.collectionId_ = string;
            return;
        }
        throw new NullPointerException();
    }

    private void setCollectionIdBytes(ByteString byteString) {
        if (byteString != null) {
            CreateDocumentRequest.checkByteStringIsUtf8((ByteString)byteString);
            this.collectionId_ = byteString.toStringUtf8();
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

    private void setDocumentId(String string) {
        if (string != null) {
            this.documentId_ = string;
            return;
        }
        throw new NullPointerException();
    }

    private void setDocumentIdBytes(ByteString byteString) {
        if (byteString != null) {
            CreateDocumentRequest.checkByteStringIsUtf8((ByteString)byteString);
            this.documentId_ = byteString.toStringUtf8();
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

    private void setParent(String string) {
        if (string != null) {
            this.parent_ = string;
            return;
        }
        throw new NullPointerException();
    }

    private void setParentBytes(ByteString byteString) {
        if (byteString != null) {
            CreateDocumentRequest.checkByteStringIsUtf8((ByteString)byteString);
            this.parent_ = byteString.toStringUtf8();
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
                Class<CreateDocumentRequest> class_ = CreateDocumentRequest.class;
                // MONITORENTER : com.google.firestore.v1.CreateDocumentRequest.class
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
                                            if (codedInputStream.skipField(n)) continue;
                                            bl = true;
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
                                this.documentId_ = codedInputStream.readStringRequireUtf8();
                                continue;
                            }
                            this.collectionId_ = codedInputStream.readStringRequireUtf8();
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
                GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor)object;
                CreateDocumentRequest createDocumentRequest = (CreateDocumentRequest)((Object)object2);
                this.parent_ = visitor.visitString(true ^ this.parent_.isEmpty(), this.parent_, true ^ createDocumentRequest.parent_.isEmpty(), createDocumentRequest.parent_);
                this.collectionId_ = visitor.visitString(true ^ this.collectionId_.isEmpty(), this.collectionId_, true ^ createDocumentRequest.collectionId_.isEmpty(), createDocumentRequest.collectionId_);
                this.documentId_ = visitor.visitString(true ^ this.documentId_.isEmpty(), this.documentId_, true ^ createDocumentRequest.documentId_.isEmpty(), createDocumentRequest.documentId_);
                this.document_ = (Document)visitor.visitMessage((MessageLite)this.document_, (MessageLite)createDocumentRequest.document_);
                this.mask_ = (DocumentMask)visitor.visitMessage((MessageLite)this.mask_, (MessageLite)createDocumentRequest.mask_);
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
        return new CreateDocumentRequest();
    }

    public String getCollectionId() {
        return this.collectionId_;
    }

    public ByteString getCollectionIdBytes() {
        return ByteString.copyFromUtf8((String)this.collectionId_);
    }

    public Document getDocument() {
        Document document = this.document_;
        if (document == null) {
            document = Document.getDefaultInstance();
        }
        return document;
    }

    public String getDocumentId() {
        return this.documentId_;
    }

    public ByteString getDocumentIdBytes() {
        return ByteString.copyFromUtf8((String)this.documentId_);
    }

    public DocumentMask getMask() {
        DocumentMask documentMask = this.mask_;
        if (documentMask == null) {
            documentMask = DocumentMask.getDefaultInstance();
        }
        return documentMask;
    }

    public String getParent() {
        return this.parent_;
    }

    public ByteString getParentBytes() {
        return ByteString.copyFromUtf8((String)this.parent_);
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
        if (!this.collectionId_.isEmpty()) {
            n2 += CodedOutputStream.computeStringSize((int)2, (String)this.getCollectionId());
        }
        if (!this.documentId_.isEmpty()) {
            n2 += CodedOutputStream.computeStringSize((int)3, (String)this.getDocumentId());
        }
        if (this.document_ != null) {
            n2 += CodedOutputStream.computeMessageSize((int)4, (MessageLite)this.getDocument());
        }
        if (this.mask_ != null) {
            n2 += CodedOutputStream.computeMessageSize((int)5, (MessageLite)this.getMask());
        }
        this.memoizedSerializedSize = n2;
        return n2;
    }

    public boolean hasDocument() {
        return this.document_ != null;
    }

    public boolean hasMask() {
        return this.mask_ != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.parent_.isEmpty()) {
            codedOutputStream.writeString(1, this.getParent());
        }
        if (!this.collectionId_.isEmpty()) {
            codedOutputStream.writeString(2, this.getCollectionId());
        }
        if (!this.documentId_.isEmpty()) {
            codedOutputStream.writeString(3, this.getDocumentId());
        }
        if (this.document_ != null) {
            codedOutputStream.writeMessage(4, (MessageLite)this.getDocument());
        }
        if (this.mask_ != null) {
            codedOutputStream.writeMessage(5, (MessageLite)this.getMask());
        }
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<CreateDocumentRequest, Builder>
    implements CreateDocumentRequestOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder clearCollectionId() {
            this.copyOnWrite();
            ((CreateDocumentRequest)this.instance).clearCollectionId();
            return this;
        }

        public Builder clearDocument() {
            this.copyOnWrite();
            ((CreateDocumentRequest)this.instance).clearDocument();
            return this;
        }

        public Builder clearDocumentId() {
            this.copyOnWrite();
            ((CreateDocumentRequest)this.instance).clearDocumentId();
            return this;
        }

        public Builder clearMask() {
            this.copyOnWrite();
            ((CreateDocumentRequest)this.instance).clearMask();
            return this;
        }

        public Builder clearParent() {
            this.copyOnWrite();
            ((CreateDocumentRequest)this.instance).clearParent();
            return this;
        }

        public String getCollectionId() {
            return ((CreateDocumentRequest)this.instance).getCollectionId();
        }

        public ByteString getCollectionIdBytes() {
            return ((CreateDocumentRequest)this.instance).getCollectionIdBytes();
        }

        public Document getDocument() {
            return ((CreateDocumentRequest)this.instance).getDocument();
        }

        public String getDocumentId() {
            return ((CreateDocumentRequest)this.instance).getDocumentId();
        }

        public ByteString getDocumentIdBytes() {
            return ((CreateDocumentRequest)this.instance).getDocumentIdBytes();
        }

        public DocumentMask getMask() {
            return ((CreateDocumentRequest)this.instance).getMask();
        }

        public String getParent() {
            return ((CreateDocumentRequest)this.instance).getParent();
        }

        public ByteString getParentBytes() {
            return ((CreateDocumentRequest)this.instance).getParentBytes();
        }

        public boolean hasDocument() {
            return ((CreateDocumentRequest)this.instance).hasDocument();
        }

        public boolean hasMask() {
            return ((CreateDocumentRequest)this.instance).hasMask();
        }

        public Builder mergeDocument(Document document) {
            this.copyOnWrite();
            ((CreateDocumentRequest)this.instance).mergeDocument(document);
            return this;
        }

        public Builder mergeMask(DocumentMask documentMask) {
            this.copyOnWrite();
            ((CreateDocumentRequest)this.instance).mergeMask(documentMask);
            return this;
        }

        public Builder setCollectionId(String string) {
            this.copyOnWrite();
            ((CreateDocumentRequest)this.instance).setCollectionId(string);
            return this;
        }

        public Builder setCollectionIdBytes(ByteString byteString) {
            this.copyOnWrite();
            ((CreateDocumentRequest)this.instance).setCollectionIdBytes(byteString);
            return this;
        }

        public Builder setDocument(Document.Builder builder) {
            this.copyOnWrite();
            ((CreateDocumentRequest)this.instance).setDocument(builder);
            return this;
        }

        public Builder setDocument(Document document) {
            this.copyOnWrite();
            ((CreateDocumentRequest)this.instance).setDocument(document);
            return this;
        }

        public Builder setDocumentId(String string) {
            this.copyOnWrite();
            ((CreateDocumentRequest)this.instance).setDocumentId(string);
            return this;
        }

        public Builder setDocumentIdBytes(ByteString byteString) {
            this.copyOnWrite();
            ((CreateDocumentRequest)this.instance).setDocumentIdBytes(byteString);
            return this;
        }

        public Builder setMask(DocumentMask.Builder builder) {
            this.copyOnWrite();
            ((CreateDocumentRequest)this.instance).setMask(builder);
            return this;
        }

        public Builder setMask(DocumentMask documentMask) {
            this.copyOnWrite();
            ((CreateDocumentRequest)this.instance).setMask(documentMask);
            return this;
        }

        public Builder setParent(String string) {
            this.copyOnWrite();
            ((CreateDocumentRequest)this.instance).setParent(string);
            return this;
        }

        public Builder setParentBytes(ByteString byteString) {
            this.copyOnWrite();
            ((CreateDocumentRequest)this.instance).setParentBytes(byteString);
            return this;
        }
    }

}

