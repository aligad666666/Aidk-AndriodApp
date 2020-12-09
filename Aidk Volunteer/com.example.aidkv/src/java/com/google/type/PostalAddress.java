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
 *  com.google.protobuf.GeneratedMessageLite$MethodToInvoke
 *  com.google.protobuf.Internal
 *  com.google.protobuf.Internal$ProtobufList
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.Parser
 *  com.google.type.PostalAddress$1
 *  com.google.type.PostalAddressOrBuilder
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.Iterable
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Collections
 *  java.util.List
 */
package com.google.type;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.google.type.PostalAddress;
import com.google.type.PostalAddressOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

public final class PostalAddress
extends GeneratedMessageLite<PostalAddress, Builder>
implements PostalAddressOrBuilder {
    public static final int ADDRESS_LINES_FIELD_NUMBER = 9;
    public static final int ADMINISTRATIVE_AREA_FIELD_NUMBER = 6;
    private static final PostalAddress DEFAULT_INSTANCE = new PostalAddress();
    public static final int LANGUAGE_CODE_FIELD_NUMBER = 3;
    public static final int LOCALITY_FIELD_NUMBER = 7;
    public static final int ORGANIZATION_FIELD_NUMBER = 11;
    private static volatile Parser<PostalAddress> PARSER;
    public static final int POSTAL_CODE_FIELD_NUMBER = 4;
    public static final int RECIPIENTS_FIELD_NUMBER = 10;
    public static final int REGION_CODE_FIELD_NUMBER = 2;
    public static final int REVISION_FIELD_NUMBER = 1;
    public static final int SORTING_CODE_FIELD_NUMBER = 5;
    public static final int SUBLOCALITY_FIELD_NUMBER = 8;
    private Internal.ProtobufList<String> addressLines_ = GeneratedMessageLite.emptyProtobufList();
    private String administrativeArea_ = "";
    private int bitField0_;
    private String languageCode_ = "";
    private String locality_ = "";
    private String organization_ = "";
    private String postalCode_ = "";
    private Internal.ProtobufList<String> recipients_ = GeneratedMessageLite.emptyProtobufList();
    private String regionCode_ = "";
    private int revision_;
    private String sortingCode_ = "";
    private String sublocality_ = "";

    static {
        DEFAULT_INSTANCE.makeImmutable();
    }

    private PostalAddress() {
    }

    private void addAddressLines(String string) {
        if (string != null) {
            this.ensureAddressLinesIsMutable();
            this.addressLines_.add((Object)string);
            return;
        }
        throw new NullPointerException();
    }

    private void addAddressLinesBytes(ByteString byteString) {
        if (byteString != null) {
            PostalAddress.checkByteStringIsUtf8((ByteString)byteString);
            this.ensureAddressLinesIsMutable();
            this.addressLines_.add((Object)byteString.toStringUtf8());
            return;
        }
        throw new NullPointerException();
    }

    private void addAllAddressLines(Iterable<String> iterable) {
        this.ensureAddressLinesIsMutable();
        AbstractMessageLite.addAll(iterable, this.addressLines_);
    }

    private void addAllRecipients(Iterable<String> iterable) {
        this.ensureRecipientsIsMutable();
        AbstractMessageLite.addAll(iterable, this.recipients_);
    }

    private void addRecipients(String string) {
        if (string != null) {
            this.ensureRecipientsIsMutable();
            this.recipients_.add((Object)string);
            return;
        }
        throw new NullPointerException();
    }

    private void addRecipientsBytes(ByteString byteString) {
        if (byteString != null) {
            PostalAddress.checkByteStringIsUtf8((ByteString)byteString);
            this.ensureRecipientsIsMutable();
            this.recipients_.add((Object)byteString.toStringUtf8());
            return;
        }
        throw new NullPointerException();
    }

    private void clearAddressLines() {
        this.addressLines_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearAdministrativeArea() {
        this.administrativeArea_ = PostalAddress.getDefaultInstance().getAdministrativeArea();
    }

    private void clearLanguageCode() {
        this.languageCode_ = PostalAddress.getDefaultInstance().getLanguageCode();
    }

    private void clearLocality() {
        this.locality_ = PostalAddress.getDefaultInstance().getLocality();
    }

    private void clearOrganization() {
        this.organization_ = PostalAddress.getDefaultInstance().getOrganization();
    }

    private void clearPostalCode() {
        this.postalCode_ = PostalAddress.getDefaultInstance().getPostalCode();
    }

    private void clearRecipients() {
        this.recipients_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearRegionCode() {
        this.regionCode_ = PostalAddress.getDefaultInstance().getRegionCode();
    }

    private void clearRevision() {
        this.revision_ = 0;
    }

    private void clearSortingCode() {
        this.sortingCode_ = PostalAddress.getDefaultInstance().getSortingCode();
    }

    private void clearSublocality() {
        this.sublocality_ = PostalAddress.getDefaultInstance().getSublocality();
    }

    private void ensureAddressLinesIsMutable() {
        if (!this.addressLines_.isModifiable()) {
            this.addressLines_ = GeneratedMessageLite.mutableCopy(this.addressLines_);
        }
    }

    private void ensureRecipientsIsMutable() {
        if (!this.recipients_.isModifiable()) {
            this.recipients_ = GeneratedMessageLite.mutableCopy(this.recipients_);
        }
    }

    public static PostalAddress getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(PostalAddress postalAddress) {
        return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)postalAddress);
    }

    public static PostalAddress parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PostalAddress)PostalAddress.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static PostalAddress parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PostalAddress)PostalAddress.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static PostalAddress parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (PostalAddress)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static PostalAddress parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PostalAddress)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static PostalAddress parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (PostalAddress)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static PostalAddress parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PostalAddress)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static PostalAddress parseFrom(InputStream inputStream) throws IOException {
        return (PostalAddress)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static PostalAddress parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PostalAddress)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static PostalAddress parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (PostalAddress)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static PostalAddress parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PostalAddress)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<PostalAddress> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setAddressLines(int n, String string) {
        if (string != null) {
            this.ensureAddressLinesIsMutable();
            this.addressLines_.set(n, (Object)string);
            return;
        }
        throw new NullPointerException();
    }

    private void setAdministrativeArea(String string) {
        if (string != null) {
            this.administrativeArea_ = string;
            return;
        }
        throw new NullPointerException();
    }

    private void setAdministrativeAreaBytes(ByteString byteString) {
        if (byteString != null) {
            PostalAddress.checkByteStringIsUtf8((ByteString)byteString);
            this.administrativeArea_ = byteString.toStringUtf8();
            return;
        }
        throw new NullPointerException();
    }

    private void setLanguageCode(String string) {
        if (string != null) {
            this.languageCode_ = string;
            return;
        }
        throw new NullPointerException();
    }

    private void setLanguageCodeBytes(ByteString byteString) {
        if (byteString != null) {
            PostalAddress.checkByteStringIsUtf8((ByteString)byteString);
            this.languageCode_ = byteString.toStringUtf8();
            return;
        }
        throw new NullPointerException();
    }

    private void setLocality(String string) {
        if (string != null) {
            this.locality_ = string;
            return;
        }
        throw new NullPointerException();
    }

    private void setLocalityBytes(ByteString byteString) {
        if (byteString != null) {
            PostalAddress.checkByteStringIsUtf8((ByteString)byteString);
            this.locality_ = byteString.toStringUtf8();
            return;
        }
        throw new NullPointerException();
    }

    private void setOrganization(String string) {
        if (string != null) {
            this.organization_ = string;
            return;
        }
        throw new NullPointerException();
    }

    private void setOrganizationBytes(ByteString byteString) {
        if (byteString != null) {
            PostalAddress.checkByteStringIsUtf8((ByteString)byteString);
            this.organization_ = byteString.toStringUtf8();
            return;
        }
        throw new NullPointerException();
    }

    private void setPostalCode(String string) {
        if (string != null) {
            this.postalCode_ = string;
            return;
        }
        throw new NullPointerException();
    }

    private void setPostalCodeBytes(ByteString byteString) {
        if (byteString != null) {
            PostalAddress.checkByteStringIsUtf8((ByteString)byteString);
            this.postalCode_ = byteString.toStringUtf8();
            return;
        }
        throw new NullPointerException();
    }

    private void setRecipients(int n, String string) {
        if (string != null) {
            this.ensureRecipientsIsMutable();
            this.recipients_.set(n, (Object)string);
            return;
        }
        throw new NullPointerException();
    }

    private void setRegionCode(String string) {
        if (string != null) {
            this.regionCode_ = string;
            return;
        }
        throw new NullPointerException();
    }

    private void setRegionCodeBytes(ByteString byteString) {
        if (byteString != null) {
            PostalAddress.checkByteStringIsUtf8((ByteString)byteString);
            this.regionCode_ = byteString.toStringUtf8();
            return;
        }
        throw new NullPointerException();
    }

    private void setRevision(int n) {
        this.revision_ = n;
    }

    private void setSortingCode(String string) {
        if (string != null) {
            this.sortingCode_ = string;
            return;
        }
        throw new NullPointerException();
    }

    private void setSortingCodeBytes(ByteString byteString) {
        if (byteString != null) {
            PostalAddress.checkByteStringIsUtf8((ByteString)byteString);
            this.sortingCode_ = byteString.toStringUtf8();
            return;
        }
        throw new NullPointerException();
    }

    private void setSublocality(String string) {
        if (string != null) {
            this.sublocality_ = string;
            return;
        }
        throw new NullPointerException();
    }

    private void setSublocalityBytes(ByteString byteString) {
        if (byteString != null) {
            PostalAddress.checkByteStringIsUtf8((ByteString)byteString);
            this.sublocality_ = byteString.toStringUtf8();
            return;
        }
        throw new NullPointerException();
    }

    /*
     * Exception decompiling
     */
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke var1_1, Object var2_2, Object var3_3) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [16[CASE]], but top level block is 3[TRYBLOCK]
        // org.benf.cfr.reader.b.a.a.j.a(Op04StructuredStatement.java:432)
        // org.benf.cfr.reader.b.a.a.j.d(Op04StructuredStatement.java:484)
        // org.benf.cfr.reader.b.a.a.i.a(Op03SimpleStatement.java:607)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:692)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
        // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
        // org.benf.cfr.reader.b.a(Driver.java:128)
        // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
        // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
        // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
        // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
        // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)
        // java.lang.Thread.run(Thread.java:919)
        throw new IllegalStateException("Decompilation failed");
    }

    public String getAddressLines(int n) {
        return (String)this.addressLines_.get(n);
    }

    public ByteString getAddressLinesBytes(int n) {
        return ByteString.copyFromUtf8((String)((String)this.addressLines_.get(n)));
    }

    public int getAddressLinesCount() {
        return this.addressLines_.size();
    }

    public List<String> getAddressLinesList() {
        return this.addressLines_;
    }

    public String getAdministrativeArea() {
        return this.administrativeArea_;
    }

    public ByteString getAdministrativeAreaBytes() {
        return ByteString.copyFromUtf8((String)this.administrativeArea_);
    }

    public String getLanguageCode() {
        return this.languageCode_;
    }

    public ByteString getLanguageCodeBytes() {
        return ByteString.copyFromUtf8((String)this.languageCode_);
    }

    public String getLocality() {
        return this.locality_;
    }

    public ByteString getLocalityBytes() {
        return ByteString.copyFromUtf8((String)this.locality_);
    }

    public String getOrganization() {
        return this.organization_;
    }

    public ByteString getOrganizationBytes() {
        return ByteString.copyFromUtf8((String)this.organization_);
    }

    public String getPostalCode() {
        return this.postalCode_;
    }

    public ByteString getPostalCodeBytes() {
        return ByteString.copyFromUtf8((String)this.postalCode_);
    }

    public String getRecipients(int n) {
        return (String)this.recipients_.get(n);
    }

    public ByteString getRecipientsBytes(int n) {
        return ByteString.copyFromUtf8((String)((String)this.recipients_.get(n)));
    }

    public int getRecipientsCount() {
        return this.recipients_.size();
    }

    public List<String> getRecipientsList() {
        return this.recipients_;
    }

    public String getRegionCode() {
        return this.regionCode_;
    }

    public ByteString getRegionCodeBytes() {
        return ByteString.copyFromUtf8((String)this.regionCode_);
    }

    public int getRevision() {
        return this.revision_;
    }

    public int getSerializedSize() {
        int n = this.memoizedSerializedSize;
        if (n != -1) {
            return n;
        }
        int n2 = this.revision_;
        int n3 = 0;
        if (n2 != 0) {
            n3 = 0 + CodedOutputStream.computeInt32Size((int)1, (int)n2);
        }
        if (!this.regionCode_.isEmpty()) {
            n3 += CodedOutputStream.computeStringSize((int)2, (String)this.getRegionCode());
        }
        if (!this.languageCode_.isEmpty()) {
            n3 += CodedOutputStream.computeStringSize((int)3, (String)this.getLanguageCode());
        }
        if (!this.postalCode_.isEmpty()) {
            n3 += CodedOutputStream.computeStringSize((int)4, (String)this.getPostalCode());
        }
        if (!this.sortingCode_.isEmpty()) {
            n3 += CodedOutputStream.computeStringSize((int)5, (String)this.getSortingCode());
        }
        if (!this.administrativeArea_.isEmpty()) {
            n3 += CodedOutputStream.computeStringSize((int)6, (String)this.getAdministrativeArea());
        }
        if (!this.locality_.isEmpty()) {
            n3 += CodedOutputStream.computeStringSize((int)7, (String)this.getLocality());
        }
        if (!this.sublocality_.isEmpty()) {
            n3 += CodedOutputStream.computeStringSize((int)8, (String)this.getSublocality());
        }
        int n4 = 0;
        for (int i = 0; i < this.addressLines_.size(); ++i) {
            n4 += CodedOutputStream.computeStringSizeNoTag((String)((String)this.addressLines_.get(i)));
        }
        int n5 = n3 + n4 + 1 * this.getAddressLinesList().size();
        int n6 = 0;
        for (int i = 0; i < this.recipients_.size(); ++i) {
            n6 += CodedOutputStream.computeStringSizeNoTag((String)((String)this.recipients_.get(i)));
        }
        int n7 = n5 + n6 + 1 * this.getRecipientsList().size();
        if (!this.organization_.isEmpty()) {
            n7 += CodedOutputStream.computeStringSize((int)11, (String)this.getOrganization());
        }
        this.memoizedSerializedSize = n7;
        return n7;
    }

    public String getSortingCode() {
        return this.sortingCode_;
    }

    public ByteString getSortingCodeBytes() {
        return ByteString.copyFromUtf8((String)this.sortingCode_);
    }

    public String getSublocality() {
        return this.sublocality_;
    }

    public ByteString getSublocalityBytes() {
        return ByteString.copyFromUtf8((String)this.sublocality_);
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        int n = this.revision_;
        if (n != 0) {
            codedOutputStream.writeInt32(1, n);
        }
        if (!this.regionCode_.isEmpty()) {
            codedOutputStream.writeString(2, this.getRegionCode());
        }
        if (!this.languageCode_.isEmpty()) {
            codedOutputStream.writeString(3, this.getLanguageCode());
        }
        if (!this.postalCode_.isEmpty()) {
            codedOutputStream.writeString(4, this.getPostalCode());
        }
        if (!this.sortingCode_.isEmpty()) {
            codedOutputStream.writeString(5, this.getSortingCode());
        }
        if (!this.administrativeArea_.isEmpty()) {
            codedOutputStream.writeString(6, this.getAdministrativeArea());
        }
        if (!this.locality_.isEmpty()) {
            codedOutputStream.writeString(7, this.getLocality());
        }
        if (!this.sublocality_.isEmpty()) {
            codedOutputStream.writeString(8, this.getSublocality());
        }
        for (int i = 0; i < this.addressLines_.size(); ++i) {
            codedOutputStream.writeString(9, (String)this.addressLines_.get(i));
        }
        for (int i = 0; i < this.recipients_.size(); ++i) {
            codedOutputStream.writeString(10, (String)this.recipients_.get(i));
        }
        if (!this.organization_.isEmpty()) {
            codedOutputStream.writeString(11, this.getOrganization());
        }
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<PostalAddress, Builder>
    implements PostalAddressOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder addAddressLines(String string) {
            this.copyOnWrite();
            ((PostalAddress)this.instance).addAddressLines(string);
            return this;
        }

        public Builder addAddressLinesBytes(ByteString byteString) {
            this.copyOnWrite();
            ((PostalAddress)this.instance).addAddressLinesBytes(byteString);
            return this;
        }

        public Builder addAllAddressLines(Iterable<String> iterable) {
            this.copyOnWrite();
            ((PostalAddress)this.instance).addAllAddressLines((Iterable<String>)iterable);
            return this;
        }

        public Builder addAllRecipients(Iterable<String> iterable) {
            this.copyOnWrite();
            ((PostalAddress)this.instance).addAllRecipients((Iterable<String>)iterable);
            return this;
        }

        public Builder addRecipients(String string) {
            this.copyOnWrite();
            ((PostalAddress)this.instance).addRecipients(string);
            return this;
        }

        public Builder addRecipientsBytes(ByteString byteString) {
            this.copyOnWrite();
            ((PostalAddress)this.instance).addRecipientsBytes(byteString);
            return this;
        }

        public Builder clearAddressLines() {
            this.copyOnWrite();
            ((PostalAddress)this.instance).clearAddressLines();
            return this;
        }

        public Builder clearAdministrativeArea() {
            this.copyOnWrite();
            ((PostalAddress)this.instance).clearAdministrativeArea();
            return this;
        }

        public Builder clearLanguageCode() {
            this.copyOnWrite();
            ((PostalAddress)this.instance).clearLanguageCode();
            return this;
        }

        public Builder clearLocality() {
            this.copyOnWrite();
            ((PostalAddress)this.instance).clearLocality();
            return this;
        }

        public Builder clearOrganization() {
            this.copyOnWrite();
            ((PostalAddress)this.instance).clearOrganization();
            return this;
        }

        public Builder clearPostalCode() {
            this.copyOnWrite();
            ((PostalAddress)this.instance).clearPostalCode();
            return this;
        }

        public Builder clearRecipients() {
            this.copyOnWrite();
            ((PostalAddress)this.instance).clearRecipients();
            return this;
        }

        public Builder clearRegionCode() {
            this.copyOnWrite();
            ((PostalAddress)this.instance).clearRegionCode();
            return this;
        }

        public Builder clearRevision() {
            this.copyOnWrite();
            ((PostalAddress)this.instance).clearRevision();
            return this;
        }

        public Builder clearSortingCode() {
            this.copyOnWrite();
            ((PostalAddress)this.instance).clearSortingCode();
            return this;
        }

        public Builder clearSublocality() {
            this.copyOnWrite();
            ((PostalAddress)this.instance).clearSublocality();
            return this;
        }

        public String getAddressLines(int n) {
            return ((PostalAddress)this.instance).getAddressLines(n);
        }

        public ByteString getAddressLinesBytes(int n) {
            return ((PostalAddress)this.instance).getAddressLinesBytes(n);
        }

        public int getAddressLinesCount() {
            return ((PostalAddress)this.instance).getAddressLinesCount();
        }

        public List<String> getAddressLinesList() {
            return Collections.unmodifiableList(((PostalAddress)this.instance).getAddressLinesList());
        }

        public String getAdministrativeArea() {
            return ((PostalAddress)this.instance).getAdministrativeArea();
        }

        public ByteString getAdministrativeAreaBytes() {
            return ((PostalAddress)this.instance).getAdministrativeAreaBytes();
        }

        public String getLanguageCode() {
            return ((PostalAddress)this.instance).getLanguageCode();
        }

        public ByteString getLanguageCodeBytes() {
            return ((PostalAddress)this.instance).getLanguageCodeBytes();
        }

        public String getLocality() {
            return ((PostalAddress)this.instance).getLocality();
        }

        public ByteString getLocalityBytes() {
            return ((PostalAddress)this.instance).getLocalityBytes();
        }

        public String getOrganization() {
            return ((PostalAddress)this.instance).getOrganization();
        }

        public ByteString getOrganizationBytes() {
            return ((PostalAddress)this.instance).getOrganizationBytes();
        }

        public String getPostalCode() {
            return ((PostalAddress)this.instance).getPostalCode();
        }

        public ByteString getPostalCodeBytes() {
            return ((PostalAddress)this.instance).getPostalCodeBytes();
        }

        public String getRecipients(int n) {
            return ((PostalAddress)this.instance).getRecipients(n);
        }

        public ByteString getRecipientsBytes(int n) {
            return ((PostalAddress)this.instance).getRecipientsBytes(n);
        }

        public int getRecipientsCount() {
            return ((PostalAddress)this.instance).getRecipientsCount();
        }

        public List<String> getRecipientsList() {
            return Collections.unmodifiableList(((PostalAddress)this.instance).getRecipientsList());
        }

        public String getRegionCode() {
            return ((PostalAddress)this.instance).getRegionCode();
        }

        public ByteString getRegionCodeBytes() {
            return ((PostalAddress)this.instance).getRegionCodeBytes();
        }

        public int getRevision() {
            return ((PostalAddress)this.instance).getRevision();
        }

        public String getSortingCode() {
            return ((PostalAddress)this.instance).getSortingCode();
        }

        public ByteString getSortingCodeBytes() {
            return ((PostalAddress)this.instance).getSortingCodeBytes();
        }

        public String getSublocality() {
            return ((PostalAddress)this.instance).getSublocality();
        }

        public ByteString getSublocalityBytes() {
            return ((PostalAddress)this.instance).getSublocalityBytes();
        }

        public Builder setAddressLines(int n, String string) {
            this.copyOnWrite();
            ((PostalAddress)this.instance).setAddressLines(n, string);
            return this;
        }

        public Builder setAdministrativeArea(String string) {
            this.copyOnWrite();
            ((PostalAddress)this.instance).setAdministrativeArea(string);
            return this;
        }

        public Builder setAdministrativeAreaBytes(ByteString byteString) {
            this.copyOnWrite();
            ((PostalAddress)this.instance).setAdministrativeAreaBytes(byteString);
            return this;
        }

        public Builder setLanguageCode(String string) {
            this.copyOnWrite();
            ((PostalAddress)this.instance).setLanguageCode(string);
            return this;
        }

        public Builder setLanguageCodeBytes(ByteString byteString) {
            this.copyOnWrite();
            ((PostalAddress)this.instance).setLanguageCodeBytes(byteString);
            return this;
        }

        public Builder setLocality(String string) {
            this.copyOnWrite();
            ((PostalAddress)this.instance).setLocality(string);
            return this;
        }

        public Builder setLocalityBytes(ByteString byteString) {
            this.copyOnWrite();
            ((PostalAddress)this.instance).setLocalityBytes(byteString);
            return this;
        }

        public Builder setOrganization(String string) {
            this.copyOnWrite();
            ((PostalAddress)this.instance).setOrganization(string);
            return this;
        }

        public Builder setOrganizationBytes(ByteString byteString) {
            this.copyOnWrite();
            ((PostalAddress)this.instance).setOrganizationBytes(byteString);
            return this;
        }

        public Builder setPostalCode(String string) {
            this.copyOnWrite();
            ((PostalAddress)this.instance).setPostalCode(string);
            return this;
        }

        public Builder setPostalCodeBytes(ByteString byteString) {
            this.copyOnWrite();
            ((PostalAddress)this.instance).setPostalCodeBytes(byteString);
            return this;
        }

        public Builder setRecipients(int n, String string) {
            this.copyOnWrite();
            ((PostalAddress)this.instance).setRecipients(n, string);
            return this;
        }

        public Builder setRegionCode(String string) {
            this.copyOnWrite();
            ((PostalAddress)this.instance).setRegionCode(string);
            return this;
        }

        public Builder setRegionCodeBytes(ByteString byteString) {
            this.copyOnWrite();
            ((PostalAddress)this.instance).setRegionCodeBytes(byteString);
            return this;
        }

        public Builder setRevision(int n) {
            this.copyOnWrite();
            ((PostalAddress)this.instance).setRevision(n);
            return this;
        }

        public Builder setSortingCode(String string) {
            this.copyOnWrite();
            ((PostalAddress)this.instance).setSortingCode(string);
            return this;
        }

        public Builder setSortingCodeBytes(ByteString byteString) {
            this.copyOnWrite();
            ((PostalAddress)this.instance).setSortingCodeBytes(byteString);
            return this;
        }

        public Builder setSublocality(String string) {
            this.copyOnWrite();
            ((PostalAddress)this.instance).setSublocality(string);
            return this;
        }

        public Builder setSublocalityBytes(ByteString byteString) {
            this.copyOnWrite();
            ((PostalAddress)this.instance).setSublocalityBytes(byteString);
            return this;
        }
    }

}

