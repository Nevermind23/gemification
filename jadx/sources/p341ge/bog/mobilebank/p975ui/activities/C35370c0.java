package p341ge.bog.mobilebank.p975ui.activities;

import a81.C30772sa;
import a81.C30796u8;
import android.content.Context;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.ui.activities.c0 */
abstract class C35370c0 extends C30772sa {

    /* renamed from: F */
    private boolean f85650F = false;

    /* renamed from: ge.bog.mobilebank.ui.activities.c0$a */
    class C35371a implements C0001b {
        C35371a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C35370c0.this.mo37460R0();
        }
    }

    C35370c0() {
        m105019O0();
    }

    /* renamed from: O0 */
    private void m105019O0() {
        addOnContextAvailableListener(new C35371a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f85650F) {
            this.f85650F = true;
            ((C30796u8) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32436U1((PaymentResultActivity) C18157e.m62250a(this));
        }
    }
}
