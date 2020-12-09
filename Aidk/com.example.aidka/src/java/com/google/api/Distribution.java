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
 *  com.google.protobuf.Internal$DoubleList
 *  com.google.protobuf.Internal$EnumLite
 *  com.google.protobuf.Internal$LongList
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.MessageLiteOrBuilder
 *  com.google.protobuf.Parser
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.Class
 *  java.lang.Deprecated
 *  java.lang.Double
 *  java.lang.Enum
 *  java.lang.Iterable
 *  java.lang.Long
 *  java.lang.NoSuchFieldError
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.UnsupportedOperationException
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.List
 */
package com.google.api;

import com.google.api.DistributionOrBuilder;
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
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public final class Distribution
extends GeneratedMessageLite<Distribution, Builder>
implements DistributionOrBuilder {
    public static final int BUCKET_COUNTS_FIELD_NUMBER = 7;
    public static final int BUCKET_OPTIONS_FIELD_NUMBER = 6;
    public static final int COUNT_FIELD_NUMBER = 1;
    private static final Distribution DEFAULT_INSTANCE = new Distribution();
    public static final int MEAN_FIELD_NUMBER = 2;
    private static volatile Parser<Distribution> PARSER;
    public static final int RANGE_FIELD_NUMBER = 4;
    public static final int SUM_OF_SQUARED_DEVIATION_FIELD_NUMBER = 3;
    private int bitField0_;
    private Internal.LongList bucketCounts_ = Distribution.emptyLongList();
    private BucketOptions bucketOptions_;
    private long count_;
    private double mean_;
    private Range range_;
    private double sumOfSquaredDeviation_;

    static {
        DEFAULT_INSTANCE.makeImmutable();
    }

    private Distribution() {
    }

    private void addAllBucketCounts(Iterable<? extends Long> iterable) {
        this.ensureBucketCountsIsMutable();
        AbstractMessageLite.addAll(iterable, (Collection)this.bucketCounts_);
    }

    private void addBucketCounts(long l) {
        this.ensureBucketCountsIsMutable();
        this.bucketCounts_.addLong(l);
    }

    private void clearBucketCounts() {
        this.bucketCounts_ = Distribution.emptyLongList();
    }

    private void clearBucketOptions() {
        this.bucketOptions_ = null;
    }

    private void clearCount() {
        this.count_ = 0L;
    }

    private void clearMean() {
        this.mean_ = 0.0;
    }

    private void clearRange() {
        this.range_ = null;
    }

    private void clearSumOfSquaredDeviation() {
        this.sumOfSquaredDeviation_ = 0.0;
    }

    private void ensureBucketCountsIsMutable() {
        if (!this.bucketCounts_.isModifiable()) {
            this.bucketCounts_ = GeneratedMessageLite.mutableCopy((Internal.LongList)this.bucketCounts_);
        }
    }

    public static Distribution getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeBucketOptions(BucketOptions bucketOptions) {
        BucketOptions bucketOptions2 = this.bucketOptions_;
        if (bucketOptions2 != null && bucketOptions2 != BucketOptions.getDefaultInstance()) {
            this.bucketOptions_ = (BucketOptions)((BucketOptions.Builder)BucketOptions.newBuilder(this.bucketOptions_).mergeFrom((GeneratedMessageLite)bucketOptions)).buildPartial();
            return;
        }
        this.bucketOptions_ = bucketOptions;
    }

    private void mergeRange(Range range) {
        Range range2 = this.range_;
        if (range2 != null && range2 != Range.getDefaultInstance()) {
            this.range_ = (Range)((Range.Builder)Range.newBuilder(this.range_).mergeFrom((GeneratedMessageLite)range)).buildPartial();
            return;
        }
        this.range_ = range;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(Distribution distribution) {
        return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)distribution);
    }

    public static Distribution parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Distribution)Distribution.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Distribution parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Distribution)Distribution.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Distribution parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Distribution)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static Distribution parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Distribution)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Distribution parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Distribution)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static Distribution parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Distribution)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Distribution parseFrom(InputStream inputStream) throws IOException {
        return (Distribution)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Distribution parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Distribution)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Distribution parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (Distribution)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static Distribution parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Distribution)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<Distribution> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setBucketCounts(int n, long l) {
        this.ensureBucketCountsIsMutable();
        this.bucketCounts_.setLong(n, l);
    }

    private void setBucketOptions(BucketOptions.Builder builder) {
        this.bucketOptions_ = (BucketOptions)builder.build();
    }

    private void setBucketOptions(BucketOptions bucketOptions) {
        if (bucketOptions != null) {
            this.bucketOptions_ = bucketOptions;
            return;
        }
        throw new NullPointerException();
    }

    private void setCount(long l) {
        this.count_ = l;
    }

    private void setMean(double d) {
        this.mean_ = d;
    }

    private void setRange(Range.Builder builder) {
        this.range_ = (Range)builder.build();
    }

    private void setRange(Range range) {
        if (range != null) {
            this.range_ = range;
            return;
        }
        throw new NullPointerException();
    }

    private void setSumOfSquaredDeviation(double d) {
        this.sumOfSquaredDeviation_ = d;
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
                Class<Distribution> class_ = Distribution.class;
                // MONITORENTER : com.google.api.Distribution.class
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
                        if (n != 8) {
                            if (n != 17) {
                                if (n != 25) {
                                    if (n != 34) {
                                        if (n != 50) {
                                            if (n != 56) {
                                                if (n != 58) {
                                                    if (codedInputStream.skipField(n)) continue;
                                                    bl = true;
                                                    continue;
                                                }
                                                int n2 = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                                if (!this.bucketCounts_.isModifiable() && codedInputStream.getBytesUntilLimit() > 0) {
                                                    this.bucketCounts_ = GeneratedMessageLite.mutableCopy((Internal.LongList)this.bucketCounts_);
                                                }
                                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                                    this.bucketCounts_.addLong(codedInputStream.readInt64());
                                                }
                                                codedInputStream.popLimit(n2);
                                                continue;
                                            }
                                            if (!this.bucketCounts_.isModifiable()) {
                                                this.bucketCounts_ = GeneratedMessageLite.mutableCopy((Internal.LongList)this.bucketCounts_);
                                            }
                                            this.bucketCounts_.addLong(codedInputStream.readInt64());
                                            continue;
                                        }
                                        BucketOptions bucketOptions = this.bucketOptions_;
                                        BucketOptions.Builder builder = null;
                                        if (bucketOptions != null) {
                                            builder = (BucketOptions.Builder)this.bucketOptions_.toBuilder();
                                        }
                                        this.bucketOptions_ = (BucketOptions)codedInputStream.readMessage(BucketOptions.parser(), extensionRegistryLite);
                                        if (builder == null) continue;
                                        builder.mergeFrom((GeneratedMessageLite)this.bucketOptions_);
                                        this.bucketOptions_ = (BucketOptions)builder.buildPartial();
                                        continue;
                                    }
                                    Range range = this.range_;
                                    Range.Builder builder = null;
                                    if (range != null) {
                                        builder = (Range.Builder)this.range_.toBuilder();
                                    }
                                    this.range_ = (Range)codedInputStream.readMessage(Range.parser(), extensionRegistryLite);
                                    if (builder == null) continue;
                                    builder.mergeFrom((GeneratedMessageLite)this.range_);
                                    this.range_ = (Range)builder.buildPartial();
                                    continue;
                                }
                                this.sumOfSquaredDeviation_ = codedInputStream.readDouble();
                                continue;
                            }
                            this.mean_ = codedInputStream.readDouble();
                            continue;
                        }
                        this.count_ = codedInputStream.readInt64();
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
                Distribution distribution = (Distribution)object2;
                boolean bl = this.count_ != 0L;
                long l = this.count_;
                boolean bl2 = distribution.count_ != 0L;
                long l2 = distribution.count_;
                this.count_ = visitor.visitLong(bl, l, bl2, l2);
                boolean bl3 = this.mean_ != 0.0;
                double d = this.mean_;
                boolean bl4 = distribution.mean_ != 0.0;
                this.mean_ = visitor.visitDouble(bl3, d, bl4, distribution.mean_);
                boolean bl5 = this.sumOfSquaredDeviation_ != 0.0;
                double d2 = this.sumOfSquaredDeviation_;
                boolean bl6 = distribution.sumOfSquaredDeviation_ != 0.0;
                this.sumOfSquaredDeviation_ = visitor.visitDouble(bl5, d2, bl6, distribution.sumOfSquaredDeviation_);
                this.range_ = (Range)visitor.visitMessage((MessageLite)this.range_, (MessageLite)distribution.range_);
                this.bucketOptions_ = (BucketOptions)visitor.visitMessage((MessageLite)this.bucketOptions_, (MessageLite)distribution.bucketOptions_);
                this.bucketCounts_ = visitor.visitLongList(this.bucketCounts_, distribution.bucketCounts_);
                if (visitor != GeneratedMessageLite.MergeFromVisitor.INSTANCE) return this;
                this.bitField0_ |= distribution.bitField0_;
                return this;
            }
            case 4: {
                return new Builder();
            }
            case 3: {
                this.bucketCounts_.makeImmutable();
                return null;
            }
            case 2: {
                return DEFAULT_INSTANCE;
            }
            case 1: 
        }
        return new Distribution();
    }

    @Override
    public long getBucketCounts(int n) {
        return this.bucketCounts_.getLong(n);
    }

    @Override
    public int getBucketCountsCount() {
        return this.bucketCounts_.size();
    }

    @Override
    public List<Long> getBucketCountsList() {
        return this.bucketCounts_;
    }

    @Override
    public BucketOptions getBucketOptions() {
        BucketOptions bucketOptions = this.bucketOptions_;
        if (bucketOptions == null) {
            bucketOptions = BucketOptions.getDefaultInstance();
        }
        return bucketOptions;
    }

    @Override
    public long getCount() {
        return this.count_;
    }

    @Override
    public double getMean() {
        return this.mean_;
    }

    @Override
    public Range getRange() {
        Range range = this.range_;
        if (range == null) {
            range = Range.getDefaultInstance();
        }
        return range;
    }

    public int getSerializedSize() {
        double d;
        int n;
        double d2;
        int n2 = this.memoizedSerializedSize;
        if (n2 != -1) {
            return n2;
        }
        long l = this.count_;
        long l2 = l LCMP 0L;
        int n3 = 0;
        if (l2 != false) {
            n3 = 0 + CodedOutputStream.computeInt64Size((int)1, (long)l);
        }
        if ((d = this.mean_) != 0.0) {
            n3 += CodedOutputStream.computeDoubleSize((int)2, (double)d);
        }
        if ((d2 = this.sumOfSquaredDeviation_) != 0.0) {
            n3 += CodedOutputStream.computeDoubleSize((int)3, (double)d2);
        }
        if (this.range_ != null) {
            n3 += CodedOutputStream.computeMessageSize((int)4, (MessageLite)this.getRange());
        }
        if (this.bucketOptions_ != null) {
            n3 += CodedOutputStream.computeMessageSize((int)6, (MessageLite)this.getBucketOptions());
        }
        int n4 = 0;
        for (int i = 0; i < this.bucketCounts_.size(); ++i) {
            n4 += CodedOutputStream.computeInt64SizeNoTag((long)this.bucketCounts_.getLong(i));
        }
        this.memoizedSerializedSize = n = n3 + n4 + 1 * this.getBucketCountsList().size();
        return n;
    }

    @Override
    public double getSumOfSquaredDeviation() {
        return this.sumOfSquaredDeviation_;
    }

    @Override
    public boolean hasBucketOptions() {
        return this.bucketOptions_ != null;
    }

    @Override
    public boolean hasRange() {
        return this.range_ != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        double d;
        double d2;
        this.getSerializedSize();
        long l = this.count_;
        if (l != 0L) {
            codedOutputStream.writeInt64(1, l);
        }
        if ((d2 = this.mean_) != 0.0) {
            codedOutputStream.writeDouble(2, d2);
        }
        if ((d = this.sumOfSquaredDeviation_) != 0.0) {
            codedOutputStream.writeDouble(3, d);
        }
        if (this.range_ != null) {
            codedOutputStream.writeMessage(4, (MessageLite)this.getRange());
        }
        if (this.bucketOptions_ != null) {
            codedOutputStream.writeMessage(6, (MessageLite)this.getBucketOptions());
        }
        for (int i = 0; i < this.bucketCounts_.size(); ++i) {
            codedOutputStream.writeInt64(7, this.bucketCounts_.getLong(i));
        }
    }

    public static final class BucketOptions
    extends GeneratedMessageLite<BucketOptions, Builder>
    implements BucketOptionsOrBuilder {
        private static final BucketOptions DEFAULT_INSTANCE = new BucketOptions();
        public static final int EXPLICIT_BUCKETS_FIELD_NUMBER = 3;
        public static final int EXPONENTIAL_BUCKETS_FIELD_NUMBER = 2;
        public static final int LINEAR_BUCKETS_FIELD_NUMBER = 1;
        private static volatile Parser<BucketOptions> PARSER;
        private int optionsCase_ = 0;
        private Object options_;

        static {
            DEFAULT_INSTANCE.makeImmutable();
        }

        private BucketOptions() {
        }

        private void clearExplicitBuckets() {
            if (this.optionsCase_ == 3) {
                this.optionsCase_ = 0;
                this.options_ = null;
            }
        }

        private void clearExponentialBuckets() {
            if (this.optionsCase_ == 2) {
                this.optionsCase_ = 0;
                this.options_ = null;
            }
        }

        private void clearLinearBuckets() {
            if (this.optionsCase_ == 1) {
                this.optionsCase_ = 0;
                this.options_ = null;
            }
        }

        private void clearOptions() {
            this.optionsCase_ = 0;
            this.options_ = null;
        }

        public static BucketOptions getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeExplicitBuckets(Explicit explicit) {
            this.options_ = this.optionsCase_ == 3 && this.options_ != Explicit.getDefaultInstance() ? ((Explicit.Builder)Explicit.newBuilder((Explicit)this.options_).mergeFrom((GeneratedMessageLite)explicit)).buildPartial() : explicit;
            this.optionsCase_ = 3;
        }

        private void mergeExponentialBuckets(Exponential exponential) {
            this.options_ = this.optionsCase_ == 2 && this.options_ != Exponential.getDefaultInstance() ? ((Exponential.Builder)Exponential.newBuilder((Exponential)this.options_).mergeFrom((GeneratedMessageLite)exponential)).buildPartial() : exponential;
            this.optionsCase_ = 2;
        }

        private void mergeLinearBuckets(Linear linear) {
            this.options_ = this.optionsCase_ == 1 && this.options_ != Linear.getDefaultInstance() ? ((Linear.Builder)Linear.newBuilder((Linear)this.options_).mergeFrom((GeneratedMessageLite)linear)).buildPartial() : linear;
            this.optionsCase_ = 1;
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(BucketOptions bucketOptions) {
            return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)bucketOptions);
        }

        public static BucketOptions parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (BucketOptions)BucketOptions.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static BucketOptions parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (BucketOptions)BucketOptions.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static BucketOptions parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (BucketOptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
        }

        public static BucketOptions parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (BucketOptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static BucketOptions parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (BucketOptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
        }

        public static BucketOptions parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (BucketOptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static BucketOptions parseFrom(InputStream inputStream) throws IOException {
            return (BucketOptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static BucketOptions parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (BucketOptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static BucketOptions parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
            return (BucketOptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
        }

        public static BucketOptions parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (BucketOptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Parser<BucketOptions> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setExplicitBuckets(Explicit.Builder builder) {
            this.options_ = builder.build();
            this.optionsCase_ = 3;
        }

        private void setExplicitBuckets(Explicit explicit) {
            if (explicit != null) {
                this.options_ = explicit;
                this.optionsCase_ = 3;
                return;
            }
            throw new NullPointerException();
        }

        private void setExponentialBuckets(Exponential.Builder builder) {
            this.options_ = builder.build();
            this.optionsCase_ = 2;
        }

        private void setExponentialBuckets(Exponential exponential) {
            if (exponential != null) {
                this.options_ = exponential;
                this.optionsCase_ = 2;
                return;
            }
            throw new NullPointerException();
        }

        private void setLinearBuckets(Linear.Builder builder) {
            this.options_ = builder.build();
            this.optionsCase_ = 1;
        }

        private void setLinearBuckets(Linear linear) {
            if (linear != null) {
                this.options_ = linear;
                this.optionsCase_ = 1;
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
            int n = 1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()];
            int n2 = 1;
            switch (n) {
                default: {
                    throw new UnsupportedOperationException();
                }
                case 8: {
                    if (PARSER != null) return PARSER;
                    Class<BucketOptions> class_ = BucketOptions.class;
                    // MONITORENTER : com.google.api.Distribution$BucketOptions.class
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
                        int n3 = codedInputStream.readTag();
                        if (n3 != 0) {
                            if (n3 != 10) {
                                if (n3 != 18) {
                                    if (n3 != 26) {
                                        if (codedInputStream.skipField(n3)) continue;
                                        bl = true;
                                        continue;
                                    }
                                    int n4 = this.optionsCase_;
                                    Explicit.Builder builder = null;
                                    if (n4 == 3) {
                                        builder = (Explicit.Builder)((Explicit)this.options_).toBuilder();
                                    }
                                    this.options_ = codedInputStream.readMessage(Explicit.parser(), extensionRegistryLite);
                                    if (builder != null) {
                                        builder.mergeFrom((GeneratedMessageLite)((Explicit)this.options_));
                                        this.options_ = builder.buildPartial();
                                    }
                                    this.optionsCase_ = 3;
                                    continue;
                                }
                                int n5 = this.optionsCase_;
                                Exponential.Builder builder = null;
                                if (n5 == 2) {
                                    builder = (Exponential.Builder)((Exponential)this.options_).toBuilder();
                                }
                                this.options_ = codedInputStream.readMessage(Exponential.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom((GeneratedMessageLite)((Exponential)this.options_));
                                    this.options_ = builder.buildPartial();
                                }
                                this.optionsCase_ = 2;
                                continue;
                            }
                            int n6 = this.optionsCase_;
                            Linear.Builder builder = null;
                            if (n6 == n2) {
                                builder = (Linear.Builder)((Linear)this.options_).toBuilder();
                            }
                            this.options_ = codedInputStream.readMessage(Linear.parser(), extensionRegistryLite);
                            if (builder != null) {
                                builder.mergeFrom((GeneratedMessageLite)((Linear)this.options_));
                                this.options_ = builder.buildPartial();
                            }
                            this.optionsCase_ = n2;
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
                    BucketOptions bucketOptions = (BucketOptions)object2;
                    int n7 = 1.$SwitchMap$com$google$api$Distribution$BucketOptions$OptionsCase[bucketOptions.getOptionsCase().ordinal()];
                    if (n7 != n2) {
                        if (n7 != 2) {
                            if (n7 != 3) {
                                if (n7 == 4) {
                                    if (this.optionsCase_ == 0) {
                                        n2 = 0;
                                    }
                                    visitor.visitOneofNotSet((boolean)n2);
                                }
                            } else {
                                if (this.optionsCase_ != 3) {
                                    n2 = 0;
                                }
                                this.options_ = visitor.visitOneofMessage((boolean)n2, this.options_, bucketOptions.options_);
                            }
                        } else {
                            if (this.optionsCase_ != 2) {
                                n2 = 0;
                            }
                            this.options_ = visitor.visitOneofMessage((boolean)n2, this.options_, bucketOptions.options_);
                        }
                    } else {
                        if (this.optionsCase_ != n2) {
                            n2 = 0;
                        }
                        this.options_ = visitor.visitOneofMessage((boolean)n2, this.options_, bucketOptions.options_);
                    }
                    if (visitor != GeneratedMessageLite.MergeFromVisitor.INSTANCE) return this;
                    int n8 = bucketOptions.optionsCase_;
                    if (n8 == 0) return this;
                    this.optionsCase_ = n8;
                    return this;
                }
                case 4: {
                    return new Builder();
                }
                case 3: {
                    return null;
                }
                case 2: {
                    return DEFAULT_INSTANCE;
                }
                case 1: 
            }
            return new BucketOptions();
        }

        @Override
        public Explicit getExplicitBuckets() {
            if (this.optionsCase_ == 3) {
                return (Explicit)this.options_;
            }
            return Explicit.getDefaultInstance();
        }

        @Override
        public Exponential getExponentialBuckets() {
            if (this.optionsCase_ == 2) {
                return (Exponential)this.options_;
            }
            return Exponential.getDefaultInstance();
        }

        @Override
        public Linear getLinearBuckets() {
            if (this.optionsCase_ == 1) {
                return (Linear)this.options_;
            }
            return Linear.getDefaultInstance();
        }

        @Override
        public OptionsCase getOptionsCase() {
            return OptionsCase.forNumber(this.optionsCase_);
        }

        public int getSerializedSize() {
            int n = this.memoizedSerializedSize;
            if (n != -1) {
                return n;
            }
            int n2 = this.optionsCase_;
            int n3 = 0;
            if (n2 == 1) {
                n3 = 0 + CodedOutputStream.computeMessageSize((int)1, (MessageLite)((Linear)this.options_));
            }
            if (this.optionsCase_ == 2) {
                n3 += CodedOutputStream.computeMessageSize((int)2, (MessageLite)((Exponential)this.options_));
            }
            if (this.optionsCase_ == 3) {
                n3 += CodedOutputStream.computeMessageSize((int)3, (MessageLite)((Explicit)this.options_));
            }
            this.memoizedSerializedSize = n3;
            return n3;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.optionsCase_ == 1) {
                codedOutputStream.writeMessage(1, (MessageLite)((Linear)this.options_));
            }
            if (this.optionsCase_ == 2) {
                codedOutputStream.writeMessage(2, (MessageLite)((Exponential)this.options_));
            }
            if (this.optionsCase_ == 3) {
                codedOutputStream.writeMessage(3, (MessageLite)((Explicit)this.options_));
            }
        }

        public static final class Builder
        extends GeneratedMessageLite.Builder<BucketOptions, Builder>
        implements BucketOptionsOrBuilder {
            private Builder() {
                super((GeneratedMessageLite)DEFAULT_INSTANCE);
            }

            public Builder clearExplicitBuckets() {
                this.copyOnWrite();
                ((BucketOptions)this.instance).clearExplicitBuckets();
                return this;
            }

            public Builder clearExponentialBuckets() {
                this.copyOnWrite();
                ((BucketOptions)this.instance).clearExponentialBuckets();
                return this;
            }

            public Builder clearLinearBuckets() {
                this.copyOnWrite();
                ((BucketOptions)this.instance).clearLinearBuckets();
                return this;
            }

            public Builder clearOptions() {
                this.copyOnWrite();
                ((BucketOptions)this.instance).clearOptions();
                return this;
            }

            @Override
            public Explicit getExplicitBuckets() {
                return ((BucketOptions)this.instance).getExplicitBuckets();
            }

            @Override
            public Exponential getExponentialBuckets() {
                return ((BucketOptions)this.instance).getExponentialBuckets();
            }

            @Override
            public Linear getLinearBuckets() {
                return ((BucketOptions)this.instance).getLinearBuckets();
            }

            @Override
            public OptionsCase getOptionsCase() {
                return ((BucketOptions)this.instance).getOptionsCase();
            }

            public Builder mergeExplicitBuckets(Explicit explicit) {
                this.copyOnWrite();
                ((BucketOptions)this.instance).mergeExplicitBuckets(explicit);
                return this;
            }

            public Builder mergeExponentialBuckets(Exponential exponential) {
                this.copyOnWrite();
                ((BucketOptions)this.instance).mergeExponentialBuckets(exponential);
                return this;
            }

            public Builder mergeLinearBuckets(Linear linear) {
                this.copyOnWrite();
                ((BucketOptions)this.instance).mergeLinearBuckets(linear);
                return this;
            }

            public Builder setExplicitBuckets(Explicit.Builder builder) {
                this.copyOnWrite();
                ((BucketOptions)this.instance).setExplicitBuckets(builder);
                return this;
            }

            public Builder setExplicitBuckets(Explicit explicit) {
                this.copyOnWrite();
                ((BucketOptions)this.instance).setExplicitBuckets(explicit);
                return this;
            }

            public Builder setExponentialBuckets(Exponential.Builder builder) {
                this.copyOnWrite();
                ((BucketOptions)this.instance).setExponentialBuckets(builder);
                return this;
            }

            public Builder setExponentialBuckets(Exponential exponential) {
                this.copyOnWrite();
                ((BucketOptions)this.instance).setExponentialBuckets(exponential);
                return this;
            }

            public Builder setLinearBuckets(Linear.Builder builder) {
                this.copyOnWrite();
                ((BucketOptions)this.instance).setLinearBuckets(builder);
                return this;
            }

            public Builder setLinearBuckets(Linear linear) {
                this.copyOnWrite();
                ((BucketOptions)this.instance).setLinearBuckets(linear);
                return this;
            }
        }

        public static final class Explicit
        extends GeneratedMessageLite<Explicit, Builder>
        implements ExplicitOrBuilder {
            public static final int BOUNDS_FIELD_NUMBER = 1;
            private static final Explicit DEFAULT_INSTANCE = new Explicit();
            private static volatile Parser<Explicit> PARSER;
            private Internal.DoubleList bounds_ = Explicit.emptyDoubleList();

            static {
                DEFAULT_INSTANCE.makeImmutable();
            }

            private Explicit() {
            }

            private void addAllBounds(Iterable<? extends Double> iterable) {
                this.ensureBoundsIsMutable();
                AbstractMessageLite.addAll(iterable, (Collection)this.bounds_);
            }

            private void addBounds(double d) {
                this.ensureBoundsIsMutable();
                this.bounds_.addDouble(d);
            }

            private void clearBounds() {
                this.bounds_ = Explicit.emptyDoubleList();
            }

            private void ensureBoundsIsMutable() {
                if (!this.bounds_.isModifiable()) {
                    this.bounds_ = GeneratedMessageLite.mutableCopy((Internal.DoubleList)this.bounds_);
                }
            }

            public static Explicit getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder() {
                return (Builder)DEFAULT_INSTANCE.toBuilder();
            }

            public static Builder newBuilder(Explicit explicit) {
                return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)explicit);
            }

            public static Explicit parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Explicit)Explicit.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
            }

            public static Explicit parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Explicit)Explicit.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
            }

            public static Explicit parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Explicit)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
            }

            public static Explicit parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Explicit)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
            }

            public static Explicit parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (Explicit)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
            }

            public static Explicit parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Explicit)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
            }

            public static Explicit parseFrom(InputStream inputStream) throws IOException {
                return (Explicit)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
            }

            public static Explicit parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Explicit)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
            }

            public static Explicit parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
                return (Explicit)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
            }

            public static Explicit parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Explicit)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
            }

            public static Parser<Explicit> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setBounds(int n, double d) {
                this.ensureBoundsIsMutable();
                this.bounds_.setDouble(n, d);
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
                        Class<Explicit> class_ = Explicit.class;
                        // MONITORENTER : com.google.api.Distribution$BucketOptions$Explicit.class
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
                                if (n != 9) {
                                    if (n != 10) {
                                        if (codedInputStream.skipField(n)) continue;
                                        bl = true;
                                        continue;
                                    }
                                    int n2 = codedInputStream.readRawVarint32();
                                    int n3 = codedInputStream.pushLimit(n2);
                                    if (!this.bounds_.isModifiable() && codedInputStream.getBytesUntilLimit() > 0) {
                                        int n4 = this.bounds_.size();
                                        this.bounds_ = this.bounds_.mutableCopyWithCapacity(n4 + n2 / 8);
                                    }
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        this.bounds_.addDouble(codedInputStream.readDouble());
                                    }
                                    codedInputStream.popLimit(n3);
                                    continue;
                                }
                                if (!this.bounds_.isModifiable()) {
                                    this.bounds_ = GeneratedMessageLite.mutableCopy((Internal.DoubleList)this.bounds_);
                                }
                                this.bounds_.addDouble(codedInputStream.readDouble());
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
                        Explicit explicit = (Explicit)object2;
                        this.bounds_ = visitor.visitDoubleList(this.bounds_, explicit.bounds_);
                        return this;
                    }
                    case 4: {
                        return new Builder();
                    }
                    case 3: {
                        this.bounds_.makeImmutable();
                        return null;
                    }
                    case 2: {
                        return DEFAULT_INSTANCE;
                    }
                    case 1: 
                }
                return new Explicit();
            }

            @Override
            public double getBounds(int n) {
                return this.bounds_.getDouble(n);
            }

            @Override
            public int getBoundsCount() {
                return this.bounds_.size();
            }

            @Override
            public List<Double> getBoundsList() {
                return this.bounds_;
            }

            public int getSerializedSize() {
                int n;
                int n2 = this.memoizedSerializedSize;
                if (n2 != -1) {
                    return n2;
                }
                this.memoizedSerializedSize = n = 0 + 8 * this.getBoundsList().size() + 1 * this.getBoundsList().size();
                return n;
            }

            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                this.getSerializedSize();
                for (int i = 0; i < this.bounds_.size(); ++i) {
                    codedOutputStream.writeDouble(1, this.bounds_.getDouble(i));
                }
            }

            public static final class Builder
            extends GeneratedMessageLite.Builder<Explicit, Builder>
            implements ExplicitOrBuilder {
                private Builder() {
                    super((GeneratedMessageLite)DEFAULT_INSTANCE);
                }

                public Builder addAllBounds(Iterable<? extends Double> iterable) {
                    this.copyOnWrite();
                    ((Explicit)this.instance).addAllBounds((Iterable<? extends Double>)iterable);
                    return this;
                }

                public Builder addBounds(double d) {
                    this.copyOnWrite();
                    ((Explicit)this.instance).addBounds(d);
                    return this;
                }

                public Builder clearBounds() {
                    this.copyOnWrite();
                    ((Explicit)this.instance).clearBounds();
                    return this;
                }

                @Override
                public double getBounds(int n) {
                    return ((Explicit)this.instance).getBounds(n);
                }

                @Override
                public int getBoundsCount() {
                    return ((Explicit)this.instance).getBoundsCount();
                }

                @Override
                public List<Double> getBoundsList() {
                    return Collections.unmodifiableList(((Explicit)this.instance).getBoundsList());
                }

                public Builder setBounds(int n, double d) {
                    this.copyOnWrite();
                    ((Explicit)this.instance).setBounds(n, d);
                    return this;
                }
            }

        }

        public static interface ExplicitOrBuilder
        extends MessageLiteOrBuilder {
            public double getBounds(int var1);

            public int getBoundsCount();

            public List<Double> getBoundsList();
        }

        public static final class Exponential
        extends GeneratedMessageLite<Exponential, Builder>
        implements ExponentialOrBuilder {
            private static final Exponential DEFAULT_INSTANCE = new Exponential();
            public static final int GROWTH_FACTOR_FIELD_NUMBER = 2;
            public static final int NUM_FINITE_BUCKETS_FIELD_NUMBER = 1;
            private static volatile Parser<Exponential> PARSER;
            public static final int SCALE_FIELD_NUMBER = 3;
            private double growthFactor_;
            private int numFiniteBuckets_;
            private double scale_;

            static {
                DEFAULT_INSTANCE.makeImmutable();
            }

            private Exponential() {
            }

            private void clearGrowthFactor() {
                this.growthFactor_ = 0.0;
            }

            private void clearNumFiniteBuckets() {
                this.numFiniteBuckets_ = 0;
            }

            private void clearScale() {
                this.scale_ = 0.0;
            }

            public static Exponential getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder() {
                return (Builder)DEFAULT_INSTANCE.toBuilder();
            }

            public static Builder newBuilder(Exponential exponential) {
                return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)exponential);
            }

            public static Exponential parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Exponential)Exponential.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
            }

            public static Exponential parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Exponential)Exponential.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
            }

            public static Exponential parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Exponential)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
            }

            public static Exponential parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Exponential)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
            }

            public static Exponential parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (Exponential)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
            }

            public static Exponential parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Exponential)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
            }

            public static Exponential parseFrom(InputStream inputStream) throws IOException {
                return (Exponential)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
            }

            public static Exponential parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Exponential)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
            }

            public static Exponential parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
                return (Exponential)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
            }

            public static Exponential parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Exponential)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
            }

            public static Parser<Exponential> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setGrowthFactor(double d) {
                this.growthFactor_ = d;
            }

            private void setNumFiniteBuckets(int n) {
                this.numFiniteBuckets_ = n;
            }

            private void setScale(double d) {
                this.scale_ = d;
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
                        Class<Exponential> class_ = Exponential.class;
                        // MONITORENTER : com.google.api.Distribution$BucketOptions$Exponential.class
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
                                if (n != 8) {
                                    if (n != 17) {
                                        if (n != 25) {
                                            if (codedInputStream.skipField(n)) continue;
                                            bl = true;
                                            continue;
                                        }
                                        this.scale_ = codedInputStream.readDouble();
                                        continue;
                                    }
                                    this.growthFactor_ = codedInputStream.readDouble();
                                    continue;
                                }
                                this.numFiniteBuckets_ = codedInputStream.readInt32();
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
                        Exponential exponential = (Exponential)object2;
                        boolean bl = this.numFiniteBuckets_ != 0;
                        int n = this.numFiniteBuckets_;
                        boolean bl2 = exponential.numFiniteBuckets_ != 0;
                        this.numFiniteBuckets_ = visitor.visitInt(bl, n, bl2, exponential.numFiniteBuckets_);
                        boolean bl3 = this.growthFactor_ != 0.0;
                        double d = this.growthFactor_;
                        boolean bl4 = exponential.growthFactor_ != 0.0;
                        this.growthFactor_ = visitor.visitDouble(bl3, d, bl4, exponential.growthFactor_);
                        boolean bl5 = this.scale_ != 0.0;
                        double d2 = this.scale_;
                        boolean bl6 = exponential.scale_ != 0.0;
                        this.scale_ = visitor.visitDouble(bl5, d2, bl6, exponential.scale_);
                        return this;
                    }
                    case 4: {
                        return new Builder();
                    }
                    case 3: {
                        return null;
                    }
                    case 2: {
                        return DEFAULT_INSTANCE;
                    }
                    case 1: 
                }
                return new Exponential();
            }

            @Override
            public double getGrowthFactor() {
                return this.growthFactor_;
            }

            @Override
            public int getNumFiniteBuckets() {
                return this.numFiniteBuckets_;
            }

            @Override
            public double getScale() {
                return this.scale_;
            }

            public int getSerializedSize() {
                double d;
                double d2;
                int n = this.memoizedSerializedSize;
                if (n != -1) {
                    return n;
                }
                int n2 = this.numFiniteBuckets_;
                int n3 = 0;
                if (n2 != 0) {
                    n3 = 0 + CodedOutputStream.computeInt32Size((int)1, (int)n2);
                }
                if ((d = this.growthFactor_) != 0.0) {
                    n3 += CodedOutputStream.computeDoubleSize((int)2, (double)d);
                }
                if ((d2 = this.scale_) != 0.0) {
                    n3 += CodedOutputStream.computeDoubleSize((int)3, (double)d2);
                }
                this.memoizedSerializedSize = n3;
                return n3;
            }

            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                double d;
                double d2;
                int n = this.numFiniteBuckets_;
                if (n != 0) {
                    codedOutputStream.writeInt32(1, n);
                }
                if ((d = this.growthFactor_) != 0.0) {
                    codedOutputStream.writeDouble(2, d);
                }
                if ((d2 = this.scale_) != 0.0) {
                    codedOutputStream.writeDouble(3, d2);
                }
            }

            public static final class Builder
            extends GeneratedMessageLite.Builder<Exponential, Builder>
            implements ExponentialOrBuilder {
                private Builder() {
                    super((GeneratedMessageLite)DEFAULT_INSTANCE);
                }

                public Builder clearGrowthFactor() {
                    this.copyOnWrite();
                    ((Exponential)this.instance).clearGrowthFactor();
                    return this;
                }

                public Builder clearNumFiniteBuckets() {
                    this.copyOnWrite();
                    ((Exponential)this.instance).clearNumFiniteBuckets();
                    return this;
                }

                public Builder clearScale() {
                    this.copyOnWrite();
                    ((Exponential)this.instance).clearScale();
                    return this;
                }

                @Override
                public double getGrowthFactor() {
                    return ((Exponential)this.instance).getGrowthFactor();
                }

                @Override
                public int getNumFiniteBuckets() {
                    return ((Exponential)this.instance).getNumFiniteBuckets();
                }

                @Override
                public double getScale() {
                    return ((Exponential)this.instance).getScale();
                }

                public Builder setGrowthFactor(double d) {
                    this.copyOnWrite();
                    ((Exponential)this.instance).setGrowthFactor(d);
                    return this;
                }

                public Builder setNumFiniteBuckets(int n) {
                    this.copyOnWrite();
                    ((Exponential)this.instance).setNumFiniteBuckets(n);
                    return this;
                }

                public Builder setScale(double d) {
                    this.copyOnWrite();
                    ((Exponential)this.instance).setScale(d);
                    return this;
                }
            }

        }

        public static interface ExponentialOrBuilder
        extends MessageLiteOrBuilder {
            public double getGrowthFactor();

            public int getNumFiniteBuckets();

            public double getScale();
        }

        public static final class Linear
        extends GeneratedMessageLite<Linear, Builder>
        implements LinearOrBuilder {
            private static final Linear DEFAULT_INSTANCE = new Linear();
            public static final int NUM_FINITE_BUCKETS_FIELD_NUMBER = 1;
            public static final int OFFSET_FIELD_NUMBER = 3;
            private static volatile Parser<Linear> PARSER;
            public static final int WIDTH_FIELD_NUMBER = 2;
            private int numFiniteBuckets_;
            private double offset_;
            private double width_;

            static {
                DEFAULT_INSTANCE.makeImmutable();
            }

            private Linear() {
            }

            private void clearNumFiniteBuckets() {
                this.numFiniteBuckets_ = 0;
            }

            private void clearOffset() {
                this.offset_ = 0.0;
            }

            private void clearWidth() {
                this.width_ = 0.0;
            }

            public static Linear getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder() {
                return (Builder)DEFAULT_INSTANCE.toBuilder();
            }

            public static Builder newBuilder(Linear linear) {
                return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)linear);
            }

            public static Linear parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Linear)Linear.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
            }

            public static Linear parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Linear)Linear.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
            }

            public static Linear parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return (Linear)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
            }

            public static Linear parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Linear)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
            }

            public static Linear parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (Linear)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
            }

            public static Linear parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Linear)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
            }

            public static Linear parseFrom(InputStream inputStream) throws IOException {
                return (Linear)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
            }

            public static Linear parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Linear)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
            }

            public static Linear parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
                return (Linear)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
            }

            public static Linear parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return (Linear)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
            }

            public static Parser<Linear> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setNumFiniteBuckets(int n) {
                this.numFiniteBuckets_ = n;
            }

            private void setOffset(double d) {
                this.offset_ = d;
            }

            private void setWidth(double d) {
                this.width_ = d;
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
                        Class<Linear> class_ = Linear.class;
                        // MONITORENTER : com.google.api.Distribution$BucketOptions$Linear.class
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
                                if (n != 8) {
                                    if (n != 17) {
                                        if (n != 25) {
                                            if (codedInputStream.skipField(n)) continue;
                                            bl = true;
                                            continue;
                                        }
                                        this.offset_ = codedInputStream.readDouble();
                                        continue;
                                    }
                                    this.width_ = codedInputStream.readDouble();
                                    continue;
                                }
                                this.numFiniteBuckets_ = codedInputStream.readInt32();
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
                        Linear linear = (Linear)object2;
                        boolean bl = this.numFiniteBuckets_ != 0;
                        int n = this.numFiniteBuckets_;
                        boolean bl2 = linear.numFiniteBuckets_ != 0;
                        this.numFiniteBuckets_ = visitor.visitInt(bl, n, bl2, linear.numFiniteBuckets_);
                        boolean bl3 = this.width_ != 0.0;
                        double d = this.width_;
                        boolean bl4 = linear.width_ != 0.0;
                        this.width_ = visitor.visitDouble(bl3, d, bl4, linear.width_);
                        boolean bl5 = this.offset_ != 0.0;
                        double d2 = this.offset_;
                        boolean bl6 = linear.offset_ != 0.0;
                        this.offset_ = visitor.visitDouble(bl5, d2, bl6, linear.offset_);
                        return this;
                    }
                    case 4: {
                        return new Builder();
                    }
                    case 3: {
                        return null;
                    }
                    case 2: {
                        return DEFAULT_INSTANCE;
                    }
                    case 1: 
                }
                return new Linear();
            }

            @Override
            public int getNumFiniteBuckets() {
                return this.numFiniteBuckets_;
            }

            @Override
            public double getOffset() {
                return this.offset_;
            }

            public int getSerializedSize() {
                double d;
                double d2;
                int n = this.memoizedSerializedSize;
                if (n != -1) {
                    return n;
                }
                int n2 = this.numFiniteBuckets_;
                int n3 = 0;
                if (n2 != 0) {
                    n3 = 0 + CodedOutputStream.computeInt32Size((int)1, (int)n2);
                }
                if ((d = this.width_) != 0.0) {
                    n3 += CodedOutputStream.computeDoubleSize((int)2, (double)d);
                }
                if ((d2 = this.offset_) != 0.0) {
                    n3 += CodedOutputStream.computeDoubleSize((int)3, (double)d2);
                }
                this.memoizedSerializedSize = n3;
                return n3;
            }

            @Override
            public double getWidth() {
                return this.width_;
            }

            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                double d;
                double d2;
                int n = this.numFiniteBuckets_;
                if (n != 0) {
                    codedOutputStream.writeInt32(1, n);
                }
                if ((d = this.width_) != 0.0) {
                    codedOutputStream.writeDouble(2, d);
                }
                if ((d2 = this.offset_) != 0.0) {
                    codedOutputStream.writeDouble(3, d2);
                }
            }

            public static final class Builder
            extends GeneratedMessageLite.Builder<Linear, Builder>
            implements LinearOrBuilder {
                private Builder() {
                    super((GeneratedMessageLite)DEFAULT_INSTANCE);
                }

                public Builder clearNumFiniteBuckets() {
                    this.copyOnWrite();
                    ((Linear)this.instance).clearNumFiniteBuckets();
                    return this;
                }

                public Builder clearOffset() {
                    this.copyOnWrite();
                    ((Linear)this.instance).clearOffset();
                    return this;
                }

                public Builder clearWidth() {
                    this.copyOnWrite();
                    ((Linear)this.instance).clearWidth();
                    return this;
                }

                @Override
                public int getNumFiniteBuckets() {
                    return ((Linear)this.instance).getNumFiniteBuckets();
                }

                @Override
                public double getOffset() {
                    return ((Linear)this.instance).getOffset();
                }

                @Override
                public double getWidth() {
                    return ((Linear)this.instance).getWidth();
                }

                public Builder setNumFiniteBuckets(int n) {
                    this.copyOnWrite();
                    ((Linear)this.instance).setNumFiniteBuckets(n);
                    return this;
                }

                public Builder setOffset(double d) {
                    this.copyOnWrite();
                    ((Linear)this.instance).setOffset(d);
                    return this;
                }

                public Builder setWidth(double d) {
                    this.copyOnWrite();
                    ((Linear)this.instance).setWidth(d);
                    return this;
                }
            }

        }

        public static interface LinearOrBuilder
        extends MessageLiteOrBuilder {
            public int getNumFiniteBuckets();

            public double getOffset();

            public double getWidth();
        }

        public static final class OptionsCase
        extends Enum<OptionsCase>
        implements Internal.EnumLite {
            private static final /* synthetic */ OptionsCase[] $VALUES;
            public static final /* enum */ OptionsCase EXPLICIT_BUCKETS;
            public static final /* enum */ OptionsCase EXPONENTIAL_BUCKETS;
            public static final /* enum */ OptionsCase LINEAR_BUCKETS;
            public static final /* enum */ OptionsCase OPTIONS_NOT_SET;
            private final int value;

            static {
                LINEAR_BUCKETS = new OptionsCase(1);
                EXPONENTIAL_BUCKETS = new OptionsCase(2);
                EXPLICIT_BUCKETS = new OptionsCase(3);
                OPTIONS_NOT_SET = new OptionsCase(0);
                OptionsCase[] arroptionsCase = new OptionsCase[]{LINEAR_BUCKETS, EXPONENTIAL_BUCKETS, EXPLICIT_BUCKETS, OPTIONS_NOT_SET};
                $VALUES = arroptionsCase;
            }

            private OptionsCase(int n2) {
                this.value = n2;
            }

            public static OptionsCase forNumber(int n) {
                if (n != 0) {
                    if (n != 1) {
                        if (n != 2) {
                            if (n != 3) {
                                return null;
                            }
                            return EXPLICIT_BUCKETS;
                        }
                        return EXPONENTIAL_BUCKETS;
                    }
                    return LINEAR_BUCKETS;
                }
                return OPTIONS_NOT_SET;
            }

            @Deprecated
            public static OptionsCase valueOf(int n) {
                return OptionsCase.forNumber(n);
            }

            public static OptionsCase valueOf(String string2) {
                return (OptionsCase)Enum.valueOf(OptionsCase.class, (String)string2);
            }

            public static OptionsCase[] values() {
                return (OptionsCase[])$VALUES.clone();
            }

            public int getNumber() {
                return this.value;
            }
        }

    }

    public static interface BucketOptionsOrBuilder
    extends MessageLiteOrBuilder {
        public BucketOptions.Explicit getExplicitBuckets();

        public BucketOptions.Exponential getExponentialBuckets();

        public BucketOptions.Linear getLinearBuckets();

        public BucketOptions.OptionsCase getOptionsCase();
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<Distribution, Builder>
    implements DistributionOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder addAllBucketCounts(Iterable<? extends Long> iterable) {
            this.copyOnWrite();
            ((Distribution)this.instance).addAllBucketCounts((Iterable<? extends Long>)iterable);
            return this;
        }

        public Builder addBucketCounts(long l) {
            this.copyOnWrite();
            ((Distribution)this.instance).addBucketCounts(l);
            return this;
        }

        public Builder clearBucketCounts() {
            this.copyOnWrite();
            ((Distribution)this.instance).clearBucketCounts();
            return this;
        }

        public Builder clearBucketOptions() {
            this.copyOnWrite();
            ((Distribution)this.instance).clearBucketOptions();
            return this;
        }

        public Builder clearCount() {
            this.copyOnWrite();
            ((Distribution)this.instance).clearCount();
            return this;
        }

        public Builder clearMean() {
            this.copyOnWrite();
            ((Distribution)this.instance).clearMean();
            return this;
        }

        public Builder clearRange() {
            this.copyOnWrite();
            ((Distribution)this.instance).clearRange();
            return this;
        }

        public Builder clearSumOfSquaredDeviation() {
            this.copyOnWrite();
            ((Distribution)this.instance).clearSumOfSquaredDeviation();
            return this;
        }

        @Override
        public long getBucketCounts(int n) {
            return ((Distribution)this.instance).getBucketCounts(n);
        }

        @Override
        public int getBucketCountsCount() {
            return ((Distribution)this.instance).getBucketCountsCount();
        }

        @Override
        public List<Long> getBucketCountsList() {
            return Collections.unmodifiableList(((Distribution)this.instance).getBucketCountsList());
        }

        @Override
        public BucketOptions getBucketOptions() {
            return ((Distribution)this.instance).getBucketOptions();
        }

        @Override
        public long getCount() {
            return ((Distribution)this.instance).getCount();
        }

        @Override
        public double getMean() {
            return ((Distribution)this.instance).getMean();
        }

        @Override
        public Range getRange() {
            return ((Distribution)this.instance).getRange();
        }

        @Override
        public double getSumOfSquaredDeviation() {
            return ((Distribution)this.instance).getSumOfSquaredDeviation();
        }

        @Override
        public boolean hasBucketOptions() {
            return ((Distribution)this.instance).hasBucketOptions();
        }

        @Override
        public boolean hasRange() {
            return ((Distribution)this.instance).hasRange();
        }

        public Builder mergeBucketOptions(BucketOptions bucketOptions) {
            this.copyOnWrite();
            ((Distribution)this.instance).mergeBucketOptions(bucketOptions);
            return this;
        }

        public Builder mergeRange(Range range) {
            this.copyOnWrite();
            ((Distribution)this.instance).mergeRange(range);
            return this;
        }

        public Builder setBucketCounts(int n, long l) {
            this.copyOnWrite();
            ((Distribution)this.instance).setBucketCounts(n, l);
            return this;
        }

        public Builder setBucketOptions(BucketOptions.Builder builder) {
            this.copyOnWrite();
            ((Distribution)this.instance).setBucketOptions(builder);
            return this;
        }

        public Builder setBucketOptions(BucketOptions bucketOptions) {
            this.copyOnWrite();
            ((Distribution)this.instance).setBucketOptions(bucketOptions);
            return this;
        }

        public Builder setCount(long l) {
            this.copyOnWrite();
            ((Distribution)this.instance).setCount(l);
            return this;
        }

        public Builder setMean(double d) {
            this.copyOnWrite();
            ((Distribution)this.instance).setMean(d);
            return this;
        }

        public Builder setRange(Range.Builder builder) {
            this.copyOnWrite();
            ((Distribution)this.instance).setRange(builder);
            return this;
        }

        public Builder setRange(Range range) {
            this.copyOnWrite();
            ((Distribution)this.instance).setRange(range);
            return this;
        }

        public Builder setSumOfSquaredDeviation(double d) {
            this.copyOnWrite();
            ((Distribution)this.instance).setSumOfSquaredDeviation(d);
            return this;
        }
    }

    public static final class Range
    extends GeneratedMessageLite<Range, Builder>
    implements RangeOrBuilder {
        private static final Range DEFAULT_INSTANCE = new Range();
        public static final int MAX_FIELD_NUMBER = 2;
        public static final int MIN_FIELD_NUMBER = 1;
        private static volatile Parser<Range> PARSER;
        private double max_;
        private double min_;

        static {
            DEFAULT_INSTANCE.makeImmutable();
        }

        private Range() {
        }

        private void clearMax() {
            this.max_ = 0.0;
        }

        private void clearMin() {
            this.min_ = 0.0;
        }

        public static Range getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(Range range) {
            return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)range);
        }

        public static Range parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Range)Range.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static Range parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Range)Range.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Range parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Range)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
        }

        public static Range parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Range)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Range parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Range)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
        }

        public static Range parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Range)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Range parseFrom(InputStream inputStream) throws IOException {
            return (Range)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static Range parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Range)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Range parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
            return (Range)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
        }

        public static Range parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Range)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Parser<Range> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setMax(double d) {
            this.max_ = d;
        }

        private void setMin(double d) {
            this.min_ = d;
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
                    Class<Range> class_ = Range.class;
                    // MONITORENTER : com.google.api.Distribution$Range.class
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
                            if (n != 9) {
                                if (n != 17) {
                                    if (codedInputStream.skipField(n)) continue;
                                    bl = true;
                                    continue;
                                }
                                this.max_ = codedInputStream.readDouble();
                                continue;
                            }
                            this.min_ = codedInputStream.readDouble();
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
                    Range range = (Range)object2;
                    boolean bl = this.min_ != 0.0;
                    double d = this.min_;
                    boolean bl2 = range.min_ != 0.0;
                    this.min_ = visitor.visitDouble(bl, d, bl2, range.min_);
                    boolean bl3 = this.max_ != 0.0;
                    double d2 = this.max_;
                    boolean bl4 = range.max_ != 0.0;
                    this.max_ = visitor.visitDouble(bl3, d2, bl4, range.max_);
                    return this;
                }
                case 4: {
                    return new Builder();
                }
                case 3: {
                    return null;
                }
                case 2: {
                    return DEFAULT_INSTANCE;
                }
                case 1: 
            }
            return new Range();
        }

        @Override
        public double getMax() {
            return this.max_;
        }

        @Override
        public double getMin() {
            return this.min_;
        }

        public int getSerializedSize() {
            double d;
            int n = this.memoizedSerializedSize;
            if (n != -1) {
                return n;
            }
            double d2 = this.min_;
            double d3 = d2 DCMPL 0.0;
            int n2 = 0;
            if (d3 != false) {
                n2 = 0 + CodedOutputStream.computeDoubleSize((int)1, (double)d2);
            }
            if ((d = this.max_) != 0.0) {
                n2 += CodedOutputStream.computeDoubleSize((int)2, (double)d);
            }
            this.memoizedSerializedSize = n2;
            return n2;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            double d;
            double d2 = this.min_;
            if (d2 != 0.0) {
                codedOutputStream.writeDouble(1, d2);
            }
            if ((d = this.max_) != 0.0) {
                codedOutputStream.writeDouble(2, d);
            }
        }

        public static final class Builder
        extends GeneratedMessageLite.Builder<Range, Builder>
        implements RangeOrBuilder {
            private Builder() {
                super((GeneratedMessageLite)DEFAULT_INSTANCE);
            }

            public Builder clearMax() {
                this.copyOnWrite();
                ((Range)this.instance).clearMax();
                return this;
            }

            public Builder clearMin() {
                this.copyOnWrite();
                ((Range)this.instance).clearMin();
                return this;
            }

            @Override
            public double getMax() {
                return ((Range)this.instance).getMax();
            }

            @Override
            public double getMin() {
                return ((Range)this.instance).getMin();
            }

            public Builder setMax(double d) {
                this.copyOnWrite();
                ((Range)this.instance).setMax(d);
                return this;
            }

            public Builder setMin(double d) {
                this.copyOnWrite();
                ((Range)this.instance).setMin(d);
                return this;
            }
        }

    }

    public static interface RangeOrBuilder
    extends MessageLiteOrBuilder {
        public double getMax();

        public double getMin();
    }

}

