/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.firestore.v1.Target$1
 *  com.google.firestore.v1.Target$DocumentsTargetOrBuilder
 *  com.google.firestore.v1.Target$QueryTarget$QueryTypeCase
 *  com.google.firestore.v1.Target$QueryTargetOrBuilder
 *  com.google.firestore.v1.Target$ResumeTypeCase
 *  com.google.firestore.v1.Target$TargetTypeCase
 *  com.google.firestore.v1.TargetOrBuilder
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
 *  com.google.protobuf.Timestamp
 *  com.google.protobuf.Timestamp$Builder
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
package com.google.firestore.v1;

import com.google.firestore.v1.StructuredQuery;
import com.google.firestore.v1.Target;
import com.google.firestore.v1.TargetOrBuilder;
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
import com.google.protobuf.Timestamp;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/*
 * Exception performing whole class analysis ignored.
 */
public final class Target
extends GeneratedMessageLite<Target, Builder>
implements TargetOrBuilder {
    private static final Target DEFAULT_INSTANCE = new Target();
    public static final int DOCUMENTS_FIELD_NUMBER = 3;
    public static final int ONCE_FIELD_NUMBER = 6;
    private static volatile Parser<Target> PARSER;
    public static final int QUERY_FIELD_NUMBER = 2;
    public static final int READ_TIME_FIELD_NUMBER = 11;
    public static final int RESUME_TOKEN_FIELD_NUMBER = 4;
    public static final int TARGET_ID_FIELD_NUMBER = 5;
    private boolean once_;
    private int resumeTypeCase_ = 0;
    private Object resumeType_;
    private int targetId_;
    private int targetTypeCase_ = 0;
    private Object targetType_;

    static {
        DEFAULT_INSTANCE.makeImmutable();
    }

    private Target() {
    }

    private void clearDocuments() {
        if (this.targetTypeCase_ == 3) {
            this.targetTypeCase_ = 0;
            this.targetType_ = null;
        }
    }

    private void clearOnce() {
        this.once_ = false;
    }

    private void clearQuery() {
        if (this.targetTypeCase_ == 2) {
            this.targetTypeCase_ = 0;
            this.targetType_ = null;
        }
    }

    private void clearReadTime() {
        if (this.resumeTypeCase_ == 11) {
            this.resumeTypeCase_ = 0;
            this.resumeType_ = null;
        }
    }

    private void clearResumeToken() {
        if (this.resumeTypeCase_ == 4) {
            this.resumeTypeCase_ = 0;
            this.resumeType_ = null;
        }
    }

    private void clearResumeType() {
        this.resumeTypeCase_ = 0;
        this.resumeType_ = null;
    }

    private void clearTargetId() {
        this.targetId_ = 0;
    }

    private void clearTargetType() {
        this.targetTypeCase_ = 0;
        this.targetType_ = null;
    }

    public static Target getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeDocuments(DocumentsTarget documentsTarget) {
        this.targetType_ = this.targetTypeCase_ == 3 && this.targetType_ != DocumentsTarget.getDefaultInstance() ? ((DocumentsTarget.Builder)DocumentsTarget.newBuilder((DocumentsTarget)((Object)this.targetType_)).mergeFrom((GeneratedMessageLite)documentsTarget)).buildPartial() : documentsTarget;
        this.targetTypeCase_ = 3;
    }

    private void mergeQuery(QueryTarget queryTarget) {
        this.targetType_ = this.targetTypeCase_ == 2 && this.targetType_ != QueryTarget.getDefaultInstance() ? ((QueryTarget.Builder)QueryTarget.newBuilder((QueryTarget)((Object)this.targetType_)).mergeFrom((GeneratedMessageLite)queryTarget)).buildPartial() : queryTarget;
        this.targetTypeCase_ = 2;
    }

    private void mergeReadTime(Timestamp timestamp) {
        this.resumeType_ = this.resumeTypeCase_ == 11 && this.resumeType_ != Timestamp.getDefaultInstance() ? ((Timestamp.Builder)Timestamp.newBuilder((Timestamp)((Timestamp)this.resumeType_)).mergeFrom((GeneratedMessageLite)timestamp)).buildPartial() : timestamp;
        this.resumeTypeCase_ = 11;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(Target target) {
        return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)target);
    }

    public static Target parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Target)Target.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Target parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Target)Target.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Target parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Target)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static Target parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Target)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Target parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Target)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static Target parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Target)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Target parseFrom(InputStream inputStream) throws IOException {
        return (Target)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Target parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Target)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Target parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (Target)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static Target parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Target)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<Target> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setDocuments(DocumentsTarget.Builder builder) {
        this.targetType_ = builder.build();
        this.targetTypeCase_ = 3;
    }

    private void setDocuments(DocumentsTarget documentsTarget) {
        if (documentsTarget != null) {
            this.targetType_ = documentsTarget;
            this.targetTypeCase_ = 3;
            return;
        }
        throw new NullPointerException();
    }

    private void setOnce(boolean bl) {
        this.once_ = bl;
    }

    private void setQuery(QueryTarget.Builder builder) {
        this.targetType_ = builder.build();
        this.targetTypeCase_ = 2;
    }

    private void setQuery(QueryTarget queryTarget) {
        if (queryTarget != null) {
            this.targetType_ = queryTarget;
            this.targetTypeCase_ = 2;
            return;
        }
        throw new NullPointerException();
    }

    private void setReadTime(Timestamp.Builder builder) {
        this.resumeType_ = builder.build();
        this.resumeTypeCase_ = 11;
    }

    private void setReadTime(Timestamp timestamp) {
        if (timestamp != null) {
            this.resumeType_ = timestamp;
            this.resumeTypeCase_ = 11;
            return;
        }
        throw new NullPointerException();
    }

    private void setResumeToken(ByteString byteString) {
        if (byteString != null) {
            this.resumeTypeCase_ = 4;
            this.resumeType_ = byteString;
            return;
        }
        throw new NullPointerException();
    }

    private void setTargetId(int n) {
        this.targetId_ = n;
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
                Class<Target> class_ = Target.class;
                // MONITORENTER : com.google.firestore.v1.Target.class
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
                                if (n != 34) {
                                    if (n != 40) {
                                        if (n != 48) {
                                            if (n != 90) {
                                                if (codedInputStream.skipField(n)) continue;
                                                bl = true;
                                                continue;
                                            }
                                            int n2 = this.resumeTypeCase_;
                                            Timestamp.Builder builder = null;
                                            if (n2 == 11) {
                                                builder = (Timestamp.Builder)((Timestamp)this.resumeType_).toBuilder();
                                            }
                                            this.resumeType_ = codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                            if (builder != null) {
                                                builder.mergeFrom((GeneratedMessageLite)((Timestamp)this.resumeType_));
                                                this.resumeType_ = builder.buildPartial();
                                            }
                                            this.resumeTypeCase_ = 11;
                                            continue;
                                        }
                                        this.once_ = codedInputStream.readBool();
                                        continue;
                                    }
                                    this.targetId_ = codedInputStream.readInt32();
                                    continue;
                                }
                                this.resumeTypeCase_ = 4;
                                this.resumeType_ = codedInputStream.readBytes();
                                continue;
                            }
                            int n3 = this.targetTypeCase_;
                            DocumentsTarget.Builder builder = null;
                            if (n3 == 3) {
                                builder = (DocumentsTarget.Builder)((DocumentsTarget)((Object)this.targetType_)).toBuilder();
                            }
                            this.targetType_ = codedInputStream.readMessage(DocumentsTarget.parser(), extensionRegistryLite);
                            if (builder != null) {
                                builder.mergeFrom((GeneratedMessageLite)((DocumentsTarget)((Object)this.targetType_)));
                                this.targetType_ = builder.buildPartial();
                            }
                            this.targetTypeCase_ = 3;
                            continue;
                        }
                        int n4 = this.targetTypeCase_;
                        QueryTarget.Builder builder = null;
                        if (n4 == 2) {
                            builder = (QueryTarget.Builder)((QueryTarget)((Object)this.targetType_)).toBuilder();
                        }
                        this.targetType_ = codedInputStream.readMessage(QueryTarget.parser(), extensionRegistryLite);
                        if (builder != null) {
                            builder.mergeFrom((GeneratedMessageLite)((QueryTarget)((Object)this.targetType_)));
                            this.targetType_ = builder.buildPartial();
                        }
                        this.targetTypeCase_ = 2;
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
                int n5;
                int n;
                GeneratedMessageLite.Visitor visitor = (GeneratedMessageLite.Visitor)object;
                Target target = (Target)((Object)object2);
                boolean bl = this.targetId_ != 0;
                int n6 = this.targetId_;
                boolean bl2 = target.targetId_ != 0;
                this.targetId_ = visitor.visitInt(bl, n6, bl2, target.targetId_);
                boolean bl3 = this.once_;
                boolean bl4 = target.once_;
                this.once_ = visitor.visitBoolean(bl3, bl3, bl4, bl4);
                int n7 = 1.$SwitchMap$com$google$firestore$v1$Target$TargetTypeCase[target.getTargetTypeCase().ordinal()];
                if (n7 != 1) {
                    if (n7 != 2) {
                        if (n7 == 3) {
                            boolean bl5 = this.targetTypeCase_ != 0;
                            visitor.visitOneofNotSet(bl5);
                        }
                    } else {
                        boolean bl6 = this.targetTypeCase_ == 3;
                        this.targetType_ = visitor.visitOneofMessage(bl6, this.targetType_, target.targetType_);
                    }
                } else {
                    boolean bl7 = this.targetTypeCase_ == 2;
                    this.targetType_ = visitor.visitOneofMessage(bl7, this.targetType_, target.targetType_);
                }
                if ((n5 = 1.$SwitchMap$com$google$firestore$v1$Target$ResumeTypeCase[target.getResumeTypeCase().ordinal()]) != 1) {
                    if (n5 != 2) {
                        if (n5 == 3) {
                            int n8 = this.resumeTypeCase_;
                            boolean bl8 = false;
                            if (n8 != 0) {
                                bl8 = true;
                            }
                            visitor.visitOneofNotSet(bl8);
                        }
                    } else {
                        int n9 = this.resumeTypeCase_;
                        boolean bl9 = false;
                        if (n9 == 11) {
                            bl9 = true;
                        }
                        this.resumeType_ = visitor.visitOneofMessage(bl9, this.resumeType_, target.resumeType_);
                    }
                } else {
                    int n10 = this.resumeTypeCase_;
                    boolean bl10 = false;
                    if (n10 == 4) {
                        bl10 = true;
                    }
                    this.resumeType_ = visitor.visitOneofByteString(bl10, this.resumeType_, target.resumeType_);
                }
                if (visitor != GeneratedMessageLite.MergeFromVisitor.INSTANCE) return this;
                int n11 = target.targetTypeCase_;
                if (n11 != 0) {
                    this.targetTypeCase_ = n11;
                }
                if ((n = target.resumeTypeCase_) == 0) return this;
                this.resumeTypeCase_ = n;
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
        return new Target();
    }

    public DocumentsTarget getDocuments() {
        if (this.targetTypeCase_ == 3) {
            return (DocumentsTarget)((Object)this.targetType_);
        }
        return DocumentsTarget.getDefaultInstance();
    }

    public boolean getOnce() {
        return this.once_;
    }

    public QueryTarget getQuery() {
        if (this.targetTypeCase_ == 2) {
            return (QueryTarget)((Object)this.targetType_);
        }
        return QueryTarget.getDefaultInstance();
    }

    public Timestamp getReadTime() {
        if (this.resumeTypeCase_ == 11) {
            return (Timestamp)this.resumeType_;
        }
        return Timestamp.getDefaultInstance();
    }

    public ByteString getResumeToken() {
        if (this.resumeTypeCase_ == 4) {
            return (ByteString)this.resumeType_;
        }
        return ByteString.EMPTY;
    }

    public ResumeTypeCase getResumeTypeCase() {
        return ResumeTypeCase.forNumber((int)this.resumeTypeCase_);
    }

    public int getSerializedSize() {
        boolean bl;
        int n;
        int n2 = this.memoizedSerializedSize;
        if (n2 != -1) {
            return n2;
        }
        int n3 = this.targetTypeCase_;
        int n4 = 0;
        if (n3 == 2) {
            n4 = 0 + CodedOutputStream.computeMessageSize((int)2, (MessageLite)((QueryTarget)((Object)this.targetType_)));
        }
        if (this.targetTypeCase_ == 3) {
            n4 += CodedOutputStream.computeMessageSize((int)3, (MessageLite)((DocumentsTarget)((Object)this.targetType_)));
        }
        if (this.resumeTypeCase_ == 4) {
            n4 += CodedOutputStream.computeBytesSize((int)4, (ByteString)((ByteString)this.resumeType_));
        }
        if ((n = this.targetId_) != 0) {
            n4 += CodedOutputStream.computeInt32Size((int)5, (int)n);
        }
        if (bl = this.once_) {
            n4 += CodedOutputStream.computeBoolSize((int)6, (boolean)bl);
        }
        if (this.resumeTypeCase_ == 11) {
            n4 += CodedOutputStream.computeMessageSize((int)11, (MessageLite)((Timestamp)this.resumeType_));
        }
        this.memoizedSerializedSize = n4;
        return n4;
    }

    public int getTargetId() {
        return this.targetId_;
    }

    public TargetTypeCase getTargetTypeCase() {
        return TargetTypeCase.forNumber((int)this.targetTypeCase_);
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        int n;
        boolean bl;
        if (this.targetTypeCase_ == 2) {
            codedOutputStream.writeMessage(2, (MessageLite)((QueryTarget)((Object)this.targetType_)));
        }
        if (this.targetTypeCase_ == 3) {
            codedOutputStream.writeMessage(3, (MessageLite)((DocumentsTarget)((Object)this.targetType_)));
        }
        if (this.resumeTypeCase_ == 4) {
            codedOutputStream.writeBytes(4, (ByteString)this.resumeType_);
        }
        if ((n = this.targetId_) != 0) {
            codedOutputStream.writeInt32(5, n);
        }
        if (bl = this.once_) {
            codedOutputStream.writeBool(6, bl);
        }
        if (this.resumeTypeCase_ == 11) {
            codedOutputStream.writeMessage(11, (MessageLite)((Timestamp)this.resumeType_));
        }
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<Target, Builder>
    implements TargetOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder clearDocuments() {
            this.copyOnWrite();
            ((Target)this.instance).clearDocuments();
            return this;
        }

        public Builder clearOnce() {
            this.copyOnWrite();
            ((Target)this.instance).clearOnce();
            return this;
        }

        public Builder clearQuery() {
            this.copyOnWrite();
            ((Target)this.instance).clearQuery();
            return this;
        }

        public Builder clearReadTime() {
            this.copyOnWrite();
            ((Target)this.instance).clearReadTime();
            return this;
        }

        public Builder clearResumeToken() {
            this.copyOnWrite();
            ((Target)this.instance).clearResumeToken();
            return this;
        }

        public Builder clearResumeType() {
            this.copyOnWrite();
            ((Target)this.instance).clearResumeType();
            return this;
        }

        public Builder clearTargetId() {
            this.copyOnWrite();
            ((Target)this.instance).clearTargetId();
            return this;
        }

        public Builder clearTargetType() {
            this.copyOnWrite();
            ((Target)this.instance).clearTargetType();
            return this;
        }

        public DocumentsTarget getDocuments() {
            return ((Target)this.instance).getDocuments();
        }

        public boolean getOnce() {
            return ((Target)this.instance).getOnce();
        }

        public QueryTarget getQuery() {
            return ((Target)this.instance).getQuery();
        }

        public Timestamp getReadTime() {
            return ((Target)this.instance).getReadTime();
        }

        public ByteString getResumeToken() {
            return ((Target)this.instance).getResumeToken();
        }

        public ResumeTypeCase getResumeTypeCase() {
            return ((Target)this.instance).getResumeTypeCase();
        }

        public int getTargetId() {
            return ((Target)this.instance).getTargetId();
        }

        public TargetTypeCase getTargetTypeCase() {
            return ((Target)this.instance).getTargetTypeCase();
        }

        public Builder mergeDocuments(DocumentsTarget documentsTarget) {
            this.copyOnWrite();
            ((Target)this.instance).mergeDocuments(documentsTarget);
            return this;
        }

        public Builder mergeQuery(QueryTarget queryTarget) {
            this.copyOnWrite();
            ((Target)this.instance).mergeQuery(queryTarget);
            return this;
        }

        public Builder mergeReadTime(Timestamp timestamp) {
            this.copyOnWrite();
            ((Target)this.instance).mergeReadTime(timestamp);
            return this;
        }

        public Builder setDocuments(DocumentsTarget.Builder builder) {
            this.copyOnWrite();
            ((Target)this.instance).setDocuments(builder);
            return this;
        }

        public Builder setDocuments(DocumentsTarget documentsTarget) {
            this.copyOnWrite();
            ((Target)this.instance).setDocuments(documentsTarget);
            return this;
        }

        public Builder setOnce(boolean bl) {
            this.copyOnWrite();
            ((Target)this.instance).setOnce(bl);
            return this;
        }

        public Builder setQuery(QueryTarget.Builder builder) {
            this.copyOnWrite();
            ((Target)this.instance).setQuery(builder);
            return this;
        }

        public Builder setQuery(QueryTarget queryTarget) {
            this.copyOnWrite();
            ((Target)this.instance).setQuery(queryTarget);
            return this;
        }

        public Builder setReadTime(Timestamp.Builder builder) {
            this.copyOnWrite();
            ((Target)this.instance).setReadTime(builder);
            return this;
        }

        public Builder setReadTime(Timestamp timestamp) {
            this.copyOnWrite();
            ((Target)this.instance).setReadTime(timestamp);
            return this;
        }

        public Builder setResumeToken(ByteString byteString) {
            this.copyOnWrite();
            ((Target)this.instance).setResumeToken(byteString);
            return this;
        }

        public Builder setTargetId(int n) {
            this.copyOnWrite();
            ((Target)this.instance).setTargetId(n);
            return this;
        }
    }

    public static final class DocumentsTarget
    extends GeneratedMessageLite<DocumentsTarget, Builder>
    implements DocumentsTargetOrBuilder {
        private static final DocumentsTarget DEFAULT_INSTANCE = new DocumentsTarget();
        public static final int DOCUMENTS_FIELD_NUMBER = 2;
        private static volatile Parser<DocumentsTarget> PARSER;
        private Internal.ProtobufList<String> documents_ = GeneratedMessageLite.emptyProtobufList();

        static {
            DEFAULT_INSTANCE.makeImmutable();
        }

        private DocumentsTarget() {
        }

        private void addAllDocuments(Iterable<String> iterable) {
            this.ensureDocumentsIsMutable();
            AbstractMessageLite.addAll(iterable, this.documents_);
        }

        private void addDocuments(String string) {
            if (string != null) {
                this.ensureDocumentsIsMutable();
                this.documents_.add((Object)string);
                return;
            }
            throw new NullPointerException();
        }

        private void addDocumentsBytes(ByteString byteString) {
            if (byteString != null) {
                DocumentsTarget.checkByteStringIsUtf8((ByteString)byteString);
                this.ensureDocumentsIsMutable();
                this.documents_.add((Object)byteString.toStringUtf8());
                return;
            }
            throw new NullPointerException();
        }

        private void clearDocuments() {
            this.documents_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureDocumentsIsMutable() {
            if (!this.documents_.isModifiable()) {
                this.documents_ = GeneratedMessageLite.mutableCopy(this.documents_);
            }
        }

        public static DocumentsTarget getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(DocumentsTarget documentsTarget) {
            return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)documentsTarget);
        }

        public static DocumentsTarget parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (DocumentsTarget)DocumentsTarget.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static DocumentsTarget parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DocumentsTarget)DocumentsTarget.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static DocumentsTarget parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (DocumentsTarget)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
        }

        public static DocumentsTarget parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DocumentsTarget)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static DocumentsTarget parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (DocumentsTarget)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
        }

        public static DocumentsTarget parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DocumentsTarget)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static DocumentsTarget parseFrom(InputStream inputStream) throws IOException {
            return (DocumentsTarget)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static DocumentsTarget parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (DocumentsTarget)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static DocumentsTarget parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
            return (DocumentsTarget)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
        }

        public static DocumentsTarget parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (DocumentsTarget)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Parser<DocumentsTarget> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setDocuments(int n, String string) {
            if (string != null) {
                this.ensureDocumentsIsMutable();
                this.documents_.set(n, (Object)string);
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
                    Class<DocumentsTarget> class_ = DocumentsTarget.class;
                    // MONITORENTER : com.google.firestore.v1.Target$DocumentsTarget.class
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
                            if (n != 18) {
                                if (codedInputStream.skipField(n)) continue;
                                bl = true;
                                continue;
                            }
                            String string = codedInputStream.readStringRequireUtf8();
                            if (!this.documents_.isModifiable()) {
                                this.documents_ = GeneratedMessageLite.mutableCopy(this.documents_);
                            }
                            this.documents_.add((Object)string);
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
                    DocumentsTarget documentsTarget = (DocumentsTarget)((Object)object2);
                    this.documents_ = visitor.visitList(this.documents_, documentsTarget.documents_);
                    return this;
                }
                case 4: {
                    return new Builder();
                }
                case 3: {
                    this.documents_.makeImmutable();
                    return null;
                }
                case 2: {
                    return DEFAULT_INSTANCE;
                }
                case 1: 
            }
            return new DocumentsTarget();
        }

        public String getDocuments(int n) {
            return (String)this.documents_.get(n);
        }

        public ByteString getDocumentsBytes(int n) {
            return ByteString.copyFromUtf8((String)((String)this.documents_.get(n)));
        }

        public int getDocumentsCount() {
            return this.documents_.size();
        }

        public List<String> getDocumentsList() {
            return this.documents_;
        }

        public int getSerializedSize() {
            int n;
            int n2 = this.memoizedSerializedSize;
            if (n2 != -1) {
                return n2;
            }
            int n3 = 0;
            for (int i = 0; i < this.documents_.size(); ++i) {
                n3 += CodedOutputStream.computeStringSizeNoTag((String)((String)this.documents_.get(i)));
            }
            this.memoizedSerializedSize = n = 0 + n3 + 1 * this.getDocumentsList().size();
            return n;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            for (int i = 0; i < this.documents_.size(); ++i) {
                codedOutputStream.writeString(2, (String)this.documents_.get(i));
            }
        }

        public static final class Builder
        extends GeneratedMessageLite.Builder<DocumentsTarget, Builder>
        implements DocumentsTargetOrBuilder {
            private Builder() {
                super((GeneratedMessageLite)DEFAULT_INSTANCE);
            }

            public Builder addAllDocuments(Iterable<String> iterable) {
                this.copyOnWrite();
                ((DocumentsTarget)this.instance).addAllDocuments((Iterable<String>)iterable);
                return this;
            }

            public Builder addDocuments(String string) {
                this.copyOnWrite();
                ((DocumentsTarget)this.instance).addDocuments(string);
                return this;
            }

            public Builder addDocumentsBytes(ByteString byteString) {
                this.copyOnWrite();
                ((DocumentsTarget)this.instance).addDocumentsBytes(byteString);
                return this;
            }

            public Builder clearDocuments() {
                this.copyOnWrite();
                ((DocumentsTarget)this.instance).clearDocuments();
                return this;
            }

            public String getDocuments(int n) {
                return ((DocumentsTarget)this.instance).getDocuments(n);
            }

            public ByteString getDocumentsBytes(int n) {
                return ((DocumentsTarget)this.instance).getDocumentsBytes(n);
            }

            public int getDocumentsCount() {
                return ((DocumentsTarget)this.instance).getDocumentsCount();
            }

            public List<String> getDocumentsList() {
                return Collections.unmodifiableList(((DocumentsTarget)this.instance).getDocumentsList());
            }

            public Builder setDocuments(int n, String string) {
                this.copyOnWrite();
                ((DocumentsTarget)this.instance).setDocuments(n, string);
                return this;
            }
        }

    }

    /*
     * Exception performing whole class analysis ignored.
     */
    public static final class QueryTarget
    extends GeneratedMessageLite<QueryTarget, Builder>
    implements QueryTargetOrBuilder {
        private static final QueryTarget DEFAULT_INSTANCE = new QueryTarget();
        public static final int PARENT_FIELD_NUMBER = 1;
        private static volatile Parser<QueryTarget> PARSER;
        public static final int STRUCTURED_QUERY_FIELD_NUMBER = 2;
        private String parent_ = "";
        private int queryTypeCase_ = 0;
        private Object queryType_;

        static {
            DEFAULT_INSTANCE.makeImmutable();
        }

        private QueryTarget() {
        }

        private void clearParent() {
            this.parent_ = QueryTarget.getDefaultInstance().getParent();
        }

        private void clearQueryType() {
            this.queryTypeCase_ = 0;
            this.queryType_ = null;
        }

        private void clearStructuredQuery() {
            if (this.queryTypeCase_ == 2) {
                this.queryTypeCase_ = 0;
                this.queryType_ = null;
            }
        }

        public static QueryTarget getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeStructuredQuery(StructuredQuery structuredQuery) {
            this.queryType_ = this.queryTypeCase_ == 2 && this.queryType_ != StructuredQuery.getDefaultInstance() ? ((StructuredQuery.Builder)StructuredQuery.newBuilder((StructuredQuery)((Object)this.queryType_)).mergeFrom((GeneratedMessageLite)structuredQuery)).buildPartial() : structuredQuery;
            this.queryTypeCase_ = 2;
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(QueryTarget queryTarget) {
            return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)queryTarget);
        }

        public static QueryTarget parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (QueryTarget)QueryTarget.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static QueryTarget parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (QueryTarget)QueryTarget.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static QueryTarget parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (QueryTarget)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
        }

        public static QueryTarget parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (QueryTarget)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static QueryTarget parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (QueryTarget)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
        }

        public static QueryTarget parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (QueryTarget)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static QueryTarget parseFrom(InputStream inputStream) throws IOException {
            return (QueryTarget)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static QueryTarget parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (QueryTarget)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static QueryTarget parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
            return (QueryTarget)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
        }

        public static QueryTarget parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (QueryTarget)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Parser<QueryTarget> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setParent(String string) {
            if (string != null) {
                this.parent_ = string;
                return;
            }
            throw new NullPointerException();
        }

        private void setParentBytes(ByteString byteString) {
            if (byteString != null) {
                QueryTarget.checkByteStringIsUtf8((ByteString)byteString);
                this.parent_ = byteString.toStringUtf8();
                return;
            }
            throw new NullPointerException();
        }

        private void setStructuredQuery(StructuredQuery.Builder builder) {
            this.queryType_ = builder.build();
            this.queryTypeCase_ = 2;
        }

        private void setStructuredQuery(StructuredQuery structuredQuery) {
            if (structuredQuery != null) {
                this.queryType_ = structuredQuery;
                this.queryTypeCase_ = 2;
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
                    Class<QueryTarget> class_ = QueryTarget.class;
                    // MONITORENTER : com.google.firestore.v1.Target$QueryTarget.class
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
                                    if (codedInputStream.skipField(n)) continue;
                                    bl = true;
                                    continue;
                                }
                                int n2 = this.queryTypeCase_;
                                StructuredQuery.Builder builder = null;
                                if (n2 == 2) {
                                    builder = (StructuredQuery.Builder)((StructuredQuery)((Object)this.queryType_)).toBuilder();
                                }
                                this.queryType_ = codedInputStream.readMessage(StructuredQuery.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom((GeneratedMessageLite)((StructuredQuery)((Object)this.queryType_)));
                                    this.queryType_ = builder.buildPartial();
                                }
                                this.queryTypeCase_ = 2;
                                continue;
                            }
                            this.parent_ = codedInputStream.readStringRequireUtf8();
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
                    QueryTarget queryTarget = (QueryTarget)((Object)object2);
                    boolean bl = this.parent_.isEmpty();
                    boolean bl2 = true;
                    this.parent_ = visitor.visitString(bl ^ bl2, this.parent_, bl2 ^ queryTarget.parent_.isEmpty(), queryTarget.parent_);
                    boolean bl3 = 1.$SwitchMap$com$google$firestore$v1$Target$QueryTarget$QueryTypeCase[queryTarget.getQueryTypeCase().ordinal()];
                    if (bl3 != bl2) {
                        if (bl3) {
                            if (this.queryTypeCase_ == 0) {
                                bl2 = false;
                            }
                            visitor.visitOneofNotSet(bl2);
                        }
                    } else {
                        if (this.queryTypeCase_ != 2) {
                            bl2 = false;
                        }
                        this.queryType_ = visitor.visitOneofMessage(bl2, this.queryType_, queryTarget.queryType_);
                    }
                    if (visitor != GeneratedMessageLite.MergeFromVisitor.INSTANCE) return this;
                    int n = queryTarget.queryTypeCase_;
                    if (n == 0) return this;
                    this.queryTypeCase_ = n;
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
            return new QueryTarget();
        }

        public String getParent() {
            return this.parent_;
        }

        public ByteString getParentBytes() {
            return ByteString.copyFromUtf8((String)this.parent_);
        }

        public QueryTypeCase getQueryTypeCase() {
            return QueryTypeCase.forNumber((int)this.queryTypeCase_);
        }

        public int getSerializedSize() {
            int n = this.memoizedSerializedSize;
            if (n != -1) {
                return n;
            }
            boolean bl = this.parent_.isEmpty();
            int n2 = 0;
            if (!bl) {
                n2 = 0 + CodedOutputStream.computeStringSize((int)1, (String)this.getParent());
            }
            if (this.queryTypeCase_ == 2) {
                n2 += CodedOutputStream.computeMessageSize((int)2, (MessageLite)((StructuredQuery)((Object)this.queryType_)));
            }
            this.memoizedSerializedSize = n2;
            return n2;
        }

        public StructuredQuery getStructuredQuery() {
            if (this.queryTypeCase_ == 2) {
                return (StructuredQuery)((Object)this.queryType_);
            }
            return StructuredQuery.getDefaultInstance();
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.parent_.isEmpty()) {
                codedOutputStream.writeString(1, this.getParent());
            }
            if (this.queryTypeCase_ == 2) {
                codedOutputStream.writeMessage(2, (MessageLite)((StructuredQuery)((Object)this.queryType_)));
            }
        }

        public static final class Builder
        extends GeneratedMessageLite.Builder<QueryTarget, Builder>
        implements QueryTargetOrBuilder {
            private Builder() {
                super((GeneratedMessageLite)DEFAULT_INSTANCE);
            }

            public Builder clearParent() {
                this.copyOnWrite();
                ((QueryTarget)this.instance).clearParent();
                return this;
            }

            public Builder clearQueryType() {
                this.copyOnWrite();
                ((QueryTarget)this.instance).clearQueryType();
                return this;
            }

            public Builder clearStructuredQuery() {
                this.copyOnWrite();
                ((QueryTarget)this.instance).clearStructuredQuery();
                return this;
            }

            public String getParent() {
                return ((QueryTarget)this.instance).getParent();
            }

            public ByteString getParentBytes() {
                return ((QueryTarget)this.instance).getParentBytes();
            }

            public QueryTypeCase getQueryTypeCase() {
                return ((QueryTarget)this.instance).getQueryTypeCase();
            }

            public StructuredQuery getStructuredQuery() {
                return ((QueryTarget)this.instance).getStructuredQuery();
            }

            public Builder mergeStructuredQuery(StructuredQuery structuredQuery) {
                this.copyOnWrite();
                ((QueryTarget)this.instance).mergeStructuredQuery(structuredQuery);
                return this;
            }

            public Builder setParent(String string) {
                this.copyOnWrite();
                ((QueryTarget)this.instance).setParent(string);
                return this;
            }

            public Builder setParentBytes(ByteString byteString) {
                this.copyOnWrite();
                ((QueryTarget)this.instance).setParentBytes(byteString);
                return this;
            }

            public Builder setStructuredQuery(StructuredQuery.Builder builder) {
                this.copyOnWrite();
                ((QueryTarget)this.instance).setStructuredQuery(builder);
                return this;
            }

            public Builder setStructuredQuery(StructuredQuery structuredQuery) {
                this.copyOnWrite();
                ((QueryTarget)this.instance).setStructuredQuery(structuredQuery);
                return this;
            }
        }

    }

}

