package com.order.Controller;


import com.order.Service.OrderService;
import org.apache.kafka.common.protocol.types.Field;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/order")
    public String sendOrder(@RequestParam("type") String type, @RequestParam("price") Integer price){
        Map<String,Integer> order = new HashMap<>();
        order.put(type,price);
        return this.orderService.sendOrder(order);
    }
}
