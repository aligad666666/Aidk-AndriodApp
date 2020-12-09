/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.firestore.v1.BeginTransactionResponse$1
 *  com.google.firestore.v1.BeginTransactionResponseOrBuilder
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

import com.google.firestore.v1.BeginTransactionResponse;
import com.google.firestore.v1.BeginTransactionResponseOrBuilder;
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

public final class BeginTransactionResponse
extends GeneratedMessageLite<BeginTransactionResponse, Builder>
implements BeginTransactionResponseOrBuilder {
    private static final BeginTransactionResponse DEFAULT_INSTANCE = new BeginTransactionResponse();
    private static volatile Parser<BeginTransactionResponse> PARSER;
    public static final int TRANSACTION_FIELD_NUMBER = 1;
    private ByteString transaction_ = ByteString.EMPTY;

    static {
        DEFAULT_INSTANCE.makeImmutable();
    }

    private BeginTransactionResponse() {
    }

    private void clearTransaction() {
        this.transaction_ = BeginTransactionResponse.getDefaultInstance().getTransaction();
    }

    public static BeginTransactionResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(BeginTransactionResponse beginTransactionResponse) {
        return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)beginTransactionResponse);
    }

    public static BeginTransactionResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (BeginTransactionResponse)BeginTransactionResponse.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static BeginTransactionResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BeginTransactionResponse)BeginTransactionResponse.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static BeginTransactionResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (BeginTransactionResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static BeginTransactionResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BeginTransactionResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static BeginTransactionResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (BeginTransactionResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static BeginTransactionResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BeginTransactionResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static BeginTransactionResponse parseFrom(InputStream inputStream) throws IOException {
        return (BeginTransactionResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static BeginTransactionResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BeginTransactionResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static BeginTransactionResponse parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (BeginTransactionResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static BeginTransactionResponse parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BeginTransactionResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<BeginTransactionResponse> parser() {
        return DEFAULT_INSTANCE.getParserForType();
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
                Class<BeginTransactionResponse> class_ = BeginTransactionResponse.class;
                // MONITORENTER : com.google.firestore.v1.BeginTransactionResponse.class
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
                            if (codedInputStream.skipField(n)) continue;
                            bl = true;
                            continue;
                        }
                        this.transaction_ = codedInputStream.readBytes();
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
                BeginTransactionResponse beginTransactionResponse = (BeginTransactionResponse)((Object)object2);
                ByteString byteString = this.transaction_;
                ByteString byteString2 = ByteString.EMPTY;
                boolean bl = true;
                boolean bl2 = byteString != byteString2;
                ByteString byteString3 = this.transaction_;
                if (beginTransactionResponse.transaction_ == ByteString.EMPTY) {
                    bl = false;
                }
                this.transaction_ = visitor.visitByteString(bl2, byteString3, bl, beginTransactionResponse.transaction_);
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
        return new BeginTransactionResponse();
    }

    public int getSerializedSize() {
        int n = this.memoizedSerializedSize;
        if (n != -1) {
            return n;
        }
        boolean bl = this.transaction_.isEmpty();
        int n2 = 0;
        if (!bl) {
            n2 = 0 + CodedOutputStream.computeBytesSize((int)1, (ByteString)this.transaction_);
        }
        this.memoizedSerializedSize = n2;
        return n2;
    }

    public ByteString getTransaction() {
        return this.transaction_;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.transaction_.isEmpty()) {
            codedOutputStream.writeBytes(1, this.transaction_);
        }
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<BeginTransactionResponse, Builder>
    implements BeginTransactionResponseOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder clearTransaction() {
            this.copyOnWrite();
            ((BeginTransactionResponse)this.instance).clearTransaction();
            return this;
        }

        public ByteString getTransaction() {
            return ((BeginTransactionResponse)this.instance).getTransaction();
        }

        public Builder setTransaction(ByteString byteString) {
            this.copyOnWrite();
            ((BeginTransactionResponse)this.instance).setTransaction(byteString);
            return this;
        }
    }

}

