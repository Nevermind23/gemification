package p341ge.bog.mobilebank.eventbus.event;

import p341ge.bog.mobilebank.model.CcyRatesWrapper;

/* renamed from: ge.bog.mobilebank.eventbus.event.CcyRatesSuccessEvent */
public class CcyRatesSuccessEvent {
    private CcyRatesWrapper rates;

    public CcyRatesSuccessEvent(CcyRatesWrapper ccyRatesWrapper) {
        this.rates = ccyRatesWrapper;
    }

    public CcyRatesWrapper getRates() {
        return this.rates;
    }

    public void setRates(CcyRatesWrapper ccyRatesWrapper) {
        this.rates = ccyRatesWrapper;
    }
}
