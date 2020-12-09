/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.MessageLiteOrBuilder
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.firestore.v1;

import com.google.firestore.v1.Document;
import com.google.firestore.v1.DocumentMask;
import com.google.firestore.v1.DocumentTransform;
import com.google.firestore.v1.Precondition;
import com.google.firestore.v1.Write;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

public interface WriteOrBuilder
extends MessageLiteOrBuilder {
    public Precondition getCurrentDocument();

    public String getDelete();

    public ByteString getDeleteBytes();

    public Write.OperationCase getOperationCase();

    public DocumentTransform getTransform();

    public Document getUpdate();

    public DocumentMask getUpdateMask();

    public boolean hasCurrentDocument();

    public boolean hasUpdateMask();
}

