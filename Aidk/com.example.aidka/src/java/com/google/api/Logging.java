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

import com.google.api.LoggingOrBuilder;
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

public final class Logging
extends GeneratedMessageLite<Logging, Builder>
implements LoggingOrBuilder {
    public static final int CONSUMER_DESTINATIONS_FIELD_NUMBER = 2;
    private static final Logging DEFAULT_INSTANCE = new Logging();
    private static volatile Parser<Logging> PARSER;
    public static final int PRODUCER_DESTINATIONS_FIELD_NUMBER = 1;
    private Internal.ProtobufList<LoggingDestination> consumerDestinations_ = Logging.emptyProtobufList();
    private Internal.ProtobufList<LoggingDestination> producerDestinations_ = Logging.emptyProtobufList();

    static {
        DEFAULT_INSTANCE.makeImmutable();
    }

    private Logging() {
    }

    private void addAllConsumerDestinations(Iterable<? extends LoggingDestination> iterable) {
        this.ensureConsumerDestinationsIsMutable();
        AbstractMessageLite.addAll(iterable, this.consumerDestinations_);
    }

    private void addAllProducerDestinations(Iterable<? extends LoggingDestination> iterable) {
        this.ensureProducerDestinationsIsMutable();
        AbstractMessageLite.addAll(iterable, this.producerDestinations_);
    }

    private void addConsumerDestinations(int n, LoggingDestination.Builder builder) {
        this.ensureConsumerDestinationsIsMutable();
        this.consumerDestinations_.add(n, (Object)((LoggingDestination)builder.build()));
    }

    private void addConsumerDestinations(int n, LoggingDestination loggingDestination) {
        if (loggingDestination != null) {
            this.ensureConsumerDestinationsIsMutable();
            this.consumerDestinations_.add(n, (Object)loggingDestination);
            return;
        }
        throw new NullPointerException();
    }

    private void addConsumerDestinations(LoggingDestination.Builder builder) {
        this.ensureConsumerDestinationsIsMutable();
        this.consumerDestinations_.add((Object)((LoggingDestination)builder.build()));
    }

    private void addConsumerDestinations(LoggingDestination loggingDestination) {
        if (loggingDestination != null) {
            this.ensureConsumerDestinationsIsMutable();
            this.consumerDestinations_.add((Object)loggingDestination);
            return;
        }
        throw new NullPointerException();
    }

    private void addProducerDestinations(int n, LoggingDestination.Builder builder) {
        this.ensureProducerDestinationsIsMutable();
        this.producerDestinations_.add(n, (Object)((LoggingDestination)builder.build()));
    }

    private void addProducerDestinations(int n, LoggingDestination loggingDestination) {
        if (loggingDestination != null) {
            this.ensureProducerDestinationsIsMutable();
            this.producerDestinations_.add(n, (Object)loggingDestination);
            return;
        }
        throw new NullPointerException();
    }

    private void addProducerDestinations(LoggingDestination.Builder builder) {
        this.ensureProducerDestinationsIsMutable();
        this.producerDestinations_.add((Object)((LoggingDestination)builder.build()));
    }

    private void addProducerDestinations(LoggingDestination loggingDestination) {
        if (loggingDestination != null) {
            this.ensureProducerDestinationsIsMutable();
            this.producerDestinations_.add((Object)loggingDestination);
            return;
        }
        throw new NullPointerException();
    }

    private void clearConsumerDestinations() {
        this.consumerDestinations_ = Logging.emptyProtobufList();
    }

    private void clearProducerDestinations() {
        this.producerDestinations_ = Logging.emptyProtobufList();
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

    public static Logging getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(Logging logging) {
        return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)logging);
    }

    public static Logging parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Logging)Logging.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Logging parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Logging)Logging.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Logging parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Logging)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static Logging parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Logging)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Logging parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Logging)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static Logging parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Logging)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Logging parseFrom(InputStream inputStream) throws IOException {
        return (Logging)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Logging parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Logging)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Logging parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (Logging)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static Logging parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Logging)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<Logging> parser() {
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

    private void setConsumerDestinations(int n, LoggingDestination.Builder builder) {
        this.ensureConsumerDestinationsIsMutable();
        this.consumerDestinations_.set(n, (Object)((LoggingDestination)builder.build()));
    }

    private void setConsumerDestinations(int n, LoggingDestination loggingDestination) {
        if (loggingDestination != null) {
            this.ensureConsumerDestinationsIsMutable();
            this.consumerDestinations_.set(n, (Object)loggingDestination);
            return;
        }
        throw new NullPointerException();
    }

    private void setProducerDestinations(int n, LoggingDestination.Builder builder) {
        this.ensureProducerDestinationsIsMutable();
        this.producerDestinations_.set(n, (Object)((LoggingDestination)builder.build()));
    }

    private void setProducerDestinations(int n, LoggingDestination loggingDestination) {
        if (loggingDestination != null) {
            this.ensureProducerDestinationsIsMutable();
            this.producerDestinations_.set(n, (Object)loggingDestination);
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
                Class<Logging> class_ = Logging.class;
                // MONITORENTER : com.google.api.Logging.class
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
                            this.consumerDestinations_.add((Object)((LoggingDestination)codedInputStream.readMessage(LoggingDestination.parser(), extensionRegistryLite)));
                            continue;
                        }
                        if (!this.producerDestinations_.isModifiable()) {
                            this.producerDestinations_ = GeneratedMessageLite.mutableCopy(this.producerDestinations_);
                        }
                        this.producerDestinations_.add((Object)((LoggingDestination)codedInputStream.readMessage(LoggingDestination.parser(), extensionRegistryLite)));
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
                Logging logging = (Logging)object2;
                this.producerDestinations_ = visitor.visitList(this.producerDestinations_, logging.producerDestinations_);
                this.consumerDestinations_ = visitor.visitList(this.consumerDestinations_, logging.consumerDestinations_);
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
        return new Logging();
    }

    @Override
    public LoggingDestination getConsumerDestinations(int n) {
        return (LoggingDestination)this.consumerDestinations_.get(n);
    }

    @Override
    public int getConsumerDestinationsCount() {
        return this.consumerDestinations_.size();
    }

    @Override
    public List<LoggingDestination> getConsumerDestinationsList() {
        return this.consumerDestinations_;
    }

    public LoggingDestinationOrBuilder getConsumerDestinationsOrBuilder(int n) {
        return (LoggingDestinationOrBuilder)this.consumerDestinations_.get(n);
    }

    public List<? extends LoggingDestinationOrBuilder> getConsumerDestinationsOrBuilderList() {
        return this.consumerDestinations_;
    }

    @Override
    public LoggingDestination getProducerDestinations(int n) {
        return (LoggingDestination)this.producerDestinations_.get(n);
    }

    @Override
    public int getProducerDestinationsCount() {
        return this.producerDestinations_.size();
    }

    @Override
    public List<LoggingDestination> getProducerDestinationsList() {
        return this.producerDestinations_;
    }

    public LoggingDestinationOrBuilder getProducerDestinationsOrBuilder(int n) {
        return (LoggingDestinationOrBuilder)this.producerDestinations_.get(n);
    }

    public List<? extends LoggingDestinationOrBuilder> getProducerDestinationsOrBuilderList() {
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
    extends GeneratedMessageLite.Builder<Logging, Builder>
    implements LoggingOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder addAllConsumerDestinations(Iterable<? extends LoggingDestination> iterable) {
            this.copyOnWrite();
            ((Logging)this.instance).addAllConsumerDestinations((Iterable<? extends LoggingDestination>)iterable);
            return this;
        }

        public Builder addAllProducerDestinations(Iterable<? extends LoggingDestination> iterable) {
            this.copyOnWrite();
            ((Logging)this.instance).addAllProducerDestinations((Iterable<? extends LoggingDestination>)iterable);
            return this;
        }

        public Builder addConsumerDestinations(int n, LoggingDestination.Builder builder) {
            this.copyOnWrite();
            ((Logging)this.instance).addConsumerDestinations(n, builder);
            return this;
        }

        public Builder addConsumerDestinations(int n, LoggingDestination loggingDestination) {
            this.copyOnWrite();
            ((Logging)this.instance).addConsumerDestinations(n, loggingDestination);
            return this;
        }

        public Builder addConsumerDestinations(LoggingDestination.Builder builder) {
            this.copyOnWrite();
            ((Logging)this.instance).addConsumerDestinations(builder);
            return this;
        }

        public Builder addConsumerDestinations(LoggingDestination loggingDestination) {
            this.copyOnWrite();
            ((Logging)this.instance).addConsumerDestinations(loggingDestination);
            return this;
        }

        public Builder addProducerDestinations(int n, LoggingDestination.Builder builder) {
            this.copyOnWrite();
            ((Logging)this.instance).addProducerDestinations(n, builder);
            return this;
        }

        public Builder addProducerDestinations(int n, LoggingDestination loggingDestination) {
            this.copyOnWrite();
            ((Logging)this.instance).addProducerDestinations(n, loggingDestination);
            return this;
        }

        public Builder addProducerDestinations(LoggingDestination.Builder builder) {
            this.copyOnWrite();
            ((Logging)this.instance).addProducerDestinations(builder);
            return this;
        }

        public Builder addProducerDestinations(LoggingDestination loggingDestination) {
            this.copyOnWrite();
            ((Logging)this.instance).addProducerDestinations(loggingDestination);
            return this;
        }

        public Builder clearConsumerDestinations() {
            this.copyOnWrite();
            ((Logging)this.instance).clearConsumerDestinations();
            return this;
        }

        public Builder clearProducerDestinations() {
            this.copyOnWrite();
            ((Logging)this.instance).clearProducerDestinations();
            return this;
        }

        @Override
        public LoggingDestination getConsumerDestinations(int n) {
            return ((Logging)this.instance).getConsumerDestinations(n);
        }

        @Override
        public int getConsumerDestinationsCount() {
            return ((Logging)this.instance).getConsumerDestinationsCount();
        }

        @Override
        public List<LoggingDestination> getConsumerDestinationsList() {
            return Collections.unmodifiableList(((Logging)this.instance).getConsumerDestinationsList());
        }

        @Override
        public LoggingDestination getProducerDestinations(int n) {
            return ((Logging)this.instance).getProducerDestinations(n);
        }

        @Override
        public int getProducerDestinationsCount() {
            return ((Logging)this.instance).getProducerDestinationsCount();
        }

        @Override
        public List<LoggingDestination> getProducerDestinationsList() {
            return Collections.unmodifiableList(((Logging)this.instance).getProducerDestinationsList());
        }

        public Builder removeConsumerDestinations(int n) {
            this.copyOnWrite();
            ((Logging)this.instance).removeConsumerDestinations(n);
            return this;
        }

        public Builder removeProducerDestinations(int n) {
            this.copyOnWrite();
            ((Logging)this.instance).removeProducerDestinations(n);
            return this;
        }

        public Builder setConsumerDestinations(int n, LoggingDestination.Builder builder) {
            this.copyOnWrite();
            ((Logging)this.instance).setConsumerDestinations(n, builder);
            return this;
        }

        public Builder setConsumerDestinations(int n, LoggingDestination loggingDestination) {
            this.copyOnWrite();
            ((Logging)this.instance).setConsumerDestinations(n, loggingDestination);
            return this;
        }

        public Builder setProducerDestinations(int n, LoggingDestination.Builder builder) {
            this.copyOnWrite();
            ((Logging)this.instance).setProducerDestinations(n, builder);
            return this;
        }

        public Builder setProducerDestinations(int n, LoggingDestination loggingDestination) {
            this.copyOnWrite();
            ((Logging)this.instance).setProducerDestinations(n, loggingDestination);
            return this;
        }
    }

    public static final class LoggingDestination
    extends GeneratedMessageLite<LoggingDestination, Builder>
    implements LoggingDestinationOrBuilder {
        private static final LoggingDestination DEFAULT_INSTANCE = new LoggingDestination();
        public static final int LOGS_FIELD_NUMBER = 1;
        public static final int MONITORED_RESOURCE_FIELD_NUMBER = 3;
        private static volatile Parser<LoggingDestination> PARSER;
        private int bitField0_;
        private Internal.ProtobufList<String> logs_ = GeneratedMessageLite.emptyProtobufList();
        private String monitoredResource_ = "";

        static {
            DEFAULT_INSTANCE.makeImmutable();
        }

        private LoggingDestination() {
        }

        private void addAllLogs(Iterable<String> iterable) {
            this.ensureLogsIsMutable();
            AbstractMessageLite.addAll(iterable, this.logs_);
        }

        private void addLogs(String string2) {
            if (string2 != null) {
                this.ensureLogsIsMutable();
                this.logs_.add((Object)string2);
                return;
            }
            throw new NullPointerException();
        }

        private void addLogsBytes(ByteString byteString) {
            if (byteString != null) {
                LoggingDestination.checkByteStringIsUtf8((ByteString)byteString);
                this.ensureLogsIsMutable();
                this.logs_.add((Object)byteString.toStringUtf8());
                return;
            }
            throw new NullPointerException();
        }

        private void clearLogs() {
            this.logs_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void clearMonitoredResource() {
            this.monitoredResource_ = LoggingDestination.getDefaultInstance().getMonitoredResource();
        }

        private void ensureLogsIsMutable() {
            if (!this.logs_.isModifiable()) {
                this.logs_ = GeneratedMessageLite.mutableCopy(this.logs_);
            }
        }

        public static LoggingDestination getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(LoggingDestination loggingDestination) {
            return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)loggingDestination);
        }

        public static LoggingDestination parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (LoggingDestination)LoggingDestination.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static LoggingDestination parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (LoggingDestination)LoggingDestination.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static LoggingDestination parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (LoggingDestination)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
        }

        public static LoggingDestination parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (LoggingDestination)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static LoggingDestination parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (LoggingDestination)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
        }

        public static LoggingDestination parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (LoggingDestination)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static LoggingDestination parseFrom(InputStream inputStream) throws IOException {
            return (LoggingDestination)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static LoggingDestination parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (LoggingDestination)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static LoggingDestination parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
            return (LoggingDestination)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
        }

        public static LoggingDestination parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (LoggingDestination)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Parser<LoggingDestination> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setLogs(int n, String string2) {
            if (string2 != null) {
                this.ensureLogsIsMutable();
                this.logs_.set(n, (Object)string2);
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
                LoggingDestination.checkByteStringIsUtf8((ByteString)byteString);
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
                    Class<LoggingDestination> class_ = LoggingDestination.class;
                    // MONITORENTER : com.google.api.Logging$LoggingDestination.class
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
                                if (n != 26) {
                                    if (codedInputStream.skipField(n)) continue;
                                    bl = true;
                                    continue;
                                }
                                this.monitoredResource_ = codedInputStream.readStringRequireUtf8();
                                continue;
                            }
                            String string2 = codedInputStream.readStringRequireUtf8();
                            if (!this.logs_.isModifiable()) {
                                this.logs_ = GeneratedMessageLite.mutableCopy(this.logs_);
                            }
                            this.logs_.add((Object)string2);
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
                    LoggingDestination loggingDestination = (LoggingDestination)object2;
                    this.monitoredResource_ = visitor.visitString(true ^ this.monitoredResource_.isEmpty(), this.monitoredResource_, true ^ loggingDestination.monitoredResource_.isEmpty(), loggingDestination.monitoredResource_);
                    this.logs_ = visitor.visitList(this.logs_, loggingDestination.logs_);
                    if (visitor != GeneratedMessageLite.MergeFromVisitor.INSTANCE) return this;
                    this.bitField0_ |= loggingDestination.bitField0_;
                    return this;
                }
                case 4: {
                    return new Builder();
                }
                case 3: {
                    this.logs_.makeImmutable();
                    return null;
                }
                case 2: {
                    return DEFAULT_INSTANCE;
                }
                case 1: 
            }
            return new LoggingDestination();
        }

        @Override
        public String getLogs(int n) {
            return (String)this.logs_.get(n);
        }

        @Override
        public ByteString getLogsBytes(int n) {
            return ByteString.copyFromUtf8((String)((String)this.logs_.get(n)));
        }

        @Override
        public int getLogsCount() {
            return this.logs_.size();
        }

        @Override
        public List<String> getLogsList() {
            return this.logs_;
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
            int n = this.memoizedSerializedSize;
            if (n != -1) {
                return n;
            }
            int n2 = 0;
            for (int i = 0; i < this.logs_.size(); ++i) {
                n2 += CodedOutputStream.computeStringSizeNoTag((String)((String)this.logs_.get(i)));
            }
            int n3 = 0 + n2 + 1 * this.getLogsList().size();
            if (!this.monitoredResource_.isEmpty()) {
                n3 += CodedOutputStream.computeStringSize((int)3, (String)this.getMonitoredResource());
            }
            this.memoizedSerializedSize = n3;
            return n3;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            for (int i = 0; i < this.logs_.size(); ++i) {
                codedOutputStream.writeString(1, (String)this.logs_.get(i));
            }
            if (!this.monitoredResource_.isEmpty()) {
                codedOutputStream.writeString(3, this.getMonitoredResource());
            }
        }

        public static final class Builder
        extends GeneratedMessageLite.Builder<LoggingDestination, Builder>
        implements LoggingDestinationOrBuilder {
            private Builder() {
                super((GeneratedMessageLite)DEFAULT_INSTANCE);
            }

            public Builder addAllLogs(Iterable<String> iterable) {
                this.copyOnWrite();
                ((LoggingDestination)this.instance).addAllLogs((Iterable<String>)iterable);
                return this;
            }

            public Builder addLogs(String string2) {
                this.copyOnWrite();
                ((LoggingDestination)this.instance).addLogs(string2);
                return this;
            }

            public Builder addLogsBytes(ByteString byteString) {
                this.copyOnWrite();
                ((LoggingDestination)this.instance).addLogsBytes(byteString);
                return this;
            }

            public Builder clearLogs() {
                this.copyOnWrite();
                ((LoggingDestination)this.instance).clearLogs();
                return this;
            }

            public Builder clearMonitoredResource() {
                this.copyOnWrite();
                ((LoggingDestination)this.instance).clearMonitoredResource();
                return this;
            }

            @Override
            public String getLogs(int n) {
                return ((LoggingDestination)this.instance).getLogs(n);
            }

            @Override
            public ByteString getLogsBytes(int n) {
                return ((LoggingDestination)this.instance).getLogsBytes(n);
            }

            @Override
            public int getLogsCount() {
                return ((LoggingDestination)this.instance).getLogsCount();
            }

            @Override
            public List<String> getLogsList() {
                return Collections.unmodifiableList(((LoggingDestination)this.instance).getLogsList());
            }

            @Override
            public String getMonitoredResource() {
                return ((LoggingDestination)this.instance).getMonitoredResource();
            }

            @Override
            public ByteString getMonitoredResourceBytes() {
                return ((LoggingDestination)this.instance).getMonitoredResourceBytes();
            }

            public Builder setLogs(int n, String string2) {
                this.copyOnWrite();
                ((LoggingDestination)this.instance).setLogs(n, string2);
                return this;
            }

            public Builder setMonitoredResource(String string2) {
                this.copyOnWrite();
                ((LoggingDestination)this.instance).setMonitoredResource(string2);
                return this;
            }

            public Builder setMonitoredResourceBytes(ByteString byteString) {
                this.copyOnWrite();
                ((LoggingDestination)this.instance).setMonitoredResourceBytes(byteString);
                return this;
            }
        }

    }

    public static interface LoggingDestinationOrBuilder
    extends MessageLiteOrBuilder {
        public String getLogs(int var1);

        public ByteString getLogsBytes(int var1);

        public int getLogsCount();

        public List<String> getLogsList();

        public String getMonitoredResource();

        public ByteString getMonitoredResourceBytes();
    }

}

