/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.CodedOutputStream
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageLite
 *  com.google.protobuf.GeneratedMessageLite$Builder
 *  com.google.protobuf.GeneratedMessageLite$DefaultInstanceBasedParser
 *  com.google.protobuf.GeneratedMessageLite$MethodToInvoke
 *  com.google.protobuf.GeneratedMessageLite$Visitor
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.Parser
 *  com.google.rpc.LocalizedMessage$1
 *  com.google.rpc.LocalizedMessageOrBuilder
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
package com.google.rpc;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.rpc.LocalizedMessage;
import com.google.rpc.LocalizedMessageOrBuilder;
import java.io.IOException;
import java.io.InputStream;

public final class LocalizedMessage
extends GeneratedMessageLite<LocalizedMessage, Builder>
implements LocalizedMessageOrBuilder {
    private static final LocalizedMessage DEFAULT_INSTANCE = new LocalizedMessage();
    public static final int LOCALE_FIELD_NUMBER = 1;
    public static final int MESSAGE_FIELD_NUMBER = 2;
    private static volatile Parser<LocalizedMessage> PARSER;
    private String locale_ = "";
    private String message_ = "";

    static {
        DEFAULT_INSTANCE.makeImmutable();
    }

    private LocalizedMessage() {
    }

    private void clearLocale() {
        this.locale_ = LocalizedMessage.getDefaultInstance().getLocale();
    }

    private void clearMessage() {
        this.message_ = LocalizedMessage.getDefaultInstance().getMessage();
    }

    public static LocalizedMessage getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(LocalizedMessage localizedMessage) {
        return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)localizedMessage);
    }

    public static LocalizedMessage parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (LocalizedMessage)LocalizedMessage.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static LocalizedMessage parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LocalizedMessage)LocalizedMessage.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static LocalizedMessage parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (LocalizedMessage)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static LocalizedMessage parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LocalizedMessage)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static LocalizedMessage parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (LocalizedMessage)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static LocalizedMessage parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LocalizedMessage)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static LocalizedMessage parseFrom(InputStream inputStream) throws IOException {
        return (LocalizedMessage)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static LocalizedMessage parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (LocalizedMessage)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static LocalizedMessage parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (LocalizedMessage)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static LocalizedMessage parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (LocalizedMessage)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<LocalizedMessage> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setLocale(String string) {
        if (string != null) {
            this.locale_ = string;
            return;
        }
        throw new NullPointerException();
    }

    private void setLocaleBytes(ByteString byteString) {
        if (byteString != null) {
            LocalizedMessage.checkByteStringIsUtf8((ByteString)byteString);
            this.locale_ = byteString.toStringUtf8();
            return;
        }
        throw new NullPointerException();
    }

    private void setMessage(String string) {
        if (string != null) {
            this.message_ = string;
            return;
        }
        throw new NullPointerException();
    }

    private void setMessageBytes(ByteString byteString) {
        if (byteString != null) {
            LocalizedMessage.checkByteStringIsUtf8((ByteString)byteString);
            this.message_ = byteString.toStringUtf8();
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
                Class<LocalizedMessage> class_ = LocalizedMessage.class;
                // MONITORENTER : com.google.rpc.LocalizedMessage.class
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
                            this.message_ = codedInputStream.readStringRequireUtf8();
                            continue;
                        }
                        this.locale_ = codedInputStream.readStringRequireUtf8();
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
                LocalizedMessage localizedMessage = (LocalizedMessage)((Object)object2);
                this.locale_ = visitor.visitString(true ^ this.locale_.isEmpty(), this.locale_, true ^ localizedMessage.locale_.isEmpty(), localizedMessage.locale_);
                this.message_ = visitor.visitString(true ^ this.message_.isEmpty(), this.message_, true ^ localizedMessage.message_.isEmpty(), localizedMessage.message_);
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
        return new LocalizedMessage();
    }

    public String getLocale() {
        return this.locale_;
    }

    public ByteString getLocaleBytes() {
        return ByteString.copyFromUtf8((String)this.locale_);
    }

    public String getMessage() {
        return this.message_;
    }

    public ByteString getMessageBytes() {
        return ByteString.copyFromUtf8((String)this.message_);
    }

    public int getSerializedSize() {
        int n = this.memoizedSerializedSize;
        if (n != -1) {
            return n;
        }
        boolean bl = this.locale_.isEmpty();
        int n2 = 0;
        if (!bl) {
            n2 = 0 + CodedOutputStream.computeStringSize((int)1, (String)this.getLocale());
        }
        if (!this.message_.isEmpty()) {
            n2 += CodedOutputStream.computeStringSize((int)2, (String)this.getMessage());
        }
        this.memoizedSerializedSize = n2;
        return n2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.locale_.isEmpty()) {
            codedOutputStream.writeString(1, this.getLocale());
        }
        if (!this.message_.isEmpty()) {
            codedOutputStream.writeString(2, this.getMessage());
        }
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<LocalizedMessage, Builder>
    implements LocalizedMessageOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder clearLocale() {
            this.copyOnWrite();
            ((LocalizedMessage)this.instance).clearLocale();
            return this;
        }

        public Builder clearMessage() {
            this.copyOnWrite();
            ((LocalizedMessage)this.instance).clearMessage();
            return this;
        }

        public String getLocale() {
            return ((LocalizedMessage)this.instance).getLocale();
        }

        public ByteString getLocaleBytes() {
            return ((LocalizedMessage)this.instance).getLocaleBytes();
        }

        public String getMessage() {
            return ((LocalizedMessage)this.instance).getMessage();
        }

        public ByteString getMessageBytes() {
            return ((LocalizedMessage)this.instance).getMessageBytes();
        }

        public Builder setLocale(String string) {
            this.copyOnWrite();
            ((LocalizedMessage)this.instance).setLocale(string);
            return this;
        }

        public Builder setLocaleBytes(ByteString byteString) {
            this.copyOnWrite();
            ((LocalizedMessage)this.instance).setLocaleBytes(byteString);
            return this;
        }

        public Builder setMessage(String string) {
            this.copyOnWrite();
            ((LocalizedMessage)this.instance).setMessage(string);
            return this;
        }

        public Builder setMessageBytes(ByteString byteString) {
            this.copyOnWrite();
            ((LocalizedMessage)this.instance).setMessageBytes(byteString);
            return this;
        }
    }

}

