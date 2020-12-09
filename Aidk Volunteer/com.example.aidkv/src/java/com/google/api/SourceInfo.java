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
 *  java.lang.NoSuchFieldError
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.UnsupportedOperationException
 *  java.util.Collections
 *  java.util.List
 */
package com.google.api;

import com.google.api.SourceInfoOrBuilder;
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
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

public final class SourceInfo
extends GeneratedMessageLite<SourceInfo, Builder>
implements SourceInfoOrBuilder {
    private static final SourceInfo DEFAULT_INSTANCE = new SourceInfo();
    private static volatile Parser<SourceInfo> PARSER;
    public static final int SOURCE_FILES_FIELD_NUMBER = 1;
    private Internal.ProtobufList<Any> sourceFiles_ = SourceInfo.emptyProtobufList();

    static {
        DEFAULT_INSTANCE.makeImmutable();
    }

    private SourceInfo() {
    }

    private void addAllSourceFiles(Iterable<? extends Any> iterable) {
        this.ensureSourceFilesIsMutable();
        AbstractMessageLite.addAll(iterable, this.sourceFiles_);
    }

    private void addSourceFiles(int n, Any.Builder builder) {
        this.ensureSourceFilesIsMutable();
        this.sourceFiles_.add(n, (Object)((Any)builder.build()));
    }

    private void addSourceFiles(int n, Any any) {
        if (any != null) {
            this.ensureSourceFilesIsMutable();
            this.sourceFiles_.add(n, (Object)any);
            return;
        }
        throw new NullPointerException();
    }

    private void addSourceFiles(Any.Builder builder) {
        this.ensureSourceFilesIsMutable();
        this.sourceFiles_.add((Object)((Any)builder.build()));
    }

    private void addSourceFiles(Any any) {
        if (any != null) {
            this.ensureSourceFilesIsMutable();
            this.sourceFiles_.add((Object)any);
            return;
        }
        throw new NullPointerException();
    }

    private void clearSourceFiles() {
        this.sourceFiles_ = SourceInfo.emptyProtobufList();
    }

    private void ensureSourceFilesIsMutable() {
        if (!this.sourceFiles_.isModifiable()) {
            this.sourceFiles_ = GeneratedMessageLite.mutableCopy(this.sourceFiles_);
        }
    }

    public static SourceInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(SourceInfo sourceInfo) {
        return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)sourceInfo);
    }

    public static SourceInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SourceInfo)SourceInfo.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static SourceInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SourceInfo)SourceInfo.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static SourceInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (SourceInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static SourceInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SourceInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static SourceInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (SourceInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static SourceInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SourceInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static SourceInfo parseFrom(InputStream inputStream) throws IOException {
        return (SourceInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static SourceInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SourceInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static SourceInfo parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (SourceInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static SourceInfo parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SourceInfo)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<SourceInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeSourceFiles(int n) {
        this.ensureSourceFilesIsMutable();
        this.sourceFiles_.remove(n);
    }

    private void setSourceFiles(int n, Any.Builder builder) {
        this.ensureSourceFilesIsMutable();
        this.sourceFiles_.set(n, (Object)((Any)builder.build()));
    }

    private void setSourceFiles(int n, Any any) {
        if (any != null) {
            this.ensureSourceFilesIsMutable();
            this.sourceFiles_.set(n, (Object)any);
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
                Class<SourceInfo> class_ = SourceInfo.class;
                // MONITORENTER : com.google.api.SourceInfo.class
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
                            if (codedInputStream.skipField(n)) continue;
                            bl = true;
                            continue;
                        }
                        if (!this.sourceFiles_.isModifiable()) {
                            this.sourceFiles_ = GeneratedMessageLite.mutableCopy(this.sourceFiles_);
                        }
                        this.sourceFiles_.add((Object)((Any)codedInputStream.readMessage(Any.parser(), extensionRegistryLite)));
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
                SourceInfo sourceInfo = (SourceInfo)object2;
                this.sourceFiles_ = visitor.visitList(this.sourceFiles_, sourceInfo.sourceFiles_);
                return this;
            }
            case 4: {
                return new Builder();
            }
            case 3: {
                this.sourceFiles_.makeImmutable();
                return null;
            }
            case 2: {
                return DEFAULT_INSTANCE;
            }
            case 1: 
        }
        return new SourceInfo();
    }

    public int getSerializedSize() {
        int n = this.memoizedSerializedSize;
        if (n != -1) {
            return n;
        }
        int n2 = 0;
        for (int i = 0; i < this.sourceFiles_.size(); ++i) {
            n2 += CodedOutputStream.computeMessageSize((int)1, (MessageLite)((MessageLite)this.sourceFiles_.get(i)));
        }
        this.memoizedSerializedSize = n2;
        return n2;
    }

    @Override
    public Any getSourceFiles(int n) {
        return (Any)this.sourceFiles_.get(n);
    }

    @Override
    public int getSourceFilesCount() {
        return this.sourceFiles_.size();
    }

    @Override
    public List<Any> getSourceFilesList() {
        return this.sourceFiles_;
    }

    public AnyOrBuilder getSourceFilesOrBuilder(int n) {
        return (AnyOrBuilder)this.sourceFiles_.get(n);
    }

    public List<? extends AnyOrBuilder> getSourceFilesOrBuilderList() {
        return this.sourceFiles_;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.sourceFiles_.size(); ++i) {
            codedOutputStream.writeMessage(1, (MessageLite)this.sourceFiles_.get(i));
        }
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<SourceInfo, Builder>
    implements SourceInfoOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder addAllSourceFiles(Iterable<? extends Any> iterable) {
            this.copyOnWrite();
            ((SourceInfo)this.instance).addAllSourceFiles((Iterable<? extends Any>)iterable);
            return this;
        }

        public Builder addSourceFiles(int n, Any.Builder builder) {
            this.copyOnWrite();
            ((SourceInfo)this.instance).addSourceFiles(n, builder);
            return this;
        }

        public Builder addSourceFiles(int n, Any any) {
            this.copyOnWrite();
            ((SourceInfo)this.instance).addSourceFiles(n, any);
            return this;
        }

        public Builder addSourceFiles(Any.Builder builder) {
            this.copyOnWrite();
            ((SourceInfo)this.instance).addSourceFiles(builder);
            return this;
        }

        public Builder addSourceFiles(Any any) {
            this.copyOnWrite();
            ((SourceInfo)this.instance).addSourceFiles(any);
            return this;
        }

        public Builder clearSourceFiles() {
            this.copyOnWrite();
            ((SourceInfo)this.instance).clearSourceFiles();
            return this;
        }

        @Override
        public Any getSourceFiles(int n) {
            return ((SourceInfo)this.instance).getSourceFiles(n);
        }

        @Override
        public int getSourceFilesCount() {
            return ((SourceInfo)this.instance).getSourceFilesCount();
        }

        @Override
        public List<Any> getSourceFilesList() {
            return Collections.unmodifiableList(((SourceInfo)this.instance).getSourceFilesList());
        }

        public Builder removeSourceFiles(int n) {
            this.copyOnWrite();
            ((SourceInfo)this.instance).removeSourceFiles(n);
            return this;
        }

        public Builder setSourceFiles(int n, Any.Builder builder) {
            this.copyOnWrite();
            ((SourceInfo)this.instance).setSourceFiles(n, builder);
            return this;
        }

        public Builder setSourceFiles(int n, Any any) {
            this.copyOnWrite();
            ((SourceInfo)this.instance).setSourceFiles(n, any);
            return this;
        }
    }

}

