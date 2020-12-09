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

public final class ContextRule
extends GeneratedMessageLite<ContextRule, Builder>
implements ContextRuleOrBuilder {
    private static final ContextRule DEFAULT_INSTANCE = new ContextRule();
    private static volatile Parser<ContextRule> PARSER;
    public static final int PROVIDED_FIELD_NUMBER = 3;
    public static final int REQUESTED_FIELD_NUMBER = 2;
    public static final int SELECTOR_FIELD_NUMBER = 1;
    private int bitField0_;
    private Internal.ProtobufList<String> provided_ = GeneratedMessageLite.emptyProtobufList();
    private Internal.ProtobufList<String> requested_ = GeneratedMessageLite.emptyProtobufList();
    private String selector_ = "";

    static {
        DEFAULT_INSTANCE.makeImmutable();
    }

    private ContextRule() {
    }

    private void addAllProvided(Iterable<String> iterable) {
        this.ensureProvidedIsMutable();
        AbstractMessageLite.addAll(iterable, this.provided_);
    }

    private void addAllRequested(Iterable<String> iterable) {
        this.ensureRequestedIsMutable();
        AbstractMessageLite.addAll(iterable, this.requested_);
    }

    private void addProvided(String string2) {
        if (string2 != null) {
            this.ensureProvidedIsMutable();
            this.provided_.add((Object)string2);
            return;
        }
        throw new NullPointerException();
    }

    private void addProvidedBytes(ByteString byteString) {
        if (byteString != null) {
            ContextRule.checkByteStringIsUtf8((ByteString)byteString);
            this.ensureProvidedIsMutable();
            this.provided_.add((Object)byteString.toStringUtf8());
            return;
        }
        throw new NullPointerException();
    }

    private void addRequested(String string2) {
        if (string2 != null) {
            this.ensureRequestedIsMutable();
            this.requested_.add((Object)string2);
            return;
        }
        throw new NullPointerException();
    }

    private void addRequestedBytes(ByteString byteString) {
        if (byteString != null) {
            ContextRule.checkByteStringIsUtf8((ByteString)byteString);
            this.ensureRequestedIsMutable();
            this.requested_.add((Object)byteString.toStringUtf8());
            return;
        }
        throw new NullPointerException();
    }

    private void clearProvided() {
        this.provided_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearRequested() {
        this.requested_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearSelector() {
        this.selector_ = ContextRule.getDefaultInstance().getSelector();
    }

    private void ensureProvidedIsMutable() {
        if (!this.provided_.isModifiable()) {
            this.provided_ = GeneratedMessageLite.mutableCopy(this.provided_);
        }
    }

    private void ensureRequestedIsMutable() {
        if (!this.requested_.isModifiable()) {
            this.requested_ = GeneratedMessageLite.mutableCopy(this.requested_);
        }
    }

    public static ContextRule getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(ContextRule contextRule) {
        return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)contextRule);
    }

    public static ContextRule parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ContextRule)ContextRule.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static ContextRule parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ContextRule)ContextRule.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ContextRule parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ContextRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static ContextRule parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ContextRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ContextRule parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ContextRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static ContextRule parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ContextRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ContextRule parseFrom(InputStream inputStream) throws IOException {
        return (ContextRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static ContextRule parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ContextRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ContextRule parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (ContextRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static ContextRule parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ContextRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<ContextRule> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setProvided(int n, String string2) {
        if (string2 != null) {
            this.ensureProvidedIsMutable();
            this.provided_.set(n, (Object)string2);
            return;
        }
        throw new NullPointerException();
    }

    private void setRequested(int n, String string2) {
        if (string2 != null) {
            this.ensureRequestedIsMutable();
            this.requested_.set(n, (Object)string2);
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
            ContextRule.checkByteStringIsUtf8((ByteString)byteString);
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
                Class<ContextRule> class_ = ContextRule.class;
                // MONITORENTER : com.google.api.ContextRule.class
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
                            if (n != 18) {
                                if (n != 26) {
                                    if (codedInputStream.skipField(n)) continue;
                                    bl = true;
                                    continue;
                                }
                                String string2 = codedInputStream.readStringRequireUtf8();
                                if (!this.provided_.isModifiable()) {
                                    this.provided_ = GeneratedMessageLite.mutableCopy(this.provided_);
                                }
                                this.provided_.add((Object)string2);
                                continue;
                            }
                            String string3 = codedInputStream.readStringRequireUtf8();
                            if (!this.requested_.isModifiable()) {
                                this.requested_ = GeneratedMessageLite.mutableCopy(this.requested_);
                            }
                            this.requested_.add((Object)string3);
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
                ContextRule contextRule = (ContextRule)object2;
                this.selector_ = visitor.visitString(true ^ this.selector_.isEmpty(), this.selector_, true ^ contextRule.selector_.isEmpty(), contextRule.selector_);
                this.requested_ = visitor.visitList(this.requested_, contextRule.requested_);
                this.provided_ = visitor.visitList(this.provided_, contextRule.provided_);
                if (visitor != GeneratedMessageLite.MergeFromVisitor.INSTANCE) return this;
                this.bitField0_ |= contextRule.bitField0_;
                return this;
            }
            case 4: {
                return new Builder();
            }
            case 3: {
                this.requested_.makeImmutable();
                this.provided_.makeImmutable();
                return null;
            }
            case 2: {
                return DEFAULT_INSTANCE;
            }
            case 1: 
        }
        return new ContextRule();
    }

    @Override
    public String getProvided(int n) {
        return (String)this.provided_.get(n);
    }

    @Override
    public ByteString getProvidedBytes(int n) {
        return ByteString.copyFromUtf8((String)((String)this.provided_.get(n)));
    }

    @Override
    public int getProvidedCount() {
        return this.provided_.size();
    }

    @Override
    public List<String> getProvidedList() {
        return this.provided_;
    }

    @Override
    public String getRequested(int n) {
        return (String)this.requested_.get(n);
    }

    @Override
    public ByteString getRequestedBytes(int n) {
        return ByteString.copyFromUtf8((String)((String)this.requested_.get(n)));
    }

    @Override
    public int getRequestedCount() {
        return this.requested_.size();
    }

    @Override
    public List<String> getRequestedList() {
        return this.requested_;
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
        int n;
        int n2 = this.memoizedSerializedSize;
        if (n2 != -1) {
            return n2;
        }
        boolean bl = this.selector_.isEmpty();
        int n3 = 0;
        if (!bl) {
            n3 = 0 + CodedOutputStream.computeStringSize((int)1, (String)this.getSelector());
        }
        int n4 = 0;
        for (int i = 0; i < this.requested_.size(); ++i) {
            n4 += CodedOutputStream.computeStringSizeNoTag((String)((String)this.requested_.get(i)));
        }
        int n5 = n3 + n4 + 1 * this.getRequestedList().size();
        int n6 = 0;
        for (int i = 0; i < this.provided_.size(); ++i) {
            n6 += CodedOutputStream.computeStringSizeNoTag((String)((String)this.provided_.get(i)));
        }
        this.memoizedSerializedSize = n = n5 + n6 + 1 * this.getProvidedList().size();
        return n;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.selector_.isEmpty()) {
            codedOutputStream.writeString(1, this.getSelector());
        }
        for (int i = 0; i < this.requested_.size(); ++i) {
            codedOutputStream.writeString(2, (String)this.requested_.get(i));
        }
        for (int i = 0; i < this.provided_.size(); ++i) {
            codedOutputStream.writeString(3, (String)this.provided_.get(i));
        }
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<ContextRule, Builder>
    implements ContextRuleOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder addAllProvided(Iterable<String> iterable) {
            this.copyOnWrite();
            ((ContextRule)this.instance).addAllProvided((Iterable<String>)iterable);
            return this;
        }

        public Builder addAllRequested(Iterable<String> iterable) {
            this.copyOnWrite();
            ((ContextRule)this.instance).addAllRequested((Iterable<String>)iterable);
            return this;
        }

        public Builder addProvided(String string2) {
            this.copyOnWrite();
            ((ContextRule)this.instance).addProvided(string2);
            return this;
        }

        public Builder addProvidedBytes(ByteString byteString) {
            this.copyOnWrite();
            ((ContextRule)this.instance).addProvidedBytes(byteString);
            return this;
        }

        public Builder addRequested(String string2) {
            this.copyOnWrite();
            ((ContextRule)this.instance).addRequested(string2);
            return this;
        }

        public Builder addRequestedBytes(ByteString byteString) {
            this.copyOnWrite();
            ((ContextRule)this.instance).addRequestedBytes(byteString);
            return this;
        }

        public Builder clearProvided() {
            this.copyOnWrite();
            ((ContextRule)this.instance).clearProvided();
            return this;
        }

        public Builder clearRequested() {
            this.copyOnWrite();
            ((ContextRule)this.instance).clearRequested();
            return this;
        }

        public Builder clearSelector() {
            this.copyOnWrite();
            ((ContextRule)this.instance).clearSelector();
            return this;
        }

        @Override
        public String getProvided(int n) {
            return ((ContextRule)this.instance).getProvided(n);
        }

        @Override
        public ByteString getProvidedBytes(int n) {
            return ((ContextRule)this.instance).getProvidedBytes(n);
        }

        @Override
        public int getProvidedCount() {
            return ((ContextRule)this.instance).getProvidedCount();
        }

        @Override
        public List<String> getProvidedList() {
            return Collections.unmodifiableList(((ContextRule)this.instance).getProvidedList());
        }

        @Override
        public String getRequested(int n) {
            return ((ContextRule)this.instance).getRequested(n);
        }

        @Override
        public ByteString getRequestedBytes(int n) {
            return ((ContextRule)this.instance).getRequestedBytes(n);
        }

        @Override
        public int getRequestedCount() {
            return ((ContextRule)this.instance).getRequestedCount();
        }

        @Override
        public List<String> getRequestedList() {
            return Collections.unmodifiableList(((ContextRule)this.instance).getRequestedList());
        }

        @Override
        public String getSelector() {
            return ((ContextRule)this.instance).getSelector();
        }

        @Override
        public ByteString getSelectorBytes() {
            return ((ContextRule)this.instance).getSelectorBytes();
        }

        public Builder setProvided(int n, String string2) {
            this.copyOnWrite();
            ((ContextRule)this.instance).setProvided(n, string2);
            return this;
        }

        public Builder setRequested(int n, String string2) {
            this.copyOnWrite();
            ((ContextRule)this.instance).setRequested(n, string2);
            return this;
        }

        public Builder setSelector(String string2) {
            this.copyOnWrite();
            ((ContextRule)this.instance).setSelector(string2);
            return this;
        }

        public Builder setSelectorBytes(ByteString byteString) {
            this.copyOnWrite();
            ((ContextRule)this.instance).setSelectorBytes(byteString);
            return this;
        }
    }

}

