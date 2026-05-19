package com.jasleen.lld.beginner.PizzaOrderBuilder;

public class MushroomToppings implements Toppings{
    @Override
    public String getName() {
        return "mushroom";
    }

    @Override
    public double getPrice() {
        return 40;
    }
}
