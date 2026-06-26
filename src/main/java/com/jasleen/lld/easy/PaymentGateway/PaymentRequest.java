package com.jasleen.lld.easy.PaymentGateway;

public class PaymentRequest {

    private Double amount;
    private String currency;
    private ProviderType provider;
    private String idempotencyKey;

    public PaymentRequest(Double amount, String currency, ProviderType provider, String idempotencyKey){
        this.amount = amount;
        this.currency = currency;
        this.provider = provider;
        this.idempotencyKey = idempotencyKey;
    }

    public Double getAmount() {
        return amount;
    }

    public String getCurrency() {
        return currency;
    }

    public ProviderType getProvider() {
        return provider;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setProvider(ProviderType provider) {
        this.provider = provider;
    }

    public String getIdempotencyKey() {
        return idempotencyKey;
    }

    public void setIdempotencyKey(String idempotencyKey) {
        this.idempotencyKey = idempotencyKey;
    }
}
