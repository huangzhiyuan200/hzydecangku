package com.jk.hzy.controller;

import com.jk.hzy.entity.Order;
import com.jk.hzy.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping("orderList")
    public String orderList(Model model){
        List<Order> orders = orderService.orderList();
        model.addAttribute("orderList",orders);
        return "orderList";
    }

    @RequestMapping("OrderDelete1")
    public String OrderDelete(@RequestParam Integer oederId){
        orderService.OrderDelete(oederId);
        return "redirect:orderList";
    }

    @RequestMapping("orderAdd")
    public void orderAdd(Order order){
        orderService.orderAdd(order);
    }

    @RequestMapping("goAdd")
    public String addOrder(Model model){
        model.addAttribute("order",new Order());
        return "orderAdd";
    }

    @RequestMapping("selectOrderById")
    public String selectOrderById(@RequestParam Integer oederId,Model model){
        model.addAttribute("order",orderService.selectOrderById(oederId));
        return "orderUpdate";
    }

    @RequestMapping("orderUpdate")
    public String orderUpdate(Order order){
        orderService.orderUpdate(order);
        return "redirect:orderList";
    }


}
