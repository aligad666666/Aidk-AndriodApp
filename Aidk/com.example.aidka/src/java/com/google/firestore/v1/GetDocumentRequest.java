/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.firestore.v1.GetDocumentRequest$1
 *  com.google.firestore.v1.GetDocumentRequest$ConsistencySelectorCase
 *  com.google.firestore.v1.GetDocumentRequestOrBuilder
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
 *  com.google.protobuf.Timestamp
 *  com.google.protobuf.Timestamp$Builder
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

import com.google.firestore.v1.DocumentMask;
import com.google.firestore.v1.GetDocumentRequest;
import com.google.firestore.v1.GetDocumentRequestOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;
import java.io.IOException;
import java.io.InputStream;

/*
 * Exception performing whole class analysis ignored.
 */
public final class GetDocumentRequest
extends GeneratedMessageLite<GetDocumentRequest, Builder>
implements GetDocumentRequestOrBuilder {
    private static final GetDocumentRequest DEFAULT_INSTANCE = new GetDocumentRequest();
    public static final int MASK_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<GetDocumentRequest> PARSER;
    public static final int READ_TIME_FIELD_NUMBER = 5;
    public static final int TRANSACTION_FIELD_NUMBER = 3;
    private int consistencySelectorCase_ = 0;
    private Object consistencySelector_;
    private DocumentMask mask_;
    private String name_ = "";

    static {
        DEFAULT_INSTANCE.makeImmutable();
    }

    private GetDocumentRequest() {
    }

    private void clearConsistencySelector() {
        this.consistencySelectorCase_ = 0;
        this.consistencySelector_ = null;
    }

    private void clearMask() {
        this.mask_ = null;
    }

    private void clearName() {
        this.name_ = GetDocumentRequest.getDefaultInstance().getName();
    }

    private void clearReadTime() {
        if (this.consistencySelectorCase_ == 5) {
            this.consistencySelectorCase_ = 0;
            this.consistencySelector_ = null;
        }
    }

    private void clearTransaction() {
        if (this.consistencySelectorCase_ == 3) {
            this.consistencySelectorCase_ = 0;
            this.consistencySelector_ = null;
        }
    }

    public static GetDocumentRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeMask(DocumentMask documentMask) {
        DocumentMask documentMask2 = this.mask_;
        if (documentMask2 != null && documentMask2 != DocumentMask.getDefaultInstance()) {
            this.mask_ = (DocumentMask)((DocumentMask.Builder)DocumentMask.newBuilder(this.mask_).mergeFrom((GeneratedMessageLite)documentMask)).buildPartial();
            return;
        }
        this.mask_ = documentMask;
    }

    private void mergeReadTime(Timestamp timestamp) {
        this.consistencySelector_ = this.consistencySelectorCase_ == 5 && this.consistencySelector_ != Timestamp.getDefaultInstance() ? ((Timestamp.Builder)Timestamp.newBuilder((Timestamp)((Timestamp)this.consistencySelector_)).mergeFrom((GeneratedMessageLite)timestamp)).buildPartial() : timestamp;
        this.consistencySelectorCase_ = 5;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(GetDocumentRequest getDocumentRequest) {
        return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)getDocumentRequest);
    }

    public static GetDocumentRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (GetDocumentRequest)GetDocumentRequest.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static GetDocumentRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GetDocumentRequest)GetDocumentRequest.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static GetDocumentRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (GetDocumentRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static GetDocumentRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (GetDocumentRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static GetDocumentRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (GetDocumentRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static GetDocumentRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GetDocumentRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static GetDocumentRequest parseFrom(InputStream inputStream) throws IOException {
        return (GetDocumentRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static GetDocumentRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (GetDocumentRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static GetDocumentRequest parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (GetDocumentRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static GetDocumentRequest parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (GetDocumentRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<GetDocumentRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
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

    private void setName(String string) {
        if (string != null) {
            this.name_ = string;
            return;
        }
        throw new NullPointerException();
    }

    private void setNameBytes(ByteString byteString) {
        if (byteString != null) {
            GetDocumentRequest.checkByteStringIsUtf8((ByteString)byteString);
            this.name_ = byteString.toStringUtf8();
            return;
        }
        throw new NullPointerException();
    }

    private void setReadTime(Timestamp.Builder builder) {
        this.consistencySelector_ = builder.build();
        this.consistencySelectorCase_ = 5;
    }

    private void setReadTime(Timestamp timestamp) {
        if (timestamp != null) {
            this.consistencySelector_ = timestamp;
            this.consistencySelectorCase_ = 5;
            return;
        }
        throw new NullPointerException();
    }

    private void setTransaction(ByteString byteString) {
        if (byteString != null) {
            this.consistencySelectorCase_ = 3;
            this.consistencySelector_ = byteString;
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
                Class<GetDocumentRequest> class_ = GetDocumentRequest.class;
                // MONITORENTER : com.google.firestore.v1.GetDocumentRequest.class
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
                                    if (n != 42) {
                                        if (codedInputStream.skipField(n)) continue;
                                        bl = true;
                                        continue;
                                    }
                                    int n2 = this.consistencySelectorCase_;
                                    Timestamp.Builder builder = null;
                                    if (n2 == 5) {
                                        builder = (Timestamp.Builder)((Timestamp)this.consistencySelector_).toBuilder();
                                    }
                                    this.consistencySelector_ = codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                    if (builder != null) {
                                        builder.mergeFrom((GeneratedMessageLite)((Timestamp)this.consistencySelector_));
                                        this.consistencySelector_ = builder.buildPartial();
                                    }
                                    this.consistencySelectorCase_ = 5;
                                    continue;
                                }
                                this.consistencySelectorCase_ = 3;
                                this.consistencySelector_ = codedInputStream.readBytes();
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
                GetDocumentRequest getDocumentRequest = (GetDocumentRequest)((Object)object2);
                boolean bl = this.name_.isEmpty();
                boolean bl2 = true;
                this.name_ = visitor.visitString(bl ^ bl2, this.name_, bl2 ^ getDocumentRequest.name_.isEmpty(), getDocumentRequest.name_);
                this.mask_ = (DocumentMask)visitor.visitMessage((MessageLite)this.mask_, (MessageLite)getDocumentRequest.mask_);
                boolean bl3 = 1.$SwitchMap$com$google$firestore$v1$GetDocumentRequest$ConsistencySelectorCase[getDocumentRequest.getConsistencySelectorCase().ordinal()];
                if (bl3 != bl2) {
                    if (!bl3) {
                        if (bl3) {
                            if (this.consistencySelectorCase_ == 0) {
                                bl2 = false;
                            }
                            visitor.visitOneofNotSet(bl2);
                        }
                    } else {
                        if (this.consistencySelectorCase_ != 5) {
                            bl2 = false;
                        }
                        this.consistencySelector_ = visitor.visitOneofMessage(bl2, this.consistencySelector_, getDocumentRequest.consistencySelector_);
                    }
                } else {
                    if (this.consistencySelectorCase_ != 3) {
                        bl2 = false;
                    }
                    this.consistencySelector_ = visitor.visitOneofByteString(bl2, this.consistencySelector_, getDocumentRequest.consistencySelector_);
                }
                if (visitor != GeneratedMessageLite.MergeFromVisitor.INSTANCE) return this;
                int n = getDocumentRequest.consistencySelectorCase_;
                if (n == 0) return this;
                this.consistencySelectorCase_ = n;
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
        return new GetDocumentRequest();
    }

    public ConsistencySelectorCase getConsistencySelectorCase() {
        return ConsistencySelectorCase.forNumber((int)this.consistencySelectorCase_);
    }

    public DocumentMask getMask() {
        DocumentMask documentMask = this.mask_;
        if (documentMask == null) {
            documentMask = DocumentMask.getDefaultInstance();
        }
        return documentMask;
    }

    public String getName() {
        return this.name_;
    }

    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8((String)this.name_);
    }

    public Timestamp getReadTime() {
        if (this.consistencySelectorCase_ == 5) {
            return (Timestamp)this.consistencySelector_;
        }
        return Timestamp.getDefaultInstance();
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
        if (this.mask_ != null) {
            n2 += CodedOutputStream.computeMessageSize((int)2, (MessageLite)this.getMask());
        }
        if (this.consistencySelectorCase_ == 3) {
            n2 += CodedOutputStream.computeBytesSize((int)3, (ByteString)((ByteString)this.consistencySelector_));
        }
        if (this.consistencySelectorCase_ == 5) {
            n2 += CodedOutputStream.computeMessageSize((int)5, (MessageLite)((Timestamp)this.consistencySelector_));
        }
        this.memoizedSerializedSize = n2;
        return n2;
    }

    public ByteString getTransaction() {
        if (this.consistencySelectorCase_ == 3) {
            return (ByteString)this.consistencySelector_;
        }
        return ByteString.EMPTY;
    }

    public boolean hasMask() {
        return this.mask_ != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.name_.isEmpty()) {
            codedOutputStream.writeString(1, this.getName());
        }
        if (this.mask_ != null) {
            codedOutputStream.writeMessage(2, (MessageLite)this.getMask());
        }
        if (this.consistencySelectorCase_ == 3) {
            codedOutputStream.writeBytes(3, (ByteString)this.consistencySelector_);
        }
        if (this.consistencySelectorCase_ == 5) {
            codedOutputStream.writeMessage(5, (MessageLite)((Timestamp)this.consistencySelector_));
        }
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<GetDocumentRequest, Builder>
    implements GetDocumentRequestOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder clearConsistencySelector() {
            this.copyOnWrite();
            ((GetDocumentRequest)this.instance).clearConsistencySelector();
            return this;
        }

        public Builder clearMask() {
            this.copyOnWrite();
            ((GetDocumentRequest)this.instance).clearMask();
            return this;
        }

        public Builder clearName() {
            this.copyOnWrite();
            ((GetDocumentRequest)this.instance).clearName();
            return this;
        }

        public Builder clearReadTime() {
            this.copyOnWrite();
            ((GetDocumentRequest)this.instance).clearReadTime();
            return this;
        }

        public Builder clearTransaction() {
            this.copyOnWrite();
            ((GetDocumentRequest)this.instance).clearTransaction();
            return this;
        }

        public ConsistencySelectorCase getConsistencySelectorCase() {
            return ((GetDocumentRequest)this.instance).getConsistencySelectorCase();
        }

        public DocumentMask getMask() {
            return ((GetDocumentRequest)this.instance).getMask();
        }

        public String getName() {
            return ((GetDocumentRequest)this.instance).getName();
        }

        public ByteString getNameBytes() {
            return ((GetDocumentRequest)this.instance).getNameBytes();
        }

        public Timestamp getReadTime() {
            return ((GetDocumentRequest)this.instance).getReadTime();
        }

        public ByteString getTransaction() {
            return ((GetDocumentRequest)this.instance).getTransaction();
        }

        public boolean hasMask() {
            return ((GetDocumentRequest)this.instance).hasMask();
        }

        public Builder mergeMask(DocumentMask documentMask) {
            this.copyOnWrite();
            ((GetDocumentRequest)this.instance).mergeMask(documentMask);
            return this;
        }

        public Builder mergeReadTime(Timestamp timestamp) {
            this.copyOnWrite();
            ((GetDocumentRequest)this.instance).mergeReadTime(timestamp);
            return this;
        }

        public Builder setMask(DocumentMask.Builder builder) {
            this.copyOnWrite();
            ((GetDocumentRequest)this.instance).setMask(builder);
            return this;
        }

        public Builder setMask(DocumentMask documentMask) {
            this.copyOnWrite();
            ((GetDocumentRequest)this.instance).setMask(documentMask);
            return this;
        }

        public Builder setName(String string) {
            this.copyOnWrite();
            ((GetDocumentRequest)this.instance).setName(string);
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            this.copyOnWrite();
            ((GetDocumentRequest)this.instance).setNameBytes(byteString);
            return this;
        }

        public Builder setReadTime(Timestamp.Builder builder) {
            this.copyOnWrite();
            ((GetDocumentRequest)this.instance).setReadTime(builder);
            return this;
        }

        public Builder setReadTime(Timestamp timestamp) {
            this.copyOnWrite();
            ((GetDocumentRequest)this.instance).setReadTime(timestamp);
            return this;
        }

        public Builder setTransaction(ByteString byteString) {
            this.copyOnWrite();
            ((GetDocumentRequest)this.instance).setTransaction(byteString);
            return this;
        }
    }

}

