package com.jasleen.lld.easy.PaymentGateway;

public enum ResponseType {

    SUCCESS,
    NON_RETRYABLE_FAILURE,
    RETRYABLE_FAILURE,
    RETRY_EXHAUSTED;

}
