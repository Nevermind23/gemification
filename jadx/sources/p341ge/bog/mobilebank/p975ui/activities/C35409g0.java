package p341ge.bog.mobilebank.p975ui.activities;

import a81.C30772sa;
import a81.C30849y9;
import android.content.Context;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.ui.activities.g0 */
abstract class C35409g0 extends C30772sa {

    /* renamed from: F */
    private boolean f85698F = false;

    /* renamed from: ge.bog.mobilebank.ui.activities.g0$a */
    class C35410a implements C0001b {
        C35410a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C35409g0.this.mo37460R0();
        }
    }

    C35409g0() {
        m105137O0();
    }

    /* renamed from: O0 */
    private void m105137O0() {
        addOnContextAvailableListener(new C35410a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f85698F) {
            this.f85698F = true;
            ((C30849y9) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32392G0((ProviderListActivity) C18157e.m62250a(this));
        }
    }
}
