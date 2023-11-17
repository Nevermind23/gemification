package p341ge.bog.mobilebank.eventbus.events;

import p341ge.bog.mobilebank.eventbus.RootEvent;
import p341ge.bog.mobilebank.model.payment.LastOperation;

/* renamed from: ge.bog.mobilebank.eventbus.events.OperationHistoryEvent */
public class OperationHistoryEvent extends RootEvent {
    private String essId;
    private LastOperation operationHistory;

    public String getEssId() {
        return this.essId;
    }

    public LastOperation getOperationHistory() {
        return this.operationHistory;
    }

    public void setEssId(String str) {
        this.essId = str;
    }

    public void setOperationHistory(LastOperation lastOperation) {
        this.operationHistory = lastOperation;
    }
}
