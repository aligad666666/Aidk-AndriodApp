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
 *  com.google.rpc.Help$1
 *  com.google.rpc.Help$LinkOrBuilder
 *  com.google.rpc.HelpOrBuilder
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.Class
 *  java.lang.Iterable
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.UnsupportedOperationException
 *  java.util.Collections
 *  java.util.List
 */
package com.google.rpc;

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
import com.google.rpc.Help;
import com.google.rpc.HelpOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

public final class Help
extends GeneratedMessageLite<Help, Builder>
implements HelpOrBuilder {
    private static final Help DEFAULT_INSTANCE = new Help();
    public static final int LINKS_FIELD_NUMBER = 1;
    private static volatile Parser<Help> PARSER;
    private Internal.ProtobufList<Link> links_ = Help.emptyProtobufList();

    static {
        DEFAULT_INSTANCE.makeImmutable();
    }

    private Help() {
    }

    private void addAllLinks(Iterable<? extends Link> iterable) {
        this.ensureLinksIsMutable();
        AbstractMessageLite.addAll(iterable, this.links_);
    }

    private void addLinks(int n, Link.Builder builder) {
        this.ensureLinksIsMutable();
        this.links_.add(n, (Object)((Link)builder.build()));
    }

    private void addLinks(int n, Link link) {
        if (link != null) {
            this.ensureLinksIsMutable();
            this.links_.add(n, (Object)link);
            return;
        }
        throw new NullPointerException();
    }

    private void addLinks(Link.Builder builder) {
        this.ensureLinksIsMutable();
        this.links_.add((Object)((Link)builder.build()));
    }

    private void addLinks(Link link) {
        if (link != null) {
            this.ensureLinksIsMutable();
            this.links_.add((Object)link);
            return;
        }
        throw new NullPointerException();
    }

    private void clearLinks() {
        this.links_ = Help.emptyProtobufList();
    }

    private void ensureLinksIsMutable() {
        if (!this.links_.isModifiable()) {
            this.links_ = GeneratedMessageLite.mutableCopy(this.links_);
        }
    }

    public static Help getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(Help help) {
        return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)help);
    }

    public static Help parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Help)Help.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Help parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Help)Help.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Help parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Help)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static Help parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Help)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Help parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Help)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static Help parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Help)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Help parseFrom(InputStream inputStream) throws IOException {
        return (Help)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Help parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Help)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Help parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (Help)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static Help parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Help)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<Help> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeLinks(int n) {
        this.ensureLinksIsMutable();
        this.links_.remove(n);
    }

    private void setLinks(int n, Link.Builder builder) {
        this.ensureLinksIsMutable();
        this.links_.set(n, (Object)((Link)builder.build()));
    }

    private void setLinks(int n, Link link) {
        if (link != null) {
            this.ensureLinksIsMutable();
            this.links_.set(n, (Object)link);
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
                Class<Help> class_ = Help.class;
                // MONITORENTER : com.google.rpc.Help.class
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
                        if (!this.links_.isModifiable()) {
                            this.links_ = GeneratedMessageLite.mutableCopy(this.links_);
                        }
                        this.links_.add((Object)((Link)codedInputStream.readMessage(Link.parser(), extensionRegistryLite)));
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
                Help help = (Help)((Object)object2);
                this.links_ = visitor.visitList(this.links_, help.links_);
                return this;
            }
            case 4: {
                return new Builder();
            }
            case 3: {
                this.links_.makeImmutable();
                return null;
            }
            case 2: {
                return DEFAULT_INSTANCE;
            }
            case 1: 
        }
        return new Help();
    }

    public Link getLinks(int n) {
        return (Link)((Object)this.links_.get(n));
    }

    public int getLinksCount() {
        return this.links_.size();
    }

    public List<Link> getLinksList() {
        return this.links_;
    }

    public LinkOrBuilder getLinksOrBuilder(int n) {
        return this.links_.get(n);
    }

    public List<? extends LinkOrBuilder> getLinksOrBuilderList() {
        return this.links_;
    }

    public int getSerializedSize() {
        int n = this.memoizedSerializedSize;
        if (n != -1) {
            return n;
        }
        int n2 = 0;
        for (int i = 0; i < this.links_.size(); ++i) {
            n2 += CodedOutputStream.computeMessageSize((int)1, (MessageLite)((MessageLite)this.links_.get(i)));
        }
        this.memoizedSerializedSize = n2;
        return n2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.links_.size(); ++i) {
            codedOutputStream.writeMessage(1, (MessageLite)this.links_.get(i));
        }
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<Help, Builder>
    implements HelpOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder addAllLinks(Iterable<? extends Link> iterable) {
            this.copyOnWrite();
            ((Help)this.instance).addAllLinks((Iterable<? extends Link>)iterable);
            return this;
        }

        public Builder addLinks(int n, Link.Builder builder) {
            this.copyOnWrite();
            ((Help)this.instance).addLinks(n, builder);
            return this;
        }

        public Builder addLinks(int n, Link link) {
            this.copyOnWrite();
            ((Help)this.instance).addLinks(n, link);
            return this;
        }

        public Builder addLinks(Link.Builder builder) {
            this.copyOnWrite();
            ((Help)this.instance).addLinks(builder);
            return this;
        }

        public Builder addLinks(Link link) {
            this.copyOnWrite();
            ((Help)this.instance).addLinks(link);
            return this;
        }

        public Builder clearLinks() {
            this.copyOnWrite();
            ((Help)this.instance).clearLinks();
            return this;
        }

        public Link getLinks(int n) {
            return ((Help)this.instance).getLinks(n);
        }

        public int getLinksCount() {
            return ((Help)this.instance).getLinksCount();
        }

        public List<Link> getLinksList() {
            return Collections.unmodifiableList(((Help)this.instance).getLinksList());
        }

        public Builder removeLinks(int n) {
            this.copyOnWrite();
            ((Help)this.instance).removeLinks(n);
            return this;
        }

        public Builder setLinks(int n, Link.Builder builder) {
            this.copyOnWrite();
            ((Help)this.instance).setLinks(n, builder);
            return this;
        }

        public Builder setLinks(int n, Link link) {
            this.copyOnWrite();
            ((Help)this.instance).setLinks(n, link);
            return this;
        }
    }

    public static final class Link
    extends GeneratedMessageLite<Link, Builder>
    implements LinkOrBuilder {
        private static final Link DEFAULT_INSTANCE = new Link();
        public static final int DESCRIPTION_FIELD_NUMBER = 1;
        private static volatile Parser<Link> PARSER;
        public static final int URL_FIELD_NUMBER = 2;
        private String description_ = "";
        private String url_ = "";

        static {
            DEFAULT_INSTANCE.makeImmutable();
        }

        private Link() {
        }

        private void clearDescription() {
            this.description_ = Link.getDefaultInstance().getDescription();
        }

        private void clearUrl() {
            this.url_ = Link.getDefaultInstance().getUrl();
        }

        public static Link getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(Link link) {
            return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)link);
        }

        public static Link parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Link)Link.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static Link parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Link)Link.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Link parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Link)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
        }

        public static Link parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Link)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Link parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Link)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
        }

        public static Link parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Link)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Link parseFrom(InputStream inputStream) throws IOException {
            return (Link)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static Link parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Link)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Link parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
            return (Link)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
        }

        public static Link parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Link)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Parser<Link> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setDescription(String string) {
            if (string != null) {
                this.description_ = string;
                return;
            }
            throw new NullPointerException();
        }

        private void setDescriptionBytes(ByteString byteString) {
            if (byteString != null) {
                Link.checkByteStringIsUtf8((ByteString)byteString);
                this.description_ = byteString.toStringUtf8();
                return;
            }
            throw new NullPointerException();
        }

        private void setUrl(String string) {
            if (string != null) {
                this.url_ = string;
                return;
            }
            throw new NullPointerException();
        }

        private void setUrlBytes(ByteString byteString) {
            if (byteString != null) {
                Link.checkByteStringIsUtf8((ByteString)byteString);
                this.url_ = byteString.toStringUtf8();
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
                    Class<Link> class_ = Link.class;
                    // MONITORENTER : com.google.rpc.Help$Link.class
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
                                    if (codedInputStream.skipField(n)) continue;
                                    bl = true;
                                    continue;
                                }
                                this.url_ = codedInputStream.readStringRequireUtf8();
                                continue;
                            }
                            this.description_ = codedInputStream.readStringRequireUtf8();
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
                    Link link = (Link)((Object)object2);
                    this.description_ = visitor.visitString(true ^ this.description_.isEmpty(), this.description_, true ^ link.description_.isEmpty(), link.description_);
                    this.url_ = visitor.visitString(true ^ this.url_.isEmpty(), this.url_, true ^ link.url_.isEmpty(), link.url_);
                    return this;
                }
                case 4: {
                    return new Builder();
                }
                case 3: {
                    return null;
                }
                case 2: {
                    return DEFAULT_INSTANCE;
                }
                case 1: 
            }
            return new Link();
        }

        public String getDescription() {
            return this.description_;
        }

        public ByteString getDescriptionBytes() {
            return ByteString.copyFromUtf8((String)this.description_);
        }

        public int getSerializedSize() {
            int n = this.memoizedSerializedSize;
            if (n != -1) {
                return n;
            }
            boolean bl = this.description_.isEmpty();
            int n2 = 0;
            if (!bl) {
                n2 = 0 + CodedOutputStream.computeStringSize((int)1, (String)this.getDescription());
            }
            if (!this.url_.isEmpty()) {
                n2 += CodedOutputStream.computeStringSize((int)2, (String)this.getUrl());
            }
            this.memoizedSerializedSize = n2;
            return n2;
        }

        public String getUrl() {
            return this.url_;
        }

        public ByteString getUrlBytes() {
            return ByteString.copyFromUtf8((String)this.url_);
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.description_.isEmpty()) {
                codedOutputStream.writeString(1, this.getDescription());
            }
            if (!this.url_.isEmpty()) {
                codedOutputStream.writeString(2, this.getUrl());
            }
        }

        public static final class Builder
        extends GeneratedMessageLite.Builder<Link, Builder>
        implements LinkOrBuilder {
            private Builder() {
                super((GeneratedMessageLite)DEFAULT_INSTANCE);
            }

            public Builder clearDescription() {
                this.copyOnWrite();
                ((Link)this.instance).clearDescription();
                return this;
            }

            public Builder clearUrl() {
                this.copyOnWrite();
                ((Link)this.instance).clearUrl();
                return this;
            }

            public String getDescription() {
                return ((Link)this.instance).getDescription();
            }

            public ByteString getDescriptionBytes() {
                return ((Link)this.instance).getDescriptionBytes();
            }

            public String getUrl() {
                return ((Link)this.instance).getUrl();
            }

            public ByteString getUrlBytes() {
                return ((Link)this.instance).getUrlBytes();
            }

            public Builder setDescription(String string) {
                this.copyOnWrite();
                ((Link)this.instance).setDescription(string);
                return this;
            }

            public Builder setDescriptionBytes(ByteString byteString) {
                this.copyOnWrite();
                ((Link)this.instance).setDescriptionBytes(byteString);
                return this;
            }

            public Builder setUrl(String string) {
                this.copyOnWrite();
                ((Link)this.instance).setUrl(string);
                return this;
            }

            public Builder setUrlBytes(ByteString byteString) {
                this.copyOnWrite();
                ((Link)this.instance).setUrlBytes(byteString);
                return this;
            }
        }

    }

}

