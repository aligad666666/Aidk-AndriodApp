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

import com.google.api.UsageRuleOrBuilder;
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

public final class UsageRule
extends GeneratedMessageLite<UsageRule, Builder>
implements UsageRuleOrBuilder {
    public static final int ALLOW_UNREGISTERED_CALLS_FIELD_NUMBER = 2;
    private static final UsageRule DEFAULT_INSTANCE = new UsageRule();
    private static volatile Parser<UsageRule> PARSER;
    public static final int SELECTOR_FIELD_NUMBER = 1;
    public static final int SKIP_SERVICE_CONTROL_FIELD_NUMBER = 3;
    private boolean allowUnregisteredCalls_;
    private String selector_ = "";
    private boolean skipServiceControl_;

    static {
        DEFAULT_INSTANCE.makeImmutable();
    }

    private UsageRule() {
    }

    private void clearAllowUnregisteredCalls() {
        this.allowUnregisteredCalls_ = false;
    }

    private void clearSelector() {
        this.selector_ = UsageRule.getDefaultInstance().getSelector();
    }

    private void clearSkipServiceControl() {
        this.skipServiceControl_ = false;
    }

    public static UsageRule getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(UsageRule usageRule) {
        return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)usageRule);
    }

    public static UsageRule parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (UsageRule)UsageRule.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static UsageRule parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UsageRule)UsageRule.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static UsageRule parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (UsageRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static UsageRule parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UsageRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static UsageRule parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (UsageRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static UsageRule parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UsageRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static UsageRule parseFrom(InputStream inputStream) throws IOException {
        return (UsageRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static UsageRule parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (UsageRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static UsageRule parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (UsageRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static UsageRule parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (UsageRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<UsageRule> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setAllowUnregisteredCalls(boolean bl) {
        this.allowUnregisteredCalls_ = bl;
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
            UsageRule.checkByteStringIsUtf8((ByteString)byteString);
            this.selector_ = byteString.toStringUtf8();
            return;
        }
        throw new NullPointerException();
    }

    private void setSkipServiceControl(boolean bl) {
        this.skipServiceControl_ = bl;
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
                Class<UsageRule> class_ = UsageRule.class;
                // MONITORENTER : com.google.api.UsageRule.class
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
                                this.skipServiceControl_ = codedInputStream.readBool();
                                continue;
                            }
                            this.allowUnregisteredCalls_ = codedInputStream.readBool();
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
                UsageRule usageRule = (UsageRule)object2;
                this.selector_ = visitor.visitString(true ^ this.selector_.isEmpty(), this.selector_, true ^ usageRule.selector_.isEmpty(), usageRule.selector_);
                boolean bl = this.allowUnregisteredCalls_;
                boolean bl2 = usageRule.allowUnregisteredCalls_;
                this.allowUnregisteredCalls_ = visitor.visitBoolean(bl, bl, bl2, bl2);
                boolean bl3 = this.skipServiceControl_;
                boolean bl4 = usageRule.skipServiceControl_;
                this.skipServiceControl_ = visitor.visitBoolean(bl3, bl3, bl4, bl4);
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
        return new UsageRule();
    }

    @Override
    public boolean getAllowUnregisteredCalls() {
        return this.allowUnregisteredCalls_;
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
        boolean bl;
        boolean bl2;
        int n = this.memoizedSerializedSize;
        if (n != -1) {
            return n;
        }
        boolean bl3 = this.selector_.isEmpty();
        int n2 = 0;
        if (!bl3) {
            n2 = 0 + CodedOutputStream.computeStringSize((int)1, (String)this.getSelector());
        }
        if (bl2 = this.allowUnregisteredCalls_) {
            n2 += CodedOutputStream.computeBoolSize((int)2, (boolean)bl2);
        }
        if (bl = this.skipServiceControl_) {
            n2 += CodedOutputStream.computeBoolSize((int)3, (boolean)bl);
        }
        this.memoizedSerializedSize = n2;
        return n2;
    }

    @Override
    public boolean getSkipServiceControl() {
        return this.skipServiceControl_;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        boolean bl;
        boolean bl2;
        if (!this.selector_.isEmpty()) {
            codedOutputStream.writeString(1, this.getSelector());
        }
        if (bl = this.allowUnregisteredCalls_) {
            codedOutputStream.writeBool(2, bl);
        }
        if (bl2 = this.skipServiceControl_) {
            codedOutputStream.writeBool(3, bl2);
        }
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<UsageRule, Builder>
    implements UsageRuleOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder clearAllowUnregisteredCalls() {
            this.copyOnWrite();
            ((UsageRule)this.instance).clearAllowUnregisteredCalls();
            return this;
        }

        public Builder clearSelector() {
            this.copyOnWrite();
            ((UsageRule)this.instance).clearSelector();
            return this;
        }

        public Builder clearSkipServiceControl() {
            this.copyOnWrite();
            ((UsageRule)this.instance).clearSkipServiceControl();
            return this;
        }

        @Override
        public boolean getAllowUnregisteredCalls() {
            return ((UsageRule)this.instance).getAllowUnregisteredCalls();
        }

        @Override
        public String getSelector() {
            return ((UsageRule)this.instance).getSelector();
        }

        @Override
        public ByteString getSelectorBytes() {
            return ((UsageRule)this.instance).getSelectorBytes();
        }

        @Override
        public boolean getSkipServiceControl() {
            return ((UsageRule)this.instance).getSkipServiceControl();
        }

        public Builder setAllowUnregisteredCalls(boolean bl) {
            this.copyOnWrite();
            ((UsageRule)this.instance).setAllowUnregisteredCalls(bl);
            return this;
        }

        public Builder setSelector(String string2) {
            this.copyOnWrite();
            ((UsageRule)this.instance).setSelector(string2);
            return this;
        }

        public Builder setSelectorBytes(ByteString byteString) {
            this.copyOnWrite();
            ((UsageRule)this.instance).setSelectorBytes(byteString);
            return this;
        }

        public Builder setSkipServiceControl(boolean bl) {
            this.copyOnWrite();
            ((UsageRule)this.instance).setSkipServiceControl(bl);
            return this;
        }
    }

}

