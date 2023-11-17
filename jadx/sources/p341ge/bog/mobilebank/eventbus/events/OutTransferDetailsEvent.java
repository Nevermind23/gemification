package p341ge.bog.mobilebank.eventbus.events;

import p341ge.bog.mobilebank.eventbus.RootEvent;
import p341ge.bog.mobilebank.model.TransferHistoryItem;

/* renamed from: ge.bog.mobilebank.eventbus.events.OutTransferDetailsEvent */
public class OutTransferDetailsEvent extends RootEvent {
    private long docKey;
    private String essServiceId;
    private String printFormType;
    private TransferHistoryItem transferHistoryItem;

    public long getDocKey() {
        return this.docKey;
    }

    public String getEssServiceId() {
        return this.essServiceId;
    }

    public String getPrintFormType() {
        return this.printFormType;
    }

    public TransferHistoryItem getTransferHistoryItem() {
        return this.transferHistoryItem;
    }

    public void setDocKey(long j) {
        this.docKey = j;
    }

    public void setEssServiceId(String str) {
        this.essServiceId = str;
    }

    public void setPrintFormType(String str) {
        this.printFormType = str;
    }

    public void setTransferHistoryItem(TransferHistoryItem transferHistoryItem2) {
        this.transferHistoryItem = transferHistoryItem2;
    }
}
