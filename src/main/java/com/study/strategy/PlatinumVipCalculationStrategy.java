package com.study.strategy;

public class PlatinumVipCalculationStrategy implements PayCalculationStrategy {

    public double calculationPrice(double price) {
        return price * 0.6;
    }
}
