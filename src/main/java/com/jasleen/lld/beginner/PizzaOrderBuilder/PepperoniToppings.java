package com.jasleen.lld.beginner.PizzaOrderBuilder;

public class PepperoniToppings implements Toppings{
    @Override
    public String getName() {
        return "pepperoni";
    }

    @Override
    public double getPrice() {
        return 100;
    }
}
