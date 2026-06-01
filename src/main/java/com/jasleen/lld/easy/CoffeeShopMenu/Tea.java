package com.jasleen.lld.easy.CoffeeShopMenu;

public class Tea implements Beverage {


    @Override
    public String getName() {
        return "Freshly Brewed Signature Tea ($100.0)";
    }

    @Override
    public Double getPrice() {
        return 100.0;
    }
}
