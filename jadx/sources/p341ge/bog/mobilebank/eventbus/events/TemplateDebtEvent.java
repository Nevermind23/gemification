package p341ge.bog.mobilebank.eventbus.events;

import org.parceler.Parcel;
import p341ge.bog.mobilebank.eventbus.RootEvent;
import p341ge.bog.mobilebank.model.payment.PaymentDebtResponse;

@Parcel
/* renamed from: ge.bog.mobilebank.eventbus.events.TemplateDebtEvent */
public class TemplateDebtEvent extends RootEvent {
    PaymentDebtResponse paymentDebt;

    public PaymentDebtResponse getPaymentDebt() {
        return this.paymentDebt;
    }

    public void setPaymentDebt(PaymentDebtResponse paymentDebtResponse) {
        this.paymentDebt = paymentDebtResponse;
    }
}
