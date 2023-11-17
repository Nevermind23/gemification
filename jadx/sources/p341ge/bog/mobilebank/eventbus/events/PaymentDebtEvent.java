package p341ge.bog.mobilebank.eventbus.events;

import p341ge.bog.mobilebank.eventbus.RootEvent;
import p341ge.bog.mobilebank.model.payment.PaymentDebtResponse;

/* renamed from: ge.bog.mobilebank.eventbus.events.PaymentDebtEvent */
public class PaymentDebtEvent extends RootEvent {
    private Object mInstance;
    private PaymentDebtResponse paymentDebt;

    public Object getInstance() {
        return this.mInstance;
    }

    public PaymentDebtResponse getPaymentDebt() {
        return this.paymentDebt;
    }

    public void setInstance(Object obj) {
        this.mInstance = obj;
    }

    public void setPaymentDebt(PaymentDebtResponse paymentDebtResponse) {
        this.paymentDebt = paymentDebtResponse;
    }
}
