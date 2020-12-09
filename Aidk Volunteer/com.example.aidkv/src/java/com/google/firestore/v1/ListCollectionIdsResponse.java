/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.firestore.v1.ListCollectionIdsResponse$1
 *  com.google.firestore.v1.ListCollectionIdsResponseOrBuilder
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

import com.google.firestore.v1.ListCollectionIdsResponse;
import com.google.firestore.v1.ListCollectionIdsResponseOrBuilder;
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

public final class ListCollectionIdsResponse
extends GeneratedMessageLite<ListCollectionIdsResponse, Builder>
implements ListCollectionIdsResponseOrBuilder {
    public static final int COLLECTION_IDS_FIELD_NUMBER = 1;
    private static final ListCollectionIdsResponse DEFAULT_INSTANCE = new ListCollectionIdsResponse();
    public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
    private static volatile Parser<ListCollectionIdsResponse> PARSER;
    private int bitField0_;
    private Internal.ProtobufList<String> collectionIds_ = GeneratedMessageLite.emptyProtobufList();
    private String nextPageToken_ = "";

    static {
        DEFAULT_INSTANCE.makeImmutable();
    }

    private ListCollectionIdsResponse() {
    }

    private void addAllCollectionIds(Iterable<String> iterable) {
        this.ensureCollectionIdsIsMutable();
        AbstractMessageLite.addAll(iterable, this.collectionIds_);
    }

    private void addCollectionIds(String string) {
        if (string != null) {
            this.ensureCollectionIdsIsMutable();
            this.collectionIds_.add((Object)string);
            return;
        }
        throw new NullPointerException();
    }

    private void addCollectionIdsBytes(ByteString byteString) {
        if (byteString != null) {
            ListCollectionIdsResponse.checkByteStringIsUtf8((ByteString)byteString);
            this.ensureCollectionIdsIsMutable();
            this.collectionIds_.add((Object)byteString.toStringUtf8());
            return;
        }
        throw new NullPointerException();
    }

    private void clearCollectionIds() {
        this.collectionIds_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearNextPageToken() {
        this.nextPageToken_ = ListCollectionIdsResponse.getDefaultInstance().getNextPageToken();
    }

    private void ensureCollectionIdsIsMutable() {
        if (!this.collectionIds_.isModifiable()) {
            this.collectionIds_ = GeneratedMessageLite.mutableCopy(this.collectionIds_);
        }
    }

    public static ListCollectionIdsResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(ListCollectionIdsResponse listCollectionIdsResponse) {
        return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)listCollectionIdsResponse);
    }

    public static ListCollectionIdsResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ListCollectionIdsResponse)ListCollectionIdsResponse.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static ListCollectionIdsResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ListCollectionIdsResponse)ListCollectionIdsResponse.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ListCollectionIdsResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ListCollectionIdsResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static ListCollectionIdsResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ListCollectionIdsResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ListCollectionIdsResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ListCollectionIdsResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static ListCollectionIdsResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ListCollectionIdsResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ListCollectionIdsResponse parseFrom(InputStream inputStream) throws IOException {
        return (ListCollectionIdsResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static ListCollectionIdsResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ListCollectionIdsResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ListCollectionIdsResponse parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (ListCollectionIdsResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static ListCollectionIdsResponse parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ListCollectionIdsResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<ListCollectionIdsResponse> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setCollectionIds(int n, String string) {
        if (string != null) {
            this.ensureCollectionIdsIsMutable();
            this.collectionIds_.set(n, (Object)string);
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
            ListCollectionIdsResponse.checkByteStringIsUtf8((ByteString)byteString);
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
                Class<ListCollectionIdsResponse> class_ = ListCollectionIdsResponse.class;
                // MONITORENTER : com.google.firestore.v1.ListCollectionIdsResponse.class
                if (PARSER == null) {
                    PARSER = new GeneratedMessageLite.DefaultInstanceBasedParser((GeneratedMessageLite)DEFAULT_INSTANCE);
                }
                // MONITOREXIT : class_
                return PARSER;
            }
            case 6: {
                CodedInputStream codedInputStream = (CodedInputStream)object;
                (ExtensionRegistryLite)object2;
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
                        String string = codedInputStream.readStringRequireUtf8();
                        if (!this.collectionIds_.isModifiable()) {
                            this.collectionIds_ = GeneratedMessageLite.mutableCopy(this.collectionIds_);
                        }
                        this.collectionIds_.add((Object)string);
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
                ListCollectionIdsResponse listCollectionIdsResponse = (ListCollectionIdsResponse)((Object)object2);
                this.collectionIds_ = visitor.visitList(this.collectionIds_, listCollectionIdsResponse.collectionIds_);
                this.nextPageToken_ = visitor.visitString(true ^ this.nextPageToken_.isEmpty(), this.nextPageToken_, true ^ listCollectionIdsResponse.nextPageToken_.isEmpty(), listCollectionIdsResponse.nextPageToken_);
                if (visitor != GeneratedMessageLite.MergeFromVisitor.INSTANCE) return this;
                this.bitField0_ |= listCollectionIdsResponse.bitField0_;
                return this;
            }
            case 4: {
                return new Builder();
            }
            case 3: {
                this.collectionIds_.makeImmutable();
                return null;
            }
            case 2: {
                return DEFAULT_INSTANCE;
            }
            case 1: 
        }
        return new ListCollectionIdsResponse();
    }

    public String getCollectionIds(int n) {
        return (String)this.collectionIds_.get(n);
    }

    public ByteString getCollectionIdsBytes(int n) {
        return ByteString.copyFromUtf8((String)((String)this.collectionIds_.get(n)));
    }

    public int getCollectionIdsCount() {
        return this.collectionIds_.size();
    }

    public List<String> getCollectionIdsList() {
        return this.collectionIds_;
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
        for (int i = 0; i < this.collectionIds_.size(); ++i) {
            n2 += CodedOutputStream.computeStringSizeNoTag((String)((String)this.collectionIds_.get(i)));
        }
        int n3 = 0 + n2 + 1 * this.getCollectionIdsList().size();
        if (!this.nextPageToken_.isEmpty()) {
            n3 += CodedOutputStream.computeStringSize((int)2, (String)this.getNextPageToken());
        }
        this.memoizedSerializedSize = n3;
        return n3;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.collectionIds_.size(); ++i) {
            codedOutputStream.writeString(1, (String)this.collectionIds_.get(i));
        }
        if (!this.nextPageToken_.isEmpty()) {
            codedOutputStream.writeString(2, this.getNextPageToken());
        }
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<ListCollectionIdsResponse, Builder>
    implements ListCollectionIdsResponseOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder addAllCollectionIds(Iterable<String> iterable) {
            this.copyOnWrite();
            ((ListCollectionIdsResponse)this.instance).addAllCollectionIds((Iterable<String>)iterable);
            return this;
        }

        public Builder addCollectionIds(String string) {
            this.copyOnWrite();
            ((ListCollectionIdsResponse)this.instance).addCollectionIds(string);
            return this;
        }

        public Builder addCollectionIdsBytes(ByteString byteString) {
            this.copyOnWrite();
            ((ListCollectionIdsResponse)this.instance).addCollectionIdsBytes(byteString);
            return this;
        }

        public Builder clearCollectionIds() {
            this.copyOnWrite();
            ((ListCollectionIdsResponse)this.instance).clearCollectionIds();
            return this;
        }

        public Builder clearNextPageToken() {
            this.copyOnWrite();
            ((ListCollectionIdsResponse)this.instance).clearNextPageToken();
            return this;
        }

        public String getCollectionIds(int n) {
            return ((ListCollectionIdsResponse)this.instance).getCollectionIds(n);
        }

        public ByteString getCollectionIdsBytes(int n) {
            return ((ListCollectionIdsResponse)this.instance).getCollectionIdsBytes(n);
        }

        public int getCollectionIdsCount() {
            return ((ListCollectionIdsResponse)this.instance).getCollectionIdsCount();
        }

        public List<String> getCollectionIdsList() {
            return Collections.unmodifiableList(((ListCollectionIdsResponse)this.instance).getCollectionIdsList());
        }

        public String getNextPageToken() {
            return ((ListCollectionIdsResponse)this.instance).getNextPageToken();
        }

        public ByteString getNextPageTokenBytes() {
            return ((ListCollectionIdsResponse)this.instance).getNextPageTokenBytes();
        }

        public Builder setCollectionIds(int n, String string) {
            this.copyOnWrite();
            ((ListCollectionIdsResponse)this.instance).setCollectionIds(n, string);
            return this;
        }

        public Builder setNextPageToken(String string) {
            this.copyOnWrite();
            ((ListCollectionIdsResponse)this.instance).setNextPageToken(string);
            return this;
        }

        public Builder setNextPageTokenBytes(ByteString byteString) {
            this.copyOnWrite();
            ((ListCollectionIdsResponse)this.instance).setNextPageTokenBytes(byteString);
            return this;
        }
    }

}

