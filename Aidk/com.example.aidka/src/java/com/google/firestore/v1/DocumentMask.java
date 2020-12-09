/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.firestore.v1.DocumentMask$1
 *  com.google.firestore.v1.DocumentMaskOrBuilder
 *  com.google.protobuf.AbstractMessageLite
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

import com.google.firestore.v1.DocumentMask;
import com.google.firestore.v1.DocumentMaskOrBuilder;
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

public final class DocumentMask
extends GeneratedMessageLite<DocumentMask, Builder>
implements DocumentMaskOrBuilder {
    private static final DocumentMask DEFAULT_INSTANCE = new DocumentMask();
    public static final int FIELD_PATHS_FIELD_NUMBER = 1;
    private static volatile Parser<DocumentMask> PARSER;
    private Internal.ProtobufList<String> fieldPaths_ = GeneratedMessageLite.emptyProtobufList();

    static {
        DEFAULT_INSTANCE.makeImmutable();
    }

    private DocumentMask() {
    }

    private void addAllFieldPaths(Iterable<String> iterable) {
        this.ensureFieldPathsIsMutable();
        AbstractMessageLite.addAll(iterable, this.fieldPaths_);
    }

    private void addFieldPaths(String string) {
        if (string != null) {
            this.ensureFieldPathsIsMutable();
            this.fieldPaths_.add((Object)string);
            return;
        }
        throw new NullPointerException();
    }

    private void addFieldPathsBytes(ByteString byteString) {
        if (byteString != null) {
            DocumentMask.checkByteStringIsUtf8((ByteString)byteString);
            this.ensureFieldPathsIsMutable();
            this.fieldPaths_.add((Object)byteString.toStringUtf8());
            return;
        }
        throw new NullPointerException();
    }

    private void clearFieldPaths() {
        this.fieldPaths_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureFieldPathsIsMutable() {
        if (!this.fieldPaths_.isModifiable()) {
            this.fieldPaths_ = GeneratedMessageLite.mutableCopy(this.fieldPaths_);
        }
    }

    public static DocumentMask getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(DocumentMask documentMask) {
        return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)documentMask);
    }

    public static DocumentMask parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DocumentMask)DocumentMask.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static DocumentMask parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DocumentMask)DocumentMask.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static DocumentMask parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DocumentMask)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static DocumentMask parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DocumentMask)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static DocumentMask parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DocumentMask)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static DocumentMask parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DocumentMask)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static DocumentMask parseFrom(InputStream inputStream) throws IOException {
        return (DocumentMask)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static DocumentMask parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DocumentMask)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static DocumentMask parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (DocumentMask)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static DocumentMask parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DocumentMask)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<DocumentMask> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setFieldPaths(int n, String string) {
        if (string != null) {
            this.ensureFieldPathsIsMutable();
            this.fieldPaths_.set(n, (Object)string);
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
                Class<DocumentMask> class_ = DocumentMask.class;
                // MONITORENTER : com.google.firestore.v1.DocumentMask.class
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
                        String string = codedInputStream.readStringRequireUtf8();
                        if (!this.fieldPaths_.isModifiable()) {
                            this.fieldPaths_ = GeneratedMessageLite.mutableCopy(this.fieldPaths_);
                        }
                        this.fieldPaths_.add((Object)string);
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
                DocumentMask documentMask = (DocumentMask)((Object)object2);
                this.fieldPaths_ = visitor.visitList(this.fieldPaths_, documentMask.fieldPaths_);
                return this;
            }
            case 4: {
                return new Builder();
            }
            case 3: {
                this.fieldPaths_.makeImmutable();
                return null;
            }
            case 2: {
                return DEFAULT_INSTANCE;
            }
            case 1: 
        }
        return new DocumentMask();
    }

    public String getFieldPaths(int n) {
        return (String)this.fieldPaths_.get(n);
    }

    public ByteString getFieldPathsBytes(int n) {
        return ByteString.copyFromUtf8((String)((String)this.fieldPaths_.get(n)));
    }

    public int getFieldPathsCount() {
        return this.fieldPaths_.size();
    }

    public List<String> getFieldPathsList() {
        return this.fieldPaths_;
    }

    public int getSerializedSize() {
        int n;
        int n2 = this.memoizedSerializedSize;
        if (n2 != -1) {
            return n2;
        }
        int n3 = 0;
        for (int i = 0; i < this.fieldPaths_.size(); ++i) {
            n3 += CodedOutputStream.computeStringSizeNoTag((String)((String)this.fieldPaths_.get(i)));
        }
        this.memoizedSerializedSize = n = 0 + n3 + 1 * this.getFieldPathsList().size();
        return n;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.fieldPaths_.size(); ++i) {
            codedOutputStream.writeString(1, (String)this.fieldPaths_.get(i));
        }
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<DocumentMask, Builder>
    implements DocumentMaskOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder addAllFieldPaths(Iterable<String> iterable) {
            this.copyOnWrite();
            ((DocumentMask)this.instance).addAllFieldPaths((Iterable<String>)iterable);
            return this;
        }

        public Builder addFieldPaths(String string) {
            this.copyOnWrite();
            ((DocumentMask)this.instance).addFieldPaths(string);
            return this;
        }

        public Builder addFieldPathsBytes(ByteString byteString) {
            this.copyOnWrite();
            ((DocumentMask)this.instance).addFieldPathsBytes(byteString);
            return this;
        }

        public Builder clearFieldPaths() {
            this.copyOnWrite();
            ((DocumentMask)this.instance).clearFieldPaths();
            return this;
        }

        public String getFieldPaths(int n) {
            return ((DocumentMask)this.instance).getFieldPaths(n);
        }

        public ByteString getFieldPathsBytes(int n) {
            return ((DocumentMask)this.instance).getFieldPathsBytes(n);
        }

        public int getFieldPathsCount() {
            return ((DocumentMask)this.instance).getFieldPathsCount();
        }

        public List<String> getFieldPathsList() {
            return Collections.unmodifiableList(((DocumentMask)this.instance).getFieldPathsList());
        }

        public Builder setFieldPaths(int n, String string) {
            this.copyOnWrite();
            ((DocumentMask)this.instance).setFieldPaths(n, string);
            return this;
        }
    }

}

