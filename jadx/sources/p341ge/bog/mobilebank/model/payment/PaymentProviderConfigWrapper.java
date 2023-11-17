package p341ge.bog.mobilebank.model.payment;

import p277ua.C8664c;

/* renamed from: ge.bog.mobilebank.model.payment.PaymentProviderConfigWrapper */
public class PaymentProviderConfigWrapper {
    @C8664c("list")
    private PaymentProviderConfigurations configurations;
    private long hashCode;

    public PaymentProviderConfigurations getConfigurations() {
        return this.configurations;
    }

    public long getHashCode() {
        return this.hashCode;
    }

    public void setConfigurations(PaymentProviderConfigurations paymentProviderConfigurations) {
        this.configurations = paymentProviderConfigurations;
    }

    public void setHashCode(long j) {
        this.hashCode = j;
    }
}
