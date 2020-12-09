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

import com.google.api.PageOrBuilder;
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

public final class Page
extends GeneratedMessageLite<Page, Builder>
implements PageOrBuilder {
    public static final int CONTENT_FIELD_NUMBER = 2;
    private static final Page DEFAULT_INSTANCE = new Page();
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<Page> PARSER;
    public static final int SUBPAGES_FIELD_NUMBER = 3;
    private int bitField0_;
    private String content_ = "";
    private String name_ = "";
    private Internal.ProtobufList<Page> subpages_ = Page.emptyProtobufList();

    static {
        DEFAULT_INSTANCE.makeImmutable();
    }

    private Page() {
    }

    private void addAllSubpages(Iterable<? extends Page> iterable) {
        this.ensureSubpagesIsMutable();
        AbstractMessageLite.addAll(iterable, this.subpages_);
    }

    private void addSubpages(int n, Builder builder) {
        this.ensureSubpagesIsMutable();
        this.subpages_.add(n, (Object)((Page)builder.build()));
    }

    private void addSubpages(int n, Page page) {
        if (page != null) {
            this.ensureSubpagesIsMutable();
            this.subpages_.add(n, (Object)page);
            return;
        }
        throw new NullPointerException();
    }

    private void addSubpages(Builder builder) {
        this.ensureSubpagesIsMutable();
        this.subpages_.add((Object)((Page)builder.build()));
    }

    private void addSubpages(Page page) {
        if (page != null) {
            this.ensureSubpagesIsMutable();
            this.subpages_.add((Object)page);
            return;
        }
        throw new NullPointerException();
    }

    private void clearContent() {
        this.content_ = Page.getDefaultInstance().getContent();
    }

    private void clearName() {
        this.name_ = Page.getDefaultInstance().getName();
    }

    private void clearSubpages() {
        this.subpages_ = Page.emptyProtobufList();
    }

    private void ensureSubpagesIsMutable() {
        if (!this.subpages_.isModifiable()) {
            this.subpages_ = GeneratedMessageLite.mutableCopy(this.subpages_);
        }
    }

    public static Page getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(Page page) {
        return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)page);
    }

    public static Page parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Page)Page.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Page parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Page)Page.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Page parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Page)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static Page parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Page)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Page parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Page)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static Page parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Page)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Page parseFrom(InputStream inputStream) throws IOException {
        return (Page)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Page parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Page)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Page parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (Page)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static Page parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Page)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<Page> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeSubpages(int n) {
        this.ensureSubpagesIsMutable();
        this.subpages_.remove(n);
    }

    private void setContent(String string2) {
        if (string2 != null) {
            this.content_ = string2;
            return;
        }
        throw new NullPointerException();
    }

    private void setContentBytes(ByteString byteString) {
        if (byteString != null) {
            Page.checkByteStringIsUtf8((ByteString)byteString);
            this.content_ = byteString.toStringUtf8();
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
            Page.checkByteStringIsUtf8((ByteString)byteString);
            this.name_ = byteString.toStringUtf8();
            return;
        }
        throw new NullPointerException();
    }

    private void setSubpages(int n, Builder builder) {
        this.ensureSubpagesIsMutable();
        this.subpages_.set(n, (Object)((Page)builder.build()));
    }

    private void setSubpages(int n, Page page) {
        if (page != null) {
            this.ensureSubpagesIsMutable();
            this.subpages_.set(n, (Object)page);
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
                Class<Page> class_ = Page.class;
                // MONITORENTER : com.google.api.Page.class
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
                                    if (codedInputStream.skipField(n)) continue;
                                    bl = true;
                                    continue;
                                }
                                if (!this.subpages_.isModifiable()) {
                                    this.subpages_ = GeneratedMessageLite.mutableCopy(this.subpages_);
                                }
                                this.subpages_.add((Object)((Page)codedInputStream.readMessage(Page.parser(), extensionRegistryLite)));
                                continue;
                            }
                            this.content_ = codedInputStream.readStringRequireUtf8();
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
                Page page = (Page)object2;
                this.name_ = visitor.visitString(true ^ this.name_.isEmpty(), this.name_, true ^ page.name_.isEmpty(), page.name_);
                this.content_ = visitor.visitString(true ^ this.content_.isEmpty(), this.content_, true ^ page.content_.isEmpty(), page.content_);
                this.subpages_ = visitor.visitList(this.subpages_, page.subpages_);
                if (visitor != GeneratedMessageLite.MergeFromVisitor.INSTANCE) return this;
                this.bitField0_ |= page.bitField0_;
                return this;
            }
            case 4: {
                return new Builder();
            }
            case 3: {
                this.subpages_.makeImmutable();
                return null;
            }
            case 2: {
                return DEFAULT_INSTANCE;
            }
            case 1: 
        }
        return new Page();
    }

    @Override
    public String getContent() {
        return this.content_;
    }

    @Override
    public ByteString getContentBytes() {
        return ByteString.copyFromUtf8((String)this.content_);
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
        if (!this.content_.isEmpty()) {
            n2 += CodedOutputStream.computeStringSize((int)2, (String)this.getContent());
        }
        for (int i = 0; i < this.subpages_.size(); ++i) {
            n2 += CodedOutputStream.computeMessageSize((int)3, (MessageLite)((MessageLite)this.subpages_.get(i)));
        }
        this.memoizedSerializedSize = n2;
        return n2;
    }

    @Override
    public Page getSubpages(int n) {
        return (Page)this.subpages_.get(n);
    }

    @Override
    public int getSubpagesCount() {
        return this.subpages_.size();
    }

    @Override
    public List<Page> getSubpagesList() {
        return this.subpages_;
    }

    public PageOrBuilder getSubpagesOrBuilder(int n) {
        return (PageOrBuilder)this.subpages_.get(n);
    }

    public List<? extends PageOrBuilder> getSubpagesOrBuilderList() {
        return this.subpages_;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.name_.isEmpty()) {
            codedOutputStream.writeString(1, this.getName());
        }
        if (!this.content_.isEmpty()) {
            codedOutputStream.writeString(2, this.getContent());
        }
        for (int i = 0; i < this.subpages_.size(); ++i) {
            codedOutputStream.writeMessage(3, (MessageLite)this.subpages_.get(i));
        }
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<Page, Builder>
    implements PageOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder addAllSubpages(Iterable<? extends Page> iterable) {
            this.copyOnWrite();
            ((Page)this.instance).addAllSubpages((Iterable<? extends Page>)iterable);
            return this;
        }

        public Builder addSubpages(int n, Builder builder) {
            this.copyOnWrite();
            ((Page)this.instance).addSubpages(n, builder);
            return this;
        }

        public Builder addSubpages(int n, Page page) {
            this.copyOnWrite();
            ((Page)this.instance).addSubpages(n, page);
            return this;
        }

        public Builder addSubpages(Builder builder) {
            this.copyOnWrite();
            ((Page)this.instance).addSubpages(builder);
            return this;
        }

        public Builder addSubpages(Page page) {
            this.copyOnWrite();
            ((Page)this.instance).addSubpages(page);
            return this;
        }

        public Builder clearContent() {
            this.copyOnWrite();
            ((Page)this.instance).clearContent();
            return this;
        }

        public Builder clearName() {
            this.copyOnWrite();
            ((Page)this.instance).clearName();
            return this;
        }

        public Builder clearSubpages() {
            this.copyOnWrite();
            ((Page)this.instance).clearSubpages();
            return this;
        }

        @Override
        public String getContent() {
            return ((Page)this.instance).getContent();
        }

        @Override
        public ByteString getContentBytes() {
            return ((Page)this.instance).getContentBytes();
        }

        @Override
        public String getName() {
            return ((Page)this.instance).getName();
        }

        @Override
        public ByteString getNameBytes() {
            return ((Page)this.instance).getNameBytes();
        }

        @Override
        public Page getSubpages(int n) {
            return ((Page)this.instance).getSubpages(n);
        }

        @Override
        public int getSubpagesCount() {
            return ((Page)this.instance).getSubpagesCount();
        }

        @Override
        public List<Page> getSubpagesList() {
            return Collections.unmodifiableList(((Page)this.instance).getSubpagesList());
        }

        public Builder removeSubpages(int n) {
            this.copyOnWrite();
            ((Page)this.instance).removeSubpages(n);
            return this;
        }

        public Builder setContent(String string2) {
            this.copyOnWrite();
            ((Page)this.instance).setContent(string2);
            return this;
        }

        public Builder setContentBytes(ByteString byteString) {
            this.copyOnWrite();
            ((Page)this.instance).setContentBytes(byteString);
            return this;
        }

        public Builder setName(String string2) {
            this.copyOnWrite();
            ((Page)this.instance).setName(string2);
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            this.copyOnWrite();
            ((Page)this.instance).setNameBytes(byteString);
            return this;
        }

        public Builder setSubpages(int n, Builder builder) {
            this.copyOnWrite();
            ((Page)this.instance).setSubpages(n, builder);
            return this;
        }

        public Builder setSubpages(int n, Page page) {
            this.copyOnWrite();
            ((Page)this.instance).setSubpages(n, page);
            return this;
        }
    }

}

