package p341ge.bog.mobilebank.p975ui.wizard.activities;

import e41.C31658b;
import jg1.C41438c;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.rest.BankApi;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p502lf.C16560a;
import pc0.C27494a;

/* renamed from: ge.bog.mobilebank.ui.wizard.activities.k */
public abstract class C35879k implements C16560a {
    /* renamed from: a */
    public static void m106729a(PaymentOptionWizardActivity paymentOptionWizardActivity, BankApi bankApi) {
        paymentOptionWizardActivity.f86706H = bankApi;
    }

    /* renamed from: b */
    public static void m106730b(PaymentOptionWizardActivity paymentOptionWizardActivity, Client client) {
        paymentOptionWizardActivity.f86707I = client;
    }

    /* renamed from: c */
    public static void m106731c(PaymentOptionWizardActivity paymentOptionWizardActivity, C41438c cVar) {
        paymentOptionWizardActivity.f86708J = cVar;
    }

    /* renamed from: d */
    public static void m106732d(PaymentOptionWizardActivity paymentOptionWizardActivity, PreferencesApiManager preferencesApiManager) {
        paymentOptionWizardActivity.f86709K = preferencesApiManager;
    }

    /* renamed from: e */
    public static void m106733e(PaymentOptionWizardActivity paymentOptionWizardActivity, C27494a aVar) {
        paymentOptionWizardActivity.f86710L = aVar;
    }

    /* renamed from: f */
    public static void m106734f(PaymentOptionWizardActivity paymentOptionWizardActivity, C31658b bVar) {
        paymentOptionWizardActivity.f86705G = bVar;
    }
}
