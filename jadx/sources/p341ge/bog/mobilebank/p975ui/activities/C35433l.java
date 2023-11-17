package p341ge.bog.mobilebank.p975ui.activities;

import a81.C30546c;
import a81.C30772sa;
import android.content.Context;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.ui.activities.l */
abstract class C35433l extends C30772sa {

    /* renamed from: F */
    private boolean f85716F = false;

    /* renamed from: ge.bog.mobilebank.ui.activities.l$a */
    class C35434a implements C0001b {
        C35434a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C35433l.this.mo37460R0();
        }
    }

    C35433l() {
        m105182O0();
    }

    /* renamed from: O0 */
    private void m105182O0() {
        addOnContextAvailableListener(new C35434a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f85716F) {
            this.f85716F = true;
            ((C30546c) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32463d((AddTemplateActivity) C18157e.m62250a(this));
        }
    }
}
