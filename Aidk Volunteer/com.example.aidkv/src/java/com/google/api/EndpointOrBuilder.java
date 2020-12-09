/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.MessageLiteOrBuilder
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
package com.google.api;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

public interface EndpointOrBuilder
extends MessageLiteOrBuilder {
    public String getAliases(int var1);

    public ByteString getAliasesBytes(int var1);

    public int getAliasesCount();

    public List<String> getAliasesList();

    public boolean getAllowCors();

    public String getApis(int var1);

    public ByteString getApisBytes(int var1);

    public int getApisCount();

    public List<String> getApisList();

    public String getFeatures(int var1);

    public ByteString getFeaturesBytes(int var1);

    public int getFeaturesCount();

    public List<String> getFeaturesList();

    public String getName();

    public ByteString getNameBytes();

    public String getTarget();

    public ByteString getTargetBytes();
}

