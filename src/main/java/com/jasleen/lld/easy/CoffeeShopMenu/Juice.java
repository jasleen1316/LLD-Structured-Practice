package com.jasleen.lld.easy.CoffeeShopMenu;

public class Juice implements Beverage{
    @Override
    public String getName() {
        return "Freshly Pressed Juice ($50.0)";
    }

    @Override
    public Double getPrice() {
        return 50.0;
    }
}
