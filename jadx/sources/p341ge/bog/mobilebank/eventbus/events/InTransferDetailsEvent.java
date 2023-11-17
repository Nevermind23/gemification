package p341ge.bog.mobilebank.eventbus.events;

import p341ge.bog.mobilebank.eventbus.RootEvent;
import p341ge.bog.mobilebank.model.InTransferDetail;

/* renamed from: ge.bog.mobilebank.eventbus.events.InTransferDetailsEvent */
public class InTransferDetailsEvent extends RootEvent {
    private long docKey;
    private String essServiceId;
    private InTransferDetail inTransferDetail;
    private String printFormType;

    public long getDocKey() {
        return this.docKey;
    }

    public String getEssServiceId() {
        return this.essServiceId;
    }

    public InTransferDetail getInTransferDetail() {
        return this.inTransferDetail;
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

    public void setInTransferDetail(InTransferDetail inTransferDetail2) {
        this.inTransferDetail = inTransferDetail2;
    }

    public void setPrintFormType(String str) {
        this.printFormType = str;
    }
}
