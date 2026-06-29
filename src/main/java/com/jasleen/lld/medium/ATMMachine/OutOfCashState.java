package com.jasleen.lld.medium.ATMMachine;

public class OutOfCashState implements ATMState{
    private ATMStateContext context;

    public OutOfCashState(ATMStateContext context){
        this.context = context;
    }


    @Override
    public void insertCard(Card card) {
        return;
    }

    @Override
    public void enterPin(String pin) {
        return;
    }

    @Override
    public void withdrawCash(Double amount) {
        return;
    }

    @Override
    public void depositCash(Double amount) {
        return;
    }

    @Override
    public void checkBalance() {
        return;
    }

    @Override
    public void changePin(String pin) {
        return;
    }

    @Override
    public void checkMiniStatement() {

    }

    @Override
    public void transactionCompleted() {
        return;
    }

    @Override
    public void ejectCard() {
        return;
    }

    @Override
    public void cashDepleted() {
        return;
    }

    @Override
    public void refillCash() {
        context.setState(new IdleState(context));
    }
}
