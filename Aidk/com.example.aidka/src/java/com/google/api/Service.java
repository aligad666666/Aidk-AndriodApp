/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessageLite
 *  com.google.protobuf.Api
 *  com.google.protobuf.Api$Builder
 *  com.google.protobuf.ApiOrBuilder
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.CodedOutputStream
 *  com.google.protobuf.Enum
 *  com.google.protobuf.Enum$Builder
 *  com.google.protobuf.EnumOrBuilder
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageLite
 *  com.google.protobuf.GeneratedMessageLite$Builder
 *  com.google.protobuf.GeneratedMessageLite$MethodToInvoke
 *  com.google.protobuf.Internal
 *  com.google.protobuf.Internal$ProtobufList
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.Parser
 *  com.google.protobuf.Type
 *  com.google.protobuf.Type$Builder
 *  com.google.protobuf.TypeOrBuilder
 *  com.google.protobuf.UInt32Value
 *  com.google.protobuf.UInt32Value$Builder
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.Iterable
 *  java.lang.NoSuchFieldError
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Collections
 *  java.util.List
 */
package com.google.api;

import com.google.api.Authentication;
import com.google.api.Backend;
import com.google.api.Billing;
import com.google.api.Context;
import com.google.api.Control;
import com.google.api.Documentation;
import com.google.api.Endpoint;
import com.google.api.EndpointOrBuilder;
import com.google.api.Experimental;
import com.google.api.Http;
import com.google.api.LogDescriptor;
import com.google.api.LogDescriptorOrBuilder;
import com.google.api.Logging;
import com.google.api.MetricDescriptor;
import com.google.api.MetricDescriptorOrBuilder;
import com.google.api.MonitoredResourceDescriptor;
import com.google.api.MonitoredResourceDescriptorOrBuilder;
import com.google.api.Monitoring;
import com.google.api.Quota;
import com.google.api.ServiceOrBuilder;
import com.google.api.SourceInfo;
import com.google.api.SystemParameters;
import com.google.api.Usage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.Api;
import com.google.protobuf.ApiOrBuilder;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Enum;
import com.google.protobuf.EnumOrBuilder;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.Type;
import com.google.protobuf.TypeOrBuilder;
import com.google.protobuf.UInt32Value;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

