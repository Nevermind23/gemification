package p341ge.bog.mobilebank.eventbus.events;

import java.util.List;
import p341ge.bog.mobilebank.eventbus.RootEvent;
import p341ge.bog.mobilebank.model.notification.ProcessNotificationRequest;

/* renamed from: ge.bog.mobilebank.eventbus.events.ModifyNotificationsEvent */
public class ModifyNotificationsEvent extends RootEvent {
    private List<ProcessNotificationRequest> processedNotifications;

    public List<ProcessNotificationRequest> getProcessedNotifications() {
        return this.processedNotifications;
    }

    public void setProcessedNotifications(List<ProcessNotificationRequest> list) {
        this.processedNotifications = list;
    }
}
