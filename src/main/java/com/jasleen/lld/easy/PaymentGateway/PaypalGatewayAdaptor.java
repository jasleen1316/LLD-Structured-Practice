package com.jasleen.lld.easy.PaymentGateway;

public class PaypalGatewayAdaptor implements PaymentGateway {
    @Override
    public PaymentResponse charge(PaymentRequest request) {
        return null;
    }

    @Override
    public PaymentResponse refund(RefundRequest request) {
        return null;
    }
}
