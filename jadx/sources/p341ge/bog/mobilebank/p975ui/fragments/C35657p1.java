package p341ge.bog.mobilebank.p975ui.fragments;

import p341ge.bog.mobilebank.eventbus.EventBusWrapper;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.rest.BankApi;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p341ge.bog.mobilebank.rest.manager.RootBankApiManager;
import p502lf.C16560a;
import p748eu.C20292b;
import p843nw.C26628j;

/* renamed from: ge.bog.mobilebank.ui.fragments.p1 */
public abstract class C35657p1 implements C16560a {
    /* renamed from: a */
    public static void m105888a(C35651n1 n1Var, EventBusWrapper eventBusWrapper) {
        n1Var.eventBusWrapper = eventBusWrapper;
    }

    /* renamed from: b */
    public static void m105889b(C35651n1 n1Var, C26628j jVar) {
        n1Var.getAccountsWithCardsUseCase = jVar;
    }

    /* renamed from: c */
    public static void m105890c(C35651n1 n1Var, C20292b bVar) {
        n1Var.getAppSettingByNameUseCase = bVar;
    }

    /* renamed from: d */
    public static void m105891d(C35651n1 n1Var, BankApi bankApi) {
        n1Var.mBankApi = bankApi;
    }

    /* renamed from: e */
    public static void m105892e(C35651n1 n1Var, RootBankApiManager rootBankApiManager) {
        n1Var.mBankApiManager = rootBankApiManager;
    }

    /* renamed from: f */
    public static void m105893f(C35651n1 n1Var, Client client) {
        n1Var.mClient = client;
    }

    /* renamed from: g */
    public static void m105894g(C35651n1 n1Var, PreferencesApiManager preferencesApiManager) {
        n1Var.mPreferencesApiManager = preferencesApiManager;
    }
}
