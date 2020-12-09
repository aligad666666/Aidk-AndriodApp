/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
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
 *  com.google.rpc.DebugInfo$1
 *  com.google.rpc.DebugInfoOrBuilder
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
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.rpc.DebugInfo;
import com.google.rpc.DebugInfoOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

public final class DebugInfo
extends GeneratedMessageLite<DebugInfo, Builder>
implements DebugInfoOrBuilder {
    private static final DebugInfo DEFAULT_INSTANCE = new DebugInfo();
    public static final int DETAIL_FIELD_NUMBER = 2;
    private static volatile Parser<DebugInfo> PARSER;
    public static final int STACK_ENTRIES_FIELD_NUMBER = 1;
    private int bitField0_;
    private String detail_ = "";
    private Internal.ProtobufList<String> stackEntries_ = GeneratedMessageLite.emptyProtobufList();

    static {
        DEFAULT_INSTANCE.makeImmutable();
    }

    private DebugInfo() {
    }

    private void addAllStackEntries(Iterable<String> iterable) {
        this.ensureStackEntriesIsMutable();
        AbstractMessageLite.addAll(iterable, this.stackEntries_);
    }

    private void addStackEntries(String string) {
        if (string != null) {
            this.ensureStackEntriesIsMutable();
            this.stackEntries_.add((Object)string);
            return;
        }
        throw new NullPointerException();
    }

    private void addStackEntriesBytes(ByteString byteString) {
        if (byteString != null) {
            DebugInfo.checkByteStringIsUtf8((ByteString)byteString);
            this.ensureStackEntriesIsMutable();
            this.stackEntries_.add((Object)byteString.toStringUtf8());
            return;
        }
        throw new NullPointerException();
    }

    private void clearDetail() {
        this.detail_ = DebugInfo.getDefaultInstance().getDetail();
    }

    private void clearStackEntries() {
        this.stackEntries_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureStackEntriesIsMutable() {
        if (!this.stackEntries_.isModifiable()) {
            this.stackEntries_ = GeneratedMessageLite.mutableCopy(this.stackEntries_);
        }
    }

    public static DebugInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(DebugInfo debugInfo) {
        return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)debugInfo);
    }

    public static DebugInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DebugInfo)DebugInfo.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static DebugInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DebugInfo)DebugInfo.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static DebugInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DebugInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static DebugInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DebugInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static DebugInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DebugInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static DebugInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DebugInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static DebugInfo parseFrom(InputStream inputStream) throws IOException {
        return (DebugInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static DebugInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DebugInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static DebugInfo parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (DebugInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static DebugInfo parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DebugInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<DebugInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setDetail(String string) {
        if (string != null) {
            this.detail_ = string;
            return;
        }
        throw new NullPointerException();
    }

    private void setDetailBytes(ByteString byteString) {
        if (byteString != null) {
            DebugInfo.checkByteStringIsUtf8((ByteString)byteString);
            this.detail_ = byteString.toStringUtf8();
            return;
        }
        throw new NullPointerException();
    }

    private void setStackEntries(int n, String string) {
        if (string != null) {
            this.ensureStackEntriesIsMutable();
            this.stackEntries_.set(n, (Object)string);
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
                Class<DebugInfo> class_ = DebugInfo.class;
                // MONITORENTER : com.google.rpc.DebugInfo.class
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
                            this.detail_ = codedInputStream.readStringRequireUtf8();
                            continue;
                        }
                        String string = codedInputStream.readStringRequireUtf8();
                        if (!this.stackEntries_.isModifiable()) {
                            this.stackEntries_ = GeneratedMessageLite.mutableCopy(this.stackEntries_);
                        }
                        this.stackEntries_.add((Object)string);
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
                DebugInfo debugInfo = (DebugInfo)((Object)object2);
                this.stackEntries_ = visitor.visitList(this.stackEntries_, debugInfo.stackEntries_);
                this.detail_ = visitor.visitString(true ^ this.detail_.isEmpty(), this.detail_, true ^ debugInfo.detail_.isEmpty(), debugInfo.detail_);
                if (visitor != GeneratedMessageLite.MergeFromVisitor.INSTANCE) return this;
                this.bitField0_ |= debugInfo.bitField0_;
                return this;
            }
            case 4: {
                return new Builder();
            }
            case 3: {
                this.stackEntries_.makeImmutable();
                return null;
            }
            case 2: {
                return DEFAULT_INSTANCE;
            }
            case 1: 
        }
        return new DebugInfo();
    }

    public String getDetail() {
        return this.detail_;
    }

    public ByteString getDetailBytes() {
        return ByteString.copyFromUtf8((String)this.detail_);
    }

    public int getSerializedSize() {
        int n = this.memoizedSerializedSize;
        if (n != -1) {
            return n;
        }
        int n2 = 0;
        for (int i = 0; i < this.stackEntries_.size(); ++i) {
            n2 += CodedOutputStream.computeStringSizeNoTag((String)((String)this.stackEntries_.get(i)));
        }
        int n3 = 0 + n2 + 1 * this.getStackEntriesList().size();
        if (!this.detail_.isEmpty()) {
            n3 += CodedOutputStream.computeStringSize((int)2, (String)this.getDetail());
        }
        this.memoizedSerializedSize = n3;
        return n3;
    }

    public String getStackEntries(int n) {
        return (String)this.stackEntries_.get(n);
    }

    public ByteString getStackEntriesBytes(int n) {
        return ByteString.copyFromUtf8((String)((String)this.stackEntries_.get(n)));
    }

    public int getStackEntriesCount() {
        return this.stackEntries_.size();
    }

    public List<String> getStackEntriesList() {
        return this.stackEntries_;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.stackEntries_.size(); ++i) {
            codedOutputStream.writeString(1, (String)this.stackEntries_.get(i));
        }
        if (!this.detail_.isEmpty()) {
            codedOutputStream.writeString(2, this.getDetail());
        }
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<DebugInfo, Builder>
    implements DebugInfoOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder addAllStackEntries(Iterable<String> iterable) {
            this.copyOnWrite();
            ((DebugInfo)this.instance).addAllStackEntries((Iterable<String>)iterable);
            return this;
        }

        public Builder addStackEntries(String string) {
            this.copyOnWrite();
            ((DebugInfo)this.instance).addStackEntries(string);
            return this;
        }

        public Builder addStackEntriesBytes(ByteString byteString) {
            this.copyOnWrite();
            ((DebugInfo)this.instance).addStackEntriesBytes(byteString);
            return this;
        }

        public Builder clearDetail() {
            this.copyOnWrite();
            ((DebugInfo)this.instance).clearDetail();
            return this;
        }

        public Builder clearStackEntries() {
            this.copyOnWrite();
            ((DebugInfo)this.instance).clearStackEntries();
            return this;
        }

        public String getDetail() {
            return ((DebugInfo)this.instance).getDetail();
        }

        public ByteString getDetailBytes() {
            return ((DebugInfo)this.instance).getDetailBytes();
        }

        public String getStackEntries(int n) {
            return ((DebugInfo)this.instance).getStackEntries(n);
        }

        public ByteString getStackEntriesBytes(int n) {
            return ((DebugInfo)this.instance).getStackEntriesBytes(n);
        }

        public int getStackEntriesCount() {
            return ((DebugInfo)this.instance).getStackEntriesCount();
        }

        public List<String> getStackEntriesList() {
            return Collections.unmodifiableList(((DebugInfo)this.instance).getStackEntriesList());
        }

        public Builder setDetail(String string) {
            this.copyOnWrite();
            ((DebugInfo)this.instance).setDetail(string);
            return this;
        }

        public Builder setDetailBytes(ByteString byteString) {
            this.copyOnWrite();
            ((DebugInfo)this.instance).setDetailBytes(byteString);
            return this;
        }

        public Builder setStackEntries(int n, String string) {
            this.copyOnWrite();
            ((DebugInfo)this.instance).setStackEntries(n, string);
            return this;
        }
    }

}

