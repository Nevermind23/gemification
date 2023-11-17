package p341ge.bog.mobilebank.p975ui.activities;

import a81.C30772sa;
import a81.C30846y6;
import android.content.Context;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.ui.activities.x */
abstract class C35537x extends C30772sa {

    /* renamed from: F */
    private boolean f85875F = false;

    /* renamed from: ge.bog.mobilebank.ui.activities.x$a */
    class C35538a implements C0001b {
        C35538a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C35537x.this.mo37460R0();
        }
    }

    C35537x() {
        m105528O0();
    }

    /* renamed from: O0 */
    private void m105528O0() {
        addOnContextAvailableListener(new C35538a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f85875F) {
            this.f85875F = true;
            ((C30846y6) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32449Z((MapActivity) C18157e.m62250a(this));
        }
    }
}
