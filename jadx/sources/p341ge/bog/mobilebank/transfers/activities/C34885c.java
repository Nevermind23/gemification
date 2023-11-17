package p341ge.bog.mobilebank.transfers.activities;

import android.content.Context;
import p000a.C0001b;
import p627uf.C18155c;
import p627uf.C18157e;
import x61.C39813p;

/* renamed from: ge.bog.mobilebank.transfers.activities.c */
abstract class C34885c extends C34887c0 {

    /* renamed from: F0 */
    private boolean f84266F0 = false;

    /* renamed from: ge.bog.mobilebank.transfers.activities.c$a */
    class C34886a implements C0001b {
        C34886a() {
        }

        /* renamed from: a */
        public void mo6a(Context context) {
            C34885c.this.mo37460R0();
        }
    }

    C34885c() {
        m102636O0();
    }

    /* renamed from: O0 */
    private void m102636O0() {
        addOnContextAvailableListener(new C34886a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo37460R0() {
        if (!this.f84266F0) {
            this.f84266F0 = true;
            ((C39813p) ((C18155c) C18157e.m62250a(this)).generatedComponent()).mo32443X((OtherTransferDetailsActivity) C18157e.m62250a(this));
        }
    }
}
