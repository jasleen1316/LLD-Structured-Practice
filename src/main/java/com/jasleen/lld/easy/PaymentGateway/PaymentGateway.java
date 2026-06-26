package com.jasleen.lld.easy.PaymentGateway;

public interface PaymentGateway {

    PaymentResponse charge(PaymentRequest request);

    PaymentResponse refund(RefundRequest request);

}
