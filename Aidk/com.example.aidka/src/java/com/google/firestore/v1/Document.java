/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.firestore.v1.Document$1
 *  com.google.firestore.v1.Document$FieldsDefaultEntryHolder
 *  com.google.firestore.v1.DocumentOrBuilder
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
 *  com.google.protobuf.MapEntryLite
 *  com.google.protobuf.MapFieldLite
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.Parser
 *  com.google.protobuf.Timestamp
 *  com.google.protobuf.Timestamp$Builder
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

import com.google.firestore.v1.Document;
import com.google.firestore.v1.DocumentOrBuilder;
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
import com.google.protobuf.Timestamp;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

public final class Document
extends GeneratedMessageLite<Document, Builder>
implements DocumentOrBuilder {
    public static final int CREATE_TIME_FIELD_NUMBER = 3;
    private static final Document DEFAULT_INSTANCE = new Document();
    public static final int FIELDS_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<Document> PARSER;
    public static final int UPDATE_TIME_FIELD_NUMBER = 4;
    private int bitField0_;
    private Timestamp createTime_;
    private MapFieldLite<String, Value> fields_ = MapFieldLite.emptyMapField();
    private String name_ = "";
    private Timestamp updateTime_;

    static {
        DEFAULT_INSTANCE.makeImmutable();
    }

    private Document() {
    }

    private void clearCreateTime() {
        this.createTime_ = null;
    }

    private void clearName() {
        this.name_ = Document.getDefaultInstance().getName();
    }

    private void clearUpdateTime() {
        this.updateTime_ = null;
    }

    public static Document getDefaultInstance() {
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

    private void mergeCreateTime(Timestamp timestamp) {
        Timestamp timestamp2 = this.createTime_;
        if (timestamp2 != null && timestamp2 != Timestamp.getDefaultInstance()) {
            this.createTime_ = (Timestamp)((Timestamp.Builder)Timestamp.newBuilder((Timestamp)this.createTime_).mergeFrom((GeneratedMessageLite)timestamp)).buildPartial();
            return;
        }
        this.createTime_ = timestamp;
    }

    private void mergeUpdateTime(Timestamp timestamp) {
        Timestamp timestamp2 = this.updateTime_;
        if (timestamp2 != null && timestamp2 != Timestamp.getDefaultInstance()) {
            this.updateTime_ = (Timestamp)((Timestamp.Builder)Timestamp.newBuilder((Timestamp)this.updateTime_).mergeFrom((GeneratedMessageLite)timestamp)).buildPartial();
            return;
        }
        this.updateTime_ = timestamp;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(Document document) {
        return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)document);
    }

    public static Document parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Document)Document.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Document parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Document)Document.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Document parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Document)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static Document parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Document)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Document parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Document)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static Document parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Document)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Document parseFrom(InputStream inputStream) throws IOException {
        return (Document)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Document parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Document)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Document parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (Document)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static Document parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Document)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<Document> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setCreateTime(Timestamp.Builder builder) {
        this.createTime_ = (Timestamp)builder.build();
    }

    private void setCreateTime(Timestamp timestamp) {
        if (timestamp != null) {
            this.createTime_ = timestamp;
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
            Document.checkByteStringIsUtf8((ByteString)byteString);
            this.name_ = byteString.toStringUtf8();
            return;
        }
        throw new NullPointerException();
    }

    private void setUpdateTime(Timestamp.Builder builder) {
        this.updateTime_ = (Timestamp)builder.build();
    }

    private void setUpdateTime(Timestamp timestamp) {
        if (timestamp != null) {
            this.updateTime_ = timestamp;
            return;
        }
        throw new NullPointerException();
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
                Class<Document> class_ = Document.class;
                // MONITORENTER : com.google.firestore.v1.Document.class
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
                                    if (n != 34) {
                                        if (codedInputStream.skipField(n)) continue;
                                        bl = true;
                                        continue;
                                    }
                                    Timestamp timestamp = this.updateTime_;
                                    Timestamp.Builder builder = null;
                                    if (timestamp != null) {
                                        builder = (Timestamp.Builder)this.updateTime_.toBuilder();
                                    }
                                    this.updateTime_ = (Timestamp)codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                    if (builder == null) continue;
                                    builder.mergeFrom((GeneratedMessageLite)this.updateTime_);
                                    this.updateTime_ = (Timestamp)builder.buildPartial();
                                    continue;
                                }
                                Timestamp timestamp = this.createTime_;
                                Timestamp.Builder builder = null;
                                if (timestamp != null) {
                                    builder = (Timestamp.Builder)this.createTime_.toBuilder();
                                }
                                this.createTime_ = (Timestamp)codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder == null) continue;
                                builder.mergeFrom((GeneratedMessageLite)this.createTime_);
                                this.createTime_ = (Timestamp)builder.buildPartial();
                                continue;
                            }
                            if (!this.fields_.isMutable()) {
                                this.fields_ = this.fields_.mutableCopy();
                            }
                            FieldsDefaultEntryHolder.defaultEntry.parseInto(this.fields_, codedInputStream, extensionRegistryLite);
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
                Document document = (Document)((Object)object2);
                this.name_ = visitor.visitString(true ^ this.name_.isEmpty(), this.name_, true ^ document.name_.isEmpty(), document.name_);
                this.fields_ = visitor.visitMap(this.fields_, document.internalGetFields());
                this.createTime_ = (Timestamp)visitor.visitMessage((MessageLite)this.createTime_, (MessageLite)document.createTime_);
                this.updateTime_ = (Timestamp)visitor.visitMessage((MessageLite)this.updateTime_, (MessageLite)document.updateTime_);
                if (visitor != GeneratedMessageLite.MergeFromVisitor.INSTANCE) return this;
                this.bitField0_ |= document.bitField0_;
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
        return new Document();
    }

    public Timestamp getCreateTime() {
        Timestamp timestamp = this.createTime_;
        if (timestamp == null) {
            timestamp = Timestamp.getDefaultInstance();
        }
        return timestamp;
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

    public String getName() {
        return this.name_;
    }

    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8((String)this.name_);
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
        for (Map.Entry entry : this.internalGetFields().entrySet()) {
            n2 += FieldsDefaultEntryHolder.defaultEntry.computeMessageSize(2, (Object)((String)entry.getKey()), (Object)((Value)((Object)entry.getValue())));
        }
        if (this.createTime_ != null) {
            n2 += CodedOutputStream.computeMessageSize((int)3, (MessageLite)this.getCreateTime());
        }
        if (this.updateTime_ != null) {
            n2 += CodedOutputStream.computeMessageSize((int)4, (MessageLite)this.getUpdateTime());
        }
        this.memoizedSerializedSize = n2;
        return n2;
    }

    public Timestamp getUpdateTime() {
        Timestamp timestamp = this.updateTime_;
        if (timestamp == null) {
            timestamp = Timestamp.getDefaultInstance();
        }
        return timestamp;
    }

    public boolean hasCreateTime() {
        return this.createTime_ != null;
    }

    public boolean hasUpdateTime() {
        return this.updateTime_ != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.name_.isEmpty()) {
            codedOutputStream.writeString(1, this.getName());
        }
        for (Map.Entry entry : this.internalGetFields().entrySet()) {
            FieldsDefaultEntryHolder.defaultEntry.serializeTo(codedOutputStream, 2, (Object)((String)entry.getKey()), (Object)((Value)((Object)entry.getValue())));
        }
        if (this.createTime_ != null) {
            codedOutputStream.writeMessage(3, (MessageLite)this.getCreateTime());
        }
        if (this.updateTime_ != null) {
            codedOutputStream.writeMessage(4, (MessageLite)this.getUpdateTime());
        }
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<Document, Builder>
    implements DocumentOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder clearCreateTime() {
            this.copyOnWrite();
            ((Document)this.instance).clearCreateTime();
            return this;
        }

        public Builder clearFields() {
            this.copyOnWrite();
            ((Document)this.instance).getMutableFieldsMap().clear();
            return this;
        }

        public Builder clearName() {
            this.copyOnWrite();
            ((Document)this.instance).clearName();
            return this;
        }

        public Builder clearUpdateTime() {
            this.copyOnWrite();
            ((Document)this.instance).clearUpdateTime();
            return this;
        }

        public boolean containsFields(String string) {
            if (string != null) {
                return ((Document)this.instance).getFieldsMap().containsKey((Object)string);
            }
            throw new NullPointerException();
        }

        public Timestamp getCreateTime() {
            return ((Document)this.instance).getCreateTime();
        }

        @Deprecated
        public Map<String, Value> getFields() {
            return this.getFieldsMap();
        }

        public int getFieldsCount() {
            return ((Document)this.instance).getFieldsMap().size();
        }

        public Map<String, Value> getFieldsMap() {
            return Collections.unmodifiableMap(((Document)this.instance).getFieldsMap());
        }

        public Value getFieldsOrDefault(String string, Value value) {
            if (string != null) {
                Map<String, Value> map = ((Document)this.instance).getFieldsMap();
                if (map.containsKey((Object)string)) {
                    return (Value)((Object)map.get((Object)string));
                }
                return value;
            }
            throw new NullPointerException();
        }

        public Value getFieldsOrThrow(String string) {
            if (string != null) {
                Map<String, Value> map = ((Document)this.instance).getFieldsMap();
                if (map.containsKey((Object)string)) {
                    return (Value)((Object)map.get((Object)string));
                }
                throw new IllegalArgumentException();
            }
            throw new NullPointerException();
        }

        public String getName() {
            return ((Document)this.instance).getName();
        }

        public ByteString getNameBytes() {
            return ((Document)this.instance).getNameBytes();
        }

        public Timestamp getUpdateTime() {
            return ((Document)this.instance).getUpdateTime();
        }

        public boolean hasCreateTime() {
            return ((Document)this.instance).hasCreateTime();
        }

        public boolean hasUpdateTime() {
            return ((Document)this.instance).hasUpdateTime();
        }

        public Builder mergeCreateTime(Timestamp timestamp) {
            this.copyOnWrite();
            ((Document)this.instance).mergeCreateTime(timestamp);
            return this;
        }

        public Builder mergeUpdateTime(Timestamp timestamp) {
            this.copyOnWrite();
            ((Document)this.instance).mergeUpdateTime(timestamp);
            return this;
        }

        public Builder putAllFields(Map<String, Value> map) {
            this.copyOnWrite();
            ((Document)this.instance).getMutableFieldsMap().putAll(map);
            return this;
        }

        public Builder putFields(String string, Value value) {
            if (string != null) {
                if (value != null) {
                    this.copyOnWrite();
                    ((Document)this.instance).getMutableFieldsMap().put((Object)string, (Object)value);
                    return this;
                }
                throw new NullPointerException();
            }
            throw new NullPointerException();
        }

        public Builder removeFields(String string) {
            if (string != null) {
                this.copyOnWrite();
                ((Document)this.instance).getMutableFieldsMap().remove((Object)string);
                return this;
            }
            throw new NullPointerException();
        }

        public Builder setCreateTime(Timestamp.Builder builder) {
            this.copyOnWrite();
            ((Document)this.instance).setCreateTime(builder);
            return this;
        }

        public Builder setCreateTime(Timestamp timestamp) {
            this.copyOnWrite();
            ((Document)this.instance).setCreateTime(timestamp);
            return this;
        }

        public Builder setName(String string) {
            this.copyOnWrite();
            ((Document)this.instance).setName(string);
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            this.copyOnWrite();
            ((Document)this.instance).setNameBytes(byteString);
            return this;
        }

        public Builder setUpdateTime(Timestamp.Builder builder) {
            this.copyOnWrite();
            ((Document)this.instance).setUpdateTime(builder);
            return this;
        }

        public Builder setUpdateTime(Timestamp timestamp) {
            this.copyOnWrite();
            ((Document)this.instance).setUpdateTime(timestamp);
            return this;
        }
    }

}

