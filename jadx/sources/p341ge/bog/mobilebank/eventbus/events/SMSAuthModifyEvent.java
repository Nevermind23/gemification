package p341ge.bog.mobilebank.eventbus.events;

import p341ge.bog.mobilebank.eventbus.RootEvent;

/* renamed from: ge.bog.mobilebank.eventbus.events.SMSAuthModifyEvent */
public class SMSAuthModifyEvent extends RootEvent {
    private boolean activated;

    public boolean isActivated() {
        return this.activated;
    }

    public void setActivated(boolean z) {
        this.activated = z;
    }
}
