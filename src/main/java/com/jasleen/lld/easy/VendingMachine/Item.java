package com.jasleen.lld.easy.VendingMachine;

public class Item {

    private String code;
    private String price;
    private String name;

    public Item(){

    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
