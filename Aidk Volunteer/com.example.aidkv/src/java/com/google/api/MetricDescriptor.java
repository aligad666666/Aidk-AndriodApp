/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
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
 *  com.google.protobuf.Internal$EnumLite
 *  com.google.protobuf.Internal$EnumLiteMap
 *  com.google.protobuf.Internal$ProtobufList
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.Parser
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.Class
 *  java.lang.Deprecated
 *  java.lang.Enum
 *  java.lang.Iterable
 *  java.lang.NoSuchFieldError
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.UnsupportedOperationException
 *  java.util.Collections
 *  java.util.List
 */
package com.google.api;

import com.google.api.LabelDescriptor;
import com.google.api.LabelDescriptorOrBuilder;
import com.google.api.MetricDescriptorOrBuilder;
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

public final class MetricDescriptor
extends GeneratedMessageLite<MetricDescriptor, Builder>
implements MetricDescriptorOrBuilder {
    private static final MetricDescriptor DEFAULT_INSTANCE = new MetricDescriptor();
    public static final int DESCRIPTION_FIELD_NUMBER = 6;
    public static final int DISPLAY_NAME_FIELD_NUMBER = 7;
    public static final int LABELS_FIELD_NUMBER = 2;
    public static final int METRIC_KIND_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<MetricDescriptor> PARSER;
    public static final int TYPE_FIELD_NUMBER = 8;
    public static final int UNIT_FIELD_NUMBER = 5;
    public static final int VALUE_TYPE_FIELD_NUMBER = 4;
    private int bitField0_;
    private String description_ = "";
    private String displayName_ = "";
    private Internal.ProtobufList<LabelDescriptor> labels_ = MetricDescriptor.emptyProtobufList();
    private int metricKind_;
    private String name_ = "";
    private String type_ = "";
    private String unit_ = "";
    private int valueType_;

    static {
        DEFAULT_INSTANCE.makeImmutable();
    }

    private MetricDescriptor() {
    }

    private void addAllLabels(Iterable<? extends LabelDescriptor> iterable) {
        this.ensureLabelsIsMutable();
        AbstractMessageLite.addAll(iterable, this.labels_);
    }

    private void addLabels(int n, LabelDescriptor.Builder builder) {
        this.ensureLabelsIsMutable();
        this.labels_.add(n, (Object)((LabelDescriptor)builder.build()));
    }

    private void addLabels(int n, LabelDescriptor labelDescriptor) {
        if (labelDescriptor != null) {
            this.ensureLabelsIsMutable();
            this.labels_.add(n, (Object)labelDescriptor);
            return;
        }
        throw new NullPointerException();
    }

    private void addLabels(LabelDescriptor.Builder builder) {
        this.ensureLabelsIsMutable();
        this.labels_.add((Object)((LabelDescriptor)builder.build()));
    }

    private void addLabels(LabelDescriptor labelDescriptor) {
        if (labelDescriptor != null) {
            this.ensureLabelsIsMutable();
            this.labels_.add((Object)labelDescriptor);
            return;
        }
        throw new NullPointerException();
    }

    private void clearDescription() {
        this.description_ = MetricDescriptor.getDefaultInstance().getDescription();
    }

    private void clearDisplayName() {
        this.displayName_ = MetricDescriptor.getDefaultInstance().getDisplayName();
    }

    private void clearLabels() {
        this.labels_ = MetricDescriptor.emptyProtobufList();
    }

    private void clearMetricKind() {
        this.metricKind_ = 0;
    }

    private void clearName() {
        this.name_ = MetricDescriptor.getDefaultInstance().getName();
    }

    private void clearType() {
        this.type_ = MetricDescriptor.getDefaultInstance().getType();
    }

    private void clearUnit() {
        this.unit_ = MetricDescriptor.getDefaultInstance().getUnit();
    }

    private void clearValueType() {
        this.valueType_ = 0;
    }

    private void ensureLabelsIsMutable() {
        if (!this.labels_.isModifiable()) {
            this.labels_ = GeneratedMessageLite.mutableCopy(this.labels_);
        }
    }

    public static MetricDescriptor getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(MetricDescriptor metricDescriptor) {
        return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)metricDescriptor);
    }

    public static MetricDescriptor parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MetricDescriptor)MetricDescriptor.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static MetricDescriptor parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MetricDescriptor)MetricDescriptor.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static MetricDescriptor parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (MetricDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static MetricDescriptor parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MetricDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static MetricDescriptor parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (MetricDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static MetricDescriptor parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MetricDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static MetricDescriptor parseFrom(InputStream inputStream) throws IOException {
        return (MetricDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static MetricDescriptor parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (MetricDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static MetricDescriptor parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (MetricDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static MetricDescriptor parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (MetricDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<MetricDescriptor> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeLabels(int n) {
        this.ensureLabelsIsMutable();
        this.labels_.remove(n);
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
            MetricDescriptor.checkByteStringIsUtf8((ByteString)byteString);
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
            MetricDescriptor.checkByteStringIsUtf8((ByteString)byteString);
            this.displayName_ = byteString.toStringUtf8();
            return;
        }
        throw new NullPointerException();
    }

    private void setLabels(int n, LabelDescriptor.Builder builder) {
        this.ensureLabelsIsMutable();
        this.labels_.set(n, (Object)((LabelDescriptor)builder.build()));
    }

    private void setLabels(int n, LabelDescriptor labelDescriptor) {
        if (labelDescriptor != null) {
            this.ensureLabelsIsMutable();
            this.labels_.set(n, (Object)labelDescriptor);
            return;
        }
        throw new NullPointerException();
    }

    private void setMetricKind(MetricKind metricKind) {
        if (metricKind != null) {
            this.metricKind_ = metricKind.getNumber();
            return;
        }
        throw new NullPointerException();
    }

    private void setMetricKindValue(int n) {
        this.metricKind_ = n;
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
            MetricDescriptor.checkByteStringIsUtf8((ByteString)byteString);
            this.name_ = byteString.toStringUtf8();
            return;
        }
        throw new NullPointerException();
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
            MetricDescriptor.checkByteStringIsUtf8((ByteString)byteString);
            this.type_ = byteString.toStringUtf8();
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
            MetricDescriptor.checkByteStringIsUtf8((ByteString)byteString);
            this.unit_ = byteString.toStringUtf8();
            return;
        }
        throw new NullPointerException();
    }

    private void setValueType(ValueType valueType) {
        if (valueType != null) {
            this.valueType_ = valueType.getNumber();
            return;
        }
        throw new NullPointerException();
    }

    private void setValueTypeValue(int n) {
        this.valueType_ = n;
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
                Class<MetricDescriptor> class_ = MetricDescriptor.class;
                // MONITORENTER : com.google.api.MetricDescriptor.class
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
                                if (n != 24) {
                                    if (n != 32) {
                                        if (n != 42) {
                                            if (n != 50) {
                                                if (n != 58) {
                                                    if (n != 66) {
                                                        if (codedInputStream.skipField(n)) continue;
                                                        bl = true;
                                                        continue;
                                                    }
                                                    this.type_ = codedInputStream.readStringRequireUtf8();
                                                    continue;
                                                }
                                                this.displayName_ = codedInputStream.readStringRequireUtf8();
                                                continue;
                                            }
                                            this.description_ = codedInputStream.readStringRequireUtf8();
                                            continue;
                                        }
                                        this.unit_ = codedInputStream.readStringRequireUtf8();
                                        continue;
                                    }
                                    this.valueType_ = codedInputStream.readEnum();
                                    continue;
                                }
                                this.metricKind_ = codedInputStream.readEnum();
                                continue;
                            }
                            if (!this.labels_.isModifiable()) {
                                this.labels_ = GeneratedMessageLite.mutableCopy(this.labels_);
                            }
                            this.labels_.add((Object)((LabelDescriptor)codedInputStream.readMessage(LabelDescriptor.parser(), extensionRegistryLite)));
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
                MetricDescriptor metricDescriptor = (MetricDescriptor)object2;
                this.name_ = visitor.visitString(true ^ this.name_.isEmpty(), this.name_, true ^ metricDescriptor.name_.isEmpty(), metricDescriptor.name_);
                this.type_ = visitor.visitString(true ^ this.type_.isEmpty(), this.type_, true ^ metricDescriptor.type_.isEmpty(), metricDescriptor.type_);
                this.labels_ = visitor.visitList(this.labels_, metricDescriptor.labels_);
                boolean bl = this.metricKind_ != 0;
                int n = this.metricKind_;
                boolean bl2 = metricDescriptor.metricKind_ != 0;
                this.metricKind_ = visitor.visitInt(bl, n, bl2, metricDescriptor.metricKind_);
                boolean bl3 = this.valueType_ != 0;
                int n2 = this.valueType_;
                int n3 = metricDescriptor.valueType_;
                boolean bl4 = false;
                if (n3 != 0) {
                    bl4 = true;
                }
                this.valueType_ = visitor.visitInt(bl3, n2, bl4, metricDescriptor.valueType_);
                this.unit_ = visitor.visitString(true ^ this.unit_.isEmpty(), this.unit_, true ^ metricDescriptor.unit_.isEmpty(), metricDescriptor.unit_);
                this.description_ = visitor.visitString(true ^ this.description_.isEmpty(), this.description_, true ^ metricDescriptor.description_.isEmpty(), metricDescriptor.description_);
                this.displayName_ = visitor.visitString(true ^ this.displayName_.isEmpty(), this.displayName_, true ^ metricDescriptor.displayName_.isEmpty(), metricDescriptor.displayName_);
                if (visitor != GeneratedMessageLite.MergeFromVisitor.INSTANCE) return this;
                this.bitField0_ |= metricDescriptor.bitField0_;
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
        return new MetricDescriptor();
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
    public LabelDescriptor getLabels(int n) {
        return (LabelDescriptor)this.labels_.get(n);
    }

    @Override
    public int getLabelsCount() {
        return this.labels_.size();
    }

    @Override
    public List<LabelDescriptor> getLabelsList() {
        return this.labels_;
    }

    public LabelDescriptorOrBuilder getLabelsOrBuilder(int n) {
        return (LabelDescriptorOrBuilder)this.labels_.get(n);
    }

    public List<? extends LabelDescriptorOrBuilder> getLabelsOrBuilderList() {
        return this.labels_;
    }

    @Override
    public MetricKind getMetricKind() {
        MetricKind metricKind = MetricKind.forNumber(this.metricKind_);
        if (metricKind == null) {
            return MetricKind.UNRECOGNIZED;
        }
        return metricKind;
    }

    @Override
    public int getMetricKindValue() {
        return this.metricKind_;
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
        int n = this.memoizedSerializedSize;
        if (n != -1) {
            return n;
        }
        boolean bl = this.name_.isEmpty();
        int n2 = 0;
        if (!bl) {
            n2 = 0 + CodedOutputStream.computeStringSize((int)1, (String)this.getName());
        }
        for (int i = 0; i < this.labels_.size(); ++i) {
            n2 += CodedOutputStream.computeMessageSize((int)2, (MessageLite)((MessageLite)this.labels_.get(i)));
        }
        if (this.metricKind_ != MetricKind.METRIC_KIND_UNSPECIFIED.getNumber()) {
            n2 += CodedOutputStream.computeEnumSize((int)3, (int)this.metricKind_);
        }
        if (this.valueType_ != ValueType.VALUE_TYPE_UNSPECIFIED.getNumber()) {
            n2 += CodedOutputStream.computeEnumSize((int)4, (int)this.valueType_);
        }
        if (!this.unit_.isEmpty()) {
            n2 += CodedOutputStream.computeStringSize((int)5, (String)this.getUnit());
        }
        if (!this.description_.isEmpty()) {
            n2 += CodedOutputStream.computeStringSize((int)6, (String)this.getDescription());
        }
        if (!this.displayName_.isEmpty()) {
            n2 += CodedOutputStream.computeStringSize((int)7, (String)this.getDisplayName());
        }
        if (!this.type_.isEmpty()) {
            n2 += CodedOutputStream.computeStringSize((int)8, (String)this.getType());
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

    @Override
    public String getUnit() {
        return this.unit_;
    }

    @Override
    public ByteString getUnitBytes() {
        return ByteString.copyFromUtf8((String)this.unit_);
    }

    @Override
    public ValueType getValueType() {
        ValueType valueType = ValueType.forNumber(this.valueType_);
        if (valueType == null) {
            return ValueType.UNRECOGNIZED;
        }
        return valueType;
    }

    @Override
    public int getValueTypeValue() {
        return this.valueType_;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.name_.isEmpty()) {
            codedOutputStream.writeString(1, this.getName());
        }
        for (int i = 0; i < this.labels_.size(); ++i) {
            codedOutputStream.writeMessage(2, (MessageLite)this.labels_.get(i));
        }
        if (this.metricKind_ != MetricKind.METRIC_KIND_UNSPECIFIED.getNumber()) {
            codedOutputStream.writeEnum(3, this.metricKind_);
        }
        if (this.valueType_ != ValueType.VALUE_TYPE_UNSPECIFIED.getNumber()) {
            codedOutputStream.writeEnum(4, this.valueType_);
        }
        if (!this.unit_.isEmpty()) {
            codedOutputStream.writeString(5, this.getUnit());
        }
        if (!this.description_.isEmpty()) {
            codedOutputStream.writeString(6, this.getDescription());
        }
        if (!this.displayName_.isEmpty()) {
            codedOutputStream.writeString(7, this.getDisplayName());
        }
        if (!this.type_.isEmpty()) {
            codedOutputStream.writeString(8, this.getType());
        }
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<MetricDescriptor, Builder>
    implements MetricDescriptorOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder addAllLabels(Iterable<? extends LabelDescriptor> iterable) {
            this.copyOnWrite();
            ((MetricDescriptor)this.instance).addAllLabels((Iterable<? extends LabelDescriptor>)iterable);
            return this;
        }

        public Builder addLabels(int n, LabelDescriptor.Builder builder) {
            this.copyOnWrite();
            ((MetricDescriptor)this.instance).addLabels(n, builder);
            return this;
        }

        public Builder addLabels(int n, LabelDescriptor labelDescriptor) {
            this.copyOnWrite();
            ((MetricDescriptor)this.instance).addLabels(n, labelDescriptor);
            return this;
        }

        public Builder addLabels(LabelDescriptor.Builder builder) {
            this.copyOnWrite();
            ((MetricDescriptor)this.instance).addLabels(builder);
            return this;
        }

        public Builder addLabels(LabelDescriptor labelDescriptor) {
            this.copyOnWrite();
            ((MetricDescriptor)this.instance).addLabels(labelDescriptor);
            return this;
        }

        public Builder clearDescription() {
            this.copyOnWrite();
            ((MetricDescriptor)this.instance).clearDescription();
            return this;
        }

        public Builder clearDisplayName() {
            this.copyOnWrite();
            ((MetricDescriptor)this.instance).clearDisplayName();
            return this;
        }

        public Builder clearLabels() {
            this.copyOnWrite();
            ((MetricDescriptor)this.instance).clearLabels();
            return this;
        }

        public Builder clearMetricKind() {
            this.copyOnWrite();
            ((MetricDescriptor)this.instance).clearMetricKind();
            return this;
        }

        public Builder clearName() {
            this.copyOnWrite();
            ((MetricDescriptor)this.instance).clearName();
            return this;
        }

        public Builder clearType() {
            this.copyOnWrite();
            ((MetricDescriptor)this.instance).clearType();
            return this;
        }

        public Builder clearUnit() {
            this.copyOnWrite();
            ((MetricDescriptor)this.instance).clearUnit();
            return this;
        }

        public Builder clearValueType() {
            this.copyOnWrite();
            ((MetricDescriptor)this.instance).clearValueType();
            return this;
        }

        @Override
        public String getDescription() {
            return ((MetricDescriptor)this.instance).getDescription();
        }

        @Override
        public ByteString getDescriptionBytes() {
            return ((MetricDescriptor)this.instance).getDescriptionBytes();
        }

        @Override
        public String getDisplayName() {
            return ((MetricDescriptor)this.instance).getDisplayName();
        }

        @Override
        public ByteString getDisplayNameBytes() {
            return ((MetricDescriptor)this.instance).getDisplayNameBytes();
        }

        @Override
        public LabelDescriptor getLabels(int n) {
            return ((MetricDescriptor)this.instance).getLabels(n);
        }

        @Override
        public int getLabelsCount() {
            return ((MetricDescriptor)this.instance).getLabelsCount();
        }

        @Override
        public List<LabelDescriptor> getLabelsList() {
            return Collections.unmodifiableList(((MetricDescriptor)this.instance).getLabelsList());
        }

        @Override
        public MetricKind getMetricKind() {
            return ((MetricDescriptor)this.instance).getMetricKind();
        }

        @Override
        public int getMetricKindValue() {
            return ((MetricDescriptor)this.instance).getMetricKindValue();
        }

        @Override
        public String getName() {
            return ((MetricDescriptor)this.instance).getName();
        }

        @Override
        public ByteString getNameBytes() {
            return ((MetricDescriptor)this.instance).getNameBytes();
        }

        @Override
        public String getType() {
            return ((MetricDescriptor)this.instance).getType();
        }

        @Override
        public ByteString getTypeBytes() {
            return ((MetricDescriptor)this.instance).getTypeBytes();
        }

        @Override
        public String getUnit() {
            return ((MetricDescriptor)this.instance).getUnit();
        }

        @Override
        public ByteString getUnitBytes() {
            return ((MetricDescriptor)this.instance).getUnitBytes();
        }

        @Override
        public ValueType getValueType() {
            return ((MetricDescriptor)this.instance).getValueType();
        }

        @Override
        public int getValueTypeValue() {
            return ((MetricDescriptor)this.instance).getValueTypeValue();
        }

        public Builder removeLabels(int n) {
            this.copyOnWrite();
            ((MetricDescriptor)this.instance).removeLabels(n);
            return this;
        }

        public Builder setDescription(String string2) {
            this.copyOnWrite();
            ((MetricDescriptor)this.instance).setDescription(string2);
            return this;
        }

        public Builder setDescriptionBytes(ByteString byteString) {
            this.copyOnWrite();
            ((MetricDescriptor)this.instance).setDescriptionBytes(byteString);
            return this;
        }

        public Builder setDisplayName(String string2) {
            this.copyOnWrite();
            ((MetricDescriptor)this.instance).setDisplayName(string2);
            return this;
        }

        public Builder setDisplayNameBytes(ByteString byteString) {
            this.copyOnWrite();
            ((MetricDescriptor)this.instance).setDisplayNameBytes(byteString);
            return this;
        }

        public Builder setLabels(int n, LabelDescriptor.Builder builder) {
            this.copyOnWrite();
            ((MetricDescriptor)this.instance).setLabels(n, builder);
            return this;
        }

        public Builder setLabels(int n, LabelDescriptor labelDescriptor) {
            this.copyOnWrite();
            ((MetricDescriptor)this.instance).setLabels(n, labelDescriptor);
            return this;
        }

        public Builder setMetricKind(MetricKind metricKind) {
            this.copyOnWrite();
            ((MetricDescriptor)this.instance).setMetricKind(metricKind);
            return this;
        }

        public Builder setMetricKindValue(int n) {
            this.copyOnWrite();
            ((MetricDescriptor)this.instance).setMetricKindValue(n);
            return this;
        }

        public Builder setName(String string2) {
            this.copyOnWrite();
            ((MetricDescriptor)this.instance).setName(string2);
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            this.copyOnWrite();
            ((MetricDescriptor)this.instance).setNameBytes(byteString);
            return this;
        }

        public Builder setType(String string2) {
            this.copyOnWrite();
            ((MetricDescriptor)this.instance).setType(string2);
            return this;
        }

        public Builder setTypeBytes(ByteString byteString) {
            this.copyOnWrite();
            ((MetricDescriptor)this.instance).setTypeBytes(byteString);
            return this;
        }

        public Builder setUnit(String string2) {
            this.copyOnWrite();
            ((MetricDescriptor)this.instance).setUnit(string2);
            return this;
        }

        public Builder setUnitBytes(ByteString byteString) {
            this.copyOnWrite();
            ((MetricDescriptor)this.instance).setUnitBytes(byteString);
            return this;
        }

        public Builder setValueType(ValueType valueType) {
            this.copyOnWrite();
            ((MetricDescriptor)this.instance).setValueType(valueType);
            return this;
        }

        public Builder setValueTypeValue(int n) {
            this.copyOnWrite();
            ((MetricDescriptor)this.instance).setValueTypeValue(n);
            return this;
        }
    }

    public static final class MetricKind
    extends Enum<MetricKind>
    implements Internal.EnumLite {
        private static final /* synthetic */ MetricKind[] $VALUES;
        public static final /* enum */ MetricKind CUMULATIVE;
        public static final int CUMULATIVE_VALUE = 3;
        public static final /* enum */ MetricKind DELTA;
        public static final int DELTA_VALUE = 2;
        public static final /* enum */ MetricKind GAUGE;
        public static final int GAUGE_VALUE = 1;
        public static final /* enum */ MetricKind METRIC_KIND_UNSPECIFIED;
        public static final int METRIC_KIND_UNSPECIFIED_VALUE;
        public static final /* enum */ MetricKind UNRECOGNIZED;
        private static final Internal.EnumLiteMap<MetricKind> internalValueMap;
        private final int value;

        static {
            METRIC_KIND_UNSPECIFIED = new MetricKind(0);
            GAUGE = new MetricKind(1);
            DELTA = new MetricKind(2);
            CUMULATIVE = new MetricKind(3);
            UNRECOGNIZED = new MetricKind(-1);
            MetricKind[] arrmetricKind = new MetricKind[]{METRIC_KIND_UNSPECIFIED, GAUGE, DELTA, CUMULATIVE, UNRECOGNIZED};
            $VALUES = arrmetricKind;
            internalValueMap = new Internal.EnumLiteMap<MetricKind>(){

                public MetricKind findValueByNumber(int n) {
                    return MetricKind.forNumber(n);
                }
            };
        }

        private MetricKind(int n2) {
            this.value = n2;
        }

        public static MetricKind forNumber(int n) {
            if (n != 0) {
                if (n != 1) {
                    if (n != 2) {
                        if (n != 3) {
                            return null;
                        }
                        return CUMULATIVE;
                    }
                    return DELTA;
                }
                return GAUGE;
            }
            return METRIC_KIND_UNSPECIFIED;
        }

        public static Internal.EnumLiteMap<MetricKind> internalGetValueMap() {
            return internalValueMap;
        }

        @Deprecated
        public static MetricKind valueOf(int n) {
            return MetricKind.forNumber(n);
        }

        public static MetricKind valueOf(String string2) {
            return (MetricKind)Enum.valueOf(MetricKind.class, (String)string2);
        }

        public static MetricKind[] values() {
            return (MetricKind[])$VALUES.clone();
        }

        public final int getNumber() {
            return this.value;
        }

    }

    public static final class ValueType
    extends Enum<ValueType>
    implements Internal.EnumLite {
        private static final /* synthetic */ ValueType[] $VALUES;
        public static final /* enum */ ValueType BOOL;
        public static final int BOOL_VALUE = 1;
        public static final /* enum */ ValueType DISTRIBUTION;
        public static final int DISTRIBUTION_VALUE = 5;
        public static final /* enum */ ValueType DOUBLE;
        public static final int DOUBLE_VALUE = 3;
        public static final /* enum */ ValueType INT64;
        public static final int INT64_VALUE = 2;
        public static final /* enum */ ValueType MONEY;
        public static final int MONEY_VALUE = 6;
        public static final /* enum */ ValueType STRING;
        public static final int STRING_VALUE = 4;
        public static final /* enum */ ValueType UNRECOGNIZED;
        public static final /* enum */ ValueType VALUE_TYPE_UNSPECIFIED;
        public static final int VALUE_TYPE_UNSPECIFIED_VALUE;
        private static final Internal.EnumLiteMap<ValueType> internalValueMap;
        private final int value;

        static {
            VALUE_TYPE_UNSPECIFIED = new ValueType(0);
            BOOL = new ValueType(1);
            INT64 = new ValueType(2);
            DOUBLE = new ValueType(3);
            STRING = new ValueType(4);
            DISTRIBUTION = new ValueType(5);
            MONEY = new ValueType(6);
            UNRECOGNIZED = new ValueType(-1);
            ValueType[] arrvalueType = new ValueType[]{VALUE_TYPE_UNSPECIFIED, BOOL, INT64, DOUBLE, STRING, DISTRIBUTION, MONEY, UNRECOGNIZED};
            $VALUES = arrvalueType;
            internalValueMap = new Internal.EnumLiteMap<ValueType>(){

                public ValueType findValueByNumber(int n) {
                    return ValueType.forNumber(n);
                }
            };
        }

        private ValueType(int n2) {
            this.value = n2;
        }

        public static ValueType forNumber(int n) {
            switch (n) {
                default: {
                    return null;
                }
                case 6: {
                    return MONEY;
                }
                case 5: {
                    return DISTRIBUTION;
                }
                case 4: {
                    return STRING;
                }
                case 3: {
                    return DOUBLE;
                }
                case 2: {
                    return INT64;
                }
                case 1: {
                    return BOOL;
                }
                case 0: 
            }
            return VALUE_TYPE_UNSPECIFIED;
        }

        public static Internal.EnumLiteMap<ValueType> internalGetValueMap() {
            return internalValueMap;
        }

        @Deprecated
        public static ValueType valueOf(int n) {
            return ValueType.forNumber(n);
        }

        public static ValueType valueOf(String string2) {
            return (ValueType)Enum.valueOf(ValueType.class, (String)string2);
        }

        public static ValueType[] values() {
            return (ValueType[])$VALUES.clone();
        }

        public final int getNumber() {
            return this.value;
        }

    }

}

