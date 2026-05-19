package com.jasleen.lld.beginner.PizzaOrderBuilder;

public enum Size {

    SMALL(100),
    MEDIUM(150),
    LARGE(200);

    private final double price;

    Size(double price){
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
