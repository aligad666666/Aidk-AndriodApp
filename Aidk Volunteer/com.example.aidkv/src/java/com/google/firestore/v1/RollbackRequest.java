/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.firestore.v1.RollbackRequest$1
 *  com.google.firestore.v1.RollbackRequestOrBuilder
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

import com.google.firestore.v1.RollbackRequest;
import com.google.firestore.v1.RollbackRequestOrBuilder;
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

public final class RollbackRequest
extends GeneratedMessageLite<RollbackRequest, Builder>
implements RollbackRequestOrBuilder {
    public static final int DATABASE_FIELD_NUMBER = 1;
    private static final RollbackRequest DEFAULT_INSTANCE = new RollbackRequest();
    private static volatile Parser<RollbackRequest> PARSER;
    public static final int TRANSACTION_FIELD_NUMBER = 2;
    private String database_ = "";
    private ByteString transaction_ = ByteString.EMPTY;

    static {
        DEFAULT_INSTANCE.makeImmutable();
    }

    private RollbackRequest() {
    }

    private void clearDatabase() {
        this.database_ = RollbackRequest.getDefaultInstance().getDatabase();
    }

    private void clearTransaction() {
        this.transaction_ = RollbackRequest.getDefaultInstance().getTransaction();
    }

    public static RollbackRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(RollbackRequest rollbackRequest) {
        return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)rollbackRequest);
    }

    public static RollbackRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (RollbackRequest)RollbackRequest.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static RollbackRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RollbackRequest)RollbackRequest.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static RollbackRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (RollbackRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static RollbackRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RollbackRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static RollbackRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (RollbackRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static RollbackRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RollbackRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static RollbackRequest parseFrom(InputStream inputStream) throws IOException {
        return (RollbackRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static RollbackRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (RollbackRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static RollbackRequest parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (RollbackRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static RollbackRequest parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (RollbackRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<RollbackRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
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
            RollbackRequest.checkByteStringIsUtf8((ByteString)byteString);
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
                Class<RollbackRequest> class_ = RollbackRequest.class;
                // MONITORENTER : com.google.firestore.v1.RollbackRequest.class
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
                            this.transaction_ = codedInputStream.readBytes();
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
                RollbackRequest rollbackRequest = (RollbackRequest)((Object)object2);
                boolean bl = this.database_.isEmpty();
                boolean bl2 = true;
                this.database_ = visitor.visitString(bl ^ bl2, this.database_, bl2 ^ rollbackRequest.database_.isEmpty(), rollbackRequest.database_);
                boolean bl3 = this.transaction_ != ByteString.EMPTY;
                ByteString byteString = this.transaction_;
                if (rollbackRequest.transaction_ == ByteString.EMPTY) {
                    bl2 = false;
                }
                this.transaction_ = visitor.visitByteString(bl3, byteString, bl2, rollbackRequest.transaction_);
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
        return new RollbackRequest();
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
        if (!this.transaction_.isEmpty()) {
            n2 += CodedOutputStream.computeBytesSize((int)2, (ByteString)this.transaction_);
        }
        this.memoizedSerializedSize = n2;
        return n2;
    }

    public ByteString getTransaction() {
        return this.transaction_;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.database_.isEmpty()) {
            codedOutputStream.writeString(1, this.getDatabase());
        }
        if (!this.transaction_.isEmpty()) {
            codedOutputStream.writeBytes(2, this.transaction_);
        }
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<RollbackRequest, Builder>
    implements RollbackRequestOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder clearDatabase() {
            this.copyOnWrite();
            ((RollbackRequest)this.instance).clearDatabase();
            return this;
        }

        public Builder clearTransaction() {
            this.copyOnWrite();
            ((RollbackRequest)this.instance).clearTransaction();
            return this;
        }

        public String getDatabase() {
            return ((RollbackRequest)this.instance).getDatabase();
        }

        public ByteString getDatabaseBytes() {
            return ((RollbackRequest)this.instance).getDatabaseBytes();
        }

        public ByteString getTransaction() {
            return ((RollbackRequest)this.instance).getTransaction();
        }

        public Builder setDatabase(String string) {
            this.copyOnWrite();
            ((RollbackRequest)this.instance).setDatabase(string);
            return this;
        }

        public Builder setDatabaseBytes(ByteString byteString) {
            this.copyOnWrite();
            ((RollbackRequest)this.instance).setDatabaseBytes(byteString);
            return this;
        }

        public Builder setTransaction(ByteString byteString) {
            this.copyOnWrite();
            ((RollbackRequest)this.instance).setTransaction(byteString);
            return this;
        }
    }

}

