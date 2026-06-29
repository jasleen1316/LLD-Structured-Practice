package com.jasleen.lld.medium.ATMMachine;

public interface ATMStateContext {

    void setState(ATMState state);
    ATMState getState();
//    Card getCard();
//    void setCard(Card card);
    CashDispenser getCashDispenser();
    BankBackendService getBankBackendService();
    CardReader getCardReader();
    Display getDisplay();
}
