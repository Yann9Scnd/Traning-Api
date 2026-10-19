package toko.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.68.1)",
    comments = "Source: inventory.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class InventoryGrpc {

  private InventoryGrpc() {}

  public static final java.lang.String SERVICE_NAME = "Inventory";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<toko.grpc.StockRequest,
      toko.grpc.StockReply> getGetStockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetStock",
      requestType = toko.grpc.StockRequest.class,
      responseType = toko.grpc.StockReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<toko.grpc.StockRequest,
      toko.grpc.StockReply> getGetStockMethod() {
    io.grpc.MethodDescriptor<toko.grpc.StockRequest, toko.grpc.StockReply> getGetStockMethod;
    if ((getGetStockMethod = InventoryGrpc.getGetStockMethod) == null) {
      synchronized (InventoryGrpc.class) {
        if ((getGetStockMethod = InventoryGrpc.getGetStockMethod) == null) {
          InventoryGrpc.getGetStockMethod = getGetStockMethod =
              io.grpc.MethodDescriptor.<toko.grpc.StockRequest, toko.grpc.StockReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetStock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  toko.grpc.StockRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  toko.grpc.StockReply.getDefaultInstance()))
              .setSchemaDescriptor(new InventoryMethodDescriptorSupplier("GetStock"))
              .build();
        }
      }
    }
    return getGetStockMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static InventoryStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InventoryStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InventoryStub>() {
        @java.lang.Override
        public InventoryStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InventoryStub(channel, callOptions);
        }
      };
    return InventoryStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static InventoryBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InventoryBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InventoryBlockingStub>() {
        @java.lang.Override
        public InventoryBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InventoryBlockingStub(channel, callOptions);
        }
      };
    return InventoryBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static InventoryFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InventoryFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InventoryFutureStub>() {
        @java.lang.Override
        public InventoryFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InventoryFutureStub(channel, callOptions);
        }
      };
    return InventoryFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getStock(toko.grpc.StockRequest request,
        io.grpc.stub.StreamObserver<toko.grpc.StockReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetStockMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Inventory.
   */
  public static abstract class InventoryImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return InventoryGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Inventory.
   */
  public static final class InventoryStub
      extends io.grpc.stub.AbstractAsyncStub<InventoryStub> {
    private InventoryStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InventoryStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InventoryStub(channel, callOptions);
    }

    /**
     */
    public void getStock(toko.grpc.StockRequest request,
        io.grpc.stub.StreamObserver<toko.grpc.StockReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetStockMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Inventory.
   */
  public static final class InventoryBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<InventoryBlockingStub> {
    private InventoryBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InventoryBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InventoryBlockingStub(channel, callOptions);
    }

    /**
     */
    public toko.grpc.StockReply getStock(toko.grpc.StockRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetStockMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Inventory.
   */
  public static final class InventoryFutureStub
      extends io.grpc.stub.AbstractFutureStub<InventoryFutureStub> {
    private InventoryFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InventoryFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InventoryFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<toko.grpc.StockReply> getStock(
        toko.grpc.StockRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetStockMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_STOCK = 0;

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
        case METHODID_GET_STOCK:
          serviceImpl.getStock((toko.grpc.StockRequest) request,
              (io.grpc.stub.StreamObserver<toko.grpc.StockReply>) responseObserver);
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
          getGetStockMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              toko.grpc.StockRequest,
              toko.grpc.StockReply>(
                service, METHODID_GET_STOCK)))
        .build();
  }

  private static abstract class InventoryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    InventoryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return toko.grpc.InventoryOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Inventory");
    }
  }

  private static final class InventoryFileDescriptorSupplier
      extends InventoryBaseDescriptorSupplier {
    InventoryFileDescriptorSupplier() {}
  }

  private static final class InventoryMethodDescriptorSupplier
      extends InventoryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    InventoryMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (InventoryGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new InventoryFileDescriptorSupplier())
              .addMethod(getGetStockMethod())
              .build();
        }
      }
    }
    return result;
  }
}
