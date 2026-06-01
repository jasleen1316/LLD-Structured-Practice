package com.jasleen.lld.easy.CoffeeShopMenu;

public class BeverageBuilder {

    public Beverage buildBeverage(String baseBeverage, String... addOns){
        Beverage beverage = null;
        if(baseBeverage.equals("coffee")) {
            beverage = new Coffee();
            for(String addOn : addOns){
                beverage = addAddOns(addOn, beverage);
            }
        } else if(baseBeverage.equals("tea")){
            beverage = new Tea();
            for(String addOn : addOns){
                beverage = addAddOns(addOn, beverage);
            }
        }else if (baseBeverage.equals("juice")){
            beverage = new Juice();
            for(String addOn : addOns){
                beverage = addAddOns(addOn, beverage);
            }
        }

        return beverage;

    }

    private Beverage addAddOns(String addOn, Beverage beverage){
        if(addOn.equals("regular milk")){
            return new RegularMilk(beverage);
        }else if(addOn.equals("vegan milk")){
            return new VeganMilk(beverage);
        }else if(addOn.equals("sugar")){
            return new Sugar(beverage);
        }else if(addOn.equals("syrup")){
            return new Syrup(beverage);
        }else return beverage;
    }

}
