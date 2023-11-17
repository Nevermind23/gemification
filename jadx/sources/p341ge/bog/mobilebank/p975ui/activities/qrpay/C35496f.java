package p341ge.bog.mobilebank.p975ui.activities.qrpay;

import jg1.C41438c;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.rest.BankApi;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p502lf.C16560a;

/* renamed from: ge.bog.mobilebank.ui.activities.qrpay.f */
public abstract class C35496f implements C16560a {
    /* renamed from: a */
    public static void m105424a(QrPayCardSelectActivity qrPayCardSelectActivity, BankApi bankApi) {
        qrPayCardSelectActivity.f85777G = bankApi;
    }

    /* renamed from: b */
    public static void m105425b(QrPayCardSelectActivity qrPayCardSelectActivity, Client client) {
        qrPayCardSelectActivity.f85778H = client;
    }

    /* renamed from: c */
    public static void m105426c(QrPayCardSelectActivity qrPayCardSelectActivity, C41438c cVar) {
        qrPayCardSelectActivity.f85779I = cVar;
    }

    /* renamed from: d */
    public static void m105427d(QrPayCardSelectActivity qrPayCardSelectActivity, PreferencesApiManager preferencesApiManager) {
        qrPayCardSelectActivity.f85780J = preferencesApiManager;
    }
}
