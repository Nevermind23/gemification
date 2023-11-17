package p341ge.bog.mobilebank.p975ui.activities;

import a81.C30534b1;
import a81.C30772sa;
import android.content.Context;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.ui.activities.r */
abstract class C35499r extends C30772sa {

    /* renamed from: F */
    private boolean f85819F = false;

    /* renamed from: ge.bog.mobilebank.ui.activities.r$a */
    class C35500a implements C0001b {
        C35500a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C35499r.this.mo37460R0();
        }
    }

    C35499r() {
        m105430O0();
    }

    /* renamed from: O0 */
    private void m105430O0() {
        addOnContextAvailableListener(new C35500a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f85819F) {
            this.f85819F = true;
            ((C30534b1) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32404K((ExchangeActivity) C18157e.m62250a(this));
        }
    }
}
