package com.jasleen.lld.easy.PaymentGateway;

public class PaymentGatewayFactory {

    public PaymentGateway getGateway(ProviderType provider){
        switch (provider) {
            case UPI: return new UpiGatewayAdaptor();
            case STRIPE: return new StripeGatewayAdaptor();
            case PAYPAL: return new PaypalGatewayAdaptor();
            default:
                throw new IllegalArgumentException(
                    "Unsupported provider: " + provider
            );
        }
    }

}
