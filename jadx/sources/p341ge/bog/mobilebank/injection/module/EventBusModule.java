package p341ge.bog.mobilebank.injection.module;

import jg1.C41438c;
import p341ge.bog.mobilebank.eventbus.EventBusWrapper;

/* renamed from: ge.bog.mobilebank.injection.module.EventBusModule */
public class EventBusModule {
    /* access modifiers changed from: package-private */
    public C41438c provideEventBus() {
        return C41438c.m120237c();
    }

    /* access modifiers changed from: package-private */
    public EventBusWrapper provideEventBusWrapper(C41438c cVar) {
        return new EventBusWrapper(cVar);
    }
}
