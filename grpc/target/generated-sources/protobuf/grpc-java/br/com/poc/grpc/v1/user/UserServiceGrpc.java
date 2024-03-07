package br.com.poc.grpc.v1.user;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.58.0)",
    comments = "Source: user-service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class UserServiceGrpc {

  private UserServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "br.com.poc.grpc.v1.user.UserService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<br.com.poc.grpc.v1.user.UserRequest,
      br.com.poc.grpc.v1.user.UserResponse> getCreateUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateUser",
      requestType = br.com.poc.grpc.v1.user.UserRequest.class,
      responseType = br.com.poc.grpc.v1.user.UserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<br.com.poc.grpc.v1.user.UserRequest,
      br.com.poc.grpc.v1.user.UserResponse> getCreateUserMethod() {
    io.grpc.MethodDescriptor<br.com.poc.grpc.v1.user.UserRequest, br.com.poc.grpc.v1.user.UserResponse> getCreateUserMethod;
    if ((getCreateUserMethod = UserServiceGrpc.getCreateUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getCreateUserMethod = UserServiceGrpc.getCreateUserMethod) == null) {
          UserServiceGrpc.getCreateUserMethod = getCreateUserMethod =
              io.grpc.MethodDescriptor.<br.com.poc.grpc.v1.user.UserRequest, br.com.poc.grpc.v1.user.UserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.poc.grpc.v1.user.UserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.poc.grpc.v1.user.UserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("CreateUser"))
              .build();
        }
      }
    }
    return getCreateUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<br.com.poc.grpc.v1.user.EmptyReq,
      br.com.poc.grpc.v1.user.UserListResponse> getGetAllUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllUser",
      requestType = br.com.poc.grpc.v1.user.EmptyReq.class,
      responseType = br.com.poc.grpc.v1.user.UserListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<br.com.poc.grpc.v1.user.EmptyReq,
      br.com.poc.grpc.v1.user.UserListResponse> getGetAllUserMethod() {
    io.grpc.MethodDescriptor<br.com.poc.grpc.v1.user.EmptyReq, br.com.poc.grpc.v1.user.UserListResponse> getGetAllUserMethod;
    if ((getGetAllUserMethod = UserServiceGrpc.getGetAllUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetAllUserMethod = UserServiceGrpc.getGetAllUserMethod) == null) {
          UserServiceGrpc.getGetAllUserMethod = getGetAllUserMethod =
              io.grpc.MethodDescriptor.<br.com.poc.grpc.v1.user.EmptyReq, br.com.poc.grpc.v1.user.UserListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAllUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.poc.grpc.v1.user.EmptyReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.poc.grpc.v1.user.UserListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("GetAllUser"))
              .build();
        }
      }
    }
    return getGetAllUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<br.com.poc.grpc.v1.user.EmptyReq,
      br.com.poc.grpc.v1.user.UserResponse> getGetAllUserStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllUserStream",
      requestType = br.com.poc.grpc.v1.user.EmptyReq.class,
      responseType = br.com.poc.grpc.v1.user.UserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<br.com.poc.grpc.v1.user.EmptyReq,
      br.com.poc.grpc.v1.user.UserResponse> getGetAllUserStreamMethod() {
    io.grpc.MethodDescriptor<br.com.poc.grpc.v1.user.EmptyReq, br.com.poc.grpc.v1.user.UserResponse> getGetAllUserStreamMethod;
    if ((getGetAllUserStreamMethod = UserServiceGrpc.getGetAllUserStreamMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetAllUserStreamMethod = UserServiceGrpc.getGetAllUserStreamMethod) == null) {
          UserServiceGrpc.getGetAllUserStreamMethod = getGetAllUserStreamMethod =
              io.grpc.MethodDescriptor.<br.com.poc.grpc.v1.user.EmptyReq, br.com.poc.grpc.v1.user.UserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAllUserStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.poc.grpc.v1.user.EmptyReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.poc.grpc.v1.user.UserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("GetAllUserStream"))
              .build();
        }
      }
    }
    return getGetAllUserStreamMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceStub>() {
        @java.lang.Override
        public UserServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceStub(channel, callOptions);
        }
      };
    return UserServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceBlockingStub>() {
        @java.lang.Override
        public UserServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceBlockingStub(channel, callOptions);
        }
      };
    return UserServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceFutureStub>() {
        @java.lang.Override
        public UserServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceFutureStub(channel, callOptions);
        }
      };
    return UserServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void createUser(br.com.poc.grpc.v1.user.UserRequest request,
        io.grpc.stub.StreamObserver<br.com.poc.grpc.v1.user.UserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateUserMethod(), responseObserver);
    }

    /**
     */
    default void getAllUser(br.com.poc.grpc.v1.user.EmptyReq request,
        io.grpc.stub.StreamObserver<br.com.poc.grpc.v1.user.UserListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllUserMethod(), responseObserver);
    }

    /**
     */
    default void getAllUserStream(br.com.poc.grpc.v1.user.EmptyReq request,
        io.grpc.stub.StreamObserver<br.com.poc.grpc.v1.user.UserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllUserStreamMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service UserService.
   */
  public static abstract class UserServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return UserServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service UserService.
   */
  public static final class UserServiceStub
      extends io.grpc.stub.AbstractAsyncStub<UserServiceStub> {
    private UserServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceStub(channel, callOptions);
    }

    /**
     */
    public void createUser(br.com.poc.grpc.v1.user.UserRequest request,
        io.grpc.stub.StreamObserver<br.com.poc.grpc.v1.user.UserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllUser(br.com.poc.grpc.v1.user.EmptyReq request,
        io.grpc.stub.StreamObserver<br.com.poc.grpc.v1.user.UserListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllUserStream(br.com.poc.grpc.v1.user.EmptyReq request,
        io.grpc.stub.StreamObserver<br.com.poc.grpc.v1.user.UserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetAllUserStreamMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service UserService.
   */
  public static final class UserServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<UserServiceBlockingStub> {
    private UserServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public br.com.poc.grpc.v1.user.UserResponse createUser(br.com.poc.grpc.v1.user.UserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public br.com.poc.grpc.v1.user.UserListResponse getAllUser(br.com.poc.grpc.v1.user.EmptyReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<br.com.poc.grpc.v1.user.UserResponse> getAllUserStream(
        br.com.poc.grpc.v1.user.EmptyReq request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetAllUserStreamMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service UserService.
   */
  public static final class UserServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<UserServiceFutureStub> {
    private UserServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<br.com.poc.grpc.v1.user.UserResponse> createUser(
        br.com.poc.grpc.v1.user.UserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<br.com.poc.grpc.v1.user.UserListResponse> getAllUser(
        br.com.poc.grpc.v1.user.EmptyReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllUserMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_USER = 0;
  private static final int METHODID_GET_ALL_USER = 1;
  private static final int METHODID_GET_ALL_USER_STREAM = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_USER:
          serviceImpl.createUser((br.com.poc.grpc.v1.user.UserRequest) request,
              (io.grpc.stub.StreamObserver<br.com.poc.grpc.v1.user.UserResponse>) responseObserver);
          break;
        case METHODID_GET_ALL_USER:
          serviceImpl.getAllUser((br.com.poc.grpc.v1.user.EmptyReq) request,
              (io.grpc.stub.StreamObserver<br.com.poc.grpc.v1.user.UserListResponse>) responseObserver);
          break;
        case METHODID_GET_ALL_USER_STREAM:
          serviceImpl.getAllUserStream((br.com.poc.grpc.v1.user.EmptyReq) request,
              (io.grpc.stub.StreamObserver<br.com.poc.grpc.v1.user.UserResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getCreateUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              br.com.poc.grpc.v1.user.UserRequest,
              br.com.poc.grpc.v1.user.UserResponse>(
                service, METHODID_CREATE_USER)))
        .addMethod(
          getGetAllUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              br.com.poc.grpc.v1.user.EmptyReq,
              br.com.poc.grpc.v1.user.UserListResponse>(
                service, METHODID_GET_ALL_USER)))
        .addMethod(
          getGetAllUserStreamMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              br.com.poc.grpc.v1.user.EmptyReq,
              br.com.poc.grpc.v1.user.UserResponse>(
                service, METHODID_GET_ALL_USER_STREAM)))
        .build();
  }

  private static abstract class UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return br.com.poc.grpc.v1.user.UserServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserService");
    }
  }

  private static final class UserServiceFileDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier {
    UserServiceFileDescriptorSupplier() {}
  }

  private static final class UserServiceMethodDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    UserServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (UserServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserServiceFileDescriptorSupplier())
              .addMethod(getCreateUserMethod())
              .addMethod(getGetAllUserMethod())
              .addMethod(getGetAllUserStreamMethod())
              .build();
        }
      }
    }
    return result;
  }
}
