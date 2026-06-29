package com.jasleen.lld.medium.ATMMachine;

import com.jasleen.lld.easy.VendingMachine.Idle;
import org.apache.commons.lang3.StringUtils;

public class CardInsertedState implements ATMState{
    ATMStateContext context;

    public CardInsertedState(ATMStateContext stateContext){
        this.context = stateContext;
    }

    @Override
    public void insertCard(Card card) {
        return;
    }

    @Override
    public void enterPin(String pin) {
        if(StringUtils.isBlank(pin) || pin.length() > 6){
            context.getDisplay().show("Pin format is incorrect");
        }

        BankBackendService bankBackendService = context.getBankBackendService();
        int retry = 0;
        while(retry < 3){
            boolean auth = bankBackendService.authenticateCard(pin, context.getCardReader().getCard().getCardNumber());
            if(auth){
                context.getDisplay().show("Card is authenticated");
                context.setState(new TransactionSelectionState(context));
                return;
            }
            retry++;
        }

        context.getDisplay().show("Card could not be authenticated");
        context.setState(new CardBlockedState(context));
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
        context.getCardReader().ejectCard();
        context.setState(new IdleState(context));
    }

    @Override
    public void cashDepleted() {
        return;
    }

    @Override
    public void refillCash() {
        return;
    }
}
