/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.firestore.v1.MapValue$1
 *  com.google.firestore.v1.MapValue$FieldsDefaultEntryHolder
 *  com.google.firestore.v1.MapValueOrBuilder
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
 *  com.google.protobuf.MapEntryLite
 *  com.google.protobuf.MapFieldLite
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.Parser
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.Class
 *  java.lang.Deprecated
 *  java.lang.IllegalArgumentException
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.UnsupportedOperationException
 *  java.util.Collections
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
package com.google.firestore.v1;

import com.google.firestore.v1.MapValue;
import com.google.firestore.v1.MapValueOrBuilder;
import com.google.firestore.v1.Value;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

public final class MapValue
extends GeneratedMessageLite<MapValue, Builder>
implements MapValueOrBuilder {
    private static final MapValue DEFAULT_INSTANCE = new MapValue();
    public static final int FIELDS_FIELD_NUMBER = 1;
    private static volatile Parser<MapValue> PARSER;
    private MapFieldLite<String, Value> fields_ = MapFieldLite.emptyMapField();

    static {
        DEFAULT_INSTANCE.makeImmutable();
    }

    private MapValue() {
    }

    public static MapValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private Map<String, Value> getMutableFieldsMap() {
        return this.internalGetMutableFields();
    }

    private MapFieldLite<String, Value> internalGetFields() {
        return this.fields_;
    }

    private MapFieldLite<String, Value> internalGetMutableFields() {
        if (!this.fields_.isMutable()) {
            this.fields_ = this.fields_.mutableCopy();
        }
        return this.fields_;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(MapValue mapValue) {
        return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)mapValue);
    }

    public static MapValue parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MapValue)MapValue.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static MapValue parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MapValue)MapValue.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static MapValue parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (MapValue)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static MapValue parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MapValue)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static MapValue parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (MapValue)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static MapValue parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MapValue)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static MapValue parseFrom(InputStream inputStream) throws IOException {
        return (MapValue)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static MapValue parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MapValue)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static MapValue parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (MapValue)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static MapValue parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MapValue)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<MapValue> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public boolean containsFields(String string) {
        if (string != null) {
            return this.internalGetFields().containsKey((Object)string);
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
                Class<MapValue> class_ = MapValue.class;
                // MONITORENTER : com.google.firestore.v1.MapValue.class
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
                        if (!this.fields_.isMutable()) {
                            this.fields_ = this.fields_.mutableCopy();
                        }
                        FieldsDefaultEntryHolder.defaultEntry.parseInto(this.fields_, codedInputStream, extensionRegistryLite);
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
                MapValue mapValue = (MapValue)((Object)object2);
                this.fields_ = visitor.visitMap(this.fields_, mapValue.internalGetFields());
                return this;
            }
            case 4: {
                return new Builder();
            }
            case 3: {
                this.fields_.makeImmutable();
                return null;
            }
            case 2: {
                return DEFAULT_INSTANCE;
            }
            case 1: 
        }
        return new MapValue();
    }

    @Deprecated
    public Map<String, Value> getFields() {
        return this.getFieldsMap();
    }

    public int getFieldsCount() {
        return this.internalGetFields().size();
    }

    public Map<String, Value> getFieldsMap() {
        return Collections.unmodifiableMap(this.internalGetFields());
    }

    public Value getFieldsOrDefault(String string, Value value) {
        if (string != null) {
            MapFieldLite<String, Value> mapFieldLite = this.internalGetFields();
            if (mapFieldLite.containsKey((Object)string)) {
                return (Value)((Object)mapFieldLite.get((Object)string));
            }
            return value;
        }
        throw new NullPointerException();
    }

    public Value getFieldsOrThrow(String string) {
        if (string != null) {
            MapFieldLite<String, Value> mapFieldLite = this.internalGetFields();
            if (mapFieldLite.containsKey((Object)string)) {
                return (Value)((Object)mapFieldLite.get((Object)string));
            }
            throw new IllegalArgumentException();
        }
        throw new NullPointerException();
    }

    public int getSerializedSize() {
        int n = this.memoizedSerializedSize;
        if (n != -1) {
            return n;
        }
        int n2 = 0;
        for (Map.Entry entry : this.internalGetFields().entrySet()) {
            n2 += FieldsDefaultEntryHolder.defaultEntry.computeMessageSize(1, (Object)((String)entry.getKey()), (Object)((Value)((Object)entry.getValue())));
        }
        this.memoizedSerializedSize = n2;
        return n2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (Map.Entry entry : this.internalGetFields().entrySet()) {
            FieldsDefaultEntryHolder.defaultEntry.serializeTo(codedOutputStream, 1, (Object)((String)entry.getKey()), (Object)((Value)((Object)entry.getValue())));
        }
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<MapValue, Builder>
    implements MapValueOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder clearFields() {
            this.copyOnWrite();
            ((MapValue)this.instance).getMutableFieldsMap().clear();
            return this;
        }

        public boolean containsFields(String string) {
            if (string != null) {
                return ((MapValue)this.instance).getFieldsMap().containsKey((Object)string);
            }
            throw new NullPointerException();
        }

        @Deprecated
        public Map<String, Value> getFields() {
            return this.getFieldsMap();
        }

        public int getFieldsCount() {
            return ((MapValue)this.instance).getFieldsMap().size();
        }

        public Map<String, Value> getFieldsMap() {
            return Collections.unmodifiableMap(((MapValue)this.instance).getFieldsMap());
        }

        public Value getFieldsOrDefault(String string, Value value) {
            if (string != null) {
                Map<String, Value> map = ((MapValue)this.instance).getFieldsMap();
                if (map.containsKey((Object)string)) {
                    return (Value)((Object)map.get((Object)string));
                }
                return value;
            }
            throw new NullPointerException();
        }

        public Value getFieldsOrThrow(String string) {
            if (string != null) {
                Map<String, Value> map = ((MapValue)this.instance).getFieldsMap();
                if (map.containsKey((Object)string)) {
                    return (Value)((Object)map.get((Object)string));
                }
                throw new IllegalArgumentException();
            }
            throw new NullPointerException();
        }

        public Builder putAllFields(Map<String, Value> map) {
            this.copyOnWrite();
            ((MapValue)this.instance).getMutableFieldsMap().putAll(map);
            return this;
        }

        public Builder putFields(String string, Value value) {
            if (string != null) {
                if (value != null) {
                    this.copyOnWrite();
                    ((MapValue)this.instance).getMutableFieldsMap().put((Object)string, (Object)value);
                    return this;
                }
                throw new NullPointerException();
            }
            throw new NullPointerException();
        }

        public Builder removeFields(String string) {
            if (string != null) {
                this.copyOnWrite();
                ((MapValue)this.instance).getMutableFieldsMap().remove((Object)string);
                return this;
            }
            throw new NullPointerException();
        }
    }

}

