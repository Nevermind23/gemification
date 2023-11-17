package p341ge.bog.mobilebank.model.notification;

import p277ua.C8662a;

/* renamed from: ge.bog.mobilebank.model.notification.ProcessNotificationRequest */
public class ProcessNotificationRequest {
    @C8662a
    private NotificationActionCode actionCode;
    @C8662a
    private long actionDate;
    private transient int indexInList;
    @C8662a
    private long notificationId;

    public NotificationActionCode getActionCode() {
        return this.actionCode;
    }

    public int getIndexInList() {
        return this.indexInList;
    }

    public long getNotificationId() {
        return this.notificationId;
    }

    public void setActionCode(NotificationActionCode notificationActionCode) {
        this.actionCode = notificationActionCode;
    }

    public void setActionDate(long j) {
        this.actionDate = j;
    }

    public void setIndexInList(int i) {
        this.indexInList = i;
    }

    public void setNotificationId(long j) {
        this.notificationId = j;
    }
}
