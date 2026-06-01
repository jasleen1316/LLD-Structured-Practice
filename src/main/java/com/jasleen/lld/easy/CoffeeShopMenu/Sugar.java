package com.jasleen.lld.easy.CoffeeShopMenu;

public class Sugar implements BeverageAddOns{

    Beverage beverage;

    public Sugar(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getName() {
        return beverage.getName() + "with sugar ($10.0)";
    }

    @Override
    public Double getPrice() {
        return beverage.getPrice() + 10.0;
    }
}
