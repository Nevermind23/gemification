package p341ge.bog.mobilebank.p975ui.activities;

import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.rest.BankApi;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p341ge.bog.mobilebank.rest.manager.RootBankApiManager;
import p502lf.C16560a;

/* renamed from: ge.bog.mobilebank.ui.activities.t1 */
public abstract class C35513t1 implements C16560a {
    /* renamed from: a */
    public static void m105453a(NotificationDetailsActivity notificationDetailsActivity, BankApi bankApi) {
        notificationDetailsActivity.f85171G = bankApi;
    }

    /* renamed from: b */
    public static void m105454b(NotificationDetailsActivity notificationDetailsActivity, RootBankApiManager rootBankApiManager) {
        notificationDetailsActivity.f85172H = rootBankApiManager;
    }

    /* renamed from: c */
    public static void m105455c(NotificationDetailsActivity notificationDetailsActivity, Client client) {
        notificationDetailsActivity.f85173I = client;
    }

    /* renamed from: d */
    public static void m105456d(NotificationDetailsActivity notificationDetailsActivity, PreferencesApiManager preferencesApiManager) {
        notificationDetailsActivity.f85174J = preferencesApiManager;
    }
}
