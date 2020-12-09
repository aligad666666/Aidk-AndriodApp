/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.CodedOutputStream
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageLite
 *  com.google.protobuf.GeneratedMessageLite$Builder
 *  com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser
 *  com.google.protobuf.GeneratedMessageLite$MethodToInvoke
 *  com.google.protobuf.GeneratedMessageLite$Visitor
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.Parser
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.Class
 *  java.lang.NoSuchFieldError
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.UnsupportedOperationException
 */
package com.google.api;

import com.google.api.DocumentationRuleOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;

public final class DocumentationRule
extends GeneratedMessageLite<DocumentationRule, Builder>
implements DocumentationRuleOrBuilder {
    private static final DocumentationRule DEFAULT_INSTANCE = new DocumentationRule();
    public static final int DEPRECATION_DESCRIPTION_FIELD_NUMBER = 3;
    public static final int DESCRIPTION_FIELD_NUMBER = 2;
    private static volatile Parser<DocumentationRule> PARSER;
    public static final int SELECTOR_FIELD_NUMBER = 1;
    private String deprecationDescription_ = "";
    private String description_ = "";
    private String selector_ = "";

    static {
        DEFAULT_INSTANCE.makeImmutable();
    }

    private DocumentationRule() {
    }

    private void clearDeprecationDescription() {
        this.deprecationDescription_ = DocumentationRule.getDefaultInstance().getDeprecationDescription();
    }

    private void clearDescription() {
        this.description_ = DocumentationRule.getDefaultInstance().getDescription();
    }

    private void clearSelector() {
        this.selector_ = DocumentationRule.getDefaultInstance().getSelector();
    }

    public static DocumentationRule getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(DocumentationRule documentationRule) {
        return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)documentationRule);
    }

    public static DocumentationRule parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DocumentationRule)DocumentationRule.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static DocumentationRule parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DocumentationRule)DocumentationRule.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static DocumentationRule parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DocumentationRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static DocumentationRule parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DocumentationRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static DocumentationRule parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DocumentationRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static DocumentationRule parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DocumentationRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static DocumentationRule parseFrom(InputStream inputStream) throws IOException {
        return (DocumentationRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static DocumentationRule parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DocumentationRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static DocumentationRule parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (DocumentationRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static DocumentationRule parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DocumentationRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<DocumentationRule> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setDeprecationDescription(String string2) {
        if (string2 != null) {
            this.deprecationDescription_ = string2;
            return;
        }
        throw new NullPointerException();
    }

    private void setDeprecationDescriptionBytes(ByteString byteString) {
        if (byteString != null) {
            DocumentationRule.checkByteStringIsUtf8((ByteString)byteString);
            this.deprecationDescription_ = byteString.toStringUtf8();
            return;
        }
        throw new NullPointerException();
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
            DocumentationRule.checkByteStringIsUtf8((ByteString)byteString);
            this.description_ = byteString.toStringUtf8();
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
            DocumentationRule.checkByteStringIsUtf8((ByteString)byteString);
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
                Class<DocumentationRule> class_ = DocumentationRule.class;
                // MONITORENTER : com.google.api.DocumentationRule.class
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
                                this.deprecationDescription_ = codedInputStream.readStringRequireUtf8();
                                continue;
                            }
                            this.description_ = codedInputStream.readStringRequireUtf8();
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
                DocumentationRule documentationRule = (DocumentationRule)object2;
                this.selector_ = visitor.visitString(true ^ this.selector_.isEmpty(), this.selector_, true ^ documentationRule.selector_.isEmpty(), documentationRule.selector_);
                this.description_ = visitor.visitString(true ^ this.description_.isEmpty(), this.description_, true ^ documentationRule.description_.isEmpty(), documentationRule.description_);
                this.deprecationDescription_ = visitor.visitString(true ^ this.deprecationDescription_.isEmpty(), this.deprecationDescription_, true ^ documentationRule.deprecationDescription_.isEmpty(), documentationRule.deprecationDescription_);
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
        return new DocumentationRule();
    }

    @Override
    public String getDeprecationDescription() {
        return this.deprecationDescription_;
    }

    @Override
    public ByteString getDeprecationDescriptionBytes() {
        return ByteString.copyFromUtf8((String)this.deprecationDescription_);
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
        if (!this.description_.isEmpty()) {
            n2 += CodedOutputStream.computeStringSize((int)2, (String)this.getDescription());
        }
        if (!this.deprecationDescription_.isEmpty()) {
            n2 += CodedOutputStream.computeStringSize((int)3, (String)this.getDeprecationDescription());
        }
        this.memoizedSerializedSize = n2;
        return n2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.selector_.isEmpty()) {
            codedOutputStream.writeString(1, this.getSelector());
        }
        if (!this.description_.isEmpty()) {
            codedOutputStream.writeString(2, this.getDescription());
        }
        if (!this.deprecationDescription_.isEmpty()) {
            codedOutputStream.writeString(3, this.getDeprecationDescription());
        }
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<DocumentationRule, Builder>
    implements DocumentationRuleOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder clearDeprecationDescription() {
            this.copyOnWrite();
            ((DocumentationRule)this.instance).clearDeprecationDescription();
            return this;
        }

        public Builder clearDescription() {
            this.copyOnWrite();
            ((DocumentationRule)this.instance).clearDescription();
            return this;
        }

        public Builder clearSelector() {
            this.copyOnWrite();
            ((DocumentationRule)this.instance).clearSelector();
            return this;
        }

        @Override
        public String getDeprecationDescription() {
            return ((DocumentationRule)this.instance).getDeprecationDescription();
        }

        @Override
        public ByteString getDeprecationDescriptionBytes() {
            return ((DocumentationRule)this.instance).getDeprecationDescriptionBytes();
        }

        @Override
        public String getDescription() {
            return ((DocumentationRule)this.instance).getDescription();
        }

        @Override
        public ByteString getDescriptionBytes() {
            return ((DocumentationRule)this.instance).getDescriptionBytes();
        }

        @Override
        public String getSelector() {
            return ((DocumentationRule)this.instance).getSelector();
        }

        @Override
        public ByteString getSelectorBytes() {
            return ((DocumentationRule)this.instance).getSelectorBytes();
        }

        public Builder setDeprecationDescription(String string2) {
            this.copyOnWrite();
            ((DocumentationRule)this.instance).setDeprecationDescription(string2);
            return this;
        }

        public Builder setDeprecationDescriptionBytes(ByteString byteString) {
            this.copyOnWrite();
            ((DocumentationRule)this.instance).setDeprecationDescriptionBytes(byteString);
            return this;
        }

        public Builder setDescription(String string2) {
            this.copyOnWrite();
            ((DocumentationRule)this.instance).setDescription(string2);
            return this;
        }

        public Builder setDescriptionBytes(ByteString byteString) {
            this.copyOnWrite();
            ((DocumentationRule)this.instance).setDescriptionBytes(byteString);
            return this;
        }

        public Builder setSelector(String string2) {
            this.copyOnWrite();
            ((DocumentationRule)this.instance).setSelector(string2);
            return this;
        }

        public Builder setSelectorBytes(ByteString byteString) {
            this.copyOnWrite();
            ((DocumentationRule)this.instance).setSelectorBytes(byteString);
            return this;
        }
    }

}

