package com.jk.hzy.service;

import com.jk.hzy.dao.OrderMapper;
import com.jk.hzy.entity.Order;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderMapper orderMapper;

    @Override
    public List<Order> orderList() {
        return orderMapper.orderList();
    }

    @Override
    public void OrderDelete(Integer oederId) {
        orderMapper.OrderDelete(oederId);
    }

    @Override
    public void orderAdd(Order order) {
        orderMapper.orderAdd(order);
    }

    @Override
    public Order selectOrderById(Integer oederId) {
        return orderMapper.selectOrderById(oederId);
    }

    @Override
    public void orderUpdate(Order order) {
        orderMapper.orderUpdate(order);
    }
}
