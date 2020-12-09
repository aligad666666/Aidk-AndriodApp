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

import com.google.api.LabelDescriptor;
import com.google.api.LabelDescriptorOrBuilder;
import com.google.api.LogDescriptorOrBuilder;
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

public final class LogDescriptor
extends GeneratedMessageLite<LogDescriptor, Builder>
implements LogDescriptorOrBuilder {
    private static final LogDescriptor DEFAULT_INSTANCE = new LogDescriptor();
    public static final int DESCRIPTION_FIELD_NUMBER = 3;
    public static final int DISPLAY_NAME_FIELD_NUMBER = 4;
    public static final int LABELS_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<LogDescriptor> PARSER;
    private int bitField0_;
    private String description_ = "";
    private String displayName_ = "";
    private Internal.ProtobufList<LabelDescriptor> labels_ = LogDescriptor.emptyProtobufList();
    private String name_ = "";

    static {
        DEFAULT_INSTANCE.makeImmutable();
    }

    private LogDescriptor() {
    }

    private void addAllLabels(Iterable<? extends LabelDescriptor> iterable) {
        this.ensureLabelsIsMutable();
        AbstractMessageLite.addAll(iterable, this.labels_);
    }

    private void addLabels(int n, LabelDescriptor.Builder builder) {
        this.ensureLabelsIsMutable();
        this.labels_.add(n, (Object)((LabelDescriptor)builder.build()));
    }

    private void addLabels(int n, LabelDescriptor labelDescriptor) {
        if (labelDescriptor != null) {
            this.ensureLabelsIsMutable();
            this.labels_.add(n, (Object)labelDescriptor);
            return;
        }
        throw new NullPointerException();
    }

    private void addLabels(LabelDescriptor.Builder builder) {
        this.ensureLabelsIsMutable();
        this.labels_.add((Object)((LabelDescriptor)builder.build()));
    }

    private void addLabels(LabelDescriptor labelDescriptor) {
        if (labelDescriptor != null) {
            this.ensureLabelsIsMutable();
            this.labels_.add((Object)labelDescriptor);
            return;
        }
        throw new NullPointerException();
    }

    private void clearDescription() {
        this.description_ = LogDescriptor.getDefaultInstance().getDescription();
    }

    private void clearDisplayName() {
        this.displayName_ = LogDescriptor.getDefaultInstance().getDisplayName();
    }

    private void clearLabels() {
        this.labels_ = LogDescriptor.emptyProtobufList();
    }

    private void clearName() {
        this.name_ = LogDescriptor.getDefaultInstance().getName();
    }

    private void ensureLabelsIsMutable() {
        if (!this.labels_.isModifiable()) {
            this.labels_ = GeneratedMessageLite.mutableCopy(this.labels_);
        }
    }

    public static LogDescriptor getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(LogDescriptor logDescriptor) {
        return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)logDescriptor);
    }

    public static LogDescriptor parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (LogDescriptor)LogDescriptor.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static LogDescriptor parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LogDescriptor)LogDescriptor.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static LogDescriptor parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (LogDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static LogDescriptor parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LogDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static LogDescriptor parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (LogDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static LogDescriptor parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LogDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static LogDescriptor parseFrom(InputStream inputStream) throws IOException {
        return (LogDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static LogDescriptor parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LogDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static LogDescriptor parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (LogDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static LogDescriptor parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LogDescriptor)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<LogDescriptor> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeLabels(int n) {
        this.ensureLabelsIsMutable();
        this.labels_.remove(n);
    }

    private void setDescription(String string2) {
        if (string2 != null) {
            this.description_ = string2;
            return;
        }
        throw new NullPointerException();
    }

    private void setDescriptionBytes(ByteString byteString) {
        if (byteString != null) {
            LogDescriptor.checkByteStringIsUtf8((ByteString)byteString);
            this.description_ = byteString.toStringUtf8();
            return;
        }
        throw new NullPointerException();
    }

    private void setDisplayName(String string2) {
        if (string2 != null) {
            this.displayName_ = string2;
            return;
        }
        throw new NullPointerException();
    }

    private void setDisplayNameBytes(ByteString byteString) {
        if (byteString != null) {
            LogDescriptor.checkByteStringIsUtf8((ByteString)byteString);
            this.displayName_ = byteString.toStringUtf8();
            return;
        }
        throw new NullPointerException();
    }

    private void setLabels(int n, LabelDescriptor.Builder builder) {
        this.ensureLabelsIsMutable();
        this.labels_.set(n, (Object)((LabelDescriptor)builder.build()));
    }

    private void setLabels(int n, LabelDescriptor labelDescriptor) {
        if (labelDescriptor != null) {
            this.ensureLabelsIsMutable();
            this.labels_.set(n, (Object)labelDescriptor);
            return;
        }
        throw new NullPointerException();
    }

    private void setName(String string2) {
        if (string2 != null) {
            this.name_ = string2;
            return;
        }
        throw new NullPointerException();
    }

    private void setNameBytes(ByteString byteString) {
        if (byteString != null) {
            LogDescriptor.checkByteStringIsUtf8((ByteString)byteString);
            this.name_ = byteString.toStringUtf8();
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
                Class<LogDescriptor> class_ = LogDescriptor.class;
                // MONITORENTER : com.google.api.LogDescriptor.class
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
                                    if (n != 34) {
                                        if (codedInputStream.skipField(n)) continue;
                                        bl = true;
                                        continue;
                                    }
                                    this.displayName_ = codedInputStream.readStringRequireUtf8();
                                    continue;
                                }
                                this.description_ = codedInputStream.readStringRequireUtf8();
                                continue;
                            }
                            if (!this.labels_.isModifiable()) {
                                this.labels_ = GeneratedMessageLite.mutableCopy(this.labels_);
                            }
                            this.labels_.add((Object)((LabelDescriptor)codedInputStream.readMessage(LabelDescriptor.parser(), extensionRegistryLite)));
                            continue;
                        }
                        this.name_ = codedInputStream.readStringRequireUtf8();
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
                LogDescriptor logDescriptor = (LogDescriptor)object2;
                this.name_ = visitor.visitString(true ^ this.name_.isEmpty(), this.name_, true ^ logDescriptor.name_.isEmpty(), logDescriptor.name_);
                this.labels_ = visitor.visitList(this.labels_, logDescriptor.labels_);
                this.description_ = visitor.visitString(true ^ this.description_.isEmpty(), this.description_, true ^ logDescriptor.description_.isEmpty(), logDescriptor.description_);
                this.displayName_ = visitor.visitString(true ^ this.displayName_.isEmpty(), this.displayName_, true ^ logDescriptor.displayName_.isEmpty(), logDescriptor.displayName_);
                if (visitor != GeneratedMessageLite.MergeFromVisitor.INSTANCE) return this;
                this.bitField0_ |= logDescriptor.bitField0_;
                return this;
            }
            case 4: {
                return new Builder();
            }
            case 3: {
                this.labels_.makeImmutable();
                return null;
            }
            case 2: {
                return DEFAULT_INSTANCE;
            }
            case 1: 
        }
        return new LogDescriptor();
    }

    @Override
    public String getDescription() {
        return this.description_;
    }

    @Override
    public ByteString getDescriptionBytes() {
        return ByteString.copyFromUtf8((String)this.description_);
    }

    @Override
    public String getDisplayName() {
        return this.displayName_;
    }

    @Override
    public ByteString getDisplayNameBytes() {
        return ByteString.copyFromUtf8((String)this.displayName_);
    }

    @Override
    public LabelDescriptor getLabels(int n) {
        return (LabelDescriptor)this.labels_.get(n);
    }

    @Override
    public int getLabelsCount() {
        return this.labels_.size();
    }

    @Override
    public List<LabelDescriptor> getLabelsList() {
        return this.labels_;
    }

    public LabelDescriptorOrBuilder getLabelsOrBuilder(int n) {
        return (LabelDescriptorOrBuilder)this.labels_.get(n);
    }

    public List<? extends LabelDescriptorOrBuilder> getLabelsOrBuilderList() {
        return this.labels_;
    }

    @Override
    public String getName() {
        return this.name_;
    }

    @Override
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8((String)this.name_);
    }

    public int getSerializedSize() {
        int n = this.memoizedSerializedSize;
        if (n != -1) {
            return n;
        }
        boolean bl = this.name_.isEmpty();
        int n2 = 0;
        if (!bl) {
            n2 = 0 + CodedOutputStream.computeStringSize((int)1, (String)this.getName());
        }
        for (int i = 0; i < this.labels_.size(); ++i) {
            n2 += CodedOutputStream.computeMessageSize((int)2, (MessageLite)((MessageLite)this.labels_.get(i)));
        }
        if (!this.description_.isEmpty()) {
            n2 += CodedOutputStream.computeStringSize((int)3, (String)this.getDescription());
        }
        if (!this.displayName_.isEmpty()) {
            n2 += CodedOutputStream.computeStringSize((int)4, (String)this.getDisplayName());
        }
        this.memoizedSerializedSize = n2;
        return n2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.name_.isEmpty()) {
            codedOutputStream.writeString(1, this.getName());
        }
        for (int i = 0; i < this.labels_.size(); ++i) {
            codedOutputStream.writeMessage(2, (MessageLite)this.labels_.get(i));
        }
        if (!this.description_.isEmpty()) {
            codedOutputStream.writeString(3, this.getDescription());
        }
        if (!this.displayName_.isEmpty()) {
            codedOutputStream.writeString(4, this.getDisplayName());
        }
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<LogDescriptor, Builder>
    implements LogDescriptorOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder addAllLabels(Iterable<? extends LabelDescriptor> iterable) {
            this.copyOnWrite();
            ((LogDescriptor)this.instance).addAllLabels((Iterable<? extends LabelDescriptor>)iterable);
            return this;
        }

        public Builder addLabels(int n, LabelDescriptor.Builder builder) {
            this.copyOnWrite();
            ((LogDescriptor)this.instance).addLabels(n, builder);
            return this;
        }

        public Builder addLabels(int n, LabelDescriptor labelDescriptor) {
            this.copyOnWrite();
            ((LogDescriptor)this.instance).addLabels(n, labelDescriptor);
            return this;
        }

        public Builder addLabels(LabelDescriptor.Builder builder) {
            this.copyOnWrite();
            ((LogDescriptor)this.instance).addLabels(builder);
            return this;
        }

        public Builder addLabels(LabelDescriptor labelDescriptor) {
            this.copyOnWrite();
            ((LogDescriptor)this.instance).addLabels(labelDescriptor);
            return this;
        }

        public Builder clearDescription() {
            this.copyOnWrite();
            ((LogDescriptor)this.instance).clearDescription();
            return this;
        }

        public Builder clearDisplayName() {
            this.copyOnWrite();
            ((LogDescriptor)this.instance).clearDisplayName();
            return this;
        }

        public Builder clearLabels() {
            this.copyOnWrite();
            ((LogDescriptor)this.instance).clearLabels();
            return this;
        }

        public Builder clearName() {
            this.copyOnWrite();
            ((LogDescriptor)this.instance).clearName();
            return this;
        }

        @Override
        public String getDescription() {
            return ((LogDescriptor)this.instance).getDescription();
        }

        @Override
        public ByteString getDescriptionBytes() {
            return ((LogDescriptor)this.instance).getDescriptionBytes();
        }

        @Override
        public String getDisplayName() {
            return ((LogDescriptor)this.instance).getDisplayName();
        }

        @Override
        public ByteString getDisplayNameBytes() {
            return ((LogDescriptor)this.instance).getDisplayNameBytes();
        }

        @Override
        public LabelDescriptor getLabels(int n) {
            return ((LogDescriptor)this.instance).getLabels(n);
        }

        @Override
        public int getLabelsCount() {
            return ((LogDescriptor)this.instance).getLabelsCount();
        }

        @Override
        public List<LabelDescriptor> getLabelsList() {
            return Collections.unmodifiableList(((LogDescriptor)this.instance).getLabelsList());
        }

        @Override
        public String getName() {
            return ((LogDescriptor)this.instance).getName();
        }

        @Override
        public ByteString getNameBytes() {
            return ((LogDescriptor)this.instance).getNameBytes();
        }

        public Builder removeLabels(int n) {
            this.copyOnWrite();
            ((LogDescriptor)this.instance).removeLabels(n);
            return this;
        }

        public Builder setDescription(String string2) {
            this.copyOnWrite();
            ((LogDescriptor)this.instance).setDescription(string2);
            return this;
        }

        public Builder setDescriptionBytes(ByteString byteString) {
            this.copyOnWrite();
            ((LogDescriptor)this.instance).setDescriptionBytes(byteString);
            return this;
        }

        public Builder setDisplayName(String string2) {
            this.copyOnWrite();
            ((LogDescriptor)this.instance).setDisplayName(string2);
            return this;
        }

        public Builder setDisplayNameBytes(ByteString byteString) {
            this.copyOnWrite();
            ((LogDescriptor)this.instance).setDisplayNameBytes(byteString);
            return this;
        }

        public Builder setLabels(int n, LabelDescriptor.Builder builder) {
            this.copyOnWrite();
            ((LogDescriptor)this.instance).setLabels(n, builder);
            return this;
        }

        public Builder setLabels(int n, LabelDescriptor labelDescriptor) {
            this.copyOnWrite();
            ((LogDescriptor)this.instance).setLabels(n, labelDescriptor);
            return this;
        }

        public Builder setName(String string2) {
            this.copyOnWrite();
            ((LogDescriptor)this.instance).setName(string2);
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            this.copyOnWrite();
            ((LogDescriptor)this.instance).setNameBytes(byteString);
            return this;
        }
    }

}

