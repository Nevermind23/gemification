package p341ge.bog.mobilebank.p975ui.activities;

import a81.C30772sa;
import a81.C30861z8;
import android.content.Context;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.ui.activities.e0 */
abstract class C35380e0 extends C30772sa {

    /* renamed from: F */
    private boolean f85657F = false;

    /* renamed from: ge.bog.mobilebank.ui.activities.e0$a */
    class C35381a implements C0001b {
        C35381a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C35380e0.this.mo37460R0();
        }
    }

    C35380e0() {
        m105029O0();
    }

    /* renamed from: O0 */
    private void m105029O0() {
        addOnContextAvailableListener(new C35381a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f85657F) {
            this.f85657F = true;
            ((C30861z8) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32403J1((PaymentsTemplateListActivity) C18157e.m62250a(this));
        }
    }
}
