package com.jasleen.lld.easy.CoffeeShopMenu;

public class VeganMilk implements BeverageAddOns{

    Beverage beverage;

    public VeganMilk(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getName() {
        return beverage.getName() + "with vegan milk ($70.0)";
    }

    @Override
    public Double getPrice() {
        return beverage.getPrice() + 70.0;
    }
}
