package com.jasleen.lld.easy.PaymentGateway;

public class StripeGateway {

    public String charge(String currency, Double amount, String key){
        // do processing
        return "SUCCESS";
    }

    public String refund(String currency, Double amount, String id){
        // do processing
        return "SUCCESS";
    }
}
