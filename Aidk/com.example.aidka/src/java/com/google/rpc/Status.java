/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessageLite
 *  com.google.protobuf.Any
 *  com.google.protobuf.Any$Builder
 *  com.google.protobuf.AnyOrBuilder
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
 *  com.google.rpc.Status$1
 *  com.google.rpc.StatusOrBuilder
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
package com.google.rpc;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.Any;
import com.google.protobuf.AnyOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.rpc.Status;
import com.google.rpc.StatusOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

public final class Status
extends GeneratedMessageLite<Status, Builder>
implements StatusOrBuilder {
    public static final int CODE_FIELD_NUMBER = 1;
    private static final Status DEFAULT_INSTANCE = new Status();
    public static final int DETAILS_FIELD_NUMBER = 3;
    public static final int MESSAGE_FIELD_NUMBER = 2;
    private static volatile Parser<Status> PARSER;
    private int bitField0_;
    private int code_;
    private Internal.ProtobufList<Any> details_ = Status.emptyProtobufList();
    private String message_ = "";

    static {
        DEFAULT_INSTANCE.makeImmutable();
    }

    private Status() {
    }

    private void addAllDetails(Iterable<? extends Any> iterable) {
        this.ensureDetailsIsMutable();
        AbstractMessageLite.addAll(iterable, this.details_);
    }

    private void addDetails(int n, Any.Builder builder) {
        this.ensureDetailsIsMutable();
        this.details_.add(n, (Object)((Any)builder.build()));
    }

    private void addDetails(int n, Any any) {
        if (any != null) {
            this.ensureDetailsIsMutable();
            this.details_.add(n, (Object)any);
            return;
        }
        throw new NullPointerException();
    }

    private void addDetails(Any.Builder builder) {
        this.ensureDetailsIsMutable();
        this.details_.add((Object)((Any)builder.build()));
    }

    private void addDetails(Any any) {
        if (any != null) {
            this.ensureDetailsIsMutable();
            this.details_.add((Object)any);
            return;
        }
        throw new NullPointerException();
    }

    private void clearCode() {
        this.code_ = 0;
    }

    private void clearDetails() {
        this.details_ = Status.emptyProtobufList();
    }

    private void clearMessage() {
        this.message_ = Status.getDefaultInstance().getMessage();
    }

    private void ensureDetailsIsMutable() {
        if (!this.details_.isModifiable()) {
            this.details_ = GeneratedMessageLite.mutableCopy(this.details_);
        }
    }

    public static Status getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(Status status) {
        return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)status);
    }

    public static Status parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Status)Status.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Status parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Status)Status.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Status parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Status)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static Status parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Status)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Status parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Status)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static Status parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Status)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Status parseFrom(InputStream inputStream) throws IOException {
        return (Status)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Status parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Status)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Status parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (Status)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static Status parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Status)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<Status> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeDetails(int n) {
        this.ensureDetailsIsMutable();
        this.details_.remove(n);
    }

    private void setCode(int n) {
        this.code_ = n;
    }

    private void setDetails(int n, Any.Builder builder) {
        this.ensureDetailsIsMutable();
        this.details_.set(n, (Object)((Any)builder.build()));
    }

    private void setDetails(int n, Any any) {
        if (any != null) {
            this.ensureDetailsIsMutable();
            this.details_.set(n, (Object)any);
            return;
        }
        throw new NullPointerException();
    }

    private void setMessage(String string) {
        if (string != null) {
            this.message_ = string;
            return;
        }
        throw new NullPointerException();
    }

    private void setMessageBytes(ByteString byteString) {
        if (byteString != null) {
            Status.checkByteStringIsUtf8((ByteString)byteString);
            this.message_ = byteString.toStringUtf8();
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
                Class<Status> class_ = Status.class;
                // MONITORENTER : com.google.rpc.Status.class
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
                        if (n != 8) {
                            if (n != 18) {
                                if (n != 26) {
                                    if (codedInputStream.skipField(n)) continue;
                                    bl = true;
                                    continue;
                                }
                                if (!this.details_.isModifiable()) {
                                    this.details_ = GeneratedMessageLite.mutableCopy(this.details_);
                                }
                                this.details_.add((Object)((Any)codedInputStream.readMessage(Any.parser(), extensionRegistryLite)));
                                continue;
                            }
                            this.message_ = codedInputStream.readStringRequireUtf8();
                            continue;
                        }
                        this.code_ = codedInputStream.readInt32();
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
                Status status = (Status)((Object)object2);
                boolean bl = this.code_ != 0;
                int n = this.code_;
                int n2 = status.code_;
                boolean bl2 = false;
                if (n2 != 0) {
                    bl2 = true;
                }
                this.code_ = visitor.visitInt(bl, n, bl2, status.code_);
                this.message_ = visitor.visitString(true ^ this.message_.isEmpty(), this.message_, true ^ status.message_.isEmpty(), status.message_);
                this.details_ = visitor.visitList(this.details_, status.details_);
                if (visitor != GeneratedMessageLite.MergeFromVisitor.INSTANCE) return this;
                this.bitField0_ |= status.bitField0_;
                return this;
            }
            case 4: {
                return new Builder();
            }
            case 3: {
                this.details_.makeImmutable();
                return null;
            }
            case 2: {
                return DEFAULT_INSTANCE;
            }
            case 1: 
        }
        return new Status();
    }

    public int getCode() {
        return this.code_;
    }

    public Any getDetails(int n) {
        return (Any)this.details_.get(n);
    }

    public int getDetailsCount() {
        return this.details_.size();
    }

    public List<Any> getDetailsList() {
        return this.details_;
    }

    public AnyOrBuilder getDetailsOrBuilder(int n) {
        return (AnyOrBuilder)this.details_.get(n);
    }

    public List<? extends AnyOrBuilder> getDetailsOrBuilderList() {
        return this.details_;
    }

    public String getMessage() {
        return this.message_;
    }

    public ByteString getMessageBytes() {
        return ByteString.copyFromUtf8((String)this.message_);
    }

    public int getSerializedSize() {
        int n = this.memoizedSerializedSize;
        if (n != -1) {
            return n;
        }
        int n2 = this.code_;
        int n3 = 0;
        if (n2 != 0) {
            n3 = 0 + CodedOutputStream.computeInt32Size((int)1, (int)n2);
        }
        if (!this.message_.isEmpty()) {
            n3 += CodedOutputStream.computeStringSize((int)2, (String)this.getMessage());
        }
        for (int i = 0; i < this.details_.size(); ++i) {
            n3 += CodedOutputStream.computeMessageSize((int)3, (MessageLite)((MessageLite)this.details_.get(i)));
        }
        this.memoizedSerializedSize = n3;
        return n3;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        int n = this.code_;
        if (n != 0) {
            codedOutputStream.writeInt32(1, n);
        }
        if (!this.message_.isEmpty()) {
            codedOutputStream.writeString(2, this.getMessage());
        }
        for (int i = 0; i < this.details_.size(); ++i) {
            codedOutputStream.writeMessage(3, (MessageLite)this.details_.get(i));
        }
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<Status, Builder>
    implements StatusOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder addAllDetails(Iterable<? extends Any> iterable) {
            this.copyOnWrite();
            ((Status)this.instance).addAllDetails((Iterable<? extends Any>)iterable);
            return this;
        }

        public Builder addDetails(int n, Any.Builder builder) {
            this.copyOnWrite();
            ((Status)this.instance).addDetails(n, builder);
            return this;
        }

        public Builder addDetails(int n, Any any) {
            this.copyOnWrite();
            ((Status)this.instance).addDetails(n, any);
            return this;
        }

        public Builder addDetails(Any.Builder builder) {
            this.copyOnWrite();
            ((Status)this.instance).addDetails(builder);
            return this;
        }

        public Builder addDetails(Any any) {
            this.copyOnWrite();
            ((Status)this.instance).addDetails(any);
            return this;
        }

        public Builder clearCode() {
            this.copyOnWrite();
            ((Status)this.instance).clearCode();
            return this;
        }

        public Builder clearDetails() {
            this.copyOnWrite();
            ((Status)this.instance).clearDetails();
            return this;
        }

        public Builder clearMessage() {
            this.copyOnWrite();
            ((Status)this.instance).clearMessage();
            return this;
        }

        public int getCode() {
            return ((Status)this.instance).getCode();
        }

        public Any getDetails(int n) {
            return ((Status)this.instance).getDetails(n);
        }

        public int getDetailsCount() {
            return ((Status)this.instance).getDetailsCount();
        }

        public List<Any> getDetailsList() {
            return Collections.unmodifiableList(((Status)this.instance).getDetailsList());
        }

        public String getMessage() {
            return ((Status)this.instance).getMessage();
        }

        public ByteString getMessageBytes() {
            return ((Status)this.instance).getMessageBytes();
        }

        public Builder removeDetails(int n) {
            this.copyOnWrite();
            ((Status)this.instance).removeDetails(n);
            return this;
        }

        public Builder setCode(int n) {
            this.copyOnWrite();
            ((Status)this.instance).setCode(n);
            return this;
        }

        public Builder setDetails(int n, Any.Builder builder) {
            this.copyOnWrite();
            ((Status)this.instance).setDetails(n, builder);
            return this;
        }

        public Builder setDetails(int n, Any any) {
            this.copyOnWrite();
            ((Status)this.instance).setDetails(n, any);
            return this;
        }

        public Builder setMessage(String string) {
            this.copyOnWrite();
            ((Status)this.instance).setMessage(string);
            return this;
        }

        public Builder setMessageBytes(ByteString byteString) {
            this.copyOnWrite();
            ((Status)this.instance).setMessageBytes(byteString);
            return this;
        }
    }

}

