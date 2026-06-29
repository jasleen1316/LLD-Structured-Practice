package com.jasleen.lld.medium.ATMMachine;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CashDispenser {

    private Map<Double, Integer> availableCash;
    private Double totalAvailableCash;
    private Double amountToBeDispensed;

    public void setAvailableCash(Map<Double, Integer> availableCash) {
        this.availableCash = availableCash;
    }

    public Map<Double, Integer> getAvailableCash() {
        return availableCash;
    }

    public void dispenseCash(Map<Double, Integer> dispense){
        System.out.println("dispensing cash");
        Double total = 0.0;
        for(Map.Entry<Double, Integer> entry: dispense.entrySet()){
            System.out.println("cash denomination : $" + entry.getKey());
            System.out.println("cash number : " + entry.getValue());
            total += (entry.getKey()* entry.getValue());
        }

        System.out.println("Total Cash Withdrawn : $" + total);
    }

    public void acceptCash(){

    }

    public void setAmountToBeDispensed(Double amountToBeDispensed){
        this.amountToBeDispensed = amountToBeDispensed;
    }

    public Double getAmountToBeDispensed(){
        return amountToBeDispensed;
    }

    public boolean dispenseCash(){
        Map<Double, Integer> dispensedCash = new TreeMap<>();

        Double amountLeft = amountToBeDispensed;
        while(amountLeft > 0 && !availableCash.isEmpty()){
            for(Map.Entry<Double, Integer> entry: availableCash.entrySet()){
                while(amountLeft > 0 && entry.getKey() <= amountLeft && entry.getValue() > 0){
                    amountLeft -= entry.getKey();
                    entry.setValue(entry.getValue()-1);
                    dispensedCash.put(entry.getKey(), dispensedCash.getOrDefault(entry.getKey(), 0)+1);
                }
            }
        }

        if(amountLeft == 0.0) {
            totalAvailableCash -= amountToBeDispensed;
            amountToBeDispensed = 0.0;
        }

        return (amountLeft > 0.0 && !dispensedCash.isEmpty());
    }

    public boolean isAmountValid(Double amount) {
        if(amount.equals(0.0) || amount < 0.0) return false;

        Double num = amount;
        for(Double denom: availableCash.keySet()){
            if(num % denom != 0){
                num = num%denom;
            }
        }

        return num.equals(0.0);
    }

    public boolean isCashSufficient(Double amount) {
        return amount <= totalAvailableCash;
    }
}
