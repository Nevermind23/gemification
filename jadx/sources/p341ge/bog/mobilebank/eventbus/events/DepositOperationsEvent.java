package p341ge.bog.mobilebank.eventbus.events;

import java.util.ArrayList;
import p341ge.bog.mobilebank.eventbus.RootEvent;
import p341ge.bog.mobilebank.model.account.AccountOperation;

/* renamed from: ge.bog.mobilebank.eventbus.events.DepositOperationsEvent */
public class DepositOperationsEvent extends RootEvent {
    private long acctKey;
    private boolean canDownloadMore = true;
    private ArrayList<AccountOperation> operations = new ArrayList<>();

    public boolean canDownloadMore() {
        return this.canDownloadMore;
    }

    public long getAcctKey() {
        return this.acctKey;
    }

    public ArrayList<AccountOperation> getOperations() {
        return this.operations;
    }

    public void setAcctKey(long j) {
        this.acctKey = j;
    }

    public void setCanDownloadMore(boolean z) {
        this.canDownloadMore = z;
    }

    public void setOperations(ArrayList<AccountOperation> arrayList) {
        this.operations = arrayList;
    }
}
