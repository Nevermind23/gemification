package p341ge.bog.mobilebank.model.payment;

/* renamed from: ge.bog.mobilebank.model.payment.SelectedPayment */
public class SelectedPayment {
    private String channelCode;

    /* renamed from: id */
    private long f81349id;
    private int orderNo;
    private String providerId;
    private String status;

    public long getId() {
        return this.f81349id;
    }

    public String getProviderId() {
        return this.providerId;
    }

    public String getStatus() {
        return this.status;
    }

    public void setId(long j) {
        this.f81349id = j;
    }

    public void setStatus(String str) {
        this.status = str;
    }
}