public final class Service
extends GeneratedMessageLite<Service, Builder>
implements ServiceOrBuilder {
    public static final int APIS_FIELD_NUMBER = 3;
    public static final int AUTHENTICATION_FIELD_NUMBER = 11;
    public static final int BACKEND_FIELD_NUMBER = 8;
    public static final int BILLING_FIELD_NUMBER = 26;
    public static final int CONFIG_VERSION_FIELD_NUMBER = 20;
    public static final int CONTEXT_FIELD_NUMBER = 12;
    public static final int CONTROL_FIELD_NUMBER = 21;
    private static final Service DEFAULT_INSTANCE = new Service();
    public static final int DOCUMENTATION_FIELD_NUMBER = 6;
    public static final int ENDPOINTS_FIELD_NUMBER = 18;
    public static final int ENUMS_FIELD_NUMBER = 5;
    public static final int EXPERIMENTAL_FIELD_NUMBER = 101;
    public static final int HTTP_FIELD_NUMBER = 9;
    public static final int ID_FIELD_NUMBER = 33;
    public static final int LOGGING_FIELD_NUMBER = 27;
    public static final int LOGS_FIELD_NUMBER = 23;
    public static final int METRICS_FIELD_NUMBER = 24;
    public static final int MONITORED_RESOURCES_FIELD_NUMBER = 25;
    public static final int MONITORING_FIELD_NUMBER = 28;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile Parser<Service> PARSER;
    public static final int PRODUCER_PROJECT_ID_FIELD_NUMBER = 22;
    public static final int QUOTA_FIELD_NUMBER = 10;
    public static final int SOURCE_INFO_FIELD_NUMBER = 37;
    public static final int SYSTEM_PARAMETERS_FIELD_NUMBER = 29;
    public static final int TITLE_FIELD_NUMBER = 2;
    public static final int TYPES_FIELD_NUMBER = 4;
    public static final int USAGE_FIELD_NUMBER = 15;
    private Internal.ProtobufList<Api> apis_ = Service.emptyProtobufList();
    private Authentication authentication_;
    private Backend backend_;
    private Billing billing_;
    private int bitField0_;
    private UInt32Value configVersion_;
    private Context context_;
    private Control control_;
    private Documentation documentation_;
    private Internal.ProtobufList<Endpoint> endpoints_ = Service.emptyProtobufList();
    private Internal.ProtobufList<Enum> enums_ = Service.emptyProtobufList();
    private Experimental experimental_;
    private Http http_;
    private String id_ = "";
    private Logging logging_;
    private Internal.ProtobufList<LogDescriptor> logs_ = Service.emptyProtobufList();
    private Internal.ProtobufList<MetricDescriptor> metrics_ = Service.emptyProtobufList();
    private Internal.ProtobufList<MonitoredResourceDescriptor> monitoredResources_ = Service.emptyProtobufList();
    private Monitoring monitoring_;
    private String name_ = "";
    private String producerProjectId_ = "";
    private Quota quota_;
    private SourceInfo sourceInfo_;
    private SystemParameters systemParameters_;
    private String title_ = "";
    private Internal.ProtobufList<Type> types_ = Service.emptyProtobufList();
    private Usage usage_;

    static {
        DEFAULT_INSTANCE.makeImmutable();
    }

    private Service() {
    }

    private void addAllApis(Iterable<? extends Api> iterable) {
        this.ensureApisIsMutable();
        AbstractMessageLite.addAll(iterable, this.apis_);
    }

    private void addAllEndpoints(Iterable<? extends Endpoint> iterable) {
        this.ensureEndpointsIsMutable();
        AbstractMessageLite.addAll(iterable, this.endpoints_);
    }

    private void addAllEnums(Iterable<? extends Enum> iterable) {
        this.ensureEnumsIsMutable();
        AbstractMessageLite.addAll(iterable, this.enums_);
    }

    private void addAllLogs(Iterable<? extends LogDescriptor> iterable) {
        this.ensureLogsIsMutable();
        AbstractMessageLite.addAll(iterable, this.logs_);
    }

    private void addAllMetrics(Iterable<? extends MetricDescriptor> iterable) {
        this.ensureMetricsIsMutable();
        AbstractMessageLite.addAll(iterable, this.metrics_);
    }

    private void addAllMonitoredResources(Iterable<? extends MonitoredResourceDescriptor> iterable) {
        this.ensureMonitoredResourcesIsMutable();
        AbstractMessageLite.addAll(iterable, this.monitoredResources_);
    }

    private void addAllTypes(Iterable<? extends Type> iterable) {
        this.ensureTypesIsMutable();
        AbstractMessageLite.addAll(iterable, this.types_);
    }

    private void addApis(int n, Api.Builder builder) {
        this.ensureApisIsMutable();
        this.apis_.add(n, (Object)((Api)builder.build()));
    }

    private void addApis(int n, Api api) {
        if (api != null) {
            this.ensureApisIsMutable();
            this.apis_.add(n, (Object)api);
            return;
        }
        throw new NullPointerException();
    }

    private void addApis(Api.Builder builder) {
        this.ensureApisIsMutable();
        this.apis_.add((Object)((Api)builder.build()));
    }

    private void addApis(Api api) {
        if (api != null) {
            this.ensureApisIsMutable();
            this.apis_.add((Object)api);
            return;
        }
        throw new NullPointerException();
    }

    private void addEndpoints(int n, Endpoint.Builder builder) {
        this.ensureEndpointsIsMutable();
        this.endpoints_.add(n, (Object)((Endpoint)builder.build()));
    }

    private void addEndpoints(int n, Endpoint endpoint) {
        if (endpoint != null) {
            this.ensureEndpointsIsMutable();
            this.endpoints_.add(n, (Object)endpoint);
            return;
        }
        throw new NullPointerException();
    }

    private void addEndpoints(Endpoint.Builder builder) {
        this.ensureEndpointsIsMutable();
        this.endpoints_.add((Object)((Endpoint)builder.build()));
    }

    private void addEndpoints(Endpoint endpoint) {
        if (endpoint != null) {
            this.ensureEndpointsIsMutable();
            this.endpoints_.add((Object)endpoint);
            return;
        }
        throw new NullPointerException();
    }

    private void addEnums(int n, Enum.Builder builder) {
        this.ensureEnumsIsMutable();
        this.enums_.add(n, (Object)((Enum)builder.build()));
    }

    private void addEnums(int n, Enum enum_) {
        if (enum_ != null) {
            this.ensureEnumsIsMutable();
            this.enums_.add(n, (Object)enum_);
            return;
        }
        throw new NullPointerException();
    }

    private void addEnums(Enum.Builder builder) {
        this.ensureEnumsIsMutable();
        this.enums_.add((Object)((Enum)builder.build()));
    }

    private void addEnums(Enum enum_) {
        if (enum_ != null) {
            this.ensureEnumsIsMutable();
            this.enums_.add((Object)enum_);
            return;
        }
        throw new NullPointerException();
    }

    private void addLogs(int n, LogDescriptor.Builder builder) {
        this.ensureLogsIsMutable();
        this.logs_.add(n, (Object)((LogDescriptor)builder.build()));
    }

    private void addLogs(int n, LogDescriptor logDescriptor) {
        if (logDescriptor != null) {
            this.ensureLogsIsMutable();
            this.logs_.add(n, (Object)logDescriptor);
            return;
        }
        throw new NullPointerException();
    }

    private void addLogs(LogDescriptor.Builder builder) {
        this.ensureLogsIsMutable();
        this.logs_.add((Object)((LogDescriptor)builder.build()));
    }

    private void addLogs(LogDescriptor logDescriptor) {
        if (logDescriptor != null) {
            this.ensureLogsIsMutable();
            this.logs_.add((Object)logDescriptor);
            return;
        }
        throw new NullPointerException();
    }

    private void addMetrics(int n, MetricDescriptor.Builder builder) {
        this.ensureMetricsIsMutable();
        this.metrics_.add(n, (Object)((MetricDescriptor)builder.build()));
    }

    private void addMetrics(int n, MetricDescriptor metricDescriptor) {
        if (metricDescriptor != null) {
            this.ensureMetricsIsMutable();
            this.metrics_.add(n, (Object)metricDescriptor);
            return;
        }
        throw new NullPointerException();
    }

    private void addMetrics(MetricDescriptor.Builder builder) {
        this.ensureMetricsIsMutable();
        this.metrics_.add((Object)((MetricDescriptor)builder.build()));
    }

    private void addMetrics(MetricDescriptor metricDescriptor) {
        if (metricDescriptor != null) {
            this.ensureMetricsIsMutable();
            this.metrics_.add((Object)metricDescriptor);
            return;
        }
        throw new NullPointerException();
    }

    private void addMonitoredResources(int n, MonitoredResourceDescriptor.Builder builder) {
        this.ensureMonitoredResourcesIsMutable();
        this.monitoredResources_.add(n, (Object)((MonitoredResourceDescriptor)builder.build()));
    }

    private void addMonitoredResources(int n, MonitoredResourceDescriptor monitoredResourceDescriptor) {
        if (monitoredResourceDescriptor != null) {
            this.ensureMonitoredResourcesIsMutable();
            this.monitoredResources_.add(n, (Object)monitoredResourceDescriptor);
            return;
        }
        throw new NullPointerException();
    }

    private void addMonitoredResources(MonitoredResourceDescriptor.Builder builder) {
        this.ensureMonitoredResourcesIsMutable();
        this.monitoredResources_.add((Object)((MonitoredResourceDescriptor)builder.build()));
    }

    private void addMonitoredResources(MonitoredResourceDescriptor monitoredResourceDescriptor) {
        if (monitoredResourceDescriptor != null) {
            this.ensureMonitoredResourcesIsMutable();
            this.monitoredResources_.add((Object)monitoredResourceDescriptor);
            return;
        }
        throw new NullPointerException();
    }

    private void addTypes(int n, Type.Builder builder) {
        this.ensureTypesIsMutable();
        this.types_.add(n, (Object)((Type)builder.build()));
    }

    private void addTypes(int n, Type type) {
        if (type != null) {
            this.ensureTypesIsMutable();
            this.types_.add(n, (Object)type);
            return;
        }
        throw new NullPointerException();
    }

    private void addTypes(Type.Builder builder) {
        this.ensureTypesIsMutable();
        this.types_.add((Object)((Type)builder.build()));
    }

    private void addTypes(Type type) {
        if (type != null) {
            this.ensureTypesIsMutable();
            this.types_.add((Object)type);
            return;
        }
        throw new NullPointerException();
    }

    private void clearApis() {
        this.apis_ = Service.emptyProtobufList();
    }

    private void clearAuthentication() {
        this.authentication_ = null;
    }

    private void clearBackend() {
        this.backend_ = null;
    }

    private void clearBilling() {
        this.billing_ = null;
    }

    private void clearConfigVersion() {
        this.configVersion_ = null;
    }

    private void clearContext() {
        this.context_ = null;
    }

    private void clearControl() {
        this.control_ = null;
    }

    private void clearDocumentation() {
        this.documentation_ = null;
    }

    private void clearEndpoints() {
        this.endpoints_ = Service.emptyProtobufList();
    }

    private void clearEnums() {
        this.enums_ = Service.emptyProtobufList();
    }

    private void clearExperimental() {
        this.experimental_ = null;
    }

    private void clearHttp() {
        this.http_ = null;
    }

    private void clearId() {
        this.id_ = Service.getDefaultInstance().getId();
    }

    private void clearLogging() {
        this.logging_ = null;
    }

    private void clearLogs() {
        this.logs_ = Service.emptyProtobufList();
    }

    private void clearMetrics() {
        this.metrics_ = Service.emptyProtobufList();
    }

    private void clearMonitoredResources() {
        this.monitoredResources_ = Service.emptyProtobufList();
    }

    private void clearMonitoring() {
        this.monitoring_ = null;
    }

    private void clearName() {
        this.name_ = Service.getDefaultInstance().getName();
    }

    private void clearProducerProjectId() {
        this.producerProjectId_ = Service.getDefaultInstance().getProducerProjectId();
    }

    private void clearQuota() {
        this.quota_ = null;
    }

    private void clearSourceInfo() {
        this.sourceInfo_ = null;
    }

    private void clearSystemParameters() {
        this.systemParameters_ = null;
    }

    private void clearTitle() {
        this.title_ = Service.getDefaultInstance().getTitle();
    }

    private void clearTypes() {
        this.types_ = Service.emptyProtobufList();
    }

    private void clearUsage() {
        this.usage_ = null;
    }

    private void ensureApisIsMutable() {
        if (!this.apis_.isModifiable()) {
            this.apis_ = GeneratedMessageLite.mutableCopy(this.apis_);
        }
    }

    private void ensureEndpointsIsMutable() {
        if (!this.endpoints_.isModifiable()) {
            this.endpoints_ = GeneratedMessageLite.mutableCopy(this.endpoints_);
        }
    }

    private void ensureEnumsIsMutable() {
        if (!this.enums_.isModifiable()) {
            this.enums_ = GeneratedMessageLite.mutableCopy(this.enums_);
        }
    }

    private void ensureLogsIsMutable() {
        if (!this.logs_.isModifiable()) {
            this.logs_ = GeneratedMessageLite.mutableCopy(this.logs_);
        }
    }

    private void ensureMetricsIsMutable() {
        if (!this.metrics_.isModifiable()) {
            this.metrics_ = GeneratedMessageLite.mutableCopy(this.metrics_);
        }
    }

    private void ensureMonitoredResourcesIsMutable() {
        if (!this.monitoredResources_.isModifiable()) {
            this.monitoredResources_ = GeneratedMessageLite.mutableCopy(this.monitoredResources_);
        }
    }

    private void ensureTypesIsMutable() {
        if (!this.types_.isModifiable()) {
            this.types_ = GeneratedMessageLite.mutableCopy(this.types_);
        }
    }

    public static Service getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeAuthentication(Authentication authentication) {
        Authentication authentication2 = this.authentication_;
        if (authentication2 != null && authentication2 != Authentication.getDefaultInstance()) {
            this.authentication_ = (Authentication)((Authentication.Builder)Authentication.newBuilder(this.authentication_).mergeFrom((GeneratedMessageLite)authentication)).buildPartial();
            return;
        }
        this.authentication_ = authentication;
    }

    private void mergeBackend(Backend backend) {
        Backend backend2 = this.backend_;
        if (backend2 != null && backend2 != Backend.getDefaultInstance()) {
            this.backend_ = (Backend)((Backend.Builder)Backend.newBuilder(this.backend_).mergeFrom((GeneratedMessageLite)backend)).buildPartial();
            return;
        }
        this.backend_ = backend;
    }

    private void mergeBilling(Billing billing) {
        Billing billing2 = this.billing_;
        if (billing2 != null && billing2 != Billing.getDefaultInstance()) {
            this.billing_ = (Billing)((Billing.Builder)Billing.newBuilder(this.billing_).mergeFrom((GeneratedMessageLite)billing)).buildPartial();
            return;
        }
        this.billing_ = billing;
    }

    private void mergeConfigVersion(UInt32Value uInt32Value) {
        UInt32Value uInt32Value2 = this.configVersion_;
        if (uInt32Value2 != null && uInt32Value2 != UInt32Value.getDefaultInstance()) {
            this.configVersion_ = (UInt32Value)((UInt32Value.Builder)UInt32Value.newBuilder((UInt32Value)this.configVersion_).mergeFrom((GeneratedMessageLite)uInt32Value)).buildPartial();
            return;
        }
        this.configVersion_ = uInt32Value;
    }

    private void mergeContext(Context context) {
        Context context2 = this.context_;
        if (context2 != null && context2 != Context.getDefaultInstance()) {
            this.context_ = (Context)((Context.Builder)Context.newBuilder(this.context_).mergeFrom((GeneratedMessageLite)context)).buildPartial();
            return;
        }
        this.context_ = context;
    }

    private void mergeControl(Control control) {
        Control control2 = this.control_;
        if (control2 != null && control2 != Control.getDefaultInstance()) {
            this.control_ = (Control)((Control.Builder)Control.newBuilder(this.control_).mergeFrom((GeneratedMessageLite)control)).buildPartial();
            return;
        }
        this.control_ = control;
    }

    private void mergeDocumentation(Documentation documentation) {
        Documentation documentation2 = this.documentation_;
        if (documentation2 != null && documentation2 != Documentation.getDefaultInstance()) {
            this.documentation_ = (Documentation)((Documentation.Builder)Documentation.newBuilder(this.documentation_).mergeFrom((GeneratedMessageLite)documentation)).buildPartial();
            return;
        }
        this.documentation_ = documentation;
    }

    private void mergeExperimental(Experimental experimental) {
        Experimental experimental2 = this.experimental_;
        if (experimental2 != null && experimental2 != Experimental.getDefaultInstance()) {
            this.experimental_ = (Experimental)((Experimental.Builder)Experimental.newBuilder(this.experimental_).mergeFrom((GeneratedMessageLite)experimental)).buildPartial();
            return;
        }
        this.experimental_ = experimental;
    }

    private void mergeHttp(Http http) {
        Http http2 = this.http_;
        if (http2 != null && http2 != Http.getDefaultInstance()) {
            this.http_ = (Http)((Http.Builder)Http.newBuilder(this.http_).mergeFrom((GeneratedMessageLite)http)).buildPartial();
            return;
        }
        this.http_ = http;
    }

    private void mergeLogging(Logging logging) {
        Logging logging2 = this.logging_;
        if (logging2 != null && logging2 != Logging.getDefaultInstance()) {
            this.logging_ = (Logging)((Logging.Builder)Logging.newBuilder(this.logging_).mergeFrom((GeneratedMessageLite)logging)).buildPartial();
            return;
        }
        this.logging_ = logging;
    }

    private void mergeMonitoring(Monitoring monitoring) {
        Monitoring monitoring2 = this.monitoring_;
        if (monitoring2 != null && monitoring2 != Monitoring.getDefaultInstance()) {
            this.monitoring_ = (Monitoring)((Monitoring.Builder)Monitoring.newBuilder(this.monitoring_).mergeFrom((GeneratedMessageLite)monitoring)).buildPartial();
            return;
        }
        this.monitoring_ = monitoring;
    }

    private void mergeQuota(Quota quota) {
        Quota quota2 = this.quota_;
        if (quota2 != null && quota2 != Quota.getDefaultInstance()) {
            this.quota_ = (Quota)((Quota.Builder)Quota.newBuilder(this.quota_).mergeFrom((GeneratedMessageLite)quota)).buildPartial();
            return;
        }
        this.quota_ = quota;
    }

    private void mergeSourceInfo(SourceInfo sourceInfo) {
        SourceInfo sourceInfo2 = this.sourceInfo_;
        if (sourceInfo2 != null && sourceInfo2 != SourceInfo.getDefaultInstance()) {
            this.sourceInfo_ = (SourceInfo)((SourceInfo.Builder)SourceInfo.newBuilder(this.sourceInfo_).mergeFrom((GeneratedMessageLite)sourceInfo)).buildPartial();
            return;
        }
        this.sourceInfo_ = sourceInfo;
    }

    private void mergeSystemParameters(SystemParameters systemParameters) {
        SystemParameters systemParameters2 = this.systemParameters_;
        if (systemParameters2 != null && systemParameters2 != SystemParameters.getDefaultInstance()) {
            this.systemParameters_ = (SystemParameters)((SystemParameters.Builder)SystemParameters.newBuilder(this.systemParameters_).mergeFrom((GeneratedMessageLite)systemParameters)).buildPartial();
            return;
        }
        this.systemParameters_ = systemParameters;
    }

    private void mergeUsage(Usage usage) {
        Usage usage2 = this.usage_;
        if (usage2 != null && usage2 != Usage.getDefaultInstance()) {
            this.usage_ = (Usage)((Usage.Builder)Usage.newBuilder(this.usage_).mergeFrom((GeneratedMessageLite)usage)).buildPartial();
            return;
        }
        this.usage_ = usage;
    }

    public static Builder newBuilder() {
        return (Builder)DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(Service service) {
        return (Builder)((Builder)DEFAULT_INSTANCE.toBuilder()).mergeFrom((GeneratedMessageLite)service);
    }

    public static Service parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Service)Service.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Service parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Service)Service.parseDelimitedFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Service parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Service)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString);
    }

    public static Service parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Service)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (ByteString)byteString, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Service parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Service)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream);
    }

    public static Service parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Service)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Service parseFrom(InputStream inputStream) throws IOException {
        return (Service)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream);
    }

    public static Service parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Service)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Service parseFrom(byte[] arrby) throws InvalidProtocolBufferException {
        return (Service)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby);
    }

    public static Service parseFrom(byte[] arrby, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Service)GeneratedMessageLite.parseFrom((GeneratedMessageLite)DEFAULT_INSTANCE, (byte[])arrby, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Parser<Service> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeApis(int n) {
        this.ensureApisIsMutable();
        this.apis_.remove(n);
    }

    private void removeEndpoints(int n) {
        this.ensureEndpointsIsMutable();
        this.endpoints_.remove(n);
    }

    private void removeEnums(int n) {
        this.ensureEnumsIsMutable();
        this.enums_.remove(n);
    }

    private void removeLogs(int n) {
        this.ensureLogsIsMutable();
        this.logs_.remove(n);
    }

    private void removeMetrics(int n) {
        this.ensureMetricsIsMutable();
        this.metrics_.remove(n);
    }

    private void removeMonitoredResources(int n) {
        this.ensureMonitoredResourcesIsMutable();
        this.monitoredResources_.remove(n);
    }

    private void removeTypes(int n) {
        this.ensureTypesIsMutable();
        this.types_.remove(n);
    }

    private void setApis(int n, Api.Builder builder) {
        this.ensureApisIsMutable();
        this.apis_.set(n, (Object)((Api)builder.build()));
    }

    private void setApis(int n, Api api) {
        if (api != null) {
            this.ensureApisIsMutable();
            this.apis_.set(n, (Object)api);
            return;
        }
        throw new NullPointerException();
    }

    private void setAuthentication(Authentication.Builder builder) {
        this.authentication_ = (Authentication)builder.build();
    }

    private void setAuthentication(Authentication authentication) {
        if (authentication != null) {
            this.authentication_ = authentication;
            return;
        }
        throw new NullPointerException();
    }

    private void setBackend(Backend.Builder builder) {
        this.backend_ = (Backend)builder.build();
    }

    private void setBackend(Backend backend) {
        if (backend != null) {
            this.backend_ = backend;
            return;
        }
        throw new NullPointerException();
    }

    private void setBilling(Billing.Builder builder) {
        this.billing_ = (Billing)builder.build();
    }

    private void setBilling(Billing billing) {
        if (billing != null) {
            this.billing_ = billing;
            return;
        }
        throw new NullPointerException();
    }

    private void setConfigVersion(UInt32Value.Builder builder) {
        this.configVersion_ = (UInt32Value)builder.build();
    }

    private void setConfigVersion(UInt32Value uInt32Value) {
        if (uInt32Value != null) {
            this.configVersion_ = uInt32Value;
            return;
        }
        throw new NullPointerException();
    }

    private void setContext(Context.Builder builder) {
        this.context_ = (Context)builder.build();
    }

    private void setContext(Context context) {
        if (context != null) {
            this.context_ = context;
            return;
        }
        throw new NullPointerException();
    }

    private void setControl(Control.Builder builder) {
        this.control_ = (Control)builder.build();
    }

    private void setControl(Control control) {
        if (control != null) {
            this.control_ = control;
            return;
        }
        throw new NullPointerException();
    }

    private void setDocumentation(Documentation.Builder builder) {
        this.documentation_ = (Documentation)builder.build();
    }

    private void setDocumentation(Documentation documentation) {
        if (documentation != null) {
            this.documentation_ = documentation;
            return;
        }
        throw new NullPointerException();
    }

    private void setEndpoints(int n, Endpoint.Builder builder) {
        this.ensureEndpointsIsMutable();
        this.endpoints_.set(n, (Object)((Endpoint)builder.build()));
    }

    private void setEndpoints(int n, Endpoint endpoint) {
        if (endpoint != null) {
            this.ensureEndpointsIsMutable();
            this.endpoints_.set(n, (Object)endpoint);
            return;
        }
        throw new NullPointerException();
    }

    private void setEnums(int n, Enum.Builder builder) {
        this.ensureEnumsIsMutable();
        this.enums_.set(n, (Object)((Enum)builder.build()));
    }

    private void setEnums(int n, Enum enum_) {
        if (enum_ != null) {
            this.ensureEnumsIsMutable();
            this.enums_.set(n, (Object)enum_);
            return;
        }
        throw new NullPointerException();
    }

    private void setExperimental(Experimental.Builder builder) {
        this.experimental_ = (Experimental)builder.build();
    }

    private void setExperimental(Experimental experimental) {
        if (experimental != null) {
            this.experimental_ = experimental;
            return;
        }
        throw new NullPointerException();
    }

    private void setHttp(Http.Builder builder) {
        this.http_ = (Http)builder.build();
    }

    private void setHttp(Http http) {
        if (http != null) {
            this.http_ = http;
            return;
        }
        throw new NullPointerException();
    }

    private void setId(String string2) {
        if (string2 != null) {
            this.id_ = string2;
            return;
        }
        throw new NullPointerException();
    }

    private void setIdBytes(ByteString byteString) {
        if (byteString != null) {
            Service.checkByteStringIsUtf8((ByteString)byteString);
            this.id_ = byteString.toStringUtf8();
            return;
        }
        throw new NullPointerException();
    }

    private void setLogging(Logging.Builder builder) {
        this.logging_ = (Logging)builder.build();
    }

    private void setLogging(Logging logging) {
        if (logging != null) {
            this.logging_ = logging;
            return;
        }
        throw new NullPointerException();
    }

    private void setLogs(int n, LogDescriptor.Builder builder) {
        this.ensureLogsIsMutable();
        this.logs_.set(n, (Object)((LogDescriptor)builder.build()));
    }

    private void setLogs(int n, LogDescriptor logDescriptor) {
        if (logDescriptor != null) {
            this.ensureLogsIsMutable();
            this.logs_.set(n, (Object)logDescriptor);
            return;
        }
        throw new NullPointerException();
    }

    private void setMetrics(int n, MetricDescriptor.Builder builder) {
        this.ensureMetricsIsMutable();
        this.metrics_.set(n, (Object)((MetricDescriptor)builder.build()));
    }

    private void setMetrics(int n, MetricDescriptor metricDescriptor) {
        if (metricDescriptor != null) {
            this.ensureMetricsIsMutable();
            this.metrics_.set(n, (Object)metricDescriptor);
            return;
        }
        throw new NullPointerException();
    }

    private void setMonitoredResources(int n, MonitoredResourceDescriptor.Builder builder) {
        this.ensureMonitoredResourcesIsMutable();
        this.monitoredResources_.set(n, (Object)((MonitoredResourceDescriptor)builder.build()));
    }

    private void setMonitoredResources(int n, MonitoredResourceDescriptor monitoredResourceDescriptor) {
        if (monitoredResourceDescriptor != null) {
            this.ensureMonitoredResourcesIsMutable();
            this.monitoredResources_.set(n, (Object)monitoredResourceDescriptor);
            return;
        }
        throw new NullPointerException();
    }

    private void setMonitoring(Monitoring.Builder builder) {
        this.monitoring_ = (Monitoring)builder.build();
    }

    private void setMonitoring(Monitoring monitoring) {
        if (monitoring != null) {
            this.monitoring_ = monitoring;
            return;
        }
        throw new NullPointerException();
    }

    private void setName(String string2) {
        if (string2 != null) {
            this.name_ = string2;
            return;
        }
        throw new NullPointerException();
    }

    private void setNameBytes(ByteString byteString) {
        if (byteString != null) {
            Service.checkByteStringIsUtf8((ByteString)byteString);
            this.name_ = byteString.toStringUtf8();
            return;
        }
        throw new NullPointerException();
    }

    private void setProducerProjectId(String string2) {
        if (string2 != null) {
            this.producerProjectId_ = string2;
            return;
        }
        throw new NullPointerException();
    }

    private void setProducerProjectIdBytes(ByteString byteString) {
        if (byteString != null) {
            Service.checkByteStringIsUtf8((ByteString)byteString);
            this.producerProjectId_ = byteString.toStringUtf8();
            return;
        }
        throw new NullPointerException();
    }

    private void setQuota(Quota.Builder builder) {
        this.quota_ = (Quota)builder.build();
    }

    private void setQuota(Quota quota) {
        if (quota != null) {
            this.quota_ = quota;
            return;
        }
        throw new NullPointerException();
    }

    private void setSourceInfo(SourceInfo.Builder builder) {
        this.sourceInfo_ = (SourceInfo)builder.build();
    }

    private void setSourceInfo(SourceInfo sourceInfo) {
        if (sourceInfo != null) {
            this.sourceInfo_ = sourceInfo;
            return;
        }
        throw new NullPointerException();
    }

    private void setSystemParameters(SystemParameters.Builder builder) {
        this.systemParameters_ = (SystemParameters)builder.build();
    }

    private void setSystemParameters(SystemParameters systemParameters) {
        if (systemParameters != null) {
            this.systemParameters_ = systemParameters;
            return;
        }
        throw new NullPointerException();
    }

    private void setTitle(String string2) {
        if (string2 != null) {
            this.title_ = string2;
            return;
        }
        throw new NullPointerException();
    }

    private void setTitleBytes(ByteString byteString) {
        if (byteString != null) {
            Service.checkByteStringIsUtf8((ByteString)byteString);
            this.title_ = byteString.toStringUtf8();
            return;
        }
        throw new NullPointerException();
    }

    private void setTypes(int n, Type.Builder builder) {
        this.ensureTypesIsMutable();
        this.types_.set(n, (Object)((Type)builder.build()));
    }

    private void setTypes(int n, Type type) {
        if (type != null) {
            this.ensureTypesIsMutable();
            this.types_.set(n, (Object)type);
            return;
        }
        throw new NullPointerException();
    }

    private void setUsage(Usage.Builder builder) {
        this.usage_ = (Usage)builder.build();
    }

    private void setUsage(Usage usage) {
        if (usage != null) {
            this.usage_ = usage;
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

    @Override
    public Api getApis(int n) {
        return (Api)this.apis_.get(n);
    }

    @Override
    public int getApisCount() {
        return this.apis_.size();
    }

    @Override
    public List<Api> getApisList() {
        return this.apis_;
    }

    public ApiOrBuilder getApisOrBuilder(int n) {
        return (ApiOrBuilder)this.apis_.get(n);
    }

    public List<? extends ApiOrBuilder> getApisOrBuilderList() {
        return this.apis_;
    }

    @Override
    public Authentication getAuthentication() {
        Authentication authentication = this.authentication_;
        if (authentication == null) {
            authentication = Authentication.getDefaultInstance();
        }
        return authentication;
    }

    @Override
    public Backend getBackend() {
        Backend backend = this.backend_;
        if (backend == null) {
            backend = Backend.getDefaultInstance();
        }
        return backend;
    }

    @Override
    public Billing getBilling() {
        Billing billing = this.billing_;
        if (billing == null) {
            billing = Billing.getDefaultInstance();
        }
        return billing;
    }

    @Override
    public UInt32Value getConfigVersion() {
        UInt32Value uInt32Value = this.configVersion_;
        if (uInt32Value == null) {
            uInt32Value = UInt32Value.getDefaultInstance();
        }
        return uInt32Value;
    }

    @Override
    public Context getContext() {
        Context context = this.context_;
        if (context == null) {
            context = Context.getDefaultInstance();
        }
        return context;
    }

    @Override
    public Control getControl() {
        Control control = this.control_;
        if (control == null) {
            control = Control.getDefaultInstance();
        }
        return control;
    }

    @Override
    public Documentation getDocumentation() {
        Documentation documentation = this.documentation_;
        if (documentation == null) {
            documentation = Documentation.getDefaultInstance();
        }
        return documentation;
    }

    @Override
    public Endpoint getEndpoints(int n) {
        return (Endpoint)this.endpoints_.get(n);
    }

    @Override
    public int getEndpointsCount() {
        return this.endpoints_.size();
    }

    @Override
    public List<Endpoint> getEndpointsList() {
        return this.endpoints_;
    }

    public EndpointOrBuilder getEndpointsOrBuilder(int n) {
        return (EndpointOrBuilder)this.endpoints_.get(n);
    }

    public List<? extends EndpointOrBuilder> getEndpointsOrBuilderList() {
        return this.endpoints_;
    }

    @Override
    public Enum getEnums(int n) {
        return (Enum)this.enums_.get(n);
    }

    @Override
    public int getEnumsCount() {
        return this.enums_.size();
    }

    @Override
    public List<Enum> getEnumsList() {
        return this.enums_;
    }

    public EnumOrBuilder getEnumsOrBuilder(int n) {
        return (EnumOrBuilder)this.enums_.get(n);
    }

    public List<? extends EnumOrBuilder> getEnumsOrBuilderList() {
        return this.enums_;
    }

    @Override
    public Experimental getExperimental() {
        Experimental experimental = this.experimental_;
        if (experimental == null) {
            experimental = Experimental.getDefaultInstance();
        }
        return experimental;
    }

    @Override
    public Http getHttp() {
        Http http = this.http_;
        if (http == null) {
            http = Http.getDefaultInstance();
        }
        return http;
    }

    @Override
    public String getId() {
        return this.id_;
    }

    @Override
    public ByteString getIdBytes() {
        return ByteString.copyFromUtf8((String)this.id_);
    }

    @Override
    public Logging getLogging() {
        Logging logging = this.logging_;
        if (logging == null) {
            logging = Logging.getDefaultInstance();
        }
        return logging;
    }

    @Override
    public LogDescriptor getLogs(int n) {
        return (LogDescriptor)this.logs_.get(n);
    }

    @Override
    public int getLogsCount() {
        return this.logs_.size();
    }

    @Override
    public List<LogDescriptor> getLogsList() {
        return this.logs_;
    }

    public LogDescriptorOrBuilder getLogsOrBuilder(int n) {
        return (LogDescriptorOrBuilder)this.logs_.get(n);
    }

    public List<? extends LogDescriptorOrBuilder> getLogsOrBuilderList() {
        return this.logs_;
    }

    @Override
    public MetricDescriptor getMetrics(int n) {
        return (MetricDescriptor)this.metrics_.get(n);
    }

    @Override
    public int getMetricsCount() {
        return this.metrics_.size();
    }

    @Override
    public List<MetricDescriptor> getMetricsList() {
        return this.metrics_;
    }

    public MetricDescriptorOrBuilder getMetricsOrBuilder(int n) {
        return (MetricDescriptorOrBuilder)this.metrics_.get(n);
    }

    public List<? extends MetricDescriptorOrBuilder> getMetricsOrBuilderList() {
        return this.metrics_;
    }

    @Override
    public MonitoredResourceDescriptor getMonitoredResources(int n) {
        return (MonitoredResourceDescriptor)this.monitoredResources_.get(n);
    }

    @Override
    public int getMonitoredResourcesCount() {
        return this.monitoredResources_.size();
    }

    @Override
    public List<MonitoredResourceDescriptor> getMonitoredResourcesList() {
        return this.monitoredResources_;
    }

    public MonitoredResourceDescriptorOrBuilder getMonitoredResourcesOrBuilder(int n) {
        return (MonitoredResourceDescriptorOrBuilder)this.monitoredResources_.get(n);
    }

    public List<? extends MonitoredResourceDescriptorOrBuilder> getMonitoredResourcesOrBuilderList() {
        return this.monitoredResources_;
    }

    @Override
    public Monitoring getMonitoring() {
        Monitoring monitoring = this.monitoring_;
        if (monitoring == null) {
            monitoring = Monitoring.getDefaultInstance();
        }
        return monitoring;
    }

    @Override
    public String getName() {
        return this.name_;
    }

    @Override
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8((String)this.name_);
    }

    @Override
    public String getProducerProjectId() {
        return this.producerProjectId_;
    }

    @Override
    public ByteString getProducerProjectIdBytes() {
        return ByteString.copyFromUtf8((String)this.producerProjectId_);
    }

    @Override
    public Quota getQuota() {
        Quota quota = this.quota_;
        if (quota == null) {
            quota = Quota.getDefaultInstance();
        }
        return quota;
    }

    public int getSerializedSize() {
        int n = this.memoizedSerializedSize;
        if (n != -1) {
            return n;
        }
        boolean bl = this.name_.isEmpty();
        int n2 = 0;
        if (!bl) {
            n2 = 0 + CodedOutputStream.computeStringSize((int)1, (String)this.getName());
        }
        if (!this.title_.isEmpty()) {
            n2 += CodedOutputStream.computeStringSize((int)2, (String)this.getTitle());
        }
        for (int i = 0; i < this.apis_.size(); ++i) {
            n2 += CodedOutputStream.computeMessageSize((int)3, (MessageLite)((MessageLite)this.apis_.get(i)));
        }
        for (int i = 0; i < this.types_.size(); ++i) {
            n2 += CodedOutputStream.computeMessageSize((int)4, (MessageLite)((MessageLite)this.types_.get(i)));
        }
        for (int i = 0; i < this.enums_.size(); ++i) {
            n2 += CodedOutputStream.computeMessageSize((int)5, (MessageLite)((MessageLite)this.enums_.get(i)));
        }
        if (this.documentation_ != null) {
            n2 += CodedOutputStream.computeMessageSize((int)6, (MessageLite)this.getDocumentation());
        }
        if (this.backend_ != null) {
            n2 += CodedOutputStream.computeMessageSize((int)8, (MessageLite)this.getBackend());
        }
        if (this.http_ != null) {
            n2 += CodedOutputStream.computeMessageSize((int)9, (MessageLite)this.getHttp());
        }
        if (this.quota_ != null) {
            n2 += CodedOutputStream.computeMessageSize((int)10, (MessageLite)this.getQuota());
        }
        if (this.authentication_ != null) {
            n2 += CodedOutputStream.computeMessageSize((int)11, (MessageLite)this.getAuthentication());
        }
        if (this.context_ != null) {
            n2 += CodedOutputStream.computeMessageSize((int)12, (MessageLite)this.getContext());
        }
        if (this.usage_ != null) {
            n2 += CodedOutputStream.computeMessageSize((int)15, (MessageLite)this.getUsage());
        }
        for (int i = 0; i < this.endpoints_.size(); ++i) {
            n2 += CodedOutputStream.computeMessageSize((int)18, (MessageLite)((MessageLite)this.endpoints_.get(i)));
        }
        if (this.configVersion_ != null) {
            n2 += CodedOutputStream.computeMessageSize((int)20, (MessageLite)this.getConfigVersion());
        }
        if (this.control_ != null) {
            n2 += CodedOutputStream.computeMessageSize((int)21, (MessageLite)this.getControl());
        }
        if (!this.producerProjectId_.isEmpty()) {
            n2 += CodedOutputStream.computeStringSize((int)22, (String)this.getProducerProjectId());
        }
        for (int i = 0; i < this.logs_.size(); ++i) {
            n2 += CodedOutputStream.computeMessageSize((int)23, (MessageLite)((MessageLite)this.logs_.get(i)));
        }
        for (int i = 0; i < this.metrics_.size(); ++i) {
            n2 += CodedOutputStream.computeMessageSize((int)24, (MessageLite)((MessageLite)this.metrics_.get(i)));
        }
        for (int i = 0; i < this.monitoredResources_.size(); ++i) {
            n2 += CodedOutputStream.computeMessageSize((int)25, (MessageLite)((MessageLite)this.monitoredResources_.get(i)));
        }
        if (this.billing_ != null) {
            n2 += CodedOutputStream.computeMessageSize((int)26, (MessageLite)this.getBilling());
        }
        if (this.logging_ != null) {
            n2 += CodedOutputStream.computeMessageSize((int)27, (MessageLite)this.getLogging());
        }
        if (this.monitoring_ != null) {
            n2 += CodedOutputStream.computeMessageSize((int)28, (MessageLite)this.getMonitoring());
        }
        if (this.systemParameters_ != null) {
            n2 += CodedOutputStream.computeMessageSize((int)29, (MessageLite)this.getSystemParameters());
        }
        if (!this.id_.isEmpty()) {
            n2 += CodedOutputStream.computeStringSize((int)33, (String)this.getId());
        }
        if (this.sourceInfo_ != null) {
            n2 += CodedOutputStream.computeMessageSize((int)37, (MessageLite)this.getSourceInfo());
        }
        if (this.experimental_ != null) {
            n2 += CodedOutputStream.computeMessageSize((int)101, (MessageLite)this.getExperimental());
        }
        this.memoizedSerializedSize = n2;
        return n2;
    }

    @Override
    public SourceInfo getSourceInfo() {
        SourceInfo sourceInfo = this.sourceInfo_;
        if (sourceInfo == null) {
            sourceInfo = SourceInfo.getDefaultInstance();
        }
        return sourceInfo;
    }

    @Override
    public SystemParameters getSystemParameters() {
        SystemParameters systemParameters = this.systemParameters_;
        if (systemParameters == null) {
            systemParameters = SystemParameters.getDefaultInstance();
        }
        return systemParameters;
    }

    @Override
    public String getTitle() {
        return this.title_;
    }

    @Override
    public ByteString getTitleBytes() {
        return ByteString.copyFromUtf8((String)this.title_);
    }

    @Override
    public Type getTypes(int n) {
        return (Type)this.types_.get(n);
    }

    @Override
    public int getTypesCount() {
        return this.types_.size();
    }

    @Override
    public List<Type> getTypesList() {
        return this.types_;
    }

    public TypeOrBuilder getTypesOrBuilder(int n) {
        return (TypeOrBuilder)this.types_.get(n);
    }

    public List<? extends TypeOrBuilder> getTypesOrBuilderList() {
        return this.types_;
    }

    @Override
    public Usage getUsage() {
        Usage usage = this.usage_;
        if (usage == null) {
            usage = Usage.getDefaultInstance();
        }
        return usage;
    }

    @Override
    public boolean hasAuthentication() {
        return this.authentication_ != null;
    }

    @Override
    public boolean hasBackend() {
        return this.backend_ != null;
    }

    @Override
    public boolean hasBilling() {
        return this.billing_ != null;
    }

    @Override
    public boolean hasConfigVersion() {
        return this.configVersion_ != null;
    }

    @Override
    public boolean hasContext() {
        return this.context_ != null;
    }

    @Override
    public boolean hasControl() {
        return this.control_ != null;
    }

    @Override
    public boolean hasDocumentation() {
        return this.documentation_ != null;
    }

    @Override
    public boolean hasExperimental() {
        return this.experimental_ != null;
    }

    @Override
    public boolean hasHttp() {
        return this.http_ != null;
    }

    @Override
    public boolean hasLogging() {
        return this.logging_ != null;
    }

    @Override
    public boolean hasMonitoring() {
        return this.monitoring_ != null;
    }

    @Override
    public boolean hasQuota() {
        return this.quota_ != null;
    }

    @Override
    public boolean hasSourceInfo() {
        return this.sourceInfo_ != null;
    }

    @Override
    public boolean hasSystemParameters() {
        return this.systemParameters_ != null;
    }

    @Override
    public boolean hasUsage() {
        return this.usage_ != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.name_.isEmpty()) {
            codedOutputStream.writeString(1, this.getName());
        }
        if (!this.title_.isEmpty()) {
            codedOutputStream.writeString(2, this.getTitle());
        }
        for (int i = 0; i < this.apis_.size(); ++i) {
            codedOutputStream.writeMessage(3, (MessageLite)this.apis_.get(i));
        }
        for (int i = 0; i < this.types_.size(); ++i) {
            codedOutputStream.writeMessage(4, (MessageLite)this.types_.get(i));
        }
        for (int i = 0; i < this.enums_.size(); ++i) {
            codedOutputStream.writeMessage(5, (MessageLite)this.enums_.get(i));
        }
        if (this.documentation_ != null) {
            codedOutputStream.writeMessage(6, (MessageLite)this.getDocumentation());
        }
        if (this.backend_ != null) {
            codedOutputStream.writeMessage(8, (MessageLite)this.getBackend());
        }
        if (this.http_ != null) {
            codedOutputStream.writeMessage(9, (MessageLite)this.getHttp());
        }
        if (this.quota_ != null) {
            codedOutputStream.writeMessage(10, (MessageLite)this.getQuota());
        }
        if (this.authentication_ != null) {
            codedOutputStream.writeMessage(11, (MessageLite)this.getAuthentication());
        }
        if (this.context_ != null) {
            codedOutputStream.writeMessage(12, (MessageLite)this.getContext());
        }
        if (this.usage_ != null) {
            codedOutputStream.writeMessage(15, (MessageLite)this.getUsage());
        }
        for (int i = 0; i < this.endpoints_.size(); ++i) {
            codedOutputStream.writeMessage(18, (MessageLite)this.endpoints_.get(i));
        }
        if (this.configVersion_ != null) {
            codedOutputStream.writeMessage(20, (MessageLite)this.getConfigVersion());
        }
        if (this.control_ != null) {
            codedOutputStream.writeMessage(21, (MessageLite)this.getControl());
        }
        if (!this.producerProjectId_.isEmpty()) {
            codedOutputStream.writeString(22, this.getProducerProjectId());
        }
        for (int i = 0; i < this.logs_.size(); ++i) {
            codedOutputStream.writeMessage(23, (MessageLite)this.logs_.get(i));
        }
        for (int i = 0; i < this.metrics_.size(); ++i) {
            codedOutputStream.writeMessage(24, (MessageLite)this.metrics_.get(i));
        }
        for (int i = 0; i < this.monitoredResources_.size(); ++i) {
            codedOutputStream.writeMessage(25, (MessageLite)this.monitoredResources_.get(i));
        }
        if (this.billing_ != null) {
            codedOutputStream.writeMessage(26, (MessageLite)this.getBilling());
        }
        if (this.logging_ != null) {
            codedOutputStream.writeMessage(27, (MessageLite)this.getLogging());
        }
        if (this.monitoring_ != null) {
            codedOutputStream.writeMessage(28, (MessageLite)this.getMonitoring());
        }
        if (this.systemParameters_ != null) {
            codedOutputStream.writeMessage(29, (MessageLite)this.getSystemParameters());
        }
        if (!this.id_.isEmpty()) {
            codedOutputStream.writeString(33, this.getId());
        }
        if (this.sourceInfo_ != null) {
            codedOutputStream.writeMessage(37, (MessageLite)this.getSourceInfo());
        }
        if (this.experimental_ != null) {
            codedOutputStream.writeMessage(101, (MessageLite)this.getExperimental());
        }
    }

    public static final class Builder
    extends GeneratedMessageLite.Builder<Service, Builder>
    implements ServiceOrBuilder {
        private Builder() {
            super((GeneratedMessageLite)DEFAULT_INSTANCE);
        }

        public Builder addAllApis(Iterable<? extends Api> iterable) {
            this.copyOnWrite();
            ((Service)this.instance).addAllApis((Iterable<? extends Api>)iterable);
            return this;
        }

        public Builder addAllEndpoints(Iterable<? extends Endpoint> iterable) {
            this.copyOnWrite();
            ((Service)this.instance).addAllEndpoints((Iterable<? extends Endpoint>)iterable);
            return this;
        }

        public Builder addAllEnums(Iterable<? extends Enum> iterable) {
            this.copyOnWrite();
            ((Service)this.instance).addAllEnums((Iterable<? extends Enum>)iterable);
            return this;
        }

        public Builder addAllLogs(Iterable<? extends LogDescriptor> iterable) {
            this.copyOnWrite();
            ((Service)this.instance).addAllLogs((Iterable<? extends LogDescriptor>)iterable);
            return this;
        }

        public Builder addAllMetrics(Iterable<? extends MetricDescriptor> iterable) {
            this.copyOnWrite();
            ((Service)this.instance).addAllMetrics((Iterable<? extends MetricDescriptor>)iterable);
            return this;
        }

        public Builder addAllMonitoredResources(Iterable<? extends MonitoredResourceDescriptor> iterable) {
            this.copyOnWrite();
            ((Service)this.instance).addAllMonitoredResources((Iterable<? extends MonitoredResourceDescriptor>)iterable);
            return this;
        }

        public Builder addAllTypes(Iterable<? extends Type> iterable) {
            this.copyOnWrite();
            ((Service)this.instance).addAllTypes((Iterable<? extends Type>)iterable);
            return this;
        }

        public Builder addApis(int n, Api.Builder builder) {
            this.copyOnWrite();
            ((Service)this.instance).addApis(n, builder);
            return this;
        }

        public Builder addApis(int n, Api api) {
            this.copyOnWrite();
            ((Service)this.instance).addApis(n, api);
            return this;
        }

        public Builder addApis(Api.Builder builder) {
            this.copyOnWrite();
            ((Service)this.instance).addApis(builder);
            return this;
        }

        public Builder addApis(Api api) {
            this.copyOnWrite();
            ((Service)this.instance).addApis(api);
            return this;
        }

        public Builder addEndpoints(int n, Endpoint.Builder builder) {
            this.copyOnWrite();
            ((Service)this.instance).addEndpoints(n, builder);
            return this;
        }

        public Builder addEndpoints(int n, Endpoint endpoint) {
            this.copyOnWrite();
            ((Service)this.instance).addEndpoints(n, endpoint);
            return this;
        }

        public Builder addEndpoints(Endpoint.Builder builder) {
            this.copyOnWrite();
            ((Service)this.instance).addEndpoints(builder);
            return this;
        }

        public Builder addEndpoints(Endpoint endpoint) {
            this.copyOnWrite();
            ((Service)this.instance).addEndpoints(endpoint);
            return this;
        }

        public Builder addEnums(int n, Enum.Builder builder) {
            this.copyOnWrite();
            ((Service)this.instance).addEnums(n, builder);
            return this;
        }

        public Builder addEnums(int n, Enum enum_) {
            this.copyOnWrite();
            ((Service)this.instance).addEnums(n, enum_);
            return this;
        }

        public Builder addEnums(Enum.Builder builder) {
            this.copyOnWrite();
            ((Service)this.instance).addEnums(builder);
            return this;
        }

        public Builder addEnums(Enum enum_) {
            this.copyOnWrite();
            ((Service)this.instance).addEnums(enum_);
            return this;
        }

        public Builder addLogs(int n, LogDescriptor.Builder builder) {
            this.copyOnWrite();
            ((Service)this.instance).addLogs(n, builder);
            return this;
        }

        public Builder addLogs(int n, LogDescriptor logDescriptor) {
            this.copyOnWrite();
            ((Service)this.instance).addLogs(n, logDescriptor);
            return this;
        }

        public Builder addLogs(LogDescriptor.Builder builder) {
            this.copyOnWrite();
            ((Service)this.instance).addLogs(builder);
            return this;
        }

        public Builder addLogs(LogDescriptor logDescriptor) {
            this.copyOnWrite();
            ((Service)this.instance).addLogs(logDescriptor);
            return this;
        }

        public Builder addMetrics(int n, MetricDescriptor.Builder builder) {
            this.copyOnWrite();
            ((Service)this.instance).addMetrics(n, builder);
            return this;
        }

        public Builder addMetrics(int n, MetricDescriptor metricDescriptor) {
            this.copyOnWrite();
            ((Service)this.instance).addMetrics(n, metricDescriptor);
            return this;
        }

        public Builder addMetrics(MetricDescriptor.Builder builder) {
            this.copyOnWrite();
            ((Service)this.instance).addMetrics(builder);
            return this;
        }

        public Builder addMetrics(MetricDescriptor metricDescriptor) {
            this.copyOnWrite();
            ((Service)this.instance).addMetrics(metricDescriptor);
            return this;
        }

        public Builder addMonitoredResources(int n, MonitoredResourceDescriptor.Builder builder) {
            this.copyOnWrite();
            ((Service)this.instance).addMonitoredResources(n, builder);
            return this;
        }

        public Builder addMonitoredResources(int n, MonitoredResourceDescriptor monitoredResourceDescriptor) {
            this.copyOnWrite();
            ((Service)this.instance).addMonitoredResources(n, monitoredResourceDescriptor);
            return this;
        }

        public Builder addMonitoredResources(MonitoredResourceDescriptor.Builder builder) {
            this.copyOnWrite();
            ((Service)this.instance).addMonitoredResources(builder);
            return this;
        }

        public Builder addMonitoredResources(MonitoredResourceDescriptor monitoredResourceDescriptor) {
            this.copyOnWrite();
            ((Service)this.instance).addMonitoredResources(monitoredResourceDescriptor);
            return this;
        }

        public Builder addTypes(int n, Type.Builder builder) {
            this.copyOnWrite();
            ((Service)this.instance).addTypes(n, builder);
            return this;
        }

        public Builder addTypes(int n, Type type) {
            this.copyOnWrite();
            ((Service)this.instance).addTypes(n, type);
            return this;
        }

        public Builder addTypes(Type.Builder builder) {
            this.copyOnWrite();
            ((Service)this.instance).addTypes(builder);
            return this;
        }

        public Builder addTypes(Type type) {
            this.copyOnWrite();
            ((Service)this.instance).addTypes(type);
            return this;
        }

        public Builder clearApis() {
            this.copyOnWrite();
            ((Service)this.instance).clearApis();
            return this;
        }

        public Builder clearAuthentication() {
            this.copyOnWrite();
            ((Service)this.instance).clearAuthentication();
            return this;
        }

        public Builder clearBackend() {
            this.copyOnWrite();
            ((Service)this.instance).clearBackend();
            return this;
        }

        public Builder clearBilling() {
            this.copyOnWrite();
            ((Service)this.instance).clearBilling();
            return this;
        }

        public Builder clearConfigVersion() {
            this.copyOnWrite();
            ((Service)this.instance).clearConfigVersion();
            return this;
        }

        public Builder clearContext() {
            this.copyOnWrite();
            ((Service)this.instance).clearContext();
            return this;
        }

        public Builder clearControl() {
            this.copyOnWrite();
            ((Service)this.instance).clearControl();
            return this;
        }

        public Builder clearDocumentation() {
            this.copyOnWrite();
            ((Service)this.instance).clearDocumentation();
            return this;
        }

        public Builder clearEndpoints() {
            this.copyOnWrite();
            ((Service)this.instance).clearEndpoints();
            return this;
        }

        public Builder clearEnums() {
            this.copyOnWrite();
            ((Service)this.instance).clearEnums();
            return this;
        }

        public Builder clearExperimental() {
            this.copyOnWrite();
            ((Service)this.instance).clearExperimental();
            return this;
        }

        public Builder clearHttp() {
            this.copyOnWrite();
            ((Service)this.instance).clearHttp();
            return this;
        }

        public Builder clearId() {
            this.copyOnWrite();
            ((Service)this.instance).clearId();
            return this;
        }

        public Builder clearLogging() {
            this.copyOnWrite();
            ((Service)this.instance).clearLogging();
            return this;
        }

        public Builder clearLogs() {
            this.copyOnWrite();
            ((Service)this.instance).clearLogs();
            return this;
        }

        public Builder clearMetrics() {
            this.copyOnWrite();
            ((Service)this.instance).clearMetrics();
            return this;
        }

        public Builder clearMonitoredResources() {
            this.copyOnWrite();
            ((Service)this.instance).clearMonitoredResources();
            return this;
        }

        public Builder clearMonitoring() {
            this.copyOnWrite();
            ((Service)this.instance).clearMonitoring();
            return this;
        }

        public Builder clearName() {
            this.copyOnWrite();
            ((Service)this.instance).clearName();
            return this;
        }

        public Builder clearProducerProjectId() {
            this.copyOnWrite();
            ((Service)this.instance).clearProducerProjectId();
            return this;
        }

        public Builder clearQuota() {
            this.copyOnWrite();
            ((Service)this.instance).clearQuota();
            return this;
        }

        public Builder clearSourceInfo() {
            this.copyOnWrite();
            ((Service)this.instance).clearSourceInfo();
            return this;
        }

        public Builder clearSystemParameters() {
            this.copyOnWrite();
            ((Service)this.instance).clearSystemParameters();
            return this;
        }

        public Builder clearTitle() {
            this.copyOnWrite();
            ((Service)this.instance).clearTitle();
            return this;
        }

        public Builder clearTypes() {
            this.copyOnWrite();
            ((Service)this.instance).clearTypes();
            return this;
        }

        public Builder clearUsage() {
            this.copyOnWrite();
            ((Service)this.instance).clearUsage();
            return this;
        }

        @Override
        public Api getApis(int n) {
            return ((Service)this.instance).getApis(n);
        }

        @Override
        public int getApisCount() {
            return ((Service)this.instance).getApisCount();
        }

        @Override
        public List<Api> getApisList() {
            return Collections.unmodifiableList(((Service)this.instance).getApisList());
        }

        @Override
        public Authentication getAuthentication() {
            return ((Service)this.instance).getAuthentication();
        }

        @Override
        public Backend getBackend() {
            return ((Service)this.instance).getBackend();
        }

        @Override
        public Billing getBilling() {
            return ((Service)this.instance).getBilling();
        }

        @Override
        public UInt32Value getConfigVersion() {
            return ((Service)this.instance).getConfigVersion();
        }

        @Override
        public Context getContext() {
            return ((Service)this.instance).getContext();
        }

        @Override
        public Control getControl() {
            return ((Service)this.instance).getControl();
        }

        @Override
        public Documentation getDocumentation() {
            return ((Service)this.instance).getDocumentation();
        }

        @Override
        public Endpoint getEndpoints(int n) {
            return ((Service)this.instance).getEndpoints(n);
        }

        @Override
        public int getEndpointsCount() {
            return ((Service)this.instance).getEndpointsCount();
        }

        @Override
        public List<Endpoint> getEndpointsList() {
            return Collections.unmodifiableList(((Service)this.instance).getEndpointsList());
        }

        @Override
        public Enum getEnums(int n) {
            return ((Service)this.instance).getEnums(n);
        }

        @Override
        public int getEnumsCount() {
            return ((Service)this.instance).getEnumsCount();
        }

        @Override
        public List<Enum> getEnumsList() {
            return Collections.unmodifiableList(((Service)this.instance).getEnumsList());
        }

        @Override
        public Experimental getExperimental() {
            return ((Service)this.instance).getExperimental();
        }

        @Override
        public Http getHttp() {
            return ((Service)this.instance).getHttp();
        }

        @Override
        public String getId() {
            return ((Service)this.instance).getId();
        }

        @Override
        public ByteString getIdBytes() {
            return ((Service)this.instance).getIdBytes();
        }

        @Override
        public Logging getLogging() {
            return ((Service)this.instance).getLogging();
        }

        @Override
        public LogDescriptor getLogs(int n) {
            return ((Service)this.instance).getLogs(n);
        }

        @Override
        public int getLogsCount() {
            return ((Service)this.instance).getLogsCount();
        }

        @Override
        public List<LogDescriptor> getLogsList() {
            return Collections.unmodifiableList(((Service)this.instance).getLogsList());
        }

        @Override
        public MetricDescriptor getMetrics(int n) {
            return ((Service)this.instance).getMetrics(n);
        }

        @Override
        public int getMetricsCount() {
            return ((Service)this.instance).getMetricsCount();
        }

        @Override
        public List<MetricDescriptor> getMetricsList() {
            return Collections.unmodifiableList(((Service)this.instance).getMetricsList());
        }

        @Override
        public MonitoredResourceDescriptor getMonitoredResources(int n) {
            return ((Service)this.instance).getMonitoredResources(n);
        }

        @Override
        public int getMonitoredResourcesCount() {
            return ((Service)this.instance).getMonitoredResourcesCount();
        }

        @Override
        public List<MonitoredResourceDescriptor> getMonitoredResourcesList() {
            return Collections.unmodifiableList(((Service)this.instance).getMonitoredResourcesList());
        }

        @Override
        public Monitoring getMonitoring() {
            return ((Service)this.instance).getMonitoring();
        }

        @Override
        public String getName() {
            return ((Service)this.instance).getName();
        }

        @Override
        public ByteString getNameBytes() {
            return ((Service)this.instance).getNameBytes();
        }

        @Override
        public String getProducerProjectId() {
            return ((Service)this.instance).getProducerProjectId();
        }

        @Override
        public ByteString getProducerProjectIdBytes() {
            return ((Service)this.instance).getProducerProjectIdBytes();
        }

        @Override
        public Quota getQuota() {
            return ((Service)this.instance).getQuota();
        }

        @Override
        public SourceInfo getSourceInfo() {
            return ((Service)this.instance).getSourceInfo();
        }

        @Override
        public SystemParameters getSystemParameters() {
            return ((Service)this.instance).getSystemParameters();
        }

        @Override
        public String getTitle() {
            return ((Service)this.instance).getTitle();
        }

        @Override
        public ByteString getTitleBytes() {
            return ((Service)this.instance).getTitleBytes();
        }

        @Override
        public Type getTypes(int n) {
            return ((Service)this.instance).getTypes(n);
        }

        @Override
        public int getTypesCount() {
            return ((Service)this.instance).getTypesCount();
        }

        @Override
        public List<Type> getTypesList() {
            return Collections.unmodifiableList(((Service)this.instance).getTypesList());
        }

        @Override
        public Usage getUsage() {
            return ((Service)this.instance).getUsage();
        }

        @Override
        public boolean hasAuthentication() {
            return ((Service)this.instance).hasAuthentication();
        }

        @Override
        public boolean hasBackend() {
            return ((Service)this.instance).hasBackend();
        }

        @Override
        public boolean hasBilling() {
            return ((Service)this.instance).hasBilling();
        }

        @Override
        public boolean hasConfigVersion() {
            return ((Service)this.instance).hasConfigVersion();
        }

        @Override
        public boolean hasContext() {
            return ((Service)this.instance).hasContext();
        }

        @Override
        public boolean hasControl() {
            return ((Service)this.instance).hasControl();
        }

        @Override
        public boolean hasDocumentation() {
            return ((Service)this.instance).hasDocumentation();
        }

        @Override
        public boolean hasExperimental() {
            return ((Service)this.instance).hasExperimental();
        }

        @Override
        public boolean hasHttp() {
            return ((Service)this.instance).hasHttp();
        }

        @Override
        public boolean hasLogging() {
            return ((Service)this.instance).hasLogging();
        }

        @Override
        public boolean hasMonitoring() {
            return ((Service)this.instance).hasMonitoring();
        }

        @Override
        public boolean hasQuota() {
            return ((Service)this.instance).hasQuota();
        }

        @Override
        public boolean hasSourceInfo() {
            return ((Service)this.instance).hasSourceInfo();
        }

        @Override
        public boolean hasSystemParameters() {
            return ((Service)this.instance).hasSystemParameters();
        }

        @Override
        public boolean hasUsage() {
            return ((Service)this.instance).hasUsage();
        }

        public Builder mergeAuthentication(Authentication authentication) {
            this.copyOnWrite();
            ((Service)this.instance).mergeAuthentication(authentication);
            return this;
        }

        public Builder mergeBackend(Backend backend) {
            this.copyOnWrite();
            ((Service)this.instance).mergeBackend(backend);
            return this;
        }

        public Builder mergeBilling(Billing billing) {
            this.copyOnWrite();
            ((Service)this.instance).mergeBilling(billing);
            return this;
        }

        public Builder mergeConfigVersion(UInt32Value uInt32Value) {
            this.copyOnWrite();
            ((Service)this.instance).mergeConfigVersion(uInt32Value);
            return this;
        }

        public Builder mergeContext(Context context) {
            this.copyOnWrite();
            ((Service)this.instance).mergeContext(context);
            return this;
        }

        public Builder mergeControl(Control control) {
            this.copyOnWrite();
            ((Service)this.instance).mergeControl(control);
            return this;
        }

        public Builder mergeDocumentation(Documentation documentation) {
            this.copyOnWrite();
            ((Service)this.instance).mergeDocumentation(documentation);
            return this;
        }

        public Builder mergeExperimental(Experimental experimental) {
            this.copyOnWrite();
            ((Service)this.instance).mergeExperimental(experimental);
            return this;
        }

        public Builder mergeHttp(Http http) {
            this.copyOnWrite();
            ((Service)this.instance).mergeHttp(http);
            return this;
        }

        public Builder mergeLogging(Logging logging) {
            this.copyOnWrite();
            ((Service)this.instance).mergeLogging(logging);
            return this;
        }

        public Builder mergeMonitoring(Monitoring monitoring) {
            this.copyOnWrite();
            ((Service)this.instance).mergeMonitoring(monitoring);
            return this;
        }

        public Builder mergeQuota(Quota quota) {
            this.copyOnWrite();
            ((Service)this.instance).mergeQuota(quota);
            return this;
        }

        public Builder mergeSourceInfo(SourceInfo sourceInfo) {
            this.copyOnWrite();
            ((Service)this.instance).mergeSourceInfo(sourceInfo);
            return this;
        }

        public Builder mergeSystemParameters(SystemParameters systemParameters) {
            this.copyOnWrite();
            ((Service)this.instance).mergeSystemParameters(systemParameters);
            return this;
        }

        public Builder mergeUsage(Usage usage) {
            this.copyOnWrite();
            ((Service)this.instance).mergeUsage(usage);
            return this;
        }

        public Builder removeApis(int n) {
            this.copyOnWrite();
            ((Service)this.instance).removeApis(n);
            return this;
        }

        public Builder removeEndpoints(int n) {
            this.copyOnWrite();
            ((Service)this.instance).removeEndpoints(n);
            return this;
        }

        public Builder removeEnums(int n) {
            this.copyOnWrite();
            ((Service)this.instance).removeEnums(n);
            return this;
        }

        public Builder removeLogs(int n) {
            this.copyOnWrite();
            ((Service)this.instance).removeLogs(n);
            return this;
        }

        public Builder removeMetrics(int n) {
            this.copyOnWrite();
            ((Service)this.instance).removeMetrics(n);
            return this;
        }

        public Builder removeMonitoredResources(int n) {
            this.copyOnWrite();
            ((Service)this.instance).removeMonitoredResources(n);
            return this;
        }

        public Builder removeTypes(int n) {
            this.copyOnWrite();
            ((Service)this.instance).removeTypes(n);
            return this;
        }

        public Builder setApis(int n, Api.Builder builder) {
            this.copyOnWrite();
            ((Service)this.instance).setApis(n, builder);
            return this;
        }

        public Builder setApis(int n, Api api) {
            this.copyOnWrite();
            ((Service)this.instance).setApis(n, api);
            return this;
        }

        public Builder setAuthentication(Authentication.Builder builder) {
            this.copyOnWrite();
            ((Service)this.instance).setAuthentication(builder);
            return this;
        }

        public Builder setAuthentication(Authentication authentication) {
            this.copyOnWrite();
            ((Service)this.instance).setAuthentication(authentication);
            return this;
        }

        public Builder setBackend(Backend.Builder builder) {
            this.copyOnWrite();
            ((Service)this.instance).setBackend(builder);
            return this;
        }

        public Builder setBackend(Backend backend) {
            this.copyOnWrite();
            ((Service)this.instance).setBackend(backend);
            return this;
        }

        public Builder setBilling(Billing.Builder builder) {
            this.copyOnWrite();
            ((Service)this.instance).setBilling(builder);
            return this;
        }

        public Builder setBilling(Billing billing) {
            this.copyOnWrite();
            ((Service)this.instance).setBilling(billing);
            return this;
        }

        public Builder setConfigVersion(UInt32Value.Builder builder) {
            this.copyOnWrite();
            ((Service)this.instance).setConfigVersion(builder);
            return this;
        }

        public Builder setConfigVersion(UInt32Value uInt32Value) {
            this.copyOnWrite();
            ((Service)this.instance).setConfigVersion(uInt32Value);
            return this;
        }

        public Builder setContext(Context.Builder builder) {
            this.copyOnWrite();
            ((Service)this.instance).setContext(builder);
            return this;
        }

        public Builder setContext(Context context) {
            this.copyOnWrite();
            ((Service)this.instance).setContext(context);
            return this;
        }

        public Builder setControl(Control.Builder builder) {
            this.copyOnWrite();
            ((Service)this.instance).setControl(builder);
            return this;
        }

        public Builder setControl(Control control) {
            this.copyOnWrite();
            ((Service)this.instance).setControl(control);
            return this;
        }

        public Builder setDocumentation(Documentation.Builder builder) {
            this.copyOnWrite();
            ((Service)this.instance).setDocumentation(builder);
            return this;
        }

        public Builder setDocumentation(Documentation documentation) {
            this.copyOnWrite();
            ((Service)this.instance).setDocumentation(documentation);
            return this;
        }

        public Builder setEndpoints(int n, Endpoint.Builder builder) {
            this.copyOnWrite();
            ((Service)this.instance).setEndpoints(n, builder);
            return this;
        }

        public Builder setEndpoints(int n, Endpoint endpoint) {
            this.copyOnWrite();
            ((Service)this.instance).setEndpoints(n, endpoint);
            return this;
        }

        public Builder setEnums(int n, Enum.Builder builder) {
            this.copyOnWrite();
            ((Service)this.instance).setEnums(n, builder);
            return this;
        }

        public Builder setEnums(int n, Enum enum_) {
            this.copyOnWrite();
            ((Service)this.instance).setEnums(n, enum_);
            return this;
        }

        public Builder setExperimental(Experimental.Builder builder) {
            this.copyOnWrite();
            ((Service)this.instance).setExperimental(builder);
            return this;
        }

        public Builder setExperimental(Experimental experimental) {
            this.copyOnWrite();
            ((Service)this.instance).setExperimental(experimental);
            return this;
        }

        public Builder setHttp(Http.Builder builder) {
            this.copyOnWrite();
            ((Service)this.instance).setHttp(builder);
            return this;
        }

        public Builder setHttp(Http http) {
            this.copyOnWrite();
            ((Service)this.instance).setHttp(http);
            return this;
        }

        public Builder setId(String string2) {
            this.copyOnWrite();
            ((Service)this.instance).setId(string2);
            return this;
        }

        public Builder setIdBytes(ByteString byteString) {
            this.copyOnWrite();
            ((Service)this.instance).setIdBytes(byteString);
            return this;
        }

        public Builder setLogging(Logging.Builder builder) {
            this.copyOnWrite();
            ((Service)this.instance).setLogging(builder);
            return this;
        }

        public Builder setLogging(Logging logging) {
            this.copyOnWrite();
            ((Service)this.instance).setLogging(logging);
            return this;
        }

        public Builder setLogs(int n, LogDescriptor.Builder builder) {
            this.copyOnWrite();
            ((Service)this.instance).setLogs(n, builder);
            return this;
        }

        public Builder setLogs(int n, LogDescriptor logDescriptor) {
            this.copyOnWrite();
            ((Service)this.instance).setLogs(n, logDescriptor);
            return this;
        }

        public Builder setMetrics(int n, MetricDescriptor.Builder builder) {
            this.copyOnWrite();
            ((Service)this.instance).setMetrics(n, builder);
            return this;
        }

        public Builder setMetrics(int n, MetricDescriptor metricDescriptor) {
            this.copyOnWrite();
            ((Service)this.instance).setMetrics(n, metricDescriptor);
            return this;
        }

        public Builder setMonitoredResources(int n, MonitoredResourceDescriptor.Builder builder) {
            this.copyOnWrite();
            ((Service)this.instance).setMonitoredResources(n, builder);
            return this;
        }

        public Builder setMonitoredResources(int n, MonitoredResourceDescriptor monitoredResourceDescriptor) {
            this.copyOnWrite();
            ((Service)this.instance).setMonitoredResources(n, monitoredResourceDescriptor);
            return this;
        }

        public Builder setMonitoring(Monitoring.Builder builder) {
            this.copyOnWrite();
            ((Service)this.instance).setMonitoring(builder);
            return this;
        }

        public Builder setMonitoring(Monitoring monitoring) {
            this.copyOnWrite();
            ((Service)this.instance).setMonitoring(monitoring);
            return this;
        }

        public Builder setName(String string2) {
            this.copyOnWrite();
            ((Service)this.instance).setName(string2);
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            this.copyOnWrite();
            ((Service)this.instance).setNameBytes(byteString);
            return this;
        }

        public Builder setProducerProjectId(String string2) {
            this.copyOnWrite();
            ((Service)this.instance).setProducerProjectId(string2);
            return this;
        }

        public Builder setProducerProjectIdBytes(ByteString byteString) {
            this.copyOnWrite();
            ((Service)this.instance).setProducerProjectIdBytes(byteString);
            return this;
        }

        public Builder setQuota(Quota.Builder builder) {
            this.copyOnWrite();
            ((Service)this.instance).setQuota(builder);
            return this;
        }

        public Builder setQuota(Quota quota) {
            this.copyOnWrite();
            ((Service)this.instance).setQuota(quota);
            return this;
        }

        public Builder setSourceInfo(SourceInfo.Builder builder) {
            this.copyOnWrite();
            ((Service)this.instance).setSourceInfo(builder);
            return this;
        }

        public Builder setSourceInfo(SourceInfo sourceInfo) {
            this.copyOnWrite();
            ((Service)this.instance).setSourceInfo(sourceInfo);
            return this;
        }

        public Builder setSystemParameters(SystemParameters.Builder builder) {
            this.copyOnWrite();
            ((Service)this.instance).setSystemParameters(builder);
            return this;
        }

        public Builder setSystemParameters(SystemParameters systemParameters) {
            this.copyOnWrite();
            ((Service)this.instance).setSystemParameters(systemParameters);
            return this;
        }

        public Builder setTitle(String string2) {
            this.copyOnWrite();
            ((Service)this.instance).setTitle(string2);
            return this;
        }

        public Builder setTitleBytes(ByteString byteString) {
            this.copyOnWrite();
            ((Service)this.instance).setTitleBytes(byteString);
            return this;
        }

        public Builder setTypes(int n, Type.Builder builder) {
            this.copyOnWrite();
            ((Service)this.instance).setTypes(n, builder);
            return this;
        }

        public Builder setTypes(int n, Type type) {
            this.copyOnWrite();
            ((Service)this.instance).setTypes(n, type);
            return this;
        }

        public Builder setUsage(Usage.Builder builder) {
            this.copyOnWrite();
            ((Service)this.instance).setUsage(builder);
            return this;
        }

        public Builder setUsage(Usage usage) {
            this.copyOnWrite();
            ((Service)this.instance).setUsage(usage);
            return this;
        }
    }

}

