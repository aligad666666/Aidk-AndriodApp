/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.MessageLiteOrBuilder
 *  java.lang.Long
 *  java.lang.Object
 *  java.util.List
 */
package com.google.api;

import com.google.api.Distribution;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

public interface DistributionOrBuilder
extends MessageLiteOrBuilder {
    public long getBucketCounts(int var1);

    public int getBucketCountsCount();

    public List<Long> getBucketCountsList();

    public Distribution.BucketOptions getBucketOptions();

    public long getCount();

    public double getMean();

    public Distribution.Range getRange();

    public double getSumOfSquaredDeviation();

    public boolean hasBucketOptions();

    public boolean hasRange();
}

