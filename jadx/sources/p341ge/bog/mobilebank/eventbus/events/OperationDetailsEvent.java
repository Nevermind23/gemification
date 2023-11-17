package p341ge.bog.mobilebank.eventbus.events;

import p341ge.bog.mobilebank.eventbus.RootEvent;
import p341ge.bog.mobilebank.model.account.AccountOperation;

/* renamed from: ge.bog.mobilebank.eventbus.events.OperationDetailsEvent */
public class OperationDetailsEvent extends RootEvent {
    private AccountOperation accountOperation;
    private long docKey;
    private long entryId;

    public AccountOperation getAccountOperation() {
        return this.accountOperation;
    }

    public long getDocKey() {
        return this.docKey;
    }

    public long getEntryId() {
        return this.entryId;
    }

    public void setAccountOperation(AccountOperation accountOperation2) {
        this.accountOperation = accountOperation2;
    }

    public void setDocKey(long j) {
        this.docKey = j;
    }

    public void setEntryId(long j) {
        this.entryId = j;
    }
}
