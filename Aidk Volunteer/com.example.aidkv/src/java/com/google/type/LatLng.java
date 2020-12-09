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
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.Parser
 *  com.google.type.LatLng$1
 *  com.google.type.LatLngOrBuilder
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.Class
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
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.type.LatLng;
import com.google.type.LatLngOrBuilder;
import java.io.IOException;
import java.io.InputStream;

public final class LatLng
extends GeneratedMessageLite<LatLng, Builder>
implements LatLngOrBuilder {
    private static final LatLng DEFAULT_INSTANCE = new LatLng();
    public static final int LATITUDE_FIELD_NUMBER = 1;
    public static final int LONGITUDE_FIELD_NUMBER = 2;
    private static volatile Parser<LatLng> PARSER;
    private double latitude_;
    private double longitude_;

    static {
        DEFAULT_INSTANCE.makeImmutable();
    }

    private LatLng() {
    }

    private void clearLatitude() {
        this.latitude_ = 0.0;
    }

    private void clearLongitude() {
        this.longitude_ = 0.0;
    }

    public static LatLng getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(LatLng latLng) {
        return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)latLng);
    }

    public static LatLng parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (LatLng)LatLng.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static LatLng parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LatLng)LatLng.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static LatLng parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (LatLng)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static LatLng parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LatLng)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static LatLng parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (LatLng)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static LatLng parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LatLng)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static LatLng parseFrom(InputStream inputStream) throws IOException {
        return (LatLng)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static LatLng parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LatLng)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static LatLng parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (LatLng)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static LatLng parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LatLng)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<LatLng> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setLatitude(double d) {
        this.latitude_ = d;
    }

    private void setLongitude(double d) {
        this.longitude_ = d;
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
                Class<LatLng> class_ = LatLng.class;
                // MONITORENTER : com.google.type.LatLng.class
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
                        if (n != 9) {
                            if (n != 17) {
                                if (codedInputStream.skipField(n)) continue;
                                bl = true;
                                continue;
                            }
                            this.longitude_ = codedInputStream.readDouble();
                            continue;
                        }
                        this.latitude_ = codedInputStream.readDouble();
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
                LatLng latLng = (LatLng)((Object)object2);
                boolean bl = this.latitude_ != 0.0;
                double d = this.latitude_;
                boolean bl2 = latLng.latitude_ != 0.0;
                this.latitude_ = visitor.visitDouble(bl, d, bl2, latLng.latitude_);
                boolean bl3 = this.longitude_ != 0.0;
                double d2 = this.longitude_;
                boolean bl4 = latLng.longitude_ != 0.0;
                this.longitude_ = visitor.visitDouble(bl3, d2, bl4, latLng.longitude_);
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
        return new LatLng();
    }

    public double getLatitude() {
        return this.latitude_;
    }

    public double getLongitude() {
        return this.longitude_;
    }

    public int getSerializedSize() {
        double d;
        int n = this.memoizedSerializedSize;
        if (n != -1) {
            return n;
        }
        double d2 = this.latitude_;
        double d3 = d2 DCMPL 0.0;
        int n2 = 0;
        if (d3 != false) {
            n2 = 0 + CodedOutputStream.computeDoubleSize((int)1, (double)d2);
        }
        if ((d = this.longitude_) != 0.0) {
            n2 += CodedOutputStream.computeDoubleSize((int)2, (double)d);
        }
        this.memoizedSerializedSize = n2;
        return n2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        double d;
        double d2 = this.latitude_;
        if (d2 != 0.0) {
            codedOutputStream.writeDouble(1, d2);
        }
        if ((d = this.longitude_) != 0.0) {
            codedOutputStream.writeDouble(2, d);
        }
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<LatLng, Builder>
    implements LatLngOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder clearLatitude() {
            this.copyOnWrite();
            ((LatLng)this.instance).clearLatitude();
            return this;
        }

        public Builder clearLongitude() {
            this.copyOnWrite();
            ((LatLng)this.instance).clearLongitude();
            return this;
        }

        public double getLatitude() {
            return ((LatLng)this.instance).getLatitude();
        }

        public double getLongitude() {
            return ((LatLng)this.instance).getLongitude();
        }

        public Builder setLatitude(double d) {
            this.copyOnWrite();
            ((LatLng)this.instance).setLatitude(d);
            return this;
        }

        public Builder setLongitude(double d) {
            this.copyOnWrite();
            ((LatLng)this.instance).setLongitude(d);
            return this;
        }
    }

}

