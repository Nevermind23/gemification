package p341ge.bog.mobilebank.model.notification;

import p277ua.C8664c;

/* renamed from: ge.bog.mobilebank.model.notification.PushHistorySummaryObject */
public class PushHistorySummaryObject {
    @C8664c("count")
    int count;
    @C8664c("from")
    int from;
    @C8664c("totalCount")
    int totalCount;

    public int getCount() {
        return this.count;
    }

    public int getFrom() {
        return this.from;
    }

    public int getTotalCount() {
        return this.totalCount;
    }

    public String toString() {
        return "from: " + this.from + " count: " + this.count + " totalCount: " + this.totalCount + "\n";
    }
}
