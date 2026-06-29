package com.jasleen.lld.medium.ATMMachine;

public class AcceptingState implements ATMState {
    ATMStateContext atmStateContext;

    public AcceptingState(ATMStateContext atmStateContext){
        this.atmStateContext = atmStateContext;
    }

    @Override
    public void insertCard(Card card) {

    }

    @Override
    public void enterPin(String pin) {

    }

    @Override
    public void withdrawCash(Double amount) {

    }

    @Override
    public void depositCash(Double amount) {

    }

    @Override
    public void checkBalance() {

    }

    @Override
    public void changePin(String pin) {

    }

    @Override
    public void transactionCompleted() {

    }

    @Override
    public void ejectCard() {

    }

    @Override
    public void cashDepleted() {

    }

    @Override
    public void refillCash() {

    }
}
