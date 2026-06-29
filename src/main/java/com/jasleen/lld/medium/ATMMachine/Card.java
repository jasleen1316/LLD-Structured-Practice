package com.jasleen.lld.medium.ATMMachine;

public class Card {

    private String bankCode;
    private String cardNumber;
    private User userDetails;

    public String getBankCode() {
        return bankCode;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public User getUserDetails() {
        return userDetails;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public void setUserDetails(User userDetails) {
        this.userDetails = userDetails;
    }
}
