package p341ge.bog.mobilebank.p975ui.wizard.activities;

import android.content.Context;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;
import z81.C40198a;

/* renamed from: ge.bog.mobilebank.ui.wizard.activities.e */
abstract class C35868e extends BasicWizardActivity {

    /* renamed from: l0 */
    private boolean f86793l0 = false;

    /* renamed from: ge.bog.mobilebank.ui.wizard.activities.e$a */
    class C35869a implements C0001b {
        C35869a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C35868e.this.mo37460R0();
        }
    }

    C35868e() {
        m106711O0();
    }

    /* renamed from: O0 */
    private void m106711O0() {
        addOnContextAvailableListener(new C35869a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f86793l0) {
            this.f86793l0 = true;
            ((C40198a) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32486k1((AdvancedWizardActivity) C18157e.m62250a(this));
        }
    }
}
