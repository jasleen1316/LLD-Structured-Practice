package com.jasleen.lld.easy.VendingMachine;

import java.util.HashMap;

public class VendingMachine {

//    private static VendingMachine vendingMachine;
    private HashMap<Integer, Integer> stock;
    private double currentMoney;
    private VendingMachineState vendingMachineState;

    public VendingMachine(){
        stock = new HashMap<>();
        currentMoney = 0;
        vendingMachineState = new Idle(this);
    }

//    public static VendingMachine getVendingMachine(){
//        if(vendingMachine == null){
//            vendingMachine = new VendingMachine();
//            stock = new HashMap<>();
//            currentMoney = 0;
//            vendingMachineState = new Idle().setVendingMachine(vendingMachine);
//        }
//
//        return vendingMachine;
//    }

    public void insertCoin(double coin, int count){
        vendingMachineState = vendingMachineState.addCoin(coin, count);
    }

    public void setStock(HashMap<Integer, Integer> stock) {
        this.stock = stock;
    }

    public void setCurrentMoney(double currentMoney) {
        this.currentMoney = currentMoney;
    }

    public double getCurrentMoney() {
        return currentMoney;
    }

    public HashMap<Integer, Integer> getStock() {
        return stock;
    }
}
