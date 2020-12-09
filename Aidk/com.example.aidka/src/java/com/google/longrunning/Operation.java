/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.longrunning.Operation$1
 *  com.google.longrunning.Operation$ResultCase
 *  com.google.longrunning.OperationOrBuilder
 *  com.google.protobuf.Any
 *  com.google.protobuf.Any$Builder
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
package com.google.longrunning;

import com.google.longrunning.Operation;
import com.google.longrunning.OperationOrBuilder;
import com.google.protobuf.Any;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.rpc.Status;
import java.io.IOException;
import java.io.InputStream;

/*
 * Exception performing whole class analysis ignored.
 */
public final class Operation
extends GeneratedMessageLite<Operation, Builder>
implements OperationOrBuilder {
    private static final Operation DEFAULT_INSTANCE = new Operation();
    public static final int DONE_FIELD_NUMBER = 3;
    public static final int ERROR_FIELD_NUMBER = 4;
    public static final int METADATA_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<Operation> PARSER;
    public static final int RESPONSE_FIELD_NUMBER = 5;
    private boolean done_;
    private Any metadata_;
    private String name_ = "";
    private int resultCase_ = 0;
    private Object result_;

    static {
        DEFAULT_INSTANCE.makeImmutable();
    }

    private Operation() {
    }

    private void clearDone() {
        this.done_ = false;
    }

    private void clearError() {
        if (this.resultCase_ == 4) {
            this.resultCase_ = 0;
            this.result_ = null;
        }
    }

    private void clearMetadata() {
        this.metadata_ = null;
    }

    private void clearName() {
        this.name_ = Operation.getDefaultInstance().getName();
    }

    private void clearResponse() {
        if (this.resultCase_ == 5) {
            this.resultCase_ = 0;
            this.result_ = null;
        }
    }

    private void clearResult() {
        this.resultCase_ = 0;
        this.result_ = null;
    }

    public static Operation getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeError(Status status) {
        this.result_ = this.resultCase_ == 4 && this.result_ != Status.getDefaultInstance() ? ((Status.Builder)Status.newBuilder((Status)((Object)this.result_)).mergeFrom((GeneratedMessageLite)status)).buildPartial() : status;
        this.resultCase_ = 4;
    }

    private void mergeMetadata(Any any) {
        Any any2 = this.metadata_;
        if (any2 != null && any2 != Any.getDefaultInstance()) {
            this.metadata_ = (Any)((Any.Builder)Any.newBuilder((Any)this.metadata_).mergeFrom((GeneratedMessageLite)any)).buildPartial();
            return;
        }
        this.metadata_ = any;
    }

    private void mergeResponse(Any any) {
        this.result_ = this.resultCase_ == 5 && this.result_ != Any.getDefaultInstance() ? ((Any.Builder)Any.newBuilder((Any)((Any)this.result_)).mergeFrom((GeneratedMessageLite)any)).buildPartial() : any;
        this.resultCase_ = 5;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(Operation operation) {
        return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)operation);
    }

    public static Operation parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Operation)Operation.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Operation parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Operation)Operation.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Operation parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Operation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static Operation parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Operation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Operation parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Operation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static Operation parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Operation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Operation parseFrom(InputStream inputStream) throws IOException {
        return (Operation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Operation parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Operation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Operation parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (Operation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static Operation parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Operation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<Operation> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setDone(boolean bl) {
        this.done_ = bl;
    }

    private void setError(Status.Builder builder) {
        this.result_ = builder.build();
        this.resultCase_ = 4;
    }

    private void setError(Status status) {
        if (status != null) {
            this.result_ = status;
            this.resultCase_ = 4;
            return;
        }
        throw new NullPointerException();
    }

    private void setMetadata(Any.Builder builder) {
        this.metadata_ = (Any)builder.build();
    }

    private void setMetadata(Any any) {
        if (any != null) {
            this.metadata_ = any;
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
            Operation.checkByteStringIsUtf8((ByteString)byteString);
            this.name_ = byteString.toStringUtf8();
            return;
        }
        throw new NullPointerException();
    }

    private void setResponse(Any.Builder builder) {
        this.result_ = builder.build();
        this.resultCase_ = 5;
    }

    private void setResponse(Any any) {
        if (any != null) {
            this.result_ = any;
            this.resultCase_ = 5;
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
                Class<Operation> class_ = Operation.class;
                // MONITORENTER : com.google.longrunning.Operation.class
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
                                if (n != 24) {
                                    if (n != 34) {
                                        if (n != 42) {
                                            if (codedInputStream.skipField(n)) continue;
                                            bl = true;
                                            continue;
                                        }
                                        int n2 = this.resultCase_;
                                        Any.Builder builder = null;
                                        if (n2 == 5) {
                                            builder = (Any.Builder)((Any)this.result_).toBuilder();
                                        }
                                        this.result_ = codedInputStream.readMessage(Any.parser(), extensionRegistryLite);
                                        if (builder != null) {
                                            builder.mergeFrom((GeneratedMessageLite)((Any)this.result_));
                                            this.result_ = builder.buildPartial();
                                        }
                                        this.resultCase_ = 5;
                                        continue;
                                    }
                                    int n3 = this.resultCase_;
                                    Status.Builder builder = null;
                                    if (n3 == 4) {
                                        builder = (Status.Builder)((Status)((Object)this.result_)).toBuilder();
                                    }
                                    this.result_ = codedInputStream.readMessage(Status.parser(), extensionRegistryLite);
                                    if (builder != null) {
                                        builder.mergeFrom((GeneratedMessageLite)((Status)((Object)this.result_)));
                                        this.result_ = builder.buildPartial();
                                    }
                                    this.resultCase_ = 4;
                                    continue;
                                }
                                this.done_ = codedInputStream.readBool();
                                continue;
                            }
                            Any any = this.metadata_;
                            Any.Builder builder = null;
                            if (any != null) {
                                builder = (Any.Builder)this.metadata_.toBuilder();
                            }
                            this.metadata_ = (Any)codedInputStream.readMessage(Any.parser(), extensionRegistryLite);
                            if (builder == null) continue;
                            builder.mergeFrom((GeneratedMessageLite)this.metadata_);
                            this.metadata_ = (Any)builder.buildPartial();
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
                Operation operation = (Operation)((Object)object2);
                boolean bl = this.name_.isEmpty();
                boolean bl2 = true;
                this.name_ = visitor.visitString(bl ^ bl2, this.name_, bl2 ^ operation.name_.isEmpty(), operation.name_);
                this.metadata_ = (Any)visitor.visitMessage((MessageLite)this.metadata_, (MessageLite)operation.metadata_);
                boolean bl3 = this.done_;
                boolean bl4 = operation.done_;
                this.done_ = visitor.visitBoolean(bl3, bl3, bl4, bl4);
                boolean bl5 = 1.$SwitchMap$com$google$longrunning$Operation$ResultCase[operation.getResultCase().ordinal()];
                if (bl5 != bl2) {
                    if (!bl5) {
                        if (bl5) {
                            if (this.resultCase_ == 0) {
                                bl2 = false;
                            }
                            visitor.visitOneofNotSet(bl2);
                        }
                    } else {
                        if (this.resultCase_ != 5) {
                            bl2 = false;
                        }
                        this.result_ = visitor.visitOneofMessage(bl2, this.result_, operation.result_);
                    }
                } else {
                    if (this.resultCase_ != 4) {
                        bl2 = false;
                    }
                    this.result_ = visitor.visitOneofMessage(bl2, this.result_, operation.result_);
                }
                if (visitor != GeneratedMessageLite.MergeFromVisitor.INSTANCE) return this;
                int n = operation.resultCase_;
                if (n == 0) return this;
                this.resultCase_ = n;
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
        return new Operation();
    }

    public boolean getDone() {
        return this.done_;
    }

    public Status getError() {
        if (this.resultCase_ == 4) {
            return (Status)((Object)this.result_);
        }
        return Status.getDefaultInstance();
    }

    public Any getMetadata() {
        Any any = this.metadata_;
        if (any == null) {
            any = Any.getDefaultInstance();
        }
        return any;
    }

    public String getName() {
        return this.name_;
    }

    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8((String)this.name_);
    }

    public Any getResponse() {
        if (this.resultCase_ == 5) {
            return (Any)this.result_;
        }
        return Any.getDefaultInstance();
    }

    public ResultCase getResultCase() {
        return ResultCase.forNumber((int)this.resultCase_);
    }

    public int getSerializedSize() {
        boolean bl;
        int n = this.memoizedSerializedSize;
        if (n != -1) {
            return n;
        }
        boolean bl2 = this.name_.isEmpty();
        int n2 = 0;
        if (!bl2) {
            n2 = 0 + CodedOutputStream.computeStringSize((int)1, (String)this.getName());
        }
        if (this.metadata_ != null) {
            n2 += CodedOutputStream.computeMessageSize((int)2, (MessageLite)this.getMetadata());
        }
        if (bl = this.done_) {
            n2 += CodedOutputStream.computeBoolSize((int)3, (boolean)bl);
        }
        if (this.resultCase_ == 4) {
            n2 += CodedOutputStream.computeMessageSize((int)4, (MessageLite)((Status)((Object)this.result_)));
        }
        if (this.resultCase_ == 5) {
            n2 += CodedOutputStream.computeMessageSize((int)5, (MessageLite)((Any)this.result_));
        }
        this.memoizedSerializedSize = n2;
        return n2;
    }

    public boolean hasMetadata() {
        return this.metadata_ != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        boolean bl;
        if (!this.name_.isEmpty()) {
            codedOutputStream.writeString(1, this.getName());
        }
        if (this.metadata_ != null) {
            codedOutputStream.writeMessage(2, (MessageLite)this.getMetadata());
        }
        if (bl = this.done_) {
            codedOutputStream.writeBool(3, bl);
        }
        if (this.resultCase_ == 4) {
            codedOutputStream.writeMessage(4, (MessageLite)((Status)((Object)this.result_)));
        }
        if (this.resultCase_ == 5) {
            codedOutputStream.writeMessage(5, (MessageLite)((Any)this.result_));
        }
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<Operation, Builder>
    implements OperationOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder clearDone() {
            this.copyOnWrite();
            ((Operation)this.instance).clearDone();
            return this;
        }

        public Builder clearError() {
            this.copyOnWrite();
            ((Operation)this.instance).clearError();
            return this;
        }

        public Builder clearMetadata() {
            this.copyOnWrite();
            ((Operation)this.instance).clearMetadata();
            return this;
        }

        public Builder clearName() {
            this.copyOnWrite();
            ((Operation)this.instance).clearName();
            return this;
        }

        public Builder clearResponse() {
            this.copyOnWrite();
            ((Operation)this.instance).clearResponse();
            return this;
        }

        public Builder clearResult() {
            this.copyOnWrite();
            ((Operation)this.instance).clearResult();
            return this;
        }

        public boolean getDone() {
            return ((Operation)this.instance).getDone();
        }

        public Status getError() {
            return ((Operation)this.instance).getError();
        }

        public Any getMetadata() {
            return ((Operation)this.instance).getMetadata();
        }

        public String getName() {
            return ((Operation)this.instance).getName();
        }

        public ByteString getNameBytes() {
            return ((Operation)this.instance).getNameBytes();
        }

        public Any getResponse() {
            return ((Operation)this.instance).getResponse();
        }

        public ResultCase getResultCase() {
            return ((Operation)this.instance).getResultCase();
        }

        public boolean hasMetadata() {
            return ((Operation)this.instance).hasMetadata();
        }

        public Builder mergeError(Status status) {
            this.copyOnWrite();
            ((Operation)this.instance).mergeError(status);
            return this;
        }

        public Builder mergeMetadata(Any any) {
            this.copyOnWrite();
            ((Operation)this.instance).mergeMetadata(any);
            return this;
        }

        public Builder mergeResponse(Any any) {
            this.copyOnWrite();
            ((Operation)this.instance).mergeResponse(any);
            return this;
        }

        public Builder setDone(boolean bl) {
            this.copyOnWrite();
            ((Operation)this.instance).setDone(bl);
            return this;
        }

        public Builder setError(Status.Builder builder) {
            this.copyOnWrite();
            ((Operation)this.instance).setError(builder);
            return this;
        }

        public Builder setError(Status status) {
            this.copyOnWrite();
            ((Operation)this.instance).setError(status);
            return this;
        }

        public Builder setMetadata(Any.Builder builder) {
            this.copyOnWrite();
            ((Operation)this.instance).setMetadata(builder);
            return this;
        }

        public Builder setMetadata(Any any) {
            this.copyOnWrite();
            ((Operation)this.instance).setMetadata(any);
            return this;
        }

        public Builder setName(String string) {
            this.copyOnWrite();
            ((Operation)this.instance).setName(string);
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            this.copyOnWrite();
            ((Operation)this.instance).setNameBytes(byteString);
            return this;
        }

        public Builder setResponse(Any.Builder builder) {
            this.copyOnWrite();
            ((Operation)this.instance).setResponse(builder);
            return this;
        }

        public Builder setResponse(Any any) {
            this.copyOnWrite();
            ((Operation)this.instance).setResponse(any);
            return this;
        }
    }

}

