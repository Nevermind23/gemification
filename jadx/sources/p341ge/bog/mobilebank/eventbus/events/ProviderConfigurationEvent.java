package p341ge.bog.mobilebank.eventbus.events;

import org.parceler.Parcel;
import p341ge.bog.mobilebank.eventbus.RootEvent;
import p341ge.bog.mobilebank.model.payment.PaymentProviderConfiguration;

@Parcel
/* renamed from: ge.bog.mobilebank.eventbus.events.ProviderConfigurationEvent */
public class ProviderConfigurationEvent extends RootEvent {
    PaymentProviderConfiguration configuration;
    Object instance;
    String serviceId;

    public PaymentProviderConfiguration getConfiguration() {
        return this.configuration;
    }

    public Object getInstance() {
        return this.instance;
    }

    public String getServiceId() {
        return this.serviceId;
    }

    public void setConfiguration(PaymentProviderConfiguration paymentProviderConfiguration) {
        this.configuration = paymentProviderConfiguration;
    }

    public void setInstance(Object obj) {
        this.instance = obj;
    }

    public void setServiceId(String str) {
        this.serviceId = str;
    }
}
