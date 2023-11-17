package p341ge.bog.mobilebank.p975ui.wizard.activities;

import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.rest.BankApi;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p502lf.C16560a;

/* renamed from: ge.bog.mobilebank.ui.wizard.activities.d */
public abstract class C35867d implements C16560a {
    /* renamed from: a */
    public static void m106708a(DomesticTransferWizardActivity domesticTransferWizardActivity, BankApi bankApi) {
        domesticTransferWizardActivity.f86654l0 = bankApi;
    }

    /* renamed from: b */
    public static void m106709b(DomesticTransferWizardActivity domesticTransferWizardActivity, Client client) {
        domesticTransferWizardActivity.f86655m0 = client;
    }

    /* renamed from: c */
    public static void m106710c(DomesticTransferWizardActivity domesticTransferWizardActivity, PreferencesApiManager preferencesApiManager) {
        domesticTransferWizardActivity.f86656n0 = preferencesApiManager;
    }
}
