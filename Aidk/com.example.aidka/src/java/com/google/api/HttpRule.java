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
 *  com.google.protobuf.Internal$EnumLite
 *  com.google.protobuf.Internal$ProtobufList
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.Parser
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.Class
 *  java.lang.Deprecated
 *  java.lang.Enum
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

import com.google.api.CustomHttpPattern;
import com.google.api.HttpRuleOrBuilder;
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

public final class HttpRule
extends GeneratedMessageLite<HttpRule, Builder>
implements HttpRuleOrBuilder {
    public static final int ADDITIONAL_BINDINGS_FIELD_NUMBER = 11;
    public static final int BODY_FIELD_NUMBER = 7;
    public static final int CUSTOM_FIELD_NUMBER = 8;
    private static final HttpRule DEFAULT_INSTANCE = new HttpRule();
    public static final int DELETE_FIELD_NUMBER = 5;
    public static final int GET_FIELD_NUMBER = 2;
    private static volatile Parser<HttpRule> PARSER;
    public static final int PATCH_FIELD_NUMBER = 6;
    public static final int POST_FIELD_NUMBER = 4;
    public static final int PUT_FIELD_NUMBER = 3;
    public static final int SELECTOR_FIELD_NUMBER = 1;
    private Internal.ProtobufList<HttpRule> additionalBindings_ = HttpRule.emptyProtobufList();
    private int bitField0_;
    private String body_ = "";
    private int patternCase_ = 0;
    private Object pattern_;
    private String selector_ = "";

    static {
        DEFAULT_INSTANCE.makeImmutable();
    }

    private HttpRule() {
    }

    private void addAdditionalBindings(int n, Builder builder) {
        this.ensureAdditionalBindingsIsMutable();
        this.additionalBindings_.add(n, (Object)((HttpRule)builder.build()));
    }

    private void addAdditionalBindings(int n, HttpRule httpRule) {
        if (httpRule != null) {
            this.ensureAdditionalBindingsIsMutable();
            this.additionalBindings_.add(n, (Object)httpRule);
            return;
        }
        throw new NullPointerException();
    }

    private void addAdditionalBindings(Builder builder) {
        this.ensureAdditionalBindingsIsMutable();
        this.additionalBindings_.add((Object)((HttpRule)builder.build()));
    }

    private void addAdditionalBindings(HttpRule httpRule) {
        if (httpRule != null) {
            this.ensureAdditionalBindingsIsMutable();
            this.additionalBindings_.add((Object)httpRule);
            return;
        }
        throw new NullPointerException();
    }

    private void addAllAdditionalBindings(Iterable<? extends HttpRule> iterable) {
        this.ensureAdditionalBindingsIsMutable();
        AbstractMessageLite.addAll(iterable, this.additionalBindings_);
    }

    private void clearAdditionalBindings() {
        this.additionalBindings_ = HttpRule.emptyProtobufList();
    }

    private void clearBody() {
        this.body_ = HttpRule.getDefaultInstance().getBody();
    }

    private void clearCustom() {
        if (this.patternCase_ == 8) {
            this.patternCase_ = 0;
            this.pattern_ = null;
        }
    }

    private void clearDelete() {
        if (this.patternCase_ == 5) {
            this.patternCase_ = 0;
            this.pattern_ = null;
        }
    }

    private void clearGet() {
        if (this.patternCase_ == 2) {
            this.patternCase_ = 0;
            this.pattern_ = null;
        }
    }

    private void clearPatch() {
        if (this.patternCase_ == 6) {
            this.patternCase_ = 0;
            this.pattern_ = null;
        }
    }

    private void clearPattern() {
        this.patternCase_ = 0;
        this.pattern_ = null;
    }

    private void clearPost() {
        if (this.patternCase_ == 4) {
            this.patternCase_ = 0;
            this.pattern_ = null;
        }
    }

    private void clearPut() {
        if (this.patternCase_ == 3) {
            this.patternCase_ = 0;
            this.pattern_ = null;
        }
    }

    private void clearSelector() {
        this.selector_ = HttpRule.getDefaultInstance().getSelector();
    }

    private void ensureAdditionalBindingsIsMutable() {
        if (!this.additionalBindings_.isModifiable()) {
            this.additionalBindings_ = GeneratedMessageLite.mutableCopy(this.additionalBindings_);
        }
    }

    public static HttpRule getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeCustom(CustomHttpPattern customHttpPattern) {
        this.pattern_ = this.patternCase_ == 8 && this.pattern_ != CustomHttpPattern.getDefaultInstance() ? ((CustomHttpPattern.Builder)CustomHttpPattern.newBuilder((CustomHttpPattern)this.pattern_).mergeFrom((GeneratedMessageLite)customHttpPattern)).buildPartial() : customHttpPattern;
        this.patternCase_ = 8;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(HttpRule httpRule) {
        return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)httpRule);
    }

    public static HttpRule parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (HttpRule)HttpRule.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static HttpRule parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (HttpRule)HttpRule.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static HttpRule parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (HttpRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static HttpRule parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (HttpRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static HttpRule parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (HttpRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static HttpRule parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (HttpRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static HttpRule parseFrom(InputStream inputStream) throws IOException {
        return (HttpRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static HttpRule parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (HttpRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static HttpRule parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (HttpRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static HttpRule parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (HttpRule)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<HttpRule> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeAdditionalBindings(int n) {
        this.ensureAdditionalBindingsIsMutable();
        this.additionalBindings_.remove(n);
    }

    private void setAdditionalBindings(int n, Builder builder) {
        this.ensureAdditionalBindingsIsMutable();
        this.additionalBindings_.set(n, (Object)((HttpRule)builder.build()));
    }

    private void setAdditionalBindings(int n, HttpRule httpRule) {
        if (httpRule != null) {
            this.ensureAdditionalBindingsIsMutable();
            this.additionalBindings_.set(n, (Object)httpRule);
            return;
        }
        throw new NullPointerException();
    }

    private void setBody(String string2) {
        if (string2 != null) {
            this.body_ = string2;
            return;
        }
        throw new NullPointerException();
    }

    private void setBodyBytes(ByteString byteString) {
        if (byteString != null) {
            HttpRule.checkByteStringIsUtf8((ByteString)byteString);
            this.body_ = byteString.toStringUtf8();
            return;
        }
        throw new NullPointerException();
    }

    private void setCustom(CustomHttpPattern.Builder builder) {
        this.pattern_ = builder.build();
        this.patternCase_ = 8;
    }

    private void setCustom(CustomHttpPattern customHttpPattern) {
        if (customHttpPattern != null) {
            this.pattern_ = customHttpPattern;
            this.patternCase_ = 8;
            return;
        }
        throw new NullPointerException();
    }

    private void setDelete(String string2) {
        if (string2 != null) {
            this.patternCase_ = 5;
            this.pattern_ = string2;
            return;
        }
        throw new NullPointerException();
    }

    private void setDeleteBytes(ByteString byteString) {
        if (byteString != null) {
            HttpRule.checkByteStringIsUtf8((ByteString)byteString);
            this.patternCase_ = 5;
            this.pattern_ = byteString.toStringUtf8();
            return;
        }
        throw new NullPointerException();
    }

    private void setGet(String string2) {
        if (string2 != null) {
            this.patternCase_ = 2;
            this.pattern_ = string2;
            return;
        }
        throw new NullPointerException();
    }

    private void setGetBytes(ByteString byteString) {
        if (byteString != null) {
            HttpRule.checkByteStringIsUtf8((ByteString)byteString);
            this.patternCase_ = 2;
            this.pattern_ = byteString.toStringUtf8();
            return;
        }
        throw new NullPointerException();
    }

    private void setPatch(String string2) {
        if (string2 != null) {
            this.patternCase_ = 6;
            this.pattern_ = string2;
            return;
        }
        throw new NullPointerException();
    }

    private void setPatchBytes(ByteString byteString) {
        if (byteString != null) {
            HttpRule.checkByteStringIsUtf8((ByteString)byteString);
            this.patternCase_ = 6;
            this.pattern_ = byteString.toStringUtf8();
            return;
        }
        throw new NullPointerException();
    }

    private void setPost(String string2) {
        if (string2 != null) {
            this.patternCase_ = 4;
            this.pattern_ = string2;
            return;
        }
        throw new NullPointerException();
    }

    private void setPostBytes(ByteString byteString) {
        if (byteString != null) {
            HttpRule.checkByteStringIsUtf8((ByteString)byteString);
            this.patternCase_ = 4;
            this.pattern_ = byteString.toStringUtf8();
            return;
        }
        throw new NullPointerException();
    }

    private void setPut(String string2) {
        if (string2 != null) {
            this.patternCase_ = 3;
            this.pattern_ = string2;
            return;
        }
        throw new NullPointerException();
    }

    private void setPutBytes(ByteString byteString) {
        if (byteString != null) {
            HttpRule.checkByteStringIsUtf8((ByteString)byteString);
            this.patternCase_ = 3;
            this.pattern_ = byteString.toStringUtf8();
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
            HttpRule.checkByteStringIsUtf8((ByteString)byteString);
            this.selector_ = byteString.toStringUtf8();
            return;
        }
        throw new NullPointerException();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke var1_1, Object var2_2, Object var3_3) {
        switch (1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[var1_1.ordinal()]) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 8: {
                if (HttpRule.PARSER != null) return HttpRule.PARSER;
                var26_4 = HttpRule.class;
                // MONITORENTER : com.google.api.HttpRule.class
                if (HttpRule.PARSER == null) {
                    HttpRule.PARSER = new GeneratedMessageLite.DefaultInstanceBasedParser((GeneratedMessageLite)HttpRule.DEFAULT_INSTANCE);
                }
                // MONITOREXIT : var26_4
                return HttpRule.PARSER;
            }
            case 6: {
                var9_5 = (CodedInputStream)var2_2;
                var10_6 = (ExtensionRegistryLite)var3_3;
                var11_7 = false;
                while (var11_7 == false) {
                    var15_8 = var9_5.readTag();
                    if (var15_8 != 0) {
                        if (var15_8 != 10) {
                            if (var15_8 != 18) {
                                if (var15_8 != 26) {
                                    if (var15_8 != 34) {
                                        if (var15_8 != 42) {
                                            if (var15_8 != 50) {
                                                if (var15_8 != 58) {
                                                    if (var15_8 != 66) {
                                                        if (var15_8 != 90) {
                                                            if (var9_5.skipField(var15_8)) continue;
                                                            var11_7 = true;
                                                            continue;
                                                        }
                                                        if (!this.additionalBindings_.isModifiable()) {
                                                            this.additionalBindings_ = GeneratedMessageLite.mutableCopy(this.additionalBindings_);
                                                        }
                                                        this.additionalBindings_.add((Object)((HttpRule)var9_5.readMessage(HttpRule.parser(), var10_6)));
                                                        continue;
                                                    }
                                                    var21_14 = this.patternCase_;
                                                    var22_15 = null;
                                                    if (var21_14 == 8) {
                                                        var22_15 = (CustomHttpPattern.Builder)((CustomHttpPattern)this.pattern_).toBuilder();
                                                    }
                                                    this.pattern_ = var9_5.readMessage(CustomHttpPattern.parser(), var10_6);
                                                    if (var22_15 != null) {
                                                        var22_15.mergeFrom((GeneratedMessageLite)((CustomHttpPattern)this.pattern_));
                                                        this.pattern_ = var22_15.buildPartial();
                                                    }
                                                    this.patternCase_ = 8;
                                                    continue;
                                                }
                                                this.body_ = var9_5.readStringRequireUtf8();
                                                continue;
                                            }
                                            var20_13 = var9_5.readStringRequireUtf8();
                                            this.patternCase_ = 6;
                                            this.pattern_ = var20_13;
                                            continue;
                                        }
                                        var19_12 = var9_5.readStringRequireUtf8();
                                        this.patternCase_ = 5;
                                        this.pattern_ = var19_12;
                                        continue;
                                    }
                                    var18_11 = var9_5.readStringRequireUtf8();
                                    this.patternCase_ = 4;
                                    this.pattern_ = var18_11;
                                    continue;
                                }
                                var17_10 = var9_5.readStringRequireUtf8();
                                this.patternCase_ = 3;
                                this.pattern_ = var17_10;
                                continue;
                            }
                            var16_9 = var9_5.readStringRequireUtf8();
                            this.patternCase_ = 2;
                            this.pattern_ = var16_9;
                            continue;
                        }
                        this.selector_ = var9_5.readStringRequireUtf8();
                        continue;
                    }
                    var11_7 = true;
                    continue;
                    catch (IOException var14_17) {
                        throw new RuntimeException((Throwable)new InvalidProtocolBufferException(var14_17.getMessage()).setUnfinishedMessage((MessageLite)this));
                    }
                    catch (InvalidProtocolBufferException var12_18) {
                        throw new RuntimeException((Throwable)var12_18.setUnfinishedMessage((MessageLite)this));
                    }
                }
                return HttpRule.DEFAULT_INSTANCE;
            }
            case 7: {
                return HttpRule.DEFAULT_INSTANCE;
            }
            case 5: {
                var4_19 = (GeneratedMessageLite.Visitor)var2_2;
                var5_20 = (HttpRule)var3_3;
                var6_21 = this.selector_.isEmpty();
                var7_22 = true;
                this.selector_ = var4_19.visitString(var6_21 ^ var7_22, this.selector_, var7_22 ^ var5_20.selector_.isEmpty(), var5_20.selector_);
                this.body_ = var4_19.visitString(var7_22 ^ this.body_.isEmpty(), this.body_, var7_22 ^ var5_20.body_.isEmpty(), var5_20.body_);
                this.additionalBindings_ = var4_19.visitList(this.additionalBindings_, var5_20.additionalBindings_);
                switch (1.$SwitchMap$com$google$api$HttpRule$PatternCase[var5_20.getPatternCase().ordinal()]) {
                    default: {
                        ** break;
                    }
                    case 7: {
                        if (this.patternCase_ == 0) {
                            var7_22 = false;
                        }
                        var4_19.visitOneofNotSet(var7_22);
                        ** break;
                    }
                    case 6: {
                        if (this.patternCase_ != 8) {
                            var7_22 = false;
                        }
                        this.pattern_ = var4_19.visitOneofMessage(var7_22, this.pattern_, var5_20.pattern_);
                        ** break;
                    }
                    case 5: {
                        if (this.patternCase_ != 6) {
                            var7_22 = false;
                        }
                        this.pattern_ = var4_19.visitOneofString(var7_22, this.pattern_, var5_20.pattern_);
                        ** break;
                    }
                    case 4: {
                        if (this.patternCase_ != 5) {
                            var7_22 = false;
                        }
                        this.pattern_ = var4_19.visitOneofString(var7_22, this.pattern_, var5_20.pattern_);
                        ** break;
                    }
                    case 3: {
                        if (this.patternCase_ != 4) {
                            var7_22 = false;
                        }
                        this.pattern_ = var4_19.visitOneofString(var7_22, this.pattern_, var5_20.pattern_);
                        ** break;
                    }
                    case 2: {
                        if (this.patternCase_ != 3) {
                            var7_22 = false;
                        }
                        this.pattern_ = var4_19.visitOneofString(var7_22, this.pattern_, var5_20.pattern_);
                        ** break;
                    }
                    case 1: 
                }
                if (this.patternCase_ != 2) {
                    var7_22 = false;
                }
                this.pattern_ = var4_19.visitOneofString(var7_22, this.pattern_, var5_20.pattern_);
lbl127: // 8 sources:
                if (var4_19 != GeneratedMessageLite.MergeFromVisitor.INSTANCE) return this;
                var8_23 = var5_20.patternCase_;
                if (var8_23 != 0) {
                    this.patternCase_ = var8_23;
                }
                this.bitField0_ |= var5_20.bitField0_;
                return this;
            }
            case 4: {
                return new Builder();
            }
            case 3: {
                this.additionalBindings_.makeImmutable();
                return null;
            }
            case 2: {
                return HttpRule.DEFAULT_INSTANCE;
            }
            case 1: 
        }
        return new HttpRule();
    }

    @Override
    public HttpRule getAdditionalBindings(int n) {
        return (HttpRule)this.additionalBindings_.get(n);
    }

    @Override
    public int getAdditionalBindingsCount() {
        return this.additionalBindings_.size();
    }

    @Override
    public List<HttpRule> getAdditionalBindingsList() {
        return this.additionalBindings_;
    }

    public HttpRuleOrBuilder getAdditionalBindingsOrBuilder(int n) {
        return (HttpRuleOrBuilder)this.additionalBindings_.get(n);
    }

    public List<? extends HttpRuleOrBuilder> getAdditionalBindingsOrBuilderList() {
        return this.additionalBindings_;
    }

    @Override
    public String getBody() {
        return this.body_;
    }

    @Override
    public ByteString getBodyBytes() {
        return ByteString.copyFromUtf8((String)this.body_);
    }

    @Override
    public CustomHttpPattern getCustom() {
        if (this.patternCase_ == 8) {
            return (CustomHttpPattern)this.pattern_;
        }
        return CustomHttpPattern.getDefaultInstance();
    }

    @Override
    public String getDelete() {
        String string2 = "";
        if (this.patternCase_ == 5) {
            string2 = (String)this.pattern_;
        }
        return string2;
    }

    @Override
    public ByteString getDeleteBytes() {
        String string2 = "";
        if (this.patternCase_ == 5) {
            string2 = (String)this.pattern_;
        }
        return ByteString.copyFromUtf8((String)string2);
    }

    @Override
    public String getGet() {
        String string2 = "";
        if (this.patternCase_ == 2) {
            string2 = (String)this.pattern_;
        }
        return string2;
    }

    @Override
    public ByteString getGetBytes() {
        String string2 = "";
        if (this.patternCase_ == 2) {
            string2 = (String)this.pattern_;
        }
        return ByteString.copyFromUtf8((String)string2);
    }

    @Override
    public String getPatch() {
        String string2 = "";
        if (this.patternCase_ == 6) {
            string2 = (String)this.pattern_;
        }
        return string2;
    }

    @Override
    public ByteString getPatchBytes() {
        String string2 = "";
        if (this.patternCase_ == 6) {
            string2 = (String)this.pattern_;
        }
        return ByteString.copyFromUtf8((String)string2);
    }

    @Override
    public PatternCase getPatternCase() {
        return PatternCase.forNumber(this.patternCase_);
    }

    @Override
    public String getPost() {
        String string2 = "";
        if (this.patternCase_ == 4) {
            string2 = (String)this.pattern_;
        }
        return string2;
    }

    @Override
    public ByteString getPostBytes() {
        String string2 = "";
        if (this.patternCase_ == 4) {
            string2 = (String)this.pattern_;
        }
        return ByteString.copyFromUtf8((String)string2);
    }

    @Override
    public String getPut() {
        String string2 = "";
        if (this.patternCase_ == 3) {
            string2 = (String)this.pattern_;
        }
        return string2;
    }

    @Override
    public ByteString getPutBytes() {
        String string2 = "";
        if (this.patternCase_ == 3) {
            string2 = (String)this.pattern_;
        }
        return ByteString.copyFromUtf8((String)string2);
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
        if (this.patternCase_ == 2) {
            n2 += CodedOutputStream.computeStringSize((int)2, (String)this.getGet());
        }
        if (this.patternCase_ == 3) {
            n2 += CodedOutputStream.computeStringSize((int)3, (String)this.getPut());
        }
        if (this.patternCase_ == 4) {
            n2 += CodedOutputStream.computeStringSize((int)4, (String)this.getPost());
        }
        if (this.patternCase_ == 5) {
            n2 += CodedOutputStream.computeStringSize((int)5, (String)this.getDelete());
        }
        if (this.patternCase_ == 6) {
            n2 += CodedOutputStream.computeStringSize((int)6, (String)this.getPatch());
        }
        if (!this.body_.isEmpty()) {
            n2 += CodedOutputStream.computeStringSize((int)7, (String)this.getBody());
        }
        if (this.patternCase_ == 8) {
            n2 += CodedOutputStream.computeMessageSize((int)8, (MessageLite)((CustomHttpPattern)this.pattern_));
        }
        for (int i = 0; i < this.additionalBindings_.size(); ++i) {
            n2 += CodedOutputStream.computeMessageSize((int)11, (MessageLite)((MessageLite)this.additionalBindings_.get(i)));
        }
        this.memoizedSerializedSize = n2;
        return n2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.selector_.isEmpty()) {
            codedOutputStream.writeString(1, this.getSelector());
        }
        if (this.patternCase_ == 2) {
            codedOutputStream.writeString(2, this.getGet());
        }
        if (this.patternCase_ == 3) {
            codedOutputStream.writeString(3, this.getPut());
        }
        if (this.patternCase_ == 4) {
            codedOutputStream.writeString(4, this.getPost());
        }
        if (this.patternCase_ == 5) {
            codedOutputStream.writeString(5, this.getDelete());
        }
        if (this.patternCase_ == 6) {
            codedOutputStream.writeString(6, this.getPatch());
        }
        if (!this.body_.isEmpty()) {
            codedOutputStream.writeString(7, this.getBody());
        }
        if (this.patternCase_ == 8) {
            codedOutputStream.writeMessage(8, (MessageLite)((CustomHttpPattern)this.pattern_));
        }
        for (int i = 0; i < this.additionalBindings_.size(); ++i) {
            codedOutputStream.writeMessage(11, (MessageLite)this.additionalBindings_.get(i));
        }
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<HttpRule, Builder>
    implements HttpRuleOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder addAdditionalBindings(int n, Builder builder) {
            this.copyOnWrite();
            ((HttpRule)this.instance).addAdditionalBindings(n, builder);
            return this;
        }

        public Builder addAdditionalBindings(int n, HttpRule httpRule) {
            this.copyOnWrite();
            ((HttpRule)this.instance).addAdditionalBindings(n, httpRule);
            return this;
        }

        public Builder addAdditionalBindings(Builder builder) {
            this.copyOnWrite();
            ((HttpRule)this.instance).addAdditionalBindings(builder);
            return this;
        }

        public Builder addAdditionalBindings(HttpRule httpRule) {
            this.copyOnWrite();
            ((HttpRule)this.instance).addAdditionalBindings(httpRule);
            return this;
        }

        public Builder addAllAdditionalBindings(Iterable<? extends HttpRule> iterable) {
            this.copyOnWrite();
            ((HttpRule)this.instance).addAllAdditionalBindings((Iterable<? extends HttpRule>)iterable);
            return this;
        }

        public Builder clearAdditionalBindings() {
            this.copyOnWrite();
            ((HttpRule)this.instance).clearAdditionalBindings();
            return this;
        }

        public Builder clearBody() {
            this.copyOnWrite();
            ((HttpRule)this.instance).clearBody();
            return this;
        }

        public Builder clearCustom() {
            this.copyOnWrite();
            ((HttpRule)this.instance).clearCustom();
            return this;
        }

        public Builder clearDelete() {
            this.copyOnWrite();
            ((HttpRule)this.instance).clearDelete();
            return this;
        }

        public Builder clearGet() {
            this.copyOnWrite();
            ((HttpRule)this.instance).clearGet();
            return this;
        }

        public Builder clearPatch() {
            this.copyOnWrite();
            ((HttpRule)this.instance).clearPatch();
            return this;
        }

        public Builder clearPattern() {
            this.copyOnWrite();
            ((HttpRule)this.instance).clearPattern();
            return this;
        }

        public Builder clearPost() {
            this.copyOnWrite();
            ((HttpRule)this.instance).clearPost();
            return this;
        }

        public Builder clearPut() {
            this.copyOnWrite();
            ((HttpRule)this.instance).clearPut();
            return this;
        }

        public Builder clearSelector() {
            this.copyOnWrite();
            ((HttpRule)this.instance).clearSelector();
            return this;
        }

        @Override
        public HttpRule getAdditionalBindings(int n) {
            return ((HttpRule)this.instance).getAdditionalBindings(n);
        }

        @Override
        public int getAdditionalBindingsCount() {
            return ((HttpRule)this.instance).getAdditionalBindingsCount();
        }

        @Override
        public List<HttpRule> getAdditionalBindingsList() {
            return Collections.unmodifiableList(((HttpRule)this.instance).getAdditionalBindingsList());
        }

        @Override
        public String getBody() {
            return ((HttpRule)this.instance).getBody();
        }

        @Override
        public ByteString getBodyBytes() {
            return ((HttpRule)this.instance).getBodyBytes();
        }

        @Override
        public CustomHttpPattern getCustom() {
            return ((HttpRule)this.instance).getCustom();
        }

        @Override
        public String getDelete() {
            return ((HttpRule)this.instance).getDelete();
        }

        @Override
        public ByteString getDeleteBytes() {
            return ((HttpRule)this.instance).getDeleteBytes();
        }

        @Override
        public String getGet() {
            return ((HttpRule)this.instance).getGet();
        }

        @Override
        public ByteString getGetBytes() {
            return ((HttpRule)this.instance).getGetBytes();
        }

        @Override
        public String getPatch() {
            return ((HttpRule)this.instance).getPatch();
        }

        @Override
        public ByteString getPatchBytes() {
            return ((HttpRule)this.instance).getPatchBytes();
        }

        @Override
        public PatternCase getPatternCase() {
            return ((HttpRule)this.instance).getPatternCase();
        }

        @Override
        public String getPost() {
            return ((HttpRule)this.instance).getPost();
        }

        @Override
        public ByteString getPostBytes() {
            return ((HttpRule)this.instance).getPostBytes();
        }

        @Override
        public String getPut() {
            return ((HttpRule)this.instance).getPut();
        }

        @Override
        public ByteString getPutBytes() {
            return ((HttpRule)this.instance).getPutBytes();
        }

        @Override
        public String getSelector() {
            return ((HttpRule)this.instance).getSelector();
        }

        @Override
        public ByteString getSelectorBytes() {
            return ((HttpRule)this.instance).getSelectorBytes();
        }

        public Builder mergeCustom(CustomHttpPattern customHttpPattern) {
            this.copyOnWrite();
            ((HttpRule)this.instance).mergeCustom(customHttpPattern);
            return this;
        }

        public Builder removeAdditionalBindings(int n) {
            this.copyOnWrite();
            ((HttpRule)this.instance).removeAdditionalBindings(n);
            return this;
        }

        public Builder setAdditionalBindings(int n, Builder builder) {
            this.copyOnWrite();
            ((HttpRule)this.instance).setAdditionalBindings(n, builder);
            return this;
        }

        public Builder setAdditionalBindings(int n, HttpRule httpRule) {
            this.copyOnWrite();
            ((HttpRule)this.instance).setAdditionalBindings(n, httpRule);
            return this;
        }

        public Builder setBody(String string2) {
            this.copyOnWrite();
            ((HttpRule)this.instance).setBody(string2);
            return this;
        }

        public Builder setBodyBytes(ByteString byteString) {
            this.copyOnWrite();
            ((HttpRule)this.instance).setBodyBytes(byteString);
            return this;
        }

        public Builder setCustom(CustomHttpPattern.Builder builder) {
            this.copyOnWrite();
            ((HttpRule)this.instance).setCustom(builder);
            return this;
        }

        public Builder setCustom(CustomHttpPattern customHttpPattern) {
            this.copyOnWrite();
            ((HttpRule)this.instance).setCustom(customHttpPattern);
            return this;
        }

        public Builder setDelete(String string2) {
            this.copyOnWrite();
            ((HttpRule)this.instance).setDelete(string2);
            return this;
        }

        public Builder setDeleteBytes(ByteString byteString) {
            this.copyOnWrite();
            ((HttpRule)this.instance).setDeleteBytes(byteString);
            return this;
        }

        public Builder setGet(String string2) {
            this.copyOnWrite();
            ((HttpRule)this.instance).setGet(string2);
            return this;
        }

        public Builder setGetBytes(ByteString byteString) {
            this.copyOnWrite();
            ((HttpRule)this.instance).setGetBytes(byteString);
            return this;
        }

        public Builder setPatch(String string2) {
            this.copyOnWrite();
            ((HttpRule)this.instance).setPatch(string2);
            return this;
        }

        public Builder setPatchBytes(ByteString byteString) {
            this.copyOnWrite();
            ((HttpRule)this.instance).setPatchBytes(byteString);
            return this;
        }

        public Builder setPost(String string2) {
            this.copyOnWrite();
            ((HttpRule)this.instance).setPost(string2);
            return this;
        }

        public Builder setPostBytes(ByteString byteString) {
            this.copyOnWrite();
            ((HttpRule)this.instance).setPostBytes(byteString);
            return this;
        }

        public Builder setPut(String string2) {
            this.copyOnWrite();
            ((HttpRule)this.instance).setPut(string2);
            return this;
        }

        public Builder setPutBytes(ByteString byteString) {
            this.copyOnWrite();
            ((HttpRule)this.instance).setPutBytes(byteString);
            return this;
        }

        public Builder setSelector(String string2) {
            this.copyOnWrite();
            ((HttpRule)this.instance).setSelector(string2);
            return this;
        }

        public Builder setSelectorBytes(ByteString byteString) {
            this.copyOnWrite();
            ((HttpRule)this.instance).setSelectorBytes(byteString);
            return this;
        }
    }

    public static final class PatternCase
    extends Enum<PatternCase>
    implements Internal.EnumLite {
        private static final /* synthetic */ PatternCase[] $VALUES;
        public static final /* enum */ PatternCase CUSTOM;
        public static final /* enum */ PatternCase DELETE;
        public static final /* enum */ PatternCase GET;
        public static final /* enum */ PatternCase PATCH;
        public static final /* enum */ PatternCase PATTERN_NOT_SET;
        public static final /* enum */ PatternCase POST;
        public static final /* enum */ PatternCase PUT;
        private final int value;

        static {
            GET = new PatternCase(2);
            PUT = new PatternCase(3);
            POST = new PatternCase(4);
            DELETE = new PatternCase(5);
            PATCH = new PatternCase(6);
            CUSTOM = new PatternCase(8);
            PATTERN_NOT_SET = new PatternCase(0);
            PatternCase[] arrpatternCase = new PatternCase[]{GET, PUT, POST, DELETE, PATCH, CUSTOM, PATTERN_NOT_SET};
            $VALUES = arrpatternCase;
        }

        private PatternCase(int n2) {
            this.value = n2;
        }

        public static PatternCase forNumber(int n) {
            if (n != 0) {
                if (n != 8) {
                    if (n != 2) {
                        if (n != 3) {
                            if (n != 4) {
                                if (n != 5) {
                                    if (n != 6) {
                                        return null;
                                    }
                                    return PATCH;
                                }
                                return DELETE;
                            }
                            return POST;
                        }
                        return PUT;
                    }
                    return GET;
                }
                return CUSTOM;
            }
            return PATTERN_NOT_SET;
        }

        @Deprecated
        public static PatternCase valueOf(int n) {
            return PatternCase.forNumber(n);
        }

        public static PatternCase valueOf(String string2) {
            return (PatternCase)Enum.valueOf(PatternCase.class, (String)string2);
        }

        public static PatternCase[] values() {
            return (PatternCase[])$VALUES.clone();
        }

        public int getNumber() {
            return this.value;
        }
    }

}

