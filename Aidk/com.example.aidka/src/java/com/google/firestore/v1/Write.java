/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.firestore.v1.Write$1
 *  com.google.firestore.v1.Write$OperationCase
 *  com.google.firestore.v1.WriteOrBuilder
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
import com.google.firestore.v1.DocumentTransform;
import com.google.firestore.v1.Precondition;
import com.google.firestore.v1.Write;
import com.google.firestore.v1.WriteOrBuilder;
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

/*
 * Exception performing whole class analysis ignored.
 */
public final class Write
extends GeneratedMessageLite<Write, Builder>
implements WriteOrBuilder {
    public static final int CURRENT_DOCUMENT_FIELD_NUMBER = 4;
    private static final Write DEFAULT_INSTANCE = new Write();
    public static final int DELETE_FIELD_NUMBER = 2;
    private static volatile Parser<Write> PARSER;
    public static final int TRANSFORM_FIELD_NUMBER = 6;
    public static final int UPDATE_FIELD_NUMBER = 1;
    public static final int UPDATE_MASK_FIELD_NUMBER = 3;
    private Precondition currentDocument_;
    private int operationCase_ = 0;
    private Object operation_;
    private DocumentMask updateMask_;

    static {
        DEFAULT_INSTANCE.makeImmutable();
    }

    private Write() {
    }

    private void clearCurrentDocument() {
        this.currentDocument_ = null;
    }

    private void clearDelete() {
        if (this.operationCase_ == 2) {
            this.operationCase_ = 0;
            this.operation_ = null;
        }
    }

    private void clearOperation() {
        this.operationCase_ = 0;
        this.operation_ = null;
    }

    private void clearTransform() {
        if (this.operationCase_ == 6) {
            this.operationCase_ = 0;
            this.operation_ = null;
        }
    }

    private void clearUpdate() {
        if (this.operationCase_ == 1) {
            this.operationCase_ = 0;
            this.operation_ = null;
        }
    }

    private void clearUpdateMask() {
        this.updateMask_ = null;
    }

    public static Write getDefaultInstance() {
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

    private void mergeTransform(DocumentTransform documentTransform) {
        this.operation_ = this.operationCase_ == 6 && this.operation_ != DocumentTransform.getDefaultInstance() ? ((DocumentTransform.Builder)DocumentTransform.newBuilder((DocumentTransform)((Object)this.operation_)).mergeFrom((GeneratedMessageLite)documentTransform)).buildPartial() : documentTransform;
        this.operationCase_ = 6;
    }

    private void mergeUpdate(Document document) {
        this.operation_ = this.operationCase_ == 1 && this.operation_ != Document.getDefaultInstance() ? ((Document.Builder)Document.newBuilder((Document)((Object)this.operation_)).mergeFrom((GeneratedMessageLite)document)).buildPartial() : document;
        this.operationCase_ = 1;
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

    public static Builder newBuilder(Write write) {
        return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)write);
    }

    public static Write parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Write)Write.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Write parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Write)Write.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Write parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Write)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static Write parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Write)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Write parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Write)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static Write parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Write)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Write parseFrom(InputStream inputStream) throws IOException {
        return (Write)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Write parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Write)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Write parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (Write)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static Write parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Write)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<Write> parser() {
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

    private void setDelete(String string) {
        if (string != null) {
            this.operationCase_ = 2;
            this.operation_ = string;
            return;
        }
        throw new NullPointerException();
    }

    private void setDeleteBytes(ByteString byteString) {
        if (byteString != null) {
            Write.checkByteStringIsUtf8((ByteString)byteString);
            this.operationCase_ = 2;
            this.operation_ = byteString.toStringUtf8();
            return;
        }
        throw new NullPointerException();
    }

    private void setTransform(DocumentTransform.Builder builder) {
        this.operation_ = builder.build();
        this.operationCase_ = 6;
    }

    private void setTransform(DocumentTransform documentTransform) {
        if (documentTransform != null) {
            this.operation_ = documentTransform;
            this.operationCase_ = 6;
            return;
        }
        throw new NullPointerException();
    }

    private void setUpdate(Document.Builder builder) {
        this.operation_ = builder.build();
        this.operationCase_ = 1;
    }

    private void setUpdate(Document document) {
        if (document != null) {
            this.operation_ = document;
            this.operationCase_ = 1;
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
        int n = 1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()];
        int n2 = 1;
        switch (n) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 8: {
                if (PARSER != null) return PARSER;
                Class<Write> class_ = Write.class;
                // MONITORENTER : com.google.firestore.v1.Write.class
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
                                        if (n3 != 50) {
                                            if (codedInputStream.skipField(n3)) continue;
                                            bl = true;
                                            continue;
                                        }
                                        int n4 = this.operationCase_;
                                        DocumentTransform.Builder builder = null;
                                        if (n4 == 6) {
                                            builder = (DocumentTransform.Builder)((DocumentTransform)((Object)this.operation_)).toBuilder();
                                        }
                                        this.operation_ = codedInputStream.readMessage(DocumentTransform.parser(), extensionRegistryLite);
                                        if (builder != null) {
                                            builder.mergeFrom((GeneratedMessageLite)((DocumentTransform)((Object)this.operation_)));
                                            this.operation_ = builder.buildPartial();
                                        }
                                        this.operationCase_ = 6;
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
                            String string = codedInputStream.readStringRequireUtf8();
                            this.operationCase_ = 2;
                            this.operation_ = string;
                            continue;
                        }
                        int n5 = this.operationCase_;
                        Document.Builder builder = null;
                        if (n5 == n2) {
                            builder = (Document.Builder)((Document)((Object)this.operation_)).toBuilder();
                        }
                        this.operation_ = codedInputStream.readMessage(Document.parser(), extensionRegistryLite);
                        if (builder != null) {
                            builder.mergeFrom((GeneratedMessageLite)((Document)((Object)this.operation_)));
                            this.operation_ = builder.buildPartial();
                        }
                        this.operationCase_ = n2;
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
                Write write = (Write)((Object)object2);
                this.updateMask_ = (DocumentMask)visitor.visitMessage((MessageLite)this.updateMask_, (MessageLite)write.updateMask_);
                this.currentDocument_ = (Precondition)visitor.visitMessage((MessageLite)this.currentDocument_, (MessageLite)write.currentDocument_);
                int n6 = 1.$SwitchMap$com$google$firestore$v1$Write$OperationCase[write.getOperationCase().ordinal()];
                if (n6 != n2) {
                    if (n6 != 2) {
                        if (n6 != 3) {
                            if (n6 == 4) {
                                if (this.operationCase_ == 0) {
                                    n2 = 0;
                                }
                                visitor.visitOneofNotSet((boolean)n2);
                            }
                        } else {
                            if (this.operationCase_ != 6) {
                                n2 = 0;
                            }
                            this.operation_ = visitor.visitOneofMessage((boolean)n2, this.operation_, write.operation_);
                        }
                    } else {
                        if (this.operationCase_ != 2) {
                            n2 = 0;
                        }
                        this.operation_ = visitor.visitOneofString((boolean)n2, this.operation_, write.operation_);
                    }
                } else {
                    if (this.operationCase_ != n2) {
                        n2 = 0;
                    }
                    this.operation_ = visitor.visitOneofMessage((boolean)n2, this.operation_, write.operation_);
                }
                if (visitor != GeneratedMessageLite.MergeFromVisitor.INSTANCE) return this;
                int n7 = write.operationCase_;
                if (n7 == 0) return this;
                this.operationCase_ = n7;
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
        return new Write();
    }

    public Precondition getCurrentDocument() {
        Precondition precondition = this.currentDocument_;
        if (precondition == null) {
            precondition = Precondition.getDefaultInstance();
        }
        return precondition;
    }

    public String getDelete() {
        String string = "";
        if (this.operationCase_ == 2) {
            string = (String)this.operation_;
        }
        return string;
    }

    public ByteString getDeleteBytes() {
        String string = "";
        if (this.operationCase_ == 2) {
            string = (String)this.operation_;
        }
        return ByteString.copyFromUtf8((String)string);
    }

    public OperationCase getOperationCase() {
        return OperationCase.forNumber((int)this.operationCase_);
    }

    public int getSerializedSize() {
        int n = this.memoizedSerializedSize;
        if (n != -1) {
            return n;
        }
        int n2 = this.operationCase_;
        int n3 = 0;
        if (n2 == 1) {
            n3 = 0 + CodedOutputStream.computeMessageSize((int)1, (MessageLite)((Document)((Object)this.operation_)));
        }
        if (this.operationCase_ == 2) {
            n3 += CodedOutputStream.computeStringSize((int)2, (String)this.getDelete());
        }
        if (this.updateMask_ != null) {
            n3 += CodedOutputStream.computeMessageSize((int)3, (MessageLite)this.getUpdateMask());
        }
        if (this.currentDocument_ != null) {
            n3 += CodedOutputStream.computeMessageSize((int)4, (MessageLite)this.getCurrentDocument());
        }
        if (this.operationCase_ == 6) {
            n3 += CodedOutputStream.computeMessageSize((int)6, (MessageLite)((DocumentTransform)((Object)this.operation_)));
        }
        this.memoizedSerializedSize = n3;
        return n3;
    }

    public DocumentTransform getTransform() {
        if (this.operationCase_ == 6) {
            return (DocumentTransform)((Object)this.operation_);
        }
        return DocumentTransform.getDefaultInstance();
    }

    public Document getUpdate() {
        if (this.operationCase_ == 1) {
            return (Document)((Object)this.operation_);
        }
        return Document.getDefaultInstance();
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

    public boolean hasUpdateMask() {
        return this.updateMask_ != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.operationCase_ == 1) {
            codedOutputStream.writeMessage(1, (MessageLite)((Document)((Object)this.operation_)));
        }
        if (this.operationCase_ == 2) {
            codedOutputStream.writeString(2, this.getDelete());
        }
        if (this.updateMask_ != null) {
            codedOutputStream.writeMessage(3, (MessageLite)this.getUpdateMask());
        }
        if (this.currentDocument_ != null) {
            codedOutputStream.writeMessage(4, (MessageLite)this.getCurrentDocument());
        }
        if (this.operationCase_ == 6) {
            codedOutputStream.writeMessage(6, (MessageLite)((DocumentTransform)((Object)this.operation_)));
        }
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<Write, Builder>
    implements WriteOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder clearCurrentDocument() {
            this.copyOnWrite();
            ((Write)this.instance).clearCurrentDocument();
            return this;
        }

        public Builder clearDelete() {
            this.copyOnWrite();
            ((Write)this.instance).clearDelete();
            return this;
        }

        public Builder clearOperation() {
            this.copyOnWrite();
            ((Write)this.instance).clearOperation();
            return this;
        }

        public Builder clearTransform() {
            this.copyOnWrite();
            ((Write)this.instance).clearTransform();
            return this;
        }

        public Builder clearUpdate() {
            this.copyOnWrite();
            ((Write)this.instance).clearUpdate();
            return this;
        }

        public Builder clearUpdateMask() {
            this.copyOnWrite();
            ((Write)this.instance).clearUpdateMask();
            return this;
        }

        public Precondition getCurrentDocument() {
            return ((Write)this.instance).getCurrentDocument();
        }

        public String getDelete() {
            return ((Write)this.instance).getDelete();
        }

        public ByteString getDeleteBytes() {
            return ((Write)this.instance).getDeleteBytes();
        }

        public OperationCase getOperationCase() {
            return ((Write)this.instance).getOperationCase();
        }

        public DocumentTransform getTransform() {
            return ((Write)this.instance).getTransform();
        }

        public Document getUpdate() {
            return ((Write)this.instance).getUpdate();
        }

        public DocumentMask getUpdateMask() {
            return ((Write)this.instance).getUpdateMask();
        }

        public boolean hasCurrentDocument() {
            return ((Write)this.instance).hasCurrentDocument();
        }

        public boolean hasUpdateMask() {
            return ((Write)this.instance).hasUpdateMask();
        }

        public Builder mergeCurrentDocument(Precondition precondition) {
            this.copyOnWrite();
            ((Write)this.instance).mergeCurrentDocument(precondition);
            return this;
        }

        public Builder mergeTransform(DocumentTransform documentTransform) {
            this.copyOnWrite();
            ((Write)this.instance).mergeTransform(documentTransform);
            return this;
        }

        public Builder mergeUpdate(Document document) {
            this.copyOnWrite();
            ((Write)this.instance).mergeUpdate(document);
            return this;
        }

        public Builder mergeUpdateMask(DocumentMask documentMask) {
            this.copyOnWrite();
            ((Write)this.instance).mergeUpdateMask(documentMask);
            return this;
        }

        public Builder setCurrentDocument(Precondition.Builder builder) {
            this.copyOnWrite();
            ((Write)this.instance).setCurrentDocument(builder);
            return this;
        }

        public Builder setCurrentDocument(Precondition precondition) {
            this.copyOnWrite();
            ((Write)this.instance).setCurrentDocument(precondition);
            return this;
        }

        public Builder setDelete(String string) {
            this.copyOnWrite();
            ((Write)this.instance).setDelete(string);
            return this;
        }

        public Builder setDeleteBytes(ByteString byteString) {
            this.copyOnWrite();
            ((Write)this.instance).setDeleteBytes(byteString);
            return this;
        }

        public Builder setTransform(DocumentTransform.Builder builder) {
            this.copyOnWrite();
            ((Write)this.instance).setTransform(builder);
            return this;
        }

        public Builder setTransform(DocumentTransform documentTransform) {
            this.copyOnWrite();
            ((Write)this.instance).setTransform(documentTransform);
            return this;
        }

        public Builder setUpdate(Document.Builder builder) {
            this.copyOnWrite();
            ((Write)this.instance).setUpdate(builder);
            return this;
        }

        public Builder setUpdate(Document document) {
            this.copyOnWrite();
            ((Write)this.instance).setUpdate(document);
            return this;
        }

        public Builder setUpdateMask(DocumentMask.Builder builder) {
            this.copyOnWrite();
            ((Write)this.instance).setUpdateMask(builder);
            return this;
        }

        public Builder setUpdateMask(DocumentMask documentMask) {
            this.copyOnWrite();
            ((Write)this.instance).setUpdateMask(documentMask);
            return this;
        }
    }

}

