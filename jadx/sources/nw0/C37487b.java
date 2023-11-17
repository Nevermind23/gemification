package nw0;

import p341ge.bog.mobilebank.eventbus.events.PaymentDebtEvent;
import p341ge.bog.mobilebank.eventbus.events.PointValueExchangeEvent;
import p341ge.bog.mobilebank.eventbus.events.ProviderConfigurationEvent;

/* renamed from: nw0.b */
public interface C37487b {
    void onDataError(String str);

    void onDebtEventSuccess(PaymentDebtEvent paymentDebtEvent);

    void onLoading(boolean z);

    void onNetworkError();

    void onPointExchangeEvent(PointValueExchangeEvent pointValueExchangeEvent);

    void onProviderConfigurationEventSuccess(ProviderConfigurationEvent providerConfigurationEvent);
}
