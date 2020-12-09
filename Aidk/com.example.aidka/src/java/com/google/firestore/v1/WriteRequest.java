/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.firestore.v1.WriteOrBuilder
 *  com.google.firestore.v1.WriteRequest$1
 *  com.google.firestore.v1.WriteRequest$LabelsDefaultEntryHolder
 *  com.google.firestore.v1.WriteRequestOrBuilder
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
 *  com.google.protobuf.MapEntryLite
 *  com.google.protobuf.MapFieldLite
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.Parser
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.Class
 *  java.lang.Deprecated
 *  java.lang.IllegalArgumentException
 *  java.lang.Iterable
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.UnsupportedOperationException
 *  java.util.Collections
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
package com.google.firestore.v1;

import com.google.firestore.v1.Write;
import com.google.firestore.v1.WriteOrBuilder;
import com.google.firestore.v1.WriteRequest;
import com.google.firestore.v1.WriteRequestOrBuilder;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class WriteRequest
extends GeneratedMessageLite<WriteRequest, Builder>
implements WriteRequestOrBuilder {
    public static final int DATABASE_FIELD_NUMBER = 1;
    private static final WriteRequest DEFAULT_INSTANCE = new WriteRequest();
    public static final int LABELS_FIELD_NUMBER = 5;
    private static volatile Parser<WriteRequest> PARSER;
    public static final int STREAM_ID_FIELD_NUMBER = 2;
    public static final int STREAM_TOKEN_FIELD_NUMBER = 4;
    public static final int WRITES_FIELD_NUMBER = 3;
    private int bitField0_;
    private String database_ = "";
    private MapFieldLite<String, String> labels_ = MapFieldLite.emptyMapField();
    private String streamId_ = "";
    private ByteString streamToken_ = ByteString.EMPTY;
    private Internal.ProtobufList<Write> writes_ = WriteRequest.emptyProtobufList();

    static {
        DEFAULT_INSTANCE.makeImmutable();
    }

    private WriteRequest() {
    }

    private void addAllWrites(Iterable<? extends Write> iterable) {
        this.ensureWritesIsMutable();
        AbstractMessageLite.addAll(iterable, this.writes_);
    }

    private void addWrites(int n, Write.Builder builder) {
        this.ensureWritesIsMutable();
        this.writes_.add(n, (Object)((Write)builder.build()));
    }

    private void addWrites(int n, Write write) {
        if (write != null) {
            this.ensureWritesIsMutable();
            this.writes_.add(n, (Object)write);
            return;
        }
        throw new NullPointerException();
    }

    private void addWrites(Write.Builder builder) {
        this.ensureWritesIsMutable();
        this.writes_.add((Object)((Write)builder.build()));
    }

    private void addWrites(Write write) {
        if (write != null) {
            this.ensureWritesIsMutable();
            this.writes_.add((Object)write);
            return;
        }
        throw new NullPointerException();
    }

    private void clearDatabase() {
        this.database_ = WriteRequest.getDefaultInstance().getDatabase();
    }

    private void clearStreamId() {
        this.streamId_ = WriteRequest.getDefaultInstance().getStreamId();
    }

    private void clearStreamToken() {
        this.streamToken_ = WriteRequest.getDefaultInstance().getStreamToken();
    }

    private void clearWrites() {
        this.writes_ = WriteRequest.emptyProtobufList();
    }

    private void ensureWritesIsMutable() {
        if (!this.writes_.isModifiable()) {
            this.writes_ = GeneratedMessageLite.mutableCopy(this.writes_);
        }
    }

    public static WriteRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private Map<String, String> getMutableLabelsMap() {
        return this.internalGetMutableLabels();
    }

    private MapFieldLite<String, String> internalGetLabels() {
        return this.labels_;
    }

    private MapFieldLite<String, String> internalGetMutableLabels() {
        if (!this.labels_.isMutable()) {
            this.labels_ = this.labels_.mutableCopy();
        }
        return this.labels_;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(WriteRequest writeRequest) {
        return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)writeRequest);
    }

    public static WriteRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (WriteRequest)WriteRequest.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static WriteRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WriteRequest)WriteRequest.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static WriteRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (WriteRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static WriteRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WriteRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static WriteRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (WriteRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static WriteRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WriteRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static WriteRequest parseFrom(InputStream inputStream) throws IOException {
        return (WriteRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static WriteRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (WriteRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static WriteRequest parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (WriteRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static WriteRequest parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (WriteRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<WriteRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeWrites(int n) {
        this.ensureWritesIsMutable();
        this.writes_.remove(n);
    }

    private void setDatabase(String string) {
        if (string != null) {
            this.database_ = string;
            return;
        }
        throw new NullPointerException();
    }

    private void setDatabaseBytes(ByteString byteString) {
        if (byteString != null) {
            WriteRequest.checkByteStringIsUtf8((ByteString)byteString);
            this.database_ = byteString.toStringUtf8();
            return;
        }
        throw new NullPointerException();
    }

    private void setStreamId(String string) {
        if (string != null) {
            this.streamId_ = string;
            return;
        }
        throw new NullPointerException();
    }

    private void setStreamIdBytes(ByteString byteString) {
        if (byteString != null) {
            WriteRequest.checkByteStringIsUtf8((ByteString)byteString);
            this.streamId_ = byteString.toStringUtf8();
            return;
        }
        throw new NullPointerException();
    }

    private void setStreamToken(ByteString byteString) {
        if (byteString != null) {
            this.streamToken_ = byteString;
            return;
        }
        throw new NullPointerException();
    }

    private void setWrites(int n, Write.Builder builder) {
        this.ensureWritesIsMutable();
        this.writes_.set(n, (Object)((Write)builder.build()));
    }

    private void setWrites(int n, Write write) {
        if (write != null) {
            this.ensureWritesIsMutable();
            this.writes_.set(n, (Object)write);
            return;
        }
        throw new NullPointerException();
    }

    public boolean containsLabels(String string) {
        if (string != null) {
            return this.internalGetLabels().containsKey((Object)string);
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
                Class<WriteRequest> class_ = WriteRequest.class;
                // MONITORENTER : com.google.firestore.v1.WriteRequest.class
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
                                            if (codedInputStream.skipField(n)) continue;
                                            bl = true;
                                            continue;
                                        }
                                        if (!this.labels_.isMutable()) {
                                            this.labels_ = this.labels_.mutableCopy();
                                        }
                                        LabelsDefaultEntryHolder.defaultEntry.parseInto(this.labels_, codedInputStream, extensionRegistryLite);
                                        continue;
                                    }
                                    this.streamToken_ = codedInputStream.readBytes();
                                    continue;
                                }
                                if (!this.writes_.isModifiable()) {
                                    this.writes_ = GeneratedMessageLite.mutableCopy(this.writes_);
                                }
                                this.writes_.add((Object)((Write)codedInputStream.readMessage(Write.parser(), extensionRegistryLite)));
                                continue;
                            }
                            this.streamId_ = codedInputStream.readStringRequireUtf8();
                            continue;
                        }
                        this.database_ = codedInputStream.readStringRequireUtf8();
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
                WriteRequest writeRequest = (WriteRequest)((Object)object2);
                boolean bl = this.database_.isEmpty();
                boolean bl2 = true;
                this.database_ = visitor.visitString(bl ^ bl2, this.database_, bl2 ^ writeRequest.database_.isEmpty(), writeRequest.database_);
                this.streamId_ = visitor.visitString(bl2 ^ this.streamId_.isEmpty(), this.streamId_, bl2 ^ writeRequest.streamId_.isEmpty(), writeRequest.streamId_);
                this.writes_ = visitor.visitList(this.writes_, writeRequest.writes_);
                boolean bl3 = this.streamToken_ != ByteString.EMPTY;
                ByteString byteString = this.streamToken_;
                if (writeRequest.streamToken_ == ByteString.EMPTY) {
                    bl2 = false;
                }
                this.streamToken_ = visitor.visitByteString(bl3, byteString, bl2, writeRequest.streamToken_);
                this.labels_ = visitor.visitMap(this.labels_, writeRequest.internalGetLabels());
                if (visitor != GeneratedMessageLite.MergeFromVisitor.INSTANCE) return this;
                this.bitField0_ |= writeRequest.bitField0_;
                return this;
            }
            case 4: {
                return new Builder();
            }
            case 3: {
                this.writes_.makeImmutable();
                this.labels_.makeImmutable();
                return null;
            }
            case 2: {
                return DEFAULT_INSTANCE;
            }
            case 1: 
        }
        return new WriteRequest();
    }

    public String getDatabase() {
        return this.database_;
    }

    public ByteString getDatabaseBytes() {
        return ByteString.copyFromUtf8((String)this.database_);
    }

    @Deprecated
    public Map<String, String> getLabels() {
        return this.getLabelsMap();
    }

    public int getLabelsCount() {
        return this.internalGetLabels().size();
    }

    public Map<String, String> getLabelsMap() {
        return Collections.unmodifiableMap(this.internalGetLabels());
    }

    public String getLabelsOrDefault(String string, String string2) {
        if (string != null) {
            MapFieldLite<String, String> mapFieldLite = this.internalGetLabels();
            if (mapFieldLite.containsKey((Object)string)) {
                return (String)mapFieldLite.get((Object)string);
            }
            return string2;
        }
        throw new NullPointerException();
    }

    public String getLabelsOrThrow(String string) {
        if (string != null) {
            MapFieldLite<String, String> mapFieldLite = this.internalGetLabels();
            if (mapFieldLite.containsKey((Object)string)) {
                return (String)mapFieldLite.get((Object)string);
            }
            throw new IllegalArgumentException();
        }
        throw new NullPointerException();
    }

    public int getSerializedSize() {
        int n = this.memoizedSerializedSize;
        if (n != -1) {
            return n;
        }
        boolean bl = this.database_.isEmpty();
        int n2 = 0;
        if (!bl) {
            n2 = 0 + CodedOutputStream.computeStringSize((int)1, (String)this.getDatabase());
        }
        if (!this.streamId_.isEmpty()) {
            n2 += CodedOutputStream.computeStringSize((int)2, (String)this.getStreamId());
        }
        for (int i = 0; i < this.writes_.size(); ++i) {
            n2 += CodedOutputStream.computeMessageSize((int)3, (MessageLite)((MessageLite)this.writes_.get(i)));
        }
        if (!this.streamToken_.isEmpty()) {
            n2 += CodedOutputStream.computeBytesSize((int)4, (ByteString)this.streamToken_);
        }
        for (Map.Entry entry : this.internalGetLabels().entrySet()) {
            n2 += LabelsDefaultEntryHolder.defaultEntry.computeMessageSize(5, (Object)((String)entry.getKey()), (Object)((String)entry.getValue()));
        }
        this.memoizedSerializedSize = n2;
        return n2;
    }

    public String getStreamId() {
        return this.streamId_;
    }

    public ByteString getStreamIdBytes() {
        return ByteString.copyFromUtf8((String)this.streamId_);
    }

    public ByteString getStreamToken() {
        return this.streamToken_;
    }

    public Write getWrites(int n) {
        return (Write)((Object)this.writes_.get(n));
    }

    public int getWritesCount() {
        return this.writes_.size();
    }

    public List<Write> getWritesList() {
        return this.writes_;
    }

    public WriteOrBuilder getWritesOrBuilder(int n) {
        return (WriteOrBuilder)this.writes_.get(n);
    }

    public List<? extends WriteOrBuilder> getWritesOrBuilderList() {
        return this.writes_;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.database_.isEmpty()) {
            codedOutputStream.writeString(1, this.getDatabase());
        }
        if (!this.streamId_.isEmpty()) {
            codedOutputStream.writeString(2, this.getStreamId());
        }
        for (int i = 0; i < this.writes_.size(); ++i) {
            codedOutputStream.writeMessage(3, (MessageLite)this.writes_.get(i));
        }
        if (!this.streamToken_.isEmpty()) {
            codedOutputStream.writeBytes(4, this.streamToken_);
        }
        for (Map.Entry entry : this.internalGetLabels().entrySet()) {
            LabelsDefaultEntryHolder.defaultEntry.serializeTo(codedOutputStream, 5, (Object)((String)entry.getKey()), (Object)((String)entry.getValue()));
        }
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<WriteRequest, Builder>
    implements WriteRequestOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder addAllWrites(Iterable<? extends Write> iterable) {
            this.copyOnWrite();
            ((WriteRequest)this.instance).addAllWrites((Iterable<? extends Write>)iterable);
            return this;
        }

        public Builder addWrites(int n, Write.Builder builder) {
            this.copyOnWrite();
            ((WriteRequest)this.instance).addWrites(n, builder);
            return this;
        }

        public Builder addWrites(int n, Write write) {
            this.copyOnWrite();
            ((WriteRequest)this.instance).addWrites(n, write);
            return this;
        }

        public Builder addWrites(Write.Builder builder) {
            this.copyOnWrite();
            ((WriteRequest)this.instance).addWrites(builder);
            return this;
        }

        public Builder addWrites(Write write) {
            this.copyOnWrite();
            ((WriteRequest)this.instance).addWrites(write);
            return this;
        }

        public Builder clearDatabase() {
            this.copyOnWrite();
            ((WriteRequest)this.instance).clearDatabase();
            return this;
        }

        public Builder clearLabels() {
            this.copyOnWrite();
            ((WriteRequest)this.instance).getMutableLabelsMap().clear();
            return this;
        }

        public Builder clearStreamId() {
            this.copyOnWrite();
            ((WriteRequest)this.instance).clearStreamId();
            return this;
        }

        public Builder clearStreamToken() {
            this.copyOnWrite();
            ((WriteRequest)this.instance).clearStreamToken();
            return this;
        }

        public Builder clearWrites() {
            this.copyOnWrite();
            ((WriteRequest)this.instance).clearWrites();
            return this;
        }

        public boolean containsLabels(String string) {
            if (string != null) {
                return ((WriteRequest)this.instance).getLabelsMap().containsKey((Object)string);
            }
            throw new NullPointerException();
        }

        public String getDatabase() {
            return ((WriteRequest)this.instance).getDatabase();
        }

        public ByteString getDatabaseBytes() {
            return ((WriteRequest)this.instance).getDatabaseBytes();
        }

        @Deprecated
        public Map<String, String> getLabels() {
            return this.getLabelsMap();
        }

        public int getLabelsCount() {
            return ((WriteRequest)this.instance).getLabelsMap().size();
        }

        public Map<String, String> getLabelsMap() {
            return Collections.unmodifiableMap(((WriteRequest)this.instance).getLabelsMap());
        }

        public String getLabelsOrDefault(String string, String string2) {
            if (string != null) {
                Map<String, String> map = ((WriteRequest)this.instance).getLabelsMap();
                if (map.containsKey((Object)string)) {
                    return (String)map.get((Object)string);
                }
                return string2;
            }
            throw new NullPointerException();
        }

        public String getLabelsOrThrow(String string) {
            if (string != null) {
                Map<String, String> map = ((WriteRequest)this.instance).getLabelsMap();
                if (map.containsKey((Object)string)) {
                    return (String)map.get((Object)string);
                }
                throw new IllegalArgumentException();
            }
            throw new NullPointerException();
        }

        public String getStreamId() {
            return ((WriteRequest)this.instance).getStreamId();
        }

        public ByteString getStreamIdBytes() {
            return ((WriteRequest)this.instance).getStreamIdBytes();
        }

        public ByteString getStreamToken() {
            return ((WriteRequest)this.instance).getStreamToken();
        }

        public Write getWrites(int n) {
            return ((WriteRequest)this.instance).getWrites(n);
        }

        public int getWritesCount() {
            return ((WriteRequest)this.instance).getWritesCount();
        }

        public List<Write> getWritesList() {
            return Collections.unmodifiableList(((WriteRequest)this.instance).getWritesList());
        }

        public Builder putAllLabels(Map<String, String> map) {
            this.copyOnWrite();
            ((WriteRequest)this.instance).getMutableLabelsMap().putAll(map);
            return this;
        }

        public Builder putLabels(String string, String string2) {
            if (string != null) {
                if (string2 != null) {
                    this.copyOnWrite();
                    ((WriteRequest)this.instance).getMutableLabelsMap().put((Object)string, (Object)string2);
                    return this;
                }
                throw new NullPointerException();
            }
            throw new NullPointerException();
        }

        public Builder removeLabels(String string) {
            if (string != null) {
                this.copyOnWrite();
                ((WriteRequest)this.instance).getMutableLabelsMap().remove((Object)string);
                return this;
            }
            throw new NullPointerException();
        }

        public Builder removeWrites(int n) {
            this.copyOnWrite();
            ((WriteRequest)this.instance).removeWrites(n);
            return this;
        }

        public Builder setDatabase(String string) {
            this.copyOnWrite();
            ((WriteRequest)this.instance).setDatabase(string);
            return this;
        }

        public Builder setDatabaseBytes(ByteString byteString) {
            this.copyOnWrite();
            ((WriteRequest)this.instance).setDatabaseBytes(byteString);
            return this;
        }

        public Builder setStreamId(String string) {
            this.copyOnWrite();
            ((WriteRequest)this.instance).setStreamId(string);
            return this;
        }

        public Builder setStreamIdBytes(ByteString byteString) {
            this.copyOnWrite();
            ((WriteRequest)this.instance).setStreamIdBytes(byteString);
            return this;
        }

        public Builder setStreamToken(ByteString byteString) {
            this.copyOnWrite();
            ((WriteRequest)this.instance).setStreamToken(byteString);
            return this;
        }

        public Builder setWrites(int n, Write.Builder builder) {
            this.copyOnWrite();
            ((WriteRequest)this.instance).setWrites(n, builder);
            return this;
        }

        public Builder setWrites(int n, Write write) {
            this.copyOnWrite();
            ((WriteRequest)this.instance).setWrites(n, write);
            return this;
        }
    }

}

