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
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.Class
 *  java.lang.NoSuchFieldError
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.UnsupportedOperationException
 */
package com.google.api;

import com.google.api.BackendRuleOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;

public final class BackendRule
extends GeneratedMessageLite<BackendRule, Builder>
implements BackendRuleOrBuilder {
    public static final int ADDRESS_FIELD_NUMBER = 2;
    public static final int DEADLINE_FIELD_NUMBER = 3;
    private static final BackendRule DEFAULT_INSTANCE = new BackendRule();
    private static volatile Parser<BackendRule> PARSER;
    public static final int SELECTOR_FIELD_NUMBER = 1;
    private String address_ = "";
    private double deadline_;
    private String selector_ = "";

    static {
        DEFAULT_INSTANCE.makeImmutable();
    }

    private BackendRule() {
    }

    private void clearAddress() {
        this.address_ = BackendRule.getDefaultInstance().getAddress();
    }

    private void clearDeadline() {
        this.deadline_ = 0.0;
    }

    private void clearSelector() {
        this.selector_ = BackendRule.getDefaultInstance().getSelector();
    }

    public static BackendRule getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(BackendRule backendRule) {
        return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)backendRule);
    }

    public static BackendRule parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (BackendRule)BackendRule.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static BackendRule parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BackendRule)BackendRule.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static BackendRule parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (BackendRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static BackendRule parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BackendRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static BackendRule parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (BackendRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static BackendRule parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BackendRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static BackendRule parseFrom(InputStream inputStream) throws IOException {
        return (BackendRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static BackendRule parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BackendRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static BackendRule parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (BackendRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static BackendRule parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BackendRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<BackendRule> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setAddress(String string2) {
        if (string2 != null) {
            this.address_ = string2;
            return;
        }
        throw new NullPointerException();
    }

    private void setAddressBytes(ByteString byteString) {
        if (byteString != null) {
            BackendRule.checkByteStringIsUtf8((ByteString)byteString);
            this.address_ = byteString.toStringUtf8();
            return;
        }
        throw new NullPointerException();
    }

    private void setDeadline(double d) {
        this.deadline_ = d;
    }

    private void setSelector(String string2) {
        if (string2 != null) {
            this.selector_ = string2;
            return;
        }
        throw new NullPointerException();
    }

    private void setSelectorBytes(ByteString byteString) {
        if (byteString != null) {
            BackendRule.checkByteStringIsUtf8((ByteString)byteString);
            this.selector_ = byteString.toStringUtf8();
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
                Class<BackendRule> class_ = BackendRule.class;
                // MONITORENTER : com.google.api.BackendRule.class
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
                            if (n != 18) {
                                if (n != 25) {
                                    if (codedInputStream.skipField(n)) continue;
                                    bl = true;
                                    continue;
                                }
                                this.deadline_ = codedInputStream.readDouble();
                                continue;
                            }
                            this.address_ = codedInputStream.readStringRequireUtf8();
                            continue;
                        }
                        this.selector_ = codedInputStream.readStringRequireUtf8();
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
                BackendRule backendRule = (BackendRule)object2;
                this.selector_ = visitor.visitString(true ^ this.selector_.isEmpty(), this.selector_, true ^ backendRule.selector_.isEmpty(), backendRule.selector_);
                this.address_ = visitor.visitString(true ^ this.address_.isEmpty(), this.address_, true ^ backendRule.address_.isEmpty(), backendRule.address_);
                boolean bl = this.deadline_ != 0.0;
                double d = this.deadline_;
                boolean bl2 = backendRule.deadline_ != 0.0;
                double d2 = backendRule.deadline_;
                this.deadline_ = visitor.visitDouble(bl, d, bl2, d2);
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
        return new BackendRule();
    }

    @Override
    public String getAddress() {
        return this.address_;
    }

    @Override
    public ByteString getAddressBytes() {
        return ByteString.copyFromUtf8((String)this.address_);
    }

    @Override
    public double getDeadline() {
        return this.deadline_;
    }

    @Override
    public String getSelector() {
        return this.selector_;
    }

    @Override
    public ByteString getSelectorBytes() {
        return ByteString.copyFromUtf8((String)this.selector_);
    }

    public int getSerializedSize() {
        double d;
        int n = this.memoizedSerializedSize;
        if (n != -1) {
            return n;
        }
        boolean bl = this.selector_.isEmpty();
        int n2 = 0;
        if (!bl) {
            n2 = 0 + CodedOutputStream.computeStringSize((int)1, (String)this.getSelector());
        }
        if (!this.address_.isEmpty()) {
            n2 += CodedOutputStream.computeStringSize((int)2, (String)this.getAddress());
        }
        if ((d = this.deadline_) != 0.0) {
            n2 += CodedOutputStream.computeDoubleSize((int)3, (double)d);
        }
        this.memoizedSerializedSize = n2;
        return n2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        double d;
        if (!this.selector_.isEmpty()) {
            codedOutputStream.writeString(1, this.getSelector());
        }
        if (!this.address_.isEmpty()) {
            codedOutputStream.writeString(2, this.getAddress());
        }
        if ((d = this.deadline_) != 0.0) {
            codedOutputStream.writeDouble(3, d);
        }
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<BackendRule, Builder>
    implements BackendRuleOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder clearAddress() {
            this.copyOnWrite();
            ((BackendRule)this.instance).clearAddress();
            return this;
        }

        public Builder clearDeadline() {
            this.copyOnWrite();
            ((BackendRule)this.instance).clearDeadline();
            return this;
        }

        public Builder clearSelector() {
            this.copyOnWrite();
            ((BackendRule)this.instance).clearSelector();
            return this;
        }

        @Override
        public String getAddress() {
            return ((BackendRule)this.instance).getAddress();
        }

        @Override
        public ByteString getAddressBytes() {
            return ((BackendRule)this.instance).getAddressBytes();
        }

        @Override
        public double getDeadline() {
            return ((BackendRule)this.instance).getDeadline();
        }

        @Override
        public String getSelector() {
            return ((BackendRule)this.instance).getSelector();
        }

        @Override
        public ByteString getSelectorBytes() {
            return ((BackendRule)this.instance).getSelectorBytes();
        }

        public Builder setAddress(String string2) {
            this.copyOnWrite();
            ((BackendRule)this.instance).setAddress(string2);
            return this;
        }

        public Builder setAddressBytes(ByteString byteString) {
            this.copyOnWrite();
            ((BackendRule)this.instance).setAddressBytes(byteString);
            return this;
        }

        public Builder setDeadline(double d) {
            this.copyOnWrite();
            ((BackendRule)this.instance).setDeadline(d);
            return this;
        }

        public Builder setSelector(String string2) {
            this.copyOnWrite();
            ((BackendRule)this.instance).setSelector(string2);
            return this;
        }

        public Builder setSelectorBytes(ByteString byteString) {
            this.copyOnWrite();
            ((BackendRule)this.instance).setSelectorBytes(byteString);
            return this;
        }
    }

}

