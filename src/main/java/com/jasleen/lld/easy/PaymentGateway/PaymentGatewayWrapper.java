package com.jasleen.lld.easy.PaymentGateway;

public class PaymentGatewayWrapper {

    PaymentGatewayFactory factory;

    public PaymentGatewayWrapper(PaymentGatewayFactory factory){
        this.factory = factory;
    }

    public PaymentResponse charge(PaymentRequest request){
        PaymentGateway gateway = factory.getGateway(request.getProvider());

        int retryCount = 0;
        while(retryCount < 5){
            PaymentResponse response = gateway.charge(request);
            if(response.getStatus().equals(ResponseType.RETRYABLE_FAILURE)) retryCount++;
            else return response;
        }

        return new PaymentResponse(ResponseType.RETRY_EXHAUSTED);
    }

    public PaymentResponse refund(RefundRequest request){
        PaymentGateway gateway = factory.getGateway(request.getProvider());

        int retryCount = 0;
        while(retryCount < 5){
            PaymentResponse response = gateway.refund(request);
            if(response.getStatus().equals(ResponseType.RETRYABLE_FAILURE)) retryCount++;
            else return response;
        }

        return new PaymentResponse(ResponseType.RETRY_EXHAUSTED);
    }

}
