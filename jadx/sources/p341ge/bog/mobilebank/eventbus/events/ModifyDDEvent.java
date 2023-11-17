package p341ge.bog.mobilebank.eventbus.events;

import p341ge.bog.mobilebank.eventbus.RootEvent;

/* renamed from: ge.bog.mobilebank.eventbus.events.ModifyDDEvent */
public class ModifyDDEvent extends RootEvent {
    private Object instance;

    public Object getInstance() {
        return this.instance;
    }

    public void setInstance(Object obj) {
        this.instance = obj;
    }
}
