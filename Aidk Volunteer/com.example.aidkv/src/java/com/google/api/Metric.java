/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
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
 *  com.google.protobuf.WireFormat
 *  com.google.protobuf.WireFormat$FieldType
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.Class
 *  java.lang.Deprecated
 *  java.lang.IllegalArgumentException
 *  java.lang.NoSuchFieldError
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
package com.google.api;

import com.google.api.MetricOrBuilder;
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
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

public final class Metric
extends GeneratedMessageLite<Metric, Builder>
implements MetricOrBuilder {
    private static final Metric DEFAULT_INSTANCE = new Metric();
    public static final int LABELS_FIELD_NUMBER = 2;
    private static volatile Parser<Metric> PARSER;
    public static final int TYPE_FIELD_NUMBER = 3;
    private int bitField0_;
    private MapFieldLite<String, String> labels_ = MapFieldLite.emptyMapField();
    private String type_ = "";

    static {
        DEFAULT_INSTANCE.makeImmutable();
    }

    private Metric() {
    }

    private void clearType() {
        this.type_ = Metric.getDefaultInstance().getType();
    }

    public static Metric getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private Map<String, String> getMutableLabelsMap() {
        return this.internalGetMutableLabels();
    }

    private MapFieldLite<String, String> internalGetLabels() {
        return this.labels_;
    }

    private MapFieldLite<String, String> internalGetMutableLabels() {
        if (!this.labels_.isMutable()) {
            this.labels_ = this.labels_.mutableCopy();
        }
        return this.labels_;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(Metric metric) {
        return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)metric);
    }

    public static Metric parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Metric)Metric.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Metric parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Metric)Metric.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Metric parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Metric)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static Metric parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Metric)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Metric parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Metric)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static Metric parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Metric)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Metric parseFrom(InputStream inputStream) throws IOException {
        return (Metric)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Metric parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Metric)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Metric parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (Metric)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static Metric parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Metric)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<Metric> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setType(String string2) {
        if (string2 != null) {
            this.type_ = string2;
            return;
        }
        throw new NullPointerException();
    }

    private void setTypeBytes(ByteString byteString) {
        if (byteString != null) {
            Metric.checkByteStringIsUtf8((ByteString)byteString);
            this.type_ = byteString.toStringUtf8();
            return;
        }
        throw new NullPointerException();
    }

    @Override
    public boolean containsLabels(String string2) {
        if (string2 != null) {
            return this.internalGetLabels().containsKey((Object)string2);
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
                Class<Metric> class_ = Metric.class;
                // MONITORENTER : com.google.api.Metric.class
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
                        if (n != 18) {
                            if (n != 26) {
                                if (codedInputStream.skipField(n)) continue;
                                bl = true;
                                continue;
                            }
                            this.type_ = codedInputStream.readStringRequireUtf8();
                            continue;
                        }
                        if (!this.labels_.isMutable()) {
                            this.labels_ = this.labels_.mutableCopy();
                        }
                        LabelsDefaultEntryHolder.defaultEntry.parseInto(this.labels_, codedInputStream, extensionRegistryLite);
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
                Metric metric = (Metric)object2;
                this.type_ = visitor.visitString(true ^ this.type_.isEmpty(), this.type_, true ^ metric.type_.isEmpty(), metric.type_);
                this.labels_ = visitor.visitMap(this.labels_, metric.internalGetLabels());
                if (visitor != GeneratedMessageLite.MergeFromVisitor.INSTANCE) return this;
                this.bitField0_ |= metric.bitField0_;
                return this;
            }
            case 4: {
                return new Builder();
            }
            case 3: {
                this.labels_.makeImmutable();
                return null;
            }
            case 2: {
                return DEFAULT_INSTANCE;
            }
            case 1: 
        }
        return new Metric();
    }

    @Deprecated
    @Override
    public Map<String, String> getLabels() {
        return this.getLabelsMap();
    }

    @Override
    public int getLabelsCount() {
        return this.internalGetLabels().size();
    }

    @Override
    public Map<String, String> getLabelsMap() {
        return Collections.unmodifiableMap(this.internalGetLabels());
    }

    @Override
    public String getLabelsOrDefault(String string2, String string3) {
        if (string2 != null) {
            MapFieldLite<String, String> mapFieldLite = this.internalGetLabels();
            if (mapFieldLite.containsKey((Object)string2)) {
                return (String)mapFieldLite.get((Object)string2);
            }
            return string3;
        }
        throw new NullPointerException();
    }

    @Override
    public String getLabelsOrThrow(String string2) {
        if (string2 != null) {
            MapFieldLite<String, String> mapFieldLite = this.internalGetLabels();
            if (mapFieldLite.containsKey((Object)string2)) {
                return (String)mapFieldLite.get((Object)string2);
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
        for (Map.Entry entry : this.internalGetLabels().entrySet()) {
            n2 += LabelsDefaultEntryHolder.defaultEntry.computeMessageSize(2, (Object)((String)entry.getKey()), (Object)((String)entry.getValue()));
        }
        if (!this.type_.isEmpty()) {
            n2 += CodedOutputStream.computeStringSize((int)3, (String)this.getType());
        }
        this.memoizedSerializedSize = n2;
        return n2;
    }

    @Override
    public String getType() {
        return this.type_;
    }

    @Override
    public ByteString getTypeBytes() {
        return ByteString.copyFromUtf8((String)this.type_);
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (Map.Entry entry : this.internalGetLabels().entrySet()) {
            LabelsDefaultEntryHolder.defaultEntry.serializeTo(codedOutputStream, 2, (Object)((String)entry.getKey()), (Object)((String)entry.getValue()));
        }
        if (!this.type_.isEmpty()) {
            codedOutputStream.writeString(3, this.getType());
        }
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<Metric, Builder>
    implements MetricOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder clearLabels() {
            this.copyOnWrite();
            ((Metric)this.instance).getMutableLabelsMap().clear();
            return this;
        }

        public Builder clearType() {
            this.copyOnWrite();
            ((Metric)this.instance).clearType();
            return this;
        }

        @Override
        public boolean containsLabels(String string2) {
            if (string2 != null) {
                return ((Metric)this.instance).getLabelsMap().containsKey((Object)string2);
            }
            throw new NullPointerException();
        }

        @Deprecated
        @Override
        public Map<String, String> getLabels() {
            return this.getLabelsMap();
        }

        @Override
        public int getLabelsCount() {
            return ((Metric)this.instance).getLabelsMap().size();
        }

        @Override
        public Map<String, String> getLabelsMap() {
            return Collections.unmodifiableMap(((Metric)this.instance).getLabelsMap());
        }

        @Override
        public String getLabelsOrDefault(String string2, String string3) {
            if (string2 != null) {
                Map<String, String> map = ((Metric)this.instance).getLabelsMap();
                if (map.containsKey((Object)string2)) {
                    return (String)map.get((Object)string2);
                }
                return string3;
            }
            throw new NullPointerException();
        }

        @Override
        public String getLabelsOrThrow(String string2) {
            if (string2 != null) {
                Map<String, String> map = ((Metric)this.instance).getLabelsMap();
                if (map.containsKey((Object)string2)) {
                    return (String)map.get((Object)string2);
                }
                throw new IllegalArgumentException();
            }
            throw new NullPointerException();
        }

        @Override
        public String getType() {
            return ((Metric)this.instance).getType();
        }

        @Override
        public ByteString getTypeBytes() {
            return ((Metric)this.instance).getTypeBytes();
        }

        public Builder putAllLabels(Map<String, String> map) {
            this.copyOnWrite();
            ((Metric)this.instance).getMutableLabelsMap().putAll(map);
            return this;
        }

        public Builder putLabels(String string2, String string3) {
            if (string2 != null) {
                if (string3 != null) {
                    this.copyOnWrite();
                    ((Metric)this.instance).getMutableLabelsMap().put((Object)string2, (Object)string3);
                    return this;
                }
                throw new NullPointerException();
            }
            throw new NullPointerException();
        }

        public Builder removeLabels(String string2) {
            if (string2 != null) {
                this.copyOnWrite();
                ((Metric)this.instance).getMutableLabelsMap().remove((Object)string2);
                return this;
            }
            throw new NullPointerException();
        }

        public Builder setType(String string2) {
            this.copyOnWrite();
            ((Metric)this.instance).setType(string2);
            return this;
        }

        public Builder setTypeBytes(ByteString byteString) {
            this.copyOnWrite();
            ((Metric)this.instance).setTypeBytes(byteString);
            return this;
        }
    }

    private static final class LabelsDefaultEntryHolder {
        static final MapEntryLite<String, String> defaultEntry = MapEntryLite.newDefaultInstance((WireFormat.FieldType)WireFormat.FieldType.STRING, (Object)"", (WireFormat.FieldType)WireFormat.FieldType.STRING, (Object)"");

        private LabelsDefaultEntryHolder() {
        }
    }

}

