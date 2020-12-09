/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.CodedOutputStream
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.FloatValue
 *  com.google.protobuf.FloatValue$Builder
 *  com.google.protobuf.GeneratedMessageLite
 *  com.google.protobuf.GeneratedMessageLite$Builder
 *  com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser
 *  com.google.protobuf.GeneratedMessageLite$MethodToInvoke
 *  com.google.protobuf.GeneratedMessageLite$Visitor
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.Parser
 *  com.google.type.Color$1
 *  com.google.type.ColorOrBuilder
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.Class
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.UnsupportedOperationException
 */
package com.google.type;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.FloatValue;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.type.Color;
import com.google.type.ColorOrBuilder;
import java.io.IOException;
import java.io.InputStream;

public final class Color
extends GeneratedMessageLite<Color, Builder>
implements ColorOrBuilder {
    public static final int ALPHA_FIELD_NUMBER = 4;
    public static final int BLUE_FIELD_NUMBER = 3;
    private static final Color DEFAULT_INSTANCE = new Color();
    public static final int GREEN_FIELD_NUMBER = 2;
    private static volatile Parser<Color> PARSER;
    public static final int RED_FIELD_NUMBER = 1;
    private FloatValue alpha_;
    private float blue_;
    private float green_;
    private float red_;

    static {
        DEFAULT_INSTANCE.makeImmutable();
    }

    private Color() {
    }

    private void clearAlpha() {
        this.alpha_ = null;
    }

    private void clearBlue() {
        this.blue_ = 0.0f;
    }

    private void clearGreen() {
        this.green_ = 0.0f;
    }

    private void clearRed() {
        this.red_ = 0.0f;
    }

    public static Color getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeAlpha(FloatValue floatValue) {
        FloatValue floatValue2 = this.alpha_;
        if (floatValue2 != null && floatValue2 != FloatValue.getDefaultInstance()) {
            this.alpha_ = (FloatValue)((FloatValue.Builder)FloatValue.newBuilder((FloatValue)this.alpha_).mergeFrom((GeneratedMessageLite)floatValue)).buildPartial();
            return;
        }
        this.alpha_ = floatValue;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(Color color) {
        return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)color);
    }

    public static Color parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Color)Color.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Color parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Color)Color.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Color parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Color)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static Color parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Color)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Color parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Color)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static Color parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Color)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Color parseFrom(InputStream inputStream) throws IOException {
        return (Color)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Color parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Color)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Color parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (Color)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static Color parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Color)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<Color> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setAlpha(FloatValue.Builder builder) {
        this.alpha_ = (FloatValue)builder.build();
    }

    private void setAlpha(FloatValue floatValue) {
        if (floatValue != null) {
            this.alpha_ = floatValue;
            return;
        }
        throw new NullPointerException();
    }

    private void setBlue(float f) {
        this.blue_ = f;
    }

    private void setGreen(float f) {
        this.green_ = f;
    }

    private void setRed(float f) {
        this.red_ = f;
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
                Class<Color> class_ = Color.class;
                // MONITORENTER : com.google.type.Color.class
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
                        if (n != 13) {
                            if (n != 21) {
                                if (n != 29) {
                                    if (n != 34) {
                                        if (codedInputStream.skipField(n)) continue;
                                        bl = true;
                                        continue;
                                    }
                                    FloatValue floatValue = this.alpha_;
                                    FloatValue.Builder builder = null;
                                    if (floatValue != null) {
                                        builder = (FloatValue.Builder)this.alpha_.toBuilder();
                                    }
                                    this.alpha_ = (FloatValue)codedInputStream.readMessage(FloatValue.parser(), extensionRegistryLite);
                                    if (builder == null) continue;
                                    builder.mergeFrom((GeneratedMessageLite)this.alpha_);
                                    this.alpha_ = (FloatValue)builder.buildPartial();
                                    continue;
                                }
                                this.blue_ = codedInputStream.readFloat();
                                continue;
                            }
                            this.green_ = codedInputStream.readFloat();
                            continue;
                        }
                        this.red_ = codedInputStream.readFloat();
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
                Color color = (Color)((Object)object2);
                float f = this.red_;
                boolean bl = true;
                boolean bl2 = f != 0.0f;
                float f2 = this.red_;
                boolean bl3 = color.red_ != 0.0f;
                this.red_ = visitor.visitFloat(bl2, f2, bl3, color.red_);
                boolean bl4 = this.green_ != 0.0f;
                float f3 = this.green_;
                boolean bl5 = color.green_ != 0.0f;
                this.green_ = visitor.visitFloat(bl4, f3, bl5, color.green_);
                boolean bl6 = this.blue_ != 0.0f;
                float f4 = this.blue_;
                if (color.blue_ == 0.0f) {
                    bl = false;
                }
                this.blue_ = visitor.visitFloat(bl6, f4, bl, color.blue_);
                this.alpha_ = (FloatValue)visitor.visitMessage((MessageLite)this.alpha_, (MessageLite)color.alpha_);
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
        return new Color();
    }

    public FloatValue getAlpha() {
        FloatValue floatValue = this.alpha_;
        if (floatValue == null) {
            floatValue = FloatValue.getDefaultInstance();
        }
        return floatValue;
    }

    public float getBlue() {
        return this.blue_;
    }

    public float getGreen() {
        return this.green_;
    }

    public float getRed() {
        return this.red_;
    }

    public int getSerializedSize() {
        float f;
        float f2;
        int n = this.memoizedSerializedSize;
        if (n != -1) {
            return n;
        }
        float f3 = this.red_;
        float f4 = f3 FCMPL 0.0f;
        int n2 = 0;
        if (f4 != false) {
            n2 = 0 + CodedOutputStream.computeFloatSize((int)1, (float)f3);
        }
        if ((f2 = this.green_) != 0.0f) {
            n2 += CodedOutputStream.computeFloatSize((int)2, (float)f2);
        }
        if ((f = this.blue_) != 0.0f) {
            n2 += CodedOutputStream.computeFloatSize((int)3, (float)f);
        }
        if (this.alpha_ != null) {
            n2 += CodedOutputStream.computeMessageSize((int)4, (MessageLite)this.getAlpha());
        }
        this.memoizedSerializedSize = n2;
        return n2;
    }

    public boolean hasAlpha() {
        return this.alpha_ != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        float f;
        float f2;
        float f3 = this.red_;
        if (f3 != 0.0f) {
            codedOutputStream.writeFloat(1, f3);
        }
        if ((f = this.green_) != 0.0f) {
            codedOutputStream.writeFloat(2, f);
        }
        if ((f2 = this.blue_) != 0.0f) {
            codedOutputStream.writeFloat(3, f2);
        }
        if (this.alpha_ != null) {
            codedOutputStream.writeMessage(4, (MessageLite)this.getAlpha());
        }
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<Color, Builder>
    implements ColorOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder clearAlpha() {
            this.copyOnWrite();
            ((Color)this.instance).clearAlpha();
            return this;
        }

        public Builder clearBlue() {
            this.copyOnWrite();
            ((Color)this.instance).clearBlue();
            return this;
        }

        public Builder clearGreen() {
            this.copyOnWrite();
            ((Color)this.instance).clearGreen();
            return this;
        }

        public Builder clearRed() {
            this.copyOnWrite();
            ((Color)this.instance).clearRed();
            return this;
        }

        public FloatValue getAlpha() {
            return ((Color)this.instance).getAlpha();
        }

        public float getBlue() {
            return ((Color)this.instance).getBlue();
        }

        public float getGreen() {
            return ((Color)this.instance).getGreen();
        }

        public float getRed() {
            return ((Color)this.instance).getRed();
        }

        public boolean hasAlpha() {
            return ((Color)this.instance).hasAlpha();
        }

        public Builder mergeAlpha(FloatValue floatValue) {
            this.copyOnWrite();
            ((Color)this.instance).mergeAlpha(floatValue);
            return this;
        }

        public Builder setAlpha(FloatValue.Builder builder) {
            this.copyOnWrite();
            ((Color)this.instance).setAlpha(builder);
            return this;
        }

        public Builder setAlpha(FloatValue floatValue) {
            this.copyOnWrite();
            ((Color)this.instance).setAlpha(floatValue);
            return this;
        }

        public Builder setBlue(float f) {
            this.copyOnWrite();
            ((Color)this.instance).setBlue(f);
            return this;
        }

        public Builder setGreen(float f) {
            this.copyOnWrite();
            ((Color)this.instance).setGreen(f);
            return this;
        }

        public Builder setRed(float f) {
            this.copyOnWrite();
            ((Color)this.instance).setRed(f);
            return this;
        }
    }

}

