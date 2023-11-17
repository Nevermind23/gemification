package p341ge.bog.mobilebank.eventbus.events;

import p341ge.bog.mobilebank.eventbus.RootEvent;
import p341ge.bog.mobilebank.model.payment.LastOperation;

/* renamed from: ge.bog.mobilebank.eventbus.events.UtilityPaymentDetailsEvent */
public class UtilityPaymentDetailsEvent extends RootEvent {
    private long docKey;
    private String essServiceId;
    private LastOperation lastOperation;
    private String printFormType;

    public long getDocKey() {
        return this.docKey;
    }

    public String getEssServiceId() {
        return this.essServiceId;
    }

    public LastOperation getLastOperation() {
        return this.lastOperation;
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

    public void setLastOperation(LastOperation lastOperation2) {
        this.lastOperation = lastOperation2;
    }

    public void setPrintFormType(String str) {
        this.printFormType = str;
    }
}
