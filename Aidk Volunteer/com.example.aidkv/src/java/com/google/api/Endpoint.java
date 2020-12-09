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

import com.google.api.EndpointOrBuilder;
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

public final class Endpoint
extends GeneratedMessageLite<Endpoint, Builder>
implements EndpointOrBuilder {
    public static final int ALIASES_FIELD_NUMBER = 2;
    public static final int ALLOW_CORS_FIELD_NUMBER = 5;
    public static final int APIS_FIELD_NUMBER = 3;
    private static final Endpoint DEFAULT_INSTANCE = new Endpoint();
    public static final int FEATURES_FIELD_NUMBER = 4;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<Endpoint> PARSER;
    public static final int TARGET_FIELD_NUMBER = 101;
    private Internal.ProtobufList<String> aliases_ = GeneratedMessageLite.emptyProtobufList();
    private boolean allowCors_;
    private Internal.ProtobufList<String> apis_ = GeneratedMessageLite.emptyProtobufList();
    private int bitField0_;
    private Internal.ProtobufList<String> features_ = GeneratedMessageLite.emptyProtobufList();
    private String name_ = "";
    private String target_ = "";

    static {
        DEFAULT_INSTANCE.makeImmutable();
    }

    private Endpoint() {
    }

    private void addAliases(String string2) {
        if (string2 != null) {
            this.ensureAliasesIsMutable();
            this.aliases_.add((Object)string2);
            return;
        }
        throw new NullPointerException();
    }

    private void addAliasesBytes(ByteString byteString) {
        if (byteString != null) {
            Endpoint.checkByteStringIsUtf8((ByteString)byteString);
            this.ensureAliasesIsMutable();
            this.aliases_.add((Object)byteString.toStringUtf8());
            return;
        }
        throw new NullPointerException();
    }

    private void addAllAliases(Iterable<String> iterable) {
        this.ensureAliasesIsMutable();
        AbstractMessageLite.addAll(iterable, this.aliases_);
    }

    private void addAllApis(Iterable<String> iterable) {
        this.ensureApisIsMutable();
        AbstractMessageLite.addAll(iterable, this.apis_);
    }

    private void addAllFeatures(Iterable<String> iterable) {
        this.ensureFeaturesIsMutable();
        AbstractMessageLite.addAll(iterable, this.features_);
    }

    private void addApis(String string2) {
        if (string2 != null) {
            this.ensureApisIsMutable();
            this.apis_.add((Object)string2);
            return;
        }
        throw new NullPointerException();
    }

    private void addApisBytes(ByteString byteString) {
        if (byteString != null) {
            Endpoint.checkByteStringIsUtf8((ByteString)byteString);
            this.ensureApisIsMutable();
            this.apis_.add((Object)byteString.toStringUtf8());
            return;
        }
        throw new NullPointerException();
    }

    private void addFeatures(String string2) {
        if (string2 != null) {
            this.ensureFeaturesIsMutable();
            this.features_.add((Object)string2);
            return;
        }
        throw new NullPointerException();
    }

    private void addFeaturesBytes(ByteString byteString) {
        if (byteString != null) {
            Endpoint.checkByteStringIsUtf8((ByteString)byteString);
            this.ensureFeaturesIsMutable();
            this.features_.add((Object)byteString.toStringUtf8());
            return;
        }
        throw new NullPointerException();
    }

    private void clearAliases() {
        this.aliases_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearAllowCors() {
        this.allowCors_ = false;
    }

    private void clearApis() {
        this.apis_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearFeatures() {
        this.features_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearName() {
        this.name_ = Endpoint.getDefaultInstance().getName();
    }

    private void clearTarget() {
        this.target_ = Endpoint.getDefaultInstance().getTarget();
    }

    private void ensureAliasesIsMutable() {
        if (!this.aliases_.isModifiable()) {
            this.aliases_ = GeneratedMessageLite.mutableCopy(this.aliases_);
        }
    }

    private void ensureApisIsMutable() {
        if (!this.apis_.isModifiable()) {
            this.apis_ = GeneratedMessageLite.mutableCopy(this.apis_);
        }
    }

    private void ensureFeaturesIsMutable() {
        if (!this.features_.isModifiable()) {
            this.features_ = GeneratedMessageLite.mutableCopy(this.features_);
        }
    }

    public static Endpoint getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(Endpoint endpoint) {
        return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)endpoint);
    }

    public static Endpoint parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Endpoint)Endpoint.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Endpoint parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Endpoint)Endpoint.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Endpoint parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Endpoint)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static Endpoint parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Endpoint)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Endpoint parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Endpoint)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static Endpoint parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Endpoint)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Endpoint parseFrom(InputStream inputStream) throws IOException {
        return (Endpoint)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Endpoint parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Endpoint)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Endpoint parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (Endpoint)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static Endpoint parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Endpoint)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<Endpoint> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setAliases(int n, String string2) {
        if (string2 != null) {
            this.ensureAliasesIsMutable();
            this.aliases_.set(n, (Object)string2);
            return;
        }
        throw new NullPointerException();
    }

    private void setAllowCors(boolean bl) {
        this.allowCors_ = bl;
    }

    private void setApis(int n, String string2) {
        if (string2 != null) {
            this.ensureApisIsMutable();
            this.apis_.set(n, (Object)string2);
            return;
        }
        throw new NullPointerException();
    }

    private void setFeatures(int n, String string2) {
        if (string2 != null) {
            this.ensureFeaturesIsMutable();
            this.features_.set(n, (Object)string2);
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
            Endpoint.checkByteStringIsUtf8((ByteString)byteString);
            this.name_ = byteString.toStringUtf8();
            return;
        }
        throw new NullPointerException();
    }

    private void setTarget(String string2) {
        if (string2 != null) {
            this.target_ = string2;
            return;
        }
        throw new NullPointerException();
    }

    private void setTargetBytes(ByteString byteString) {
        if (byteString != null) {
            Endpoint.checkByteStringIsUtf8((ByteString)byteString);
            this.target_ = byteString.toStringUtf8();
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
                Class<Endpoint> class_ = Endpoint.class;
                // MONITORENTER : com.google.api.Endpoint.class
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
                                    if (n != 34) {
                                        if (n != 40) {
                                            if (n != 810) {
                                                if (codedInputStream.skipField(n)) continue;
                                                bl = true;
                                                continue;
                                            }
                                            this.target_ = codedInputStream.readStringRequireUtf8();
                                            continue;
                                        }
                                        this.allowCors_ = codedInputStream.readBool();
                                        continue;
                                    }
                                    String string2 = codedInputStream.readStringRequireUtf8();
                                    if (!this.features_.isModifiable()) {
                                        this.features_ = GeneratedMessageLite.mutableCopy(this.features_);
                                    }
                                    this.features_.add((Object)string2);
                                    continue;
                                }
                                String string3 = codedInputStream.readStringRequireUtf8();
                                if (!this.apis_.isModifiable()) {
                                    this.apis_ = GeneratedMessageLite.mutableCopy(this.apis_);
                                }
                                this.apis_.add((Object)string3);
                                continue;
                            }
                            String string4 = codedInputStream.readStringRequireUtf8();
                            if (!this.aliases_.isModifiable()) {
                                this.aliases_ = GeneratedMessageLite.mutableCopy(this.aliases_);
                            }
                            this.aliases_.add((Object)string4);
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
                Endpoint endpoint = (Endpoint)object2;
                this.name_ = visitor.visitString(true ^ this.name_.isEmpty(), this.name_, true ^ endpoint.name_.isEmpty(), endpoint.name_);
                this.aliases_ = visitor.visitList(this.aliases_, endpoint.aliases_);
                this.apis_ = visitor.visitList(this.apis_, endpoint.apis_);
                this.features_ = visitor.visitList(this.features_, endpoint.features_);
                this.target_ = visitor.visitString(true ^ this.target_.isEmpty(), this.target_, true ^ endpoint.target_.isEmpty(), endpoint.target_);
                boolean bl = this.allowCors_;
                boolean bl2 = endpoint.allowCors_;
                this.allowCors_ = visitor.visitBoolean(bl, bl, bl2, bl2);
                if (visitor != GeneratedMessageLite.MergeFromVisitor.INSTANCE) return this;
                this.bitField0_ |= endpoint.bitField0_;
                return this;
            }
            case 4: {
                return new Builder();
            }
            case 3: {
                this.aliases_.makeImmutable();
                this.apis_.makeImmutable();
                this.features_.makeImmutable();
                return null;
            }
            case 2: {
                return DEFAULT_INSTANCE;
            }
            case 1: 
        }
        return new Endpoint();
    }

    @Override
    public String getAliases(int n) {
        return (String)this.aliases_.get(n);
    }

    @Override
    public ByteString getAliasesBytes(int n) {
        return ByteString.copyFromUtf8((String)((String)this.aliases_.get(n)));
    }

    @Override
    public int getAliasesCount() {
        return this.aliases_.size();
    }

    @Override
    public List<String> getAliasesList() {
        return this.aliases_;
    }

    @Override
    public boolean getAllowCors() {
        return this.allowCors_;
    }

    @Override
    public String getApis(int n) {
        return (String)this.apis_.get(n);
    }

    @Override
    public ByteString getApisBytes(int n) {
        return ByteString.copyFromUtf8((String)((String)this.apis_.get(n)));
    }

    @Override
    public int getApisCount() {
        return this.apis_.size();
    }

    @Override
    public List<String> getApisList() {
        return this.apis_;
    }

    @Override
    public String getFeatures(int n) {
        return (String)this.features_.get(n);
    }

    @Override
    public ByteString getFeaturesBytes(int n) {
        return ByteString.copyFromUtf8((String)((String)this.features_.get(n)));
    }

    @Override
    public int getFeaturesCount() {
        return this.features_.size();
    }

    @Override
    public List<String> getFeaturesList() {
        return this.features_;
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
        int n3 = 0;
        for (int i = 0; i < this.aliases_.size(); ++i) {
            n3 += CodedOutputStream.computeStringSizeNoTag((String)((String)this.aliases_.get(i)));
        }
        int n4 = n2 + n3 + 1 * this.getAliasesList().size();
        int n5 = 0;
        for (int i = 0; i < this.apis_.size(); ++i) {
            n5 += CodedOutputStream.computeStringSizeNoTag((String)((String)this.apis_.get(i)));
        }
        int n6 = n4 + n5 + 1 * this.getApisList().size();
        int n7 = 0;
        for (int i = 0; i < this.features_.size(); ++i) {
            n7 += CodedOutputStream.computeStringSizeNoTag((String)((String)this.features_.get(i)));
        }
        int n8 = n6 + n7 + 1 * this.getFeaturesList().size();
        boolean bl2 = this.allowCors_;
        if (bl2) {
            n8 += CodedOutputStream.computeBoolSize((int)5, (boolean)bl2);
        }
        if (!this.target_.isEmpty()) {
            n8 += CodedOutputStream.computeStringSize((int)101, (String)this.getTarget());
        }
        this.memoizedSerializedSize = n8;
        return n8;
    }

    @Override
    public String getTarget() {
        return this.target_;
    }

    @Override
    public ByteString getTargetBytes() {
        return ByteString.copyFromUtf8((String)this.target_);
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.name_.isEmpty()) {
            codedOutputStream.writeString(1, this.getName());
        }
        for (int i = 0; i < this.aliases_.size(); ++i) {
            codedOutputStream.writeString(2, (String)this.aliases_.get(i));
        }
        for (int i = 0; i < this.apis_.size(); ++i) {
            codedOutputStream.writeString(3, (String)this.apis_.get(i));
        }
        for (int i = 0; i < this.features_.size(); ++i) {
            codedOutputStream.writeString(4, (String)this.features_.get(i));
        }
        boolean bl = this.allowCors_;
        if (bl) {
            codedOutputStream.writeBool(5, bl);
        }
        if (!this.target_.isEmpty()) {
            codedOutputStream.writeString(101, this.getTarget());
        }
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<Endpoint, Builder>
    implements EndpointOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder addAliases(String string2) {
            this.copyOnWrite();
            ((Endpoint)this.instance).addAliases(string2);
            return this;
        }

        public Builder addAliasesBytes(ByteString byteString) {
            this.copyOnWrite();
            ((Endpoint)this.instance).addAliasesBytes(byteString);
            return this;
        }

        public Builder addAllAliases(Iterable<String> iterable) {
            this.copyOnWrite();
            ((Endpoint)this.instance).addAllAliases((Iterable<String>)iterable);
            return this;
        }

        public Builder addAllApis(Iterable<String> iterable) {
            this.copyOnWrite();
            ((Endpoint)this.instance).addAllApis((Iterable<String>)iterable);
            return this;
        }

        public Builder addAllFeatures(Iterable<String> iterable) {
            this.copyOnWrite();
            ((Endpoint)this.instance).addAllFeatures((Iterable<String>)iterable);
            return this;
        }

        public Builder addApis(String string2) {
            this.copyOnWrite();
            ((Endpoint)this.instance).addApis(string2);
            return this;
        }

        public Builder addApisBytes(ByteString byteString) {
            this.copyOnWrite();
            ((Endpoint)this.instance).addApisBytes(byteString);
            return this;
        }

        public Builder addFeatures(String string2) {
            this.copyOnWrite();
            ((Endpoint)this.instance).addFeatures(string2);
            return this;
        }

        public Builder addFeaturesBytes(ByteString byteString) {
            this.copyOnWrite();
            ((Endpoint)this.instance).addFeaturesBytes(byteString);
            return this;
        }

        public Builder clearAliases() {
            this.copyOnWrite();
            ((Endpoint)this.instance).clearAliases();
            return this;
        }

        public Builder clearAllowCors() {
            this.copyOnWrite();
            ((Endpoint)this.instance).clearAllowCors();
            return this;
        }

        public Builder clearApis() {
            this.copyOnWrite();
            ((Endpoint)this.instance).clearApis();
            return this;
        }

        public Builder clearFeatures() {
            this.copyOnWrite();
            ((Endpoint)this.instance).clearFeatures();
            return this;
        }

        public Builder clearName() {
            this.copyOnWrite();
            ((Endpoint)this.instance).clearName();
            return this;
        }

        public Builder clearTarget() {
            this.copyOnWrite();
            ((Endpoint)this.instance).clearTarget();
            return this;
        }

        @Override
        public String getAliases(int n) {
            return ((Endpoint)this.instance).getAliases(n);
        }

        @Override
        public ByteString getAliasesBytes(int n) {
            return ((Endpoint)this.instance).getAliasesBytes(n);
        }

        @Override
        public int getAliasesCount() {
            return ((Endpoint)this.instance).getAliasesCount();
        }

        @Override
        public List<String> getAliasesList() {
            return Collections.unmodifiableList(((Endpoint)this.instance).getAliasesList());
        }

        @Override
        public boolean getAllowCors() {
            return ((Endpoint)this.instance).getAllowCors();
        }

        @Override
        public String getApis(int n) {
            return ((Endpoint)this.instance).getApis(n);
        }

        @Override
        public ByteString getApisBytes(int n) {
            return ((Endpoint)this.instance).getApisBytes(n);
        }

        @Override
        public int getApisCount() {
            return ((Endpoint)this.instance).getApisCount();
        }

        @Override
        public List<String> getApisList() {
            return Collections.unmodifiableList(((Endpoint)this.instance).getApisList());
        }

        @Override
        public String getFeatures(int n) {
            return ((Endpoint)this.instance).getFeatures(n);
        }

        @Override
        public ByteString getFeaturesBytes(int n) {
            return ((Endpoint)this.instance).getFeaturesBytes(n);
        }

        @Override
        public int getFeaturesCount() {
            return ((Endpoint)this.instance).getFeaturesCount();
        }

        @Override
        public List<String> getFeaturesList() {
            return Collections.unmodifiableList(((Endpoint)this.instance).getFeaturesList());
        }

        @Override
        public String getName() {
            return ((Endpoint)this.instance).getName();
        }

        @Override
        public ByteString getNameBytes() {
            return ((Endpoint)this.instance).getNameBytes();
        }

        @Override
        public String getTarget() {
            return ((Endpoint)this.instance).getTarget();
        }

        @Override
        public ByteString getTargetBytes() {
            return ((Endpoint)this.instance).getTargetBytes();
        }

        public Builder setAliases(int n, String string2) {
            this.copyOnWrite();
            ((Endpoint)this.instance).setAliases(n, string2);
            return this;
        }

        public Builder setAllowCors(boolean bl) {
            this.copyOnWrite();
            ((Endpoint)this.instance).setAllowCors(bl);
            return this;
        }

        public Builder setApis(int n, String string2) {
            this.copyOnWrite();
            ((Endpoint)this.instance).setApis(n, string2);
            return this;
        }

        public Builder setFeatures(int n, String string2) {
            this.copyOnWrite();
            ((Endpoint)this.instance).setFeatures(n, string2);
            return this;
        }

        public Builder setName(String string2) {
            this.copyOnWrite();
            ((Endpoint)this.instance).setName(string2);
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            this.copyOnWrite();
            ((Endpoint)this.instance).setNameBytes(byteString);
            return this;
        }

        public Builder setTarget(String string2) {
            this.copyOnWrite();
            ((Endpoint)this.instance).setTarget(string2);
            return this;
        }

        public Builder setTargetBytes(ByteString byteString) {
            this.copyOnWrite();
            ((Endpoint)this.instance).setTargetBytes(byteString);
            return this;
        }
    }

}

