package com.jasleen.lld.easy.CoffeeShopMenu;

public class Coffee implements Beverage{
    @Override
    public String getName() {
        return "Freshly Brewed Signature Coffee ($150.0)";
    }

    @Override
    public Double getPrice() {
        return 150.0;
    }
}
