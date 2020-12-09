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
 *  java.lang.Long
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

import com.google.api.MetricRuleOrBuilder;
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

public final class MetricRule
extends GeneratedMessageLite<MetricRule, Builder>
implements MetricRuleOrBuilder {
    private static final MetricRule DEFAULT_INSTANCE = new MetricRule();
    public static final int METRIC_COSTS_FIELD_NUMBER = 2;
    private static volatile Parser<MetricRule> PARSER;
    public static final int SELECTOR_FIELD_NUMBER = 1;
    private int bitField0_;
    private MapFieldLite<String, Long> metricCosts_ = MapFieldLite.emptyMapField();
    private String selector_ = "";

    static {
        DEFAULT_INSTANCE.makeImmutable();
    }

    private MetricRule() {
    }

    private void clearSelector() {
        this.selector_ = MetricRule.getDefaultInstance().getSelector();
    }

    public static MetricRule getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private Map<String, Long> getMutableMetricCostsMap() {
        return this.internalGetMutableMetricCosts();
    }

    private MapFieldLite<String, Long> internalGetMetricCosts() {
        return this.metricCosts_;
    }

    private MapFieldLite<String, Long> internalGetMutableMetricCosts() {
        if (!this.metricCosts_.isMutable()) {
            this.metricCosts_ = this.metricCosts_.mutableCopy();
        }
        return this.metricCosts_;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(MetricRule metricRule) {
        return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)metricRule);
    }

    public static MetricRule parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MetricRule)MetricRule.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static MetricRule parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MetricRule)MetricRule.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static MetricRule parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (MetricRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static MetricRule parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MetricRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static MetricRule parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (MetricRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static MetricRule parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MetricRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static MetricRule parseFrom(InputStream inputStream) throws IOException {
        return (MetricRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static MetricRule parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MetricRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static MetricRule parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (MetricRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static MetricRule parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MetricRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<MetricRule> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setSelector(String string2) {
        if (string2 != null) {
            this.selector_ = string2;
            return;
        }
        throw new NullPointerException();
    }

    private void setSelectorBytes(ByteString byteString) {
        if (byteString != null) {
            MetricRule.checkByteStringIsUtf8((ByteString)byteString);
            this.selector_ = byteString.toStringUtf8();
            return;
        }
        throw new NullPointerException();
    }

    @Override
    public boolean containsMetricCosts(String string2) {
        if (string2 != null) {
            return this.internalGetMetricCosts().containsKey((Object)string2);
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
                Class<MetricRule> class_ = MetricRule.class;
                // MONITORENTER : com.google.api.MetricRule.class
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
                            if (!this.metricCosts_.isMutable()) {
                                this.metricCosts_ = this.metricCosts_.mutableCopy();
                            }
                            MetricCostsDefaultEntryHolder.defaultEntry.parseInto(this.metricCosts_, codedInputStream, extensionRegistryLite);
                            continue;
                        }
                        this.selector_ = codedInputStream.readStringRequireUtf8();
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
                MetricRule metricRule = (MetricRule)object2;
                this.selector_ = visitor.visitString(true ^ this.selector_.isEmpty(), this.selector_, true ^ metricRule.selector_.isEmpty(), metricRule.selector_);
                this.metricCosts_ = visitor.visitMap(this.metricCosts_, metricRule.internalGetMetricCosts());
                if (visitor != GeneratedMessageLite.MergeFromVisitor.INSTANCE) return this;
                this.bitField0_ |= metricRule.bitField0_;
                return this;
            }
            case 4: {
                return new Builder();
            }
            case 3: {
                this.metricCosts_.makeImmutable();
                return null;
            }
            case 2: {
                return DEFAULT_INSTANCE;
            }
            case 1: 
        }
        return new MetricRule();
    }

    @Deprecated
    @Override
    public Map<String, Long> getMetricCosts() {
        return this.getMetricCostsMap();
    }

    @Override
    public int getMetricCostsCount() {
        return this.internalGetMetricCosts().size();
    }

    @Override
    public Map<String, Long> getMetricCostsMap() {
        return Collections.unmodifiableMap(this.internalGetMetricCosts());
    }

    @Override
    public long getMetricCostsOrDefault(String string2, long l) {
        if (string2 != null) {
            MapFieldLite<String, Long> mapFieldLite = this.internalGetMetricCosts();
            if (mapFieldLite.containsKey((Object)string2)) {
                return (Long)mapFieldLite.get((Object)string2);
            }
            return l;
        }
        throw new NullPointerException();
    }

    @Override
    public long getMetricCostsOrThrow(String string2) {
        if (string2 != null) {
            MapFieldLite<String, Long> mapFieldLite = this.internalGetMetricCosts();
            if (mapFieldLite.containsKey((Object)string2)) {
                return (Long)mapFieldLite.get((Object)string2);
            }
            throw new IllegalArgumentException();
        }
        throw new NullPointerException();
    }

    @Override
    public String getSelector() {
        return this.selector_;
    }

    @Override
    public ByteString getSelectorBytes() {
        return ByteString.copyFromUtf8((String)this.selector_);
    }

    public int getSerializedSize() {
        int n = this.memoizedSerializedSize;
        if (n != -1) {
            return n;
        }
        boolean bl = this.selector_.isEmpty();
        int n2 = 0;
        if (!bl) {
            n2 = 0 + CodedOutputStream.computeStringSize((int)1, (String)this.getSelector());
        }
        for (Map.Entry entry : this.internalGetMetricCosts().entrySet()) {
            n2 += MetricCostsDefaultEntryHolder.defaultEntry.computeMessageSize(2, (Object)((String)entry.getKey()), (Object)((Long)entry.getValue()));
        }
        this.memoizedSerializedSize = n2;
        return n2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.selector_.isEmpty()) {
            codedOutputStream.writeString(1, this.getSelector());
        }
        for (Map.Entry entry : this.internalGetMetricCosts().entrySet()) {
            MetricCostsDefaultEntryHolder.defaultEntry.serializeTo(codedOutputStream, 2, (Object)((String)entry.getKey()), (Object)((Long)entry.getValue()));
        }
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<MetricRule, Builder>
    implements MetricRuleOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder clearMetricCosts() {
            this.copyOnWrite();
            ((MetricRule)this.instance).getMutableMetricCostsMap().clear();
            return this;
        }

        public Builder clearSelector() {
            this.copyOnWrite();
            ((MetricRule)this.instance).clearSelector();
            return this;
        }

        @Override
        public boolean containsMetricCosts(String string2) {
            if (string2 != null) {
                return ((MetricRule)this.instance).getMetricCostsMap().containsKey((Object)string2);
            }
            throw new NullPointerException();
        }

        @Deprecated
        @Override
        public Map<String, Long> getMetricCosts() {
            return this.getMetricCostsMap();
        }

        @Override
        public int getMetricCostsCount() {
            return ((MetricRule)this.instance).getMetricCostsMap().size();
        }

        @Override
        public Map<String, Long> getMetricCostsMap() {
            return Collections.unmodifiableMap(((MetricRule)this.instance).getMetricCostsMap());
        }

        @Override
        public long getMetricCostsOrDefault(String string2, long l) {
            if (string2 != null) {
                Map<String, Long> map = ((MetricRule)this.instance).getMetricCostsMap();
                if (map.containsKey((Object)string2)) {
                    return (Long)map.get((Object)string2);
                }
                return l;
            }
            throw new NullPointerException();
        }

        @Override
        public long getMetricCostsOrThrow(String string2) {
            if (string2 != null) {
                Map<String, Long> map = ((MetricRule)this.instance).getMetricCostsMap();
                if (map.containsKey((Object)string2)) {
                    return (Long)map.get((Object)string2);
                }
                throw new IllegalArgumentException();
            }
            throw new NullPointerException();
        }

        @Override
        public String getSelector() {
            return ((MetricRule)this.instance).getSelector();
        }

        @Override
        public ByteString getSelectorBytes() {
            return ((MetricRule)this.instance).getSelectorBytes();
        }

        public Builder putAllMetricCosts(Map<String, Long> map) {
            this.copyOnWrite();
            ((MetricRule)this.instance).getMutableMetricCostsMap().putAll(map);
            return this;
        }

        public Builder putMetricCosts(String string2, long l) {
            if (string2 != null) {
                this.copyOnWrite();
                ((MetricRule)this.instance).getMutableMetricCostsMap().put((Object)string2, (Object)l);
                return this;
            }
            throw new NullPointerException();
        }

        public Builder removeMetricCosts(String string2) {
            if (string2 != null) {
                this.copyOnWrite();
                ((MetricRule)this.instance).getMutableMetricCostsMap().remove((Object)string2);
                return this;
            }
            throw new NullPointerException();
        }

        public Builder setSelector(String string2) {
            this.copyOnWrite();
            ((MetricRule)this.instance).setSelector(string2);
            return this;
        }

        public Builder setSelectorBytes(ByteString byteString) {
            this.copyOnWrite();
            ((MetricRule)this.instance).setSelectorBytes(byteString);
            return this;
        }
    }

    private static final class MetricCostsDefaultEntryHolder {
        static final MapEntryLite<String, Long> defaultEntry = MapEntryLite.newDefaultInstance((WireFormat.FieldType)WireFormat.FieldType.STRING, (Object)"", (WireFormat.FieldType)WireFormat.FieldType.INT64, (Object)0L);

        private MetricCostsDefaultEntryHolder() {
        }
    }

}

