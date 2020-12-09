/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.firestore.v1.ExistenceFilter$1
 *  com.google.firestore.v1.ExistenceFilterOrBuilder
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
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.UnsupportedOperationException
 */
package com.google.firestore.v1;

import com.google.firestore.v1.ExistenceFilter;
import com.google.firestore.v1.ExistenceFilterOrBuilder;
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

public final class ExistenceFilter
extends GeneratedMessageLite<ExistenceFilter, Builder>
implements ExistenceFilterOrBuilder {
    public static final int COUNT_FIELD_NUMBER = 2;
    private static final ExistenceFilter DEFAULT_INSTANCE = new ExistenceFilter();
    private static volatile Parser<ExistenceFilter> PARSER;
    public static final int TARGET_ID_FIELD_NUMBER = 1;
    private int count_;
    private int targetId_;

    static {
        DEFAULT_INSTANCE.makeImmutable();
    }

    private ExistenceFilter() {
    }

    private void clearCount() {
        this.count_ = 0;
    }

    private void clearTargetId() {
        this.targetId_ = 0;
    }

    public static ExistenceFilter getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(ExistenceFilter existenceFilter) {
        return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)existenceFilter);
    }

    public static ExistenceFilter parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ExistenceFilter)ExistenceFilter.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static ExistenceFilter parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ExistenceFilter)ExistenceFilter.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ExistenceFilter parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ExistenceFilter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static ExistenceFilter parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ExistenceFilter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ExistenceFilter parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ExistenceFilter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static ExistenceFilter parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ExistenceFilter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ExistenceFilter parseFrom(InputStream inputStream) throws IOException {
        return (ExistenceFilter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static ExistenceFilter parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ExistenceFilter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ExistenceFilter parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (ExistenceFilter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static ExistenceFilter parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ExistenceFilter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<ExistenceFilter> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setCount(int n) {
        this.count_ = n;
    }

    private void setTargetId(int n) {
        this.targetId_ = n;
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
                Class<ExistenceFilter> class_ = ExistenceFilter.class;
                // MONITORENTER : com.google.firestore.v1.ExistenceFilter.class
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
                        if (n != 8) {
                            if (n != 16) {
                                if (codedInputStream.skipField(n)) continue;
                                bl = true;
                                continue;
                            }
                            this.count_ = codedInputStream.readInt32();
                            continue;
                        }
                        this.targetId_ = codedInputStream.readInt32();
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
                ExistenceFilter existenceFilter = (ExistenceFilter)((Object)object2);
                int n = this.targetId_;
                boolean bl = true;
                boolean bl2 = n != 0;
                int n2 = this.targetId_;
                boolean bl3 = existenceFilter.targetId_ != 0;
                this.targetId_ = visitor.visitInt(bl2, n2, bl3, existenceFilter.targetId_);
                boolean bl4 = this.count_ != 0;
                int n3 = this.count_;
                if (existenceFilter.count_ == 0) {
                    bl = false;
                }
                this.count_ = visitor.visitInt(bl4, n3, bl, existenceFilter.count_);
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
        return new ExistenceFilter();
    }

    public int getCount() {
        return this.count_;
    }

    public int getSerializedSize() {
        int n;
        int n2 = this.memoizedSerializedSize;
        if (n2 != -1) {
            return n2;
        }
        int n3 = this.targetId_;
        int n4 = 0;
        if (n3 != 0) {
            n4 = 0 + CodedOutputStream.computeInt32Size((int)1, (int)n3);
        }
        if ((n = this.count_) != 0) {
            n4 += CodedOutputStream.computeInt32Size((int)2, (int)n);
        }
        this.memoizedSerializedSize = n4;
        return n4;
    }

    public int getTargetId() {
        return this.targetId_;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        int n;
        int n2 = this.targetId_;
        if (n2 != 0) {
            codedOutputStream.writeInt32(1, n2);
        }
        if ((n = this.count_) != 0) {
            codedOutputStream.writeInt32(2, n);
        }
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<ExistenceFilter, Builder>
    implements ExistenceFilterOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder clearCount() {
            this.copyOnWrite();
            ((ExistenceFilter)this.instance).clearCount();
            return this;
        }

        public Builder clearTargetId() {
            this.copyOnWrite();
            ((ExistenceFilter)this.instance).clearTargetId();
            return this;
        }

        public int getCount() {
            return ((ExistenceFilter)this.instance).getCount();
        }

        public int getTargetId() {
            return ((ExistenceFilter)this.instance).getTargetId();
        }

        public Builder setCount(int n) {
            this.copyOnWrite();
            ((ExistenceFilter)this.instance).setCount(n);
            return this;
        }

        public Builder setTargetId(int n) {
            this.copyOnWrite();
            ((ExistenceFilter)this.instance).setTargetId(n);
            return this;
        }
    }

}

