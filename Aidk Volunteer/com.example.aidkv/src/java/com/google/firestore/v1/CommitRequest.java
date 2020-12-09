/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.firestore.v1.CommitRequest$1
 *  com.google.firestore.v1.CommitRequestOrBuilder
 *  com.google.firestore.v1.WriteOrBuilder
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

import com.google.firestore.v1.CommitRequest;
import com.google.firestore.v1.CommitRequestOrBuilder;
import com.google.firestore.v1.Write;
import com.google.firestore.v1.WriteOrBuilder;
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

public final class CommitRequest
extends GeneratedMessageLite<CommitRequest, Builder>
implements CommitRequestOrBuilder {
    public static final int DATABASE_FIELD_NUMBER = 1;
    private static final CommitRequest DEFAULT_INSTANCE = new CommitRequest();
    private static volatile Parser<CommitRequest> PARSER;
    public static final int TRANSACTION_FIELD_NUMBER = 3;
    public static final int WRITES_FIELD_NUMBER = 2;
    private int bitField0_;
    private String database_ = "";
    private ByteString transaction_ = ByteString.EMPTY;
    private Internal.ProtobufList<Write> writes_ = CommitRequest.emptyProtobufList();

    static {
        DEFAULT_INSTANCE.makeImmutable();
    }

    private CommitRequest() {
    }

    private void addAllWrites(Iterable<? extends Write> iterable) {
        this.ensureWritesIsMutable();
        AbstractMessageLite.addAll(iterable, this.writes_);
    }

    private void addWrites(int n, Write.Builder builder) {
        this.ensureWritesIsMutable();
        this.writes_.add(n, (Object)((Write)builder.build()));
    }

    private void addWrites(int n, Write write) {
        if (write != null) {
            this.ensureWritesIsMutable();
            this.writes_.add(n, (Object)write);
            return;
        }
        throw new NullPointerException();
    }

    private void addWrites(Write.Builder builder) {
        this.ensureWritesIsMutable();
        this.writes_.add((Object)((Write)builder.build()));
    }

    private void addWrites(Write write) {
        if (write != null) {
            this.ensureWritesIsMutable();
            this.writes_.add((Object)write);
            return;
        }
        throw new NullPointerException();
    }

    private void clearDatabase() {
        this.database_ = CommitRequest.getDefaultInstance().getDatabase();
    }

    private void clearTransaction() {
        this.transaction_ = CommitRequest.getDefaultInstance().getTransaction();
    }

    private void clearWrites() {
        this.writes_ = CommitRequest.emptyProtobufList();
    }

    private void ensureWritesIsMutable() {
        if (!this.writes_.isModifiable()) {
            this.writes_ = GeneratedMessageLite.mutableCopy(this.writes_);
        }
    }

    public static CommitRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(CommitRequest commitRequest) {
        return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)commitRequest);
    }

    public static CommitRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CommitRequest)CommitRequest.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static CommitRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CommitRequest)CommitRequest.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static CommitRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (CommitRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static CommitRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CommitRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static CommitRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (CommitRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static CommitRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CommitRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static CommitRequest parseFrom(InputStream inputStream) throws IOException {
        return (CommitRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static CommitRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CommitRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static CommitRequest parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (CommitRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static CommitRequest parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (CommitRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<CommitRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeWrites(int n) {
        this.ensureWritesIsMutable();
        this.writes_.remove(n);
    }

    private void setDatabase(String string) {
        if (string != null) {
            this.database_ = string;
            return;
        }
        throw new NullPointerException();
    }

    private void setDatabaseBytes(ByteString byteString) {
        if (byteString != null) {
            CommitRequest.checkByteStringIsUtf8((ByteString)byteString);
            this.database_ = byteString.toStringUtf8();
            return;
        }
        throw new NullPointerException();
    }

    private void setTransaction(ByteString byteString) {
        if (byteString != null) {
            this.transaction_ = byteString;
            return;
        }
        throw new NullPointerException();
    }

    private void setWrites(int n, Write.Builder builder) {
        this.ensureWritesIsMutable();
        this.writes_.set(n, (Object)((Write)builder.build()));
    }

    private void setWrites(int n, Write write) {
        if (write != null) {
            this.ensureWritesIsMutable();
            this.writes_.set(n, (Object)write);
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
                Class<CommitRequest> class_ = CommitRequest.class;
                // MONITORENTER : com.google.firestore.v1.CommitRequest.class
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
                                    if (codedInputStream.skipField(n)) continue;
                                    bl = true;
                                    continue;
                                }
                                this.transaction_ = codedInputStream.readBytes();
                                continue;
                            }
                            if (!this.writes_.isModifiable()) {
                                this.writes_ = GeneratedMessageLite.mutableCopy(this.writes_);
                            }
                            this.writes_.add((Object)((Write)codedInputStream.readMessage(Write.parser(), extensionRegistryLite)));
                            continue;
                        }
                        this.database_ = codedInputStream.readStringRequireUtf8();
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
                CommitRequest commitRequest = (CommitRequest)((Object)object2);
                boolean bl = this.database_.isEmpty();
                boolean bl2 = true;
                this.database_ = visitor.visitString(bl ^ bl2, this.database_, bl2 ^ commitRequest.database_.isEmpty(), commitRequest.database_);
                this.writes_ = visitor.visitList(this.writes_, commitRequest.writes_);
                boolean bl3 = this.transaction_ != ByteString.EMPTY;
                ByteString byteString = this.transaction_;
                if (commitRequest.transaction_ == ByteString.EMPTY) {
                    bl2 = false;
                }
                this.transaction_ = visitor.visitByteString(bl3, byteString, bl2, commitRequest.transaction_);
                if (visitor != GeneratedMessageLite.MergeFromVisitor.INSTANCE) return this;
                this.bitField0_ |= commitRequest.bitField0_;
                return this;
            }
            case 4: {
                return new Builder();
            }
            case 3: {
                this.writes_.makeImmutable();
                return null;
            }
            case 2: {
                return DEFAULT_INSTANCE;
            }
            case 1: 
        }
        return new CommitRequest();
    }

    public String getDatabase() {
        return this.database_;
    }

    public ByteString getDatabaseBytes() {
        return ByteString.copyFromUtf8((String)this.database_);
    }

    public int getSerializedSize() {
        int n = this.memoizedSerializedSize;
        if (n != -1) {
            return n;
        }
        boolean bl = this.database_.isEmpty();
        int n2 = 0;
        if (!bl) {
            n2 = 0 + CodedOutputStream.computeStringSize((int)1, (String)this.getDatabase());
        }
        for (int i = 0; i < this.writes_.size(); ++i) {
            n2 += CodedOutputStream.computeMessageSize((int)2, (MessageLite)((MessageLite)this.writes_.get(i)));
        }
        if (!this.transaction_.isEmpty()) {
            n2 += CodedOutputStream.computeBytesSize((int)3, (ByteString)this.transaction_);
        }
        this.memoizedSerializedSize = n2;
        return n2;
    }

    public ByteString getTransaction() {
        return this.transaction_;
    }

    public Write getWrites(int n) {
        return (Write)((Object)this.writes_.get(n));
    }

    public int getWritesCount() {
        return this.writes_.size();
    }

    public List<Write> getWritesList() {
        return this.writes_;
    }

    public WriteOrBuilder getWritesOrBuilder(int n) {
        return (WriteOrBuilder)this.writes_.get(n);
    }

    public List<? extends WriteOrBuilder> getWritesOrBuilderList() {
        return this.writes_;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.database_.isEmpty()) {
            codedOutputStream.writeString(1, this.getDatabase());
        }
        for (int i = 0; i < this.writes_.size(); ++i) {
            codedOutputStream.writeMessage(2, (MessageLite)this.writes_.get(i));
        }
        if (!this.transaction_.isEmpty()) {
            codedOutputStream.writeBytes(3, this.transaction_);
        }
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<CommitRequest, Builder>
    implements CommitRequestOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder addAllWrites(Iterable<? extends Write> iterable) {
            this.copyOnWrite();
            ((CommitRequest)this.instance).addAllWrites((Iterable<? extends Write>)iterable);
            return this;
        }

        public Builder addWrites(int n, Write.Builder builder) {
            this.copyOnWrite();
            ((CommitRequest)this.instance).addWrites(n, builder);
            return this;
        }

        public Builder addWrites(int n, Write write) {
            this.copyOnWrite();
            ((CommitRequest)this.instance).addWrites(n, write);
            return this;
        }

        public Builder addWrites(Write.Builder builder) {
            this.copyOnWrite();
            ((CommitRequest)this.instance).addWrites(builder);
            return this;
        }

        public Builder addWrites(Write write) {
            this.copyOnWrite();
            ((CommitRequest)this.instance).addWrites(write);
            return this;
        }

        public Builder clearDatabase() {
            this.copyOnWrite();
            ((CommitRequest)this.instance).clearDatabase();
            return this;
        }

        public Builder clearTransaction() {
            this.copyOnWrite();
            ((CommitRequest)this.instance).clearTransaction();
            return this;
        }

        public Builder clearWrites() {
            this.copyOnWrite();
            ((CommitRequest)this.instance).clearWrites();
            return this;
        }

        public String getDatabase() {
            return ((CommitRequest)this.instance).getDatabase();
        }

        public ByteString getDatabaseBytes() {
            return ((CommitRequest)this.instance).getDatabaseBytes();
        }

        public ByteString getTransaction() {
            return ((CommitRequest)this.instance).getTransaction();
        }

        public Write getWrites(int n) {
            return ((CommitRequest)this.instance).getWrites(n);
        }

        public int getWritesCount() {
            return ((CommitRequest)this.instance).getWritesCount();
        }

        public List<Write> getWritesList() {
            return Collections.unmodifiableList(((CommitRequest)this.instance).getWritesList());
        }

        public Builder removeWrites(int n) {
            this.copyOnWrite();
            ((CommitRequest)this.instance).removeWrites(n);
            return this;
        }

        public Builder setDatabase(String string) {
            this.copyOnWrite();
            ((CommitRequest)this.instance).setDatabase(string);
            return this;
        }

        public Builder setDatabaseBytes(ByteString byteString) {
            this.copyOnWrite();
            ((CommitRequest)this.instance).setDatabaseBytes(byteString);
            return this;
        }

        public Builder setTransaction(ByteString byteString) {
            this.copyOnWrite();
            ((CommitRequest)this.instance).setTransaction(byteString);
            return this;
        }

        public Builder setWrites(int n, Write.Builder builder) {
            this.copyOnWrite();
            ((CommitRequest)this.instance).setWrites(n, builder);
            return this;
        }

        public Builder setWrites(int n, Write write) {
            this.copyOnWrite();
            ((CommitRequest)this.instance).setWrites(n, write);
            return this;
        }
    }

}

