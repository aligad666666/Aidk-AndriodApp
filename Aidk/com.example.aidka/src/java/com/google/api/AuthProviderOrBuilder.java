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

public interface AuthProviderOrBuilder
extends MessageLiteOrBuilder {
    public String getAudiences();

    public ByteString getAudiencesBytes();

    public String getAuthorizationUrl();

    public ByteString getAuthorizationUrlBytes();

    public String getId();

    public ByteString getIdBytes();

    public String getIssuer();

    public ByteString getIssuerBytes();

    public String getJwksUri();

    public ByteString getJwksUriBytes();
}

