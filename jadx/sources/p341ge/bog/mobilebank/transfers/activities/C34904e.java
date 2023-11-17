package p341ge.bog.mobilebank.transfers.activities;

import android.content.Context;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;
import x61.C39818u;

/* renamed from: ge.bog.mobilebank.transfers.activities.e */
abstract class C34904e extends OwnTransferDetailsActivity {

    /* renamed from: W0 */
    private boolean f84336W0 = false;

    /* renamed from: ge.bog.mobilebank.transfers.activities.e$a */
    class C34905a implements C0001b {
        C34905a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C34904e.this.mo37460R0();
        }
    }

    C34904e() {
        m102705O0();
    }

    /* renamed from: O0 */
    private void m102705O0() {
        addOnContextAvailableListener(new C34905a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f84336W0) {
            this.f84336W0 = true;
            ((C39818u) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32521w1((OwnTemplateDetailsActivity) C18157e.m62250a(this));
        }
    }
}
