package com.jk.hzy.service;

import com.jk.hzy.entity.Order;

import java.util.List;

public interface OrderService {
    List<Order> orderList();

    void OrderDelete(Integer oederId);

    void orderAdd(Order order);

    Order selectOrderById(Integer oederId);

    void orderUpdate(Order order);
}
