package com.jasleen.lld.easy.VendingMachine;

public class Dispensing implements VendingMachineState{

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
        return null;
    }

    @Override
    public VendingMachineState refill(int code, int count) {
        return null;
    }
}
