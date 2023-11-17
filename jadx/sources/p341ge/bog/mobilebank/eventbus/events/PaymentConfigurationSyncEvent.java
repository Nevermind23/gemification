package p341ge.bog.mobilebank.eventbus.events;

import p341ge.bog.mobilebank.eventbus.RootEvent;

/* renamed from: ge.bog.mobilebank.eventbus.events.PaymentConfigurationSyncEvent */
public class PaymentConfigurationSyncEvent extends RootEvent {
    long hashCode;

    public long getHashCode() {
        return this.hashCode;
    }

    public void setHashCode(long j) {
        this.hashCode = j;
    }
}
