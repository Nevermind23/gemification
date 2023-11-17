package p341ge.bog.mobilebank.p975ui.activities;

import a81.C30772sa;
import a81.C30809v8;
import android.content.Context;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.ui.activities.d0 */
abstract class C35375d0 extends C30772sa {

    /* renamed from: F */
    private boolean f85654F = false;

    /* renamed from: ge.bog.mobilebank.ui.activities.d0$a */
    class C35376a implements C0001b {
        C35376a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C35375d0.this.mo37460R0();
        }
    }

    C35375d0() {
        m105025O0();
    }

    /* renamed from: O0 */
    private void m105025O0() {
        addOnContextAvailableListener(new C35376a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f85654F) {
            this.f85654F = true;
            ((C30809v8) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32377B0((PaymentResultListActivity) C18157e.m62250a(this));
        }
    }
}
