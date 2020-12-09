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

import com.google.api.BackendOrBuilder;
import com.google.api.BackendRule;
import com.google.api.BackendRuleOrBuilder;
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

public final class Backend
extends GeneratedMessageLite<Backend, Builder>
implements BackendOrBuilder {
    private static final Backend DEFAULT_INSTANCE = new Backend();
    private static volatile Parser<Backend> PARSER;
    public static final int RULES_FIELD_NUMBER = 1;
    private Internal.ProtobufList<BackendRule> rules_ = Backend.emptyProtobufList();

    static {
        DEFAULT_INSTANCE.makeImmutable();
    }

    private Backend() {
    }

    private void addAllRules(Iterable<? extends BackendRule> iterable) {
        this.ensureRulesIsMutable();
        AbstractMessageLite.addAll(iterable, this.rules_);
    }

    private void addRules(int n, BackendRule.Builder builder) {
        this.ensureRulesIsMutable();
        this.rules_.add(n, (Object)((BackendRule)builder.build()));
    }

    private void addRules(int n, BackendRule backendRule) {
        if (backendRule != null) {
            this.ensureRulesIsMutable();
            this.rules_.add(n, (Object)backendRule);
            return;
        }
        throw new NullPointerException();
    }

    private void addRules(BackendRule.Builder builder) {
        this.ensureRulesIsMutable();
        this.rules_.add((Object)((BackendRule)builder.build()));
    }

    private void addRules(BackendRule backendRule) {
        if (backendRule != null) {
            this.ensureRulesIsMutable();
            this.rules_.add((Object)backendRule);
            return;
        }
        throw new NullPointerException();
    }

    private void clearRules() {
        this.rules_ = Backend.emptyProtobufList();
    }

    private void ensureRulesIsMutable() {
        if (!this.rules_.isModifiable()) {
            this.rules_ = GeneratedMessageLite.mutableCopy(this.rules_);
        }
    }

    public static Backend getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(Backend backend) {
        return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)backend);
    }

    public static Backend parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Backend)Backend.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Backend parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Backend)Backend.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Backend parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Backend)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static Backend parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Backend)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Backend parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Backend)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static Backend parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Backend)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Backend parseFrom(InputStream inputStream) throws IOException {
        return (Backend)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Backend parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Backend)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Backend parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (Backend)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static Backend parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Backend)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<Backend> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeRules(int n) {
        this.ensureRulesIsMutable();
        this.rules_.remove(n);
    }

    private void setRules(int n, BackendRule.Builder builder) {
        this.ensureRulesIsMutable();
        this.rules_.set(n, (Object)((BackendRule)builder.build()));
    }

    private void setRules(int n, BackendRule backendRule) {
        if (backendRule != null) {
            this.ensureRulesIsMutable();
            this.rules_.set(n, (Object)backendRule);
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
                Class<Backend> class_ = Backend.class;
                // MONITORENTER : com.google.api.Backend.class
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
                        this.rules_.add((Object)((BackendRule)codedInputStream.readMessage(BackendRule.parser(), extensionRegistryLite)));
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
                Backend backend = (Backend)object2;
                this.rules_ = visitor.visitList(this.rules_, backend.rules_);
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
        return new Backend();
    }

    @Override
    public BackendRule getRules(int n) {
        return (BackendRule)this.rules_.get(n);
    }

    @Override
    public int getRulesCount() {
        return this.rules_.size();
    }

    @Override
    public List<BackendRule> getRulesList() {
        return this.rules_;
    }

    public BackendRuleOrBuilder getRulesOrBuilder(int n) {
        return (BackendRuleOrBuilder)this.rules_.get(n);
    }

    public List<? extends BackendRuleOrBuilder> getRulesOrBuilderList() {
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
    extends GeneratedMessageLite.Builder<Backend, Builder>
    implements BackendOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder addAllRules(Iterable<? extends BackendRule> iterable) {
            this.copyOnWrite();
            ((Backend)this.instance).addAllRules((Iterable<? extends BackendRule>)iterable);
            return this;
        }

        public Builder addRules(int n, BackendRule.Builder builder) {
            this.copyOnWrite();
            ((Backend)this.instance).addRules(n, builder);
            return this;
        }

        public Builder addRules(int n, BackendRule backendRule) {
            this.copyOnWrite();
            ((Backend)this.instance).addRules(n, backendRule);
            return this;
        }

        public Builder addRules(BackendRule.Builder builder) {
            this.copyOnWrite();
            ((Backend)this.instance).addRules(builder);
            return this;
        }

        public Builder addRules(BackendRule backendRule) {
            this.copyOnWrite();
            ((Backend)this.instance).addRules(backendRule);
            return this;
        }

        public Builder clearRules() {
            this.copyOnWrite();
            ((Backend)this.instance).clearRules();
            return this;
        }

        @Override
        public BackendRule getRules(int n) {
            return ((Backend)this.instance).getRules(n);
        }

        @Override
        public int getRulesCount() {
            return ((Backend)this.instance).getRulesCount();
        }

        @Override
        public List<BackendRule> getRulesList() {
            return Collections.unmodifiableList(((Backend)this.instance).getRulesList());
        }

        public Builder removeRules(int n) {
            this.copyOnWrite();
            ((Backend)this.instance).removeRules(n);
            return this;
        }

        public Builder setRules(int n, BackendRule.Builder builder) {
            this.copyOnWrite();
            ((Backend)this.instance).setRules(n, builder);
            return this;
        }

        public Builder setRules(int n, BackendRule backendRule) {
            this.copyOnWrite();
            ((Backend)this.instance).setRules(n, backendRule);
            return this;
        }
    }

}

