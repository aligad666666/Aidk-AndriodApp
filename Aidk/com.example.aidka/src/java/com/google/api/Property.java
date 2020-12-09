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

import com.google.api.PropertyOrBuilder;
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

public final class Property
extends GeneratedMessageLite<Property, Builder>
implements PropertyOrBuilder {
    private static final Property DEFAULT_INSTANCE = new Property();
    public static final int DESCRIPTION_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<Property> PARSER;
    public static final int TYPE_FIELD_NUMBER = 2;
    private String description_ = "";
    private String name_ = "";
    private int type_;

    static {
        DEFAULT_INSTANCE.makeImmutable();
    }

    private Property() {
    }

    private void clearDescription() {
        this.description_ = Property.getDefaultInstance().getDescription();
    }

    private void clearName() {
        this.name_ = Property.getDefaultInstance().getName();
    }

    private void clearType() {
        this.type_ = 0;
    }

    public static Property getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(Property property) {
        return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)property);
    }

    public static Property parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Property)Property.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Property parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Property)Property.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Property parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Property)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static Property parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Property)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Property parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Property)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static Property parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Property)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Property parseFrom(InputStream inputStream) throws IOException {
        return (Property)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Property parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Property)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Property parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (Property)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static Property parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Property)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<Property> parser() {
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
            Property.checkByteStringIsUtf8((ByteString)byteString);
            this.description_ = byteString.toStringUtf8();
            return;
        }
        throw new NullPointerException();
    }

    private void setName(String string2) {
        if (string2 != null) {
            this.name_ = string2;
            return;
        }
        throw new NullPointerException();
    }

    private void setNameBytes(ByteString byteString) {
        if (byteString != null) {
            Property.checkByteStringIsUtf8((ByteString)byteString);
            this.name_ = byteString.toStringUtf8();
            return;
        }
        throw new NullPointerException();
    }

    private void setType(PropertyType propertyType) {
        if (propertyType != null) {
            this.type_ = propertyType.getNumber();
            return;
        }
        throw new NullPointerException();
    }

    private void setTypeValue(int n) {
        this.type_ = n;
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
                Class<Property> class_ = Property.class;
                // MONITORENTER : com.google.api.Property.class
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
                            this.type_ = codedInputStream.readEnum();
                            continue;
                        }
                        this.name_ = codedInputStream.readStringRequireUtf8();
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
                Property property = (Property)object2;
                this.name_ = visitor.visitString(true ^ this.name_.isEmpty(), this.name_, true ^ property.name_.isEmpty(), property.name_);
                boolean bl = this.type_ != 0;
                int n = this.type_;
                int n2 = property.type_;
                boolean bl2 = false;
                if (n2 != 0) {
                    bl2 = true;
                }
                this.type_ = visitor.visitInt(bl, n, bl2, property.type_);
                this.description_ = visitor.visitString(true ^ this.description_.isEmpty(), this.description_, true ^ property.description_.isEmpty(), property.description_);
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
        return new Property();
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
    public String getName() {
        return this.name_;
    }

    @Override
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8((String)this.name_);
    }

    public int getSerializedSize() {
        int n = this.memoizedSerializedSize;
        if (n != -1) {
            return n;
        }
        boolean bl = this.name_.isEmpty();
        int n2 = 0;
        if (!bl) {
            n2 = 0 + CodedOutputStream.computeStringSize((int)1, (String)this.getName());
        }
        if (this.type_ != PropertyType.UNSPECIFIED.getNumber()) {
            n2 += CodedOutputStream.computeEnumSize((int)2, (int)this.type_);
        }
        if (!this.description_.isEmpty()) {
            n2 += CodedOutputStream.computeStringSize((int)3, (String)this.getDescription());
        }
        this.memoizedSerializedSize = n2;
        return n2;
    }

    @Override
    public PropertyType getType() {
        PropertyType propertyType = PropertyType.forNumber(this.type_);
        if (propertyType == null) {
            return PropertyType.UNRECOGNIZED;
        }
        return propertyType;
    }

    @Override
    public int getTypeValue() {
        return this.type_;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.name_.isEmpty()) {
            codedOutputStream.writeString(1, this.getName());
        }
        if (this.type_ != PropertyType.UNSPECIFIED.getNumber()) {
            codedOutputStream.writeEnum(2, this.type_);
        }
        if (!this.description_.isEmpty()) {
            codedOutputStream.writeString(3, this.getDescription());
        }
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<Property, Builder>
    implements PropertyOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder clearDescription() {
            this.copyOnWrite();
            ((Property)this.instance).clearDescription();
            return this;
        }

        public Builder clearName() {
            this.copyOnWrite();
            ((Property)this.instance).clearName();
            return this;
        }

        public Builder clearType() {
            this.copyOnWrite();
            ((Property)this.instance).clearType();
            return this;
        }

        @Override
        public String getDescription() {
            return ((Property)this.instance).getDescription();
        }

        @Override
        public ByteString getDescriptionBytes() {
            return ((Property)this.instance).getDescriptionBytes();
        }

        @Override
        public String getName() {
            return ((Property)this.instance).getName();
        }

        @Override
        public ByteString getNameBytes() {
            return ((Property)this.instance).getNameBytes();
        }

        @Override
        public PropertyType getType() {
            return ((Property)this.instance).getType();
        }

        @Override
        public int getTypeValue() {
            return ((Property)this.instance).getTypeValue();
        }

        public Builder setDescription(String string2) {
            this.copyOnWrite();
            ((Property)this.instance).setDescription(string2);
            return this;
        }

        public Builder setDescriptionBytes(ByteString byteString) {
            this.copyOnWrite();
            ((Property)this.instance).setDescriptionBytes(byteString);
            return this;
        }

        public Builder setName(String string2) {
            this.copyOnWrite();
            ((Property)this.instance).setName(string2);
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            this.copyOnWrite();
            ((Property)this.instance).setNameBytes(byteString);
            return this;
        }

        public Builder setType(PropertyType propertyType) {
            this.copyOnWrite();
            ((Property)this.instance).setType(propertyType);
            return this;
        }

        public Builder setTypeValue(int n) {
            this.copyOnWrite();
            ((Property)this.instance).setTypeValue(n);
            return this;
        }
    }

    public static final class PropertyType
    extends Enum<PropertyType>
    implements Internal.EnumLite {
        private static final /* synthetic */ PropertyType[] $VALUES;
        public static final /* enum */ PropertyType BOOL;
        public static final int BOOL_VALUE = 2;
        public static final /* enum */ PropertyType DOUBLE;
        public static final int DOUBLE_VALUE = 4;
        public static final /* enum */ PropertyType INT64;
        public static final int INT64_VALUE = 1;
        public static final /* enum */ PropertyType STRING;
        public static final int STRING_VALUE = 3;
        public static final /* enum */ PropertyType UNRECOGNIZED;
        public static final /* enum */ PropertyType UNSPECIFIED;
        public static final int UNSPECIFIED_VALUE;
        private static final Internal.EnumLiteMap<PropertyType> internalValueMap;
        private final int value;

        static {
            UNSPECIFIED = new PropertyType(0);
            INT64 = new PropertyType(1);
            BOOL = new PropertyType(2);
            STRING = new PropertyType(3);
            DOUBLE = new PropertyType(4);
            UNRECOGNIZED = new PropertyType(-1);
            PropertyType[] arrpropertyType = new PropertyType[]{UNSPECIFIED, INT64, BOOL, STRING, DOUBLE, UNRECOGNIZED};
            $VALUES = arrpropertyType;
            internalValueMap = new Internal.EnumLiteMap<PropertyType>(){

                public PropertyType findValueByNumber(int n) {
                    return PropertyType.forNumber(n);
                }
            };
        }

        private PropertyType(int n2) {
            this.value = n2;
        }

        public static PropertyType forNumber(int n) {
            if (n != 0) {
                if (n != 1) {
                    if (n != 2) {
                        if (n != 3) {
                            if (n != 4) {
                                return null;
                            }
                            return DOUBLE;
                        }
                        return STRING;
                    }
                    return BOOL;
                }
                return INT64;
            }
            return UNSPECIFIED;
        }

        public static Internal.EnumLiteMap<PropertyType> internalGetValueMap() {
            return internalValueMap;
        }

        @Deprecated
        public static PropertyType valueOf(int n) {
            return PropertyType.forNumber(n);
        }

        public static PropertyType valueOf(String string2) {
            return (PropertyType)Enum.valueOf(PropertyType.class, (String)string2);
        }

        public static PropertyType[] values() {
            return (PropertyType[])$VALUES.clone();
        }

        public final int getNumber() {
            return this.value;
        }

    }

}

