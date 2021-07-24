package com.study.strategy;

public class VipPayCalculationStrategy implements PayCalculationStrategy {

    public double calculationPrice(double price) {
        return price * 0.7;
    }
}
