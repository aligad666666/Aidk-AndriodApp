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
 *  com.google.rpc.QuotaFailure$1
 *  com.google.rpc.QuotaFailure$ViolationOrBuilder
 *  com.google.rpc.QuotaFailureOrBuilder
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
import com.google.rpc.QuotaFailure;
import com.google.rpc.QuotaFailureOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

public final class QuotaFailure
extends GeneratedMessageLite<QuotaFailure, Builder>
implements QuotaFailureOrBuilder {
    private static final QuotaFailure DEFAULT_INSTANCE = new QuotaFailure();
    private static volatile Parser<QuotaFailure> PARSER;
    public static final int VIOLATIONS_FIELD_NUMBER = 1;
    private Internal.ProtobufList<Violation> violations_ = QuotaFailure.emptyProtobufList();

    static {
        DEFAULT_INSTANCE.makeImmutable();
    }

    private QuotaFailure() {
    }

    private void addAllViolations(Iterable<? extends Violation> iterable) {
        this.ensureViolationsIsMutable();
        AbstractMessageLite.addAll(iterable, this.violations_);
    }

    private void addViolations(int n, Violation.Builder builder) {
        this.ensureViolationsIsMutable();
        this.violations_.add(n, (Object)((Violation)builder.build()));
    }

    private void addViolations(int n, Violation violation) {
        if (violation != null) {
            this.ensureViolationsIsMutable();
            this.violations_.add(n, (Object)violation);
            return;
        }
        throw new NullPointerException();
    }

    private void addViolations(Violation.Builder builder) {
        this.ensureViolationsIsMutable();
        this.violations_.add((Object)((Violation)builder.build()));
    }

    private void addViolations(Violation violation) {
        if (violation != null) {
            this.ensureViolationsIsMutable();
            this.violations_.add((Object)violation);
            return;
        }
        throw new NullPointerException();
    }

    private void clearViolations() {
        this.violations_ = QuotaFailure.emptyProtobufList();
    }

    private void ensureViolationsIsMutable() {
        if (!this.violations_.isModifiable()) {
            this.violations_ = GeneratedMessageLite.mutableCopy(this.violations_);
        }
    }

    public static QuotaFailure getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(QuotaFailure quotaFailure) {
        return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)quotaFailure);
    }

    public static QuotaFailure parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (QuotaFailure)QuotaFailure.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static QuotaFailure parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (QuotaFailure)QuotaFailure.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static QuotaFailure parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (QuotaFailure)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static QuotaFailure parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (QuotaFailure)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static QuotaFailure parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (QuotaFailure)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static QuotaFailure parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (QuotaFailure)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static QuotaFailure parseFrom(InputStream inputStream) throws IOException {
        return (QuotaFailure)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static QuotaFailure parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (QuotaFailure)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static QuotaFailure parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (QuotaFailure)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static QuotaFailure parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (QuotaFailure)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<QuotaFailure> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeViolations(int n) {
        this.ensureViolationsIsMutable();
        this.violations_.remove(n);
    }

    private void setViolations(int n, Violation.Builder builder) {
        this.ensureViolationsIsMutable();
        this.violations_.set(n, (Object)((Violation)builder.build()));
    }

    private void setViolations(int n, Violation violation) {
        if (violation != null) {
            this.ensureViolationsIsMutable();
            this.violations_.set(n, (Object)violation);
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
                Class<QuotaFailure> class_ = QuotaFailure.class;
                // MONITORENTER : com.google.rpc.QuotaFailure.class
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
                        if (!this.violations_.isModifiable()) {
                            this.violations_ = GeneratedMessageLite.mutableCopy(this.violations_);
                        }
                        this.violations_.add((Object)((Violation)codedInputStream.readMessage(Violation.parser(), extensionRegistryLite)));
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
                QuotaFailure quotaFailure = (QuotaFailure)((Object)object2);
                this.violations_ = visitor.visitList(this.violations_, quotaFailure.violations_);
                return this;
            }
            case 4: {
                return new Builder();
            }
            case 3: {
                this.violations_.makeImmutable();
                return null;
            }
            case 2: {
                return DEFAULT_INSTANCE;
            }
            case 1: 
        }
        return new QuotaFailure();
    }

    public int getSerializedSize() {
        int n = this.memoizedSerializedSize;
        if (n != -1) {
            return n;
        }
        int n2 = 0;
        for (int i = 0; i < this.violations_.size(); ++i) {
            n2 += CodedOutputStream.computeMessageSize((int)1, (MessageLite)((MessageLite)this.violations_.get(i)));
        }
        this.memoizedSerializedSize = n2;
        return n2;
    }

    public Violation getViolations(int n) {
        return (Violation)((Object)this.violations_.get(n));
    }

    public int getViolationsCount() {
        return this.violations_.size();
    }

    public List<Violation> getViolationsList() {
        return this.violations_;
    }

    public ViolationOrBuilder getViolationsOrBuilder(int n) {
        return this.violations_.get(n);
    }

    public List<? extends ViolationOrBuilder> getViolationsOrBuilderList() {
        return this.violations_;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.violations_.size(); ++i) {
            codedOutputStream.writeMessage(1, (MessageLite)this.violations_.get(i));
        }
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<QuotaFailure, Builder>
    implements QuotaFailureOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder addAllViolations(Iterable<? extends Violation> iterable) {
            this.copyOnWrite();
            ((QuotaFailure)this.instance).addAllViolations((Iterable<? extends Violation>)iterable);
            return this;
        }

        public Builder addViolations(int n, Violation.Builder builder) {
            this.copyOnWrite();
            ((QuotaFailure)this.instance).addViolations(n, builder);
            return this;
        }

        public Builder addViolations(int n, Violation violation) {
            this.copyOnWrite();
            ((QuotaFailure)this.instance).addViolations(n, violation);
            return this;
        }

        public Builder addViolations(Violation.Builder builder) {
            this.copyOnWrite();
            ((QuotaFailure)this.instance).addViolations(builder);
            return this;
        }

        public Builder addViolations(Violation violation) {
            this.copyOnWrite();
            ((QuotaFailure)this.instance).addViolations(violation);
            return this;
        }

        public Builder clearViolations() {
            this.copyOnWrite();
            ((QuotaFailure)this.instance).clearViolations();
            return this;
        }

        public Violation getViolations(int n) {
            return ((QuotaFailure)this.instance).getViolations(n);
        }

        public int getViolationsCount() {
            return ((QuotaFailure)this.instance).getViolationsCount();
        }

        public List<Violation> getViolationsList() {
            return Collections.unmodifiableList(((QuotaFailure)this.instance).getViolationsList());
        }

        public Builder removeViolations(int n) {
            this.copyOnWrite();
            ((QuotaFailure)this.instance).removeViolations(n);
            return this;
        }

        public Builder setViolations(int n, Violation.Builder builder) {
            this.copyOnWrite();
            ((QuotaFailure)this.instance).setViolations(n, builder);
            return this;
        }

        public Builder setViolations(int n, Violation violation) {
            this.copyOnWrite();
            ((QuotaFailure)this.instance).setViolations(n, violation);
            return this;
        }
    }

    public static final class Violation
    extends GeneratedMessageLite<Violation, Builder>
    implements ViolationOrBuilder {
        private static final Violation DEFAULT_INSTANCE = new Violation();
        public static final int DESCRIPTION_FIELD_NUMBER = 2;
        private static volatile Parser<Violation> PARSER;
        public static final int SUBJECT_FIELD_NUMBER = 1;
        private String description_ = "";
        private String subject_ = "";

        static {
            DEFAULT_INSTANCE.makeImmutable();
        }

        private Violation() {
        }

        private void clearDescription() {
            this.description_ = Violation.getDefaultInstance().getDescription();
        }

        private void clearSubject() {
            this.subject_ = Violation.getDefaultInstance().getSubject();
        }

        public static Violation getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(Violation violation) {
            return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)violation);
        }

        public static Violation parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Violation)Violation.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static Violation parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Violation)Violation.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Violation parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Violation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
        }

        public static Violation parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Violation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Violation parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Violation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
        }

        public static Violation parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Violation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Violation parseFrom(InputStream inputStream) throws IOException {
            return (Violation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static Violation parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Violation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Violation parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
            return (Violation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
        }

        public static Violation parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Violation)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Parser<Violation> parser() {
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
                Violation.checkByteStringIsUtf8((ByteString)byteString);
                this.description_ = byteString.toStringUtf8();
                return;
            }
            throw new NullPointerException();
        }

        private void setSubject(String string) {
            if (string != null) {
                this.subject_ = string;
                return;
            }
            throw new NullPointerException();
        }

        private void setSubjectBytes(ByteString byteString) {
            if (byteString != null) {
                Violation.checkByteStringIsUtf8((ByteString)byteString);
                this.subject_ = byteString.toStringUtf8();
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
                    Class<Violation> class_ = Violation.class;
                    // MONITORENTER : com.google.rpc.QuotaFailure$Violation.class
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
                            this.subject_ = codedInputStream.readStringRequireUtf8();
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
                    Violation violation = (Violation)((Object)object2);
                    this.subject_ = visitor.visitString(true ^ this.subject_.isEmpty(), this.subject_, true ^ violation.subject_.isEmpty(), violation.subject_);
                    this.description_ = visitor.visitString(true ^ this.description_.isEmpty(), this.description_, true ^ violation.description_.isEmpty(), violation.description_);
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
            return new Violation();
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
            boolean bl = this.subject_.isEmpty();
            int n2 = 0;
            if (!bl) {
                n2 = 0 + CodedOutputStream.computeStringSize((int)1, (String)this.getSubject());
            }
            if (!this.description_.isEmpty()) {
                n2 += CodedOutputStream.computeStringSize((int)2, (String)this.getDescription());
            }
            this.memoizedSerializedSize = n2;
            return n2;
        }

        public String getSubject() {
            return this.subject_;
        }

        public ByteString getSubjectBytes() {
            return ByteString.copyFromUtf8((String)this.subject_);
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.subject_.isEmpty()) {
                codedOutputStream.writeString(1, this.getSubject());
            }
            if (!this.description_.isEmpty()) {
                codedOutputStream.writeString(2, this.getDescription());
            }
        }

        public static final class Builder
        extends GeneratedMessageLite.Builder<Violation, Builder>
        implements ViolationOrBuilder {
            private Builder() {
                super((GeneratedMessageLite)DEFAULT_INSTANCE);
            }

            public Builder clearDescription() {
                this.copyOnWrite();
                ((Violation)this.instance).clearDescription();
                return this;
            }

            public Builder clearSubject() {
                this.copyOnWrite();
                ((Violation)this.instance).clearSubject();
                return this;
            }

            public String getDescription() {
                return ((Violation)this.instance).getDescription();
            }

            public ByteString getDescriptionBytes() {
                return ((Violation)this.instance).getDescriptionBytes();
            }

            public String getSubject() {
                return ((Violation)this.instance).getSubject();
            }

            public ByteString getSubjectBytes() {
                return ((Violation)this.instance).getSubjectBytes();
            }

            public Builder setDescription(String string) {
                this.copyOnWrite();
                ((Violation)this.instance).setDescription(string);
                return this;
            }

            public Builder setDescriptionBytes(ByteString byteString) {
                this.copyOnWrite();
                ((Violation)this.instance).setDescriptionBytes(byteString);
                return this;
            }

            public Builder setSubject(String string) {
                this.copyOnWrite();
                ((Violation)this.instance).setSubject(string);
                return this;
            }

            public Builder setSubjectBytes(ByteString byteString) {
                this.copyOnWrite();
                ((Violation)this.instance).setSubjectBytes(byteString);
                return this;
            }
        }

    }

}

