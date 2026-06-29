package com.jasleen.lld.medium.ATMMachine;

import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class TransactionSelectionState implements ATMState{
    private ATMStateContext context;

    public TransactionSelectionState(ATMStateContext context){
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
        if(!context.getCashDispenser().isAmountValid(amount)){
            context.getDisplay().show("Entered amount is invalid");
            context.setState(new TransactionSelectionState(context));
        } else if(!context.getCashDispenser().isCashSufficient(amount)){
            context.getDisplay().show("Insufficent cash in ATM");
            context.setState(new OutOfCashState(context));
        }else{
            context.getDisplay().show("Dispensing Cash");
            context.setState(new DispensingState(context));
            context.getState().transactionCompleted();
        }
    }

    @Override
    public void depositCash(Double amount) {
        if(!context.getCashDispenser().isAmountValid(amount)){
            System.out.println("Entered amount is invalid");
            context.setState(new TransactionSelectionState(context));
        } else{
            context.setState(new AcceptingState(context));
        }
    }

    @Override
    public void checkBalance() {
        BankBackendService bankBackendService = context.getBankBackendService();
        Double bankBalance = bankBackendService.getBalance(context.getCardReader().getCard().getCardNumber());
        System.out.println("Current Bank Balance: $" + bankBalance);
        context.setState(new TransactionSelectionState(context));
    }

    @Override
    public void changePin(String pin) {
        if(StringUtils.isBlank(pin) || pin.length() > 6){
            throw new RuntimeException("PIN FORMAT INCORRECT");
        }

        BankBackendService bankBackendService = context.getBankBackendService();
        bankBackendService.changePin(context.getCardReader().getCard().getCardNumber());
        context.setState(new TransactionSelectionState(context));
    }

    @Override
    public void checkMiniStatement() {
        BankBackendService bankBackendService = context.getBankBackendService();
        List<BankTransactions> statement = bankBackendService.getMiniStatement(context.getCardReader().getCard().getCardNumber());
        // print statement
        context.setState(new TransactionSelectionState(context));
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
