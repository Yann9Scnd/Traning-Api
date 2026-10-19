package toko;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import toko.grpc.InventoryGrpc;
import toko.grpc.StockReply;
import toko.grpc.StockRequest;

public class GrpcClient {

    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051)
                .usePlaintext()
                .build();

        InventoryGrpc.InventoryBlockingStub stub = InventoryGrpc.newBlockingStub(channel);

        int[] productIds = {42, 1, 2, 99};

        for (int id : productIds) {
            StockRequest request = StockRequest.newBuilder()
                    .setProductId(id)
                    .build();

            StockReply response = stub.getStock(request);
            System.out.println("Product ID " + id + " -> Stok: " + response.getQuantity());
        }

        channel.shutdown();
    }
}
