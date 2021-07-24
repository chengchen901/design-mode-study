package com.study.status;

public class SoldState implements State {
    private CoffeeMachine machine;

    public SoldState(CoffeeMachine machine) {
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
