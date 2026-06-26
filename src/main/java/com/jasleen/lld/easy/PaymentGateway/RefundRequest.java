package com.jasleen.lld.easy.PaymentGateway;

public class RefundRequest {

    private String transactionId;
    private String currency;
    private Double amount;
    private ProviderType provider;

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCurrency() {
        return currency;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public void setProvider(ProviderType provider) {
        this.provider = provider;
    }

    public ProviderType getProvider() {
        return provider;
    }
}
