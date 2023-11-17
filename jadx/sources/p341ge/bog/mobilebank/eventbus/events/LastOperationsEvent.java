package p341ge.bog.mobilebank.eventbus.events;

import java.util.List;
import p341ge.bog.mobilebank.eventbus.RootEvent;
import p341ge.bog.mobilebank.model.payment.LastOperation;

/* renamed from: ge.bog.mobilebank.eventbus.events.LastOperationsEvent */
public class LastOperationsEvent extends RootEvent {
    private boolean isLoggedIn;
    private List<LastOperation> lastOperations;

    public List<LastOperation> getLastOperations() {
        return this.lastOperations;
    }

    public boolean isLoggedIn() {
        return this.isLoggedIn;
    }

    public void setLastOperations(List<LastOperation> list) {
        this.lastOperations = list;
    }

    public void setLoggedIn(boolean z) {
        this.isLoggedIn = z;
    }
}
