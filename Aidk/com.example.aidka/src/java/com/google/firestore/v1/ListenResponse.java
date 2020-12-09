/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.firestore.v1.ListenResponse$1
 *  com.google.firestore.v1.ListenResponse$ResponseTypeCase
 *  com.google.firestore.v1.ListenResponseOrBuilder
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

import com.google.firestore.v1.DocumentChange;
import com.google.firestore.v1.DocumentDelete;
import com.google.firestore.v1.DocumentRemove;
import com.google.firestore.v1.ExistenceFilter;
import com.google.firestore.v1.ListenResponse;
import com.google.firestore.v1.ListenResponseOrBuilder;
import com.google.firestore.v1.TargetChange;
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

/*
 * Exception performing whole class analysis ignored.
 */
public final class ListenResponse
extends GeneratedMessageLite<ListenResponse, Builder>
implements ListenResponseOrBuilder {
    private static final ListenResponse DEFAULT_INSTANCE = new ListenResponse();
    public static final int DOCUMENT_CHANGE_FIELD_NUMBER = 3;
    public static final int DOCUMENT_DELETE_FIELD_NUMBER = 4;
    public static final int DOCUMENT_REMOVE_FIELD_NUMBER = 6;
    public static final int FILTER_FIELD_NUMBER = 5;
    private static volatile Parser<ListenResponse> PARSER;
    public static final int TARGET_CHANGE_FIELD_NUMBER = 2;
    private int responseTypeCase_ = 0;
    private Object responseType_;

    static {
        DEFAULT_INSTANCE.makeImmutable();
    }

    private ListenResponse() {
    }

    private void clearDocumentChange() {
        if (this.responseTypeCase_ == 3) {
            this.responseTypeCase_ = 0;
            this.responseType_ = null;
        }
    }

    private void clearDocumentDelete() {
        if (this.responseTypeCase_ == 4) {
            this.responseTypeCase_ = 0;
            this.responseType_ = null;
        }
    }

    private void clearDocumentRemove() {
        if (this.responseTypeCase_ == 6) {
            this.responseTypeCase_ = 0;
            this.responseType_ = null;
        }
    }

    private void clearFilter() {
        if (this.responseTypeCase_ == 5) {
            this.responseTypeCase_ = 0;
            this.responseType_ = null;
        }
    }

    private void clearResponseType() {
        this.responseTypeCase_ = 0;
        this.responseType_ = null;
    }

    private void clearTargetChange() {
        if (this.responseTypeCase_ == 2) {
            this.responseTypeCase_ = 0;
            this.responseType_ = null;
        }
    }

    public static ListenResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeDocumentChange(DocumentChange documentChange) {
        this.responseType_ = this.responseTypeCase_ == 3 && this.responseType_ != DocumentChange.getDefaultInstance() ? ((DocumentChange.Builder)DocumentChange.newBuilder((DocumentChange)((Object)this.responseType_)).mergeFrom((GeneratedMessageLite)documentChange)).buildPartial() : documentChange;
        this.responseTypeCase_ = 3;
    }

    private void mergeDocumentDelete(DocumentDelete documentDelete) {
        this.responseType_ = this.responseTypeCase_ == 4 && this.responseType_ != DocumentDelete.getDefaultInstance() ? ((DocumentDelete.Builder)DocumentDelete.newBuilder((DocumentDelete)((Object)this.responseType_)).mergeFrom((GeneratedMessageLite)documentDelete)).buildPartial() : documentDelete;
        this.responseTypeCase_ = 4;
    }

    private void mergeDocumentRemove(DocumentRemove documentRemove) {
        this.responseType_ = this.responseTypeCase_ == 6 && this.responseType_ != DocumentRemove.getDefaultInstance() ? ((DocumentRemove.Builder)DocumentRemove.newBuilder((DocumentRemove)((Object)this.responseType_)).mergeFrom((GeneratedMessageLite)documentRemove)).buildPartial() : documentRemove;
        this.responseTypeCase_ = 6;
    }

    private void mergeFilter(ExistenceFilter existenceFilter) {
        this.responseType_ = this.responseTypeCase_ == 5 && this.responseType_ != ExistenceFilter.getDefaultInstance() ? ((ExistenceFilter.Builder)ExistenceFilter.newBuilder((ExistenceFilter)((Object)this.responseType_)).mergeFrom((GeneratedMessageLite)existenceFilter)).buildPartial() : existenceFilter;
        this.responseTypeCase_ = 5;
    }

    private void mergeTargetChange(TargetChange targetChange) {
        this.responseType_ = this.responseTypeCase_ == 2 && this.responseType_ != TargetChange.getDefaultInstance() ? ((TargetChange.Builder)TargetChange.newBuilder((TargetChange)((Object)this.responseType_)).mergeFrom((GeneratedMessageLite)targetChange)).buildPartial() : targetChange;
        this.responseTypeCase_ = 2;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(ListenResponse listenResponse) {
        return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)listenResponse);
    }

    public static ListenResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ListenResponse)ListenResponse.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static ListenResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ListenResponse)ListenResponse.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ListenResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ListenResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static ListenResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ListenResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ListenResponse parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ListenResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static ListenResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ListenResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ListenResponse parseFrom(InputStream inputStream) throws IOException {
        return (ListenResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static ListenResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ListenResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ListenResponse parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (ListenResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static ListenResponse parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ListenResponse)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<ListenResponse> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setDocumentChange(DocumentChange.Builder builder) {
        this.responseType_ = builder.build();
        this.responseTypeCase_ = 3;
    }

    private void setDocumentChange(DocumentChange documentChange) {
        if (documentChange != null) {
            this.responseType_ = documentChange;
            this.responseTypeCase_ = 3;
            return;
        }
        throw new NullPointerException();
    }

    private void setDocumentDelete(DocumentDelete.Builder builder) {
        this.responseType_ = builder.build();
        this.responseTypeCase_ = 4;
    }

    private void setDocumentDelete(DocumentDelete documentDelete) {
        if (documentDelete != null) {
            this.responseType_ = documentDelete;
            this.responseTypeCase_ = 4;
            return;
        }
        throw new NullPointerException();
    }

    private void setDocumentRemove(DocumentRemove.Builder builder) {
        this.responseType_ = builder.build();
        this.responseTypeCase_ = 6;
    }

    private void setDocumentRemove(DocumentRemove documentRemove) {
        if (documentRemove != null) {
            this.responseType_ = documentRemove;
            this.responseTypeCase_ = 6;
            return;
        }
        throw new NullPointerException();
    }

    private void setFilter(ExistenceFilter.Builder builder) {
        this.responseType_ = builder.build();
        this.responseTypeCase_ = 5;
    }

    private void setFilter(ExistenceFilter existenceFilter) {
        if (existenceFilter != null) {
            this.responseType_ = existenceFilter;
            this.responseTypeCase_ = 5;
            return;
        }
        throw new NullPointerException();
    }

    private void setTargetChange(TargetChange.Builder builder) {
        this.responseType_ = builder.build();
        this.responseTypeCase_ = 2;
    }

    private void setTargetChange(TargetChange targetChange) {
        if (targetChange != null) {
            this.responseType_ = targetChange;
            this.responseTypeCase_ = 2;
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
                if (ListenResponse.PARSER != null) return ListenResponse.PARSER;
                var32_4 = ListenResponse.class;
                // MONITORENTER : com.google.firestore.v1.ListenResponse.class
                if (ListenResponse.PARSER == null) {
                    ListenResponse.PARSER = new GeneratedMessageLite.DefaultInstanceBasedParser((GeneratedMessageLite)ListenResponse.DEFAULT_INSTANCE);
                }
                // MONITOREXIT : var32_4
                return ListenResponse.PARSER;
            }
            case 6: {
                var9_5 = (CodedInputStream)var2_2;
                var10_6 = (ExtensionRegistryLite)var3_3;
                var11_7 = false;
                while (var11_7 == false) {
                    var15_8 = var9_5.readTag();
                    if (var15_8 != 0) {
                        if (var15_8 != 18) {
                            if (var15_8 != 26) {
                                if (var15_8 != 34) {
                                    if (var15_8 != 42) {
                                        if (var15_8 != 50) {
                                            if (var9_5.skipField(var15_8)) continue;
                                            var11_7 = true;
                                            continue;
                                        }
                                        var28_17 = this.responseTypeCase_;
                                        var29_18 = null;
                                        if (var28_17 == 6) {
                                            var29_18 = (DocumentRemove.Builder)((DocumentRemove)this.responseType_).toBuilder();
                                        }
                                        this.responseType_ = var9_5.readMessage(DocumentRemove.parser(), var10_6);
                                        if (var29_18 != null) {
                                            var29_18.mergeFrom((GeneratedMessageLite)((DocumentRemove)this.responseType_));
                                            this.responseType_ = var29_18.buildPartial();
                                        }
                                        this.responseTypeCase_ = 6;
                                        continue;
                                    }
                                    var25_15 = this.responseTypeCase_;
                                    var26_16 = null;
                                    if (var25_15 == 5) {
                                        var26_16 = (ExistenceFilter.Builder)((ExistenceFilter)this.responseType_).toBuilder();
                                    }
                                    this.responseType_ = var9_5.readMessage(ExistenceFilter.parser(), var10_6);
                                    if (var26_16 != null) {
                                        var26_16.mergeFrom((GeneratedMessageLite)((ExistenceFilter)this.responseType_));
                                        this.responseType_ = var26_16.buildPartial();
                                    }
                                    this.responseTypeCase_ = 5;
                                    continue;
                                }
                                var22_13 = this.responseTypeCase_;
                                var23_14 = null;
                                if (var22_13 == 4) {
                                    var23_14 = (DocumentDelete.Builder)((DocumentDelete)this.responseType_).toBuilder();
                                }
                                this.responseType_ = var9_5.readMessage(DocumentDelete.parser(), var10_6);
                                if (var23_14 != null) {
                                    var23_14.mergeFrom((GeneratedMessageLite)((DocumentDelete)this.responseType_));
                                    this.responseType_ = var23_14.buildPartial();
                                }
                                this.responseTypeCase_ = 4;
                                continue;
                            }
                            var19_11 = this.responseTypeCase_;
                            var20_12 = null;
                            if (var19_11 == 3) {
                                var20_12 = (DocumentChange.Builder)((DocumentChange)this.responseType_).toBuilder();
                            }
                            this.responseType_ = var9_5.readMessage(DocumentChange.parser(), var10_6);
                            if (var20_12 != null) {
                                var20_12.mergeFrom((GeneratedMessageLite)((DocumentChange)this.responseType_));
                                this.responseType_ = var20_12.buildPartial();
                            }
                            this.responseTypeCase_ = 3;
                            continue;
                        }
                        var16_9 = this.responseTypeCase_;
                        var17_10 = null;
                        if (var16_9 == 2) {
                            var17_10 = (TargetChange.Builder)((TargetChange)this.responseType_).toBuilder();
                        }
                        this.responseType_ = var9_5.readMessage(TargetChange.parser(), var10_6);
                        if (var17_10 != null) {
                            var17_10.mergeFrom((GeneratedMessageLite)((TargetChange)this.responseType_));
                            this.responseType_ = var17_10.buildPartial();
                        }
                        this.responseTypeCase_ = 2;
                        continue;
                    }
                    var11_7 = true;
                    continue;
                    catch (IOException var14_20) {
                        throw new RuntimeException((Throwable)new InvalidProtocolBufferException(var14_20.getMessage()).setUnfinishedMessage((MessageLite)this));
                    }
                    catch (InvalidProtocolBufferException var12_21) {
                        throw new RuntimeException((Throwable)var12_21.setUnfinishedMessage((MessageLite)this));
                    }
                }
                return ListenResponse.DEFAULT_INSTANCE;
            }
            case 7: {
                return ListenResponse.DEFAULT_INSTANCE;
            }
            case 5: {
                var4_22 = (GeneratedMessageLite.Visitor)var2_2;
                var5_23 = (ListenResponse)var3_3;
                var6_24 = 1.$SwitchMap$com$google$firestore$v1$ListenResponse$ResponseTypeCase[var5_23.getResponseTypeCase().ordinal()];
                var7_25 = true;
                switch (var6_24) {
                    default: {
                        ** break;
                    }
                    case 6: {
                        if (this.responseTypeCase_ == 0) {
                            var7_25 = false;
                        }
                        var4_22.visitOneofNotSet(var7_25);
                        ** break;
                    }
                    case 5: {
                        if (this.responseTypeCase_ != 5) {
                            var7_25 = false;
                        }
                        this.responseType_ = var4_22.visitOneofMessage(var7_25, this.responseType_, var5_23.responseType_);
                        ** break;
                    }
                    case 4: {
                        if (this.responseTypeCase_ != 6) {
                            var7_25 = false;
                        }
                        this.responseType_ = var4_22.visitOneofMessage(var7_25, this.responseType_, var5_23.responseType_);
                        ** break;
                    }
                    case 3: {
                        if (this.responseTypeCase_ != 4) {
                            var7_25 = false;
                        }
                        this.responseType_ = var4_22.visitOneofMessage(var7_25, this.responseType_, var5_23.responseType_);
                        ** break;
                    }
                    case 2: {
                        if (this.responseTypeCase_ != 3) {
                            var7_25 = false;
                        }
                        this.responseType_ = var4_22.visitOneofMessage(var7_25, this.responseType_, var5_23.responseType_);
                        ** break;
                    }
                    case 1: 
                }
                if (this.responseTypeCase_ != 2) {
                    var7_25 = false;
                }
                this.responseType_ = var4_22.visitOneofMessage(var7_25, this.responseType_, var5_23.responseType_);
lbl127: // 7 sources:
                if (var4_22 != GeneratedMessageLite.MergeFromVisitor.INSTANCE) return this;
                var8_26 = var5_23.responseTypeCase_;
                if (var8_26 == 0) return this;
                this.responseTypeCase_ = var8_26;
                return this;
            }
            case 4: {
                return new Builder();
            }
            case 3: {
                return null;
            }
            case 2: {
                return ListenResponse.DEFAULT_INSTANCE;
            }
            case 1: 
        }
        return new ListenResponse();
    }

    public DocumentChange getDocumentChange() {
        if (this.responseTypeCase_ == 3) {
            return (DocumentChange)((Object)this.responseType_);
        }
        return DocumentChange.getDefaultInstance();
    }

    public DocumentDelete getDocumentDelete() {
        if (this.responseTypeCase_ == 4) {
            return (DocumentDelete)((Object)this.responseType_);
        }
        return DocumentDelete.getDefaultInstance();
    }

    public DocumentRemove getDocumentRemove() {
        if (this.responseTypeCase_ == 6) {
            return (DocumentRemove)((Object)this.responseType_);
        }
        return DocumentRemove.getDefaultInstance();
    }

    public ExistenceFilter getFilter() {
        if (this.responseTypeCase_ == 5) {
            return (ExistenceFilter)((Object)this.responseType_);
        }
        return ExistenceFilter.getDefaultInstance();
    }

    public ResponseTypeCase getResponseTypeCase() {
        return ResponseTypeCase.forNumber((int)this.responseTypeCase_);
    }

    public int getSerializedSize() {
        int n = this.memoizedSerializedSize;
        if (n != -1) {
            return n;
        }
        int n2 = this.responseTypeCase_;
        int n3 = 0;
        if (n2 == 2) {
            n3 = 0 + CodedOutputStream.computeMessageSize((int)2, (MessageLite)((TargetChange)((Object)this.responseType_)));
        }
        if (this.responseTypeCase_ == 3) {
            n3 += CodedOutputStream.computeMessageSize((int)3, (MessageLite)((DocumentChange)((Object)this.responseType_)));
        }
        if (this.responseTypeCase_ == 4) {
            n3 += CodedOutputStream.computeMessageSize((int)4, (MessageLite)((DocumentDelete)((Object)this.responseType_)));
        }
        if (this.responseTypeCase_ == 5) {
            n3 += CodedOutputStream.computeMessageSize((int)5, (MessageLite)((ExistenceFilter)((Object)this.responseType_)));
        }
        if (this.responseTypeCase_ == 6) {
            n3 += CodedOutputStream.computeMessageSize((int)6, (MessageLite)((DocumentRemove)((Object)this.responseType_)));
        }
        this.memoizedSerializedSize = n3;
        return n3;
    }

    public TargetChange getTargetChange() {
        if (this.responseTypeCase_ == 2) {
            return (TargetChange)((Object)this.responseType_);
        }
        return TargetChange.getDefaultInstance();
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.responseTypeCase_ == 2) {
            codedOutputStream.writeMessage(2, (MessageLite)((TargetChange)((Object)this.responseType_)));
        }
        if (this.responseTypeCase_ == 3) {
            codedOutputStream.writeMessage(3, (MessageLite)((DocumentChange)((Object)this.responseType_)));
        }
        if (this.responseTypeCase_ == 4) {
            codedOutputStream.writeMessage(4, (MessageLite)((DocumentDelete)((Object)this.responseType_)));
        }
        if (this.responseTypeCase_ == 5) {
            codedOutputStream.writeMessage(5, (MessageLite)((ExistenceFilter)((Object)this.responseType_)));
        }
        if (this.responseTypeCase_ == 6) {
            codedOutputStream.writeMessage(6, (MessageLite)((DocumentRemove)((Object)this.responseType_)));
        }
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<ListenResponse, Builder>
    implements ListenResponseOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder clearDocumentChange() {
            this.copyOnWrite();
            ((ListenResponse)this.instance).clearDocumentChange();
            return this;
        }

        public Builder clearDocumentDelete() {
            this.copyOnWrite();
            ((ListenResponse)this.instance).clearDocumentDelete();
            return this;
        }

        public Builder clearDocumentRemove() {
            this.copyOnWrite();
            ((ListenResponse)this.instance).clearDocumentRemove();
            return this;
        }

        public Builder clearFilter() {
            this.copyOnWrite();
            ((ListenResponse)this.instance).clearFilter();
            return this;
        }

        public Builder clearResponseType() {
            this.copyOnWrite();
            ((ListenResponse)this.instance).clearResponseType();
            return this;
        }

        public Builder clearTargetChange() {
            this.copyOnWrite();
            ((ListenResponse)this.instance).clearTargetChange();
            return this;
        }

        public DocumentChange getDocumentChange() {
            return ((ListenResponse)this.instance).getDocumentChange();
        }

        public DocumentDelete getDocumentDelete() {
            return ((ListenResponse)this.instance).getDocumentDelete();
        }

        public DocumentRemove getDocumentRemove() {
            return ((ListenResponse)this.instance).getDocumentRemove();
        }

        public ExistenceFilter getFilter() {
            return ((ListenResponse)this.instance).getFilter();
        }

        public ResponseTypeCase getResponseTypeCase() {
            return ((ListenResponse)this.instance).getResponseTypeCase();
        }

        public TargetChange getTargetChange() {
            return ((ListenResponse)this.instance).getTargetChange();
        }

        public Builder mergeDocumentChange(DocumentChange documentChange) {
            this.copyOnWrite();
            ((ListenResponse)this.instance).mergeDocumentChange(documentChange);
            return this;
        }

        public Builder mergeDocumentDelete(DocumentDelete documentDelete) {
            this.copyOnWrite();
            ((ListenResponse)this.instance).mergeDocumentDelete(documentDelete);
            return this;
        }

        public Builder mergeDocumentRemove(DocumentRemove documentRemove) {
            this.copyOnWrite();
            ((ListenResponse)this.instance).mergeDocumentRemove(documentRemove);
            return this;
        }

        public Builder mergeFilter(ExistenceFilter existenceFilter) {
            this.copyOnWrite();
            ((ListenResponse)this.instance).mergeFilter(existenceFilter);
            return this;
        }

        public Builder mergeTargetChange(TargetChange targetChange) {
            this.copyOnWrite();
            ((ListenResponse)this.instance).mergeTargetChange(targetChange);
            return this;
        }

        public Builder setDocumentChange(DocumentChange.Builder builder) {
            this.copyOnWrite();
            ((ListenResponse)this.instance).setDocumentChange(builder);
            return this;
        }

        public Builder setDocumentChange(DocumentChange documentChange) {
            this.copyOnWrite();
            ((ListenResponse)this.instance).setDocumentChange(documentChange);
            return this;
        }

        public Builder setDocumentDelete(DocumentDelete.Builder builder) {
            this.copyOnWrite();
            ((ListenResponse)this.instance).setDocumentDelete(builder);
            return this;
        }

        public Builder setDocumentDelete(DocumentDelete documentDelete) {
            this.copyOnWrite();
            ((ListenResponse)this.instance).setDocumentDelete(documentDelete);
            return this;
        }

        public Builder setDocumentRemove(DocumentRemove.Builder builder) {
            this.copyOnWrite();
            ((ListenResponse)this.instance).setDocumentRemove(builder);
            return this;
        }

        public Builder setDocumentRemove(DocumentRemove documentRemove) {
            this.copyOnWrite();
            ((ListenResponse)this.instance).setDocumentRemove(documentRemove);
            return this;
        }

        public Builder setFilter(ExistenceFilter.Builder builder) {
            this.copyOnWrite();
            ((ListenResponse)this.instance).setFilter(builder);
            return this;
        }

        public Builder setFilter(ExistenceFilter existenceFilter) {
            this.copyOnWrite();
            ((ListenResponse)this.instance).setFilter(existenceFilter);
            return this;
        }

        public Builder setTargetChange(TargetChange.Builder builder) {
            this.copyOnWrite();
            ((ListenResponse)this.instance).setTargetChange(builder);
            return this;
        }

        public Builder setTargetChange(TargetChange targetChange) {
            this.copyOnWrite();
            ((ListenResponse)this.instance).setTargetChange(targetChange);
            return this;
        }
    }

}

