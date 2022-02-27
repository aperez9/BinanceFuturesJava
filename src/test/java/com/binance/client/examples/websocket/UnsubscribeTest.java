package com.binance.client.examples.websocket;

import com.binance.client.SubscriptionClient;
import com.binance.client.model.enums.CandlestickInterval;
import org.junit.Test;

public class UnsubscribeTest {

    @Test
    public void unsubscribeTest() throws InterruptedException {

        SubscriptionClient client = SubscriptionClient.create();
   
        client.subscribeCandlestickEvent("btcusdt", CandlestickInterval.ONE_MINUTE, (System.out::println), null);

        Thread.sleep(4000);
        client.unsubscribeAll();
        Thread.sleep(4000);

        client.subscribeCandlestickEvent("ethusdt", CandlestickInterval.ONE_MINUTE, (System.out::println), null);

        Thread.sleep(4000);
        client.unsubscribeAll();
        Thread.sleep(4000);
    }

}
