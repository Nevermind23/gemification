package p341ge.bog.mobilebank.p975ui.activities;

import jg1.C41438c;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.rest.GoogleApi;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p502lf.C16560a;

/* renamed from: ge.bog.mobilebank.ui.activities.r1 */
public abstract class C35503r1 implements C16560a {
    /* renamed from: a */
    public static void m105436a(MapActivity mapActivity, GoogleApi googleApi) {
        mapActivity.f85096J = googleApi;
    }

    /* renamed from: b */
    public static void m105437b(MapActivity mapActivity, Client client) {
        mapActivity.f85090G = client;
    }

    /* renamed from: c */
    public static void m105438c(MapActivity mapActivity, C41438c cVar) {
        mapActivity.f85092H = cVar;
    }

    /* renamed from: d */
    public static void m105439d(MapActivity mapActivity, PreferencesApiManager preferencesApiManager) {
        mapActivity.f85094I = preferencesApiManager;
    }
}
