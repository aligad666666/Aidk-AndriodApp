/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.firestore.v1.Cursor$1
 *  com.google.firestore.v1.CursorOrBuilder
 *  com.google.firestore.v1.ValueOrBuilder
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

import com.google.firestore.v1.Cursor;
import com.google.firestore.v1.CursorOrBuilder;
import com.google.firestore.v1.Value;
import com.google.firestore.v1.ValueOrBuilder;
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

public final class Cursor
extends GeneratedMessageLite<Cursor, Builder>
implements CursorOrBuilder {
    public static final int BEFORE_FIELD_NUMBER = 2;
    private static final Cursor DEFAULT_INSTANCE = new Cursor();
    private static volatile Parser<Cursor> PARSER;
    public static final int VALUES_FIELD_NUMBER = 1;
    private boolean before_;
    private int bitField0_;
    private Internal.ProtobufList<Value> values_ = Cursor.emptyProtobufList();

    static {
        DEFAULT_INSTANCE.makeImmutable();
    }

    private Cursor() {
    }

    private void addAllValues(Iterable<? extends Value> iterable) {
        this.ensureValuesIsMutable();
        AbstractMessageLite.addAll(iterable, this.values_);
    }

    private void addValues(int n, Value.Builder builder) {
        this.ensureValuesIsMutable();
        this.values_.add(n, (Object)((Value)builder.build()));
    }

    private void addValues(int n, Value value) {
        if (value != null) {
            this.ensureValuesIsMutable();
            this.values_.add(n, (Object)value);
            return;
        }
        throw new NullPointerException();
    }

    private void addValues(Value.Builder builder) {
        this.ensureValuesIsMutable();
        this.values_.add((Object)((Value)builder.build()));
    }

    private void addValues(Value value) {
        if (value != null) {
            this.ensureValuesIsMutable();
            this.values_.add((Object)value);
            return;
        }
        throw new NullPointerException();
    }

    private void clearBefore() {
        this.before_ = false;
    }

    private void clearValues() {
        this.values_ = Cursor.emptyProtobufList();
    }

    private void ensureValuesIsMutable() {
        if (!this.values_.isModifiable()) {
            this.values_ = GeneratedMessageLite.mutableCopy(this.values_);
        }
    }

    public static Cursor getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(Cursor cursor) {
        return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)cursor);
    }

    public static Cursor parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Cursor)Cursor.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Cursor parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Cursor)Cursor.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Cursor parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Cursor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static Cursor parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Cursor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Cursor parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Cursor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static Cursor parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Cursor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Cursor parseFrom(InputStream inputStream) throws IOException {
        return (Cursor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Cursor parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Cursor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Cursor parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (Cursor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static Cursor parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Cursor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<Cursor> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeValues(int n) {
        this.ensureValuesIsMutable();
        this.values_.remove(n);
    }

    private void setBefore(boolean bl) {
        this.before_ = bl;
    }

    private void setValues(int n, Value.Builder builder) {
        this.ensureValuesIsMutable();
        this.values_.set(n, (Object)((Value)builder.build()));
    }

    private void setValues(int n, Value value) {
        if (value != null) {
            this.ensureValuesIsMutable();
            this.values_.set(n, (Object)value);
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
                Class<Cursor> class_ = Cursor.class;
                // MONITORENTER : com.google.firestore.v1.Cursor.class
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
                            if (n != 16) {
                                if (codedInputStream.skipField(n)) continue;
                                bl = true;
                                continue;
                            }
                            this.before_ = codedInputStream.readBool();
                            continue;
                        }
                        if (!this.values_.isModifiable()) {
                            this.values_ = GeneratedMessageLite.mutableCopy(this.values_);
                        }
                        this.values_.add((Object)((Value)codedInputStream.readMessage(Value.parser(), extensionRegistryLite)));
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
                Cursor cursor = (Cursor)((Object)object2);
                this.values_ = visitor.visitList(this.values_, cursor.values_);
                boolean bl = this.before_;
                boolean bl2 = cursor.before_;
                this.before_ = visitor.visitBoolean(bl, bl, bl2, bl2);
                if (visitor != GeneratedMessageLite.MergeFromVisitor.INSTANCE) return this;
                this.bitField0_ |= cursor.bitField0_;
                return this;
            }
            case 4: {
                return new Builder();
            }
            case 3: {
                this.values_.makeImmutable();
                return null;
            }
            case 2: {
                return DEFAULT_INSTANCE;
            }
            case 1: 
        }
        return new Cursor();
    }

    public boolean getBefore() {
        return this.before_;
    }

    public int getSerializedSize() {
        int n = this.memoizedSerializedSize;
        if (n != -1) {
            return n;
        }
        int n2 = 0;
        for (int i = 0; i < this.values_.size(); ++i) {
            n2 += CodedOutputStream.computeMessageSize((int)1, (MessageLite)((MessageLite)this.values_.get(i)));
        }
        boolean bl = this.before_;
        if (bl) {
            n2 += CodedOutputStream.computeBoolSize((int)2, (boolean)bl);
        }
        this.memoizedSerializedSize = n2;
        return n2;
    }

    public Value getValues(int n) {
        return (Value)((Object)this.values_.get(n));
    }

    public int getValuesCount() {
        return this.values_.size();
    }

    public List<Value> getValuesList() {
        return this.values_;
    }

    public ValueOrBuilder getValuesOrBuilder(int n) {
        return (ValueOrBuilder)this.values_.get(n);
    }

    public List<? extends ValueOrBuilder> getValuesOrBuilderList() {
        return this.values_;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.values_.size(); ++i) {
            codedOutputStream.writeMessage(1, (MessageLite)this.values_.get(i));
        }
        boolean bl = this.before_;
        if (bl) {
            codedOutputStream.writeBool(2, bl);
        }
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<Cursor, Builder>
    implements CursorOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder addAllValues(Iterable<? extends Value> iterable) {
            this.copyOnWrite();
            ((Cursor)this.instance).addAllValues((Iterable<? extends Value>)iterable);
            return this;
        }

        public Builder addValues(int n, Value.Builder builder) {
            this.copyOnWrite();
            ((Cursor)this.instance).addValues(n, builder);
            return this;
        }

        public Builder addValues(int n, Value value) {
            this.copyOnWrite();
            ((Cursor)this.instance).addValues(n, value);
            return this;
        }

        public Builder addValues(Value.Builder builder) {
            this.copyOnWrite();
            ((Cursor)this.instance).addValues(builder);
            return this;
        }

        public Builder addValues(Value value) {
            this.copyOnWrite();
            ((Cursor)this.instance).addValues(value);
            return this;
        }

        public Builder clearBefore() {
            this.copyOnWrite();
            ((Cursor)this.instance).clearBefore();
            return this;
        }

        public Builder clearValues() {
            this.copyOnWrite();
            ((Cursor)this.instance).clearValues();
            return this;
        }

        public boolean getBefore() {
            return ((Cursor)this.instance).getBefore();
        }

        public Value getValues(int n) {
            return ((Cursor)this.instance).getValues(n);
        }

        public int getValuesCount() {
            return ((Cursor)this.instance).getValuesCount();
        }

        public List<Value> getValuesList() {
            return Collections.unmodifiableList(((Cursor)this.instance).getValuesList());
        }

        public Builder removeValues(int n) {
            this.copyOnWrite();
            ((Cursor)this.instance).removeValues(n);
            return this;
        }

        public Builder setBefore(boolean bl) {
            this.copyOnWrite();
            ((Cursor)this.instance).setBefore(bl);
            return this;
        }

        public Builder setValues(int n, Value.Builder builder) {
            this.copyOnWrite();
            ((Cursor)this.instance).setValues(n, builder);
            return this;
        }

        public Builder setValues(int n, Value value) {
            this.copyOnWrite();
            ((Cursor)this.instance).setValues(n, value);
            return this;
        }
    }

}

