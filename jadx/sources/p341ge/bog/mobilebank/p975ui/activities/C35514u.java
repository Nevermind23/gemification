package p341ge.bog.mobilebank.p975ui.activities;

import a81.C30806v5;
import android.content.Context;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;

/* renamed from: ge.bog.mobilebank.ui.activities.u */
abstract class C35514u extends C35388f2 {

    /* renamed from: F */
    private boolean f85832F = false;

    /* renamed from: ge.bog.mobilebank.ui.activities.u$a */
    class C35515a implements C0001b {
        C35515a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C35514u.this.mo37460R0();
        }
    }

    C35514u() {
        m105457O0();
    }

    /* renamed from: O0 */
    private void m105457O0() {
        addOnContextAvailableListener(new C35515a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f85832F) {
            this.f85832F = true;
            ((C30806v5) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32412M1((MainActivity) C18157e.m62250a(this));
        }
    }
}
