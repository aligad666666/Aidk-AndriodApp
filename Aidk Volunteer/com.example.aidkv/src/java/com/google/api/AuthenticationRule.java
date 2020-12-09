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

import com.google.api.AuthRequirement;
import com.google.api.AuthRequirementOrBuilder;
import com.google.api.AuthenticationRuleOrBuilder;
import com.google.api.OAuthRequirements;
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

public final class AuthenticationRule
extends GeneratedMessageLite<AuthenticationRule, Builder>
implements AuthenticationRuleOrBuilder {
    public static final int ALLOW_WITHOUT_CREDENTIAL_FIELD_NUMBER = 5;
    private static final AuthenticationRule DEFAULT_INSTANCE = new AuthenticationRule();
    public static final int OAUTH_FIELD_NUMBER = 2;
    private static volatile Parser<AuthenticationRule> PARSER;
    public static final int REQUIREMENTS_FIELD_NUMBER = 7;
    public static final int SELECTOR_FIELD_NUMBER = 1;
    private boolean allowWithoutCredential_;
    private int bitField0_;
    private OAuthRequirements oauth_;
    private Internal.ProtobufList<AuthRequirement> requirements_ = AuthenticationRule.emptyProtobufList();
    private String selector_ = "";

    static {
        DEFAULT_INSTANCE.makeImmutable();
    }

    private AuthenticationRule() {
    }

    private void addAllRequirements(Iterable<? extends AuthRequirement> iterable) {
        this.ensureRequirementsIsMutable();
        AbstractMessageLite.addAll(iterable, this.requirements_);
    }

    private void addRequirements(int n, AuthRequirement.Builder builder) {
        this.ensureRequirementsIsMutable();
        this.requirements_.add(n, (Object)((AuthRequirement)builder.build()));
    }

    private void addRequirements(int n, AuthRequirement authRequirement) {
        if (authRequirement != null) {
            this.ensureRequirementsIsMutable();
            this.requirements_.add(n, (Object)authRequirement);
            return;
        }
        throw new NullPointerException();
    }

    private void addRequirements(AuthRequirement.Builder builder) {
        this.ensureRequirementsIsMutable();
        this.requirements_.add((Object)((AuthRequirement)builder.build()));
    }

    private void addRequirements(AuthRequirement authRequirement) {
        if (authRequirement != null) {
            this.ensureRequirementsIsMutable();
            this.requirements_.add((Object)authRequirement);
            return;
        }
        throw new NullPointerException();
    }

    private void clearAllowWithoutCredential() {
        this.allowWithoutCredential_ = false;
    }

    private void clearOauth() {
        this.oauth_ = null;
    }

    private void clearRequirements() {
        this.requirements_ = AuthenticationRule.emptyProtobufList();
    }

    private void clearSelector() {
        this.selector_ = AuthenticationRule.getDefaultInstance().getSelector();
    }

    private void ensureRequirementsIsMutable() {
        if (!this.requirements_.isModifiable()) {
            this.requirements_ = GeneratedMessageLite.mutableCopy(this.requirements_);
        }
    }

    public static AuthenticationRule getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeOauth(OAuthRequirements oAuthRequirements) {
        OAuthRequirements oAuthRequirements2 = this.oauth_;
        if (oAuthRequirements2 != null && oAuthRequirements2 != OAuthRequirements.getDefaultInstance()) {
            this.oauth_ = (OAuthRequirements)((OAuthRequirements.Builder)OAuthRequirements.newBuilder(this.oauth_).mergeFrom((GeneratedMessageLite)oAuthRequirements)).buildPartial();
            return;
        }
        this.oauth_ = oAuthRequirements;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(AuthenticationRule authenticationRule) {
        return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)authenticationRule);
    }

    public static AuthenticationRule parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AuthenticationRule)AuthenticationRule.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static AuthenticationRule parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AuthenticationRule)AuthenticationRule.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static AuthenticationRule parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (AuthenticationRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static AuthenticationRule parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AuthenticationRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static AuthenticationRule parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (AuthenticationRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static AuthenticationRule parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AuthenticationRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static AuthenticationRule parseFrom(InputStream inputStream) throws IOException {
        return (AuthenticationRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static AuthenticationRule parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AuthenticationRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static AuthenticationRule parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (AuthenticationRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static AuthenticationRule parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (AuthenticationRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<AuthenticationRule> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeRequirements(int n) {
        this.ensureRequirementsIsMutable();
        this.requirements_.remove(n);
    }

    private void setAllowWithoutCredential(boolean bl) {
        this.allowWithoutCredential_ = bl;
    }

    private void setOauth(OAuthRequirements.Builder builder) {
        this.oauth_ = (OAuthRequirements)builder.build();
    }

    private void setOauth(OAuthRequirements oAuthRequirements) {
        if (oAuthRequirements != null) {
            this.oauth_ = oAuthRequirements;
            return;
        }
        throw new NullPointerException();
    }

    private void setRequirements(int n, AuthRequirement.Builder builder) {
        this.ensureRequirementsIsMutable();
        this.requirements_.set(n, (Object)((AuthRequirement)builder.build()));
    }

    private void setRequirements(int n, AuthRequirement authRequirement) {
        if (authRequirement != null) {
            this.ensureRequirementsIsMutable();
            this.requirements_.set(n, (Object)authRequirement);
            return;
        }
        throw new NullPointerException();
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
            AuthenticationRule.checkByteStringIsUtf8((ByteString)byteString);
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
                Class<AuthenticationRule> class_ = AuthenticationRule.class;
                // MONITORENTER : com.google.api.AuthenticationRule.class
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
                            if (n != 18) {
                                if (n != 40) {
                                    if (n != 58) {
                                        if (codedInputStream.skipField(n)) continue;
                                        bl = true;
                                        continue;
                                    }
                                    if (!this.requirements_.isModifiable()) {
                                        this.requirements_ = GeneratedMessageLite.mutableCopy(this.requirements_);
                                    }
                                    this.requirements_.add((Object)((AuthRequirement)codedInputStream.readMessage(AuthRequirement.parser(), extensionRegistryLite)));
                                    continue;
                                }
                                this.allowWithoutCredential_ = codedInputStream.readBool();
                                continue;
                            }
                            OAuthRequirements oAuthRequirements = this.oauth_;
                            OAuthRequirements.Builder builder = null;
                            if (oAuthRequirements != null) {
                                builder = (OAuthRequirements.Builder)this.oauth_.toBuilder();
                            }
                            this.oauth_ = (OAuthRequirements)codedInputStream.readMessage(OAuthRequirements.parser(), extensionRegistryLite);
                            if (builder == null) continue;
                            builder.mergeFrom((GeneratedMessageLite)this.oauth_);
                            this.oauth_ = (OAuthRequirements)builder.buildPartial();
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
                AuthenticationRule authenticationRule = (AuthenticationRule)object2;
                this.selector_ = visitor.visitString(true ^ this.selector_.isEmpty(), this.selector_, true ^ authenticationRule.selector_.isEmpty(), authenticationRule.selector_);
                this.oauth_ = (OAuthRequirements)visitor.visitMessage((MessageLite)this.oauth_, (MessageLite)authenticationRule.oauth_);
                boolean bl = this.allowWithoutCredential_;
                boolean bl2 = authenticationRule.allowWithoutCredential_;
                this.allowWithoutCredential_ = visitor.visitBoolean(bl, bl, bl2, bl2);
                this.requirements_ = visitor.visitList(this.requirements_, authenticationRule.requirements_);
                if (visitor != GeneratedMessageLite.MergeFromVisitor.INSTANCE) return this;
                this.bitField0_ |= authenticationRule.bitField0_;
                return this;
            }
            case 4: {
                return new Builder();
            }
            case 3: {
                this.requirements_.makeImmutable();
                return null;
            }
            case 2: {
                return DEFAULT_INSTANCE;
            }
            case 1: 
        }
        return new AuthenticationRule();
    }

    @Override
    public boolean getAllowWithoutCredential() {
        return this.allowWithoutCredential_;
    }

    @Override
    public OAuthRequirements getOauth() {
        OAuthRequirements oAuthRequirements = this.oauth_;
        if (oAuthRequirements == null) {
            oAuthRequirements = OAuthRequirements.getDefaultInstance();
        }
        return oAuthRequirements;
    }

    @Override
    public AuthRequirement getRequirements(int n) {
        return (AuthRequirement)this.requirements_.get(n);
    }

    @Override
    public int getRequirementsCount() {
        return this.requirements_.size();
    }

    @Override
    public List<AuthRequirement> getRequirementsList() {
        return this.requirements_;
    }

    public AuthRequirementOrBuilder getRequirementsOrBuilder(int n) {
        return (AuthRequirementOrBuilder)this.requirements_.get(n);
    }

    public List<? extends AuthRequirementOrBuilder> getRequirementsOrBuilderList() {
        return this.requirements_;
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
        int n = this.memoizedSerializedSize;
        if (n != -1) {
            return n;
        }
        boolean bl2 = this.selector_.isEmpty();
        int n2 = 0;
        if (!bl2) {
            n2 = 0 + CodedOutputStream.computeStringSize((int)1, (String)this.getSelector());
        }
        if (this.oauth_ != null) {
            n2 += CodedOutputStream.computeMessageSize((int)2, (MessageLite)this.getOauth());
        }
        if (bl = this.allowWithoutCredential_) {
            n2 += CodedOutputStream.computeBoolSize((int)5, (boolean)bl);
        }
        for (int i = 0; i < this.requirements_.size(); ++i) {
            n2 += CodedOutputStream.computeMessageSize((int)7, (MessageLite)((MessageLite)this.requirements_.get(i)));
        }
        this.memoizedSerializedSize = n2;
        return n2;
    }

    @Override
    public boolean hasOauth() {
        return this.oauth_ != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        boolean bl;
        if (!this.selector_.isEmpty()) {
            codedOutputStream.writeString(1, this.getSelector());
        }
        if (this.oauth_ != null) {
            codedOutputStream.writeMessage(2, (MessageLite)this.getOauth());
        }
        if (bl = this.allowWithoutCredential_) {
            codedOutputStream.writeBool(5, bl);
        }
        for (int i = 0; i < this.requirements_.size(); ++i) {
            codedOutputStream.writeMessage(7, (MessageLite)this.requirements_.get(i));
        }
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<AuthenticationRule, Builder>
    implements AuthenticationRuleOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder addAllRequirements(Iterable<? extends AuthRequirement> iterable) {
            this.copyOnWrite();
            ((AuthenticationRule)this.instance).addAllRequirements((Iterable<? extends AuthRequirement>)iterable);
            return this;
        }

        public Builder addRequirements(int n, AuthRequirement.Builder builder) {
            this.copyOnWrite();
            ((AuthenticationRule)this.instance).addRequirements(n, builder);
            return this;
        }

        public Builder addRequirements(int n, AuthRequirement authRequirement) {
            this.copyOnWrite();
            ((AuthenticationRule)this.instance).addRequirements(n, authRequirement);
            return this;
        }

        public Builder addRequirements(AuthRequirement.Builder builder) {
            this.copyOnWrite();
            ((AuthenticationRule)this.instance).addRequirements(builder);
            return this;
        }

        public Builder addRequirements(AuthRequirement authRequirement) {
            this.copyOnWrite();
            ((AuthenticationRule)this.instance).addRequirements(authRequirement);
            return this;
        }

        public Builder clearAllowWithoutCredential() {
            this.copyOnWrite();
            ((AuthenticationRule)this.instance).clearAllowWithoutCredential();
            return this;
        }

        public Builder clearOauth() {
            this.copyOnWrite();
            ((AuthenticationRule)this.instance).clearOauth();
            return this;
        }

        public Builder clearRequirements() {
            this.copyOnWrite();
            ((AuthenticationRule)this.instance).clearRequirements();
            return this;
        }

        public Builder clearSelector() {
            this.copyOnWrite();
            ((AuthenticationRule)this.instance).clearSelector();
            return this;
        }

        @Override
        public boolean getAllowWithoutCredential() {
            return ((AuthenticationRule)this.instance).getAllowWithoutCredential();
        }

        @Override
        public OAuthRequirements getOauth() {
            return ((AuthenticationRule)this.instance).getOauth();
        }

        @Override
        public AuthRequirement getRequirements(int n) {
            return ((AuthenticationRule)this.instance).getRequirements(n);
        }

        @Override
        public int getRequirementsCount() {
            return ((AuthenticationRule)this.instance).getRequirementsCount();
        }

        @Override
        public List<AuthRequirement> getRequirementsList() {
            return Collections.unmodifiableList(((AuthenticationRule)this.instance).getRequirementsList());
        }

        @Override
        public String getSelector() {
            return ((AuthenticationRule)this.instance).getSelector();
        }

        @Override
        public ByteString getSelectorBytes() {
            return ((AuthenticationRule)this.instance).getSelectorBytes();
        }

        @Override
        public boolean hasOauth() {
            return ((AuthenticationRule)this.instance).hasOauth();
        }

        public Builder mergeOauth(OAuthRequirements oAuthRequirements) {
            this.copyOnWrite();
            ((AuthenticationRule)this.instance).mergeOauth(oAuthRequirements);
            return this;
        }

        public Builder removeRequirements(int n) {
            this.copyOnWrite();
            ((AuthenticationRule)this.instance).removeRequirements(n);
            return this;
        }

        public Builder setAllowWithoutCredential(boolean bl) {
            this.copyOnWrite();
            ((AuthenticationRule)this.instance).setAllowWithoutCredential(bl);
            return this;
        }

        public Builder setOauth(OAuthRequirements.Builder builder) {
            this.copyOnWrite();
            ((AuthenticationRule)this.instance).setOauth(builder);
            return this;
        }

        public Builder setOauth(OAuthRequirements oAuthRequirements) {
            this.copyOnWrite();
            ((AuthenticationRule)this.instance).setOauth(oAuthRequirements);
            return this;
        }

        public Builder setRequirements(int n, AuthRequirement.Builder builder) {
            this.copyOnWrite();
            ((AuthenticationRule)this.instance).setRequirements(n, builder);
            return this;
        }

        public Builder setRequirements(int n, AuthRequirement authRequirement) {
            this.copyOnWrite();
            ((AuthenticationRule)this.instance).setRequirements(n, authRequirement);
            return this;
        }

        public Builder setSelector(String string2) {
            this.copyOnWrite();
            ((AuthenticationRule)this.instance).setSelector(string2);
            return this;
        }

        public Builder setSelectorBytes(ByteString byteString) {
            this.copyOnWrite();
            ((AuthenticationRule)this.instance).setSelectorBytes(byteString);
            return this;
        }
    }

}

