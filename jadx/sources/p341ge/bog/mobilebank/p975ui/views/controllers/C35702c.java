package p341ge.bog.mobilebank.p975ui.views.controllers;

import jg1.C41438c;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.rest.BankApi;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p341ge.bog.mobilebank.rest.manager.RootBankApiManager;
import p502lf.C16560a;

/* renamed from: ge.bog.mobilebank.ui.views.controllers.c */
public abstract class C35702c implements C16560a {
    /* renamed from: a */
    public static void m106021a(C35700a aVar, BankApi bankApi) {
        aVar.bankApi = bankApi;
    }

    /* renamed from: b */
    public static void m106022b(C35700a aVar, Client client) {
        aVar.client = client;
    }

    /* renamed from: c */
    public static void m106023c(C35700a aVar, BankApi bankApi) {
        aVar.mBankApi = bankApi;
    }

    /* renamed from: d */
    public static void m106024d(C35700a aVar, RootBankApiManager rootBankApiManager) {
        aVar.mBankApiManager = rootBankApiManager;
    }

    /* renamed from: e */
    public static void m106025e(C35700a aVar, C41438c cVar) {
        aVar.mEventBus = cVar;
    }

    /* renamed from: f */
    public static void m106026f(C35700a aVar, PreferencesApiManager preferencesApiManager) {
        aVar.mPreferencesApiManager = preferencesApiManager;
    }
}
