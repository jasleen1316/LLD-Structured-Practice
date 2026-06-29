package com.jasleen.lld.medium.ATMMachine;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;

import static com.jasleen.lld.medium.ATMMachine.TransactionType.WITHDRAW_CASH;

public class ATMMachine {
    private Session session;
    private HashMap<String, BankBackendService> bankBackendRegistry;
    private CashDispenser cashDispenser;
    private CardReader cardReader;
    private Display display;

    public ATMMachine(HashMap<String, BankBackendService> bankBackendRegistry,
                      CashDispenser cashDispenser, CardReader cardReader, Display display){
        this.bankBackendRegistry = bankBackendRegistry;
        this.cashDispenser = cashDispenser;
        this.cardReader = cardReader;
        this.display = display;
    }

    public void onCardInserted(Card card){
        String bankCode = card.getBankCode();
        BankBackendService bankBackendService;
        if(bankBackendRegistry.containsKey(bankCode)){
            bankBackendService = bankBackendRegistry.get(bankCode);
            session = new Session(bankBackendService, cashDispenser, cardReader, display);
            session.insertCard(card);
        }else{
            throw new RuntimeException();
        }
    }

    public void onPinEntered(String pin){
        session.enterPin(pin);
    }

    public void onSelectTransaction(TransactionRequest transactionRequest){

        switch (transactionRequest.getType()) {
            case WITHDRAW_CASH: session.withdrawCash(transactionRequest.getAmount());
            case DEPOSIT_CASH: session.depositCash(transactionRequest.getAmount());
            case CHECK_BALANCE: session.checkBalance();
            case CHANGE_PIN: session.changePin(transactionRequest.getPin());
            case MINI_STATEMENT: session.miniStatement();
        }

    }

    public void onSelectFinish(){
        session.finishTransaction();
    }

    public void onExit(){
        session.exit();
    }

}
