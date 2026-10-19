package toko;

import io.grpc.stub.StreamObserver;
import toko.grpc.InventoryGrpc;
import toko.grpc.StockReply;
import toko.grpc.StockRequest;

public class InventoryService extends InventoryGrpc.InventoryImplBase {

    @Override
    public void getStock(StockRequest request, StreamObserver<StockReply> responseObserver) {
        int productId = request.getProductId();
        System.out.println("[gRPC] Cek stok untuk product_id: " + productId);

        int quantity = switch (productId) {
            case 42 -> 12;
            case 1  -> 50;
            case 2  -> 3;
            default -> 0;
        };

        StockReply reply = StockReply.newBuilder()
                .setQuantity(quantity)
                .build();

        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }
}
