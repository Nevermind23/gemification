package p341ge.bog.mobilebank.p975ui.activities.offers;

import a81.C30772sa;
import android.content.Context;
import c81.C31295h;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.ui.activities.offers.b */
abstract class C35466b extends C30772sa {

    /* renamed from: F */
    private boolean f85762F = false;

    /* renamed from: ge.bog.mobilebank.ui.activities.offers.b$a */
    class C35467a implements C0001b {
        C35467a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C35466b.this.mo37460R0();
        }
    }

    C35466b() {
        m105316O0();
    }

    /* renamed from: O0 */
    private void m105316O0() {
        addOnContextAvailableListener(new C35467a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f85762F) {
            this.f85762F = true;
            ((C31295h) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32491m0((OfferNotAvailableActivity) C18157e.m62250a(this));
        }
    }
}
