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

import com.google.api.UsageOrBuilder;
import com.google.api.UsageRule;
import com.google.api.UsageRuleOrBuilder;
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

public final class Usage
extends GeneratedMessageLite<Usage, Builder>
implements UsageOrBuilder {
    private static final Usage DEFAULT_INSTANCE = new Usage();
    private static volatile Parser<Usage> PARSER;
    public static final int PRODUCER_NOTIFICATION_CHANNEL_FIELD_NUMBER = 7;
    public static final int REQUIREMENTS_FIELD_NUMBER = 1;
    public static final int RULES_FIELD_NUMBER = 6;
    private int bitField0_;
    private String producerNotificationChannel_ = "";
    private Internal.ProtobufList<String> requirements_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<UsageRule> rules_ = Usage.emptyProtobufList();

    static {
        DEFAULT_INSTANCE.makeImmutable();
    }

    private Usage() {
    }

    private void addAllRequirements(Iterable<String> iterable) {
        this.ensureRequirementsIsMutable();
        AbstractMessageLite.addAll(iterable, this.requirements_);
    }

    private void addAllRules(Iterable<? extends UsageRule> iterable) {
        this.ensureRulesIsMutable();
        AbstractMessageLite.addAll(iterable, this.rules_);
    }

    private void addRequirements(String string2) {
        if (string2 != null) {
            this.ensureRequirementsIsMutable();
            this.requirements_.add((Object)string2);
            return;
        }
        throw new NullPointerException();
    }

    private void addRequirementsBytes(ByteString byteString) {
        if (byteString != null) {
            Usage.checkByteStringIsUtf8((ByteString)byteString);
            this.ensureRequirementsIsMutable();
            this.requirements_.add((Object)byteString.toStringUtf8());
            return;
        }
        throw new NullPointerException();
    }

    private void addRules(int n, UsageRule.Builder builder) {
        this.ensureRulesIsMutable();
        this.rules_.add(n, (Object)((UsageRule)builder.build()));
    }

    private void addRules(int n, UsageRule usageRule) {
        if (usageRule != null) {
            this.ensureRulesIsMutable();
            this.rules_.add(n, (Object)usageRule);
            return;
        }
        throw new NullPointerException();
    }

    private void addRules(UsageRule.Builder builder) {
        this.ensureRulesIsMutable();
        this.rules_.add((Object)((UsageRule)builder.build()));
    }

    private void addRules(UsageRule usageRule) {
        if (usageRule != null) {
            this.ensureRulesIsMutable();
            this.rules_.add((Object)usageRule);
            return;
        }
        throw new NullPointerException();
    }

    private void clearProducerNotificationChannel() {
        this.producerNotificationChannel_ = Usage.getDefaultInstance().getProducerNotificationChannel();
    }

    private void clearRequirements() {
        this.requirements_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearRules() {
        this.rules_ = Usage.emptyProtobufList();
    }

    private void ensureRequirementsIsMutable() {
        if (!this.requirements_.isModifiable()) {
            this.requirements_ = GeneratedMessageLite.mutableCopy(this.requirements_);
        }
    }

    private void ensureRulesIsMutable() {
        if (!this.rules_.isModifiable()) {
            this.rules_ = GeneratedMessageLite.mutableCopy(this.rules_);
        }
    }

    public static Usage getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(Usage usage) {
        return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)usage);
    }

    public static Usage parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Usage)Usage.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Usage parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Usage)Usage.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Usage parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Usage)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static Usage parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Usage)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Usage parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Usage)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static Usage parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Usage)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Usage parseFrom(InputStream inputStream) throws IOException {
        return (Usage)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Usage parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Usage)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Usage parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (Usage)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static Usage parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Usage)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<Usage> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeRules(int n) {
        this.ensureRulesIsMutable();
        this.rules_.remove(n);
    }

    private void setProducerNotificationChannel(String string2) {
        if (string2 != null) {
            this.producerNotificationChannel_ = string2;
            return;
        }
        throw new NullPointerException();
    }

    private void setProducerNotificationChannelBytes(ByteString byteString) {
        if (byteString != null) {
            Usage.checkByteStringIsUtf8((ByteString)byteString);
            this.producerNotificationChannel_ = byteString.toStringUtf8();
            return;
        }
        throw new NullPointerException();
    }

    private void setRequirements(int n, String string2) {
        if (string2 != null) {
            this.ensureRequirementsIsMutable();
            this.requirements_.set(n, (Object)string2);
            return;
        }
        throw new NullPointerException();
    }

    private void setRules(int n, UsageRule.Builder builder) {
        this.ensureRulesIsMutable();
        this.rules_.set(n, (Object)((UsageRule)builder.build()));
    }

    private void setRules(int n, UsageRule usageRule) {
        if (usageRule != null) {
            this.ensureRulesIsMutable();
            this.rules_.set(n, (Object)usageRule);
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
                Class<Usage> class_ = Usage.class;
                // MONITORENTER : com.google.api.Usage.class
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
                            if (n != 50) {
                                if (n != 58) {
                                    if (codedInputStream.skipField(n)) continue;
                                    bl = true;
                                    continue;
                                }
                                this.producerNotificationChannel_ = codedInputStream.readStringRequireUtf8();
                                continue;
                            }
                            if (!this.rules_.isModifiable()) {
                                this.rules_ = GeneratedMessageLite.mutableCopy(this.rules_);
                            }
                            this.rules_.add((Object)((UsageRule)codedInputStream.readMessage(UsageRule.parser(), extensionRegistryLite)));
                            continue;
                        }
                        String string2 = codedInputStream.readStringRequireUtf8();
                        if (!this.requirements_.isModifiable()) {
                            this.requirements_ = GeneratedMessageLite.mutableCopy(this.requirements_);
                        }
                        this.requirements_.add((Object)string2);
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
                Usage usage = (Usage)object2;
                this.requirements_ = visitor.visitList(this.requirements_, usage.requirements_);
                this.rules_ = visitor.visitList(this.rules_, usage.rules_);
                this.producerNotificationChannel_ = visitor.visitString(true ^ this.producerNotificationChannel_.isEmpty(), this.producerNotificationChannel_, true ^ usage.producerNotificationChannel_.isEmpty(), usage.producerNotificationChannel_);
                if (visitor != GeneratedMessageLite.MergeFromVisitor.INSTANCE) return this;
                this.bitField0_ |= usage.bitField0_;
                return this;
            }
            case 4: {
                return new Builder();
            }
            case 3: {
                this.requirements_.makeImmutable();
                this.rules_.makeImmutable();
                return null;
            }
            case 2: {
                return DEFAULT_INSTANCE;
            }
            case 1: 
        }
        return new Usage();
    }

    @Override
    public String getProducerNotificationChannel() {
        return this.producerNotificationChannel_;
    }

    @Override
    public ByteString getProducerNotificationChannelBytes() {
        return ByteString.copyFromUtf8((String)this.producerNotificationChannel_);
    }

    @Override
    public String getRequirements(int n) {
        return (String)this.requirements_.get(n);
    }

    @Override
    public ByteString getRequirementsBytes(int n) {
        return ByteString.copyFromUtf8((String)((String)this.requirements_.get(n)));
    }

    @Override
    public int getRequirementsCount() {
        return this.requirements_.size();
    }

    @Override
    public List<String> getRequirementsList() {
        return this.requirements_;
    }

    @Override
    public UsageRule getRules(int n) {
        return (UsageRule)this.rules_.get(n);
    }

    @Override
    public int getRulesCount() {
        return this.rules_.size();
    }

    @Override
    public List<UsageRule> getRulesList() {
        return this.rules_;
    }

    public UsageRuleOrBuilder getRulesOrBuilder(int n) {
        return (UsageRuleOrBuilder)this.rules_.get(n);
    }

    public List<? extends UsageRuleOrBuilder> getRulesOrBuilderList() {
        return this.rules_;
    }

    public int getSerializedSize() {
        int n = this.memoizedSerializedSize;
        if (n != -1) {
            return n;
        }
        int n2 = 0;
        for (int i = 0; i < this.requirements_.size(); ++i) {
            n2 += CodedOutputStream.computeStringSizeNoTag((String)((String)this.requirements_.get(i)));
        }
        int n3 = 0 + n2 + 1 * this.getRequirementsList().size();
        for (int i = 0; i < this.rules_.size(); ++i) {
            n3 += CodedOutputStream.computeMessageSize((int)6, (MessageLite)((MessageLite)this.rules_.get(i)));
        }
        if (!this.producerNotificationChannel_.isEmpty()) {
            n3 += CodedOutputStream.computeStringSize((int)7, (String)this.getProducerNotificationChannel());
        }
        this.memoizedSerializedSize = n3;
        return n3;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.requirements_.size(); ++i) {
            codedOutputStream.writeString(1, (String)this.requirements_.get(i));
        }
        for (int i = 0; i < this.rules_.size(); ++i) {
            codedOutputStream.writeMessage(6, (MessageLite)this.rules_.get(i));
        }
        if (!this.producerNotificationChannel_.isEmpty()) {
            codedOutputStream.writeString(7, this.getProducerNotificationChannel());
        }
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<Usage, Builder>
    implements UsageOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder addAllRequirements(Iterable<String> iterable) {
            this.copyOnWrite();
            ((Usage)this.instance).addAllRequirements((Iterable<String>)iterable);
            return this;
        }

        public Builder addAllRules(Iterable<? extends UsageRule> iterable) {
            this.copyOnWrite();
            ((Usage)this.instance).addAllRules((Iterable<? extends UsageRule>)iterable);
            return this;
        }

        public Builder addRequirements(String string2) {
            this.copyOnWrite();
            ((Usage)this.instance).addRequirements(string2);
            return this;
        }

        public Builder addRequirementsBytes(ByteString byteString) {
            this.copyOnWrite();
            ((Usage)this.instance).addRequirementsBytes(byteString);
            return this;
        }

        public Builder addRules(int n, UsageRule.Builder builder) {
            this.copyOnWrite();
            ((Usage)this.instance).addRules(n, builder);
            return this;
        }

        public Builder addRules(int n, UsageRule usageRule) {
            this.copyOnWrite();
            ((Usage)this.instance).addRules(n, usageRule);
            return this;
        }

        public Builder addRules(UsageRule.Builder builder) {
            this.copyOnWrite();
            ((Usage)this.instance).addRules(builder);
            return this;
        }

        public Builder addRules(UsageRule usageRule) {
            this.copyOnWrite();
            ((Usage)this.instance).addRules(usageRule);
            return this;
        }

        public Builder clearProducerNotificationChannel() {
            this.copyOnWrite();
            ((Usage)this.instance).clearProducerNotificationChannel();
            return this;
        }

        public Builder clearRequirements() {
            this.copyOnWrite();
            ((Usage)this.instance).clearRequirements();
            return this;
        }

        public Builder clearRules() {
            this.copyOnWrite();
            ((Usage)this.instance).clearRules();
            return this;
        }

        @Override
        public String getProducerNotificationChannel() {
            return ((Usage)this.instance).getProducerNotificationChannel();
        }

        @Override
        public ByteString getProducerNotificationChannelBytes() {
            return ((Usage)this.instance).getProducerNotificationChannelBytes();
        }

        @Override
        public String getRequirements(int n) {
            return ((Usage)this.instance).getRequirements(n);
        }

        @Override
        public ByteString getRequirementsBytes(int n) {
            return ((Usage)this.instance).getRequirementsBytes(n);
        }

        @Override
        public int getRequirementsCount() {
            return ((Usage)this.instance).getRequirementsCount();
        }

        @Override
        public List<String> getRequirementsList() {
            return Collections.unmodifiableList(((Usage)this.instance).getRequirementsList());
        }

        @Override
        public UsageRule getRules(int n) {
            return ((Usage)this.instance).getRules(n);
        }

        @Override
        public int getRulesCount() {
            return ((Usage)this.instance).getRulesCount();
        }

        @Override
        public List<UsageRule> getRulesList() {
            return Collections.unmodifiableList(((Usage)this.instance).getRulesList());
        }

        public Builder removeRules(int n) {
            this.copyOnWrite();
            ((Usage)this.instance).removeRules(n);
            return this;
        }

        public Builder setProducerNotificationChannel(String string2) {
            this.copyOnWrite();
            ((Usage)this.instance).setProducerNotificationChannel(string2);
            return this;
        }

        public Builder setProducerNotificationChannelBytes(ByteString byteString) {
            this.copyOnWrite();
            ((Usage)this.instance).setProducerNotificationChannelBytes(byteString);
            return this;
        }

        public Builder setRequirements(int n, String string2) {
            this.copyOnWrite();
            ((Usage)this.instance).setRequirements(n, string2);
            return this;
        }

        public Builder setRules(int n, UsageRule.Builder builder) {
            this.copyOnWrite();
            ((Usage)this.instance).setRules(n, builder);
            return this;
        }

        public Builder setRules(int n, UsageRule usageRule) {
            this.copyOnWrite();
            ((Usage)this.instance).setRules(n, usageRule);
            return this;
        }
    }

}

