package com.jasleen.lld.medium.ATMMachine;

import java.util.List;

public interface BankBackendService {

    boolean authenticateCard(String pin, String cardNumber);
    Double getBalance(String cardNumber);
    boolean changePin(String cardNumber);
    List<BankTransactions> getMiniStatement(String cardNumber);
}
