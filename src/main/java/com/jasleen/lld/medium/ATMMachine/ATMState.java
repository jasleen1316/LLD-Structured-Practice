package com.jasleen.lld.medium.ATMMachine;

public interface ATMState {

    void insertCard(Card card);
    void enterPin(String pin);
    void withdrawCash(Double amount);
    void depositCash(Double amount);
    void checkBalance();
    void changePin(String pin);
    void checkMiniStatement();
    void transactionCompleted();
    void ejectCard();
    void cashDepleted();
    void refillCash();

}
