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

import com.google.api.SystemParameterRule;
import com.google.api.SystemParameterRuleOrBuilder;
import com.google.api.SystemParametersOrBuilder;
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

public final class SystemParameters
extends GeneratedMessageLite<SystemParameters, Builder>
implements SystemParametersOrBuilder {
    private static final SystemParameters DEFAULT_INSTANCE = new SystemParameters();
    private static volatile Parser<SystemParameters> PARSER;
    public static final int RULES_FIELD_NUMBER = 1;
    private Internal.ProtobufList<SystemParameterRule> rules_ = SystemParameters.emptyProtobufList();

    static {
        DEFAULT_INSTANCE.makeImmutable();
    }

    private SystemParameters() {
    }

    private void addAllRules(Iterable<? extends SystemParameterRule> iterable) {
        this.ensureRulesIsMutable();
        AbstractMessageLite.addAll(iterable, this.rules_);
    }

    private void addRules(int n, SystemParameterRule.Builder builder) {
        this.ensureRulesIsMutable();
        this.rules_.add(n, (Object)((SystemParameterRule)builder.build()));
    }

    private void addRules(int n, SystemParameterRule systemParameterRule) {
        if (systemParameterRule != null) {
            this.ensureRulesIsMutable();
            this.rules_.add(n, (Object)systemParameterRule);
            return;
        }
        throw new NullPointerException();
    }

    private void addRules(SystemParameterRule.Builder builder) {
        this.ensureRulesIsMutable();
        this.rules_.add((Object)((SystemParameterRule)builder.build()));
    }

    private void addRules(SystemParameterRule systemParameterRule) {
        if (systemParameterRule != null) {
            this.ensureRulesIsMutable();
            this.rules_.add((Object)systemParameterRule);
            return;
        }
        throw new NullPointerException();
    }

    private void clearRules() {
        this.rules_ = SystemParameters.emptyProtobufList();
    }

    private void ensureRulesIsMutable() {
        if (!this.rules_.isModifiable()) {
            this.rules_ = GeneratedMessageLite.mutableCopy(this.rules_);
        }
    }

    public static SystemParameters getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(SystemParameters systemParameters) {
        return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)systemParameters);
    }

    public static SystemParameters parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SystemParameters)SystemParameters.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static SystemParameters parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SystemParameters)SystemParameters.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static SystemParameters parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (SystemParameters)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static SystemParameters parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SystemParameters)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static SystemParameters parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (SystemParameters)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static SystemParameters parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SystemParameters)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static SystemParameters parseFrom(InputStream inputStream) throws IOException {
        return (SystemParameters)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static SystemParameters parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SystemParameters)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static SystemParameters parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (SystemParameters)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static SystemParameters parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SystemParameters)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<SystemParameters> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeRules(int n) {
        this.ensureRulesIsMutable();
        this.rules_.remove(n);
    }

    private void setRules(int n, SystemParameterRule.Builder builder) {
        this.ensureRulesIsMutable();
        this.rules_.set(n, (Object)((SystemParameterRule)builder.build()));
    }

    private void setRules(int n, SystemParameterRule systemParameterRule) {
        if (systemParameterRule != null) {
            this.ensureRulesIsMutable();
            this.rules_.set(n, (Object)systemParameterRule);
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
                Class<SystemParameters> class_ = SystemParameters.class;
                // MONITORENTER : com.google.api.SystemParameters.class
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
                            if (codedInputStream.skipField(n)) continue;
                            bl = true;
                            continue;
                        }
                        if (!this.rules_.isModifiable()) {
                            this.rules_ = GeneratedMessageLite.mutableCopy(this.rules_);
                        }
                        this.rules_.add((Object)((SystemParameterRule)codedInputStream.readMessage(SystemParameterRule.parser(), extensionRegistryLite)));
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
                SystemParameters systemParameters = (SystemParameters)object2;
                this.rules_ = visitor.visitList(this.rules_, systemParameters.rules_);
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
        return new SystemParameters();
    }

    @Override
    public SystemParameterRule getRules(int n) {
        return (SystemParameterRule)this.rules_.get(n);
    }

    @Override
    public int getRulesCount() {
        return this.rules_.size();
    }

    @Override
    public List<SystemParameterRule> getRulesList() {
        return this.rules_;
    }

    public SystemParameterRuleOrBuilder getRulesOrBuilder(int n) {
        return (SystemParameterRuleOrBuilder)this.rules_.get(n);
    }

    public List<? extends SystemParameterRuleOrBuilder> getRulesOrBuilderList() {
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
        this.memoizedSerializedSize = n2;
        return n2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.rules_.size(); ++i) {
            codedOutputStream.writeMessage(1, (MessageLite)this.rules_.get(i));
        }
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<SystemParameters, Builder>
    implements SystemParametersOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder addAllRules(Iterable<? extends SystemParameterRule> iterable) {
            this.copyOnWrite();
            ((SystemParameters)this.instance).addAllRules((Iterable<? extends SystemParameterRule>)iterable);
            return this;
        }

        public Builder addRules(int n, SystemParameterRule.Builder builder) {
            this.copyOnWrite();
            ((SystemParameters)this.instance).addRules(n, builder);
            return this;
        }

        public Builder addRules(int n, SystemParameterRule systemParameterRule) {
            this.copyOnWrite();
            ((SystemParameters)this.instance).addRules(n, systemParameterRule);
            return this;
        }

        public Builder addRules(SystemParameterRule.Builder builder) {
            this.copyOnWrite();
            ((SystemParameters)this.instance).addRules(builder);
            return this;
        }

        public Builder addRules(SystemParameterRule systemParameterRule) {
            this.copyOnWrite();
            ((SystemParameters)this.instance).addRules(systemParameterRule);
            return this;
        }

        public Builder clearRules() {
            this.copyOnWrite();
            ((SystemParameters)this.instance).clearRules();
            return this;
        }

        @Override
        public SystemParameterRule getRules(int n) {
            return ((SystemParameters)this.instance).getRules(n);
        }

        @Override
        public int getRulesCount() {
            return ((SystemParameters)this.instance).getRulesCount();
        }

        @Override
        public List<SystemParameterRule> getRulesList() {
            return Collections.unmodifiableList(((SystemParameters)this.instance).getRulesList());
        }

        public Builder removeRules(int n) {
            this.copyOnWrite();
            ((SystemParameters)this.instance).removeRules(n);
            return this;
        }

        public Builder setRules(int n, SystemParameterRule.Builder builder) {
            this.copyOnWrite();
            ((SystemParameters)this.instance).setRules(n, builder);
            return this;
        }

        public Builder setRules(int n, SystemParameterRule systemParameterRule) {
            this.copyOnWrite();
            ((SystemParameters)this.instance).setRules(n, systemParameterRule);
            return this;
        }
    }

}

