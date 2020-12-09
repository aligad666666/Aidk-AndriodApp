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

import com.google.api.BillingOrBuilder;
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

public final class Billing
extends GeneratedMessageLite<Billing, Builder>
implements BillingOrBuilder {
    public static final int CONSUMER_DESTINATIONS_FIELD_NUMBER = 8;
    private static final Billing DEFAULT_INSTANCE = new Billing();
    private static volatile Parser<Billing> PARSER;
    private Internal.ProtobufList<BillingDestination> consumerDestinations_ = Billing.emptyProtobufList();

    static {
        DEFAULT_INSTANCE.makeImmutable();
    }

    private Billing() {
    }

    private void addAllConsumerDestinations(Iterable<? extends BillingDestination> iterable) {
        this.ensureConsumerDestinationsIsMutable();
        AbstractMessageLite.addAll(iterable, this.consumerDestinations_);
    }

    private void addConsumerDestinations(int n, BillingDestination.Builder builder) {
        this.ensureConsumerDestinationsIsMutable();
        this.consumerDestinations_.add(n, (Object)((BillingDestination)builder.build()));
    }

    private void addConsumerDestinations(int n, BillingDestination billingDestination) {
        if (billingDestination != null) {
            this.ensureConsumerDestinationsIsMutable();
            this.consumerDestinations_.add(n, (Object)billingDestination);
            return;
        }
        throw new NullPointerException();
    }

    private void addConsumerDestinations(BillingDestination.Builder builder) {
        this.ensureConsumerDestinationsIsMutable();
        this.consumerDestinations_.add((Object)((BillingDestination)builder.build()));
    }

    private void addConsumerDestinations(BillingDestination billingDestination) {
        if (billingDestination != null) {
            this.ensureConsumerDestinationsIsMutable();
            this.consumerDestinations_.add((Object)billingDestination);
            return;
        }
        throw new NullPointerException();
    }

    private void clearConsumerDestinations() {
        this.consumerDestinations_ = Billing.emptyProtobufList();
    }

    private void ensureConsumerDestinationsIsMutable() {
        if (!this.consumerDestinations_.isModifiable()) {
            this.consumerDestinations_ = GeneratedMessageLite.mutableCopy(this.consumerDestinations_);
        }
    }

    public static Billing getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(Billing billing) {
        return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)billing);
    }

    public static Billing parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Billing)Billing.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Billing parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Billing)Billing.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Billing parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Billing)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static Billing parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Billing)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Billing parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Billing)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static Billing parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Billing)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Billing parseFrom(InputStream inputStream) throws IOException {
        return (Billing)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Billing parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Billing)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Billing parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (Billing)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static Billing parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Billing)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<Billing> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeConsumerDestinations(int n) {
        this.ensureConsumerDestinationsIsMutable();
        this.consumerDestinations_.remove(n);
    }

    private void setConsumerDestinations(int n, BillingDestination.Builder builder) {
        this.ensureConsumerDestinationsIsMutable();
        this.consumerDestinations_.set(n, (Object)((BillingDestination)builder.build()));
    }

    private void setConsumerDestinations(int n, BillingDestination billingDestination) {
        if (billingDestination != null) {
            this.ensureConsumerDestinationsIsMutable();
            this.consumerDestinations_.set(n, (Object)billingDestination);
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
                Class<Billing> class_ = Billing.class;
                // MONITORENTER : com.google.api.Billing.class
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
                        if (n != 66) {
                            if (codedInputStream.skipField(n)) continue;
                            bl = true;
                            continue;
                        }
                        if (!this.consumerDestinations_.isModifiable()) {
                            this.consumerDestinations_ = GeneratedMessageLite.mutableCopy(this.consumerDestinations_);
                        }
                        this.consumerDestinations_.add((Object)((BillingDestination)codedInputStream.readMessage(BillingDestination.parser(), extensionRegistryLite)));
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
                Billing billing = (Billing)object2;
                this.consumerDestinations_ = visitor.visitList(this.consumerDestinations_, billing.consumerDestinations_);
                return this;
            }
            case 4: {
                return new Builder();
            }
            case 3: {
                this.consumerDestinations_.makeImmutable();
                return null;
            }
            case 2: {
                return DEFAULT_INSTANCE;
            }
            case 1: 
        }
        return new Billing();
    }

    @Override
    public BillingDestination getConsumerDestinations(int n) {
        return (BillingDestination)this.consumerDestinations_.get(n);
    }

    @Override
    public int getConsumerDestinationsCount() {
        return this.consumerDestinations_.size();
    }

    @Override
    public List<BillingDestination> getConsumerDestinationsList() {
        return this.consumerDestinations_;
    }

    public BillingDestinationOrBuilder getConsumerDestinationsOrBuilder(int n) {
        return (BillingDestinationOrBuilder)this.consumerDestinations_.get(n);
    }

    public List<? extends BillingDestinationOrBuilder> getConsumerDestinationsOrBuilderList() {
        return this.consumerDestinations_;
    }

    public int getSerializedSize() {
        int n = this.memoizedSerializedSize;
        if (n != -1) {
            return n;
        }
        int n2 = 0;
        for (int i = 0; i < this.consumerDestinations_.size(); ++i) {
            n2 += CodedOutputStream.computeMessageSize((int)8, (MessageLite)((MessageLite)this.consumerDestinations_.get(i)));
        }
        this.memoizedSerializedSize = n2;
        return n2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.consumerDestinations_.size(); ++i) {
            codedOutputStream.writeMessage(8, (MessageLite)this.consumerDestinations_.get(i));
        }
    }

    public static final class BillingDestination
    extends GeneratedMessageLite<BillingDestination, Builder>
    implements BillingDestinationOrBuilder {
        private static final BillingDestination DEFAULT_INSTANCE = new BillingDestination();
        public static final int METRICS_FIELD_NUMBER = 2;
        public static final int MONITORED_RESOURCE_FIELD_NUMBER = 1;
        private static volatile Parser<BillingDestination> PARSER;
        private int bitField0_;
        private Internal.ProtobufList<String> metrics_ = GeneratedMessageLite.emptyProtobufList();
        private String monitoredResource_ = "";

        static {
            DEFAULT_INSTANCE.makeImmutable();
        }

        private BillingDestination() {
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
                BillingDestination.checkByteStringIsUtf8((ByteString)byteString);
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
            this.monitoredResource_ = BillingDestination.getDefaultInstance().getMonitoredResource();
        }

        private void ensureMetricsIsMutable() {
            if (!this.metrics_.isModifiable()) {
                this.metrics_ = GeneratedMessageLite.mutableCopy(this.metrics_);
            }
        }

        public static BillingDestination getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(BillingDestination billingDestination) {
            return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)billingDestination);
        }

        public static BillingDestination parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (BillingDestination)BillingDestination.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static BillingDestination parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (BillingDestination)BillingDestination.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static BillingDestination parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (BillingDestination)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
        }

        public static BillingDestination parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (BillingDestination)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static BillingDestination parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (BillingDestination)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
        }

        public static BillingDestination parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (BillingDestination)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static BillingDestination parseFrom(InputStream inputStream) throws IOException {
            return (BillingDestination)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static BillingDestination parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (BillingDestination)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static BillingDestination parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
            return (BillingDestination)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
        }

        public static BillingDestination parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (BillingDestination)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Parser<BillingDestination> parser() {
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
                BillingDestination.checkByteStringIsUtf8((ByteString)byteString);
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
                    Class<BillingDestination> class_ = BillingDestination.class;
                    // MONITORENTER : com.google.api.Billing$BillingDestination.class
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
                    BillingDestination billingDestination = (BillingDestination)object2;
                    this.monitoredResource_ = visitor.visitString(true ^ this.monitoredResource_.isEmpty(), this.monitoredResource_, true ^ billingDestination.monitoredResource_.isEmpty(), billingDestination.monitoredResource_);
                    this.metrics_ = visitor.visitList(this.metrics_, billingDestination.metrics_);
                    if (visitor != GeneratedMessageLite.MergeFromVisitor.INSTANCE) return this;
                    this.bitField0_ |= billingDestination.bitField0_;
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
            return new BillingDestination();
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
        extends GeneratedMessageLite.Builder<BillingDestination, Builder>
        implements BillingDestinationOrBuilder {
            private Builder() {
                super((GeneratedMessageLite)DEFAULT_INSTANCE);
            }

            public Builder addAllMetrics(Iterable<String> iterable) {
                this.copyOnWrite();
                ((BillingDestination)this.instance).addAllMetrics((Iterable<String>)iterable);
                return this;
            }

            public Builder addMetrics(String string2) {
                this.copyOnWrite();
                ((BillingDestination)this.instance).addMetrics(string2);
                return this;
            }

            public Builder addMetricsBytes(ByteString byteString) {
                this.copyOnWrite();
                ((BillingDestination)this.instance).addMetricsBytes(byteString);
                return this;
            }

            public Builder clearMetrics() {
                this.copyOnWrite();
                ((BillingDestination)this.instance).clearMetrics();
                return this;
            }

            public Builder clearMonitoredResource() {
                this.copyOnWrite();
                ((BillingDestination)this.instance).clearMonitoredResource();
                return this;
            }

            @Override
            public String getMetrics(int n) {
                return ((BillingDestination)this.instance).getMetrics(n);
            }

            @Override
            public ByteString getMetricsBytes(int n) {
                return ((BillingDestination)this.instance).getMetricsBytes(n);
            }

            @Override
            public int getMetricsCount() {
                return ((BillingDestination)this.instance).getMetricsCount();
            }

            @Override
            public List<String> getMetricsList() {
                return Collections.unmodifiableList(((BillingDestination)this.instance).getMetricsList());
            }

            @Override
            public String getMonitoredResource() {
                return ((BillingDestination)this.instance).getMonitoredResource();
            }

            @Override
            public ByteString getMonitoredResourceBytes() {
                return ((BillingDestination)this.instance).getMonitoredResourceBytes();
            }

            public Builder setMetrics(int n, String string2) {
                this.copyOnWrite();
                ((BillingDestination)this.instance).setMetrics(n, string2);
                return this;
            }

            public Builder setMonitoredResource(String string2) {
                this.copyOnWrite();
                ((BillingDestination)this.instance).setMonitoredResource(string2);
                return this;
            }

            public Builder setMonitoredResourceBytes(ByteString byteString) {
                this.copyOnWrite();
                ((BillingDestination)this.instance).setMonitoredResourceBytes(byteString);
                return this;
            }
        }

    }

    public static interface BillingDestinationOrBuilder
    extends MessageLiteOrBuilder {
        public String getMetrics(int var1);

        public ByteString getMetricsBytes(int var1);

        public int getMetricsCount();

        public List<String> getMetricsList();

        public String getMonitoredResource();

        public ByteString getMonitoredResourceBytes();
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<Billing, Builder>
    implements BillingOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder addAllConsumerDestinations(Iterable<? extends BillingDestination> iterable) {
            this.copyOnWrite();
            ((Billing)this.instance).addAllConsumerDestinations((Iterable<? extends BillingDestination>)iterable);
            return this;
        }

        public Builder addConsumerDestinations(int n, BillingDestination.Builder builder) {
            this.copyOnWrite();
            ((Billing)this.instance).addConsumerDestinations(n, builder);
            return this;
        }

        public Builder addConsumerDestinations(int n, BillingDestination billingDestination) {
            this.copyOnWrite();
            ((Billing)this.instance).addConsumerDestinations(n, billingDestination);
            return this;
        }

        public Builder addConsumerDestinations(BillingDestination.Builder builder) {
            this.copyOnWrite();
            ((Billing)this.instance).addConsumerDestinations(builder);
            return this;
        }

        public Builder addConsumerDestinations(BillingDestination billingDestination) {
            this.copyOnWrite();
            ((Billing)this.instance).addConsumerDestinations(billingDestination);
            return this;
        }

        public Builder clearConsumerDestinations() {
            this.copyOnWrite();
            ((Billing)this.instance).clearConsumerDestinations();
            return this;
        }

        @Override
        public BillingDestination getConsumerDestinations(int n) {
            return ((Billing)this.instance).getConsumerDestinations(n);
        }

        @Override
        public int getConsumerDestinationsCount() {
            return ((Billing)this.instance).getConsumerDestinationsCount();
        }

        @Override
        public List<BillingDestination> getConsumerDestinationsList() {
            return Collections.unmodifiableList(((Billing)this.instance).getConsumerDestinationsList());
        }

        public Builder removeConsumerDestinations(int n) {
            this.copyOnWrite();
            ((Billing)this.instance).removeConsumerDestinations(n);
            return this;
        }

        public Builder setConsumerDestinations(int n, BillingDestination.Builder builder) {
            this.copyOnWrite();
            ((Billing)this.instance).setConsumerDestinations(n, builder);
            return this;
        }

        public Builder setConsumerDestinations(int n, BillingDestination billingDestination) {
            this.copyOnWrite();
            ((Billing)this.instance).setConsumerDestinations(n, billingDestination);
            return this;
        }
    }

}

