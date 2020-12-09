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

import com.google.api.SystemParameter;
import com.google.api.SystemParameterOrBuilder;
import com.google.api.SystemParameterRuleOrBuilder;
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

public final class SystemParameterRule
extends GeneratedMessageLite<SystemParameterRule, Builder>
implements SystemParameterRuleOrBuilder {
    private static final SystemParameterRule DEFAULT_INSTANCE = new SystemParameterRule();
    public static final int PARAMETERS_FIELD_NUMBER = 2;
    private static volatile Parser<SystemParameterRule> PARSER;
    public static final int SELECTOR_FIELD_NUMBER = 1;
    private int bitField0_;
    private Internal.ProtobufList<SystemParameter> parameters_ = SystemParameterRule.emptyProtobufList();
    private String selector_ = "";

    static {
        DEFAULT_INSTANCE.makeImmutable();
    }

    private SystemParameterRule() {
    }

    private void addAllParameters(Iterable<? extends SystemParameter> iterable) {
        this.ensureParametersIsMutable();
        AbstractMessageLite.addAll(iterable, this.parameters_);
    }

    private void addParameters(int n, SystemParameter.Builder builder) {
        this.ensureParametersIsMutable();
        this.parameters_.add(n, (Object)((SystemParameter)builder.build()));
    }

    private void addParameters(int n, SystemParameter systemParameter) {
        if (systemParameter != null) {
            this.ensureParametersIsMutable();
            this.parameters_.add(n, (Object)systemParameter);
            return;
        }
        throw new NullPointerException();
    }

    private void addParameters(SystemParameter.Builder builder) {
        this.ensureParametersIsMutable();
        this.parameters_.add((Object)((SystemParameter)builder.build()));
    }

    private void addParameters(SystemParameter systemParameter) {
        if (systemParameter != null) {
            this.ensureParametersIsMutable();
            this.parameters_.add((Object)systemParameter);
            return;
        }
        throw new NullPointerException();
    }

    private void clearParameters() {
        this.parameters_ = SystemParameterRule.emptyProtobufList();
    }

    private void clearSelector() {
        this.selector_ = SystemParameterRule.getDefaultInstance().getSelector();
    }

    private void ensureParametersIsMutable() {
        if (!this.parameters_.isModifiable()) {
            this.parameters_ = GeneratedMessageLite.mutableCopy(this.parameters_);
        }
    }

    public static SystemParameterRule getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(SystemParameterRule systemParameterRule) {
        return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)systemParameterRule);
    }

    public static SystemParameterRule parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SystemParameterRule)SystemParameterRule.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static SystemParameterRule parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SystemParameterRule)SystemParameterRule.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static SystemParameterRule parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (SystemParameterRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static SystemParameterRule parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SystemParameterRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static SystemParameterRule parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (SystemParameterRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static SystemParameterRule parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SystemParameterRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static SystemParameterRule parseFrom(InputStream inputStream) throws IOException {
        return (SystemParameterRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static SystemParameterRule parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (SystemParameterRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static SystemParameterRule parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (SystemParameterRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static SystemParameterRule parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (SystemParameterRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<SystemParameterRule> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeParameters(int n) {
        this.ensureParametersIsMutable();
        this.parameters_.remove(n);
    }

    private void setParameters(int n, SystemParameter.Builder builder) {
        this.ensureParametersIsMutable();
        this.parameters_.set(n, (Object)((SystemParameter)builder.build()));
    }

    private void setParameters(int n, SystemParameter systemParameter) {
        if (systemParameter != null) {
            this.ensureParametersIsMutable();
            this.parameters_.set(n, (Object)systemParameter);
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
            SystemParameterRule.checkByteStringIsUtf8((ByteString)byteString);
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
                Class<SystemParameterRule> class_ = SystemParameterRule.class;
                // MONITORENTER : com.google.api.SystemParameterRule.class
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
                                if (codedInputStream.skipField(n)) continue;
                                bl = true;
                                continue;
                            }
                            if (!this.parameters_.isModifiable()) {
                                this.parameters_ = GeneratedMessageLite.mutableCopy(this.parameters_);
                            }
                            this.parameters_.add((Object)((SystemParameter)codedInputStream.readMessage(SystemParameter.parser(), extensionRegistryLite)));
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
                SystemParameterRule systemParameterRule = (SystemParameterRule)object2;
                this.selector_ = visitor.visitString(true ^ this.selector_.isEmpty(), this.selector_, true ^ systemParameterRule.selector_.isEmpty(), systemParameterRule.selector_);
                this.parameters_ = visitor.visitList(this.parameters_, systemParameterRule.parameters_);
                if (visitor != GeneratedMessageLite.MergeFromVisitor.INSTANCE) return this;
                this.bitField0_ |= systemParameterRule.bitField0_;
                return this;
            }
            case 4: {
                return new Builder();
            }
            case 3: {
                this.parameters_.makeImmutable();
                return null;
            }
            case 2: {
                return DEFAULT_INSTANCE;
            }
            case 1: 
        }
        return new SystemParameterRule();
    }

    @Override
    public SystemParameter getParameters(int n) {
        return (SystemParameter)this.parameters_.get(n);
    }

    @Override
    public int getParametersCount() {
        return this.parameters_.size();
    }

    @Override
    public List<SystemParameter> getParametersList() {
        return this.parameters_;
    }

    public SystemParameterOrBuilder getParametersOrBuilder(int n) {
        return (SystemParameterOrBuilder)this.parameters_.get(n);
    }

    public List<? extends SystemParameterOrBuilder> getParametersOrBuilderList() {
        return this.parameters_;
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
        int n = this.memoizedSerializedSize;
        if (n != -1) {
            return n;
        }
        boolean bl = this.selector_.isEmpty();
        int n2 = 0;
        if (!bl) {
            n2 = 0 + CodedOutputStream.computeStringSize((int)1, (String)this.getSelector());
        }
        for (int i = 0; i < this.parameters_.size(); ++i) {
            n2 += CodedOutputStream.computeMessageSize((int)2, (MessageLite)((MessageLite)this.parameters_.get(i)));
        }
        this.memoizedSerializedSize = n2;
        return n2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.selector_.isEmpty()) {
            codedOutputStream.writeString(1, this.getSelector());
        }
        for (int i = 0; i < this.parameters_.size(); ++i) {
            codedOutputStream.writeMessage(2, (MessageLite)this.parameters_.get(i));
        }
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<SystemParameterRule, Builder>
    implements SystemParameterRuleOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder addAllParameters(Iterable<? extends SystemParameter> iterable) {
            this.copyOnWrite();
            ((SystemParameterRule)this.instance).addAllParameters((Iterable<? extends SystemParameter>)iterable);
            return this;
        }

        public Builder addParameters(int n, SystemParameter.Builder builder) {
            this.copyOnWrite();
            ((SystemParameterRule)this.instance).addParameters(n, builder);
            return this;
        }

        public Builder addParameters(int n, SystemParameter systemParameter) {
            this.copyOnWrite();
            ((SystemParameterRule)this.instance).addParameters(n, systemParameter);
            return this;
        }

        public Builder addParameters(SystemParameter.Builder builder) {
            this.copyOnWrite();
            ((SystemParameterRule)this.instance).addParameters(builder);
            return this;
        }

        public Builder addParameters(SystemParameter systemParameter) {
            this.copyOnWrite();
            ((SystemParameterRule)this.instance).addParameters(systemParameter);
            return this;
        }

        public Builder clearParameters() {
            this.copyOnWrite();
            ((SystemParameterRule)this.instance).clearParameters();
            return this;
        }

        public Builder clearSelector() {
            this.copyOnWrite();
            ((SystemParameterRule)this.instance).clearSelector();
            return this;
        }

        @Override
        public SystemParameter getParameters(int n) {
            return ((SystemParameterRule)this.instance).getParameters(n);
        }

        @Override
        public int getParametersCount() {
            return ((SystemParameterRule)this.instance).getParametersCount();
        }

        @Override
        public List<SystemParameter> getParametersList() {
            return Collections.unmodifiableList(((SystemParameterRule)this.instance).getParametersList());
        }

        @Override
        public String getSelector() {
            return ((SystemParameterRule)this.instance).getSelector();
        }

        @Override
        public ByteString getSelectorBytes() {
            return ((SystemParameterRule)this.instance).getSelectorBytes();
        }

        public Builder removeParameters(int n) {
            this.copyOnWrite();
            ((SystemParameterRule)this.instance).removeParameters(n);
            return this;
        }

        public Builder setParameters(int n, SystemParameter.Builder builder) {
            this.copyOnWrite();
            ((SystemParameterRule)this.instance).setParameters(n, builder);
            return this;
        }

        public Builder setParameters(int n, SystemParameter systemParameter) {
            this.copyOnWrite();
            ((SystemParameterRule)this.instance).setParameters(n, systemParameter);
            return this;
        }

        public Builder setSelector(String string2) {
            this.copyOnWrite();
            ((SystemParameterRule)this.instance).setSelector(string2);
            return this;
        }

        public Builder setSelectorBytes(ByteString byteString) {
            this.copyOnWrite();
            ((SystemParameterRule)this.instance).setSelectorBytes(byteString);
            return this;
        }
    }

}

