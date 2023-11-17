package p341ge.bog.mobilebank.p975ui.activities;

import a81.C30772sa;
import a81.C30784t9;
import android.content.Context;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.ui.activities.f0 */
abstract class C35385f0 extends C30772sa {

    /* renamed from: F */
    private boolean f85660F = false;

    /* renamed from: ge.bog.mobilebank.ui.activities.f0$a */
    class C35386a implements C0001b {
        C35386a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C35385f0.this.mo37460R0();
        }
    }

    C35385f0() {
        m105038O0();
    }

    /* renamed from: O0 */
    private void m105038O0() {
        addOnContextAvailableListener(new C35386a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f85660F) {
            this.f85660F = true;
            ((C30784t9) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32418O1((ProductDetailedActivity) C18157e.m62250a(this));
        }
    }
}
