package com.jasleen.lld.medium.ATMMachine;

import com.jasleen.lld.easy.VendingMachine.Idle;

public class CardBlockedState implements ATMState{
    ATMStateContext context;

    public CardBlockedState(ATMStateContext context){
        this.context = context;
    }

    @Override
    public void insertCard(Card card) {
        return;
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
    public void checkMiniStatement() {

    }

    @Override
    public void transactionCompleted() {

    }

    @Override
    public void ejectCard() {
        context.getCardReader().ejectCard();
        context.setState(new IdleState(context));
    }

    @Override
    public void cashDepleted() {

    }

    @Override
    public void refillCash() {

    }
}
