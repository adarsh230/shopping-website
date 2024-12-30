package com.techie.microservices.order.service;

import com.techie.microservices.order.dto.OrderRequest;

public interface OrderService {
    public void placeOrder(OrderRequest orderRequest);
}
