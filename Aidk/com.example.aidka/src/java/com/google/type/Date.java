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
 *  com.google.type.Date$1
 *  com.google.type.DateOrBuilder
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
import com.google.type.Date;
import com.google.type.DateOrBuilder;
import java.io.IOException;
import java.io.InputStream;

public final class Date
extends GeneratedMessageLite<Date, Builder>
implements DateOrBuilder {
    public static final int DAY_FIELD_NUMBER = 3;
    private static final Date DEFAULT_INSTANCE = new Date();
    public static final int MONTH_FIELD_NUMBER = 2;
    private static volatile Parser<Date> PARSER;
    public static final int YEAR_FIELD_NUMBER = 1;
    private int day_;
    private int month_;
    private int year_;

    static {
        DEFAULT_INSTANCE.makeImmutable();
    }

    private Date() {
    }

    private void clearDay() {
        this.day_ = 0;
    }

    private void clearMonth() {
        this.month_ = 0;
    }

    private void clearYear() {
        this.year_ = 0;
    }

    public static Date getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(Date date) {
        return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)date);
    }

    public static Date parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Date)Date.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Date parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Date)Date.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Date parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Date)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static Date parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Date)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Date parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Date)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static Date parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Date)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Date parseFrom(InputStream inputStream) throws IOException {
        return (Date)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Date parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Date)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Date parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (Date)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static Date parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Date)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<Date> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setDay(int n) {
        this.day_ = n;
    }

    private void setMonth(int n) {
        this.month_ = n;
    }

    private void setYear(int n) {
        this.year_ = n;
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
                Class<Date> class_ = Date.class;
                // MONITORENTER : com.google.type.Date.class
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
                                    if (codedInputStream.skipField(n)) continue;
                                    bl = true;
                                    continue;
                                }
                                this.day_ = codedInputStream.readInt32();
                                continue;
                            }
                            this.month_ = codedInputStream.readInt32();
                            continue;
                        }
                        this.year_ = codedInputStream.readInt32();
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
                Date date = (Date)((Object)object2);
                int n = this.year_;
                boolean bl = true;
                boolean bl2 = n != 0;
                int n2 = this.year_;
                boolean bl3 = date.year_ != 0;
                this.year_ = visitor.visitInt(bl2, n2, bl3, date.year_);
                boolean bl4 = this.month_ != 0;
                int n3 = this.month_;
                boolean bl5 = date.month_ != 0;
                this.month_ = visitor.visitInt(bl4, n3, bl5, date.month_);
                boolean bl6 = this.day_ != 0;
                int n4 = this.day_;
                if (date.day_ == 0) {
                    bl = false;
                }
                this.day_ = visitor.visitInt(bl6, n4, bl, date.day_);
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
        return new Date();
    }

    public int getDay() {
        return this.day_;
    }

    public int getMonth() {
        return this.month_;
    }

    public int getSerializedSize() {
        int n;
        int n2;
        int n3 = this.memoizedSerializedSize;
        if (n3 != -1) {
            return n3;
        }
        int n4 = this.year_;
        int n5 = 0;
        if (n4 != 0) {
            n5 = 0 + CodedOutputStream.computeInt32Size((int)1, (int)n4);
        }
        if ((n2 = this.month_) != 0) {
            n5 += CodedOutputStream.computeInt32Size((int)2, (int)n2);
        }
        if ((n = this.day_) != 0) {
            n5 += CodedOutputStream.computeInt32Size((int)3, (int)n);
        }
        this.memoizedSerializedSize = n5;
        return n5;
    }

    public int getYear() {
        return this.year_;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        int n;
        int n2;
        int n3 = this.year_;
        if (n3 != 0) {
            codedOutputStream.writeInt32(1, n3);
        }
        if ((n2 = this.month_) != 0) {
            codedOutputStream.writeInt32(2, n2);
        }
        if ((n = this.day_) != 0) {
            codedOutputStream.writeInt32(3, n);
        }
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<Date, Builder>
    implements DateOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder clearDay() {
            this.copyOnWrite();
            ((Date)this.instance).clearDay();
            return this;
        }

        public Builder clearMonth() {
            this.copyOnWrite();
            ((Date)this.instance).clearMonth();
            return this;
        }

        public Builder clearYear() {
            this.copyOnWrite();
            ((Date)this.instance).clearYear();
            return this;
        }

        public int getDay() {
            return ((Date)this.instance).getDay();
        }

        public int getMonth() {
            return ((Date)this.instance).getMonth();
        }

        public int getYear() {
            return ((Date)this.instance).getYear();
        }

        public Builder setDay(int n) {
            this.copyOnWrite();
            ((Date)this.instance).setDay(n);
            return this;
        }

        public Builder setMonth(int n) {
            this.copyOnWrite();
            ((Date)this.instance).setMonth(n);
            return this;
        }

        public Builder setYear(int n) {
            this.copyOnWrite();
            ((Date)this.instance).setYear(n);
            return this;
        }
    }

}

