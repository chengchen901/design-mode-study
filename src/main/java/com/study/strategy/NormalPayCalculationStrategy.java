package com.study.strategy;

public class NormalPayCalculationStrategy implements PayCalculationStrategy {

    public double calculationPrice(double price) {
        return price;
    }
}
