/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessageLite
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.CodedOutputStream
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageLite
 *  com.google.protobuf.GeneratedMessageLite$Builder
 *  com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser
 *  com.google.protobuf.GeneratedMessageLite$MergeFromVisitor
 *  com.google.protobuf.GeneratedMessageLite$MethodToInvoke
 *  com.google.protobuf.GeneratedMessageLite$Visitor
 *  com.google.protobuf.Internal
 *  com.google.protobuf.Internal$ProtobufList
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.Parser
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.Class
 *  java.lang.Iterable
 *  java.lang.NoSuchFieldError
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.UnsupportedOperationException
 *  java.util.Collections
 *  java.util.List
 */
package com.google.api;

import com.google.api.HttpOrBuilder;
import com.google.api.HttpRule;
import com.google.api.HttpRuleOrBuilder;
import com.google.protobuf.AbstractMessageLite;
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
import java.util.Collections;
import java.util.List;

public final class Http
extends GeneratedMessageLite<Http, Builder>
implements HttpOrBuilder {
    private static final Http DEFAULT_INSTANCE = new Http();
    public static final int FULLY_DECODE_RESERVED_EXPANSION_FIELD_NUMBER = 2;
    private static volatile Parser<Http> PARSER;
    public static final int RULES_FIELD_NUMBER = 1;
    private int bitField0_;
    private boolean fullyDecodeReservedExpansion_;
    private Internal.ProtobufList<HttpRule> rules_ = Http.emptyProtobufList();

    static {
        DEFAULT_INSTANCE.makeImmutable();
    }

    private Http() {
    }

    private void addAllRules(Iterable<? extends HttpRule> iterable) {
        this.ensureRulesIsMutable();
        AbstractMessageLite.addAll(iterable, this.rules_);
    }

    private void addRules(int n, HttpRule.Builder builder) {
        this.ensureRulesIsMutable();
        this.rules_.add(n, (Object)((HttpRule)builder.build()));
    }

    private void addRules(int n, HttpRule httpRule) {
        if (httpRule != null) {
            this.ensureRulesIsMutable();
            this.rules_.add(n, (Object)httpRule);
            return;
        }
        throw new NullPointerException();
    }

    private void addRules(HttpRule.Builder builder) {
        this.ensureRulesIsMutable();
        this.rules_.add((Object)((HttpRule)builder.build()));
    }

    private void addRules(HttpRule httpRule) {
        if (httpRule != null) {
            this.ensureRulesIsMutable();
            this.rules_.add((Object)httpRule);
            return;
        }
        throw new NullPointerException();
    }

    private void clearFullyDecodeReservedExpansion() {
        this.fullyDecodeReservedExpansion_ = false;
    }

    private void clearRules() {
        this.rules_ = Http.emptyProtobufList();
    }

    private void ensureRulesIsMutable() {
        if (!this.rules_.isModifiable()) {
            this.rules_ = GeneratedMessageLite.mutableCopy(this.rules_);
        }
    }

    public static Http getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(Http http) {
        return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)http);
    }

    public static Http parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Http)Http.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Http parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Http)Http.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Http parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Http)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static Http parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Http)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Http parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Http)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static Http parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Http)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Http parseFrom(InputStream inputStream) throws IOException {
        return (Http)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Http parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Http)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Http parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (Http)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static Http parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Http)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<Http> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeRules(int n) {
        this.ensureRulesIsMutable();
        this.rules_.remove(n);
    }

    private void setFullyDecodeReservedExpansion(boolean bl) {
        this.fullyDecodeReservedExpansion_ = bl;
    }

    private void setRules(int n, HttpRule.Builder builder) {
        this.ensureRulesIsMutable();
        this.rules_.set(n, (Object)((HttpRule)builder.build()));
    }

    private void setRules(int n, HttpRule httpRule) {
        if (httpRule != null) {
            this.ensureRulesIsMutable();
            this.rules_.set(n, (Object)httpRule);
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
                Class<Http> class_ = Http.class;
                // MONITORENTER : com.google.api.Http.class
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
                        if (n != 10) {
                            if (n != 16) {
                                if (codedInputStream.skipField(n)) continue;
                                bl = true;
                                continue;
                            }
                            this.fullyDecodeReservedExpansion_ = codedInputStream.readBool();
                            continue;
                        }
                        if (!this.rules_.isModifiable()) {
                            this.rules_ = GeneratedMessageLite.mutableCopy(this.rules_);
                        }
                        this.rules_.add((Object)((HttpRule)codedInputStream.readMessage(HttpRule.parser(), extensionRegistryLite)));
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
                Http http = (Http)object2;
                this.rules_ = visitor.visitList(this.rules_, http.rules_);
                boolean bl = this.fullyDecodeReservedExpansion_;
                boolean bl2 = http.fullyDecodeReservedExpansion_;
                this.fullyDecodeReservedExpansion_ = visitor.visitBoolean(bl, bl, bl2, bl2);
                if (visitor != GeneratedMessageLite.MergeFromVisitor.INSTANCE) return this;
                this.bitField0_ |= http.bitField0_;
                return this;
            }
            case 4: {
                return new Builder();
            }
            case 3: {
                this.rules_.makeImmutable();
                return null;
            }
            case 2: {
                return DEFAULT_INSTANCE;
            }
            case 1: 
        }
        return new Http();
    }

    @Override
    public boolean getFullyDecodeReservedExpansion() {
        return this.fullyDecodeReservedExpansion_;
    }

    @Override
    public HttpRule getRules(int n) {
        return (HttpRule)this.rules_.get(n);
    }

    @Override
    public int getRulesCount() {
        return this.rules_.size();
    }

    @Override
    public List<HttpRule> getRulesList() {
        return this.rules_;
    }

    public HttpRuleOrBuilder getRulesOrBuilder(int n) {
        return (HttpRuleOrBuilder)this.rules_.get(n);
    }

    public List<? extends HttpRuleOrBuilder> getRulesOrBuilderList() {
        return this.rules_;
    }

    public int getSerializedSize() {
        int n = this.memoizedSerializedSize;
        if (n != -1) {
            return n;
        }
        int n2 = 0;
        for (int i = 0; i < this.rules_.size(); ++i) {
            n2 += CodedOutputStream.computeMessageSize((int)1, (MessageLite)((MessageLite)this.rules_.get(i)));
        }
        boolean bl = this.fullyDecodeReservedExpansion_;
        if (bl) {
            n2 += CodedOutputStream.computeBoolSize((int)2, (boolean)bl);
        }
        this.memoizedSerializedSize = n2;
        return n2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.rules_.size(); ++i) {
            codedOutputStream.writeMessage(1, (MessageLite)this.rules_.get(i));
        }
        boolean bl = this.fullyDecodeReservedExpansion_;
        if (bl) {
            codedOutputStream.writeBool(2, bl);
        }
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<Http, Builder>
    implements HttpOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder addAllRules(Iterable<? extends HttpRule> iterable) {
            this.copyOnWrite();
            ((Http)this.instance).addAllRules((Iterable<? extends HttpRule>)iterable);
            return this;
        }

        public Builder addRules(int n, HttpRule.Builder builder) {
            this.copyOnWrite();
            ((Http)this.instance).addRules(n, builder);
            return this;
        }

        public Builder addRules(int n, HttpRule httpRule) {
            this.copyOnWrite();
            ((Http)this.instance).addRules(n, httpRule);
            return this;
        }

        public Builder addRules(HttpRule.Builder builder) {
            this.copyOnWrite();
            ((Http)this.instance).addRules(builder);
            return this;
        }

        public Builder addRules(HttpRule httpRule) {
            this.copyOnWrite();
            ((Http)this.instance).addRules(httpRule);
            return this;
        }

        public Builder clearFullyDecodeReservedExpansion() {
            this.copyOnWrite();
            ((Http)this.instance).clearFullyDecodeReservedExpansion();
            return this;
        }

        public Builder clearRules() {
            this.copyOnWrite();
            ((Http)this.instance).clearRules();
            return this;
        }

        @Override
        public boolean getFullyDecodeReservedExpansion() {
            return ((Http)this.instance).getFullyDecodeReservedExpansion();
        }

        @Override
        public HttpRule getRules(int n) {
            return ((Http)this.instance).getRules(n);
        }

        @Override
        public int getRulesCount() {
            return ((Http)this.instance).getRulesCount();
        }

        @Override
        public List<HttpRule> getRulesList() {
            return Collections.unmodifiableList(((Http)this.instance).getRulesList());
        }

        public Builder removeRules(int n) {
            this.copyOnWrite();
            ((Http)this.instance).removeRules(n);
            return this;
        }

        public Builder setFullyDecodeReservedExpansion(boolean bl) {
            this.copyOnWrite();
            ((Http)this.instance).setFullyDecodeReservedExpansion(bl);
            return this;
        }

        public Builder setRules(int n, HttpRule.Builder builder) {
            this.copyOnWrite();
            ((Http)this.instance).setRules(n, builder);
            return this;
        }

        public Builder setRules(int n, HttpRule httpRule) {
            this.copyOnWrite();
            ((Http)this.instance).setRules(n, httpRule);
            return this;
        }
    }

}

