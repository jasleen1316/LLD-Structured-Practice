package com.jasleen.lld.easy.PaymentGateway;

public class StripeGatewayAdaptor implements PaymentGateway {

    StripeGateway stripeGateway = new StripeGateway();

    @Override
    public PaymentResponse charge(PaymentRequest request) {
        return new PaymentResponse(mapToResponseType(stripeGateway.charge(request.getCurrency(), request.getAmount(), request.getIdempotencyKey())));
    }

    @Override
    public PaymentResponse refund(RefundRequest request) {
        return new PaymentResponse(mapToResponseType(stripeGateway.refund(request.getCurrency(), request.getAmount(), request.getTransactionId())));
    }

    private ResponseType mapToResponseType(String stripeStatus) {
        switch (stripeStatus) {
            case "SUCCESS":   return ResponseType.SUCCESS;
            case "FAILED":    return ResponseType.NON_RETRYABLE_FAILURE;
            default:          return ResponseType.RETRYABLE_FAILURE;
        }
    }
}
