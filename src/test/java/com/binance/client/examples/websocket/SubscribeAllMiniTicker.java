package com.binance.client.examples.websocket;

import com.binance.client.SubscriptionClient;

public class SubscribeAllMiniTicker {

    public static void main(String[] args) throws InterruptedException {

        SubscriptionClient client = SubscriptionClient.create();
        client.subscribeAllMiniTickerEvent((System.out::println), null);

        Thread.sleep(120000);
        client.unsubscribeAll();
    }
}
