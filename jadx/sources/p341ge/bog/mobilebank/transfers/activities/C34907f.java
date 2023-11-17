package p341ge.bog.mobilebank.transfers.activities;

import android.content.Context;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;
import x61.C39819v;

/* renamed from: ge.bog.mobilebank.transfers.activities.f */
abstract class C34907f extends C34887c0 {

    /* renamed from: F0 */
    private boolean f84338F0 = false;

    /* renamed from: ge.bog.mobilebank.transfers.activities.f$a */
    class C34908a implements C0001b {
        C34908a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C34907f.this.mo37460R0();
        }
    }

    C34907f() {
        m102712O0();
    }

    /* renamed from: O0 */
    private void m102712O0() {
        addOnContextAvailableListener(new C34908a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f84338F0) {
            this.f84338F0 = true;
            ((C39819v) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32409L1((OwnTransferDetailsActivity) C18157e.m62250a(this));
        }
    }
}
