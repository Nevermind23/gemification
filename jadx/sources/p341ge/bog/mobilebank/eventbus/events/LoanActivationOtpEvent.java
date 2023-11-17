package p341ge.bog.mobilebank.eventbus.events;

import hd0.C24978b;
import p341ge.bog.mobilebank.eventbus.RootEvent;

/* renamed from: ge.bog.mobilebank.eventbus.events.LoanActivationOtpEvent */
public class LoanActivationOtpEvent extends RootEvent {
    private long decNo;
    private String decScheme;
    private C24978b expressFlag;

    public long getDecNo() {
        return this.decNo;
    }

    public String getDecScheme() {
        return this.decScheme;
    }

    public C24978b getExpressFlag() {
        return this.expressFlag;
    }

    public void setDecNo(long j) {
        this.decNo = j;
    }

    public void setDecScheme(String str) {
        this.decScheme = str;
    }

    public void setExpressFlag(C24978b bVar) {
        this.expressFlag = bVar;
    }
}
