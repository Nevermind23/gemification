package p341ge.bog.mobilebank.eventbus.events;

import p341ge.bog.mobilebank.eventbus.RootEvent;

/* renamed from: ge.bog.mobilebank.eventbus.events.NotificationCountEvent */
public class NotificationCountEvent extends RootEvent {
    private int notificationTotalCount;
    private int unreadMessageCount;
    private int unreadPushCount;

    public int getNotificationTotalCount() {
        return this.notificationTotalCount;
    }

    public int getUnreadMessageCount() {
        return this.unreadMessageCount;
    }

    public int getUnreadPushCount() {
        return this.unreadPushCount;
    }

    public void setNotificationTotalCount(int i) {
        this.notificationTotalCount = i;
    }

    public void setUnreadMessageCount(int i) {
        this.unreadMessageCount = i;
    }

    public void setUnreadPushCount(int i) {
        this.unreadPushCount = i;
    }
}
