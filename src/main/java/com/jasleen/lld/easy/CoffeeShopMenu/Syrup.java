package com.jasleen.lld.easy.CoffeeShopMenu;

public class Syrup implements BeverageAddOns{

    Beverage beverage;

    public Syrup(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getName() {
        return beverage.getName() + "with syrup ($30.0)";
    }

    @Override
    public Double getPrice() {
        return beverage.getPrice() + 30.0;
    }
}
