package p341ge.bog.mobilebank.injection.module;

import ge1.C41084a;
import jg1.C41438c;
import p341ge.bog.mobilebank.eventbus.EventBusWrapper;
import p640vf.C18329d;

/* renamed from: ge.bog.mobilebank.injection.module.EventBusModule_ProvideEventBusWrapperFactory */
public final class EventBusModule_ProvideEventBusWrapperFactory implements C41084a {
    private final C41084a eventBusProvider;
    private final EventBusModule module;

    public EventBusModule_ProvideEventBusWrapperFactory(EventBusModule eventBusModule, C41084a aVar) {
        this.module = eventBusModule;
        this.eventBusProvider = aVar;
    }

    public static EventBusModule_ProvideEventBusWrapperFactory create(EventBusModule eventBusModule, C41084a aVar) {
        return new EventBusModule_ProvideEventBusWrapperFactory(eventBusModule, aVar);
    }

    public static EventBusWrapper provideEventBusWrapper(EventBusModule eventBusModule, C41438c cVar) {
        return (EventBusWrapper) C18329d.m62677d(eventBusModule.provideEventBusWrapper(cVar));
    }

    public EventBusWrapper get() {
        return provideEventBusWrapper(this.module, (C41438c) this.eventBusProvider.get());
    }
}
