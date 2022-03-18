package com.binance.client.model.trade;

import com.binance.client.model.enums.NewOrderRespType;
import com.binance.client.model.enums.OrderSide;
import com.binance.client.model.enums.OrderType;
import com.binance.client.model.enums.TimeInForce;

public class OrderRequest {
    private String symbol;
    private OrderSide side;
    private OrderType orderType;
    private TimeInForce timeInForce;
    private String quantity;
    private String price;
    private String stopPrice;
    private NewOrderRespType newOrderRespType;

    private OrderRequest(
            String symbol, OrderSide side,
            OrderType orderType, TimeInForce timeInForce, String quantity,
            String price, String stopPrice, NewOrderRespType newOrderRespType) {
        this.symbol = symbol;
        this.side = side;
        this.orderType = orderType;
        this.timeInForce = timeInForce;
        this.quantity = quantity;
        this.price = price;
        this.stopPrice = stopPrice;
        this.newOrderRespType = newOrderRespType;
    }

    public String getSymbol() {
        return symbol;
    }

    public OrderSide getSide() {
        return side;
    }

    public OrderType getOrderType() {
        return orderType;
    }

    public TimeInForce getTimeInForce() {
        return timeInForce;
    }

    public String getQuantity() {
        return quantity;
    }

    public String getPrice() {
        return price;
    }

    public String getStopPrice() {
        return stopPrice;
    }

    public NewOrderRespType getNewOrderRespType() {
        return newOrderRespType;
    }

    public static OrderRequest marketBuy(String symbol, String quantity) {
        return new OrderRequest(symbol, OrderSide.BUY, OrderType.MARKET, null,
                quantity, null, null, NewOrderRespType.RESULT);
    }

    public static OrderRequest marketSell(String symbol, String quantity) {
        return new OrderRequest(symbol, OrderSide.SELL, OrderType.MARKET, null,
                quantity, null, null, NewOrderRespType.RESULT);
    }

    public static OrderRequest limitBuy(String symbol, String quantity, String price) {
        return new OrderRequest(symbol, OrderSide.BUY, OrderType.LIMIT, TimeInForce.GTC,
                quantity, price, null, NewOrderRespType.RESULT);
    }

    public static OrderRequest limitSell(String symbol, String quantity, String price) {
        return new OrderRequest(symbol, OrderSide.SELL, OrderType.LIMIT, TimeInForce.GTC,
                quantity, price, null, NewOrderRespType.RESULT);
    }

    public static OrderRequest stopLossBuy(String symbol, String quantity, String price, String stopPrice) {
        return new OrderRequest(symbol, OrderSide.BUY, OrderType.STOP, TimeInForce.GTC,
                quantity, price, stopPrice, NewOrderRespType.RESULT);
    }

    public static OrderRequest stopLossSell(String symbol, String quantity, String price, String stopPrice) {
        return new OrderRequest(symbol, OrderSide.SELL, OrderType.STOP, TimeInForce.GTC,
                quantity, price, stopPrice, NewOrderRespType.RESULT);
    }
}
