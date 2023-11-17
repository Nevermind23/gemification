package p341ge.bog.mobilebank.p975ui.wizard.activities;

import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.rest.BankApi;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p502lf.C16560a;

/* renamed from: ge.bog.mobilebank.ui.wizard.activities.b */
public abstract class C35861b implements C16560a {
    /* renamed from: a */
    public static void m106640a(BankTransferWizardActivity bankTransferWizardActivity, BankApi bankApi) {
        bankTransferWizardActivity.f86591l0 = bankApi;
    }

    /* renamed from: b */
    public static void m106641b(BankTransferWizardActivity bankTransferWizardActivity, Client client) {
        bankTransferWizardActivity.f86593m0 = client;
    }

    /* renamed from: c */
    public static void m106642c(BankTransferWizardActivity bankTransferWizardActivity, PreferencesApiManager preferencesApiManager) {
        bankTransferWizardActivity.f86595n0 = preferencesApiManager;
    }
}
