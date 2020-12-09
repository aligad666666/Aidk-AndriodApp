/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.firestore.v1.BeginTransactionRequest$1
 *  com.google.firestore.v1.BeginTransactionRequestOrBuilder
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

import com.google.firestore.v1.BeginTransactionRequest;
import com.google.firestore.v1.BeginTransactionRequestOrBuilder;
import com.google.firestore.v1.TransactionOptions;
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

public final class BeginTransactionRequest
extends GeneratedMessageLite<BeginTransactionRequest, Builder>
implements BeginTransactionRequestOrBuilder {
    public static final int DATABASE_FIELD_NUMBER = 1;
    private static final BeginTransactionRequest DEFAULT_INSTANCE = new BeginTransactionRequest();
    public static final int OPTIONS_FIELD_NUMBER = 2;
    private static volatile Parser<BeginTransactionRequest> PARSER;
    private String database_ = "";
    private TransactionOptions options_;

    static {
        DEFAULT_INSTANCE.makeImmutable();
    }

    private BeginTransactionRequest() {
    }

    private void clearDatabase() {
        this.database_ = BeginTransactionRequest.getDefaultInstance().getDatabase();
    }

    private void clearOptions() {
        this.options_ = null;
    }

    public static BeginTransactionRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeOptions(TransactionOptions transactionOptions) {
        TransactionOptions transactionOptions2 = this.options_;
        if (transactionOptions2 != null && transactionOptions2 != TransactionOptions.getDefaultInstance()) {
            this.options_ = (TransactionOptions)((TransactionOptions.Builder)TransactionOptions.newBuilder(this.options_).mergeFrom((GeneratedMessageLite)transactionOptions)).buildPartial();
            return;
        }
        this.options_ = transactionOptions;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(BeginTransactionRequest beginTransactionRequest) {
        return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)beginTransactionRequest);
    }

    public static BeginTransactionRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (BeginTransactionRequest)BeginTransactionRequest.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static BeginTransactionRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BeginTransactionRequest)BeginTransactionRequest.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static BeginTransactionRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (BeginTransactionRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static BeginTransactionRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BeginTransactionRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static BeginTransactionRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (BeginTransactionRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static BeginTransactionRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BeginTransactionRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static BeginTransactionRequest parseFrom(InputStream inputStream) throws IOException {
        return (BeginTransactionRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static BeginTransactionRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BeginTransactionRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static BeginTransactionRequest parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (BeginTransactionRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static BeginTransactionRequest parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BeginTransactionRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<BeginTransactionRequest> parser() {
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
            BeginTransactionRequest.checkByteStringIsUtf8((ByteString)byteString);
            this.database_ = byteString.toStringUtf8();
            return;
        }
        throw new NullPointerException();
    }

    private void setOptions(TransactionOptions.Builder builder) {
        this.options_ = (TransactionOptions)builder.build();
    }

    private void setOptions(TransactionOptions transactionOptions) {
        if (transactionOptions != null) {
            this.options_ = transactionOptions;
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
                Class<BeginTransactionRequest> class_ = BeginTransactionRequest.class;
                // MONITORENTER : com.google.firestore.v1.BeginTransactionRequest.class
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
                            TransactionOptions transactionOptions = this.options_;
                            TransactionOptions.Builder builder = null;
                            if (transactionOptions != null) {
                                builder = (TransactionOptions.Builder)this.options_.toBuilder();
                            }
                            this.options_ = (TransactionOptions)codedInputStream.readMessage(TransactionOptions.parser(), extensionRegistryLite);
                            if (builder == null) continue;
                            builder.mergeFrom((GeneratedMessageLite)this.options_);
                            this.options_ = (TransactionOptions)builder.buildPartial();
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
                BeginTransactionRequest beginTransactionRequest = (BeginTransactionRequest)((Object)object2);
                this.database_ = visitor.visitString(true ^ this.database_.isEmpty(), this.database_, true ^ beginTransactionRequest.database_.isEmpty(), beginTransactionRequest.database_);
                this.options_ = (TransactionOptions)visitor.visitMessage((MessageLite)this.options_, (MessageLite)beginTransactionRequest.options_);
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
        return new BeginTransactionRequest();
    }

    public String getDatabase() {
        return this.database_;
    }

    public ByteString getDatabaseBytes() {
        return ByteString.copyFromUtf8((String)this.database_);
    }

    public TransactionOptions getOptions() {
        TransactionOptions transactionOptions = this.options_;
        if (transactionOptions == null) {
            transactionOptions = TransactionOptions.getDefaultInstance();
        }
        return transactionOptions;
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
        if (this.options_ != null) {
            n2 += CodedOutputStream.computeMessageSize((int)2, (MessageLite)this.getOptions());
        }
        this.memoizedSerializedSize = n2;
        return n2;
    }

    public boolean hasOptions() {
        return this.options_ != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.database_.isEmpty()) {
            codedOutputStream.writeString(1, this.getDatabase());
        }
        if (this.options_ != null) {
            codedOutputStream.writeMessage(2, (MessageLite)this.getOptions());
        }
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<BeginTransactionRequest, Builder>
    implements BeginTransactionRequestOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder clearDatabase() {
            this.copyOnWrite();
            ((BeginTransactionRequest)this.instance).clearDatabase();
            return this;
        }

        public Builder clearOptions() {
            this.copyOnWrite();
            ((BeginTransactionRequest)this.instance).clearOptions();
            return this;
        }

        public String getDatabase() {
            return ((BeginTransactionRequest)this.instance).getDatabase();
        }

        public ByteString getDatabaseBytes() {
            return ((BeginTransactionRequest)this.instance).getDatabaseBytes();
        }

        public TransactionOptions getOptions() {
            return ((BeginTransactionRequest)this.instance).getOptions();
        }

        public boolean hasOptions() {
            return ((BeginTransactionRequest)this.instance).hasOptions();
        }

        public Builder mergeOptions(TransactionOptions transactionOptions) {
            this.copyOnWrite();
            ((BeginTransactionRequest)this.instance).mergeOptions(transactionOptions);
            return this;
        }

        public Builder setDatabase(String string) {
            this.copyOnWrite();
            ((BeginTransactionRequest)this.instance).setDatabase(string);
            return this;
        }

        public Builder setDatabaseBytes(ByteString byteString) {
            this.copyOnWrite();
            ((BeginTransactionRequest)this.instance).setDatabaseBytes(byteString);
            return this;
        }

        public Builder setOptions(TransactionOptions.Builder builder) {
            this.copyOnWrite();
            ((BeginTransactionRequest)this.instance).setOptions(builder);
            return this;
        }

        public Builder setOptions(TransactionOptions transactionOptions) {
            this.copyOnWrite();
            ((BeginTransactionRequest)this.instance).setOptions(transactionOptions);
            return this;
        }
    }

}

