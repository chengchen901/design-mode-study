package com.study.strategy.service;

import com.study.strategy.factory.CalculationFactory;

public class OrderService {

    private CalculationFactory calculationFactory = new CalculationFactory();

    public double payOrder(double price, String type) {
        return calculationFactory.getPayCalculation(type).calculationPrice(price);
    }
}
