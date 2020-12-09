/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.firestore.v1.Value$1
 *  com.google.firestore.v1.Value$ValueTypeCase
 *  com.google.firestore.v1.ValueOrBuilder
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.CodedOutputStream
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageLite
 *  com.google.protobuf.GeneratedMessageLite$Builder
 *  com.google.protobuf.GeneratedMessageLite$MethodToInvoke
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.NullValue
 *  com.google.protobuf.Parser
 *  com.google.protobuf.Timestamp
 *  com.google.protobuf.Timestamp$Builder
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.Boolean
 *  java.lang.Double
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.firestore.v1;

import com.google.firestore.v1.ArrayValue;
import com.google.firestore.v1.MapValue;
import com.google.firestore.v1.Value;
import com.google.firestore.v1.ValueOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.NullValue;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;
import com.google.type.LatLng;
import java.io.IOException;
import java.io.InputStream;

/*
 * Exception performing whole class analysis ignored.
 */
public final class Value
extends GeneratedMessageLite<Value, Builder>
implements ValueOrBuilder {
    public static final int ARRAY_VALUE_FIELD_NUMBER = 9;
    public static final int BOOLEAN_VALUE_FIELD_NUMBER = 1;
    public static final int BYTES_VALUE_FIELD_NUMBER = 18;
    private static final Value DEFAULT_INSTANCE = new Value();
    public static final int DOUBLE_VALUE_FIELD_NUMBER = 3;
    public static final int GEO_POINT_VALUE_FIELD_NUMBER = 8;
    public static final int INTEGER_VALUE_FIELD_NUMBER = 2;
    public static final int MAP_VALUE_FIELD_NUMBER = 6;
    public static final int NULL_VALUE_FIELD_NUMBER = 11;
    private static volatile Parser<Value> PARSER;
    public static final int REFERENCE_VALUE_FIELD_NUMBER = 5;
    public static final int STRING_VALUE_FIELD_NUMBER = 17;
    public static final int TIMESTAMP_VALUE_FIELD_NUMBER = 10;
    private int valueTypeCase_ = 0;
    private Object valueType_;

    static {
        DEFAULT_INSTANCE.makeImmutable();
    }

    private Value() {
    }

    private void clearArrayValue() {
        if (this.valueTypeCase_ == 9) {
            this.valueTypeCase_ = 0;
            this.valueType_ = null;
        }
    }

    private void clearBooleanValue() {
        if (this.valueTypeCase_ == 1) {
            this.valueTypeCase_ = 0;
            this.valueType_ = null;
        }
    }

    private void clearBytesValue() {
        if (this.valueTypeCase_ == 18) {
            this.valueTypeCase_ = 0;
            this.valueType_ = null;
        }
    }

    private void clearDoubleValue() {
        if (this.valueTypeCase_ == 3) {
            this.valueTypeCase_ = 0;
            this.valueType_ = null;
        }
    }

    private void clearGeoPointValue() {
        if (this.valueTypeCase_ == 8) {
            this.valueTypeCase_ = 0;
            this.valueType_ = null;
        }
    }

    private void clearIntegerValue() {
        if (this.valueTypeCase_ == 2) {
            this.valueTypeCase_ = 0;
            this.valueType_ = null;
        }
    }

    private void clearMapValue() {
        if (this.valueTypeCase_ == 6) {
            this.valueTypeCase_ = 0;
            this.valueType_ = null;
        }
    }

    private void clearNullValue() {
        if (this.valueTypeCase_ == 11) {
            this.valueTypeCase_ = 0;
            this.valueType_ = null;
        }
    }

    private void clearReferenceValue() {
        if (this.valueTypeCase_ == 5) {
            this.valueTypeCase_ = 0;
            this.valueType_ = null;
        }
    }

    private void clearStringValue() {
        if (this.valueTypeCase_ == 17) {
            this.valueTypeCase_ = 0;
            this.valueType_ = null;
        }
    }

    private void clearTimestampValue() {
        if (this.valueTypeCase_ == 10) {
            this.valueTypeCase_ = 0;
            this.valueType_ = null;
        }
    }

    private void clearValueType() {
        this.valueTypeCase_ = 0;
        this.valueType_ = null;
    }

    public static Value getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeArrayValue(ArrayValue arrayValue) {
        this.valueType_ = this.valueTypeCase_ == 9 && this.valueType_ != ArrayValue.getDefaultInstance() ? ((ArrayValue.Builder)ArrayValue.newBuilder((ArrayValue)((Object)this.valueType_)).mergeFrom((GeneratedMessageLite)arrayValue)).buildPartial() : arrayValue;
        this.valueTypeCase_ = 9;
    }

    private void mergeGeoPointValue(LatLng latLng) {
        this.valueType_ = this.valueTypeCase_ == 8 && this.valueType_ != LatLng.getDefaultInstance() ? ((LatLng.Builder)LatLng.newBuilder((LatLng)((Object)this.valueType_)).mergeFrom((GeneratedMessageLite)latLng)).buildPartial() : latLng;
        this.valueTypeCase_ = 8;
    }

    private void mergeMapValue(MapValue mapValue) {
        this.valueType_ = this.valueTypeCase_ == 6 && this.valueType_ != MapValue.getDefaultInstance() ? ((MapValue.Builder)MapValue.newBuilder((MapValue)((Object)this.valueType_)).mergeFrom((GeneratedMessageLite)mapValue)).buildPartial() : mapValue;
        this.valueTypeCase_ = 6;
    }

    private void mergeTimestampValue(Timestamp timestamp) {
        this.valueType_ = this.valueTypeCase_ == 10 && this.valueType_ != Timestamp.getDefaultInstance() ? ((Timestamp.Builder)Timestamp.newBuilder((Timestamp)((Timestamp)this.valueType_)).mergeFrom((GeneratedMessageLite)timestamp)).buildPartial() : timestamp;
        this.valueTypeCase_ = 10;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(Value value) {
        return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)value);
    }

    public static Value parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Value)Value.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Value parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Value)Value.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Value parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Value)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static Value parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Value)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Value parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Value)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static Value parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Value)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Value parseFrom(InputStream inputStream) throws IOException {
        return (Value)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Value parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Value)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Value parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (Value)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static Value parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Value)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<Value> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setArrayValue(ArrayValue.Builder builder) {
        this.valueType_ = builder.build();
        this.valueTypeCase_ = 9;
    }

    private void setArrayValue(ArrayValue arrayValue) {
        if (arrayValue != null) {
            this.valueType_ = arrayValue;
            this.valueTypeCase_ = 9;
            return;
        }
        throw new NullPointerException();
    }

    private void setBooleanValue(boolean bl) {
        this.valueTypeCase_ = 1;
        this.valueType_ = bl;
    }

    private void setBytesValue(ByteString byteString) {
        if (byteString != null) {
            this.valueTypeCase_ = 18;
            this.valueType_ = byteString;
            return;
        }
        throw new NullPointerException();
    }

    private void setDoubleValue(double d) {
        this.valueTypeCase_ = 3;
        this.valueType_ = d;
    }

    private void setGeoPointValue(LatLng.Builder builder) {
        this.valueType_ = builder.build();
        this.valueTypeCase_ = 8;
    }

    private void setGeoPointValue(LatLng latLng) {
        if (latLng != null) {
            this.valueType_ = latLng;
            this.valueTypeCase_ = 8;
            return;
        }
        throw new NullPointerException();
    }

    private void setIntegerValue(long l) {
        this.valueTypeCase_ = 2;
        this.valueType_ = l;
    }

    private void setMapValue(MapValue.Builder builder) {
        this.valueType_ = builder.build();
        this.valueTypeCase_ = 6;
    }

    private void setMapValue(MapValue mapValue) {
        if (mapValue != null) {
            this.valueType_ = mapValue;
            this.valueTypeCase_ = 6;
            return;
        }
        throw new NullPointerException();
    }

    private void setNullValue(NullValue nullValue) {
        if (nullValue != null) {
            this.valueTypeCase_ = 11;
            this.valueType_ = nullValue.getNumber();
            return;
        }
        throw new NullPointerException();
    }

    private void setNullValueValue(int n) {
        this.valueTypeCase_ = 11;
        this.valueType_ = n;
    }

    private void setReferenceValue(String string) {
        if (string != null) {
            this.valueTypeCase_ = 5;
            this.valueType_ = string;
            return;
        }
        throw new NullPointerException();
    }

    private void setReferenceValueBytes(ByteString byteString) {
        if (byteString != null) {
            Value.checkByteStringIsUtf8((ByteString)byteString);
            this.valueTypeCase_ = 5;
            this.valueType_ = byteString.toStringUtf8();
            return;
        }
        throw new NullPointerException();
    }

    private void setStringValue(String string) {
        if (string != null) {
            this.valueTypeCase_ = 17;
            this.valueType_ = string;
            return;
        }
        throw new NullPointerException();
    }

    private void setStringValueBytes(ByteString byteString) {
        if (byteString != null) {
            Value.checkByteStringIsUtf8((ByteString)byteString);
            this.valueTypeCase_ = 17;
            this.valueType_ = byteString.toStringUtf8();
            return;
        }
        throw new NullPointerException();
    }

    private void setTimestampValue(Timestamp.Builder builder) {
        this.valueType_ = builder.build();
        this.valueTypeCase_ = 10;
    }

    private void setTimestampValue(Timestamp timestamp) {
        if (timestamp != null) {
            this.valueType_ = timestamp;
            this.valueTypeCase_ = 10;
            return;
        }
        throw new NullPointerException();
    }

    /*
     * Exception decompiling
     */
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke var1_1, Object var2_2, Object var3_3) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [16[CASE]], but top level block is 3[TRYBLOCK]
        // org.benf.cfr.reader.b.a.a.j.a(Op04StructuredStatement.java:432)
        // org.benf.cfr.reader.b.a.a.j.d(Op04StructuredStatement.java:484)
        // org.benf.cfr.reader.b.a.a.i.a(Op03SimpleStatement.java:607)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:692)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
        // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
        // org.benf.cfr.reader.b.a(Driver.java:128)
        // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
        // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
        // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
        // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
        // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)
        // java.lang.Thread.run(Thread.java:919)
        throw new IllegalStateException("Decompilation failed");
    }

    public ArrayValue getArrayValue() {
        if (this.valueTypeCase_ == 9) {
            return (ArrayValue)((Object)this.valueType_);
        }
        return ArrayValue.getDefaultInstance();
    }

    public boolean getBooleanValue() {
        if (this.valueTypeCase_ == 1) {
            return (Boolean)this.valueType_;
        }
        return false;
    }

    public ByteString getBytesValue() {
        if (this.valueTypeCase_ == 18) {
            return (ByteString)this.valueType_;
        }
        return ByteString.EMPTY;
    }

    public double getDoubleValue() {
        if (this.valueTypeCase_ == 3) {
            return (Double)this.valueType_;
        }
        return 0.0;
    }

    public LatLng getGeoPointValue() {
        if (this.valueTypeCase_ == 8) {
            return (LatLng)((Object)this.valueType_);
        }
        return LatLng.getDefaultInstance();
    }

    public long getIntegerValue() {
        if (this.valueTypeCase_ == 2) {
            return (Long)this.valueType_;
        }
        return 0L;
    }

    public MapValue getMapValue() {
        if (this.valueTypeCase_ == 6) {
            return (MapValue)((Object)this.valueType_);
        }
        return MapValue.getDefaultInstance();
    }

    public NullValue getNullValue() {
        if (this.valueTypeCase_ == 11) {
            NullValue nullValue = NullValue.forNumber((int)((Integer)this.valueType_));
            if (nullValue == null) {
                return NullValue.UNRECOGNIZED;
            }
            return nullValue;
        }
        return NullValue.NULL_VALUE;
    }

    public int getNullValueValue() {
        if (this.valueTypeCase_ == 11) {
            return (Integer)this.valueType_;
        }
        return 0;
    }

    public String getReferenceValue() {
        String string = "";
        if (this.valueTypeCase_ == 5) {
            string = (String)this.valueType_;
        }
        return string;
    }

    public ByteString getReferenceValueBytes() {
        String string = "";
        if (this.valueTypeCase_ == 5) {
            string = (String)this.valueType_;
        }
        return ByteString.copyFromUtf8((String)string);
    }

    public int getSerializedSize() {
        int n = this.memoizedSerializedSize;
        if (n != -1) {
            return n;
        }
        int n2 = this.valueTypeCase_;
        int n3 = 0;
        if (n2 == 1) {
            n3 = 0 + CodedOutputStream.computeBoolSize((int)1, (boolean)((Boolean)this.valueType_));
        }
        if (this.valueTypeCase_ == 2) {
            n3 += CodedOutputStream.computeInt64Size((int)2, (long)((Long)this.valueType_));
        }
        if (this.valueTypeCase_ == 3) {
            n3 += CodedOutputStream.computeDoubleSize((int)3, (double)((Double)this.valueType_));
        }
        if (this.valueTypeCase_ == 5) {
            n3 += CodedOutputStream.computeStringSize((int)5, (String)this.getReferenceValue());
        }
        if (this.valueTypeCase_ == 6) {
            n3 += CodedOutputStream.computeMessageSize((int)6, (MessageLite)((MapValue)((Object)this.valueType_)));
        }
        if (this.valueTypeCase_ == 8) {
            n3 += CodedOutputStream.computeMessageSize((int)8, (MessageLite)((LatLng)((Object)this.valueType_)));
        }
        if (this.valueTypeCase_ == 9) {
            n3 += CodedOutputStream.computeMessageSize((int)9, (MessageLite)((ArrayValue)((Object)this.valueType_)));
        }
        if (this.valueTypeCase_ == 10) {
            n3 += CodedOutputStream.computeMessageSize((int)10, (MessageLite)((Timestamp)this.valueType_));
        }
        if (this.valueTypeCase_ == 11) {
            n3 += CodedOutputStream.computeEnumSize((int)11, (int)((Integer)this.valueType_));
        }
        if (this.valueTypeCase_ == 17) {
            n3 += CodedOutputStream.computeStringSize((int)17, (String)this.getStringValue());
        }
        if (this.valueTypeCase_ == 18) {
            n3 += CodedOutputStream.computeBytesSize((int)18, (ByteString)((ByteString)this.valueType_));
        }
        this.memoizedSerializedSize = n3;
        return n3;
    }

    public String getStringValue() {
        String string = "";
        if (this.valueTypeCase_ == 17) {
            string = (String)this.valueType_;
        }
        return string;
    }

    public ByteString getStringValueBytes() {
        String string = "";
        if (this.valueTypeCase_ == 17) {
            string = (String)this.valueType_;
        }
        return ByteString.copyFromUtf8((String)string);
    }

    public Timestamp getTimestampValue() {
        if (this.valueTypeCase_ == 10) {
            return (Timestamp)this.valueType_;
        }
        return Timestamp.getDefaultInstance();
    }

    public ValueTypeCase getValueTypeCase() {
        return ValueTypeCase.forNumber((int)this.valueTypeCase_);
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.valueTypeCase_ == 1) {
            codedOutputStream.writeBool(1, ((Boolean)this.valueType_).booleanValue());
        }
        if (this.valueTypeCase_ == 2) {
            codedOutputStream.writeInt64(2, ((Long)this.valueType_).longValue());
        }
        if (this.valueTypeCase_ == 3) {
            codedOutputStream.writeDouble(3, ((Double)this.valueType_).doubleValue());
        }
        if (this.valueTypeCase_ == 5) {
            codedOutputStream.writeString(5, this.getReferenceValue());
        }
        if (this.valueTypeCase_ == 6) {
            codedOutputStream.writeMessage(6, (MessageLite)((MapValue)((Object)this.valueType_)));
        }
        if (this.valueTypeCase_ == 8) {
            codedOutputStream.writeMessage(8, (MessageLite)((LatLng)((Object)this.valueType_)));
        }
        if (this.valueTypeCase_ == 9) {
            codedOutputStream.writeMessage(9, (MessageLite)((ArrayValue)((Object)this.valueType_)));
        }
        if (this.valueTypeCase_ == 10) {
            codedOutputStream.writeMessage(10, (MessageLite)((Timestamp)this.valueType_));
        }
        if (this.valueTypeCase_ == 11) {
            codedOutputStream.writeEnum(11, ((Integer)this.valueType_).intValue());
        }
        if (this.valueTypeCase_ == 17) {
            codedOutputStream.writeString(17, this.getStringValue());
        }
        if (this.valueTypeCase_ == 18) {
            codedOutputStream.writeBytes(18, (ByteString)this.valueType_);
        }
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<Value, Builder>
    implements ValueOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder clearArrayValue() {
            this.copyOnWrite();
            ((Value)this.instance).clearArrayValue();
            return this;
        }

        public Builder clearBooleanValue() {
            this.copyOnWrite();
            ((Value)this.instance).clearBooleanValue();
            return this;
        }

        public Builder clearBytesValue() {
            this.copyOnWrite();
            ((Value)this.instance).clearBytesValue();
            return this;
        }

        public Builder clearDoubleValue() {
            this.copyOnWrite();
            ((Value)this.instance).clearDoubleValue();
            return this;
        }

        public Builder clearGeoPointValue() {
            this.copyOnWrite();
            ((Value)this.instance).clearGeoPointValue();
            return this;
        }

        public Builder clearIntegerValue() {
            this.copyOnWrite();
            ((Value)this.instance).clearIntegerValue();
            return this;
        }

        public Builder clearMapValue() {
            this.copyOnWrite();
            ((Value)this.instance).clearMapValue();
            return this;
        }

        public Builder clearNullValue() {
            this.copyOnWrite();
            ((Value)this.instance).clearNullValue();
            return this;
        }

        public Builder clearReferenceValue() {
            this.copyOnWrite();
            ((Value)this.instance).clearReferenceValue();
            return this;
        }

        public Builder clearStringValue() {
            this.copyOnWrite();
            ((Value)this.instance).clearStringValue();
            return this;
        }

        public Builder clearTimestampValue() {
            this.copyOnWrite();
            ((Value)this.instance).clearTimestampValue();
            return this;
        }

        public Builder clearValueType() {
            this.copyOnWrite();
            ((Value)this.instance).clearValueType();
            return this;
        }

        public ArrayValue getArrayValue() {
            return ((Value)this.instance).getArrayValue();
        }

        public boolean getBooleanValue() {
            return ((Value)this.instance).getBooleanValue();
        }

        public ByteString getBytesValue() {
            return ((Value)this.instance).getBytesValue();
        }

        public double getDoubleValue() {
            return ((Value)this.instance).getDoubleValue();
        }

        public LatLng getGeoPointValue() {
            return ((Value)this.instance).getGeoPointValue();
        }

        public long getIntegerValue() {
            return ((Value)this.instance).getIntegerValue();
        }

        public MapValue getMapValue() {
            return ((Value)this.instance).getMapValue();
        }

        public NullValue getNullValue() {
            return ((Value)this.instance).getNullValue();
        }

        public int getNullValueValue() {
            return ((Value)this.instance).getNullValueValue();
        }

        public String getReferenceValue() {
            return ((Value)this.instance).getReferenceValue();
        }

        public ByteString getReferenceValueBytes() {
            return ((Value)this.instance).getReferenceValueBytes();
        }

        public String getStringValue() {
            return ((Value)this.instance).getStringValue();
        }

        public ByteString getStringValueBytes() {
            return ((Value)this.instance).getStringValueBytes();
        }

        public Timestamp getTimestampValue() {
            return ((Value)this.instance).getTimestampValue();
        }

        public ValueTypeCase getValueTypeCase() {
            return ((Value)this.instance).getValueTypeCase();
        }

        public Builder mergeArrayValue(ArrayValue arrayValue) {
            this.copyOnWrite();
            ((Value)this.instance).mergeArrayValue(arrayValue);
            return this;
        }

        public Builder mergeGeoPointValue(LatLng latLng) {
            this.copyOnWrite();
            ((Value)this.instance).mergeGeoPointValue(latLng);
            return this;
        }

        public Builder mergeMapValue(MapValue mapValue) {
            this.copyOnWrite();
            ((Value)this.instance).mergeMapValue(mapValue);
            return this;
        }

        public Builder mergeTimestampValue(Timestamp timestamp) {
            this.copyOnWrite();
            ((Value)this.instance).mergeTimestampValue(timestamp);
            return this;
        }

        public Builder setArrayValue(ArrayValue.Builder builder) {
            this.copyOnWrite();
            ((Value)this.instance).setArrayValue(builder);
            return this;
        }

        public Builder setArrayValue(ArrayValue arrayValue) {
            this.copyOnWrite();
            ((Value)this.instance).setArrayValue(arrayValue);
            return this;
        }

        public Builder setBooleanValue(boolean bl) {
            this.copyOnWrite();
            ((Value)this.instance).setBooleanValue(bl);
            return this;
        }

        public Builder setBytesValue(ByteString byteString) {
            this.copyOnWrite();
            ((Value)this.instance).setBytesValue(byteString);
            return this;
        }

        public Builder setDoubleValue(double d) {
            this.copyOnWrite();
            ((Value)this.instance).setDoubleValue(d);
            return this;
        }

        public Builder setGeoPointValue(LatLng.Builder builder) {
            this.copyOnWrite();
            ((Value)this.instance).setGeoPointValue(builder);
            return this;
        }

        public Builder setGeoPointValue(LatLng latLng) {
            this.copyOnWrite();
            ((Value)this.instance).setGeoPointValue(latLng);
            return this;
        }

        public Builder setIntegerValue(long l) {
            this.copyOnWrite();
            ((Value)this.instance).setIntegerValue(l);
            return this;
        }

        public Builder setMapValue(MapValue.Builder builder) {
            this.copyOnWrite();
            ((Value)this.instance).setMapValue(builder);
            return this;
        }

        public Builder setMapValue(MapValue mapValue) {
            this.copyOnWrite();
            ((Value)this.instance).setMapValue(mapValue);
            return this;
        }

        public Builder setNullValue(NullValue nullValue) {
            this.copyOnWrite();
            ((Value)this.instance).setNullValue(nullValue);
            return this;
        }

        public Builder setNullValueValue(int n) {
            this.copyOnWrite();
            ((Value)this.instance).setNullValueValue(n);
            return this;
        }

        public Builder setReferenceValue(String string) {
            this.copyOnWrite();
            ((Value)this.instance).setReferenceValue(string);
            return this;
        }

        public Builder setReferenceValueBytes(ByteString byteString) {
            this.copyOnWrite();
            ((Value)this.instance).setReferenceValueBytes(byteString);
            return this;
        }

        public Builder setStringValue(String string) {
            this.copyOnWrite();
            ((Value)this.instance).setStringValue(string);
            return this;
        }

        public Builder setStringValueBytes(ByteString byteString) {
            this.copyOnWrite();
            ((Value)this.instance).setStringValueBytes(byteString);
            return this;
        }

        public Builder setTimestampValue(Timestamp.Builder builder) {
            this.copyOnWrite();
            ((Value)this.instance).setTimestampValue(builder);
            return this;
        }

        public Builder setTimestampValue(Timestamp timestamp) {
            this.copyOnWrite();
            ((Value)this.instance).setTimestampValue(timestamp);
            return this;
        }
    }

}

