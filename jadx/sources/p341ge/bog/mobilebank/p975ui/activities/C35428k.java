package p341ge.bog.mobilebank.p975ui.activities;

import jg1.C41438c;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p341ge.bog.mobilebank.rest.manager.RootBankApiManager;
import p502lf.C16560a;

/* renamed from: ge.bog.mobilebank.ui.activities.k */
public abstract class C35428k implements C16560a {
    /* renamed from: a */
    public static void m105170a(ExchangeActivity exchangeActivity, RootBankApiManager rootBankApiManager) {
        exchangeActivity.f84847G = rootBankApiManager;
    }

    /* renamed from: b */
    public static void m105171b(ExchangeActivity exchangeActivity, Client client) {
        exchangeActivity.f84848H = client;
    }

    /* renamed from: c */
    public static void m105172c(ExchangeActivity exchangeActivity, C41438c cVar) {
        exchangeActivity.f84849I = cVar;
    }

    /* renamed from: d */
    public static void m105173d(ExchangeActivity exchangeActivity, PreferencesApiManager preferencesApiManager) {
        exchangeActivity.f84850J = preferencesApiManager;
    }
}
