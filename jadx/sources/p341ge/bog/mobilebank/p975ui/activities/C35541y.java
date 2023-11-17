package p341ge.bog.mobilebank.p975ui.activities;

import a81.C30772sa;
import a81.C30859z6;
import android.content.Context;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.ui.activities.y */
abstract class C35541y extends C30772sa {

    /* renamed from: F */
    private boolean f85877F = false;

    /* renamed from: ge.bog.mobilebank.ui.activities.y$a */
    class C35542a implements C0001b {
        C35542a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C35541y.this.mo37460R0();
        }
    }

    C35541y() {
        m105540O0();
    }

    /* renamed from: O0 */
    private void m105540O0() {
        addOnContextAvailableListener(new C35542a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f85877F) {
            this.f85877F = true;
            ((C30859z6) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32390F1((NotificationDetailsActivity) C18157e.m62250a(this));
        }
    }
}
