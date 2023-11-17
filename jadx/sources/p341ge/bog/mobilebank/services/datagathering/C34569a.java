package p341ge.bog.mobilebank.services.datagathering;

import p341ge.bog.mobilebank.rest.BankApi;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p502lf.C16560a;

/* renamed from: ge.bog.mobilebank.services.datagathering.a */
public abstract class C34569a implements C16560a {
    /* renamed from: a */
    public static void m101403a(BaseDataReportWorker baseDataReportWorker, BankApi bankApi) {
        baseDataReportWorker.f83530f = bankApi;
    }

    /* renamed from: b */
    public static void m101404b(BaseDataReportWorker baseDataReportWorker, PreferencesApiManager preferencesApiManager) {
        baseDataReportWorker.f83531g = preferencesApiManager;
    }
}
