package com.jasleen.lld.beginner.PizzaOrderBuilder;

import java.util.List;

public class Pizza {

    private Crust crust;
    private Size size;
    private List<Toppings> toppingsList;

    protected Pizza(PizzaBuilder pizzaBuilder){
        this.size=pizzaBuilder.getSize();
        this.crust=pizzaBuilder.getCrust();
        this.toppingsList = pizzaBuilder.getToppingsList();
    }

    public double getPrice(){
        double total = 0;

        if(size != null) total += size.getPrice();

        if(crust != null) total += crust.getPrice();

        for(Toppings topping: toppingsList){
            total += topping.getPrice();
        }

        return total;
    }

    @Override
    public String toString(){

        StringBuilder sb = new StringBuilder();

        sb.append("Size: ")
                .append(size)
                .append("\nCrust: ")
                .append(crust)
                .append("\nToppings: ");

        for(Toppings topping : toppingsList){
            sb.append(topping.getName())
                    .append(" ");
        }

        sb.append("\nTotal Price: ")
                .append(getPrice());

        return sb.toString();
    }
}
