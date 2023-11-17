package p341ge.bog.mobilebank.eventbus.events;

import p341ge.bog.mobilebank.eventbus.RootEvent;
import p341ge.bog.mobilebank.model.payment.PaymentResult;

/* renamed from: ge.bog.mobilebank.eventbus.events.PaymentBatchExecuteEvent */
public class PaymentBatchExecuteEvent extends RootEvent {
    private boolean isTimeOut;
    private PaymentResult result;

    public PaymentResult getResult() {
        return this.result;
    }

    public boolean isTimeOut() {
        return this.isTimeOut;
    }

    public void setResult(PaymentResult paymentResult) {
        this.result = paymentResult;
    }

    public void setTimeOut(boolean z) {
        this.isTimeOut = z;
    }
}
