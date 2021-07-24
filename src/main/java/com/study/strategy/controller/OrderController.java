package com.study.strategy.controller;

import com.study.strategy.service.OrderService;

public class OrderController {

    public static void main(String[] args) {
        OrderService orderService = new OrderService();

        double vipPrice = orderService.payOrder(100D, "vip");
        System.out.println(vipPrice);

        double normalPrice = orderService.payOrder(100D, "normal");
        System.out.println(normalPrice);

        double platinumPrice = orderService.payOrder(100D, "platinum");
        System.out.println(platinumPrice);
    }
}
