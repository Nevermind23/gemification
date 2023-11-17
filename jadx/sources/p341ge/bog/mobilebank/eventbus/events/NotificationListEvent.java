package p341ge.bog.mobilebank.eventbus.events;

import java.util.List;
import p341ge.bog.mobilebank.eventbus.RootEvent;
import p341ge.bog.mobilebank.model.notification.Notification;
import p341ge.bog.mobilebank.model.notification.NotificationActionCode;
import p341ge.bog.mobilebank.model.notification.NotificationList;
import p341ge.bog.mobilebank.model.notification.ProcessNotificationRequest;

/* renamed from: ge.bog.mobilebank.eventbus.events.NotificationListEvent */
public class NotificationListEvent extends RootEvent {
    private NotificationList notificationList;

    public NotificationList getNotificationList() {
        return this.notificationList;
    }

    public void setNotificationList(NotificationList notificationList2) {
        this.notificationList = notificationList2;
    }

    public void updateNotifications(List<ProcessNotificationRequest> list) {
        NotificationList notificationList2 = this.notificationList;
        if (notificationList2 != null) {
            List<Notification> notifications = notificationList2.getNotifications();
            for (ProcessNotificationRequest next : list) {
                if (next.getIndexInList() < notifications.size()) {
                    Notification notification = notifications.get(next.getIndexInList());
                    if (notification.getNotificationId() == next.getNotificationId()) {
                        if (next.getActionCode() == NotificationActionCode.ACTION_CODE_DELETE) {
                            notifications.remove(next.getIndexInList());
                        } else {
                            notification.setActionCode(next.getActionCode());
                        }
                    }
                }
            }
        }
    }
}
