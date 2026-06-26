package com.jasleen.lld.easy.PaymentGateway;

public class PaymentResponse {

    private ResponseType status;

    public PaymentResponse(ResponseType status){
        this.status = status;
    }

    public ResponseType getStatus() {
        return status;
    }

    public void setStatus(ResponseType status) {
        this.status = status;
    }
}
