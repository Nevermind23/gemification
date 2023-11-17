package p341ge.bog.mobilebank.eventbus.events;

import p341ge.bog.mobilebank.eventbus.RootEvent;

/* renamed from: ge.bog.mobilebank.eventbus.events.LogOutEvent */
public class LogOutEvent extends RootEvent {
    private boolean showNotification;

    public LogOutEvent(boolean z) {
        this.showNotification = z;
    }

    public boolean isShowNotification() {
        return this.showNotification;
    }

    public void setShowNotification(boolean z) {
        this.showNotification = z;
    }
}
