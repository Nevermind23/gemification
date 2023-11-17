package p341ge.bog.mobilebank.eventbus.events;

import java.util.ArrayList;
import java.util.List;
import p341ge.bog.mobilebank.eventbus.RootEvent;
import p341ge.bog.mobilebank.model.payment.LastOperation;

/* renamed from: ge.bog.mobilebank.eventbus.events.UnAuthorizedAllOperationsEvent */
public class UnAuthorizedAllOperationsEvent extends RootEvent {
    private boolean canDownloadMore = true;
    private Long endDate;
    private List<LastOperation> lastOperations = new ArrayList();
    private long startDate;

    public boolean canDownloadMore() {
        return this.canDownloadMore;
    }

    public Long getEndDate() {
        return this.endDate;
    }

    public List<LastOperation> getLastOperations() {
        return this.lastOperations;
    }

    public long getStartDate() {
        return this.startDate;
    }

    public void setCanDownloadMore(boolean z) {
        this.canDownloadMore = z;
    }

    public void setEndDate(Long l) {
        this.endDate = l;
    }

    public void setOperations(List<LastOperation> list) {
        this.lastOperations = list;
    }

    public void setStartDate(long j) {
        this.startDate = j;
    }
}
