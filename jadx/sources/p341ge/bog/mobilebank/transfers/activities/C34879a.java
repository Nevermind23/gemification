package p341ge.bog.mobilebank.transfers.activities;

import android.content.Context;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;
import x61.C39800d;

/* renamed from: ge.bog.mobilebank.transfers.activities.a */
abstract class C34879a extends OtherTransferDetailsActivity {

    /* renamed from: o1 */
    private boolean f84262o1 = false;

    /* renamed from: ge.bog.mobilebank.transfers.activities.a$a */
    class C34880a implements C0001b {
        C34880a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C34879a.this.mo37460R0();
        }
    }

    C34879a() {
        m102627O0();
    }

    /* renamed from: O0 */
    private void m102627O0() {
        addOnContextAvailableListener(new C34880a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f84262o1) {
            this.f84262o1 = true;
            ((C39800d) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32474g1((OtherSTODetailsActivity) C18157e.m62250a(this));
        }
    }
}
