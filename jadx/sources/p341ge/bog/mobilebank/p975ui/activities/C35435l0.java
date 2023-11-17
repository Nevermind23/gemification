package p341ge.bog.mobilebank.p975ui.activities;

import a81.C30558cb;
import a81.C30772sa;
import android.content.Context;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.ui.activities.l0 */
abstract class C35435l0 extends C30772sa {

    /* renamed from: F */
    private boolean f85718F = false;

    /* renamed from: ge.bog.mobilebank.ui.activities.l0$a */
    class C35436a implements C0001b {
        C35436a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C35435l0.this.mo37460R0();
        }
    }

    C35435l0() {
        m105185O0();
    }

    /* renamed from: O0 */
    private void m105185O0() {
        addOnContextAvailableListener(new C35436a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f85718F) {
            this.f85718F = true;
            ((C30558cb) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32453a1((SearchActivity) C18157e.m62250a(this));
        }
    }
}
