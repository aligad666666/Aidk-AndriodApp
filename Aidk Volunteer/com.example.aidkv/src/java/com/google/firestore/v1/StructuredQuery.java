/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.firestore.v1.StructuredQuery$1
 *  com.google.firestore.v1.StructuredQuery$CollectionSelectorOrBuilder
 *  com.google.firestore.v1.StructuredQuery$CompositeFilter$Operator
 *  com.google.firestore.v1.StructuredQuery$CompositeFilterOrBuilder
 *  com.google.firestore.v1.StructuredQuery$Direction
 *  com.google.firestore.v1.StructuredQuery$FieldFilter$Operator
 *  com.google.firestore.v1.StructuredQuery$FieldFilterOrBuilder
 *  com.google.firestore.v1.StructuredQuery$FieldReferenceOrBuilder
 *  com.google.firestore.v1.StructuredQuery$Filter$FilterTypeCase
 *  com.google.firestore.v1.StructuredQuery$FilterOrBuilder
 *  com.google.firestore.v1.StructuredQuery$OrderOrBuilder
 *  com.google.firestore.v1.StructuredQuery$ProjectionOrBuilder
 *  com.google.firestore.v1.StructuredQuery$UnaryFilter$OperandTypeCase
 *  com.google.firestore.v1.StructuredQuery$UnaryFilter$Operator
 *  com.google.firestore.v1.StructuredQuery$UnaryFilterOrBuilder
 *  com.google.firestore.v1.StructuredQueryOrBuilder
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
 *  com.google.protobuf.Int32Value
 *  com.google.protobuf.Int32Value$Builder
 *  com.google.protobuf.Internal
 *  com.google.protobuf.Internal$ProtobufList
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.Parser
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

import com.google.firestore.v1.Cursor;
import com.google.firestore.v1.StructuredQuery;
import com.google.firestore.v1.StructuredQueryOrBuilder;
import com.google.firestore.v1.Value;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Int32Value;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

