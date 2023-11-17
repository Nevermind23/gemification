package p341ge.bog.mobilebank.sync;

import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p341ge.bog.mobilebank.rest.manager.RootBankApiManager;
import p502lf.C16560a;

/* renamed from: ge.bog.mobilebank.sync.d */
public abstract class C34843d implements C16560a {
    /* renamed from: a */
    public static void m102336a(CommonDataSyncService commonDataSyncService, RootBankApiManager rootBankApiManager) {
        commonDataSyncService.f84114h = rootBankApiManager;
    }

    /* renamed from: b */
    public static void m102337b(CommonDataSyncService commonDataSyncService, PreferencesApiManager preferencesApiManager) {
        commonDataSyncService.f84115i = preferencesApiManager;
    }
}
