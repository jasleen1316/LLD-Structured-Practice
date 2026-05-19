package com.jasleen.lld.beginner.PizzaOrderBuilder;

public enum Crust {

    THIN_CRUST(10),
    CHEESE_BURST(20),
    HAND_TOSSED(30);

    private final double price;

    Crust(double price){
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
