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
 *  com.google.protobuf.GeneratedMessageLite$MethodToInvoke
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.MapEntryLite
 *  com.google.protobuf.MapFieldLite
 *  com.google.protobuf.Parser
 *  com.google.protobuf.WireFormat
 *  com.google.protobuf.WireFormat$FieldType
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.Deprecated
 *  java.lang.IllegalArgumentException
 *  java.lang.Long
 *  java.lang.NoSuchFieldError
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Collections
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
package com.google.api;

import com.google.api.QuotaLimitOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.Parser;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

public final class QuotaLimit
extends GeneratedMessageLite<QuotaLimit, Builder>
implements QuotaLimitOrBuilder {
    private static final QuotaLimit DEFAULT_INSTANCE = new QuotaLimit();
    public static final int DEFAULT_LIMIT_FIELD_NUMBER = 3;
    public static final int DESCRIPTION_FIELD_NUMBER = 2;
    public static final int DISPLAY_NAME_FIELD_NUMBER = 12;
    public static final int DURATION_FIELD_NUMBER = 5;
    public static final int FREE_TIER_FIELD_NUMBER = 7;
    public static final int MAX_LIMIT_FIELD_NUMBER = 4;
    public static final int METRIC_FIELD_NUMBER = 8;
    public static final int NAME_FIELD_NUMBER = 6;
    private static volatile Parser<QuotaLimit> PARSER;
    public static final int UNIT_FIELD_NUMBER = 9;
    public static final int VALUES_FIELD_NUMBER = 10;
    private int bitField0_;
    private long defaultLimit_;
    private String description_ = "";
    private String displayName_ = "";
    private String duration_ = "";
    private long freeTier_;
    private long maxLimit_;
    private String metric_ = "";
    private String name_ = "";
    private String unit_ = "";
    private MapFieldLite<String, Long> values_ = MapFieldLite.emptyMapField();

    static {
        DEFAULT_INSTANCE.makeImmutable();
    }

    private QuotaLimit() {
    }

    private void clearDefaultLimit() {
        this.defaultLimit_ = 0L;
    }

    private void clearDescription() {
        this.description_ = QuotaLimit.getDefaultInstance().getDescription();
    }

    private void clearDisplayName() {
        this.displayName_ = QuotaLimit.getDefaultInstance().getDisplayName();
    }

    private void clearDuration() {
        this.duration_ = QuotaLimit.getDefaultInstance().getDuration();
    }

    private void clearFreeTier() {
        this.freeTier_ = 0L;
    }

    private void clearMaxLimit() {
        this.maxLimit_ = 0L;
    }

    private void clearMetric() {
        this.metric_ = QuotaLimit.getDefaultInstance().getMetric();
    }

    private void clearName() {
        this.name_ = QuotaLimit.getDefaultInstance().getName();
    }

    private void clearUnit() {
        this.unit_ = QuotaLimit.getDefaultInstance().getUnit();
    }

    public static QuotaLimit getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private Map<String, Long> getMutableValuesMap() {
        return this.internalGetMutableValues();
    }

    private MapFieldLite<String, Long> internalGetMutableValues() {
        if (!this.values_.isMutable()) {
            this.values_ = this.values_.mutableCopy();
        }
        return this.values_;
    }

    private MapFieldLite<String, Long> internalGetValues() {
        return this.values_;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(QuotaLimit quotaLimit) {
        return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)quotaLimit);
    }

    public static QuotaLimit parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (QuotaLimit)QuotaLimit.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static QuotaLimit parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (QuotaLimit)QuotaLimit.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static QuotaLimit parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (QuotaLimit)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static QuotaLimit parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (QuotaLimit)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static QuotaLimit parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (QuotaLimit)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static QuotaLimit parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (QuotaLimit)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static QuotaLimit parseFrom(InputStream inputStream) throws IOException {
        return (QuotaLimit)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static QuotaLimit parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (QuotaLimit)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static QuotaLimit parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (QuotaLimit)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static QuotaLimit parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (QuotaLimit)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<QuotaLimit> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setDefaultLimit(long l) {
        this.defaultLimit_ = l;
    }

    private void setDescription(String string2) {
        if (string2 != null) {
            this.description_ = string2;
            return;
        }
        throw new NullPointerException();
    }

    private void setDescriptionBytes(ByteString byteString) {
        if (byteString != null) {
            QuotaLimit.checkByteStringIsUtf8((ByteString)byteString);
            this.description_ = byteString.toStringUtf8();
            return;
        }
        throw new NullPointerException();
    }

    private void setDisplayName(String string2) {
        if (string2 != null) {
            this.displayName_ = string2;
            return;
        }
        throw new NullPointerException();
    }

    private void setDisplayNameBytes(ByteString byteString) {
        if (byteString != null) {
            QuotaLimit.checkByteStringIsUtf8((ByteString)byteString);
            this.displayName_ = byteString.toStringUtf8();
            return;
        }
        throw new NullPointerException();
    }

    private void setDuration(String string2) {
        if (string2 != null) {
            this.duration_ = string2;
            return;
        }
        throw new NullPointerException();
    }

    private void setDurationBytes(ByteString byteString) {
        if (byteString != null) {
            QuotaLimit.checkByteStringIsUtf8((ByteString)byteString);
            this.duration_ = byteString.toStringUtf8();
            return;
        }
        throw new NullPointerException();
    }

    private void setFreeTier(long l) {
        this.freeTier_ = l;
    }

    private void setMaxLimit(long l) {
        this.maxLimit_ = l;
    }

    private void setMetric(String string2) {
        if (string2 != null) {
            this.metric_ = string2;
            return;
        }
        throw new NullPointerException();
    }

    private void setMetricBytes(ByteString byteString) {
        if (byteString != null) {
            QuotaLimit.checkByteStringIsUtf8((ByteString)byteString);
            this.metric_ = byteString.toStringUtf8();
            return;
        }
        throw new NullPointerException();
    }

    private void setName(String string2) {
        if (string2 != null) {
            this.name_ = string2;
            return;
        }
        throw new NullPointerException();
    }

    private void setNameBytes(ByteString byteString) {
        if (byteString != null) {
            QuotaLimit.checkByteStringIsUtf8((ByteString)byteString);
            this.name_ = byteString.toStringUtf8();
            return;
        }
        throw new NullPointerException();
    }

    private void setUnit(String string2) {
        if (string2 != null) {
            this.unit_ = string2;
            return;
        }
        throw new NullPointerException();
    }

    private void setUnitBytes(ByteString byteString) {
        if (byteString != null) {
            QuotaLimit.checkByteStringIsUtf8((ByteString)byteString);
            this.unit_ = byteString.toStringUtf8();
            return;
        }
        throw new NullPointerException();
    }

    @Override
    public boolean containsValues(String string2) {
        if (string2 != null) {
            return this.internalGetValues().containsKey((Object)string2);
        }
        throw new NullPointerException();
    }

    /*
     * Exception decompiling
     */
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke var1_1, Object var2_2, Object var3_3) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [16[CASE]], but top level block is 3[TRYBLOCK]
        // org.benf.cfr.reader.b.a.a.j.a(Op04StructuredStatement.java:432)
        // org.benf.cfr.reader.b.a.a.j.d(Op04StructuredStatement.java:484)
        // org.benf.cfr.reader.b.a.a.i.a(Op03SimpleStatement.java:607)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:692)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
        // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
        // org.benf.cfr.reader.b.a(Driver.java:128)
        // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
        // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
        // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
        // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
        // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)
        // java.lang.Thread.run(Thread.java:919)
        throw new IllegalStateException("Decompilation failed");
    }

    @Override
    public long getDefaultLimit() {
        return this.defaultLimit_;
    }

    @Override
    public String getDescription() {
        return this.description_;
    }

    @Override
    public ByteString getDescriptionBytes() {
        return ByteString.copyFromUtf8((String)this.description_);
    }

    @Override
    public String getDisplayName() {
        return this.displayName_;
    }

    @Override
    public ByteString getDisplayNameBytes() {
        return ByteString.copyFromUtf8((String)this.displayName_);
    }

    @Override
    public String getDuration() {
        return this.duration_;
    }

    @Override
    public ByteString getDurationBytes() {
        return ByteString.copyFromUtf8((String)this.duration_);
    }

    @Override
    public long getFreeTier() {
        return this.freeTier_;
    }

    @Override
    public long getMaxLimit() {
        return this.maxLimit_;
    }

    @Override
    public String getMetric() {
        return this.metric_;
    }

    @Override
    public ByteString getMetricBytes() {
        return ByteString.copyFromUtf8((String)this.metric_);
    }

    @Override
    public String getName() {
        return this.name_;
    }

    @Override
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8((String)this.name_);
    }

    public int getSerializedSize() {
        long l;
        long l2;
        long l3;
        int n = this.memoizedSerializedSize;
        if (n != -1) {
            return n;
        }
        boolean bl = this.description_.isEmpty();
        int n2 = 0;
        if (!bl) {
            n2 = 0 + CodedOutputStream.computeStringSize((int)2, (String)this.getDescription());
        }
        if ((l2 = this.defaultLimit_) != 0L) {
            n2 += CodedOutputStream.computeInt64Size((int)3, (long)l2);
        }
        if ((l3 = this.maxLimit_) != 0L) {
            n2 += CodedOutputStream.computeInt64Size((int)4, (long)l3);
        }
        if (!this.duration_.isEmpty()) {
            n2 += CodedOutputStream.computeStringSize((int)5, (String)this.getDuration());
        }
        if (!this.name_.isEmpty()) {
            n2 += CodedOutputStream.computeStringSize((int)6, (String)this.getName());
        }
        if ((l = this.freeTier_) != 0L) {
            n2 += CodedOutputStream.computeInt64Size((int)7, (long)l);
        }
        if (!this.metric_.isEmpty()) {
            n2 += CodedOutputStream.computeStringSize((int)8, (String)this.getMetric());
        }
        if (!this.unit_.isEmpty()) {
            n2 += CodedOutputStream.computeStringSize((int)9, (String)this.getUnit());
        }
        for (Map.Entry entry : this.internalGetValues().entrySet()) {
            n2 += ValuesDefaultEntryHolder.defaultEntry.computeMessageSize(10, (Object)((String)entry.getKey()), (Object)((Long)entry.getValue()));
        }
        if (!this.displayName_.isEmpty()) {
            n2 += CodedOutputStream.computeStringSize((int)12, (String)this.getDisplayName());
        }
        this.memoizedSerializedSize = n2;
        return n2;
    }

    @Override
    public String getUnit() {
        return this.unit_;
    }

    @Override
    public ByteString getUnitBytes() {
        return ByteString.copyFromUtf8((String)this.unit_);
    }

    @Deprecated
    @Override
    public Map<String, Long> getValues() {
        return this.getValuesMap();
    }

    @Override
    public int getValuesCount() {
        return this.internalGetValues().size();
    }

    @Override
    public Map<String, Long> getValuesMap() {
        return Collections.unmodifiableMap(this.internalGetValues());
    }

    @Override
    public long getValuesOrDefault(String string2, long l) {
        if (string2 != null) {
            MapFieldLite<String, Long> mapFieldLite = this.internalGetValues();
            if (mapFieldLite.containsKey((Object)string2)) {
                return (Long)mapFieldLite.get((Object)string2);
            }
            return l;
        }
        throw new NullPointerException();
    }

    @Override
    public long getValuesOrThrow(String string2) {
        if (string2 != null) {
            MapFieldLite<String, Long> mapFieldLite = this.internalGetValues();
            if (mapFieldLite.containsKey((Object)string2)) {
                return (Long)mapFieldLite.get((Object)string2);
            }
            throw new IllegalArgumentException();
        }
        throw new NullPointerException();
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        long l;
        long l2;
        long l3;
        if (!this.description_.isEmpty()) {
            codedOutputStream.writeString(2, this.getDescription());
        }
        if ((l = this.defaultLimit_) != 0L) {
            codedOutputStream.writeInt64(3, l);
        }
        if ((l2 = this.maxLimit_) != 0L) {
            codedOutputStream.writeInt64(4, l2);
        }
        if (!this.duration_.isEmpty()) {
            codedOutputStream.writeString(5, this.getDuration());
        }
        if (!this.name_.isEmpty()) {
            codedOutputStream.writeString(6, this.getName());
        }
        if ((l3 = this.freeTier_) != 0L) {
            codedOutputStream.writeInt64(7, l3);
        }
        if (!this.metric_.isEmpty()) {
            codedOutputStream.writeString(8, this.getMetric());
        }
        if (!this.unit_.isEmpty()) {
            codedOutputStream.writeString(9, this.getUnit());
        }
        for (Map.Entry entry : this.internalGetValues().entrySet()) {
            ValuesDefaultEntryHolder.defaultEntry.serializeTo(codedOutputStream, 10, (Object)((String)entry.getKey()), (Object)((Long)entry.getValue()));
        }
        if (!this.displayName_.isEmpty()) {
            codedOutputStream.writeString(12, this.getDisplayName());
        }
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<QuotaLimit, Builder>
    implements QuotaLimitOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder clearDefaultLimit() {
            this.copyOnWrite();
            ((QuotaLimit)this.instance).clearDefaultLimit();
            return this;
        }

        public Builder clearDescription() {
            this.copyOnWrite();
            ((QuotaLimit)this.instance).clearDescription();
            return this;
        }

        public Builder clearDisplayName() {
            this.copyOnWrite();
            ((QuotaLimit)this.instance).clearDisplayName();
            return this;
        }

        public Builder clearDuration() {
            this.copyOnWrite();
            ((QuotaLimit)this.instance).clearDuration();
            return this;
        }

        public Builder clearFreeTier() {
            this.copyOnWrite();
            ((QuotaLimit)this.instance).clearFreeTier();
            return this;
        }

        public Builder clearMaxLimit() {
            this.copyOnWrite();
            ((QuotaLimit)this.instance).clearMaxLimit();
            return this;
        }

        public Builder clearMetric() {
            this.copyOnWrite();
            ((QuotaLimit)this.instance).clearMetric();
            return this;
        }

        public Builder clearName() {
            this.copyOnWrite();
            ((QuotaLimit)this.instance).clearName();
            return this;
        }

        public Builder clearUnit() {
            this.copyOnWrite();
            ((QuotaLimit)this.instance).clearUnit();
            return this;
        }

        public Builder clearValues() {
            this.copyOnWrite();
            ((QuotaLimit)this.instance).getMutableValuesMap().clear();
            return this;
        }

        @Override
        public boolean containsValues(String string2) {
            if (string2 != null) {
                return ((QuotaLimit)this.instance).getValuesMap().containsKey((Object)string2);
            }
            throw new NullPointerException();
        }

        @Override
        public long getDefaultLimit() {
            return ((QuotaLimit)this.instance).getDefaultLimit();
        }

        @Override
        public String getDescription() {
            return ((QuotaLimit)this.instance).getDescription();
        }

        @Override
        public ByteString getDescriptionBytes() {
            return ((QuotaLimit)this.instance).getDescriptionBytes();
        }

        @Override
        public String getDisplayName() {
            return ((QuotaLimit)this.instance).getDisplayName();
        }

        @Override
        public ByteString getDisplayNameBytes() {
            return ((QuotaLimit)this.instance).getDisplayNameBytes();
        }

        @Override
        public String getDuration() {
            return ((QuotaLimit)this.instance).getDuration();
        }

        @Override
        public ByteString getDurationBytes() {
            return ((QuotaLimit)this.instance).getDurationBytes();
        }

        @Override
        public long getFreeTier() {
            return ((QuotaLimit)this.instance).getFreeTier();
        }

        @Override
        public long getMaxLimit() {
            return ((QuotaLimit)this.instance).getMaxLimit();
        }

        @Override
        public String getMetric() {
            return ((QuotaLimit)this.instance).getMetric();
        }

        @Override
        public ByteString getMetricBytes() {
            return ((QuotaLimit)this.instance).getMetricBytes();
        }

        @Override
        public String getName() {
            return ((QuotaLimit)this.instance).getName();
        }

        @Override
        public ByteString getNameBytes() {
            return ((QuotaLimit)this.instance).getNameBytes();
        }

        @Override
        public String getUnit() {
            return ((QuotaLimit)this.instance).getUnit();
        }

        @Override
        public ByteString getUnitBytes() {
            return ((QuotaLimit)this.instance).getUnitBytes();
        }

        @Deprecated
        @Override
        public Map<String, Long> getValues() {
            return this.getValuesMap();
        }

        @Override
        public int getValuesCount() {
            return ((QuotaLimit)this.instance).getValuesMap().size();
        }

        @Override
        public Map<String, Long> getValuesMap() {
            return Collections.unmodifiableMap(((QuotaLimit)this.instance).getValuesMap());
        }

        @Override
        public long getValuesOrDefault(String string2, long l) {
            if (string2 != null) {
                Map<String, Long> map = ((QuotaLimit)this.instance).getValuesMap();
                if (map.containsKey((Object)string2)) {
                    return (Long)map.get((Object)string2);
                }
                return l;
            }
            throw new NullPointerException();
        }

        @Override
        public long getValuesOrThrow(String string2) {
            if (string2 != null) {
                Map<String, Long> map = ((QuotaLimit)this.instance).getValuesMap();
                if (map.containsKey((Object)string2)) {
                    return (Long)map.get((Object)string2);
                }
                throw new IllegalArgumentException();
            }
            throw new NullPointerException();
        }

        public Builder putAllValues(Map<String, Long> map) {
            this.copyOnWrite();
            ((QuotaLimit)this.instance).getMutableValuesMap().putAll(map);
            return this;
        }

        public Builder putValues(String string2, long l) {
            if (string2 != null) {
                this.copyOnWrite();
                ((QuotaLimit)this.instance).getMutableValuesMap().put((Object)string2, (Object)l);
                return this;
            }
            throw new NullPointerException();
        }

        public Builder removeValues(String string2) {
            if (string2 != null) {
                this.copyOnWrite();
                ((QuotaLimit)this.instance).getMutableValuesMap().remove((Object)string2);
                return this;
            }
            throw new NullPointerException();
        }

        public Builder setDefaultLimit(long l) {
            this.copyOnWrite();
            ((QuotaLimit)this.instance).setDefaultLimit(l);
            return this;
        }

        public Builder setDescription(String string2) {
            this.copyOnWrite();
            ((QuotaLimit)this.instance).setDescription(string2);
            return this;
        }

        public Builder setDescriptionBytes(ByteString byteString) {
            this.copyOnWrite();
            ((QuotaLimit)this.instance).setDescriptionBytes(byteString);
            return this;
        }

        public Builder setDisplayName(String string2) {
            this.copyOnWrite();
            ((QuotaLimit)this.instance).setDisplayName(string2);
            return this;
        }

        public Builder setDisplayNameBytes(ByteString byteString) {
            this.copyOnWrite();
            ((QuotaLimit)this.instance).setDisplayNameBytes(byteString);
            return this;
        }

        public Builder setDuration(String string2) {
            this.copyOnWrite();
            ((QuotaLimit)this.instance).setDuration(string2);
            return this;
        }

        public Builder setDurationBytes(ByteString byteString) {
            this.copyOnWrite();
            ((QuotaLimit)this.instance).setDurationBytes(byteString);
            return this;
        }

        public Builder setFreeTier(long l) {
            this.copyOnWrite();
            ((QuotaLimit)this.instance).setFreeTier(l);
            return this;
        }

        public Builder setMaxLimit(long l) {
            this.copyOnWrite();
            ((QuotaLimit)this.instance).setMaxLimit(l);
            return this;
        }

        public Builder setMetric(String string2) {
            this.copyOnWrite();
            ((QuotaLimit)this.instance).setMetric(string2);
            return this;
        }

        public Builder setMetricBytes(ByteString byteString) {
            this.copyOnWrite();
            ((QuotaLimit)this.instance).setMetricBytes(byteString);
            return this;
        }

        public Builder setName(String string2) {
            this.copyOnWrite();
            ((QuotaLimit)this.instance).setName(string2);
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            this.copyOnWrite();
            ((QuotaLimit)this.instance).setNameBytes(byteString);
            return this;
        }

        public Builder setUnit(String string2) {
            this.copyOnWrite();
            ((QuotaLimit)this.instance).setUnit(string2);
            return this;
        }

        public Builder setUnitBytes(ByteString byteString) {
            this.copyOnWrite();
            ((QuotaLimit)this.instance).setUnitBytes(byteString);
            return this;
        }
    }

    private static final class ValuesDefaultEntryHolder {
        static final MapEntryLite<String, Long> defaultEntry = MapEntryLite.newDefaultInstance((WireFormat.FieldType)WireFormat.FieldType.STRING, (Object)"", (WireFormat.FieldType)WireFormat.FieldType.INT64, (Object)0L);

        private ValuesDefaultEntryHolder() {
        }
    }

}

