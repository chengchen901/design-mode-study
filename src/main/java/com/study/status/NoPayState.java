package com.study.status;

public class NoPayState implements State {
    private CoffeeMachine machine;

    public NoPayState(CoffeeMachine machine) {
        this.machine = machine;
    }

    @Override
    public void pay() {
        System.out.println("支付成功，请去确定购买咖啡");
        this.machine.state = this.machine.PAY;
    }

    @Override
    public void refund() {
        System.out.println("你尚未支付，请不要乱按");
    }

    @Override
    public void buy() {
        System.out.println("你尚未支付，请不要乱按");
    }

    @Override
    public void getCoffee() {
        System.out.println("你尚未支付，请不要乱按");
    }
}
