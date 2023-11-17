package p341ge.bog.mobilebank.p975ui.activities;

import a81.C30772sa;
import a81.C30785ta;
import android.content.Context;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.ui.activities.k0 */
abstract class C35429k0 extends C30772sa {

    /* renamed from: F */
    private boolean f85713F = false;

    /* renamed from: ge.bog.mobilebank.ui.activities.k0$a */
    class C35430a implements C0001b {
        C35430a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C35429k0.this.mo37460R0();
        }
    }

    C35429k0() {
        m105174O0();
    }

    /* renamed from: O0 */
    private void m105174O0() {
        addOnContextAvailableListener(new C35430a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f85713F) {
            this.f85713F = true;
            ((C30785ta) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32379C((STOTypeListActivity) C18157e.m62250a(this));
        }
    }
}
