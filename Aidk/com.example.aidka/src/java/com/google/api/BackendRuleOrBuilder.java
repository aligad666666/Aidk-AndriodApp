/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.MessageLiteOrBuilder
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.api;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

public interface BackendRuleOrBuilder
extends MessageLiteOrBuilder {
    public String getAddress();

    public ByteString getAddressBytes();

    public double getDeadline();

    public String getSelector();

    public ByteString getSelectorBytes();
}

