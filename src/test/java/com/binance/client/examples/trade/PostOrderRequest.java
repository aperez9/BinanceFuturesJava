package com.binance.client.examples.trade;

import com.binance.client.RequestOptions;
import com.binance.client.SyncRequestClient;
import com.binance.client.examples.constants.PrivateConfig;
import com.binance.client.model.enums.*;
import com.binance.client.model.trade.OrderRequest;

public class PostOrderRequest {
    public static void main(String[] args) {
        RequestOptions options = new RequestOptions();
        SyncRequestClient syncRequestClient = SyncRequestClient.create(PrivateConfig.API_KEY, PrivateConfig.SECRET_KEY,
                options);

        // Switch between dual or both position side, call: com.binance.client.examples.trade.ChangePositionSide
        OrderRequest orderRequest = OrderRequest.limitBuy("BTCUSDT", "1", "9000");
        System.out.println(syncRequestClient.postOrder(orderRequest));
    }
}