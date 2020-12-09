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
 *  com.google.rpc.BadRequest$1
 *  com.google.rpc.BadRequest$FieldViolationOrBuilder
 *  com.google.rpc.BadRequestOrBuilder
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
import com.google.rpc.BadRequest;
import com.google.rpc.BadRequestOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

public final class BadRequest
extends GeneratedMessageLite<BadRequest, Builder>
implements BadRequestOrBuilder {
    private static final BadRequest DEFAULT_INSTANCE = new BadRequest();
    public static final int FIELD_VIOLATIONS_FIELD_NUMBER = 1;
    private static volatile Parser<BadRequest> PARSER;
    private Internal.ProtobufList<FieldViolation> fieldViolations_ = BadRequest.emptyProtobufList();

    static {
        DEFAULT_INSTANCE.makeImmutable();
    }

    private BadRequest() {
    }

    private void addAllFieldViolations(Iterable<? extends FieldViolation> iterable) {
        this.ensureFieldViolationsIsMutable();
        AbstractMessageLite.addAll(iterable, this.fieldViolations_);
    }

    private void addFieldViolations(int n, FieldViolation.Builder builder) {
        this.ensureFieldViolationsIsMutable();
        this.fieldViolations_.add(n, (Object)((FieldViolation)builder.build()));
    }

    private void addFieldViolations(int n, FieldViolation fieldViolation) {
        if (fieldViolation != null) {
            this.ensureFieldViolationsIsMutable();
            this.fieldViolations_.add(n, (Object)fieldViolation);
            return;
        }
        throw new NullPointerException();
    }

    private void addFieldViolations(FieldViolation.Builder builder) {
        this.ensureFieldViolationsIsMutable();
        this.fieldViolations_.add((Object)((FieldViolation)builder.build()));
    }

    private void addFieldViolations(FieldViolation fieldViolation) {
        if (fieldViolation != null) {
            this.ensureFieldViolationsIsMutable();
            this.fieldViolations_.add((Object)fieldViolation);
            return;
        }
        throw new NullPointerException();
    }

    private void clearFieldViolations() {
        this.fieldViolations_ = BadRequest.emptyProtobufList();
    }

    private void ensureFieldViolationsIsMutable() {
        if (!this.fieldViolations_.isModifiable()) {
            this.fieldViolations_ = GeneratedMessageLite.mutableCopy(this.fieldViolations_);
        }
    }

    public static BadRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(BadRequest badRequest) {
        return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)badRequest);
    }

    public static BadRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (BadRequest)BadRequest.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static BadRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BadRequest)BadRequest.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static BadRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (BadRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static BadRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BadRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static BadRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (BadRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static BadRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BadRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static BadRequest parseFrom(InputStream inputStream) throws IOException {
        return (BadRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static BadRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (BadRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static BadRequest parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (BadRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static BadRequest parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (BadRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<BadRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeFieldViolations(int n) {
        this.ensureFieldViolationsIsMutable();
        this.fieldViolations_.remove(n);
    }

    private void setFieldViolations(int n, FieldViolation.Builder builder) {
        this.ensureFieldViolationsIsMutable();
        this.fieldViolations_.set(n, (Object)((FieldViolation)builder.build()));
    }

    private void setFieldViolations(int n, FieldViolation fieldViolation) {
        if (fieldViolation != null) {
            this.ensureFieldViolationsIsMutable();
            this.fieldViolations_.set(n, (Object)fieldViolation);
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
                Class<BadRequest> class_ = BadRequest.class;
                // MONITORENTER : com.google.rpc.BadRequest.class
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
                        if (!this.fieldViolations_.isModifiable()) {
                            this.fieldViolations_ = GeneratedMessageLite.mutableCopy(this.fieldViolations_);
                        }
                        this.fieldViolations_.add((Object)((FieldViolation)codedInputStream.readMessage(FieldViolation.parser(), extensionRegistryLite)));
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
                BadRequest badRequest = (BadRequest)((Object)object2);
                this.fieldViolations_ = visitor.visitList(this.fieldViolations_, badRequest.fieldViolations_);
                return this;
            }
            case 4: {
                return new Builder();
            }
            case 3: {
                this.fieldViolations_.makeImmutable();
                return null;
            }
            case 2: {
                return DEFAULT_INSTANCE;
            }
            case 1: 
        }
        return new BadRequest();
    }

    public FieldViolation getFieldViolations(int n) {
        return (FieldViolation)((Object)this.fieldViolations_.get(n));
    }

    public int getFieldViolationsCount() {
        return this.fieldViolations_.size();
    }

    public List<FieldViolation> getFieldViolationsList() {
        return this.fieldViolations_;
    }

    public FieldViolationOrBuilder getFieldViolationsOrBuilder(int n) {
        return this.fieldViolations_.get(n);
    }

    public List<? extends FieldViolationOrBuilder> getFieldViolationsOrBuilderList() {
        return this.fieldViolations_;
    }

    public int getSerializedSize() {
        int n = this.memoizedSerializedSize;
        if (n != -1) {
            return n;
        }
        int n2 = 0;
        for (int i = 0; i < this.fieldViolations_.size(); ++i) {
            n2 += CodedOutputStream.computeMessageSize((int)1, (MessageLite)((MessageLite)this.fieldViolations_.get(i)));
        }
        this.memoizedSerializedSize = n2;
        return n2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.fieldViolations_.size(); ++i) {
            codedOutputStream.writeMessage(1, (MessageLite)this.fieldViolations_.get(i));
        }
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<BadRequest, Builder>
    implements BadRequestOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder addAllFieldViolations(Iterable<? extends FieldViolation> iterable) {
            this.copyOnWrite();
            ((BadRequest)this.instance).addAllFieldViolations((Iterable<? extends FieldViolation>)iterable);
            return this;
        }

        public Builder addFieldViolations(int n, FieldViolation.Builder builder) {
            this.copyOnWrite();
            ((BadRequest)this.instance).addFieldViolations(n, builder);
            return this;
        }

        public Builder addFieldViolations(int n, FieldViolation fieldViolation) {
            this.copyOnWrite();
            ((BadRequest)this.instance).addFieldViolations(n, fieldViolation);
            return this;
        }

        public Builder addFieldViolations(FieldViolation.Builder builder) {
            this.copyOnWrite();
            ((BadRequest)this.instance).addFieldViolations(builder);
            return this;
        }

        public Builder addFieldViolations(FieldViolation fieldViolation) {
            this.copyOnWrite();
            ((BadRequest)this.instance).addFieldViolations(fieldViolation);
            return this;
        }

        public Builder clearFieldViolations() {
            this.copyOnWrite();
            ((BadRequest)this.instance).clearFieldViolations();
            return this;
        }

        public FieldViolation getFieldViolations(int n) {
            return ((BadRequest)this.instance).getFieldViolations(n);
        }

        public int getFieldViolationsCount() {
            return ((BadRequest)this.instance).getFieldViolationsCount();
        }

        public List<FieldViolation> getFieldViolationsList() {
            return Collections.unmodifiableList(((BadRequest)this.instance).getFieldViolationsList());
        }

        public Builder removeFieldViolations(int n) {
            this.copyOnWrite();
            ((BadRequest)this.instance).removeFieldViolations(n);
            return this;
        }

        public Builder setFieldViolations(int n, FieldViolation.Builder builder) {
            this.copyOnWrite();
            ((BadRequest)this.instance).setFieldViolations(n, builder);
            return this;
        }

        public Builder setFieldViolations(int n, FieldViolation fieldViolation) {
            this.copyOnWrite();
            ((BadRequest)this.instance).setFieldViolations(n, fieldViolation);
            return this;
        }
    }

    public static final class FieldViolation
    extends GeneratedMessageLite<FieldViolation, Builder>
    implements FieldViolationOrBuilder {
        private static final FieldViolation DEFAULT_INSTANCE = new FieldViolation();
        public static final int DESCRIPTION_FIELD_NUMBER = 2;
        public static final int FIELD_FIELD_NUMBER = 1;
        private static volatile Parser<FieldViolation> PARSER;
        private String description_ = "";
        private String field_ = "";

        static {
            DEFAULT_INSTANCE.makeImmutable();
        }

        private FieldViolation() {
        }

        private void clearDescription() {
            this.description_ = FieldViolation.getDefaultInstance().getDescription();
        }

        private void clearField() {
            this.field_ = FieldViolation.getDefaultInstance().getField();
        }

        public static FieldViolation getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(FieldViolation fieldViolation) {
            return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)fieldViolation);
        }

        public static FieldViolation parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (FieldViolation)FieldViolation.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static FieldViolation parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (FieldViolation)FieldViolation.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static FieldViolation parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (FieldViolation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
        }

        public static FieldViolation parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (FieldViolation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static FieldViolation parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (FieldViolation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
        }

        public static FieldViolation parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (FieldViolation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static FieldViolation parseFrom(InputStream inputStream) throws IOException {
            return (FieldViolation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static FieldViolation parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (FieldViolation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static FieldViolation parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
            return (FieldViolation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
        }

        public static FieldViolation parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (FieldViolation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Parser<FieldViolation> parser() {
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
                FieldViolation.checkByteStringIsUtf8((ByteString)byteString);
                this.description_ = byteString.toStringUtf8();
                return;
            }
            throw new NullPointerException();
        }

        private void setField(String string) {
            if (string != null) {
                this.field_ = string;
                return;
            }
            throw new NullPointerException();
        }

        private void setFieldBytes(ByteString byteString) {
            if (byteString != null) {
                FieldViolation.checkByteStringIsUtf8((ByteString)byteString);
                this.field_ = byteString.toStringUtf8();
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
                    Class<FieldViolation> class_ = FieldViolation.class;
                    // MONITORENTER : com.google.rpc.BadRequest$FieldViolation.class
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
                                this.description_ = codedInputStream.readStringRequireUtf8();
                                continue;
                            }
                            this.field_ = codedInputStream.readStringRequireUtf8();
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
                    FieldViolation fieldViolation = (FieldViolation)((Object)object2);
                    this.field_ = visitor.visitString(true ^ this.field_.isEmpty(), this.field_, true ^ fieldViolation.field_.isEmpty(), fieldViolation.field_);
                    this.description_ = visitor.visitString(true ^ this.description_.isEmpty(), this.description_, true ^ fieldViolation.description_.isEmpty(), fieldViolation.description_);
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
            return new FieldViolation();
        }

        public String getDescription() {
            return this.description_;
        }

        public ByteString getDescriptionBytes() {
            return ByteString.copyFromUtf8((String)this.description_);
        }

        public String getField() {
            return this.field_;
        }

        public ByteString getFieldBytes() {
            return ByteString.copyFromUtf8((String)this.field_);
        }

        public int getSerializedSize() {
            int n = this.memoizedSerializedSize;
            if (n != -1) {
                return n;
            }
            boolean bl = this.field_.isEmpty();
            int n2 = 0;
            if (!bl) {
                n2 = 0 + CodedOutputStream.computeStringSize((int)1, (String)this.getField());
            }
            if (!this.description_.isEmpty()) {
                n2 += CodedOutputStream.computeStringSize((int)2, (String)this.getDescription());
            }
            this.memoizedSerializedSize = n2;
            return n2;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.field_.isEmpty()) {
                codedOutputStream.writeString(1, this.getField());
            }
            if (!this.description_.isEmpty()) {
                codedOutputStream.writeString(2, this.getDescription());
            }
        }

        public static final class Builder
        extends GeneratedMessageLite.Builder<FieldViolation, Builder>
        implements FieldViolationOrBuilder {
            private Builder() {
                super((GeneratedMessageLite)DEFAULT_INSTANCE);
            }

            public Builder clearDescription() {
                this.copyOnWrite();
                ((FieldViolation)this.instance).clearDescription();
                return this;
            }

            public Builder clearField() {
                this.copyOnWrite();
                ((FieldViolation)this.instance).clearField();
                return this;
            }

            public String getDescription() {
                return ((FieldViolation)this.instance).getDescription();
            }

            public ByteString getDescriptionBytes() {
                return ((FieldViolation)this.instance).getDescriptionBytes();
            }

            public String getField() {
                return ((FieldViolation)this.instance).getField();
            }

            public ByteString getFieldBytes() {
                return ((FieldViolation)this.instance).getFieldBytes();
            }

            public Builder setDescription(String string) {
                this.copyOnWrite();
                ((FieldViolation)this.instance).setDescription(string);
                return this;
            }

            public Builder setDescriptionBytes(ByteString byteString) {
                this.copyOnWrite();
                ((FieldViolation)this.instance).setDescriptionBytes(byteString);
                return this;
            }

            public Builder setField(String string) {
                this.copyOnWrite();
                ((FieldViolation)this.instance).setField(string);
                return this;
            }

            public Builder setFieldBytes(ByteString byteString) {
                this.copyOnWrite();
                ((FieldViolation)this.instance).setFieldBytes(byteString);
                return this;
            }
        }

    }

}

