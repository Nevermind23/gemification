package p341ge.bog.mobilebank.eventbus.events;

/* renamed from: ge.bog.mobilebank.eventbus.events.WasUserNameSavedEvent */
public final class WasUserNameSavedEvent {
    private boolean wasSaved;

    public WasUserNameSavedEvent(boolean z) {
        this.wasSaved = z;
    }

    public static /* synthetic */ WasUserNameSavedEvent copy$default(WasUserNameSavedEvent wasUserNameSavedEvent, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = wasUserNameSavedEvent.wasSaved;
        }
        return wasUserNameSavedEvent.copy(z);
    }

    public final boolean component1() {
        return this.wasSaved;
    }

    public final WasUserNameSavedEvent copy(boolean z) {
        return new WasUserNameSavedEvent(z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WasUserNameSavedEvent) && this.wasSaved == ((WasUserNameSavedEvent) obj).wasSaved;
    }

    public final boolean getWasSaved() {
        return this.wasSaved;
    }

    public int hashCode() {
        boolean z = this.wasSaved;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final void setWasSaved(boolean z) {
        this.wasSaved = z;
    }

    public String toString() {
        boolean z = this.wasSaved;
        return "WasUserNameSavedEvent(wasSaved=" + z + ")";
    }
}
