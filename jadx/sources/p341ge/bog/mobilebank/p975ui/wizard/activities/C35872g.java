package p341ge.bog.mobilebank.p975ui.wizard.activities;

import android.content.Context;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;
import z81.C40205h;

/* renamed from: ge.bog.mobilebank.ui.wizard.activities.g */
abstract class C35872g extends C35862c {

    /* renamed from: k0 */
    private boolean f86797k0 = false;

    /* renamed from: ge.bog.mobilebank.ui.wizard.activities.g$a */
    class C35873a implements C0001b {
        C35873a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C35872g.this.mo37460R0();
        }
    }

    C35872g() {
        m106717O0();
    }

    /* renamed from: O0 */
    private void m106717O0() {
        addOnContextAvailableListener(new C35873a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f86797k0) {
            this.f86797k0 = true;
            ((C40205h) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32417O0((DomesticTransferWizardActivity) C18157e.m62250a(this));
        }
    }
}
