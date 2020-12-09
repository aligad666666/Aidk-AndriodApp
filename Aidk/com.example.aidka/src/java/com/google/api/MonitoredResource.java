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

import com.google.api.MonitoredResourceOrBuilder;
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

public final class MonitoredResource
extends GeneratedMessageLite<MonitoredResource, Builder>
implements MonitoredResourceOrBuilder {
    private static final MonitoredResource DEFAULT_INSTANCE = new MonitoredResource();
    public static final int LABELS_FIELD_NUMBER = 2;
    private static volatile Parser<MonitoredResource> PARSER;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int bitField0_;
    private MapFieldLite<String, String> labels_ = MapFieldLite.emptyMapField();
    private String type_ = "";

    static {
        DEFAULT_INSTANCE.makeImmutable();
    }

    private MonitoredResource() {
    }

    private void clearType() {
        this.type_ = MonitoredResource.getDefaultInstance().getType();
    }

    public static MonitoredResource getDefaultInstance() {
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

    public static Builder newBuilder(MonitoredResource monitoredResource) {
        return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)monitoredResource);
    }

    public static MonitoredResource parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MonitoredResource)MonitoredResource.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static MonitoredResource parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MonitoredResource)MonitoredResource.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static MonitoredResource parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (MonitoredResource)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static MonitoredResource parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MonitoredResource)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static MonitoredResource parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (MonitoredResource)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static MonitoredResource parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MonitoredResource)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static MonitoredResource parseFrom(InputStream inputStream) throws IOException {
        return (MonitoredResource)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static MonitoredResource parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MonitoredResource)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static MonitoredResource parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (MonitoredResource)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static MonitoredResource parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MonitoredResource)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<MonitoredResource> parser() {
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
            MonitoredResource.checkByteStringIsUtf8((ByteString)byteString);
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
                Class<MonitoredResource> class_ = MonitoredResource.class;
                // MONITORENTER : com.google.api.MonitoredResource.class
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
                                if (codedInputStream.skipField(n)) continue;
                                bl = true;
                                continue;
                            }
                            if (!this.labels_.isMutable()) {
                                this.labels_ = this.labels_.mutableCopy();
                            }
                            LabelsDefaultEntryHolder.defaultEntry.parseInto(this.labels_, codedInputStream, extensionRegistryLite);
                            continue;
                        }
                        this.type_ = codedInputStream.readStringRequireUtf8();
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
                MonitoredResource monitoredResource = (MonitoredResource)object2;
                this.type_ = visitor.visitString(true ^ this.type_.isEmpty(), this.type_, true ^ monitoredResource.type_.isEmpty(), monitoredResource.type_);
                this.labels_ = visitor.visitMap(this.labels_, monitoredResource.internalGetLabels());
                if (visitor != GeneratedMessageLite.MergeFromVisitor.INSTANCE) return this;
                this.bitField0_ |= monitoredResource.bitField0_;
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
        return new MonitoredResource();
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
        boolean bl = this.type_.isEmpty();
        int n2 = 0;
        if (!bl) {
            n2 = 0 + CodedOutputStream.computeStringSize((int)1, (String)this.getType());
        }
        for (Map.Entry entry : this.internalGetLabels().entrySet()) {
            n2 += LabelsDefaultEntryHolder.defaultEntry.computeMessageSize(2, (Object)((String)entry.getKey()), (Object)((String)entry.getValue()));
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
        if (!this.type_.isEmpty()) {
            codedOutputStream.writeString(1, this.getType());
        }
        for (Map.Entry entry : this.internalGetLabels().entrySet()) {
            LabelsDefaultEntryHolder.defaultEntry.serializeTo(codedOutputStream, 2, (Object)((String)entry.getKey()), (Object)((String)entry.getValue()));
        }
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<MonitoredResource, Builder>
    implements MonitoredResourceOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder clearLabels() {
            this.copyOnWrite();
            ((MonitoredResource)this.instance).getMutableLabelsMap().clear();
            return this;
        }

        public Builder clearType() {
            this.copyOnWrite();
            ((MonitoredResource)this.instance).clearType();
            return this;
        }

        @Override
        public boolean containsLabels(String string2) {
            if (string2 != null) {
                return ((MonitoredResource)this.instance).getLabelsMap().containsKey((Object)string2);
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
            return ((MonitoredResource)this.instance).getLabelsMap().size();
        }

        @Override
        public Map<String, String> getLabelsMap() {
            return Collections.unmodifiableMap(((MonitoredResource)this.instance).getLabelsMap());
        }

        @Override
        public String getLabelsOrDefault(String string2, String string3) {
            if (string2 != null) {
                Map<String, String> map = ((MonitoredResource)this.instance).getLabelsMap();
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
                Map<String, String> map = ((MonitoredResource)this.instance).getLabelsMap();
                if (map.containsKey((Object)string2)) {
                    return (String)map.get((Object)string2);
                }
                throw new IllegalArgumentException();
            }
            throw new NullPointerException();
        }

        @Override
        public String getType() {
            return ((MonitoredResource)this.instance).getType();
        }

        @Override
        public ByteString getTypeBytes() {
            return ((MonitoredResource)this.instance).getTypeBytes();
        }

        public Builder putAllLabels(Map<String, String> map) {
            this.copyOnWrite();
            ((MonitoredResource)this.instance).getMutableLabelsMap().putAll(map);
            return this;
        }

        public Builder putLabels(String string2, String string3) {
            if (string2 != null) {
                if (string3 != null) {
                    this.copyOnWrite();
                    ((MonitoredResource)this.instance).getMutableLabelsMap().put((Object)string2, (Object)string3);
                    return this;
                }
                throw new NullPointerException();
            }
            throw new NullPointerException();
        }

        public Builder removeLabels(String string2) {
            if (string2 != null) {
                this.copyOnWrite();
                ((MonitoredResource)this.instance).getMutableLabelsMap().remove((Object)string2);
                return this;
            }
            throw new NullPointerException();
        }

        public Builder setType(String string2) {
            this.copyOnWrite();
            ((MonitoredResource)this.instance).setType(string2);
            return this;
        }

        public Builder setTypeBytes(ByteString byteString) {
            this.copyOnWrite();
            ((MonitoredResource)this.instance).setTypeBytes(byteString);
            return this;
        }
    }

    private static final class LabelsDefaultEntryHolder {
        static final MapEntryLite<String, String> defaultEntry = MapEntryLite.newDefaultInstance((WireFormat.FieldType)WireFormat.FieldType.STRING, (Object)"", (WireFormat.FieldType)WireFormat.FieldType.STRING, (Object)"");

        private LabelsDefaultEntryHolder() {
        }
    }

}

