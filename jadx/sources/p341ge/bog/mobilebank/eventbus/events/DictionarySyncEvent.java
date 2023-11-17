package p341ge.bog.mobilebank.eventbus.events;

import p341ge.bog.mobilebank.eventbus.RootEvent;

/* renamed from: ge.bog.mobilebank.eventbus.events.DictionarySyncEvent */
public class DictionarySyncEvent extends RootEvent {
    private long hashCode;

    public long getHashCode() {
        return this.hashCode;
    }

    public void setHashCode(long j) {
        this.hashCode = j;
    }
}
