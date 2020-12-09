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

import com.google.api.DocumentationOrBuilder;
import com.google.api.DocumentationRule;
import com.google.api.DocumentationRuleOrBuilder;
import com.google.api.Page;
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

public final class Documentation
extends GeneratedMessageLite<Documentation, Builder>
implements DocumentationOrBuilder {
    private static final Documentation DEFAULT_INSTANCE = new Documentation();
    public static final int DOCUMENTATION_ROOT_URL_FIELD_NUMBER = 4;
    public static final int OVERVIEW_FIELD_NUMBER = 2;
    public static final int PAGES_FIELD_NUMBER = 5;
    private static volatile Parser<Documentation> PARSER;
    public static final int RULES_FIELD_NUMBER = 3;
    public static final int SUMMARY_FIELD_NUMBER = 1;
    private int bitField0_;
    private String documentationRootUrl_ = "";
    private String overview_ = "";
    private Internal.ProtobufList<Page> pages_ = Documentation.emptyProtobufList();
    private Internal.ProtobufList<DocumentationRule> rules_ = Documentation.emptyProtobufList();
    private String summary_ = "";

    static {
        DEFAULT_INSTANCE.makeImmutable();
    }

    private Documentation() {
    }

    private void addAllPages(Iterable<? extends Page> iterable) {
        this.ensurePagesIsMutable();
        AbstractMessageLite.addAll(iterable, this.pages_);
    }

    private void addAllRules(Iterable<? extends DocumentationRule> iterable) {
        this.ensureRulesIsMutable();
        AbstractMessageLite.addAll(iterable, this.rules_);
    }

    private void addPages(int n, Page.Builder builder) {
        this.ensurePagesIsMutable();
        this.pages_.add(n, (Object)((Page)builder.build()));
    }

    private void addPages(int n, Page page) {
        if (page != null) {
            this.ensurePagesIsMutable();
            this.pages_.add(n, (Object)page);
            return;
        }
        throw new NullPointerException();
    }

    private void addPages(Page.Builder builder) {
        this.ensurePagesIsMutable();
        this.pages_.add((Object)((Page)builder.build()));
    }

    private void addPages(Page page) {
        if (page != null) {
            this.ensurePagesIsMutable();
            this.pages_.add((Object)page);
            return;
        }
        throw new NullPointerException();
    }

    private void addRules(int n, DocumentationRule.Builder builder) {
        this.ensureRulesIsMutable();
        this.rules_.add(n, (Object)((DocumentationRule)builder.build()));
    }

    private void addRules(int n, DocumentationRule documentationRule) {
        if (documentationRule != null) {
            this.ensureRulesIsMutable();
            this.rules_.add(n, (Object)documentationRule);
            return;
        }
        throw new NullPointerException();
    }

    private void addRules(DocumentationRule.Builder builder) {
        this.ensureRulesIsMutable();
        this.rules_.add((Object)((DocumentationRule)builder.build()));
    }

    private void addRules(DocumentationRule documentationRule) {
        if (documentationRule != null) {
            this.ensureRulesIsMutable();
            this.rules_.add((Object)documentationRule);
            return;
        }
        throw new NullPointerException();
    }

    private void clearDocumentationRootUrl() {
        this.documentationRootUrl_ = Documentation.getDefaultInstance().getDocumentationRootUrl();
    }

    private void clearOverview() {
        this.overview_ = Documentation.getDefaultInstance().getOverview();
    }

    private void clearPages() {
        this.pages_ = Documentation.emptyProtobufList();
    }

    private void clearRules() {
        this.rules_ = Documentation.emptyProtobufList();
    }

    private void clearSummary() {
        this.summary_ = Documentation.getDefaultInstance().getSummary();
    }

    private void ensurePagesIsMutable() {
        if (!this.pages_.isModifiable()) {
            this.pages_ = GeneratedMessageLite.mutableCopy(this.pages_);
        }
    }

    private void ensureRulesIsMutable() {
        if (!this.rules_.isModifiable()) {
            this.rules_ = GeneratedMessageLite.mutableCopy(this.rules_);
        }
    }

    public static Documentation getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(Documentation documentation) {
        return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)documentation);
    }

    public static Documentation parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Documentation)Documentation.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Documentation parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Documentation)Documentation.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Documentation parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Documentation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static Documentation parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Documentation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Documentation parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Documentation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static Documentation parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Documentation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Documentation parseFrom(InputStream inputStream) throws IOException {
        return (Documentation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Documentation parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Documentation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Documentation parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (Documentation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static Documentation parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Documentation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<Documentation> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removePages(int n) {
        this.ensurePagesIsMutable();
        this.pages_.remove(n);
    }

    private void removeRules(int n) {
        this.ensureRulesIsMutable();
        this.rules_.remove(n);
    }

    private void setDocumentationRootUrl(String string2) {
        if (string2 != null) {
            this.documentationRootUrl_ = string2;
            return;
        }
        throw new NullPointerException();
    }

    private void setDocumentationRootUrlBytes(ByteString byteString) {
        if (byteString != null) {
            Documentation.checkByteStringIsUtf8((ByteString)byteString);
            this.documentationRootUrl_ = byteString.toStringUtf8();
            return;
        }
        throw new NullPointerException();
    }

    private void setOverview(String string2) {
        if (string2 != null) {
            this.overview_ = string2;
            return;
        }
        throw new NullPointerException();
    }

    private void setOverviewBytes(ByteString byteString) {
        if (byteString != null) {
            Documentation.checkByteStringIsUtf8((ByteString)byteString);
            this.overview_ = byteString.toStringUtf8();
            return;
        }
        throw new NullPointerException();
    }

    private void setPages(int n, Page.Builder builder) {
        this.ensurePagesIsMutable();
        this.pages_.set(n, (Object)((Page)builder.build()));
    }

    private void setPages(int n, Page page) {
        if (page != null) {
            this.ensurePagesIsMutable();
            this.pages_.set(n, (Object)page);
            return;
        }
        throw new NullPointerException();
    }

    private void setRules(int n, DocumentationRule.Builder builder) {
        this.ensureRulesIsMutable();
        this.rules_.set(n, (Object)((DocumentationRule)builder.build()));
    }

    private void setRules(int n, DocumentationRule documentationRule) {
        if (documentationRule != null) {
            this.ensureRulesIsMutable();
            this.rules_.set(n, (Object)documentationRule);
            return;
        }
        throw new NullPointerException();
    }

    private void setSummary(String string2) {
        if (string2 != null) {
            this.summary_ = string2;
            return;
        }
        throw new NullPointerException();
    }

    private void setSummaryBytes(ByteString byteString) {
        if (byteString != null) {
            Documentation.checkByteStringIsUtf8((ByteString)byteString);
            this.summary_ = byteString.toStringUtf8();
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
                Class<Documentation> class_ = Documentation.class;
                // MONITORENTER : com.google.api.Documentation.class
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
                                        if (n != 42) {
                                            if (codedInputStream.skipField(n)) continue;
                                            bl = true;
                                            continue;
                                        }
                                        if (!this.pages_.isModifiable()) {
                                            this.pages_ = GeneratedMessageLite.mutableCopy(this.pages_);
                                        }
                                        this.pages_.add((Object)((Page)codedInputStream.readMessage(Page.parser(), extensionRegistryLite)));
                                        continue;
                                    }
                                    this.documentationRootUrl_ = codedInputStream.readStringRequireUtf8();
                                    continue;
                                }
                                if (!this.rules_.isModifiable()) {
                                    this.rules_ = GeneratedMessageLite.mutableCopy(this.rules_);
                                }
                                this.rules_.add((Object)((DocumentationRule)codedInputStream.readMessage(DocumentationRule.parser(), extensionRegistryLite)));
                                continue;
                            }
                            this.overview_ = codedInputStream.readStringRequireUtf8();
                            continue;
                        }
                        this.summary_ = codedInputStream.readStringRequireUtf8();
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
                Documentation documentation = (Documentation)object2;
                this.summary_ = visitor.visitString(true ^ this.summary_.isEmpty(), this.summary_, true ^ documentation.summary_.isEmpty(), documentation.summary_);
                this.pages_ = visitor.visitList(this.pages_, documentation.pages_);
                this.rules_ = visitor.visitList(this.rules_, documentation.rules_);
                this.documentationRootUrl_ = visitor.visitString(true ^ this.documentationRootUrl_.isEmpty(), this.documentationRootUrl_, true ^ documentation.documentationRootUrl_.isEmpty(), documentation.documentationRootUrl_);
                this.overview_ = visitor.visitString(true ^ this.overview_.isEmpty(), this.overview_, true ^ documentation.overview_.isEmpty(), documentation.overview_);
                if (visitor != GeneratedMessageLite.MergeFromVisitor.INSTANCE) return this;
                this.bitField0_ |= documentation.bitField0_;
                return this;
            }
            case 4: {
                return new Builder();
            }
            case 3: {
                this.pages_.makeImmutable();
                this.rules_.makeImmutable();
                return null;
            }
            case 2: {
                return DEFAULT_INSTANCE;
            }
            case 1: 
        }
        return new Documentation();
    }

    @Override
    public String getDocumentationRootUrl() {
        return this.documentationRootUrl_;
    }

    @Override
    public ByteString getDocumentationRootUrlBytes() {
        return ByteString.copyFromUtf8((String)this.documentationRootUrl_);
    }

    @Override
    public String getOverview() {
        return this.overview_;
    }

    @Override
    public ByteString getOverviewBytes() {
        return ByteString.copyFromUtf8((String)this.overview_);
    }

    @Override
    public Page getPages(int n) {
        return (Page)this.pages_.get(n);
    }

    @Override
    public int getPagesCount() {
        return this.pages_.size();
    }

    @Override
    public List<Page> getPagesList() {
        return this.pages_;
    }

    public PageOrBuilder getPagesOrBuilder(int n) {
        return (PageOrBuilder)this.pages_.get(n);
    }

    public List<? extends PageOrBuilder> getPagesOrBuilderList() {
        return this.pages_;
    }

    @Override
    public DocumentationRule getRules(int n) {
        return (DocumentationRule)this.rules_.get(n);
    }

    @Override
    public int getRulesCount() {
        return this.rules_.size();
    }

    @Override
    public List<DocumentationRule> getRulesList() {
        return this.rules_;
    }

    public DocumentationRuleOrBuilder getRulesOrBuilder(int n) {
        return (DocumentationRuleOrBuilder)this.rules_.get(n);
    }

    public List<? extends DocumentationRuleOrBuilder> getRulesOrBuilderList() {
        return this.rules_;
    }

    public int getSerializedSize() {
        int n = this.memoizedSerializedSize;
        if (n != -1) {
            return n;
        }
        boolean bl = this.summary_.isEmpty();
        int n2 = 0;
        if (!bl) {
            n2 = 0 + CodedOutputStream.computeStringSize((int)1, (String)this.getSummary());
        }
        if (!this.overview_.isEmpty()) {
            n2 += CodedOutputStream.computeStringSize((int)2, (String)this.getOverview());
        }
        for (int i = 0; i < this.rules_.size(); ++i) {
            n2 += CodedOutputStream.computeMessageSize((int)3, (MessageLite)((MessageLite)this.rules_.get(i)));
        }
        if (!this.documentationRootUrl_.isEmpty()) {
            n2 += CodedOutputStream.computeStringSize((int)4, (String)this.getDocumentationRootUrl());
        }
        for (int i = 0; i < this.pages_.size(); ++i) {
            n2 += CodedOutputStream.computeMessageSize((int)5, (MessageLite)((MessageLite)this.pages_.get(i)));
        }
        this.memoizedSerializedSize = n2;
        return n2;
    }

    @Override
    public String getSummary() {
        return this.summary_;
    }

    @Override
    public ByteString getSummaryBytes() {
        return ByteString.copyFromUtf8((String)this.summary_);
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.summary_.isEmpty()) {
            codedOutputStream.writeString(1, this.getSummary());
        }
        if (!this.overview_.isEmpty()) {
            codedOutputStream.writeString(2, this.getOverview());
        }
        for (int i = 0; i < this.rules_.size(); ++i) {
            codedOutputStream.writeMessage(3, (MessageLite)this.rules_.get(i));
        }
        if (!this.documentationRootUrl_.isEmpty()) {
            codedOutputStream.writeString(4, this.getDocumentationRootUrl());
        }
        for (int i = 0; i < this.pages_.size(); ++i) {
            codedOutputStream.writeMessage(5, (MessageLite)this.pages_.get(i));
        }
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<Documentation, Builder>
    implements DocumentationOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder addAllPages(Iterable<? extends Page> iterable) {
            this.copyOnWrite();
            ((Documentation)this.instance).addAllPages((Iterable<? extends Page>)iterable);
            return this;
        }

        public Builder addAllRules(Iterable<? extends DocumentationRule> iterable) {
            this.copyOnWrite();
            ((Documentation)this.instance).addAllRules((Iterable<? extends DocumentationRule>)iterable);
            return this;
        }

        public Builder addPages(int n, Page.Builder builder) {
            this.copyOnWrite();
            ((Documentation)this.instance).addPages(n, builder);
            return this;
        }

        public Builder addPages(int n, Page page) {
            this.copyOnWrite();
            ((Documentation)this.instance).addPages(n, page);
            return this;
        }

        public Builder addPages(Page.Builder builder) {
            this.copyOnWrite();
            ((Documentation)this.instance).addPages(builder);
            return this;
        }

        public Builder addPages(Page page) {
            this.copyOnWrite();
            ((Documentation)this.instance).addPages(page);
            return this;
        }

        public Builder addRules(int n, DocumentationRule.Builder builder) {
            this.copyOnWrite();
            ((Documentation)this.instance).addRules(n, builder);
            return this;
        }

        public Builder addRules(int n, DocumentationRule documentationRule) {
            this.copyOnWrite();
            ((Documentation)this.instance).addRules(n, documentationRule);
            return this;
        }

        public Builder addRules(DocumentationRule.Builder builder) {
            this.copyOnWrite();
            ((Documentation)this.instance).addRules(builder);
            return this;
        }

        public Builder addRules(DocumentationRule documentationRule) {
            this.copyOnWrite();
            ((Documentation)this.instance).addRules(documentationRule);
            return this;
        }

        public Builder clearDocumentationRootUrl() {
            this.copyOnWrite();
            ((Documentation)this.instance).clearDocumentationRootUrl();
            return this;
        }

        public Builder clearOverview() {
            this.copyOnWrite();
            ((Documentation)this.instance).clearOverview();
            return this;
        }

        public Builder clearPages() {
            this.copyOnWrite();
            ((Documentation)this.instance).clearPages();
            return this;
        }

        public Builder clearRules() {
            this.copyOnWrite();
            ((Documentation)this.instance).clearRules();
            return this;
        }

        public Builder clearSummary() {
            this.copyOnWrite();
            ((Documentation)this.instance).clearSummary();
            return this;
        }

        @Override
        public String getDocumentationRootUrl() {
            return ((Documentation)this.instance).getDocumentationRootUrl();
        }

        @Override
        public ByteString getDocumentationRootUrlBytes() {
            return ((Documentation)this.instance).getDocumentationRootUrlBytes();
        }

        @Override
        public String getOverview() {
            return ((Documentation)this.instance).getOverview();
        }

        @Override
        public ByteString getOverviewBytes() {
            return ((Documentation)this.instance).getOverviewBytes();
        }

        @Override
        public Page getPages(int n) {
            return ((Documentation)this.instance).getPages(n);
        }

        @Override
        public int getPagesCount() {
            return ((Documentation)this.instance).getPagesCount();
        }

        @Override
        public List<Page> getPagesList() {
            return Collections.unmodifiableList(((Documentation)this.instance).getPagesList());
        }

        @Override
        public DocumentationRule getRules(int n) {
            return ((Documentation)this.instance).getRules(n);
        }

        @Override
        public int getRulesCount() {
            return ((Documentation)this.instance).getRulesCount();
        }

        @Override
        public List<DocumentationRule> getRulesList() {
            return Collections.unmodifiableList(((Documentation)this.instance).getRulesList());
        }

        @Override
        public String getSummary() {
            return ((Documentation)this.instance).getSummary();
        }

        @Override
        public ByteString getSummaryBytes() {
            return ((Documentation)this.instance).getSummaryBytes();
        }

        public Builder removePages(int n) {
            this.copyOnWrite();
            ((Documentation)this.instance).removePages(n);
            return this;
        }

        public Builder removeRules(int n) {
            this.copyOnWrite();
            ((Documentation)this.instance).removeRules(n);
            return this;
        }

        public Builder setDocumentationRootUrl(String string2) {
            this.copyOnWrite();
            ((Documentation)this.instance).setDocumentationRootUrl(string2);
            return this;
        }

        public Builder setDocumentationRootUrlBytes(ByteString byteString) {
            this.copyOnWrite();
            ((Documentation)this.instance).setDocumentationRootUrlBytes(byteString);
            return this;
        }

        public Builder setOverview(String string2) {
            this.copyOnWrite();
            ((Documentation)this.instance).setOverview(string2);
            return this;
        }

        public Builder setOverviewBytes(ByteString byteString) {
            this.copyOnWrite();
            ((Documentation)this.instance).setOverviewBytes(byteString);
            return this;
        }

        public Builder setPages(int n, Page.Builder builder) {
            this.copyOnWrite();
            ((Documentation)this.instance).setPages(n, builder);
            return this;
        }

        public Builder setPages(int n, Page page) {
            this.copyOnWrite();
            ((Documentation)this.instance).setPages(n, page);
            return this;
        }

        public Builder setRules(int n, DocumentationRule.Builder builder) {
            this.copyOnWrite();
            ((Documentation)this.instance).setRules(n, builder);
            return this;
        }

        public Builder setRules(int n, DocumentationRule documentationRule) {
            this.copyOnWrite();
            ((Documentation)this.instance).setRules(n, documentationRule);
            return this;
        }

        public Builder setSummary(String string2) {
            this.copyOnWrite();
            ((Documentation)this.instance).setSummary(string2);
            return this;
        }

        public Builder setSummaryBytes(ByteString byteString) {
            this.copyOnWrite();
            ((Documentation)this.instance).setSummaryBytes(byteString);
            return this;
        }
    }

}

