package com.jasleen.lld.easy.VendingMachine;

public interface VendingMachineState {

    public VendingMachineState addCoin(double coin, int count);

    public VendingMachineState chooseItem();

    public VendingMachineState returnCoin();

    public  VendingMachineState dispense();

    public VendingMachineState refill(int code, int count);

}
