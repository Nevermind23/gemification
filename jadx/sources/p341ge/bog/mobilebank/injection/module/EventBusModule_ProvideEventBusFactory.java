package p341ge.bog.mobilebank.injection.module;

import ge1.C41084a;
import jg1.C41438c;
import p640vf.C18329d;

/* renamed from: ge.bog.mobilebank.injection.module.EventBusModule_ProvideEventBusFactory */
public final class EventBusModule_ProvideEventBusFactory implements C41084a {
    private final EventBusModule module;

    public EventBusModule_ProvideEventBusFactory(EventBusModule eventBusModule) {
        this.module = eventBusModule;
    }

    public static EventBusModule_ProvideEventBusFactory create(EventBusModule eventBusModule) {
        return new EventBusModule_ProvideEventBusFactory(eventBusModule);
    }

    public static C41438c provideEventBus(EventBusModule eventBusModule) {
        return (C41438c) C18329d.m62677d(eventBusModule.provideEventBus());
    }

    public C41438c get() {
        return provideEventBus(this.module);
    }
}
