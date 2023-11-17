package p341ge.bog.mobilebank.eventbus.events;

import hd0.C24978b;
import p341ge.bog.mobilebank.eventbus.RootEvent;

/* renamed from: ge.bog.mobilebank.eventbus.events.CriResponseEvent */
public final class CriResponseEvent extends RootEvent {
    private C24978b confirmed;
    private boolean hasBeenHandled;

    public final C24978b getConfirmed() {
        return this.confirmed;
    }

    public final boolean getHasBeenHandled() {
        return this.hasBeenHandled;
    }

    public final void setConfirmed(C24978b bVar) {
        this.confirmed = bVar;
    }

    public final void setHasBeenHandled(boolean z) {
        this.hasBeenHandled = z;
    }
}
