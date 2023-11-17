package p341ge.bog.mobilebank.eventbus.events;

import p341ge.bog.mobilebank.eventbus.RootEvent;
import p341ge.bog.mobilebank.model.TransferHistoryItem;

/* renamed from: ge.bog.mobilebank.eventbus.events.TransferHistoryEvent */
public class TransferHistoryEvent extends RootEvent {
    private String docKey;
    private Long pfmId;
    private TransferHistoryItem transferHistoryItem;

    public String getDocKey() {
        return this.docKey;
    }

    public Long getPfmId() {
        return this.pfmId;
    }

    public TransferHistoryItem getTransferHistoryItem() {
        return this.transferHistoryItem;
    }

    public void setDocKey(String str) {
        this.docKey = str;
    }

    public void setPfmId(Long l) {
        this.pfmId = l;
    }

    public void setTransferHistoryItem(TransferHistoryItem transferHistoryItem2) {
        this.transferHistoryItem = transferHistoryItem2;
    }
}
