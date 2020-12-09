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
 *  com.google.type.Money$1
 *  com.google.type.MoneyOrBuilder
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
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.type.Money;
import com.google.type.MoneyOrBuilder;
import java.io.IOException;
import java.io.InputStream;

public final class Money
extends GeneratedMessageLite<Money, Builder>
implements MoneyOrBuilder {
    public static final int CURRENCY_CODE_FIELD_NUMBER = 1;
    private static final Money DEFAULT_INSTANCE = new Money();
    public static final int NANOS_FIELD_NUMBER = 3;
    private static volatile Parser<Money> PARSER;
    public static final int UNITS_FIELD_NUMBER = 2;
    private String currencyCode_ = "";
    private int nanos_;
    private long units_;

    static {
        DEFAULT_INSTANCE.makeImmutable();
    }

    private Money() {
    }

    private void clearCurrencyCode() {
        this.currencyCode_ = Money.getDefaultInstance().getCurrencyCode();
    }

    private void clearNanos() {
        this.nanos_ = 0;
    }

    private void clearUnits() {
        this.units_ = 0L;
    }

    public static Money getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(Money money) {
        return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)money);
    }

    public static Money parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Money)Money.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Money parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Money)Money.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Money parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Money)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static Money parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Money)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Money parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Money)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static Money parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Money)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Money parseFrom(InputStream inputStream) throws IOException {
        return (Money)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Money parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Money)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Money parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (Money)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static Money parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Money)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<Money> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setCurrencyCode(String string) {
        if (string != null) {
            this.currencyCode_ = string;
            return;
        }
        throw new NullPointerException();
    }

    private void setCurrencyCodeBytes(ByteString byteString) {
        if (byteString != null) {
            Money.checkByteStringIsUtf8((ByteString)byteString);
            this.currencyCode_ = byteString.toStringUtf8();
            return;
        }
        throw new NullPointerException();
    }

    private void setNanos(int n) {
        this.nanos_ = n;
    }

    private void setUnits(long l) {
        this.units_ = l;
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
                Class<Money> class_ = Money.class;
                // MONITORENTER : com.google.type.Money.class
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
                                if (n != 24) {
                                    if (codedInputStream.skipField(n)) continue;
                                    bl = true;
                                    continue;
                                }
                                this.nanos_ = codedInputStream.readInt32();
                                continue;
                            }
                            this.units_ = codedInputStream.readInt64();
                            continue;
                        }
                        this.currencyCode_ = codedInputStream.readStringRequireUtf8();
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
                Money money = (Money)((Object)object2);
                boolean bl = this.currencyCode_.isEmpty();
                boolean bl2 = true;
                this.currencyCode_ = visitor.visitString(bl ^ bl2, this.currencyCode_, bl2 ^ money.currencyCode_.isEmpty(), money.currencyCode_);
                boolean bl3 = this.units_ != 0L;
                long l = this.units_;
                boolean bl4 = money.units_ != 0L;
                long l2 = money.units_;
                this.units_ = visitor.visitLong(bl3, l, bl4, l2);
                boolean bl5 = this.nanos_ != 0;
                int n = this.nanos_;
                if (money.nanos_ == 0) {
                    bl2 = false;
                }
                this.nanos_ = visitor.visitInt(bl5, n, bl2, money.nanos_);
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
        return new Money();
    }

    public String getCurrencyCode() {
        return this.currencyCode_;
    }

    public ByteString getCurrencyCodeBytes() {
        return ByteString.copyFromUtf8((String)this.currencyCode_);
    }

    public int getNanos() {
        return this.nanos_;
    }

    public int getSerializedSize() {
        long l;
        int n;
        int n2 = this.memoizedSerializedSize;
        if (n2 != -1) {
            return n2;
        }
        boolean bl = this.currencyCode_.isEmpty();
        int n3 = 0;
        if (!bl) {
            n3 = 0 + CodedOutputStream.computeStringSize((int)1, (String)this.getCurrencyCode());
        }
        if ((l = this.units_) != 0L) {
            n3 += CodedOutputStream.computeInt64Size((int)2, (long)l);
        }
        if ((n = this.nanos_) != 0) {
            n3 += CodedOutputStream.computeInt32Size((int)3, (int)n);
        }
        this.memoizedSerializedSize = n3;
        return n3;
    }

    public long getUnits() {
        return this.units_;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        long l;
        int n;
        if (!this.currencyCode_.isEmpty()) {
            codedOutputStream.writeString(1, this.getCurrencyCode());
        }
        if ((l = this.units_) != 0L) {
            codedOutputStream.writeInt64(2, l);
        }
        if ((n = this.nanos_) != 0) {
            codedOutputStream.writeInt32(3, n);
        }
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<Money, Builder>
    implements MoneyOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder clearCurrencyCode() {
            this.copyOnWrite();
            ((Money)this.instance).clearCurrencyCode();
            return this;
        }

        public Builder clearNanos() {
            this.copyOnWrite();
            ((Money)this.instance).clearNanos();
            return this;
        }

        public Builder clearUnits() {
            this.copyOnWrite();
            ((Money)this.instance).clearUnits();
            return this;
        }

        public String getCurrencyCode() {
            return ((Money)this.instance).getCurrencyCode();
        }

        public ByteString getCurrencyCodeBytes() {
            return ((Money)this.instance).getCurrencyCodeBytes();
        }

        public int getNanos() {
            return ((Money)this.instance).getNanos();
        }

        public long getUnits() {
            return ((Money)this.instance).getUnits();
        }

        public Builder setCurrencyCode(String string) {
            this.copyOnWrite();
            ((Money)this.instance).setCurrencyCode(string);
            return this;
        }

        public Builder setCurrencyCodeBytes(ByteString byteString) {
            this.copyOnWrite();
            ((Money)this.instance).setCurrencyCodeBytes(byteString);
            return this;
        }

        public Builder setNanos(int n) {
            this.copyOnWrite();
            ((Money)this.instance).setNanos(n);
            return this;
        }

        public Builder setUnits(long l) {
            this.copyOnWrite();
            ((Money)this.instance).setUnits(l);
            return this;
        }
    }

}

