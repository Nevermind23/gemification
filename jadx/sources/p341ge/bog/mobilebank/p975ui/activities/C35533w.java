package p341ge.bog.mobilebank.p975ui.activities;

import a81.C30768s6;
import a81.C30772sa;
import android.content.Context;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.ui.activities.w */
abstract class C35533w extends C30772sa {

    /* renamed from: F */
    private boolean f85871F = false;

    /* renamed from: ge.bog.mobilebank.ui.activities.w$a */
    class C35534a implements C0001b {
        C35534a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C35533w.this.mo37460R0();
        }
    }

    C35533w() {
        m105516O0();
    }

    /* renamed from: O0 */
    private void m105516O0() {
        addOnContextAvailableListener(new C35534a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f85871F) {
            this.f85871F = true;
            ((C30768s6) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32388F((ManagePensionFundsActivity) C18157e.m62250a(this));
        }
    }
}
