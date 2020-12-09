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

import com.google.api.AuthProvider;
import com.google.api.AuthProviderOrBuilder;
import com.google.api.AuthenticationOrBuilder;
import com.google.api.AuthenticationRule;
import com.google.api.AuthenticationRuleOrBuilder;
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

public final class Authentication
extends GeneratedMessageLite<Authentication, Builder>
implements AuthenticationOrBuilder {
    private static final Authentication DEFAULT_INSTANCE = new Authentication();
    private static volatile Parser<Authentication> PARSER;
    public static final int PROVIDERS_FIELD_NUMBER = 4;
    public static final int RULES_FIELD_NUMBER = 3;
    private Internal.ProtobufList<AuthProvider> providers_ = Authentication.emptyProtobufList();
    private Internal.ProtobufList<AuthenticationRule> rules_ = Authentication.emptyProtobufList();

    static {
        DEFAULT_INSTANCE.makeImmutable();
    }

    private Authentication() {
    }

    private void addAllProviders(Iterable<? extends AuthProvider> iterable) {
        this.ensureProvidersIsMutable();
        AbstractMessageLite.addAll(iterable, this.providers_);
    }

    private void addAllRules(Iterable<? extends AuthenticationRule> iterable) {
        this.ensureRulesIsMutable();
        AbstractMessageLite.addAll(iterable, this.rules_);
    }

    private void addProviders(int n, AuthProvider.Builder builder) {
        this.ensureProvidersIsMutable();
        this.providers_.add(n, (Object)((AuthProvider)builder.build()));
    }

    private void addProviders(int n, AuthProvider authProvider) {
        if (authProvider != null) {
            this.ensureProvidersIsMutable();
            this.providers_.add(n, (Object)authProvider);
            return;
        }
        throw new NullPointerException();
    }

    private void addProviders(AuthProvider.Builder builder) {
        this.ensureProvidersIsMutable();
        this.providers_.add((Object)((AuthProvider)builder.build()));
    }

    private void addProviders(AuthProvider authProvider) {
        if (authProvider != null) {
            this.ensureProvidersIsMutable();
            this.providers_.add((Object)authProvider);
            return;
        }
        throw new NullPointerException();
    }

    private void addRules(int n, AuthenticationRule.Builder builder) {
        this.ensureRulesIsMutable();
        this.rules_.add(n, (Object)((AuthenticationRule)builder.build()));
    }

    private void addRules(int n, AuthenticationRule authenticationRule) {
        if (authenticationRule != null) {
            this.ensureRulesIsMutable();
            this.rules_.add(n, (Object)authenticationRule);
            return;
        }
        throw new NullPointerException();
    }

    private void addRules(AuthenticationRule.Builder builder) {
        this.ensureRulesIsMutable();
        this.rules_.add((Object)((AuthenticationRule)builder.build()));
    }

    private void addRules(AuthenticationRule authenticationRule) {
        if (authenticationRule != null) {
            this.ensureRulesIsMutable();
            this.rules_.add((Object)authenticationRule);
            return;
        }
        throw new NullPointerException();
    }

    private void clearProviders() {
        this.providers_ = Authentication.emptyProtobufList();
    }

    private void clearRules() {
        this.rules_ = Authentication.emptyProtobufList();
    }

    private void ensureProvidersIsMutable() {
        if (!this.providers_.isModifiable()) {
            this.providers_ = GeneratedMessageLite.mutableCopy(this.providers_);
        }
    }

    private void ensureRulesIsMutable() {
        if (!this.rules_.isModifiable()) {
            this.rules_ = GeneratedMessageLite.mutableCopy(this.rules_);
        }
    }

    public static Authentication getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(Authentication authentication) {
        return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)authentication);
    }

    public static Authentication parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Authentication)Authentication.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Authentication parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Authentication)Authentication.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Authentication parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Authentication)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static Authentication parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Authentication)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Authentication parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Authentication)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static Authentication parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Authentication)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Authentication parseFrom(InputStream inputStream) throws IOException {
        return (Authentication)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Authentication parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Authentication)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Authentication parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (Authentication)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static Authentication parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Authentication)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<Authentication> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeProviders(int n) {
        this.ensureProvidersIsMutable();
        this.providers_.remove(n);
    }

    private void removeRules(int n) {
        this.ensureRulesIsMutable();
        this.rules_.remove(n);
    }

    private void setProviders(int n, AuthProvider.Builder builder) {
        this.ensureProvidersIsMutable();
        this.providers_.set(n, (Object)((AuthProvider)builder.build()));
    }

    private void setProviders(int n, AuthProvider authProvider) {
        if (authProvider != null) {
            this.ensureProvidersIsMutable();
            this.providers_.set(n, (Object)authProvider);
            return;
        }
        throw new NullPointerException();
    }

    private void setRules(int n, AuthenticationRule.Builder builder) {
        this.ensureRulesIsMutable();
        this.rules_.set(n, (Object)((AuthenticationRule)builder.build()));
    }

    private void setRules(int n, AuthenticationRule authenticationRule) {
        if (authenticationRule != null) {
            this.ensureRulesIsMutable();
            this.rules_.set(n, (Object)authenticationRule);
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
                Class<Authentication> class_ = Authentication.class;
                // MONITORENTER : com.google.api.Authentication.class
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
                        if (n != 26) {
                            if (n != 34) {
                                if (codedInputStream.skipField(n)) continue;
                                bl = true;
                                continue;
                            }
                            if (!this.providers_.isModifiable()) {
                                this.providers_ = GeneratedMessageLite.mutableCopy(this.providers_);
                            }
                            this.providers_.add((Object)((AuthProvider)codedInputStream.readMessage(AuthProvider.parser(), extensionRegistryLite)));
                            continue;
                        }
                        if (!this.rules_.isModifiable()) {
                            this.rules_ = GeneratedMessageLite.mutableCopy(this.rules_);
                        }
                        this.rules_.add((Object)((AuthenticationRule)codedInputStream.readMessage(AuthenticationRule.parser(), extensionRegistryLite)));
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
                Authentication authentication = (Authentication)object2;
                this.rules_ = visitor.visitList(this.rules_, authentication.rules_);
                this.providers_ = visitor.visitList(this.providers_, authentication.providers_);
                return this;
            }
            case 4: {
                return new Builder();
            }
            case 3: {
                this.rules_.makeImmutable();
                this.providers_.makeImmutable();
                return null;
            }
            case 2: {
                return DEFAULT_INSTANCE;
            }
            case 1: 
        }
        return new Authentication();
    }

    @Override
    public AuthProvider getProviders(int n) {
        return (AuthProvider)this.providers_.get(n);
    }

    @Override
    public int getProvidersCount() {
        return this.providers_.size();
    }

    @Override
    public List<AuthProvider> getProvidersList() {
        return this.providers_;
    }

    public AuthProviderOrBuilder getProvidersOrBuilder(int n) {
        return (AuthProviderOrBuilder)this.providers_.get(n);
    }

    public List<? extends AuthProviderOrBuilder> getProvidersOrBuilderList() {
        return this.providers_;
    }

    @Override
    public AuthenticationRule getRules(int n) {
        return (AuthenticationRule)this.rules_.get(n);
    }

    @Override
    public int getRulesCount() {
        return this.rules_.size();
    }

    @Override
    public List<AuthenticationRule> getRulesList() {
        return this.rules_;
    }

    public AuthenticationRuleOrBuilder getRulesOrBuilder(int n) {
        return (AuthenticationRuleOrBuilder)this.rules_.get(n);
    }

    public List<? extends AuthenticationRuleOrBuilder> getRulesOrBuilderList() {
        return this.rules_;
    }

    public int getSerializedSize() {
        int n = this.memoizedSerializedSize;
        if (n != -1) {
            return n;
        }
        int n2 = 0;
        for (int i = 0; i < this.rules_.size(); ++i) {
            n2 += CodedOutputStream.computeMessageSize((int)3, (MessageLite)((MessageLite)this.rules_.get(i)));
        }
        for (int i = 0; i < this.providers_.size(); ++i) {
            n2 += CodedOutputStream.computeMessageSize((int)4, (MessageLite)((MessageLite)this.providers_.get(i)));
        }
        this.memoizedSerializedSize = n2;
        return n2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.rules_.size(); ++i) {
            codedOutputStream.writeMessage(3, (MessageLite)this.rules_.get(i));
        }
        for (int i = 0; i < this.providers_.size(); ++i) {
            codedOutputStream.writeMessage(4, (MessageLite)this.providers_.get(i));
        }
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<Authentication, Builder>
    implements AuthenticationOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder addAllProviders(Iterable<? extends AuthProvider> iterable) {
            this.copyOnWrite();
            ((Authentication)this.instance).addAllProviders((Iterable<? extends AuthProvider>)iterable);
            return this;
        }

        public Builder addAllRules(Iterable<? extends AuthenticationRule> iterable) {
            this.copyOnWrite();
            ((Authentication)this.instance).addAllRules((Iterable<? extends AuthenticationRule>)iterable);
            return this;
        }

        public Builder addProviders(int n, AuthProvider.Builder builder) {
            this.copyOnWrite();
            ((Authentication)this.instance).addProviders(n, builder);
            return this;
        }

        public Builder addProviders(int n, AuthProvider authProvider) {
            this.copyOnWrite();
            ((Authentication)this.instance).addProviders(n, authProvider);
            return this;
        }

        public Builder addProviders(AuthProvider.Builder builder) {
            this.copyOnWrite();
            ((Authentication)this.instance).addProviders(builder);
            return this;
        }

        public Builder addProviders(AuthProvider authProvider) {
            this.copyOnWrite();
            ((Authentication)this.instance).addProviders(authProvider);
            return this;
        }

        public Builder addRules(int n, AuthenticationRule.Builder builder) {
            this.copyOnWrite();
            ((Authentication)this.instance).addRules(n, builder);
            return this;
        }

        public Builder addRules(int n, AuthenticationRule authenticationRule) {
            this.copyOnWrite();
            ((Authentication)this.instance).addRules(n, authenticationRule);
            return this;
        }

        public Builder addRules(AuthenticationRule.Builder builder) {
            this.copyOnWrite();
            ((Authentication)this.instance).addRules(builder);
            return this;
        }

        public Builder addRules(AuthenticationRule authenticationRule) {
            this.copyOnWrite();
            ((Authentication)this.instance).addRules(authenticationRule);
            return this;
        }

        public Builder clearProviders() {
            this.copyOnWrite();
            ((Authentication)this.instance).clearProviders();
            return this;
        }

        public Builder clearRules() {
            this.copyOnWrite();
            ((Authentication)this.instance).clearRules();
            return this;
        }

        @Override
        public AuthProvider getProviders(int n) {
            return ((Authentication)this.instance).getProviders(n);
        }

        @Override
        public int getProvidersCount() {
            return ((Authentication)this.instance).getProvidersCount();
        }

        @Override
        public List<AuthProvider> getProvidersList() {
            return Collections.unmodifiableList(((Authentication)this.instance).getProvidersList());
        }

        @Override
        public AuthenticationRule getRules(int n) {
            return ((Authentication)this.instance).getRules(n);
        }

        @Override
        public int getRulesCount() {
            return ((Authentication)this.instance).getRulesCount();
        }

        @Override
        public List<AuthenticationRule> getRulesList() {
            return Collections.unmodifiableList(((Authentication)this.instance).getRulesList());
        }

        public Builder removeProviders(int n) {
            this.copyOnWrite();
            ((Authentication)this.instance).removeProviders(n);
            return this;
        }

        public Builder removeRules(int n) {
            this.copyOnWrite();
            ((Authentication)this.instance).removeRules(n);
            return this;
        }

        public Builder setProviders(int n, AuthProvider.Builder builder) {
            this.copyOnWrite();
            ((Authentication)this.instance).setProviders(n, builder);
            return this;
        }

        public Builder setProviders(int n, AuthProvider authProvider) {
            this.copyOnWrite();
            ((Authentication)this.instance).setProviders(n, authProvider);
            return this;
        }

        public Builder setRules(int n, AuthenticationRule.Builder builder) {
            this.copyOnWrite();
            ((Authentication)this.instance).setRules(n, builder);
            return this;
        }

        public Builder setRules(int n, AuthenticationRule authenticationRule) {
            this.copyOnWrite();
            ((Authentication)this.instance).setRules(n, authenticationRule);
            return this;
        }
    }

}

