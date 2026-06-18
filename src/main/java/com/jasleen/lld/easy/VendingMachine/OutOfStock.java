package com.jasleen.lld.easy.VendingMachine;

public class OutOfStock implements VendingMachineState{

    @Override
    public VendingMachineState addCoin(double coin, int count) {
        return null;
    }

    @Override
    public VendingMachineState chooseItem() {
        return this;
    }

    @Override
    public VendingMachineState returnCoin() {
        return this;
    }

    @Override
    public VendingMachineState dispense() {
        return this;
    }

    @Override
    public VendingMachineState refill(int code, int count) {
        return null;
    }

}
