package p341ge.bog.mobilebank.p975ui.activities;

import a81.C30545bc;
import a81.C30772sa;
import android.content.Context;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.ui.activities.q0 */
abstract class C35477q0 extends C30772sa {

    /* renamed from: F */
    private boolean f85770F = false;

    /* renamed from: ge.bog.mobilebank.ui.activities.q0$a */
    class C35478a implements C0001b {
        C35478a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C35477q0.this.mo37460R0();
        }
    }

    C35477q0() {
        m105341O0();
    }

    /* renamed from: O0 */
    private void m105341O0() {
        addOnContextAvailableListener(new C35478a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f85770F) {
            this.f85770F = true;
            ((C30545bc) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32489l1((TransferResultActivity) C18157e.m62250a(this));
        }
    }
}
