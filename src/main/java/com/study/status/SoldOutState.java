package com.study.status;

public class SoldOutState implements State {
    private CoffeeMachine machine;

    public SoldOutState(CoffeeMachine machine) {
        this.machine = machine;
    }

    @Override
    public void pay() {

    }

    @Override
    public void refund() {

    }

    @Override
    public void buy() {

    }

    @Override
    public void getCoffee() {

    }
}
