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
 *  com.google.protobuf.Internal$ProtobufList
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.MessageLiteOrBuilder
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

import com.google.api.MonitoringOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

public final class Monitoring
extends GeneratedMessageLite<Monitoring, Builder>
implements MonitoringOrBuilder {
    public static final int CONSUMER_DESTINATIONS_FIELD_NUMBER = 2;
    private static final Monitoring DEFAULT_INSTANCE = new Monitoring();
    private static volatile Parser<Monitoring> PARSER;
    public static final int PRODUCER_DESTINATIONS_FIELD_NUMBER = 1;
    private Internal.ProtobufList<MonitoringDestination> consumerDestinations_ = Monitoring.emptyProtobufList();
    private Internal.ProtobufList<MonitoringDestination> producerDestinations_ = Monitoring.emptyProtobufList();

    static {
        DEFAULT_INSTANCE.makeImmutable();
    }

    private Monitoring() {
    }

    private void addAllConsumerDestinations(Iterable<? extends MonitoringDestination> iterable) {
        this.ensureConsumerDestinationsIsMutable();
        AbstractMessageLite.addAll(iterable, this.consumerDestinations_);
    }

    private void addAllProducerDestinations(Iterable<? extends MonitoringDestination> iterable) {
        this.ensureProducerDestinationsIsMutable();
        AbstractMessageLite.addAll(iterable, this.producerDestinations_);
    }

    private void addConsumerDestinations(int n, MonitoringDestination.Builder builder) {
        this.ensureConsumerDestinationsIsMutable();
        this.consumerDestinations_.add(n, (Object)((MonitoringDestination)builder.build()));
    }

    private void addConsumerDestinations(int n, MonitoringDestination monitoringDestination) {
        if (monitoringDestination != null) {
            this.ensureConsumerDestinationsIsMutable();
            this.consumerDestinations_.add(n, (Object)monitoringDestination);
            return;
        }
        throw new NullPointerException();
    }

    private void addConsumerDestinations(MonitoringDestination.Builder builder) {
        this.ensureConsumerDestinationsIsMutable();
        this.consumerDestinations_.add((Object)((MonitoringDestination)builder.build()));
    }

    private void addConsumerDestinations(MonitoringDestination monitoringDestination) {
        if (monitoringDestination != null) {
            this.ensureConsumerDestinationsIsMutable();
            this.consumerDestinations_.add((Object)monitoringDestination);
            return;
        }
        throw new NullPointerException();
    }

    private void addProducerDestinations(int n, MonitoringDestination.Builder builder) {
        this.ensureProducerDestinationsIsMutable();
        this.producerDestinations_.add(n, (Object)((MonitoringDestination)builder.build()));
    }

    private void addProducerDestinations(int n, MonitoringDestination monitoringDestination) {
        if (monitoringDestination != null) {
            this.ensureProducerDestinationsIsMutable();
            this.producerDestinations_.add(n, (Object)monitoringDestination);
            return;
        }
        throw new NullPointerException();
    }

    private void addProducerDestinations(MonitoringDestination.Builder builder) {
        this.ensureProducerDestinationsIsMutable();
        this.producerDestinations_.add((Object)((MonitoringDestination)builder.build()));
    }

    private void addProducerDestinations(MonitoringDestination monitoringDestination) {
        if (monitoringDestination != null) {
            this.ensureProducerDestinationsIsMutable();
            this.producerDestinations_.add((Object)monitoringDestination);
            return;
        }
        throw new NullPointerException();
    }

    private void clearConsumerDestinations() {
        this.consumerDestinations_ = Monitoring.emptyProtobufList();
    }

    private void clearProducerDestinations() {
        this.producerDestinations_ = Monitoring.emptyProtobufList();
    }

    private void ensureConsumerDestinationsIsMutable() {
        if (!this.consumerDestinations_.isModifiable()) {
            this.consumerDestinations_ = GeneratedMessageLite.mutableCopy(this.consumerDestinations_);
        }
    }

    private void ensureProducerDestinationsIsMutable() {
        if (!this.producerDestinations_.isModifiable()) {
            this.producerDestinations_ = GeneratedMessageLite.mutableCopy(this.producerDestinations_);
        }
    }

    public static Monitoring getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(Monitoring monitoring) {
        return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)monitoring);
    }

    public static Monitoring parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Monitoring)Monitoring.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Monitoring parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Monitoring)Monitoring.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Monitoring parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Monitoring)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static Monitoring parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Monitoring)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Monitoring parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Monitoring)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static Monitoring parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Monitoring)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Monitoring parseFrom(InputStream inputStream) throws IOException {
        return (Monitoring)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Monitoring parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Monitoring)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Monitoring parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (Monitoring)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static Monitoring parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Monitoring)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<Monitoring> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeConsumerDestinations(int n) {
        this.ensureConsumerDestinationsIsMutable();
        this.consumerDestinations_.remove(n);
    }

    private void removeProducerDestinations(int n) {
        this.ensureProducerDestinationsIsMutable();
        this.producerDestinations_.remove(n);
    }

    private void setConsumerDestinations(int n, MonitoringDestination.Builder builder) {
        this.ensureConsumerDestinationsIsMutable();
        this.consumerDestinations_.set(n, (Object)((MonitoringDestination)builder.build()));
    }

    private void setConsumerDestinations(int n, MonitoringDestination monitoringDestination) {
        if (monitoringDestination != null) {
            this.ensureConsumerDestinationsIsMutable();
            this.consumerDestinations_.set(n, (Object)monitoringDestination);
            return;
        }
        throw new NullPointerException();
    }

    private void setProducerDestinations(int n, MonitoringDestination.Builder builder) {
        this.ensureProducerDestinationsIsMutable();
        this.producerDestinations_.set(n, (Object)((MonitoringDestination)builder.build()));
    }

    private void setProducerDestinations(int n, MonitoringDestination monitoringDestination) {
        if (monitoringDestination != null) {
            this.ensureProducerDestinationsIsMutable();
            this.producerDestinations_.set(n, (Object)monitoringDestination);
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
                Class<Monitoring> class_ = Monitoring.class;
                // MONITORENTER : com.google.api.Monitoring.class
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
                            if (!this.consumerDestinations_.isModifiable()) {
                                this.consumerDestinations_ = GeneratedMessageLite.mutableCopy(this.consumerDestinations_);
                            }
                            this.consumerDestinations_.add((Object)((MonitoringDestination)codedInputStream.readMessage(MonitoringDestination.parser(), extensionRegistryLite)));
                            continue;
                        }
                        if (!this.producerDestinations_.isModifiable()) {
                            this.producerDestinations_ = GeneratedMessageLite.mutableCopy(this.producerDestinations_);
                        }
                        this.producerDestinations_.add((Object)((MonitoringDestination)codedInputStream.readMessage(MonitoringDestination.parser(), extensionRegistryLite)));
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
                Monitoring monitoring = (Monitoring)object2;
                this.producerDestinations_ = visitor.visitList(this.producerDestinations_, monitoring.producerDestinations_);
                this.consumerDestinations_ = visitor.visitList(this.consumerDestinations_, monitoring.consumerDestinations_);
                return this;
            }
            case 4: {
                return new Builder();
            }
            case 3: {
                this.producerDestinations_.makeImmutable();
                this.consumerDestinations_.makeImmutable();
                return null;
            }
            case 2: {
                return DEFAULT_INSTANCE;
            }
            case 1: 
        }
        return new Monitoring();
    }

    @Override
    public MonitoringDestination getConsumerDestinations(int n) {
        return (MonitoringDestination)this.consumerDestinations_.get(n);
    }

    @Override
    public int getConsumerDestinationsCount() {
        return this.consumerDestinations_.size();
    }

    @Override
    public List<MonitoringDestination> getConsumerDestinationsList() {
        return this.consumerDestinations_;
    }

    public MonitoringDestinationOrBuilder getConsumerDestinationsOrBuilder(int n) {
        return (MonitoringDestinationOrBuilder)this.consumerDestinations_.get(n);
    }

    public List<? extends MonitoringDestinationOrBuilder> getConsumerDestinationsOrBuilderList() {
        return this.consumerDestinations_;
    }

    @Override
    public MonitoringDestination getProducerDestinations(int n) {
        return (MonitoringDestination)this.producerDestinations_.get(n);
    }

    @Override
    public int getProducerDestinationsCount() {
        return this.producerDestinations_.size();
    }

    @Override
    public List<MonitoringDestination> getProducerDestinationsList() {
        return this.producerDestinations_;
    }

    public MonitoringDestinationOrBuilder getProducerDestinationsOrBuilder(int n) {
        return (MonitoringDestinationOrBuilder)this.producerDestinations_.get(n);
    }

    public List<? extends MonitoringDestinationOrBuilder> getProducerDestinationsOrBuilderList() {
        return this.producerDestinations_;
    }

    public int getSerializedSize() {
        int n = this.memoizedSerializedSize;
        if (n != -1) {
            return n;
        }
        int n2 = 0;
        for (int i = 0; i < this.producerDestinations_.size(); ++i) {
            n2 += CodedOutputStream.computeMessageSize((int)1, (MessageLite)((MessageLite)this.producerDestinations_.get(i)));
        }
        for (int i = 0; i < this.consumerDestinations_.size(); ++i) {
            n2 += CodedOutputStream.computeMessageSize((int)2, (MessageLite)((MessageLite)this.consumerDestinations_.get(i)));
        }
        this.memoizedSerializedSize = n2;
        return n2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.producerDestinations_.size(); ++i) {
            codedOutputStream.writeMessage(1, (MessageLite)this.producerDestinations_.get(i));
        }
        for (int i = 0; i < this.consumerDestinations_.size(); ++i) {
            codedOutputStream.writeMessage(2, (MessageLite)this.consumerDestinations_.get(i));
        }
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<Monitoring, Builder>
    implements MonitoringOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder addAllConsumerDestinations(Iterable<? extends MonitoringDestination> iterable) {
            this.copyOnWrite();
            ((Monitoring)this.instance).addAllConsumerDestinations((Iterable<? extends MonitoringDestination>)iterable);
            return this;
        }

        public Builder addAllProducerDestinations(Iterable<? extends MonitoringDestination> iterable) {
            this.copyOnWrite();
            ((Monitoring)this.instance).addAllProducerDestinations((Iterable<? extends MonitoringDestination>)iterable);
            return this;
        }

        public Builder addConsumerDestinations(int n, MonitoringDestination.Builder builder) {
            this.copyOnWrite();
            ((Monitoring)this.instance).addConsumerDestinations(n, builder);
            return this;
        }

        public Builder addConsumerDestinations(int n, MonitoringDestination monitoringDestination) {
            this.copyOnWrite();
            ((Monitoring)this.instance).addConsumerDestinations(n, monitoringDestination);
            return this;
        }

        public Builder addConsumerDestinations(MonitoringDestination.Builder builder) {
            this.copyOnWrite();
            ((Monitoring)this.instance).addConsumerDestinations(builder);
            return this;
        }

        public Builder addConsumerDestinations(MonitoringDestination monitoringDestination) {
            this.copyOnWrite();
            ((Monitoring)this.instance).addConsumerDestinations(monitoringDestination);
            return this;
        }

        public Builder addProducerDestinations(int n, MonitoringDestination.Builder builder) {
            this.copyOnWrite();
            ((Monitoring)this.instance).addProducerDestinations(n, builder);
            return this;
        }

        public Builder addProducerDestinations(int n, MonitoringDestination monitoringDestination) {
            this.copyOnWrite();
            ((Monitoring)this.instance).addProducerDestinations(n, monitoringDestination);
            return this;
        }

        public Builder addProducerDestinations(MonitoringDestination.Builder builder) {
            this.copyOnWrite();
            ((Monitoring)this.instance).addProducerDestinations(builder);
            return this;
        }

        public Builder addProducerDestinations(MonitoringDestination monitoringDestination) {
            this.copyOnWrite();
            ((Monitoring)this.instance).addProducerDestinations(monitoringDestination);
            return this;
        }

        public Builder clearConsumerDestinations() {
            this.copyOnWrite();
            ((Monitoring)this.instance).clearConsumerDestinations();
            return this;
        }

        public Builder clearProducerDestinations() {
            this.copyOnWrite();
            ((Monitoring)this.instance).clearProducerDestinations();
            return this;
        }

        @Override
        public MonitoringDestination getConsumerDestinations(int n) {
            return ((Monitoring)this.instance).getConsumerDestinations(n);
        }

        @Override
        public int getConsumerDestinationsCount() {
            return ((Monitoring)this.instance).getConsumerDestinationsCount();
        }

        @Override
        public List<MonitoringDestination> getConsumerDestinationsList() {
            return Collections.unmodifiableList(((Monitoring)this.instance).getConsumerDestinationsList());
        }

        @Override
        public MonitoringDestination getProducerDestinations(int n) {
            return ((Monitoring)this.instance).getProducerDestinations(n);
        }

        @Override
        public int getProducerDestinationsCount() {
            return ((Monitoring)this.instance).getProducerDestinationsCount();
        }

        @Override
        public List<MonitoringDestination> getProducerDestinationsList() {
            return Collections.unmodifiableList(((Monitoring)this.instance).getProducerDestinationsList());
        }

        public Builder removeConsumerDestinations(int n) {
            this.copyOnWrite();
            ((Monitoring)this.instance).removeConsumerDestinations(n);
            return this;
        }

        public Builder removeProducerDestinations(int n) {
            this.copyOnWrite();
            ((Monitoring)this.instance).removeProducerDestinations(n);
            return this;
        }

        public Builder setConsumerDestinations(int n, MonitoringDestination.Builder builder) {
            this.copyOnWrite();
            ((Monitoring)this.instance).setConsumerDestinations(n, builder);
            return this;
        }

        public Builder setConsumerDestinations(int n, MonitoringDestination monitoringDestination) {
            this.copyOnWrite();
            ((Monitoring)this.instance).setConsumerDestinations(n, monitoringDestination);
            return this;
        }

        public Builder setProducerDestinations(int n, MonitoringDestination.Builder builder) {
            this.copyOnWrite();
            ((Monitoring)this.instance).setProducerDestinations(n, builder);
            return this;
        }

        public Builder setProducerDestinations(int n, MonitoringDestination monitoringDestination) {
            this.copyOnWrite();
            ((Monitoring)this.instance).setProducerDestinations(n, monitoringDestination);
            return this;
        }
    }

    public static final class MonitoringDestination
    extends GeneratedMessageLite<MonitoringDestination, Builder>
    implements MonitoringDestinationOrBuilder {
        private static final MonitoringDestination DEFAULT_INSTANCE = new MonitoringDestination();
        public static final int METRICS_FIELD_NUMBER = 2;
        public static final int MONITORED_RESOURCE_FIELD_NUMBER = 1;
        private static volatile Parser<MonitoringDestination> PARSER;
        private int bitField0_;
        private Internal.ProtobufList<String> metrics_ = GeneratedMessageLite.emptyProtobufList();
        private String monitoredResource_ = "";

        static {
            DEFAULT_INSTANCE.makeImmutable();
        }

        private MonitoringDestination() {
        }

        private void addAllMetrics(Iterable<String> iterable) {
            this.ensureMetricsIsMutable();
            AbstractMessageLite.addAll(iterable, this.metrics_);
        }

        private void addMetrics(String string2) {
            if (string2 != null) {
                this.ensureMetricsIsMutable();
                this.metrics_.add((Object)string2);
                return;
            }
            throw new NullPointerException();
        }

        private void addMetricsBytes(ByteString byteString) {
            if (byteString != null) {
                MonitoringDestination.checkByteStringIsUtf8((ByteString)byteString);
                this.ensureMetricsIsMutable();
                this.metrics_.add((Object)byteString.toStringUtf8());
                return;
            }
            throw new NullPointerException();
        }

        private void clearMetrics() {
            this.metrics_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void clearMonitoredResource() {
            this.monitoredResource_ = MonitoringDestination.getDefaultInstance().getMonitoredResource();
        }

        private void ensureMetricsIsMutable() {
            if (!this.metrics_.isModifiable()) {
                this.metrics_ = GeneratedMessageLite.mutableCopy(this.metrics_);
            }
        }

        public static MonitoringDestination getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(MonitoringDestination monitoringDestination) {
            return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)monitoringDestination);
        }

        public static MonitoringDestination parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (MonitoringDestination)MonitoringDestination.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static MonitoringDestination parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MonitoringDestination)MonitoringDestination.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static MonitoringDestination parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (MonitoringDestination)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
        }

        public static MonitoringDestination parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (MonitoringDestination)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static MonitoringDestination parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (MonitoringDestination)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
        }

        public static MonitoringDestination parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MonitoringDestination)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static MonitoringDestination parseFrom(InputStream inputStream) throws IOException {
            return (MonitoringDestination)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static MonitoringDestination parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (MonitoringDestination)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static MonitoringDestination parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
            return (MonitoringDestination)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
        }

        public static MonitoringDestination parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (MonitoringDestination)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Parser<MonitoringDestination> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setMetrics(int n, String string2) {
            if (string2 != null) {
                this.ensureMetricsIsMutable();
                this.metrics_.set(n, (Object)string2);
                return;
            }
            throw new NullPointerException();
        }

        private void setMonitoredResource(String string2) {
            if (string2 != null) {
                this.monitoredResource_ = string2;
                return;
            }
            throw new NullPointerException();
        }

        private void setMonitoredResourceBytes(ByteString byteString) {
            if (byteString != null) {
                MonitoringDestination.checkByteStringIsUtf8((ByteString)byteString);
                this.monitoredResource_ = byteString.toStringUtf8();
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
                    Class<MonitoringDestination> class_ = MonitoringDestination.class;
                    // MONITORENTER : com.google.api.Monitoring$MonitoringDestination.class
                    if (PARSER == null) {
                        PARSER = new GeneratedMessageLite.DefaultInstanceBasedParser((GeneratedMessageLite)DEFAULT_INSTANCE);
                    }
                    // MONITOREXIT : class_
                    return PARSER;
                }
                case 6: {
                    CodedInputStream codedInputStream = (CodedInputStream)object;
                    (ExtensionRegistryLite)object2;
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
                                String string2 = codedInputStream.readStringRequireUtf8();
                                if (!this.metrics_.isModifiable()) {
                                    this.metrics_ = GeneratedMessageLite.mutableCopy(this.metrics_);
                                }
                                this.metrics_.add((Object)string2);
                                continue;
                            }
                            this.monitoredResource_ = codedInputStream.readStringRequireUtf8();
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
                    MonitoringDestination monitoringDestination = (MonitoringDestination)object2;
                    this.monitoredResource_ = visitor.visitString(true ^ this.monitoredResource_.isEmpty(), this.monitoredResource_, true ^ monitoringDestination.monitoredResource_.isEmpty(), monitoringDestination.monitoredResource_);
                    this.metrics_ = visitor.visitList(this.metrics_, monitoringDestination.metrics_);
                    if (visitor != GeneratedMessageLite.MergeFromVisitor.INSTANCE) return this;
                    this.bitField0_ |= monitoringDestination.bitField0_;
                    return this;
                }
                case 4: {
                    return new Builder();
                }
                case 3: {
                    this.metrics_.makeImmutable();
                    return null;
                }
                case 2: {
                    return DEFAULT_INSTANCE;
                }
                case 1: 
            }
            return new MonitoringDestination();
        }

        @Override
        public String getMetrics(int n) {
            return (String)this.metrics_.get(n);
        }

        @Override
        public ByteString getMetricsBytes(int n) {
            return ByteString.copyFromUtf8((String)((String)this.metrics_.get(n)));
        }

        @Override
        public int getMetricsCount() {
            return this.metrics_.size();
        }

        @Override
        public List<String> getMetricsList() {
            return this.metrics_;
        }

        @Override
        public String getMonitoredResource() {
            return this.monitoredResource_;
        }

        @Override
        public ByteString getMonitoredResourceBytes() {
            return ByteString.copyFromUtf8((String)this.monitoredResource_);
        }

        public int getSerializedSize() {
            int n;
            int n2 = this.memoizedSerializedSize;
            if (n2 != -1) {
                return n2;
            }
            boolean bl = this.monitoredResource_.isEmpty();
            int n3 = 0;
            if (!bl) {
                n3 = 0 + CodedOutputStream.computeStringSize((int)1, (String)this.getMonitoredResource());
            }
            int n4 = 0;
            for (int i = 0; i < this.metrics_.size(); ++i) {
                n4 += CodedOutputStream.computeStringSizeNoTag((String)((String)this.metrics_.get(i)));
            }
            this.memoizedSerializedSize = n = n3 + n4 + 1 * this.getMetricsList().size();
            return n;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.monitoredResource_.isEmpty()) {
                codedOutputStream.writeString(1, this.getMonitoredResource());
            }
            for (int i = 0; i < this.metrics_.size(); ++i) {
                codedOutputStream.writeString(2, (String)this.metrics_.get(i));
            }
        }

        public static final class Builder
        extends GeneratedMessageLite.Builder<MonitoringDestination, Builder>
        implements MonitoringDestinationOrBuilder {
            private Builder() {
                super((GeneratedMessageLite)DEFAULT_INSTANCE);
            }

            public Builder addAllMetrics(Iterable<String> iterable) {
                this.copyOnWrite();
                ((MonitoringDestination)this.instance).addAllMetrics((Iterable<String>)iterable);
                return this;
            }

            public Builder addMetrics(String string2) {
                this.copyOnWrite();
                ((MonitoringDestination)this.instance).addMetrics(string2);
                return this;
            }

            public Builder addMetricsBytes(ByteString byteString) {
                this.copyOnWrite();
                ((MonitoringDestination)this.instance).addMetricsBytes(byteString);
                return this;
            }

            public Builder clearMetrics() {
                this.copyOnWrite();
                ((MonitoringDestination)this.instance).clearMetrics();
                return this;
            }

            public Builder clearMonitoredResource() {
                this.copyOnWrite();
                ((MonitoringDestination)this.instance).clearMonitoredResource();
                return this;
            }

            @Override
            public String getMetrics(int n) {
                return ((MonitoringDestination)this.instance).getMetrics(n);
            }

            @Override
            public ByteString getMetricsBytes(int n) {
                return ((MonitoringDestination)this.instance).getMetricsBytes(n);
            }

            @Override
            public int getMetricsCount() {
                return ((MonitoringDestination)this.instance).getMetricsCount();
            }

            @Override
            public List<String> getMetricsList() {
                return Collections.unmodifiableList(((MonitoringDestination)this.instance).getMetricsList());
            }

            @Override
            public String getMonitoredResource() {
                return ((MonitoringDestination)this.instance).getMonitoredResource();
            }

            @Override
            public ByteString getMonitoredResourceBytes() {
                return ((MonitoringDestination)this.instance).getMonitoredResourceBytes();
            }

            public Builder setMetrics(int n, String string2) {
                this.copyOnWrite();
                ((MonitoringDestination)this.instance).setMetrics(n, string2);
                return this;
            }

            public Builder setMonitoredResource(String string2) {
                this.copyOnWrite();
                ((MonitoringDestination)this.instance).setMonitoredResource(string2);
                return this;
            }

            public Builder setMonitoredResourceBytes(ByteString byteString) {
                this.copyOnWrite();
                ((MonitoringDestination)this.instance).setMonitoredResourceBytes(byteString);
                return this;
            }
        }

    }

    public static interface MonitoringDestinationOrBuilder
    extends MessageLiteOrBuilder {
        public String getMetrics(int var1);

        public ByteString getMetricsBytes(int var1);

        public int getMetricsCount();

        public List<String> getMetricsList();

        public String getMonitoredResource();

        public ByteString getMonitoredResourceBytes();
    }

}

