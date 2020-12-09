/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.CodedOutputStream
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageLite
 *  com.google.protobuf.GeneratedMessageLite$Builder
 *  com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser
 *  com.google.protobuf.GeneratedMessageLite$MethodToInvoke
 *  com.google.protobuf.GeneratedMessageLite$Visitor
 *  com.google.protobuf.Internal
 *  com.google.protobuf.Internal$EnumLite
 *  com.google.protobuf.Internal$EnumLiteMap
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.Parser
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.Class
 *  java.lang.Deprecated
 *  java.lang.Enum
 *  java.lang.NoSuchFieldError
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.UnsupportedOperationException
 */
package com.google.api;

import com.google.api.LabelDescriptorOrBuilder;
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

public final class LabelDescriptor
extends GeneratedMessageLite<LabelDescriptor, Builder>
implements LabelDescriptorOrBuilder {
    private static final LabelDescriptor DEFAULT_INSTANCE = new LabelDescriptor();
    public static final int DESCRIPTION_FIELD_NUMBER = 3;
    public static final int KEY_FIELD_NUMBER = 1;
    private static volatile Parser<LabelDescriptor> PARSER;
    public static final int VALUE_TYPE_FIELD_NUMBER = 2;
    private String description_ = "";
    private String key_ = "";
    private int valueType_;

    static {
        DEFAULT_INSTANCE.makeImmutable();
    }

    private LabelDescriptor() {
    }

    private void clearDescription() {
        this.description_ = LabelDescriptor.getDefaultInstance().getDescription();
    }

    private void clearKey() {
        this.key_ = LabelDescriptor.getDefaultInstance().getKey();
    }

    private void clearValueType() {
        this.valueType_ = 0;
    }

    public static LabelDescriptor getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(LabelDescriptor labelDescriptor) {
        return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)labelDescriptor);
    }

    public static LabelDescriptor parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (LabelDescriptor)LabelDescriptor.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static LabelDescriptor parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LabelDescriptor)LabelDescriptor.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static LabelDescriptor parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (LabelDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static LabelDescriptor parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LabelDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static LabelDescriptor parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (LabelDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static LabelDescriptor parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LabelDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static LabelDescriptor parseFrom(InputStream inputStream) throws IOException {
        return (LabelDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static LabelDescriptor parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LabelDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static LabelDescriptor parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (LabelDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static LabelDescriptor parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LabelDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<LabelDescriptor> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setDescription(String string2) {
        if (string2 != null) {
            this.description_ = string2;
            return;
        }
        throw new NullPointerException();
    }

    private void setDescriptionBytes(ByteString byteString) {
        if (byteString != null) {
            LabelDescriptor.checkByteStringIsUtf8((ByteString)byteString);
            this.description_ = byteString.toStringUtf8();
            return;
        }
        throw new NullPointerException();
    }

    private void setKey(String string2) {
        if (string2 != null) {
            this.key_ = string2;
            return;
        }
        throw new NullPointerException();
    }

    private void setKeyBytes(ByteString byteString) {
        if (byteString != null) {
            LabelDescriptor.checkByteStringIsUtf8((ByteString)byteString);
            this.key_ = byteString.toStringUtf8();
            return;
        }
        throw new NullPointerException();
    }

    private void setValueType(ValueType valueType) {
        if (valueType != null) {
            this.valueType_ = valueType.getNumber();
            return;
        }
        throw new NullPointerException();
    }

    private void setValueTypeValue(int n) {
        this.valueType_ = n;
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
                Class<LabelDescriptor> class_ = LabelDescriptor.class;
                // MONITORENTER : com.google.api.LabelDescriptor.class
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
                            if (n != 16) {
                                if (n != 26) {
                                    if (codedInputStream.skipField(n)) continue;
                                    bl = true;
                                    continue;
                                }
                                this.description_ = codedInputStream.readStringRequireUtf8();
                                continue;
                            }
                            this.valueType_ = codedInputStream.readEnum();
                            continue;
                        }
                        this.key_ = codedInputStream.readStringRequireUtf8();
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
                LabelDescriptor labelDescriptor = (LabelDescriptor)object2;
                this.key_ = visitor.visitString(true ^ this.key_.isEmpty(), this.key_, true ^ labelDescriptor.key_.isEmpty(), labelDescriptor.key_);
                boolean bl = this.valueType_ != 0;
                int n = this.valueType_;
                int n2 = labelDescriptor.valueType_;
                boolean bl2 = false;
                if (n2 != 0) {
                    bl2 = true;
                }
                this.valueType_ = visitor.visitInt(bl, n, bl2, labelDescriptor.valueType_);
                this.description_ = visitor.visitString(true ^ this.description_.isEmpty(), this.description_, true ^ labelDescriptor.description_.isEmpty(), labelDescriptor.description_);
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
        return new LabelDescriptor();
    }

    @Override
    public String getDescription() {
        return this.description_;
    }

    @Override
    public ByteString getDescriptionBytes() {
        return ByteString.copyFromUtf8((String)this.description_);
    }

    @Override
    public String getKey() {
        return this.key_;
    }

    @Override
    public ByteString getKeyBytes() {
        return ByteString.copyFromUtf8((String)this.key_);
    }

    public int getSerializedSize() {
        int n = this.memoizedSerializedSize;
        if (n != -1) {
            return n;
        }
        boolean bl = this.key_.isEmpty();
        int n2 = 0;
        if (!bl) {
            n2 = 0 + CodedOutputStream.computeStringSize((int)1, (String)this.getKey());
        }
        if (this.valueType_ != ValueType.STRING.getNumber()) {
            n2 += CodedOutputStream.computeEnumSize((int)2, (int)this.valueType_);
        }
        if (!this.description_.isEmpty()) {
            n2 += CodedOutputStream.computeStringSize((int)3, (String)this.getDescription());
        }
        this.memoizedSerializedSize = n2;
        return n2;
    }

    @Override
    public ValueType getValueType() {
        ValueType valueType = ValueType.forNumber(this.valueType_);
        if (valueType == null) {
            return ValueType.UNRECOGNIZED;
        }
        return valueType;
    }

    @Override
    public int getValueTypeValue() {
        return this.valueType_;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.key_.isEmpty()) {
            codedOutputStream.writeString(1, this.getKey());
        }
        if (this.valueType_ != ValueType.STRING.getNumber()) {
            codedOutputStream.writeEnum(2, this.valueType_);
        }
        if (!this.description_.isEmpty()) {
            codedOutputStream.writeString(3, this.getDescription());
        }
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<LabelDescriptor, Builder>
    implements LabelDescriptorOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder clearDescription() {
            this.copyOnWrite();
            ((LabelDescriptor)this.instance).clearDescription();
            return this;
        }

        public Builder clearKey() {
            this.copyOnWrite();
            ((LabelDescriptor)this.instance).clearKey();
            return this;
        }

        public Builder clearValueType() {
            this.copyOnWrite();
            ((LabelDescriptor)this.instance).clearValueType();
            return this;
        }

        @Override
        public String getDescription() {
            return ((LabelDescriptor)this.instance).getDescription();
        }

        @Override
        public ByteString getDescriptionBytes() {
            return ((LabelDescriptor)this.instance).getDescriptionBytes();
        }

        @Override
        public String getKey() {
            return ((LabelDescriptor)this.instance).getKey();
        }

        @Override
        public ByteString getKeyBytes() {
            return ((LabelDescriptor)this.instance).getKeyBytes();
        }

        @Override
        public ValueType getValueType() {
            return ((LabelDescriptor)this.instance).getValueType();
        }

        @Override
        public int getValueTypeValue() {
            return ((LabelDescriptor)this.instance).getValueTypeValue();
        }

        public Builder setDescription(String string2) {
            this.copyOnWrite();
            ((LabelDescriptor)this.instance).setDescription(string2);
            return this;
        }

        public Builder setDescriptionBytes(ByteString byteString) {
            this.copyOnWrite();
            ((LabelDescriptor)this.instance).setDescriptionBytes(byteString);
            return this;
        }

        public Builder setKey(String string2) {
            this.copyOnWrite();
            ((LabelDescriptor)this.instance).setKey(string2);
            return this;
        }

        public Builder setKeyBytes(ByteString byteString) {
            this.copyOnWrite();
            ((LabelDescriptor)this.instance).setKeyBytes(byteString);
            return this;
        }

        public Builder setValueType(ValueType valueType) {
            this.copyOnWrite();
            ((LabelDescriptor)this.instance).setValueType(valueType);
            return this;
        }

        public Builder setValueTypeValue(int n) {
            this.copyOnWrite();
            ((LabelDescriptor)this.instance).setValueTypeValue(n);
            return this;
        }
    }

    public static final class ValueType
    extends Enum<ValueType>
    implements Internal.EnumLite {
        private static final /* synthetic */ ValueType[] $VALUES;
        public static final /* enum */ ValueType BOOL;
        public static final int BOOL_VALUE = 1;
        public static final /* enum */ ValueType INT64;
        public static final int INT64_VALUE = 2;
        public static final /* enum */ ValueType STRING;
        public static final int STRING_VALUE;
        public static final /* enum */ ValueType UNRECOGNIZED;
        private static final Internal.EnumLiteMap<ValueType> internalValueMap;
        private final int value;

        static {
            STRING = new ValueType(0);
            BOOL = new ValueType(1);
            INT64 = new ValueType(2);
            UNRECOGNIZED = new ValueType(-1);
            ValueType[] arrvalueType = new ValueType[]{STRING, BOOL, INT64, UNRECOGNIZED};
            $VALUES = arrvalueType;
            internalValueMap = new Internal.EnumLiteMap<ValueType>(){

                public ValueType findValueByNumber(int n) {
                    return ValueType.forNumber(n);
                }
            };
        }

        private ValueType(int n2) {
            this.value = n2;
        }

        public static ValueType forNumber(int n) {
            if (n != 0) {
                if (n != 1) {
                    if (n != 2) {
                        return null;
                    }
                    return INT64;
                }
                return BOOL;
            }
            return STRING;
        }

        public static Internal.EnumLiteMap<ValueType> internalGetValueMap() {
            return internalValueMap;
        }

        @Deprecated
        public static ValueType valueOf(int n) {
            return ValueType.forNumber(n);
        }

        public static ValueType valueOf(String string2) {
            return (ValueType)Enum.valueOf(ValueType.class, (String)string2);
        }

        public static ValueType[] values() {
            return (ValueType[])$VALUES.clone();
        }

        public final int getNumber() {
            return this.value;
        }

    }

}

