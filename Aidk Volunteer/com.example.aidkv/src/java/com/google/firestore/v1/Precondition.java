/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.firestore.v1.Precondition$1
 *  com.google.firestore.v1.Precondition$ConditionTypeCase
 *  com.google.firestore.v1.PreconditionOrBuilder
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
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.Parser
 *  com.google.protobuf.Timestamp
 *  com.google.protobuf.Timestamp$Builder
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.UnsupportedOperationException
 */
package com.google.firestore.v1;

import com.google.firestore.v1.Precondition;
import com.google.firestore.v1.PreconditionOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;
import java.io.IOException;
import java.io.InputStream;

/*
 * Exception performing whole class analysis ignored.
 */
public final class Precondition
extends GeneratedMessageLite<Precondition, Builder>
implements PreconditionOrBuilder {
    private static final Precondition DEFAULT_INSTANCE = new Precondition();
    public static final int EXISTS_FIELD_NUMBER = 1;
    private static volatile Parser<Precondition> PARSER;
    public static final int UPDATE_TIME_FIELD_NUMBER = 2;
    private int conditionTypeCase_ = 0;
    private Object conditionType_;

    static {
        DEFAULT_INSTANCE.makeImmutable();
    }

    private Precondition() {
    }

    private void clearConditionType() {
        this.conditionTypeCase_ = 0;
        this.conditionType_ = null;
    }

    private void clearExists() {
        if (this.conditionTypeCase_ == 1) {
            this.conditionTypeCase_ = 0;
            this.conditionType_ = null;
        }
    }

    private void clearUpdateTime() {
        if (this.conditionTypeCase_ == 2) {
            this.conditionTypeCase_ = 0;
            this.conditionType_ = null;
        }
    }

    public static Precondition getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeUpdateTime(Timestamp timestamp) {
        this.conditionType_ = this.conditionTypeCase_ == 2 && this.conditionType_ != Timestamp.getDefaultInstance() ? ((Timestamp.Builder)Timestamp.newBuilder((Timestamp)((Timestamp)this.conditionType_)).mergeFrom((GeneratedMessageLite)timestamp)).buildPartial() : timestamp;
        this.conditionTypeCase_ = 2;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(Precondition precondition) {
        return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)precondition);
    }

    public static Precondition parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Precondition)Precondition.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Precondition parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Precondition)Precondition.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Precondition parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Precondition)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static Precondition parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Precondition)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Precondition parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Precondition)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static Precondition parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Precondition)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Precondition parseFrom(InputStream inputStream) throws IOException {
        return (Precondition)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Precondition parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Precondition)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Precondition parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (Precondition)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static Precondition parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Precondition)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<Precondition> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setExists(boolean bl) {
        this.conditionTypeCase_ = 1;
        this.conditionType_ = bl;
    }

    private void setUpdateTime(Timestamp.Builder builder) {
        this.conditionType_ = builder.build();
        this.conditionTypeCase_ = 2;
    }

    private void setUpdateTime(Timestamp timestamp) {
        if (timestamp != null) {
            this.conditionType_ = timestamp;
            this.conditionTypeCase_ = 2;
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
        int n = 1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()];
        int n2 = 1;
        switch (n) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 8: {
                if (PARSER != null) return PARSER;
                Class<Precondition> class_ = Precondition.class;
                // MONITORENTER : com.google.firestore.v1.Precondition.class
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
                    int n3 = codedInputStream.readTag();
                    if (n3 != 0) {
                        if (n3 != 8) {
                            if (n3 != 18) {
                                if (codedInputStream.skipField(n3)) continue;
                                bl = true;
                                continue;
                            }
                            int n4 = this.conditionTypeCase_;
                            Timestamp.Builder builder = null;
                            if (n4 == 2) {
                                builder = (Timestamp.Builder)((Timestamp)this.conditionType_).toBuilder();
                            }
                            this.conditionType_ = codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                            if (builder != null) {
                                builder.mergeFrom((GeneratedMessageLite)((Timestamp)this.conditionType_));
                                this.conditionType_ = builder.buildPartial();
                            }
                            this.conditionTypeCase_ = 2;
                            continue;
                        }
                        this.conditionTypeCase_ = n2;
                        this.conditionType_ = codedInputStream.readBool();
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
                Precondition precondition = (Precondition)((Object)object2);
                int n5 = 1.$SwitchMap$com$google$firestore$v1$Precondition$ConditionTypeCase[precondition.getConditionTypeCase().ordinal()];
                if (n5 != n2) {
                    if (n5 != 2) {
                        if (n5 == 3) {
                            if (this.conditionTypeCase_ == 0) {
                                n2 = 0;
                            }
                            visitor.visitOneofNotSet((boolean)n2);
                        }
                    } else {
                        if (this.conditionTypeCase_ != 2) {
                            n2 = 0;
                        }
                        this.conditionType_ = visitor.visitOneofMessage((boolean)n2, this.conditionType_, precondition.conditionType_);
                    }
                } else {
                    if (this.conditionTypeCase_ != n2) {
                        n2 = 0;
                    }
                    this.conditionType_ = visitor.visitOneofBoolean((boolean)n2, this.conditionType_, precondition.conditionType_);
                }
                if (visitor != GeneratedMessageLite.MergeFromVisitor.INSTANCE) return this;
                int n6 = precondition.conditionTypeCase_;
                if (n6 == 0) return this;
                this.conditionTypeCase_ = n6;
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
        return new Precondition();
    }

    public ConditionTypeCase getConditionTypeCase() {
        return ConditionTypeCase.forNumber((int)this.conditionTypeCase_);
    }

    public boolean getExists() {
        if (this.conditionTypeCase_ == 1) {
            return (Boolean)this.conditionType_;
        }
        return false;
    }

    public int getSerializedSize() {
        int n = this.memoizedSerializedSize;
        if (n != -1) {
            return n;
        }
        int n2 = this.conditionTypeCase_;
        int n3 = 0;
        if (n2 == 1) {
            n3 = 0 + CodedOutputStream.computeBoolSize((int)1, (boolean)((Boolean)this.conditionType_));
        }
        if (this.conditionTypeCase_ == 2) {
            n3 += CodedOutputStream.computeMessageSize((int)2, (MessageLite)((Timestamp)this.conditionType_));
        }
        this.memoizedSerializedSize = n3;
        return n3;
    }

    public Timestamp getUpdateTime() {
        if (this.conditionTypeCase_ == 2) {
            return (Timestamp)this.conditionType_;
        }
        return Timestamp.getDefaultInstance();
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.conditionTypeCase_ == 1) {
            codedOutputStream.writeBool(1, ((Boolean)this.conditionType_).booleanValue());
        }
        if (this.conditionTypeCase_ == 2) {
            codedOutputStream.writeMessage(2, (MessageLite)((Timestamp)this.conditionType_));
        }
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<Precondition, Builder>
    implements PreconditionOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder clearConditionType() {
            this.copyOnWrite();
            ((Precondition)this.instance).clearConditionType();
            return this;
        }

        public Builder clearExists() {
            this.copyOnWrite();
            ((Precondition)this.instance).clearExists();
            return this;
        }

        public Builder clearUpdateTime() {
            this.copyOnWrite();
            ((Precondition)this.instance).clearUpdateTime();
            return this;
        }

        public ConditionTypeCase getConditionTypeCase() {
            return ((Precondition)this.instance).getConditionTypeCase();
        }

        public boolean getExists() {
            return ((Precondition)this.instance).getExists();
        }

        public Timestamp getUpdateTime() {
            return ((Precondition)this.instance).getUpdateTime();
        }

        public Builder mergeUpdateTime(Timestamp timestamp) {
            this.copyOnWrite();
            ((Precondition)this.instance).mergeUpdateTime(timestamp);
            return this;
        }

        public Builder setExists(boolean bl) {
            this.copyOnWrite();
            ((Precondition)this.instance).setExists(bl);
            return this;
        }

        public Builder setUpdateTime(Timestamp.Builder builder) {
            this.copyOnWrite();
            ((Precondition)this.instance).setUpdateTime(builder);
            return this;
        }

        public Builder setUpdateTime(Timestamp timestamp) {
            this.copyOnWrite();
            ((Precondition)this.instance).setUpdateTime(timestamp);
            return this;
        }
    }

}

