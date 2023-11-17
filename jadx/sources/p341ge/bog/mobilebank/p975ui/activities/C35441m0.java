package p341ge.bog.mobilebank.p975ui.activities;

import a81.C30572db;
import a81.C30772sa;
import android.content.Context;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.ui.activities.m0 */
abstract class C35441m0 extends C30772sa {

    /* renamed from: F */
    private boolean f85723F = false;

    /* renamed from: ge.bog.mobilebank.ui.activities.m0$a */
    class C35442a implements C0001b {
        C35442a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C35441m0.this.mo37460R0();
        }
    }

    C35441m0() {
        m105198O0();
    }

    /* renamed from: O0 */
    private void m105198O0() {
        addOnContextAvailableListener(new C35442a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f85723F) {
            this.f85723F = true;
            ((C30572db) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32406K1((SearchResultActivity) C18157e.m62250a(this));
        }
    }
}
