/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.firestore.v1.FirestoreGrpc$FirestoreBlockingStub
 *  com.google.firestore.v1.FirestoreGrpc$FirestoreFutureStub
 *  com.google.firestore.v1.FirestoreGrpc$FirestoreImplBase
 *  com.google.firestore.v1.FirestoreGrpc$FirestoreStub
 *  com.google.protobuf.Empty
 *  com.google.protobuf.MessageLite
 *  io.grpc.MethodDescriptor$Marshaller
 *  io.grpc.ServiceDescriptor
 *  io.grpc.ServiceDescriptor$Builder
 *  io.grpc.protobuf.lite.ProtoLiteUtils
 *  io.grpc.stub.ServerCalls
 *  io.grpc.stub.StreamObserver
 *  java.lang.AssertionError
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 */
package com.google.firestore.v1;

import com.google.firestore.v1.BatchGetDocumentsRequest;
import com.google.firestore.v1.BatchGetDocumentsResponse;
import com.google.firestore.v1.BeginTransactionRequest;
import com.google.firestore.v1.BeginTransactionResponse;
import com.google.firestore.v1.CommitRequest;
import com.google.firestore.v1.CommitResponse;
import com.google.firestore.v1.CreateDocumentRequest;
import com.google.firestore.v1.DeleteDocumentRequest;
import com.google.firestore.v1.Document;
import com.google.firestore.v1.FirestoreGrpc;
import com.google.firestore.v1.GetDocumentRequest;
import com.google.firestore.v1.ListCollectionIdsRequest;
import com.google.firestore.v1.ListCollectionIdsResponse;
import com.google.firestore.v1.ListDocumentsRequest;
import com.google.firestore.v1.ListDocumentsResponse;
import com.google.firestore.v1.ListenRequest;
import com.google.firestore.v1.ListenResponse;
import com.google.firestore.v1.RollbackRequest;
import com.google.firestore.v1.RunQueryRequest;
import com.google.firestore.v1.RunQueryResponse;
import com.google.firestore.v1.UpdateDocumentRequest;
import com.google.firestore.v1.WriteRequest;
import com.google.firestore.v1.WriteResponse;
import com.google.protobuf.Empty;
import com.google.protobuf.MessageLite;
import io.grpc.Channel;
import io.grpc.MethodDescriptor;
import io.grpc.ServiceDescriptor;
import io.grpc.protobuf.lite.ProtoLiteUtils;
import io.grpc.stub.ServerCalls;
import io.grpc.stub.StreamObserver;

/*
 * Exception performing whole class analysis.
 */
public final class FirestoreGrpc {
    private static final int METHODID_BATCH_GET_DOCUMENTS = 5;
    private static final int METHODID_BEGIN_TRANSACTION = 6;
    private static final int METHODID_COMMIT = 7;
    private static final int METHODID_CREATE_DOCUMENT = 2;
    private static final int METHODID_DELETE_DOCUMENT = 4;
    private static final int METHODID_GET_DOCUMENT = 0;
    private static final int METHODID_LISTEN = 12;
    private static final int METHODID_LIST_COLLECTION_IDS = 10;
    private static final int METHODID_LIST_DOCUMENTS = 1;
    private static final int METHODID_ROLLBACK = 8;
    private static final int METHODID_RUN_QUERY = 9;
    private static final int METHODID_UPDATE_DOCUMENT = 3;
    private static final int METHODID_WRITE = 11;
    public static final String SERVICE_NAME = "google.firestore.v1.Firestore";
    private static volatile MethodDescriptor<BatchGetDocumentsRequest, BatchGetDocumentsResponse> getBatchGetDocumentsMethod;
    private static volatile MethodDescriptor<BeginTransactionRequest, BeginTransactionResponse> getBeginTransactionMethod;
    private static volatile MethodDescriptor<CommitRequest, CommitResponse> getCommitMethod;
    private static volatile MethodDescriptor<CreateDocumentRequest, Document> getCreateDocumentMethod;
    private static volatile MethodDescriptor<DeleteDocumentRequest, Empty> getDeleteDocumentMethod;
    private static volatile MethodDescriptor<GetDocumentRequest, Document> getGetDocumentMethod;
    private static volatile MethodDescriptor<ListCollectionIdsRequest, ListCollectionIdsResponse> getListCollectionIdsMethod;
    private static volatile MethodDescriptor<ListDocumentsRequest, ListDocumentsResponse> getListDocumentsMethod;
    private static volatile MethodDescriptor<ListenRequest, ListenResponse> getListenMethod;
    private static volatile MethodDescriptor<RollbackRequest, Empty> getRollbackMethod;
    private static volatile MethodDescriptor<RunQueryRequest, RunQueryResponse> getRunQueryMethod;
    private static volatile MethodDescriptor<UpdateDocumentRequest, Document> getUpdateDocumentMethod;
    private static volatile MethodDescriptor<WriteRequest, WriteResponse> getWriteMethod;
    private static volatile ServiceDescriptor serviceDescriptor;

