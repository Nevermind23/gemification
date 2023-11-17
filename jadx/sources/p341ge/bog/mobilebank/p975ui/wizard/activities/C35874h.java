package p341ge.bog.mobilebank.p975ui.wizard.activities;

import android.content.Context;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;
import z81.C40206i;

/* renamed from: ge.bog.mobilebank.ui.wizard.activities.h */
abstract class C35874h extends C35862c {

    /* renamed from: k0 */
    private boolean f86799k0 = false;

    /* renamed from: ge.bog.mobilebank.ui.wizard.activities.h$a */
    class C35875a implements C0001b {
        C35875a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C35874h.this.mo37460R0();
        }
    }

    C35874h() {
        m106720O0();
    }

    /* renamed from: O0 */
    private void m106720O0() {
        addOnContextAvailableListener(new C35875a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f86799k0) {
            this.f86799k0 = true;
            ((C40206i) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32466e((OldPaymentWizardActivity) C18157e.m62250a(this));
        }
    }
}
