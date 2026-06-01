package com.jasleen.lld.easy.CoffeeShopMenu;

public class RegularMilk implements BeverageAddOns{

    Beverage beverage;

    public RegularMilk(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getName() {
        return beverage.getName() + "with regular milk ($50.0)";
    }

    @Override
    public Double getPrice() {
        return beverage.getPrice() + 50.0;
    }
}
