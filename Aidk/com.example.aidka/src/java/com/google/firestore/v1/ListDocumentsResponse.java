/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.firestore.v1.DocumentOrBuilder
 *  com.google.firestore.v1.ListDocumentsResponse$1
 *  com.google.firestore.v1.ListDocumentsResponseOrBuilder
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

import com.google.firestore.v1.Document;
import com.google.firestore.v1.DocumentOrBuilder;
import com.google.firestore.v1.ListDocumentsResponse;
import com.google.firestore.v1.ListDocumentsResponseOrBuilder;
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
import java.util.Collections;
import java.util.List;

public final class ListDocumentsResponse
extends GeneratedMessageLite<ListDocumentsResponse, Builder>
implements ListDocumentsResponseOrBuilder {
    private static final ListDocumentsResponse DEFAULT_INSTANCE = new ListDocumentsResponse();
    public static final int DOCUMENTS_FIELD_NUMBER = 1;
    public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
    private static volatile Parser<ListDocumentsResponse> PARSER;
    private int bitField0_;
    private Internal.ProtobufList<Document> documents_ = ListDocumentsResponse.emptyProtobufList();
    private String nextPageToken_ = "";

    static {
        DEFAULT_INSTANCE.makeImmutable();
    }

    private ListDocumentsResponse() {
    }

    private void addAllDocuments(Iterable<? extends Document> iterable) {
        this.ensureDocumentsIsMutable();
        AbstractMessageLite.addAll(iterable, this.documents_);
    }

    private void addDocuments(int n, Document.Builder builder) {
        this.ensureDocumentsIsMutable();
        this.documents_.add(n, (Object)((Document)builder.build()));
    }

    private void addDocuments(int n, Document document) {
        if (document != null) {
            this.ensureDocumentsIsMutable();
            this.documents_.add(n, (Object)document);
            return;
        }
        throw new NullPointerException();
    }

    private void addDocuments(Document.Builder builder) {
        this.ensureDocumentsIsMutable();
        this.documents_.add((Object)((Document)builder.build()));
    }

    private void addDocuments(Document document) {
        if (document != null) {
            this.ensureDocumentsIsMutable();
            this.documents_.add((Object)document);
            return;
        }
        throw new NullPointerException();
    }

    private void clearDocuments() {
        this.documents_ = ListDocumentsResponse.emptyProtobufList();
    }

    private void clearNextPageToken() {
        this.nextPageToken_ = ListDocumentsResponse.getDefaultInstance().getNextPageToken();
    }

    private void ensureDocumentsIsMutable() {
        if (!this.documents_.isModifiable()) {
            this.documents_ = GeneratedMessageLite.mutableCopy(this.documents_);
        }
    }

    public static ListDocumentsResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(ListDocumentsResponse listDocumentsResponse) {
        return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)listDocumentsResponse);
    }

    public static ListDocumentsResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ListDocumentsResponse)ListDocumentsResponse.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static ListDocumentsResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ListDocumentsResponse)ListDocumentsResponse.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ListDocumentsResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ListDocumentsResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static ListDocumentsResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ListDocumentsResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ListDocumentsResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ListDocumentsResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static ListDocumentsResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ListDocumentsResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ListDocumentsResponse parseFrom(InputStream inputStream) throws IOException {
        return (ListDocumentsResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static ListDocumentsResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ListDocumentsResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ListDocumentsResponse parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (ListDocumentsResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static ListDocumentsResponse parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ListDocumentsResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<ListDocumentsResponse> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeDocuments(int n) {
        this.ensureDocumentsIsMutable();
        this.documents_.remove(n);
    }

    private void setDocuments(int n, Document.Builder builder) {
        this.ensureDocumentsIsMutable();
        this.documents_.set(n, (Object)((Document)builder.build()));
    }

    private void setDocuments(int n, Document document) {
        if (document != null) {
            this.ensureDocumentsIsMutable();
            this.documents_.set(n, (Object)document);
            return;
        }
        throw new NullPointerException();
    }

    private void setNextPageToken(String string) {
        if (string != null) {
            this.nextPageToken_ = string;
            return;
        }
        throw new NullPointerException();
    }

    private void setNextPageTokenBytes(ByteString byteString) {
        if (byteString != null) {
            ListDocumentsResponse.checkByteStringIsUtf8((ByteString)byteString);
            this.nextPageToken_ = byteString.toStringUtf8();
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
                Class<ListDocumentsResponse> class_ = ListDocumentsResponse.class;
                // MONITORENTER : com.google.firestore.v1.ListDocumentsResponse.class
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
                            this.nextPageToken_ = codedInputStream.readStringRequireUtf8();
                            continue;
                        }
                        if (!this.documents_.isModifiable()) {
                            this.documents_ = GeneratedMessageLite.mutableCopy(this.documents_);
                        }
                        this.documents_.add((Object)((Document)codedInputStream.readMessage(Document.parser(), extensionRegistryLite)));
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
                ListDocumentsResponse listDocumentsResponse = (ListDocumentsResponse)((Object)object2);
                this.documents_ = visitor.visitList(this.documents_, listDocumentsResponse.documents_);
                this.nextPageToken_ = visitor.visitString(true ^ this.nextPageToken_.isEmpty(), this.nextPageToken_, true ^ listDocumentsResponse.nextPageToken_.isEmpty(), listDocumentsResponse.nextPageToken_);
                if (visitor != GeneratedMessageLite.MergeFromVisitor.INSTANCE) return this;
                this.bitField0_ |= listDocumentsResponse.bitField0_;
                return this;
            }
            case 4: {
                return new Builder();
            }
            case 3: {
                this.documents_.makeImmutable();
                return null;
            }
            case 2: {
                return DEFAULT_INSTANCE;
            }
            case 1: 
        }
        return new ListDocumentsResponse();
    }

    public Document getDocuments(int n) {
        return (Document)((Object)this.documents_.get(n));
    }

    public int getDocumentsCount() {
        return this.documents_.size();
    }

    public List<Document> getDocumentsList() {
        return this.documents_;
    }

    public DocumentOrBuilder getDocumentsOrBuilder(int n) {
        return (DocumentOrBuilder)this.documents_.get(n);
    }

    public List<? extends DocumentOrBuilder> getDocumentsOrBuilderList() {
        return this.documents_;
    }

    public String getNextPageToken() {
        return this.nextPageToken_;
    }

    public ByteString getNextPageTokenBytes() {
        return ByteString.copyFromUtf8((String)this.nextPageToken_);
    }

    public int getSerializedSize() {
        int n = this.memoizedSerializedSize;
        if (n != -1) {
            return n;
        }
        int n2 = 0;
        for (int i = 0; i < this.documents_.size(); ++i) {
            n2 += CodedOutputStream.computeMessageSize((int)1, (MessageLite)((MessageLite)this.documents_.get(i)));
        }
        if (!this.nextPageToken_.isEmpty()) {
            n2 += CodedOutputStream.computeStringSize((int)2, (String)this.getNextPageToken());
        }
        this.memoizedSerializedSize = n2;
        return n2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.documents_.size(); ++i) {
            codedOutputStream.writeMessage(1, (MessageLite)this.documents_.get(i));
        }
        if (!this.nextPageToken_.isEmpty()) {
            codedOutputStream.writeString(2, this.getNextPageToken());
        }
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<ListDocumentsResponse, Builder>
    implements ListDocumentsResponseOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder addAllDocuments(Iterable<? extends Document> iterable) {
            this.copyOnWrite();
            ((ListDocumentsResponse)this.instance).addAllDocuments((Iterable<? extends Document>)iterable);
            return this;
        }

        public Builder addDocuments(int n, Document.Builder builder) {
            this.copyOnWrite();
            ((ListDocumentsResponse)this.instance).addDocuments(n, builder);
            return this;
        }

        public Builder addDocuments(int n, Document document) {
            this.copyOnWrite();
            ((ListDocumentsResponse)this.instance).addDocuments(n, document);
            return this;
        }

        public Builder addDocuments(Document.Builder builder) {
            this.copyOnWrite();
            ((ListDocumentsResponse)this.instance).addDocuments(builder);
            return this;
        }

        public Builder addDocuments(Document document) {
            this.copyOnWrite();
            ((ListDocumentsResponse)this.instance).addDocuments(document);
            return this;
        }

        public Builder clearDocuments() {
            this.copyOnWrite();
            ((ListDocumentsResponse)this.instance).clearDocuments();
            return this;
        }

        public Builder clearNextPageToken() {
            this.copyOnWrite();
            ((ListDocumentsResponse)this.instance).clearNextPageToken();
            return this;
        }

        public Document getDocuments(int n) {
            return ((ListDocumentsResponse)this.instance).getDocuments(n);
        }

        public int getDocumentsCount() {
            return ((ListDocumentsResponse)this.instance).getDocumentsCount();
        }

        public List<Document> getDocumentsList() {
            return Collections.unmodifiableList(((ListDocumentsResponse)this.instance).getDocumentsList());
        }

        public String getNextPageToken() {
            return ((ListDocumentsResponse)this.instance).getNextPageToken();
        }

        public ByteString getNextPageTokenBytes() {
            return ((ListDocumentsResponse)this.instance).getNextPageTokenBytes();
        }

        public Builder removeDocuments(int n) {
            this.copyOnWrite();
            ((ListDocumentsResponse)this.instance).removeDocuments(n);
            return this;
        }

        public Builder setDocuments(int n, Document.Builder builder) {
            this.copyOnWrite();
            ((ListDocumentsResponse)this.instance).setDocuments(n, builder);
            return this;
        }

        public Builder setDocuments(int n, Document document) {
            this.copyOnWrite();
            ((ListDocumentsResponse)this.instance).setDocuments(n, document);
            return this;
        }

        public Builder setNextPageToken(String string) {
            this.copyOnWrite();
            ((ListDocumentsResponse)this.instance).setNextPageToken(string);
            return this;
        }

        public Builder setNextPageTokenBytes(ByteString byteString) {
            this.copyOnWrite();
            ((ListDocumentsResponse)this.instance).setNextPageTokenBytes(byteString);
            return this;
        }
    }

}

