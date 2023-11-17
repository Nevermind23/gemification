package p341ge.bog.mobilebank.p975ui.activities;

import a81.C30631i0;
import a81.C30772sa;
import android.content.Context;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.ui.activities.p */
abstract class C35469p extends C30772sa {

    /* renamed from: F */
    private boolean f85764F = false;

    /* renamed from: ge.bog.mobilebank.ui.activities.p$a */
    class C35470a implements C0001b {
        C35470a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C35469p.this.mo37460R0();
        }
    }

    C35469p() {
        m105320O0();
    }

    /* renamed from: O0 */
    private void m105320O0() {
        addOnContextAvailableListener(new C35470a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f85764F) {
            this.f85764F = true;
            ((C30631i0) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32465d1((ContactUsActivity) C18157e.m62250a(this));
        }
    }
}
