/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.longrunning.ListOperationsResponse$1
 *  com.google.longrunning.ListOperationsResponseOrBuilder
 *  com.google.longrunning.OperationOrBuilder
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
package com.google.longrunning;

import com.google.longrunning.ListOperationsResponse;
import com.google.longrunning.ListOperationsResponseOrBuilder;
import com.google.longrunning.Operation;
import com.google.longrunning.OperationOrBuilder;
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

public final class ListOperationsResponse
extends GeneratedMessageLite<ListOperationsResponse, Builder>
implements ListOperationsResponseOrBuilder {
    private static final ListOperationsResponse DEFAULT_INSTANCE = new ListOperationsResponse();
    public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
    public static final int OPERATIONS_FIELD_NUMBER = 1;
    private static volatile Parser<ListOperationsResponse> PARSER;
    private int bitField0_;
    private String nextPageToken_ = "";
    private Internal.ProtobufList<Operation> operations_ = ListOperationsResponse.emptyProtobufList();

    static {
        DEFAULT_INSTANCE.makeImmutable();
    }

    private ListOperationsResponse() {
    }

    private void addAllOperations(Iterable<? extends Operation> iterable) {
        this.ensureOperationsIsMutable();
        AbstractMessageLite.addAll(iterable, this.operations_);
    }

    private void addOperations(int n, Operation.Builder builder) {
        this.ensureOperationsIsMutable();
        this.operations_.add(n, (Object)((Operation)builder.build()));
    }

    private void addOperations(int n, Operation operation) {
        if (operation != null) {
            this.ensureOperationsIsMutable();
            this.operations_.add(n, (Object)operation);
            return;
        }
        throw new NullPointerException();
    }

    private void addOperations(Operation.Builder builder) {
        this.ensureOperationsIsMutable();
        this.operations_.add((Object)((Operation)builder.build()));
    }

    private void addOperations(Operation operation) {
        if (operation != null) {
            this.ensureOperationsIsMutable();
            this.operations_.add((Object)operation);
            return;
        }
        throw new NullPointerException();
    }

    private void clearNextPageToken() {
        this.nextPageToken_ = ListOperationsResponse.getDefaultInstance().getNextPageToken();
    }

    private void clearOperations() {
        this.operations_ = ListOperationsResponse.emptyProtobufList();
    }

    private void ensureOperationsIsMutable() {
        if (!this.operations_.isModifiable()) {
            this.operations_ = GeneratedMessageLite.mutableCopy(this.operations_);
        }
    }

    public static ListOperationsResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(ListOperationsResponse listOperationsResponse) {
        return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)listOperationsResponse);
    }

    public static ListOperationsResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ListOperationsResponse)ListOperationsResponse.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static ListOperationsResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ListOperationsResponse)ListOperationsResponse.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ListOperationsResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ListOperationsResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static ListOperationsResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ListOperationsResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ListOperationsResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ListOperationsResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static ListOperationsResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ListOperationsResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ListOperationsResponse parseFrom(InputStream inputStream) throws IOException {
        return (ListOperationsResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static ListOperationsResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ListOperationsResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ListOperationsResponse parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (ListOperationsResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static ListOperationsResponse parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ListOperationsResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<ListOperationsResponse> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeOperations(int n) {
        this.ensureOperationsIsMutable();
        this.operations_.remove(n);
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
            ListOperationsResponse.checkByteStringIsUtf8((ByteString)byteString);
            this.nextPageToken_ = byteString.toStringUtf8();
            return;
        }
        throw new NullPointerException();
    }

    private void setOperations(int n, Operation.Builder builder) {
        this.ensureOperationsIsMutable();
        this.operations_.set(n, (Object)((Operation)builder.build()));
    }

    private void setOperations(int n, Operation operation) {
        if (operation != null) {
            this.ensureOperationsIsMutable();
            this.operations_.set(n, (Object)operation);
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
                Class<ListOperationsResponse> class_ = ListOperationsResponse.class;
                // MONITORENTER : com.google.longrunning.ListOperationsResponse.class
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
                        if (!this.operations_.isModifiable()) {
                            this.operations_ = GeneratedMessageLite.mutableCopy(this.operations_);
                        }
                        this.operations_.add((Object)((Operation)codedInputStream.readMessage(Operation.parser(), extensionRegistryLite)));
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
                ListOperationsResponse listOperationsResponse = (ListOperationsResponse)((Object)object2);
                this.operations_ = visitor.visitList(this.operations_, listOperationsResponse.operations_);
                this.nextPageToken_ = visitor.visitString(true ^ this.nextPageToken_.isEmpty(), this.nextPageToken_, true ^ listOperationsResponse.nextPageToken_.isEmpty(), listOperationsResponse.nextPageToken_);
                if (visitor != GeneratedMessageLite.MergeFromVisitor.INSTANCE) return this;
                this.bitField0_ |= listOperationsResponse.bitField0_;
                return this;
            }
            case 4: {
                return new Builder();
            }
            case 3: {
                this.operations_.makeImmutable();
                return null;
            }
            case 2: {
                return DEFAULT_INSTANCE;
            }
            case 1: 
        }
        return new ListOperationsResponse();
    }

    public String getNextPageToken() {
        return this.nextPageToken_;
    }

    public ByteString getNextPageTokenBytes() {
        return ByteString.copyFromUtf8((String)this.nextPageToken_);
    }

    public Operation getOperations(int n) {
        return (Operation)((Object)this.operations_.get(n));
    }

    public int getOperationsCount() {
        return this.operations_.size();
    }

    public List<Operation> getOperationsList() {
        return this.operations_;
    }

    public OperationOrBuilder getOperationsOrBuilder(int n) {
        return (OperationOrBuilder)this.operations_.get(n);
    }

    public List<? extends OperationOrBuilder> getOperationsOrBuilderList() {
        return this.operations_;
    }

    public int getSerializedSize() {
        int n = this.memoizedSerializedSize;
        if (n != -1) {
            return n;
        }
        int n2 = 0;
        for (int i = 0; i < this.operations_.size(); ++i) {
            n2 += CodedOutputStream.computeMessageSize((int)1, (MessageLite)((MessageLite)this.operations_.get(i)));
        }
        if (!this.nextPageToken_.isEmpty()) {
            n2 += CodedOutputStream.computeStringSize((int)2, (String)this.getNextPageToken());
        }
        this.memoizedSerializedSize = n2;
        return n2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.operations_.size(); ++i) {
            codedOutputStream.writeMessage(1, (MessageLite)this.operations_.get(i));
        }
        if (!this.nextPageToken_.isEmpty()) {
            codedOutputStream.writeString(2, this.getNextPageToken());
        }
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<ListOperationsResponse, Builder>
    implements ListOperationsResponseOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder addAllOperations(Iterable<? extends Operation> iterable) {
            this.copyOnWrite();
            ((ListOperationsResponse)this.instance).addAllOperations((Iterable<? extends Operation>)iterable);
            return this;
        }

        public Builder addOperations(int n, Operation.Builder builder) {
            this.copyOnWrite();
            ((ListOperationsResponse)this.instance).addOperations(n, builder);
            return this;
        }

        public Builder addOperations(int n, Operation operation) {
            this.copyOnWrite();
            ((ListOperationsResponse)this.instance).addOperations(n, operation);
            return this;
        }

        public Builder addOperations(Operation.Builder builder) {
            this.copyOnWrite();
            ((ListOperationsResponse)this.instance).addOperations(builder);
            return this;
        }

        public Builder addOperations(Operation operation) {
            this.copyOnWrite();
            ((ListOperationsResponse)this.instance).addOperations(operation);
            return this;
        }

        public Builder clearNextPageToken() {
            this.copyOnWrite();
            ((ListOperationsResponse)this.instance).clearNextPageToken();
            return this;
        }

        public Builder clearOperations() {
            this.copyOnWrite();
            ((ListOperationsResponse)this.instance).clearOperations();
            return this;
        }

        public String getNextPageToken() {
            return ((ListOperationsResponse)this.instance).getNextPageToken();
        }

        public ByteString getNextPageTokenBytes() {
            return ((ListOperationsResponse)this.instance).getNextPageTokenBytes();
        }

        public Operation getOperations(int n) {
            return ((ListOperationsResponse)this.instance).getOperations(n);
        }

        public int getOperationsCount() {
            return ((ListOperationsResponse)this.instance).getOperationsCount();
        }

        public List<Operation> getOperationsList() {
            return Collections.unmodifiableList(((ListOperationsResponse)this.instance).getOperationsList());
        }

        public Builder removeOperations(int n) {
            this.copyOnWrite();
            ((ListOperationsResponse)this.instance).removeOperations(n);
            return this;
        }

        public Builder setNextPageToken(String string) {
            this.copyOnWrite();
            ((ListOperationsResponse)this.instance).setNextPageToken(string);
            return this;
        }

        public Builder setNextPageTokenBytes(ByteString byteString) {
            this.copyOnWrite();
            ((ListOperationsResponse)this.instance).setNextPageTokenBytes(byteString);
            return this;
        }

        public Builder setOperations(int n, Operation.Builder builder) {
            this.copyOnWrite();
            ((ListOperationsResponse)this.instance).setOperations(n, builder);
            return this;
        }

        public Builder setOperations(int n, Operation operation) {
            this.copyOnWrite();
            ((ListOperationsResponse)this.instance).setOperations(n, operation);
            return this;
        }
    }

}

