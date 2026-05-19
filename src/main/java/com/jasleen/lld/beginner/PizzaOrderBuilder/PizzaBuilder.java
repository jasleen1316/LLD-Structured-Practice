package com.jasleen.lld.beginner.PizzaOrderBuilder;

import java.util.ArrayList;
import java.util.List;

public class PizzaBuilder {

    private Size size;
    private Crust crust;
    private List<Toppings> toppingsList = new ArrayList<>();

    public PizzaBuilder withSize(Size size){
        this.size = size;
        return this;
    }

    public PizzaBuilder withCrust(Crust crust){
        this.crust = crust;
        return this;
    }

    public PizzaBuilder withTopping(Toppings topping){
        this.toppingsList.add(topping);
        return this;
    }

    public Pizza build(){
        return new Pizza(this);
    }

    public Size getSize(){
        return size;
    }

    public Crust getCrust() {
        return crust;
    }

    public List<Toppings> getToppingsList() {
        return toppingsList;
    }
}
