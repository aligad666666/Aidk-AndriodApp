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

import com.google.api.Advice;
import com.google.api.AdviceOrBuilder;
import com.google.api.ChangeType;
import com.google.api.ConfigChangeOrBuilder;
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

public final class ConfigChange
extends GeneratedMessageLite<ConfigChange, Builder>
implements ConfigChangeOrBuilder {
    public static final int ADVICES_FIELD_NUMBER = 5;
    public static final int CHANGE_TYPE_FIELD_NUMBER = 4;
    private static final ConfigChange DEFAULT_INSTANCE = new ConfigChange();
    public static final int ELEMENT_FIELD_NUMBER = 1;
    public static final int NEW_VALUE_FIELD_NUMBER = 3;
    public static final int OLD_VALUE_FIELD_NUMBER = 2;
    private static volatile Parser<ConfigChange> PARSER;
    private Internal.ProtobufList<Advice> advices_ = ConfigChange.emptyProtobufList();
    private int bitField0_;
    private int changeType_;
    private String element_ = "";
    private String newValue_ = "";
    private String oldValue_ = "";

    static {
        DEFAULT_INSTANCE.makeImmutable();
    }

    private ConfigChange() {
    }

    private void addAdvices(int n, Advice.Builder builder) {
        this.ensureAdvicesIsMutable();
        this.advices_.add(n, (Object)((Advice)builder.build()));
    }

    private void addAdvices(int n, Advice advice) {
        if (advice != null) {
            this.ensureAdvicesIsMutable();
            this.advices_.add(n, (Object)advice);
            return;
        }
        throw new NullPointerException();
    }

    private void addAdvices(Advice.Builder builder) {
        this.ensureAdvicesIsMutable();
        this.advices_.add((Object)((Advice)builder.build()));
    }

    private void addAdvices(Advice advice) {
        if (advice != null) {
            this.ensureAdvicesIsMutable();
            this.advices_.add((Object)advice);
            return;
        }
        throw new NullPointerException();
    }

    private void addAllAdvices(Iterable<? extends Advice> iterable) {
        this.ensureAdvicesIsMutable();
        AbstractMessageLite.addAll(iterable, this.advices_);
    }

    private void clearAdvices() {
        this.advices_ = ConfigChange.emptyProtobufList();
    }

    private void clearChangeType() {
        this.changeType_ = 0;
    }

    private void clearElement() {
        this.element_ = ConfigChange.getDefaultInstance().getElement();
    }

    private void clearNewValue() {
        this.newValue_ = ConfigChange.getDefaultInstance().getNewValue();
    }

    private void clearOldValue() {
        this.oldValue_ = ConfigChange.getDefaultInstance().getOldValue();
    }

    private void ensureAdvicesIsMutable() {
        if (!this.advices_.isModifiable()) {
            this.advices_ = GeneratedMessageLite.mutableCopy(this.advices_);
        }
    }

    public static ConfigChange getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(ConfigChange configChange) {
        return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)configChange);
    }

    public static ConfigChange parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ConfigChange)ConfigChange.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static ConfigChange parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ConfigChange)ConfigChange.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ConfigChange parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ConfigChange)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static ConfigChange parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ConfigChange)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ConfigChange parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ConfigChange)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static ConfigChange parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ConfigChange)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ConfigChange parseFrom(InputStream inputStream) throws IOException {
        return (ConfigChange)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static ConfigChange parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ConfigChange)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ConfigChange parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (ConfigChange)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static ConfigChange parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ConfigChange)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<ConfigChange> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeAdvices(int n) {
        this.ensureAdvicesIsMutable();
        this.advices_.remove(n);
    }

    private void setAdvices(int n, Advice.Builder builder) {
        this.ensureAdvicesIsMutable();
        this.advices_.set(n, (Object)((Advice)builder.build()));
    }

    private void setAdvices(int n, Advice advice) {
        if (advice != null) {
            this.ensureAdvicesIsMutable();
            this.advices_.set(n, (Object)advice);
            return;
        }
        throw new NullPointerException();
    }

    private void setChangeType(ChangeType changeType) {
        if (changeType != null) {
            this.changeType_ = changeType.getNumber();
            return;
        }
        throw new NullPointerException();
    }

    private void setChangeTypeValue(int n) {
        this.changeType_ = n;
    }

    private void setElement(String string2) {
        if (string2 != null) {
            this.element_ = string2;
            return;
        }
        throw new NullPointerException();
    }

    private void setElementBytes(ByteString byteString) {
        if (byteString != null) {
            ConfigChange.checkByteStringIsUtf8((ByteString)byteString);
            this.element_ = byteString.toStringUtf8();
            return;
        }
        throw new NullPointerException();
    }

    private void setNewValue(String string2) {
        if (string2 != null) {
            this.newValue_ = string2;
            return;
        }
        throw new NullPointerException();
    }

    private void setNewValueBytes(ByteString byteString) {
        if (byteString != null) {
            ConfigChange.checkByteStringIsUtf8((ByteString)byteString);
            this.newValue_ = byteString.toStringUtf8();
            return;
        }
        throw new NullPointerException();
    }

    private void setOldValue(String string2) {
        if (string2 != null) {
            this.oldValue_ = string2;
            return;
        }
        throw new NullPointerException();
    }

    private void setOldValueBytes(ByteString byteString) {
        if (byteString != null) {
            ConfigChange.checkByteStringIsUtf8((ByteString)byteString);
            this.oldValue_ = byteString.toStringUtf8();
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
                Class<ConfigChange> class_ = ConfigChange.class;
                // MONITORENTER : com.google.api.ConfigChange.class
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
                                if (n != 26) {
                                    if (n != 32) {
                                        if (n != 42) {
                                            if (codedInputStream.skipField(n)) continue;
                                            bl = true;
                                            continue;
                                        }
                                        if (!this.advices_.isModifiable()) {
                                            this.advices_ = GeneratedMessageLite.mutableCopy(this.advices_);
                                        }
                                        this.advices_.add((Object)((Advice)codedInputStream.readMessage(Advice.parser(), extensionRegistryLite)));
                                        continue;
                                    }
                                    this.changeType_ = codedInputStream.readEnum();
                                    continue;
                                }
                                this.newValue_ = codedInputStream.readStringRequireUtf8();
                                continue;
                            }
                            this.oldValue_ = codedInputStream.readStringRequireUtf8();
                            continue;
                        }
                        this.element_ = codedInputStream.readStringRequireUtf8();
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
                ConfigChange configChange = (ConfigChange)object2;
                boolean bl = this.element_.isEmpty();
                boolean bl2 = true;
                this.element_ = visitor.visitString(bl ^ bl2, this.element_, bl2 ^ configChange.element_.isEmpty(), configChange.element_);
                this.oldValue_ = visitor.visitString(bl2 ^ this.oldValue_.isEmpty(), this.oldValue_, bl2 ^ configChange.oldValue_.isEmpty(), configChange.oldValue_);
                this.newValue_ = visitor.visitString(bl2 ^ this.newValue_.isEmpty(), this.newValue_, bl2 ^ configChange.newValue_.isEmpty(), configChange.newValue_);
                boolean bl3 = this.changeType_ != 0;
                int n = this.changeType_;
                if (configChange.changeType_ == 0) {
                    bl2 = false;
                }
                this.changeType_ = visitor.visitInt(bl3, n, bl2, configChange.changeType_);
                this.advices_ = visitor.visitList(this.advices_, configChange.advices_);
                if (visitor != GeneratedMessageLite.MergeFromVisitor.INSTANCE) return this;
                this.bitField0_ |= configChange.bitField0_;
                return this;
            }
            case 4: {
                return new Builder();
            }
            case 3: {
                this.advices_.makeImmutable();
                return null;
            }
            case 2: {
                return DEFAULT_INSTANCE;
            }
            case 1: 
        }
        return new ConfigChange();
    }

    @Override
    public Advice getAdvices(int n) {
        return (Advice)this.advices_.get(n);
    }

    @Override
    public int getAdvicesCount() {
        return this.advices_.size();
    }

    @Override
    public List<Advice> getAdvicesList() {
        return this.advices_;
    }

    public AdviceOrBuilder getAdvicesOrBuilder(int n) {
        return (AdviceOrBuilder)this.advices_.get(n);
    }

    public List<? extends AdviceOrBuilder> getAdvicesOrBuilderList() {
        return this.advices_;
    }

    @Override
    public ChangeType getChangeType() {
        ChangeType changeType = ChangeType.forNumber(this.changeType_);
        if (changeType == null) {
            return ChangeType.UNRECOGNIZED;
        }
        return changeType;
    }

    @Override
    public int getChangeTypeValue() {
        return this.changeType_;
    }

    @Override
    public String getElement() {
        return this.element_;
    }

    @Override
    public ByteString getElementBytes() {
        return ByteString.copyFromUtf8((String)this.element_);
    }

    @Override
    public String getNewValue() {
        return this.newValue_;
    }

    @Override
    public ByteString getNewValueBytes() {
        return ByteString.copyFromUtf8((String)this.newValue_);
    }

    @Override
    public String getOldValue() {
        return this.oldValue_;
    }

    @Override
    public ByteString getOldValueBytes() {
        return ByteString.copyFromUtf8((String)this.oldValue_);
    }

    public int getSerializedSize() {
        int n = this.memoizedSerializedSize;
        if (n != -1) {
            return n;
        }
        boolean bl = this.element_.isEmpty();
        int n2 = 0;
        if (!bl) {
            n2 = 0 + CodedOutputStream.computeStringSize((int)1, (String)this.getElement());
        }
        if (!this.oldValue_.isEmpty()) {
            n2 += CodedOutputStream.computeStringSize((int)2, (String)this.getOldValue());
        }
        if (!this.newValue_.isEmpty()) {
            n2 += CodedOutputStream.computeStringSize((int)3, (String)this.getNewValue());
        }
        if (this.changeType_ != ChangeType.CHANGE_TYPE_UNSPECIFIED.getNumber()) {
            n2 += CodedOutputStream.computeEnumSize((int)4, (int)this.changeType_);
        }
        for (int i = 0; i < this.advices_.size(); ++i) {
            n2 += CodedOutputStream.computeMessageSize((int)5, (MessageLite)((MessageLite)this.advices_.get(i)));
        }
        this.memoizedSerializedSize = n2;
        return n2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.element_.isEmpty()) {
            codedOutputStream.writeString(1, this.getElement());
        }
        if (!this.oldValue_.isEmpty()) {
            codedOutputStream.writeString(2, this.getOldValue());
        }
        if (!this.newValue_.isEmpty()) {
            codedOutputStream.writeString(3, this.getNewValue());
        }
        if (this.changeType_ != ChangeType.CHANGE_TYPE_UNSPECIFIED.getNumber()) {
            codedOutputStream.writeEnum(4, this.changeType_);
        }
        for (int i = 0; i < this.advices_.size(); ++i) {
            codedOutputStream.writeMessage(5, (MessageLite)this.advices_.get(i));
        }
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<ConfigChange, Builder>
    implements ConfigChangeOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder addAdvices(int n, Advice.Builder builder) {
            this.copyOnWrite();
            ((ConfigChange)this.instance).addAdvices(n, builder);
            return this;
        }

        public Builder addAdvices(int n, Advice advice) {
            this.copyOnWrite();
            ((ConfigChange)this.instance).addAdvices(n, advice);
            return this;
        }

        public Builder addAdvices(Advice.Builder builder) {
            this.copyOnWrite();
            ((ConfigChange)this.instance).addAdvices(builder);
            return this;
        }

        public Builder addAdvices(Advice advice) {
            this.copyOnWrite();
            ((ConfigChange)this.instance).addAdvices(advice);
            return this;
        }

        public Builder addAllAdvices(Iterable<? extends Advice> iterable) {
            this.copyOnWrite();
            ((ConfigChange)this.instance).addAllAdvices((Iterable<? extends Advice>)iterable);
            return this;
        }

        public Builder clearAdvices() {
            this.copyOnWrite();
            ((ConfigChange)this.instance).clearAdvices();
            return this;
        }

        public Builder clearChangeType() {
            this.copyOnWrite();
            ((ConfigChange)this.instance).clearChangeType();
            return this;
        }

        public Builder clearElement() {
            this.copyOnWrite();
            ((ConfigChange)this.instance).clearElement();
            return this;
        }

        public Builder clearNewValue() {
            this.copyOnWrite();
            ((ConfigChange)this.instance).clearNewValue();
            return this;
        }

        public Builder clearOldValue() {
            this.copyOnWrite();
            ((ConfigChange)this.instance).clearOldValue();
            return this;
        }

        @Override
        public Advice getAdvices(int n) {
            return ((ConfigChange)this.instance).getAdvices(n);
        }

        @Override
        public int getAdvicesCount() {
            return ((ConfigChange)this.instance).getAdvicesCount();
        }

        @Override
        public List<Advice> getAdvicesList() {
            return Collections.unmodifiableList(((ConfigChange)this.instance).getAdvicesList());
        }

        @Override
        public ChangeType getChangeType() {
            return ((ConfigChange)this.instance).getChangeType();
        }

        @Override
        public int getChangeTypeValue() {
            return ((ConfigChange)this.instance).getChangeTypeValue();
        }

        @Override
        public String getElement() {
            return ((ConfigChange)this.instance).getElement();
        }

        @Override
        public ByteString getElementBytes() {
            return ((ConfigChange)this.instance).getElementBytes();
        }

        @Override
        public String getNewValue() {
            return ((ConfigChange)this.instance).getNewValue();
        }

        @Override
        public ByteString getNewValueBytes() {
            return ((ConfigChange)this.instance).getNewValueBytes();
        }

        @Override
        public String getOldValue() {
            return ((ConfigChange)this.instance).getOldValue();
        }

        @Override
        public ByteString getOldValueBytes() {
            return ((ConfigChange)this.instance).getOldValueBytes();
        }

        public Builder removeAdvices(int n) {
            this.copyOnWrite();
            ((ConfigChange)this.instance).removeAdvices(n);
            return this;
        }

        public Builder setAdvices(int n, Advice.Builder builder) {
            this.copyOnWrite();
            ((ConfigChange)this.instance).setAdvices(n, builder);
            return this;
        }

        public Builder setAdvices(int n, Advice advice) {
            this.copyOnWrite();
            ((ConfigChange)this.instance).setAdvices(n, advice);
            return this;
        }

        public Builder setChangeType(ChangeType changeType) {
            this.copyOnWrite();
            ((ConfigChange)this.instance).setChangeType(changeType);
            return this;
        }

        public Builder setChangeTypeValue(int n) {
            this.copyOnWrite();
            ((ConfigChange)this.instance).setChangeTypeValue(n);
            return this;
        }

        public Builder setElement(String string2) {
            this.copyOnWrite();
            ((ConfigChange)this.instance).setElement(string2);
            return this;
        }

        public Builder setElementBytes(ByteString byteString) {
            this.copyOnWrite();
            ((ConfigChange)this.instance).setElementBytes(byteString);
            return this;
        }

        public Builder setNewValue(String string2) {
            this.copyOnWrite();
            ((ConfigChange)this.instance).setNewValue(string2);
            return this;
        }

        public Builder setNewValueBytes(ByteString byteString) {
            this.copyOnWrite();
            ((ConfigChange)this.instance).setNewValueBytes(byteString);
            return this;
        }

        public Builder setOldValue(String string2) {
            this.copyOnWrite();
            ((ConfigChange)this.instance).setOldValue(string2);
            return this;
        }

        public Builder setOldValueBytes(ByteString byteString) {
            this.copyOnWrite();
            ((ConfigChange)this.instance).setOldValueBytes(byteString);
            return this;
        }
    }

}

