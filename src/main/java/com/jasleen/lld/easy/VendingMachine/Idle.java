package com.jasleen.lld.easy.VendingMachine;

import java.util.HashMap;

public class Idle implements VendingMachineState{

    private VendingMachine vendingMachine;

    public Idle(VendingMachine vendingMachine){
        this.vendingMachine = vendingMachine;
    }

    @Override
    public VendingMachineState addCoin(double coin, int count) {
        if(coin != 1.0 && coin != 5.0 && coin != 10.0){
            System.out.printf("coin denomination %s is not accepted", coin);
            return this;
        }

        vendingMachine.setCurrentMoney(coin*count);
        return new HasMoney(vendingMachine);
    }

    @Override
    public VendingMachineState chooseItem() {
        System.out.println("pls add coin before selecting item");
        return this;
    }

    @Override
    public VendingMachineState returnCoin() {
        System.out.println("pls add coin before returning coin");
        return this;
    }

    @Override
    public VendingMachineState dispense() {
        System.out.println("pls add coin before dispensing item");
        return this;
    }

    @Override
    public VendingMachineState refill(int code, int count) {
        HashMap<Integer, Integer> stock = vendingMachine.getStock();
        int currentCount = stock.getOrDefault(code, 0);
        stock.put(code, Math.min(currentCount+count, 10));
        return this;
    }
}
