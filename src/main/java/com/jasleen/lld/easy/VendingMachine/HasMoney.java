package com.jasleen.lld.easy.VendingMachine;

public class HasMoney implements VendingMachineState{

    private VendingMachine vendingMachine;

    public HasMoney(VendingMachine vendingMachine){
        this.vendingMachine = vendingMachine;
    }

    @Override
    public VendingMachineState addCoin(double coin, int count) {

        return this;
    }

    @Override
    public VendingMachineState chooseItem() {
        return new Dispensing();
    }

    @Override
    public VendingMachineState returnCoin() {
        return new Idle(vendingMachine);
    }

    @Override
    public VendingMachineState dispense() {
        return this;
    }

    @Override
    public VendingMachineState refill(int code, int count) {
        return this;
    }
}
