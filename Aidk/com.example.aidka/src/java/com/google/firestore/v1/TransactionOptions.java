/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.firestore.v1.TransactionOptions$1
 *  com.google.firestore.v1.TransactionOptions$ModeCase
 *  com.google.firestore.v1.TransactionOptions$ReadOnly$ConsistencySelectorCase
 *  com.google.firestore.v1.TransactionOptions$ReadOnlyOrBuilder
 *  com.google.firestore.v1.TransactionOptions$ReadWriteOrBuilder
 *  com.google.firestore.v1.TransactionOptionsOrBuilder
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
 *  java.lang.Class
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.UnsupportedOperationException
 */
package com.google.firestore.v1;

import com.google.firestore.v1.TransactionOptions;
import com.google.firestore.v1.TransactionOptionsOrBuilder;
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
public final class TransactionOptions
extends GeneratedMessageLite<TransactionOptions, Builder>
implements TransactionOptionsOrBuilder {
    private static final TransactionOptions DEFAULT_INSTANCE = new TransactionOptions();
    private static volatile Parser<TransactionOptions> PARSER;
    public static final int READ_ONLY_FIELD_NUMBER = 2;
    public static final int READ_WRITE_FIELD_NUMBER = 3;
    private int modeCase_ = 0;
    private Object mode_;

    static {
        DEFAULT_INSTANCE.makeImmutable();
    }

    private TransactionOptions() {
    }

    private void clearMode() {
        this.modeCase_ = 0;
        this.mode_ = null;
    }

    private void clearReadOnly() {
        if (this.modeCase_ == 2) {
            this.modeCase_ = 0;
            this.mode_ = null;
        }
    }

    private void clearReadWrite() {
        if (this.modeCase_ == 3) {
            this.modeCase_ = 0;
            this.mode_ = null;
        }
    }

    public static TransactionOptions getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeReadOnly(ReadOnly readOnly) {
        this.mode_ = this.modeCase_ == 2 && this.mode_ != ReadOnly.getDefaultInstance() ? ((ReadOnly.Builder)ReadOnly.newBuilder((ReadOnly)((Object)this.mode_)).mergeFrom((GeneratedMessageLite)readOnly)).buildPartial() : readOnly;
        this.modeCase_ = 2;
    }

    private void mergeReadWrite(ReadWrite readWrite) {
        this.mode_ = this.modeCase_ == 3 && this.mode_ != ReadWrite.getDefaultInstance() ? ((ReadWrite.Builder)ReadWrite.newBuilder((ReadWrite)((Object)this.mode_)).mergeFrom((GeneratedMessageLite)readWrite)).buildPartial() : readWrite;
        this.modeCase_ = 3;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(TransactionOptions transactionOptions) {
        return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)transactionOptions);
    }

    public static TransactionOptions parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (TransactionOptions)TransactionOptions.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static TransactionOptions parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TransactionOptions)TransactionOptions.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static TransactionOptions parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (TransactionOptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static TransactionOptions parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TransactionOptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static TransactionOptions parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (TransactionOptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static TransactionOptions parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TransactionOptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static TransactionOptions parseFrom(InputStream inputStream) throws IOException {
        return (TransactionOptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static TransactionOptions parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (TransactionOptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static TransactionOptions parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (TransactionOptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static TransactionOptions parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (TransactionOptions)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<TransactionOptions> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setReadOnly(ReadOnly.Builder builder) {
        this.mode_ = builder.build();
        this.modeCase_ = 2;
    }

    private void setReadOnly(ReadOnly readOnly) {
        if (readOnly != null) {
            this.mode_ = readOnly;
            this.modeCase_ = 2;
            return;
        }
        throw new NullPointerException();
    }

    private void setReadWrite(ReadWrite.Builder builder) {
        this.mode_ = builder.build();
        this.modeCase_ = 3;
    }

    private void setReadWrite(ReadWrite readWrite) {
        if (readWrite != null) {
            this.mode_ = readWrite;
            this.modeCase_ = 3;
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
                Class<TransactionOptions> class_ = TransactionOptions.class;
                // MONITORENTER : com.google.firestore.v1.TransactionOptions.class
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
                        if (n != 18) {
                            if (n != 26) {
                                if (codedInputStream.skipField(n)) continue;
                                bl = true;
                                continue;
                            }
                            int n2 = this.modeCase_;
                            ReadWrite.Builder builder = null;
                            if (n2 == 3) {
                                builder = (ReadWrite.Builder)((ReadWrite)((Object)this.mode_)).toBuilder();
                            }
                            this.mode_ = codedInputStream.readMessage(ReadWrite.parser(), extensionRegistryLite);
                            if (builder != null) {
                                builder.mergeFrom((GeneratedMessageLite)((ReadWrite)((Object)this.mode_)));
                                this.mode_ = builder.buildPartial();
                            }
                            this.modeCase_ = 3;
                            continue;
                        }
                        int n3 = this.modeCase_;
                        ReadOnly.Builder builder = null;
                        if (n3 == 2) {
                            builder = (ReadOnly.Builder)((ReadOnly)((Object)this.mode_)).toBuilder();
                        }
                        this.mode_ = codedInputStream.readMessage(ReadOnly.parser(), extensionRegistryLite);
                        if (builder != null) {
                            builder.mergeFrom((GeneratedMessageLite)((ReadOnly)((Object)this.mode_)));
                            this.mode_ = builder.buildPartial();
                        }
                        this.modeCase_ = 2;
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
                TransactionOptions transactionOptions = (TransactionOptions)((Object)object2);
                int n = 1.$SwitchMap$com$google$firestore$v1$TransactionOptions$ModeCase[transactionOptions.getModeCase().ordinal()];
                if (n != 1) {
                    if (n != 2) {
                        if (n == 3) {
                            int n4 = this.modeCase_;
                            boolean bl = false;
                            if (n4 != 0) {
                                bl = true;
                            }
                            visitor.visitOneofNotSet(bl);
                        }
                    } else {
                        int n5 = this.modeCase_;
                        boolean bl = false;
                        if (n5 == 3) {
                            bl = true;
                        }
                        this.mode_ = visitor.visitOneofMessage(bl, this.mode_, transactionOptions.mode_);
                    }
                } else {
                    int n6 = this.modeCase_;
                    boolean bl = false;
                    if (n6 == 2) {
                        bl = true;
                    }
                    this.mode_ = visitor.visitOneofMessage(bl, this.mode_, transactionOptions.mode_);
                }
                if (visitor != GeneratedMessageLite.MergeFromVisitor.INSTANCE) return this;
                int n7 = transactionOptions.modeCase_;
                if (n7 == 0) return this;
                this.modeCase_ = n7;
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
        return new TransactionOptions();
    }

    public ModeCase getModeCase() {
        return ModeCase.forNumber((int)this.modeCase_);
    }

    public ReadOnly getReadOnly() {
        if (this.modeCase_ == 2) {
            return (ReadOnly)((Object)this.mode_);
        }
        return ReadOnly.getDefaultInstance();
    }

    public ReadWrite getReadWrite() {
        if (this.modeCase_ == 3) {
            return (ReadWrite)((Object)this.mode_);
        }
        return ReadWrite.getDefaultInstance();
    }

    public int getSerializedSize() {
        int n = this.memoizedSerializedSize;
        if (n != -1) {
            return n;
        }
        int n2 = this.modeCase_;
        int n3 = 0;
        if (n2 == 2) {
            n3 = 0 + CodedOutputStream.computeMessageSize((int)2, (MessageLite)((ReadOnly)((Object)this.mode_)));
        }
        if (this.modeCase_ == 3) {
            n3 += CodedOutputStream.computeMessageSize((int)3, (MessageLite)((ReadWrite)((Object)this.mode_)));
        }
        this.memoizedSerializedSize = n3;
        return n3;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.modeCase_ == 2) {
            codedOutputStream.writeMessage(2, (MessageLite)((ReadOnly)((Object)this.mode_)));
        }
        if (this.modeCase_ == 3) {
            codedOutputStream.writeMessage(3, (MessageLite)((ReadWrite)((Object)this.mode_)));
        }
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<TransactionOptions, Builder>
    implements TransactionOptionsOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder clearMode() {
            this.copyOnWrite();
            ((TransactionOptions)this.instance).clearMode();
            return this;
        }

        public Builder clearReadOnly() {
            this.copyOnWrite();
            ((TransactionOptions)this.instance).clearReadOnly();
            return this;
        }

        public Builder clearReadWrite() {
            this.copyOnWrite();
            ((TransactionOptions)this.instance).clearReadWrite();
            return this;
        }

        public ModeCase getModeCase() {
            return ((TransactionOptions)this.instance).getModeCase();
        }

        public ReadOnly getReadOnly() {
            return ((TransactionOptions)this.instance).getReadOnly();
        }

        public ReadWrite getReadWrite() {
            return ((TransactionOptions)this.instance).getReadWrite();
        }

        public Builder mergeReadOnly(ReadOnly readOnly) {
            this.copyOnWrite();
            ((TransactionOptions)this.instance).mergeReadOnly(readOnly);
            return this;
        }

        public Builder mergeReadWrite(ReadWrite readWrite) {
            this.copyOnWrite();
            ((TransactionOptions)this.instance).mergeReadWrite(readWrite);
            return this;
        }

        public Builder setReadOnly(ReadOnly.Builder builder) {
            this.copyOnWrite();
            ((TransactionOptions)this.instance).setReadOnly(builder);
            return this;
        }

        public Builder setReadOnly(ReadOnly readOnly) {
            this.copyOnWrite();
            ((TransactionOptions)this.instance).setReadOnly(readOnly);
            return this;
        }

        public Builder setReadWrite(ReadWrite.Builder builder) {
            this.copyOnWrite();
            ((TransactionOptions)this.instance).setReadWrite(builder);
            return this;
        }

        public Builder setReadWrite(ReadWrite readWrite) {
            this.copyOnWrite();
            ((TransactionOptions)this.instance).setReadWrite(readWrite);
            return this;
        }
    }

    /*
     * Exception performing whole class analysis ignored.
     */
    public static final class ReadOnly
    extends GeneratedMessageLite<ReadOnly, Builder>
    implements ReadOnlyOrBuilder {
        private static final ReadOnly DEFAULT_INSTANCE = new ReadOnly();
        private static volatile Parser<ReadOnly> PARSER;
        public static final int READ_TIME_FIELD_NUMBER = 2;
        private int consistencySelectorCase_ = 0;
        private Object consistencySelector_;

        static {
            DEFAULT_INSTANCE.makeImmutable();
        }

        private ReadOnly() {
        }

        private void clearConsistencySelector() {
            this.consistencySelectorCase_ = 0;
            this.consistencySelector_ = null;
        }

        private void clearReadTime() {
            if (this.consistencySelectorCase_ == 2) {
                this.consistencySelectorCase_ = 0;
                this.consistencySelector_ = null;
            }
        }

        public static ReadOnly getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeReadTime(Timestamp timestamp) {
            this.consistencySelector_ = this.consistencySelectorCase_ == 2 && this.consistencySelector_ != Timestamp.getDefaultInstance() ? ((Timestamp.Builder)Timestamp.newBuilder((Timestamp)((Timestamp)this.consistencySelector_)).mergeFrom((GeneratedMessageLite)timestamp)).buildPartial() : timestamp;
            this.consistencySelectorCase_ = 2;
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(ReadOnly readOnly) {
            return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)readOnly);
        }

        public static ReadOnly parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ReadOnly)ReadOnly.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static ReadOnly parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ReadOnly)ReadOnly.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static ReadOnly parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ReadOnly)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
        }

        public static ReadOnly parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ReadOnly)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static ReadOnly parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ReadOnly)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
        }

        public static ReadOnly parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ReadOnly)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static ReadOnly parseFrom(InputStream inputStream) throws IOException {
            return (ReadOnly)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static ReadOnly parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ReadOnly)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static ReadOnly parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
            return (ReadOnly)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
        }

        public static ReadOnly parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ReadOnly)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Parser<ReadOnly> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setReadTime(Timestamp.Builder builder) {
            this.consistencySelector_ = builder.build();
            this.consistencySelectorCase_ = 2;
        }

        private void setReadTime(Timestamp timestamp) {
            if (timestamp != null) {
                this.consistencySelector_ = timestamp;
                this.consistencySelectorCase_ = 2;
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
                    Class<ReadOnly> class_ = ReadOnly.class;
                    // MONITORENTER : com.google.firestore.v1.TransactionOptions$ReadOnly.class
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
                            if (n != 18) {
                                if (codedInputStream.skipField(n)) continue;
                                bl = true;
                                continue;
                            }
                            int n2 = this.consistencySelectorCase_;
                            Timestamp.Builder builder = null;
                            if (n2 == 2) {
                                builder = (Timestamp.Builder)((Timestamp)this.consistencySelector_).toBuilder();
                            }
                            this.consistencySelector_ = codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                            if (builder != null) {
                                builder.mergeFrom((GeneratedMessageLite)((Timestamp)this.consistencySelector_));
                                this.consistencySelector_ = builder.buildPartial();
                            }
                            this.consistencySelectorCase_ = 2;
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
                    ReadOnly readOnly = (ReadOnly)((Object)object2);
                    int n = 1.$SwitchMap$com$google$firestore$v1$TransactionOptions$ReadOnly$ConsistencySelectorCase[readOnly.getConsistencySelectorCase().ordinal()];
                    if (n != 1) {
                        if (n == 2) {
                            int n3 = this.consistencySelectorCase_;
                            boolean bl = false;
                            if (n3 != 0) {
                                bl = true;
                            }
                            visitor.visitOneofNotSet(bl);
                        }
                    } else {
                        int n4 = this.consistencySelectorCase_;
                        boolean bl = false;
                        if (n4 == 2) {
                            bl = true;
                        }
                        this.consistencySelector_ = visitor.visitOneofMessage(bl, this.consistencySelector_, readOnly.consistencySelector_);
                    }
                    if (visitor != GeneratedMessageLite.MergeFromVisitor.INSTANCE) return this;
                    int n5 = readOnly.consistencySelectorCase_;
                    if (n5 == 0) return this;
                    this.consistencySelectorCase_ = n5;
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
            return new ReadOnly();
        }

        public ConsistencySelectorCase getConsistencySelectorCase() {
            return ConsistencySelectorCase.forNumber((int)this.consistencySelectorCase_);
        }

        public Timestamp getReadTime() {
            if (this.consistencySelectorCase_ == 2) {
                return (Timestamp)this.consistencySelector_;
            }
            return Timestamp.getDefaultInstance();
        }

        public int getSerializedSize() {
            int n = this.memoizedSerializedSize;
            if (n != -1) {
                return n;
            }
            int n2 = this.consistencySelectorCase_;
            int n3 = 0;
            if (n2 == 2) {
                n3 = 0 + CodedOutputStream.computeMessageSize((int)2, (MessageLite)((Timestamp)this.consistencySelector_));
            }
            this.memoizedSerializedSize = n3;
            return n3;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.consistencySelectorCase_ == 2) {
                codedOutputStream.writeMessage(2, (MessageLite)((Timestamp)this.consistencySelector_));
            }
        }

        public static final class Builder
        extends GeneratedMessageLite.Builder<ReadOnly, Builder>
        implements ReadOnlyOrBuilder {
            private Builder() {
                super((GeneratedMessageLite)DEFAULT_INSTANCE);
            }

            public Builder clearConsistencySelector() {
                this.copyOnWrite();
                ((ReadOnly)this.instance).clearConsistencySelector();
                return this;
            }

            public Builder clearReadTime() {
                this.copyOnWrite();
                ((ReadOnly)this.instance).clearReadTime();
                return this;
            }

            public ConsistencySelectorCase getConsistencySelectorCase() {
                return ((ReadOnly)this.instance).getConsistencySelectorCase();
            }

            public Timestamp getReadTime() {
                return ((ReadOnly)this.instance).getReadTime();
            }

            public Builder mergeReadTime(Timestamp timestamp) {
                this.copyOnWrite();
                ((ReadOnly)this.instance).mergeReadTime(timestamp);
                return this;
            }

            public Builder setReadTime(Timestamp.Builder builder) {
                this.copyOnWrite();
                ((ReadOnly)this.instance).setReadTime(builder);
                return this;
            }

            public Builder setReadTime(Timestamp timestamp) {
                this.copyOnWrite();
                ((ReadOnly)this.instance).setReadTime(timestamp);
                return this;
            }
        }

    }

    public static final class ReadWrite
    extends GeneratedMessageLite<ReadWrite, Builder>
    implements ReadWriteOrBuilder {
        private static final ReadWrite DEFAULT_INSTANCE = new ReadWrite();
        private static volatile Parser<ReadWrite> PARSER;
        public static final int RETRY_TRANSACTION_FIELD_NUMBER = 1;
        private ByteString retryTransaction_ = ByteString.EMPTY;

        static {
            DEFAULT_INSTANCE.makeImmutable();
        }

        private ReadWrite() {
        }

        private void clearRetryTransaction() {
            this.retryTransaction_ = ReadWrite.getDefaultInstance().getRetryTransaction();
        }

        public static ReadWrite getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(ReadWrite readWrite) {
            return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)readWrite);
        }

        public static ReadWrite parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ReadWrite)ReadWrite.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static ReadWrite parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ReadWrite)ReadWrite.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static ReadWrite parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ReadWrite)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
        }

        public static ReadWrite parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ReadWrite)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static ReadWrite parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ReadWrite)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
        }

        public static ReadWrite parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ReadWrite)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static ReadWrite parseFrom(InputStream inputStream) throws IOException {
            return (ReadWrite)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static ReadWrite parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ReadWrite)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static ReadWrite parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
            return (ReadWrite)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
        }

        public static ReadWrite parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ReadWrite)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Parser<ReadWrite> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setRetryTransaction(ByteString byteString) {
            if (byteString != null) {
                this.retryTransaction_ = byteString;
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
                    Class<ReadWrite> class_ = ReadWrite.class;
                    // MONITORENTER : com.google.firestore.v1.TransactionOptions$ReadWrite.class
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
                                if (codedInputStream.skipField(n)) continue;
                                bl = true;
                                continue;
                            }
                            this.retryTransaction_ = codedInputStream.readBytes();
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
                    ReadWrite readWrite = (ReadWrite)((Object)object2);
                    ByteString byteString = this.retryTransaction_;
                    ByteString byteString2 = ByteString.EMPTY;
                    boolean bl = true;
                    boolean bl2 = byteString != byteString2;
                    ByteString byteString3 = this.retryTransaction_;
                    if (readWrite.retryTransaction_ == ByteString.EMPTY) {
                        bl = false;
                    }
                    this.retryTransaction_ = visitor.visitByteString(bl2, byteString3, bl, readWrite.retryTransaction_);
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
            return new ReadWrite();
        }

        public ByteString getRetryTransaction() {
            return this.retryTransaction_;
        }

        public int getSerializedSize() {
            int n = this.memoizedSerializedSize;
            if (n != -1) {
                return n;
            }
            boolean bl = this.retryTransaction_.isEmpty();
            int n2 = 0;
            if (!bl) {
                n2 = 0 + CodedOutputStream.computeBytesSize((int)1, (ByteString)this.retryTransaction_);
            }
            this.memoizedSerializedSize = n2;
            return n2;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.retryTransaction_.isEmpty()) {
                codedOutputStream.writeBytes(1, this.retryTransaction_);
            }
        }

        public static final class Builder
        extends GeneratedMessageLite.Builder<ReadWrite, Builder>
        implements ReadWriteOrBuilder {
            private Builder() {
                super((GeneratedMessageLite)DEFAULT_INSTANCE);
            }

            public Builder clearRetryTransaction() {
                this.copyOnWrite();
                ((ReadWrite)this.instance).clearRetryTransaction();
                return this;
            }

            public ByteString getRetryTransaction() {
                return ((ReadWrite)this.instance).getRetryTransaction();
            }

            public Builder setRetryTransaction(ByteString byteString) {
                this.copyOnWrite();
                ((ReadWrite)this.instance).setRetryTransaction(byteString);
                return this;
            }
        }

    }

}

