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

import com.google.api.MetricRule;
import com.google.api.MetricRuleOrBuilder;
import com.google.api.QuotaLimit;
import com.google.api.QuotaLimitOrBuilder;
import com.google.api.QuotaOrBuilder;
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

public final class Quota
extends GeneratedMessageLite<Quota, Builder>
implements QuotaOrBuilder {
    private static final Quota DEFAULT_INSTANCE = new Quota();
    public static final int LIMITS_FIELD_NUMBER = 3;
    public static final int METRIC_RULES_FIELD_NUMBER = 4;
    private static volatile Parser<Quota> PARSER;
    private Internal.ProtobufList<QuotaLimit> limits_ = Quota.emptyProtobufList();
    private Internal.ProtobufList<MetricRule> metricRules_ = Quota.emptyProtobufList();

    static {
        DEFAULT_INSTANCE.makeImmutable();
    }

    private Quota() {
    }

    private void addAllLimits(Iterable<? extends QuotaLimit> iterable) {
        this.ensureLimitsIsMutable();
        AbstractMessageLite.addAll(iterable, this.limits_);
    }

    private void addAllMetricRules(Iterable<? extends MetricRule> iterable) {
        this.ensureMetricRulesIsMutable();
        AbstractMessageLite.addAll(iterable, this.metricRules_);
    }

    private void addLimits(int n, QuotaLimit.Builder builder) {
        this.ensureLimitsIsMutable();
        this.limits_.add(n, (Object)((QuotaLimit)builder.build()));
    }

    private void addLimits(int n, QuotaLimit quotaLimit) {
        if (quotaLimit != null) {
            this.ensureLimitsIsMutable();
            this.limits_.add(n, (Object)quotaLimit);
            return;
        }
        throw new NullPointerException();
    }

    private void addLimits(QuotaLimit.Builder builder) {
        this.ensureLimitsIsMutable();
        this.limits_.add((Object)((QuotaLimit)builder.build()));
    }

    private void addLimits(QuotaLimit quotaLimit) {
        if (quotaLimit != null) {
            this.ensureLimitsIsMutable();
            this.limits_.add((Object)quotaLimit);
            return;
        }
        throw new NullPointerException();
    }

    private void addMetricRules(int n, MetricRule.Builder builder) {
        this.ensureMetricRulesIsMutable();
        this.metricRules_.add(n, (Object)((MetricRule)builder.build()));
    }

    private void addMetricRules(int n, MetricRule metricRule) {
        if (metricRule != null) {
            this.ensureMetricRulesIsMutable();
            this.metricRules_.add(n, (Object)metricRule);
            return;
        }
        throw new NullPointerException();
    }

    private void addMetricRules(MetricRule.Builder builder) {
        this.ensureMetricRulesIsMutable();
        this.metricRules_.add((Object)((MetricRule)builder.build()));
    }

    private void addMetricRules(MetricRule metricRule) {
        if (metricRule != null) {
            this.ensureMetricRulesIsMutable();
            this.metricRules_.add((Object)metricRule);
            return;
        }
        throw new NullPointerException();
    }

    private void clearLimits() {
        this.limits_ = Quota.emptyProtobufList();
    }

    private void clearMetricRules() {
        this.metricRules_ = Quota.emptyProtobufList();
    }

    private void ensureLimitsIsMutable() {
        if (!this.limits_.isModifiable()) {
            this.limits_ = GeneratedMessageLite.mutableCopy(this.limits_);
        }
    }

    private void ensureMetricRulesIsMutable() {
        if (!this.metricRules_.isModifiable()) {
            this.metricRules_ = GeneratedMessageLite.mutableCopy(this.metricRules_);
        }
    }

    public static Quota getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(Quota quota) {
        return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)quota);
    }

    public static Quota parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Quota)Quota.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Quota parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Quota)Quota.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Quota parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Quota)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static Quota parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Quota)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Quota parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Quota)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static Quota parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Quota)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Quota parseFrom(InputStream inputStream) throws IOException {
        return (Quota)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Quota parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Quota)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Quota parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (Quota)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static Quota parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Quota)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<Quota> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeLimits(int n) {
        this.ensureLimitsIsMutable();
        this.limits_.remove(n);
    }

    private void removeMetricRules(int n) {
        this.ensureMetricRulesIsMutable();
        this.metricRules_.remove(n);
    }

    private void setLimits(int n, QuotaLimit.Builder builder) {
        this.ensureLimitsIsMutable();
        this.limits_.set(n, (Object)((QuotaLimit)builder.build()));
    }

    private void setLimits(int n, QuotaLimit quotaLimit) {
        if (quotaLimit != null) {
            this.ensureLimitsIsMutable();
            this.limits_.set(n, (Object)quotaLimit);
            return;
        }
        throw new NullPointerException();
    }

    private void setMetricRules(int n, MetricRule.Builder builder) {
        this.ensureMetricRulesIsMutable();
        this.metricRules_.set(n, (Object)((MetricRule)builder.build()));
    }

    private void setMetricRules(int n, MetricRule metricRule) {
        if (metricRule != null) {
            this.ensureMetricRulesIsMutable();
            this.metricRules_.set(n, (Object)metricRule);
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
                Class<Quota> class_ = Quota.class;
                // MONITORENTER : com.google.api.Quota.class
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
                        if (n != 26) {
                            if (n != 34) {
                                if (codedInputStream.skipField(n)) continue;
                                bl = true;
                                continue;
                            }
                            if (!this.metricRules_.isModifiable()) {
                                this.metricRules_ = GeneratedMessageLite.mutableCopy(this.metricRules_);
                            }
                            this.metricRules_.add((Object)((MetricRule)codedInputStream.readMessage(MetricRule.parser(), extensionRegistryLite)));
                            continue;
                        }
                        if (!this.limits_.isModifiable()) {
                            this.limits_ = GeneratedMessageLite.mutableCopy(this.limits_);
                        }
                        this.limits_.add((Object)((QuotaLimit)codedInputStream.readMessage(QuotaLimit.parser(), extensionRegistryLite)));
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
                Quota quota = (Quota)object2;
                this.limits_ = visitor.visitList(this.limits_, quota.limits_);
                this.metricRules_ = visitor.visitList(this.metricRules_, quota.metricRules_);
                return this;
            }
            case 4: {
                return new Builder();
            }
            case 3: {
                this.limits_.makeImmutable();
                this.metricRules_.makeImmutable();
                return null;
            }
            case 2: {
                return DEFAULT_INSTANCE;
            }
            case 1: 
        }
        return new Quota();
    }

    @Override
    public QuotaLimit getLimits(int n) {
        return (QuotaLimit)this.limits_.get(n);
    }

    @Override
    public int getLimitsCount() {
        return this.limits_.size();
    }

    @Override
    public List<QuotaLimit> getLimitsList() {
        return this.limits_;
    }

    public QuotaLimitOrBuilder getLimitsOrBuilder(int n) {
        return (QuotaLimitOrBuilder)this.limits_.get(n);
    }

    public List<? extends QuotaLimitOrBuilder> getLimitsOrBuilderList() {
        return this.limits_;
    }

    @Override
    public MetricRule getMetricRules(int n) {
        return (MetricRule)this.metricRules_.get(n);
    }

    @Override
    public int getMetricRulesCount() {
        return this.metricRules_.size();
    }

    @Override
    public List<MetricRule> getMetricRulesList() {
        return this.metricRules_;
    }

    public MetricRuleOrBuilder getMetricRulesOrBuilder(int n) {
        return (MetricRuleOrBuilder)this.metricRules_.get(n);
    }

    public List<? extends MetricRuleOrBuilder> getMetricRulesOrBuilderList() {
        return this.metricRules_;
    }

    public int getSerializedSize() {
        int n = this.memoizedSerializedSize;
        if (n != -1) {
            return n;
        }
        int n2 = 0;
        for (int i = 0; i < this.limits_.size(); ++i) {
            n2 += CodedOutputStream.computeMessageSize((int)3, (MessageLite)((MessageLite)this.limits_.get(i)));
        }
        for (int i = 0; i < this.metricRules_.size(); ++i) {
            n2 += CodedOutputStream.computeMessageSize((int)4, (MessageLite)((MessageLite)this.metricRules_.get(i)));
        }
        this.memoizedSerializedSize = n2;
        return n2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.limits_.size(); ++i) {
            codedOutputStream.writeMessage(3, (MessageLite)this.limits_.get(i));
        }
        for (int i = 0; i < this.metricRules_.size(); ++i) {
            codedOutputStream.writeMessage(4, (MessageLite)this.metricRules_.get(i));
        }
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<Quota, Builder>
    implements QuotaOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder addAllLimits(Iterable<? extends QuotaLimit> iterable) {
            this.copyOnWrite();
            ((Quota)this.instance).addAllLimits((Iterable<? extends QuotaLimit>)iterable);
            return this;
        }

        public Builder addAllMetricRules(Iterable<? extends MetricRule> iterable) {
            this.copyOnWrite();
            ((Quota)this.instance).addAllMetricRules((Iterable<? extends MetricRule>)iterable);
            return this;
        }

        public Builder addLimits(int n, QuotaLimit.Builder builder) {
            this.copyOnWrite();
            ((Quota)this.instance).addLimits(n, builder);
            return this;
        }

        public Builder addLimits(int n, QuotaLimit quotaLimit) {
            this.copyOnWrite();
            ((Quota)this.instance).addLimits(n, quotaLimit);
            return this;
        }

        public Builder addLimits(QuotaLimit.Builder builder) {
            this.copyOnWrite();
            ((Quota)this.instance).addLimits(builder);
            return this;
        }

        public Builder addLimits(QuotaLimit quotaLimit) {
            this.copyOnWrite();
            ((Quota)this.instance).addLimits(quotaLimit);
            return this;
        }

        public Builder addMetricRules(int n, MetricRule.Builder builder) {
            this.copyOnWrite();
            ((Quota)this.instance).addMetricRules(n, builder);
            return this;
        }

        public Builder addMetricRules(int n, MetricRule metricRule) {
            this.copyOnWrite();
            ((Quota)this.instance).addMetricRules(n, metricRule);
            return this;
        }

        public Builder addMetricRules(MetricRule.Builder builder) {
            this.copyOnWrite();
            ((Quota)this.instance).addMetricRules(builder);
            return this;
        }

        public Builder addMetricRules(MetricRule metricRule) {
            this.copyOnWrite();
            ((Quota)this.instance).addMetricRules(metricRule);
            return this;
        }

        public Builder clearLimits() {
            this.copyOnWrite();
            ((Quota)this.instance).clearLimits();
            return this;
        }

        public Builder clearMetricRules() {
            this.copyOnWrite();
            ((Quota)this.instance).clearMetricRules();
            return this;
        }

        @Override
        public QuotaLimit getLimits(int n) {
            return ((Quota)this.instance).getLimits(n);
        }

        @Override
        public int getLimitsCount() {
            return ((Quota)this.instance).getLimitsCount();
        }

        @Override
        public List<QuotaLimit> getLimitsList() {
            return Collections.unmodifiableList(((Quota)this.instance).getLimitsList());
        }

        @Override
        public MetricRule getMetricRules(int n) {
            return ((Quota)this.instance).getMetricRules(n);
        }

        @Override
        public int getMetricRulesCount() {
            return ((Quota)this.instance).getMetricRulesCount();
        }

        @Override
        public List<MetricRule> getMetricRulesList() {
            return Collections.unmodifiableList(((Quota)this.instance).getMetricRulesList());
        }

        public Builder removeLimits(int n) {
            this.copyOnWrite();
            ((Quota)this.instance).removeLimits(n);
            return this;
        }

        public Builder removeMetricRules(int n) {
            this.copyOnWrite();
            ((Quota)this.instance).removeMetricRules(n);
            return this;
        }

        public Builder setLimits(int n, QuotaLimit.Builder builder) {
            this.copyOnWrite();
            ((Quota)this.instance).setLimits(n, builder);
            return this;
        }

        public Builder setLimits(int n, QuotaLimit quotaLimit) {
            this.copyOnWrite();
            ((Quota)this.instance).setLimits(n, quotaLimit);
            return this;
        }

        public Builder setMetricRules(int n, MetricRule.Builder builder) {
            this.copyOnWrite();
            ((Quota)this.instance).setMetricRules(n, builder);
            return this;
        }

        public Builder setMetricRules(int n, MetricRule metricRule) {
            this.copyOnWrite();
            ((Quota)this.instance).setMetricRules(n, metricRule);
            return this;
        }
    }

}

