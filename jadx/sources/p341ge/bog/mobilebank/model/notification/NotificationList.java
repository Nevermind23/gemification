package p341ge.bog.mobilebank.model.notification;

import java.util.List;

/* renamed from: ge.bog.mobilebank.model.notification.NotificationList */
public class NotificationList {
    private List<NotificationDetails> details;
    private List<Notification> notifications;

    public List<NotificationDetails> getDetails() {
        return this.details;
    }

    public List<Notification> getNotifications() {
        return this.notifications;
    }

    public void setDetails(List<NotificationDetails> list) {
        this.details = list;
    }

    public void setNotifications(List<Notification> list) {
        this.notifications = list;
    }
}
