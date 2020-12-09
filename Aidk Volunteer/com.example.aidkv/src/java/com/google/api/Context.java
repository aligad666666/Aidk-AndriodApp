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

import com.google.api.ContextOrBuilder;
import com.google.api.ContextRule;
import com.google.api.ContextRuleOrBuilder;
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

public final class Context
extends GeneratedMessageLite<Context, Builder>
implements ContextOrBuilder {
    private static final Context DEFAULT_INSTANCE = new Context();
    private static volatile Parser<Context> PARSER;
    public static final int RULES_FIELD_NUMBER = 1;
    private Internal.ProtobufList<ContextRule> rules_ = Context.emptyProtobufList();

    static {
        DEFAULT_INSTANCE.makeImmutable();
    }

    private Context() {
    }

    private void addAllRules(Iterable<? extends ContextRule> iterable) {
        this.ensureRulesIsMutable();
        AbstractMessageLite.addAll(iterable, this.rules_);
    }

    private void addRules(int n, ContextRule.Builder builder) {
        this.ensureRulesIsMutable();
        this.rules_.add(n, (Object)((ContextRule)builder.build()));
    }

    private void addRules(int n, ContextRule contextRule) {
        if (contextRule != null) {
            this.ensureRulesIsMutable();
            this.rules_.add(n, (Object)contextRule);
            return;
        }
        throw new NullPointerException();
    }

    private void addRules(ContextRule.Builder builder) {
        this.ensureRulesIsMutable();
        this.rules_.add((Object)((ContextRule)builder.build()));
    }

    private void addRules(ContextRule contextRule) {
        if (contextRule != null) {
            this.ensureRulesIsMutable();
            this.rules_.add((Object)contextRule);
            return;
        }
        throw new NullPointerException();
    }

    private void clearRules() {
        this.rules_ = Context.emptyProtobufList();
    }

    private void ensureRulesIsMutable() {
        if (!this.rules_.isModifiable()) {
            this.rules_ = GeneratedMessageLite.mutableCopy(this.rules_);
        }
    }

    public static Context getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(Context context) {
        return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)context);
    }

    public static Context parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Context)Context.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Context parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Context)Context.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Context parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Context)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static Context parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Context)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Context parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Context)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static Context parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Context)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Context parseFrom(InputStream inputStream) throws IOException {
        return (Context)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Context parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Context)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Context parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (Context)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static Context parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Context)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<Context> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeRules(int n) {
        this.ensureRulesIsMutable();
        this.rules_.remove(n);
    }

    private void setRules(int n, ContextRule.Builder builder) {
        this.ensureRulesIsMutable();
        this.rules_.set(n, (Object)((ContextRule)builder.build()));
    }

    private void setRules(int n, ContextRule contextRule) {
        if (contextRule != null) {
            this.ensureRulesIsMutable();
            this.rules_.set(n, (Object)contextRule);
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
                Class<Context> class_ = Context.class;
                // MONITORENTER : com.google.api.Context.class
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
                        this.rules_.add((Object)((ContextRule)codedInputStream.readMessage(ContextRule.parser(), extensionRegistryLite)));
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
                Context context = (Context)object2;
                this.rules_ = visitor.visitList(this.rules_, context.rules_);
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
        return new Context();
    }

    @Override
    public ContextRule getRules(int n) {
        return (ContextRule)this.rules_.get(n);
    }

    @Override
    public int getRulesCount() {
        return this.rules_.size();
    }

    @Override
    public List<ContextRule> getRulesList() {
        return this.rules_;
    }

    public ContextRuleOrBuilder getRulesOrBuilder(int n) {
        return (ContextRuleOrBuilder)this.rules_.get(n);
    }

    public List<? extends ContextRuleOrBuilder> getRulesOrBuilderList() {
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
    extends GeneratedMessageLite.Builder<Context, Builder>
    implements ContextOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder addAllRules(Iterable<? extends ContextRule> iterable) {
            this.copyOnWrite();
            ((Context)this.instance).addAllRules((Iterable<? extends ContextRule>)iterable);
            return this;
        }

        public Builder addRules(int n, ContextRule.Builder builder) {
            this.copyOnWrite();
            ((Context)this.instance).addRules(n, builder);
            return this;
        }

        public Builder addRules(int n, ContextRule contextRule) {
            this.copyOnWrite();
            ((Context)this.instance).addRules(n, contextRule);
            return this;
        }

        public Builder addRules(ContextRule.Builder builder) {
            this.copyOnWrite();
            ((Context)this.instance).addRules(builder);
            return this;
        }

        public Builder addRules(ContextRule contextRule) {
            this.copyOnWrite();
            ((Context)this.instance).addRules(contextRule);
            return this;
        }

        public Builder clearRules() {
            this.copyOnWrite();
            ((Context)this.instance).clearRules();
            return this;
        }

        @Override
        public ContextRule getRules(int n) {
            return ((Context)this.instance).getRules(n);
        }

        @Override
        public int getRulesCount() {
            return ((Context)this.instance).getRulesCount();
        }

        @Override
        public List<ContextRule> getRulesList() {
            return Collections.unmodifiableList(((Context)this.instance).getRulesList());
        }

        public Builder removeRules(int n) {
            this.copyOnWrite();
            ((Context)this.instance).removeRules(n);
            return this;
        }

        public Builder setRules(int n, ContextRule.Builder builder) {
            this.copyOnWrite();
            ((Context)this.instance).setRules(n, builder);
            return this;
        }

        public Builder setRules(int n, ContextRule contextRule) {
            this.copyOnWrite();
            ((Context)this.instance).setRules(n, contextRule);
            return this;
        }
    }

}

