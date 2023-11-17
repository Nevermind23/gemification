package p341ge.bog.mobilebank.p975ui.wizard.activities;

import android.content.Context;
import p000a.C0001b;
import p341ge.bog.mobilebank.p975ui.activities.C35388f2;
import p627uf.C18155c;
import p627uf.C18157e;
import z81.C40211n;

/* renamed from: ge.bog.mobilebank.ui.wizard.activities.i */
abstract class C35876i extends C35388f2 {

    /* renamed from: F */
    private boolean f86801F = false;

    /* renamed from: ge.bog.mobilebank.ui.wizard.activities.i$a */
    class C35877a implements C0001b {
        C35877a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C35876i.this.mo37460R0();
        }
    }

    C35876i() {
        m106723O0();
    }

    /* renamed from: O0 */
    private void m106723O0() {
        addOnContextAvailableListener(new C35877a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f86801F) {
            this.f86801F = true;
            ((C40211n) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32498o1((PaymentOptionWizardActivity) C18157e.m62250a(this));
        }
    }
}
