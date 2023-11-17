package p341ge.bog.mobilebank.services;

import p341ge.bog.mobilebank.eventbus.EventBusWrapper;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p502lf.C16560a;

/* renamed from: ge.bog.mobilebank.services.d */
public abstract class C34567d implements C16560a {
    /* renamed from: a */
    public static void m101387a(C34566c cVar, EventBusWrapper eventBusWrapper) {
        cVar.f83528g = eventBusWrapper;
    }

    /* renamed from: b */
    public static void m101388b(C34566c cVar, PreferencesApiManager preferencesApiManager) {
        cVar.f83529h = preferencesApiManager;
    }
}
