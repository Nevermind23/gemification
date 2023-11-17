package p341ge.bog.mobilebank.p975ui.wizard.activities;

import android.content.Context;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;
import z81.C40204g;

/* renamed from: ge.bog.mobilebank.ui.wizard.activities.f */
abstract class C35870f extends C35862c {

    /* renamed from: k0 */
    private boolean f86795k0 = false;

    /* renamed from: ge.bog.mobilebank.ui.wizard.activities.f$a */
    class C35871a implements C0001b {
        C35871a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C35870f.this.mo37460R0();
        }
    }

    C35870f() {
        m106714O0();
    }

    /* renamed from: O0 */
    private void m106714O0() {
        addOnContextAvailableListener(new C35871a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f86795k0) {
            this.f86795k0 = true;
            ((C40204g) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32502q((BankTransferWizardActivity) C18157e.m62250a(this));
        }
    }
}
