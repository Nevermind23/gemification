package p341ge.bog.mobilebank.p975ui.activities;

import a81.C30573dc;
import a81.C30772sa;
import android.content.Context;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.ui.activities.r0 */
abstract class C35501r0 extends C30772sa {

    /* renamed from: F */
    private boolean f85821F = false;

    /* renamed from: ge.bog.mobilebank.ui.activities.r0$a */
    class C35502a implements C0001b {
        C35502a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C35501r0.this.mo37460R0();
        }
    }

    C35501r0() {
        m105433O0();
    }

    /* renamed from: O0 */
    private void m105433O0() {
        addOnContextAvailableListener(new C35502a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f85821F) {
            this.f85821F = true;
            ((C30573dc) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32385E((TransferTemplatesListActivity) C18157e.m62250a(this));
        }
    }
}
