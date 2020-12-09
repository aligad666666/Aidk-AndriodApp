/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.firestore.v1.ArrayValue$1
 *  com.google.firestore.v1.ArrayValueOrBuilder
 *  com.google.firestore.v1.ValueOrBuilder
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

import com.google.firestore.v1.ArrayValue;
import com.google.firestore.v1.ArrayValueOrBuilder;
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

public final class ArrayValue
extends GeneratedMessageLite<ArrayValue, Builder>
implements ArrayValueOrBuilder {
    private static final ArrayValue DEFAULT_INSTANCE = new ArrayValue();
    private static volatile Parser<ArrayValue> PARSER;
    public static final int VALUES_FIELD_NUMBER = 1;
    private Internal.ProtobufList<Value> values_ = ArrayValue.emptyProtobufList();

    static {
        DEFAULT_INSTANCE.makeImmutable();
    }

    private ArrayValue() {
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

    private void clearValues() {
        this.values_ = ArrayValue.emptyProtobufList();
    }

    private void ensureValuesIsMutable() {
        if (!this.values_.isModifiable()) {
            this.values_ = GeneratedMessageLite.mutableCopy(this.values_);
        }
    }

    public static ArrayValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(ArrayValue arrayValue) {
        return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)arrayValue);
    }

    public static ArrayValue parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ArrayValue)ArrayValue.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static ArrayValue parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ArrayValue)ArrayValue.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ArrayValue parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ArrayValue)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static ArrayValue parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ArrayValue)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ArrayValue parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ArrayValue)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static ArrayValue parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ArrayValue)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ArrayValue parseFrom(InputStream inputStream) throws IOException {
        return (ArrayValue)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static ArrayValue parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ArrayValue)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ArrayValue parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (ArrayValue)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static ArrayValue parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ArrayValue)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<ArrayValue> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeValues(int n) {
        this.ensureValuesIsMutable();
        this.values_.remove(n);
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
                Class<ArrayValue> class_ = ArrayValue.class;
                // MONITORENTER : com.google.firestore.v1.ArrayValue.class
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
                ArrayValue arrayValue = (ArrayValue)((Object)object2);
                this.values_ = visitor.visitList(this.values_, arrayValue.values_);
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
        return new ArrayValue();
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
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<ArrayValue, Builder>
    implements ArrayValueOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder addAllValues(Iterable<? extends Value> iterable) {
            this.copyOnWrite();
            ((ArrayValue)this.instance).addAllValues((Iterable<? extends Value>)iterable);
            return this;
        }

        public Builder addValues(int n, Value.Builder builder) {
            this.copyOnWrite();
            ((ArrayValue)this.instance).addValues(n, builder);
            return this;
        }

        public Builder addValues(int n, Value value) {
            this.copyOnWrite();
            ((ArrayValue)this.instance).addValues(n, value);
            return this;
        }

        public Builder addValues(Value.Builder builder) {
            this.copyOnWrite();
            ((ArrayValue)this.instance).addValues(builder);
            return this;
        }

        public Builder addValues(Value value) {
            this.copyOnWrite();
            ((ArrayValue)this.instance).addValues(value);
            return this;
        }

        public Builder clearValues() {
            this.copyOnWrite();
            ((ArrayValue)this.instance).clearValues();
            return this;
        }

        public Value getValues(int n) {
            return ((ArrayValue)this.instance).getValues(n);
        }

        public int getValuesCount() {
            return ((ArrayValue)this.instance).getValuesCount();
        }

        public List<Value> getValuesList() {
            return Collections.unmodifiableList(((ArrayValue)this.instance).getValuesList());
        }

        public Builder removeValues(int n) {
            this.copyOnWrite();
            ((ArrayValue)this.instance).removeValues(n);
            return this;
        }

        public Builder setValues(int n, Value.Builder builder) {
            this.copyOnWrite();
            ((ArrayValue)this.instance).setValues(n, builder);
            return this;
        }

        public Builder setValues(int n, Value value) {
            this.copyOnWrite();
            ((ArrayValue)this.instance).setValues(n, value);
            return this;
        }
    }

}

