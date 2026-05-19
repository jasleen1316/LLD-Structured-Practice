package com.jasleen.lld.beginner.PizzaOrderBuilder;

public class CheeseTopping implements Toppings{
    @Override
    public String getName() {
        return "cheese";
    }

    @Override
    public double getPrice() {
        return 50;
    }
}
