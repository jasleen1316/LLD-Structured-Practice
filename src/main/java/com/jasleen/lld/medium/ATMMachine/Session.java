package com.jasleen.lld.medium.ATMMachine;

public class Session implements ATMStateContext{
    private BankBackendService bankBackendService;
    private Card card;
    private ATMState currentState;
    private CashDispenser cashDispenser;
    private CardReader cardReader;
    private Display display;

    public Session(BankBackendService bankBackendService, CashDispenser cashDispenser, CardReader cardReader, Display display){
        this.bankBackendService = bankBackendService;
        this.cashDispenser = cashDispenser;
        this.cardReader = cardReader;
        currentState = new IdleState(this);
        this.display = display;
    }

    @Override
    public void setState(ATMState state) {
        this.currentState = state;
    }

    @Override
    public ATMState getState() {
        return currentState;
    }

//    @Override
//    public Card getCard() {
//        return card;
//    }
//
//    @Override
//    public void setCard() {
//        this.card = card;
//    }

    @Override
    public CashDispenser getCashDispenser() {
        return cashDispenser;
    }

    @Override
    public BankBackendService getBankBackendService() {
        return bankBackendService;
    }

    @Override
    public CardReader getCardReader() {
        return cardReader;
    }

    @Override
    public Display getDisplay() {
        return display;
    }

    public void insertCard(Card card){
        currentState.insertCard(card);
    }

    public void enterPin(String pin){
        currentState.enterPin(pin);
    }

    public void withdrawCash(Double amount) {
        currentState.withdrawCash(amount);
    }

    public void depositCash(Double amount) {
        currentState.depositCash(amount);
    }

    public void checkBalance(){
        currentState.checkBalance();
    }

    public void changePin(String newPin){
        currentState.changePin(newPin);
    }

    public void miniStatement(){
        currentState.checkMiniStatement();
    }

    public void finishTransaction(){
        currentState.transactionCompleted();
    }

    public void exit(){
        currentState.ejectCard();
    }
}
