package p341ge.bog.mobilebank.model.notification;

import java.util.List;
import p277ua.C8664c;

/* renamed from: ge.bog.mobilebank.model.notification.PushHistoryObject */
public class PushHistoryObject {
    @C8664c("notifications")
    List<PushNotification> notifications;
    @C8664c("summary")
    PushHistorySummaryObject summary;

    public List<PushNotification> getNotifications() {
        return this.notifications;
    }

    public PushHistorySummaryObject getSummary() {
        return this.summary;
    }
}
