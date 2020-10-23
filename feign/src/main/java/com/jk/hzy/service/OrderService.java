package com.jk.hzy.service;

import com.jk.hzy.entity.Order;
import com.jk.hzy.entity.UserEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "order-provider")
public interface OrderService {

    @RequestMapping("orderList")
    public List<Order> orderList();

    @RequestMapping("OrderDelete")
    public void OrderDelete(@RequestParam Integer oederId);

    @RequestMapping("orderAdd")
    public void orderAdd(@RequestBody Order order);

    @RequestMapping("selectOrderById")
    public Order selectOrderById(@RequestParam Integer oederId);

    @RequestMapping("orderUpdate")
    public void orderUpdate(@RequestBody Order order);
}
