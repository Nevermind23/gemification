package p341ge.bog.mobilebank.eventbus.events;

import java.util.ArrayList;
import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.data.entity.CasHistoryItemEntity;
import p341ge.bog.mobilebank.eventbus.RootEvent;

/* renamed from: ge.bog.mobilebank.eventbus.events.CasHistoryEvent */
public class CasHistoryEvent extends RootEvent {
    private long clientServiceId;
    private ArrayList<CasHistoryItemEntity> historyItems;

    public long getClientServiceId() {
        return this.clientServiceId;
    }

    public ArrayList<CasHistoryItemEntity> getHistoryItems() {
        return this.historyItems;
    }

    public void setClientServiceId(long j) {
        this.clientServiceId = j;
    }

    public void setHistoryItems(ArrayList<CasHistoryItemEntity> arrayList) {
        this.historyItems = arrayList;
    }
}
