package p341ge.bog.mobilebank.transfers.activities;

import jg1.C41438c;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p341ge.bog.mobilebank.rest.manager.RootBankApiManager;
import p502lf.C16560a;

/* renamed from: ge.bog.mobilebank.transfers.activities.e0 */
public abstract class C34906e0 implements C16560a {
    /* renamed from: a */
    public static void m102708a(TransferLoaderActivity transferLoaderActivity, RootBankApiManager rootBankApiManager) {
        transferLoaderActivity.f84252G = rootBankApiManager;
    }

    /* renamed from: b */
    public static void m102709b(TransferLoaderActivity transferLoaderActivity, Client client) {
        transferLoaderActivity.f84253H = client;
    }

    /* renamed from: c */
    public static void m102710c(TransferLoaderActivity transferLoaderActivity, C41438c cVar) {
        transferLoaderActivity.f84254I = cVar;
    }

    /* renamed from: d */
    public static void m102711d(TransferLoaderActivity transferLoaderActivity, PreferencesApiManager preferencesApiManager) {
        transferLoaderActivity.f84255J = preferencesApiManager;
    }
}
