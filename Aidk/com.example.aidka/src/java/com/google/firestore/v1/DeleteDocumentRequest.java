/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.firestore.v1.DeleteDocumentRequest$1
 *  com.google.firestore.v1.DeleteDocumentRequestOrBuilder
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

import com.google.firestore.v1.DeleteDocumentRequest;
import com.google.firestore.v1.DeleteDocumentRequestOrBuilder;
import com.google.firestore.v1.Precondition;
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

public final class DeleteDocumentRequest
extends GeneratedMessageLite<DeleteDocumentRequest, Builder>
implements DeleteDocumentRequestOrBuilder {
    public static final int CURRENT_DOCUMENT_FIELD_NUMBER = 2;
    private static final DeleteDocumentRequest DEFAULT_INSTANCE = new DeleteDocumentRequest();
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<DeleteDocumentRequest> PARSER;
    private Precondition currentDocument_;
    private String name_ = "";

    static {
        DEFAULT_INSTANCE.makeImmutable();
    }

    private DeleteDocumentRequest() {
    }

    private void clearCurrentDocument() {
        this.currentDocument_ = null;
    }

    private void clearName() {
        this.name_ = DeleteDocumentRequest.getDefaultInstance().getName();
    }

    public static DeleteDocumentRequest getDefaultInstance() {
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

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(DeleteDocumentRequest deleteDocumentRequest) {
        return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)deleteDocumentRequest);
    }

    public static DeleteDocumentRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DeleteDocumentRequest)DeleteDocumentRequest.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static DeleteDocumentRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DeleteDocumentRequest)DeleteDocumentRequest.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static DeleteDocumentRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DeleteDocumentRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static DeleteDocumentRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DeleteDocumentRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static DeleteDocumentRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DeleteDocumentRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static DeleteDocumentRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DeleteDocumentRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static DeleteDocumentRequest parseFrom(InputStream inputStream) throws IOException {
        return (DeleteDocumentRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static DeleteDocumentRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DeleteDocumentRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static DeleteDocumentRequest parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (DeleteDocumentRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static DeleteDocumentRequest parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DeleteDocumentRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<DeleteDocumentRequest> parser() {
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

    private void setName(String string) {
        if (string != null) {
            this.name_ = string;
            return;
        }
        throw new NullPointerException();
    }

    private void setNameBytes(ByteString byteString) {
        if (byteString != null) {
            DeleteDocumentRequest.checkByteStringIsUtf8((ByteString)byteString);
            this.name_ = byteString.toStringUtf8();
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
                Class<DeleteDocumentRequest> class_ = DeleteDocumentRequest.class;
                // MONITORENTER : com.google.firestore.v1.DeleteDocumentRequest.class
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
                        this.name_ = codedInputStream.readStringRequireUtf8();
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
                DeleteDocumentRequest deleteDocumentRequest = (DeleteDocumentRequest)((Object)object2);
                this.name_ = visitor.visitString(true ^ this.name_.isEmpty(), this.name_, true ^ deleteDocumentRequest.name_.isEmpty(), deleteDocumentRequest.name_);
                this.currentDocument_ = (Precondition)visitor.visitMessage((MessageLite)this.currentDocument_, (MessageLite)deleteDocumentRequest.currentDocument_);
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
        return new DeleteDocumentRequest();
    }

    public Precondition getCurrentDocument() {
        Precondition precondition = this.currentDocument_;
        if (precondition == null) {
            precondition = Precondition.getDefaultInstance();
        }
        return precondition;
    }

    public String getName() {
        return this.name_;
    }

    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8((String)this.name_);
    }

    public int getSerializedSize() {
        int n = this.memoizedSerializedSize;
        if (n != -1) {
            return n;
        }
        boolean bl = this.name_.isEmpty();
        int n2 = 0;
        if (!bl) {
            n2 = 0 + CodedOutputStream.computeStringSize((int)1, (String)this.getName());
        }
        if (this.currentDocument_ != null) {
            n2 += CodedOutputStream.computeMessageSize((int)2, (MessageLite)this.getCurrentDocument());
        }
        this.memoizedSerializedSize = n2;
        return n2;
    }

    public boolean hasCurrentDocument() {
        return this.currentDocument_ != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.name_.isEmpty()) {
            codedOutputStream.writeString(1, this.getName());
        }
        if (this.currentDocument_ != null) {
            codedOutputStream.writeMessage(2, (MessageLite)this.getCurrentDocument());
        }
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<DeleteDocumentRequest, Builder>
    implements DeleteDocumentRequestOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder clearCurrentDocument() {
            this.copyOnWrite();
            ((DeleteDocumentRequest)this.instance).clearCurrentDocument();
            return this;
        }

        public Builder clearName() {
            this.copyOnWrite();
            ((DeleteDocumentRequest)this.instance).clearName();
            return this;
        }

        public Precondition getCurrentDocument() {
            return ((DeleteDocumentRequest)this.instance).getCurrentDocument();
        }

        public String getName() {
            return ((DeleteDocumentRequest)this.instance).getName();
        }

        public ByteString getNameBytes() {
            return ((DeleteDocumentRequest)this.instance).getNameBytes();
        }

        public boolean hasCurrentDocument() {
            return ((DeleteDocumentRequest)this.instance).hasCurrentDocument();
        }

        public Builder mergeCurrentDocument(Precondition precondition) {
            this.copyOnWrite();
            ((DeleteDocumentRequest)this.instance).mergeCurrentDocument(precondition);
            return this;
        }

        public Builder setCurrentDocument(Precondition.Builder builder) {
            this.copyOnWrite();
            ((DeleteDocumentRequest)this.instance).setCurrentDocument(builder);
            return this;
        }

        public Builder setCurrentDocument(Precondition precondition) {
            this.copyOnWrite();
            ((DeleteDocumentRequest)this.instance).setCurrentDocument(precondition);
            return this;
        }

        public Builder setName(String string) {
            this.copyOnWrite();
            ((DeleteDocumentRequest)this.instance).setName(string);
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            this.copyOnWrite();
            ((DeleteDocumentRequest)this.instance).setNameBytes(byteString);
            return this;
        }
    }

}

