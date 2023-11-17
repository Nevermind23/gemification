package p341ge.bog.mobilebank.eventbus.events;

import p341ge.bog.mobilebank.eventbus.RootEvent;
import p341ge.bog.mobilebank.model.payment.PaymentProviderConfiguration;

/* renamed from: ge.bog.mobilebank.eventbus.events.PaymentCategoriesDownloadEvent */
public class PaymentCategoriesDownloadEvent extends RootEvent {
    private PaymentProviderConfiguration[] mPaymentProviderConfiguration;

    public PaymentCategoriesDownloadEvent(PaymentProviderConfiguration[] paymentProviderConfigurationArr) {
        this.mPaymentProviderConfiguration = paymentProviderConfigurationArr;
    }

    public PaymentProviderConfiguration[] getmPaymentProviderConfiguration() {
        return this.mPaymentProviderConfiguration;
    }

    public void setmPaymentProviderConfiguration(PaymentProviderConfiguration[] paymentProviderConfigurationArr) {
        this.mPaymentProviderConfiguration = paymentProviderConfigurationArr;
    }
}
