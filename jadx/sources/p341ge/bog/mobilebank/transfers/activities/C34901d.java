package p341ge.bog.mobilebank.transfers.activities;

import android.content.Context;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;
import x61.C39817t;

/* renamed from: ge.bog.mobilebank.transfers.activities.d */
abstract class C34901d extends OwnTransferDetailsActivity {

    /* renamed from: W0 */
    private boolean f84334W0 = false;

    /* renamed from: ge.bog.mobilebank.transfers.activities.d$a */
    class C34902a implements C0001b {
        C34902a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C34901d.this.mo37460R0();
        }
    }

    C34901d() {
        m102699O0();
    }

    /* renamed from: O0 */
    private void m102699O0() {
        addOnContextAvailableListener(new C34902a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f84334W0) {
            this.f84334W0 = true;
            ((C39817t) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32391G((OwnSTODetailsActivity) C18157e.m62250a(this));
        }
    }
}
