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

import com.google.api.ProjectPropertiesOrBuilder;
import com.google.api.Property;
import com.google.api.PropertyOrBuilder;
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

public final class ProjectProperties
extends GeneratedMessageLite<ProjectProperties, Builder>
implements ProjectPropertiesOrBuilder {
    private static final ProjectProperties DEFAULT_INSTANCE = new ProjectProperties();
    private static volatile Parser<ProjectProperties> PARSER;
    public static final int PROPERTIES_FIELD_NUMBER = 1;
    private Internal.ProtobufList<Property> properties_ = ProjectProperties.emptyProtobufList();

    static {
        DEFAULT_INSTANCE.makeImmutable();
    }

    private ProjectProperties() {
    }

    private void addAllProperties(Iterable<? extends Property> iterable) {
        this.ensurePropertiesIsMutable();
        AbstractMessageLite.addAll(iterable, this.properties_);
    }

    private void addProperties(int n, Property.Builder builder) {
        this.ensurePropertiesIsMutable();
        this.properties_.add(n, (Object)((Property)builder.build()));
    }

    private void addProperties(int n, Property property) {
        if (property != null) {
            this.ensurePropertiesIsMutable();
            this.properties_.add(n, (Object)property);
            return;
        }
        throw new NullPointerException();
    }

    private void addProperties(Property.Builder builder) {
        this.ensurePropertiesIsMutable();
        this.properties_.add((Object)((Property)builder.build()));
    }

    private void addProperties(Property property) {
        if (property != null) {
            this.ensurePropertiesIsMutable();
            this.properties_.add((Object)property);
            return;
        }
        throw new NullPointerException();
    }

    private void clearProperties() {
        this.properties_ = ProjectProperties.emptyProtobufList();
    }

    private void ensurePropertiesIsMutable() {
        if (!this.properties_.isModifiable()) {
            this.properties_ = GeneratedMessageLite.mutableCopy(this.properties_);
        }
    }

    public static ProjectProperties getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(ProjectProperties projectProperties) {
        return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)projectProperties);
    }

    public static ProjectProperties parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ProjectProperties)ProjectProperties.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static ProjectProperties parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ProjectProperties)ProjectProperties.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ProjectProperties parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ProjectProperties)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static ProjectProperties parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ProjectProperties)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ProjectProperties parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (ProjectProperties)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static ProjectProperties parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ProjectProperties)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ProjectProperties parseFrom(InputStream inputStream) throws IOException {
        return (ProjectProperties)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static ProjectProperties parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (ProjectProperties)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ProjectProperties parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (ProjectProperties)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static ProjectProperties parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (ProjectProperties)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<ProjectProperties> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeProperties(int n) {
        this.ensurePropertiesIsMutable();
        this.properties_.remove(n);
    }

    private void setProperties(int n, Property.Builder builder) {
        this.ensurePropertiesIsMutable();
        this.properties_.set(n, (Object)((Property)builder.build()));
    }

    private void setProperties(int n, Property property) {
        if (property != null) {
            this.ensurePropertiesIsMutable();
            this.properties_.set(n, (Object)property);
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
                Class<ProjectProperties> class_ = ProjectProperties.class;
                // MONITORENTER : com.google.api.ProjectProperties.class
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
                        if (!this.properties_.isModifiable()) {
                            this.properties_ = GeneratedMessageLite.mutableCopy(this.properties_);
                        }
                        this.properties_.add((Object)((Property)codedInputStream.readMessage(Property.parser(), extensionRegistryLite)));
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
                ProjectProperties projectProperties = (ProjectProperties)object2;
                this.properties_ = visitor.visitList(this.properties_, projectProperties.properties_);
                return this;
            }
            case 4: {
                return new Builder();
            }
            case 3: {
                this.properties_.makeImmutable();
                return null;
            }
            case 2: {
                return DEFAULT_INSTANCE;
            }
            case 1: 
        }
        return new ProjectProperties();
    }

    @Override
    public Property getProperties(int n) {
        return (Property)this.properties_.get(n);
    }

    @Override
    public int getPropertiesCount() {
        return this.properties_.size();
    }

    @Override
    public List<Property> getPropertiesList() {
        return this.properties_;
    }

    public PropertyOrBuilder getPropertiesOrBuilder(int n) {
        return (PropertyOrBuilder)this.properties_.get(n);
    }

    public List<? extends PropertyOrBuilder> getPropertiesOrBuilderList() {
        return this.properties_;
    }

    public int getSerializedSize() {
        int n = this.memoizedSerializedSize;
        if (n != -1) {
            return n;
        }
        int n2 = 0;
        for (int i = 0; i < this.properties_.size(); ++i) {
            n2 += CodedOutputStream.computeMessageSize((int)1, (MessageLite)((MessageLite)this.properties_.get(i)));
        }
        this.memoizedSerializedSize = n2;
        return n2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.properties_.size(); ++i) {
            codedOutputStream.writeMessage(1, (MessageLite)this.properties_.get(i));
        }
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<ProjectProperties, Builder>
    implements ProjectPropertiesOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder addAllProperties(Iterable<? extends Property> iterable) {
            this.copyOnWrite();
            ((ProjectProperties)this.instance).addAllProperties((Iterable<? extends Property>)iterable);
            return this;
        }

        public Builder addProperties(int n, Property.Builder builder) {
            this.copyOnWrite();
            ((ProjectProperties)this.instance).addProperties(n, builder);
            return this;
        }

        public Builder addProperties(int n, Property property) {
            this.copyOnWrite();
            ((ProjectProperties)this.instance).addProperties(n, property);
            return this;
        }

        public Builder addProperties(Property.Builder builder) {
            this.copyOnWrite();
            ((ProjectProperties)this.instance).addProperties(builder);
            return this;
        }

        public Builder addProperties(Property property) {
            this.copyOnWrite();
            ((ProjectProperties)this.instance).addProperties(property);
            return this;
        }

        public Builder clearProperties() {
            this.copyOnWrite();
            ((ProjectProperties)this.instance).clearProperties();
            return this;
        }

        @Override
        public Property getProperties(int n) {
            return ((ProjectProperties)this.instance).getProperties(n);
        }

        @Override
        public int getPropertiesCount() {
            return ((ProjectProperties)this.instance).getPropertiesCount();
        }

        @Override
        public List<Property> getPropertiesList() {
            return Collections.unmodifiableList(((ProjectProperties)this.instance).getPropertiesList());
        }

        public Builder removeProperties(int n) {
            this.copyOnWrite();
            ((ProjectProperties)this.instance).removeProperties(n);
            return this;
        }

        public Builder setProperties(int n, Property.Builder builder) {
            this.copyOnWrite();
            ((ProjectProperties)this.instance).setProperties(n, builder);
            return this;
        }

        public Builder setProperties(int n, Property property) {
            this.copyOnWrite();
            ((ProjectProperties)this.instance).setProperties(n, property);
            return this;
        }
    }

}

