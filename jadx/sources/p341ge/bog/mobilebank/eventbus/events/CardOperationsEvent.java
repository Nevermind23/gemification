package p341ge.bog.mobilebank.eventbus.events;

import java.util.ArrayList;
import p341ge.bog.mobilebank.eventbus.RootEvent;
import p341ge.bog.mobilebank.model.account.AccountOperation;

/* renamed from: ge.bog.mobilebank.eventbus.events.CardOperationsEvent */
public class CardOperationsEvent extends RootEvent {
    private boolean canDownloadMore = true;
    private long cardId;
    private ArrayList<AccountOperation> operations = new ArrayList<>();

    public boolean canDownloadMore() {
        return this.canDownloadMore;
    }

    public long getCardId() {
        return this.cardId;
    }

    public ArrayList<AccountOperation> getOperations() {
        return this.operations;
    }

    public void setCanDownloadMore(boolean z) {
        this.canDownloadMore = z;
    }

    public void setCardId(long j) {
        this.cardId = j;
    }

    public void setOperations(ArrayList<AccountOperation> arrayList) {
        this.operations = arrayList;
    }
}
