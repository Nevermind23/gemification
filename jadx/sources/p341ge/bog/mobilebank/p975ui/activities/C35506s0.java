package p341ge.bog.mobilebank.p975ui.activities;

import a81.C30629hc;
import a81.C30772sa;
import android.content.Context;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.ui.activities.s0 */
abstract class C35506s0 extends C30772sa {

    /* renamed from: F */
    private boolean f85825F = false;

    /* renamed from: ge.bog.mobilebank.ui.activities.s0$a */
    class C35507a implements C0001b {
        C35507a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C35506s0.this.mo37460R0();
        }
    }

    C35506s0() {
        m105443O0();
    }

    /* renamed from: O0 */
    private void m105443O0() {
        addOnContextAvailableListener(new C35507a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f85825F) {
            this.f85825F = true;
            ((C30629hc) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32497o0((TransportPointExchangeActivity) C18157e.m62250a(this));
        }
    }
}
