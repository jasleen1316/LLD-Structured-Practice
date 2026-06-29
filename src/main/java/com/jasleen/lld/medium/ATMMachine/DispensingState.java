package com.jasleen.lld.medium.ATMMachine;

import com.jasleen.lld.easy.PaymentGateway.PaymentResponse;

import java.util.Map;
import java.util.TreeMap;

public class DispensingState implements ATMState{
    private ATMStateContext context;

    public DispensingState(ATMStateContext context){
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
        BankBackendService bankBackendService = context.getBankBackendService();
        Double bankBalance = bankBackendService.getBalance(context.getCardReader().getCard().getCardNumber());

        if(context.getCashDispenser().getAmountToBeDispensed() > bankBalance){
            context.getDisplay().show("Bank Balance is not enough");
            context.setState(new TransactionSelectionState(context));
            return;
        }

        boolean dispensed = context.getCashDispenser().dispenseCash();

        if(dispensed) {
            context.getDisplay().show("Dispensed Cash");
            context.setState(new TransactionSelectionState(context));
        } else {
            this.cashDepleted();
        }
    }

    @Override
    public void ejectCard() {
        return;
    }

    @Override
    public void cashDepleted() {
        context.setState(new OutOfCashState(context));
    }

    @Override
    public void refillCash() {

    }
}
