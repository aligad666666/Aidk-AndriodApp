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
 *  com.google.type.TimeOfDay$1
 *  com.google.type.TimeOfDayOrBuilder
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
import com.google.type.TimeOfDay;
import com.google.type.TimeOfDayOrBuilder;
import java.io.IOException;
import java.io.InputStream;

public final class TimeOfDay
extends GeneratedMessageLite<TimeOfDay, Builder>
implements TimeOfDayOrBuilder {
    private static final TimeOfDay DEFAULT_INSTANCE = new TimeOfDay();
    public static final int HOURS_FIELD_NUMBER = 1;
    public static final int MINUTES_FIELD_NUMBER = 2;
    public static final int NANOS_FIELD_NUMBER = 4;
    private static volatile Parser<TimeOfDay> PARSER;
    public static final int SECONDS_FIELD_NUMBER = 3;
    private int hours_;
    private int minutes_;
    private int nanos_;
    private int seconds_;

    static {
        DEFAULT_INSTANCE.makeImmutable();
    }

    private TimeOfDay() {
    }

    private void clearHours() {
        this.hours_ = 0;
    }

    private void clearMinutes() {
        this.minutes_ = 0;
    }

    private void clearNanos() {
        this.nanos_ = 0;
    }

    private void clearSeconds() {
        this.seconds_ = 0;
    }

    public static TimeOfDay getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(TimeOfDay timeOfDay) {
        return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)timeOfDay);
    }

    public static TimeOfDay parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (TimeOfDay)TimeOfDay.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static TimeOfDay parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TimeOfDay)TimeOfDay.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static TimeOfDay parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (TimeOfDay)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static TimeOfDay parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TimeOfDay)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static TimeOfDay parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (TimeOfDay)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static TimeOfDay parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TimeOfDay)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static TimeOfDay parseFrom(InputStream inputStream) throws IOException {
        return (TimeOfDay)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static TimeOfDay parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TimeOfDay)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static TimeOfDay parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (TimeOfDay)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static TimeOfDay parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TimeOfDay)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<TimeOfDay> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setHours(int n) {
        this.hours_ = n;
    }

    private void setMinutes(int n) {
        this.minutes_ = n;
    }

    private void setNanos(int n) {
        this.nanos_ = n;
    }

    private void setSeconds(int n) {
        this.seconds_ = n;
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
                Class<TimeOfDay> class_ = TimeOfDay.class;
                // MONITORENTER : com.google.type.TimeOfDay.class
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
                        if (n != 8) {
                            if (n != 16) {
                                if (n != 24) {
                                    if (n != 32) {
                                        if (codedInputStream.skipField(n)) continue;
                                        bl = true;
                                        continue;
                                    }
                                    this.nanos_ = codedInputStream.readInt32();
                                    continue;
                                }
                                this.seconds_ = codedInputStream.readInt32();
                                continue;
                            }
                            this.minutes_ = codedInputStream.readInt32();
                            continue;
                        }
                        this.hours_ = codedInputStream.readInt32();
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
                TimeOfDay timeOfDay = (TimeOfDay)((Object)object2);
                int n = this.hours_;
                boolean bl = true;
                boolean bl2 = n != 0;
                int n2 = this.hours_;
                boolean bl3 = timeOfDay.hours_ != 0;
                this.hours_ = visitor.visitInt(bl2, n2, bl3, timeOfDay.hours_);
                boolean bl4 = this.minutes_ != 0;
                int n3 = this.minutes_;
                boolean bl5 = timeOfDay.minutes_ != 0;
                this.minutes_ = visitor.visitInt(bl4, n3, bl5, timeOfDay.minutes_);
                boolean bl6 = this.seconds_ != 0;
                int n4 = this.seconds_;
                boolean bl7 = timeOfDay.seconds_ != 0;
                this.seconds_ = visitor.visitInt(bl6, n4, bl7, timeOfDay.seconds_);
                boolean bl8 = this.nanos_ != 0;
                int n5 = this.nanos_;
                if (timeOfDay.nanos_ == 0) {
                    bl = false;
                }
                this.nanos_ = visitor.visitInt(bl8, n5, bl, timeOfDay.nanos_);
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
        return new TimeOfDay();
    }

    public int getHours() {
        return this.hours_;
    }

    public int getMinutes() {
        return this.minutes_;
    }

    public int getNanos() {
        return this.nanos_;
    }

    public int getSeconds() {
        return this.seconds_;
    }

    public int getSerializedSize() {
        int n;
        int n2;
        int n3;
        int n4 = this.memoizedSerializedSize;
        if (n4 != -1) {
            return n4;
        }
        int n5 = this.hours_;
        int n6 = 0;
        if (n5 != 0) {
            n6 = 0 + CodedOutputStream.computeInt32Size((int)1, (int)n5);
        }
        if ((n3 = this.minutes_) != 0) {
            n6 += CodedOutputStream.computeInt32Size((int)2, (int)n3);
        }
        if ((n2 = this.seconds_) != 0) {
            n6 += CodedOutputStream.computeInt32Size((int)3, (int)n2);
        }
        if ((n = this.nanos_) != 0) {
            n6 += CodedOutputStream.computeInt32Size((int)4, (int)n);
        }
        this.memoizedSerializedSize = n6;
        return n6;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        int n;
        int n2;
        int n3;
        int n4 = this.hours_;
        if (n4 != 0) {
            codedOutputStream.writeInt32(1, n4);
        }
        if ((n3 = this.minutes_) != 0) {
            codedOutputStream.writeInt32(2, n3);
        }
        if ((n2 = this.seconds_) != 0) {
            codedOutputStream.writeInt32(3, n2);
        }
        if ((n = this.nanos_) != 0) {
            codedOutputStream.writeInt32(4, n);
        }
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<TimeOfDay, Builder>
    implements TimeOfDayOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder clearHours() {
            this.copyOnWrite();
            ((TimeOfDay)this.instance).clearHours();
            return this;
        }

        public Builder clearMinutes() {
            this.copyOnWrite();
            ((TimeOfDay)this.instance).clearMinutes();
            return this;
        }

        public Builder clearNanos() {
            this.copyOnWrite();
            ((TimeOfDay)this.instance).clearNanos();
            return this;
        }

        public Builder clearSeconds() {
            this.copyOnWrite();
            ((TimeOfDay)this.instance).clearSeconds();
            return this;
        }

        public int getHours() {
            return ((TimeOfDay)this.instance).getHours();
        }

        public int getMinutes() {
            return ((TimeOfDay)this.instance).getMinutes();
        }

        public int getNanos() {
            return ((TimeOfDay)this.instance).getNanos();
        }

        public int getSeconds() {
            return ((TimeOfDay)this.instance).getSeconds();
        }

        public Builder setHours(int n) {
            this.copyOnWrite();
            ((TimeOfDay)this.instance).setHours(n);
            return this;
        }

        public Builder setMinutes(int n) {
            this.copyOnWrite();
            ((TimeOfDay)this.instance).setMinutes(n);
            return this;
        }

        public Builder setNanos(int n) {
            this.copyOnWrite();
            ((TimeOfDay)this.instance).setNanos(n);
            return this;
        }

        public Builder setSeconds(int n) {
            this.copyOnWrite();
            ((TimeOfDay)this.instance).setSeconds(n);
            return this;
        }
    }

}

