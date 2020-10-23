package com.jk.hzy.controller;

import com.jk.hzy.entity.Order;
import com.jk.hzy.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping("orderList")
    public List<Order> orderList(){
        return orderService.orderList();
    }

    @RequestMapping("OrderDelete")
    public void OrderDelete(@RequestParam Integer oederId){
        orderService.OrderDelete(oederId);
    }

    @RequestMapping("orderAdd")
    public void orderAdd(@RequestBody Order order){
        orderService.orderAdd(order);
    }

    @RequestMapping("selectOrderById")
    public Order selectOrderById(@RequestParam Integer oederId){
        return orderService.selectOrderById(oederId);
    }

    @RequestMapping("orderUpdate")
    public void orderUpdate(@RequestBody Order order){
        orderService.orderUpdate(order);
    }


}