    private FirestoreGrpc() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static MethodDescriptor<BatchGetDocumentsRequest, BatchGetDocumentsResponse> getBatchGetDocumentsMethod() {
        MethodDescriptor<BatchGetDocumentsRequest, BatchGetDocumentsResponse> methodDescriptor = getBatchGetDocumentsMethod;
        if (methodDescriptor != null) {
            return methodDescriptor;
        }
        Class<FirestoreGrpc> class_ = FirestoreGrpc.class;
        synchronized (FirestoreGrpc.class) {
            MethodDescriptor<BatchGetDocumentsRequest, BatchGetDocumentsResponse> methodDescriptor2;
            MethodDescriptor<BatchGetDocumentsRequest, BatchGetDocumentsResponse> methodDescriptor3 = methodDescriptor2 = getBatchGetDocumentsMethod;
            if (methodDescriptor2 == null) {
                MethodDescriptor methodDescriptor4 = MethodDescriptor.newBuilder().setType(MethodDescriptor.MethodType.SERVER_STREAMING).setFullMethodName(MethodDescriptor.generateFullMethodName(SERVICE_NAME, "BatchGetDocuments")).setSampledToLocalTracing(true).setRequestMarshaller(ProtoLiteUtils.marshaller((MessageLite)BatchGetDocumentsRequest.getDefaultInstance())).setResponseMarshaller(ProtoLiteUtils.marshaller((MessageLite)BatchGetDocumentsResponse.getDefaultInstance())).build();
                methodDescriptor3 = methodDescriptor4;
                getBatchGetDocumentsMethod = methodDescriptor4;
            }
            // ** MonitorExit[var5_1] (shouldn't be in output)
            return methodDescriptor3;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static MethodDescriptor<BeginTransactionRequest, BeginTransactionResponse> getBeginTransactionMethod() {
        MethodDescriptor<BeginTransactionRequest, BeginTransactionResponse> methodDescriptor = getBeginTransactionMethod;
        if (methodDescriptor != null) {
            return methodDescriptor;
        }
        Class<FirestoreGrpc> class_ = FirestoreGrpc.class;
        synchronized (FirestoreGrpc.class) {
            MethodDescriptor<BeginTransactionRequest, BeginTransactionResponse> methodDescriptor2;
            MethodDescriptor<BeginTransactionRequest, BeginTransactionResponse> methodDescriptor3 = methodDescriptor2 = getBeginTransactionMethod;
            if (methodDescriptor2 == null) {
                MethodDescriptor methodDescriptor4 = MethodDescriptor.newBuilder().setType(MethodDescriptor.MethodType.UNARY).setFullMethodName(MethodDescriptor.generateFullMethodName(SERVICE_NAME, "BeginTransaction")).setSampledToLocalTracing(true).setRequestMarshaller(ProtoLiteUtils.marshaller((MessageLite)BeginTransactionRequest.getDefaultInstance())).setResponseMarshaller(ProtoLiteUtils.marshaller((MessageLite)BeginTransactionResponse.getDefaultInstance())).build();
                methodDescriptor3 = methodDescriptor4;
                getBeginTransactionMethod = methodDescriptor4;
            }
            // ** MonitorExit[var5_1] (shouldn't be in output)
            return methodDescriptor3;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static MethodDescriptor<CommitRequest, CommitResponse> getCommitMethod() {
        MethodDescriptor<CommitRequest, CommitResponse> methodDescriptor = getCommitMethod;
        if (methodDescriptor != null) {
            return methodDescriptor;
        }
        Class<FirestoreGrpc> class_ = FirestoreGrpc.class;
        synchronized (FirestoreGrpc.class) {
            MethodDescriptor<CommitRequest, CommitResponse> methodDescriptor2;
            MethodDescriptor<CommitRequest, CommitResponse> methodDescriptor3 = methodDescriptor2 = getCommitMethod;
            if (methodDescriptor2 == null) {
                MethodDescriptor methodDescriptor4 = MethodDescriptor.newBuilder().setType(MethodDescriptor.MethodType.UNARY).setFullMethodName(MethodDescriptor.generateFullMethodName(SERVICE_NAME, "Commit")).setSampledToLocalTracing(true).setRequestMarshaller(ProtoLiteUtils.marshaller((MessageLite)CommitRequest.getDefaultInstance())).setResponseMarshaller(ProtoLiteUtils.marshaller((MessageLite)CommitResponse.getDefaultInstance())).build();
                methodDescriptor3 = methodDescriptor4;
                getCommitMethod = methodDescriptor4;
            }
            // ** MonitorExit[var5_1] (shouldn't be in output)
            return methodDescriptor3;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static MethodDescriptor<CreateDocumentRequest, Document> getCreateDocumentMethod() {
        MethodDescriptor<CreateDocumentRequest, Document> methodDescriptor = getCreateDocumentMethod;
        if (methodDescriptor != null) {
            return methodDescriptor;
        }
        Class<FirestoreGrpc> class_ = FirestoreGrpc.class;
        synchronized (FirestoreGrpc.class) {
            MethodDescriptor<CreateDocumentRequest, Document> methodDescriptor2;
            MethodDescriptor<CreateDocumentRequest, Document> methodDescriptor3 = methodDescriptor2 = getCreateDocumentMethod;
            if (methodDescriptor2 == null) {
                MethodDescriptor methodDescriptor4 = MethodDescriptor.newBuilder().setType(MethodDescriptor.MethodType.UNARY).setFullMethodName(MethodDescriptor.generateFullMethodName(SERVICE_NAME, "CreateDocument")).setSampledToLocalTracing(true).setRequestMarshaller(ProtoLiteUtils.marshaller((MessageLite)CreateDocumentRequest.getDefaultInstance())).setResponseMarshaller(ProtoLiteUtils.marshaller((MessageLite)Document.getDefaultInstance())).build();
                methodDescriptor3 = methodDescriptor4;
                getCreateDocumentMethod = methodDescriptor4;
            }
            // ** MonitorExit[var5_1] (shouldn't be in output)
            return methodDescriptor3;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static MethodDescriptor<DeleteDocumentRequest, Empty> getDeleteDocumentMethod() {
        MethodDescriptor<DeleteDocumentRequest, Empty> methodDescriptor = getDeleteDocumentMethod;
        if (methodDescriptor != null) {
            return methodDescriptor;
        }
        Class<FirestoreGrpc> class_ = FirestoreGrpc.class;
        synchronized (FirestoreGrpc.class) {
            MethodDescriptor<DeleteDocumentRequest, Empty> methodDescriptor2;
            MethodDescriptor<DeleteDocumentRequest, Object> methodDescriptor3 = methodDescriptor2 = getDeleteDocumentMethod;
            if (methodDescriptor2 == null) {
                MethodDescriptor methodDescriptor4 = MethodDescriptor.newBuilder().setType(MethodDescriptor.MethodType.UNARY).setFullMethodName(MethodDescriptor.generateFullMethodName(SERVICE_NAME, "DeleteDocument")).setSampledToLocalTracing(true).setRequestMarshaller(ProtoLiteUtils.marshaller((MessageLite)DeleteDocumentRequest.getDefaultInstance())).setResponseMarshaller(ProtoLiteUtils.marshaller((MessageLite)Empty.getDefaultInstance())).build();
                methodDescriptor3 = methodDescriptor4;
                getDeleteDocumentMethod = methodDescriptor4;
            }
            // ** MonitorExit[var5_1] (shouldn't be in output)
            return methodDescriptor3;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static MethodDescriptor<GetDocumentRequest, Document> getGetDocumentMethod() {
        MethodDescriptor<GetDocumentRequest, Document> methodDescriptor = getGetDocumentMethod;
        if (methodDescriptor != null) {
            return methodDescriptor;
        }
        Class<FirestoreGrpc> class_ = FirestoreGrpc.class;
        synchronized (FirestoreGrpc.class) {
            MethodDescriptor<GetDocumentRequest, Document> methodDescriptor2;
            MethodDescriptor<GetDocumentRequest, Document> methodDescriptor3 = methodDescriptor2 = getGetDocumentMethod;
            if (methodDescriptor2 == null) {
                MethodDescriptor methodDescriptor4 = MethodDescriptor.newBuilder().setType(MethodDescriptor.MethodType.UNARY).setFullMethodName(MethodDescriptor.generateFullMethodName(SERVICE_NAME, "GetDocument")).setSampledToLocalTracing(true).setRequestMarshaller(ProtoLiteUtils.marshaller((MessageLite)GetDocumentRequest.getDefaultInstance())).setResponseMarshaller(ProtoLiteUtils.marshaller((MessageLite)Document.getDefaultInstance())).build();
                methodDescriptor3 = methodDescriptor4;
                getGetDocumentMethod = methodDescriptor4;
            }
            // ** MonitorExit[var5_1] (shouldn't be in output)
            return methodDescriptor3;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static MethodDescriptor<ListCollectionIdsRequest, ListCollectionIdsResponse> getListCollectionIdsMethod() {
        MethodDescriptor<ListCollectionIdsRequest, ListCollectionIdsResponse> methodDescriptor = getListCollectionIdsMethod;
        if (methodDescriptor != null) {
            return methodDescriptor;
        }
        Class<FirestoreGrpc> class_ = FirestoreGrpc.class;
        synchronized (FirestoreGrpc.class) {
            MethodDescriptor<ListCollectionIdsRequest, ListCollectionIdsResponse> methodDescriptor2;
            MethodDescriptor<ListCollectionIdsRequest, ListCollectionIdsResponse> methodDescriptor3 = methodDescriptor2 = getListCollectionIdsMethod;
            if (methodDescriptor2 == null) {
                MethodDescriptor methodDescriptor4 = MethodDescriptor.newBuilder().setType(MethodDescriptor.MethodType.UNARY).setFullMethodName(MethodDescriptor.generateFullMethodName(SERVICE_NAME, "ListCollectionIds")).setSampledToLocalTracing(true).setRequestMarshaller(ProtoLiteUtils.marshaller((MessageLite)ListCollectionIdsRequest.getDefaultInstance())).setResponseMarshaller(ProtoLiteUtils.marshaller((MessageLite)ListCollectionIdsResponse.getDefaultInstance())).build();
                methodDescriptor3 = methodDescriptor4;
                getListCollectionIdsMethod = methodDescriptor4;
            }
            // ** MonitorExit[var5_1] (shouldn't be in output)
            return methodDescriptor3;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static MethodDescriptor<ListDocumentsRequest, ListDocumentsResponse> getListDocumentsMethod() {
        MethodDescriptor<ListDocumentsRequest, ListDocumentsResponse> methodDescriptor = getListDocumentsMethod;
        if (methodDescriptor != null) {
            return methodDescriptor;
        }
        Class<FirestoreGrpc> class_ = FirestoreGrpc.class;
        synchronized (FirestoreGrpc.class) {
            MethodDescriptor<ListDocumentsRequest, ListDocumentsResponse> methodDescriptor2;
            MethodDescriptor<ListDocumentsRequest, ListDocumentsResponse> methodDescriptor3 = methodDescriptor2 = getListDocumentsMethod;
            if (methodDescriptor2 == null) {
                MethodDescriptor methodDescriptor4 = MethodDescriptor.newBuilder().setType(MethodDescriptor.MethodType.UNARY).setFullMethodName(MethodDescriptor.generateFullMethodName(SERVICE_NAME, "ListDocuments")).setSampledToLocalTracing(true).setRequestMarshaller(ProtoLiteUtils.marshaller((MessageLite)ListDocumentsRequest.getDefaultInstance())).setResponseMarshaller(ProtoLiteUtils.marshaller((MessageLite)ListDocumentsResponse.getDefaultInstance())).build();
                methodDescriptor3 = methodDescriptor4;
                getListDocumentsMethod = methodDescriptor4;
            }
            // ** MonitorExit[var5_1] (shouldn't be in output)
            return methodDescriptor3;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static MethodDescriptor<ListenRequest, ListenResponse> getListenMethod() {
        MethodDescriptor<ListenRequest, ListenResponse> methodDescriptor = getListenMethod;
        if (methodDescriptor != null) {
            return methodDescriptor;
        }
        Class<FirestoreGrpc> class_ = FirestoreGrpc.class;
        synchronized (FirestoreGrpc.class) {
            MethodDescriptor<ListenRequest, ListenResponse> methodDescriptor2;
            MethodDescriptor<ListenRequest, ListenResponse> methodDescriptor3 = methodDescriptor2 = getListenMethod;
            if (methodDescriptor2 == null) {
                MethodDescriptor methodDescriptor4 = MethodDescriptor.newBuilder().setType(MethodDescriptor.MethodType.BIDI_STREAMING).setFullMethodName(MethodDescriptor.generateFullMethodName(SERVICE_NAME, "Listen")).setSampledToLocalTracing(true).setRequestMarshaller(ProtoLiteUtils.marshaller((MessageLite)ListenRequest.getDefaultInstance())).setResponseMarshaller(ProtoLiteUtils.marshaller((MessageLite)ListenResponse.getDefaultInstance())).build();
                methodDescriptor3 = methodDescriptor4;
                getListenMethod = methodDescriptor4;
            }
            // ** MonitorExit[var5_1] (shouldn't be in output)
            return methodDescriptor3;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static MethodDescriptor<RollbackRequest, Empty> getRollbackMethod() {
        MethodDescriptor<RollbackRequest, Empty> methodDescriptor = getRollbackMethod;
        if (methodDescriptor != null) {
            return methodDescriptor;
        }
        Class<FirestoreGrpc> class_ = FirestoreGrpc.class;
        synchronized (FirestoreGrpc.class) {
            MethodDescriptor<RollbackRequest, Empty> methodDescriptor2;
            MethodDescriptor<RollbackRequest, Object> methodDescriptor3 = methodDescriptor2 = getRollbackMethod;
            if (methodDescriptor2 == null) {
                MethodDescriptor methodDescriptor4 = MethodDescriptor.newBuilder().setType(MethodDescriptor.MethodType.UNARY).setFullMethodName(MethodDescriptor.generateFullMethodName(SERVICE_NAME, "Rollback")).setSampledToLocalTracing(true).setRequestMarshaller(ProtoLiteUtils.marshaller((MessageLite)RollbackRequest.getDefaultInstance())).setResponseMarshaller(ProtoLiteUtils.marshaller((MessageLite)Empty.getDefaultInstance())).build();
                methodDescriptor3 = methodDescriptor4;
                getRollbackMethod = methodDescriptor4;
            }
            // ** MonitorExit[var5_1] (shouldn't be in output)
            return methodDescriptor3;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static MethodDescriptor<RunQueryRequest, RunQueryResponse> getRunQueryMethod() {
        MethodDescriptor<RunQueryRequest, RunQueryResponse> methodDescriptor = getRunQueryMethod;
        if (methodDescriptor != null) {
            return methodDescriptor;
        }
        Class<FirestoreGrpc> class_ = FirestoreGrpc.class;
        synchronized (FirestoreGrpc.class) {
            MethodDescriptor<RunQueryRequest, RunQueryResponse> methodDescriptor2;
            MethodDescriptor<RunQueryRequest, RunQueryResponse> methodDescriptor3 = methodDescriptor2 = getRunQueryMethod;
            if (methodDescriptor2 == null) {
                MethodDescriptor methodDescriptor4 = MethodDescriptor.newBuilder().setType(MethodDescriptor.MethodType.SERVER_STREAMING).setFullMethodName(MethodDescriptor.generateFullMethodName(SERVICE_NAME, "RunQuery")).setSampledToLocalTracing(true).setRequestMarshaller(ProtoLiteUtils.marshaller((MessageLite)RunQueryRequest.getDefaultInstance())).setResponseMarshaller(ProtoLiteUtils.marshaller((MessageLite)RunQueryResponse.getDefaultInstance())).build();
                methodDescriptor3 = methodDescriptor4;
                getRunQueryMethod = methodDescriptor4;
            }
            // ** MonitorExit[var5_1] (shouldn't be in output)
            return methodDescriptor3;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ServiceDescriptor getServiceDescriptor() {
        ServiceDescriptor serviceDescriptor = FirestoreGrpc.serviceDescriptor;
        if (serviceDescriptor != null) {
            return serviceDescriptor;
        }
        Class<FirestoreGrpc> class_ = FirestoreGrpc.class;
        synchronized (FirestoreGrpc.class) {
            ServiceDescriptor serviceDescriptor2 = FirestoreGrpc.serviceDescriptor;
            if (serviceDescriptor2 == null) {
                ServiceDescriptor serviceDescriptor3;
                serviceDescriptor2 = serviceDescriptor3 = ServiceDescriptor.newBuilder((String)SERVICE_NAME).addMethod(FirestoreGrpc.getGetDocumentMethod()).addMethod(FirestoreGrpc.getListDocumentsMethod()).addMethod(FirestoreGrpc.getCreateDocumentMethod()).addMethod(FirestoreGrpc.getUpdateDocumentMethod()).addMethod(FirestoreGrpc.getDeleteDocumentMethod()).addMethod(FirestoreGrpc.getBatchGetDocumentsMethod()).addMethod(FirestoreGrpc.getBeginTransactionMethod()).addMethod(FirestoreGrpc.getCommitMethod()).addMethod(FirestoreGrpc.getRollbackMethod()).addMethod(FirestoreGrpc.getRunQueryMethod()).addMethod(FirestoreGrpc.getWriteMethod()).addMethod(FirestoreGrpc.getListenMethod()).addMethod(FirestoreGrpc.getListCollectionIdsMethod()).build();
                FirestoreGrpc.serviceDescriptor = serviceDescriptor3;
            }
            // ** MonitorExit[var4_1] (shouldn't be in output)
            return serviceDescriptor2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static MethodDescriptor<UpdateDocumentRequest, Document> getUpdateDocumentMethod() {
        MethodDescriptor<UpdateDocumentRequest, Document> methodDescriptor = getUpdateDocumentMethod;
        if (methodDescriptor != null) {
            return methodDescriptor;
        }
        Class<FirestoreGrpc> class_ = FirestoreGrpc.class;
        synchronized (FirestoreGrpc.class) {
            MethodDescriptor<UpdateDocumentRequest, Document> methodDescriptor2;
            MethodDescriptor<UpdateDocumentRequest, Document> methodDescriptor3 = methodDescriptor2 = getUpdateDocumentMethod;
            if (methodDescriptor2 == null) {
                MethodDescriptor methodDescriptor4 = MethodDescriptor.newBuilder().setType(MethodDescriptor.MethodType.UNARY).setFullMethodName(MethodDescriptor.generateFullMethodName(SERVICE_NAME, "UpdateDocument")).setSampledToLocalTracing(true).setRequestMarshaller(ProtoLiteUtils.marshaller((MessageLite)UpdateDocumentRequest.getDefaultInstance())).setResponseMarshaller(ProtoLiteUtils.marshaller((MessageLite)Document.getDefaultInstance())).build();
                methodDescriptor3 = methodDescriptor4;
                getUpdateDocumentMethod = methodDescriptor4;
            }
            // ** MonitorExit[var5_1] (shouldn't be in output)
            return methodDescriptor3;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static MethodDescriptor<WriteRequest, WriteResponse> getWriteMethod() {
        MethodDescriptor<WriteRequest, WriteResponse> methodDescriptor = getWriteMethod;
        if (methodDescriptor != null) {
            return methodDescriptor;
        }
        Class<FirestoreGrpc> class_ = FirestoreGrpc.class;
        synchronized (FirestoreGrpc.class) {
            MethodDescriptor<WriteRequest, WriteResponse> methodDescriptor2;
            MethodDescriptor<WriteRequest, WriteResponse> methodDescriptor3 = methodDescriptor2 = getWriteMethod;
            if (methodDescriptor2 == null) {
                MethodDescriptor methodDescriptor4 = MethodDescriptor.newBuilder().setType(MethodDescriptor.MethodType.BIDI_STREAMING).setFullMethodName(MethodDescriptor.generateFullMethodName(SERVICE_NAME, "Write")).setSampledToLocalTracing(true).setRequestMarshaller(ProtoLiteUtils.marshaller((MessageLite)WriteRequest.getDefaultInstance())).setResponseMarshaller(ProtoLiteUtils.marshaller((MessageLite)WriteResponse.getDefaultInstance())).build();
                methodDescriptor3 = methodDescriptor4;
                getWriteMethod = methodDescriptor4;
            }
            // ** MonitorExit[var5_1] (shouldn't be in output)
            return methodDescriptor3;
        }
    }

    public static FirestoreBlockingStub newBlockingStub(Channel channel) {
        return new /* Unavailable Anonymous Inner Class!! */;
    }

    public static FirestoreFutureStub newFutureStub(Channel channel) {
        return new /* Unavailable Anonymous Inner Class!! */;
    }

    public static FirestoreStub newStub(Channel channel) {
        return new /* Unavailable Anonymous Inner Class!! */;
    }

}

