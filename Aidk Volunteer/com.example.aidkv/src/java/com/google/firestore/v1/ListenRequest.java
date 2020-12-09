/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.firestore.v1.ListenRequest$1
 *  com.google.firestore.v1.ListenRequest$LabelsDefaultEntryHolder
 *  com.google.firestore.v1.ListenRequest$TargetChangeCase
 *  com.google.firestore.v1.ListenRequestOrBuilder
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
 *  com.google.protobuf.MapEntryLite
 *  com.google.protobuf.MapFieldLite
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.Parser
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.Class
 *  java.lang.Deprecated
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.UnsupportedOperationException
 *  java.util.Collections
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
package com.google.firestore.v1;

import com.google.firestore.v1.ListenRequest;
import com.google.firestore.v1.ListenRequestOrBuilder;
import com.google.firestore.v1.Target;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/*
 * Exception performing whole class analysis ignored.
 */
public final class ListenRequest
extends GeneratedMessageLite<ListenRequest, Builder>
implements ListenRequestOrBuilder {
    public static final int ADD_TARGET_FIELD_NUMBER = 2;
    public static final int DATABASE_FIELD_NUMBER = 1;
    private static final ListenRequest DEFAULT_INSTANCE = new ListenRequest();
    public static final int LABELS_FIELD_NUMBER = 4;
    private static volatile Parser<ListenRequest> PARSER;
    public static final int REMOVE_TARGET_FIELD_NUMBER = 3;
    private int bitField0_;
    private String database_ = "";
    private MapFieldLite<String, String> labels_ = MapFieldLite.emptyMapField();
    private int targetChangeCase_ = 0;
    private Object targetChange_;

    static {
        DEFAULT_INSTANCE.makeImmutable();
    }

    private ListenRequest() {
    }

    private void clearAddTarget() {
        if (this.targetChangeCase_ == 2) {
            this.targetChangeCase_ = 0;
            this.targetChange_ = null;
        }
    }

    private void clearDatabase() {
        this.database_ = ListenRequest.getDefaultInstance().getDatabase();
    }

    private void clearRemoveTarget() {
        if (this.targetChangeCase_ == 3) {
            this.targetChangeCase_ = 0;
            this.targetChange_ = null;
        }
    }

    private void clearTargetChange() {
        this.targetChangeCase_ = 0;
        this.targetChange_ = null;
    }

    public static ListenRequest getDefaultInstance() {
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

    private void mergeAddTarget(Target target) {
        this.targetChange_ = this.targetChangeCase_ == 2 && this.targetChange_ != Target.getDefaultInstance() ? ((Target.Builder)Target.newBuilder((Target)((Object)this.targetChange_)).mergeFrom((GeneratedMessageLite)target)).buildPartial() : target;
        this.targetChangeCase_ = 2;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(ListenRequest listenRequest) {
        return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)listenRequest);
    }

    public static ListenRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ListenRequest)ListenRequest.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static ListenRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ListenRequest)ListenRequest.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ListenRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ListenRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static ListenRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ListenRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ListenRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ListenRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static ListenRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ListenRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ListenRequest parseFrom(InputStream inputStream) throws IOException {
        return (ListenRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static ListenRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ListenRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ListenRequest parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (ListenRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static ListenRequest parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ListenRequest)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<ListenRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setAddTarget(Target.Builder builder) {
        this.targetChange_ = builder.build();
        this.targetChangeCase_ = 2;
    }

    private void setAddTarget(Target target) {
        if (target != null) {
            this.targetChange_ = target;
            this.targetChangeCase_ = 2;
            return;
        }
        throw new NullPointerException();
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
            ListenRequest.checkByteStringIsUtf8((ByteString)byteString);
            this.database_ = byteString.toStringUtf8();
            return;
        }
        throw new NullPointerException();
    }

    private void setRemoveTarget(int n) {
        this.targetChangeCase_ = 3;
        this.targetChange_ = n;
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
                Class<ListenRequest> class_ = ListenRequest.class;
                // MONITORENTER : com.google.firestore.v1.ListenRequest.class
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
                                if (n != 24) {
                                    if (n != 34) {
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
                                this.targetChangeCase_ = 3;
                                this.targetChange_ = codedInputStream.readInt32();
                                continue;
                            }
                            int n2 = this.targetChangeCase_;
                            Target.Builder builder = null;
                            if (n2 == 2) {
                                builder = (Target.Builder)((Target)((Object)this.targetChange_)).toBuilder();
                            }
                            this.targetChange_ = codedInputStream.readMessage(Target.parser(), extensionRegistryLite);
                            if (builder != null) {
                                builder.mergeFrom((GeneratedMessageLite)((Target)((Object)this.targetChange_)));
                                this.targetChange_ = builder.buildPartial();
                            }
                            this.targetChangeCase_ = 2;
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
                ListenRequest listenRequest = (ListenRequest)((Object)object2);
                boolean bl = this.database_.isEmpty();
                boolean bl2 = true;
                this.database_ = visitor.visitString(bl ^ bl2, this.database_, bl2 ^ listenRequest.database_.isEmpty(), listenRequest.database_);
                this.labels_ = visitor.visitMap(this.labels_, listenRequest.internalGetLabels());
                boolean bl3 = 1.$SwitchMap$com$google$firestore$v1$ListenRequest$TargetChangeCase[listenRequest.getTargetChangeCase().ordinal()];
                if (bl3 != bl2) {
                    if (!bl3) {
                        if (bl3) {
                            if (this.targetChangeCase_ == 0) {
                                bl2 = false;
                            }
                            visitor.visitOneofNotSet(bl2);
                        }
                    } else {
                        if (this.targetChangeCase_ != 3) {
                            bl2 = false;
                        }
                        this.targetChange_ = visitor.visitOneofInt(bl2, this.targetChange_, listenRequest.targetChange_);
                    }
                } else {
                    if (this.targetChangeCase_ != 2) {
                        bl2 = false;
                    }
                    this.targetChange_ = visitor.visitOneofMessage(bl2, this.targetChange_, listenRequest.targetChange_);
                }
                if (visitor != GeneratedMessageLite.MergeFromVisitor.INSTANCE) return this;
                int n = listenRequest.targetChangeCase_;
                if (n != 0) {
                    this.targetChangeCase_ = n;
                }
                this.bitField0_ |= listenRequest.bitField0_;
                return this;
            }
            case 4: {
                return new Builder();
            }
            case 3: {
                this.labels_.makeImmutable();
                return null;
            }
            case 2: {
                return DEFAULT_INSTANCE;
            }
            case 1: 
        }
        return new ListenRequest();
    }

    public Target getAddTarget() {
        if (this.targetChangeCase_ == 2) {
            return (Target)((Object)this.targetChange_);
        }
        return Target.getDefaultInstance();
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

    public int getRemoveTarget() {
        if (this.targetChangeCase_ == 3) {
            return (Integer)this.targetChange_;
        }
        return 0;
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
        if (this.targetChangeCase_ == 2) {
            n2 += CodedOutputStream.computeMessageSize((int)2, (MessageLite)((Target)((Object)this.targetChange_)));
        }
        if (this.targetChangeCase_ == 3) {
            n2 += CodedOutputStream.computeInt32Size((int)3, (int)((Integer)this.targetChange_));
        }
        for (Map.Entry entry : this.internalGetLabels().entrySet()) {
            n2 += LabelsDefaultEntryHolder.defaultEntry.computeMessageSize(4, (Object)((String)entry.getKey()), (Object)((String)entry.getValue()));
        }
        this.memoizedSerializedSize = n2;
        return n2;
    }

    public TargetChangeCase getTargetChangeCase() {
        return TargetChangeCase.forNumber((int)this.targetChangeCase_);
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.database_.isEmpty()) {
            codedOutputStream.writeString(1, this.getDatabase());
        }
        if (this.targetChangeCase_ == 2) {
            codedOutputStream.writeMessage(2, (MessageLite)((Target)((Object)this.targetChange_)));
        }
        if (this.targetChangeCase_ == 3) {
            codedOutputStream.writeInt32(3, ((Integer)this.targetChange_).intValue());
        }
        for (Map.Entry entry : this.internalGetLabels().entrySet()) {
            LabelsDefaultEntryHolder.defaultEntry.serializeTo(codedOutputStream, 4, (Object)((String)entry.getKey()), (Object)((String)entry.getValue()));
        }
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<ListenRequest, Builder>
    implements ListenRequestOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder clearAddTarget() {
            this.copyOnWrite();
            ((ListenRequest)this.instance).clearAddTarget();
            return this;
        }

        public Builder clearDatabase() {
            this.copyOnWrite();
            ((ListenRequest)this.instance).clearDatabase();
            return this;
        }

        public Builder clearLabels() {
            this.copyOnWrite();
            ((ListenRequest)this.instance).getMutableLabelsMap().clear();
            return this;
        }

        public Builder clearRemoveTarget() {
            this.copyOnWrite();
            ((ListenRequest)this.instance).clearRemoveTarget();
            return this;
        }

        public Builder clearTargetChange() {
            this.copyOnWrite();
            ((ListenRequest)this.instance).clearTargetChange();
            return this;
        }

        public boolean containsLabels(String string) {
            if (string != null) {
                return ((ListenRequest)this.instance).getLabelsMap().containsKey((Object)string);
            }
            throw new NullPointerException();
        }

        public Target getAddTarget() {
            return ((ListenRequest)this.instance).getAddTarget();
        }

        public String getDatabase() {
            return ((ListenRequest)this.instance).getDatabase();
        }

        public ByteString getDatabaseBytes() {
            return ((ListenRequest)this.instance).getDatabaseBytes();
        }

        @Deprecated
        public Map<String, String> getLabels() {
            return this.getLabelsMap();
        }

        public int getLabelsCount() {
            return ((ListenRequest)this.instance).getLabelsMap().size();
        }

        public Map<String, String> getLabelsMap() {
            return Collections.unmodifiableMap(((ListenRequest)this.instance).getLabelsMap());
        }

        public String getLabelsOrDefault(String string, String string2) {
            if (string != null) {
                Map<String, String> map = ((ListenRequest)this.instance).getLabelsMap();
                if (map.containsKey((Object)string)) {
                    return (String)map.get((Object)string);
                }
                return string2;
            }
            throw new NullPointerException();
        }

        public String getLabelsOrThrow(String string) {
            if (string != null) {
                Map<String, String> map = ((ListenRequest)this.instance).getLabelsMap();
                if (map.containsKey((Object)string)) {
                    return (String)map.get((Object)string);
                }
                throw new IllegalArgumentException();
            }
            throw new NullPointerException();
        }

        public int getRemoveTarget() {
            return ((ListenRequest)this.instance).getRemoveTarget();
        }

        public TargetChangeCase getTargetChangeCase() {
            return ((ListenRequest)this.instance).getTargetChangeCase();
        }

        public Builder mergeAddTarget(Target target) {
            this.copyOnWrite();
            ((ListenRequest)this.instance).mergeAddTarget(target);
            return this;
        }

        public Builder putAllLabels(Map<String, String> map) {
            this.copyOnWrite();
            ((ListenRequest)this.instance).getMutableLabelsMap().putAll(map);
            return this;
        }

        public Builder putLabels(String string, String string2) {
            if (string != null) {
                if (string2 != null) {
                    this.copyOnWrite();
                    ((ListenRequest)this.instance).getMutableLabelsMap().put((Object)string, (Object)string2);
                    return this;
                }
                throw new NullPointerException();
            }
            throw new NullPointerException();
        }

        public Builder removeLabels(String string) {
            if (string != null) {
                this.copyOnWrite();
                ((ListenRequest)this.instance).getMutableLabelsMap().remove((Object)string);
                return this;
            }
            throw new NullPointerException();
        }

        public Builder setAddTarget(Target.Builder builder) {
            this.copyOnWrite();
            ((ListenRequest)this.instance).setAddTarget(builder);
            return this;
        }

        public Builder setAddTarget(Target target) {
            this.copyOnWrite();
            ((ListenRequest)this.instance).setAddTarget(target);
            return this;
        }

        public Builder setDatabase(String string) {
            this.copyOnWrite();
            ((ListenRequest)this.instance).setDatabase(string);
            return this;
        }

        public Builder setDatabaseBytes(ByteString byteString) {
            this.copyOnWrite();
            ((ListenRequest)this.instance).setDatabaseBytes(byteString);
            return this;
        }

        public Builder setRemoveTarget(int n) {
            this.copyOnWrite();
            ((ListenRequest)this.instance).setRemoveTarget(n);
            return this;
        }
    }

}

