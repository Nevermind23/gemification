package p341ge.bog.mobilebank.model.notification;

/* renamed from: ge.bog.mobilebank.model.notification.NotificationCount */
public final class NotificationCount {
    private int messageUnread;
    private int pushUnread;
    private int totalUnread;

    public NotificationCount(int i, int i2, int i3) {
        this.totalUnread = i;
        this.messageUnread = i2;
        this.pushUnread = i3;
    }

    public static /* synthetic */ NotificationCount copy$default(NotificationCount notificationCount, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = notificationCount.totalUnread;
        }
        if ((i4 & 2) != 0) {
            i2 = notificationCount.messageUnread;
        }
        if ((i4 & 4) != 0) {
            i3 = notificationCount.pushUnread;
        }
        return notificationCount.copy(i, i2, i3);
    }

    public final int component1() {
        return this.totalUnread;
    }

    public final int component2() {
        return this.messageUnread;
    }

    public final int component3() {
        return this.pushUnread;
    }

    public final NotificationCount copy(int i, int i2, int i3) {
        return new NotificationCount(i, i2, i3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationCount)) {
            return false;
        }
        NotificationCount notificationCount = (NotificationCount) obj;
        return this.totalUnread == notificationCount.totalUnread && this.messageUnread == notificationCount.messageUnread && this.pushUnread == notificationCount.pushUnread;
    }

    public final int getMessageUnread() {
        return this.messageUnread;
    }

    public final int getPushUnread() {
        return this.pushUnread;
    }

    public final int getTotalUnread() {
        return this.totalUnread;
    }

    public int hashCode() {
        return (((this.totalUnread * 31) + this.messageUnread) * 31) + this.pushUnread;
    }

    public final void setMessageUnread(int i) {
        this.messageUnread = i;
    }

    public final void setPushUnread(int i) {
        this.pushUnread = i;
    }

    public final void setTotalUnread(int i) {
        this.totalUnread = i;
    }

    public String toString() {
        int i = this.totalUnread;
        int i2 = this.messageUnread;
        int i3 = this.pushUnread;
        return "NotificationCount(totalUnread=" + i + ", messageUnread=" + i2 + ", pushUnread=" + i3 + ")";
    }
}
