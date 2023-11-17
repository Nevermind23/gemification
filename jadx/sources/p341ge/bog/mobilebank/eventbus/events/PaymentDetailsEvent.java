package p341ge.bog.mobilebank.eventbus.events;

import p341ge.bog.mobilebank.eventbus.RootEvent;
import p341ge.bog.mobilebank.model.payment.PaymentDetail;

/* renamed from: ge.bog.mobilebank.eventbus.events.PaymentDetailsEvent */
public class PaymentDetailsEvent extends RootEvent {
    private long docKey;
    private String essServiceId;
    private PaymentDetail paymentDetail;
    private String printFormType;

    public long getDocKey() {
        return this.docKey;
    }

    public String getEssServiceId() {
        return this.essServiceId;
    }

    public PaymentDetail getPaymentDetail() {
        return this.paymentDetail;
    }

    public String getPrintFormType() {
        return this.printFormType;
    }

    public void setDocKey(long j) {
        this.docKey = j;
    }

    public void setEssServiceId(String str) {
        this.essServiceId = str;
    }

    public void setPaymentDetail(PaymentDetail paymentDetail2) {
        this.paymentDetail = paymentDetail2;
    }

    public void setPrintFormType(String str) {
        this.printFormType = str;
    }
}
