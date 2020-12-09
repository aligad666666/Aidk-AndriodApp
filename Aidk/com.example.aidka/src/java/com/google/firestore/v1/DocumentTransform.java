/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.firestore.v1.DocumentTransform$1
 *  com.google.firestore.v1.DocumentTransform$FieldTransform$ServerValue
 *  com.google.firestore.v1.DocumentTransform$FieldTransform$TransformTypeCase
 *  com.google.firestore.v1.DocumentTransform$FieldTransformOrBuilder
 *  com.google.firestore.v1.DocumentTransformOrBuilder
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
 *  com.google.protobuf.Parser
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.Class
 *  java.lang.Integer
 *  java.lang.Iterable
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.UnsupportedOperationException
 *  java.util.Collections
 *  java.util.List
 */
package com.google.firestore.v1;

import com.google.firestore.v1.ArrayValue;
import com.google.firestore.v1.DocumentTransform;
import com.google.firestore.v1.DocumentTransformOrBuilder;
import com.google.firestore.v1.Value;
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

public final class DocumentTransform
extends GeneratedMessageLite<DocumentTransform, Builder>
implements DocumentTransformOrBuilder {
    private static final DocumentTransform DEFAULT_INSTANCE = new DocumentTransform();
    public static final int DOCUMENT_FIELD_NUMBER = 1;
    public static final int FIELD_TRANSFORMS_FIELD_NUMBER = 2;
    private static volatile Parser<DocumentTransform> PARSER;
    private int bitField0_;
    private String document_ = "";
    private Internal.ProtobufList<FieldTransform> fieldTransforms_ = DocumentTransform.emptyProtobufList();

    static {
        DEFAULT_INSTANCE.makeImmutable();
    }

    private DocumentTransform() {
    }

    private void addAllFieldTransforms(Iterable<? extends FieldTransform> iterable) {
        this.ensureFieldTransformsIsMutable();
        AbstractMessageLite.addAll(iterable, this.fieldTransforms_);
    }

    private void addFieldTransforms(int n, FieldTransform.Builder builder) {
        this.ensureFieldTransformsIsMutable();
        this.fieldTransforms_.add(n, (Object)((FieldTransform)builder.build()));
    }

    private void addFieldTransforms(int n, FieldTransform fieldTransform) {
        if (fieldTransform != null) {
            this.ensureFieldTransformsIsMutable();
            this.fieldTransforms_.add(n, (Object)fieldTransform);
            return;
        }
        throw new NullPointerException();
    }

    private void addFieldTransforms(FieldTransform.Builder builder) {
        this.ensureFieldTransformsIsMutable();
        this.fieldTransforms_.add((Object)((FieldTransform)builder.build()));
    }

    private void addFieldTransforms(FieldTransform fieldTransform) {
        if (fieldTransform != null) {
            this.ensureFieldTransformsIsMutable();
            this.fieldTransforms_.add((Object)fieldTransform);
            return;
        }
        throw new NullPointerException();
    }

    private void clearDocument() {
        this.document_ = DocumentTransform.getDefaultInstance().getDocument();
    }

    private void clearFieldTransforms() {
        this.fieldTransforms_ = DocumentTransform.emptyProtobufList();
    }

    private void ensureFieldTransformsIsMutable() {
        if (!this.fieldTransforms_.isModifiable()) {
            this.fieldTransforms_ = GeneratedMessageLite.mutableCopy(this.fieldTransforms_);
        }
    }

    public static DocumentTransform getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(DocumentTransform documentTransform) {
        return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)documentTransform);
    }

    public static DocumentTransform parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DocumentTransform)DocumentTransform.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static DocumentTransform parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DocumentTransform)DocumentTransform.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static DocumentTransform parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DocumentTransform)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static DocumentTransform parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DocumentTransform)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static DocumentTransform parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DocumentTransform)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static DocumentTransform parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DocumentTransform)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static DocumentTransform parseFrom(InputStream inputStream) throws IOException {
        return (DocumentTransform)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static DocumentTransform parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DocumentTransform)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static DocumentTransform parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (DocumentTransform)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static DocumentTransform parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DocumentTransform)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<DocumentTransform> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeFieldTransforms(int n) {
        this.ensureFieldTransformsIsMutable();
        this.fieldTransforms_.remove(n);
    }

    private void setDocument(String string) {
        if (string != null) {
            this.document_ = string;
            return;
        }
        throw new NullPointerException();
    }

    private void setDocumentBytes(ByteString byteString) {
        if (byteString != null) {
            DocumentTransform.checkByteStringIsUtf8((ByteString)byteString);
            this.document_ = byteString.toStringUtf8();
            return;
        }
        throw new NullPointerException();
    }

    private void setFieldTransforms(int n, FieldTransform.Builder builder) {
        this.ensureFieldTransformsIsMutable();
        this.fieldTransforms_.set(n, (Object)((FieldTransform)builder.build()));
    }

    private void setFieldTransforms(int n, FieldTransform fieldTransform) {
        if (fieldTransform != null) {
            this.ensureFieldTransformsIsMutable();
            this.fieldTransforms_.set(n, (Object)fieldTransform);
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
                Class<DocumentTransform> class_ = DocumentTransform.class;
                // MONITORENTER : com.google.firestore.v1.DocumentTransform.class
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
                            if (!this.fieldTransforms_.isModifiable()) {
                                this.fieldTransforms_ = GeneratedMessageLite.mutableCopy(this.fieldTransforms_);
                            }
                            this.fieldTransforms_.add((Object)((FieldTransform)codedInputStream.readMessage(FieldTransform.parser(), extensionRegistryLite)));
                            continue;
                        }
                        this.document_ = codedInputStream.readStringRequireUtf8();
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
                DocumentTransform documentTransform = (DocumentTransform)((Object)object2);
                this.document_ = visitor.visitString(true ^ this.document_.isEmpty(), this.document_, true ^ documentTransform.document_.isEmpty(), documentTransform.document_);
                this.fieldTransforms_ = visitor.visitList(this.fieldTransforms_, documentTransform.fieldTransforms_);
                if (visitor != GeneratedMessageLite.MergeFromVisitor.INSTANCE) return this;
                this.bitField0_ |= documentTransform.bitField0_;
                return this;
            }
            case 4: {
                return new Builder();
            }
            case 3: {
                this.fieldTransforms_.makeImmutable();
                return null;
            }
            case 2: {
                return DEFAULT_INSTANCE;
            }
            case 1: 
        }
        return new DocumentTransform();
    }

    public String getDocument() {
        return this.document_;
    }

    public ByteString getDocumentBytes() {
        return ByteString.copyFromUtf8((String)this.document_);
    }

    public FieldTransform getFieldTransforms(int n) {
        return (FieldTransform)((Object)this.fieldTransforms_.get(n));
    }

    public int getFieldTransformsCount() {
        return this.fieldTransforms_.size();
    }

    public List<FieldTransform> getFieldTransformsList() {
        return this.fieldTransforms_;
    }

    public FieldTransformOrBuilder getFieldTransformsOrBuilder(int n) {
        return this.fieldTransforms_.get(n);
    }

    public List<? extends FieldTransformOrBuilder> getFieldTransformsOrBuilderList() {
        return this.fieldTransforms_;
    }

    public int getSerializedSize() {
        int n = this.memoizedSerializedSize;
        if (n != -1) {
            return n;
        }
        boolean bl = this.document_.isEmpty();
        int n2 = 0;
        if (!bl) {
            n2 = 0 + CodedOutputStream.computeStringSize((int)1, (String)this.getDocument());
        }
        for (int i = 0; i < this.fieldTransforms_.size(); ++i) {
            n2 += CodedOutputStream.computeMessageSize((int)2, (MessageLite)((MessageLite)this.fieldTransforms_.get(i)));
        }
        this.memoizedSerializedSize = n2;
        return n2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.document_.isEmpty()) {
            codedOutputStream.writeString(1, this.getDocument());
        }
        for (int i = 0; i < this.fieldTransforms_.size(); ++i) {
            codedOutputStream.writeMessage(2, (MessageLite)this.fieldTransforms_.get(i));
        }
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<DocumentTransform, Builder>
    implements DocumentTransformOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder addAllFieldTransforms(Iterable<? extends FieldTransform> iterable) {
            this.copyOnWrite();
            ((DocumentTransform)this.instance).addAllFieldTransforms((Iterable<? extends FieldTransform>)iterable);
            return this;
        }

        public Builder addFieldTransforms(int n, FieldTransform.Builder builder) {
            this.copyOnWrite();
            ((DocumentTransform)this.instance).addFieldTransforms(n, builder);
            return this;
        }

        public Builder addFieldTransforms(int n, FieldTransform fieldTransform) {
            this.copyOnWrite();
            ((DocumentTransform)this.instance).addFieldTransforms(n, fieldTransform);
            return this;
        }

        public Builder addFieldTransforms(FieldTransform.Builder builder) {
            this.copyOnWrite();
            ((DocumentTransform)this.instance).addFieldTransforms(builder);
            return this;
        }

        public Builder addFieldTransforms(FieldTransform fieldTransform) {
            this.copyOnWrite();
            ((DocumentTransform)this.instance).addFieldTransforms(fieldTransform);
            return this;
        }

        public Builder clearDocument() {
            this.copyOnWrite();
            ((DocumentTransform)this.instance).clearDocument();
            return this;
        }

        public Builder clearFieldTransforms() {
            this.copyOnWrite();
            ((DocumentTransform)this.instance).clearFieldTransforms();
            return this;
        }

        public String getDocument() {
            return ((DocumentTransform)this.instance).getDocument();
        }

        public ByteString getDocumentBytes() {
            return ((DocumentTransform)this.instance).getDocumentBytes();
        }

        public FieldTransform getFieldTransforms(int n) {
            return ((DocumentTransform)this.instance).getFieldTransforms(n);
        }

        public int getFieldTransformsCount() {
            return ((DocumentTransform)this.instance).getFieldTransformsCount();
        }

        public List<FieldTransform> getFieldTransformsList() {
            return Collections.unmodifiableList(((DocumentTransform)this.instance).getFieldTransformsList());
        }

        public Builder removeFieldTransforms(int n) {
            this.copyOnWrite();
            ((DocumentTransform)this.instance).removeFieldTransforms(n);
            return this;
        }

        public Builder setDocument(String string) {
            this.copyOnWrite();
            ((DocumentTransform)this.instance).setDocument(string);
            return this;
        }

        public Builder setDocumentBytes(ByteString byteString) {
            this.copyOnWrite();
            ((DocumentTransform)this.instance).setDocumentBytes(byteString);
            return this;
        }

        public Builder setFieldTransforms(int n, FieldTransform.Builder builder) {
            this.copyOnWrite();
            ((DocumentTransform)this.instance).setFieldTransforms(n, builder);
            return this;
        }

        public Builder setFieldTransforms(int n, FieldTransform fieldTransform) {
            this.copyOnWrite();
            ((DocumentTransform)this.instance).setFieldTransforms(n, fieldTransform);
            return this;
        }
    }

    /*
     * Exception performing whole class analysis ignored.
     */
    public static final class FieldTransform
    extends GeneratedMessageLite<FieldTransform, Builder>
    implements FieldTransformOrBuilder {
        public static final int APPEND_MISSING_ELEMENTS_FIELD_NUMBER = 6;
        private static final FieldTransform DEFAULT_INSTANCE = new FieldTransform();
        public static final int FIELD_PATH_FIELD_NUMBER = 1;
        public static final int INCREMENT_FIELD_NUMBER = 3;
        public static final int MAXIMUM_FIELD_NUMBER = 4;
        public static final int MINIMUM_FIELD_NUMBER = 5;
        private static volatile Parser<FieldTransform> PARSER;
        public static final int REMOVE_ALL_FROM_ARRAY_FIELD_NUMBER = 7;
        public static final int SET_TO_SERVER_VALUE_FIELD_NUMBER = 2;
        private String fieldPath_ = "";
        private int transformTypeCase_ = 0;
        private Object transformType_;

        static {
            DEFAULT_INSTANCE.makeImmutable();
        }

        private FieldTransform() {
        }

        private void clearAppendMissingElements() {
            if (this.transformTypeCase_ == 6) {
                this.transformTypeCase_ = 0;
                this.transformType_ = null;
            }
        }

        private void clearFieldPath() {
            this.fieldPath_ = FieldTransform.getDefaultInstance().getFieldPath();
        }

        private void clearIncrement() {
            if (this.transformTypeCase_ == 3) {
                this.transformTypeCase_ = 0;
                this.transformType_ = null;
            }
        }

        private void clearMaximum() {
            if (this.transformTypeCase_ == 4) {
                this.transformTypeCase_ = 0;
                this.transformType_ = null;
            }
        }

        private void clearMinimum() {
            if (this.transformTypeCase_ == 5) {
                this.transformTypeCase_ = 0;
                this.transformType_ = null;
            }
        }

        private void clearRemoveAllFromArray() {
            if (this.transformTypeCase_ == 7) {
                this.transformTypeCase_ = 0;
                this.transformType_ = null;
            }
        }

        private void clearSetToServerValue() {
            if (this.transformTypeCase_ == 2) {
                this.transformTypeCase_ = 0;
                this.transformType_ = null;
            }
        }

        private void clearTransformType() {
            this.transformTypeCase_ = 0;
            this.transformType_ = null;
        }

        public static FieldTransform getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeAppendMissingElements(ArrayValue arrayValue) {
            this.transformType_ = this.transformTypeCase_ == 6 && this.transformType_ != ArrayValue.getDefaultInstance() ? ((ArrayValue.Builder)ArrayValue.newBuilder((ArrayValue)((Object)this.transformType_)).mergeFrom((GeneratedMessageLite)arrayValue)).buildPartial() : arrayValue;
            this.transformTypeCase_ = 6;
        }

        private void mergeIncrement(Value value) {
            this.transformType_ = this.transformTypeCase_ == 3 && this.transformType_ != Value.getDefaultInstance() ? ((Value.Builder)Value.newBuilder((Value)((Object)this.transformType_)).mergeFrom((GeneratedMessageLite)value)).buildPartial() : value;
            this.transformTypeCase_ = 3;
        }

        private void mergeMaximum(Value value) {
            this.transformType_ = this.transformTypeCase_ == 4 && this.transformType_ != Value.getDefaultInstance() ? ((Value.Builder)Value.newBuilder((Value)((Object)this.transformType_)).mergeFrom((GeneratedMessageLite)value)).buildPartial() : value;
            this.transformTypeCase_ = 4;
        }

        private void mergeMinimum(Value value) {
            this.transformType_ = this.transformTypeCase_ == 5 && this.transformType_ != Value.getDefaultInstance() ? ((Value.Builder)Value.newBuilder((Value)((Object)this.transformType_)).mergeFrom((GeneratedMessageLite)value)).buildPartial() : value;
            this.transformTypeCase_ = 5;
        }

        private void mergeRemoveAllFromArray(ArrayValue arrayValue) {
            this.transformType_ = this.transformTypeCase_ == 7 && this.transformType_ != ArrayValue.getDefaultInstance() ? ((ArrayValue.Builder)ArrayValue.newBuilder((ArrayValue)((Object)this.transformType_)).mergeFrom((GeneratedMessageLite)arrayValue)).buildPartial() : arrayValue;
            this.transformTypeCase_ = 7;
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(FieldTransform fieldTransform) {
            return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)fieldTransform);
        }

        public static FieldTransform parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (FieldTransform)FieldTransform.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static FieldTransform parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (FieldTransform)FieldTransform.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static FieldTransform parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (FieldTransform)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
        }

        public static FieldTransform parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (FieldTransform)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static FieldTransform parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (FieldTransform)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
        }

        public static FieldTransform parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (FieldTransform)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static FieldTransform parseFrom(InputStream inputStream) throws IOException {
            return (FieldTransform)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static FieldTransform parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (FieldTransform)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static FieldTransform parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
            return (FieldTransform)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
        }

        public static FieldTransform parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (FieldTransform)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Parser<FieldTransform> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setAppendMissingElements(ArrayValue.Builder builder) {
            this.transformType_ = builder.build();
            this.transformTypeCase_ = 6;
        }

        private void setAppendMissingElements(ArrayValue arrayValue) {
            if (arrayValue != null) {
                this.transformType_ = arrayValue;
                this.transformTypeCase_ = 6;
                return;
            }
            throw new NullPointerException();
        }

        private void setFieldPath(String string) {
            if (string != null) {
                this.fieldPath_ = string;
                return;
            }
            throw new NullPointerException();
        }

        private void setFieldPathBytes(ByteString byteString) {
            if (byteString != null) {
                FieldTransform.checkByteStringIsUtf8((ByteString)byteString);
                this.fieldPath_ = byteString.toStringUtf8();
                return;
            }
            throw new NullPointerException();
        }

        private void setIncrement(Value.Builder builder) {
            this.transformType_ = builder.build();
            this.transformTypeCase_ = 3;
        }

        private void setIncrement(Value value) {
            if (value != null) {
                this.transformType_ = value;
                this.transformTypeCase_ = 3;
                return;
            }
            throw new NullPointerException();
        }

        private void setMaximum(Value.Builder builder) {
            this.transformType_ = builder.build();
            this.transformTypeCase_ = 4;
        }

        private void setMaximum(Value value) {
            if (value != null) {
                this.transformType_ = value;
                this.transformTypeCase_ = 4;
                return;
            }
            throw new NullPointerException();
        }

        private void setMinimum(Value.Builder builder) {
            this.transformType_ = builder.build();
            this.transformTypeCase_ = 5;
        }

        private void setMinimum(Value value) {
            if (value != null) {
                this.transformType_ = value;
                this.transformTypeCase_ = 5;
                return;
            }
            throw new NullPointerException();
        }

        private void setRemoveAllFromArray(ArrayValue.Builder builder) {
            this.transformType_ = builder.build();
            this.transformTypeCase_ = 7;
        }

        private void setRemoveAllFromArray(ArrayValue arrayValue) {
            if (arrayValue != null) {
                this.transformType_ = arrayValue;
                this.transformTypeCase_ = 7;
                return;
            }
            throw new NullPointerException();
        }

        private void setSetToServerValue(ServerValue serverValue) {
            if (serverValue != null) {
                this.transformTypeCase_ = 2;
                this.transformType_ = serverValue.getNumber();
                return;
            }
            throw new NullPointerException();
        }

        private void setSetToServerValueValue(int n) {
            this.transformTypeCase_ = 2;
            this.transformType_ = n;
        }

        /*
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         * Converted monitor instructions to comments
         * Lifted jumps to return sites
         */
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke var1_1, Object var2_2, Object var3_3) {
            switch (1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[var1_1.ordinal()]) {
                default: {
                    throw new UnsupportedOperationException();
                }
                case 8: {
                    if (FieldTransform.PARSER != null) return FieldTransform.PARSER;
                    var33_4 = FieldTransform.class;
                    // MONITORENTER : com.google.firestore.v1.DocumentTransform$FieldTransform.class
                    if (FieldTransform.PARSER == null) {
                        FieldTransform.PARSER = new GeneratedMessageLite.DefaultInstanceBasedParser((GeneratedMessageLite)FieldTransform.DEFAULT_INSTANCE);
                    }
                    // MONITOREXIT : var33_4
                    return FieldTransform.PARSER;
                }
                case 6: {
                    var9_5 = (CodedInputStream)var2_2;
                    var10_6 = (ExtensionRegistryLite)var3_3;
                    var11_7 = false;
                    while (var11_7 == false) {
                        var15_8 = var9_5.readTag();
                        if (var15_8 != 0) {
                            if (var15_8 != 10) {
                                if (var15_8 != 16) {
                                    if (var15_8 != 26) {
                                        if (var15_8 != 34) {
                                            if (var15_8 != 42) {
                                                if (var15_8 != 50) {
                                                    if (var15_8 != 58) {
                                                        if (var9_5.skipField(var15_8)) continue;
                                                        var11_7 = true;
                                                        continue;
                                                    }
                                                    var29_18 = this.transformTypeCase_;
                                                    var30_19 = null;
                                                    if (var29_18 == 7) {
                                                        var30_19 = (ArrayValue.Builder)((ArrayValue)this.transformType_).toBuilder();
                                                    }
                                                    this.transformType_ = var9_5.readMessage(ArrayValue.parser(), var10_6);
                                                    if (var30_19 != null) {
                                                        var30_19.mergeFrom((GeneratedMessageLite)((ArrayValue)this.transformType_));
                                                        this.transformType_ = var30_19.buildPartial();
                                                    }
                                                    this.transformTypeCase_ = 7;
                                                    continue;
                                                }
                                                var26_16 = this.transformTypeCase_;
                                                var27_17 = null;
                                                if (var26_16 == 6) {
                                                    var27_17 = (ArrayValue.Builder)((ArrayValue)this.transformType_).toBuilder();
                                                }
                                                this.transformType_ = var9_5.readMessage(ArrayValue.parser(), var10_6);
                                                if (var27_17 != null) {
                                                    var27_17.mergeFrom((GeneratedMessageLite)((ArrayValue)this.transformType_));
                                                    this.transformType_ = var27_17.buildPartial();
                                                }
                                                this.transformTypeCase_ = 6;
                                                continue;
                                            }
                                            var23_14 = this.transformTypeCase_;
                                            var24_15 = null;
                                            if (var23_14 == 5) {
                                                var24_15 = (Value.Builder)((Value)this.transformType_).toBuilder();
                                            }
                                            this.transformType_ = var9_5.readMessage(Value.parser(), var10_6);
                                            if (var24_15 != null) {
                                                var24_15.mergeFrom((GeneratedMessageLite)((Value)this.transformType_));
                                                this.transformType_ = var24_15.buildPartial();
                                            }
                                            this.transformTypeCase_ = 5;
                                            continue;
                                        }
                                        var20_12 = this.transformTypeCase_;
                                        var21_13 = null;
                                        if (var20_12 == 4) {
                                            var21_13 = (Value.Builder)((Value)this.transformType_).toBuilder();
                                        }
                                        this.transformType_ = var9_5.readMessage(Value.parser(), var10_6);
                                        if (var21_13 != null) {
                                            var21_13.mergeFrom((GeneratedMessageLite)((Value)this.transformType_));
                                            this.transformType_ = var21_13.buildPartial();
                                        }
                                        this.transformTypeCase_ = 4;
                                        continue;
                                    }
                                    var17_10 = this.transformTypeCase_;
                                    var18_11 = null;
                                    if (var17_10 == 3) {
                                        var18_11 = (Value.Builder)((Value)this.transformType_).toBuilder();
                                    }
                                    this.transformType_ = var9_5.readMessage(Value.parser(), var10_6);
                                    if (var18_11 != null) {
                                        var18_11.mergeFrom((GeneratedMessageLite)((Value)this.transformType_));
                                        this.transformType_ = var18_11.buildPartial();
                                    }
                                    this.transformTypeCase_ = 3;
                                    continue;
                                }
                                var16_9 = var9_5.readEnum();
                                this.transformTypeCase_ = 2;
                                this.transformType_ = var16_9;
                                continue;
                            }
                            this.fieldPath_ = var9_5.readStringRequireUtf8();
                            continue;
                        }
                        var11_7 = true;
                        continue;
                        catch (IOException var14_21) {
                            throw new RuntimeException((Throwable)new InvalidProtocolBufferException(var14_21.getMessage()).setUnfinishedMessage((MessageLite)this));
                        }
                        catch (InvalidProtocolBufferException var12_22) {
                            throw new RuntimeException((Throwable)var12_22.setUnfinishedMessage((MessageLite)this));
                        }
                    }
                    return FieldTransform.DEFAULT_INSTANCE;
                }
                case 7: {
                    return FieldTransform.DEFAULT_INSTANCE;
                }
                case 5: {
                    var4_23 = (GeneratedMessageLite.Visitor)var2_2;
                    var5_24 = (FieldTransform)var3_3;
                    var6_25 = this.fieldPath_.isEmpty();
                    var7_26 = true;
                    this.fieldPath_ = var4_23.visitString(var6_25 ^ var7_26, this.fieldPath_, var7_26 ^ var5_24.fieldPath_.isEmpty(), var5_24.fieldPath_);
                    switch (1.$SwitchMap$com$google$firestore$v1$DocumentTransform$FieldTransform$TransformTypeCase[var5_24.getTransformTypeCase().ordinal()]) {
                        default: {
                            ** break;
                        }
                        case 7: {
                            if (this.transformTypeCase_ == 0) {
                                var7_26 = false;
                            }
                            var4_23.visitOneofNotSet(var7_26);
                            ** break;
                        }
                        case 6: {
                            if (this.transformTypeCase_ != 7) {
                                var7_26 = false;
                            }
                            this.transformType_ = var4_23.visitOneofMessage(var7_26, this.transformType_, var5_24.transformType_);
                            ** break;
                        }
                        case 5: {
                            if (this.transformTypeCase_ != 6) {
                                var7_26 = false;
                            }
                            this.transformType_ = var4_23.visitOneofMessage(var7_26, this.transformType_, var5_24.transformType_);
                            ** break;
                        }
                        case 4: {
                            if (this.transformTypeCase_ != 5) {
                                var7_26 = false;
                            }
                            this.transformType_ = var4_23.visitOneofMessage(var7_26, this.transformType_, var5_24.transformType_);
                            ** break;
                        }
                        case 3: {
                            if (this.transformTypeCase_ != 4) {
                                var7_26 = false;
                            }
                            this.transformType_ = var4_23.visitOneofMessage(var7_26, this.transformType_, var5_24.transformType_);
                            ** break;
                        }
                        case 2: {
                            if (this.transformTypeCase_ != 3) {
                                var7_26 = false;
                            }
                            this.transformType_ = var4_23.visitOneofMessage(var7_26, this.transformType_, var5_24.transformType_);
                            ** break;
                        }
                        case 1: 
                    }
                    if (this.transformTypeCase_ != 2) {
                        var7_26 = false;
                    }
                    this.transformType_ = var4_23.visitOneofInt(var7_26, this.transformType_, var5_24.transformType_);
lbl141: // 8 sources:
                    if (var4_23 != GeneratedMessageLite.MergeFromVisitor.INSTANCE) return this;
                    var8_27 = var5_24.transformTypeCase_;
                    if (var8_27 == 0) return this;
                    this.transformTypeCase_ = var8_27;
                    return this;
                }
                case 4: {
                    return new Builder();
                }
                case 3: {
                    return null;
                }
                case 2: {
                    return FieldTransform.DEFAULT_INSTANCE;
                }
                case 1: 
            }
            return new FieldTransform();
        }

        public ArrayValue getAppendMissingElements() {
            if (this.transformTypeCase_ == 6) {
                return (ArrayValue)((Object)this.transformType_);
            }
            return ArrayValue.getDefaultInstance();
        }

        public String getFieldPath() {
            return this.fieldPath_;
        }

        public ByteString getFieldPathBytes() {
            return ByteString.copyFromUtf8((String)this.fieldPath_);
        }

        public Value getIncrement() {
            if (this.transformTypeCase_ == 3) {
                return (Value)((Object)this.transformType_);
            }
            return Value.getDefaultInstance();
        }

        public Value getMaximum() {
            if (this.transformTypeCase_ == 4) {
                return (Value)((Object)this.transformType_);
            }
            return Value.getDefaultInstance();
        }

        public Value getMinimum() {
            if (this.transformTypeCase_ == 5) {
                return (Value)((Object)this.transformType_);
            }
            return Value.getDefaultInstance();
        }

        public ArrayValue getRemoveAllFromArray() {
            if (this.transformTypeCase_ == 7) {
                return (ArrayValue)((Object)this.transformType_);
            }
            return ArrayValue.getDefaultInstance();
        }

        public int getSerializedSize() {
            int n = this.memoizedSerializedSize;
            if (n != -1) {
                return n;
            }
            boolean bl = this.fieldPath_.isEmpty();
            int n2 = 0;
            if (!bl) {
                n2 = 0 + CodedOutputStream.computeStringSize((int)1, (String)this.getFieldPath());
            }
            if (this.transformTypeCase_ == 2) {
                n2 += CodedOutputStream.computeEnumSize((int)2, (int)((Integer)this.transformType_));
            }
            if (this.transformTypeCase_ == 3) {
                n2 += CodedOutputStream.computeMessageSize((int)3, (MessageLite)((Value)((Object)this.transformType_)));
            }
            if (this.transformTypeCase_ == 4) {
                n2 += CodedOutputStream.computeMessageSize((int)4, (MessageLite)((Value)((Object)this.transformType_)));
            }
            if (this.transformTypeCase_ == 5) {
                n2 += CodedOutputStream.computeMessageSize((int)5, (MessageLite)((Value)((Object)this.transformType_)));
            }
            if (this.transformTypeCase_ == 6) {
                n2 += CodedOutputStream.computeMessageSize((int)6, (MessageLite)((ArrayValue)((Object)this.transformType_)));
            }
            if (this.transformTypeCase_ == 7) {
                n2 += CodedOutputStream.computeMessageSize((int)7, (MessageLite)((ArrayValue)((Object)this.transformType_)));
            }
            this.memoizedSerializedSize = n2;
            return n2;
        }

        public ServerValue getSetToServerValue() {
            if (this.transformTypeCase_ == 2) {
                ServerValue serverValue = ServerValue.forNumber((int)((Integer)this.transformType_));
                if (serverValue == null) {
                    return ServerValue.UNRECOGNIZED;
                }
                return serverValue;
            }
            return ServerValue.SERVER_VALUE_UNSPECIFIED;
        }

        public int getSetToServerValueValue() {
            if (this.transformTypeCase_ == 2) {
                return (Integer)this.transformType_;
            }
            return 0;
        }

        public TransformTypeCase getTransformTypeCase() {
            return TransformTypeCase.forNumber((int)this.transformTypeCase_);
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.fieldPath_.isEmpty()) {
                codedOutputStream.writeString(1, this.getFieldPath());
            }
            if (this.transformTypeCase_ == 2) {
                codedOutputStream.writeEnum(2, ((Integer)this.transformType_).intValue());
            }
            if (this.transformTypeCase_ == 3) {
                codedOutputStream.writeMessage(3, (MessageLite)((Value)((Object)this.transformType_)));
            }
            if (this.transformTypeCase_ == 4) {
                codedOutputStream.writeMessage(4, (MessageLite)((Value)((Object)this.transformType_)));
            }
            if (this.transformTypeCase_ == 5) {
                codedOutputStream.writeMessage(5, (MessageLite)((Value)((Object)this.transformType_)));
            }
            if (this.transformTypeCase_ == 6) {
                codedOutputStream.writeMessage(6, (MessageLite)((ArrayValue)((Object)this.transformType_)));
            }
            if (this.transformTypeCase_ == 7) {
                codedOutputStream.writeMessage(7, (MessageLite)((ArrayValue)((Object)this.transformType_)));
            }
        }

        public static final class Builder
        extends GeneratedMessageLite.Builder<FieldTransform, Builder>
        implements FieldTransformOrBuilder {
            private Builder() {
                super((GeneratedMessageLite)DEFAULT_INSTANCE);
            }

            public Builder clearAppendMissingElements() {
                this.copyOnWrite();
                ((FieldTransform)this.instance).clearAppendMissingElements();
                return this;
            }

            public Builder clearFieldPath() {
                this.copyOnWrite();
                ((FieldTransform)this.instance).clearFieldPath();
                return this;
            }

            public Builder clearIncrement() {
                this.copyOnWrite();
                ((FieldTransform)this.instance).clearIncrement();
                return this;
            }

            public Builder clearMaximum() {
                this.copyOnWrite();
                ((FieldTransform)this.instance).clearMaximum();
                return this;
            }

            public Builder clearMinimum() {
                this.copyOnWrite();
                ((FieldTransform)this.instance).clearMinimum();
                return this;
            }

            public Builder clearRemoveAllFromArray() {
                this.copyOnWrite();
                ((FieldTransform)this.instance).clearRemoveAllFromArray();
                return this;
            }

            public Builder clearSetToServerValue() {
                this.copyOnWrite();
                ((FieldTransform)this.instance).clearSetToServerValue();
                return this;
            }

            public Builder clearTransformType() {
                this.copyOnWrite();
                ((FieldTransform)this.instance).clearTransformType();
                return this;
            }

            public ArrayValue getAppendMissingElements() {
                return ((FieldTransform)this.instance).getAppendMissingElements();
            }

            public String getFieldPath() {
                return ((FieldTransform)this.instance).getFieldPath();
            }

            public ByteString getFieldPathBytes() {
                return ((FieldTransform)this.instance).getFieldPathBytes();
            }

            public Value getIncrement() {
                return ((FieldTransform)this.instance).getIncrement();
            }

            public Value getMaximum() {
                return ((FieldTransform)this.instance).getMaximum();
            }

            public Value getMinimum() {
                return ((FieldTransform)this.instance).getMinimum();
            }

            public ArrayValue getRemoveAllFromArray() {
                return ((FieldTransform)this.instance).getRemoveAllFromArray();
            }

            public ServerValue getSetToServerValue() {
                return ((FieldTransform)this.instance).getSetToServerValue();
            }

            public int getSetToServerValueValue() {
                return ((FieldTransform)this.instance).getSetToServerValueValue();
            }

            public TransformTypeCase getTransformTypeCase() {
                return ((FieldTransform)this.instance).getTransformTypeCase();
            }

            public Builder mergeAppendMissingElements(ArrayValue arrayValue) {
                this.copyOnWrite();
                ((FieldTransform)this.instance).mergeAppendMissingElements(arrayValue);
                return this;
            }

            public Builder mergeIncrement(Value value) {
                this.copyOnWrite();
                ((FieldTransform)this.instance).mergeIncrement(value);
                return this;
            }

            public Builder mergeMaximum(Value value) {
                this.copyOnWrite();
                ((FieldTransform)this.instance).mergeMaximum(value);
                return this;
            }

            public Builder mergeMinimum(Value value) {
                this.copyOnWrite();
                ((FieldTransform)this.instance).mergeMinimum(value);
                return this;
            }

            public Builder mergeRemoveAllFromArray(ArrayValue arrayValue) {
                this.copyOnWrite();
                ((FieldTransform)this.instance).mergeRemoveAllFromArray(arrayValue);
                return this;
            }

            public Builder setAppendMissingElements(ArrayValue.Builder builder) {
                this.copyOnWrite();
                ((FieldTransform)this.instance).setAppendMissingElements(builder);
                return this;
            }

            public Builder setAppendMissingElements(ArrayValue arrayValue) {
                this.copyOnWrite();
                ((FieldTransform)this.instance).setAppendMissingElements(arrayValue);
                return this;
            }

            public Builder setFieldPath(String string) {
                this.copyOnWrite();
                ((FieldTransform)this.instance).setFieldPath(string);
                return this;
            }

            public Builder setFieldPathBytes(ByteString byteString) {
                this.copyOnWrite();
                ((FieldTransform)this.instance).setFieldPathBytes(byteString);
                return this;
            }

            public Builder setIncrement(Value.Builder builder) {
                this.copyOnWrite();
                ((FieldTransform)this.instance).setIncrement(builder);
                return this;
            }

            public Builder setIncrement(Value value) {
                this.copyOnWrite();
                ((FieldTransform)this.instance).setIncrement(value);
                return this;
            }

            public Builder setMaximum(Value.Builder builder) {
                this.copyOnWrite();
                ((FieldTransform)this.instance).setMaximum(builder);
                return this;
            }

            public Builder setMaximum(Value value) {
                this.copyOnWrite();
                ((FieldTransform)this.instance).setMaximum(value);
                return this;
            }

            public Builder setMinimum(Value.Builder builder) {
                this.copyOnWrite();
                ((FieldTransform)this.instance).setMinimum(builder);
                return this;
            }

            public Builder setMinimum(Value value) {
                this.copyOnWrite();
                ((FieldTransform)this.instance).setMinimum(value);
                return this;
            }

            public Builder setRemoveAllFromArray(ArrayValue.Builder builder) {
                this.copyOnWrite();
                ((FieldTransform)this.instance).setRemoveAllFromArray(builder);
                return this;
            }

            public Builder setRemoveAllFromArray(ArrayValue arrayValue) {
                this.copyOnWrite();
                ((FieldTransform)this.instance).setRemoveAllFromArray(arrayValue);
                return this;
            }

            public Builder setSetToServerValue(ServerValue serverValue) {
                this.copyOnWrite();
                ((FieldTransform)this.instance).setSetToServerValue(serverValue);
                return this;
            }

            public Builder setSetToServerValueValue(int n) {
                this.copyOnWrite();
                ((FieldTransform)this.instance).setSetToServerValueValue(n);
                return this;
            }
        }

    }

}