public final class StructuredQuery
extends GeneratedMessageLite<StructuredQuery, Builder>
implements StructuredQueryOrBuilder {
    private static final StructuredQuery DEFAULT_INSTANCE = new StructuredQuery();
    public static final int END_AT_FIELD_NUMBER = 8;
    public static final int FROM_FIELD_NUMBER = 2;
    public static final int LIMIT_FIELD_NUMBER = 5;
    public static final int OFFSET_FIELD_NUMBER = 6;
    public static final int ORDER_BY_FIELD_NUMBER = 4;
    private static volatile Parser<StructuredQuery> PARSER;
    public static final int SELECT_FIELD_NUMBER = 1;
    public static final int START_AT_FIELD_NUMBER = 7;
    public static final int WHERE_FIELD_NUMBER = 3;
    private int bitField0_;
    private Cursor endAt_;
    private Internal.ProtobufList<CollectionSelector> from_ = StructuredQuery.emptyProtobufList();
    private Int32Value limit_;
    private int offset_;
    private Internal.ProtobufList<Order> orderBy_ = StructuredQuery.emptyProtobufList();
    private Projection select_;
    private Cursor startAt_;
    private Filter where_;

    static {
        DEFAULT_INSTANCE.makeImmutable();
    }

    private StructuredQuery() {
    }

    private void addAllFrom(Iterable<? extends CollectionSelector> iterable) {
        this.ensureFromIsMutable();
        AbstractMessageLite.addAll(iterable, this.from_);
    }

    private void addAllOrderBy(Iterable<? extends Order> iterable) {
        this.ensureOrderByIsMutable();
        AbstractMessageLite.addAll(iterable, this.orderBy_);
    }

    private void addFrom(int n, CollectionSelector.Builder builder) {
        this.ensureFromIsMutable();
        this.from_.add(n, (Object)((CollectionSelector)builder.build()));
    }

    private void addFrom(int n, CollectionSelector collectionSelector) {
        if (collectionSelector != null) {
            this.ensureFromIsMutable();
            this.from_.add(n, (Object)collectionSelector);
            return;
        }
        throw new NullPointerException();
    }

    private void addFrom(CollectionSelector.Builder builder) {
        this.ensureFromIsMutable();
        this.from_.add((Object)((CollectionSelector)builder.build()));
    }

    private void addFrom(CollectionSelector collectionSelector) {
        if (collectionSelector != null) {
            this.ensureFromIsMutable();
            this.from_.add((Object)collectionSelector);
            return;
        }
        throw new NullPointerException();
    }

    private void addOrderBy(int n, Order.Builder builder) {
        this.ensureOrderByIsMutable();
        this.orderBy_.add(n, (Object)((Order)builder.build()));
    }

    private void addOrderBy(int n, Order order) {
        if (order != null) {
            this.ensureOrderByIsMutable();
            this.orderBy_.add(n, (Object)order);
            return;
        }
        throw new NullPointerException();
    }

    private void addOrderBy(Order.Builder builder) {
        this.ensureOrderByIsMutable();
        this.orderBy_.add((Object)((Order)builder.build()));
    }

    private void addOrderBy(Order order) {
        if (order != null) {
            this.ensureOrderByIsMutable();
            this.orderBy_.add((Object)order);
            return;
        }
        throw new NullPointerException();
    }

    private void clearEndAt() {
        this.endAt_ = null;
    }

    private void clearFrom() {
        this.from_ = StructuredQuery.emptyProtobufList();
    }

    private void clearLimit() {
        this.limit_ = null;
    }

    private void clearOffset() {
        this.offset_ = 0;
    }

    private void clearOrderBy() {
        this.orderBy_ = StructuredQuery.emptyProtobufList();
    }

    private void clearSelect() {
        this.select_ = null;
    }

    private void clearStartAt() {
        this.startAt_ = null;
    }

    private void clearWhere() {
        this.where_ = null;
    }

    private void ensureFromIsMutable() {
        if (!this.from_.isModifiable()) {
            this.from_ = GeneratedMessageLite.mutableCopy(this.from_);
        }
    }

    private void ensureOrderByIsMutable() {
        if (!this.orderBy_.isModifiable()) {
            this.orderBy_ = GeneratedMessageLite.mutableCopy(this.orderBy_);
        }
    }

    public static StructuredQuery getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeEndAt(Cursor cursor) {
        Cursor cursor2 = this.endAt_;
        if (cursor2 != null && cursor2 != Cursor.getDefaultInstance()) {
            this.endAt_ = (Cursor)((Cursor.Builder)Cursor.newBuilder(this.endAt_).mergeFrom((GeneratedMessageLite)cursor)).buildPartial();
            return;
        }
        this.endAt_ = cursor;
    }

    private void mergeLimit(Int32Value int32Value) {
        Int32Value int32Value2 = this.limit_;
        if (int32Value2 != null && int32Value2 != Int32Value.getDefaultInstance()) {
            this.limit_ = (Int32Value)((Int32Value.Builder)Int32Value.newBuilder((Int32Value)this.limit_).mergeFrom((GeneratedMessageLite)int32Value)).buildPartial();
            return;
        }
        this.limit_ = int32Value;
    }

    private void mergeSelect(Projection projection) {
        Projection projection2 = this.select_;
        if (projection2 != null && projection2 != Projection.getDefaultInstance()) {
            this.select_ = (Projection)((Projection.Builder)Projection.newBuilder(this.select_).mergeFrom((GeneratedMessageLite)projection)).buildPartial();
            return;
        }
        this.select_ = projection;
    }

    private void mergeStartAt(Cursor cursor) {
        Cursor cursor2 = this.startAt_;
        if (cursor2 != null && cursor2 != Cursor.getDefaultInstance()) {
            this.startAt_ = (Cursor)((Cursor.Builder)Cursor.newBuilder(this.startAt_).mergeFrom((GeneratedMessageLite)cursor)).buildPartial();
            return;
        }
        this.startAt_ = cursor;
    }

    private void mergeWhere(Filter filter) {
        Filter filter2 = this.where_;
        if (filter2 != null && filter2 != Filter.getDefaultInstance()) {
            this.where_ = (Filter)((Filter.Builder)Filter.newBuilder(this.where_).mergeFrom((GeneratedMessageLite)filter)).buildPartial();
            return;
        }
        this.where_ = filter;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(StructuredQuery structuredQuery) {
        return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)structuredQuery);
    }

    public static StructuredQuery parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (StructuredQuery)StructuredQuery.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static StructuredQuery parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (StructuredQuery)StructuredQuery.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static StructuredQuery parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (StructuredQuery)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static StructuredQuery parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (StructuredQuery)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static StructuredQuery parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (StructuredQuery)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static StructuredQuery parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (StructuredQuery)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static StructuredQuery parseFrom(InputStream inputStream) throws IOException {
        return (StructuredQuery)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static StructuredQuery parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (StructuredQuery)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static StructuredQuery parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (StructuredQuery)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static StructuredQuery parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (StructuredQuery)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<StructuredQuery> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeFrom(int n) {
        this.ensureFromIsMutable();
        this.from_.remove(n);
    }

    private void removeOrderBy(int n) {
        this.ensureOrderByIsMutable();
        this.orderBy_.remove(n);
    }

    private void setEndAt(Cursor.Builder builder) {
        this.endAt_ = (Cursor)builder.build();
    }

    private void setEndAt(Cursor cursor) {
        if (cursor != null) {
            this.endAt_ = cursor;
            return;
        }
        throw new NullPointerException();
    }

    private void setFrom(int n, CollectionSelector.Builder builder) {
        this.ensureFromIsMutable();
        this.from_.set(n, (Object)((CollectionSelector)builder.build()));
    }

    private void setFrom(int n, CollectionSelector collectionSelector) {
        if (collectionSelector != null) {
            this.ensureFromIsMutable();
            this.from_.set(n, (Object)collectionSelector);
            return;
        }
        throw new NullPointerException();
    }

    private void setLimit(Int32Value.Builder builder) {
        this.limit_ = (Int32Value)builder.build();
    }

    private void setLimit(Int32Value int32Value) {
        if (int32Value != null) {
            this.limit_ = int32Value;
            return;
        }
        throw new NullPointerException();
    }

    private void setOffset(int n) {
        this.offset_ = n;
    }

    private void setOrderBy(int n, Order.Builder builder) {
        this.ensureOrderByIsMutable();
        this.orderBy_.set(n, (Object)((Order)builder.build()));
    }

    private void setOrderBy(int n, Order order) {
        if (order != null) {
            this.ensureOrderByIsMutable();
            this.orderBy_.set(n, (Object)order);
            return;
        }
        throw new NullPointerException();
    }

    private void setSelect(Projection.Builder builder) {
        this.select_ = (Projection)builder.build();
    }

    private void setSelect(Projection projection) {
        if (projection != null) {
            this.select_ = projection;
            return;
        }
        throw new NullPointerException();
    }

    private void setStartAt(Cursor.Builder builder) {
        this.startAt_ = (Cursor)builder.build();
    }

    private void setStartAt(Cursor cursor) {
        if (cursor != null) {
            this.startAt_ = cursor;
            return;
        }
        throw new NullPointerException();
    }

    private void setWhere(Filter.Builder builder) {
        this.where_ = (Filter)builder.build();
    }

    private void setWhere(Filter filter) {
        if (filter != null) {
            this.where_ = filter;
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
                Class<StructuredQuery> class_ = StructuredQuery.class;
                // MONITORENTER : com.google.firestore.v1.StructuredQuery.class
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
                                if (n != 26) {
                                    if (n != 34) {
                                        if (n != 42) {
                                            if (n != 48) {
                                                if (n != 58) {
                                                    if (n != 66) {
                                                        if (codedInputStream.skipField(n)) continue;
                                                        bl = true;
                                                        continue;
                                                    }
                                                    Cursor cursor = this.endAt_;
                                                    Cursor.Builder builder = null;
                                                    if (cursor != null) {
                                                        builder = (Cursor.Builder)this.endAt_.toBuilder();
                                                    }
                                                    this.endAt_ = (Cursor)codedInputStream.readMessage(Cursor.parser(), extensionRegistryLite);
                                                    if (builder == null) continue;
                                                    builder.mergeFrom((GeneratedMessageLite)this.endAt_);
                                                    this.endAt_ = (Cursor)builder.buildPartial();
                                                    continue;
                                                }
                                                Cursor cursor = this.startAt_;
                                                Cursor.Builder builder = null;
                                                if (cursor != null) {
                                                    builder = (Cursor.Builder)this.startAt_.toBuilder();
                                                }
                                                this.startAt_ = (Cursor)codedInputStream.readMessage(Cursor.parser(), extensionRegistryLite);
                                                if (builder == null) continue;
                                                builder.mergeFrom((GeneratedMessageLite)this.startAt_);
                                                this.startAt_ = (Cursor)builder.buildPartial();
                                                continue;
                                            }
                                            this.offset_ = codedInputStream.readInt32();
                                            continue;
                                        }
                                        Int32Value int32Value = this.limit_;
                                        Int32Value.Builder builder = null;
                                        if (int32Value != null) {
                                            builder = (Int32Value.Builder)this.limit_.toBuilder();
                                        }
                                        this.limit_ = (Int32Value)codedInputStream.readMessage(Int32Value.parser(), extensionRegistryLite);
                                        if (builder == null) continue;
                                        builder.mergeFrom((GeneratedMessageLite)this.limit_);
                                        this.limit_ = (Int32Value)builder.buildPartial();
                                        continue;
                                    }
                                    if (!this.orderBy_.isModifiable()) {
                                        this.orderBy_ = GeneratedMessageLite.mutableCopy(this.orderBy_);
                                    }
                                    this.orderBy_.add((Object)((Order)codedInputStream.readMessage(Order.parser(), extensionRegistryLite)));
                                    continue;
                                }
                                Filter filter = this.where_;
                                Filter.Builder builder = null;
                                if (filter != null) {
                                    builder = (Filter.Builder)this.where_.toBuilder();
                                }
                                this.where_ = (Filter)codedInputStream.readMessage(Filter.parser(), extensionRegistryLite);
                                if (builder == null) continue;
                                builder.mergeFrom((GeneratedMessageLite)this.where_);
                                this.where_ = (Filter)builder.buildPartial();
                                continue;
                            }
                            if (!this.from_.isModifiable()) {
                                this.from_ = GeneratedMessageLite.mutableCopy(this.from_);
                            }
                            this.from_.add((Object)((CollectionSelector)codedInputStream.readMessage(CollectionSelector.parser(), extensionRegistryLite)));
                            continue;
                        }
                        Projection projection = this.select_;
                        Projection.Builder builder = null;
                        if (projection != null) {
                            builder = (Projection.Builder)this.select_.toBuilder();
                        }
                        this.select_ = (Projection)codedInputStream.readMessage(Projection.parser(), extensionRegistryLite);
                        if (builder == null) continue;
                        builder.mergeFrom((GeneratedMessageLite)this.select_);
                        this.select_ = (Projection)builder.buildPartial();
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
                StructuredQuery structuredQuery = (StructuredQuery)((Object)object2);
                this.select_ = (Projection)visitor.visitMessage((MessageLite)this.select_, (MessageLite)structuredQuery.select_);
                this.from_ = visitor.visitList(this.from_, structuredQuery.from_);
                this.where_ = (Filter)visitor.visitMessage((MessageLite)this.where_, (MessageLite)structuredQuery.where_);
                this.orderBy_ = visitor.visitList(this.orderBy_, structuredQuery.orderBy_);
                this.startAt_ = (Cursor)visitor.visitMessage((MessageLite)this.startAt_, (MessageLite)structuredQuery.startAt_);
                this.endAt_ = (Cursor)visitor.visitMessage((MessageLite)this.endAt_, (MessageLite)structuredQuery.endAt_);
                int n = this.offset_;
                boolean bl = true;
                boolean bl2 = n != 0;
                int n2 = this.offset_;
                if (structuredQuery.offset_ == 0) {
                    bl = false;
                }
                this.offset_ = visitor.visitInt(bl2, n2, bl, structuredQuery.offset_);
                this.limit_ = (Int32Value)visitor.visitMessage((MessageLite)this.limit_, (MessageLite)structuredQuery.limit_);
                if (visitor != GeneratedMessageLite.MergeFromVisitor.INSTANCE) return this;
                this.bitField0_ |= structuredQuery.bitField0_;
                return this;
            }
            case 4: {
                return new Builder();
            }
            case 3: {
                this.from_.makeImmutable();
                this.orderBy_.makeImmutable();
                return null;
            }
            case 2: {
                return DEFAULT_INSTANCE;
            }
            case 1: 
        }
        return new StructuredQuery();
    }

    public Cursor getEndAt() {
        Cursor cursor = this.endAt_;
        if (cursor == null) {
            cursor = Cursor.getDefaultInstance();
        }
        return cursor;
    }

    public CollectionSelector getFrom(int n) {
        return (CollectionSelector)((Object)this.from_.get(n));
    }

    public int getFromCount() {
        return this.from_.size();
    }

    public List<CollectionSelector> getFromList() {
        return this.from_;
    }

    public CollectionSelectorOrBuilder getFromOrBuilder(int n) {
        return this.from_.get(n);
    }

    public List<? extends CollectionSelectorOrBuilder> getFromOrBuilderList() {
        return this.from_;
    }

    public Int32Value getLimit() {
        Int32Value int32Value = this.limit_;
        if (int32Value == null) {
            int32Value = Int32Value.getDefaultInstance();
        }
        return int32Value;
    }

    public int getOffset() {
        return this.offset_;
    }

    public Order getOrderBy(int n) {
        return (Order)((Object)this.orderBy_.get(n));
    }

    public int getOrderByCount() {
        return this.orderBy_.size();
    }

    public List<Order> getOrderByList() {
        return this.orderBy_;
    }

    public OrderOrBuilder getOrderByOrBuilder(int n) {
        return this.orderBy_.get(n);
    }

    public List<? extends OrderOrBuilder> getOrderByOrBuilderList() {
        return this.orderBy_;
    }

    public Projection getSelect() {
        Projection projection = this.select_;
        if (projection == null) {
            projection = Projection.getDefaultInstance();
        }
        return projection;
    }

    public int getSerializedSize() {
        int n;
        int n2 = this.memoizedSerializedSize;
        if (n2 != -1) {
            return n2;
        }
        Projection projection = this.select_;
        int n3 = 0;
        if (projection != null) {
            n3 = 0 + CodedOutputStream.computeMessageSize((int)1, (MessageLite)this.getSelect());
        }
        for (int i = 0; i < this.from_.size(); ++i) {
            n3 += CodedOutputStream.computeMessageSize((int)2, (MessageLite)((MessageLite)this.from_.get(i)));
        }
        if (this.where_ != null) {
            n3 += CodedOutputStream.computeMessageSize((int)3, (MessageLite)this.getWhere());
        }
        for (int i = 0; i < this.orderBy_.size(); ++i) {
            n3 += CodedOutputStream.computeMessageSize((int)4, (MessageLite)((MessageLite)this.orderBy_.get(i)));
        }
        if (this.limit_ != null) {
            n3 += CodedOutputStream.computeMessageSize((int)5, (MessageLite)this.getLimit());
        }
        if ((n = this.offset_) != 0) {
            n3 += CodedOutputStream.computeInt32Size((int)6, (int)n);
        }
        if (this.startAt_ != null) {
            n3 += CodedOutputStream.computeMessageSize((int)7, (MessageLite)this.getStartAt());
        }
        if (this.endAt_ != null) {
            n3 += CodedOutputStream.computeMessageSize((int)8, (MessageLite)this.getEndAt());
        }
        this.memoizedSerializedSize = n3;
        return n3;
    }

    public Cursor getStartAt() {
        Cursor cursor = this.startAt_;
        if (cursor == null) {
            cursor = Cursor.getDefaultInstance();
        }
        return cursor;
    }

    public Filter getWhere() {
        Filter filter = this.where_;
        if (filter == null) {
            filter = Filter.getDefaultInstance();
        }
        return filter;
    }

    public boolean hasEndAt() {
        return this.endAt_ != null;
    }

    public boolean hasLimit() {
        return this.limit_ != null;
    }

    public boolean hasSelect() {
        return this.select_ != null;
    }

    public boolean hasStartAt() {
        return this.startAt_ != null;
    }

    public boolean hasWhere() {
        return this.where_ != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        int n;
        if (this.select_ != null) {
            codedOutputStream.writeMessage(1, (MessageLite)this.getSelect());
        }
        for (int i = 0; i < this.from_.size(); ++i) {
            codedOutputStream.writeMessage(2, (MessageLite)this.from_.get(i));
        }
        if (this.where_ != null) {
            codedOutputStream.writeMessage(3, (MessageLite)this.getWhere());
        }
        for (int i = 0; i < this.orderBy_.size(); ++i) {
            codedOutputStream.writeMessage(4, (MessageLite)this.orderBy_.get(i));
        }
        if (this.limit_ != null) {
            codedOutputStream.writeMessage(5, (MessageLite)this.getLimit());
        }
        if ((n = this.offset_) != 0) {
            codedOutputStream.writeInt32(6, n);
        }
        if (this.startAt_ != null) {
            codedOutputStream.writeMessage(7, (MessageLite)this.getStartAt());
        }
        if (this.endAt_ != null) {
            codedOutputStream.writeMessage(8, (MessageLite)this.getEndAt());
        }
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<StructuredQuery, Builder>
    implements StructuredQueryOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder addAllFrom(Iterable<? extends CollectionSelector> iterable) {
            this.copyOnWrite();
            ((StructuredQuery)this.instance).addAllFrom((Iterable<? extends CollectionSelector>)iterable);
            return this;
        }

        public Builder addAllOrderBy(Iterable<? extends Order> iterable) {
            this.copyOnWrite();
            ((StructuredQuery)this.instance).addAllOrderBy((Iterable<? extends Order>)iterable);
            return this;
        }

        public Builder addFrom(int n, CollectionSelector.Builder builder) {
            this.copyOnWrite();
            ((StructuredQuery)this.instance).addFrom(n, builder);
            return this;
        }

        public Builder addFrom(int n, CollectionSelector collectionSelector) {
            this.copyOnWrite();
            ((StructuredQuery)this.instance).addFrom(n, collectionSelector);
            return this;
        }

        public Builder addFrom(CollectionSelector.Builder builder) {
            this.copyOnWrite();
            ((StructuredQuery)this.instance).addFrom(builder);
            return this;
        }

        public Builder addFrom(CollectionSelector collectionSelector) {
            this.copyOnWrite();
            ((StructuredQuery)this.instance).addFrom(collectionSelector);
            return this;
        }

        public Builder addOrderBy(int n, Order.Builder builder) {
            this.copyOnWrite();
            ((StructuredQuery)this.instance).addOrderBy(n, builder);
            return this;
        }

        public Builder addOrderBy(int n, Order order) {
            this.copyOnWrite();
            ((StructuredQuery)this.instance).addOrderBy(n, order);
            return this;
        }

        public Builder addOrderBy(Order.Builder builder) {
            this.copyOnWrite();
            ((StructuredQuery)this.instance).addOrderBy(builder);
            return this;
        }

        public Builder addOrderBy(Order order) {
            this.copyOnWrite();
            ((StructuredQuery)this.instance).addOrderBy(order);
            return this;
        }

        public Builder clearEndAt() {
            this.copyOnWrite();
            ((StructuredQuery)this.instance).clearEndAt();
            return this;
        }

        public Builder clearFrom() {
            this.copyOnWrite();
            ((StructuredQuery)this.instance).clearFrom();
            return this;
        }

        public Builder clearLimit() {
            this.copyOnWrite();
            ((StructuredQuery)this.instance).clearLimit();
            return this;
        }

        public Builder clearOffset() {
            this.copyOnWrite();
            ((StructuredQuery)this.instance).clearOffset();
            return this;
        }

        public Builder clearOrderBy() {
            this.copyOnWrite();
            ((StructuredQuery)this.instance).clearOrderBy();
            return this;
        }

        public Builder clearSelect() {
            this.copyOnWrite();
            ((StructuredQuery)this.instance).clearSelect();
            return this;
        }

        public Builder clearStartAt() {
            this.copyOnWrite();
            ((StructuredQuery)this.instance).clearStartAt();
            return this;
        }

        public Builder clearWhere() {
            this.copyOnWrite();
            ((StructuredQuery)this.instance).clearWhere();
            return this;
        }

        public Cursor getEndAt() {
            return ((StructuredQuery)this.instance).getEndAt();
        }

        public CollectionSelector getFrom(int n) {
            return ((StructuredQuery)this.instance).getFrom(n);
        }

        public int getFromCount() {
            return ((StructuredQuery)this.instance).getFromCount();
        }

        public List<CollectionSelector> getFromList() {
            return Collections.unmodifiableList(((StructuredQuery)this.instance).getFromList());
        }

        public Int32Value getLimit() {
            return ((StructuredQuery)this.instance).getLimit();
        }

        public int getOffset() {
            return ((StructuredQuery)this.instance).getOffset();
        }

        public Order getOrderBy(int n) {
            return ((StructuredQuery)this.instance).getOrderBy(n);
        }

        public int getOrderByCount() {
            return ((StructuredQuery)this.instance).getOrderByCount();
        }

        public List<Order> getOrderByList() {
            return Collections.unmodifiableList(((StructuredQuery)this.instance).getOrderByList());
        }

        public Projection getSelect() {
            return ((StructuredQuery)this.instance).getSelect();
        }

        public Cursor getStartAt() {
            return ((StructuredQuery)this.instance).getStartAt();
        }

        public Filter getWhere() {
            return ((StructuredQuery)this.instance).getWhere();
        }

        public boolean hasEndAt() {
            return ((StructuredQuery)this.instance).hasEndAt();
        }

        public boolean hasLimit() {
            return ((StructuredQuery)this.instance).hasLimit();
        }

        public boolean hasSelect() {
            return ((StructuredQuery)this.instance).hasSelect();
        }

        public boolean hasStartAt() {
            return ((StructuredQuery)this.instance).hasStartAt();
        }

        public boolean hasWhere() {
            return ((StructuredQuery)this.instance).hasWhere();
        }

        public Builder mergeEndAt(Cursor cursor) {
            this.copyOnWrite();
            ((StructuredQuery)this.instance).mergeEndAt(cursor);
            return this;
        }

        public Builder mergeLimit(Int32Value int32Value) {
            this.copyOnWrite();
            ((StructuredQuery)this.instance).mergeLimit(int32Value);
            return this;
        }

        public Builder mergeSelect(Projection projection) {
            this.copyOnWrite();
            ((StructuredQuery)this.instance).mergeSelect(projection);
            return this;
        }

        public Builder mergeStartAt(Cursor cursor) {
            this.copyOnWrite();
            ((StructuredQuery)this.instance).mergeStartAt(cursor);
            return this;
        }

        public Builder mergeWhere(Filter filter) {
            this.copyOnWrite();
            ((StructuredQuery)this.instance).mergeWhere(filter);
            return this;
        }

        public Builder removeFrom(int n) {
            this.copyOnWrite();
            ((StructuredQuery)this.instance).removeFrom(n);
            return this;
        }

        public Builder removeOrderBy(int n) {
            this.copyOnWrite();
            ((StructuredQuery)this.instance).removeOrderBy(n);
            return this;
        }

        public Builder setEndAt(Cursor.Builder builder) {
            this.copyOnWrite();
            ((StructuredQuery)this.instance).setEndAt(builder);
            return this;
        }

        public Builder setEndAt(Cursor cursor) {
            this.copyOnWrite();
            ((StructuredQuery)this.instance).setEndAt(cursor);
            return this;
        }

        public Builder setFrom(int n, CollectionSelector.Builder builder) {
            this.copyOnWrite();
            ((StructuredQuery)this.instance).setFrom(n, builder);
            return this;
        }

        public Builder setFrom(int n, CollectionSelector collectionSelector) {
            this.copyOnWrite();
            ((StructuredQuery)this.instance).setFrom(n, collectionSelector);
            return this;
        }

        public Builder setLimit(Int32Value.Builder builder) {
            this.copyOnWrite();
            ((StructuredQuery)this.instance).setLimit(builder);
            return this;
        }

        public Builder setLimit(Int32Value int32Value) {
            this.copyOnWrite();
            ((StructuredQuery)this.instance).setLimit(int32Value);
            return this;
        }

        public Builder setOffset(int n) {
            this.copyOnWrite();
            ((StructuredQuery)this.instance).setOffset(n);
            return this;
        }

        public Builder setOrderBy(int n, Order.Builder builder) {
            this.copyOnWrite();
            ((StructuredQuery)this.instance).setOrderBy(n, builder);
            return this;
        }

        public Builder setOrderBy(int n, Order order) {
            this.copyOnWrite();
            ((StructuredQuery)this.instance).setOrderBy(n, order);
            return this;
        }

        public Builder setSelect(Projection.Builder builder) {
            this.copyOnWrite();
            ((StructuredQuery)this.instance).setSelect(builder);
            return this;
        }

        public Builder setSelect(Projection projection) {
            this.copyOnWrite();
            ((StructuredQuery)this.instance).setSelect(projection);
            return this;
        }

        public Builder setStartAt(Cursor.Builder builder) {
            this.copyOnWrite();
            ((StructuredQuery)this.instance).setStartAt(builder);
            return this;
        }

        public Builder setStartAt(Cursor cursor) {
            this.copyOnWrite();
            ((StructuredQuery)this.instance).setStartAt(cursor);
            return this;
        }

        public Builder setWhere(Filter.Builder builder) {
            this.copyOnWrite();
            ((StructuredQuery)this.instance).setWhere(builder);
            return this;
        }

        public Builder setWhere(Filter filter) {
            this.copyOnWrite();
            ((StructuredQuery)this.instance).setWhere(filter);
            return this;
        }
    }

    public static final class CollectionSelector
    extends GeneratedMessageLite<CollectionSelector, Builder>
    implements CollectionSelectorOrBuilder {
        public static final int ALL_DESCENDANTS_FIELD_NUMBER = 3;
        public static final int COLLECTION_ID_FIELD_NUMBER = 2;
        private static final CollectionSelector DEFAULT_INSTANCE = new CollectionSelector();
        private static volatile Parser<CollectionSelector> PARSER;
        private boolean allDescendants_;
        private String collectionId_ = "";

        static {
            DEFAULT_INSTANCE.makeImmutable();
        }

        private CollectionSelector() {
        }

        private void clearAllDescendants() {
            this.allDescendants_ = false;
        }

        private void clearCollectionId() {
            this.collectionId_ = CollectionSelector.getDefaultInstance().getCollectionId();
        }

        public static CollectionSelector getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(CollectionSelector collectionSelector) {
            return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)collectionSelector);
        }

        public static CollectionSelector parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CollectionSelector)CollectionSelector.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static CollectionSelector parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CollectionSelector)CollectionSelector.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static CollectionSelector parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (CollectionSelector)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
        }

        public static CollectionSelector parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CollectionSelector)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static CollectionSelector parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (CollectionSelector)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
        }

        public static CollectionSelector parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CollectionSelector)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static CollectionSelector parseFrom(InputStream inputStream) throws IOException {
            return (CollectionSelector)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static CollectionSelector parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CollectionSelector)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static CollectionSelector parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
            return (CollectionSelector)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
        }

        public static CollectionSelector parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CollectionSelector)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Parser<CollectionSelector> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setAllDescendants(boolean bl) {
            this.allDescendants_ = bl;
        }

        private void setCollectionId(String string) {
            if (string != null) {
                this.collectionId_ = string;
                return;
            }
            throw new NullPointerException();
        }

        private void setCollectionIdBytes(ByteString byteString) {
            if (byteString != null) {
                CollectionSelector.checkByteStringIsUtf8((ByteString)byteString);
                this.collectionId_ = byteString.toStringUtf8();
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
                    Class<CollectionSelector> class_ = CollectionSelector.class;
                    // MONITORENTER : com.google.firestore.v1.StructuredQuery$CollectionSelector.class
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
                                if (n != 24) {
                                    if (codedInputStream.skipField(n)) continue;
                                    bl = true;
                                    continue;
                                }
                                this.allDescendants_ = codedInputStream.readBool();
                                continue;
                            }
                            this.collectionId_ = codedInputStream.readStringRequireUtf8();
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
                    CollectionSelector collectionSelector = (CollectionSelector)((Object)object2);
                    this.collectionId_ = visitor.visitString(true ^ this.collectionId_.isEmpty(), this.collectionId_, true ^ collectionSelector.collectionId_.isEmpty(), collectionSelector.collectionId_);
                    boolean bl = this.allDescendants_;
                    boolean bl2 = collectionSelector.allDescendants_;
                    this.allDescendants_ = visitor.visitBoolean(bl, bl, bl2, bl2);
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
            return new CollectionSelector();
        }

        public boolean getAllDescendants() {
            return this.allDescendants_;
        }

        public String getCollectionId() {
            return this.collectionId_;
        }

        public ByteString getCollectionIdBytes() {
            return ByteString.copyFromUtf8((String)this.collectionId_);
        }

        public int getSerializedSize() {
            boolean bl;
            int n = this.memoizedSerializedSize;
            if (n != -1) {
                return n;
            }
            boolean bl2 = this.collectionId_.isEmpty();
            int n2 = 0;
            if (!bl2) {
                n2 = 0 + CodedOutputStream.computeStringSize((int)2, (String)this.getCollectionId());
            }
            if (bl = this.allDescendants_) {
                n2 += CodedOutputStream.computeBoolSize((int)3, (boolean)bl);
            }
            this.memoizedSerializedSize = n2;
            return n2;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            boolean bl;
            if (!this.collectionId_.isEmpty()) {
                codedOutputStream.writeString(2, this.getCollectionId());
            }
            if (bl = this.allDescendants_) {
                codedOutputStream.writeBool(3, bl);
            }
        }

        public static final class Builder
        extends GeneratedMessageLite.Builder<CollectionSelector, Builder>
        implements CollectionSelectorOrBuilder {
            private Builder() {
                super((GeneratedMessageLite)DEFAULT_INSTANCE);
            }

            public Builder clearAllDescendants() {
                this.copyOnWrite();
                ((CollectionSelector)this.instance).clearAllDescendants();
                return this;
            }

            public Builder clearCollectionId() {
                this.copyOnWrite();
                ((CollectionSelector)this.instance).clearCollectionId();
                return this;
            }

            public boolean getAllDescendants() {
                return ((CollectionSelector)this.instance).getAllDescendants();
            }

            public String getCollectionId() {
                return ((CollectionSelector)this.instance).getCollectionId();
            }

            public ByteString getCollectionIdBytes() {
                return ((CollectionSelector)this.instance).getCollectionIdBytes();
            }

            public Builder setAllDescendants(boolean bl) {
                this.copyOnWrite();
                ((CollectionSelector)this.instance).setAllDescendants(bl);
                return this;
            }

            public Builder setCollectionId(String string) {
                this.copyOnWrite();
                ((CollectionSelector)this.instance).setCollectionId(string);
                return this;
            }

            public Builder setCollectionIdBytes(ByteString byteString) {
                this.copyOnWrite();
                ((CollectionSelector)this.instance).setCollectionIdBytes(byteString);
                return this;
            }
        }

    }

    /*
     * Exception performing whole class analysis ignored.
     */
    public static final class CompositeFilter
    extends GeneratedMessageLite<CompositeFilter, Builder>
    implements CompositeFilterOrBuilder {
        private static final CompositeFilter DEFAULT_INSTANCE = new CompositeFilter();
        public static final int FILTERS_FIELD_NUMBER = 2;
        public static final int OP_FIELD_NUMBER = 1;
        private static volatile Parser<CompositeFilter> PARSER;
        private int bitField0_;
        private Internal.ProtobufList<Filter> filters_ = CompositeFilter.emptyProtobufList();
        private int op_;

        static {
            DEFAULT_INSTANCE.makeImmutable();
        }

        private CompositeFilter() {
        }

        private void addAllFilters(Iterable<? extends Filter> iterable) {
            this.ensureFiltersIsMutable();
            AbstractMessageLite.addAll(iterable, this.filters_);
        }

        private void addFilters(int n, Filter.Builder builder) {
            this.ensureFiltersIsMutable();
            this.filters_.add(n, (Object)((Filter)builder.build()));
        }

        private void addFilters(int n, Filter filter) {
            if (filter != null) {
                this.ensureFiltersIsMutable();
                this.filters_.add(n, (Object)filter);
                return;
            }
            throw new NullPointerException();
        }

        private void addFilters(Filter.Builder builder) {
            this.ensureFiltersIsMutable();
            this.filters_.add((Object)((Filter)builder.build()));
        }

        private void addFilters(Filter filter) {
            if (filter != null) {
                this.ensureFiltersIsMutable();
                this.filters_.add((Object)filter);
                return;
            }
            throw new NullPointerException();
        }

        private void clearFilters() {
            this.filters_ = CompositeFilter.emptyProtobufList();
        }

        private void clearOp() {
            this.op_ = 0;
        }

        private void ensureFiltersIsMutable() {
            if (!this.filters_.isModifiable()) {
                this.filters_ = GeneratedMessageLite.mutableCopy(this.filters_);
            }
        }

        public static CompositeFilter getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(CompositeFilter compositeFilter) {
            return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)compositeFilter);
        }

        public static CompositeFilter parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (CompositeFilter)CompositeFilter.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static CompositeFilter parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CompositeFilter)CompositeFilter.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static CompositeFilter parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (CompositeFilter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
        }

        public static CompositeFilter parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CompositeFilter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static CompositeFilter parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (CompositeFilter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
        }

        public static CompositeFilter parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CompositeFilter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static CompositeFilter parseFrom(InputStream inputStream) throws IOException {
            return (CompositeFilter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static CompositeFilter parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (CompositeFilter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static CompositeFilter parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
            return (CompositeFilter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
        }

        public static CompositeFilter parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (CompositeFilter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Parser<CompositeFilter> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void removeFilters(int n) {
            this.ensureFiltersIsMutable();
            this.filters_.remove(n);
        }

        private void setFilters(int n, Filter.Builder builder) {
            this.ensureFiltersIsMutable();
            this.filters_.set(n, (Object)((Filter)builder.build()));
        }

        private void setFilters(int n, Filter filter) {
            if (filter != null) {
                this.ensureFiltersIsMutable();
                this.filters_.set(n, (Object)filter);
                return;
            }
            throw new NullPointerException();
        }

        private void setOp(Operator operator) {
            if (operator != null) {
                this.op_ = operator.getNumber();
                return;
            }
            throw new NullPointerException();
        }

        private void setOpValue(int n) {
            this.op_ = n;
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
                    Class<CompositeFilter> class_ = CompositeFilter.class;
                    // MONITORENTER : com.google.firestore.v1.StructuredQuery$CompositeFilter.class
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
                            if (n != 8) {
                                if (n != 18) {
                                    if (codedInputStream.skipField(n)) continue;
                                    bl = true;
                                    continue;
                                }
                                if (!this.filters_.isModifiable()) {
                                    this.filters_ = GeneratedMessageLite.mutableCopy(this.filters_);
                                }
                                this.filters_.add((Object)((Filter)codedInputStream.readMessage(Filter.parser(), extensionRegistryLite)));
                                continue;
                            }
                            this.op_ = codedInputStream.readEnum();
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
                    CompositeFilter compositeFilter = (CompositeFilter)((Object)object2);
                    int n = this.op_;
                    boolean bl = true;
                    boolean bl2 = n != 0;
                    int n2 = this.op_;
                    if (compositeFilter.op_ == 0) {
                        bl = false;
                    }
                    this.op_ = visitor.visitInt(bl2, n2, bl, compositeFilter.op_);
                    this.filters_ = visitor.visitList(this.filters_, compositeFilter.filters_);
                    if (visitor != GeneratedMessageLite.MergeFromVisitor.INSTANCE) return this;
                    this.bitField0_ |= compositeFilter.bitField0_;
                    return this;
                }
                case 4: {
                    return new Builder();
                }
                case 3: {
                    this.filters_.makeImmutable();
                    return null;
                }
                case 2: {
                    return DEFAULT_INSTANCE;
                }
                case 1: 
            }
            return new CompositeFilter();
        }

        public Filter getFilters(int n) {
            return (Filter)((Object)this.filters_.get(n));
        }

        public int getFiltersCount() {
            return this.filters_.size();
        }

        public List<Filter> getFiltersList() {
            return this.filters_;
        }

        public FilterOrBuilder getFiltersOrBuilder(int n) {
            return this.filters_.get(n);
        }

        public List<? extends FilterOrBuilder> getFiltersOrBuilderList() {
            return this.filters_;
        }

        public Operator getOp() {
            Operator operator = Operator.forNumber((int)this.op_);
            if (operator == null) {
                return Operator.UNRECOGNIZED;
            }
            return operator;
        }

        public int getOpValue() {
            return this.op_;
        }

        public int getSerializedSize() {
            int n = this.memoizedSerializedSize;
            if (n != -1) {
                return n;
            }
            int n2 = this.op_;
            int n3 = Operator.OPERATOR_UNSPECIFIED.getNumber();
            int n4 = 0;
            if (n2 != n3) {
                n4 = 0 + CodedOutputStream.computeEnumSize((int)1, (int)this.op_);
            }
            for (int i = 0; i < this.filters_.size(); ++i) {
                n4 += CodedOutputStream.computeMessageSize((int)2, (MessageLite)((MessageLite)this.filters_.get(i)));
            }
            this.memoizedSerializedSize = n4;
            return n4;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.op_ != Operator.OPERATOR_UNSPECIFIED.getNumber()) {
                codedOutputStream.writeEnum(1, this.op_);
            }
            for (int i = 0; i < this.filters_.size(); ++i) {
                codedOutputStream.writeMessage(2, (MessageLite)this.filters_.get(i));
            }
        }

        public static final class Builder
        extends GeneratedMessageLite.Builder<CompositeFilter, Builder>
        implements CompositeFilterOrBuilder {
            private Builder() {
                super((GeneratedMessageLite)DEFAULT_INSTANCE);
            }

            public Builder addAllFilters(Iterable<? extends Filter> iterable) {
                this.copyOnWrite();
                ((CompositeFilter)this.instance).addAllFilters((Iterable<? extends Filter>)iterable);
                return this;
            }

            public Builder addFilters(int n, Filter.Builder builder) {
                this.copyOnWrite();
                ((CompositeFilter)this.instance).addFilters(n, builder);
                return this;
            }

            public Builder addFilters(int n, Filter filter) {
                this.copyOnWrite();
                ((CompositeFilter)this.instance).addFilters(n, filter);
                return this;
            }

            public Builder addFilters(Filter.Builder builder) {
                this.copyOnWrite();
                ((CompositeFilter)this.instance).addFilters(builder);
                return this;
            }

            public Builder addFilters(Filter filter) {
                this.copyOnWrite();
                ((CompositeFilter)this.instance).addFilters(filter);
                return this;
            }

            public Builder clearFilters() {
                this.copyOnWrite();
                ((CompositeFilter)this.instance).clearFilters();
                return this;
            }

            public Builder clearOp() {
                this.copyOnWrite();
                ((CompositeFilter)this.instance).clearOp();
                return this;
            }

            public Filter getFilters(int n) {
                return ((CompositeFilter)this.instance).getFilters(n);
            }

            public int getFiltersCount() {
                return ((CompositeFilter)this.instance).getFiltersCount();
            }

            public List<Filter> getFiltersList() {
                return Collections.unmodifiableList(((CompositeFilter)this.instance).getFiltersList());
            }

            public Operator getOp() {
                return ((CompositeFilter)this.instance).getOp();
            }

            public int getOpValue() {
                return ((CompositeFilter)this.instance).getOpValue();
            }

            public Builder removeFilters(int n) {
                this.copyOnWrite();
                ((CompositeFilter)this.instance).removeFilters(n);
                return this;
            }

            public Builder setFilters(int n, Filter.Builder builder) {
                this.copyOnWrite();
                ((CompositeFilter)this.instance).setFilters(n, builder);
                return this;
            }

            public Builder setFilters(int n, Filter filter) {
                this.copyOnWrite();
                ((CompositeFilter)this.instance).setFilters(n, filter);
                return this;
            }

            public Builder setOp(Operator operator) {
                this.copyOnWrite();
                ((CompositeFilter)this.instance).setOp(operator);
                return this;
            }

            public Builder setOpValue(int n) {
                this.copyOnWrite();
                ((CompositeFilter)this.instance).setOpValue(n);
                return this;
            }
        }

    }

    /*
     * Exception performing whole class analysis ignored.
     */
    public static final class FieldFilter
    extends GeneratedMessageLite<FieldFilter, Builder>
    implements FieldFilterOrBuilder {
        private static final FieldFilter DEFAULT_INSTANCE = new FieldFilter();
        public static final int FIELD_FIELD_NUMBER = 1;
        public static final int OP_FIELD_NUMBER = 2;
        private static volatile Parser<FieldFilter> PARSER;
        public static final int VALUE_FIELD_NUMBER = 3;
        private FieldReference field_;
        private int op_;
        private Value value_;

        static {
            DEFAULT_INSTANCE.makeImmutable();
        }

        private FieldFilter() {
        }

        private void clearField() {
            this.field_ = null;
        }

        private void clearOp() {
            this.op_ = 0;
        }

        private void clearValue() {
            this.value_ = null;
        }

        public static FieldFilter getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeField(FieldReference fieldReference) {
            FieldReference fieldReference2 = this.field_;
            if (fieldReference2 != null && fieldReference2 != FieldReference.getDefaultInstance()) {
                this.field_ = (FieldReference)((FieldReference.Builder)FieldReference.newBuilder(this.field_).mergeFrom((GeneratedMessageLite)fieldReference)).buildPartial();
                return;
            }
            this.field_ = fieldReference;
        }

        private void mergeValue(Value value) {
            Value value2 = this.value_;
            if (value2 != null && value2 != Value.getDefaultInstance()) {
                this.value_ = (Value)((Value.Builder)Value.newBuilder(this.value_).mergeFrom((GeneratedMessageLite)value)).buildPartial();
                return;
            }
            this.value_ = value;
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(FieldFilter fieldFilter) {
            return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)fieldFilter);
        }

        public static FieldFilter parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (FieldFilter)FieldFilter.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static FieldFilter parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (FieldFilter)FieldFilter.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static FieldFilter parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (FieldFilter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
        }

        public static FieldFilter parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (FieldFilter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static FieldFilter parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (FieldFilter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
        }

        public static FieldFilter parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (FieldFilter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static FieldFilter parseFrom(InputStream inputStream) throws IOException {
            return (FieldFilter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static FieldFilter parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (FieldFilter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static FieldFilter parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
            return (FieldFilter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
        }

        public static FieldFilter parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (FieldFilter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Parser<FieldFilter> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setField(FieldReference.Builder builder) {
            this.field_ = (FieldReference)builder.build();
        }

        private void setField(FieldReference fieldReference) {
            if (fieldReference != null) {
                this.field_ = fieldReference;
                return;
            }
            throw new NullPointerException();
        }

        private void setOp(Operator operator) {
            if (operator != null) {
                this.op_ = operator.getNumber();
                return;
            }
            throw new NullPointerException();
        }

        private void setOpValue(int n) {
            this.op_ = n;
        }

        private void setValue(Value.Builder builder) {
            this.value_ = (Value)builder.build();
        }

        private void setValue(Value value) {
            if (value != null) {
                this.value_ = value;
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
                    Class<FieldFilter> class_ = FieldFilter.class;
                    // MONITORENTER : com.google.firestore.v1.StructuredQuery$FieldFilter.class
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
                                if (n != 16) {
                                    if (n != 26) {
                                        if (codedInputStream.skipField(n)) continue;
                                        bl = true;
                                        continue;
                                    }
                                    Value value = this.value_;
                                    Value.Builder builder = null;
                                    if (value != null) {
                                        builder = (Value.Builder)this.value_.toBuilder();
                                    }
                                    this.value_ = (Value)codedInputStream.readMessage(Value.parser(), extensionRegistryLite);
                                    if (builder == null) continue;
                                    builder.mergeFrom((GeneratedMessageLite)this.value_);
                                    this.value_ = (Value)builder.buildPartial();
                                    continue;
                                }
                                this.op_ = codedInputStream.readEnum();
                                continue;
                            }
                            FieldReference fieldReference = this.field_;
                            FieldReference.Builder builder = null;
                            if (fieldReference != null) {
                                builder = (FieldReference.Builder)this.field_.toBuilder();
                            }
                            this.field_ = (FieldReference)codedInputStream.readMessage(FieldReference.parser(), extensionRegistryLite);
                            if (builder == null) continue;
                            builder.mergeFrom((GeneratedMessageLite)this.field_);
                            this.field_ = (FieldReference)builder.buildPartial();
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
                    FieldFilter fieldFilter = (FieldFilter)((Object)object2);
                    this.field_ = (FieldReference)visitor.visitMessage((MessageLite)this.field_, (MessageLite)fieldFilter.field_);
                    int n = this.op_;
                    boolean bl = true;
                    boolean bl2 = n != 0;
                    int n2 = this.op_;
                    if (fieldFilter.op_ == 0) {
                        bl = false;
                    }
                    this.op_ = visitor.visitInt(bl2, n2, bl, fieldFilter.op_);
                    this.value_ = (Value)visitor.visitMessage((MessageLite)this.value_, (MessageLite)fieldFilter.value_);
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
            return new FieldFilter();
        }

        public FieldReference getField() {
            FieldReference fieldReference = this.field_;
            if (fieldReference == null) {
                fieldReference = FieldReference.getDefaultInstance();
            }
            return fieldReference;
        }

        public Operator getOp() {
            Operator operator = Operator.forNumber((int)this.op_);
            if (operator == null) {
                return Operator.UNRECOGNIZED;
            }
            return operator;
        }

        public int getOpValue() {
            return this.op_;
        }

        public int getSerializedSize() {
            int n = this.memoizedSerializedSize;
            if (n != -1) {
                return n;
            }
            FieldReference fieldReference = this.field_;
            int n2 = 0;
            if (fieldReference != null) {
                n2 = 0 + CodedOutputStream.computeMessageSize((int)1, (MessageLite)this.getField());
            }
            if (this.op_ != Operator.OPERATOR_UNSPECIFIED.getNumber()) {
                n2 += CodedOutputStream.computeEnumSize((int)2, (int)this.op_);
            }
            if (this.value_ != null) {
                n2 += CodedOutputStream.computeMessageSize((int)3, (MessageLite)this.getValue());
            }
            this.memoizedSerializedSize = n2;
            return n2;
        }

        public Value getValue() {
            Value value = this.value_;
            if (value == null) {
                value = Value.getDefaultInstance();
            }
            return value;
        }

        public boolean hasField() {
            return this.field_ != null;
        }

        public boolean hasValue() {
            return this.value_ != null;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.field_ != null) {
                codedOutputStream.writeMessage(1, (MessageLite)this.getField());
            }
            if (this.op_ != Operator.OPERATOR_UNSPECIFIED.getNumber()) {
                codedOutputStream.writeEnum(2, this.op_);
            }
            if (this.value_ != null) {
                codedOutputStream.writeMessage(3, (MessageLite)this.getValue());
            }
        }

        public static final class Builder
        extends GeneratedMessageLite.Builder<FieldFilter, Builder>
        implements FieldFilterOrBuilder {
            private Builder() {
                super((GeneratedMessageLite)DEFAULT_INSTANCE);
            }

            public Builder clearField() {
                this.copyOnWrite();
                ((FieldFilter)this.instance).clearField();
                return this;
            }

            public Builder clearOp() {
                this.copyOnWrite();
                ((FieldFilter)this.instance).clearOp();
                return this;
            }

            public Builder clearValue() {
                this.copyOnWrite();
                ((FieldFilter)this.instance).clearValue();
                return this;
            }

            public FieldReference getField() {
                return ((FieldFilter)this.instance).getField();
            }

            public Operator getOp() {
                return ((FieldFilter)this.instance).getOp();
            }

            public int getOpValue() {
                return ((FieldFilter)this.instance).getOpValue();
            }

            public Value getValue() {
                return ((FieldFilter)this.instance).getValue();
            }

            public boolean hasField() {
                return ((FieldFilter)this.instance).hasField();
            }

            public boolean hasValue() {
                return ((FieldFilter)this.instance).hasValue();
            }

            public Builder mergeField(FieldReference fieldReference) {
                this.copyOnWrite();
                ((FieldFilter)this.instance).mergeField(fieldReference);
                return this;
            }

            public Builder mergeValue(Value value) {
                this.copyOnWrite();
                ((FieldFilter)this.instance).mergeValue(value);
                return this;
            }

            public Builder setField(FieldReference.Builder builder) {
                this.copyOnWrite();
                ((FieldFilter)this.instance).setField(builder);
                return this;
            }

            public Builder setField(FieldReference fieldReference) {
                this.copyOnWrite();
                ((FieldFilter)this.instance).setField(fieldReference);
                return this;
            }

            public Builder setOp(Operator operator) {
                this.copyOnWrite();
                ((FieldFilter)this.instance).setOp(operator);
                return this;
            }

            public Builder setOpValue(int n) {
                this.copyOnWrite();
                ((FieldFilter)this.instance).setOpValue(n);
                return this;
            }

            public Builder setValue(Value.Builder builder) {
                this.copyOnWrite();
                ((FieldFilter)this.instance).setValue(builder);
                return this;
            }

            public Builder setValue(Value value) {
                this.copyOnWrite();
                ((FieldFilter)this.instance).setValue(value);
                return this;
            }
        }

    }

    public static final class FieldReference
    extends GeneratedMessageLite<FieldReference, Builder>
    implements FieldReferenceOrBuilder {
        private static final FieldReference DEFAULT_INSTANCE = new FieldReference();
        public static final int FIELD_PATH_FIELD_NUMBER = 2;
        private static volatile Parser<FieldReference> PARSER;
        private String fieldPath_ = "";

        static {
            DEFAULT_INSTANCE.makeImmutable();
        }

        private FieldReference() {
        }

        private void clearFieldPath() {
            this.fieldPath_ = FieldReference.getDefaultInstance().getFieldPath();
        }

        public static FieldReference getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(FieldReference fieldReference) {
            return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)fieldReference);
        }

        public static FieldReference parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (FieldReference)FieldReference.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static FieldReference parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (FieldReference)FieldReference.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static FieldReference parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (FieldReference)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
        }

        public static FieldReference parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (FieldReference)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static FieldReference parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (FieldReference)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
        }

        public static FieldReference parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (FieldReference)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static FieldReference parseFrom(InputStream inputStream) throws IOException {
            return (FieldReference)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static FieldReference parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (FieldReference)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static FieldReference parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
            return (FieldReference)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
        }

        public static FieldReference parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (FieldReference)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Parser<FieldReference> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setFieldPath(String string) {
            if (string != null) {
                this.fieldPath_ = string;
                return;
            }
            throw new NullPointerException();
        }

        private void setFieldPathBytes(ByteString byteString) {
            if (byteString != null) {
                FieldReference.checkByteStringIsUtf8((ByteString)byteString);
                this.fieldPath_ = byteString.toStringUtf8();
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
                    Class<FieldReference> class_ = FieldReference.class;
                    // MONITORENTER : com.google.firestore.v1.StructuredQuery$FieldReference.class
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
                            this.fieldPath_ = codedInputStream.readStringRequireUtf8();
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
                    FieldReference fieldReference = (FieldReference)((Object)object2);
                    this.fieldPath_ = visitor.visitString(true ^ this.fieldPath_.isEmpty(), this.fieldPath_, true ^ fieldReference.fieldPath_.isEmpty(), fieldReference.fieldPath_);
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
            return new FieldReference();
        }

        public String getFieldPath() {
            return this.fieldPath_;
        }

        public ByteString getFieldPathBytes() {
            return ByteString.copyFromUtf8((String)this.fieldPath_);
        }

        public int getSerializedSize() {
            int n = this.memoizedSerializedSize;
            if (n != -1) {
                return n;
            }
            boolean bl = this.fieldPath_.isEmpty();
            int n2 = 0;
            if (!bl) {
                n2 = 0 + CodedOutputStream.computeStringSize((int)2, (String)this.getFieldPath());
            }
            this.memoizedSerializedSize = n2;
            return n2;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!this.fieldPath_.isEmpty()) {
                codedOutputStream.writeString(2, this.getFieldPath());
            }
        }

        public static final class Builder
        extends GeneratedMessageLite.Builder<FieldReference, Builder>
        implements FieldReferenceOrBuilder {
            private Builder() {
                super((GeneratedMessageLite)DEFAULT_INSTANCE);
            }

            public Builder clearFieldPath() {
                this.copyOnWrite();
                ((FieldReference)this.instance).clearFieldPath();
                return this;
            }

            public String getFieldPath() {
                return ((FieldReference)this.instance).getFieldPath();
            }

            public ByteString getFieldPathBytes() {
                return ((FieldReference)this.instance).getFieldPathBytes();
            }

            public Builder setFieldPath(String string) {
                this.copyOnWrite();
                ((FieldReference)this.instance).setFieldPath(string);
                return this;
            }

            public Builder setFieldPathBytes(ByteString byteString) {
                this.copyOnWrite();
                ((FieldReference)this.instance).setFieldPathBytes(byteString);
                return this;
            }
        }

    }

    /*
     * Exception performing whole class analysis ignored.
     */
    public static final class Filter
    extends GeneratedMessageLite<Filter, Builder>
    implements FilterOrBuilder {
        public static final int COMPOSITE_FILTER_FIELD_NUMBER = 1;
        private static final Filter DEFAULT_INSTANCE = new Filter();
        public static final int FIELD_FILTER_FIELD_NUMBER = 2;
        private static volatile Parser<Filter> PARSER;
        public static final int UNARY_FILTER_FIELD_NUMBER = 3;
        private int filterTypeCase_ = 0;
        private Object filterType_;

        static {
            DEFAULT_INSTANCE.makeImmutable();
        }

        private Filter() {
        }

        private void clearCompositeFilter() {
            if (this.filterTypeCase_ == 1) {
                this.filterTypeCase_ = 0;
                this.filterType_ = null;
            }
        }

        private void clearFieldFilter() {
            if (this.filterTypeCase_ == 2) {
                this.filterTypeCase_ = 0;
                this.filterType_ = null;
            }
        }

        private void clearFilterType() {
            this.filterTypeCase_ = 0;
            this.filterType_ = null;
        }

        private void clearUnaryFilter() {
            if (this.filterTypeCase_ == 3) {
                this.filterTypeCase_ = 0;
                this.filterType_ = null;
            }
        }

        public static Filter getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeCompositeFilter(CompositeFilter compositeFilter) {
            this.filterType_ = this.filterTypeCase_ == 1 && this.filterType_ != CompositeFilter.getDefaultInstance() ? ((CompositeFilter.Builder)CompositeFilter.newBuilder((CompositeFilter)((Object)this.filterType_)).mergeFrom((GeneratedMessageLite)compositeFilter)).buildPartial() : compositeFilter;
            this.filterTypeCase_ = 1;
        }

        private void mergeFieldFilter(FieldFilter fieldFilter) {
            this.filterType_ = this.filterTypeCase_ == 2 && this.filterType_ != FieldFilter.getDefaultInstance() ? ((FieldFilter.Builder)FieldFilter.newBuilder((FieldFilter)((Object)this.filterType_)).mergeFrom((GeneratedMessageLite)fieldFilter)).buildPartial() : fieldFilter;
            this.filterTypeCase_ = 2;
        }

        private void mergeUnaryFilter(UnaryFilter unaryFilter) {
            this.filterType_ = this.filterTypeCase_ == 3 && this.filterType_ != UnaryFilter.getDefaultInstance() ? ((UnaryFilter.Builder)UnaryFilter.newBuilder((UnaryFilter)((Object)this.filterType_)).mergeFrom((GeneratedMessageLite)unaryFilter)).buildPartial() : unaryFilter;
            this.filterTypeCase_ = 3;
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(Filter filter) {
            return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)filter);
        }

        public static Filter parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Filter)Filter.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static Filter parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Filter)Filter.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Filter parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Filter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
        }

        public static Filter parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Filter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Filter parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Filter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
        }

        public static Filter parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Filter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Filter parseFrom(InputStream inputStream) throws IOException {
            return (Filter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static Filter parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Filter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Filter parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
            return (Filter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
        }

        public static Filter parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Filter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Parser<Filter> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setCompositeFilter(CompositeFilter.Builder builder) {
            this.filterType_ = builder.build();
            this.filterTypeCase_ = 1;
        }

        private void setCompositeFilter(CompositeFilter compositeFilter) {
            if (compositeFilter != null) {
                this.filterType_ = compositeFilter;
                this.filterTypeCase_ = 1;
                return;
            }
            throw new NullPointerException();
        }

        private void setFieldFilter(FieldFilter.Builder builder) {
            this.filterType_ = builder.build();
            this.filterTypeCase_ = 2;
        }

        private void setFieldFilter(FieldFilter fieldFilter) {
            if (fieldFilter != null) {
                this.filterType_ = fieldFilter;
                this.filterTypeCase_ = 2;
                return;
            }
            throw new NullPointerException();
        }

        private void setUnaryFilter(UnaryFilter.Builder builder) {
            this.filterType_ = builder.build();
            this.filterTypeCase_ = 3;
        }

        private void setUnaryFilter(UnaryFilter unaryFilter) {
            if (unaryFilter != null) {
                this.filterType_ = unaryFilter;
                this.filterTypeCase_ = 3;
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
                    Class<Filter> class_ = Filter.class;
                    // MONITORENTER : com.google.firestore.v1.StructuredQuery$Filter.class
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
                            if (n3 != 10) {
                                if (n3 != 18) {
                                    if (n3 != 26) {
                                        if (codedInputStream.skipField(n3)) continue;
                                        bl = true;
                                        continue;
                                    }
                                    int n4 = this.filterTypeCase_;
                                    UnaryFilter.Builder builder = null;
                                    if (n4 == 3) {
                                        builder = (UnaryFilter.Builder)((UnaryFilter)((Object)this.filterType_)).toBuilder();
                                    }
                                    this.filterType_ = codedInputStream.readMessage(UnaryFilter.parser(), extensionRegistryLite);
                                    if (builder != null) {
                                        builder.mergeFrom((GeneratedMessageLite)((UnaryFilter)((Object)this.filterType_)));
                                        this.filterType_ = builder.buildPartial();
                                    }
                                    this.filterTypeCase_ = 3;
                                    continue;
                                }
                                int n5 = this.filterTypeCase_;
                                FieldFilter.Builder builder = null;
                                if (n5 == 2) {
                                    builder = (FieldFilter.Builder)((FieldFilter)((Object)this.filterType_)).toBuilder();
                                }
                                this.filterType_ = codedInputStream.readMessage(FieldFilter.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom((GeneratedMessageLite)((FieldFilter)((Object)this.filterType_)));
                                    this.filterType_ = builder.buildPartial();
                                }
                                this.filterTypeCase_ = 2;
                                continue;
                            }
                            int n6 = this.filterTypeCase_;
                            CompositeFilter.Builder builder = null;
                            if (n6 == n2) {
                                builder = (CompositeFilter.Builder)((CompositeFilter)((Object)this.filterType_)).toBuilder();
                            }
                            this.filterType_ = codedInputStream.readMessage(CompositeFilter.parser(), extensionRegistryLite);
                            if (builder != null) {
                                builder.mergeFrom((GeneratedMessageLite)((CompositeFilter)((Object)this.filterType_)));
                                this.filterType_ = builder.buildPartial();
                            }
                            this.filterTypeCase_ = n2;
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
                    Filter filter = (Filter)((Object)object2);
                    int n7 = 1.$SwitchMap$com$google$firestore$v1$StructuredQuery$Filter$FilterTypeCase[filter.getFilterTypeCase().ordinal()];
                    if (n7 != n2) {
                        if (n7 != 2) {
                            if (n7 != 3) {
                                if (n7 == 4) {
                                    if (this.filterTypeCase_ == 0) {
                                        n2 = 0;
                                    }
                                    visitor.visitOneofNotSet((boolean)n2);
                                }
                            } else {
                                if (this.filterTypeCase_ != 3) {
                                    n2 = 0;
                                }
                                this.filterType_ = visitor.visitOneofMessage((boolean)n2, this.filterType_, filter.filterType_);
                            }
                        } else {
                            if (this.filterTypeCase_ != 2) {
                                n2 = 0;
                            }
                            this.filterType_ = visitor.visitOneofMessage((boolean)n2, this.filterType_, filter.filterType_);
                        }
                    } else {
                        if (this.filterTypeCase_ != n2) {
                            n2 = 0;
                        }
                        this.filterType_ = visitor.visitOneofMessage((boolean)n2, this.filterType_, filter.filterType_);
                    }
                    if (visitor != GeneratedMessageLite.MergeFromVisitor.INSTANCE) return this;
                    int n8 = filter.filterTypeCase_;
                    if (n8 == 0) return this;
                    this.filterTypeCase_ = n8;
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
            return new Filter();
        }

        public CompositeFilter getCompositeFilter() {
            if (this.filterTypeCase_ == 1) {
                return (CompositeFilter)((Object)this.filterType_);
            }
            return CompositeFilter.getDefaultInstance();
        }

        public FieldFilter getFieldFilter() {
            if (this.filterTypeCase_ == 2) {
                return (FieldFilter)((Object)this.filterType_);
            }
            return FieldFilter.getDefaultInstance();
        }

        public FilterTypeCase getFilterTypeCase() {
            return FilterTypeCase.forNumber((int)this.filterTypeCase_);
        }

        public int getSerializedSize() {
            int n = this.memoizedSerializedSize;
            if (n != -1) {
                return n;
            }
            int n2 = this.filterTypeCase_;
            int n3 = 0;
            if (n2 == 1) {
                n3 = 0 + CodedOutputStream.computeMessageSize((int)1, (MessageLite)((CompositeFilter)((Object)this.filterType_)));
            }
            if (this.filterTypeCase_ == 2) {
                n3 += CodedOutputStream.computeMessageSize((int)2, (MessageLite)((FieldFilter)((Object)this.filterType_)));
            }
            if (this.filterTypeCase_ == 3) {
                n3 += CodedOutputStream.computeMessageSize((int)3, (MessageLite)((UnaryFilter)((Object)this.filterType_)));
            }
            this.memoizedSerializedSize = n3;
            return n3;
        }

        public UnaryFilter getUnaryFilter() {
            if (this.filterTypeCase_ == 3) {
                return (UnaryFilter)((Object)this.filterType_);
            }
            return UnaryFilter.getDefaultInstance();
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.filterTypeCase_ == 1) {
                codedOutputStream.writeMessage(1, (MessageLite)((CompositeFilter)((Object)this.filterType_)));
            }
            if (this.filterTypeCase_ == 2) {
                codedOutputStream.writeMessage(2, (MessageLite)((FieldFilter)((Object)this.filterType_)));
            }
            if (this.filterTypeCase_ == 3) {
                codedOutputStream.writeMessage(3, (MessageLite)((UnaryFilter)((Object)this.filterType_)));
            }
        }

        public static final class Builder
        extends GeneratedMessageLite.Builder<Filter, Builder>
        implements FilterOrBuilder {
            private Builder() {
                super((GeneratedMessageLite)DEFAULT_INSTANCE);
            }

            public Builder clearCompositeFilter() {
                this.copyOnWrite();
                ((Filter)this.instance).clearCompositeFilter();
                return this;
            }

            public Builder clearFieldFilter() {
                this.copyOnWrite();
                ((Filter)this.instance).clearFieldFilter();
                return this;
            }

            public Builder clearFilterType() {
                this.copyOnWrite();
                ((Filter)this.instance).clearFilterType();
                return this;
            }

            public Builder clearUnaryFilter() {
                this.copyOnWrite();
                ((Filter)this.instance).clearUnaryFilter();
                return this;
            }

            public CompositeFilter getCompositeFilter() {
                return ((Filter)this.instance).getCompositeFilter();
            }

            public FieldFilter getFieldFilter() {
                return ((Filter)this.instance).getFieldFilter();
            }

            public FilterTypeCase getFilterTypeCase() {
                return ((Filter)this.instance).getFilterTypeCase();
            }

            public UnaryFilter getUnaryFilter() {
                return ((Filter)this.instance).getUnaryFilter();
            }

            public Builder mergeCompositeFilter(CompositeFilter compositeFilter) {
                this.copyOnWrite();
                ((Filter)this.instance).mergeCompositeFilter(compositeFilter);
                return this;
            }

            public Builder mergeFieldFilter(FieldFilter fieldFilter) {
                this.copyOnWrite();
                ((Filter)this.instance).mergeFieldFilter(fieldFilter);
                return this;
            }

            public Builder mergeUnaryFilter(UnaryFilter unaryFilter) {
                this.copyOnWrite();
                ((Filter)this.instance).mergeUnaryFilter(unaryFilter);
                return this;
            }

            public Builder setCompositeFilter(CompositeFilter.Builder builder) {
                this.copyOnWrite();
                ((Filter)this.instance).setCompositeFilter(builder);
                return this;
            }

            public Builder setCompositeFilter(CompositeFilter compositeFilter) {
                this.copyOnWrite();
                ((Filter)this.instance).setCompositeFilter(compositeFilter);
                return this;
            }

            public Builder setFieldFilter(FieldFilter.Builder builder) {
                this.copyOnWrite();
                ((Filter)this.instance).setFieldFilter(builder);
                return this;
            }

            public Builder setFieldFilter(FieldFilter fieldFilter) {
                this.copyOnWrite();
                ((Filter)this.instance).setFieldFilter(fieldFilter);
                return this;
            }

            public Builder setUnaryFilter(UnaryFilter.Builder builder) {
                this.copyOnWrite();
                ((Filter)this.instance).setUnaryFilter(builder);
                return this;
            }

            public Builder setUnaryFilter(UnaryFilter unaryFilter) {
                this.copyOnWrite();
                ((Filter)this.instance).setUnaryFilter(unaryFilter);
                return this;
            }
        }

    }

    /*
     * Exception performing whole class analysis ignored.
     */
    public static final class Order
    extends GeneratedMessageLite<Order, Builder>
    implements OrderOrBuilder {
        private static final Order DEFAULT_INSTANCE = new Order();
        public static final int DIRECTION_FIELD_NUMBER = 2;
        public static final int FIELD_FIELD_NUMBER = 1;
        private static volatile Parser<Order> PARSER;
        private int direction_;
        private FieldReference field_;

        static {
            DEFAULT_INSTANCE.makeImmutable();
        }

        private Order() {
        }

        private void clearDirection() {
            this.direction_ = 0;
        }

        private void clearField() {
            this.field_ = null;
        }

        public static Order getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeField(FieldReference fieldReference) {
            FieldReference fieldReference2 = this.field_;
            if (fieldReference2 != null && fieldReference2 != FieldReference.getDefaultInstance()) {
                this.field_ = (FieldReference)((FieldReference.Builder)FieldReference.newBuilder(this.field_).mergeFrom((GeneratedMessageLite)fieldReference)).buildPartial();
                return;
            }
            this.field_ = fieldReference;
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(Order order) {
            return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)order);
        }

        public static Order parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Order)Order.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static Order parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Order)Order.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Order parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Order)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
        }

        public static Order parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Order)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Order parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Order)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
        }

        public static Order parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Order)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Order parseFrom(InputStream inputStream) throws IOException {
            return (Order)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static Order parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Order)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Order parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
            return (Order)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
        }

        public static Order parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Order)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Parser<Order> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setDirection(Direction direction) {
            if (direction != null) {
                this.direction_ = direction.getNumber();
                return;
            }
            throw new NullPointerException();
        }

        private void setDirectionValue(int n) {
            this.direction_ = n;
        }

        private void setField(FieldReference.Builder builder) {
            this.field_ = (FieldReference)builder.build();
        }

        private void setField(FieldReference fieldReference) {
            if (fieldReference != null) {
                this.field_ = fieldReference;
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
                    Class<Order> class_ = Order.class;
                    // MONITORENTER : com.google.firestore.v1.StructuredQuery$Order.class
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
                                if (n != 16) {
                                    if (codedInputStream.skipField(n)) continue;
                                    bl = true;
                                    continue;
                                }
                                this.direction_ = codedInputStream.readEnum();
                                continue;
                            }
                            FieldReference fieldReference = this.field_;
                            FieldReference.Builder builder = null;
                            if (fieldReference != null) {
                                builder = (FieldReference.Builder)this.field_.toBuilder();
                            }
                            this.field_ = (FieldReference)codedInputStream.readMessage(FieldReference.parser(), extensionRegistryLite);
                            if (builder == null) continue;
                            builder.mergeFrom((GeneratedMessageLite)this.field_);
                            this.field_ = (FieldReference)builder.buildPartial();
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
                    Order order = (Order)((Object)object2);
                    this.field_ = (FieldReference)visitor.visitMessage((MessageLite)this.field_, (MessageLite)order.field_);
                    int n = this.direction_;
                    boolean bl = true;
                    boolean bl2 = n != 0;
                    int n2 = this.direction_;
                    if (order.direction_ == 0) {
                        bl = false;
                    }
                    this.direction_ = visitor.visitInt(bl2, n2, bl, order.direction_);
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
            return new Order();
        }

        public Direction getDirection() {
            Direction direction = Direction.forNumber((int)this.direction_);
            if (direction == null) {
                return Direction.UNRECOGNIZED;
            }
            return direction;
        }

        public int getDirectionValue() {
            return this.direction_;
        }

        public FieldReference getField() {
            FieldReference fieldReference = this.field_;
            if (fieldReference == null) {
                fieldReference = FieldReference.getDefaultInstance();
            }
            return fieldReference;
        }

        public int getSerializedSize() {
            int n = this.memoizedSerializedSize;
            if (n != -1) {
                return n;
            }
            FieldReference fieldReference = this.field_;
            int n2 = 0;
            if (fieldReference != null) {
                n2 = 0 + CodedOutputStream.computeMessageSize((int)1, (MessageLite)this.getField());
            }
            if (this.direction_ != Direction.DIRECTION_UNSPECIFIED.getNumber()) {
                n2 += CodedOutputStream.computeEnumSize((int)2, (int)this.direction_);
            }
            this.memoizedSerializedSize = n2;
            return n2;
        }

        public boolean hasField() {
            return this.field_ != null;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.field_ != null) {
                codedOutputStream.writeMessage(1, (MessageLite)this.getField());
            }
            if (this.direction_ != Direction.DIRECTION_UNSPECIFIED.getNumber()) {
                codedOutputStream.writeEnum(2, this.direction_);
            }
        }

        public static final class Builder
        extends GeneratedMessageLite.Builder<Order, Builder>
        implements OrderOrBuilder {
            private Builder() {
                super((GeneratedMessageLite)DEFAULT_INSTANCE);
            }

            public Builder clearDirection() {
                this.copyOnWrite();
                ((Order)this.instance).clearDirection();
                return this;
            }

            public Builder clearField() {
                this.copyOnWrite();
                ((Order)this.instance).clearField();
                return this;
            }

            public Direction getDirection() {
                return ((Order)this.instance).getDirection();
            }

            public int getDirectionValue() {
                return ((Order)this.instance).getDirectionValue();
            }

            public FieldReference getField() {
                return ((Order)this.instance).getField();
            }

            public boolean hasField() {
                return ((Order)this.instance).hasField();
            }

            public Builder mergeField(FieldReference fieldReference) {
                this.copyOnWrite();
                ((Order)this.instance).mergeField(fieldReference);
                return this;
            }

            public Builder setDirection(Direction direction) {
                this.copyOnWrite();
                ((Order)this.instance).setDirection(direction);
                return this;
            }

            public Builder setDirectionValue(int n) {
                this.copyOnWrite();
                ((Order)this.instance).setDirectionValue(n);
                return this;
            }

            public Builder setField(FieldReference.Builder builder) {
                this.copyOnWrite();
                ((Order)this.instance).setField(builder);
                return this;
            }

            public Builder setField(FieldReference fieldReference) {
                this.copyOnWrite();
                ((Order)this.instance).setField(fieldReference);
                return this;
            }
        }

    }

    public static final class Projection
    extends GeneratedMessageLite<Projection, Builder>
    implements ProjectionOrBuilder {
        private static final Projection DEFAULT_INSTANCE = new Projection();
        public static final int FIELDS_FIELD_NUMBER = 2;
        private static volatile Parser<Projection> PARSER;
        private Internal.ProtobufList<FieldReference> fields_ = Projection.emptyProtobufList();

        static {
            DEFAULT_INSTANCE.makeImmutable();
        }

        private Projection() {
        }

        private void addAllFields(Iterable<? extends FieldReference> iterable) {
            this.ensureFieldsIsMutable();
            AbstractMessageLite.addAll(iterable, this.fields_);
        }

        private void addFields(int n, FieldReference.Builder builder) {
            this.ensureFieldsIsMutable();
            this.fields_.add(n, (Object)((FieldReference)builder.build()));
        }

        private void addFields(int n, FieldReference fieldReference) {
            if (fieldReference != null) {
                this.ensureFieldsIsMutable();
                this.fields_.add(n, (Object)fieldReference);
                return;
            }
            throw new NullPointerException();
        }

        private void addFields(FieldReference.Builder builder) {
            this.ensureFieldsIsMutable();
            this.fields_.add((Object)((FieldReference)builder.build()));
        }

        private void addFields(FieldReference fieldReference) {
            if (fieldReference != null) {
                this.ensureFieldsIsMutable();
                this.fields_.add((Object)fieldReference);
                return;
            }
            throw new NullPointerException();
        }

        private void clearFields() {
            this.fields_ = Projection.emptyProtobufList();
        }

        private void ensureFieldsIsMutable() {
            if (!this.fields_.isModifiable()) {
                this.fields_ = GeneratedMessageLite.mutableCopy(this.fields_);
            }
        }

        public static Projection getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(Projection projection) {
            return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)projection);
        }

        public static Projection parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Projection)Projection.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static Projection parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Projection)Projection.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Projection parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Projection)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
        }

        public static Projection parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Projection)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Projection parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Projection)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
        }

        public static Projection parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Projection)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Projection parseFrom(InputStream inputStream) throws IOException {
            return (Projection)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static Projection parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Projection)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Projection parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
            return (Projection)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
        }

        public static Projection parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Projection)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Parser<Projection> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void removeFields(int n) {
            this.ensureFieldsIsMutable();
            this.fields_.remove(n);
        }

        private void setFields(int n, FieldReference.Builder builder) {
            this.ensureFieldsIsMutable();
            this.fields_.set(n, (Object)((FieldReference)builder.build()));
        }

        private void setFields(int n, FieldReference fieldReference) {
            if (fieldReference != null) {
                this.ensureFieldsIsMutable();
                this.fields_.set(n, (Object)fieldReference);
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
                    Class<Projection> class_ = Projection.class;
                    // MONITORENTER : com.google.firestore.v1.StructuredQuery$Projection.class
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
                            if (!this.fields_.isModifiable()) {
                                this.fields_ = GeneratedMessageLite.mutableCopy(this.fields_);
                            }
                            this.fields_.add((Object)((FieldReference)codedInputStream.readMessage(FieldReference.parser(), extensionRegistryLite)));
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
                    Projection projection = (Projection)((Object)object2);
                    this.fields_ = visitor.visitList(this.fields_, projection.fields_);
                    return this;
                }
                case 4: {
                    return new Builder();
                }
                case 3: {
                    this.fields_.makeImmutable();
                    return null;
                }
                case 2: {
                    return DEFAULT_INSTANCE;
                }
                case 1: 
            }
            return new Projection();
        }

        public FieldReference getFields(int n) {
            return (FieldReference)((Object)this.fields_.get(n));
        }

        public int getFieldsCount() {
            return this.fields_.size();
        }

        public List<FieldReference> getFieldsList() {
            return this.fields_;
        }

        public FieldReferenceOrBuilder getFieldsOrBuilder(int n) {
            return this.fields_.get(n);
        }

        public List<? extends FieldReferenceOrBuilder> getFieldsOrBuilderList() {
            return this.fields_;
        }

        public int getSerializedSize() {
            int n = this.memoizedSerializedSize;
            if (n != -1) {
                return n;
            }
            int n2 = 0;
            for (int i = 0; i < this.fields_.size(); ++i) {
                n2 += CodedOutputStream.computeMessageSize((int)2, (MessageLite)((MessageLite)this.fields_.get(i)));
            }
            this.memoizedSerializedSize = n2;
            return n2;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            for (int i = 0; i < this.fields_.size(); ++i) {
                codedOutputStream.writeMessage(2, (MessageLite)this.fields_.get(i));
            }
        }

        public static final class Builder
        extends GeneratedMessageLite.Builder<Projection, Builder>
        implements ProjectionOrBuilder {
            private Builder() {
                super((GeneratedMessageLite)DEFAULT_INSTANCE);
            }

            public Builder addAllFields(Iterable<? extends FieldReference> iterable) {
                this.copyOnWrite();
                ((Projection)this.instance).addAllFields((Iterable<? extends FieldReference>)iterable);
                return this;
            }

            public Builder addFields(int n, FieldReference.Builder builder) {
                this.copyOnWrite();
                ((Projection)this.instance).addFields(n, builder);
                return this;
            }

            public Builder addFields(int n, FieldReference fieldReference) {
                this.copyOnWrite();
                ((Projection)this.instance).addFields(n, fieldReference);
                return this;
            }

            public Builder addFields(FieldReference.Builder builder) {
                this.copyOnWrite();
                ((Projection)this.instance).addFields(builder);
                return this;
            }

            public Builder addFields(FieldReference fieldReference) {
                this.copyOnWrite();
                ((Projection)this.instance).addFields(fieldReference);
                return this;
            }

            public Builder clearFields() {
                this.copyOnWrite();
                ((Projection)this.instance).clearFields();
                return this;
            }

            public FieldReference getFields(int n) {
                return ((Projection)this.instance).getFields(n);
            }

            public int getFieldsCount() {
                return ((Projection)this.instance).getFieldsCount();
            }

            public List<FieldReference> getFieldsList() {
                return Collections.unmodifiableList(((Projection)this.instance).getFieldsList());
            }

            public Builder removeFields(int n) {
                this.copyOnWrite();
                ((Projection)this.instance).removeFields(n);
                return this;
            }

            public Builder setFields(int n, FieldReference.Builder builder) {
                this.copyOnWrite();
                ((Projection)this.instance).setFields(n, builder);
                return this;
            }

            public Builder setFields(int n, FieldReference fieldReference) {
                this.copyOnWrite();
                ((Projection)this.instance).setFields(n, fieldReference);
                return this;
            }
        }

    }

    /*
     * Exception performing whole class analysis ignored.
     */
    public static final class UnaryFilter
    extends GeneratedMessageLite<UnaryFilter, Builder>
    implements UnaryFilterOrBuilder {
        private static final UnaryFilter DEFAULT_INSTANCE = new UnaryFilter();
        public static final int FIELD_FIELD_NUMBER = 2;
        public static final int OP_FIELD_NUMBER = 1;
        private static volatile Parser<UnaryFilter> PARSER;
        private int op_;
        private int operandTypeCase_ = 0;
        private Object operandType_;

        static {
            DEFAULT_INSTANCE.makeImmutable();
        }

        private UnaryFilter() {
        }

        private void clearField() {
            if (this.operandTypeCase_ == 2) {
                this.operandTypeCase_ = 0;
                this.operandType_ = null;
            }
        }

        private void clearOp() {
            this.op_ = 0;
        }

        private void clearOperandType() {
            this.operandTypeCase_ = 0;
            this.operandType_ = null;
        }

        public static UnaryFilter getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeField(FieldReference fieldReference) {
            this.operandType_ = this.operandTypeCase_ == 2 && this.operandType_ != FieldReference.getDefaultInstance() ? ((FieldReference.Builder)FieldReference.newBuilder((FieldReference)((Object)this.operandType_)).mergeFrom((GeneratedMessageLite)fieldReference)).buildPartial() : fieldReference;
            this.operandTypeCase_ = 2;
        }

        public static Builder newBuilder() {
            return (Builder)DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(UnaryFilter unaryFilter) {
            return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)unaryFilter);
        }

        public static UnaryFilter parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (UnaryFilter)UnaryFilter.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static UnaryFilter parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (UnaryFilter)UnaryFilter.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static UnaryFilter parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (UnaryFilter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
        }

        public static UnaryFilter parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (UnaryFilter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static UnaryFilter parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (UnaryFilter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
        }

        public static UnaryFilter parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (UnaryFilter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static UnaryFilter parseFrom(InputStream inputStream) throws IOException {
            return (UnaryFilter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
        }

        public static UnaryFilter parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (UnaryFilter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static UnaryFilter parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
            return (UnaryFilter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
        }

        public static UnaryFilter parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (UnaryFilter)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
        }

        public static Parser<UnaryFilter> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setField(FieldReference.Builder builder) {
            this.operandType_ = builder.build();
            this.operandTypeCase_ = 2;
        }

        private void setField(FieldReference fieldReference) {
            if (fieldReference != null) {
                this.operandType_ = fieldReference;
                this.operandTypeCase_ = 2;
                return;
            }
            throw new NullPointerException();
        }

        private void setOp(Operator operator) {
            if (operator != null) {
                this.op_ = operator.getNumber();
                return;
            }
            throw new NullPointerException();
        }

        private void setOpValue(int n) {
            this.op_ = n;
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
                    Class<UnaryFilter> class_ = UnaryFilter.class;
                    // MONITORENTER : com.google.firestore.v1.StructuredQuery$UnaryFilter.class
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
                            if (n != 8) {
                                if (n != 18) {
                                    if (codedInputStream.skipField(n)) continue;
                                    bl = true;
                                    continue;
                                }
                                int n2 = this.operandTypeCase_;
                                FieldReference.Builder builder = null;
                                if (n2 == 2) {
                                    builder = (FieldReference.Builder)((FieldReference)((Object)this.operandType_)).toBuilder();
                                }
                                this.operandType_ = codedInputStream.readMessage(FieldReference.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom((GeneratedMessageLite)((FieldReference)((Object)this.operandType_)));
                                    this.operandType_ = builder.buildPartial();
                                }
                                this.operandTypeCase_ = 2;
                                continue;
                            }
                            this.op_ = codedInputStream.readEnum();
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
                    UnaryFilter unaryFilter = (UnaryFilter)((Object)object2);
                    boolean bl = this.op_ != 0;
                    int n = this.op_;
                    boolean bl2 = unaryFilter.op_ != 0;
                    this.op_ = visitor.visitInt(bl, n, bl2, unaryFilter.op_);
                    int n3 = 1.$SwitchMap$com$google$firestore$v1$StructuredQuery$UnaryFilter$OperandTypeCase[unaryFilter.getOperandTypeCase().ordinal()];
                    if (n3 != 1) {
                        if (n3 == 2) {
                            int n4 = this.operandTypeCase_;
                            boolean bl3 = false;
                            if (n4 != 0) {
                                bl3 = true;
                            }
                            visitor.visitOneofNotSet(bl3);
                        }
                    } else {
                        int n5 = this.operandTypeCase_;
                        boolean bl4 = false;
                        if (n5 == 2) {
                            bl4 = true;
                        }
                        this.operandType_ = visitor.visitOneofMessage(bl4, this.operandType_, unaryFilter.operandType_);
                    }
                    if (visitor != GeneratedMessageLite.MergeFromVisitor.INSTANCE) return this;
                    int n6 = unaryFilter.operandTypeCase_;
                    if (n6 == 0) return this;
                    this.operandTypeCase_ = n6;
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
            return new UnaryFilter();
        }

        public FieldReference getField() {
            if (this.operandTypeCase_ == 2) {
                return (FieldReference)((Object)this.operandType_);
            }
            return FieldReference.getDefaultInstance();
        }

        public Operator getOp() {
            Operator operator = Operator.forNumber((int)this.op_);
            if (operator == null) {
                return Operator.UNRECOGNIZED;
            }
            return operator;
        }

        public int getOpValue() {
            return this.op_;
        }

        public OperandTypeCase getOperandTypeCase() {
            return OperandTypeCase.forNumber((int)this.operandTypeCase_);
        }

        public int getSerializedSize() {
            int n = this.memoizedSerializedSize;
            if (n != -1) {
                return n;
            }
            int n2 = this.op_;
            int n3 = Operator.OPERATOR_UNSPECIFIED.getNumber();
            int n4 = 0;
            if (n2 != n3) {
                n4 = 0 + CodedOutputStream.computeEnumSize((int)1, (int)this.op_);
            }
            if (this.operandTypeCase_ == 2) {
                n4 += CodedOutputStream.computeMessageSize((int)2, (MessageLite)((FieldReference)((Object)this.operandType_)));
            }
            this.memoizedSerializedSize = n4;
            return n4;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.op_ != Operator.OPERATOR_UNSPECIFIED.getNumber()) {
                codedOutputStream.writeEnum(1, this.op_);
            }
            if (this.operandTypeCase_ == 2) {
                codedOutputStream.writeMessage(2, (MessageLite)((FieldReference)((Object)this.operandType_)));
            }
        }

        public static final class Builder
        extends GeneratedMessageLite.Builder<UnaryFilter, Builder>
        implements UnaryFilterOrBuilder {
            private Builder() {
                super((GeneratedMessageLite)DEFAULT_INSTANCE);
            }

            public Builder clearField() {
                this.copyOnWrite();
                ((UnaryFilter)this.instance).clearField();
                return this;
            }

            public Builder clearOp() {
                this.copyOnWrite();
                ((UnaryFilter)this.instance).clearOp();
                return this;
            }

            public Builder clearOperandType() {
                this.copyOnWrite();
                ((UnaryFilter)this.instance).clearOperandType();
                return this;
            }

            public FieldReference getField() {
                return ((UnaryFilter)this.instance).getField();
            }

            public Operator getOp() {
                return ((UnaryFilter)this.instance).getOp();
            }

            public int getOpValue() {
                return ((UnaryFilter)this.instance).getOpValue();
            }

            public OperandTypeCase getOperandTypeCase() {
                return ((UnaryFilter)this.instance).getOperandTypeCase();
            }

            public Builder mergeField(FieldReference fieldReference) {
                this.copyOnWrite();
                ((UnaryFilter)this.instance).mergeField(fieldReference);
                return this;
            }

            public Builder setField(FieldReference.Builder builder) {
                this.copyOnWrite();
                ((UnaryFilter)this.instance).setField(builder);
                return this;
            }

            public Builder setField(FieldReference fieldReference) {
                this.copyOnWrite();
                ((UnaryFilter)this.instance).setField(fieldReference);
                return this;
            }

            public Builder setOp(Operator operator) {
                this.copyOnWrite();
                ((UnaryFilter)this.instance).setOp(operator);
                return this;
            }

            public Builder setOpValue(int n) {
                this.copyOnWrite();
                ((UnaryFilter)this.instance).setOpValue(n);
                return this;
            }
        }

    }

}

